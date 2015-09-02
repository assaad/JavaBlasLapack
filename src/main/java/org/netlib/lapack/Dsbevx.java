package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsbevx
{
  public static void dsbevx(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double paramDouble1, double paramDouble2, int paramInt7, int paramInt8, double paramDouble3, intW paramintW1, double[] paramArrayOfDouble3, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int[] paramArrayOfInt1, int paramInt13, int[] paramArrayOfInt2, int paramInt14, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    boolean bool4 = false;
    boolean bool5 = false;
    String str = new String(" ");
    int j = 0;
    intW localintW1 = new intW(0);
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
    int i8 = 0;
    int i9 = 0;
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
    bool5 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "A");
    bool4 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
    bool3 = Lsame.lsame(paramString3, "L");
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
      else if ((paramInt2 >= 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -5;
      }
      else if ((paramInt4 >= paramInt2 + 1 ? 0 : 1) != 0)
      {
        paramintW2.val = -7;
      }
      else
      {
        if (bool5) {}
        if (((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW2.val = -9;
        }
        else if (bool4)
        {
          if ((paramInt1 <= 0 ? 0 : 1) != 0) {}
          if (((paramDouble2 > paramDouble1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramintW2.val = -11;
          }
        }
        else if (bool2)
        {
          if ((paramInt7 >= 1 ? 0 : 1) == 0) {}
          if (((paramInt7 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = -12;
          }
          else
          {
            if ((paramInt8 >= Math.min(paramInt1, paramInt7) ? 0 : 1) == 0) {}
            if (((paramInt8 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
              paramintW2.val = -13;
            }
          }
        }
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt11 >= 1 ? 0 : 1) == 0) {
        if (!bool5) {}
      }
      if ((((paramInt11 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -18;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSBEVX", -paramintW2.val);
      return;
    }
    paramintW1.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramintW1.val = 1;
      if (bool3) {
        d10 = paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
      } else {
        d10 = paramArrayOfDouble1[(paramInt2 + 1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
      }
      if (bool4)
      {
        if ((paramDouble1 >= d10 ? 0 : 1) != 0) {}
        if ((((paramDouble2 < d10 ? 0 : 1) != 0 ? 1 : 0) ^ 0x1) != 0) {
          paramintW1.val = 0;
        }
      }
      if ((paramintW1.val != 1 ? 0 : 1) != 0)
      {
        paramArrayOfDouble3[(1 - 1 + paramInt9)] = d10;
        if (bool5) {
          paramArrayOfDouble4[(1 - 1 + (1 - 1) * paramInt11 + paramInt10)] = 1.0D;
        }
      }
      return;
    }
    d7 = Dlamch.dlamch("Safe minimum");
    d4 = Dlamch.dlamch("Precision");
    d9 = d7 / d4;
    d3 = 1.0D / d9;
    d6 = Math.sqrt(d9);
    d5 = Math.min(Math.sqrt(d3), 1.0D / Math.sqrt(Math.sqrt(d7)));
    i6 = 0;
    d1 = paramDouble3;
    if (bool4)
    {
      d11 = paramDouble1;
      d12 = paramDouble2;
    }
    else
    {
      d11 = 0.0D;
      d12 = 0.0D;
    }
    d2 = Dlansb.dlansb("M", paramString3, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, paramInt12);
    if ((d2 <= 0.0D ? 0 : 1) != 0) {}
    if (((d2 >= d6 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i6 = 1;
      d8 = d6 / d2;
    }
    else if ((d2 <= d5 ? 0 : 1) != 0)
    {
      i6 = 1;
      d8 = d5 / d2;
    }
    if ((i6 != 1 ? 0 : 1) != 0)
    {
      if (bool3) {
        Dlascl.dlascl("B", paramInt2, paramInt2, 1.0D, d8, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramintW2);
      } else {
        Dlascl.dlascl("Q", paramInt2, paramInt2, 1.0D, d8, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramintW2);
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
    m = 1;
    n = m + paramInt1;
    i5 = n + paramInt1;
    Dsbtrd.dsbtrd(paramString1, paramString3, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, m - 1 + paramInt12, paramArrayOfDouble5, n - 1 + paramInt12, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble5, i5 - 1 + paramInt12, localintW1);
    i = 0;
    if (bool2)
    {
      if ((paramInt7 != 1 ? 0 : 1) != 0) {}
      if (((paramInt8 != paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        i = 1;
      }
    }
    if (((!bool1) && (i == 0) ? 0 : 1) != 0) {}
    int i10;
    if (((paramDouble3 > 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble5, m - 1 + paramInt12, 1, paramArrayOfDouble3, paramInt9, 1);
      i1 = i5 + 2 * paramInt1;
      if ((bool5 ^ true))
      {
        Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble5, n - 1 + paramInt12, 1, paramArrayOfDouble5, i1 - 1 + paramInt12, 1);
        Dsterf.dsterf(paramInt1, paramArrayOfDouble3, paramInt9, paramArrayOfDouble5, i1 - 1 + paramInt12, paramintW2);
      }
      else
      {
        Dlacpy.dlacpy("A", paramInt1, paramInt1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble4, paramInt10, paramInt11);
        Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble5, n - 1 + paramInt12, 1, paramArrayOfDouble5, i1 - 1 + paramInt12, 1);
        Dsteqr.dsteqr(paramString1, paramInt1, paramArrayOfDouble3, paramInt9, paramArrayOfDouble5, i1 - 1 + paramInt12, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble5, i5 - 1 + paramInt12, paramintW2);
        if ((paramintW2.val != 0 ? 0 : 1) != 0)
        {
          j = 1;
          for (i10 = paramInt1 - 1 + 1; i10 > 0; i10--)
          {
            paramArrayOfInt2[(j - 1 + paramInt14)] = 0;
            j += 1;
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
      i2 = 1;
      i3 = i2 + paramInt1;
      i4 = i3 + paramInt1;
      Dstebz.dstebz(paramString2, str, paramInt1, d11, d12, paramInt7, paramInt8, d1, paramArrayOfDouble5, m - 1 + paramInt12, paramArrayOfDouble5, n - 1 + paramInt12, paramintW1, localintW2, paramArrayOfDouble3, paramInt9, paramArrayOfInt1, i2 - 1 + paramInt13, paramArrayOfInt1, i3 - 1 + paramInt13, paramArrayOfDouble5, i5 - 1 + paramInt12, paramArrayOfInt1, i4 - 1 + paramInt13, paramintW2);
      if (bool5)
      {
        Dstein.dstein(paramInt1, paramArrayOfDouble5, m - 1 + paramInt12, paramArrayOfDouble5, n - 1 + paramInt12, paramintW1.val, paramArrayOfDouble3, paramInt9, paramArrayOfInt1, i2 - 1 + paramInt13, paramArrayOfInt1, i3 - 1 + paramInt13, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble5, i5 - 1 + paramInt12, paramArrayOfInt1, i4 - 1 + paramInt13, paramArrayOfInt2, paramInt14, paramintW2);
        i8 = 1;
        for (i10 = paramintW1.val - 1 + 1; i10 > 0; i10--)
        {
          Dcopy.dcopy(paramInt1, paramArrayOfDouble4, 1 - 1 + (i8 - 1) * paramInt11 + paramInt10, 1, paramArrayOfDouble5, 1 - 1 + paramInt12, 1);
          Dgemv.dgemv("N", paramInt1, paramInt1, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble5, paramInt12, 1, 0.0D, paramArrayOfDouble4, 1 - 1 + (i8 - 1) * paramInt11 + paramInt10, 1);
          i8 += 1;
        }
      }
    }
    if ((i6 != 1 ? 0 : 1) != 0)
    {
      if ((paramintW2.val != 0 ? 0 : 1) != 0) {
        k = paramintW1.val;
      } else {
        k = paramintW2.val - 1;
      }
      Dscal.dscal(k, 1.0D / d8, paramArrayOfDouble3, paramInt9, 1);
    }
    if (bool5)
    {
      i8 = 1;
      for (i10 = paramintW1.val - 1 - 1 + 1; i10 > 0; i10--)
      {
        j = 0;
        d10 = paramArrayOfDouble3[(i8 - 1 + paramInt9)];
        i9 = i8 + 1;
        for (int i11 = paramintW1.val - (i8 + 1) + 1; i11 > 0; i11--)
        {
          if ((paramArrayOfDouble3[(i9 - 1 + paramInt9)] >= d10 ? 0 : 1) != 0)
          {
            j = i9;
            d10 = paramArrayOfDouble3[(i9 - 1 + paramInt9)];
          }
          i9 += 1;
        }
        if ((j == 0 ? 0 : 1) != 0)
        {
          i7 = paramArrayOfInt1[(i2 + j - 1 - 1 + paramInt13)];
          paramArrayOfDouble3[(j - 1 + paramInt9)] = paramArrayOfDouble3[(i8 - 1 + paramInt9)];
          paramArrayOfInt1[(i2 + j - 1 - 1 + paramInt13)] = paramArrayOfInt1[(i2 + i8 - 1 - 1 + paramInt13)];
          paramArrayOfDouble3[(i8 - 1 + paramInt9)] = d10;
          paramArrayOfInt1[(i2 + i8 - 1 - 1 + paramInt13)] = i7;
          Dswap.dswap(paramInt1, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1, paramArrayOfDouble4, 1 - 1 + (i8 - 1) * paramInt11 + paramInt10, 1);
          if ((paramintW2.val == 0 ? 0 : 1) != 0)
          {
            i7 = paramArrayOfInt2[(j - 1 + paramInt14)];
            paramArrayOfInt2[(j - 1 + paramInt14)] = paramArrayOfInt2[(i8 - 1 + paramInt14)];
            paramArrayOfInt2[(i8 - 1 + paramInt14)] = i7;
          }
        }
        i8 += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsbevx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */