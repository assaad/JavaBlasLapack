package org.netlib.blas;

public final class Dasum
{
  public static double dasum(int paramInt1, double[] paramArrayOfDouble, int paramInt2, int paramInt3)
  {
    double d1 = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double d2 = 0.0D;
    d2 = 0.0D;
    d1 = 0.0D;
    if ((paramInt1 > 0 ? 0 : 1) == 0) {}
    if (((paramInt3 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return d2;
    }
    int n;
    if ((paramInt3 != 1 ? 0 : 1) == 0)
    {
      m = paramInt1 * paramInt3;
      i = 1;
      for (n = (m - 1 + paramInt3) / paramInt3; n > 0; n--)
      {
        d1 += Math.abs(paramArrayOfDouble[(i - 1 + paramInt2)]);
        i += paramInt3;
      }
      d2 = d1;
      return d2;
    }
    j = paramInt1 % 6;
    if ((j != 0 ? 0 : 1) == 0)
    {
      i = 1;
      for (n = j - 1 + 1; n > 0; n--)
      {
        d1 += Math.abs(paramArrayOfDouble[(i - 1 + paramInt2)]);
        i += 1;
      }
      if ((paramInt1 >= 6 ? 0 : 1) != 0) {}
    }
    else
    {
      k = j + 1;
      i = k;
      for (n = (paramInt1 - k + 6) / 6; n > 0; n--)
      {
        d1 = d1 + Math.abs(paramArrayOfDouble[(i - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble[(i + 1 - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble[(i + 2 - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble[(i + 3 - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble[(i + 4 - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble[(i + 5 - 1 + paramInt2)]);
        i += 6;
      }
    }
    d2 = d1;
    return d2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dasum.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */