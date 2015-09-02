package org.netlib.arpack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sscal;
import org.netlib.lapack.Slamch;
import org.netlib.lapack.Slascl;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssaitr
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
  public static float rnorm1 = 0.0F;
  public static float wnorm = 0.0F;
  public static float safmin = 0.0F;
  
  public static void ssaitr(intW paramintW1, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, floatW paramfloatW, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, int[] paramArrayOfInt, int paramInt10, float[] paramArrayOfFloat4, int paramInt11, intW paramintW2)
  {
    int i = 0;
    intW localintW = new intW(0);
    int k = 0;
    float f = 0.0F;
    float[] arrayOfFloat = new float[2];
    Etime.etime();
    if (first)
    {
      first = false;
      safmin = Slamch.slamch("safmin");
    }
    if ((paramintW1.val != 0 ? 0 : 1) != 0)
    {
      Second.second(t0);
      msglvl = arpack_debug.msaitr.val;
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
        break label932;
      }
      if (orth1) {
        break label1528;
      }
      if (orth2) {
        break label2081;
      }
      if (rstart) {}
    }
    for (;;)
    {
      if ((msglvl <= 2 ? 0 : 1) != 0)
      {
        ivout_adapter(arpack_debug.logfil.val, 1, j, arpack_debug.ndigit.val, "_saitr: generating Arnoldi vector no.");
        svout_adapter(arpack_debug.logfil.val, 1, paramfloatW, arpack_debug.ndigit.val, "_saitr: B-norm of the current residual =");
      }
      if ((paramfloatW.val <= 0.0F ? 0 : 1) == 0)
      {
        if ((msglvl <= 0 ? 0 : 1) != 0) {
          ivout_adapter(arpack_debug.logfil.val, 1, j, arpack_debug.ndigit.val, "_saitr: ****** restart at step ******");
        }
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
        arpack_timing.tsaitr.val += t1.val - t0.val;
        paramintW1.val = 99;
        break;
      }
      Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat2, 1 - 1 + (j.val - 1) * paramInt7 + paramInt6, 1);
      if ((paramfloatW.val < safmin ? 0 : 1) != 0)
      {
        f = 1.0F / paramfloatW.val;
        Sscal.sscal(paramInt1, f, paramArrayOfFloat2, 1 - 1 + (j.val - 1) * paramInt7 + paramInt6, 1);
        Sscal.sscal(paramInt1, f, paramArrayOfFloat4, ipj - 1 + paramInt11, 1);
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
      if ((paramInt4 != 2 ? 0 : 1) == 0)
      {
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
        label932:
        if (paramString.regionMatches(0, "G", 0, 1))
        {
          Second.second(t3);
          arpack_timing.tmvbx.val += t3.val - t2.val;
        }
        step4 = false;
      }
      if ((paramInt4 != 2 ? 0 : 1) != 0)
      {
        wnorm = Sdot.sdot(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat4, ivj - 1 + paramInt11, 1);
        wnorm = (float)Math.sqrt(Math.abs(wnorm));
      }
      else if (paramString.regionMatches(0, "G", 0, 1))
      {
        wnorm = Sdot.sdot(paramInt1, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat4, ipj - 1 + paramInt11, 1);
        wnorm = (float)Math.sqrt(Math.abs(wnorm));
      }
      else if (paramString.regionMatches(0, "I", 0, 1))
      {
        wnorm = Snrm2.snrm2(paramInt1, paramArrayOfFloat1, paramInt5, 1);
      }
      if ((paramInt4 == 2 ? 0 : 1) != 0) {
        Sgemv.sgemv("T", paramInt1, j.val, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, ipj - 1 + paramInt11, 1, 0.0F, paramArrayOfFloat4, irj - 1 + paramInt11, 1);
      } else if ((paramInt4 != 2 ? 0 : 1) != 0) {
        Sgemv.sgemv("T", paramInt1, j.val, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, ivj - 1 + paramInt11, 1, 0.0F, paramArrayOfFloat4, irj - 1 + paramInt11, 1);
      }
      Sgemv.sgemv("N", paramInt1, j.val, -1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, irj - 1 + paramInt11, 1, 1.0F, paramArrayOfFloat1, paramInt5, 1);
      paramArrayOfFloat3[(j.val - 1 + (2 - 1) * paramInt9 + paramInt8)] = paramArrayOfFloat4[(irj + j.val - 1 - 1 + paramInt11)];
      if ((j.val != 1 ? 0 : 1) == 0) {}
      if ((!rstart ? 0 : 1) != 0) {
        paramArrayOfFloat3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)] = 0.0F;
      } else {
        paramArrayOfFloat3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)] = paramfloatW.val;
      }
      Second.second(t4);
      orth1 = true;
      iter = 0;
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
      label1528:
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
      if ((paramfloatW.val <= 0.717F * wnorm ? 0 : 1) == 0)
      {
        arpack_timing.nrorth.val += 1;
        label2081:
        do
        {
          if ((msglvl <= 2 ? 0 : 1) != 0)
          {
            arrayOfFloat[(1 - 1)] = wnorm;
            arrayOfFloat[(2 - 1)] = paramfloatW.val;
            Svout.svout(arpack_debug.logfil.val, 2, arrayOfFloat, 0, arpack_debug.ndigit.val, "_saitr: re-orthonalization ; wnorm and rnorm are");
          }
          Sgemv.sgemv("T", paramInt1, j.val, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, ipj - 1 + paramInt11, 1, 0.0F, paramArrayOfFloat4, irj - 1 + paramInt11, 1);
          Sgemv.sgemv("N", paramInt1, j.val, -1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, irj - 1 + paramInt11, 1, 1.0F, paramArrayOfFloat1, paramInt5, 1);
          if ((j.val != 1 ? 0 : 1) == 0) {}
          if ((!rstart ? 0 : 1) != 0) {
            paramArrayOfFloat3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)] = 0.0F;
          }
          paramArrayOfFloat3[(j.val - 1 + (2 - 1) * paramInt9 + paramInt8)] += paramArrayOfFloat4[(irj + j.val - 1 - 1 + paramInt11)];
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
            ivout_adapter(arpack_debug.logfil.val, 1, j, arpack_debug.ndigit.val, "_saitr: Iterative refinement for Arnoldi residual");
            if ((msglvl <= 2 ? 0 : 1) != 0)
            {
              arrayOfFloat[(1 - 1)] = paramfloatW.val;
              arrayOfFloat[(2 - 1)] = rnorm1;
              Svout.svout(arpack_debug.logfil.val, 2, arrayOfFloat, 0, arpack_debug.ndigit.val, "_saitr: iterative refinement ; rnorm and rnorm1 are");
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
        for (int m = paramInt1 - 1 + 1; m > 0; m--)
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
      if ((paramArrayOfFloat3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)] >= 0.0F ? 0 : 1) != 0)
      {
        paramArrayOfFloat3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)] = (-paramArrayOfFloat3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)]);
        if ((j.val >= paramInt2 + paramInt3 ? 0 : 1) != 0) {
          Sscal.sscal(paramInt1, -1.0F, paramArrayOfFloat2, 1 - 1 + (j.val + 1 - 1) * paramInt7 + paramInt6, 1);
        } else {
          Sscal.sscal(paramInt1, -1.0F, paramArrayOfFloat1, paramInt5, 1);
        }
      }
      j.val += 1;
      if ((j.val <= paramInt2 + paramInt3 ? 0 : 1) != 0)
      {
        Second.second(t1);
        arpack_timing.tsaitr.val += t1.val - t0.val;
        paramintW1.val = 99;
        if ((msglvl <= 1 ? 0 : 1) != 0)
        {
          Svout.svout(arpack_debug.logfil.val, paramInt2 + paramInt3, paramArrayOfFloat3, 1 - 1 + (2 - 1) * paramInt9 + paramInt8, arpack_debug.ndigit.val, "_saitr: main diagonal of matrix H of step K+NP.");
          if ((paramInt2 + paramInt3 <= 1 ? 0 : 1) != 0) {
            Svout.svout(arpack_debug.logfil.val, paramInt2 + paramInt3 - 1, paramArrayOfFloat3, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, arpack_debug.ndigit.val, "_saitr: sub diagonal of matrix H of step K+NP.");
          }
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Ssaitr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */