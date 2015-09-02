package org.netlib.lapack;

public final class Dlaset
{
  public static void dlaset(String paramString, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble, int paramInt3, int paramInt4)
  {
    int i = 0;
    int j = 0;
    int m;
    if (Lsame.lsame(paramString, "U"))
    {
      j = 2;
      for (int k = paramInt2 - 2 + 1; k > 0; k--)
      {
        i = 1;
        for (m = Math.min(j - 1, paramInt1) - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = paramDouble1;
          i += 1;
        }
        j += 1;
      }
    }
    else if (Lsame.lsame(paramString, "L"))
    {
      j = 1;
      for (int k = Math.min(paramInt1, paramInt2) - 1 + 1; k > 0; k--)
      {
        i = j + 1;
        for (m = paramInt1 - (j + 1) + 1; m > 0; m--)
        {
          paramArrayOfDouble[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = paramDouble1;
          i += 1;
        }
        j += 1;
      }
    }
    else
    {
      j = 1;
      for (int k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = paramDouble1;
          i += 1;
        }
        j += 1;
      }
    }
    i = 1;
    for (int k = Math.min(paramInt1, paramInt2) - 1 + 1; k > 0; k--)
    {
      paramArrayOfDouble[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = paramDouble2;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaset.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */