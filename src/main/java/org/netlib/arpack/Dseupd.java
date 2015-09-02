package org.netlib.arpack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dger;
import org.netlib.blas.Dnrm2;
import org.netlib.blas.Dscal;
import org.netlib.lapack.Dgeqr2;
import org.netlib.lapack.Dlacpy;
import org.netlib.lapack.Dlamch;
import org.netlib.lapack.Dorm2r;
import org.netlib.lapack.Dsteqr;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dseupd
{
  public static float t0 = 0.0F;
  public static float t1 = 0.0F;
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void dseupd(boolean paramBoolean, String paramString1, boolean[] paramArrayOfBoolean, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double paramDouble1, String paramString2, int paramInt5, String paramString3, intW paramintW1, double paramDouble2, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, int[] paramArrayOfInt1, int paramInt10, int[] paramArrayOfInt2, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, double[] paramArrayOfDouble6, int paramInt13, int paramInt14, intW paramintW2)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW = new doubleW(0.0D);
    double d3 = 0.0D;
    double d4 = 0.0D;
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
        d4 = Dlamch.dlamch("Epsilon-Machine");
        d4 = Math.pow(d4, 2.0D / 3.0D);
        d2 = paramArrayOfDouble6[(j - 1 + paramInt13)];
        if (paramString2.regionMatches(0, "I", 0, 1)) {
          d1 = d2;
        } else if (paramString2.regionMatches(0, "G", 0, 1)) {
          d1 = Dnrm2.dnrm2(paramInt5, paramArrayOfDouble5, paramInt12, 1);
        }
        if ((i7 <= 2 ? 0 : 1) != 0)
        {
          Dvout.dvout(arpack_debug.logfil.val, paramInt7, paramArrayOfDouble6, i10 - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Ritz values passed in from _SAUPD.");
          Dvout.dvout(arpack_debug.logfil.val, paramInt7, paramArrayOfDouble6, i11 - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Ritz estimates passed in from _SAUPD.");
        }
        int i17;
        if (paramBoolean)
        {
          i16 = 0;
          i2 = 1;
          for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
          {
            paramArrayOfDouble6[(i + i2 - 1 - 1 + paramInt13)] = i2;
            paramArrayOfBoolean[(i2 - 1 + paramInt1)] = false;
            i2 += 1;
          }
          localintW3.val = (paramInt7 - paramintW1.val);
          i12 = 0;
          Dsgets.dsgets(i12, paramString3, paramintW1, localintW3, paramArrayOfDouble6, i10 - 1 + paramInt13, paramArrayOfDouble6, i - 1 + paramInt13, paramArrayOfDouble6, paramInt13);
          if ((i7 <= 2 ? 0 : 1) != 0)
          {
            Dvout.dvout(arpack_debug.logfil.val, paramInt7, paramArrayOfDouble6, i10 - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Ritz values after calling _SGETS.");
            Dvout.dvout(arpack_debug.logfil.val, paramInt7, paramArrayOfDouble6, i - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Ritz value indices after calling _SGETS.");
          }
          localintW4.val = 0;
          i2 = 1;
          for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
          {
            d3 = Math.max(d4, Math.abs(paramArrayOfDouble6[(i10 + paramInt7 - i2 - 1 + paramInt13)]));
            i15 = (int)paramArrayOfDouble6[(i + paramInt7 - i2 - 1 + paramInt13)];
            if ((localintW4.val >= localintW2.val ? 0 : 1) != 0) {}
            if (((paramArrayOfDouble6[(i11 + i15 - 1 - 1 + paramInt13)] > paramDouble2 * d3 ? 0 : 1) != 0 ? 1 : 0) != 0)
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
          Dcopy.dcopy(paramInt7 - 1, paramArrayOfDouble6, j + 1 - 1 + paramInt13, 1, paramArrayOfDouble6, k - 1 + paramInt13, 1);
          Dcopy.dcopy(paramInt7, paramArrayOfDouble6, j + i4 - 1 + paramInt13, 1, paramArrayOfDouble6, m - 1 + paramInt13, 1);
          Dsteqr.dsteqr("Identity", paramInt7, paramArrayOfDouble6, m - 1 + paramInt13, paramArrayOfDouble6, k - 1 + paramInt13, paramArrayOfDouble6, n - 1 + paramInt13, i5, paramArrayOfDouble6, i1 - 1 + paramInt13, localintW1);
          if ((localintW1.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = -8;
            return;
          }
          if ((i7 <= 1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(paramInt7, paramArrayOfDouble6, n + paramInt7 - 1 - 1 + paramInt13, i5, paramArrayOfDouble6, i1 - 1 + paramInt13, 1);
            Dvout.dvout(arpack_debug.logfil.val, paramInt7, paramArrayOfDouble6, m - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: NCV Ritz values of the final H matrix");
            Dvout.dvout(arpack_debug.logfil.val, paramInt7, paramArrayOfDouble6, i1 - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: last row of the eigenvector matrix for H");
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
                  localdoubleW.val = paramArrayOfDouble6[(m + i13 - 1 - 1 + paramInt13)];
                  paramArrayOfDouble6[(m + i13 - 1 - 1 + paramInt13)] = paramArrayOfDouble6[(m + i14 - 1 - 1 + paramInt13)];
                  paramArrayOfDouble6[(m + i14 - 1 - 1 + paramInt13)] = localdoubleW.val;
                  Dcopy.dcopy(paramInt7, paramArrayOfDouble6, n + paramInt7 * (i13 - 1) - 1 + paramInt13, 1, paramArrayOfDouble6, i1 - 1 + paramInt13, 1);
                  Dcopy.dcopy(paramInt7, paramArrayOfDouble6, n + paramInt7 * (i14 - 1) - 1 + paramInt13, 1, paramArrayOfDouble6, n + paramInt7 * (i13 - 1) - 1 + paramInt13, 1);
                  Dcopy.dcopy(paramInt7, paramArrayOfDouble6, i1 - 1 + paramInt13, 1, paramArrayOfDouble6, n + paramInt7 * (i14 - 1) - 1 + paramInt13, 1);
                  i13 += 1;
                  i14 -= 1;
                }
              } while ((i13 >= i14 ? 0 : 1) != 0);
            }
          }
          if ((i7 <= 2 ? 0 : 1) != 0) {
            Dvout.dvout(arpack_debug.logfil.val, paramInt7, paramArrayOfDouble6, m - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: The eigenvalues of H--reordered");
          }
          Dcopy.dcopy(localintW2.val, paramArrayOfDouble6, m - 1 + paramInt13, 1, paramArrayOfDouble1, paramInt2, 1);
        }
        else
        {
          Dcopy.dcopy(localintW2.val, paramArrayOfDouble6, i9 - 1 + paramInt13, 1, paramArrayOfDouble1, paramInt2, 1);
          Dcopy.dcopy(paramInt7, paramArrayOfDouble6, i9 - 1 + paramInt13, 1, paramArrayOfDouble6, m - 1 + paramInt13, 1);
        }
        if (str.regionMatches(0, "REGULR", 0, 6))
        {
          if (paramBoolean) {
            Dsesrt.dsesrt("LA", paramBoolean, localintW2.val, paramArrayOfDouble1, paramInt2, paramInt7, paramArrayOfDouble6, n - 1 + paramInt13, i5);
          } else {
            Dcopy.dcopy(paramInt7, paramArrayOfDouble6, i - 1 + paramInt13, 1, paramArrayOfDouble6, k - 1 + paramInt13, 1);
          }
        }
        else
        {
          Dcopy.dcopy(paramInt7, paramArrayOfDouble6, m - 1 + paramInt13, 1, paramArrayOfDouble6, i1 - 1 + paramInt13, 1);
          if (str.regionMatches(0, "SHIFTI", 0, 6))
          {
            i3 = 1;
            for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble6[(m + i3 - 1 - 1 + paramInt13)] = (1.0D / paramArrayOfDouble6[(m + i3 - 1 - 1 + paramInt13)] + paramDouble1);
              i3 += 1;
            }
          }
          else if (str.regionMatches(0, "BUCKLE", 0, 6))
          {
            i3 = 1;
            for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble6[(m + i3 - 1 - 1 + paramInt13)] = (paramDouble1 * paramArrayOfDouble6[(m + i3 - 1 - 1 + paramInt13)] / (paramArrayOfDouble6[(m + i3 - 1 - 1 + paramInt13)] - 1.0D));
              i3 += 1;
            }
          }
          else if (str.regionMatches(0, "CAYLEY", 0, 6))
          {
            i3 = 1;
            i17 = paramInt7 - 1 + 1;
            for (;;)
            {
              paramArrayOfDouble6[(m + i3 - 1 - 1 + paramInt13)] = (paramDouble1 * (paramArrayOfDouble6[(m + i3 - 1 - 1 + paramInt13)] + 1.0D) / (paramArrayOfDouble6[(m + i3 - 1 - 1 + paramInt13)] - 1.0D));
              i3 += 1;
              i17--;
              if (i17 <= 0) {
                break;
              }
            }
          }
          Dcopy.dcopy(localintW2.val, paramArrayOfDouble6, m - 1 + paramInt13, 1, paramArrayOfDouble1, paramInt2, 1);
          Dsortr.dsortr("LA", true, localintW2.val, paramArrayOfDouble6, m - 1 + paramInt13, paramArrayOfDouble6, i1 - 1 + paramInt13);
          if (paramBoolean)
          {
            Dsesrt.dsesrt("LA", paramBoolean, localintW2.val, paramArrayOfDouble1, paramInt2, paramInt7, paramArrayOfDouble6, n - 1 + paramInt13, i5);
          }
          else
          {
            Dcopy.dcopy(paramInt7, paramArrayOfDouble6, i - 1 + paramInt13, 1, paramArrayOfDouble6, k - 1 + paramInt13, 1);
            Dscal.dscal(paramInt7, d1 / d2, paramArrayOfDouble6, k - 1 + paramInt13, 1);
            Dsortr.dsortr("LA", true, localintW2.val, paramArrayOfDouble1, paramInt2, paramArrayOfDouble6, k - 1 + paramInt13);
          }
        }
        if (((paramBoolean) && (paramString1.regionMatches(0, "A", 0, 1)) ? 1 : 0) != 0)
        {
          Dgeqr2.dgeqr2(paramInt7, localintW2.val, paramArrayOfDouble6, n - 1 + paramInt13, i5, paramArrayOfDouble6, i1 + paramInt7 - 1 + paramInt13, paramArrayOfDouble6, k - 1 + paramInt13, localintW1);
          Dorm2r.dorm2r("Right", "Notranspose", paramInt5, paramInt7, localintW2.val, paramArrayOfDouble6, n - 1 + paramInt13, i5, paramArrayOfDouble6, i1 + paramInt7 - 1 + paramInt13, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, paramInt5 + 1 - 1 + paramInt12, localintW1);
          Dlacpy.dlacpy("All", paramInt5, localintW2.val, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble2, paramInt3, paramInt4);
          i2 = 1;
          for (i17 = paramInt7 - 1 - 1 + 1; i17 > 0; i17--)
          {
            paramArrayOfDouble6[(k + i2 - 1 - 1 + paramInt13)] = 0.0D;
            i2 += 1;
          }
          paramArrayOfDouble6[(k + paramInt7 - 1 - 1 + paramInt13)] = 1.0D;
          dorm2r_adapter("Left", "Transpose", paramInt7, 1, localintW2.val, paramArrayOfDouble6, n - 1 + paramInt13, i5, paramArrayOfDouble6, i1 + paramInt7 - 1 + paramInt13, paramArrayOfDouble6, k - 1 + paramInt13, paramInt7, localdoubleW, localintW1);
        }
        else if (((paramBoolean) && (paramString1.regionMatches(0, "S", 0, 1)) ? 1 : 0) != 0) {}
        if (((str.regionMatches(0, "REGULR", 0, 6)) && (paramBoolean) ? 1 : 0) != 0)
        {
          i2 = 1;
          for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
          {
            paramArrayOfDouble6[(k + i2 - 1 - 1 + paramInt13)] = (d2 * Math.abs(paramArrayOfDouble6[(k + i2 - 1 - 1 + paramInt13)]));
            i2 += 1;
          }
        }
        else if ((((str.regionMatches(0, "REGULR", 0, 6) ^ true)) && (paramBoolean) ? 1 : 0) != 0)
        {
          Dscal.dscal(paramInt7, d1, paramArrayOfDouble6, k - 1 + paramInt13, 1);
          if (str.regionMatches(0, "SHIFTI", 0, 6))
          {
            i3 = 1;
            for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble6[(k + i3 - 1 - 1 + paramInt13)] = (Math.abs(paramArrayOfDouble6[(k + i3 - 1 - 1 + paramInt13)]) / Math.pow(paramArrayOfDouble6[(i1 + i3 - 1 - 1 + paramInt13)], 2));
              i3 += 1;
            }
          }
          else if (str.regionMatches(0, "BUCKLE", 0, 6))
          {
            i3 = 1;
            for (i17 = paramInt7 - 1 + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble6[(k + i3 - 1 - 1 + paramInt13)] = (paramDouble1 * Math.abs(paramArrayOfDouble6[(k + i3 - 1 - 1 + paramInt13)]) / Math.pow(paramArrayOfDouble6[(i1 + i3 - 1 - 1 + paramInt13)] - 1.0D, 2));
              i3 += 1;
            }
          }
          else if (str.regionMatches(0, "CAYLEY", 0, 6))
          {
            i3 = 1;
            i17 = paramInt7 - 1 + 1;
            for (;;)
            {
              paramArrayOfDouble6[(k + i3 - 1 - 1 + paramInt13)] = Math.abs(paramArrayOfDouble6[(k + i3 - 1 - 1 + paramInt13)] / paramArrayOfDouble6[(i1 + i3 - 1 - 1 + paramInt13)] * (paramArrayOfDouble6[(i1 + i3 - 1 - 1 + paramInt13)] - 1.0D));
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
          Dvout.dvout(arpack_debug.logfil.val, localintW2.val, paramArrayOfDouble1, paramInt2, arpack_debug.ndigit.val, "_seupd: Untransformed converged Ritz values");
          Dvout.dvout(arpack_debug.logfil.val, localintW2.val, paramArrayOfDouble6, k - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Ritz estimates of the untransformed Ritz values");
        }
        else if ((i7 <= 1 ? 0 : 1) != 0)
        {
          Dvout.dvout(arpack_debug.logfil.val, localintW2.val, paramArrayOfDouble1, paramInt2, arpack_debug.ndigit.val, "_seupd: Converged Ritz values");
          Dvout.dvout(arpack_debug.logfil.val, localintW2.val, paramArrayOfDouble6, k - 1 + paramInt13, arpack_debug.ndigit.val, "_seupd: Associated Ritz estimates");
        }
        if (paramBoolean) {}
        if ((((!str.regionMatches(0, "SHIFTI", 0, 6)) && (!str.regionMatches(0, "CAYLEY", 0, 6)) ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          i3 = 0;
          for (i17 = localintW2.val - 1 - 0 + 1; i17 > 0; i17--)
          {
            paramArrayOfDouble6[(i1 + i3 - 1 + paramInt13)] = (paramArrayOfDouble6[(n + i3 * i5 + paramInt7 - 1 - 1 + paramInt13)] / paramArrayOfDouble6[(i1 + i3 - 1 + paramInt13)]);
            i3 += 1;
          }
        }
        else if (((paramBoolean) && (str.regionMatches(0, "BUCKLE", 0, 6)) ? 1 : 0) != 0)
        {
          i3 = 0;
          i17 = localintW2.val - 1 - 0 + 1;
          for (;;)
          {
            paramArrayOfDouble6[(i1 + i3 - 1 + paramInt13)] = (paramArrayOfDouble6[(n + i3 * i5 + paramInt7 - 1 - 1 + paramInt13)] / (paramArrayOfDouble6[(i1 + i3 - 1 + paramInt13)] - 1.0D));
            i3 += 1;
            i17--;
            if (i17 <= 0) {
              break;
            }
          }
        }
        if ((str.regionMatches(0, "REGULR", 0, 6) ^ true)) {
          Dger.dger(paramInt5, localintW2.val, 1.0D, paramArrayOfDouble3, paramInt6, 1, paramArrayOfDouble6, i1 - 1 + paramInt13, 1, paramArrayOfDouble2, paramInt3, paramInt4);
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
  
  private static void dorm2r_adapter(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, doubleW paramdoubleW, intW paramintW)
  {
    double[] arrayOfDouble = { paramdoubleW.val };
    Dorm2r.dorm2r(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramInt8, arrayOfDouble, 0, paramintW);
    paramdoubleW.val = arrayOfDouble[0];
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dseupd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */