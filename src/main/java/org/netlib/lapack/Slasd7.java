package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Srot;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasd7
{
  public static void slasd7(int paramInt1, int paramInt2, int paramInt3, int paramInt4, intW paramintW1, float[] paramArrayOfFloat1, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, float[] paramArrayOfFloat5, int paramInt9, float[] paramArrayOfFloat6, int paramInt10, float[] paramArrayOfFloat7, int paramInt11, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat8, int paramInt12, int[] paramArrayOfInt1, int paramInt13, int[] paramArrayOfInt2, int paramInt14, int[] paramArrayOfInt3, int paramInt15, int[] paramArrayOfInt4, int paramInt16, intW paramintW2, int[] paramArrayOfInt5, int paramInt17, int paramInt18, float[] paramArrayOfFloat9, int paramInt19, int paramInt20, floatW paramfloatW1, floatW paramfloatW2, intW paramintW3)
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    paramintW3.val = 0;
    i5 = paramInt2 + paramInt3 + 1;
    i4 = i5 + paramInt4;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((paramInt3 >= 1 ? 0 : 1) != 0)
    {
      paramintW3.val = -3;
    }
    else
    {
      if ((paramInt4 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt4 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW3.val = -4;
      } else if ((paramInt18 >= i5 ? 0 : 1) != 0) {
        paramintW3.val = -22;
      } else if ((paramInt20 >= i5 ? 0 : 1) != 0) {
        paramintW3.val = -24;
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLASD7", -paramintW3.val);
      return;
    }
    i6 = paramInt2 + 1;
    i7 = paramInt2 + 2;
    if ((paramInt1 != 1 ? 0 : 1) != 0) {
      paramintW2.val = 0;
    }
    f5 = paramFloat1 * paramArrayOfFloat6[(i6 - 1 + paramInt10)];
    paramArrayOfFloat6[(i6 - 1 + paramInt10)] = 0.0F;
    f3 = paramArrayOfFloat4[(i6 - 1 + paramInt8)];
    i = paramInt2;
    for (int i8 = (1 - paramInt2 + -1) / -1; i8 > 0; i8--)
    {
      paramArrayOfFloat2[(i + 1 - 1 + paramInt6)] = (paramFloat1 * paramArrayOfFloat6[(i - 1 + paramInt10)]);
      paramArrayOfFloat6[(i - 1 + paramInt10)] = 0.0F;
      paramArrayOfFloat4[(i + 1 - 1 + paramInt8)] = paramArrayOfFloat4[(i - 1 + paramInt8)];
      paramArrayOfFloat1[(i + 1 - 1 + paramInt5)] = paramArrayOfFloat1[(i - 1 + paramInt5)];
      paramArrayOfInt3[(i + 1 - 1 + paramInt15)] = (paramArrayOfInt3[(i - 1 + paramInt15)] + 1);
      i += -1;
    }
    paramArrayOfFloat4[(1 - 1 + paramInt8)] = f3;
    i = i7;
    for (i8 = i4 - i7 + 1; i8 > 0; i8--)
    {
      paramArrayOfFloat2[(i - 1 + paramInt6)] = (paramFloat2 * paramArrayOfFloat4[(i - 1 + paramInt8)]);
      paramArrayOfFloat4[(i - 1 + paramInt8)] = 0.0F;
      i += 1;
    }
    i = i7;
    for (i8 = i5 - i7 + 1; i8 > 0; i8--)
    {
      paramArrayOfInt3[(i - 1 + paramInt15)] += i6;
      i += 1;
    }
    i = 2;
    for (i8 = i5 - 2 + 1; i8 > 0; i8--)
    {
      paramArrayOfFloat8[(i - 1 + paramInt12)] = paramArrayOfFloat1[(paramArrayOfInt3[(i - 1 + paramInt15)] - 1 + paramInt5)];
      paramArrayOfFloat3[(i - 1 + paramInt7)] = paramArrayOfFloat2[(paramArrayOfInt3[(i - 1 + paramInt15)] - 1 + paramInt6)];
      paramArrayOfFloat5[(i - 1 + paramInt9)] = paramArrayOfFloat4[(paramArrayOfInt3[(i - 1 + paramInt15)] - 1 + paramInt8)];
      paramArrayOfFloat7[(i - 1 + paramInt11)] = paramArrayOfFloat6[(paramArrayOfInt3[(i - 1 + paramInt15)] - 1 + paramInt10)];
      i += 1;
    }
    Slamrg.slamrg(paramInt2, paramInt3, paramArrayOfFloat8, 2 - 1 + paramInt12, 1, 1, paramArrayOfInt1, 2 - 1 + paramInt13);
    i = 2;
    for (i8 = i5 - 2 + 1; i8 > 0; i8--)
    {
      j = 1 + paramArrayOfInt1[(i - 1 + paramInt13)];
      paramArrayOfFloat1[(i - 1 + paramInt5)] = paramArrayOfFloat8[(j - 1 + paramInt12)];
      paramArrayOfFloat2[(i - 1 + paramInt6)] = paramArrayOfFloat3[(j - 1 + paramInt7)];
      paramArrayOfFloat4[(i - 1 + paramInt8)] = paramArrayOfFloat5[(j - 1 + paramInt9)];
      paramArrayOfFloat6[(i - 1 + paramInt10)] = paramArrayOfFloat7[(j - 1 + paramInt11)];
      i += 1;
    }
    f1 = Slamch.slamch("Epsilon");
    f4 = Math.max(Math.abs(paramFloat1), Math.abs(paramFloat2));
    f4 = 8.0F * 8.0F * f1 * Math.max(Math.abs(paramArrayOfFloat1[(i5 - 1 + paramInt5)]), f4);
    paramintW1.val = 1;
    i3 = i5 + 1;
    n = 2;
    for (i8 = i5 - 2 + 1; i8 > 0; i8--)
    {
      if ((Math.abs(paramArrayOfFloat2[(n - 1 + paramInt6)]) > f4 ? 0 : 1) != 0)
      {
        i3 -= 1;
        paramArrayOfInt2[(i3 - 1 + paramInt14)] = n;
        if ((n != i5 ? 0 : 1) != 0) {
          break label1719;
        }
      }
      else
      {
        i2 = n;
        break;
      }
      n += 1;
    }
    n = i2;
    for (;;)
    {
      n += 1;
      if ((n <= i5 ? 0 : 1) != 0) {
        break;
      }
      if ((Math.abs(paramArrayOfFloat2[(n - 1 + paramInt6)]) > f4 ? 0 : 1) != 0)
      {
        i3 -= 1;
        paramArrayOfInt2[(i3 - 1 + paramInt14)] = n;
      }
      else if ((Math.abs(paramArrayOfFloat1[(n - 1 + paramInt5)] - paramArrayOfFloat1[(i2 - 1 + paramInt5)]) > f4 ? 0 : 1) != 0)
      {
        paramfloatW2.val = paramArrayOfFloat2[(i2 - 1 + paramInt6)];
        paramfloatW1.val = paramArrayOfFloat2[(n - 1 + paramInt6)];
        f3 = Slapy2.slapy2(paramfloatW1.val, paramfloatW2.val);
        paramArrayOfFloat2[(n - 1 + paramInt6)] = f3;
        paramArrayOfFloat2[(i2 - 1 + paramInt6)] = 0.0F;
        paramfloatW1.val /= f3;
        paramfloatW2.val = (-(paramfloatW2.val / f3));
        if ((paramInt1 != 1 ? 0 : 1) != 0)
        {
          paramintW2.val += 1;
          m = paramArrayOfInt3[(paramArrayOfInt1[(i2 - 1 + paramInt13)] + 1 - 1 + paramInt15)];
          k = paramArrayOfInt3[(paramArrayOfInt1[(n - 1 + paramInt13)] + 1 - 1 + paramInt15)];
          if ((m > i6 ? 0 : 1) != 0) {
            m -= 1;
          }
          if ((k > i6 ? 0 : 1) != 0) {
            k -= 1;
          }
          paramArrayOfInt5[(paramintW2.val - 1 + (2 - 1) * paramInt18 + paramInt17)] = m;
          paramArrayOfInt5[(paramintW2.val - 1 + (1 - 1) * paramInt18 + paramInt17)] = k;
          paramArrayOfFloat9[(paramintW2.val - 1 + (2 - 1) * paramInt20 + paramInt19)] = paramfloatW1.val;
          paramArrayOfFloat9[(paramintW2.val - 1 + (1 - 1) * paramInt20 + paramInt19)] = paramfloatW2.val;
        }
        Srot.srot(1, paramArrayOfFloat4, i2 - 1 + paramInt8, 1, paramArrayOfFloat4, n - 1 + paramInt8, 1, paramfloatW1.val, paramfloatW2.val);
        Srot.srot(1, paramArrayOfFloat6, i2 - 1 + paramInt10, 1, paramArrayOfFloat6, n - 1 + paramInt10, 1, paramfloatW1.val, paramfloatW2.val);
        i3 -= 1;
        paramArrayOfInt2[(i3 - 1 + paramInt14)] = i2;
        i2 = n;
      }
      else
      {
        paramintW1.val += 1;
        paramArrayOfFloat3[(paramintW1.val - 1 + paramInt7)] = paramArrayOfFloat2[(i2 - 1 + paramInt6)];
        paramArrayOfFloat8[(paramintW1.val - 1 + paramInt12)] = paramArrayOfFloat1[(i2 - 1 + paramInt5)];
        paramArrayOfInt2[(paramintW1.val - 1 + paramInt14)] = i2;
        i2 = n;
      }
    }
    paramintW1.val += 1;
    paramArrayOfFloat3[(paramintW1.val - 1 + paramInt7)] = paramArrayOfFloat2[(i2 - 1 + paramInt6)];
    paramArrayOfFloat8[(paramintW1.val - 1 + paramInt12)] = paramArrayOfFloat1[(i2 - 1 + paramInt5)];
    paramArrayOfInt2[(paramintW1.val - 1 + paramInt14)] = i2;
    label1719:
    n = 2;
    for (i8 = i5 - 2 + 1; i8 > 0; i8--)
    {
      i1 = paramArrayOfInt2[(n - 1 + paramInt14)];
      paramArrayOfFloat8[(n - 1 + paramInt12)] = paramArrayOfFloat1[(i1 - 1 + paramInt5)];
      paramArrayOfFloat5[(n - 1 + paramInt9)] = paramArrayOfFloat4[(i1 - 1 + paramInt8)];
      paramArrayOfFloat7[(n - 1 + paramInt11)] = paramArrayOfFloat6[(i1 - 1 + paramInt10)];
      n += 1;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      n = 2;
      for (i8 = i5 - 2 + 1; i8 > 0; i8--)
      {
        i1 = paramArrayOfInt2[(n - 1 + paramInt14)];
        paramArrayOfInt4[(n - 1 + paramInt16)] = paramArrayOfInt3[(paramArrayOfInt1[(i1 - 1 + paramInt13)] + 1 - 1 + paramInt15)];
        if ((paramArrayOfInt4[(n - 1 + paramInt16)] > i6 ? 0 : 1) != 0) {
          paramArrayOfInt4[(n - 1 + paramInt16)] -= 1;
        }
        n += 1;
      }
    }
    Scopy.scopy(i5 - paramintW1.val, paramArrayOfFloat8, paramintW1.val + 1 - 1 + paramInt12, 1, paramArrayOfFloat1, paramintW1.val + 1 - 1 + paramInt5, 1);
    paramArrayOfFloat8[(1 - 1 + paramInt12)] = 0.0F;
    f2 = f4 / 2.0F;
    if ((Math.abs(paramArrayOfFloat8[(2 - 1 + paramInt12)]) > f2 ? 0 : 1) != 0) {
      paramArrayOfFloat8[(2 - 1 + paramInt12)] = f2;
    }
    if ((i4 <= i5 ? 0 : 1) != 0)
    {
      paramArrayOfFloat2[(1 - 1 + paramInt6)] = Slapy2.slapy2(f5, paramArrayOfFloat2[(i4 - 1 + paramInt6)]);
      if ((paramArrayOfFloat2[(1 - 1 + paramInt6)] > f4 ? 0 : 1) != 0)
      {
        paramfloatW1.val = 1.0F;
        paramfloatW2.val = 0.0F;
        paramArrayOfFloat2[(1 - 1 + paramInt6)] = f4;
      }
      else
      {
        paramfloatW1.val = (f5 / paramArrayOfFloat2[(1 - 1 + paramInt6)]);
        paramfloatW2.val = (-(paramArrayOfFloat2[(i4 - 1 + paramInt6)] / paramArrayOfFloat2[(1 - 1 + paramInt6)]));
      }
      Srot.srot(1, paramArrayOfFloat4, i4 - 1 + paramInt8, 1, paramArrayOfFloat4, 1 - 1 + paramInt8, 1, paramfloatW1.val, paramfloatW2.val);
      Srot.srot(1, paramArrayOfFloat6, i4 - 1 + paramInt10, 1, paramArrayOfFloat6, 1 - 1 + paramInt10, 1, paramfloatW1.val, paramfloatW2.val);
    }
    else if ((Math.abs(f5) > f4 ? 0 : 1) != 0)
    {
      paramArrayOfFloat2[(1 - 1 + paramInt6)] = f4;
    }
    else
    {
      paramArrayOfFloat2[(1 - 1 + paramInt6)] = f5;
    }
    Scopy.scopy(paramintW1.val - 1, paramArrayOfFloat3, 2 - 1 + paramInt7, 1, paramArrayOfFloat2, 2 - 1 + paramInt6, 1);
    Scopy.scopy(i5 - 1, paramArrayOfFloat5, 2 - 1 + paramInt9, 1, paramArrayOfFloat4, 2 - 1 + paramInt8, 1);
    Scopy.scopy(i5 - 1, paramArrayOfFloat7, 2 - 1 + paramInt11, 1, paramArrayOfFloat6, 2 - 1 + paramInt10, 1);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasd7.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */