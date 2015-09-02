package org.netlib.lapack;

import org.netlib.blas.Strsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgetrs
{
  public static void sgetrs(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, intW paramintW)
  {
    boolean bool = false;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "N");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "T") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "C") ^ true) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -8;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGETRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if (bool)
    {
      Slaswp.slaswp(paramInt2, paramArrayOfFloat2, paramInt6, paramInt7, 1, paramInt1, paramArrayOfInt, paramInt5, 1);
      Strsm.strsm("Left", "Lower", "No transpose", "Unit", paramInt1, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt6, paramInt7);
      Strsm.strsm("Left", "Upper", "No transpose", "Non-unit", paramInt1, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt6, paramInt7);
    }
    else
    {
      Strsm.strsm("Left", "Upper", "Transpose", "Non-unit", paramInt1, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt6, paramInt7);
      Strsm.strsm("Left", "Lower", "Transpose", "Unit", paramInt1, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt6, paramInt7);
      Slaswp.slaswp(paramInt2, paramArrayOfFloat2, paramInt6, paramInt7, 1, paramInt1, paramArrayOfInt, paramInt5, -1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgetrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */