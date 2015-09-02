package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgehd2
{
  public static void sgehd2(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, intW paramintW)
  {
    int i = 0;
    float f = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt2 >= 1 ? 0 : 1) == 0) {}
      if (((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
      }
      else
      {
        if ((paramInt3 >= Math.min(paramInt2, paramInt1) ? 0 : 1) == 0) {}
        if (((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW.val = -3;
        } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -5;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGEHD2", -paramintW.val);
      return;
    }
    i = paramInt2;
    for (int j = paramInt3 - 1 - paramInt2 + 1; j > 0; j--)
    {
      slarfg_adapter(paramInt3 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, Math.min(i + 2, paramInt1) - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, i - 1 + paramInt6);
      f = paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)];
      paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0F;
      Slarf.slarf("Right", paramInt3, paramInt3 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt7);
      Slarf.slarf("Left", paramInt3 - i, paramInt1 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt7);
      paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)] = f;
      i += 1;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgehd2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */