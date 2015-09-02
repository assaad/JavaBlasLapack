package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Sspmv
{
  public static void sspmv(String paramString, int paramInt1, float paramFloat1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float paramFloat2, float[] paramArrayOfFloat3, int paramInt5, int paramInt6)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
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
      Xerbla.xerbla("SSPMV ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {
      if ((paramFloat1 != 0.0F ? 0 : 1) == 0) {}
    }
    if ((((paramFloat2 != 1.0F ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
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
    if ((paramFloat2 == 1.0F ? 0 : 1) != 0) {
      if ((paramInt6 != 1 ? 0 : 1) != 0)
      {
        if ((paramFloat2 != 0.0F ? 0 : 1) != 0)
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfFloat3[(i - 1 + paramInt5)] = 0.0F;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfFloat3[(i - 1 + paramInt5)] = (paramFloat2 * paramArrayOfFloat3[(i - 1 + paramInt5)]);
            i += 1;
          }
        }
      }
      else
      {
        m = i6;
        if ((paramFloat2 != 0.0F ? 0 : 1) != 0)
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfFloat3[(m - 1 + paramInt5)] = 0.0F;
            m += paramInt6;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfFloat3[(m - 1 + paramInt5)] = (paramFloat2 * paramArrayOfFloat3[(m - 1 + paramInt5)]);
            m += paramInt6;
            i += 1;
          }
        }
      }
    }
    if ((paramFloat1 != 0.0F ? 0 : 1) != 0) {
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
          f1 = paramFloat1 * paramArrayOfFloat2[(n - 1 + paramInt3)];
          f2 = 0.0F;
          i3 = i4;
          i = 1;
          for (i8 = n - 1 - 1 + 1; i8 > 0; i8--)
          {
            paramArrayOfFloat3[(i - 1 + paramInt5)] += f1 * paramArrayOfFloat1[(i3 - 1 + paramInt2)];
            f2 += paramArrayOfFloat1[(i3 - 1 + paramInt2)] * paramArrayOfFloat2[(i - 1 + paramInt3)];
            i3 += 1;
            i += 1;
          }
          paramArrayOfFloat3[(n - 1 + paramInt5)] = (paramArrayOfFloat3[(n - 1 + paramInt5)] + f1 * paramArrayOfFloat1[(i4 + n - 1 - 1 + paramInt2)] + paramFloat1 * f2);
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
          f1 = paramFloat1 * paramArrayOfFloat2[(i1 - 1 + paramInt3)];
          f2 = 0.0F;
          k = i5;
          m = i6;
          i3 = i4;
          for (i8 = i4 + n - 2 - i4 + 1; i8 > 0; i8--)
          {
            paramArrayOfFloat3[(m - 1 + paramInt5)] += f1 * paramArrayOfFloat1[(i3 - 1 + paramInt2)];
            f2 += paramArrayOfFloat1[(i3 - 1 + paramInt2)] * paramArrayOfFloat2[(k - 1 + paramInt3)];
            k += paramInt4;
            m += paramInt6;
            i3 += 1;
          }
          paramArrayOfFloat3[(i2 - 1 + paramInt5)] = (paramArrayOfFloat3[(i2 - 1 + paramInt5)] + f1 * paramArrayOfFloat1[(i4 + n - 1 - 1 + paramInt2)] + paramFloat1 * f2);
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
          f1 = paramFloat1 * paramArrayOfFloat2[(n - 1 + paramInt3)];
          f2 = 0.0F;
          paramArrayOfFloat3[(n - 1 + paramInt5)] += f1 * paramArrayOfFloat1[(i4 - 1 + paramInt2)];
          i3 = i4 + 1;
          i = n + 1;
          for (i8 = paramInt1 - (n + 1) + 1; i8 > 0; i8--)
          {
            paramArrayOfFloat3[(i - 1 + paramInt5)] += f1 * paramArrayOfFloat1[(i3 - 1 + paramInt2)];
            f2 += paramArrayOfFloat1[(i3 - 1 + paramInt2)] * paramArrayOfFloat2[(i - 1 + paramInt3)];
            i3 += 1;
            i += 1;
          }
          paramArrayOfFloat3[(n - 1 + paramInt5)] += paramFloat1 * f2;
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
          f1 = paramFloat1 * paramArrayOfFloat2[(i1 - 1 + paramInt3)];
          f2 = 0.0F;
          paramArrayOfFloat3[(i2 - 1 + paramInt5)] += f1 * paramArrayOfFloat1[(i4 - 1 + paramInt2)];
          k = i1;
          m = i2;
          i3 = i4 + 1;
          for (i8 = i4 + paramInt1 - n - (i4 + 1) + 1; i8 > 0; i8--)
          {
            k += paramInt4;
            m += paramInt6;
            paramArrayOfFloat3[(m - 1 + paramInt5)] += f1 * paramArrayOfFloat1[(i3 - 1 + paramInt2)];
            f2 += paramArrayOfFloat1[(i3 - 1 + paramInt2)] * paramArrayOfFloat2[(k - 1 + paramInt3)];
            i3 += 1;
          }
          paramArrayOfFloat3[(i2 - 1 + paramInt5)] += paramFloat1 * f2;
          i1 += paramInt4;
          i2 += paramInt6;
          i4 += paramInt1 - n + 1;
          n += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Sspmv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */