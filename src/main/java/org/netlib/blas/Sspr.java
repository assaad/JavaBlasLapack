package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Sspr
{
  public static void sspr(String paramString, int paramInt1, float paramFloat, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4)
  {
    float f = 0.0F;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    j = 0;
    if ((((Lsame.lsame(paramString, "U") ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      j = 1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      j = 2;
    } else if ((paramInt3 != 0 ? 0 : 1) != 0) {
      j = 5;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSPR  ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramFloat != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt3 > 0 ? 0 : 1) != 0) {
      i3 = 1 - (paramInt1 - 1) * paramInt3;
    } else if ((paramInt3 == 1 ? 0 : 1) != 0) {
      i3 = 1;
    }
    i2 = 1;
    int i4;
    int i5;
    if (Lsame.lsame(paramString, "U"))
    {
      if ((paramInt3 != 1 ? 0 : 1) != 0)
      {
        m = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          if ((paramArrayOfFloat1[(m - 1 + paramInt2)] == 0.0F ? 0 : 1) != 0)
          {
            f = paramFloat * paramArrayOfFloat1[(m - 1 + paramInt2)];
            i1 = i2;
            i = 1;
            for (i5 = m - 1 + 1; i5 > 0; i5--)
            {
              paramArrayOfFloat2[(i1 - 1 + paramInt4)] += paramArrayOfFloat1[(i - 1 + paramInt2)] * f;
              i1 += 1;
              i += 1;
            }
          }
          i2 += m;
          m += 1;
        }
      }
      else
      {
        n = i3;
        m = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          if ((paramArrayOfFloat1[(n - 1 + paramInt2)] == 0.0F ? 0 : 1) != 0)
          {
            f = paramFloat * paramArrayOfFloat1[(n - 1 + paramInt2)];
            k = i3;
            i1 = i2;
            for (i5 = i2 + m - 1 - i2 + 1; i5 > 0; i5--)
            {
              paramArrayOfFloat2[(i1 - 1 + paramInt4)] += paramArrayOfFloat1[(k - 1 + paramInt2)] * f;
              k += paramInt3;
              i1 += 1;
            }
          }
          n += paramInt3;
          i2 += m;
          m += 1;
        }
      }
    }
    else if ((paramInt3 != 1 ? 0 : 1) != 0)
    {
      m = 1;
      for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
      {
        if ((paramArrayOfFloat1[(m - 1 + paramInt2)] == 0.0F ? 0 : 1) != 0)
        {
          f = paramFloat * paramArrayOfFloat1[(m - 1 + paramInt2)];
          i1 = i2;
          i = m;
          for (i5 = paramInt1 - m + 1; i5 > 0; i5--)
          {
            paramArrayOfFloat2[(i1 - 1 + paramInt4)] += paramArrayOfFloat1[(i - 1 + paramInt2)] * f;
            i1 += 1;
            i += 1;
          }
        }
        i2 = i2 + paramInt1 - m + 1;
        m += 1;
      }
    }
    else
    {
      n = i3;
      m = 1;
      for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
      {
        if ((paramArrayOfFloat1[(n - 1 + paramInt2)] == 0.0F ? 0 : 1) != 0)
        {
          f = paramFloat * paramArrayOfFloat1[(n - 1 + paramInt2)];
          k = n;
          i1 = i2;
          for (i5 = i2 + paramInt1 - m - i2 + 1; i5 > 0; i5--)
          {
            paramArrayOfFloat2[(i1 - 1 + paramInt4)] += paramArrayOfFloat1[(k - 1 + paramInt2)] * f;
            k += paramInt3;
            i1 += 1;
          }
        }
        n += paramInt3;
        i2 = i2 + paramInt1 - m + 1;
        m += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Sspr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */