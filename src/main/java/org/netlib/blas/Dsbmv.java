package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dsbmv
{
  public static void dsbmv(String paramString, int paramInt1, int paramInt2, double paramDouble1, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double paramDouble2, double[] paramArrayOfDouble3, int paramInt7, int paramInt8)
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
    int i5 = 0;
    int i6 = 0;
    j = 0;
    if ((((Lsame.lsame(paramString, "U") ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      j = 1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      j = 2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      j = 3;
    } else if ((paramInt4 >= paramInt2 + 1 ? 0 : 1) != 0) {
      j = 6;
    } else if ((paramInt6 != 0 ? 0 : 1) != 0) {
      j = 8;
    } else if ((paramInt8 != 0 ? 0 : 1) != 0) {
      j = 11;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSBMV ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {
      if ((paramDouble1 != 0.0D ? 0 : 1) == 0) {}
    }
    if ((((paramDouble2 != 1.0D ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt6 <= 0 ? 0 : 1) != 0) {
      i4 = 1;
    } else {
      i4 = 1 - (paramInt1 - 1) * paramInt6;
    }
    if ((paramInt8 <= 0 ? 0 : 1) != 0) {
      i5 = 1;
    } else {
      i5 = 1 - (paramInt1 - 1) * paramInt8;
    }
    int i7;
    if ((paramDouble2 == 1.0D ? 0 : 1) != 0) {
      if ((paramInt8 != 1 ? 0 : 1) != 0)
      {
        if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt7)] = 0.0D;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt7)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + paramInt7)]);
            i += 1;
          }
        }
      }
      else
      {
        m = i5;
        if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfDouble3[(m - 1 + paramInt7)] = 0.0D;
            m += paramInt8;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfDouble3[(m - 1 + paramInt7)] = (paramDouble2 * paramArrayOfDouble3[(m - 1 + paramInt7)]);
            m += paramInt8;
            i += 1;
          }
        }
      }
    }
    if ((paramDouble1 != 0.0D ? 0 : 1) != 0) {
      return;
    }
    int i8;
    if (Lsame.lsame(paramString, "U"))
    {
      i3 = paramInt2 + 1;
      if ((paramInt6 != 1 ? 0 : 1) != 0) {}
      if (((paramInt8 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(n - 1 + paramInt5)];
          d2 = 0.0D;
          i6 = i3 - n;
          i = Math.max(1, n - paramInt2);
          for (i8 = n - 1 - Math.max(1, n - paramInt2) + 1; i8 > 0; i8--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt7)] += d1 * paramArrayOfDouble1[(i6 + i - 1 + (n - 1) * paramInt4 + paramInt3)];
            d2 += paramArrayOfDouble1[(i6 + i - 1 + (n - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble2[(i - 1 + paramInt5)];
            i += 1;
          }
          paramArrayOfDouble3[(n - 1 + paramInt7)] = (paramArrayOfDouble3[(n - 1 + paramInt7)] + d1 * paramArrayOfDouble1[(i3 - 1 + (n - 1) * paramInt4 + paramInt3)] + paramDouble1 * d2);
          n += 1;
        }
      }
      else
      {
        i1 = i4;
        i2 = i5;
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(i1 - 1 + paramInt5)];
          d2 = 0.0D;
          k = i4;
          m = i5;
          i6 = i3 - n;
          i = Math.max(1, n - paramInt2);
          for (i8 = n - 1 - Math.max(1, n - paramInt2) + 1; i8 > 0; i8--)
          {
            paramArrayOfDouble3[(m - 1 + paramInt7)] += d1 * paramArrayOfDouble1[(i6 + i - 1 + (n - 1) * paramInt4 + paramInt3)];
            d2 += paramArrayOfDouble1[(i6 + i - 1 + (n - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble2[(k - 1 + paramInt5)];
            k += paramInt6;
            m += paramInt8;
            i += 1;
          }
          paramArrayOfDouble3[(i2 - 1 + paramInt7)] = (paramArrayOfDouble3[(i2 - 1 + paramInt7)] + d1 * paramArrayOfDouble1[(i3 - 1 + (n - 1) * paramInt4 + paramInt3)] + paramDouble1 * d2);
          i1 += paramInt6;
          i2 += paramInt8;
          if ((n <= paramInt2 ? 0 : 1) != 0)
          {
            i4 += paramInt6;
            i5 += paramInt8;
          }
          n += 1;
        }
      }
    }
    else
    {
      if ((paramInt6 != 1 ? 0 : 1) != 0) {}
      if (((paramInt8 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(n - 1 + paramInt5)];
          d2 = 0.0D;
          paramArrayOfDouble3[(n - 1 + paramInt7)] += d1 * paramArrayOfDouble1[(1 - 1 + (n - 1) * paramInt4 + paramInt3)];
          i6 = 1 - n;
          i = n + 1;
          for (i8 = Math.min(paramInt1, n + paramInt2) - (n + 1) + 1; i8 > 0; i8--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt7)] += d1 * paramArrayOfDouble1[(i6 + i - 1 + (n - 1) * paramInt4 + paramInt3)];
            d2 += paramArrayOfDouble1[(i6 + i - 1 + (n - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble2[(i - 1 + paramInt5)];
            i += 1;
          }
          paramArrayOfDouble3[(n - 1 + paramInt7)] += paramDouble1 * d2;
          n += 1;
        }
      }
      else
      {
        i1 = i4;
        i2 = i5;
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(i1 - 1 + paramInt5)];
          d2 = 0.0D;
          paramArrayOfDouble3[(i2 - 1 + paramInt7)] += d1 * paramArrayOfDouble1[(1 - 1 + (n - 1) * paramInt4 + paramInt3)];
          i6 = 1 - n;
          k = i1;
          m = i2;
          i = n + 1;
          for (i8 = Math.min(paramInt1, n + paramInt2) - (n + 1) + 1; i8 > 0; i8--)
          {
            k += paramInt6;
            m += paramInt8;
            paramArrayOfDouble3[(m - 1 + paramInt7)] += d1 * paramArrayOfDouble1[(i6 + i - 1 + (n - 1) * paramInt4 + paramInt3)];
            d2 += paramArrayOfDouble1[(i6 + i - 1 + (n - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble2[(k - 1 + paramInt5)];
            i += 1;
          }
          paramArrayOfDouble3[(i2 - 1 + paramInt7)] += paramDouble1 * d2;
          i1 += paramInt6;
          i2 += paramInt8;
          n += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dsbmv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */