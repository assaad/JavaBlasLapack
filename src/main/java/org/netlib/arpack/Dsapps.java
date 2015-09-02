package org.netlib.arpack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dscal;
import org.netlib.lapack.Dlacpy;
import org.netlib.lapack.Dlamch;
import org.netlib.lapack.Dlartg;
import org.netlib.lapack.Dlaset;
import org.netlib.util.Etime;
import org.netlib.util.doubleW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Dsapps
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  public static boolean first = true;
  public static double epsmch = 0.0D;
  
  public static void dsapps(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, double[] paramArrayOfDouble6, int paramInt12)
  {
    intW localintW1 = new intW(0);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW2 = new intW(0);
    int n = 0;
    int i1 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d6 = 0.0D;
    double d7 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    Etime.etime();
    if (first)
    {
      epsmch = Dlamch.dlamch("Epsilon-Machine");
      first = false;
    }
    k = 1;
    Second.second(t0);
    i1 = arpack_debug.msapps.val;
    n = paramInt2 + paramInt3;
    Dlaset.dlaset("All", n, n, 0.0D, 1.0D, paramArrayOfDouble5, paramInt10, paramInt11);
    if ((paramInt3 != 0 ? 0 : 1) == 0)
    {
      localintW2.val = 1;
      for (int i2 = paramInt3 - 1 + 1; i2 > 0; i2--)
      {
        j = k;
        do
        {
          localintW1.val = j;
          for (i3 = n - 1 - j + 1; i3 > 0; i3--)
          {
            d5 = Math.abs(paramArrayOfDouble3[(localintW1.val - 1 + (2 - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfDouble3[(localintW1.val + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)]);
            if ((paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] > epsmch * d5 ? 0 : 1) != 0)
            {
              if ((i1 <= 0 ? 0 : 1) != 0)
              {
                ivout_adapter(arpack_debug.logfil.val, 1, localintW1, arpack_debug.ndigit.val, "_sapps: deflation at row/column no.");
                ivout_adapter(arpack_debug.logfil.val, 1, localintW2, arpack_debug.ndigit.val, "_sapps: occured before shift number.");
                Dvout.dvout(arpack_debug.logfil.val, 1, paramArrayOfDouble3, localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_sapps: the corresponding off diagonal element");
              }
              paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = 0.0D;
              i = localintW1.val;
              break;
            }
            localintW1.val += 1;
          }
          i = n;
          if ((j >= i ? 0 : 1) != 0)
          {
            d6 = paramArrayOfDouble3[(j - 1 + (2 - 1) * paramInt8 + paramInt7)] - paramArrayOfDouble1[(localintW2.val - 1 + paramInt4)];
            d7 = paramArrayOfDouble3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
            Dlartg.dlartg(d6, d7, localdoubleW1, localdoubleW3, localdoubleW2);
            d1 = localdoubleW1.val * paramArrayOfDouble3[(j - 1 + (2 - 1) * paramInt8 + paramInt7)] + localdoubleW3.val * paramArrayOfDouble3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
            d2 = localdoubleW1.val * paramArrayOfDouble3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] + localdoubleW3.val * paramArrayOfDouble3[(j + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)];
            d4 = localdoubleW1.val * paramArrayOfDouble3[(j + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)] - localdoubleW3.val * paramArrayOfDouble3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
            d3 = localdoubleW1.val * paramArrayOfDouble3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] - localdoubleW3.val * paramArrayOfDouble3[(j - 1 + (2 - 1) * paramInt8 + paramInt7)];
            paramArrayOfDouble3[(j - 1 + (2 - 1) * paramInt8 + paramInt7)] = (localdoubleW1.val * d1 + localdoubleW3.val * d2);
            paramArrayOfDouble3[(j + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (localdoubleW1.val * d4 - localdoubleW3.val * d3);
            paramArrayOfDouble3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (localdoubleW1.val * d3 + localdoubleW3.val * d4);
            m = 1;
            for (i3 = Math.min(j + localintW2.val, n) - 1 + 1; i3 > 0; i3--)
            {
              d1 = localdoubleW1.val * paramArrayOfDouble5[(m - 1 + (j - 1) * paramInt11 + paramInt10)] + localdoubleW3.val * paramArrayOfDouble5[(m - 1 + (j + 1 - 1) * paramInt11 + paramInt10)];
              paramArrayOfDouble5[(m - 1 + (j + 1 - 1) * paramInt11 + paramInt10)] = (-(localdoubleW3.val * paramArrayOfDouble5[(m - 1 + (j - 1) * paramInt11 + paramInt10)]) + localdoubleW1.val * paramArrayOfDouble5[(m - 1 + (j + 1 - 1) * paramInt11 + paramInt10)]);
              paramArrayOfDouble5[(m - 1 + (j - 1) * paramInt11 + paramInt10)] = d1;
              m += 1;
            }
            localintW1.val = (j + 1);
            for (i3 = i - 1 - (j + 1) + 1; i3 > 0; i3--)
            {
              d6 = paramArrayOfDouble3[(localintW1.val - 1 + (1 - 1) * paramInt8 + paramInt7)];
              d7 = localdoubleW3.val * paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
              paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (localdoubleW1.val * paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
              Dlartg.dlartg(d6, d7, localdoubleW1, localdoubleW3, localdoubleW2);
              if ((localdoubleW2.val >= 0.0D ? 0 : 1) != 0)
              {
                localdoubleW2.val = (-localdoubleW2.val);
                localdoubleW1.val = (-localdoubleW1.val);
                localdoubleW3.val = (-localdoubleW3.val);
              }
              paramArrayOfDouble3[(localintW1.val - 1 + (1 - 1) * paramInt8 + paramInt7)] = localdoubleW2.val;
              d1 = localdoubleW1.val * paramArrayOfDouble3[(localintW1.val - 1 + (2 - 1) * paramInt8 + paramInt7)] + localdoubleW3.val * paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
              d2 = localdoubleW1.val * paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] + localdoubleW3.val * paramArrayOfDouble3[(localintW1.val + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)];
              d3 = localdoubleW1.val * paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] - localdoubleW3.val * paramArrayOfDouble3[(localintW1.val - 1 + (2 - 1) * paramInt8 + paramInt7)];
              d4 = localdoubleW1.val * paramArrayOfDouble3[(localintW1.val + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)] - localdoubleW3.val * paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
              paramArrayOfDouble3[(localintW1.val - 1 + (2 - 1) * paramInt8 + paramInt7)] = (localdoubleW1.val * d1 + localdoubleW3.val * d2);
              paramArrayOfDouble3[(localintW1.val + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (localdoubleW1.val * d4 - localdoubleW3.val * d3);
              paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (localdoubleW1.val * d3 + localdoubleW3.val * d4);
              m = 1;
              for (int i4 = Math.min(localintW1.val + localintW2.val, n) - 1 + 1; i4 > 0; i4--)
              {
                d1 = localdoubleW1.val * paramArrayOfDouble5[(m - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)] + localdoubleW3.val * paramArrayOfDouble5[(m - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)];
                paramArrayOfDouble5[(m - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)] = (-(localdoubleW3.val * paramArrayOfDouble5[(m - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)]) + localdoubleW1.val * paramArrayOfDouble5[(m - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)]);
                paramArrayOfDouble5[(m - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)] = d1;
                m += 1;
              }
              localintW1.val += 1;
            }
          }
          j = i + 1;
          if ((paramArrayOfDouble3[(i - 1 + (1 - 1) * paramInt8 + paramInt7)] >= 0.0D ? 0 : 1) != 0)
          {
            paramArrayOfDouble3[(i - 1 + (1 - 1) * paramInt8 + paramInt7)] = (-paramArrayOfDouble3[(i - 1 + (1 - 1) * paramInt8 + paramInt7)]);
            Dscal.dscal(n, -1.0D, paramArrayOfDouble5, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          }
        } while ((i >= n ? 0 : 1) != 0);
        localintW1.val = k;
        for (int i3 = n - 1 - k + 1; i3 > 0; i3--)
        {
          if ((paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] <= 0.0D ? 0 : 1) != 0) {
            break;
          }
          k += 1;
          localintW1.val += 1;
        }
        localintW2.val += 1;
      }
      localintW1.val = k;
      for (i2 = n - 1 - k + 1; i2 > 0; i2--)
      {
        d5 = Math.abs(paramArrayOfDouble3[(localintW1.val - 1 + (2 - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfDouble3[(localintW1.val + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)]);
        if ((paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] > epsmch * d5 ? 0 : 1) != 0)
        {
          if ((i1 <= 0 ? 0 : 1) != 0)
          {
            ivout_adapter(arpack_debug.logfil.val, 1, localintW1, arpack_debug.ndigit.val, "_sapps: deflation at row/column no.");
            Dvout.dvout(arpack_debug.logfil.val, 1, paramArrayOfDouble3, localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_sapps: the corresponding off diagonal element");
          }
          paramArrayOfDouble3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = 0.0D;
        }
        localintW1.val += 1;
      }
      if ((paramArrayOfDouble3[(paramInt2 + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] <= 0.0D ? 0 : 1) != 0) {
        Dgemv.dgemv("N", paramInt1, n, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble5, 1 - 1 + (paramInt2 + 1 - 1) * paramInt11 + paramInt10, 1, 0.0D, paramArrayOfDouble6, paramInt1 + 1 - 1 + paramInt12, 1);
      }
      localintW1.val = 1;
      for (i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
      {
        Dgemv.dgemv("N", paramInt1, n - localintW1.val + 1, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble5, 1 - 1 + (paramInt2 - localintW1.val + 1 - 1) * paramInt11 + paramInt10, 1, 0.0D, paramArrayOfDouble6, paramInt12, 1);
        Dcopy.dcopy(paramInt1, paramArrayOfDouble6, paramInt12, 1, paramArrayOfDouble2, 1 - 1 + (n - localintW1.val + 1 - 1) * paramInt6 + paramInt5, 1);
        localintW1.val += 1;
      }
      Dlacpy.dlacpy("All", paramInt1, paramInt2, paramArrayOfDouble2, 1 - 1 + (paramInt3 + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, paramInt5, paramInt6);
      if ((paramArrayOfDouble3[(paramInt2 + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] <= 0.0D ? 0 : 1) != 0) {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble6, paramInt1 + 1 - 1 + paramInt12, 1, paramArrayOfDouble2, 1 - 1 + (paramInt2 + 1 - 1) * paramInt6 + paramInt5, 1);
      }
      Dscal.dscal(paramInt1, paramArrayOfDouble5[(n - 1 + (paramInt2 - 1) * paramInt11 + paramInt10)], paramArrayOfDouble4, paramInt9, 1);
      if ((paramArrayOfDouble3[(paramInt2 + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] <= 0.0D ? 0 : 1) != 0) {
        Daxpy.daxpy(paramInt1, paramArrayOfDouble3[(paramInt2 + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)], paramArrayOfDouble2, 1 - 1 + (paramInt2 + 1 - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble4, paramInt9, 1);
      }
      if ((i1 <= 1 ? 0 : 1) != 0)
      {
        Dvout.dvout(arpack_debug.logfil.val, 1, paramArrayOfDouble5, n - 1 + (paramInt2 - 1) * paramInt11 + paramInt10, arpack_debug.ndigit.val, "_sapps: sigmak of the updated residual vector");
        Dvout.dvout(arpack_debug.logfil.val, 1, paramArrayOfDouble3, paramInt2 + 1 - 1 + (1 - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_sapps: betak of the updated residual vector");
        Dvout.dvout(arpack_debug.logfil.val, paramInt2, paramArrayOfDouble3, 1 - 1 + (2 - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_sapps: updated main diagonal of H for next iteration");
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          Dvout.dvout(arpack_debug.logfil.val, paramInt2 - 1, paramArrayOfDouble3, 2 - 1 + (1 - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_sapps: updated sub diagonal of H for next iteration");
        }
      }
      Second.second(t1);
      arpack_timing.tsapps.val += t1.val - t0.val;
    }
  }
  
  private static void ivout_adapter(int paramInt1, int paramInt2, intW paramintW, int paramInt3, String paramString)
  {
    int[] arrayOfInt = { paramintW.val };
    Ivout.ivout(paramInt1, paramInt2, arrayOfInt, 0, paramInt3, paramString);
    paramintW.val = arrayOfInt[0];
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dsapps.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */