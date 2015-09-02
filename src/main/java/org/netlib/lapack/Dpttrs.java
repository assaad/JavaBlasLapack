package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dpttrs
{
  public static void dpttrs(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, int paramInt6, intW paramintW)
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
      Xerbla.xerbla("DPTTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt2 != 1 ? 0 : 1) != 0) {
      k = 1;
    } else {
      k = Math.max(1, Ilaenv.ilaenv(1, "DPTTRS", " ", paramInt1, paramInt2, -1, -1));
    }
    if ((k < paramInt2 ? 0 : 1) != 0)
    {
      Dptts2.dptts2(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramInt6);
    }
    else
    {
      i = 1;
      for (int m = (paramInt2 - 1 + k) / k; m > 0; m--)
      {
        j = Math.min(paramInt2 - i + 1, k);
        Dptts2.dptts2(paramInt1, j, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6);
        i += k;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpttrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */