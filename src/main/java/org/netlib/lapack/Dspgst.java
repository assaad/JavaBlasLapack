package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dspmv;
import org.netlib.blas.Dspr2;
import org.netlib.blas.Dtpmv;
import org.netlib.blas.Dtpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dspgst
{
  public static void dspgst(int paramInt1, String paramString, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPGST", -paramintW.val);
      return;
    }
    int i4;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if (bool)
      {
        m = 0;
        i = 1;
        for (i4 = paramInt2 - 1 + 1; i4 > 0; i4--)
        {
          j = m + 1;
          m += i;
          d3 = paramArrayOfDouble2[(m - 1 + paramInt4)];
          Dtpsv.dtpsv(paramString, "Transpose", "Nonunit", i, paramArrayOfDouble2, paramInt4, paramArrayOfDouble1, j - 1 + paramInt3, 1);
          Dspmv.dspmv(paramString, i - 1, -1.0D, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, j - 1 + paramInt4, 1, 1.0D, paramArrayOfDouble1, j - 1 + paramInt3, 1);
          Dscal.dscal(i - 1, 1.0D / d3, paramArrayOfDouble1, j - 1 + paramInt3, 1);
          paramArrayOfDouble1[(m - 1 + paramInt3)] = ((paramArrayOfDouble1[(m - 1 + paramInt3)] - Ddot.ddot(i - 1, paramArrayOfDouble1, j - 1 + paramInt3, 1, paramArrayOfDouble2, j - 1 + paramInt4, 1)) / d3);
          i += 1;
        }
      }
      else
      {
        i3 = 1;
        n = 1;
        for (i4 = paramInt2 - 1 + 1; i4 > 0; i4--)
        {
          i2 = i3 + paramInt2 - n + 1;
          d2 = paramArrayOfDouble1[(i3 - 1 + paramInt3)];
          d4 = paramArrayOfDouble2[(i3 - 1 + paramInt4)];
          d2 /= Math.pow(d4, 2);
          paramArrayOfDouble1[(i3 - 1 + paramInt3)] = d2;
          if ((n >= paramInt2 ? 0 : 1) != 0)
          {
            Dscal.dscal(paramInt2 - n, 1.0D / d4, paramArrayOfDouble1, i3 + 1 - 1 + paramInt3, 1);
            d5 = -(0.5D * d2);
            Daxpy.daxpy(paramInt2 - n, d5, paramArrayOfDouble2, i3 + 1 - 1 + paramInt4, 1, paramArrayOfDouble1, i3 + 1 - 1 + paramInt3, 1);
            Dspr2.dspr2(paramString, paramInt2 - n, -1.0D, paramArrayOfDouble1, i3 + 1 - 1 + paramInt3, 1, paramArrayOfDouble2, i3 + 1 - 1 + paramInt4, 1, paramArrayOfDouble1, i2 - 1 + paramInt3);
            Daxpy.daxpy(paramInt2 - n, d5, paramArrayOfDouble2, i3 + 1 - 1 + paramInt4, 1, paramArrayOfDouble1, i3 + 1 - 1 + paramInt3, 1);
            Dtpsv.dtpsv(paramString, "No transpose", "Non-unit", paramInt2 - n, paramArrayOfDouble2, i2 - 1 + paramInt4, paramArrayOfDouble1, i3 + 1 - 1 + paramInt3, 1);
          }
          i3 = i2;
          n += 1;
        }
      }
    }
    else if (bool)
    {
      i3 = 0;
      n = 1;
      for (i4 = paramInt2 - 1 + 1; i4 > 0; i4--)
      {
        i1 = i3 + 1;
        i3 += n;
        d2 = paramArrayOfDouble1[(i3 - 1 + paramInt3)];
        d4 = paramArrayOfDouble2[(i3 - 1 + paramInt4)];
        Dtpmv.dtpmv(paramString, "No transpose", "Non-unit", n - 1, paramArrayOfDouble2, paramInt4, paramArrayOfDouble1, i1 - 1 + paramInt3, 1);
        d5 = 0.5D * d2;
        Daxpy.daxpy(n - 1, d5, paramArrayOfDouble2, i1 - 1 + paramInt4, 1, paramArrayOfDouble1, i1 - 1 + paramInt3, 1);
        Dspr2.dspr2(paramString, n - 1, 1.0D, paramArrayOfDouble1, i1 - 1 + paramInt3, 1, paramArrayOfDouble2, i1 - 1 + paramInt4, 1, paramArrayOfDouble1, paramInt3);
        Daxpy.daxpy(n - 1, d5, paramArrayOfDouble2, i1 - 1 + paramInt4, 1, paramArrayOfDouble1, i1 - 1 + paramInt3, 1);
        Dscal.dscal(n - 1, d4, paramArrayOfDouble1, i1 - 1 + paramInt3, 1);
        paramArrayOfDouble1[(i3 - 1 + paramInt3)] = (d2 * Math.pow(d4, 2));
        n += 1;
      }
    }
    else
    {
      m = 1;
      i = 1;
      for (i4 = paramInt2 - 1 + 1; i4 > 0; i4--)
      {
        k = m + paramInt2 - i + 1;
        d1 = paramArrayOfDouble1[(m - 1 + paramInt3)];
        d3 = paramArrayOfDouble2[(m - 1 + paramInt4)];
        paramArrayOfDouble1[(m - 1 + paramInt3)] = (d1 * d3 + Ddot.ddot(paramInt2 - i, paramArrayOfDouble1, m + 1 - 1 + paramInt3, 1, paramArrayOfDouble2, m + 1 - 1 + paramInt4, 1));
        Dscal.dscal(paramInt2 - i, d3, paramArrayOfDouble1, m + 1 - 1 + paramInt3, 1);
        Dspmv.dspmv(paramString, paramInt2 - i, 1.0D, paramArrayOfDouble1, k - 1 + paramInt3, paramArrayOfDouble2, m + 1 - 1 + paramInt4, 1, 1.0D, paramArrayOfDouble1, m + 1 - 1 + paramInt3, 1);
        Dtpmv.dtpmv(paramString, "Transpose", "Non-unit", paramInt2 - i + 1, paramArrayOfDouble2, m - 1 + paramInt4, paramArrayOfDouble1, m - 1 + paramInt3, 1);
        m = k;
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dspgst.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */