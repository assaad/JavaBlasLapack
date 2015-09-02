package org.netlib.arpack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sscal;
import org.netlib.lapack.Slabad;
import org.netlib.lapack.Slamch;
import org.netlib.lapack.Slanhs;
import org.netlib.lapack.Slascl;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Snaitr
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static floatW t2 = new floatW(0.0F);
  public static floatW t3 = new floatW(0.0F);
  public static floatW t4 = new floatW(0.0F);
  public static floatW t5 = new floatW(0.0F);
  public static boolean first = true;
  public static boolean orth1 = false;
  public static boolean orth2 = false;
  public static boolean rstart = false;
  public static boolean step3 = false;
  public static boolean step4 = false;
  public static intW ierr = new intW(0);
  public static int ipj = 0;
  public static int irj = 0;
  public static int ivj = 0;
  public static int iter = 0;
  public static int itry = 0;
  public static intW j = new intW(0);
  public static int msglvl = 0;
  public static float betaj = 0.0F;
  public static floatW ovfl = new floatW(0.0F);
  public static float rnorm1 = 0.0F;
  public static float smlnum = 0.0F;
  public static float ulp = 0.0F;
  public static floatW unfl = new floatW(0.0F);
  public static float wnorm = 0.0F;
  
  public static void snaitr(intW paramintW1, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, floatW paramfloatW, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, int[] paramArrayOfInt, int paramInt10, float[] paramArrayOfFloat4, int paramInt11, intW paramintW2)
  {
    int i = 0;
    intW localintW = new intW(0);
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float[] arrayOfFloat = new float[2];
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
    if ((paramintW1.val != 0 ? 0 : 1) != 0)
    {
      Second.second(t0);
      msglvl = arpack_debug.mnaitr.val;
      paramintW2.val = 0;
      step3 = false;
      step4 = false;
      rstart = false;
      orth1 = false;
      orth2 = false;
      j.val = (paramInt2 + 1);
      ipj = 1;
      irj = ipj + paramInt1;
      ivj = irj + paramInt1;
    }
    if (!step3)
    {
      if (step4) {
        break label983;
      }
      if (orth1) {
        break label1390;
      }
      if (orth2) {
        break label1918;
      }
      if (rstart) {}
    }
    for (;;)
    {
      if ((msglvl <= 1 ? 0 : 1) != 0)
      {
        ivout_adapter(arpack_debug.logfil.val, 1, j, arpack_debug.ndigit.val, "_naitr: generating Arnoldi vector number");
        svout_adapter(arpack_debug.logfil.val, 1, paramfloatW, arpack_debug.ndigit.val, "_naitr: B-norm of the current residual is");
      }
      betaj = paramfloatW.val;
      if ((paramfloatW.val <= 0.0F ? 0 : 1) == 0)
      {
        if ((msglvl <= 0 ? 0 : 1) != 0) {
          ivout_adapter(arpack_debug.logfil.val, 1, j, arpack_debug.ndigit.val, "_naitr: ****** RESTART AT STEP ******");
        }
        betaj = 0.0F;
        arpack_timing.nrstrt.val += 1;
        itry = 1;
        do
        {
          rstart = true;
          paramintW1.val = 0;
          Sgetv0.sgetv0(paramintW1, paramString, itry, false, paramInt1, j.val, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat1, paramInt5, paramfloatW, paramArrayOfInt, paramInt10, paramArrayOfFloat4, paramInt11, ierr);
          if ((paramintW1.val == 99 ? 0 : 1) != 0) {
            return;
          }
          if ((ierr.val >= 0 ? 0 : 1) == 0) {
            break;
          }
          itry += 1;
        } while ((itry > 3 ? 0 : 1) != 0);
        paramintW2.val = (j.val - 1);
        Second.second(t1);
        arpack_timing.tnaitr.val += t1.val - t0.val;
        paramintW1.val = 99;
        break;
      }
      Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat2, 1 - 1 + (j.val - 1) * paramInt7 + paramInt6, 1);
      if ((paramfloatW.val < unfl.val ? 0 : 1) != 0)
      {
        f1 = 1.0F / paramfloatW.val;
        Sscal.sscal(paramInt1, f1, paramArrayOfFloat2, 1 - 1 + (j.val - 1) * paramInt7 + paramInt6, 1);
        Sscal.sscal(paramInt1, f1, paramArrayOfFloat4, ipj - 1 + paramInt11, 1);
      }
      else
      {
        Slascl.slascl("General", i, i, paramfloatW.val, 1.0F, paramInt1, 1, paramArrayOfFloat2, 1 - 1 + (j.val - 1) * paramInt7 + paramInt6, paramInt1, localintW);
        Slascl.slascl("General", i, i, paramfloatW.val, 1.0F, paramInt1, 1, paramArrayOfFloat4, ipj - 1 + paramInt11, paramInt1, localintW);
      }
      step3 = true;
      arpack_timing.nopx.val += 1;
      Second.second(t2);
      Scopy.scopy(paramInt1, paramArrayOfFloat2, 1 - 1 + (j.val - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat4, ivj - 1 + paramInt11, 1);
      paramArrayOfInt[(1 - 1 + paramInt10)] = ivj;
      paramArrayOfInt[(2 - 1 + paramInt10)] = irj;
      paramArrayOfInt[(3 - 1 + paramInt10)] = ipj;
      paramintW1.val = 1;
      break;
      Second.second(t3);
      arpack_timing.tmvopx.val += t3.val - t2.val;
      step3 = false;
      Scopy.scopy(paramInt1, paramArrayOfFloat4, irj - 1 + paramInt11, 1, paramArrayOfFloat1, paramInt5, 1);
      Second.second(t2);
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        arpack_timing.nbx.val += 1;
        step4 = true;
        paramArrayOfInt[(1 - 1 + paramInt10)] = irj;
        paramArrayOfInt[(2 - 1 + paramInt10)] = ipj;
        paramintW1.val = 2;
        break;
      }
      if (paramString.regionMatches(0, "I", 0, 1)) {
        Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat4, ipj - 1 + paramInt11, 1);
      }
      label983:
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        Second.second(t3);
        arpack_timing.tmvbx.val += t3.val - t2.val;
      }
      step4 = false;
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        wnorm = Sdot.sdot(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat4, ipj - 1 + paramInt11, 1);
        wnorm = (float)Math.sqrt(Math.abs(wnorm));
      }
      else if (paramString.regionMatches(0, "I", 0, 1))
      {
        wnorm = Snrm2.snrm2(paramInt1, paramArrayOfFloat1, paramInt5, 1);
      }
      Sgemv.sgemv("T", paramInt1, j.val, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, ipj - 1 + paramInt11, 1, 0.0F, paramArrayOfFloat3, 1 - 1 + (j.val - 1) * paramInt9 + paramInt8, 1);
      Sgemv.sgemv("N", paramInt1, j.val, -1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, 1 - 1 + (j.val - 1) * paramInt9 + paramInt8, 1, 1.0F, paramArrayOfFloat1, paramInt5, 1);
      if ((j.val <= 1 ? 0 : 1) != 0) {
        paramArrayOfFloat3[(j.val - 1 + (j.val - 1 - 1) * paramInt9 + paramInt8)] = betaj;
      }
      Second.second(t4);
      orth1 = true;
      Second.second(t2);
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        arpack_timing.nbx.val += 1;
        Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat4, irj - 1 + paramInt11, 1);
        paramArrayOfInt[(1 - 1 + paramInt10)] = irj;
        paramArrayOfInt[(2 - 1 + paramInt10)] = ipj;
        paramintW1.val = 2;
        break;
      }
      if (paramString.regionMatches(0, "I", 0, 1)) {
        Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat4, ipj - 1 + paramInt11, 1);
      }
      label1390:
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        Second.second(t3);
        arpack_timing.tmvbx.val += t3.val - t2.val;
      }
      orth1 = false;
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        paramfloatW.val = Sdot.sdot(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat4, ipj - 1 + paramInt11, 1);
        paramfloatW.val = ((float)Math.sqrt(Math.abs(paramfloatW.val)));
      }
      else if (paramString.regionMatches(0, "I", 0, 1))
      {
        paramfloatW.val = Snrm2.snrm2(paramInt1, paramArrayOfFloat1, paramInt5, 1);
      }
      label1918:
      int m;
      if ((paramfloatW.val <= 0.717F * wnorm ? 0 : 1) == 0)
      {
        iter = 0;
        arpack_timing.nrorth.val += 1;
        do
        {
          if ((msglvl <= 2 ? 0 : 1) != 0)
          {
            arrayOfFloat[(1 - 1)] = wnorm;
            arrayOfFloat[(2 - 1)] = paramfloatW.val;
            Svout.svout(arpack_debug.logfil.val, 2, arrayOfFloat, 0, arpack_debug.ndigit.val, "_naitr: re-orthonalization; wnorm and rnorm are");
            Svout.svout(arpack_debug.logfil.val, j.val, paramArrayOfFloat3, 1 - 1 + (j.val - 1) * paramInt9 + paramInt8, arpack_debug.ndigit.val, "_naitr: j-th column of H");
          }
          Sgemv.sgemv("T", paramInt1, j.val, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, ipj - 1 + paramInt11, 1, 0.0F, paramArrayOfFloat4, irj - 1 + paramInt11, 1);
          Sgemv.sgemv("N", paramInt1, j.val, -1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, irj - 1 + paramInt11, 1, 1.0F, paramArrayOfFloat1, paramInt5, 1);
          Saxpy.saxpy(j.val, 1.0F, paramArrayOfFloat4, irj - 1 + paramInt11, 1, paramArrayOfFloat3, 1 - 1 + (j.val - 1) * paramInt9 + paramInt8, 1);
          orth2 = true;
          Second.second(t2);
          if (paramString.regionMatches(0, "G", 0, 1))
          {
            arpack_timing.nbx.val += 1;
            Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat4, irj - 1 + paramInt11, 1);
            paramArrayOfInt[(1 - 1 + paramInt10)] = irj;
            paramArrayOfInt[(2 - 1 + paramInt10)] = ipj;
            paramintW1.val = 2;
            return;
          }
          if (paramString.regionMatches(0, "I", 0, 1)) {
            Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat4, ipj - 1 + paramInt11, 1);
          }
          if (paramString.regionMatches(0, "G", 0, 1))
          {
            Second.second(t3);
            arpack_timing.tmvbx.val += t3.val - t2.val;
          }
          if (paramString.regionMatches(0, "G", 0, 1))
          {
            rnorm1 = Sdot.sdot(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat4, ipj - 1 + paramInt11, 1);
            rnorm1 = (float)Math.sqrt(Math.abs(rnorm1));
          }
          else if (paramString.regionMatches(0, "I", 0, 1))
          {
            rnorm1 = Snrm2.snrm2(paramInt1, paramArrayOfFloat1, paramInt5, 1);
          }
          if ((msglvl <= 0 ? 0 : 1) != 0) {}
          if (((iter <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            ivout_adapter(arpack_debug.logfil.val, 1, j, arpack_debug.ndigit.val, "_naitr: Iterative refinement for Arnoldi residual");
            if ((msglvl <= 2 ? 0 : 1) != 0)
            {
              arrayOfFloat[(1 - 1)] = paramfloatW.val;
              arrayOfFloat[(2 - 1)] = rnorm1;
              Svout.svout(arpack_debug.logfil.val, 2, arrayOfFloat, 0, arpack_debug.ndigit.val, "_naitr: iterative refinement ; rnorm and rnorm1 are");
            }
          }
          if ((rnorm1 <= 0.717F * paramfloatW.val ? 0 : 1) != 0)
          {
            paramfloatW.val = rnorm1;
            break;
          }
          arpack_timing.nitref.val += 1;
          paramfloatW.val = rnorm1;
          iter += 1;
        } while ((iter > 1 ? 0 : 1) != 0);
        k = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat1[(k - 1 + paramInt5)] = 0.0F;
          k += 1;
        }
        paramfloatW.val = 0.0F;
      }
      rstart = false;
      orth2 = false;
      Second.second(t5);
      arpack_timing.titref.val += t5.val - t4.val;
      j.val += 1;
      if ((j.val <= paramInt2 + paramInt3 ? 0 : 1) != 0)
      {
        Second.second(t1);
        arpack_timing.tnaitr.val += t1.val - t0.val;
        paramintW1.val = 99;
        i = Math.max(1, paramInt2);
        for (m = paramInt2 + paramInt3 - 1 - Math.max(1, paramInt2) + 1; m > 0; m--)
        {
          f2 = Math.abs(paramArrayOfFloat3[(i - 1 + (i - 1) * paramInt9 + paramInt8)]) + Math.abs(paramArrayOfFloat3[(i + 1 - 1 + (i + 1 - 1) * paramInt9 + paramInt8)]);
          if ((f2 != 0.0F ? 0 : 1) != 0) {
            f2 = Slanhs.slanhs("1", paramInt2 + paramInt3, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat4, paramInt1 + 1 - 1 + paramInt11);
          }
          if ((Math.abs(paramArrayOfFloat3[(i + 1 - 1 + (i - 1) * paramInt9 + paramInt8)]) > Math.max(ulp * f2, smlnum) ? 0 : 1) != 0) {
            paramArrayOfFloat3[(i + 1 - 1 + (i - 1) * paramInt9 + paramInt8)] = 0.0F;
          }
          i += 1;
        }
        if ((msglvl <= 2 ? 0 : 1) != 0) {
          Smout.smout(arpack_debug.logfil.val, paramInt2 + paramInt3, paramInt2 + paramInt3, paramArrayOfFloat3, paramInt8, paramInt9, arpack_debug.ndigit.val, "_naitr: Final upper Hessenberg matrix H of order K+NP");
        }
        break;
      }
    }
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Snaitr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */