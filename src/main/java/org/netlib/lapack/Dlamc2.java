package org.netlib.lapack;

import java.util.Vector;
import org.netlib.util.Util;
import org.netlib.util.booleanW;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlamc2
{
  public static boolean first = true;
  public static boolean iwarn;
  public static intW lbeta = new intW(0);
  public static intW lemax = new intW(0);
  public static int lemin = 0;
  public static intW lt = new intW(0);
  public static double leps = 0.0D;
  public static doubleW lrmax = new doubleW(0.0D);
  public static double lrmin = 0.0D;
  
  static
  {
    iwarn = false;
  }
  
  public static void dlamc2(intW paramintW1, intW paramintW2, booleanW parambooleanW, doubleW paramdoubleW1, intW paramintW3, doubleW paramdoubleW2, intW paramintW4, doubleW paramdoubleW3)
  {
    boolean bool = false;
    booleanW localbooleanW1 = new booleanW(false);
    booleanW localbooleanW2 = new booleanW(false);
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i = 0;
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
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
    Vector localVector = new Vector();
    if (first)
    {
      d11 = 0;
      d5 = 1;
      d10 = 2;
      Dlamc1.dlamc1(lbeta, lt, localbooleanW2, localbooleanW1);
      d2 = lbeta.val;
      d1 = Math.pow(d2, -lt.val);
      leps = d1;
      d2 = d10 / 3;
      d4 = d5 / 2;
      d7 = Dlamc3.dlamc3(d2, -d4);
      d9 = Dlamc3.dlamc3(d7, d7);
      d2 = Dlamc3.dlamc3(d9, -d4);
      d2 = Dlamc3.dlamc3(d2, d7);
      d2 = Math.abs(d2);
      if ((d2 >= leps ? 0 : 1) != 0) {
        d2 = leps;
      }
      leps = 1;
      for (;;)
      {
        if ((leps <= d2 ? 0 : 1) != 0) {}
        if (((d2 <= d11 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          break;
        }
        leps = d2;
        d3 = Dlamc3.dlamc3(d4 * leps, Math.pow(d10, 5) * Math.pow(leps, 2));
        d3 = Dlamc3.dlamc3(d4, -d3);
        d2 = Dlamc3.dlamc3(d4, d3);
        d3 = Dlamc3.dlamc3(d4, -d2);
        d2 = Dlamc3.dlamc3(d4, d3);
      }
      if ((d1 >= leps ? 0 : 1) != 0) {
        leps = d1;
      }
      d6 = d5 / lbeta.val;
      d8 = d5;
      i = 1;
      for (int j = 3 - 1 + 1; j > 0; j--)
      {
        d8 = Dlamc3.dlamc3(d8 * d6, d11);
        i += 1;
      }
      d1 = Dlamc3.dlamc3(d5, d8);
      Dlamc4.dlamc4(localintW4, d5, lbeta.val);
      Dlamc4.dlamc4(localintW3, -d5, lbeta.val);
      Dlamc4.dlamc4(localintW2, d1, lbeta.val);
      Dlamc4.dlamc4(localintW1, -d1, lbeta.val);
      bool = false;
      if ((localintW4.val != localintW3.val ? 0 : 1) != 0) {}
      if (((localintW2.val != localintW1.val ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        if ((localintW4.val != localintW2.val ? 0 : 1) != 0)
        {
          lemin = localintW4.val;
        }
        else if ((localintW2.val - localintW4.val != 3 ? 0 : 1) != 0)
        {
          lemin = localintW4.val - 1 + lt.val;
          bool = true;
        }
        else
        {
          lemin = Math.min(localintW4.val, localintW2.val);
          iwarn = true;
        }
      }
      else
      {
        if ((localintW4.val != localintW2.val ? 0 : 1) != 0) {}
        if (((localintW3.val != localintW1.val ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          if ((Math.abs(localintW4.val - localintW3.val) != 1 ? 0 : 1) != 0)
          {
            lemin = Math.max(localintW4.val, localintW3.val);
          }
          else
          {
            lemin = Math.min(localintW4.val, localintW3.val);
            iwarn = true;
          }
        }
        else
        {
          if ((Math.abs(localintW4.val - localintW3.val) != 1 ? 0 : 1) != 0) {}
          if (((localintW2.val != localintW1.val ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            if ((localintW2.val - Math.min(localintW4.val, localintW3.val) != 3 ? 0 : 1) != 0)
            {
              lemin = Math.max(localintW4.val, localintW3.val) - 1 + lt.val;
            }
            else
            {
              lemin = Math.min(localintW4.val, localintW3.val);
              iwarn = true;
            }
          }
          else
          {
            lemin = Math.min(Util.min(localintW4.val, localintW3.val, localintW2.val), localintW1.val);
            iwarn = true;
          }
        }
      }
      first = false;
      if (iwarn)
      {
        first = true;
        localVector.clear();
        localVector.addElement(new Integer(lemin));
        Util.f77write("//' WARNING. The value EMIN may be incorrect:-','  EMIN = ',I8,/' If, after inspection, the value EMIN looks',' acceptable please comment out ',/' the IF block as marked within the code of routine',' DLAMC2,',/' otherwise supply EMIN explicitly.',/", localVector);
      }
      bool = (bool) || (localbooleanW1.val);
      lrmin = 1;
      i = 1;
      for (j = 1 - lemin - 1 + 1; j > 0; j--)
      {
        lrmin = Dlamc3.dlamc3(lrmin * d6, d11);
        i += 1;
      }
      Dlamc5.dlamc5(lbeta.val, lt.val, lemin, bool, lemax, lrmax);
    }
    paramintW1.val = lbeta.val;
    paramintW2.val = lt.val;
    parambooleanW.val = localbooleanW2.val;
    paramdoubleW1.val = leps;
    paramintW3.val = lemin;
    paramdoubleW2.val = lrmin;
    paramintW4.val = lemax.val;
    paramdoubleW3.val = lrmax.val;
    return;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlamc2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */