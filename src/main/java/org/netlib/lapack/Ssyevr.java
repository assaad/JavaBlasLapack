package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.booleanW;
import org.netlib.util.intW;

public final class Ssyevr
{
  public static void ssyevr(String paramString1, String paramString2, String paramString3, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, int paramInt4, int paramInt5, float paramFloat3, intW paramintW1, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, int[] paramArrayOfInt2, int paramInt12, int paramInt13, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    int j = 0;
    boolean bool4 = false;
    boolean bool5 = false;
    booleanW localbooleanW = new booleanW(false);
    String str = new String(" ");
    int k = 0;
    int m = 0;
    intW localintW1 = new intW(0);
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
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    intW localintW2 = new intW(0);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    m = Ilaenv.ilaenv(10, "SSYEVR", "N", 1, 2, 3, 4);
    bool3 = Lsame.lsame(paramString3, "L");
    bool5 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "A");
    bool4 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
    if ((paramInt11 != -1 ? 0 : 1) == 0) {}
    i = (paramInt13 != -1 ? 0 : 1) == 0 ? 0 : 1;
    i19 = Math.max(1, 26 * paramInt1);
    i15 = Math.max(1, 10 * paramInt1);
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
        if (((paramFloat2 > paramFloat1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
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
      i20 = Ilaenv.ilaenv(1, "SSYTRD", paramString3, paramInt1, -1, -1, -1);
      i20 = Math.max(i20, Ilaenv.ilaenv(1, "SORMTR", paramString3, paramInt1, -1, -1, -1));
      i18 = Math.max((i20 + 1) * paramInt1, i19);
      paramArrayOfFloat4[(1 - 1 + paramInt10)] = i18;
      paramArrayOfInt2[(1 - 1 + paramInt12)] = i15;
      if ((paramInt11 >= i19 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW2.val = -18;
      }
      else
      {
        if ((paramInt13 >= i15 ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -20;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSYEVR", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
    paramintW1.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramArrayOfFloat4[(1 - 1 + paramInt10)] = 1;
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfFloat4[(1 - 1 + paramInt10)] = 26;
      if (((!bool1) && (!bool2) ? 0 : 1) != 0)
      {
        paramintW1.val = 1;
        paramArrayOfFloat2[(1 - 1 + paramInt6)] = paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)];
      }
      else
      {
        if ((paramFloat1 >= paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] ? 0 : 1) != 0) {}
        if (((paramFloat2 < paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW1.val = 1;
          paramArrayOfFloat2[(1 - 1 + paramInt6)] = paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)];
        }
      }
      if (bool5) {
        paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = 1.0F;
      }
      return;
    }
    f7 = Slamch.slamch("Safe minimum");
    f4 = Slamch.slamch("Precision");
    f9 = f7 / f4;
    f3 = 1.0F / f9;
    f6 = (float)Math.sqrt(f9);
    f5 = Math.min((float)Math.sqrt(f3), 1.0F / (float)Math.sqrt((float)Math.sqrt(f7)));
    i12 = 0;
    f1 = paramFloat3;
    if (bool4)
    {
      f11 = paramFloat1;
      f12 = paramFloat2;
    }
    f2 = Slansy.slansy("M", paramString3, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat4, paramInt10);
    if ((f2 <= 0.0F ? 0 : 1) != 0) {}
    if (((f2 >= f6 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i12 = 1;
      f8 = f6 / f2;
    }
    else if ((f2 <= f5 ? 0 : 1) != 0)
    {
      i12 = 1;
      f8 = f5 / f2;
    }
    int i21;
    if ((i12 != 1 ? 0 : 1) != 0)
    {
      if (bool3)
      {
        i13 = 1;
        for (i21 = paramInt1 - 1 + 1; i21 > 0; i21--)
        {
          Sscal.sscal(paramInt1 - i13 + 1, f8, paramArrayOfFloat1, i13 - 1 + (i13 - 1) * paramInt3 + paramInt2, 1);
          i13 += 1;
        }
      }
      else
      {
        i13 = 1;
        for (i21 = paramInt1 - 1 + 1; i21 > 0; i21--)
        {
          Sscal.sscal(i13, f8, paramArrayOfFloat1, 1 - 1 + (i13 - 1) * paramInt3 + paramInt2, 1);
          i13 += 1;
        }
      }
      if ((paramFloat3 <= 0 ? 0 : 1) != 0) {
        f1 = paramFloat3 * f8;
      }
      if (bool4)
      {
        f11 = paramFloat1 * f8;
        f12 = paramFloat2 * f8;
      }
    }
    i9 = 1;
    i1 = i9 + paramInt1;
    i3 = i1 + paramInt1;
    i2 = i3 + paramInt1;
    i4 = i2 + paramInt1;
    i10 = i4 + paramInt1;
    i16 = paramInt11 - i10 + 1;
    i5 = 1;
    i7 = i5 + paramInt1;
    i6 = i7 + paramInt1;
    i8 = i7 + paramInt1;
    Ssytrd.ssytrd(paramString3, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat4, i1 - 1 + paramInt10, paramArrayOfFloat4, i3 - 1 + paramInt10, paramArrayOfFloat4, i9 - 1 + paramInt10, paramArrayOfFloat4, i10 - 1 + paramInt10, i16, localintW1);
    j = 0;
    if (bool2)
    {
      if ((paramInt4 != 1 ? 0 : 1) != 0) {}
      if (((paramInt5 != paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        j = 1;
      }
    }
    if (((!bool1) && (j == 0) ? 0 : 1) != 0) {}
    if (((m != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      if ((bool5 ^ true))
      {
        Scopy.scopy(paramInt1, paramArrayOfFloat4, i1 - 1 + paramInt10, 1, paramArrayOfFloat2, paramInt6, 1);
        Scopy.scopy(paramInt1 - 1, paramArrayOfFloat4, i3 - 1 + paramInt10, 1, paramArrayOfFloat4, i4 - 1 + paramInt10, 1);
        Ssterf.ssterf(paramInt1, paramArrayOfFloat2, paramInt6, paramArrayOfFloat4, i4 - 1 + paramInt10, paramintW2);
      }
      else
      {
        Scopy.scopy(paramInt1 - 1, paramArrayOfFloat4, i3 - 1 + paramInt10, 1, paramArrayOfFloat4, i4 - 1 + paramInt10, 1);
        Scopy.scopy(paramInt1, paramArrayOfFloat4, i1 - 1 + paramInt10, 1, paramArrayOfFloat4, i2 - 1 + paramInt10, 1);
        if ((paramFloat3 > 2.0F * paramInt1 * f4 ? 0 : 1) != 0) {
          localbooleanW.val = true;
        } else {
          localbooleanW.val = false;
        }
        Sstemr.sstemr(paramString1, "A", paramInt1, paramArrayOfFloat4, i2 - 1 + paramInt10, paramArrayOfFloat4, i4 - 1 + paramInt10, paramFloat1, paramFloat2, paramInt4, paramInt5, paramintW1, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt8, paramInt1, paramArrayOfInt1, paramInt9, localbooleanW, paramArrayOfFloat4, i10 - 1 + paramInt10, paramInt11, paramArrayOfInt2, paramInt12, paramInt13, paramintW2);
        if (bool5) {}
        if (((paramintW2.val != 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          i11 = i3;
          i17 = paramInt11 - i11 + 1;
          Sormtr.sormtr("L", paramString3, "N", paramInt1, paramintW1.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat4, i9 - 1 + paramInt10, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat4, i11 - 1 + paramInt10, i17, localintW1);
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
      Sstebz.sstebz(paramString2, str, paramInt1, f11, f12, paramInt4, paramInt5, f1, paramArrayOfFloat4, i1 - 1 + paramInt10, paramArrayOfFloat4, i3 - 1 + paramInt10, paramintW1, localintW2, paramArrayOfFloat2, paramInt6, paramArrayOfInt2, i5 - 1 + paramInt12, paramArrayOfInt2, i7 - 1 + paramInt12, paramArrayOfFloat4, i10 - 1 + paramInt10, paramArrayOfInt2, i8 - 1 + paramInt12, paramintW2);
      if (bool5)
      {
        Sstein.sstein(paramInt1, paramArrayOfFloat4, i1 - 1 + paramInt10, paramArrayOfFloat4, i3 - 1 + paramInt10, paramintW1.val, paramArrayOfFloat2, paramInt6, paramArrayOfInt2, i5 - 1 + paramInt12, paramArrayOfInt2, i7 - 1 + paramInt12, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat4, i10 - 1 + paramInt10, paramArrayOfInt2, i8 - 1 + paramInt12, paramArrayOfInt2, i6 - 1 + paramInt12, paramintW2);
        i11 = i3;
        i17 = paramInt11 - i11 + 1;
        Sormtr.sormtr("L", paramString3, "N", paramInt1, paramintW1.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat4, i9 - 1 + paramInt10, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat4, i11 - 1 + paramInt10, i17, localintW1);
      }
    }
    if ((i12 != 1 ? 0 : 1) != 0)
    {
      if ((paramintW2.val != 0 ? 0 : 1) != 0) {
        n = paramintW1.val;
      } else {
        n = paramintW2.val - 1;
      }
      Sscal.sscal(n, 1.0F / f8, paramArrayOfFloat2, paramInt6, 1);
    }
    if (bool5)
    {
      i13 = 1;
      for (i21 = paramintW1.val - 1 - 1 + 1; i21 > 0; i21--)
      {
        k = 0;
        f10 = paramArrayOfFloat2[(i13 - 1 + paramInt6)];
        i14 = i13 + 1;
        for (int i22 = paramintW1.val - (i13 + 1) + 1; i22 > 0; i22--)
        {
          if ((paramArrayOfFloat2[(i14 - 1 + paramInt6)] >= f10 ? 0 : 1) != 0)
          {
            k = i14;
            f10 = paramArrayOfFloat2[(i14 - 1 + paramInt6)];
          }
          i14 += 1;
        }
        if ((k == 0 ? 0 : 1) != 0)
        {
          paramArrayOfFloat2[(k - 1 + paramInt6)] = paramArrayOfFloat2[(i13 - 1 + paramInt6)];
          paramArrayOfFloat2[(i13 - 1 + paramInt6)] = f10;
          Sswap.sswap(paramInt1, paramArrayOfFloat3, 1 - 1 + (k - 1) * paramInt8 + paramInt7, 1, paramArrayOfFloat3, 1 - 1 + (i13 - 1) * paramInt8 + paramInt7, 1);
        }
        i13 += 1;
      }
    }
    paramArrayOfFloat4[(1 - 1 + paramInt10)] = i18;
    paramArrayOfInt2[(1 - 1 + paramInt12)] = i15;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssyevr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */