package org.netlib.lapack;

import org.netlib.blas.Dasum;
import org.netlib.blas.Daxpy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dtpsv;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlatps
{
  public static void dlatps(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, doubleW paramdoubleW, double[] paramArrayOfDouble3, int paramInt4, intW paramintW)
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
    int i2 = 0;
    int i3 = 0;
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
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLATPS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    d4 = Dlamch.dlamch("Safe minimum") / Dlamch.dlamch("Precision");
    d1 = 1.0D / d4;
    paramdoubleW.val = 1.0D;
    int i4;
    if (Lsame.lsame(paramString4, "N")) {
      if (bool3)
      {
        k = 1;
        m = 1;
        for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          paramArrayOfDouble3[(m - 1 + paramInt4)] = Dasum.dasum(m - 1, paramArrayOfDouble1, k - 1 + paramInt2, 1);
          k += m;
          m += 1;
        }
      }
      else
      {
        k = 1;
        m = 1;
        for (i4 = paramInt1 - 1 - 1 + 1; i4 > 0; i4--)
        {
          paramArrayOfDouble3[(m - 1 + paramInt4)] = Dasum.dasum(paramInt1 - m, paramArrayOfDouble1, k + 1 - 1 + paramInt2, 1);
          k = k + paramInt1 - m + 1;
          m += 1;
        }
        paramArrayOfDouble3[(paramInt1 - 1 + paramInt4)] = 0.0D;
      }
    }
    j = Idamax.idamax(paramInt1, paramArrayOfDouble3, paramInt4, 1);
    d8 = paramArrayOfDouble3[(j - 1 + paramInt4)];
    if ((d8 > d1 ? 0 : 1) != 0)
    {
      d9 = 1.0D;
    }
    else
    {
      d9 = 1.0D / (d4 * d8);
      Dscal.dscal(paramInt1, d9, paramArrayOfDouble3, paramInt4, 1);
    }
    m = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt3, 1);
    d13 = Math.abs(paramArrayOfDouble2[(m - 1 + paramInt3)]);
    d11 = d13;
    if (bool1)
    {
      if (bool3)
      {
        n = paramInt1;
        i2 = 1;
        i1 = -1;
      }
      else
      {
        n = 1;
        i2 = paramInt1;
        i1 = 1;
      }
      if ((d9 == 1.0D ? 0 : 1) != 0)
      {
        d2 = 0.0D;
      }
      else if (bool2)
      {
        d2 = 1.0D / Math.max(d11, d4);
        d11 = d2;
        k = n * (n + 1) / 2;
        i3 = paramInt1;
        m = n;
        for (i4 = (i2 - n + i1) / i1; i4 > 0; i4--)
        {
          if ((d2 > d4 ? 0 : 1) != 0) {
            break;
          }
          d6 = Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]);
          d11 = Math.min(d11, Math.min(1.0D, d6) * d2);
          if ((d6 + paramArrayOfDouble3[(m - 1 + paramInt4)] < d4 ? 0 : 1) != 0) {
            d2 *= d6 / (d6 + paramArrayOfDouble3[(m - 1 + paramInt4)]);
          } else {
            d2 = 0.0D;
          }
          k += i1 * i3;
          i3 -= 1;
          m += i1;
        }
        d2 = d11;
      }
      else
      {
        d2 = Math.min(1.0D, 1.0D / Math.max(d11, d4));
        m = n;
        for (i4 = (i2 - n + i1) / i1; i4 > 0; i4--)
        {
          if ((d2 > d4 ? 0 : 1) != 0) {
            break;
          }
          d2 *= 1.0D / (1.0D + paramArrayOfDouble3[(m - 1 + paramInt4)]);
          m += i1;
        }
      }
    }
    else
    {
      if (bool3)
      {
        n = 1;
        i2 = paramInt1;
        i1 = 1;
      }
      else
      {
        n = paramInt1;
        i2 = 1;
        i1 = -1;
      }
      if ((d9 == 1.0D ? 0 : 1) != 0)
      {
        d2 = 0.0D;
      }
      else if (bool2)
      {
        d2 = 1.0D / Math.max(d11, d4);
        d11 = d2;
        k = n * (n + 1) / 2;
        i3 = 1;
        m = n;
        for (i4 = (i2 - n + i1) / i1; i4 > 0; i4--)
        {
          if ((d2 > d4 ? 0 : 1) != 0) {
            break;
          }
          d12 = 1.0D + paramArrayOfDouble3[(m - 1 + paramInt4)];
          d2 = Math.min(d2, d11 / d12);
          d6 = Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]);
          if ((d12 <= d6 ? 0 : 1) != 0) {
            d11 *= d6 / d12;
          }
          i3 += 1;
          k += i1 * i3;
          m += i1;
        }
        d2 = Math.min(d2, d11);
      }
      else
      {
        d2 = Math.min(1.0D, 1.0D / Math.max(d11, d4));
        m = n;
        for (i4 = (i2 - n + i1) / i1; i4 > 0; i4--)
        {
          if ((d2 > d4 ? 0 : 1) != 0) {
            break;
          }
          d12 = 1.0D + paramArrayOfDouble3[(m - 1 + paramInt4)];
          d2 /= d12;
          m += i1;
        }
      }
    }
    if ((d2 * d9 <= d4 ? 0 : 1) != 0)
    {
      Dtpsv.dtpsv(paramString1, paramString2, paramString3, paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, 1);
    }
    else
    {
      if ((d13 <= d1 ? 0 : 1) != 0)
      {
        paramdoubleW.val = (d1 / d13);
        Dscal.dscal(paramInt1, paramdoubleW.val, paramArrayOfDouble2, paramInt3, 1);
        d13 = d1;
      }
      int i5;
      if (bool1)
      {
        k = n * (n + 1) / 2;
        m = n;
        for (i4 = (i2 - n + i1) / i1; i4 > 0; i4--)
        {
          d12 = Math.abs(paramArrayOfDouble2[(m - 1 + paramInt3)]);
          if (bool2)
          {
            d7 = paramArrayOfDouble1[(k - 1 + paramInt2)] * d9;
          }
          else
          {
            d7 = d9;
            if ((d9 != 1.0D ? 0 : 1) != 0) {
              break label1824;
            }
          }
          d6 = Math.abs(d7);
          if ((d6 <= d4 ? 0 : 1) != 0)
          {
            if ((d6 >= 1.0D ? 0 : 1) != 0) {
              if ((d12 <= d6 * d1 ? 0 : 1) != 0)
              {
                d3 = 1.0D / d12;
                Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt3, 1);
                paramdoubleW.val *= d3;
                d13 *= d3;
              }
            }
            paramArrayOfDouble2[(m - 1 + paramInt3)] /= d7;
            d12 = Math.abs(paramArrayOfDouble2[(m - 1 + paramInt3)]);
          }
          else if ((d6 <= 0.0D ? 0 : 1) != 0)
          {
            if ((d12 <= d6 * d1 ? 0 : 1) != 0)
            {
              d3 = d6 * d1 / d12;
              if ((paramArrayOfDouble3[(m - 1 + paramInt4)] <= 1.0D ? 0 : 1) != 0) {
                d3 /= paramArrayOfDouble3[(m - 1 + paramInt4)];
              }
              Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt3, 1);
              paramdoubleW.val *= d3;
              d13 *= d3;
            }
            paramArrayOfDouble2[(m - 1 + paramInt3)] /= d7;
            d12 = Math.abs(paramArrayOfDouble2[(m - 1 + paramInt3)]);
          }
          else
          {
            i = 1;
            for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
            {
              paramArrayOfDouble2[(i - 1 + paramInt3)] = 0.0D;
              i += 1;
            }
            paramArrayOfDouble2[(m - 1 + paramInt3)] = 1.0D;
            d12 = 1.0D;
            paramdoubleW.val = 0.0D;
            d13 = 0.0D;
          }
          label1824:
          if ((d12 <= 1.0D ? 0 : 1) != 0)
          {
            d3 = 1.0D / d12;
            if ((paramArrayOfDouble3[(m - 1 + paramInt4)] <= (d1 - d13) * d3 ? 0 : 1) != 0)
            {
              d3 *= 0.5D;
              Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt3, 1);
              paramdoubleW.val *= d3;
            }
          }
          else if ((d12 * paramArrayOfDouble3[(m - 1 + paramInt4)] <= d1 - d13 ? 0 : 1) != 0)
          {
            Dscal.dscal(paramInt1, 0.5D, paramArrayOfDouble2, paramInt3, 1);
            paramdoubleW.val *= 0.5D;
          }
          if (bool3)
          {
            if ((m <= 1 ? 0 : 1) != 0)
            {
              Daxpy.daxpy(m - 1, -(paramArrayOfDouble2[(m - 1 + paramInt3)] * d9), paramArrayOfDouble1, k - m + 1 - 1 + paramInt2, 1, paramArrayOfDouble2, paramInt3, 1);
              i = Idamax.idamax(m - 1, paramArrayOfDouble2, paramInt3, 1);
              d13 = Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]);
            }
            k -= m;
          }
          else
          {
            if ((m >= paramInt1 ? 0 : 1) != 0)
            {
              Daxpy.daxpy(paramInt1 - m, -(paramArrayOfDouble2[(m - 1 + paramInt3)] * d9), paramArrayOfDouble1, k + 1 - 1 + paramInt2, 1, paramArrayOfDouble2, m + 1 - 1 + paramInt3, 1);
              i = m + Idamax.idamax(paramInt1 - m, paramArrayOfDouble2, m + 1 - 1 + paramInt3, 1);
              d13 = Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]);
            }
            k = k + paramInt1 - m + 1;
          }
          m += i1;
        }
      }
      else
      {
        k = n * (n + 1) / 2;
        i3 = 1;
        m = n;
        for (i4 = (i2 - n + i1) / i1; i4 > 0; i4--)
        {
          d12 = Math.abs(paramArrayOfDouble2[(m - 1 + paramInt3)]);
          d10 = d9;
          d3 = 1.0D / Math.max(d13, 1.0D);
          if ((paramArrayOfDouble3[(m - 1 + paramInt4)] <= (d1 - d12) * d3 ? 0 : 1) != 0)
          {
            d3 *= 0.5D;
            if (bool2) {
              d7 = paramArrayOfDouble1[(k - 1 + paramInt2)] * d9;
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
              Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt3, 1);
              paramdoubleW.val *= d3;
              d13 *= d3;
            }
          }
          d5 = 0.0D;
          if ((d10 != 1.0D ? 0 : 1) != 0)
          {
            if (bool3) {
              d5 = Ddot.ddot(m - 1, paramArrayOfDouble1, k - m + 1 - 1 + paramInt2, 1, paramArrayOfDouble2, paramInt3, 1);
            } else if ((m >= paramInt1 ? 0 : 1) != 0) {
              d5 = Ddot.ddot(paramInt1 - m, paramArrayOfDouble1, k + 1 - 1 + paramInt2, 1, paramArrayOfDouble2, m + 1 - 1 + paramInt3, 1);
            }
          }
          else if (bool3)
          {
            i = 1;
            for (i5 = m - 1 - 1 + 1; i5 > 0; i5--)
            {
              d5 += paramArrayOfDouble1[(k - m + i - 1 + paramInt2)] * d10 * paramArrayOfDouble2[(i - 1 + paramInt3)];
              i += 1;
            }
          }
          else if ((m >= paramInt1 ? 0 : 1) != 0)
          {
            i = 1;
            i5 = paramInt1 - m - 1 + 1;
            for (;;)
            {
              d5 += paramArrayOfDouble1[(k + i - 1 + paramInt2)] * d10 * paramArrayOfDouble2[(m + i - 1 + paramInt3)];
              i += 1;
              i5--;
              if (i5 <= 0) {
                break;
              }
            }
          }
          if ((d10 != d9 ? 0 : 1) != 0)
          {
            paramArrayOfDouble2[(m - 1 + paramInt3)] -= d5;
            d12 = Math.abs(paramArrayOfDouble2[(m - 1 + paramInt3)]);
            if (bool2)
            {
              d7 = paramArrayOfDouble1[(k - 1 + paramInt2)] * d9;
            }
            else
            {
              d7 = d9;
              if ((d9 != 1.0D ? 0 : 1) != 0) {
                break label3064;
              }
            }
            d6 = Math.abs(d7);
            if ((d6 <= d4 ? 0 : 1) != 0)
            {
              if ((d6 >= 1.0D ? 0 : 1) != 0) {
                if ((d12 <= d6 * d1 ? 0 : 1) != 0)
                {
                  d3 = 1.0D / d12;
                  Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt3, 1);
                  paramdoubleW.val *= d3;
                  d13 *= d3;
                }
              }
              paramArrayOfDouble2[(m - 1 + paramInt3)] /= d7;
            }
            else if ((d6 <= 0.0D ? 0 : 1) != 0)
            {
              if ((d12 <= d6 * d1 ? 0 : 1) != 0)
              {
                d3 = d6 * d1 / d12;
                Dscal.dscal(paramInt1, d3, paramArrayOfDouble2, paramInt3, 1);
                paramdoubleW.val *= d3;
                d13 *= d3;
              }
              paramArrayOfDouble2[(m - 1 + paramInt3)] /= d7;
            }
            else
            {
              i = 1;
              for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
              {
                paramArrayOfDouble2[(i - 1 + paramInt3)] = 0.0D;
                i += 1;
              }
              paramArrayOfDouble2[(m - 1 + paramInt3)] = 1.0D;
              paramdoubleW.val = 0.0D;
              d13 = 0.0D;
            }
          }
          else
          {
            label3064:
            paramArrayOfDouble2[(m - 1 + paramInt3)] = (paramArrayOfDouble2[(m - 1 + paramInt3)] / d7 - d5);
          }
          d13 = Math.max(d13, Math.abs(paramArrayOfDouble2[(m - 1 + paramInt3)]));
          i3 += 1;
          k += i1 * i3;
          m += i1;
        }
      }
      paramdoubleW.val /= d9;
    }
    if ((d9 == 1.0D ? 0 : 1) != 0) {
      Dscal.dscal(paramInt1, 1.0D / d9, paramArrayOfDouble3, paramInt4, 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlatps.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */