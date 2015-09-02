package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Stbsv
{
  public static void stbsv(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6)
  {
    float f = 0.0F;
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
      } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
        j = 5;
      } else if ((paramInt4 >= paramInt2 + 1 ? 0 : 1) != 0) {
        j = 7;
      } else if ((paramInt6 != 0 ? 0 : 1) != 0) {
        j = 9;
      }
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STBSV ", j);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    bool = Lsame.lsame(paramString3, "N");
    if ((paramInt6 > 0 ? 0 : 1) != 0) {
      i2 = 1 - (paramInt1 - 1) * paramInt6;
    } else if ((paramInt6 == 1 ? 0 : 1) != 0) {
      i2 = 1;
    }
    int i4;
    int i5;
    if (Lsame.lsame(paramString2, "N"))
    {
      if (Lsame.lsame(paramString1, "U"))
      {
        i1 = paramInt2 + 1;
        if ((paramInt6 != 1 ? 0 : 1) != 0)
        {
          m = paramInt1;
          for (i4 = (1 - paramInt1 + -1) / -1; i4 > 0; i4--)
          {
            if ((paramArrayOfFloat2[(m - 1 + paramInt5)] == 0.0F ? 0 : 1) != 0)
            {
              i3 = i1 - m;
              if (bool) {
                paramArrayOfFloat2[(m - 1 + paramInt5)] /= paramArrayOfFloat1[(i1 - 1 + (m - 1) * paramInt4 + paramInt3)];
              }
              f = paramArrayOfFloat2[(m - 1 + paramInt5)];
              i = m - 1;
              for (i5 = (Math.max(1, m - paramInt2) - (m - 1) + -1) / -1; i5 > 0; i5--)
              {
                paramArrayOfFloat2[(i - 1 + paramInt5)] -= f * paramArrayOfFloat1[(i3 + i - 1 + (m - 1) * paramInt4 + paramInt3)];
                i += -1;
              }
            }
            m += -1;
          }
        }
        else
        {
          i2 += (paramInt1 - 1) * paramInt6;
          n = i2;
          m = paramInt1;
          for (i4 = (1 - paramInt1 + -1) / -1; i4 > 0; i4--)
          {
            i2 -= paramInt6;
            if ((paramArrayOfFloat2[(n - 1 + paramInt5)] == 0.0F ? 0 : 1) != 0)
            {
              k = i2;
              i3 = i1 - m;
              if (bool) {
                paramArrayOfFloat2[(n - 1 + paramInt5)] /= paramArrayOfFloat1[(i1 - 1 + (m - 1) * paramInt4 + paramInt3)];
              }
              f = paramArrayOfFloat2[(n - 1 + paramInt5)];
              i = m - 1;
              for (i5 = (Math.max(1, m - paramInt2) - (m - 1) + -1) / -1; i5 > 0; i5--)
              {
                paramArrayOfFloat2[(k - 1 + paramInt5)] -= f * paramArrayOfFloat1[(i3 + i - 1 + (m - 1) * paramInt4 + paramInt3)];
                k -= paramInt6;
                i += -1;
              }
            }
            n -= paramInt6;
            m += -1;
          }
        }
      }
      else if ((paramInt6 != 1 ? 0 : 1) != 0)
      {
        m = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          if ((paramArrayOfFloat2[(m - 1 + paramInt5)] == 0.0F ? 0 : 1) != 0)
          {
            i3 = 1 - m;
            if (bool) {
              paramArrayOfFloat2[(m - 1 + paramInt5)] /= paramArrayOfFloat1[(1 - 1 + (m - 1) * paramInt4 + paramInt3)];
            }
            f = paramArrayOfFloat2[(m - 1 + paramInt5)];
            i = m + 1;
            for (i5 = Math.min(paramInt1, m + paramInt2) - (m + 1) + 1; i5 > 0; i5--)
            {
              paramArrayOfFloat2[(i - 1 + paramInt5)] -= f * paramArrayOfFloat1[(i3 + i - 1 + (m - 1) * paramInt4 + paramInt3)];
              i += 1;
            }
          }
          m += 1;
        }
      }
      else
      {
        n = i2;
        m = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          i2 += paramInt6;
          if ((paramArrayOfFloat2[(n - 1 + paramInt5)] == 0.0F ? 0 : 1) != 0)
          {
            k = i2;
            i3 = 1 - m;
            if (bool) {
              paramArrayOfFloat2[(n - 1 + paramInt5)] /= paramArrayOfFloat1[(1 - 1 + (m - 1) * paramInt4 + paramInt3)];
            }
            f = paramArrayOfFloat2[(n - 1 + paramInt5)];
            i = m + 1;
            for (i5 = Math.min(paramInt1, m + paramInt2) - (m + 1) + 1; i5 > 0; i5--)
            {
              paramArrayOfFloat2[(k - 1 + paramInt5)] -= f * paramArrayOfFloat1[(i3 + i - 1 + (m - 1) * paramInt4 + paramInt3)];
              k += paramInt6;
              i += 1;
            }
          }
          n += paramInt6;
          m += 1;
        }
      }
    }
    else if (Lsame.lsame(paramString1, "U"))
    {
      i1 = paramInt2 + 1;
      if ((paramInt6 != 1 ? 0 : 1) != 0)
      {
        m = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          f = paramArrayOfFloat2[(m - 1 + paramInt5)];
          i3 = i1 - m;
          i = Math.max(1, m - paramInt2);
          for (i5 = m - 1 - Math.max(1, m - paramInt2) + 1; i5 > 0; i5--)
          {
            f -= paramArrayOfFloat1[(i3 + i - 1 + (m - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat2[(i - 1 + paramInt5)];
            i += 1;
          }
          if (bool) {
            f /= paramArrayOfFloat1[(i1 - 1 + (m - 1) * paramInt4 + paramInt3)];
          }
          paramArrayOfFloat2[(m - 1 + paramInt5)] = f;
          m += 1;
        }
      }
      else
      {
        n = i2;
        m = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          f = paramArrayOfFloat2[(n - 1 + paramInt5)];
          k = i2;
          i3 = i1 - m;
          i = Math.max(1, m - paramInt2);
          for (i5 = m - 1 - Math.max(1, m - paramInt2) + 1; i5 > 0; i5--)
          {
            f -= paramArrayOfFloat1[(i3 + i - 1 + (m - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat2[(k - 1 + paramInt5)];
            k += paramInt6;
            i += 1;
          }
          if (bool) {
            f /= paramArrayOfFloat1[(i1 - 1 + (m - 1) * paramInt4 + paramInt3)];
          }
          paramArrayOfFloat2[(n - 1 + paramInt5)] = f;
          n += paramInt6;
          if ((m <= paramInt2 ? 0 : 1) != 0) {
            i2 += paramInt6;
          }
          m += 1;
        }
      }
    }
    else if ((paramInt6 != 1 ? 0 : 1) != 0)
    {
      m = paramInt1;
      for (i4 = (1 - paramInt1 + -1) / -1; i4 > 0; i4--)
      {
        f = paramArrayOfFloat2[(m - 1 + paramInt5)];
        i3 = 1 - m;
        i = Math.min(paramInt1, m + paramInt2);
        for (i5 = (m + 1 - Math.min(paramInt1, m + paramInt2) + -1) / -1; i5 > 0; i5--)
        {
          f -= paramArrayOfFloat1[(i3 + i - 1 + (m - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat2[(i - 1 + paramInt5)];
          i += -1;
        }
        if (bool) {
          f /= paramArrayOfFloat1[(1 - 1 + (m - 1) * paramInt4 + paramInt3)];
        }
        paramArrayOfFloat2[(m - 1 + paramInt5)] = f;
        m += -1;
      }
    }
    else
    {
      i2 += (paramInt1 - 1) * paramInt6;
      n = i2;
      m = paramInt1;
      for (i4 = (1 - paramInt1 + -1) / -1; i4 > 0; i4--)
      {
        f = paramArrayOfFloat2[(n - 1 + paramInt5)];
        k = i2;
        i3 = 1 - m;
        i = Math.min(paramInt1, m + paramInt2);
        for (i5 = (m + 1 - Math.min(paramInt1, m + paramInt2) + -1) / -1; i5 > 0; i5--)
        {
          f -= paramArrayOfFloat1[(i3 + i - 1 + (m - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat2[(k - 1 + paramInt5)];
          k -= paramInt6;
          i += -1;
        }
        if (bool) {
          f /= paramArrayOfFloat1[(1 - 1 + (m - 1) * paramInt4 + paramInt3)];
        }
        paramArrayOfFloat2[(n - 1 + paramInt5)] = f;
        n -= paramInt6;
        if ((paramInt1 - m < paramInt2 ? 0 : 1) != 0) {
          i2 -= paramInt6;
        }
        m += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Stbsv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */