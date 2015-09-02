package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dsymv
{
  public static void dsymv(String paramString, int paramInt1, double paramDouble1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double paramDouble2, double[] paramArrayOfDouble3, int paramInt6, int paramInt7)
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
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      j = 5;
    } else if ((paramInt5 != 0 ? 0 : 1) != 0) {
      j = 7;
    } else if ((paramInt7 != 0 ? 0 : 1) != 0) {
      j = 10;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYMV ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {
      if ((paramDouble1 != 0.0D ? 0 : 1) == 0) {}
    }
    if ((((paramDouble2 != 1.0D ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt5 <= 0 ? 0 : 1) != 0) {
      i3 = 1;
    } else {
      i3 = 1 - (paramInt1 - 1) * paramInt5;
    }
    if ((paramInt7 <= 0 ? 0 : 1) != 0) {
      i4 = 1;
    } else {
      i4 = 1 - (paramInt1 - 1) * paramInt7;
    }
    int i5;
    if ((paramDouble2 == 1.0D ? 0 : 1) != 0) {
      if ((paramInt7 != 1 ? 0 : 1) != 0)
      {
        if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
        {
          i = 1;
          for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt6)] = 0.0D;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt6)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + paramInt6)]);
            i += 1;
          }
        }
      }
      else
      {
        m = i4;
        if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
        {
          i = 1;
          for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble3[(m - 1 + paramInt6)] = 0.0D;
            m += paramInt7;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
          {
            paramArrayOfDouble3[(m - 1 + paramInt6)] = (paramDouble2 * paramArrayOfDouble3[(m - 1 + paramInt6)]);
            m += paramInt7;
            i += 1;
          }
        }
      }
    }
    if ((paramDouble1 != 0.0D ? 0 : 1) != 0) {
      return;
    }
    int i6;
    if (Lsame.lsame(paramString, "U"))
    {
      if ((paramInt5 != 1 ? 0 : 1) != 0) {}
      if (((paramInt7 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        n = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(n - 1 + paramInt4)];
          d2 = 0.0D;
          i = 1;
          for (i6 = n - 1 - 1 + 1; i6 > 0; i6--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt6)] += d1 * paramArrayOfDouble1[(i - 1 + (n - 1) * paramInt3 + paramInt2)];
            d2 += paramArrayOfDouble1[(i - 1 + (n - 1) * paramInt3 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt4)];
            i += 1;
          }
          paramArrayOfDouble3[(n - 1 + paramInt6)] = (paramArrayOfDouble3[(n - 1 + paramInt6)] + d1 * paramArrayOfDouble1[(n - 1 + (n - 1) * paramInt3 + paramInt2)] + paramDouble1 * d2);
          n += 1;
        }
      }
      else
      {
        i1 = i3;
        i2 = i4;
        n = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(i1 - 1 + paramInt4)];
          d2 = 0.0D;
          k = i3;
          m = i4;
          i = 1;
          for (i6 = n - 1 - 1 + 1; i6 > 0; i6--)
          {
            paramArrayOfDouble3[(m - 1 + paramInt6)] += d1 * paramArrayOfDouble1[(i - 1 + (n - 1) * paramInt3 + paramInt2)];
            d2 += paramArrayOfDouble1[(i - 1 + (n - 1) * paramInt3 + paramInt2)] * paramArrayOfDouble2[(k - 1 + paramInt4)];
            k += paramInt5;
            m += paramInt7;
            i += 1;
          }
          paramArrayOfDouble3[(i2 - 1 + paramInt6)] = (paramArrayOfDouble3[(i2 - 1 + paramInt6)] + d1 * paramArrayOfDouble1[(n - 1 + (n - 1) * paramInt3 + paramInt2)] + paramDouble1 * d2);
          i1 += paramInt5;
          i2 += paramInt7;
          n += 1;
        }
      }
    }
    else
    {
      if ((paramInt5 != 1 ? 0 : 1) != 0) {}
      if (((paramInt7 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        n = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(n - 1 + paramInt4)];
          d2 = 0.0D;
          paramArrayOfDouble3[(n - 1 + paramInt6)] += d1 * paramArrayOfDouble1[(n - 1 + (n - 1) * paramInt3 + paramInt2)];
          i = n + 1;
          for (i6 = paramInt1 - (n + 1) + 1; i6 > 0; i6--)
          {
            paramArrayOfDouble3[(i - 1 + paramInt6)] += d1 * paramArrayOfDouble1[(i - 1 + (n - 1) * paramInt3 + paramInt2)];
            d2 += paramArrayOfDouble1[(i - 1 + (n - 1) * paramInt3 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt4)];
            i += 1;
          }
          paramArrayOfDouble3[(n - 1 + paramInt6)] += paramDouble1 * d2;
          n += 1;
        }
      }
      else
      {
        i1 = i3;
        i2 = i4;
        n = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          d1 = paramDouble1 * paramArrayOfDouble2[(i1 - 1 + paramInt4)];
          d2 = 0.0D;
          paramArrayOfDouble3[(i2 - 1 + paramInt6)] += d1 * paramArrayOfDouble1[(n - 1 + (n - 1) * paramInt3 + paramInt2)];
          k = i1;
          m = i2;
          i = n + 1;
          for (i6 = paramInt1 - (n + 1) + 1; i6 > 0; i6--)
          {
            k += paramInt5;
            m += paramInt7;
            paramArrayOfDouble3[(m - 1 + paramInt6)] += d1 * paramArrayOfDouble1[(i - 1 + (n - 1) * paramInt3 + paramInt2)];
            d2 += paramArrayOfDouble1[(i - 1 + (n - 1) * paramInt3 + paramInt2)] * paramArrayOfDouble2[(k - 1 + paramInt4)];
            i += 1;
          }
          paramArrayOfDouble3[(i2 - 1 + paramInt6)] += paramDouble1 * d2;
          i1 += paramInt5;
          i2 += paramInt7;
          n += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dsymv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */