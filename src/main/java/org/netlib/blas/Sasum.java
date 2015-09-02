package org.netlib.blas;

public final class Sasum
{
  public static float sasum(int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3)
  {
    float f1 = 0.0F;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    float f2 = 0.0F;
    f2 = 0.0F;
    f1 = 0.0F;
    if ((paramInt1 > 0 ? 0 : 1) == 0) {}
    if (((paramInt3 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return f2;
    }
    int n;
    if ((paramInt3 != 1 ? 0 : 1) == 0)
    {
      m = paramInt1 * paramInt3;
      i = 1;
      for (n = (m - 1 + paramInt3) / paramInt3; n > 0; n--)
      {
        f1 += Math.abs(paramArrayOfFloat[(i - 1 + paramInt2)]);
        i += paramInt3;
      }
      f2 = f1;
      return f2;
    }
    j = paramInt1 % 6;
    if ((j != 0 ? 0 : 1) == 0)
    {
      i = 1;
      for (n = j - 1 + 1; n > 0; n--)
      {
        f1 += Math.abs(paramArrayOfFloat[(i - 1 + paramInt2)]);
        i += 1;
      }
      if ((paramInt1 >= 6 ? 0 : 1) != 0) {}
    }
    else
    {
      k = j + 1;
      i = k;
      for (n = (paramInt1 - k + 6) / 6; n > 0; n--)
      {
        f1 = f1 + Math.abs(paramArrayOfFloat[(i - 1 + paramInt2)]) + Math.abs(paramArrayOfFloat[(i + 1 - 1 + paramInt2)]) + Math.abs(paramArrayOfFloat[(i + 2 - 1 + paramInt2)]) + Math.abs(paramArrayOfFloat[(i + 3 - 1 + paramInt2)]) + Math.abs(paramArrayOfFloat[(i + 4 - 1 + paramInt2)]) + Math.abs(paramArrayOfFloat[(i + 5 - 1 + paramInt2)]);
        i += 6;
      }
    }
    f2 = f1;
    return f2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Sasum.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */