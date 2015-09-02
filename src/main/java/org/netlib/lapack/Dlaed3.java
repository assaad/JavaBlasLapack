package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Dnrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaed3
{
  public static void dlaed3(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double paramDouble, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int[] paramArrayOfInt1, int paramInt9, int[] paramArrayOfInt2, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, double[] paramArrayOfDouble6, int paramInt12, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    double d = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= paramInt1 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLAED3", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
    {
      paramArrayOfDouble3[(i - 1 + paramInt7)] = (Dlamc3.dlamc3(paramArrayOfDouble3[(i - 1 + paramInt7)], paramArrayOfDouble3[(i - 1 + paramInt7)]) - paramArrayOfDouble3[(i - 1 + paramInt7)]);
      i += 1;
    }
    m = 1;
    for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
    {
      dlaed4_adapter(paramInt1, m, paramArrayOfDouble3, paramInt7, paramArrayOfDouble5, paramInt11, paramArrayOfDouble2, 1 - 1 + (m - 1) * paramInt6 + paramInt5, paramDouble, paramArrayOfDouble1, m - 1 + paramInt4, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        break;
      }
      m += 1;
    }
    if ((paramInt1 != 1 ? 0 : 1) == 0) {
      if ((paramInt1 != 2 ? 0 : 1) != 0)
      {
        m = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          paramArrayOfDouble5[(1 - 1 + paramInt11)] = paramArrayOfDouble2[(1 - 1 + (m - 1) * paramInt6 + paramInt5)];
          paramArrayOfDouble5[(2 - 1 + paramInt11)] = paramArrayOfDouble2[(2 - 1 + (m - 1) * paramInt6 + paramInt5)];
          j = paramArrayOfInt1[(1 - 1 + paramInt9)];
          paramArrayOfDouble2[(1 - 1 + (m - 1) * paramInt6 + paramInt5)] = paramArrayOfDouble5[(j - 1 + paramInt11)];
          j = paramArrayOfInt1[(2 - 1 + paramInt9)];
          paramArrayOfDouble2[(2 - 1 + (m - 1) * paramInt6 + paramInt5)] = paramArrayOfDouble5[(j - 1 + paramInt11)];
          m += 1;
        }
      }
      else
      {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble5, paramInt11, 1, paramArrayOfDouble6, paramInt12, 1);
        Dcopy.dcopy(paramInt1, paramArrayOfDouble2, paramInt5, paramInt6 + 1, paramArrayOfDouble5, paramInt11, 1);
        m = 1;
        int i4;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          i = 1;
          for (i4 = m - 1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfDouble5[(i - 1 + paramInt11)] *= paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] / (paramArrayOfDouble3[(i - 1 + paramInt7)] - paramArrayOfDouble3[(m - 1 + paramInt7)]);
            i += 1;
          }
          i = m + 1;
          for (i4 = paramInt1 - (m + 1) + 1; i4 > 0; i4--)
          {
            paramArrayOfDouble5[(i - 1 + paramInt11)] *= paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] / (paramArrayOfDouble3[(i - 1 + paramInt7)] - paramArrayOfDouble3[(m - 1 + paramInt7)]);
            i += 1;
          }
          m += 1;
        }
        i = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          paramArrayOfDouble5[(i - 1 + paramInt11)] = Util.dsign(Math.sqrt(-paramArrayOfDouble5[(i - 1 + paramInt11)]), paramArrayOfDouble6[(i - 1 + paramInt12)]);
          i += 1;
        }
        m = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          i = 1;
          for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfDouble5[(i - 1 + paramInt11)] /= paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)];
            i += 1;
          }
          d = Dnrm2.dnrm2(paramInt1, paramArrayOfDouble6, paramInt12, 1);
          i = 1;
          for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            j = paramArrayOfInt1[(i - 1 + paramInt9)];
            paramArrayOfDouble2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] = (paramArrayOfDouble6[(j - 1 + paramInt12)] / d);
            i += 1;
          }
          m += 1;
        }
      }
    }
    i1 = paramInt2 - paramInt3;
    n = paramArrayOfInt2[(1 - 1 + paramInt10)] + paramArrayOfInt2[(2 - 1 + paramInt10)];
    i2 = paramArrayOfInt2[(2 - 1 + paramInt10)] + paramArrayOfInt2[(3 - 1 + paramInt10)];
    Dlacpy.dlacpy("A", i2, paramInt1, paramArrayOfDouble2, paramArrayOfInt2[(1 - 1 + paramInt10)] + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble6, paramInt12, i2);
    k = paramInt3 * n + 1;
    if ((i2 == 0 ? 0 : 1) != 0) {
      Dgemm.dgemm("N", "N", i1, paramInt1, i2, 1.0D, paramArrayOfDouble4, k - 1 + paramInt8, i1, paramArrayOfDouble6, paramInt12, i2, 0.0D, paramArrayOfDouble2, paramInt3 + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
    } else {
      Dlaset.dlaset("A", i1, paramInt1, 0.0D, 0.0D, paramArrayOfDouble2, paramInt3 + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
    }
    Dlacpy.dlacpy("A", n, paramInt1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble6, paramInt12, n);
    if ((n == 0 ? 0 : 1) != 0) {
      Dgemm.dgemm("N", "N", paramInt3, paramInt1, n, 1.0D, paramArrayOfDouble4, paramInt8, paramInt3, paramArrayOfDouble6, paramInt12, n, 0.0D, paramArrayOfDouble2, paramInt5, paramInt6);
    } else {
      Dlaset.dlaset("A", paramInt3, paramInt1, 0.0D, 0.0D, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
    }
  }
  
  private static void dlaed4_adapter(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double paramDouble, double[] paramArrayOfDouble4, int paramInt6, intW paramintW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble4[paramInt6]);
    Dlaed4.dlaed4(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramDouble, localdoubleW, paramintW);
    paramArrayOfDouble4[paramInt6] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaed3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */