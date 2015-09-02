package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dnrm2;
import org.netlib.blas.Dswap;
import org.netlib.blas.Idamax;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaqps
{
  public static void dlaqps(int paramInt1, int paramInt2, int paramInt3, int paramInt4, intW paramintW, double[] paramArrayOfDouble1, int paramInt5, int paramInt6, int[] paramArrayOfInt, int paramInt7, double[] paramArrayOfDouble2, int paramInt8, double[] paramArrayOfDouble3, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, double[] paramArrayOfDouble6, int paramInt12, int paramInt13)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    m = Math.min(paramInt1, paramInt2 + paramInt3);
    n = 0;
    k = 0;
    d4 = Math.sqrt(Dlamch.dlamch("Epsilon"));
    for (;;)
    {
      if ((k >= paramInt4 ? 0 : 1) != 0) {}
      if (((n != 0 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        break;
      }
      k += 1;
      i2 = paramInt3 + k;
      i1 = k - 1 + Idamax.idamax(paramInt2 - k + 1, paramArrayOfDouble3, k - 1 + paramInt9, 1);
      if ((i1 == k ? 0 : 1) != 0)
      {
        Dswap.dswap(paramInt1, paramArrayOfDouble1, 1 - 1 + (i1 - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt6 + paramInt5, 1);
        Dswap.dswap(k - 1, paramArrayOfDouble6, i1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, k - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13);
        i = paramArrayOfInt[(i1 - 1 + paramInt7)];
        paramArrayOfInt[(i1 - 1 + paramInt7)] = paramArrayOfInt[(k - 1 + paramInt7)];
        paramArrayOfInt[(k - 1 + paramInt7)] = i;
        paramArrayOfDouble3[(i1 - 1 + paramInt9)] = paramArrayOfDouble3[(k - 1 + paramInt9)];
        paramArrayOfDouble4[(i1 - 1 + paramInt10)] = paramArrayOfDouble4[(k - 1 + paramInt10)];
      }
      if ((k <= 1 ? 0 : 1) != 0) {
        Dgemv.dgemv("No transpose", paramInt1 - i2 + 1, k - 1, -1.0D, paramArrayOfDouble1, i2 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble6, k - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0D, paramArrayOfDouble1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, 1);
      }
      if ((i2 >= paramInt1 ? 0 : 1) != 0) {
        dlarfg_adapter(paramInt1 - i2 + 1, paramArrayOfDouble1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, paramArrayOfDouble1, i2 + 1 - 1 + (k - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble2, k - 1 + paramInt8);
      } else {
        dlarfg_adapter(1, paramArrayOfDouble1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, paramArrayOfDouble1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble2, k - 1 + paramInt8);
      }
      d1 = paramArrayOfDouble1[(i2 - 1 + (k - 1) * paramInt6 + paramInt5)];
      paramArrayOfDouble1[(i2 - 1 + (k - 1) * paramInt6 + paramInt5)] = 1.0D;
      if ((k >= paramInt2 ? 0 : 1) != 0) {
        Dgemv.dgemv("Transpose", paramInt1 - i2 + 1, paramInt2 - k, paramArrayOfDouble2[(k - 1 + paramInt8)], paramArrayOfDouble1, i2 - 1 + (k + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, 1, 0.0D, paramArrayOfDouble6, k + 1 - 1 + (k - 1) * paramInt13 + paramInt12, 1);
      }
      j = 1;
      for (int i3 = k - 1 + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble6[(j - 1 + (k - 1) * paramInt13 + paramInt12)] = 0.0D;
        j += 1;
      }
      if ((k <= 1 ? 0 : 1) != 0)
      {
        Dgemv.dgemv("Transpose", paramInt1 - i2 + 1, k - 1, -paramArrayOfDouble2[(k - 1 + paramInt8)], paramArrayOfDouble1, i2 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, 1, 0.0D, paramArrayOfDouble5, 1 - 1 + paramInt11, 1);
        Dgemv.dgemv("No transpose", paramInt2, k - 1, 1.0D, paramArrayOfDouble6, 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble5, 1 - 1 + paramInt11, 1, 1.0D, paramArrayOfDouble6, 1 - 1 + (k - 1) * paramInt13 + paramInt12, 1);
      }
      if ((k >= paramInt2 ? 0 : 1) != 0) {
        Dgemv.dgemv("No transpose", paramInt2 - k, k, -1.0D, paramArrayOfDouble6, k + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble1, i2 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, i2 - 1 + (k + 1 - 1) * paramInt6 + paramInt5, paramInt6);
      }
      if ((i2 >= m ? 0 : 1) != 0)
      {
        j = k + 1;
        for (i3 = paramInt2 - (k + 1) + 1; i3 > 0; i3--)
        {
          if ((paramArrayOfDouble3[(j - 1 + paramInt9)] == 0.0D ? 0 : 1) != 0)
          {
            d2 = Math.abs(paramArrayOfDouble1[(i2 - 1 + (j - 1) * paramInt6 + paramInt5)]) / paramArrayOfDouble3[(j - 1 + paramInt9)];
            d2 = Math.max(0.0D, (1.0D + d2) * (1.0D - d2));
            d3 = d2 * Math.pow(paramArrayOfDouble3[(j - 1 + paramInt9)] / paramArrayOfDouble4[(j - 1 + paramInt10)], 2);
            if ((d3 > d4 ? 0 : 1) != 0)
            {
              paramArrayOfDouble4[(j - 1 + paramInt10)] = n;
              n = j;
            }
            else
            {
              paramArrayOfDouble3[(j - 1 + paramInt9)] *= Math.sqrt(d2);
            }
          }
          j += 1;
        }
      }
      paramArrayOfDouble1[(i2 - 1 + (k - 1) * paramInt6 + paramInt5)] = d1;
    }
    paramintW.val = k;
    i2 = paramInt3 + paramintW.val;
    if ((paramintW.val >= Math.min(paramInt2, paramInt1 - paramInt3) ? 0 : 1) != 0) {
      Dgemm.dgemm("No transpose", "Transpose", paramInt1 - i2, paramInt2 - paramintW.val, paramintW.val, -1.0D, paramArrayOfDouble1, i2 + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble6, paramintW.val + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0D, paramArrayOfDouble1, i2 + 1 - 1 + (paramintW.val + 1 - 1) * paramInt6 + paramInt5, paramInt6);
    }
    while ((n <= 0 ? 0 : 1) != 0)
    {
      i = Util.idnint(paramArrayOfDouble4[(n - 1 + paramInt10)]);
      paramArrayOfDouble3[(n - 1 + paramInt9)] = Dnrm2.dnrm2(paramInt1 - i2, paramArrayOfDouble1, i2 + 1 - 1 + (n - 1) * paramInt6 + paramInt5, 1);
      paramArrayOfDouble4[(n - 1 + paramInt10)] = paramArrayOfDouble3[(n - 1 + paramInt9)];
      n = i;
    }
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double[] paramArrayOfDouble3, int paramInt5)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt2]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble3[paramInt5]);
    Dlarfg.dlarfg(paramInt1, localdoubleW1, paramArrayOfDouble2, paramInt3, paramInt4, localdoubleW2);
    paramArrayOfDouble1[paramInt2] = localdoubleW1.val;
    paramArrayOfDouble3[paramInt5] = localdoubleW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqps.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */