package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slas2
{
  public static void slas2(float paramFloat1, float paramFloat2, float paramFloat3, floatW paramfloatW1, floatW paramfloatW2)
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
    f5 = Math.abs(paramFloat1);
    f8 = Math.abs(paramFloat2);
    f9 = Math.abs(paramFloat3);
    f6 = Math.min(f5, f9);
    f7 = Math.max(f5, f9);
    if ((f6 != 0.0F ? 0 : 1) != 0)
    {
      paramfloatW1.val = 0.0F;
      if ((f7 != 0.0F ? 0 : 1) != 0) {
        paramfloatW2.val = f8;
      } else {
        paramfloatW2.val = (Math.max(f7, f8) * (float)Math.sqrt(1.0F + (float)Math.pow(Math.min(f7, f8) / Math.max(f7, f8), 2)));
      }
    }
    else if ((f8 >= f7 ? 0 : 1) != 0)
    {
      f1 = 1.0F + f6 / f7;
      f2 = (f7 - f6) / f7;
      f3 = (float)Math.pow(f8 / f7, 2);
      f4 = 2.0F / ((float)Math.sqrt(f1 * f1 + f3) + (float)Math.sqrt(f2 * f2 + f3));
      paramfloatW1.val = (f6 * f4);
      paramfloatW2.val = (f7 / f4);
    }
    else
    {
      f3 = f7 / f8;
      if ((f3 != 0.0F ? 0 : 1) != 0)
      {
        paramfloatW1.val = (f6 * f7 / f8);
        paramfloatW2.val = f8;
      }
      else
      {
        f1 = 1.0F + f6 / f7;
        f2 = (f7 - f6) / f7;
        f4 = 1.0F / ((float)Math.sqrt(1.0F + (float)Math.pow(f1 * f3, 2)) + (float)Math.sqrt(1.0F + (float)Math.pow(f2 * f3, 2)));
        paramfloatW1.val = (f6 * f4 * f3);
        paramfloatW1.val += paramfloatW1.val;
        paramfloatW2.val = (f8 / (f4 + f4));
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slas2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */