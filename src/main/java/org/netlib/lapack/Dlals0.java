package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dnrm2;
import org.netlib.blas.Drot;
import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dlals0
{
  public static void dlals0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double[] paramArrayOfDouble1, int paramInt6, int paramInt7, double[] paramArrayOfDouble2, int paramInt8, int paramInt9, int[] paramArrayOfInt1, int paramInt10, int paramInt11, int[] paramArrayOfInt2, int paramInt12, int paramInt13, double[] paramArrayOfDouble3, int paramInt14, int paramInt15, double[] paramArrayOfDouble4, int paramInt16, double[] paramArrayOfDouble5, int paramInt17, double[] paramArrayOfDouble6, int paramInt18, double[] paramArrayOfDouble7, int paramInt19, int paramInt20, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble8, int paramInt21, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt3 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt4 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt4 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -4;
      }
    }
    m = paramInt2 + paramInt3 + 1;
    if ((paramInt5 >= 1 ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt7 >= m ? 0 : 1) != 0) {
      paramintW.val = -7;
    } else if ((paramInt9 >= m ? 0 : 1) != 0) {
      paramintW.val = -9;
    } else if ((paramInt11 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -11;
    } else if ((paramInt13 >= m ? 0 : 1) != 0) {
      paramintW.val = -13;
    } else if ((paramInt15 >= m ? 0 : 1) != 0) {
      paramintW.val = -15;
    } else if ((paramInt20 >= 1 ? 0 : 1) != 0) {
      paramintW.val = -20;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLALS0", -paramintW.val);
      return;
    }
    k = m + paramInt4;
    n = paramInt2 + 1;
    int i1;
    int i2;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (i1 = paramInt11 - 1 + 1; i1 > 0; i1--)
      {
        Drot.drot(paramInt5, paramArrayOfDouble1, paramArrayOfInt2[(i - 1 + (2 - 1) * paramInt13 + paramInt12)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble1, paramArrayOfInt2[(i - 1 + (1 - 1) * paramInt13 + paramInt12)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3[(i - 1 + (2 - 1) * paramInt15 + paramInt14)], paramArrayOfDouble3[(i - 1 + (1 - 1) * paramInt15 + paramInt14)]);
        i += 1;
      }
      Dcopy.dcopy(paramInt5, paramArrayOfDouble1, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
      i = 2;
      for (i1 = m - 2 + 1; i1 > 0; i1--)
      {
        Dcopy.dcopy(paramInt5, paramArrayOfDouble1, paramArrayOfInt1[(i - 1 + paramInt10)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
        i += 1;
      }
      if ((paramInt20 != 1 ? 0 : 1) != 0)
      {
        Dcopy.dcopy(paramInt5, paramArrayOfDouble2, paramInt8, paramInt9, paramArrayOfDouble1, paramInt6, paramInt7);
        if ((paramArrayOfDouble7[(1 - 1 + paramInt19)] >= 0.0D ? 0 : 1) != 0) {
          Dscal.dscal(paramInt5, -1.0D, paramArrayOfDouble1, paramInt6, paramInt7);
        }
      }
      else
      {
        j = 1;
        for (i1 = paramInt20 - 1 + 1; i1 > 0; i1--)
        {
          d1 = paramArrayOfDouble5[(j - 1 + paramInt17)];
          d3 = paramArrayOfDouble4[(j - 1 + (1 - 1) * paramInt15 + paramInt16)];
          d4 = -paramArrayOfDouble4[(j - 1 + (2 - 1) * paramInt15 + paramInt16)];
          if ((j >= paramInt20 ? 0 : 1) != 0)
          {
            d2 = -paramArrayOfDouble6[(j - 1 + (1 - 1) * paramInt15 + paramInt18)];
            d5 = -paramArrayOfDouble4[(j + 1 - 1 + (2 - 1) * paramInt15 + paramInt16)];
          }
          if ((paramArrayOfDouble7[(j - 1 + paramInt19)] != 0.0D ? 0 : 1) == 0) {}
          if (((paramArrayOfDouble4[(j - 1 + (2 - 1) * paramInt15 + paramInt16)] != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramArrayOfDouble8[(j - 1 + paramInt21)] = 0.0D;
          } else {
            paramArrayOfDouble8[(j - 1 + paramInt21)] = (-(paramArrayOfDouble4[(j - 1 + (2 - 1) * paramInt15 + paramInt16)] * paramArrayOfDouble7[(j - 1 + paramInt19)] / d1 / (paramArrayOfDouble4[(j - 1 + (2 - 1) * paramInt15 + paramInt16)] + d3)));
          }
          i = 1;
          for (i2 = j - 1 - 1 + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfDouble7[(i - 1 + paramInt19)] != 0.0D ? 0 : 1) == 0) {}
            if (((paramArrayOfDouble4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
              paramArrayOfDouble8[(i - 1 + paramInt21)] = 0.0D;
            } else {
              paramArrayOfDouble8[(i - 1 + paramInt21)] = (paramArrayOfDouble4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] * paramArrayOfDouble7[(i - 1 + paramInt19)] / (Dlamc3.dlamc3(paramArrayOfDouble4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)], d4) - d1) / (paramArrayOfDouble4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] + d3));
            }
            i += 1;
          }
          i = j + 1;
          for (i2 = paramInt20 - (j + 1) + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfDouble7[(i - 1 + paramInt19)] != 0.0D ? 0 : 1) == 0) {}
            if (((paramArrayOfDouble4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
              paramArrayOfDouble8[(i - 1 + paramInt21)] = 0.0D;
            } else {
              paramArrayOfDouble8[(i - 1 + paramInt21)] = (paramArrayOfDouble4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] * paramArrayOfDouble7[(i - 1 + paramInt19)] / (Dlamc3.dlamc3(paramArrayOfDouble4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)], d5) + d2) / (paramArrayOfDouble4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] + d3));
            }
            i += 1;
          }
          paramArrayOfDouble8[(1 - 1 + paramInt21)] = -1.0D;
          d6 = Dnrm2.dnrm2(paramInt20, paramArrayOfDouble8, paramInt21, 1);
          Dgemv.dgemv("T", paramInt20, paramInt5, 1.0D, paramArrayOfDouble2, paramInt8, paramInt9, paramArrayOfDouble8, paramInt21, 1, 0.0D, paramArrayOfDouble1, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          Dlascl.dlascl("G", 0, 0, d6, 1.0D, 1, paramInt5, paramArrayOfDouble1, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramintW);
          j += 1;
        }
      }
      if ((paramInt20 >= Math.max(k, m) ? 0 : 1) != 0) {
        Dlacpy.dlacpy("A", m - paramInt20, paramInt5, paramArrayOfDouble2, paramInt20 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1, paramInt20 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
    }
    else
    {
      if ((paramInt20 != 1 ? 0 : 1) != 0)
      {
        Dcopy.dcopy(paramInt5, paramArrayOfDouble1, paramInt6, paramInt7, paramArrayOfDouble2, paramInt8, paramInt9);
      }
      else
      {
        j = 1;
        for (i1 = paramInt20 - 1 + 1; i1 > 0; i1--)
        {
          d4 = paramArrayOfDouble4[(j - 1 + (2 - 1) * paramInt15 + paramInt16)];
          if ((paramArrayOfDouble7[(j - 1 + paramInt19)] != 0.0D ? 0 : 1) != 0) {
            paramArrayOfDouble8[(j - 1 + paramInt21)] = 0.0D;
          } else {
            paramArrayOfDouble8[(j - 1 + paramInt21)] = (-(paramArrayOfDouble7[(j - 1 + paramInt19)] / paramArrayOfDouble5[(j - 1 + paramInt17)] / (d4 + paramArrayOfDouble4[(j - 1 + (1 - 1) * paramInt15 + paramInt16)]) / paramArrayOfDouble6[(j - 1 + (2 - 1) * paramInt15 + paramInt18)]));
          }
          i = 1;
          for (i2 = j - 1 - 1 + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfDouble7[(j - 1 + paramInt19)] != 0.0D ? 0 : 1) != 0) {
              paramArrayOfDouble8[(i - 1 + paramInt21)] = 0.0D;
            } else {
              paramArrayOfDouble8[(i - 1 + paramInt21)] = (paramArrayOfDouble7[(j - 1 + paramInt19)] / (Dlamc3.dlamc3(d4, -paramArrayOfDouble4[(i + 1 - 1 + (2 - 1) * paramInt15 + paramInt16)]) - paramArrayOfDouble6[(i - 1 + (1 - 1) * paramInt15 + paramInt18)]) / (d4 + paramArrayOfDouble4[(i - 1 + (1 - 1) * paramInt15 + paramInt16)]) / paramArrayOfDouble6[(i - 1 + (2 - 1) * paramInt15 + paramInt18)]);
            }
            i += 1;
          }
          i = j + 1;
          for (i2 = paramInt20 - (j + 1) + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfDouble7[(j - 1 + paramInt19)] != 0.0D ? 0 : 1) != 0) {
              paramArrayOfDouble8[(i - 1 + paramInt21)] = 0.0D;
            } else {
              paramArrayOfDouble8[(i - 1 + paramInt21)] = (paramArrayOfDouble7[(j - 1 + paramInt19)] / (Dlamc3.dlamc3(d4, -paramArrayOfDouble4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)]) - paramArrayOfDouble5[(i - 1 + paramInt17)]) / (d4 + paramArrayOfDouble4[(i - 1 + (1 - 1) * paramInt15 + paramInt16)]) / paramArrayOfDouble6[(i - 1 + (2 - 1) * paramInt15 + paramInt18)]);
            }
            i += 1;
          }
          Dgemv.dgemv("T", paramInt20, paramInt5, 1.0D, paramArrayOfDouble1, paramInt6, paramInt7, paramArrayOfDouble8, paramInt21, 1, 0.0D, paramArrayOfDouble2, j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
          j += 1;
        }
      }
      if ((paramInt4 != 1 ? 0 : 1) != 0)
      {
        Dcopy.dcopy(paramInt5, paramArrayOfDouble1, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
        Drot.drot(paramInt5, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramDouble1, paramDouble2);
      }
      if ((paramInt20 >= Math.max(k, m) ? 0 : 1) != 0) {
        Dlacpy.dlacpy("A", m - paramInt20, paramInt5, paramArrayOfDouble1, paramInt20 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, paramInt20 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
      }
      Dcopy.dcopy(paramInt5, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      if ((paramInt4 != 1 ? 0 : 1) != 0) {
        Dcopy.dcopy(paramInt5, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
      i = 2;
      for (i1 = m - 2 + 1; i1 > 0; i1--)
      {
        Dcopy.dcopy(paramInt5, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble1, paramArrayOfInt1[(i - 1 + paramInt10)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        i += 1;
      }
      i = paramInt11;
      for (i1 = (1 - paramInt11 + -1) / -1; i1 > 0; i1--)
      {
        Drot.drot(paramInt5, paramArrayOfDouble1, paramArrayOfInt2[(i - 1 + (2 - 1) * paramInt13 + paramInt12)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble1, paramArrayOfInt2[(i - 1 + (1 - 1) * paramInt13 + paramInt12)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3[(i - 1 + (2 - 1) * paramInt15 + paramInt14)], -paramArrayOfDouble3[(i - 1 + (1 - 1) * paramInt15 + paramInt14)]);
        i += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlals0.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */