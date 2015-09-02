package org.netlib.arpack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dger;
import org.netlib.blas.Dnrm2;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dtrmm;
import org.netlib.lapack.Dgeqr2;
import org.netlib.lapack.Dlacpy;
import org.netlib.lapack.Dlahqr;
import org.netlib.lapack.Dlamch;
import org.netlib.lapack.Dlapy2;
import org.netlib.lapack.Dlaset;
import org.netlib.lapack.Dorm2r;
import org.netlib.lapack.Dtrevc;
import org.netlib.lapack.Dtrsen;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dneupd
{
  public static float t0 = 0.0F;
  public static float t1 = 0.0F;
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void dneupd(boolean paramBoolean, String paramString1, boolean[] paramArrayOfBoolean, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, int paramInt5, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble4, int paramInt6, String paramString2, int paramInt7, String paramString3, intW paramintW1, double paramDouble3, double[] paramArrayOfDouble5, int paramInt8, int paramInt9, double[] paramArrayOfDouble6, int paramInt10, int paramInt11, int[] paramArrayOfInt1, int paramInt12, int[] paramArrayOfInt2, int paramInt13, double[] paramArrayOfDouble7, int paramInt14, double[] paramArrayOfDouble8, int paramInt15, int paramInt16, intW paramintW2)
  {
    String str = new String("      ");
    int i = 0;
    intW localintW1 = new intW(0);
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    intW localintW2 = new intW(0);
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int[] arrayOfInt = new int[1];
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    intW localintW3 = new intW(0);
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
    intW localintW4 = new intW(0);
    intW localintW5 = new intW(0);
    int i19 = 0;
    int i20 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d2 = 0.0D;
    double[] arrayOfDouble = new double[1 * 1];
    double d3 = 0.0D;
    double d4 = 0.0D;
    i10 = arpack_debug.mneupd.val;
    i9 = paramArrayOfInt1[(7 - 1 + paramInt12)];
    localintW2.val = paramArrayOfInt1[(5 - 1 + paramInt12)];
    paramintW2.val = 0;
    d4 = Dlamch.dlamch("Epsilon-Machine");
    d4 = Math.pow(d4, 2.0D / 3.0D);
    localintW1.val = 0;
    if ((localintW2.val > 0 ? 0 : 1) != 0)
    {
      localintW1.val = -14;
    }
    else if ((paramInt7 > 0 ? 0 : 1) != 0)
    {
      localintW1.val = -1;
    }
    else if ((paramintW1.val > 0 ? 0 : 1) != 0)
    {
      localintW1.val = -2;
    }
    else
    {
      if ((paramInt9 > paramintW1.val + 1 ? 0 : 1) == 0) {}
      if (((paramInt9 <= paramInt7 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        localintW1.val = -3;
      }
      else
      {
        if ((((paramString3.regionMatches(0, "LM", 0, 2) ^ true)) && ((paramString3.regionMatches(0, "SM", 0, 2) ^ true)) ? 1 : 0) != 0) {}
        if (((paramString3.regionMatches(0, "LR", 0, 2) ^ true) ? 1 : 0) != 0) {}
        if (((paramString3.regionMatches(0, "SR", 0, 2) ^ true) ? 1 : 0) != 0) {}
        if (((paramString3.regionMatches(0, "LI", 0, 2) ^ true) ? 1 : 0) != 0) {}
        if (((paramString3.regionMatches(0, "SI", 0, 2) ^ true) ? 1 : 0) != 0)
        {
          localintW1.val = -5;
        }
        else if ((((paramString2.regionMatches(0, "I", 0, 1) ^ true)) && ((paramString2.regionMatches(0, "G", 0, 1) ^ true)) ? 1 : 0) != 0)
        {
          localintW1.val = -6;
        }
        else if ((paramInt16 >= 3 * (int)Math.pow(paramInt9, 2) + 6 * paramInt9 ? 0 : 1) != 0)
        {
          localintW1.val = -7;
        }
        else
        {
          if ((((paramString1.regionMatches(0, "A", 0, 1) ^ true)) && ((paramString1.regionMatches(0, "P", 0, 1) ^ true)) ? 1 : 0) != 0) {}
          if (((paramString1.regionMatches(0, "S", 0, 1) ^ true) ? 1 : 0) != 0) {}
          if ((paramBoolean ? 1 : 0) != 0) {
            localintW1.val = -13;
          } else if (paramString1.regionMatches(0, "S", 0, 1)) {
            localintW1.val = -12;
          }
        }
      }
    }
    if ((i9 != 1 ? 0 : 1) == 0) {}
    if (((i9 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      str = "REGULR";
    }
    else
    {
      if ((i9 != 3 ? 0 : 1) != 0) {}
      if (((paramDouble2 != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
        str = "SHIFTI";
      } else if ((i9 != 3 ? 0 : 1) != 0) {
        str = "REALPT";
      } else if ((i9 != 4 ? 0 : 1) != 0) {
        str = "IMAGPT";
      } else {
        localintW1.val = -10;
      }
    }
    if ((i9 != 1 ? 0 : 1) != 0) {}
    if ((paramString2.regionMatches(0, "G", 0, 1) ? 1 : 0) != 0) {
      localintW1.val = -11;
    }
    if ((localintW1.val == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = localintW1.val;
    }
    else
    {
      j = paramArrayOfInt2[(5 - 1 + paramInt13)];
      i11 = paramArrayOfInt2[(6 - 1 + paramInt13)];
      i12 = paramArrayOfInt2[(7 - 1 + paramInt13)];
      i = paramArrayOfInt2[(8 - 1 + paramInt13)];
      i7 = paramInt9;
      i8 = paramInt9;
      m = i + i7;
      n = m + i7;
      k = n + i7;
      i3 = k + i7;
      i2 = i3 + i7 * paramInt9;
      paramArrayOfInt2[(9 - 1 + paramInt13)] = m;
      paramArrayOfInt2[(10 - 1 + paramInt13)] = n;
      paramArrayOfInt2[(11 - 1 + paramInt13)] = k;
      paramArrayOfInt2[(12 - 1 + paramInt13)] = i3;
      paramArrayOfInt2[(13 - 1 + paramInt13)] = i2;
      i14 = 1;
      i13 = paramInt9 + 1;
      i4 = i13 + paramInt9;
      i15 = paramArrayOfInt2[(14 - 1 + paramInt13)] + paramInt9 * paramInt9;
      i16 = i15 + paramInt9;
      i17 = i16 + paramInt9;
      d1 = paramArrayOfDouble8[(j + 2 - 1 + paramInt15)];
      paramArrayOfDouble8[(j + 2 - 1 + paramInt15)] = 0.0D;
      if ((i10 <= 2 ? 0 : 1) != 0)
      {
        Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, i15 - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Real part of Ritz values passed in from _NAUPD.");
        Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, i16 - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Imag part of Ritz values passed in from _NAUPD.");
        Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, i17 - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Ritz estimates passed in from _NAUPD.");
      }
      int i21;
      if (paramBoolean)
      {
        i20 = 0;
        i5 = 1;
        for (i21 = paramInt9 - 1 + 1; i21 > 0; i21--)
        {
          paramArrayOfDouble8[(i + i5 - 1 - 1 + paramInt15)] = i5;
          paramArrayOfBoolean[(i5 - 1 + paramInt1)] = false;
          i5 += 1;
        }
        localintW5.val = (paramInt9 - paramintW1.val);
        i18 = 0;
        Dngets.dngets(i18, paramString3, paramintW1, localintW5, paramArrayOfDouble8, i15 - 1 + paramInt15, paramArrayOfDouble8, i16 - 1 + paramInt15, paramArrayOfDouble8, i - 1 + paramInt15, paramArrayOfDouble8, paramInt15, paramArrayOfDouble8, localintW5.val + 1 - 1 + paramInt15);
        if ((i10 <= 2 ? 0 : 1) != 0)
        {
          Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, i15 - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Real part of Ritz values after calling _NGETS.");
          Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, i16 - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Imag part of Ritz values after calling _NGETS.");
          Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, i - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Ritz value indices after calling _NGETS.");
        }
        localintW4.val = 0;
        i5 = 1;
        for (i21 = paramInt9 - 1 + 1; i21 > 0; i21--)
        {
          d3 = Math.max(d4, Dlapy2.dlapy2(paramArrayOfDouble8[(i15 + paramInt9 - i5 - 1 + paramInt15)], paramArrayOfDouble8[(i16 + paramInt9 - i5 - 1 + paramInt15)]));
          i19 = (int)paramArrayOfDouble8[(i + paramInt9 - i5 - 1 + paramInt15)];
          if ((localintW4.val >= localintW2.val ? 0 : 1) != 0) {}
          if (((paramArrayOfDouble8[(i17 + i19 - 1 - 1 + paramInt15)] > paramDouble3 * d3 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            paramArrayOfBoolean[(i19 - 1 + paramInt1)] = true;
            localintW4.val += 1;
            if ((i19 <= paramintW1.val ? 0 : 1) != 0) {
              i20 = 1;
            }
          }
          i5 += 1;
        }
        if ((i10 <= 2 ? 0 : 1) != 0)
        {
          ivout_adapter(arpack_debug.logfil.val, 1, localintW4, arpack_debug.ndigit.val, "_neupd: Number of specified eigenvalues");
          ivout_adapter(arpack_debug.logfil.val, 1, localintW2, arpack_debug.ndigit.val, "_neupd: Number of \"converged\" eigenvalues");
        }
        if ((localintW4.val == localintW2.val ? 0 : 1) != 0)
        {
          paramintW2.val = -15;
          return;
        }
        Dcopy.dcopy(i7 * paramInt9, paramArrayOfDouble8, j - 1 + paramInt15, 1, paramArrayOfDouble8, i3 - 1 + paramInt15, 1);
        Dlaset.dlaset("All", paramInt9, paramInt9, 0.0D, 1.0D, paramArrayOfDouble8, i2 - 1 + paramInt15, i8);
        Dlahqr.dlahqr(true, true, paramInt9, 1, paramInt9, paramArrayOfDouble8, i3 - 1 + paramInt15, i7, paramArrayOfDouble8, m - 1 + paramInt15, paramArrayOfDouble8, n - 1 + paramInt15, 1, paramInt9, paramArrayOfDouble8, i2 - 1 + paramInt15, i8, localintW1);
        Dcopy.dcopy(paramInt9, paramArrayOfDouble8, i2 + paramInt9 - 1 - 1 + paramInt15, i8, paramArrayOfDouble8, k - 1 + paramInt15, 1);
        if ((localintW1.val == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -8;
          return;
        }
        if ((i10 <= 1 ? 0 : 1) != 0)
        {
          Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, m - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Real part of the eigenvalues of H");
          Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, n - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Imaginary part of the Eigenvalues of H");
          Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, k - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Last row of the Schur vector matrix");
          if ((i10 <= 3 ? 0 : 1) != 0) {
            Dmout.dmout(arpack_debug.logfil.val, paramInt9, paramInt9, paramArrayOfDouble8, i3 - 1 + paramInt15, i7, arpack_debug.ndigit.val, "_neupd: The upper quasi-triangular matrix ");
          }
        }
        if (i20 != 0)
        {
          Dtrsen.dtrsen("None", "V", paramArrayOfBoolean, paramInt1, paramInt9, paramArrayOfDouble8, i3 - 1 + paramInt15, i7, paramArrayOfDouble8, i2 - 1 + paramInt15, i8, paramArrayOfDouble8, m - 1 + paramInt15, paramArrayOfDouble8, n - 1 + paramInt15, localintW2, localdoubleW1, localdoubleW2, paramArrayOfDouble8, k - 1 + paramInt15, paramInt9, arrayOfInt, 0, 1, localintW1);
          if ((localintW1.val != 1 ? 0 : 1) != 0)
          {
            paramintW2.val = 1;
            return;
          }
          if ((i10 <= 2 ? 0 : 1) != 0)
          {
            Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, m - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Real part of the eigenvalues of H--reordered");
            Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, n - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Imag part of the eigenvalues of H--reordered");
            if ((i10 <= 3 ? 0 : 1) != 0) {
              Dmout.dmout(arpack_debug.logfil.val, paramInt9, paramInt9, paramArrayOfDouble8, i3 - 1 + paramInt15, i8, arpack_debug.ndigit.val, "_neupd: Quasi-triangular matrix after re-ordering");
            }
          }
        }
        Dcopy.dcopy(paramInt9, paramArrayOfDouble8, i2 + paramInt9 - 1 - 1 + paramInt15, i8, paramArrayOfDouble8, k - 1 + paramInt15, 1);
        if (str.regionMatches(0, "REGULR", 0, 6))
        {
          Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, m - 1 + paramInt15, 1, paramArrayOfDouble1, paramInt2, 1);
          Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, n - 1 + paramInt15, 1, paramArrayOfDouble2, paramInt3, 1);
        }
        Dgeqr2.dgeqr2(paramInt9, localintW2.val, paramArrayOfDouble8, i2 - 1 + paramInt15, i8, paramArrayOfDouble4, paramInt6, paramArrayOfDouble4, paramInt9 + 1 - 1 + paramInt6, localintW1);
        Dorm2r.dorm2r("Right", "Notranspose", paramInt7, paramInt9, localintW2.val, paramArrayOfDouble8, i2 - 1 + paramInt15, i8, paramArrayOfDouble4, paramInt6, paramArrayOfDouble6, paramInt10, paramInt11, paramArrayOfDouble7, paramInt7 + 1 - 1 + paramInt14, localintW1);
        Dlacpy.dlacpy("All", paramInt7, localintW2.val, paramArrayOfDouble6, paramInt10, paramInt11, paramArrayOfDouble3, paramInt4, paramInt5);
        i5 = 1;
        for (i21 = localintW2.val - 1 + 1; i21 > 0; i21--)
        {
          if ((paramArrayOfDouble8[(i2 + (i5 - 1) * i8 + i5 - 1 - 1 + paramInt15)] >= 0.0D ? 0 : 1) != 0)
          {
            Dscal.dscal(localintW2.val, -1.0D, paramArrayOfDouble8, i3 + i5 - 1 - 1 + paramInt15, i8);
            Dscal.dscal(localintW2.val, -1.0D, paramArrayOfDouble8, i3 + (i5 - 1) * i8 - 1 + paramInt15, 1);
          }
          i5 += 1;
        }
        if (paramString1.regionMatches(0, "A", 0, 1))
        {
          i5 = 1;
          for (i21 = paramInt9 - 1 + 1; i21 > 0; i21--)
          {
            if ((i5 > localintW2.val ? 0 : 1) != 0) {
              paramArrayOfBoolean[(i5 - 1 + paramInt1)] = true;
            } else {
              paramArrayOfBoolean[(i5 - 1 + paramInt1)] = false;
            }
            i5 += 1;
          }
          Dtrevc.dtrevc("Right", "Select", paramArrayOfBoolean, paramInt1, paramInt9, paramArrayOfDouble8, i3 - 1 + paramInt15, i8, arrayOfDouble, 0, 1, paramArrayOfDouble8, i2 - 1 + paramInt15, i8, paramInt9, localintW3, paramArrayOfDouble4, paramInt6, localintW1);
          if ((localintW1.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = -9;
            return;
          }
          i1 = 0;
          i5 = 1;
          for (i21 = localintW2.val - 1 + 1; i21 > 0; i21--)
          {
            if ((paramArrayOfDouble8[(n + i5 - 1 - 1 + paramInt15)] != 0.0D ? 0 : 1) != 0)
            {
              d2 = Dnrm2.dnrm2(paramInt9, paramArrayOfDouble8, i2 + (i5 - 1) * i8 - 1 + paramInt15, 1);
              Dscal.dscal(paramInt9, 1.0D / d2, paramArrayOfDouble8, i2 + (i5 - 1) * i8 - 1 + paramInt15, 1);
            }
            else if ((i1 != 0 ? 0 : 1) != 0)
            {
              d2 = Dlapy2.dlapy2(Dnrm2.dnrm2(paramInt9, paramArrayOfDouble8, i2 + (i5 - 1) * i8 - 1 + paramInt15, 1), Dnrm2.dnrm2(paramInt9, paramArrayOfDouble8, i2 + i5 * i8 - 1 + paramInt15, 1));
              Dscal.dscal(paramInt9, 1.0D / d2, paramArrayOfDouble8, i2 + (i5 - 1) * i8 - 1 + paramInt15, 1);
              Dscal.dscal(paramInt9, 1.0D / d2, paramArrayOfDouble8, i2 + i5 * i8 - 1 + paramInt15, 1);
              i1 = 1;
            }
            else
            {
              i1 = 0;
            }
            i5 += 1;
          }
          Dgemv.dgemv("T", paramInt9, localintW2.val, 1.0D, paramArrayOfDouble8, i2 - 1 + paramInt15, i8, paramArrayOfDouble8, k - 1 + paramInt15, 1, 0.0D, paramArrayOfDouble4, paramInt6, 1);
          i1 = 0;
          i5 = 1;
          for (i21 = localintW2.val - 1 + 1; i21 > 0; i21--)
          {
            if ((paramArrayOfDouble8[(n + i5 - 1 - 1 + paramInt15)] == 0.0D ? 0 : 1) != 0) {
              if ((i1 != 0 ? 0 : 1) != 0)
              {
                paramArrayOfDouble4[(i5 - 1 + paramInt6)] = Dlapy2.dlapy2(paramArrayOfDouble4[(i5 - 1 + paramInt6)], paramArrayOfDouble4[(i5 + 1 - 1 + paramInt6)]);
                paramArrayOfDouble4[(i5 + 1 - 1 + paramInt6)] = paramArrayOfDouble4[(i5 - 1 + paramInt6)];
                i1 = 1;
              }
              else
              {
                i1 = 0;
              }
            }
            i5 += 1;
          }
          if ((i10 <= 2 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(paramInt9, paramArrayOfDouble8, i2 + paramInt9 - 1 - 1 + paramInt15, i8, paramArrayOfDouble8, k - 1 + paramInt15, 1);
            Dvout.dvout(arpack_debug.logfil.val, paramInt9, paramArrayOfDouble8, k - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Last row of the eigenvector matrix for T");
            if ((i10 <= 3 ? 0 : 1) != 0) {
              Dmout.dmout(arpack_debug.logfil.val, paramInt9, paramInt9, paramArrayOfDouble8, i2 - 1 + paramInt15, i8, arpack_debug.ndigit.val, "_neupd: The eigenvector matrix for T");
            }
          }
          Dcopy.dcopy(localintW2.val, paramArrayOfDouble4, paramInt6, 1, paramArrayOfDouble8, k - 1 + paramInt15, 1);
          Dgeqr2.dgeqr2(paramInt9, localintW2.val, paramArrayOfDouble8, i2 - 1 + paramInt15, i8, paramArrayOfDouble4, paramInt6, paramArrayOfDouble4, paramInt9 + 1 - 1 + paramInt6, localintW1);
          Dorm2r.dorm2r("Right", "Notranspose", paramInt7, paramInt9, localintW2.val, paramArrayOfDouble8, i2 - 1 + paramInt15, i8, paramArrayOfDouble4, paramInt6, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble7, paramInt7 + 1 - 1 + paramInt14, localintW1);
          Dtrmm.dtrmm("Right", "Upper", "No transpose", "Non-unit", paramInt7, localintW2.val, 1.0D, paramArrayOfDouble8, i2 - 1 + paramInt15, i8, paramArrayOfDouble3, paramInt4, paramInt5);
        }
      }
      else
      {
        Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, i11 - 1 + paramInt15, 1, paramArrayOfDouble1, paramInt2, 1);
        Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, i12 - 1 + paramInt15, 1, paramArrayOfDouble2, paramInt3, 1);
        Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, i11 - 1 + paramInt15, 1, paramArrayOfDouble8, m - 1 + paramInt15, 1);
        Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, i12 - 1 + paramInt15, 1, paramArrayOfDouble8, n - 1 + paramInt15, 1);
        Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, i - 1 + paramInt15, 1, paramArrayOfDouble8, k - 1 + paramInt15, 1);
      }
      if (str.regionMatches(0, "REGULR", 0, 6))
      {
        if (paramBoolean) {
          Dscal.dscal(paramInt9, d1, paramArrayOfDouble8, k - 1 + paramInt15, 1);
        }
      }
      else
      {
        if (str.regionMatches(0, "SHIFTI", 0, 6))
        {
          if (paramBoolean) {
            Dscal.dscal(paramInt9, d1, paramArrayOfDouble8, k - 1 + paramInt15, 1);
          }
          i6 = 1;
          for (i21 = paramInt9 - 1 + 1; i21 > 0; i21--)
          {
            d2 = Dlapy2.dlapy2(paramArrayOfDouble8[(m + i6 - 1 - 1 + paramInt15)], paramArrayOfDouble8[(n + i6 - 1 - 1 + paramInt15)]);
            paramArrayOfDouble8[(k + i6 - 1 - 1 + paramInt15)] = (Math.abs(paramArrayOfDouble8[(k + i6 - 1 - 1 + paramInt15)]) / d2 / d2);
            i6 += 1;
          }
        }
        else if (str.regionMatches(0, "REALPT", 0, 6))
        {
          i6 = 1;
          for (i21 = paramInt9 - 1 + 1; i21 > 0; i21--) {
            i6 += 1;
          }
        }
        else if (str.regionMatches(0, "IMAGPT", 0, 6))
        {
          i6 = 1;
          i21 = paramInt9 - 1 + 1;
          for (;;)
          {
            i6 += 1;
            i21--;
            if (i21 <= 0) {
              break;
            }
          }
        }
        if (str.regionMatches(0, "SHIFTI", 0, 6))
        {
          i6 = 1;
          for (i21 = paramInt9 - 1 + 1; i21 > 0; i21--)
          {
            d2 = Dlapy2.dlapy2(paramArrayOfDouble8[(m + i6 - 1 - 1 + paramInt15)], paramArrayOfDouble8[(n + i6 - 1 - 1 + paramInt15)]);
            paramArrayOfDouble8[(m + i6 - 1 - 1 + paramInt15)] = (paramArrayOfDouble8[(m + i6 - 1 - 1 + paramInt15)] / d2 / d2 + paramDouble1);
            paramArrayOfDouble8[(n + i6 - 1 - 1 + paramInt15)] = (-(paramArrayOfDouble8[(n + i6 - 1 - 1 + paramInt15)] / d2 / d2) + paramDouble2);
            i6 += 1;
          }
          Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, m - 1 + paramInt15, 1, paramArrayOfDouble1, paramInt2, 1);
          Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, n - 1 + paramInt15, 1, paramArrayOfDouble2, paramInt3, 1);
        }
        else if (((!str.regionMatches(0, "REALPT", 0, 6)) && (!str.regionMatches(0, "IMAGPT", 0, 6)) ? 0 : 1) != 0)
        {
          Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, m - 1 + paramInt15, 1, paramArrayOfDouble1, paramInt2, 1);
          Dcopy.dcopy(localintW2.val, paramArrayOfDouble8, n - 1 + paramInt15, 1, paramArrayOfDouble2, paramInt3, 1);
        }
      }
      if (str.regionMatches(0, "SHIFTI", 0, 6)) {}
      if (((i10 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        Dvout.dvout(arpack_debug.logfil.val, localintW2.val, paramArrayOfDouble1, paramInt2, arpack_debug.ndigit.val, "_neupd: Untransformed real part of the Ritz valuess.");
        Dvout.dvout(arpack_debug.logfil.val, localintW2.val, paramArrayOfDouble2, paramInt3, arpack_debug.ndigit.val, "_neupd: Untransformed imag part of the Ritz valuess.");
        Dvout.dvout(arpack_debug.logfil.val, localintW2.val, paramArrayOfDouble8, k - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Ritz estimates of untransformed Ritz values.");
      }
      else
      {
        if (str.regionMatches(0, "REGULR", 0, 6)) {}
        if (((i10 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          Dvout.dvout(arpack_debug.logfil.val, localintW2.val, paramArrayOfDouble1, paramInt2, arpack_debug.ndigit.val, "_neupd: Real parts of converged Ritz values.");
          Dvout.dvout(arpack_debug.logfil.val, localintW2.val, paramArrayOfDouble2, paramInt3, arpack_debug.ndigit.val, "_neupd: Imag parts of converged Ritz values.");
          Dvout.dvout(arpack_debug.logfil.val, localintW2.val, paramArrayOfDouble8, k - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Associated Ritz estimates.");
        }
      }
      if (((paramBoolean) && (paramString1.regionMatches(0, "A", 0, 1)) ? 1 : 0) != 0) {}
      if ((str.regionMatches(0, "SHIFTI", 0, 6) ? 1 : 0) != 0)
      {
        i1 = 0;
        i5 = 1;
        for (i21 = localintW2.val - 1 + 1; i21 > 0; i21--)
        {
          if ((paramArrayOfDouble8[(n + i5 - 1 - 1 + paramInt15)] != 0.0D ? 0 : 1) != 0)
          {
            paramArrayOfDouble4[(i5 - 1 + paramInt6)] = (paramArrayOfDouble8[(i2 + (i5 - 1) * i8 + paramInt9 - 1 - 1 + paramInt15)] / paramArrayOfDouble8[(m + i5 - 1 - 1 + paramInt15)]);
          }
          else if ((i1 != 0 ? 0 : 1) != 0)
          {
            d2 = Dlapy2.dlapy2(paramArrayOfDouble8[(m + i5 - 1 - 1 + paramInt15)], paramArrayOfDouble8[(n + i5 - 1 - 1 + paramInt15)]);
            paramArrayOfDouble4[(i5 - 1 + paramInt6)] = ((paramArrayOfDouble8[(i2 + (i5 - 1) * i8 + paramInt9 - 1 - 1 + paramInt15)] * paramArrayOfDouble8[(m + i5 - 1 - 1 + paramInt15)] + paramArrayOfDouble8[(i2 + i5 * i8 + paramInt9 - 1 - 1 + paramInt15)] * paramArrayOfDouble8[(n + i5 - 1 - 1 + paramInt15)]) / d2 / d2);
            paramArrayOfDouble4[(i5 + 1 - 1 + paramInt6)] = ((paramArrayOfDouble8[(i2 + i5 * i8 + paramInt9 - 1 - 1 + paramInt15)] * paramArrayOfDouble8[(m + i5 - 1 - 1 + paramInt15)] - paramArrayOfDouble8[(i2 + (i5 - 1) * i8 + paramInt9 - 1 - 1 + paramInt15)] * paramArrayOfDouble8[(n + i5 - 1 - 1 + paramInt15)]) / d2 / d2);
            i1 = 1;
          }
          else
          {
            i1 = 0;
          }
          i5 += 1;
        }
        Dger.dger(paramInt7, localintW2.val, 1.0D, paramArrayOfDouble5, paramInt8, 1, paramArrayOfDouble4, paramInt6, 1, paramArrayOfDouble3, paramInt4, paramInt5);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dneupd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */