package org.netlib.lapack;

import org.netlib.blas.Sdot;
import org.netlib.util.Util;
import org.netlib.util.floatW;

public final class Slaic1
{
  public static void slaic1(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float paramFloat1, float[] paramArrayOfFloat2, int paramInt4, float paramFloat2, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3)
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
    f7 = Slamch.slamch("Epsilon");
    f4 = Sdot.sdot(paramInt2, paramArrayOfFloat1, paramInt3, 1, paramArrayOfFloat2, paramInt4, 1);
    f1 = Math.abs(f4);
    f3 = Math.abs(paramFloat2);
    f2 = Math.abs(paramFloat1);
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((paramFloat1 != 0.0F ? 0 : 1) != 0)
      {
        f9 = Math.max(f3, f1);
        if ((f9 != 0.0F ? 0 : 1) != 0)
        {
          paramfloatW2.val = 0.0F;
          paramfloatW3.val = 1.0F;
          paramfloatW1.val = 0.0F;
        }
        else
        {
          paramfloatW2.val = (f4 / f9);
          paramfloatW3.val = (paramFloat2 / f9);
          f14 = (float)Math.sqrt(paramfloatW2.val * paramfloatW2.val + paramfloatW3.val * paramfloatW3.val);
          paramfloatW2.val /= f14;
          paramfloatW3.val /= f14;
          paramfloatW1.val = (f9 * f14);
        }
        return;
      }
      if ((f3 > f7 * f2 ? 0 : 1) != 0)
      {
        paramfloatW2.val = 1.0F;
        paramfloatW3.val = 0.0F;
        f14 = Math.max(f2, f1);
        f9 = f2 / f14;
        f10 = f1 / f14;
        paramfloatW1.val = (f14 * (float)Math.sqrt(f9 * f9 + f10 * f10));
        return;
      }
      if ((f1 > f7 * f2 ? 0 : 1) != 0)
      {
        f9 = f3;
        f10 = f2;
        if ((f9 > f10 ? 0 : 1) != 0)
        {
          paramfloatW2.val = 1.0F;
          paramfloatW3.val = 0.0F;
          paramfloatW1.val = f10;
        }
        else
        {
          paramfloatW2.val = 0.0F;
          paramfloatW3.val = 1.0F;
          paramfloatW1.val = f9;
        }
        return;
      }
      if ((f2 > f7 * f1 ? 0 : 1) == 0) {}
      if (((f2 > f7 * f3 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        f9 = f3;
        f10 = f1;
        if ((f9 > f10 ? 0 : 1) != 0)
        {
          f14 = f9 / f10;
          paramfloatW2.val = ((float)Math.sqrt(1.0F + f14 * f14));
          paramfloatW1.val = (f10 * paramfloatW2.val);
          paramfloatW3.val = (paramFloat2 / f10 / paramfloatW2.val);
          paramfloatW2.val = (Util.sign(1.0F, f4) / paramfloatW2.val);
        }
        else
        {
          f14 = f10 / f9;
          paramfloatW3.val = ((float)Math.sqrt(1.0F + f14 * f14));
          paramfloatW1.val = (f9 * paramfloatW3.val);
          paramfloatW2.val = (f4 / f9 / paramfloatW3.val);
          paramfloatW3.val = (Util.sign(1.0F, paramFloat2) / paramfloatW3.val);
        }
        return;
      }
      f15 = f4 / f2;
      f16 = paramFloat2 / f2;
      f5 = (1.0F - f15 * f15 - f16 * f16) * 0.5F;
      paramfloatW3.val = (f15 * f15);
      if ((f5 <= 0.0F ? 0 : 1) != 0) {
        f12 = paramfloatW3.val / (f5 + (float)Math.sqrt(f5 * f5 + paramfloatW3.val));
      } else {
        f12 = (float)Math.sqrt(f5 * f5 + paramfloatW3.val) - f5;
      }
      f11 = -(f15 / f12);
      f6 = -(f16 / (1.0F + f12));
      f14 = (float)Math.sqrt(f11 * f11 + f6 * f6);
      paramfloatW2.val = (f11 / f14);
      paramfloatW3.val = (f6 / f14);
      paramfloatW1.val = ((float)Math.sqrt(f12 + 1.0F) * f2);
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      if ((paramFloat1 != 0.0F ? 0 : 1) != 0)
      {
        paramfloatW1.val = 0.0F;
        if ((Math.max(f3, f1) != 0.0F ? 0 : 1) != 0)
        {
          f11 = 1.0F;
          f6 = 0.0F;
        }
        else
        {
          f11 = -paramFloat2;
          f6 = f4;
        }
        f9 = Math.max(Math.abs(f11), Math.abs(f6));
        paramfloatW2.val = (f11 / f9);
        paramfloatW3.val = (f6 / f9);
        f14 = (float)Math.sqrt(paramfloatW2.val * paramfloatW2.val + paramfloatW3.val * paramfloatW3.val);
        paramfloatW2.val /= f14;
        paramfloatW3.val /= f14;
        return;
      }
      if ((f3 > f7 * f2 ? 0 : 1) != 0)
      {
        paramfloatW2.val = 0.0F;
        paramfloatW3.val = 1.0F;
        paramfloatW1.val = f3;
        return;
      }
      if ((f1 > f7 * f2 ? 0 : 1) != 0)
      {
        f9 = f3;
        f10 = f2;
        if ((f9 > f10 ? 0 : 1) != 0)
        {
          paramfloatW2.val = 0.0F;
          paramfloatW3.val = 1.0F;
          paramfloatW1.val = f9;
        }
        else
        {
          paramfloatW2.val = 1.0F;
          paramfloatW3.val = 0.0F;
          paramfloatW1.val = f10;
        }
        return;
      }
      if ((f2 > f7 * f1 ? 0 : 1) == 0) {}
      if (((f2 > f7 * f3 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        f9 = f3;
        f10 = f1;
        if ((f9 > f10 ? 0 : 1) != 0)
        {
          f14 = f9 / f10;
          paramfloatW3.val = ((float)Math.sqrt(1.0F + f14 * f14));
          paramfloatW1.val = (f2 * (f14 / paramfloatW3.val));
          paramfloatW2.val = (-(paramFloat2 / f10 / paramfloatW3.val));
          paramfloatW3.val = (Util.sign(1.0F, f4) / paramfloatW3.val);
        }
        else
        {
          f14 = f10 / f9;
          paramfloatW2.val = ((float)Math.sqrt(1.0F + f14 * f14));
          paramfloatW1.val = (f2 / paramfloatW2.val);
          paramfloatW3.val = (f4 / f9 / paramfloatW2.val);
          paramfloatW2.val = (-(Util.sign(1.0F, paramFloat2) / paramfloatW2.val));
        }
        return;
      }
      f15 = f4 / f2;
      f16 = paramFloat2 / f2;
      f8 = Math.max(1.0F + f15 * f15 + Math.abs(f15 * f16), Math.abs(f15 * f16) + f16 * f16);
      f13 = 1.0F + 2.0F * (f15 - f16) * (f15 + f16);
      if ((f13 < 0.0F ? 0 : 1) != 0)
      {
        f5 = (f15 * f15 + f16 * f16 + 1.0F) * 0.5F;
        paramfloatW3.val = (f16 * f16);
        f12 = paramfloatW3.val / (f5 + (float)Math.sqrt(Math.abs(f5 * f5 - paramfloatW3.val)));
        f11 = f15 / (1.0F - f12);
        f6 = -(f16 / f12);
        paramfloatW1.val = ((float)Math.sqrt(f12 + 4.0F * f7 * f7 * f8) * f2);
      }
      else
      {
        f5 = (f16 * f16 + f15 * f15 - 1.0F) * 0.5F;
        paramfloatW3.val = (f15 * f15);
        if ((f5 < 0.0F ? 0 : 1) != 0) {
          f12 = -(paramfloatW3.val / (f5 + (float)Math.sqrt(f5 * f5 + paramfloatW3.val)));
        } else {
          f12 = f5 - (float)Math.sqrt(f5 * f5 + paramfloatW3.val);
        }
        f11 = -(f15 / f12);
        f6 = -(f16 / (1.0F + f12));
        paramfloatW1.val = ((float)Math.sqrt(1.0F + f12 + 4.0F * f7 * f7 * f8) * f2);
      }
      f14 = (float)Math.sqrt(f11 * f11 + f6 * f6);
      paramfloatW2.val = (f11 / f14);
      paramfloatW3.val = (f6 / f14);
      return;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaic1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */