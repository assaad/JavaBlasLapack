package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgebd2
{
  public static void dgebd2(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, double[] paramArrayOfDouble6, int paramInt9, intW paramintW)
  {
    int i = 0;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val >= 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEBD2", -paramintW.val);
      return;
    }
    int j;
    if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        dlarfg_adapter(paramInt1 - i + 1, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, Math.min(i + 1, paramInt1) - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble4, i - 1 + paramInt7);
        paramArrayOfDouble2[(i - 1 + paramInt5)] = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
        paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0D;
        if ((i >= paramInt2 ? 0 : 1) != 0) {
          Dlarf.dlarf("Left", paramInt1 - i + 1, paramInt2 - i, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble4[(i - 1 + paramInt7)], paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble6, paramInt9);
        }
        paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble2[(i - 1 + paramInt5)];
        if ((i >= paramInt2 ? 0 : 1) != 0)
        {
          dlarfg_adapter(paramInt2 - i, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, i - 1 + (Math.min(i + 2, paramInt2) - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5, i - 1 + paramInt8);
          paramArrayOfDouble3[(i - 1 + paramInt6)] = paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt4 + paramInt3)];
          paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt4 + paramInt3)] = 1.0D;
          Dlarf.dlarf("Right", paramInt1 - i, paramInt2 - i, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5[(i - 1 + paramInt8)], paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble6, paramInt9);
          paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble3[(i - 1 + paramInt6)];
        }
        else
        {
          paramArrayOfDouble5[(i - 1 + paramInt8)] = 0.0D;
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        dlarfg_adapter(paramInt2 - i + 1, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, i - 1 + (Math.min(i + 1, paramInt2) - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5, i - 1 + paramInt8);
        paramArrayOfDouble2[(i - 1 + paramInt5)] = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
        paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0D;
        if ((i >= paramInt1 ? 0 : 1) != 0) {
          Dlarf.dlarf("Right", paramInt1 - i, paramInt2 - i + 1, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5[(i - 1 + paramInt8)], paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble6, paramInt9);
        }
        paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble2[(i - 1 + paramInt5)];
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          dlarfg_adapter(paramInt1 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, Math.min(i + 2, paramInt1) - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble4, i - 1 + paramInt7);
          paramArrayOfDouble3[(i - 1 + paramInt6)] = paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt4 + paramInt3)];
          paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0D;
          Dlarf.dlarf("Left", paramInt1 - i, paramInt2 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble4[(i - 1 + paramInt7)], paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble6, paramInt9);
          paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble3[(i - 1 + paramInt6)];
        }
        else
        {
          paramArrayOfDouble4[(i - 1 + paramInt7)] = 0.0D;
        }
        i += 1;
      }
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgebd2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */