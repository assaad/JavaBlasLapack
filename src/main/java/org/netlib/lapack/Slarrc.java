package org.netlib.lapack;

import org.netlib.util.intW;

public final class Slarrc
{
  public static void slarrc(String paramString, int paramInt1, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float paramFloat3, intW paramintW1, intW paramintW2, intW paramintW3, intW paramintW4)
  {
    int i = 0;
    boolean bool = false;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    paramintW4.val = 0;
    paramintW2.val = 0;
    paramintW3.val = 0;
    paramintW1.val = 0;
    bool = Lsame.lsame(paramString, "T");
    int j;
    if (bool)
    {
      f1 = paramArrayOfFloat1[(1 - 1 + paramInt2)] - paramFloat1;
      f2 = paramArrayOfFloat1[(1 - 1 + paramInt2)] - paramFloat2;
      if ((f1 > 0.0F ? 0 : 1) != 0) {
        paramintW2.val += 1;
      }
      if ((f2 > 0.0F ? 0 : 1) != 0) {
        paramintW3.val += 1;
      }
      i = 1;
      for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
      {
        f5 = (float)Math.pow(paramArrayOfFloat2[(i - 1 + paramInt3)], 2);
        f1 = paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] - paramFloat1 - f5 / f1;
        f2 = paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] - paramFloat2 - f5 / f2;
        if ((f1 > 0.0F ? 0 : 1) != 0) {
          paramintW2.val += 1;
        }
        if ((f2 > 0.0F ? 0 : 1) != 0) {
          paramintW3.val += 1;
        }
        i += 1;
      }
    }
    else
    {
      f3 = -paramFloat1;
      f4 = -paramFloat2;
      i = 1;
      for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
      {
        f1 = paramArrayOfFloat1[(i - 1 + paramInt2)] + f3;
        f2 = paramArrayOfFloat1[(i - 1 + paramInt2)] + f4;
        if ((f1 > 0.0F ? 0 : 1) != 0) {
          paramintW2.val += 1;
        }
        if ((f2 > 0.0F ? 0 : 1) != 0) {
          paramintW3.val += 1;
        }
        f5 = paramArrayOfFloat2[(i - 1 + paramInt3)] * paramArrayOfFloat1[(i - 1 + paramInt2)] * paramArrayOfFloat2[(i - 1 + paramInt3)];
        f6 = f5 / f1;
        if ((f6 != 0.0F ? 0 : 1) != 0) {
          f3 = f5 - paramFloat1;
        } else {
          f3 = f3 * f6 - paramFloat1;
        }
        f6 = f5 / f2;
        if ((f6 != 0.0F ? 0 : 1) != 0) {
          f4 = f5 - paramFloat2;
        } else {
          f4 = f4 * f6 - paramFloat2;
        }
        i += 1;
      }
      f1 = paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)] + f3;
      f2 = paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)] + f4;
      if ((f1 > 0.0F ? 0 : 1) != 0) {
        paramintW2.val += 1;
      }
      if ((f2 > 0.0F ? 0 : 1) != 0) {
        paramintW3.val += 1;
      }
    }
    paramintW3.val -= paramintW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarrc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */