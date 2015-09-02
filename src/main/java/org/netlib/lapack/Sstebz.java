package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sstebz
{
  public static void sstebz(String paramString1, String paramString2, int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, float paramFloat3, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat3, int paramInt6, int[] paramArrayOfInt1, int paramInt7, int[] paramArrayOfInt2, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, int[] paramArrayOfInt3, int paramInt10, intW paramintW3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    intW localintW3 = new intW(0);
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
    int[] arrayOfInt = new int[1];
    paramintW3.val = 0;
    if (Lsame.lsame(paramString1, "A")) {
      i7 = 1;
    } else if (Lsame.lsame(paramString1, "V")) {
      i7 = 2;
    } else if (Lsame.lsame(paramString1, "I")) {
      i7 = 3;
    } else {
      i7 = 0;
    }
    if (Lsame.lsame(paramString2, "B")) {
      i6 = 2;
    } else if (Lsame.lsame(paramString2, "E")) {
      i6 = 1;
    } else {
      i6 = 0;
    }
    if ((i7 > 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((i6 > 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -3;
    }
    else if ((i7 != 2 ? 0 : 1) != 0)
    {
      if ((paramFloat1 < paramFloat2 ? 0 : 1) != 0) {
        paramintW3.val = -5;
      }
    }
    else
    {
      if ((i7 != 3 ? 0 : 1) != 0) {
        if ((paramInt2 >= 1 ? 0 : 1) != 0) {}
      }
      if ((((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW3.val = -6;
      }
      else
      {
        if ((i7 != 3 ? 0 : 1) != 0) {
          if ((paramInt3 >= Math.min(paramInt1, paramInt2) ? 0 : 1) != 0) {}
        }
        if ((((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW3.val = -7;
        }
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSTEBZ", -paramintW3.val);
      return;
    }
    paramintW3.val = 0;
    i = 0;
    j = 0;
    paramintW1.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((i7 != 3 ? 0 : 1) != 0) {}
    if (((paramInt2 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
    if (((paramInt3 != paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      i7 = 1;
    }
    f7 = Slamch.slamch("S");
    f11 = Slamch.slamch("P");
    f6 = f11 * 2.0F;
    i16 = Ilaenv.ilaenv(1, "SSTEBZ", " ", paramInt1, -1, -1, -1);
    if ((i16 > 1 ? 0 : 1) != 0) {
      i16 = 0;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramintW2.val = 1;
      paramArrayOfInt2[(1 - 1 + paramInt8)] = 1;
      if ((i7 != 2 ? 0 : 1) != 0) {
        if ((paramFloat1 < paramArrayOfFloat1[(1 - 1 + paramInt4)] ? 0 : 1) != 0) {}
      }
      if ((((paramFloat2 >= paramArrayOfFloat1[(1 - 1 + paramInt4)] ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW1.val = 0;
      }
      else
      {
        paramArrayOfFloat3[(1 - 1 + paramInt6)] = paramArrayOfFloat1[(1 - 1 + paramInt4)];
        paramArrayOfInt1[(1 - 1 + paramInt7)] = 1;
        paramintW1.val = 1;
      }
      return;
    }
    paramintW2.val = 1;
    paramArrayOfFloat4[(paramInt1 - 1 + paramInt9)] = 0.0F;
    f5 = 1.0F;
    i12 = 2;
    for (int i19 = paramInt1 - 2 + 1; i19 > 0; i19--)
    {
      f8 = (float)Math.pow(paramArrayOfFloat2[(i12 - 1 - 1 + paramInt5)], 2);
      if ((Math.abs(paramArrayOfFloat1[(i12 - 1 + paramInt4)] * paramArrayOfFloat1[(i12 - 1 - 1 + paramInt4)]) * (float)Math.pow(f11, 2) + f7 <= f8 ? 0 : 1) != 0)
      {
        paramArrayOfInt2[(paramintW2.val - 1 + paramInt8)] = (i12 - 1);
        paramintW2.val += 1;
        paramArrayOfFloat4[(i12 - 1 - 1 + paramInt9)] = 0.0F;
      }
      else
      {
        paramArrayOfFloat4[(i12 - 1 - 1 + paramInt9)] = f8;
        f5 = Math.max(f5, f8);
      }
      i12 += 1;
    }
    paramArrayOfInt2[(paramintW2.val - 1 + paramInt8)] = paramInt1;
    f5 *= f7;
    if ((i7 != 3 ? 0 : 1) != 0)
    {
      f4 = paramArrayOfFloat1[(1 - 1 + paramInt4)];
      f3 = paramArrayOfFloat1[(1 - 1 + paramInt4)];
      f8 = 0.0F;
      i12 = 1;
      for (i19 = paramInt1 - 1 - 1 + 1; i19 > 0; i19--)
      {
        f9 = (float)Math.sqrt(paramArrayOfFloat4[(i12 - 1 + paramInt9)]);
        f4 = Math.max(f4, paramArrayOfFloat1[(i12 - 1 + paramInt4)] + f8 + f9);
        f3 = Math.min(f3, paramArrayOfFloat1[(i12 - 1 + paramInt4)] - f8 - f9);
        f8 = f9;
        i12 += 1;
      }
      f4 = Math.max(f4, paramArrayOfFloat1[(paramInt1 - 1 + paramInt4)] + f8);
      f3 = Math.min(f3, paramArrayOfFloat1[(paramInt1 - 1 + paramInt4)] - f8);
      f10 = Math.max(Math.abs(f3), Math.abs(f4));
      f3 = f3 - 2.1F * f10 * f11 * paramInt1 - 2.1F * 2.0F * f5;
      f4 = f4 + 2.1F * f10 * f11 * paramInt1 + 2.1F * f5;
      i8 = (int)(((float)Math.log(f10 + f5) - (float)Math.log(f5)) / (float)Math.log(2.0F)) + 2;
      if ((paramFloat3 > 0.0F ? 0 : 1) != 0) {
        f1 = f11 * f10;
      } else {
        f1 = paramFloat3;
      }
      paramArrayOfFloat4[(paramInt1 + 1 - 1 + paramInt9)] = f3;
      paramArrayOfFloat4[(paramInt1 + 2 - 1 + paramInt9)] = f3;
      paramArrayOfFloat4[(paramInt1 + 3 - 1 + paramInt9)] = f4;
      paramArrayOfFloat4[(paramInt1 + 4 - 1 + paramInt9)] = f4;
      paramArrayOfFloat4[(paramInt1 + 5 - 1 + paramInt9)] = f3;
      paramArrayOfFloat4[(paramInt1 + 6 - 1 + paramInt9)] = f4;
      paramArrayOfInt3[(1 - 1 + paramInt10)] = -1;
      paramArrayOfInt3[(2 - 1 + paramInt10)] = -1;
      paramArrayOfInt3[(3 - 1 + paramInt10)] = (paramInt1 + 1);
      paramArrayOfInt3[(4 - 1 + paramInt10)] = (paramInt1 + 1);
      paramArrayOfInt3[(5 - 1 + paramInt10)] = (paramInt2 - 1);
      paramArrayOfInt3[(6 - 1 + paramInt10)] = paramInt3;
      Slaebz.slaebz(3, i8, paramInt1, 2, 2, i16, f1, f6, f5, paramArrayOfFloat1, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat4, paramInt9, paramArrayOfInt3, 5 - 1 + paramInt10, paramArrayOfFloat4, paramInt1 + 1 - 1 + paramInt9, paramArrayOfFloat4, paramInt1 + 5 - 1 + paramInt9, localintW3, paramArrayOfInt3, paramInt10, paramArrayOfFloat3, paramInt6, paramArrayOfInt1, paramInt7, localintW1);
      if ((paramArrayOfInt3[(6 - 1 + paramInt10)] != paramInt3 ? 0 : 1) != 0)
      {
        f13 = paramArrayOfFloat4[(paramInt1 + 1 - 1 + paramInt9)];
        f14 = paramArrayOfFloat4[(paramInt1 + 3 - 1 + paramInt9)];
        i17 = paramArrayOfInt3[(1 - 1 + paramInt10)];
        f15 = paramArrayOfFloat4[(paramInt1 + 4 - 1 + paramInt9)];
        f16 = paramArrayOfFloat4[(paramInt1 + 2 - 1 + paramInt9)];
        i18 = paramArrayOfInt3[(4 - 1 + paramInt10)];
      }
      else
      {
        f13 = paramArrayOfFloat4[(paramInt1 + 2 - 1 + paramInt9)];
        f14 = paramArrayOfFloat4[(paramInt1 + 4 - 1 + paramInt9)];
        i17 = paramArrayOfInt3[(2 - 1 + paramInt10)];
        f15 = paramArrayOfFloat4[(paramInt1 + 3 - 1 + paramInt9)];
        f16 = paramArrayOfFloat4[(paramInt1 + 1 - 1 + paramInt9)];
        i18 = paramArrayOfInt3[(3 - 1 + paramInt10)];
      }
      if ((i17 >= 0 ? 0 : 1) == 0) {}
      if (((i17 < paramInt1 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((i18 >= 1 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((i18 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = 4;
        return;
      }
    }
    else
    {
      f10 = Math.max(Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt4)]) + Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt5)]), Math.abs(paramArrayOfFloat1[(paramInt1 - 1 + paramInt4)]) + Math.abs(paramArrayOfFloat2[(paramInt1 - 1 - 1 + paramInt5)]));
      i12 = 2;
      for (i19 = paramInt1 - 1 - 2 + 1; i19 > 0; i19--)
      {
        f10 = Math.max(f10, Math.abs(paramArrayOfFloat1[(i12 - 1 + paramInt4)]) + Math.abs(paramArrayOfFloat2[(i12 - 1 - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat2[(i12 - 1 + paramInt5)]));
        i12 += 1;
      }
      if ((paramFloat3 > 0.0F ? 0 : 1) != 0) {
        f1 = f11 * f10;
      } else {
        f1 = paramFloat3;
      }
      if ((i7 != 2 ? 0 : 1) != 0)
      {
        f13 = paramFloat1;
        f15 = paramFloat2;
      }
      else
      {
        f13 = 0.0F;
        f15 = 0.0F;
      }
    }
    paramintW1.val = 0;
    i3 = 0;
    paramintW3.val = 0;
    i17 = 0;
    i18 = 0;
    i13 = 1;
    int i20;
    for (i19 = paramintW2.val - 1 + 1; i19 > 0; i19--)
    {
      i5 = i3;
      m = i5 + 1;
      i3 = paramArrayOfInt2[(i13 - 1 + paramInt8)];
      i4 = i3 - i5;
      if ((i4 != 1 ? 0 : 1) != 0)
      {
        if ((i7 != 1 ? 0 : 1) == 0) {}
        if (((f13 < paramArrayOfFloat1[(m - 1 + paramInt4)] - f5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          i17 += 1;
        }
        if ((i7 != 1 ? 0 : 1) == 0) {}
        if (((f15 < paramArrayOfFloat1[(m - 1 + paramInt4)] - f5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          i18 += 1;
        }
        if ((i7 != 1 ? 0 : 1) == 0) {
          if ((f13 >= paramArrayOfFloat1[(m - 1 + paramInt4)] - f5 ? 0 : 1) == 0) {}
        }
        if ((((f15 < paramArrayOfFloat1[(m - 1 + paramInt4)] - f5 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW1.val += 1;
          paramArrayOfFloat3[(paramintW1.val - 1 + paramInt6)] = paramArrayOfFloat1[(m - 1 + paramInt4)];
          paramArrayOfInt1[(paramintW1.val - 1 + paramInt7)] = i13;
        }
      }
      else
      {
        f4 = paramArrayOfFloat1[(m - 1 + paramInt4)];
        f3 = paramArrayOfFloat1[(m - 1 + paramInt4)];
        f8 = 0.0F;
        i12 = m;
        for (i20 = i3 - 1 - m + 1; i20 > 0; i20--)
        {
          f9 = Math.abs(paramArrayOfFloat2[(i12 - 1 + paramInt5)]);
          f4 = Math.max(f4, paramArrayOfFloat1[(i12 - 1 + paramInt4)] + f8 + f9);
          f3 = Math.min(f3, paramArrayOfFloat1[(i12 - 1 + paramInt4)] - f8 - f9);
          f8 = f9;
          i12 += 1;
        }
        f4 = Math.max(f4, paramArrayOfFloat1[(i3 - 1 + paramInt4)] + f8);
        f3 = Math.min(f3, paramArrayOfFloat1[(i3 - 1 + paramInt4)] - f8);
        f2 = Math.max(Math.abs(f3), Math.abs(f4));
        f3 = f3 - 2.1F * f2 * f11 * i4 - 2.1F * f5;
        f4 = f4 + 2.1F * f2 * f11 * i4 + 2.1F * f5;
        if ((paramFloat3 > 0.0F ? 0 : 1) != 0) {
          f1 = f11 * Math.max(Math.abs(f3), Math.abs(f4));
        } else {
          f1 = paramFloat3;
        }
        if ((i7 <= 1 ? 0 : 1) != 0)
        {
          if ((f4 >= f13 ? 0 : 1) != 0)
          {
            i17 += i4;
            i18 += i4;
          }
          else
          {
            f3 = Math.max(f3, f13);
            f4 = Math.min(f4, f15);
            if ((f3 < f4 ? 0 : 1) != 0) {}
          }
        }
        else
        {
          paramArrayOfFloat4[(paramInt1 + 1 - 1 + paramInt9)] = f3;
          paramArrayOfFloat4[(paramInt1 + i4 + 1 - 1 + paramInt9)] = f4;
          Slaebz.slaebz(1, 0, i4, i4, 1, i16, f1, f6, f5, paramArrayOfFloat1, m - 1 + paramInt4, paramArrayOfFloat2, m - 1 + paramInt5, paramArrayOfFloat4, m - 1 + paramInt9, arrayOfInt, 0, paramArrayOfFloat4, paramInt1 + 1 - 1 + paramInt9, paramArrayOfFloat4, paramInt1 + 2 * i4 + 1 - 1 + paramInt9, localintW2, paramArrayOfInt3, paramInt10, paramArrayOfFloat3, paramintW1.val + 1 - 1 + paramInt6, paramArrayOfInt1, paramintW1.val + 1 - 1 + paramInt7, localintW1);
          i17 += paramArrayOfInt3[(1 - 1 + paramInt10)];
          i18 += paramArrayOfInt3[(i4 + 1 - 1 + paramInt10)];
          i11 = paramintW1.val - paramArrayOfInt3[(1 - 1 + paramInt10)];
          i8 = (int)(((float)Math.log(f4 - f3 + f5) - (float)Math.log(f5)) / (float)Math.log(2.0F)) + 2;
          Slaebz.slaebz(2, i8, i4, i4, 1, i16, f1, f6, f5, paramArrayOfFloat1, m - 1 + paramInt4, paramArrayOfFloat2, m - 1 + paramInt5, paramArrayOfFloat4, m - 1 + paramInt9, arrayOfInt, 0, paramArrayOfFloat4, paramInt1 + 1 - 1 + paramInt9, paramArrayOfFloat4, paramInt1 + 2 * i4 + 1 - 1 + paramInt9, localintW3, paramArrayOfInt3, paramInt10, paramArrayOfFloat3, paramintW1.val + 1 - 1 + paramInt6, paramArrayOfInt1, paramintW1.val + 1 - 1 + paramInt7, localintW1);
          i12 = 1;
          for (i20 = localintW3.val - 1 + 1; i20 > 0; i20--)
          {
            f8 = 0.5F * (paramArrayOfFloat4[(i12 + paramInt1 - 1 + paramInt9)] + paramArrayOfFloat4[(i12 + i4 + paramInt1 - 1 + paramInt9)]);
            if ((i12 <= localintW3.val - localintW1.val ? 0 : 1) != 0)
            {
              i = 1;
              k = -i13;
            }
            else
            {
              k = i13;
            }
            i15 = paramArrayOfInt3[(i12 - 1 + paramInt10)] + 1 + i11;
            for (int i21 = paramArrayOfInt3[(i12 + i4 - 1 + paramInt10)] + i11 - (paramArrayOfInt3[(i12 - 1 + paramInt10)] + 1 + i11) + 1; i21 > 0; i21--)
            {
              paramArrayOfFloat3[(i15 - 1 + paramInt6)] = f8;
              paramArrayOfInt1[(i15 - 1 + paramInt7)] = k;
              i15 += 1;
            }
            i12 += 1;
          }
          paramintW1.val += localintW2.val;
        }
      }
      i13 += 1;
    }
    if ((i7 != 3 ? 0 : 1) != 0)
    {
      localintW2.val = 0;
      n = paramInt2 - 1 - i17;
      i1 = i18 - paramInt3;
      if ((n <= 0 ? 0 : 1) == 0) {}
      if (((i1 <= 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i15 = 1;
        for (i19 = paramintW1.val - 1 + 1; i19 > 0; i19--)
        {
          if ((paramArrayOfFloat3[(i15 - 1 + paramInt6)] > f14 ? 0 : 1) != 0) {}
          if (((n <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            n -= 1;
          }
          else
          {
            if ((paramArrayOfFloat3[(i15 - 1 + paramInt6)] < f16 ? 0 : 1) != 0) {}
            if (((i1 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              i1 -= 1;
            }
            else
            {
              localintW2.val += 1;
              paramArrayOfFloat3[(localintW2.val - 1 + paramInt6)] = paramArrayOfFloat3[(i15 - 1 + paramInt6)];
              paramArrayOfInt1[(localintW2.val - 1 + paramInt7)] = paramArrayOfInt1[(i15 - 1 + paramInt7)];
            }
          }
          i15 += 1;
        }
        paramintW1.val = localintW2.val;
      }
      if ((n <= 0 ? 0 : 1) == 0) {}
      if (((i1 <= 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if ((n <= 0 ? 0 : 1) != 0)
        {
          f12 = f15;
          i14 = 1;
          for (i19 = n - 1 + 1; i19 > 0; i19--)
          {
            i10 = 0;
            i15 = 1;
            for (i20 = paramintW1.val - 1 + 1; i20 > 0; i20--)
            {
              if ((paramArrayOfInt1[(i15 - 1 + paramInt7)] == 0 ? 0 : 1) != 0) {
                if ((paramArrayOfFloat3[(i15 - 1 + paramInt6)] >= f12 ? 0 : 1) != 0) {}
              }
              if ((((i10 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i10 = i15;
                f12 = paramArrayOfFloat3[(i15 - 1 + paramInt6)];
              }
              i15 += 1;
            }
            paramArrayOfInt1[(i10 - 1 + paramInt7)] = 0;
            i14 += 1;
          }
        }
        if ((i1 <= 0 ? 0 : 1) != 0)
        {
          f12 = f13;
          i14 = 1;
          for (i19 = i1 - 1 + 1; i19 > 0; i19--)
          {
            i10 = 0;
            i15 = 1;
            for (i20 = paramintW1.val - 1 + 1; i20 > 0; i20--)
            {
              if ((paramArrayOfInt1[(i15 - 1 + paramInt7)] == 0 ? 0 : 1) != 0) {
                if ((paramArrayOfFloat3[(i15 - 1 + paramInt6)] <= f12 ? 0 : 1) != 0) {}
              }
              if ((((i10 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i10 = i15;
                f12 = paramArrayOfFloat3[(i15 - 1 + paramInt6)];
              }
              i15 += 1;
            }
            paramArrayOfInt1[(i10 - 1 + paramInt7)] = 0;
            i14 += 1;
          }
        }
        localintW2.val = 0;
        i15 = 1;
        for (i19 = paramintW1.val - 1 + 1; i19 > 0; i19--)
        {
          if ((paramArrayOfInt1[(i15 - 1 + paramInt7)] == 0 ? 0 : 1) != 0)
          {
            localintW2.val += 1;
            paramArrayOfFloat3[(localintW2.val - 1 + paramInt6)] = paramArrayOfFloat3[(i15 - 1 + paramInt6)];
            paramArrayOfInt1[(localintW2.val - 1 + paramInt7)] = paramArrayOfInt1[(i15 - 1 + paramInt7)];
          }
          i15 += 1;
        }
        paramintW1.val = localintW2.val;
      }
      if ((n >= 0 ? 0 : 1) == 0) {}
      if (((i1 >= 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        j = 1;
      }
    }
    if ((i6 != 1 ? 0 : 1) != 0) {}
    if (((paramintW2.val <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i15 = 1;
      for (i19 = paramintW1.val - 1 - 1 + 1; i19 > 0; i19--)
      {
        i2 = 0;
        f8 = paramArrayOfFloat3[(i15 - 1 + paramInt6)];
        i12 = i15 + 1;
        for (i20 = paramintW1.val - (i15 + 1) + 1; i20 > 0; i20--)
        {
          if ((paramArrayOfFloat3[(i12 - 1 + paramInt6)] >= f8 ? 0 : 1) != 0)
          {
            i2 = i12;
            f8 = paramArrayOfFloat3[(i12 - 1 + paramInt6)];
          }
          i12 += 1;
        }
        if ((i2 == 0 ? 0 : 1) != 0)
        {
          i9 = paramArrayOfInt1[(i2 - 1 + paramInt7)];
          paramArrayOfFloat3[(i2 - 1 + paramInt6)] = paramArrayOfFloat3[(i15 - 1 + paramInt6)];
          paramArrayOfInt1[(i2 - 1 + paramInt7)] = paramArrayOfInt1[(i15 - 1 + paramInt7)];
          paramArrayOfFloat3[(i15 - 1 + paramInt6)] = f8;
          paramArrayOfInt1[(i15 - 1 + paramInt7)] = i9;
        }
        i15 += 1;
      }
    }
    paramintW3.val = 0;
    if (i != 0) {
      paramintW3.val += 1;
    }
    if (j != 0) {
      paramintW3.val += 2;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sstebz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */