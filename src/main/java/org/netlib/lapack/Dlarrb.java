package org.netlib.lapack;

import org.netlib.util.intW;

public final class Dlarrb
{
  public static void dlarrb(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, int paramInt5, double paramDouble1, double paramDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, double[] paramArrayOfDouble5, int paramInt9, double[] paramArrayOfDouble6, int paramInt10, int[] paramArrayOfInt, int paramInt11, double paramDouble3, double paramDouble4, int paramInt12, intW paramintW)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    paramintW.val = 0;
    i = (int)((Math.log(paramDouble4 + paramDouble3) - Math.log(paramDouble3)) / Math.log(2.0D)) + 2;
    d7 = 2.0D * paramDouble3;
    i8 = paramInt12;
    if ((i8 >= 1 ? 0 : 1) == 0) {}
    if (((i8 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      i8 = paramInt1;
    }
    k = paramInt4;
    i5 = 0;
    i7 = 0;
    d8 = paramArrayOfDouble4[(k - paramInt6 - 1 + paramInt8)];
    j = k;
    for (int i9 = paramInt5 - k + 1; i9 > 0; i9--)
    {
      i2 = 2 * j;
      m = j - paramInt6;
      d4 = paramArrayOfDouble3[(m - 1 + paramInt7)] - paramArrayOfDouble5[(m - 1 + paramInt9)];
      d9 = paramArrayOfDouble3[(m - 1 + paramInt7)] + paramArrayOfDouble5[(m - 1 + paramInt9)];
      d5 = d8;
      d8 = paramArrayOfDouble4[(m - 1 + paramInt8)];
      d3 = Math.min(d5, d8);
      for (d1 = paramArrayOfDouble5[(m - 1 + paramInt9)];; d1 = 2.0D * d1)
      {
        i3 = Dlaneg.dlaneg(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, d4, paramDouble3, i8);
        if ((i3 <= j - 1 ? 0 : 1) == 0) {
          break;
        }
        d4 -= d1;
      }
      for (d1 = paramArrayOfDouble5[(m - 1 + paramInt9)];; d1 = 2.0D * d1)
      {
        i3 = Dlaneg.dlaneg(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, d9, paramDouble3, i8);
        if ((i3 >= j ? 0 : 1) == 0) {
          break;
        }
        d9 += d1;
      }
      d11 = 0.5D * Math.abs(d4 - d9);
      d10 = Math.max(Math.abs(d4), Math.abs(d9));
      d2 = Math.max(paramDouble1 * d3, paramDouble2 * d10);
      if ((d11 > d2 ? 0 : 1) == 0) {}
      if (((d11 > d7 ? 0 : 1) == 0 ? 0 : 1) != 0)
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
      paramArrayOfDouble6[(i2 - 1 - 1 + paramInt10)] = d4;
      paramArrayOfDouble6[(i2 - 1 + paramInt10)] = d9;
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
        d8 = paramArrayOfDouble4[(m - 1 + paramInt8)];
        d5 = d8;
        if ((m <= 1 ? 0 : 1) != 0) {
          d5 = paramArrayOfDouble4[(m - 1 - 1 + paramInt8)];
        }
        d3 = Math.min(d5, d8);
        i4 = paramArrayOfInt[(i2 - 1 - 1 + paramInt11)];
        d4 = paramArrayOfDouble6[(i2 - 1 - 1 + paramInt10)];
        d9 = paramArrayOfDouble6[(i2 - 1 + paramInt10)];
        d6 = 0.5D * (d4 + d9);
        d11 = d9 - d6;
        d10 = Math.max(Math.abs(d4), Math.abs(d9));
        d2 = Math.max(paramDouble1 * d3, paramDouble2 * d10);
        if ((d11 > d2 ? 0 : 1) == 0) {}
        if (((d11 > d7 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
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
          i3 = Dlaneg.dlaneg(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, d6, paramDouble3, i8);
          if ((i3 > j - 1 ? 0 : 1) != 0) {
            paramArrayOfDouble6[(i2 - 1 - 1 + paramInt10)] = d6;
          } else {
            paramArrayOfDouble6[(i2 - 1 + paramInt10)] = d6;
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
        paramArrayOfDouble3[(m - 1 + paramInt7)] = (0.5D * (paramArrayOfDouble6[(i2 - 1 - 1 + paramInt10)] + paramArrayOfDouble6[(i2 - 1 + paramInt10)]));
        paramArrayOfDouble6[(i2 - 1 + paramInt10)] -= paramArrayOfDouble3[(m - 1 + paramInt7)];
      }
      j += 1;
    }
    j = paramInt4 + 1;
    for (i9 = paramInt5 - (paramInt4 + 1) + 1; i9 > 0; i9--)
    {
      i2 = 2 * j;
      m = j - paramInt6;
      paramArrayOfDouble4[(m - 1 - 1 + paramInt8)] = Math.max(0.0D, paramArrayOfDouble3[(m - 1 + paramInt7)] - paramArrayOfDouble5[(m - 1 + paramInt9)] - paramArrayOfDouble3[(m - 1 - 1 + paramInt7)] - paramArrayOfDouble5[(m - 1 - 1 + paramInt9)]);
      j += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarrb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */