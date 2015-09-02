package org.netlib.lapack;

import org.netlib.util.intW;

public final class Dlarrr
{
  public static void dlarrr(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, intW paramintW)
  {
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    paramintW.val = 1;
    d2 = Dlamch.dlamch("Safe minimum");
    d1 = Dlamch.dlamch("Precision");
    d3 = d2 / d1;
    d4 = Math.sqrt(d3);
    j = 1;
    d7 = 0.0D;
    d5 = Math.sqrt(Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt2)]));
    if ((d5 >= d4 ? 0 : 1) != 0) {
      j = 0;
    }
    if ((j ^ 0x1) == 0)
    {
      i = 2;
      for (int k = paramInt1 - 2 + 1; k > 0; k--)
      {
        d6 = Math.sqrt(Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]));
        if ((d6 >= d4 ? 0 : 1) != 0) {
          j = 0;
        }
        if ((j ^ 0x1) != 0) {
          break;
        }
        d8 = Math.abs(paramArrayOfDouble2[(i - 1 - 1 + paramInt3)]) / (d5 * d6);
        if ((d7 + d8 < 0.999D ? 0 : 1) != 0) {
          j = 0;
        }
        if ((j ^ 0x1) != 0) {
          break;
        }
        d5 = d6;
        d7 = d8;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarrr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */