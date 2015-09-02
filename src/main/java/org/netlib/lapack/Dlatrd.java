package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dsymv;
import org.netlib.util.doubleW;

public final class Dlatrd
{
  public static void dlatrd(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, int paramInt8)
  {
    int i = 0;
    int j = 0;
    double d = 0.0D;
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
          Dgemv.dgemv("No transpose", i, paramInt1 - i, -1.0D, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble4, i - 1 + (j + 1 - 1) * paramInt8 + paramInt7, paramInt8, 1.0D, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
          Dgemv.dgemv("No transpose", i, paramInt1 - i, -1.0D, paramArrayOfDouble4, 1 - 1 + (j + 1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, 1.0D, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        }
        if ((i <= 1 ? 0 : 1) != 0)
        {
          dlarfg_adapter(i - 1, paramArrayOfDouble1, i - 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble3, i - 1 - 1 + paramInt6);
          paramArrayOfDouble2[(i - 1 - 1 + paramInt5)] = paramArrayOfDouble1[(i - 1 - 1 + (i - 1) * paramInt4 + paramInt3)];
          paramArrayOfDouble1[(i - 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0D;
          Dsymv.dsymv("Upper", i - 1, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0D, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
          if ((i >= paramInt1 ? 0 : 1) != 0)
          {
            Dgemv.dgemv("Transpose", i - 1, paramInt1 - i, 1.0D, paramArrayOfDouble4, 1 - 1 + (j + 1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0D, paramArrayOfDouble4, i + 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
            Dgemv.dgemv("No transpose", i - 1, paramInt1 - i, -1.0D, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble4, i + 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1, 1.0D, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
            Dgemv.dgemv("Transpose", i - 1, paramInt1 - i, 1.0D, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0D, paramArrayOfDouble4, i + 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
            Dgemv.dgemv("No transpose", i - 1, paramInt1 - i, -1.0D, paramArrayOfDouble4, 1 - 1 + (j + 1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble4, i + 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1, 1.0D, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
          }
          Dscal.dscal(i - 1, paramArrayOfDouble3[(i - 1 - 1 + paramInt6)], paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
          d = -(0.5D * paramArrayOfDouble3[(i - 1 - 1 + paramInt6)] * Ddot.ddot(i - 1, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1));
          Daxpy.daxpy(i - 1, d, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt8 + paramInt7, 1);
        }
        i += -1;
      }
    }
    else
    {
      i = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        Dgemv.dgemv("No transpose", paramInt1 - i + 1, i - 1, -1.0D, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble4, i - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, 1.0D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        Dgemv.dgemv("No transpose", paramInt1 - i + 1, i - 1, -1.0D, paramArrayOfDouble4, i - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, 1.0D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          dlarfg_adapter(paramInt1 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, Math.min(i + 2, paramInt1) - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble3, i - 1 + paramInt6);
          paramArrayOfDouble2[(i - 1 + paramInt5)] = paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt4 + paramInt3)];
          paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0D;
          Dsymv.dsymv("Lower", paramInt1 - i, 1.0D, paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0D, paramArrayOfDouble4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          Dgemv.dgemv("Transpose", paramInt1 - i, i - 1, 1.0D, paramArrayOfDouble4, i + 1 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0D, paramArrayOfDouble4, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          Dgemv.dgemv("No transpose", paramInt1 - i, i - 1, -1.0D, paramArrayOfDouble1, i + 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble4, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1, 1.0D, paramArrayOfDouble4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          Dgemv.dgemv("Transpose", paramInt1 - i, i - 1, 1.0D, paramArrayOfDouble1, i + 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, 0.0D, paramArrayOfDouble4, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          Dgemv.dgemv("No transpose", paramInt1 - i, i - 1, -1.0D, paramArrayOfDouble4, i + 1 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble4, 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1, 1.0D, paramArrayOfDouble4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          Dscal.dscal(paramInt1 - i, paramArrayOfDouble3[(i - 1 + paramInt6)], paramArrayOfDouble4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
          d = -(0.5D * paramArrayOfDouble3[(i - 1 + paramInt6)] * Ddot.ddot(paramInt1 - i, paramArrayOfDouble4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1));
          Daxpy.daxpy(paramInt1 - i, d, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble4, i + 1 - 1 + (i - 1) * paramInt8 + paramInt7, 1);
        }
        i += 1;
      }
    }
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlatrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */