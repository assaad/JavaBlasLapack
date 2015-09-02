package org.netlib.lapack;

import org.netlib.util.intW;

public final class Slarrj
{
  public static void slarrj(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, int paramInt5, float paramFloat1, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, float[] paramArrayOfFloat5, int paramInt9, int[] paramArrayOfInt, int paramInt10, float paramFloat2, float paramFloat3, intW paramintW)
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    paramintW.val = 0;
    i = (int)(((float)Math.log(paramFloat3 + paramFloat2) - (float)Math.log(paramFloat2)) / (float)Math.log(2.0F)) + 2;
    m = paramInt4;
    n = paramInt5;
    i6 = 0;
    i9 = 0;
    k = m;
    int i12;
    for (int i11 = n - m + 1; i11 > 0; i11--)
    {
      i4 = 2 * k;
      i1 = k - paramInt6;
      f3 = paramArrayOfFloat3[(i1 - 1 + paramInt7)] - paramArrayOfFloat4[(i1 - 1 + paramInt8)];
      f4 = paramArrayOfFloat3[(i1 - 1 + paramInt7)];
      f5 = paramArrayOfFloat3[(i1 - 1 + paramInt7)] + paramArrayOfFloat4[(i1 - 1 + paramInt8)];
      f8 = f5 - f4;
      f7 = Math.max(Math.abs(f3), Math.abs(f5));
      if ((f8 >= paramFloat1 * f7 ? 0 : 1) != 0)
      {
        paramArrayOfInt[(i4 - 1 - 1 + paramInt10)] = -1;
        if ((k != m ? 0 : 1) != 0) {}
        if (((k >= n ? 0 : 1) != 0 ? 1 : 0) != 0) {
          m = k + 1;
        }
        if ((i9 < m ? 0 : 1) != 0) {}
        if (((k > n ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramArrayOfInt[(2 * i9 - 1 - 1 + paramInt10)] = (k + 1);
        }
      }
      else
      {
        i9 = k;
        for (f2 = 1.0F;; f2 = 2.0F * f2)
        {
          j = 0;
          f6 = f3;
          f1 = paramArrayOfFloat1[(1 - 1 + paramInt2)] - f6;
          if ((f1 >= 0.0F ? 0 : 1) != 0) {
            j += 1;
          }
          i3 = 2;
          for (i12 = paramInt1 - 2 + 1; i12 > 0; i12--)
          {
            f1 = paramArrayOfFloat1[(i3 - 1 + paramInt2)] - f6 - paramArrayOfFloat2[(i3 - 1 - 1 + paramInt3)] / f1;
            if ((f1 >= 0.0F ? 0 : 1) != 0) {
              j += 1;
            }
            i3 += 1;
          }
          if ((j <= k - 1 ? 0 : 1) == 0) {
            break;
          }
          f3 -= paramArrayOfFloat4[(i1 - 1 + paramInt8)] * f2;
        }
        for (f2 = 1.0F;; f2 = 2.0F * f2)
        {
          j = 0;
          f6 = f5;
          f1 = paramArrayOfFloat1[(1 - 1 + paramInt2)] - f6;
          if ((f1 >= 0.0F ? 0 : 1) != 0) {
            j += 1;
          }
          i3 = 2;
          for (i12 = paramInt1 - 2 + 1; i12 > 0; i12--)
          {
            f1 = paramArrayOfFloat1[(i3 - 1 + paramInt2)] - f6 - paramArrayOfFloat2[(i3 - 1 - 1 + paramInt3)] / f1;
            if ((f1 >= 0.0F ? 0 : 1) != 0) {
              j += 1;
            }
            i3 += 1;
          }
          if ((j >= k ? 0 : 1) == 0) {
            break;
          }
          f5 += paramArrayOfFloat4[(i1 - 1 + paramInt8)] * f2;
        }
        i6 += 1;
        paramArrayOfInt[(i4 - 1 - 1 + paramInt10)] = (k + 1);
        paramArrayOfInt[(i4 - 1 + paramInt10)] = j;
      }
      paramArrayOfFloat5[(i4 - 1 - 1 + paramInt9)] = f3;
      paramArrayOfFloat5[(i4 - 1 + paramInt9)] = f5;
      k += 1;
    }
    i10 = m;
    i2 = 0;
    do
    {
      i9 = m - 1;
      k = m;
      i7 = i6;
      i8 = 1;
      for (i11 = i7 - 1 + 1; i11 > 0; i11--)
      {
        i4 = 2 * k;
        i1 = k - paramInt6;
        i5 = paramArrayOfInt[(i4 - 1 - 1 + paramInt10)];
        f3 = paramArrayOfFloat5[(i4 - 1 - 1 + paramInt9)];
        f5 = paramArrayOfFloat5[(i4 - 1 + paramInt9)];
        f4 = 0.5F * (f3 + f5);
        f8 = f5 - f4;
        f7 = Math.max(Math.abs(f3), Math.abs(f5));
        if ((f8 >= paramFloat1 * f7 ? 0 : 1) == 0) {}
        if (((i2 != i ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          i6 -= 1;
          paramArrayOfInt[(i4 - 1 - 1 + paramInt10)] = 0;
          if ((m != k ? 0 : 1) != 0) {
            m = i5;
          } else if ((i9 < m ? 0 : 1) != 0) {
            paramArrayOfInt[(2 * i9 - 1 - 1 + paramInt10)] = i5;
          }
          k = i5;
        }
        else
        {
          i9 = k;
          j = 0;
          f6 = f4;
          f1 = paramArrayOfFloat1[(1 - 1 + paramInt2)] - f6;
          if ((f1 >= 0.0F ? 0 : 1) != 0) {
            j += 1;
          }
          i3 = 2;
          for (i12 = paramInt1 - 2 + 1; i12 > 0; i12--)
          {
            f1 = paramArrayOfFloat1[(i3 - 1 + paramInt2)] - f6 - paramArrayOfFloat2[(i3 - 1 - 1 + paramInt3)] / f1;
            if ((f1 >= 0.0F ? 0 : 1) != 0) {
              j += 1;
            }
            i3 += 1;
          }
          if ((j > k - 1 ? 0 : 1) != 0) {
            paramArrayOfFloat5[(i4 - 1 - 1 + paramInt9)] = f4;
          } else {
            paramArrayOfFloat5[(i4 - 1 + paramInt9)] = f4;
          }
          k = i5;
        }
        i8 += 1;
      }
      i2 += 1;
      if ((i6 <= 0 ? 0 : 1) == 0) {}
    } while (((i2 > i ? 0 : 1) != 0 ? 1 : 0) != 0);
    k = i10;
    for (i11 = paramInt5 - i10 + 1; i11 > 0; i11--)
    {
      i4 = 2 * k;
      i1 = k - paramInt6;
      if ((paramArrayOfInt[(i4 - 1 - 1 + paramInt10)] != 0 ? 0 : 1) != 0)
      {
        paramArrayOfFloat3[(i1 - 1 + paramInt7)] = (0.5F * (paramArrayOfFloat5[(i4 - 1 - 1 + paramInt9)] + paramArrayOfFloat5[(i4 - 1 + paramInt9)]));
        paramArrayOfFloat5[(i4 - 1 + paramInt9)] -= paramArrayOfFloat3[(i1 - 1 + paramInt7)];
      }
      k += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarrj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */