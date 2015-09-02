package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dsycon
{
  public static void dsycon(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, double paramDouble, doubleW paramdoubleW, double[] paramArrayOfDouble2, int paramInt5, int[] paramArrayOfInt2, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    intW localintW = new intW(0);
    doubleW localdoubleW = new doubleW(0.0D);
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramDouble >= 0.0D ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYCON", -paramintW.val);
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
    int j;
    if (bool)
    {
      i = paramInt1;
      for (j = (1 - paramInt1 + -1) / -1; j > 0; j--)
      {
        if ((paramArrayOfInt1[(i - 1 + paramInt4)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        i += -1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        if ((paramArrayOfInt1[(i - 1 + paramInt4)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        i += 1;
      }
    }
    localintW.val = 0;
    for (;;)
    {
      Dlacn2.dlacn2(paramInt1, paramArrayOfDouble2, paramInt1 + 1 - 1 + paramInt5, paramArrayOfDouble2, paramInt5, paramArrayOfInt2, paramInt6, localdoubleW, localintW, arrayOfInt, 0);
      if ((localintW.val == 0 ? 0 : 1) == 0) {
        break;
      }
      Dsytrs.dsytrs(paramString, paramInt1, 1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfInt1, paramInt4, paramArrayOfDouble2, paramInt5, paramInt1, paramintW);
    }
    if ((localdoubleW.val == 0.0D ? 0 : 1) != 0) {
      paramdoubleW.val = (1.0D / localdoubleW.val / paramDouble);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsycon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */