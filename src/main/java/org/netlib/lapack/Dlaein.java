package org.netlib.lapack;

import org.netlib.blas.Dasum;
import org.netlib.blas.Dnrm2;
import org.netlib.blas.Dscal;
import org.netlib.blas.Idamax;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaein
{
  public static void dlaein(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, double paramDouble3, double paramDouble4, double paramDouble5, intW paramintW)
  {
    String str1 = new String(" ");
    String str2 = new String(" ");
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW = new intW(0);
    int n = 0;
    int i1 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    doubleW localdoubleW = new doubleW(0.0D);
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    double d19 = 0.0D;
    paramintW.val = 0;
    d9 = Math.sqrt(paramInt1);
    d5 = 0.1D / d9;
    d7 = Math.max(1.0D, paramDouble3 * d9) * paramDouble4;
    i1 = 1;
    int i3;
    for (int i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
    {
      i = 1;
      for (i3 = i1 - 1 - 1 + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = paramArrayOfDouble1[(i - 1 + (i1 - 1) * paramInt3 + paramInt2)];
        i += 1;
      }
      paramArrayOfDouble1[(i1 - 1 + (i1 - 1) * paramInt3 + paramInt2)] -= paramDouble1;
      i1 += 1;
    }
    if ((paramDouble2 != 0.0D ? 0 : 1) != 0)
    {
      if (paramBoolean2)
      {
        i = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble2[(i - 1 + paramInt4)] = paramDouble3;
          i += 1;
        }
      }
      else
      {
        d13 = Dnrm2.dnrm2(paramInt1, paramArrayOfDouble2, paramInt4, 1);
        Dscal.dscal(paramInt1, paramDouble3 * d9 / Math.max(d13, d7), paramArrayOfDouble2, paramInt4, 1);
      }
      if (paramBoolean1)
      {
        i = 1;
        for (i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
        {
          d3 = paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)];
          if ((Math.abs(paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)]) >= Math.abs(d3) ? 0 : 1) != 0)
          {
            d16 = paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] / d3;
            paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = d3;
            i1 = i + 1;
            for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
            {
              d10 = paramArrayOfDouble4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)];
              paramArrayOfDouble4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] - d16 * d10);
              paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = d10;
              i1 += 1;
            }
          }
          else
          {
            if ((paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] != 0.0D ? 0 : 1) != 0) {
              paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = paramDouble3;
            }
            d16 = d3 / paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)];
            if ((d16 == 0.0D ? 0 : 1) != 0)
            {
              i1 = i + 1;
              for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] -= d16 * paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)];
                i1 += 1;
              }
            }
          }
          i += 1;
        }
        if ((paramArrayOfDouble4[(paramInt1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] != 0.0D ? 0 : 1) != 0) {
          paramArrayOfDouble4[(paramInt1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] = paramDouble3;
        }
        str2 = "N";
      }
      else
      {
        i1 = paramInt1;
        for (i2 = (2 - paramInt1 + -1) / -1; i2 > 0; i2--)
        {
          d4 = paramArrayOfDouble1[(i1 - 1 + (i1 - 1 - 1) * paramInt3 + paramInt2)];
          if ((Math.abs(paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)]) >= Math.abs(d4) ? 0 : 1) != 0)
          {
            d16 = paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] / d4;
            paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = d4;
            i = 1;
            for (i3 = i1 - 1 - 1 + 1; i3 > 0; i3--)
            {
              d10 = paramArrayOfDouble4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)];
              paramArrayOfDouble4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] - d16 * d10);
              paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = d10;
              i += 1;
            }
          }
          else
          {
            if ((paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] != 0.0D ? 0 : 1) != 0) {
              paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = paramDouble3;
            }
            d16 = d4 / paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)];
            if ((d16 == 0.0D ? 0 : 1) != 0)
            {
              i = 1;
              for (i3 = i1 - 1 - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] -= d16 * paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)];
                i += 1;
              }
            }
          }
          i1 += -1;
        }
        if ((paramArrayOfDouble4[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] != 0.0D ? 0 : 1) != 0) {
          paramArrayOfDouble4[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = paramDouble3;
        }
        str2 = "T";
      }
      str1 = "N";
      n = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        Dlatrs.dlatrs("Upper", str2, "Nonunit", str1, paramInt1, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble2, paramInt4, localdoubleW, paramArrayOfDouble5, paramInt8, localintW);
        str1 = "Y";
        d13 = Dasum.dasum(paramInt1, paramArrayOfDouble2, paramInt4, 1);
        if ((d13 < d5 * localdoubleW.val ? 0 : 1) != 0) {
          break;
        }
        d10 = paramDouble3 / (d9 + 1.0D);
        paramArrayOfDouble2[(1 - 1 + paramInt4)] = paramDouble3;
        i = 2;
        for (i3 = paramInt1 - 2 + 1; i3 > 0; i3--)
        {
          paramArrayOfDouble2[(i - 1 + paramInt4)] = d10;
          i += 1;
        }
        paramArrayOfDouble2[(paramInt1 - n + 1 - 1 + paramInt4)] -= paramDouble3 * d9;
        n += 1;
      }
      paramintW.val = 1;
      i = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt4, 1);
      Dscal.dscal(paramInt1, 1.0D / Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]), paramArrayOfDouble2, paramInt4, 1);
    }
    else
    {
      if (paramBoolean2)
      {
        i = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble2[(i - 1 + paramInt4)] = paramDouble3;
          paramArrayOfDouble3[(i - 1 + paramInt5)] = 0.0D;
          i += 1;
        }
      }
      else
      {
        d6 = Dlapy2.dlapy2(Dnrm2.dnrm2(paramInt1, paramArrayOfDouble2, paramInt4, 1), Dnrm2.dnrm2(paramInt1, paramArrayOfDouble3, paramInt5, 1));
        d8 = paramDouble3 * d9 / Math.max(d6, d7);
        Dscal.dscal(paramInt1, d8, paramArrayOfDouble2, paramInt4, 1);
        Dscal.dscal(paramInt1, d8, paramArrayOfDouble3, paramInt5, 1);
      }
      if (paramBoolean1)
      {
        paramArrayOfDouble4[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)] = (-paramDouble2);
        i = 2;
        for (i2 = paramInt1 - 2 + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = 0.0D;
          i += 1;
        }
        i = 1;
        for (i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
        {
          d1 = Dlapy2.dlapy2(paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)], paramArrayOfDouble4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]);
          d3 = paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)];
          if ((d1 >= Math.abs(d3) ? 0 : 1) != 0)
          {
            d18 = paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] / d3;
            d17 = paramArrayOfDouble4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] / d3;
            paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = d3;
            paramArrayOfDouble4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0D;
            i1 = i + 1;
            for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
            {
              d10 = paramArrayOfDouble4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)];
              paramArrayOfDouble4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] - d18 * d10);
              paramArrayOfDouble4[(i1 + 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] - d17 * d10);
              paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = d10;
              paramArrayOfDouble4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0D;
              i1 += 1;
            }
            paramArrayOfDouble4[(i + 2 - 1 + (i - 1) * paramInt7 + paramInt6)] = (-paramDouble2);
            paramArrayOfDouble4[(i + 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6)] -= d17 * paramDouble2;
            paramArrayOfDouble4[(i + 2 - 1 + (i + 1 - 1) * paramInt7 + paramInt6)] += d18 * paramDouble2;
          }
          else
          {
            if ((d1 != 0.0D ? 0 : 1) != 0)
            {
              paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = paramDouble3;
              paramArrayOfDouble4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0D;
              d1 = paramDouble3;
            }
            d3 = d3 / d1 / d1;
            d18 = paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] * d3;
            d17 = -(paramArrayOfDouble4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] * d3);
            i1 = i + 1;
            for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
            {
              paramArrayOfDouble4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] - d18 * paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] + d17 * paramArrayOfDouble4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]);
              paramArrayOfDouble4[(i1 + 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6)] = (-(d18 * paramArrayOfDouble4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]) - d17 * paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)]);
              i1 += 1;
            }
            paramArrayOfDouble4[(i + 2 - 1 + (i + 1 - 1) * paramInt7 + paramInt6)] -= paramDouble2;
          }
          paramArrayOfDouble5[(i - 1 + paramInt8)] = (Dasum.dasum(paramInt1 - i, paramArrayOfDouble4, i - 1 + (i + 1 - 1) * paramInt7 + paramInt6, paramInt7) + Dasum.dasum(paramInt1 - i, paramArrayOfDouble4, i + 2 - 1 + (i - 1) * paramInt7 + paramInt6, 1));
          i += 1;
        }
        if ((paramArrayOfDouble4[(paramInt1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] != 0.0D ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble4[(paramInt1 + 1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramArrayOfDouble4[(paramInt1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] = paramDouble3;
        }
        paramArrayOfDouble5[(paramInt1 - 1 + paramInt8)] = 0.0D;
        j = paramInt1;
        k = 1;
        m = -1;
      }
      else
      {
        paramArrayOfDouble4[(paramInt1 + 1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] = paramDouble2;
        i1 = 1;
        for (i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble4[(paramInt1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = 0.0D;
          i1 += 1;
        }
        i1 = paramInt1;
        for (i2 = (2 - paramInt1 + -1) / -1; i2 > 0; i2--)
        {
          d4 = paramArrayOfDouble1[(i1 - 1 + (i1 - 1 - 1) * paramInt3 + paramInt2)];
          d2 = Dlapy2.dlapy2(paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)], paramArrayOfDouble4[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)]);
          if ((d2 >= Math.abs(d4) ? 0 : 1) != 0)
          {
            d18 = paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] / d4;
            d17 = paramArrayOfDouble4[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] / d4;
            paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = d4;
            paramArrayOfDouble4[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = 0.0D;
            i = 1;
            for (i3 = i1 - 1 - 1 + 1; i3 > 0; i3--)
            {
              d10 = paramArrayOfDouble4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)];
              paramArrayOfDouble4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] - d18 * d10);
              paramArrayOfDouble4[(i1 - 1 + (i - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] - d17 * d10);
              paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = d10;
              paramArrayOfDouble4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0D;
              i += 1;
            }
            paramArrayOfDouble4[(i1 + 1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] = paramDouble2;
            paramArrayOfDouble4[(i1 - 1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] += d17 * paramDouble2;
            paramArrayOfDouble4[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] -= d18 * paramDouble2;
          }
          else
          {
            if ((d2 != 0.0D ? 0 : 1) != 0)
            {
              paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = paramDouble3;
              paramArrayOfDouble4[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = 0.0D;
              d2 = paramDouble3;
            }
            d4 = d4 / d2 / d2;
            d18 = paramArrayOfDouble4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] * d4;
            d17 = -(paramArrayOfDouble4[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] * d4);
            i = 1;
            for (i3 = i1 - 1 - 1 + 1; i3 > 0; i3--)
            {
              paramArrayOfDouble4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] - d18 * paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] + d17 * paramArrayOfDouble4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]);
              paramArrayOfDouble4[(i1 - 1 + (i - 1) * paramInt7 + paramInt6)] = (-(d18 * paramArrayOfDouble4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]) - d17 * paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)]);
              i += 1;
            }
            paramArrayOfDouble4[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] += paramDouble2;
          }
          paramArrayOfDouble5[(i1 - 1 + paramInt8)] = (Dasum.dasum(i1 - 1, paramArrayOfDouble4, 1 - 1 + (i1 - 1) * paramInt7 + paramInt6, 1) + Dasum.dasum(i1 - 1, paramArrayOfDouble4, i1 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7));
          i1 += -1;
        }
        if ((paramArrayOfDouble4[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] != 0.0D ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble4[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramArrayOfDouble4[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = paramDouble3;
        }
        paramArrayOfDouble5[(1 - 1 + paramInt8)] = 0.0D;
        j = 1;
        k = paramInt1;
        m = 1;
      }
      n = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        localdoubleW.val = 1.0D;
        d12 = 1.0D;
        d11 = paramDouble5;
        i = j;
        for (i3 = (k - j + m) / m; i3 > 0; i3--)
        {
          if ((paramArrayOfDouble5[(i - 1 + paramInt8)] <= d11 ? 0 : 1) != 0)
          {
            d8 = 1.0D / d12;
            Dscal.dscal(paramInt1, d8, paramArrayOfDouble2, paramInt4, 1);
            Dscal.dscal(paramInt1, d8, paramArrayOfDouble3, paramInt5, 1);
            localdoubleW.val *= d8;
            d12 = 1.0D;
            d11 = paramDouble5;
          }
          d18 = paramArrayOfDouble2[(i - 1 + paramInt4)];
          d17 = paramArrayOfDouble3[(i - 1 + paramInt5)];
          int i4;
          if (paramBoolean1)
          {
            i1 = i + 1;
            for (i4 = paramInt1 - (i + 1) + 1; i4 > 0; i4--)
            {
              d18 = d18 - paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)] + paramArrayOfDouble4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)];
              d17 = d17 - paramArrayOfDouble4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)] - paramArrayOfDouble4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)];
              i1 += 1;
            }
          }
          else
          {
            i1 = 1;
            for (i4 = i - 1 - 1 + 1; i4 > 0; i4--)
            {
              d18 = d18 - paramArrayOfDouble4[(i1 - 1 + (i - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)] + paramArrayOfDouble4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)];
              d17 = d17 - paramArrayOfDouble4[(i1 - 1 + (i - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)] - paramArrayOfDouble4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)];
              i1 += 1;
            }
          }
          d14 = Math.abs(paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)]) + Math.abs(paramArrayOfDouble4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]);
          if ((d14 <= paramDouble4 ? 0 : 1) != 0)
          {
            if ((d14 >= 1.0D ? 0 : 1) != 0)
            {
              d15 = Math.abs(d18) + Math.abs(d17);
              if ((d15 <= d14 * paramDouble5 ? 0 : 1) != 0)
              {
                d8 = 1.0D / d15;
                Dscal.dscal(paramInt1, d8, paramArrayOfDouble2, paramInt4, 1);
                Dscal.dscal(paramInt1, d8, paramArrayOfDouble3, paramInt5, 1);
                d18 = paramArrayOfDouble2[(i - 1 + paramInt4)];
                d17 = paramArrayOfDouble3[(i - 1 + paramInt5)];
                localdoubleW.val *= d8;
                d12 *= d8;
              }
            }
            dladiv_adapter(d18, d17, paramArrayOfDouble4[(i - 1 + (i - 1) * paramInt7 + paramInt6)], paramArrayOfDouble4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)], paramArrayOfDouble2, i - 1 + paramInt4, paramArrayOfDouble3, i - 1 + paramInt5);
            d12 = Math.max(Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]) + Math.abs(paramArrayOfDouble3[(i - 1 + paramInt5)]), d12);
            d11 = paramDouble5 / d12;
          }
          else
          {
            i1 = 1;
            for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
            {
              paramArrayOfDouble2[(i1 - 1 + paramInt4)] = 0.0D;
              paramArrayOfDouble3[(i1 - 1 + paramInt5)] = 0.0D;
              i1 += 1;
            }
            paramArrayOfDouble2[(i - 1 + paramInt4)] = 1.0D;
            paramArrayOfDouble3[(i - 1 + paramInt5)] = 1.0D;
            localdoubleW.val = 0.0D;
            d12 = 1.0D;
            d11 = paramDouble5;
          }
          i += m;
        }
        d13 = Dasum.dasum(paramInt1, paramArrayOfDouble2, paramInt4, 1) + Dasum.dasum(paramInt1, paramArrayOfDouble3, paramInt5, 1);
        if ((d13 < d5 * localdoubleW.val ? 0 : 1) != 0) {
          break;
        }
        d19 = paramDouble3 / (d9 + 1.0D);
        paramArrayOfDouble2[(1 - 1 + paramInt4)] = paramDouble3;
        paramArrayOfDouble3[(1 - 1 + paramInt5)] = 0.0D;
        i = 2;
        for (i3 = paramInt1 - 2 + 1; i3 > 0; i3--)
        {
          paramArrayOfDouble2[(i - 1 + paramInt4)] = d19;
          paramArrayOfDouble3[(i - 1 + paramInt5)] = 0.0D;
          i += 1;
        }
        paramArrayOfDouble2[(paramInt1 - n + 1 - 1 + paramInt4)] -= paramDouble3 * d9;
        n += 1;
      }
      paramintW.val = 1;
      d13 = 0.0D;
      i = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        d13 = Math.max(d13, Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]) + Math.abs(paramArrayOfDouble3[(i - 1 + paramInt5)]));
        i += 1;
      }
      Dscal.dscal(paramInt1, 1.0D / d13, paramArrayOfDouble2, paramInt4, 1);
      Dscal.dscal(paramInt1, 1.0D / d13, paramArrayOfDouble3, paramInt5, 1);
    }
  }
  
  private static void dladiv_adapter(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt1]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble2[paramInt2]);
    Dladiv.dladiv(paramDouble1, paramDouble2, paramDouble3, paramDouble4, localdoubleW1, localdoubleW2);
    paramArrayOfDouble1[paramInt1] = localdoubleW1.val;
    paramArrayOfDouble2[paramInt2] = localdoubleW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaein.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */