package org.netlib.lapack;

import org.netlib.blas.Ddot;
import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtrsyl
{
  public static void dtrsyl(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, doubleW paramdoubleW, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    intW localintW = new intW(0);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    double d1 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d5 = 0.0D;
    double d6 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d7 = 0.0D;
    double d8 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    double[] arrayOfDouble1 = new double[1];
    double[] arrayOfDouble2 = new double[2 * 2];
    double[] arrayOfDouble3 = new double[2 * 2];
    bool1 = Lsame.lsame(paramString1, "N");
    bool2 = Lsame.lsame(paramString2, "N");
    paramintW.val = 0;
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "T") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString1, "C") ^ true) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0)
      {
        paramintW.val = -2;
      }
      else
      {
        if ((paramInt1 == 1 ? 0 : 1) != 0) {}
        if (((paramInt1 == -1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -3;
        } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
          paramintW.val = -4;
        } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
          paramintW.val = -5;
        } else if ((paramInt5 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
          paramintW.val = -7;
        } else if ((paramInt7 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
          paramintW.val = -9;
        } else if ((paramInt9 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
          paramintW.val = -11;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTRSYL", -paramintW.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    d4 = Dlamch.dlamch("P");
    localdoubleW3.val = Dlamch.dlamch("S");
    localdoubleW1.val = (1.0D / localdoubleW3.val);
    Dlabad.dlabad(localdoubleW3, localdoubleW1);
    localdoubleW3.val = (localdoubleW3.val * (paramInt2 * paramInt3) / d4);
    localdoubleW1.val = (1.0D / localdoubleW3.val);
    d6 = Util.max(localdoubleW3.val, d4 * Dlange.dlange("M", paramInt2, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, arrayOfDouble1, 0), d4 * Dlange.dlange("M", paramInt3, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, arrayOfDouble1, 0));
    paramdoubleW.val = 1.0D;
    d5 = paramInt1;
    int i5;
    int i6;
    int i7;
    if (((bool1) && (bool2) ? 1 : 0) != 0)
    {
      i4 = 1;
      i1 = 1;
      for (i5 = paramInt3 - 1 + 1; i5 > 0; i5--)
      {
        if ((i1 >= i4 ? 0 : 1) == 0)
        {
          if ((i1 != paramInt3 ? 0 : 1) != 0)
          {
            i2 = i1;
            i3 = i1;
          }
          else if ((paramArrayOfDouble2[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] == 0.0D ? 0 : 1) != 0)
          {
            i2 = i1;
            i3 = i1 + 1;
            i4 = i1 + 2;
          }
          else
          {
            i2 = i1;
            i3 = i1;
            i4 = i1 + 1;
          }
          n = paramInt2;
          j = paramInt2;
          for (i6 = (1 - paramInt2 + -1) / -1; i6 > 0; i6--)
          {
            if ((j <= n ? 0 : 1) == 0)
            {
              if ((j != 1 ? 0 : 1) != 0)
              {
                k = j;
                m = j;
              }
              else if ((paramArrayOfDouble1[(j - 1 + (j - 1 - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) != 0)
              {
                k = j - 1;
                m = j;
                n = j - 2;
              }
              else
              {
                k = j;
                m = j;
                n = j - 1;
              }
              if ((i2 != i3 ? 0 : 1) != 0) {}
              if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                d7 = Ddot.ddot(paramInt2 - k, paramArrayOfDouble1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(k + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                localdoubleW2.val = 1.0D;
                d1 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt5 + paramInt4)] + d5 * paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
                d2 = Math.abs(d1);
                if ((d2 > d6 ? 0 : 1) != 0)
                {
                  d1 = d6;
                  d2 = d6;
                  paramintW.val = 1;
                }
                d3 = Math.abs(arrayOfDouble2[(1 - 1 + (1 - 1) * 2)]);
                if ((d2 >= 1.0D ? 0 : 1) != 0) {}
                if (((d3 <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  if ((d3 <= localdoubleW1.val * d2 ? 0 : 1) != 0) {
                    localdoubleW2.val = (1.0D / d3);
                  }
                }
                arrayOfDouble3[(1 - 1 + (1 - 1) * 2)] = (arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] * localdoubleW2.val / d1);
                if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                {
                  i = 1;
                  for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                  {
                    Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                    i += 1;
                  }
                  paramdoubleW.val *= localdoubleW2.val;
                }
                paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
              }
              else
              {
                if ((i2 != i3 ? 0 : 1) != 0) {}
                if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                  arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                  d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                  arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                  Dlaln2.dlaln2(false, 2, 1, d6, 1.0D, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, 1.0D, arrayOfDouble2, 0, 2, -(d5 * paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)]), 0.0D, arrayOfDouble3, 0, 2, localdoubleW2, localdoubleW4, localintW);
                  if ((localintW.val == 0 ? 0 : 1) != 0) {
                    paramintW.val = 1;
                  }
                  if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                  {
                    i = 1;
                    for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                    {
                      Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                      i += 1;
                    }
                    paramdoubleW.val *= localdoubleW2.val;
                  }
                  paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                  paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                }
                else
                {
                  if ((i2 == i3 ? 0 : 1) != 0) {}
                  if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    d7 = Ddot.ddot(paramInt2 - k, paramArrayOfDouble1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(k + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                    d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                    arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (d5 * (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8)));
                    d7 = Ddot.ddot(paramInt2 - k, paramArrayOfDouble1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(k + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                    d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                    arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (d5 * (paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8)));
                    Dlaln2.dlaln2(true, 2, 1, d6, 1.0D, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, 1.0D, arrayOfDouble2, 0, 2, -(d5 * paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt5 + paramInt4)]), 0.0D, arrayOfDouble3, 0, 2, localdoubleW2, localdoubleW4, localintW);
                    if ((localintW.val == 0 ? 0 : 1) != 0) {
                      paramintW.val = 1;
                    }
                    if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                    {
                      i = 1;
                      for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                      {
                        Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                        i += 1;
                      }
                      paramdoubleW.val *= localdoubleW2.val;
                    }
                    paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                    paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                  }
                  else
                  {
                    if ((i2 == i3 ? 0 : 1) != 0) {}
                    if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                    {
                      d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfDouble2[(1 - 1 + (2 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfDouble2[(2 - 1 + (2 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      Dlasy2.dlasy2(false, false, paramInt1, 2, 2, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, arrayOfDouble2, 0, 2, localdoubleW2, arrayOfDouble3, 0, 2, localdoubleW4, localintW);
                      if ((localintW.val == 0 ? 0 : 1) != 0) {
                        paramintW.val = 1;
                      }
                      if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                      {
                        i = 1;
                        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                        {
                          Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                          i += 1;
                        }
                        paramdoubleW.val *= localdoubleW2.val;
                      }
                      paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                      paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (2 - 1) * 2)];
                      paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                      paramArrayOfDouble3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (2 - 1) * 2)];
                    }
                  }
                }
              }
            }
            j += -1;
          }
        }
        i1 += 1;
      }
    }
    else if ((((bool1 ^ true)) && (bool2) ? 1 : 0) != 0)
    {
      i4 = 1;
      i1 = 1;
      for (i5 = paramInt3 - 1 + 1; i5 > 0; i5--)
      {
        if ((i1 >= i4 ? 0 : 1) == 0)
        {
          if ((i1 != paramInt3 ? 0 : 1) != 0)
          {
            i2 = i1;
            i3 = i1;
          }
          else if ((paramArrayOfDouble2[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] == 0.0D ? 0 : 1) != 0)
          {
            i2 = i1;
            i3 = i1 + 1;
            i4 = i1 + 2;
          }
          else
          {
            i2 = i1;
            i3 = i1;
            i4 = i1 + 1;
          }
          n = 1;
          j = 1;
          for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
          {
            if ((j >= n ? 0 : 1) == 0)
            {
              if ((j != paramInt2 ? 0 : 1) != 0)
              {
                k = j;
                m = j;
              }
              else if ((paramArrayOfDouble1[(j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) != 0)
              {
                k = j;
                m = j + 1;
                n = j + 2;
              }
              else
              {
                k = j;
                m = j;
                n = j + 1;
              }
              if ((i2 != i3 ? 0 : 1) != 0) {}
              if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                localdoubleW2.val = 1.0D;
                d1 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt5 + paramInt4)] + d5 * paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
                d2 = Math.abs(d1);
                if ((d2 > d6 ? 0 : 1) != 0)
                {
                  d1 = d6;
                  d2 = d6;
                  paramintW.val = 1;
                }
                d3 = Math.abs(arrayOfDouble2[(1 - 1 + (1 - 1) * 2)]);
                if ((d2 >= 1.0D ? 0 : 1) != 0) {}
                if (((d3 <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  if ((d3 <= localdoubleW1.val * d2 ? 0 : 1) != 0) {
                    localdoubleW2.val = (1.0D / d3);
                  }
                }
                arrayOfDouble3[(1 - 1 + (1 - 1) * 2)] = (arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] * localdoubleW2.val / d1);
                if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                {
                  i = 1;
                  for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                  {
                    Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                    i += 1;
                  }
                  paramdoubleW.val *= localdoubleW2.val;
                }
                paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
              }
              else
              {
                if ((i2 != i3 ? 0 : 1) != 0) {}
                if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                  arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                  d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                  arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                  Dlaln2.dlaln2(true, 2, 1, d6, 1.0D, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, 1.0D, arrayOfDouble2, 0, 2, -(d5 * paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)]), 0.0D, arrayOfDouble3, 0, 2, localdoubleW2, localdoubleW4, localintW);
                  if ((localintW.val == 0 ? 0 : 1) != 0) {
                    paramintW.val = 1;
                  }
                  if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                  {
                    i = 1;
                    for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                    {
                      Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                      i += 1;
                    }
                    paramdoubleW.val *= localdoubleW2.val;
                  }
                  paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                  paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                }
                else
                {
                  if ((i2 == i3 ? 0 : 1) != 0) {}
                  if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                    d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                    arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (d5 * (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8)));
                    d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                    d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                    arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (d5 * (paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8)));
                    Dlaln2.dlaln2(true, 2, 1, d6, 1.0D, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, 1.0D, arrayOfDouble2, 0, 2, -(d5 * paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt5 + paramInt4)]), 0.0D, arrayOfDouble3, 0, 2, localdoubleW2, localdoubleW4, localintW);
                    if ((localintW.val == 0 ? 0 : 1) != 0) {
                      paramintW.val = 1;
                    }
                    if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                    {
                      i = 1;
                      for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                      {
                        Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                        i += 1;
                      }
                      paramdoubleW.val *= localdoubleW2.val;
                    }
                    paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                    paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                  }
                  else
                  {
                    if ((i2 == i3 ? 0 : 1) != 0) {}
                    if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                    {
                      d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfDouble2[(1 - 1 + (2 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(i2 - 1, paramArrayOfDouble3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfDouble2[(2 - 1 + (2 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      Dlasy2.dlasy2(true, false, paramInt1, 2, 2, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, arrayOfDouble2, 0, 2, localdoubleW2, arrayOfDouble3, 0, 2, localdoubleW4, localintW);
                      if ((localintW.val == 0 ? 0 : 1) != 0) {
                        paramintW.val = 1;
                      }
                      if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                      {
                        i = 1;
                        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                        {
                          Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                          i += 1;
                        }
                        paramdoubleW.val *= localdoubleW2.val;
                      }
                      paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                      paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (2 - 1) * 2)];
                      paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                      paramArrayOfDouble3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (2 - 1) * 2)];
                    }
                  }
                }
              }
            }
            j += 1;
          }
        }
        i1 += 1;
      }
    }
    else if ((((bool1 ^ true)) && ((bool2 ^ true)) ? 1 : 0) != 0)
    {
      i4 = paramInt3;
      i1 = paramInt3;
      for (i5 = (1 - paramInt3 + -1) / -1; i5 > 0; i5--)
      {
        if ((i1 <= i4 ? 0 : 1) == 0)
        {
          if ((i1 != 1 ? 0 : 1) != 0)
          {
            i2 = i1;
            i3 = i1;
          }
          else if ((paramArrayOfDouble2[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] == 0.0D ? 0 : 1) != 0)
          {
            i2 = i1 - 1;
            i3 = i1;
            i4 = i1 - 2;
          }
          else
          {
            i2 = i1;
            i3 = i1;
            i4 = i1 - 1;
          }
          n = 1;
          j = 1;
          for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
          {
            if ((j >= n ? 0 : 1) == 0)
            {
              if ((j != paramInt2 ? 0 : 1) != 0)
              {
                k = j;
                m = j;
              }
              else if ((paramArrayOfDouble1[(j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) != 0)
              {
                k = j;
                m = j + 1;
                n = j + 2;
              }
              else
              {
                k = j;
                m = j;
                n = j + 1;
              }
              if ((i2 != i3 ? 0 : 1) != 0) {}
              if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                d8 = Ddot.ddot(paramInt3 - i2, paramArrayOfDouble3, k - 1 + (Math.min(i2 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i2 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                localdoubleW2.val = 1.0D;
                d1 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt5 + paramInt4)] + d5 * paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
                d2 = Math.abs(d1);
                if ((d2 > d6 ? 0 : 1) != 0)
                {
                  d1 = d6;
                  d2 = d6;
                  paramintW.val = 1;
                }
                d3 = Math.abs(arrayOfDouble2[(1 - 1 + (1 - 1) * 2)]);
                if ((d2 >= 1.0D ? 0 : 1) != 0) {}
                if (((d3 <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  if ((d3 <= localdoubleW1.val * d2 ? 0 : 1) != 0) {
                    localdoubleW2.val = (1.0D / d3);
                  }
                }
                arrayOfDouble3[(1 - 1 + (1 - 1) * 2)] = (arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] * localdoubleW2.val / d1);
                if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                {
                  i = 1;
                  for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                  {
                    Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                    i += 1;
                  }
                  paramdoubleW.val *= localdoubleW2.val;
                }
                paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
              }
              else
              {
                if ((i2 != i3 ? 0 : 1) != 0) {}
                if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                  arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                  d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                  arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                  Dlaln2.dlaln2(true, 2, 1, d6, 1.0D, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, 1.0D, arrayOfDouble2, 0, 2, -(d5 * paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)]), 0.0D, arrayOfDouble3, 0, 2, localdoubleW2, localdoubleW4, localintW);
                  if ((localintW.val == 0 ? 0 : 1) != 0) {
                    paramintW.val = 1;
                  }
                  if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                  {
                    i = 1;
                    for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                    {
                      Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                      i += 1;
                    }
                    paramdoubleW.val *= localdoubleW2.val;
                  }
                  paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                  paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                }
                else
                {
                  if ((i2 == i3 ? 0 : 1) != 0) {}
                  if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                    d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                    arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (d5 * (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8)));
                    d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                    d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                    arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (d5 * (paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8)));
                    Dlaln2.dlaln2(false, 2, 1, d6, 1.0D, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, 1.0D, arrayOfDouble2, 0, 2, -(d5 * paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt5 + paramInt4)]), 0.0D, arrayOfDouble3, 0, 2, localdoubleW2, localdoubleW4, localintW);
                    if ((localintW.val == 0 ? 0 : 1) != 0) {
                      paramintW.val = 1;
                    }
                    if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                    {
                      i = 1;
                      for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                      {
                        Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                        i += 1;
                      }
                      paramdoubleW.val *= localdoubleW2.val;
                    }
                    paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                    paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                  }
                  else
                  {
                    if ((i2 == i3 ? 0 : 1) != 0) {}
                    if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                    {
                      d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfDouble2[(1 - 1 + (2 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfDouble2[(2 - 1 + (2 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      Dlasy2.dlasy2(true, true, paramInt1, 2, 2, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, arrayOfDouble2, 0, 2, localdoubleW2, arrayOfDouble3, 0, 2, localdoubleW4, localintW);
                      if ((localintW.val == 0 ? 0 : 1) != 0) {
                        paramintW.val = 1;
                      }
                      if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                      {
                        i = 1;
                        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                        {
                          Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                          i += 1;
                        }
                        paramdoubleW.val *= localdoubleW2.val;
                      }
                      paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                      paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (2 - 1) * 2)];
                      paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                      paramArrayOfDouble3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (2 - 1) * 2)];
                    }
                  }
                }
              }
            }
            j += 1;
          }
        }
        i1 += -1;
      }
    }
    else if (((bool1) && ((bool2 ^ true)) ? 1 : 0) != 0)
    {
      i4 = paramInt3;
      i1 = paramInt3;
      i5 = (1 - paramInt3 + -1) / -1;
      for (;;)
      {
        if ((i1 <= i4 ? 0 : 1) == 0)
        {
          if ((i1 != 1 ? 0 : 1) != 0)
          {
            i2 = i1;
            i3 = i1;
          }
          else if ((paramArrayOfDouble2[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] == 0.0D ? 0 : 1) != 0)
          {
            i2 = i1 - 1;
            i3 = i1;
            i4 = i1 - 2;
          }
          else
          {
            i2 = i1;
            i3 = i1;
            i4 = i1 - 1;
          }
          n = paramInt2;
          j = paramInt2;
          for (i6 = (1 - paramInt2 + -1) / -1; i6 > 0; i6--)
          {
            if ((j <= n ? 0 : 1) == 0)
            {
              if ((j != 1 ? 0 : 1) != 0)
              {
                k = j;
                m = j;
              }
              else if ((paramArrayOfDouble1[(j - 1 + (j - 1 - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) != 0)
              {
                k = j - 1;
                m = j;
                n = j - 2;
              }
              else
              {
                k = j;
                m = j;
                n = j - 1;
              }
              if ((i2 != i3 ? 0 : 1) != 0) {}
              if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                d7 = Ddot.ddot(paramInt2 - k, paramArrayOfDouble1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(k + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                d8 = Ddot.ddot(paramInt3 - i2, paramArrayOfDouble3, k - 1 + (Math.min(i2 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i2 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                localdoubleW2.val = 1.0D;
                d1 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt5 + paramInt4)] + d5 * paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
                d2 = Math.abs(d1);
                if ((d2 > d6 ? 0 : 1) != 0)
                {
                  d1 = d6;
                  d2 = d6;
                  paramintW.val = 1;
                }
                d3 = Math.abs(arrayOfDouble2[(1 - 1 + (1 - 1) * 2)]);
                if ((d2 >= 1.0D ? 0 : 1) != 0) {}
                if (((d3 <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  if ((d3 <= localdoubleW1.val * d2 ? 0 : 1) != 0) {
                    localdoubleW2.val = (1.0D / d3);
                  }
                }
                arrayOfDouble3[(1 - 1 + (1 - 1) * 2)] = (arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] * localdoubleW2.val / d1);
                if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                {
                  i = 1;
                  for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                  {
                    Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                    i += 1;
                  }
                  paramdoubleW.val *= localdoubleW2.val;
                }
                paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
              }
              else
              {
                if ((i2 != i3 ? 0 : 1) != 0) {}
                if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                  arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                  d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                  arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                  Dlaln2.dlaln2(false, 2, 1, d6, 1.0D, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, 1.0D, arrayOfDouble2, 0, 2, -(d5 * paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)]), 0.0D, arrayOfDouble3, 0, 2, localdoubleW2, localdoubleW4, localintW);
                  if ((localintW.val == 0 ? 0 : 1) != 0) {
                    paramintW.val = 1;
                  }
                  if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                  {
                    i = 1;
                    for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                    {
                      Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                      i += 1;
                    }
                    paramdoubleW.val *= localdoubleW2.val;
                  }
                  paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                  paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                }
                else
                {
                  if ((i2 == i3 ? 0 : 1) != 0) {}
                  if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    d7 = Ddot.ddot(paramInt2 - k, paramArrayOfDouble1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(k + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                    d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                    arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (d5 * (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8)));
                    d7 = Ddot.ddot(paramInt2 - k, paramArrayOfDouble1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(k + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                    d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                    arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (d5 * (paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8)));
                    Dlaln2.dlaln2(false, 2, 1, d6, 1.0D, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, 1.0D, arrayOfDouble2, 0, 2, -(d5 * paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt5 + paramInt4)]), 0.0D, arrayOfDouble3, 0, 2, localdoubleW2, localdoubleW4, localintW);
                    if ((localintW.val == 0 ? 0 : 1) != 0) {
                      paramintW.val = 1;
                    }
                    if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                    {
                      i = 1;
                      for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                      {
                        Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                        i += 1;
                      }
                      paramdoubleW.val *= localdoubleW2.val;
                    }
                    paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                    paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                  }
                  else
                  {
                    if ((i2 == i3 ? 0 : 1) != 0) {}
                    if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                    {
                      d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfDouble2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfDouble2[(1 - 1 + (2 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfDouble2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      d7 = Ddot.ddot(paramInt2 - m, paramArrayOfDouble1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, Math.min(m + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      d8 = Ddot.ddot(paramInt3 - i3, paramArrayOfDouble3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfDouble2[(2 - 1 + (2 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (d7 + d5 * d8));
                      Dlasy2.dlasy2(false, true, paramInt1, 2, 2, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, arrayOfDouble2, 0, 2, localdoubleW2, arrayOfDouble3, 0, 2, localdoubleW4, localintW);
                      if ((localintW.val == 0 ? 0 : 1) != 0) {
                        paramintW.val = 1;
                      }
                      if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
                      {
                        i = 1;
                        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                        {
                          Dscal.dscal(paramInt2, localdoubleW2.val, paramArrayOfDouble3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                          i += 1;
                        }
                        paramdoubleW.val *= localdoubleW2.val;
                      }
                      paramArrayOfDouble3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (1 - 1) * 2)];
                      paramArrayOfDouble3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(1 - 1 + (2 - 1) * 2)];
                      paramArrayOfDouble3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (1 - 1) * 2)];
                      paramArrayOfDouble3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfDouble3[(2 - 1 + (2 - 1) * 2)];
                    }
                  }
                }
              }
            }
            j += -1;
          }
        }
        i1 += -1;
        i5--;
        if (i5 <= 0) {
          break;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtrsyl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */