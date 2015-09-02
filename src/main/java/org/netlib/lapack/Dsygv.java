package org.netlib.lapack;

import org.netlib.blas.Dtrmm;
import org.netlib.blas.Dtrsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsygv
{
  public static void dsygv(int paramInt1, String paramString1, String paramString2, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    String str = new String(" ");
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    bool2 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "U");
    i = paramInt9 != -1 ? 0 : 1;
    paramintW.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((((!bool2) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0) {
      paramintW.val = -2;
    } else if ((((!bool1) && (!Lsame.lsame(paramString2, "L")) ? 0 : 1) ^ 0x1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -6;
    } else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -8;
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      j = Math.max(1, 3 * paramInt2 - 1);
      m = Ilaenv.ilaenv(1, "DSYTRD", paramString2, paramInt2, -1, -1, -1);
      k = Math.max(j, (m + 2) * paramInt2);
      paramArrayOfDouble4[(1 - 1 + paramInt8)] = k;
      if ((paramInt9 >= j ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -11;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYGV ", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    Dpotrf.dpotrf(paramString2, paramInt2, paramArrayOfDouble2, paramInt5, paramInt6, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      paramintW.val = (paramInt2 + paramintW.val);
      return;
    }
    Dsygst.dsygst(paramInt1, paramString2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6, paramintW);
    Dsyev.dsyev(paramString1, paramString2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, paramintW);
    if (bool2)
    {
      n = paramInt2;
      if ((paramintW.val <= 0 ? 0 : 1) != 0) {
        n = paramintW.val - 1;
      }
      if ((paramInt1 != 1 ? 0 : 1) == 0) {}
      if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if (bool1) {
          str = "N";
        } else {
          str = "T";
        }
        Dtrsm.dtrsm("Left", paramString2, str, "Non-unit", paramInt2, n, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, paramInt3, paramInt4);
      }
      else if ((paramInt1 != 3 ? 0 : 1) != 0)
      {
        if (bool1) {
          str = "T";
        } else {
          str = "N";
        }
        Dtrmm.dtrmm("Left", paramString2, str, "Non-unit", paramInt2, n, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, paramInt3, paramInt4);
      }
    }
    paramArrayOfDouble4[(1 - 1 + paramInt8)] = k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsygv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */