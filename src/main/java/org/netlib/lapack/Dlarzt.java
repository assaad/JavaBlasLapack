package org.netlib.lapack;

import org.netlib.blas.Dgemv;
import org.netlib.blas.Dtrmv;
import org.netlib.err.Xerbla;

public final class Dlarzt
{
  public static void dlarzt(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    j = 0;
    if ((Lsame.lsame(paramString1, "B") ^ true)) {
      j = -1;
    } else if ((Lsame.lsame(paramString2, "R") ^ true)) {
      j = -2;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLARZT", -j);
      return;
    }
    i = paramInt2;
    for (int m = (1 - paramInt2 + -1) / -1; m > 0; m--)
    {
      if ((paramArrayOfDouble2[(i - 1 + paramInt5)] != 0.0D ? 0 : 1) != 0)
      {
        k = i;
        for (int n = paramInt2 - i + 1; n > 0; n--)
        {
          paramArrayOfDouble3[(k - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0D;
          k += 1;
        }
      }
      else
      {
        if ((i >= paramInt2 ? 0 : 1) != 0)
        {
          Dgemv.dgemv("No transpose", paramInt2 - i, paramInt1, -paramArrayOfDouble2[(i - 1 + paramInt5)], paramArrayOfDouble1, i + 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, 0.0D, paramArrayOfDouble3, i + 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          Dtrmv.dtrmv("Lower", "No transpose", "Non-unit", paramInt2 - i, paramArrayOfDouble3, i + 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3, i + 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
        }
        paramArrayOfDouble3[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = paramArrayOfDouble2[(i - 1 + paramInt5)];
      }
      i += -1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarzt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */