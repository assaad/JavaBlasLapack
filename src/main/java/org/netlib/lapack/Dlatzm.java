package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dger;

public final class Dlatzm
{
  public static void dlatzm(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double paramDouble, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8)
  {
    if ((Math.min(paramInt1, paramInt2) != 0 ? 0 : 1) == 0) {}
    if (((paramDouble != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if (Lsame.lsame(paramString, "L"))
    {
      Dcopy.dcopy(paramInt2, paramArrayOfDouble2, paramInt5, paramInt7, paramArrayOfDouble4, paramInt8, 1);
      Dgemv.dgemv("Transpose", paramInt1 - 1, paramInt2, 1.0D, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble1, paramInt3, paramInt4, 1.0D, paramArrayOfDouble4, paramInt8, 1);
      Daxpy.daxpy(paramInt2, -paramDouble, paramArrayOfDouble4, paramInt8, 1, paramArrayOfDouble2, paramInt5, paramInt7);
      Dger.dger(paramInt1 - 1, paramInt2, -paramDouble, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, 1, paramArrayOfDouble3, paramInt6, paramInt7);
    }
    else if (Lsame.lsame(paramString, "R"))
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble2, paramInt5, 1, paramArrayOfDouble4, paramInt8, 1);
      Dgemv.dgemv("No transpose", paramInt1, paramInt2 - 1, 1.0D, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble1, paramInt3, paramInt4, 1.0D, paramArrayOfDouble4, paramInt8, 1);
      Daxpy.daxpy(paramInt1, -paramDouble, paramArrayOfDouble4, paramInt8, 1, paramArrayOfDouble2, paramInt5, 1);
      Dger.dger(paramInt1, paramInt2 - 1, -paramDouble, paramArrayOfDouble4, paramInt8, 1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlatzm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */