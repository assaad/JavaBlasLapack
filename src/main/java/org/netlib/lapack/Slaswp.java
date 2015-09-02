package org.netlib.lapack;

public final class Slaswp
{
  public static void slaswp(int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt, int paramInt6, int paramInt7)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    float f = 0.0F;
    if ((paramInt7 <= 0 ? 0 : 1) != 0)
    {
      i2 = paramInt4;
      j = paramInt4;
      k = paramInt5;
      m = 1;
    }
    else if ((paramInt7 >= 0 ? 0 : 1) != 0)
    {
      i2 = 1 + (1 - paramInt5) * paramInt7;
      j = paramInt5;
      k = paramInt4;
      m = -1;
    }
    else
    {
      return;
    }
    i5 = paramInt1 / 32 * 32;
    int i6;
    int i7;
    if ((i5 == 0 ? 0 : 1) != 0)
    {
      i3 = 1;
      for (i6 = (i5 - 1 + 32) / 32; i6 > 0; i6--)
      {
        i1 = i2;
        i = j;
        for (i7 = (k - j + m) / m; i7 > 0; i7--)
        {
          n = paramArrayOfInt[(i1 - 1 + paramInt6)];
          if ((n == i ? 0 : 1) != 0)
          {
            i4 = i3;
            for (int i8 = i3 + 31 - i3 + 1; i8 > 0; i8--)
            {
              f = paramArrayOfFloat[(i - 1 + (i4 - 1) * paramInt3 + paramInt2)];
              paramArrayOfFloat[(i - 1 + (i4 - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat[(n - 1 + (i4 - 1) * paramInt3 + paramInt2)];
              paramArrayOfFloat[(n - 1 + (i4 - 1) * paramInt3 + paramInt2)] = f;
              i4 += 1;
            }
          }
          i1 += paramInt7;
          i += m;
        }
        i3 += 32;
      }
    }
    if ((i5 == paramInt1 ? 0 : 1) != 0)
    {
      i5 += 1;
      i1 = i2;
      i = j;
      for (i6 = (k - j + m) / m; i6 > 0; i6--)
      {
        n = paramArrayOfInt[(i1 - 1 + paramInt6)];
        if ((n == i ? 0 : 1) != 0)
        {
          i4 = i5;
          for (i7 = paramInt1 - i5 + 1; i7 > 0; i7--)
          {
            f = paramArrayOfFloat[(i - 1 + (i4 - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat[(i - 1 + (i4 - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat[(n - 1 + (i4 - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat[(n - 1 + (i4 - 1) * paramInt3 + paramInt2)] = f;
            i4 += 1;
          }
        }
        i1 += paramInt7;
        i += m;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaswp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */