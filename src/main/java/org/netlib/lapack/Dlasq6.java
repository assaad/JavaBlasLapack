package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlasq6
{
  public static void dlasq6(int paramInt1, int paramInt2, double[] paramArrayOfDouble, int paramInt3, int paramInt4, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, doubleW paramdoubleW5, doubleW paramdoubleW6)
  {
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    if ((paramInt2 - paramInt1 - 1 > 0 ? 0 : 1) != 0) {
      return;
    }
    d3 = Dlamch.dlamch("Safe minimum");
    i = 4 * paramInt1 + paramInt4 - 3;
    d2 = paramArrayOfDouble[(i + 4 - 1 + paramInt3)];
    d1 = paramArrayOfDouble[(i - 1 + paramInt3)];
    paramdoubleW1.val = d1;
    int k;
    if ((paramInt4 != 0 ? 0 : 1) != 0)
    {
      i = 4 * paramInt1;
      for (k = (4 * (paramInt2 - 3) - 4 * paramInt1 + 4) / 4; k > 0; k--)
      {
        paramArrayOfDouble[(i - 2 - 1 + paramInt3)] = (d1 + paramArrayOfDouble[(i - 1 - 1 + paramInt3)]);
        if ((paramArrayOfDouble[(i - 2 - 1 + paramInt3)] != 0.0D ? 0 : 1) != 0)
        {
          paramArrayOfDouble[(i - 1 + paramInt3)] = 0.0D;
          d1 = paramArrayOfDouble[(i + 1 - 1 + paramInt3)];
          paramdoubleW1.val = d1;
          d2 = 0.0D;
        }
        else
        {
          if ((d3 * paramArrayOfDouble[(i + 1 - 1 + paramInt3)] >= paramArrayOfDouble[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {}
          if (((d3 * paramArrayOfDouble[(i - 2 - 1 + paramInt3)] >= paramArrayOfDouble[(i + 1 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            d4 = paramArrayOfDouble[(i + 1 - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)];
            paramArrayOfDouble[(i - 1 + paramInt3)] = (paramArrayOfDouble[(i - 1 - 1 + paramInt3)] * d4);
            d1 *= d4;
          }
          else
          {
            paramArrayOfDouble[(i - 1 + paramInt3)] = (paramArrayOfDouble[(i + 1 - 1 + paramInt3)] * (paramArrayOfDouble[(i - 1 - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]));
            d1 = paramArrayOfDouble[(i + 1 - 1 + paramInt3)] * (d1 / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]);
          }
        }
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
        if ((paramArrayOfDouble[(i - 3 - 1 + paramInt3)] != 0.0D ? 0 : 1) != 0)
        {
          paramArrayOfDouble[(i - 1 - 1 + paramInt3)] = 0.0D;
          d1 = paramArrayOfDouble[(i + 2 - 1 + paramInt3)];
          paramdoubleW1.val = d1;
          d2 = 0.0D;
        }
        else
        {
          if ((d3 * paramArrayOfDouble[(i + 2 - 1 + paramInt3)] >= paramArrayOfDouble[(i - 3 - 1 + paramInt3)] ? 0 : 1) != 0) {}
          if (((d3 * paramArrayOfDouble[(i - 3 - 1 + paramInt3)] >= paramArrayOfDouble[(i + 2 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            d4 = paramArrayOfDouble[(i + 2 - 1 + paramInt3)] / paramArrayOfDouble[(i - 3 - 1 + paramInt3)];
            paramArrayOfDouble[(i - 1 - 1 + paramInt3)] = (paramArrayOfDouble[(i - 1 + paramInt3)] * d4);
            d1 *= d4;
          }
          else
          {
            paramArrayOfDouble[(i - 1 - 1 + paramInt3)] = (paramArrayOfDouble[(i + 2 - 1 + paramInt3)] * (paramArrayOfDouble[(i - 1 + paramInt3)] / paramArrayOfDouble[(i - 3 - 1 + paramInt3)]));
            d1 = paramArrayOfDouble[(i + 2 - 1 + paramInt3)] * (d1 / paramArrayOfDouble[(i - 3 - 1 + paramInt3)]);
          }
        }
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
    if ((paramArrayOfDouble[(i - 2 - 1 + paramInt3)] != 0.0D ? 0 : 1) != 0)
    {
      paramArrayOfDouble[(i - 1 + paramInt3)] = 0.0D;
      paramdoubleW5.val = paramArrayOfDouble[(j + 2 - 1 + paramInt3)];
      paramdoubleW1.val = paramdoubleW5.val;
      d2 = 0.0D;
    }
    else
    {
      if ((d3 * paramArrayOfDouble[(j + 2 - 1 + paramInt3)] >= paramArrayOfDouble[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {}
      if (((d3 * paramArrayOfDouble[(i - 2 - 1 + paramInt3)] >= paramArrayOfDouble[(j + 2 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        d4 = paramArrayOfDouble[(j + 2 - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)];
        paramArrayOfDouble[(j - 1 + paramInt3)] *= d4;
        paramdoubleW6.val *= d4;
      }
      else
      {
        paramArrayOfDouble[(i - 1 + paramInt3)] = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramArrayOfDouble[(j - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]));
        paramdoubleW5.val = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramdoubleW6.val / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]));
      }
    }
    paramdoubleW1.val = Math.min(paramdoubleW1.val, paramdoubleW5.val);
    paramdoubleW2.val = paramdoubleW1.val;
    i += 4;
    j = i + 2 * paramInt4 - 1;
    paramArrayOfDouble[(i - 2 - 1 + paramInt3)] = (paramdoubleW5.val + paramArrayOfDouble[(j - 1 + paramInt3)]);
    if ((paramArrayOfDouble[(i - 2 - 1 + paramInt3)] != 0.0D ? 0 : 1) != 0)
    {
      paramArrayOfDouble[(i - 1 + paramInt3)] = 0.0D;
      paramdoubleW4.val = paramArrayOfDouble[(j + 2 - 1 + paramInt3)];
      paramdoubleW1.val = paramdoubleW4.val;
      d2 = 0.0D;
    }
    else
    {
      if ((d3 * paramArrayOfDouble[(j + 2 - 1 + paramInt3)] >= paramArrayOfDouble[(i - 2 - 1 + paramInt3)] ? 0 : 1) != 0) {}
      if (((d3 * paramArrayOfDouble[(i - 2 - 1 + paramInt3)] >= paramArrayOfDouble[(j + 2 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        d4 = paramArrayOfDouble[(j + 2 - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)];
        paramArrayOfDouble[(j - 1 + paramInt3)] *= d4;
        paramdoubleW5.val *= d4;
      }
      else
      {
        paramArrayOfDouble[(i - 1 + paramInt3)] = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramArrayOfDouble[(j - 1 + paramInt3)] / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]));
        paramdoubleW4.val = (paramArrayOfDouble[(j + 2 - 1 + paramInt3)] * (paramdoubleW5.val / paramArrayOfDouble[(i - 2 - 1 + paramInt3)]));
      }
    }
    paramdoubleW1.val = Math.min(paramdoubleW1.val, paramdoubleW4.val);
    paramArrayOfDouble[(i + 2 - 1 + paramInt3)] = paramdoubleW4.val;
    paramArrayOfDouble[(4 * paramInt2 - paramInt4 - 1 + paramInt3)] = d2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasq6.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */