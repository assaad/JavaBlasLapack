package org.netlib.arpack;

public final class Iswap
{
  public static void iswap(int paramInt1, int[] paramArrayOfInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt2, int paramInt4, int paramInt5)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt3 != 1 ? 0 : 1) != 0) {}
    if (((paramInt5 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0)
    {
      k = 1;
      m = 1;
      if ((paramInt3 >= 0 ? 0 : 1) != 0) {
        k = (-paramInt1 + 1) * paramInt3 + 1;
      }
      if ((paramInt5 >= 0 ? 0 : 1) != 0) {
        m = (-paramInt1 + 1) * paramInt5 + 1;
      }
      j = 1;
      for (int i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        i = paramArrayOfInt1[(k - 1 + paramInt2)];
        paramArrayOfInt1[(k - 1 + paramInt2)] = paramArrayOfInt2[(m - 1 + paramInt4)];
        paramArrayOfInt2[(m - 1 + paramInt4)] = i;
        k += paramInt3;
        m += paramInt5;
        j += 1;
      }
      return;
    }
    n = paramInt1 % 3;
    if ((n != 0 ? 0 : 1) == 0)
    {
      j = 1;
      for (int i2 = n - 1 + 1; i2 > 0; i2--)
      {
        i = paramArrayOfInt1[(j - 1 + paramInt2)];
        paramArrayOfInt1[(j - 1 + paramInt2)] = paramArrayOfInt2[(j - 1 + paramInt4)];
        paramArrayOfInt2[(j - 1 + paramInt4)] = i;
        j += 1;
      }
      if ((paramInt1 >= 3 ? 0 : 1) != 0) {
        return;
      }
    }
    i1 = n + 1;
    j = i1;
    for (int i2 = (paramInt1 - i1 + 3) / 3; i2 > 0; i2--)
    {
      i = paramArrayOfInt1[(j - 1 + paramInt2)];
      paramArrayOfInt1[(j - 1 + paramInt2)] = paramArrayOfInt2[(j - 1 + paramInt4)];
      paramArrayOfInt2[(j - 1 + paramInt4)] = i;
      i = paramArrayOfInt1[(j + 1 - 1 + paramInt2)];
      paramArrayOfInt1[(j + 1 - 1 + paramInt2)] = paramArrayOfInt2[(j + 1 - 1 + paramInt4)];
      paramArrayOfInt2[(j + 1 - 1 + paramInt4)] = i;
      i = paramArrayOfInt1[(j + 2 - 1 + paramInt2)];
      paramArrayOfInt1[(j + 2 - 1 + paramInt2)] = paramArrayOfInt2[(j + 2 - 1 + paramInt4)];
      paramArrayOfInt2[(j + 2 - 1 + paramInt4)] = i;
      j += 3;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Iswap.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */