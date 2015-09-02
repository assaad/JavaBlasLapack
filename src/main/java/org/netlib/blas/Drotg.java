package org.netlib.blas;

import org.netlib.util.Util;
import org.netlib.util.doubleW;

public final class Drotg
{
  public static void drotg(doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    d2 = paramdoubleW2.val;
    if ((Math.abs(paramdoubleW1.val) <= Math.abs(paramdoubleW2.val) ? 0 : 1) != 0) {
      d2 = paramdoubleW1.val;
    }
    d3 = Math.abs(paramdoubleW1.val) + Math.abs(paramdoubleW2.val);
    if ((d3 == 0.0D ? 0 : 1) == 0)
    {
      paramdoubleW3.val = 1.0D;
      paramdoubleW4.val = 0.0D;
      d1 = 0.0D;
      d4 = 0.0D;
    }
    else
    {
      d1 = d3 * Math.sqrt(Math.pow(paramdoubleW1.val / d3, 2) + Math.pow(paramdoubleW2.val / d3, 2));
      d1 = Util.dsign(1.0D, d2) * d1;
      paramdoubleW1.val /= d1;
      paramdoubleW2.val /= d1;
      d4 = 1.0D;
      if ((Math.abs(paramdoubleW1.val) <= Math.abs(paramdoubleW2.val) ? 0 : 1) != 0) {
        d4 = paramdoubleW4.val;
      }
      if ((Math.abs(paramdoubleW2.val) < Math.abs(paramdoubleW1.val) ? 0 : 1) != 0) {}
      if (((paramdoubleW3.val == 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
        d4 = 1.0D / paramdoubleW3.val;
      }
    }
    paramdoubleW1.val = d1;
    paramdoubleW2.val = d4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Drotg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */