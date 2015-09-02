package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlaev2
{
  public static void dlaev2(double paramDouble1, double paramDouble2, double paramDouble3, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4)
  {
    int i = 0;
    int j = 0;
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
    double d12 = 0.0D;
    d10 = paramDouble1 + paramDouble3;
    d8 = paramDouble1 - paramDouble3;
    d5 = Math.abs(d8);
    d11 = paramDouble2 + paramDouble2;
    d1 = Math.abs(d11);
    if ((Math.abs(paramDouble1) <= Math.abs(paramDouble3) ? 0 : 1) != 0)
    {
      d3 = paramDouble1;
      d2 = paramDouble3;
    }
    else
    {
      d3 = paramDouble3;
      d2 = paramDouble1;
    }
    if ((d5 <= d1 ? 0 : 1) != 0) {
      d9 = d5 * Math.sqrt(1.0D + Math.pow(d1 / d5, 2));
    } else if ((d5 >= d1 ? 0 : 1) != 0) {
      d9 = d1 * Math.sqrt(1.0D + Math.pow(d5 / d1, 2));
    } else {
      d9 = d1 * Math.sqrt(2.0D);
    }
    if ((d10 >= 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW1.val = (0.5D * (d10 - d9));
      i = -1;
      paramdoubleW2.val = (d3 / paramdoubleW1.val * d2 - paramDouble2 / paramdoubleW1.val * paramDouble2);
    }
    else if ((d10 <= 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW1.val = (0.5D * (d10 + d9));
      i = 1;
      paramdoubleW2.val = (d3 / paramdoubleW1.val * d2 - paramDouble2 / paramdoubleW1.val * paramDouble2);
    }
    else
    {
      paramdoubleW1.val = (0.5D * d9);
      paramdoubleW2.val = (-(0.5D * d9));
      i = 1;
    }
    if ((d8 < 0.0D ? 0 : 1) != 0)
    {
      d6 = d8 + d9;
      j = 1;
    }
    else
    {
      d6 = d8 - d9;
      j = -1;
    }
    d4 = Math.abs(d6);
    if ((d4 <= d1 ? 0 : 1) != 0)
    {
      d7 = -(d11 / d6);
      paramdoubleW4.val = (1.0D / Math.sqrt(1.0D + d7 * d7));
      paramdoubleW3.val = (d7 * paramdoubleW4.val);
    }
    else if ((d1 != 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW3.val = 1.0D;
      paramdoubleW4.val = 0.0D;
    }
    else
    {
      d12 = -(d6 / d11);
      paramdoubleW3.val = (1.0D / Math.sqrt(1.0D + d12 * d12));
      paramdoubleW4.val = (d12 * paramdoubleW3.val);
    }
    if ((i != j ? 0 : 1) != 0)
    {
      d12 = paramdoubleW3.val;
      paramdoubleW3.val = (-paramdoubleW4.val);
      paramdoubleW4.val = d12;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaev2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */