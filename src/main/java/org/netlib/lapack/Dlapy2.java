package org.netlib.lapack;

public final class Dlapy2
{
  public static double dlapy2(double paramDouble1, double paramDouble2)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    d2 = Math.abs(paramDouble1);
    d3 = Math.abs(paramDouble2);
    d1 = Math.max(d2, d3);
    d4 = Math.min(d2, d3);
    if ((d4 != 0.0D ? 0 : 1) != 0) {
      d5 = d1;
    } else {
      d5 = d1 * Math.sqrt(1.0D + Math.pow(d4 / d1, 2));
    }
    return d5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlapy2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */