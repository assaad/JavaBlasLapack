package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlasd5
{
  public static void dlasd5(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, double paramDouble, doubleW paramdoubleW, double[] paramArrayOfDouble4, int paramInt5)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    d3 = paramArrayOfDouble1[(2 - 1 + paramInt2)] - paramArrayOfDouble1[(1 - 1 + paramInt2)];
    d4 = d3 * (paramArrayOfDouble1[(2 - 1 + paramInt2)] + paramArrayOfDouble1[(1 - 1 + paramInt2)]);
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      d6 = 1.0D + 4.0D * paramDouble * (paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)] / (paramArrayOfDouble1[(1 - 1 + paramInt2)] + 3.0D * paramArrayOfDouble1[(2 - 1 + paramInt2)]) - paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble2[(1 - 1 + paramInt3)] / (3.0D * paramArrayOfDouble1[(1 - 1 + paramInt2)] + paramArrayOfDouble1[(2 - 1 + paramInt2)])) / d3;
      if ((d6 <= 0.0D ? 0 : 1) != 0)
      {
        d1 = d4 + paramDouble * (paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble2[(1 - 1 + paramInt3)] + paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)]);
        d2 = paramDouble * paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble2[(1 - 1 + paramInt3)] * d4;
        d5 = 2.0D * d2 / (d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2)));
        d5 /= (paramArrayOfDouble1[(1 - 1 + paramInt2)] + Math.sqrt(paramArrayOfDouble1[(1 - 1 + paramInt2)] * paramArrayOfDouble1[(1 - 1 + paramInt2)] + d5));
        paramdoubleW.val = (paramArrayOfDouble1[(1 - 1 + paramInt2)] + d5);
        paramArrayOfDouble3[(1 - 1 + paramInt4)] = (-d5);
        paramArrayOfDouble3[(2 - 1 + paramInt4)] = (d3 - d5);
        paramArrayOfDouble4[(1 - 1 + paramInt5)] = (2.0D * paramArrayOfDouble1[(1 - 1 + paramInt2)] + d5);
        paramArrayOfDouble4[(2 - 1 + paramInt5)] = (paramArrayOfDouble1[(1 - 1 + paramInt2)] + d5 + paramArrayOfDouble1[(2 - 1 + paramInt2)]);
      }
      else
      {
        d1 = -d4 + paramDouble * (paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble2[(1 - 1 + paramInt3)] + paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)]);
        d2 = paramDouble * paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)] * d4;
        if ((d1 <= 0.0D ? 0 : 1) != 0) {
          d5 = -(2.0D * d2 / (d1 + Math.sqrt(d1 * d1 + 4.0D * d2)));
        } else {
          d5 = (d1 - Math.sqrt(d1 * d1 + 4.0D * d2)) / 2.0D;
        }
        d5 /= (paramArrayOfDouble1[(2 - 1 + paramInt2)] + Math.sqrt(Math.abs(paramArrayOfDouble1[(2 - 1 + paramInt2)] * paramArrayOfDouble1[(2 - 1 + paramInt2)] + d5)));
        paramdoubleW.val = (paramArrayOfDouble1[(2 - 1 + paramInt2)] + d5);
        paramArrayOfDouble3[(1 - 1 + paramInt4)] = (-(d3 + d5));
        paramArrayOfDouble3[(2 - 1 + paramInt4)] = (-d5);
        paramArrayOfDouble4[(1 - 1 + paramInt5)] = (paramArrayOfDouble1[(1 - 1 + paramInt2)] + d5 + paramArrayOfDouble1[(2 - 1 + paramInt2)]);
        paramArrayOfDouble4[(2 - 1 + paramInt5)] = (2.0D * paramArrayOfDouble1[(2 - 1 + paramInt2)] + d5);
      }
    }
    else
    {
      d1 = -d4 + paramDouble * (paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble2[(1 - 1 + paramInt3)] + paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)]);
      d2 = paramDouble * paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble2[(2 - 1 + paramInt3)] * d4;
      if ((d1 <= 0.0D ? 0 : 1) != 0) {
        d5 = (d1 + Math.sqrt(d1 * d1 + 4.0D * d2)) / 2.0D;
      } else {
        d5 = 2.0D * d2 / (-d1 + Math.sqrt(d1 * d1 + 4.0D * d2));
      }
      d5 /= (paramArrayOfDouble1[(2 - 1 + paramInt2)] + Math.sqrt(paramArrayOfDouble1[(2 - 1 + paramInt2)] * paramArrayOfDouble1[(2 - 1 + paramInt2)] + d5));
      paramdoubleW.val = (paramArrayOfDouble1[(2 - 1 + paramInt2)] + d5);
      paramArrayOfDouble3[(1 - 1 + paramInt4)] = (-(d3 + d5));
      paramArrayOfDouble3[(2 - 1 + paramInt4)] = (-d5);
      paramArrayOfDouble4[(1 - 1 + paramInt5)] = (paramArrayOfDouble1[(1 - 1 + paramInt2)] + d5 + paramArrayOfDouble1[(2 - 1 + paramInt2)]);
      paramArrayOfDouble4[(2 - 1 + paramInt5)] = (2.0D * paramArrayOfDouble1[(2 - 1 + paramInt2)] + d5);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasd5.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */