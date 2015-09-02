package org.netlib.lapack;

import org.netlib.blas.Dasum;
import org.netlib.blas.Daxpy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Idamax;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaqtr
{
  public static void dlaqtr(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double paramDouble, doubleW paramdoubleW, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, intW paramintW)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d11 = 0.0D;
    double[] arrayOfDouble1 = new double[2 * 2];
    double[] arrayOfDouble2 = new double[2 * 2];
    bool = paramBoolean1 ^ true;
    paramintW.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    d2 = Dlamch.dlamch("P");
    d6 = Dlamch.dlamch("S") / d2;
    d1 = 1.0D / d6;
    localdoubleW4.val = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, arrayOfDouble1, 0);
    if ((paramBoolean2 ^ true)) {
      localdoubleW4.val = Util.max(localdoubleW4.val, Math.abs(paramDouble), Dlange.dlange("M", paramInt1, 1, paramArrayOfDouble2, paramInt4, paramInt1, arrayOfDouble1, 0));
    }
    d4 = Math.max(d6, d2 * localdoubleW4.val);
    paramArrayOfDouble4[(1 - 1 + paramInt6)] = 0.0D;
    j = 2;
    for (int i4 = paramInt1 - 2 + 1; i4 > 0; i4--)
    {
      paramArrayOfDouble4[(j - 1 + paramInt6)] = Dasum.dasum(j - 1, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
      j += 1;
    }
    if ((paramBoolean2 ^ true))
    {
      i = 2;
      for (i4 = paramInt1 - 2 + 1; i4 > 0; i4--)
      {
        paramArrayOfDouble4[(i - 1 + paramInt6)] += Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]);
        i += 1;
      }
    }
    i3 = 2 * paramInt1;
    i2 = paramInt1;
    if ((paramBoolean2 ^ true)) {
      i2 = i3;
    }
    i1 = Idamax.idamax(i2, paramArrayOfDouble3, paramInt5, 1);
    d10 = Math.abs(paramArrayOfDouble3[(i1 - 1 + paramInt5)]);
    paramdoubleW.val = 1.0D;
    if ((d10 <= d1 ? 0 : 1) != 0)
    {
      paramdoubleW.val = (d1 / d10);
      Dscal.dscal(i2, paramdoubleW.val, paramArrayOfDouble3, paramInt5, 1);
      d10 = d1;
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
              if ((paramArrayOfDouble1[(j - 1 + (j - 1 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0)
              {
                k = j - 1;
                n = j - 2;
              }
            }
            if ((k != m ? 0 : 1) != 0)
            {
              d9 = Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]);
              d7 = Math.abs(paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]);
              d8 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)];
              if ((d7 >= d4 ? 0 : 1) != 0)
              {
                d8 = d4;
                d7 = d4;
                paramintW.val = 1;
              }
              if ((d9 != 0.0D ? 0 : 1) == 0)
              {
                if ((d7 >= 1.0D ? 0 : 1) != 0) {
                  if ((d9 <= d1 * d7 ? 0 : 1) != 0)
                  {
                    d3 = 1.0D / d9;
                    Dscal.dscal(paramInt1, d3, paramArrayOfDouble3, paramInt5, 1);
                    paramdoubleW.val *= d3;
                    d10 *= d3;
                  }
                }
                paramArrayOfDouble3[(k - 1 + paramInt5)] /= d8;
                d9 = Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]);
                if ((d9 <= 1.0D ? 0 : 1) != 0)
                {
                  d3 = 1.0D / d9;
                  if ((paramArrayOfDouble4[(k - 1 + paramInt6)] <= (d1 - d10) * d3 ? 0 : 1) != 0)
                  {
                    Dscal.dscal(paramInt1, d3, paramArrayOfDouble3, paramInt5, 1);
                    paramdoubleW.val *= d3;
                  }
                }
                if ((k <= 1 ? 0 : 1) != 0)
                {
                  Daxpy.daxpy(k - 1, -paramArrayOfDouble3[(k - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1);
                  i1 = Idamax.idamax(k - 1, paramArrayOfDouble3, paramInt5, 1);
                  d10 = Math.abs(paramArrayOfDouble3[(i1 - 1 + paramInt5)]);
                }
              }
            }
            else
            {
              arrayOfDouble1[(1 - 1 + (1 - 1) * 2)] = paramArrayOfDouble3[(k - 1 + paramInt5)];
              arrayOfDouble1[(2 - 1 + (1 - 1) * 2)] = paramArrayOfDouble3[(m - 1 + paramInt5)];
              Dlaln2.dlaln2(false, 2, 1, d4, 1.0D, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3, 1.0D, 1.0D, arrayOfDouble1, 0, 2, 0.0D, 0.0D, arrayOfDouble2, 0, 2, localdoubleW1, localdoubleW4, localintW);
              if ((localintW.val == 0 ? 0 : 1) != 0) {
                paramintW.val = 2;
              }
              if ((localdoubleW1.val == 1.0D ? 0 : 1) != 0)
              {
                Dscal.dscal(paramInt1, localdoubleW1.val, paramArrayOfDouble3, paramInt5, 1);
                paramdoubleW.val *= localdoubleW1.val;
              }
              paramArrayOfDouble3[(k - 1 + paramInt5)] = arrayOfDouble2[(1 - 1 + (1 - 1) * 2)];
              paramArrayOfDouble3[(m - 1 + paramInt5)] = arrayOfDouble2[(2 - 1 + (1 - 1) * 2)];
              d9 = Math.max(Math.abs(arrayOfDouble2[(1 - 1 + (1 - 1) * 2)]), Math.abs(arrayOfDouble2[(2 - 1 + (1 - 1) * 2)]));
              if ((d9 <= 1.0D ? 0 : 1) != 0)
              {
                d3 = 1.0D / d9;
                if ((Math.max(paramArrayOfDouble4[(k - 1 + paramInt6)], paramArrayOfDouble4[(m - 1 + paramInt6)]) <= (d1 - d10) * d3 ? 0 : 1) != 0)
                {
                  Dscal.dscal(paramInt1, d3, paramArrayOfDouble3, paramInt5, 1);
                  paramdoubleW.val *= d3;
                }
              }
              if ((k <= 1 ? 0 : 1) != 0)
              {
                Daxpy.daxpy(k - 1, -paramArrayOfDouble3[(k - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1);
                Daxpy.daxpy(k - 1, -paramArrayOfDouble3[(m - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1);
                i1 = Idamax.idamax(k - 1, paramArrayOfDouble3, paramInt5, 1);
                d10 = Math.abs(paramArrayOfDouble3[(i1 - 1 + paramInt5)]);
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
              if ((paramArrayOfDouble1[(j + 1 - 1 + (j - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0)
              {
                m = j + 1;
                n = j + 2;
              }
            }
            if ((k != m ? 0 : 1) != 0)
            {
              d9 = Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]);
              if ((d10 <= 1.0D ? 0 : 1) != 0)
              {
                d3 = 1.0D / d10;
                if ((paramArrayOfDouble4[(k - 1 + paramInt6)] <= (d1 - d9) * d3 ? 0 : 1) != 0)
                {
                  Dscal.dscal(paramInt1, d3, paramArrayOfDouble3, paramInt5, 1);
                  paramdoubleW.val *= d3;
                  d10 *= d3;
                }
              }
              paramArrayOfDouble3[(k - 1 + paramInt5)] -= Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1);
              d9 = Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]);
              d7 = Math.abs(paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]);
              d8 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)];
              if ((d7 >= d4 ? 0 : 1) != 0)
              {
                d8 = d4;
                d7 = d4;
                paramintW.val = 1;
              }
              if ((d7 >= 1.0D ? 0 : 1) != 0) {
                if ((d9 <= d1 * d7 ? 0 : 1) != 0)
                {
                  d3 = 1.0D / d9;
                  Dscal.dscal(paramInt1, d3, paramArrayOfDouble3, paramInt5, 1);
                  paramdoubleW.val *= d3;
                  d10 *= d3;
                }
              }
              paramArrayOfDouble3[(k - 1 + paramInt5)] /= d8;
              d10 = Math.max(d10, Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]));
            }
            else
            {
              d9 = Math.max(Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]), Math.abs(paramArrayOfDouble3[(m - 1 + paramInt5)]));
              if ((d10 <= 1.0D ? 0 : 1) != 0)
              {
                d3 = 1.0D / d10;
                if ((Math.max(paramArrayOfDouble4[(m - 1 + paramInt6)], paramArrayOfDouble4[(k - 1 + paramInt6)]) <= (d1 - d9) * d3 ? 0 : 1) != 0)
                {
                  Dscal.dscal(paramInt1, d3, paramArrayOfDouble3, paramInt5, 1);
                  paramdoubleW.val *= d3;
                  d10 *= d3;
                }
              }
              arrayOfDouble1[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + paramInt5)] - Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1));
              arrayOfDouble1[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + paramInt5)] - Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1));
              Dlaln2.dlaln2(true, 2, 1, d4, 1.0D, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3, 1.0D, 1.0D, arrayOfDouble1, 0, 2, 0.0D, 0.0D, arrayOfDouble2, 0, 2, localdoubleW1, localdoubleW4, localintW);
              if ((localintW.val == 0 ? 0 : 1) != 0) {
                paramintW.val = 2;
              }
              if ((localdoubleW1.val == 1.0D ? 0 : 1) != 0)
              {
                Dscal.dscal(paramInt1, localdoubleW1.val, paramArrayOfDouble3, paramInt5, 1);
                paramdoubleW.val *= localdoubleW1.val;
              }
              paramArrayOfDouble3[(k - 1 + paramInt5)] = arrayOfDouble2[(1 - 1 + (1 - 1) * 2)];
              paramArrayOfDouble3[(m - 1 + paramInt5)] = arrayOfDouble2[(2 - 1 + (1 - 1) * 2)];
              d10 = Util.max(Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]), Math.abs(paramArrayOfDouble3[(m - 1 + paramInt5)]), d10);
            }
          }
          j += 1;
        }
      }
    }
    else
    {
      d5 = Math.max(d2 * Math.abs(paramDouble), d4);
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
              if ((paramArrayOfDouble1[(j - 1 + (j - 1 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0)
              {
                k = j - 1;
                n = j - 2;
              }
            }
            int i5;
            if ((k != m ? 0 : 1) != 0)
            {
              d11 = paramDouble;
              if ((k != 1 ? 0 : 1) != 0) {
                d11 = paramArrayOfDouble2[(1 - 1 + paramInt4)];
              }
              d9 = Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)]);
              d7 = Math.abs(paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]) + Math.abs(d11);
              d8 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)];
              if ((d7 >= d5 ? 0 : 1) != 0)
              {
                d8 = d5;
                d7 = d5;
                paramintW.val = 1;
              }
              if ((d9 != 0.0D ? 0 : 1) == 0)
              {
                if ((d7 >= 1.0D ? 0 : 1) != 0) {
                  if ((d9 <= d1 * d7 ? 0 : 1) != 0)
                  {
                    d3 = 1.0D / d9;
                    Dscal.dscal(i3, d3, paramArrayOfDouble3, paramInt5, 1);
                    paramdoubleW.val *= d3;
                    d10 *= d3;
                  }
                }
                Dladiv.dladiv(paramArrayOfDouble3[(k - 1 + paramInt5)], paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)], d8, d11, localdoubleW3, localdoubleW2);
                paramArrayOfDouble3[(k - 1 + paramInt5)] = localdoubleW3.val;
                paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)] = localdoubleW2.val;
                d9 = Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)]);
                if ((d9 <= 1.0D ? 0 : 1) != 0)
                {
                  d3 = 1.0D / d9;
                  if ((paramArrayOfDouble4[(k - 1 + paramInt6)] <= (d1 - d10) * d3 ? 0 : 1) != 0)
                  {
                    Dscal.dscal(i3, d3, paramArrayOfDouble3, paramInt5, 1);
                    paramdoubleW.val *= d3;
                  }
                }
                if ((k <= 1 ? 0 : 1) != 0)
                {
                  Daxpy.daxpy(k - 1, -paramArrayOfDouble3[(k - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1);
                  Daxpy.daxpy(k - 1, -paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt1 + 1 - 1 + paramInt5, 1);
                  paramArrayOfDouble3[(1 - 1 + paramInt5)] += paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)];
                  paramArrayOfDouble3[(paramInt1 + 1 - 1 + paramInt5)] -= paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble3[(k - 1 + paramInt5)];
                  d10 = 0.0D;
                  i1 = 1;
                  for (i5 = k - 1 - 1 + 1; i5 > 0; i5--)
                  {
                    d10 = Math.max(d10, Math.abs(paramArrayOfDouble3[(i1 - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(i1 + paramInt1 - 1 + paramInt5)]));
                    i1 += 1;
                  }
                }
              }
            }
            else
            {
              arrayOfDouble1[(1 - 1 + (1 - 1) * 2)] = paramArrayOfDouble3[(k - 1 + paramInt5)];
              arrayOfDouble1[(2 - 1 + (1 - 1) * 2)] = paramArrayOfDouble3[(m - 1 + paramInt5)];
              arrayOfDouble1[(1 - 1 + (2 - 1) * 2)] = paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)];
              arrayOfDouble1[(2 - 1 + (2 - 1) * 2)] = paramArrayOfDouble3[(paramInt1 + m - 1 + paramInt5)];
              Dlaln2.dlaln2(false, 2, 2, d5, 1.0D, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3, 1.0D, 1.0D, arrayOfDouble1, 0, 2, 0.0D, -paramDouble, arrayOfDouble2, 0, 2, localdoubleW1, localdoubleW4, localintW);
              if ((localintW.val == 0 ? 0 : 1) != 0) {
                paramintW.val = 2;
              }
              if ((localdoubleW1.val == 1.0D ? 0 : 1) != 0)
              {
                Dscal.dscal(2 * paramInt1, localdoubleW1.val, paramArrayOfDouble3, paramInt5, 1);
                localdoubleW1.val *= paramdoubleW.val;
              }
              paramArrayOfDouble3[(k - 1 + paramInt5)] = arrayOfDouble2[(1 - 1 + (1 - 1) * 2)];
              paramArrayOfDouble3[(m - 1 + paramInt5)] = arrayOfDouble2[(2 - 1 + (1 - 1) * 2)];
              paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)] = arrayOfDouble2[(1 - 1 + (2 - 1) * 2)];
              paramArrayOfDouble3[(paramInt1 + m - 1 + paramInt5)] = arrayOfDouble2[(2 - 1 + (2 - 1) * 2)];
              d9 = Math.max(Math.abs(arrayOfDouble2[(1 - 1 + (1 - 1) * 2)]) + Math.abs(arrayOfDouble2[(1 - 1 + (2 - 1) * 2)]), Math.abs(arrayOfDouble2[(2 - 1 + (1 - 1) * 2)]) + Math.abs(arrayOfDouble2[(2 - 1 + (2 - 1) * 2)]));
              if ((d9 <= 1.0D ? 0 : 1) != 0)
              {
                d3 = 1.0D / d9;
                if ((Math.max(paramArrayOfDouble4[(k - 1 + paramInt6)], paramArrayOfDouble4[(m - 1 + paramInt6)]) <= (d1 - d10) * d3 ? 0 : 1) != 0)
                {
                  Dscal.dscal(i3, d3, paramArrayOfDouble3, paramInt5, 1);
                  paramdoubleW.val *= d3;
                }
              }
              if ((k <= 1 ? 0 : 1) != 0)
              {
                Daxpy.daxpy(k - 1, -paramArrayOfDouble3[(k - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1);
                Daxpy.daxpy(k - 1, -paramArrayOfDouble3[(m - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1);
                Daxpy.daxpy(k - 1, -paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt1 + 1 - 1 + paramInt5, 1);
                Daxpy.daxpy(k - 1, -paramArrayOfDouble3[(paramInt1 + m - 1 + paramInt5)], paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt1 + 1 - 1 + paramInt5, 1);
                paramArrayOfDouble3[(1 - 1 + paramInt5)] = (paramArrayOfDouble3[(1 - 1 + paramInt5)] + paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)] + paramArrayOfDouble2[(m - 1 + paramInt4)] * paramArrayOfDouble3[(paramInt1 + m - 1 + paramInt5)]);
                paramArrayOfDouble3[(paramInt1 + 1 - 1 + paramInt5)] = (paramArrayOfDouble3[(paramInt1 + 1 - 1 + paramInt5)] - paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble3[(k - 1 + paramInt5)] - paramArrayOfDouble2[(m - 1 + paramInt4)] * paramArrayOfDouble3[(m - 1 + paramInt5)]);
                d10 = 0.0D;
                i1 = 1;
                for (i5 = k - 1 - 1 + 1; i5 > 0; i5--)
                {
                  d10 = Math.max(Math.abs(paramArrayOfDouble3[(i1 - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(i1 + paramInt1 - 1 + paramInt5)]), d10);
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
              if ((paramArrayOfDouble1[(j + 1 - 1 + (j - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0)
              {
                m = j + 1;
                n = j + 2;
              }
            }
            if ((k != m ? 0 : 1) != 0)
            {
              d9 = Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(k + paramInt1 - 1 + paramInt5)]);
              if ((d10 <= 1.0D ? 0 : 1) != 0)
              {
                d3 = 1.0D / d10;
                if ((paramArrayOfDouble4[(k - 1 + paramInt6)] <= (d1 - d9) * d3 ? 0 : 1) != 0)
                {
                  Dscal.dscal(i3, d3, paramArrayOfDouble3, paramInt5, 1);
                  paramdoubleW.val *= d3;
                  d10 *= d3;
                }
              }
              paramArrayOfDouble3[(k - 1 + paramInt5)] -= Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1);
              paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)] -= Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt1 + 1 - 1 + paramInt5, 1);
              if ((k <= 1 ? 0 : 1) != 0)
              {
                paramArrayOfDouble3[(k - 1 + paramInt5)] -= paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble3[(paramInt1 + 1 - 1 + paramInt5)];
                paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)] += paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble3[(1 - 1 + paramInt5)];
              }
              d9 = Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(k + paramInt1 - 1 + paramInt5)]);
              d11 = paramDouble;
              if ((k != 1 ? 0 : 1) != 0) {
                d11 = paramArrayOfDouble2[(1 - 1 + paramInt4)];
              }
              d7 = Math.abs(paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]) + Math.abs(d11);
              d8 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)];
              if ((d7 >= d5 ? 0 : 1) != 0)
              {
                d8 = d5;
                d7 = d5;
                paramintW.val = 1;
              }
              if ((d7 >= 1.0D ? 0 : 1) != 0) {
                if ((d9 <= d1 * d7 ? 0 : 1) != 0)
                {
                  d3 = 1.0D / d9;
                  Dscal.dscal(i3, d3, paramArrayOfDouble3, paramInt5, 1);
                  paramdoubleW.val *= d3;
                  d10 *= d3;
                }
              }
              Dladiv.dladiv(paramArrayOfDouble3[(k - 1 + paramInt5)], paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)], d8, -d11, localdoubleW3, localdoubleW2);
              paramArrayOfDouble3[(k - 1 + paramInt5)] = localdoubleW3.val;
              paramArrayOfDouble3[(k + paramInt1 - 1 + paramInt5)] = localdoubleW2.val;
              d10 = Math.max(Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(k + paramInt1 - 1 + paramInt5)]), d10);
            }
            else
            {
              d9 = Math.max(Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)]), Math.abs(paramArrayOfDouble3[(m - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(paramInt1 + m - 1 + paramInt5)]));
              if ((d10 <= 1.0D ? 0 : 1) != 0)
              {
                d3 = 1.0D / d10;
                if ((Math.max(paramArrayOfDouble4[(k - 1 + paramInt6)], paramArrayOfDouble4[(m - 1 + paramInt6)]) <= (d1 - d9) / d10 ? 0 : 1) != 0)
                {
                  Dscal.dscal(i3, d3, paramArrayOfDouble3, paramInt5, 1);
                  paramdoubleW.val *= d3;
                  d10 *= d3;
                }
              }
              arrayOfDouble1[(1 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(k - 1 + paramInt5)] - Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1));
              arrayOfDouble1[(2 - 1 + (1 - 1) * 2)] = (paramArrayOfDouble3[(m - 1 + paramInt5)] - Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt5, 1));
              arrayOfDouble1[(1 - 1 + (2 - 1) * 2)] = (paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)] - Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt1 + 1 - 1 + paramInt5, 1));
              arrayOfDouble1[(2 - 1 + (2 - 1) * 2)] = (paramArrayOfDouble3[(paramInt1 + m - 1 + paramInt5)] - Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble3, paramInt1 + 1 - 1 + paramInt5, 1));
              arrayOfDouble1[(1 - 1 + (1 - 1) * 2)] -= paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble3[(paramInt1 + 1 - 1 + paramInt5)];
              arrayOfDouble1[(2 - 1 + (1 - 1) * 2)] -= paramArrayOfDouble2[(m - 1 + paramInt4)] * paramArrayOfDouble3[(paramInt1 + 1 - 1 + paramInt5)];
              arrayOfDouble1[(1 - 1 + (2 - 1) * 2)] += paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble3[(1 - 1 + paramInt5)];
              arrayOfDouble1[(2 - 1 + (2 - 1) * 2)] += paramArrayOfDouble2[(m - 1 + paramInt4)] * paramArrayOfDouble3[(1 - 1 + paramInt5)];
              Dlaln2.dlaln2(true, 2, 2, d5, 1.0D, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt3 + paramInt2, paramInt3, 1.0D, 1.0D, arrayOfDouble1, 0, 2, 0.0D, paramDouble, arrayOfDouble2, 0, 2, localdoubleW1, localdoubleW4, localintW);
              if ((localintW.val == 0 ? 0 : 1) != 0) {
                paramintW.val = 2;
              }
              if ((localdoubleW1.val == 1.0D ? 0 : 1) != 0)
              {
                Dscal.dscal(i3, localdoubleW1.val, paramArrayOfDouble3, paramInt5, 1);
                localdoubleW1.val *= paramdoubleW.val;
              }
              paramArrayOfDouble3[(k - 1 + paramInt5)] = arrayOfDouble2[(1 - 1 + (1 - 1) * 2)];
              paramArrayOfDouble3[(m - 1 + paramInt5)] = arrayOfDouble2[(2 - 1 + (1 - 1) * 2)];
              paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)] = arrayOfDouble2[(1 - 1 + (2 - 1) * 2)];
              paramArrayOfDouble3[(paramInt1 + m - 1 + paramInt5)] = arrayOfDouble2[(2 - 1 + (2 - 1) * 2)];
              d10 = Util.max(Math.abs(paramArrayOfDouble3[(k - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(paramInt1 + k - 1 + paramInt5)]), Math.abs(paramArrayOfDouble3[(m - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble3[(paramInt1 + m - 1 + paramInt5)]), d10);
            }
          }
          j += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqtr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */