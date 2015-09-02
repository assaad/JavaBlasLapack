package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Ssyr2
{
  public static void ssyr2(String paramString, int paramInt1, float paramFloat, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7)
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
      Xerbla.xerbla("SSYR2 ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramFloat != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
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
          if ((paramArrayOfFloat1[(n - 1 + paramInt2)] == 0.0F ? 0 : 1) == 0) {}
          if (((paramArrayOfFloat2[(n - 1 + paramInt4)] == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            f1 = paramFloat * paramArrayOfFloat2[(n - 1 + paramInt4)];
            f2 = paramFloat * paramArrayOfFloat1[(n - 1 + paramInt2)];
            i = 1;
            for (i6 = n - 1 + 1; i6 > 0; i6--)
            {
              paramArrayOfFloat3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat1[(i - 1 + paramInt2)] * f1 + paramArrayOfFloat2[(i - 1 + paramInt4)] * f2);
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
          if ((paramArrayOfFloat1[(i1 - 1 + paramInt2)] == 0.0F ? 0 : 1) == 0) {}
          if (((paramArrayOfFloat2[(i2 - 1 + paramInt4)] == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            f1 = paramFloat * paramArrayOfFloat2[(i2 - 1 + paramInt4)];
            f2 = paramFloat * paramArrayOfFloat1[(i1 - 1 + paramInt2)];
            k = i3;
            m = i4;
            i = 1;
            for (i6 = n - 1 + 1; i6 > 0; i6--)
            {
              paramArrayOfFloat3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat1[(k - 1 + paramInt2)] * f1 + paramArrayOfFloat2[(m - 1 + paramInt4)] * f2);
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
          if ((paramArrayOfFloat1[(n - 1 + paramInt2)] == 0.0F ? 0 : 1) == 0) {}
          if (((paramArrayOfFloat2[(n - 1 + paramInt4)] == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            f1 = paramFloat * paramArrayOfFloat2[(n - 1 + paramInt4)];
            f2 = paramFloat * paramArrayOfFloat1[(n - 1 + paramInt2)];
            i = n;
            for (i6 = paramInt1 - n + 1; i6 > 0; i6--)
            {
              paramArrayOfFloat3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat1[(i - 1 + paramInt2)] * f1 + paramArrayOfFloat2[(i - 1 + paramInt4)] * f2);
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
          if ((paramArrayOfFloat1[(i1 - 1 + paramInt2)] == 0.0F ? 0 : 1) == 0) {}
          if (((paramArrayOfFloat2[(i2 - 1 + paramInt4)] == 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            f1 = paramFloat * paramArrayOfFloat2[(i2 - 1 + paramInt4)];
            f2 = paramFloat * paramArrayOfFloat1[(i1 - 1 + paramInt2)];
            k = i1;
            m = i2;
            i = n;
            for (i6 = paramInt1 - n + 1; i6 > 0; i6--)
            {
              paramArrayOfFloat3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat3[(i - 1 + (n - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat1[(k - 1 + paramInt2)] * f1 + paramArrayOfFloat2[(m - 1 + paramInt4)] * f2);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Ssyr2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */