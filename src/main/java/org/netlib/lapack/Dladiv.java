package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dladiv
{
  public static void dladiv(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, doubleW paramdoubleW1, doubleW paramdoubleW2)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    if ((Math.abs(paramDouble4) >= Math.abs(paramDouble3) ? 0 : 1) != 0)
    {
      d1 = paramDouble4 / paramDouble3;
      d2 = paramDouble3 + paramDouble4 * d1;
      paramdoubleW1.val = ((paramDouble1 + paramDouble2 * d1) / d2);
      paramdoubleW2.val = ((paramDouble2 - paramDouble1 * d1) / d2);
    }
    else
    {
      d1 = paramDouble3 / paramDouble4;
      d2 = paramDouble4 + paramDouble3 * d1;
      paramdoubleW1.val = ((paramDouble2 + paramDouble1 * d1) / d2);
      paramdoubleW2.val = ((-paramDouble1 + paramDouble2 * d1) / d2);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dladiv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */