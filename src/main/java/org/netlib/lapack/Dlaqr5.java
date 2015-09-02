package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.blas.Dtrmm;
import org.netlib.util.doubleW;

public final class Dlaqr5
{
  public static void dlaqr5(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double[] paramArrayOfDouble1, int paramInt6, double[] paramArrayOfDouble2, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, int paramInt10, int paramInt11, double[] paramArrayOfDouble4, int paramInt12, int paramInt13, double[] paramArrayOfDouble5, int paramInt14, int paramInt15, double[] paramArrayOfDouble6, int paramInt16, int paramInt17, int paramInt18, double[] paramArrayOfDouble7, int paramInt19, int paramInt20, int paramInt21, double[] paramArrayOfDouble8, int paramInt22, int paramInt23)
  {
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
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
    double[] arrayOfDouble = new double[3];
    if ((paramInt5 >= 2 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt3 < paramInt4 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int i28 = (paramInt5 - 2 - 1 + 2) / 2; i28 > 0; i28--)
    {
      if ((paramArrayOfDouble2[(i - 1 + paramInt7)] == -paramArrayOfDouble2[(i + 1 - 1 + paramInt7)] ? 0 : 1) != 0)
      {
        d8 = paramArrayOfDouble1[(i - 1 + paramInt6)];
        paramArrayOfDouble1[(i - 1 + paramInt6)] = paramArrayOfDouble1[(i + 1 - 1 + paramInt6)];
        paramArrayOfDouble1[(i + 1 - 1 + paramInt6)] = paramArrayOfDouble1[(i + 2 - 1 + paramInt6)];
        paramArrayOfDouble1[(i + 2 - 1 + paramInt6)] = d8;
        d8 = paramArrayOfDouble2[(i - 1 + paramInt7)];
        paramArrayOfDouble2[(i - 1 + paramInt7)] = paramArrayOfDouble2[(i + 1 - 1 + paramInt7)];
        paramArrayOfDouble2[(i + 1 - 1 + paramInt7)] = paramArrayOfDouble2[(i + 2 - 1 + paramInt7)];
        paramArrayOfDouble2[(i + 2 - 1 + paramInt7)] = d8;
      }
      i += 2;
    }
    i23 = paramInt5 - paramInt5 % 2;
    localdoubleW4.val = Dlamch.dlamch("SAFE MINIMUM");
    localdoubleW3.val = (1.0D / localdoubleW4.val);
    Dlabad.dlabad(localdoubleW4, localdoubleW3);
    d11 = Dlamch.dlamch("PRECISION");
    d7 = localdoubleW4.val * (paramInt2 / d11);
    if ((paramInt1 != 1 ? 0 : 1) == 0) {}
    i25 = (paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1;
    if ((i23 <= 2 ? 0 : 1) != 0) {}
    i26 = (paramInt1 != 2 ? 0 : 1) != 0 ? 1 : 0;
    if ((paramInt3 + 2 > paramInt4 ? 0 : 1) != 0) {
      paramArrayOfDouble3[(paramInt3 + 2 - 1 + (paramInt3 - 1) * paramInt9 + paramInt8)] = 0.0D;
    }
    i21 = i23 / 2;
    i10 = 6 * i21 - 3;
    m = 3 * (1 - i21) + paramInt3 - 1;
    for (i28 = (paramInt4 - 2 - (3 * (1 - i21) + paramInt3 - 1) + (3 * i21 - 2)) / (3 * i21 - 2); i28 > 0; i28--)
    {
      i22 = m + i10;
      if (i25 != 0) {
        Dlaset.dlaset("ALL", i10, i10, 0.0D, 1.0D, paramArrayOfDouble6, paramInt16, paramInt17);
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
            Dlaqr1.dlaqr1(3, paramArrayOfDouble3, paramInt3 - 1 + (paramInt3 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1[(2 * i15 - 1 - 1 + paramInt6)], paramArrayOfDouble2[(2 * i15 - 1 - 1 + paramInt7)], paramArrayOfDouble1[(2 * i15 - 1 + paramInt6)], paramArrayOfDouble2[(2 * i15 - 1 + paramInt7)], paramArrayOfDouble5, 1 - 1 + (i15 - 1) * paramInt15 + paramInt14);
            localdoubleW1.val = paramArrayOfDouble5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
            dlarfg_adapter(3, localdoubleW1, paramArrayOfDouble5, 2 - 1 + (i15 - 1) * paramInt15 + paramInt14, 1, paramArrayOfDouble5, 1 - 1 + (i15 - 1) * paramInt15 + paramInt14);
          }
          else
          {
            localdoubleW2.val = paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)];
            paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = paramArrayOfDouble3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)];
            paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = paramArrayOfDouble3[(i8 + 3 - 1 + (i8 - 1) * paramInt9 + paramInt8)];
            dlarfg_adapter(3, localdoubleW2, paramArrayOfDouble5, 2 - 1 + (i15 - 1) * paramInt15 + paramInt14, 1, paramArrayOfDouble5, 1 - 1 + (i15 - 1) * paramInt15 + paramInt14);
            if ((paramArrayOfDouble5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] == 0.0D ? 0 : 1) != 0) {
              if ((paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] == 0.0D ? 0 : 1) == 0) {
                if ((paramArrayOfDouble3[(i8 + 3 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] != 0.0D ? 0 : 1) == 0) {}
              }
            }
            if (((((paramArrayOfDouble3[(i8 + 3 - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = localdoubleW2.val;
              paramArrayOfDouble3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0D;
              paramArrayOfDouble3[(i8 + 3 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0D;
            }
            else
            {
              Dlaqr1.dlaqr1(3, paramArrayOfDouble3, i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1[(2 * i15 - 1 - 1 + paramInt6)], paramArrayOfDouble2[(2 * i15 - 1 - 1 + paramInt7)], paramArrayOfDouble1[(2 * i15 - 1 + paramInt6)], paramArrayOfDouble2[(2 * i15 - 1 + paramInt7)], arrayOfDouble, 0);
              d6 = Math.abs(arrayOfDouble[(1 - 1)]) + Math.abs(arrayOfDouble[(2 - 1)]) + Math.abs(arrayOfDouble[(3 - 1)]);
              if ((d6 == 0.0D ? 0 : 1) != 0)
              {
                arrayOfDouble[(1 - 1)] /= d6;
                arrayOfDouble[(2 - 1)] /= d6;
                arrayOfDouble[(3 - 1)] /= d6;
              }
              if ((Math.abs(paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)]) * (Math.abs(arrayOfDouble[(2 - 1)]) + Math.abs(arrayOfDouble[(3 - 1)])) <= d11 * Math.abs(arrayOfDouble[(1 - 1)]) * (Math.abs(paramArrayOfDouble3[(i8 - 1 + (i8 - 1) * paramInt9 + paramInt8)]) + Math.abs(paramArrayOfDouble3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]) + Math.abs(paramArrayOfDouble3[(i8 + 2 - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)])) ? 0 : 1) != 0)
              {
                if ((paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] != 0.0D ? 0 : 1) != 0) {}
                if (((paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  paramArrayOfDouble5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = 0.0D;
                }
                else
                {
                  paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = localdoubleW2.val;
                  paramArrayOfDouble3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0D;
                  paramArrayOfDouble3[(i8 + 3 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0D;
                }
              }
              else
              {
                localdoubleW1.val = arrayOfDouble[(1 - 1)];
                dlarfg_adapter(3, localdoubleW1, arrayOfDouble, 2 - 1, 1, arrayOfDouble, 1 - 1);
                d5 = paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)] * arrayOfDouble[(2 - 1)] + paramArrayOfDouble3[(i8 + 3 - 1 + (i8 - 1) * paramInt9 + paramInt8)] * arrayOfDouble[(3 - 1)];
                paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] -= arrayOfDouble[(1 - 1)] * d5;
                paramArrayOfDouble3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0D;
                paramArrayOfDouble3[(i8 + 3 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0D;
                paramArrayOfDouble5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = arrayOfDouble[(1 - 1)];
                paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = arrayOfDouble[(2 - 1)];
                paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] = arrayOfDouble[(3 - 1)];
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
            Dlaqr1.dlaqr1(2, paramArrayOfDouble3, i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1[(2 * i16 - 1 - 1 + paramInt6)], paramArrayOfDouble2[(2 * i16 - 1 - 1 + paramInt7)], paramArrayOfDouble1[(2 * i16 - 1 + paramInt6)], paramArrayOfDouble2[(2 * i16 - 1 + paramInt7)], paramArrayOfDouble5, 1 - 1 + (i16 - 1) * paramInt15 + paramInt14);
            localdoubleW2.val = paramArrayOfDouble5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)];
            dlarfg_adapter(2, localdoubleW2, paramArrayOfDouble5, 2 - 1 + (i16 - 1) * paramInt15 + paramInt14, 1, paramArrayOfDouble5, 1 - 1 + (i16 - 1) * paramInt15 + paramInt14);
          }
          else
          {
            localdoubleW2.val = paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)];
            paramArrayOfDouble5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)] = paramArrayOfDouble3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)];
            dlarfg_adapter(2, localdoubleW2, paramArrayOfDouble5, 2 - 1 + (i16 - 1) * paramInt15 + paramInt14, 1, paramArrayOfDouble5, 1 - 1 + (i16 - 1) * paramInt15 + paramInt14);
            paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = localdoubleW2.val;
            paramArrayOfDouble3[(i8 + 2 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0D;
          }
        }
        else {
          paramArrayOfDouble5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] = 0.0D;
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
            d5 = paramArrayOfDouble5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * (paramArrayOfDouble3[(i8 + 1 - 1 + (n - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble3[(i8 + 2 - 1 + (n - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble3[(i8 + 3 - 1 + (n - 1) * paramInt9 + paramInt8)]);
            paramArrayOfDouble3[(i8 + 1 - 1 + (n - 1) * paramInt9 + paramInt8)] -= d5;
            paramArrayOfDouble3[(i8 + 2 - 1 + (n - 1) * paramInt9 + paramInt8)] -= d5 * paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
            paramArrayOfDouble3[(i8 + 3 - 1 + (n - 1) * paramInt9 + paramInt8)] -= d5 * paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
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
            d5 = paramArrayOfDouble5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * (paramArrayOfDouble3[(i8 + 1 - 1 + (n - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble3[(i8 + 2 - 1 + (n - 1) * paramInt9 + paramInt8)]);
            paramArrayOfDouble3[(i8 + 1 - 1 + (n - 1) * paramInt9 + paramInt8)] -= d5;
            paramArrayOfDouble3[(i8 + 2 - 1 + (n - 1) * paramInt9 + paramInt8)] -= d5 * paramArrayOfDouble5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)];
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
          if ((paramArrayOfDouble5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] == 0.0D ? 0 : 1) != 0)
          {
            i8 = i13 + 3 * (i15 - 1);
            n = i7;
            for (i31 = Math.min(paramInt4, i8 + 3) - i7 + 1; i31 > 0; i31--)
            {
              d5 = paramArrayOfDouble5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * (paramArrayOfDouble3[(n - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble3[(n - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble3[(n - 1 + (i8 + 3 - 1) * paramInt9 + paramInt8)]);
              paramArrayOfDouble3[(n - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] -= d5;
              paramArrayOfDouble3[(n - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)] -= d5 * paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
              paramArrayOfDouble3[(n - 1 + (i8 + 3 - 1) * paramInt9 + paramInt8)] -= d5 * paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
              n += 1;
            }
            if (i25 != 0)
            {
              i11 = i8 - m;
              n = Math.max(1, paramInt3 - m);
              for (i31 = i10 - Math.max(1, paramInt3 - m) + 1; i31 > 0; i31--)
              {
                d5 = paramArrayOfDouble5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * (paramArrayOfDouble6[(n - 1 + (i11 + 1 - 1) * paramInt17 + paramInt16)] + paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble6[(n - 1 + (i11 + 2 - 1) * paramInt17 + paramInt16)] + paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble6[(n - 1 + (i11 + 3 - 1) * paramInt17 + paramInt16)]);
                paramArrayOfDouble6[(n - 1 + (i11 + 1 - 1) * paramInt17 + paramInt16)] -= d5;
                paramArrayOfDouble6[(n - 1 + (i11 + 2 - 1) * paramInt17 + paramInt16)] -= d5 * paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
                paramArrayOfDouble6[(n - 1 + (i11 + 3 - 1) * paramInt17 + paramInt16)] -= d5 * paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
                n += 1;
              }
            }
            else if (paramBoolean2)
            {
              n = paramInt10;
              i31 = paramInt11 - paramInt10 + 1;
              for (;;)
              {
                d5 = paramArrayOfDouble5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * (paramArrayOfDouble4[(n - 1 + (i8 + 1 - 1) * paramInt13 + paramInt12)] + paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble4[(n - 1 + (i8 + 2 - 1) * paramInt13 + paramInt12)] + paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble4[(n - 1 + (i8 + 3 - 1) * paramInt13 + paramInt12)]);
                paramArrayOfDouble4[(n - 1 + (i8 + 1 - 1) * paramInt13 + paramInt12)] -= d5;
                paramArrayOfDouble4[(n - 1 + (i8 + 2 - 1) * paramInt13 + paramInt12)] -= d5 * paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
                paramArrayOfDouble4[(n - 1 + (i8 + 3 - 1) * paramInt13 + paramInt12)] -= d5 * paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
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
        if (((paramArrayOfDouble5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] == 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          n = i7;
          for (i30 = Math.min(paramInt4, i8 + 3) - i7 + 1; i30 > 0; i30--)
          {
            d5 = paramArrayOfDouble5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * (paramArrayOfDouble3[(n - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble3[(n - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)]);
            paramArrayOfDouble3[(n - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] -= d5;
            paramArrayOfDouble3[(n - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)] -= d5 * paramArrayOfDouble5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)];
            n += 1;
          }
          if (i25 != 0)
          {
            i11 = i8 - m;
            n = Math.max(1, paramInt3 - m);
            for (i30 = i10 - Math.max(1, paramInt3 - m) + 1; i30 > 0; i30--)
            {
              d5 = paramArrayOfDouble5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * (paramArrayOfDouble6[(n - 1 + (i11 + 1 - 1) * paramInt17 + paramInt16)] + paramArrayOfDouble5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble6[(n - 1 + (i11 + 2 - 1) * paramInt17 + paramInt16)]);
              paramArrayOfDouble6[(n - 1 + (i11 + 1 - 1) * paramInt17 + paramInt16)] -= d5;
              paramArrayOfDouble6[(n - 1 + (i11 + 2 - 1) * paramInt17 + paramInt16)] -= d5 * paramArrayOfDouble5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)];
              n += 1;
            }
          }
          else if (paramBoolean2)
          {
            n = paramInt10;
            i30 = paramInt11 - paramInt10 + 1;
            for (;;)
            {
              d5 = paramArrayOfDouble5[(1 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * (paramArrayOfDouble4[(n - 1 + (i8 + 1 - 1) * paramInt13 + paramInt12)] + paramArrayOfDouble5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble4[(n - 1 + (i8 + 2 - 1) * paramInt13 + paramInt12)]);
              paramArrayOfDouble4[(n - 1 + (i8 + 1 - 1) * paramInt13 + paramInt12)] -= d5;
              paramArrayOfDouble4[(n - 1 + (i8 + 2 - 1) * paramInt13 + paramInt12)] -= d5 * paramArrayOfDouble5[(2 - 1 + (i16 - 1) * paramInt15 + paramInt14)];
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
          if ((paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] == 0.0D ? 0 : 1) != 0)
          {
            d9 = Math.abs(paramArrayOfDouble3[(i8 - 1 + (i8 - 1) * paramInt9 + paramInt8)]) + Math.abs(paramArrayOfDouble3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]);
            if ((d9 != 0.0D ? 0 : 1) != 0)
            {
              if ((i8 < paramInt3 + 1 ? 0 : 1) != 0) {
                d9 += Math.abs(paramArrayOfDouble3[(i8 - 1 + (i8 - 1 - 1) * paramInt9 + paramInt8)]);
              }
              if ((i8 < paramInt3 + 2 ? 0 : 1) != 0) {
                d9 += Math.abs(paramArrayOfDouble3[(i8 - 1 + (i8 - 2 - 1) * paramInt9 + paramInt8)]);
              }
              if ((i8 < paramInt3 + 3 ? 0 : 1) != 0) {
                d9 += Math.abs(paramArrayOfDouble3[(i8 - 1 + (i8 - 3 - 1) * paramInt9 + paramInt8)]);
              }
              if ((i8 > paramInt4 - 2 ? 0 : 1) != 0) {
                d9 += Math.abs(paramArrayOfDouble3[(i8 + 2 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]);
              }
              if ((i8 > paramInt4 - 3 ? 0 : 1) != 0) {
                d9 += Math.abs(paramArrayOfDouble3[(i8 + 3 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]);
              }
              if ((i8 > paramInt4 - 4 ? 0 : 1) != 0) {
                d9 += Math.abs(paramArrayOfDouble3[(i8 + 4 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]);
              }
            }
            if ((Math.abs(paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)]) > Math.max(d7, d11 * d9) ? 0 : 1) != 0)
            {
              d2 = Math.max(Math.abs(paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)]), Math.abs(paramArrayOfDouble3[(i8 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]));
              d3 = Math.min(Math.abs(paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)]), Math.abs(paramArrayOfDouble3[(i8 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]));
              d1 = Math.max(Math.abs(paramArrayOfDouble3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]), Math.abs(paramArrayOfDouble3[(i8 - 1 + (i8 - 1) * paramInt9 + paramInt8)] - paramArrayOfDouble3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]));
              d4 = Math.min(Math.abs(paramArrayOfDouble3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]), Math.abs(paramArrayOfDouble3[(i8 - 1 + (i8 - 1) * paramInt9 + paramInt8)] - paramArrayOfDouble3[(i8 + 1 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)]));
              d6 = d1 + d2;
              d10 = d4 * (d1 / d6);
              if ((d10 != 0.0D ? 0 : 1) == 0) {}
              if (((d3 * (d2 / d6) > Math.max(d7, d11 * d10) ? 0 : 1) == 0 ? 0 : 1) != 0) {
                paramArrayOfDouble3[(i8 + 1 - 1 + (i8 - 1) * paramInt9 + paramInt8)] = 0.0D;
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
          d5 = paramArrayOfDouble5[(1 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)] * paramArrayOfDouble3[(i8 + 4 - 1 + (i8 + 3 - 1) * paramInt9 + paramInt8)];
          paramArrayOfDouble3[(i8 + 4 - 1 + (i8 + 1 - 1) * paramInt9 + paramInt8)] = (-d5);
          paramArrayOfDouble3[(i8 + 4 - 1 + (i8 + 2 - 1) * paramInt9 + paramInt8)] = (-(d5 * paramArrayOfDouble5[(2 - 1 + (i15 - 1) * paramInt15 + paramInt14)]));
          paramArrayOfDouble3[(i8 + 4 - 1 + (i8 + 3 - 1) * paramInt9 + paramInt8)] -= d5 * paramArrayOfDouble5[(3 - 1 + (i15 - 1) * paramInt15 + paramInt14)];
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
            Dgemm.dgemm("C", "N", i24, i5, i24, 1.0D, paramArrayOfDouble6, i9 - 1 + (i9 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfDouble3, m + i9 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, 0.0D, paramArrayOfDouble8, paramInt22, paramInt23);
            Dlacpy.dlacpy("ALL", i24, i5, paramArrayOfDouble8, paramInt22, paramInt23, paramArrayOfDouble3, m + i9 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
            i4 += paramInt21;
          }
          i6 = i7;
          for (i29 = (Math.max(paramInt3, m) - 1 - i7 + paramInt18) / paramInt18; i29 > 0; i29--)
          {
            i5 = Math.min(paramInt18, Math.max(paramInt3, m) - i6);
            Dgemm.dgemm("N", "N", i5, i24, i24, 1.0D, paramArrayOfDouble3, i6 - 1 + (m + i9 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble6, i9 - 1 + (i9 - 1) * paramInt17 + paramInt16, paramInt17, 0.0D, paramArrayOfDouble7, paramInt19, paramInt20);
            Dlacpy.dlacpy("ALL", i5, i24, paramArrayOfDouble7, paramInt19, paramInt20, paramArrayOfDouble3, i6 - 1 + (m + i9 - 1) * paramInt9 + paramInt8, paramInt9);
            i6 += paramInt18;
          }
          if (paramBoolean2)
          {
            i6 = paramInt10;
            for (i29 = (paramInt11 - paramInt10 + paramInt18) / paramInt18; i29 > 0; i29--)
            {
              i5 = Math.min(paramInt18, paramInt11 - i6 + 1);
              Dgemm.dgemm("N", "N", i5, i24, i24, 1.0D, paramArrayOfDouble4, i6 - 1 + (m + i9 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, i9 - 1 + (i9 - 1) * paramInt17 + paramInt16, paramInt17, 0.0D, paramArrayOfDouble7, paramInt19, paramInt20);
              Dlacpy.dlacpy("ALL", i5, i24, paramArrayOfDouble7, paramInt19, paramInt20, paramArrayOfDouble4, i6 - 1 + (m + i9 - 1) * paramInt13 + paramInt12, paramInt13);
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
            Dlacpy.dlacpy("ALL", i12, i5, paramArrayOfDouble3, m + 1 + i1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble8, i14 + 1 - 1 + (1 - 1) * paramInt23 + paramInt22, paramInt23);
            Dlaset.dlaset("ALL", i14, i5, 0.0D, 0.0D, paramArrayOfDouble8, paramInt22, paramInt23);
            Dtrmm.dtrmm("L", "U", "C", "N", i12, i5, 1.0D, paramArrayOfDouble6, i1 + 1 - 1 + (1 + i14 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfDouble8, i14 + 1 - 1 + (1 - 1) * paramInt23 + paramInt22, paramInt23);
            Dgemm.dgemm("C", "N", j, i5, i1, 1.0D, paramArrayOfDouble6, paramInt16, paramInt17, paramArrayOfDouble3, m + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, 1.0D, paramArrayOfDouble8, paramInt22, paramInt23);
            Dlacpy.dlacpy("ALL", i1, i5, paramArrayOfDouble3, m + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble8, j + 1 - 1 + (1 - 1) * paramInt23 + paramInt22, paramInt23);
            Dtrmm.dtrmm("L", "L", "C", "N", i1, i5, 1.0D, paramArrayOfDouble6, 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfDouble8, j + 1 - 1 + (1 - 1) * paramInt23 + paramInt22, paramInt23);
            Dgemm.dgemm("C", "N", k - j, i5, i2 - i1, 1.0D, paramArrayOfDouble6, i1 + 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfDouble3, m + 1 + i1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, 1.0D, paramArrayOfDouble8, j + 1 - 1 + (1 - 1) * paramInt23 + paramInt22, paramInt23);
            Dlacpy.dlacpy("ALL", i10, i5, paramArrayOfDouble8, paramInt22, paramInt23, paramArrayOfDouble3, m + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
            i4 += paramInt21;
          }
          i6 = i7;
          for (i29 = (Math.max(m, paramInt3) - 1 - i7 + paramInt18) / paramInt18; i29 > 0; i29--)
          {
            i5 = Math.min(paramInt18, Math.max(m, paramInt3) - i6);
            Dlacpy.dlacpy("ALL", i5, i12, paramArrayOfDouble3, i6 - 1 + (m + 1 + i1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble7, 1 - 1 + (1 + i14 - 1) * paramInt20 + paramInt19, paramInt20);
            Dlaset.dlaset("ALL", i5, i14, 0.0D, 0.0D, paramArrayOfDouble7, paramInt19, paramInt20);
            Dtrmm.dtrmm("R", "U", "N", "N", i5, i12, 1.0D, paramArrayOfDouble6, i1 + 1 - 1 + (1 + i14 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfDouble7, 1 - 1 + (1 + i14 - 1) * paramInt20 + paramInt19, paramInt20);
            Dgemm.dgemm("N", "N", i5, j, i1, 1.0D, paramArrayOfDouble3, i6 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble6, paramInt16, paramInt17, 1.0D, paramArrayOfDouble7, paramInt19, paramInt20);
            Dlacpy.dlacpy("ALL", i5, i1, paramArrayOfDouble3, i6 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
            Dtrmm.dtrmm("R", "L", "N", "N", i5, k - j, 1.0D, paramArrayOfDouble6, 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfDouble7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
            Dgemm.dgemm("N", "N", i5, k - j, i2 - i1, 1.0D, paramArrayOfDouble3, i6 - 1 + (m + 1 + i1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble6, i1 + 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, 1.0D, paramArrayOfDouble7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
            Dlacpy.dlacpy("ALL", i5, i10, paramArrayOfDouble7, paramInt19, paramInt20, paramArrayOfDouble3, i6 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, paramInt9);
            i6 += paramInt18;
          }
          if (paramBoolean2)
          {
            i6 = paramInt10;
            for (i29 = (paramInt11 - paramInt10 + paramInt18) / paramInt18; i29 > 0; i29--)
            {
              i5 = Math.min(paramInt18, paramInt11 - i6 + 1);
              Dlacpy.dlacpy("ALL", i5, i12, paramArrayOfDouble4, i6 - 1 + (m + 1 + i1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble7, 1 - 1 + (1 + i14 - 1) * paramInt20 + paramInt19, paramInt20);
              Dlaset.dlaset("ALL", i5, i14, 0.0D, 0.0D, paramArrayOfDouble7, paramInt19, paramInt20);
              Dtrmm.dtrmm("R", "U", "N", "N", i5, i12, 1.0D, paramArrayOfDouble6, i1 + 1 - 1 + (1 + i14 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfDouble7, 1 - 1 + (1 + i14 - 1) * paramInt20 + paramInt19, paramInt20);
              Dgemm.dgemm("N", "N", i5, j, i1, 1.0D, paramArrayOfDouble4, i6 - 1 + (m + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, paramInt16, paramInt17, 1.0D, paramArrayOfDouble7, paramInt19, paramInt20);
              Dlacpy.dlacpy("ALL", i5, i1, paramArrayOfDouble4, i6 - 1 + (m + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
              Dtrmm.dtrmm("R", "L", "N", "N", i5, k - j, 1.0D, paramArrayOfDouble6, 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfDouble7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
              Dgemm.dgemm("N", "N", i5, k - j, i2 - i1, 1.0D, paramArrayOfDouble4, i6 - 1 + (m + 1 + i1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, i1 + 1 - 1 + (j + 1 - 1) * paramInt17 + paramInt16, paramInt17, 1.0D, paramArrayOfDouble7, 1 - 1 + (1 + j - 1) * paramInt20 + paramInt19, paramInt20);
              Dlacpy.dlacpy("ALL", i5, i10, paramArrayOfDouble7, paramInt19, paramInt20, paramArrayOfDouble4, i6 - 1 + (m + 1 - 1) * paramInt13 + paramInt12, paramInt13);
              i6 += paramInt18;
            }
          }
        }
      }
      m += 3 * i21 - 2;
    }
  }
  
  private static void dlarfg_adapter(int paramInt1, doubleW paramdoubleW, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble2[paramInt4]);
    Dlarfg.dlarfg(paramInt1, paramdoubleW, paramArrayOfDouble1, paramInt2, paramInt3, localdoubleW);
    paramArrayOfDouble2[paramInt4] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqr5.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */