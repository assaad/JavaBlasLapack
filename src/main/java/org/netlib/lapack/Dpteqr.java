package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dpteqr
{
  public static void dpteqr(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, intW paramintW)
  {
    double[] arrayOfDouble1 = new double[1 * 1];
    double[] arrayOfDouble2 = new double[1 * 1];
    int i = 0;
    int j = 0;
    int k = 0;
    paramintW.val = 0;
    if (Lsame.lsame(paramString, "N")) {
      j = 0;
    } else if (Lsame.lsame(paramString, "V")) {
      j = 1;
    } else if (Lsame.lsame(paramString, "I")) {
      j = 2;
    } else {
      j = -1;
    }
    if ((j >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if ((j <= 0 ? 0 : 1) == 0) {}
      }
      if ((((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -6;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPTEQR", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((j <= 0 ? 0 : 1) != 0) {
        paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0D;
      }
      return;
    }
    if ((j != 2 ? 0 : 1) != 0) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble3, paramInt4, paramInt5);
    }
    Dpttrf.dpttrf(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      paramArrayOfDouble1[(i - 1 + paramInt2)] = Math.sqrt(paramArrayOfDouble1[(i - 1 + paramInt2)]);
      i += 1;
    }
    i = 1;
    for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt3)] *= paramArrayOfDouble1[(i - 1 + paramInt2)];
      i += 1;
    }
    if ((j <= 0 ? 0 : 1) != 0) {
      k = paramInt1;
    } else {
      k = 0;
    }
    Dbdsqr.dbdsqr("Lower", paramInt1, 0, k, 0, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, arrayOfDouble2, 0, 1, paramArrayOfDouble3, paramInt4, paramInt5, arrayOfDouble1, 0, 1, paramArrayOfDouble4, paramInt6, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfDouble1[(i - 1 + paramInt2)] *= paramArrayOfDouble1[(i - 1 + paramInt2)];
        i += 1;
      }
    }
    else
    {
      paramintW.val = (paramInt1 + paramintW.val);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpteqr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */