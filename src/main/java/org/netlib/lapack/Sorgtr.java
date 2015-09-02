package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sorgtr
{
  public static void sorgtr(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, int paramInt6, intW paramintW)
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
        n = Ilaenv.ilaenv(1, "SORGQL", " ", paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, -1);
      } else {
        n = Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, -1);
      }
      m = Math.max(1, paramInt1 - 1) * n;
      paramArrayOfFloat3[(1 - 1 + paramInt5)] = m;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SORGTR", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramArrayOfFloat3[(1 - 1 + paramInt5)] = 1;
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
          paramArrayOfFloat1[(j - 1 + (k - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat1[(j - 1 + (k + 1 - 1) * paramInt3 + paramInt2)];
          j += 1;
        }
        paramArrayOfFloat1[(paramInt1 - 1 + (k - 1) * paramInt3 + paramInt2)] = 0.0F;
        k += 1;
      }
      j = 1;
      for (i1 = paramInt1 - 1 - 1 + 1; i1 > 0; i1--)
      {
        paramArrayOfFloat1[(j - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)] = 0.0F;
        j += 1;
      }
      paramArrayOfFloat1[(paramInt1 - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)] = 1.0F;
      Sorgql.sorgql(paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramInt6, localintW);
    }
    else
    {
      k = paramInt1;
      for (i1 = (2 - paramInt1 + -1) / -1; i1 > 0; i1--)
      {
        paramArrayOfFloat1[(1 - 1 + (k - 1) * paramInt3 + paramInt2)] = 0.0F;
        j = k + 1;
        for (i2 = paramInt1 - (k + 1) + 1; i2 > 0; i2--)
        {
          paramArrayOfFloat1[(j - 1 + (k - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat1[(j - 1 + (k - 1 - 1) * paramInt3 + paramInt2)];
          j += 1;
        }
        k += -1;
      }
      paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] = 1.0F;
      j = 2;
      for (i1 = paramInt1 - 2 + 1; i1 > 0; i1--)
      {
        paramArrayOfFloat1[(j - 1 + (1 - 1) * paramInt3 + paramInt2)] = 0.0F;
        j += 1;
      }
      if ((paramInt1 <= 1 ? 0 : 1) != 0) {
        Sorgqr.sorgqr(paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, paramArrayOfFloat1, 2 - 1 + (2 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramInt6, localintW);
      }
    }
    paramArrayOfFloat3[(1 - 1 + paramInt5)] = m;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sorgtr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */