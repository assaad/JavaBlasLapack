package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Dgebrd
{
  public static void dgebrd(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, double[] paramArrayOfDouble6, int paramInt9, int paramInt10, intW paramintW)
  {
    int i = 0;
    int j = 0;
    intW localintW = new intW(0);
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    double d = 0.0D;
    paramintW.val = 0;
    i3 = Math.max(1, Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt2, -1, -1));
    i1 = (paramInt1 + paramInt2) * i3;
    paramArrayOfDouble6[(1 - 1 + paramInt9)] = i1;
    i = paramInt10 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((paramInt10 >= Util.max(1, paramInt1, paramInt2) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -10;
      }
    }
    if ((paramintW.val >= 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEBRD", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    i2 = Math.min(paramInt1, paramInt2);
    if ((i2 != 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble6[(1 - 1 + paramInt9)] = 1;
      return;
    }
    d = Math.max(paramInt1, paramInt2);
    m = paramInt1;
    n = paramInt2;
    if ((i3 <= 1 ? 0 : 1) != 0) {}
    if (((i3 >= i2 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i5 = Math.max(i3, Ilaenv.ilaenv(3, "DGEBRD", " ", paramInt1, paramInt2, -1, -1));
      if ((i5 >= i2 ? 0 : 1) != 0)
      {
        d = (paramInt1 + paramInt2) * i3;
        if ((paramInt10 >= d ? 0 : 1) != 0)
        {
          i4 = Ilaenv.ilaenv(2, "DGEBRD", " ", paramInt1, paramInt2, -1, -1);
          if ((paramInt10 < (paramInt1 + paramInt2) * i4 ? 0 : 1) != 0)
          {
            i3 = paramInt10 / (paramInt1 + paramInt2);
          }
          else
          {
            i3 = 1;
            i5 = i2;
          }
        }
      }
    }
    else
    {
      i5 = i2;
    }
    j = 1;
    for (int i6 = (i2 - i5 - 1 + i3) / i3; i6 > 0; i6--)
    {
      Dlabrd.dlabrd(paramInt1 - j + 1, paramInt2 - j + 1, i3, paramArrayOfDouble1, j - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, j - 1 + paramInt5, paramArrayOfDouble3, j - 1 + paramInt6, paramArrayOfDouble4, j - 1 + paramInt7, paramArrayOfDouble5, j - 1 + paramInt8, paramArrayOfDouble6, paramInt9, m, paramArrayOfDouble6, m * i3 + 1 - 1 + paramInt9, n);
      Dgemm.dgemm("No transpose", "Transpose", paramInt1 - j - i3 + 1, paramInt2 - j - i3 + 1, i3, -1.0D, paramArrayOfDouble1, j + i3 - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble6, m * i3 + i3 + 1 - 1 + paramInt9, n, 1.0D, paramArrayOfDouble1, j + i3 - 1 + (j + i3 - 1) * paramInt4 + paramInt3, paramInt4);
      Dgemm.dgemm("No transpose", "No transpose", paramInt1 - j - i3 + 1, paramInt2 - j - i3 + 1, i3, -1.0D, paramArrayOfDouble6, i3 + 1 - 1 + paramInt9, m, paramArrayOfDouble1, j - 1 + (j + i3 - 1) * paramInt4 + paramInt3, paramInt4, 1.0D, paramArrayOfDouble1, j + i3 - 1 + (j + i3 - 1) * paramInt4 + paramInt3, paramInt4);
      int i7;
      if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
      {
        k = j;
        for (i7 = j + i3 - 1 - j + 1; i7 > 0; i7--)
        {
          paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble2[(k - 1 + paramInt5)];
          paramArrayOfDouble1[(k - 1 + (k + 1 - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble3[(k - 1 + paramInt6)];
          k += 1;
        }
      }
      else
      {
        k = j;
        for (i7 = j + i3 - 1 - j + 1; i7 > 0; i7--)
        {
          paramArrayOfDouble1[(k - 1 + (k - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble2[(k - 1 + paramInt5)];
          paramArrayOfDouble1[(k + 1 - 1 + (k - 1) * paramInt4 + paramInt3)] = paramArrayOfDouble3[(k - 1 + paramInt6)];
          k += 1;
        }
      }
      j += i3;
    }
    Dgebd2.dgebd2(paramInt1 - j + 1, paramInt2 - j + 1, paramArrayOfDouble1, j - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, j - 1 + paramInt5, paramArrayOfDouble3, j - 1 + paramInt6, paramArrayOfDouble4, j - 1 + paramInt7, paramArrayOfDouble5, j - 1 + paramInt8, paramArrayOfDouble6, paramInt9, localintW);
    paramArrayOfDouble6[(1 - 1 + paramInt9)] = d;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgebrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */