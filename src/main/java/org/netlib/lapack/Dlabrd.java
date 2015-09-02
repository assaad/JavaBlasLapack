package org.netlib.lapack;

import org.netlib.blas.Dgemv;
import org.netlib.blas.Dscal;
import org.netlib.util.doubleW;

public final class Dlabrd
{
  public static void dlabrd(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, double[] paramArrayOfDouble5, int paramInt9, double[] paramArrayOfDouble6, int paramInt10, int paramInt11, double[] paramArrayOfDouble7, int paramInt12, int paramInt13)
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
        Dgemv.dgemv("No transpose", paramInt1 - i + 1, i - 1, -1.0D, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble7, i - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        Dgemv.dgemv("No transpose", paramInt1 - i + 1, i - 1, -1.0D, paramArrayOfDouble6, i - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, 1.0D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        dlarfg_adapter(paramInt1 - i + 1, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, Math.min(i + 1, paramInt1) - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble4, i - 1 + paramInt8);
        paramArrayOfDouble2[(i - 1 + paramInt6)] = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
        if ((i >= paramInt2 ? 0 : 1) != 0)
        {
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0D;
          Dgemv.dgemv("Transpose", paramInt1 - i + 1, paramInt2 - i, 1.0D, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0D, paramArrayOfDouble7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dgemv.dgemv("Transpose", paramInt1 - i + 1, i - 1, 1.0D, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0D, paramArrayOfDouble7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dgemv.dgemv("No transpose", paramInt2 - i, i - 1, -1.0D, paramArrayOfDouble7, i + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1, 1.0D, paramArrayOfDouble7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dgemv.dgemv("Transpose", paramInt1 - i + 1, i - 1, 1.0D, paramArrayOfDouble6, i - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0D, paramArrayOfDouble7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dgemv.dgemv("Transpose", i - 1, paramInt2 - i, -1.0D, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1, 1.0D, paramArrayOfDouble7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dscal.dscal(paramInt2 - i, paramArrayOfDouble4[(i - 1 + paramInt8)], paramArrayOfDouble7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dgemv.dgemv("No transpose", paramInt2 - i, i, -1.0D, paramArrayOfDouble7, i + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5);
          Dgemv.dgemv("Transpose", i - 1, paramInt2 - i, -1.0D, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, i - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, 1.0D, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5);
          dlarfg_adapter(paramInt2 - i, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i - 1 + (Math.min(i + 2, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble5, i - 1 + paramInt9);
          paramArrayOfDouble3[(i - 1 + paramInt7)] = paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt5 + paramInt4)];
          paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt5 + paramInt4)] = 1.0D;
          Dgemv.dgemv("No transpose", paramInt1 - i, paramInt2 - i, 1.0D, paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, 0.0D, paramArrayOfDouble6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dgemv.dgemv("Transpose", paramInt2 - i, i, 1.0D, paramArrayOfDouble7, i + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, 0.0D, paramArrayOfDouble6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dgemv.dgemv("No transpose", paramInt1 - i, i, -1.0D, paramArrayOfDouble1, i + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1, 1.0D, paramArrayOfDouble6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dgemv.dgemv("No transpose", i - 1, paramInt2 - i, 1.0D, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, 0.0D, paramArrayOfDouble6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dgemv.dgemv("No transpose", paramInt1 - i, i - 1, -1.0D, paramArrayOfDouble6, i + 1 - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1, 1.0D, paramArrayOfDouble6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dscal.dscal(paramInt1 - i, paramArrayOfDouble5[(i - 1 + paramInt9)], paramArrayOfDouble6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt3 - 1 + 1; j > 0; j--)
      {
        Dgemv.dgemv("No transpose", paramInt2 - i + 1, i - 1, -1.0D, paramArrayOfDouble7, i - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5);
        Dgemv.dgemv("Transpose", i - 1, paramInt2 - i + 1, -1.0D, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, i - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, 1.0D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5);
        dlarfg_adapter(paramInt2 - i + 1, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i - 1 + (Math.min(i + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble5, i - 1 + paramInt9);
        paramArrayOfDouble2[(i - 1 + paramInt6)] = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0D;
          Dgemv.dgemv("No transpose", paramInt1 - i, paramInt2 - i + 1, 1.0D, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, 0.0D, paramArrayOfDouble6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dgemv.dgemv("Transpose", paramInt2 - i + 1, i - 1, 1.0D, paramArrayOfDouble7, i - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, 0.0D, paramArrayOfDouble6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dgemv.dgemv("No transpose", paramInt1 - i, i - 1, -1.0D, paramArrayOfDouble1, i + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1, 1.0D, paramArrayOfDouble6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dgemv.dgemv("No transpose", i - 1, paramInt2 - i + 1, 1.0D, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, 0.0D, paramArrayOfDouble6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dgemv.dgemv("No transpose", paramInt1 - i, i - 1, -1.0D, paramArrayOfDouble6, i + 1 - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble6, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1, 1.0D, paramArrayOfDouble6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dscal.dscal(paramInt1 - i, paramArrayOfDouble5[(i - 1 + paramInt9)], paramArrayOfDouble6, i + 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          Dgemv.dgemv("No transpose", paramInt1 - i, i - 1, -1.0D, paramArrayOfDouble1, i + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble7, i - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0D, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
          Dgemv.dgemv("No transpose", paramInt1 - i, i, -1.0D, paramArrayOfDouble6, i + 1 - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, 1.0D, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
          dlarfg_adapter(paramInt1 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, Math.min(i + 2, paramInt1) - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble4, i - 1 + paramInt8);
          paramArrayOfDouble3[(i - 1 + paramInt7)] = paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)];
          paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0D;
          Dgemv.dgemv("Transpose", paramInt1 - i, paramInt2 - i, 1.0D, paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0D, paramArrayOfDouble7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dgemv.dgemv("Transpose", paramInt1 - i, i - 1, 1.0D, paramArrayOfDouble1, i + 1 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0D, paramArrayOfDouble7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dgemv.dgemv("No transpose", paramInt2 - i, i - 1, -1.0D, paramArrayOfDouble7, i + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1, 1.0D, paramArrayOfDouble7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dgemv.dgemv("Transpose", paramInt1 - i, i, 1.0D, paramArrayOfDouble6, i + 1 - 1 + (1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, 0.0D, paramArrayOfDouble7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dgemv.dgemv("Transpose", i, paramInt2 - i, -1.0D, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble7, 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1, 1.0D, paramArrayOfDouble7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
          Dscal.dscal(paramInt2 - i, paramArrayOfDouble4[(i - 1 + paramInt8)], paramArrayOfDouble7, i + 1 - 1 + (i - 1) * paramInt13 + paramInt12, 1);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlabrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */