package org.netlib.lapack;

import org.netlib.util.intW;

public final class Dlasdt
{
  public static void dlasdt(int paramInt1, intW paramintW1, intW paramintW2, int[] paramArrayOfInt1, int paramInt2, int[] paramArrayOfInt2, int paramInt3, int[] paramArrayOfInt3, int paramInt4, int paramInt5)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    double d = 0.0D;
    n = Math.max(1, paramInt1);
    d = Math.log(n / (paramInt5 + 1)) / Math.log(2.0D);
    paramintW1.val = ((int)d + 1);
    i = paramInt1 / 2;
    paramArrayOfInt1[(1 - 1 + paramInt2)] = (i + 1);
    paramArrayOfInt2[(1 - 1 + paramInt3)] = i;
    paramArrayOfInt3[(1 - 1 + paramInt4)] = (paramInt1 - i - 1);
    j = 0;
    k = 1;
    m = 1;
    i2 = 1;
    for (int i3 = paramintW1.val - 1 - 1 + 1; i3 > 0; i3--)
    {
      i = 0;
      for (int i4 = m - 1 - 0 + 1; i4 > 0; i4--)
      {
        j += 2;
        k += 2;
        i1 = m + i;
        paramArrayOfInt2[(i1 - 1 + paramInt3)] /= 2;
        paramArrayOfInt3[(j - 1 + paramInt4)] = (paramArrayOfInt2[(i1 - 1 + paramInt3)] - paramArrayOfInt2[(j - 1 + paramInt3)] - 1);
        paramArrayOfInt1[(j - 1 + paramInt2)] = (paramArrayOfInt1[(i1 - 1 + paramInt2)] - paramArrayOfInt3[(j - 1 + paramInt4)] - 1);
        paramArrayOfInt3[(i1 - 1 + paramInt4)] /= 2;
        paramArrayOfInt3[(k - 1 + paramInt4)] = (paramArrayOfInt3[(i1 - 1 + paramInt4)] - paramArrayOfInt2[(k - 1 + paramInt3)] - 1);
        paramArrayOfInt1[(k - 1 + paramInt2)] = (paramArrayOfInt1[(i1 - 1 + paramInt2)] + paramArrayOfInt2[(k - 1 + paramInt3)] + 1);
        i += 1;
      }
      m *= 2;
      i2 += 1;
    }
    paramintW2.val = (m * 2 - 1);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasdt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */