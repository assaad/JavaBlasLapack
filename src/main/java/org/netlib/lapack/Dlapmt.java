package org.netlib.lapack;

public final class Dlapmt
{
  public static void dlapmt(boolean paramBoolean, int paramInt1, int paramInt2, double[] paramArrayOfDouble, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double d = 0.0D;
    if ((paramInt2 > 1 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int n = paramInt2 - 1 + 1; n > 0; n--)
    {
      paramArrayOfInt[(i - 1 + paramInt5)] = (-paramArrayOfInt[(i - 1 + paramInt5)]);
      i += 1;
    }
    int i1;
    if (paramBoolean)
    {
      i = 1;
      for (n = paramInt2 - 1 + 1; n > 0; n--)
      {
        if ((paramArrayOfInt[(i - 1 + paramInt5)] <= 0 ? 0 : 1) == 0)
        {
          m = i;
          paramArrayOfInt[(m - 1 + paramInt5)] = (-paramArrayOfInt[(m - 1 + paramInt5)]);
          for (k = paramArrayOfInt[(m - 1 + paramInt5)]; (paramArrayOfInt[(k - 1 + paramInt5)] <= 0 ? 0 : 1) == 0; k = paramArrayOfInt[(k - 1 + paramInt5)])
          {
            j = 1;
            for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
            {
              d = paramArrayOfDouble[(j - 1 + (m - 1) * paramInt4 + paramInt3)];
              paramArrayOfDouble[(j - 1 + (m - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble[(j - 1 + (k - 1) * paramInt4 + paramInt3)];
              paramArrayOfDouble[(j - 1 + (k - 1) * paramInt4 + paramInt3)] = d;
              j += 1;
            }
            paramArrayOfInt[(k - 1 + paramInt5)] = (-paramArrayOfInt[(k - 1 + paramInt5)]);
            m = k;
          }
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (n = paramInt2 - 1 + 1; n > 0; n--)
      {
        if ((paramArrayOfInt[(i - 1 + paramInt5)] <= 0 ? 0 : 1) == 0)
        {
          paramArrayOfInt[(i - 1 + paramInt5)] = (-paramArrayOfInt[(i - 1 + paramInt5)]);
          for (m = paramArrayOfInt[(i - 1 + paramInt5)]; (m != i ? 0 : 1) == 0; m = paramArrayOfInt[(m - 1 + paramInt5)])
          {
            j = 1;
            for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
            {
              d = paramArrayOfDouble[(j - 1 + (i - 1) * paramInt4 + paramInt3)];
              paramArrayOfDouble[(j - 1 + (i - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble[(j - 1 + (m - 1) * paramInt4 + paramInt3)];
              paramArrayOfDouble[(j - 1 + (m - 1) * paramInt4 + paramInt3)] = d;
              j += 1;
            }
            paramArrayOfInt[(m - 1 + paramInt5)] = (-paramArrayOfInt[(m - 1 + paramInt5)]);
          }
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlapmt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */