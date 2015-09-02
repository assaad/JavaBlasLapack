package org.netlib.lapack;

public final class Slaset
{
  public static void slaset(String paramString, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat, int paramInt3, int paramInt4)
  {
    int i = 0;
    int j = 0;
    int m;
    if (Lsame.lsame(paramString, "U"))
    {
      j = 2;
      for (k = paramInt2 - 2 + 1; k > 0; k--)
      {
        i = 1;
        for (m = Math.min(j - 1, paramInt1) - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = paramFloat1;
          i += 1;
        }
        j += 1;
      }
    }
    else if (Lsame.lsame(paramString, "L"))
    {
      j = 1;
      for (k = Math.min(paramInt1, paramInt2) - 1 + 1; k > 0; k--)
      {
        i = j + 1;
        for (m = paramInt1 - (j + 1) + 1; m > 0; m--)
        {
          paramArrayOfFloat[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = paramFloat1;
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
          paramArrayOfFloat[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = paramFloat1;
          i += 1;
        }
        j += 1;
      }
    }
    i = 1;
    for (int k = Math.min(paramInt1, paramInt2) - 1 + 1; k > 0; k--)
    {
      paramArrayOfFloat[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = paramFloat2;
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaset.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */