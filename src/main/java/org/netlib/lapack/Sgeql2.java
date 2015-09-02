package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgeql2
{
  public static void sgeql2(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, intW paramintW)
  {
    int i = 0;
    int j = 0;
    float f = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGEQL2", -paramintW.val);
      return;
    }
    j = Math.min(paramInt1, paramInt2);
    i = j;
    for (int k = (1 - j + -1) / -1; k > 0; k--)
    {
      slarfg_adapter(paramInt1 - j + i, paramArrayOfFloat1, paramInt1 - j + i - 1 + (paramInt2 - j + i - 1) * paramInt4 + paramInt3, paramArrayOfFloat1, 1 - 1 + (paramInt2 - j + i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, i - 1 + paramInt5);
      f = paramArrayOfFloat1[(paramInt1 - j + i - 1 + (paramInt2 - j + i - 1) * paramInt4 + paramInt3)];
      paramArrayOfFloat1[(paramInt1 - j + i - 1 + (paramInt2 - j + i - 1) * paramInt4 + paramInt3)] = 1.0F;
      Slarf.slarf("Left", paramInt1 - j + i, paramInt2 - j + i - 1, paramArrayOfFloat1, 1 - 1 + (paramInt2 - j + i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2[(i - 1 + paramInt5)], paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6);
      paramArrayOfFloat1[(paramInt1 - j + i - 1 + (paramInt2 - j + i - 1) * paramInt4 + paramInt3)] = f;
      i += -1;
    }
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float[] paramArrayOfFloat3, int paramInt5)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt2]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat3[paramInt5]);
    Slarfg.slarfg(paramInt1, localfloatW1, paramArrayOfFloat2, paramInt3, paramInt4, localfloatW2);
    paramArrayOfFloat1[paramInt2] = localfloatW1.val;
    paramArrayOfFloat3[paramInt5] = localfloatW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgeql2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */