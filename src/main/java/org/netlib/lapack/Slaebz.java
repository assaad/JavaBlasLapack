package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Slaebz
{
  public static void slaebz(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat1, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat1, int paramInt7, float[] paramArrayOfFloat2, int paramInt8, float[] paramArrayOfFloat3, int paramInt9, int[] paramArrayOfInt1, int paramInt10, float[] paramArrayOfFloat4, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, intW paramintW1, int[] paramArrayOfInt2, int paramInt13, float[] paramArrayOfFloat6, int paramInt14, int[] paramArrayOfInt3, int paramInt15, intW paramintW2)
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    paramintW2.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -1;
      return;
    }
    int i7;
    int i8;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramintW1.val = 0;
      m = 1;
      for (i6 = paramInt5 - 1 + 1; i6 > 0; i6--)
      {
        i1 = 1;
        for (i7 = 2 - 1 + 1; i7 > 0; i7--)
        {
          f1 = paramArrayOfFloat1[(1 - 1 + paramInt7)] - paramArrayOfFloat4[(m - 1 + (i1 - 1) * paramInt4 + paramInt11)];
          if ((Math.abs(f1) >= paramFloat3 ? 0 : 1) != 0) {
            f1 = -paramFloat3;
          }
          paramArrayOfInt2[(m - 1 + (i1 - 1) * paramInt4 + paramInt13)] = 0;
          if ((f1 > 0.0F ? 0 : 1) != 0) {
            paramArrayOfInt2[(m - 1 + (i1 - 1) * paramInt4 + paramInt13)] = 1;
          }
          k = 2;
          for (i8 = paramInt3 - 2 + 1; i8 > 0; i8--)
          {
            f1 = paramArrayOfFloat1[(k - 1 + paramInt7)] - paramArrayOfFloat3[(k - 1 - 1 + paramInt9)] / f1 - paramArrayOfFloat4[(m - 1 + (i1 - 1) * paramInt4 + paramInt11)];
            if ((Math.abs(f1) >= paramFloat3 ? 0 : 1) != 0) {
              f1 = -paramFloat3;
            }
            if ((f1 > 0.0F ? 0 : 1) != 0) {
              paramArrayOfInt2[(m - 1 + (i1 - 1) * paramInt4 + paramInt13)] += 1;
            }
            k += 1;
          }
          i1 += 1;
        }
        paramintW1.val = (paramintW1.val + paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] - paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)]);
        m += 1;
      }
      return;
    }
    i2 = 1;
    i4 = paramInt5;
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      m = 1;
      for (i6 = paramInt5 - 1 + 1; i6 > 0; i6--)
      {
        paramArrayOfFloat5[(m - 1 + paramInt12)] = (0.5F * (paramArrayOfFloat4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] + paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)]));
        m += 1;
      }
    }
    n = 1;
    for (int i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
    {
      if ((i4 - i2 + 1 < paramInt6 ? 0 : 1) != 0) {}
      if (((paramInt6 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        m = i2;
        for (i7 = i4 - i2 + 1; i7 > 0; i7--)
        {
          paramArrayOfFloat6[(m - 1 + paramInt14)] = (paramArrayOfFloat1[(1 - 1 + paramInt7)] - paramArrayOfFloat5[(m - 1 + paramInt12)]);
          paramArrayOfInt3[(m - 1 + paramInt15)] = 0;
          if ((paramArrayOfFloat6[(m - 1 + paramInt14)] > paramFloat3 ? 0 : 1) != 0)
          {
            paramArrayOfInt3[(m - 1 + paramInt15)] = 1;
            paramArrayOfFloat6[(m - 1 + paramInt14)] = Math.min(paramArrayOfFloat6[(m - 1 + paramInt14)], -paramFloat3);
          }
          k = 2;
          for (i8 = paramInt3 - 2 + 1; i8 > 0; i8--)
          {
            paramArrayOfFloat6[(m - 1 + paramInt14)] = (paramArrayOfFloat1[(k - 1 + paramInt7)] - paramArrayOfFloat3[(k - 1 - 1 + paramInt9)] / paramArrayOfFloat6[(m - 1 + paramInt14)] - paramArrayOfFloat5[(m - 1 + paramInt12)]);
            if ((paramArrayOfFloat6[(m - 1 + paramInt14)] > paramFloat3 ? 0 : 1) != 0)
            {
              paramArrayOfInt3[(m - 1 + paramInt15)] += 1;
              paramArrayOfFloat6[(m - 1 + paramInt14)] = Math.min(paramArrayOfFloat6[(m - 1 + paramInt14)], -paramFloat3);
            }
            k += 1;
          }
          m += 1;
        }
        if ((paramInt1 > 2 ? 0 : 1) != 0)
        {
          i5 = i4;
          m = i2;
          for (i7 = i4 - i2 + 1; i7 > 0; i7--)
          {
            paramArrayOfInt3[(m - 1 + paramInt15)] = Math.min(paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)], Math.max(paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)], paramArrayOfInt3[(m - 1 + paramInt15)]));
            if ((paramArrayOfInt3[(m - 1 + paramInt15)] != paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfFloat5[(m - 1 + paramInt12)];
            }
            else if ((paramArrayOfInt3[(m - 1 + paramInt15)] != paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] = paramArrayOfFloat5[(m - 1 + paramInt12)];
            }
            else
            {
              i5 += 1;
              if ((i5 > paramInt4 ? 0 : 1) != 0)
              {
                paramArrayOfFloat4[(i5 - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)];
                paramArrayOfInt2[(i5 - 1 + (2 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)];
                paramArrayOfFloat4[(i5 - 1 + (1 - 1) * paramInt4 + paramInt11)] = paramArrayOfFloat5[(m - 1 + paramInt12)];
                paramArrayOfInt2[(i5 - 1 + (1 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt3[(m - 1 + paramInt15)];
                paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfFloat5[(m - 1 + paramInt12)];
                paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt3[(m - 1 + paramInt15)];
              }
              else
              {
                paramintW2.val = (paramInt4 + 1);
              }
            }
            m += 1;
          }
          if ((paramintW2.val == 0 ? 0 : 1) != 0) {
            return;
          }
          i4 = i5;
        }
        else
        {
          m = i2;
          for (i7 = i4 - i2 + 1; i7 > 0; i7--)
          {
            if ((paramArrayOfInt3[(m - 1 + paramInt15)] > paramArrayOfInt1[(m - 1 + paramInt10)] ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] = paramArrayOfFloat5[(m - 1 + paramInt12)];
              paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt3[(m - 1 + paramInt15)];
            }
            if ((paramArrayOfInt3[(m - 1 + paramInt15)] < paramArrayOfInt1[(m - 1 + paramInt10)] ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfFloat5[(m - 1 + paramInt12)];
              paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt3[(m - 1 + paramInt15)];
            }
            m += 1;
          }
        }
      }
      else
      {
        i5 = i4;
        m = i2;
        for (i7 = i4 - i2 + 1; i7 > 0; i7--)
        {
          f1 = paramArrayOfFloat5[(m - 1 + paramInt12)];
          f2 = paramArrayOfFloat1[(1 - 1 + paramInt7)] - f1;
          i = 0;
          if ((f2 > paramFloat3 ? 0 : 1) != 0)
          {
            i = 1;
            f2 = Math.min(f2, -paramFloat3);
          }
          k = 2;
          for (i8 = paramInt3 - 2 + 1; i8 > 0; i8--)
          {
            f2 = paramArrayOfFloat1[(k - 1 + paramInt7)] - paramArrayOfFloat3[(k - 1 - 1 + paramInt9)] / f2 - f1;
            if ((f2 > paramFloat3 ? 0 : 1) != 0)
            {
              i += 1;
              f2 = Math.min(f2, -paramFloat3);
            }
            k += 1;
          }
          if ((paramInt1 > 2 ? 0 : 1) != 0)
          {
            i = Math.min(paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)], Math.max(paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)], i));
            if ((i != paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = f1;
            }
            else if ((i != paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] = f1;
            }
            else if ((i5 >= paramInt4 ? 0 : 1) != 0)
            {
              i5 += 1;
              paramArrayOfFloat4[(i5 - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)];
              paramArrayOfInt2[(i5 - 1 + (2 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)];
              paramArrayOfFloat4[(i5 - 1 + (1 - 1) * paramInt4 + paramInt11)] = f1;
              paramArrayOfInt2[(i5 - 1 + (1 - 1) * paramInt4 + paramInt13)] = i;
              paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = f1;
              paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] = i;
            }
            else
            {
              paramintW2.val = (paramInt4 + 1);
              return;
            }
          }
          else
          {
            if ((i > paramArrayOfInt1[(m - 1 + paramInt10)] ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] = f1;
              paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] = i;
            }
            if ((i < paramArrayOfInt1[(m - 1 + paramInt10)] ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = f1;
              paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] = i;
            }
          }
          m += 1;
        }
        i4 = i5;
      }
      i3 = i2;
      m = i2;
      for (i7 = i4 - i2 + 1; i7 > 0; i7--)
      {
        f1 = Math.abs(paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] - paramArrayOfFloat4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)]);
        f2 = Math.max(Math.abs(paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)]), Math.abs(paramArrayOfFloat4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)]));
        if ((f1 >= Util.max(paramFloat1, paramFloat3, paramFloat2 * f2) ? 0 : 1) == 0) {}
        if (((paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] < paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          if ((m <= i3 ? 0 : 1) != 0)
          {
            f1 = paramArrayOfFloat4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)];
            f2 = paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)];
            i = paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)];
            j = paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)];
            paramArrayOfFloat4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] = paramArrayOfFloat4[(i3 - 1 + (1 - 1) * paramInt4 + paramInt11)];
            paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfFloat4[(i3 - 1 + (2 - 1) * paramInt4 + paramInt11)];
            paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt2[(i3 - 1 + (1 - 1) * paramInt4 + paramInt13)];
            paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt2[(i3 - 1 + (2 - 1) * paramInt4 + paramInt13)];
            paramArrayOfFloat4[(i3 - 1 + (1 - 1) * paramInt4 + paramInt11)] = f1;
            paramArrayOfFloat4[(i3 - 1 + (2 - 1) * paramInt4 + paramInt11)] = f2;
            paramArrayOfInt2[(i3 - 1 + (1 - 1) * paramInt4 + paramInt13)] = i;
            paramArrayOfInt2[(i3 - 1 + (2 - 1) * paramInt4 + paramInt13)] = j;
            if ((paramInt1 != 3 ? 0 : 1) != 0)
            {
              i = paramArrayOfInt1[(m - 1 + paramInt10)];
              paramArrayOfInt1[(m - 1 + paramInt10)] = paramArrayOfInt1[(i3 - 1 + paramInt10)];
              paramArrayOfInt1[(i3 - 1 + paramInt10)] = i;
            }
          }
          i3 += 1;
        }
        m += 1;
      }
      i2 = i3;
      m = i2;
      for (i7 = i4 - i2 + 1; i7 > 0; i7--)
      {
        paramArrayOfFloat5[(m - 1 + paramInt12)] = (0.5F * (paramArrayOfFloat4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] + paramArrayOfFloat4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)]));
        m += 1;
      }
      if ((i2 <= i4 ? 0 : 1) != 0) {
        break;
      }
      n += 1;
    }
    paramintW2.val = Math.max(i4 + 1 - i2, 0);
    paramintW1.val = i4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaebz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */