package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsbevd
{
  public static void dsbevd(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, int[] paramArrayOfInt, int paramInt10, int paramInt11, intW paramintW)
  {
    boolean bool1 = false;
    int i = 0;
    boolean bool2 = false;
    intW localintW = new intW(0);
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
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
    if ((paramInt9 != -1 ? 0 : 1) == 0) {}
    i = (paramInt11 != -1 ? 0 : 1) == 0 ? 0 : 1;
    paramintW.val = 0;
    if ((paramInt1 > 1 ? 0 : 1) != 0)
    {
      i1 = 1;
      i3 = 1;
    }
    else if (bool2)
    {
      i1 = 3 + 5 * paramInt1;
      i3 = 1 + 5 * paramInt1 + 2 * (int)Math.pow(paramInt1, 2);
    }
    else
    {
      i1 = 1;
      i3 = 2 * paramInt1;
    }
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
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble4[(1 - 1 + paramInt8)] = i3;
      paramArrayOfInt[(1 - 1 + paramInt10)] = i1;
      if ((paramInt9 >= i3 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -11;
      }
      else
      {
        if ((paramInt11 >= i1 ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -13;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSBEVD", -paramintW.val);
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
      paramArrayOfDouble2[(1 - 1 + paramInt5)] = paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
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
      if (bool1) {
        Dlascl.dlascl("B", paramInt2, paramInt2, 1.0D, d7, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramintW);
      } else {
        Dlascl.dlascl("Q", paramInt2, paramInt2, 1.0D, d7, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramintW);
      }
    }
    j = 1;
    m = j + paramInt1;
    k = m + paramInt1 * paramInt1;
    i2 = paramInt9 - k + 1;
    Dsbtrd.dsbtrd(paramString1, paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble4, j - 1 + paramInt8, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, m - 1 + paramInt8, localintW);
    if ((bool2 ^ true))
    {
      Dsterf.dsterf(paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble4, j - 1 + paramInt8, paramintW);
    }
    else
    {
      Dstedc.dstedc("I", paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble4, j - 1 + paramInt8, paramArrayOfDouble4, m - 1 + paramInt8, paramInt1, paramArrayOfDouble4, k - 1 + paramInt8, i2, paramArrayOfInt, paramInt10, paramInt11, paramintW);
      Dgemm.dgemm("N", "N", paramInt1, paramInt1, paramInt1, 1.0D, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, m - 1 + paramInt8, paramInt1, 0.0D, paramArrayOfDouble4, k - 1 + paramInt8, paramInt1);
      Dlacpy.dlacpy("A", paramInt1, paramInt1, paramArrayOfDouble4, k - 1 + paramInt8, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7);
    }
    if ((n != 1 ? 0 : 1) != 0) {
      Dscal.dscal(paramInt1, 1.0D / d7, paramArrayOfDouble2, paramInt5, 1);
    }
    paramArrayOfDouble4[(1 - 1 + paramInt8)] = i3;
    paramArrayOfInt[(1 - 1 + paramInt10)] = i1;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsbevd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */