package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Drot;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dlasd2
{
  public static void dlasd2(int paramInt1, int paramInt2, int paramInt3, intW paramintW1, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, double[] paramArrayOfDouble6, int paramInt11, int paramInt12, double[] paramArrayOfDouble7, int paramInt13, int paramInt14, int[] paramArrayOfInt1, int paramInt15, int[] paramArrayOfInt2, int paramInt16, int[] paramArrayOfInt3, int paramInt17, int[] paramArrayOfInt4, int paramInt18, int[] paramArrayOfInt5, int paramInt19, intW paramintW2)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    paramintW2.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW2.val = -2;
    }
    else
    {
      if ((paramInt3 == 1 ? 0 : 1) != 0) {}
      if (((paramInt3 == 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -3;
      }
    }
    i6 = paramInt1 + paramInt2 + 1;
    i5 = i6 + paramInt3;
    if ((paramInt7 >= i6 ? 0 : 1) != 0) {
      paramintW2.val = -10;
    } else if ((paramInt9 >= i5 ? 0 : 1) != 0) {
      paramintW2.val = -12;
    } else if ((paramInt12 >= i6 ? 0 : 1) != 0) {
      paramintW2.val = -15;
    } else if ((paramInt14 >= i5 ? 0 : 1) != 0) {
      paramintW2.val = -17;
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLASD2", -paramintW2.val);
      return;
    }
    i7 = paramInt1 + 1;
    i8 = paramInt1 + 2;
    d7 = paramDouble1 * paramArrayOfDouble4[(i7 - 1 + (i7 - 1) * paramInt9 + paramInt8)];
    paramArrayOfDouble2[(1 - 1 + paramInt5)] = d7;
    j = paramInt1;
    for (int i9 = (1 - paramInt1 + -1) / -1; i9 > 0; i9--)
    {
      paramArrayOfDouble2[(j + 1 - 1 + paramInt5)] = (paramDouble1 * paramArrayOfDouble4[(j - 1 + (i7 - 1) * paramInt9 + paramInt8)]);
      paramArrayOfDouble1[(j + 1 - 1 + paramInt4)] = paramArrayOfDouble1[(j - 1 + paramInt4)];
      paramArrayOfInt4[(j + 1 - 1 + paramInt18)] = (paramArrayOfInt4[(j - 1 + paramInt18)] + 1);
      j += -1;
    }
    j = i8;
    for (i9 = i5 - i8 + 1; i9 > 0; i9--)
    {
      paramArrayOfDouble2[(j - 1 + paramInt5)] = (paramDouble2 * paramArrayOfDouble4[(j - 1 + (i8 - 1) * paramInt9 + paramInt8)]);
      j += 1;
    }
    j = 2;
    for (i9 = i7 - 2 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt5[(j - 1 + paramInt19)] = 1;
      j += 1;
    }
    j = i8;
    for (i9 = i6 - i8 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt5[(j - 1 + paramInt19)] = 2;
      j += 1;
    }
    j = i8;
    for (i9 = i6 - i8 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt4[(j - 1 + paramInt18)] += i7;
      j += 1;
    }
    j = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      paramArrayOfDouble5[(j - 1 + paramInt10)] = paramArrayOfDouble1[(paramArrayOfInt4[(j - 1 + paramInt18)] - 1 + paramInt4)];
      paramArrayOfDouble6[(j - 1 + (1 - 1) * paramInt12 + paramInt11)] = paramArrayOfDouble2[(paramArrayOfInt4[(j - 1 + paramInt18)] - 1 + paramInt5)];
      paramArrayOfInt3[(j - 1 + paramInt17)] = paramArrayOfInt5[(paramArrayOfInt4[(j - 1 + paramInt18)] - 1 + paramInt19)];
      j += 1;
    }
    Dlamrg.dlamrg(paramInt1, paramInt2, paramArrayOfDouble5, 2 - 1 + paramInt10, 1, 1, paramArrayOfInt2, 2 - 1 + paramInt16);
    j = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      k = 1 + paramArrayOfInt2[(j - 1 + paramInt16)];
      paramArrayOfDouble1[(j - 1 + paramInt4)] = paramArrayOfDouble5[(k - 1 + paramInt10)];
      paramArrayOfDouble2[(j - 1 + paramInt5)] = paramArrayOfDouble6[(k - 1 + (1 - 1) * paramInt12 + paramInt11)];
      paramArrayOfInt5[(j - 1 + paramInt19)] = paramArrayOfInt3[(k - 1 + paramInt17)];
      j += 1;
    }
    d2 = Dlamch.dlamch("Epsilon");
    d6 = Math.max(Math.abs(paramDouble1), Math.abs(paramDouble2));
    d6 = 8.0D * d2 * Math.max(Math.abs(paramArrayOfDouble1[(i6 - 1 + paramInt4)]), d6);
    paramintW1.val = 1;
    i4 = i6 + 1;
    i1 = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      if ((Math.abs(paramArrayOfDouble2[(i1 - 1 + paramInt5)]) > d6 ? 0 : 1) != 0)
      {
        i4 -= 1;
        paramArrayOfInt1[(i4 - 1 + paramInt15)] = i1;
        paramArrayOfInt5[(i1 - 1 + paramInt19)] = 4;
        if ((i1 != i6 ? 0 : 1) != 0) {
          break label1681;
        }
      }
      else
      {
        i3 = i1;
        break;
      }
      i1 += 1;
    }
    i1 = i3;
    for (;;)
    {
      i1 += 1;
      if ((i1 <= i6 ? 0 : 1) != 0) {
        break;
      }
      if ((Math.abs(paramArrayOfDouble2[(i1 - 1 + paramInt5)]) > d6 ? 0 : 1) != 0)
      {
        i4 -= 1;
        paramArrayOfInt1[(i4 - 1 + paramInt15)] = i1;
        paramArrayOfInt5[(i1 - 1 + paramInt19)] = 4;
      }
      else if ((Math.abs(paramArrayOfDouble1[(i1 - 1 + paramInt4)] - paramArrayOfDouble1[(i3 - 1 + paramInt4)]) > d6 ? 0 : 1) != 0)
      {
        d4 = paramArrayOfDouble2[(i3 - 1 + paramInt5)];
        d1 = paramArrayOfDouble2[(i1 - 1 + paramInt5)];
        d5 = Dlapy2.dlapy2(d1, d4);
        d1 /= d5;
        d4 = -(d4 / d5);
        paramArrayOfDouble2[(i1 - 1 + paramInt5)] = d5;
        paramArrayOfDouble2[(i3 - 1 + paramInt5)] = 0.0D;
        n = paramArrayOfInt4[(paramArrayOfInt2[(i3 - 1 + paramInt16)] + 1 - 1 + paramInt18)];
        m = paramArrayOfInt4[(paramArrayOfInt2[(i1 - 1 + paramInt16)] + 1 - 1 + paramInt18)];
        if ((n > i7 ? 0 : 1) != 0) {
          n -= 1;
        }
        if ((m > i7 ? 0 : 1) != 0) {
          m -= 1;
        }
        Drot.drot(i6, paramArrayOfDouble3, 1 - 1 + (n - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble3, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1, d1, d4);
        Drot.drot(i5, paramArrayOfDouble4, n - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble4, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, d1, d4);
        if ((paramArrayOfInt5[(i1 - 1 + paramInt19)] == paramArrayOfInt5[(i3 - 1 + paramInt19)] ? 0 : 1) != 0) {
          paramArrayOfInt5[(i1 - 1 + paramInt19)] = 3;
        }
        paramArrayOfInt5[(i3 - 1 + paramInt19)] = 4;
        i4 -= 1;
        paramArrayOfInt1[(i4 - 1 + paramInt15)] = i3;
        i3 = i1;
      }
      else
      {
        paramintW1.val += 1;
        paramArrayOfDouble6[(paramintW1.val - 1 + (1 - 1) * paramInt12 + paramInt11)] = paramArrayOfDouble2[(i3 - 1 + paramInt5)];
        paramArrayOfDouble5[(paramintW1.val - 1 + paramInt10)] = paramArrayOfDouble1[(i3 - 1 + paramInt4)];
        paramArrayOfInt1[(paramintW1.val - 1 + paramInt15)] = i3;
        i3 = i1;
      }
    }
    paramintW1.val += 1;
    paramArrayOfDouble6[(paramintW1.val - 1 + (1 - 1) * paramInt12 + paramInt11)] = paramArrayOfDouble2[(i3 - 1 + paramInt5)];
    paramArrayOfDouble5[(paramintW1.val - 1 + paramInt10)] = paramArrayOfDouble1[(i3 - 1 + paramInt4)];
    paramArrayOfInt1[(paramintW1.val - 1 + paramInt15)] = i3;
    label1681:
    i1 = 1;
    for (i9 = 4 - 1 + 1; i9 > 0; i9--)
    {
      arrayOfInt1[(i1 - 1)] = 0;
      i1 += 1;
    }
    i1 = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      i = paramArrayOfInt5[(i1 - 1 + paramInt19)];
      arrayOfInt1[(i - 1)] += 1;
      i1 += 1;
    }
    arrayOfInt2[(1 - 1)] = 2;
    arrayOfInt2[(2 - 1)] = (2 + arrayOfInt1[(1 - 1)]);
    arrayOfInt2[(3 - 1)] = (arrayOfInt2[(2 - 1)] + arrayOfInt1[(2 - 1)]);
    arrayOfInt2[(4 - 1)] = (arrayOfInt2[(3 - 1)] + arrayOfInt1[(3 - 1)]);
    i1 = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      i2 = paramArrayOfInt1[(i1 - 1 + paramInt15)];
      i = paramArrayOfInt5[(i2 - 1 + paramInt19)];
      paramArrayOfInt3[(arrayOfInt2[(i - 1)] - 1 + paramInt17)] = i1;
      arrayOfInt2[(i - 1)] += 1;
      i1 += 1;
    }
    i1 = 2;
    for (i9 = i6 - 2 + 1; i9 > 0; i9--)
    {
      i2 = paramArrayOfInt1[(i1 - 1 + paramInt15)];
      paramArrayOfDouble5[(i1 - 1 + paramInt10)] = paramArrayOfDouble1[(i2 - 1 + paramInt4)];
      m = paramArrayOfInt4[(paramArrayOfInt2[(paramArrayOfInt1[(paramArrayOfInt3[(i1 - 1 + paramInt17)] - 1 + paramInt15)] - 1 + paramInt16)] + 1 - 1 + paramInt18)];
      if ((m > i7 ? 0 : 1) != 0) {
        m -= 1;
      }
      Dcopy.dcopy(i6, paramArrayOfDouble3, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble6, 1 - 1 + (i1 - 1) * paramInt12 + paramInt11, 1);
      Dcopy.dcopy(i5, paramArrayOfDouble4, m - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble7, i1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
      i1 += 1;
    }
    paramArrayOfDouble5[(1 - 1 + paramInt10)] = 0.0D;
    d3 = d6 / 2.0D;
    if ((Math.abs(paramArrayOfDouble5[(2 - 1 + paramInt10)]) > d3 ? 0 : 1) != 0) {
      paramArrayOfDouble5[(2 - 1 + paramInt10)] = d3;
    }
    if ((i5 <= i6 ? 0 : 1) != 0)
    {
      paramArrayOfDouble2[(1 - 1 + paramInt5)] = Dlapy2.dlapy2(d7, paramArrayOfDouble2[(i5 - 1 + paramInt5)]);
      if ((paramArrayOfDouble2[(1 - 1 + paramInt5)] > d6 ? 0 : 1) != 0)
      {
        d1 = 1.0D;
        d4 = 0.0D;
        paramArrayOfDouble2[(1 - 1 + paramInt5)] = d6;
      }
      else
      {
        d1 = d7 / paramArrayOfDouble2[(1 - 1 + paramInt5)];
        d4 = paramArrayOfDouble2[(i5 - 1 + paramInt5)] / paramArrayOfDouble2[(1 - 1 + paramInt5)];
      }
    }
    else if ((Math.abs(d7) > d6 ? 0 : 1) != 0)
    {
      paramArrayOfDouble2[(1 - 1 + paramInt5)] = d6;
    }
    else
    {
      paramArrayOfDouble2[(1 - 1 + paramInt5)] = d7;
    }
    Dcopy.dcopy(paramintW1.val - 1, paramArrayOfDouble6, 2 - 1 + (1 - 1) * paramInt12 + paramInt11, 1, paramArrayOfDouble2, 2 - 1 + paramInt5, 1);
    Dlaset.dlaset("A", i6, 1, 0.0D, 0.0D, paramArrayOfDouble6, paramInt11, paramInt12);
    paramArrayOfDouble6[(i7 - 1 + (1 - 1) * paramInt12 + paramInt11)] = 1.0D;
    if ((i5 <= i6 ? 0 : 1) != 0)
    {
      j = 1;
      for (i9 = i7 - 1 + 1; i9 > 0; i9--)
      {
        paramArrayOfDouble4[(i5 - 1 + (j - 1) * paramInt9 + paramInt8)] = (-(d4 * paramArrayOfDouble4[(i7 - 1 + (j - 1) * paramInt9 + paramInt8)]));
        paramArrayOfDouble7[(1 - 1 + (j - 1) * paramInt14 + paramInt13)] = (d1 * paramArrayOfDouble4[(i7 - 1 + (j - 1) * paramInt9 + paramInt8)]);
        j += 1;
      }
      j = i8;
      for (i9 = i5 - i8 + 1; i9 > 0; i9--)
      {
        paramArrayOfDouble7[(1 - 1 + (j - 1) * paramInt14 + paramInt13)] = (d4 * paramArrayOfDouble4[(i5 - 1 + (j - 1) * paramInt9 + paramInt8)]);
        paramArrayOfDouble4[(i5 - 1 + (j - 1) * paramInt9 + paramInt8)] = (d1 * paramArrayOfDouble4[(i5 - 1 + (j - 1) * paramInt9 + paramInt8)]);
        j += 1;
      }
    }
    else
    {
      Dcopy.dcopy(i5, paramArrayOfDouble4, i7 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble7, 1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
    }
    if ((i5 <= i6 ? 0 : 1) != 0) {
      Dcopy.dcopy(i5, paramArrayOfDouble4, i5 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble7, i5 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
    }
    if ((i6 <= paramintW1.val ? 0 : 1) != 0)
    {
      Dcopy.dcopy(i6 - paramintW1.val, paramArrayOfDouble5, paramintW1.val + 1 - 1 + paramInt10, 1, paramArrayOfDouble1, paramintW1.val + 1 - 1 + paramInt4, 1);
      Dlacpy.dlacpy("A", i6, i6 - paramintW1.val, paramArrayOfDouble6, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfDouble3, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt7 + paramInt6, paramInt7);
      Dlacpy.dlacpy("A", i6 - paramintW1.val, i5, paramArrayOfDouble7, paramintW1.val + 1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14, paramArrayOfDouble4, paramintW1.val + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
    }
    i1 = 1;
    for (i9 = 4 - 1 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt5[(i1 - 1 + paramInt19)] = arrayOfInt1[(i1 - 1)];
      i1 += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasd2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */