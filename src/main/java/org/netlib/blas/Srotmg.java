package org.netlib.blas;

import org.netlib.util.floatW;

public final class Srotmg
{
  public static float gam = 4096.0F;
  public static float gamsq = 1.67772E7F;
  public static float one;
  public static float rgamsq = 5.96046E-8F;
  public static float two;
  public static float zero = 0.0F;
  
  static
  {
    one = 1.0F;
    two = 2.0F;
  }
  
  public static void srotmg(floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, float paramFloat, float[] paramArrayOfFloat, int paramInt)
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
    int i = 0;
    if (((paramfloatW1.val >= zero ? 0 : 1) ^ 0x1) == 0) {
      break label341;
    }
    f7 = paramfloatW2.val * paramFloat;
    if (((f7 != zero ? 0 : 1) ^ 0x1) == 0)
    {
      f1 = -two;
    }
    else
    {
      f6 = paramfloatW1.val * paramfloatW3.val;
      f9 = f7 * paramFloat;
      f8 = f6 * paramfloatW3.val;
      if (((Math.abs(f8) <= Math.abs(f9) ? 0 : 1) ^ 0x1) == 0)
      {
        f4 = -(paramFloat / paramfloatW3.val);
        f3 = f7 / f6;
        f11 = one - f3 * f4;
        if (((f11 > zero ? 0 : 1) ^ 0x1) == 0) {
          break label341;
        }
        f1 = zero;
        paramfloatW1.val /= f11;
        paramfloatW2.val /= f11;
        paramfloatW3.val *= f11;
        break label518;
      }
      else
      {
        if (((f9 >= zero ? 0 : 1) ^ 0x1) == 0) {
          break label341;
        }
        f1 = one;
        f2 = f6 / f7;
        f5 = paramfloatW3.val / paramFloat;
        f11 = one + f2 * f5;
        f10 = paramfloatW2.val / f11;
        paramfloatW1.val /= f11;
        paramfloatW1.val = f10;
        paramfloatW3.val = (paramFloat * f11);
        break label518;
      }
      label341:
      f1 = -one;
      f2 = zero;
      f3 = zero;
      f4 = zero;
      f5 = zero;
      paramfloatW1.val = zero;
      paramfloatW2.val = zero;
      paramfloatW3.val = zero;
      break label871;
      if (((f1 < zero ? 0 : 1) ^ 0x1) == 0) {
        if (((f1 != zero ? 0 : 1) ^ 0x1) == 0)
        {
          f2 = one;
          f5 = one;
          f1 = -one;
        }
        else
        {
          f4 = -one;
          f3 = one;
          f1 = -one;
        }
      }
      int j = i;
      if (j != 120)
      {
        if (j != 150)
        {
          if (j == 180) {
            break label760;
          }
          if (j == 210) {
            break label833;
          }
        }
      }
      else {
        for (;;)
        {
          label518:
          if (((paramfloatW1.val > rgamsq ? 0 : 1) ^ 0x1) != 0) {
            break label621;
          }
          if ((paramfloatW1.val != zero ? 0 : 1) != 0) {
            break label703;
          }
          i = 120;
          break;
          paramfloatW1.val *= (float)Math.pow(gam, 2);
          paramfloatW3.val /= gam;
          f2 /= gam;
          f3 /= gam;
        }
      }
      for (;;)
      {
        label621:
        if (((paramfloatW1.val < gamsq ? 0 : 1) ^ 0x1) != 0) {
          break label703;
        }
        i = 150;
        break;
        paramfloatW1.val /= (float)Math.pow(gam, 2);
        paramfloatW3.val *= gam;
        f2 *= gam;
        f3 *= gam;
      }
      for (;;)
      {
        label703:
        if (((Math.abs(paramfloatW2.val) > rgamsq ? 0 : 1) ^ 0x1) != 0) {
          break label798;
        }
        if ((paramfloatW2.val != zero ? 0 : 1) != 0) {
          break label871;
        }
        i = 180;
        break;
        label760:
        paramfloatW2.val *= (float)Math.pow(gam, 2);
        f4 /= gam;
        f5 /= gam;
      }
      for (;;)
      {
        label798:
        if (((Math.abs(paramfloatW2.val) < gamsq ? 0 : 1) ^ 0x1) != 0) {
          break label871;
        }
        i = 210;
        break;
        label833:
        paramfloatW2.val /= (float)Math.pow(gam, 2);
        f4 *= gam;
        f5 *= gam;
      }
      label871:
      float f12 = f1;
      if (f12 >= 0.0F)
      {
        if (f12 != 0.0F) {
          break label923;
        }
        paramArrayOfFloat[(3 - 1 + paramInt)] = f4;
        paramArrayOfFloat[(4 - 1 + paramInt)] = f3;
        break label992;
        label923:
        paramArrayOfFloat[(2 - 1 + paramInt)] = f2;
        paramArrayOfFloat[(5 - 1 + paramInt)] = f5;
      }
      else
      {
        paramArrayOfFloat[(2 - 1 + paramInt)] = f2;
        paramArrayOfFloat[(3 - 1 + paramInt)] = f4;
        paramArrayOfFloat[(4 - 1 + paramInt)] = f3;
        paramArrayOfFloat[(5 - 1 + paramInt)] = f5;
      }
    }
    label992:
    paramArrayOfFloat[(1 - 1 + paramInt)] = f1;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Srotmg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */