package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dspmv;
import org.netlib.blas.Dspr2;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dsptrd
{
  public static void dsptrd(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, double[] paramArrayOfDouble4, int paramInt5, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double d = 0.0D;
    doubleW localdoubleW = new doubleW(0.0D);
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPTRD", -paramintW.val);
      return;
    }
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    int n;
    if (bool)
    {
      j = paramInt1 * (paramInt1 - 1) / 2 + 1;
      i = paramInt1 - 1;
      for (n = (1 - (paramInt1 - 1) + -1) / -1; n > 0; n--)
      {
        dlarfg_adapter(i, paramArrayOfDouble1, j + i - 1 - 1 + paramInt2, paramArrayOfDouble1, j - 1 + paramInt2, 1, localdoubleW);
        paramArrayOfDouble3[(i - 1 + paramInt4)] = paramArrayOfDouble1[(j + i - 1 - 1 + paramInt2)];
        if ((localdoubleW.val == 0.0D ? 0 : 1) != 0)
        {
          paramArrayOfDouble1[(j + i - 1 - 1 + paramInt2)] = 1.0D;
          Dspmv.dspmv(paramString, i, localdoubleW.val, paramArrayOfDouble1, paramInt2, paramArrayOfDouble1, j - 1 + paramInt2, 1, 0.0D, paramArrayOfDouble4, paramInt5, 1);
          d = -(0.5D * localdoubleW.val * Ddot.ddot(i, paramArrayOfDouble4, paramInt5, 1, paramArrayOfDouble1, j - 1 + paramInt2, 1));
          Daxpy.daxpy(i, d, paramArrayOfDouble1, j - 1 + paramInt2, 1, paramArrayOfDouble4, paramInt5, 1);
          Dspr2.dspr2(paramString, i, -1.0D, paramArrayOfDouble1, j - 1 + paramInt2, 1, paramArrayOfDouble4, paramInt5, 1, paramArrayOfDouble1, paramInt2);
          paramArrayOfDouble1[(j + i - 1 - 1 + paramInt2)] = paramArrayOfDouble3[(i - 1 + paramInt4)];
        }
        paramArrayOfDouble2[(i + 1 - 1 + paramInt3)] = paramArrayOfDouble1[(j + i - 1 + paramInt2)];
        paramArrayOfDouble4[(i - 1 + paramInt5)] = localdoubleW.val;
        j -= i;
        i += -1;
      }
      paramArrayOfDouble2[(1 - 1 + paramInt3)] = paramArrayOfDouble1[(1 - 1 + paramInt2)];
    }
    else
    {
      m = 1;
      i = 1;
      for (n = paramInt1 - 1 - 1 + 1; n > 0; n--)
      {
        k = m + paramInt1 - i + 1;
        dlarfg_adapter(paramInt1 - i, paramArrayOfDouble1, m + 1 - 1 + paramInt2, paramArrayOfDouble1, m + 2 - 1 + paramInt2, 1, localdoubleW);
        paramArrayOfDouble3[(i - 1 + paramInt4)] = paramArrayOfDouble1[(m + 1 - 1 + paramInt2)];
        if ((localdoubleW.val == 0.0D ? 0 : 1) != 0)
        {
          paramArrayOfDouble1[(m + 1 - 1 + paramInt2)] = 1.0D;
          Dspmv.dspmv(paramString, paramInt1 - i, localdoubleW.val, paramArrayOfDouble1, k - 1 + paramInt2, paramArrayOfDouble1, m + 1 - 1 + paramInt2, 1, 0.0D, paramArrayOfDouble4, i - 1 + paramInt5, 1);
          d = -(0.5D * localdoubleW.val * Ddot.ddot(paramInt1 - i, paramArrayOfDouble4, i - 1 + paramInt5, 1, paramArrayOfDouble1, m + 1 - 1 + paramInt2, 1));
          Daxpy.daxpy(paramInt1 - i, d, paramArrayOfDouble1, m + 1 - 1 + paramInt2, 1, paramArrayOfDouble4, i - 1 + paramInt5, 1);
          Dspr2.dspr2(paramString, paramInt1 - i, -1.0D, paramArrayOfDouble1, m + 1 - 1 + paramInt2, 1, paramArrayOfDouble4, i - 1 + paramInt5, 1, paramArrayOfDouble1, k - 1 + paramInt2);
          paramArrayOfDouble1[(m + 1 - 1 + paramInt2)] = paramArrayOfDouble3[(i - 1 + paramInt4)];
        }
        paramArrayOfDouble2[(i - 1 + paramInt3)] = paramArrayOfDouble1[(m - 1 + paramInt2)];
        paramArrayOfDouble4[(i - 1 + paramInt5)] = localdoubleW.val;
        m = k;
        i += 1;
      }
      paramArrayOfDouble2[(paramInt1 - 1 + paramInt3)] = paramArrayOfDouble1[(m - 1 + paramInt2)];
    }
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, doubleW paramdoubleW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble1[paramInt2]);
    Dlarfg.dlarfg(paramInt1, localdoubleW, paramArrayOfDouble2, paramInt3, paramInt4, paramdoubleW);
    paramArrayOfDouble1[paramInt2] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsptrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */