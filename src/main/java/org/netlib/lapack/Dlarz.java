package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dger;

public final class Dlarz
{
  public static void dlarz(String paramString, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double paramDouble, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8)
  {
    if (Lsame.lsame(paramString, "L"))
    {
      if ((paramDouble == 0.0D ? 0 : 1) != 0)
      {
        Dcopy.dcopy(paramInt2, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, paramInt8, 1);
        Dgemv.dgemv("Transpose", paramInt3, paramInt2, 1.0D, paramArrayOfDouble2, paramInt1 - paramInt3 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble1, paramInt4, paramInt5, 1.0D, paramArrayOfDouble3, paramInt8, 1);
        Daxpy.daxpy(paramInt2, -paramDouble, paramArrayOfDouble3, paramInt8, 1, paramArrayOfDouble2, paramInt6, paramInt7);
        Dger.dger(paramInt3, paramInt2, -paramDouble, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt8, 1, paramArrayOfDouble2, paramInt1 - paramInt3 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
    }
    else if ((paramDouble == 0.0D ? 0 : 1) != 0)
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble2, paramInt6, 1, paramArrayOfDouble3, paramInt8, 1);
      Dgemv.dgemv("No transpose", paramInt1, paramInt3, 1.0D, paramArrayOfDouble2, 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble1, paramInt4, paramInt5, 1.0D, paramArrayOfDouble3, paramInt8, 1);
      Daxpy.daxpy(paramInt1, -paramDouble, paramArrayOfDouble3, paramInt8, 1, paramArrayOfDouble2, paramInt6, 1);
      Dger.dger(paramInt1, paramInt3, -paramDouble, paramArrayOfDouble3, paramInt8, 1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt7 + paramInt6, paramInt7);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */