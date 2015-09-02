package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sger;

public final class Slatzm
{
  public static void slatzm(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float paramFloat, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float[] paramArrayOfFloat4, int paramInt8)
  {
    if ((Math.min(paramInt1, paramInt2) != 0 ? 0 : 1) == 0) {}
    if (((paramFloat != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if (Lsame.lsame(paramString, "L"))
    {
      Scopy.scopy(paramInt2, paramArrayOfFloat2, paramInt5, paramInt7, paramArrayOfFloat4, paramInt8, 1);
      Sgemv.sgemv("Transpose", paramInt1 - 1, paramInt2, 1.0F, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat1, paramInt3, paramInt4, 1.0F, paramArrayOfFloat4, paramInt8, 1);
      Saxpy.saxpy(paramInt2, -paramFloat, paramArrayOfFloat4, paramInt8, 1, paramArrayOfFloat2, paramInt5, paramInt7);
      Sger.sger(paramInt1 - 1, paramInt2, -paramFloat, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, 1, paramArrayOfFloat3, paramInt6, paramInt7);
    }
    else if (Lsame.lsame(paramString, "R"))
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat2, paramInt5, 1, paramArrayOfFloat4, paramInt8, 1);
      Sgemv.sgemv("No transpose", paramInt1, paramInt2 - 1, 1.0F, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat1, paramInt3, paramInt4, 1.0F, paramArrayOfFloat4, paramInt8, 1);
      Saxpy.saxpy(paramInt1, -paramFloat, paramArrayOfFloat4, paramInt8, 1, paramArrayOfFloat2, paramInt5, 1);
      Sger.sger(paramInt1, paramInt2 - 1, -paramFloat, paramArrayOfFloat4, paramInt8, 1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slatzm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */