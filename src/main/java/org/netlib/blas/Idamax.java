package org.netlib.blas;

public final class Idamax
{
  public static int idamax(int paramInt1, double[] paramArrayOfDouble, int paramInt2, int paramInt3)
  {
    double d = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    k = 0;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt3 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return k;
    }
    k = 1;
    if ((paramInt1 != 1 ? 0 : 1) != 0) {
      return k;
    }
    if ((paramInt3 != 1 ? 0 : 1) == 0)
    {
      j = 1;
      d = Math.abs(paramArrayOfDouble[(1 - 1 + paramInt2)]);
      j += paramInt3;
      i = 2;
      for (m = paramInt1 - 2 + 1; m > 0; m--)
      {
        if ((Math.abs(paramArrayOfDouble[(j - 1 + paramInt2)]) > d ? 0 : 1) == 0)
        {
          k = i;
          d = Math.abs(paramArrayOfDouble[(j - 1 + paramInt2)]);
        }
        j += paramInt3;
        i += 1;
      }
      return k;
    }
    d = Math.abs(paramArrayOfDouble[(1 - 1 + paramInt2)]);
    i = 2;
    for (int m = paramInt1 - 2 + 1; m > 0; m--)
    {
      if ((Math.abs(paramArrayOfDouble[(i - 1 + paramInt2)]) > d ? 0 : 1) == 0)
      {
        k = i;
        d = Math.abs(paramArrayOfDouble[(i - 1 + paramInt2)]);
      }
      i += 1;
    }
    return k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Idamax.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */