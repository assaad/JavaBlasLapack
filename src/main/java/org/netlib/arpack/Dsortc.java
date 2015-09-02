package org.netlib.arpack;

import org.netlib.lapack.Dlapy2;

public final class Dsortc
{
  public static void dsortc(String paramString, boolean paramBoolean, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
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
            d2 = Dlapy2.dlapy2(paramArrayOfDouble1[(k - 0 + paramInt2)], paramArrayOfDouble2[(k - 0 + paramInt3)]);
            d3 = Dlapy2.dlapy2(paramArrayOfDouble1[(k + j - 0 + paramInt2)], paramArrayOfDouble2[(k + j - 0 + paramInt3)]);
            if ((d2 <= d3 ? 0 : 1) != 0)
            {
              d1 = paramArrayOfDouble1[(k - 0 + paramInt2)];
              paramArrayOfDouble1[(k - 0 + paramInt2)] = paramArrayOfDouble1[(k + j - 0 + paramInt2)];
              paramArrayOfDouble1[(k + j - 0 + paramInt2)] = d1;
              d1 = paramArrayOfDouble2[(k - 0 + paramInt3)];
              paramArrayOfDouble2[(k - 0 + paramInt3)] = paramArrayOfDouble2[(k + j - 0 + paramInt3)];
              paramArrayOfDouble2[(k + j - 0 + paramInt3)] = d1;
              if (paramBoolean)
              {
                d1 = paramArrayOfDouble3[(k - 0 + paramInt4)];
                paramArrayOfDouble3[(k - 0 + paramInt4)] = paramArrayOfDouble3[(k + j - 0 + paramInt4)];
                paramArrayOfDouble3[(k + j - 0 + paramInt4)] = d1;
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
            d2 = Dlapy2.dlapy2(paramArrayOfDouble1[(k - 0 + paramInt2)], paramArrayOfDouble2[(k - 0 + paramInt3)]);
            d3 = Dlapy2.dlapy2(paramArrayOfDouble1[(k + j - 0 + paramInt2)], paramArrayOfDouble2[(k + j - 0 + paramInt3)]);
            if ((d2 >= d3 ? 0 : 1) != 0)
            {
              d1 = paramArrayOfDouble1[(k - 0 + paramInt2)];
              paramArrayOfDouble1[(k - 0 + paramInt2)] = paramArrayOfDouble1[(k + j - 0 + paramInt2)];
              paramArrayOfDouble1[(k + j - 0 + paramInt2)] = d1;
              d1 = paramArrayOfDouble2[(k - 0 + paramInt3)];
              paramArrayOfDouble2[(k - 0 + paramInt3)] = paramArrayOfDouble2[(k + j - 0 + paramInt3)];
              paramArrayOfDouble2[(k + j - 0 + paramInt3)] = d1;
              if (paramBoolean)
              {
                d1 = paramArrayOfDouble3[(k - 0 + paramInt4)];
                paramArrayOfDouble3[(k - 0 + paramInt4)] = paramArrayOfDouble3[(k + j - 0 + paramInt4)];
                paramArrayOfDouble3[(k + j - 0 + paramInt4)] = d1;
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
            if ((paramArrayOfDouble1[(k - 0 + paramInt2)] <= paramArrayOfDouble1[(k + j - 0 + paramInt2)] ? 0 : 1) != 0)
            {
              d1 = paramArrayOfDouble1[(k - 0 + paramInt2)];
              paramArrayOfDouble1[(k - 0 + paramInt2)] = paramArrayOfDouble1[(k + j - 0 + paramInt2)];
              paramArrayOfDouble1[(k + j - 0 + paramInt2)] = d1;
              d1 = paramArrayOfDouble2[(k - 0 + paramInt3)];
              paramArrayOfDouble2[(k - 0 + paramInt3)] = paramArrayOfDouble2[(k + j - 0 + paramInt3)];
              paramArrayOfDouble2[(k + j - 0 + paramInt3)] = d1;
              if (paramBoolean)
              {
                d1 = paramArrayOfDouble3[(k - 0 + paramInt4)];
                paramArrayOfDouble3[(k - 0 + paramInt4)] = paramArrayOfDouble3[(k + j - 0 + paramInt4)];
                paramArrayOfDouble3[(k + j - 0 + paramInt4)] = d1;
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
            if ((paramArrayOfDouble1[(k - 0 + paramInt2)] >= paramArrayOfDouble1[(k + j - 0 + paramInt2)] ? 0 : 1) != 0)
            {
              d1 = paramArrayOfDouble1[(k - 0 + paramInt2)];
              paramArrayOfDouble1[(k - 0 + paramInt2)] = paramArrayOfDouble1[(k + j - 0 + paramInt2)];
              paramArrayOfDouble1[(k + j - 0 + paramInt2)] = d1;
              d1 = paramArrayOfDouble2[(k - 0 + paramInt3)];
              paramArrayOfDouble2[(k - 0 + paramInt3)] = paramArrayOfDouble2[(k + j - 0 + paramInt3)];
              paramArrayOfDouble2[(k + j - 0 + paramInt3)] = d1;
              if (paramBoolean)
              {
                d1 = paramArrayOfDouble3[(k - 0 + paramInt4)];
                paramArrayOfDouble3[(k - 0 + paramInt4)] = paramArrayOfDouble3[(k + j - 0 + paramInt4)];
                paramArrayOfDouble3[(k + j - 0 + paramInt4)] = d1;
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
            if ((Math.abs(paramArrayOfDouble2[(k - 0 + paramInt3)]) <= Math.abs(paramArrayOfDouble2[(k + j - 0 + paramInt3)]) ? 0 : 1) != 0)
            {
              d1 = paramArrayOfDouble1[(k - 0 + paramInt2)];
              paramArrayOfDouble1[(k - 0 + paramInt2)] = paramArrayOfDouble1[(k + j - 0 + paramInt2)];
              paramArrayOfDouble1[(k + j - 0 + paramInt2)] = d1;
              d1 = paramArrayOfDouble2[(k - 0 + paramInt3)];
              paramArrayOfDouble2[(k - 0 + paramInt3)] = paramArrayOfDouble2[(k + j - 0 + paramInt3)];
              paramArrayOfDouble2[(k + j - 0 + paramInt3)] = d1;
              if (paramBoolean)
              {
                d1 = paramArrayOfDouble3[(k - 0 + paramInt4)];
                paramArrayOfDouble3[(k - 0 + paramInt4)] = paramArrayOfDouble3[(k + j - 0 + paramInt4)];
                paramArrayOfDouble3[(k + j - 0 + paramInt4)] = d1;
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
            if ((Math.abs(paramArrayOfDouble2[(k - 0 + paramInt3)]) >= Math.abs(paramArrayOfDouble2[(k + j - 0 + paramInt3)]) ? 0 : 1) != 0)
            {
              d1 = paramArrayOfDouble1[(k - 0 + paramInt2)];
              paramArrayOfDouble1[(k - 0 + paramInt2)] = paramArrayOfDouble1[(k + j - 0 + paramInt2)];
              paramArrayOfDouble1[(k + j - 0 + paramInt2)] = d1;
              d1 = paramArrayOfDouble2[(k - 0 + paramInt3)];
              paramArrayOfDouble2[(k - 0 + paramInt3)] = paramArrayOfDouble2[(k + j - 0 + paramInt3)];
              paramArrayOfDouble2[(k + j - 0 + paramInt3)] = d1;
              if (paramBoolean)
              {
                d1 = paramArrayOfDouble3[(k - 0 + paramInt4)];
                paramArrayOfDouble3[(k - 0 + paramInt4)] = paramArrayOfDouble3[(k + j - 0 + paramInt4)];
                paramArrayOfDouble3[(k + j - 0 + paramInt4)] = d1;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dsortc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */