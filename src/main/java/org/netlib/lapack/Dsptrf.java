package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.blas.Dspr;
import org.netlib.blas.Dswap;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsptrf
{
  public static void dsptrf(String paramString, int paramInt1, double[] paramArrayOfDouble, int paramInt2, int[] paramArrayOfInt, int paramInt3, intW paramintW)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    double d13 = 0.0D;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPTRF", -paramintW.val);
      return;
    }
    d2 = (1.0D + Math.sqrt(17.0D)) / 8.0D;
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
        d1 = Math.abs(paramArrayOfDouble[(i1 + n - 1 - 1 + paramInt2)]);
        if ((n <= 1 ? 0 : 1) != 0)
        {
          j = Idamax.idamax(n - 1, paramArrayOfDouble, i1 - 1 + paramInt2, 1);
          d3 = Math.abs(paramArrayOfDouble[(i1 + j - 1 - 1 + paramInt2)]);
        }
        else
        {
          d3 = 0.0D;
        }
        if ((Math.max(d1, d3) != 0.0D ? 0 : 1) != 0)
        {
          if ((paramintW.val != 0 ? 0 : 1) != 0) {
            paramintW.val = n;
          }
          i4 = n;
        }
        else
        {
          if ((d1 < d2 * d3 ? 0 : 1) != 0)
          {
            i4 = n;
          }
          else
          {
            d9 = 0.0D;
            m = j;
            i7 = j * (j + 1) / 2 + j;
            k = j + 1;
            for (i9 = n - (j + 1) + 1; i9 > 0; i9--)
            {
              if ((Math.abs(paramArrayOfDouble[(i7 - 1 + paramInt2)]) <= d9 ? 0 : 1) != 0)
              {
                d9 = Math.abs(paramArrayOfDouble[(i7 - 1 + paramInt2)]);
                m = k;
              }
              i7 += k;
              k += 1;
            }
            i5 = (j - 1) * j / 2 + 1;
            if ((j <= 1 ? 0 : 1) != 0)
            {
              m = Idamax.idamax(j - 1, paramArrayOfDouble, i5 - 1 + paramInt2, 1);
              d9 = Math.max(d9, Math.abs(paramArrayOfDouble[(i5 + m - 1 - 1 + paramInt2)]));
            }
            if ((d1 < d2 * d3 * (d3 / d9) ? 0 : 1) != 0)
            {
              i4 = n;
            }
            else if ((Math.abs(paramArrayOfDouble[(i5 + j - 1 - 1 + paramInt2)]) < d2 * d9 ? 0 : 1) != 0)
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
            Dswap.dswap(i4 - 1, paramArrayOfDouble, i3 - 1 + paramInt2, 1, paramArrayOfDouble, i5 - 1 + paramInt2, 1);
            i7 = i5 + i4 - 1;
            k = i4 + 1;
            for (i9 = i2 - 1 - (i4 + 1) + 1; i9 > 0; i9--)
            {
              i7 = i7 + k - 1;
              d10 = paramArrayOfDouble[(i3 + k - 1 - 1 + paramInt2)];
              paramArrayOfDouble[(i3 + k - 1 - 1 + paramInt2)] = paramArrayOfDouble[(i7 - 1 + paramInt2)];
              paramArrayOfDouble[(i7 - 1 + paramInt2)] = d10;
              k += 1;
            }
            d10 = paramArrayOfDouble[(i3 + i2 - 1 - 1 + paramInt2)];
            paramArrayOfDouble[(i3 + i2 - 1 - 1 + paramInt2)] = paramArrayOfDouble[(i5 + i4 - 1 - 1 + paramInt2)];
            paramArrayOfDouble[(i5 + i4 - 1 - 1 + paramInt2)] = d10;
            if ((i6 != 2 ? 0 : 1) != 0)
            {
              d10 = paramArrayOfDouble[(i1 + n - 2 - 1 + paramInt2)];
              paramArrayOfDouble[(i1 + n - 2 - 1 + paramInt2)] = paramArrayOfDouble[(i1 + i4 - 1 - 1 + paramInt2)];
              paramArrayOfDouble[(i1 + i4 - 1 - 1 + paramInt2)] = d10;
            }
          }
          if ((i6 != 1 ? 0 : 1) != 0)
          {
            d8 = 1.0D / paramArrayOfDouble[(i1 + n - 1 - 1 + paramInt2)];
            Dspr.dspr(paramString, n - 1, -d8, paramArrayOfDouble, i1 - 1 + paramInt2, 1, paramArrayOfDouble, paramInt2);
            Dscal.dscal(n - 1, d8, paramArrayOfDouble, i1 - 1 + paramInt2, 1);
          }
          else if ((n <= 2 ? 0 : 1) != 0)
          {
            d5 = paramArrayOfDouble[(n - 1 + (n - 1) * n / 2 - 1 + paramInt2)];
            d7 = paramArrayOfDouble[(n - 1 + (n - 2) * (n - 1) / 2 - 1 + paramInt2)] / d5;
            d4 = paramArrayOfDouble[(n + (n - 1) * n / 2 - 1 + paramInt2)] / d5;
            d10 = 1.0D / (d4 * d7 - 1.0D);
            d5 = d10 / d5;
            k = n - 2;
            for (i9 = (1 - (n - 2) + -1) / -1; i9 > 0; i9--)
            {
              d12 = d5 * (d4 * paramArrayOfDouble[(k + (n - 2) * (n - 1) / 2 - 1 + paramInt2)] - paramArrayOfDouble[(k + (n - 1) * n / 2 - 1 + paramInt2)]);
              d11 = d5 * (d7 * paramArrayOfDouble[(k + (n - 1) * n / 2 - 1 + paramInt2)] - paramArrayOfDouble[(k + (n - 2) * (n - 1) / 2 - 1 + paramInt2)]);
              i = k;
              for (i10 = (1 - k + -1) / -1; i10 > 0; i10--)
              {
                paramArrayOfDouble[(i + (k - 1) * k / 2 - 1 + paramInt2)] = (paramArrayOfDouble[(i + (k - 1) * k / 2 - 1 + paramInt2)] - paramArrayOfDouble[(i + (n - 1) * n / 2 - 1 + paramInt2)] * d11 - paramArrayOfDouble[(i + (n - 2) * (n - 1) / 2 - 1 + paramInt2)] * d12);
                i += -1;
              }
              paramArrayOfDouble[(k + (n - 1) * n / 2 - 1 + paramInt2)] = d11;
              paramArrayOfDouble[(k + (n - 2) * (n - 1) / 2 - 1 + paramInt2)] = d12;
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
      d1 = Math.abs(paramArrayOfDouble[(i1 - 1 + paramInt2)]);
      if ((n >= paramInt1 ? 0 : 1) != 0)
      {
        j = n + Idamax.idamax(paramInt1 - n, paramArrayOfDouble, i1 + 1 - 1 + paramInt2, 1);
        d3 = Math.abs(paramArrayOfDouble[(i1 + j - n - 1 + paramInt2)]);
      }
      else
      {
        d3 = 0.0D;
      }
      if ((Math.max(d1, d3) != 0.0D ? 0 : 1) != 0)
      {
        if ((paramintW.val != 0 ? 0 : 1) != 0) {
          paramintW.val = n;
        }
        i4 = n;
      }
      else
      {
        if ((d1 < d2 * d3 ? 0 : 1) != 0)
        {
          i4 = n;
        }
        else
        {
          d9 = 0.0D;
          i7 = i1 + j - n;
          k = n;
          for (i9 = j - 1 - n + 1; i9 > 0; i9--)
          {
            if ((Math.abs(paramArrayOfDouble[(i7 - 1 + paramInt2)]) <= d9 ? 0 : 1) != 0)
            {
              d9 = Math.abs(paramArrayOfDouble[(i7 - 1 + paramInt2)]);
              m = k;
            }
            i7 = i7 + paramInt1 - k;
            k += 1;
          }
          i5 = i8 - (paramInt1 - j + 1) * (paramInt1 - j + 2) / 2 + 1;
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            m = j + Idamax.idamax(paramInt1 - j, paramArrayOfDouble, i5 + 1 - 1 + paramInt2, 1);
            d9 = Math.max(d9, Math.abs(paramArrayOfDouble[(i5 + m - j - 1 + paramInt2)]));
          }
          if ((d1 < d2 * d3 * (d3 / d9) ? 0 : 1) != 0)
          {
            i4 = n;
          }
          else if ((Math.abs(paramArrayOfDouble[(i5 - 1 + paramInt2)]) < d2 * d9 ? 0 : 1) != 0)
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
            Dswap.dswap(paramInt1 - i4, paramArrayOfDouble, i3 + i4 - i2 + 1 - 1 + paramInt2, 1, paramArrayOfDouble, i5 + 1 - 1 + paramInt2, 1);
          }
          i7 = i3 + i4 - i2;
          k = i2 + 1;
          for (i9 = i4 - 1 - (i2 + 1) + 1; i9 > 0; i9--)
          {
            i7 = i7 + paramInt1 - k + 1;
            d10 = paramArrayOfDouble[(i3 + k - i2 - 1 + paramInt2)];
            paramArrayOfDouble[(i3 + k - i2 - 1 + paramInt2)] = paramArrayOfDouble[(i7 - 1 + paramInt2)];
            paramArrayOfDouble[(i7 - 1 + paramInt2)] = d10;
            k += 1;
          }
          d10 = paramArrayOfDouble[(i3 - 1 + paramInt2)];
          paramArrayOfDouble[(i3 - 1 + paramInt2)] = paramArrayOfDouble[(i5 - 1 + paramInt2)];
          paramArrayOfDouble[(i5 - 1 + paramInt2)] = d10;
          if ((i6 != 2 ? 0 : 1) != 0)
          {
            d10 = paramArrayOfDouble[(i1 + 1 - 1 + paramInt2)];
            paramArrayOfDouble[(i1 + 1 - 1 + paramInt2)] = paramArrayOfDouble[(i1 + i4 - n - 1 + paramInt2)];
            paramArrayOfDouble[(i1 + i4 - n - 1 + paramInt2)] = d10;
          }
        }
        if ((i6 != 1 ? 0 : 1) != 0)
        {
          if ((n >= paramInt1 ? 0 : 1) != 0)
          {
            d8 = 1.0D / paramArrayOfDouble[(i1 - 1 + paramInt2)];
            Dspr.dspr(paramString, paramInt1 - n, -d8, paramArrayOfDouble, i1 + 1 - 1 + paramInt2, 1, paramArrayOfDouble, i1 + paramInt1 - n + 1 - 1 + paramInt2);
            Dscal.dscal(paramInt1 - n, d8, paramArrayOfDouble, i1 + 1 - 1 + paramInt2, 1);
          }
        }
        else if ((n >= paramInt1 - 1 ? 0 : 1) != 0)
        {
          d6 = paramArrayOfDouble[(n + 1 + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)];
          d4 = paramArrayOfDouble[(n + 1 + n * (2 * paramInt1 - n - 1) / 2 - 1 + paramInt2)] / d6;
          d7 = paramArrayOfDouble[(n + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)] / d6;
          d10 = 1.0D / (d4 * d7 - 1.0D);
          d6 = d10 / d6;
          k = n + 2;
          for (i9 = paramInt1 - (n + 2) + 1; i9 > 0; i9--)
          {
            d11 = d6 * (d4 * paramArrayOfDouble[(k + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)] - paramArrayOfDouble[(k + n * (2 * paramInt1 - n - 1) / 2 - 1 + paramInt2)]);
            d13 = d6 * (d7 * paramArrayOfDouble[(k + n * (2 * paramInt1 - n - 1) / 2 - 1 + paramInt2)] - paramArrayOfDouble[(k + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)]);
            i = k;
            for (i10 = paramInt1 - k + 1; i10 > 0; i10--)
            {
              paramArrayOfDouble[(i + (k - 1) * (2 * paramInt1 - k) / 2 - 1 + paramInt2)] = (paramArrayOfDouble[(i + (k - 1) * (2 * paramInt1 - k) / 2 - 1 + paramInt2)] - paramArrayOfDouble[(i + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)] * d11 - paramArrayOfDouble[(i + n * (2 * paramInt1 - n - 1) / 2 - 1 + paramInt2)] * d13);
              i += 1;
            }
            paramArrayOfDouble[(k + (n - 1) * (2 * paramInt1 - n) / 2 - 1 + paramInt2)] = d11;
            paramArrayOfDouble[(k + n * (2 * paramInt1 - n - 1) / 2 - 1 + paramInt2)] = d13;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsptrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */