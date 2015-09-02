package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Sgbmv
{
  public static void sgbmv(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float[] paramArrayOfFloat1, int paramInt5, int paramInt6, float[] paramArrayOfFloat2, int paramInt7, int paramInt8, float paramFloat2, float[] paramArrayOfFloat3, int paramInt9, int paramInt10)
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
    int i7 = 0;
    int i8 = 0;
    j = 0;
    if ((((Lsame.lsame(paramString, "N") ^ true)) && ((Lsame.lsame(paramString, "T") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "C") ^ true) ? 1 : 0) != 0) {
      j = 1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      j = 2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      j = 3;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      j = 4;
    } else if ((paramInt4 >= 0 ? 0 : 1) != 0) {
      j = 5;
    } else if ((paramInt6 >= paramInt3 + paramInt4 + 1 ? 0 : 1) != 0) {
      j = 8;
    } else if ((paramInt8 != 0 ? 0 : 1) != 0) {
      j = 10;
    } else if ((paramInt10 != 0 ? 0 : 1) != 0) {
      j = 13;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGBMV ", j);
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
      i7 = paramInt2;
      i8 = paramInt1;
    }
    else
    {
      i7 = paramInt1;
      i8 = paramInt2;
    }
    if ((paramInt8 <= 0 ? 0 : 1) != 0) {
      i5 = 1;
    } else {
      i5 = 1 - (i7 - 1) * paramInt8;
    }
    if ((paramInt10 <= 0 ? 0 : 1) != 0) {
      i6 = 1;
    } else {
      i6 = 1 - (i8 - 1) * paramInt10;
    }
    int i9;
    if ((paramFloat2 == 1.0F ? 0 : 1) != 0) {
      if ((paramInt10 != 1 ? 0 : 1) != 0)
      {
        if ((paramFloat2 != 0.0F ? 0 : 1) != 0)
        {
          i = 1;
          for (i9 = i8 - 1 + 1; i9 > 0; i9--)
          {
            paramArrayOfFloat3[(i - 1 + paramInt9)] = 0.0F;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i9 = i8 - 1 + 1; i9 > 0; i9--)
          {
            paramArrayOfFloat3[(i - 1 + paramInt9)] = (paramFloat2 * paramArrayOfFloat3[(i - 1 + paramInt9)]);
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
          for (i9 = i8 - 1 + 1; i9 > 0; i9--)
          {
            paramArrayOfFloat3[(m - 1 + paramInt9)] = 0.0F;
            m += paramInt10;
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i9 = i8 - 1 + 1; i9 > 0; i9--)
          {
            paramArrayOfFloat3[(m - 1 + paramInt9)] = (paramFloat2 * paramArrayOfFloat3[(m - 1 + paramInt9)]);
            m += paramInt10;
            i += 1;
          }
        }
      }
    }
    if ((paramFloat1 != 0.0F ? 0 : 1) != 0) {
      return;
    }
    i4 = paramInt4 + 1;
    int i10;
    if (Lsame.lsame(paramString, "N"))
    {
      i1 = i5;
      if ((paramInt10 != 1 ? 0 : 1) != 0)
      {
        n = 1;
        for (i9 = paramInt2 - 1 + 1; i9 > 0; i9--)
        {
          if ((paramArrayOfFloat2[(i1 - 1 + paramInt7)] == 0.0F ? 0 : 1) != 0)
          {
            f = paramFloat1 * paramArrayOfFloat2[(i1 - 1 + paramInt7)];
            i3 = i4 - n;
            i = Math.max(1, n - paramInt4);
            for (i10 = Math.min(paramInt1, n + paramInt3) - Math.max(1, n - paramInt4) + 1; i10 > 0; i10--)
            {
              paramArrayOfFloat3[(i - 1 + paramInt9)] += f * paramArrayOfFloat1[(i3 + i - 1 + (n - 1) * paramInt6 + paramInt5)];
              i += 1;
            }
          }
          i1 += paramInt8;
          n += 1;
        }
      }
      else
      {
        n = 1;
        for (i9 = paramInt2 - 1 + 1; i9 > 0; i9--)
        {
          if ((paramArrayOfFloat2[(i1 - 1 + paramInt7)] == 0.0F ? 0 : 1) != 0)
          {
            f = paramFloat1 * paramArrayOfFloat2[(i1 - 1 + paramInt7)];
            m = i6;
            i3 = i4 - n;
            i = Math.max(1, n - paramInt4);
            for (i10 = Math.min(paramInt1, n + paramInt3) - Math.max(1, n - paramInt4) + 1; i10 > 0; i10--)
            {
              paramArrayOfFloat3[(m - 1 + paramInt9)] += f * paramArrayOfFloat1[(i3 + i - 1 + (n - 1) * paramInt6 + paramInt5)];
              m += paramInt10;
              i += 1;
            }
          }
          i1 += paramInt8;
          if ((n <= paramInt4 ? 0 : 1) != 0) {
            i6 += paramInt10;
          }
          n += 1;
        }
      }
    }
    else
    {
      i2 = i6;
      if ((paramInt8 != 1 ? 0 : 1) != 0)
      {
        n = 1;
        for (i9 = paramInt2 - 1 + 1; i9 > 0; i9--)
        {
          f = 0.0F;
          i3 = i4 - n;
          i = Math.max(1, n - paramInt4);
          for (i10 = Math.min(paramInt1, n + paramInt3) - Math.max(1, n - paramInt4) + 1; i10 > 0; i10--)
          {
            f += paramArrayOfFloat1[(i3 + i - 1 + (n - 1) * paramInt6 + paramInt5)] * paramArrayOfFloat2[(i - 1 + paramInt7)];
            i += 1;
          }
          paramArrayOfFloat3[(i2 - 1 + paramInt9)] += paramFloat1 * f;
          i2 += paramInt10;
          n += 1;
        }
      }
      else
      {
        n = 1;
        for (i9 = paramInt2 - 1 + 1; i9 > 0; i9--)
        {
          f = 0.0F;
          k = i5;
          i3 = i4 - n;
          i = Math.max(1, n - paramInt4);
          for (i10 = Math.min(paramInt1, n + paramInt3) - Math.max(1, n - paramInt4) + 1; i10 > 0; i10--)
          {
            f += paramArrayOfFloat1[(i3 + i - 1 + (n - 1) * paramInt6 + paramInt5)] * paramArrayOfFloat2[(k - 1 + paramInt7)];
            k += paramInt8;
            i += 1;
          }
          paramArrayOfFloat3[(i2 - 1 + paramInt9)] += paramFloat1 * f;
          i2 += paramInt10;
          if ((n <= paramInt4 ? 0 : 1) != 0) {
            i5 += paramInt8;
          }
          n += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Sgbmv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */