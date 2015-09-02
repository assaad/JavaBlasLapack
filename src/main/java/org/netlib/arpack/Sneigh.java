package org.netlib.arpack;

import org.netlib.blas.Sgemv;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sscal;
import org.netlib.lapack.Slacpy;
import org.netlib.lapack.Slapy2;
import org.netlib.lapack.Strevc;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sneigh
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void sneigh(float paramFloat, intW paramintW1, float[] paramArrayOfFloat1, int paramInt1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, float[] paramArrayOfFloat4, int paramInt5, float[] paramArrayOfFloat5, int paramInt6, int paramInt7, float[] paramArrayOfFloat6, int paramInt8, intW paramintW2)
  {
    boolean[] arrayOfBoolean = new boolean[1];
    int i = 0;
    int j = 0;
    int k = 0;
    float f = 0.0F;
    float[] arrayOfFloat = new float[1];
    Etime.etime();
    Second.second(t0);
    k = arpack_debug.mneigh.val;
    if ((k <= 2 ? 0 : 1) != 0) {
      Smout.smout(arpack_debug.logfil.val, paramintW1.val, paramintW1.val, paramArrayOfFloat1, paramInt1, paramInt2, arpack_debug.ndigit.val, "_neigh: Entering upper Hessenberg matrix H ");
    }
    Slacpy.slacpy("All", paramintW1.val, paramintW1.val, paramArrayOfFloat1, paramInt1, paramInt2, paramArrayOfFloat6, paramInt8, paramintW1.val);
    Slaqrb.slaqrb(true, paramintW1.val, 1, paramintW1.val, paramArrayOfFloat6, paramInt8, paramintW1.val, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4, paramArrayOfFloat4, paramInt5, paramintW2);
    if ((paramintW2.val == 0 ? 0 : 1) == 0)
    {
      if ((k <= 1 ? 0 : 1) != 0) {
        Svout.svout(arpack_debug.logfil.val, paramintW1.val, paramArrayOfFloat4, paramInt5, arpack_debug.ndigit.val, "_neigh: last row of the Schur matrix for H");
      }
      Strevc.strevc("R", "A", arrayOfBoolean, 0, paramintW1.val, paramArrayOfFloat6, paramInt8, paramintW1.val, arrayOfFloat, 0, paramintW1.val, paramArrayOfFloat5, paramInt6, paramInt7, paramintW1.val, paramintW1, paramArrayOfFloat6, paramintW1.val * paramintW1.val + 1 - 1 + paramInt8, paramintW2);
      if ((paramintW2.val == 0 ? 0 : 1) == 0)
      {
        j = 0;
        i = 1;
        for (int m = paramintW1.val - 1 + 1; m > 0; m--)
        {
          if ((Math.abs(paramArrayOfFloat3[(i - 1 + paramInt4)]) > 0.0F ? 0 : 1) != 0)
          {
            f = Snrm2.snrm2(paramintW1.val, paramArrayOfFloat5, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
            Sscal.sscal(paramintW1.val, 1.0F / f, paramArrayOfFloat5, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          }
          else if ((j != 0 ? 0 : 1) != 0)
          {
            f = Slapy2.slapy2(Snrm2.snrm2(paramintW1.val, paramArrayOfFloat5, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1), Snrm2.snrm2(paramintW1.val, paramArrayOfFloat5, 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6, 1));
            Sscal.sscal(paramintW1.val, 1.0F / f, paramArrayOfFloat5, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
            Sscal.sscal(paramintW1.val, 1.0F / f, paramArrayOfFloat5, 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6, 1);
            j = 1;
          }
          else
          {
            j = 0;
          }
          i += 1;
        }
        Sgemv.sgemv("T", paramintW1.val, paramintW1.val, 1.0F, paramArrayOfFloat5, paramInt6, paramInt7, paramArrayOfFloat4, paramInt5, 1, 0.0F, paramArrayOfFloat6, paramInt8, 1);
        if ((k <= 1 ? 0 : 1) != 0) {
          Svout.svout(arpack_debug.logfil.val, paramintW1.val, paramArrayOfFloat6, paramInt8, arpack_debug.ndigit.val, "_neigh: Last row of the eigenvector matrix for H");
        }
        j = 0;
        i = 1;
        for (m = paramintW1.val - 1 + 1; m > 0; m--)
        {
          if ((Math.abs(paramArrayOfFloat3[(i - 1 + paramInt4)]) > 0.0F ? 0 : 1) != 0)
          {
            paramArrayOfFloat4[(i - 1 + paramInt5)] = (paramFloat * Math.abs(paramArrayOfFloat6[(i - 1 + paramInt8)]));
          }
          else if ((j != 0 ? 0 : 1) != 0)
          {
            paramArrayOfFloat4[(i - 1 + paramInt5)] = (paramFloat * Slapy2.slapy2(paramArrayOfFloat6[(i - 1 + paramInt8)], paramArrayOfFloat6[(i + 1 - 1 + paramInt8)]));
            paramArrayOfFloat4[(i + 1 - 1 + paramInt5)] = paramArrayOfFloat4[(i - 1 + paramInt5)];
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
          Svout.svout(arpack_debug.logfil.val, paramintW1.val, paramArrayOfFloat2, paramInt3, arpack_debug.ndigit.val, "_neigh: Real part of the eigenvalues of H");
          Svout.svout(arpack_debug.logfil.val, paramintW1.val, paramArrayOfFloat3, paramInt4, arpack_debug.ndigit.val, "_neigh: Imaginary part of the eigenvalues of H");
          Svout.svout(arpack_debug.logfil.val, paramintW1.val, paramArrayOfFloat4, paramInt5, arpack_debug.ndigit.val, "_neigh: Ritz estimates for the eigenvalues of H");
        }
        Second.second(t1);
        arpack_timing.tneigh.val += t1.val - t0.val;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Sneigh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */