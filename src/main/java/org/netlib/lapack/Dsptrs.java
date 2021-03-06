package org.netlib.lapack;

import org.netlib.blas.Dgemv;
import org.netlib.blas.Dger;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsptrs
{
  public static void dsptrs(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int[] paramArrayOfInt, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
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
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -7;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    int n;
    if (bool)
    {
      j = paramInt1;
      k = paramInt1 * (paramInt1 + 1) / 2 + 1;
      while ((j >= 1 ? 0 : 1) == 0)
      {
        k -= j;
        if ((paramArrayOfInt[(j - 1 + paramInt4)] <= 0 ? 0 : 1) != 0)
        {
          m = paramArrayOfInt[(j - 1 + paramInt4)];
          if ((m == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, m - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          Dger.dger(j - 1, paramInt2, -1.0D, paramArrayOfDouble1, k - 1 + paramInt3, 1, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          Dscal.dscal(paramInt2, 1.0D / paramArrayOfDouble1[(k + j - 1 - 1 + paramInt3)], paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          j -= 1;
        }
        else
        {
          m = -paramArrayOfInt[(j - 1 + paramInt4)];
          if ((m == j - 1 ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, m - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          Dger.dger(j - 2, paramInt2, -1.0D, paramArrayOfDouble1, k - 1 + paramInt3, 1, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          Dger.dger(j - 2, paramInt2, -1.0D, paramArrayOfDouble1, k - (j - 1) - 1 + paramInt3, 1, paramArrayOfDouble2, j - 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          d3 = paramArrayOfDouble1[(k + j - 2 - 1 + paramInt3)];
          d2 = paramArrayOfDouble1[(k - 1 - 1 + paramInt3)] / d3;
          d1 = paramArrayOfDouble1[(k + j - 1 - 1 + paramInt3)] / d3;
          d6 = d2 * d1 - 1.0D;
          i = 1;
          for (n = paramInt2 - 1 + 1; n > 0; n--)
          {
            d5 = paramArrayOfDouble2[(j - 1 - 1 + (i - 1) * paramInt6 + paramInt5)] / d3;
            d4 = paramArrayOfDouble2[(j - 1 + (i - 1) * paramInt6 + paramInt5)] / d3;
            paramArrayOfDouble2[(j - 1 - 1 + (i - 1) * paramInt6 + paramInt5)] = ((d1 * d5 - d4) / d6);
            paramArrayOfDouble2[(j - 1 + (i - 1) * paramInt6 + paramInt5)] = ((d2 * d4 - d5) / d6);
            i += 1;
          }
          k = k - j + 1;
          j -= 2;
        }
      }
      j = 1;
      k = 1;
      while ((j <= paramInt1 ? 0 : 1) == 0) {
        if ((paramArrayOfInt[(j - 1 + paramInt4)] <= 0 ? 0 : 1) != 0)
        {
          Dgemv.dgemv("Transpose", j - 1, paramInt2, -1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, k - 1 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          m = paramArrayOfInt[(j - 1 + paramInt4)];
          if ((m == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, m - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          k += j;
          j += 1;
        }
        else
        {
          Dgemv.dgemv("Transpose", j - 1, paramInt2, -1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, k - 1 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          Dgemv.dgemv("Transpose", j - 1, paramInt2, -1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, k + j - 1 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          m = -paramArrayOfInt[(j - 1 + paramInt4)];
          if ((m == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, m - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          k = k + 2 * j + 1;
          j += 2;
        }
      }
    }
    else
    {
      j = 1;
      k = 1;
      while ((j <= paramInt1 ? 0 : 1) == 0) {
        if ((paramArrayOfInt[(j - 1 + paramInt4)] <= 0 ? 0 : 1) != 0)
        {
          m = paramArrayOfInt[(j - 1 + paramInt4)];
          if ((m == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, m - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          if ((j >= paramInt1 ? 0 : 1) != 0) {
            Dger.dger(paramInt1 - j, paramInt2, -1.0D, paramArrayOfDouble1, k + 1 - 1 + paramInt3, 1, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          Dscal.dscal(paramInt2, 1.0D / paramArrayOfDouble1[(k - 1 + paramInt3)], paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          k = k + paramInt1 - j + 1;
          j += 1;
        }
        else
        {
          m = -paramArrayOfInt[(j - 1 + paramInt4)];
          if ((m == j + 1 ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, m - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          if ((j >= paramInt1 - 1 ? 0 : 1) != 0)
          {
            Dger.dger(paramInt1 - j - 1, paramInt2, -1.0D, paramArrayOfDouble1, k + 2 - 1 + paramInt3, 1, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, j + 2 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
            Dger.dger(paramInt1 - j - 1, paramInt2, -1.0D, paramArrayOfDouble1, k + paramInt1 - j + 2 - 1 + paramInt3, 1, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, j + 2 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          d3 = paramArrayOfDouble1[(k + 1 - 1 + paramInt3)];
          d2 = paramArrayOfDouble1[(k - 1 + paramInt3)] / d3;
          d1 = paramArrayOfDouble1[(k + paramInt1 - j + 1 - 1 + paramInt3)] / d3;
          d6 = d2 * d1 - 1.0D;
          i = 1;
          for (n = paramInt2 - 1 + 1; n > 0; n--)
          {
            d5 = paramArrayOfDouble2[(j - 1 + (i - 1) * paramInt6 + paramInt5)] / d3;
            d4 = paramArrayOfDouble2[(j + 1 - 1 + (i - 1) * paramInt6 + paramInt5)] / d3;
            paramArrayOfDouble2[(j - 1 + (i - 1) * paramInt6 + paramInt5)] = ((d1 * d5 - d4) / d6);
            paramArrayOfDouble2[(j + 1 - 1 + (i - 1) * paramInt6 + paramInt5)] = ((d2 * d4 - d5) / d6);
            i += 1;
          }
          k = k + 2 * (paramInt1 - j) + 1;
          j += 2;
        }
      }
      j = paramInt1;
      k = paramInt1 * (paramInt1 + 1) / 2 + 1;
      while ((j >= 1 ? 0 : 1) == 0)
      {
        k -= paramInt1 - j + 1;
        if ((paramArrayOfInt[(j - 1 + paramInt4)] <= 0 ? 0 : 1) != 0)
        {
          if ((j >= paramInt1 ? 0 : 1) != 0) {
            Dgemv.dgemv("Transpose", paramInt1 - j, paramInt2, -1.0D, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, k + 1 - 1 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          m = paramArrayOfInt[(j - 1 + paramInt4)];
          if ((m == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, m - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          j -= 1;
        }
        else
        {
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            Dgemv.dgemv("Transpose", paramInt1 - j, paramInt2, -1.0D, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, k + 1 - 1 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
            Dgemv.dgemv("Transpose", paramInt1 - j, paramInt2, -1.0D, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, k - (paramInt1 - j) - 1 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j - 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          m = -paramArrayOfInt[(j - 1 + paramInt4)];
          if ((m == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, m - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
          }
          k -= paramInt1 - j + 2;
          j -= 2;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsptrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */