package org.netlib.lapack;

import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dpocon
{
  public static void dpocon(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double paramDouble, doubleW paramdoubleW, double[] paramArrayOfDouble2, int paramInt4, int[] paramArrayOfInt, int paramInt5, intW paramintW)
  {
    boolean bool = false;
    String str = new String(" ");
    int i = 0;
    intW localintW = new intW(0);
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d2 = 0.0D;
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
      paramintW.val = -5;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPOCON", -paramintW.val);
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
    d2 = Dlamch.dlamch("Safe minimum");
    localintW.val = 0;
    str = "N";
    for (;;)
    {
      Dlacn2.dlacn2(paramInt1, paramArrayOfDouble2, paramInt1 + 1 - 1 + paramInt4, paramArrayOfDouble2, paramInt4, paramArrayOfInt, paramInt5, localdoubleW1, localintW, arrayOfInt, 0);
      if ((localintW.val == 0 ? 0 : 1) == 0) {
        break;
      }
      if (bool)
      {
        Dlatrs.dlatrs("Upper", "Transpose", "Non-unit", str, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, localdoubleW2, paramArrayOfDouble2, 2 * paramInt1 + 1 - 1 + paramInt4, paramintW);
        str = "Y";
        Dlatrs.dlatrs("Upper", "No transpose", "Non-unit", str, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, localdoubleW3, paramArrayOfDouble2, 2 * paramInt1 + 1 - 1 + paramInt4, paramintW);
      }
      else
      {
        Dlatrs.dlatrs("Lower", "No transpose", "Non-unit", str, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, localdoubleW2, paramArrayOfDouble2, 2 * paramInt1 + 1 - 1 + paramInt4, paramintW);
        str = "Y";
        Dlatrs.dlatrs("Lower", "Transpose", "Non-unit", str, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, localdoubleW3, paramArrayOfDouble2, 2 * paramInt1 + 1 - 1 + paramInt4, paramintW);
      }
      d1 = localdoubleW2.val * localdoubleW3.val;
      if ((d1 == 1.0D ? 0 : 1) != 0)
      {
        i = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt4, 1);
        if ((d1 >= Math.abs(paramArrayOfDouble2[(i - 1 + paramInt4)]) * d2 ? 0 : 1) == 0) {}
        if (((d1 != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
          return;
        }
        Drscl.drscl(paramInt1, d1, paramArrayOfDouble2, paramInt4, 1);
      }
    }
    if ((localdoubleW1.val == 0.0D ? 0 : 1) != 0) {
      paramdoubleW.val = (1.0D / localdoubleW1.val / paramDouble);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpocon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */