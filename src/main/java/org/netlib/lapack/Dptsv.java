package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dptsv
{
  public static void dptsv(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, int paramInt6, intW paramintW)
  {
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
      Xerbla.xerbla("DPTSV ", -paramintW.val);
      return;
    }
    Dpttrf.dpttrf(paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0) {
      Dpttrs.dpttrs(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramInt6, paramintW);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dptsv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */