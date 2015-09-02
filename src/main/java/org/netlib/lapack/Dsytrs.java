package org.netlib.lapack;

import org.netlib.blas.Dgemv;
import org.netlib.blas.Dger;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsytrs
{
  public static void dsytrs(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
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
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -8;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    int m;
    if (bool)
    {
      j = paramInt1;
      while ((j >= 1 ? 0 : 1) == 0) {
        if ((paramArrayOfInt[(j - 1 + paramInt5)] <= 0 ? 0 : 1) != 0)
        {
          k = paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          Dger.dger(j - 1, paramInt2, -1.0D, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          Dscal.dscal(paramInt2, 1.0D / paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt4 + paramInt3)], paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          j -= 1;
        }
        else
        {
          k = -paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j - 1 ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          Dger.dger(j - 2, paramInt2, -1.0D, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          Dger.dger(j - 2, paramInt2, -1.0D, paramArrayOfDouble1, 1 - 1 + (j - 1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, j - 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          d3 = paramArrayOfDouble1[(j - 1 - 1 + (j - 1) * paramInt4 + paramInt3)];
          d2 = paramArrayOfDouble1[(j - 1 - 1 + (j - 1 - 1) * paramInt4 + paramInt3)] / d3;
          d1 = paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt4 + paramInt3)] / d3;
          d6 = d2 * d1 - 1.0D;
          i = 1;
          for (m = paramInt2 - 1 + 1; m > 0; m--)
          {
            d5 = paramArrayOfDouble2[(j - 1 - 1 + (i - 1) * paramInt7 + paramInt6)] / d3;
            d4 = paramArrayOfDouble2[(j - 1 + (i - 1) * paramInt7 + paramInt6)] / d3;
            paramArrayOfDouble2[(j - 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = ((d1 * d5 - d4) / d6);
            paramArrayOfDouble2[(j - 1 + (i - 1) * paramInt7 + paramInt6)] = ((d2 * d4 - d5) / d6);
            i += 1;
          }
          j -= 2;
        }
      }
      j = 1;
      while ((j <= paramInt1 ? 0 : 1) == 0) {
        if ((paramArrayOfInt[(j - 1 + paramInt5)] <= 0 ? 0 : 1) != 0)
        {
          Dgemv.dgemv("Transpose", j - 1, paramInt2, -1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          k = paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          j += 1;
        }
        else
        {
          Dgemv.dgemv("Transpose", j - 1, paramInt2, -1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          Dgemv.dgemv("Transpose", j - 1, paramInt2, -1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble1, 1 - 1 + (j + 1 - 1) * paramInt4 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          k = -paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          j += 2;
        }
      }
    }
    else
    {
      j = 1;
      while ((j <= paramInt1 ? 0 : 1) == 0) {
        if ((paramArrayOfInt[(j - 1 + paramInt5)] <= 0 ? 0 : 1) != 0)
        {
          k = paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          if ((j >= paramInt1 ? 0 : 1) != 0) {
            Dger.dger(paramInt1 - j, paramInt2, -1.0D, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          Dscal.dscal(paramInt2, 1.0D / paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt4 + paramInt3)], paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          j += 1;
        }
        else
        {
          k = -paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j + 1 ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          if ((j >= paramInt1 - 1 ? 0 : 1) != 0)
          {
            Dger.dger(paramInt1 - j - 1, paramInt2, -1.0D, paramArrayOfDouble1, j + 2 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, j + 2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            Dger.dger(paramInt1 - j - 1, paramInt2, -1.0D, paramArrayOfDouble1, j + 2 - 1 + (j + 1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, j + 2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          d3 = paramArrayOfDouble1[(j + 1 - 1 + (j - 1) * paramInt4 + paramInt3)];
          d2 = paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt4 + paramInt3)] / d3;
          d1 = paramArrayOfDouble1[(j + 1 - 1 + (j + 1 - 1) * paramInt4 + paramInt3)] / d3;
          d6 = d2 * d1 - 1.0D;
          i = 1;
          for (m = paramInt2 - 1 + 1; m > 0; m--)
          {
            d5 = paramArrayOfDouble2[(j - 1 + (i - 1) * paramInt7 + paramInt6)] / d3;
            d4 = paramArrayOfDouble2[(j + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] / d3;
            paramArrayOfDouble2[(j - 1 + (i - 1) * paramInt7 + paramInt6)] = ((d1 * d5 - d4) / d6);
            paramArrayOfDouble2[(j + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = ((d2 * d4 - d5) / d6);
            i += 1;
          }
          j += 2;
        }
      }
      j = paramInt1;
      while ((j >= 1 ? 0 : 1) == 0) {
        if ((paramArrayOfInt[(j - 1 + paramInt5)] <= 0 ? 0 : 1) != 0)
        {
          if ((j >= paramInt1 ? 0 : 1) != 0) {
            Dgemv.dgemv("Transpose", paramInt1 - j, paramInt2, -1.0D, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          k = paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          j -= 1;
        }
        else
        {
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            Dgemv.dgemv("Transpose", paramInt1 - j, paramInt2, -1.0D, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            Dgemv.dgemv("Transpose", paramInt1 - j, paramInt2, -1.0D, paramArrayOfDouble2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble1, j + 1 - 1 + (j - 1 - 1) * paramInt4 + paramInt3, 1, 1.0D, paramArrayOfDouble2, j - 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          k = -paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j ? 0 : 1) != 0) {
            Dswap.dswap(paramInt2, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          j -= 2;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsytrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */