package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slatrz
{
  public static void slatrz(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7)
  {
    int i = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != paramInt2 ? 0 : 1) != 0)
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt6)] = 0.0F;
        i += 1;
      }
      return;
    }
    i = paramInt1;
    for (int j = (1 - paramInt1 + -1) / -1; j > 0; j--)
    {
      slarfg_adapter(paramInt3 + 1, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, i - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, i - 1 + paramInt6);
      Slarz.slarz("Right", i - 1, paramInt2 - i + 1, paramInt3, paramArrayOfFloat1, i - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt7);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slatrz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */