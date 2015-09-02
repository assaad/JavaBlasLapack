package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sasum;
import org.netlib.blas.Saxpy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sscal;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaqtr
{
  public static void slaqtr(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float paramFloat, floatW paramfloatW, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    intW localintW = new intW(0);
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    float f11 = 0.0F;
    float[] arrayOfFloat1 = new float[2 * 2];
    float[] arrayOfFloat2 = new float[2 * 2];
    bool = paramBoolean1 ^ true;
    paramintW.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    f2 = Slamch.slamch("P");
    f6 = Slamch.slamch("S") / f2;
    f1 = 1.0F / f6;
    localfloatW4.val = Slange.slange("M", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, arrayOfFloat1, 0);
    if ((paramBoolean2 ^ true)) {
      localfloatW4.val = Util.max(localfloatW4.val, Math.abs(paramFloat), Slange.slange("M", paramInt1, 1, paramArrayOfFloat2, paramInt4, paramInt1, arrayOfFloat1, 0));
    }
    f4 = Math.max(f6, f2 * localfloatW4.val);
    paramArrayOfFloat4[(1 - 1 + paramInt6)] = 0.0F;
    j = 2;
    for (int i4 = paramInt1 - 2 + 1; i4 > 0; i4--)
    {
      paramArrayOfFloat4[(j - 1 + paramInt6)] = Sasum.sasum(j - 1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
      j += 1;
    }
    if ((paramBoolean2 ^ true))
    {
      i = 2;
      for (i4 = paramInt1 - 2 + 1; i4 > 0; i4--)
      {
        paramArrayOfFloat4[(i - 1 + paramInt6)] += Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]);
        i += 1;
      }
    }
    i3 = 2 * paramInt1;
    i2 = paramInt1;
    if ((paramBoolean2 ^ true)) {
      i2 = i3;
    }
    i1 = Isamax.isamax(i2, paramArrayOfFloat3, paramInt5, 1);
    f10 = Math.abs(paramArrayOfFloat3[(i1 - 1 + paramInt5)]);
    paramfloatW.val = 1.0F;
    if ((f10 <= f1 ? 0 : 1) != 0)
    {
      paramfloatW.val = (f1 / f10);
      Sscal.sscal(i2, paramfloatW.val, paramArrayOfFloat3, paramInt5, 1);
      f10 = f1;
    }
    if (paramBoolean2)
    {
      if (bool)
      {
        n = paramInt1;
        j = paramInt1;
        for (i4 = (1 - paramInt1 + -1) / -1; i4 > 0; i4--)
        {
          if ((j <= n ? 0 : 1) == 0)
          {
            k = j;
            m = j;
            n = j - 1;
            if ((j <= 1 ? 0 : 1) != 0) {
              if ((paramArrayOfFloat1[(j - 1 + (j - 1 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0)
              {
                k = j - 1;
                n = j - 2;
              }
            }
            if ((k != m ? 0 : 1) != 0)
            {
              f9 = Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]);
              f7 = Math.abs(paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]);
              f8 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)];
              if ((f7 >= f4 ? 0 : 1) != 0)
              {
                f8 = f4;
                f7 = f4;
                paramintW.val = 1;
              }
              if ((f9 != 0.0F ? 0 : 1) == 0)
              {
                if ((f7 >= 1.0F ? 0 : 1) != 0) {
                  if ((f9 <= f1 * f7 ? 0 : 1) != 0)
                  {
                    f3 = 1.0F / f9;
                    Sscal.sscal(paramInt1, f3, paramArrayOfFloat3, paramInt5, 1);
                    paramfloatW.val *= f3;
                    f10 *= f3;
                  }
                }
                paramArrayOfFloat3[(k - 1 + paramInt5)] /= f8;
                f9 = Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]);
                if ((f9 <= 1.0F ? 0 : 1) != 0)
                {
                  f3 = 1.0F / f9;
                  if ((paramArrayOfFloat4[(k - 1 + paramInt6)] <= (f1 - f10) * f3 ? 0 : 1) != 0)
                  {
                    Sscal.sscal(paramInt1, f3, paramArrayOfFloat3, paramInt5, 1);
                    paramfloatW.val *= f3;
                  }
                }
                if ((k <= 1 ? 0 : 1) != 0)
                {
                  Saxpy.saxpy(k - 1, -paramArrayOfFloat3[(k - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1);
                  i1 = Isamax.isamax(k - 1, paramArrayOfFloat3, paramInt5, 1);
                  f10 = Math.abs(paramArrayOfFloat3[(i1 - 1 + paramInt5)]);
                }
              }
            }
            else
            {
              arrayOfFloat1[(1 - 1 + (1 - 1) * 2)] = paramArrayOfFloat3[(k - 1 + paramInt5)];
              arrayOfFloat1[(2 - 1 + (1 - 1) * 2)] = paramArrayOfFloat3[(m - 1 + paramInt5)];
              Slaln2.slaln2(false, 2, 1, f4, 1.0F, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, 1.0F, arrayOfFloat1, 0, 2, 0.0F, 0.0F, arrayOfFloat2, 0, 2, localfloatW1, localfloatW4, localintW);
              if ((localintW.val == 0 ? 0 : 1) != 0) {
                paramintW.val = 2;
              }
              if ((localfloatW1.val == 1.0F ? 0 : 1) != 0)
              {
                Sscal.sscal(paramInt1, localfloatW1.val, paramArrayOfFloat3, paramInt5, 1);
                paramfloatW.val *= localfloatW1.val;
              }
              paramArrayOfFloat3[(k - 1 + paramInt5)] = arrayOfFloat2[(1 - 1 + (1 - 1) * 2)];
              paramArrayOfFloat3[(m - 1 + paramInt5)] = arrayOfFloat2[(2 - 1 + (1 - 1) * 2)];
              f9 = Math.max(Math.abs(arrayOfFloat2[(1 - 1 + (1 - 1) * 2)]), Math.abs(arrayOfFloat2[(2 - 1 + (1 - 1) * 2)]));
              if ((f9 <= 1.0F ? 0 : 1) != 0)
              {
                f3 = 1.0F / f9;
                if ((Math.max(paramArrayOfFloat4[(k - 1 + paramInt6)], paramArrayOfFloat4[(m - 1 + paramInt6)]) <= (f1 - f10) * f3 ? 0 : 1) != 0)
                {
                  Sscal.sscal(paramInt1, f3, paramArrayOfFloat3, paramInt5, 1);
                  paramfloatW.val *= f3;
                }
              }
              if ((k <= 1 ? 0 : 1) != 0)
              {
                Saxpy.saxpy(k - 1, -paramArrayOfFloat3[(k - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1);
                Saxpy.saxpy(k - 1, -paramArrayOfFloat3[(m - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1);
                i1 = Isamax.isamax(k - 1, paramArrayOfFloat3, paramInt5, 1);
                f10 = Math.abs(paramArrayOfFloat3[(i1 - 1 + paramInt5)]);
              }
            }
          }
          j += -1;
        }
      }
      else
      {
        n = 1;
        j = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          if ((j >= n ? 0 : 1) == 0)
          {
            k = j;
            m = j;
            n = j + 1;
            if ((j >= paramInt1 ? 0 : 1) != 0) {
              if ((paramArrayOfFloat1[(j + 1 - 1 + (j - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0)
              {
                m = j + 1;
                n = j + 2;
              }
            }
            if ((k != m ? 0 : 1) != 0)
            {
              f9 = Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]);
              if ((f10 <= 1.0F ? 0 : 1) != 0)
              {
                f3 = 1.0F / f10;
                if ((paramArrayOfFloat4[(k - 1 + paramInt6)] <= (f1 - f9) * f3 ? 0 : 1) != 0)
                {
                  Sscal.sscal(paramInt1, f3, paramArrayOfFloat3, paramInt5, 1);
                  paramfloatW.val *= f3;
                  f10 *= f3;
                }
              }
              paramArrayOfFloat3[(k - 1 + paramInt5)] -= Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1);
              f9 = Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]);
              f7 = Math.abs(paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]);
              f8 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)];
              if ((f7 >= f4 ? 0 : 1) != 0)
              {
                f8 = f4;
                f7 = f4;
                paramintW.val = 1;
              }
              if ((f7 >= 1.0F ? 0 : 1) != 0) {
                if ((f9 <= f1 * f7 ? 0 : 1) != 0)
                {
                  f3 = 1.0F / f9;
                  Sscal.sscal(paramInt1, f3, paramArrayOfFloat3, paramInt5, 1);
                  paramfloatW.val *= f3;
                  f10 *= f3;
                }
              }
              paramArrayOfFloat3[(k - 1 + paramInt5)] /= f8;
              f10 = Math.max(f10, Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]));
            }
            else
            {
              f9 = Math.max(Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]), Math.abs(paramArrayOfFloat3[(m - 1 + paramInt5)]));
              if ((f10 <= 1.0F ? 0 : 1) != 0)
              {
                f3 = 1.0F / f10;
                if ((Math.max(paramArrayOfFloat4[(m - 1 + paramInt6)], paramArrayOfFloat4[(k - 1 + paramInt6)]) <= (f1 - f9) * f3 ? 0 : 1) != 0)
                {
                  Sscal.sscal(paramInt1, f3, paramArrayOfFloat3, paramInt5, 1);
                  paramfloatW.val *= f3;
                  f10 *= f3;
                }
              }
              arrayOfFloat1[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + paramInt5)] - Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1));
              arrayOfFloat1[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + paramInt5)] - Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1));
              Slaln2.slaln2(true, 2, 1, f4, 1.0F, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, 1.0F, arrayOfFloat1, 0, 2, 0.0F, 0.0F, arrayOfFloat2, 0, 2, localfloatW1, localfloatW4, localintW);
              if ((localintW.val == 0 ? 0 : 1) != 0) {
                paramintW.val = 2;
              }
              if ((localfloatW1.val == 1.0F ? 0 : 1) != 0)
              {
                Sscal.sscal(paramInt1, localfloatW1.val, paramArrayOfFloat3, paramInt5, 1);
                paramfloatW.val *= localfloatW1.val;
              }
              paramArrayOfFloat3[(k - 1 + paramInt5)] = arrayOfFloat2[(1 - 1 + (1 - 1) * 2)];
              paramArrayOfFloat3[(m - 1 + paramInt5)] = arrayOfFloat2[(2 - 1 + (1 - 1) * 2)];
              f10 = Util.max(Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]), Math.abs(paramArrayOfFloat3[(m - 1 + paramInt5)]), f10);
            }
          }
          j += 1;
        }
      }
    }
    else
    {
      f5 = Math.max(f2 * Math.abs(paramFloat), f4);
      if (bool)
      {
        n = paramInt1;
        j = paramInt1;
        for (i4 = (1 - paramInt1 + -1) / -1; i4 > 0; i4--)
        {
          if ((j <= n ? 0 : 1) == 0)
          {
            k = j;
            m = j;
            n = j - 1;
            if ((j <= 1 ? 0 : 1) != 0) {
              if ((paramArrayOfFloat1[(j - 1 + (j - 1 - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0)
              {
                k = j - 1;
                n = j - 2;
              }
            }
            int i5;
            if ((k != m ? 0 : 1) != 0)
            {
              f11 = paramFloat;
              if ((k != 1 ? 0 : 1) != 0) {
                f11 = paramArrayOfFloat2[(1 - 1 + paramInt4)];
              }
              f9 = Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)]);
              f7 = Math.abs(paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]) + Math.abs(f11);
              f8 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)];
              if ((f7 >= f5 ? 0 : 1) != 0)
              {
                f8 = f5;
                f7 = f5;
                paramintW.val = 1;
              }
              if ((f9 != 0.0F ? 0 : 1) == 0)
              {
                if ((f7 >= 1.0F ? 0 : 1) != 0) {
                  if ((f9 <= f1 * f7 ? 0 : 1) != 0)
                  {
                    f3 = 1.0F / f9;
                    Sscal.sscal(i3, f3, paramArrayOfFloat3, paramInt5, 1);
                    paramfloatW.val *= f3;
                    f10 *= f3;
                  }
                }
                Sladiv.sladiv(paramArrayOfFloat3[(k - 1 + paramInt5)], paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)], f8, f11, localfloatW3, localfloatW2);
                paramArrayOfFloat3[(k - 1 + paramInt5)] = localfloatW3.val;
                paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)] = localfloatW2.val;
                f9 = Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)]);
                if ((f9 <= 1.0F ? 0 : 1) != 0)
                {
                  f3 = 1.0F / f9;
                  if ((paramArrayOfFloat4[(k - 1 + paramInt6)] <= (f1 - f10) * f3 ? 0 : 1) != 0)
                  {
                    Sscal.sscal(i3, f3, paramArrayOfFloat3, paramInt5, 1);
                    paramfloatW.val *= f3;
                  }
                }
                if ((k <= 1 ? 0 : 1) != 0)
                {
                  Saxpy.saxpy(k - 1, -paramArrayOfFloat3[(k - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1);
                  Saxpy.saxpy(k - 1, -paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt1 + 1 - 1 + paramInt5, 1);
                  paramArrayOfFloat3[(1 - 1 + paramInt5)] += paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)];
                  paramArrayOfFloat3[(paramInt1 + 1 - 1 + paramInt5)] -= paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat3[(k - 1 + paramInt5)];
                  f10 = 0.0F;
                  i1 = 1;
                  for (i5 = k - 1 - 1 + 1; i5 > 0; i5--)
                  {
                    f10 = Math.max(f10, Math.abs(paramArrayOfFloat3[(i1 - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(i1 + paramInt1 - 1 + paramInt5)]));
                    i1 += 1;
                  }
                }
              }
            }
            else
            {
              arrayOfFloat1[(1 - 1 + (1 - 1) * 2)] = paramArrayOfFloat3[(k - 1 + paramInt5)];
              arrayOfFloat1[(2 - 1 + (1 - 1) * 2)] = paramArrayOfFloat3[(m - 1 + paramInt5)];
              arrayOfFloat1[(1 - 1 + (2 - 1) * 2)] = paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)];
              arrayOfFloat1[(2 - 1 + (2 - 1) * 2)] = paramArrayOfFloat3[(paramInt1 + m - 1 + paramInt5)];
              Slaln2.slaln2(false, 2, 2, f5, 1.0F, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, 1.0F, arrayOfFloat1, 0, 2, 0.0F, -paramFloat, arrayOfFloat2, 0, 2, localfloatW1, localfloatW4, localintW);
              if ((localintW.val == 0 ? 0 : 1) != 0) {
                paramintW.val = 2;
              }
              if ((localfloatW1.val == 1.0F ? 0 : 1) != 0)
              {
                Sscal.sscal(2 * paramInt1, localfloatW1.val, paramArrayOfFloat3, paramInt5, 1);
                localfloatW1.val *= paramfloatW.val;
              }
              paramArrayOfFloat3[(k - 1 + paramInt5)] = arrayOfFloat2[(1 - 1 + (1 - 1) * 2)];
              paramArrayOfFloat3[(m - 1 + paramInt5)] = arrayOfFloat2[(2 - 1 + (1 - 1) * 2)];
              paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)] = arrayOfFloat2[(1 - 1 + (2 - 1) * 2)];
              paramArrayOfFloat3[(paramInt1 + m - 1 + paramInt5)] = arrayOfFloat2[(2 - 1 + (2 - 1) * 2)];
              f9 = Math.max(Math.abs(arrayOfFloat2[(1 - 1 + (1 - 1) * 2)]) + Math.abs(arrayOfFloat2[(1 - 1 + (2 - 1) * 2)]), Math.abs(arrayOfFloat2[(2 - 1 + (1 - 1) * 2)]) + Math.abs(arrayOfFloat2[(2 - 1 + (2 - 1) * 2)]));
              if ((f9 <= 1.0F ? 0 : 1) != 0)
              {
                f3 = 1.0F / f9;
                if ((Math.max(paramArrayOfFloat4[(k - 1 + paramInt6)], paramArrayOfFloat4[(m - 1 + paramInt6)]) <= (f1 - f10) * f3 ? 0 : 1) != 0)
                {
                  Sscal.sscal(i3, f3, paramArrayOfFloat3, paramInt5, 1);
                  paramfloatW.val *= f3;
                }
              }
              if ((k <= 1 ? 0 : 1) != 0)
              {
                Saxpy.saxpy(k - 1, -paramArrayOfFloat3[(k - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1);
                Saxpy.saxpy(k - 1, -paramArrayOfFloat3[(m - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1);
                Saxpy.saxpy(k - 1, -paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt1 + 1 - 1 + paramInt5, 1);
                Saxpy.saxpy(k - 1, -paramArrayOfFloat3[(paramInt1 + m - 1 + paramInt5)], paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt1 + 1 - 1 + paramInt5, 1);
                paramArrayOfFloat3[(1 - 1 + paramInt5)] = (paramArrayOfFloat3[(1 - 1 + paramInt5)] + paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)] + paramArrayOfFloat2[(m - 1 + paramInt4)] * paramArrayOfFloat3[(paramInt1 + m - 1 + paramInt5)]);
                paramArrayOfFloat3[(paramInt1 + 1 - 1 + paramInt5)] = (paramArrayOfFloat3[(paramInt1 + 1 - 1 + paramInt5)] - paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat3[(k - 1 + paramInt5)] - paramArrayOfFloat2[(m - 1 + paramInt4)] * paramArrayOfFloat3[(m - 1 + paramInt5)]);
                f10 = 0.0F;
                i1 = 1;
                for (i5 = k - 1 - 1 + 1; i5 > 0; i5--)
                {
                  f10 = Math.max(Math.abs(paramArrayOfFloat3[(i1 - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(i1 + paramInt1 - 1 + paramInt5)]), f10);
                  i1 += 1;
                }
              }
            }
          }
          j += -1;
        }
      }
      else
      {
        n = 1;
        j = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          if ((j >= n ? 0 : 1) == 0)
          {
            k = j;
            m = j;
            n = j + 1;
            if ((j >= paramInt1 ? 0 : 1) != 0) {
              if ((paramArrayOfFloat1[(j + 1 - 1 + (j - 1) * paramInt3 + paramInt2)] == 0.0F ? 0 : 1) != 0)
              {
                m = j + 1;
                n = j + 2;
              }
            }
            if ((k != m ? 0 : 1) != 0)
            {
              f9 = Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(k + paramInt1 - 1 + paramInt5)]);
              if ((f10 <= 1.0F ? 0 : 1) != 0)
              {
                f3 = 1.0F / f10;
                if ((paramArrayOfFloat4[(k - 1 + paramInt6)] <= (f1 - f9) * f3 ? 0 : 1) != 0)
                {
                  Sscal.sscal(i3, f3, paramArrayOfFloat3, paramInt5, 1);
                  paramfloatW.val *= f3;
                  f10 *= f3;
                }
              }
              paramArrayOfFloat3[(k - 1 + paramInt5)] -= Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1);
              paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)] -= Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt1 + 1 - 1 + paramInt5, 1);
              if ((k <= 1 ? 0 : 1) != 0)
              {
                paramArrayOfFloat3[(k - 1 + paramInt5)] -= paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat3[(paramInt1 + 1 - 1 + paramInt5)];
                paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)] += paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat3[(1 - 1 + paramInt5)];
              }
              f9 = Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(k + paramInt1 - 1 + paramInt5)]);
              f11 = paramFloat;
              if ((k != 1 ? 0 : 1) != 0) {
                f11 = paramArrayOfFloat2[(1 - 1 + paramInt4)];
              }
              f7 = Math.abs(paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]) + Math.abs(f11);
              f8 = paramArrayOfFloat1[(k - 1 + (k - 1) * paramInt3 + paramInt2)];
              if ((f7 >= f5 ? 0 : 1) != 0)
              {
                f8 = f5;
                f7 = f5;
                paramintW.val = 1;
              }
              if ((f7 >= 1.0F ? 0 : 1) != 0) {
                if ((f9 <= f1 * f7 ? 0 : 1) != 0)
                {
                  f3 = 1.0F / f9;
                  Sscal.sscal(i3, f3, paramArrayOfFloat3, paramInt5, 1);
                  paramfloatW.val *= f3;
                  f10 *= f3;
                }
              }
              Sladiv.sladiv(paramArrayOfFloat3[(k - 1 + paramInt5)], paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)], f8, -f11, localfloatW3, localfloatW2);
              paramArrayOfFloat3[(k - 1 + paramInt5)] = localfloatW3.val;
              paramArrayOfFloat3[(k + paramInt1 - 1 + paramInt5)] = localfloatW2.val;
              f10 = Math.max(Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(k + paramInt1 - 1 + paramInt5)]), f10);
            }
            else
            {
              f9 = Math.max(Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)]), Math.abs(paramArrayOfFloat3[(m - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(paramInt1 + m - 1 + paramInt5)]));
              if ((f10 <= 1.0F ? 0 : 1) != 0)
              {
                f3 = 1.0F / f10;
                if ((Math.max(paramArrayOfFloat4[(k - 1 + paramInt6)], paramArrayOfFloat4[(m - 1 + paramInt6)]) <= (f1 - f9) / f10 ? 0 : 1) != 0)
                {
                  Sscal.sscal(i3, f3, paramArrayOfFloat3, paramInt5, 1);
                  paramfloatW.val *= f3;
                  f10 *= f3;
                }
              }
              arrayOfFloat1[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(k - 1 + paramInt5)] - Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1));
              arrayOfFloat1[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfFloat3[(m - 1 + paramInt5)] - Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt5, 1));
              arrayOfFloat1[(1 - 1 + (2 - 1) * 2)] = (paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)] - Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt1 + 1 - 1 + paramInt5, 1));
              arrayOfFloat1[(2 - 1 + (2 - 1) * 2)] = (paramArrayOfFloat3[(paramInt1 + m - 1 + paramInt5)] - Sdot.sdot(k - 1, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat3, paramInt1 + 1 - 1 + paramInt5, 1));
              arrayOfFloat1[(1 - 1 + (1 - 1) * 2)] -= paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat3[(paramInt1 + 1 - 1 + paramInt5)];
              arrayOfFloat1[(2 - 1 + (1 - 1) * 2)] -= paramArrayOfFloat2[(m - 1 + paramInt4)] * paramArrayOfFloat3[(paramInt1 + 1 - 1 + paramInt5)];
              arrayOfFloat1[(1 - 1 + (2 - 1) * 2)] += paramArrayOfFloat2[(k - 1 + paramInt4)] * paramArrayOfFloat3[(1 - 1 + paramInt5)];
              arrayOfFloat1[(2 - 1 + (2 - 1) * 2)] += paramArrayOfFloat2[(m - 1 + paramInt4)] * paramArrayOfFloat3[(1 - 1 + paramInt5)];
              Slaln2.slaln2(true, 2, 2, f5, 1.0F, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, 1.0F, arrayOfFloat1, 0, 2, 0.0F, paramFloat, arrayOfFloat2, 0, 2, localfloatW1, localfloatW4, localintW);
              if ((localintW.val == 0 ? 0 : 1) != 0) {
                paramintW.val = 2;
              }
              if ((localfloatW1.val == 1.0F ? 0 : 1) != 0)
              {
                Sscal.sscal(i3, localfloatW1.val, paramArrayOfFloat3, paramInt5, 1);
                localfloatW1.val *= paramfloatW.val;
              }
              paramArrayOfFloat3[(k - 1 + paramInt5)] = arrayOfFloat2[(1 - 1 + (1 - 1) * 2)];
              paramArrayOfFloat3[(m - 1 + paramInt5)] = arrayOfFloat2[(2 - 1 + (1 - 1) * 2)];
              paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)] = arrayOfFloat2[(1 - 1 + (2 - 1) * 2)];
              paramArrayOfFloat3[(paramInt1 + m - 1 + paramInt5)] = arrayOfFloat2[(2 - 1 + (2 - 1) * 2)];
              f10 = Util.max(Math.abs(paramArrayOfFloat3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(paramInt1 + k - 1 + paramInt5)]), Math.abs(paramArrayOfFloat3[(m - 1 + paramInt5)]) + Math.abs(paramArrayOfFloat3[(paramInt1 + m - 1 + paramInt5)]), f10);
            }
          }
          j += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaqtr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */