package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sasum;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sscal;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaein
{
  public static void slaein(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, float paramFloat3, float paramFloat4, float paramFloat5, intW paramintW)
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    floatW localfloatW = new floatW(0.0F);
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    paramintW.val = 0;
    f9 = (float)Math.sqrt(paramInt1);
    f5 = 0.1F / f9;
    f7 = Math.max(1.0F, paramFloat3 * f9) * paramFloat4;
    i1 = 1;
    int i3;
    for (int i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
    {
      i = 1;
      for (i3 = i1 - 1 - 1 + 1; i3 > 0; i3--)
      {
        paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = paramArrayOfFloat1[(i - 1 + (i1 - 1) * paramInt3 + paramInt2)];
        i += 1;
      }
      paramArrayOfFloat1[(i1 - 1 + (i1 - 1) * paramInt3 + paramInt2)] -= paramFloat1;
      i1 += 1;
    }
    if ((paramFloat2 != 0.0F ? 0 : 1) != 0)
    {
      if (paramBoolean2)
      {
        i = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfFloat2[(i - 1 + paramInt4)] = paramFloat3;
          i += 1;
        }
      }
      else
      {
        f13 = Snrm2.snrm2(paramInt1, paramArrayOfFloat2, paramInt4, 1);
        Sscal.sscal(paramInt1, paramFloat3 * f9 / Math.max(f13, f7), paramArrayOfFloat2, paramInt4, 1);
      }
      if (paramBoolean1)
      {
        i = 1;
        for (i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
        {
          f3 = paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)];
          if ((Math.abs(paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)]) >= Math.abs(f3) ? 0 : 1) != 0)
          {
            f16 = paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] / f3;
            paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = f3;
            i1 = i + 1;
            for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
            {
              f10 = paramArrayOfFloat4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)];
              paramArrayOfFloat4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] - f16 * f10);
              paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = f10;
              i1 += 1;
            }
          }
          else
          {
            if ((paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] != 0.0F ? 0 : 1) != 0) {
              paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = paramFloat3;
            }
            f16 = f3 / paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)];
            if ((f16 == 0.0F ? 0 : 1) != 0)
            {
              i1 = i + 1;
              for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
              {
                paramArrayOfFloat4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] -= f16 * paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)];
                i1 += 1;
              }
            }
          }
          i += 1;
        }
        if ((paramArrayOfFloat4[(paramInt1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] != 0.0F ? 0 : 1) != 0) {
          paramArrayOfFloat4[(paramInt1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] = paramFloat3;
        }
        str2 = "N";
      }
      else
      {
        i1 = paramInt1;
        for (i2 = (2 - paramInt1 + -1) / -1; i2 > 0; i2--)
        {
          f4 = paramArrayOfFloat1[(i1 - 1 + (i1 - 1 - 1) * paramInt3 + paramInt2)];
          if ((Math.abs(paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)]) >= Math.abs(f4) ? 0 : 1) != 0)
          {
            f16 = paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] / f4;
            paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = f4;
            i = 1;
            for (i3 = i1 - 1 - 1 + 1; i3 > 0; i3--)
            {
              f10 = paramArrayOfFloat4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)];
              paramArrayOfFloat4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] - f16 * f10);
              paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = f10;
              i += 1;
            }
          }
          else
          {
            if ((paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] != 0.0F ? 0 : 1) != 0) {
              paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = paramFloat3;
            }
            f16 = f4 / paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)];
            if ((f16 == 0.0F ? 0 : 1) != 0)
            {
              i = 1;
              for (i3 = i1 - 1 - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfFloat4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] -= f16 * paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)];
                i += 1;
              }
            }
          }
          i1 += -1;
        }
        if ((paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] != 0.0F ? 0 : 1) != 0) {
          paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = paramFloat3;
        }
        str2 = "T";
      }
      str1 = "N";
      n = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        Slatrs.slatrs("Upper", str2, "Nonunit", str1, paramInt1, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfFloat2, paramInt4, localfloatW, paramArrayOfFloat5, paramInt8, localintW);
        str1 = "Y";
        f13 = Sasum.sasum(paramInt1, paramArrayOfFloat2, paramInt4, 1);
        if ((f13 < f5 * localfloatW.val ? 0 : 1) != 0) {
          break;
        }
        f10 = paramFloat3 / (f9 + 1.0F);
        paramArrayOfFloat2[(1 - 1 + paramInt4)] = paramFloat3;
        i = 2;
        for (i3 = paramInt1 - 2 + 1; i3 > 0; i3--)
        {
          paramArrayOfFloat2[(i - 1 + paramInt4)] = f10;
          i += 1;
        }
        paramArrayOfFloat2[(paramInt1 - n + 1 - 1 + paramInt4)] -= paramFloat3 * f9;
        n += 1;
      }
      paramintW.val = 1;
      i = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt4, 1);
      Sscal.sscal(paramInt1, 1.0F / Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]), paramArrayOfFloat2, paramInt4, 1);
    }
    else
    {
      if (paramBoolean2)
      {
        i = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfFloat2[(i - 1 + paramInt4)] = paramFloat3;
          paramArrayOfFloat3[(i - 1 + paramInt5)] = 0.0F;
          i += 1;
        }
      }
      else
      {
        f6 = Slapy2.slapy2(Snrm2.snrm2(paramInt1, paramArrayOfFloat2, paramInt4, 1), Snrm2.snrm2(paramInt1, paramArrayOfFloat3, paramInt5, 1));
        f8 = paramFloat3 * f9 / Math.max(f6, f7);
        Sscal.sscal(paramInt1, f8, paramArrayOfFloat2, paramInt4, 1);
        Sscal.sscal(paramInt1, f8, paramArrayOfFloat3, paramInt5, 1);
      }
      if (paramBoolean1)
      {
        paramArrayOfFloat4[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)] = (-paramFloat2);
        i = 2;
        for (i2 = paramInt1 - 2 + 1; i2 > 0; i2--)
        {
          paramArrayOfFloat4[(i + 1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = 0.0F;
          i += 1;
        }
        i = 1;
        for (i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
        {
          f1 = Slapy2.slapy2(paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)], paramArrayOfFloat4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]);
          f3 = paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)];
          if ((f1 >= Math.abs(f3) ? 0 : 1) != 0)
          {
            f18 = paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] / f3;
            f17 = paramArrayOfFloat4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] / f3;
            paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = f3;
            paramArrayOfFloat4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0F;
            i1 = i + 1;
            for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
            {
              f10 = paramArrayOfFloat4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)];
              paramArrayOfFloat4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] - f18 * f10);
              paramArrayOfFloat4[(i1 + 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] - f17 * f10);
              paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = f10;
              paramArrayOfFloat4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0F;
              i1 += 1;
            }
            paramArrayOfFloat4[(i + 2 - 1 + (i - 1) * paramInt7 + paramInt6)] = (-paramFloat2);
            paramArrayOfFloat4[(i + 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6)] -= f17 * paramFloat2;
            paramArrayOfFloat4[(i + 2 - 1 + (i + 1 - 1) * paramInt7 + paramInt6)] += f18 * paramFloat2;
          }
          else
          {
            if ((f1 != 0.0F ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] = paramFloat3;
              paramArrayOfFloat4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0F;
              f1 = paramFloat3;
            }
            f3 = f3 / f1 / f1;
            f18 = paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)] * f3;
            f17 = -(paramArrayOfFloat4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] * f3);
            i1 = i + 1;
            for (i3 = paramInt1 - (i + 1) + 1; i3 > 0; i3--)
            {
              paramArrayOfFloat4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] - f18 * paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] + f17 * paramArrayOfFloat4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]);
              paramArrayOfFloat4[(i1 + 1 - 1 + (i + 1 - 1) * paramInt7 + paramInt6)] = (-(f18 * paramArrayOfFloat4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]) - f17 * paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)]);
              i1 += 1;
            }
            paramArrayOfFloat4[(i + 2 - 1 + (i + 1 - 1) * paramInt7 + paramInt6)] -= paramFloat2;
          }
          paramArrayOfFloat5[(i - 1 + paramInt8)] = (Sasum.sasum(paramInt1 - i, paramArrayOfFloat4, i - 1 + (i + 1 - 1) * paramInt7 + paramInt6, paramInt7) + Sasum.sasum(paramInt1 - i, paramArrayOfFloat4, i + 2 - 1 + (i - 1) * paramInt7 + paramInt6, 1));
          i += 1;
        }
        if ((paramArrayOfFloat4[(paramInt1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] != 0.0F ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat4[(paramInt1 + 1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramArrayOfFloat4[(paramInt1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] = paramFloat3;
        }
        paramArrayOfFloat5[(paramInt1 - 1 + paramInt8)] = 0.0F;
        j = paramInt1;
        k = 1;
        m = -1;
      }
      else
      {
        paramArrayOfFloat4[(paramInt1 + 1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] = paramFloat2;
        i1 = 1;
        for (i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfFloat4[(paramInt1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = 0.0F;
          i1 += 1;
        }
        i1 = paramInt1;
        for (i2 = (2 - paramInt1 + -1) / -1; i2 > 0; i2--)
        {
          f4 = paramArrayOfFloat1[(i1 - 1 + (i1 - 1 - 1) * paramInt3 + paramInt2)];
          f2 = Slapy2.slapy2(paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)], paramArrayOfFloat4[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)]);
          if ((f2 >= Math.abs(f4) ? 0 : 1) != 0)
          {
            f18 = paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] / f4;
            f17 = paramArrayOfFloat4[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] / f4;
            paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = f4;
            paramArrayOfFloat4[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = 0.0F;
            i = 1;
            for (i3 = i1 - 1 - 1 + 1; i3 > 0; i3--)
            {
              f10 = paramArrayOfFloat4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)];
              paramArrayOfFloat4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] - f18 * f10);
              paramArrayOfFloat4[(i1 - 1 + (i - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] - f17 * f10);
              paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = f10;
              paramArrayOfFloat4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] = 0.0F;
              i += 1;
            }
            paramArrayOfFloat4[(i1 + 1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] = paramFloat2;
            paramArrayOfFloat4[(i1 - 1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] += f17 * paramFloat2;
            paramArrayOfFloat4[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] -= f18 * paramFloat2;
          }
          else
          {
            if ((f2 != 0.0F ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = paramFloat3;
              paramArrayOfFloat4[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] = 0.0F;
              f2 = paramFloat3;
            }
            f4 = f4 / f2 / f2;
            f18 = paramArrayOfFloat4[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] * f4;
            f17 = -(paramArrayOfFloat4[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] * f4);
            i = 1;
            for (i3 = i1 - 1 - 1 + 1; i3 > 0; i3--)
            {
              paramArrayOfFloat4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat4[(i - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] - f18 * paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] + f17 * paramArrayOfFloat4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]);
              paramArrayOfFloat4[(i1 - 1 + (i - 1) * paramInt7 + paramInt6)] = (-(f18 * paramArrayOfFloat4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]) - f17 * paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)]);
              i += 1;
            }
            paramArrayOfFloat4[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] += paramFloat2;
          }
          paramArrayOfFloat5[(i1 - 1 + paramInt8)] = (Sasum.sasum(i1 - 1, paramArrayOfFloat4, 1 - 1 + (i1 - 1) * paramInt7 + paramInt6, 1) + Sasum.sasum(i1 - 1, paramArrayOfFloat4, i1 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7));
          i1 += -1;
        }
        if ((paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] != 0.0F ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat4[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = paramFloat3;
        }
        paramArrayOfFloat5[(1 - 1 + paramInt8)] = 0.0F;
        j = 1;
        k = paramInt1;
        m = 1;
      }
      n = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        localfloatW.val = 1.0F;
        f12 = 1.0F;
        f11 = paramFloat5;
        i = j;
        for (i3 = (k - j + m) / m; i3 > 0; i3--)
        {
          if ((paramArrayOfFloat5[(i - 1 + paramInt8)] <= f11 ? 0 : 1) != 0)
          {
            f8 = 1.0F / f12;
            Sscal.sscal(paramInt1, f8, paramArrayOfFloat2, paramInt4, 1);
            Sscal.sscal(paramInt1, f8, paramArrayOfFloat3, paramInt5, 1);
            localfloatW.val *= f8;
            f12 = 1.0F;
            f11 = paramFloat5;
          }
          f18 = paramArrayOfFloat2[(i - 1 + paramInt4)];
          f17 = paramArrayOfFloat3[(i - 1 + paramInt5)];
          int i4;
          if (paramBoolean1)
          {
            i1 = i + 1;
            for (i4 = paramInt1 - (i + 1) + 1; i4 > 0; i4--)
            {
              f18 = f18 - paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)] + paramArrayOfFloat4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)];
              f17 = f17 - paramArrayOfFloat4[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)] - paramArrayOfFloat4[(i1 + 1 - 1 + (i - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)];
              i1 += 1;
            }
          }
          else
          {
            i1 = 1;
            for (i4 = i - 1 - 1 + 1; i4 > 0; i4--)
            {
              f18 = f18 - paramArrayOfFloat4[(i1 - 1 + (i - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)] + paramArrayOfFloat4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)];
              f17 = f17 - paramArrayOfFloat4[(i1 - 1 + (i - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat3[(i1 - 1 + paramInt5)] - paramArrayOfFloat4[(i + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] * paramArrayOfFloat2[(i1 - 1 + paramInt4)];
              i1 += 1;
            }
          }
          f14 = Math.abs(paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)]) + Math.abs(paramArrayOfFloat4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)]);
          if ((f14 <= paramFloat4 ? 0 : 1) != 0)
          {
            if ((f14 >= 1.0F ? 0 : 1) != 0)
            {
              f15 = Math.abs(f18) + Math.abs(f17);
              if ((f15 <= f14 * paramFloat5 ? 0 : 1) != 0)
              {
                f8 = 1.0F / f15;
                Sscal.sscal(paramInt1, f8, paramArrayOfFloat2, paramInt4, 1);
                Sscal.sscal(paramInt1, f8, paramArrayOfFloat3, paramInt5, 1);
                f18 = paramArrayOfFloat2[(i - 1 + paramInt4)];
                f17 = paramArrayOfFloat3[(i - 1 + paramInt5)];
                localfloatW.val *= f8;
                f12 *= f8;
              }
            }
            sladiv_adapter(f18, f17, paramArrayOfFloat4[(i - 1 + (i - 1) * paramInt7 + paramInt6)], paramArrayOfFloat4[(i + 1 - 1 + (i - 1) * paramInt7 + paramInt6)], paramArrayOfFloat2, i - 1 + paramInt4, paramArrayOfFloat3, i - 1 + paramInt5);
            f12 = Math.max(Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]) + Math.abs(paramArrayOfFloat3[(i - 1 + paramInt5)]), f12);
            f11 = paramFloat5 / f12;
          }
          else
          {
            i1 = 1;
            for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
            {
              paramArrayOfFloat2[(i1 - 1 + paramInt4)] = 0.0F;
              paramArrayOfFloat3[(i1 - 1 + paramInt5)] = 0.0F;
              i1 += 1;
            }
            paramArrayOfFloat2[(i - 1 + paramInt4)] = 1.0F;
            paramArrayOfFloat3[(i - 1 + paramInt5)] = 1.0F;
            localfloatW.val = 0.0F;
            f12 = 1.0F;
            f11 = paramFloat5;
          }
          i += m;
        }
        f13 = Sasum.sasum(paramInt1, paramArrayOfFloat2, paramInt4, 1) + Sasum.sasum(paramInt1, paramArrayOfFloat3, paramInt5, 1);
        if ((f13 < f5 * localfloatW.val ? 0 : 1) != 0) {
          break;
        }
        f19 = paramFloat3 / (f9 + 1.0F);
        paramArrayOfFloat2[(1 - 1 + paramInt4)] = paramFloat3;
        paramArrayOfFloat3[(1 - 1 + paramInt5)] = 0.0F;
        i = 2;
        for (i3 = paramInt1 - 2 + 1; i3 > 0; i3--)
        {
          paramArrayOfFloat2[(i - 1 + paramInt4)] = f19;
          paramArrayOfFloat3[(i - 1 + paramInt5)] = 0.0F;
          i += 1;
        }
        paramArrayOfFloat2[(paramInt1 - n + 1 - 1 + paramInt4)] -= paramFloat3 * f9;
        n += 1;
      }
      paramintW.val = 1;
      f13 = 0.0F;
      i = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        f13 = Math.max(f13, Math.abs(paramArrayOfFloat2[(i - 1 + paramInt4)]) + Math.abs(paramArrayOfFloat3[(i - 1 + paramInt5)]));
        i += 1;
      }
      Sscal.sscal(paramInt1, 1.0F / f13, paramArrayOfFloat2, paramInt4, 1);
      Sscal.sscal(paramInt1, 1.0F / f13, paramArrayOfFloat3, paramInt5, 1);
    }
  }
  
  private static void sladiv_adapter(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt1]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat2[paramInt2]);
    Sladiv.sladiv(paramFloat1, paramFloat2, paramFloat3, paramFloat4, localfloatW1, localfloatW2);
    paramArrayOfFloat1[paramInt1] = localfloatW1.val;
    paramArrayOfFloat2[paramInt2] = localfloatW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaein.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */