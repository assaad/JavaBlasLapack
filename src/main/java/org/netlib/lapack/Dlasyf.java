package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.blas.Idamax;
import org.netlib.util.intW;

public final class Dlasyf
{
  public static void dlasyf(String paramString, int paramInt1, int paramInt2, intW paramintW1, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, intW paramintW2)
  {
    int i = 0;
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    paramintW2.val = 0;
    d2 = (1.0D + Math.sqrt(17.0D)) / 8.0D;
    int i8;
    int i9;
    if (Lsame.lsame(paramString, "U"))
    {
      i2 = paramInt1;
      for (;;)
      {
        i7 = paramInt2 + i2 - paramInt1;
        if ((i2 > paramInt1 - paramInt2 + 1 ? 0 : 1) != 0) {}
        if (((paramInt2 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
        if (((i2 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          break;
        }
        Dcopy.dcopy(i2, paramArrayOfDouble1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, 1 - 1 + (i7 - 1) * paramInt7 + paramInt6, 1);
        if ((i2 >= paramInt1 ? 0 : 1) != 0) {
          Dgemv.dgemv("No transpose", i2, paramInt1 - i2, -1.0D, paramArrayOfDouble1, 1 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i2 - 1 + (i7 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble2, 1 - 1 + (i7 - 1) * paramInt7 + paramInt6, 1);
        }
        i6 = 1;
        d1 = Math.abs(paramArrayOfDouble2[(i2 - 1 + (i7 - 1) * paramInt7 + paramInt6)]);
        if ((i2 <= 1 ? 0 : 1) != 0)
        {
          i = Idamax.idamax(i2 - 1, paramArrayOfDouble2, 1 - 1 + (i7 - 1) * paramInt7 + paramInt6, 1);
          d3 = Math.abs(paramArrayOfDouble2[(i - 1 + (i7 - 1) * paramInt7 + paramInt6)]);
        }
        else
        {
          d3 = 0.0D;
        }
        if ((Math.max(d1, d3) != 0.0D ? 0 : 1) != 0)
        {
          if ((paramintW2.val != 0 ? 0 : 1) != 0) {
            paramintW2.val = i2;
          }
          i5 = i2;
        }
        else
        {
          if ((d1 < d2 * d3 ? 0 : 1) != 0)
          {
            i5 = i2;
          }
          else
          {
            Dcopy.dcopy(i, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1);
            Dcopy.dcopy(i2 - i, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i + 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1);
            if ((i2 >= paramInt1 ? 0 : 1) != 0) {
              Dgemv.dgemv("No transpose", i2, paramInt1 - i2, -1.0D, paramArrayOfDouble1, 1 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (i7 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble2, 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1);
            }
            n = i + Idamax.idamax(i2 - i, paramArrayOfDouble2, i + 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1);
            d8 = Math.abs(paramArrayOfDouble2[(n - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)]);
            if ((i <= 1 ? 0 : 1) != 0)
            {
              n = Idamax.idamax(i - 1, paramArrayOfDouble2, 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1);
              d8 = Math.max(d8, Math.abs(paramArrayOfDouble2[(n - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)]));
            }
            if ((d1 < d2 * d3 * (d3 / d8) ? 0 : 1) != 0)
            {
              i5 = i2;
            }
            else if ((Math.abs(paramArrayOfDouble2[(i - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)]) < d2 * d8 ? 0 : 1) != 0)
            {
              i5 = i;
              Dcopy.dcopy(i2, paramArrayOfDouble2, 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble2, 1 - 1 + (i7 - 1) * paramInt7 + paramInt6, 1);
            }
            else
            {
              i5 = i;
              i6 = 2;
            }
          }
          i3 = i2 - i6 + 1;
          i4 = paramInt2 + i3 - paramInt1;
          if ((i5 == i3 ? 0 : 1) != 0)
          {
            paramArrayOfDouble1[(i5 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble1[(i3 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
            Dcopy.dcopy(i2 - 1 - i5, paramArrayOfDouble1, i5 + 1 - 1 + (i3 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, i5 - 1 + (i5 + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Dcopy.dcopy(i5, paramArrayOfDouble1, 1 - 1 + (i3 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, 1 - 1 + (i5 - 1) * paramInt4 + paramInt3, 1);
            Dswap.dswap(paramInt1 - i3 + 1, paramArrayOfDouble1, i3 - 1 + (i3 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, i5 - 1 + (i3 - 1) * paramInt4 + paramInt3, paramInt4);
            Dswap.dswap(paramInt1 - i3 + 1, paramArrayOfDouble2, i3 - 1 + (i4 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, i5 - 1 + (i4 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          if ((i6 != 1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(i2, paramArrayOfDouble2, 1 - 1 + (i7 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1);
            d7 = 1.0D / paramArrayOfDouble1[(i2 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
            Dscal.dscal(i2 - 1, d7, paramArrayOfDouble1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1);
          }
          else
          {
            if ((i2 <= 2 ? 0 : 1) != 0)
            {
              d5 = paramArrayOfDouble2[(i2 - 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)];
              d4 = paramArrayOfDouble2[(i2 - 1 + (i7 - 1) * paramInt7 + paramInt6)] / d5;
              d6 = paramArrayOfDouble2[(i2 - 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)] / d5;
              d9 = 1.0D / (d4 * d6 - 1.0D);
              d5 = d9 / d5;
              j = 1;
              for (i8 = i2 - 2 - 1 + 1; i8 > 0; i8--)
              {
                paramArrayOfDouble1[(j - 1 + (i2 - 1 - 1) * paramInt4 + paramInt3)] = (d5 * (d4 * paramArrayOfDouble2[(j - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble2[(j - 1 + (i7 - 1) * paramInt7 + paramInt6)]));
                paramArrayOfDouble1[(j - 1 + (i2 - 1) * paramInt4 + paramInt3)] = (d5 * (d6 * paramArrayOfDouble2[(j - 1 + (i7 - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble2[(j - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)]));
                j += 1;
              }
            }
            paramArrayOfDouble1[(i2 - 1 - 1 + (i2 - 1 - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble2[(i2 - 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)];
            paramArrayOfDouble1[(i2 - 1 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble2[(i2 - 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)];
            paramArrayOfDouble1[(i2 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble2[(i2 - 1 + (i7 - 1) * paramInt7 + paramInt6)];
          }
        }
        if ((i6 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfInt[(i2 - 1 + paramInt5)] = i5;
        }
        else
        {
          paramArrayOfInt[(i2 - 1 + paramInt5)] = (-i5);
          paramArrayOfInt[(i2 - 1 - 1 + paramInt5)] = (-i5);
        }
        i2 -= i6;
      }
      j = (i2 - 1) / paramInt2 * paramInt2 + 1;
      for (i8 = (1 - ((i2 - 1) / paramInt2 * paramInt2 + 1) + -paramInt2) / -paramInt2; i8 > 0; i8--)
      {
        k = Math.min(paramInt2, i2 - j + 1);
        m = j;
        for (i9 = j + k - 1 - j + 1; i9 > 0; i9--)
        {
          Dgemv.dgemv("No transpose", m - j + 1, paramInt1 - i2, -1.0D, paramArrayOfDouble1, j - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, m - 1 + (i7 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble1, j - 1 + (m - 1) * paramInt4 + paramInt3, 1);
          m += 1;
        }
        Dgemm.dgemm("No transpose", "Transpose", j - 1, k, paramInt1 - i2, -1.0D, paramArrayOfDouble1, 1 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, j - 1 + (i7 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4);
        j += -paramInt2;
      }
      j = i2 + 1;
      do
      {
        m = j;
        i1 = paramArrayOfInt[(j - 1 + paramInt5)];
        if ((i1 >= 0 ? 0 : 1) != 0)
        {
          i1 = -i1;
          j += 1;
        }
        j += 1;
        if ((i1 == m ? 0 : 1) != 0) {}
        if (((j > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          Dswap.dswap(paramInt1 - j + 1, paramArrayOfDouble1, i1 - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, m - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4);
        }
      } while ((j > paramInt1 ? 0 : 1) != 0);
      paramintW1.val = (paramInt1 - i2);
    }
    else
    {
      i2 = 1;
      for (;;)
      {
        if ((i2 < paramInt2 ? 0 : 1) != 0) {}
        if (((paramInt2 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
        if (((i2 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          break;
        }
        Dcopy.dcopy(paramInt1 - i2 + 1, paramArrayOfDouble1, i2 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
        Dgemv.dgemv("No transpose", paramInt1 - i2 + 1, i2 - 1, -1.0D, paramArrayOfDouble1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
        i6 = 1;
        d1 = Math.abs(paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)]);
        if ((i2 >= paramInt1 ? 0 : 1) != 0)
        {
          i = i2 + Idamax.idamax(paramInt1 - i2, paramArrayOfDouble2, i2 + 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
          d3 = Math.abs(paramArrayOfDouble2[(i - 1 + (i2 - 1) * paramInt7 + paramInt6)]);
        }
        else
        {
          d3 = 0.0D;
        }
        if ((Math.max(d1, d3) != 0.0D ? 0 : 1) != 0)
        {
          if ((paramintW2.val != 0 ? 0 : 1) != 0) {
            paramintW2.val = i2;
          }
          i5 = i2;
        }
        else
        {
          if ((d1 < d2 * d3 ? 0 : 1) != 0)
          {
            i5 = i2;
          }
          else
          {
            Dcopy.dcopy(i - i2, paramArrayOfDouble1, i - 1 + (i2 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i2 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1);
            Dcopy.dcopy(paramInt1 - i + 1, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, i - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1);
            Dgemv.dgemv("No transpose", paramInt1 - i2 + 1, i2 - 1, -1.0D, paramArrayOfDouble1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble2, i2 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1);
            n = i2 - 1 + Idamax.idamax(i - i2, paramArrayOfDouble2, i2 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1);
            d8 = Math.abs(paramArrayOfDouble2[(n - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)]);
            if ((i >= paramInt1 ? 0 : 1) != 0)
            {
              n = i + Idamax.idamax(paramInt1 - i, paramArrayOfDouble2, i + 1 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1);
              d8 = Math.max(d8, Math.abs(paramArrayOfDouble2[(n - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)]));
            }
            if ((d1 < d2 * d3 * (d3 / d8) ? 0 : 1) != 0)
            {
              i5 = i2;
            }
            else if ((Math.abs(paramArrayOfDouble2[(i - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)]) < d2 * d8 ? 0 : 1) != 0)
            {
              i5 = i;
              Dcopy.dcopy(paramInt1 - i2 + 1, paramArrayOfDouble2, i2 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
            }
            else
            {
              i5 = i;
              i6 = 2;
            }
          }
          i3 = i2 + i6 - 1;
          if ((i5 == i3 ? 0 : 1) != 0)
          {
            paramArrayOfDouble1[(i5 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble1[(i3 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
            Dcopy.dcopy(i5 - i2 - 1, paramArrayOfDouble1, i2 + 1 - 1 + (i3 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, i5 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Dcopy.dcopy(paramInt1 - i5 + 1, paramArrayOfDouble1, i5 - 1 + (i3 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, i5 - 1 + (i5 - 1) * paramInt4 + paramInt3, 1);
            Dswap.dswap(i3, paramArrayOfDouble1, i3 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, i5 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
            Dswap.dswap(i3, paramArrayOfDouble2, i3 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, i5 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          if ((i6 != 1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(paramInt1 - i2 + 1, paramArrayOfDouble2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble1, i2 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1);
            if ((i2 >= paramInt1 ? 0 : 1) != 0)
            {
              d7 = 1.0D / paramArrayOfDouble1[(i2 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
              Dscal.dscal(paramInt1 - i2, d7, paramArrayOfDouble1, i2 + 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1);
            }
          }
          else
          {
            if ((i2 >= paramInt1 - 1 ? 0 : 1) != 0)
            {
              d5 = paramArrayOfDouble2[(i2 + 1 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
              d4 = paramArrayOfDouble2[(i2 + 1 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)] / d5;
              d6 = paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)] / d5;
              d9 = 1.0D / (d4 * d6 - 1.0D);
              d5 = d9 / d5;
              j = i2 + 2;
              for (i8 = paramInt1 - (i2 + 2) + 1; i8 > 0; i8--)
              {
                paramArrayOfDouble1[(j - 1 + (i2 - 1) * paramInt4 + paramInt3)] = (d5 * (d4 * paramArrayOfDouble2[(j - 1 + (i2 - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble2[(j - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)]));
                paramArrayOfDouble1[(j - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3)] = (d5 * (d6 * paramArrayOfDouble2[(j - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)] - paramArrayOfDouble2[(j - 1 + (i2 - 1) * paramInt7 + paramInt6)]));
                j += 1;
              }
            }
            paramArrayOfDouble1[(i2 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
            paramArrayOfDouble1[(i2 + 1 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble2[(i2 + 1 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
            paramArrayOfDouble1[(i2 + 1 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble2[(i2 + 1 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)];
          }
        }
        if ((i6 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfInt[(i2 - 1 + paramInt5)] = i5;
        }
        else
        {
          paramArrayOfInt[(i2 - 1 + paramInt5)] = (-i5);
          paramArrayOfInt[(i2 + 1 - 1 + paramInt5)] = (-i5);
        }
        i2 += i6;
      }
      j = i2;
      for (i8 = (paramInt1 - i2 + paramInt2) / paramInt2; i8 > 0; i8--)
      {
        k = Math.min(paramInt2, paramInt1 - j + 1);
        m = j;
        for (i9 = j + k - 1 - j + 1; i9 > 0; i9--)
        {
          Dgemv.dgemv("No transpose", j + k - m, i2 - 1, -1.0D, paramArrayOfDouble1, m - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, m - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble1, m - 1 + (m - 1) * paramInt4 + paramInt3, 1);
          m += 1;
        }
        if ((j + k > paramInt1 ? 0 : 1) != 0) {
          Dgemm.dgemm("No transpose", "Transpose", paramInt1 - j - k + 1, k, i2 - 1, -1.0D, paramArrayOfDouble1, j + k - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble1, j + k - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4);
        }
        j += paramInt2;
      }
      j = i2 - 1;
      do
      {
        m = j;
        i1 = paramArrayOfInt[(j - 1 + paramInt5)];
        if ((i1 >= 0 ? 0 : 1) != 0)
        {
          i1 = -i1;
          j -= 1;
        }
        j -= 1;
        if ((i1 == m ? 0 : 1) != 0) {}
        if (((j < 1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          Dswap.dswap(j, paramArrayOfDouble1, i1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble1, m - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        }
      } while ((j < 1 ? 0 : 1) != 0);
      paramintW1.val = (i2 - 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasyf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */