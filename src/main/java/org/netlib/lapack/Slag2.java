package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.floatW;

public final class Slag2
{
  public static void slag2(float[] paramArrayOfFloat1, int paramInt1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float paramFloat, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4, floatW paramfloatW5)
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
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    float f22 = 0.0F;
    float f23 = 0.0F;
    float f24 = 0.0F;
    float f25 = 0.0F;
    float f26 = 0.0F;
    float f27 = 0.0F;
    float f28 = 0.0F;
    float f29 = 0.0F;
    float f30 = 0.0F;
    float f31 = 0.0F;
    float f32 = 0.0F;
    float f33 = 0.0F;
    float f34 = 0.0F;
    float f35 = 0.0F;
    float f36 = 0.0F;
    float f37 = 0.0F;
    float f38 = 0.0F;
    float f39 = 0.0F;
    float f40 = 0.0F;
    float f41 = 0.0F;
    float f42 = 0.0F;
    float f43 = 0.0F;
    f31 = (float)Math.sqrt(paramFloat);
    f30 = 1.0F / f31;
    f34 = 1.0F / paramFloat;
    f6 = Util.max(Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]), Math.abs(paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)]), paramFloat);
    f10 = 1.0F / f6;
    f1 = f10 * paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)];
    f3 = f10 * paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)];
    f2 = f10 * paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)];
    f4 = f10 * paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)];
    f11 = paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
    f12 = paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)];
    f13 = paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)];
    f16 = f31 * Math.max(Util.max(Math.abs(f11), Math.abs(f12), Math.abs(f13)), f31);
    if ((Math.abs(f11) >= f16 ? 0 : 1) != 0) {
      f11 = Util.sign(f16, f11);
    }
    if ((Math.abs(f13) >= f16 ? 0 : 1) != 0) {
      f13 = Util.sign(f16, f13);
    }
    f17 = Util.max(Math.abs(f11), Math.abs(f12) + Math.abs(f13), paramFloat);
    f19 = Math.max(Math.abs(f11), Math.abs(f13));
    f18 = 1.0F / f19;
    f11 *= f18;
    f12 *= f18;
    f13 *= f18;
    f14 = 1.0F / f11;
    f15 = 1.0F / f13;
    f32 = f1 * f14;
    f33 = f4 * f15;
    if ((Math.abs(f32) > Math.abs(f33) ? 0 : 1) != 0)
    {
      f8 = f2 - f32 * f12;
      f9 = f4 - f32 * f13;
      f36 = f3 * (f14 * f15);
      f5 = f9 * f15 - f36 * f12;
      f27 = 0.5F * f5;
      f35 = f32;
    }
    else
    {
      f8 = f2 - f33 * f12;
      f7 = f1 - f33 * f11;
      f36 = f3 * (f14 * f15);
      f5 = -(f36 * f12);
      f27 = 0.5F * (f7 * f14 + f5);
      f35 = f33;
    }
    f28 = f36 * f8;
    if ((Math.abs(f27 * f31) < 1.0F ? 0 : 1) != 0)
    {
      f26 = (float)Math.pow(f31 * f27, 2) + f28 * paramFloat;
      f29 = (float)Math.sqrt(Math.abs(f26)) * f30;
    }
    else if (((float)Math.pow(f27, 2) + Math.abs(f28) > paramFloat ? 0 : 1) != 0)
    {
      f26 = (float)Math.pow(f30 * f27, 2) + f28 * f34;
      f29 = (float)Math.sqrt(Math.abs(f26)) * f31;
    }
    else
    {
      f26 = (float)Math.pow(f27, 2) + f28;
      f29 = (float)Math.sqrt(Math.abs(f26));
    }
    if ((f26 < 0.0F ? 0 : 1) == 0) {}
    if (((f29 != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      f37 = f27 + Util.sign(f29, f27);
      f25 = f27 - Util.sign(f29, f27);
      f39 = f35 + f37;
      f43 = f35 + f25;
      if ((0.5F * Math.abs(f39) <= Math.max(Math.abs(f43), paramFloat) ? 0 : 1) != 0)
      {
        f40 = (f1 * f4 - f2 * f3) * (f14 * f15);
        f43 = f40 / f39;
      }
      if ((f27 <= f5 ? 0 : 1) != 0)
      {
        paramfloatW3.val = Math.min(f39, f43);
        paramfloatW4.val = Math.max(f39, f43);
      }
      else
      {
        paramfloatW3.val = Math.max(f39, f43);
        paramfloatW4.val = Math.min(f39, f43);
      }
      paramfloatW5.val = 0.0F;
    }
    else
    {
      paramfloatW3.val = (f35 + f27);
      paramfloatW4.val = paramfloatW3.val;
      paramfloatW5.val = f29;
    }
    f20 = f19 * (paramFloat * Math.max(1.0F, f10));
    f21 = paramFloat * Math.max(1.0F, f17);
    f22 = f19 * paramFloat;
    if ((f10 > 1.0F ? 0 : 1) != 0) {}
    if (((f19 > 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
      f23 = Math.min(1.0F, f10 / paramFloat * f19);
    } else {
      f23 = 1.0F;
    }
    if ((f10 > 1.0F ? 0 : 1) == 0) {}
    if (((f19 > 1.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
      f24 = Math.min(1.0F, f10 * f19);
    } else {
      f24 = 1.0F;
    }
    f38 = Math.abs(paramfloatW3.val) + Math.abs(paramfloatW5.val);
    f42 = Math.max(Util.max(paramFloat, f20, 1.00001F * (f38 * f21 + f22)), Math.min(f23, 0.5F * Math.max(f38, f24)));
    if ((f42 == 1.0F ? 0 : 1) != 0)
    {
      f41 = 1.0F / f42;
      if ((f42 <= 1.0F ? 0 : 1) != 0) {
        paramfloatW1.val = (Math.max(f10, f19) * f41 * Math.min(f10, f19));
      } else {
        paramfloatW1.val = (Math.min(f10, f19) * f41 * Math.max(f10, f19));
      }
      paramfloatW3.val *= f41;
      if ((paramfloatW5.val == 0.0F ? 0 : 1) != 0)
      {
        paramfloatW5.val *= f41;
        paramfloatW4.val = paramfloatW3.val;
        paramfloatW2.val = paramfloatW1.val;
      }
    }
    else
    {
      paramfloatW1.val = (f10 * f19);
      paramfloatW2.val = paramfloatW1.val;
    }
    if ((paramfloatW5.val != 0.0F ? 0 : 1) != 0)
    {
      f42 = Math.max(Util.max(paramFloat, f20, 1.00001F * (Math.abs(paramfloatW4.val) * f21 + f22)), Math.min(f23, 0.5F * Math.max(Math.abs(paramfloatW4.val), f24)));
      if ((f42 == 1.0F ? 0 : 1) != 0)
      {
        f41 = 1.0F / f42;
        if ((f42 <= 1.0F ? 0 : 1) != 0) {
          paramfloatW2.val = (Math.max(f10, f19) * f41 * Math.min(f10, f19));
        } else {
          paramfloatW2.val = (Math.min(f10, f19) * f41 * Math.max(f10, f19));
        }
        paramfloatW4.val *= f41;
      }
      else
      {
        paramfloatW2.val = (f10 * f19);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slag2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */