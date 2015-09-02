package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlae2
{
  public static void dlae2(double paramDouble1, double paramDouble2, double paramDouble3, doubleW paramdoubleW1, doubleW paramdoubleW2)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    d7 = paramDouble1 + paramDouble3;
    d5 = paramDouble1 - paramDouble3;
    d4 = Math.abs(d5);
    d8 = paramDouble2 + paramDouble2;
    d1 = Math.abs(d8);
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
    if ((d4 <= d1 ? 0 : 1) != 0) {
      d6 = d4 * Math.sqrt(1.0D + Math.pow(d1 / d4, 2));
    } else if ((d4 >= d1 ? 0 : 1) != 0) {
      d6 = d1 * Math.sqrt(1.0D + Math.pow(d4 / d1, 2));
    } else {
      d6 = d1 * Math.sqrt(2.0D);
    }
    if ((d7 >= 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW1.val = (0.5D * (d7 - d6));
      paramdoubleW2.val = (d3 / paramdoubleW1.val * d2 - paramDouble2 / paramdoubleW1.val * paramDouble2);
    }
    else if ((d7 <= 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW1.val = (0.5D * (d7 + d6));
      paramdoubleW2.val = (d3 / paramdoubleW1.val * d2 - paramDouble2 / paramdoubleW1.val * paramDouble2);
    }
    else
    {
      paramdoubleW1.val = (0.5D * d6);
      paramdoubleW2.val = (-(0.5D * d6));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlae2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */