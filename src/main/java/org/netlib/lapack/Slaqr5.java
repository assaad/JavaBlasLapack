package org.netlib.lapack;

import org.netlib.blas.Sgemm;
import org.netlib.blas.Strmm;
import org.netlib.util.floatW;

public final class Slaqr5
{
  public static void slaqr5(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float[] paramArrayOfFloat1, int paramInt6, float[] paramArrayOfFloat2, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, int paramInt10, int paramInt11, float[] paramArrayOfFloat4, int paramInt12, int paramInt13, float[] paramArrayOfFloat5, int paramInt14, int paramInt15, float[] paramArrayOfFloat6, int paramInt16, int paramInt17, int paramInt18, float[] paramArrayOfFloat7, int paramInt19, int paramInt20, int paramInt21, float[] paramArrayOfFloat8, int paramInt22, int paramInt23)
  {
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
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
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    int i21 = 0;
    int i22 = 0;
    int i23 = 0;
    int i24 = 0;
    int i25 = 0;
    int i26 = 0;
    int i27 = 0;
    float[] arrayOfFloat = new float[3];
    if ((paramInt5 >= 2 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt3 < paramInt4 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int i28 = (paramInt5 - 2 - 1 + 2) / 2; i28 > 0; i28--)
    {
      if ((paramArrayOfFloat2[(i - 1 + paramInt7)] == -paramArrayOfFloat2[(i + 1 - 1 + paramInt7)] ? 0 : 1) != 0)
      {
        f8 = paramArrayOfFloat1[(i - 1 + paramInt6)];
        paramArrayOfFloat1[(i - 1 + paramInt6)] = paramArrayOfFloat1[(i + 1 - 1 + paramInt6)];
        paramArrayOfFloat1[(i + 1 - 1 + paramInt6)] = paramArrayOfFloat1[(i + 2 - 1 + paramInt6)];
        paramArrayOfFloat1[(i + 2 - 1 + paramInt6)] = f8;
        f8 = paramArrayOfFloat2[(i - 1 + paramInt7)];
        paramArrayOfFloat2[(i - 1 + paramInt7)] = paramArrayOfFloat2[(i + 1 - 1 + paramInt7)];
        paramArrayOfFloat2[(i + 1 - 1 + paramInt7)] = paramArrayOfFloat2[(i + 2 - 1 + paramInt7)];
        paramArrayOfFloat2[(i + 2 - 1 + paramInt7)] = f8;
      }
      i += 2;
    }
    i23 = paramInt5 - paramInt5 % 2;
    localfloatW4.val = Slamch.slamch("SAFE MINIMUM");
    localfloatW3.val = (1.0F / localfloatW4.val);
    Slabad.slabad(localfloatW4, localfloatW3);
    f11 = Slamch.slamch("PRECISION");
    f7 = localfloatW4.val * (paramInt2 / f11);
    if ((paramInt1 != 1 ? 0 : 1) == 0) {}
    i25 = (paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1;
    if ((i23 <= 2 ? 0 : 1) != 0) {}
    i26 = (paramInt1 != 2 ? 0 : 1) != 0 ? 1 : 0;
    if ((paramInt3 + 2 > paramInt4 ? 0 : 1) != 0) {
      paramArrayOfFloat3[(paramInt3 + 2 - 1 + (paramInt3 - 1) * paramInt9 + paramInt8)] = 0.0F;
    }
    i21 = i23 / 2;
    i10 = 6 * i21 - 3;
    m = 3 * (1 - i21) + paramInt3 - 1;
    for (i28 = (paramInt4 - 2 - (3 * (1 - i21) + paramInt3 - 1) + (3 * i21 - 2)) / (3 * i21 - 2); i28 > 0; i28--)
    {
      i22 = m + i10;
      if (i25 != 0) {
        Slaset.slaset("ALL", i10, i10, 0.0F, 1.0F, paramArrayOfFloat6, paramInt16, paramInt17);
      }
      i13 = m;
      for (int i29 = Math.min(m + 3 * i21 - 3, paramInt4 - 2) - m + 1; i29 > 0; i29--)
      {
        i20 = Math.max(1, (paramInt3 - 1 - i13 + 2) / 3 + 1);
        i17 = Math.min(i21, (paramInt4 - i13) / 3);
        i16 = i17 + 1;
        if ((i17 >= i21 ? 0 : 1) != 0) {}
        i27 = (i13 + 3 * (i16 - 1) != paramInt4 - 2 ? 0 : 1) != 0 ? 1 : 0;
        i15 = i20;
        for (int i30 = i17 - i20 + 1; i30 > 0; i30--)
        {
          i8 = i13 + 3 * (i15 - 1);
          if ((i8 != paramInt3 - 1 ? 0 : 1) != 0)
          {
            Slaqr1.slaqr1(3, paramArrayOfFloat3, paramInt3 - 1 + (paramInt3 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1[(2 * i15 - 1 - 1 + paramInt6)], paramArrayOfFloat2[(2 * i15 - 1 - 1 + paramInt7)], paramArrayOfFloat1[(2 * i15 - 1 + paramInt6)], paramArrayOfFloat2[(2 * i15 - 1 + paramInt7)], paramArrayOfFloat5, 1 - 1 + (i15 - 1) * paramInt15 + paramInt14);
            localfloatW1.val = paramArrayOfFloat5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
            slarfg_adapter(3, localfloatW1, paramArrayOfFloat5, 2 - 1 + (i15 - 1) * paramInt15 + paramInt14, 1, paramArrayOfFloat5, 1 - 1 + (i15 - 1) * paramInt15 + paramInt14);
          }
          else
          {
            localfloatW2.val = paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)];
            paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = paramArrayOfFloat3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)];
            paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = paramArrayOfFloat3[(i8 + 3 - 1 + (i8 - 1) * paramInt9 + paramInt8)];
            slarfg_adapter(3, localfloatW2, paramArrayOfFloat5, 2 - 1 + (i15 - 1) * paramInt15 + paramInt14, 1, paramArrayOfFloat5, 1 - 1 + (i15 - 1) * paramInt15 + paramInt14);
            if ((paramArrayOfFloat5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] == 0.0F ? 0 : 1) != 0) {
              if ((paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] == 0.0F ? 0 : 1) == 0) {
                if ((paramArrayOfFloat3[(i8 + 3 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] != 0.0F ? 0 : 1) == 0) {}
              }
            }
            if (((((paramArrayOfFloat3[(i8 + 3 - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = localfloatW2.val;
              paramArrayOfFloat3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0F;
              paramArrayOfFloat3[(i8 + 3 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0F;
            }
            else
            {
              Slaqr1.slaqr1(3, paramArrayOfFloat3, i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1[(2 * i15 - 1 - 1 + paramInt6)], paramArrayOfFloat2[(2 * i15 - 1 - 1 + paramInt7)], paramArrayOfFloat1[(2 * i15 - 1 + paramInt6)], paramArrayOfFloat2[(2 * i15 - 1 + paramInt7)], arrayOfFloat, 0);
              f6 = Math.abs(arrayOfFloat[(1 - 1)]) + Math.abs(arrayOfFloat[(2 - 1)]) + Math.abs(arrayOfFloat[(3 - 1)]);
              if ((f6 == 0.0F ? 0 : 1) != 0)
              {
                arrayOfFloat[(1 - 1)] /= f6;
                arrayOfFloat[(2 - 1)] /= f6;
                arrayOfFloat[(3 - 1)] /= f6;
              }
              if ((Math.abs(paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)]) * (Math.abs(arrayOfFloat[(2 - 1)]) + Math.abs(arrayOfFloat[(3 - 1)])) <= f11 * Math.abs(arrayOfFloat[(1 - 1)]) * (Math.abs(paramArrayOfFloat3[(i8 - 1 + (i8 - 1) * paramInt9 + paramInt8)]) + Math.abs(paramArrayOfFloat3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]) + Math.abs(paramArrayOfFloat3[(i8 + 2 - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)])) ? 0 : 1) != 0)
              {
                if ((paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] != 0.0F ? 0 : 1) != 0) {}
                if (((paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  paramArrayOfFloat5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = 0.0F;
                }
                else
                {
                  paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = localfloatW2.val;
                  paramArrayOfFloat3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0F;
                  paramArrayOfFloat3[(i8 + 3 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0F;
                }
              }
              else
              {
                localfloatW1.val = arrayOfFloat[(1 - 1)];
                slarfg_adapter(3, localfloatW1, arrayOfFloat, 2 - 1, 1, arrayOfFloat, 1 - 1);
                f5 = paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)] * arrayOfFloat[(2 - 1)] + paramArrayOfFloat3[(i8 + 3 - 1 + (i8 - 1) * paramInt9 + paramInt8)] * arrayOfFloat[(3 - 1)];
                paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] -= arrayOfFloat[(1 - 1)] * f5;
                paramArrayOfFloat3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0F;
                paramArrayOfFloat3[(i8 + 3 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0F;
                paramArrayOfFloat5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = arrayOfFloat[(1 - 1)];
                paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = arrayOfFloat[(2 - 1)];
                paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = arrayOfFloat[(3 - 1)];
              }
            }
          }
          i15 += 1;
        }
        i8 = i13 + 3 * (i16 - 1);
        if (i27 != 0)
        {
          if ((i8 != paramInt3 - 1 ? 0 : 1) != 0)
          {
            Slaqr1.slaqr1(2, paramArrayOfFloat3, i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1[(2 * i16 - 1 - 1 + paramInt6)], paramArrayOfFloat2[(2 * i16 - 1 - 1 + paramInt7)], paramArrayOfFloat1[(2 * i16 - 1 + paramInt6)], paramArrayOfFloat2[(2 * i16 - 1 + paramInt7)], paramArrayOfFloat5, 1 - 1 + (i16 - 1) * paramInt15 + paramInt14);
            localfloatW2.val = paramArrayOfFloat5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)];
            slarfg_adapter(2, localfloatW2, paramArrayOfFloat5, 2 - 1 + (i16 - 1) * paramInt15 + paramInt14, 1, paramArrayOfFloat5, 1 - 1 + (i16 - 1) * paramInt15 + paramInt14);
          }
          else
          {
            localfloatW2.val = paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)];
            paramArrayOfFloat5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)] = paramArrayOfFloat3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)];
            slarfg_adapter(2, localfloatW2, paramArrayOfFloat5, 2 - 1 + (i16 - 1) * paramInt15 + paramInt14, 1, paramArrayOfFloat5, 1 - 1 + (i16 - 1) * paramInt15 + paramInt14);
            paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = localfloatW2.val;
            paramArrayOfFloat3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0F;
          }
        }
        else {
          paramArrayOfFloat5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] = 0.0F;
        }
        if (i25 != 0) {
          i3 = Math.min(i22, paramInt4);
        } else if (paramBoolean1) {
          i3 = paramInt2;
        } else {
          i3 = paramInt4;
        }
        n = Math.max(paramInt3, i13);
        int i31;
        for (i30 = i3 - Math.max(paramInt3, i13) + 1; i30 > 0; i30--)
        {
          i18 = Math.min(i17, (n - i13 + 2) / 3);
          i15 = i20;
          for (i31 = i18 - i20 + 1; i31 > 0; i31--)
          {
            i8 = i13 + 3 * (i15 - 1);
            f5 = paramArrayOfFloat5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * (paramArrayOfFloat3[(i8 + 1 - 1 + (n - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat3[(i8 + 2 - 1 + (n - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat3[(i8 + 3 - 1 + (n - 1) * paramInt9 + paramInt8)]);
            paramArrayOfFloat3[(i8 + 1 - 1 + (n - 1) * paramInt9 + paramInt8)] -= f5;
            paramArrayOfFloat3[(i8 + 2 - 1 + (n - 1) * paramInt9 + paramInt8)] -= f5 * paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
            paramArrayOfFloat3[(i8 + 3 - 1 + (n - 1) * paramInt9 + paramInt8)] -= f5 * paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
            i15 += 1;
          }
          n += 1;
        }
        if (i27 != 0)
        {
          i8 = i13 + 3 * (i16 - 1);
          n = Math.max(i8 + 1, paramInt3);
          for (i30 = i3 - Math.max(i8 + 1, paramInt3) + 1; i30 > 0; i30--)
          {
            f5 = paramArrayOfFloat5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * (paramArrayOfFloat3[(i8 + 1 - 1 + (n - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat3[(i8 + 2 - 1 + (n - 1) * paramInt9 + paramInt8)]);
            paramArrayOfFloat3[(i8 + 1 - 1 + (n - 1) * paramInt9 + paramInt8)] -= f5;
            paramArrayOfFloat3[(i8 + 2 - 1 + (n - 1) * paramInt9 + paramInt8)] -= f5 * paramArrayOfFloat5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)];
            n += 1;
          }
        }
        if (i25 != 0) {
          i7 = Math.max(paramInt3, m);
        } else if (paramBoolean1) {
          i7 = 1;
        } else {
          i7 = paramInt3;
        }
        i15 = i20;
        for (i30 = i17 - i20 + 1; i30 > 0; i30--)
        {
          if ((paramArrayOfFloat5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] == 0.0F ? 0 : 1) != 0)
          {
            i8 = i13 + 3 * (i15 - 1);
            n = i7;
            for (i31 = Math.min(paramInt4, i8 + 3) - i7 + 1; i31 > 0; i31--)
            {
              f5 = paramArrayOfFloat5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * (paramArrayOfFloat3[(n - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat3[(n - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat3[(n - 1 + (i8 + 3 - 1) * paramInt9 + paramInt8)]);
              paramArrayOfFloat3[(n - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] -= f5;
              paramArrayOfFloat3[(n - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)] -= f5 * paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
              paramArrayOfFloat3[(n - 1 + (i8 + 3 - 1) * paramInt9 + paramInt8)] -= f5 * paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
              n += 1;
            }
            if (i25 != 0)
            {
              i11 = i8 - m;
              n = Math.max(1, paramInt3 - m);
              for (i31 = i10 - Math.max(1, paramInt3 - m) + 1; i31 > 0; i31--)
              {
                f5 = paramArrayOfFloat5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * (paramArrayOfFloat6[(n - 1 + (i11 + 1 - 1) * paramInt17 + paramInt16)] + paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat6[(n - 1 + (i11 + 2 - 1) * paramInt17 + paramInt16)] + paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat6[(n - 1 + (i11 + 3 - 1) * paramInt17 + paramInt16)]);
                paramArrayOfFloat6[(n - 1 + (i11 + 1 - 1) * paramInt17 + paramInt16)] -= f5;
                paramArrayOfFloat6[(n - 1 + (i11 + 2 - 1) * paramInt17 + paramInt16)] -= f5 * paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
                paramArrayOfFloat6[(n - 1 + (i11 + 3 - 1) * paramInt17 + paramInt16)] -= f5 * paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
                n += 1;
              }
            }
            else if (paramBoolean2)
            {
              n = paramInt10;
              i31 = paramInt11 - paramInt10 + 1;
              for (;;)
              {
                f5 = paramArrayOfFloat5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * (paramArrayOfFloat4[(n - 1 + (i8 + 1 - 1) * paramInt13 + paramInt12)] + paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat4[(n - 1 + (i8 + 2 - 1) * paramInt13 + paramInt12)] + paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat4[(n - 1 + (i8 + 3 - 1) * paramInt13 + paramInt12)]);
                paramArrayOfFloat4[(n - 1 + (i8 + 1 - 1) * paramInt13 + paramInt12)] -= f5;
                paramArrayOfFloat4[(n - 1 + (i8 + 2 - 1) * paramInt13 + paramInt12)] -= f5 * paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
                paramArrayOfFloat4[(n - 1 + (i8 + 3 - 1) * paramInt13 + paramInt12)] -= f5 * paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
                n += 1;
                i31--;
                if (i31 <= 0) {
                  break;
                }
              }
            }
          }
          i15 += 1;
        }
        i8 = i13 + 3 * (i16 - 1);
        if (i27 != 0) {}
        if (((paramArrayOfFloat5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] == 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          n = i7;
          for (i30 = Math.min(paramInt4, i8 + 3) - i7 + 1; i30 > 0; i30--)
          {
            f5 = paramArrayOfFloat5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * (paramArrayOfFloat3[(n - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat3[(n - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)]);
            paramArrayOfFloat3[(n - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] -= f5;
            paramArrayOfFloat3[(n - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)] -= f5 * paramArrayOfFloat5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)];
            n += 1;
          }
          if (i25 != 0)
          {
            i11 = i8 - m;
            n = Math.max(1, paramInt3 - m);
            for (i30 = i10 - Math.max(1, paramInt3 - m) + 1; i30 > 0; i30--)
            {
              f5 = paramArrayOfFloat5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * (paramArrayOfFloat6[(n - 1 + (i11 + 1 - 1) * paramInt17 + paramInt16)] + paramArrayOfFloat5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat6[(n - 1 + (i11 + 2 - 1) * paramInt17 + paramInt16)]);
              paramArrayOfFloat6[(n - 1 + (i11 + 1 - 1) * paramInt17 + paramInt16)] -= f5;
              paramArrayOfFloat6[(n - 1 + (i11 + 2 - 1) * paramInt17 + paramInt16)] -= f5 * paramArrayOfFloat5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)];
              n += 1;
            }
          }
          else if (paramBoolean2)
          {
            n = paramInt10;
            i30 = paramInt11 - paramInt10 + 1;
            for (;;)
            {
              f5 = paramArrayOfFloat5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * (paramArrayOfFloat4[(n - 1 + (i8 + 1 - 1) * paramInt13 + paramInt12)] + paramArrayOfFloat5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat4[(n - 1 + (i8 + 2 - 1) * paramInt13 + paramInt12)]);
              paramArrayOfFloat4[(n - 1 + (i8 + 1 - 1) * paramInt13 + paramInt12)] -= f5;
              paramArrayOfFloat4[(n - 1 + (i8 + 2 - 1) * paramInt13 + paramInt12)] -= f5 * paramArrayOfFloat5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)];
              n += 1;
              i30--;
              if (i30 <= 0) {
                break;
              }
            }
          }
        }
        i19 = i20;
        if ((i13 + 3 * (i19 - 1) >= paramInt3 ? 0 : 1) != 0) {
          i19 += 1;
        }
        i18 = i17;
        if (i27 != 0) {
          i18 += 1;
        }
        if ((i13 != paramInt4 - 2 ? 0 : 1) != 0) {
          i18 += 1;
        }
        i15 = i19;
        for (i30 = i18 - i19 + 1; i30 > 0; i30--)
        {
          i8 = Math.min(paramInt4 - 1, i13 + 3 * (i15 - 1));
          if ((paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] == 0.0F ? 0 : 1) != 0)
          {
            f9 = Math.abs(paramArrayOfFloat3[(i8 - 1 + (i8 - 1) * paramInt9 + paramInt8)]) + Math.abs(paramArrayOfFloat3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]);
            if ((f9 != 0.0F ? 0 : 1) != 0)
            {
              if ((i8 < paramInt3 + 1 ? 0 : 1) != 0) {
                f9 += Math.abs(paramArrayOfFloat3[(i8 - 1 + (i8 - 1 - 1) * paramInt9 + paramInt8)]);
              }
              if ((i8 < paramInt3 + 2 ? 0 : 1) != 0) {
                f9 += Math.abs(paramArrayOfFloat3[(i8 - 1 + (i8 - 2 - 1) * paramInt9 + paramInt8)]);
              }
              if ((i8 < paramInt3 + 3 ? 0 : 1) != 0) {
                f9 += Math.abs(paramArrayOfFloat3[(i8 - 1 + (i8 - 3 - 1) * paramInt9 + paramInt8)]);
              }
              if ((i8 > paramInt4 - 2 ? 0 : 1) != 0) {
                f9 += Math.abs(paramArrayOfFloat3[(i8 + 2 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]);
              }
              if ((i8 > paramInt4 - 3 ? 0 : 1) != 0) {
                f9 += Math.abs(paramArrayOfFloat3[(i8 + 3 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]);
              }
              if ((i8 > paramInt4 - 4 ? 0 : 1) != 0) {
                f9 += Math.abs(paramArrayOfFloat3[(i8 + 4 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]);
              }
            }
            if ((Math.abs(paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)]) > Math.max(f7, f11 * f9) ? 0 : 1) != 0)
            {
              f2 = Math.max(Math.abs(paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)]), Math.abs(paramArrayOfFloat3[(i8 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]));
              f3 = Math.min(Math.abs(paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)]), Math.abs(paramArrayOfFloat3[(i8 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]));
              f1 = Math.max(Math.abs(paramArrayOfFloat3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]), Math.abs(paramArrayOfFloat3[(i8 - 1 + (i8 - 1) * paramInt9 + paramInt8)] - paramArrayOfFloat3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]));
              f4 = Math.min(Math.abs(paramArrayOfFloat3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]), Math.abs(paramArrayOfFloat3[(i8 - 1 + (i8 - 1) * paramInt9 + paramInt8)] - paramArrayOfFloat3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]));
              f6 = f1 + f2;
              f10 = f4 * (f1 / f6);
              if ((f10 != 0.0F ? 0 : 1) == 0) {}
              if (((f3 * (f2 / f6) > Math.max(f7, f11 * f10) ? 0 : 1) == 0 ? 0 : 1) != 0) {
                paramArrayOfFloat3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0F;
              }
            }
          }
          i15 += 1;
        }
        i18 = Math.min(i21, (paramInt4 - i13 - 1) / 3);
        i15 = i20;
        for (i30 = i18 - i20 + 1; i30 > 0; i30--)
        {
          i8 = i13 + 3 * (i15 - 1);
          f5 = paramArrayOfFloat5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfFloat3[(i8 + 4 - 1 + (i8 + 3 - 1) * paramInt9 + paramInt8)];
          paramArrayOfFloat3[(i8 + 4 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] = (-f5);
          paramArrayOfFloat3[(i8 + 4 - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)] = (-(f5 * paramArrayOfFloat5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)]));
          paramArrayOfFloat3[(i8 + 4 - 1 + (i8 + 3 - 1) * paramInt9 + paramInt8)] -= f5 * paramArrayOfFloat5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
          i15 += 1;
        }
        i13 += 1;
      }
      if (i25 != 0)
      {
        if (paramBoolean1)
        {
          i7 = 1;
          i3 = paramInt2;
        }
        else
        {
          i7 = paramInt3;
          i3 = paramInt4;
        }
        if ((i26 ^ 0x1) == 0) {}
        if (((m >= paramInt3 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
        if (((i22 <= paramInt4 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
        if (((i23 > 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          i9 = Math.max(1, paramInt3 - m);
          i24 = i10 - Math.max(0, i22 - paramInt4) - i9 + 1;
          i4 = Math.min(i22, paramInt4) + 1;
          for (i29 = (i3 - (Math.min(i22, paramInt4) + 1) + paramInt21) / paramInt21; i29 > 0; i29--)
          {
            i5 = Math.min(paramInt21, i3 - i4 + 1);
            Sgemm.sgemm("C", "N", i24, i5, i24, 1.0F, paramArrayOfFloat6, i9 - 1 + (i9 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfFloat3, m + i9 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, 0.0F, paramArrayOfFloat8, paramInt22, paramInt23);
            Slacpy.slacpy("ALL", i24, i5, paramArrayOfFloat8, paramInt22, paramInt23, paramArrayOfFloat3, m + i9 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
            i4 += paramInt21;
          }
          i6 = i7;
          for (i29 = (Math.max(paramInt3, m) - 1 - i7 + paramInt18) / paramInt18; i29 > 0; i29--)
          {
            i5 = Math.min(paramInt18, Math.max(paramInt3, m) - i6);
            Sgemm.sgemm("N", "N", i5, i24, i24, 1.0F, paramArrayOfFloat3, i6 - 1 + (m + i9 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat6, i9 - 1 + (i9 - 1) * paramInt17 + paramInt16, paramInt17, 0.0F, paramArrayOfFloat7, paramInt19, paramInt20);
            Slacpy.slacpy("ALL", i5, i24, paramArrayOfFloat7, paramInt19, paramInt20, paramArrayOfFloat3, i6 - 1 + (m + i9 - 1) * paramInt9 + paramInt8, paramInt9);
            i6 += paramInt18;
          }
          if (paramBoolean2)
          {
            i6 = paramInt10;
            for (i29 = (paramInt11 - paramInt10 + paramInt18) / paramInt18; i29 > 0; i29--)
            {
              i5 = Math.min(paramInt18, paramInt11 - i6 + 1);
              Sgemm.sgemm("N", "N", i5, i24, i24, 1.0F, paramArrayOfFloat4, i6 - 1 + (m + i9 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, i9 - 1 + (i9 - 1) * paramInt17 + paramInt16, paramInt17, 0.0F, paramArrayOfFloat7, paramInt19, paramInt20);
              Slacpy.slacpy("ALL", i5, i24, paramArrayOfFloat7, paramInt19, paramInt20, paramArrayOfFloat4, i6 - 1 + (m + i9 - 1) * paramInt13 + paramInt12, paramInt13);
              i6 += paramInt18;
            }
          }
        }
        else
        {
          j = (i10 + 1) / 2;
          k = i10;
          i1 = k - j;
          i2 = i10;
          i14 = i2 - i1 - (i23 + 1);
          i12 = i23 + 1;
          i4 = Math.min(i22, paramInt4) + 1;
          for (i29 = (i3 - (Math.min(i22, paramInt4) + 1) + paramInt21) / paramInt21; i29 > 0; i29--)
          {
            i5 = Math.min(paramInt21, i3 - i4 + 1);
            Slacpy.slacpy("ALL", i12, i5, paramArrayOfFloat3, m + 1 + i1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat8, i14 + 1 - 1 + (1 - 1) * paramInt23 + paramInt22, paramInt23);
            Slaset.slaset("ALL", i14, i5, 0.0F, 0.0F, paramArrayOfFloat8, paramInt22, paramInt23);
            Strmm.strmm("L", "U", "C", "N", i12, i5, 1.0F, paramArrayOfFloat6, i1 + 1 - 1 + (1 + i14 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfFloat8, i14 + 1 - 1 + (1 - 1) * paramInt23 + paramInt22, paramInt23);
            Sgemm.sgemm("C", "N", j, i5, i1, 1.0F, paramArrayOfFloat6, paramInt16, paramInt17, paramArrayOfFloat3, m + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, 1.0F, paramArrayOfFloat8, paramInt22, paramInt23);
            Slacpy.slacpy("ALL", i1, i5, paramArrayOfFloat3, m + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat8, j + 1 - 1 + (1 - 1) * paramInt23 + paramInt22, paramInt23);
            Strmm.strmm("L", "L", "C", "N", i1, i5, 1.0F, paramArrayOfFloat6, 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfFloat8, j + 1 - 1 + (1 - 1) * paramInt23 + paramInt22, paramInt23);
            Sgemm.sgemm("C", "N", k - j, i5, i2 - i1, 1.0F, paramArrayOfFloat6, i1 + 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfFloat3, m + 1 + i1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, 1.0F, paramArrayOfFloat8, j + 1 - 1 + (1 - 1) * paramInt23 + paramInt22, paramInt23);
            Slacpy.slacpy("ALL", i10, i5, paramArrayOfFloat8, paramInt22, paramInt23, paramArrayOfFloat3, m + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
            i4 += paramInt21;
          }
          i6 = i7;
          for (i29 = (Math.max(m, paramInt3) - 1 - i7 + paramInt18) / paramInt18; i29 > 0; i29--)
          {
            i5 = Math.min(paramInt18, Math.max(m, paramInt3) - i6);
            Slacpy.slacpy("ALL", i5, i12, paramArrayOfFloat3, i6 - 1 + (m + 1 + i1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat7, 1 - 1 + (1 + i14 - 1) * paramInt20 + paramInt19, paramInt20);
            Slaset.slaset("ALL", i5, i14, 0.0F, 0.0F, paramArrayOfFloat7, paramInt19, paramInt20);
            Strmm.strmm("R", "U", "N", "N", i5, i12, 1.0F, paramArrayOfFloat6, i1 + 1 - 1 + (1 + i14 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfFloat7, 1 - 1 + (1 + i14 - 1) * paramInt20 + paramInt19, paramInt20);
            Sgemm.sgemm("N", "N", i5, j, i1, 1.0F, paramArrayOfFloat3, i6 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat6, paramInt16, paramInt17, 1.0F, paramArrayOfFloat7, paramInt19, paramInt20);
            Slacpy.slacpy("ALL", i5, i1, paramArrayOfFloat3, i6 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
            Strmm.strmm("R", "L", "N", "N", i5, k - j, 1.0F, paramArrayOfFloat6, 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfFloat7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
            Sgemm.sgemm("N", "N", i5, k - j, i2 - i1, 1.0F, paramArrayOfFloat3, i6 - 1 + (m + 1 + i1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat6, i1 + 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, 1.0F, paramArrayOfFloat7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
            Slacpy.slacpy("ALL", i5, i10, paramArrayOfFloat7, paramInt19, paramInt20, paramArrayOfFloat3, i6 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, paramInt9);
            i6 += paramInt18;
          }
          if (paramBoolean2)
          {
            i6 = paramInt10;
            for (i29 = (paramInt11 - paramInt10 + paramInt18) / paramInt18; i29 > 0; i29--)
            {
              i5 = Math.min(paramInt18, paramInt11 - i6 + 1);
              Slacpy.slacpy("ALL", i5, i12, paramArrayOfFloat4, i6 - 1 + (m + 1 + i1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat7, 1 - 1 + (1 + i14 - 1) * paramInt20 + paramInt19, paramInt20);
              Slaset.slaset("ALL", i5, i14, 0.0F, 0.0F, paramArrayOfFloat7, paramInt19, paramInt20);
              Strmm.strmm("R", "U", "N", "N", i5, i12, 1.0F, paramArrayOfFloat6, i1 + 1 - 1 + (1 + i14 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfFloat7, 1 - 1 + (1 + i14 - 1) * paramInt20 + paramInt19, paramInt20);
              Sgemm.sgemm("N", "N", i5, j, i1, 1.0F, paramArrayOfFloat4, i6 - 1 + (m + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, paramInt16, paramInt17, 1.0F, paramArrayOfFloat7, paramInt19, paramInt20);
              Slacpy.slacpy("ALL", i5, i1, paramArrayOfFloat4, i6 - 1 + (m + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
              Strmm.strmm("R", "L", "N", "N", i5, k - j, 1.0F, paramArrayOfFloat6, 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfFloat7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
              Sgemm.sgemm("N", "N", i5, k - j, i2 - i1, 1.0F, paramArrayOfFloat4, i6 - 1 + (m + 1 + i1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, i1 + 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, 1.0F, paramArrayOfFloat7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
              Slacpy.slacpy("ALL", i5, i10, paramArrayOfFloat7, paramInt19, paramInt20, paramArrayOfFloat4, i6 - 1 + (m + 1 - 1) * paramInt13 + paramInt12, paramInt13);
              i6 += paramInt18;
            }
          }
        }
      }
      m += 3 * i21 - 2;
    }
  }
  
  private static void slarfg_adapter(int paramInt1, floatW paramfloatW, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat2[paramInt4]);
    Slarfg.slarfg(paramInt1, paramfloatW, paramArrayOfFloat1, paramInt2, paramInt3, localfloatW);
    paramArrayOfFloat2[paramInt4] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaqr5.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */