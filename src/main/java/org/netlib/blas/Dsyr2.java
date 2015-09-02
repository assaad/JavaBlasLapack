package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dsyr2
{
  public static void dsyr2(String paramString, int paramInt1, double paramDouble, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    j = 0;
    if ((((Lsame.lsame(paramString, "U") ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      j = 1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      j = 2;
    } else if ((paramInt3 != 0 ? 0 : 1) != 0) {
      j = 5;
    } else if ((paramInt5 != 0 ? 0 : 1) != 0) {
      j = 7;
    } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      j = 9;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYR2 ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramDouble != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt3 == 1 ? 0 : 1) == 0) {}
    if (((paramInt5 == 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      if ((paramInt3 <= 0 ? 0 : 1) != 0) {
        i3 = 1;
      } else {
        i3 = 1 - (paramInt1 - 1) * paramInt3;
      }
      if ((paramInt5 <= 0 ? 0 : 1) != 0) {
        i4 = 1;
      } else {
        i4 = 1 - (paramInt1 - 1) * paramInt5;
      }
      i1 = i3;
      i2 = i4;
    }
    int i5;
    int i6;
    if (Lsame.lsame(paramString, "U"))
    {
      if ((paramInt3 != 1 ? 0 : 1) != 0) {}
      if (((paramInt5 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        n = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          if ((paramArrayOfDouble1[(n - 1 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
          if (((paramArrayOfDouble2[(n - 1 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            d1 = paramDouble * paramArrayOfDouble2[(n - 1 + paramInt4)];
            d2 = paramDouble * paramArrayOfDouble1[(n - 1 + paramInt2)];
            i = 1;
            for (i6 = n - 1 + 1; i6 > 0; i6--)
            {
              paramArrayOfDouble3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble1[(i - 1 + paramInt2)] * d1 + paramArrayOfDouble2[(i - 1 + paramInt4)] * d2);
              i += 1;
            }
          }
          n += 1;
        }
      }
      else
      {
        n = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          if ((paramArrayOfDouble1[(i1 - 1 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
          if (((paramArrayOfDouble2[(i2 - 1 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            d1 = paramDouble * paramArrayOfDouble2[(i2 - 1 + paramInt4)];
            d2 = paramDouble * paramArrayOfDouble1[(i1 - 1 + paramInt2)];
            k = i3;
            m = i4;
            i = 1;
            for (i6 = n - 1 + 1; i6 > 0; i6--)
            {
              paramArrayOfDouble3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble1[(k - 1 + paramInt2)] * d1 + paramArrayOfDouble2[(m - 1 + paramInt4)] * d2);
              k += paramInt3;
              m += paramInt5;
              i += 1;
            }
          }
          i1 += paramInt3;
          i2 += paramInt5;
          n += 1;
        }
      }
    }
    else
    {
      if ((paramInt3 != 1 ? 0 : 1) != 0) {}
      if (((paramInt5 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        n = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          if ((paramArrayOfDouble1[(n - 1 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
          if (((paramArrayOfDouble2[(n - 1 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            d1 = paramDouble * paramArrayOfDouble2[(n - 1 + paramInt4)];
            d2 = paramDouble * paramArrayOfDouble1[(n - 1 + paramInt2)];
            i = n;
            for (i6 = paramInt1 - n + 1; i6 > 0; i6--)
            {
              paramArrayOfDouble3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble1[(i - 1 + paramInt2)] * d1 + paramArrayOfDouble2[(i - 1 + paramInt4)] * d2);
              i += 1;
            }
          }
          n += 1;
        }
      }
      else
      {
        n = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          if ((paramArrayOfDouble1[(i1 - 1 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
          if (((paramArrayOfDouble2[(i2 - 1 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            d1 = paramDouble * paramArrayOfDouble2[(i2 - 1 + paramInt4)];
            d2 = paramDouble * paramArrayOfDouble1[(i1 - 1 + paramInt2)];
            k = i1;
            m = i2;
            i = n;
            for (i6 = paramInt1 - n + 1; i6 > 0; i6--)
            {
              paramArrayOfDouble3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble1[(k - 1 + paramInt2)] * d1 + paramArrayOfDouble2[(m - 1 + paramInt4)] * d2);
              k += paramInt3;
              m += paramInt5;
              i += 1;
            }
          }
          i1 += paramInt3;
          i2 += paramInt5;
          n += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dsyr2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */