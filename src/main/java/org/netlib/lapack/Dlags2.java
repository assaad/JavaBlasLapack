package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlags2
{
  public static void dlags2(boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, doubleW paramdoubleW5, doubleW paramdoubleW6)
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
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d12 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    doubleW localdoubleW6 = new doubleW(0.0D);
    doubleW localdoubleW7 = new doubleW(0.0D);
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    double d19 = 0.0D;
    double d20 = 0.0D;
    double d21 = 0.0D;
    double d22 = 0.0D;
    double d23 = 0.0D;
    double d24 = 0.0D;
    if (paramBoolean)
    {
      d1 = paramDouble1 * paramDouble6;
      d12 = paramDouble3 * paramDouble4;
      d10 = paramDouble2 * paramDouble4 - paramDouble1 * paramDouble5;
      Dlasv2.dlasv2(d1, d10, d12, localdoubleW4, localdoubleW5, localdoubleW7, localdoubleW2, localdoubleW6, localdoubleW1);
      if ((Math.abs(localdoubleW1.val) < Math.abs(localdoubleW6.val) ? 0 : 1) == 0) {}
      if (((Math.abs(localdoubleW2.val) < Math.abs(localdoubleW7.val) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        d14 = localdoubleW1.val * paramDouble1;
        d15 = localdoubleW1.val * paramDouble2 + localdoubleW6.val * paramDouble3;
        d20 = localdoubleW2.val * paramDouble4;
        d21 = localdoubleW2.val * paramDouble5 + localdoubleW7.val * paramDouble6;
        d3 = Math.abs(localdoubleW1.val) * Math.abs(paramDouble2) + Math.abs(localdoubleW6.val) * Math.abs(paramDouble3);
        d7 = Math.abs(localdoubleW2.val) * Math.abs(paramDouble5) + Math.abs(localdoubleW7.val) * Math.abs(paramDouble6);
        if ((Math.abs(d14) + Math.abs(d15) == 0.0D ? 0 : 1) != 0)
        {
          if ((d3 / (Math.abs(d14) + Math.abs(d15)) > d7 / (Math.abs(d20) + Math.abs(d21)) ? 0 : 1) != 0) {
            Dlartg.dlartg(-d14, d15, paramdoubleW5, paramdoubleW6, localdoubleW3);
          } else {
            Dlartg.dlartg(-d20, d21, paramdoubleW5, paramdoubleW6, localdoubleW3);
          }
        }
        else {
          Dlartg.dlartg(-d20, d21, paramdoubleW5, paramdoubleW6, localdoubleW3);
        }
        paramdoubleW1.val = localdoubleW1.val;
        paramdoubleW2.val = (-localdoubleW6.val);
        paramdoubleW3.val = localdoubleW2.val;
        paramdoubleW4.val = (-localdoubleW7.val);
      }
      else
      {
        d16 = -(localdoubleW6.val * paramDouble1);
        d17 = -(localdoubleW6.val * paramDouble2) + localdoubleW1.val * paramDouble3;
        d22 = -(localdoubleW7.val * paramDouble4);
        d23 = -(localdoubleW7.val * paramDouble5) + localdoubleW2.val * paramDouble6;
        d5 = Math.abs(localdoubleW6.val) * Math.abs(paramDouble2) + Math.abs(localdoubleW1.val) * Math.abs(paramDouble3);
        d9 = Math.abs(localdoubleW7.val) * Math.abs(paramDouble5) + Math.abs(localdoubleW2.val) * Math.abs(paramDouble6);
        if ((Math.abs(d16) + Math.abs(d17) == 0.0D ? 0 : 1) != 0)
        {
          if ((d5 / (Math.abs(d16) + Math.abs(d17)) > d9 / (Math.abs(d22) + Math.abs(d23)) ? 0 : 1) != 0) {
            Dlartg.dlartg(-d16, d17, paramdoubleW5, paramdoubleW6, localdoubleW3);
          } else {
            Dlartg.dlartg(-d22, d23, paramdoubleW5, paramdoubleW6, localdoubleW3);
          }
        }
        else {
          Dlartg.dlartg(-d22, d23, paramdoubleW5, paramdoubleW6, localdoubleW3);
        }
        paramdoubleW1.val = localdoubleW6.val;
        paramdoubleW2.val = localdoubleW1.val;
        paramdoubleW3.val = localdoubleW7.val;
        paramdoubleW4.val = localdoubleW2.val;
      }
    }
    else
    {
      d1 = paramDouble1 * paramDouble6;
      d12 = paramDouble3 * paramDouble4;
      d11 = paramDouble2 * paramDouble6 - paramDouble3 * paramDouble5;
      Dlasv2.dlasv2(d1, d11, d12, localdoubleW4, localdoubleW5, localdoubleW7, localdoubleW2, localdoubleW6, localdoubleW1);
      if ((Math.abs(localdoubleW2.val) < Math.abs(localdoubleW7.val) ? 0 : 1) == 0) {}
      if (((Math.abs(localdoubleW1.val) < Math.abs(localdoubleW6.val) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        d16 = -(localdoubleW7.val * paramDouble1) + localdoubleW2.val * paramDouble2;
        d18 = localdoubleW2.val * paramDouble3;
        d22 = -(localdoubleW6.val * paramDouble4) + localdoubleW1.val * paramDouble5;
        d24 = localdoubleW1.val * paramDouble6;
        d4 = Math.abs(localdoubleW7.val) * Math.abs(paramDouble1) + Math.abs(localdoubleW2.val) * Math.abs(paramDouble2);
        d8 = Math.abs(localdoubleW6.val) * Math.abs(paramDouble4) + Math.abs(localdoubleW1.val) * Math.abs(paramDouble5);
        if ((Math.abs(d16) + Math.abs(d18) == 0.0D ? 0 : 1) != 0)
        {
          if ((d4 / (Math.abs(d16) + Math.abs(d18)) > d8 / (Math.abs(d22) + Math.abs(d24)) ? 0 : 1) != 0) {
            Dlartg.dlartg(d18, d16, paramdoubleW5, paramdoubleW6, localdoubleW3);
          } else {
            Dlartg.dlartg(d24, d22, paramdoubleW5, paramdoubleW6, localdoubleW3);
          }
        }
        else {
          Dlartg.dlartg(d24, d22, paramdoubleW5, paramdoubleW6, localdoubleW3);
        }
        paramdoubleW1.val = localdoubleW2.val;
        paramdoubleW2.val = (-localdoubleW7.val);
        paramdoubleW3.val = localdoubleW1.val;
        paramdoubleW4.val = (-localdoubleW6.val);
      }
      else
      {
        d13 = localdoubleW2.val * paramDouble1 + localdoubleW7.val * paramDouble2;
        d15 = localdoubleW7.val * paramDouble3;
        d19 = localdoubleW1.val * paramDouble4 + localdoubleW6.val * paramDouble5;
        d21 = localdoubleW6.val * paramDouble6;
        d2 = Math.abs(localdoubleW2.val) * Math.abs(paramDouble1) + Math.abs(localdoubleW7.val) * Math.abs(paramDouble2);
        d6 = Math.abs(localdoubleW1.val) * Math.abs(paramDouble4) + Math.abs(localdoubleW6.val) * Math.abs(paramDouble5);
        if ((Math.abs(d13) + Math.abs(d15) == 0.0D ? 0 : 1) != 0)
        {
          if ((d2 / (Math.abs(d13) + Math.abs(d15)) > d6 / (Math.abs(d19) + Math.abs(d21)) ? 0 : 1) != 0) {
            Dlartg.dlartg(d15, d13, paramdoubleW5, paramdoubleW6, localdoubleW3);
          } else {
            Dlartg.dlartg(d21, d19, paramdoubleW5, paramdoubleW6, localdoubleW3);
          }
        }
        else {
          Dlartg.dlartg(d21, d19, paramdoubleW5, paramdoubleW6, localdoubleW3);
        }
        paramdoubleW1.val = localdoubleW7.val;
        paramdoubleW2.val = localdoubleW2.val;
        paramdoubleW3.val = localdoubleW6.val;
        paramdoubleW4.val = localdoubleW1.val;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlags2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */