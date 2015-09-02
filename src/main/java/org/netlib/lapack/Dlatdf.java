package org.netlib.lapack;

import org.netlib.blas.Dasum;
import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dscal;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlatdf
{
  public static void dlatdf(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, doubleW paramdoubleW1, doubleW paramdoubleW2, int[] paramArrayOfInt1, int paramInt6, int[] paramArrayOfInt2, int paramInt7)
  {
    int i = 0;
    intW localintW = new intW(0);
    int j = 0;
    int k = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    doubleW localdoubleW = new doubleW(0.0D);
    int[] arrayOfInt = new int[8];
    double[] arrayOfDouble1 = new double[4 * 8];
    double[] arrayOfDouble2 = new double[8];
    double[] arrayOfDouble3 = new double[8];
    if ((paramInt1 == 2 ? 0 : 1) != 0)
    {
      Dlaswp.dlaswp(1, paramArrayOfDouble2, paramInt5, paramInt4, 1, paramInt2 - 1, paramArrayOfInt1, paramInt6, 1);
      d3 = -1.0D;
      j = 1;
      for (int m = paramInt2 - 1 - 1 + 1; m > 0; m--)
      {
        d2 = paramArrayOfDouble2[(j - 1 + paramInt5)] + 1.0D;
        d1 = paramArrayOfDouble2[(j - 1 + paramInt5)] - 1.0D;
        d5 = 1.0D;
        d5 += Ddot.ddot(paramInt2 - j, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1);
        d4 = Ddot.ddot(paramInt2 - j, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, j + 1 - 1 + paramInt5, 1);
        d5 *= paramArrayOfDouble2[(j - 1 + paramInt5)];
        if ((d5 <= d4 ? 0 : 1) != 0)
        {
          paramArrayOfDouble2[(j - 1 + paramInt5)] = d2;
        }
        else if ((d4 <= d5 ? 0 : 1) != 0)
        {
          paramArrayOfDouble2[(j - 1 + paramInt5)] = d1;
        }
        else
        {
          paramArrayOfDouble2[(j - 1 + paramInt5)] += d3;
          d3 = 1.0D;
        }
        localdoubleW.val = (-paramArrayOfDouble2[(j - 1 + paramInt5)]);
        Daxpy.daxpy(paramInt2 - j, localdoubleW.val, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, j + 1 - 1 + paramInt5, 1);
        j += 1;
      }
      Dcopy.dcopy(paramInt2 - 1, paramArrayOfDouble2, paramInt5, 1, arrayOfDouble3, 0, 1);
      arrayOfDouble3[(paramInt2 - 1)] = (paramArrayOfDouble2[(paramInt2 - 1 + paramInt5)] + 1.0D);
      paramArrayOfDouble2[(paramInt2 - 1 + paramInt5)] -= 1.0D;
      d5 = 0.0D;
      d4 = 0.0D;
      i = paramInt2;
      for (int m = (1 - paramInt2 + -1) / -1; m > 0; m--)
      {
        localdoubleW.val = (1.0D / paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)]);
        arrayOfDouble3[(i - 1)] *= localdoubleW.val;
        paramArrayOfDouble2[(i - 1 + paramInt5)] *= localdoubleW.val;
        k = i + 1;
        for (int n = paramInt2 - (i + 1) + 1; n > 0; n--)
        {
          arrayOfDouble3[(i - 1)] -= arrayOfDouble3[(k - 1)] * (paramArrayOfDouble1[(i - 1 + (k - 1) * paramInt4 + paramInt3)] * localdoubleW.val);
          paramArrayOfDouble2[(i - 1 + paramInt5)] -= paramArrayOfDouble2[(k - 1 + paramInt5)] * (paramArrayOfDouble1[(i - 1 + (k - 1) * paramInt4 + paramInt3)] * localdoubleW.val);
          k += 1;
        }
        d5 += Math.abs(arrayOfDouble3[(i - 1)]);
        d4 += Math.abs(paramArrayOfDouble2[(i - 1 + paramInt5)]);
        i += -1;
      }
      if ((d5 <= d4 ? 0 : 1) != 0) {
        Dcopy.dcopy(paramInt2, arrayOfDouble3, 0, 1, paramArrayOfDouble2, paramInt5, 1);
      }
      Dlaswp.dlaswp(1, paramArrayOfDouble2, paramInt5, paramInt4, 1, paramInt2 - 1, paramArrayOfInt2, paramInt7, -1);
      Dlassq.dlassq(paramInt2, paramArrayOfDouble2, paramInt5, 1, paramdoubleW2, paramdoubleW1);
    }
    else
    {
      Dgecon.dgecon("I", paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, 1.0D, localdoubleW, arrayOfDouble1, 0, arrayOfInt, 0, localintW);
      Dcopy.dcopy(paramInt2, arrayOfDouble1, paramInt2 + 1 - 1, 1, arrayOfDouble2, 0, 1);
      Dlaswp.dlaswp(1, arrayOfDouble2, 0, paramInt4, 1, paramInt2 - 1, paramArrayOfInt1, paramInt6, -1);
      localdoubleW.val = (1.0D / Math.sqrt(Ddot.ddot(paramInt2, arrayOfDouble2, 0, 1, arrayOfDouble2, 0, 1)));
      Dscal.dscal(paramInt2, localdoubleW.val, arrayOfDouble2, 0, 1);
      Dcopy.dcopy(paramInt2, arrayOfDouble2, 0, 1, arrayOfDouble3, 0, 1);
      Daxpy.daxpy(paramInt2, 1.0D, paramArrayOfDouble2, paramInt5, 1, arrayOfDouble3, 0, 1);
      Daxpy.daxpy(paramInt2, -1.0D, arrayOfDouble2, 0, 1, paramArrayOfDouble2, paramInt5, 1);
      Dgesc2.dgesc2(paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfInt1, paramInt6, paramArrayOfInt2, paramInt7, localdoubleW);
      Dgesc2.dgesc2(paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble3, 0, paramArrayOfInt1, paramInt6, paramArrayOfInt2, paramInt7, localdoubleW);
      if ((Dasum.dasum(paramInt2, arrayOfDouble3, 0, 1) <= Dasum.dasum(paramInt2, paramArrayOfDouble2, paramInt5, 1) ? 0 : 1) != 0) {
        Dcopy.dcopy(paramInt2, arrayOfDouble3, 0, 1, paramArrayOfDouble2, paramInt5, 1);
      }
      Dlassq.dlassq(paramInt2, paramArrayOfDouble2, paramInt5, 1, paramdoubleW2, paramdoubleW1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlatdf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */