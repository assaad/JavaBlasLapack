package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slags2
{
  public static void slags2(boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4, floatW paramfloatW5, floatW paramfloatW6)
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
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f10 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    floatW localfloatW5 = new floatW(0.0F);
    floatW localfloatW6 = new floatW(0.0F);
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    floatW localfloatW7 = new floatW(0.0F);
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    float f22 = 0.0F;
    float f23 = 0.0F;
    float f24 = 0.0F;
    if (paramBoolean)
    {
      f1 = paramFloat1 * paramFloat6;
      f10 = paramFloat3 * paramFloat4;
      f15 = paramFloat2 * paramFloat4 - paramFloat1 * paramFloat5;
      Slasv2.slasv2(f1, f15, f10, localfloatW3, localfloatW4, localfloatW6, localfloatW2, localfloatW5, localfloatW1);
      if ((Math.abs(localfloatW1.val) < Math.abs(localfloatW5.val) ? 0 : 1) == 0) {}
      if (((Math.abs(localfloatW2.val) < Math.abs(localfloatW6.val) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        f11 = localfloatW1.val * paramFloat1;
        f18 = localfloatW1.val * paramFloat2 + localfloatW5.val * paramFloat3;
        f13 = localfloatW2.val * paramFloat4;
        f22 = localfloatW2.val * paramFloat5 + localfloatW6.val * paramFloat6;
        f3 = Math.abs(localfloatW1.val) * Math.abs(paramFloat2) + Math.abs(localfloatW5.val) * Math.abs(paramFloat3);
        f7 = Math.abs(localfloatW2.val) * Math.abs(paramFloat5) + Math.abs(localfloatW6.val) * Math.abs(paramFloat6);
        if ((Math.abs(f11) + Math.abs(f18) == 0.0F ? 0 : 1) != 0)
        {
          if ((f3 / (Math.abs(f11) + Math.abs(f18)) > f7 / (Math.abs(f13) + Math.abs(f22)) ? 0 : 1) != 0) {
            Slartg.slartg(-f11, f18, paramfloatW5, paramfloatW6, localfloatW7);
          } else {
            Slartg.slartg(-f13, f22, paramfloatW5, paramfloatW6, localfloatW7);
          }
        }
        else {
          Slartg.slartg(-f13, f22, paramfloatW5, paramfloatW6, localfloatW7);
        }
        paramfloatW1.val = localfloatW1.val;
        paramfloatW2.val = (-localfloatW5.val);
        paramfloatW3.val = localfloatW2.val;
        paramfloatW4.val = (-localfloatW6.val);
      }
      else
      {
        f19 = -(localfloatW5.val * paramFloat1);
        f20 = -(localfloatW5.val * paramFloat2) + localfloatW1.val * paramFloat3;
        f23 = -(localfloatW6.val * paramFloat4);
        f24 = -(localfloatW6.val * paramFloat5) + localfloatW2.val * paramFloat6;
        f5 = Math.abs(localfloatW5.val) * Math.abs(paramFloat2) + Math.abs(localfloatW1.val) * Math.abs(paramFloat3);
        f9 = Math.abs(localfloatW6.val) * Math.abs(paramFloat5) + Math.abs(localfloatW2.val) * Math.abs(paramFloat6);
        if ((Math.abs(f19) + Math.abs(f20) == 0.0F ? 0 : 1) != 0)
        {
          if ((f5 / (Math.abs(f19) + Math.abs(f20)) > f9 / (Math.abs(f23) + Math.abs(f24)) ? 0 : 1) != 0) {
            Slartg.slartg(-f19, f20, paramfloatW5, paramfloatW6, localfloatW7);
          } else {
            Slartg.slartg(-f23, f24, paramfloatW5, paramfloatW6, localfloatW7);
          }
        }
        else {
          Slartg.slartg(-f23, f24, paramfloatW5, paramfloatW6, localfloatW7);
        }
        paramfloatW1.val = localfloatW5.val;
        paramfloatW2.val = localfloatW1.val;
        paramfloatW3.val = localfloatW6.val;
        paramfloatW4.val = localfloatW2.val;
      }
    }
    else
    {
      f1 = paramFloat1 * paramFloat6;
      f10 = paramFloat3 * paramFloat4;
      f16 = paramFloat2 * paramFloat6 - paramFloat3 * paramFloat5;
      Slasv2.slasv2(f1, f16, f10, localfloatW3, localfloatW4, localfloatW6, localfloatW2, localfloatW5, localfloatW1);
      if ((Math.abs(localfloatW2.val) < Math.abs(localfloatW6.val) ? 0 : 1) == 0) {}
      if (((Math.abs(localfloatW1.val) < Math.abs(localfloatW5.val) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        f19 = -(localfloatW6.val * paramFloat1) + localfloatW2.val * paramFloat2;
        f12 = localfloatW2.val * paramFloat3;
        f23 = -(localfloatW5.val * paramFloat4) + localfloatW1.val * paramFloat5;
        f14 = localfloatW1.val * paramFloat6;
        f4 = Math.abs(localfloatW6.val) * Math.abs(paramFloat1) + Math.abs(localfloatW2.val) * Math.abs(paramFloat2);
        f8 = Math.abs(localfloatW5.val) * Math.abs(paramFloat4) + Math.abs(localfloatW1.val) * Math.abs(paramFloat5);
        if ((Math.abs(f19) + Math.abs(f12) == 0.0F ? 0 : 1) != 0)
        {
          if ((f4 / (Math.abs(f19) + Math.abs(f12)) > f8 / (Math.abs(f23) + Math.abs(f14)) ? 0 : 1) != 0) {
            Slartg.slartg(f12, f19, paramfloatW5, paramfloatW6, localfloatW7);
          } else {
            Slartg.slartg(f14, f23, paramfloatW5, paramfloatW6, localfloatW7);
          }
        }
        else {
          Slartg.slartg(f14, f23, paramfloatW5, paramfloatW6, localfloatW7);
        }
        paramfloatW1.val = localfloatW2.val;
        paramfloatW2.val = (-localfloatW6.val);
        paramfloatW3.val = localfloatW1.val;
        paramfloatW4.val = (-localfloatW5.val);
      }
      else
      {
        f17 = localfloatW2.val * paramFloat1 + localfloatW6.val * paramFloat2;
        f18 = localfloatW6.val * paramFloat3;
        f21 = localfloatW1.val * paramFloat4 + localfloatW5.val * paramFloat5;
        f22 = localfloatW5.val * paramFloat6;
        f2 = Math.abs(localfloatW2.val) * Math.abs(paramFloat1) + Math.abs(localfloatW6.val) * Math.abs(paramFloat2);
        f6 = Math.abs(localfloatW1.val) * Math.abs(paramFloat4) + Math.abs(localfloatW5.val) * Math.abs(paramFloat5);
        if ((Math.abs(f17) + Math.abs(f18) == 0.0F ? 0 : 1) != 0)
        {
          if ((f2 / (Math.abs(f17) + Math.abs(f18)) > f6 / (Math.abs(f21) + Math.abs(f22)) ? 0 : 1) != 0) {
            Slartg.slartg(f18, f17, paramfloatW5, paramfloatW6, localfloatW7);
          } else {
            Slartg.slartg(f22, f21, paramfloatW5, paramfloatW6, localfloatW7);
          }
        }
        else {
          Slartg.slartg(f22, f21, paramfloatW5, paramfloatW6, localfloatW7);
        }
        paramfloatW1.val = localfloatW6.val;
        paramfloatW2.val = localfloatW2.val;
        paramfloatW3.val = localfloatW5.val;
        paramfloatW4.val = localfloatW1.val;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slags2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */