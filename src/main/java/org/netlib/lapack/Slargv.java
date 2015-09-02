package org.netlib.lapack;

public final class Slargv
{
  public static void slargv(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    k = 1;
    m = 1;
    j = 1;
    i = 1;
    for (int n = paramInt1 - 1 + 1; n > 0; n--)
    {
      f1 = paramArrayOfFloat1[(k - 1 + paramInt2)];
      f2 = paramArrayOfFloat2[(m - 1 + paramInt4)];
      if ((f2 != 0.0F ? 0 : 1) != 0)
      {
        paramArrayOfFloat3[(j - 1 + paramInt6)] = 1.0F;
      }
      else if ((f1 != 0.0F ? 0 : 1) != 0)
      {
        paramArrayOfFloat3[(j - 1 + paramInt6)] = 0.0F;
        paramArrayOfFloat2[(m - 1 + paramInt4)] = 1.0F;
        paramArrayOfFloat1[(k - 1 + paramInt2)] = f2;
      }
      else if ((Math.abs(f1) <= Math.abs(f2) ? 0 : 1) != 0)
      {
        f3 = f2 / f1;
        f4 = (float)Math.sqrt(1.0F + f3 * f3);
        paramArrayOfFloat3[(j - 1 + paramInt6)] = (1.0F / f4);
        paramArrayOfFloat2[(m - 1 + paramInt4)] = (f3 * paramArrayOfFloat3[(j - 1 + paramInt6)]);
        paramArrayOfFloat1[(k - 1 + paramInt2)] = (f1 * f4);
      }
      else
      {
        f3 = f1 / f2;
        f4 = (float)Math.sqrt(1.0F + f3 * f3);
        paramArrayOfFloat2[(m - 1 + paramInt4)] = (1.0F / f4);
        paramArrayOfFloat3[(j - 1 + paramInt6)] = (f3 * paramArrayOfFloat2[(m - 1 + paramInt4)]);
        paramArrayOfFloat1[(k - 1 + paramInt2)] = (f2 * f4);
      }
      j += paramInt7;
      m += paramInt5;
      k += paramInt3;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slargv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */