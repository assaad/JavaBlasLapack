package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsbev
{
  public static void dsbev(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    intW localintW = new intW(0);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    bool2 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "L");
    paramintW.val = 0;
    if ((((!bool2) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((!bool1) && (!Lsame.lsame(paramString2, "U")) ? 0 : 1) ^ 0x1) != 0)
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
    else if ((paramInt4 >= paramInt2 + 1 ? 0 : 1) != 0)
    {
      paramintW.val = -6;
    }
    else
    {
      if ((paramInt7 >= 1 ? 0 : 1) == 0) {
        if (!bool2) {}
      }
      if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -9;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSBEV ", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if (bool1) {
        paramArrayOfDouble2[(1 - 1 + paramInt5)] = paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
      } else {
        paramArrayOfDouble2[(1 - 1 + paramInt5)] = paramArrayOfDouble1[(paramInt2 + 1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
      }
      if (bool2) {
        paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = 1.0D;
      }
      return;
    }
    d6 = Dlamch.dlamch("Safe minimum");
    d3 = Dlamch.dlamch("Precision");
    d8 = d6 / d3;
    d2 = 1.0D / d8;
    d5 = Math.sqrt(d8);
    d4 = Math.sqrt(d2);
    d1 = Dlansb.dlansb("M", paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8);
    m = 0;
    if ((d1 <= 0.0D ? 0 : 1) != 0) {}
    if (((d1 >= d5 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      m = 1;
      d7 = d5 / d1;
    }
    else if ((d1 <= d4 ? 0 : 1) != 0)
    {
      m = 1;
      d7 = d4 / d1;
    }
    if ((m != 1 ? 0 : 1) != 0) {
      if (bool1) {
        Dlascl.dlascl("B", paramInt2, paramInt2, 1.0D, d7, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramintW);
      } else {
        Dlascl.dlascl("Q", paramInt2, paramInt2, 1.0D, d7, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramintW);
      }
    }
    j = 1;
    k = j + paramInt1;
    Dsbtrd.dsbtrd(paramString1, paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble4, j - 1 + paramInt8, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, k - 1 + paramInt8, localintW);
    if ((bool2 ^ true)) {
      Dsterf.dsterf(paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble4, j - 1 + paramInt8, paramintW);
    } else {
      Dsteqr.dsteqr(paramString1, paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble4, j - 1 + paramInt8, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, k - 1 + paramInt8, paramintW);
    }
    if ((m != 1 ? 0 : 1) != 0)
    {
      if ((paramintW.val != 0 ? 0 : 1) != 0) {
        i = paramInt1;
      } else {
        i = paramintW.val - 1;
      }
      Dscal.dscal(i, 1.0D / d7, paramArrayOfDouble2, paramInt5, 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsbev.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */