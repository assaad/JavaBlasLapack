package org.netlib.lapack;

import org.netlib.blas.Ddot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dspr;
import org.netlib.blas.Dtpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dpptrf
{
  public static void dpptrf(String paramString, int paramInt1, double[] paramArrayOfDouble, int paramInt2, intW paramintW)
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
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPPTRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int m;
    if (bool)
    {
      k = 0;
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        j = k + 1;
        k += i;
        if ((i <= 1 ? 0 : 1) != 0) {
          Dtpsv.dtpsv("Upper", "Transpose", "Non-unit", i - 1, paramArrayOfDouble, paramInt2, paramArrayOfDouble, j - 1 + paramInt2, 1);
        }
        d = paramArrayOfDouble[(k - 1 + paramInt2)] - Ddot.ddot(i - 1, paramArrayOfDouble, j - 1 + paramInt2, 1, paramArrayOfDouble, j - 1 + paramInt2, 1);
        if ((d > 0.0D ? 0 : 1) != 0)
        {
          paramArrayOfDouble[(k - 1 + paramInt2)] = d;
          break;
        }
        paramArrayOfDouble[(k - 1 + paramInt2)] = Math.sqrt(d);
        i += 1;
      }
    }
    else
    {
      k = 1;
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        d = paramArrayOfDouble[(k - 1 + paramInt2)];
        if ((d > 0.0D ? 0 : 1) != 0)
        {
          paramArrayOfDouble[(k - 1 + paramInt2)] = d;
          break;
        }
        d = Math.sqrt(d);
        paramArrayOfDouble[(k - 1 + paramInt2)] = d;
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          Dscal.dscal(paramInt1 - i, 1.0D / d, paramArrayOfDouble, k + 1 - 1 + paramInt2, 1);
          Dspr.dspr("Lower", paramInt1 - i, -1.0D, paramArrayOfDouble, k + 1 - 1 + paramInt2, 1, paramArrayOfDouble, k + paramInt1 - i + 1 - 1 + paramInt2);
          k = k + paramInt1 - i + 1;
        }
        i += 1;
      }
    }
    return;
    paramintW.val = i;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpptrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */