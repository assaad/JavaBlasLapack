package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sger;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Stzrqf
{
  public static void stzrqf(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= paramInt1 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STZRQF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int m;
    if ((paramInt1 != paramInt2 ? 0 : 1) != 0)
    {
      i = 1;
      for (m = paramInt2 - 1 + 1; m > 0; m--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt5)] = 0.0F;
        i += 1;
      }
    }
    else
    {
      k = Math.min(paramInt1 + 1, paramInt2);
      j = paramInt1;
      for (m = (1 - paramInt1 + -1) / -1; m > 0; m--)
      {
        slarfg_adapter(paramInt2 - paramInt1 + 1, paramArrayOfFloat1, j - 1 + (j - 1) * paramInt4 + paramInt3, paramArrayOfFloat1, j - 1 + (k - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, j - 1 + paramInt5);
        if ((paramArrayOfFloat2[(j - 1 + paramInt5)] == 0.0F ? 0 : 1) != 0) {}
        if (((j <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          Scopy.scopy(j - 1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, paramInt5, 1);
          Sgemv.sgemv("No transpose", j - 1, paramInt2 - paramInt1, 1.0F, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, j - 1 + (k - 1) * paramInt4 + paramInt3, paramInt4, 1.0F, paramArrayOfFloat2, paramInt5, 1);
          Saxpy.saxpy(j - 1, -paramArrayOfFloat2[(j - 1 + paramInt5)], paramArrayOfFloat2, paramInt5, 1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1);
          Sger.sger(j - 1, paramInt2 - paramInt1, -paramArrayOfFloat2[(j - 1 + paramInt5)], paramArrayOfFloat2, paramInt5, 1, paramArrayOfFloat1, j - 1 + (k - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt4 + paramInt3, paramInt4);
        }
        j += -1;
      }
    }
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float[] paramArrayOfFloat3, int paramInt5)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt2]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat3[paramInt5]);
    Slarfg.slarfg(paramInt1, localfloatW1, paramArrayOfFloat2, paramInt3, paramInt4, localfloatW2);
    paramArrayOfFloat1[paramInt2] = localfloatW1.val;
    paramArrayOfFloat3[paramInt5] = localfloatW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stzrqf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */