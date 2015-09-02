package org.netlib.lapack;

import org.netlib.blas.Ddot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dspr;
import org.netlib.blas.Dtpmv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dpptri
{
  public static void dpptri(String paramString, int paramInt1, double[] paramArrayOfDouble, int paramInt2, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
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
      Xerbla.xerbla("DPPTRI", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    Dtptri.dtptri(paramString, "Non-unit", paramInt1, paramArrayOfDouble, paramInt2, paramintW);
    if ((paramintW.val <= 0 ? 0 : 1) != 0) {
      return;
    }
    int n;
    if (bool)
    {
      k = 0;
      i = 1;
      for (n = paramInt1 - 1 + 1; n > 0; n--)
      {
        j = k + 1;
        k += i;
        if ((i <= 1 ? 0 : 1) != 0) {
          Dspr.dspr("Upper", i - 1, 1.0D, paramArrayOfDouble, j - 1 + paramInt2, 1, paramArrayOfDouble, paramInt2);
        }
        d = paramArrayOfDouble[(k - 1 + paramInt2)];
        Dscal.dscal(i, d, paramArrayOfDouble, j - 1 + paramInt2, 1);
        i += 1;
      }
    }
    else
    {
      k = 1;
      i = 1;
      for (n = paramInt1 - 1 + 1; n > 0; n--)
      {
        m = k + paramInt1 - i + 1;
        paramArrayOfDouble[(k - 1 + paramInt2)] = Ddot.ddot(paramInt1 - i + 1, paramArrayOfDouble, k - 1 + paramInt2, 1, paramArrayOfDouble, k - 1 + paramInt2, 1);
        if ((i >= paramInt1 ? 0 : 1) != 0) {
          Dtpmv.dtpmv("Lower", "Transpose", "Non-unit", paramInt1 - i, paramArrayOfDouble, m - 1 + paramInt2, paramArrayOfDouble, k + 1 - 1 + paramInt2, 1);
        }
        k = m;
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpptri.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */