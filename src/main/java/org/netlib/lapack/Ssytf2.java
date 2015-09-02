package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.blas.Ssyr;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssytf2
{
  public static void ssytf2(String paramString, int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSYTF2", -paramintW.val);
      return;
    }
    f2 = (1.0F + (float)Math.sqrt(17.0F)) / 8.0F;
    int i4;
    int i5;
    if (bool)
    {
      n = paramInt1;
      while ((n >= 1 ? 0 : 1) == 0)
      {
        i3 = 1;
        f1 = Math.abs(paramArrayOfFloat[(n - 1 + (n - 1) * paramInt3 + paramInt2)]);
        if ((n <= 1 ? 0 : 1) != 0)
        {
          j = Isamax.isamax(n - 1, paramArrayOfFloat, 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1);
          f3 = Math.abs(paramArrayOfFloat[(j - 1 + (n - 1) * paramInt3 + paramInt2)]);
        }
        else
        {
          f3 = 0.0F;
        }
        if ((Math.max(f1, f3) != 0.0F ? 0 : 1) == 0) {}
        if ((!Sisnan.sisnan(f1) ? 0 : 1) != 0)
        {
          if ((paramintW.val != 0 ? 0 : 1) != 0) {
            paramintW.val = n;
          }
          i2 = n;
        }
        else
        {
          if ((f1 < f2 * f3 ? 0 : 1) != 0)
          {
            i2 = n;
          }
          else
          {
            m = j + Isamax.isamax(n - j, paramArrayOfFloat, j - 1 + (j + 1 - 1) * paramInt3 + paramInt2, paramInt3);
            f9 = Math.abs(paramArrayOfFloat[(j - 1 + (m - 1) * paramInt3 + paramInt2)]);
            if ((j <= 1 ? 0 : 1) != 0)
            {
              m = Isamax.isamax(j - 1, paramArrayOfFloat, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
              f9 = Math.max(f9, Math.abs(paramArrayOfFloat[(m - 1 + (j - 1) * paramInt3 + paramInt2)]));
            }
            if ((f1 < f2 * f3 * (f3 / f9) ? 0 : 1) != 0)
            {
              i2 = n;
            }
            else if ((Math.abs(paramArrayOfFloat[(j - 1 + (j - 1) * paramInt3 + paramInt2)]) < f2 * f9 ? 0 : 1) != 0)
            {
              i2 = j;
            }
            else
            {
              i2 = j;
              i3 = 2;
            }
          }
          i1 = n - i3 + 1;
          if ((i2 == i1 ? 0 : 1) != 0)
          {
            Sswap.sswap(i2 - 1, paramArrayOfFloat, 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat, 1 - 1 + (i2 - 1) * paramInt3 + paramInt2, 1);
            Sswap.sswap(i1 - i2 - 1, paramArrayOfFloat, i2 + 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat, i2 - 1 + (i2 + 1 - 1) * paramInt3 + paramInt2, paramInt3);
            f10 = paramArrayOfFloat[(i1 - 1 + (i1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat[(i1 - 1 + (i1 - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat[(i2 - 1 + (i2 - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat[(i2 - 1 + (i2 - 1) * paramInt3 + paramInt2)] = f10;
            if ((i3 != 2 ? 0 : 1) != 0)
            {
              f10 = paramArrayOfFloat[(n - 1 - 1 + (n - 1) * paramInt3 + paramInt2)];
              paramArrayOfFloat[(n - 1 - 1 + (n - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat[(i2 - 1 + (n - 1) * paramInt3 + paramInt2)];
              paramArrayOfFloat[(i2 - 1 + (n - 1) * paramInt3 + paramInt2)] = f10;
            }
          }
          if ((i3 != 1 ? 0 : 1) != 0)
          {
            f8 = 1.0F / paramArrayOfFloat[(n - 1 + (n - 1) * paramInt3 + paramInt2)];
            Ssyr.ssyr(paramString, n - 1, -f8, paramArrayOfFloat, 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat, paramInt2, paramInt3);
            Sscal.sscal(n - 1, f8, paramArrayOfFloat, 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1);
          }
          else if ((n <= 2 ? 0 : 1) != 0)
          {
            f5 = paramArrayOfFloat[(n - 1 - 1 + (n - 1) * paramInt3 + paramInt2)];
            f7 = paramArrayOfFloat[(n - 1 - 1 + (n - 1 - 1) * paramInt3 + paramInt2)] / f5;
            f4 = paramArrayOfFloat[(n - 1 + (n - 1) * paramInt3 + paramInt2)] / f5;
            f10 = 1.0F / (f4 * f7 - 1.0F);
            f5 = f10 / f5;
            k = n - 2;
            for (i4 = (1 - (n - 2) + -1) / -1; i4 > 0; i4--)
            {
              f12 = f5 * (f4 * paramArrayOfFloat[(k - 1 + (n - 1 - 1) * paramInt3 + paramInt2)] - paramArrayOfFloat[(k - 1 + (n - 1) * paramInt3 + paramInt2)]);
              f11 = f5 * (f7 * paramArrayOfFloat[(k - 1 + (n - 1) * paramInt3 + paramInt2)] - paramArrayOfFloat[(k - 1 + (n - 1 - 1) * paramInt3 + paramInt2)]);
              i = k;
              for (i5 = (1 - k + -1) / -1; i5 > 0; i5--)
              {
                paramArrayOfFloat[(i - 1 + (k - 1) * paramInt3 + paramInt2)] = (paramArrayOfFloat[(i - 1 + (k - 1) * paramInt3 + paramInt2)] - paramArrayOfFloat[(i - 1 + (n - 1) * paramInt3 + paramInt2)] * f11 - paramArrayOfFloat[(i - 1 + (n - 1 - 1) * paramInt3 + paramInt2)] * f12);
                i += -1;
              }
              paramArrayOfFloat[(k - 1 + (n - 1) * paramInt3 + paramInt2)] = f11;
              paramArrayOfFloat[(k - 1 + (n - 1 - 1) * paramInt3 + paramInt2)] = f12;
              k += -1;
            }
          }
        }
        if ((i3 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfInt[(n - 1 + paramInt4)] = i2;
        }
        else
        {
          paramArrayOfInt[(n - 1 + paramInt4)] = (-i2);
          paramArrayOfInt[(n - 1 - 1 + paramInt4)] = (-i2);
        }
        n -= i3;
      }
    }
    n = 1;
    while ((n <= paramInt1 ? 0 : 1) == 0)
    {
      i3 = 1;
      f1 = Math.abs(paramArrayOfFloat[(n - 1 + (n - 1) * paramInt3 + paramInt2)]);
      if ((n >= paramInt1 ? 0 : 1) != 0)
      {
        j = n + Isamax.isamax(paramInt1 - n, paramArrayOfFloat, n + 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1);
        f3 = Math.abs(paramArrayOfFloat[(j - 1 + (n - 1) * paramInt3 + paramInt2)]);
      }
      else
      {
        f3 = 0.0F;
      }
      if ((Math.max(f1, f3) != 0.0F ? 0 : 1) == 0) {}
      if ((!Sisnan.sisnan(f1) ? 0 : 1) != 0)
      {
        if ((paramintW.val != 0 ? 0 : 1) != 0) {
          paramintW.val = n;
        }
        i2 = n;
      }
      else
      {
        if ((f1 < f2 * f3 ? 0 : 1) != 0)
        {
          i2 = n;
        }
        else
        {
          m = n - 1 + Isamax.isamax(j - n, paramArrayOfFloat, j - 1 + (n - 1) * paramInt3 + paramInt2, paramInt3);
          f9 = Math.abs(paramArrayOfFloat[(j - 1 + (m - 1) * paramInt3 + paramInt2)]);
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            m = j + Isamax.isamax(paramInt1 - j, paramArrayOfFloat, j + 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
            f9 = Math.max(f9, Math.abs(paramArrayOfFloat[(m - 1 + (j - 1) * paramInt3 + paramInt2)]));
          }
          if ((f1 < f2 * f3 * (f3 / f9) ? 0 : 1) != 0)
          {
            i2 = n;
          }
          else if ((Math.abs(paramArrayOfFloat[(j - 1 + (j - 1) * paramInt3 + paramInt2)]) < f2 * f9 ? 0 : 1) != 0)
          {
            i2 = j;
          }
          else
          {
            i2 = j;
            i3 = 2;
          }
        }
        i1 = n + i3 - 1;
        if ((i2 == i1 ? 0 : 1) != 0)
        {
          if ((i2 >= paramInt1 ? 0 : 1) != 0) {
            Sswap.sswap(paramInt1 - i2, paramArrayOfFloat, i2 + 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat, i2 + 1 - 1 + (i2 - 1) * paramInt3 + paramInt2, 1);
          }
          Sswap.sswap(i2 - i1 - 1, paramArrayOfFloat, i1 + 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat, i2 - 1 + (i1 + 1 - 1) * paramInt3 + paramInt2, paramInt3);
          f10 = paramArrayOfFloat[(i1 - 1 + (i1 - 1) * paramInt3 + paramInt2)];
          paramArrayOfFloat[(i1 - 1 + (i1 - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat[(i2 - 1 + (i2 - 1) * paramInt3 + paramInt2)];
          paramArrayOfFloat[(i2 - 1 + (i2 - 1) * paramInt3 + paramInt2)] = f10;
          if ((i3 != 2 ? 0 : 1) != 0)
          {
            f10 = paramArrayOfFloat[(n + 1 - 1 + (n - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat[(n + 1 - 1 + (n - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat[(i2 - 1 + (n - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat[(i2 - 1 + (n - 1) * paramInt3 + paramInt2)] = f10;
          }
        }
        if ((i3 != 1 ? 0 : 1) != 0)
        {
          if ((n >= paramInt1 ? 0 : 1) != 0)
          {
            f4 = 1.0F / paramArrayOfFloat[(n - 1 + (n - 1) * paramInt3 + paramInt2)];
            Ssyr.ssyr(paramString, paramInt1 - n, -f4, paramArrayOfFloat, n + 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat, n + 1 - 1 + (n + 1 - 1) * paramInt3 + paramInt2, paramInt3);
            Sscal.sscal(paramInt1 - n, f4, paramArrayOfFloat, n + 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1);
          }
        }
        else if ((n >= paramInt1 - 1 ? 0 : 1) != 0)
        {
          f6 = paramArrayOfFloat[(n + 1 - 1 + (n - 1) * paramInt3 + paramInt2)];
          f4 = paramArrayOfFloat[(n + 1 - 1 + (n + 1 - 1) * paramInt3 + paramInt2)] / f6;
          f7 = paramArrayOfFloat[(n - 1 + (n - 1) * paramInt3 + paramInt2)] / f6;
          f10 = 1.0F / (f4 * f7 - 1.0F);
          f6 = f10 / f6;
          k = n + 2;
          for (i4 = paramInt1 - (n + 2) + 1; i4 > 0; i4--)
          {
            f11 = f6 * (f4 * paramArrayOfFloat[(k - 1 + (n - 1) * paramInt3 + paramInt2)] - paramArrayOfFloat[(k - 1 + (n + 1 - 1) * paramInt3 + paramInt2)]);
            f13 = f6 * (f7 * paramArrayOfFloat[(k - 1 + (n + 1 - 1) * paramInt3 + paramInt2)] - paramArrayOfFloat[(k - 1 + (n - 1) * paramInt3 + paramInt2)]);
            i = k;
            for (i5 = paramInt1 - k + 1; i5 > 0; i5--)
            {
              paramArrayOfFloat[(i - 1 + (k - 1) * paramInt3 + paramInt2)] = (paramArrayOfFloat[(i - 1 + (k - 1) * paramInt3 + paramInt2)] - paramArrayOfFloat[(i - 1 + (n - 1) * paramInt3 + paramInt2)] * f11 - paramArrayOfFloat[(i - 1 + (n + 1 - 1) * paramInt3 + paramInt2)] * f13);
              i += 1;
            }
            paramArrayOfFloat[(k - 1 + (n - 1) * paramInt3 + paramInt2)] = f11;
            paramArrayOfFloat[(k - 1 + (n + 1 - 1) * paramInt3 + paramInt2)] = f13;
            k += 1;
          }
        }
      }
      if ((i3 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfInt[(n - 1 + paramInt4)] = i2;
      }
      else
      {
        paramArrayOfInt[(n - 1 + paramInt4)] = (-i2);
        paramArrayOfInt[(n + 1 - 1 + paramInt4)] = (-i2);
      }
      n += i3;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssytf2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */