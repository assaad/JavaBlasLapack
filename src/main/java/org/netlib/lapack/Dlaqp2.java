package org.netlib.lapack;

import org.netlib.blas.Dnrm2;
import org.netlib.blas.Dswap;
import org.netlib.blas.Idamax;
import org.netlib.util.doubleW;

public final class Dlaqp2
{
  public static void dlaqp2(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, int[] paramArrayOfInt, int paramInt6, double[] paramArrayOfDouble2, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, double[] paramArrayOfDouble5, int paramInt10)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    m = Math.min(paramInt1 - paramInt3, paramInt2);
    d4 = Math.sqrt(Dlamch.dlamch("Epsilon"));
    i = 1;
    for (int i2 = m - 1 + 1; i2 > 0; i2--)
    {
      n = paramInt3 + i;
      i1 = i - 1 + Idamax.idamax(paramInt2 - i + 1, paramArrayOfDouble3, i - 1 + paramInt8, 1);
      if ((i1 == i ? 0 : 1) != 0)
      {
        Dswap.dswap(paramInt1, paramArrayOfDouble1, 1 - 1 + (i1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        j = paramArrayOfInt[(i1 - 1 + paramInt6)];
        paramArrayOfInt[(i1 - 1 + paramInt6)] = paramArrayOfInt[(i - 1 + paramInt6)];
        paramArrayOfInt[(i - 1 + paramInt6)] = j;
        paramArrayOfDouble3[(i1 - 1 + paramInt8)] = paramArrayOfDouble3[(i - 1 + paramInt8)];
        paramArrayOfDouble4[(i1 - 1 + paramInt9)] = paramArrayOfDouble4[(i - 1 + paramInt9)];
      }
      if ((n >= paramInt1 ? 0 : 1) != 0) {
        dlarfg_adapter(paramInt1 - n + 1, paramArrayOfDouble1, n - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, n + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, i - 1 + paramInt7);
      } else {
        dlarfg_adapter(1, paramArrayOfDouble1, paramInt1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, paramInt1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, i - 1 + paramInt7);
      }
      if ((i >= paramInt2 ? 0 : 1) != 0)
      {
        d1 = paramArrayOfDouble1[(n - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble1[(n - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0D;
        Dlarf.dlarf("Left", paramInt1 - n + 1, paramInt2 - i, paramArrayOfDouble1, n - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2[(i - 1 + paramInt7)], paramArrayOfDouble1, n - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble5, 1 - 1 + paramInt10);
        paramArrayOfDouble1[(n - 1 + (i - 1) * paramInt5 + paramInt4)] = d1;
      }
      k = i + 1;
      for (int i3 = paramInt2 - (i + 1) + 1; i3 > 0; i3--)
      {
        if ((paramArrayOfDouble3[(k - 1 + paramInt8)] == 0.0D ? 0 : 1) != 0)
        {
          d2 = 1.0D - Math.pow(Math.abs(paramArrayOfDouble1[(n - 1 + (k - 1) * paramInt5 + paramInt4)]) / paramArrayOfDouble3[(k - 1 + paramInt8)], 2);
          d2 = Math.max(d2, 0.0D);
          d3 = d2 * Math.pow(paramArrayOfDouble3[(k - 1 + paramInt8)] / paramArrayOfDouble4[(k - 1 + paramInt9)], 2);
          if ((d3 > d4 ? 0 : 1) != 0)
          {
            if ((n >= paramInt1 ? 0 : 1) != 0)
            {
              paramArrayOfDouble3[(k - 1 + paramInt8)] = Dnrm2.dnrm2(paramInt1 - n, paramArrayOfDouble1, n + 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1);
              paramArrayOfDouble4[(k - 1 + paramInt9)] = paramArrayOfDouble3[(k - 1 + paramInt8)];
            }
            else
            {
              paramArrayOfDouble3[(k - 1 + paramInt8)] = 0.0D;
              paramArrayOfDouble4[(k - 1 + paramInt9)] = 0.0D;
            }
          }
          else {
            paramArrayOfDouble3[(k - 1 + paramInt8)] *= Math.sqrt(d2);
          }
        }
        k += 1;
      }
      i += 1;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqp2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */