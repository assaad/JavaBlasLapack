package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slasd5
{
  public static void slasd5(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, float paramFloat, floatW paramfloatW, float[] paramArrayOfFloat4, int paramInt5)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    f3 = paramArrayOfFloat1[(2 - 1 + paramInt2)] - paramArrayOfFloat1[(1 - 1 + paramInt2)];
    f4 = f3 * (paramArrayOfFloat1[(2 - 1 + paramInt2)] + paramArrayOfFloat1[(1 - 1 + paramInt2)]);
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      f6 = 1.0F + 4.0F * paramFloat * (paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)] / (paramArrayOfFloat1[(1 - 1 + paramInt2)] + 3.0F * paramArrayOfFloat1[(2 - 1 + paramInt2)]) - paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat2[(1 - 1 + paramInt3)] / (3.0F * paramArrayOfFloat1[(1 - 1 + paramInt2)] + paramArrayOfFloat1[(2 - 1 + paramInt2)])) / f3;
      if ((f6 <= 0.0F ? 0 : 1) != 0)
      {
        f1 = f4 + paramFloat * (paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat2[(1 - 1 + paramInt3)] + paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)]);
        f2 = paramFloat * paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat2[(1 - 1 + paramInt3)] * f4;
        f5 = 2.0F * f2 / (f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2)));
        f5 /= (paramArrayOfFloat1[(1 - 1 + paramInt2)] + (float)Math.sqrt(paramArrayOfFloat1[(1 - 1 + paramInt2)] * paramArrayOfFloat1[(1 - 1 + paramInt2)] + f5));
        paramfloatW.val = (paramArrayOfFloat1[(1 - 1 + paramInt2)] + f5);
        paramArrayOfFloat3[(1 - 1 + paramInt4)] = (-f5);
        paramArrayOfFloat3[(2 - 1 + paramInt4)] = (f3 - f5);
        paramArrayOfFloat4[(1 - 1 + paramInt5)] = (2.0F * paramArrayOfFloat1[(1 - 1 + paramInt2)] + f5);
        paramArrayOfFloat4[(2 - 1 + paramInt5)] = (paramArrayOfFloat1[(1 - 1 + paramInt2)] + f5 + paramArrayOfFloat1[(2 - 1 + paramInt2)]);
      }
      else
      {
        f1 = -f4 + paramFloat * (paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat2[(1 - 1 + paramInt3)] + paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)]);
        f2 = paramFloat * paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)] * f4;
        if ((f1 <= 0.0F ? 0 : 1) != 0) {
          f5 = -(2.0F * f2 / (f1 + (float)Math.sqrt(f1 * f1 + 4.0F * f2)));
        } else {
          f5 = (f1 - (float)Math.sqrt(f1 * f1 + 4.0F * f2)) / 2.0F;
        }
        f5 /= (paramArrayOfFloat1[(2 - 1 + paramInt2)] + (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(2 - 1 + paramInt2)] * paramArrayOfFloat1[(2 - 1 + paramInt2)] + f5)));
        paramfloatW.val = (paramArrayOfFloat1[(2 - 1 + paramInt2)] + f5);
        paramArrayOfFloat3[(1 - 1 + paramInt4)] = (-(f3 + f5));
        paramArrayOfFloat3[(2 - 1 + paramInt4)] = (-f5);
        paramArrayOfFloat4[(1 - 1 + paramInt5)] = (paramArrayOfFloat1[(1 - 1 + paramInt2)] + f5 + paramArrayOfFloat1[(2 - 1 + paramInt2)]);
        paramArrayOfFloat4[(2 - 1 + paramInt5)] = (2.0F * paramArrayOfFloat1[(2 - 1 + paramInt2)] + f5);
      }
    }
    else
    {
      f1 = -f4 + paramFloat * (paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat2[(1 - 1 + paramInt3)] + paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)]);
      f2 = paramFloat * paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)] * f4;
      if ((f1 <= 0.0F ? 0 : 1) != 0) {
        f5 = (f1 + (float)Math.sqrt(f1 * f1 + 4.0F * f2)) / 2.0F;
      } else {
        f5 = 2.0F * f2 / (-f1 + (float)Math.sqrt(f1 * f1 + 4.0F * f2));
      }
      f5 /= (paramArrayOfFloat1[(2 - 1 + paramInt2)] + (float)Math.sqrt(paramArrayOfFloat1[(2 - 1 + paramInt2)] * paramArrayOfFloat1[(2 - 1 + paramInt2)] + f5));
      paramfloatW.val = (paramArrayOfFloat1[(2 - 1 + paramInt2)] + f5);
      paramArrayOfFloat3[(1 - 1 + paramInt4)] = (-(f3 + f5));
      paramArrayOfFloat3[(2 - 1 + paramInt4)] = (-f5);
      paramArrayOfFloat4[(1 - 1 + paramInt5)] = (paramArrayOfFloat1[(1 - 1 + paramInt2)] + f5 + paramArrayOfFloat1[(2 - 1 + paramInt2)]);
      paramArrayOfFloat4[(2 - 1 + paramInt5)] = (2.0F * paramArrayOfFloat1[(2 - 1 + paramInt2)] + f5);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasd5.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */