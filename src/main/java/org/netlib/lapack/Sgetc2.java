package org.netlib.lapack;

import org.netlib.blas.Sger;
import org.netlib.blas.Sswap;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgetc2
{
  public static void sgetc2(int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, int[] paramArrayOfInt2, int paramInt5, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f3 = 0.0F;
    paramintW.val = 0;
    f1 = Slamch.slamch("P");
    localfloatW2.val = (Slamch.slamch("S") / f1);
    localfloatW1.val = (1.0F / localfloatW2.val);
    Slabad.slabad(localfloatW2, localfloatW1);
    i = 1;
    for (int i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
    {
      f3 = 0.0F;
      j = i;
      for (int i3 = paramInt1 - i + 1; i3 > 0; i3--)
      {
        n = i;
        for (int i4 = paramInt1 - i + 1; i4 > 0; i4--)
        {
          if ((Math.abs(paramArrayOfFloat[(j - 1 + (n - 1) * paramInt3 + paramInt2)]) < f3 ? 0 : 1) != 0)
          {
            f3 = Math.abs(paramArrayOfFloat[(j - 1 + (n - 1) * paramInt3 + paramInt2)]);
            k = j;
            i1 = n;
          }
          n += 1;
        }
        j += 1;
      }
      if ((i != 1 ? 0 : 1) != 0) {
        f2 = Math.max(f1 * f3, localfloatW2.val);
      }
      if ((k == i ? 0 : 1) != 0) {
        Sswap.sswap(paramInt1, paramArrayOfFloat, k - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3);
      }
      paramArrayOfInt1[(i - 1 + paramInt4)] = k;
      if ((i1 == i ? 0 : 1) != 0) {
        Sswap.sswap(paramInt1, paramArrayOfFloat, 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
      }
      paramArrayOfInt2[(i - 1 + paramInt5)] = i1;
      if ((Math.abs(paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)]) >= f2 ? 0 : 1) != 0)
      {
        paramintW.val = i;
        paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = f2;
      }
      m = i + 1;
      for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
      {
        paramArrayOfFloat[(m - 1 + (i - 1) * paramInt3 + paramInt2)] /= paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
        m += 1;
      }
      Sger.sger(paramInt1 - i, paramInt1 - i, -1.0F, paramArrayOfFloat, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat, i - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3);
      i += 1;
    }
    if ((Math.abs(paramArrayOfFloat[(paramInt1 - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)]) >= f2 ? 0 : 1) != 0)
    {
      paramintW.val = paramInt1;
      paramArrayOfFloat[(paramInt1 - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)] = f2;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgetc2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */