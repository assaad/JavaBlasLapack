package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlasq5
{
  public static void dlasq5(int paramInt1, int paramInt2, double[] paramArrayOfDouble, int paramInt3, int paramInt4, double paramDouble, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, doubleW paramdoubleW5, doubleW paramdoubleW6, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    if ((paramInt2 - paramInt1 - 1 > 0 ? 0 : 1) != 0) {
      return;
    }
    i = 4 * paramInt1 + paramInt4 - 3;
    d2 = paramArrayOfDouble[(i + 4 - 1 + paramInt3)];
    d1 = paramArrayOfDouble[(i - 1 + paramInt3)] - paramDouble;
    paramdoubleW1.val = d1;
    paramdoubleW2.val = (-paramArrayOfDouble[(i - 1 + paramInt3)]);
    int k;
    if (paramBoolean)
    {
      if ((paramInt4 != 0 ? 0 : 1) != 0)
      {
        i = 4 * paramInt1;
        for (k = (4 * (paramInt2 - 3) - 4 * paramInt1 + 4) / 4; k > 0; k--)
        {
          paramArrayOfDouble[(i - 2 - 1 + paramInt3)] = (d1 + paramArrayOfDouble[(i - 1 - 1 + paramInt3)]);
          d3 = paramArrayOfDouble[(i + 1 - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)];
          d1 = d1 * d3 - paramDouble;
          paramdoubleW1.val = Math.min(paramdoubleW1.val, d1);
          paramArrayOfDouble[(i - 1 + paramInt3)] = (paramArrayOfDouble[(i - 1 - 1 + paramInt3)] * d3);
          d2 = Math.min(paramArrayOfDouble[(i - 1 + paramInt3)], d2);
          i += 4;
        }
      }
      else
      {
        i = 4 * paramInt1;
        for (k = (4 * (paramInt2 - 3) - 4 * paramInt1 + 4) / 4; k > 0; k--)
        {
          paramArrayOfDouble[(i - 3 - 1 + paramInt3)] = (d1 + paramArrayOfDouble[(i - 1 + paramInt3)]);
          d3 = paramArrayOfDouble[(i + 2 - 1 + paramInt3)] / paramArrayOfDouble[(i - 3 - 1 + paramInt3)];
          d1 = d1 * d3 - paramDouble;
          paramdoubleW1.val = Math.min(paramdoubleW1.val, d1);
          paramArrayOfDouble[(i - 1 - 1 + paramInt3)] = (paramArrayOfDouble[(i - 1 + paramInt3)] * d3);
          d2 = Math.min(paramArrayOfDouble[(i - 1 - 1 + paramInt3)], d2);
          i += 4;
        }
      }
      paramdoubleW6.val = d1;
      paramdoubleW3.val = paramdoubleW1.val;
      i = 4 * (paramInt2 - 2) - paramInt4;
      j = i + 2 * paramInt4 - 1;
      paramArrayOfDouble[(i - 2 - 1 + paramInt3)] = (paramdoubleW6.val + paramArrayOfDouble[(j - 1 + paramInt3)]);
      paramArrayOfDouble[(i - 1 + paramInt3)] = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramArrayOfDouble[(j - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]));
      paramdoubleW5.val = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramdoubleW6.val / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]) - paramDouble);
      paramdoubleW1.val = Math.min(paramdoubleW1.val, paramdoubleW5.val);
      paramdoubleW2.val = paramdoubleW1.val;
      i += 4;
      j = i + 2 * paramInt4 - 1;
      paramArrayOfDouble[(i - 2 - 1 + paramInt3)] = (paramdoubleW5.val + paramArrayOfDouble[(j - 1 + paramInt3)]);
      paramArrayOfDouble[(i - 1 + paramInt3)] = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramArrayOfDouble[(j - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]));
      paramdoubleW4.val = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramdoubleW5.val / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]) - paramDouble);
      paramdoubleW1.val = Math.min(paramdoubleW1.val, paramdoubleW4.val);
    }
    else
    {
      if ((paramInt4 != 0 ? 0 : 1) != 0)
      {
        i = 4 * paramInt1;
        for (k = (4 * (paramInt2 - 3) - 4 * paramInt1 + 4) / 4; k > 0; k--)
        {
          paramArrayOfDouble[(i - 2 - 1 + paramInt3)] = (d1 + paramArrayOfDouble[(i - 1 - 1 + paramInt3)]);
          if ((d1 >= 0.0D ? 0 : 1) != 0) {
            return;
          }
          paramArrayOfDouble[(i - 1 + paramInt3)] = (paramArrayOfDouble[(i + 1 - 1 + paramInt3)] * (paramArrayOfDouble[(i - 1 - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]));
          d1 = paramArrayOfDouble[(i + 1 - 1 + paramInt3)] * (d1 / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]) - paramDouble;
          paramdoubleW1.val = Math.min(paramdoubleW1.val, d1);
          d2 = Math.min(d2, paramArrayOfDouble[(i - 1 + paramInt3)]);
          i += 4;
        }
      }
      else
      {
        i = 4 * paramInt1;
        for (k = (4 * (paramInt2 - 3) - 4 * paramInt1 + 4) / 4; k > 0; k--)
        {
          paramArrayOfDouble[(i - 3 - 1 + paramInt3)] = (d1 + paramArrayOfDouble[(i - 1 + paramInt3)]);
          if ((d1 >= 0.0D ? 0 : 1) != 0) {
            return;
          }
          paramArrayOfDouble[(i - 1 - 1 + paramInt3)] = (paramArrayOfDouble[(i + 2 - 1 + paramInt3)] * (paramArrayOfDouble[(i - 1 + paramInt3)] / paramArrayOfDouble[(i - 3 - 1 + paramInt3)]));
          d1 = paramArrayOfDouble[(i + 2 - 1 + paramInt3)] * (d1 / paramArrayOfDouble[(i - 3 - 1 + paramInt3)]) - paramDouble;
          paramdoubleW1.val = Math.min(paramdoubleW1.val, d1);
          d2 = Math.min(d2, paramArrayOfDouble[(i - 1 - 1 + paramInt3)]);
          i += 4;
        }
      }
      paramdoubleW6.val = d1;
      paramdoubleW3.val = paramdoubleW1.val;
      i = 4 * (paramInt2 - 2) - paramInt4;
      j = i + 2 * paramInt4 - 1;
      paramArrayOfDouble[(i - 2 - 1 + paramInt3)] = (paramdoubleW6.val + paramArrayOfDouble[(j - 1 + paramInt3)]);
      if ((paramdoubleW6.val >= 0.0D ? 0 : 1) != 0) {
        return;
      }
      paramArrayOfDouble[(i - 1 + paramInt3)] = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramArrayOfDouble[(j - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]));
      paramdoubleW5.val = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramdoubleW6.val / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]) - paramDouble);
      paramdoubleW1.val = Math.min(paramdoubleW1.val, paramdoubleW5.val);
      paramdoubleW2.val = paramdoubleW1.val;
      i += 4;
      j = i + 2 * paramInt4 - 1;
      paramArrayOfDouble[(i - 2 - 1 + paramInt3)] = (paramdoubleW5.val + paramArrayOfDouble[(j - 1 + paramInt3)]);
      if ((paramdoubleW5.val >= 0.0D ? 0 : 1) != 0) {
        return;
      }
      paramArrayOfDouble[(i - 1 + paramInt3)] = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramArrayOfDouble[(j - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]));
      paramdoubleW4.val = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramdoubleW5.val / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]) - paramDouble);
      paramdoubleW1.val = Math.min(paramdoubleW1.val, paramdoubleW4.val);
    }
    paramArrayOfDouble[(i + 2 - 1 + paramInt3)] = paramdoubleW4.val;
    paramArrayOfDouble[(4 * paramInt2 - paramInt4 - 1 + paramInt3)] = d2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasq5.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */