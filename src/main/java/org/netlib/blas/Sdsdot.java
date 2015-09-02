package org.netlib.blas;

public final class Sdsdot
{
  public static float sdsdot(int paramInt1, float paramFloat, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5)
  {
    double d = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    float f = 0.0F;
    d = paramFloat;
    if ((paramInt1 > 0 ? 0 : 1) == 0)
    {
      if ((paramInt3 != paramInt5 ? 0 : 1) != 0) {}
      if (((paramInt3 <= 0 ? 0 : 1) != 0 ? 1 : 0) == 0)
      {
        j = 1;
        k = 1;
        if ((paramInt3 >= 0 ? 0 : 1) != 0) {
          j = 1 + (1 - paramInt1) * paramInt3;
        }
        if ((paramInt5 >= 0 ? 0 : 1) != 0) {
          k = 1 + (1 - paramInt1) * paramInt5;
        }
        i = 1;
        for (int n = paramInt1 - 1 + 1; n > 0; n--)
        {
          d += paramArrayOfFloat1[(j - 1 + paramInt2)] * paramArrayOfFloat2[(k - 1 + paramInt4)];
          j += paramInt3;
          k += paramInt5;
          i += 1;
        }
      }
    }
    else
    {
      f = (float)d;
      return f;
    }
    m = paramInt1 * paramInt3;
    i = 1;
    for (int n = (m - 1 + paramInt3) / paramInt3; n > 0; n--)
    {
      d += paramArrayOfFloat1[(i - 1 + paramInt2)] * paramArrayOfFloat2[(i - 1 + paramInt4)];
      i += paramInt3;
    }
    f = (float)d;
    return f;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Sdsdot.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */