package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.floatW;

public final class Slasv2
{
  public static void slasv2(float paramFloat1, float paramFloat2, float paramFloat3, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4, floatW paramfloatW5, floatW paramfloatW6)
  {
    int i = 0;
    int j = 0;
    int k = 0;
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
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    f6 = paramFloat1;
    f5 = Math.abs(f6);
    f10 = paramFloat3;
    f9 = Math.abs(paramFloat3);
    k = 1;
    j = f9 <= f5 ? 0 : 1;
    if (j != 0)
    {
      k = 3;
      f19 = f6;
      f6 = f10;
      f10 = f19;
      f19 = f5;
      f5 = f9;
      f9 = f19;
    }
    f8 = paramFloat2;
    f7 = Math.abs(f8);
    if ((f7 != 0.0F ? 0 : 1) != 0)
    {
      paramfloatW1.val = f9;
      paramfloatW2.val = f5;
      f2 = 1.0F;
      f3 = 1.0F;
      f16 = 0.0F;
      f17 = 0.0F;
    }
    else
    {
      i = 1;
      if ((f7 <= f5 ? 0 : 1) != 0)
      {
        k = 2;
        if ((f5 / f7 >= Slamch.slamch("EPS") ? 0 : 1) != 0)
        {
          i = 0;
          paramfloatW2.val = f7;
          if ((f9 <= 1.0F ? 0 : 1) != 0) {
            paramfloatW1.val = (f5 / (f7 / f9));
          } else {
            paramfloatW1.val = (f5 / f7 * f9);
          }
          f2 = 1.0F;
          f16 = f10 / f8;
          f17 = 1.0F;
          f3 = f6 / f8;
        }
      }
      if (i != 0)
      {
        f4 = f5 - f9;
        if ((f4 != f5 ? 0 : 1) != 0) {
          f11 = 1.0F;
        } else {
          f11 = f4 / f5;
        }
        f12 = f8 / f6;
        f18 = 2.0F - f11;
        f13 = f12 * f12;
        f21 = f18 * f18;
        f15 = (float)Math.sqrt(f21 + f13);
        if ((f11 != 0.0F ? 0 : 1) != 0) {
          f14 = Math.abs(f12);
        } else {
          f14 = (float)Math.sqrt(f11 * f11 + f13);
        }
        f1 = 0.5F * (f15 + f14);
        paramfloatW1.val = (f9 / f1);
        paramfloatW2.val = (f5 * f1);
        if ((f13 != 0.0F ? 0 : 1) != 0)
        {
          if ((f11 != 0.0F ? 0 : 1) != 0) {
            f18 = Util.sign(2.0F, f6) * Util.sign(1.0F, f8);
          } else {
            f18 = f8 / Util.sign(f4, f6) + f12 / f18;
          }
        }
        else {
          f18 = (f12 / (f15 + f18) + f12 / (f14 + f11)) * (1.0F + f1);
        }
        f11 = (float)Math.sqrt(f18 * f18 + 4.0F);
        f3 = 2.0F / f11;
        f17 = f18 / f11;
        f2 = (f3 + f17 * f12) / f1;
        f16 = f10 / f6 * f17 / f1;
      }
    }
    if (j != 0)
    {
      paramfloatW6.val = f17;
      paramfloatW5.val = f3;
      paramfloatW4.val = f16;
      paramfloatW3.val = f2;
    }
    else
    {
      paramfloatW6.val = f2;
      paramfloatW5.val = f16;
      paramfloatW4.val = f3;
      paramfloatW3.val = f17;
    }
    if ((k != 1 ? 0 : 1) != 0) {
      f20 = Util.sign(1.0F, paramfloatW4.val) * Util.sign(1.0F, paramfloatW6.val) * Util.sign(1.0F, paramFloat1);
    }
    if ((k != 2 ? 0 : 1) != 0) {
      f20 = Util.sign(1.0F, paramfloatW3.val) * Util.sign(1.0F, paramfloatW6.val) * Util.sign(1.0F, paramFloat2);
    }
    if ((k != 3 ? 0 : 1) != 0) {
      f20 = Util.sign(1.0F, paramfloatW3.val) * Util.sign(1.0F, paramfloatW5.val) * Util.sign(1.0F, paramFloat3);
    }
    paramfloatW2.val = Util.sign(paramfloatW2.val, f20);
    paramfloatW1.val = Util.sign(paramfloatW1.val, f20 * Util.sign(1.0F, paramFloat1) * Util.sign(1.0F, paramFloat3));
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasv2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */