package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dsymv;
import org.netlib.blas.Dsyr2;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dsytd2
{
  public static void dsytd2(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    double d = 0.0D;
    doubleW localdoubleW = new doubleW(0.0D);
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYTD2", -paramintW.val);
      return;
    }
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    int j;
    if (bool)
    {
      i = paramInt1 - 1;
      for (j = (1 - (paramInt1 - 1) + -1) / -1; j > 0; j--)
      {
        dlarfg_adapter(i, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1, localdoubleW);
        paramArrayOfDouble3[(i - 1 + paramInt5)] = paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)];
        if ((localdoubleW.val == 0.0D ? 0 : 1) != 0)
        {
          paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = 1.0D;
          Dsymv.dsymv(paramString, i, localdoubleW.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1, 0.0D, paramArrayOfDouble4, paramInt6, 1);
          d = -(0.5D * localdoubleW.val * Ddot.ddot(i, paramArrayOfDouble4, paramInt6, 1, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1));
          Daxpy.daxpy(i, d, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble4, paramInt6, 1);
          Dsyr2.dsyr2(paramString, i, -1.0D, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble4, paramInt6, 1, paramArrayOfDouble1, paramInt2, paramInt3);
          paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble3[(i - 1 + paramInt5)];
        }
        paramArrayOfDouble2[(i + 1 - 1 + paramInt4)] = paramArrayOfDouble1[(i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2)];
        paramArrayOfDouble4[(i - 1 + paramInt6)] = localdoubleW.val;
        i += -1;
      }
      paramArrayOfDouble2[(1 - 1 + paramInt4)] = paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)];
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
      {
        dlarfg_adapter(paramInt1 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramArrayOfDouble1, Math.min(i + 2, paramInt1) - 1 + (i - 1) * paramInt3 + paramInt2, 1, localdoubleW);
        paramArrayOfDouble3[(i - 1 + paramInt5)] = paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)];
        if ((localdoubleW.val == 0.0D ? 0 : 1) != 0)
        {
          paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)] = 1.0D;
          Dsymv.dsymv(paramString, paramInt1 - i, localdoubleW.val, paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, 0.0D, paramArrayOfDouble4, i - 1 + paramInt6, 1);
          d = -(0.5D * localdoubleW.val * Ddot.ddot(paramInt1 - i, paramArrayOfDouble4, i - 1 + paramInt6, 1, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1));
          Daxpy.daxpy(paramInt1 - i, d, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble4, i - 1 + paramInt6, 1);
          Dsyr2.dsyr2(paramString, paramInt1 - i, -1.0D, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble4, i - 1 + paramInt6, 1, paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3);
          paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble3[(i - 1 + paramInt5)];
        }
        paramArrayOfDouble2[(i - 1 + paramInt4)] = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
        paramArrayOfDouble4[(i - 1 + paramInt6)] = localdoubleW.val;
        i += 1;
      }
      paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] = paramArrayOfDouble1[(paramInt1 - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)];
    }
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, doubleW paramdoubleW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble1[paramInt2]);
    Dlarfg.dlarfg(paramInt1, localdoubleW, paramArrayOfDouble2, paramInt3, paramInt4, paramdoubleW);
    paramArrayOfDouble1[paramInt2] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsytd2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */