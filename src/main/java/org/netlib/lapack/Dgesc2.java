package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.blas.Idamax;
import org.netlib.util.doubleW;

public final class Dgesc2
{
  public static void dgesc2(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2, int paramInt6, doubleW paramdoubleW)
  {
    int i = 0;
    int j = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d2 = 0.0D;
    d1 = Dlamch.dlamch("P");
    localdoubleW2.val = (Dlamch.dlamch("S") / d1);
    localdoubleW1.val = (1.0D / localdoubleW2.val);
    Dlabad.dlabad(localdoubleW2, localdoubleW1);
    Dlaswp.dlaswp(1, paramArrayOfDouble2, paramInt4, paramInt3, 1, paramInt1 - 1, paramArrayOfInt1, paramInt5, 1);
    i = 1;
    int m;
    for (int k = paramInt1 - 1 - 1 + 1; k > 0; k--)
    {
      j = i + 1;
      for (m = paramInt1 - (i + 1) + 1; m > 0; m--)
      {
        paramArrayOfDouble2[(j - 1 + paramInt4)] -= paramArrayOfDouble1[(j - 1 + (i - 1) * paramInt3 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt4)];
        j += 1;
      }
      i += 1;
    }
    paramdoubleW.val = 1.0D;
    i = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt4, 1);
    if ((2.0D * localdoubleW2.val * Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]) <= Math.abs(paramArrayOfDouble1[(paramInt1 - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)]) ? 0 : 1) != 0)
    {
      d2 = 1.0D / 2.0D / Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]);
      Dscal.dscal(paramInt1, d2, paramArrayOfDouble2, 1 - 1 + paramInt4, 1);
      paramdoubleW.val *= d2;
    }
    i = paramInt1;
    for (int k = (1 - paramInt1 + -1) / -1; k > 0; k--)
    {
      d2 = 1.0D / paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
      paramArrayOfDouble2[(i - 1 + paramInt4)] *= d2;
      j = i + 1;
      for (m = paramInt1 - (i + 1) + 1; m > 0; m--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt4)] -= paramArrayOfDouble2[(j - 1 + paramInt4)] * (paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt3 + paramInt2)] * d2);
        j += 1;
      }
      i += -1;
    }
    Dlaswp.dlaswp(1, paramArrayOfDouble2, paramInt4, paramInt3, 1, paramInt1 - 1, paramArrayOfInt2, paramInt6, -1);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgesc2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */