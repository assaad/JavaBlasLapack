package org.netlib.lapack;

import org.netlib.util.intW;

public final class Slarra
{
  public static void slarra(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, float paramFloat1, float paramFloat2, intW paramintW1, int[] paramArrayOfInt, int paramInt5, intW paramintW2)
  {
    int i = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    paramintW2.val = 0;
    paramintW1.val = 1;
    int j;
    if ((paramFloat1 >= 0.0F ? 0 : 1) != 0)
    {
      f2 = Math.abs(paramFloat1) * paramFloat2;
      i = 1;
      for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
      {
        f1 = Math.abs(paramArrayOfFloat2[(i - 1 + paramInt3)]);
        if ((f1 > f2 ? 0 : 1) != 0)
        {
          paramArrayOfFloat2[(i - 1 + paramInt3)] = 0.0F;
          paramArrayOfFloat3[(i - 1 + paramInt4)] = 0.0F;
          paramArrayOfInt[(paramintW1.val - 1 + paramInt5)] = i;
          paramintW1.val += 1;
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
      {
        f1 = Math.abs(paramArrayOfFloat2[(i - 1 + paramInt3)]);
        if ((f1 > paramFloat1 * (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)])) * (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(i + 1 - 1 + paramInt2)])) ? 0 : 1) != 0)
        {
          paramArrayOfFloat2[(i - 1 + paramInt3)] = 0.0F;
          paramArrayOfFloat3[(i - 1 + paramInt4)] = 0.0F;
          paramArrayOfInt[(paramintW1.val - 1 + paramInt5)] = i;
          paramintW1.val += 1;
        }
        i += 1;
      }
    }
    paramArrayOfInt[(paramintW1.val - 1 + paramInt5)] = paramInt1;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarra.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */