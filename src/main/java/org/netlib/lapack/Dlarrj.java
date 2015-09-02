package org.netlib.lapack;

import org.netlib.util.intW;

public final class Dlarrj
{
  public static void dlarrj(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, int paramInt5, double paramDouble1, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, double[] paramArrayOfDouble5, int paramInt9, int[] paramArrayOfInt, int paramInt10, double paramDouble2, double paramDouble3, intW paramintW)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    paramintW.val = 0;
    i = (int)((Math.log(paramDouble3 + paramDouble2) - Math.log(paramDouble2)) / Math.log(2.0D)) + 2;
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
      d3 = paramArrayOfDouble3[(i1 - 1 + paramInt7)] - paramArrayOfDouble4[(i1 - 1 + paramInt8)];
      d4 = paramArrayOfDouble3[(i1 - 1 + paramInt7)];
      d5 = paramArrayOfDouble3[(i1 - 1 + paramInt7)] + paramArrayOfDouble4[(i1 - 1 + paramInt8)];
      d8 = d5 - d4;
      d7 = Math.max(Math.abs(d3), Math.abs(d5));
      if ((d8 >= paramDouble1 * d7 ? 0 : 1) != 0)
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
        for (d2 = 1.0D;; d2 = 2.0D * d2)
        {
          j = 0;
          d6 = d3;
          d1 = paramArrayOfDouble1[(1 - 1 + paramInt2)] - d6;
          if ((d1 >= 0.0D ? 0 : 1) != 0) {
            j += 1;
          }
          i3 = 2;
          for (i12 = paramInt1 - 2 + 1; i12 > 0; i12--)
          {
            d1 = paramArrayOfDouble1[(i3 - 1 + paramInt2)] - d6 - paramArrayOfDouble2[(i3 - 1 - 1 + paramInt3)] / d1;
            if ((d1 >= 0.0D ? 0 : 1) != 0) {
              j += 1;
            }
            i3 += 1;
          }
          if ((j <= k - 1 ? 0 : 1) == 0) {
            break;
          }
          d3 -= paramArrayOfDouble4[(i1 - 1 + paramInt8)] * d2;
        }
        for (d2 = 1.0D;; d2 = 2.0D * d2)
        {
          j = 0;
          d6 = d5;
          d1 = paramArrayOfDouble1[(1 - 1 + paramInt2)] - d6;
          if ((d1 >= 0.0D ? 0 : 1) != 0) {
            j += 1;
          }
          i3 = 2;
          for (i12 = paramInt1 - 2 + 1; i12 > 0; i12--)
          {
            d1 = paramArrayOfDouble1[(i3 - 1 + paramInt2)] - d6 - paramArrayOfDouble2[(i3 - 1 - 1 + paramInt3)] / d1;
            if ((d1 >= 0.0D ? 0 : 1) != 0) {
              j += 1;
            }
            i3 += 1;
          }
          if ((j >= k ? 0 : 1) == 0) {
            break;
          }
          d5 += paramArrayOfDouble4[(i1 - 1 + paramInt8)] * d2;
        }
        i6 += 1;
        paramArrayOfInt[(i4 - 1 - 1 + paramInt10)] = (k + 1);
        paramArrayOfInt[(i4 - 1 + paramInt10)] = j;
      }
      paramArrayOfDouble5[(i4 - 1 - 1 + paramInt9)] = d3;
      paramArrayOfDouble5[(i4 - 1 + paramInt9)] = d5;
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
      for (int i11 = i7 - 1 + 1; i11 > 0; i11--)
      {
        i4 = 2 * k;
        i1 = k - paramInt6;
        i5 = paramArrayOfInt[(i4 - 1 - 1 + paramInt10)];
        d3 = paramArrayOfDouble5[(i4 - 1 - 1 + paramInt9)];
        d5 = paramArrayOfDouble5[(i4 - 1 + paramInt9)];
        d4 = 0.5D * (d3 + d5);
        d8 = d5 - d4;
        d7 = Math.max(Math.abs(d3), Math.abs(d5));
        if ((d8 >= paramDouble1 * d7 ? 0 : 1) == 0) {}
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
          d6 = d4;
          d1 = paramArrayOfDouble1[(1 - 1 + paramInt2)] - d6;
          if ((d1 >= 0.0D ? 0 : 1) != 0) {
            j += 1;
          }
          i3 = 2;
          for (i12 = paramInt1 - 2 + 1; i12 > 0; i12--)
          {
            d1 = paramArrayOfDouble1[(i3 - 1 + paramInt2)] - d6 - paramArrayOfDouble2[(i3 - 1 - 1 + paramInt3)] / d1;
            if ((d1 >= 0.0D ? 0 : 1) != 0) {
              j += 1;
            }
            i3 += 1;
          }
          if ((j > k - 1 ? 0 : 1) != 0) {
            paramArrayOfDouble5[(i4 - 1 - 1 + paramInt9)] = d4;
          } else {
            paramArrayOfDouble5[(i4 - 1 + paramInt9)] = d4;
          }
          k = i5;
        }
        i8 += 1;
      }
      i2 += 1;
      if ((i6 <= 0 ? 0 : 1) == 0) {}
    } while (((i2 > i ? 0 : 1) != 0 ? 1 : 0) != 0);
    k = i10;
    for (int i11 = paramInt5 - i10 + 1; i11 > 0; i11--)
    {
      i4 = 2 * k;
      i1 = k - paramInt6;
      if ((paramArrayOfInt[(i4 - 1 - 1 + paramInt10)] != 0 ? 0 : 1) != 0)
      {
        paramArrayOfDouble3[(i1 - 1 + paramInt7)] = (0.5D * (paramArrayOfDouble5[(i4 - 1 - 1 + paramInt9)] + paramArrayOfDouble5[(i4 - 1 + paramInt9)]));
        paramArrayOfDouble5[(i4 - 1 + paramInt9)] -= paramArrayOfDouble3[(i1 - 1 + paramInt7)];
      }
      k += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarrj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */