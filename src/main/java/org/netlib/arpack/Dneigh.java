package org.netlib.arpack;

import org.netlib.blas.Dgemv;
import org.netlib.blas.Dnrm2;
import org.netlib.blas.Dscal;
import org.netlib.lapack.Dlacpy;
import org.netlib.lapack.Dlapy2;
import org.netlib.lapack.Dtrevc;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Dneigh
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void dneigh(double paramDouble, intW paramintW1, double[] paramArrayOfDouble1, int paramInt1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, double[] paramArrayOfDouble4, int paramInt5, double[] paramArrayOfDouble5, int paramInt6, int paramInt7, double[] paramArrayOfDouble6, int paramInt8, intW paramintW2)
  {
    boolean[] arrayOfBoolean = new boolean[1];
    int i = 0;
    int j = 0;
    int k = 0;
    double d = 0.0D;
    double[] arrayOfDouble = new double[1];
    Etime.etime();
    Second.second(t0);
    k = arpack_debug.mneigh.val;
    if ((k <= 2 ? 0 : 1) != 0) {
      Dmout.dmout(arpack_debug.logfil.val, paramintW1.val, paramintW1.val, paramArrayOfDouble1, paramInt1, paramInt2, arpack_debug.ndigit.val, "_neigh: Entering upper Hessenberg matrix H ");
    }
    Dlacpy.dlacpy("All", paramintW1.val, paramintW1.val, paramArrayOfDouble1, paramInt1, paramInt2, paramArrayOfDouble6, paramInt8, paramintW1.val);
    Dlaqrb.dlaqrb(true, paramintW1.val, 1, paramintW1.val, paramArrayOfDouble6, paramInt8, paramintW1.val, paramArrayOfDouble2, paramInt3, paramArrayOfDouble3, paramInt4, paramArrayOfDouble4, paramInt5, paramintW2);
    if ((paramintW2.val == 0 ? 0 : 1) == 0)
    {
      if ((k <= 1 ? 0 : 1) != 0) {
        Dvout.dvout(arpack_debug.logfil.val, paramintW1.val, paramArrayOfDouble4, paramInt5, arpack_debug.ndigit.val, "_neigh: last row of the Schur matrix for H");
      }
      Dtrevc.dtrevc("R", "A", arrayOfBoolean, 0, paramintW1.val, paramArrayOfDouble6, paramInt8, paramintW1.val, arrayOfDouble, 0, paramintW1.val, paramArrayOfDouble5, paramInt6, paramInt7, paramintW1.val, paramintW1, paramArrayOfDouble6, paramintW1.val * paramintW1.val + 1 - 1 + paramInt8, paramintW2);
      if ((paramintW2.val == 0 ? 0 : 1) == 0)
      {
        j = 0;
        i = 1;
        for (int m = paramintW1.val - 1 + 1; m > 0; m--)
        {
          if ((Math.abs(paramArrayOfDouble3[(i - 1 + paramInt4)]) > 0.0D ? 0 : 1) != 0)
          {
            d = Dnrm2.dnrm2(paramintW1.val, paramArrayOfDouble5, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
            Dscal.dscal(paramintW1.val, 1.0D / d, paramArrayOfDouble5, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          }
          else if ((j != 0 ? 0 : 1) != 0)
          {
            d = Dlapy2.dlapy2(Dnrm2.dnrm2(paramintW1.val, paramArrayOfDouble5, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1), Dnrm2.dnrm2(paramintW1.val, paramArrayOfDouble5, 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6, 1));
            Dscal.dscal(paramintW1.val, 1.0D / d, paramArrayOfDouble5, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
            Dscal.dscal(paramintW1.val, 1.0D / d, paramArrayOfDouble5, 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6, 1);
            j = 1;
          }
          else
          {
            j = 0;
          }
          i += 1;
        }
        Dgemv.dgemv("T", paramintW1.val, paramintW1.val, 1.0D, paramArrayOfDouble5, paramInt6, paramInt7, paramArrayOfDouble4, paramInt5, 1, 0.0D, paramArrayOfDouble6, paramInt8, 1);
        if ((k <= 1 ? 0 : 1) != 0) {
          Dvout.dvout(arpack_debug.logfil.val, paramintW1.val, paramArrayOfDouble6, paramInt8, arpack_debug.ndigit.val, "_neigh: Last row of the eigenvector matrix for H");
        }
        j = 0;
        i = 1;
        for (m = paramintW1.val - 1 + 1; m > 0; m--)
        {
          if ((Math.abs(paramArrayOfDouble3[(i - 1 + paramInt4)]) > 0.0D ? 0 : 1) != 0)
          {
            paramArrayOfDouble4[(i - 1 + paramInt5)] = (paramDouble * Math.abs(paramArrayOfDouble6[(i - 1 + paramInt8)]));
          }
          else if ((j != 0 ? 0 : 1) != 0)
          {
            paramArrayOfDouble4[(i - 1 + paramInt5)] = (paramDouble * Dlapy2.dlapy2(paramArrayOfDouble6[(i - 1 + paramInt8)], paramArrayOfDouble6[(i + 1 - 1 + paramInt8)]));
            paramArrayOfDouble4[(i + 1 - 1 + paramInt5)] = paramArrayOfDouble4[(i - 1 + paramInt5)];
            j = 1;
          }
          else
          {
            j = 0;
          }
          i += 1;
        }
        if ((k <= 2 ? 0 : 1) != 0)
        {
          Dvout.dvout(arpack_debug.logfil.val, paramintW1.val, paramArrayOfDouble2, paramInt3, arpack_debug.ndigit.val, "_neigh: Real part of the eigenvalues of H");
          Dvout.dvout(arpack_debug.logfil.val, paramintW1.val, paramArrayOfDouble3, paramInt4, arpack_debug.ndigit.val, "_neigh: Imaginary part of the eigenvalues of H");
          Dvout.dvout(arpack_debug.logfil.val, paramintW1.val, paramArrayOfDouble4, paramInt5, arpack_debug.ndigit.val, "_neigh: Ritz estimates for the eigenvalues of H");
        }
        Second.second(t1);
        arpack_timing.tneigh.val += t1.val - t0.val;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dneigh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */