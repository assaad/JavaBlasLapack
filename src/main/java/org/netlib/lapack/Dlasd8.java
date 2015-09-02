package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dnrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasd8
{
  public static void dlasd8(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, double[] paramArrayOfDouble6, int paramInt8, int paramInt9, double[] paramArrayOfDouble7, int paramInt10, double[] paramArrayOfDouble8, int paramInt11, intW paramintW)
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
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 1 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt9 >= paramInt2 ? 0 : 1) != 0) {
      paramintW.val = -9;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLASD8", -paramintW.val);
      return;
    }
    if ((paramInt2 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfDouble1[(1 - 1 + paramInt3)] = Math.abs(paramArrayOfDouble2[(1 - 1 + paramInt4)]);
      paramArrayOfDouble5[(1 - 1 + paramInt7)] = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      if ((paramInt1 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfDouble5[(2 - 1 + paramInt7)] = 1.0D;
        paramArrayOfDouble6[(1 - 1 + (2 - 1) * paramInt9 + paramInt8)] = 1.0D;
      }
      return;
    }
    i = 1;
    for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      paramArrayOfDouble7[(i - 1 + paramInt10)] = (Dlamc3.dlamc3(paramArrayOfDouble7[(i - 1 + paramInt10)], paramArrayOfDouble7[(i - 1 + paramInt10)]) - paramArrayOfDouble7[(i - 1 + paramInt10)]);
      i += 1;
    }
    j = 1;
    k = j + paramInt2;
    n = k + paramInt2;
    m = k - 1;
    i1 = n - 1;
    d6 = Dnrm2.dnrm2(paramInt2, paramArrayOfDouble2, paramInt4, 1);
    Dlascl.dlascl("G", 0, 0, d6, 1.0D, paramInt2, 1, paramArrayOfDouble2, paramInt4, paramInt2, paramintW);
    d6 *= d6;
    Dlaset.dlaset("A", paramInt2, 1, 1.0D, 1.0D, paramArrayOfDouble8, n - 1 + paramInt11, paramInt2);
    i2 = 1;
    int i4;
    for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      dlasd4_adapter(paramInt2, i2, paramArrayOfDouble7, paramInt10, paramArrayOfDouble2, paramInt4, paramArrayOfDouble8, j - 1 + paramInt11, d6, paramArrayOfDouble1, i2 - 1 + paramInt3, paramArrayOfDouble8, k - 1 + paramInt11, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        return;
      }
      paramArrayOfDouble8[(i1 + i2 - 1 + paramInt11)] = (paramArrayOfDouble8[(i1 + i2 - 1 + paramInt11)] * paramArrayOfDouble8[(i2 - 1 + paramInt11)] * paramArrayOfDouble8[(m + i2 - 1 + paramInt11)]);
      paramArrayOfDouble5[(i2 - 1 + paramInt7)] = (-paramArrayOfDouble8[(i2 - 1 + paramInt11)]);
      paramArrayOfDouble6[(i2 - 1 + (1 - 1) * paramInt9 + paramInt8)] = (-paramArrayOfDouble8[(i2 + 1 - 1 + paramInt11)]);
      i = 1;
      for (i4 = i2 - 1 - 1 + 1; i4 > 0; i4--)
      {
        paramArrayOfDouble8[(i1 + i - 1 + paramInt11)] = (paramArrayOfDouble8[(i1 + i - 1 + paramInt11)] * paramArrayOfDouble8[(i - 1 + paramInt11)] * paramArrayOfDouble8[(m + i - 1 + paramInt11)] / (paramArrayOfDouble7[(i - 1 + paramInt10)] - paramArrayOfDouble7[(i2 - 1 + paramInt10)]) / (paramArrayOfDouble7[(i - 1 + paramInt10)] + paramArrayOfDouble7[(i2 - 1 + paramInt10)]));
        i += 1;
      }
      i = i2 + 1;
      for (i4 = paramInt2 - (i2 + 1) + 1; i4 > 0; i4--)
      {
        paramArrayOfDouble8[(i1 + i - 1 + paramInt11)] = (paramArrayOfDouble8[(i1 + i - 1 + paramInt11)] * paramArrayOfDouble8[(i - 1 + paramInt11)] * paramArrayOfDouble8[(m + i - 1 + paramInt11)] / (paramArrayOfDouble7[(i - 1 + paramInt10)] - paramArrayOfDouble7[(i2 - 1 + paramInt10)]) / (paramArrayOfDouble7[(i - 1 + paramInt10)] + paramArrayOfDouble7[(i2 - 1 + paramInt10)]));
        i += 1;
      }
      i2 += 1;
    }
    i = 1;
    for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt4)] = Util.dsign(Math.sqrt(Math.abs(paramArrayOfDouble8[(i1 + i - 1 + paramInt11)])), paramArrayOfDouble2[(i - 1 + paramInt4)]);
      i += 1;
    }
    i2 = 1;
    for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      d1 = paramArrayOfDouble5[(i2 - 1 + paramInt7)];
      d3 = paramArrayOfDouble1[(i2 - 1 + paramInt3)];
      d4 = -paramArrayOfDouble7[(i2 - 1 + paramInt10)];
      if ((i2 >= paramInt2 ? 0 : 1) != 0)
      {
        d2 = -paramArrayOfDouble6[(i2 - 1 + (1 - 1) * paramInt9 + paramInt8)];
        d5 = -paramArrayOfDouble7[(i2 + 1 - 1 + paramInt10)];
      }
      paramArrayOfDouble8[(i2 - 1 + paramInt11)] = (-(paramArrayOfDouble2[(i2 - 1 + paramInt4)] / d1 / (paramArrayOfDouble7[(i2 - 1 + paramInt10)] + d3)));
      i = 1;
      for (i4 = i2 - 1 - 1 + 1; i4 > 0; i4--)
      {
        paramArrayOfDouble8[(i - 1 + paramInt11)] = (paramArrayOfDouble2[(i - 1 + paramInt4)] / (Dlamc3.dlamc3(paramArrayOfDouble7[(i - 1 + paramInt10)], d4) - d1) / (paramArrayOfDouble7[(i - 1 + paramInt10)] + d3));
        i += 1;
      }
      i = i2 + 1;
      for (i4 = paramInt2 - (i2 + 1) + 1; i4 > 0; i4--)
      {
        paramArrayOfDouble8[(i - 1 + paramInt11)] = (paramArrayOfDouble2[(i - 1 + paramInt4)] / (Dlamc3.dlamc3(paramArrayOfDouble7[(i - 1 + paramInt10)], d5) + d2) / (paramArrayOfDouble7[(i - 1 + paramInt10)] + d3));
        i += 1;
      }
      d7 = Dnrm2.dnrm2(paramInt2, paramArrayOfDouble8, paramInt11, 1);
      paramArrayOfDouble8[(m + i2 - 1 + paramInt11)] = (Ddot.ddot(paramInt2, paramArrayOfDouble8, paramInt11, 1, paramArrayOfDouble3, paramInt5, 1) / d7);
      paramArrayOfDouble8[(i1 + i2 - 1 + paramInt11)] = (Ddot.ddot(paramInt2, paramArrayOfDouble8, paramInt11, 1, paramArrayOfDouble4, paramInt6, 1) / d7);
      if ((paramInt1 != 1 ? 0 : 1) != 0) {
        paramArrayOfDouble6[(i2 - 1 + (2 - 1) * paramInt9 + paramInt8)] = d7;
      }
      i2 += 1;
    }
    Dcopy.dcopy(paramInt2, paramArrayOfDouble8, k - 1 + paramInt11, 1, paramArrayOfDouble3, paramInt5, 1);
    Dcopy.dcopy(paramInt2, paramArrayOfDouble8, n - 1 + paramInt11, 1, paramArrayOfDouble4, paramInt6, 1);
  }
  
  private static void dlasd4_adapter(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double paramDouble, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, intW paramintW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble4[paramInt6]);
    Dlasd4.dlasd4(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramDouble, localdoubleW, paramArrayOfDouble5, paramInt7, paramintW);
    paramArrayOfDouble4[paramInt6] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasd8.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */