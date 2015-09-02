package org.netlib.blas;

import org.netlib.util.Util;
import org.netlib.util.floatW;

public final class Srotg
{
  public static void srotg(floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    f2 = paramfloatW2.val;
    if ((Math.abs(paramfloatW1.val) <= Math.abs(paramfloatW2.val) ? 0 : 1) != 0) {
      f2 = paramfloatW1.val;
    }
    f3 = Math.abs(paramfloatW1.val) + Math.abs(paramfloatW2.val);
    if ((f3 == 0.0F ? 0 : 1) == 0)
    {
      paramfloatW3.val = 1.0F;
      paramfloatW4.val = 0.0F;
      f1 = 0.0F;
      f4 = 0.0F;
    }
    else
    {
      f1 = f3 * (float)Math.sqrt((float)Math.pow(paramfloatW1.val / f3, 2) + (float)Math.pow(paramfloatW2.val / f3, 2));
      f1 = Util.sign(1.0F, f2) * f1;
      paramfloatW1.val /= f1;
      paramfloatW2.val /= f1;
      f4 = 1.0F;
      if ((Math.abs(paramfloatW1.val) <= Math.abs(paramfloatW2.val) ? 0 : 1) != 0) {
        f4 = paramfloatW4.val;
      }
      if ((Math.abs(paramfloatW2.val) < Math.abs(paramfloatW1.val) ? 0 : 1) != 0) {}
      if (((paramfloatW3.val == 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
        f4 = 1.0F / paramfloatW3.val;
      }
    }
    paramfloatW1.val = f1;
    paramfloatW2.val = f4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Srotg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */