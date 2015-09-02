package org.netlib.lapack;

public final class Slapy2
{
  public static float slapy2(float paramFloat1, float paramFloat2)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    f2 = Math.abs(paramFloat1);
    f3 = Math.abs(paramFloat2);
    f1 = Math.max(f2, f3);
    f4 = Math.min(f2, f3);
    if ((f4 != 0.0F ? 0 : 1) != 0) {
      f5 = f1;
    } else {
      f5 = f1 * (float)Math.sqrt(1.0F + (float)Math.pow(f4 / f1, 2));
    }
    return f5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slapy2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */