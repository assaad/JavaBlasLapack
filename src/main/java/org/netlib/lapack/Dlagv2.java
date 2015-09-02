package org.netlib.lapack;

import org.netlib.blas.Drot;
import org.netlib.util.Util;
import org.netlib.util.doubleW;

public final class Dlagv2
{
  public static void dlagv2(double[] paramArrayOfDouble1, int paramInt1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d9 = 0.0D;
    double d10 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d11 = 0.0D;
    doubleW localdoubleW5 = new doubleW(0.0D);
    doubleW localdoubleW6 = new doubleW(0.0D);
    doubleW localdoubleW7 = new doubleW(0.0D);
    d10 = Dlamch.dlamch("S");
    d11 = Dlamch.dlamch("P");
    d1 = Util.max(Math.abs(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]), Math.abs(paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)]), d10);
    d2 = 1.0D / d1;
    paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)] = (d2 * paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)] = (d2 * paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = (d2 * paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)] = (d2 * paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)]);
    d3 = Util.max(Math.abs(paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]), Math.abs(paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]) + Math.abs(paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)]), d10);
    d4 = 1.0D / d3;
    paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] = (d4 * paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
    paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)] = (d4 * paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
    paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)] = (d4 * paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
    if ((Math.abs(paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]) > d11 ? 0 : 1) != 0)
    {
      paramdoubleW1.val = 1.0D;
      paramdoubleW2.val = 0.0D;
      paramdoubleW3.val = 1.0D;
      paramdoubleW4.val = 0.0D;
      paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = 0.0D;
      paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0D;
    }
    else if ((Math.abs(paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]) > d11 ? 0 : 1) != 0)
    {
      Dlartg.dlartg(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramdoubleW1, paramdoubleW2, localdoubleW1);
      paramdoubleW3.val = 1.0D;
      paramdoubleW4.val = 0.0D;
      Drot.drot(2, paramArrayOfDouble1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramdoubleW1.val, paramdoubleW2.val);
      Drot.drot(2, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramdoubleW1.val, paramdoubleW2.val);
      paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = 0.0D;
      paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0D;
      paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0D;
    }
    else if ((Math.abs(paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)]) > d11 ? 0 : 1) != 0)
    {
      Dlartg.dlartg(paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)], paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramdoubleW3, paramdoubleW4, localdoubleW4);
      paramdoubleW4.val = (-paramdoubleW4.val);
      Drot.drot(2, paramArrayOfDouble1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, 1, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt2 + paramInt1, 1, paramdoubleW3.val, paramdoubleW4.val);
      Drot.drot(2, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, 1, paramdoubleW3.val, paramdoubleW4.val);
      paramdoubleW1.val = 1.0D;
      paramdoubleW2.val = 0.0D;
      paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = 0.0D;
      paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0D;
      paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)] = 0.0D;
    }
    else
    {
      Dlag2.dlag2(paramArrayOfDouble1, paramInt1, paramInt2, paramArrayOfDouble2, paramInt3, paramInt4, d10, localdoubleW2, localdoubleW3, localdoubleW6, localdoubleW7, localdoubleW5);
      if ((localdoubleW5.val != 0.0D ? 0 : 1) != 0)
      {
        d5 = localdoubleW2.val * paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)] - localdoubleW6.val * paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
        d6 = localdoubleW2.val * paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)] - localdoubleW6.val * paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)];
        d7 = localdoubleW2.val * paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)] - localdoubleW6.val * paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)];
        d9 = Dlapy2.dlapy2(d5, d6);
        d8 = Dlapy2.dlapy2(localdoubleW2.val * paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)], d7);
        if ((d9 <= d8 ? 0 : 1) != 0) {
          Dlartg.dlartg(d6, d5, paramdoubleW3, paramdoubleW4, localdoubleW4);
        } else {
          Dlartg.dlartg(d7, localdoubleW2.val * paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramdoubleW3, paramdoubleW4, localdoubleW4);
        }
        paramdoubleW4.val = (-paramdoubleW4.val);
        Drot.drot(2, paramArrayOfDouble1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, 1, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt2 + paramInt1, 1, paramdoubleW3.val, paramdoubleW4.val);
        Drot.drot(2, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, 1, paramdoubleW3.val, paramdoubleW4.val);
        d5 = Math.max(Math.abs(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)]), Math.abs(paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)]));
        d6 = Math.max(Math.abs(paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]) + Math.abs(paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]), Math.abs(paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)]) + Math.abs(paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)]));
        if ((localdoubleW2.val * d5 < Math.abs(localdoubleW6.val) * d6 ? 0 : 1) != 0) {
          Dlartg.dlartg(paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)], paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)], paramdoubleW1, paramdoubleW2, localdoubleW1);
        } else {
          Dlartg.dlartg(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramdoubleW1, paramdoubleW2, localdoubleW1);
        }
        Drot.drot(2, paramArrayOfDouble1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramdoubleW1.val, paramdoubleW2.val);
        Drot.drot(2, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramdoubleW1.val, paramdoubleW2.val);
        paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = 0.0D;
        paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0D;
      }
      else
      {
        Dlasv2.dlasv2(paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)], paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)], paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)], localdoubleW1, localdoubleW4, paramdoubleW4, paramdoubleW3, paramdoubleW2, paramdoubleW1);
        Drot.drot(2, paramArrayOfDouble1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramdoubleW1.val, paramdoubleW2.val);
        Drot.drot(2, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramdoubleW1.val, paramdoubleW2.val);
        Drot.drot(2, paramArrayOfDouble1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, 1, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt2 + paramInt1, 1, paramdoubleW3.val, paramdoubleW4.val);
        Drot.drot(2, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, 1, paramdoubleW3.val, paramdoubleW4.val);
        paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0D;
        paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)] = 0.0D;
      }
    }
    paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)] = (d1 * paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = (d1 * paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)] = (d1 * paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)] = (d1 * paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] = (d3 * paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
    paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = (d3 * paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
    paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)] = (d3 * paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
    paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)] = (d3 * paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
    if ((localdoubleW5.val != 0.0D ? 0 : 1) != 0)
    {
      paramArrayOfDouble3[(1 - 1 + paramInt5)] = paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)];
      paramArrayOfDouble3[(2 - 1 + paramInt5)] = paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)];
      paramArrayOfDouble4[(1 - 1 + paramInt6)] = 0.0D;
      paramArrayOfDouble4[(2 - 1 + paramInt6)] = 0.0D;
      paramArrayOfDouble5[(1 - 1 + paramInt7)] = paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
      paramArrayOfDouble5[(2 - 1 + paramInt7)] = paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)];
    }
    else
    {
      paramArrayOfDouble3[(1 - 1 + paramInt5)] = (d1 * localdoubleW6.val / localdoubleW2.val / d3);
      paramArrayOfDouble4[(1 - 1 + paramInt6)] = (d1 * localdoubleW5.val / localdoubleW2.val / d3);
      paramArrayOfDouble3[(2 - 1 + paramInt5)] = paramArrayOfDouble3[(1 - 1 + paramInt5)];
      paramArrayOfDouble4[(2 - 1 + paramInt6)] = (-paramArrayOfDouble4[(1 - 1 + paramInt6)]);
      paramArrayOfDouble5[(1 - 1 + paramInt7)] = 1.0D;
      paramArrayOfDouble5[(2 - 1 + paramInt7)] = 1.0D;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlagv2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */