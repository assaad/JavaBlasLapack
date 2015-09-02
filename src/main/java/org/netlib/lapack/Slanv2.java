package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.floatW;

public final class Slanv2
{
  public static void slanv2(floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4, floatW paramfloatW5, floatW paramfloatW6, floatW paramfloatW7, floatW paramfloatW8, floatW paramfloatW9, floatW paramfloatW10)
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
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    f8 = Slamch.slamch("P");
    if ((paramfloatW3.val != 0.0F ? 0 : 1) != 0)
    {
      paramfloatW9.val = 1.0F;
      paramfloatW10.val = 0.0F;
      break label1007;
    }
    else if ((paramfloatW2.val != 0.0F ? 0 : 1) != 0)
    {
      paramfloatW9.val = 0.0F;
      paramfloatW10.val = 1.0F;
      f16 = paramfloatW4.val;
      paramfloatW4.val = paramfloatW1.val;
      paramfloatW1.val = f16;
      paramfloatW2.val = (-paramfloatW3.val);
      paramfloatW3.val = 0.0F;
      break label1007;
    }
    else
    {
      if ((paramfloatW1.val - paramfloatW4.val != 0.0F ? 0 : 1) != 0) {}
      if (((Util.sign(1.0F, paramfloatW2.val) == Util.sign(1.0F, paramfloatW3.val) ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramfloatW9.val = 1.0F;
        paramfloatW10.val = 0.0F;
        break label1007;
      }
      else
      {
        f16 = paramfloatW1.val - paramfloatW4.val;
        f9 = 0.5F * f16;
        f3 = Math.max(Math.abs(paramfloatW2.val), Math.abs(paramfloatW3.val));
        f4 = Math.min(Math.abs(paramfloatW2.val), Math.abs(paramfloatW3.val)) * Util.sign(1.0F, paramfloatW2.val) * Util.sign(1.0F, paramfloatW3.val);
        f12 = Math.max(Math.abs(f9), f3);
        f17 = f9 / f12 * f9 + f3 / f12 * f4;
        if ((f17 < 4.0F * f8 ? 0 : 1) != 0)
        {
          f17 = f9 + Util.sign((float)Math.sqrt(f12) * (float)Math.sqrt(f17), f9);
          paramfloatW4.val += f17;
          paramfloatW4.val -= f3 / f17 * f4;
          f15 = Slapy2.slapy2(paramfloatW3.val, f17);
          paramfloatW9.val = (f17 / f15);
          paramfloatW3.val /= f15;
          paramfloatW2.val -= paramfloatW3.val;
          paramfloatW3.val = 0.0F;
        }
        else
        {
          f13 = paramfloatW2.val + paramfloatW3.val;
          f15 = Slapy2.slapy2(f13, f16);
          paramfloatW9.val = ((float)Math.sqrt(0.5F * (1.0F + Math.abs(f13) / f15)));
          paramfloatW10.val = (-(f9 / (f15 * paramfloatW9.val) * Util.sign(1.0F, f13)));
          f1 = paramfloatW1.val * paramfloatW9.val + paramfloatW2.val * paramfloatW10.val;
          f2 = -(paramfloatW1.val * paramfloatW10.val) + paramfloatW2.val * paramfloatW9.val;
          f5 = paramfloatW3.val * paramfloatW9.val + paramfloatW4.val * paramfloatW10.val;
          f7 = -(paramfloatW3.val * paramfloatW10.val) + paramfloatW4.val * paramfloatW9.val;
          paramfloatW1.val = (f1 * paramfloatW9.val + f5 * paramfloatW10.val);
          paramfloatW2.val = (f2 * paramfloatW9.val + f7 * paramfloatW10.val);
          paramfloatW3.val = (-(f1 * paramfloatW10.val) + f5 * paramfloatW9.val);
          paramfloatW4.val = (-(f2 * paramfloatW10.val) + f7 * paramfloatW9.val);
          f16 = 0.5F * (paramfloatW1.val + paramfloatW4.val);
          paramfloatW1.val = f16;
          paramfloatW4.val = f16;
          if ((paramfloatW3.val == 0.0F ? 0 : 1) != 0) {
            if ((paramfloatW2.val == 0.0F ? 0 : 1) != 0)
            {
              if ((Util.sign(1.0F, paramfloatW2.val) != Util.sign(1.0F, paramfloatW3.val) ? 0 : 1) != 0)
              {
                f10 = (float)Math.sqrt(Math.abs(paramfloatW2.val));
                f11 = (float)Math.sqrt(Math.abs(paramfloatW3.val));
                f9 = Util.sign(f10 * f11, paramfloatW3.val);
                f15 = 1.0F / (float)Math.sqrt(Math.abs(paramfloatW2.val + paramfloatW3.val));
                paramfloatW1.val = (f16 + f9);
                paramfloatW4.val = (f16 - f9);
                paramfloatW2.val -= paramfloatW3.val;
                paramfloatW3.val = 0.0F;
                f6 = f10 * f15;
                f14 = f11 * f15;
                f16 = paramfloatW9.val * f6 - paramfloatW10.val * f14;
                paramfloatW10.val = (paramfloatW9.val * f14 + paramfloatW10.val * f6);
                paramfloatW9.val = f16;
              }
            }
            else
            {
              paramfloatW2.val = (-paramfloatW3.val);
              paramfloatW3.val = 0.0F;
              f16 = paramfloatW9.val;
              paramfloatW9.val = (-paramfloatW10.val);
              paramfloatW10.val = f16;
            }
          }
        }
      }
    }
    label1007:
    paramfloatW5.val = paramfloatW1.val;
    paramfloatW7.val = paramfloatW4.val;
    if ((paramfloatW3.val != 0.0F ? 0 : 1) != 0)
    {
      paramfloatW6.val = 0.0F;
      paramfloatW8.val = 0.0F;
    }
    else
    {
      paramfloatW6.val = ((float)Math.sqrt(Math.abs(paramfloatW2.val)) * (float)Math.sqrt(Math.abs(paramfloatW3.val)));
      paramfloatW8.val = (-paramfloatW6.val);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slanv2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */