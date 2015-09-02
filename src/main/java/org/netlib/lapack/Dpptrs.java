package org.netlib.lapack;

import org.netlib.blas.Dtpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dpptrs
{
  public static void dpptrs(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
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
      Xerbla.xerbla("DPPTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    int j;
    if (bool)
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        Dtpsv.dtpsv("Upper", "Transpose", "Non-unit", paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        Dtpsv.dtpsv("Upper", "No transpose", "Non-unit", paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        Dtpsv.dtpsv("Lower", "No transpose", "Non-unit", paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        Dtpsv.dtpsv("Lower", "Transpose", "Non-unit", paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpptrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */