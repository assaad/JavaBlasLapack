package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sopgtr
{
  public static void sopgtr(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, intW paramintW)
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
      Xerbla.xerbla("SOPGTR", -paramintW.val);
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
          paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt5 + paramInt4)] = paramArrayOfFloat1[(j - 1 + paramInt2)];
          j += 1;
          i += 1;
        }
        j += 2;
        paramArrayOfFloat3[(paramInt1 - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0F;
        k += 1;
      }
      i = 1;
      for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfFloat3[(i - 1 + (paramInt1 - 1) * paramInt5 + paramInt4)] = 0.0F;
        i += 1;
      }
      paramArrayOfFloat3[(paramInt1 - 1 + (paramInt1 - 1) * paramInt5 + paramInt4)] = 1.0F;
      Sorg2l.sorg2l(paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, paramArrayOfFloat3, paramInt4, paramInt5, paramArrayOfFloat2, paramInt3, paramArrayOfFloat4, paramInt6, localintW);
    }
    else
    {
      paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0F;
      i = 2;
      for (m = paramInt1 - 2 + 1; m > 0; m--)
      {
        paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] = 0.0F;
        i += 1;
      }
      j = 3;
      k = 2;
      for (m = paramInt1 - 2 + 1; m > 0; m--)
      {
        paramArrayOfFloat3[(1 - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0F;
        i = k + 1;
        for (n = paramInt1 - (k + 1) + 1; n > 0; n--)
        {
          paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt5 + paramInt4)] = paramArrayOfFloat1[(j - 1 + paramInt2)];
          j += 1;
          i += 1;
        }
        j += 2;
        k += 1;
      }
      if ((paramInt1 <= 1 ? 0 : 1) != 0) {
        Sorg2r.sorg2r(paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, paramArrayOfFloat3, 2 - 1 + (2 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, paramInt3, paramArrayOfFloat4, paramInt6, localintW);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sopgtr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */