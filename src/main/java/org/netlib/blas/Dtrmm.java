package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dtrmm
{
  public static void dtrmm(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, double paramDouble, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6)
  {
    double d = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    bool1 = Lsame.lsame(paramString1, "L");
    if (bool1) {
      n = paramInt1;
    } else {
      n = paramInt2;
    }
    bool2 = Lsame.lsame(paramString4, "N");
    bool3 = Lsame.lsame(paramString2, "U");
    j = 0;
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "R") ^ true)) ? 1 : 0) != 0)
    {
      j = 1;
    }
    else if ((((bool3 ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
    {
      j = 2;
    }
    else
    {
      if ((((Lsame.lsame(paramString3, "N") ^ true)) && ((Lsame.lsame(paramString3, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString3, "C") ^ true) ? 1 : 0) != 0) {
        j = 3;
      } else if ((((Lsame.lsame(paramString4, "U") ^ true)) && ((Lsame.lsame(paramString4, "N") ^ true)) ? 1 : 0) != 0) {
        j = 4;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        j = 5;
      } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
        j = 6;
      } else if ((paramInt4 >= Math.max(1, n) ? 0 : 1) != 0) {
        j = 9;
      } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        j = 11;
      }
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTRMM ", j);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    int i1;
    int i2;
    if ((paramDouble != 0.0D ? 0 : 1) != 0)
    {
      k = 1;
      for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
      {
        i = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = 0.0D;
          i += 1;
        }
        k += 1;
      }
      return;
    }
    int i3;
    if (bool1)
    {
      if (Lsame.lsame(paramString3, "N"))
      {
        if (bool3)
        {
          k = 1;
          for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
          {
            m = 1;
            for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
            {
              if ((paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] == 0.0D ? 0 : 1) != 0)
              {
                d = paramDouble * paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)];
                i = 1;
                for (i3 = m - 1 - 1 + 1; i3 > 0; i3--)
                {
                  paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] += d * paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt4 + paramInt3)];
                  i += 1;
                }
                if (bool2) {
                  d *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt4 + paramInt3)];
                }
                paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] = d;
              }
              m += 1;
            }
            k += 1;
          }
        }
        else
        {
          k = 1;
          for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
          {
            m = paramInt1;
            for (i2 = (1 - paramInt1 + -1) / -1; i2 > 0; i2--)
            {
              if ((paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] == 0.0D ? 0 : 1) != 0)
              {
                d = paramDouble * paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)];
                paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] = d;
                if (bool2) {
                  paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt4 + paramInt3)];
                }
                i = m + 1;
                for (i3 = paramInt1 - (m + 1) + 1; i3 > 0; i3--)
                {
                  paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] += d * paramArrayOfDouble1[(i - 1 + (m - 1) * paramInt4 + paramInt3)];
                  i += 1;
                }
              }
              m += -1;
            }
            k += 1;
          }
        }
      }
      else if (bool3)
      {
        k = 1;
        for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
        {
          i = paramInt1;
          for (i2 = (1 - paramInt1 + -1) / -1; i2 > 0; i2--)
          {
            d = paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)];
            if (bool2) {
              d *= paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
            }
            m = 1;
            for (i3 = i - 1 - 1 + 1; i3 > 0; i3--)
            {
              d += paramArrayOfDouble1[(m - 1 + (i - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)];
              m += 1;
            }
            paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramDouble * d);
            i += -1;
          }
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
        {
          i = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            d = paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)];
            if (bool2) {
              d *= paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
            }
            m = i + 1;
            for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
            {
              d += paramArrayOfDouble1[(m - 1 + (i - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble2[(m - 1 + (k - 1) * paramInt6 + paramInt5)];
              m += 1;
            }
            paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramDouble * d);
            i += 1;
          }
          k += 1;
        }
      }
    }
    else if (Lsame.lsame(paramString3, "N"))
    {
      if (bool3)
      {
        k = paramInt2;
        for (i1 = (1 - paramInt2 + -1) / -1; i1 > 0; i1--)
        {
          d = paramDouble;
          if (bool2) {
            d *= paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt4 + paramInt3)];
          }
          i = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (d * paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
            i += 1;
          }
          m = 1;
          for (i2 = k - 1 - 1 + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfDouble1[(m - 1 + (k - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              d = paramDouble * paramArrayOfDouble1[(m - 1 + (k - 1) * paramInt4 + paramInt3)];
              i = 1;
              for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] += d * paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)];
                i += 1;
              }
            }
            m += 1;
          }
          k += -1;
        }
      }
      else
      {
        k = 1;
        for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
        {
          d = paramDouble;
          if (bool2) {
            d *= paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt4 + paramInt3)];
          }
          i = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (d * paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
            i += 1;
          }
          m = k + 1;
          for (i2 = paramInt2 - (k + 1) + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfDouble1[(m - 1 + (k - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              d = paramDouble * paramArrayOfDouble1[(m - 1 + (k - 1) * paramInt4 + paramInt3)];
              i = 1;
              for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] += d * paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)];
                i += 1;
              }
            }
            m += 1;
          }
          k += 1;
        }
      }
    }
    else if (bool3)
    {
      m = 1;
      for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
      {
        k = 1;
        for (i2 = m - 1 - 1 + 1; i2 > 0; i2--)
        {
          if ((paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
          {
            d = paramDouble * paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)];
            i = 1;
            for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
            {
              paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] += d * paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)];
              i += 1;
            }
          }
          k += 1;
        }
        d = paramDouble;
        if (bool2) {
          d *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt4 + paramInt3)];
        }
        if ((d == 1.0D ? 0 : 1) != 0)
        {
          i = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] = (d * paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)]);
            i += 1;
          }
        }
        m += 1;
      }
    }
    else
    {
      m = paramInt2;
      for (i1 = (1 - paramInt2 + -1) / -1; i1 > 0; i1--)
      {
        k = m + 1;
        for (i2 = paramInt2 - (m + 1) + 1; i2 > 0; i2--)
        {
          if ((paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
          {
            d = paramDouble * paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt4 + paramInt3)];
            i = 1;
            for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
            {
              paramArrayOfDouble2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] += d * paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)];
              i += 1;
            }
          }
          k += 1;
        }
        d = paramDouble;
        if (bool2) {
          d *= paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt4 + paramInt3)];
        }
        if ((d == 1.0D ? 0 : 1) != 0)
        {
          i = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] = (d * paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)]);
            i += 1;
          }
        }
        m += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dtrmm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */