package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slaed5
{
  public static void slaed5(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, float paramFloat, floatW paramfloatW)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    f3 = paramArrayOfFloat1[(2 - 1 + paramInt2)] - paramArrayOfFloat1[(1 - 1 + paramInt2)];
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      f6 = 1.0F + 2.0F * paramFloat * (paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)] - paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat2[(1 - 1 + paramInt3)]) / f3;
      if ((f6 <= 0.0F ? 0 : 1) != 0)
      {
        f1 = f3 + paramFloat * (paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat2[(1 - 1 + paramInt3)] + paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)]);
        f2 = paramFloat * paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat2[(1 - 1 + paramInt3)] * f3;
        f4 = 2.0F * f2 / (f1 + (float)Math.sqrt(Math.abs(f1 * f1 - 4.0F * f2)));
        paramfloatW.val = (paramArrayOfFloat1[(1 - 1 + paramInt2)] + f4);
        paramArrayOfFloat3[(1 - 1 + paramInt4)] = (-(paramArrayOfFloat2[(1 - 1 + paramInt3)] / f4));
        paramArrayOfFloat2[(2 - 1 + paramInt3)] /= (f3 - f4);
      }
      else
      {
        f1 = -f3 + paramFloat * (paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat2[(1 - 1 + paramInt3)] + paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)]);
        f2 = paramFloat * paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)] * f3;
        if ((f1 <= 0.0F ? 0 : 1) != 0) {
          f4 = -(2.0F * f2 / (f1 + (float)Math.sqrt(f1 * f1 + 4.0F * f2)));
        } else {
          f4 = (f1 - (float)Math.sqrt(f1 * f1 + 4.0F * f2)) / 2.0F;
        }
        paramfloatW.val = (paramArrayOfFloat1[(2 - 1 + paramInt2)] + f4);
        paramArrayOfFloat3[(1 - 1 + paramInt4)] = (-(paramArrayOfFloat2[(1 - 1 + paramInt3)] / (f3 + f4)));
        paramArrayOfFloat3[(2 - 1 + paramInt4)] = (-(paramArrayOfFloat2[(2 - 1 + paramInt3)] / f4));
      }
      f5 = (float)Math.sqrt(paramArrayOfFloat3[(1 - 1 + paramInt4)] * paramArrayOfFloat3[(1 - 1 + paramInt4)] + paramArrayOfFloat3[(2 - 1 + paramInt4)] * paramArrayOfFloat3[(2 - 1 + paramInt4)]);
      paramArrayOfFloat3[(1 - 1 + paramInt4)] /= f5;
      paramArrayOfFloat3[(2 - 1 + paramInt4)] /= f5;
    }
    else
    {
      f1 = -f3 + paramFloat * (paramArrayOfFloat2[(1 - 1 + paramInt3)] * paramArrayOfFloat2[(1 - 1 + paramInt3)] + paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)]);
      f2 = paramFloat * paramArrayOfFloat2[(2 - 1 + paramInt3)] * paramArrayOfFloat2[(2 - 1 + paramInt3)] * f3;
      if ((f1 <= 0.0F ? 0 : 1) != 0) {
        f4 = (f1 + (float)Math.sqrt(f1 * f1 + 4.0F * f2)) / 2.0F;
      } else {
        f4 = 2.0F * f2 / (-f1 + (float)Math.sqrt(f1 * f1 + 4.0F * f2));
      }
      paramfloatW.val = (paramArrayOfFloat1[(2 - 1 + paramInt2)] + f4);
      paramArrayOfFloat3[(1 - 1 + paramInt4)] = (-(paramArrayOfFloat2[(1 - 1 + paramInt3)] / (f3 + f4)));
      paramArrayOfFloat3[(2 - 1 + paramInt4)] = (-(paramArrayOfFloat2[(2 - 1 + paramInt3)] / f4));
      f5 = (float)Math.sqrt(paramArrayOfFloat3[(1 - 1 + paramInt4)] * paramArrayOfFloat3[(1 - 1 + paramInt4)] + paramArrayOfFloat3[(2 - 1 + paramInt4)] * paramArrayOfFloat3[(2 - 1 + paramInt4)]);
      paramArrayOfFloat3[(1 - 1 + paramInt4)] /= f5;
      paramArrayOfFloat3[(2 - 1 + paramInt4)] /= f5;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaed5.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */