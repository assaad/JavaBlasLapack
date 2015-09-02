package org.netlib.lapack;

import org.netlib.blas.Sgemv;
import org.netlib.blas.Sger;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssytrs
{
  public static void ssytrs(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
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
      Xerbla.xerbla("SSYTRS", -paramintW.val);
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
            Sswap.sswap(paramInt2, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          Sger.sger(j - 1, paramInt2, -1.0F, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          Sscal.sscal(paramInt2, 1.0F / paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt4 + paramInt3)], paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          j -= 1;
        }
        else
        {
          k = -paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j - 1 ? 0 : 1) != 0) {
            Sswap.sswap(paramInt2, paramArrayOfFloat2, j - 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          Sger.sger(j - 2, paramInt2, -1.0F, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          Sger.sger(j - 2, paramInt2, -1.0F, paramArrayOfFloat1, 1 - 1 + (j - 1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, j - 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          f3 = paramArrayOfFloat1[(j - 1 - 1 + (j - 1) * paramInt4 + paramInt3)];
          f2 = paramArrayOfFloat1[(j - 1 - 1 + (j - 1 - 1) * paramInt4 + paramInt3)] / f3;
          f1 = paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt4 + paramInt3)] / f3;
          f6 = f2 * f1 - 1.0F;
          i = 1;
          for (m = paramInt2 - 1 + 1; m > 0; m--)
          {
            f5 = paramArrayOfFloat2[(j - 1 - 1 + (i - 1) * paramInt7 + paramInt6)] / f3;
            f4 = paramArrayOfFloat2[(j - 1 + (i - 1) * paramInt7 + paramInt6)] / f3;
            paramArrayOfFloat2[(j - 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = ((f1 * f5 - f4) / f6);
            paramArrayOfFloat2[(j - 1 + (i - 1) * paramInt7 + paramInt6)] = ((f2 * f4 - f5) / f6);
            i += 1;
          }
          j -= 2;
        }
      }
      j = 1;
      while ((j <= paramInt1 ? 0 : 1) == 0) {
        if ((paramArrayOfInt[(j - 1 + paramInt5)] <= 0 ? 0 : 1) != 0)
        {
          Sgemv.sgemv("Transpose", j - 1, paramInt2, -1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, 1.0F, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          k = paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j ? 0 : 1) != 0) {
            Sswap.sswap(paramInt2, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          j += 1;
        }
        else
        {
          Sgemv.sgemv("Transpose", j - 1, paramInt2, -1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, 1.0F, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          Sgemv.sgemv("Transpose", j - 1, paramInt2, -1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat1, 1 - 1 + (j + 1 - 1) * paramInt4 + paramInt3, 1, 1.0F, paramArrayOfFloat2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          k = -paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j ? 0 : 1) != 0) {
            Sswap.sswap(paramInt2, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
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
            Sswap.sswap(paramInt2, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          if ((j >= paramInt1 ? 0 : 1) != 0) {
            Sger.sger(paramInt1 - j, paramInt2, -1.0F, paramArrayOfFloat1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          Sscal.sscal(paramInt2, 1.0F / paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt4 + paramInt3)], paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          j += 1;
        }
        else
        {
          k = -paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j + 1 ? 0 : 1) != 0) {
            Sswap.sswap(paramInt2, paramArrayOfFloat2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          if ((j >= paramInt1 - 1 ? 0 : 1) != 0)
          {
            Sger.sger(paramInt1 - j - 1, paramInt2, -1.0F, paramArrayOfFloat1, j + 2 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, j + 2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            Sger.sger(paramInt1 - j - 1, paramInt2, -1.0F, paramArrayOfFloat1, j + 2 - 1 + (j + 1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, j + 2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          f3 = paramArrayOfFloat1[(j + 1 - 1 + (j - 1) * paramInt4 + paramInt3)];
          f2 = paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt4 + paramInt3)] / f3;
          f1 = paramArrayOfFloat1[(j + 1 - 1 + (j + 1 - 1) * paramInt4 + paramInt3)] / f3;
          f6 = f2 * f1 - 1.0F;
          i = 1;
          for (m = paramInt2 - 1 + 1; m > 0; m--)
          {
            f5 = paramArrayOfFloat2[(j - 1 + (i - 1) * paramInt7 + paramInt6)] / f3;
            f4 = paramArrayOfFloat2[(j + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] / f3;
            paramArrayOfFloat2[(j - 1 + (i - 1) * paramInt7 + paramInt6)] = ((f1 * f5 - f4) / f6);
            paramArrayOfFloat2[(j + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = ((f2 * f4 - f5) / f6);
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
            Sgemv.sgemv("Transpose", paramInt1 - j, paramInt2, -1.0F, paramArrayOfFloat2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, 1.0F, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          k = paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j ? 0 : 1) != 0) {
            Sswap.sswap(paramInt2, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          j -= 1;
        }
        else
        {
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            Sgemv.sgemv("Transpose", paramInt1 - j, paramInt2, -1.0F, paramArrayOfFloat2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, 1.0F, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            Sgemv.sgemv("Transpose", paramInt1 - j, paramInt2, -1.0F, paramArrayOfFloat2, j + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat1, j + 1 - 1 + (j - 1 - 1) * paramInt4 + paramInt3, 1, 1.0F, paramArrayOfFloat2, j - 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          k = -paramArrayOfInt[(j - 1 + paramInt5)];
          if ((k == j ? 0 : 1) != 0) {
            Sswap.sswap(paramInt2, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          j -= 2;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssytrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */