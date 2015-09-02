package org.netlib.blas;

import org.netlib.err.Xerbla;

public final class Strsm
{
  public static void strsm(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, float paramFloat, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6)
  {
    float f = 0.0F;
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
      Xerbla.xerbla("STRSM ", j);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    int i1;
    int i2;
    if ((paramFloat != 0.0F ? 0 : 1) != 0)
    {
      k = 1;
      for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
      {
        i = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = 0.0F;
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
            if ((paramFloat == 1.0F ? 0 : 1) != 0)
            {
              i = 1;
              for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
              {
                paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramFloat * paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
                i += 1;
              }
            }
            m = paramInt1;
            for (i2 = (1 - paramInt1 + -1) / -1; i2 > 0; i2--)
            {
              if ((paramArrayOfFloat2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] == 0.0F ? 0 : 1) != 0)
              {
                if (bool2) {
                  paramArrayOfFloat2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] /= paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt4 + paramInt3)];
                }
                i = 1;
                for (i3 = m - 1 - 1 + 1; i3 > 0; i3--)
                {
                  paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] -= paramArrayOfFloat2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] * paramArrayOfFloat1[(i - 1 + (m - 1) * paramInt4 + paramInt3)];
                  i += 1;
                }
              }
              m += -1;
            }
            k += 1;
          }
        }
        else
        {
          k = 1;
          for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
          {
            if ((paramFloat == 1.0F ? 0 : 1) != 0)
            {
              i = 1;
              for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
              {
                paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramFloat * paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
                i += 1;
              }
            }
            m = 1;
            for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
            {
              if ((paramArrayOfFloat2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] == 0.0F ? 0 : 1) != 0)
              {
                if (bool2) {
                  paramArrayOfFloat2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] /= paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt4 + paramInt3)];
                }
                i = m + 1;
                for (i3 = paramInt1 - (m + 1) + 1; i3 > 0; i3--)
                {
                  paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] -= paramArrayOfFloat2[(m - 1 + (k - 1) * paramInt6 + paramInt5)] * paramArrayOfFloat1[(i - 1 + (m - 1) * paramInt4 + paramInt3)];
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
        k = 1;
        for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
        {
          i = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            f = paramFloat * paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)];
            m = 1;
            for (i3 = i - 1 - 1 + 1; i3 > 0; i3--)
            {
              f -= paramArrayOfFloat1[(m - 1 + (i - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat2[(m - 1 + (k - 1) * paramInt6 + paramInt5)];
              m += 1;
            }
            if (bool2) {
              f /= paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
            }
            paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = f;
            i += 1;
          }
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
        {
          i = paramInt1;
          for (i2 = (1 - paramInt1 + -1) / -1; i2 > 0; i2--)
          {
            f = paramFloat * paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)];
            m = i + 1;
            for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
            {
              f -= paramArrayOfFloat1[(m - 1 + (i - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat2[(m - 1 + (k - 1) * paramInt6 + paramInt5)];
              m += 1;
            }
            if (bool2) {
              f /= paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
            }
            paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = f;
            i += -1;
          }
          k += 1;
        }
      }
    }
    else if (Lsame.lsame(paramString3, "N"))
    {
      if (bool3)
      {
        k = 1;
        for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
        {
          if ((paramFloat == 1.0F ? 0 : 1) != 0)
          {
            i = 1;
            for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
            {
              paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramFloat * paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
              i += 1;
            }
          }
          m = 1;
          for (i2 = k - 1 - 1 + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfFloat1[(m - 1 + (k - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
            {
              i = 1;
              for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] -= paramArrayOfFloat1[(m - 1 + (k - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)];
                i += 1;
              }
            }
            m += 1;
          }
          if (bool2)
          {
            f = 1.0F / paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt4 + paramInt3)];
            i = 1;
            for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
            {
              paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (f * paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
              i += 1;
            }
          }
          k += 1;
        }
      }
      else
      {
        k = paramInt2;
        for (i1 = (1 - paramInt2 + -1) / -1; i1 > 0; i1--)
        {
          if ((paramFloat == 1.0F ? 0 : 1) != 0)
          {
            i = 1;
            for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
            {
              paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (paramFloat * paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
              i += 1;
            }
          }
          m = k + 1;
          for (i2 = paramInt2 - (k + 1) + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfFloat1[(m - 1 + (k - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
            {
              i = 1;
              for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] -= paramArrayOfFloat1[(m - 1 + (k - 1) * paramInt4 + paramInt3)] * paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)];
                i += 1;
              }
            }
            m += 1;
          }
          if (bool2)
          {
            f = 1.0F / paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt4 + paramInt3)];
            i = 1;
            for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
            {
              paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] = (f * paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)]);
              i += 1;
            }
          }
          k += -1;
        }
      }
    }
    else if (bool3)
    {
      m = paramInt2;
      for (i1 = (1 - paramInt2 + -1) / -1; i1 > 0; i1--)
      {
        if (bool2)
        {
          f = 1.0F / paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt4 + paramInt3)];
          i = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] = (f * paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)]);
            i += 1;
          }
        }
        k = 1;
        for (i2 = m - 1 - 1 + 1; i2 > 0; i2--)
        {
          if ((paramArrayOfFloat1[(k - 1 + (m - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
          {
            f = paramArrayOfFloat1[(k - 1 + (m - 1) * paramInt4 + paramInt3)];
            i = 1;
            for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
            {
              paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] -= f * paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)];
              i += 1;
            }
          }
          k += 1;
        }
        if ((paramFloat == 1.0F ? 0 : 1) != 0)
        {
          i = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] = (paramFloat * paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)]);
            i += 1;
          }
        }
        m += -1;
      }
    }
    else
    {
      m = 1;
      for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
      {
        if (bool2)
        {
          f = 1.0F / paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt4 + paramInt3)];
          i = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] = (f * paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)]);
            i += 1;
          }
        }
        k = m + 1;
        for (i2 = paramInt2 - (m + 1) + 1; i2 > 0; i2--)
        {
          if ((paramArrayOfFloat1[(k - 1 + (m - 1) * paramInt4 + paramInt3)] == 0.0F ? 0 : 1) != 0)
          {
            f = paramArrayOfFloat1[(k - 1 + (m - 1) * paramInt4 + paramInt3)];
            i = 1;
            for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
            {
              paramArrayOfFloat2[(i - 1 + (k - 1) * paramInt6 + paramInt5)] -= f * paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)];
              i += 1;
            }
          }
          k += 1;
        }
        if ((paramFloat == 1.0F ? 0 : 1) != 0)
        {
          i = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] = (paramFloat * paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)]);
            i += 1;
          }
        }
        m += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Strsm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */