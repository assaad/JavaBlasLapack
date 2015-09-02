package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsyevx
{
  public static void dsyevx(String paramString1, String paramString2, String paramString3, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, int paramInt5, double paramDouble3, intW paramintW1, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, int[] paramArrayOfInt1, int paramInt11, int[] paramArrayOfInt2, int paramInt12, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    int j = 0;
    boolean bool4 = false;
    boolean bool5 = false;
    String str = new String(" ");
    int k = 0;
    intW localintW1 = new intW(0);
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    intW localintW2 = new intW(0);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    bool3 = Lsame.lsame(paramString3, "L");
    bool5 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "A");
    bool4 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
    i = paramInt10 != -1 ? 0 : 1;
    paramintW2.val = 0;
    if ((((!bool5) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW2.val = -1;
    }
    else
    {
      if (((!bool1) && (!bool4) ? 0 : 1) == 0) {}
      if (((!bool2 ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -2;
      }
      else if ((((!bool3) && (!Lsame.lsame(paramString3, "U")) ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -3;
      }
      else if ((paramInt1 >= 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -4;
      }
      else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW2.val = -6;
      }
      else if (bool4)
      {
        if ((paramInt1 <= 0 ? 0 : 1) != 0) {}
        if (((paramDouble2 > paramDouble1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -8;
        }
      }
      else if (bool2)
      {
        if ((paramInt4 >= 1 ? 0 : 1) == 0) {}
        if (((paramInt4 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -9;
        }
        else
        {
          if ((paramInt5 >= Math.min(paramInt1, paramInt4) ? 0 : 1) == 0) {}
          if (((paramInt5 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramintW2.val = -10;
          }
        }
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt8 >= 1 ? 0 : 1) == 0) {
        if (!bool5) {}
      }
      if ((((paramInt8 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -15;
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 > 1 ? 0 : 1) != 0)
      {
        i15 = 1;
        paramArrayOfDouble4[(1 - 1 + paramInt9)] = i15;
      }
      else
      {
        i15 = 8 * paramInt1;
        i17 = Ilaenv.ilaenv(1, "DSYTRD", paramString3, paramInt1, -1, -1, -1);
        i17 = Math.max(i17, Ilaenv.ilaenv(1, "DORMTR", paramString3, paramInt1, -1, -1, -1));
        i16 = Math.max(i15, (i17 + 3) * paramInt1);
        paramArrayOfDouble4[(1 - 1 + paramInt9)] = i16;
      }
      if ((paramInt10 >= i15 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -17;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYEVX", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
    paramintW1.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if (((!bool1) && (!bool2) ? 0 : 1) != 0)
      {
        paramintW1.val = 1;
        paramArrayOfDouble2[(1 - 1 + paramInt6)] = paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)];
      }
      else
      {
        if ((paramDouble1 >= paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] ? 0 : 1) != 0) {}
        if (((paramDouble2 < paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW1.val = 1;
          paramArrayOfDouble2[(1 - 1 + paramInt6)] = paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)];
        }
      }
      if (bool5) {
        paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = 1.0D;
      }
      return;
    }
    d7 = Dlamch.dlamch("Safe minimum");
    d4 = Dlamch.dlamch("Precision");
    d9 = d7 / d4;
    d3 = 1.0D / d9;
    d6 = Math.sqrt(d9);
    d5 = Math.min(Math.sqrt(d3), 1.0D / Math.sqrt(Math.sqrt(d7)));
    i9 = 0;
    d1 = paramDouble3;
    if (bool4)
    {
      d11 = paramDouble1;
      d12 = paramDouble2;
    }
    d2 = Dlansy.dlansy("M", paramString3, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble4, paramInt9);
    if ((d2 <= 0.0D ? 0 : 1) != 0) {}
    if (((d2 >= d6 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i9 = 1;
      d8 = d6 / d2;
    }
    else if ((d2 <= d5 ? 0 : 1) != 0)
    {
      i9 = 1;
      d8 = d5 / d2;
    }
    int i18;
    if ((i9 != 1 ? 0 : 1) != 0)
    {
      if (bool3)
      {
        i11 = 1;
        for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
        {
          Dscal.dscal(paramInt1 - i11 + 1, d8, paramArrayOfDouble1, i11 - 1 + (i11 - 1) * paramInt3 + paramInt2, 1);
          i11 += 1;
        }
      }
      else
      {
        i11 = 1;
        for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
        {
          Dscal.dscal(i11, d8, paramArrayOfDouble1, 1 - 1 + (i11 - 1) * paramInt3 + paramInt2, 1);
          i11 += 1;
        }
      }
      if ((paramDouble3 <= 0 ? 0 : 1) != 0) {
        d1 = paramDouble3 * d8;
      }
      if (bool4)
      {
        d11 = paramDouble1 * d8;
        d12 = paramDouble2 * d8;
      }
    }
    i6 = 1;
    i1 = i6 + paramInt1;
    n = i1 + paramInt1;
    i8 = n + paramInt1;
    i13 = paramInt10 - i8 + 1;
    Dsytrd.dsytrd(paramString3, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble4, n - 1 + paramInt9, paramArrayOfDouble4, i1 - 1 + paramInt9, paramArrayOfDouble4, i6 - 1 + paramInt9, paramArrayOfDouble4, i8 - 1 + paramInt9, i13, localintW1);
    j = 0;
    if (bool2)
    {
      if ((paramInt4 != 1 ? 0 : 1) != 0) {}
      if (((paramInt5 != paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        j = 1;
      }
    }
    if (((!bool1) && (j == 0) ? 0 : 1) != 0) {}
    if (((paramDouble3 > 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble4, n - 1 + paramInt9, 1, paramArrayOfDouble2, paramInt6, 1);
      i2 = i8 + 2 * paramInt1;
      if ((bool5 ^ true))
      {
        Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble4, i1 - 1 + paramInt9, 1, paramArrayOfDouble4, i2 - 1 + paramInt9, 1);
        Dsterf.dsterf(paramInt1, paramArrayOfDouble2, paramInt6, paramArrayOfDouble4, i2 - 1 + paramInt9, paramintW2);
      }
      else
      {
        Dlacpy.dlacpy("A", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble3, paramInt7, paramInt8);
        Dorgtr.dorgtr(paramString3, paramInt1, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, i6 - 1 + paramInt9, paramArrayOfDouble4, i8 - 1 + paramInt9, i13, localintW1);
        Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble4, i1 - 1 + paramInt9, 1, paramArrayOfDouble4, i2 - 1 + paramInt9, 1);
        Dsteqr.dsteqr(paramString1, paramInt1, paramArrayOfDouble2, paramInt6, paramArrayOfDouble4, i2 - 1 + paramInt9, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, i8 - 1 + paramInt9, paramintW2);
        if ((paramintW2.val != 0 ? 0 : 1) != 0)
        {
          k = 1;
          for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
          {
            paramArrayOfInt2[(k - 1 + paramInt12)] = 0;
            k += 1;
          }
        }
      }
      if ((paramintW2.val != 0 ? 0 : 1) != 0) {
        paramintW1.val = paramInt1;
      } else {
        paramintW2.val = 0;
      }
    }
    else
    {
      if (bool5) {
        str = "B";
      } else {
        str = "E";
      }
      i3 = 1;
      i4 = i3 + paramInt1;
      i5 = i4 + paramInt1;
      Dstebz.dstebz(paramString2, str, paramInt1, d11, d12, paramInt4, paramInt5, d1, paramArrayOfDouble4, n - 1 + paramInt9, paramArrayOfDouble4, i1 - 1 + paramInt9, paramintW1, localintW2, paramArrayOfDouble2, paramInt6, paramArrayOfInt1, i3 - 1 + paramInt11, paramArrayOfInt1, i4 - 1 + paramInt11, paramArrayOfDouble4, i8 - 1 + paramInt9, paramArrayOfInt1, i5 - 1 + paramInt11, paramintW2);
      if (bool5)
      {
        Dstein.dstein(paramInt1, paramArrayOfDouble4, n - 1 + paramInt9, paramArrayOfDouble4, i1 - 1 + paramInt9, paramintW1.val, paramArrayOfDouble2, paramInt6, paramArrayOfInt1, i3 - 1 + paramInt11, paramArrayOfInt1, i4 - 1 + paramInt11, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, i8 - 1 + paramInt9, paramArrayOfInt1, i5 - 1 + paramInt11, paramArrayOfInt2, paramInt12, paramintW2);
        i7 = i1;
        i14 = paramInt10 - i7 + 1;
        Dormtr.dormtr("L", paramString3, "N", paramInt1, paramintW1.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble4, i6 - 1 + paramInt9, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, i7 - 1 + paramInt9, i14, localintW1);
      }
    }
    if ((i9 != 1 ? 0 : 1) != 0)
    {
      if ((paramintW2.val != 0 ? 0 : 1) != 0) {
        m = paramintW1.val;
      } else {
        m = paramintW2.val - 1;
      }
      Dscal.dscal(m, 1.0D / d8, paramArrayOfDouble2, paramInt6, 1);
    }
    if (bool5)
    {
      i11 = 1;
      for (i18 = paramintW1.val - 1 - 1 + 1; i18 > 0; i18--)
      {
        k = 0;
        d10 = paramArrayOfDouble2[(i11 - 1 + paramInt6)];
        i12 = i11 + 1;
        for (int i19 = paramintW1.val - (i11 + 1) + 1; i19 > 0; i19--)
        {
          if ((paramArrayOfDouble2[(i12 - 1 + paramInt6)] >= d10 ? 0 : 1) != 0)
          {
            k = i12;
            d10 = paramArrayOfDouble2[(i12 - 1 + paramInt6)];
          }
          i12 += 1;
        }
        if ((k == 0 ? 0 : 1) != 0)
        {
          i10 = paramArrayOfInt1[(i3 + k - 1 - 1 + paramInt11)];
          paramArrayOfDouble2[(k - 1 + paramInt6)] = paramArrayOfDouble2[(i11 - 1 + paramInt6)];
          paramArrayOfInt1[(i3 + k - 1 - 1 + paramInt11)] = paramArrayOfInt1[(i3 + i11 - 1 - 1 + paramInt11)];
          paramArrayOfDouble2[(i11 - 1 + paramInt6)] = d10;
          paramArrayOfInt1[(i3 + i11 - 1 - 1 + paramInt11)] = i10;
          Dswap.dswap(paramInt1, paramArrayOfDouble3, 1 - 1 + (k - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble3, 1 - 1 + (i11 - 1) * paramInt8 + paramInt7, 1);
          if ((paramintW2.val == 0 ? 0 : 1) != 0)
          {
            i10 = paramArrayOfInt2[(k - 1 + paramInt12)];
            paramArrayOfInt2[(k - 1 + paramInt12)] = paramArrayOfInt2[(i11 - 1 + paramInt12)];
            paramArrayOfInt2[(i11 - 1 + paramInt12)] = i10;
          }
        }
        i11 += 1;
      }
    }
    paramArrayOfDouble4[(1 - 1 + paramInt9)] = i16;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsyevx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */