package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Drot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaed8
{
  public static void dlaed8(int paramInt1, intW paramintW1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, int[] paramArrayOfInt1, int paramInt7, doubleW paramdoubleW, int paramInt8, double[] paramArrayOfDouble3, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, int paramInt12, double[] paramArrayOfDouble6, int paramInt13, int[] paramArrayOfInt2, int paramInt14, intW paramintW2, int[] paramArrayOfInt3, int paramInt15, double[] paramArrayOfDouble7, int paramInt16, int[] paramArrayOfInt4, int paramInt17, int[] paramArrayOfInt5, int paramInt18, intW paramintW3)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
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
      Xerbla.xerbla("DLAED8", -paramintW3.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    i3 = paramInt8;
    i5 = paramInt2 - i3;
    i4 = i3 + 1;
    if ((paramdoubleW.val >= 0.0D ? 0 : 1) != 0) {
      Dscal.dscal(i5, -1.0D, paramArrayOfDouble3, i4 - 1 + paramInt9, 1);
    }
    d4 = 1.0D / Math.sqrt(2.0D);
    k = 1;
    for (int i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfInt5[(k - 1 + paramInt18)] = k;
      k += 1;
    }
    Dscal.dscal(paramInt2, d4, paramArrayOfDouble3, paramInt9, 1);
    paramdoubleW.val = Math.abs(2.0D * paramdoubleW.val);
    i = paramInt8 + 1;
    for (i6 = paramInt2 - (paramInt8 + 1) + 1; i6 > 0; i6--)
    {
      paramArrayOfInt1[(i - 1 + paramInt7)] += paramInt8;
      i += 1;
    }
    i = 1;
    for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfDouble4[(i - 1 + paramInt10)] = paramArrayOfDouble1[(paramArrayOfInt1[(i - 1 + paramInt7)] - 1 + paramInt4)];
      paramArrayOfDouble6[(i - 1 + paramInt13)] = paramArrayOfDouble3[(paramArrayOfInt1[(i - 1 + paramInt7)] - 1 + paramInt9)];
      i += 1;
    }
    i = 1;
    k = paramInt8 + 1;
    Dlamrg.dlamrg(i3, i5, paramArrayOfDouble4, paramInt10, 1, 1, paramArrayOfInt5, paramInt18);
    i = 1;
    for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfDouble1[(i - 1 + paramInt4)] = paramArrayOfDouble4[(paramArrayOfInt5[(i - 1 + paramInt18)] - 1 + paramInt10)];
      paramArrayOfDouble3[(i - 1 + paramInt9)] = paramArrayOfDouble6[(paramArrayOfInt5[(i - 1 + paramInt18)] - 1 + paramInt13)];
      i += 1;
    }
    j = Idamax.idamax(paramInt2, paramArrayOfDouble3, paramInt9, 1);
    n = Idamax.idamax(paramInt2, paramArrayOfDouble1, paramInt4, 1);
    d2 = Dlamch.dlamch("Epsilon");
    d6 = 8.0D * d2 * Math.abs(paramArrayOfDouble1[(n - 1 + paramInt4)]);
    if ((paramdoubleW.val * Math.abs(paramArrayOfDouble3[(j - 1 + paramInt9)]) > d6 ? 0 : 1) != 0)
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
          Dcopy.dcopy(paramInt3, paramArrayOfDouble2, 1 - 1 + (paramArrayOfInt2[(k - 1 + paramInt14)] - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble5, 1 - 1 + (k - 1) * paramInt12 + paramInt11, 1);
          k += 1;
        }
        Dlacpy.dlacpy("A", paramInt3, paramInt2, paramArrayOfDouble5, 1 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
      }
      return;
    }
    paramintW1.val = 0;
    paramintW2.val = 0;
    i2 = paramInt2 + 1;
    k = 1;
    for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
    {
      if ((paramdoubleW.val * Math.abs(paramArrayOfDouble3[(k - 1 + paramInt9)]) > d6 ? 0 : 1) != 0)
      {
        i2 -= 1;
        paramArrayOfInt4[(i2 - 1 + paramInt17)] = k;
        if ((k != paramInt2 ? 0 : 1) != 0) {
          break label1926;
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
      if ((paramdoubleW.val * Math.abs(paramArrayOfDouble3[(k - 1 + paramInt9)]) > d6 ? 0 : 1) != 0)
      {
        i2 -= 1;
        paramArrayOfInt4[(i2 - 1 + paramInt17)] = k;
      }
      else
      {
        d3 = paramArrayOfDouble3[(m - 1 + paramInt9)];
        d1 = paramArrayOfDouble3[(k - 1 + paramInt9)];
        d5 = Dlapy2.dlapy2(d1, d3);
        d4 = paramArrayOfDouble1[(k - 1 + paramInt4)] - paramArrayOfDouble1[(m - 1 + paramInt4)];
        d1 /= d5;
        d3 = -(d3 / d5);
        if ((Math.abs(d4 * d1 * d3) > d6 ? 0 : 1) != 0)
        {
          paramArrayOfDouble3[(k - 1 + paramInt9)] = d5;
          paramArrayOfDouble3[(m - 1 + paramInt9)] = 0.0D;
          paramintW2.val += 1;
          paramArrayOfInt3[(1 - 1 + (paramintW2.val - 1) * 2 + paramInt15)] = paramArrayOfInt1[(paramArrayOfInt5[(m - 1 + paramInt18)] - 1 + paramInt7)];
          paramArrayOfInt3[(2 - 1 + (paramintW2.val - 1) * 2 + paramInt15)] = paramArrayOfInt1[(paramArrayOfInt5[(k - 1 + paramInt18)] - 1 + paramInt7)];
          paramArrayOfDouble7[(1 - 1 + (paramintW2.val - 1) * 2 + paramInt16)] = d1;
          paramArrayOfDouble7[(2 - 1 + (paramintW2.val - 1) * 2 + paramInt16)] = d3;
          if ((paramInt1 != 1 ? 0 : 1) != 0) {
            Drot.drot(paramInt3, paramArrayOfDouble2, 1 - 1 + (paramArrayOfInt1[(paramArrayOfInt5[(m - 1 + paramInt18)] - 1 + paramInt7)] - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble2, 1 - 1 + (paramArrayOfInt1[(paramArrayOfInt5[(k - 1 + paramInt18)] - 1 + paramInt7)] - 1) * paramInt6 + paramInt5, 1, d1, d3);
          }
          d4 = paramArrayOfDouble1[(m - 1 + paramInt4)] * d1 * d1 + paramArrayOfDouble1[(k - 1 + paramInt4)] * d3 * d3;
          paramArrayOfDouble1[(k - 1 + paramInt4)] = (paramArrayOfDouble1[(m - 1 + paramInt4)] * d3 * d3 + paramArrayOfDouble1[(k - 1 + paramInt4)] * d1 * d1);
          paramArrayOfDouble1[(m - 1 + paramInt4)] = d4;
          i2 -= 1;
          i = 1;
          while ((i2 + i > paramInt2 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(m - 1 + paramInt4)] >= paramArrayOfDouble1[(paramArrayOfInt4[(i2 + i - 1 + paramInt17)] - 1 + paramInt4)] ? 0 : 1) != 0)
            {
              paramArrayOfInt4[(i2 + i - 1 - 1 + paramInt17)] = paramArrayOfInt4[(i2 + i - 1 + paramInt17)];
              paramArrayOfInt4[(i2 + i - 1 + paramInt17)] = m;
              i += 1;
            }
            else
            {
              paramArrayOfInt4[(i2 + i - 1 - 1 + paramInt17)] = m;
              break label1776;
            }
          }
          paramArrayOfInt4[(i2 + i - 1 - 1 + paramInt17)] = m;
          label1776:
          m = k;
        }
        else
        {
          paramintW1.val += 1;
          paramArrayOfDouble6[(paramintW1.val - 1 + paramInt13)] = paramArrayOfDouble3[(m - 1 + paramInt9)];
          paramArrayOfDouble4[(paramintW1.val - 1 + paramInt10)] = paramArrayOfDouble1[(m - 1 + paramInt4)];
          paramArrayOfInt4[(paramintW1.val - 1 + paramInt17)] = m;
          m = k;
        }
      }
    }
    paramintW1.val += 1;
    paramArrayOfDouble6[(paramintW1.val - 1 + paramInt13)] = paramArrayOfDouble3[(m - 1 + paramInt9)];
    paramArrayOfDouble4[(paramintW1.val - 1 + paramInt10)] = paramArrayOfDouble1[(m - 1 + paramInt4)];
    paramArrayOfInt4[(paramintW1.val - 1 + paramInt17)] = m;
    label1926:
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      k = 1;
      for (i6 = paramInt2 - 1 + 1; i6 > 0; i6--)
      {
        i1 = paramArrayOfInt4[(k - 1 + paramInt17)];
        paramArrayOfDouble4[(k - 1 + paramInt10)] = paramArrayOfDouble1[(i1 - 1 + paramInt4)];
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
        paramArrayOfDouble4[(k - 1 + paramInt10)] = paramArrayOfDouble1[(i1 - 1 + paramInt4)];
        paramArrayOfInt2[(k - 1 + paramInt14)] = paramArrayOfInt1[(paramArrayOfInt5[(i1 - 1 + paramInt18)] - 1 + paramInt7)];
        Dcopy.dcopy(paramInt3, paramArrayOfDouble2, 1 - 1 + (paramArrayOfInt2[(k - 1 + paramInt14)] - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble5, 1 - 1 + (k - 1) * paramInt12 + paramInt11, 1);
        k += 1;
      }
    }
    if ((paramintW1.val >= paramInt2 ? 0 : 1) != 0) {
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        Dcopy.dcopy(paramInt2 - paramintW1.val, paramArrayOfDouble4, paramintW1.val + 1 - 1 + paramInt10, 1, paramArrayOfDouble1, paramintW1.val + 1 - 1 + paramInt4, 1);
      }
      else
      {
        Dcopy.dcopy(paramInt2 - paramintW1.val, paramArrayOfDouble4, paramintW1.val + 1 - 1 + paramInt10, 1, paramArrayOfDouble1, paramintW1.val + 1 - 1 + paramInt4, 1);
        Dlacpy.dlacpy("A", paramInt3, paramInt2 - paramintW1.val, paramArrayOfDouble5, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfDouble2, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt6 + paramInt5, paramInt6);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaed8.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */