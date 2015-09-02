package org.netlib.blas;

public final class Isamax
{
  public static int isamax(int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3)
  {
    float f = 0.0F;
    int i = 0;
    int j = 0;
    int k = 0;
    k = 0;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt3 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return k;
    }
    k = 1;
    if ((paramInt1 != 1 ? 0 : 1) != 0) {
      return k;
    }
    if ((paramInt3 != 1 ? 0 : 1) == 0)
    {
      j = 1;
      f = Math.abs(paramArrayOfFloat[(1 - 1 + paramInt2)]);
      j += paramInt3;
      i = 2;
      for (m = paramInt1 - 2 + 1; m > 0; m--)
      {
        if ((Math.abs(paramArrayOfFloat[(j - 1 + paramInt2)]) > f ? 0 : 1) == 0)
        {
          k = i;
          f = Math.abs(paramArrayOfFloat[(j - 1 + paramInt2)]);
        }
        j += paramInt3;
        i += 1;
      }
      return k;
    }
    f = Math.abs(paramArrayOfFloat[(1 - 1 + paramInt2)]);
    i = 2;
    for (int m = paramInt1 - 2 + 1; m > 0; m--)
    {
      if ((Math.abs(paramArrayOfFloat[(i - 1 + paramInt2)]) > f ? 0 : 1) == 0)
      {
        k = i;
        f = Math.abs(paramArrayOfFloat[(i - 1 + paramInt2)]);
      }
      i += 1;
    }
    return k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Isamax.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */