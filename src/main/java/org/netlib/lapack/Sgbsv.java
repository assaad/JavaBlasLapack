package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgbsv
{
  public static void sgbsv(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, int paramInt6, int[] paramArrayOfInt, int paramInt7, float[] paramArrayOfFloat2, int paramInt8, int paramInt9, intW paramintW)
  {
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt6 >= 2 * paramInt2 + paramInt3 + 1 ? 0 : 1) != 0) {
      paramintW.val = -6;
    } else if ((paramInt9 >= Math.max(paramInt1, 1) ? 0 : 1) != 0) {
      paramintW.val = -9;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGBSV ", -paramintW.val);
      return;
    }
    Sgbtrf.sgbtrf(paramInt1, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfInt, paramInt7, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0) {
      Sgbtrs.sgbtrs("No transpose", paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfInt, paramInt7, paramArrayOfFloat2, paramInt8, paramInt9, paramintW);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgbsv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */