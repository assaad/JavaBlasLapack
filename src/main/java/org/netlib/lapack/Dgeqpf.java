package org.netlib.lapack;

import org.netlib.blas.Dnrm2;
import org.netlib.blas.Dswap;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgeqpf
{
  public static void dgeqpf(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, intW paramintW)
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
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEQPF", -paramintW.val);
      return;
    }
    n = Math.min(paramInt1, paramInt2);
    d4 = Math.sqrt(Dlamch.dlamch("Epsilon"));
    j = 1;
    i = 1;
    for (int i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
    {
      if ((paramArrayOfInt[(i - 1 + paramInt5)] == 0 ? 0 : 1) != 0)
      {
        if ((i == j ? 0 : 1) != 0)
        {
          Dswap.dswap(paramInt1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1);
          paramArrayOfInt[(i - 1 + paramInt5)] = paramArrayOfInt[(j - 1 + paramInt5)];
          paramArrayOfInt[(j - 1 + paramInt5)] = i;
        }
        else
        {
          paramArrayOfInt[(i - 1 + paramInt5)] = i;
        }
        j += 1;
      }
      else
      {
        paramArrayOfInt[(i - 1 + paramInt5)] = i;
      }
      i += 1;
    }
    j -= 1;
    if ((j <= 0 ? 0 : 1) != 0)
    {
      m = Math.min(j, paramInt1);
      Dgeqr2.dgeqr2(paramInt1, m, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramintW);
      if ((m >= paramInt2 ? 0 : 1) != 0) {
        Dorm2r.dorm2r("Left", "Transpose", paramInt1, paramInt2 - m, m, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt6, paramArrayOfDouble1, 1 - 1 + (m + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble3, paramInt7, paramintW);
      }
    }
    if ((j >= n ? 0 : 1) != 0)
    {
      i = j + 1;
      for (int i2 = paramInt2 - (j + 1) + 1; i2 > 0; i2--)
      {
        paramArrayOfDouble3[(i - 1 + paramInt7)] = Dnrm2.dnrm2(paramInt1 - j, paramArrayOfDouble1, j + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        paramArrayOfDouble3[(paramInt2 + i - 1 + paramInt7)] = paramArrayOfDouble3[(i - 1 + paramInt7)];
        i += 1;
      }
      i = j + 1;
      for (int i2 = n - (j + 1) + 1; i2 > 0; i2--)
      {
        i1 = i - 1 + Idamax.idamax(paramInt2 - i + 1, paramArrayOfDouble3, i - 1 + paramInt7, 1);
        if ((i1 == i ? 0 : 1) != 0)
        {
          Dswap.dswap(paramInt1, paramArrayOfDouble1, 1 - 1 + (i1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
          j = paramArrayOfInt[(i1 - 1 + paramInt5)];
          paramArrayOfInt[(i1 - 1 + paramInt5)] = paramArrayOfInt[(i - 1 + paramInt5)];
          paramArrayOfInt[(i - 1 + paramInt5)] = j;
          paramArrayOfDouble3[(i1 - 1 + paramInt7)] = paramArrayOfDouble3[(i - 1 + paramInt7)];
          paramArrayOfDouble3[(paramInt2 + i1 - 1 + paramInt7)] = paramArrayOfDouble3[(paramInt2 + i - 1 + paramInt7)];
        }
        if ((i >= paramInt1 ? 0 : 1) != 0) {
          dlarfg_adapter(paramInt1 - i + 1, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, i - 1 + paramInt6);
        } else {
          dlarfg_adapter(1, paramArrayOfDouble1, paramInt1 - 1 + (paramInt1 - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, paramInt1 - 1 + (paramInt1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2, paramInt1 - 1 + paramInt6);
        }
        if ((i >= paramInt2 ? 0 : 1) != 0)
        {
          d1 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0D;
          Dlarf.dlarf("LEFT", paramInt1 - i + 1, paramInt2 - i, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2[(i - 1 + paramInt6)], paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble3, 2 * paramInt2 + 1 - 1 + paramInt7);
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = d1;
        }
        k = i + 1;
        for (int i3 = paramInt2 - (i + 1) + 1; i3 > 0; i3--)
        {
          if ((paramArrayOfDouble3[(k - 1 + paramInt7)] == 0.0D ? 0 : 1) != 0)
          {
            d2 = Math.abs(paramArrayOfDouble1[(i - 1 + (k - 1) * paramInt4 + paramInt3)]) / paramArrayOfDouble3[(k - 1 + paramInt7)];
            d2 = Math.max(0.0D, (1.0D + d2) * (1.0D - d2));
            d3 = d2 * Math.pow(paramArrayOfDouble3[(k - 1 + paramInt7)] / paramArrayOfDouble3[(paramInt2 + k - 1 + paramInt7)], 2);
            if ((d3 > d4 ? 0 : 1) != 0)
            {
              if ((paramInt1 - i <= 0 ? 0 : 1) != 0)
              {
                paramArrayOfDouble3[(k - 1 + paramInt7)] = Dnrm2.dnrm2(paramInt1 - i, paramArrayOfDouble1, i + 1 - 1 + (k - 1) * paramInt4 + paramInt3, 1);
                paramArrayOfDouble3[(paramInt2 + k - 1 + paramInt7)] = paramArrayOfDouble3[(k - 1 + paramInt7)];
              }
              else
              {
                paramArrayOfDouble3[(k - 1 + paramInt7)] = 0.0D;
                paramArrayOfDouble3[(paramInt2 + k - 1 + paramInt7)] = 0.0D;
              }
            }
            else {
              paramArrayOfDouble3[(k - 1 + paramInt7)] *= Math.sqrt(d2);
            }
          }
          k += 1;
        }
        i += 1;
      }
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgeqpf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */