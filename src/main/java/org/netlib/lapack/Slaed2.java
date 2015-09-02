package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Scopy;
import org.netlib.blas.Srot;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaed2
{
  public static void slaed2(intW paramintW1, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, int[] paramArrayOfInt1, int paramInt6, floatW paramfloatW, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, float[] paramArrayOfFloat5, int paramInt9, float[] paramArrayOfFloat6, int paramInt10, int[] paramArrayOfInt2, int paramInt11, int[] paramArrayOfInt3, int paramInt12, int[] paramArrayOfInt4, int paramInt13, int[] paramArrayOfInt5, int paramInt14, intW paramintW2)
  {
    int[] arrayOfInt1 = new int[4];
    int[] arrayOfInt2 = new int[4];
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
    int i8 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    paramintW2.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -2;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW2.val = -6;
    }
    else
    {
      if ((Math.min(1, paramInt1 / 2) <= paramInt2 ? 0 : 1) == 0) {}
      if (((paramInt1 / 2 >= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -3;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLAED2", -paramintW2.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i6 = paramInt1 - paramInt2;
    i5 = paramInt2 + 1;
    if ((paramfloatW.val >= 0.0F ? 0 : 1) != 0) {
      Sscal.sscal(i6, -1.0F, paramArrayOfFloat3, i5 - 1 + paramInt7, 1);
    }
    f4 = 1.0F / (float)Math.sqrt(2.0F);
    Sscal.sscal(paramInt1, f4, paramArrayOfFloat3, paramInt7, 1);
    paramfloatW.val = Math.abs(2.0F * paramfloatW.val);
    j = i5;
    for (int i9 = paramInt1 - i5 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt1[(j - 1 + paramInt6)] += paramInt2;
      j += 1;
    }
    j = 1;
    for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
    {
      paramArrayOfFloat4[(j - 1 + paramInt8)] = paramArrayOfFloat1[(paramArrayOfInt1[(j - 1 + paramInt6)] - 1 + paramInt3)];
      j += 1;
    }
    Slamrg.slamrg(paramInt2, i6, paramArrayOfFloat4, paramInt8, 1, 1, paramArrayOfInt3, paramInt12);
    j = 1;
    for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt2[(j - 1 + paramInt11)] = paramArrayOfInt1[(paramArrayOfInt3[(j - 1 + paramInt12)] - 1 + paramInt6)];
      j += 1;
    }
    k = Isamax.isamax(paramInt1, paramArrayOfFloat3, paramInt7, 1);
    i2 = Isamax.isamax(paramInt1, paramArrayOfFloat1, paramInt3, 1);
    f2 = Slamch.slamch("Epsilon");
    f6 = 8.0F * f2 * Math.max(Math.abs(paramArrayOfFloat1[(i2 - 1 + paramInt3)]), Math.abs(paramArrayOfFloat3[(k - 1 + paramInt7)]));
    if ((paramfloatW.val * Math.abs(paramArrayOfFloat3[(k - 1 + paramInt7)]) > f6 ? 0 : 1) != 0)
    {
      paramintW1.val = 0;
      n = 1;
      i1 = 1;
      for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
      {
        j = paramArrayOfInt2[(i1 - 1 + paramInt11)];
        Scopy.scopy(paramInt1, paramArrayOfFloat2, 1 - 1 + (j - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat6, n - 1 + paramInt10, 1);
        paramArrayOfFloat4[(i1 - 1 + paramInt8)] = paramArrayOfFloat1[(j - 1 + paramInt3)];
        n += paramInt1;
        i1 += 1;
      }
      Slacpy.slacpy("A", paramInt1, paramInt1, paramArrayOfFloat6, paramInt10, paramInt1, paramArrayOfFloat2, paramInt4, paramInt5);
      Scopy.scopy(paramInt1, paramArrayOfFloat4, paramInt8, 1, paramArrayOfFloat1, paramInt3, 1);
    }
    else
    {
      j = 1;
      for (i9 = paramInt2 - 1 + 1; i9 > 0; i9--)
      {
        paramArrayOfInt5[(j - 1 + paramInt14)] = 1;
        j += 1;
      }
      j = i5;
      for (i9 = paramInt1 - i5 + 1; i9 > 0; i9--)
      {
        paramArrayOfInt5[(j - 1 + paramInt14)] = 3;
        j += 1;
      }
      paramintW1.val = 0;
      i4 = paramInt1 + 1;
      i1 = 1;
      for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
      {
        i7 = paramArrayOfInt2[(i1 - 1 + paramInt11)];
        if ((paramfloatW.val * Math.abs(paramArrayOfFloat3[(i7 - 1 + paramInt7)]) > f6 ? 0 : 1) != 0)
        {
          i4 -= 1;
          paramArrayOfInt5[(i7 - 1 + paramInt14)] = 4;
          paramArrayOfInt4[(i4 - 1 + paramInt13)] = i7;
          if ((i1 != paramInt1 ? 0 : 1) != 0) {
            break label1578;
          }
        }
        else
        {
          i8 = i7;
          break;
        }
        i1 += 1;
      }
      for (;;)
      {
        i1 += 1;
        i7 = paramArrayOfInt2[(i1 - 1 + paramInt11)];
        if ((i1 <= paramInt1 ? 0 : 1) != 0) {
          break;
        }
        if ((paramfloatW.val * Math.abs(paramArrayOfFloat3[(i7 - 1 + paramInt7)]) > f6 ? 0 : 1) != 0)
        {
          i4 -= 1;
          paramArrayOfInt5[(i7 - 1 + paramInt14)] = 4;
          paramArrayOfInt4[(i4 - 1 + paramInt13)] = i7;
        }
        else
        {
          f3 = paramArrayOfFloat3[(i8 - 1 + paramInt7)];
          f1 = paramArrayOfFloat3[(i7 - 1 + paramInt7)];
          f5 = Slapy2.slapy2(f1, f3);
          f4 = paramArrayOfFloat1[(i7 - 1 + paramInt3)] - paramArrayOfFloat1[(i8 - 1 + paramInt3)];
          f1 /= f5;
          f3 = -(f3 / f5);
          if ((Math.abs(f4 * f1 * f3) > f6 ? 0 : 1) != 0)
          {
            paramArrayOfFloat3[(i7 - 1 + paramInt7)] = f5;
            paramArrayOfFloat3[(i8 - 1 + paramInt7)] = 0.0F;
            if ((paramArrayOfInt5[(i7 - 1 + paramInt14)] == paramArrayOfInt5[(i8 - 1 + paramInt14)] ? 0 : 1) != 0) {
              paramArrayOfInt5[(i7 - 1 + paramInt14)] = 2;
            }
            paramArrayOfInt5[(i8 - 1 + paramInt14)] = 4;
            Srot.srot(paramInt1, paramArrayOfFloat2, 1 - 1 + (i8 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, 1 - 1 + (i7 - 1) * paramInt5 + paramInt4, 1, f1, f3);
            f4 = paramArrayOfFloat1[(i8 - 1 + paramInt3)] * (float)Math.pow(f1, 2) + paramArrayOfFloat1[(i7 - 1 + paramInt3)] * (float)Math.pow(f3, 2);
            paramArrayOfFloat1[(i7 - 1 + paramInt3)] = (paramArrayOfFloat1[(i8 - 1 + paramInt3)] * (float)Math.pow(f3, 2) + paramArrayOfFloat1[(i7 - 1 + paramInt3)] * (float)Math.pow(f1, 2));
            paramArrayOfFloat1[(i8 - 1 + paramInt3)] = f4;
            i4 -= 1;
            j = 1;
            while ((i4 + j > paramInt1 ? 0 : 1) != 0) {
              if ((paramArrayOfFloat1[(i8 - 1 + paramInt3)] >= paramArrayOfFloat1[(paramArrayOfInt4[(i4 + j - 1 + paramInt13)] - 1 + paramInt3)] ? 0 : 1) != 0)
              {
                paramArrayOfInt4[(i4 + j - 1 - 1 + paramInt13)] = paramArrayOfInt4[(i4 + j - 1 + paramInt13)];
                paramArrayOfInt4[(i4 + j - 1 + paramInt13)] = i8;
                j += 1;
              }
              else
              {
                paramArrayOfInt4[(i4 + j - 1 - 1 + paramInt13)] = i8;
                break label1497;
              }
            }
            paramArrayOfInt4[(i4 + j - 1 - 1 + paramInt13)] = i8;
            label1497:
            i8 = i7;
          }
          else
          {
            paramintW1.val += 1;
            paramArrayOfFloat4[(paramintW1.val - 1 + paramInt8)] = paramArrayOfFloat1[(i8 - 1 + paramInt3)];
            paramArrayOfFloat5[(paramintW1.val - 1 + paramInt9)] = paramArrayOfFloat3[(i8 - 1 + paramInt7)];
            paramArrayOfInt4[(paramintW1.val - 1 + paramInt13)] = i8;
            i8 = i7;
          }
        }
      }
      label1578:
      paramintW1.val += 1;
      paramArrayOfFloat4[(paramintW1.val - 1 + paramInt8)] = paramArrayOfFloat1[(i8 - 1 + paramInt3)];
      paramArrayOfFloat5[(paramintW1.val - 1 + paramInt9)] = paramArrayOfFloat3[(i8 - 1 + paramInt7)];
      paramArrayOfInt4[(paramintW1.val - 1 + paramInt13)] = i8;
      i1 = 1;
      for (i9 = 4 - 1 + 1; i9 > 0; i9--)
      {
        arrayOfInt1[(i1 - 1)] = 0;
        i1 += 1;
      }
      i1 = 1;
      for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
      {
        i = paramArrayOfInt5[(i1 - 1 + paramInt14)];
        arrayOfInt1[(i - 1)] += 1;
        i1 += 1;
      }
      arrayOfInt2[(1 - 1)] = 1;
      arrayOfInt2[(2 - 1)] = (1 + arrayOfInt1[(1 - 1)]);
      arrayOfInt2[(3 - 1)] = (arrayOfInt2[(2 - 1)] + arrayOfInt1[(2 - 1)]);
      arrayOfInt2[(4 - 1)] = (arrayOfInt2[(3 - 1)] + arrayOfInt1[(3 - 1)]);
      paramintW1.val = (paramInt1 - arrayOfInt1[(4 - 1)]);
      i1 = 1;
      for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
      {
        i3 = paramArrayOfInt4[(i1 - 1 + paramInt13)];
        i = paramArrayOfInt5[(i3 - 1 + paramInt14)];
        paramArrayOfInt2[(arrayOfInt2[(i - 1)] - 1 + paramInt11)] = i3;
        paramArrayOfInt3[(arrayOfInt2[(i - 1)] - 1 + paramInt12)] = i1;
        arrayOfInt2[(i - 1)] += 1;
        i1 += 1;
      }
      j = 1;
      m = 1;
      n = 1 + (arrayOfInt1[(1 - 1)] + arrayOfInt1[(2 - 1)]) * paramInt2;
      i1 = 1;
      for (i9 = arrayOfInt1[(1 - 1)] - 1 + 1; i9 > 0; i9--)
      {
        i3 = paramArrayOfInt2[(j - 1 + paramInt11)];
        Scopy.scopy(paramInt2, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat6, m - 1 + paramInt10, 1);
        paramArrayOfFloat3[(j - 1 + paramInt7)] = paramArrayOfFloat1[(i3 - 1 + paramInt3)];
        j += 1;
        m += paramInt2;
        i1 += 1;
      }
      i1 = 1;
      for (i9 = arrayOfInt1[(2 - 1)] - 1 + 1; i9 > 0; i9--)
      {
        i3 = paramArrayOfInt2[(j - 1 + paramInt11)];
        Scopy.scopy(paramInt2, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat6, m - 1 + paramInt10, 1);
        Scopy.scopy(i6, paramArrayOfFloat2, paramInt2 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat6, n - 1 + paramInt10, 1);
        paramArrayOfFloat3[(j - 1 + paramInt7)] = paramArrayOfFloat1[(i3 - 1 + paramInt3)];
        j += 1;
        m += paramInt2;
        n += i6;
        i1 += 1;
      }
      i1 = 1;
      for (i9 = arrayOfInt1[(3 - 1)] - 1 + 1; i9 > 0; i9--)
      {
        i3 = paramArrayOfInt2[(j - 1 + paramInt11)];
        Scopy.scopy(i6, paramArrayOfFloat2, paramInt2 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat6, n - 1 + paramInt10, 1);
        paramArrayOfFloat3[(j - 1 + paramInt7)] = paramArrayOfFloat1[(i3 - 1 + paramInt3)];
        j += 1;
        n += i6;
        i1 += 1;
      }
      m = n;
      i1 = 1;
      for (i9 = arrayOfInt1[(4 - 1)] - 1 + 1; i9 > 0; i9--)
      {
        i3 = paramArrayOfInt2[(j - 1 + paramInt11)];
        Scopy.scopy(paramInt1, paramArrayOfFloat2, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat6, n - 1 + paramInt10, 1);
        n += paramInt1;
        paramArrayOfFloat3[(j - 1 + paramInt7)] = paramArrayOfFloat1[(i3 - 1 + paramInt3)];
        j += 1;
        i1 += 1;
      }
      Slacpy.slacpy("A", paramInt1, arrayOfInt1[(4 - 1)], paramArrayOfFloat6, m - 1 + paramInt10, paramInt1, paramArrayOfFloat2, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt5 + paramInt4, paramInt5);
      Scopy.scopy(paramInt1 - paramintW1.val, paramArrayOfFloat3, paramintW1.val + 1 - 1 + paramInt7, 1, paramArrayOfFloat1, paramintW1.val + 1 - 1 + paramInt3, 1);
      i1 = 1;
      for (i9 = 4 - 1 + 1; i9 > 0; i9--)
      {
        paramArrayOfInt5[(i1 - 1 + paramInt14)] = arrayOfInt1[(i1 - 1)];
        i1 += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaed2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */