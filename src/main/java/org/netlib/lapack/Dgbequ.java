package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgbequ
{
  public static void dgbequ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, int paramInt6, double[] paramArrayOfDouble2, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;

    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt6 >= paramInt3 + paramInt4 + 1 ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGBEQU", -paramintW.val);
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
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt7)] = 0.0D;
      i += 1;
    }
    k = paramInt4 + 1;
    j = 1;
    int n;
    for (int m = paramInt2 - 1 + 1; m > 0; m--)
    {
      i = Math.max(j - paramInt4, 1);
      for (n = Math.min(j + paramInt3, paramInt1) - Math.max(j - paramInt4, 1) + 1; n > 0; n--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt7)] = Math.max(paramArrayOfDouble2[(i - 1 + paramInt7)], Math.abs(paramArrayOfDouble1[(k + i - j - 1 + (j - 1) * paramInt6 + paramInt5)]));
        i += 1;
      }
      j += 1;
    }
    d3 = d1;
    d2 = 0.0D;
    i = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      d2 = Math.max(d2, paramArrayOfDouble2[(i - 1 + paramInt7)]);
      d3 = Math.min(d3, paramArrayOfDouble2[(i - 1 + paramInt7)]);
      i += 1;
    }
    paramdoubleW3.val = d2;
    if ((d3 != 0.0D ? 0 : 1) != 0)
    {
      i = 1;
      for (int m = paramInt1 - 1 + 1; m > 0; m--)
      {
        if ((paramArrayOfDouble2[(i - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
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
      for (int m = paramInt1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt7)] = (1.0D / Math.min(Math.max(paramArrayOfDouble2[(i - 1 + paramInt7)], d4), d1));
        i += 1;
      }
      paramdoubleW1.val = (Math.max(d3, d4) / Math.min(d2, d1));
    }
    j = 1;
    for (int m = paramInt2 - 1 + 1; m > 0; m--)
    {
      paramArrayOfDouble3[(j - 1 + paramInt8)] = 0.0D;
      j += 1;
    }
    k = paramInt4 + 1;
    j = 1;
    for (int m = paramInt2 - 1 + 1; m > 0; m--)
    {
      i = Math.max(j - paramInt4, 1);
      for (n = Math.min(j + paramInt3, paramInt1) - Math.max(j - paramInt4, 1) + 1; n > 0; n--)
      {
        paramArrayOfDouble3[(j - 1 + paramInt8)] = Math.max(paramArrayOfDouble3[(j - 1 + paramInt8)], Math.abs(paramArrayOfDouble1[(k + i - j - 1 + (j - 1) * paramInt6 + paramInt5)]) * paramArrayOfDouble2[(i - 1 + paramInt7)]);
        i += 1;
      }
      j += 1;
    }
    d3 = d1;
    d2 = 0.0D;
    j = 1;
    for (int m = paramInt2 - 1 + 1; m > 0; m--)
    {
      d3 = Math.min(d3, paramArrayOfDouble3[(j - 1 + paramInt8)]);
      d2 = Math.max(d2, paramArrayOfDouble3[(j - 1 + paramInt8)]);
      j += 1;
    }
    if ((d3 != 0.0D ? 0 : 1) != 0)
    {
      j = 1;
      for (int m = paramInt2 - 1 + 1; m > 0; m--)
      {
        if ((paramArrayOfDouble3[(j - 1 + paramInt8)] != 0.0D ? 0 : 1) != 0)
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
      for (int m = paramInt2 - 1 + 1; m > 0; m--)
      {
        paramArrayOfDouble3[(j - 1 + paramInt8)] = (1.0D / Math.min(Math.max(paramArrayOfDouble3[(j - 1 + paramInt8)], d4), d1));
        j += 1;
      }
      paramdoubleW2.val = (Math.max(d3, d4) / Math.min(d2, d1));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgbequ.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */