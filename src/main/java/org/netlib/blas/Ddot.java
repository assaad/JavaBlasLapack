package org.netlib.blas;

public final class Ddot
{
  public static double ddot(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5)
  {
    double d1 = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    double d2 = 0.0D;
    d2 = 0.0D;
    d1 = 0.0D;
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return d2;
    }
    if ((paramInt3 != 1 ? 0 : 1) != 0) {}
    int i1;
    if (((paramInt5 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0)
    {
      j = 1;
      k = 1;
      if ((paramInt3 >= 0 ? 0 : 1) != 0) {
        j = (-paramInt1 + 1) * paramInt3 + 1;
      }
      if ((paramInt5 >= 0 ? 0 : 1) != 0) {
        k = (-paramInt1 + 1) * paramInt5 + 1;
      }
      i = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        d1 += paramArrayOfDouble1[(j - 1 + paramInt2)] * paramArrayOfDouble2[(k - 1 + paramInt4)];
        j += paramInt3;
        k += paramInt5;
        i += 1;
      }
      d2 = d1;
      return d2;
    }
    m = paramInt1 % 5;
    if ((m != 0 ? 0 : 1) == 0)
    {
      i = 1;
      for (i1 = m - 1 + 1; i1 > 0; i1--)
      {
        d1 += paramArrayOfDouble1[(i - 1 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt4)];
        i += 1;
      }
      if ((paramInt1 >= 5 ? 0 : 1) != 0) {}
    }
    else
    {
      n = m + 1;
      i = n;
      for (i1 = (paramInt1 - n + 5) / 5; i1 > 0; i1--)
      {
        d1 = d1 + paramArrayOfDouble1[(i - 1 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt4)] + paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] * paramArrayOfDouble2[(i + 1 - 1 + paramInt4)] + paramArrayOfDouble1[(i + 2 - 1 + paramInt2)] * paramArrayOfDouble2[(i + 2 - 1 + paramInt4)] + paramArrayOfDouble1[(i + 3 - 1 + paramInt2)] * paramArrayOfDouble2[(i + 3 - 1 + paramInt4)] + paramArrayOfDouble1[(i + 4 - 1 + paramInt2)] * paramArrayOfDouble2[(i + 4 - 1 + paramInt4)];
        i += 5;
      }
    }
    d2 = d1;
    return d2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Ddot.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */