package org.netlib.lapack;

import org.netlib.blas.Dtpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dtptrs
{
  public static void dtptrs(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    int j = 0;
    paramintW.val = 0;
    bool2 = Lsame.lsame(paramString1, "U");
    bool1 = Lsame.lsame(paramString3, "N");
    if ((((bool2 ^ true)) && ((Lsame.lsame(paramString1, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((((Lsame.lsame(paramString2, "N") ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0) {
        paramintW.val = -2;
      } else if ((((bool1 ^ true)) && ((Lsame.lsame(paramString3, "U") ^ true)) ? 1 : 0) != 0) {
        paramintW.val = -3;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -4;
      } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -5;
      } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -8;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTPTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if (bool1) {
      if (bool2)
      {
        j = 1;
        paramintW.val = 1;
        for (k = paramInt1 - 1 + 1; k > 0; k--)
        {
          if ((paramArrayOfDouble1[(j + paramintW.val - 1 - 1 + paramInt3)] != 0.0D ? 0 : 1) != 0) {
            return;
          }
          j += paramintW.val;
          paramintW.val += 1;
        }
      }
      else
      {
        j = 1;
        paramintW.val = 1;
        for (k = paramInt1 - 1 + 1; k > 0; k--)
        {
          if ((paramArrayOfDouble1[(j - 1 + paramInt3)] != 0.0D ? 0 : 1) != 0) {
            return;
          }
          j = j + paramInt1 - paramintW.val + 1;
          paramintW.val += 1;
        }
      }
    }
    paramintW.val = 0;
    i = 1;
    for (int k = paramInt2 - 1 + 1; k > 0; k--)
    {
      Dtpsv.dtpsv(paramString1, paramString2, paramString3, paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtptrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */