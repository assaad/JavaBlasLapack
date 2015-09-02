package org.netlib.lapack;

import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaln2
{
  public static boolean[] cswap = { false, false, true, true };
  public static boolean[] rswap = { false, true, false, true };
  public static int[] ipivot = { 1, 2, 3, 4, 2, 1, 4, 3, 3, 4, 1, 2, 4, 3, 2, 1 };
  public static float[] ci_civ = new float[2 * 2];
  public static float[] cr_crv = new float[2 * 2];
  
  public static void slaln2(boolean paramBoolean, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float paramFloat5, float paramFloat6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, floatW paramfloatW1, floatW paramfloatW2, intW paramintW)
  {
    int i = 0;
    int j = 0;
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
    float f25 = 0.0F;
    float f26 = 0.0F;
    float f27 = 0.0F;
    float f28 = 0.0F;
    float f29 = 0.0F;
    float f30 = 0.0F;
    float f31 = 0.0F;
    float f32 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f33 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    f19 = 2.0F * Slamch.slamch("Safe minimum");
    f4 = 1.0F / f19;
    f18 = Math.max(paramFloat1, f19);
    paramintW.val = 0;
    paramfloatW1.val = 1.0F;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((paramInt2 != 1 ? 0 : 1) != 0)
      {
        f15 = paramFloat2 * paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] - paramFloat5 * paramFloat3;
        f11 = Math.abs(f15);
        if ((f11 >= f18 ? 0 : 1) != 0)
        {
          f15 = f18;
          f11 = f18;
          paramintW.val = 1;
        }
        f5 = Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
        if ((f11 >= 1.0F ? 0 : 1) != 0) {}
        if (((f5 <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((f5 <= f4 * f11 ? 0 : 1) != 0) {
            paramfloatW1.val = (1.0F / f5);
          }
        }
        paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)] * paramfloatW1.val / f15);
        paramfloatW2.val = Math.abs(paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
      }
      else
      {
        f15 = paramFloat2 * paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] - paramFloat5 * paramFloat3;
        f14 = -(paramFloat6 * paramFloat3);
        f11 = Math.abs(f15) + Math.abs(f14);
        if ((f11 >= f18 ? 0 : 1) != 0)
        {
          f15 = f18;
          f14 = 0.0F;
          f11 = f18;
          paramintW.val = 1;
        }
        f5 = Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]) + Math.abs(paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)]);
        if ((f11 >= 1.0F ? 0 : 1) != 0) {}
        if (((f5 <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((f5 <= f4 * f11 ? 0 : 1) != 0) {
            paramfloatW1.val = (1.0F / f5);
          }
        }
        sladiv_adapter(paramfloatW1.val * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)], paramfloatW1.val * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)], f15, f14, paramArrayOfFloat3, 1 - 1 + (1 - 1) * paramInt8 + paramInt7, paramArrayOfFloat3, 1 - 1 + (2 - 1) * paramInt8 + paramInt7);
        paramfloatW2.val = (Math.abs(paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfFloat3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)]));
      }
    }
    else
    {
      cr_crv[(1 - 1 + (1 - 1) * 2)] = (paramFloat2 * paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] - paramFloat5 * paramFloat3);
      cr_crv[(2 - 1 + (2 - 1) * 2)] = (paramFloat2 * paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)] - paramFloat5 * paramFloat4);
      if (paramBoolean)
      {
        cr_crv[(1 - 1 + (2 - 1) * 2)] = (paramFloat2 * paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
        cr_crv[(2 - 1 + (1 - 1) * 2)] = (paramFloat2 * paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
      }
      else
      {
        cr_crv[(2 - 1 + (1 - 1) * 2)] = (paramFloat2 * paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
        cr_crv[(1 - 1 + (2 - 1) * 2)] = (paramFloat2 * paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
      }
      int k;
      if ((paramInt2 != 1 ? 0 : 1) != 0)
      {
        f10 = 0.0F;
        i = 0;
        j = 1;
        for (k = 4 - 1 + 1; k > 0; k--)
        {
          if ((Math.abs(cr_crv[(j - 1)]) <= f10 ? 0 : 1) != 0)
          {
            f10 = Math.abs(cr_crv[(j - 1)]);
            i = j;
          }
          j += 1;
        }
        if ((f10 >= f18 ? 0 : 1) != 0)
        {
          f5 = Math.max(Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]), Math.abs(paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)]));
          if ((f18 >= 1.0F ? 0 : 1) != 0) {}
          if (((f5 <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
            if ((f5 <= f4 * f18 ? 0 : 1) != 0) {
              paramfloatW1.val = (1.0F / f5);
            }
          }
          f20 = paramfloatW1.val / f18;
          paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
          paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
          paramfloatW2.val = (f20 * f5);
          paramintW.val = 1;
          return;
        }
        f27 = cr_crv[(i - 1)];
        f12 = cr_crv[(ipivot[(2 - 1 + (i - 1) * 4)] - 1)];
        f29 = cr_crv[(ipivot[(3 - 1 + (i - 1) * 4)] - 1)];
        f13 = cr_crv[(ipivot[(4 - 1 + (i - 1) * 4)] - 1)];
        f28 = 1.0F / f27;
        f17 = f28 * f12;
        f31 = f13 - f29 * f17;
        if ((Math.abs(f31) >= f18 ? 0 : 1) != 0)
        {
          f31 = f18;
          paramintW.val = 1;
        }
        if (rswap[(i - 1)] != 0)
        {
          f6 = paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          f7 = paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)];
        }
        else
        {
          f6 = paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          f7 = paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)];
        }
        f7 -= f17 * f6;
        f1 = Math.max(Math.abs(f6 * (f31 * f28)), Math.abs(f7));
        if ((f1 <= 1.0F ? 0 : 1) != 0) {}
        if (((Math.abs(f31) >= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((f1 < f4 * Math.abs(f31) ? 0 : 1) != 0) {
            paramfloatW1.val = (1.0F / f1);
          }
        }
        localfloatW2.val = (f7 * paramfloatW1.val / f31);
        f33 = paramfloatW1.val * f6 * f28 - localfloatW2.val * (f28 * f29);
        if (cswap[(i - 1)] != 0)
        {
          paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = localfloatW2.val;
          paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = f33;
        }
        else
        {
          paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = f33;
          paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = localfloatW2.val;
        }
        paramfloatW2.val = Math.max(Math.abs(f33), Math.abs(localfloatW2.val));
        if ((paramfloatW2.val <= 1.0F ? 0 : 1) != 0) {}
        if (((f10 <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((paramfloatW2.val <= f4 / f10 ? 0 : 1) != 0)
          {
            f20 = f10 / f4;
            paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
            paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
            paramfloatW2.val = (f20 * paramfloatW2.val);
            paramfloatW1.val = (f20 * paramfloatW1.val);
          }
        }
      }
      else
      {
        ci_civ[(1 - 1 + (1 - 1) * 2)] = (-(paramFloat6 * paramFloat3));
        ci_civ[(2 - 1 + (1 - 1) * 2)] = 0.0F;
        ci_civ[(1 - 1 + (2 - 1) * 2)] = 0.0F;
        ci_civ[(2 - 1 + (2 - 1) * 2)] = (-(paramFloat6 * paramFloat4));
        f10 = 0.0F;
        i = 0;
        j = 1;
        for (k = 4 - 1 + 1; k > 0; k--)
        {
          if ((Math.abs(cr_crv[(j - 1)]) + Math.abs(ci_civ[(j - 1)]) <= f10 ? 0 : 1) != 0)
          {
            f10 = Math.abs(cr_crv[(j - 1)]) + Math.abs(ci_civ[(j - 1)]);
            i = j;
          }
          j += 1;
        }
        if ((f10 >= f18 ? 0 : 1) != 0)
        {
          f5 = Math.max(Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]) + Math.abs(paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)]), Math.abs(paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)]) + Math.abs(paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt6 + paramInt5)]));
          if ((f18 >= 1.0F ? 0 : 1) != 0) {}
          if (((f5 <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
            if ((f5 <= f4 * f18 ? 0 : 1) != 0) {
              paramfloatW1.val = (1.0F / f5);
            }
          }
          f20 = paramfloatW1.val / f18;
          paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
          paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
          paramArrayOfFloat3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)]);
          paramArrayOfFloat3[(2 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt6 + paramInt5)]);
          paramfloatW2.val = (f20 * f5);
          paramintW.val = 1;
          return;
        }
        f27 = cr_crv[(i - 1)];
        f22 = ci_civ[(i - 1)];
        f12 = cr_crv[(ipivot[(2 - 1 + (i - 1) * 4)] - 1)];
        f8 = ci_civ[(ipivot[(2 - 1 + (i - 1) * 4)] - 1)];
        f29 = cr_crv[(ipivot[(3 - 1 + (i - 1) * 4)] - 1)];
        f24 = ci_civ[(ipivot[(3 - 1 + (i - 1) * 4)] - 1)];
        f13 = cr_crv[(ipivot[(4 - 1 + (i - 1) * 4)] - 1)];
        f9 = ci_civ[(ipivot[(4 - 1 + (i - 1) * 4)] - 1)];
        if ((i != 1 ? 0 : 1) == 0) {}
        if (((i != 4 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          if ((Math.abs(f27) <= Math.abs(f22) ? 0 : 1) != 0)
          {
            f20 = f22 / f27;
            f28 = 1.0F / (f27 * (1.0F + (float)Math.pow(f20, 2)));
            f23 = -(f20 * f28);
          }
          else
          {
            f20 = f27 / f22;
            f23 = -(1.0F / (f22 * (1.0F + (float)Math.pow(f20, 2))));
            f28 = -(f20 * f23);
          }
          f17 = f12 * f28;
          f16 = f12 * f23;
          f30 = f29 * f28;
          f25 = f29 * f23;
          f31 = f13 - f29 * f17;
          f26 = f9 - f29 * f16;
        }
        else
        {
          f28 = 1.0F / f27;
          f23 = 0.0F;
          f17 = f12 * f28;
          f16 = f8 * f28;
          f30 = f29 * f28;
          f25 = f24 * f28;
          f31 = f13 - f29 * f17 + f24 * f16;
          f26 = -(f29 * f16) - f24 * f17;
        }
        f21 = Math.abs(f31) + Math.abs(f26);
        if ((f21 >= f18 ? 0 : 1) != 0)
        {
          f31 = f18;
          f26 = 0.0F;
          paramintW.val = 1;
        }
        if (rswap[(i - 1)] != 0)
        {
          f7 = paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          f6 = paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          f3 = paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)];
          f2 = paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt6 + paramInt5)];
        }
        else
        {
          f6 = paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          f7 = paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt6 + paramInt5)];
          f2 = paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt6 + paramInt5)];
          f3 = paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt6 + paramInt5)];
        }
        f7 = f7 - f17 * f6 + f16 * f2;
        f3 = f3 - f16 * f6 - f17 * f2;
        f1 = Math.max((Math.abs(f6) + Math.abs(f2)) * (f21 * (Math.abs(f28) + Math.abs(f23))), Math.abs(f7) + Math.abs(f3));
        if ((f1 <= 1.0F ? 0 : 1) != 0) {}
        if (((f21 >= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((f1 < f4 * f21 ? 0 : 1) != 0)
          {
            paramfloatW1.val = (1.0F / f1);
            f6 = paramfloatW1.val * f6;
            f2 = paramfloatW1.val * f2;
            f7 = paramfloatW1.val * f7;
            f3 = paramfloatW1.val * f3;
          }
        }
        Sladiv.sladiv(f7, f3, f31, f26, localfloatW2, localfloatW1);
        f33 = f28 * f6 - f23 * f2 - f30 * localfloatW2.val + f25 * localfloatW1.val;
        f32 = f23 * f6 + f28 * f2 - f25 * localfloatW2.val - f30 * localfloatW1.val;
        if (cswap[(i - 1)] != 0)
        {
          paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = localfloatW2.val;
          paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = f33;
          paramArrayOfFloat3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = localfloatW1.val;
          paramArrayOfFloat3[(2 - 1 + (2 - 1) * paramInt8 + paramInt7)] = f32;
        }
        else
        {
          paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = f33;
          paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = localfloatW2.val;
          paramArrayOfFloat3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = f32;
          paramArrayOfFloat3[(2 - 1 + (2 - 1) * paramInt8 + paramInt7)] = localfloatW1.val;
        }
        paramfloatW2.val = Math.max(Math.abs(f33) + Math.abs(f32), Math.abs(localfloatW2.val) + Math.abs(localfloatW1.val));
        if ((paramfloatW2.val <= 1.0F ? 0 : 1) != 0) {}
        if (((f10 <= 1.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          if ((paramfloatW2.val <= f4 / f10 ? 0 : 1) != 0)
          {
            f20 = f10 / f4;
            paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
            paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt8 + paramInt7)]);
            paramArrayOfFloat3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat3[(1 - 1 + (2 - 1) * paramInt8 + paramInt7)]);
            paramArrayOfFloat3[(2 - 1 + (2 - 1) * paramInt8 + paramInt7)] = (f20 * paramArrayOfFloat3[(2 - 1 + (2 - 1) * paramInt8 + paramInt7)]);
            paramfloatW2.val = (f20 * paramfloatW2.val);
            paramfloatW1.val = (f20 * paramfloatW1.val);
          }
        }
      }
    }
  }
  
  private static void sladiv_adapter(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt1]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat2[paramInt2]);
    Sladiv.sladiv(paramFloat1, paramFloat2, paramFloat3, paramFloat4, localfloatW1, localfloatW2);
    paramArrayOfFloat1[paramInt1] = localfloatW1.val;
    paramArrayOfFloat2[paramInt2] = localfloatW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaln2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */