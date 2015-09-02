package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Sgemv
{
  public static void sgemv(String paramString, int paramInt1, int paramInt2, float paramFloat1, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float paramFloat2, float[] paramArrayOfFloat3, int paramInt7, int paramInt8)
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
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    j = 0;
    if ((((Lsame.lsame(paramString, "N") ^ true)) && ((Lsame.lsame(paramString, "T") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "C") ^ true) ? 1 : 0) != 0) {
      j = 1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      j = 2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      j = 3;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      j = 6;
    } else if ((paramInt6 != 0 ? 0 : 1) != 0) {
      j = 8;
    } else if ((paramInt8 != 0 ? 0 : 1) != 0) {
      j = 11;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGEMV ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {
      if ((paramFloat1 != 0.0F ? 0 : 1) == 0) {}
    }
    if ((((paramFloat2 != 1.0F ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
      return;
    }
    if (Lsame.lsame(paramString, "N"))
    {
      i5 = paramInt2;
      i6 = paramInt1;
    }
    else
    {
      i5 = paramInt1;
      i6 = paramInt2;
    }
    if ((paramInt6 <= 0 ? 0 : 1) != 0) {
      i3 = 1;
    } else {
      i3 = 1 - (i5 - 1) * paramInt6;
    }
    if ((paramInt8 <= 0 ? 0 : 1) != 0) {
      i4 = 1;
    } else {
      i4 = 1 - (i6 - 1) * paramInt8;
    }
    int i7;
    if ((paramFloat2 == 1.0F ? 0 : 1) != 0) {
      if ((paramInt8 != 1 ? 0 : 1) != 0)
      {
        if ((paramFloat2 != 0.0F ? 0 : 1) != 0)
        {
          i = 1;
          for (i7 = i6 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfFloat3[(i - 1 + paramInt7)] = 0.0F;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i7 = i6 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfFloat3[(i - 1 + paramInt7)] = (paramFloat2 * paramArrayOfFloat3[(i - 1 + paramInt7)]);
            i += 1;
          }
        }
      }
      else
      {
        m = i4;
        if ((paramFloat2 != 0.0F ? 0 : 1) != 0)
        {
          i = 1;
          for (i7 = i6 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfFloat3[(m - 1 + paramInt7)] = 0.0F;
            m += paramInt8;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i7 = i6 - 1 + 1; i7 > 0; i7--)
          {
            paramArrayOfFloat3[(m - 1 + paramInt7)] = (paramFloat2 * paramArrayOfFloat3[(m - 1 + paramInt7)]);
            m += paramInt8;
            i += 1;
          }
        }
      }
    }
    if ((paramFloat1 != 0.0F ? 0 : 1) != 0) {
      return;
    }
    int i8;
    if (Lsame.lsame(paramString, "N"))
    {
      i1 = i3;
      if ((paramInt8 != 1 ? 0 : 1) != 0)
      {
        n = 1;
        for (i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
        {
          if ((paramArrayOfFloat2[(i1 - 1 + paramInt5)] == 0.0F ? 0 : 1) != 0)
          {
            f = paramFloat1 * paramArrayOfFloat2[(i1 - 1 + paramInt5)];
            i = 1;
            for (i8 = paramInt1 - 1 + 1; i8 > 0; i8--)
            {
              paramArrayOfFloat3[(i - 1 + paramInt7)] += f * paramArrayOfFloat1[(i - 1 + (n - 1) * paramInt4 + paramInt3)];
              i += 1;
            }
          }
          i1 += paramInt6;
          n += 1;
        }
      }
      else
      {
        n = 1;
        for (i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
        {
          if ((paramArrayOfFloat2[(i1 - 1 + paramInt5)] == 0.0F ? 0 : 1) != 0)
          {
            f = paramFloat1 * paramArrayOfFloat2[(i1 - 1 + paramInt5)];
            m = i4;
            i = 1;
            for (i8 = paramInt1 - 1 + 1; i8 > 0; i8--)
            {
              paramArrayOfFloat3[(m - 1 + paramInt7)] += f * paramArrayOfFloat1[(i - 1 + (n - 1) * paramInt4 + paramInt3)];
              m += paramInt8;
              i += 1;
            }
          }
          i1 += paramInt6;
          n += 1;
        }
      }
    }
    else
    {
      i2 = i4;
      if ((paramInt6 != 1 ? 0 : 1) != 0)
      {
        n = 1;
        for (i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
        {
          f = 0.0F;
          i = 1;
          for (i8 = paramInt1 - 1 + 1; i8 > 0; i8--)
          {
            f += paramArrayOfFloat1[(i - 1 + (n - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat2[(i - 1 + paramInt5)];
            i += 1;
          }
          paramArrayOfFloat3[(i2 - 1 + paramInt7)] += paramFloat1 * f;
          i2 += paramInt8;
          n += 1;
        }
      }
      else
      {
        n = 1;
        for (i7 = paramInt2 - 1 + 1; i7 > 0; i7--)
        {
          f = 0.0F;
          k = i3;
          i = 1;
          for (i8 = paramInt1 - 1 + 1; i8 > 0; i8--)
          {
            f += paramArrayOfFloat1[(i - 1 + (n - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat2[(k - 1 + paramInt5)];
            k += paramInt6;
            i += 1;
          }
          paramArrayOfFloat3[(i2 - 1 + paramInt7)] += paramFloat1 * f;
          i2 += paramInt8;
          n += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Sgemv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */