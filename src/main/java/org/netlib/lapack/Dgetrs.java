package org.netlib.lapack;

import org.netlib.blas.Dtrsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dgetrs
{
  public static void dgetrs(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, intW paramintW)
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
      Xerbla.xerbla("DGETRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if (bool)
    {
      Dlaswp.dlaswp(paramInt2, paramArrayOfDouble2, paramInt6, paramInt7, 1, paramInt1, paramArrayOfInt, paramInt5, 1);
      Dtrsm.dtrsm("Left", "Lower", "No transpose", "Unit", paramInt1, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt6, paramInt7);
      Dtrsm.dtrsm("Left", "Upper", "No transpose", "Non-unit", paramInt1, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt6, paramInt7);
    }
    else
    {
      Dtrsm.dtrsm("Left", "Upper", "Transpose", "Non-unit", paramInt1, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt6, paramInt7);
      Dtrsm.dtrsm("Left", "Lower", "Transpose", "Unit", paramInt1, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt6, paramInt7);
      Dlaswp.dlaswp(paramInt2, paramArrayOfDouble2, paramInt6, paramInt7, 1, paramInt1, paramArrayOfInt, paramInt5, -1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgetrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */