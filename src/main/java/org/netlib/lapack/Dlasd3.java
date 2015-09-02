package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Dnrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasd3
{
  public static void dlasd3(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, int paramInt12, double[] paramArrayOfDouble6, int paramInt13, int paramInt14, double[] paramArrayOfDouble7, int paramInt15, int paramInt16, int[] paramArrayOfInt1, int paramInt17, int[] paramArrayOfInt2, int paramInt18, double[] paramArrayOfDouble8, int paramInt19, intW paramintW)
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
    paramintW.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt3 == 1 ? 0 : 1) != 0) {}
      if (((paramInt3 == 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -3;
      }
    }
    i2 = paramInt1 + paramInt2 + 1;
    i1 = i2 + paramInt3;
    i3 = paramInt1 + 1;
    i4 = paramInt1 + 2;
    if ((paramInt4 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt4 <= i2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt7 >= paramInt4 ? 0 : 1) != 0) {
      paramintW.val = -7;
    } else if ((paramInt10 >= i2 ? 0 : 1) != 0) {
      paramintW.val = -10;
    } else if ((paramInt12 >= i2 ? 0 : 1) != 0) {
      paramintW.val = -12;
    } else if ((paramInt14 >= i1 ? 0 : 1) != 0) {
      paramintW.val = -14;
    } else if ((paramInt16 >= i1 ? 0 : 1) != 0) {
      paramintW.val = -16;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLASD3", -paramintW.val);
      return;
    }
    if ((paramInt4 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfDouble1[(1 - 1 + paramInt5)] = Math.abs(paramArrayOfDouble8[(1 - 1 + paramInt19)]);
      Dcopy.dcopy(i1, paramArrayOfDouble7, 1 - 1 + (1 - 1) * paramInt16 + paramInt15, paramInt16, paramArrayOfDouble6, 1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
      if ((paramArrayOfDouble8[(1 - 1 + paramInt19)] <= 0.0D ? 0 : 1) != 0)
      {
        Dcopy.dcopy(i2, paramArrayOfDouble5, 1 - 1 + (1 - 1) * paramInt12 + paramInt11, 1, paramArrayOfDouble4, 1 - 1 + (1 - 1) * paramInt10 + paramInt9, 1);
      }
      else
      {
        j = 1;
        for (int i6 = i2 - 1 + 1; i6 > 0; i6--)
        {
          paramArrayOfDouble4[(j - 1 + (1 - 1) * paramInt10 + paramInt9)] = (-paramArrayOfDouble5[(j - 1 + (1 - 1) * paramInt12 + paramInt11)]);
          j += 1;
        }
      }
      return;
    }
    j = 1;
    for (int i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfDouble3[(j - 1 + paramInt8)] = (Dlamc3.dlamc3(paramArrayOfDouble3[(j - 1 + paramInt8)], paramArrayOfDouble3[(j - 1 + paramInt8)]) - paramArrayOfDouble3[(j - 1 + paramInt8)]);
      j += 1;
    }
    Dcopy.dcopy(paramInt4, paramArrayOfDouble8, paramInt19, 1, paramArrayOfDouble2, paramInt6, 1);
    d1 = Dnrm2.dnrm2(paramInt4, paramArrayOfDouble8, paramInt19, 1);
    Dlascl.dlascl("G", 0, 0, d1, 1.0D, paramInt4, 1, paramArrayOfDouble8, paramInt19, paramInt4, paramintW);
    d1 *= d1;
    k = 1;
    for (int i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
    {
      dlasd4_adapter(paramInt4, k, paramArrayOfDouble3, paramInt8, paramArrayOfDouble8, paramInt19, paramArrayOfDouble4, 1 - 1 + (k - 1) * paramInt10 + paramInt9, d1, paramArrayOfDouble1, k - 1 + paramInt5, paramArrayOfDouble6, 1 - 1 + (k - 1) * paramInt14 + paramInt13, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        return;
      }
      k += 1;
    }
    j = 1;
    int i7;
    for (int i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfDouble8[(j - 1 + paramInt19)] = (paramArrayOfDouble4[(j - 1 + (paramInt4 - 1) * paramInt10 + paramInt9)] * paramArrayOfDouble6[(j - 1 + (paramInt4 - 1) * paramInt14 + paramInt13)]);
      k = 1;
      for (i7 = j - 1 - 1 + 1; i7 > 0; i7--)
      {
        paramArrayOfDouble8[(j - 1 + paramInt19)] *= paramArrayOfDouble4[(j - 1 + (k - 1) * paramInt10 + paramInt9)] * paramArrayOfDouble6[(j - 1 + (k - 1) * paramInt14 + paramInt13)] / (paramArrayOfDouble3[(j - 1 + paramInt8)] - paramArrayOfDouble3[(k - 1 + paramInt8)]) / (paramArrayOfDouble3[(j - 1 + paramInt8)] + paramArrayOfDouble3[(k - 1 + paramInt8)]);
        k += 1;
      }
      k = j;
      for (i7 = paramInt4 - 1 - j + 1; i7 > 0; i7--)
      {
        paramArrayOfDouble8[(j - 1 + paramInt19)] *= paramArrayOfDouble4[(j - 1 + (k - 1) * paramInt10 + paramInt9)] * paramArrayOfDouble6[(j - 1 + (k - 1) * paramInt14 + paramInt13)] / (paramArrayOfDouble3[(j - 1 + paramInt8)] - paramArrayOfDouble3[(k + 1 - 1 + paramInt8)]) / (paramArrayOfDouble3[(j - 1 + paramInt8)] + paramArrayOfDouble3[(k + 1 - 1 + paramInt8)]);
        k += 1;
      }
      paramArrayOfDouble8[(j - 1 + paramInt19)] = Util.dsign(Math.sqrt(Math.abs(paramArrayOfDouble8[(j - 1 + paramInt19)])), paramArrayOfDouble2[(j - 1 + (1 - 1) * paramInt7 + paramInt6)]);
      j += 1;
    }
    j = 1;
    for (int i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfDouble6[(1 - 1 + (j - 1) * paramInt14 + paramInt13)] = (paramArrayOfDouble8[(1 - 1 + paramInt19)] / paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt10 + paramInt9)] / paramArrayOfDouble6[(1 - 1 + (j - 1) * paramInt14 + paramInt13)]);
      paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt10 + paramInt9)] = -1.0D;
      k = 2;
      for (i7 = paramInt4 - 2 + 1; i7 > 0; i7--)
      {
        paramArrayOfDouble6[(k - 1 + (j - 1) * paramInt14 + paramInt13)] = (paramArrayOfDouble8[(k - 1 + paramInt19)] / paramArrayOfDouble4[(k - 1 + (j - 1) * paramInt10 + paramInt9)] / paramArrayOfDouble6[(k - 1 + (j - 1) * paramInt14 + paramInt13)]);
        paramArrayOfDouble4[(k - 1 + (j - 1) * paramInt10 + paramInt9)] = (paramArrayOfDouble3[(k - 1 + paramInt8)] * paramArrayOfDouble6[(k - 1 + (j - 1) * paramInt14 + paramInt13)]);
        k += 1;
      }
      d2 = Dnrm2.dnrm2(paramInt4, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt10 + paramInt9, 1);
      paramArrayOfDouble4[(1 - 1 + (j - 1) * paramInt10 + paramInt9)] /= d2;
      k = 2;
      for (i7 = paramInt4 - 2 + 1; i7 > 0; i7--)
      {
        m = paramArrayOfInt1[(k - 1 + paramInt17)];
        paramArrayOfDouble4[(m - 1 + (j - 1) * paramInt10 + paramInt9)] /= d2;
        k += 1;
      }
      j += 1;
    }
    if ((paramInt4 != 2 ? 0 : 1) != 0)
    {
      Dgemm.dgemm("N", "N", i2, paramInt4, paramInt4, 1.0D, paramArrayOfDouble5, paramInt11, paramInt12, paramArrayOfDouble2, paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, paramInt9, paramInt10);
    }
    else
    {
      if ((paramArrayOfInt2[(1 - 1 + paramInt18)] <= 0 ? 0 : 1) != 0)
      {
        Dgemm.dgemm("N", "N", paramInt1, paramInt4, paramArrayOfInt2[(1 - 1 + paramInt18)], 1.0D, paramArrayOfDouble5, 1 - 1 + (2 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfDouble2, 2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
        if ((paramArrayOfInt2[(3 - 1 + paramInt18)] <= 0 ? 0 : 1) != 0)
        {
          n = 2 + paramArrayOfInt2[(1 - 1 + paramInt18)] + paramArrayOfInt2[(2 - 1 + paramInt18)];
          Dgemm.dgemm("N", "N", paramInt1, paramInt4, paramArrayOfInt2[(3 - 1 + paramInt18)], 1.0D, paramArrayOfDouble5, 1 - 1 + (n - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfDouble2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble4, 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
        }
      }
      else if ((paramArrayOfInt2[(3 - 1 + paramInt18)] <= 0 ? 0 : 1) != 0)
      {
        n = 2 + paramArrayOfInt2[(1 - 1 + paramInt18)] + paramArrayOfInt2[(2 - 1 + paramInt18)];
        Dgemm.dgemm("N", "N", paramInt1, paramInt4, paramArrayOfInt2[(3 - 1 + paramInt18)], 1.0D, paramArrayOfDouble5, 1 - 1 + (n - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfDouble2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
      }
      else
      {
        Dlacpy.dlacpy("F", paramInt1, paramInt4, paramArrayOfDouble5, paramInt11, paramInt12, paramArrayOfDouble4, paramInt9, paramInt10);
      }
      Dcopy.dcopy(paramInt4, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble4, i3 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
      n = 2 + paramArrayOfInt2[(1 - 1 + paramInt18)];
      i = paramArrayOfInt2[(2 - 1 + paramInt18)] + paramArrayOfInt2[(3 - 1 + paramInt18)];
      Dgemm.dgemm("N", "N", paramInt2, paramInt4, i, 1.0D, paramArrayOfDouble5, i4 - 1 + (n - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfDouble2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, i4 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
    }
    j = 1;
    for (int i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
    {
      d2 = Dnrm2.dnrm2(paramInt4, paramArrayOfDouble6, 1 - 1 + (j - 1) * paramInt14 + paramInt13, 1);
      paramArrayOfDouble2[(j - 1 + (1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble6[(1 - 1 + (j - 1) * paramInt14 + paramInt13)] / d2);
      k = 2;
      for (i7 = paramInt4 - 2 + 1; i7 > 0; i7--)
      {
        m = paramArrayOfInt1[(k - 1 + paramInt17)];
        paramArrayOfDouble6[(m - 1 + (j - 1) * paramInt14 + paramInt13)] /= d2;
        k += 1;
      }
      j += 1;
    }
    if ((paramInt4 != 2 ? 0 : 1) != 0)
    {
      Dgemm.dgemm("N", "N", paramInt4, i1, paramInt4, 1.0D, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble7, paramInt15, paramInt16, 0.0D, paramArrayOfDouble6, paramInt13, paramInt14);
      return;
    }
    n = 1 + paramArrayOfInt2[(1 - 1 + paramInt18)];
    Dgemm.dgemm("N", "N", paramInt4, i3, n, 1.0D, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble7, 1 - 1 + (1 - 1) * paramInt16 + paramInt15, paramInt16, 0.0D, paramArrayOfDouble6, 1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
    n = 2 + paramArrayOfInt2[(1 - 1 + paramInt18)] + paramArrayOfInt2[(2 - 1 + paramInt18)];
    if ((n > paramInt16 ? 0 : 1) != 0) {
      Dgemm.dgemm("N", "N", paramInt4, i3, paramArrayOfInt2[(3 - 1 + paramInt18)], 1.0D, paramArrayOfDouble2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble7, n - 1 + (1 - 1) * paramInt16 + paramInt15, paramInt16, 1.0D, paramArrayOfDouble6, 1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
    }
    n = paramArrayOfInt2[(1 - 1 + paramInt18)] + 1;
    i5 = paramInt2 + paramInt3;
    if ((n <= 1 ? 0 : 1) != 0)
    {
      j = 1;
      for (int i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
      {
        paramArrayOfDouble2[(j - 1 + (n - 1) * paramInt7 + paramInt6)] = paramArrayOfDouble2[(j - 1 + (1 - 1) * paramInt7 + paramInt6)];
        j += 1;
      }
      j = i4;
      for (int i6 = i1 - i4 + 1; i6 > 0; i6--)
      {
        paramArrayOfDouble7[(n - 1 + (j - 1) * paramInt16 + paramInt15)] = paramArrayOfDouble7[(1 - 1 + (j - 1) * paramInt16 + paramInt15)];
        j += 1;
      }
    }
    i = 1 + paramArrayOfInt2[(2 - 1 + paramInt18)] + paramArrayOfInt2[(3 - 1 + paramInt18)];
    Dgemm.dgemm("N", "N", paramInt4, i5, i, 1.0D, paramArrayOfDouble2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble7, n - 1 + (i4 - 1) * paramInt16 + paramInt15, paramInt16, 0.0D, paramArrayOfDouble6, 1 - 1 + (i4 - 1) * paramInt14 + paramInt13, paramInt14);
  }
  
  private static void dlasd4_adapter(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double paramDouble, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, intW paramintW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble4[paramInt6]);
    Dlasd4.dlasd4(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramDouble, localdoubleW, paramArrayOfDouble5, paramInt7, paramintW);
    paramArrayOfDouble4[paramInt6] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasd3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */