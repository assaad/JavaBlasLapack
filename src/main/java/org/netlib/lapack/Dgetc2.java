package org.netlib.lapack;

import org.netlib.blas.Dger;
import org.netlib.blas.Dswap;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgetc2
{
  public static void dgetc2(int paramInt1, double[] paramArrayOfDouble, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, int[] paramArrayOfInt2, int paramInt5, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d3 = 0.0D;
    paramintW.val = 0;
    d1 = Dlamch.dlamch("P");
    localdoubleW2.val = (Dlamch.dlamch("S") / d1);
    localdoubleW1.val = (1.0D / localdoubleW2.val);
    Dlabad.dlabad(localdoubleW2, localdoubleW1);
    i = 1;
    for (int i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
    {
      d3 = 0.0D;
      j = i;
      for (int i3 = paramInt1 - i + 1; i3 > 0; i3--)
      {
        n = i;
        for (int i4 = paramInt1 - i + 1; i4 > 0; i4--)
        {
          if ((Math.abs(paramArrayOfDouble[(j - 1 + (n - 1) * paramInt3 + paramInt2)]) < d3 ? 0 : 1) != 0)
          {
            d3 = Math.abs(paramArrayOfDouble[(j - 1 + (n - 1) * paramInt3 + paramInt2)]);
            k = j;
            i1 = n;
          }
          n += 1;
        }
        j += 1;
      }
      if ((i != 1 ? 0 : 1) != 0) {
        d2 = Math.max(d1 * d3, localdoubleW2.val);
      }
      if ((k == i ? 0 : 1) != 0) {
        Dswap.dswap(paramInt1, paramArrayOfDouble, k - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3);
      }
      paramArrayOfInt1[(i - 1 + paramInt4)] = k;
      if ((i1 == i ? 0 : 1) != 0) {
        Dswap.dswap(paramInt1, paramArrayOfDouble, 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
      }
      paramArrayOfInt2[(i - 1 + paramInt5)] = i1;
      if ((Math.abs(paramArrayOfDouble[(i - 1 + (i - 1) * paramInt3 + paramInt2)]) >= d2 ? 0 : 1) != 0)
      {
        paramintW.val = i;
        paramArrayOfDouble[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = d2;
      }
      m = i + 1;
      for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble[(m - 1 + (i - 1) * paramInt3 + paramInt2)] /= paramArrayOfDouble[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
        m += 1;
      }
      Dger.dger(paramInt1 - i, paramInt1 - i, -1.0D, paramArrayOfDouble, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble, i - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3);
      i += 1;
    }
    if ((Math.abs(paramArrayOfDouble[(paramInt1 - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)]) >= d2 ? 0 : 1) != 0)
    {
      paramintW.val = paramInt1;
      paramArrayOfDouble[(paramInt1 - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)] = d2;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgetc2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */