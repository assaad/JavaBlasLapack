package org.netlib.lapack;

import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slamc5
{
  public static void slamc5(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, intW paramintW, floatW paramfloatW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    m = 1;
    i = 1;
    for (;;)
    {
      i1 = m * 2;
      if ((i1 > -paramInt3 ? 0 : 1) == 0) {
        break;
      }
      m = i1;
      i += 1;
    }
    if ((m != -paramInt3 ? 0 : 1) != 0)
    {
      i2 = m;
    }
    else
    {
      i2 = i1;
      i += 1;
    }
    if ((i2 + paramInt3 <= -m - paramInt3 ? 0 : 1) != 0) {
      j = 2 * m;
    } else {
      j = 2 * i2;
    }
    paramintW.val = (j + paramInt3 - 1);
    n = 1 + i + paramInt2;
    if ((n % 2 != 1 ? 0 : 1) != 0) {}
    if (((paramInt1 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      paramintW.val -= 1;
    }
    if (paramBoolean) {
      paramintW.val -= 1;
    }
    f2 = 1.0F / paramInt1;
    f4 = paramInt1 - 1.0F;
    f3 = 0.0F;
    k = 1;
    for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      f4 *= f2;
      if ((f3 >= 1.0F ? 0 : 1) != 0) {
        f1 = f3;
      }
      f3 = Slamc3.slamc3(f3, f4);
      k += 1;
    }
    if ((f3 < 1.0F ? 0 : 1) != 0) {
      f3 = f1;
    }
    k = 1;
    for (i3 = paramintW.val - 1 + 1; i3 > 0; i3--)
    {
      f3 = Slamc3.slamc3(f3 * paramInt1, 0.0F);
      k += 1;
    }
    paramfloatW.val = f3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slamc5.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */