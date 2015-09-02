package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.doubleW;

public final class Dlasv2
{
  public static void dlasv2(double paramDouble1, double paramDouble2, double paramDouble3, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, doubleW paramdoubleW5, doubleW paramdoubleW6)
  {
    int i = 0;
    int j = 0;
    int k = 0;
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
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    double d19 = 0.0D;
    double d20 = 0.0D;
    double d21 = 0.0D;
    d6 = paramDouble1;
    d5 = Math.abs(d6);
    d10 = paramDouble3;
    d9 = Math.abs(paramDouble3);
    k = 1;
    j = d9 <= d5 ? 0 : 1;
    if (j != 0)
    {
      k = 3;
      d19 = d6;
      d6 = d10;
      d10 = d19;
      d19 = d5;
      d5 = d9;
      d9 = d19;
    }
    d8 = paramDouble2;
    d7 = Math.abs(d8);
    if ((d7 != 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW1.val = d9;
      paramdoubleW2.val = d5;
      d2 = 1.0D;
      d3 = 1.0D;
      d16 = 0.0D;
      d17 = 0.0D;
    }
    else
    {
      i = 1;
      if ((d7 <= d5 ? 0 : 1) != 0)
      {
        k = 2;
        if ((d5 / d7 >= Dlamch.dlamch("EPS") ? 0 : 1) != 0)
        {
          i = 0;
          paramdoubleW2.val = d7;
          if ((d9 <= 1.0D ? 0 : 1) != 0) {
            paramdoubleW1.val = (d5 / (d7 / d9));
          } else {
            paramdoubleW1.val = (d5 / d7 * d9);
          }
          d2 = 1.0D;
          d16 = d10 / d8;
          d17 = 1.0D;
          d3 = d6 / d8;
        }
      }
      if (i != 0)
      {
        d4 = d5 - d9;
        if ((d4 != d5 ? 0 : 1) != 0) {
          d11 = 1.0D;
        } else {
          d11 = d4 / d5;
        }
        d12 = d8 / d6;
        d18 = 2.0D - d11;
        d13 = d12 * d12;
        d21 = d18 * d18;
        d15 = Math.sqrt(d21 + d13);
        if ((d11 != 0.0D ? 0 : 1) != 0) {
          d14 = Math.abs(d12);
        } else {
          d14 = Math.sqrt(d11 * d11 + d13);
        }
        d1 = 0.5D * (d15 + d14);
        paramdoubleW1.val = (d9 / d1);
        paramdoubleW2.val = (d5 * d1);
        if ((d13 != 0.0D ? 0 : 1) != 0)
        {
          if ((d11 != 0.0D ? 0 : 1) != 0) {
            d18 = Util.dsign(2.0D, d6) * Util.dsign(1.0D, d8);
          } else {
            d18 = d8 / Util.dsign(d4, d6) + d12 / d18;
          }
        }
        else {
          d18 = (d12 / (d15 + d18) + d12 / (d14 + d11)) * (1.0D + d1);
        }
        d11 = Math.sqrt(d18 * d18 + 4.0D);
        d3 = 2.0D / d11;
        d17 = d18 / d11;
        d2 = (d3 + d17 * d12) / d1;
        d16 = d10 / d6 * d17 / d1;
      }
    }
    if (j != 0)
    {
      paramdoubleW6.val = d17;
      paramdoubleW5.val = d3;
      paramdoubleW4.val = d16;
      paramdoubleW3.val = d2;
    }
    else
    {
      paramdoubleW6.val = d2;
      paramdoubleW5.val = d16;
      paramdoubleW4.val = d3;
      paramdoubleW3.val = d17;
    }
    if ((k != 1 ? 0 : 1) != 0) {
      d20 = Util.dsign(1.0D, paramdoubleW4.val) * Util.dsign(1.0D, paramdoubleW6.val) * Util.dsign(1.0D, paramDouble1);
    }
    if ((k != 2 ? 0 : 1) != 0) {
      d20 = Util.dsign(1.0D, paramdoubleW3.val) * Util.dsign(1.0D, paramdoubleW6.val) * Util.dsign(1.0D, paramDouble2);
    }
    if ((k != 3 ? 0 : 1) != 0) {
      d20 = Util.dsign(1.0D, paramdoubleW3.val) * Util.dsign(1.0D, paramdoubleW5.val) * Util.dsign(1.0D, paramDouble3);
    }
    paramdoubleW2.val = Util.dsign(paramdoubleW2.val, d20);
    paramdoubleW1.val = Util.dsign(paramdoubleW1.val, d20 * Util.dsign(1.0D, paramDouble1) * Util.dsign(1.0D, paramDouble3));
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasv2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */