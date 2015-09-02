package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dpttrf
{
  public static void dpttrf(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, intW paramintW)
  {
    int i = 0;
    int j = 0;
    double d = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
      Xerbla.xerbla("DPTTRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    j = (paramInt1 - 1) % 4;
    i = 1;
    for (int k = j - 1 + 1; k > 0; k--)
    {
      if ((paramArrayOfDouble1[(i - 1 + paramInt2)] > 0.0D ? 0 : 1) != 0)
      {
        paramintW.val = i;
        break;
      }
      d = paramArrayOfDouble2[(i - 1 + paramInt3)];
      paramArrayOfDouble2[(i - 1 + paramInt3)] = (d / paramArrayOfDouble1[(i - 1 + paramInt2)]);
      paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] -= paramArrayOfDouble2[(i - 1 + paramInt3)] * d;
      i += 1;
    }
    i = j + 1;
    for (k = (paramInt1 - 4 - (j + 1) + 4) / 4; k > 0; k--)
    {
      if ((paramArrayOfDouble1[(i - 1 + paramInt2)] > 0.0D ? 0 : 1) != 0)
      {
        paramintW.val = i;
        break;
      }
      d = paramArrayOfDouble2[(i - 1 + paramInt3)];
      paramArrayOfDouble2[(i - 1 + paramInt3)] = (d / paramArrayOfDouble1[(i - 1 + paramInt2)]);
      paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] -= paramArrayOfDouble2[(i - 1 + paramInt3)] * d;
      if ((paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] > 0.0D ? 0 : 1) != 0)
      {
        paramintW.val = (i + 1);
        break;
      }
      d = paramArrayOfDouble2[(i + 1 - 1 + paramInt3)];
      paramArrayOfDouble2[(i + 1 - 1 + paramInt3)] = (d / paramArrayOfDouble1[(i + 1 - 1 + paramInt2)]);
      paramArrayOfDouble1[(i + 2 - 1 + paramInt2)] -= paramArrayOfDouble2[(i + 1 - 1 + paramInt3)] * d;
      if ((paramArrayOfDouble1[(i + 2 - 1 + paramInt2)] > 0.0D ? 0 : 1) != 0)
      {
        paramintW.val = (i + 2);
        break;
      }
      d = paramArrayOfDouble2[(i + 2 - 1 + paramInt3)];
      paramArrayOfDouble2[(i + 2 - 1 + paramInt3)] = (d / paramArrayOfDouble1[(i + 2 - 1 + paramInt2)]);
      paramArrayOfDouble1[(i + 3 - 1 + paramInt2)] -= paramArrayOfDouble2[(i + 2 - 1 + paramInt3)] * d;
      if ((paramArrayOfDouble1[(i + 3 - 1 + paramInt2)] > 0.0D ? 0 : 1) != 0)
      {
        paramintW.val = (i + 3);
        break;
      }
      d = paramArrayOfDouble2[(i + 3 - 1 + paramInt3)];
      paramArrayOfDouble2[(i + 3 - 1 + paramInt3)] = (d / paramArrayOfDouble1[(i + 3 - 1 + paramInt2)]);
      paramArrayOfDouble1[(i + 4 - 1 + paramInt2)] -= paramArrayOfDouble2[(i + 3 - 1 + paramInt3)] * d;
      i += 4;
    }
    if ((paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)] > 0.0D ? 0 : 1) != 0) {
      paramintW.val = paramInt1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpttrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */