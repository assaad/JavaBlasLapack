package org.netlib.lapack;

import org.netlib.util.intW;

public final class Slag2d
{
  public static void slag2d(int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, int paramInt4, double[] paramArrayOfDouble, int paramInt5, int paramInt6, intW paramintW)
  {
    int i = 0;
    int j = 0;
    paramintW.val = 0;
    j = 1;
    for (int k = paramInt2 - 1 + 1; k > 0; k--)
    {
      i = 1;
      for (int m = paramInt1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfDouble[(i - 1 + (j - 1) * paramInt6 + paramInt5)] = paramArrayOfFloat[(i - 1 + (j - 1) * paramInt4 + paramInt3)];
        i += 1;
      }
      j += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slag2d.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */