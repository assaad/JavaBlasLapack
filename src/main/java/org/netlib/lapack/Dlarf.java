package org.netlib.lapack;

import org.netlib.blas.Dgemv;
import org.netlib.blas.Dger;

public final class Dlarf
{
  public static void dlarf(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double paramDouble, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double[] paramArrayOfDouble3, int paramInt7)
  {
    if (Lsame.lsame(paramString, "L"))
    {
      if ((paramDouble == 0.0D ? 0 : 1) != 0)
      {
        Dgemv.dgemv("Transpose", paramInt1, paramInt2, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, paramInt3, paramInt4, 0.0D, paramArrayOfDouble3, paramInt7, 1);
        Dger.dger(paramInt1, paramInt2, -paramDouble, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt7, 1, paramArrayOfDouble2, paramInt5, paramInt6);
      }
    }
    else if ((paramDouble == 0.0D ? 0 : 1) != 0)
    {
      Dgemv.dgemv("No transpose", paramInt1, paramInt2, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, paramInt3, paramInt4, 0.0D, paramArrayOfDouble3, paramInt7, 1);
      Dger.dger(paramInt1, paramInt2, -paramDouble, paramArrayOfDouble3, paramInt7, 1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */