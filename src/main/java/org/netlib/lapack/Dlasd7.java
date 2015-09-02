package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Drot;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasd7
{
  public static void dlasd7(int paramInt1, int paramInt2, int paramInt3, int paramInt4, intW paramintW1, double[] paramArrayOfDouble1, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, double[] paramArrayOfDouble5, int paramInt9, double[] paramArrayOfDouble6, int paramInt10, double[] paramArrayOfDouble7, int paramInt11, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble8, int paramInt12, int[] paramArrayOfInt1, int paramInt13, int[] paramArrayOfInt2, int paramInt14, int[] paramArrayOfInt3, int paramInt15, int[] paramArrayOfInt4, int paramInt16, intW paramintW2, int[] paramArrayOfInt5, int paramInt17, int paramInt18, double[] paramArrayOfDouble9, int paramInt19, int paramInt20, doubleW paramdoubleW1, doubleW paramdoubleW2, intW paramintW3)
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
    paramintW3.val = 0;
    i5 = paramInt2 + paramInt3 + 1;
    i4 = i5 + paramInt4;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((paramInt3 >= 1 ? 0 : 1) != 0)
    {
      paramintW3.val = -3;
    }
    else
    {
      if ((paramInt4 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt4 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW3.val = -4;
      } else if ((paramInt18 >= i5 ? 0 : 1) != 0) {
        paramintW3.val = -22;
      } else if ((paramInt20 >= i5 ? 0 : 1) != 0) {
        paramintW3.val = -24;
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLASD7", -paramintW3.val);
      return;
    }
    i6 = paramInt2 + 1;
    i7 = paramInt2 + 2;
    if ((paramInt1 != 1 ? 0 : 1) != 0) {
      paramintW2.val = 0;
    }
    d5 = paramDouble1 * paramArrayOfDouble6[(i6 - 1 + paramInt10)];
    paramArrayOfDouble6[(i6 - 1 + paramInt10)] = 0.0D;
    d3 = paramArrayOfDouble4[(i6 - 1 + paramInt8)];
    i = paramInt2;
    for (int i8 = (1 - paramInt2 + -1) / -1; i8 > 0; i8--)
    {
      paramArrayOfDouble2[(i + 1 - 1 + paramInt6)] = (paramDouble1 * paramArrayOfDouble6[(i - 1 + paramInt10)]);
      paramArrayOfDouble6[(i - 1 + paramInt10)] = 0.0D;
      paramArrayOfDouble4[(i + 1 - 1 + paramInt8)] = paramArrayOfDouble4[(i - 1 + paramInt8)];
      paramArrayOfDouble1[(i + 1 - 1 + paramInt5)] = paramArrayOfDouble1[(i - 1 + paramInt5)];
      paramArrayOfInt3[(i + 1 - 1 + paramInt15)] = (paramArrayOfInt3[(i - 1 + paramInt15)] + 1);
      i += -1;
    }
    paramArrayOfDouble4[(1 - 1 + paramInt8)] = d3;
    i = i7;
    for (i8 = i4 - i7 + 1; i8 > 0; i8--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt6)] = (paramDouble2 * paramArrayOfDouble4[(i - 1 + paramInt8)]);
      paramArrayOfDouble4[(i - 1 + paramInt8)] = 0.0D;
      i += 1;
    }
    i = i7;
    for (i8 = i5 - i7 + 1; i8 > 0; i8--)
    {
      paramArrayOfInt3[(i - 1 + paramInt15)] += i6;
      i += 1;
    }
    i = 2;
    for (i8 = i5 - 2 + 1; i8 > 0; i8--)
    {
      paramArrayOfDouble8[(i - 1 + paramInt12)] = paramArrayOfDouble1[(paramArrayOfInt3[(i - 1 + paramInt15)] - 1 + paramInt5)];
      paramArrayOfDouble3[(i - 1 + paramInt7)] = paramArrayOfDouble2[(paramArrayOfInt3[(i - 1 + paramInt15)] - 1 + paramInt6)];
      paramArrayOfDouble5[(i - 1 + paramInt9)] = paramArrayOfDouble4[(paramArrayOfInt3[(i - 1 + paramInt15)] - 1 + paramInt8)];
      paramArrayOfDouble7[(i - 1 + paramInt11)] = paramArrayOfDouble6[(paramArrayOfInt3[(i - 1 + paramInt15)] - 1 + paramInt10)];
      i += 1;
    }
    Dlamrg.dlamrg(paramInt2, paramInt3, paramArrayOfDouble8, 2 - 1 + paramInt12, 1, 1, paramArrayOfInt1, 2 - 1 + paramInt13);
    i = 2;
    for (i8 = i5 - 2 + 1; i8 > 0; i8--)
    {
      j = 1 + paramArrayOfInt1[(i - 1 + paramInt13)];
      paramArrayOfDouble1[(i - 1 + paramInt5)] = paramArrayOfDouble8[(j - 1 + paramInt12)];
      paramArrayOfDouble2[(i - 1 + paramInt6)] = paramArrayOfDouble3[(j - 1 + paramInt7)];
      paramArrayOfDouble4[(i - 1 + paramInt8)] = paramArrayOfDouble5[(j - 1 + paramInt9)];
      paramArrayOfDouble6[(i - 1 + paramInt10)] = paramArrayOfDouble7[(j - 1 + paramInt11)];
      i += 1;
    }
    d1 = Dlamch.dlamch("Epsilon");
    d4 = Math.max(Math.abs(paramDouble1), Math.abs(paramDouble2));
    d4 = 8.0D * 8.0D * d1 * Math.max(Math.abs(paramArrayOfDouble1[(i5 - 1 + paramInt5)]), d4);
    paramintW1.val = 1;
    i3 = i5 + 1;
    n = 2;
    for (i8 = i5 - 2 + 1; i8 > 0; i8--)
    {
      if ((Math.abs(paramArrayOfDouble2[(n - 1 + paramInt6)]) > d4 ? 0 : 1) != 0)
      {
        i3 -= 1;
        paramArrayOfInt2[(i3 - 1 + paramInt14)] = n;
        if ((n != i5 ? 0 : 1) != 0) {
          break label1721;
        }
      }
      else
      {
        i2 = n;
        break;
      }
      n += 1;
    }
    n = i2;
    for (;;)
    {
      n += 1;
      if ((n <= i5 ? 0 : 1) != 0) {
        break;
      }
      if ((Math.abs(paramArrayOfDouble2[(n - 1 + paramInt6)]) > d4 ? 0 : 1) != 0)
      {
        i3 -= 1;
        paramArrayOfInt2[(i3 - 1 + paramInt14)] = n;
      }
      else if ((Math.abs(paramArrayOfDouble1[(n - 1 + paramInt5)] - paramArrayOfDouble1[(i2 - 1 + paramInt5)]) > d4 ? 0 : 1) != 0)
      {
        paramdoubleW2.val = paramArrayOfDouble2[(i2 - 1 + paramInt6)];
        paramdoubleW1.val = paramArrayOfDouble2[(n - 1 + paramInt6)];
        d3 = Dlapy2.dlapy2(paramdoubleW1.val, paramdoubleW2.val);
        paramArrayOfDouble2[(n - 1 + paramInt6)] = d3;
        paramArrayOfDouble2[(i2 - 1 + paramInt6)] = 0.0D;
        paramdoubleW1.val /= d3;
        paramdoubleW2.val = (-(paramdoubleW2.val / d3));
        if ((paramInt1 != 1 ? 0 : 1) != 0)
        {
          paramintW2.val += 1;
          m = paramArrayOfInt3[(paramArrayOfInt1[(i2 - 1 + paramInt13)] + 1 - 1 + paramInt15)];
          k = paramArrayOfInt3[(paramArrayOfInt1[(n - 1 + paramInt13)] + 1 - 1 + paramInt15)];
          if ((m > i6 ? 0 : 1) != 0) {
            m -= 1;
          }
          if ((k > i6 ? 0 : 1) != 0) {
            k -= 1;
          }
          paramArrayOfInt5[(paramintW2.val - 1 + (2 - 1) * paramInt18 + paramInt17)] = m;
          paramArrayOfInt5[(paramintW2.val - 1 + (1 - 1) * paramInt18 + paramInt17)] = k;
          paramArrayOfDouble9[(paramintW2.val - 1 + (2 - 1) * paramInt20 + paramInt19)] = paramdoubleW1.val;
          paramArrayOfDouble9[(paramintW2.val - 1 + (1 - 1) * paramInt20 + paramInt19)] = paramdoubleW2.val;
        }
        Drot.drot(1, paramArrayOfDouble4, i2 - 1 + paramInt8, 1, paramArrayOfDouble4, n - 1 + paramInt8, 1, paramdoubleW1.val, paramdoubleW2.val);
        Drot.drot(1, paramArrayOfDouble6, i2 - 1 + paramInt10, 1, paramArrayOfDouble6, n - 1 + paramInt10, 1, paramdoubleW1.val, paramdoubleW2.val);
        i3 -= 1;
        paramArrayOfInt2[(i3 - 1 + paramInt14)] = i2;
        i2 = n;
      }
      else
      {
        paramintW1.val += 1;
        paramArrayOfDouble3[(paramintW1.val - 1 + paramInt7)] = paramArrayOfDouble2[(i2 - 1 + paramInt6)];
        paramArrayOfDouble8[(paramintW1.val - 1 + paramInt12)] = paramArrayOfDouble1[(i2 - 1 + paramInt5)];
        paramArrayOfInt2[(paramintW1.val - 1 + paramInt14)] = i2;
        i2 = n;
      }
    }
    paramintW1.val += 1;
    paramArrayOfDouble3[(paramintW1.val - 1 + paramInt7)] = paramArrayOfDouble2[(i2 - 1 + paramInt6)];
    paramArrayOfDouble8[(paramintW1.val - 1 + paramInt12)] = paramArrayOfDouble1[(i2 - 1 + paramInt5)];
    paramArrayOfInt2[(paramintW1.val - 1 + paramInt14)] = i2;
    label1721:
    n = 2;
    for (i8 = i5 - 2 + 1; i8 > 0; i8--)
    {
      i1 = paramArrayOfInt2[(n - 1 + paramInt14)];
      paramArrayOfDouble8[(n - 1 + paramInt12)] = paramArrayOfDouble1[(i1 - 1 + paramInt5)];
      paramArrayOfDouble5[(n - 1 + paramInt9)] = paramArrayOfDouble4[(i1 - 1 + paramInt8)];
      paramArrayOfDouble7[(n - 1 + paramInt11)] = paramArrayOfDouble6[(i1 - 1 + paramInt10)];
      n += 1;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      n = 2;
      for (i8 = i5 - 2 + 1; i8 > 0; i8--)
      {
        i1 = paramArrayOfInt2[(n - 1 + paramInt14)];
        paramArrayOfInt4[(n - 1 + paramInt16)] = paramArrayOfInt3[(paramArrayOfInt1[(i1 - 1 + paramInt13)] + 1 - 1 + paramInt15)];
        if ((paramArrayOfInt4[(n - 1 + paramInt16)] > i6 ? 0 : 1) != 0) {
          paramArrayOfInt4[(n - 1 + paramInt16)] -= 1;
        }
        n += 1;
      }
    }
    Dcopy.dcopy(i5 - paramintW1.val, paramArrayOfDouble8, paramintW1.val + 1 - 1 + paramInt12, 1, paramArrayOfDouble1, paramintW1.val + 1 - 1 + paramInt5, 1);
    paramArrayOfDouble8[(1 - 1 + paramInt12)] = 0.0D;
    d2 = d4 / 2.0D;
    if ((Math.abs(paramArrayOfDouble8[(2 - 1 + paramInt12)]) > d2 ? 0 : 1) != 0) {
      paramArrayOfDouble8[(2 - 1 + paramInt12)] = d2;
    }
    if ((i4 <= i5 ? 0 : 1) != 0)
    {
      paramArrayOfDouble2[(1 - 1 + paramInt6)] = Dlapy2.dlapy2(d5, paramArrayOfDouble2[(i4 - 1 + paramInt6)]);
      if ((paramArrayOfDouble2[(1 - 1 + paramInt6)] > d4 ? 0 : 1) != 0)
      {
        paramdoubleW1.val = 1.0D;
        paramdoubleW2.val = 0.0D;
        paramArrayOfDouble2[(1 - 1 + paramInt6)] = d4;
      }
      else
      {
        paramdoubleW1.val = (d5 / paramArrayOfDouble2[(1 - 1 + paramInt6)]);
        paramdoubleW2.val = (-(paramArrayOfDouble2[(i4 - 1 + paramInt6)] / paramArrayOfDouble2[(1 - 1 + paramInt6)]));
      }
      Drot.drot(1, paramArrayOfDouble4, i4 - 1 + paramInt8, 1, paramArrayOfDouble4, 1 - 1 + paramInt8, 1, paramdoubleW1.val, paramdoubleW2.val);
      Drot.drot(1, paramArrayOfDouble6, i4 - 1 + paramInt10, 1, paramArrayOfDouble6, 1 - 1 + paramInt10, 1, paramdoubleW1.val, paramdoubleW2.val);
    }
    else if ((Math.abs(d5) > d4 ? 0 : 1) != 0)
    {
      paramArrayOfDouble2[(1 - 1 + paramInt6)] = d4;
    }
    else
    {
      paramArrayOfDouble2[(1 - 1 + paramInt6)] = d5;
    }
    Dcopy.dcopy(paramintW1.val - 1, paramArrayOfDouble3, 2 - 1 + paramInt7, 1, paramArrayOfDouble2, 2 - 1 + paramInt6, 1);
    Dcopy.dcopy(i5 - 1, paramArrayOfDouble5, 2 - 1 + paramInt9, 1, paramArrayOfDouble4, 2 - 1 + paramInt8, 1);
    Dcopy.dcopy(i5 - 1, paramArrayOfDouble7, 2 - 1 + paramInt11, 1, paramArrayOfDouble6, 2 - 1 + paramInt10, 1);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasd7.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */