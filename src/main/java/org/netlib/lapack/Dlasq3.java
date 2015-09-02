package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasq3
{
  public static intW ttype = new intW(0);
  public static doubleW dmin1 = new doubleW(0.0D);
  public static doubleW dmin2;
  public static doubleW dn;
  public static doubleW dn1;
  public static doubleW dn2;
  public static doubleW tau = new doubleW(0.0D);
  
  static
  {
    dn2 = new doubleW(0.0D);
    dn1 = new doubleW(0.0D);
    dn = new doubleW(0.0D);
    dmin2 = new doubleW(0.0D);
  }
  
  public static void dlasq3(int paramInt1, intW paramintW1, double[] paramArrayOfDouble, int paramInt2, int paramInt3, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, intW paramintW2, intW paramintW3, intW paramintW4, boolean paramBoolean)
  {
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
    k = paramintW1.val;
    d1 = Dlamch.dlamch("Precision");
    d3 = Dlamch.dlamch("Safe minimum");
    d6 = d1 * 100.0D;
    d7 = Math.pow(d6, 2);
    for (;;)
    {
      if ((paramintW1.val >= paramInt1 ? 0 : 1) != 0) {
        return;
      }
      if ((paramintW1.val != paramInt1 ? 0 : 1) == 0)
      {
        m = 4 * paramintW1.val + paramInt3;
        if ((paramintW1.val != paramInt1 + 1 ? 0 : 1) != 0) {
          break label365;
        }
        if ((paramArrayOfDouble[(m - 5 - 1 + paramInt2)] <= d7 * (paramdoubleW2.val + paramArrayOfDouble[(m - 3 - 1 + paramInt2)]) ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble[(m - 2 * paramInt3 - 4 - 1 + paramInt2)] <= d7 * paramArrayOfDouble[(m - 7 - 1 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0) {}
      }
      else
      {
        paramArrayOfDouble[(4 * paramintW1.val - 3 - 1 + paramInt2)] = (paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 3 - 1 + paramInt2)] + paramdoubleW2.val);
        paramintW1.val -= 1;
        continue;
      }
      if ((paramArrayOfDouble[(m - 9 - 1 + paramInt2)] <= d7 * paramdoubleW2.val ? 0 : 1) != 0) {}
      if (((paramArrayOfDouble[(m - 2 * paramInt3 - 8 - 1 + paramInt2)] <= d7 * paramArrayOfDouble[(m - 11 - 1 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0) {
        break;
      }
      label365:
      if ((paramArrayOfDouble[(m - 3 - 1 + paramInt2)] <= paramArrayOfDouble[(m - 7 - 1 + paramInt2)] ? 0 : 1) != 0)
      {
        d2 = paramArrayOfDouble[(m - 3 - 1 + paramInt2)];
        paramArrayOfDouble[(m - 3 - 1 + paramInt2)] = paramArrayOfDouble[(m - 7 - 1 + paramInt2)];
        paramArrayOfDouble[(m - 7 - 1 + paramInt2)] = d2;
      }
      if ((paramArrayOfDouble[(m - 5 - 1 + paramInt2)] <= paramArrayOfDouble[(m - 3 - 1 + paramInt2)] * d7 ? 0 : 1) != 0)
      {
        d4 = 0.5D * (paramArrayOfDouble[(m - 7 - 1 + paramInt2)] - paramArrayOfDouble[(m - 3 - 1 + paramInt2)] + paramArrayOfDouble[(m - 5 - 1 + paramInt2)]);
        d2 = paramArrayOfDouble[(m - 3 - 1 + paramInt2)] * (paramArrayOfDouble[(m - 5 - 1 + paramInt2)] / d4);
        if ((d2 > d4 ? 0 : 1) != 0) {
          d2 = paramArrayOfDouble[(m - 3 - 1 + paramInt2)] * (paramArrayOfDouble[(m - 5 - 1 + paramInt2)] / (d4 * (1.0D + Math.sqrt(1.0D + d2 / d4))));
        } else {
          d2 = paramArrayOfDouble[(m - 3 - 1 + paramInt2)] * (paramArrayOfDouble[(m - 5 - 1 + paramInt2)] / (d4 + Math.sqrt(d4) * Math.sqrt(d4 + d2)));
        }
        d4 = paramArrayOfDouble[(m - 7 - 1 + paramInt2)] + (d2 + paramArrayOfDouble[(m - 5 - 1 + paramInt2)]);
        paramArrayOfDouble[(m - 3 - 1 + paramInt2)] *= paramArrayOfDouble[(m - 7 - 1 + paramInt2)] / d4;
        paramArrayOfDouble[(m - 7 - 1 + paramInt2)] = d4;
      }
      paramArrayOfDouble[(4 * paramintW1.val - 7 - 1 + paramInt2)] = (paramArrayOfDouble[(m - 7 - 1 + paramInt2)] + paramdoubleW2.val);
      paramArrayOfDouble[(4 * paramintW1.val - 3 - 1 + paramInt2)] = (paramArrayOfDouble[(m - 3 - 1 + paramInt2)] + paramdoubleW2.val);
      paramintW1.val -= 2;
    }
    if ((paramdoubleW1.val > 0.0D ? 0 : 1) == 0) {}
    if (((paramintW1.val >= k ? 0 : 1) == 0 ? 0 : 1) != 0) {
      if ((1.5D * paramArrayOfDouble[(4 * paramInt1 + paramInt3 - 3 - 1 + paramInt2)] >= paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 3 - 1 + paramInt2)] ? 0 : 1) != 0)
      {
        i = 4 * (paramInt1 + paramintW1.val);
        j = 4 * paramInt1;
        for (int n = (2 * (paramInt1 + paramintW1.val - 1) - 4 * paramInt1 + 4) / 4; n > 0; n--)
        {
          d5 = paramArrayOfDouble[(j - 3 - 1 + paramInt2)];
          paramArrayOfDouble[(j - 3 - 1 + paramInt2)] = paramArrayOfDouble[(i - j - 3 - 1 + paramInt2)];
          paramArrayOfDouble[(i - j - 3 - 1 + paramInt2)] = d5;
          d5 = paramArrayOfDouble[(j - 2 - 1 + paramInt2)];
          paramArrayOfDouble[(j - 2 - 1 + paramInt2)] = paramArrayOfDouble[(i - j - 2 - 1 + paramInt2)];
          paramArrayOfDouble[(i - j - 2 - 1 + paramInt2)] = d5;
          d5 = paramArrayOfDouble[(j - 1 - 1 + paramInt2)];
          paramArrayOfDouble[(j - 1 - 1 + paramInt2)] = paramArrayOfDouble[(i - j - 5 - 1 + paramInt2)];
          paramArrayOfDouble[(i - j - 5 - 1 + paramInt2)] = d5;
          d5 = paramArrayOfDouble[(j - 1 + paramInt2)];
          paramArrayOfDouble[(j - 1 + paramInt2)] = paramArrayOfDouble[(i - j - 4 - 1 + paramInt2)];
          paramArrayOfDouble[(i - j - 4 - 1 + paramInt2)] = d5;
          j += 4;
        }
        if ((paramintW1.val - paramInt1 > 4 ? 0 : 1) != 0)
        {
          paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)] = paramArrayOfDouble[(4 * paramInt1 + paramInt3 - 1 - 1 + paramInt2)];
          paramArrayOfDouble[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)] = paramArrayOfDouble[(4 * paramInt1 - paramInt3 - 1 + paramInt2)];
        }
        dmin2.val = Math.min(dmin2.val, paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)]);
        paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)] = Util.min(paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramInt1 + paramInt3 - 1 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramInt1 + paramInt3 + 3 - 1 + paramInt2)]);
        paramArrayOfDouble[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)] = Util.min(paramArrayOfDouble[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramInt1 - paramInt3 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramInt1 - paramInt3 + 4 - 1 + paramInt2)]);
        paramdoubleW4.val = Util.max(paramdoubleW4.val, paramArrayOfDouble[(4 * paramInt1 + paramInt3 - 3 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramInt1 + paramInt3 + 1 - 1 + paramInt2)]);
        paramdoubleW1.val = 0.0D;
      }
    }
    if ((paramdoubleW1.val >= 0.0D ? 0 : 1) == 0) {}
    if (((d3 * paramdoubleW4.val >= Util.min(paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 9 - 1 + paramInt2)], dmin2.val + paramArrayOfDouble[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)]) ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Dlasq4.dlasq4(paramInt1, paramintW1.val, paramArrayOfDouble, paramInt2, paramInt3, k, paramdoubleW1.val, dmin1.val, dmin2.val, dn.val, dn1.val, dn2.val, tau, ttype);
      for (;;)
      {
        Dlasq5.dlasq5(paramInt1, paramintW1.val, paramArrayOfDouble, paramInt2, paramInt3, tau.val, paramdoubleW1, dmin1, dmin2, dn, dn1, dn2, paramBoolean);
        paramintW4.val += paramintW1.val - paramInt1 + 2;
        paramintW3.val += 1;
        if ((paramdoubleW1.val < 0.0D ? 0 : 1) != 0) {}
        if (((dmin1.val <= 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          break label2121;
        }
        if ((paramdoubleW1.val >= 0.0D ? 0 : 1) != 0) {}
        if (((dmin1.val <= 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((paramArrayOfDouble[(4 * (paramintW1.val - 1) - paramInt3 - 1 + paramInt2)] >= d6 * (paramdoubleW2.val + dn1.val) ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((Math.abs(dn.val) >= d6 * paramdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramArrayOfDouble[(4 * (paramintW1.val - 1) - paramInt3 + 2 - 1 + paramInt2)] = 0.0D;
          paramdoubleW1.val = 0.0D;
          break label2121;
        }
        if ((paramdoubleW1.val >= 0.0D ? 0 : 1) != 0)
        {
          paramintW2.val += 1;
          if ((ttype.val >= -22 ? 0 : 1) != 0)
          {
            tau.val = 0.0D;
          }
          else if ((dmin1.val <= 0.0D ? 0 : 1) != 0)
          {
            tau.val = ((tau.val + paramdoubleW1.val) * (1.0D - 2.0D * d1));
            ttype.val -= 11;
          }
          else
          {
            tau.val = (0.25D * tau.val);
            ttype.val -= 12;
          }
        }
        else
        {
          if ((paramdoubleW1.val == paramdoubleW1.val ? 0 : 1) == 0) {
            break;
          }
          tau.val = 0.0D;
        }
      }
    }
    Dlasq6.dlasq6(paramInt1, paramintW1.val, paramArrayOfDouble, paramInt2, paramInt3, paramdoubleW1, dmin1, dmin2, dn, dn1, dn2);
    paramintW4.val += paramintW1.val - paramInt1 + 2;
    paramintW3.val += 1;
    tau.val = 0.0D;
    label2121:
    if ((tau.val >= paramdoubleW2.val ? 0 : 1) != 0)
    {
      paramdoubleW3.val += tau.val;
      d4 = paramdoubleW2.val + paramdoubleW3.val;
      paramdoubleW3.val -= d4 - paramdoubleW2.val;
    }
    else
    {
      d4 = paramdoubleW2.val + tau.val;
      paramdoubleW3.val = (paramdoubleW2.val - (d4 - tau.val) + paramdoubleW3.val);
    }
    paramdoubleW2.val = d4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasq3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */