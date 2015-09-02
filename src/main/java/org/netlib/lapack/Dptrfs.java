package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dptrfs
{
  public static void dptrfs(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, int paramInt8, double[] paramArrayOfDouble6, int paramInt9, int paramInt10, double[] paramArrayOfDouble7, int paramInt11, double[] paramArrayOfDouble8, int paramInt12, double[] paramArrayOfDouble9, int paramInt13, intW paramintW)
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
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -8;
    } else if ((paramInt10 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -10;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPTRFS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      m = 1;
      for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
      {
        paramArrayOfDouble7[(m - 1 + paramInt11)] = 0.0D;
        paramArrayOfDouble8[(m - 1 + paramInt12)] = 0.0D;
        m += 1;
      }
      return;
    }
    n = 4;
    d4 = Dlamch.dlamch("Epsilon");
    d10 = Dlamch.dlamch("Safe minimum");
    d8 = n * d10;
    d9 = d8 / d4;
    m = 1;
    for (int i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
    {
      i = 1;
      d6 = 3.0D;
      for (;;)
      {
        if ((paramInt1 != 1 ? 0 : 1) != 0)
        {
          d1 = paramArrayOfDouble5[(1 - 1 + (m - 1) * paramInt8 + paramInt7)];
          d3 = paramArrayOfDouble1[(1 - 1 + paramInt3)] * paramArrayOfDouble6[(1 - 1 + (m - 1) * paramInt10 + paramInt9)];
          paramArrayOfDouble9[(paramInt1 + 1 - 1 + paramInt13)] = (d1 - d3);
          paramArrayOfDouble9[(1 - 1 + paramInt13)] = (Math.abs(d1) + Math.abs(d3));
        }
        else
        {
          d1 = paramArrayOfDouble5[(1 - 1 + (m - 1) * paramInt8 + paramInt7)];
          d3 = paramArrayOfDouble1[(1 - 1 + paramInt3)] * paramArrayOfDouble6[(1 - 1 + (m - 1) * paramInt10 + paramInt9)];
          d5 = paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble6[(2 - 1 + (m - 1) * paramInt10 + paramInt9)];
          paramArrayOfDouble9[(paramInt1 + 1 - 1 + paramInt13)] = (d1 - d3 - d5);
          paramArrayOfDouble9[(1 - 1 + paramInt13)] = (Math.abs(d1) + Math.abs(d3) + Math.abs(d5));
          j = 2;
          for (i2 = paramInt1 - 1 - 2 + 1; i2 > 0; i2--)
          {
            d1 = paramArrayOfDouble5[(j - 1 + (m - 1) * paramInt8 + paramInt7)];
            d2 = paramArrayOfDouble2[(j - 1 - 1 + paramInt4)] * paramArrayOfDouble6[(j - 1 - 1 + (m - 1) * paramInt10 + paramInt9)];
            d3 = paramArrayOfDouble1[(j - 1 + paramInt3)] * paramArrayOfDouble6[(j - 1 + (m - 1) * paramInt10 + paramInt9)];
            d5 = paramArrayOfDouble2[(j - 1 + paramInt4)] * paramArrayOfDouble6[(j + 1 - 1 + (m - 1) * paramInt10 + paramInt9)];
            paramArrayOfDouble9[(paramInt1 + j - 1 + paramInt13)] = (d1 - d2 - d3 - d5);
            paramArrayOfDouble9[(j - 1 + paramInt13)] = (Math.abs(d1) + Math.abs(d2) + Math.abs(d3) + Math.abs(d5));
            j += 1;
          }
          d1 = paramArrayOfDouble5[(paramInt1 - 1 + (m - 1) * paramInt8 + paramInt7)];
          d2 = paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfDouble6[(paramInt1 - 1 - 1 + (m - 1) * paramInt10 + paramInt9)];
          d3 = paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] * paramArrayOfDouble6[(paramInt1 - 1 + (m - 1) * paramInt10 + paramInt9)];
          paramArrayOfDouble9[(paramInt1 + paramInt1 - 1 + paramInt13)] = (d1 - d2 - d3);
          paramArrayOfDouble9[(paramInt1 - 1 + paramInt13)] = (Math.abs(d1) + Math.abs(d2) + Math.abs(d3));
        }
        d7 = 0.0D;
        j = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          if ((paramArrayOfDouble9[(j - 1 + paramInt13)] <= d9 ? 0 : 1) != 0) {
            d7 = Math.max(d7, Math.abs(paramArrayOfDouble9[(paramInt1 + j - 1 + paramInt13)]) / paramArrayOfDouble9[(j - 1 + paramInt13)]);
          } else {
            d7 = Math.max(d7, (Math.abs(paramArrayOfDouble9[(paramInt1 + j - 1 + paramInt13)]) + d8) / (paramArrayOfDouble9[(j - 1 + paramInt13)] + d8));
          }
          j += 1;
        }
        paramArrayOfDouble8[(m - 1 + paramInt12)] = d7;
        if ((paramArrayOfDouble8[(m - 1 + paramInt12)] <= d4 ? 0 : 1) != 0) {}
        if (((2.0D * paramArrayOfDouble8[(m - 1 + paramInt12)] > d6 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((i > 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          break;
        }
        Dpttrs.dpttrs(paramInt1, 1, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramArrayOfDouble9, paramInt1 + 1 - 1 + paramInt13, paramInt1, paramintW);
        Daxpy.daxpy(paramInt1, 1.0D, paramArrayOfDouble9, paramInt1 + 1 - 1 + paramInt13, 1, paramArrayOfDouble6, 1 - 1 + (m - 1) * paramInt10 + paramInt9, 1);
        d6 = paramArrayOfDouble8[(m - 1 + paramInt12)];
        i += 1;
      }
      j = 1;
      for (int i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        if ((paramArrayOfDouble9[(j - 1 + paramInt13)] <= d9 ? 0 : 1) != 0) {
          paramArrayOfDouble9[(j - 1 + paramInt13)] = (Math.abs(paramArrayOfDouble9[(paramInt1 + j - 1 + paramInt13)]) + n * d4 * paramArrayOfDouble9[(j - 1 + paramInt13)]);
        } else {
          paramArrayOfDouble9[(j - 1 + paramInt13)] = (Math.abs(paramArrayOfDouble9[(paramInt1 + j - 1 + paramInt13)]) + n * d4 * paramArrayOfDouble9[(j - 1 + paramInt13)] + d8);
        }
        j += 1;
      }
      k = Idamax.idamax(paramInt1, paramArrayOfDouble9, paramInt13, 1);
      paramArrayOfDouble7[(m - 1 + paramInt11)] = paramArrayOfDouble9[(k - 1 + paramInt13)];
      paramArrayOfDouble9[(1 - 1 + paramInt13)] = 1.0D;
      j = 2;
      for (i2 = paramInt1 - 2 + 1; i2 > 0; i2--)
      {
        paramArrayOfDouble9[(j - 1 + paramInt13)] = (1.0D + paramArrayOfDouble9[(j - 1 - 1 + paramInt13)] * Math.abs(paramArrayOfDouble4[(j - 1 - 1 + paramInt6)]));
        j += 1;
      }
      paramArrayOfDouble9[(paramInt1 - 1 + paramInt13)] /= paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)];
      j = paramInt1 - 1;
      for (i2 = (1 - (paramInt1 - 1) + -1) / -1; i2 > 0; i2--)
      {
        paramArrayOfDouble9[(j - 1 + paramInt13)] = (paramArrayOfDouble9[(j - 1 + paramInt13)] / paramArrayOfDouble3[(j - 1 + paramInt5)] + paramArrayOfDouble9[(j + 1 - 1 + paramInt13)] * Math.abs(paramArrayOfDouble4[(j - 1 + paramInt6)]));
        j += -1;
      }
      k = Idamax.idamax(paramInt1, paramArrayOfDouble9, paramInt13, 1);
      paramArrayOfDouble7[(m - 1 + paramInt11)] *= Math.abs(paramArrayOfDouble9[(k - 1 + paramInt13)]);
      d6 = 0.0D;
      j = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        d6 = Math.max(d6, Math.abs(paramArrayOfDouble6[(j - 1 + (m - 1) * paramInt10 + paramInt9)]));
        j += 1;
      }
      if ((d6 == 0.0D ? 0 : 1) != 0) {
        paramArrayOfDouble7[(m - 1 + paramInt11)] /= d6;
      }
      m += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dptrfs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */