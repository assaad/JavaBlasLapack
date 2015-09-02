package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dtrmm;
import org.netlib.blas.Dtrmv;
import org.netlib.util.doubleW;

public final class Dlahr2
{
  public static void dlahr2(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10)
  {
    int i = 0;
    double d = 0.0D;
    if ((paramInt1 > 1 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int j = paramInt3 - 1 + 1; j > 0; j--)
    {
      if ((i <= 1 ? 0 : 1) != 0)
      {
        Dgemv.dgemv("NO TRANSPOSE", paramInt1 - paramInt2, i - 1, -1.0D, paramArrayOfDouble4, paramInt2 + 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble1, paramInt2 + i - 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble1, paramInt2 + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        Dcopy.dcopy(i - 1, paramArrayOfDouble1, paramInt2 + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1);
        Dtrmv.dtrmv("Lower", "Transpose", "UNIT", i - 1, paramArrayOfDouble1, paramInt2 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1);
        Dgemv.dgemv("Transpose", paramInt1 - paramInt2 - i + 1, i - 1, 1.0D, paramArrayOfDouble1, paramInt2 + i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 1.0D, paramArrayOfDouble3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1);
        Dtrmv.dtrmv("Upper", "Transpose", "NON-UNIT", i - 1, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1);
        Dgemv.dgemv("NO TRANSPOSE", paramInt1 - paramInt2 - i + 1, i - 1, -1.0D, paramArrayOfDouble1, paramInt2 + i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1, 1.0D, paramArrayOfDouble1, paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        Dtrmv.dtrmv("Lower", "NO TRANSPOSE", "UNIT", i - 1, paramArrayOfDouble1, paramInt2 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1);
        Daxpy.daxpy(i - 1, -1.0D, paramArrayOfDouble3, 1 - 1 + (paramInt3 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble1, paramInt2 + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        paramArrayOfDouble1[(paramInt2 + i - 1 - 1 + (i - 1 - 1) * paramInt5 + paramInt4)] = d;
      }
      dlarfg_adapter(paramInt1 - paramInt2 - i + 1, paramArrayOfDouble1, paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, Math.min(paramInt2 + i + 1, paramInt1) - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, i - 1 + paramInt6);
      d = paramArrayOfDouble1[(paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4)];
      paramArrayOfDouble1[(paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0D;
      Dgemv.dgemv("NO TRANSPOSE", paramInt1 - paramInt2, paramInt1 - paramInt2 - i + 1, 1.0D, paramArrayOfDouble1, paramInt2 + 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0D, paramArrayOfDouble4, paramInt2 + 1 - 1 + (i - 1) * paramInt10 + paramInt9, 1);
      Dgemv.dgemv("Transpose", paramInt1 - paramInt2 - i + 1, i - 1, 1.0D, paramArrayOfDouble1, paramInt2 + i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, paramInt2 + i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0D, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
      Dgemv.dgemv("NO TRANSPOSE", paramInt1 - paramInt2, i - 1, -1.0D, paramArrayOfDouble4, paramInt2 + 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1, 1.0D, paramArrayOfDouble4, paramInt2 + 1 - 1 + (i - 1) * paramInt10 + paramInt9, 1);
      Dscal.dscal(paramInt1 - paramInt2, paramArrayOfDouble2[(i - 1 + paramInt6)], paramArrayOfDouble4, paramInt2 + 1 - 1 + (i - 1) * paramInt10 + paramInt9, 1);
      Dscal.dscal(i - 1, -paramArrayOfDouble2[(i - 1 + paramInt6)], paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
      Dtrmv.dtrmv("Upper", "No Transpose", "NON-UNIT", i - 1, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
      paramArrayOfDouble3[(i - 1 + (i - 1) * paramInt8 + paramInt7)] = paramArrayOfDouble2[(i - 1 + paramInt6)];
      i += 1;
    }
    paramArrayOfDouble1[(paramInt2 + paramInt3 - 1 + (paramInt3 - 1) * paramInt5 + paramInt4)] = d;
    Dlacpy.dlacpy("ALL", paramInt2, paramInt3, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt9, paramInt10);
    Dtrmm.dtrmm("RIGHT", "Lower", "NO TRANSPOSE", "UNIT", paramInt2, paramInt3, 1.0D, paramArrayOfDouble1, paramInt2 + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt9, paramInt10);
    if ((paramInt1 <= paramInt2 + paramInt3 ? 0 : 1) != 0) {
      Dgemm.dgemm("NO TRANSPOSE", "NO TRANSPOSE", paramInt2, paramInt3, paramInt1 - paramInt2 - paramInt3, 1.0D, paramArrayOfDouble1, 1 - 1 + (2 + paramInt3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, paramInt2 + 1 + paramInt3 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble4, paramInt9, paramInt10);
    }
    Dtrmm.dtrmm("RIGHT", "Upper", "NO TRANSPOSE", "NON-UNIT", paramInt2, paramInt3, 1.0D, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, paramInt9, paramInt10);
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double[] paramArrayOfDouble3, int paramInt5)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt2]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble3[paramInt5]);
    Dlarfg.dlarfg(paramInt1, localdoubleW1, paramArrayOfDouble2, paramInt3, paramInt4, localdoubleW2);
    paramArrayOfDouble1[paramInt2] = localdoubleW1.val;
    paramArrayOfDouble3[paramInt5] = localdoubleW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlahr2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */