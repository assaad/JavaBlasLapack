package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgehd2
{
  public static void dgehd2(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, intW paramintW)
  {
    int i = 0;
    double d = 0.0D;
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
      Xerbla.xerbla("DGEHD2", -paramintW.val);
      return;
    }
    i = paramInt2;
    for (int j = paramInt3 - 1 - paramInt2 + 1; j > 0; j--)
    {
      dlarfg_adapter(paramInt3 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, Math.min(i + 2, paramInt1) - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, i - 1 + paramInt6);
      d = paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)];
      paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0D;
      Dlarf.dlarf("Right", paramInt3, paramInt3 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2[(i - 1 + paramInt6)], paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt7);
      Dlarf.dlarf("Left", paramInt3 - i, paramInt1 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2[(i - 1 + paramInt6)], paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt7);
      paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)] = d;
      i += 1;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgehd2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */