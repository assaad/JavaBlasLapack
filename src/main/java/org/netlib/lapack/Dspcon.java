package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dspcon
{
  public static void dspcon(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int[] paramArrayOfInt1, int paramInt3, double paramDouble, doubleW paramdoubleW, double[] paramArrayOfDouble2, int paramInt4, int[] paramArrayOfInt2, int paramInt5, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    intW localintW = new intW(0);
    doubleW localdoubleW = new doubleW(0.0D);
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramDouble >= 0.0D ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPCON", -paramintW.val);
      return;
    }
    paramdoubleW.val = 0.0D;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramdoubleW.val = 1.0D;
      return;
    }
    if ((paramDouble > 0.0D ? 0 : 1) != 0) {
      return;
    }
    int k;
    if (bool)
    {
      j = paramInt1 * (paramInt1 + 1) / 2;
      i = paramInt1;
      for (k = (1 - paramInt1 + -1) / -1; k > 0; k--)
      {
        if ((paramArrayOfInt1[(i - 1 + paramInt3)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble1[(j - 1 + paramInt2)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        j -= i;
        i += -1;
      }
    }
    else
    {
      j = 1;
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        if ((paramArrayOfInt1[(i - 1 + paramInt3)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble1[(j - 1 + paramInt2)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        j = j + paramInt1 - i + 1;
        i += 1;
      }
    }
    localintW.val = 0;
    for (;;)
    {
      Dlacn2.dlacn2(paramInt1, paramArrayOfDouble2, paramInt1 + 1 - 1 + paramInt4, paramArrayOfDouble2, paramInt4, paramArrayOfInt2, paramInt5, localdoubleW, localintW, arrayOfInt, 0);
      if ((localintW.val == 0 ? 0 : 1) == 0) {
        break;
      }
      Dsptrs.dsptrs(paramString, paramInt1, 1, paramArrayOfDouble1, paramInt2, paramArrayOfInt1, paramInt3, paramArrayOfDouble2, paramInt4, paramInt1, paramintW);
    }
    if ((localdoubleW.val == 0.0D ? 0 : 1) != 0) {
      paramdoubleW.val = (1.0D / localdoubleW.val / paramDouble);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dspcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */