package org.netlib.lapack;

import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlamc5
{
  public static void dlamc5(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, intW paramintW, doubleW paramdoubleW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
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
    d2 = 1.0D / paramInt1;
    d4 = paramInt1 - 1.0D;
    d3 = 0.0D;
    k = 1;
    for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      d4 *= d2;
      if ((d3 >= 1.0D ? 0 : 1) != 0) {
        d1 = d3;
      }
      d3 = Dlamc3.dlamc3(d3, d4);
      k += 1;
    }
    if ((d3 < 1.0D ? 0 : 1) != 0) {
      d3 = d1;
    }
    k = 1;
    for (i3 = paramintW.val - 1 + 1; i3 > 0; i3--)
    {
      d3 = Dlamc3.dlamc3(d3 * paramInt1, 0.0D);
      k += 1;
    }
    paramdoubleW.val = d3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlamc5.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */