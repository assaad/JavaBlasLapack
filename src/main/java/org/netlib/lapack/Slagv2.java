package org.netlib.lapack;

import org.netlib.blas.Srot;
import org.netlib.util.Util;
import org.netlib.util.floatW;

public final class Slagv2
{
  public static void slagv2(float[] paramArrayOfFloat1, int paramInt1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f9 = 0.0F;
    float f10 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    float f11 = 0.0F;
    floatW localfloatW5 = new floatW(0.0F);
    floatW localfloatW6 = new floatW(0.0F);
    floatW localfloatW7 = new floatW(0.0F);
    f10 = Slamch.slamch("S");
    f11 = Slamch.slamch("P");
    f1 = Util.max(Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]), Math.abs(paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)]), f10);
    f2 = 1.0F / f1;
    paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)] = (f2 * paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)] = (f2 * paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = (f2 * paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)] = (f2 * paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)]);
    f3 = Util.max(Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]), Math.abs(paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]) + Math.abs(paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)]), f10);
    f4 = 1.0F / f3;
    paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] = (f4 * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
    paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)] = (f4 * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
    paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)] = (f4 * paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
    if ((Math.abs(paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]) > f11 ? 0 : 1) != 0)
    {
      paramfloatW1.val = 1.0F;
      paramfloatW2.val = 0.0F;
      paramfloatW3.val = 1.0F;
      paramfloatW4.val = 0.0F;
      paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = 0.0F;
      paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0F;
    }
    else if ((Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]) > f11 ? 0 : 1) != 0)
    {
      Slartg.slartg(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramfloatW1, paramfloatW2, localfloatW1);
      paramfloatW3.val = 1.0F;
      paramfloatW4.val = 0.0F;
      Srot.srot(2, paramArrayOfFloat1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramfloatW1.val, paramfloatW2.val);
      Srot.srot(2, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramfloatW1.val, paramfloatW2.val);
      paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = 0.0F;
      paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0F;
      paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0F;
    }
    else if ((Math.abs(paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)]) > f11 ? 0 : 1) != 0)
    {
      Slartg.slartg(paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)], paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramfloatW3, paramfloatW4, localfloatW4);
      paramfloatW4.val = (-paramfloatW4.val);
      Srot.srot(2, paramArrayOfFloat1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, 1, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt2 + paramInt1, 1, paramfloatW3.val, paramfloatW4.val);
      Srot.srot(2, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, 1, paramfloatW3.val, paramfloatW4.val);
      paramfloatW1.val = 1.0F;
      paramfloatW2.val = 0.0F;
      paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = 0.0F;
      paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0F;
      paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)] = 0.0F;
    }
    else
    {
      Slag2.slag2(paramArrayOfFloat1, paramInt1, paramInt2, paramArrayOfFloat2, paramInt3, paramInt4, f10, localfloatW2, localfloatW3, localfloatW6, localfloatW7, localfloatW5);
      if ((localfloatW5.val != 0.0F ? 0 : 1) != 0)
      {
        f5 = localfloatW2.val * paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)] - localfloatW6.val * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
        f6 = localfloatW2.val * paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)] - localfloatW6.val * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)];
        f7 = localfloatW2.val * paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)] - localfloatW6.val * paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)];
        f9 = Slapy2.slapy2(f5, f6);
        f8 = Slapy2.slapy2(localfloatW2.val * paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)], f7);
        if ((f9 <= f8 ? 0 : 1) != 0) {
          Slartg.slartg(f6, f5, paramfloatW3, paramfloatW4, localfloatW4);
        } else {
          Slartg.slartg(f7, localfloatW2.val * paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramfloatW3, paramfloatW4, localfloatW4);
        }
        paramfloatW4.val = (-paramfloatW4.val);
        Srot.srot(2, paramArrayOfFloat1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, 1, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt2 + paramInt1, 1, paramfloatW3.val, paramfloatW4.val);
        Srot.srot(2, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, 1, paramfloatW3.val, paramfloatW4.val);
        f5 = Math.max(Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)]), Math.abs(paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)]));
        f6 = Math.max(Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]) + Math.abs(paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]), Math.abs(paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)]) + Math.abs(paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)]));
        if ((localfloatW2.val * f5 < Math.abs(localfloatW6.val) * f6 ? 0 : 1) != 0) {
          Slartg.slartg(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)], paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)], paramfloatW1, paramfloatW2, localfloatW1);
        } else {
          Slartg.slartg(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)], paramfloatW1, paramfloatW2, localfloatW1);
        }
        Srot.srot(2, paramArrayOfFloat1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramfloatW1.val, paramfloatW2.val);
        Srot.srot(2, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramfloatW1.val, paramfloatW2.val);
        paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = 0.0F;
        paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0F;
      }
      else
      {
        Slasv2.slasv2(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)], paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)], paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)], localfloatW1, localfloatW4, paramfloatW4, paramfloatW3, paramfloatW2, paramfloatW1);
        Srot.srot(2, paramArrayOfFloat1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt2 + paramInt1, paramInt2, paramfloatW1.val, paramfloatW2.val);
        Srot.srot(2, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramfloatW1.val, paramfloatW2.val);
        Srot.srot(2, paramArrayOfFloat1, 1 - 1 + (1 - 1) * paramInt2 + paramInt1, 1, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt2 + paramInt1, 1, paramfloatW3.val, paramfloatW4.val);
        Srot.srot(2, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, 1, paramfloatW3.val, paramfloatW4.val);
        paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = 0.0F;
        paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)] = 0.0F;
      }
    }
    paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)] = (f1 * paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)] = (f1 * paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)] = (f1 * paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)] = (f1 * paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)]);
    paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)] = (f3 * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
    paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)] = (f3 * paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
    paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)] = (f3 * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
    paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)] = (f3 * paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)]);
    if ((localfloatW5.val != 0.0F ? 0 : 1) != 0)
    {
      paramArrayOfFloat3[(1 - 1 + paramInt5)] = paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)];
      paramArrayOfFloat3[(2 - 1 + paramInt5)] = paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)];
      paramArrayOfFloat4[(1 - 1 + paramInt6)] = 0.0F;
      paramArrayOfFloat4[(2 - 1 + paramInt6)] = 0.0F;
      paramArrayOfFloat5[(1 - 1 + paramInt7)] = paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
      paramArrayOfFloat5[(2 - 1 + paramInt7)] = paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)];
    }
    else
    {
      paramArrayOfFloat3[(1 - 1 + paramInt5)] = (f1 * localfloatW6.val / localfloatW2.val / f3);
      paramArrayOfFloat4[(1 - 1 + paramInt6)] = (f1 * localfloatW5.val / localfloatW2.val / f3);
      paramArrayOfFloat3[(2 - 1 + paramInt5)] = paramArrayOfFloat3[(1 - 1 + paramInt5)];
      paramArrayOfFloat4[(2 - 1 + paramInt6)] = (-paramArrayOfFloat4[(1 - 1 + paramInt6)]);
      paramArrayOfFloat5[(1 - 1 + paramInt7)] = 1.0F;
      paramArrayOfFloat5[(2 - 1 + paramInt7)] = 1.0F;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slagv2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */