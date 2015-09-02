package org.netlib.lapack;

import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slarrd
{
  public static void slarrd(String paramString1, String paramString2, int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, float paramFloat3, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, float paramFloat4, int paramInt8, int[] paramArrayOfInt1, int paramInt9, intW paramintW1, float[] paramArrayOfFloat5, int paramInt10, float[] paramArrayOfFloat6, int paramInt11, floatW paramfloatW1, floatW paramfloatW2, int[] paramArrayOfInt2, int paramInt12, int[] paramArrayOfInt3, int paramInt13, float[] paramArrayOfFloat7, int paramInt14, int[] paramArrayOfInt4, int paramInt15, intW paramintW2)
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
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
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
    int i19 = 0;
    int i20 = 0;
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
    int[] arrayOfInt = new int[1];
    paramintW2.val = 0;
    if (Lsame.lsame(paramString1, "A")) {
      i7 = 1;
    } else if (Lsame.lsame(paramString1, "V")) {
      i7 = 2;
    } else if (Lsame.lsame(paramString1, "I")) {
      i7 = 3;
    } else {
      i7 = 0;
    }
    if ((i7 > 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((((!Lsame.lsame(paramString2, "B")) && (!Lsame.lsame(paramString2, "E")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW2.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -3;
    }
    else if ((i7 != 2 ? 0 : 1) != 0)
    {
      if ((paramFloat1 < paramFloat2 ? 0 : 1) != 0) {
        paramintW2.val = -5;
      }
    }
    else
    {
      if ((i7 != 3 ? 0 : 1) != 0) {
        if ((paramInt2 >= 1 ? 0 : 1) != 0) {}
      }
      if ((((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW2.val = -6;
      }
      else
      {
        if ((i7 != 3 ? 0 : 1) != 0) {
          if ((paramInt3 >= Math.min(paramInt1, paramInt2) ? 0 : 1) != 0) {}
        }
        if ((((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -7;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0) {
      return;
    }
    paramintW2.val = 0;
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
    f2 = Slamch.slamch("P");
    f10 = Slamch.slamch("U");
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((i7 != 1 ? 0 : 1) == 0)
      {
        if ((i7 != 2 ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat2[(1 - 1 + paramInt5)] <= paramFloat1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((paramArrayOfFloat2[(1 - 1 + paramInt5)] > paramFloat2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0)
      {
        if ((i7 != 3 ? 0 : 1) != 0) {}
        if (((paramInt2 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((paramInt3 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW1.val = 1;
        paramArrayOfFloat5[(1 - 1 + paramInt10)] = paramArrayOfFloat2[(1 - 1 + paramInt5)];
        paramArrayOfFloat6[(1 - 1 + paramInt11)] = 0.0F;
        paramArrayOfInt2[(1 - 1 + paramInt12)] = 1;
        paramArrayOfInt3[(1 - 1 + paramInt13)] = 1;
      }
      return;
    }
    i18 = Ilaenv.ilaenv(1, "SSTEBZ", " ", paramInt1, -1, -1, -1);
    if ((i18 > 1 ? 0 : 1) != 0) {
      i18 = 0;
    }
    f3 = paramArrayOfFloat2[(1 - 1 + paramInt5)];
    f4 = paramArrayOfFloat2[(1 - 1 + paramInt5)];
    k = 1;
    for (int i21 = paramInt1 - 1 + 1; i21 > 0; i21--)
    {
      f3 = Math.min(f3, paramArrayOfFloat1[(2 * k - 1 - 1 + paramInt4)]);
      f4 = Math.max(f4, paramArrayOfFloat1[(2 * k - 1 + paramInt4)]);
      k += 1;
    }
    f9 = Math.max(Math.abs(f3), Math.abs(f4));
    f3 = f3 - 2.0F * f9 * f2 * paramInt1 - 2.0F * 2.0F * paramFloat4;
    f4 = f4 + 2.0F * f9 * f2 * paramInt1 + 2.0F * 2.0F * paramFloat4;
    f6 = f4 - f3;
    f5 = paramFloat3;
    f1 = 2.0F * 2.0F * f10 + 2.0F * 2.0F * paramFloat4;
    if ((i7 != 3 ? 0 : 1) != 0)
    {
      i8 = (int)(((float)Math.log(f9 + paramFloat4) - (float)Math.log(paramFloat4)) / (float)Math.log(2.0F)) + 2;
      paramArrayOfFloat7[(paramInt1 + 1 - 1 + paramInt14)] = f3;
      paramArrayOfFloat7[(paramInt1 + 2 - 1 + paramInt14)] = f3;
      paramArrayOfFloat7[(paramInt1 + 3 - 1 + paramInt14)] = f4;
      paramArrayOfFloat7[(paramInt1 + 4 - 1 + paramInt14)] = f4;
      paramArrayOfFloat7[(paramInt1 + 5 - 1 + paramInt14)] = f3;
      paramArrayOfFloat7[(paramInt1 + 6 - 1 + paramInt14)] = f4;
      paramArrayOfInt4[(1 - 1 + paramInt15)] = -1;
      paramArrayOfInt4[(2 - 1 + paramInt15)] = -1;
      paramArrayOfInt4[(3 - 1 + paramInt15)] = (paramInt1 + 1);
      paramArrayOfInt4[(4 - 1 + paramInt15)] = (paramInt1 + 1);
      paramArrayOfInt4[(5 - 1 + paramInt15)] = (paramInt2 - 1);
      paramArrayOfInt4[(6 - 1 + paramInt15)] = paramInt3;
      Slaebz.slaebz(3, i8, paramInt1, 2, 2, i18, f1, f5, paramFloat4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat3, paramInt6, paramArrayOfFloat4, paramInt7, paramArrayOfInt4, 5 - 1 + paramInt15, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt14, paramArrayOfFloat7, paramInt1 + 5 - 1 + paramInt14, localintW3, paramArrayOfInt4, paramInt15, paramArrayOfFloat5, paramInt10, paramArrayOfInt2, paramInt12, localintW1);
      if ((localintW1.val == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = localintW1.val;
        return;
      }
      if ((paramArrayOfInt4[(6 - 1 + paramInt15)] != paramInt3 ? 0 : 1) != 0)
      {
        paramfloatW1.val = paramArrayOfFloat7[(paramInt1 + 1 - 1 + paramInt14)];
        f12 = paramArrayOfFloat7[(paramInt1 + 3 - 1 + paramInt14)];
        i19 = paramArrayOfInt4[(1 - 1 + paramInt15)];
        paramfloatW2.val = paramArrayOfFloat7[(paramInt1 + 4 - 1 + paramInt14)];
        f13 = paramArrayOfFloat7[(paramInt1 + 2 - 1 + paramInt14)];
        i20 = paramArrayOfInt4[(4 - 1 + paramInt15)];
      }
      else
      {
        paramfloatW1.val = paramArrayOfFloat7[(paramInt1 + 2 - 1 + paramInt14)];
        f12 = paramArrayOfFloat7[(paramInt1 + 4 - 1 + paramInt14)];
        i19 = paramArrayOfInt4[(2 - 1 + paramInt15)];
        paramfloatW2.val = paramArrayOfFloat7[(paramInt1 + 3 - 1 + paramInt14)];
        f13 = paramArrayOfFloat7[(paramInt1 + 1 - 1 + paramInt14)];
        i20 = paramArrayOfInt4[(3 - 1 + paramInt15)];
      }
      if ((i19 >= 0 ? 0 : 1) == 0) {}
      if (((i19 < paramInt1 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((i20 >= 1 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((i20 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = 4;
        return;
      }
    }
    else if ((i7 != 2 ? 0 : 1) != 0)
    {
      paramfloatW1.val = paramFloat1;
      paramfloatW2.val = paramFloat2;
    }
    else if ((i7 != 1 ? 0 : 1) != 0)
    {
      paramfloatW1.val = f3;
      paramfloatW2.val = f4;
    }
    paramintW1.val = 0;
    i4 = 0;
    paramintW2.val = 0;
    i19 = 0;
    i20 = 0;
    i14 = 1;
    int i22;
    for (i21 = paramInt8 - 1 + 1; i21 > 0; i21--)
    {
      i6 = i4;
      n = i6 + 1;
      i4 = paramArrayOfInt1[(i14 - 1 + paramInt9)];
      i5 = i4 - i6;
      if ((i5 != 1 ? 0 : 1) != 0)
      {
        if ((paramfloatW1.val < paramArrayOfFloat2[(n - 1 + paramInt5)] - paramFloat4 ? 0 : 1) != 0) {
          i19 += 1;
        }
        if ((paramfloatW2.val < paramArrayOfFloat2[(n - 1 + paramInt5)] - paramFloat4 ? 0 : 1) != 0) {
          i20 += 1;
        }
        if ((i7 != 1 ? 0 : 1) == 0) {
          if ((paramfloatW1.val >= paramArrayOfFloat2[(n - 1 + paramInt5)] - paramFloat4 ? 0 : 1) == 0) {}
        }
        if ((((paramfloatW2.val < paramArrayOfFloat2[(n - 1 + paramInt5)] - paramFloat4 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW1.val += 1;
          paramArrayOfFloat5[(paramintW1.val - 1 + paramInt10)] = paramArrayOfFloat2[(n - 1 + paramInt5)];
          paramArrayOfFloat6[(paramintW1.val - 1 + paramInt11)] = 0.0F;
          paramArrayOfInt2[(paramintW1.val - 1 + paramInt12)] = i14;
          paramArrayOfInt3[(paramintW1.val - 1 + paramInt13)] = 1;
        }
      }
      else
      {
        f4 = paramArrayOfFloat2[(n - 1 + paramInt5)];
        f3 = paramArrayOfFloat2[(n - 1 + paramInt5)];
        f7 = 0.0F;
        i13 = n;
        for (i22 = i4 - n + 1; i22 > 0; i22--)
        {
          f3 = Math.min(f3, paramArrayOfFloat1[(2 * i13 - 1 - 1 + paramInt4)]);
          f4 = Math.max(f4, paramArrayOfFloat1[(2 * i13 - 1 + paramInt4)]);
          i13 += 1;
        }
        f6 = f4 - f3;
        f3 = f3 - 2.0F * f6 * f2 * i5 - 2.0F * paramFloat4;
        f4 = f4 + 2.0F * f6 * f2 * i5 + 2.0F * paramFloat4;
        if ((i7 <= 1 ? 0 : 1) != 0)
        {
          if ((f4 >= paramfloatW1.val ? 0 : 1) != 0)
          {
            i19 += i5;
            i20 += i5;
          }
          else
          {
            f3 = Math.max(f3, paramfloatW1.val);
            f4 = Math.min(f4, paramfloatW2.val);
            if ((f3 < f4 ? 0 : 1) != 0) {}
          }
        }
        else
        {
          paramArrayOfFloat7[(paramInt1 + 1 - 1 + paramInt14)] = f3;
          paramArrayOfFloat7[(paramInt1 + i5 + 1 - 1 + paramInt14)] = f4;
          Slaebz.slaebz(1, 0, i5, i5, 1, i18, f1, f5, paramFloat4, paramArrayOfFloat2, n - 1 + paramInt5, paramArrayOfFloat3, n - 1 + paramInt6, paramArrayOfFloat4, n - 1 + paramInt7, arrayOfInt, 0, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt14, paramArrayOfFloat7, paramInt1 + 2 * i5 + 1 - 1 + paramInt14, localintW2, paramArrayOfInt4, paramInt15, paramArrayOfFloat5, paramintW1.val + 1 - 1 + paramInt10, paramArrayOfInt2, paramintW1.val + 1 - 1 + paramInt12, localintW1);
          if ((localintW1.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = localintW1.val;
            return;
          }
          i19 += paramArrayOfInt4[(1 - 1 + paramInt15)];
          i20 += paramArrayOfInt4[(i5 + 1 - 1 + paramInt15)];
          i12 = paramintW1.val - paramArrayOfInt4[(1 - 1 + paramInt15)];
          i8 = (int)(((float)Math.log(f4 - f3 + paramFloat4) - (float)Math.log(paramFloat4)) / (float)Math.log(2.0F)) + 2;
          Slaebz.slaebz(2, i8, i5, i5, 1, i18, f1, f5, paramFloat4, paramArrayOfFloat2, n - 1 + paramInt5, paramArrayOfFloat3, n - 1 + paramInt6, paramArrayOfFloat4, n - 1 + paramInt7, arrayOfInt, 0, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt14, paramArrayOfFloat7, paramInt1 + 2 * i5 + 1 - 1 + paramInt14, localintW3, paramArrayOfInt4, paramInt15, paramArrayOfFloat5, paramintW1.val + 1 - 1 + paramInt10, paramArrayOfInt2, paramintW1.val + 1 - 1 + paramInt12, localintW1);
          if ((localintW1.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = localintW1.val;
            return;
          }
          i13 = 1;
          for (i22 = localintW3.val - 1 + 1; i22 > 0; i22--)
          {
            f7 = 0.5F * (paramArrayOfFloat7[(i13 + paramInt1 - 1 + paramInt14)] + paramArrayOfFloat7[(i13 + i5 + paramInt1 - 1 + paramInt14)]);
            f8 = 0.5F * Math.abs(paramArrayOfFloat7[(i13 + paramInt1 - 1 + paramInt14)] - paramArrayOfFloat7[(i13 + i5 + paramInt1 - 1 + paramInt14)]);
            if ((i13 <= localintW3.val - localintW1.val ? 0 : 1) != 0)
            {
              i = 1;
              m = -i14;
            }
            else
            {
              m = i14;
            }
            i16 = paramArrayOfInt4[(i13 - 1 + paramInt15)] + 1 + i12;
            for (int i23 = paramArrayOfInt4[(i13 + i5 - 1 + paramInt15)] + i12 - (paramArrayOfInt4[(i13 - 1 + paramInt15)] + 1 + i12) + 1; i23 > 0; i23--)
            {
              paramArrayOfFloat5[(i16 - 1 + paramInt10)] = f7;
              paramArrayOfFloat6[(i16 - 1 + paramInt11)] = f8;
              paramArrayOfInt3[(i16 - 1 + paramInt13)] = (i16 - i12);
              paramArrayOfInt2[(i16 - 1 + paramInt12)] = m;
              i16 += 1;
            }
            i13 += 1;
          }
          paramintW1.val += localintW2.val;
        }
      }
      i14 += 1;
    }
    if ((i7 != 3 ? 0 : 1) != 0)
    {
      i1 = paramInt2 - 1 - i19;
      i2 = i20 - paramInt3;
      if ((i1 <= 0 ? 0 : 1) != 0)
      {
        localintW2.val = 0;
        i16 = 1;
        for (i21 = paramintW1.val - 1 + 1; i21 > 0; i21--)
        {
          if ((paramArrayOfFloat5[(i16 - 1 + paramInt10)] > f12 ? 0 : 1) != 0) {}
          if (((i1 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            i1 -= 1;
          }
          else
          {
            localintW2.val += 1;
            paramArrayOfFloat5[(localintW2.val - 1 + paramInt10)] = paramArrayOfFloat5[(i16 - 1 + paramInt10)];
            paramArrayOfFloat6[(localintW2.val - 1 + paramInt11)] = paramArrayOfFloat6[(i16 - 1 + paramInt11)];
            paramArrayOfInt3[(localintW2.val - 1 + paramInt13)] = paramArrayOfInt3[(i16 - 1 + paramInt13)];
            paramArrayOfInt2[(localintW2.val - 1 + paramInt12)] = paramArrayOfInt2[(i16 - 1 + paramInt12)];
          }
          i16 += 1;
        }
        paramintW1.val = localintW2.val;
      }
      if ((i2 <= 0 ? 0 : 1) != 0)
      {
        paramintW1.val += 1;
        i16 = paramintW1.val;
        for (i21 = (1 - paramintW1.val + -1) / -1; i21 > 0; i21--)
        {
          if ((paramArrayOfFloat5[(i16 - 1 + paramInt10)] < f13 ? 0 : 1) != 0) {}
          if (((i2 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            i2 -= 1;
          }
          else
          {
            localintW2.val -= 1;
            paramArrayOfFloat5[(localintW2.val - 1 + paramInt10)] = paramArrayOfFloat5[(i16 - 1 + paramInt10)];
            paramArrayOfFloat6[(localintW2.val - 1 + paramInt11)] = paramArrayOfFloat6[(i16 - 1 + paramInt11)];
            paramArrayOfInt3[(localintW2.val - 1 + paramInt13)] = paramArrayOfInt3[(i16 - 1 + paramInt13)];
            paramArrayOfInt2[(localintW2.val - 1 + paramInt12)] = paramArrayOfInt2[(i16 - 1 + paramInt12)];
          }
          i16 += -1;
        }
        i17 = 0;
        i16 = localintW2.val;
        for (i21 = paramintW1.val - localintW2.val + 1; i21 > 0; i21--)
        {
          i17 += 1;
          paramArrayOfFloat5[(i17 - 1 + paramInt10)] = paramArrayOfFloat5[(i16 - 1 + paramInt10)];
          paramArrayOfFloat6[(i17 - 1 + paramInt11)] = paramArrayOfFloat6[(i16 - 1 + paramInt11)];
          paramArrayOfInt3[(i17 - 1 + paramInt13)] = paramArrayOfInt3[(i16 - 1 + paramInt13)];
          paramArrayOfInt2[(i17 - 1 + paramInt12)] = paramArrayOfInt2[(i16 - 1 + paramInt12)];
          i16 += 1;
        }
        paramintW1.val = (paramintW1.val - localintW2.val + 1);
      }
      if ((i1 <= 0 ? 0 : 1) == 0) {}
      if (((i2 <= 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if ((i1 <= 0 ? 0 : 1) != 0)
        {
          f11 = paramfloatW2.val;
          i15 = 1;
          for (i21 = i1 - 1 + 1; i21 > 0; i21--)
          {
            i11 = 0;
            i16 = 1;
            for (i22 = paramintW1.val - 1 + 1; i22 > 0; i22--)
            {
              if ((paramArrayOfInt2[(i16 - 1 + paramInt12)] == 0 ? 0 : 1) != 0) {
                if ((paramArrayOfFloat5[(i16 - 1 + paramInt10)] >= f11 ? 0 : 1) != 0) {}
              }
              if ((((i11 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i11 = i16;
                f11 = paramArrayOfFloat5[(i16 - 1 + paramInt10)];
              }
              i16 += 1;
            }
            paramArrayOfInt2[(i11 - 1 + paramInt12)] = 0;
            i15 += 1;
          }
        }
        if ((i2 <= 0 ? 0 : 1) != 0)
        {
          f11 = paramfloatW1.val;
          i15 = 1;
          for (i21 = i2 - 1 + 1; i21 > 0; i21--)
          {
            i11 = 0;
            i16 = 1;
            for (i22 = paramintW1.val - 1 + 1; i22 > 0; i22--)
            {
              if ((paramArrayOfInt2[(i16 - 1 + paramInt12)] == 0 ? 0 : 1) != 0) {
                if ((paramArrayOfFloat5[(i16 - 1 + paramInt10)] < f11 ? 0 : 1) != 0) {}
              }
              if ((((i11 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i11 = i16;
                f11 = paramArrayOfFloat5[(i16 - 1 + paramInt10)];
              }
              i16 += 1;
            }
            paramArrayOfInt2[(i11 - 1 + paramInt12)] = 0;
            i15 += 1;
          }
        }
        localintW2.val = 0;
        i16 = 1;
        for (i21 = paramintW1.val - 1 + 1; i21 > 0; i21--)
        {
          if ((paramArrayOfInt2[(i16 - 1 + paramInt12)] == 0 ? 0 : 1) != 0)
          {
            localintW2.val += 1;
            paramArrayOfFloat5[(localintW2.val - 1 + paramInt10)] = paramArrayOfFloat5[(i16 - 1 + paramInt10)];
            paramArrayOfFloat6[(localintW2.val - 1 + paramInt11)] = paramArrayOfFloat6[(i16 - 1 + paramInt11)];
            paramArrayOfInt3[(localintW2.val - 1 + paramInt13)] = paramArrayOfInt3[(i16 - 1 + paramInt13)];
            paramArrayOfInt2[(localintW2.val - 1 + paramInt12)] = paramArrayOfInt2[(i16 - 1 + paramInt12)];
          }
          i16 += 1;
        }
        paramintW1.val = localintW2.val;
      }
      if ((i1 >= 0 ? 0 : 1) == 0) {}
      if (((i2 >= 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        j = 1;
      }
    }
    if ((i7 != 1 ? 0 : 1) != 0) {}
    if (((paramintW1.val == paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
      if ((i7 != 3 ? 0 : 1) == 0) {}
    }
    if ((((paramintW1.val == paramInt3 - paramInt2 + 1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
      j = 1;
    }
    if (Lsame.lsame(paramString2, "E")) {}
    if (((paramInt8 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i16 = 1;
      for (i21 = paramintW1.val - 1 - 1 + 1; i21 > 0; i21--)
      {
        i3 = 0;
        f7 = paramArrayOfFloat5[(i16 - 1 + paramInt10)];
        i13 = i16 + 1;
        for (i22 = paramintW1.val - (i16 + 1) + 1; i22 > 0; i22--)
        {
          if ((paramArrayOfFloat5[(i13 - 1 + paramInt10)] >= f7 ? 0 : 1) != 0)
          {
            i3 = i13;
            f7 = paramArrayOfFloat5[(i13 - 1 + paramInt10)];
          }
          i13 += 1;
        }
        if ((i3 == 0 ? 0 : 1) != 0)
        {
          f8 = paramArrayOfFloat6[(i3 - 1 + paramInt11)];
          i9 = paramArrayOfInt2[(i3 - 1 + paramInt12)];
          i10 = paramArrayOfInt3[(i3 - 1 + paramInt13)];
          paramArrayOfFloat5[(i3 - 1 + paramInt10)] = paramArrayOfFloat5[(i16 - 1 + paramInt10)];
          paramArrayOfFloat6[(i3 - 1 + paramInt11)] = paramArrayOfFloat6[(i16 - 1 + paramInt11)];
          paramArrayOfInt2[(i3 - 1 + paramInt12)] = paramArrayOfInt2[(i16 - 1 + paramInt12)];
          paramArrayOfInt3[(i3 - 1 + paramInt13)] = paramArrayOfInt3[(i16 - 1 + paramInt13)];
          paramArrayOfFloat5[(i16 - 1 + paramInt10)] = f7;
          paramArrayOfFloat6[(i16 - 1 + paramInt11)] = f8;
          paramArrayOfInt2[(i16 - 1 + paramInt12)] = i9;
          paramArrayOfInt3[(i16 - 1 + paramInt13)] = i10;
        }
        i16 += 1;
      }
    }
    paramintW2.val = 0;
    if (i != 0) {
      paramintW2.val += 1;
    }
    if (j != 0) {
      paramintW2.val += 2;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */