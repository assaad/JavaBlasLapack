package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasq1
{
  public static void dlasq1(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, intW paramintW)
  {
    int i = 0;
    intW localintW = new intW(0);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
      Xerbla.xerbla("DLASQ1", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfDouble1[(1 - 1 + paramInt2)] = Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt2)]);
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      Dlas2.dlas2(paramArrayOfDouble1[(1 - 1 + paramInt2)], paramArrayOfDouble2[(1 - 1 + paramInt3)], paramArrayOfDouble1[(2 - 1 + paramInt2)], localdoubleW1, localdoubleW2);
      paramArrayOfDouble1[(1 - 1 + paramInt2)] = localdoubleW2.val;
      paramArrayOfDouble1[(2 - 1 + paramInt2)] = localdoubleW1.val;
      return;
    }
    localdoubleW2.val = 0.0D;
    i = 1;
    for (int j = paramInt1 - 1 - 1 + 1; j > 0; j--)
    {
      paramArrayOfDouble1[(i - 1 + paramInt2)] = Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]);
      localdoubleW2.val = Math.max(localdoubleW2.val, Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]));
      i += 1;
    }
    paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)] = Math.abs(paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)]);
    if ((localdoubleW2.val != 0.0D ? 0 : 1) != 0)
    {
      Dlasrt.dlasrt("D", paramInt1, paramArrayOfDouble1, paramInt2, localintW);
      return;
    }
    i = 1;
    for (int j = paramInt1 - 1 + 1; j > 0; j--)
    {
      localdoubleW2.val = Math.max(localdoubleW2.val, paramArrayOfDouble1[(i - 1 + paramInt2)]);
      i += 1;
    }
    d1 = Dlamch.dlamch("Precision");
    d3 = Dlamch.dlamch("Safe minimum");
    d2 = Math.sqrt(d1 / d3);
    Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt2, 1, paramArrayOfDouble3, 1 - 1 + paramInt4, 2);
    Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble2, paramInt3, 1, paramArrayOfDouble3, 2 - 1 + paramInt4, 2);
    Dlascl.dlascl("G", 0, 0, localdoubleW2.val, d2, 2 * paramInt1 - 1, 1, paramArrayOfDouble3, paramInt4, 2 * paramInt1 - 1, localintW);
    i = 1;
    for (int j = 2 * paramInt1 - 1 - 1 + 1; j > 0; j--)
    {
      paramArrayOfDouble3[(i - 1 + paramInt4)] = Math.pow(paramArrayOfDouble3[(i - 1 + paramInt4)], 2);
      i += 1;
    }
    paramArrayOfDouble3[(2 * paramInt1 - 1 + paramInt4)] = 0.0D;
    Dlasq2.dlasq2(paramInt1, paramArrayOfDouble3, paramInt4, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (int j = paramInt1 - 1 + 1; j > 0; j--)
      {
        paramArrayOfDouble1[(i - 1 + paramInt2)] = Math.sqrt(paramArrayOfDouble3[(i - 1 + paramInt4)]);
        i += 1;
      }
      Dlascl.dlascl("G", 0, 0, d2, localdoubleW2.val, paramInt1, 1, paramArrayOfDouble1, paramInt2, paramInt1, localintW);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasq1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */