package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dpbsv
{
  public static void dpbsv(String paramString, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, intW paramintW)
  {
    paramintW.val = 0;
    if ((((Lsame.lsame(paramString, "U") ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt5 >= paramInt2 + 1 ? 0 : 1) != 0) {
      paramintW.val = -6;
    } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -8;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPBSV ", -paramintW.val);
      return;
    }
    Dpbtrf.dpbtrf(paramString, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0) {
      Dpbtrs.dpbtrs(paramString, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpbsv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */