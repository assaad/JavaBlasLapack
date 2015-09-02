package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Sladiv
{
  public static void sladiv(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, floatW paramfloatW1, floatW paramfloatW2)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    if ((Math.abs(paramFloat4) >= Math.abs(paramFloat3) ? 0 : 1) != 0)
    {
      f1 = paramFloat4 / paramFloat3;
      f2 = paramFloat3 + paramFloat4 * f1;
      paramfloatW1.val = ((paramFloat1 + paramFloat2 * f1) / f2);
      paramfloatW2.val = ((paramFloat2 - paramFloat1 * f1) / f2);
    }
    else
    {
      f1 = paramFloat3 / paramFloat4;
      f2 = paramFloat4 + paramFloat3 * f1;
      paramfloatW1.val = ((paramFloat2 + paramFloat1 * f1) / f2);
      paramfloatW2.val = ((-paramFloat1 + paramFloat2 * f1) / f2);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sladiv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */