package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dorghr
{
  public static void dorghr(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, intW paramintW)
  {
    int i = 0;
    int j = 0;
    intW localintW = new intW(0);
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    paramintW.val = 0;
    i1 = paramInt3 - paramInt2;
    i = paramInt8 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt2 >= 1 ? 0 : 1) == 0) {}
      if (((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
      }
      else
      {
        if ((paramInt3 >= Math.min(paramInt2, paramInt1) ? 0 : 1) == 0) {}
        if (((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -3;
        }
        else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
        {
          paramintW.val = -5;
        }
        else
        {
          if ((paramInt8 >= Math.max(1, i1) ? 0 : 1) != 0) {}
          if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
            paramintW.val = -8;
          }
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      n = Ilaenv.ilaenv(1, "DORGQR", " ", i1, i1, i1, -1);
      m = Math.max(1, i1) * n;
      paramArrayOfDouble3[(1 - 1 + paramInt7)] = m;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DORGHR", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble3[(1 - 1 + paramInt7)] = 1;
      return;
    }
    k = paramInt3;
    int i3;
    for (int i2 = (paramInt2 + 1 - paramInt3 + -1) / -1; i2 > 0; i2--)
    {
      j = 1;
      for (i3 = k - 1 - 1 + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble1[(j - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0D;
        j += 1;
      }
      j = k + 1;
      for (i3 = paramInt3 - (k + 1) + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble1[(j - 1 + (k - 1) * paramInt5 + paramInt4)] = paramArrayOfDouble1[(j - 1 + (k - 1 - 1) * paramInt5 + paramInt4)];
        j += 1;
      }
      j = paramInt3 + 1;
      for (i3 = paramInt1 - (paramInt3 + 1) + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble1[(j - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0D;
        j += 1;
      }
      k += -1;
    }
    k = 1;
    for (i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
    {
      j = 1;
      for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble1[(j - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0D;
        j += 1;
      }
      paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt5 + paramInt4)] = 1.0D;
      k += 1;
    }
    k = paramInt3 + 1;
    for (i2 = paramInt1 - (paramInt3 + 1) + 1; i2 > 0; i2--)
    {
      j = 1;
      for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble1[(j - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0D;
        j += 1;
      }
      paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt5 + paramInt4)] = 1.0D;
      k += 1;
    }
    if ((i1 <= 0 ? 0 : 1) != 0) {
      Dorgqr.dorgqr(i1, i1, i1, paramArrayOfDouble1, paramInt2 + 1 - 1 + (paramInt2 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, paramInt2 - 1 + paramInt6, paramArrayOfDouble3, paramInt7, paramInt8, localintW);
    }
    paramArrayOfDouble3[(1 - 1 + paramInt7)] = m;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dorghr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */