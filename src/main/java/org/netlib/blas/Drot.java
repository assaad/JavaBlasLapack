package org.netlib.blas;

public final class Drot
{
  public static void drot(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double paramDouble1, double paramDouble2)
  {
    double d = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt3 != 1 ? 0 : 1) != 0) {}
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
      for (int m = paramInt1 - 1 + 1; m > 0; m--)
      {
        d = paramDouble1 * paramArrayOfDouble1[(j - 1 + paramInt2)] + paramDouble2 * paramArrayOfDouble2[(k - 1 + paramInt4)];
        paramArrayOfDouble2[(k - 1 + paramInt4)] = (paramDouble1 * paramArrayOfDouble2[(k - 1 + paramInt4)] - paramDouble2 * paramArrayOfDouble1[(j - 1 + paramInt2)]);
        paramArrayOfDouble1[(j - 1 + paramInt2)] = d;
        j += paramInt3;
        k += paramInt5;
        i += 1;
      }
      return;
    }
    i = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      d = paramDouble1 * paramArrayOfDouble1[(i - 1 + paramInt2)] + paramDouble2 * paramArrayOfDouble2[(i - 1 + paramInt4)];
      paramArrayOfDouble2[(i - 1 + paramInt4)] = (paramDouble1 * paramArrayOfDouble2[(i - 1 + paramInt4)] - paramDouble2 * paramArrayOfDouble1[(i - 1 + paramInt2)]);
      paramArrayOfDouble1[(i - 1 + paramInt2)] = d;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Drot.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */