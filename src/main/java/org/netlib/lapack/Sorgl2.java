package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sorgl2
{
  public static void sorgl2(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= paramInt1 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -3;
      } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -5;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SORGL2", -paramintW.val);
      return;
    }
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    int n;
    if ((paramInt3 >= paramInt1 ? 0 : 1) != 0)
    {
      j = 1;
      for (m = paramInt2 - 1 + 1; m > 0; m--)
      {
        k = paramInt3 + 1;
        for (n = paramInt1 - (paramInt3 + 1) + 1; n > 0; n--)
        {
          paramArrayOfFloat1[(k - 1 + (j - 1) * paramInt5 + paramInt4)] = 0.0F;
          k += 1;
        }
        if ((j <= paramInt3 ? 0 : 1) != 0) {}
        if (((j > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt5 + paramInt4)] = 1.0F;
        }
        j += 1;
      }
    }
    i = paramInt3;
    for (int m = (1 - paramInt3 + -1) / -1; m > 0; m--)
    {
      if ((i >= paramInt2 ? 0 : 1) != 0)
      {
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0F;
          Slarf.slarf("Right", paramInt1 - i, paramInt2 - i + 1, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt7);
        }
        Sscal.sscal(paramInt2 - i, -paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5);
      }
      paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = (1.0F - paramArrayOfFloat2[(i - 1 + paramInt6)]);
      k = 1;
      for (n = i - 1 - 1 + 1; n > 0; n--)
      {
        paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0F;
        k += 1;
      }
      i += -1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sorgl2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */