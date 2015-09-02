package org.netlib.lapack;

import org.netlib.blas.Dtrsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dpotrs
{
  public static void dpotrs(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -7;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPOTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if (bool)
    {
      Dtrsm.dtrsm("Left", "Upper", "Transpose", "Non-unit", paramInt1, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6);
      Dtrsm.dtrsm("Left", "Upper", "No transpose", "Non-unit", paramInt1, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6);
    }
    else
    {
      Dtrsm.dtrsm("Left", "Lower", "No transpose", "Non-unit", paramInt1, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6);
      Dtrsm.dtrsm("Left", "Lower", "Transpose", "Non-unit", paramInt1, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpotrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */