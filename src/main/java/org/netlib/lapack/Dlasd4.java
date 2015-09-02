package org.netlib.lapack;

import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasd4
{
  public static void dlasd4(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double paramDouble, doubleW paramdoubleW, double[] paramArrayOfDouble4, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
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
    doubleW localdoubleW = new doubleW(0.0D);
    double d17 = 0.0D;
    double d18 = 0.0D;
    double d19 = 0.0D;
    double d20 = 0.0D;
    double d21 = 0.0D;
    double d22 = 0.0D;
    double d23 = 0.0D;
    double d24 = 0.0D;
    double d25 = 0.0D;
    double d26 = 0.0D;
    double d27 = 0.0D;
    double[] arrayOfDouble1 = new double[3];
    double[] arrayOfDouble2 = new double[3];
    paramintW.val = 0;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramdoubleW.val = Math.sqrt(paramArrayOfDouble1[(1 - 1 + paramInt3)] * paramArrayOfDouble1[(1 - 1 + paramInt3)] + paramDouble * paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble2[(1 - 1 + paramInt4)]);
      paramArrayOfDouble3[(1 - 1 + paramInt5)] = 1.0D;
      paramArrayOfDouble4[(1 - 1 + paramInt6)] = 1.0D;
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      Dlasd5.dlasd5(paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramDouble, paramdoubleW, paramArrayOfDouble4, paramInt6);
      return;
    }
    d15 = Dlamch.dlamch("Epsilon");
    d20 = 1.0D / paramDouble;
    int i5;
    int i6;
    if ((paramInt2 != paramInt1 ? 0 : 1) != 0)
    {
      k = paramInt1 - 1;
      i4 = 1;
      d24 = paramDouble / 2.0D;
      d25 = d24 / (paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] + Math.sqrt(paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] * paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] + d24));
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfDouble4[(i3 - 1 + paramInt6)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] + paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] + d25);
        paramArrayOfDouble3[(i3 - 1 + paramInt5)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] - d25);
        i3 += 1;
      }
      d19 = 0.0D;
      i3 = 1;
      for (i5 = paramInt1 - 2 - 1 + 1; i5 > 0; i5--)
      {
        d19 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble3[(i3 - 1 + paramInt5)] * paramArrayOfDouble4[(i3 - 1 + paramInt6)]);
        i3 += 1;
      }
      d3 = d20 + d19;
      d27 = d3 + paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble2[(k - 1 + paramInt4)] / (paramArrayOfDouble3[(k - 1 + paramInt5)] * paramArrayOfDouble4[(k - 1 + paramInt6)]) + paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] / (paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)] * paramArrayOfDouble4[(paramInt1 - 1 + paramInt6)]);
      if ((d27 > 0.0D ? 0 : 1) != 0)
      {
        d25 = Math.sqrt(paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] * paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] + paramDouble);
        d24 = paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] / ((paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)] + d25) * (paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)] + paramDouble / (paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] + d25))) + paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] / paramDouble;
        if ((d3 > d24 ? 0 : 1) != 0)
        {
          d23 = paramDouble;
        }
        else
        {
          d4 = (paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)]) * (paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] + paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)]);
          d1 = -(d3 * d4) + paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] + paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)];
          d2 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * d4;
          if ((d1 >= 0.0D ? 0 : 1) != 0) {
            d23 = 2.0D * d2 / (Math.sqrt(d1 * d1 + 4.0D * d2 * d3) - d1);
          } else {
            d23 = (d1 + Math.sqrt(d1 * d1 + 4.0D * d2 * d3)) / (2.0D * d3);
          }
        }
      }
      else
      {
        d4 = (paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)]) * (paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] + paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)]);
        d1 = -(d3 * d4) + paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] + paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)];
        d2 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * d4;
        if ((d1 >= 0.0D ? 0 : 1) != 0) {
          d23 = 2.0D * d2 / (Math.sqrt(d1 * d1 + 4.0D * d2 * d3) - d1);
        } else {
          d23 = (d1 + Math.sqrt(d1 * d1 + 4.0D * d2 * d3)) / (2.0D * d3);
        }
      }
      localdoubleW.val = (d23 / (paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] + Math.sqrt(paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] * paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] + d23)));
      paramdoubleW.val = (paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] + localdoubleW.val);
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfDouble3[(i3 - 1 + paramInt5)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] - localdoubleW.val);
        paramArrayOfDouble4[(i3 - 1 + paramInt6)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] + paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + localdoubleW.val);
        i3 += 1;
      }
      d7 = 0.0D;
      d19 = 0.0D;
      d16 = 0.0D;
      i3 = 1;
      for (i5 = k - 1 + 1; i5 > 0; i5--)
      {
        d24 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble3[(i3 - 1 + paramInt5)] * paramArrayOfDouble4[(i3 - 1 + paramInt6)]);
        d19 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d24;
        d7 += d24 * d24;
        d16 += d19;
        i3 += 1;
      }
      d16 = Math.abs(d16);
      d24 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] / (paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)] * paramArrayOfDouble4[(paramInt1 - 1 + paramInt6)]);
      d17 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * d24;
      d6 = d24 * d24;
      d16 = 8.0D * (-d17 - d19) + d16 - d17 + d20 + Math.abs(d23) * (d7 + d6);
      d27 = d20 + d17 + d19;
      if ((Math.abs(d27) > d15 * d16 ? 0 : 1) == 0)
      {
        i4 += 1;
        d13 = paramArrayOfDouble4[(paramInt1 - 1 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)];
        d12 = paramArrayOfDouble4[(paramInt1 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)];
        d3 = d27 - d13 * d7 - d12 * d6;
        d1 = (d12 + d13) * d27 - d12 * d13 * (d7 + d6);
        d2 = d12 * d13 * d27;
        if ((d3 >= 0.0D ? 0 : 1) != 0) {
          d3 = Math.abs(d3);
        }
        if ((d3 != 0.0D ? 0 : 1) != 0) {
          localdoubleW.val = (paramDouble - paramdoubleW.val * paramdoubleW.val);
        } else if ((d1 < 0.0D ? 0 : 1) != 0) {
          localdoubleW.val = ((d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))) / (2.0D * d3));
        } else {
          localdoubleW.val = (2.0D * d2 / (d1 - Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))));
        }
        if ((d27 * localdoubleW.val <= 0.0D ? 0 : 1) != 0) {
          localdoubleW.val = (-(d27 / (d7 + d6)));
        }
        d24 = localdoubleW.val - d12;
        if ((d24 <= paramDouble ? 0 : 1) != 0) {
          localdoubleW.val = (paramDouble + d12);
        }
        d23 += localdoubleW.val;
        localdoubleW.val /= (paramdoubleW.val + Math.sqrt(localdoubleW.val + paramdoubleW.val * paramdoubleW.val));
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfDouble3[(i3 - 1 + paramInt5)] -= localdoubleW.val;
          paramArrayOfDouble4[(i3 - 1 + paramInt6)] += localdoubleW.val;
          i3 += 1;
        }
        paramdoubleW.val += localdoubleW.val;
        d7 = 0.0D;
        d19 = 0.0D;
        d16 = 0.0D;
        i3 = 1;
        for (i5 = k - 1 + 1; i5 > 0; i5--)
        {
          d24 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble4[(i3 - 1 + paramInt6)] * paramArrayOfDouble3[(i3 - 1 + paramInt5)]);
          d19 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d24;
          d7 += d24 * d24;
          d16 += d19;
          i3 += 1;
        }
        d16 = Math.abs(d16);
        d24 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] / (paramArrayOfDouble4[(paramInt1 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)]);
        d17 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * d24;
        d6 = d24 * d24;
        d16 = 8.0D * (-d17 - d19) + d16 - d17 + d20 + Math.abs(d23) * (d7 + d6);
        d27 = d20 + d17 + d19;
        i2 = i4 + 1;
        i4 = i2;
        for (i5 = 20 - i2 + 1; i5 > 0; i5--)
        {
          if ((Math.abs(d27) > d15 * d16 ? 0 : 1) != 0) {
            break;
          }
          d13 = paramArrayOfDouble4[(paramInt1 - 1 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)];
          d12 = paramArrayOfDouble4[(paramInt1 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)];
          d3 = d27 - d13 * d7 - d12 * d6;
          d1 = (d12 + d13) * d27 - d13 * d12 * (d7 + d6);
          d2 = d13 * d12 * d27;
          if ((d1 < 0.0D ? 0 : 1) != 0) {
            localdoubleW.val = ((d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))) / (2.0D * d3));
          } else {
            localdoubleW.val = (2.0D * d2 / (d1 - Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))));
          }
          if ((d27 * localdoubleW.val <= 0.0D ? 0 : 1) != 0) {
            localdoubleW.val = (-(d27 / (d7 + d6)));
          }
          d24 = localdoubleW.val - d12;
          if ((d24 > 0.0D ? 0 : 1) != 0) {
            localdoubleW.val /= 2.0D;
          }
          d23 += localdoubleW.val;
          localdoubleW.val /= (paramdoubleW.val + Math.sqrt(localdoubleW.val + paramdoubleW.val * paramdoubleW.val));
          i3 = 1;
          for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
          {
            paramArrayOfDouble3[(i3 - 1 + paramInt5)] -= localdoubleW.val;
            paramArrayOfDouble4[(i3 - 1 + paramInt6)] += localdoubleW.val;
            i3 += 1;
          }
          paramdoubleW.val += localdoubleW.val;
          d7 = 0.0D;
          d19 = 0.0D;
          d16 = 0.0D;
          i3 = 1;
          for (i6 = k - 1 + 1; i6 > 0; i6--)
          {
            d24 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble4[(i3 - 1 + paramInt6)] * paramArrayOfDouble3[(i3 - 1 + paramInt5)]);
            d19 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d24;
            d7 += d24 * d24;
            d16 += d19;
            i3 += 1;
          }
          d16 = Math.abs(d16);
          d24 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] / (paramArrayOfDouble4[(paramInt1 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)]);
          d17 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * d24;
          d6 = d24 * d24;
          d16 = 8.0D * (-d17 - d19) + d16 - d17 + d20 + Math.abs(d23) * (d7 + d6);
          d27 = d20 + d17 + d19;
          i4 += 1;
        }
        paramintW.val = 1;
        return;
      }
    }
    else
    {
      i4 = 1;
      i1 = paramInt2 + 1;
      d4 = (paramArrayOfDouble1[(i1 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)]) * (paramArrayOfDouble1[(i1 - 1 + paramInt3)] + paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)]);
      d5 = d4 / 2.0D;
      d24 = d5 / (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + Math.sqrt(paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] * paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + d5));
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfDouble4[(i3 - 1 + paramInt6)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] + paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + d24);
        paramArrayOfDouble3[(i3 - 1 + paramInt5)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] - d24);
        i3 += 1;
      }
      d19 = 0.0D;
      i3 = 1;
      for (i5 = paramInt2 - 1 - 1 + 1; i5 > 0; i5--)
      {
        d19 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble4[(i3 - 1 + paramInt6)] * paramArrayOfDouble3[(i3 - 1 + paramInt5)]);
        i3 += 1;
      }
      d17 = 0.0D;
      i3 = paramInt1;
      for (i5 = (paramInt2 + 2 - paramInt1 + -1) / -1; i5 > 0; i5--)
      {
        d17 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble4[(i3 - 1 + paramInt6)] * paramArrayOfDouble3[(i3 - 1 + paramInt5)]);
        i3 += -1;
      }
      d3 = d20 + d19 + d17;
      d27 = d3 + paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] / (paramArrayOfDouble4[(paramInt2 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)]) + paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)] / (paramArrayOfDouble4[(i1 - 1 + paramInt6)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)]);
      if ((d27 <= 0.0D ? 0 : 1) != 0)
      {
        bool = true;
        d21 = 0.0D;
        d22 = d5;
        d1 = d3 * d4 + paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] + paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)];
        d2 = paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * d4;
        if ((d1 <= 0.0D ? 0 : 1) != 0) {
          d23 = 2.0D * d2 / (d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3)));
        } else {
          d23 = (d1 - Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))) / (2.0D * d3);
        }
        localdoubleW.val = (d23 / (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + Math.sqrt(paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] * paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + d23)));
      }
      else
      {
        bool = false;
        d21 = -d5;
        d22 = 0.0D;
        d1 = d3 * d4 - paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] - paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)];
        d2 = paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)] * d4;
        if ((d1 >= 0.0D ? 0 : 1) != 0) {
          d23 = 2.0D * d2 / (d1 - Math.sqrt(Math.abs(d1 * d1 + 4.0D * d2 * d3)));
        } else {
          d23 = -((d1 + Math.sqrt(Math.abs(d1 * d1 + 4.0D * d2 * d3))) / (2.0D * d3));
        }
        localdoubleW.val = (d23 / (paramArrayOfDouble1[(i1 - 1 + paramInt3)] + Math.sqrt(Math.abs(paramArrayOfDouble1[(i1 - 1 + paramInt3)] * paramArrayOfDouble1[(i1 - 1 + paramInt3)] + d23))));
      }
      if (bool)
      {
        k = paramInt2;
        paramdoubleW.val = (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + localdoubleW.val);
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfDouble4[(i3 - 1 + paramInt6)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] + paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + localdoubleW.val);
          paramArrayOfDouble3[(i3 - 1 + paramInt5)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] - localdoubleW.val);
          i3 += 1;
        }
      }
      else
      {
        k = paramInt2 + 1;
        paramdoubleW.val = (paramArrayOfDouble1[(i1 - 1 + paramInt3)] + localdoubleW.val);
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfDouble4[(i3 - 1 + paramInt6)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] + paramArrayOfDouble1[(i1 - 1 + paramInt3)] + localdoubleW.val);
          paramArrayOfDouble3[(i3 - 1 + paramInt5)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] - paramArrayOfDouble1[(i1 - 1 + paramInt3)] - localdoubleW.val);
          i3 += 1;
        }
      }
      m = k - 1;
      n = k + 1;
      d7 = 0.0D;
      d19 = 0.0D;
      d16 = 0.0D;
      i3 = 1;
      for (i5 = m - 1 + 1; i5 > 0; i5--)
      {
        d24 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble4[(i3 - 1 + paramInt6)] * paramArrayOfDouble3[(i3 - 1 + paramInt5)]);
        d19 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d24;
        d7 += d24 * d24;
        d16 += d19;
        i3 += 1;
      }
      d16 = Math.abs(d16);
      d6 = 0.0D;
      d17 = 0.0D;
      i3 = paramInt1;
      for (i5 = (n - paramInt1 + -1) / -1; i5 > 0; i5--)
      {
        d24 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble4[(i3 - 1 + paramInt6)] * paramArrayOfDouble3[(i3 - 1 + paramInt5)]);
        d17 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d24;
        d6 += d24 * d24;
        d16 += d17;
        i3 += -1;
      }
      d27 = d20 + d17 + d19;
      j = 0;
      if (bool)
      {
        if ((d27 >= 0.0D ? 0 : 1) != 0) {
          j = 1;
        }
      }
      else if ((d27 <= 0.0D ? 0 : 1) != 0) {
        j = 1;
      }
      if ((k != 1 ? 0 : 1) == 0) {}
      if (((k != paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        j = 0;
      }
      d24 = paramArrayOfDouble2[(k - 1 + paramInt4)] / (paramArrayOfDouble4[(k - 1 + paramInt6)] * paramArrayOfDouble3[(k - 1 + paramInt5)]);
      d14 = d7 + d6 + d24 * d24;
      d24 = paramArrayOfDouble2[(k - 1 + paramInt4)] * d24;
      d27 += d24;
      d16 = 8.0D * (d17 - d19) + d16 + 2.0D * d20 + 3.0D * Math.abs(d24) + Math.abs(d23) * d14;
      if ((Math.abs(d27) > d15 * d16 ? 0 : 1) == 0)
      {
        if ((d27 > 0.0D ? 0 : 1) != 0) {
          d21 = Math.max(d21, d23);
        } else {
          d22 = Math.min(d22, d23);
        }
        i4 += 1;
        if ((j ^ 0x1) != 0)
        {
          d10 = paramArrayOfDouble4[(i1 - 1 + paramInt6)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)];
          d11 = paramArrayOfDouble4[(paramInt2 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)];
          if (bool) {
            d3 = d27 - d10 * d14 + d4 * Math.pow(paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] / d11, 2);
          } else {
            d3 = d27 - d11 * d14 - d4 * Math.pow(paramArrayOfDouble2[(i1 - 1 + paramInt4)] / d10, 2);
          }
          d1 = (d10 + d11) * d27 - d10 * d11 * d14;
          d2 = d10 * d11 * d27;
          if ((d3 != 0.0D ? 0 : 1) != 0)
          {
            if ((d1 != 0.0D ? 0 : 1) != 0) {
              if (bool) {
                d1 = paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] + d10 * d10 * (d7 + d6);
              } else {
                d1 = paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)] + d11 * d11 * (d7 + d6);
              }
            }
            localdoubleW.val = (d2 / d1);
          }
          else if ((d1 > 0.0D ? 0 : 1) != 0)
          {
            localdoubleW.val = ((d1 - Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))) / (2.0D * d3));
          }
          else
          {
            localdoubleW.val = (2.0D * d2 / (d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))));
          }
        }
        else
        {
          d8 = paramArrayOfDouble4[(m - 1 + paramInt6)] * paramArrayOfDouble3[(m - 1 + paramInt5)];
          d9 = paramArrayOfDouble4[(n - 1 + paramInt6)] * paramArrayOfDouble3[(n - 1 + paramInt5)];
          d24 = d20 + d19 + d17;
          if (bool)
          {
            d25 = paramArrayOfDouble2[(m - 1 + paramInt4)] / d8;
            d25 *= d25;
            d3 = d24 - d9 * (d7 + d6) - (paramArrayOfDouble1[(m - 1 + paramInt3)] - paramArrayOfDouble1[(n - 1 + paramInt3)]) * (paramArrayOfDouble1[(m - 1 + paramInt3)] + paramArrayOfDouble1[(n - 1 + paramInt3)]) * d25;
            arrayOfDouble2[(1 - 1)] = (paramArrayOfDouble2[(m - 1 + paramInt4)] * paramArrayOfDouble2[(m - 1 + paramInt4)]);
            if ((d7 >= d25 ? 0 : 1) != 0) {
              arrayOfDouble2[(3 - 1)] = (d9 * d9 * d6);
            } else {
              arrayOfDouble2[(3 - 1)] = (d9 * d9 * (d7 - d25 + d6));
            }
          }
          else
          {
            d25 = paramArrayOfDouble2[(n - 1 + paramInt4)] / d9;
            d25 *= d25;
            d3 = d24 - d8 * (d7 + d6) - (paramArrayOfDouble1[(n - 1 + paramInt3)] - paramArrayOfDouble1[(m - 1 + paramInt3)]) * (paramArrayOfDouble1[(m - 1 + paramInt3)] + paramArrayOfDouble1[(n - 1 + paramInt3)]) * d25;
            if ((d6 >= d25 ? 0 : 1) != 0) {
              arrayOfDouble2[(1 - 1)] = (d8 * d8 * d7);
            } else {
              arrayOfDouble2[(1 - 1)] = (d8 * d8 * (d7 + (d6 - d25)));
            }
            arrayOfDouble2[(3 - 1)] = (paramArrayOfDouble2[(n - 1 + paramInt4)] * paramArrayOfDouble2[(n - 1 + paramInt4)]);
          }
          arrayOfDouble2[(2 - 1)] = (paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble2[(k - 1 + paramInt4)]);
          arrayOfDouble1[(1 - 1)] = d8;
          arrayOfDouble1[(2 - 1)] = (paramArrayOfDouble3[(k - 1 + paramInt5)] * paramArrayOfDouble4[(k - 1 + paramInt6)]);
          arrayOfDouble1[(3 - 1)] = d9;
          Dlaed6.dlaed6(i4, bool, d3, arrayOfDouble1, 0, arrayOfDouble2, 0, d27, localdoubleW, paramintW);
          if ((paramintW.val == 0 ? 0 : 1) != 0) {
            return;
          }
        }
        if ((d27 * localdoubleW.val < 0.0D ? 0 : 1) != 0) {
          localdoubleW.val = (-(d27 / d14));
        }
        if (bool)
        {
          d25 = paramArrayOfDouble4[(paramInt2 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)];
          d24 = localdoubleW.val - d25;
        }
        else
        {
          d25 = paramArrayOfDouble4[(i1 - 1 + paramInt6)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)];
          d24 = localdoubleW.val - d25;
        }
        if ((d24 <= d22 ? 0 : 1) == 0) {}
        if (((d24 >= d21 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          if ((d27 >= 0.0D ? 0 : 1) != 0) {
            localdoubleW.val = ((d22 - d23) / 2.0D);
          } else {
            localdoubleW.val = ((d21 - d23) / 2.0D);
          }
        }
        d23 += localdoubleW.val;
        localdoubleW.val /= (paramdoubleW.val + Math.sqrt(paramdoubleW.val * paramdoubleW.val + localdoubleW.val));
        d18 = d27;
        paramdoubleW.val += localdoubleW.val;
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfDouble4[(i3 - 1 + paramInt6)] += localdoubleW.val;
          paramArrayOfDouble3[(i3 - 1 + paramInt5)] -= localdoubleW.val;
          i3 += 1;
        }
        d7 = 0.0D;
        d19 = 0.0D;
        d16 = 0.0D;
        i3 = 1;
        for (i5 = m - 1 + 1; i5 > 0; i5--)
        {
          d24 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble4[(i3 - 1 + paramInt6)] * paramArrayOfDouble3[(i3 - 1 + paramInt5)]);
          d19 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d24;
          d7 += d24 * d24;
          d16 += d19;
          i3 += 1;
        }
        d16 = Math.abs(d16);
        d6 = 0.0D;
        d17 = 0.0D;
        i3 = paramInt1;
        for (i5 = (n - paramInt1 + -1) / -1; i5 > 0; i5--)
        {
          d24 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble4[(i3 - 1 + paramInt6)] * paramArrayOfDouble3[(i3 - 1 + paramInt5)]);
          d17 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d24;
          d6 += d24 * d24;
          d16 += d17;
          i3 += -1;
        }
        d24 = paramArrayOfDouble2[(k - 1 + paramInt4)] / (paramArrayOfDouble4[(k - 1 + paramInt6)] * paramArrayOfDouble3[(k - 1 + paramInt5)]);
        d14 = d7 + d6 + d24 * d24;
        d24 = paramArrayOfDouble2[(k - 1 + paramInt4)] * d24;
        d27 = d20 + d17 + d19 + d24;
        d16 = 8.0D * (d17 - d19) + d16 + 2.0D * d20 + 3.0D * Math.abs(d24) + Math.abs(d23) * d14;
        if ((d27 > 0.0D ? 0 : 1) != 0) {
          d21 = Math.max(d21, d23);
        } else {
          d22 = Math.min(d22, d23);
        }
        i = 0;
        if (bool)
        {
          if ((-d27 <= Math.abs(d18) / 10.0D ? 0 : 1) != 0) {
            i = 1;
          }
        }
        else if ((d27 <= Math.abs(d18) / 10.0D ? 0 : 1) != 0) {
          i = 1;
        }
        i2 = i4 + 1;
        i4 = i2;
        i5 = 20 - i2 + 1;
        while ((Math.abs(d27) > d15 * d16 ? 0 : 1) == 0)
        {
          if ((j ^ 0x1) != 0)
          {
            d10 = paramArrayOfDouble4[(i1 - 1 + paramInt6)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)];
            d11 = paramArrayOfDouble4[(paramInt2 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)];
            if ((i ^ 0x1) != 0)
            {
              if (bool) {
                d3 = d27 - d10 * d14 + d4 * Math.pow(paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] / d11, 2);
              } else {
                d3 = d27 - d11 * d14 - d4 * Math.pow(paramArrayOfDouble2[(i1 - 1 + paramInt4)] / d10, 2);
              }
            }
            else
            {
              d24 = paramArrayOfDouble2[(k - 1 + paramInt4)] / (paramArrayOfDouble4[(k - 1 + paramInt6)] * paramArrayOfDouble3[(k - 1 + paramInt5)]);
              if (bool) {
                d7 += d24 * d24;
              } else {
                d6 += d24 * d24;
              }
              d3 = d27 - d11 * d7 - d10 * d6;
            }
            d1 = (d10 + d11) * d27 - d10 * d11 * d14;
            d2 = d10 * d11 * d27;
            if ((d3 != 0.0D ? 0 : 1) != 0)
            {
              if ((d1 != 0.0D ? 0 : 1) != 0) {
                if ((i ^ 0x1) != 0)
                {
                  if (bool) {
                    d1 = paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] + d10 * d10 * (d7 + d6);
                  } else {
                    d1 = paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)] + d11 * d11 * (d7 + d6);
                  }
                }
                else {
                  d1 = d11 * d11 * d7 + d10 * d10 * d6;
                }
              }
              localdoubleW.val = (d2 / d1);
            }
            else if ((d1 > 0.0D ? 0 : 1) != 0)
            {
              localdoubleW.val = ((d1 - Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))) / (2.0D * d3));
            }
            else
            {
              localdoubleW.val = (2.0D * d2 / (d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))));
            }
          }
          else
          {
            d8 = paramArrayOfDouble4[(m - 1 + paramInt6)] * paramArrayOfDouble3[(m - 1 + paramInt5)];
            d9 = paramArrayOfDouble4[(n - 1 + paramInt6)] * paramArrayOfDouble3[(n - 1 + paramInt5)];
            d24 = d20 + d19 + d17;
            if (i != 0)
            {
              d3 = d24 - d8 * d7 - d9 * d6;
              arrayOfDouble2[(1 - 1)] = (d8 * d8 * d7);
              arrayOfDouble2[(3 - 1)] = (d9 * d9 * d6);
            }
            else if (bool)
            {
              d25 = paramArrayOfDouble2[(m - 1 + paramInt4)] / d8;
              d25 *= d25;
              d26 = (paramArrayOfDouble1[(m - 1 + paramInt3)] - paramArrayOfDouble1[(n - 1 + paramInt3)]) * (paramArrayOfDouble1[(m - 1 + paramInt3)] + paramArrayOfDouble1[(n - 1 + paramInt3)]) * d25;
              d3 = d24 - d9 * (d7 + d6) - d26;
              arrayOfDouble2[(1 - 1)] = (paramArrayOfDouble2[(m - 1 + paramInt4)] * paramArrayOfDouble2[(m - 1 + paramInt4)]);
              if ((d7 >= d25 ? 0 : 1) != 0) {
                arrayOfDouble2[(3 - 1)] = (d9 * d9 * d6);
              } else {
                arrayOfDouble2[(3 - 1)] = (d9 * d9 * (d7 - d25 + d6));
              }
            }
            else
            {
              d25 = paramArrayOfDouble2[(n - 1 + paramInt4)] / d9;
              d25 *= d25;
              d26 = (paramArrayOfDouble1[(n - 1 + paramInt3)] - paramArrayOfDouble1[(m - 1 + paramInt3)]) * (paramArrayOfDouble1[(m - 1 + paramInt3)] + paramArrayOfDouble1[(n - 1 + paramInt3)]) * d25;
              d3 = d24 - d8 * (d7 + d6) - d26;
              if ((d6 >= d25 ? 0 : 1) != 0) {
                arrayOfDouble2[(1 - 1)] = (d8 * d8 * d7);
              } else {
                arrayOfDouble2[(1 - 1)] = (d8 * d8 * (d7 + (d6 - d25)));
              }
              arrayOfDouble2[(3 - 1)] = (paramArrayOfDouble2[(n - 1 + paramInt4)] * paramArrayOfDouble2[(n - 1 + paramInt4)]);
            }
            arrayOfDouble1[(1 - 1)] = d8;
            arrayOfDouble1[(2 - 1)] = (paramArrayOfDouble3[(k - 1 + paramInt5)] * paramArrayOfDouble4[(k - 1 + paramInt6)]);
            arrayOfDouble1[(3 - 1)] = d9;
            Dlaed6.dlaed6(i4, bool, d3, arrayOfDouble1, 0, arrayOfDouble2, 0, d27, localdoubleW, paramintW);
            if ((paramintW.val == 0 ? 0 : 1) != 0) {
              break;
            }
          }
          if ((d27 * localdoubleW.val < 0.0D ? 0 : 1) != 0) {
            localdoubleW.val = (-(d27 / d14));
          }
          if (bool)
          {
            d25 = paramArrayOfDouble4[(paramInt2 - 1 + paramInt6)] * paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)];
            d24 = localdoubleW.val - d25;
          }
          else
          {
            d25 = paramArrayOfDouble4[(i1 - 1 + paramInt6)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)];
            d24 = localdoubleW.val - d25;
          }
          if ((d24 <= d22 ? 0 : 1) == 0) {}
          if (((d24 >= d21 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            if ((d27 >= 0.0D ? 0 : 1) != 0) {
              localdoubleW.val = ((d22 - d23) / 2.0D);
            } else {
              localdoubleW.val = ((d21 - d23) / 2.0D);
            }
          }
          d23 += localdoubleW.val;
          localdoubleW.val /= (paramdoubleW.val + Math.sqrt(paramdoubleW.val * paramdoubleW.val + localdoubleW.val));
          paramdoubleW.val += localdoubleW.val;
          i3 = 1;
          for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
          {
            paramArrayOfDouble4[(i3 - 1 + paramInt6)] += localdoubleW.val;
            paramArrayOfDouble3[(i3 - 1 + paramInt5)] -= localdoubleW.val;
            i3 += 1;
          }
          d18 = d27;
          d7 = 0.0D;
          d19 = 0.0D;
          d16 = 0.0D;
          i3 = 1;
          for (i6 = m - 1 + 1; i6 > 0; i6--)
          {
            d24 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble4[(i3 - 1 + paramInt6)] * paramArrayOfDouble3[(i3 - 1 + paramInt5)]);
            d19 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d24;
            d7 += d24 * d24;
            d16 += d19;
            i3 += 1;
          }
          d16 = Math.abs(d16);
          d6 = 0.0D;
          d17 = 0.0D;
          i3 = paramInt1;
          for (i6 = (n - paramInt1 + -1) / -1; i6 > 0; i6--)
          {
            d24 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / (paramArrayOfDouble4[(i3 - 1 + paramInt6)] * paramArrayOfDouble3[(i3 - 1 + paramInt5)]);
            d17 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d24;
            d6 += d24 * d24;
            d16 += d17;
            i3 += -1;
          }
          d24 = paramArrayOfDouble2[(k - 1 + paramInt4)] / (paramArrayOfDouble4[(k - 1 + paramInt6)] * paramArrayOfDouble3[(k - 1 + paramInt5)]);
          d14 = d7 + d6 + d24 * d24;
          d24 = paramArrayOfDouble2[(k - 1 + paramInt4)] * d24;
          d27 = d20 + d17 + d19 + d24;
          d16 = 8.0D * (d17 - d19) + d16 + 2.0D * d20 + 3.0D * Math.abs(d24) + Math.abs(d23) * d14;
          if ((d27 * d18 <= 0.0D ? 0 : 1) != 0) {}
          if (((Math.abs(d27) <= Math.abs(d18) / 10.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
            i ^= 0x1;
          }
          if ((d27 > 0.0D ? 0 : 1) != 0) {
            d21 = Math.max(d21, d23);
          } else {
            d22 = Math.min(d22, d23);
          }
          i4 += 1;
          i5--;
          if (i5 <= 0) {
            paramintW.val = 1;
          }
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasd4.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */