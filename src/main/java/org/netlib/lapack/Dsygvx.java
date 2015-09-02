package org.netlib.lapack;

import org.netlib.blas.Dtrmm;
import org.netlib.blas.Dtrsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsygvx
{
  public static void dsygvx(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double paramDouble1, double paramDouble2, int paramInt7, int paramInt8, double paramDouble3, intW paramintW1, double[] paramArrayOfDouble3, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, int[] paramArrayOfInt1, int paramInt14, int[] paramArrayOfInt2, int paramInt15, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    String str = new String(" ");
    int j = 0;
    int k = 0;
    int m = 0;
    bool3 = Lsame.lsame(paramString3, "U");
    bool5 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "A");
    bool4 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
    i = paramInt13 != -1 ? 0 : 1;
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
      else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
      {
        paramintW2.val = -7;
      }
      else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
      {
        paramintW2.val = -9;
      }
      else if (bool4)
      {
        if ((paramInt2 <= 0 ? 0 : 1) != 0) {}
        if (((paramDouble2 > paramDouble1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -11;
        }
      }
      else if (bool2)
      {
        if ((paramInt7 >= 1 ? 0 : 1) == 0) {}
        if (((paramInt7 <= Math.max(1, paramInt2) ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = -12;
        }
        else
        {
          if ((paramInt8 >= Math.min(paramInt2, paramInt7) ? 0 : 1) == 0) {}
          if (((paramInt8 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramintW2.val = -13;
          }
        }
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt11 >= 1 ? 0 : 1) == 0) {
        if (!bool5) {}
      }
      if ((((paramInt11 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -18;
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      j = Math.max(1, 8 * paramInt2);
      m = Ilaenv.ilaenv(1, "DSYTRD", paramString3, paramInt2, -1, -1, -1);
      k = Math.max(j, (m + 3) * paramInt2);
      paramArrayOfDouble5[(1 - 1 + paramInt12)] = k;
      if ((paramInt13 >= j ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -20;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYGVX", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
    paramintW1.val = 0;
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    Dpotrf.dpotrf(paramString3, paramInt2, paramArrayOfDouble2, paramInt5, paramInt6, paramintW2);
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = (paramInt2 + paramintW2.val);
      return;
    }
    Dsygst.dsygst(paramInt1, paramString3, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6, paramintW2);
    Dsyevx.dsyevx(paramString1, paramString2, paramString3, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramDouble1, paramDouble2, paramInt7, paramInt8, paramDouble3, paramintW1, paramArrayOfDouble3, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfInt1, paramInt14, paramArrayOfInt2, paramInt15, paramintW2);
    if (bool5)
    {
      if ((paramintW2.val <= 0 ? 0 : 1) != 0) {
        paramintW2.val -= 1;
      }
      if ((paramInt1 != 1 ? 0 : 1) == 0) {}
      if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if (bool3) {
          str = "N";
        } else {
          str = "T";
        }
        Dtrsm.dtrsm("Left", paramString3, str, "Non-unit", paramInt2, paramintW1.val, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble4, paramInt10, paramInt11);
      }
      else if ((paramInt1 != 3 ? 0 : 1) != 0)
      {
        if (bool3) {
          str = "T";
        } else {
          str = "N";
        }
        Dtrmm.dtrmm("Left", paramString3, str, "Non-unit", paramInt2, paramintW1.val, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble4, paramInt10, paramInt11);
      }
    }
    paramArrayOfDouble5[(1 - 1 + paramInt12)] = k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsygvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */