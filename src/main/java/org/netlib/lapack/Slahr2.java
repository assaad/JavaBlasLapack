package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sscal;
import org.netlib.blas.Strmm;
import org.netlib.blas.Strmv;
import org.netlib.util.floatW;

public final class Slahr2
{
  public static void slahr2(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, int paramInt10)
  {
    int i = 0;
    float f = 0.0F;
    if ((paramInt1 > 1 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int j = paramInt3 - 1 + 1; j > 0; j--)
    {
      if ((i <= 1 ? 0 : 1) != 0)
      {
        Sgemv.sgemv("NO TRANSPOSE", paramInt1 - paramInt2, i - 1, -1.0F, paramArrayOfFloat4, paramInt2 + 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfFloat1, paramInt2 + i - 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, paramArrayOfFloat1, paramInt2 + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        Scopy.scopy(i - 1, paramArrayOfFloat1, paramInt2 + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1);
        Strmv.strmv("Lower", "Transpose", "UNIT", i - 1, paramArrayOfFloat1, paramInt2 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1);
        Sgemv.sgemv("Transpose", paramInt1 - paramInt2 - i + 1, i - 1, 1.0F, paramArrayOfFloat1, paramInt2 + i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 1.0F, paramArrayOfFloat3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1);
        Strmv.strmv("Upper", "Transpose", "NON-UNIT", i - 1, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1);
        Sgemv.sgemv("NO TRANSPOSE", paramInt1 - paramInt2 - i + 1, i - 1, -1.0F, paramArrayOfFloat1, paramInt2 + i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1, 1.0F, paramArrayOfFloat1, paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        Strmv.strmv("Lower", "NO TRANSPOSE", "UNIT", i - 1, paramArrayOfFloat1, paramInt2 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1);
        Saxpy.saxpy(i - 1, -1.0F, paramArrayOfFloat3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1, paramArrayOfFloat1, paramInt2 + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        paramArrayOfFloat1[(paramInt2 + i - 1 - 1 + (i - 1 - 1) * paramInt5 + paramInt4)] = f;
      }
      slarfg_adapter(paramInt1 - paramInt2 - i + 1, paramArrayOfFloat1, paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, Math.min(paramInt2 + i + 1, paramInt1) - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, i - 1 + paramInt6);
      f = paramArrayOfFloat1[(paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4)];
      paramArrayOfFloat1[(paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0F;
      Sgemv.sgemv("NO TRANSPOSE", paramInt1 - paramInt2, paramInt1 - paramInt2 - i + 1, 1.0F, paramArrayOfFloat1, paramInt2 + 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0F, paramArrayOfFloat4, paramInt2 + 1 - 1 + (i - 1) * paramInt10 + paramInt9, 1);
      Sgemv.sgemv("Transpose", paramInt1 - paramInt2 - i + 1, i - 1, 1.0F, paramArrayOfFloat1, paramInt2 + i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0F, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
      Sgemv.sgemv("NO TRANSPOSE", paramInt1 - paramInt2, i - 1, -1.0F, paramArrayOfFloat4, paramInt2 + 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1, 1.0F, paramArrayOfFloat4, paramInt2 + 1 - 1 + (i - 1) * paramInt10 + paramInt9, 1);
      Sscal.sscal(paramInt1 - paramInt2, paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat4, paramInt2 + 1 - 1 + (i - 1) * paramInt10 + paramInt9, 1);
      Sscal.sscal(i - 1, -paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
      Strmv.strmv("Upper", "No Transpose", "NON-UNIT", i - 1, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
      paramArrayOfFloat3[(i - 1 + (i - 1) * paramInt8 + paramInt7)] = paramArrayOfFloat2[(i - 1 + paramInt6)];
      i += 1;
    }
    paramArrayOfFloat1[(paramInt2 + paramInt3 - 1 + (paramInt3 - 1) * paramInt5 + paramInt4)] = f;
    Slacpy.slacpy("ALL", paramInt2, paramInt3, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt9, paramInt10);
    Strmm.strmm("RIGHT", "Lower", "NO TRANSPOSE", "UNIT", paramInt2, paramInt3, 1.0F, paramArrayOfFloat1, paramInt2 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt9, paramInt10);
    if ((paramInt1 <= paramInt2 + paramInt3 ? 0 : 1) != 0) {
      Sgemm.sgemm("NO TRANSPOSE", "NO TRANSPOSE", paramInt2, paramInt3, paramInt1 - paramInt2 - paramInt3, 1.0F, paramArrayOfFloat1, 1 - 1 + (2 + paramInt3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, paramInt2 + 1 + paramInt3 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, paramArrayOfFloat4, paramInt9, paramInt10);
    }
    Strmm.strmm("RIGHT", "Upper", "NO TRANSPOSE", "NON-UNIT", paramInt2, paramInt3, 1.0F, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat4, paramInt9, paramInt10);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slahr2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */