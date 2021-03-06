package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sorg2l
{
  public static void sorg2l(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt2 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt2 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
      }
      else
      {
        if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
        if (((paramInt3 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW.val = -3;
        } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -5;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SORG2L", -paramintW.val);
      return;
    }
    if ((paramInt2 > 0 ? 0 : 1) != 0) {
      return;
    }
    k = 1;
    int i1;
    for (int n = paramInt2 - paramInt3 - 1 + 1; n > 0; n--)
    {
      m = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        paramArrayOfFloat1[(m - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0F;
        m += 1;
      }
      paramArrayOfFloat1[(paramInt1 - paramInt2 + k - 1 + (k - 1) * paramInt5 + paramInt4)] = 1.0F;
      k += 1;
    }
    i = 1;
    for (n = paramInt3 - 1 + 1; n > 0; n--)
    {
      j = paramInt2 - paramInt3 + i;
      paramArrayOfFloat1[(paramInt1 - paramInt2 + j - 1 + (j - 1) * paramInt5 + paramInt4)] = 1.0F;
      Slarf.slarf("Left", paramInt1 - paramInt2 + j, j - 1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt7);
      Sscal.sscal(paramInt1 - paramInt2 + j - 1, -paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt5 + paramInt4, 1);
      paramArrayOfFloat1[(paramInt1 - paramInt2 + j - 1 + (j - 1) * paramInt5 + paramInt4)] = (1.0F - paramArrayOfFloat2[(i - 1 + paramInt6)]);
      m = paramInt1 - paramInt2 + j + 1;
      for (i1 = paramInt1 - (paramInt1 - paramInt2 + j + 1) + 1; i1 > 0; i1--)
      {
        paramArrayOfFloat1[(m - 1 + (j - 1) * paramInt5 + paramInt4)] = 0.0F;
        m += 1;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sorg2l.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */