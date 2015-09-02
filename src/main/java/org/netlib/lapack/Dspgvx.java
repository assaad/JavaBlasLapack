package org.netlib.lapack;

import org.netlib.blas.Dtpmv;
import org.netlib.blas.Dtpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dspgvx
{
  public static void dspgvx(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double paramDouble1, double paramDouble2, int paramInt5, int paramInt6, double paramDouble3, intW paramintW1, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int[] paramArrayOfInt1, int paramInt11, int[] paramArrayOfInt2, int paramInt12, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    String str = new String(" ");
    int i = 0;
    bool3 = Lsame.lsame(paramString3, "U");
    bool5 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "A");
    bool4 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
    paramintW2.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((((!bool5) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW2.val = -2;
    }
    else
    {
      if (((!bool1) && (!bool4) ? 0 : 1) == 0) {}
      if (((!bool2 ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -3;
      }
      else if ((((!bool3) && (!Lsame.lsame(paramString3, "L")) ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -4;
      }
      else if ((paramInt2 >= 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -5;
      }
      else if (bool4)
      {
        if ((paramInt2 <= 0 ? 0 : 1) != 0) {}
        if (((paramDouble2 > paramDouble1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -9;
        }
      }
      else if (bool2)
      {
        if ((paramInt5 >= 1 ? 0 : 1) != 0)
        {
          paramintW2.val = -10;
        }
        else
        {
          if ((paramInt6 >= Math.min(paramInt2, paramInt5) ? 0 : 1) == 0) {}
          if (((paramInt6 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramintW2.val = -11;
          }
        }
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt9 >= 1 ? 0 : 1) == 0) {
        if (!bool5) {}
      }
      if ((((paramInt9 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -16;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPGVX", -paramintW2.val);
      return;
    }
    paramintW1.val = 0;
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    Dpptrf.dpptrf(paramString3, paramInt2, paramArrayOfDouble2, paramInt4, paramintW2);
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = (paramInt2 + paramintW2.val);
      return;
    }
    Dspgst.dspgst(paramInt1, paramString3, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramintW2);
    Dspevx.dspevx(paramString1, paramString2, paramString3, paramInt2, paramArrayOfDouble1, paramInt3, paramDouble1, paramDouble2, paramInt5, paramInt6, paramDouble3, paramintW1, paramArrayOfDouble3, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, paramInt10, paramArrayOfInt1, paramInt11, paramArrayOfInt2, paramInt12, paramintW2);
    if (bool5)
    {
      if ((paramintW2.val <= 0 ? 0 : 1) != 0) {
        paramintW2.val -= 1;
      }
      if ((paramInt1 != 1 ? 0 : 1) == 0) {}
      int j;
      if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if (bool3) {
          str = "N";
        } else {
          str = "T";
        }
        i = 1;
        for (j = paramintW1.val - 1 + 1; j > 0; j--)
        {
          Dtpsv.dtpsv(paramString3, str, "Non-unit", paramInt2, paramArrayOfDouble2, paramInt4, paramArrayOfDouble4, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
          i += 1;
        }
      }
      else if ((paramInt1 != 3 ? 0 : 1) != 0)
      {
        if (bool3) {
          str = "T";
        } else {
          str = "N";
        }
        i = 1;
        j = paramintW1.val - 1 + 1;
        for (;;)
        {
          Dtpmv.dtpmv(paramString3, str, "Non-unit", paramInt2, paramArrayOfDouble2, paramInt4, paramArrayOfDouble4, 1 - 1 + (i - 1) * paramInt9 + paramInt8, 1);
          i += 1;
          j--;
          if (j <= 0) {
            break;
          }
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dspgvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */