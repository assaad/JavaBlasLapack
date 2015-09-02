package org.netlib.arpack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sscal;
import org.netlib.lapack.Slacpy;
import org.netlib.lapack.Slamch;
import org.netlib.lapack.Slartg;
import org.netlib.lapack.Slaset;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssapps
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  public static boolean first = true;
  public static float epsmch = 0.0F;
  
  public static void ssapps(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, float[] paramArrayOfFloat6, int paramInt12)
  {
    intW localintW1 = new intW(0);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW2 = new intW(0);
    int n = 0;
    int i1 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f6 = 0.0F;
    float f7 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    Etime.etime();
    if (first)
    {
      epsmch = Slamch.slamch("Epsilon-Machine");
      first = false;
    }
    k = 1;
    Second.second(t0);
    i1 = arpack_debug.msapps.val;
    n = paramInt2 + paramInt3;
    Slaset.slaset("All", n, n, 0.0F, 1.0F, paramArrayOfFloat5, paramInt10, paramInt11);
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
            f5 = Math.abs(paramArrayOfFloat3[(localintW1.val - 1 + (2 - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfFloat3[(localintW1.val + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)]);
            if ((paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] > epsmch * f5 ? 0 : 1) != 0)
            {
              if ((i1 <= 0 ? 0 : 1) != 0)
              {
                ivout_adapter(arpack_debug.logfil.val, 1, localintW1, arpack_debug.ndigit.val, "_sapps: deflation at row/column no.");
                ivout_adapter(arpack_debug.logfil.val, 1, localintW2, arpack_debug.ndigit.val, "_sapps: occured before shift number.");
                Svout.svout(arpack_debug.logfil.val, 1, paramArrayOfFloat3, localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_sapps: the corresponding off diagonal element");
              }
              paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = 0.0F;
              i = localintW1.val;
              break;
            }
            localintW1.val += 1;
          }
          i = n;
          if ((j >= i ? 0 : 1) != 0)
          {
            f6 = paramArrayOfFloat3[(j - 1 + (2 - 1) * paramInt8 + paramInt7)] - paramArrayOfFloat1[(localintW2.val - 1 + paramInt4)];
            f7 = paramArrayOfFloat3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
            Slartg.slartg(f6, f7, localfloatW1, localfloatW3, localfloatW2);
            f1 = localfloatW1.val * paramArrayOfFloat3[(j - 1 + (2 - 1) * paramInt8 + paramInt7)] + localfloatW3.val * paramArrayOfFloat3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
            f2 = localfloatW1.val * paramArrayOfFloat3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] + localfloatW3.val * paramArrayOfFloat3[(j + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)];
            f4 = localfloatW1.val * paramArrayOfFloat3[(j + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)] - localfloatW3.val * paramArrayOfFloat3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
            f3 = localfloatW1.val * paramArrayOfFloat3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] - localfloatW3.val * paramArrayOfFloat3[(j - 1 + (2 - 1) * paramInt8 + paramInt7)];
            paramArrayOfFloat3[(j - 1 + (2 - 1) * paramInt8 + paramInt7)] = (localfloatW1.val * f1 + localfloatW3.val * f2);
            paramArrayOfFloat3[(j + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (localfloatW1.val * f4 - localfloatW3.val * f3);
            paramArrayOfFloat3[(j + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (localfloatW1.val * f3 + localfloatW3.val * f4);
            m = 1;
            for (i3 = Math.min(j + localintW2.val, n) - 1 + 1; i3 > 0; i3--)
            {
              f1 = localfloatW1.val * paramArrayOfFloat5[(m - 1 + (j - 1) * paramInt11 + paramInt10)] + localfloatW3.val * paramArrayOfFloat5[(m - 1 + (j + 1 - 1) * paramInt11 + paramInt10)];
              paramArrayOfFloat5[(m - 1 + (j + 1 - 1) * paramInt11 + paramInt10)] = (-(localfloatW3.val * paramArrayOfFloat5[(m - 1 + (j - 1) * paramInt11 + paramInt10)]) + localfloatW1.val * paramArrayOfFloat5[(m - 1 + (j + 1 - 1) * paramInt11 + paramInt10)]);
              paramArrayOfFloat5[(m - 1 + (j - 1) * paramInt11 + paramInt10)] = f1;
              m += 1;
            }
            localintW1.val = (j + 1);
            for (i3 = i - 1 - (j + 1) + 1; i3 > 0; i3--)
            {
              f6 = paramArrayOfFloat3[(localintW1.val - 1 + (1 - 1) * paramInt8 + paramInt7)];
              f7 = localfloatW3.val * paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
              paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (localfloatW1.val * paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
              Slartg.slartg(f6, f7, localfloatW1, localfloatW3, localfloatW2);
              if ((localfloatW2.val >= 0.0F ? 0 : 1) != 0)
              {
                localfloatW2.val = (-localfloatW2.val);
                localfloatW1.val = (-localfloatW1.val);
                localfloatW3.val = (-localfloatW3.val);
              }
              paramArrayOfFloat3[(localintW1.val - 1 + (1 - 1) * paramInt8 + paramInt7)] = localfloatW2.val;
              f1 = localfloatW1.val * paramArrayOfFloat3[(localintW1.val - 1 + (2 - 1) * paramInt8 + paramInt7)] + localfloatW3.val * paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
              f2 = localfloatW1.val * paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] + localfloatW3.val * paramArrayOfFloat3[(localintW1.val + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)];
              f3 = localfloatW1.val * paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] - localfloatW3.val * paramArrayOfFloat3[(localintW1.val - 1 + (2 - 1) * paramInt8 + paramInt7)];
              f4 = localfloatW1.val * paramArrayOfFloat3[(localintW1.val + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)] - localfloatW3.val * paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)];
              paramArrayOfFloat3[(localintW1.val - 1 + (2 - 1) * paramInt8 + paramInt7)] = (localfloatW1.val * f1 + localfloatW3.val * f2);
              paramArrayOfFloat3[(localintW1.val + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (localfloatW1.val * f4 - localfloatW3.val * f3);
              paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (localfloatW1.val * f3 + localfloatW3.val * f4);
              m = 1;
              for (int i4 = Math.min(localintW1.val + localintW2.val, n) - 1 + 1; i4 > 0; i4--)
              {
                f1 = localfloatW1.val * paramArrayOfFloat5[(m - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)] + localfloatW3.val * paramArrayOfFloat5[(m - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)];
                paramArrayOfFloat5[(m - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)] = (-(localfloatW3.val * paramArrayOfFloat5[(m - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)]) + localfloatW1.val * paramArrayOfFloat5[(m - 1 + (localintW1.val + 1 - 1) * paramInt11 + paramInt10)]);
                paramArrayOfFloat5[(m - 1 + (localintW1.val - 1) * paramInt11 + paramInt10)] = f1;
                m += 1;
              }
              localintW1.val += 1;
            }
          }
          j = i + 1;
          if ((paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt8 + paramInt7)] >= 0.0F ? 0 : 1) != 0)
          {
            paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt8 + paramInt7)] = (-paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt8 + paramInt7)]);
            Sscal.sscal(n, -1.0F, paramArrayOfFloat5, 1 - 1 + (i - 1) * paramInt11 + paramInt10, 1);
          }
        } while ((i >= n ? 0 : 1) != 0);
        localintW1.val = k;
        for (int i3 = n - 1 - k + 1; i3 > 0; i3--)
        {
          if ((paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] <= 0.0F ? 0 : 1) != 0) {
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
        f5 = Math.abs(paramArrayOfFloat3[(localintW1.val - 1 + (2 - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfFloat3[(localintW1.val + 1 - 1 + (2 - 1) * paramInt8 + paramInt7)]);
        if ((paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] > epsmch * f5 ? 0 : 1) != 0)
        {
          if ((i1 <= 0 ? 0 : 1) != 0)
          {
            ivout_adapter(arpack_debug.logfil.val, 1, localintW1, arpack_debug.ndigit.val, "_sapps: deflation at row/column no.");
            Svout.svout(arpack_debug.logfil.val, 1, paramArrayOfFloat3, localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_sapps: the corresponding off diagonal element");
          }
          paramArrayOfFloat3[(localintW1.val + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = 0.0F;
        }
        localintW1.val += 1;
      }
      if ((paramArrayOfFloat3[(paramInt2 + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] <= 0.0F ? 0 : 1) != 0) {
        Sgemv.sgemv("N", paramInt1, n, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat5, 1 - 1 + (paramInt2 + 1 - 1) * paramInt11 + paramInt10, 1, 0.0F, paramArrayOfFloat6, paramInt1 + 1 - 1 + paramInt12, 1);
      }
      localintW1.val = 1;
      for (i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
      {
        Sgemv.sgemv("N", paramInt1, n - localintW1.val + 1, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat5, 1 - 1 + (paramInt2 - localintW1.val + 1 - 1) * paramInt11 + paramInt10, 1, 0.0F, paramArrayOfFloat6, paramInt12, 1);
        Scopy.scopy(paramInt1, paramArrayOfFloat6, paramInt12, 1, paramArrayOfFloat2, 1 - 1 + (n - localintW1.val + 1 - 1) * paramInt6 + paramInt5, 1);
        localintW1.val += 1;
      }
      Slacpy.slacpy("All", paramInt1, paramInt2, paramArrayOfFloat2, 1 - 1 + (paramInt3 + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat2, paramInt5, paramInt6);
      if ((paramArrayOfFloat3[(paramInt2 + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] <= 0.0F ? 0 : 1) != 0) {
        Scopy.scopy(paramInt1, paramArrayOfFloat6, paramInt1 + 1 - 1 + paramInt12, 1, paramArrayOfFloat2, 1 - 1 + (paramInt2 + 1 - 1) * paramInt6 + paramInt5, 1);
      }
      Sscal.sscal(paramInt1, paramArrayOfFloat5[(n - 1 + (paramInt2 - 1) * paramInt11 + paramInt10)], paramArrayOfFloat4, paramInt9, 1);
      if ((paramArrayOfFloat3[(paramInt2 + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)] <= 0.0F ? 0 : 1) != 0) {
        Saxpy.saxpy(paramInt1, paramArrayOfFloat3[(paramInt2 + 1 - 1 + (1 - 1) * paramInt8 + paramInt7)], paramArrayOfFloat2, 1 - 1 + (paramInt2 + 1 - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat4, paramInt9, 1);
      }
      if ((i1 <= 1 ? 0 : 1) != 0)
      {
        Svout.svout(arpack_debug.logfil.val, 1, paramArrayOfFloat5, n - 1 + (paramInt2 - 1) * paramInt11 + paramInt10, arpack_debug.ndigit.val, "_sapps: sigmak of the updated residual vector");
        Svout.svout(arpack_debug.logfil.val, 1, paramArrayOfFloat3, paramInt2 + 1 - 1 + (1 - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_sapps: betak of the updated residual vector");
        Svout.svout(arpack_debug.logfil.val, paramInt2, paramArrayOfFloat3, 1 - 1 + (2 - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_sapps: updated main diagonal of H for next iteration");
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          Svout.svout(arpack_debug.logfil.val, paramInt2 - 1, paramArrayOfFloat3, 2 - 1 + (1 - 1) * paramInt8 + paramInt7, arpack_debug.ndigit.val, "_sapps: updated sub diagonal of H for next iteration");
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Ssapps.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */