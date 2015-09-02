package org.netlib.arpack;

public final class Icnteq
{
  public static int icnteq(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    int k = 0;
    int i = 0;
    int j = 0;
    j = 0;
    i = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      if ((paramArrayOfInt[(i - 1 + paramInt2)] != paramInt3 ? 0 : 1) != 0) {
        j += 1;
      }
      i += 1;
    }
    k = j;
    return k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Icnteq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */