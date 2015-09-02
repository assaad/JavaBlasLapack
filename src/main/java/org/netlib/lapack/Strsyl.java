package org.netlib.lapack;

import org.netlib.blas.Sdot;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Strsyl
{
  public static void strsyl(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, floatW paramfloatW, intW paramintW)
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
    float f1 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f5 = 0.0F;
    float f6 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    float f7 = 0.0F;
    float f8 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    float[] arrayOfFloat1 = new float[1];
    float[] arrayOfFloat2 = new float[2 * 2];
    float[] arrayOfFloat3 = new float[2 * 2];
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
      Xerbla.xerbla("STRSYL", -paramintW.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    f4 = Slamch.slamch("P");
    localfloatW3.val = Slamch.slamch("S");
    localfloatW1.val = (1.0F / localfloatW3.val);
    Slabad.slabad(localfloatW3, localfloatW1);
    localfloatW3.val = (localfloatW3.val * (paramInt2 * paramInt3) / f4);
    localfloatW1.val = (1.0F / localfloatW3.val);
    f6 = Util.max(localfloatW3.val, f4 * Slange.slange("M", paramInt2, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, arrayOfFloat1, 0), f4 * Slange.slange("M", paramInt3, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, arrayOfFloat1, 0));
    paramfloatW.val = 1.0F;
    f5 = paramInt1;
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
          else if ((paramArrayOfFloat2[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] == 0.0F ? 0 : 1) != 0)
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
              else if ((paramArrayOfFloat1[(j - 1 + (j - 1 - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) != 0)
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
                f7 = Sdot.sdot(paramInt2 - k, paramArrayOfFloat1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(k + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                localfloatW2.val = 1.0F;
                f1 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
                f2 = Math.abs(f1);
                if ((f2 > f6 ? 0 : 1) != 0)
                {
                  f1 = f6;
                  f2 = f6;
                  paramintW.val = 1;
                }
                f3 = Math.abs(arrayOfFloat2[(1 - 1 + (1 - 1) * 2)]);
                if ((f2 >= 1.0F ? 0 : 1) != 0) {}
                if (((f3 <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  if ((f3 <= localfloatW1.val * f2 ? 0 : 1) != 0) {
                    localfloatW2.val = (1.0F / f3);
                  }
                }
                arrayOfFloat3[(1 - 1 + (1 - 1) * 2)] = (arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] * localfloatW2.val / f1);
                if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                {
                  i = 1;
                  for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                  {
                    Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                    i += 1;
                  }
                  paramfloatW.val *= localfloatW2.val;
                }
                paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
              }
              else
              {
                if ((i2 != i3 ? 0 : 1) != 0) {}
                if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                  arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                  f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                  arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                  Slaln2.slaln2(false, 2, 1, f6, 1.0F, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, 1.0F, arrayOfFloat2, 0, 2, -(f5 * paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)]), 0.0F, arrayOfFloat3, 0, 2, localfloatW2, localfloatW4, localintW);
                  if ((localintW.val == 0 ? 0 : 1) != 0) {
                    paramintW.val = 1;
                  }
                  if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                  {
                    i = 1;
                    for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                    {
                      Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                      i += 1;
                    }
                    paramfloatW.val *= localfloatW2.val;
                  }
                  paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                  paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                }
                else
                {
                  if ((i2 == i3 ? 0 : 1) != 0) {}
                  if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    f7 = Sdot.sdot(paramInt2 - k, paramArrayOfFloat1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(k + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                    f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                    arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (f5 * (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8)));
                    f7 = Sdot.sdot(paramInt2 - k, paramArrayOfFloat1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(k + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                    f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                    arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (f5 * (paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8)));
                    Slaln2.slaln2(true, 2, 1, f6, 1.0F, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, 1.0F, arrayOfFloat2, 0, 2, -(f5 * paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt5 + paramInt4)]), 0.0F, arrayOfFloat3, 0, 2, localfloatW2, localfloatW4, localintW);
                    if ((localintW.val == 0 ? 0 : 1) != 0) {
                      paramintW.val = 1;
                    }
                    if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                    {
                      i = 1;
                      for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                      {
                        Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                        i += 1;
                      }
                      paramfloatW.val *= localfloatW2.val;
                    }
                    paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                    paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                  }
                  else
                  {
                    if ((i2 == i3 ? 0 : 1) != 0) {}
                    if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                    {
                      f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfFloat2[(1 - 1 + (2 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfFloat2[(2 - 1 + (2 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      Slasy2.slasy2(false, false, paramInt1, 2, 2, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, arrayOfFloat2, 0, 2, localfloatW2, arrayOfFloat3, 0, 2, localfloatW4, localintW);
                      if ((localintW.val == 0 ? 0 : 1) != 0) {
                        paramintW.val = 1;
                      }
                      if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                      {
                        i = 1;
                        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                        {
                          Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                          i += 1;
                        }
                        paramfloatW.val *= localfloatW2.val;
                      }
                      paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                      paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (2 - 1) * 2)];
                      paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                      paramArrayOfFloat3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (2 - 1) * 2)];
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
          else if ((paramArrayOfFloat2[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] == 0.0F ? 0 : 1) != 0)
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
              else if ((paramArrayOfFloat1[(j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) != 0)
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
                f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                localfloatW2.val = 1.0F;
                f1 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
                f2 = Math.abs(f1);
                if ((f2 > f6 ? 0 : 1) != 0)
                {
                  f1 = f6;
                  f2 = f6;
                  paramintW.val = 1;
                }
                f3 = Math.abs(arrayOfFloat2[(1 - 1 + (1 - 1) * 2)]);
                if ((f2 >= 1.0F ? 0 : 1) != 0) {}
                if (((f3 <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  if ((f3 <= localfloatW1.val * f2 ? 0 : 1) != 0) {
                    localfloatW2.val = (1.0F / f3);
                  }
                }
                arrayOfFloat3[(1 - 1 + (1 - 1) * 2)] = (arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] * localfloatW2.val / f1);
                if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                {
                  i = 1;
                  for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                  {
                    Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                    i += 1;
                  }
                  paramfloatW.val *= localfloatW2.val;
                }
                paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
              }
              else
              {
                if ((i2 != i3 ? 0 : 1) != 0) {}
                if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                  arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                  f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                  arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                  Slaln2.slaln2(true, 2, 1, f6, 1.0F, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, 1.0F, arrayOfFloat2, 0, 2, -(f5 * paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)]), 0.0F, arrayOfFloat3, 0, 2, localfloatW2, localfloatW4, localintW);
                  if ((localintW.val == 0 ? 0 : 1) != 0) {
                    paramintW.val = 1;
                  }
                  if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                  {
                    i = 1;
                    for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                    {
                      Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                      i += 1;
                    }
                    paramfloatW.val *= localfloatW2.val;
                  }
                  paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                  paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                }
                else
                {
                  if ((i2 == i3 ? 0 : 1) != 0) {}
                  if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                    f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                    arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (f5 * (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8)));
                    f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                    f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                    arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (f5 * (paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8)));
                    Slaln2.slaln2(true, 2, 1, f6, 1.0F, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, 1.0F, arrayOfFloat2, 0, 2, -(f5 * paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt5 + paramInt4)]), 0.0F, arrayOfFloat3, 0, 2, localfloatW2, localfloatW4, localintW);
                    if ((localintW.val == 0 ? 0 : 1) != 0) {
                      paramintW.val = 1;
                    }
                    if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                    {
                      i = 1;
                      for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                      {
                        Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                        i += 1;
                      }
                      paramfloatW.val *= localfloatW2.val;
                    }
                    paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                    paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                  }
                  else
                  {
                    if ((i2 == i3 ? 0 : 1) != 0) {}
                    if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                    {
                      f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfFloat2[(1 - 1 + (2 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(i2 - 1, paramArrayOfFloat3, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt7 + paramInt6, 1);
                      arrayOfFloat2[(2 - 1 + (2 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      Slasy2.slasy2(true, false, paramInt1, 2, 2, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, arrayOfFloat2, 0, 2, localfloatW2, arrayOfFloat3, 0, 2, localfloatW4, localintW);
                      if ((localintW.val == 0 ? 0 : 1) != 0) {
                        paramintW.val = 1;
                      }
                      if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                      {
                        i = 1;
                        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                        {
                          Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                          i += 1;
                        }
                        paramfloatW.val *= localfloatW2.val;
                      }
                      paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                      paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (2 - 1) * 2)];
                      paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                      paramArrayOfFloat3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (2 - 1) * 2)];
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
          else if ((paramArrayOfFloat2[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] == 0.0F ? 0 : 1) != 0)
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
              else if ((paramArrayOfFloat1[(j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) != 0)
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
                f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                f8 = Sdot.sdot(paramInt3 - i2, paramArrayOfFloat3, k - 1 + (Math.min(i2 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i2 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                localfloatW2.val = 1.0F;
                f1 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
                f2 = Math.abs(f1);
                if ((f2 > f6 ? 0 : 1) != 0)
                {
                  f1 = f6;
                  f2 = f6;
                  paramintW.val = 1;
                }
                f3 = Math.abs(arrayOfFloat2[(1 - 1 + (1 - 1) * 2)]);
                if ((f2 >= 1.0F ? 0 : 1) != 0) {}
                if (((f3 <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  if ((f3 <= localfloatW1.val * f2 ? 0 : 1) != 0) {
                    localfloatW2.val = (1.0F / f3);
                  }
                }
                arrayOfFloat3[(1 - 1 + (1 - 1) * 2)] = (arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] * localfloatW2.val / f1);
                if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                {
                  i = 1;
                  for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                  {
                    Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                    i += 1;
                  }
                  paramfloatW.val *= localfloatW2.val;
                }
                paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
              }
              else
              {
                if ((i2 != i3 ? 0 : 1) != 0) {}
                if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                  arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                  f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                  arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                  Slaln2.slaln2(true, 2, 1, f6, 1.0F, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, 1.0F, arrayOfFloat2, 0, 2, -(f5 * paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)]), 0.0F, arrayOfFloat3, 0, 2, localfloatW2, localfloatW4, localintW);
                  if ((localintW.val == 0 ? 0 : 1) != 0) {
                    paramintW.val = 1;
                  }
                  if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                  {
                    i = 1;
                    for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                    {
                      Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                      i += 1;
                    }
                    paramfloatW.val *= localfloatW2.val;
                  }
                  paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                  paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                }
                else
                {
                  if ((i2 == i3 ? 0 : 1) != 0) {}
                  if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                    f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                    arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (f5 * (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8)));
                    f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                    f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                    arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (f5 * (paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8)));
                    Slaln2.slaln2(false, 2, 1, f6, 1.0F, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, 1.0F, arrayOfFloat2, 0, 2, -(f5 * paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt5 + paramInt4)]), 0.0F, arrayOfFloat3, 0, 2, localfloatW2, localfloatW4, localintW);
                    if ((localintW.val == 0 ? 0 : 1) != 0) {
                      paramintW.val = 1;
                    }
                    if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                    {
                      i = 1;
                      for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                      {
                        Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                        i += 1;
                      }
                      paramfloatW.val *= localfloatW2.val;
                    }
                    paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                    paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                  }
                  else
                  {
                    if ((i2 == i3 ? 0 : 1) != 0) {}
                    if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                    {
                      f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfFloat2[(1 - 1 + (2 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfFloat2[(2 - 1 + (2 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      Slasy2.slasy2(true, true, paramInt1, 2, 2, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, arrayOfFloat2, 0, 2, localfloatW2, arrayOfFloat3, 0, 2, localfloatW4, localintW);
                      if ((localintW.val == 0 ? 0 : 1) != 0) {
                        paramintW.val = 1;
                      }
                      if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                      {
                        i = 1;
                        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                        {
                          Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                          i += 1;
                        }
                        paramfloatW.val *= localfloatW2.val;
                      }
                      paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                      paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (2 - 1) * 2)];
                      paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                      paramArrayOfFloat3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (2 - 1) * 2)];
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
          else if ((paramArrayOfFloat2[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] == 0.0F ? 0 : 1) != 0)
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
              else if ((paramArrayOfFloat1[(j - 1 + (j - 1 - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) != 0)
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
                f7 = Sdot.sdot(paramInt2 - k, paramArrayOfFloat1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(k + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                f8 = Sdot.sdot(paramInt3 - i2, paramArrayOfFloat3, k - 1 + (Math.min(i2 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i2 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                localfloatW2.val = 1.0F;
                f1 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
                f2 = Math.abs(f1);
                if ((f2 > f6 ? 0 : 1) != 0)
                {
                  f1 = f6;
                  f2 = f6;
                  paramintW.val = 1;
                }
                f3 = Math.abs(arrayOfFloat2[(1 - 1 + (1 - 1) * 2)]);
                if ((f2 >= 1.0F ? 0 : 1) != 0) {}
                if (((f3 <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  if ((f3 <= localfloatW1.val * f2 ? 0 : 1) != 0) {
                    localfloatW2.val = (1.0F / f3);
                  }
                }
                arrayOfFloat3[(1 - 1 + (1 - 1) * 2)] = (arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] * localfloatW2.val / f1);
                if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                {
                  i = 1;
                  for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                  {
                    Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                    i += 1;
                  }
                  paramfloatW.val *= localfloatW2.val;
                }
                paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
              }
              else
              {
                if ((i2 != i3 ? 0 : 1) != 0) {}
                if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                  arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                  f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                  f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                  arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                  Slaln2.slaln2(false, 2, 1, f6, 1.0F, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, 1.0F, 1.0F, arrayOfFloat2, 0, 2, -(f5 * paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)]), 0.0F, arrayOfFloat3, 0, 2, localfloatW2, localfloatW4, localintW);
                  if ((localintW.val == 0 ? 0 : 1) != 0) {
                    paramintW.val = 1;
                  }
                  if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                  {
                    i = 1;
                    for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                    {
                      Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                      i += 1;
                    }
                    paramfloatW.val *= localfloatW2.val;
                  }
                  paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                  paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                }
                else
                {
                  if ((i2 == i3 ? 0 : 1) != 0) {}
                  if (((k != m ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    f7 = Sdot.sdot(paramInt2 - k, paramArrayOfFloat1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(k + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                    f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                    arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (f5 * (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8)));
                    f7 = Sdot.sdot(paramInt2 - k, paramArrayOfFloat1, k - 1 + (Math.min(k + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(k + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                    f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                    arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (f5 * (paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8)));
                    Slaln2.slaln2(false, 2, 1, f6, 1.0F, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, 1.0F, arrayOfFloat2, 0, 2, -(f5 * paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt5 + paramInt4)]), 0.0F, arrayOfFloat3, 0, 2, localfloatW2, localfloatW4, localintW);
                    if ((localintW.val == 0 ? 0 : 1) != 0) {
                      paramintW.val = 1;
                    }
                    if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                    {
                      i = 1;
                      for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                      {
                        Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                        i += 1;
                      }
                      paramfloatW.val *= localfloatW2.val;
                    }
                    paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                    paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                  }
                  else
                  {
                    if ((i2 == i3 ? 0 : 1) != 0) {}
                    if (((k == m ? 0 : 1) != 0 ? 1 : 0) != 0)
                    {
                      f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfFloat2[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, k - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, k - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfFloat2[(1 - 1 + (2 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i2 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i2 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfFloat2[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      f7 = Sdot.sdot(paramInt2 - m, paramArrayOfFloat1, m - 1 + (Math.min(m + 1, paramInt2) - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, Math.min(m + 1, paramInt2) - 1 + (i3 - 1) * paramInt9 + paramInt8, 1);
                      f8 = Sdot.sdot(paramInt3 - i3, paramArrayOfFloat3, m - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, i3 - 1 + (Math.min(i3 + 1, paramInt3) - 1) * paramInt7 + paramInt6, paramInt7);
                      arrayOfFloat2[(2 - 1 + (2 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] - (f7 + f5 * f8));
                      Slasy2.slasy2(false, true, paramInt1, 2, 2, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, paramInt7, arrayOfFloat2, 0, 2, localfloatW2, arrayOfFloat3, 0, 2, localfloatW4, localintW);
                      if ((localintW.val == 0 ? 0 : 1) != 0) {
                        paramintW.val = 1;
                      }
                      if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
                      {
                        i = 1;
                        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
                        {
                          Sscal.sscal(paramInt2, localfloatW2.val, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
                          i += 1;
                        }
                        paramfloatW.val *= localfloatW2.val;
                      }
                      paramArrayOfFloat3[(k - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (1 - 1) * 2)];
                      paramArrayOfFloat3[(k - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(1 - 1 + (2 - 1) * 2)];
                      paramArrayOfFloat3[(m - 1 + (i2 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (1 - 1) * 2)];
                      paramArrayOfFloat3[(m - 1 + (i3 - 1) * paramInt9 + paramInt8)] = arrayOfFloat3[(2 - 1 + (2 - 1) * 2)];
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Strsyl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */