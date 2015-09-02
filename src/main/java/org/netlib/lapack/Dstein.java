package org.netlib.lapack;

import org.netlib.blas.Dasum;
import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dnrm2;
import org.netlib.blas.Dscal;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dstein
{
  public static void dstein(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, int[] paramArrayOfInt1, int paramInt6, int[] paramArrayOfInt2, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int[] paramArrayOfInt3, int paramInt11, int[] paramArrayOfInt4, int paramInt12, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    intW localintW = new intW(0);
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    doubleW localdoubleW = new doubleW(0.0D);
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    int[] arrayOfInt = new int[4];
    paramintW.val = 0;
    n = 1;
    for (int i13 = paramInt4 - 1 + 1; i13 > 0; i13--)
    {
      paramArrayOfInt4[(n - 1 + paramInt12)] = 0;
      n += 1;
    }
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt4 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt4 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -4;
      }
      else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else
      {
        i7 = 2;
        for (i13 = paramInt4 - 2 + 1; i13 > 0; i13--)
        {
          if ((paramArrayOfInt1[(i7 - 1 + paramInt6)] >= paramArrayOfInt1[(i7 - 1 - 1 + paramInt6)] ? 0 : 1) != 0)
          {
            paramintW.val = -6;
            break;
          }
          if ((paramArrayOfInt1[(i7 - 1 + paramInt6)] != paramArrayOfInt1[(i7 - 1 - 1 + paramInt6)] ? 0 : 1) != 0) {}
          if (((paramArrayOfDouble3[(i7 - 1 + paramInt5)] >= paramArrayOfDouble3[(i7 - 1 - 1 + paramInt5)] ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            paramintW.val = -5;
            break;
          }
          i7 += 1;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSTEIN", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt4 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfDouble4[(1 - 1 + (1 - 1) * paramInt9 + paramInt8)] = 1.0D;
      return;
    }
    d2 = Dlamch.dlamch("Precision");
    n = 1;
    for (i13 = 4 - 1 + 1; i13 > 0; i13--)
    {
      arrayOfInt[(n - 1)] = 1;
      n += 1;
    }
    i1 = 0;
    i2 = i1 + paramInt1;
    i3 = i2 + paramInt1;
    i4 = i3 + paramInt1;
    i5 = i4 + paramInt1;
    i8 = 1;
    i11 = 1;
    for (i13 = paramArrayOfInt1[(paramInt4 - 1 + paramInt6)] - 1 + 1; i13 > 0; i13--)
    {
      if ((i11 != 1 ? 0 : 1) != 0) {
        i = 1;
      } else {
        i = paramArrayOfInt2[(i11 - 1 - 1 + paramInt7)] + 1;
      }
      k = paramArrayOfInt2[(i11 - 1 + paramInt7)];
      j = k - i + 1;
      if ((j != 1 ? 0 : 1) == 0)
      {
        m = i;
        d5 = Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]);
        d5 = Math.max(d5, Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble2[(k - 1 - 1 + paramInt3)]));
        n = i + 1;
        for (i14 = k - 1 - (i + 1) + 1; i14 > 0; i14--)
        {
          d5 = Math.max(d5, Math.abs(paramArrayOfDouble1[(n - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble2[(n - 1 - 1 + paramInt3)]) + Math.abs(paramArrayOfDouble2[(n - 1 + paramInt3)]));
          n += 1;
        }
        d6 = 0.001D * d5;
        d1 = Math.sqrt(0.1D / j);
      }
      i9 = 0;
      i7 = i8;
      for (int i14 = paramInt4 - i8 + 1; i14 > 0; i14--)
      {
        if ((paramArrayOfInt1[(i7 - 1 + paramInt6)] == i11 ? 0 : 1) != 0)
        {
          i8 = i7;
          break;
        }
        i9 += 1;
        d10 = paramArrayOfDouble3[(i7 - 1 + paramInt5)];
        if ((j != 1 ? 0 : 1) != 0)
        {
          paramArrayOfDouble5[(i1 + 1 - 1 + paramInt10)] = 1.0D;
        }
        else
        {
          if ((i9 <= 1 ? 0 : 1) != 0)
          {
            d3 = Math.abs(d2 * d10);
            d7 = 10.0D * d3;
            d9 = d10 - d11;
            if ((d9 >= d7 ? 0 : 1) != 0) {
              d10 = d11 + d7;
            }
          }
          i6 = 0;
          i12 = 0;
          Dlarnv.dlarnv(2, arrayOfInt, 0, j, paramArrayOfDouble5, i1 + 1 - 1 + paramInt10);
          Dcopy.dcopy(j, paramArrayOfDouble1, i - 1 + paramInt2, 1, paramArrayOfDouble5, i4 + 1 - 1 + paramInt10, 1);
          Dcopy.dcopy(j - 1, paramArrayOfDouble2, i - 1 + paramInt3, 1, paramArrayOfDouble5, i2 + 2 - 1 + paramInt10, 1);
          Dcopy.dcopy(j - 1, paramArrayOfDouble2, i - 1 + paramInt3, 1, paramArrayOfDouble5, i3 + 1 - 1 + paramInt10, 1);
          localdoubleW.val = 0.0D;
          Dlagtf.dlagtf(j, paramArrayOfDouble5, i4 + 1 - 1 + paramInt10, d10, paramArrayOfDouble5, i2 + 2 - 1 + paramInt10, paramArrayOfDouble5, i3 + 1 - 1 + paramInt10, localdoubleW.val, paramArrayOfDouble5, i5 + 1 - 1 + paramInt10, paramArrayOfInt3, paramInt11, localintW);
          do
          {
            do
            {
              i6 += 1;
              if ((i6 <= 5 ? 0 : 1) != 0) {
                break;
              }
              d8 = j * d5 * Math.max(d2, Math.abs(paramArrayOfDouble5[(i4 + j - 1 + paramInt10)])) / Dasum.dasum(j, paramArrayOfDouble5, i1 + 1 - 1 + paramInt10, 1);
              Dscal.dscal(j, d8, paramArrayOfDouble5, i1 + 1 - 1 + paramInt10, 1);
              Dlagts.dlagts(-1, j, paramArrayOfDouble5, i4 + 1 - 1 + paramInt10, paramArrayOfDouble5, i2 + 2 - 1 + paramInt10, paramArrayOfDouble5, i3 + 1 - 1 + paramInt10, paramArrayOfDouble5, i5 + 1 - 1 + paramInt10, paramArrayOfInt3, paramInt11, paramArrayOfDouble5, i1 + 1 - 1 + paramInt10, localdoubleW, localintW);
              if ((i9 != 1 ? 0 : 1) == 0)
              {
                if ((Math.abs(d10 - d11) <= d6 ? 0 : 1) != 0) {
                  m = i7;
                }
                if ((m == i7 ? 0 : 1) != 0)
                {
                  n = m;
                  for (i15 = i7 - 1 - m + 1; i15 > 0; i15--)
                  {
                    d12 = -Ddot.ddot(j, paramArrayOfDouble5, i1 + 1 - 1 + paramInt10, 1, paramArrayOfDouble4, i - 1 + (n - 1) * paramInt9 + paramInt8, 1);
                    Daxpy.daxpy(j, d12, paramArrayOfDouble4, i - 1 + (n - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble5, i1 + 1 - 1 + paramInt10, 1);
                    n += 1;
                  }
                }
              }
              i10 = Idamax.idamax(j, paramArrayOfDouble5, i1 + 1 - 1 + paramInt10, 1);
              d4 = Math.abs(paramArrayOfDouble5[(i1 + i10 - 1 + paramInt10)]);
            } while ((d4 >= d1 ? 0 : 1) != 0);
            i12 += 1;
          } while ((i12 >= 2 + 1 ? 0 : 1) != 0);
          break label1613;
          paramintW.val += 1;
          paramArrayOfInt4[(paramintW.val - 1 + paramInt12)] = i7;
          label1613:
          d8 = 1.0D / Dnrm2.dnrm2(j, paramArrayOfDouble5, i1 + 1 - 1 + paramInt10, 1);
          i10 = Idamax.idamax(j, paramArrayOfDouble5, i1 + 1 - 1 + paramInt10, 1);
          if ((paramArrayOfDouble5[(i1 + i10 - 1 + paramInt10)] >= 0.0D ? 0 : 1) != 0) {
            d8 = -d8;
          }
          Dscal.dscal(j, d8, paramArrayOfDouble5, i1 + 1 - 1 + paramInt10, 1);
        }
        n = 1;
        for (int i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
        {
          paramArrayOfDouble4[(n - 1 + (i7 - 1) * paramInt9 + paramInt8)] = 0.0D;
          n += 1;
        }
        n = 1;
        for (i15 = j - 1 + 1; i15 > 0; i15--)
        {
          paramArrayOfDouble4[(i + n - 1 - 1 + (i7 - 1) * paramInt9 + paramInt8)] = paramArrayOfDouble5[(i1 + n - 1 + paramInt10)];
          n += 1;
        }
        d11 = d10;
        i7 += 1;
      }
      i11 += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dstein.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */