package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dspsvx
{
  public static void dspsvx(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int[] paramArrayOfInt1, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, doubleW paramdoubleW, double[] paramArrayOfDouble5, int paramInt10, double[] paramArrayOfDouble6, int paramInt11, double[] paramArrayOfDouble7, int paramInt12, int[] paramArrayOfInt2, int paramInt13, intW paramintW)
  {
    boolean bool = false;
    double d = 0.0D;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString1, "N");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString1, "F") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((((Lsame.lsame(paramString2, "U") ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -9;
    } else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -11;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPSVX", -paramintW.val);
      return;
    }
    if (bool)
    {
      Dcopy.dcopy(paramInt1 * (paramInt1 + 1) / 2, paramArrayOfDouble1, paramInt3, 1, paramArrayOfDouble2, paramInt4, 1);
      Dsptrf.dsptrf(paramString2, paramInt1, paramArrayOfDouble2, paramInt4, paramArrayOfInt1, paramInt5, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramdoubleW.val = 0.0D;
        return;
      }
    }
    d = Dlansp.dlansp("I", paramString2, paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble7, paramInt12);
    Dspcon.dspcon(paramString2, paramInt1, paramArrayOfDouble2, paramInt4, paramArrayOfInt1, paramInt5, d, paramdoubleW, paramArrayOfDouble7, paramInt12, paramArrayOfInt2, paramInt13, paramintW);
    Dlacpy.dlacpy("Full", paramInt1, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9);
    Dsptrs.dsptrs(paramString2, paramInt1, paramInt2, paramArrayOfDouble2, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfDouble4, paramInt8, paramInt9, paramintW);
    Dsprfs.dsprfs(paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, paramInt10, paramArrayOfDouble6, paramInt11, paramArrayOfDouble7, paramInt12, paramArrayOfInt2, paramInt13, paramintW);
    if ((paramdoubleW.val >= Dlamch.dlamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dspsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */