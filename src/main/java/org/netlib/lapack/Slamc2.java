package org.netlib.lapack;

import java.util.Vector;
import org.netlib.util.Util;
import org.netlib.util.booleanW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slamc2
{
  public static boolean first = true;
  public static boolean iwarn;
  public static intW lbeta = new intW(0);
  public static intW lemax = new intW(0);
  public static int lemin = 0;
  public static intW lt = new intW(0);
  public static float leps = 0.0F;
  public static floatW lrmax = new floatW(0.0F);
  public static float lrmin = 0.0F;
  
  static
  {
    iwarn = false;
  }
  
  public static void slamc2(intW paramintW1, intW paramintW2, booleanW parambooleanW, floatW paramfloatW1, intW paramintW3, floatW paramfloatW2, intW paramintW4, floatW paramfloatW3)
  {
    boolean bool = false;
    booleanW localbooleanW1 = new booleanW(false);
    booleanW localbooleanW2 = new booleanW(false);
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i = 0;
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    Vector localVector = new Vector();
    if (first)
    {
      f11 = 0;
      f5 = 1;
      f10 = 2;
      Slamc1.slamc1(lbeta, lt, localbooleanW2, localbooleanW1);
      f2 = lbeta.val;
      f1 = (float)Math.pow(f2, -lt.val);
      leps = f1;
      f2 = f10 / 3;
      f4 = f5 / 2;
      f7 = Slamc3.slamc3(f2, -f4);
      f9 = Slamc3.slamc3(f7, f7);
      f2 = Slamc3.slamc3(f9, -f4);
      f2 = Slamc3.slamc3(f2, f7);
      f2 = Math.abs(f2);
      if ((f2 >= leps ? 0 : 1) != 0) {
        f2 = leps;
      }
      leps = 1;
      for (;;)
      {
        if ((leps <= f2 ? 0 : 1) != 0) {}
        if (((f2 <= f11 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          break;
        }
        leps = f2;
        f3 = Slamc3.slamc3(f4 * leps, (float)Math.pow(f10, 5) * (float)Math.pow(leps, 2));
        f3 = Slamc3.slamc3(f4, -f3);
        f2 = Slamc3.slamc3(f4, f3);
        f3 = Slamc3.slamc3(f4, -f2);
        f2 = Slamc3.slamc3(f4, f3);
      }
      if ((f1 >= leps ? 0 : 1) != 0) {
        leps = f1;
      }
      f6 = f5 / lbeta.val;
      f8 = f5;
      i = 1;
      for (int j = 3 - 1 + 1; j > 0; j--)
      {
        f8 = Slamc3.slamc3(f8 * f6, f11);
        i += 1;
      }
      f1 = Slamc3.slamc3(f5, f8);
      Slamc4.slamc4(localintW4, f5, lbeta.val);
      Slamc4.slamc4(localintW3, -f5, lbeta.val);
      Slamc4.slamc4(localintW2, f1, lbeta.val);
      Slamc4.slamc4(localintW1, -f1, lbeta.val);
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
        Util.f77write("//' WARNING. The value EMIN may be incorrect:-','  EMIN = ',I8,/' If, after inspection, the value EMIN looks',' acceptable please comment out ',/' the IF block as marked within the code of routine',' SLAMC2,',/' otherwise supply EMIN explicitly.',/", localVector);
      }
      bool = (bool) || (localbooleanW1.val);
      lrmin = 1;
      i = 1;
      for (j = 1 - lemin - 1 + 1; j > 0; j--)
      {
        lrmin = Slamc3.slamc3(lrmin * f6, f11);
        i += 1;
      }
      Slamc5.slamc5(lbeta.val, lt.val, lemin, bool, lemax, lrmax);
    }
    paramintW1.val = lbeta.val;
    paramintW2.val = lt.val;
    parambooleanW.val = localbooleanW2.val;
    paramfloatW1.val = leps;
    paramintW3.val = lemin;
    paramfloatW2.val = lrmin;
    paramintW4.val = lemax.val;
    paramfloatW3.val = lrmax.val;
    return;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slamc2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */