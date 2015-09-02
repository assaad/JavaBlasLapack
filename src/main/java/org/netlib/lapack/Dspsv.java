package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dspsv
{
  public static void dspsv(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int[] paramArrayOfInt, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, intW paramintW)
  {
    paramintW.val = 0;
    if ((((Lsame.lsame(paramString, "U") ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -7;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPSV ", -paramintW.val);
      return;
    }
    Dsptrf.dsptrf(paramString, paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfInt, paramInt4, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0) {
      Dsptrs.dsptrs(paramString, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfInt, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6, paramintW);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dspsv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */