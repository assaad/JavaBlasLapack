package org.netlib.blas;

public final class Srot
{
  public static void srot(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2)
  {
    float f = 0.0F;
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
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        f = paramFloat1 * paramArrayOfFloat1[(j - 1 + paramInt2)] + paramFloat2 * paramArrayOfFloat2[(k - 1 + paramInt4)];
        paramArrayOfFloat2[(k - 1 + paramInt4)] = (paramFloat1 * paramArrayOfFloat2[(k - 1 + paramInt4)] - paramFloat2 * paramArrayOfFloat1[(j - 1 + paramInt2)]);
        paramArrayOfFloat1[(j - 1 + paramInt2)] = f;
        j += paramInt3;
        k += paramInt5;
        i += 1;
      }
      return;
    }
    i = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      f = paramFloat1 * paramArrayOfFloat1[(i - 1 + paramInt2)] + paramFloat2 * paramArrayOfFloat2[(i - 1 + paramInt4)];
      paramArrayOfFloat2[(i - 1 + paramInt4)] = (paramFloat1 * paramArrayOfFloat2[(i - 1 + paramInt4)] - paramFloat2 * paramArrayOfFloat1[(i - 1 + paramInt2)]);
      paramArrayOfFloat1[(i - 1 + paramInt2)] = f;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Srot.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */