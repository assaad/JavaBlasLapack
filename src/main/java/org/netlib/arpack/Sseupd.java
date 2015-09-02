package org.netlib.arpack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sger;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sscal;
import org.netlib.lapack.Sgeqr2;
import org.netlib.lapack.Slacpy;
import org.netlib.lapack.Slamch;
import org.netlib.lapack.Sorm2r;
import org.netlib.lapack.Ssteqr;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sseupd
{
  public static float t0 = 0.0F;
  public static float t1 = 0.0F;
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void sseupd(boolean paramBoolean, String paramString1, boolean[] paramArrayOfBoolean, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float paramFloat1, String paramString2, int paramInt5, String paramString3, intW paramintW1, float paramFloat2, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, int[] paramArrayOfInt1, int paramInt10, int[] paramArrayOfInt2, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, float[] paramArrayOfFloat6, int paramInt13, int paramInt14, intW paramintW2)
  {
    String str = new String("      ");
    int i = 0;
    intW localintW1 = new intW(0);
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    intW localintW2 = new intW(0);
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    intW localintW3 = new intW(0);
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    intW localintW4 = new intW(0);
    int i15 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    floatW localfloatW = new floatW(0.0F);
    float f3 = 0.0F;
    float f4 = 0.0F;
    int i16 = 0;
    i7 = arpack_debug.mseupd.val;
    i6 = paramArrayOfInt1[(7 - 1 + paramInt10)];
    localintW2.val = paramArrayOfInt1[(5 - 1 + paramInt10)];
    paramintW2.val = 0;
    if ((localintW2.val != 0 ? 0 : 1) == 0)
    {
      localintW1.val = 0;
      if ((localintW2.val > 0 ? 0 : 1) != 0) {
        localintW1.val = -14;
      }
      if ((paramInt5 > 0 ? 0 : 1) != 0) {
        localintW1.val = -1;
      }
      if ((paramintW1.val > 0 ? 0 : 1) != 0) {
        localintW1.val = -2;
      }
      if ((paramInt7 > paramintW1.val ? 0 : 1) == 0) {}
      if (((paramInt7 <= paramInt5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        localintW1.val = -3;
      }
      if ((((paramString3.regionMatches(0, "LM", 0, 2) ^ true)) && ((paramString3.regionMatches(0, "SM", 0, 2) ^ true)) ? 1 : 0) != 0) {}
      if (((paramString3.regionMatches(0, "LA", 0, 2) ^ true) ? 1 : 0) != 0) {}
      if (((paramString3.regionMatches(0, "SA", 0, 2) ^ true) ? 1 : 0) != 0) {}
      if (((paramString3.regionMatches(0, "BE", 0, 2) ^ true) ? 1 : 0) != 0) {
        localintW1.val = -5;
      }
      if ((((paramString2.regionMatches(0, "I", 0, 1) ^ true)) && ((paramString2.regionMatches(0, "G", 0, 1) ^ true)) ? 1 : 0) != 0) {
        localintW1.val = -6;
      }
      if ((((paramString1.regionMatches(0, "A", 0, 1) ^ true)) && ((paramString1.regionMatches(0, "P", 0, 1) ^ true)) ? 1 : 0) != 0) {}
      if (((paramString1.regionMatches(0, "S", 0, 1) ^ true) ? 1 : 0) != 0) {}
      if ((paramBoolean ? 1 : 0) != 0) {
        localintW1.val = -15;
      }
      if (((paramBoolean) && (paramString1.regionMatches(0, "S", 0, 1)) ? 1 : 0) != 0) {
        localintW1.val = -16;
      }
      if (paramBoolean) {}
      if (((paramInt14 >= (int)Math.pow(paramInt7, 2) + 8 * paramInt7 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        localintW1.val = -7;
      }
      if ((i6 != 1 ? 0 : 1) == 0) {}
      if (((i6 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        str = "REGULR";
      } else if ((i6 != 3 ? 0 : 1) != 0) {
        str = "SHIFTI";
      } else if ((i6 != 4 ? 0 : 1) != 0) {
        str = "BUCKLE";
      } else if ((i6 != 5 ? 0 : 1) != 0) {
        str = "CAYLEY";
      } else {
        localintW1.val = -10;
      }
      if ((i6 != 1 ? 0 : 1) != 0) {}
      if ((paramString2.regionMatches(0, "G", 0, 1) ? 1 : 0) != 0) {
        localintW1.val = -11;
      }
      if ((paramintW1.val != 1 ? 0 : 1) != 0) {}
      if ((paramString3.regionMatches(0, "BE", 0, 2) ? 1 : 0) != 0) {
        localintW1.val = -12;
      }
      if ((localintW1.val == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = localintW1.val;
      }
      else
      {
        j = paramArrayOfInt2[(5 - 1 + paramInt11)];
        i9 = paramArrayOfInt2[(6 - 1 + paramInt11)];
        i = paramArrayOfInt2[(7 - 1 + paramInt11)];
        i4 = paramInt7;
        i5 = paramInt7;
        m = i + i4;
        k = m + i4;
        n = k + i4;
        i1 = n + i4 * paramInt7;
        i8 = i1 + 2 * paramInt7;
        paramArrayOfInt2[(4 - 1 + paramInt11)] = i8;
        paramArrayOfInt2[(8 - 1 + paramInt11)] = m;
        paramArrayOfInt2[(9 - 1 + paramInt11)] = k;
        paramArrayOfInt2[(10 - 1 + paramInt11)] = n;
        i10 = paramArrayOfInt2[(11 - 1 + paramInt11)] + paramInt7;
        i11 = i10 + paramInt7;
        f4 = Slamch.slamch("Epsilon-Machine");
        f4 = (float)Math.pow(f4, 2.0F / 3.0F);
        f2 = paramArrayOfFloat6[(j - 1 + paramInt13)];
        if (paramString2.regionMatches(0, "I", 0, 1)) {
          f1 = f2;
        } else if (paramString2.regionMatches(0, "G", 0, 1)) {
          f1 = Snrm2.snrm2(paramInt5, paramArrayOfFloat5, paramInt12, 1);
        }
        if ((i7 <= 2 ? 0 : 1) != 0)
        {
          Svout.svout(arpack_debug.logfil.val, paramInt7, paramArrayOfFloat6, i10 - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Ritz values passed in from _SAUPD.");
          Svout.svout(arpack_debug.logfil.val, paramInt7, paramArrayOfFloat6, i11 - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Ritz estimates passed in from _SAUPD.");
        }
        int i17;
        if (paramBoolean)
        {
          i16 = 0;
          i2 = 1;
          for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
          {
            paramArrayOfFloat6[(i + i2 - 1 - 1 + paramInt13)] = i2;
            paramArrayOfBoolean[(i2 - 1 + paramInt1)] = false;
            i2 += 1;
          }
          localintW3.val = (paramInt7 - paramintW1.val);
          i12 = 0;
          Ssgets.ssgets(i12, paramString3, paramintW1, localintW3, paramArrayOfFloat6, i10 - 1 + paramInt13, paramArrayOfFloat6, i - 1 + paramInt13, paramArrayOfFloat6, paramInt13);
          if ((i7 <= 2 ? 0 : 1) != 0)
          {
            Svout.svout(arpack_debug.logfil.val, paramInt7, paramArrayOfFloat6, i10 - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Ritz values after calling _SGETS.");
            Svout.svout(arpack_debug.logfil.val, paramInt7, paramArrayOfFloat6, i - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Ritz value indices after calling _SGETS.");
          }
          localintW4.val = 0;
          i2 = 1;
          for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
          {
            f3 = Math.max(f4, Math.abs(paramArrayOfFloat6[(i10 + paramInt7 - i2 - 1 + paramInt13)]));
            i15 = (int)paramArrayOfFloat6[(i + paramInt7 - i2 - 1 + paramInt13)];
            if ((localintW4.val >= localintW2.val ? 0 : 1) != 0) {}
            if (((paramArrayOfFloat6[(i11 + i15 - 1 - 1 + paramInt13)] > paramFloat2 * f3 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              paramArrayOfBoolean[(i15 - 1 + paramInt1)] = true;
              localintW4.val += 1;
              if ((i15 <= paramintW1.val ? 0 : 1) != 0) {
                i16 = 1;
              }
            }
            i2 += 1;
          }
          if ((i7 <= 2 ? 0 : 1) != 0)
          {
            ivout_adapter(arpack_debug.logfil.val, 1, localintW4, arpack_debug.ndigit.val, "_seupd: Number of specified eigenvalues");
            ivout_adapter(arpack_debug.logfil.val, 1, localintW2, arpack_debug.ndigit.val, "_seupd: Number of \"converged\" eigenvalues");
          }
          if ((localintW4.val == localintW2.val ? 0 : 1) != 0)
          {
            paramintW2.val = -17;
            return;
          }
          Scopy.scopy(paramInt7 - 1, paramArrayOfFloat6, j + 1 - 1 + paramInt13, 1, paramArrayOfFloat6, k - 1 + paramInt13, 1);
          Scopy.scopy(paramInt7, paramArrayOfFloat6, j + i4 - 1 + paramInt13, 1, paramArrayOfFloat6, m - 1 + paramInt13, 1);
          Ssteqr.ssteqr("Identity", paramInt7, paramArrayOfFloat6, m - 1 + paramInt13, paramArrayOfFloat6, k - 1 + paramInt13, paramArrayOfFloat6, n - 1 + paramInt13, i5, paramArrayOfFloat6, i1 - 1 + paramInt13, localintW1);
          if ((localintW1.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = -8;
            return;
          }
          if ((i7 <= 1 ? 0 : 1) != 0)
          {
            Scopy.scopy(paramInt7, paramArrayOfFloat6, n + paramInt7 - 1 - 1 + paramInt13, i5, paramArrayOfFloat6, i1 - 1 + paramInt13, 1);
            Svout.svout(arpack_debug.logfil.val, paramInt7, paramArrayOfFloat6, m - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: NCV Ritz values of the final H matrix");
            Svout.svout(arpack_debug.logfil.val, paramInt7, paramArrayOfFloat6, i1 - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: last row of the eigenvector matrix for H");
          }
          if (i16 != 0)
          {
            i13 = 1;
            i14 = paramInt7;
            if ((paramInt7 != 1 ? 0 : 1) == 0) {
              do
              {
                if (paramArrayOfBoolean[(i13 - 1 + paramInt1)] != 0)
                {
                  i13 += 1;
                }
                else if ((paramArrayOfBoolean[(i14 - 1 + paramInt1)] ^ 0x1) != 0)
                {
                  i14 -= 1;
                }
                else
                {
                  localfloatW.val = paramArrayOfFloat6[(m + i13 - 1 - 1 + paramInt13)];
                  paramArrayOfFloat6[(m + i13 - 1 - 1 + paramInt13)] = paramArrayOfFloat6[(m + i14 - 1 - 1 + paramInt13)];
                  paramArrayOfFloat6[(m + i14 - 1 - 1 + paramInt13)] = localfloatW.val;
                  Scopy.scopy(paramInt7, paramArrayOfFloat6, n + paramInt7 * (i13 - 1) - 1 + paramInt13, 1, paramArrayOfFloat6, i1 - 1 + paramInt13, 1);
                  Scopy.scopy(paramInt7, paramArrayOfFloat6, n + paramInt7 * (i14 - 1) - 1 + paramInt13, 1, paramArrayOfFloat6, n + paramInt7 * (i13 - 1) - 1 + paramInt13, 1);
                  Scopy.scopy(paramInt7, paramArrayOfFloat6, i1 - 1 + paramInt13, 1, paramArrayOfFloat6, n + paramInt7 * (i14 - 1) - 1 + paramInt13, 1);
                  i13 += 1;
                  i14 -= 1;
                }
              } while ((i13 >= i14 ? 0 : 1) != 0);
            }
          }
          if ((i7 <= 2 ? 0 : 1) != 0) {
            Svout.svout(arpack_debug.logfil.val, paramInt7, paramArrayOfFloat6, m - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: The eigenvalues of H--reordered");
          }
          Scopy.scopy(localintW2.val, paramArrayOfFloat6, m - 1 + paramInt13, 1, paramArrayOfFloat1, paramInt2, 1);
        }
        else
        {
          Scopy.scopy(localintW2.val, paramArrayOfFloat6, i9 - 1 + paramInt13, 1, paramArrayOfFloat1, paramInt2, 1);
          Scopy.scopy(paramInt7, paramArrayOfFloat6, i9 - 1 + paramInt13, 1, paramArrayOfFloat6, m - 1 + paramInt13, 1);
        }
        if (str.regionMatches(0, "REGULR", 0, 6))
        {
          if (paramBoolean) {
            Ssesrt.ssesrt("LA", paramBoolean, localintW2.val, paramArrayOfFloat1, paramInt2, paramInt7, paramArrayOfFloat6, n - 1 + paramInt13, i5);
          } else {
            Scopy.scopy(paramInt7, paramArrayOfFloat6, i - 1 + paramInt13, 1, paramArrayOfFloat6, k - 1 + paramInt13, 1);
          }
        }
        else
        {
          Scopy.scopy(paramInt7, paramArrayOfFloat6, m - 1 + paramInt13, 1, paramArrayOfFloat6, i1 - 1 + paramInt13, 1);
          if (str.regionMatches(0, "SHIFTI", 0, 6))
          {
            i3 = 1;
            for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat6[(m + i3 - 1 - 1 + paramInt13)] = (1.0F / paramArrayOfFloat6[(m + i3 - 1 - 1 + paramInt13)] + paramFloat1);
              i3 += 1;
            }
          }
          else if (str.regionMatches(0, "BUCKLE", 0, 6))
          {
            i3 = 1;
            for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat6[(m + i3 - 1 - 1 + paramInt13)] = (paramFloat1 * paramArrayOfFloat6[(m + i3 - 1 - 1 + paramInt13)] / (paramArrayOfFloat6[(m + i3 - 1 - 1 + paramInt13)] - 1.0F));
              i3 += 1;
            }
          }
          else if (str.regionMatches(0, "CAYLEY", 0, 6))
          {
            i3 = 1;
            i17 = paramInt7 - 1 + 1;
            for (;;)
            {
              paramArrayOfFloat6[(m + i3 - 1 - 1 + paramInt13)] = (paramFloat1 * (paramArrayOfFloat6[(m + i3 - 1 - 1 + paramInt13)] + 1.0F) / (paramArrayOfFloat6[(m + i3 - 1 - 1 + paramInt13)] - 1.0F));
              i3 += 1;
              i17--;
              if (i17 <= 0) {
                break;
              }
            }
          }
          Scopy.scopy(localintW2.val, paramArrayOfFloat6, m - 1 + paramInt13, 1, paramArrayOfFloat1, paramInt2, 1);
          Ssortr.ssortr("LA", true, localintW2.val, paramArrayOfFloat6, m - 1 + paramInt13, paramArrayOfFloat6, i1 - 1 + paramInt13);
          if (paramBoolean)
          {
            Ssesrt.ssesrt("LA", paramBoolean, localintW2.val, paramArrayOfFloat1, paramInt2, paramInt7, paramArrayOfFloat6, n - 1 + paramInt13, i5);
          }
          else
          {
            Scopy.scopy(paramInt7, paramArrayOfFloat6, i - 1 + paramInt13, 1, paramArrayOfFloat6, k - 1 + paramInt13, 1);
            Sscal.sscal(paramInt7, f1 / f2, paramArrayOfFloat6, k - 1 + paramInt13, 1);
            Ssortr.ssortr("LA", true, localintW2.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat6, k - 1 + paramInt13);
          }
        }
        if (((paramBoolean) && (paramString1.regionMatches(0, "A", 0, 1)) ? 1 : 0) != 0)
        {
          Sgeqr2.sgeqr2(paramInt7, localintW2.val, paramArrayOfFloat6, n - 1 + paramInt13, i5, paramArrayOfFloat6, i1 + paramInt7 - 1 + paramInt13, paramArrayOfFloat6, k - 1 + paramInt13, localintW1);
          Sorm2r.sorm2r("Right", "Notranspose", paramInt5, paramInt7, localintW2.val, paramArrayOfFloat6, n - 1 + paramInt13, i5, paramArrayOfFloat6, i1 + paramInt7 - 1 + paramInt13, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, paramInt5 + 1 - 1 + paramInt12, localintW1);
          Slacpy.slacpy("All", paramInt5, localintW2.val, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat2, paramInt3, paramInt4);
          i2 = 1;
          for (i17 = paramInt7 - 1 - 1 + 1; i17 > 0; i17--)
          {
            paramArrayOfFloat6[(k + i2 - 1 - 1 + paramInt13)] = 0.0F;
            i2 += 1;
          }
          paramArrayOfFloat6[(k + paramInt7 - 1 - 1 + paramInt13)] = 1.0F;
          sorm2r_adapter("Left", "Transpose", paramInt7, 1, localintW2.val, paramArrayOfFloat6, n - 1 + paramInt13, i5, paramArrayOfFloat6, i1 + paramInt7 - 1 + paramInt13, paramArrayOfFloat6, k - 1 + paramInt13, paramInt7, localfloatW, localintW1);
        }
        else if (((paramBoolean) && (paramString1.regionMatches(0, "S", 0, 1)) ? 1 : 0) != 0) {}
        if (((str.regionMatches(0, "REGULR", 0, 6)) && (paramBoolean) ? 1 : 0) != 0)
        {
          i2 = 1;
          for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
          {
            paramArrayOfFloat6[(k + i2 - 1 - 1 + paramInt13)] = (f2 * Math.abs(paramArrayOfFloat6[(k + i2 - 1 - 1 + paramInt13)]));
            i2 += 1;
          }
        }
        else if ((((str.regionMatches(0, "REGULR", 0, 6) ^ true)) && (paramBoolean) ? 1 : 0) != 0)
        {
          Sscal.sscal(paramInt7, f1, paramArrayOfFloat6, k - 1 + paramInt13, 1);
          if (str.regionMatches(0, "SHIFTI", 0, 6))
          {
            i3 = 1;
            for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat6[(k + i3 - 1 - 1 + paramInt13)] = (Math.abs(paramArrayOfFloat6[(k + i3 - 1 - 1 + paramInt13)]) / (float)Math.pow(paramArrayOfFloat6[(i1 + i3 - 1 - 1 + paramInt13)], 2));
              i3 += 1;
            }
          }
          else if (str.regionMatches(0, "BUCKLE", 0, 6))
          {
            i3 = 1;
            for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
            {
              paramArrayOfFloat6[(k + i3 - 1 - 1 + paramInt13)] = (paramFloat1 * Math.abs(paramArrayOfFloat6[(k + i3 - 1 - 1 + paramInt13)]) / (float)Math.pow(paramArrayOfFloat6[(i1 + i3 - 1 - 1 + paramInt13)] - 1.0F, 2));
              i3 += 1;
            }
          }
          else if (str.regionMatches(0, "CAYLEY", 0, 6))
          {
            i3 = 1;
            i17 = paramInt7 - 1 + 1;
            for (;;)
            {
              paramArrayOfFloat6[(k + i3 - 1 - 1 + paramInt13)] = Math.abs(paramArrayOfFloat6[(k + i3 - 1 - 1 + paramInt13)] / paramArrayOfFloat6[(i1 + i3 - 1 - 1 + paramInt13)] * (paramArrayOfFloat6[(i1 + i3 - 1 - 1 + paramInt13)] - 1.0F));
              i3 += 1;
              i17--;
              if (i17 <= 0) {
                break;
              }
            }
          }
        }
        if ((str.regionMatches(0, "REGULR", 0, 6) ^ true)) {}
        if (((i7 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          Svout.svout(arpack_debug.logfil.val, localintW2.val, paramArrayOfFloat1, paramInt2, arpack_debug.ndigit.val, "_seupd: Untransformed converged Ritz values");
          Svout.svout(arpack_debug.logfil.val, localintW2.val, paramArrayOfFloat6, k - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Ritz estimates of the untransformed Ritz values");
        }
        else if ((i7 <= 1 ? 0 : 1) != 0)
        {
          Svout.svout(arpack_debug.logfil.val, localintW2.val, paramArrayOfFloat1, paramInt2, arpack_debug.ndigit.val, "_seupd: Converged Ritz values");
          Svout.svout(arpack_debug.logfil.val, localintW2.val, paramArrayOfFloat6, k - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Associated Ritz estimates");
        }
        if (paramBoolean) {}
        if ((((!str.regionMatches(0, "SHIFTI", 0, 6)) && (!str.regionMatches(0, "CAYLEY", 0, 6)) ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          i3 = 0;
          for (i17 = localintW2.val - 1 - 0 + 1; i17 > 0; i17--)
          {
            paramArrayOfFloat6[(i1 + i3 - 1 + paramInt13)] = (paramArrayOfFloat6[(n + i3 * i5 + paramInt7 - 1 - 1 + paramInt13)] / paramArrayOfFloat6[(i1 + i3 - 1 + paramInt13)]);
            i3 += 1;
          }
        }
        else if (((paramBoolean) && (str.regionMatches(0, "BUCKLE", 0, 6)) ? 1 : 0) != 0)
        {
          i3 = 0;
          i17 = localintW2.val - 1 - 0 + 1;
          for (;;)
          {
            paramArrayOfFloat6[(i1 + i3 - 1 + paramInt13)] = (paramArrayOfFloat6[(n + i3 * i5 + paramInt7 - 1 - 1 + paramInt13)] / (paramArrayOfFloat6[(i1 + i3 - 1 + paramInt13)] - 1.0F));
            i3 += 1;
            i17--;
            if (i17 <= 0) {
              break;
            }
          }
        }
        if ((str.regionMatches(0, "REGULR", 0, 6) ^ true)) {
          Sger.sger(paramInt5, localintW2.val, 1.0F, paramArrayOfFloat3, paramInt6, 1, paramArrayOfFloat6, i1 - 1 + paramInt13, 1, paramArrayOfFloat2, paramInt3, paramInt4);
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
  
  private static void sorm2r_adapter(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, floatW paramfloatW, intW paramintW)
  {
    float[] arrayOfFloat = { paramfloatW.val };
    Sorm2r.sorm2r(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt8, arrayOfFloat, 0, paramintW);
    paramfloatW.val = arrayOfFloat[0];
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Sseupd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */