package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaed6
{
  public static void slaed6(int paramInt1, boolean paramBoolean, float paramFloat1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float paramFloat2, floatW paramfloatW, intW paramintW)
  {
    float[] arrayOfFloat1 = new float[3];
    float[] arrayOfFloat2 = new float[3];
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
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    float f22 = 0.0F;
    float f23 = 0.0F;
    float f24 = 0.0F;
    paramintW.val = 0;
    if (paramBoolean)
    {
      f23 = paramArrayOfFloat1[(2 - 1 + paramInt2)];
      f24 = paramArrayOfFloat1[(3 - 1 + paramInt2)];
    }
    else
    {
      f23 = paramArrayOfFloat1[(1 - 1 + paramInt2)];
      f24 = paramArrayOfFloat1[(2 - 1 + paramInt2)];
    }
    if ((paramFloat2 >= 0.0F ? 0 : 1) != 0) {
      f23 = 0.0F;
    } else {
      f24 = 0.0F;
    }
    m = 1;
    paramfloatW.val = 0.0F;
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      if (paramBoolean)
      {
        f18 = (paramArrayOfFloat1[(3 - 1 + paramInt2)] - paramArrayOfFloat1[(2 - 1 + paramInt2)]) / 2.0F;
        f4 = paramFloat1 + paramArrayOfFloat2[(1 - 1 + paramInt3)] / (paramArrayOfFloat1[(1 - 1 + paramInt2)] - paramArrayOfFloat1[(2 - 1 + paramInt2)] - f18);
        f1 = f4 * (paramArrayOfFloat1[(2 - 1 + paramInt2)] + paramArrayOfFloat1[(3 - 1 + paramInt2)]) + paramArrayOfFloat2[(2 - 1 + paramInt3)] + paramArrayOfFloat2[(3 - 1 + paramInt3)];
        f2 = f4 * paramArrayOfFloat1[(2 - 1 + paramInt2)] * paramArrayOfFloat1[(3 - 1 + paramInt2)] + paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat1[(3 - 1 + paramInt2)] + paramArrayOfFloat2[(3 - 1 + paramInt3)] * paramArrayOfFloat1[(2 - 1 + paramInt2)];
      }
      else
      {
        f18 = (paramArrayOfFloat1[(1 - 1 + paramInt2)] - paramArrayOfFloat1[(2 - 1 + paramInt2)]) / 2.0F;
        f4 = paramFloat1 + paramArrayOfFloat2[(3 - 1 + paramInt3)] / (paramArrayOfFloat1[(3 - 1 + paramInt2)] - paramArrayOfFloat1[(2 - 1 + paramInt2)] - f18);
        f1 = f4 * (paramArrayOfFloat1[(1 - 1 + paramInt2)] + paramArrayOfFloat1[(2 - 1 + paramInt2)]) + paramArrayOfFloat2[(1 - 1 + paramInt3)] + paramArrayOfFloat2[(2 - 1 + paramInt3)];
        f2 = f4 * paramArrayOfFloat1[(1 - 1 + paramInt2)] * paramArrayOfFloat1[(2 - 1 + paramInt2)] + paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat1[(2 - 1 + paramInt2)] + paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat1[(1 - 1 + paramInt2)];
      }
      f18 = Util.max(Math.abs(f1), Math.abs(f2), Math.abs(f4));
      f1 /= f18;
      f2 /= f18;
      f4 /= f18;
      if ((f4 != 0.0F ? 0 : 1) != 0) {
        paramfloatW.val = (f2 / f1);
      } else if ((f1 > 0.0F ? 0 : 1) != 0) {
        paramfloatW.val = ((f1 - (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f4))) / (2.0F * f4));
      } else {
        paramfloatW.val = (2.0F * f2 / (f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f4))));
      }
      if ((paramfloatW.val >= f23 ? 0 : 1) == 0) {}
      if (((paramfloatW.val <= f24 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramfloatW.val = ((f23 + f24) / 2.0F);
      }
      if ((paramArrayOfFloat1[(1 - 1 + paramInt2)] != paramfloatW.val ? 0 : 1) == 0) {}
      if (((paramArrayOfFloat1[(2 - 1 + paramInt2)] != paramfloatW.val ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((paramArrayOfFloat1[(3 - 1 + paramInt2)] != paramfloatW.val ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramfloatW.val = 0.0F;
      }
      else
      {
        f18 = paramFloat2 + paramfloatW.val * paramArrayOfFloat2[(1 - 1 + paramInt3)] / (paramArrayOfFloat1[(1 - 1 + paramInt2)] * (paramArrayOfFloat1[(1 - 1 + paramInt2)] - paramfloatW.val)) + paramfloatW.val * paramArrayOfFloat2[(2 - 1 + paramInt3)] / (paramArrayOfFloat1[(2 - 1 + paramInt2)] * (paramArrayOfFloat1[(2 - 1 + paramInt2)] - paramfloatW.val)) + paramfloatW.val * paramArrayOfFloat2[(3 - 1 + paramInt3)] / (paramArrayOfFloat1[(3 - 1 + paramInt2)] * (paramArrayOfFloat1[(3 - 1 + paramInt2)] - paramfloatW.val));
        if ((f18 > 0.0F ? 0 : 1) != 0) {
          f23 = paramfloatW.val;
        } else {
          f24 = paramfloatW.val;
        }
        if ((Math.abs(paramFloat2) > Math.abs(f18) ? 0 : 1) != 0) {
          paramfloatW.val = 0.0F;
        }
      }
    }
    f7 = Slamch.slamch("Epsilon");
    f3 = Slamch.slamch("Base");
    f14 = (float)Math.pow(f3, (int)((float)Math.log(Slamch.slamch("SafMin")) / (float)Math.log(f3) / 3.0F));
    f16 = 1.0F / f14;
    f15 = f14 * f14;
    f17 = f16 * f16;
    if (paramBoolean) {
      f18 = Math.min(Math.abs(paramArrayOfFloat1[(2 - 1 + paramInt2)] - paramfloatW.val), Math.abs(paramArrayOfFloat1[(3 - 1 + paramInt2)] - paramfloatW.val));
    } else {
      f18 = Math.min(Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt2)] - paramfloatW.val), Math.abs(paramArrayOfFloat1[(2 - 1 + paramInt2)] - paramfloatW.val));
    }
    i = 0;
    if ((f18 > f14 ? 0 : 1) != 0)
    {
      i = 1;
      if ((f18 > f15 ? 0 : 1) != 0)
      {
        f12 = f17;
        f13 = f15;
      }
      else
      {
        f12 = f16;
        f13 = f14;
      }
      j = 1;
      for (int n = 3 - 1 + 1; n > 0; n--)
      {
        arrayOfFloat1[(j - 1)] = (paramArrayOfFloat1[(j - 1 + paramInt2)] * f12);
        arrayOfFloat2[(j - 1)] = (paramArrayOfFloat2[(j - 1 + paramInt3)] * f12);
        j += 1;
      }
      paramfloatW.val *= f12;
      f23 *= f12;
      f24 *= f12;
    }
    else
    {
      j = 1;
      for (int n = 3 - 1 + 1; n > 0; n--)
      {
        arrayOfFloat1[(j - 1)] = paramArrayOfFloat1[(j - 1 + paramInt2)];
        arrayOfFloat2[(j - 1)] = paramArrayOfFloat2[(j - 1 + paramInt3)];
        j += 1;
      }
    }
    f11 = 0.0F;
    f6 = 0.0F;
    f5 = 0.0F;
    j = 1;
    for (int n = 3 - 1 + 1; n > 0; n--)
    {
      f18 = 1.0F / (arrayOfFloat1[(j - 1)] - paramfloatW.val);
      f19 = arrayOfFloat2[(j - 1)] * f18;
      f20 = f19 * f18;
      f21 = f20 * f18;
      f11 += f19 / arrayOfFloat1[(j - 1)];
      f6 += f20;
      f5 += f21;
      j += 1;
    }
    f10 = paramFloat2 + paramfloatW.val * f11;
    if ((Math.abs(f10) > 0.0F ? 0 : 1) == 0)
    {
      if ((f10 > 0.0F ? 0 : 1) != 0) {
        f23 = paramfloatW.val;
      } else {
        f24 = paramfloatW.val;
      }
      k = m + 1;
      m = k;
      for (int n = 40 - k + 1; n > 0; n--)
      {
        if (paramBoolean)
        {
          f19 = arrayOfFloat1[(2 - 1)] - paramfloatW.val;
          f20 = arrayOfFloat1[(3 - 1)] - paramfloatW.val;
        }
        else
        {
          f19 = arrayOfFloat1[(1 - 1)] - paramfloatW.val;
          f20 = arrayOfFloat1[(2 - 1)] - paramfloatW.val;
        }
        f1 = (f19 + f20) * f10 - f19 * f20 * f6;
        f2 = f19 * f20 * f10;
        f4 = f10 - (f19 + f20) * f6 + f19 * f20 * f5;
        f18 = Util.max(Math.abs(f1), Math.abs(f2), Math.abs(f4));
        f1 /= f18;
        f2 /= f18;
        f4 /= f18;
        if ((f4 != 0.0F ? 0 : 1) != 0) {
          f9 = f2 / f1;
        } else if ((f1 > 0.0F ? 0 : 1) != 0) {
          f9 = (f1 - (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f4))) / (2.0F * f4);
        } else {
          f9 = 2.0F * f2 / (f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2 * f4)));
        }
        if ((f10 * f9 < 0.0F ? 0 : 1) != 0) {
          f9 = -(f10 / f6);
        }
        paramfloatW.val += f9;
        if ((paramfloatW.val >= f23 ? 0 : 1) == 0) {}
        if (((paramfloatW.val <= f24 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramfloatW.val = ((f23 + f24) / 2.0F);
        }
        f11 = 0.0F;
        f8 = 0.0F;
        f6 = 0.0F;
        f5 = 0.0F;
        j = 1;
        for (int i1 = 3 - 1 + 1; i1 > 0; i1--)
        {
          f18 = 1.0F / (arrayOfFloat1[(j - 1)] - paramfloatW.val);
          f19 = arrayOfFloat2[(j - 1)] * f18;
          f20 = f19 * f18;
          f21 = f20 * f18;
          f22 = f19 / arrayOfFloat1[(j - 1)];
          f11 += f22;
          f8 += Math.abs(f22);
          f6 += f20;
          f5 += f21;
          j += 1;
        }
        f10 = paramFloat2 + paramfloatW.val * f11;
        f8 = 8.0F * (Math.abs(paramFloat2) + Math.abs(paramfloatW.val) * f8) + Math.abs(paramfloatW.val) * f6;
        if ((Math.abs(f10) > f7 * f8 ? 0 : 1) != 0) {
          break;
        }
        if ((f10 > 0.0F ? 0 : 1) != 0) {
          f23 = paramfloatW.val;
        } else {
          f24 = paramfloatW.val;
        }
        m += 1;
      }
      paramintW.val = 1;
    }
    if (i != 0) {
      paramfloatW.val *= f13;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaed6.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */