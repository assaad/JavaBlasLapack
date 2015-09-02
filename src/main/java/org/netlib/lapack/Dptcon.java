package org.netlib.lapack;

import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dptcon
{
  public static void dptcon(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double paramDouble, doubleW paramdoubleW, double[] paramArrayOfDouble3, int paramInt4, intW paramintW)
  {
    int i = 0;
    int j = 0;
    double d = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramDouble >= 0.0D ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPTCON", -paramintW.val);
      return;
    }
    paramdoubleW.val = 0.0D;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramdoubleW.val = 1.0D;
      return;
    }
    if ((paramDouble != 0.0D ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int k = paramInt1 - 1 + 1; k > 0; k--)
    {
      if ((paramArrayOfDouble1[(i - 1 + paramInt2)] > 0.0D ? 0 : 1) != 0) {
        return;
      }
      i += 1;
    }
    paramArrayOfDouble3[(1 - 1 + paramInt4)] = 1.0D;
    i = 2;
    for (k = paramInt1 - 2 + 1; k > 0; k--)
    {
      paramArrayOfDouble3[(i - 1 + paramInt4)] = (1.0D + paramArrayOfDouble3[(i - 1 - 1 + paramInt4)] * Math.abs(paramArrayOfDouble2[(i - 1 - 1 + paramInt3)]));
      i += 1;
    }
    paramArrayOfDouble3[(paramInt1 - 1 + paramInt4)] /= paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)];
    i = paramInt1 - 1;
    for (k = (1 - (paramInt1 - 1) + -1) / -1; k > 0; k--)
    {
      paramArrayOfDouble3[(i - 1 + paramInt4)] = (paramArrayOfDouble3[(i - 1 + paramInt4)] / paramArrayOfDouble1[(i - 1 + paramInt2)] + paramArrayOfDouble3[(i + 1 - 1 + paramInt4)] * Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]));
      i += -1;
    }
    j = Idamax.idamax(paramInt1, paramArrayOfDouble3, paramInt4, 1);
    d = Math.abs(paramArrayOfDouble3[(j - 1 + paramInt4)]);
    if ((d == 0.0D ? 0 : 1) != 0) {
      paramdoubleW.val = (1.0D / d / paramDouble);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dptcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */