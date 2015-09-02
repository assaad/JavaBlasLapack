package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Scopy;
import org.netlib.blas.Srot;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaed8
{
  public static void slaed8(int paramInt1, intW paramintW1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, int[] paramArrayOfInt1, int paramInt7, floatW paramfloatW, int paramInt8, float[] paramArrayOfFloat3, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, float[] paramArrayOfFloat5, int paramInt11, int paramInt12, float[] paramArrayOfFloat6, int paramInt13, int[] paramArrayOfInt2, int paramInt14, intW paramintW2, int[] paramArrayOfInt3, int paramInt15, float[] paramArrayOfFloat7, int paramInt16, int[] paramArrayOfInt4, int paramInt17, int[] paramArrayOfInt5, int paramInt18, intW paramintW3)
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    paramintW3.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -3;
    }
    else
    {
      if ((paramInt1 != 1 ? 0 : 1) != 0) {}
      if (((paramInt3 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW3.val = -4;
      }
      else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
      {
        paramintW3.val = -7;
      }
      else
      {
        if ((paramInt8 >= Math.min(1, paramInt2) ? 0 : 1) == 0) {}
        if (((paramInt8 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW3.val = -10;
        } else if ((paramInt12 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
          paramintW3.val = -14;
        }
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLAED8", -paramintW3.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    i3 = paramInt8;
    i5 = paramInt2 - i3;
    i4 = i3 + 1;
    if ((paramfloatW.val >= 0.0F ? 0 : 1) != 0) {
      Sscal.sscal(i5, -1.0F, paramArrayOfFloat3, i4 - 1 + paramInt9, 1);
    }
    f4 = 1.0F / (float)Math.sqrt(2.0F);
    k = 1;
    for (int i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfInt5[(k - 1 + paramInt18)] = k;
      k += 1;
    }
    Sscal.sscal(paramInt2, f4, paramArrayOfFloat3, paramInt9, 1);
    paramfloatW.val = Math.abs(2.0F * paramfloatW.val);
    i = paramInt8 + 1;
    for (i6 = paramInt2 - (paramInt8 + 1) + 1; i6 > 0; i6--)
    {
      paramArrayOfInt1[(i - 1 + paramInt7)] += paramInt8;
      i += 1;
    }
    i = 1;
    for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfFloat4[(i - 1 + paramInt10)] = paramArrayOfFloat1[(paramArrayOfInt1[(i - 1 + paramInt7)] - 1 + paramInt4)];
      paramArrayOfFloat6[(i - 1 + paramInt13)] = paramArrayOfFloat3[(paramArrayOfInt1[(i - 1 + paramInt7)] - 1 + paramInt9)];
      i += 1;
    }
    i = 1;
    k = paramInt8 + 1;
    Slamrg.slamrg(i3, i5, paramArrayOfFloat4, paramInt10, 1, 1, paramArrayOfInt5, paramInt18);
    i = 1;
    for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfFloat1[(i - 1 + paramInt4)] = paramArrayOfFloat4[(paramArrayOfInt5[(i - 1 + paramInt18)] - 1 + paramInt10)];
      paramArrayOfFloat3[(i - 1 + paramInt9)] = paramArrayOfFloat6[(paramArrayOfInt5[(i - 1 + paramInt18)] - 1 + paramInt13)];
      i += 1;
    }
    j = Isamax.isamax(paramInt2, paramArrayOfFloat3, paramInt9, 1);
    n = Isamax.isamax(paramInt2, paramArrayOfFloat1, paramInt4, 1);
    f2 = Slamch.slamch("Epsilon");
    f6 = 8.0F * f2 * Math.abs(paramArrayOfFloat1[(n - 1 + paramInt4)]);
    if ((paramfloatW.val * Math.abs(paramArrayOfFloat3[(j - 1 + paramInt9)]) > f6 ? 0 : 1) != 0)
    {
      paramintW1.val = 0;
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        k = 1;
        for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
        {
          paramArrayOfInt2[(k - 1 + paramInt14)] = paramArrayOfInt1[(paramArrayOfInt5[(k - 1 + paramInt18)] - 1 + paramInt7)];
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
        {
          paramArrayOfInt2[(k - 1 + paramInt14)] = paramArrayOfInt1[(paramArrayOfInt5[(k - 1 + paramInt18)] - 1 + paramInt7)];
          Scopy.scopy(paramInt3, paramArrayOfFloat2, 1 - 1 + (paramArrayOfInt2[(k - 1 + paramInt14)] - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat5, 1 - 1 + (k - 1) * paramInt12 + paramInt11, 1);
          k += 1;
        }
        Slacpy.slacpy("A", paramInt3, paramInt2, paramArrayOfFloat5, 1 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
      }
      return;
    }
    paramintW1.val = 0;
    paramintW2.val = 0;
    i2 = paramInt2 + 1;
    k = 1;
    for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
    {
      if ((paramfloatW.val * Math.abs(paramArrayOfFloat3[(k - 1 + paramInt9)]) > f6 ? 0 : 1) != 0)
      {
        i2 -= 1;
        paramArrayOfInt4[(i2 - 1 + paramInt17)] = k;
        if ((k != paramInt2 ? 0 : 1) != 0) {
          break label1922;
        }
      }
      else
      {
        m = k;
        break;
      }
      k += 1;
    }
    for (;;)
    {
      k += 1;
      if ((k <= paramInt2 ? 0 : 1) != 0) {
        break;
      }
      if ((paramfloatW.val * Math.abs(paramArrayOfFloat3[(k - 1 + paramInt9)]) > f6 ? 0 : 1) != 0)
      {
        i2 -= 1;
        paramArrayOfInt4[(i2 - 1 + paramInt17)] = k;
      }
      else
      {
        f3 = paramArrayOfFloat3[(m - 1 + paramInt9)];
        f1 = paramArrayOfFloat3[(k - 1 + paramInt9)];
        f5 = Slapy2.slapy2(f1, f3);
        f4 = paramArrayOfFloat1[(k - 1 + paramInt4)] - paramArrayOfFloat1[(m - 1 + paramInt4)];
        f1 /= f5;
        f3 = -(f3 / f5);
        if ((Math.abs(f4 * f1 * f3) > f6 ? 0 : 1) != 0)
        {
          paramArrayOfFloat3[(k - 1 + paramInt9)] = f5;
          paramArrayOfFloat3[(m - 1 + paramInt9)] = 0.0F;
          paramintW2.val += 1;
          paramArrayOfInt3[(1 - 1 + (paramintW2.val - 1) * 2 + paramInt15)] = paramArrayOfInt1[(paramArrayOfInt5[(m - 1 + paramInt18)] - 1 + paramInt7)];
          paramArrayOfInt3[(2 - 1 + (paramintW2.val - 1) * 2 + paramInt15)] = paramArrayOfInt1[(paramArrayOfInt5[(k - 1 + paramInt18)] - 1 + paramInt7)];
          paramArrayOfFloat7[(1 - 1 + (paramintW2.val - 1) * 2 + paramInt16)] = f1;
          paramArrayOfFloat7[(2 - 1 + (paramintW2.val - 1) * 2 + paramInt16)] = f3;
          if ((paramInt1 != 1 ? 0 : 1) != 0) {
            Srot.srot(paramInt3, paramArrayOfFloat2, 1 - 1 + (paramArrayOfInt1[(paramArrayOfInt5[(m - 1 + paramInt18)] - 1 + paramInt7)] - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat2, 1 - 1 + (paramArrayOfInt1[(paramArrayOfInt5[(k - 1 + paramInt18)] - 1 + paramInt7)] - 1) * paramInt6 + paramInt5, 1, f1, f3);
          }
          f4 = paramArrayOfFloat1[(m - 1 + paramInt4)] * f1 * f1 + paramArrayOfFloat1[(k - 1 + paramInt4)] * f3 * f3;
          paramArrayOfFloat1[(k - 1 + paramInt4)] = (paramArrayOfFloat1[(m - 1 + paramInt4)] * f3 * f3 + paramArrayOfFloat1[(k - 1 + paramInt4)] * f1 * f1);
          paramArrayOfFloat1[(m - 1 + paramInt4)] = f4;
          i2 -= 1;
          i = 1;
          while ((i2 + i > paramInt2 ? 0 : 1) != 0) {
            if ((paramArrayOfFloat1[(m - 1 + paramInt4)] >= paramArrayOfFloat1[(paramArrayOfInt4[(i2 + i - 1 + paramInt17)] - 1 + paramInt4)] ? 0 : 1) != 0)
            {
              paramArrayOfInt4[(i2 + i - 1 - 1 + paramInt17)] = paramArrayOfInt4[(i2 + i - 1 + paramInt17)];
              paramArrayOfInt4[(i2 + i - 1 + paramInt17)] = m;
              i += 1;
            }
            else
            {
              paramArrayOfInt4[(i2 + i - 1 - 1 + paramInt17)] = m;
              break label1772;
            }
          }
          paramArrayOfInt4[(i2 + i - 1 - 1 + paramInt17)] = m;
          label1772:
          m = k;
        }
        else
        {
          paramintW1.val += 1;
          paramArrayOfFloat6[(paramintW1.val - 1 + paramInt13)] = paramArrayOfFloat3[(m - 1 + paramInt9)];
          paramArrayOfFloat4[(paramintW1.val - 1 + paramInt10)] = paramArrayOfFloat1[(m - 1 + paramInt4)];
          paramArrayOfInt4[(paramintW1.val - 1 + paramInt17)] = m;
          m = k;
        }
      }
    }
    paramintW1.val += 1;
    paramArrayOfFloat6[(paramintW1.val - 1 + paramInt13)] = paramArrayOfFloat3[(m - 1 + paramInt9)];
    paramArrayOfFloat4[(paramintW1.val - 1 + paramInt10)] = paramArrayOfFloat1[(m - 1 + paramInt4)];
    paramArrayOfInt4[(paramintW1.val - 1 + paramInt17)] = m;
    label1922:
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      k = 1;
      for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
      {
        i1 = paramArrayOfInt4[(k - 1 + paramInt17)];
        paramArrayOfFloat4[(k - 1 + paramInt10)] = paramArrayOfFloat1[(i1 - 1 + paramInt4)];
        paramArrayOfInt2[(k - 1 + paramInt14)] = paramArrayOfInt1[(paramArrayOfInt5[(i1 - 1 + paramInt18)] - 1 + paramInt7)];
        k += 1;
      }
    }
    else
    {
      k = 1;
      for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
      {
        i1 = paramArrayOfInt4[(k - 1 + paramInt17)];
        paramArrayOfFloat4[(k - 1 + paramInt10)] = paramArrayOfFloat1[(i1 - 1 + paramInt4)];
        paramArrayOfInt2[(k - 1 + paramInt14)] = paramArrayOfInt1[(paramArrayOfInt5[(i1 - 1 + paramInt18)] - 1 + paramInt7)];
        Scopy.scopy(paramInt3, paramArrayOfFloat2, 1 - 1 + (paramArrayOfInt2[(k - 1 + paramInt14)] - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat5, 1 - 1 + (k - 1) * paramInt12 + paramInt11, 1);
        k += 1;
      }
    }
    if ((paramintW1.val >= paramInt2 ? 0 : 1) != 0) {
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        Scopy.scopy(paramInt2 - paramintW1.val, paramArrayOfFloat4, paramintW1.val + 1 - 1 + paramInt10, 1, paramArrayOfFloat1, paramintW1.val + 1 - 1 + paramInt4, 1);
      }
      else
      {
        Scopy.scopy(paramInt2 - paramintW1.val, paramArrayOfFloat4, paramintW1.val + 1 - 1 + paramInt10, 1, paramArrayOfFloat1, paramintW1.val + 1 - 1 + paramInt4, 1);
        Slacpy.slacpy("A", paramInt3, paramInt2 - paramintW1.val, paramArrayOfFloat5, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfFloat2, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt6 + paramInt5, paramInt6);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaed8.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */