package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgesv
{
  public static void sgesv(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, intW paramintW)
  {
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -7;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGESV ", -paramintW.val);
      return;
    }
    Sgetrf.sgetrf(paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfInt, paramInt5, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0) {
      Sgetrs.sgetrs("No transpose", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfInt, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramintW);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgesv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */