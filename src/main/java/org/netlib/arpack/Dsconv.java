package org.netlib.arpack;

import org.netlib.lapack.Dlamch;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Dsconv
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void dsconv(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double paramDouble, intW paramintW)
  {
    int i = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    Second.second(t0);
    d2 = Dlamch.dlamch("Epsilon-Machine");
    d2 = Math.pow(d2, 2.0D / 3.0D);
    paramintW.val = 0;
    i = 1;
    for (int j = paramInt1 - 1 + 1; j > 0; j--)
    {
      d1 = Math.max(d2, Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]));
      if ((paramArrayOfDouble2[(i - 1 + paramInt3)] > paramDouble * d1 ? 0 : 1) != 0) {
        paramintW.val += 1;
      }
      i += 1;
    }
    Second.second(t1);
    arpack_timing.tsconv.val += t1.val - t0.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dsconv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */