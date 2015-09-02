package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasq3
{
  public static intW ttype = new intW(0);
  public static floatW dmin1 = new floatW(0.0F);
  public static floatW dmin2;
  public static floatW dn;
  public static floatW dn1;
  public static floatW dn2;
  public static floatW tau = new floatW(0.0F);
  
  static
  {
    dn2 = new floatW(0.0F);
    dn1 = new floatW(0.0F);
    dn = new floatW(0.0F);
    dmin2 = new floatW(0.0F);
  }
  
  public static void slasq3(int paramInt1, intW paramintW1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4, intW paramintW2, intW paramintW3, intW paramintW4, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    k = paramintW1.val;
    f1 = Slamch.slamch("Precision");
    f3 = Slamch.slamch("Safe minimum");
    f6 = f1 * 100.0F;
    f7 = (float)Math.pow(f6, 2);
    for (;;)
    {
      if ((paramintW1.val >= paramInt1 ? 0 : 1) != 0) {
        return;
      }
      if ((paramintW1.val != paramInt1 ? 0 : 1) == 0)
      {
        m = 4 * paramintW1.val + paramInt3;
        if ((paramintW1.val != paramInt1 + 1 ? 0 : 1) != 0) {
          break label366;
        }
        if ((paramArrayOfFloat[(m - 5 - 1 + paramInt2)] <= f7 * (paramfloatW2.val + paramArrayOfFloat[(m - 3 - 1 + paramInt2)]) ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat[(m - 2 * paramInt3 - 4 - 1 + paramInt2)] <= f7 * paramArrayOfFloat[(m - 7 - 1 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0) {}
      }
      else
      {
        paramArrayOfFloat[(4 * paramintW1.val - 3 - 1 + paramInt2)] = (paramArrayOfFloat[(4 * paramintW1.val + paramInt3 - 3 - 1 + paramInt2)] + paramfloatW2.val);
        paramintW1.val -= 1;
        continue;
      }
      if ((paramArrayOfFloat[(m - 9 - 1 + paramInt2)] <= f7 * paramfloatW2.val ? 0 : 1) != 0) {}
      if (((paramArrayOfFloat[(m - 2 * paramInt3 - 8 - 1 + paramInt2)] <= f7 * paramArrayOfFloat[(m - 11 - 1 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0) {
        break;
      }
      label366:
      if ((paramArrayOfFloat[(m - 3 - 1 + paramInt2)] <= paramArrayOfFloat[(m - 7 - 1 + paramInt2)] ? 0 : 1) != 0)
      {
        f2 = paramArrayOfFloat[(m - 3 - 1 + paramInt2)];
        paramArrayOfFloat[(m - 3 - 1 + paramInt2)] = paramArrayOfFloat[(m - 7 - 1 + paramInt2)];
        paramArrayOfFloat[(m - 7 - 1 + paramInt2)] = f2;
      }
      if ((paramArrayOfFloat[(m - 5 - 1 + paramInt2)] <= paramArrayOfFloat[(m - 3 - 1 + paramInt2)] * f7 ? 0 : 1) != 0)
      {
        f4 = 0.5F * (paramArrayOfFloat[(m - 7 - 1 + paramInt2)] - paramArrayOfFloat[(m - 3 - 1 + paramInt2)] + paramArrayOfFloat[(m - 5 - 1 + paramInt2)]);
        f2 = paramArrayOfFloat[(m - 3 - 1 + paramInt2)] * (paramArrayOfFloat[(m - 5 - 1 + paramInt2)] / f4);
        if ((f2 > f4 ? 0 : 1) != 0) {
          f2 = paramArrayOfFloat[(m - 3 - 1 + paramInt2)] * (paramArrayOfFloat[(m - 5 - 1 + paramInt2)] / (f4 * (1.0F + (float)Math.sqrt(1.0F + f2 / f4))));
        } else {
          f2 = paramArrayOfFloat[(m - 3 - 1 + paramInt2)] * (paramArrayOfFloat[(m - 5 - 1 + paramInt2)] / (f4 + (float)Math.sqrt(f4) * (float)Math.sqrt(f4 + f2)));
        }
        f4 = paramArrayOfFloat[(m - 7 - 1 + paramInt2)] + (f2 + paramArrayOfFloat[(m - 5 - 1 + paramInt2)]);
        paramArrayOfFloat[(m - 3 - 1 + paramInt2)] *= paramArrayOfFloat[(m - 7 - 1 + paramInt2)] / f4;
        paramArrayOfFloat[(m - 7 - 1 + paramInt2)] = f4;
      }
      paramArrayOfFloat[(4 * paramintW1.val - 7 - 1 + paramInt2)] = (paramArrayOfFloat[(m - 7 - 1 + paramInt2)] + paramfloatW2.val);
      paramArrayOfFloat[(4 * paramintW1.val - 3 - 1 + paramInt2)] = (paramArrayOfFloat[(m - 3 - 1 + paramInt2)] + paramfloatW2.val);
      paramintW1.val -= 2;
    }
    if ((paramfloatW1.val > 0.0F ? 0 : 1) == 0) {}
    if (((paramintW1.val >= k ? 0 : 1) == 0 ? 0 : 1) != 0) {
      if ((1.5F * paramArrayOfFloat[(4 * paramInt1 + paramInt3 - 3 - 1 + paramInt2)] >= paramArrayOfFloat[(4 * paramintW1.val + paramInt3 - 3 - 1 + paramInt2)] ? 0 : 1) != 0)
      {
        i = 4 * (paramInt1 + paramintW1.val);
        j = 4 * paramInt1;
        for (int n = (2 * (paramInt1 + paramintW1.val - 1) - 4 * paramInt1 + 4) / 4; n > 0; n--)
        {
          f5 = paramArrayOfFloat[(j - 3 - 1 + paramInt2)];
          paramArrayOfFloat[(j - 3 - 1 + paramInt2)] = paramArrayOfFloat[(i - j - 3 - 1 + paramInt2)];
          paramArrayOfFloat[(i - j - 3 - 1 + paramInt2)] = f5;
          f5 = paramArrayOfFloat[(j - 2 - 1 + paramInt2)];
          paramArrayOfFloat[(j - 2 - 1 + paramInt2)] = paramArrayOfFloat[(i - j - 2 - 1 + paramInt2)];
          paramArrayOfFloat[(i - j - 2 - 1 + paramInt2)] = f5;
          f5 = paramArrayOfFloat[(j - 1 - 1 + paramInt2)];
          paramArrayOfFloat[(j - 1 - 1 + paramInt2)] = paramArrayOfFloat[(i - j - 5 - 1 + paramInt2)];
          paramArrayOfFloat[(i - j - 5 - 1 + paramInt2)] = f5;
          f5 = paramArrayOfFloat[(j - 1 + paramInt2)];
          paramArrayOfFloat[(j - 1 + paramInt2)] = paramArrayOfFloat[(i - j - 4 - 1 + paramInt2)];
          paramArrayOfFloat[(i - j - 4 - 1 + paramInt2)] = f5;
          j += 4;
        }
        if ((paramintW1.val - paramInt1 > 4 ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)] = paramArrayOfFloat[(4 * paramInt1 + paramInt3 - 1 - 1 + paramInt2)];
          paramArrayOfFloat[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)] = paramArrayOfFloat[(4 * paramInt1 - paramInt3 - 1 + paramInt2)];
        }
        dmin2.val = Math.min(dmin2.val, paramArrayOfFloat[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)]);
        paramArrayOfFloat[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)] = Util.min(paramArrayOfFloat[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)], paramArrayOfFloat[(4 * paramInt1 + paramInt3 - 1 - 1 + paramInt2)], paramArrayOfFloat[(4 * paramInt1 + paramInt3 + 3 - 1 + paramInt2)]);
        paramArrayOfFloat[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)] = Util.min(paramArrayOfFloat[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)], paramArrayOfFloat[(4 * paramInt1 - paramInt3 - 1 + paramInt2)], paramArrayOfFloat[(4 * paramInt1 - paramInt3 + 4 - 1 + paramInt2)]);
        paramfloatW4.val = Util.max(paramfloatW4.val, paramArrayOfFloat[(4 * paramInt1 + paramInt3 - 3 - 1 + paramInt2)], paramArrayOfFloat[(4 * paramInt1 + paramInt3 + 1 - 1 + paramInt2)]);
        paramfloatW1.val = 0.0F;
      }
    }
    if ((paramfloatW1.val >= 0.0F ? 0 : 1) == 0) {}
    if (((f3 * paramfloatW4.val >= Util.min(paramArrayOfFloat[(4 * paramintW1.val + paramInt3 - 1 - 1 + paramInt2)], paramArrayOfFloat[(4 * paramintW1.val + paramInt3 - 9 - 1 + paramInt2)], dmin2.val + paramArrayOfFloat[(4 * paramintW1.val - paramInt3 - 1 + paramInt2)]) ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Slasq4.slasq4(paramInt1, paramintW1.val, paramArrayOfFloat, paramInt2, paramInt3, k, paramfloatW1.val, dmin1.val, dmin2.val, dn.val, dn1.val, dn2.val, tau, ttype);
      for (;;)
      {
        Slasq5.slasq5(paramInt1, paramintW1.val, paramArrayOfFloat, paramInt2, paramInt3, tau.val, paramfloatW1, dmin1, dmin2, dn, dn1, dn2, paramBoolean);
        paramintW4.val += paramintW1.val - paramInt1 + 2;
        paramintW3.val += 1;
        if ((paramfloatW1.val < 0.0F ? 0 : 1) != 0) {}
        if (((dmin1.val <= 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          break label2123;
        }
        if ((paramfloatW1.val >= 0.0F ? 0 : 1) != 0) {}
        if (((dmin1.val <= 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((paramArrayOfFloat[(4 * (paramintW1.val - 1) - paramInt3 - 1 + paramInt2)] >= f6 * (paramfloatW2.val + dn1.val) ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((Math.abs(dn.val) >= f6 * paramfloatW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramArrayOfFloat[(4 * (paramintW1.val - 1) - paramInt3 + 2 - 1 + paramInt2)] = 0.0F;
          paramfloatW1.val = 0.0F;
          break label2123;
        }
        if ((paramfloatW1.val >= 0.0F ? 0 : 1) != 0)
        {
          paramintW2.val += 1;
          if ((ttype.val >= -22 ? 0 : 1) != 0)
          {
            tau.val = 0.0F;
          }
          else if ((dmin1.val <= 0.0F ? 0 : 1) != 0)
          {
            tau.val = ((tau.val + paramfloatW1.val) * (1.0F - 2.0F * f1));
            ttype.val -= 11;
          }
          else
          {
            tau.val = (0.25F * tau.val);
            ttype.val -= 12;
          }
        }
        else
        {
          if ((paramfloatW1.val == paramfloatW1.val ? 0 : 1) == 0) {
            break;
          }
          tau.val = 0.0F;
        }
      }
    }
    Slasq6.slasq6(paramInt1, paramintW1.val, paramArrayOfFloat, paramInt2, paramInt3, paramfloatW1, dmin1, dmin2, dn, dn1, dn2);
    paramintW4.val += paramintW1.val - paramInt1 + 2;
    paramintW3.val += 1;
    tau.val = 0.0F;
    label2123:
    if ((tau.val >= paramfloatW2.val ? 0 : 1) != 0)
    {
      paramfloatW3.val += tau.val;
      f4 = paramfloatW2.val + paramfloatW3.val;
      paramfloatW3.val -= f4 - paramfloatW2.val;
    }
    else
    {
      f4 = paramfloatW2.val + tau.val;
      paramfloatW3.val = (paramfloatW2.val - (f4 - tau.val) + paramfloatW3.val);
    }
    paramfloatW2.val = f4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasq3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */