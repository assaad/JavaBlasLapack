package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Ddot;
import org.netlib.util.doubleW;

public final class Dlapll
{
  public static void dlapll(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, doubleW paramdoubleW)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    if ((paramInt1 > 1 ? 0 : 1) != 0)
    {
      paramdoubleW.val = 0.0D;
      return;
    }
    dlarfg_adapter(paramInt1, paramArrayOfDouble1, 1 - 1 + paramInt2, paramArrayOfDouble1, 1 + paramInt3 - 1 + paramInt2, paramInt3, localdoubleW2);
    d1 = paramArrayOfDouble1[(1 - 1 + paramInt2)];
    paramArrayOfDouble1[(1 - 1 + paramInt2)] = 1.0D;
    d4 = -(localdoubleW2.val * Ddot.ddot(paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5));
    Daxpy.daxpy(paramInt1, d4, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5);
    dlarfg_adapter(paramInt1 - 1, paramArrayOfDouble2, 1 + paramInt5 - 1 + paramInt4, paramArrayOfDouble2, 1 + 2 * paramInt5 - 1 + paramInt4, paramInt5, localdoubleW2);
    d2 = paramArrayOfDouble2[(1 - 1 + paramInt4)];
    d3 = paramArrayOfDouble2[(1 + paramInt5 - 1 + paramInt4)];
    Dlas2.dlas2(d1, d2, d3, paramdoubleW, localdoubleW1);
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, doubleW paramdoubleW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble1[paramInt2]);
    Dlarfg.dlarfg(paramInt1, localdoubleW, paramArrayOfDouble2, paramInt3, paramInt4, paramdoubleW);
    paramArrayOfDouble1[paramInt2] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlapll.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */