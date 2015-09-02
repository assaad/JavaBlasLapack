package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dspr2
{
  public static void dspr2(String paramString, int paramInt1, double paramDouble, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6)
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
    } else if ((paramInt3 != 0 ? 0 : 1) != 0) {
      j = 5;
    } else if ((paramInt5 != 0 ? 0 : 1) != 0) {
      j = 7;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPR2 ", j);
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
        i5 = 1;
      } else {
        i5 = 1 - (paramInt1 - 1) * paramInt3;
      }
      if ((paramInt5 <= 0 ? 0 : 1) != 0) {
        i6 = 1;
      } else {
        i6 = 1 - (paramInt1 - 1) * paramInt5;
      }
      i1 = i5;
      i2 = i6;
    }
    i4 = 1;
    int i7;
    int i8;
    if (Lsame.lsame(paramString, "U"))
    {
      if ((paramInt3 != 1 ? 0 : 1) != 0) {}
      if (((paramInt5 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          if ((paramArrayOfDouble1[(n - 1 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
          if (((paramArrayOfDouble2[(n - 1 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            d1 = paramDouble * paramArrayOfDouble2[(n - 1 + paramInt4)];
            d2 = paramDouble * paramArrayOfDouble1[(n - 1 + paramInt2)];
            i3 = i4;
            i = 1;
            for (i8 = n - 1 + 1; i8 > 0; i8--)
            {
              paramArrayOfDouble3[(i3 - 1 + paramInt6)] = (paramArrayOfDouble3[(i3 - 1 + paramInt6)] + paramArrayOfDouble1[(i - 1 + paramInt2)] * d1 + paramArrayOfDouble2[(i - 1 + paramInt4)] * d2);
              i3 += 1;
              i += 1;
            }
          }
          i4 += n;
          n += 1;
        }
      }
      else
      {
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          if ((paramArrayOfDouble1[(i1 - 1 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
          if (((paramArrayOfDouble2[(i2 - 1 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            d1 = paramDouble * paramArrayOfDouble2[(i2 - 1 + paramInt4)];
            d2 = paramDouble * paramArrayOfDouble1[(i1 - 1 + paramInt2)];
            k = i5;
            m = i6;
            i3 = i4;
            for (i8 = i4 + n - 1 - i4 + 1; i8 > 0; i8--)
            {
              paramArrayOfDouble3[(i3 - 1 + paramInt6)] = (paramArrayOfDouble3[(i3 - 1 + paramInt6)] + paramArrayOfDouble1[(k - 1 + paramInt2)] * d1 + paramArrayOfDouble2[(m - 1 + paramInt4)] * d2);
              k += paramInt3;
              m += paramInt5;
              i3 += 1;
            }
          }
          i1 += paramInt3;
          i2 += paramInt5;
          i4 += n;
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
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          if ((paramArrayOfDouble1[(n - 1 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
          if (((paramArrayOfDouble2[(n - 1 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            d1 = paramDouble * paramArrayOfDouble2[(n - 1 + paramInt4)];
            d2 = paramDouble * paramArrayOfDouble1[(n - 1 + paramInt2)];
            i3 = i4;
            i = n;
            for (i8 = paramInt1 - n + 1; i8 > 0; i8--)
            {
              paramArrayOfDouble3[(i3 - 1 + paramInt6)] = (paramArrayOfDouble3[(i3 - 1 + paramInt6)] + paramArrayOfDouble1[(i - 1 + paramInt2)] * d1 + paramArrayOfDouble2[(i - 1 + paramInt4)] * d2);
              i3 += 1;
              i += 1;
            }
          }
          i4 = i4 + paramInt1 - n + 1;
          n += 1;
        }
      }
      else
      {
        n = 1;
        for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
        {
          if ((paramArrayOfDouble1[(i1 - 1 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
          if (((paramArrayOfDouble2[(i2 - 1 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            d1 = paramDouble * paramArrayOfDouble2[(i2 - 1 + paramInt4)];
            d2 = paramDouble * paramArrayOfDouble1[(i1 - 1 + paramInt2)];
            k = i1;
            m = i2;
            i3 = i4;
            for (i8 = i4 + paramInt1 - n - i4 + 1; i8 > 0; i8--)
            {
              paramArrayOfDouble3[(i3 - 1 + paramInt6)] = (paramArrayOfDouble3[(i3 - 1 + paramInt6)] + paramArrayOfDouble1[(k - 1 + paramInt2)] * d1 + paramArrayOfDouble2[(m - 1 + paramInt4)] * d2);
              k += paramInt3;
              m += paramInt5;
              i3 += 1;
            }
          }
          i1 += paramInt3;
          i2 += paramInt5;
          i4 = i4 + paramInt1 - n + 1;
          n += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dspr2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */