package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dstevd
{
  public static void dstevd(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, int[] paramArrayOfInt, int paramInt8, int paramInt9, intW paramintW)
  {
    int i = 0;
    boolean bool = false;
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
    bool = Lsame.lsame(paramString, "V");
    if ((paramInt7 != -1 ? 0 : 1) == 0) {}
    i = (paramInt9 != -1 ? 0 : 1) == 0 ? 0 : 1;
    paramintW.val = 0;
    k = 1;
    m = 1;
    if ((paramInt1 <= 1 ? 0 : 1) != 0) {}
    if ((bool ? 1 : 0) != 0)
    {
      m = 1 + 4 * paramInt1 + (int)Math.pow(paramInt1, 2);
      k = 3 + 5 * paramInt1;
    }
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
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble4[(1 - 1 + paramInt6)] = m;
      paramArrayOfInt[(1 - 1 + paramInt8)] = k;
      if ((paramInt7 >= m ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -8;
      }
      else
      {
        if ((paramInt9 >= k ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -10;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSTEVD", -paramintW.val);
      return;
    }
    if (i != 0) {
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
      Dstedc.dstedc("I", paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfInt, paramInt8, paramInt9, paramintW);
    }
    if ((j != 1 ? 0 : 1) != 0) {
      Dscal.dscal(paramInt1, 1.0D / d6, paramArrayOfDouble1, paramInt2, 1);
    }
    paramArrayOfDouble4[(1 - 1 + paramInt6)] = m;
    paramArrayOfInt[(1 - 1 + paramInt8)] = k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dstevd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */