package org.netlib.lapack;

import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlazq4
{
  public static void dlazq4(int paramInt1, int paramInt2, double[] paramArrayOfDouble, int paramInt3, int paramInt4, int paramInt5, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, doubleW paramdoubleW1, intW paramintW, doubleW paramdoubleW2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    if ((paramDouble1 > 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW1.val = (-paramDouble1);
      paramintW.val = -1;
      return;
    }
    j = 4 * paramInt2 + paramInt4;
    int m;
    if ((paramInt5 != paramInt2 ? 0 : 1) != 0)
    {
      if ((paramDouble1 != paramDouble4 ? 0 : 1) == 0) {}
      if (((paramDouble1 != paramDouble5 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        d2 = Math.sqrt(paramArrayOfDouble[(j - 3 - 1 + paramInt3)]) * Math.sqrt(paramArrayOfDouble[(j - 5 - 1 + paramInt3)]);
        d3 = Math.sqrt(paramArrayOfDouble[(j - 7 - 1 + paramInt3)]) * Math.sqrt(paramArrayOfDouble[(j - 9 - 1 + paramInt3)]);
        d1 = paramArrayOfDouble[(j - 7 - 1 + paramInt3)] + paramArrayOfDouble[(j - 5 - 1 + paramInt3)];
        if ((paramDouble1 != paramDouble4 ? 0 : 1) != 0) {}
        if (((paramDouble2 != paramDouble5 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          d6 = paramDouble3 - d1 - paramDouble3 * 0.25D;
          if ((d6 <= 0.0D ? 0 : 1) != 0) {}
          if (((d6 <= d3 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            d5 = d1 - paramDouble4 - d3 / d6 * d3;
          } else {
            d5 = d1 - paramDouble4 - (d2 + d3);
          }
          if ((d5 <= 0.0D ? 0 : 1) != 0) {}
          if (((d5 <= d2 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            d7 = Math.max(paramDouble4 - d2 / d5 * d2, 0.5D * paramDouble1);
            paramintW.val = -2;
          }
          else
          {
            d7 = 0.0D;
            if ((paramDouble4 <= d2 ? 0 : 1) != 0) {
              d7 = paramDouble4 - d2;
            }
            if ((d1 <= d2 + d3 ? 0 : 1) != 0) {
              d7 = Math.min(d7, d1 - (d2 + d3));
            }
            d7 = Math.max(d7, 0.333D * paramDouble1);
            paramintW.val = -3;
          }
        }
        else
        {
          paramintW.val = -4;
          d7 = 0.25D * paramDouble1;
          if ((paramDouble1 != paramDouble4 ? 0 : 1) != 0)
          {
            d4 = paramDouble4;
            d1 = 0.0D;
            if ((paramArrayOfDouble[(j - 5 - 1 + paramInt3)] <= paramArrayOfDouble[(j - 7 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            d3 = paramArrayOfDouble[(j - 5 - 1 + paramInt3)] / paramArrayOfDouble[(j - 7 - 1 + paramInt3)];
            k = j - 9;
          }
          else
          {
            k = j - 2 * paramInt4;
            d3 = paramArrayOfDouble[(k - 2 - 1 + paramInt3)];
            d4 = paramDouble5;
            if ((paramArrayOfDouble[(k - 4 - 1 + paramInt3)] <= paramArrayOfDouble[(k - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            d1 = paramArrayOfDouble[(k - 4 - 1 + paramInt3)] / paramArrayOfDouble[(k - 2 - 1 + paramInt3)];
            if ((paramArrayOfDouble[(j - 9 - 1 + paramInt3)] <= paramArrayOfDouble[(j - 11 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            d3 = paramArrayOfDouble[(j - 9 - 1 + paramInt3)] / paramArrayOfDouble[(j - 11 - 1 + paramInt3)];
            k = j - 13;
          }
          d1 += d3;
          i = k;
          for (m = (4 * paramInt1 - 1 + paramInt4 - k + -4) / -4; m > 0; m--)
          {
            if ((d3 != 0.0D ? 0 : 1) != 0) {
              break;
            }
            d2 = d3;
            if ((paramArrayOfDouble[(i - 1 + paramInt3)] <= paramArrayOfDouble[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            d3 *= paramArrayOfDouble[(i - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)];
            d1 += d3;
            if ((100.0D * Math.max(d3, d2) >= d1 ? 0 : 1) == 0) {}
            if (((0.563D >= d1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
              break;
            }
            i += -4;
          }
          d1 = 1.05D * d1;
          if ((d1 >= 0.563D ? 0 : 1) != 0) {
            d7 = d4 * (1.0D - Math.sqrt(d1)) / (1.0D + d1);
          }
        }
      }
      else if ((paramDouble1 != paramDouble6 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
        d7 = 0.25D * paramDouble1;
        k = j - 2 * paramInt4;
        d2 = paramArrayOfDouble[(k - 2 - 1 + paramInt3)];
        d3 = paramArrayOfDouble[(k - 6 - 1 + paramInt3)];
        d4 = paramDouble6;
        if ((paramArrayOfDouble[(k - 8 - 1 + paramInt3)] <= d3 ? 0 : 1) == 0) {}
        if (((paramArrayOfDouble[(k - 4 - 1 + paramInt3)] <= d2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          return;
        }
        d1 = paramArrayOfDouble[(k - 8 - 1 + paramInt3)] / d3 * (1.0D + paramArrayOfDouble[(k - 4 - 1 + paramInt3)] / d2);
        if ((paramInt2 - paramInt1 <= 2 ? 0 : 1) != 0)
        {
          d3 = paramArrayOfDouble[(j - 13 - 1 + paramInt3)] / paramArrayOfDouble[(j - 15 - 1 + paramInt3)];
          d1 += d3;
          i = j - 17;
          for (m = (4 * paramInt1 - 1 + paramInt4 - (j - 17) + -4) / -4; m > 0; m--)
          {
            if ((d3 != 0.0D ? 0 : 1) != 0) {
              break;
            }
            d2 = d3;
            if ((paramArrayOfDouble[(i - 1 + paramInt3)] <= paramArrayOfDouble[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            d3 *= paramArrayOfDouble[(i - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)];
            d1 += d3;
            if ((100.0D * Math.max(d3, d2) >= d1 ? 0 : 1) == 0) {}
            if (((0.563D >= d1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
              break;
            }
            i += -4;
          }
          d1 = 1.05D * d1;
        }
        if ((d1 >= 0.563D ? 0 : 1) != 0) {
          d7 = d4 * (1.0D - Math.sqrt(d1)) / (1.0D + d1);
        }
      }
      else
      {
        if ((paramintW.val != -6 ? 0 : 1) != 0) {
          paramdoubleW2.val += 0.333D * (1.0D - paramdoubleW2.val);
        } else if ((paramintW.val != -18 ? 0 : 1) != 0) {
          paramdoubleW2.val = (0.25D * 0.333D);
        } else {
          paramdoubleW2.val = 0.25D;
        }
        d7 = paramdoubleW2.val * paramDouble1;
        paramintW.val = -6;
      }
    }
    else if ((paramInt5 != paramInt2 + 1 ? 0 : 1) != 0)
    {
      if ((paramDouble2 != paramDouble5 ? 0 : 1) != 0) {}
      if (((paramDouble3 != paramDouble6 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -7;
        d7 = 0.333D * paramDouble2;
        if ((paramArrayOfDouble[(j - 5 - 1 + paramInt3)] <= paramArrayOfDouble[(j - 7 - 1 + paramInt3)] ? 0 : 1) != 0) {
          return;
        }
        d2 = paramArrayOfDouble[(j - 5 - 1 + paramInt3)] / paramArrayOfDouble[(j - 7 - 1 + paramInt3)];
        d3 = d2;
        if ((d3 != 0.0D ? 0 : 1) == 0)
        {
          i = 4 * paramInt2 - 9 + paramInt4;
          for (m = (4 * paramInt1 - 1 + paramInt4 - (4 * paramInt2 - 9 + paramInt4) + -4) / -4; m > 0; m--)
          {
            d1 = d2;
            if ((paramArrayOfDouble[(i - 1 + paramInt3)] <= paramArrayOfDouble[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            d2 *= paramArrayOfDouble[(i - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)];
            d3 += d2;
            if ((100.0D * Math.max(d2, d1) >= d3 ? 0 : 1) != 0) {
              break;
            }
            i += -4;
          }
        }
        d3 = Math.sqrt(1.05D * d3);
        d1 = paramDouble2 / (1.0D + Math.pow(d3, 2));
        d6 = 0.5D * paramDouble3 - d1;
        if ((d6 <= 0.0D ? 0 : 1) != 0) {}
        if (((d6 <= d3 * d1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          d7 = Math.max(d7, d1 * (1.0D - 1.01D * d1 * (d3 / d6) * d3));
        }
        else
        {
          d7 = Math.max(d7, d1 * (1.0D - 1.01D * d3));
          paramintW.val = -8;
        }
      }
      else
      {
        d7 = 0.25D * paramDouble2;
        if ((paramDouble2 != paramDouble5 ? 0 : 1) != 0) {
          d7 = 0.5D * paramDouble2;
        }
        paramintW.val = -9;
      }
    }
    else if ((paramInt5 != paramInt2 + 2 ? 0 : 1) != 0)
    {
      if ((paramDouble3 != paramDouble6 ? 0 : 1) != 0) {}
      if (((2.0D * paramArrayOfDouble[(j - 5 - 1 + paramInt3)] >= paramArrayOfDouble[(j - 7 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -10;
        d7 = 0.333D * paramDouble3;
        if ((paramArrayOfDouble[(j - 5 - 1 + paramInt3)] <= paramArrayOfDouble[(j - 7 - 1 + paramInt3)] ? 0 : 1) != 0) {
          return;
        }
        d2 = paramArrayOfDouble[(j - 5 - 1 + paramInt3)] / paramArrayOfDouble[(j - 7 - 1 + paramInt3)];
        d3 = d2;
        if ((d3 != 0.0D ? 0 : 1) == 0)
        {
          i = 4 * paramInt2 - 9 + paramInt4;
          for (m = (4 * paramInt1 - 1 + paramInt4 - (4 * paramInt2 - 9 + paramInt4) + -4) / -4; m > 0; m--)
          {
            if ((paramArrayOfDouble[(i - 1 + paramInt3)] <= paramArrayOfDouble[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {
              return;
            }
            d2 *= paramArrayOfDouble[(i - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)];
            d3 += d2;
            if ((100.0D * d2 >= d3 ? 0 : 1) != 0) {
              break;
            }
            i += -4;
          }
        }
        d3 = Math.sqrt(1.05D * d3);
        d1 = paramDouble3 / (1.0D + Math.pow(d3, 2));
        d6 = paramArrayOfDouble[(j - 7 - 1 + paramInt3)] + paramArrayOfDouble[(j - 9 - 1 + paramInt3)] - Math.sqrt(paramArrayOfDouble[(j - 11 - 1 + paramInt3)]) * Math.sqrt(paramArrayOfDouble[(j - 9 - 1 + paramInt3)]) - d1;
        if ((d6 <= 0.0D ? 0 : 1) != 0) {}
        if (((d6 <= d3 * d1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          d7 = Math.max(d7, d1 * (1.0D - 1.01D * d1 * (d3 / d6) * d3));
        } else {
          d7 = Math.max(d7, d1 * (1.0D - 1.01D * d3));
        }
      }
      else
      {
        d7 = 0.25D * paramDouble3;
        paramintW.val = -11;
      }
    }
    else if ((paramInt5 <= paramInt2 + 2 ? 0 : 1) != 0)
    {
      d7 = 0.0D;
      paramintW.val = -12;
    }
    paramdoubleW1.val = d7;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlazq4.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */