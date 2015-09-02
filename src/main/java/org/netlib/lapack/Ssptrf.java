package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sspr;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssptrf
{
  public static void ssptrf(String paramString, int paramInt1, float[] paramArrayOfFloat, int paramInt2, int[] paramArrayOfInt, int paramInt3, intW paramintW)
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
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
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
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSPTRF", -paramintW.val);
      return;
    }
    f2 = (1.0F + (float)Math.sqrt(17.0F)) / 8.0F;
    int i9;
    int i10;
    if (bool)
    {
      n = paramInt1;
      for (i1 = (paramInt1 - 1) * paramInt1 / 2 + 1;; i1 = i3 - n)
      {
        i3 = i1;
        if ((n >= 1 ? 0 : 1) != 0) {
          break;
        }
        i6 = 1;
        f1 = Math.abs(paramArrayOfFloat[(i1 + n - 1 - 1 + paramInt2)]);
        if ((n <= 1 ? 0 : 1) != 0)
        {
          j = Isamax.isamax(n - 1, paramArrayOfFloat, i1 - 1 + paramInt2, 1);
          f3 = Math.abs(paramArrayOfFloat[(i1 + j - 1 - 1 + paramInt2)]);
        }
        else
        {
          f3 = 0.0F;
        }
        if ((Math.max(f1, f3) != 0.0F ? 0 : 1) != 0)
        {
          if ((paramintW.val != 0 ? 0 : 1) != 0) {
            paramintW.val = n;
          }
          i4 = n;
        }
        else
        {
          if ((f1 < f2 * f3 ? 0 : 1) != 0)
          {
            i4 = n;
          }
          else
          {
            f9 = 0.0F;
            m = j;
            i7 = j * (j + 1) / 2 + j;
            k = j + 1;
            for (i9 = n - (j + 1) + 1; i9 > 0; i9--)
            {
              if ((Math.abs(paramArrayOfFloat[(i7 - 1 + paramInt2)]) <= f9 ? 0 : 1) != 0)
              {
                f9 = Math.abs(paramArrayOfFloat[(i7 - 1 + paramInt2)]);
                m = k;
              }
              i7 += k;
              k += 1;
            }
            i5 = (j - 1) * j / 2 + 1;
            if ((j <= 1 ? 0 : 1) != 0)
            {
              m = Isamax.isamax(j - 1, paramArrayOfFloat, i5 - 1 + paramInt2, 1);
              f9 = Math.max(f9, Math.abs(paramArrayOfFloat[(i5 + m - 1 - 1 + paramInt2)]));
            }
            if ((f1 < f2 * f3 * (f3 / f9) ? 0 : 1) != 0)
            {
              i4 = n;
            }
            else if ((Math.abs(paramArrayOfFloat[(i5 + j - 1 - 1 + paramInt2)]) < f2 * f9 ? 0 : 1) != 0)
            {
              i4 = j;
            }
            else
            {
              i4 = j;
              i6 = 2;
            }
          }
          i2 = n - i6 + 1;
          if ((i6 != 2 ? 0 : 1) != 0) {
            i3 = i3 - n + 1;
          }
          if ((i4 == i2 ? 0 : 1) != 0)
          {
            Sswap.sswap(i4 - 1, paramArrayOfFloat, i3 - 1 + paramInt2, 1, paramArrayOfFloat, i5 - 1 + paramInt2, 1);
            i7 = i5 + i4 - 1;
            k = i4 + 1;
            for (i9 = i2 - 1 - (i4 + 1) + 1; i9 > 0; i9--)
            {
              i7 = i7 + k - 1;
              f10 = paramArrayOfFloat[(i3 + k - 1 - 1 + paramInt2)];
              paramArrayOfFloat[(i3 + k - 1 - 1 + paramInt2)] = paramArrayOfFloat[(i7 - 1 + paramInt2)];
              paramArrayOfFloat[(i7 - 1 + paramInt2)] = f10;
              k += 1;
            }
            f10 = paramArrayOfFloat[(i3 + i2 - 1 - 1 + paramInt2)];
            paramArrayOfFloat[(i3 + i2 - 1 - 1 + paramInt2)] = paramArrayOfFloat[(i5 + i4 - 1 - 1 + paramInt2)];
            paramArrayOfFloat[(i5 + i4 - 1 - 1 + paramInt2)] = f10;
            if ((i6 != 2 ? 0 : 1) != 0)
            {
              f10 = paramArrayOfFloat[(i1 + n - 2 - 1 + paramInt2)];
              paramArrayOfFloat[(i1 + n - 2 - 1 + paramInt2)] = paramArrayOfFloat[(i1 + i4 - 1 - 1 + paramInt2)];
              paramArrayOfFloat[(i1 + i4 - 1 - 1 + paramInt2)] = f10;
            }
          }
          if ((i6 != 1 ? 0 : 1) != 0)
          {
            f8 = 1.0F / paramArrayOfFloat[(i1 + n - 1 - 1 + paramInt2)];
            Sspr.sspr(paramString, n - 1, -f8, paramArrayOfFloat, i1 - 1 + paramInt2, 1, paramArrayOfFloat, paramInt2);
            Sscal.sscal(n - 1, f8, paramArrayOfFloat, i1 - 1 + paramInt2, 1);
          }
          else if ((n <= 2 ? 0 : 1) != 0)
          {
            f5 = paramArrayOfFloat[(n - 1 + (n - 1) * n / 2 - 1 + paramInt2)];
            f7 = paramArrayOfFloat[(n - 1 + (n - 2) * (n - 1) / 2 - 1 + paramInt2)] / f5;
            f4 = paramArrayOfFloat[(n + (n - 1) * n / 2 - 1 + paramInt2)] / f5;
            f10 = 1.0F / (f4 * f7 - 1.0F);
            f5 = f10 / f5;
            k = n - 2;
            for (i9 = (1 - (n - 2) + -1) / -1; i9 > 0; i9--)
            {
              f12 = f5 * (f4 * paramArrayOfFloat[(k + (n - 2) * (n - 1) / 2 - 1 + paramInt2)] - paramArrayOfFloat[(k + (n - 1) * n / 2 - 1 + paramInt2)]);
              f11 = f5 * (f7 * paramArrayOfFloat[(k + (n - 1) * n / 2 - 1 + paramInt2)] - paramArrayOfFloat[(k + (n - 2) * (n - 1) / 2 - 1 + paramInt2)]);
              i = k;
              for (i10 = (1 - k + -1) / -1; i10 > 0; i10--)
              {
                paramArrayOfFloat[(i + (k - 1) * k / 2 - 1 + paramInt2)] = (paramArrayOfFloat[(i + (k - 1) * k / 2 - 1 + paramInt2)] - paramArrayOfFloat[(i + (n - 1) * n / 2 - 1 + paramInt2)] * f11 - paramArrayOfFloat[(i + (n - 2) * (n - 1) / 2 - 1 + paramInt2)] * f12);
                i += -1;
              }
              paramArrayOfFloat[(k + (n - 1) * n / 2 - 1 + paramInt2)] = f11;
              paramArrayOfFloat[(k + (n - 2) * (n - 1) / 2 - 1 + paramInt2)] = f12;
              k += -1;
            }
          }
        }
        if ((i6 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfInt[(n - 1 + paramInt3)] = i4;
        }
        else
        {
          paramArrayOfInt[(n - 1 + paramInt3)] = (-i4);
          paramArrayOfInt[(n - 1 - 1 + paramInt3)] = (-i4);
        }
        n -= i6;
      }
    }
    n = 1;
    i1 = 1;
    i8 = paramInt1 * (paramInt1 + 1) / 2;
    for (;;)
    {
      i3 = i1;
      if ((n <= paramInt1 ? 0 : 1) != 0) {
        break;
      }
      i6 = 1;
      f1 = Math.abs(paramArrayOfFloat[(i1 - 1 + paramInt2)]);
      if ((n >= paramInt1 ? 0 : 1) != 0)
      {
        j = n + Isamax.isamax(paramInt1 - n, paramArrayOfFloat, i1 + 1 - 1 + paramInt2, 1);
        f3 = Math.abs(paramArrayOfFloat[(i1 + j - n - 1 + paramInt2)]);
      }
      else
      {
        f3 = 0.0F;
      }
      if ((Math.max(f1, f3) != 0.0F ? 0 : 1) != 0)
      {
        if ((paramintW.val != 0 ? 0 : 1) != 0) {
          paramintW.val = n;
        }
        i4 = n;
      }
      else
      {
        if ((f1 < f2 * f3 ? 0 : 1) != 0)
        {
          i4 = n;
        }
        else
        {
          f9 = 0.0F;
          i7 = i1 + j - n;
          k = n;
          for (i9 = j - 1 - n + 1; i9 > 0; i9--)
          {
            if ((Math.abs(paramArrayOfFloat[(i7 - 1 + paramInt2)]) <= f9 ? 0 : 1) != 0)
            {
              f9 = Math.abs(paramArrayOfFloat[(i7 - 1 + paramInt2)]);
              m = k;
            }
            i7 = i7 + paramInt1 - k;
            k += 1;
          }
          i5 = i8 - (paramInt1 - j + 1) * (paramInt1 - j + 2) / 2 + 1;
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            m = j + Isamax.isamax(paramInt1 - j, paramArrayOfFloat, i5 + 1 - 1 + paramInt2, 1);
            f9 = Math.max(f9, Math.abs(paramArrayOfFloat[(i5 + m - j - 1 + paramInt2)]));
          }
          if ((f1 < f2 * f3 * (f3 / f9) ? 0 : 1) != 0)
          {
            i4 = n;
          }
          else if ((Math.abs(paramArrayOfFloat[(i5 - 1 + paramInt2)]) < f2 * f9 ? 0 : 1) != 0)
          {
            i4 = j;
          }
          else
          {
            i4 = j;
            i6 = 2;
          }
        }
        i2 = n + i6 - 1;
        if ((i6 != 2 ? 0 : 1) != 0) {
          i3 = i3 + paramInt1 - n + 1;
        }
        if ((i4 == i2 ? 0 : 1) != 0)
        {
          if ((i4 >= paramInt1 ? 0 : 1) != 0) {
            Sswap.sswap(paramInt1 - i4, paramArrayOfFloat, i3 + i4 - i2 + 1 - 1 + paramInt2, 1, paramArrayOfFloat, i5 + 1 - 1 + paramInt2, 1);
          }
          i7 = i3 + i4 - i2;
          k = i2 + 1;
          for (i9 = i4 - 1 - (i2 + 1) + 1; i9 > 0; i9--)
          {
            i7 = i7 + paramInt1 - k + 1;
            f10 = paramArrayOfFloat[(i3 + k - i2 - 1 + paramInt2)];
            paramArrayOfFloat[(i3 + k - i2 - 1 + paramInt2)] = paramArrayOfFloat[(i7 - 1 + paramInt2)];
            paramArrayOfFloat[(i7 - 1 + paramInt2)] = f10;
            k += 1;
          }
          f10 = paramArrayOfFloat[(i3 - 1 + paramInt2)];
          paramArrayOfFloat[(i3 - 1 + paramInt2)] = paramArrayOfFloat[(i5 - 1 + paramInt2)];
          paramArrayOfFloat[(i5 - 1 + paramInt2)] = f10;
          if ((i6 != 2 ? 0 : 1) != 0)
          {
            f10 = paramArrayOfFloat[(i1 + 1 - 1 + paramInt2)];
            paramArrayOfFloat[(i1 + 1 - 1 + paramInt2)] = paramArrayOfFloat[(i1 + i4 - n - 1 + paramInt2)];
            paramArrayOfFloat[(i1 + i4 - n - 1 + paramInt2)] = f10;
          }
        }
        if ((i6 != 1 ? 0 : 1) != 0)
        {
          if ((n >= paramInt1 ? 0 : 1) != 0)
          {
            f8 = 1.0F / paramArrayOfFloat[(i1 - 1 + paramInt2)];
            Sspr.sspr(paramString, paramInt1 - n, -f8, paramArrayOfFloat, i1 + 1 - 1 + paramInt2, 1, paramArrayOfFloat, i1 + paramInt1 - n + 1 - 1 + paramInt2);
            Sscal.sscal(paramInt1 - n, f8, paramArrayOfFloat, i1 + 1 - 1 + paramInt2, 1);
          }
        }
        else if ((n >= paramInt1 - 1 ? 0 : 1) != 0)
        {
          f6 = paramArrayOfFloat[(n + 1 + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)];
          f4 = paramArrayOfFloat[(n + 1 + n * (2 * paramInt1 - n - 1) / 2 - 1 + paramInt2)] / f6;
          f7 = paramArrayOfFloat[(n + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)] / f6;
          f10 = 1.0F / (f4 * f7 - 1.0F);
          f6 = f10 / f6;
          k = n + 2;
          for (i9 = paramInt1 - (n + 2) + 1; i9 > 0; i9--)
          {
            f11 = f6 * (f4 * paramArrayOfFloat[(k + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)] - paramArrayOfFloat[(k + n * (2 * paramInt1 - n - 1) / 2 - 1 + paramInt2)]);
            f13 = f6 * (f7 * paramArrayOfFloat[(k + n * (2 * paramInt1 - n - 1) / 2 - 1 + paramInt2)] - paramArrayOfFloat[(k + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)]);
            i = k;
            for (i10 = paramInt1 - k + 1; i10 > 0; i10--)
            {
              paramArrayOfFloat[(i + (k - 1) * (2 * paramInt1 - k) / 2 - 1 + paramInt2)] = (paramArrayOfFloat[(i + (k - 1) * (2 * paramInt1 - k) / 2 - 1 + paramInt2)] - paramArrayOfFloat[(i + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)] * f11 - paramArrayOfFloat[(i + n * (2 * paramInt1 - n - 1) / 2 - 1 + paramInt2)] * f13);
              i += 1;
            }
            paramArrayOfFloat[(k + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)] = f11;
            paramArrayOfFloat[(k + n * (2 * paramInt1 - n - 1) / 2 - 1 + paramInt2)] = f13;
            k += 1;
          }
        }
      }
      if ((i6 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfInt[(n - 1 + paramInt3)] = i4;
      }
      else
      {
        paramArrayOfInt[(n - 1 + paramInt3)] = (-i4);
        paramArrayOfInt[(n + 1 - 1 + paramInt3)] = (-i4);
      }
      n += i6;
      i1 = i3 + paramInt1 - n + 2;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssptrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */