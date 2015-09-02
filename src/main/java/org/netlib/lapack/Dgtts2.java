package org.netlib.lapack;

public final class Dgtts2
{
  public static void dgtts2(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, int[] paramArrayOfInt, int paramInt8, double[] paramArrayOfDouble5, int paramInt9, int paramInt10)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    double d = 0.0D;
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
            d = paramArrayOfDouble5[(i + 1 - j + i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble1[(i - 1 + paramInt4)] * paramArrayOfDouble5[(j - 1 + (k - 1) * paramInt10 + paramInt9)];
            paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = paramArrayOfDouble5[(j - 1 + (k - 1) * paramInt10 + paramInt9)];
            paramArrayOfDouble5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] = d;
            i += 1;
          }
          paramArrayOfDouble5[(paramInt2 - 1 + (k - 1) * paramInt10 + paramInt9)] /= paramArrayOfDouble2[(paramInt2 - 1 + paramInt5)];
          if ((paramInt2 <= 1 ? 0 : 1) != 0) {
            paramArrayOfDouble5[(paramInt2 - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfDouble5[(paramInt2 - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble3[(paramInt2 - 1 - 1 + paramInt6)] * paramArrayOfDouble5[(paramInt2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfDouble2[(paramInt2 - 1 - 1 + paramInt5)]);
          }
          i = paramInt2 - 2;
          for (m = (1 - (paramInt2 - 2) + -1) / -1; m > 0; m--)
          {
            paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble3[(i - 1 + paramInt6)] * paramArrayOfDouble5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble4[(i - 1 + paramInt7)] * paramArrayOfDouble5[(i + 2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfDouble2[(i - 1 + paramInt5)]);
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
              paramArrayOfDouble5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] -= paramArrayOfDouble1[(i - 1 + paramInt4)] * paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)];
            }
            else
            {
              d = paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)];
              paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = paramArrayOfDouble5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)];
              paramArrayOfDouble5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] = (d - paramArrayOfDouble1[(i - 1 + paramInt4)] * paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)]);
            }
            i += 1;
          }
          paramArrayOfDouble5[(paramInt2 - 1 + (k - 1) * paramInt10 + paramInt9)] /= paramArrayOfDouble2[(paramInt2 - 1 + paramInt5)];
          if ((paramInt2 <= 1 ? 0 : 1) != 0) {
            paramArrayOfDouble5[(paramInt2 - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfDouble5[(paramInt2 - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble3[(paramInt2 - 1 - 1 + paramInt6)] * paramArrayOfDouble5[(paramInt2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfDouble2[(paramInt2 - 1 - 1 + paramInt5)]);
          }
          i = paramInt2 - 2;
          for (n = (1 - (paramInt2 - 2) + -1) / -1; n > 0; n--)
          {
            paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble3[(i - 1 + paramInt6)] * paramArrayOfDouble5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble4[(i - 1 + paramInt7)] * paramArrayOfDouble5[(i + 2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfDouble2[(i - 1 + paramInt5)]);
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
        paramArrayOfDouble5[(1 - 1 + (k - 1) * paramInt10 + paramInt9)] /= paramArrayOfDouble2[(1 - 1 + paramInt5)];
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          paramArrayOfDouble5[(2 - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfDouble5[(2 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble3[(1 - 1 + paramInt6)] * paramArrayOfDouble5[(1 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfDouble2[(2 - 1 + paramInt5)]);
        }
        i = 3;
        for (m = paramInt2 - 3 + 1; m > 0; m--)
        {
          paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble3[(i - 1 - 1 + paramInt6)] * paramArrayOfDouble5[(i - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble4[(i - 2 - 1 + paramInt7)] * paramArrayOfDouble5[(i - 2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfDouble2[(i - 1 + paramInt5)]);
          i += 1;
        }
        i = paramInt2 - 1;
        for (m = (1 - (paramInt2 - 1) + -1) / -1; m > 0; m--)
        {
          j = paramArrayOfInt[(i - 1 + paramInt8)];
          d = paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble1[(i - 1 + paramInt4)] * paramArrayOfDouble5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)];
          paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = paramArrayOfDouble5[(j - 1 + (k - 1) * paramInt10 + paramInt9)];
          paramArrayOfDouble5[(j - 1 + (k - 1) * paramInt10 + paramInt9)] = d;
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
        paramArrayOfDouble5[(1 - 1 + (k - 1) * paramInt10 + paramInt9)] /= paramArrayOfDouble2[(1 - 1 + paramInt5)];
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          paramArrayOfDouble5[(2 - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfDouble5[(2 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble3[(1 - 1 + paramInt6)] * paramArrayOfDouble5[(1 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfDouble2[(2 - 1 + paramInt5)]);
        }
        i = 3;
        for (n = paramInt2 - 3 + 1; n > 0; n--)
        {
          paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = ((paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble3[(i - 1 - 1 + paramInt6)] * paramArrayOfDouble5[(i - 1 - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble4[(i - 2 - 1 + paramInt7)] * paramArrayOfDouble5[(i - 2 - 1 + (k - 1) * paramInt10 + paramInt9)]) / paramArrayOfDouble2[(i - 1 + paramInt5)]);
          i += 1;
        }
        i = paramInt2 - 1;
        for (n = (1 - (paramInt2 - 1) + -1) / -1; n > 0; n--)
        {
          if ((paramArrayOfInt[(i - 1 + paramInt8)] != i ? 0 : 1) != 0)
          {
            paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] -= paramArrayOfDouble1[(i - 1 + paramInt4)] * paramArrayOfDouble5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)];
          }
          else
          {
            d = paramArrayOfDouble5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)];
            paramArrayOfDouble5[(i + 1 - 1 + (k - 1) * paramInt10 + paramInt9)] = (paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] - paramArrayOfDouble1[(i - 1 + paramInt4)] * d);
            paramArrayOfDouble5[(i - 1 + (k - 1) * paramInt10 + paramInt9)] = d;
          }
          i += -1;
        }
        k += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgtts2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */