package org.netlib.lapack;

import org.netlib.blas.Sgemm;
import org.netlib.blas.Strsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgetrf
{
  public static void sgetrf(int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, intW paramintW)
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
      Xerbla.xerbla("SGETRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    m = Ilaenv.ilaenv(1, "SGETRF", " ", paramInt1, paramInt2, -1, -1);
    if ((m > 1 ? 0 : 1) == 0) {}
    if (((m < Math.min(paramInt1, paramInt2) ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Sgetf2.sgetf2(paramInt1, paramInt2, paramArrayOfFloat, paramInt3, paramInt4, paramArrayOfInt, paramInt5, paramintW);
    }
    else
    {
      j = 1;
      for (int n = (Math.min(paramInt1, paramInt2) - 1 + m) / m; n > 0; n--)
      {
        k = Math.min(Math.min(paramInt1, paramInt2) - j + 1, m);
        Sgetf2.sgetf2(paramInt1 - j + 1, k, paramArrayOfFloat, j - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfInt, j - 1 + paramInt5, localintW);
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
        Slaswp.slaswp(j - 1, paramArrayOfFloat, paramInt3, paramInt4, j, j + k - 1, paramArrayOfInt, paramInt5, 1);
        if ((j + k > paramInt2 ? 0 : 1) != 0)
        {
          Slaswp.slaswp(paramInt2 - j - k + 1, paramArrayOfFloat, 1 - 1 + (j + k - 1) * paramInt4 + paramInt3, paramInt4, j, j + k - 1, paramArrayOfInt, paramInt5, 1);
          Strsm.strsm("Left", "Lower", "No transpose", "Unit", k, paramInt2 - j - k + 1, 1.0F, paramArrayOfFloat, j - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat, j - 1 + (j + k - 1) * paramInt4 + paramInt3, paramInt4);
          if ((j + k > paramInt1 ? 0 : 1) != 0) {
            Sgemm.sgemm("No transpose", "No transpose", paramInt1 - j - k + 1, paramInt2 - j - k + 1, k, -1.0F, paramArrayOfFloat, j + k - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat, j - 1 + (j + k - 1) * paramInt4 + paramInt3, paramInt4, 1.0F, paramArrayOfFloat, j + k - 1 + (j + k - 1) * paramInt4 + paramInt3, paramInt4);
          }
        }
        j += m;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgetrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */