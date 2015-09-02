package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlas2
{
  public static void dlas2(double paramDouble1, double paramDouble2, double paramDouble3, doubleW paramdoubleW1, doubleW paramdoubleW2)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    d5 = Math.abs(paramDouble1);
    d8 = Math.abs(paramDouble2);
    d9 = Math.abs(paramDouble3);
    d6 = Math.min(d5, d9);
    d7 = Math.max(d5, d9);
    if ((d6 != 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW1.val = 0.0D;
      if ((d7 != 0.0D ? 0 : 1) != 0) {
        paramdoubleW2.val = d8;
      } else {
        paramdoubleW2.val = (Math.max(d7, d8) * Math.sqrt(1.0D + Math.pow(Math.min(d7, d8) / Math.max(d7, d8), 2)));
      }
    }
    else if ((d8 >= d7 ? 0 : 1) != 0)
    {
      d1 = 1.0D + d6 / d7;
      d2 = (d7 - d6) / d7;
      d3 = Math.pow(d8 / d7, 2);
      d4 = 2.0D / (Math.sqrt(d1 * d1 + d3) + Math.sqrt(d2 * d2 + d3));
      paramdoubleW1.val = (d6 * d4);
      paramdoubleW2.val = (d7 / d4);
    }
    else
    {
      d3 = d7 / d8;
      if ((d3 != 0.0D ? 0 : 1) != 0)
      {
        paramdoubleW1.val = (d6 * d7 / d8);
        paramdoubleW2.val = d8;
      }
      else
      {
        d1 = 1.0D + d6 / d7;
        d2 = (d7 - d6) / d7;
        d4 = 1.0D / (Math.sqrt(1.0D + Math.pow(d1 * d3, 2)) + Math.sqrt(1.0D + Math.pow(d2 * d3, 2)));
        paramdoubleW1.val = (d6 * d4 * d3);
        paramdoubleW1.val += paramdoubleW1.val;
        paramdoubleW2.val = (d8 / (d4 + d4));
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlas2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */