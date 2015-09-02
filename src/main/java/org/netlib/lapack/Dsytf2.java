package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.blas.Dsyr;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsytf2
{
  public static void dsytf2(String paramString, int paramInt1, double[] paramArrayOfDouble, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4, intW paramintW)
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
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYTF2", -paramintW.val);
      return;
    }
    d2 = (1.0D + Math.sqrt(17.0D)) / 8.0D;
    int i4;
    int i5;
    if (bool)
    {
      n = paramInt1;
      while ((n >= 1 ? 0 : 1) == 0)
      {
        i3 = 1;
        d1 = Math.abs(paramArrayOfDouble[(n - 1 + (n - 1) * paramInt3 + paramInt2)]);
        if ((n <= 1 ? 0 : 1) != 0)
        {
          j = Idamax.idamax(n - 1, paramArrayOfDouble, 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1);
          d3 = Math.abs(paramArrayOfDouble[(j - 1 + (n - 1) * paramInt3 + paramInt2)]);
        }
        else
        {
          d3 = 0.0D;
        }
        if ((Math.max(d1, d3) != 0.0D ? 0 : 1) == 0) {}
        if ((!Disnan.disnan(d1) ? 0 : 1) != 0)
        {
          if ((paramintW.val != 0 ? 0 : 1) != 0) {
            paramintW.val = n;
          }
          i2 = n;
        }
        else
        {
          if ((d1 < d2 * d3 ? 0 : 1) != 0)
          {
            i2 = n;
          }
          else
          {
            m = j + Idamax.idamax(n - j, paramArrayOfDouble, j - 1 + (j + 1 - 1) * paramInt3 + paramInt2, paramInt3);
            d9 = Math.abs(paramArrayOfDouble[(j - 1 + (m - 1) * paramInt3 + paramInt2)]);
            if ((j <= 1 ? 0 : 1) != 0)
            {
              m = Idamax.idamax(j - 1, paramArrayOfDouble, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
              d9 = Math.max(d9, Math.abs(paramArrayOfDouble[(m - 1 + (j - 1) * paramInt3 + paramInt2)]));
            }
            if ((d1 < d2 * d3 * (d3 / d9) ? 0 : 1) != 0)
            {
              i2 = n;
            }
            else if ((Math.abs(paramArrayOfDouble[(j - 1 + (j - 1) * paramInt3 + paramInt2)]) < d2 * d9 ? 0 : 1) != 0)
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
            Dswap.dswap(i2 - 1, paramArrayOfDouble, 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble, 1 - 1 + (i2 - 1) * paramInt3 + paramInt2, 1);
            Dswap.dswap(i1 - i2 - 1, paramArrayOfDouble, i2 + 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble, i2 - 1 + (i2 + 1 - 1) * paramInt3 + paramInt2, paramInt3);
            d10 = paramArrayOfDouble[(i1 - 1 + (i1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfDouble[(i1 - 1 + (i1 - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble[(i2 - 1 + (i2 - 1) * paramInt3 + paramInt2)];
            paramArrayOfDouble[(i2 - 1 + (i2 - 1) * paramInt3 + paramInt2)] = d10;
            if ((i3 != 2 ? 0 : 1) != 0)
            {
              d10 = paramArrayOfDouble[(n - 1 - 1 + (n - 1) * paramInt3 + paramInt2)];
              paramArrayOfDouble[(n - 1 - 1 + (n - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble[(i2 - 1 + (n - 1) * paramInt3 + paramInt2)];
              paramArrayOfDouble[(i2 - 1 + (n - 1) * paramInt3 + paramInt2)] = d10;
            }
          }
          if ((i3 != 1 ? 0 : 1) != 0)
          {
            d8 = 1.0D / paramArrayOfDouble[(n - 1 + (n - 1) * paramInt3 + paramInt2)];
            Dsyr.dsyr(paramString, n - 1, -d8, paramArrayOfDouble, 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble, paramInt2, paramInt3);
            Dscal.dscal(n - 1, d8, paramArrayOfDouble, 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1);
          }
          else if ((n <= 2 ? 0 : 1) != 0)
          {
            d5 = paramArrayOfDouble[(n - 1 - 1 + (n - 1) * paramInt3 + paramInt2)];
            d7 = paramArrayOfDouble[(n - 1 - 1 + (n - 1 - 1) * paramInt3 + paramInt2)] / d5;
            d4 = paramArrayOfDouble[(n - 1 + (n - 1) * paramInt3 + paramInt2)] / d5;
            d10 = 1.0D / (d4 * d7 - 1.0D);
            d5 = d10 / d5;
            k = n - 2;
            for (i4 = (1 - (n - 2) + -1) / -1; i4 > 0; i4--)
            {
              d12 = d5 * (d4 * paramArrayOfDouble[(k - 1 + (n - 1 - 1) * paramInt3 + paramInt2)] - paramArrayOfDouble[(k - 1 + (n - 1) * paramInt3 + paramInt2)]);
              d11 = d5 * (d7 * paramArrayOfDouble[(k - 1 + (n - 1) * paramInt3 + paramInt2)] - paramArrayOfDouble[(k - 1 + (n - 1 - 1) * paramInt3 + paramInt2)]);
              i = k;
              for (i5 = (1 - k + -1) / -1; i5 > 0; i5--)
              {
                paramArrayOfDouble[(i - 1 + (k - 1) * paramInt3 + paramInt2)] = (paramArrayOfDouble[(i - 1 + (k - 1) * paramInt3 + paramInt2)] - paramArrayOfDouble[(i - 1 + (n - 1) * paramInt3 + paramInt2)] * d11 - paramArrayOfDouble[(i - 1 + (n - 1 - 1) * paramInt3 + paramInt2)] * d12);
                i += -1;
              }
              paramArrayOfDouble[(k - 1 + (n - 1) * paramInt3 + paramInt2)] = d11;
              paramArrayOfDouble[(k - 1 + (n - 1 - 1) * paramInt3 + paramInt2)] = d12;
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
      d1 = Math.abs(paramArrayOfDouble[(n - 1 + (n - 1) * paramInt3 + paramInt2)]);
      if ((n >= paramInt1 ? 0 : 1) != 0)
      {
        j = n + Idamax.idamax(paramInt1 - n, paramArrayOfDouble, n + 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1);
        d3 = Math.abs(paramArrayOfDouble[(j - 1 + (n - 1) * paramInt3 + paramInt2)]);
      }
      else
      {
        d3 = 0.0D;
      }
      if ((Math.max(d1, d3) != 0.0D ? 0 : 1) == 0) {}
      if ((!Disnan.disnan(d1) ? 0 : 1) != 0)
      {
        if ((paramintW.val != 0 ? 0 : 1) != 0) {
          paramintW.val = n;
        }
        i2 = n;
      }
      else
      {
        if ((d1 < d2 * d3 ? 0 : 1) != 0)
        {
          i2 = n;
        }
        else
        {
          m = n - 1 + Idamax.idamax(j - n, paramArrayOfDouble, j - 1 + (n - 1) * paramInt3 + paramInt2, paramInt3);
          d9 = Math.abs(paramArrayOfDouble[(j - 1 + (m - 1) * paramInt3 + paramInt2)]);
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            m = j + Idamax.idamax(paramInt1 - j, paramArrayOfDouble, j + 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
            d9 = Math.max(d9, Math.abs(paramArrayOfDouble[(m - 1 + (j - 1) * paramInt3 + paramInt2)]));
          }
          if ((d1 < d2 * d3 * (d3 / d9) ? 0 : 1) != 0)
          {
            i2 = n;
          }
          else if ((Math.abs(paramArrayOfDouble[(j - 1 + (j - 1) * paramInt3 + paramInt2)]) < d2 * d9 ? 0 : 1) != 0)
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
            Dswap.dswap(paramInt1 - i2, paramArrayOfDouble, i2 + 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble, i2 + 1 - 1 + (i2 - 1) * paramInt3 + paramInt2, 1);
          }
          Dswap.dswap(i2 - i1 - 1, paramArrayOfDouble, i1 + 1 - 1 + (i1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble, i2 - 1 + (i1 + 1 - 1) * paramInt3 + paramInt2, paramInt3);
          d10 = paramArrayOfDouble[(i1 - 1 + (i1 - 1) * paramInt3 + paramInt2)];
          paramArrayOfDouble[(i1 - 1 + (i1 - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble[(i2 - 1 + (i2 - 1) * paramInt3 + paramInt2)];
          paramArrayOfDouble[(i2 - 1 + (i2 - 1) * paramInt3 + paramInt2)] = d10;
          if ((i3 != 2 ? 0 : 1) != 0)
          {
            d10 = paramArrayOfDouble[(n + 1 - 1 + (n - 1) * paramInt3 + paramInt2)];
            paramArrayOfDouble[(n + 1 - 1 + (n - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble[(i2 - 1 + (n - 1) * paramInt3 + paramInt2)];
            paramArrayOfDouble[(i2 - 1 + (n - 1) * paramInt3 + paramInt2)] = d10;
          }
        }
        if ((i3 != 1 ? 0 : 1) != 0)
        {
          if ((n >= paramInt1 ? 0 : 1) != 0)
          {
            d4 = 1.0D / paramArrayOfDouble[(n - 1 + (n - 1) * paramInt3 + paramInt2)];
            Dsyr.dsyr(paramString, paramInt1 - n, -d4, paramArrayOfDouble, n + 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble, n + 1 - 1 + (n + 1 - 1) * paramInt3 + paramInt2, paramInt3);
            Dscal.dscal(paramInt1 - n, d4, paramArrayOfDouble, n + 1 - 1 + (n - 1) * paramInt3 + paramInt2, 1);
          }
        }
        else if ((n >= paramInt1 - 1 ? 0 : 1) != 0)
        {
          d6 = paramArrayOfDouble[(n + 1 - 1 + (n - 1) * paramInt3 + paramInt2)];
          d4 = paramArrayOfDouble[(n + 1 - 1 + (n + 1 - 1) * paramInt3 + paramInt2)] / d6;
          d7 = paramArrayOfDouble[(n - 1 + (n - 1) * paramInt3 + paramInt2)] / d6;
          d10 = 1.0D / (d4 * d7 - 1.0D);
          d6 = d10 / d6;
          k = n + 2;
          for (i4 = paramInt1 - (n + 2) + 1; i4 > 0; i4--)
          {
            d11 = d6 * (d4 * paramArrayOfDouble[(k - 1 + (n - 1) * paramInt3 + paramInt2)] - paramArrayOfDouble[(k - 1 + (n + 1 - 1) * paramInt3 + paramInt2)]);
            d13 = d6 * (d7 * paramArrayOfDouble[(k - 1 + (n + 1 - 1) * paramInt3 + paramInt2)] - paramArrayOfDouble[(k - 1 + (n - 1) * paramInt3 + paramInt2)]);
            i = k;
            for (i5 = paramInt1 - k + 1; i5 > 0; i5--)
            {
              paramArrayOfDouble[(i - 1 + (k - 1) * paramInt3 + paramInt2)] = (paramArrayOfDouble[(i - 1 + (k - 1) * paramInt3 + paramInt2)] - paramArrayOfDouble[(i - 1 + (n - 1) * paramInt3 + paramInt2)] * d11 - paramArrayOfDouble[(i - 1 + (n + 1 - 1) * paramInt3 + paramInt2)] * d13);
              i += 1;
            }
            paramArrayOfDouble[(k - 1 + (n - 1) * paramInt3 + paramInt2)] = d11;
            paramArrayOfDouble[(k - 1 + (n + 1 - 1) * paramInt3 + paramInt2)] = d13;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsytf2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */