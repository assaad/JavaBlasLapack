package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dsyrk
{
  public static void dsyrk(String paramString1, String paramString2, int paramInt1, int paramInt2, double paramDouble1, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double paramDouble2, double[] paramArrayOfDouble2, int paramInt5, int paramInt6)
  {
    double d = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    boolean bool = false;
    if (Lsame.lsame(paramString2, "N")) {
      n = paramInt1;
    } else {
      n = paramInt2;
    }
    bool = Lsame.lsame(paramString1, "U");
    j = 0;
    if ((((bool ^ true)) && ((Lsame.lsame(paramString1, "L") ^ true)) ? 1 : 0) != 0)
    {
      j = 1;
    }
    else
    {
      if ((((Lsame.lsame(paramString2, "N") ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0) {
        j = 2;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        j = 3;
      } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
        j = 4;
      } else if ((paramInt4 >= Math.max(1, n) ? 0 : 1) != 0) {
        j = 7;
      } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        j = 10;
      }
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYRK ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0)
    {
      if ((paramDouble1 != 0.0D ? 0 : 1) == 0) {}
      if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    }
    if ((((paramDouble2 != 1.0D ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
      return;
    }
    int i1;
    int i2;
    if ((paramDouble1 != 0.0D ? 0 : 1) != 0)
    {
      if (bool)
      {
        if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            i = 1;
            for (i2 = k - 1 + 1; i2 > 0; i2--)
            {
              paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = 0.0D;
              i += 1;
            }
            k += 1;
          }
        }
        else
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            i = 1;
            for (i2 = k - 1 + 1; i2 > 0; i2--)
            {
              paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramDouble2 * paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
              i += 1;
            }
            k += 1;
          }
        }
      }
      else if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          i = k;
          for (i2 = paramInt1 - k + 1; i2 > 0; i2--)
          {
            paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = 0.0D;
            i += 1;
          }
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          i = k;
          for (i2 = paramInt1 - k + 1; i2 > 0; i2--)
          {
            paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramDouble2 * paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
            i += 1;
          }
          k += 1;
        }
      }
      return;
    }
    int i3;
    if (Lsame.lsame(paramString2, "N"))
    {
      if (bool)
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
          {
            i = 1;
            for (i2 = k - 1 + 1; i2 > 0; i2--)
            {
              paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = 0.0D;
              i += 1;
            }
          }
          else if ((paramDouble2 == 1.0D ? 0 : 1) != 0)
          {
            i = 1;
            i2 = k - 1 + 1;
            for (;;)
            {
              paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramDouble2 * paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
              i += 1;
              i2--;
              if (i2 <= 0) {
                break;
              }
            }
          }
          m = 1;
          for (i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              d = paramDouble1 * paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)];
              i = 1;
              for (i3 = k - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] += d * paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt4 + paramInt3)];
                i += 1;
              }
            }
            m += 1;
          }
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
          {
            i = k;
            for (i2 = paramInt1 - k + 1; i2 > 0; i2--)
            {
              paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = 0.0D;
              i += 1;
            }
          }
          else if ((paramDouble2 == 1.0D ? 0 : 1) != 0)
          {
            i = k;
            i2 = paramInt1 - k + 1;
            for (;;)
            {
              paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramDouble2 * paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
              i += 1;
              i2--;
              if (i2 <= 0) {
                break;
              }
            }
          }
          m = 1;
          for (i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              d = paramDouble1 * paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)];
              i = k;
              for (i3 = paramInt1 - k + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] += d * paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt4 + paramInt3)];
                i += 1;
              }
            }
            m += 1;
          }
          k += 1;
        }
      }
    }
    else if (bool)
    {
      k = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        i = 1;
        for (i2 = k - 1 + 1; i2 > 0; i2--)
        {
          d = 0.0D;
          m = 1;
          for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
          {
            d += paramArrayOfDouble1[(m - 1 + (i - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble1[(m - 1 + (k - 1) * paramInt4 + paramInt3)];
            m += 1;
          }
          if ((paramDouble2 != 0.0D ? 0 : 1) != 0) {
            paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramDouble1 * d);
          } else {
            paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramDouble1 * d + paramDouble2 * paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
          }
          i += 1;
        }
        k += 1;
      }
    }
    else
    {
      k = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        i = k;
        for (i2 = paramInt1 - k + 1; i2 > 0; i2--)
        {
          d = 0.0D;
          m = 1;
          for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
          {
            d += paramArrayOfDouble1[(m - 1 + (i - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble1[(m - 1 + (k - 1) * paramInt4 + paramInt3)];
            m += 1;
          }
          if ((paramDouble2 != 0.0D ? 0 : 1) != 0) {
            paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramDouble1 * d);
          } else {
            paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramDouble1 * d + paramDouble2 * paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
          }
          i += 1;
        }
        k += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dsyrk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */