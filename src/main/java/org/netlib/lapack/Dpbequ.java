package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dpbequ
{
  public static void dpbequ(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, doubleW paramdoubleW1, doubleW paramdoubleW2, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    double d = 0.0D;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= paramInt2 + 1 ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPBEQU", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramdoubleW1.val = 1.0D;
      paramdoubleW2.val = 0.0D;
      return;
    }
    if (bool) {
      j = paramInt2 + 1;
    } else {
      j = 1;
    }
    paramArrayOfDouble2[(1 - 1 + paramInt5)] = paramArrayOfDouble1[(j - 1 + (1 - 1) * paramInt4 + paramInt3)];
    d = paramArrayOfDouble2[(1 - 1 + paramInt5)];
    paramdoubleW2.val = paramArrayOfDouble2[(1 - 1 + paramInt5)];
    i = 2;
    for (int k = paramInt1 - 2 + 1; k > 0; k--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt5)] = paramArrayOfDouble1[(j - 1 + (i - 1) * paramInt4 + paramInt3)];
      d = Math.min(d, paramArrayOfDouble2[(i - 1 + paramInt5)]);
      paramdoubleW2.val = Math.max(paramdoubleW2.val, paramArrayOfDouble2[(i - 1 + paramInt5)]);
      i += 1;
    }
    if ((d > 0.0D ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        if ((paramArrayOfDouble2[(i - 1 + paramInt5)] > 0.0D ? 0 : 1) != 0)
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
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt5)] = (1.0D / Math.sqrt(paramArrayOfDouble2[(i - 1 + paramInt5)]));
        i += 1;
      }
      paramdoubleW1.val = (Math.sqrt(d) / Math.sqrt(paramdoubleW2.val));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpbequ.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */