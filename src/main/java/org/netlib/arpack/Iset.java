package org.netlib.arpack;

public final class Iset
{
  public static void iset(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4)
  {
    int i = 0;
    i = 1;
    for (int j = paramInt1 - 1 + 1; j > 0; j--)
    {
      paramArrayOfInt[(i - 1 + paramInt3)] = paramInt2;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Iset.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */