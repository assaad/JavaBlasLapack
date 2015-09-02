package org.netlib.blas;

public final class Sdot
{
  public static float sdot(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5)
  {
    float f1 = 0.0F;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    float f2 = 0.0F;
    f1 = 0.0F;
    f2 = 0.0F;
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return f2;
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
        f1 += paramArrayOfFloat1[(j - 1 + paramInt2)] * paramArrayOfFloat2[(k - 1 + paramInt4)];
        j += paramInt3;
        k += paramInt5;
        i += 1;
      }
      f2 = f1;
      return f2;
    }
    m = paramInt1 % 5;
    if ((m != 0 ? 0 : 1) == 0)
    {
      i = 1;
      for (i1 = m - 1 + 1; i1 > 0; i1--)
      {
        f1 += paramArrayOfFloat1[(i - 1 + paramInt2)] * paramArrayOfFloat2[(i - 1 + paramInt4)];
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
        f1 = f1 + paramArrayOfFloat1[(i - 1 + paramInt2)] * paramArrayOfFloat2[(i - 1 + paramInt4)] + paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] * paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] + paramArrayOfFloat1[(i + 2 - 1 + paramInt2)] * paramArrayOfFloat2[(i + 2 - 1 + paramInt4)] + paramArrayOfFloat1[(i + 3 - 1 + paramInt2)] * paramArrayOfFloat2[(i + 3 - 1 + paramInt4)] + paramArrayOfFloat1[(i + 4 - 1 + paramInt2)] * paramArrayOfFloat2[(i + 4 - 1 + paramInt4)];
        i += 5;
      }
    }
    f2 = f1;
    return f2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Sdot.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */