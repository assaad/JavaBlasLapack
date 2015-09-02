package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spttrf
{
  public static void spttrf(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, intW paramintW)
  {
    int i = 0;
    int j = 0;
    float f = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
      Xerbla.xerbla("SPTTRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    j = (paramInt1 - 1) % 4;
    i = 1;
    for (int k = j - 1 + 1; k > 0; k--)
    {
      if ((paramArrayOfFloat1[(i - 1 + paramInt2)] > 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = i;
        break;
      }
      f = paramArrayOfFloat2[(i - 1 + paramInt3)];
      paramArrayOfFloat2[(i - 1 + paramInt3)] = (f / paramArrayOfFloat1[(i - 1 + paramInt2)]);
      paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] -= paramArrayOfFloat2[(i - 1 + paramInt3)] * f;
      i += 1;
    }
    i = j + 1;
    for (int k = (paramInt1 - 4 - (j + 1) + 4) / 4; k > 0; k--)
    {
      if ((paramArrayOfFloat1[(i - 1 + paramInt2)] > 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = i;
        break;
      }
      f = paramArrayOfFloat2[(i - 1 + paramInt3)];
      paramArrayOfFloat2[(i - 1 + paramInt3)] = (f / paramArrayOfFloat1[(i - 1 + paramInt2)]);
      paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] -= paramArrayOfFloat2[(i - 1 + paramInt3)] * f;
      if ((paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] > 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = (i + 1);
        break;
      }
      f = paramArrayOfFloat2[(i + 1 - 1 + paramInt3)];
      paramArrayOfFloat2[(i + 1 - 1 + paramInt3)] = (f / paramArrayOfFloat1[(i + 1 - 1 + paramInt2)]);
      paramArrayOfFloat1[(i + 2 - 1 + paramInt2)] -= paramArrayOfFloat2[(i + 1 - 1 + paramInt3)] * f;
      if ((paramArrayOfFloat1[(i + 2 - 1 + paramInt2)] > 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = (i + 2);
        break;
      }
      f = paramArrayOfFloat2[(i + 2 - 1 + paramInt3)];
      paramArrayOfFloat2[(i + 2 - 1 + paramInt3)] = (f / paramArrayOfFloat1[(i + 2 - 1 + paramInt2)]);
      paramArrayOfFloat1[(i + 3 - 1 + paramInt2)] -= paramArrayOfFloat2[(i + 2 - 1 + paramInt3)] * f;
      if ((paramArrayOfFloat1[(i + 3 - 1 + paramInt2)] > 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = (i + 3);
        break;
      }
      f = paramArrayOfFloat2[(i + 3 - 1 + paramInt3)];
      paramArrayOfFloat2[(i + 3 - 1 + paramInt3)] = (f / paramArrayOfFloat1[(i + 3 - 1 + paramInt2)]);
      paramArrayOfFloat1[(i + 4 - 1 + paramInt2)] -= paramArrayOfFloat2[(i + 3 - 1 + paramInt3)] * f;
      i += 4;
    }
    if ((paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)] > 0.0F ? 0 : 1) != 0) {
      paramintW.val = paramInt1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spttrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */