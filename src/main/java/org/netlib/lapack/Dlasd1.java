package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasd1
{
  public static void dlasd1(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, doubleW paramdoubleW1, doubleW paramdoubleW2, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, int[] paramArrayOfInt2, int paramInt10, double[] paramArrayOfDouble4, int paramInt11, intW paramintW)
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
    intW localintW = new intW(0);
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    double d = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -3;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLASD1", -paramintW.val);
      return;
    }
    i10 = paramInt1 + paramInt2 + 1;
    i9 = i10 + paramInt3;
    i7 = i10;
    i8 = i9;
    i5 = 1;
    i2 = i5 + i9;
    i3 = i2 + i10;
    i4 = i3 + i7 * i10;
    i1 = i4 + i8 * i9;
    k = 1;
    m = k + i10;
    i = m + i10;
    n = i + i10;
    d = Math.max(Math.abs(paramdoubleW1.val), Math.abs(paramdoubleW2.val));
    paramArrayOfDouble1[(paramInt1 + 1 - 1 + paramInt4)] = 0.0D;
    j = 1;
    for (int i13 = i10 - 1 + 1; i13 > 0; i13--)
    {
      if ((Math.abs(paramArrayOfDouble1[(j - 1 + paramInt4)]) <= d ? 0 : 1) != 0) {
        d = Math.abs(paramArrayOfDouble1[(j - 1 + paramInt4)]);
      }
      j += 1;
    }
    Dlascl.dlascl("G", 0, 0, d, 1.0D, i10, 1, paramArrayOfDouble1, paramInt4, i10, paramintW);
    paramdoubleW1.val /= d;
    paramdoubleW2.val /= d;
    Dlasd2.dlasd2(paramInt1, paramInt2, paramInt3, localintW, paramArrayOfDouble1, paramInt4, paramArrayOfDouble4, i5 - 1 + paramInt11, paramdoubleW1.val, paramdoubleW2.val, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, i2 - 1 + paramInt11, paramArrayOfDouble4, i3 - 1 + paramInt11, i7, paramArrayOfDouble4, i4 - 1 + paramInt11, i8, paramArrayOfInt2, n - 1 + paramInt10, paramArrayOfInt2, k - 1 + paramInt10, paramArrayOfInt2, m - 1 + paramInt10, paramArrayOfInt1, paramInt9, paramArrayOfInt2, i - 1 + paramInt10, paramintW);
    i6 = localintW.val;
    Dlasd3.dlasd3(paramInt1, paramInt2, paramInt3, localintW.val, paramArrayOfDouble1, paramInt4, paramArrayOfDouble4, i1 - 1 + paramInt11, i6, paramArrayOfDouble4, i2 - 1 + paramInt11, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble4, i3 - 1 + paramInt11, i7, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, i4 - 1 + paramInt11, i8, paramArrayOfInt2, m - 1 + paramInt10, paramArrayOfInt2, i - 1 + paramInt10, paramArrayOfDouble4, i5 - 1 + paramInt11, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) != 0) {
      return;
    }
    Dlascl.dlascl("G", 0, 0, 1.0D, d, i10, 1, paramArrayOfDouble1, paramInt4, i10, paramintW);
    i11 = localintW.val;
    i12 = i10 - localintW.val;
    Dlamrg.dlamrg(i11, i12, paramArrayOfDouble1, paramInt4, 1, -1, paramArrayOfInt1, paramInt9);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasd1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */