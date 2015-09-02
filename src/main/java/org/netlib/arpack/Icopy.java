package org.netlib.arpack;

public final class Icopy
{
  public static void icopy(int paramInt1, int[] paramArrayOfInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt2, int paramInt4, int paramInt5)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt3 != 1 ? 0 : 1) != 0) {}
    if (((paramInt5 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0)
    {
      j = 1;
      k = 1;
      if ((paramInt3 >= 0 ? 0 : 1) != 0) {
        j = (-paramInt1 + 1) * paramInt3 + 1;
      }
      if ((paramInt5 >= 0 ? 0 : 1) != 0) {
        k = (-paramInt1 + 1) * paramInt5 + 1;
      }
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfInt2[(k - 1 + paramInt4)] = paramArrayOfInt1[(j - 1 + paramInt2)];
        j += paramInt3;
        k += paramInt5;
        i += 1;
      }
      return;
    }
    i = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      paramArrayOfInt2[(i - 1 + paramInt4)] = paramArrayOfInt1[(i - 1 + paramInt2)];
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Icopy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */