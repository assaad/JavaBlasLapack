package org.netlib.arpack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dnrm2;
import org.netlib.blas.Dscal;
import org.netlib.lapack.Dlamch;
import org.netlib.lapack.Dlascl;
import org.netlib.util.Etime;
import org.netlib.util.doubleW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Dsaitr
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
  public static double rnorm1 = 0.0D;
  public static double wnorm = 0.0D;
  public static double safmin = 0.0D;
  
  public static void dsaitr(intW paramintW1, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, doubleW paramdoubleW, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, int[] paramArrayOfInt, int paramInt10, double[] paramArrayOfDouble4, int paramInt11, intW paramintW2)
  {
    int i = 0;
    intW localintW = new intW(0);
    int k = 0;
    double d = 0.0D;
    double[] arrayOfDouble = new double[2];
    Etime.etime();
    if (first)
    {
      first = false;
      safmin = Dlamch.dlamch("safmin");
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
        break label1525;
      }
      if (orth2) {
        break label2078;
      }
      if (rstart) {}
    }
    for (;;)
    {
      if ((msglvl <= 2 ? 0 : 1) != 0)
      {
        ivout_adapter(arpack_debug.logfil.val, 1, j, arpack_debug.ndigit.val, "_saitr: generating Arnoldi vector no.");
        dvout_adapter(arpack_debug.logfil.val, 1, paramdoubleW, arpack_debug.ndigit.val, "_saitr: B-norm of the current residual =");
      }
      if ((paramdoubleW.val <= 0.0D ? 0 : 1) == 0)
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
          Dgetv0.dgetv0(paramintW1, paramString, itry, false, paramInt1, j.val, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble1, paramInt5, paramdoubleW, paramArrayOfInt, paramInt10, paramArrayOfDouble4, paramInt11, ierr);
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
      Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble2, 1 - 1 + (j.val - 1) * paramInt7 + paramInt6, 1);
      if ((paramdoubleW.val < safmin ? 0 : 1) != 0)
      {
        d = 1.0D / paramdoubleW.val;
        Dscal.dscal(paramInt1, d, paramArrayOfDouble2, 1 - 1 + (j.val - 1) * paramInt7 + paramInt6, 1);
        Dscal.dscal(paramInt1, d, paramArrayOfDouble4, ipj - 1 + paramInt11, 1);
      }
      else
      {
        Dlascl.dlascl("General", i, i, paramdoubleW.val, 1.0D, paramInt1, 1, paramArrayOfDouble2, 1 - 1 + (j.val - 1) * paramInt7 + paramInt6, paramInt1, localintW);
        Dlascl.dlascl("General", i, i, paramdoubleW.val, 1.0D, paramInt1, 1, paramArrayOfDouble4, ipj - 1 + paramInt11, paramInt1, localintW);
      }
      step3 = true;
      arpack_timing.nopx.val += 1;
      Second.second(t2);
      Dcopy.dcopy(paramInt1, paramArrayOfDouble2, 1 - 1 + (j.val - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble4, ivj - 1 + paramInt11, 1);
      paramArrayOfInt[(1 - 1 + paramInt10)] = ivj;
      paramArrayOfInt[(2 - 1 + paramInt10)] = irj;
      paramArrayOfInt[(3 - 1 + paramInt10)] = ipj;
      paramintW1.val = 1;
      break;
      Second.second(t3);
      arpack_timing.tmvopx.val += t3.val - t2.val;
      step3 = false;
      Dcopy.dcopy(paramInt1, paramArrayOfDouble4, irj - 1 + paramInt11, 1, paramArrayOfDouble1, paramInt5, 1);
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
          Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble4, ipj - 1 + paramInt11, 1);
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
        wnorm = Ddot.ddot(paramInt1, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble4, ivj - 1 + paramInt11, 1);
        wnorm = Math.sqrt(Math.abs(wnorm));
      }
      else if (paramString.regionMatches(0, "G", 0, 1))
      {
        wnorm = Ddot.ddot(paramInt1, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble4, ipj - 1 + paramInt11, 1);
        wnorm = Math.sqrt(Math.abs(wnorm));
      }
      else if (paramString.regionMatches(0, "I", 0, 1))
      {
        wnorm = Dnrm2.dnrm2(paramInt1, paramArrayOfDouble1, paramInt5, 1);
      }
      if ((paramInt4 == 2 ? 0 : 1) != 0) {
        Dgemv.dgemv("T", paramInt1, j.val, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, ipj - 1 + paramInt11, 1, 0.0D, paramArrayOfDouble4, irj - 1 + paramInt11, 1);
      } else if ((paramInt4 != 2 ? 0 : 1) != 0) {
        Dgemv.dgemv("T", paramInt1, j.val, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, ivj - 1 + paramInt11, 1, 0.0D, paramArrayOfDouble4, irj - 1 + paramInt11, 1);
      }
      Dgemv.dgemv("N", paramInt1, j.val, -1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, irj - 1 + paramInt11, 1, 1.0D, paramArrayOfDouble1, paramInt5, 1);
      paramArrayOfDouble3[(j.val - 1 + (2 - 1) * paramInt9 + paramInt8)] = paramArrayOfDouble4[(irj + j.val - 1 - 1 + paramInt11)];
      if ((j.val != 1 ? 0 : 1) == 0) {}
      if ((!rstart ? 0 : 1) != 0) {
        paramArrayOfDouble3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)] = 0.0D;
      } else {
        paramArrayOfDouble3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)] = paramdoubleW.val;
      }
      Second.second(t4);
      orth1 = true;
      iter = 0;
      Second.second(t2);
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        arpack_timing.nbx.val += 1;
        Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble4, irj - 1 + paramInt11, 1);
        paramArrayOfInt[(1 - 1 + paramInt10)] = irj;
        paramArrayOfInt[(2 - 1 + paramInt10)] = ipj;
        paramintW1.val = 2;
        break;
      }
      if (paramString.regionMatches(0, "I", 0, 1)) {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble4, ipj - 1 + paramInt11, 1);
      }
      label1525:
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        Second.second(t3);
        arpack_timing.tmvbx.val += t3.val - t2.val;
      }
      orth1 = false;
      if (paramString.regionMatches(0, "G", 0, 1))
      {
        paramdoubleW.val = Ddot.ddot(paramInt1, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble4, ipj - 1 + paramInt11, 1);
        paramdoubleW.val = Math.sqrt(Math.abs(paramdoubleW.val));
      }
      else if (paramString.regionMatches(0, "I", 0, 1))
      {
        paramdoubleW.val = Dnrm2.dnrm2(paramInt1, paramArrayOfDouble1, paramInt5, 1);
      }
      if ((paramdoubleW.val <= 0.717F * wnorm ? 0 : 1) == 0)
      {
        arpack_timing.nrorth.val += 1;
        label2078:
        do
        {
          if ((msglvl <= 2 ? 0 : 1) != 0)
          {
            arrayOfDouble[(1 - 1)] = wnorm;
            arrayOfDouble[(2 - 1)] = paramdoubleW.val;
            Dvout.dvout(arpack_debug.logfil.val, 2, arrayOfDouble, 0, arpack_debug.ndigit.val, "_saitr: re-orthonalization ; wnorm and rnorm are");
          }
          Dgemv.dgemv("T", paramInt1, j.val, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, ipj - 1 + paramInt11, 1, 0.0D, paramArrayOfDouble4, irj - 1 + paramInt11, 1);
          Dgemv.dgemv("N", paramInt1, j.val, -1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, irj - 1 + paramInt11, 1, 1.0D, paramArrayOfDouble1, paramInt5, 1);
          if ((j.val != 1 ? 0 : 1) == 0) {}
          if ((!rstart ? 0 : 1) != 0) {
            paramArrayOfDouble3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)] = 0.0D;
          }
          paramArrayOfDouble3[(j.val - 1 + (2 - 1) * paramInt9 + paramInt8)] += paramArrayOfDouble4[(irj + j.val - 1 - 1 + paramInt11)];
          orth2 = true;
          Second.second(t2);
          if (paramString.regionMatches(0, "G", 0, 1))
          {
            arpack_timing.nbx.val += 1;
            Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble4, irj - 1 + paramInt11, 1);
            paramArrayOfInt[(1 - 1 + paramInt10)] = irj;
            paramArrayOfInt[(2 - 1 + paramInt10)] = ipj;
            paramintW1.val = 2;
            return;
          }
          if (paramString.regionMatches(0, "I", 0, 1)) {
            Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble4, ipj - 1 + paramInt11, 1);
          }
          if (paramString.regionMatches(0, "G", 0, 1))
          {
            Second.second(t3);
            arpack_timing.tmvbx.val += t3.val - t2.val;
          }
          if (paramString.regionMatches(0, "G", 0, 1))
          {
            rnorm1 = Ddot.ddot(paramInt1, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble4, ipj - 1 + paramInt11, 1);
            rnorm1 = Math.sqrt(Math.abs(rnorm1));
          }
          else if (paramString.regionMatches(0, "I", 0, 1))
          {
            rnorm1 = Dnrm2.dnrm2(paramInt1, paramArrayOfDouble1, paramInt5, 1);
          }
          if ((msglvl <= 0 ? 0 : 1) != 0) {}
          if (((iter <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            ivout_adapter(arpack_debug.logfil.val, 1, j, arpack_debug.ndigit.val, "_saitr: Iterative refinement for Arnoldi residual");
            if ((msglvl <= 2 ? 0 : 1) != 0)
            {
              arrayOfDouble[(1 - 1)] = paramdoubleW.val;
              arrayOfDouble[(2 - 1)] = rnorm1;
              Dvout.dvout(arpack_debug.logfil.val, 2, arrayOfDouble, 0, arpack_debug.ndigit.val, "_saitr: iterative refinement ; rnorm and rnorm1 are");
            }
          }
          if ((rnorm1 <= 0.717F * paramdoubleW.val ? 0 : 1) != 0)
          {
            paramdoubleW.val = rnorm1;
            break;
          }
          arpack_timing.nitref.val += 1;
          paramdoubleW.val = rnorm1;
          iter += 1;
        } while ((iter > 1 ? 0 : 1) != 0);
        k = 1;
        for (int m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble1[(k - 1 + paramInt5)] = 0.0D;
          k += 1;
        }
        paramdoubleW.val = 0.0D;
      }
      rstart = false;
      orth2 = false;
      Second.second(t5);
      arpack_timing.titref.val += t5.val - t4.val;
      if ((paramArrayOfDouble3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)] >= 0.0D ? 0 : 1) != 0)
      {
        paramArrayOfDouble3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)] = (-paramArrayOfDouble3[(j.val - 1 + (1 - 1) * paramInt9 + paramInt8)]);
        if ((j.val >= paramInt2 + paramInt3 ? 0 : 1) != 0) {
          Dscal.dscal(paramInt1, -1.0D, paramArrayOfDouble2, 1 - 1 + (j.val + 1 - 1) * paramInt7 + paramInt6, 1);
        } else {
          Dscal.dscal(paramInt1, -1.0D, paramArrayOfDouble1, paramInt5, 1);
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
          Dvout.dvout(arpack_debug.logfil.val, paramInt2 + paramInt3, paramArrayOfDouble3, 1 - 1 + (2 - 1) * paramInt9 + paramInt8, arpack_debug.ndigit.val, "_saitr: main diagonal of matrix H of step K+NP.");
          if ((paramInt2 + paramInt3 <= 1 ? 0 : 1) != 0) {
            Dvout.dvout(arpack_debug.logfil.val, paramInt2 + paramInt3 - 1, paramArrayOfDouble3, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, arpack_debug.ndigit.val, "_saitr: sub diagonal of matrix H of step K+NP.");
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
  
  private static void dvout_adapter(int paramInt1, int paramInt2, doubleW paramdoubleW, int paramInt3, String paramString)
  {
    double[] arrayOfDouble = { paramdoubleW.val };
    Dvout.dvout(paramInt1, paramInt2, arrayOfDouble, 0, paramInt3, paramString);
    paramdoubleW.val = arrayOfDouble[0];
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dsaitr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */