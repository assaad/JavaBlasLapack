package org.netlib.lapack;

import org.netlib.blas.Sgemv;
import org.netlib.blas.Strmv;

public final class Slarft
{
  public static void slarft(String paramString1, String paramString2, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7)
  {
    int i = 0;
    int j = 0;
    float f = 0.0F;
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
        if ((paramArrayOfFloat2[(i - 1 + paramInt5)] != 0.0F ? 0 : 1) != 0)
        {
          j = 1;
          for (m = i - 1 + 1; m > 0; m--)
          {
            paramArrayOfFloat3[(j - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0F;
            j += 1;
          }
        }
        else
        {
          f = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0F;
          if (Lsame.lsame(paramString2, "C")) {
            Sgemv.sgemv("Transpose", paramInt1 - i + 1, i - 1, -paramArrayOfFloat2[(i - 1 + paramInt5)], paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0F, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          } else {
            Sgemv.sgemv("No transpose", i - 1, paramInt1 - i + 1, -paramArrayOfFloat2[(i - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, 0.0F, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          }
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = f;
          Strmv.strmv("Upper", "No transpose", "Non-unit", i - 1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          paramArrayOfFloat3[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = paramArrayOfFloat2[(i - 1 + paramInt5)];
        }
        i += 1;
      }
    }
    else
    {
      i = paramInt2;
      for (k = (1 - paramInt2 + -1) / -1; k > 0; k--)
      {
        if ((paramArrayOfFloat2[(i - 1 + paramInt5)] != 0.0F ? 0 : 1) != 0)
        {
          j = i;
          for (m = paramInt2 - i + 1; m > 0; m--)
          {
            paramArrayOfFloat3[(j - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0F;
            j += 1;
          }
        }
        else
        {
          if ((i >= paramInt2 ? 0 : 1) != 0)
          {
            if (Lsame.lsame(paramString2, "C"))
            {
              f = paramArrayOfFloat1[(paramInt1 - paramInt2 + i - 1 + (i - 1) * paramInt4 + paramInt3)];
              paramArrayOfFloat1[(paramInt1 - paramInt2 + i - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0F;
              Sgemv.sgemv("Transpose", paramInt1 - paramInt2 + i, paramInt2 - i, -paramArrayOfFloat2[(i - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0F, paramArrayOfFloat3, i + 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
              paramArrayOfFloat1[(paramInt1 - paramInt2 + i - 1 + (i - 1) * paramInt4 + paramInt3)] = f;
            }
            else
            {
              f = paramArrayOfFloat1[(i - 1 + (paramInt1 - paramInt2 + i - 1) * paramInt4 + paramInt3)];
              paramArrayOfFloat1[(i - 1 + (paramInt1 - paramInt2 + i - 1) * paramInt4 + paramInt3)] = 1.0F;
              Sgemv.sgemv("No transpose", paramInt2 - i, paramInt1 - paramInt2 + i, -paramArrayOfFloat2[(i - 1 + paramInt5)], paramArrayOfFloat1, i + 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, 0.0F, paramArrayOfFloat3, i + 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
              paramArrayOfFloat1[(i - 1 + (paramInt1 - paramInt2 + i - 1) * paramInt4 + paramInt3)] = f;
            }
            Strmv.strmv("Lower", "No transpose", "Non-unit", paramInt2 - i, paramArrayOfFloat3, i + 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3, i + 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          }
          paramArrayOfFloat3[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = paramArrayOfFloat2[(i - 1 + paramInt5)];
        }
        i += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarft.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */