package org.netlib.lapack;

import org.netlib.blas.Sgemv;
import org.netlib.blas.Sger;

public final class Slarf
{
  public static void slarf(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float paramFloat, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float[] paramArrayOfFloat3, int paramInt7)
  {
    if (Lsame.lsame(paramString, "L"))
    {
      if ((paramFloat == 0.0F ? 0 : 1) != 0)
      {
        Sgemv.sgemv("Transpose", paramInt1, paramInt2, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat1, paramInt3, paramInt4, 0.0F, paramArrayOfFloat3, paramInt7, 1);
        Sger.sger(paramInt1, paramInt2, -paramFloat, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt7, 1, paramArrayOfFloat2, paramInt5, paramInt6);
      }
    }
    else if ((paramFloat == 0.0F ? 0 : 1) != 0)
    {
      Sgemv.sgemv("No transpose", paramInt1, paramInt2, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat1, paramInt3, paramInt4, 0.0F, paramArrayOfFloat3, paramInt7, 1);
      Sger.sger(paramInt1, paramInt2, -paramFloat, paramArrayOfFloat3, paramInt7, 1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramInt6);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */