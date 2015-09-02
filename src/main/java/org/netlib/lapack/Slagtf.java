package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Slagtf
{
  public static void slagtf(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float paramFloat1, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, float paramFloat2, float[] paramArrayOfFloat4, int paramInt5, int[] paramArrayOfInt, int paramInt6, intW paramintW)
  {
    int i = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
      Xerbla.xerbla("SLAGTF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    paramArrayOfFloat1[(1 - 1 + paramInt2)] -= paramFloat1;
    paramArrayOfInt[(paramInt1 - 1 + paramInt6)] = 0;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((paramArrayOfFloat1[(1 - 1 + paramInt2)] != 0.0F ? 0 : 1) != 0) {
        paramArrayOfInt[(1 - 1 + paramInt6)] = 1;
      }
      return;
    }
    f1 = Slamch.slamch("Epsilon");
    f8 = Math.max(paramFloat2, f1);
    f5 = Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt2)]) + Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt3)]);
    i = 1;
    for (int j = paramInt1 - 1 - 1 + 1; j > 0; j--)
    {
      paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] -= paramFloat1;
      f6 = Math.abs(paramArrayOfFloat3[(i - 1 + paramInt4)]) + Math.abs(paramArrayOfFloat1[(i + 1 - 1 + paramInt2)]);
      if ((i >= paramInt1 - 1 ? 0 : 1) != 0) {
        f6 += Math.abs(paramArrayOfFloat2[(i + 1 - 1 + paramInt3)]);
      }
      if ((paramArrayOfFloat1[(i - 1 + paramInt2)] != 0.0F ? 0 : 1) != 0) {
        f3 = 0.0F;
      } else {
        f3 = Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]) / f5;
      }
      if ((paramArrayOfFloat3[(i - 1 + paramInt4)] != 0.0F ? 0 : 1) != 0)
      {
        paramArrayOfInt[(i - 1 + paramInt6)] = 0;
        f4 = 0.0F;
        f5 = f6;
        if ((i >= paramInt1 - 1 ? 0 : 1) != 0) {
          paramArrayOfFloat4[(i - 1 + paramInt5)] = 0.0F;
        }
      }
      else
      {
        f4 = Math.abs(paramArrayOfFloat3[(i - 1 + paramInt4)]) / f6;
        if ((f4 > f3 ? 0 : 1) != 0)
        {
          paramArrayOfInt[(i - 1 + paramInt6)] = 0;
          f5 = f6;
          paramArrayOfFloat3[(i - 1 + paramInt4)] /= paramArrayOfFloat1[(i - 1 + paramInt2)];
          paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] -= paramArrayOfFloat3[(i - 1 + paramInt4)] * paramArrayOfFloat2[(i - 1 + paramInt3)];
          if ((i >= paramInt1 - 1 ? 0 : 1) != 0) {
            paramArrayOfFloat4[(i - 1 + paramInt5)] = 0.0F;
          }
        }
        else
        {
          paramArrayOfInt[(i - 1 + paramInt6)] = 1;
          f2 = paramArrayOfFloat1[(i - 1 + paramInt2)] / paramArrayOfFloat3[(i - 1 + paramInt4)];
          paramArrayOfFloat1[(i - 1 + paramInt2)] = paramArrayOfFloat3[(i - 1 + paramInt4)];
          f7 = paramArrayOfFloat1[(i + 1 - 1 + paramInt2)];
          paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] = (paramArrayOfFloat2[(i - 1 + paramInt3)] - f2 * f7);
          if ((i >= paramInt1 - 1 ? 0 : 1) != 0)
          {
            paramArrayOfFloat4[(i - 1 + paramInt5)] = paramArrayOfFloat2[(i + 1 - 1 + paramInt3)];
            paramArrayOfFloat2[(i + 1 - 1 + paramInt3)] = (-(f2 * paramArrayOfFloat4[(i - 1 + paramInt5)]));
          }
          paramArrayOfFloat2[(i - 1 + paramInt3)] = f7;
          paramArrayOfFloat3[(i - 1 + paramInt4)] = f2;
        }
      }
      if ((Math.max(f3, f4) > f8 ? 0 : 1) != 0) {}
      if (((paramArrayOfInt[(paramInt1 - 1 + paramInt6)] != 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramArrayOfInt[(paramInt1 - 1 + paramInt6)] = i;
      }
      i += 1;
    }
    if ((Math.abs(paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)]) > f5 * f8 ? 0 : 1) != 0) {}
    if (((paramArrayOfInt[(paramInt1 - 1 + paramInt6)] != 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      paramArrayOfInt[(paramInt1 - 1 + paramInt6)] = paramInt1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slagtf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */