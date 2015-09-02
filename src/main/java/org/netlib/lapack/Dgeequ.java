package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgeequ
{
  public static void dgeequ(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, intW paramintW)
  {
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEEQU", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramdoubleW1.val = 1.0D;
      paramdoubleW2.val = 1.0D;
      paramdoubleW3.val = 0.0D;
      return;
    }
    d4 = Dlamch.dlamch("S");
    d1 = 1.0D / d4;
    i = 1;
    for (int k = paramInt1 - 1 + 1; k > 0; k--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt5)] = 0.0D;
      i += 1;
    }
    j = 1;
    int m;
    for (k = paramInt2 - 1 + 1; k > 0; k--)
    {
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt5)] = Math.max(paramArrayOfDouble2[(i - 1 + paramInt5)], Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]));
        i += 1;
      }
      j += 1;
    }
    d3 = d1;
    d2 = 0.0D;
    i = 1;
    for (k = paramInt1 - 1 + 1; k > 0; k--)
    {
      d2 = Math.max(d2, paramArrayOfDouble2[(i - 1 + paramInt5)]);
      d3 = Math.min(d3, paramArrayOfDouble2[(i - 1 + paramInt5)]);
      i += 1;
    }
    paramdoubleW3.val = d2;
    if ((d3 != 0.0D ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        if ((paramArrayOfDouble2[(i - 1 + paramInt5)] != 0.0D ? 0 : 1) != 0)
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
        paramArrayOfDouble2[(i - 1 + paramInt5)] = (1.0D / Math.min(Math.max(paramArrayOfDouble2[(i - 1 + paramInt5)], d4), d1));
        i += 1;
      }
      paramdoubleW1.val = (Math.max(d3, d4) / Math.min(d2, d1));
    }
    j = 1;
    for (k = paramInt2 - 1 + 1; k > 0; k--)
    {
      paramArrayOfDouble3[(j - 1 + paramInt6)] = 0.0D;
      j += 1;
    }
    j = 1;
    for (k = paramInt2 - 1 + 1; k > 0; k--)
    {
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfDouble3[(j - 1 + paramInt6)] = Math.max(paramArrayOfDouble3[(j - 1 + paramInt6)], Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]) * paramArrayOfDouble2[(i - 1 + paramInt5)]);
        i += 1;
      }
      j += 1;
    }
    d3 = d1;
    d2 = 0.0D;
    j = 1;
    for (k = paramInt2 - 1 + 1; k > 0; k--)
    {
      d3 = Math.min(d3, paramArrayOfDouble3[(j - 1 + paramInt6)]);
      d2 = Math.max(d2, paramArrayOfDouble3[(j - 1 + paramInt6)]);
      j += 1;
    }
    if ((d3 != 0.0D ? 0 : 1) != 0)
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        if ((paramArrayOfDouble3[(j - 1 + paramInt6)] != 0.0D ? 0 : 1) != 0)
        {
          paramintW.val = (paramInt1 + j);
          return;
        }
        j += 1;
      }
    }
    else
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble3[(j - 1 + paramInt6)] = (1.0D / Math.min(Math.max(paramArrayOfDouble3[(j - 1 + paramInt6)], d4), d1));
        j += 1;
      }
      paramdoubleW2.val = (Math.max(d3, d4) / Math.min(d2, d1));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgeequ.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */