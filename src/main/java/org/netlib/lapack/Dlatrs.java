package org.netlib.lapack;

import org.netlib.blas.Dasum;
import org.netlib.blas.Daxpy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dtrsv;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlatrs
{
  public static void dlatrs(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, doubleW paramdoubleW, double[] paramArrayOfDouble3, int paramInt5, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
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
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    double d13 = 0.0D;
    paramintW.val = 0;
    bool3 = Lsame.lsame(paramString1, "U");
    bool1 = Lsame.lsame(paramString2, "N");
    bool2 = Lsame.lsame(paramString3, "N");
    if ((((bool3 ^ true)) && ((Lsame.lsame(paramString1, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((((bool1 ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0) {
        paramintW.val = -2;
      } else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString3, "U") ^ true)) ? 1 : 0) != 0) {
        paramintW.val = -3;
      } else if ((((Lsame.lsame(paramString4, "Y") ^ true)) && ((Lsame.lsame(paramString4, "N") ^ true)) ? 1 : 0) != 0) {
        paramintW.val = -4;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -5;
      } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -7;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLATRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    d4 = Dlamch.dlamch("Safe minimum") / Dlamch.dlamch("Precision");
    d1 = 1.0D / d4;
    paramdoubleW.val = 1.0D;
    int i2;
    if (Lsame.lsame(paramString4, "N")) {
      if (bool3)
      {
        k = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble3[(k - 1 + paramInt5)] = Dasum.dasum(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1);
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble3[(k - 1 + paramInt5)] = Dasum.dasum(paramInt1 - k, paramArrayOfDouble1, k + 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1);
          k += 1;
        }
        paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)] = 0.0D;
      }
    }
    j = Idamax.idamax(paramInt1, paramArrayOfDouble3, paramInt5, 1);
    d8 = paramArrayOfDouble3[(j - 1 + paramInt5)];
    if ((d8 > d1 ? 0 : 1) != 0)
    {
      d9 = 1.0D;
    }
    else
    {
      d9 = 1.0D / (d4 * d8);
      Dscal.dscal(paramInt1, d9, paramArrayOfDouble3, paramInt5, 1);
    }
    k = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt4, 1);
    d13 = Math.abs(paramArrayOfDouble2[(k - 1 + paramInt4)]);
    d11 = d13;
    if (bool1)
    {
      if (bool3)
      {
        m = paramInt1;
        i1 = 1;
        n = -1;
      }
      else
      {
        m = 1;
        i1 = paramInt1;
        n = 1;
      }
      if ((d9 == 1.0D ? 0 : 1) != 0)
      {
        d2 = 0.0D;
      }
      else if (bool2)
      {
        d2 = 1.0D / Math.max(d11, d4);
        d11 = d2;
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          if ((d2 > d4 ? 0 : 1) != 0) {
            break;
          }
          d6 = Math.abs(paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]);
          d11 = Math.min(d11, Math.min(1.0D, d6) * d2);
          if ((d6 + paramArrayOfDouble3[(k - 1 + paramInt5)] < d4 ? 0 : 1) != 0) {
            d2 *= d6 / (d6 + paramArrayOfDouble3[(k - 1 + paramInt5)]);
          } else {
            d2 = 0.0D;
          }
          k += n;
        }
        d2 = d11;
      }
      else
      {
        d2 = Math.min(1.0D, 1.0D / Math.max(d11, d4));
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          if ((d2 > d4 ? 0 : 1) != 0) {
            break;
          }
          d2 *= 1.0D / (1.0D + paramArrayOfDouble3[(k - 1 + paramInt5)]);
          k += n;
        }
      }
    }
    else
    {
      if (bool3)
      {
        m = 1;
        i1 = paramInt1;
        n = 1;
      }
      else
      {
        m = paramInt1;
        i1 = 1;
        n = -1;
      }
      if ((d9 == 1.0D ? 0 : 1) != 0)
      {
        d2 = 0.0D;
      }
      else if (bool2)
      {
        d2 = 1.0D / Math.max(d11, d4);
        d11 = d2;
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          if ((d2 > d4 ? 0 : 1) != 0) {
            break;
          }
          d12 = 1.0D + paramArrayOfDouble3[(k - 1 + paramInt5)];
          d2 = Math.min(d2, d11 / d12);
          d6 = Math.abs(paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)]);
          if ((d12 <= d6 ? 0 : 1) != 0) {
            d11 *= d6 / d12;
          }
          k += n;
        }
        d2 = Math.min(d2, d11);
      }
      else
      {
        d2 = Math.min(1.0D, 1.0D / Math.max(d11, d4));
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          if ((d2 > d4 ? 0 : 1) != 0) {
            break;
          }
          d12 = 1.0D + paramArrayOfDouble3[(k - 1 + paramInt5)];
          d2 /= d12;
          k += n;
        }
      }
    }
    if ((d2 * d9 <= d4 ? 0 : 1) != 0)
    {
      Dtrsv.dtrsv(paramString1, paramString2, paramString3, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, 1);
    }
    else
    {
      if ((d13 <= d1 ? 0 : 1) != 0)
      {
        paramdoubleW.val = (d1 / d13);
        Dscal.dscal(paramInt1, paramdoubleW.val, paramArrayOfDouble2, paramInt4, 1);
        d13 = d1;
      }
      int i3;
      if (bool1)
      {
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          d12 = Math.abs(paramArrayOfDouble2[(k - 1 + paramInt4)]);
          if (bool2)
          {
            d7 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)] * d9;
          }
          else
          {
            d7 = d9;
            if ((d9 != 1.0D ? 0 : 1) != 0) {
              break label1791;
            }
          }
          d6 = Math.abs(d7);
          if ((d6 <= d4 ? 0 : 1) != 0)
          {
            if ((d6 >= 1.0D ? 0 : 1) != 0) {
              if ((d12 <= d6 * d1 ? 0 : 1) != 0)
              {
                d3 = 1.0D / d12;
                Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt4, 1);
                paramdoubleW.val *= d3;
                d13 *= d3;
              }
            }
            paramArrayOfDouble2[(k - 1 + paramInt4)] /= d7;
            d12 = Math.abs(paramArrayOfDouble2[(k - 1 + paramInt4)]);
          }
          else if ((d6 <= 0.0D ? 0 : 1) != 0)
          {
            if ((d12 <= d6 * d1 ? 0 : 1) != 0)
            {
              d3 = d6 * d1 / d12;
              if ((paramArrayOfDouble3[(k - 1 + paramInt5)] <= 1.0D ? 0 : 1) != 0) {
                d3 /= paramArrayOfDouble3[(k - 1 + paramInt5)];
              }
              Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt4, 1);
              paramdoubleW.val *= d3;
              d13 *= d3;
            }
            paramArrayOfDouble2[(k - 1 + paramInt4)] /= d7;
            d12 = Math.abs(paramArrayOfDouble2[(k - 1 + paramInt4)]);
          }
          else
          {
            i = 1;
            for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
            {
              paramArrayOfDouble2[(i - 1 + paramInt4)] = 0.0D;
              i += 1;
            }
            paramArrayOfDouble2[(k - 1 + paramInt4)] = 1.0D;
            d12 = 1.0D;
            paramdoubleW.val = 0.0D;
            d13 = 0.0D;
          }
          label1791:
          if ((d12 <= 1.0D ? 0 : 1) != 0)
          {
            d3 = 1.0D / d12;
            if ((paramArrayOfDouble3[(k - 1 + paramInt5)] <= (d1 - d13) * d3 ? 0 : 1) != 0)
            {
              d3 *= 0.5D;
              Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt4, 1);
              paramdoubleW.val *= d3;
            }
          }
          else if ((d12 * paramArrayOfDouble3[(k - 1 + paramInt5)] <= d1 - d13 ? 0 : 1) != 0)
          {
            Dscal.dscal(paramInt1, 0.5D, paramArrayOfDouble2, paramInt4, 1);
            paramdoubleW.val *= 0.5D;
          }
          if (bool3)
          {
            if ((k <= 1 ? 0 : 1) != 0)
            {
              Daxpy.daxpy(k - 1, -(paramArrayOfDouble2[(k - 1 + paramInt4)] * d9), paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble2, paramInt4, 1);
              i = Idamax.idamax(k - 1, paramArrayOfDouble2, paramInt4, 1);
              d13 = Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]);
            }
          }
          else if ((k >= paramInt1 ? 0 : 1) != 0)
          {
            Daxpy.daxpy(paramInt1 - k, -(paramArrayOfDouble2[(k - 1 + paramInt4)] * d9), paramArrayOfDouble1, k + 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble2, k + 1 - 1 + paramInt4, 1);
            i = k + Idamax.idamax(paramInt1 - k, paramArrayOfDouble2, k + 1 - 1 + paramInt4, 1);
            d13 = Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]);
          }
          k += n;
        }
      }
      else
      {
        k = m;
        for (i2 = (i1 - m + n) / n; i2 > 0; i2--)
        {
          d12 = Math.abs(paramArrayOfDouble2[(k - 1 + paramInt4)]);
          d10 = d9;
          d3 = 1.0D / Math.max(d13, 1.0D);
          if ((paramArrayOfDouble3[(k - 1 + paramInt5)] <= (d1 - d12) * d3 ? 0 : 1) != 0)
          {
            d3 *= 0.5D;
            if (bool2) {
              d7 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)] * d9;
            } else {
              d7 = d9;
            }
            d6 = Math.abs(d7);
            if ((d6 <= 1.0D ? 0 : 1) != 0)
            {
              d3 = Math.min(1.0D, d3 * d6);
              d10 /= d7;
            }
            if ((d3 >= 1.0D ? 0 : 1) != 0)
            {
              Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt4, 1);
              paramdoubleW.val *= d3;
              d13 *= d3;
            }
          }
          d5 = 0.0D;
          if ((d10 != 1.0D ? 0 : 1) != 0)
          {
            if (bool3) {
              d5 = Ddot.ddot(k - 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble2, paramInt4, 1);
            } else if ((k >= paramInt1 ? 0 : 1) != 0) {
              d5 = Ddot.ddot(paramInt1 - k, paramArrayOfDouble1, k + 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble2, k + 1 - 1 + paramInt4, 1);
            }
          }
          else if (bool3)
          {
            i = 1;
            for (i3 = k - 1 - 1 + 1; i3 > 0; i3--)
            {
              d5 += paramArrayOfDouble1[(i - 1 + (k - 1) * paramInt3 + paramInt2)] * d10 * paramArrayOfDouble2[(i - 1 + paramInt4)];
              i += 1;
            }
          }
          else if ((k >= paramInt1 ? 0 : 1) != 0)
          {
            i = k + 1;
            i3 = paramInt1 - (k + 1) + 1;
            for (;;)
            {
              d5 += paramArrayOfDouble1[(i - 1 + (k - 1) * paramInt3 + paramInt2)] * d10 * paramArrayOfDouble2[(i - 1 + paramInt4)];
              i += 1;
              i3--;
              if (i3 <= 0) {
                break;
              }
            }
          }
          if ((d10 != d9 ? 0 : 1) != 0)
          {
            paramArrayOfDouble2[(k - 1 + paramInt4)] -= d5;
            d12 = Math.abs(paramArrayOfDouble2[(k - 1 + paramInt4)]);
            if (bool2)
            {
              d7 = paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt3 + paramInt2)] * d9;
            }
            else
            {
              d7 = d9;
              if ((d9 != 1.0D ? 0 : 1) != 0) {
                break label3041;
              }
            }
            d6 = Math.abs(d7);
            if ((d6 <= d4 ? 0 : 1) != 0)
            {
              if ((d6 >= 1.0D ? 0 : 1) != 0) {
                if ((d12 <= d6 * d1 ? 0 : 1) != 0)
                {
                  d3 = 1.0D / d12;
                  Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt4, 1);
                  paramdoubleW.val *= d3;
                  d13 *= d3;
                }
              }
              paramArrayOfDouble2[(k - 1 + paramInt4)] /= d7;
            }
            else if ((d6 <= 0.0D ? 0 : 1) != 0)
            {
              if ((d12 <= d6 * d1 ? 0 : 1) != 0)
              {
                d3 = d6 * d1 / d12;
                Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt4, 1);
                paramdoubleW.val *= d3;
                d13 *= d3;
              }
              paramArrayOfDouble2[(k - 1 + paramInt4)] /= d7;
            }
            else
            {
              i = 1;
              for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
              {
                paramArrayOfDouble2[(i - 1 + paramInt4)] = 0.0D;
                i += 1;
              }
              paramArrayOfDouble2[(k - 1 + paramInt4)] = 1.0D;
              paramdoubleW.val = 0.0D;
              d13 = 0.0D;
            }
          }
          else
          {
            label3041:
            paramArrayOfDouble2[(k - 1 + paramInt4)] = (paramArrayOfDouble2[(k - 1 + paramInt4)] / d7 - d5);
          }
          d13 = Math.max(d13, Math.abs(paramArrayOfDouble2[(k - 1 + paramInt4)]));
          k += n;
        }
      }
      paramdoubleW.val /= d9;
    }
    if ((d9 == 1.0D ? 0 : 1) != 0) {
      Dscal.dscal(paramInt1, 1.0D / d9, paramArrayOfDouble3, paramInt5, 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlatrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */