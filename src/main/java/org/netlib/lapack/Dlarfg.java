package org.netlib.lapack;

import org.netlib.blas.Dnrm2;
import org.netlib.blas.Dscal;
import org.netlib.util.Util;
import org.netlib.util.doubleW;

public final class Dlarfg
{
  public static void dlarfg(int paramInt1, doubleW paramdoubleW1, double[] paramArrayOfDouble, int paramInt2, int paramInt3, doubleW paramdoubleW2)
  {
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    if ((paramInt1 > 1 ? 0 : 1) != 0)
    {
      paramdoubleW2.val = 0.0D;
      return;
    }
    d4 = Dnrm2.dnrm2(paramInt1 - 1, paramArrayOfDouble, paramInt2, paramInt3);
    if ((d4 != 0.0D ? 0 : 1) != 0)
    {
      paramdoubleW2.val = 0.0D;
    }
    else
    {
      d1 = -Util.dsign(Dlapy2.dlapy2(paramdoubleW1.val, d4), paramdoubleW1.val);
      d3 = Dlamch.dlamch("S") / Dlamch.dlamch("E");
      if ((Math.abs(d1) >= d3 ? 0 : 1) != 0)
      {
        d2 = 1.0D / d3;
        j = 0;
        do
        {
          j += 1;
          Dscal.dscal(paramInt1 - 1, d2, paramArrayOfDouble, paramInt2, paramInt3);
          d1 *= d2;
          paramdoubleW1.val *= d2;
        } while ((Math.abs(d1) >= d3 ? 0 : 1) != 0);
        d4 = Dnrm2.dnrm2(paramInt1 - 1, paramArrayOfDouble, paramInt2, paramInt3);
        d1 = -Util.dsign(Dlapy2.dlapy2(paramdoubleW1.val, d4), paramdoubleW1.val);
        paramdoubleW2.val = ((d1 - paramdoubleW1.val) / d1);
        Dscal.dscal(paramInt1 - 1, 1.0D / (paramdoubleW1.val - d1), paramArrayOfDouble, paramInt2, paramInt3);
        paramdoubleW1.val = d1;
        i = 1;
        for (int k = j - 1 + 1; k > 0; k--)
        {
          paramdoubleW1.val *= d3;
          i += 1;
        }
      }
      else
      {
        paramdoubleW2.val = ((d1 - paramdoubleW1.val) / d1);
        Dscal.dscal(paramInt1 - 1, 1.0D / (paramdoubleW1.val - d1), paramArrayOfDouble, paramInt2, paramInt3);
        paramdoubleW1.val = d1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarfg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */