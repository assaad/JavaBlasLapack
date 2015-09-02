package org.netlib.blas;

public final class Dnrm2
{
  public static double dnrm2(int paramInt1, double[] paramArrayOfDouble, int paramInt2, int paramInt3)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    int i = 0;
    double d5 = 0.0D;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt3 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      d2 = 0.0D;
    }
    else if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      d2 = Math.abs(paramArrayOfDouble[(1 - 1 + paramInt2)]);
    }
    else
    {
      d3 = 0.0D;
      d4 = 1.0D;
      i = 1;
      for (int j = (1 + (paramInt1 - 1) * paramInt3 - 1 + paramInt3) / paramInt3; j > 0; j--)
      {
        if ((paramArrayOfDouble[(i - 1 + paramInt2)] == 0.0D ? 0 : 1) != 0)
        {
          d1 = Math.abs(paramArrayOfDouble[(i - 1 + paramInt2)]);
          if ((d3 >= d1 ? 0 : 1) != 0)
          {
            d4 = 1.0D + d4 * Math.pow(d3 / d1, 2);
            d3 = d1;
          }
          else
          {
            d4 += Math.pow(d1 / d3, 2);
          }
        }
        i += paramInt3;
      }
      d2 = d3 * Math.sqrt(d4);
    }
    d5 = d2;
    return d5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dnrm2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */