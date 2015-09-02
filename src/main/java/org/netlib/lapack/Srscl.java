package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.util.floatW;

public final class Srscl
{
  public static void srscl(int paramInt1, float paramFloat, float[] paramArrayOfFloat, int paramInt2, int paramInt3)
  {
    int i = 0;
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    localfloatW2.val = Slamch.slamch("S");
    localfloatW1.val = (1.0F / localfloatW2.val);
    Slabad.slabad(localfloatW2, localfloatW1);
    f1 = paramFloat;
    f3 = 1.0F;
    do
    {
      f2 = f1 * localfloatW2.val;
      f4 = f3 / localfloatW1.val;
      if ((Math.abs(f2) <= Math.abs(f3) ? 0 : 1) != 0) {}
      if (((f3 == 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        f5 = localfloatW2.val;
        i = 0;
        f1 = f2;
      }
      else if ((Math.abs(f4) <= Math.abs(f1) ? 0 : 1) != 0)
      {
        f5 = localfloatW1.val;
        i = 0;
        f3 = f4;
      }
      else
      {
        f5 = f3 / f1;
        i = 1;
      }
      Sscal.sscal(paramInt1, f5, paramArrayOfFloat, paramInt2, paramInt3);
    } while ((i ^ 0x1) != 0);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Srscl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */