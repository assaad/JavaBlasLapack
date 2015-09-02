package org.netlib.lapack;

import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaln2
{
  public static boolean[] rswap = { false, true, false, true };
  public static boolean[] zswap;
  public static int[] ipivot = { 1, 2, 3, 4, 2, 1, 4, 3, 3, 4, 1, 2, 4, 3, 2, 1 };
  public static double[] ci_civ = new double[2 * 2];
  public static double[] cr_crv = new double[2 * 2];
  
  static
  {
    zswap = new boolean[] { false, false, true, true };
  }
  
  public static void dlaln2(boolean paramBoolean, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double paramDouble3, double paramDouble4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double paramDouble5, double paramDouble6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, doubleW paramdoubleW1, doubleW paramdoubleW2, intW paramintW)
  {
    int i = 0;
    int j = 0;
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
    double d26 = 0.0D;
    double d27 = 0.0D;
    double d28 = 0.0D;
    double d29 = 0.0D;
    double d30 = 0.0D;
    double d31 = 0.0D;
    double d32 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d33 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    d19 = 2.0D * Dlamch.dlamch("Safe minimum");
    d4 = 1.0D / d19;
    d18 = Math.max(paramDouble1, d19);
    paramintW.val = 0;
    paramdoubleW1.val = 1.0D;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((paramInt2 != 1 ? 0 : 1) != 0)
      {
        d15 = paramDouble2 * paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] - paramDouble5 * paramDouble3;
        d11 = Math.abs(d15);
        if ((d11 >= d18 ? 0 : 1) != 0)
        {
          d15 = d18;
          d11 = d18;
          paramintW.val = 1;
        }
        d5 = Math.abs(paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
        if ((d11 >= 1.0D ? 0 : 1) != 0) {}
        if (((d5 <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((d5 <= d4 * d11 ? 0 : 1) != 0) {
            paramdoubleW1.val = (1.0D / d5);
          }
        }
        paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)] * paramdoubleW1.val / d15);
        paramdoubleW2.val = Math.abs(paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
      }
      else
      {
        d15 = paramDouble2 * paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] - paramDouble5 * paramDouble3;
        d14 = -(paramDouble6 * paramDouble3);
        d11 = Math.abs(d15) + Math.abs(d14);
        if ((d11 >= d18 ? 0 : 1) != 0)
        {
          d15 = d18;
          d14 = 0.0D;
          d11 = d18;
          paramintW.val = 1;
        }
        d5 = Math.abs(paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]) + Math.abs(paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)]);
        if ((d11 >= 1.0D ? 0 : 1) != 0) {}
        if (((d5 <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((d5 <= d4 * d11 ? 0 : 1) != 0) {
            paramdoubleW1.val = (1.0D / d5);
          }
        }
        dladiv_adapter(paramdoubleW1.val * paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)], paramdoubleW1.val * paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)], d15, d14, paramArrayOfDouble3, 1 - 1 + (1 - 1) * paramInt8 + paramInt7, paramArrayOfDouble3, 1 - 1 + (2 - 1) * paramInt8 + paramInt7);
        paramdoubleW2.val = (Math.abs(paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfDouble3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)]));
      }
    }
    else
    {
      cr_crv[(1 - 1 + (1 - 1) * 2)] = (paramDouble2 * paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] - paramDouble5 * paramDouble3);
      cr_crv[(2 - 1 + (2 - 1) * 2)] = (paramDouble2 * paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)] - paramDouble5 * paramDouble4);
      if (paramBoolean)
      {
        cr_crv[(1 - 1 + (2 - 1) * 2)] = (paramDouble2 * paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
        cr_crv[(2 - 1 + (1 - 1) * 2)] = (paramDouble2 * paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
      }
      else
      {
        cr_crv[(2 - 1 + (1 - 1) * 2)] = (paramDouble2 * paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
        cr_crv[(1 - 1 + (2 - 1) * 2)] = (paramDouble2 * paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
      }
      int k;
      if ((paramInt2 != 1 ? 0 : 1) != 0)
      {
        d10 = 0.0D;
        i = 0;
        j = 1;
        for (k = 4 - 1 + 1; k > 0; k--)
        {
          if ((Math.abs(cr_crv[(j - 1)]) <= d10 ? 0 : 1) != 0)
          {
            d10 = Math.abs(cr_crv[(j - 1)]);
            i = j;
          }
          j += 1;
        }
        if ((d10 >= d18 ? 0 : 1) != 0)
        {
          d5 = Math.max(Math.abs(paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]), Math.abs(paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)]));
          if ((d18 >= 1.0D ? 0 : 1) != 0) {}
          if (((d5 <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
            if ((d5 <= d4 * d18 ? 0 : 1) != 0) {
              paramdoubleW1.val = (1.0D / d5);
            }
          }
          d20 = paramdoubleW1.val / d18;
          paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
          paramArrayOfDouble3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
          paramdoubleW2.val = (d20 * d5);
          paramintW.val = 1;
          return;
        }
        d27 = cr_crv[(i - 1)];
        d12 = cr_crv[(ipivot[(2 - 1 + (i - 1) * 4)] - 1)];
        d29 = cr_crv[(ipivot[(3 - 1 + (i - 1) * 4)] - 1)];
        d13 = cr_crv[(ipivot[(4 - 1 + (i - 1) * 4)] - 1)];
        d28 = 1.0D / d27;
        d17 = d28 * d12;
        d31 = d13 - d29 * d17;
        if ((Math.abs(d31) >= d18 ? 0 : 1) != 0)
        {
          d31 = d18;
          paramintW.val = 1;
        }
        if (rswap[(i - 1)] != 0)
        {
          d6 = paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          d7 = paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)];
        }
        else
        {
          d6 = paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          d7 = paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)];
        }
        d7 -= d17 * d6;
        d1 = Math.max(Math.abs(d6 * (d31 * d28)), Math.abs(d7));
        if ((d1 <= 1.0D ? 0 : 1) != 0) {}
        if (((Math.abs(d31) >= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((d1 < d4 * Math.abs(d31) ? 0 : 1) != 0) {
            paramdoubleW1.val = (1.0D / d1);
          }
        }
        localdoubleW2.val = (d7 * paramdoubleW1.val / d31);
        d33 = paramdoubleW1.val * d6 * d28 - localdoubleW2.val * (d28 * d29);
        if (zswap[(i - 1)] != 0)
        {
          paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = localdoubleW2.val;
          paramArrayOfDouble3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = d33;
        }
        else
        {
          paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = d33;
          paramArrayOfDouble3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = localdoubleW2.val;
        }
        paramdoubleW2.val = Math.max(Math.abs(d33), Math.abs(localdoubleW2.val));
        if ((paramdoubleW2.val <= 1.0D ? 0 : 1) != 0) {}
        if (((d10 <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((paramdoubleW2.val <= d4 / d10 ? 0 : 1) != 0)
          {
            d20 = d10 / d4;
            paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
            paramArrayOfDouble3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
            paramdoubleW2.val = (d20 * paramdoubleW2.val);
            paramdoubleW1.val = (d20 * paramdoubleW1.val);
          }
        }
      }
      else
      {
        ci_civ[(1 - 1 + (1 - 1) * 2)] = (-(paramDouble6 * paramDouble3));
        ci_civ[(2 - 1 + (1 - 1) * 2)] = 0.0D;
        ci_civ[(1 - 1 + (2 - 1) * 2)] = 0.0D;
        ci_civ[(2 - 1 + (2 - 1) * 2)] = (-(paramDouble6 * paramDouble4));
        d10 = 0.0D;
        i = 0;
        j = 1;
        for (k = 4 - 1 + 1; k > 0; k--)
        {
          if ((Math.abs(cr_crv[(j - 1)]) + Math.abs(ci_civ[(j - 1)]) <= d10 ? 0 : 1) != 0)
          {
            d10 = Math.abs(cr_crv[(j - 1)]) + Math.abs(ci_civ[(j - 1)]);
            i = j;
          }
          j += 1;
        }
        if ((d10 >= d18 ? 0 : 1) != 0)
        {
          d5 = Math.max(Math.abs(paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]) + Math.abs(paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)]), Math.abs(paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)]) + Math.abs(paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt6 + paramInt5)]));
          if ((d18 >= 1.0D ? 0 : 1) != 0) {}
          if (((d5 <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
            if ((d5 <= d4 * d18 ? 0 : 1) != 0) {
              paramdoubleW1.val = (1.0D / d5);
            }
          }
          d20 = paramdoubleW1.val / d18;
          paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
          paramArrayOfDouble3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
          paramArrayOfDouble3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)]);
          paramArrayOfDouble3[(2 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt6 + paramInt5)]);
          paramdoubleW2.val = (d20 * d5);
          paramintW.val = 1;
          return;
        }
        d27 = cr_crv[(i - 1)];
        d22 = ci_civ[(i - 1)];
        d12 = cr_crv[(ipivot[(2 - 1 + (i - 1) * 4)] - 1)];
        d8 = ci_civ[(ipivot[(2 - 1 + (i - 1) * 4)] - 1)];
        d29 = cr_crv[(ipivot[(3 - 1 + (i - 1) * 4)] - 1)];
        d24 = ci_civ[(ipivot[(3 - 1 + (i - 1) * 4)] - 1)];
        d13 = cr_crv[(ipivot[(4 - 1 + (i - 1) * 4)] - 1)];
        d9 = ci_civ[(ipivot[(4 - 1 + (i - 1) * 4)] - 1)];
        if ((i != 1 ? 0 : 1) == 0) {}
        if (((i != 4 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          if ((Math.abs(d27) <= Math.abs(d22) ? 0 : 1) != 0)
          {
            d20 = d22 / d27;
            d28 = 1.0D / (d27 * (1.0D + Math.pow(d20, 2)));
            d23 = -(d20 * d28);
          }
          else
          {
            d20 = d27 / d22;
            d23 = -(1.0D / (d22 * (1.0D + Math.pow(d20, 2))));
            d28 = -(d20 * d23);
          }
          d17 = d12 * d28;
          d16 = d12 * d23;
          d30 = d29 * d28;
          d25 = d29 * d23;
          d31 = d13 - d29 * d17;
          d26 = d9 - d29 * d16;
        }
        else
        {
          d28 = 1.0D / d27;
          d23 = 0.0D;
          d17 = d12 * d28;
          d16 = d8 * d28;
          d30 = d29 * d28;
          d25 = d24 * d28;
          d31 = d13 - d29 * d17 + d24 * d16;
          d26 = -(d29 * d16) - d24 * d17;
        }
        d21 = Math.abs(d31) + Math.abs(d26);
        if ((d21 >= d18 ? 0 : 1) != 0)
        {
          d31 = d18;
          d26 = 0.0D;
          paramintW.val = 1;
        }
        if (rswap[(i - 1)] != 0)
        {
          d7 = paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          d6 = paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          d3 = paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)];
          d2 = paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt6 + paramInt5)];
        }
        else
        {
          d6 = paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          d7 = paramArrayOfDouble2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          d2 = paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)];
          d3 = paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt6 + paramInt5)];
        }
        d7 = d7 - d17 * d6 + d16 * d2;
        d3 = d3 - d16 * d6 - d17 * d2;
        d1 = Math.max((Math.abs(d6) + Math.abs(d2)) * (d21 * (Math.abs(d28) + Math.abs(d23))), Math.abs(d7) + Math.abs(d3));
        if ((d1 <= 1.0D ? 0 : 1) != 0) {}
        if (((d21 >= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((d1 < d4 * d21 ? 0 : 1) != 0)
          {
            paramdoubleW1.val = (1.0D / d1);
            d6 = paramdoubleW1.val * d6;
            d2 = paramdoubleW1.val * d2;
            d7 = paramdoubleW1.val * d7;
            d3 = paramdoubleW1.val * d3;
          }
        }
        Dladiv.dladiv(d7, d3, d31, d26, localdoubleW2, localdoubleW1);
        d33 = d28 * d6 - d23 * d2 - d30 * localdoubleW2.val + d25 * localdoubleW1.val;
        d32 = d23 * d6 + d28 * d2 - d25 * localdoubleW2.val - d30 * localdoubleW1.val;
        if (zswap[(i - 1)] != 0)
        {
          paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = localdoubleW2.val;
          paramArrayOfDouble3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = d33;
          paramArrayOfDouble3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = localdoubleW1.val;
          paramArrayOfDouble3[(2 - 1 + (2 - 1) * paramInt8 + paramInt7)] = d32;
        }
        else
        {
          paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = d33;
          paramArrayOfDouble3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = localdoubleW2.val;
          paramArrayOfDouble3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = d32;
          paramArrayOfDouble3[(2 - 1 + (2 - 1) * paramInt8 + paramInt7)] = localdoubleW1.val;
        }
        paramdoubleW2.val = Math.max(Math.abs(d33) + Math.abs(d32), Math.abs(localdoubleW2.val) + Math.abs(localdoubleW1.val));
        if ((paramdoubleW2.val <= 1.0D ? 0 : 1) != 0) {}
        if (((d10 <= 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((paramdoubleW2.val <= d4 / d10 ? 0 : 1) != 0)
          {
            d20 = d10 / d4;
            paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
            paramArrayOfDouble3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
            paramArrayOfDouble3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)]);
            paramArrayOfDouble3[(2 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (d20 * paramArrayOfDouble3[(2 - 1 + (2 - 1) * paramInt8 + paramInt7)]);
            paramdoubleW2.val = (d20 * paramdoubleW2.val);
            paramdoubleW1.val = (d20 * paramdoubleW1.val);
          }
        }
      }
    }
  }
  
  private static void dladiv_adapter(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt1]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble2[paramInt2]);
    Dladiv.dladiv(paramDouble1, paramDouble2, paramDouble3, paramDouble4, localdoubleW1, localdoubleW2);
    paramArrayOfDouble1[paramInt1] = localdoubleW1.val;
    paramArrayOfDouble2[paramInt2] = localdoubleW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaln2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */