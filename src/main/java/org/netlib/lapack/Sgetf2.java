package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sger;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgetf2
{
  public static void sgetf2(int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, intW paramintW)
  {
    float f = 0.0F;
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
      Xerbla.xerbla("SGETF2", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    f = Slamch.slamch("S");
    j = 1;
    for (int m = Math.min(paramInt1, paramInt2) - 1 + 1; m > 0; m--)
    {
      k = j - 1 + Isamax.isamax(paramInt1 - j + 1, paramArrayOfFloat, j - 1 + (j - 1) * paramInt4 + paramInt3, 1);
      paramArrayOfInt[(j - 1 + paramInt5)] = k;
      if ((paramArrayOfFloat[(k - 1 + (j - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
      {
        if ((k == j ? 0 : 1) != 0) {
          Sswap.sswap(paramInt2, paramArrayOfFloat, j - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat, k - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        }
        if ((j >= paramInt1 ? 0 : 1) != 0) {
          if ((Math.abs(paramArrayOfFloat[(j - 1 + (j - 1) * paramInt4 + paramInt3)]) < f ? 0 : 1) != 0)
          {
            Sscal.sscal(paramInt1 - j, 1.0F / paramArrayOfFloat[(j - 1 + (j - 1) * paramInt4 + paramInt3)], paramArrayOfFloat, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1);
          }
          else
          {
            i = 1;
            for (int n = paramInt1 - j - 1 + 1; n > 0; n--)
            {
              paramArrayOfFloat[(j + i - 1 + (j - 1) * paramInt4 + paramInt3)] /= paramArrayOfFloat[(j - 1 + (j - 1) * paramInt4 + paramInt3)];
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
        Sger.sger(paramInt1 - j, paramInt2 - j, -1.0F, paramArrayOfFloat, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat, j - 1 + (j + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat, j + 1 - 1 + (j + 1 - 1) * paramInt4 + paramInt3, paramInt4);
      }
      j += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgetf2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */