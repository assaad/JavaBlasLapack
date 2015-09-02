package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sscal;
import org.netlib.blas.Ssymv;
import org.netlib.util.floatW;

public final class Slatrd
{
  public static void slatrd(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, int paramInt8)
  {
    int i = 0;
    int j = 0;
    float f = 0.0F;
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    int k;
    if (Lsame.lsame(paramString, "U"))
    {
      i = paramInt1;
      for (k = (paramInt1 - paramInt2 + 1 - paramInt1 + -1) / -1; k > 0; k--)
      {
        j = i - paramInt1 + paramInt2;
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          Sgemv.sgemv("No transpose", i, paramInt1 - i, -1.0F, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat4, i - 1 + (j + 1 - 1) * paramInt8 + paramInt7, paramInt8, 1.0F, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
          Sgemv.sgemv("No transpose", i, paramInt1 - i, -1.0F, paramArrayOfFloat4, 1 - 1 + (j + 1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, 1.0F, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        }
        if ((i <= 1 ? 0 : 1) != 0)
        {
          slarfg_adapter(i - 1, paramArrayOfFloat1, i - 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat3, i - 1 - 1 + paramInt6);
          paramArrayOfFloat2[(i - 1 - 1 + paramInt5)] = paramArrayOfFloat1[(i - 1 - 1 + (i - 1) * paramInt4 + paramInt3)];
          paramArrayOfFloat1[(i - 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0F;
          Ssymv.ssymv("Upper", i - 1, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0F, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
          if ((i >= paramInt1 ? 0 : 1) != 0)
          {
            Sgemv.sgemv("Transpose", i - 1, paramInt1 - i, 1.0F, paramArrayOfFloat4, 1 - 1 + (j + 1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0F, paramArrayOfFloat4, i + 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
            Sgemv.sgemv("No transpose", i - 1, paramInt1 - i, -1.0F, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat4, i + 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1, 1.0F, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
            Sgemv.sgemv("Transpose", i - 1, paramInt1 - i, 1.0F, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0F, paramArrayOfFloat4, i + 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
            Sgemv.sgemv("No transpose", i - 1, paramInt1 - i, -1.0F, paramArrayOfFloat4, 1 - 1 + (j + 1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat4, i + 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1, 1.0F, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
          }
          Sscal.sscal(i - 1, paramArrayOfFloat3[(i - 1 - 1 + paramInt6)], paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
          f = -(0.5F * paramArrayOfFloat3[(i - 1 - 1 + paramInt6)] * Sdot.sdot(i - 1, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1));
          Saxpy.saxpy(i - 1, f, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
        }
        i += -1;
      }
    }
    else
    {
      i = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        Sgemv.sgemv("No transpose", paramInt1 - i + 1, i - 1, -1.0F, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat4, i - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, 1.0F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        Sgemv.sgemv("No transpose", paramInt1 - i + 1, i - 1, -1.0F, paramArrayOfFloat4, i - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, 1.0F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          slarfg_adapter(paramInt1 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfFloat1, Math.min(i + 2, paramInt1) - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat3, i - 1 + paramInt6);
          paramArrayOfFloat2[(i - 1 + paramInt5)] = paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt4 + paramInt3)];
          paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0F;
          Ssymv.ssymv("Lower", paramInt1 - i, 1.0F, paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0F, paramArrayOfFloat4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          Sgemv.sgemv("Transpose", paramInt1 - i, i - 1, 1.0F, paramArrayOfFloat4, i + 1 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0F, paramArrayOfFloat4, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          Sgemv.sgemv("No transpose", paramInt1 - i, i - 1, -1.0F, paramArrayOfFloat1, i + 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat4, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1, 1.0F, paramArrayOfFloat4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          Sgemv.sgemv("Transpose", paramInt1 - i, i - 1, 1.0F, paramArrayOfFloat1, i + 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0F, paramArrayOfFloat4, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          Sgemv.sgemv("No transpose", paramInt1 - i, i - 1, -1.0F, paramArrayOfFloat4, i + 1 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat4, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1, 1.0F, paramArrayOfFloat4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          Sscal.sscal(paramInt1 - i, paramArrayOfFloat3[(i - 1 + paramInt6)], paramArrayOfFloat4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          f = -(0.5F * paramArrayOfFloat3[(i - 1 + paramInt6)] * Sdot.sdot(paramInt1 - i, paramArrayOfFloat4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1));
          Saxpy.saxpy(paramInt1 - i, f, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
        }
        i += 1;
      }
    }
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float[] paramArrayOfFloat3, int paramInt5)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt2]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat3[paramInt5]);
    Slarfg.slarfg(paramInt1, localfloatW1, paramArrayOfFloat2, paramInt3, paramInt4, localfloatW2);
    paramArrayOfFloat1[paramInt2] = localfloatW1.val;
    paramArrayOfFloat3[paramInt5] = localfloatW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slatrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */