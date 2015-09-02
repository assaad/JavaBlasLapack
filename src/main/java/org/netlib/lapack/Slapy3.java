package org.netlib.lapack;

import org.netlib.util.Util;

public final class Slapy3
{
  public static float slapy3(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    f2 = Math.abs(paramFloat1);
    f3 = Math.abs(paramFloat2);
    f4 = Math.abs(paramFloat3);
    f1 = Util.max(f2, f3, f4);
    if ((f1 != 0.0F ? 0 : 1) != 0) {
      f5 = f2 + f3 + f4;
    } else {
      f5 = f1 * (float)Math.sqrt((float)Math.pow(f2 / f1, 2) + (float)Math.pow(f3 / f1, 2) + (float)Math.pow(f4 / f1, 2));
    }
    return f5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slapy3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */