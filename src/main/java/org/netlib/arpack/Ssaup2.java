package org.netlib.arpack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sswap;
import org.netlib.lapack.Slamch;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssaup2
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static floatW t2 = new floatW(0.0F);
  public static floatW t3 = new floatW(0.0F);
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  public static boolean cnorm = false;
  public static boolean getv0 = false;
  public static boolean initv = false;
  public static boolean update = false;
  public static boolean ushift = false;
  public static intW iter = new intW(0);
  public static int kplusp = 0;
  public static int msglvl = 0;
  public static intW nconv = new intW(0);
  public static int nev0 = 0;
  public static int np0 = 0;
  public static floatW rnorm = new floatW(0.0F);
  public static float eps23 = 0.0F;
  
  public static void ssaup2(intW paramintW1, String paramString1, int paramInt1, String paramString2, intW paramintW2, intW paramintW3, float paramFloat, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, intW paramintW4, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, float[] paramArrayOfFloat5, int paramInt11, float[] paramArrayOfFloat6, int paramInt12, int paramInt13, float[] paramArrayOfFloat7, int paramInt14, int[] paramArrayOfInt, int paramInt15, float[] paramArrayOfFloat8, int paramInt16, intW paramintW5)
  {
    String str = new String("  ");
    intW localintW = new intW(0);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int[] arrayOfInt = new int[3];
    float f = 0.0F;
    Etime.etime();
    if ((paramintW1.val != 0 ? 0 : 1) != 0)
    {
      Second.second(t0);
      msglvl = arpack_debug.msaup2.val;
      eps23 = Slamch.slamch("Epsilon-Machine");
      eps23 = (float)Math.pow(eps23, 2.0F / 3.0F);
      nev0 = paramintW2.val;
      np0 = paramintW3.val;
      kplusp = nev0 + np0;
      nconv.val = 0;
      iter.val = 0;
      getv0 = true;
      update = false;
      ushift = false;
      cnorm = false;
      if ((paramintW5.val == 0 ? 0 : 1) != 0)
      {
        initv = true;
        paramintW5.val = 0;
      }
      else
      {
        initv = false;
      }
    }
    if (getv0)
    {
      Sgetv0.sgetv0(paramintW1, paramString1, 1, initv, paramInt1, 1, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat1, paramInt2, rnorm, paramArrayOfInt, paramInt15, paramArrayOfFloat8, paramInt16, paramintW5);
      if ((paramintW1.val == 99 ? 0 : 1) != 0) {
        return;
      }
      if ((rnorm.val != 0.0F ? 0 : 1) != 0)
      {
        paramintW5.val = -9;
      }
      else
      {
        getv0 = false;
        paramintW1.val = 0;
      }
    }
    else
    {
      if (!update)
      {
        if (ushift) {
          break label2324;
        }
        if (cnorm) {
          break label2628;
        }
        Ssaitr.ssaitr(paramintW1, paramString1, paramInt1, 0, nev0, paramInt3, paramArrayOfFloat1, paramInt2, rnorm, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfInt, paramInt15, paramArrayOfFloat8, paramInt16, paramintW5);
        if ((paramintW1.val == 99 ? 0 : 1) != 0) {
          return;
        }
        if ((paramintW5.val <= 0 ? 0 : 1) != 0)
        {
          paramintW3.val = paramintW5.val;
          paramintW4.val = iter.val;
          paramintW5.val = 55537;
          break label2904;
        }
      }
      for (;;)
      {
        iter.val += 1;
        if ((msglvl <= 0 ? 0 : 1) != 0) {
          ivout_adapter(arpack_debug.logfil.val, 1, iter, arpack_debug.ndigit.val, "_saup2: **** Start of major iteration number ****");
        }
        if ((msglvl <= 1 ? 0 : 1) != 0)
        {
          ivout_adapter(arpack_debug.logfil.val, 1, paramintW2, arpack_debug.ndigit.val, "_saup2: The length of the current Lanczos factorization");
          ivout_adapter(arpack_debug.logfil.val, 1, paramintW3, arpack_debug.ndigit.val, "_saup2: Extend the Lanczos factorization by");
        }
        paramintW1.val = 0;
        update = true;
        Ssaitr.ssaitr(paramintW1, paramString1, paramInt1, paramintW2.val, paramintW3.val, paramInt3, paramArrayOfFloat1, paramInt2, rnorm, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfInt, paramInt15, paramArrayOfFloat8, paramInt16, paramintW5);
        if ((paramintW1.val == 99 ? 0 : 1) != 0) {
          return;
        }
        if ((paramintW5.val <= 0 ? 0 : 1) != 0)
        {
          paramintW3.val = paramintW5.val;
          paramintW4.val = iter.val;
          paramintW5.val = 55537;
          break label2904;
        }
        update = false;
        if ((msglvl <= 1 ? 0 : 1) != 0) {
          svout_adapter(arpack_debug.logfil.val, 1, rnorm, arpack_debug.ndigit.val, "_saup2: Current B-norm of residual for factorization");
        }
        Sseigt.sseigt(rnorm.val, kplusp, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11, paramArrayOfFloat7, paramInt14, localintW);
        if ((localintW.val == 0 ? 0 : 1) != 0)
        {
          paramintW5.val = -8;
          break label2904;
        }
        Scopy.scopy(kplusp, paramArrayOfFloat4, paramInt10, 1, paramArrayOfFloat7, kplusp + 1 - 1 + paramInt14, 1);
        Scopy.scopy(kplusp, paramArrayOfFloat5, paramInt11, 1, paramArrayOfFloat7, 2 * kplusp + 1 - 1 + paramInt14, 1);
        paramintW2.val = nev0;
        paramintW3.val = np0;
        Ssgets.ssgets(paramInt5, paramString2, paramintW2, paramintW3, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11, paramArrayOfFloat7, paramInt14);
        Scopy.scopy(paramintW2.val, paramArrayOfFloat5, paramintW3.val + 1 - 1 + paramInt11, 1, paramArrayOfFloat7, paramintW3.val + 1 - 1 + paramInt14, 1);
        Ssconv.ssconv(paramintW2.val, paramArrayOfFloat4, paramintW3.val + 1 - 1 + paramInt10, paramArrayOfFloat7, paramintW3.val + 1 - 1 + paramInt14, paramFloat, nconv);
        if ((msglvl <= 2 ? 0 : 1) != 0)
        {
          arrayOfInt[(1 - 1)] = paramintW2.val;
          arrayOfInt[(2 - 1)] = paramintW3.val;
          arrayOfInt[(3 - 1)] = nconv.val;
          Ivout.ivout(arpack_debug.logfil.val, 3, arrayOfInt, 0, arpack_debug.ndigit.val, "_saup2: NEV, NP, NCONV are");
          Svout.svout(arpack_debug.logfil.val, kplusp, paramArrayOfFloat4, paramInt10, arpack_debug.ndigit.val, "_saup2: The eigenvalues of H");
          Svout.svout(arpack_debug.logfil.val, kplusp, paramArrayOfFloat5, paramInt11, arpack_debug.ndigit.val, "_saup2: Ritz estimates of the current NCV Ritz values");
        }
        k = paramintW3.val;
        i = 1;
        for (int i1 = k - 1 + 1; i1 > 0; i1--)
        {
          if ((paramArrayOfFloat5[(i - 1 + paramInt11)] != 0.0F ? 0 : 1) != 0)
          {
            paramintW3.val -= 1;
            paramintW2.val += 1;
          }
          i += 1;
        }
        if ((nconv.val < nev0 ? 0 : 1) == 0) {}
        if (((iter.val <= paramintW4.val ? 0 : 1) == 0 ? 0 : 1) == 0) {}
        if (((paramintW3.val != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          if (paramString2.regionMatches(0, "BE", 0, 2))
          {
            str = "SA";
            Ssortr.ssortr(str, true, kplusp, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11);
            m = nev0 / 2;
            n = nev0 - m;
            if ((paramintW2.val <= 1 ? 0 : 1) != 0)
            {
              Sswap.sswap(Math.min(m, paramintW3.val), paramArrayOfFloat4, n + 1 - 1 + paramInt10, 1, paramArrayOfFloat4, Math.max(kplusp - m + 1, kplusp - paramintW3.val + 1) - 1 + paramInt10, 1);
              Sswap.sswap(Math.min(m, paramintW3.val), paramArrayOfFloat5, n + 1 - 1 + paramInt11, 1, paramArrayOfFloat5, Math.max(kplusp - m + 1, kplusp - paramintW3.val + 1) - 1 + paramInt11, 1);
            }
          }
          else
          {
            if (paramString2.regionMatches(0, "LM", 0, 2)) {
              str = "SM";
            }
            if (paramString2.regionMatches(0, "SM", 0, 2)) {
              str = "LM";
            }
            if (paramString2.regionMatches(0, "LA", 0, 2)) {
              str = "SA";
            }
            if (paramString2.regionMatches(0, "SA", 0, 2)) {
              str = "LA";
            }
            Ssortr.ssortr(str, true, kplusp, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11);
          }
          i = 1;
          for (i1 = nev0 - 1 + 1; i1 > 0; i1--)
          {
            f = Math.max(eps23, Math.abs(paramArrayOfFloat4[(i - 1 + paramInt10)]));
            paramArrayOfFloat5[(i - 1 + paramInt11)] /= f;
            i += 1;
          }
          str = "LA";
          Ssortr.ssortr(str, true, nev0, paramArrayOfFloat5, paramInt11, paramArrayOfFloat4, paramInt10);
          i = 1;
          for (i1 = nev0 - 1 + 1; i1 > 0; i1--)
          {
            f = Math.max(eps23, Math.abs(paramArrayOfFloat4[(i - 1 + paramInt10)]));
            paramArrayOfFloat5[(i - 1 + paramInt11)] *= f;
            i += 1;
          }
          if (paramString2.regionMatches(0, "BE", 0, 2))
          {
            str = "LA";
            Ssortr.ssortr(str, true, nconv.val, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11);
          }
          else
          {
            Ssortr.ssortr(paramString2, true, nconv.val, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11);
          }
          paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt9 + paramInt8)] = rnorm.val;
          if ((msglvl <= 1 ? 0 : 1) != 0)
          {
            Svout.svout(arpack_debug.logfil.val, kplusp, paramArrayOfFloat4, paramInt10, arpack_debug.ndigit.val, "_saup2: Sorted Ritz values.");
            Svout.svout(arpack_debug.logfil.val, kplusp, paramArrayOfFloat5, paramInt11, arpack_debug.ndigit.val, "_saup2: Sorted ritz estimates.");
          }
          if ((iter.val <= paramintW4.val ? 0 : 1) != 0) {}
          if (((nconv.val >= paramintW2.val ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramintW5.val = 1;
          }
          if ((paramintW3.val != 0 ? 0 : 1) != 0) {}
          if (((nconv.val >= nev0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramintW5.val = 2;
          }
          paramintW3.val = nconv.val;
          break;
        }
        if ((nconv.val >= paramintW2.val ? 0 : 1) != 0) {}
        if (((paramInt5 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          j = paramintW2.val;
          paramintW2.val += Math.min(nconv.val, paramintW3.val / 2);
          if ((paramintW2.val != 1 ? 0 : 1) != 0) {}
          if (((kplusp < 6 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            paramintW2.val = (kplusp / 2);
          }
          else
          {
            if ((paramintW2.val != 1 ? 0 : 1) != 0) {}
            if (((kplusp <= 2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramintW2.val = 2;
            }
          }
          paramintW3.val = (kplusp - paramintW2.val);
          if ((j >= paramintW2.val ? 0 : 1) != 0) {
            Ssgets.ssgets(paramInt5, paramString2, paramintW2, paramintW3, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11, paramArrayOfFloat7, paramInt14);
          }
        }
        if ((msglvl <= 0 ? 0 : 1) != 0)
        {
          ivout_adapter(arpack_debug.logfil.val, 1, nconv, arpack_debug.ndigit.val, "_saup2: no. of \"converged\" Ritz values at this iter.");
          if ((msglvl <= 1 ? 0 : 1) != 0)
          {
            arrayOfInt[(1 - 1)] = paramintW2.val;
            arrayOfInt[(2 - 1)] = paramintW3.val;
            Ivout.ivout(arpack_debug.logfil.val, 2, arrayOfInt, 0, arpack_debug.ndigit.val, "_saup2: NEV and NP are");
            Svout.svout(arpack_debug.logfil.val, paramintW2.val, paramArrayOfFloat4, paramintW3.val + 1 - 1 + paramInt10, arpack_debug.ndigit.val, "_saup2: \"wanted\" Ritz values.");
            Svout.svout(arpack_debug.logfil.val, paramintW2.val, paramArrayOfFloat5, paramintW3.val + 1 - 1 + paramInt11, arpack_debug.ndigit.val, "_saup2: Ritz estimates of the \"wanted\" values ");
          }
        }
        if ((paramInt5 != 0 ? 0 : 1) != 0)
        {
          ushift = true;
          paramintW1.val = 3;
          return;
        }
        label2324:
        ushift = false;
        if ((paramInt5 != 0 ? 0 : 1) != 0) {
          Scopy.scopy(paramintW3.val, paramArrayOfFloat7, paramInt14, 1, paramArrayOfFloat4, paramInt10, 1);
        }
        if ((msglvl <= 2 ? 0 : 1) != 0)
        {
          ivout_adapter(arpack_debug.logfil.val, 1, paramintW3, arpack_debug.ndigit.val, "_saup2: The number of shifts to apply ");
          Svout.svout(arpack_debug.logfil.val, paramintW3.val, paramArrayOfFloat7, paramInt14, arpack_debug.ndigit.val, "_saup2: shifts selected");
          if ((paramInt5 != 1 ? 0 : 1) != 0) {
            Svout.svout(arpack_debug.logfil.val, paramintW3.val, paramArrayOfFloat5, paramInt11, arpack_debug.ndigit.val, "_saup2: corresponding Ritz estimates");
          }
        }
        Ssapps.ssapps(paramInt1, paramintW2.val, paramintW3.val, paramArrayOfFloat4, paramInt10, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat1, paramInt2, paramArrayOfFloat6, paramInt12, paramInt13, paramArrayOfFloat8, paramInt16);
        cnorm = true;
        Second.second(t2);
        if (paramString1.regionMatches(0, "G", 0, 1))
        {
          arpack_timing.nbx.val += 1;
          Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat8, paramInt1 + 1 - 1 + paramInt16, 1);
          paramArrayOfInt[(1 - 1 + paramInt15)] = (paramInt1 + 1);
          paramArrayOfInt[(2 - 1 + paramInt15)] = 1;
          paramintW1.val = 2;
          return;
        }
        if (paramString1.regionMatches(0, "I", 0, 1)) {
          Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat8, paramInt16, 1);
        }
        label2628:
        if (paramString1.regionMatches(0, "G", 0, 1))
        {
          Second.second(t3);
          arpack_timing.tmvbx.val += t3.val - t2.val;
        }
        if (paramString1.regionMatches(0, "G", 0, 1))
        {
          rnorm.val = Sdot.sdot(paramInt1, paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat8, paramInt16, 1);
          rnorm.val = ((float)Math.sqrt(Math.abs(rnorm.val)));
        }
        else if (paramString1.regionMatches(0, "I", 0, 1))
        {
          rnorm.val = Snrm2.snrm2(paramInt1, paramArrayOfFloat1, paramInt2, 1);
        }
        cnorm = false;
        if ((msglvl <= 2 ? 0 : 1) != 0)
        {
          svout_adapter(arpack_debug.logfil.val, 1, rnorm, arpack_debug.ndigit.val, "_saup2: B-norm of residual for NEV factorization");
          Svout.svout(arpack_debug.logfil.val, paramintW2.val, paramArrayOfFloat3, 1 - 1 + (2 - 1) * paramInt9 + paramInt8, arpack_debug.ndigit.val, "_saup2: main diagonal of compressed H matrix");
          Svout.svout(arpack_debug.logfil.val, paramintW2.val - 1, paramArrayOfFloat3, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, arpack_debug.ndigit.val, "_saup2: subdiagonal of compressed H matrix");
        }
      }
      paramintW4.val = iter.val;
      paramintW2.val = nconv.val;
    }
    label2904:
    paramintW1.val = 99;
    Second.second(t1);
    t1.val -= t0.val;
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
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Ssaup2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */