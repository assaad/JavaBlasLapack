package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dspmv
{
  public static void dspmv(String paramString, int paramInt1, double paramDouble1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double paramDouble2, double[] paramArrayOfDouble3, int paramInt5, int paramInt6)
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
    } else if ((paramInt4 != 0 ? 0 : 1) != 0) {
      j = 6;
    } else if ((paramInt6 != 0 ? 0 : 1) != 0) {
      j = 9;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPMV ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {
      if ((paramDouble1 != 0.0D ? 0 : 1) == 0) {}
    }
    if ((((paramDouble2 != 1.0D ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt4 <= 0 ? 0 : 1) != 0) {
      i5 = 1;
    } else {
      i5 = 1 - (paramInt1 - 1) * paramInt4;
    }
    if ((paramInt6 <= 0 ? 0 : 1) != 0) {
      i6 = 1;
    } else {
      i6 = 1 - (paramInt1 - 1) * paramInt6;
    }
    int i7;
    if ((paramDouble2 == 1.0D ? 0 : 1) != 0) {
      if ((paramInt6 != 1 ? 0 : 1) != 0)
      {
        if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt5)] = 0.0D;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt5)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + paramInt5)]);
            i += 1;
          }
        }
      }
      else
      {
        m = i6;
        if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfDouble3[(m - 1 + paramInt5)] = 0.0D;
            m += paramInt6;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfDouble3[(m - 1 + paramInt5)] = (paramDouble2 * paramArrayOfDouble3[(m - 1 + paramInt5)]);
            m += paramInt6;
            i += 1;
          }
        }
      }
    }
    if ((paramDouble1 != 0.0D ? 0 : 1) != 0) {
      return;
    }
    i4 = 1;
    int i8;
    if (Lsame.lsame(paramString, "U"))
    {
      if ((paramInt4 != 1 ? 0 : 1) != 0) {}
      if (((paramInt6 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(n - 1 + paramInt3)];
          d2 = 0.0D;
          i3 = i4;
          i = 1;
          for (i8 = n - 1 - 1 + 1; i8 > 0; i8--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt5)] += d1 * paramArrayOfDouble1[(i3 - 1 + paramInt2)];
            d2 += paramArrayOfDouble1[(i3 - 1 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt3)];
            i3 += 1;
            i += 1;
          }
          paramArrayOfDouble3[(n - 1 + paramInt5)] = (paramArrayOfDouble3[(n - 1 + paramInt5)] + d1 * paramArrayOfDouble1[(i4 + n - 1 - 1 + paramInt2)] + paramDouble1 * d2);
          i4 += n;
          n += 1;
        }
      }
      else
      {
        i1 = i5;
        i2 = i6;
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(i1 - 1 + paramInt3)];
          d2 = 0.0D;
          k = i5;
          m = i6;
          i3 = i4;
          for (i8 = i4 + n - 2 - i4 + 1; i8 > 0; i8--)
          {
            paramArrayOfDouble3[(m - 1 + paramInt5)] += d1 * paramArrayOfDouble1[(i3 - 1 + paramInt2)];
            d2 += paramArrayOfDouble1[(i3 - 1 + paramInt2)] * paramArrayOfDouble2[(k - 1 + paramInt3)];
            k += paramInt4;
            m += paramInt6;
            i3 += 1;
          }
          paramArrayOfDouble3[(i2 - 1 + paramInt5)] = (paramArrayOfDouble3[(i2 - 1 + paramInt5)] + d1 * paramArrayOfDouble1[(i4 + n - 1 - 1 + paramInt2)] + paramDouble1 * d2);
          i1 += paramInt4;
          i2 += paramInt6;
          i4 += n;
          n += 1;
        }
      }
    }
    else
    {
      if ((paramInt4 != 1 ? 0 : 1) != 0) {}
      if (((paramInt6 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(n - 1 + paramInt3)];
          d2 = 0.0D;
          paramArrayOfDouble3[(n - 1 + paramInt5)] += d1 * paramArrayOfDouble1[(i4 - 1 + paramInt2)];
          i3 = i4 + 1;
          i = n + 1;
          for (i8 = paramInt1 - (n + 1) + 1; i8 > 0; i8--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt5)] += d1 * paramArrayOfDouble1[(i3 - 1 + paramInt2)];
            d2 += paramArrayOfDouble1[(i3 - 1 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt3)];
            i3 += 1;
            i += 1;
          }
          paramArrayOfDouble3[(n - 1 + paramInt5)] += paramDouble1 * d2;
          i4 += paramInt1 - n + 1;
          n += 1;
        }
      }
      else
      {
        i1 = i5;
        i2 = i6;
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(i1 - 1 + paramInt3)];
          d2 = 0.0D;
          paramArrayOfDouble3[(i2 - 1 + paramInt5)] += d1 * paramArrayOfDouble1[(i4 - 1 + paramInt2)];
          k = i1;
          m = i2;
          i3 = i4 + 1;
          for (i8 = i4 + paramInt1 - n - (i4 + 1) + 1; i8 > 0; i8--)
          {
            k += paramInt4;
            m += paramInt6;
            paramArrayOfDouble3[(m - 1 + paramInt5)] += d1 * paramArrayOfDouble1[(i3 - 1 + paramInt2)];
            d2 += paramArrayOfDouble1[(i3 - 1 + paramInt2)] * paramArrayOfDouble2[(k - 1 + paramInt3)];
            i3 += 1;
          }
          paramArrayOfDouble3[(i2 - 1 + paramInt5)] += paramDouble1 * d2;
          i1 += paramInt4;
          i2 += paramInt6;
          i4 += paramInt1 - n + 1;
          n += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dspmv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */