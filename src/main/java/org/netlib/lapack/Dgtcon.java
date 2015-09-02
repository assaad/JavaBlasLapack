package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgtcon
{
  public static void dgtcon(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, double[] paramArrayOfDouble4, int paramInt5, int[] paramArrayOfInt1, int paramInt6, double paramDouble, doubleW paramdoubleW, double[] paramArrayOfDouble5, int paramInt7, int[] paramArrayOfInt2, int paramInt8, intW paramintW)
  {
    int i = 0;
    int j = 0;
    intW localintW = new intW(0);
    int k = 0;
    doubleW localdoubleW = new doubleW(0.0D);
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    i = (!paramString.regionMatches(0, "1", 0, 1)) && (!Lsame.lsame(paramString, "O")) ? 0 : 1;
    if ((((i ^ 0x1) != 0) && ((Lsame.lsame(paramString, "I") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramDouble >= 0.0D ? 0 : 1) != 0) {
      paramintW.val = -8;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGTCON", -paramintW.val);
      return;
    }
    paramdoubleW.val = 0.0D;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramdoubleW.val = 1.0D;
      return;
    }
    if ((paramDouble != 0.0D ? 0 : 1) != 0) {
      return;
    }
    j = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      if ((paramArrayOfDouble2[(j - 1 + paramInt3)] != 0.0D ? 0 : 1) != 0) {
        return;
      }
      j += 1;
    }
    localdoubleW.val = 0.0D;
    if (i != 0) {
      k = 1;
    } else {
      k = 2;
    }
    localintW.val = 0;
    for (;;)
    {
      Dlacn2.dlacn2(paramInt1, paramArrayOfDouble5, paramInt1 + 1 - 1 + paramInt7, paramArrayOfDouble5, paramInt7, paramArrayOfInt2, paramInt8, localdoubleW, localintW, arrayOfInt, 0);
      if ((localintW.val == 0 ? 0 : 1) == 0) {
        break;
      }
      if ((localintW.val != k ? 0 : 1) != 0) {
        Dgttrs.dgttrs("No transpose", paramInt1, 1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfDouble3, paramInt4, paramArrayOfDouble4, paramInt5, paramArrayOfInt1, paramInt6, paramArrayOfDouble5, paramInt7, paramInt1, paramintW);
      } else {
        Dgttrs.dgttrs("Transpose", paramInt1, 1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfDouble3, paramInt4, paramArrayOfDouble4, paramInt5, paramArrayOfInt1, paramInt6, paramArrayOfDouble5, paramInt7, paramInt1, paramintW);
      }
    }
    if ((localdoubleW.val == 0.0D ? 0 : 1) != 0) {
      paramdoubleW.val = (1.0D / localdoubleW.val / paramDouble);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgtcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */