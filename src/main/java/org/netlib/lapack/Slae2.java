package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slae2
{
  public static void slae2(float paramFloat1, float paramFloat2, float paramFloat3, floatW paramfloatW1, floatW paramfloatW2)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    f7 = paramFloat1 + paramFloat3;
    f5 = paramFloat1 - paramFloat3;
    f4 = Math.abs(f5);
    f8 = paramFloat2 + paramFloat2;
    f1 = Math.abs(f8);
    if ((Math.abs(paramFloat1) <= Math.abs(paramFloat3) ? 0 : 1) != 0)
    {
      f3 = paramFloat1;
      f2 = paramFloat3;
    }
    else
    {
      f3 = paramFloat3;
      f2 = paramFloat1;
    }
    if ((f4 <= f1 ? 0 : 1) != 0) {
      f6 = f4 * (float)Math.sqrt(1.0F + (float)Math.pow(f1 / f4, 2));
    } else if ((f4 >= f1 ? 0 : 1) != 0) {
      f6 = f1 * (float)Math.sqrt(1.0F + (float)Math.pow(f4 / f1, 2));
    } else {
      f6 = f1 * (float)Math.sqrt(2.0F);
    }
    if ((f7 >= 0.0F ? 0 : 1) != 0)
    {
      paramfloatW1.val = (0.5F * (f7 - f6));
      paramfloatW2.val = (f3 / paramfloatW1.val * f2 - paramFloat2 / paramfloatW1.val * paramFloat2);
    }
    else if ((f7 <= 0.0F ? 0 : 1) != 0)
    {
      paramfloatW1.val = (0.5F * (f7 + f6));
      paramfloatW2.val = (f3 / paramfloatW1.val * f2 - paramFloat2 / paramfloatW1.val * paramFloat2);
    }
    else
    {
      paramfloatW1.val = (0.5F * f6);
      paramfloatW2.val = (-(0.5F * f6));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slae2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */