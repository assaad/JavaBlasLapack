package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsbgv
{
  public static void dsbgv(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    String str = new String(" ");
    intW localintW = new intW(0);
    int i = 0;
    int j = 0;
    bool2 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "U");
    paramintW.val = 0;
    if ((((!bool2) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((!bool1) && (!Lsame.lsame(paramString2, "L")) ? 0 : 1) ^ 0x1) != 0)
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
    else
    {
      if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
      }
      else if ((paramInt5 >= paramInt2 + 1 ? 0 : 1) != 0)
      {
        paramintW.val = -7;
      }
      else if ((paramInt7 >= paramInt3 + 1 ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else
      {
        if ((paramInt10 >= 1 ? 0 : 1) == 0) {
          if (!bool2) {}
        }
        if ((((paramInt10 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -12;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSBGV ", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    Dpbstf.dpbstf(paramString2, paramInt1, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      paramintW.val = (paramInt1 + paramintW.val);
      return;
    }
    i = 1;
    j = i + paramInt1;
    Dsbgst.dsbgst(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt9, paramInt10, paramArrayOfDouble5, j - 1 + paramInt11, localintW);
    if (bool2) {
      str = "U";
    } else {
      str = "N";
    }
    Dsbtrd.dsbtrd(str, paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt8, paramArrayOfDouble5, i - 1 + paramInt11, paramArrayOfDouble4, paramInt9, paramInt10, paramArrayOfDouble5, j - 1 + paramInt11, localintW);
    if ((bool2 ^ true)) {
      Dsterf.dsterf(paramInt1, paramArrayOfDouble3, paramInt8, paramArrayOfDouble5, i - 1 + paramInt11, paramintW);
    } else {
      Dsteqr.dsteqr(paramString1, paramInt1, paramArrayOfDouble3, paramInt8, paramArrayOfDouble5, i - 1 + paramInt11, paramArrayOfDouble4, paramInt9, paramInt10, paramArrayOfDouble5, j - 1 + paramInt11, paramintW);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsbgv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */