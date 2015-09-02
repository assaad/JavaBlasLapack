package org.netlib.lapack;

import org.netlib.blas.Sgemv;
import org.netlib.blas.Sger;
import org.netlib.blas.Sswap;
import org.netlib.blas.Stbsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgbtrs
{
  public static void sgbtrs(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, int paramInt6, int[] paramArrayOfInt, int paramInt7, float[] paramArrayOfFloat2, int paramInt8, int paramInt9, intW paramintW)
  {
    int i = 0;
    boolean bool = false;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "N");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "T") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "C") ^ true) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt4 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt6 >= 2 * paramInt2 + paramInt3 + 1 ? 0 : 1) != 0) {
      paramintW.val = -7;
    } else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -10;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGBTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt4 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    m = paramInt3 + paramInt2 + 1;
    i = paramInt2 <= 0 ? 0 : 1;
    int i2;
    if (bool)
    {
      if (i != 0)
      {
        k = 1;
        for (i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
        {
          i1 = Math.min(paramInt2, paramInt1 - k);
          n = paramArrayOfInt[(k - 1 + paramInt7)];
          if ((n == k ? 0 : 1) != 0) {
            Sswap.sswap(paramInt4, paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          Sger.sger(i1, paramInt4, -1.0F, paramArrayOfFloat1, m + 1 - 1 + (k - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, k + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
          k += 1;
        }
      }
      j = 1;
      for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
      {
        Stbsv.stbsv("Upper", "No transpose", "Non-unit", paramInt1, paramInt2 + paramInt3, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfFloat2, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1);
        j += 1;
      }
    }
    else
    {
      j = 1;
      for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
      {
        Stbsv.stbsv("Upper", "Transpose", "Non-unit", paramInt1, paramInt2 + paramInt3, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfFloat2, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1);
        j += 1;
      }
      if (i != 0)
      {
        k = paramInt1 - 1;
        for (i2 = (1 - (paramInt1 - 1) + -1) / -1; i2 > 0; i2--)
        {
          i1 = Math.min(paramInt2, paramInt1 - k);
          Sgemv.sgemv("Transpose", i1, paramInt4, -1.0F, paramArrayOfFloat2, k + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, m + 1 - 1 + (k - 1) * paramInt6 + paramInt5, 1, 1.0F, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
          n = paramArrayOfInt[(k - 1 + paramInt7)];
          if ((n == k ? 0 : 1) != 0) {
            Sswap.sswap(paramInt4, paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          k += -1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgbtrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */