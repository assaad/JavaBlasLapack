package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sscal;
import org.netlib.util.floatW;

public final class Sgesc2
{
  public static void sgesc2(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2, int paramInt6, floatW paramfloatW)
  {
    int i = 0;
    int j = 0;
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f2 = 0.0F;
    f1 = Slamch.slamch("P");
    localfloatW2.val = (Slamch.slamch("S") / f1);
    localfloatW1.val = (1.0F / localfloatW2.val);
    Slabad.slabad(localfloatW2, localfloatW1);
    Slaswp.slaswp(1, paramArrayOfFloat2, paramInt4, paramInt3, 1, paramInt1 - 1, paramArrayOfInt1, paramInt5, 1);
    i = 1;
    int m;
    for (int k = paramInt1 - 1 - 1 + 1; k > 0; k--)
    {
      j = i + 1;
      for (m = paramInt1 - (i + 1) + 1; m > 0; m--)
      {
        paramArrayOfFloat2[(j - 1 + paramInt4)] -= paramArrayOfFloat1[(j - 1 + (i - 1) * paramInt3 + paramInt2)] * paramArrayOfFloat2[(i - 1 + paramInt4)];
        j += 1;
      }
      i += 1;
    }
    paramfloatW.val = 1.0F;
    i = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt4, 1);
    if ((2.0F * localfloatW2.val * Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]) <= Math.abs(paramArrayOfFloat1[(paramInt1 - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)]) ? 0 : 1) != 0)
    {
      f2 = 1.0F / 2.0F / Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]);
      Sscal.sscal(paramInt1, f2, paramArrayOfFloat2, 1 - 1 + paramInt4, 1);
      paramfloatW.val *= f2;
    }
    i = paramInt1;
    for (k = (1 - paramInt1 + -1) / -1; k > 0; k--)
    {
      f2 = 1.0F / paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
      paramArrayOfFloat2[(i - 1 + paramInt4)] *= f2;
      j = i + 1;
      for (m = paramInt1 - (i + 1) + 1; m > 0; m--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt4)] -= paramArrayOfFloat2[(j - 1 + paramInt4)] * (paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt3 + paramInt2)] * f2);
        j += 1;
      }
      i += -1;
    }
    Slaswp.slaswp(1, paramArrayOfFloat2, paramInt4, paramInt3, 1, paramInt1 - 1, paramArrayOfInt2, paramInt6, -1);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgesc2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */