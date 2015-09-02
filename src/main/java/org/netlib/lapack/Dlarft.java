package org.netlib.lapack;

import org.netlib.blas.Dgemv;
import org.netlib.blas.Dtrmv;

public final class Dlarft
{
  public static void dlarft(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7)
  {
    int i = 0;
    int j = 0;
    double d = 0.0D;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int k;
    int m;
    if (Lsame.lsame(paramString1, "F"))
    {
      i = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        if ((paramArrayOfDouble2[(i - 1 + paramInt5)] != 0.0D ? 0 : 1) != 0)
        {
          j = 1;
          for (m = i - 1 + 1; m > 0; m--)
          {
            paramArrayOfDouble3[(j - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0D;
            j += 1;
          }
        }
        else
        {
          d = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0D;
          if (Lsame.lsame(paramString2, "C")) {
            Dgemv.dgemv("Transpose", paramInt1 - i + 1, i - 1, -paramArrayOfDouble2[(i - 1 + paramInt5)], paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0D, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          } else {
            Dgemv.dgemv("No transpose", i - 1, paramInt1 - i + 1, -paramArrayOfDouble2[(i - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, 0.0D, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          }
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = d;
          Dtrmv.dtrmv("Upper", "No transpose", "Non-unit", i - 1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          paramArrayOfDouble3[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = paramArrayOfDouble2[(i - 1 + paramInt5)];
        }
        i += 1;
      }
    }
    else
    {
      i = paramInt2;
      for (k = (1 - paramInt2 + -1) / -1; k > 0; k--)
      {
        if ((paramArrayOfDouble2[(i - 1 + paramInt5)] != 0.0D ? 0 : 1) != 0)
        {
          j = i;
          for (m = paramInt2 - i + 1; m > 0; m--)
          {
            paramArrayOfDouble3[(j - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0D;
            j += 1;
          }
        }
        else
        {
          if ((i >= paramInt2 ? 0 : 1) != 0)
          {
            if (Lsame.lsame(paramString2, "C"))
            {
              d = paramArrayOfDouble1[(paramInt1 - paramInt2 + i - 1 + (i - 1) * paramInt4 + paramInt3)];
              paramArrayOfDouble1[(paramInt1 - paramInt2 + i - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0D;
              Dgemv.dgemv("Transpose", paramInt1 - paramInt2 + i, paramInt2 - i, -paramArrayOfDouble2[(i - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0D, paramArrayOfDouble3, i + 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
              paramArrayOfDouble1[(paramInt1 - paramInt2 + i - 1 + (i - 1) * paramInt4 + paramInt3)] = d;
            }
            else
            {
              d = paramArrayOfDouble1[(i - 1 + (paramInt1 - paramInt2 + i - 1) * paramInt4 + paramInt3)];
              paramArrayOfDouble1[(i - 1 + (paramInt1 - paramInt2 + i - 1) * paramInt4 + paramInt3)] = 1.0D;
              Dgemv.dgemv("No transpose", paramInt2 - i, paramInt1 - paramInt2 + i, -paramArrayOfDouble2[(i - 1 + paramInt5)], paramArrayOfDouble1, i + 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, 0.0D, paramArrayOfDouble3, i + 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
              paramArrayOfDouble1[(i - 1 + (paramInt1 - paramInt2 + i - 1) * paramInt4 + paramInt3)] = d;
            }
            Dtrmv.dtrmv("Lower", "No transpose", "Non-unit", paramInt2 - i, paramArrayOfDouble3, i + 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3, i + 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          }
          paramArrayOfDouble3[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = paramArrayOfDouble2[(i - 1 + paramInt5)];
        }
        i += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarft.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */