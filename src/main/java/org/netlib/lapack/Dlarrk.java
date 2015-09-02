package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlarrk
{
  public static void dlarrk(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double paramDouble3, double paramDouble4, doubleW paramdoubleW1, doubleW paramdoubleW2, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    d2 = Dlamch.dlamch("P");
    d9 = Math.max(Math.abs(paramDouble1), Math.abs(paramDouble2));
    d6 = paramDouble4;
    d1 = 2.0D * 2.0D * paramDouble3;
    k = (int)((Math.log(d9 + paramDouble3) - Math.log(paramDouble3)) / Math.log(2.0D)) + 2;
    paramintW.val = -1;
    d3 = paramDouble1 - 2.0D * d9 * d2 * paramInt1 - 2.0D * 2.0D * paramDouble3;
    d5 = paramDouble2 + 2.0D * d9 * d2 * paramInt1 + 2.0D * 2.0D * paramDouble3;
    j = 0;
    for (;;)
    {
      d7 = Math.abs(d5 - d3);
      d8 = Math.max(Math.abs(d5), Math.abs(d3));
      if ((d7 >= Util.max(d1, paramDouble3, d6 * d8) ? 0 : 1) != 0)
      {
        paramintW.val = 0;
        break;
      }
      if ((j <= k ? 0 : 1) != 0) {
        break;
      }
      j += 1;
      d4 = 0.5D * (d3 + d5);
      m = 0;
      d7 = paramArrayOfDouble1[(1 - 1 + paramInt3)] - d4;
      if ((Math.abs(d7) >= paramDouble3 ? 0 : 1) != 0) {
        d7 = -paramDouble3;
      }
      if ((d7 > 0.0D ? 0 : 1) != 0) {
        m += 1;
      }
      i = 2;
      for (int n = paramInt1 - 2 + 1; n > 0; n--)
      {
        d7 = paramArrayOfDouble1[(i - 1 + paramInt3)] - paramArrayOfDouble2[(i - 1 - 1 + paramInt4)] / d7 - d4;
        if ((Math.abs(d7) >= paramDouble3 ? 0 : 1) != 0) {
          d7 = -paramDouble3;
        }
        if ((d7 > 0.0D ? 0 : 1) != 0) {
          m += 1;
        }
        i += 1;
      }
      if ((m < paramInt2 ? 0 : 1) != 0) {
        d5 = d4;
      } else {
        d3 = d4;
      }
    }
    paramdoubleW1.val = (0.5D * (d3 + d5));
    paramdoubleW2.val = (0.5D * Math.abs(d5 - d3));
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarrk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */