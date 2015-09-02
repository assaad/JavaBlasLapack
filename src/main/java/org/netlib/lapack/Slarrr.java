package org.netlib.lapack;

import org.netlib.util.intW;

public final class Slarrr
{
  public static void slarrr(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, intW paramintW)
  {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    paramintW.val = 1;
    f2 = Slamch.slamch("Safe minimum");
    f1 = Slamch.slamch("Precision");
    f3 = f2 / f1;
    f4 = (float)Math.sqrt(f3);
    j = 1;
    f7 = 0.0F;
    f5 = (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt2)]));
    if ((f5 >= f4 ? 0 : 1) != 0) {
      j = 0;
    }
    if ((j ^ 0x1) == 0)
    {
      i = 2;
      for (int k = paramInt1 - 2 + 1; k > 0; k--)
      {
        f6 = (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]));
        if ((f6 >= f4 ? 0 : 1) != 0) {
          j = 0;
        }
        if ((j ^ 0x1) != 0) {
          break;
        }
        f8 = Math.abs(paramArrayOfFloat2[(i - 1 - 1 + paramInt3)]) / (f5 * f6);
        if ((f7 + f8 < 0.999F ? 0 : 1) != 0) {
          j = 0;
        }
        if ((j ^ 0x1) != 0) {
          break;
        }
        f5 = f6;
        f7 = f8;
        i += 1;
      }
    }
    if (j != 0)
    {
      paramintW.val = 0;
      return;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarrr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */