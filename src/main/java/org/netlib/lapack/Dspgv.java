package org.netlib.lapack;

import org.netlib.blas.Dtpmv;
import org.netlib.blas.Dtpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dspgv
{
  public static void dspgv(int paramInt1, String paramString1, String paramString2, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    String str = new String(" ");
    int i = 0;
    int j = 0;
    bool2 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "U");
    paramintW.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((!bool2) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((((!bool1) && (!Lsame.lsame(paramString2, "L")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((paramInt7 >= 1 ? 0 : 1) == 0) {
        if (!bool2) {}
      }
      if ((((paramInt7 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -9;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPGV ", -paramintW.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    Dpptrf.dpptrf(paramString2, paramInt2, paramArrayOfDouble2, paramInt4, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      paramintW.val = (paramInt2 + paramintW.val);
      return;
    }
    Dspgst.dspgst(paramInt1, paramString2, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramintW);
    Dspev.dspev(paramString1, paramString2, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble5, paramInt8, paramintW);
    if (bool2)
    {
      j = paramInt2;
      if ((paramintW.val <= 0 ? 0 : 1) != 0) {
        j = paramintW.val - 1;
      }
      if ((paramInt1 != 1 ? 0 : 1) == 0) {}
      int k;
      if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if (bool1) {
          str = "N";
        } else {
          str = "T";
        }
        i = 1;
        for (k = j - 1 + 1; k > 0; k--)
        {
          Dtpsv.dtpsv(paramString2, str, "Non-unit", paramInt2, paramArrayOfDouble2, paramInt4, paramArrayOfDouble4, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          i += 1;
        }
      }
      else if ((paramInt1 != 3 ? 0 : 1) != 0)
      {
        if (bool1) {
          str = "T";
        } else {
          str = "N";
        }
        i = 1;
        k = j - 1 + 1;
        for (;;)
        {
          Dtpmv.dtpmv(paramString2, str, "Non-unit", paramInt2, paramArrayOfDouble2, paramInt4, paramArrayOfDouble4, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
          i += 1;
          k--;
          if (k <= 0) {
            break;
          }
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dspgv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */