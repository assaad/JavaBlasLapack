package org.netlib.arpack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sscal;
import org.netlib.lapack.Slabad;
import org.netlib.lapack.Slacpy;
import org.netlib.lapack.Slamch;
import org.netlib.lapack.Slanhs;
import org.netlib.lapack.Slapy2;
import org.netlib.lapack.Slarf;
import org.netlib.lapack.Slarfg;
import org.netlib.lapack.Slartg;
import org.netlib.lapack.Slaset;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Snapps
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  public static boolean first = true;
  public static floatW ovfl = new floatW(0.0F);
  public static float smlnum = 0.0F;
  public static float ulp = 0.0F;
  public static floatW unfl = new floatW(0.0F);
  
  public static void snapps(int paramInt1, intW paramintW, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, int paramInt8, float[] paramArrayOfFloat5, int paramInt9, float[] paramArrayOfFloat6, int paramInt10, int paramInt11, float[] paramArrayOfFloat7, int paramInt12, float[] paramArrayOfFloat8, int paramInt13)
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
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    floatW localfloatW5 = new floatW(0.0F);
    float[] arrayOfFloat = new float[3];
    float f8 = 0.0F;
    floatW localfloatW6 = new floatW(0.0F);
    float f9 = 0.0F;
    Etime.etime();
    if (first)
    {
      unfl.val = Slamch.slamch("safe minimum");
      ovfl.val = (1.0F / unfl.val);
      Slabad.slabad(unfl, ovfl);
      ulp = Slamch.slamch("precision");
      smlnum = unfl.val * (paramInt1 / ulp);
      first = false;
    }
    Second.second(t0);
    m = arpack_debug.mnapps.val;
    k = paramintW.val + paramInt2;
    Slaset.slaset("All", k, k, 0.0F, 1.0F, paramArrayOfFloat6, paramInt10, paramInt11);
    if ((paramInt2 != 0 ? 0 : 1) == 0)
    {
      i1 = 0;
      localintW4.val = 1;
      for (int i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
      {
        localfloatW5.val = paramArrayOfFloat1[(localintW4.val - 1 + paramInt3)];
        localfloatW4.val = paramArrayOfFloat2[(localintW4.val - 1 + paramInt4)];
        if ((m <= 2 ? 0 : 1) != 0)
        {
          ivout_adapter(arpack_debug.logfil.val, 1, localintW4, arpack_debug.ndigit.val, "_napps: shift number.");
          svout_adapter(arpack_debug.logfil.val, 1, localfloatW5, arpack_debug.ndigit.val, "_napps: The real part of the shift ");
          svout_adapter(arpack_debug.logfil.val, 1, localfloatW4, arpack_debug.ndigit.val, "_napps: The imaginary part of the shift ");
        }
        if (i1 != 0)
        {
          i1 = 0;
          break label2722;
        }
        else
        {
          if ((localintW4.val >= paramInt2 ? 0 : 1) != 0) {}
          if (((Math.abs(localfloatW4.val) <= 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            i1 = 1;
          }
          else
          {
            if ((localintW4.val != paramInt2 ? 0 : 1) != 0) {}
            if (((Math.abs(localfloatW4.val) <= 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              paramintW.val += 1;
              break label2722;
            }
          }
          localintW3.val = 1;
          do
          {
            localintW1.val = localintW3.val;
            for (int i3 = k - 1 - localintW3.val + 1; i3 > 0; i3--)
            {
              f9 = Math.abs(paramArrayOfFloat4[(localintW1.val - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfFloat4[(localintW1.val + 1 - 1 + (localintW1.val + 1 - 1) * paramInt8 + paramInt7)]);
              if ((f9 != 0.0F ? 0 : 1) != 0) {
                f9 = Slanhs.slanhs("1", k - localintW4.val + 1, paramArrayOfFloat4, paramInt7, paramInt8, paramArrayOfFloat7, paramInt12);
              }
              if ((Math.abs(paramArrayOfFloat4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)]) > Math.max(ulp * f9, smlnum) ? 0 : 1) != 0)
              {
                if ((m <= 0 ? 0 : 1) != 0)
                {
                  ivout_adapter(arpack_debug.logfil.val, 1, localintW1, arpack_debug.ndigit.val, "_napps: matrix splitting at row/column no.");
                  ivout_adapter(arpack_debug.logfil.val, 1, localintW4, arpack_debug.ndigit.val, "_napps: matrix splitting with shift number.");
                  Svout.svout(arpack_debug.logfil.val, 1, paramArrayOfFloat4, localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_napps: off diagonal element.");
                }
                localintW2.val = localintW1.val;
                paramArrayOfFloat4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)] = 0.0F;
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
              if (((Math.abs(localfloatW4.val) <= 0.0F ? 0 : 1) != 0 ? 1 : 0) == 0)
              {
                f3 = paramArrayOfFloat4[(localintW3.val - 1 + (localintW3.val - 1) * paramInt8 + paramInt7)];
                f5 = paramArrayOfFloat4[(localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt8 + paramInt7)];
                if ((Math.abs(localfloatW4.val) > 0.0F ? 0 : 1) != 0)
                {
                  f1 = f3 - localfloatW5.val;
                  f2 = f5;
                  localintW1.val = localintW3.val;
                  for (i3 = localintW2.val - 1 - localintW3.val + 1; i3 > 0; i3--)
                  {
                    Slartg.slartg(f1, f2, localfloatW1, localfloatW3, localfloatW2);
                    if ((localintW1.val <= localintW3.val ? 0 : 1) != 0)
                    {
                      if ((localfloatW2.val >= 0.0F ? 0 : 1) != 0)
                      {
                        localfloatW2.val = (-localfloatW2.val);
                        localfloatW1.val = (-localfloatW1.val);
                        localfloatW3.val = (-localfloatW3.val);
                      }
                      paramArrayOfFloat4[(localintW1.val - 1 + (localintW1.val - 1 - 1) * paramInt8 + paramInt7)] = localfloatW2.val;
                      paramArrayOfFloat4[(localintW1.val + 1 - 1 + (localintW1.val - 1 - 1) * paramInt8 + paramInt7)] = 0.0F;
                    }
                    j = localintW1.val;
                    for (int i4 = k - localintW1.val + 1; i4 > 0; i4--)
                    {
                      f8 = localfloatW1.val * paramArrayOfFloat4[(localintW1.val - 1 + (j - 1) * paramInt8 + paramInt7)] + localfloatW3.val * paramArrayOfFloat4[(localintW1.val + 1 - 1 + (j - 1) * paramInt8 + paramInt7)];
                      paramArrayOfFloat4[(localintW1.val + 1 - 1 + (j - 1) * paramInt8 + paramInt7)] = (-(localfloatW3.val * paramArrayOfFloat4[(localintW1.val - 1 + (j - 1) * paramInt8 + paramInt7)]) + localfloatW1.val * paramArrayOfFloat4[(localintW1.val + 1 - 1 + (j - 1) * paramInt8 + paramInt7)]);
                      paramArrayOfFloat4[(localintW1.val - 1 + (j - 1) * paramInt8 + paramInt7)] = f8;
                      j += 1;
                    }
                    j = 1;
                    for (i4 = Math.min(localintW1.val + 2, localintW2.val) - 1 + 1; i4 > 0; i4--)
                    {
                      f8 = localfloatW1.val * paramArrayOfFloat4[(j - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)] + localfloatW3.val * paramArrayOfFloat4[(j - 1 + (localintW1.val + 1 - 1) * paramInt8 + paramInt7)];
                      paramArrayOfFloat4[(j - 1 + (localintW1.val + 1 - 1) * paramInt8 + paramInt7)] = (-(localfloatW3.val * paramArrayOfFloat4[(j - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)]) + localfloatW1.val * paramArrayOfFloat4[(j - 1 + (localintW1.val + 1 - 1) * paramInt8 + paramInt7)]);
                      paramArrayOfFloat4[(j - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)] = f8;
                      j += 1;
                    }
                    j = 1;
                    for (i4 = Math.min(localintW1.val + localintW4.val, k) - 1 + 1; i4 > 0; i4--)
                    {
                      f8 = localfloatW1.val * paramArrayOfFloat6[(j - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)] + localfloatW3.val * paramArrayOfFloat6[(j - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)];
                      paramArrayOfFloat6[(j - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)] = (-(localfloatW3.val * paramArrayOfFloat6[(j - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)]) + localfloatW1.val * paramArrayOfFloat6[(j - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)]);
                      paramArrayOfFloat6[(j - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)] = f8;
                      j += 1;
                    }
                    if ((localintW1.val >= localintW2.val - 1 ? 0 : 1) != 0)
                    {
                      f1 = paramArrayOfFloat4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)];
                      f2 = paramArrayOfFloat4[(localintW1.val + 2 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)];
                    }
                    localintW1.val += 1;
                  }
                }
                else
                {
                  f4 = paramArrayOfFloat4[(localintW3.val - 1 + (localintW3.val + 1 - 1) * paramInt8 + paramInt7)];
                  f6 = paramArrayOfFloat4[(localintW3.val + 1 - 1 + (localintW3.val + 1 - 1) * paramInt8 + paramInt7)];
                  f7 = paramArrayOfFloat4[(localintW3.val + 2 - 1 + (localintW3.val + 1 - 1) * paramInt8 + paramInt7)];
                  localfloatW3.val = (2.0F * localfloatW5.val);
                  f8 = Slapy2.slapy2(localfloatW5.val, localfloatW4.val);
                  arrayOfFloat[(1 - 1)] = ((f3 * (f3 - localfloatW3.val) + f8 * f8) / f5 + f4);
                  arrayOfFloat[(2 - 1)] = (f3 + f6 - localfloatW3.val);
                  arrayOfFloat[(3 - 1)] = f7;
                  localintW1.val = localintW3.val;
                  for (i3 = localintW2.val - 1 - localintW3.val + 1; i3 > 0; i3--)
                  {
                    n = Math.min(3, localintW2.val - localintW1.val + 1);
                    slarfg_adapter(n, arrayOfFloat, 1 - 1, arrayOfFloat, 2 - 1, 1, localfloatW6);
                    if ((localintW1.val <= localintW3.val ? 0 : 1) != 0)
                    {
                      paramArrayOfFloat4[(localintW1.val - 1 + (localintW1.val - 1 - 1) * paramInt8 + paramInt7)] = arrayOfFloat[(1 - 1)];
                      paramArrayOfFloat4[(localintW1.val + 1 - 1 + (localintW1.val - 1 - 1) * paramInt8 + paramInt7)] = 0.0F;
                      if ((localintW1.val >= localintW2.val - 1 ? 0 : 1) != 0) {
                        paramArrayOfFloat4[(localintW1.val + 2 - 1 + (localintW1.val - 1 - 1) * paramInt8 + paramInt7)] = 0.0F;
                      }
                    }
                    arrayOfFloat[(1 - 1)] = 1.0F;
                    Slarf.slarf("Left", n, k - localintW1.val + 1, arrayOfFloat, 0, 1, localfloatW6.val, paramArrayOfFloat4, localintW1.val - 1 + (localintW1.val - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat7, paramInt12);
                    i = Math.min(localintW1.val + 3, localintW2.val);
                    Slarf.slarf("Right", i, n, arrayOfFloat, 0, 1, localfloatW6.val, paramArrayOfFloat4, 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat7, paramInt12);
                    Slarf.slarf("Right", k, n, arrayOfFloat, 0, 1, localfloatW6.val, paramArrayOfFloat6, 1 - 1 + (localintW1.val - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat7, paramInt12);
                    if ((localintW1.val >= localintW2.val - 1 ? 0 : 1) != 0)
                    {
                      arrayOfFloat[(1 - 1)] = paramArrayOfFloat4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)];
                      arrayOfFloat[(2 - 1)] = paramArrayOfFloat4[(localintW1.val + 2 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)];
                      if ((localintW1.val >= localintW2.val - 2 ? 0 : 1) != 0) {
                        arrayOfFloat[(3 - 1)] = paramArrayOfFloat4[(localintW1.val + 3 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)];
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
        label2722:
        localintW4.val += 1;
      }
      j = 1;
      for (i2 = paramintW.val - 1 + 1; i2 > 0; i2--)
      {
        if ((paramArrayOfFloat4[(j + 1 - 1 + (j - 1) * paramInt8 + paramInt7)] >= 0.0F ? 0 : 1) != 0)
        {
          Sscal.sscal(k - j + 1, -1.0F, paramArrayOfFloat4, j + 1 - 1 + (j - 1) * paramInt8 + paramInt7, paramInt8);
          Sscal.sscal(Math.min(j + 2, k), -1.0F, paramArrayOfFloat4, 1 - 1 + (j + 1 - 1) * paramInt8 + paramInt7, 1);
          Sscal.sscal(Math.min(j + paramInt2 + 1, k), -1.0F, paramArrayOfFloat6, 1 - 1 + (j + 1 - 1) * paramInt11 + paramInt10, 1);
        }
        j += 1;
      }
      localintW1.val = 1;
      for (i2 = paramintW.val - 1 + 1; i2 > 0; i2--)
      {
        f9 = Math.abs(paramArrayOfFloat4[(localintW1.val - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfFloat4[(localintW1.val + 1 - 1 + (localintW1.val + 1 - 1) * paramInt8 + paramInt7)]);
        if ((f9 != 0.0F ? 0 : 1) != 0) {
          f9 = Slanhs.slanhs("1", paramintW.val, paramArrayOfFloat4, paramInt7, paramInt8, paramArrayOfFloat7, paramInt12);
        }
        if ((paramArrayOfFloat4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)] > Math.max(ulp * f9, smlnum) ? 0 : 1) != 0) {
          paramArrayOfFloat4[(localintW1.val + 1 - 1 + (localintW1.val - 1) * paramInt8 + paramInt7)] = 0.0F;
        }
        localintW1.val += 1;
      }
      if ((paramArrayOfFloat4[(paramintW.val + 1 - 1 + (paramintW.val - 1) * paramInt8 + paramInt7)] <= 0.0F ? 0 : 1) != 0) {
        Sgemv.sgemv("N", paramInt1, k, 1.0F, paramArrayOfFloat3, paramInt5, paramInt6, paramArrayOfFloat6, 1 - 1 + (paramintW.val + 1 - 1) * paramInt11 + paramInt10, 1, 0.0F, paramArrayOfFloat8, paramInt1 + 1 - 1 + paramInt13, 1);
      }
      localintW1.val = 1;
      for (i2 = paramintW.val - 1 + 1; i2 > 0; i2--)
      {
        Sgemv.sgemv("N", paramInt1, k - localintW1.val + 1, 1.0F, paramArrayOfFloat3, paramInt5, paramInt6, paramArrayOfFloat6, 1 - 1 + (paramintW.val - localintW1.val + 1 - 1) * paramInt11 + paramInt10, 1, 0.0F, paramArrayOfFloat8, paramInt13, 1);
        Scopy.scopy(paramInt1, paramArrayOfFloat8, paramInt13, 1, paramArrayOfFloat3, 1 - 1 + (k - localintW1.val + 1 - 1) * paramInt6 + paramInt5, 1);
        localintW1.val += 1;
      }
      Slacpy.slacpy("A", paramInt1, paramintW.val, paramArrayOfFloat3, 1 - 1 + (k - paramintW.val + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat3, paramInt5, paramInt6);
      if ((paramArrayOfFloat4[(paramintW.val + 1 - 1 + (paramintW.val - 1) * paramInt8 + paramInt7)] <= 0.0F ? 0 : 1) != 0) {
        Scopy.scopy(paramInt1, paramArrayOfFloat8, paramInt1 + 1 - 1 + paramInt13, 1, paramArrayOfFloat3, 1 - 1 + (paramintW.val + 1 - 1) * paramInt6 + paramInt5, 1);
      }
      Sscal.sscal(paramInt1, paramArrayOfFloat6[(k - 1 + (paramintW.val - 1) * paramInt11 + paramInt10)], paramArrayOfFloat5, paramInt9, 1);
      if ((paramArrayOfFloat4[(paramintW.val + 1 - 1 + (paramintW.val - 1) * paramInt8 + paramInt7)] <= 0.0F ? 0 : 1) != 0) {
        Saxpy.saxpy(paramInt1, paramArrayOfFloat4[(paramintW.val + 1 - 1 + (paramintW.val - 1) * paramInt8 + paramInt7)], paramArrayOfFloat3, 1 - 1 + (paramintW.val + 1 - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat5, paramInt9, 1);
      }
      if ((m <= 1 ? 0 : 1) != 0)
      {
        Svout.svout(arpack_debug.logfil.val, 1, paramArrayOfFloat6, k - 1 + (paramintW.val - 1) * paramInt11 + paramInt10, arpack_debug.ndigit.val, "_napps: sigmak = (e_{kev+p}^T*Q)*e_{kev}");
        Svout.svout(arpack_debug.logfil.val, 1, paramArrayOfFloat4, paramintW.val + 1 - 1 + (paramintW.val - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_napps: betak = e_{kev+1}^T*H*e_{kev}");
        ivout_adapter(arpack_debug.logfil.val, 1, paramintW, arpack_debug.ndigit.val, "_napps: Order of the final Hessenberg matrix ");
        if ((m <= 2 ? 0 : 1) != 0) {
          Smout.smout(arpack_debug.logfil.val, paramintW.val, paramintW.val, paramArrayOfFloat4, paramInt7, paramInt8, arpack_debug.ndigit.val, "_napps: updated Hessenberg matrix H for next iteration");
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
  
  private static void svout_adapter(int paramInt1, int paramInt2, floatW paramfloatW, int paramInt3, String paramString)
  {
    float[] arrayOfFloat = { paramfloatW.val };
    Svout.svout(paramInt1, paramInt2, arrayOfFloat, 0, paramInt3, paramString);
    paramfloatW.val = arrayOfFloat[0];
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, floatW paramfloatW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat1[paramInt2]);
    Slarfg.slarfg(paramInt1, localfloatW, paramArrayOfFloat2, paramInt3, paramInt4, paramfloatW);
    paramArrayOfFloat1[paramInt2] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Snapps.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */