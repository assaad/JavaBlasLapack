package org.netlib.arpack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dscal;
import org.netlib.lapack.Dlabad;
import org.netlib.lapack.Dlacpy;
import org.netlib.lapack.Dlamch;
import org.netlib.lapack.Dlanhs;
import org.netlib.lapack.Dlapy2;
import org.netlib.lapack.Dlarf;
import org.netlib.lapack.Dlarfg;
import org.netlib.lapack.Dlartg;
import org.netlib.lapack.Dlaset;
import org.netlib.util.Etime;
import org.netlib.util.doubleW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Dnapps
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  public static boolean first = true;
  public static doubleW ovfl = new doubleW(0.0D);
  public static double smlnum = 0.0D;
  public static double ulp = 0.0D;
  public static doubleW unfl = new doubleW(0.0D);
  
  public static void dnapps(int paramInt1, intW paramintW, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, int paramInt8, double[] paramArrayOfDouble5, int paramInt9, double[] paramArrayOfDouble6, int paramInt10, int paramInt11, double[] paramArrayOfDouble7, int paramInt12, double[] paramArrayOfDouble8, int paramInt13)
  {
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i = 0;
    intW localintW3 = new intW(0);
    int j = 0;
    intW localintW4 = new intW(0);
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    double[] arrayOfDouble = new double[3];
    double d8 = 0.0D;
    doubleW localdoubleW6 = new doubleW(0.0D);
    double d9 = 0.0D;
    Etime.etime();
    if (first)
    {
      unfl.val = Dlamch.dlamch("safe minimum");
      ovfl.val = (1.0D / unfl.val);
      Dlabad.dlabad(unfl, ovfl);
      ulp = Dlamch.dlamch("precision");
      smlnum = unfl.val * (paramInt1 / ulp);
      first = false;
    }
    Second.second(t0);
    m = arpack_debug.mnapps.val;
    k = paramintW.val + paramInt2;
    Dlaset.dlaset("All", k, k, 0.0D, 1.0D, paramArrayOfDouble6, paramInt10, paramInt11);
    if ((paramInt2 != 0 ? 0 : 1) == 0)
    {
      i1 = 0;
      localintW4.val = 1;
      for (int i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
      {
        localdoubleW5.val = paramArrayOfDouble1[(localintW4.val - 1 + paramInt3)];
        localdoubleW4.val = paramArrayOfDouble2[(localintW4.val - 1 + paramInt4)];
        if ((m <= 2 ? 0 : 1) != 0)
        {
          ivout_adapter(arpack_debug.logfil.val, 1, localintW4, arpack_debug.ndigit.val, "_napps: shift number.");
          dvout_adapter(arpack_debug.logfil.val, 1, localdoubleW5, arpack_debug.ndigit.val, "_napps: The real part of the shift ");
          dvout_adapter(arpack_debug.logfil.val, 1, localdoubleW4, arpack_debug.ndigit.val, "_napps: The imaginary part of the shift ");
        }
        if (i1 != 0)
        {
          i1 = 0;
          break label2723;
        }
        else
        {
          if ((localintW4.val >= paramInt2 ? 0 : 1) != 0) {}
          if (((Math.abs(localdoubleW4.val) <= 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            i1 = 1;
          }
          else
          {
            if ((localintW4.val != paramInt2 ? 0 : 1) != 0) {}
            if (((Math.abs(localdoubleW4.val) <= 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              paramintW.val += 1;
              break label2723;
            }
          }
          localintW3.val = 1;
          do
          {
            localintW1.val = localintW3.val;
            for (int i3 = k - 1 - localintW3.val + 1; i3 > 0; i3--)
            {
              d9 = Math.abs(paramArrayOfDouble4[(localintW1.val - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfDouble4[(localintW1.val + 1 - 1 + (localintW1.val + 1 - 1) * paramInt8 + paramInt7)]);
              if ((d9 != 0.0D ? 0 : 1) != 0) {
                d9 = Dlanhs.dlanhs("1", k - localintW4.val + 1, paramArrayOfDouble4, paramInt7, paramInt8, paramArrayOfDouble7, paramInt12);
              }
              if ((Math.abs(paramArrayOfDouble4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)]) > Math.max(ulp * d9, smlnum) ? 0 : 1) != 0)
              {
                if ((m <= 0 ? 0 : 1) != 0)
                {
                  ivout_adapter(arpack_debug.logfil.val, 1, localintW1, arpack_debug.ndigit.val, "_napps: matrix splitting at row/column no.");
                  ivout_adapter(arpack_debug.logfil.val, 1, localintW4, arpack_debug.ndigit.val, "_napps: matrix splitting with shift number.");
                  Dvout.dvout(arpack_debug.logfil.val, 1, paramArrayOfDouble4, localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_napps: off diagonal element.");
                }
                localintW2.val = localintW1.val;
                paramArrayOfDouble4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)] = 0.0D;
                break;
              }
              localintW1.val += 1;
            }
            localintW2.val = k;
            if ((m <= 2 ? 0 : 1) != 0)
            {
              ivout_adapter(arpack_debug.logfil.val, 1, localintW3, arpack_debug.ndigit.val, "_napps: Start of current block ");
              ivout_adapter(arpack_debug.logfil.val, 1, localintW2, arpack_debug.ndigit.val, "_napps: End of current block ");
            }
            if ((localintW3.val != localintW2.val ? 0 : 1) == 0)
            {
              if ((localintW3.val + 1 != localintW2.val ? 0 : 1) != 0) {}
              if (((Math.abs(localdoubleW4.val) <= 0.0D ? 0 : 1) != 0 ? 1 : 0) == 0)
              {
                d3 = paramArrayOfDouble4[(localintW3.val - 1 + (localintW3.val - 1) * paramInt8 + paramInt7)];
                d5 = paramArrayOfDouble4[(localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt8 + paramInt7)];
                if ((Math.abs(localdoubleW4.val) > 0.0D ? 0 : 1) != 0)
                {
                  d1 = d3 - localdoubleW5.val;
                  d2 = d5;
                  localintW1.val = localintW3.val;
                  for (i3 = localintW2.val - 1 - localintW3.val + 1; i3 > 0; i3--)
                  {
                    Dlartg.dlartg(d1, d2, localdoubleW1, localdoubleW3, localdoubleW2);
                    if ((localintW1.val <= localintW3.val ? 0 : 1) != 0)
                    {
                      if ((localdoubleW2.val >= 0.0D ? 0 : 1) != 0)
                      {
                        localdoubleW2.val = (-localdoubleW2.val);
                        localdoubleW1.val = (-localdoubleW1.val);
                        localdoubleW3.val = (-localdoubleW3.val);
                      }
                      paramArrayOfDouble4[(localintW1.val - 1 + (localintW1.val - 1 - 1) * paramInt8 + paramInt7)] = localdoubleW2.val;
                      paramArrayOfDouble4[(localintW1.val + 1 - 1 + (localintW1.val - 1 - 1) * paramInt8 + paramInt7)] = 0.0D;
                    }
                    j = localintW1.val;
                    for (int i4 = k - localintW1.val + 1; i4 > 0; i4--)
                    {
                      d8 = localdoubleW1.val * paramArrayOfDouble4[(localintW1.val - 1 + (j - 1) * paramInt8 + paramInt7)] + localdoubleW3.val * paramArrayOfDouble4[(localintW1.val + 1 - 1 + (j - 1) * paramInt8 + paramInt7)];
                      paramArrayOfDouble4[(localintW1.val + 1 - 1 + (j - 1) * paramInt8 + paramInt7)] = (-(localdoubleW3.val * paramArrayOfDouble4[(localintW1.val - 1 + (j - 1) * paramInt8 + paramInt7)]) + localdoubleW1.val * paramArrayOfDouble4[(localintW1.val + 1 - 1 + (j - 1) * paramInt8 + paramInt7)]);
                      paramArrayOfDouble4[(localintW1.val - 1 + (j - 1) * paramInt8 + paramInt7)] = d8;
                      j += 1;
                    }
                    j = 1;
                    for (i4 = Math.min(localintW1.val + 2, localintW2.val) - 1 + 1; i4 > 0; i4--)
                    {
                      d8 = localdoubleW1.val * paramArrayOfDouble4[(j - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)] + localdoubleW3.val * paramArrayOfDouble4[(j - 1 + (localintW1.val + 1 - 1) * paramInt8 + paramInt7)];
                      paramArrayOfDouble4[(j - 1 + (localintW1.val + 1 - 1) * paramInt8 + paramInt7)] = (-(localdoubleW3.val * paramArrayOfDouble4[(j - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)]) + localdoubleW1.val * paramArrayOfDouble4[(j - 1 + (localintW1.val + 1 - 1) * paramInt8 + paramInt7)]);
                      paramArrayOfDouble4[(j - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)] = d8;
                      j += 1;
                    }
                    j = 1;
                    for (i4 = Math.min(localintW1.val + localintW4.val, k) - 1 + 1; i4 > 0; i4--)
                    {
                      d8 = localdoubleW1.val * paramArrayOfDouble6[(j - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)] + localdoubleW3.val * paramArrayOfDouble6[(j - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)];
                      paramArrayOfDouble6[(j - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)] = (-(localdoubleW3.val * paramArrayOfDouble6[(j - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)]) + localdoubleW1.val * paramArrayOfDouble6[(j - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)]);
                      paramArrayOfDouble6[(j - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)] = d8;
                      j += 1;
                    }
                    if ((localintW1.val >= localintW2.val - 1 ? 0 : 1) != 0)
                    {
                      d1 = paramArrayOfDouble4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)];
                      d2 = paramArrayOfDouble4[(localintW1.val + 2 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)];
                    }
                    localintW1.val += 1;
                  }
                }
                else
                {
                  d4 = paramArrayOfDouble4[(localintW3.val - 1 + (localintW3.val + 1 - 1) * paramInt8 + paramInt7)];
                  d6 = paramArrayOfDouble4[(localintW3.val + 1 - 1 + (localintW3.val + 1 - 1) * paramInt8 + paramInt7)];
                  d7 = paramArrayOfDouble4[(localintW3.val + 2 - 1 + (localintW3.val + 1 - 1) * paramInt8 + paramInt7)];
                  localdoubleW3.val = (2.0F * localdoubleW5.val);
                  d8 = Dlapy2.dlapy2(localdoubleW5.val, localdoubleW4.val);
                  arrayOfDouble[(1 - 1)] = ((d3 * (d3 - localdoubleW3.val) + d8 * d8) / d5 + d4);
                  arrayOfDouble[(2 - 1)] = (d3 + d6 - localdoubleW3.val);
                  arrayOfDouble[(3 - 1)] = d7;
                  localintW1.val = localintW3.val;
                  for (i3 = localintW2.val - 1 - localintW3.val + 1; i3 > 0; i3--)
                  {
                    n = Math.min(3, localintW2.val - localintW1.val + 1);
                    dlarfg_adapter(n, arrayOfDouble, 1 - 1, arrayOfDouble, 2 - 1, 1, localdoubleW6);
                    if ((localintW1.val <= localintW3.val ? 0 : 1) != 0)
                    {
                      paramArrayOfDouble4[(localintW1.val - 1 + (localintW1.val - 1 - 1) * paramInt8 + paramInt7)] = arrayOfDouble[(1 - 1)];
                      paramArrayOfDouble4[(localintW1.val + 1 - 1 + (localintW1.val - 1 - 1) * paramInt8 + paramInt7)] = 0.0D;
                      if ((localintW1.val >= localintW2.val - 1 ? 0 : 1) != 0) {
                        paramArrayOfDouble4[(localintW1.val + 2 - 1 + (localintW1.val - 1 - 1) * paramInt8 + paramInt7)] = 0.0D;
                      }
                    }
                    arrayOfDouble[(1 - 1)] = 1.0D;
                    Dlarf.dlarf("Left", n, k - localintW1.val + 1, arrayOfDouble, 0, 1, localdoubleW6.val, paramArrayOfDouble4, localintW1.val - 1 + (localintW1.val - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble7, paramInt12);
                    i = Math.min(localintW1.val + 3, localintW2.val);
                    Dlarf.dlarf("Right", i, n, arrayOfDouble, 0, 1, localdoubleW6.val, paramArrayOfDouble4, 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble7, paramInt12);
                    Dlarf.dlarf("Right", k, n, arrayOfDouble, 0, 1, localdoubleW6.val, paramArrayOfDouble6, 1 - 1 + (localintW1.val - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble7, paramInt12);
                    if ((localintW1.val >= localintW2.val - 1 ? 0 : 1) != 0)
                    {
                      arrayOfDouble[(1 - 1)] = paramArrayOfDouble4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)];
                      arrayOfDouble[(2 - 1)] = paramArrayOfDouble4[(localintW1.val + 2 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)];
                      if ((localintW1.val >= localintW2.val - 2 ? 0 : 1) != 0) {
                        arrayOfDouble[(3 - 1)] = paramArrayOfDouble4[(localintW1.val + 3 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)];
                      }
                    }
                    localintW1.val += 1;
                  }
                }
              }
            }
            localintW2.val += 1;
          } while ((localintW2.val >= k ? 0 : 1) != 0);
        }
        label2723:
        localintW4.val += 1;
      }
      j = 1;
      for (i2 = paramintW.val - 1 + 1; i2 > 0; i2--)
      {
        if ((paramArrayOfDouble4[(j + 1 - 1 + (j - 1) * paramInt8 + paramInt7)] >= 0.0D ? 0 : 1) != 0)
        {
          Dscal.dscal(k - j + 1, -1.0D, paramArrayOfDouble4, j + 1 - 1 + (j - 1) * paramInt8 + paramInt7, paramInt8);
          Dscal.dscal(Math.min(j + 2, k), -1.0D, paramArrayOfDouble4, 1 - 1 + (j + 1 - 1) * paramInt8 + paramInt7, 1);
          Dscal.dscal(Math.min(j + paramInt2 + 1, k), -1.0D, paramArrayOfDouble6, 1 - 1 + (j + 1 - 1) * paramInt11 + paramInt10, 1);
        }
        j += 1;
      }
      localintW1.val = 1;
      for (i2 = paramintW.val - 1 + 1; i2 > 0; i2--)
      {
        d9 = Math.abs(paramArrayOfDouble4[(localintW1.val - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfDouble4[(localintW1.val + 1 - 1 + (localintW1.val + 1 - 1) * paramInt8 + paramInt7)]);
        if ((d9 != 0.0D ? 0 : 1) != 0) {
          d9 = Dlanhs.dlanhs("1", paramintW.val, paramArrayOfDouble4, paramInt7, paramInt8, paramArrayOfDouble7, paramInt12);
        }
        if ((paramArrayOfDouble4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)] > Math.max(ulp * d9, smlnum) ? 0 : 1) != 0) {
          paramArrayOfDouble4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)] = 0.0D;
        }
        localintW1.val += 1;
      }
      if ((paramArrayOfDouble4[(paramintW.val + 1 - 1 + (paramintW.val - 1) * paramInt8 + paramInt7)] <= 0.0D ? 0 : 1) != 0) {
        Dgemv.dgemv("N", paramInt1, k, 1.0D, paramArrayOfDouble3, paramInt5, paramInt6, paramArrayOfDouble6, 1 - 1 + (paramintW.val + 1 - 1) * paramInt11 + paramInt10, 1, 0.0D, paramArrayOfDouble8, paramInt1 + 1 - 1 + paramInt13, 1);
      }
      localintW1.val = 1;
      for (i2 = paramintW.val - 1 + 1; i2 > 0; i2--)
      {
        Dgemv.dgemv("N", paramInt1, k - localintW1.val + 1, 1.0D, paramArrayOfDouble3, paramInt5, paramInt6, paramArrayOfDouble6, 1 - 1 + (paramintW.val - localintW1.val + 1 - 1) * paramInt11 + paramInt10, 1, 0.0D, paramArrayOfDouble8, paramInt13, 1);
        Dcopy.dcopy(paramInt1, paramArrayOfDouble8, paramInt13, 1, paramArrayOfDouble3, 1 - 1 + (k - localintW1.val + 1 - 1) * paramInt6 + paramInt5, 1);
        localintW1.val += 1;
      }
      Dlacpy.dlacpy("A", paramInt1, paramintW.val, paramArrayOfDouble3, 1 - 1 + (k - paramintW.val + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble3, paramInt5, paramInt6);
      if ((paramArrayOfDouble4[(paramintW.val + 1 - 1 + (paramintW.val - 1) * paramInt8 + paramInt7)] <= 0.0D ? 0 : 1) != 0) {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble8, paramInt1 + 1 - 1 + paramInt13, 1, paramArrayOfDouble3, 1 - 1 + (paramintW.val + 1 - 1) * paramInt6 + paramInt5, 1);
      }
      Dscal.dscal(paramInt1, paramArrayOfDouble6[(k - 1 + (paramintW.val - 1) * paramInt11 + paramInt10)], paramArrayOfDouble5, paramInt9, 1);
      if ((paramArrayOfDouble4[(paramintW.val + 1 - 1 + (paramintW.val - 1) * paramInt8 + paramInt7)] <= 0.0D ? 0 : 1) != 0) {
        Daxpy.daxpy(paramInt1, paramArrayOfDouble4[(paramintW.val + 1 - 1 + (paramintW.val - 1) * paramInt8 + paramInt7)], paramArrayOfDouble3, 1 - 1 + (paramintW.val + 1 - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble5, paramInt9, 1);
      }
      if ((m <= 1 ? 0 : 1) != 0)
      {
        Dvout.dvout(arpack_debug.logfil.val, 1, paramArrayOfDouble6, k - 1 + (paramintW.val - 1) * paramInt11 + paramInt10, arpack_debug.ndigit.val, "_napps: sigmak = (e_{kev+p}^T*Q)*e_{kev}");
        Dvout.dvout(arpack_debug.logfil.val, 1, paramArrayOfDouble4, paramintW.val + 1 - 1 + (paramintW.val - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_napps: betak = e_{kev+1}^T*H*e_{kev}");
        ivout_adapter(arpack_debug.logfil.val, 1, paramintW, arpack_debug.ndigit.val, "_napps: Order of the final Hessenberg matrix ");
        if ((m <= 2 ? 0 : 1) != 0) {
          Dmout.dmout(arpack_debug.logfil.val, paramintW.val, paramintW.val, paramArrayOfDouble4, paramInt7, paramInt8, arpack_debug.ndigit.val, "_napps: updated Hessenberg matrix H for next iteration");
        }
      }
    }
    Second.second(t1);
    arpack_timing.tnapps.val += t1.val - t0.val;
  }
  
  private static void ivout_adapter(int paramInt1, int paramInt2, intW paramintW, int paramInt3, String paramString)
  {
    int[] arrayOfInt = { paramintW.val };
    Ivout.ivout(paramInt1, paramInt2, arrayOfInt, 0, paramInt3, paramString);
    paramintW.val = arrayOfInt[0];
  }
  
  private static void dvout_adapter(int paramInt1, int paramInt2, doubleW paramdoubleW, int paramInt3, String paramString)
  {
    double[] arrayOfDouble = { paramdoubleW.val };
    Dvout.dvout(paramInt1, paramInt2, arrayOfDouble, 0, paramInt3, paramString);
    paramdoubleW.val = arrayOfDouble[0];
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, doubleW paramdoubleW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble1[paramInt2]);
    Dlarfg.dlarfg(paramInt1, localdoubleW, paramArrayOfDouble2, paramInt3, paramInt4, paramdoubleW);
    paramArrayOfDouble1[paramInt2] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dnapps.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */