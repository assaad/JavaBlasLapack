package org.netlib.lapack;

import org.netlib.util.intW;

public final class Dlamc4
{
  public static void dlamc4(intW paramintW, double paramDouble, int paramInt)
  {
    int i = 0;
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
    d1 = paramDouble;
    d8 = 1;
    d9 = d8 / paramInt;
    d10 = 0;
    paramintW.val = 1;
    d2 = Dlamc3.dlamc3(d1 * d9, d10);
    d4 = d1;
    d5 = d1;
    d6 = d1;
    d7 = d1;
    for (;;)
    {
      if ((d4 != d1 ? 0 : 1) != 0) {}
      if (((d5 != d1 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
      if (((d6 != d1 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
      if (((d7 != d1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        break;
      }
      paramintW.val -= 1;
      d1 = d2;
      d2 = Dlamc3.dlamc3(d1 / paramInt, d10);
      d4 = Dlamc3.dlamc3(d2 * paramInt, d10);
      d6 = d10;
      i = 1;
      for (int j = paramInt - 1 + 1; j > 0; j--)
      {
        d6 += d2;
        i += 1;
      }
      d3 = Dlamc3.dlamc3(d1 * d9, d10);
      d5 = Dlamc3.dlamc3(d3 / d9, d10);
      d7 = d10;
      i = 1;
      for (j = paramInt - 1 + 1; j > 0; j--)
      {
        d7 += d3;
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlamc4.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */