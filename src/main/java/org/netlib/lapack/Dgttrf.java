package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dgttrf
{
  public static void dgttrf(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, double[] paramArrayOfDouble4, int paramInt5, int[] paramArrayOfInt, int paramInt6, intW paramintW)
  {
    int i = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
      Xerbla.xerbla("DGTTRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int j = paramInt1 - 1 + 1; j > 0; j--)
    {
      paramArrayOfInt[(i - 1 + paramInt6)] = i;
      i += 1;
    }
    i = 1;
    for (j = paramInt1 - 2 - 1 + 1; j > 0; j--)
    {
      paramArrayOfDouble4[(i - 1 + paramInt5)] = 0.0D;
      i += 1;
    }
    i = 1;
    for (j = paramInt1 - 2 - 1 + 1; j > 0; j--)
    {
      if ((Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]) < Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]) ? 0 : 1) != 0)
      {
        if ((paramArrayOfDouble2[(i - 1 + paramInt3)] == 0.0D ? 0 : 1) != 0)
        {
          d1 = paramArrayOfDouble1[(i - 1 + paramInt2)] / paramArrayOfDouble2[(i - 1 + paramInt3)];
          paramArrayOfDouble1[(i - 1 + paramInt2)] = d1;
          paramArrayOfDouble2[(i + 1 - 1 + paramInt3)] -= d1 * paramArrayOfDouble3[(i - 1 + paramInt4)];
        }
      }
      else
      {
        d1 = paramArrayOfDouble2[(i - 1 + paramInt3)] / paramArrayOfDouble1[(i - 1 + paramInt2)];
        paramArrayOfDouble2[(i - 1 + paramInt3)] = paramArrayOfDouble1[(i - 1 + paramInt2)];
        paramArrayOfDouble1[(i - 1 + paramInt2)] = d1;
        d2 = paramArrayOfDouble3[(i - 1 + paramInt4)];
        paramArrayOfDouble3[(i - 1 + paramInt4)] = paramArrayOfDouble2[(i + 1 - 1 + paramInt3)];
        paramArrayOfDouble2[(i + 1 - 1 + paramInt3)] = (d2 - d1 * paramArrayOfDouble2[(i + 1 - 1 + paramInt3)]);
        paramArrayOfDouble4[(i - 1 + paramInt5)] = paramArrayOfDouble3[(i + 1 - 1 + paramInt4)];
        paramArrayOfDouble3[(i + 1 - 1 + paramInt4)] = (-(d1 * paramArrayOfDouble3[(i + 1 - 1 + paramInt4)]));
        paramArrayOfInt[(i - 1 + paramInt6)] = (i + 1);
      }
      i += 1;
    }
    if ((paramInt1 <= 1 ? 0 : 1) != 0)
    {
      i = paramInt1 - 1;
      if ((Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]) < Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]) ? 0 : 1) != 0)
      {
        if ((paramArrayOfDouble2[(i - 1 + paramInt3)] == 0.0D ? 0 : 1) != 0)
        {
          d1 = paramArrayOfDouble1[(i - 1 + paramInt2)] / paramArrayOfDouble2[(i - 1 + paramInt3)];
          paramArrayOfDouble1[(i - 1 + paramInt2)] = d1;
          paramArrayOfDouble2[(i + 1 - 1 + paramInt3)] -= d1 * paramArrayOfDouble3[(i - 1 + paramInt4)];
        }
      }
      else
      {
        d1 = paramArrayOfDouble2[(i - 1 + paramInt3)] / paramArrayOfDouble1[(i - 1 + paramInt2)];
        paramArrayOfDouble2[(i - 1 + paramInt3)] = paramArrayOfDouble1[(i - 1 + paramInt2)];
        paramArrayOfDouble1[(i - 1 + paramInt2)] = d1;
        d2 = paramArrayOfDouble3[(i - 1 + paramInt4)];
        paramArrayOfDouble3[(i - 1 + paramInt4)] = paramArrayOfDouble2[(i + 1 - 1 + paramInt3)];
        paramArrayOfDouble2[(i + 1 - 1 + paramInt3)] = (d2 - d1 * paramArrayOfDouble2[(i + 1 - 1 + paramInt3)]);
        paramArrayOfInt[(i - 1 + paramInt6)] = (i + 1);
      }
    }
    i = 1;
    for (j = paramInt1 - 1 + 1; j > 0; j--)
    {
      if ((paramArrayOfDouble2[(i - 1 + paramInt3)] != 0.0D ? 0 : 1) != 0)
      {
        paramintW.val = i;
        break;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgttrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */