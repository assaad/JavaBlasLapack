package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dsysvx
{
  public static void dsysvx(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, int[] paramArrayOfInt1, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, doubleW paramdoubleW, double[] paramArrayOfDouble5, int paramInt12, double[] paramArrayOfDouble6, int paramInt13, double[] paramArrayOfDouble7, int paramInt14, int paramInt15, int[] paramArrayOfInt2, int paramInt16, intW paramintW)
  {
    int i = 0;
    boolean bool = false;
    int j = 0;
    int k = 0;
    double d = 0.0D;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString1, "N");
    i = paramInt15 != -1 ? 0 : 1;
    if ((((bool ^ true)) && ((Lsame.lsame(paramString1, "F") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((Lsame.lsame(paramString2, "U") ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -6;
    }
    else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -8;
    }
    else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -11;
    }
    else if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -13;
    }
    else
    {
      if ((paramInt15 >= Math.max(1, 3 * paramInt1) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -18;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      j = Math.max(1, 3 * paramInt1);
      if (bool)
      {
        k = Ilaenv.ilaenv(1, "DSYTRF", paramString2, paramInt1, -1, -1, -1);
        j = Math.max(j, paramInt1 * k);
      }
      paramArrayOfDouble7[(1 - 1 + paramInt14)] = j;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYSVX", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if (bool)
    {
      Dlacpy.dlacpy(paramString2, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6);
      Dsytrf.dsytrf(paramString2, paramInt1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfDouble7, paramInt14, paramInt15, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramdoubleW.val = 0.0D;
        return;
      }
    }
    d = Dlansy.dlansy("I", paramString2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble7, paramInt14);
    Dsycon.dsycon(paramString2, paramInt1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, d, paramdoubleW, paramArrayOfDouble7, paramInt14, paramArrayOfInt2, paramInt16, paramintW);
    Dlacpy.dlacpy("Full", paramInt1, paramInt2, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11);
    Dsytrs.dsytrs(paramString2, paramInt1, paramInt2, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfDouble4, paramInt10, paramInt11, paramintW);
    Dsyrfs.dsyrfs(paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble5, paramInt12, paramArrayOfDouble6, paramInt13, paramArrayOfDouble7, paramInt14, paramArrayOfInt2, paramInt16, paramintW);
    if ((paramdoubleW.val >= Dlamch.dlamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
    paramArrayOfDouble7[(1 - 1 + paramInt14)] = j;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsysvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */