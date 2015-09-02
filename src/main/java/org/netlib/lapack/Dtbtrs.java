package org.netlib.lapack;

import org.netlib.blas.Dtbsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dtbtrs
{
  public static void dtbtrs(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString3, "N");
    bool2 = Lsame.lsame(paramString1, "U");
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
      } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -6;
      } else if ((paramInt5 >= paramInt2 + 1 ? 0 : 1) != 0) {
        paramintW.val = -8;
      } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -10;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTBTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if (bool1) {
      if (bool2)
      {
        paramintW.val = 1;
        for (j = paramInt1 - 1 + 1; j > 0; j--)
        {
          if ((paramArrayOfDouble1[(paramInt2 + 1 - 1 + (paramintW.val - 1) * paramInt5 + paramInt4)] != 0.0D ? 0 : 1) != 0) {
            return;
          }
          paramintW.val += 1;
        }
      }
      else
      {
        paramintW.val = 1;
        for (j = paramInt1 - 1 + 1; j > 0; j--)
        {
          if ((paramArrayOfDouble1[(1 - 1 + (paramintW.val - 1) * paramInt5 + paramInt4)] != 0.0D ? 0 : 1) != 0) {
            return;
          }
          paramintW.val += 1;
        }
      }
    }
    paramintW.val = 0;
    i = 1;
    for (int j = paramInt3 - 1 + 1; j > 0; j--)
    {
      Dtbsv.dtbsv(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtbtrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */