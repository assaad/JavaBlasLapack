package org.netlib.lapack;

import org.netlib.util.booleanW;
import org.netlib.util.intW;

public final class Slamc1
{
  public static boolean first = true;
  public static boolean lieee1 = false;
  public static boolean lrnd = false;
  public static int lbeta = 0;
  public static int lt = 0;
  
  public static void slamc1(intW paramintW1, intW paramintW2, booleanW parambooleanW1, booleanW parambooleanW2)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    if (first)
    {
      f5 = 1;
      f1 = 1;
      for (f3 = 1; (f3 != f5 ? 0 : 1) != 0; f3 = Slamc3.slamc3(f3, -f1))
      {
        f1 = 2 * f1;
        f3 = Slamc3.slamc3(f1, f5);
      }
      f2 = 1;
      for (f3 = Slamc3.slamc3(f1, f2); (f3 != f1 ? 0 : 1) != 0; f3 = Slamc3.slamc3(f1, f2)) {
        f2 = 2 * f2;
      }
      f6 = f5 / 4;
      f7 = f3;
      f3 = Slamc3.slamc3(f3, -f1);
      lbeta = (int)(f3 + f6);
      f2 = lbeta;
      f4 = Slamc3.slamc3(f2 / 2, -(f2 / 100));
      f3 = Slamc3.slamc3(f4, f1);
      if ((f3 != f1 ? 0 : 1) != 0) {
        lrnd = true;
      } else {
        lrnd = false;
      }
      f4 = Slamc3.slamc3(f2 / 2, f2 / 100);
      f3 = Slamc3.slamc3(f4, f1);
      if (lrnd) {}
      if (((f3 != f1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        lrnd = false;
      }
      f8 = Slamc3.slamc3(f2 / 2, f1);
      f9 = Slamc3.slamc3(f2 / 2, f7);
      if ((f8 != f1 ? 0 : 1) != 0) {}
      if (((f9 <= f7 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
      lieee1 = lrnd;
      lt = 0;
      f1 = 1;
      for (f3 = 1; (f3 != f5 ? 0 : 1) != 0; f3 = Slamc3.slamc3(f3, -f1))
      {
        lt += 1;
        f1 *= lbeta;
        f3 = Slamc3.slamc3(f1, f5);
      }
    }
    paramintW1.val = lbeta;
    paramintW2.val = lt;
    parambooleanW1.val = lrnd;
    parambooleanW2.val = lieee1;
    first = false;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slamc1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */