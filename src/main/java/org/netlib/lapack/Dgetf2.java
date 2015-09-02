package org.netlib.lapack;

import org.netlib.blas.Dger;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dgetf2
{
  public static void dgetf2(int paramInt1, int paramInt2, double[] paramArrayOfDouble, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, intW paramintW)
  {
    double d = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGETF2", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    d = Dlamch.dlamch("S");
    j = 1;
    for (int m = Math.min(paramInt1, paramInt2) - 1 + 1; m > 0; m--)
    {
      k = j - 1 + Idamax.idamax(paramInt1 - j + 1, paramArrayOfDouble, j - 1 + (j - 1) * paramInt4 + paramInt3, 1);
      paramArrayOfInt[(j - 1 + paramInt5)] = k;
      if ((paramArrayOfDouble[(k - 1 + (j - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
      {
        if ((k == j ? 0 : 1) != 0) {
          Dswap.dswap(paramInt2, paramArrayOfDouble, j - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble, k - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        }
        if ((j >= paramInt1 ? 0 : 1) != 0) {
          if ((Math.abs(paramArrayOfDouble[(j - 1 + (j - 1) * paramInt4 + paramInt3)]) < d ? 0 : 1) != 0)
          {
            Dscal.dscal(paramInt1 - j, 1.0D / paramArrayOfDouble[(j - 1 + (j - 1) * paramInt4 + paramInt3)], paramArrayOfDouble, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1);
          }
          else
          {
            i = 1;
            for (int n = paramInt1 - j - 1 + 1; n > 0; n--)
            {
              paramArrayOfDouble[(j + i - 1 + (j - 1) * paramInt4 + paramInt3)] /= paramArrayOfDouble[(j - 1 + (j - 1) * paramInt4 + paramInt3)];
              i += 1;
            }
          }
        }
      }
      else if ((paramintW.val != 0 ? 0 : 1) != 0)
      {
        paramintW.val = j;
      }
      if ((j >= Math.min(paramInt1, paramInt2) ? 0 : 1) != 0) {
        Dger.dger(paramInt1 - j, paramInt2 - j, -1.0D, paramArrayOfDouble, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble, j - 1 + (j + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble, j + 1 - 1 + (j + 1 - 1) * paramInt4 + paramInt3, paramInt4);
      }
      j += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgetf2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */