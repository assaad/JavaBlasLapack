package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Drot;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dlaeda
{
  public static void dlaeda(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2, int paramInt6, int[] paramArrayOfInt3, int paramInt7, int[] paramArrayOfInt4, int paramInt8, double[] paramArrayOfDouble1, int paramInt9, double[] paramArrayOfDouble2, int paramInt10, int[] paramArrayOfInt5, int paramInt11, double[] paramArrayOfDouble3, int paramInt12, double[] paramArrayOfDouble4, int paramInt13, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLAEDA", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i1 = paramInt1 / 2 + 1;
    i4 = 1;
    k = i4 + paramInt4 * (int)Math.pow(2, paramInt3) + (int)Math.pow(2, paramInt3 - 1) - 1;
    i = (int)(0.5D + Math.sqrt(paramArrayOfInt5[(k + 1 - 1 + paramInt11)] - paramArrayOfInt5[(k - 1 + paramInt11)]));
    j = (int)(0.5D + Math.sqrt(paramArrayOfInt5[(k + 2 - 1 + paramInt11)] - paramArrayOfInt5[(k + 1 - 1 + paramInt11)]));
    n = 1;
    for (int i6 = i1 - i - 1 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfDouble3[(n - 1 + paramInt12)] = 0.0D;
      n += 1;
    }
    Dcopy.dcopy(i, paramArrayOfDouble2, paramArrayOfInt5[(k - 1 + paramInt11)] + i - 1 - 1 + paramInt10, i, paramArrayOfDouble3, i1 - i - 1 + paramInt12, 1);
    Dcopy.dcopy(j, paramArrayOfDouble2, paramArrayOfInt5[(k + 1 - 1 + paramInt11)] - 1 + paramInt10, j, paramArrayOfDouble3, i1 - 1 + paramInt12, 1);
    n = i1 + j;
    for (i6 = paramInt1 - (i1 + j) + 1; i6 > 0; i6--)
    {
      paramArrayOfDouble3[(n - 1 + paramInt12)] = 0.0D;
      n += 1;
    }
    i4 = (int)Math.pow(2, paramInt2) + 1;
    n = 1;
    for (i6 = paramInt3 - 1 - 1 + 1; i6 > 0; i6--)
    {
      k = i4 + paramInt4 * (int)Math.pow(2, paramInt3 - n) + (int)Math.pow(2, paramInt3 - n - 1) - 1;
      i2 = paramArrayOfInt1[(k + 1 - 1 + paramInt5)] - paramArrayOfInt1[(k - 1 + paramInt5)];
      i3 = paramArrayOfInt1[(k + 2 - 1 + paramInt5)] - paramArrayOfInt1[(k + 1 - 1 + paramInt5)];
      i5 = i1 - i2;
      m = paramArrayOfInt3[(k - 1 + paramInt7)];
      for (int i7 = paramArrayOfInt3[(k + 1 - 1 + paramInt7)] - 1 - paramArrayOfInt3[(k - 1 + paramInt7)] + 1; i7 > 0; i7--)
      {
        Drot.drot(1, paramArrayOfDouble3, i5 + paramArrayOfInt4[(1 - 1 + (m - 1) * 2 + paramInt8)] - 1 - 1 + paramInt12, 1, paramArrayOfDouble3, i5 + paramArrayOfInt4[(2 - 1 + (m - 1) * 2 + paramInt8)] - 1 - 1 + paramInt12, 1, paramArrayOfDouble1[(1 - 1 + (m - 1) * 2 + paramInt9)], paramArrayOfDouble1[(2 - 1 + (m - 1) * 2 + paramInt9)]);
        m += 1;
      }
      m = paramArrayOfInt3[(k + 1 - 1 + paramInt7)];
      for (i7 = paramArrayOfInt3[(k + 2 - 1 + paramInt7)] - 1 - paramArrayOfInt3[(k + 1 - 1 + paramInt7)] + 1; i7 > 0; i7--)
      {
        Drot.drot(1, paramArrayOfDouble3, i1 - 1 + paramArrayOfInt4[(1 - 1 + (m - 1) * 2 + paramInt8)] - 1 + paramInt12, 1, paramArrayOfDouble3, i1 - 1 + paramArrayOfInt4[(2 - 1 + (m - 1) * 2 + paramInt8)] - 1 + paramInt12, 1, paramArrayOfDouble1[(1 - 1 + (m - 1) * 2 + paramInt9)], paramArrayOfDouble1[(2 - 1 + (m - 1) * 2 + paramInt9)]);
        m += 1;
      }
      i2 = paramArrayOfInt1[(k + 1 - 1 + paramInt5)] - paramArrayOfInt1[(k - 1 + paramInt5)];
      i3 = paramArrayOfInt1[(k + 2 - 1 + paramInt5)] - paramArrayOfInt1[(k + 1 - 1 + paramInt5)];
      m = 0;
      for (i7 = i2 - 1 - 0 + 1; i7 > 0; i7--)
      {
        paramArrayOfDouble4[(m + 1 - 1 + paramInt13)] = paramArrayOfDouble3[(i5 + paramArrayOfInt2[(paramArrayOfInt1[(k - 1 + paramInt5)] + m - 1 + paramInt6)] - 1 - 1 + paramInt12)];
        m += 1;
      }
      m = 0;
      for (i7 = i3 - 1 - 0 + 1; i7 > 0; i7--)
      {
        paramArrayOfDouble4[(i2 + m + 1 - 1 + paramInt13)] = paramArrayOfDouble3[(i1 + paramArrayOfInt2[(paramArrayOfInt1[(k + 1 - 1 + paramInt5)] + m - 1 + paramInt6)] - 1 - 1 + paramInt12)];
        m += 1;
      }
      i = (int)(0.5D + Math.sqrt(paramArrayOfInt5[(k + 1 - 1 + paramInt11)] - paramArrayOfInt5[(k - 1 + paramInt11)]));
      j = (int)(0.5D + Math.sqrt(paramArrayOfInt5[(k + 2 - 1 + paramInt11)] - paramArrayOfInt5[(k + 1 - 1 + paramInt11)]));
      if ((i <= 0 ? 0 : 1) != 0) {
        Dgemv.dgemv("T", i, i, 1.0D, paramArrayOfDouble2, paramArrayOfInt5[(k - 1 + paramInt11)] - 1 + paramInt10, i, paramArrayOfDouble4, 1 - 1 + paramInt13, 1, 0.0D, paramArrayOfDouble3, i5 - 1 + paramInt12, 1);
      }
      Dcopy.dcopy(i2 - i, paramArrayOfDouble4, i + 1 - 1 + paramInt13, 1, paramArrayOfDouble3, i5 + i - 1 + paramInt12, 1);
      if ((j <= 0 ? 0 : 1) != 0) {
        Dgemv.dgemv("T", j, j, 1.0D, paramArrayOfDouble2, paramArrayOfInt5[(k + 1 - 1 + paramInt11)] - 1 + paramInt10, j, paramArrayOfDouble4, i2 + 1 - 1 + paramInt13, 1, 0.0D, paramArrayOfDouble3, i1 - 1 + paramInt12, 1);
      }
      Dcopy.dcopy(i3 - j, paramArrayOfDouble4, i2 + j + 1 - 1 + paramInt13, 1, paramArrayOfDouble3, i1 + j - 1 + paramInt12, 1);
      i4 += (int)Math.pow(2, paramInt2 - n);
      n += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaeda.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */