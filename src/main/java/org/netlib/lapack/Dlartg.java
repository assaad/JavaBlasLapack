package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlartg
{
  public static void dlartg(double paramDouble1, double paramDouble2, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3)
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
    d4 = Dlamch.dlamch("S");
    d1 = Dlamch.dlamch("E");
    d5 = Math.pow(Dlamch.dlamch("B"), (int)(Math.log(d4 / d1) / Math.log(Dlamch.dlamch("B")) / 2.0D));
    d6 = 1.0D / d5;
    if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW1.val = 1.0D;
      paramdoubleW2.val = 0.0D;
      paramdoubleW3.val = paramDouble1;
    }
    else if ((paramDouble1 != 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW1.val = 0.0D;
      paramdoubleW2.val = 1.0D;
      paramdoubleW3.val = paramDouble2;
    }
    else
    {
      d2 = paramDouble1;
      d3 = paramDouble2;
      d7 = Math.max(Math.abs(d2), Math.abs(d3));
      int k;
      if ((d7 < d6 ? 0 : 1) != 0)
      {
        i = 0;
        do
        {
          i += 1;
          d2 *= d5;
          d3 *= d5;
          d7 = Math.max(Math.abs(d2), Math.abs(d3));
        } while ((d7 < d6 ? 0 : 1) != 0);
        paramdoubleW3.val = Math.sqrt(Math.pow(d2, 2) + Math.pow(d3, 2));
        paramdoubleW1.val = (d2 / paramdoubleW3.val);
        paramdoubleW2.val = (d3 / paramdoubleW3.val);
        j = 1;
        for (k = i - 1 + 1; k > 0; k--)
        {
          paramdoubleW3.val *= d6;
          j += 1;
        }
      }
      else if ((d7 > d5 ? 0 : 1) != 0)
      {
        i = 0;
        do
        {
          i += 1;
          d2 *= d6;
          d3 *= d6;
          d7 = Math.max(Math.abs(d2), Math.abs(d3));
        } while ((d7 > d5 ? 0 : 1) != 0);
        paramdoubleW3.val = Math.sqrt(Math.pow(d2, 2) + Math.pow(d3, 2));
        paramdoubleW1.val = (d2 / paramdoubleW3.val);
        paramdoubleW2.val = (d3 / paramdoubleW3.val);
        j = 1;
        for (k = i - 1 + 1; k > 0; k--)
        {
          paramdoubleW3.val *= d5;
          j += 1;
        }
      }
      else
      {
        paramdoubleW3.val = Math.sqrt(Math.pow(d2, 2) + Math.pow(d3, 2));
        paramdoubleW1.val = (d2 / paramdoubleW3.val);
        paramdoubleW2.val = (d3 / paramdoubleW3.val);
      }
      if ((Math.abs(paramDouble1) <= Math.abs(paramDouble2) ? 0 : 1) != 0) {}
      if (((paramdoubleW1.val >= 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramdoubleW1.val = (-paramdoubleW1.val);
        paramdoubleW2.val = (-paramdoubleW2.val);
        paramdoubleW3.val = (-paramdoubleW3.val);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlartg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */