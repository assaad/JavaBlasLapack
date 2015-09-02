package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlazq3
{
  public static void dlazq3(int paramInt1, intW paramintW1, double[] paramArrayOfDouble, int paramInt2, int paramInt3, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, intW paramintW2, intW paramintW3, intW paramintW4, boolean paramBoolean, intW paramintW5, doubleW paramdoubleW5, doubleW paramdoubleW6, doubleW paramdoubleW7, doubleW paramdoubleW8, doubleW paramdoubleW9, doubleW paramdoubleW10)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double d1 = 0.0D;
    doubleW localdoubleW = new doubleW(0.0D);
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
    localdoubleW.val = 0.0D;
    for (;;)
    {
      if ((paramintW1.val >= paramInt1 ? 0 : 1) != 0) {
        return;
      }
      if ((paramintW1.val != paramInt1 ? 0 : 1) == 0)
      {
        m = 4 * paramintW1.val + paramInt3;
        if ((paramintW1.val != paramInt1 + 1 ? 0 : 1) != 0) {
          break label381;
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
      label381:
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
        paramdoubleW6.val = Math.min(paramdoubleW6.val, paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)]);
        paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)] = Util.min(paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramInt1 + paramInt3 - 1 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramInt1 + paramInt3 + 3 - 1 + paramInt2)]);
        paramArrayOfDouble[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)] = Util.min(paramArrayOfDouble[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramInt1 - paramInt3 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramInt1 - paramInt3 + 4 - 1 + paramInt2)]);
        paramdoubleW4.val = Util.max(paramdoubleW4.val, paramArrayOfDouble[(4 * paramInt1 + paramInt3 - 3 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramInt1 + paramInt3 + 1 - 1 + paramInt2)]);
        paramdoubleW1.val = 0.0D;
      }
    }
    if ((paramdoubleW1.val >= 0.0D ? 0 : 1) == 0) {}
    if (((d3 * paramdoubleW4.val >= Util.min(paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)], paramArrayOfDouble[(4 * paramintW1.val + paramInt3 - 9 - 1 + paramInt2)], paramdoubleW6.val + paramArrayOfDouble[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)]) ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Dlazq4.dlazq4(paramInt1, paramintW1.val, paramArrayOfDouble, paramInt2, paramInt3, k, paramdoubleW1.val, paramdoubleW5.val, paramdoubleW6.val, paramdoubleW7.val, paramdoubleW8.val, paramdoubleW9.val, paramdoubleW10, paramintW5, localdoubleW);
      for (;;)
      {
        Dlasq5.dlasq5(paramInt1, paramintW1.val, paramArrayOfDouble, paramInt2, paramInt3, paramdoubleW10.val, paramdoubleW1, paramdoubleW5, paramdoubleW6, paramdoubleW7, paramdoubleW8, paramdoubleW9, paramBoolean);
        paramintW4.val += paramintW1.val - paramInt1 + 2;
        paramintW3.val += 1;
        if ((paramdoubleW1.val < 0.0D ? 0 : 1) != 0) {}
        if (((paramdoubleW5.val <= 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          break label2101;
        }
        if ((paramdoubleW1.val >= 0.0D ? 0 : 1) != 0) {}
        if (((paramdoubleW5.val <= 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((paramArrayOfDouble[(4 * (paramintW1.val - 1) - paramInt3 - 1 + paramInt2)] >= d6 * (paramdoubleW2.val + paramdoubleW8.val) ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((Math.abs(paramdoubleW7.val) >= d6 * paramdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramArrayOfDouble[(4 * (paramintW1.val - 1) - paramInt3 + 2 - 1 + paramInt2)] = 0.0D;
          paramdoubleW1.val = 0.0D;
          break label2101;
        }
        if ((paramdoubleW1.val >= 0.0D ? 0 : 1) != 0)
        {
          paramintW2.val += 1;
          if ((paramintW5.val >= -22 ? 0 : 1) != 0)
          {
            paramdoubleW10.val = 0.0D;
          }
          else if ((paramdoubleW5.val <= 0.0D ? 0 : 1) != 0)
          {
            paramdoubleW10.val = ((paramdoubleW10.val + paramdoubleW1.val) * (1.0D - 2.0D * d1));
            paramintW5.val -= 11;
          }
          else
          {
            paramdoubleW10.val = (0.25D * paramdoubleW10.val);
            paramintW5.val -= 12;
          }
        }
        else
        {
          if ((paramdoubleW1.val == paramdoubleW1.val ? 0 : 1) == 0) {
            break;
          }
          paramdoubleW10.val = 0.0D;
        }
      }
    }
    Dlasq6.dlasq6(paramInt1, paramintW1.val, paramArrayOfDouble, paramInt2, paramInt3, paramdoubleW1, paramdoubleW5, paramdoubleW6, paramdoubleW7, paramdoubleW8, paramdoubleW9);
    paramintW4.val += paramintW1.val - paramInt1 + 2;
    paramintW3.val += 1;
    paramdoubleW10.val = 0.0D;
    label2101:
    if ((paramdoubleW10.val >= paramdoubleW2.val ? 0 : 1) != 0)
    {
      paramdoubleW3.val += paramdoubleW10.val;
      d4 = paramdoubleW2.val + paramdoubleW3.val;
      paramdoubleW3.val -= d4 - paramdoubleW2.val;
    }
    else
    {
      d4 = paramdoubleW2.val + paramdoubleW10.val;
      paramdoubleW3.val = (paramdoubleW2.val - (d4 - paramdoubleW10.val) + paramdoubleW3.val);
    }
    paramdoubleW2.val = d4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlazq3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */