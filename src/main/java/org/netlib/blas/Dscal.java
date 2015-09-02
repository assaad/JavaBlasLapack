package org.netlib.blas;

public final class Dscal
{
  public static void dscal(int paramInt1, double paramDouble, double[] paramArrayOfDouble, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if ((paramInt1 > 0 ? 0 : 1) == 0) {}
    if (((paramInt3 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt3 != 1 ? 0 : 1) == 0)
    {
      m = paramInt1 * paramInt3;
      i = 1;
      for (n = (m - 1 + paramInt3) / paramInt3; n > 0; n--)
      {
        paramArrayOfDouble[(i - 1 + paramInt2)] = (paramDouble * paramArrayOfDouble[(i - 1 + paramInt2)]);
        i += paramInt3;
      }
      return;
    }
    j = paramInt1 % 5;
    if ((j != 0 ? 0 : 1) == 0)
    {
      i = 1;
      for (n = j - 1 + 1; n > 0; n--)
      {
        paramArrayOfDouble[(i - 1 + paramInt2)] = (paramDouble * paramArrayOfDouble[(i - 1 + paramInt2)]);
        i += 1;
      }
      if ((paramInt1 >= 5 ? 0 : 1) != 0) {
        return;
      }
    }
    k = j + 1;
    i = k;
    for (int n = (paramInt1 - k + 5) / 5; n > 0; n--)
    {
      paramArrayOfDouble[(i - 1 + paramInt2)] = (paramDouble * paramArrayOfDouble[(i - 1 + paramInt2)]);
      paramArrayOfDouble[(i + 1 - 1 + paramInt2)] = (paramDouble * paramArrayOfDouble[(i + 1 - 1 + paramInt2)]);
      paramArrayOfDouble[(i + 2 - 1 + paramInt2)] = (paramDouble * paramArrayOfDouble[(i + 2 - 1 + paramInt2)]);
      paramArrayOfDouble[(i + 3 - 1 + paramInt2)] = (paramDouble * paramArrayOfDouble[(i + 3 - 1 + paramInt2)]);
      paramArrayOfDouble[(i + 4 - 1 + paramInt2)] = (paramDouble * paramArrayOfDouble[(i + 4 - 1 + paramInt2)]);
      i += 5;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dscal.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */