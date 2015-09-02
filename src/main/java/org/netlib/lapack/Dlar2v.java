package org.netlib.lapack;

public final class Dlar2v
{
  public static void dlar2v(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, int paramInt8)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    k = 1;
    j = 1;
    i = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      d9 = paramArrayOfDouble1[(k - 1 + paramInt2)];
      d10 = paramArrayOfDouble2[(k - 1 + paramInt3)];
      d11 = paramArrayOfDouble3[(k - 1 + paramInt4)];
      d1 = paramArrayOfDouble4[(j - 1 + paramInt6)];
      d2 = paramArrayOfDouble5[(j - 1 + paramInt7)];
      d3 = d2 * d11;
      d4 = d1 * d11;
      d5 = d4 - d2 * d9;
      d6 = d4 + d2 * d10;
      d7 = d1 * d9 + d3;
      d8 = d1 * d10 - d3;
      paramArrayOfDouble1[(k - 1 + paramInt2)] = (d1 * d7 + d2 * d6);
      paramArrayOfDouble2[(k - 1 + paramInt3)] = (d1 * d8 - d2 * d5);
      paramArrayOfDouble3[(k - 1 + paramInt4)] = (d1 * d6 - d2 * d7);
      k += paramInt5;
      j += paramInt8;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlar2v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */