package org.netlib.lapack;

public final class Slartv
{
  public static void slartv(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, int paramInt8)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    k = 1;
    m = 1;
    j = 1;
    i = 1;
    for (int n = paramInt1 - 1 + 1; n > 0; n--)
    {
      f1 = paramArrayOfFloat1[(k - 1 + paramInt2)];
      f2 = paramArrayOfFloat2[(m - 1 + paramInt4)];
      paramArrayOfFloat1[(k - 1 + paramInt2)] = (paramArrayOfFloat3[(j - 1 + paramInt6)] * f1 + paramArrayOfFloat4[(j - 1 + paramInt7)] * f2);
      paramArrayOfFloat2[(m - 1 + paramInt4)] = (paramArrayOfFloat3[(j - 1 + paramInt6)] * f2 - paramArrayOfFloat4[(j - 1 + paramInt7)] * f1);
      k += paramInt3;
      m += paramInt5;
      j += paramInt8;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slartv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */