package org.netlib.lapack;

public final class Slagtm
{
  public static void slagtm(String paramString, int paramInt1, int paramInt2, float paramFloat1, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, int paramInt7, float paramFloat2, float[] paramArrayOfFloat5, int paramInt8, int paramInt9)
  {
    int i = 0;
    int j = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int k;
    int m;
    if ((paramFloat2 != 0.0F ? 0 : 1) != 0)
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = 0.0F;
          i += 1;
        }
        j += 1;
      }
    }
    else if ((paramFloat2 != -1.0F ? 0 : 1) != 0)
    {
      j = 1;
      k = paramInt2 - 1 + 1;
      for (;;)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (-paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)]);
          i += 1;
        }
        j += 1;
        k--;
        if (k <= 0) {
          break;
        }
      }
    }
    if ((paramFloat1 != 1.0F ? 0 : 1) != 0)
    {
      if (Lsame.lsame(paramString, "N"))
      {
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          if ((paramInt1 != 1 ? 0 : 1) != 0)
          {
            paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] += paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
          }
          else
          {
            paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat3[(1 - 1 + paramInt5)] * paramArrayOfFloat4[(2 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)] * paramArrayOfFloat4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            i = 2;
            for (m = paramInt1 - 1 - 2 + 1; m > 0; m--)
            {
              paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat1[(i - 1 - 1 + paramInt3)] * paramArrayOfFloat4[(i - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat2[(i - 1 + paramInt4)] * paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat3[(i - 1 + paramInt5)] * paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
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
            paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] += paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
          }
          else
          {
            paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat1[(1 - 1 + paramInt3)] * paramArrayOfFloat4[(2 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfFloat4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            i = 2;
            for (m = paramInt1 - 1 - 2 + 1; m > 0; m--)
            {
              paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] + paramArrayOfFloat3[(i - 1 - 1 + paramInt5)] * paramArrayOfFloat4[(i - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat2[(i - 1 + paramInt4)] * paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] + paramArrayOfFloat1[(i - 1 + paramInt3)] * paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
              i += 1;
            }
          }
          j += 1;
        }
      }
    }
    else if ((paramFloat1 != -1.0F ? 0 : 1) != 0)
    {
      if (Lsame.lsame(paramString, "N"))
      {
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          if ((paramInt1 != 1 ? 0 : 1) != 0)
          {
            paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] -= paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
          }
          else
          {
            paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat3[(1 - 1 + paramInt5)] * paramArrayOfFloat4[(2 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)] * paramArrayOfFloat4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
            i = 2;
            for (m = paramInt1 - 1 - 2 + 1; m > 0; m--)
            {
              paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfFloat1[(i - 1 - 1 + paramInt3)] * paramArrayOfFloat4[(i - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat2[(i - 1 + paramInt4)] * paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat3[(i - 1 + paramInt5)] * paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
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
          paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] -= paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
        }
        else
        {
          paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(1 - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat1[(1 - 1 + paramInt3)] * paramArrayOfFloat4[(2 - 1 + (j - 1) * paramInt7 + paramInt6)]);
          paramArrayOfFloat5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(paramInt1 - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfFloat4[(paramInt1 - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat4[(paramInt1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
          i = 2;
          for (m = paramInt1 - 1 - 2 + 1; m > 0; m--)
          {
            paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfFloat5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] - paramArrayOfFloat3[(i - 1 - 1 + paramInt5)] * paramArrayOfFloat4[(i - 1 - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat2[(i - 1 + paramInt4)] * paramArrayOfFloat4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat1[(i - 1 + paramInt3)] * paramArrayOfFloat4[(i + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slagtm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */