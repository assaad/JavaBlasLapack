package org.netlib.arpack;

import org.netlib.lapack.Slamch;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssconv
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void ssconv(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float paramFloat, intW paramintW)
  {
    int i = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    Second.second(t0);
    f2 = Slamch.slamch("Epsilon-Machine");
    f2 = (float)Math.pow(f2, 2.0F / 3.0F);
    paramintW.val = 0;
    i = 1;
    for (int j = paramInt1 - 1 + 1; j > 0; j--)
    {
      f1 = Math.max(f2, Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]));
      if ((paramArrayOfFloat2[(i - 1 + paramInt3)] > paramFloat * f1 ? 0 : 1) != 0) {
        paramintW.val += 1;
      }
      i += 1;
    }
    Second.second(t1);
    arpack_timing.tsconv.val += t1.val - t0.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Ssconv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */