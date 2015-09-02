package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssbevx
{
  public static void ssbevx(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float paramFloat1, float paramFloat2, int paramInt7, int paramInt8, float paramFloat3, intW paramintW1, float[] paramArrayOfFloat3, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, int[] paramArrayOfInt1, int paramInt13, int[] paramArrayOfInt2, int paramInt14, intW paramintW2)
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
          if (((paramFloat2 > paramFloat1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
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
      Xerbla.xerbla("SSBEVX", -paramintW2.val);
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
        f10 = paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
      } else {
        f10 = paramArrayOfFloat1[(paramInt2 + 1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
      }
      if (bool4)
      {
        if ((paramFloat1 >= f10 ? 0 : 1) != 0) {}
        if ((((paramFloat2 < f10 ? 0 : 1) != 0 ? 1 : 0) ^ 0x1) != 0) {
          paramintW1.val = 0;
        }
      }
      if ((paramintW1.val != 1 ? 0 : 1) != 0)
      {
        paramArrayOfFloat3[(1 - 1 + paramInt9)] = f10;
        if (bool5) {
          paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt11 + paramInt10)] = 1.0F;
        }
      }
      return;
    }
    f7 = Slamch.slamch("Safe minimum");
    f4 = Slamch.slamch("Precision");
    f9 = f7 / f4;
    f3 = 1.0F / f9;
    f6 = (float)Math.sqrt(f9);
    f5 = Math.min((float)Math.sqrt(f3), 1.0F / (float)Math.sqrt((float)Math.sqrt(f7)));
    i6 = 0;
    f1 = paramFloat3;
    if (bool4)
    {
      f11 = paramFloat1;
      f12 = paramFloat2;
    }
    else
    {
      f11 = 0.0F;
      f12 = 0.0F;
    }
    f2 = Slansb.slansb("M", paramString3, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, paramInt12);
    if ((f2 <= 0.0F ? 0 : 1) != 0) {}
    if (((f2 >= f6 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i6 = 1;
      f8 = f6 / f2;
    }
    else if ((f2 <= f5 ? 0 : 1) != 0)
    {
      i6 = 1;
      f8 = f5 / f2;
    }
    if ((i6 != 1 ? 0 : 1) != 0)
    {
      if (bool3) {
        Slascl.slascl("B", paramInt2, paramInt2, 1.0F, f8, paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramintW2);
      } else {
        Slascl.slascl("Q", paramInt2, paramInt2, 1.0F, f8, paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramintW2);
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
    m = 1;
    n = m + paramInt1;
    i5 = n + paramInt1;
    Ssbtrd.ssbtrd(paramString1, paramString3, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, m - 1 + paramInt12, paramArrayOfFloat5, n - 1 + paramInt12, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat5, i5 - 1 + paramInt12, localintW1);
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
    if (((paramFloat3 > 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat5, m - 1 + paramInt12, 1, paramArrayOfFloat3, paramInt9, 1);
      i1 = i5 + 2 * paramInt1;
      if ((bool5 ^ true))
      {
        Scopy.scopy(paramInt1 - 1, paramArrayOfFloat5, n - 1 + paramInt12, 1, paramArrayOfFloat5, i1 - 1 + paramInt12, 1);
        Ssterf.ssterf(paramInt1, paramArrayOfFloat3, paramInt9, paramArrayOfFloat5, i1 - 1 + paramInt12, paramintW2);
      }
      else
      {
        Slacpy.slacpy("A", paramInt1, paramInt1, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat4, paramInt10, paramInt11);
        Scopy.scopy(paramInt1 - 1, paramArrayOfFloat5, n - 1 + paramInt12, 1, paramArrayOfFloat5, i1 - 1 + paramInt12, 1);
        Ssteqr.ssteqr(paramString1, paramInt1, paramArrayOfFloat3, paramInt9, paramArrayOfFloat5, i1 - 1 + paramInt12, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat5, i5 - 1 + paramInt12, paramintW2);
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
      Sstebz.sstebz(paramString2, str, paramInt1, f11, f12, paramInt7, paramInt8, f1, paramArrayOfFloat5, m - 1 + paramInt12, paramArrayOfFloat5, n - 1 + paramInt12, paramintW1, localintW2, paramArrayOfFloat3, paramInt9, paramArrayOfInt1, i2 - 1 + paramInt13, paramArrayOfInt1, i3 - 1 + paramInt13, paramArrayOfFloat5, i5 - 1 + paramInt12, paramArrayOfInt1, i4 - 1 + paramInt13, paramintW2);
      if (bool5)
      {
        Sstein.sstein(paramInt1, paramArrayOfFloat5, m - 1 + paramInt12, paramArrayOfFloat5, n - 1 + paramInt12, paramintW1.val, paramArrayOfFloat3, paramInt9, paramArrayOfInt1, i2 - 1 + paramInt13, paramArrayOfInt1, i3 - 1 + paramInt13, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat5, i5 - 1 + paramInt12, paramArrayOfInt1, i4 - 1 + paramInt13, paramArrayOfInt2, paramInt14, paramintW2);
        i8 = 1;
        for (i10 = paramintW1.val - 1 + 1; i10 > 0; i10--)
        {
          Scopy.scopy(paramInt1, paramArrayOfFloat4, 1 - 1 + (i8 - 1) * paramInt11 + paramInt10, 1, paramArrayOfFloat5, 1 - 1 + paramInt12, 1);
          Sgemv.sgemv("N", paramInt1, paramInt1, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat5, paramInt12, 1, 0.0F, paramArrayOfFloat4, 1 - 1 + (i8 - 1) * paramInt11 + paramInt10, 1);
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
      Sscal.sscal(k, 1.0F / f8, paramArrayOfFloat3, paramInt9, 1);
    }
    if (bool5)
    {
      i8 = 1;
      for (i10 = paramintW1.val - 1 - 1 + 1; i10 > 0; i10--)
      {
        j = 0;
        f10 = paramArrayOfFloat3[(i8 - 1 + paramInt9)];
        i9 = i8 + 1;
        for (int i11 = paramintW1.val - (i8 + 1) + 1; i11 > 0; i11--)
        {
          if ((paramArrayOfFloat3[(i9 - 1 + paramInt9)] >= f10 ? 0 : 1) != 0)
          {
            j = i9;
            f10 = paramArrayOfFloat3[(i9 - 1 + paramInt9)];
          }
          i9 += 1;
        }
        if ((j == 0 ? 0 : 1) != 0)
        {
          i7 = paramArrayOfInt1[(i2 + j - 1 - 1 + paramInt13)];
          paramArrayOfFloat3[(j - 1 + paramInt9)] = paramArrayOfFloat3[(i8 - 1 + paramInt9)];
          paramArrayOfInt1[(i2 + j - 1 - 1 + paramInt13)] = paramArrayOfInt1[(i2 + i8 - 1 - 1 + paramInt13)];
          paramArrayOfFloat3[(i8 - 1 + paramInt9)] = f10;
          paramArrayOfInt1[(i2 + i8 - 1 - 1 + paramInt13)] = i7;
          Sswap.sswap(paramInt1, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1, paramArrayOfFloat4, 1 - 1 + (i8 - 1) * paramInt11 + paramInt10, 1);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssbevx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */