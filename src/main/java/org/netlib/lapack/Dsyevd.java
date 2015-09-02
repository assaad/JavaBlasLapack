package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsyevd
{
  public static void dsyevd(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, int paramInt6, int[] paramArrayOfInt, int paramInt7, int paramInt8, intW paramintW)
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
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
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
    if ((paramInt6 != -1 ? 0 : 1) == 0) {}
    i = (paramInt8 != -1 ? 0 : 1) == 0 ? 0 : 1;
    paramintW.val = 0;
    if ((((!bool2) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0) {
      paramintW.val = -1;
    } else if ((((!bool1) && (!Lsame.lsame(paramString2, "U")) ? 0 : 1) ^ 0x1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 > 1 ? 0 : 1) != 0)
      {
        i3 = 1;
        i7 = 1;
        i6 = i7;
        i2 = i3;
      }
      else
      {
        if (bool2)
        {
          i3 = 3 + 5 * paramInt1;
          i7 = 1 + 6 * paramInt1 + 2 * (int)Math.pow(paramInt1, 2);
        }
        else
        {
          i3 = 1;
          i7 = 2 * paramInt1 + 1;
        }
        i6 = Math.max(i7, 2 * paramInt1 + Ilaenv.ilaenv(1, "DSYTRD", paramString2, paramInt1, -1, -1, -1));
        i2 = i3;
      }
      paramArrayOfDouble3[(1 - 1 + paramInt5)] = i6;
      paramArrayOfInt[(1 - 1 + paramInt7)] = i2;
      if ((paramInt6 >= i7 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -8;
      }
      else
      {
        if ((paramInt8 >= i3 ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -10;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYEVD", -paramintW.val);
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
      paramArrayOfDouble2[(1 - 1 + paramInt4)] = paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)];
      if (bool2) {
        paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] = 1.0D;
      }
      return;
    }
    d6 = Dlamch.dlamch("Safe minimum");
    d3 = Dlamch.dlamch("Precision");
    d8 = d6 / d3;
    d2 = 1.0D / d8;
    d5 = Math.sqrt(d8);
    d4 = Math.sqrt(d2);
    d1 = Dlansy.dlansy("M", paramString2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble3, paramInt5);
    i1 = 0;
    if ((d1 <= 0.0D ? 0 : 1) != 0) {}
    if (((d1 >= d5 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i1 = 1;
      d7 = d5 / d1;
    }
    else if ((d1 <= d4 ? 0 : 1) != 0)
    {
      i1 = 1;
      d7 = d4 / d1;
    }
    if ((i1 != 1 ? 0 : 1) != 0) {
      Dlascl.dlascl(paramString2, 0, 0, 1.0D, d7, paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramintW);
    }
    j = 1;
    k = j + paramInt1;
    n = k + paramInt1;
    i4 = paramInt6 - n + 1;
    m = n + paramInt1 * paramInt1;
    i5 = paramInt6 - m + 1;
    Dsytrd.dsytrd(paramString2, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, j - 1 + paramInt5, paramArrayOfDouble3, k - 1 + paramInt5, paramArrayOfDouble3, n - 1 + paramInt5, i4, localintW);
    i6 = (int)(2 * paramInt1 + paramArrayOfDouble3[(n - 1 + paramInt5)]);
    if ((bool2 ^ true))
    {
      Dsterf.dsterf(paramInt1, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, j - 1 + paramInt5, paramintW);
    }
    else
    {
      Dstedc.dstedc("I", paramInt1, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, j - 1 + paramInt5, paramArrayOfDouble3, n - 1 + paramInt5, paramInt1, paramArrayOfDouble3, m - 1 + paramInt5, i5, paramArrayOfInt, paramInt7, paramInt8, paramintW);
      Dormtr.dormtr("L", paramString2, "N", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble3, k - 1 + paramInt5, paramArrayOfDouble3, n - 1 + paramInt5, paramInt1, paramArrayOfDouble3, m - 1 + paramInt5, i5, localintW);
      Dlacpy.dlacpy("A", paramInt1, paramInt1, paramArrayOfDouble3, n - 1 + paramInt5, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3);
      i6 = Math.max(i6, 1 + 6 * paramInt1 + 2 * (int)Math.pow(paramInt1, 2));
    }
    if ((i1 != 1 ? 0 : 1) != 0) {
      Dscal.dscal(paramInt1, 1.0D / d7, paramArrayOfDouble2, paramInt4, 1);
    }
    paramArrayOfDouble3[(1 - 1 + paramInt5)] = i6;
    paramArrayOfInt[(1 - 1 + paramInt7)] = i2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsyevd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */