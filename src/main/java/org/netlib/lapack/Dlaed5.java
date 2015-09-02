package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlaed5
{
  public static void dlaed5(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, double paramDouble, doubleW paramdoubleW)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    d3 = paramArrayOfDouble1[(2 - 1 + paramInt2)] - paramArrayOfDouble1[(1 - 1 + paramInt2)];
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      d6 = 1.0D + 2.0D * paramDouble * (paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)] - paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble2[(1 - 1 + paramInt3)]) / d3;
      if ((d6 <= 0.0D ? 0 : 1) != 0)
      {
        d1 = d3 + paramDouble * (paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble2[(1 - 1 + paramInt3)] + paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)]);
        d2 = paramDouble * paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble2[(1 - 1 + paramInt3)] * d3;
        d4 = 2.0D * d2 / (d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2)));
        paramdoubleW.val = (paramArrayOfDouble1[(1 - 1 + paramInt2)] + d4);
        paramArrayOfDouble3[(1 - 1 + paramInt4)] = (-(paramArrayOfDouble2[(1 - 1 + paramInt3)] / d4));
        paramArrayOfDouble2[(2 - 1 + paramInt3)] /= (d3 - d4);
      }
      else
      {
        d1 = -d3 + paramDouble * (paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble2[(1 - 1 + paramInt3)] + paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)]);
        d2 = paramDouble * paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)] * d3;
        if ((d1 <= 0.0D ? 0 : 1) != 0) {
          d4 = -(2.0D * d2 / (d1 + Math.sqrt(d1 * d1 + 4.0D * d2)));
        } else {
          d4 = (d1 - Math.sqrt(d1 * d1 + 4.0D * d2)) / 2.0D;
        }
        paramdoubleW.val = (paramArrayOfDouble1[(2 - 1 + paramInt2)] + d4);
        paramArrayOfDouble3[(1 - 1 + paramInt4)] = (-(paramArrayOfDouble2[(1 - 1 + paramInt3)] / (d3 + d4)));
        paramArrayOfDouble3[(2 - 1 + paramInt4)] = (-(paramArrayOfDouble2[(2 - 1 + paramInt3)] / d4));
      }
      d5 = Math.sqrt(paramArrayOfDouble3[(1 - 1 + paramInt4)] * paramArrayOfDouble3[(1 - 1 + paramInt4)] + paramArrayOfDouble3[(2 - 1 + paramInt4)] * paramArrayOfDouble3[(2 - 1 + paramInt4)]);
      paramArrayOfDouble3[(1 - 1 + paramInt4)] /= d5;
      paramArrayOfDouble3[(2 - 1 + paramInt4)] /= d5;
    }
    else
    {
      d1 = -d3 + paramDouble * (paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble2[(1 - 1 + paramInt3)] + paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)]);
      d2 = paramDouble * paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)] * d3;
      if ((d1 <= 0.0D ? 0 : 1) != 0) {
        d4 = (d1 + Math.sqrt(d1 * d1 + 4.0D * d2)) / 2.0D;
      } else {
        d4 = 2.0D * d2 / (-d1 + Math.sqrt(d1 * d1 + 4.0D * d2));
      }
      paramdoubleW.val = (paramArrayOfDouble1[(2 - 1 + paramInt2)] + d4);
      paramArrayOfDouble3[(1 - 1 + paramInt4)] = (-(paramArrayOfDouble2[(1 - 1 + paramInt3)] / (d3 + d4)));
      paramArrayOfDouble3[(2 - 1 + paramInt4)] = (-(paramArrayOfDouble2[(2 - 1 + paramInt3)] / d4));
      d5 = Math.sqrt(paramArrayOfDouble3[(1 - 1 + paramInt4)] * paramArrayOfDouble3[(1 - 1 + paramInt4)] + paramArrayOfDouble3[(2 - 1 + paramInt4)] * paramArrayOfDouble3[(2 - 1 + paramInt4)]);
      paramArrayOfDouble3[(1 - 1 + paramInt4)] /= d5;
      paramArrayOfDouble3[(2 - 1 + paramInt4)] /= d5;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaed5.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */