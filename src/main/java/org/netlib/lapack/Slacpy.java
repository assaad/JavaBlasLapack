package org.netlib.lapack;

public final class Slacpy
{
  public static void slacpy(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6)
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
          paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt6 + paramInt5)] = paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)];
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
          paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt6 + paramInt5)] = paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)];
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
          paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt6 + paramInt5)] = paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)];
          i += 1;
        }
        j += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slacpy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */