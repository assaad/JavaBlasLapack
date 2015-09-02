package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.util.doubleW;

public final class Drscl
{
  public static void drscl(int paramInt1, double paramDouble, double[] paramArrayOfDouble, int paramInt2, int paramInt3)
  {
    int i = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    localdoubleW2.val = Dlamch.dlamch("S");
    localdoubleW1.val = (1.0D / localdoubleW2.val);
    Dlabad.dlabad(localdoubleW2, localdoubleW1);
    d1 = paramDouble;
    d3 = 1.0D;
    do
    {
      d2 = d1 * localdoubleW2.val;
      d4 = d3 / localdoubleW1.val;
      if ((Math.abs(d2) <= Math.abs(d3) ? 0 : 1) != 0) {}
      if (((d3 == 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        d5 = localdoubleW2.val;
        i = 0;
        d1 = d2;
      }
      else if ((Math.abs(d4) <= Math.abs(d1) ? 0 : 1) != 0)
      {
        d5 = localdoubleW1.val;
        i = 0;
        d3 = d4;
      }
      else
      {
        d5 = d3 / d1;
        i = 1;
      }
      Dscal.dscal(paramInt1, d5, paramArrayOfDouble, paramInt2, paramInt3);
    } while ((i ^ 0x1) != 0);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Drscl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */