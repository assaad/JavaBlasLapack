package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Spoequ
{
  public static void spoequ(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, floatW paramfloatW1, floatW paramfloatW2, intW paramintW)
  {
    int i = 0;
    float f = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -3;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPOEQU", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramfloatW1.val = 1.0F;
      paramfloatW2.val = 0.0F;
      return;
    }
    paramArrayOfFloat2[(1 - 1 + paramInt4)] = paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)];
    f = paramArrayOfFloat2[(1 - 1 + paramInt4)];
    paramfloatW2.val = paramArrayOfFloat2[(1 - 1 + paramInt4)];
    i = 2;
    for (int j = paramInt1 - 2 + 1; j > 0; j--)
    {
      paramArrayOfFloat2[(i - 1 + paramInt4)] = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
      f = Math.min(f, paramArrayOfFloat2[(i - 1 + paramInt4)]);
      paramfloatW2.val = Math.max(paramfloatW2.val, paramArrayOfFloat2[(i - 1 + paramInt4)]);
      i += 1;
    }
    if ((f > 0.0F ? 0 : 1) != 0)
    {
      i = 1;
      for (int j = paramInt1 - 1 + 1; j > 0; j--)
      {
        if ((paramArrayOfFloat2[(i - 1 + paramInt4)] > 0.0F ? 0 : 1) != 0)
        {
          paramintW.val = i;
          return;
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (int j = paramInt1 - 1 + 1; j > 0; j--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt4)] = (1.0F / (float)Math.sqrt(paramArrayOfFloat2[(i - 1 + paramInt4)]));
        i += 1;
      }
      paramfloatW1.val = ((float)Math.sqrt(f) / (float)Math.sqrt(paramfloatW2.val));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spoequ.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */