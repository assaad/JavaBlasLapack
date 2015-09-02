package org.netlib.arpack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sger;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sscal;
import org.netlib.blas.Strmm;
import org.netlib.lapack.Sgeqr2;
import org.netlib.lapack.Slacpy;
import org.netlib.lapack.Slahqr;
import org.netlib.lapack.Slamch;
import org.netlib.lapack.Slapy2;
import org.netlib.lapack.Slaset;
import org.netlib.lapack.Sorm2r;
import org.netlib.lapack.Strevc;
import org.netlib.lapack.Strsen;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sneupd
{
  public static float t0 = 0.0F;
  public static float t1 = 0.0F;
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void sneupd(boolean paramBoolean, String paramString1, boolean[] paramArrayOfBoolean, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat4, int paramInt6, String paramString2, int paramInt7, String paramString3, intW paramintW1, float paramFloat3, float[] paramArrayOfFloat5, int paramInt8, int paramInt9, float[] paramArrayOfFloat6, int paramInt10, int paramInt11, int[] paramArrayOfInt1, int paramInt12, int[] paramArrayOfInt2, int paramInt13, float[] paramArrayOfFloat7, int paramInt14, float[] paramArrayOfFloat8, int paramInt15, int paramInt16, intW paramintW2)
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
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f2 = 0.0F;
    float[] arrayOfFloat = new float[1 * 1];
    float f3 = 0.0F;
    float f4 = 0.0F;
    i10 = arpack_debug.mneupd.val;
    i9 = paramArrayOfInt1[(7 - 1 + paramInt12)];
    localintW2.val = paramArrayOfInt1[(5 - 1 + paramInt12)];
    paramintW2.val = 0;
    f4 = Slamch.slamch("Epsilon-Machine");
    f4 = (float)Math.pow(f4, 2.0F / 3.0F);
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
      if (((paramFloat2 != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
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
      f1 = paramArrayOfFloat8[(j + 2 - 1 + paramInt15)];
      paramArrayOfFloat8[(j + 2 - 1 + paramInt15)] = 0.0F;
      if ((i10 <= 2 ? 0 : 1) != 0)
      {
        Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, i15 - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Real part of Ritz values passed in from _NAUPD.");
        Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, i16 - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Imag part of Ritz values passed in from _NAUPD.");
        Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, i17 - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Ritz estimates passed in from _NAUPD.");
      }
      int i21;
      if (paramBoolean)
      {
        i20 = 0;
        i5 = 1;
        for (i21 = paramInt9 - 1 + 1; i21 > 0; i21--)
        {
          paramArrayOfFloat8[(i + i5 - 1 - 1 + paramInt15)] = i5;
          paramArrayOfBoolean[(i5 - 1 + paramInt1)] = false;
          i5 += 1;
        }
        localintW5.val = (paramInt9 - paramintW1.val);
        i18 = 0;
        Sngets.sngets(i18, paramString3, paramintW1, localintW5, paramArrayOfFloat8, i15 - 1 + paramInt15, paramArrayOfFloat8, i16 - 1 + paramInt15, paramArrayOfFloat8, i - 1 + paramInt15, paramArrayOfFloat8, paramInt15, paramArrayOfFloat8, localintW5.val + 1 - 1 + paramInt15);
        if ((i10 <= 2 ? 0 : 1) != 0)
        {
          Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, i15 - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Real part of Ritz values after calling _NGETS.");
          Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, i16 - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Imag part of Ritz values after calling _NGETS.");
          Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, i - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Ritz value indices after calling _NGETS.");
        }
        localintW4.val = 0;
        i5 = 1;
        for (i21 = paramInt9 - 1 + 1; i21 > 0; i21--)
        {
          f3 = Math.max(f4, Slapy2.slapy2(paramArrayOfFloat8[(i15 + paramInt9 - i5 - 1 + paramInt15)], paramArrayOfFloat8[(i16 + paramInt9 - i5 - 1 + paramInt15)]));
          i19 = (int)paramArrayOfFloat8[(i + paramInt9 - i5 - 1 + paramInt15)];
          if ((localintW4.val >= localintW2.val ? 0 : 1) != 0) {}
          if (((paramArrayOfFloat8[(i17 + i19 - 1 - 1 + paramInt15)] > paramFloat3 * f3 ? 0 : 1) != 0 ? 1 : 0) != 0)
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
        Scopy.scopy(i7 * paramInt9, paramArrayOfFloat8, j - 1 + paramInt15, 1, paramArrayOfFloat8, i3 - 1 + paramInt15, 1);
        Slaset.slaset("All", paramInt9, paramInt9, 0.0F, 1.0F, paramArrayOfFloat8, i2 - 1 + paramInt15, i8);
        Slahqr.slahqr(true, true, paramInt9, 1, paramInt9, paramArrayOfFloat8, i3 - 1 + paramInt15, i7, paramArrayOfFloat8, m - 1 + paramInt15, paramArrayOfFloat8, n - 1 + paramInt15, 1, paramInt9, paramArrayOfFloat8, i2 - 1 + paramInt15, i8, localintW1);
        Scopy.scopy(paramInt9, paramArrayOfFloat8, i2 + paramInt9 - 1 - 1 + paramInt15, i8, paramArrayOfFloat8, k - 1 + paramInt15, 1);
        if ((localintW1.val == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -8;
          return;
        }
        if ((i10 <= 1 ? 0 : 1) != 0)
        {
          Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, m - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Real part of the eigenvalues of H");
          Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, n - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Imaginary part of the Eigenvalues of H");
          Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, k - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Last row of the Schur vector matrix");
          if ((i10 <= 3 ? 0 : 1) != 0) {
            Smout.smout(arpack_debug.logfil.val, paramInt9, paramInt9, paramArrayOfFloat8, i3 - 1 + paramInt15, i7, arpack_debug.ndigit.val, "_neupd: The upper quasi-triangular matrix ");
          }
        }
        if (i20 != 0)
        {
          Strsen.strsen("None", "V", paramArrayOfBoolean, paramInt1, paramInt9, paramArrayOfFloat8, i3 - 1 + paramInt15, i7, paramArrayOfFloat8, i2 - 1 + paramInt15, i8, paramArrayOfFloat8, m - 1 + paramInt15, paramArrayOfFloat8, n - 1 + paramInt15, localintW2, localfloatW1, localfloatW2, paramArrayOfFloat8, k - 1 + paramInt15, paramInt9, arrayOfInt, 0, 1, localintW1);
          if ((localintW1.val != 1 ? 0 : 1) != 0)
          {
            paramintW2.val = 1;
            return;
          }
          if ((i10 <= 2 ? 0 : 1) != 0)
          {
            Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, m - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Real part of the eigenvalues of H--reordered");
            Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, n - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Imag part of the eigenvalues of H--reordered");
            if ((i10 <= 3 ? 0 : 1) != 0) {
              Smout.smout(arpack_debug.logfil.val, paramInt9, paramInt9, paramArrayOfFloat8, i3 - 1 + paramInt15, i8, arpack_debug.ndigit.val, "_neupd: Quasi-triangular matrix after re-ordering");
            }
          }
        }
        Scopy.scopy(paramInt9, paramArrayOfFloat8, i2 + paramInt9 - 1 - 1 + paramInt15, i8, paramArrayOfFloat8, k - 1 + paramInt15, 1);
        if (str.regionMatches(0, "REGULR", 0, 6))
        {
          Scopy.scopy(localintW2.val, paramArrayOfFloat8, m - 1 + paramInt15, 1, paramArrayOfFloat1, paramInt2, 1);
          Scopy.scopy(localintW2.val, paramArrayOfFloat8, n - 1 + paramInt15, 1, paramArrayOfFloat2, paramInt3, 1);
        }
        Sgeqr2.sgeqr2(paramInt9, localintW2.val, paramArrayOfFloat8, i2 - 1 + paramInt15, i8, paramArrayOfFloat4, paramInt6, paramArrayOfFloat4, paramInt9 + 1 - 1 + paramInt6, localintW1);
        Sorm2r.sorm2r("Right", "Notranspose", paramInt7, paramInt9, localintW2.val, paramArrayOfFloat8, i2 - 1 + paramInt15, i8, paramArrayOfFloat4, paramInt6, paramArrayOfFloat6, paramInt10, paramInt11, paramArrayOfFloat7, paramInt7 + 1 - 1 + paramInt14, localintW1);
        Slacpy.slacpy("All", paramInt7, localintW2.val, paramArrayOfFloat6, paramInt10, paramInt11, paramArrayOfFloat3, paramInt4, paramInt5);
        i5 = 1;
        for (i21 = localintW2.val - 1 + 1; i21 > 0; i21--)
        {
          if ((paramArrayOfFloat8[(i2 + (i5 - 1) * i8 + i5 - 1 - 1 + paramInt15)] >= 0.0F ? 0 : 1) != 0)
          {
            Sscal.sscal(localintW2.val, -1.0F, paramArrayOfFloat8, i3 + i5 - 1 - 1 + paramInt15, i8);
            Sscal.sscal(localintW2.val, -1.0F, paramArrayOfFloat8, i3 + (i5 - 1) * i8 - 1 + paramInt15, 1);
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
          Strevc.strevc("Right", "Select", paramArrayOfBoolean, paramInt1, paramInt9, paramArrayOfFloat8, i3 - 1 + paramInt15, i8, arrayOfFloat, 0, 1, paramArrayOfFloat8, i2 - 1 + paramInt15, i8, paramInt9, localintW3, paramArrayOfFloat4, paramInt6, localintW1);
          if ((localintW1.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = -9;
            return;
          }
          i1 = 0;
          i5 = 1;
          for (i21 = localintW2.val - 1 + 1; i21 > 0; i21--)
          {
            if ((paramArrayOfFloat8[(n + i5 - 1 - 1 + paramInt15)] != 0.0F ? 0 : 1) != 0)
            {
              f2 = Snrm2.snrm2(paramInt9, paramArrayOfFloat8, i2 + (i5 - 1) * i8 - 1 + paramInt15, 1);
              Sscal.sscal(paramInt9, 1.0F / f2, paramArrayOfFloat8, i2 + (i5 - 1) * i8 - 1 + paramInt15, 1);
            }
            else if ((i1 != 0 ? 0 : 1) != 0)
            {
              f2 = Slapy2.slapy2(Snrm2.snrm2(paramInt9, paramArrayOfFloat8, i2 + (i5 - 1) * i8 - 1 + paramInt15, 1), Snrm2.snrm2(paramInt9, paramArrayOfFloat8, i2 + i5 * i8 - 1 + paramInt15, 1));
              Sscal.sscal(paramInt9, 1.0F / f2, paramArrayOfFloat8, i2 + (i5 - 1) * i8 - 1 + paramInt15, 1);
              Sscal.sscal(paramInt9, 1.0F / f2, paramArrayOfFloat8, i2 + i5 * i8 - 1 + paramInt15, 1);
              i1 = 1;
            }
            else
            {
              i1 = 0;
            }
            i5 += 1;
          }
          Sgemv.sgemv("T", paramInt9, localintW2.val, 1.0F, paramArrayOfFloat8, i2 - 1 + paramInt15, i8, paramArrayOfFloat8, k - 1 + paramInt15, 1, 0.0F, paramArrayOfFloat4, paramInt6, 1);
          i1 = 0;
          i5 = 1;
          for (i21 = localintW2.val - 1 + 1; i21 > 0; i21--)
          {
            if ((paramArrayOfFloat8[(n + i5 - 1 - 1 + paramInt15)] == 0.0F ? 0 : 1) != 0) {
              if ((i1 != 0 ? 0 : 1) != 0)
              {
                paramArrayOfFloat4[(i5 - 1 + paramInt6)] = Slapy2.slapy2(paramArrayOfFloat4[(i5 - 1 + paramInt6)], paramArrayOfFloat4[(i5 + 1 - 1 + paramInt6)]);
                paramArrayOfFloat4[(i5 + 1 - 1 + paramInt6)] = paramArrayOfFloat4[(i5 - 1 + paramInt6)];
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
            Scopy.scopy(paramInt9, paramArrayOfFloat8, i2 + paramInt9 - 1 - 1 + paramInt15, i8, paramArrayOfFloat8, k - 1 + paramInt15, 1);
            Svout.svout(arpack_debug.logfil.val, paramInt9, paramArrayOfFloat8, k - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Last row of the eigenvector matrix for T");
            if ((i10 <= 3 ? 0 : 1) != 0) {
              Smout.smout(arpack_debug.logfil.val, paramInt9, paramInt9, paramArrayOfFloat8, i2 - 1 + paramInt15, i8, arpack_debug.ndigit.val, "_neupd: The eigenvector matrix for T");
            }
          }
          Scopy.scopy(localintW2.val, paramArrayOfFloat4, paramInt6, 1, paramArrayOfFloat8, k - 1 + paramInt15, 1);
          Sgeqr2.sgeqr2(paramInt9, localintW2.val, paramArrayOfFloat8, i2 - 1 + paramInt15, i8, paramArrayOfFloat4, paramInt6, paramArrayOfFloat4, paramInt9 + 1 - 1 + paramInt6, localintW1);
          Sorm2r.sorm2r("Right", "Notranspose", paramInt7, paramInt9, localintW2.val, paramArrayOfFloat8, i2 - 1 + paramInt15, i8, paramArrayOfFloat4, paramInt6, paramArrayOfFloat3, paramInt4, paramInt5, paramArrayOfFloat7, paramInt7 + 1 - 1 + paramInt14, localintW1);
          Strmm.strmm("Right", "Upper", "No transpose", "Non-unit", paramInt7, localintW2.val, 1.0F, paramArrayOfFloat8, i2 - 1 + paramInt15, i8, paramArrayOfFloat3, paramInt4, paramInt5);
        }
      }
      else
      {
        Scopy.scopy(localintW2.val, paramArrayOfFloat8, i11 - 1 + paramInt15, 1, paramArrayOfFloat1, paramInt2, 1);
        Scopy.scopy(localintW2.val, paramArrayOfFloat8, i12 - 1 + paramInt15, 1, paramArrayOfFloat2, paramInt3, 1);
        Scopy.scopy(localintW2.val, paramArrayOfFloat8, i11 - 1 + paramInt15, 1, paramArrayOfFloat8, m - 1 + paramInt15, 1);
        Scopy.scopy(localintW2.val, paramArrayOfFloat8, i12 - 1 + paramInt15, 1, paramArrayOfFloat8, n - 1 + paramInt15, 1);
        Scopy.scopy(localintW2.val, paramArrayOfFloat8, i - 1 + paramInt15, 1, paramArrayOfFloat8, k - 1 + paramInt15, 1);
      }
      if (str.regionMatches(0, "REGULR", 0, 6))
      {
        if (paramBoolean) {
          Sscal.sscal(paramInt9, f1, paramArrayOfFloat8, k - 1 + paramInt15, 1);
        }
      }
      else
      {
        if (str.regionMatches(0, "SHIFTI", 0, 6))
        {
          if (paramBoolean) {
            Sscal.sscal(paramInt9, f1, paramArrayOfFloat8, k - 1 + paramInt15, 1);
          }
          i6 = 1;
          for (i21 = paramInt9 - 1 + 1; i21 > 0; i21--)
          {
            f2 = Slapy2.slapy2(paramArrayOfFloat8[(m + i6 - 1 - 1 + paramInt15)], paramArrayOfFloat8[(n + i6 - 1 - 1 + paramInt15)]);
            paramArrayOfFloat8[(k + i6 - 1 - 1 + paramInt15)] = (Math.abs(paramArrayOfFloat8[(k + i6 - 1 - 1 + paramInt15)]) / f2 / f2);
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
            f2 = Slapy2.slapy2(paramArrayOfFloat8[(m + i6 - 1 - 1 + paramInt15)], paramArrayOfFloat8[(n + i6 - 1 - 1 + paramInt15)]);
            paramArrayOfFloat8[(m + i6 - 1 - 1 + paramInt15)] = (paramArrayOfFloat8[(m + i6 - 1 - 1 + paramInt15)] / f2 / f2 + paramFloat1);
            paramArrayOfFloat8[(n + i6 - 1 - 1 + paramInt15)] = (-(paramArrayOfFloat8[(n + i6 - 1 - 1 + paramInt15)] / f2 / f2) + paramFloat2);
            i6 += 1;
          }
          Scopy.scopy(localintW2.val, paramArrayOfFloat8, m - 1 + paramInt15, 1, paramArrayOfFloat1, paramInt2, 1);
          Scopy.scopy(localintW2.val, paramArrayOfFloat8, n - 1 + paramInt15, 1, paramArrayOfFloat2, paramInt3, 1);
        }
        else if (((!str.regionMatches(0, "REALPT", 0, 6)) && (!str.regionMatches(0, "IMAGPT", 0, 6)) ? 0 : 1) != 0)
        {
          Scopy.scopy(localintW2.val, paramArrayOfFloat8, m - 1 + paramInt15, 1, paramArrayOfFloat1, paramInt2, 1);
          Scopy.scopy(localintW2.val, paramArrayOfFloat8, n - 1 + paramInt15, 1, paramArrayOfFloat2, paramInt3, 1);
        }
      }
      if (str.regionMatches(0, "SHIFTI", 0, 6)) {}
      if (((i10 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        Svout.svout(arpack_debug.logfil.val, localintW2.val, paramArrayOfFloat1, paramInt2, arpack_debug.ndigit.val, "_neupd: Untransformed real part of the Ritz valuess.");
        Svout.svout(arpack_debug.logfil.val, localintW2.val, paramArrayOfFloat2, paramInt3, arpack_debug.ndigit.val, "_neupd: Untransformed imag part of the Ritz valuess.");
        Svout.svout(arpack_debug.logfil.val, localintW2.val, paramArrayOfFloat8, k - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Ritz estimates of untransformed Ritz values.");
      }
      else
      {
        if (str.regionMatches(0, "REGULR", 0, 6)) {}
        if (((i10 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          Svout.svout(arpack_debug.logfil.val, localintW2.val, paramArrayOfFloat1, paramInt2, arpack_debug.ndigit.val, "_neupd: Real parts of converged Ritz values.");
          Svout.svout(arpack_debug.logfil.val, localintW2.val, paramArrayOfFloat2, paramInt3, arpack_debug.ndigit.val, "_neupd: Imag parts of converged Ritz values.");
          Svout.svout(arpack_debug.logfil.val, localintW2.val, paramArrayOfFloat8, k - 1 + paramInt15, arpack_debug.ndigit.val, "_neupd: Associated Ritz estimates.");
        }
      }
      if (((paramBoolean) && (paramString1.regionMatches(0, "A", 0, 1)) ? 1 : 0) != 0) {}
      if ((str.regionMatches(0, "SHIFTI", 0, 6) ? 1 : 0) != 0)
      {
        i1 = 0;
        i5 = 1;
        for (i21 = localintW2.val - 1 + 1; i21 > 0; i21--)
        {
          if ((paramArrayOfFloat8[(n + i5 - 1 - 1 + paramInt15)] != 0.0F ? 0 : 1) != 0)
          {
            paramArrayOfFloat4[(i5 - 1 + paramInt6)] = (paramArrayOfFloat8[(i2 + (i5 - 1) * i8 + paramInt9 - 1 - 1 + paramInt15)] / paramArrayOfFloat8[(m + i5 - 1 - 1 + paramInt15)]);
          }
          else if ((i1 != 0 ? 0 : 1) != 0)
          {
            f2 = Slapy2.slapy2(paramArrayOfFloat8[(m + i5 - 1 - 1 + paramInt15)], paramArrayOfFloat8[(n + i5 - 1 - 1 + paramInt15)]);
            paramArrayOfFloat4[(i5 - 1 + paramInt6)] = ((paramArrayOfFloat8[(i2 + (i5 - 1) * i8 + paramInt9 - 1 - 1 + paramInt15)] * paramArrayOfFloat8[(m + i5 - 1 - 1 + paramInt15)] + paramArrayOfFloat8[(i2 + i5 * i8 + paramInt9 - 1 - 1 + paramInt15)] * paramArrayOfFloat8[(n + i5 - 1 - 1 + paramInt15)]) / f2 / f2);
            paramArrayOfFloat4[(i5 + 1 - 1 + paramInt6)] = ((paramArrayOfFloat8[(i2 + i5 * i8 + paramInt9 - 1 - 1 + paramInt15)] * paramArrayOfFloat8[(m + i5 - 1 - 1 + paramInt15)] - paramArrayOfFloat8[(i2 + (i5 - 1) * i8 + paramInt9 - 1 - 1 + paramInt15)] * paramArrayOfFloat8[(n + i5 - 1 - 1 + paramInt15)]) / f2 / f2);
            i1 = 1;
          }
          else
          {
            i1 = 0;
          }
          i5 += 1;
        }
        Sger.sger(paramInt7, localintW2.val, 1.0F, paramArrayOfFloat5, paramInt8, 1, paramArrayOfFloat4, paramInt6, 1, paramArrayOfFloat3, paramInt4, paramInt5);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Sneupd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */