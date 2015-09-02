package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Srot;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slahqr
{
  public static void slahqr(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, intW paramintW)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
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
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    float f17 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    float f18 = 0.0F;
    floatW localfloatW5 = new floatW(0.0F);
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    float f22 = 0.0F;
    float f23 = 0.0F;
    float f24 = 0.0F;
    float f25 = 0.0F;
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
    float[] arrayOfFloat = new float[3];
    paramintW.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt2 != paramInt3 ? 0 : 1) != 0)
    {
      paramArrayOfFloat2[(paramInt2 - 1 + paramInt6)] = paramArrayOfFloat1[(paramInt2 - 1 + (paramInt2 - 1) * paramInt5 + paramInt4)];
      paramArrayOfFloat3[(paramInt2 - 1 + paramInt7)] = 0.0F;
      return;
    }
    n = paramInt2;
    for (int i7 = paramInt3 - 3 - paramInt2 + 1; i7 > 0; i7--)
    {
      paramArrayOfFloat1[(n + 2 - 1 + (n - 1) * paramInt5 + paramInt4)] = 0.0F;
      paramArrayOfFloat1[(n + 3 - 1 + (n - 1) * paramInt5 + paramInt4)] = 0.0F;
      n += 1;
    }
    if ((paramInt2 > paramInt3 - 2 ? 0 : 1) != 0) {
      paramArrayOfFloat1[(paramInt3 - 1 + (paramInt3 - 2 - 1) * paramInt5 + paramInt4)] = 0.0F;
    }
    i4 = paramInt3 - paramInt2 + 1;
    i6 = paramInt9 - paramInt8 + 1;
    localfloatW3.val = Slamch.slamch("SAFE MINIMUM");
    localfloatW2.val = (1.0F / localfloatW3.val);
    Slabad.slabad(localfloatW3, localfloatW2);
    f23 = Slamch.slamch("PRECISION");
    f17 = localfloatW3.val * (i4 / f23);
    if (paramBoolean1)
    {
      j = 1;
      k = paramInt1;
    }
    for (i = paramInt3;; i = i2 - 1)
    {
      i2 = paramInt2;
      if ((i >= paramInt2 ? 0 : 1) != 0) {
        break;
      }
      m = 0;
      for (int i7 = 30 - 0 + 1; i7 > 0; i7--)
      {
        i1 = i;
        for (int i8 = (i2 + 1 - i + -1) / -1; i8 > 0; i8--)
        {
          if ((Math.abs(paramArrayOfFloat1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]) > f17 ? 0 : 1) != 0) {
            break;
          }
          f22 = Math.abs(paramArrayOfFloat1[(i1 - 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfFloat1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]);
          if ((f22 != 0.0F ? 0 : 1) != 0)
          {
            if ((i1 - 2 < paramInt2 ? 0 : 1) != 0) {
              f22 += Math.abs(paramArrayOfFloat1[(i1 - 1 - 1 + (i1 - 2 - 1) * paramInt5 + paramInt4)]);
            }
            if ((i1 + 1 > paramInt3 ? 0 : 1) != 0) {
              f22 += Math.abs(paramArrayOfFloat1[(i1 + 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]);
            }
          }
          if ((Math.abs(paramArrayOfFloat1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]) > f23 * f22 ? 0 : 1) != 0)
          {
            f2 = Math.max(Math.abs(paramArrayOfFloat1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfFloat1[(i1 - 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]));
            f3 = Math.min(Math.abs(paramArrayOfFloat1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfFloat1[(i1 - 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]));
            f1 = Math.max(Math.abs(paramArrayOfFloat1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfFloat1[(i1 - 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] - paramArrayOfFloat1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]));
            f4 = Math.min(Math.abs(paramArrayOfFloat1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfFloat1[(i1 - 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] - paramArrayOfFloat1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]));
            f16 = f1 + f2;
            if ((f3 * (f2 / f16) > Math.max(f17, f23 * (f4 * (f1 / f16))) ? 0 : 1) != 0) {
              break;
            }
          }
          i1 += -1;
        }
        i2 = i1;
        if ((i2 <= paramInt2 ? 0 : 1) != 0) {
          paramArrayOfFloat1[(i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
        }
        if ((i2 < i - 1 ? 0 : 1) != 0) {
          break;
        }
        if ((paramBoolean1 ^ true))
        {
          j = i2;
          k = i;
        }
        if ((m != 10 ? 0 : 1) == 0) {}
        if (((m != 20 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          f6 = 0.75F * f16 + paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
          f7 = -0.4375F * f16;
          f8 = f16;
          f10 = f6;
        }
        else
        {
          f6 = paramArrayOfFloat1[(i - 1 - 1 + (i - 1 - 1) * paramInt5 + paramInt4)];
          f8 = paramArrayOfFloat1[(i - 1 + (i - 1 - 1) * paramInt5 + paramInt4)];
          f7 = paramArrayOfFloat1[(i - 1 - 1 + (i - 1) * paramInt5 + paramInt4)];
          f10 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
        }
        f16 = Math.abs(f6) + Math.abs(f7) + Math.abs(f8) + Math.abs(f10);
        if ((f16 != 0.0F ? 0 : 1) != 0)
        {
          f12 = 0.0F;
          f11 = 0.0F;
          f14 = 0.0F;
          f13 = 0.0F;
        }
        else
        {
          f6 /= f16;
          f8 /= f16;
          f7 /= f16;
          f10 /= f16;
          f21 = (f6 + f10) / 2.0F;
          f5 = (f6 - f21) * (f10 - f21) - f7 * f8;
          f15 = (float)Math.sqrt(Math.abs(f5));
          if ((f5 < 0.0F ? 0 : 1) != 0)
          {
            f12 = f21 * f16;
            f14 = f12;
            f11 = f15 * f16;
            f13 = -f11;
          }
          else
          {
            f12 = f21 + f15;
            f14 = f21 - f15;
            if ((Math.abs(f12 - f10) > Math.abs(f14 - f10) ? 0 : 1) != 0)
            {
              f12 *= f16;
              f14 = f12;
            }
            else
            {
              f14 *= f16;
              f12 = f14;
            }
            f11 = 0.0F;
            f13 = 0.0F;
          }
        }
        i3 = i - 2;
        for (int i8 = (i2 - (i - 2) + -1) / -1; i8 > 0; i8--)
        {
          f9 = paramArrayOfFloat1[(i3 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4)];
          f16 = Math.abs(paramArrayOfFloat1[(i3 - 1 + (i3 - 1) * paramInt5 + paramInt4)] - f14) + Math.abs(f13) + Math.abs(f9);
          f9 = paramArrayOfFloat1[(i3 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4)] / f16;
          arrayOfFloat[(1 - 1)] = (f9 * paramArrayOfFloat1[(i3 - 1 + (i3 + 1 - 1) * paramInt5 + paramInt4)] + (paramArrayOfFloat1[(i3 - 1 + (i3 - 1) * paramInt5 + paramInt4)] - f12) * ((paramArrayOfFloat1[(i3 - 1 + (i3 - 1) * paramInt5 + paramInt4)] - f14) / f16) - f11 * (f13 / f16));
          arrayOfFloat[(2 - 1)] = (f9 * (paramArrayOfFloat1[(i3 - 1 + (i3 - 1) * paramInt5 + paramInt4)] + paramArrayOfFloat1[(i3 + 1 - 1 + (i3 + 1 - 1) * paramInt5 + paramInt4)] - f12 - f14));
          arrayOfFloat[(3 - 1)] = (f9 * paramArrayOfFloat1[(i3 + 2 - 1 + (i3 + 1 - 1) * paramInt5 + paramInt4)]);
          f16 = Math.abs(arrayOfFloat[(1 - 1)]) + Math.abs(arrayOfFloat[(2 - 1)]) + Math.abs(arrayOfFloat[(3 - 1)]);
          arrayOfFloat[(1 - 1)] /= f16;
          arrayOfFloat[(2 - 1)] /= f16;
          arrayOfFloat[(3 - 1)] /= f16;
          if ((i3 != i2 ? 0 : 1) != 0) {
            break;
          }
          if ((Math.abs(paramArrayOfFloat1[(i3 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4)]) * (Math.abs(arrayOfFloat[(2 - 1)]) + Math.abs(arrayOfFloat[(3 - 1)])) > f23 * Math.abs(arrayOfFloat[(1 - 1)]) * (Math.abs(paramArrayOfFloat1[(i3 - 1 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfFloat1[(i3 - 1 + (i3 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfFloat1[(i3 + 1 - 1 + (i3 + 1 - 1) * paramInt5 + paramInt4)])) ? 0 : 1) != 0) {
            break;
          }
          i3 += -1;
        }
        i1 = i3;
        for (int i8 = i - 1 - i3 + 1; i8 > 0; i8--)
        {
          i5 = Math.min(3, i - i1 + 1);
          if ((i1 <= i3 ? 0 : 1) != 0) {
            Scopy.scopy(i5, paramArrayOfFloat1, i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4, 1, arrayOfFloat, 0, 1);
          }
          slarfg_adapter(i5, arrayOfFloat, 1 - 1, arrayOfFloat, 2 - 1, 1, localfloatW5);
          if ((i1 <= i3 ? 0 : 1) != 0)
          {
            paramArrayOfFloat1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] = arrayOfFloat[(1 - 1)];
            paramArrayOfFloat1[(i1 + 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
            if ((i1 >= i - 1 ? 0 : 1) != 0) {
              paramArrayOfFloat1[(i1 + 2 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
            }
          }
          else if ((i3 <= i2 ? 0 : 1) != 0)
          {
            paramArrayOfFloat1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfFloat1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]);
          }
          f24 = arrayOfFloat[(2 - 1)];
          f19 = localfloatW5.val * f24;
          int i9;
          if ((i5 != 3 ? 0 : 1) != 0)
          {
            f25 = arrayOfFloat[(3 - 1)];
            f20 = localfloatW5.val * f25;
            n = i1;
            for (i9 = k - i1 + 1; i9 > 0; i9--)
            {
              f18 = paramArrayOfFloat1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)] + f24 * paramArrayOfFloat1[(i1 + 1 - 1 + (n - 1) * paramInt5 + paramInt4)] + f25 * paramArrayOfFloat1[(i1 + 2 - 1 + (n - 1) * paramInt5 + paramInt4)];
              paramArrayOfFloat1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)] -= f18 * localfloatW5.val;
              paramArrayOfFloat1[(i1 + 1 - 1 + (n - 1) * paramInt5 + paramInt4)] -= f18 * f19;
              paramArrayOfFloat1[(i1 + 2 - 1 + (n - 1) * paramInt5 + paramInt4)] -= f18 * f20;
              n += 1;
            }
            n = j;
            for (i9 = Math.min(i1 + 3, i) - j + 1; i9 > 0; i9--)
            {
              f18 = paramArrayOfFloat1[(n - 1 + (i1 - 1) * paramInt5 + paramInt4)] + f24 * paramArrayOfFloat1[(n - 1 + (i1 + 1 - 1) * paramInt5 + paramInt4)] + f25 * paramArrayOfFloat1[(n - 1 + (i1 + 2 - 1) * paramInt5 + paramInt4)];
              paramArrayOfFloat1[(n - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= f18 * localfloatW5.val;
              paramArrayOfFloat1[(n - 1 + (i1 + 1 - 1) * paramInt5 + paramInt4)] -= f18 * f19;
              paramArrayOfFloat1[(n - 1 + (i1 + 2 - 1) * paramInt5 + paramInt4)] -= f18 * f20;
              n += 1;
            }
            if (paramBoolean2)
            {
              n = paramInt8;
              for (i9 = paramInt9 - paramInt8 + 1; i9 > 0; i9--)
              {
                f18 = paramArrayOfFloat4[(n - 1 + (i1 - 1) * paramInt11 + paramInt10)] + f24 * paramArrayOfFloat4[(n - 1 + (i1 + 1 - 1) * paramInt11 + paramInt10)] + f25 * paramArrayOfFloat4[(n - 1 + (i1 + 2 - 1) * paramInt11 + paramInt10)];
                paramArrayOfFloat4[(n - 1 + (i1 - 1) * paramInt11 + paramInt10)] -= f18 * localfloatW5.val;
                paramArrayOfFloat4[(n - 1 + (i1 + 1 - 1) * paramInt11 + paramInt10)] -= f18 * f19;
                paramArrayOfFloat4[(n - 1 + (i1 + 2 - 1) * paramInt11 + paramInt10)] -= f18 * f20;
                n += 1;
              }
            }
          }
          else if ((i5 != 2 ? 0 : 1) != 0)
          {
            n = i1;
            for (i9 = k - i1 + 1; i9 > 0; i9--)
            {
              f18 = paramArrayOfFloat1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)] + f24 * paramArrayOfFloat1[(i1 + 1 - 1 + (n - 1) * paramInt5 + paramInt4)];
              paramArrayOfFloat1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)] -= f18 * localfloatW5.val;
              paramArrayOfFloat1[(i1 + 1 - 1 + (n - 1) * paramInt5 + paramInt4)] -= f18 * f19;
              n += 1;
            }
            n = j;
            for (i9 = i - j + 1; i9 > 0; i9--)
            {
              f18 = paramArrayOfFloat1[(n - 1 + (i1 - 1) * paramInt5 + paramInt4)] + f24 * paramArrayOfFloat1[(n - 1 + (i1 + 1 - 1) * paramInt5 + paramInt4)];
              paramArrayOfFloat1[(n - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= f18 * localfloatW5.val;
              paramArrayOfFloat1[(n - 1 + (i1 + 1 - 1) * paramInt5 + paramInt4)] -= f18 * f19;
              n += 1;
            }
            if (paramBoolean2)
            {
              n = paramInt8;
              i9 = paramInt9 - paramInt8 + 1;
            }
            for (;;)
            {
              f18 = paramArrayOfFloat4[(n - 1 + (i1 - 1) * paramInt11 + paramInt10)] + f24 * paramArrayOfFloat4[(n - 1 + (i1 + 1 - 1) * paramInt11 + paramInt10)];
              paramArrayOfFloat4[(n - 1 + (i1 - 1) * paramInt11 + paramInt10)] -= f18 * localfloatW5.val;
              paramArrayOfFloat4[(n - 1 + (i1 + 1 - 1) * paramInt11 + paramInt10)] -= f18 * f19;
              n += 1;
              i9--;
              if (i9 <= 0) {
                break;
              }
            }
          }
          i1 += 1;
        }
        m += 1;
      }
      paramintW.val = i;
      return;
    }
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, floatW paramfloatW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat1[paramInt2]);
    Slarfg.slarfg(paramInt1, localfloatW, paramArrayOfFloat2, paramInt3, paramInt4, paramfloatW);
    paramArrayOfFloat1[paramInt2] = localfloatW.val;
  }
  
  private static void slanv2_adapter(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, float[] paramArrayOfFloat3, int paramInt3, float[] paramArrayOfFloat4, int paramInt4, float[] paramArrayOfFloat5, int paramInt5, float[] paramArrayOfFloat6, int paramInt6, float[] paramArrayOfFloat7, int paramInt7, float[] paramArrayOfFloat8, int paramInt8, floatW paramfloatW1, floatW paramfloatW2)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt1]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat2[paramInt2]);
    floatW localfloatW3 = new floatW(paramArrayOfFloat3[paramInt3]);
    floatW localfloatW4 = new floatW(paramArrayOfFloat4[paramInt4]);
    floatW localfloatW5 = new floatW(paramArrayOfFloat5[paramInt5]);
    floatW localfloatW6 = new floatW(paramArrayOfFloat6[paramInt6]);
    floatW localfloatW7 = new floatW(paramArrayOfFloat7[paramInt7]);
    floatW localfloatW8 = new floatW(paramArrayOfFloat8[paramInt8]);
    Slanv2.slanv2(localfloatW1, localfloatW2, localfloatW3, localfloatW4, localfloatW5, localfloatW6, localfloatW7, localfloatW8, paramfloatW1, paramfloatW2);
    paramArrayOfFloat1[paramInt1] = localfloatW1.val;
    paramArrayOfFloat2[paramInt2] = localfloatW2.val;
    paramArrayOfFloat3[paramInt3] = localfloatW3.val;
    paramArrayOfFloat4[paramInt4] = localfloatW4.val;
    paramArrayOfFloat5[paramInt5] = localfloatW5.val;
    paramArrayOfFloat6[paramInt6] = localfloatW6.val;
    paramArrayOfFloat7[paramInt7] = localfloatW7.val;
    paramArrayOfFloat8[paramInt8] = localfloatW8.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slahqr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */