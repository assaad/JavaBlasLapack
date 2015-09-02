package org.netlib.lapack;

import org.netlib.util.booleanW;
import org.netlib.util.intW;

public final class Dlamc1
{
  public static boolean first = true;
  public static boolean lieee1 = false;
  public static boolean lrnd = false;
  public static int lbeta = 0;
  public static int lt = 0;
  
  public static void dlamc1(intW paramintW1, intW paramintW2, booleanW parambooleanW1, booleanW parambooleanW2)
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
    if (first)
    {
      d5 = 1;
      d1 = 1;
      for (d3 = 1; (d3 != d5 ? 0 : 1) != 0; d3 = Dlamc3.dlamc3(d3, -d1))
      {
        d1 = 2 * d1;
        d3 = Dlamc3.dlamc3(d1, d5);
      }
      d2 = 1;
      for (d3 = Dlamc3.dlamc3(d1, d2); (d3 != d1 ? 0 : 1) != 0; d3 = Dlamc3.dlamc3(d1, d2)) {
        d2 = 2 * d2;
      }
      d6 = d5 / 4;
      d7 = d3;
      d3 = Dlamc3.dlamc3(d3, -d1);
      lbeta = (int)(d3 + d6);
      d2 = lbeta;
      d4 = Dlamc3.dlamc3(d2 / 2, -(d2 / 100));
      d3 = Dlamc3.dlamc3(d4, d1);
      if ((d3 != d1 ? 0 : 1) != 0) {
        lrnd = true;
      } else {
        lrnd = false;
      }
      d4 = Dlamc3.dlamc3(d2 / 2, d2 / 100);
      d3 = Dlamc3.dlamc3(d4, d1);
      if (lrnd) {}
      if (((d3 != d1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        lrnd = false;
      }
      d8 = Dlamc3.dlamc3(d2 / 2, d1);
      d9 = Dlamc3.dlamc3(d2 / 2, d7);
      if ((d8 != d1 ? 0 : 1) != 0) {}
      if (((d9 <= d7 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
      lieee1 = lrnd;
      lt = 0;
      d1 = 1;
      for (d3 = 1; (d3 != d5 ? 0 : 1) != 0; d3 = Dlamc3.dlamc3(d3, -d1))
      {
        lt += 1;
        d1 *= lbeta;
        d3 = Dlamc3.dlamc3(d1, d5);
      }
    }
    paramintW1.val = lbeta;
    paramintW2.val = lt;
    parambooleanW1.val = lrnd;
    parambooleanW2.val = lieee1;
    first = false;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlamc1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */