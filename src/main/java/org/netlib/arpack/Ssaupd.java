package org.netlib.arpack;

import java.util.Vector;
import org.netlib.lapack.Slamch;
import org.netlib.util.Etime;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssaupd
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  public static int bounds = 0;
  public static int ierr = 0;
  public static int ih = 0;
  public static int iq = 0;
  public static int ishift = 0;
  public static int iupd = 0;
  public static int iw = 0;
  public static int ldh = 0;
  public static int ldq = 0;
  public static int msglvl = 0;
  public static intW mxiter = new intW(0);
  public static int mode = 0;
  public static int nb = 0;
  public static intW nev0 = new intW(0);
  public static int next = 0;
  public static intW np = new intW(0);
  public static int ritz = 0;
  
  public static void ssaupd(intW paramintW1, String paramString1, int paramInt1, String paramString2, int paramInt2, floatW paramfloatW, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, int[] paramArrayOfInt1, int paramInt7, int[] paramArrayOfInt2, int paramInt8, float[] paramArrayOfFloat3, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, intW paramintW2)
  {
    int i = 0;
    Vector localVector = new Vector();
    Etime.etime();
    if ((paramintW1.val != 0 ? 0 : 1) != 0)
    {
      Sstats.sstats();
      Second.second(t0);
      msglvl = arpack_debug.msaupd.val;
      ierr = 0;
      ishift = paramArrayOfInt1[(1 - 1 + paramInt7)];
      mxiter.val = paramArrayOfInt1[(3 - 1 + paramInt7)];
      nb = 1;
      iupd = 1;
      mode = paramArrayOfInt1[(7 - 1 + paramInt7)];
      if ((paramInt1 > 0 ? 0 : 1) != 0)
      {
        ierr = -1;
      }
      else if ((paramInt2 > 0 ? 0 : 1) != 0)
      {
        ierr = -2;
      }
      else
      {
        if ((paramInt4 > paramInt2 ? 0 : 1) == 0) {}
        if (((paramInt4 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          ierr = -3;
        }
      }
      np.val = (paramInt4 - paramInt2);
      if ((mxiter.val > 0 ? 0 : 1) != 0) {
        ierr = -4;
      }
      if ((((paramString2.regionMatches(0, "LM", 0, 2) ^ true)) && ((paramString2.regionMatches(0, "SM", 0, 2) ^ true)) ? 1 : 0) != 0) {}
      if (((paramString2.regionMatches(0, "LA", 0, 2) ^ true) ? 1 : 0) != 0) {}
      if (((paramString2.regionMatches(0, "SA", 0, 2) ^ true) ? 1 : 0) != 0) {}
      if (((paramString2.regionMatches(0, "BE", 0, 2) ^ true) ? 1 : 0) != 0) {
        ierr = -5;
      }
      if ((((paramString1.regionMatches(0, "I", 0, 1) ^ true)) && ((paramString1.regionMatches(0, "G", 0, 1) ^ true)) ? 1 : 0) != 0) {
        ierr = -6;
      }
      if ((paramInt11 >= (int)Math.pow(paramInt4, 2) + 8 * paramInt4 ? 0 : 1) != 0) {
        ierr = -7;
      }
      if ((mode >= 1 ? 0 : 1) == 0) {}
      if (((mode <= 5 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        ierr = -10;
      }
      else
      {
        if ((mode != 1 ? 0 : 1) != 0) {}
        if ((paramString1.regionMatches(0, "G", 0, 1) ? 1 : 0) != 0)
        {
          ierr = -11;
        }
        else
        {
          if ((ishift >= 0 ? 0 : 1) == 0) {}
          if (((ishift <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            ierr = -12;
          }
          else
          {
            if ((paramInt2 != 1 ? 0 : 1) != 0) {}
            if ((paramString2.regionMatches(0, "BE", 0, 2) ? 1 : 0) != 0) {
              ierr = -13;
            }
          }
        }
      }
      if ((ierr == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = ierr;
        paramintW1.val = 99;
      }
      else
      {
        if ((nb > 0 ? 0 : 1) != 0) {
          nb = 1;
        }
        if ((paramfloatW.val > 0.0F ? 0 : 1) != 0) {
          paramfloatW.val = Slamch.slamch("EpsMach");
        }
        np.val = (paramInt4 - paramInt2);
        nev0.val = paramInt2;
        i = 1;
        for (int j = (int)Math.pow(paramInt4, 2) + 8 * paramInt4 - 1 + 1; j > 0; j--)
        {
          paramArrayOfFloat4[(i - 1 + paramInt10)] = 0.0F;
          i += 1;
        }
        ldh = paramInt4;
        ldq = paramInt4;
        ih = 1;
        ritz = ih + 2 * ldh;
        bounds = ritz + paramInt4;
        iq = bounds + paramInt4;
        iw = iq + (int)Math.pow(paramInt4, 2);
        next = iw + 3 * paramInt4;
        paramArrayOfInt2[(4 - 1 + paramInt8)] = next;
        paramArrayOfInt2[(5 - 1 + paramInt8)] = ih;
        paramArrayOfInt2[(6 - 1 + paramInt8)] = ritz;
        paramArrayOfInt2[(7 - 1 + paramInt8)] = bounds;
        paramArrayOfInt2[(11 - 1 + paramInt8)] = iw;
      }
    }
    else
    {
      Ssaup2.ssaup2(paramintW1, paramString1, paramInt1, paramString2, nev0, np, paramfloatW.val, paramArrayOfFloat1, paramInt3, mode, iupd, ishift, mxiter, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat4, ih - 1 + paramInt10, ldh, paramArrayOfFloat4, ritz - 1 + paramInt10, paramArrayOfFloat4, bounds - 1 + paramInt10, paramArrayOfFloat4, iq - 1 + paramInt10, ldq, paramArrayOfFloat4, iw - 1 + paramInt10, paramArrayOfInt2, paramInt8, paramArrayOfFloat3, paramInt9, paramintW2);
      if ((paramintW1.val != 3 ? 0 : 1) != 0) {
        paramArrayOfInt1[(8 - 1 + paramInt7)] = np.val;
      }
      if ((paramintW1.val == 99 ? 0 : 1) == 0)
      {
        paramArrayOfInt1[(3 - 1 + paramInt7)] = mxiter.val;
        paramArrayOfInt1[(5 - 1 + paramInt7)] = np.val;
        paramArrayOfInt1[(9 - 1 + paramInt7)] = arpack_timing.nopx.val;
        paramArrayOfInt1[(10 - 1 + paramInt7)] = arpack_timing.nbx.val;
        paramArrayOfInt1[(11 - 1 + paramInt7)] = arpack_timing.nrorth.val;
        if ((paramintW2.val >= 0 ? 0 : 1) == 0)
        {
          if ((paramintW2.val != 2 ? 0 : 1) != 0) {
            paramintW2.val = 3;
          }
          if ((msglvl <= 0 ? 0 : 1) != 0)
          {
            ivout_adapter(arpack_debug.logfil.val, 1, mxiter, arpack_debug.ndigit.val, "_saupd: number of update iterations taken");
            ivout_adapter(arpack_debug.logfil.val, 1, np, arpack_debug.ndigit.val, "_saupd: number of \"converged\" Ritz values");
            Svout.svout(arpack_debug.logfil.val, np.val, paramArrayOfFloat4, ritz - 1 + paramInt10, arpack_debug.ndigit.val, "_saupd: final Ritz values");
            Svout.svout(arpack_debug.logfil.val, np.val, paramArrayOfFloat4, bounds - 1 + paramInt10, arpack_debug.ndigit.val, "_saupd: corresponding error bounds");
          }
          Second.second(t1);
          t1.val -= t0.val;
          if ((msglvl <= 0 ? 0 : 1) != 0)
          {
            localVector.clear();
            Util.f77write("//,5x,'==========================================',/5x,'= Symmetric implicit Arnoldi update code =',/5x,'= Version Number:',' 2.4',19x,' =',/5x,'= Version Date:  ',' 07/31/96',14x,' =',/5x,'==========================================',/5x,'= Summary of timing statistics           =',/5x,'==========================================',//", localVector);
            localVector.clear();
            localVector.addElement(new Integer(mxiter.val));
            localVector.addElement(new Integer(arpack_timing.nopx.val));
            localVector.addElement(new Integer(arpack_timing.nbx.val));
            localVector.addElement(new Integer(arpack_timing.nrorth.val));
            localVector.addElement(new Integer(arpack_timing.nitref.val));
            localVector.addElement(new Integer(arpack_timing.nrstrt.val));
            localVector.addElement(new Float(arpack_timing.tmvopx.val));
            localVector.addElement(new Float(arpack_timing.tmvbx.val));
            localVector.addElement(new Float(arpack_timing.tsaupd.val));
            localVector.addElement(new Float(arpack_timing.tsaup2.val));
            localVector.addElement(new Float(arpack_timing.tsaitr.val));
            localVector.addElement(new Float(arpack_timing.titref.val));
            localVector.addElement(new Float(arpack_timing.tgetv0.val));
            localVector.addElement(new Float(arpack_timing.tseigt.val));
            localVector.addElement(new Float(arpack_timing.tsgets.val));
            localVector.addElement(new Float(arpack_timing.tsapps.val));
            localVector.addElement(new Float(arpack_timing.tsconv.val));
            Util.f77write("5x,'Total number update iterations             = ',i5,/5x,'Total number of OP*x operations            = ',i5,/5x,'Total number of B*x operations             = ',i5,/5x,'Total number of reorthogonalization steps  = ',i5,/5x,'Total number of iterative refinement steps = ',i5,/5x,'Total number of restart steps              = ',i5,/5x,'Total time in user OP*x operation          = ',f12.6,/5X,'Total time in user B*x operation           = ',F12.6,/5X,'Total time in Arnoldi update routine       = ',F12.6,/5X,'Total time in saup2 routine                = ',F12.6,/5X,'Total time in basic Arnoldi iteration loop = ',F12.6,/5X,'Total time in reorthogonalization phase    = ',F12.6,/5X,'Total time in (re)start vector generation  = ',F12.6,/5X,'Total time in trid eigenvalue subproblem   = ',F12.6,/5X,'Total time in getting the shifts           = ',F12.6,/5X,'Total time in applying the shifts          = ',F12.6,/5X,'Total time in convergence testing          = ',F12.6", localVector);
          }
        }
      }
    }
  }
  
  private static void ivout_adapter(int paramInt1, int paramInt2, intW paramintW, int paramInt3, String paramString)
  {
    int[] arrayOfInt = { paramintW.val };
    Ivout.ivout(paramInt1, paramInt2, arrayOfInt, 0, paramInt3, paramString);
    paramintW.val = arrayOfInt[0];
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Ssaupd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */