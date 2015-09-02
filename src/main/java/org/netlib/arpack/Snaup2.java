package org.netlib.arpack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Snrm2;
import org.netlib.lapack.Slamch;
import org.netlib.lapack.Slapy2;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Snaup2
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
  public static intW kplusp = new intW(0);
  public static int msglvl = 0;
  public static intW nconv = new intW(0);
  public static int nevbef = 0;
  public static int nev0 = 0;
  public static int np0 = 0;
  public static int numcnv = 0;
  public static floatW rnorm = new floatW(0.0F);
  public static float eps23 = 0.0F;
  
  public static void snaup2(intW paramintW1, String paramString1, int paramInt1, String paramString2, intW paramintW2, intW paramintW3, float paramFloat, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, intW paramintW4, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, float[] paramArrayOfFloat5, int paramInt11, float[] paramArrayOfFloat6, int paramInt12, float[] paramArrayOfFloat7, int paramInt13, int paramInt14, float[] paramArrayOfFloat8, int paramInt15, int[] paramArrayOfInt, int paramInt16, float[] paramArrayOfFloat9, int paramInt17, intW paramintW5)
  {
    String str = new String("  ");
    intW localintW = new intW(0);
    int i = 0;
    int j = 0;
    float f = 0.0F;
    int[] arrayOfInt = new int[4];
    Etime.etime();
    if ((paramintW1.val != 0 ? 0 : 1) != 0)
    {
      Second.second(t0);
      msglvl = arpack_debug.mnaup2.val;
      eps23 = Slamch.slamch("Epsilon-Machine");
      eps23 = (float)Math.pow(eps23, 2.0F / 3.0F);
      nev0 = paramintW2.val;
      np0 = paramintW3.val;
      kplusp.val = (paramintW2.val + paramintW3.val);
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
      Sgetv0.sgetv0(paramintW1, paramString1, 1, initv, paramInt1, 1, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat1, paramInt2, rnorm, paramArrayOfInt, paramInt16, paramArrayOfFloat9, paramInt17, paramintW5);
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
          break label2781;
        }
        if (cnorm) {
          break label3145;
        }
        Snaitr.snaitr(paramintW1, paramString1, paramInt1, 0, paramintW2.val, paramInt3, paramArrayOfFloat1, paramInt2, rnorm, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfInt, paramInt16, paramArrayOfFloat9, paramInt17, paramintW5);
        if ((paramintW1.val == 99 ? 0 : 1) != 0) {
          return;
        }
        if ((paramintW5.val <= 0 ? 0 : 1) != 0)
        {
          paramintW3.val = paramintW5.val;
          paramintW4.val = iter.val;
          paramintW5.val = 55537;
          break label3374;
        }
      }
      for (;;)
      {
        iter.val += 1;
        if ((msglvl <= 0 ? 0 : 1) != 0) {
          ivout_adapter(arpack_debug.logfil.val, 1, iter, arpack_debug.ndigit.val, "_naup2: **** Start of major iteration number ****");
        }
        paramintW3.val = (kplusp.val - paramintW2.val);
        if ((msglvl <= 1 ? 0 : 1) != 0)
        {
          ivout_adapter(arpack_debug.logfil.val, 1, paramintW2, arpack_debug.ndigit.val, "_naup2: The length of the current Arnoldi factorization");
          ivout_adapter(arpack_debug.logfil.val, 1, paramintW3, arpack_debug.ndigit.val, "_naup2: Extend the Arnoldi factorization by");
        }
        paramintW1.val = 0;
        update = true;
        Snaitr.snaitr(paramintW1, paramString1, paramInt1, paramintW2.val, paramintW3.val, paramInt3, paramArrayOfFloat1, paramInt2, rnorm, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfInt, paramInt16, paramArrayOfFloat9, paramInt17, paramintW5);
        if ((paramintW1.val == 99 ? 0 : 1) != 0) {
          return;
        }
        if ((paramintW5.val <= 0 ? 0 : 1) != 0)
        {
          paramintW3.val = paramintW5.val;
          paramintW4.val = iter.val;
          paramintW5.val = 55537;
          break label3374;
        }
        update = false;
        if ((msglvl <= 1 ? 0 : 1) != 0) {
          svout_adapter(arpack_debug.logfil.val, 1, rnorm, arpack_debug.ndigit.val, "_naup2: Corresponding B-norm of the residual");
        }
        Sneigh.sneigh(rnorm.val, kplusp, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11, paramArrayOfFloat6, paramInt12, paramArrayOfFloat7, paramInt13, paramInt14, paramArrayOfFloat8, paramInt15, localintW);
        if ((localintW.val == 0 ? 0 : 1) != 0)
        {
          paramintW5.val = -8;
          break label3374;
        }
        Scopy.scopy(kplusp.val, paramArrayOfFloat4, paramInt10, 1, paramArrayOfFloat8, (int)Math.pow(kplusp.val, 2) + 1 - 1 + paramInt15, 1);
        Scopy.scopy(kplusp.val, paramArrayOfFloat5, paramInt11, 1, paramArrayOfFloat8, (int)Math.pow(kplusp.val, 2) + kplusp.val + 1 - 1 + paramInt15, 1);
        Scopy.scopy(kplusp.val, paramArrayOfFloat6, paramInt12, 1, paramArrayOfFloat8, (int)Math.pow(kplusp.val, 2) + 2 * kplusp.val + 1 - 1 + paramInt15, 1);
        paramintW2.val = nev0;
        paramintW3.val = np0;
        numcnv = paramintW2.val;
        Sngets.sngets(paramInt5, paramString2, paramintW2, paramintW3, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11, paramArrayOfFloat6, paramInt12, paramArrayOfFloat8, paramInt15, paramArrayOfFloat8, paramintW3.val + 1 - 1 + paramInt15);
        if ((paramintW2.val != nev0 + 1 ? 0 : 1) != 0) {
          numcnv = nev0 + 1;
        }
        Scopy.scopy(paramintW2.val, paramArrayOfFloat6, paramintW3.val + 1 - 1 + paramInt12, 1, paramArrayOfFloat8, 2 * paramintW3.val + 1 - 1 + paramInt15, 1);
        Snconv.snconv(paramintW2.val, paramArrayOfFloat4, paramintW3.val + 1 - 1 + paramInt10, paramArrayOfFloat5, paramintW3.val + 1 - 1 + paramInt11, paramArrayOfFloat8, 2 * paramintW3.val + 1 - 1 + paramInt15, paramFloat, nconv);
        if ((msglvl <= 2 ? 0 : 1) != 0)
        {
          arrayOfInt[(1 - 1)] = paramintW2.val;
          arrayOfInt[(2 - 1)] = paramintW3.val;
          arrayOfInt[(3 - 1)] = numcnv;
          arrayOfInt[(4 - 1)] = nconv.val;
          Ivout.ivout(arpack_debug.logfil.val, 4, arrayOfInt, 0, arpack_debug.ndigit.val, "_naup2: NEV, NP, NUMCNV, NCONV are");
          Svout.svout(arpack_debug.logfil.val, kplusp.val, paramArrayOfFloat4, paramInt10, arpack_debug.ndigit.val, "_naup2: Real part of the eigenvalues of H");
          Svout.svout(arpack_debug.logfil.val, kplusp.val, paramArrayOfFloat5, paramInt11, arpack_debug.ndigit.val, "_naup2: Imaginary part of the eigenvalues of H");
          Svout.svout(arpack_debug.logfil.val, kplusp.val, paramArrayOfFloat6, paramInt12, arpack_debug.ndigit.val, "_naup2: Ritz estimates of the current NCV Ritz values");
        }
        j = paramintW3.val;
        i = 1;
        for (int k = j - 1 + 1; k > 0; k--)
        {
          if ((paramArrayOfFloat6[(i - 1 + paramInt12)] != 0.0F ? 0 : 1) != 0)
          {
            paramintW3.val -= 1;
            paramintW2.val += 1;
          }
          i += 1;
        }
        if ((nconv.val < numcnv ? 0 : 1) == 0) {}
        if (((iter.val <= paramintW4.val ? 0 : 1) == 0 ? 0 : 1) == 0) {}
        if (((paramintW3.val != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          if ((msglvl <= 4 ? 0 : 1) != 0)
          {
            Svout.svout(arpack_debug.logfil.val, kplusp.val, paramArrayOfFloat8, (int)Math.pow(kplusp.val, 2) + 1 - 1 + paramInt15, arpack_debug.ndigit.val, "_naup2: Real part of the eig computed by _neigh:");
            Svout.svout(arpack_debug.logfil.val, kplusp.val, paramArrayOfFloat8, (int)Math.pow(kplusp.val, 2) + kplusp.val + 1 - 1 + paramInt15, arpack_debug.ndigit.val, "_naup2: Imag part of the eig computed by _neigh:");
            Svout.svout(arpack_debug.logfil.val, kplusp.val, paramArrayOfFloat8, (int)Math.pow(kplusp.val, 2) + kplusp.val * 2 + 1 - 1 + paramInt15, arpack_debug.ndigit.val, "_naup2: Ritz eistmates computed by _neigh:");
          }
          paramArrayOfFloat3[(3 - 1 + (1 - 1) * paramInt9 + paramInt8)] = rnorm.val;
          if (paramString2.regionMatches(0, "LM", 0, 2)) {
            str = "SR";
          }
          if (paramString2.regionMatches(0, "SM", 0, 2)) {
            str = "LR";
          }
          if (paramString2.regionMatches(0, "LR", 0, 2)) {
            str = "SM";
          }
          if (paramString2.regionMatches(0, "SR", 0, 2)) {
            str = "LM";
          }
          if (paramString2.regionMatches(0, "LI", 0, 2)) {
            str = "SM";
          }
          if (paramString2.regionMatches(0, "SI", 0, 2)) {
            str = "LM";
          }
          Ssortc.ssortc(str, true, kplusp.val, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11, paramArrayOfFloat6, paramInt12);
          if (paramString2.regionMatches(0, "LM", 0, 2)) {
            str = "SM";
          }
          if (paramString2.regionMatches(0, "SM", 0, 2)) {
            str = "LM";
          }
          if (paramString2.regionMatches(0, "LR", 0, 2)) {
            str = "SR";
          }
          if (paramString2.regionMatches(0, "SR", 0, 2)) {
            str = "LR";
          }
          if (paramString2.regionMatches(0, "LI", 0, 2)) {
            str = "SI";
          }
          if (paramString2.regionMatches(0, "SI", 0, 2)) {
            str = "LI";
          }
          Ssortc.ssortc(str, true, kplusp.val, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11, paramArrayOfFloat6, paramInt12);
          i = 1;
          for (k = numcnv - 1 + 1; k > 0; k--)
          {
            f = Math.max(eps23, Slapy2.slapy2(paramArrayOfFloat4[(i - 1 + paramInt10)], paramArrayOfFloat5[(i - 1 + paramInt11)]));
            paramArrayOfFloat6[(i - 1 + paramInt12)] /= f;
            i += 1;
          }
          str = "LR";
          Ssortc.ssortc(str, true, numcnv, paramArrayOfFloat6, paramInt12, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11);
          i = 1;
          for (k = numcnv - 1 + 1; k > 0; k--)
          {
            f = Math.max(eps23, Slapy2.slapy2(paramArrayOfFloat4[(i - 1 + paramInt10)], paramArrayOfFloat5[(i - 1 + paramInt11)]));
            paramArrayOfFloat6[(i - 1 + paramInt12)] *= f;
            i += 1;
          }
          Ssortc.ssortc(paramString2, true, nconv.val, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11, paramArrayOfFloat6, paramInt12);
          if ((msglvl <= 1 ? 0 : 1) != 0)
          {
            Svout.svout(arpack_debug.logfil.val, kplusp.val, paramArrayOfFloat4, paramInt10, arpack_debug.ndigit.val, "_naup2: Sorted real part of the eigenvalues");
            Svout.svout(arpack_debug.logfil.val, kplusp.val, paramArrayOfFloat5, paramInt11, arpack_debug.ndigit.val, "_naup2: Sorted imaginary part of the eigenvalues");
            Svout.svout(arpack_debug.logfil.val, kplusp.val, paramArrayOfFloat6, paramInt12, arpack_debug.ndigit.val, "_naup2: Sorted ritz estimates.");
          }
          if ((iter.val <= paramintW4.val ? 0 : 1) != 0) {}
          if (((nconv.val >= numcnv ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramintW5.val = 1;
          }
          if ((paramintW3.val != 0 ? 0 : 1) != 0) {}
          if (((nconv.val >= numcnv ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramintW5.val = 2;
          }
          paramintW3.val = nconv.val;
          break;
        }
        if ((nconv.val >= numcnv ? 0 : 1) != 0) {}
        if (((paramInt5 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          nevbef = paramintW2.val;
          paramintW2.val += Math.min(nconv.val, paramintW3.val / 2);
          if ((paramintW2.val != 1 ? 0 : 1) != 0) {}
          if (((kplusp.val < 6 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            paramintW2.val = (kplusp.val / 2);
          }
          else
          {
            if ((paramintW2.val != 1 ? 0 : 1) != 0) {}
            if (((kplusp.val <= 3 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramintW2.val = 2;
            }
          }
          paramintW3.val = (kplusp.val - paramintW2.val);
          if ((nevbef >= paramintW2.val ? 0 : 1) != 0) {
            Sngets.sngets(paramInt5, paramString2, paramintW2, paramintW3, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11, paramArrayOfFloat6, paramInt12, paramArrayOfFloat8, paramInt15, paramArrayOfFloat8, paramintW3.val + 1 - 1 + paramInt15);
          }
        }
        if ((msglvl <= 0 ? 0 : 1) != 0)
        {
          ivout_adapter(arpack_debug.logfil.val, 1, nconv, arpack_debug.ndigit.val, "_naup2: no. of \"converged\" Ritz values at this iter.");
          if ((msglvl <= 1 ? 0 : 1) != 0)
          {
            arrayOfInt[(1 - 1)] = paramintW2.val;
            arrayOfInt[(2 - 1)] = paramintW3.val;
            Ivout.ivout(arpack_debug.logfil.val, 2, arrayOfInt, 0, arpack_debug.ndigit.val, "_naup2: NEV and NP are");
            Svout.svout(arpack_debug.logfil.val, paramintW2.val, paramArrayOfFloat4, paramintW3.val + 1 - 1 + paramInt10, arpack_debug.ndigit.val, "_naup2: \"wanted\" Ritz values -- real part");
            Svout.svout(arpack_debug.logfil.val, paramintW2.val, paramArrayOfFloat5, paramintW3.val + 1 - 1 + paramInt11, arpack_debug.ndigit.val, "_naup2: \"wanted\" Ritz values -- imag part");
            Svout.svout(arpack_debug.logfil.val, paramintW2.val, paramArrayOfFloat6, paramintW3.val + 1 - 1 + paramInt12, arpack_debug.ndigit.val, "_naup2: Ritz estimates of the \"wanted\" values ");
          }
        }
        if ((paramInt5 != 0 ? 0 : 1) != 0)
        {
          ushift = true;
          paramintW1.val = 3;
          return;
        }
        label2781:
        ushift = false;
        if ((paramInt5 != 0 ? 0 : 1) != 0)
        {
          Scopy.scopy(paramintW3.val, paramArrayOfFloat8, paramInt15, 1, paramArrayOfFloat4, paramInt10, 1);
          Scopy.scopy(paramintW3.val, paramArrayOfFloat8, paramintW3.val + 1 - 1 + paramInt15, 1, paramArrayOfFloat5, paramInt11, 1);
        }
        if ((msglvl <= 2 ? 0 : 1) != 0)
        {
          ivout_adapter(arpack_debug.logfil.val, 1, paramintW3, arpack_debug.ndigit.val, "_naup2: The number of shifts to apply ");
          Svout.svout(arpack_debug.logfil.val, paramintW3.val, paramArrayOfFloat4, paramInt10, arpack_debug.ndigit.val, "_naup2: Real part of the shifts");
          Svout.svout(arpack_debug.logfil.val, paramintW3.val, paramArrayOfFloat5, paramInt11, arpack_debug.ndigit.val, "_naup2: Imaginary part of the shifts");
          if ((paramInt5 != 1 ? 0 : 1) != 0) {
            Svout.svout(arpack_debug.logfil.val, paramintW3.val, paramArrayOfFloat6, paramInt12, arpack_debug.ndigit.val, "_naup2: Ritz estimates of the shifts");
          }
        }
        Snapps.snapps(paramInt1, paramintW2, paramintW3.val, paramArrayOfFloat4, paramInt10, paramArrayOfFloat5, paramInt11, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat1, paramInt2, paramArrayOfFloat7, paramInt13, paramInt14, paramArrayOfFloat8, paramInt15, paramArrayOfFloat9, paramInt17);
        cnorm = true;
        Second.second(t2);
        if (paramString1.regionMatches(0, "G", 0, 1))
        {
          arpack_timing.nbx.val += 1;
          Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat9, paramInt1 + 1 - 1 + paramInt17, 1);
          paramArrayOfInt[(1 - 1 + paramInt16)] = (paramInt1 + 1);
          paramArrayOfInt[(2 - 1 + paramInt16)] = 1;
          paramintW1.val = 2;
          return;
        }
        if (paramString1.regionMatches(0, "I", 0, 1)) {
          Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat9, paramInt17, 1);
        }
        label3145:
        if (paramString1.regionMatches(0, "G", 0, 1))
        {
          Second.second(t3);
          arpack_timing.tmvbx.val += t3.val - t2.val;
        }
        if (paramString1.regionMatches(0, "G", 0, 1))
        {
          rnorm.val = Sdot.sdot(paramInt1, paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat9, paramInt17, 1);
          rnorm.val = ((float)Math.sqrt(Math.abs(rnorm.val)));
        }
        else if (paramString1.regionMatches(0, "I", 0, 1))
        {
          rnorm.val = Snrm2.snrm2(paramInt1, paramArrayOfFloat1, paramInt2, 1);
        }
        cnorm = false;
        if ((msglvl <= 2 ? 0 : 1) != 0)
        {
          svout_adapter(arpack_debug.logfil.val, 1, rnorm, arpack_debug.ndigit.val, "_naup2: B-norm of residual for compressed factorization");
          Smout.smout(arpack_debug.logfil.val, paramintW2.val, paramintW2.val, paramArrayOfFloat3, paramInt8, paramInt9, arpack_debug.ndigit.val, "_naup2: Compressed upper Hessenberg matrix H");
        }
      }
    }
    paramintW4.val = iter.val;
    paramintW2.val = numcnv;
    label3374:
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Snaup2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */