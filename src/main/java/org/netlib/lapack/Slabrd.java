package org.netlib.lapack;

import org.netlib.blas.Sgemv;
import org.netlib.blas.Sscal;
import org.netlib.util.floatW;

public final class Slabrd
{
  public static void slabrd(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, float[] paramArrayOfFloat5, int paramInt9, float[] paramArrayOfFloat6, int paramInt10, int paramInt11, float[] paramArrayOfFloat7, int paramInt12, int paramInt13)
  {
    int i = 0;
    if ((paramInt1 > 0 ? 0 : 1) == 0) {}
    if (((paramInt2 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    int j;
    if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
    {
      i = 1;
      for (j = paramInt3 - 1 + 1; j > 0; j--)
      {
        Sgemv.sgemv("No transpose", paramInt1 - i + 1, i - 1, -1.0F, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat7, i - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        Sgemv.sgemv("No transpose", paramInt1 - i + 1, i - 1, -1.0F, paramArrayOfFloat6, i - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, 1.0F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        slarfg_adapter(paramInt1 - i + 1, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, Math.min(i + 1, paramInt1) - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat4, i - 1 + paramInt8);
        paramArrayOfFloat2[(i - 1 + paramInt6)] = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
        if ((i >= paramInt2 ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0F;
          Sgemv.sgemv("Transpose", paramInt1 - i + 1, paramInt2 - i, 1.0F, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0F, paramArrayOfFloat7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sgemv.sgemv("Transpose", paramInt1 - i + 1, i - 1, 1.0F, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0F, paramArrayOfFloat7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sgemv.sgemv("No transpose", paramInt2 - i, i - 1, -1.0F, paramArrayOfFloat7, i + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1, 1.0F, paramArrayOfFloat7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sgemv.sgemv("Transpose", paramInt1 - i + 1, i - 1, 1.0F, paramArrayOfFloat6, i - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0F, paramArrayOfFloat7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sgemv.sgemv("Transpose", i - 1, paramInt2 - i, -1.0F, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1, 1.0F, paramArrayOfFloat7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sscal.sscal(paramInt2 - i, paramArrayOfFloat4[(i - 1 + paramInt8)], paramArrayOfFloat7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sgemv.sgemv("No transpose", paramInt2 - i, i, -1.0F, paramArrayOfFloat7, i + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5);
          Sgemv.sgemv("Transpose", i - 1, paramInt2 - i, -1.0F, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, i - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, 1.0F, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5);
          slarfg_adapter(paramInt2 - i, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, i - 1 + (Math.min(i + 2, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat5, i - 1 + paramInt9);
          paramArrayOfFloat3[(i - 1 + paramInt7)] = paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt5 + paramInt4)];
          paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt5 + paramInt4)] = 1.0F;
          Sgemv.sgemv("No transpose", paramInt1 - i, paramInt2 - i, 1.0F, paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, 0.0F, paramArrayOfFloat6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sgemv.sgemv("Transpose", paramInt2 - i, i, 1.0F, paramArrayOfFloat7, i + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, 0.0F, paramArrayOfFloat6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sgemv.sgemv("No transpose", paramInt1 - i, i, -1.0F, paramArrayOfFloat1, i + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1, 1.0F, paramArrayOfFloat6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sgemv.sgemv("No transpose", i - 1, paramInt2 - i, 1.0F, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, 0.0F, paramArrayOfFloat6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sgemv.sgemv("No transpose", paramInt1 - i, i - 1, -1.0F, paramArrayOfFloat6, i + 1 - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1, 1.0F, paramArrayOfFloat6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sscal.sscal(paramInt1 - i, paramArrayOfFloat5[(i - 1 + paramInt9)], paramArrayOfFloat6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt3 - 1 + 1; j > 0; j--)
      {
        Sgemv.sgemv("No transpose", paramInt2 - i + 1, i - 1, -1.0F, paramArrayOfFloat7, i - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5);
        Sgemv.sgemv("Transpose", i - 1, paramInt2 - i + 1, -1.0F, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, i - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, 1.0F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5);
        slarfg_adapter(paramInt2 - i + 1, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, i - 1 + (Math.min(i + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat5, i - 1 + paramInt9);
        paramArrayOfFloat2[(i - 1 + paramInt6)] = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0F;
          Sgemv.sgemv("No transpose", paramInt1 - i, paramInt2 - i + 1, 1.0F, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, 0.0F, paramArrayOfFloat6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sgemv.sgemv("Transpose", paramInt2 - i + 1, i - 1, 1.0F, paramArrayOfFloat7, i - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, 0.0F, paramArrayOfFloat6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sgemv.sgemv("No transpose", paramInt1 - i, i - 1, -1.0F, paramArrayOfFloat1, i + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1, 1.0F, paramArrayOfFloat6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sgemv.sgemv("No transpose", i - 1, paramInt2 - i + 1, 1.0F, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, 0.0F, paramArrayOfFloat6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sgemv.sgemv("No transpose", paramInt1 - i, i - 1, -1.0F, paramArrayOfFloat6, i + 1 - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1, 1.0F, paramArrayOfFloat6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sscal.sscal(paramInt1 - i, paramArrayOfFloat5[(i - 1 + paramInt9)], paramArrayOfFloat6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Sgemv.sgemv("No transpose", paramInt1 - i, i - 1, -1.0F, paramArrayOfFloat1, i + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat7, i - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0F, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
          Sgemv.sgemv("No transpose", paramInt1 - i, i, -1.0F, paramArrayOfFloat6, i + 1 - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, 1.0F, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
          slarfg_adapter(paramInt1 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, Math.min(i + 2, paramInt1) - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat4, i - 1 + paramInt8);
          paramArrayOfFloat3[(i - 1 + paramInt7)] = paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)];
          paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0F;
          Sgemv.sgemv("Transpose", paramInt1 - i, paramInt2 - i, 1.0F, paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0F, paramArrayOfFloat7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sgemv.sgemv("Transpose", paramInt1 - i, i - 1, 1.0F, paramArrayOfFloat1, i + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0F, paramArrayOfFloat7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sgemv.sgemv("No transpose", paramInt2 - i, i - 1, -1.0F, paramArrayOfFloat7, i + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1, 1.0F, paramArrayOfFloat7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sgemv.sgemv("Transpose", paramInt1 - i, i, 1.0F, paramArrayOfFloat6, i + 1 - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0F, paramArrayOfFloat7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sgemv.sgemv("Transpose", i, paramInt2 - i, -1.0F, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1, 1.0F, paramArrayOfFloat7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Sscal.sscal(paramInt2 - i, paramArrayOfFloat4[(i - 1 + paramInt8)], paramArrayOfFloat7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slabrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */