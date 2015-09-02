package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Dlaebz
{
  public static void dlaebz(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble1, double paramDouble2, double paramDouble3, double[] paramArrayOfDouble1, int paramInt7, double[] paramArrayOfDouble2, int paramInt8, double[] paramArrayOfDouble3, int paramInt9, int[] paramArrayOfInt1, int paramInt10, double[] paramArrayOfDouble4, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, intW paramintW1, int[] paramArrayOfInt2, int paramInt13, double[] paramArrayOfDouble6, int paramInt14, int[] paramArrayOfInt3, int paramInt15, intW paramintW2)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
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
          d1 = paramArrayOfDouble1[(1 - 1 + paramInt7)] - paramArrayOfDouble4[(m - 1 + (i1 - 1) * paramInt4 + paramInt11)];
          if ((Math.abs(d1) >= paramDouble3 ? 0 : 1) != 0) {
            d1 = -paramDouble3;
          }
          paramArrayOfInt2[(m - 1 + (i1 - 1) * paramInt4 + paramInt13)] = 0;
          if ((d1 > 0.0D ? 0 : 1) != 0) {
            paramArrayOfInt2[(m - 1 + (i1 - 1) * paramInt4 + paramInt13)] = 1;
          }
          k = 2;
          for (i8 = paramInt3 - 2 + 1; i8 > 0; i8--)
          {
            d1 = paramArrayOfDouble1[(k - 1 + paramInt7)] - paramArrayOfDouble3[(k - 1 - 1 + paramInt9)] / d1 - paramArrayOfDouble4[(m - 1 + (i1 - 1) * paramInt4 + paramInt11)];
            if ((Math.abs(d1) >= paramDouble3 ? 0 : 1) != 0) {
              d1 = -paramDouble3;
            }
            if ((d1 > 0.0D ? 0 : 1) != 0) {
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
        paramArrayOfDouble5[(m - 1 + paramInt12)] = (0.5D * (paramArrayOfDouble4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] + paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)]));
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
          paramArrayOfDouble6[(m - 1 + paramInt14)] = (paramArrayOfDouble1[(1 - 1 + paramInt7)] - paramArrayOfDouble5[(m - 1 + paramInt12)]);
          paramArrayOfInt3[(m - 1 + paramInt15)] = 0;
          if ((paramArrayOfDouble6[(m - 1 + paramInt14)] > paramDouble3 ? 0 : 1) != 0)
          {
            paramArrayOfInt3[(m - 1 + paramInt15)] = 1;
            paramArrayOfDouble6[(m - 1 + paramInt14)] = Math.min(paramArrayOfDouble6[(m - 1 + paramInt14)], -paramDouble3);
          }
          k = 2;
          for (i8 = paramInt3 - 2 + 1; i8 > 0; i8--)
          {
            paramArrayOfDouble6[(m - 1 + paramInt14)] = (paramArrayOfDouble1[(k - 1 + paramInt7)] - paramArrayOfDouble3[(k - 1 - 1 + paramInt9)] / paramArrayOfDouble6[(m - 1 + paramInt14)] - paramArrayOfDouble5[(m - 1 + paramInt12)]);
            if ((paramArrayOfDouble6[(m - 1 + paramInt14)] > paramDouble3 ? 0 : 1) != 0)
            {
              paramArrayOfInt3[(m - 1 + paramInt15)] += 1;
              paramArrayOfDouble6[(m - 1 + paramInt14)] = Math.min(paramArrayOfDouble6[(m - 1 + paramInt14)], -paramDouble3);
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
              paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfDouble5[(m - 1 + paramInt12)];
            }
            else if ((paramArrayOfInt3[(m - 1 + paramInt15)] != paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] ? 0 : 1) != 0)
            {
              paramArrayOfDouble4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] = paramArrayOfDouble5[(m - 1 + paramInt12)];
            }
            else
            {
              i5 += 1;
              if ((i5 > paramInt4 ? 0 : 1) != 0)
              {
                paramArrayOfDouble4[(i5 - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)];
                paramArrayOfInt2[(i5 - 1 + (2 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)];
                paramArrayOfDouble4[(i5 - 1 + (1 - 1) * paramInt4 + paramInt11)] = paramArrayOfDouble5[(m - 1 + paramInt12)];
                paramArrayOfInt2[(i5 - 1 + (1 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt3[(m - 1 + paramInt15)];
                paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfDouble5[(m - 1 + paramInt12)];
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
              paramArrayOfDouble4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] = paramArrayOfDouble5[(m - 1 + paramInt12)];
              paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt3[(m - 1 + paramInt15)];
            }
            if ((paramArrayOfInt3[(m - 1 + paramInt15)] < paramArrayOfInt1[(m - 1 + paramInt10)] ? 0 : 1) != 0)
            {
              paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfDouble5[(m - 1 + paramInt12)];
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
          d1 = paramArrayOfDouble5[(m - 1 + paramInt12)];
          d2 = paramArrayOfDouble1[(1 - 1 + paramInt7)] - d1;
          i = 0;
          if ((d2 > paramDouble3 ? 0 : 1) != 0)
          {
            i = 1;
            d2 = Math.min(d2, -paramDouble3);
          }
          k = 2;
          for (i8 = paramInt3 - 2 + 1; i8 > 0; i8--)
          {
            d2 = paramArrayOfDouble1[(k - 1 + paramInt7)] - paramArrayOfDouble3[(k - 1 - 1 + paramInt9)] / d2 - d1;
            if ((d2 > paramDouble3 ? 0 : 1) != 0)
            {
              i += 1;
              d2 = Math.min(d2, -paramDouble3);
            }
            k += 1;
          }
          if ((paramInt1 > 2 ? 0 : 1) != 0)
          {
            i = Math.min(paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)], Math.max(paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)], i));
            if ((i != paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] ? 0 : 1) != 0)
            {
              paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = d1;
            }
            else if ((i != paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] ? 0 : 1) != 0)
            {
              paramArrayOfDouble4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] = d1;
            }
            else if ((i5 >= paramInt4 ? 0 : 1) != 0)
            {
              i5 += 1;
              paramArrayOfDouble4[(i5 - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)];
              paramArrayOfInt2[(i5 - 1 + (2 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)];
              paramArrayOfDouble4[(i5 - 1 + (1 - 1) * paramInt4 + paramInt11)] = d1;
              paramArrayOfInt2[(i5 - 1 + (1 - 1) * paramInt4 + paramInt13)] = i;
              paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = d1;
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
              paramArrayOfDouble4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] = d1;
              paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] = i;
            }
            if ((i < paramArrayOfInt1[(m - 1 + paramInt10)] ? 0 : 1) != 0)
            {
              paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = d1;
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
        d1 = Math.abs(paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] - paramArrayOfDouble4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)]);
        d2 = Math.max(Math.abs(paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)]), Math.abs(paramArrayOfDouble4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)]));
        if ((d1 >= Util.max(paramDouble1, paramDouble3, paramDouble2 * d2) ? 0 : 1) == 0) {}
        if (((paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] < paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          if ((m <= i3 ? 0 : 1) != 0)
          {
            d1 = paramArrayOfDouble4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)];
            d2 = paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)];
            i = paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)];
            j = paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)];
            paramArrayOfDouble4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] = paramArrayOfDouble4[(i3 - 1 + (1 - 1) * paramInt4 + paramInt11)];
            paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)] = paramArrayOfDouble4[(i3 - 1 + (2 - 1) * paramInt4 + paramInt11)];
            paramArrayOfInt2[(m - 1 + (1 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt2[(i3 - 1 + (1 - 1) * paramInt4 + paramInt13)];
            paramArrayOfInt2[(m - 1 + (2 - 1) * paramInt4 + paramInt13)] = paramArrayOfInt2[(i3 - 1 + (2 - 1) * paramInt4 + paramInt13)];
            paramArrayOfDouble4[(i3 - 1 + (1 - 1) * paramInt4 + paramInt11)] = d1;
            paramArrayOfDouble4[(i3 - 1 + (2 - 1) * paramInt4 + paramInt11)] = d2;
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
        paramArrayOfDouble5[(m - 1 + paramInt12)] = (0.5D * (paramArrayOfDouble4[(m - 1 + (1 - 1) * paramInt4 + paramInt11)] + paramArrayOfDouble4[(m - 1 + (2 - 1) * paramInt4 + paramInt11)]));
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaebz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */