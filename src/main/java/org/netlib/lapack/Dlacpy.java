package org.netlib.lapack;

public final class Dlacpy
{
  public static void dlacpy(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6)
  {
    int i = 0;
    int j = 0;
    int k;
    int m;
    if (Lsame.lsame(paramString, "U"))
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = Math.min(j, paramInt1) - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt6 + paramInt5)] = paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)];
          i += 1;
        }
        j += 1;
      }
    }
    else if (Lsame.lsame(paramString, "L"))
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = j;
        for (m = paramInt1 - j + 1; m > 0; m--)
        {
          paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt6 + paramInt5)] = paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)];
          i += 1;
        }
        j += 1;
      }
    }
    else
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt6 + paramInt5)] = paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)];
          i += 1;
        }
        j += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlacpy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */