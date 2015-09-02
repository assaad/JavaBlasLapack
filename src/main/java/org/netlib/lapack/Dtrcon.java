package org.netlib.lapack;

import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtrcon
{
  public static void dtrcon(String paramString1, String paramString2, String paramString3, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, doubleW paramdoubleW, double[] paramArrayOfDouble2, int paramInt4, int[] paramArrayOfInt, int paramInt5, intW paramintW)
  {
    boolean bool1 = false;
    int i = 0;
    boolean bool2 = false;
    String str = new String(" ");
    int j = 0;
    intW localintW = new intW(0);
    int k = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d2 = 0.0D;
    double d3 = 0.0D;
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool2 = Lsame.lsame(paramString2, "U");
    i = (!paramString1.regionMatches(0, "1", 0, 1)) && (!Lsame.lsame(paramString1, "O")) ? 0 : 1;
    bool1 = Lsame.lsame(paramString3, "N");
    if ((((i ^ 0x1) != 0) && ((Lsame.lsame(paramString1, "I") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((((bool1 ^ true)) && ((Lsame.lsame(paramString3, "U") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -3;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTRCON", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramdoubleW.val = 1.0D;
      return;
    }
    paramdoubleW.val = 0.0D;
    d2 = Dlamch.dlamch("Safe minimum") * Math.max(1, paramInt1);
    d1 = Dlantr.dlantr(paramString1, paramString2, paramString3, paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4);
    if ((d1 <= 0.0D ? 0 : 1) != 0)
    {
      localdoubleW1.val = 0.0D;
      str = "N";
      if (i != 0) {
        k = 1;
      } else {
        k = 2;
      }
      localintW.val = 0;
      for (;;)
      {
        Dlacn2.dlacn2(paramInt1, paramArrayOfDouble2, paramInt1 + 1 - 1 + paramInt4, paramArrayOfDouble2, paramInt4, paramArrayOfInt, paramInt5, localdoubleW1, localintW, arrayOfInt, 0);
        if ((localintW.val == 0 ? 0 : 1) == 0) {
          break;
        }
        if ((localintW.val != k ? 0 : 1) != 0) {
          Dlatrs.dlatrs(paramString2, "No transpose", paramString3, str, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, localdoubleW2, paramArrayOfDouble2, 2 * paramInt1 + 1 - 1 + paramInt4, paramintW);
        } else {
          Dlatrs.dlatrs(paramString2, "Transpose", paramString3, str, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, localdoubleW2, paramArrayOfDouble2, 2 * paramInt1 + 1 - 1 + paramInt4, paramintW);
        }
        str = "Y";
        if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
        {
          j = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt4, 1);
          d3 = Math.abs(paramArrayOfDouble2[(j - 1 + paramInt4)]);
          if ((localdoubleW2.val >= d3 * d2 ? 0 : 1) == 0) {}
          if (((localdoubleW2.val != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
            return;
          }
          Drscl.drscl(paramInt1, localdoubleW2.val, paramArrayOfDouble2, paramInt4, 1);
        }
      }
      if ((localdoubleW1.val == 0.0D ? 0 : 1) != 0) {
        paramdoubleW.val = (1.0D / d1 / localdoubleW1.val);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtrcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */