package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spttrs
{
  public static void spttrs(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, int paramInt6, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPTTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt2 != 1 ? 0 : 1) != 0) {
      k = 1;
    } else {
      k = Math.max(1, Ilaenv.ilaenv(1, "SPTTRS", " ", paramInt1, paramInt2, -1, -1));
    }
    if ((k < paramInt2 ? 0 : 1) != 0)
    {
      Sptts2.sptts2(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramInt6);
    }
    else
    {
      i = 1;
      for (int m = (paramInt2 - 1 + k) / k; m > 0; m--)
      {
        j = Math.min(paramInt2 - i + 1, k);
        Sptts2.sptts2(paramInt1, j, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6);
        i += k;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spttrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */