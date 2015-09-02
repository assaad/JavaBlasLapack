package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsytrf
{
  public static void dsytrf(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, intW paramintW)
  {
    int i = 0;
    boolean bool = false;
    intW localintW1 = new intW(0);
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW2 = new intW(0);
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    i = paramInt6 != -1 ? 0 : 1;
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((paramInt6 >= 1 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -7;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i2 = Ilaenv.ilaenv(1, "DSYTRF", paramString, paramInt1, -1, -1, -1);
      i1 = paramInt1 * i2;
      paramArrayOfDouble2[(1 - 1 + paramInt5)] = i1;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYTRF", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    i3 = 2;
    n = paramInt1;
    if ((i2 <= 1 ? 0 : 1) != 0) {}
    if (((i2 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      j = n * i2;
      if ((paramInt6 >= j ? 0 : 1) != 0)
      {
        i2 = Math.max(paramInt6 / n, 1);
        i3 = Math.max(2, Ilaenv.ilaenv(2, "DSYTRF", paramString, paramInt1, -1, -1, -1));
      }
    }
    else
    {
      j = 1;
    }
    if ((i2 >= i3 ? 0 : 1) != 0) {
      i2 = paramInt1;
    }
    if (bool)
    {
      m = paramInt1;
      while ((m >= 1 ? 0 : 1) == 0)
      {
        if ((m <= i2 ? 0 : 1) != 0)
        {
          Dlasyf.dlasyf(paramString, m, i2, localintW2, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfInt, paramInt4, paramArrayOfDouble2, paramInt5, n, localintW1);
        }
        else
        {
          Dsytf2.dsytf2(paramString, m, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfInt, paramInt4, localintW1);
          localintW2.val = m;
        }
        if ((paramintW.val != 0 ? 0 : 1) != 0) {}
        if (((localintW1.val <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW.val = localintW1.val;
        }
        m -= localintW2.val;
      }
    }
    m = 1;
    while ((m <= paramInt1 ? 0 : 1) == 0)
    {
      if ((m > paramInt1 - i2 ? 0 : 1) != 0)
      {
        Dlasyf.dlasyf(paramString, paramInt1 - m + 1, i2, localintW2, paramArrayOfDouble1, m - 1 + (m - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfInt, m - 1 + paramInt4, paramArrayOfDouble2, paramInt5, n, localintW1);
      }
      else
      {
        Dsytf2.dsytf2(paramString, paramInt1 - m + 1, paramArrayOfDouble1, m - 1 + (m - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfInt, m - 1 + paramInt4, localintW1);
        localintW2.val = (paramInt1 - m + 1);
      }
      if ((paramintW.val != 0 ? 0 : 1) != 0) {}
      if (((localintW1.val <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramintW.val = (localintW1.val + m - 1);
      }
      k = m;
      for (int i4 = m + localintW2.val - 1 - m + 1; i4 > 0; i4--)
      {
        if ((paramArrayOfInt[(k - 1 + paramInt4)] <= 0 ? 0 : 1) != 0) {
          paramArrayOfInt[(k - 1 + paramInt4)] = (paramArrayOfInt[(k - 1 + paramInt4)] + m - 1);
        } else {
          paramArrayOfInt[(k - 1 + paramInt4)] = (paramArrayOfInt[(k - 1 + paramInt4)] - m + 1);
        }
        k += 1;
      }
      m += localintW2.val;
    }
    paramArrayOfDouble2[(1 - 1 + paramInt5)] = i1;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsytrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */