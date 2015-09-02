package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.blas.Dtrsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dgetrf
{
  public static void dgetrf(int paramInt1, int paramInt2, double[] paramArrayOfDouble, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, intW paramintW)
  {
    int i = 0;
    intW localintW = new intW(0);
    int j = 0;
    int k = 0;
    int m = 0;
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
      Xerbla.xerbla("DGETRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    m = Ilaenv.ilaenv(1, "DGETRF", " ", paramInt1, paramInt2, -1, -1);
    if ((m > 1 ? 0 : 1) == 0) {}
    if (((m < Math.min(paramInt1, paramInt2) ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Dgetf2.dgetf2(paramInt1, paramInt2, paramArrayOfDouble, paramInt3, paramInt4, paramArrayOfInt, paramInt5, paramintW);
    }
    else
    {
      j = 1;
      for (int n = (Math.min(paramInt1, paramInt2) - 1 + m) / m; n > 0; n--)
      {
        k = Math.min(Math.min(paramInt1, paramInt2) - j + 1, m);
        Dgetf2.dgetf2(paramInt1 - j + 1, k, paramArrayOfDouble, j - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfInt, j - 1 + paramInt5, localintW);
        if ((paramintW.val != 0 ? 0 : 1) != 0) {}
        if (((localintW.val <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW.val = (localintW.val + j - 1);
        }
        i = j;
        for (int i1 = Math.min(paramInt1, j + k - 1) - j + 1; i1 > 0; i1--)
        {
          paramArrayOfInt[(i - 1 + paramInt5)] = (j - 1 + paramArrayOfInt[(i - 1 + paramInt5)]);
          i += 1;
        }
        Dlaswp.dlaswp(j - 1, paramArrayOfDouble, paramInt3, paramInt4, j, j + k - 1, paramArrayOfInt, paramInt5, 1);
        if ((j + k > paramInt2 ? 0 : 1) != 0)
        {
          Dlaswp.dlaswp(paramInt2 - j - k + 1, paramArrayOfDouble, 1 - 1 + (j + k - 1) * paramInt4 + paramInt3, paramInt4, j, j + k - 1, paramArrayOfInt, paramInt5, 1);
          Dtrsm.dtrsm("Left", "Lower", "No transpose", "Unit", k, paramInt2 - j - k + 1, 1.0D, paramArrayOfDouble, j - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble, j - 1 + (j + k - 1) * paramInt4 + paramInt3, paramInt4);
          if ((j + k > paramInt1 ? 0 : 1) != 0) {
            Dgemm.dgemm("No transpose", "No transpose", paramInt1 - j - k + 1, paramInt2 - j - k + 1, k, -1.0D, paramArrayOfDouble, j + k - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble, j - 1 + (j + k - 1) * paramInt4 + paramInt3, paramInt4, 1.0D, paramArrayOfDouble, j + k - 1 + (j + k - 1) * paramInt4 + paramInt3, paramInt4);
          }
        }
        j += m;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgetrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */