package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sorg2r
{
  public static void sorg2r(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
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
      Xerbla.xerbla("SORG2R", -paramintW.val);
      return;
    }
    if ((paramInt2 > 0 ? 0 : 1) != 0) {
      return;
    }
    j = paramInt3 + 1;
    int n;
    for (int m = paramInt2 - (paramInt3 + 1) + 1; m > 0; m--)
    {
      k = 1;
      for (n = paramInt1 - 1 + 1; n > 0; n--)
      {
        paramArrayOfFloat1[(k - 1 + (j - 1) * paramInt5 + paramInt4)] = 0.0F;
        k += 1;
      }
      paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt5 + paramInt4)] = 1.0F;
      j += 1;
    }
    i = paramInt3;
    for (int m = (1 - paramInt3 + -1) / -1; m > 0; m--)
    {
      if ((i >= paramInt2 ? 0 : 1) != 0)
      {
        paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0F;
        Slarf.slarf("Left", paramInt1 - i + 1, paramInt2 - i, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt7);
      }
      if ((i >= paramInt1 ? 0 : 1) != 0) {
        Sscal.sscal(paramInt1 - i, -paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
      }
      paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = (1.0F - paramArrayOfFloat2[(i - 1 + paramInt6)]);
      k = 1;
      for (n = i - 1 - 1 + 1; n > 0; n--)
      {
        paramArrayOfFloat1[(k - 1 + (i - 1) * paramInt5 + paramInt4)] = 0.0F;
        k += 1;
      }
      i += -1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sorg2r.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */