package org.netlib.lapack;

public final class Dlagtm
{
  public static void dlagtm(String paramString, int paramInt1, int paramInt2, double paramDouble1, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, double paramDouble2, double[] paramArrayOfDouble5, int paramInt8, int paramInt9)
  {
    int i = 0;
    int j = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int k;
    int m;
    if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = 0.0D;
          i += 1;
        }
        j += 1;
      }
    }
    else if ((paramDouble2 != -1.0D ? 0 : 1) != 0)
    {
      j = 1;
      k = paramInt2 - 1 + 1;
      for (;;)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (-paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)]);
          i += 1;
        }
        j += 1;
        k--;
        if (k <= 0) {
          break;
        }
      }
    }
    if ((paramDouble1 != 1.0D ? 0 : 1) != 0)
    {
      if (Lsame.lsame(paramString, "N"))
      {
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          if ((paramInt1 != 1 ? 0 : 1) != 0)
          {
            paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] += paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
          }
          else
          {
            paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble3[(1 - 1 + paramInt5)] * paramArrayOfDouble4[(2 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)] * paramArrayOfDouble4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            i = 2;
            for (m = paramInt1 - 1 - 2 + 1; m > 0; m--)
            {
              paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble1[(i - 1 - 1 + paramInt3)] * paramArrayOfDouble4[(i - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble2[(i - 1 + paramInt4)] * paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble3[(i - 1 + paramInt5)] * paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
              i += 1;
            }
          }
          j += 1;
        }
      }
      else
      {
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          if ((paramInt1 != 1 ? 0 : 1) != 0)
          {
            paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] += paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
          }
          else
          {
            paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble1[(1 - 1 + paramInt3)] * paramArrayOfDouble4[(2 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfDouble4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            i = 2;
            for (m = paramInt1 - 1 - 2 + 1; m > 0; m--)
            {
              paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfDouble3[(i - 1 - 1 + paramInt5)] * paramArrayOfDouble4[(i - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble2[(i - 1 + paramInt4)] * paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfDouble1[(i - 1 + paramInt3)] * paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
              i += 1;
            }
          }
          j += 1;
        }
      }
    }
    else if ((paramDouble1 != -1.0D ? 0 : 1) != 0)
    {
      if (Lsame.lsame(paramString, "N"))
      {
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          if ((paramInt1 != 1 ? 0 : 1) != 0)
          {
            paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] -= paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
          }
          else
          {
            paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble3[(1 - 1 + paramInt5)] * paramArrayOfDouble4[(2 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)] * paramArrayOfDouble4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            i = 2;
            for (m = paramInt1 - 1 - 2 + 1; m > 0; m--)
            {
              paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfDouble1[(i - 1 - 1 + paramInt3)] * paramArrayOfDouble4[(i - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble2[(i - 1 + paramInt4)] * paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble3[(i - 1 + paramInt5)] * paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
              i += 1;
            }
          }
          j += 1;
        }
      }
      else
      {
        j = 1;
        k = paramInt2 - 1 + 1;
      }
      for (;;)
      {
        if ((paramInt1 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] -= paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
        }
        else
        {
          paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble1[(1 - 1 + paramInt3)] * paramArrayOfDouble4[(2 - 1 + (j - 1) * paramInt7 + paramInt6)]);
          paramArrayOfDouble5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfDouble4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
          i = 2;
          for (m = paramInt1 - 1 - 2 + 1; m > 0; m--)
          {
            paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfDouble3[(i - 1 - 1 + paramInt5)] * paramArrayOfDouble4[(i - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble2[(i - 1 + paramInt4)] * paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble1[(i - 1 + paramInt3)] * paramArrayOfDouble4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            i += 1;
          }
        }
        j += 1;
        k--;
        if (k <= 0) {
          break;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlagtm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */