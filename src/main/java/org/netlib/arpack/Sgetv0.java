package org.netlib.arpack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Snrm2;
import org.netlib.lapack.Slarnv;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgetv0
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static floatW t2 = new floatW(0.0F);
  public static floatW t3 = new floatW(0.0F);
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  public static boolean first = false;
  public static boolean inits = true;
  public static boolean orth = false;
  public static int[] iseed = new int[4];
  public static int iter = 0;
  public static int msglvl = 0;
  public static floatW rnorm0 = new floatW(0.0F);
  
  public static void sgetv0(intW paramintW1, String paramString, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, floatW paramfloatW, int[] paramArrayOfInt, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, intW paramintW2)
  {
    int i = 0;
    int j = 0;
    Etime.etime();
    if (inits)
    {
      iseed[(1 - 1)] = 1;
      iseed[(2 - 1)] = 3;
      iseed[(3 - 1)] = 5;
      iseed[(4 - 1)] = 7;
      inits = false;
    }
    if ((paramintW1.val != 0 ? 0 : 1) != 0)
    {
      Second.second(t0);
      msglvl = arpack_debug.mgetv0.val;
      paramintW2.val = 0;
      iter = 0;
      first = false;
      orth = false;
      if ((paramBoolean ^ true))
      {
        i = 2;
        Slarnv.slarnv(i, iseed, 0, paramInt2, paramArrayOfFloat2, paramInt6);
      }
      Second.second(t2);
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        arpack_timing.nopx.val += 1;
        paramArrayOfInt[(1 - 1 + paramInt7)] = 1;
        paramArrayOfInt[(2 - 1 + paramInt7)] = (paramInt2 + 1);
        Scopy.scopy(paramInt2, paramArrayOfFloat2, paramInt6, 1, paramArrayOfFloat3, paramInt8, 1);
        paramintW1.val = -1;
        return;
      }
    }
    if (!first)
    {
      if (orth) {
        break label745;
      }
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        Second.second(t3);
        arpack_timing.tmvopx.val += t3.val - t2.val;
      }
      Second.second(t2);
      first = true;
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        arpack_timing.nbx.val += 1;
        Scopy.scopy(paramInt2, paramArrayOfFloat3, paramInt2 + 1 - 1 + paramInt8, 1, paramArrayOfFloat2, paramInt6, 1);
        paramArrayOfInt[(1 - 1 + paramInt7)] = (paramInt2 + 1);
        paramArrayOfInt[(2 - 1 + paramInt7)] = 1;
        paramintW1.val = 2;
        return;
      }
      if (paramString.regionMatches(0, "I", 0, 1)) {
        Scopy.scopy(paramInt2, paramArrayOfFloat2, paramInt6, 1, paramArrayOfFloat3, paramInt8, 1);
      }
    }
    if (paramString.regionMatches(0, "G", 0, 1))
    {
      Second.second(t3);
      arpack_timing.tmvbx.val += t3.val - t2.val;
    }
    first = false;
    if (paramString.regionMatches(0, "G", 0, 1))
    {
      rnorm0.val = Sdot.sdot(paramInt2, paramArrayOfFloat2, paramInt6, 1, paramArrayOfFloat3, paramInt8, 1);
      rnorm0.val = ((float)Math.sqrt(Math.abs(rnorm0.val)));
    }
    else if (paramString.regionMatches(0, "I", 0, 1))
    {
      rnorm0.val = Snrm2.snrm2(paramInt2, paramArrayOfFloat2, paramInt6, 1);
    }
    paramfloatW.val = rnorm0.val;
    if ((paramInt3 != 1 ? 0 : 1) == 0)
    {
      orth = true;
      for (;;)
      {
        Sgemv.sgemv("T", paramInt2, paramInt3 - 1, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt8, 1, 0.0F, paramArrayOfFloat3, paramInt2 + 1 - 1 + paramInt8, 1);
        Sgemv.sgemv("N", paramInt2, paramInt3 - 1, -1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt2 + 1 - 1 + paramInt8, 1, 1.0F, paramArrayOfFloat2, paramInt6, 1);
        Second.second(t2);
        if (paramString.regionMatches(0, "G", 0, 1))
        {
          arpack_timing.nbx.val += 1;
          Scopy.scopy(paramInt2, paramArrayOfFloat2, paramInt6, 1, paramArrayOfFloat3, paramInt2 + 1 - 1 + paramInt8, 1);
          paramArrayOfInt[(1 - 1 + paramInt7)] = (paramInt2 + 1);
          paramArrayOfInt[(2 - 1 + paramInt7)] = 1;
          paramintW1.val = 2;
          return;
        }
        if (paramString.regionMatches(0, "I", 0, 1)) {
          Scopy.scopy(paramInt2, paramArrayOfFloat2, paramInt6, 1, paramArrayOfFloat3, paramInt8, 1);
        }
        label745:
        if (paramString.regionMatches(0, "G", 0, 1))
        {
          Second.second(t3);
          arpack_timing.tmvbx.val += t3.val - t2.val;
        }
        if (paramString.regionMatches(0, "G", 0, 1))
        {
          paramfloatW.val = Sdot.sdot(paramInt2, paramArrayOfFloat2, paramInt6, 1, paramArrayOfFloat3, paramInt8, 1);
          paramfloatW.val = ((float)Math.sqrt(Math.abs(paramfloatW.val)));
        }
        else if (paramString.regionMatches(0, "I", 0, 1))
        {
          paramfloatW.val = Snrm2.snrm2(paramInt2, paramArrayOfFloat2, paramInt6, 1);
        }
        if ((msglvl <= 2 ? 0 : 1) != 0)
        {
          svout_adapter(arpack_debug.logfil.val, 1, rnorm0, arpack_debug.ndigit.val, "_getv0: re-orthonalization ; rnorm0 is");
          svout_adapter(arpack_debug.logfil.val, 1, paramfloatW, arpack_debug.ndigit.val, "_getv0: re-orthonalization ; rnorm is");
        }
        if ((paramfloatW.val <= 0.717F * rnorm0.val ? 0 : 1) != 0) {
          break label1048;
        }
        iter += 1;
        if ((iter > 5 ? 0 : 1) == 0) {
          break;
        }
        rnorm0.val = paramfloatW.val;
      }
      j = 1;
      for (int k = paramInt2 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat2[(j - 1 + paramInt6)] = 0.0F;
        j += 1;
      }
      paramfloatW.val = 0.0F;
      paramintW2.val = -1;
    }
    label1048:
    if ((msglvl <= 0 ? 0 : 1) != 0) {
      svout_adapter(arpack_debug.logfil.val, 1, paramfloatW, arpack_debug.ndigit.val, "_getv0: B-norm of initial / restarted starting vector");
    }
    if ((msglvl <= 3 ? 0 : 1) != 0) {
      Svout.svout(arpack_debug.logfil.val, paramInt2, paramArrayOfFloat2, paramInt6, arpack_debug.ndigit.val, "_getv0: initial / restarted starting vector");
    }
    paramintW1.val = 99;
    Second.second(t1);
    arpack_timing.tgetv0.val += t1.val - t0.val;
  }
  
  private static void svout_adapter(int paramInt1, int paramInt2, floatW paramfloatW, int paramInt3, String paramString)
  {
    float[] arrayOfFloat = { paramfloatW.val };
    Svout.svout(paramInt1, paramInt2, arrayOfFloat, 0, paramInt3, paramString);
    paramfloatW.val = arrayOfFloat[0];
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Sgetv0.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */