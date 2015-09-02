package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dorgtr
{
  public static void dorgtr(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, int paramInt6, intW paramintW)
  {
    int i = 0;
    boolean bool = false;
    int j = 0;
    intW localintW = new intW(0);
    int k = 0;
    int m = 0;
    int n = 0;
    paramintW.val = 0;
    i = paramInt6 != -1 ? 0 : 1;
    bool = Lsame.lsame(paramString, "U");
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
      if ((paramInt6 >= Math.max(1, paramInt1 - 1) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -7;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if (bool) {
        n = Ilaenv.ilaenv(1, "DORGQL", " ", paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, -1);
      } else {
        n = Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, -1);
      }
      m = Math.max(1, paramInt1 - 1) * n;
      paramArrayOfDouble3[(1 - 1 + paramInt5)] = m;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DORGTR", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble3[(1 - 1 + paramInt5)] = 1;
      return;
    }
    int i1;
    int i2;
    if (bool)
    {
      k = 1;
      for (i1 = paramInt1 - 1 - 1 + 1; i1 > 0; i1--)
      {
        j = 1;
        for (i2 = k - 1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble1[(j - 1 + (k - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble1[(j - 1 + (k + 1 - 1) * paramInt3 + paramInt2)];
          j += 1;
        }
        paramArrayOfDouble1[(paramInt1 - 1 + (k - 1) * paramInt3 + paramInt2)] = 0.0D;
        k += 1;
      }
      j = 1;
      for (i1 = paramInt1 - 1 - 1 + 1; i1 > 0; i1--)
      {
        paramArrayOfDouble1[(j - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)] = 0.0D;
        j += 1;
      }
      paramArrayOfDouble1[(paramInt1 - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)] = 1.0D;
      Dorgql.dorgql(paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramInt6, localintW);
    }
    else
    {
      k = paramInt1;
      for (i1 = (2 - paramInt1 + -1) / -1; i1 > 0; i1--)
      {
        paramArrayOfDouble1[(1 - 1 + (k - 1) * paramInt3 + paramInt2)] = 0.0D;
        j = k + 1;
        for (i2 = paramInt1 - (k + 1) + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble1[(j - 1 + (k - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble1[(j - 1 + (k - 1 - 1) * paramInt3 + paramInt2)];
          j += 1;
        }
        k += -1;
      }
      paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] = 1.0D;
      j = 2;
      for (i1 = paramInt1 - 2 + 1; i1 > 0; i1--)
      {
        paramArrayOfDouble1[(j - 1 + (1 - 1) * paramInt3 + paramInt2)] = 0.0D;
        j += 1;
      }
      if ((paramInt1 <= 1 ? 0 : 1) != 0) {
        Dorgqr.dorgqr(paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, paramArrayOfDouble1, 2 - 1 + (2 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramInt6, localintW);
      }
    }
    paramArrayOfDouble3[(1 - 1 + paramInt5)] = m;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dorgtr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */