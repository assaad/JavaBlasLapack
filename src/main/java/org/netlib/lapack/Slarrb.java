package org.netlib.lapack;

import org.netlib.util.intW;

public final class Slarrb
{
  public static void slarrb(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, float[] paramArrayOfFloat5, int paramInt9, float[] paramArrayOfFloat6, int paramInt10, int[] paramArrayOfInt, int paramInt11, float paramFloat3, float paramFloat4, int paramInt12, intW paramintW)
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
    paramintW.val = 0;
    i = (int)(((float)Math.log(paramFloat4 + paramFloat3) - (float)Math.log(paramFloat3)) / (float)Math.log(2.0F)) + 2;
    f7 = 2.0F * paramFloat3;
    i8 = paramInt12;
    if ((i8 >= 1 ? 0 : 1) == 0) {}
    if (((i8 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      i8 = paramInt1;
    }
    k = paramInt4;
    i5 = 0;
    i7 = 0;
    f8 = paramArrayOfFloat4[(k - paramInt6 - 1 + paramInt8)];
    j = k;
    for (int i9 = paramInt5 - k + 1; i9 > 0; i9--)
    {
      i2 = 2 * j;
      m = j - paramInt6;
      f4 = paramArrayOfFloat3[(m - 1 + paramInt7)] - paramArrayOfFloat5[(m - 1 + paramInt9)];
      f9 = paramArrayOfFloat3[(m - 1 + paramInt7)] + paramArrayOfFloat5[(m - 1 + paramInt9)];
      f5 = f8;
      f8 = paramArrayOfFloat4[(m - 1 + paramInt8)];
      f3 = Math.min(f5, f8);
      for (f1 = paramArrayOfFloat5[(m - 1 + paramInt9)];; f1 = 2.0F * f1)
      {
        i3 = Slaneg.slaneg(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, f4, paramFloat3, i8);
        if ((i3 <= j - 1 ? 0 : 1) == 0) {
          break;
        }
        f4 -= f1;
      }
      for (f1 = paramArrayOfFloat5[(m - 1 + paramInt9)];; f1 = 2.0F * f1)
      {
        i3 = Slaneg.slaneg(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, f9, paramFloat3, i8);
        if ((i3 >= j ? 0 : 1) == 0) {
          break;
        }
        f9 += f1;
      }
      f11 = 0.5F * Math.abs(f4 - f9);
      f10 = Math.max(Math.abs(f4), Math.abs(f9));
      f2 = Math.max(paramFloat1 * f3, paramFloat2 * f10);
      if ((f11 > f2 ? 0 : 1) == 0) {}
      if (((f11 > f7 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramArrayOfInt[(i2 - 1 - 1 + paramInt11)] = -1;
        if ((j != k ? 0 : 1) != 0) {}
        if (((j >= paramInt5 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          k = j + 1;
        }
        if ((i7 < k ? 0 : 1) != 0) {}
        if (((j > paramInt5 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramArrayOfInt[(2 * i7 - 1 - 1 + paramInt11)] = (j + 1);
        }
      }
      else
      {
        i7 = j;
        i5 += 1;
        paramArrayOfInt[(i2 - 1 - 1 + paramInt11)] = (j + 1);
        paramArrayOfInt[(i2 - 1 + paramInt11)] = i3;
      }
      paramArrayOfFloat6[(i2 - 1 - 1 + paramInt10)] = f4;
      paramArrayOfFloat6[(i2 - 1 + paramInt10)] = f9;
      j += 1;
    }
    i1 = 0;
    do
    {
      i7 = k - 1;
      j = k;
      i6 = i5;
      n = 1;
      for (i9 = i6 - 1 + 1; i9 > 0; i9--)
      {
        i2 = 2 * j;
        m = j - paramInt6;
        f8 = paramArrayOfFloat4[(m - 1 + paramInt8)];
        f5 = f8;
        if ((m <= 1 ? 0 : 1) != 0) {
          f5 = paramArrayOfFloat4[(m - 1 - 1 + paramInt8)];
        }
        f3 = Math.min(f5, f8);
        i4 = paramArrayOfInt[(i2 - 1 - 1 + paramInt11)];
        f4 = paramArrayOfFloat6[(i2 - 1 - 1 + paramInt10)];
        f9 = paramArrayOfFloat6[(i2 - 1 + paramInt10)];
        f6 = 0.5F * (f4 + f9);
        f11 = f9 - f6;
        f10 = Math.max(Math.abs(f4), Math.abs(f9));
        f2 = Math.max(paramFloat1 * f3, paramFloat2 * f10);
        if ((f11 > f2 ? 0 : 1) == 0) {}
        if (((f11 > f7 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
        if (((i1 != i ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          i5 -= 1;
          paramArrayOfInt[(i2 - 1 - 1 + paramInt11)] = 0;
          if ((k != j ? 0 : 1) != 0) {
            k = i4;
          } else if ((i7 < k ? 0 : 1) != 0) {
            paramArrayOfInt[(2 * i7 - 1 - 1 + paramInt11)] = i4;
          }
          j = i4;
        }
        else
        {
          i7 = j;
          i3 = Slaneg.slaneg(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, f6, paramFloat3, i8);
          if ((i3 > j - 1 ? 0 : 1) != 0) {
            paramArrayOfFloat6[(i2 - 1 - 1 + paramInt10)] = f6;
          } else {
            paramArrayOfFloat6[(i2 - 1 + paramInt10)] = f6;
          }
          j = i4;
        }
        n += 1;
      }
      i1 += 1;
      if ((i5 <= 0 ? 0 : 1) == 0) {}
    } while (((i1 > i ? 0 : 1) != 0 ? 1 : 0) != 0);
    j = paramInt4;
    for (i9 = paramInt5 - paramInt4 + 1; i9 > 0; i9--)
    {
      i2 = 2 * j;
      m = j - paramInt6;
      if ((paramArrayOfInt[(i2 - 1 - 1 + paramInt11)] != 0 ? 0 : 1) != 0)
      {
        paramArrayOfFloat3[(m - 1 + paramInt7)] = (0.5F * (paramArrayOfFloat6[(i2 - 1 - 1 + paramInt10)] + paramArrayOfFloat6[(i2 - 1 + paramInt10)]));
        paramArrayOfFloat6[(i2 - 1 + paramInt10)] -= paramArrayOfFloat3[(m - 1 + paramInt7)];
      }
      j += 1;
    }
    j = paramInt4 + 1;
    for (i9 = paramInt5 - (paramInt4 + 1) + 1; i9 > 0; i9--)
    {
      i2 = 2 * j;
      m = j - paramInt6;
      paramArrayOfFloat4[(m - 1 - 1 + paramInt8)] = Math.max(0.0F, paramArrayOfFloat3[(m - 1 + paramInt7)] - paramArrayOfFloat5[(m - 1 + paramInt9)] - paramArrayOfFloat3[(m - 1 - 1 + paramInt7)] - paramArrayOfFloat5[(m - 1 - 1 + paramInt9)]);
      j += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarrb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */