package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlatrz
{
  public static void dlatrz(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7)
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
        paramArrayOfDouble2[(i - 1 + paramInt6)] = 0.0D;
        i += 1;
      }
      return;
    }
    i = paramInt1;
    for (int j = (1 - paramInt1 + -1) / -1; j > 0; j--)
    {
      dlarfg_adapter(paramInt3 + 1, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i - 1 + paramInt6);
      Dlarz.dlarz("Right", i - 1, paramInt2 - i + 1, paramInt3, paramArrayOfDouble1, i - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2[(i - 1 + paramInt6)], paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt7);
      i += -1;
    }
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double[] paramArrayOfDouble3, int paramInt5)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt2]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble3[paramInt5]);
    Dlarfg.dlarfg(paramInt1, localdoubleW1, paramArrayOfDouble2, paramInt3, paramInt4, localdoubleW2);
    paramArrayOfDouble1[paramInt2] = localdoubleW1.val;
    paramArrayOfDouble3[paramInt5] = localdoubleW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlatrz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */