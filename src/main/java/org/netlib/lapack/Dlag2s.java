package org.netlib.lapack;

import org.netlib.util.intW;

public final class Dlag2s
{
  public static void dlag2s(int paramInt1, int paramInt2, double[] paramArrayOfDouble, int paramInt3, int paramInt4, float[] paramArrayOfFloat, int paramInt5, int paramInt6, intW paramintW)
  {
    int i = 0;
    int j = 0;
    double d = 0.0D;
    d = Slamch.slamch("O");
    j = 1;
    for (int k = paramInt2 - 1 + 1; k > 0; k--)
    {
      i = 1;
      for (int m = paramInt1 - 1 + 1; m > 0; m--)
      {
        if ((paramArrayOfDouble[(i - 1 + (j - 1) * paramInt4 + paramInt3)] >= -d ? 0 : 1) == 0) {}
        if (((paramArrayOfDouble[(i - 1 + (j - 1) * paramInt4 + paramInt3)] <= d ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = ((i - 1) * paramInt4 + j);
          break;
        }
        paramArrayOfFloat[(i - 1 + (j - 1) * paramInt6 + paramInt5)] = ((float)paramArrayOfDouble[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
        i += 1;
      }
      j += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlag2s.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */