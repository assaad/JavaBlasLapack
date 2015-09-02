package org.netlib.arpack;

public final class Ssortr
{
  public static void ssortr(String paramString, boolean paramBoolean, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    float f = 0.0F;
    j = paramInt1 / 2;
    int m;
    if (paramString.regionMatches(0, "SA", 0, 2)) {
      while ((j != 0 ? 0 : 1) == 0)
      {
        i = j;
        for (m = paramInt1 - 1 - j + 1; m > 0; m--)
        {
          k = i - j;
          while ((k >= 0 ? 0 : 1) == 0)
          {
            if ((paramArrayOfFloat1[(k - 0 + paramInt2)] >= paramArrayOfFloat1[(k + j - 0 + paramInt2)] ? 0 : 1) != 0)
            {
              f = paramArrayOfFloat1[(k - 0 + paramInt2)];
              paramArrayOfFloat1[(k - 0 + paramInt2)] = paramArrayOfFloat1[(k + j - 0 + paramInt2)];
              paramArrayOfFloat1[(k + j - 0 + paramInt2)] = f;
              if (paramBoolean)
              {
                f = paramArrayOfFloat2[(k - 0 + paramInt3)];
                paramArrayOfFloat2[(k - 0 + paramInt3)] = paramArrayOfFloat2[(k + j - 0 + paramInt3)];
                paramArrayOfFloat2[(k + j - 0 + paramInt3)] = f;
              }
            }
            else
            {
              break;
            }
            k -= j;
          }
          i += 1;
        }
        j /= 2;
      }
    }
    if (paramString.regionMatches(0, "SM", 0, 2)) {
      while ((j != 0 ? 0 : 1) == 0)
      {
        i = j;
        for (m = paramInt1 - 1 - j + 1; m > 0; m--)
        {
          k = i - j;
          while ((k >= 0 ? 0 : 1) == 0)
          {
            if ((Math.abs(paramArrayOfFloat1[(k - 0 + paramInt2)]) >= Math.abs(paramArrayOfFloat1[(k + j - 0 + paramInt2)]) ? 0 : 1) != 0)
            {
              f = paramArrayOfFloat1[(k - 0 + paramInt2)];
              paramArrayOfFloat1[(k - 0 + paramInt2)] = paramArrayOfFloat1[(k + j - 0 + paramInt2)];
              paramArrayOfFloat1[(k + j - 0 + paramInt2)] = f;
              if (paramBoolean)
              {
                f = paramArrayOfFloat2[(k - 0 + paramInt3)];
                paramArrayOfFloat2[(k - 0 + paramInt3)] = paramArrayOfFloat2[(k + j - 0 + paramInt3)];
                paramArrayOfFloat2[(k + j - 0 + paramInt3)] = f;
              }
            }
            else
            {
              break;
            }
            k -= j;
          }
          i += 1;
        }
        j /= 2;
      }
    }
    if (paramString.regionMatches(0, "LA", 0, 2)) {
      while ((j != 0 ? 0 : 1) == 0)
      {
        i = j;
        for (m = paramInt1 - 1 - j + 1; m > 0; m--)
        {
          k = i - j;
          while ((k >= 0 ? 0 : 1) == 0)
          {
            if ((paramArrayOfFloat1[(k - 0 + paramInt2)] <= paramArrayOfFloat1[(k + j - 0 + paramInt2)] ? 0 : 1) != 0)
            {
              f = paramArrayOfFloat1[(k - 0 + paramInt2)];
              paramArrayOfFloat1[(k - 0 + paramInt2)] = paramArrayOfFloat1[(k + j - 0 + paramInt2)];
              paramArrayOfFloat1[(k + j - 0 + paramInt2)] = f;
              if (paramBoolean)
              {
                f = paramArrayOfFloat2[(k - 0 + paramInt3)];
                paramArrayOfFloat2[(k - 0 + paramInt3)] = paramArrayOfFloat2[(k + j - 0 + paramInt3)];
                paramArrayOfFloat2[(k + j - 0 + paramInt3)] = f;
              }
            }
            else
            {
              break;
            }
            k -= j;
          }
          i += 1;
        }
        j /= 2;
      }
    }
    if (paramString.regionMatches(0, "LM", 0, 2)) {
      while ((j != 0 ? 0 : 1) == 0)
      {
        i = j;
        for (m = paramInt1 - 1 - j + 1; m > 0; m--)
        {
          k = i - j;
          while ((k >= 0 ? 0 : 1) == 0)
          {
            if ((Math.abs(paramArrayOfFloat1[(k - 0 + paramInt2)]) <= Math.abs(paramArrayOfFloat1[(k + j - 0 + paramInt2)]) ? 0 : 1) != 0)
            {
              f = paramArrayOfFloat1[(k - 0 + paramInt2)];
              paramArrayOfFloat1[(k - 0 + paramInt2)] = paramArrayOfFloat1[(k + j - 0 + paramInt2)];
              paramArrayOfFloat1[(k + j - 0 + paramInt2)] = f;
              if (paramBoolean)
              {
                f = paramArrayOfFloat2[(k - 0 + paramInt3)];
                paramArrayOfFloat2[(k - 0 + paramInt3)] = paramArrayOfFloat2[(k + j - 0 + paramInt3)];
                paramArrayOfFloat2[(k + j - 0 + paramInt3)] = f;
              }
            }
            else
            {
              break;
            }
            k -= j;
          }
          i += 1;
        }
        j /= 2;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Ssortr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */