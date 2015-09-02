package org.netlib.lapack;

import org.netlib.blas.Dger;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dgbtf2
{
  public static void dgbtf2(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble, int paramInt5, int paramInt6, int[] paramArrayOfInt, int paramInt7, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    i1 = paramInt4 + paramInt3;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt6 >= paramInt3 + i1 + 1 ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGBTF2", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    j = paramInt4 + 2;
    int i3;
    for (int i2 = Math.min(i1, paramInt2) - (paramInt4 + 2) + 1; i2 > 0; i2--)
    {
      i = i1 - j + 2;
      for (i3 = paramInt3 - (i1 - j + 2) + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble[(i - 1 + (j - 1) * paramInt6 + paramInt5)] = 0.0D;
        i += 1;
      }
      j += 1;
    }
    m = 1;
    j = 1;
    for (i2 = Math.min(paramInt1, paramInt2) - 1 + 1; i2 > 0; i2--)
    {
      if ((j + i1 > paramInt2 ? 0 : 1) != 0)
      {
        i = 1;
        for (i3 = paramInt3 - 1 + 1; i3 > 0; i3--)
        {
          paramArrayOfDouble[(i - 1 + (j + i1 - 1) * paramInt6 + paramInt5)] = 0.0D;
          i += 1;
        }
      }
      n = Math.min(paramInt3, paramInt1 - j);
      k = Idamax.idamax(n + 1, paramArrayOfDouble, i1 + 1 - 1 + (j - 1) * paramInt6 + paramInt5, 1);
      paramArrayOfInt[(j - 1 + paramInt7)] = (k + j - 1);
      if ((paramArrayOfDouble[(i1 + k - 1 + (j - 1) * paramInt6 + paramInt5)] == 0.0D ? 0 : 1) != 0)
      {
        m = Math.max(m, Math.min(j + paramInt4 + k - 1, paramInt2));
        if ((k == 1 ? 0 : 1) != 0) {
          Dswap.dswap(m - j + 1, paramArrayOfDouble, i1 + k - 1 + (j - 1) * paramInt6 + paramInt5, paramInt6 - 1, paramArrayOfDouble, i1 + 1 - 1 + (j - 1) * paramInt6 + paramInt5, paramInt6 - 1);
        }
        if ((n <= 0 ? 0 : 1) != 0)
        {
          Dscal.dscal(n, 1.0D / paramArrayOfDouble[(i1 + 1 - 1 + (j - 1) * paramInt6 + paramInt5)], paramArrayOfDouble, i1 + 2 - 1 + (j - 1) * paramInt6 + paramInt5, 1);
          if ((m <= j ? 0 : 1) != 0) {
            Dger.dger(n, m - j, -1.0D, paramArrayOfDouble, i1 + 2 - 1 + (j - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble, i1 - 1 + (j + 1 - 1) * paramInt6 + paramInt5, paramInt6 - 1, paramArrayOfDouble, i1 + 1 - 1 + (j + 1 - 1) * paramInt6 + paramInt5, paramInt6 - 1);
          }
        }
      }
      else if ((paramintW.val != 0 ? 0 : 1) != 0)
      {
        paramintW.val = j;
      }
      j += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgbtf2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */