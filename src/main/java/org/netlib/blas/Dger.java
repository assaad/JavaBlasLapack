package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dger
{
  public static void dger(int paramInt1, int paramInt2, double paramDouble, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8)
  {
    double d = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    j = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      j = 1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      j = 2;
    } else if ((paramInt4 != 0 ? 0 : 1) != 0) {
      j = 5;
    } else if ((paramInt6 != 0 ? 0 : 1) != 0) {
      j = 7;
    } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      j = 9;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGER  ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((paramDouble != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt6 <= 0 ? 0 : 1) != 0) {
      n = 1;
    } else {
      n = 1 - (paramInt2 - 1) * paramInt6;
    }
    int i2;
    int i3;
    if ((paramInt4 != 1 ? 0 : 1) != 0)
    {
      m = 1;
      for (i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
      {
        if ((paramArrayOfDouble2[(n - 1 + paramInt5)] == 0.0D ? 0 : 1) != 0)
        {
          d = paramDouble * paramArrayOfDouble2[(n - 1 + paramInt5)];
          i = 1;
          for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
          {
            paramArrayOfDouble3[(i - 1 + (m - 1) * paramInt8 + paramInt7)] += paramArrayOfDouble1[(i - 1 + paramInt3)] * d;
            i += 1;
          }
        }
        n += paramInt6;
        m += 1;
      }
    }
    else
    {
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        i1 = 1;
      } else {
        i1 = 1 - (paramInt1 - 1) * paramInt4;
      }
      m = 1;
      for (i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
      {
        if ((paramArrayOfDouble2[(n - 1 + paramInt5)] == 0.0D ? 0 : 1) != 0)
        {
          d = paramDouble * paramArrayOfDouble2[(n - 1 + paramInt5)];
          k = i1;
          i = 1;
          for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
          {
            paramArrayOfDouble3[(i - 1 + (m - 1) * paramInt8 + paramInt7)] += paramArrayOfDouble1[(k - 1 + paramInt3)] * d;
            k += paramInt4;
            i += 1;
          }
        }
        n += paramInt6;
        m += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dger.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */