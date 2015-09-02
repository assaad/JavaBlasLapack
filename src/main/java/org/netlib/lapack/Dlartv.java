package org.netlib.lapack;

public final class Dlartv
{
  public static void dlartv(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, int paramInt8)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    k = 1;
    m = 1;
    j = 1;
    i = 1;
    for (int n = paramInt1 - 1 + 1; n > 0; n--)
    {
      d1 = paramArrayOfDouble1[(k - 1 + paramInt2)];
      d2 = paramArrayOfDouble2[(m - 1 + paramInt4)];
      paramArrayOfDouble1[(k - 1 + paramInt2)] = (paramArrayOfDouble3[(j - 1 + paramInt6)] * d1 + paramArrayOfDouble4[(j - 1 + paramInt7)] * d2);
      paramArrayOfDouble2[(m - 1 + paramInt4)] = (paramArrayOfDouble3[(j - 1 + paramInt6)] * d2 - paramArrayOfDouble4[(j - 1 + paramInt7)] * d1);
      k += paramInt3;
      m += paramInt5;
      j += paramInt8;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlartv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */