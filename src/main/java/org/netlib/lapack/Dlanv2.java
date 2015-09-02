package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.doubleW;

public final class Dlanv2
{
  public static void dlanv2(doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, doubleW paramdoubleW5, doubleW paramdoubleW6, doubleW paramdoubleW7, doubleW paramdoubleW8, doubleW paramdoubleW9, doubleW paramdoubleW10)
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
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    d8 = Dlamch.dlamch("P");
    if ((paramdoubleW3.val != 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW9.val = 1.0D;
      paramdoubleW10.val = 0.0D;
      break label999;
    }
    else if ((paramdoubleW2.val != 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW9.val = 0.0D;
      paramdoubleW10.val = 1.0D;
      d16 = paramdoubleW4.val;
      paramdoubleW4.val = paramdoubleW1.val;
      paramdoubleW1.val = d16;
      paramdoubleW2.val = (-paramdoubleW3.val);
      paramdoubleW3.val = 0.0D;
      break label999;
    }
    else
    {
      if ((paramdoubleW1.val - paramdoubleW4.val != 0.0D ? 0 : 1) != 0) {}
      if (((Util.dsign(1.0D, paramdoubleW2.val) == Util.dsign(1.0D, paramdoubleW3.val) ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramdoubleW9.val = 1.0D;
        paramdoubleW10.val = 0.0D;
        break label999;
      }
      else
      {
        d16 = paramdoubleW1.val - paramdoubleW4.val;
        d9 = 0.5D * d16;
        d3 = Math.max(Math.abs(paramdoubleW2.val), Math.abs(paramdoubleW3.val));
        d4 = Math.min(Math.abs(paramdoubleW2.val), Math.abs(paramdoubleW3.val)) * Util.dsign(1.0D, paramdoubleW2.val) * Util.dsign(1.0D, paramdoubleW3.val);
        d12 = Math.max(Math.abs(d9), d3);
        d17 = d9 / d12 * d9 + d3 / d12 * d4;
        if ((d17 < 4.0D * d8 ? 0 : 1) != 0)
        {
          d17 = d9 + Util.dsign(Math.sqrt(d12) * Math.sqrt(d17), d9);
          paramdoubleW4.val += d17;
          paramdoubleW4.val -= d3 / d17 * d4;
          d15 = Dlapy2.dlapy2(paramdoubleW3.val, d17);
          paramdoubleW9.val = (d17 / d15);
          paramdoubleW3.val /= d15;
          paramdoubleW2.val -= paramdoubleW3.val;
          paramdoubleW3.val = 0.0D;
        }
        else
        {
          d13 = paramdoubleW2.val + paramdoubleW3.val;
          d15 = Dlapy2.dlapy2(d13, d16);
          paramdoubleW9.val = Math.sqrt(0.5D * (1.0D + Math.abs(d13) / d15));
          paramdoubleW10.val = (-(d9 / (d15 * paramdoubleW9.val) * Util.dsign(1.0D, d13)));
          d1 = paramdoubleW1.val * paramdoubleW9.val + paramdoubleW2.val * paramdoubleW10.val;
          d2 = -(paramdoubleW1.val * paramdoubleW10.val) + paramdoubleW2.val * paramdoubleW9.val;
          d5 = paramdoubleW3.val * paramdoubleW9.val + paramdoubleW4.val * paramdoubleW10.val;
          d7 = -(paramdoubleW3.val * paramdoubleW10.val) + paramdoubleW4.val * paramdoubleW9.val;
          paramdoubleW1.val = (d1 * paramdoubleW9.val + d5 * paramdoubleW10.val);
          paramdoubleW2.val = (d2 * paramdoubleW9.val + d7 * paramdoubleW10.val);
          paramdoubleW3.val = (-(d1 * paramdoubleW10.val) + d5 * paramdoubleW9.val);
          paramdoubleW4.val = (-(d2 * paramdoubleW10.val) + d7 * paramdoubleW9.val);
          d16 = 0.5D * (paramdoubleW1.val + paramdoubleW4.val);
          paramdoubleW1.val = d16;
          paramdoubleW4.val = d16;
          if ((paramdoubleW3.val == 0.0D ? 0 : 1) != 0) {
            if ((paramdoubleW2.val == 0.0D ? 0 : 1) != 0)
            {
              if ((Util.dsign(1.0D, paramdoubleW2.val) != Util.dsign(1.0D, paramdoubleW3.val) ? 0 : 1) != 0)
              {
                d10 = Math.sqrt(Math.abs(paramdoubleW2.val));
                d11 = Math.sqrt(Math.abs(paramdoubleW3.val));
                d9 = Util.dsign(d10 * d11, paramdoubleW3.val);
                d15 = 1.0D / Math.sqrt(Math.abs(paramdoubleW2.val + paramdoubleW3.val));
                paramdoubleW1.val = (d16 + d9);
                paramdoubleW4.val = (d16 - d9);
                paramdoubleW2.val -= paramdoubleW3.val;
                paramdoubleW3.val = 0.0D;
                d6 = d10 * d15;
                d14 = d11 * d15;
                d16 = paramdoubleW9.val * d6 - paramdoubleW10.val * d14;
                paramdoubleW10.val = (paramdoubleW9.val * d14 + paramdoubleW10.val * d6);
                paramdoubleW9.val = d16;
              }
            }
            else
            {
              paramdoubleW2.val = (-paramdoubleW3.val);
              paramdoubleW3.val = 0.0D;
              d16 = paramdoubleW9.val;
              paramdoubleW9.val = (-paramdoubleW10.val);
              paramdoubleW10.val = d16;
            }
          }
        }
      }
    }
    label999:
    paramdoubleW5.val = paramdoubleW1.val;
    paramdoubleW7.val = paramdoubleW4.val;
    if ((paramdoubleW3.val != 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW6.val = 0.0D;
      paramdoubleW8.val = 0.0D;
    }
    else
    {
      paramdoubleW6.val = (Math.sqrt(Math.abs(paramdoubleW2.val)) * Math.sqrt(Math.abs(paramdoubleW3.val)));
      paramdoubleW8.val = (-paramdoubleW6.val);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlanv2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */