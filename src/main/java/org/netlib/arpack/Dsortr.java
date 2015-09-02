package org.netlib.arpack;

public final class Dsortr
{
  public static void dsortr(String paramString, boolean paramBoolean, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    double d = 0.0D;
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
            if ((paramArrayOfDouble1[(k - 0 + paramInt2)] >= paramArrayOfDouble1[(k + j - 0 + paramInt2)] ? 0 : 1) != 0)
            {
              d = paramArrayOfDouble1[(k - 0 + paramInt2)];
              paramArrayOfDouble1[(k - 0 + paramInt2)] = paramArrayOfDouble1[(k + j - 0 + paramInt2)];
              paramArrayOfDouble1[(k + j - 0 + paramInt2)] = d;
              if (paramBoolean)
              {
                d = paramArrayOfDouble2[(k - 0 + paramInt3)];
                paramArrayOfDouble2[(k - 0 + paramInt3)] = paramArrayOfDouble2[(k + j - 0 + paramInt3)];
                paramArrayOfDouble2[(k + j - 0 + paramInt3)] = d;
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
            if ((Math.abs(paramArrayOfDouble1[(k - 0 + paramInt2)]) >= Math.abs(paramArrayOfDouble1[(k + j - 0 + paramInt2)]) ? 0 : 1) != 0)
            {
              d = paramArrayOfDouble1[(k - 0 + paramInt2)];
              paramArrayOfDouble1[(k - 0 + paramInt2)] = paramArrayOfDouble1[(k + j - 0 + paramInt2)];
              paramArrayOfDouble1[(k + j - 0 + paramInt2)] = d;
              if (paramBoolean)
              {
                d = paramArrayOfDouble2[(k - 0 + paramInt3)];
                paramArrayOfDouble2[(k - 0 + paramInt3)] = paramArrayOfDouble2[(k + j - 0 + paramInt3)];
                paramArrayOfDouble2[(k + j - 0 + paramInt3)] = d;
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
            if ((paramArrayOfDouble1[(k - 0 + paramInt2)] <= paramArrayOfDouble1[(k + j - 0 + paramInt2)] ? 0 : 1) != 0)
            {
              d = paramArrayOfDouble1[(k - 0 + paramInt2)];
              paramArrayOfDouble1[(k - 0 + paramInt2)] = paramArrayOfDouble1[(k + j - 0 + paramInt2)];
              paramArrayOfDouble1[(k + j - 0 + paramInt2)] = d;
              if (paramBoolean)
              {
                d = paramArrayOfDouble2[(k - 0 + paramInt3)];
                paramArrayOfDouble2[(k - 0 + paramInt3)] = paramArrayOfDouble2[(k + j - 0 + paramInt3)];
                paramArrayOfDouble2[(k + j - 0 + paramInt3)] = d;
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
            if ((Math.abs(paramArrayOfDouble1[(k - 0 + paramInt2)]) <= Math.abs(paramArrayOfDouble1[(k + j - 0 + paramInt2)]) ? 0 : 1) != 0)
            {
              d = paramArrayOfDouble1[(k - 0 + paramInt2)];
              paramArrayOfDouble1[(k - 0 + paramInt2)] = paramArrayOfDouble1[(k + j - 0 + paramInt2)];
              paramArrayOfDouble1[(k + j - 0 + paramInt2)] = d;
              if (paramBoolean)
              {
                d = paramArrayOfDouble2[(k - 0 + paramInt3)];
                paramArrayOfDouble2[(k - 0 + paramInt3)] = paramArrayOfDouble2[(k + j - 0 + paramInt3)];
                paramArrayOfDouble2[(k + j - 0 + paramInt3)] = d;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dsortr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */