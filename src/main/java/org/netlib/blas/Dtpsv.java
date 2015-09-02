package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Dtpsv
{
  public static void dtpsv(String paramString1, String paramString2, String paramString3, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4)
  {
    double d = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
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
      } else if ((paramInt4 != 0 ? 0 : 1) != 0) {
        j = 7;
      }
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTPSV ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    bool = Lsame.lsame(paramString3, "N");
    if ((paramInt4 > 0 ? 0 : 1) != 0) {
      i3 = 1 - (paramInt1 - 1) * paramInt4;
    } else if ((paramInt4 == 1 ? 0 : 1) != 0) {
      i3 = 1;
    }
    int i4;
    int i5;
    if (Lsame.lsame(paramString2, "N"))
    {
      if (Lsame.lsame(paramString1, "U"))
      {
        i2 = paramInt1 * (paramInt1 + 1) / 2;
        if ((paramInt4 != 1 ? 0 : 1) != 0)
        {
          m = paramInt1;
          for (i4 = (1 - paramInt1 + -1) / -1; i4 > 0; i4--)
          {
            if ((paramArrayOfDouble2[(m - 1 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              if (bool) {
                paramArrayOfDouble2[(m - 1 + paramInt3)] /= paramArrayOfDouble1[(i2 - 1 + paramInt2)];
              }
              d = paramArrayOfDouble2[(m - 1 + paramInt3)];
              i1 = i2 - 1;
              i = m - 1;
              for (i5 = (1 - (m - 1) + -1) / -1; i5 > 0; i5--)
              {
                paramArrayOfDouble2[(i - 1 + paramInt3)] -= d * paramArrayOfDouble1[(i1 - 1 + paramInt2)];
                i1 -= 1;
                i += -1;
              }
            }
            i2 -= m;
            m += -1;
          }
        }
        else
        {
          n = i3 + (paramInt1 - 1) * paramInt4;
          m = paramInt1;
          for (i4 = (1 - paramInt1 + -1) / -1; i4 > 0; i4--)
          {
            if ((paramArrayOfDouble2[(n - 1 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              if (bool) {
                paramArrayOfDouble2[(n - 1 + paramInt3)] /= paramArrayOfDouble1[(i2 - 1 + paramInt2)];
              }
              d = paramArrayOfDouble2[(n - 1 + paramInt3)];
              k = n;
              i1 = i2 - 1;
              for (i5 = (i2 - m + 1 - (i2 - 1) + -1) / -1; i5 > 0; i5--)
              {
                k -= paramInt4;
                paramArrayOfDouble2[(k - 1 + paramInt3)] -= d * paramArrayOfDouble1[(i1 - 1 + paramInt2)];
                i1 += -1;
              }
            }
            n -= paramInt4;
            i2 -= m;
            m += -1;
          }
        }
      }
      else
      {
        i2 = 1;
        if ((paramInt4 != 1 ? 0 : 1) != 0)
        {
          m = 1;
          for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            if ((paramArrayOfDouble2[(m - 1 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              if (bool) {
                paramArrayOfDouble2[(m - 1 + paramInt3)] /= paramArrayOfDouble1[(i2 - 1 + paramInt2)];
              }
              d = paramArrayOfDouble2[(m - 1 + paramInt3)];
              i1 = i2 + 1;
              i = m + 1;
              for (i5 = paramInt1 - (m + 1) + 1; i5 > 0; i5--)
              {
                paramArrayOfDouble2[(i - 1 + paramInt3)] -= d * paramArrayOfDouble1[(i1 - 1 + paramInt2)];
                i1 += 1;
                i += 1;
              }
            }
            i2 += paramInt1 - m + 1;
            m += 1;
          }
        }
        else
        {
          n = i3;
          m = 1;
          for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            if ((paramArrayOfDouble2[(n - 1 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              if (bool) {
                paramArrayOfDouble2[(n - 1 + paramInt3)] /= paramArrayOfDouble1[(i2 - 1 + paramInt2)];
              }
              d = paramArrayOfDouble2[(n - 1 + paramInt3)];
              k = n;
              i1 = i2 + 1;
              for (i5 = i2 + paramInt1 - m - (i2 + 1) + 1; i5 > 0; i5--)
              {
                k += paramInt4;
                paramArrayOfDouble2[(k - 1 + paramInt3)] -= d * paramArrayOfDouble1[(i1 - 1 + paramInt2)];
                i1 += 1;
              }
            }
            n += paramInt4;
            i2 += paramInt1 - m + 1;
            m += 1;
          }
        }
      }
    }
    else if (Lsame.lsame(paramString1, "U"))
    {
      i2 = 1;
      if ((paramInt4 != 1 ? 0 : 1) != 0)
      {
        m = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          d = paramArrayOfDouble2[(m - 1 + paramInt3)];
          i1 = i2;
          i = 1;
          for (i5 = m - 1 - 1 + 1; i5 > 0; i5--)
          {
            d -= paramArrayOfDouble1[(i1 - 1 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt3)];
            i1 += 1;
            i += 1;
          }
          if (bool) {
            d /= paramArrayOfDouble1[(i2 + m - 1 - 1 + paramInt2)];
          }
          paramArrayOfDouble2[(m - 1 + paramInt3)] = d;
          i2 += m;
          m += 1;
        }
      }
      else
      {
        n = i3;
        m = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          d = paramArrayOfDouble2[(n - 1 + paramInt3)];
          k = i3;
          i1 = i2;
          for (i5 = i2 + m - 2 - i2 + 1; i5 > 0; i5--)
          {
            d -= paramArrayOfDouble1[(i1 - 1 + paramInt2)] * paramArrayOfDouble2[(k - 1 + paramInt3)];
            k += paramInt4;
            i1 += 1;
          }
          if (bool) {
            d /= paramArrayOfDouble1[(i2 + m - 1 - 1 + paramInt2)];
          }
          paramArrayOfDouble2[(n - 1 + paramInt3)] = d;
          n += paramInt4;
          i2 += m;
          m += 1;
        }
      }
    }
    else
    {
      i2 = paramInt1 * (paramInt1 + 1) / 2;
      if ((paramInt4 != 1 ? 0 : 1) != 0)
      {
        m = paramInt1;
        for (i4 = (1 - paramInt1 + -1) / -1; i4 > 0; i4--)
        {
          d = paramArrayOfDouble2[(m - 1 + paramInt3)];
          i1 = i2;
          i = paramInt1;
          for (i5 = (m + 1 - paramInt1 + -1) / -1; i5 > 0; i5--)
          {
            d -= paramArrayOfDouble1[(i1 - 1 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt3)];
            i1 -= 1;
            i += -1;
          }
          if (bool) {
            d /= paramArrayOfDouble1[(i2 - paramInt1 + m - 1 + paramInt2)];
          }
          paramArrayOfDouble2[(m - 1 + paramInt3)] = d;
          i2 -= paramInt1 - m + 1;
          m += -1;
        }
      }
      else
      {
        i3 += (paramInt1 - 1) * paramInt4;
        n = i3;
        m = paramInt1;
        for (i4 = (1 - paramInt1 + -1) / -1; i4 > 0; i4--)
        {
          d = paramArrayOfDouble2[(n - 1 + paramInt3)];
          k = i3;
          i1 = i2;
          for (i5 = (i2 - (paramInt1 - (m + 1)) - i2 + -1) / -1; i5 > 0; i5--)
          {
            d -= paramArrayOfDouble1[(i1 - 1 + paramInt2)] * paramArrayOfDouble2[(k - 1 + paramInt3)];
            k -= paramInt4;
            i1 += -1;
          }
          if (bool) {
            d /= paramArrayOfDouble1[(i2 - paramInt1 + m - 1 + paramInt2)];
          }
          paramArrayOfDouble2[(n - 1 + paramInt3)] = d;
          n -= paramInt4;
          i2 -= paramInt1 - m + 1;
          m += -1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Dtpsv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */