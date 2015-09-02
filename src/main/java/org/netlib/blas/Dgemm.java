package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dgemm
{
  public static void dgemm(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double paramDouble2, double[] paramArrayOfDouble3, int paramInt8, int paramInt9)
  {
    double d = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    bool1 = Lsame.lsame(paramString1, "N");
    bool2 = Lsame.lsame(paramString2, "N");
    if (bool1)
    {
      i1 = paramInt1;
      n = paramInt3;
    }
    else
    {
      i1 = paramInt3;
      n = paramInt1;
    }
    if (bool2) {
      i2 = paramInt3;
    } else {
      i2 = paramInt2;
    }
    j = 0;
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "C") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString1, "T") ^ true) ? 1 : 0) != 0)
    {
      j = 1;
    }
    else
    {
      if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "C") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "T") ^ true) ? 1 : 0) != 0) {
        j = 2;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        j = 3;
      } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
        j = 4;
      } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
        j = 5;
      } else if ((paramInt5 >= Math.max(1, i1) ? 0 : 1) != 0) {
        j = 8;
      } else if ((paramInt7 >= Math.max(1, i2) ? 0 : 1) != 0) {
        j = 10;
      } else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        j = 13;
      }
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEMM ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) == 0)
    {
      if ((paramDouble1 != 0.0D ? 0 : 1) == 0) {}
      if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    }
    if ((((paramDouble2 != 1.0D ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
      return;
    }
    int i3;
    int i4;
    if ((paramDouble1 != 0.0D ? 0 : 1) != 0)
    {
      if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
      {
        k = 1;
        for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
        {
          i = 1;
          for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] = 0.0D;
            i += 1;
          }
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
        {
          i = 1;
          for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)]);
            i += 1;
          }
          k += 1;
        }
      }
      return;
    }
    int i5;
    if (bool2)
    {
      if (bool1)
      {
        k = 1;
        for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
        {
          if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
          {
            i = 1;
            for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
            {
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] = 0.0D;
              i += 1;
            }
          }
          else if ((paramDouble2 == 1.0D ? 0 : 1) != 0)
          {
            i = 1;
            i4 = paramInt1 - 1 + 1;
            for (;;)
            {
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)]);
              i += 1;
              i4--;
              if (i4 <= 0) {
                break;
              }
            }
          }
          m = 1;
          for (i4 = paramInt3 - 1 + 1; i4 > 0; i4--)
          {
            if ((paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt7 + paramInt6)] == 0.0D ? 0 : 1) != 0)
            {
              d = paramDouble1 * paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt7 + paramInt6)];
              i = 1;
              for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
              {
                paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] += d * paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt5 + paramInt4)];
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
        for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
        {
          i = 1;
          for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            d = 0.0D;
            m = 1;
            for (i5 = paramInt3 - 1 + 1; i5 > 0; i5--)
            {
              d += paramArrayOfDouble1[(m - 1 + (i - 1) * paramInt5 + paramInt4)] * paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt7 + paramInt6)];
              m += 1;
            }
            if ((paramDouble2 != 0.0D ? 0 : 1) != 0) {
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] = (paramDouble1 * d);
            } else {
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] = (paramDouble1 * d + paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)]);
            }
            i += 1;
          }
          k += 1;
        }
      }
    }
    else if (bool1)
    {
      k = 1;
      for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
      {
        if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
        {
          i = 1;
          for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] = 0.0D;
            i += 1;
          }
        }
        else if ((paramDouble2 == 1.0D ? 0 : 1) != 0)
        {
          i = 1;
          i4 = paramInt1 - 1 + 1;
          for (;;)
          {
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] = (paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)]);
            i += 1;
            i4--;
            if (i4 <= 0) {
              break;
            }
          }
        }
        m = 1;
        for (i4 = paramInt3 - 1 + 1; i4 > 0; i4--)
        {
          if ((paramArrayOfDouble2[(k - 1 + (m - 1) * paramInt7 + paramInt6)] == 0.0D ? 0 : 1) != 0)
          {
            d = paramDouble1 * paramArrayOfDouble2[(k - 1 + (m - 1) * paramInt7 + paramInt6)];
            i = 1;
            for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
            {
              paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] += d * paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt5 + paramInt4)];
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
      for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
      {
        i = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          d = 0.0D;
          m = 1;
          for (i5 = paramInt3 - 1 + 1; i5 > 0; i5--)
          {
            d += paramArrayOfDouble1[(m - 1 + (i - 1) * paramInt5 + paramInt4)] * paramArrayOfDouble2[(k - 1 + (m - 1) * paramInt7 + paramInt6)];
            m += 1;
          }
          if ((paramDouble2 != 0.0D ? 0 : 1) != 0) {
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] = (paramDouble1 * d);
          } else {
            paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)] = (paramDouble1 * d + paramDouble2 * paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt9 + paramInt8)]);
          }
          i += 1;
        }
        k += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dgemm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */