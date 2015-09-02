package org.netlib.lapack;

import org.netlib.blas.Sscal;

public final class Sptts2
{
  public static void sptts2(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, int paramInt6)
  {
    int i = 0;
    int j = 0;
    if ((paramInt1 > 1 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 1 ? 0 : 1) != 0) {
        Sscal.sscal(paramInt2, 1.0F / paramArrayOfFloat1[(1 - 1 + paramInt3)], paramArrayOfFloat3, paramInt5, paramInt6);
      }
      return;
    }
    j = 1;
    for (int k = paramInt2 - 1 + 1; k > 0; k--)
    {
      i = 2;
      for (int m = paramInt1 - 2 + 1; m > 0; m--)
      {
        paramArrayOfFloat3[(i - 1 + (j - 1) * paramInt6 + paramInt5)] -= paramArrayOfFloat3[(i - 1 - 1 + (j - 1) * paramInt6 + paramInt5)] * paramArrayOfFloat2[(i - 1 - 1 + paramInt4)];
        i += 1;
      }
      paramArrayOfFloat3[(paramInt1 - 1 + (j - 1) * paramInt6 + paramInt5)] /= paramArrayOfFloat1[(paramInt1 - 1 + paramInt3)];
      i = paramInt1 - 1;
      for (m = (1 - (paramInt1 - 1) + -1) / -1; m > 0; m--)
      {
        paramArrayOfFloat3[(i - 1 + (j - 1) * paramInt6 + paramInt5)] = (paramArrayOfFloat3[(i - 1 + (j - 1) * paramInt6 + paramInt5)] / paramArrayOfFloat1[(i - 1 + paramInt3)] - paramArrayOfFloat3[(i + 1 - 1 + (j - 1) * paramInt6 + paramInt5)] * paramArrayOfFloat2[(i - 1 + paramInt4)]);
        i += -1;
      }
      j += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sptts2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */