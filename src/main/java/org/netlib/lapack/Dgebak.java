package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dgebak
{
  public static void dgebak(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    int j = 0;
    int k = 0;
    double d = 0.0D;
    bool2 = Lsame.lsame(paramString2, "R");
    bool1 = Lsame.lsame(paramString2, "L");
    paramintW.val = 0;
    if ((((Lsame.lsame(paramString1, "N") ^ true)) && ((Lsame.lsame(paramString1, "P") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString1, "S") ^ true) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString1, "B") ^ true) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool2 ^ true)) && ((bool1 ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt2 >= 1 ? 0 : 1) == 0) {}
      if (((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -4;
      }
      else
      {
        if ((paramInt3 >= Math.min(paramInt2, paramInt1) ? 0 : 1) == 0) {}
        if (((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW.val = -5;
        } else if ((paramInt5 >= 0 ? 0 : 1) != 0) {
          paramintW.val = -7;
        } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -9;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEBAK", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt5 != 0 ? 0 : 1) != 0) {
      return;
    }
    if (Lsame.lsame(paramString1, "N")) {
      return;
    }
    int m;
    if ((paramInt2 != paramInt3 ? 0 : 1) == 0) {
      if (((!Lsame.lsame(paramString1, "S")) && (!Lsame.lsame(paramString1, "B")) ? 0 : 1) != 0)
      {
        if (bool2)
        {
          i = paramInt2;
          for (m = paramInt3 - paramInt2 + 1; m > 0; m--)
          {
            d = paramArrayOfDouble1[(i - 1 + paramInt4)];
            Dscal.dscal(paramInt5, d, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            i += 1;
          }
        }
        if (bool1)
        {
          i = paramInt2;
          for (m = paramInt3 - paramInt2 + 1; m > 0; m--)
          {
            d = 1.0D / paramArrayOfDouble1[(i - 1 + paramInt4)];
            Dscal.dscal(paramInt5, d, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            i += 1;
          }
        }
      }
    }
    if (((!Lsame.lsame(paramString1, "P")) && (!Lsame.lsame(paramString1, "B")) ? 0 : 1) != 0)
    {
      if (bool2)
      {
        j = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          i = j;
          if ((i < paramInt2 ? 0 : 1) != 0) {}
          if (((i > paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0)
          {
            if ((i >= paramInt2 ? 0 : 1) != 0) {
              i = paramInt2 - j;
            }
            k = (int)paramArrayOfDouble1[(i - 1 + paramInt4)];
            if ((k != i ? 0 : 1) == 0) {
              Dswap.dswap(paramInt5, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            }
          }
          j += 1;
        }
      }
      if (bool1)
      {
        j = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          i = j;
          if ((i < paramInt2 ? 0 : 1) != 0) {}
          if (((i > paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0)
          {
            if ((i >= paramInt2 ? 0 : 1) != 0) {
              i = paramInt2 - j;
            }
            k = (int)paramArrayOfDouble1[(i - 1 + paramInt4)];
            if ((k != i ? 0 : 1) == 0) {
              Dswap.dswap(paramInt5, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            }
          }
          j += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgebak.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */