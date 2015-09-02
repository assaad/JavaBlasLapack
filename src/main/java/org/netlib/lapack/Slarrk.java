package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slarrk
{
  public static void slarrk(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float paramFloat3, float paramFloat4, floatW paramfloatW1, floatW paramfloatW2, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    f2 = Slamch.slamch("P");
    f9 = Math.max(Math.abs(paramFloat1), Math.abs(paramFloat2));
    f6 = paramFloat4;
    f1 = 2.0F * 2.0F * paramFloat3;
    k = (int)(((float)Math.log(f9 + paramFloat3) - (float)Math.log(paramFloat3)) / (float)Math.log(2.0F)) + 2;
    paramintW.val = -1;
    f3 = paramFloat1 - 2.0F * f9 * f2 * paramInt1 - 2.0F * 2.0F * paramFloat3;
    f5 = paramFloat2 + 2.0F * f9 * f2 * paramInt1 + 2.0F * 2.0F * paramFloat3;
    j = 0;
    for (;;)
    {
      f7 = Math.abs(f5 - f3);
      f8 = Math.max(Math.abs(f5), Math.abs(f3));
      if ((f7 >= Util.max(f1, paramFloat3, f6 * f8) ? 0 : 1) != 0)
      {
        paramintW.val = 0;
        break;
      }
      if ((j <= k ? 0 : 1) != 0) {
        break;
      }
      j += 1;
      f4 = 0.5F * (f3 + f5);
      m = 0;
      f7 = paramArrayOfFloat1[(1 - 1 + paramInt3)] - f4;
      if ((Math.abs(f7) >= paramFloat3 ? 0 : 1) != 0) {
        f7 = -paramFloat3;
      }
      if ((f7 > 0.0F ? 0 : 1) != 0) {
        m += 1;
      }
      i = 2;
      for (int n = paramInt1 - 2 + 1; n > 0; n--)
      {
        f7 = paramArrayOfFloat1[(i - 1 + paramInt3)] - paramArrayOfFloat2[(i - 1 - 1 + paramInt4)] / f7 - f4;
        if ((Math.abs(f7) >= paramFloat3 ? 0 : 1) != 0) {
          f7 = -paramFloat3;
        }
        if ((f7 > 0.0F ? 0 : 1) != 0) {
          m += 1;
        }
        i += 1;
      }
      if ((m < paramInt2 ? 0 : 1) != 0) {
        f5 = f4;
      } else {
        f3 = f4;
      }
    }
    paramfloatW1.val = (0.5F * (f3 + f5));
    paramfloatW2.val = (0.5F * Math.abs(f5 - f3));
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarrk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */