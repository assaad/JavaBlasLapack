package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgtsvx
{
  public static void dgtsvx(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, double[] paramArrayOfDouble6, int paramInt8, double[] paramArrayOfDouble7, int paramInt9, int[] paramArrayOfInt1, int paramInt10, double[] paramArrayOfDouble8, int paramInt11, int paramInt12, double[] paramArrayOfDouble9, int paramInt13, int paramInt14, doubleW paramdoubleW, double[] paramArrayOfDouble10, int paramInt15, double[] paramArrayOfDouble11, int paramInt16, double[] paramArrayOfDouble12, int paramInt17, int[] paramArrayOfInt2, int paramInt18, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    String str = new String(" ");
    double d = 0.0D;
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString1, "N");
    bool2 = Lsame.lsame(paramString2, "N");
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "F") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0) {
        paramintW.val = -2;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -3;
      } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -4;
      } else if ((paramInt12 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -14;
      } else if ((paramInt14 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -16;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGTSVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble2, paramInt4, 1, paramArrayOfDouble5, paramInt7, 1);
      if ((paramInt1 <= 1 ? 0 : 1) != 0)
      {
        Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble1, paramInt3, 1, paramArrayOfDouble4, paramInt6, 1);
        Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble3, paramInt5, 1, paramArrayOfDouble6, paramInt8, 1);
      }
      Dgttrf.dgttrf(paramInt1, paramArrayOfDouble4, paramInt6, paramArrayOfDouble5, paramInt7, paramArrayOfDouble6, paramInt8, paramArrayOfDouble7, paramInt9, paramArrayOfInt1, paramInt10, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramdoubleW.val = 0.0D;
        return;
      }
    }
    if (bool2) {
      str = "1";
    } else {
      str = "I";
    }
    d = Dlangt.dlangt(str, paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5);
    Dgtcon.dgtcon(str, paramInt1, paramArrayOfDouble4, paramInt6, paramArrayOfDouble5, paramInt7, paramArrayOfDouble6, paramInt8, paramArrayOfDouble7, paramInt9, paramArrayOfInt1, paramInt10, d, paramdoubleW, paramArrayOfDouble12, paramInt17, paramArrayOfInt2, paramInt18, paramintW);
    Dlacpy.dlacpy("Full", paramInt1, paramInt2, paramArrayOfDouble8, paramInt11, paramInt12, paramArrayOfDouble9, paramInt13, paramInt14);
    Dgttrs.dgttrs(paramString2, paramInt1, paramInt2, paramArrayOfDouble4, paramInt6, paramArrayOfDouble5, paramInt7, paramArrayOfDouble6, paramInt8, paramArrayOfDouble7, paramInt9, paramArrayOfInt1, paramInt10, paramArrayOfDouble9, paramInt13, paramInt14, paramintW);
    Dgtrfs.dgtrfs(paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramArrayOfDouble5, paramInt7, paramArrayOfDouble6, paramInt8, paramArrayOfDouble7, paramInt9, paramArrayOfInt1, paramInt10, paramArrayOfDouble8, paramInt11, paramInt12, paramArrayOfDouble9, paramInt13, paramInt14, paramArrayOfDouble10, paramInt15, paramArrayOfDouble11, paramInt16, paramArrayOfDouble12, paramInt17, paramArrayOfInt2, paramInt18, paramintW);
    if ((paramdoubleW.val >= Dlamch.dlamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgtsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */