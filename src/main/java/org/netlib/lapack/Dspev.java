package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dspev
{
  public static void dspev(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    intW localintW = new intW(0);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    bool = Lsame.lsame(paramString1, "V");
    paramintW.val = 0;
    if ((((!bool) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((!Lsame.lsame(paramString2, "U")) && (!Lsame.lsame(paramString2, "L")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if (!bool) {}
      }
      if ((((paramInt5 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -7;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPEV ", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfDouble2[(1 - 1 + paramInt3)] = paramArrayOfDouble1[(1 - 1 + paramInt2)];
      if (bool) {
        paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0D;
      }
      return;
    }
    d6 = Dlamch.dlamch("Safe minimum");
    d3 = Dlamch.dlamch("Precision");
    d8 = d6 / d3;
    d2 = 1.0D / d8;
    d5 = Math.sqrt(d8);
    d4 = Math.sqrt(d2);
    d1 = Dlansp.dlansp("M", paramString2, paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble4, paramInt6);
    n = 0;
    if ((d1 <= 0.0D ? 0 : 1) != 0) {}
    if (((d1 >= d5 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      n = 1;
      d7 = d5 / d1;
    }
    else if ((d1 <= d4 ? 0 : 1) != 0)
    {
      n = 1;
      d7 = d4 / d1;
    }
    if ((n != 1 ? 0 : 1) != 0) {
      Dscal.dscal(paramInt1 * (paramInt1 + 1) / 2, d7, paramArrayOfDouble1, paramInt2, 1);
    }
    j = 1;
    k = j + paramInt1;
    Dsptrd.dsptrd(paramString2, paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfDouble4, j - 1 + paramInt6, paramArrayOfDouble4, k - 1 + paramInt6, localintW);
    if ((bool ^ true))
    {
      Dsterf.dsterf(paramInt1, paramArrayOfDouble2, paramInt3, paramArrayOfDouble4, j - 1 + paramInt6, paramintW);
    }
    else
    {
      m = k + paramInt1;
      Dopgtr.dopgtr(paramString2, paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble4, k - 1 + paramInt6, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble4, m - 1 + paramInt6, localintW);
      Dsteqr.dsteqr(paramString1, paramInt1, paramArrayOfDouble2, paramInt3, paramArrayOfDouble4, j - 1 + paramInt6, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble4, k - 1 + paramInt6, paramintW);
    }
    if ((n != 1 ? 0 : 1) != 0)
    {
      if ((paramintW.val != 0 ? 0 : 1) != 0) {
        i = paramInt1;
      } else {
        i = paramintW.val - 1;
      }
      Dscal.dscal(i, 1.0D / d7, paramArrayOfDouble2, paramInt3, 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dspev.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */