package org.netlib.lapack;

import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slar1v
{
  public static void slar1v(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat5, int paramInt8, boolean paramBoolean, intW paramintW1, floatW paramfloatW1, floatW paramfloatW2, intW paramintW2, int[] paramArrayOfInt, int paramInt9, floatW paramfloatW3, floatW paramfloatW4, floatW paramfloatW5, float[] paramArrayOfFloat6, int paramInt10)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    f3 = Slamch.slamch("Precision");
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      i3 = paramInt2;
      i4 = paramInt3;
    }
    else
    {
      i3 = paramintW2.val;
      i4 = paramintW2.val;
    }
    j = 0;
    n = paramInt1;
    m = 2 * paramInt1 + 1;
    k = 3 * paramInt1 + 1;
    if ((paramInt2 != 1 ? 0 : 1) != 0) {
      paramArrayOfFloat6[(m - 1 + paramInt10)] = 0.0F;
    } else {
      paramArrayOfFloat6[(m + paramInt2 - 1 - 1 + paramInt10)] = paramArrayOfFloat4[(paramInt2 - 1 - 1 + paramInt7)];
    }
    bool1 = false;
    i1 = 0;
    f4 = paramArrayOfFloat6[(m + paramInt2 - 1 - 1 + paramInt10)] - paramFloat1;
    i = paramInt2;
    for (int i5 = i3 - 1 - paramInt2 + 1; i5 > 0; i5--)
    {
      f2 = paramArrayOfFloat1[(i - 1 + paramInt4)] + f4;
      paramArrayOfFloat6[(j + i - 1 + paramInt10)] = (paramArrayOfFloat3[(i - 1 + paramInt6)] / f2);
      if ((f2 >= 0.0F ? 0 : 1) != 0) {
        i1 += 1;
      }
      paramArrayOfFloat6[(m + i - 1 + paramInt10)] = (f4 * paramArrayOfFloat6[(j + i - 1 + paramInt10)] * paramArrayOfFloat2[(i - 1 + paramInt5)]);
      f4 = paramArrayOfFloat6[(m + i - 1 + paramInt10)] - paramFloat1;
      i += 1;
    }
    bool1 = Sisnan.sisnan(f4);
    if (!bool1)
    {
      i = i3;
      for (i5 = i4 - 1 - i3 + 1; i5 > 0; i5--)
      {
        f2 = paramArrayOfFloat1[(i - 1 + paramInt4)] + f4;
        paramArrayOfFloat6[(j + i - 1 + paramInt10)] = (paramArrayOfFloat3[(i - 1 + paramInt6)] / f2);
        paramArrayOfFloat6[(m + i - 1 + paramInt10)] = (f4 * paramArrayOfFloat6[(j + i - 1 + paramInt10)] * paramArrayOfFloat2[(i - 1 + paramInt5)]);
        f4 = paramArrayOfFloat6[(m + i - 1 + paramInt10)] - paramFloat1;
        i += 1;
      }
      bool1 = Sisnan.sisnan(f4);
    }
    if (bool1)
    {
      i1 = 0;
      f4 = paramArrayOfFloat6[(m + paramInt2 - 1 - 1 + paramInt10)] - paramFloat1;
      i = paramInt2;
      for (i5 = i3 - 1 - paramInt2 + 1; i5 > 0; i5--)
      {
        f2 = paramArrayOfFloat1[(i - 1 + paramInt4)] + f4;
        if ((Math.abs(f2) >= paramFloat2 ? 0 : 1) != 0) {
          f2 = -paramFloat2;
        }
        paramArrayOfFloat6[(j + i - 1 + paramInt10)] = (paramArrayOfFloat3[(i - 1 + paramInt6)] / f2);
        if ((f2 >= 0.0F ? 0 : 1) != 0) {
          i1 += 1;
        }
        paramArrayOfFloat6[(m + i - 1 + paramInt10)] = (f4 * paramArrayOfFloat6[(j + i - 1 + paramInt10)] * paramArrayOfFloat2[(i - 1 + paramInt5)]);
        if ((paramArrayOfFloat6[(j + i - 1 + paramInt10)] != 0.0F ? 0 : 1) != 0) {
          paramArrayOfFloat6[(m + i - 1 + paramInt10)] = paramArrayOfFloat4[(i - 1 + paramInt7)];
        }
        f4 = paramArrayOfFloat6[(m + i - 1 + paramInt10)] - paramFloat1;
        i += 1;
      }
      i = i3;
      for (i5 = i4 - 1 - i3 + 1; i5 > 0; i5--)
      {
        f2 = paramArrayOfFloat1[(i - 1 + paramInt4)] + f4;
        if ((Math.abs(f2) >= paramFloat2 ? 0 : 1) != 0) {
          f2 = -paramFloat2;
        }
        paramArrayOfFloat6[(j + i - 1 + paramInt10)] = (paramArrayOfFloat3[(i - 1 + paramInt6)] / f2);
        paramArrayOfFloat6[(m + i - 1 + paramInt10)] = (f4 * paramArrayOfFloat6[(j + i - 1 + paramInt10)] * paramArrayOfFloat2[(i - 1 + paramInt5)]);
        if ((paramArrayOfFloat6[(j + i - 1 + paramInt10)] != 0.0F ? 0 : 1) != 0) {
          paramArrayOfFloat6[(m + i - 1 + paramInt10)] = paramArrayOfFloat4[(i - 1 + paramInt7)];
        }
        f4 = paramArrayOfFloat6[(m + i - 1 + paramInt10)] - paramFloat1;
        i += 1;
      }
    }
    bool2 = false;
    i2 = 0;
    paramArrayOfFloat6[(k + paramInt3 - 1 - 1 + paramInt10)] = (paramArrayOfFloat1[(paramInt3 - 1 + paramInt4)] - paramFloat1);
    i = paramInt3 - 1;
    for (i5 = (i3 - (paramInt3 - 1) + -1) / -1; i5 > 0; i5--)
    {
      f1 = paramArrayOfFloat4[(i - 1 + paramInt7)] + paramArrayOfFloat6[(k + i - 1 + paramInt10)];
      f5 = paramArrayOfFloat1[(i - 1 + paramInt4)] / f1;
      if ((f1 >= 0.0F ? 0 : 1) != 0) {
        i2 += 1;
      }
      paramArrayOfFloat6[(n + i - 1 + paramInt10)] = (paramArrayOfFloat2[(i - 1 + paramInt5)] * f5);
      paramArrayOfFloat6[(k + i - 1 - 1 + paramInt10)] = (paramArrayOfFloat6[(k + i - 1 + paramInt10)] * f5 - paramFloat1);
      i += -1;
    }
    f5 = paramArrayOfFloat6[(k + i3 - 1 - 1 + paramInt10)];
    bool2 = Sisnan.sisnan(f5);
    if (bool2)
    {
      i2 = 0;
      i = paramInt3 - 1;
      for (i5 = (i3 - (paramInt3 - 1) + -1) / -1; i5 > 0; i5--)
      {
        f1 = paramArrayOfFloat4[(i - 1 + paramInt7)] + paramArrayOfFloat6[(k + i - 1 + paramInt10)];
        if ((Math.abs(f1) >= paramFloat2 ? 0 : 1) != 0) {
          f1 = -paramFloat2;
        }
        f5 = paramArrayOfFloat1[(i - 1 + paramInt4)] / f1;
        if ((f1 >= 0.0F ? 0 : 1) != 0) {
          i2 += 1;
        }
        paramArrayOfFloat6[(n + i - 1 + paramInt10)] = (paramArrayOfFloat2[(i - 1 + paramInt5)] * f5);
        paramArrayOfFloat6[(k + i - 1 - 1 + paramInt10)] = (paramArrayOfFloat6[(k + i - 1 + paramInt10)] * f5 - paramFloat1);
        if ((f5 != 0.0F ? 0 : 1) != 0) {
          paramArrayOfFloat6[(k + i - 1 - 1 + paramInt10)] = (paramArrayOfFloat1[(i - 1 + paramInt4)] - paramFloat1);
        }
        i += -1;
      }
    }
    paramfloatW2.val = (paramArrayOfFloat6[(m + i3 - 1 - 1 + paramInt10)] + paramArrayOfFloat6[(k + i3 - 1 - 1 + paramInt10)]);
    if ((paramfloatW2.val >= 0.0F ? 0 : 1) != 0) {
      i1 += 1;
    }
    if (paramBoolean) {
      paramintW1.val = (i1 + i2);
    } else {
      paramintW1.val = -1;
    }
    if ((Math.abs(paramfloatW2.val) != 0.0F ? 0 : 1) != 0) {
      paramfloatW2.val = (f3 * paramArrayOfFloat6[(m + i3 - 1 - 1 + paramInt10)]);
    }
    paramintW2.val = i3;
    i = i3;
    for (i5 = i4 - 1 - i3 + 1; i5 > 0; i5--)
    {
      f5 = paramArrayOfFloat6[(m + i - 1 + paramInt10)] + paramArrayOfFloat6[(k + i - 1 + paramInt10)];
      if ((f5 != 0.0F ? 0 : 1) != 0) {
        f5 = f3 * paramArrayOfFloat6[(m + i - 1 + paramInt10)];
      }
      if ((Math.abs(f5) > Math.abs(paramfloatW2.val) ? 0 : 1) != 0)
      {
        paramfloatW2.val = f5;
        paramintW2.val = (i + 1);
      }
      i += 1;
    }
    paramArrayOfInt[(1 - 1 + paramInt9)] = paramInt2;
    paramArrayOfInt[(2 - 1 + paramInt9)] = paramInt3;
    paramArrayOfFloat5[(paramintW2.val - 1 + paramInt8)] = 1.0F;
    paramfloatW1.val = 1.0F;
    if ((((bool1 ^ true)) && ((bool2 ^ true)) ? 1 : 0) != 0)
    {
      i = paramintW2.val - 1;
      for (i5 = (paramInt2 - (paramintW2.val - 1) + -1) / -1; i5 > 0; i5--)
      {
        paramArrayOfFloat5[(i - 1 + paramInt8)] = (-(paramArrayOfFloat6[(j + i - 1 + paramInt10)] * paramArrayOfFloat5[(i + 1 - 1 + paramInt8)]));
        if (((Math.abs(paramArrayOfFloat5[(i - 1 + paramInt8)]) + Math.abs(paramArrayOfFloat5[(i + 1 - 1 + paramInt8)])) * Math.abs(paramArrayOfFloat3[(i - 1 + paramInt6)]) >= paramFloat3 ? 0 : 1) != 0)
        {
          paramArrayOfFloat5[(i - 1 + paramInt8)] = 0.0F;
          paramArrayOfInt[(1 - 1 + paramInt9)] = (i + 1);
          break;
        }
        paramfloatW1.val += paramArrayOfFloat5[(i - 1 + paramInt8)] * paramArrayOfFloat5[(i - 1 + paramInt8)];
        i += -1;
      }
    }
    else
    {
      i = paramintW2.val - 1;
      for (i5 = (paramInt2 - (paramintW2.val - 1) + -1) / -1; i5 > 0; i5--)
      {
        if ((paramArrayOfFloat5[(i + 1 - 1 + paramInt8)] != 0.0F ? 0 : 1) != 0) {
          paramArrayOfFloat5[(i - 1 + paramInt8)] = (-(paramArrayOfFloat3[(i + 1 - 1 + paramInt6)] / paramArrayOfFloat3[(i - 1 + paramInt6)] * paramArrayOfFloat5[(i + 2 - 1 + paramInt8)]));
        } else {
          paramArrayOfFloat5[(i - 1 + paramInt8)] = (-(paramArrayOfFloat6[(j + i - 1 + paramInt10)] * paramArrayOfFloat5[(i + 1 - 1 + paramInt8)]));
        }
        if (((Math.abs(paramArrayOfFloat5[(i - 1 + paramInt8)]) + Math.abs(paramArrayOfFloat5[(i + 1 - 1 + paramInt8)])) * Math.abs(paramArrayOfFloat3[(i - 1 + paramInt6)]) >= paramFloat3 ? 0 : 1) != 0)
        {
          paramArrayOfFloat5[(i - 1 + paramInt8)] = 0.0F;
          paramArrayOfInt[(1 - 1 + paramInt9)] = (i + 1);
          break;
        }
        paramfloatW1.val += paramArrayOfFloat5[(i - 1 + paramInt8)] * paramArrayOfFloat5[(i - 1 + paramInt8)];
        i += -1;
      }
    }
    if ((((bool1 ^ true)) && ((bool2 ^ true)) ? 1 : 0) != 0)
    {
      i = paramintW2.val;
      for (i5 = paramInt3 - 1 - paramintW2.val + 1; i5 > 0; i5--)
      {
        paramArrayOfFloat5[(i + 1 - 1 + paramInt8)] = (-(paramArrayOfFloat6[(n + i - 1 + paramInt10)] * paramArrayOfFloat5[(i - 1 + paramInt8)]));
        if (((Math.abs(paramArrayOfFloat5[(i - 1 + paramInt8)]) + Math.abs(paramArrayOfFloat5[(i + 1 - 1 + paramInt8)])) * Math.abs(paramArrayOfFloat3[(i - 1 + paramInt6)]) >= paramFloat3 ? 0 : 1) != 0)
        {
          paramArrayOfFloat5[(i + 1 - 1 + paramInt8)] = 0.0F;
          paramArrayOfInt[(2 - 1 + paramInt9)] = i;
          break;
        }
        paramfloatW1.val += paramArrayOfFloat5[(i + 1 - 1 + paramInt8)] * paramArrayOfFloat5[(i + 1 - 1 + paramInt8)];
        i += 1;
      }
    }
    else
    {
      i = paramintW2.val;
      for (i5 = paramInt3 - 1 - paramintW2.val + 1; i5 > 0; i5--)
      {
        if ((paramArrayOfFloat5[(i - 1 + paramInt8)] != 0.0F ? 0 : 1) != 0) {
          paramArrayOfFloat5[(i + 1 - 1 + paramInt8)] = (-(paramArrayOfFloat3[(i - 1 - 1 + paramInt6)] / paramArrayOfFloat3[(i - 1 + paramInt6)] * paramArrayOfFloat5[(i - 1 - 1 + paramInt8)]));
        } else {
          paramArrayOfFloat5[(i + 1 - 1 + paramInt8)] = (-(paramArrayOfFloat6[(n + i - 1 + paramInt10)] * paramArrayOfFloat5[(i - 1 + paramInt8)]));
        }
        if (((Math.abs(paramArrayOfFloat5[(i - 1 + paramInt8)]) + Math.abs(paramArrayOfFloat5[(i + 1 - 1 + paramInt8)])) * Math.abs(paramArrayOfFloat3[(i - 1 + paramInt6)]) >= paramFloat3 ? 0 : 1) != 0)
        {
          paramArrayOfFloat5[(i + 1 - 1 + paramInt8)] = 0.0F;
          paramArrayOfInt[(2 - 1 + paramInt9)] = i;
          break;
        }
        paramfloatW1.val += paramArrayOfFloat5[(i + 1 - 1 + paramInt8)] * paramArrayOfFloat5[(i + 1 - 1 + paramInt8)];
        i += 1;
      }
    }
    f5 = 1.0F / paramfloatW1.val;
    paramfloatW3.val = ((float)Math.sqrt(f5));
    paramfloatW4.val = (Math.abs(paramfloatW2.val) * paramfloatW3.val);
    paramfloatW2.val *= f5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slar1v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */