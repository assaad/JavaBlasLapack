package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dptsvx
{
  public static void dptsvx(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, int paramInt8, double[] paramArrayOfDouble6, int paramInt9, int paramInt10, doubleW paramdoubleW, double[] paramArrayOfDouble7, int paramInt11, double[] paramArrayOfDouble8, int paramInt12, double[] paramArrayOfDouble9, int paramInt13, intW paramintW)
  {
    boolean bool = false;
    double d = 0.0D;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "N");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "F") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -9;
    } else if ((paramInt10 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -11;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPTSVX", -paramintW.val);
      return;
    }
    if (bool)
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt3, 1, paramArrayOfDouble3, paramInt5, 1);
      if ((paramInt1 <= 1 ? 0 : 1) != 0) {
        Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble2, paramInt4, 1, paramArrayOfDouble4, paramInt6, 1);
      }
      Dpttrf.dpttrf(paramInt1, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramdoubleW.val = 0.0D;
        return;
      }
    }
    d = Dlanst.dlanst("1", paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4);
    Dptcon.dptcon(paramInt1, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, d, paramdoubleW, paramArrayOfDouble9, paramInt13, paramintW);
    Dlacpy.dlacpy("Full", paramInt1, paramInt2, paramArrayOfDouble5, paramInt7, paramInt8, paramArrayOfDouble6, paramInt9, paramInt10);
    Dpttrs.dpttrs(paramInt1, paramInt2, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramArrayOfDouble6, paramInt9, paramInt10, paramintW);
    Dptrfs.dptrfs(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramArrayOfDouble5, paramInt7, paramInt8, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramArrayOfDouble8, paramInt12, paramArrayOfDouble9, paramInt13, paramintW);
    if ((paramdoubleW.val >= Dlamch.dlamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dptsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */