package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slarre
{
  public static void slarre(String paramString, int paramInt1, floatW paramfloatW1, floatW paramfloatW2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float paramFloat1, float paramFloat2, float paramFloat3, intW paramintW1, int[] paramArrayOfInt1, int paramInt7, intW paramintW2, float[] paramArrayOfFloat4, int paramInt8, float[] paramArrayOfFloat5, int paramInt9, float[] paramArrayOfFloat6, int paramInt10, int[] paramArrayOfInt2, int paramInt11, int[] paramArrayOfInt3, int paramInt12, float[] paramArrayOfFloat7, int paramInt13, floatW paramfloatW3, float[] paramArrayOfFloat8, int paramInt14, int[] paramArrayOfInt4, int paramInt15, intW paramintW3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    intW localintW4 = new intW(0);
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    intW localintW5 = new intW(0);
    int i10 = 0;
    int i11 = 0;
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
    float f22 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    int[] arrayOfInt = new int[4];
    paramintW3.val = 0;
    if (Lsame.lsame(paramString, "A")) {
      i6 = 1;
    } else if (Lsame.lsame(paramString, "V")) {
      i6 = 3;
    } else if (Lsame.lsame(paramString, "I")) {
      i6 = 2;
    }
    paramintW2.val = 0;
    f18 = Slamch.slamch("S");
    f9 = Slamch.slamch("P");
    f14 = 100.0F * f9;
    f2 = (float)Math.sqrt(f9) * 5.0E-4F;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((i6 != 1 ? 0 : 1) == 0)
      {
        if ((i6 != 3 ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat1[(1 - 1 + paramInt4)] <= paramfloatW1.val ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((paramArrayOfFloat1[(1 - 1 + paramInt4)] > paramfloatW2.val ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0)
      {
        if ((i6 != 2 ? 0 : 1) != 0) {}
        if (((paramInt2 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((paramInt3 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = 1;
        paramArrayOfFloat4[(1 - 1 + paramInt8)] = paramArrayOfFloat1[(1 - 1 + paramInt4)];
        paramArrayOfFloat5[(1 - 1 + paramInt9)] = 0.0F;
        paramArrayOfFloat6[(1 - 1 + paramInt10)] = 0.0F;
        paramArrayOfInt2[(1 - 1 + paramInt11)] = 1;
        paramArrayOfInt3[(1 - 1 + paramInt12)] = 1;
        paramArrayOfFloat7[(1 - 1 + paramInt13)] = paramArrayOfFloat1[(1 - 1 + paramInt4)];
        paramArrayOfFloat7[(2 - 1 + paramInt13)] = paramArrayOfFloat1[(1 - 1 + paramInt4)];
      }
      paramArrayOfFloat2[(1 - 1 + paramInt5)] = 0.0F;
      return;
    }
    f10 = paramArrayOfFloat1[(1 - 1 + paramInt4)];
    f11 = paramArrayOfFloat1[(1 - 1 + paramInt4)];
    f8 = 0.0F;
    f7 = 0.0F;
    paramArrayOfFloat2[(paramInt1 - 1 + paramInt5)] = 0.0F;
    m = 1;
    for (int i12 = paramInt1 - 1 + 1; i12 > 0; i12--)
    {
      paramArrayOfFloat5[(m - 1 + paramInt9)] = 0.0F;
      paramArrayOfFloat6[(m - 1 + paramInt10)] = 0.0F;
      f6 = Math.abs(paramArrayOfFloat2[(m - 1 + paramInt5)]);
      if ((f6 < f7 ? 0 : 1) != 0) {
        f7 = f6;
      }
      localfloatW2.val = (f6 + f8);
      paramArrayOfFloat7[(2 * m - 1 - 1 + paramInt13)] = (paramArrayOfFloat1[(m - 1 + paramInt4)] - localfloatW2.val);
      f10 = Math.min(f10, paramArrayOfFloat7[(2 * m - 1 - 1 + paramInt13)]);
      paramArrayOfFloat7[(2 * m - 1 + paramInt13)] = (paramArrayOfFloat1[(m - 1 + paramInt4)] + localfloatW2.val);
      f11 = Math.max(f11, paramArrayOfFloat7[(2 * m - 1 + paramInt13)]);
      f8 = f6;
      m += 1;
    }
    paramfloatW3.val = (f18 * Math.max(1.0F, (float)Math.pow(f7, 2)));
    f21 = f11 - f10;
    Slarra.slarra(paramInt1, paramArrayOfFloat1, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat3, paramInt6, paramFloat3, f21, paramintW1, paramArrayOfInt1, paramInt7, localintW4);
    i = 0;
    if ((i6 != 1 ? 0 : 1) != 0) {}
    if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
    {
      paramfloatW1.val = f10;
      paramfloatW2.val = f11;
    }
    else
    {
      Slarrd.slarrd(paramString, "B", paramInt1, paramfloatW1.val, paramfloatW2.val, paramInt2, paramInt3, paramArrayOfFloat7, paramInt13, f2, paramArrayOfFloat1, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat3, paramInt6, paramfloatW3.val, paramintW1.val, paramArrayOfInt1, paramInt7, localintW5, paramArrayOfFloat4, paramInt8, paramArrayOfFloat5, paramInt9, paramfloatW1, paramfloatW2, paramArrayOfInt2, paramInt11, paramArrayOfInt3, paramInt12, paramArrayOfFloat8, paramInt14, paramArrayOfInt4, paramInt15, localintW4);
      if ((localintW4.val == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -1;
        return;
      }
      m = localintW5.val + 1;
      for (i12 = paramInt1 - (localintW5.val + 1) + 1; i12 > 0; i12--)
      {
        paramArrayOfFloat4[(m - 1 + paramInt8)] = 0.0F;
        paramArrayOfFloat5[(m - 1 + paramInt9)] = 0.0F;
        paramArrayOfInt2[(m - 1 + paramInt11)] = 0;
        paramArrayOfInt3[(m - 1 + paramInt12)] = 0;
        m += 1;
      }
    }
    n = 1;
    i10 = 1;
    i8 = 1;
    for (i12 = paramintW1.val - 1 + 1; i12 > 0; i12--)
    {
      i2 = paramArrayOfInt1[(i8 - 1 + paramInt7)];
      i3 = i2 - n + 1;
      if ((i3 != 1 ? 0 : 1) != 0)
      {
        if ((i6 != 1 ? 0 : 1) == 0)
        {
          if ((i6 != 3 ? 0 : 1) != 0) {}
          if (((paramArrayOfFloat1[(n - 1 + paramInt4)] <= paramfloatW1.val ? 0 : 1) != 0 ? 1 : 0) == 0) {}
        }
        if ((((paramArrayOfFloat1[(n - 1 + paramInt4)] > paramfloatW2.val ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
          if ((i6 != 2 ? 0 : 1) == 0) {}
        }
        if ((((paramArrayOfInt2[(i10 - 1 + paramInt11)] != i8 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW2.val += 1;
          paramArrayOfFloat4[(paramintW2.val - 1 + paramInt8)] = paramArrayOfFloat1[(n - 1 + paramInt4)];
          paramArrayOfFloat5[(paramintW2.val - 1 + paramInt9)] = 0.0F;
          paramArrayOfFloat6[(paramintW2.val - 1 + paramInt10)] = 0.0F;
          paramArrayOfInt2[(paramintW2.val - 1 + paramInt11)] = i8;
          paramArrayOfInt3[(paramintW2.val - 1 + paramInt12)] = 1;
          i10 += 1;
        }
        paramArrayOfFloat2[(i2 - 1 + paramInt5)] = 0.0F;
        n = i2 + 1;
      }
      else
      {
        paramArrayOfFloat2[(i2 - 1 + paramInt5)] = 0.0F;
        f10 = paramArrayOfFloat1[(n - 1 + paramInt4)];
        f11 = paramArrayOfFloat1[(n - 1 + paramInt4)];
        m = n;
        for (int i13 = i2 - n + 1; i13 > 0; i13--)
        {
          f10 = Math.min(paramArrayOfFloat7[(2 * m - 1 - 1 + paramInt13)], f10);
          f11 = Math.max(paramArrayOfFloat7[(2 * m - 1 + paramInt13)], f11);
          m += 1;
        }
        f21 = f11 - f10;
        if ((i6 != 1 ? 0 : 1) != 0) {}
        if ((((i ^ 0x1) != 0 ? 1 : 0) ^ 0x1) != 0)
        {
          i9 = 0;
          m = i10;
          for (i13 = localintW5.val - i10 + 1; i13 > 0; i13--)
          {
            if ((paramArrayOfInt2[(m - 1 + paramInt11)] != i8 ? 0 : 1) != 0) {
              i9 += 1;
            } else {
              break;
            }
            m += 1;
          }
          if ((i9 != 0 ? 0 : 1) != 0)
          {
            paramArrayOfFloat2[(i2 - 1 + paramInt5)] = 0.0F;
            n = i2 + 1;
            break label4801;
          }
          else
          {
            if ((i9 <= 0.5F * i3 ? 0 : 1) != 0) {}
            k = (i ^ 0x1) != 0 ? 1 : 0;
            i11 = i10 + i9 - 1;
            f20 = 0.0F;
            m = i10;
            for (i13 = i11 - 1 - i10 + 1; i13 > 0; i13--)
            {
              paramArrayOfFloat6[(m - 1 + paramInt10)] = Math.max(0.0F, paramArrayOfFloat4[(m + 1 - 1 + paramInt8)] - paramArrayOfFloat5[(m + 1 - 1 + paramInt9)] - (paramArrayOfFloat4[(m - 1 + paramInt8)] + paramArrayOfFloat5[(m - 1 + paramInt9)]));
              m += 1;
            }
            paramArrayOfFloat6[(i11 - 1 + paramInt10)] = Math.max(0.0F, paramfloatW2.val - f20 - (paramArrayOfFloat4[(i11 - 1 + paramInt8)] + paramArrayOfFloat5[(i11 - 1 + paramInt9)]));
            i4 = paramArrayOfInt3[(i10 - 1 + paramInt12)];
            i5 = paramArrayOfInt3[(i11 - 1 + paramInt12)];
          }
        }
        else
        {
          if ((i6 != 1 ? 0 : 1) != 0) {}
          if (((i ^ 0x1) != 0 ? 1 : 0) == 0) {}
          if ((k == 0 ? 0 : 1) != 0)
          {
            Slarrk.slarrk(i3, 1, f10, f11, paramArrayOfFloat1, n - 1 + paramInt4, paramArrayOfFloat3, n - 1 + paramInt6, paramfloatW3.val, f14, localfloatW1, localfloatW2, localintW4);
            if ((localintW4.val == 0 ? 0 : 1) != 0)
            {
              paramintW3.val = -1;
              return;
            }
            f12 = Math.max(f10, localfloatW1.val - localfloatW2.val - 100.0F * f9 * Math.abs(localfloatW1.val - localfloatW2.val));
            Slarrk.slarrk(i3, i3, f10, f11, paramArrayOfFloat1, n - 1 + paramInt4, paramArrayOfFloat3, n - 1 + paramInt6, paramfloatW3.val, f14, localfloatW1, localfloatW2, localintW4);
            if ((localintW4.val == 0 ? 0 : 1) != 0)
            {
              paramintW3.val = -1;
              return;
            }
            f13 = Math.min(f11, localfloatW1.val + localfloatW2.val + 100.0F * f9 * Math.abs(localfloatW1.val + localfloatW2.val));
            f21 = f13 - f12;
          }
          else
          {
            f12 = Math.max(f10, paramArrayOfFloat4[(i10 - 1 + paramInt8)] - paramArrayOfFloat5[(i10 - 1 + paramInt9)] - 100.0F * f9 * Math.abs(paramArrayOfFloat4[(i10 - 1 + paramInt8)] - paramArrayOfFloat5[(i10 - 1 + paramInt9)]));
            f13 = Math.min(f11, paramArrayOfFloat4[(i11 - 1 + paramInt8)] + paramArrayOfFloat5[(i11 - 1 + paramInt9)] + 100.0F * f9 * Math.abs(paramArrayOfFloat4[(i11 - 1 + paramInt8)] + paramArrayOfFloat5[(i11 - 1 + paramInt9)]));
          }
          if ((i6 != 1 ? 0 : 1) != 0) {}
          if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
          {
            k = 1;
            i4 = 1;
            i5 = i3;
            i9 = i3;
            i11 = i10 + i9 - 1;
            f16 = f12 + 0.25F * f21;
            f17 = f13 - 0.25F * f21;
          }
          else if (k != 0)
          {
            f16 = f12 + 0.25F * f21;
            f17 = f13 - 0.25F * f21;
          }
          else
          {
            localfloatW1.val = (Math.min(f13, paramfloatW2.val) - Math.max(f12, paramfloatW1.val));
            f16 = Math.max(f12, paramfloatW1.val) + 0.25F * localfloatW1.val;
            f17 = Math.min(f13, paramfloatW2.val) - 0.25F * localfloatW1.val;
          }
          if ((i9 <= 1 ? 0 : 1) != 0) {
            Slarrc.slarrc("T", i3, f16, f17, paramArrayOfFloat1, n - 1 + paramInt4, paramArrayOfFloat2, n - 1 + paramInt5, paramfloatW3.val, localintW1, localintW2, localintW3, localintW4);
          }
          if ((i9 != 1 ? 0 : 1) != 0)
          {
            f20 = f10;
            f19 = 1.0F;
          }
          else if ((localintW2.val - i4 < i5 - localintW3.val ? 0 : 1) != 0)
          {
            if ((i6 != 1 ? 0 : 1) != 0) {}
            if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
              f20 = Math.max(f12, f10);
            } else if (k != 0) {
              f20 = f12;
            } else {
              f20 = Math.max(f12, paramfloatW1.val);
            }
            f19 = 1.0F;
          }
          else
          {
            if ((i6 != 1 ? 0 : 1) != 0) {}
            if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
              f20 = Math.min(f13, f11);
            } else if (k != 0) {
              f20 = f13;
            } else {
              f20 = Math.min(f13, paramfloatW2.val);
            }
            f19 = -1.0F;
          }
          if (k != 0)
          {
            f22 = f21 * f9 * paramInt1 + 2.0F * paramfloatW3.val;
          }
          else if ((i9 <= 1 ? 0 : 1) != 0)
          {
            f3 = paramArrayOfFloat4[(i11 - 1 + paramInt8)] + paramArrayOfFloat5[(i11 - 1 + paramInt9)] - paramArrayOfFloat4[(i10 - 1 + paramInt8)] - paramArrayOfFloat5[(i10 - 1 + paramInt9)];
            f1 = Math.abs(f3 / (i11 - i10));
            if ((f19 != 1.0F ? 0 : 1) != 0)
            {
              f22 = 0.5F * Math.max(paramArrayOfFloat6[(i10 - 1 + paramInt10)], f1);
              f22 = Math.max(f22, paramArrayOfFloat5[(i10 - 1 + paramInt9)]);
            }
            else
            {
              f22 = 0.5F * Math.max(paramArrayOfFloat6[(i11 - 1 - 1 + paramInt10)], f1);
              f22 = Math.max(f22, paramArrayOfFloat5[(i11 - 1 + paramInt9)]);
            }
          }
          else
          {
            f22 = paramArrayOfFloat5[(i10 - 1 + paramInt9)];
          }
          i1 = 1;
          for (i13 = 6 - 1 + 1; i13 > 0; i13--)
          {
            f5 = paramArrayOfFloat1[(n - 1 + paramInt4)] - f20;
            paramArrayOfFloat8[(1 - 1 + paramInt14)] = f5;
            f4 = Math.abs(paramArrayOfFloat8[(1 - 1 + paramInt14)]);
            i7 = n;
            m = 1;
            for (int i14 = i3 - 1 - 1 + 1; i14 > 0; i14--)
            {
              paramArrayOfFloat8[(2 * i3 + m - 1 + paramInt14)] = (1.0F / paramArrayOfFloat8[(m - 1 + paramInt14)]);
              localfloatW1.val = (paramArrayOfFloat2[(i7 - 1 + paramInt5)] * paramArrayOfFloat8[(2 * i3 + m - 1 + paramInt14)]);
              paramArrayOfFloat8[(i3 + m - 1 + paramInt14)] = localfloatW1.val;
              f5 = paramArrayOfFloat1[(i7 + 1 - 1 + paramInt4)] - f20 - localfloatW1.val * paramArrayOfFloat2[(i7 - 1 + paramInt5)];
              paramArrayOfFloat8[(m + 1 - 1 + paramInt14)] = f5;
              f4 = Math.max(f4, Math.abs(f5));
              i7 += 1;
              m += 1;
            }
            if ((f4 <= 64.0F * f21 ? 0 : 1) != 0) {
              j = 1;
            } else {
              j = 0;
            }
            if (((k != 0) && ((j ^ 0x1) != 0) ? 1 : 0) != 0)
            {
              m = 1;
              for (i14 = i3 - 1 + 1; i14 > 0; i14--)
              {
                localfloatW1.val = (f19 * paramArrayOfFloat8[(m - 1 + paramInt14)]);
                if ((localfloatW1.val >= 0.0F ? 0 : 1) != 0) {
                  j = 1;
                }
                m += 1;
              }
            }
            if (j != 0)
            {
              if ((i1 != 6 - 1 ? 0 : 1) != 0)
              {
                if ((f19 != 1.0F ? 0 : 1) != 0) {
                  f20 = f10 - 2.0F * f21 * f9 * paramInt1 - 2.0F * 2.0F * paramfloatW3.val;
                } else {
                  f20 = f11 + 2.0F * f21 * f9 * paramInt1 + 2.0F * 2.0F * paramfloatW3.val;
                }
              }
              else
              {
                f20 -= f19 * f22;
                f22 = 2.0F * f22;
              }
            }
            else {
              break;
            }
            i1 += 1;
          }
          paramintW3.val = 2;
          return;
          paramArrayOfFloat2[(i2 - 1 + paramInt5)] = f20;
          Scopy.scopy(i3, paramArrayOfFloat8, paramInt14, 1, paramArrayOfFloat1, n - 1 + paramInt4, 1);
          Scopy.scopy(i3 - 1, paramArrayOfFloat8, i3 + 1 - 1 + paramInt14, 1, paramArrayOfFloat2, n - 1 + paramInt5, 1);
          if ((i9 <= 1 ? 0 : 1) != 0)
          {
            m = 1;
            for (i13 = 4 - 1 + 1; i13 > 0; i13--)
            {
              arrayOfInt[(m - 1)] = 1;
              m += 1;
            }
            Slarnv.slarnv(2, arrayOfInt, 0, 2 * i3 - 1, paramArrayOfFloat8, 1 - 1 + paramInt14);
            m = 1;
            for (i13 = i3 - 1 - 1 + 1; i13 > 0; i13--)
            {
              paramArrayOfFloat1[(n + m - 1 - 1 + paramInt4)] *= (1.0F + f9 * 4.0F * paramArrayOfFloat8[(m - 1 + paramInt14)]);
              paramArrayOfFloat2[(n + m - 1 - 1 + paramInt5)] *= (1.0F + f9 * 4.0F * paramArrayOfFloat8[(i3 + m - 1 + paramInt14)]);
              m += 1;
            }
            paramArrayOfFloat1[(i2 - 1 + paramInt4)] *= (1.0F + f9 * 4.0F * paramArrayOfFloat8[(i3 - 1 + paramInt14)]);
          }
          if ((k ^ 0x1) != 0)
          {
            i7 = i10;
            for (i13 = i11 - i10 + 1; i13 > 0; i13--)
            {
              paramArrayOfFloat4[(i7 - 1 + paramInt8)] -= f20;
              paramArrayOfFloat5[(i7 - 1 + paramInt9)] += Math.abs(paramArrayOfFloat4[(i7 - 1 + paramInt8)]) * f9;
              i7 += 1;
            }
            m = n;
            for (i13 = i2 - 1 - n + 1; i13 > 0; i13--)
            {
              paramArrayOfFloat1[(m - 1 + paramInt4)] *= (float)Math.pow(paramArrayOfFloat2[(m - 1 + paramInt5)], 2);
              m += 1;
            }
            Slarrb.slarrb(i3, paramArrayOfFloat1, n - 1 + paramInt4, paramArrayOfFloat8, n - 1 + paramInt14, i4, i5, paramFloat1, paramFloat2, i4 - 1, paramArrayOfFloat4, i10 - 1 + paramInt8, paramArrayOfFloat6, i10 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt9, paramArrayOfFloat8, 2 * paramInt1 + 1 - 1 + paramInt14, paramArrayOfInt4, paramInt15, paramfloatW3.val, f21, i3, localintW4);
            if ((localintW4.val == 0 ? 0 : 1) != 0)
            {
              paramintW3.val = -4;
              return;
            }
            paramArrayOfFloat6[(i11 - 1 + paramInt10)] = Math.max(0.0F, paramfloatW2.val - f20 - (paramArrayOfFloat4[(i11 - 1 + paramInt8)] + paramArrayOfFloat5[(i11 - 1 + paramInt9)]));
            m = i4;
            for (i13 = i5 - i4 + 1; i13 > 0; i13--)
            {
              paramintW2.val += 1;
              paramArrayOfInt2[(paramintW2.val - 1 + paramInt11)] = i8;
              paramArrayOfInt3[(paramintW2.val - 1 + paramInt12)] = m;
              m += 1;
            }
          }
          else
          {
            f15 = (float)Math.log(i3) * 4.0F * f9;
            i7 = n;
            m = 1;
            for (i13 = i3 - 1 - 1 + 1; i13 > 0; i13--)
            {
              paramArrayOfFloat8[(2 * m - 1 - 1 + paramInt14)] = Math.abs(paramArrayOfFloat1[(i7 - 1 + paramInt4)]);
              paramArrayOfFloat8[(2 * m - 1 + paramInt14)] = (paramArrayOfFloat2[(i7 - 1 + paramInt5)] * paramArrayOfFloat2[(i7 - 1 + paramInt5)] * paramArrayOfFloat8[(2 * m - 1 - 1 + paramInt14)]);
              i7 += 1;
              m += 1;
            }
            paramArrayOfFloat8[(2 * i3 - 1 - 1 + paramInt14)] = Math.abs(paramArrayOfFloat1[(i2 - 1 + paramInt4)]);
            paramArrayOfFloat8[(2 * i3 - 1 + paramInt14)] = 0.0F;
            Slasq2.slasq2(i3, paramArrayOfFloat8, paramInt14, localintW4);
            if ((localintW4.val == 0 ? 0 : 1) != 0)
            {
              paramintW3.val = -5;
              return;
            }
            m = 1;
            for (i13 = i3 - 1 + 1; i13 > 0; i13--)
            {
              if ((paramArrayOfFloat8[(m - 1 + paramInt14)] >= 0.0F ? 0 : 1) != 0)
              {
                paramintW3.val = -6;
                return;
              }
              m += 1;
            }
            if ((f19 <= 0.0F ? 0 : 1) != 0)
            {
              m = i4;
              for (i13 = i5 - i4 + 1; i13 > 0; i13--)
              {
                paramintW2.val += 1;
                paramArrayOfFloat4[(paramintW2.val - 1 + paramInt8)] = paramArrayOfFloat8[(i3 - m + 1 - 1 + paramInt14)];
                paramArrayOfInt2[(paramintW2.val - 1 + paramInt11)] = i8;
                paramArrayOfInt3[(paramintW2.val - 1 + paramInt12)] = m;
                m += 1;
              }
            }
            else
            {
              m = i4;
              for (i13 = i5 - i4 + 1; i13 > 0; i13--)
              {
                paramintW2.val += 1;
                paramArrayOfFloat4[(paramintW2.val - 1 + paramInt8)] = (-paramArrayOfFloat8[(m - 1 + paramInt14)]);
                paramArrayOfInt2[(paramintW2.val - 1 + paramInt11)] = i8;
                paramArrayOfInt3[(paramintW2.val - 1 + paramInt12)] = m;
                m += 1;
              }
            }
            m = paramintW2.val - i9 + 1;
            for (i13 = paramintW2.val - (paramintW2.val - i9 + 1) + 1; i13 > 0; i13--)
            {
              paramArrayOfFloat5[(m - 1 + paramInt9)] = (f15 * Math.abs(paramArrayOfFloat4[(m - 1 + paramInt8)]));
              m += 1;
            }
            m = paramintW2.val - i9 + 1;
            for (i13 = paramintW2.val - 1 - (paramintW2.val - i9 + 1) + 1; i13 > 0; i13--)
            {
              paramArrayOfFloat6[(m - 1 + paramInt10)] = Math.max(0.0F, paramArrayOfFloat4[(m + 1 - 1 + paramInt8)] - paramArrayOfFloat5[(m + 1 - 1 + paramInt9)] - (paramArrayOfFloat4[(m - 1 + paramInt8)] + paramArrayOfFloat5[(m - 1 + paramInt9)]));
              m += 1;
            }
            paramArrayOfFloat6[(paramintW2.val - 1 + paramInt10)] = Math.max(0.0F, paramfloatW2.val - f20 - (paramArrayOfFloat4[(paramintW2.val - 1 + paramInt8)] + paramArrayOfFloat5[(paramintW2.val - 1 + paramInt9)]));
          }
          n = i2 + 1;
          i10 = i11 + 1;
        }
      }
      label4801:
      i8 += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarre.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */