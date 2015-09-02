package org.netlib.lapack;

public final class Slar2v
{
  public static void slar2v(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, int paramInt8)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    k = 1;
    j = 1;
    i = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      f9 = paramArrayOfFloat1[(k - 1 + paramInt2)];
      f10 = paramArrayOfFloat2[(k - 1 + paramInt3)];
      f11 = paramArrayOfFloat3[(k - 1 + paramInt4)];
      f1 = paramArrayOfFloat4[(j - 1 + paramInt6)];
      f2 = paramArrayOfFloat5[(j - 1 + paramInt7)];
      f3 = f2 * f11;
      f4 = f1 * f11;
      f5 = f4 - f2 * f9;
      f6 = f4 + f2 * f10;
      f7 = f1 * f9 + f3;
      f8 = f1 * f10 - f3;
      paramArrayOfFloat1[(k - 1 + paramInt2)] = (f1 * f7 + f2 * f6);
      paramArrayOfFloat2[(k - 1 + paramInt3)] = (f1 * f8 - f2 * f5);
      paramArrayOfFloat3[(k - 1 + paramInt4)] = (f1 * f6 - f2 * f7);
      k += paramInt5;
      j += paramInt8;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slar2v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */