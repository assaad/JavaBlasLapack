package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.blas.Dsyr;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dpbtf2
{
  public static void dpbtf2(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble, int paramInt3, int paramInt4, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    double d = 0.0D;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= paramInt2 + 1 ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPBTF2", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    j = Math.max(1, paramInt4 - 1);
    int m;
    if (bool)
    {
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        d = paramArrayOfDouble[(paramInt2 + 1 - 1 + (i - 1) * paramInt4 + paramInt3)];
        if ((d > 0.0D ? 0 : 1) != 0) {
          break;
        }
        d = Math.sqrt(d);
        paramArrayOfDouble[(paramInt2 + 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = d;
        k = Math.min(paramInt2, paramInt1 - i);
        if ((k <= 0 ? 0 : 1) != 0)
        {
          Dscal.dscal(k, 1.0D / d, paramArrayOfDouble, paramInt2 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, j);
          Dsyr.dsyr("Upper", k, -1.0D, paramArrayOfDouble, paramInt2 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, j, paramArrayOfDouble, paramInt2 + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, j);
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        d = paramArrayOfDouble[(1 - 1 + (i - 1) * paramInt4 + paramInt3)];
        if ((d > 0.0D ? 0 : 1) != 0) {
          break;
        }
        d = Math.sqrt(d);
        paramArrayOfDouble[(1 - 1 + (i - 1) * paramInt4 + paramInt3)] = d;
        k = Math.min(paramInt2, paramInt1 - i);
        if ((k <= 0 ? 0 : 1) != 0)
        {
          Dscal.dscal(k, 1.0D / d, paramArrayOfDouble, 2 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
          Dsyr.dsyr("Lower", k, -1.0D, paramArrayOfDouble, 2 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble, 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, j);
        }
        i += 1;
      }
    }
    return;
    paramintW.val = i;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpbtf2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */