package org.netlib.arpack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Srot;
import org.netlib.lapack.Slabad;
import org.netlib.lapack.Slamch;
import org.netlib.lapack.Slanhs;
import org.netlib.lapack.Slanv2;
import org.netlib.lapack.Slarfg;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaqrb
{
  public static void slaqrb(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, intW paramintW)
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
    floatW localfloatW1 = new floatW(0.0F);
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
    floatW localfloatW2 = new floatW(0.0F);
    float f12 = 0.0F;
    float f13 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    float f14 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    floatW localfloatW5 = new floatW(0.0F);
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    float[] arrayOfFloat1 = new float[3];
    float[] arrayOfFloat2 = new float[1];
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
    i1 = 1;
    for (int i7 = paramInt1 - 1 - 1 + 1; i7 > 0; i7--)
    {
      paramArrayOfFloat4[(i1 - 1 + paramInt8)] = 0.0F;
      i1 += 1;
    }
    paramArrayOfFloat4[(paramInt1 - 1 + paramInt8)] = 1.0F;
    i5 = paramInt3 - paramInt2 + 1;
    localfloatW5.val = Slamch.slamch("safe minimum");
    localfloatW2.val = (1.0F / localfloatW5.val);
    Slabad.slabad(localfloatW5, localfloatW2);
    f18 = Slamch.slamch("precision");
    f13 = localfloatW5.val * (i5 / f18);
    if (paramBoolean)
    {
      j = 1;
      k = paramInt1;
      i = 1;
      for (i7 = k - 2 - 1 + 1; i7 > 0; i7--)
      {
        paramArrayOfFloat1[(j + i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)] = 0.0F;
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (i7 = paramInt3 - paramInt2 - 1 - 1 + 1; i7 > 0; i7--)
      {
        paramArrayOfFloat1[(paramInt2 + i + 1 - 1 + (paramInt2 + i - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
        i += 1;
      }
    }
    m = 30 * i5;
    for (i = paramInt3;; i = i3 - 1)
    {
      i3 = paramInt2;
      if ((i >= paramInt2 ? 0 : 1) != 0) {
        break;
      }
      n = 0;
      for (i7 = m - 0 + 1; i7 > 0; i7--)
      {
        i2 = i;
        for (int i8 = (i3 + 1 - i + -1) / -1; i8 > 0; i8--)
        {
          f17 = Math.abs(paramArrayOfFloat1[(i2 - 1 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfFloat1[(i2 - 1 + (i2 - 1) * paramInt5 + paramInt4)]);
          if ((f17 != 0.0F ? 0 : 1) != 0) {
            f17 = Slanhs.slanhs("1", i - i3 + 1, paramArrayOfFloat1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat2, 0);
          }
          if ((Math.abs(paramArrayOfFloat1[(i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)]) > Math.max(f18 * f17, f13) ? 0 : 1) != 0) {
            break;
          }
          i2 += -1;
        }
        i3 = i2;
        if ((i3 <= paramInt2 ? 0 : 1) != 0) {
          paramArrayOfFloat1[(i3 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
        }
        if ((i3 < i - 1 ? 0 : 1) != 0) {
          break;
        }
        if ((paramBoolean ^ true))
        {
          j = i3;
          k = i;
        }
        if ((n != 10 ? 0 : 1) == 0) {}
        if (((n != 20 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          f12 = Math.abs(paramArrayOfFloat1[(i - 1 + (i - 1 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfFloat1[(i - 1 - 1 + (i - 2 - 1) * paramInt5 + paramInt4)]);
          f10 = 0.75F * f12;
          f7 = f10;
          f9 = -0.4375F * f12 * f12;
        }
        else
        {
          f10 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
          f7 = paramArrayOfFloat1[(i - 1 - 1 + (i - 1 - 1) * paramInt5 + paramInt4)];
          f9 = paramArrayOfFloat1[(i - 1 + (i - 1 - 1) * paramInt5 + paramInt4)] * paramArrayOfFloat1[(i - 1 - 1 + (i - 1) * paramInt5 + paramInt4)];
        }
        i4 = i - 2;
        for (i8 = (i3 - (i - 2) + -1) / -1; i8 > 0; i8--)
        {
          f3 = paramArrayOfFloat1[(i4 - 1 + (i4 - 1) * paramInt5 + paramInt4)];
          f6 = paramArrayOfFloat1[(i4 + 1 - 1 + (i4 + 1 - 1) * paramInt5 + paramInt4)];
          f5 = paramArrayOfFloat1[(i4 + 1 - 1 + (i4 - 1) * paramInt5 + paramInt4)];
          f4 = paramArrayOfFloat1[(i4 - 1 + (i4 + 1 - 1) * paramInt5 + paramInt4)];
          f11 = f10 - f3;
          f8 = f7 - f3;
          f19 = (f8 * f11 - f9) / f5 + f4;
          f20 = f6 - f3 - f8 - f11;
          f21 = paramArrayOfFloat1[(i4 + 2 - 1 + (i4 + 1 - 1) * paramInt5 + paramInt4)];
          f12 = Math.abs(f19) + Math.abs(f20) + Math.abs(f21);
          f19 /= f12;
          f20 /= f12;
          f21 /= f12;
          arrayOfFloat1[(1 - 1)] = f19;
          arrayOfFloat1[(2 - 1)] = f20;
          arrayOfFloat1[(3 - 1)] = f21;
          if ((i4 != i3 ? 0 : 1) != 0) {
            break;
          }
          f1 = paramArrayOfFloat1[(i4 - 1 - 1 + (i4 - 1 - 1) * paramInt5 + paramInt4)];
          f2 = paramArrayOfFloat1[(i4 - 1 + (i4 - 1 - 1) * paramInt5 + paramInt4)];
          f17 = Math.abs(f19) * (Math.abs(f1) + Math.abs(f3) + Math.abs(f6));
          if ((Math.abs(f2) * (Math.abs(f20) + Math.abs(f21)) > f18 * f17 ? 0 : 1) != 0) {
            break;
          }
          i4 += -1;
        }
        i2 = i4;
        for (i8 = i - 1 - i4 + 1; i8 > 0; i8--)
        {
          i6 = Math.min(3, i - i2 + 1);
          if ((i2 <= i4 ? 0 : 1) != 0) {
            Scopy.scopy(i6, paramArrayOfFloat1, i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4, 1, arrayOfFloat1, 0, 1);
          }
          slarfg_adapter(i6, arrayOfFloat1, 1 - 1, arrayOfFloat1, 2 - 1, 1, localfloatW4);
          if ((i2 <= i4 ? 0 : 1) != 0)
          {
            paramArrayOfFloat1[(i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = arrayOfFloat1[(1 - 1)];
            paramArrayOfFloat1[(i2 + 1 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
            if ((i2 >= i - 1 ? 0 : 1) != 0) {
              paramArrayOfFloat1[(i2 + 2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
            }
          }
          else if ((i4 <= i3 ? 0 : 1) != 0)
          {
            paramArrayOfFloat1[(i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfFloat1[(i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)]);
          }
          f20 = arrayOfFloat1[(2 - 1)];
          f15 = localfloatW4.val * f20;
          int i9;
          if ((i6 != 3 ? 0 : 1) != 0)
          {
            f21 = arrayOfFloat1[(3 - 1)];
            f16 = localfloatW4.val * f21;
            i1 = i2;
            for (i9 = k - i2 + 1; i9 > 0; i9--)
            {
              f14 = paramArrayOfFloat1[(i2 - 1 + (i1 - 1) * paramInt5 + paramInt4)] + f20 * paramArrayOfFloat1[(i2 + 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)] + f21 * paramArrayOfFloat1[(i2 + 2 - 1 + (i1 - 1) * paramInt5 + paramInt4)];
              paramArrayOfFloat1[(i2 - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= f14 * localfloatW4.val;
              paramArrayOfFloat1[(i2 + 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= f14 * f15;
              paramArrayOfFloat1[(i2 + 2 - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= f14 * f16;
              i1 += 1;
            }
            i1 = j;
            for (i9 = Math.min(i2 + 3, i) - j + 1; i9 > 0; i9--)
            {
              f14 = paramArrayOfFloat1[(i1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] + f20 * paramArrayOfFloat1[(i1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)] + f21 * paramArrayOfFloat1[(i1 - 1 + (i2 + 2 - 1) * paramInt5 + paramInt4)];
              paramArrayOfFloat1[(i1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= f14 * localfloatW4.val;
              paramArrayOfFloat1[(i1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)] -= f14 * f15;
              paramArrayOfFloat1[(i1 - 1 + (i2 + 2 - 1) * paramInt5 + paramInt4)] -= f14 * f16;
              i1 += 1;
            }
            f14 = paramArrayOfFloat4[(i2 - 1 + paramInt8)] + f20 * paramArrayOfFloat4[(i2 + 1 - 1 + paramInt8)] + f21 * paramArrayOfFloat4[(i2 + 2 - 1 + paramInt8)];
            paramArrayOfFloat4[(i2 - 1 + paramInt8)] -= f14 * localfloatW4.val;
            paramArrayOfFloat4[(i2 + 1 - 1 + paramInt8)] -= f14 * f15;
            paramArrayOfFloat4[(i2 + 2 - 1 + paramInt8)] -= f14 * f16;
          }
          else if ((i6 != 2 ? 0 : 1) != 0)
          {
            i1 = i2;
            for (i9 = k - i2 + 1; i9 > 0; i9--)
            {
              f14 = paramArrayOfFloat1[(i2 - 1 + (i1 - 1) * paramInt5 + paramInt4)] + f20 * paramArrayOfFloat1[(i2 + 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)];
              paramArrayOfFloat1[(i2 - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= f14 * localfloatW4.val;
              paramArrayOfFloat1[(i2 + 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= f14 * f15;
              i1 += 1;
            }
            i1 = j;
            for (i9 = i - j + 1; i9 > 0; i9--)
            {
              f14 = paramArrayOfFloat1[(i1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] + f20 * paramArrayOfFloat1[(i1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)];
              paramArrayOfFloat1[(i1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= f14 * localfloatW4.val;
              paramArrayOfFloat1[(i1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)] -= f14 * f15;
              i1 += 1;
            }
            f14 = paramArrayOfFloat4[(i2 - 1 + paramInt8)] + f20 * paramArrayOfFloat4[(i2 + 1 - 1 + paramInt8)];
            paramArrayOfFloat4[(i2 - 1 + paramInt8)] -= f14 * localfloatW4.val;
            paramArrayOfFloat4[(i2 + 1 - 1 + paramInt8)] -= f14 * f15;
          }
          i2 += 1;
        }
        n += 1;
      }
      paramintW.val = i;
      return;
      if ((i3 != i ? 0 : 1) != 0)
      {
        paramArrayOfFloat2[(i - 1 + paramInt6)] = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat3[(i - 1 + paramInt7)] = 0.0F;
      }
      else if ((i3 != i - 1 ? 0 : 1) != 0)
      {
        slanv2_adapter(paramArrayOfFloat1, i - 1 - 1 + (i - 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, i - 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, i - 1 + (i - 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat2, i - 1 - 1 + paramInt6, paramArrayOfFloat3, i - 1 - 1 + paramInt7, paramArrayOfFloat2, i - 1 + paramInt6, paramArrayOfFloat3, i - 1 + paramInt7, localfloatW1, localfloatW3);
        if (paramBoolean)
        {
          if ((k <= i ? 0 : 1) != 0) {
            Srot.srot(k - i, paramArrayOfFloat1, i - 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, localfloatW1.val, localfloatW3.val);
          }
          Srot.srot(i - j - 1, paramArrayOfFloat1, j - 1 + (i - 1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat1, j - 1 + (i - 1) * paramInt5 + paramInt4, 1, localfloatW1.val, localfloatW3.val);
          f14 = localfloatW1.val * paramArrayOfFloat4[(i - 1 - 1 + paramInt8)] + localfloatW3.val * paramArrayOfFloat4[(i - 1 + paramInt8)];
          paramArrayOfFloat4[(i - 1 + paramInt8)] = (localfloatW1.val * paramArrayOfFloat4[(i - 1 + paramInt8)] - localfloatW3.val * paramArrayOfFloat4[(i - 1 - 1 + paramInt8)]);
          paramArrayOfFloat4[(i - 1 - 1 + paramInt8)] = f14;
        }
      }
      m -= n;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Slaqrb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */