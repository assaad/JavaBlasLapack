package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgttrf
{
  public static void sgttrf(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, float[] paramArrayOfFloat4, int paramInt5, int[] paramArrayOfInt, int paramInt6, intW paramintW)
  {
    int i = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
      Xerbla.xerbla("SGTTRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int j = paramInt1 - 1 + 1; j > 0; j--)
    {
      paramArrayOfInt[(i - 1 + paramInt6)] = i;
      i += 1;
    }
    i = 1;
    for (j = paramInt1 - 2 - 1 + 1; j > 0; j--)
    {
      paramArrayOfFloat4[(i - 1 + paramInt5)] = 0.0F;
      i += 1;
    }
    i = 1;
    for (j = paramInt1 - 2 - 1 + 1; j > 0; j--)
    {
      if ((Math.abs(paramArrayOfFloat2[(i - 1 + paramInt3)]) < Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]) ? 0 : 1) != 0)
      {
        if ((paramArrayOfFloat2[(i - 1 + paramInt3)] == 0.0F ? 0 : 1) != 0)
        {
          f1 = paramArrayOfFloat1[(i - 1 + paramInt2)] / paramArrayOfFloat2[(i - 1 + paramInt3)];
          paramArrayOfFloat1[(i - 1 + paramInt2)] = f1;
          paramArrayOfFloat2[(i + 1 - 1 + paramInt3)] -= f1 * paramArrayOfFloat3[(i - 1 + paramInt4)];
        }
      }
      else
      {
        f1 = paramArrayOfFloat2[(i - 1 + paramInt3)] / paramArrayOfFloat1[(i - 1 + paramInt2)];
        paramArrayOfFloat2[(i - 1 + paramInt3)] = paramArrayOfFloat1[(i - 1 + paramInt2)];
        paramArrayOfFloat1[(i - 1 + paramInt2)] = f1;
        f2 = paramArrayOfFloat3[(i - 1 + paramInt4)];
        paramArrayOfFloat3[(i - 1 + paramInt4)] = paramArrayOfFloat2[(i + 1 - 1 + paramInt3)];
        paramArrayOfFloat2[(i + 1 - 1 + paramInt3)] = (f2 - f1 * paramArrayOfFloat2[(i + 1 - 1 + paramInt3)]);
        paramArrayOfFloat4[(i - 1 + paramInt5)] = paramArrayOfFloat3[(i + 1 - 1 + paramInt4)];
        paramArrayOfFloat3[(i + 1 - 1 + paramInt4)] = (-(f1 * paramArrayOfFloat3[(i + 1 - 1 + paramInt4)]));
        paramArrayOfInt[(i - 1 + paramInt6)] = (i + 1);
      }
      i += 1;
    }
    if ((paramInt1 <= 1 ? 0 : 1) != 0)
    {
      i = paramInt1 - 1;
      if ((Math.abs(paramArrayOfFloat2[(i - 1 + paramInt3)]) < Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]) ? 0 : 1) != 0)
      {
        if ((paramArrayOfFloat2[(i - 1 + paramInt3)] == 0.0F ? 0 : 1) != 0)
        {
          f1 = paramArrayOfFloat1[(i - 1 + paramInt2)] / paramArrayOfFloat2[(i - 1 + paramInt3)];
          paramArrayOfFloat1[(i - 1 + paramInt2)] = f1;
          paramArrayOfFloat2[(i + 1 - 1 + paramInt3)] -= f1 * paramArrayOfFloat3[(i - 1 + paramInt4)];
        }
      }
      else
      {
        f1 = paramArrayOfFloat2[(i - 1 + paramInt3)] / paramArrayOfFloat1[(i - 1 + paramInt2)];
        paramArrayOfFloat2[(i - 1 + paramInt3)] = paramArrayOfFloat1[(i - 1 + paramInt2)];
        paramArrayOfFloat1[(i - 1 + paramInt2)] = f1;
        f2 = paramArrayOfFloat3[(i - 1 + paramInt4)];
        paramArrayOfFloat3[(i - 1 + paramInt4)] = paramArrayOfFloat2[(i + 1 - 1 + paramInt3)];
        paramArrayOfFloat2[(i + 1 - 1 + paramInt3)] = (f2 - f1 * paramArrayOfFloat2[(i + 1 - 1 + paramInt3)]);
        paramArrayOfInt[(i - 1 + paramInt6)] = (i + 1);
      }
    }
    i = 1;
    for (j = paramInt1 - 1 + 1; j > 0; j--)
    {
      if ((paramArrayOfFloat2[(i - 1 + paramInt3)] != 0.0F ? 0 : 1) != 0)
      {
        paramintW.val = i;
        break;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgttrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */