package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dsyr2;
import org.netlib.blas.Dtrmv;
import org.netlib.blas.Dtrsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsygs2
{
  public static void dsygs2(int paramInt1, String paramString, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -7;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYGS2", -paramintW.val);
      return;
    }
    int j;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if (bool)
      {
        i = 1;
        for (j = paramInt2 - 1 + 1; j > 0; j--)
        {
          d1 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
          d2 = paramArrayOfDouble2[(i - 1 + (i - 1) * paramInt6 + paramInt5)];
          d1 /= Math.pow(d2, 2);
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = d1;
          if ((i >= paramInt2 ? 0 : 1) != 0)
          {
            Dscal.dscal(paramInt2 - i, 1.0D / d2, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            d3 = -(0.5D * d1);
            Daxpy.daxpy(paramInt2 - i, d3, paramArrayOfDouble2, i - 1 + (i + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Dsyr2.dsyr2(paramString, paramInt2 - i, -1.0D, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (i + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Daxpy.daxpy(paramInt2 - i, d3, paramArrayOfDouble2, i - 1 + (i + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Dtrsv.dtrsv(paramString, "Transpose", "Non-unit", paramInt2 - i, paramArrayOfDouble2, i + 1 - 1 + (i + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
          }
          i += 1;
        }
      }
      else
      {
        i = 1;
        for (j = paramInt2 - 1 + 1; j > 0; j--)
        {
          d1 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
          d2 = paramArrayOfDouble2[(i - 1 + (i - 1) * paramInt6 + paramInt5)];
          d1 /= Math.pow(d2, 2);
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = d1;
          if ((i >= paramInt2 ? 0 : 1) != 0)
          {
            Dscal.dscal(paramInt2 - i, 1.0D / d2, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
            d3 = -(0.5D * d1);
            Daxpy.daxpy(paramInt2 - i, d3, paramArrayOfDouble2, i + 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
            Dsyr2.dsyr2(paramString, paramInt2 - i, -1.0D, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, i + 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Daxpy.daxpy(paramInt2 - i, d3, paramArrayOfDouble2, i + 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
            Dtrsv.dtrsv(paramString, "No transpose", "Non-unit", paramInt2 - i, paramArrayOfDouble2, i + 1 - 1 + (i + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
          }
          i += 1;
        }
      }
    }
    else if (bool)
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
        d2 = paramArrayOfDouble2[(i - 1 + (i - 1) * paramInt6 + paramInt5)];
        Dtrmv.dtrmv(paramString, "No transpose", "Non-unit", i - 1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        d3 = 0.5D * d1;
        Daxpy.daxpy(i - 1, d3, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        Dsyr2.dsyr2(paramString, i - 1, 1.0D, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble1, paramInt3, paramInt4);
        Daxpy.daxpy(i - 1, d3, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        Dscal.dscal(i - 1, d2, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = (d1 * Math.pow(d2, 2));
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
        d2 = paramArrayOfDouble2[(i - 1 + (i - 1) * paramInt6 + paramInt5)];
        Dtrmv.dtrmv(paramString, "Transpose", "Non-unit", i - 1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        d3 = 0.5D * d1;
        Daxpy.daxpy(i - 1, d3, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        Dsyr2.dsyr2(paramString, i - 1, 1.0D, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, paramInt3, paramInt4);
        Daxpy.daxpy(i - 1, d3, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        Dscal.dscal(i - 1, d2, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = (d1 * Math.pow(d2, 2));
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsygs2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */