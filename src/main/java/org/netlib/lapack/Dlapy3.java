package org.netlib.lapack;

import org.netlib.util.Util;

public final class Dlapy3
{
  public static double dlapy3(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    d2 = Math.abs(paramDouble1);
    d3 = Math.abs(paramDouble2);
    d4 = Math.abs(paramDouble3);
    d1 = Util.max(d2, d3, d4);
    if ((d1 != 0.0D ? 0 : 1) != 0) {
      d5 = d2 + d3 + d4;
    } else {
      d5 = d1 * Math.sqrt(Math.pow(d2 / d1, 2) + Math.pow(d3 / d1, 2) + Math.pow(d4 / d1, 2));
    }
    return d5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlapy3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */