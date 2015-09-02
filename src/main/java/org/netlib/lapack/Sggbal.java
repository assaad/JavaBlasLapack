package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Saxpy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Sggbal
{
  public static void sggbal(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, intW paramintW3)
  {
    int i = 0;
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
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
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
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    paramintW3.val = 0;
    if ((((Lsame.lsame(paramString, "N") ^ true)) && ((Lsame.lsame(paramString, "P") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "S") ^ true) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "B") ^ true) ? 1 : 0) != 0) {
      paramintW3.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW3.val = -2;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW3.val = -4;
    } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW3.val = -6;
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGGBAL", -paramintW3.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramintW1.val = 1;
      paramintW2.val = paramInt1;
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramintW1.val = 1;
      paramintW2.val = paramInt1;
      paramArrayOfFloat3[(1 - 1 + paramInt6)] = 1.0F;
      paramArrayOfFloat4[(1 - 1 + paramInt7)] = 1.0F;
      return;
    }
    if (Lsame.lsame(paramString, "N"))
    {
      paramintW1.val = 1;
      paramintW2.val = paramInt1;
      i = 1;
      for (i17 = paramInt1 - 1 + 1; i17 > 0; i17--)
      {
        paramArrayOfFloat3[(i - 1 + paramInt6)] = 1.0F;
        paramArrayOfFloat4[(i - 1 + paramInt7)] = 1.0F;
        i += 1;
      }
      return;
    }
    i6 = 1;
    i8 = paramInt1;
    label525:
    int i18;
    if (!Lsame.lsame(paramString, "S"))
    {
      break label525;
      i8 = i10;
      if ((i8 == 1 ? 0 : 1) == 0)
      {
        paramArrayOfFloat4[(1 - 1 + paramInt7)] = 1.0F;
        paramArrayOfFloat3[(1 - 1 + paramInt6)] = 1.0F;
      }
      else
      {
        i10 = i8 - 1;
        i = i8;
        i17 = (1 - i8 + -1) / -1;
        for (;;)
        {
          i3 = 1;
          for (i18 = i10 - 1 + 1; i18 > 0; i18--)
          {
            i5 = i3 + 1;
            if ((paramArrayOfFloat1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) == 0) {}
            if (((paramArrayOfFloat2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
              break;
            }
            i3 += 1;
          }
          i3 = i8;
          break label767;
          i3 = i5;
          for (i18 = i8 - i5 + 1; i18 > 0; i18--)
          {
            if ((paramArrayOfFloat1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) == 0) {}
            if (((paramArrayOfFloat2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
              break;
            }
            i3 += 1;
          }
          i3 = i5 - 1;
          label767:
          i14 = i8;
          k = 1;
          break label1064;
          i += -1;
          i17--;
          if (i17 <= 0) {
            break;
          }
        }
        label1037:
        label1064:
        do
        {
          i6 += 1;
          i3 = i6;
          for (i17 = i8 - i6 + 1; i17 > 0; i17--)
          {
            i = i6;
            for (i18 = i10 - i6 + 1; i18 > 0; i18--)
            {
              m = i + 1;
              if ((paramArrayOfFloat1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) == 0) {}
              if (((paramArrayOfFloat2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
                break;
              }
              i += 1;
            }
            i = i8;
            break label1037;
            i = m;
            for (i18 = i8 - m + 1; i18 > 0; i18--)
            {
              if ((paramArrayOfFloat1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) == 0) {}
              if (((paramArrayOfFloat2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
                break;
              }
              i += 1;
            }
            i = m - 1;
            i14 = i6;
            k = 2;
            break;
            i3 += 1;
          }
          break label1312;
          paramArrayOfFloat3[(i14 - 1 + paramInt6)] = i;
          if ((i != i14 ? 0 : 1) == 0)
          {
            Sswap.sswap(paramInt1 - i6 + 1, paramArrayOfFloat1, i - 1 + (i6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat1, i14 - 1 + (i6 - 1) * paramInt3 + paramInt2, paramInt3);
            Sswap.sswap(paramInt1 - i6 + 1, paramArrayOfFloat2, i - 1 + (i6 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, i14 - 1 + (i6 - 1) * paramInt5 + paramInt4, paramInt5);
          }
          paramArrayOfFloat4[(i14 - 1 + paramInt7)] = i3;
          if ((i3 != i14 ? 0 : 1) == 0)
          {
            Sswap.sswap(i8, paramArrayOfFloat1, 1 - 1 + (i3 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, 1 - 1 + (i14 - 1) * paramInt3 + paramInt2, 1);
            Sswap.sswap(i8, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, 1 - 1 + (i14 - 1) * paramInt5 + paramInt4, 1);
          }
          i17 = k;
          if (i17 == 1) {
            break;
          }
        } while (i17 == 2);
      }
    }
    label1312:
    paramintW1.val = i6;
    paramintW2.val = i8;
    if (Lsame.lsame(paramString, "P"))
    {
      i = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        paramArrayOfFloat3[(i - 1 + paramInt6)] = 1.0F;
        paramArrayOfFloat4[(i - 1 + paramInt7)] = 1.0F;
        i += 1;
      }
      return;
    }
    if ((paramintW1.val != paramintW2.val ? 0 : 1) != 0) {
      return;
    }
    i15 = paramintW2.val - paramintW1.val + 1;
    i = paramintW1.val;
    for (int i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
    {
      paramArrayOfFloat4[(i - 1 + paramInt7)] = 0.0F;
      paramArrayOfFloat3[(i - 1 + paramInt6)] = 0.0F;
      paramArrayOfFloat5[(i - 1 + paramInt8)] = 0.0F;
      paramArrayOfFloat5[(i + paramInt1 - 1 + paramInt8)] = 0.0F;
      paramArrayOfFloat5[(i + 2 * paramInt1 - 1 + paramInt8)] = 0.0F;
      paramArrayOfFloat5[(i + 3 * paramInt1 - 1 + paramInt8)] = 0.0F;
      paramArrayOfFloat5[(i + 4 * paramInt1 - 1 + paramInt8)] = 0.0F;
      paramArrayOfFloat5[(i + 5 * paramInt1 - 1 + paramInt8)] = 0.0F;
      i += 1;
    }
    f2 = (float)Util.log10(10.0F);
    i = paramintW1.val;
    for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
    {
      i3 = paramintW1.val;
      for (i18 = paramintW2.val - paramintW1.val + 1; i18 > 0; i18--)
      {
        f20 = paramArrayOfFloat2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)];
        f19 = paramArrayOfFloat1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)];
        if ((f19 != 0.0F ? 0 : 1) == 0) {
          f19 = (float)Util.log10(Math.abs(f19)) / f2;
        }
        if ((f20 != 0.0F ? 0 : 1) == 0) {
          f20 = (float)Util.log10(Math.abs(f20)) / f2;
        }
        paramArrayOfFloat5[(i + 4 * paramInt1 - 1 + paramInt8)] = (paramArrayOfFloat5[(i + 4 * paramInt1 - 1 + paramInt8)] - f19 - f20);
        paramArrayOfFloat5[(i3 + 5 * paramInt1 - 1 + paramInt8)] = (paramArrayOfFloat5[(i3 + 5 * paramInt1 - 1 + paramInt8)] - f19 - f20);
        i3 += 1;
      }
      i += 1;
    }
    f6 = 1.0F / (2 * i15);
    f7 = f6 * f6;
    f8 = 0.5F * f7;
    i16 = i15 + 2;
    f3 = 0.0F;
    i2 = 1;
    do
    {
      f12 = Sdot.sdot(i15, paramArrayOfFloat5, paramintW1.val + 4 * paramInt1 - 1 + paramInt8, 1, paramArrayOfFloat5, paramintW1.val + 4 * paramInt1 - 1 + paramInt8, 1) + Sdot.sdot(i15, paramArrayOfFloat5, paramintW1.val + 5 * paramInt1 - 1 + paramInt8, 1, paramArrayOfFloat5, paramintW1.val + 5 * paramInt1 - 1 + paramInt8, 1);
      f10 = 0.0F;
      f11 = 0.0F;
      i = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        f10 += paramArrayOfFloat5[(i + 4 * paramInt1 - 1 + paramInt8)];
        f11 += paramArrayOfFloat5[(i + 5 * paramInt1 - 1 + paramInt8)];
        i += 1;
      }
      f12 = f6 * f12 - f7 * ((float)Math.pow(f10, 2) + (float)Math.pow(f11, 2)) - f8 * (float)Math.pow(f10 - f11, 2);
      if ((f12 != 0.0F ? 0 : 1) != 0) {
        break;
      }
      if ((i2 == 1 ? 0 : 1) != 0) {
        f3 = f12 / f13;
      }
      f18 = f8 * (f11 - 3.0F * f10);
      f21 = f8 * (f10 - 3.0F * f11);
      Sscal.sscal(i15, f3, paramArrayOfFloat5, paramintW1.val - 1 + paramInt8, 1);
      Sscal.sscal(i15, f3, paramArrayOfFloat5, paramintW1.val + paramInt1 - 1 + paramInt8, 1);
      Saxpy.saxpy(i15, f6, paramArrayOfFloat5, paramintW1.val + 4 * paramInt1 - 1 + paramInt8, 1, paramArrayOfFloat5, paramintW1.val + paramInt1 - 1 + paramInt8, 1);
      Saxpy.saxpy(i15, f6, paramArrayOfFloat5, paramintW1.val + 5 * paramInt1 - 1 + paramInt8, 1, paramArrayOfFloat5, paramintW1.val - 1 + paramInt8, 1);
      i = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        paramArrayOfFloat5[(i - 1 + paramInt8)] += f21;
        paramArrayOfFloat5[(i + paramInt1 - 1 + paramInt8)] += f18;
        i += 1;
      }
      i = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        i7 = 0;
        f17 = 0.0F;
        i3 = paramintW1.val;
        for (i18 = paramintW2.val - paramintW1.val + 1; i18 > 0; i18--)
        {
          if ((paramArrayOfFloat1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) == 0)
          {
            i7 += 1;
            f17 += paramArrayOfFloat5[(i3 - 1 + paramInt8)];
          }
          if ((paramArrayOfFloat2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] != 0.0F ? 0 : 1) == 0)
          {
            i7 += 1;
            f17 += paramArrayOfFloat5[(i3 - 1 + paramInt8)];
          }
          i3 += 1;
        }
        paramArrayOfFloat5[(i + 2 * paramInt1 - 1 + paramInt8)] = (i7 * paramArrayOfFloat5[(i + paramInt1 - 1 + paramInt8)] + f17);
        i += 1;
      }
      i3 = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        i7 = 0;
        f17 = 0.0F;
        i = paramintW1.val;
        for (i18 = paramintW2.val - paramintW1.val + 1; i18 > 0; i18--)
        {
          if ((paramArrayOfFloat1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) == 0)
          {
            i7 += 1;
            f17 += paramArrayOfFloat5[(i + paramInt1 - 1 + paramInt8)];
          }
          if ((paramArrayOfFloat2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] != 0.0F ? 0 : 1) == 0)
          {
            i7 += 1;
            f17 += paramArrayOfFloat5[(i + paramInt1 - 1 + paramInt8)];
          }
          i += 1;
        }
        paramArrayOfFloat5[(i3 + 3 * paramInt1 - 1 + paramInt8)] = (i7 * paramArrayOfFloat5[(i3 - 1 + paramInt8)] + f17);
        i3 += 1;
      }
      f17 = Sdot.sdot(i15, paramArrayOfFloat5, paramintW1.val + paramInt1 - 1 + paramInt8, 1, paramArrayOfFloat5, paramintW1.val + 2 * paramInt1 - 1 + paramInt8, 1) + Sdot.sdot(i15, paramArrayOfFloat5, paramintW1.val - 1 + paramInt8, 1, paramArrayOfFloat5, paramintW1.val + 3 * paramInt1 - 1 + paramInt8, 1);
      f1 = f12 / f17;
      f5 = 0.0F;
      i = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        f9 = f1 * paramArrayOfFloat5[(i + paramInt1 - 1 + paramInt8)];
        if ((Math.abs(f9) <= f5 ? 0 : 1) != 0) {
          f5 = Math.abs(f9);
        }
        paramArrayOfFloat3[(i - 1 + paramInt6)] += f9;
        f9 = f1 * paramArrayOfFloat5[(i - 1 + paramInt8)];
        if ((Math.abs(f9) <= f5 ? 0 : 1) != 0) {
          f5 = Math.abs(f9);
        }
        paramArrayOfFloat4[(i - 1 + paramInt7)] += f9;
        i += 1;
      }
      if ((f5 >= 0.5F ? 0 : 1) != 0) {
        break;
      }
      Saxpy.saxpy(i15, -f1, paramArrayOfFloat5, paramintW1.val + 2 * paramInt1 - 1 + paramInt8, 1, paramArrayOfFloat5, paramintW1.val + 4 * paramInt1 - 1 + paramInt8, 1);
      Saxpy.saxpy(i15, -f1, paramArrayOfFloat5, paramintW1.val + 3 * paramInt1 - 1 + paramInt8, 1, paramArrayOfFloat5, paramintW1.val + 5 * paramInt1 - 1 + paramInt8, 1);
      f13 = f12;
      i2 += 1;
    } while ((i2 > i16 ? 0 : 1) != 0);
    f16 = Slamch.slamch("S");
    f15 = 1.0F / f16;
    i13 = (int)((float)Util.log10(f16) / f2 + 1.0F);
    i12 = (int)((float)Util.log10(f15) / f2);
    i = paramintW1.val;
    for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
    {
      i1 = Isamax.isamax(paramInt1 - paramintW1.val + 1, paramArrayOfFloat1, i - 1 + (paramintW1.val - 1) * paramInt3 + paramInt2, paramInt3);
      f14 = Math.abs(paramArrayOfFloat1[(i - 1 + (i1 + paramintW1.val - 1 - 1) * paramInt3 + paramInt2)]);
      i1 = Isamax.isamax(paramInt1 - paramintW1.val + 1, paramArrayOfFloat2, i - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5);
      f14 = Math.max(f14, Math.abs(paramArrayOfFloat2[(i - 1 + (i1 + paramintW1.val - 1 - 1) * paramInt5 + paramInt4)]));
      i11 = (int)((float)Util.log10(f14 + f16) / f2 + 1.0F);
      n = (int)(paramArrayOfFloat3[(i - 1 + paramInt6)] + Util.sign(0.5F, paramArrayOfFloat3[(i - 1 + paramInt6)]));
      n = Util.min(Math.max(n, i13), i12, i12 - i11);
      paramArrayOfFloat3[(i - 1 + paramInt6)] = ((float)Math.pow(10.0F, n));
      j = Isamax.isamax(paramintW2.val, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
      f4 = Math.abs(paramArrayOfFloat1[(j - 1 + (i - 1) * paramInt3 + paramInt2)]);
      j = Isamax.isamax(paramintW2.val, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
      f4 = Math.max(f4, Math.abs(paramArrayOfFloat2[(j - 1 + (i - 1) * paramInt5 + paramInt4)]));
      i9 = (int)((float)Util.log10(f4 + f16) / f2 + 1.0F);
      i4 = (int)(paramArrayOfFloat4[(i - 1 + paramInt7)] + Util.sign(0.5F, paramArrayOfFloat4[(i - 1 + paramInt7)]));
      i4 = Util.min(Math.max(i4, i13), i12, i12 - i9);
      paramArrayOfFloat4[(i - 1 + paramInt7)] = ((float)Math.pow(10.0F, i4));
      i += 1;
    }
    i = paramintW1.val;
    for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
    {
      Sscal.sscal(paramInt1 - paramintW1.val + 1, paramArrayOfFloat3[(i - 1 + paramInt6)], paramArrayOfFloat1, i - 1 + (paramintW1.val - 1) * paramInt3 + paramInt2, paramInt3);
      Sscal.sscal(paramInt1 - paramintW1.val + 1, paramArrayOfFloat3[(i - 1 + paramInt6)], paramArrayOfFloat2, i - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5);
      i += 1;
    }
    i3 = paramintW1.val;
    for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
    {
      Sscal.sscal(paramintW2.val, paramArrayOfFloat4[(i3 - 1 + paramInt7)], paramArrayOfFloat1, 1 - 1 + (i3 - 1) * paramInt3 + paramInt2, 1);
      Sscal.sscal(paramintW2.val, paramArrayOfFloat4[(i3 - 1 + paramInt7)], paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1);
      i3 += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sggbal.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */