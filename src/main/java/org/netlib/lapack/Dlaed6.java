package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaed6
{
  public static void dlaed6(int paramInt1, boolean paramBoolean, double paramDouble1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double paramDouble2, doubleW paramdoubleW, intW paramintW)
  {
    double[] arrayOfDouble1 = new double[3];
    double[] arrayOfDouble2 = new double[3];
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
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
    paramintW.val = 0;
    if (paramBoolean)
    {
      d23 = paramArrayOfDouble1[(2 - 1 + paramInt2)];
      d24 = paramArrayOfDouble1[(3 - 1 + paramInt2)];
    }
    else
    {
      d23 = paramArrayOfDouble1[(1 - 1 + paramInt2)];
      d24 = paramArrayOfDouble1[(2 - 1 + paramInt2)];
    }
    if ((paramDouble2 >= 0.0D ? 0 : 1) != 0) {
      d23 = 0.0D;
    } else {
      d24 = 0.0D;
    }
    m = 1;
    paramdoubleW.val = 0.0D;
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      if (paramBoolean)
      {
        d18 = (paramArrayOfDouble1[(3 - 1 + paramInt2)] - paramArrayOfDouble1[(2 - 1 + paramInt2)]) / 2.0D;
        d4 = paramDouble1 + paramArrayOfDouble2[(1 - 1 + paramInt3)] / (paramArrayOfDouble1[(1 - 1 + paramInt2)] - paramArrayOfDouble1[(2 - 1 + paramInt2)] - d18);
        d1 = d4 * (paramArrayOfDouble1[(2 - 1 + paramInt2)] + paramArrayOfDouble1[(3 - 1 + paramInt2)]) + paramArrayOfDouble2[(2 - 1 + paramInt3)] + paramArrayOfDouble2[(3 - 1 + paramInt3)];
        d2 = d4 * paramArrayOfDouble1[(2 - 1 + paramInt2)] * paramArrayOfDouble1[(3 - 1 + paramInt2)] + paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble1[(3 - 1 + paramInt2)] + paramArrayOfDouble2[(3 - 1 + paramInt3)] * paramArrayOfDouble1[(2 - 1 + paramInt2)];
      }
      else
      {
        d18 = (paramArrayOfDouble1[(1 - 1 + paramInt2)] - paramArrayOfDouble1[(2 - 1 + paramInt2)]) / 2.0D;
        d4 = paramDouble1 + paramArrayOfDouble2[(3 - 1 + paramInt3)] / (paramArrayOfDouble1[(3 - 1 + paramInt2)] - paramArrayOfDouble1[(2 - 1 + paramInt2)] - d18);
        d1 = d4 * (paramArrayOfDouble1[(1 - 1 + paramInt2)] + paramArrayOfDouble1[(2 - 1 + paramInt2)]) + paramArrayOfDouble2[(1 - 1 + paramInt3)] + paramArrayOfDouble2[(2 - 1 + paramInt3)];
        d2 = d4 * paramArrayOfDouble1[(1 - 1 + paramInt2)] * paramArrayOfDouble1[(2 - 1 + paramInt2)] + paramArrayOfDouble2[(1 - 1 + paramInt3)] * paramArrayOfDouble1[(2 - 1 + paramInt2)] + paramArrayOfDouble2[(2 - 1 + paramInt3)] * paramArrayOfDouble1[(1 - 1 + paramInt2)];
      }
      d18 = Util.max(Math.abs(d1), Math.abs(d2), Math.abs(d4));
      d1 /= d18;
      d2 /= d18;
      d4 /= d18;
      if ((d4 != 0.0D ? 0 : 1) != 0) {
        paramdoubleW.val = (d2 / d1);
      } else if ((d1 > 0.0D ? 0 : 1) != 0) {
        paramdoubleW.val = ((d1 - Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d4))) / (2.0D * d4));
      } else {
        paramdoubleW.val = (2.0D * d2 / (d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d4))));
      }
      if ((paramdoubleW.val >= d23 ? 0 : 1) == 0) {}
      if (((paramdoubleW.val <= d24 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramdoubleW.val = ((d23 + d24) / 2.0D);
      }
      if ((paramArrayOfDouble1[(1 - 1 + paramInt2)] != paramdoubleW.val ? 0 : 1) == 0) {}
      if (((paramArrayOfDouble1[(2 - 1 + paramInt2)] != paramdoubleW.val ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((paramArrayOfDouble1[(3 - 1 + paramInt2)] != paramdoubleW.val ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramdoubleW.val = 0.0D;
      }
      else
      {
        d18 = paramDouble2 + paramdoubleW.val * paramArrayOfDouble2[(1 - 1 + paramInt3)] / (paramArrayOfDouble1[(1 - 1 + paramInt2)] * (paramArrayOfDouble1[(1 - 1 + paramInt2)] - paramdoubleW.val)) + paramdoubleW.val * paramArrayOfDouble2[(2 - 1 + paramInt3)] / (paramArrayOfDouble1[(2 - 1 + paramInt2)] * (paramArrayOfDouble1[(2 - 1 + paramInt2)] - paramdoubleW.val)) + paramdoubleW.val * paramArrayOfDouble2[(3 - 1 + paramInt3)] / (paramArrayOfDouble1[(3 - 1 + paramInt2)] * (paramArrayOfDouble1[(3 - 1 + paramInt2)] - paramdoubleW.val));
        if ((d18 > 0.0D ? 0 : 1) != 0) {
          d23 = paramdoubleW.val;
        } else {
          d24 = paramdoubleW.val;
        }
        if ((Math.abs(paramDouble2) > Math.abs(d18) ? 0 : 1) != 0) {
          paramdoubleW.val = 0.0D;
        }
      }
    }
    d7 = Dlamch.dlamch("Epsilon");
    d3 = Dlamch.dlamch("Base");
    d14 = Math.pow(d3, (int)(Math.log(Dlamch.dlamch("SafMin")) / Math.log(d3) / 3.0D));
    d16 = 1.0D / d14;
    d15 = d14 * d14;
    d17 = d16 * d16;
    if (paramBoolean) {
      d18 = Math.min(Math.abs(paramArrayOfDouble1[(2 - 1 + paramInt2)] - paramdoubleW.val), Math.abs(paramArrayOfDouble1[(3 - 1 + paramInt2)] - paramdoubleW.val));
    } else {
      d18 = Math.min(Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt2)] - paramdoubleW.val), Math.abs(paramArrayOfDouble1[(2 - 1 + paramInt2)] - paramdoubleW.val));
    }
    i = 0;
    if ((d18 > d14 ? 0 : 1) != 0)
    {
      i = 1;
      if ((d18 > d15 ? 0 : 1) != 0)
      {
        d12 = d17;
        d13 = d15;
      }
      else
      {
        d12 = d16;
        d13 = d14;
      }
      j = 1;
      for (n = 3 - 1 + 1; n > 0; n--)
      {
        arrayOfDouble1[(j - 1)] = (paramArrayOfDouble1[(j - 1 + paramInt2)] * d12);
        arrayOfDouble2[(j - 1)] = (paramArrayOfDouble2[(j - 1 + paramInt3)] * d12);
        j += 1;
      }
      paramdoubleW.val *= d12;
      d23 *= d12;
      d24 *= d12;
    }
    else
    {
      j = 1;
      for (n = 3 - 1 + 1; n > 0; n--)
      {
        arrayOfDouble1[(j - 1)] = paramArrayOfDouble1[(j - 1 + paramInt2)];
        arrayOfDouble2[(j - 1)] = paramArrayOfDouble2[(j - 1 + paramInt3)];
        j += 1;
      }
    }
    d11 = 0.0D;
    d6 = 0.0D;
    d5 = 0.0D;
    j = 1;
    for (int n = 3 - 1 + 1; n > 0; n--)
    {
      d18 = 1.0D / (arrayOfDouble1[(j - 1)] - paramdoubleW.val);
      d19 = arrayOfDouble2[(j - 1)] * d18;
      d20 = d19 * d18;
      d21 = d20 * d18;
      d11 += d19 / arrayOfDouble1[(j - 1)];
      d6 += d20;
      d5 += d21;
      j += 1;
    }
    d10 = paramDouble2 + paramdoubleW.val * d11;
    if ((Math.abs(d10) > 0.0D ? 0 : 1) == 0)
    {
      if ((d10 > 0.0D ? 0 : 1) != 0) {
        d23 = paramdoubleW.val;
      } else {
        d24 = paramdoubleW.val;
      }
      k = m + 1;
      m = k;
      for (n = 40 - k + 1; n > 0; n--)
      {
        if (paramBoolean)
        {
          d19 = arrayOfDouble1[(2 - 1)] - paramdoubleW.val;
          d20 = arrayOfDouble1[(3 - 1)] - paramdoubleW.val;
        }
        else
        {
          d19 = arrayOfDouble1[(1 - 1)] - paramdoubleW.val;
          d20 = arrayOfDouble1[(2 - 1)] - paramdoubleW.val;
        }
        d1 = (d19 + d20) * d10 - d19 * d20 * d6;
        d2 = d19 * d20 * d10;
        d4 = d10 - (d19 + d20) * d6 + d19 * d20 * d5;
        d18 = Util.max(Math.abs(d1), Math.abs(d2), Math.abs(d4));
        d1 /= d18;
        d2 /= d18;
        d4 /= d18;
        if ((d4 != 0.0D ? 0 : 1) != 0) {
          d9 = d2 / d1;
        } else if ((d1 > 0.0D ? 0 : 1) != 0) {
          d9 = (d1 - Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d4))) / (2.0D * d4);
        } else {
          d9 = 2.0D * d2 / (d1 + Math.sqrt(Math.abs(d1 * d1 - 4.0D * d2 * d4)));
        }
        if ((d10 * d9 < 0.0D ? 0 : 1) != 0) {
          d9 = -(d10 / d6);
        }
        paramdoubleW.val += d9;
        if ((paramdoubleW.val >= d23 ? 0 : 1) == 0) {}
        if (((paramdoubleW.val <= d24 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramdoubleW.val = ((d23 + d24) / 2.0D);
        }
        d11 = 0.0D;
        d8 = 0.0D;
        d6 = 0.0D;
        d5 = 0.0D;
        j = 1;
        for (int i1 = 3 - 1 + 1; i1 > 0; i1--)
        {
          d18 = 1.0D / (arrayOfDouble1[(j - 1)] - paramdoubleW.val);
          d19 = arrayOfDouble2[(j - 1)] * d18;
          d20 = d19 * d18;
          d21 = d20 * d18;
          d22 = d19 / arrayOfDouble1[(j - 1)];
          d11 += d22;
          d8 += Math.abs(d22);
          d6 += d20;
          d5 += d21;
          j += 1;
        }
        d10 = paramDouble2 + paramdoubleW.val * d11;
        d8 = 8.0D * (Math.abs(paramDouble2) + Math.abs(paramdoubleW.val) * d8) + Math.abs(paramdoubleW.val) * d6;
        if ((Math.abs(d10) > d7 * d8 ? 0 : 1) != 0) {
          break;
        }
        if ((d10 > 0.0D ? 0 : 1) != 0) {
          d23 = paramdoubleW.val;
        } else {
          d24 = paramdoubleW.val;
        }
        m += 1;
      }
      paramintW.val = 1;
    }
    if (i != 0) {
      paramdoubleW.val *= d13;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaed6.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */