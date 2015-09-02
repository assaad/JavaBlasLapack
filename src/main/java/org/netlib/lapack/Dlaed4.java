package org.netlib.lapack;

import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaed4
{
  public static void dlaed4(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double paramDouble, doubleW paramdoubleW, intW paramintW)
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
    doubleW localdoubleW = new doubleW(0.0D);
    double d12 = 0.0D;
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    double d19 = 0.0D;
    double d20 = 0.0D;
    double[] arrayOfDouble = new double[3];
    paramintW.val = 0;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramdoubleW.val = (paramArrayOfDouble1[(1 - 1 + paramInt3)] + paramDouble * paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble2[(1 - 1 + paramInt4)]);
      paramArrayOfDouble3[(1 - 1 + paramInt5)] = 1.0D;
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      Dlaed5.dlaed5(paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramDouble, paramdoubleW);
      return;
    }
    d10 = Dlamch.dlamch("Epsilon");
    d16 = 1.0D / paramDouble;
    int i5;
    int i6;
    if ((paramInt2 != paramInt1 ? 0 : 1) != 0)
    {
      k = paramInt1 - 1;
      i4 = 1;
      d12 = paramDouble / 2.0D;
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfDouble3[(i3 - 1 + paramInt5)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] - d12);
        i3 += 1;
      }
      d15 = 0.0D;
      i3 = 1;
      for (i5 = paramInt1 - 2 - 1 + 1; i5 > 0; i5--)
      {
        d15 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
        i3 += 1;
      }
      d3 = d16 + d15;
      d20 = d3 + paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble2[(k - 1 + paramInt4)] / paramArrayOfDouble3[(k - 1 + paramInt5)] + paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] / paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)];
      if ((d20 > 0.0D ? 0 : 1) != 0)
      {
        d18 = paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] / (paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)] + paramDouble) + paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] / paramDouble;
        if ((d3 > d18 ? 0 : 1) != 0)
        {
          d17 = paramDouble;
        }
        else
        {
          d4 = paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)];
          d1 = -(d3 * d4) + paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] + paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)];
          d2 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * d4;
          if ((d1 >= 0.0D ? 0 : 1) != 0) {
            d17 = 2.0D * d2 / (Math.sqrt(d1 * d1 + 4.0D * d2 * d3) - d1);
          } else {
            d17 = (d1 + Math.sqrt(d1 * d1 + 4.0D * d2 * d3)) / (2.0D * d3);
          }
        }
        d5 = d12;
        d6 = paramDouble;
      }
      else
      {
        d4 = paramArrayOfDouble1[(paramInt1 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)];
        d1 = -(d3 * d4) + paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt4)] + paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)];
        d2 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * d4;
        if ((d1 >= 0.0D ? 0 : 1) != 0) {
          d17 = 2.0D * d2 / (Math.sqrt(d1 * d1 + 4.0D * d2 * d3) - d1);
        } else {
          d17 = (d1 + Math.sqrt(d1 * d1 + 4.0D * d2 * d3)) / (2.0D * d3);
        }
        d5 = 0.0D;
        d6 = d12;
      }
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfDouble3[(i3 - 1 + paramInt5)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] - d17);
        i3 += 1;
      }
      d8 = 0.0D;
      d15 = 0.0D;
      d11 = 0.0D;
      i3 = 1;
      for (i5 = k - 1 + 1; i5 > 0; i5--)
      {
        d18 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
        d15 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d18;
        d8 += d18 * d18;
        d11 += d15;
        i3 += 1;
      }
      d11 = Math.abs(d11);
      d18 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] / paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)];
      d13 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * d18;
      d7 = d18 * d18;
      d11 = 8.0D * (-d13 - d15) + d11 - d13 + d16 + Math.abs(d17) * (d8 + d7);
      d20 = d16 + d13 + d15;
      if ((Math.abs(d20) > d10 * d11 ? 0 : 1) != 0)
      {
        paramdoubleW.val = (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + d17);
      }
      else
      {
        if ((d20 > 0.0D ? 0 : 1) != 0) {
          d5 = Math.max(d5, d17);
        } else {
          d6 = Math.min(d6, d17);
        }
        i4 += 1;
        d3 = d20 - paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * d8 - paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)] * d7;
        d1 = (paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] + paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)]) * d20 - paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)] * (d8 + d7);
        d2 = paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)] * d20;
        if ((d3 >= 0.0D ? 0 : 1) != 0) {
          d3 = Math.abs(d3);
        }
        if ((d3 != 0.0D ? 0 : 1) != 0) {
          localdoubleW.val = (d6 - d17);
        } else if ((d1 < 0.0D ? 0 : 1) != 0) {
          localdoubleW.val = ((d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))) / (2.0D * d3));
        } else {
          localdoubleW.val = (2.0D * d2 / (d1 - Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))));
        }
        if ((d20 * localdoubleW.val <= 0.0D ? 0 : 1) != 0) {
          localdoubleW.val = (-(d20 / (d8 + d7)));
        }
        d18 = d17 + localdoubleW.val;
        if ((d18 <= d6 ? 0 : 1) == 0) {}
        if (((d18 >= d5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          if ((d20 >= 0.0D ? 0 : 1) != 0) {
            localdoubleW.val = ((d6 - d17) / 2.0D);
          } else {
            localdoubleW.val = ((d5 - d17) / 2.0D);
          }
        }
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfDouble3[(i3 - 1 + paramInt5)] -= localdoubleW.val;
          i3 += 1;
        }
        d17 += localdoubleW.val;
        d8 = 0.0D;
        d15 = 0.0D;
        d11 = 0.0D;
        i3 = 1;
        for (i5 = k - 1 + 1; i5 > 0; i5--)
        {
          d18 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
          d15 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d18;
          d8 += d18 * d18;
          d11 += d15;
          i3 += 1;
        }
        d11 = Math.abs(d11);
        d18 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] / paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)];
        d13 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * d18;
        d7 = d18 * d18;
        d11 = 8.0D * (-d13 - d15) + d11 - d13 + d16 + Math.abs(d17) * (d8 + d7);
        d20 = d16 + d13 + d15;
        i2 = i4 + 1;
        i4 = i2;
        for (i5 = 30 - i2 + 1; i5 > 0; i5--)
        {
          if ((Math.abs(d20) > d10 * d11 ? 0 : 1) != 0)
          {
            paramdoubleW.val = (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + d17);
            break;
          }
          if ((d20 > 0.0D ? 0 : 1) != 0) {
            d5 = Math.max(d5, d17);
          } else {
            d6 = Math.min(d6, d17);
          }
          d3 = d20 - paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * d8 - paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)] * d7;
          d1 = (paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] + paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)]) * d20 - paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)] * (d8 + d7);
          d2 = paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)] * d20;
          if ((d1 < 0.0D ? 0 : 1) != 0) {
            localdoubleW.val = ((d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))) / (2.0D * d3));
          } else {
            localdoubleW.val = (2.0D * d2 / (d1 - Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))));
          }
          if ((d20 * localdoubleW.val <= 0.0D ? 0 : 1) != 0) {
            localdoubleW.val = (-(d20 / (d8 + d7)));
          }
          d18 = d17 + localdoubleW.val;
          if ((d18 <= d6 ? 0 : 1) == 0) {}
          if (((d18 >= d5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            if ((d20 >= 0.0D ? 0 : 1) != 0) {
              localdoubleW.val = ((d6 - d17) / 2.0D);
            } else {
              localdoubleW.val = ((d5 - d17) / 2.0D);
            }
          }
          i3 = 1;
          for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
          {
            paramArrayOfDouble3[(i3 - 1 + paramInt5)] -= localdoubleW.val;
            i3 += 1;
          }
          d17 += localdoubleW.val;
          d8 = 0.0D;
          d15 = 0.0D;
          d11 = 0.0D;
          i3 = 1;
          for (i6 = k - 1 + 1; i6 > 0; i6--)
          {
            d18 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
            d15 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d18;
            d8 += d18 * d18;
            d11 += d15;
            i3 += 1;
          }
          d11 = Math.abs(d11);
          d18 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] / paramArrayOfDouble3[(paramInt1 - 1 + paramInt5)];
          d13 = paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * d18;
          d7 = d18 * d18;
          d11 = 8.0D * (-d13 - d15) + d11 - d13 + d16 + Math.abs(d17) * (d8 + d7);
          d20 = d16 + d13 + d15;
          i4 += 1;
        }
        paramintW.val = 1;
        paramdoubleW.val = (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + d17);
        return;
      }
    }
    else
    {
      i4 = 1;
      i1 = paramInt2 + 1;
      d4 = paramArrayOfDouble1[(i1 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)];
      d12 = d4 / 2.0D;
      i3 = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        paramArrayOfDouble3[(i3 - 1 + paramInt5)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] - d12);
        i3 += 1;
      }
      d15 = 0.0D;
      i3 = 1;
      for (i5 = paramInt2 - 1 - 1 + 1; i5 > 0; i5--)
      {
        d15 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
        i3 += 1;
      }
      d13 = 0.0D;
      i3 = paramInt1;
      for (i5 = (paramInt2 + 2 - paramInt1 + -1) / -1; i5 > 0; i5--)
      {
        d13 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
        i3 += -1;
      }
      d3 = d16 + d15 + d13;
      d20 = d3 + paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] / paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] + paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)] / paramArrayOfDouble3[(i1 - 1 + paramInt5)];
      if ((d20 <= 0.0D ? 0 : 1) != 0)
      {
        bool = true;
        d1 = d3 * d4 + paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] + paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)];
        d2 = paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * d4;
        if ((d1 <= 0.0D ? 0 : 1) != 0) {
          d17 = 2.0D * d2 / (d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3)));
        } else {
          d17 = (d1 - Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d3))) / (2.0D * d3);
        }
        d5 = 0.0D;
        d6 = d12;
      }
      else
      {
        bool = false;
        d1 = d3 * d4 - paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] - paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)];
        d2 = paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)] * d4;
        if ((d1 >= 0.0D ? 0 : 1) != 0) {
          d17 = 2.0D * d2 / (d1 - Math.sqrt(Math.abs(d1 * d1 + 4.0D * d2 * d3)));
        } else {
          d17 = -((d1 + Math.sqrt(Math.abs(d1 * d1 + 4.0D * d2 * d3))) / (2.0D * d3));
        }
        d5 = -d12;
        d6 = 0.0D;
      }
      if (bool)
      {
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfDouble3[(i3 - 1 + paramInt5)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] - d17);
          i3 += 1;
        }
      }
      else
      {
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfDouble3[(i3 - 1 + paramInt5)] = (paramArrayOfDouble1[(i3 - 1 + paramInt3)] - paramArrayOfDouble1[(i1 - 1 + paramInt3)] - d17);
          i3 += 1;
        }
      }
      if (bool) {
        k = paramInt2;
      } else {
        k = paramInt2 + 1;
      }
      m = k - 1;
      n = k + 1;
      d8 = 0.0D;
      d15 = 0.0D;
      d11 = 0.0D;
      i3 = 1;
      for (i5 = m - 1 + 1; i5 > 0; i5--)
      {
        d18 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
        d15 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d18;
        d8 += d18 * d18;
        d11 += d15;
        i3 += 1;
      }
      d11 = Math.abs(d11);
      d7 = 0.0D;
      d13 = 0.0D;
      i3 = paramInt1;
      for (i5 = (n - paramInt1 + -1) / -1; i5 > 0; i5--)
      {
        d18 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
        d13 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d18;
        d7 += d18 * d18;
        d11 += d13;
        i3 += -1;
      }
      d20 = d16 + d13 + d15;
      j = 0;
      if (bool)
      {
        if ((d20 >= 0.0D ? 0 : 1) != 0) {
          j = 1;
        }
      }
      else if ((d20 <= 0.0D ? 0 : 1) != 0) {
        j = 1;
      }
      if ((k != 1 ? 0 : 1) == 0) {}
      if (((k != paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        j = 0;
      }
      d18 = paramArrayOfDouble2[(k - 1 + paramInt4)] / paramArrayOfDouble3[(k - 1 + paramInt5)];
      d9 = d8 + d7 + d18 * d18;
      d18 = paramArrayOfDouble2[(k - 1 + paramInt4)] * d18;
      d20 += d18;
      d11 = 8.0D * (d13 - d15) + d11 + 2.0D * d16 + 3.0D * Math.abs(d18) + Math.abs(d17) * d9;
      if ((Math.abs(d20) > d10 * d11 ? 0 : 1) != 0)
      {
        if (bool) {
          paramdoubleW.val = (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + d17);
        } else {
          paramdoubleW.val = (paramArrayOfDouble1[(i1 - 1 + paramInt3)] + d17);
        }
      }
      else
      {
        if ((d20 > 0.0D ? 0 : 1) != 0) {
          d5 = Math.max(d5, d17);
        } else {
          d6 = Math.min(d6, d17);
        }
        i4 += 1;
        if ((j ^ 0x1) != 0)
        {
          if (bool) {
            d3 = d20 - paramArrayOfDouble3[(i1 - 1 + paramInt5)] * d9 - (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] - paramArrayOfDouble1[(i1 - 1 + paramInt3)]) * Math.pow(paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] / paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)], 2);
          } else {
            d3 = d20 - paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * d9 - (paramArrayOfDouble1[(i1 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)]) * Math.pow(paramArrayOfDouble2[(i1 - 1 + paramInt4)] / paramArrayOfDouble3[(i1 - 1 + paramInt5)], 2);
          }
          d1 = (paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] + paramArrayOfDouble3[(i1 - 1 + paramInt5)]) * d20 - paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)] * d9;
          d2 = paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)] * d20;
          if ((d3 != 0.0D ? 0 : 1) != 0)
          {
            if ((d1 != 0.0D ? 0 : 1) != 0) {
              if (bool) {
                d1 = paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] + paramArrayOfDouble3[(i1 - 1 + paramInt5)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)] * (d8 + d7);
              } else {
                d1 = paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)] + paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * (d8 + d7);
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
          d18 = d16 + d15 + d13;
          if (bool)
          {
            d19 = paramArrayOfDouble2[(m - 1 + paramInt4)] / paramArrayOfDouble3[(m - 1 + paramInt5)];
            d19 *= d19;
            d3 = d18 - paramArrayOfDouble3[(n - 1 + paramInt5)] * (d8 + d7) - (paramArrayOfDouble1[(m - 1 + paramInt3)] - paramArrayOfDouble1[(n - 1 + paramInt3)]) * d19;
            arrayOfDouble[(1 - 1)] = (paramArrayOfDouble2[(m - 1 + paramInt4)] * paramArrayOfDouble2[(m - 1 + paramInt4)]);
            arrayOfDouble[(3 - 1)] = (paramArrayOfDouble3[(n - 1 + paramInt5)] * paramArrayOfDouble3[(n - 1 + paramInt5)] * (d8 - d19 + d7));
          }
          else
          {
            d19 = paramArrayOfDouble2[(n - 1 + paramInt4)] / paramArrayOfDouble3[(n - 1 + paramInt5)];
            d19 *= d19;
            d3 = d18 - paramArrayOfDouble3[(m - 1 + paramInt5)] * (d8 + d7) - (paramArrayOfDouble1[(n - 1 + paramInt3)] - paramArrayOfDouble1[(m - 1 + paramInt3)]) * d19;
            arrayOfDouble[(1 - 1)] = (paramArrayOfDouble3[(m - 1 + paramInt5)] * paramArrayOfDouble3[(m - 1 + paramInt5)] * (d8 + (d7 - d19)));
            arrayOfDouble[(3 - 1)] = (paramArrayOfDouble2[(n - 1 + paramInt4)] * paramArrayOfDouble2[(n - 1 + paramInt4)]);
          }
          arrayOfDouble[(2 - 1)] = (paramArrayOfDouble2[(k - 1 + paramInt4)] * paramArrayOfDouble2[(k - 1 + paramInt4)]);
          Dlaed6.dlaed6(i4, bool, d3, paramArrayOfDouble3, m - 1 + paramInt5, arrayOfDouble, 0, d20, localdoubleW, paramintW);
          if ((paramintW.val == 0 ? 0 : 1) != 0) {
            return;
          }
        }
        if ((d20 * localdoubleW.val < 0.0D ? 0 : 1) != 0) {
          localdoubleW.val = (-(d20 / d9));
        }
        d18 = d17 + localdoubleW.val;
        if ((d18 <= d6 ? 0 : 1) == 0) {}
        if (((d18 >= d5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          if ((d20 >= 0.0D ? 0 : 1) != 0) {
            localdoubleW.val = ((d6 - d17) / 2.0D);
          } else {
            localdoubleW.val = ((d5 - d17) / 2.0D);
          }
        }
        d14 = d20;
        i3 = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfDouble3[(i3 - 1 + paramInt5)] -= localdoubleW.val;
          i3 += 1;
        }
        d8 = 0.0D;
        d15 = 0.0D;
        d11 = 0.0D;
        i3 = 1;
        for (i5 = m - 1 + 1; i5 > 0; i5--)
        {
          d18 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
          d15 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d18;
          d8 += d18 * d18;
          d11 += d15;
          i3 += 1;
        }
        d11 = Math.abs(d11);
        d7 = 0.0D;
        d13 = 0.0D;
        i3 = paramInt1;
        for (i5 = (n - paramInt1 + -1) / -1; i5 > 0; i5--)
        {
          d18 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
          d13 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d18;
          d7 += d18 * d18;
          d11 += d13;
          i3 += -1;
        }
        d18 = paramArrayOfDouble2[(k - 1 + paramInt4)] / paramArrayOfDouble3[(k - 1 + paramInt5)];
        d9 = d8 + d7 + d18 * d18;
        d18 = paramArrayOfDouble2[(k - 1 + paramInt4)] * d18;
        d20 = d16 + d13 + d15 + d18;
        d11 = 8.0D * (d13 - d15) + d11 + 2.0D * d16 + 3.0D * Math.abs(d18) + Math.abs(d17 + localdoubleW.val) * d9;
        i = 0;
        if (bool)
        {
          if ((-d20 <= Math.abs(d14) / 10.0D ? 0 : 1) != 0) {
            i = 1;
          }
        }
        else if ((d20 <= Math.abs(d14) / 10.0D ? 0 : 1) != 0) {
          i = 1;
        }
        d17 += localdoubleW.val;
        i2 = i4 + 1;
        i4 = i2;
        for (i5 = 30 - i2 + 1; i5 > 0; i5--)
        {
          if ((Math.abs(d20) > d10 * d11 ? 0 : 1) != 0)
          {
            if (bool) {
              paramdoubleW.val = (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + d17);
            } else {
              paramdoubleW.val = (paramArrayOfDouble1[(i1 - 1 + paramInt3)] + d17);
            }
            break;
          }
          if ((d20 > 0.0D ? 0 : 1) != 0) {
            d5 = Math.max(d5, d17);
          } else {
            d6 = Math.min(d6, d17);
          }
          if ((j ^ 0x1) != 0)
          {
            if ((i ^ 0x1) != 0)
            {
              if (bool) {
                d3 = d20 - paramArrayOfDouble3[(i1 - 1 + paramInt5)] * d9 - (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] - paramArrayOfDouble1[(i1 - 1 + paramInt3)]) * Math.pow(paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] / paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)], 2);
              } else {
                d3 = d20 - paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * d9 - (paramArrayOfDouble1[(i1 - 1 + paramInt3)] - paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)]) * Math.pow(paramArrayOfDouble2[(i1 - 1 + paramInt4)] / paramArrayOfDouble3[(i1 - 1 + paramInt5)], 2);
              }
            }
            else
            {
              d18 = paramArrayOfDouble2[(k - 1 + paramInt4)] / paramArrayOfDouble3[(k - 1 + paramInt5)];
              if (bool) {
                d8 += d18 * d18;
              } else {
                d7 += d18 * d18;
              }
              d3 = d20 - paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * d8 - paramArrayOfDouble3[(i1 - 1 + paramInt5)] * d7;
            }
            d1 = (paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] + paramArrayOfDouble3[(i1 - 1 + paramInt5)]) * d20 - paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)] * d9;
            d2 = paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)] * d20;
            if ((d3 != 0.0D ? 0 : 1) != 0)
            {
              if ((d1 != 0.0D ? 0 : 1) != 0) {
                if ((i ^ 0x1) != 0)
                {
                  if (bool) {
                    d1 = paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] * paramArrayOfDouble2[(paramInt2 - 1 + paramInt4)] + paramArrayOfDouble3[(i1 - 1 + paramInt5)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)] * (d8 + d7);
                  } else {
                    d1 = paramArrayOfDouble2[(i1 - 1 + paramInt4)] * paramArrayOfDouble2[(i1 - 1 + paramInt4)] + paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * (d8 + d7);
                  }
                }
                else {
                  d1 = paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * paramArrayOfDouble3[(paramInt2 - 1 + paramInt5)] * d8 + paramArrayOfDouble3[(i1 - 1 + paramInt5)] * paramArrayOfDouble3[(i1 - 1 + paramInt5)] * d7;
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
            d18 = d16 + d15 + d13;
            if (i != 0)
            {
              d3 = d18 - paramArrayOfDouble3[(m - 1 + paramInt5)] * d8 - paramArrayOfDouble3[(n - 1 + paramInt5)] * d7;
              arrayOfDouble[(1 - 1)] = (paramArrayOfDouble3[(m - 1 + paramInt5)] * paramArrayOfDouble3[(m - 1 + paramInt5)] * d8);
              arrayOfDouble[(3 - 1)] = (paramArrayOfDouble3[(n - 1 + paramInt5)] * paramArrayOfDouble3[(n - 1 + paramInt5)] * d7);
            }
            else if (bool)
            {
              d19 = paramArrayOfDouble2[(m - 1 + paramInt4)] / paramArrayOfDouble3[(m - 1 + paramInt5)];
              d19 *= d19;
              d3 = d18 - paramArrayOfDouble3[(n - 1 + paramInt5)] * (d8 + d7) - (paramArrayOfDouble1[(m - 1 + paramInt3)] - paramArrayOfDouble1[(n - 1 + paramInt3)]) * d19;
              arrayOfDouble[(1 - 1)] = (paramArrayOfDouble2[(m - 1 + paramInt4)] * paramArrayOfDouble2[(m - 1 + paramInt4)]);
              arrayOfDouble[(3 - 1)] = (paramArrayOfDouble3[(n - 1 + paramInt5)] * paramArrayOfDouble3[(n - 1 + paramInt5)] * (d8 - d19 + d7));
            }
            else
            {
              d19 = paramArrayOfDouble2[(n - 1 + paramInt4)] / paramArrayOfDouble3[(n - 1 + paramInt5)];
              d19 *= d19;
              d3 = d18 - paramArrayOfDouble3[(m - 1 + paramInt5)] * (d8 + d7) - (paramArrayOfDouble1[(n - 1 + paramInt3)] - paramArrayOfDouble1[(m - 1 + paramInt3)]) * d19;
              arrayOfDouble[(1 - 1)] = (paramArrayOfDouble3[(m - 1 + paramInt5)] * paramArrayOfDouble3[(m - 1 + paramInt5)] * (d8 + (d7 - d19)));
              arrayOfDouble[(3 - 1)] = (paramArrayOfDouble2[(n - 1 + paramInt4)] * paramArrayOfDouble2[(n - 1 + paramInt4)]);
            }
            Dlaed6.dlaed6(i4, bool, d3, paramArrayOfDouble3, m - 1 + paramInt5, arrayOfDouble, 0, d20, localdoubleW, paramintW);
            if ((paramintW.val == 0 ? 0 : 1) != 0) {
              break;
            }
          }
          if ((d20 * localdoubleW.val < 0.0D ? 0 : 1) != 0) {
            localdoubleW.val = (-(d20 / d9));
          }
          d18 = d17 + localdoubleW.val;
          if ((d18 <= d6 ? 0 : 1) == 0) {}
          if (((d18 >= d5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            if ((d20 >= 0.0D ? 0 : 1) != 0) {
              localdoubleW.val = ((d6 - d17) / 2.0D);
            } else {
              localdoubleW.val = ((d5 - d17) / 2.0D);
            }
          }
          i3 = 1;
          for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
          {
            paramArrayOfDouble3[(i3 - 1 + paramInt5)] -= localdoubleW.val;
            i3 += 1;
          }
          d17 += localdoubleW.val;
          d14 = d20;
          d8 = 0.0D;
          d15 = 0.0D;
          d11 = 0.0D;
          i3 = 1;
          for (i6 = m - 1 + 1; i6 > 0; i6--)
          {
            d18 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
            d15 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d18;
            d8 += d18 * d18;
            d11 += d15;
            i3 += 1;
          }
          d11 = Math.abs(d11);
          d7 = 0.0D;
          d13 = 0.0D;
          i3 = paramInt1;
          for (i6 = (n - paramInt1 + -1) / -1; i6 > 0; i6--)
          {
            d18 = paramArrayOfDouble2[(i3 - 1 + paramInt4)] / paramArrayOfDouble3[(i3 - 1 + paramInt5)];
            d13 += paramArrayOfDouble2[(i3 - 1 + paramInt4)] * d18;
            d7 += d18 * d18;
            d11 += d13;
            i3 += -1;
          }
          d18 = paramArrayOfDouble2[(k - 1 + paramInt4)] / paramArrayOfDouble3[(k - 1 + paramInt5)];
          d9 = d8 + d7 + d18 * d18;
          d18 = paramArrayOfDouble2[(k - 1 + paramInt4)] * d18;
          d20 = d16 + d13 + d15 + d18;
          d11 = 8.0D * (d13 - d15) + d11 + 2.0D * d16 + 3.0D * Math.abs(d18) + Math.abs(d17) * d9;
          if ((d20 * d14 <= 0.0D ? 0 : 1) != 0) {}
          if (((Math.abs(d20) <= Math.abs(d14) / 10.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
            i ^= 0x1;
          }
          i4 += 1;
        }
        paramintW.val = 1;
        if (bool) {
          paramdoubleW.val = (paramArrayOfDouble1[(paramInt2 - 1 + paramInt3)] + d17);
        } else {
          paramdoubleW.val = (paramArrayOfDouble1[(i1 - 1 + paramInt3)] + d17);
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaed4.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */