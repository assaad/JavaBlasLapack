package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dsterf
{
  public static void dsterf(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
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
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d12 = 0.0D;
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
      Xerbla.xerbla("DSTERF", -paramintW.val);
      return;
    }
    if ((paramInt1 > 1 ? 0 : 1) != 0) {
      return;
    }
    d5 = Dlamch.dlamch("E");
    d6 = Math.pow(d5, 2);
    d15 = Dlamch.dlamch("S");
    d14 = 1.0D / d15;
    d17 = Math.sqrt(d14) / 3.0D;
    d18 = Math.sqrt(d15) / d6;
    i5 = paramInt1 * 30;
    d16 = 0.0D;
    k = 0;
    n = 1;
    while ((n <= paramInt1 ? 0 : 1) == 0)
    {
      if ((n <= 1 ? 0 : 1) != 0) {
        paramArrayOfDouble2[(n - 1 - 1 + paramInt3)] = 0.0D;
      }
      i4 = n;
      for (int i6 = paramInt1 - 1 - n + 1; i6 > 0; i6--)
      {
        if ((Math.abs(paramArrayOfDouble2[(i4 - 1 + paramInt3)]) > Math.sqrt(Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt2)])) * Math.sqrt(Math.abs(paramArrayOfDouble1[(i4 + 1 - 1 + paramInt2)])) * d5 ? 0 : 1) != 0)
        {
          paramArrayOfDouble2[(i4 - 1 + paramInt3)] = 0.0D;
          break;
        }
        i4 += 1;
      }
      i4 = paramInt1;
      m = n;
      i3 = m;
      i1 = i4;
      i2 = i1;
      n = i4 + 1;
      if ((i1 != m ? 0 : 1) == 0)
      {
        d2 = Dlanst.dlanst("I", i1 - m + 1, paramArrayOfDouble1, m - 1 + paramInt2, paramArrayOfDouble2, m - 1 + paramInt3);
        j = 0;
        if ((d2 <= d17 ? 0 : 1) != 0)
        {
          j = 1;
          Dlascl.dlascl("G", 0, 0, d2, d17, i1 - m + 1, 1, paramArrayOfDouble1, m - 1 + paramInt2, paramInt1, paramintW);
          Dlascl.dlascl("G", 0, 0, d2, d17, i1 - m, 1, paramArrayOfDouble2, m - 1 + paramInt3, paramInt1, paramintW);
        }
        else if ((d2 >= d18 ? 0 : 1) != 0)
        {
          j = 2;
          Dlascl.dlascl("G", 0, 0, d2, d18, i1 - m + 1, 1, paramArrayOfDouble1, m - 1 + paramInt2, paramInt1, paramintW);
          Dlascl.dlascl("G", 0, 0, d2, d18, i1 - m, 1, paramArrayOfDouble2, m - 1 + paramInt3, paramInt1, paramintW);
        }
        i = m;
        for (i6 = i1 - 1 - m + 1; i6 > 0; i6--)
        {
          paramArrayOfDouble2[(i - 1 + paramInt3)] = Math.pow(paramArrayOfDouble2[(i - 1 + paramInt3)], 2);
          i += 1;
        }
        if ((Math.abs(paramArrayOfDouble1[(i1 - 1 + paramInt2)]) >= Math.abs(paramArrayOfDouble1[(m - 1 + paramInt2)]) ? 0 : 1) != 0)
        {
          i1 = i3;
          m = i2;
        }
        if ((i1 < m ? 0 : 1) != 0)
        {
          do
          {
            for (;;)
            {
              if ((m == i1 ? 0 : 1) != 0)
              {
                i4 = m;
                for (i6 = i1 - 1 - m + 1; i6 > 0; i6--)
                {
                  if ((Math.abs(paramArrayOfDouble2[(i4 - 1 + paramInt3)]) > d6 * Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt2)] * paramArrayOfDouble1[(i4 + 1 - 1 + paramInt2)]) ? 0 : 1) != 0) {
                    break;
                  }
                  i4 += 1;
                }
              }
              i4 = i1;
              if ((i4 >= i1 ? 0 : 1) != 0) {
                paramArrayOfDouble2[(i4 - 1 + paramInt3)] = 0.0D;
              }
              d10 = paramArrayOfDouble1[(m - 1 + paramInt2)];
              if ((i4 != m ? 0 : 1) != 0) {
                break;
              }
              if ((i4 != m + 1 ? 0 : 1) != 0)
              {
                d12 = Math.sqrt(paramArrayOfDouble2[(m - 1 + paramInt3)]);
                Dlae2.dlae2(paramArrayOfDouble1[(m - 1 + paramInt2)], d12, paramArrayOfDouble1[(m + 1 - 1 + paramInt2)], localdoubleW1, localdoubleW2);
                paramArrayOfDouble1[(m - 1 + paramInt2)] = localdoubleW1.val;
                paramArrayOfDouble1[(m + 1 - 1 + paramInt2)] = localdoubleW2.val;
                paramArrayOfDouble2[(m - 1 + paramInt3)] = 0.0D;
                m += 2;
                if ((m > i1 ? 0 : 1) == 0) {
                  break label1998;
                }
              }
              else
              {
                if ((k != i5 ? 0 : 1) != 0) {
                  break label1998;
                }
                k += 1;
                d12 = Math.sqrt(paramArrayOfDouble2[(m - 1 + paramInt3)]);
                d16 = (paramArrayOfDouble1[(m + 1 - 1 + paramInt2)] - d10) / (2.0D * d12);
                d11 = Dlapy2.dlapy2(d16, 1.0D);
                d16 = d10 - d12 / (d16 + Util.dsign(d11, d16));
                d4 = 1.0D;
                d13 = 0.0D;
                d7 = paramArrayOfDouble1[(i4 - 1 + paramInt2)] - d16;
                d10 = d7 * d7;
                i = i4 - 1;
                for (i6 = (m - (i4 - 1) + -1) / -1; i6 > 0; i6--)
                {
                  d3 = paramArrayOfDouble2[(i - 1 + paramInt3)];
                  d11 = d10 + d3;
                  if ((i == i4 - 1 ? 0 : 1) != 0) {
                    paramArrayOfDouble2[(i + 1 - 1 + paramInt3)] = (d13 * d11);
                  }
                  d8 = d4;
                  d4 = d10 / d11;
                  d13 = d3 / d11;
                  d9 = d7;
                  d1 = paramArrayOfDouble1[(i - 1 + paramInt2)];
                  d7 = d4 * (d1 - d16) - d13 * d9;
                  paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] = (d9 + (d1 - d7));
                  if ((d4 == 0.0D ? 0 : 1) != 0) {
                    d10 = d7 * d7 / d4;
                  } else {
                    d10 = d8 * d3;
                  }
                  i += -1;
                }
                paramArrayOfDouble2[(m - 1 + paramInt3)] = (d13 * d10);
                paramArrayOfDouble1[(m - 1 + paramInt2)] = (d16 + d7);
              }
            }
            paramArrayOfDouble1[(m - 1 + paramInt2)] = d10;
            m += 1;
          } while ((m > i1 ? 0 : 1) != 0);
          break label1998;
        }
        else
        {
          for (;;)
          {
            i4 = m;
            i6 = (i1 + 1 - m + -1) / -1;
            while ((Math.abs(paramArrayOfDouble2[(i4 - 1 - 1 + paramInt3)]) > d6 * Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt2)] * paramArrayOfDouble1[(i4 - 1 - 1 + paramInt2)]) ? 0 : 1) == 0)
            {
              i4 += -1;
              i6--;
              if (i6 <= 0) {
                i4 = i1;
              }
            }
            if ((i4 <= i1 ? 0 : 1) != 0) {
              paramArrayOfDouble2[(i4 - 1 - 1 + paramInt3)] = 0.0D;
            }
            d10 = paramArrayOfDouble1[(m - 1 + paramInt2)];
            if ((i4 != m ? 0 : 1) == 0)
            {
              if ((i4 != m - 1 ? 0 : 1) != 0)
              {
                d12 = Math.sqrt(paramArrayOfDouble2[(m - 1 - 1 + paramInt3)]);
                Dlae2.dlae2(paramArrayOfDouble1[(m - 1 + paramInt2)], d12, paramArrayOfDouble1[(m - 1 - 1 + paramInt2)], localdoubleW1, localdoubleW2);
                paramArrayOfDouble1[(m - 1 + paramInt2)] = localdoubleW1.val;
                paramArrayOfDouble1[(m - 1 - 1 + paramInt2)] = localdoubleW2.val;
                paramArrayOfDouble2[(m - 1 - 1 + paramInt3)] = 0.0D;
                m -= 2;
                if ((m < i1 ? 0 : 1) == 0) {
                  break;
                }
              }
              else if ((k != i5 ? 0 : 1) == 0)
              {
                k += 1;
                d12 = Math.sqrt(paramArrayOfDouble2[(m - 1 - 1 + paramInt3)]);
                d16 = (paramArrayOfDouble1[(m - 1 - 1 + paramInt2)] - d10) / (2.0D * d12);
                d11 = Dlapy2.dlapy2(d16, 1.0D);
                d16 = d10 - d12 / (d16 + Util.dsign(d11, d16));
                d4 = 1.0D;
                d13 = 0.0D;
                d7 = paramArrayOfDouble1[(i4 - 1 + paramInt2)] - d16;
                d10 = d7 * d7;
                i = i4;
                for (i6 = m - 1 - i4 + 1; i6 > 0; i6--)
                {
                  d3 = paramArrayOfDouble2[(i - 1 + paramInt3)];
                  d11 = d10 + d3;
                  if ((i == i4 ? 0 : 1) != 0) {
                    paramArrayOfDouble2[(i - 1 - 1 + paramInt3)] = (d13 * d11);
                  }
                  d8 = d4;
                  d4 = d10 / d11;
                  d13 = d3 / d11;
                  d9 = d7;
                  d1 = paramArrayOfDouble1[(i + 1 - 1 + paramInt2)];
                  d7 = d4 * (d1 - d16) - d13 * d9;
                  paramArrayOfDouble1[(i - 1 + paramInt2)] = (d9 + (d1 - d7));
                  if ((d4 == 0.0D ? 0 : 1) != 0) {
                    d10 = d7 * d7 / d4;
                  } else {
                    d10 = d8 * d3;
                  }
                  i += 1;
                }
                paramArrayOfDouble2[(m - 1 - 1 + paramInt3)] = (d13 * d10);
                paramArrayOfDouble1[(m - 1 + paramInt2)] = (d16 + d7);
              }
            }
            else
            {
              paramArrayOfDouble1[(m - 1 + paramInt2)] = d10;
              m -= 1;
              if ((m < i1 ? 0 : 1) == 0) {
                break;
              }
            }
          }
        }
        label1998:
        if ((j != 1 ? 0 : 1) != 0) {
          Dlascl.dlascl("G", 0, 0, d17, d2, i2 - i3 + 1, 1, paramArrayOfDouble1, i3 - 1 + paramInt2, paramInt1, paramintW);
        }
        if ((j != 2 ? 0 : 1) != 0) {
          Dlascl.dlascl("G", 0, 0, d18, d2, i2 - i3 + 1, 1, paramArrayOfDouble1, i3 - 1 + paramInt2, paramInt1, paramintW);
        }
        if ((k >= i5 ? 0 : 1) == 0)
        {
          i = 1;
          for (i6 = paramInt1 - 1 - 1 + 1; i6 > 0; i6--)
          {
            if ((paramArrayOfDouble2[(i - 1 + paramInt3)] == 0.0D ? 0 : 1) != 0) {
              paramintW.val += 1;
            }
            i += 1;
          }
          return;
        }
      }
    }
    Dlasrt.dlasrt("I", paramInt1, paramArrayOfDouble1, paramInt2, paramintW);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsterf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */