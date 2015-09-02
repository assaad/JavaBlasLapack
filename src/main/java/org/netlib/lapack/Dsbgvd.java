package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsbgvd
{
  public static void dsbgvd(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, int paramInt12, int[] paramArrayOfInt, int paramInt13, int paramInt14, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    String str = new String(" ");
    intW localintW = new intW(0);
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    bool2 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "U");
    if ((paramInt12 != -1 ? 0 : 1) == 0) {}
    i = (paramInt14 != -1 ? 0 : 1) == 0 ? 0 : 1;
    paramintW.val = 0;
    if ((paramInt1 > 1 ? 0 : 1) != 0)
    {
      n = 1;
      i2 = 1;
    }
    else if (bool2)
    {
      n = 3 + 5 * paramInt1;
      i2 = 1 + 5 * paramInt1 + 2 * (int)Math.pow(paramInt1, 2);
    }
    else
    {
      n = 1;
      i2 = 2 * paramInt1;
    }
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
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble5[(1 - 1 + paramInt11)] = i2;
      paramArrayOfInt[(1 - 1 + paramInt13)] = n;
      if ((paramInt12 >= i2 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -14;
      }
      else
      {
        if ((paramInt14 >= n ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -16;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSBGVD", -paramintW.val);
      return;
    }
    if (i != 0) {
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
    j = 1;
    m = j + paramInt1;
    k = m + paramInt1 * paramInt1;
    i1 = paramInt12 - k + 1;
    Dsbgst.dsbgst(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt9, paramInt10, paramArrayOfDouble5, m - 1 + paramInt11, localintW);
    if (bool2) {
      str = "U";
    } else {
      str = "N";
    }
    Dsbtrd.dsbtrd(str, paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt8, paramArrayOfDouble5, j - 1 + paramInt11, paramArrayOfDouble4, paramInt9, paramInt10, paramArrayOfDouble5, m - 1 + paramInt11, localintW);
    if ((bool2 ^ true))
    {
      Dsterf.dsterf(paramInt1, paramArrayOfDouble3, paramInt8, paramArrayOfDouble5, j - 1 + paramInt11, paramintW);
    }
    else
    {
      Dstedc.dstedc("I", paramInt1, paramArrayOfDouble3, paramInt8, paramArrayOfDouble5, j - 1 + paramInt11, paramArrayOfDouble5, m - 1 + paramInt11, paramInt1, paramArrayOfDouble5, k - 1 + paramInt11, i1, paramArrayOfInt, paramInt13, paramInt14, paramintW);
      Dgemm.dgemm("N", "N", paramInt1, paramInt1, paramInt1, 1.0D, paramArrayOfDouble4, paramInt9, paramInt10, paramArrayOfDouble5, m - 1 + paramInt11, paramInt1, 0.0D, paramArrayOfDouble5, k - 1 + paramInt11, paramInt1);
      Dlacpy.dlacpy("A", paramInt1, paramInt1, paramArrayOfDouble5, k - 1 + paramInt11, paramInt1, paramArrayOfDouble4, paramInt9, paramInt10);
    }
    paramArrayOfDouble5[(1 - 1 + paramInt11)] = i2;
    paramArrayOfInt[(1 - 1 + paramInt13)] = n;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsbgvd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */