package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dppequ
{
  public static void dppequ(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, doubleW paramdoubleW1, doubleW paramdoubleW2, intW paramintW)
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
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPPEQU", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramdoubleW1.val = 1.0D;
      paramdoubleW2.val = 0.0D;
      return;
    }
    paramArrayOfDouble2[(1 - 1 + paramInt3)] = paramArrayOfDouble1[(1 - 1 + paramInt2)];
    d = paramArrayOfDouble2[(1 - 1 + paramInt3)];
    paramdoubleW2.val = paramArrayOfDouble2[(1 - 1 + paramInt3)];
    int k;
    if (bool)
    {
      j = 1;
      i = 2;
      for (k = paramInt1 - 2 + 1; k > 0; k--)
      {
        j += i;
        paramArrayOfDouble2[(i - 1 + paramInt3)] = paramArrayOfDouble1[(j - 1 + paramInt2)];
        d = Math.min(d, paramArrayOfDouble2[(i - 1 + paramInt3)]);
        paramdoubleW2.val = Math.max(paramdoubleW2.val, paramArrayOfDouble2[(i - 1 + paramInt3)]);
        i += 1;
      }
    }
    else
    {
      j = 1;
      i = 2;
      for (k = paramInt1 - 2 + 1; k > 0; k--)
      {
        j = j + paramInt1 - i + 2;
        paramArrayOfDouble2[(i - 1 + paramInt3)] = paramArrayOfDouble1[(j - 1 + paramInt2)];
        d = Math.min(d, paramArrayOfDouble2[(i - 1 + paramInt3)]);
        paramdoubleW2.val = Math.max(paramdoubleW2.val, paramArrayOfDouble2[(i - 1 + paramInt3)]);
        i += 1;
      }
    }
    if ((d > 0.0D ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        if ((paramArrayOfDouble2[(i - 1 + paramInt3)] > 0.0D ? 0 : 1) != 0)
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
        paramArrayOfDouble2[(i - 1 + paramInt3)] = (1.0D / Math.sqrt(paramArrayOfDouble2[(i - 1 + paramInt3)]));
        i += 1;
      }
      paramdoubleW1.val = (Math.sqrt(d) / Math.sqrt(paramdoubleW2.val));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dppequ.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */