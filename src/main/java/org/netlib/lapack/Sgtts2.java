package org.netlib.lapack;

public final class Sgtts2
{
  public static void sgtts2(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, int[] paramArrayOfInt, int paramInt8, float[] paramArrayOfFloat5, int paramInt9, int paramInt10)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    float f = 0.0F;
    if ((paramInt2 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    int m;
    int n;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      if ((paramInt3 > 1 ? 0 : 1) != 0)
      {
        k = 1;
        for (;;)
        {
          i = 1;
          for (m = paramInt2 - 1 - 1 + 1; m > 0; m--)
          {
            j = paramArrayOfInt[(i - 1 + paramInt8)];
            f = paramArrayOfFloat5[(i + 1 - j + i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat1[(i - 1 + paramInt4)] * paramArrayOfFloat5[(j - 1 + (k - 1) * paramInt10 + paramInt9)];
            paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = paramArrayOfFloat5[(j - 1 + (k - 1) * paramInt10 + paramInt9)];
            paramArrayOfFloat5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] = f;
            i += 1;
          }
          paramArrayOfFloat5[(paramInt2 - 1 + (k - 1) * paramInt10 + paramInt9)] /= paramArrayOfFloat2[(paramInt2 - 1 + paramInt5)];
          if ((paramInt2 <= 1 ? 0 : 1) != 0) {
            paramArrayOfFloat5[(paramInt2 - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfFloat5[(paramInt2 - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat3[(paramInt2 - 1 - 1 + paramInt6)] * paramArrayOfFloat5[(paramInt2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfFloat2[(paramInt2 - 1 - 1 + paramInt5)]);
          }
          i = paramInt2 - 2;
          for (m = (1 - (paramInt2 - 2) + -1) / -1; m > 0; m--)
          {
            paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat3[(i - 1 + paramInt6)] * paramArrayOfFloat5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat4[(i - 1 + paramInt7)] * paramArrayOfFloat5[(i + 2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfFloat2[(i - 1 + paramInt5)]);
            i += -1;
          }
          if ((k >= paramInt3 ? 0 : 1) == 0) {
            break;
          }
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (m = paramInt3 - 1 + 1; m > 0; m--)
        {
          i = 1;
          for (n = paramInt2 - 1 - 1 + 1; n > 0; n--)
          {
            if ((paramArrayOfInt[(i - 1 + paramInt8)] != i ? 0 : 1) != 0)
            {
              paramArrayOfFloat5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] -= paramArrayOfFloat1[(i - 1 + paramInt4)] * paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)];
            }
            else
            {
              f = paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)];
              paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = paramArrayOfFloat5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)];
              paramArrayOfFloat5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] = (f - paramArrayOfFloat1[(i - 1 + paramInt4)] * paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)]);
            }
            i += 1;
          }
          paramArrayOfFloat5[(paramInt2 - 1 + (k - 1) * paramInt10 + paramInt9)] /= paramArrayOfFloat2[(paramInt2 - 1 + paramInt5)];
          if ((paramInt2 <= 1 ? 0 : 1) != 0) {
            paramArrayOfFloat5[(paramInt2 - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfFloat5[(paramInt2 - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat3[(paramInt2 - 1 - 1 + paramInt6)] * paramArrayOfFloat5[(paramInt2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfFloat2[(paramInt2 - 1 - 1 + paramInt5)]);
          }
          i = paramInt2 - 2;
          for (n = (1 - (paramInt2 - 2) + -1) / -1; n > 0; n--)
          {
            paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat3[(i - 1 + paramInt6)] * paramArrayOfFloat5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat4[(i - 1 + paramInt7)] * paramArrayOfFloat5[(i + 2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfFloat2[(i - 1 + paramInt5)]);
            i += -1;
          }
          k += 1;
        }
      }
    }
    else if ((paramInt3 > 1 ? 0 : 1) != 0)
    {
      k = 1;
      for (;;)
      {
        paramArrayOfFloat5[(1 - 1 + (k - 1) * paramInt10 + paramInt9)] /= paramArrayOfFloat2[(1 - 1 + paramInt5)];
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          paramArrayOfFloat5[(2 - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfFloat5[(2 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat3[(1 - 1 + paramInt6)] * paramArrayOfFloat5[(1 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfFloat2[(2 - 1 + paramInt5)]);
        }
        i = 3;
        for (m = paramInt2 - 3 + 1; m > 0; m--)
        {
          paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat3[(i - 1 - 1 + paramInt6)] * paramArrayOfFloat5[(i - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat4[(i - 2 - 1 + paramInt7)] * paramArrayOfFloat5[(i - 2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfFloat2[(i - 1 + paramInt5)]);
          i += 1;
        }
        i = paramInt2 - 1;
        for (m = (1 - (paramInt2 - 1) + -1) / -1; m > 0; m--)
        {
          j = paramArrayOfInt[(i - 1 + paramInt8)];
          f = paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat1[(i - 1 + paramInt4)] * paramArrayOfFloat5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)];
          paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = paramArrayOfFloat5[(j - 1 + (k - 1) * paramInt10 + paramInt9)];
          paramArrayOfFloat5[(j - 1 + (k - 1) * paramInt10 + paramInt9)] = f;
          i += -1;
        }
        if ((k >= paramInt3 ? 0 : 1) == 0) {
          break;
        }
        k += 1;
      }
    }
    else
    {
      k = 1;
      for (m = paramInt3 - 1 + 1; m > 0; m--)
      {
        paramArrayOfFloat5[(1 - 1 + (k - 1) * paramInt10 + paramInt9)] /= paramArrayOfFloat2[(1 - 1 + paramInt5)];
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          paramArrayOfFloat5[(2 - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfFloat5[(2 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat3[(1 - 1 + paramInt6)] * paramArrayOfFloat5[(1 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfFloat2[(2 - 1 + paramInt5)]);
        }
        i = 3;
        for (n = paramInt2 - 3 + 1; n > 0; n--)
        {
          paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat3[(i - 1 - 1 + paramInt6)] * paramArrayOfFloat5[(i - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat4[(i - 2 - 1 + paramInt7)] * paramArrayOfFloat5[(i - 2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfFloat2[(i - 1 + paramInt5)]);
          i += 1;
        }
        i = paramInt2 - 1;
        for (n = (1 - (paramInt2 - 1) + -1) / -1; n > 0; n--)
        {
          if ((paramArrayOfInt[(i - 1 + paramInt8)] != i ? 0 : 1) != 0)
          {
            paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] -= paramArrayOfFloat1[(i - 1 + paramInt4)] * paramArrayOfFloat5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)];
          }
          else
          {
            f = paramArrayOfFloat5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)];
            paramArrayOfFloat5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] = (paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfFloat1[(i - 1 + paramInt4)] * f);
            paramArrayOfFloat5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = f;
          }
          i += -1;
        }
        k += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgtts2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */