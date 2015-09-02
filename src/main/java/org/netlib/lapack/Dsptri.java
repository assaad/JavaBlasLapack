package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dspmv;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsptri
{
  public static void dsptri(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int[] paramArrayOfInt, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, intW paramintW)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPTRI", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int i5;
    if (bool)
    {
      n = paramInt1 * (paramInt1 + 1) / 2;
      paramintW.val = paramInt1;
      for (i5 = (1 - paramInt1 + -1) / -1; i5 > 0; i5--)
      {
        if ((paramArrayOfInt[(paramintW.val - 1 + paramInt3)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble1[(n - 1 + paramInt2)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        n -= paramintW.val;
        paramintW.val += -1;
      }
    }
    else
    {
      n = 1;
      paramintW.val = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        if ((paramArrayOfInt[(paramintW.val - 1 + paramInt3)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble1[(n - 1 + paramInt2)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        n = n + paramInt1 - paramintW.val + 1;
        paramintW.val += 1;
      }
    }
    paramintW.val = 0;
    if (bool)
    {
      j = 1;
      for (k = 1; (j <= paramInt1 ? 0 : 1) == 0; k = m)
      {
        m = k + j;
        if ((paramArrayOfInt[(j - 1 + paramInt3)] <= 0 ? 0 : 1) != 0)
        {
          paramArrayOfDouble1[(k + j - 1 - 1 + paramInt2)] = (1.0D / paramArrayOfDouble1[(k + j - 1 - 1 + paramInt2)]);
          if ((j <= 1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(j - 1, paramArrayOfDouble1, k - 1 + paramInt2, 1, paramArrayOfDouble2, paramInt4, 1);
            Dspmv.dspmv(paramString, j - 1, -1.0D, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt4, 1, 0.0D, paramArrayOfDouble1, k - 1 + paramInt2, 1);
            paramArrayOfDouble1[(k + j - 1 - 1 + paramInt2)] -= Ddot.ddot(j - 1, paramArrayOfDouble2, paramInt4, 1, paramArrayOfDouble1, k - 1 + paramInt2, 1);
          }
          i2 = 1;
        }
        else
        {
          d5 = Math.abs(paramArrayOfDouble1[(m + j - 1 - 1 + paramInt2)]);
          d1 = paramArrayOfDouble1[(k + j - 1 - 1 + paramInt2)] / d5;
          d3 = paramArrayOfDouble1[(m + j - 1 + paramInt2)] / d5;
          d2 = paramArrayOfDouble1[(m + j - 1 - 1 + paramInt2)] / d5;
          d4 = d5 * (d1 * d3 - 1.0D);
          paramArrayOfDouble1[(k + j - 1 - 1 + paramInt2)] = (d3 / d4);
          paramArrayOfDouble1[(m + j - 1 + paramInt2)] = (d1 / d4);
          paramArrayOfDouble1[(m + j - 1 - 1 + paramInt2)] = (-(d2 / d4));
          if ((j <= 1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(j - 1, paramArrayOfDouble1, k - 1 + paramInt2, 1, paramArrayOfDouble2, paramInt4, 1);
            Dspmv.dspmv(paramString, j - 1, -1.0D, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt4, 1, 0.0D, paramArrayOfDouble1, k - 1 + paramInt2, 1);
            paramArrayOfDouble1[(k + j - 1 - 1 + paramInt2)] -= Ddot.ddot(j - 1, paramArrayOfDouble2, paramInt4, 1, paramArrayOfDouble1, k - 1 + paramInt2, 1);
            paramArrayOfDouble1[(m + j - 1 - 1 + paramInt2)] -= Ddot.ddot(j - 1, paramArrayOfDouble1, k - 1 + paramInt2, 1, paramArrayOfDouble1, m - 1 + paramInt2, 1);
            Dcopy.dcopy(j - 1, paramArrayOfDouble1, m - 1 + paramInt2, 1, paramArrayOfDouble2, paramInt4, 1);
            Dspmv.dspmv(paramString, j - 1, -1.0D, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt4, 1, 0.0D, paramArrayOfDouble1, m - 1 + paramInt2, 1);
            paramArrayOfDouble1[(m + j - 1 + paramInt2)] -= Ddot.ddot(j - 1, paramArrayOfDouble2, paramInt4, 1, paramArrayOfDouble1, m - 1 + paramInt2, 1);
          }
          i2 = 2;
          m = m + j + 1;
        }
        n = Math.abs(paramArrayOfInt[(j - 1 + paramInt3)]);
        if ((n == j ? 0 : 1) != 0)
        {
          i1 = (n - 1) * n / 2 + 1;
          Dswap.dswap(n - 1, paramArrayOfDouble1, k - 1 + paramInt2, 1, paramArrayOfDouble1, i1 - 1 + paramInt2, 1);
          i3 = i1 + n - 1;
          i = n + 1;
          for (i5 = j - 1 - (n + 1) + 1; i5 > 0; i5--)
          {
            i3 = i3 + i - 1;
            d6 = paramArrayOfDouble1[(k + i - 1 - 1 + paramInt2)];
            paramArrayOfDouble1[(k + i - 1 - 1 + paramInt2)] = paramArrayOfDouble1[(i3 - 1 + paramInt2)];
            paramArrayOfDouble1[(i3 - 1 + paramInt2)] = d6;
            i += 1;
          }
          d6 = paramArrayOfDouble1[(k + j - 1 - 1 + paramInt2)];
          paramArrayOfDouble1[(k + j - 1 - 1 + paramInt2)] = paramArrayOfDouble1[(i1 + n - 1 - 1 + paramInt2)];
          paramArrayOfDouble1[(i1 + n - 1 - 1 + paramInt2)] = d6;
          if ((i2 != 2 ? 0 : 1) != 0)
          {
            d6 = paramArrayOfDouble1[(k + j + j - 1 - 1 + paramInt2)];
            paramArrayOfDouble1[(k + j + j - 1 - 1 + paramInt2)] = paramArrayOfDouble1[(k + j + n - 1 - 1 + paramInt2)];
            paramArrayOfDouble1[(k + j + n - 1 - 1 + paramInt2)] = d6;
          }
        }
        j += i2;
      }
    }
    else
    {
      i4 = paramInt1 * (paramInt1 + 1) / 2;
      j = paramInt1;
      for (k = i4; (j >= 1 ? 0 : 1) == 0; k = m)
      {
        m = k - (paramInt1 - j + 2);
        if ((paramArrayOfInt[(j - 1 + paramInt3)] <= 0 ? 0 : 1) != 0)
        {
          paramArrayOfDouble1[(k - 1 + paramInt2)] = (1.0D / paramArrayOfDouble1[(k - 1 + paramInt2)]);
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(paramInt1 - j, paramArrayOfDouble1, k + 1 - 1 + paramInt2, 1, paramArrayOfDouble2, paramInt4, 1);
            Dspmv.dspmv(paramString, paramInt1 - j, -1.0D, paramArrayOfDouble1, k + paramInt1 - j + 1 - 1 + paramInt2, paramArrayOfDouble2, paramInt4, 1, 0.0D, paramArrayOfDouble1, k + 1 - 1 + paramInt2, 1);
            paramArrayOfDouble1[(k - 1 + paramInt2)] -= Ddot.ddot(paramInt1 - j, paramArrayOfDouble2, paramInt4, 1, paramArrayOfDouble1, k + 1 - 1 + paramInt2, 1);
          }
          i2 = 1;
        }
        else
        {
          d5 = Math.abs(paramArrayOfDouble1[(m + 1 - 1 + paramInt2)]);
          d1 = paramArrayOfDouble1[(m - 1 + paramInt2)] / d5;
          d3 = paramArrayOfDouble1[(k - 1 + paramInt2)] / d5;
          d2 = paramArrayOfDouble1[(m + 1 - 1 + paramInt2)] / d5;
          d4 = d5 * (d1 * d3 - 1.0D);
          paramArrayOfDouble1[(m - 1 + paramInt2)] = (d3 / d4);
          paramArrayOfDouble1[(k - 1 + paramInt2)] = (d1 / d4);
          paramArrayOfDouble1[(m + 1 - 1 + paramInt2)] = (-(d2 / d4));
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(paramInt1 - j, paramArrayOfDouble1, k + 1 - 1 + paramInt2, 1, paramArrayOfDouble2, paramInt4, 1);
            Dspmv.dspmv(paramString, paramInt1 - j, -1.0D, paramArrayOfDouble1, k + (paramInt1 - j + 1) - 1 + paramInt2, paramArrayOfDouble2, paramInt4, 1, 0.0D, paramArrayOfDouble1, k + 1 - 1 + paramInt2, 1);
            paramArrayOfDouble1[(k - 1 + paramInt2)] -= Ddot.ddot(paramInt1 - j, paramArrayOfDouble2, paramInt4, 1, paramArrayOfDouble1, k + 1 - 1 + paramInt2, 1);
            paramArrayOfDouble1[(m + 1 - 1 + paramInt2)] -= Ddot.ddot(paramInt1 - j, paramArrayOfDouble1, k + 1 - 1 + paramInt2, 1, paramArrayOfDouble1, m + 2 - 1 + paramInt2, 1);
            Dcopy.dcopy(paramInt1 - j, paramArrayOfDouble1, m + 2 - 1 + paramInt2, 1, paramArrayOfDouble2, paramInt4, 1);
            Dspmv.dspmv(paramString, paramInt1 - j, -1.0D, paramArrayOfDouble1, k + (paramInt1 - j + 1) - 1 + paramInt2, paramArrayOfDouble2, paramInt4, 1, 0.0D, paramArrayOfDouble1, m + 2 - 1 + paramInt2, 1);
            paramArrayOfDouble1[(m - 1 + paramInt2)] -= Ddot.ddot(paramInt1 - j, paramArrayOfDouble2, paramInt4, 1, paramArrayOfDouble1, m + 2 - 1 + paramInt2, 1);
          }
          i2 = 2;
          m -= paramInt1 - j + 3;
        }
        n = Math.abs(paramArrayOfInt[(j - 1 + paramInt3)]);
        if ((n == j ? 0 : 1) != 0)
        {
          i1 = i4 - (paramInt1 - n + 1) * (paramInt1 - n + 2) / 2 + 1;
          if ((n >= paramInt1 ? 0 : 1) != 0) {
            Dswap.dswap(paramInt1 - n, paramArrayOfDouble1, k + n - j + 1 - 1 + paramInt2, 1, paramArrayOfDouble1, i1 + 1 - 1 + paramInt2, 1);
          }
          i3 = k + n - j;
          i = j + 1;
          for (i5 = n - 1 - (j + 1) + 1; i5 > 0; i5--)
          {
            i3 = i3 + paramInt1 - i + 1;
            d6 = paramArrayOfDouble1[(k + i - j - 1 + paramInt2)];
            paramArrayOfDouble1[(k + i - j - 1 + paramInt2)] = paramArrayOfDouble1[(i3 - 1 + paramInt2)];
            paramArrayOfDouble1[(i3 - 1 + paramInt2)] = d6;
            i += 1;
          }
          d6 = paramArrayOfDouble1[(k - 1 + paramInt2)];
          paramArrayOfDouble1[(k - 1 + paramInt2)] = paramArrayOfDouble1[(i1 - 1 + paramInt2)];
          paramArrayOfDouble1[(i1 - 1 + paramInt2)] = d6;
          if ((i2 != 2 ? 0 : 1) != 0)
          {
            d6 = paramArrayOfDouble1[(k - paramInt1 + j - 1 - 1 + paramInt2)];
            paramArrayOfDouble1[(k - paramInt1 + j - 1 - 1 + paramInt2)] = paramArrayOfDouble1[(k - paramInt1 + n - 1 - 1 + paramInt2)];
            paramArrayOfDouble1[(k - paramInt1 + n - 1 - 1 + paramInt2)] = d6;
          }
        }
        j -= i2;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsptri.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */