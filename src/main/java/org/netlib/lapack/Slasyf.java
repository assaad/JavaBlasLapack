package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.util.intW;

public final class Slasyf
{
  public static void slasyf(String paramString, int paramInt1, int paramInt2, intW paramintW1, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, intW paramintW2)
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    paramintW2.val = 0;
    f2 = (1.0F + (float)Math.sqrt(17.0F)) / 8.0F;
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
        Scopy.scopy(i2, paramArrayOfFloat1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, 1 - 1 + (i7 - 1) * paramInt7 + paramInt6, 1);
        if ((i2 >= paramInt1 ? 0 : 1) != 0) {
          Sgemv.sgemv("No transpose", i2, paramInt1 - i2, -1.0F, paramArrayOfFloat1, 1 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i2 - 1 + (i7 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat2, 1 - 1 + (i7 - 1) * paramInt7 + paramInt6, 1);
        }
        i6 = 1;
        f1 = Math.abs(paramArrayOfFloat2[(i2 - 1 + (i7 - 1) * paramInt7 + paramInt6)]);
        if ((i2 <= 1 ? 0 : 1) != 0)
        {
          i = Isamax.isamax(i2 - 1, paramArrayOfFloat2, 1 - 1 + (i7 - 1) * paramInt7 + paramInt6, 1);
          f3 = Math.abs(paramArrayOfFloat2[(i - 1 + (i7 - 1) * paramInt7 + paramInt6)]);
        }
        else
        {
          f3 = 0.0F;
        }
        if ((Math.max(f1, f3) != 0.0F ? 0 : 1) != 0)
        {
          if ((paramintW2.val != 0 ? 0 : 1) != 0) {
            paramintW2.val = i2;
          }
          i5 = i2;
        }
        else
        {
          if ((f1 < f2 * f3 ? 0 : 1) != 0)
          {
            i5 = i2;
          }
          else
          {
            Scopy.scopy(i, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1);
            Scopy.scopy(i2 - i, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i + 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1);
            if ((i2 >= paramInt1 ? 0 : 1) != 0) {
              Sgemv.sgemv("No transpose", i2, paramInt1 - i2, -1.0F, paramArrayOfFloat1, 1 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (i7 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat2, 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1);
            }
            n = i + Isamax.isamax(i2 - i, paramArrayOfFloat2, i + 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1);
            f8 = Math.abs(paramArrayOfFloat2[(n - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)]);
            if ((i <= 1 ? 0 : 1) != 0)
            {
              n = Isamax.isamax(i - 1, paramArrayOfFloat2, 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1);
              f8 = Math.max(f8, Math.abs(paramArrayOfFloat2[(n - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)]));
            }
            if ((f1 < f2 * f3 * (f3 / f8) ? 0 : 1) != 0)
            {
              i5 = i2;
            }
            else if ((Math.abs(paramArrayOfFloat2[(i - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)]) < f2 * f8 ? 0 : 1) != 0)
            {
              i5 = i;
              Scopy.scopy(i2, paramArrayOfFloat2, 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat2, 1 - 1 + (i7 - 1) * paramInt7 + paramInt6, 1);
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
            paramArrayOfFloat1[(i5 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat1[(i3 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
            Scopy.scopy(i2 - 1 - i5, paramArrayOfFloat1, i5 + 1 - 1 + (i3 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat1, i5 - 1 + (i5 + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Scopy.scopy(i5, paramArrayOfFloat1, 1 - 1 + (i3 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat1, 1 - 1 + (i5 - 1) * paramInt4 + paramInt3, 1);
            Sswap.sswap(paramInt1 - i3 + 1, paramArrayOfFloat1, i3 - 1 + (i3 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, i5 - 1 + (i3 - 1) * paramInt4 + paramInt3, paramInt4);
            Sswap.sswap(paramInt1 - i3 + 1, paramArrayOfFloat2, i3 - 1 + (i4 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, i5 - 1 + (i4 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          if ((i6 != 1 ? 0 : 1) != 0)
          {
            Scopy.scopy(i2, paramArrayOfFloat2, 1 - 1 + (i7 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1);
            f7 = 1.0F / paramArrayOfFloat1[(i2 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
            Sscal.sscal(i2 - 1, f7, paramArrayOfFloat1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1);
          }
          else
          {
            if ((i2 <= 2 ? 0 : 1) != 0)
            {
              f5 = paramArrayOfFloat2[(i2 - 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)];
              f4 = paramArrayOfFloat2[(i2 - 1 + (i7 - 1) * paramInt7 + paramInt6)] / f5;
              f6 = paramArrayOfFloat2[(i2 - 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)] / f5;
              f9 = 1.0F / (f4 * f6 - 1.0F);
              f5 = f9 / f5;
              j = 1;
              for (i8 = i2 - 2 - 1 + 1; i8 > 0; i8--)
              {
                paramArrayOfFloat1[(j - 1 + (i2 - 1 - 1) * paramInt4 + paramInt3)] = (f5 * (f4 * paramArrayOfFloat2[(j - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat2[(j - 1 + (i7 - 1) * paramInt7 + paramInt6)]));
                paramArrayOfFloat1[(j - 1 + (i2 - 1) * paramInt4 + paramInt3)] = (f5 * (f6 * paramArrayOfFloat2[(j - 1 + (i7 - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat2[(j - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)]));
                j += 1;
              }
            }
            paramArrayOfFloat1[(i2 - 1 - 1 + (i2 - 1 - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat2[(i2 - 1 - 1 + (i7 - 1 - 1) * paramInt7 + paramInt6)];
            paramArrayOfFloat1[(i2 - 1 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat2[(i2 - 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)];
            paramArrayOfFloat1[(i2 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat2[(i2 - 1 + (i7 - 1) * paramInt7 + paramInt6)];
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
          Sgemv.sgemv("No transpose", m - j + 1, paramInt1 - i2, -1.0F, paramArrayOfFloat1, j - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, m - 1 + (i7 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat1, j - 1 + (m - 1) * paramInt4 + paramInt3, 1);
          m += 1;
        }
        Sgemm.sgemm("No transpose", "Transpose", j - 1, k, paramInt1 - i2, -1.0F, paramArrayOfFloat1, 1 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, j - 1 + (i7 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4);
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
          Sswap.sswap(paramInt1 - j + 1, paramArrayOfFloat1, i1 - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, m - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4);
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
        Scopy.scopy(paramInt1 - i2 + 1, paramArrayOfFloat1, i2 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
        Sgemv.sgemv("No transpose", paramInt1 - i2 + 1, i2 - 1, -1.0F, paramArrayOfFloat1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
        i6 = 1;
        f1 = Math.abs(paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)]);
        if ((i2 >= paramInt1 ? 0 : 1) != 0)
        {
          i = i2 + Isamax.isamax(paramInt1 - i2, paramArrayOfFloat2, i2 + 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
          f3 = Math.abs(paramArrayOfFloat2[(i - 1 + (i2 - 1) * paramInt7 + paramInt6)]);
        }
        else
        {
          f3 = 0.0F;
        }
        if ((Math.max(f1, f3) != 0.0F ? 0 : 1) != 0)
        {
          if ((paramintW2.val != 0 ? 0 : 1) != 0) {
            paramintW2.val = i2;
          }
          i5 = i2;
        }
        else
        {
          if ((f1 < f2 * f3 ? 0 : 1) != 0)
          {
            i5 = i2;
          }
          else
          {
            Scopy.scopy(i - i2, paramArrayOfFloat1, i - 1 + (i2 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i2 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1);
            Scopy.scopy(paramInt1 - i + 1, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, i - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1);
            Sgemv.sgemv("No transpose", paramInt1 - i2 + 1, i2 - 1, -1.0F, paramArrayOfFloat1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat2, i2 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1);
            n = i2 - 1 + Isamax.isamax(i - i2, paramArrayOfFloat2, i2 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1);
            f8 = Math.abs(paramArrayOfFloat2[(n - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)]);
            if ((i >= paramInt1 ? 0 : 1) != 0)
            {
              n = i + Isamax.isamax(paramInt1 - i, paramArrayOfFloat2, i + 1 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1);
              f8 = Math.max(f8, Math.abs(paramArrayOfFloat2[(n - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)]));
            }
            if ((f1 < f2 * f3 * (f3 / f8) ? 0 : 1) != 0)
            {
              i5 = i2;
            }
            else if ((Math.abs(paramArrayOfFloat2[(i - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)]) < f2 * f8 ? 0 : 1) != 0)
            {
              i5 = i;
              Scopy.scopy(paramInt1 - i2 + 1, paramArrayOfFloat2, i2 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
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
            paramArrayOfFloat1[(i5 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat1[(i3 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
            Scopy.scopy(i5 - i2 - 1, paramArrayOfFloat1, i2 + 1 - 1 + (i3 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat1, i5 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Scopy.scopy(paramInt1 - i5 + 1, paramArrayOfFloat1, i5 - 1 + (i3 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat1, i5 - 1 + (i5 - 1) * paramInt4 + paramInt3, 1);
            Sswap.sswap(i3, paramArrayOfFloat1, i3 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, i5 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
            Sswap.sswap(i3, paramArrayOfFloat2, i3 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, i5 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          if ((i6 != 1 ? 0 : 1) != 0)
          {
            Scopy.scopy(paramInt1 - i2 + 1, paramArrayOfFloat2, i2 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat1, i2 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1);
            if ((i2 >= paramInt1 ? 0 : 1) != 0)
            {
              f7 = 1.0F / paramArrayOfFloat1[(i2 - 1 + (i2 - 1) * paramInt4 + paramInt3)];
              Sscal.sscal(paramInt1 - i2, f7, paramArrayOfFloat1, i2 + 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, 1);
            }
          }
          else
          {
            if ((i2 >= paramInt1 - 1 ? 0 : 1) != 0)
            {
              f5 = paramArrayOfFloat2[(i2 + 1 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
              f4 = paramArrayOfFloat2[(i2 + 1 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)] / f5;
              f6 = paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)] / f5;
              f9 = 1.0F / (f4 * f6 - 1.0F);
              f5 = f9 / f5;
              j = i2 + 2;
              for (i8 = paramInt1 - (i2 + 2) + 1; i8 > 0; i8--)
              {
                paramArrayOfFloat1[(j - 1 + (i2 - 1) * paramInt4 + paramInt3)] = (f5 * (f4 * paramArrayOfFloat2[(j - 1 + (i2 - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat2[(j - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)]));
                paramArrayOfFloat1[(j - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3)] = (f5 * (f6 * paramArrayOfFloat2[(j - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)] - paramArrayOfFloat2[(j - 1 + (i2 - 1) * paramInt7 + paramInt6)]));
                j += 1;
              }
            }
            paramArrayOfFloat1[(i2 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat2[(i2 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
            paramArrayOfFloat1[(i2 + 1 - 1 + (i2 - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat2[(i2 + 1 - 1 + (i2 - 1) * paramInt7 + paramInt6)];
            paramArrayOfFloat1[(i2 + 1 - 1 + (i2 + 1 - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat2[(i2 + 1 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6)];
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
          Sgemv.sgemv("No transpose", j + k - m, i2 - 1, -1.0F, paramArrayOfFloat1, m - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, m - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat1, m - 1 + (m - 1) * paramInt4 + paramInt3, 1);
          m += 1;
        }
        if ((j + k > paramInt1 ? 0 : 1) != 0) {
          Sgemm.sgemm("No transpose", "Transpose", paramInt1 - j - k + 1, k, i2 - 1, -1.0F, paramArrayOfFloat1, j + k - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat1, j + k - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4);
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
          Sswap.sswap(j, paramArrayOfFloat1, i1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat1, m - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        }
      } while ((j < 1 ? 0 : 1) != 0);
      paramintW1.val = (i2 - 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasyf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */