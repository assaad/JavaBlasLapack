package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sppsv
{
  public static void sppsv(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, intW paramintW)
  {
    paramintW.val = 0;
    if ((((Lsame.lsame(paramString, "U") ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPPSV ", -paramintW.val);
      return;
    }
    Spptrf.spptrf(paramString, paramInt1, paramArrayOfFloat1, paramInt3, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0) {
      Spptrs.spptrs(paramString, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5, paramintW);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sppsv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */