package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Dtrmm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dgehrd
{
  public static void dgehrd(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    intW localintW = new intW(0);
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    double d = 0.0D;
    double[] arrayOfDouble = new double[65 * 64];
    paramintW.val = 0;
    i3 = Math.min(64, Ilaenv.ilaenv(1, "DGEHRD", " ", paramInt1, paramInt2, paramInt3, -1));
    i2 = paramInt1 * i3;
    paramArrayOfDouble3[(1 - 1 + paramInt7)] = i2;
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
          if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {}
          if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
            paramintW.val = -8;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEHRD", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    j = 1;
    for (int i7 = paramInt2 - 1 - 1 + 1; i7 > 0; i7--)
    {
      paramArrayOfDouble2[(j - 1 + paramInt6)] = 0.0D;
      j += 1;
    }
    j = Math.max(1, paramInt3);
    for (i7 = paramInt1 - 1 - Math.max(1, paramInt3) + 1; i7 > 0; i7--)
    {
      paramArrayOfDouble2[(j - 1 + paramInt6)] = 0.0D;
      j += 1;
    }
    i5 = paramInt3 - paramInt2 + 1;
    if ((i5 > 1 ? 0 : 1) != 0)
    {
      paramArrayOfDouble3[(1 - 1 + paramInt7)] = 1;
      return;
    }
    i3 = Math.min(64, Ilaenv.ilaenv(1, "DGEHRD", " ", paramInt1, paramInt2, paramInt3, -1));
    i4 = 2;
    m = 1;
    if ((i3 <= 1 ? 0 : 1) != 0) {}
    if (((i3 >= i5 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i6 = Math.max(i3, Ilaenv.ilaenv(3, "DGEHRD", " ", paramInt1, paramInt2, paramInt3, -1));
      if ((i6 >= i5 ? 0 : 1) != 0)
      {
        m = paramInt1 * i3;
        if ((paramInt8 >= m ? 0 : 1) != 0)
        {
          i4 = Math.max(2, Ilaenv.ilaenv(2, "DGEHRD", " ", paramInt1, paramInt2, paramInt3, -1));
          if ((paramInt8 < paramInt1 * i4 ? 0 : 1) != 0) {
            i3 = paramInt8 / paramInt1;
          } else {
            i3 = 1;
          }
        }
      }
    }
    i1 = paramInt1;
    if ((i3 >= i4 ? 0 : 1) == 0) {}
    if (((i3 < i5 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      j = paramInt2;
    }
    else
    {
      j = paramInt2;
      for (i7 = (paramInt3 - 1 - i6 - paramInt2 + i3) / i3; i7 > 0; i7--)
      {
        k = Math.min(i3, paramInt3 - j);
        Dlahr2.dlahr2(paramInt3, j, k, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, j - 1 + paramInt6, arrayOfDouble, 0, 65, paramArrayOfDouble3, paramInt7, i1);
        d = paramArrayOfDouble1[(j + k - 1 + (j + k - 1 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble1[(j + k - 1 + (j + k - 1 - 1) * paramInt5 + paramInt4)] = 1.0D;
        Dgemm.dgemm("No transpose", "Transpose", paramInt3, paramInt3 - j - k + 1, k, -1.0D, paramArrayOfDouble3, paramInt7, i1, paramArrayOfDouble1, j + k - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, 1.0D, paramArrayOfDouble1, 1 - 1 + (j + k - 1) * paramInt5 + paramInt4, paramInt5);
        paramArrayOfDouble1[(j + k - 1 + (j + k - 1 - 1) * paramInt5 + paramInt4)] = d;
        Dtrmm.dtrmm("Right", "Lower", "Transpose", "Unit", j, k - 1, 1.0D, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt7, i1);
        n = 0;
        for (int i8 = k - 2 - 0 + 1; i8 > 0; i8--)
        {
          Daxpy.daxpy(j, -1.0D, paramArrayOfDouble3, i1 * n + 1 - 1 + paramInt7, 1, paramArrayOfDouble1, 1 - 1 + (j + n + 1 - 1) * paramInt5 + paramInt4, 1);
          n += 1;
        }
        Dlarfb.dlarfb("Left", "Transpose", "Forward", "Columnwise", paramInt3 - j, paramInt1 - j - k + 1, k, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble, 0, 65, paramArrayOfDouble1, j + 1 - 1 + (j + k - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt7, i1);
        j += i3;
      }
    }
    Dgehd2.dgehd2(paramInt1, j, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, localintW);
    paramArrayOfDouble3[(1 - 1 + paramInt7)] = m;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgehrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */