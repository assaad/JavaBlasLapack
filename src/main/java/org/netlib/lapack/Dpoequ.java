package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dpoequ
{
  public static void dpoequ(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, doubleW paramdoubleW1, doubleW paramdoubleW2, intW paramintW)
  {
    int i = 0;
    double d = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -3;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPOEQU", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramdoubleW1.val = 1.0D;
      paramdoubleW2.val = 0.0D;
      return;
    }
    paramArrayOfDouble2[(1 - 1 + paramInt4)] = paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)];
    d = paramArrayOfDouble2[(1 - 1 + paramInt4)];
    paramdoubleW2.val = paramArrayOfDouble2[(1 - 1 + paramInt4)];
    i = 2;
    for (int j = paramInt1 - 2 + 1; j > 0; j--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt4)] = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
      d = Math.min(d, paramArrayOfDouble2[(i - 1 + paramInt4)]);
      paramdoubleW2.val = Math.max(paramdoubleW2.val, paramArrayOfDouble2[(i - 1 + paramInt4)]);
      i += 1;
    }
    if ((d > 0.0D ? 0 : 1) != 0)
    {
      i = 1;
      for (int j = paramInt1 - 1 + 1; j > 0; j--)
      {
        if ((paramArrayOfDouble2[(i - 1 + paramInt4)] > 0.0D ? 0 : 1) != 0)
        {
          paramintW.val = i;
          return;
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (int j = paramInt1 - 1 + 1; j > 0; j--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt4)] = (1.0D / Math.sqrt(paramArrayOfDouble2[(i - 1 + paramInt4)]));
        i += 1;
      }
      paramdoubleW1.val = (Math.sqrt(d) / Math.sqrt(paramdoubleW2.val));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpoequ.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */