package org.netlib.lapack;

public final class Dlargv
{
  public static void dlargv(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    k = 1;
    m = 1;
    j = 1;
    i = 1;
    for (int n = paramInt1 - 1 + 1; n > 0; n--)
    {
      d1 = paramArrayOfDouble1[(k - 1 + paramInt2)];
      d2 = paramArrayOfDouble2[(m - 1 + paramInt4)];
      if ((d2 != 0.0D ? 0 : 1) != 0)
      {
        paramArrayOfDouble3[(j - 1 + paramInt6)] = 1.0D;
      }
      else if ((d1 != 0.0D ? 0 : 1) != 0)
      {
        paramArrayOfDouble3[(j - 1 + paramInt6)] = 0.0D;
        paramArrayOfDouble2[(m - 1 + paramInt4)] = 1.0D;
        paramArrayOfDouble1[(k - 1 + paramInt2)] = d2;
      }
      else if ((Math.abs(d1) <= Math.abs(d2) ? 0 : 1) != 0)
      {
        d3 = d2 / d1;
        d4 = Math.sqrt(1.0D + d3 * d3);
        paramArrayOfDouble3[(j - 1 + paramInt6)] = (1.0D / d4);
        paramArrayOfDouble2[(m - 1 + paramInt4)] = (d3 * paramArrayOfDouble3[(j - 1 + paramInt6)]);
        paramArrayOfDouble1[(k - 1 + paramInt2)] = (d1 * d4);
      }
      else
      {
        d3 = d1 / d2;
        d4 = Math.sqrt(1.0D + d3 * d3);
        paramArrayOfDouble2[(m - 1 + paramInt4)] = (1.0D / d4);
        paramArrayOfDouble3[(j - 1 + paramInt6)] = (d3 * paramArrayOfDouble2[(m - 1 + paramInt4)]);
        paramArrayOfDouble1[(k - 1 + paramInt2)] = (d2 * d4);
      }
      j += paramInt7;
      m += paramInt5;
      k += paramInt3;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlargv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */