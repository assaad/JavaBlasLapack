package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Srot;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Slasd2
{
  public static void slasd2(int paramInt1, int paramInt2, int paramInt3, intW paramintW1, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, float[] paramArrayOfFloat6, int paramInt11, int paramInt12, float[] paramArrayOfFloat7, int paramInt13, int paramInt14, int[] paramArrayOfInt1, int paramInt15, int[] paramArrayOfInt2, int paramInt16, int[] paramArrayOfInt3, int paramInt17, int[] paramArrayOfInt4, int paramInt18, int[] paramArrayOfInt5, int paramInt19, intW paramintW2)
  {
    int[] arrayOfInt1 = new int[4];
    int[] arrayOfInt2 = new int[4];
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    paramintW2.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW2.val = -2;
    }
    else
    {
      if ((paramInt3 == 1 ? 0 : 1) != 0) {}
      if (((paramInt3 == 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -3;
      }
    }
    i6 = paramInt1 + paramInt2 + 1;
    i5 = i6 + paramInt3;
    if ((paramInt7 >= i6 ? 0 : 1) != 0) {
      paramintW2.val = -10;
    } else if ((paramInt9 >= i5 ? 0 : 1) != 0) {
      paramintW2.val = -12;
    } else if ((paramInt12 >= i6 ? 0 : 1) != 0) {
      paramintW2.val = -15;
    } else if ((paramInt14 >= i5 ? 0 : 1) != 0) {
      paramintW2.val = -17;
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLASD2", -paramintW2.val);
      return;
    }
    i7 = paramInt1 + 1;
    i8 = paramInt1 + 2;
    f7 = paramFloat1 * paramArrayOfFloat4[(i7 - 1 + (i7 - 1) * paramInt9 + paramInt8)];
    paramArrayOfFloat2[(1 - 1 + paramInt5)] = f7;
    j = paramInt1;
    for (int i9 = (1 - paramInt1 + -1) / -1; i9 > 0; i9--)
    {
      paramArrayOfFloat2[(j + 1 - 1 + paramInt5)] = (paramFloat1 * paramArrayOfFloat4[(j - 1 + (i7 - 1) * paramInt9 + paramInt8)]);
      paramArrayOfFloat1[(j + 1 - 1 + paramInt4)] = paramArrayOfFloat1[(j - 1 + paramInt4)];
      paramArrayOfInt4[(j + 1 - 1 + paramInt18)] = (paramArrayOfInt4[(j - 1 + paramInt18)] + 1);
      j += -1;
    }
    j = i8;
    for (i9 = i5 - i8 + 1; i9 > 0; i9--)
    {
      paramArrayOfFloat2[(j - 1 + paramInt5)] = (paramFloat2 * paramArrayOfFloat4[(j - 1 + (i8 - 1) * paramInt9 + paramInt8)]);
      j += 1;
    }
    j = 2;
    for (i9 = i7 - 2 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt5[(j - 1 + paramInt19)] = 1;
      j += 1;
    }
    j = i8;
    for (i9 = i6 - i8 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt5[(j - 1 + paramInt19)] = 2;
      j += 1;
    }
    j = i8;
    for (i9 = i6 - i8 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt4[(j - 1 + paramInt18)] += i7;
      j += 1;
    }
    j = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      paramArrayOfFloat5[(j - 1 + paramInt10)] = paramArrayOfFloat1[(paramArrayOfInt4[(j - 1 + paramInt18)] - 1 + paramInt4)];
      paramArrayOfFloat6[(j - 1 + (1 - 1) * paramInt12 + paramInt11)] = paramArrayOfFloat2[(paramArrayOfInt4[(j - 1 + paramInt18)] - 1 + paramInt5)];
      paramArrayOfInt3[(j - 1 + paramInt17)] = paramArrayOfInt5[(paramArrayOfInt4[(j - 1 + paramInt18)] - 1 + paramInt19)];
      j += 1;
    }
    Slamrg.slamrg(paramInt1, paramInt2, paramArrayOfFloat5, 2 - 1 + paramInt10, 1, 1, paramArrayOfInt2, 2 - 1 + paramInt16);
    j = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      k = 1 + paramArrayOfInt2[(j - 1 + paramInt16)];
      paramArrayOfFloat1[(j - 1 + paramInt4)] = paramArrayOfFloat5[(k - 1 + paramInt10)];
      paramArrayOfFloat2[(j - 1 + paramInt5)] = paramArrayOfFloat6[(k - 1 + (1 - 1) * paramInt12 + paramInt11)];
      paramArrayOfInt5[(j - 1 + paramInt19)] = paramArrayOfInt3[(k - 1 + paramInt17)];
      j += 1;
    }
    f2 = Slamch.slamch("Epsilon");
    f6 = Math.max(Math.abs(paramFloat1), Math.abs(paramFloat2));
    f6 = 8.0F * f2 * Math.max(Math.abs(paramArrayOfFloat1[(i6 - 1 + paramInt4)]), f6);
    paramintW1.val = 1;
    i4 = i6 + 1;
    i1 = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      if ((Math.abs(paramArrayOfFloat2[(i1 - 1 + paramInt5)]) > f6 ? 0 : 1) != 0)
      {
        i4 -= 1;
        paramArrayOfInt1[(i4 - 1 + paramInt15)] = i1;
        paramArrayOfInt5[(i1 - 1 + paramInt19)] = 4;
        if ((i1 != i6 ? 0 : 1) != 0) {
          break label1680;
        }
      }
      else
      {
        i3 = i1;
        break;
      }
      i1 += 1;
    }
    i1 = i3;
    for (;;)
    {
      i1 += 1;
      if ((i1 <= i6 ? 0 : 1) != 0) {
        break;
      }
      if ((Math.abs(paramArrayOfFloat2[(i1 - 1 + paramInt5)]) > f6 ? 0 : 1) != 0)
      {
        i4 -= 1;
        paramArrayOfInt1[(i4 - 1 + paramInt15)] = i1;
        paramArrayOfInt5[(i1 - 1 + paramInt19)] = 4;
      }
      else if ((Math.abs(paramArrayOfFloat1[(i1 - 1 + paramInt4)] - paramArrayOfFloat1[(i3 - 1 + paramInt4)]) > f6 ? 0 : 1) != 0)
      {
        f4 = paramArrayOfFloat2[(i3 - 1 + paramInt5)];
        f1 = paramArrayOfFloat2[(i1 - 1 + paramInt5)];
        f5 = Slapy2.slapy2(f1, f4);
        f1 /= f5;
        f4 = -(f4 / f5);
        paramArrayOfFloat2[(i1 - 1 + paramInt5)] = f5;
        paramArrayOfFloat2[(i3 - 1 + paramInt5)] = 0.0F;
        n = paramArrayOfInt4[(paramArrayOfInt2[(i3 - 1 + paramInt16)] + 1 - 1 + paramInt18)];
        m = paramArrayOfInt4[(paramArrayOfInt2[(i1 - 1 + paramInt16)] + 1 - 1 + paramInt18)];
        if ((n > i7 ? 0 : 1) != 0) {
          n -= 1;
        }
        if ((m > i7 ? 0 : 1) != 0) {
          m -= 1;
        }
        Srot.srot(i6, paramArrayOfFloat3, 1 - 1 + (n - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat3, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1, f1, f4);
        Srot.srot(i5, paramArrayOfFloat4, n - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat4, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, f1, f4);
        if ((paramArrayOfInt5[(i1 - 1 + paramInt19)] == paramArrayOfInt5[(i3 - 1 + paramInt19)] ? 0 : 1) != 0) {
          paramArrayOfInt5[(i1 - 1 + paramInt19)] = 3;
        }
        paramArrayOfInt5[(i3 - 1 + paramInt19)] = 4;
        i4 -= 1;
        paramArrayOfInt1[(i4 - 1 + paramInt15)] = i3;
        i3 = i1;
      }
      else
      {
        paramintW1.val += 1;
        paramArrayOfFloat6[(paramintW1.val - 1 + (1 - 1) * paramInt12 + paramInt11)] = paramArrayOfFloat2[(i3 - 1 + paramInt5)];
        paramArrayOfFloat5[(paramintW1.val - 1 + paramInt10)] = paramArrayOfFloat1[(i3 - 1 + paramInt4)];
        paramArrayOfInt1[(paramintW1.val - 1 + paramInt15)] = i3;
        i3 = i1;
      }
    }
    paramintW1.val += 1;
    paramArrayOfFloat6[(paramintW1.val - 1 + (1 - 1) * paramInt12 + paramInt11)] = paramArrayOfFloat2[(i3 - 1 + paramInt5)];
    paramArrayOfFloat5[(paramintW1.val - 1 + paramInt10)] = paramArrayOfFloat1[(i3 - 1 + paramInt4)];
    paramArrayOfInt1[(paramintW1.val - 1 + paramInt15)] = i3;
    label1680:
    i1 = 1;
    for (i9 = 4 - 1 + 1; i9 > 0; i9--)
    {
      arrayOfInt1[(i1 - 1)] = 0;
      i1 += 1;
    }
    i1 = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      i = paramArrayOfInt5[(i1 - 1 + paramInt19)];
      arrayOfInt1[(i - 1)] += 1;
      i1 += 1;
    }
    arrayOfInt2[(1 - 1)] = 2;
    arrayOfInt2[(2 - 1)] = (2 + arrayOfInt1[(1 - 1)]);
    arrayOfInt2[(3 - 1)] = (arrayOfInt2[(2 - 1)] + arrayOfInt1[(2 - 1)]);
    arrayOfInt2[(4 - 1)] = (arrayOfInt2[(3 - 1)] + arrayOfInt1[(3 - 1)]);
    i1 = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      i2 = paramArrayOfInt1[(i1 - 1 + paramInt15)];
      i = paramArrayOfInt5[(i2 - 1 + paramInt19)];
      paramArrayOfInt3[(arrayOfInt2[(i - 1)] - 1 + paramInt17)] = i1;
      arrayOfInt2[(i - 1)] += 1;
      i1 += 1;
    }
    i1 = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      i2 = paramArrayOfInt1[(i1 - 1 + paramInt15)];
      paramArrayOfFloat5[(i1 - 1 + paramInt10)] = paramArrayOfFloat1[(i2 - 1 + paramInt4)];
      m = paramArrayOfInt4[(paramArrayOfInt2[(paramArrayOfInt1[(paramArrayOfInt3[(i1 - 1 + paramInt17)] - 1 + paramInt15)] - 1 + paramInt16)] + 1 - 1 + paramInt18)];
      if ((m > i7 ? 0 : 1) != 0) {
        m -= 1;
      }
      Scopy.scopy(i6, paramArrayOfFloat3, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat6, 1 - 1 + (i1 - 1) * paramInt12 + paramInt11, 1);
      Scopy.scopy(i5, paramArrayOfFloat4, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat7, i1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
      i1 += 1;
    }
    paramArrayOfFloat5[(1 - 1 + paramInt10)] = 0.0F;
    f3 = f6 / 2.0F;
    if ((Math.abs(paramArrayOfFloat5[(2 - 1 + paramInt10)]) > f3 ? 0 : 1) != 0) {
      paramArrayOfFloat5[(2 - 1 + paramInt10)] = f3;
    }
    if ((i5 <= i6 ? 0 : 1) != 0)
    {
      paramArrayOfFloat2[(1 - 1 + paramInt5)] = Slapy2.slapy2(f7, paramArrayOfFloat2[(i5 - 1 + paramInt5)]);
      if ((paramArrayOfFloat2[(1 - 1 + paramInt5)] > f6 ? 0 : 1) != 0)
      {
        f1 = 1.0F;
        f4 = 0.0F;
        paramArrayOfFloat2[(1 - 1 + paramInt5)] = f6;
      }
      else
      {
        f1 = f7 / paramArrayOfFloat2[(1 - 1 + paramInt5)];
        f4 = paramArrayOfFloat2[(i5 - 1 + paramInt5)] / paramArrayOfFloat2[(1 - 1 + paramInt5)];
      }
    }
    else if ((Math.abs(f7) > f6 ? 0 : 1) != 0)
    {
      paramArrayOfFloat2[(1 - 1 + paramInt5)] = f6;
    }
    else
    {
      paramArrayOfFloat2[(1 - 1 + paramInt5)] = f7;
    }
    Scopy.scopy(paramintW1.val - 1, paramArrayOfFloat6, 2 - 1 + (1 - 1) * paramInt12 + paramInt11, 1, paramArrayOfFloat2, 2 - 1 + paramInt5, 1);
    Slaset.slaset("A", i6, 1, 0.0F, 0.0F, paramArrayOfFloat6, paramInt11, paramInt12);
    paramArrayOfFloat6[(i7 - 1 + (1 - 1) * paramInt12 + paramInt11)] = 1.0F;
    if ((i5 <= i6 ? 0 : 1) != 0)
    {
      j = 1;
      for (i9 = i7 - 1 + 1; i9 > 0; i9--)
      {
        paramArrayOfFloat4[(i5 - 1 + (j - 1) * paramInt9 + paramInt8)] = (-(f4 * paramArrayOfFloat4[(i7 - 1 + (j - 1) * paramInt9 + paramInt8)]));
        paramArrayOfFloat7[(1 - 1 + (j - 1) * paramInt14 + paramInt13)] = (f1 * paramArrayOfFloat4[(i7 - 1 + (j - 1) * paramInt9 + paramInt8)]);
        j += 1;
      }
      j = i8;
      for (i9 = i5 - i8 + 1; i9 > 0; i9--)
      {
        paramArrayOfFloat7[(1 - 1 + (j - 1) * paramInt14 + paramInt13)] = (f4 * paramArrayOfFloat4[(i5 - 1 + (j - 1) * paramInt9 + paramInt8)]);
        paramArrayOfFloat4[(i5 - 1 + (j - 1) * paramInt9 + paramInt8)] = (f1 * paramArrayOfFloat4[(i5 - 1 + (j - 1) * paramInt9 + paramInt8)]);
        j += 1;
      }
    }
    else
    {
      Scopy.scopy(i5, paramArrayOfFloat4, i7 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat7, 1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
    }
    if ((i5 <= i6 ? 0 : 1) != 0) {
      Scopy.scopy(i5, paramArrayOfFloat4, i5 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat7, i5 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
    }
    if ((i6 <= paramintW1.val ? 0 : 1) != 0)
    {
      Scopy.scopy(i6 - paramintW1.val, paramArrayOfFloat5, paramintW1.val + 1 - 1 + paramInt10, 1, paramArrayOfFloat1, paramintW1.val + 1 - 1 + paramInt4, 1);
      Slacpy.slacpy("A", i6, i6 - paramintW1.val, paramArrayOfFloat6, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfFloat3, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt7 + paramInt6, paramInt7);
      Slacpy.slacpy("A", i6 - paramintW1.val, i5, paramArrayOfFloat7, paramintW1.val + 1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14, paramArrayOfFloat4, paramintW1.val + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
    }
    i1 = 1;
    for (i9 = 4 - 1 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt5[(i1 - 1 + paramInt19)] = arrayOfInt1[(i1 - 1)];
      i1 += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasd2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */