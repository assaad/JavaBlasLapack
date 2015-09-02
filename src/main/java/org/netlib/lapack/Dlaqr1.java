package org.netlib.lapack;

public final class Dlaqr1
{
  public static void dlaqr1(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double[] paramArrayOfDouble2, int paramInt4)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      d3 = Math.abs(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramDouble3) + Math.abs(paramDouble4) + Math.abs(paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt3 + paramInt2)]);
      if ((d3 != 0.0D ? 0 : 1) != 0)
      {
        paramArrayOfDouble2[(1 - 1 + paramInt4)] = 0.0D;
        paramArrayOfDouble2[(2 - 1 + paramInt4)] = 0.0D;
      }
      else
      {
        d1 = paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt3 + paramInt2)] / d3;
        paramArrayOfDouble2[(1 - 1 + paramInt4)] = (d1 * paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt3 + paramInt2)] + (paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramDouble1) * ((paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramDouble3) / d3) - paramDouble2 * (paramDouble4 / d3));
        paramArrayOfDouble2[(2 - 1 + paramInt4)] = (d1 * (paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] + paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt3 + paramInt2)] - paramDouble1 - paramDouble3));
      }
    }
    else
    {
      d3 = Math.abs(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramDouble3) + Math.abs(paramDouble4) + Math.abs(paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt3 + paramInt2)]) + Math.abs(paramArrayOfDouble1[(3 - 1 + (1 - 1) * paramInt3 + paramInt2)]);
      if ((d3 != 0.0D ? 0 : 1) != 0)
      {
        paramArrayOfDouble2[(1 - 1 + paramInt4)] = 0.0D;
        paramArrayOfDouble2[(2 - 1 + paramInt4)] = 0.0D;
        paramArrayOfDouble2[(3 - 1 + paramInt4)] = 0.0D;
      }
      else
      {
        d1 = paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt3 + paramInt2)] / d3;
        d2 = paramArrayOfDouble1[(3 - 1 + (1 - 1) * paramInt3 + paramInt2)] / d3;
        paramArrayOfDouble2[(1 - 1 + paramInt4)] = ((paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramDouble1) * ((paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] - paramDouble3) / d3) - paramDouble2 * (paramDouble4 / d3) + paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt3 + paramInt2)] * d1 + paramArrayOfDouble1[(1 - 1 + (3 - 1) * paramInt3 + paramInt2)] * d2);
        paramArrayOfDouble2[(2 - 1 + paramInt4)] = (d1 * (paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] + paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt3 + paramInt2)] - paramDouble1 - paramDouble3) + paramArrayOfDouble1[(2 - 1 + (3 - 1) * paramInt3 + paramInt2)] * d2);
        paramArrayOfDouble2[(3 - 1 + paramInt4)] = (d2 * (paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] + paramArrayOfDouble1[(3 - 1 + (3 - 1) * paramInt3 + paramInt2)] - paramDouble1 - paramDouble3) + d1 * paramArrayOfDouble1[(3 - 1 + (2 - 1) * paramInt3 + paramInt2)]);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqr1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */