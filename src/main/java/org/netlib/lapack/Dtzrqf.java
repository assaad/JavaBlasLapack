package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dger;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtzrqf
{
  public static void dtzrqf(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, intW paramintW)
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
      Xerbla.xerbla("DTZRQF", -paramintW.val);
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
        paramArrayOfDouble2[(i - 1 + paramInt5)] = 0.0D;
        i += 1;
      }
    }
    else
    {
      k = Math.min(paramInt1 + 1, paramInt2);
      j = paramInt1;
      for (m = (1 - paramInt1 + -1) / -1; m > 0; m--)
      {
        dlarfg_adapter(paramInt2 - paramInt1 + 1, paramArrayOfDouble1, j - 1 + (j - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, j - 1 + (k - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, j - 1 + paramInt5);
        if ((paramArrayOfDouble2[(j - 1 + paramInt5)] == 0.0D ? 0 : 1) != 0) {}
        if (((j <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          Dcopy.dcopy(j - 1, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, paramInt5, 1);
          Dgemv.dgemv("No transpose", j - 1, paramInt2 - paramInt1, 1.0D, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, j - 1 + (k - 1) * paramInt4 + paramInt3, paramInt4, 1.0D, paramArrayOfDouble2, paramInt5, 1);
          Daxpy.daxpy(j - 1, -paramArrayOfDouble2[(j - 1 + paramInt5)], paramArrayOfDouble2, paramInt5, 1, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1);
          Dger.dger(j - 1, paramInt2 - paramInt1, -paramArrayOfDouble2[(j - 1 + paramInt5)], paramArrayOfDouble2, paramInt5, 1, paramArrayOfDouble1, j - 1 + (k - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt4 + paramInt3, paramInt4);
        }
        j += -1;
      }
    }
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double[] paramArrayOfDouble3, int paramInt5)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt2]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble3[paramInt5]);
    Dlarfg.dlarfg(paramInt1, localdoubleW1, paramArrayOfDouble2, paramInt3, paramInt4, localdoubleW2);
    paramArrayOfDouble1[paramInt2] = localdoubleW1.val;
    paramArrayOfDouble3[paramInt5] = localdoubleW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtzrqf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */