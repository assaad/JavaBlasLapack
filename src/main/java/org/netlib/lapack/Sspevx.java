package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sspevx
{
  public static void sspevx(String paramString1, String paramString2, String paramString3, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, intW paramintW1, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int[] paramArrayOfInt1, int paramInt9, int[] paramArrayOfInt2, int paramInt10, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    boolean bool3 = false;
    boolean bool4 = false;
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
    int i10 = 0;
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
    bool4 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "A");
    bool3 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
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
      else if ((((!Lsame.lsame(paramString3, "L")) && (!Lsame.lsame(paramString3, "U")) ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -3;
      }
      else if ((paramInt1 >= 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -4;
      }
      else if (bool3)
      {
        if ((paramInt1 <= 0 ? 0 : 1) != 0) {}
        if (((paramFloat2 > paramFloat1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -7;
        }
      }
      else if (bool2)
      {
        if ((paramInt3 >= 1 ? 0 : 1) == 0) {}
        if (((paramInt3 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -8;
        }
        else
        {
          if ((paramInt4 >= Math.min(paramInt1, paramInt3) ? 0 : 1) == 0) {}
          if (((paramInt4 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramintW2.val = -9;
          }
        }
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt7 >= 1 ? 0 : 1) == 0) {
        if (!bool4) {}
      }
      if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -14;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSPEVX", -paramintW2.val);
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
        paramArrayOfFloat2[(1 - 1 + paramInt5)] = paramArrayOfFloat1[(1 - 1 + paramInt2)];
      }
      else
      {
        if ((paramFloat1 >= paramArrayOfFloat1[(1 - 1 + paramInt2)] ? 0 : 1) != 0) {}
        if (((paramFloat2 < paramArrayOfFloat1[(1 - 1 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW1.val = 1;
          paramArrayOfFloat2[(1 - 1 + paramInt5)] = paramArrayOfFloat1[(1 - 1 + paramInt2)];
        }
      }
      if (bool4) {
        paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = 1.0F;
      }
      return;
    }
    f7 = Slamch.slamch("Safe minimum");
    f4 = Slamch.slamch("Precision");
    f9 = f7 / f4;
    f3 = 1.0F / f9;
    f6 = (float)Math.sqrt(f9);
    f5 = Math.min((float)Math.sqrt(f3), 1.0F / (float)Math.sqrt((float)Math.sqrt(f7)));
    i7 = 0;
    f1 = paramFloat3;
    if (bool3)
    {
      f11 = paramFloat1;
      f12 = paramFloat2;
    }
    else
    {
      f11 = 0.0F;
      f12 = 0.0F;
    }
    f2 = Slansp.slansp("M", paramString3, paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat4, paramInt8);
    if ((f2 <= 0.0F ? 0 : 1) != 0) {}
    if (((f2 >= f6 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i7 = 1;
      f8 = f6 / f2;
    }
    else if ((f2 <= f5 ? 0 : 1) != 0)
    {
      i7 = 1;
      f8 = f5 / f2;
    }
    if ((i7 != 1 ? 0 : 1) != 0)
    {
      Sscal.sscal(paramInt1 * (paramInt1 + 1) / 2, f8, paramArrayOfFloat1, paramInt2, 1);
      if ((paramFloat3 <= 0 ? 0 : 1) != 0) {
        f1 = paramFloat3 * f8;
      }
      if (bool3)
      {
        f11 = paramFloat1 * f8;
        f12 = paramFloat2 * f8;
      }
    }
    i5 = 1;
    n = i5 + paramInt1;
    m = n + paramInt1;
    i6 = m + paramInt1;
    Ssptrd.ssptrd(paramString3, paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat4, m - 1 + paramInt8, paramArrayOfFloat4, n - 1 + paramInt8, paramArrayOfFloat4, i5 - 1 + paramInt8, localintW1);
    i = 0;
    if (bool2)
    {
      if ((paramInt3 != 1 ? 0 : 1) != 0) {}
      if (((paramInt4 != paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        i = 1;
      }
    }
    if (((!bool1) && (i == 0) ? 0 : 1) != 0) {}
    int i11;
    if (((paramFloat3 > 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat4, m - 1 + paramInt8, 1, paramArrayOfFloat2, paramInt5, 1);
      i1 = i6 + 2 * paramInt1;
      if ((bool4 ^ true))
      {
        Scopy.scopy(paramInt1 - 1, paramArrayOfFloat4, n - 1 + paramInt8, 1, paramArrayOfFloat4, i1 - 1 + paramInt8, 1);
        Ssterf.ssterf(paramInt1, paramArrayOfFloat2, paramInt5, paramArrayOfFloat4, i1 - 1 + paramInt8, paramintW2);
      }
      else
      {
        Sopgtr.sopgtr(paramString3, paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat4, i5 - 1 + paramInt8, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, i6 - 1 + paramInt8, localintW1);
        Scopy.scopy(paramInt1 - 1, paramArrayOfFloat4, n - 1 + paramInt8, 1, paramArrayOfFloat4, i1 - 1 + paramInt8, 1);
        Ssteqr.ssteqr(paramString1, paramInt1, paramArrayOfFloat2, paramInt5, paramArrayOfFloat4, i1 - 1 + paramInt8, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, i6 - 1 + paramInt8, paramintW2);
        if ((paramintW2.val != 0 ? 0 : 1) != 0)
        {
          j = 1;
          for (i11 = paramInt1 - 1 + 1; i11 > 0; i11--)
          {
            paramArrayOfInt2[(j - 1 + paramInt10)] = 0;
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
      if (bool4) {
        str = "B";
      } else {
        str = "E";
      }
      i2 = 1;
      i3 = i2 + paramInt1;
      i4 = i3 + paramInt1;
      Sstebz.sstebz(paramString2, str, paramInt1, f11, f12, paramInt3, paramInt4, f1, paramArrayOfFloat4, m - 1 + paramInt8, paramArrayOfFloat4, n - 1 + paramInt8, paramintW1, localintW2, paramArrayOfFloat2, paramInt5, paramArrayOfInt1, i2 - 1 + paramInt9, paramArrayOfInt1, i3 - 1 + paramInt9, paramArrayOfFloat4, i6 - 1 + paramInt8, paramArrayOfInt1, i4 - 1 + paramInt9, paramintW2);
      if (bool4)
      {
        Sstein.sstein(paramInt1, paramArrayOfFloat4, m - 1 + paramInt8, paramArrayOfFloat4, n - 1 + paramInt8, paramintW1.val, paramArrayOfFloat2, paramInt5, paramArrayOfInt1, i2 - 1 + paramInt9, paramArrayOfInt1, i3 - 1 + paramInt9, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, i6 - 1 + paramInt8, paramArrayOfInt1, i4 - 1 + paramInt9, paramArrayOfInt2, paramInt10, paramintW2);
        Sopmtr.sopmtr("L", paramString3, "N", paramInt1, paramintW1.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat4, i5 - 1 + paramInt8, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, i6 - 1 + paramInt8, paramintW2);
      }
    }
    if ((i7 != 1 ? 0 : 1) != 0)
    {
      if ((paramintW2.val != 0 ? 0 : 1) != 0) {
        k = paramintW1.val;
      } else {
        k = paramintW2.val - 1;
      }
      Sscal.sscal(k, 1.0F / f8, paramArrayOfFloat2, paramInt5, 1);
    }
    if (bool4)
    {
      i9 = 1;
      for (i11 = paramintW1.val - 1 - 1 + 1; i11 > 0; i11--)
      {
        j = 0;
        f10 = paramArrayOfFloat2[(i9 - 1 + paramInt5)];
        i10 = i9 + 1;
        for (int i12 = paramintW1.val - (i9 + 1) + 1; i12 > 0; i12--)
        {
          if ((paramArrayOfFloat2[(i10 - 1 + paramInt5)] >= f10 ? 0 : 1) != 0)
          {
            j = i10;
            f10 = paramArrayOfFloat2[(i10 - 1 + paramInt5)];
          }
          i10 += 1;
        }
        if ((j == 0 ? 0 : 1) != 0)
        {
          i8 = paramArrayOfInt1[(i2 + j - 1 - 1 + paramInt9)];
          paramArrayOfFloat2[(j - 1 + paramInt5)] = paramArrayOfFloat2[(i9 - 1 + paramInt5)];
          paramArrayOfInt1[(i2 + j - 1 - 1 + paramInt9)] = paramArrayOfInt1[(i2 + i9 - 1 - 1 + paramInt9)];
          paramArrayOfFloat2[(i9 - 1 + paramInt5)] = f10;
          paramArrayOfInt1[(i2 + i9 - 1 - 1 + paramInt9)] = i8;
          Sswap.sswap(paramInt1, paramArrayOfFloat3, 1 - 1 + (j - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat3, 1 - 1 + (i9 - 1) * paramInt7 + paramInt6, 1);
          if ((paramintW2.val == 0 ? 0 : 1) != 0)
          {
            i8 = paramArrayOfInt2[(j - 1 + paramInt10)];
            paramArrayOfInt2[(j - 1 + paramInt10)] = paramArrayOfInt2[(i9 - 1 + paramInt10)];
            paramArrayOfInt2[(i9 - 1 + paramInt10)] = i8;
          }
        }
        i9 += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sspevx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */