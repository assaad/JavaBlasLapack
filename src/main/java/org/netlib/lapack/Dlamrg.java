package org.netlib.lapack;

public final class Dlamrg
{
  public static void dlamrg(int paramInt1, int paramInt2, double[] paramArrayOfDouble, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt, int paramInt6)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    m = paramInt1;
    n = paramInt2;
    if ((paramInt4 <= 0 ? 0 : 1) != 0) {
      j = 1;
    } else {
      j = paramInt1;
    }
    if ((paramInt5 <= 0 ? 0 : 1) != 0) {
      k = 1 + paramInt1;
    } else {
      k = paramInt1 + paramInt2;
    }
    i = 1;
    for (;;)
    {
      if ((m <= 0 ? 0 : 1) != 0) {}
      if (((n <= 0 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        break;
      }
      if ((paramArrayOfDouble[(j - 1 + paramInt3)] > paramArrayOfDouble[(k - 1 + paramInt3)] ? 0 : 1) != 0)
      {
        paramArrayOfInt[(i - 1 + paramInt6)] = j;
        i += 1;
        j += paramInt4;
        m -= 1;
      }
      else
      {
        paramArrayOfInt[(i - 1 + paramInt6)] = k;
        i += 1;
        k += paramInt5;
        n -= 1;
      }
    }
    int i1;
    if ((m != 0 ? 0 : 1) != 0)
    {
      m = 1;
      for (i1 = n - 1 + 1; i1 > 0; i1--)
      {
        paramArrayOfInt[(i - 1 + paramInt6)] = k;
        i += 1;
        k += paramInt5;
        m += 1;
      }
    }
    else
    {
      n = 1;
      for (i1 = m - 1 + 1; i1 > 0; i1--)
      {
        paramArrayOfInt[(i - 1 + paramInt6)] = j;
        i += 1;
        j += paramInt4;
        n += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlamrg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */