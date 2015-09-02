package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sger;

public final class Slarz
{
  public static void slarz(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float paramFloat, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8)
  {
    if (Lsame.lsame(paramString, "L"))
    {
      if ((paramFloat == 0.0F ? 0 : 1) != 0)
      {
        Scopy.scopy(paramInt2, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, 1);
        Sgemv.sgemv("Transpose", paramInt3, paramInt2, 1.0F, paramArrayOfFloat2, paramInt1 - paramInt3 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat1, paramInt4, paramInt5, 1.0F, paramArrayOfFloat3, paramInt8, 1);
        Saxpy.saxpy(paramInt2, -paramFloat, paramArrayOfFloat3, paramInt8, 1, paramArrayOfFloat2, paramInt6, paramInt7);
        Sger.sger(paramInt3, paramInt2, -paramFloat, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt8, 1, paramArrayOfFloat2, paramInt1 - paramInt3 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
    }
    else if ((paramFloat == 0.0F ? 0 : 1) != 0)
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat2, paramInt6, 1, paramArrayOfFloat3, paramInt8, 1);
      Sgemv.sgemv("No transpose", paramInt1, paramInt3, 1.0F, paramArrayOfFloat2, 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat1, paramInt4, paramInt5, 1.0F, paramArrayOfFloat3, paramInt8, 1);
      Saxpy.saxpy(paramInt1, -paramFloat, paramArrayOfFloat3, paramInt8, 1, paramArrayOfFloat2, paramInt6, 1);
      Sger.sger(paramInt1, paramInt3, -paramFloat, paramArrayOfFloat3, paramInt8, 1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt7 + paramInt6, paramInt7);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */