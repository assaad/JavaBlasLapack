package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dopgtr
{
  public static void dopgtr(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    intW localintW = new intW(0);
    int j = 0;
    int k = 0;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DOPGTR", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int m;
    int n;
    if (bool)
    {
      j = 2;
      k = 1;
      for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
      {
        i = 1;
        for (n = k - 1 - 1 + 1; n > 0; n--)
        {
          paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt5 + paramInt4)] = paramArrayOfDouble1[(j - 1 + paramInt2)];
          j += 1;
          i += 1;
        }
        j += 2;
        paramArrayOfDouble3[(paramInt1 - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0D;
        k += 1;
      }
      i = 1;
      for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfDouble3[(i - 1 + (paramInt1 - 1) * paramInt5 + paramInt4)] = 0.0D;
        i += 1;
      }
      paramArrayOfDouble3[(paramInt1 - 1 + (paramInt1 - 1) * paramInt5 + paramInt4)] = 1.0D;
      Dorg2l.dorg2l(paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble2, paramInt3, paramArrayOfDouble4, paramInt6, localintW);
    }
    else
    {
      paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0D;
      i = 2;
      for (m = paramInt1 - 2 + 1; m > 0; m--)
      {
        paramArrayOfDouble3[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] = 0.0D;
        i += 1;
      }
      j = 3;
      k = 2;
      for (m = paramInt1 - 2 + 1; m > 0; m--)
      {
        paramArrayOfDouble3[(1 - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0D;
        i = k + 1;
        for (n = paramInt1 - (k + 1) + 1; n > 0; n--)
        {
          paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt5 + paramInt4)] = paramArrayOfDouble1[(j - 1 + paramInt2)];
          j += 1;
          i += 1;
        }
        j += 2;
        k += 1;
      }
      if ((paramInt1 <= 1 ? 0 : 1) != 0) {
        Dorg2r.dorg2r(paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, paramArrayOfDouble3, 2 - 1 + (2 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, paramInt3, paramArrayOfDouble4, paramInt6, localintW);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dopgtr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */