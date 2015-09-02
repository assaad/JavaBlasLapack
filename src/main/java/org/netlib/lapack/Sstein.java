package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sasum;
import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sstein
{
  public static void sstein(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, int[] paramArrayOfInt1, int paramInt6, int[] paramArrayOfInt2, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int[] paramArrayOfInt3, int paramInt11, int[] paramArrayOfInt4, int paramInt12, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    intW localintW = new intW(0);
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    floatW localfloatW = new floatW(0.0F);
    float f11 = 0.0F;
    float f12 = 0.0F;
    int[] arrayOfInt = new int[4];
    paramintW.val = 0;
    n = 1;
    for (int i13 = paramInt4 - 1 + 1; i13 > 0; i13--)
    {
      paramArrayOfInt4[(n - 1 + paramInt12)] = 0;
      n += 1;
    }
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt4 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt4 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -4;
      }
      else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else
      {
        i7 = 2;
        for (i13 = paramInt4 - 2 + 1; i13 > 0; i13--)
        {
          if ((paramArrayOfInt1[(i7 - 1 + paramInt6)] >= paramArrayOfInt1[(i7 - 1 - 1 + paramInt6)] ? 0 : 1) != 0)
          {
            paramintW.val = -6;
            break;
          }
          if ((paramArrayOfInt1[(i7 - 1 + paramInt6)] != paramArrayOfInt1[(i7 - 1 - 1 + paramInt6)] ? 0 : 1) != 0) {}
          if (((paramArrayOfFloat3[(i7 - 1 + paramInt5)] >= paramArrayOfFloat3[(i7 - 1 - 1 + paramInt5)] ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            paramintW.val = -5;
            break;
          }
          i7 += 1;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSTEIN", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt4 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt9 + paramInt8)] = 1.0F;
      return;
    }
    f2 = Slamch.slamch("Precision");
    n = 1;
    for (i13 = 4 - 1 + 1; i13 > 0; i13--)
    {
      arrayOfInt[(n - 1)] = 1;
      n += 1;
    }
    i1 = 0;
    i2 = i1 + paramInt1;
    i3 = i2 + paramInt1;
    i4 = i3 + paramInt1;
    i5 = i4 + paramInt1;
    i8 = 1;
    i11 = 1;
    for (i13 = paramArrayOfInt1[(paramInt4 - 1 + paramInt6)] - 1 + 1; i13 > 0; i13--)
    {
      if ((i11 != 1 ? 0 : 1) != 0) {
        i = 1;
      } else {
        i = paramArrayOfInt2[(i11 - 1 - 1 + paramInt7)] + 1;
      }
      k = paramArrayOfInt2[(i11 - 1 + paramInt7)];
      j = k - i + 1;
      if ((j != 1 ? 0 : 1) == 0)
      {
        m = i;
        f5 = Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]) + Math.abs(paramArrayOfFloat2[(i - 1 + paramInt3)]);
        f5 = Math.max(f5, Math.abs(paramArrayOfFloat1[(k - 1 + paramInt2)]) + Math.abs(paramArrayOfFloat2[(k - 1 - 1 + paramInt3)]));
        n = i + 1;
        for (i14 = k - 1 - (i + 1) + 1; i14 > 0; i14--)
        {
          f5 = Math.max(f5, Math.abs(paramArrayOfFloat1[(n - 1 + paramInt2)]) + Math.abs(paramArrayOfFloat2[(n - 1 - 1 + paramInt3)]) + Math.abs(paramArrayOfFloat2[(n - 1 + paramInt3)]));
          n += 1;
        }
        f6 = 0.001F * f5;
        f10 = (float)Math.sqrt(0.1F / j);
      }
      i9 = 0;
      i7 = i8;
      for (int i14 = paramInt4 - i8 + 1; i14 > 0; i14--)
      {
        if ((paramArrayOfInt1[(i7 - 1 + paramInt6)] == i11 ? 0 : 1) != 0)
        {
          i8 = i7;
          break;
        }
        i9 += 1;
        f11 = paramArrayOfFloat3[(i7 - 1 + paramInt5)];
        if ((j != 1 ? 0 : 1) != 0)
        {
          paramArrayOfFloat5[(i1 + 1 - 1 + paramInt10)] = 1.0F;
        }
        else
        {
          if ((i9 <= 1 ? 0 : 1) != 0)
          {
            f3 = Math.abs(f2 * f11);
            f7 = 10.0F * f3;
            f9 = f11 - f12;
            if ((f9 >= f7 ? 0 : 1) != 0) {
              f11 = f12 + f7;
            }
          }
          i6 = 0;
          i12 = 0;
          Slarnv.slarnv(2, arrayOfInt, 0, j, paramArrayOfFloat5, i1 + 1 - 1 + paramInt10);
          Scopy.scopy(j, paramArrayOfFloat1, i - 1 + paramInt2, 1, paramArrayOfFloat5, i4 + 1 - 1 + paramInt10, 1);
          Scopy.scopy(j - 1, paramArrayOfFloat2, i - 1 + paramInt3, 1, paramArrayOfFloat5, i2 + 2 - 1 + paramInt10, 1);
          Scopy.scopy(j - 1, paramArrayOfFloat2, i - 1 + paramInt3, 1, paramArrayOfFloat5, i3 + 1 - 1 + paramInt10, 1);
          localfloatW.val = 0.0F;
          Slagtf.slagtf(j, paramArrayOfFloat5, i4 + 1 - 1 + paramInt10, f11, paramArrayOfFloat5, i2 + 2 - 1 + paramInt10, paramArrayOfFloat5, i3 + 1 - 1 + paramInt10, localfloatW.val, paramArrayOfFloat5, i5 + 1 - 1 + paramInt10, paramArrayOfInt3, paramInt11, localintW);
          do
          {
            do
            {
              i6 += 1;
              if ((i6 <= 5 ? 0 : 1) != 0) {
                break;
              }
              f8 = j * f5 * Math.max(f2, Math.abs(paramArrayOfFloat5[(i4 + j - 1 + paramInt10)])) / Sasum.sasum(j, paramArrayOfFloat5, i1 + 1 - 1 + paramInt10, 1);
              Sscal.sscal(j, f8, paramArrayOfFloat5, i1 + 1 - 1 + paramInt10, 1);
              Slagts.slagts(-1, j, paramArrayOfFloat5, i4 + 1 - 1 + paramInt10, paramArrayOfFloat5, i2 + 2 - 1 + paramInt10, paramArrayOfFloat5, i3 + 1 - 1 + paramInt10, paramArrayOfFloat5, i5 + 1 - 1 + paramInt10, paramArrayOfInt3, paramInt11, paramArrayOfFloat5, i1 + 1 - 1 + paramInt10, localfloatW, localintW);
              if ((i9 != 1 ? 0 : 1) == 0)
              {
                if ((Math.abs(f11 - f12) <= f6 ? 0 : 1) != 0) {
                  m = i7;
                }
                if ((m == i7 ? 0 : 1) != 0)
                {
                  n = m;
                  for (i15 = i7 - 1 - m + 1; i15 > 0; i15--)
                  {
                    f1 = -Sdot.sdot(j, paramArrayOfFloat5, i1 + 1 - 1 + paramInt10, 1, paramArrayOfFloat4, i - 1 + (n - 1) * paramInt9 + paramInt8, 1);
                    Saxpy.saxpy(j, f1, paramArrayOfFloat4, i - 1 + (n - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat5, i1 + 1 - 1 + paramInt10, 1);
                    n += 1;
                  }
                }
              }
              i10 = Isamax.isamax(j, paramArrayOfFloat5, i1 + 1 - 1 + paramInt10, 1);
              f4 = Math.abs(paramArrayOfFloat5[(i1 + i10 - 1 + paramInt10)]);
            } while ((f4 >= f10 ? 0 : 1) != 0);
            i12 += 1;
          } while ((i12 >= 2 + 1 ? 0 : 1) != 0);
          break label1612;
          paramintW.val += 1;
          paramArrayOfInt4[(paramintW.val - 1 + paramInt12)] = i7;
          label1612:
          f8 = 1.0F / Snrm2.snrm2(j, paramArrayOfFloat5, i1 + 1 - 1 + paramInt10, 1);
          i10 = Isamax.isamax(j, paramArrayOfFloat5, i1 + 1 - 1 + paramInt10, 1);
          if ((paramArrayOfFloat5[(i1 + i10 - 1 + paramInt10)] >= 0.0F ? 0 : 1) != 0) {
            f8 = -f8;
          }
          Sscal.sscal(j, f8, paramArrayOfFloat5, i1 + 1 - 1 + paramInt10, 1);
        }
        n = 1;
        for (int i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
        {
          paramArrayOfFloat4[(n - 1 + (i7 - 1) * paramInt9 + paramInt8)] = 0.0F;
          n += 1;
        }
        n = 1;
        for (i15 = j - 1 + 1; i15 > 0; i15--)
        {
          paramArrayOfFloat4[(i + n - 1 - 1 + (i7 - 1) * paramInt9 + paramInt8)] = paramArrayOfFloat5[(i1 + n - 1 + paramInt10)];
          n += 1;
        }
        f12 = f11;
        i7 += 1;
      }
      i11 += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sstein.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */