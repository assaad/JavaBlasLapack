package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dsyr2k
{
  public static void dsyr2k(String paramString1, String paramString2, int paramInt1, int paramInt2, double paramDouble1, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double paramDouble2, double[] paramArrayOfDouble3, int paramInt7, int paramInt8)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
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
      } else if ((paramInt6 >= Math.max(1, n) ? 0 : 1) != 0) {
        j = 9;
      } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        j = 12;
      }
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYR2K", j);
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
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = 0.0D;
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
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)]);
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
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = 0.0D;
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
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)]);
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
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = 0.0D;
              i += 1;
            }
          }
          else if ((paramDouble2 == 1.0D ? 0 : 1) != 0)
          {
            i = 1;
            i2 = k - 1 + 1;
            for (;;)
            {
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)]);
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
            if ((paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) == 0) {}
            if (((paramArrayOfDouble2[(k - 1 + (m - 1) * paramInt6 + paramInt5)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              d1 = paramDouble1 * paramArrayOfDouble2[(k - 1 + (m - 1) * paramInt6 + paramInt5)];
              d2 = paramDouble1 * paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)];
              i = 1;
              for (i3 = k - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = (paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] + paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt4 + paramInt3)] * d1 + paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] * d2);
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
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = 0.0D;
              i += 1;
            }
          }
          else if ((paramDouble2 == 1.0D ? 0 : 1) != 0)
          {
            i = k;
            i2 = paramInt1 - k + 1;
            for (;;)
            {
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)]);
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
            if ((paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) == 0) {}
            if (((paramArrayOfDouble2[(k - 1 + (m - 1) * paramInt6 + paramInt5)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
            {
              d1 = paramDouble1 * paramArrayOfDouble2[(k - 1 + (m - 1) * paramInt6 + paramInt5)];
              d2 = paramDouble1 * paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)];
              i = k;
              for (i3 = paramInt1 - k + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = (paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] + paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt4 + paramInt3)] * d1 + paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] * d2);
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
          d1 = 0.0D;
          d2 = 0.0D;
          m = 1;
          for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
          {
            d1 += paramArrayOfDouble1[(m - 1 + (i - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)];
            d2 += paramArrayOfDouble2[(m - 1 + (i - 1) * paramInt6 + paramInt5)] * paramArrayOfDouble1[(m - 1 + (k - 1) * paramInt4 + paramInt3)];
            m += 1;
          }
          if ((paramDouble2 != 0.0D ? 0 : 1) != 0) {
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = (paramDouble1 * d1 + paramDouble1 * d2);
          } else {
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] + paramDouble1 * d1 + paramDouble1 * d2);
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
          d1 = 0.0D;
          d2 = 0.0D;
          m = 1;
          for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
          {
            d1 += paramArrayOfDouble1[(m - 1 + (i - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)];
            d2 += paramArrayOfDouble2[(m - 1 + (i - 1) * paramInt6 + paramInt5)] * paramArrayOfDouble1[(m - 1 + (k - 1) * paramInt4 + paramInt3)];
            m += 1;
          }
          if ((paramDouble2 != 0.0D ? 0 : 1) != 0) {
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = (paramDouble1 * d1 + paramDouble1 * d2);
          } else {
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt8 + paramInt7)] + paramDouble1 * d1 + paramDouble1 * d2);
          }
          i += 1;
        }
        k += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dsyr2k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */