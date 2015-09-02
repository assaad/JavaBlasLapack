package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dorg2r
{
  public static void dorg2r(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, intW paramintW)
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
      Xerbla.xerbla("DORG2R", -paramintW.val);
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
        paramArrayOfDouble1[(k - 1 + (j - 1) * paramInt5 + paramInt4)] = 0.0D;
        k += 1;
      }
      paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt5 + paramInt4)] = 1.0D;
      j += 1;
    }
    i = paramInt3;
    for (m = (1 - paramInt3 + -1) / -1; m > 0; m--)
    {
      if ((i >= paramInt2 ? 0 : 1) != 0)
      {
        paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0D;
        Dlarf.dlarf("Left", paramInt1 - i + 1, paramInt2 - i, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2[(i - 1 + paramInt6)], paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt7);
      }
      if ((i >= paramInt1 ? 0 : 1) != 0) {
        Dscal.dscal(paramInt1 - i, -paramArrayOfDouble2[(i - 1 + paramInt6)], paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
      }
      paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = (1.0D - paramArrayOfDouble2[(i - 1 + paramInt6)]);
      k = 1;
      for (n = i - 1 - 1 + 1; n > 0; n--)
      {
        paramArrayOfDouble1[(k - 1 + (i - 1) * paramInt5 + paramInt4)] = 0.0D;
        k += 1;
      }
      i += -1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dorg2r.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */