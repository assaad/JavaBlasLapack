package org.netlib.arpack;

import org.netlib.lapack.Slapy2;

public final class Ssortc
{
  public static void ssortc(String paramString, boolean paramBoolean, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    j = paramInt1 / 2;
    int m;
    if (paramString.regionMatches(0, "LM", 0, 2)) {
      while ((j != 0 ? 0 : 1) == 0)
      {
        i = j;
        for (m = paramInt1 - 1 - j + 1; m > 0; m--)
        {
          k = i - j;
          while ((k >= 0 ? 0 : 1) == 0)
          {
            f2 = Slapy2.slapy2(paramArrayOfFloat1[(k - 0 + paramInt2)], paramArrayOfFloat2[(k - 0 + paramInt3)]);
            f3 = Slapy2.slapy2(paramArrayOfFloat1[(k + j - 0 + paramInt2)], paramArrayOfFloat2[(k + j - 0 + paramInt3)]);
            if ((f2 <= f3 ? 0 : 1) != 0)
            {
              f1 = paramArrayOfFloat1[(k - 0 + paramInt2)];
              paramArrayOfFloat1[(k - 0 + paramInt2)] = paramArrayOfFloat1[(k + j - 0 + paramInt2)];
              paramArrayOfFloat1[(k + j - 0 + paramInt2)] = f1;
              f1 = paramArrayOfFloat2[(k - 0 + paramInt3)];
              paramArrayOfFloat2[(k - 0 + paramInt3)] = paramArrayOfFloat2[(k + j - 0 + paramInt3)];
              paramArrayOfFloat2[(k + j - 0 + paramInt3)] = f1;
              if (paramBoolean)
              {
                f1 = paramArrayOfFloat3[(k - 0 + paramInt4)];
                paramArrayOfFloat3[(k - 0 + paramInt4)] = paramArrayOfFloat3[(k + j - 0 + paramInt4)];
                paramArrayOfFloat3[(k + j - 0 + paramInt4)] = f1;
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
            f2 = Slapy2.slapy2(paramArrayOfFloat1[(k - 0 + paramInt2)], paramArrayOfFloat2[(k - 0 + paramInt3)]);
            f3 = Slapy2.slapy2(paramArrayOfFloat1[(k + j - 0 + paramInt2)], paramArrayOfFloat2[(k + j - 0 + paramInt3)]);
            if ((f2 >= f3 ? 0 : 1) != 0)
            {
              f1 = paramArrayOfFloat1[(k - 0 + paramInt2)];
              paramArrayOfFloat1[(k - 0 + paramInt2)] = paramArrayOfFloat1[(k + j - 0 + paramInt2)];
              paramArrayOfFloat1[(k + j - 0 + paramInt2)] = f1;
              f1 = paramArrayOfFloat2[(k - 0 + paramInt3)];
              paramArrayOfFloat2[(k - 0 + paramInt3)] = paramArrayOfFloat2[(k + j - 0 + paramInt3)];
              paramArrayOfFloat2[(k + j - 0 + paramInt3)] = f1;
              if (paramBoolean)
              {
                f1 = paramArrayOfFloat3[(k - 0 + paramInt4)];
                paramArrayOfFloat3[(k - 0 + paramInt4)] = paramArrayOfFloat3[(k + j - 0 + paramInt4)];
                paramArrayOfFloat3[(k + j - 0 + paramInt4)] = f1;
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
    if (paramString.regionMatches(0, "LR", 0, 2)) {
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
              f1 = paramArrayOfFloat1[(k - 0 + paramInt2)];
              paramArrayOfFloat1[(k - 0 + paramInt2)] = paramArrayOfFloat1[(k + j - 0 + paramInt2)];
              paramArrayOfFloat1[(k + j - 0 + paramInt2)] = f1;
              f1 = paramArrayOfFloat2[(k - 0 + paramInt3)];
              paramArrayOfFloat2[(k - 0 + paramInt3)] = paramArrayOfFloat2[(k + j - 0 + paramInt3)];
              paramArrayOfFloat2[(k + j - 0 + paramInt3)] = f1;
              if (paramBoolean)
              {
                f1 = paramArrayOfFloat3[(k - 0 + paramInt4)];
                paramArrayOfFloat3[(k - 0 + paramInt4)] = paramArrayOfFloat3[(k + j - 0 + paramInt4)];
                paramArrayOfFloat3[(k + j - 0 + paramInt4)] = f1;
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
    if (paramString.regionMatches(0, "SR", 0, 2)) {
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
              f1 = paramArrayOfFloat1[(k - 0 + paramInt2)];
              paramArrayOfFloat1[(k - 0 + paramInt2)] = paramArrayOfFloat1[(k + j - 0 + paramInt2)];
              paramArrayOfFloat1[(k + j - 0 + paramInt2)] = f1;
              f1 = paramArrayOfFloat2[(k - 0 + paramInt3)];
              paramArrayOfFloat2[(k - 0 + paramInt3)] = paramArrayOfFloat2[(k + j - 0 + paramInt3)];
              paramArrayOfFloat2[(k + j - 0 + paramInt3)] = f1;
              if (paramBoolean)
              {
                f1 = paramArrayOfFloat3[(k - 0 + paramInt4)];
                paramArrayOfFloat3[(k - 0 + paramInt4)] = paramArrayOfFloat3[(k + j - 0 + paramInt4)];
                paramArrayOfFloat3[(k + j - 0 + paramInt4)] = f1;
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
    if (paramString.regionMatches(0, "LI", 0, 2)) {
      while ((j != 0 ? 0 : 1) == 0)
      {
        i = j;
        for (m = paramInt1 - 1 - j + 1; m > 0; m--)
        {
          k = i - j;
          while ((k >= 0 ? 0 : 1) == 0)
          {
            if ((Math.abs(paramArrayOfFloat2[(k - 0 + paramInt3)]) <= Math.abs(paramArrayOfFloat2[(k + j - 0 + paramInt3)]) ? 0 : 1) != 0)
            {
              f1 = paramArrayOfFloat1[(k - 0 + paramInt2)];
              paramArrayOfFloat1[(k - 0 + paramInt2)] = paramArrayOfFloat1[(k + j - 0 + paramInt2)];
              paramArrayOfFloat1[(k + j - 0 + paramInt2)] = f1;
              f1 = paramArrayOfFloat2[(k - 0 + paramInt3)];
              paramArrayOfFloat2[(k - 0 + paramInt3)] = paramArrayOfFloat2[(k + j - 0 + paramInt3)];
              paramArrayOfFloat2[(k + j - 0 + paramInt3)] = f1;
              if (paramBoolean)
              {
                f1 = paramArrayOfFloat3[(k - 0 + paramInt4)];
                paramArrayOfFloat3[(k - 0 + paramInt4)] = paramArrayOfFloat3[(k + j - 0 + paramInt4)];
                paramArrayOfFloat3[(k + j - 0 + paramInt4)] = f1;
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
    if (paramString.regionMatches(0, "SI", 0, 2)) {
      while ((j != 0 ? 0 : 1) == 0)
      {
        i = j;
        for (m = paramInt1 - 1 - j + 1; m > 0; m--)
        {
          k = i - j;
          while ((k >= 0 ? 0 : 1) == 0)
          {
            if ((Math.abs(paramArrayOfFloat2[(k - 0 + paramInt3)]) >= Math.abs(paramArrayOfFloat2[(k + j - 0 + paramInt3)]) ? 0 : 1) != 0)
            {
              f1 = paramArrayOfFloat1[(k - 0 + paramInt2)];
              paramArrayOfFloat1[(k - 0 + paramInt2)] = paramArrayOfFloat1[(k + j - 0 + paramInt2)];
              paramArrayOfFloat1[(k + j - 0 + paramInt2)] = f1;
              f1 = paramArrayOfFloat2[(k - 0 + paramInt3)];
              paramArrayOfFloat2[(k - 0 + paramInt3)] = paramArrayOfFloat2[(k + j - 0 + paramInt3)];
              paramArrayOfFloat2[(k + j - 0 + paramInt3)] = f1;
              if (paramBoolean)
              {
                f1 = paramArrayOfFloat3[(k - 0 + paramInt4)];
                paramArrayOfFloat3[(k - 0 + paramInt4)] = paramArrayOfFloat3[(k + j - 0 + paramInt4)];
                paramArrayOfFloat3[(k + j - 0 + paramInt4)] = f1;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Ssortc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */