package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlarrf
{
  public static void dlarrf(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, int paramInt5, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, double[] paramArrayOfDouble6, int paramInt9, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, doubleW paramdoubleW, double[] paramArrayOfDouble7, int paramInt10, double[] paramArrayOfDouble8, int paramInt11, double[] paramArrayOfDouble9, int paramInt12, intW paramintW)
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
    double d12 = 0.0D;
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    double d19 = 0.0D;
    double d20 = 0.0D;
    double d21 = 0.0D;
    double d22 = 0.0D;
    double d23 = 0.0D;
    double d24 = 0.0D;
    double d25 = 0.0D;
    paramintW.val = 0;
    d5 = (int)Math.pow(2, 1);
    d4 = Dlamch.dlamch("Precision");
    i5 = 0;
    j = 0;
    k = 1;
    d3 = Math.abs(paramArrayOfDouble4[(paramInt6 - 1 + paramInt7)] - paramArrayOfDouble4[(paramInt5 - 1 + paramInt7)]) + paramArrayOfDouble6[(paramInt6 - 1 + paramInt9)] + paramArrayOfDouble6[(paramInt5 - 1 + paramInt9)];
    d1 = d3 / (paramInt6 - paramInt5);
    d14 = Math.min(paramDouble2, paramDouble3);
    d11 = Math.min(paramArrayOfDouble4[(paramInt5 - 1 + paramInt7)], paramArrayOfDouble4[(paramInt6 - 1 + paramInt7)]) - paramArrayOfDouble6[(paramInt5 - 1 + paramInt9)];
    d21 = Math.max(paramArrayOfDouble4[(paramInt5 - 1 + paramInt7)], paramArrayOfDouble4[(paramInt6 - 1 + paramInt7)]) + paramArrayOfDouble6[(paramInt6 - 1 + paramInt9)];
    d11 -= Math.abs(d11) * 4.0D * d4;
    d21 += Math.abs(d21) * 4.0D * d4;
    d10 = 0.25D * d14 + 2.0D * paramDouble4;
    d18 = 0.25D * d14 + 2.0D * paramDouble4;
    d9 = Math.max(d1, paramArrayOfDouble5[(paramInt5 - 1 + paramInt8)]) / d5;
    d17 = Math.max(d1, paramArrayOfDouble5[(paramInt6 - 1 - 1 + paramInt8)]) / d5;
    d22 = Dlamch.dlamch("S");
    d23 = 1.0D / d22;
    d6 = (paramInt1 - 1) * d14 / (paramDouble1 * d4);
    d7 = (paramInt1 - 1) * d14 / (paramDouble1 * Math.sqrt(d4));
    d2 = d11;
    i4 = 0;
    d8 = 8.0D * paramDouble1;
    for (;;)
    {
      m = 0;
      n = 0;
      d9 = Math.min(d10, d9);
      d17 = Math.min(d18, d17);
      d22 = -d11;
      paramArrayOfDouble1[(1 - 1 + paramInt2)] += d22;
      if ((Math.abs(paramArrayOfDouble7[(1 - 1 + paramInt10)]) >= paramDouble4 ? 0 : 1) != 0)
      {
        paramArrayOfDouble7[(1 - 1 + paramInt10)] = (-paramDouble4);
        m = 1;
      }
      d12 = Math.abs(paramArrayOfDouble7[(1 - 1 + paramInt10)]);
      i2 = 1;
      for (int i6 = paramInt1 - 1 - 1 + 1; i6 > 0; i6--)
      {
        paramArrayOfDouble3[(i2 - 1 + paramInt4)] /= paramArrayOfDouble7[(i2 - 1 + paramInt10)];
        d22 = d22 * paramArrayOfDouble8[(i2 - 1 + paramInt11)] * paramArrayOfDouble2[(i2 - 1 + paramInt3)] - d11;
        paramArrayOfDouble1[(i2 + 1 - 1 + paramInt2)] += d22;
        if ((Math.abs(paramArrayOfDouble7[(i2 + 1 - 1 + paramInt10)]) >= paramDouble4 ? 0 : 1) != 0)
        {
          paramArrayOfDouble7[(i2 + 1 - 1 + paramInt10)] = (-paramDouble4);
          m = 1;
        }
        d12 = Math.max(d12, Math.abs(paramArrayOfDouble7[(i2 + 1 - 1 + paramInt10)]));
        i2 += 1;
      }
      m = (m == 0) && (!Disnan.disnan(d12)) ? 0 : 1;
      if (j == 0) {
        if ((d12 > d8 ? 0 : 1) == 0) {}
      }
      if ((((m ^ 0x1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramdoubleW.val = d11;
        i5 = 1;
        break label1999;
      }
      d22 = -d21;
      paramArrayOfDouble1[(1 - 1 + paramInt2)] += d22;
      if ((Math.abs(paramArrayOfDouble9[(1 - 1 + paramInt12)]) >= paramDouble4 ? 0 : 1) != 0)
      {
        paramArrayOfDouble9[(1 - 1 + paramInt12)] = (-paramDouble4);
        n = 1;
      }
      d13 = Math.abs(paramArrayOfDouble9[(1 - 1 + paramInt12)]);
      i2 = 1;
      for (i6 = paramInt1 - 1 - 1 + 1; i6 > 0; i6--)
      {
        paramArrayOfDouble9[(paramInt1 + i2 - 1 + paramInt12)] = (paramArrayOfDouble3[(i2 - 1 + paramInt4)] / paramArrayOfDouble9[(i2 - 1 + paramInt12)]);
        d22 = d22 * paramArrayOfDouble9[(paramInt1 + i2 - 1 + paramInt12)] * paramArrayOfDouble2[(i2 - 1 + paramInt3)] - d21;
        paramArrayOfDouble1[(i2 + 1 - 1 + paramInt2)] += d22;
        if ((Math.abs(paramArrayOfDouble9[(i2 + 1 - 1 + paramInt12)]) >= paramDouble4 ? 0 : 1) != 0)
        {
          paramArrayOfDouble9[(i2 + 1 - 1 + paramInt12)] = (-paramDouble4);
          n = 1;
        }
        d13 = Math.max(d13, Math.abs(paramArrayOfDouble9[(i2 + 1 - 1 + paramInt12)]));
        i2 += 1;
      }
      n = (n == 0) && (!Disnan.disnan(d13)) ? 0 : 1;
      if (j == 0) {
        if ((d13 > d8 ? 0 : 1) == 0) {}
      }
      if ((((n ^ 0x1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramdoubleW.val = d21;
        i5 = 2;
        break label1999;
      }
      if (((m != 0) && (n != 0) ? 1 : 0) != 0)
      {
        break label1874;
      }
      else
      {
        if ((m ^ 0x1) != 0)
        {
          i3 = 1;
          if ((d12 > d23 ? 0 : 1) != 0)
          {
            d23 = d12;
            d2 = d11;
          }
        }
        if ((n ^ 0x1) != 0)
        {
          if (m == 0) {}
          if (((d13 > d12 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            i3 = 2;
          }
          if ((d13 > d23 ? 0 : 1) != 0)
          {
            d23 = d13;
            d2 = d21;
          }
        }
        if ((d3 >= d14 / '' ? 0 : 1) != 0) {}
        if (((Math.min(d12, d13) >= d7 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((m ^ 0x1) != 0 ? 1 : 0) != 0) {}
        if (((n ^ 0x1) != 0 ? 1 : 0) != 0) {
          i = 1;
        } else {
          i = 0;
        }
        i1 = 1;
        if (((i1 != 0) && (i != 0) ? 1 : 0) != 0) {
          if ((i3 != 1 ? 0 : 1) != 0)
          {
            d24 = Math.abs(paramArrayOfDouble7[(paramInt1 - 1 + paramInt10)]);
            d25 = 1.0D;
            d16 = 1.0D;
            d15 = 1.0D;
            i2 = paramInt1 - 1;
            for (i6 = (1 - (paramInt1 - 1) + -1) / -1; i6 > 0; i6--)
            {
              if ((d16 > d4 ? 0 : 1) != 0) {
                d16 = paramArrayOfDouble7[(i2 + 1 - 1 + paramInt10)] * paramArrayOfDouble9[(paramInt1 + i2 + 1 - 1 + paramInt12)] / (paramArrayOfDouble7[(i2 - 1 + paramInt10)] * paramArrayOfDouble9[(paramInt1 + i2 - 1 + paramInt12)]) * d15;
              } else {
                d16 *= Math.abs(paramArrayOfDouble9[(paramInt1 + i2 - 1 + paramInt12)]);
              }
              d15 = d16;
              d25 += Math.pow(d16, 2);
              d24 = Math.max(d24, Math.abs(paramArrayOfDouble7[(i2 - 1 + paramInt10)] * d16));
              i2 += -1;
            }
            d19 = d24 / (paramDouble1 * Math.sqrt(d25));
            if ((d19 > 8.0D ? 0 : 1) != 0)
            {
              paramdoubleW.val = d11;
              i5 = 1;
              break label1999;
            }
          }
          else if ((i3 != 2 ? 0 : 1) != 0)
          {
            d24 = Math.abs(paramArrayOfDouble9[(paramInt1 - 1 + paramInt12)]);
            d25 = 1.0D;
            d16 = 1.0D;
            d15 = 1.0D;
            i2 = paramInt1 - 1;
            for (i6 = (1 - (paramInt1 - 1) + -1) / -1; i6 > 0; i6--)
            {
              if ((d16 > d4 ? 0 : 1) != 0) {
                d16 = paramArrayOfDouble9[(i2 + 1 - 1 + paramInt12)] * paramArrayOfDouble8[(i2 + 1 - 1 + paramInt11)] / (paramArrayOfDouble9[(i2 - 1 + paramInt12)] * paramArrayOfDouble8[(i2 - 1 + paramInt11)]) * d15;
              } else {
                d16 *= Math.abs(paramArrayOfDouble8[(i2 - 1 + paramInt11)]);
              }
              d15 = d16;
              d25 += Math.pow(d16, 2);
              d24 = Math.max(d24, Math.abs(paramArrayOfDouble9[(i2 - 1 + paramInt12)] * d16));
              i2 += -1;
            }
            d20 = d24 / (paramDouble1 * Math.sqrt(d25));
            if ((d20 > 8.0D ? 0 : 1) != 0)
            {
              paramdoubleW.val = d21;
              i5 = 2;
              break label1999;
            }
          }
        }
      }
      label1874:
      if ((i4 >= 1 ? 0 : 1) != 0)
      {
        d11 = Math.max(d11 - d9, d11 - d10);
        d21 = Math.min(d21 + d17, d21 + d18);
        d9 = 2.0D * d9;
        d17 = 2.0D * d17;
        i4 += 1;
      }
      else
      {
        if ((d23 >= d6 ? 0 : 1) == 0) {}
        if ((k == 0 ? 0 : 1) == 0) {
          break;
        }
        d11 = d2;
        d21 = d2;
        j = 1;
      }
    }
    paramintW.val = 1;
    return;
    label1999:
    if ((i5 != 1 ? 0 : 1) == 0) {
      if ((i5 != 2 ? 0 : 1) != 0)
      {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble9, paramInt12, 1, paramArrayOfDouble7, paramInt10, 1);
        Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble9, paramInt1 + 1 - 1 + paramInt12, 1, paramArrayOfDouble8, paramInt11, 1);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */