package org.netlib.lapack;

import org.netlib.blas.Dscal;
import org.netlib.blas.Dtpmv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dtptri
{
  public static void dtptri(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble, int paramInt2, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double d = 0.0D;
    paramintW.val = 0;
    bool2 = Lsame.lsame(paramString1, "U");
    bool1 = Lsame.lsame(paramString2, "N");
    if ((((bool2 ^ true)) && ((Lsame.lsame(paramString1, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((((bool1 ^ true)) && ((Lsame.lsame(paramString2, "U") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTPTRI", -paramintW.val);
      return;
    }
    int n;
    if (bool1)
    {
      if (bool2)
      {
        m = 0;
        paramintW.val = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          m += paramintW.val;
          if ((paramArrayOfDouble[(m - 1 + paramInt2)] != 0.0D ? 0 : 1) != 0) {
            return;
          }
          paramintW.val += 1;
        }
      }
      else
      {
        m = 1;
        paramintW.val = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          if ((paramArrayOfDouble[(m - 1 + paramInt2)] != 0.0D ? 0 : 1) != 0) {
            return;
          }
          m = m + paramInt1 - paramintW.val + 1;
          paramintW.val += 1;
        }
      }
      paramintW.val = 0;
    }
    if (bool2)
    {
      j = 1;
      i = 1;
      for (n = paramInt1 - 1 + 1; n > 0; n--)
      {
        if (bool1)
        {
          paramArrayOfDouble[(j + i - 1 - 1 + paramInt2)] = (1.0D / paramArrayOfDouble[(j + i - 1 - 1 + paramInt2)]);
          d = -paramArrayOfDouble[(j + i - 1 - 1 + paramInt2)];
        }
        else
        {
          d = -1.0D;
        }
        Dtpmv.dtpmv("Upper", "No transpose", paramString2, i - 1, paramArrayOfDouble, paramInt2, paramArrayOfDouble, j - 1 + paramInt2, 1);
        Dscal.dscal(i - 1, d, paramArrayOfDouble, j - 1 + paramInt2, 1);
        j += i;
        i += 1;
      }
    }
    else
    {
      j = paramInt1 * (paramInt1 + 1) / 2;
      i = paramInt1;
      for (n = (1 - paramInt1 + -1) / -1; n > 0; n--)
      {
        if (bool1)
        {
          paramArrayOfDouble[(j - 1 + paramInt2)] = (1.0D / paramArrayOfDouble[(j - 1 + paramInt2)]);
          d = -paramArrayOfDouble[(j - 1 + paramInt2)];
        }
        else
        {
          d = -1.0D;
        }
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          Dtpmv.dtpmv("Lower", "No transpose", paramString2, paramInt1 - i, paramArrayOfDouble, k - 1 + paramInt2, paramArrayOfDouble, j + 1 - 1 + paramInt2, 1);
          Dscal.dscal(paramInt1 - i, d, paramArrayOfDouble, j + 1 - 1 + paramInt2, 1);
        }
        k = j;
        j = j - paramInt1 + i - 2;
        i += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtptri.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */