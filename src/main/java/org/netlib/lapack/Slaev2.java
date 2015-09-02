package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slaev2
{
  public static void slaev2(float paramFloat1, float paramFloat2, float paramFloat3, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4)
  {
    int i = 0;
    int j = 0;
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
    float f12 = 0.0F;
    f10 = paramFloat1 + paramFloat3;
    f8 = paramFloat1 - paramFloat3;
    f5 = Math.abs(f8);
    f11 = paramFloat2 + paramFloat2;
    f1 = Math.abs(f11);
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
    if ((f5 <= f1 ? 0 : 1) != 0) {
      f9 = f5 * (float)Math.sqrt(1.0F + (float)Math.pow(f1 / f5, 2));
    } else if ((f5 >= f1 ? 0 : 1) != 0) {
      f9 = f1 * (float)Math.sqrt(1.0F + (float)Math.pow(f5 / f1, 2));
    } else {
      f9 = f1 * (float)Math.sqrt(2.0F);
    }
    if ((f10 >= 0.0F ? 0 : 1) != 0)
    {
      paramfloatW1.val = (0.5F * (f10 - f9));
      i = -1;
      paramfloatW2.val = (f3 / paramfloatW1.val * f2 - paramFloat2 / paramfloatW1.val * paramFloat2);
    }
    else if ((f10 <= 0.0F ? 0 : 1) != 0)
    {
      paramfloatW1.val = (0.5F * (f10 + f9));
      i = 1;
      paramfloatW2.val = (f3 / paramfloatW1.val * f2 - paramFloat2 / paramfloatW1.val * paramFloat2);
    }
    else
    {
      paramfloatW1.val = (0.5F * f9);
      paramfloatW2.val = (-(0.5F * f9));
      i = 1;
    }
    if ((f8 < 0.0F ? 0 : 1) != 0)
    {
      f6 = f8 + f9;
      j = 1;
    }
    else
    {
      f6 = f8 - f9;
      j = -1;
    }
    f4 = Math.abs(f6);
    if ((f4 <= f1 ? 0 : 1) != 0)
    {
      f7 = -(f11 / f6);
      paramfloatW4.val = (1.0F / (float)Math.sqrt(1.0F + f7 * f7));
      paramfloatW3.val = (f7 * paramfloatW4.val);
    }
    else if ((f1 != 0.0F ? 0 : 1) != 0)
    {
      paramfloatW3.val = 1.0F;
      paramfloatW4.val = 0.0F;
    }
    else
    {
      f12 = -(f6 / f11);
      paramfloatW3.val = (1.0F / (float)Math.sqrt(1.0F + f12 * f12));
      paramfloatW4.val = (f12 * paramfloatW3.val);
    }
    if ((i != j ? 0 : 1) != 0)
    {
      f12 = paramfloatW3.val;
      paramfloatW3.val = (-paramfloatW4.val);
      paramfloatW4.val = f12;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaev2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */