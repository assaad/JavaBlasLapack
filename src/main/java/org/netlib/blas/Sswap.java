package org.netlib.blas;

public final class Sswap
{
  public static void sswap(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5)
  {
    float f = 0.0F;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
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
      for (int i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        f = paramArrayOfFloat1[(j - 1 + paramInt2)];
        paramArrayOfFloat1[(j - 1 + paramInt2)] = paramArrayOfFloat2[(k - 1 + paramInt4)];
        paramArrayOfFloat2[(k - 1 + paramInt4)] = f;
        j += paramInt3;
        k += paramInt5;
        i += 1;
      }
      return;
    }
    m = paramInt1 % 3;
    if ((m != 0 ? 0 : 1) == 0)
    {
      i = 1;
      for (int i1 = m - 1 + 1; i1 > 0; i1--)
      {
        f = paramArrayOfFloat1[(i - 1 + paramInt2)];
        paramArrayOfFloat1[(i - 1 + paramInt2)] = paramArrayOfFloat2[(i - 1 + paramInt4)];
        paramArrayOfFloat2[(i - 1 + paramInt4)] = f;
        i += 1;
      }
      if ((paramInt1 >= 3 ? 0 : 1) != 0) {
        return;
      }
    }
    n = m + 1;
    i = n;
    for (int i1 = (paramInt1 - n + 3) / 3; i1 > 0; i1--)
    {
      f = paramArrayOfFloat1[(i - 1 + paramInt2)];
      paramArrayOfFloat1[(i - 1 + paramInt2)] = paramArrayOfFloat2[(i - 1 + paramInt4)];
      paramArrayOfFloat2[(i - 1 + paramInt4)] = f;
      f = paramArrayOfFloat1[(i + 1 - 1 + paramInt2)];
      paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] = paramArrayOfFloat2[(i + 1 - 1 + paramInt4)];
      paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] = f;
      f = paramArrayOfFloat1[(i + 2 - 1 + paramInt2)];
      paramArrayOfFloat1[(i + 2 - 1 + paramInt2)] = paramArrayOfFloat2[(i + 2 - 1 + paramInt4)];
      paramArrayOfFloat2[(i + 2 - 1 + paramInt4)] = f;
      i += 3;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Sswap.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */