package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dtrmv
{
  public static void dtrmv(String paramString1, String paramString2, String paramString3, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5)
  {
    double d = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    boolean bool = false;
    j = 0;
    if ((((Lsame.lsame(paramString1, "U") ^ true)) && ((Lsame.lsame(paramString1, "L") ^ true)) ? 1 : 0) != 0)
    {
      j = 1;
    }
    else
    {
      if ((((Lsame.lsame(paramString2, "N") ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0) {
        j = 2;
      } else if ((((Lsame.lsame(paramString3, "U") ^ true)) && ((Lsame.lsame(paramString3, "N") ^ true)) ? 1 : 0) != 0) {
        j = 3;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        j = 4;
      } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        j = 6;
      } else if ((paramInt5 != 0 ? 0 : 1) != 0) {
        j = 8;
      }
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTRMV ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    bool = Lsame.lsame(paramString3, "N");
    if ((paramInt5 > 0 ? 0 : 1) != 0) {
      i1 = 1 - (paramInt1 - 1) * paramInt5;
    } else if ((paramInt5 == 1 ? 0 : 1) != 0) {
      i1 = 1;
    }
    int i2;
    int i3;
    if (Lsame.lsame(paramString2, "N"))
    {
      if (Lsame.lsame(paramString1, "U"))
      {
        if ((paramInt5 != 1 ? 0 : 1) != 0)
        {
          m = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfDouble2[(m - 1 + paramInt4)] == 0.0D ? 0 : 1) != 0)
            {
              d = paramArrayOfDouble2[(m - 1 + paramInt4)];
              i = 1;
              for (i3 = m - 1 - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble2[(i - 1 + paramInt4)] += d * paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt3 + paramInt2)];
                i += 1;
              }
              if (bool) {
                paramArrayOfDouble2[(m - 1 + paramInt4)] *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt3 + paramInt2)];
              }
            }
            m += 1;
          }
        }
        else
        {
          n = i1;
          m = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfDouble2[(n - 1 + paramInt4)] == 0.0D ? 0 : 1) != 0)
            {
              d = paramArrayOfDouble2[(n - 1 + paramInt4)];
              k = i1;
              i = 1;
              for (i3 = m - 1 - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble2[(k - 1 + paramInt4)] += d * paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt3 + paramInt2)];
                k += paramInt5;
                i += 1;
              }
              if (bool) {
                paramArrayOfDouble2[(n - 1 + paramInt4)] *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt3 + paramInt2)];
              }
            }
            n += paramInt5;
            m += 1;
          }
        }
      }
      else if ((paramInt5 != 1 ? 0 : 1) != 0)
      {
        m = paramInt1;
        for (i2 = (1 - paramInt1 + -1) / -1; i2 > 0; i2--)
        {
          if ((paramArrayOfDouble2[(m - 1 + paramInt4)] == 0.0D ? 0 : 1) != 0)
          {
            d = paramArrayOfDouble2[(m - 1 + paramInt4)];
            i = paramInt1;
            for (i3 = (m + 1 - paramInt1 + -1) / -1; i3 > 0; i3--)
            {
              paramArrayOfDouble2[(i - 1 + paramInt4)] += d * paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt3 + paramInt2)];
              i += -1;
            }
            if (bool) {
              paramArrayOfDouble2[(m - 1 + paramInt4)] *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt3 + paramInt2)];
            }
          }
          m += -1;
        }
      }
      else
      {
        i1 += (paramInt1 - 1) * paramInt5;
        n = i1;
        m = paramInt1;
        for (i2 = (1 - paramInt1 + -1) / -1; i2 > 0; i2--)
        {
          if ((paramArrayOfDouble2[(n - 1 + paramInt4)] == 0.0D ? 0 : 1) != 0)
          {
            d = paramArrayOfDouble2[(n - 1 + paramInt4)];
            k = i1;
            i = paramInt1;
            for (i3 = (m + 1 - paramInt1 + -1) / -1; i3 > 0; i3--)
            {
              paramArrayOfDouble2[(k - 1 + paramInt4)] += d * paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt3 + paramInt2)];
              k -= paramInt5;
              i += -1;
            }
            if (bool) {
              paramArrayOfDouble2[(n - 1 + paramInt4)] *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt3 + paramInt2)];
            }
          }
          n -= paramInt5;
          m += -1;
        }
      }
    }
    else if (Lsame.lsame(paramString1, "U"))
    {
      if ((paramInt5 != 1 ? 0 : 1) != 0)
      {
        m = paramInt1;
        for (i2 = (1 - paramInt1 + -1) / -1; i2 > 0; i2--)
        {
          d = paramArrayOfDouble2[(m - 1 + paramInt4)];
          if (bool) {
            d *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt3 + paramInt2)];
          }
          i = m - 1;
          for (i3 = (1 - (m - 1) + -1) / -1; i3 > 0; i3--)
          {
            d += paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt3 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt4)];
            i += -1;
          }
          paramArrayOfDouble2[(m - 1 + paramInt4)] = d;
          m += -1;
        }
      }
      else
      {
        n = i1 + (paramInt1 - 1) * paramInt5;
        m = paramInt1;
        for (i2 = (1 - paramInt1 + -1) / -1; i2 > 0; i2--)
        {
          d = paramArrayOfDouble2[(n - 1 + paramInt4)];
          k = n;
          if (bool) {
            d *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt3 + paramInt2)];
          }
          i = m - 1;
          for (i3 = (1 - (m - 1) + -1) / -1; i3 > 0; i3--)
          {
            k -= paramInt5;
            d += paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt3 + paramInt2)] * paramArrayOfDouble2[(k - 1 + paramInt4)];
            i += -1;
          }
          paramArrayOfDouble2[(n - 1 + paramInt4)] = d;
          n -= paramInt5;
          m += -1;
        }
      }
    }
    else if ((paramInt5 != 1 ? 0 : 1) != 0)
    {
      m = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        d = paramArrayOfDouble2[(m - 1 + paramInt4)];
        if (bool) {
          d *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt3 + paramInt2)];
        }
        i = m + 1;
        for (i3 = paramInt1 - (m + 1) + 1; i3 > 0; i3--)
        {
          d += paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt3 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt4)];
          i += 1;
        }
        paramArrayOfDouble2[(m - 1 + paramInt4)] = d;
        m += 1;
      }
    }
    else
    {
      n = i1;
      m = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        d = paramArrayOfDouble2[(n - 1 + paramInt4)];
        k = n;
        if (bool) {
          d *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt3 + paramInt2)];
        }
        i = m + 1;
        for (i3 = paramInt1 - (m + 1) + 1; i3 > 0; i3--)
        {
          k += paramInt5;
          d += paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt3 + paramInt2)] * paramArrayOfDouble2[(k - 1 + paramInt4)];
          i += 1;
        }
        paramArrayOfDouble2[(n - 1 + paramInt4)] = d;
        n += paramInt5;
        m += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dtrmv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */