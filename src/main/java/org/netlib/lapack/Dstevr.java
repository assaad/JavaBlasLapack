package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.booleanW;
import org.netlib.util.intW;

public final class Dstevr
{
  public static void dstevr(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, int paramInt5, double paramDouble3, intW paramintW1, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, int[] paramArrayOfInt2, int paramInt12, int paramInt13, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    int j = 0;
    boolean bool3 = false;
    boolean bool4 = false;
    booleanW localbooleanW = new booleanW(false);
    String str = new String(" ");
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
    int i10 = 0;
    intW localintW = new intW(0);
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
    m = Ilaenv.ilaenv(10, "DSTEVR", "N", 1, 2, 3, 4);
    bool4 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "A");
    bool3 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
    if ((paramInt11 != -1 ? 0 : 1) == 0) {}
    j = (paramInt13 != -1 ? 0 : 1) == 0 ? 0 : 1;
    i10 = Math.max(1, 20 * paramInt1);
    i9 = Math.max(1, 10 * paramInt1);
    paramintW2.val = 0;
    if ((((!bool4) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW2.val = -1;
    }
    else
    {
      if (((!bool1) && (!bool3) ? 0 : 1) == 0) {}
      if (((!bool2 ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -2;
      }
      else if ((paramInt1 >= 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -3;
      }
      else if (bool3)
      {
        if ((paramInt1 <= 0 ? 0 : 1) != 0) {}
        if (((paramDouble2 > paramDouble1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -7;
        }
      }
      else if (bool2)
      {
        if ((paramInt4 >= 1 ? 0 : 1) == 0) {}
        if (((paramInt4 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -8;
        }
        else
        {
          if ((paramInt5 >= Math.min(paramInt1, paramInt4) ? 0 : 1) == 0) {}
          if (((paramInt5 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramintW2.val = -9;
          }
        }
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt8 >= 1 ? 0 : 1) == 0) {
        if (!bool4) {}
      }
      if ((((paramInt8 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -14;
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble5[(1 - 1 + paramInt10)] = i10;
      paramArrayOfInt2[(1 - 1 + paramInt12)] = i9;
      if ((paramInt11 >= i10 ? 0 : 1) != 0) {}
      if (((j ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW2.val = -17;
      }
      else
      {
        if ((paramInt13 >= i9 ? 0 : 1) != 0) {}
        if (((j ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -19;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSTEVR", -paramintW2.val);
      return;
    }
    if (j != 0) {
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
        paramArrayOfDouble3[(1 - 1 + paramInt6)] = paramArrayOfDouble1[(1 - 1 + paramInt2)];
      }
      else
      {
        if ((paramDouble1 >= paramArrayOfDouble1[(1 - 1 + paramInt2)] ? 0 : 1) != 0) {}
        if (((paramDouble2 < paramArrayOfDouble1[(1 - 1 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW1.val = 1;
          paramArrayOfDouble3[(1 - 1 + paramInt6)] = paramArrayOfDouble1[(1 - 1 + paramInt2)];
        }
      }
      if (bool4) {
        paramArrayOfDouble4[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = 1.0D;
      }
      return;
    }
    d5 = Dlamch.dlamch("Safe minimum");
    d2 = Dlamch.dlamch("Precision");
    d7 = d5 / d2;
    d1 = 1.0D / d7;
    d4 = Math.sqrt(d7);
    d3 = Math.min(Math.sqrt(d1), 1.0D / Math.sqrt(Math.sqrt(d5)));
    i5 = 0;
    d10 = paramDouble1;
    d11 = paramDouble2;
    d9 = Dlanst.dlanst("M", paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3);
    if ((d9 <= 0.0D ? 0 : 1) != 0) {}
    if (((d9 >= d4 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i5 = 1;
      d6 = d4 / d9;
    }
    else if ((d9 <= d3 ? 0 : 1) != 0)
    {
      i5 = 1;
      d6 = d3 / d9;
    }
    if ((i5 != 1 ? 0 : 1) != 0)
    {
      Dscal.dscal(paramInt1, d6, paramArrayOfDouble1, paramInt2, 1);
      Dscal.dscal(paramInt1 - 1, d6, paramArrayOfDouble2, 1 - 1 + paramInt3, 1);
      if (bool3)
      {
        d10 = paramDouble1 * d6;
        d11 = paramDouble2 * d6;
      }
    }
    i1 = 1;
    i3 = i1 + paramInt1;
    i2 = i3 + paramInt1;
    i4 = i3 + paramInt1;
    i = 0;
    if (bool2)
    {
      if ((paramInt4 != 1 ? 0 : 1) != 0) {}
      if (((paramInt5 != paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        i = 1;
      }
    }
    if (((!bool1) && (i == 0) ? 0 : 1) != 0) {}
    if (((m != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble2, 1 - 1 + paramInt3, 1, paramArrayOfDouble5, 1 - 1 + paramInt10, 1);
      if ((bool4 ^ true))
      {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt2, 1, paramArrayOfDouble3, paramInt6, 1);
        Dsterf.dsterf(paramInt1, paramArrayOfDouble3, paramInt6, paramArrayOfDouble5, paramInt10, paramintW2);
      }
      else
      {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt2, 1, paramArrayOfDouble5, paramInt1 + 1 - 1 + paramInt10, 1);
        if ((paramDouble3 > 2.0D * paramInt1 * d2 ? 0 : 1) != 0) {
          localbooleanW.val = true;
        } else {
          localbooleanW.val = false;
        }
        Dstemr.dstemr(paramString1, "A", paramInt1, paramArrayOfDouble5, paramInt1 + 1 - 1 + paramInt10, paramArrayOfDouble5, paramInt10, paramDouble1, paramDouble2, paramInt4, paramInt5, paramintW1, paramArrayOfDouble3, paramInt6, paramArrayOfDouble4, paramInt7, paramInt8, paramInt1, paramArrayOfInt1, paramInt9, localbooleanW, paramArrayOfDouble5, 2 * paramInt1 + 1 - 1 + paramInt10, paramInt11 - 2 * paramInt1, paramArrayOfInt2, paramInt12, paramInt13, paramintW2);
      }
      if ((paramintW2.val != 0 ? 0 : 1) != 0) {
        paramintW1.val = paramInt1;
      } else {
        paramintW2.val = 0;
      }
    }
    else
    {
      if (bool4) {
        str = "B";
      } else {
        str = "E";
      }
      Dstebz.dstebz(paramString2, str, paramInt1, d10, d11, paramInt4, paramInt5, paramDouble3, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramintW1, localintW, paramArrayOfDouble3, paramInt6, paramArrayOfInt2, i1 - 1 + paramInt12, paramArrayOfInt2, i3 - 1 + paramInt12, paramArrayOfDouble5, paramInt10, paramArrayOfInt2, i4 - 1 + paramInt12, paramintW2);
      if (bool4) {
        Dstein.dstein(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramintW1.val, paramArrayOfDouble3, paramInt6, paramArrayOfInt2, i1 - 1 + paramInt12, paramArrayOfInt2, i3 - 1 + paramInt12, paramArrayOfDouble4, paramInt7, paramInt8, paramArrayOfDouble5, paramInt10, paramArrayOfInt2, i4 - 1 + paramInt12, paramArrayOfInt2, i2 - 1 + paramInt12, paramintW2);
      }
    }
    if ((i5 != 1 ? 0 : 1) != 0)
    {
      if ((paramintW2.val != 0 ? 0 : 1) != 0) {
        n = paramintW1.val;
      } else {
        n = paramintW2.val - 1;
      }
      Dscal.dscal(n, 1.0D / d6, paramArrayOfDouble3, paramInt6, 1);
    }
    if (bool4)
    {
      i7 = 1;
      for (int i11 = paramintW1.val - 1 - 1 + 1; i11 > 0; i11--)
      {
        k = 0;
        d8 = paramArrayOfDouble3[(i7 - 1 + paramInt6)];
        i8 = i7 + 1;
        for (int i12 = paramintW1.val - (i7 + 1) + 1; i12 > 0; i12--)
        {
          if ((paramArrayOfDouble3[(i8 - 1 + paramInt6)] >= d8 ? 0 : 1) != 0)
          {
            k = i8;
            d8 = paramArrayOfDouble3[(i8 - 1 + paramInt6)];
          }
          i8 += 1;
        }
        if ((k == 0 ? 0 : 1) != 0)
        {
          i6 = paramArrayOfInt2[(k - 1 + paramInt12)];
          paramArrayOfDouble3[(k - 1 + paramInt6)] = paramArrayOfDouble3[(i7 - 1 + paramInt6)];
          paramArrayOfInt2[(k - 1 + paramInt12)] = paramArrayOfInt2[(i7 - 1 + paramInt12)];
          paramArrayOfDouble3[(i7 - 1 + paramInt6)] = d8;
          paramArrayOfInt2[(i7 - 1 + paramInt12)] = i6;
          Dswap.dswap(paramInt1, paramArrayOfDouble4, 1 - 1 + (k - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble4, 1 - 1 + (i7 - 1) * paramInt8 + paramInt7, 1);
        }
        i7 += 1;
      }
    }
    paramArrayOfDouble5[(1 - 1 + paramInt10)] = i10;
    paramArrayOfInt2[(1 - 1 + paramInt12)] = i9;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dstevr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */