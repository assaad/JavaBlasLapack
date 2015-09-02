package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dstev
{
  public static void dstev(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    bool = Lsame.lsame(paramString, "V");
    paramintW.val = 0;
    if ((((!bool) && (!Lsame.lsame(paramString, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if (!bool) {}
      }
      if ((((paramInt5 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -6;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSTEV ", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if (bool) {
        paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0D;
      }
      return;
    }
    d5 = Dlamch.dlamch("Safe minimum");
    d2 = Dlamch.dlamch("Precision");
    d7 = d5 / d2;
    d1 = 1.0D / d7;
    d4 = Math.sqrt(d7);
    d3 = Math.sqrt(d1);
    j = 0;
    d8 = Dlanst.dlanst("M", paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3);
    if ((d8 <= 0.0D ? 0 : 1) != 0) {}
    if (((d8 >= d4 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      j = 1;
      d6 = d4 / d8;
    }
    else if ((d8 <= d3 ? 0 : 1) != 0)
    {
      j = 1;
      d6 = d3 / d8;
    }
    if ((j != 1 ? 0 : 1) != 0)
    {
      Dscal.dscal(paramInt1, d6, paramArrayOfDouble1, paramInt2, 1);
      Dscal.dscal(paramInt1 - 1, d6, paramArrayOfDouble2, 1 - 1 + paramInt3, 1);
    }
    if ((bool ^ true)) {
      Dsterf.dsterf(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramintW);
    } else {
      Dsteqr.dsteqr("I", paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble4, paramInt6, paramintW);
    }
    if ((j != 1 ? 0 : 1) != 0)
    {
      if ((paramintW.val != 0 ? 0 : 1) != 0) {
        i = paramInt1;
      } else {
        i = paramintW.val - 1;
      }
      Dscal.dscal(i, 1.0D / d6, paramArrayOfDouble1, paramInt2, 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dstev.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */