package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasd6
{
  public static void dlasd6(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, doubleW paramdoubleW1, doubleW paramdoubleW2, int[] paramArrayOfInt1, int paramInt8, int[] paramArrayOfInt2, int paramInt9, intW paramintW1, int[] paramArrayOfInt3, int paramInt10, int paramInt11, double[] paramArrayOfDouble4, int paramInt12, int paramInt13, double[] paramArrayOfDouble5, int paramInt14, double[] paramArrayOfDouble6, int paramInt15, double[] paramArrayOfDouble7, int paramInt16, double[] paramArrayOfDouble8, int paramInt17, intW paramintW2, doubleW paramdoubleW3, doubleW paramdoubleW4, double[] paramArrayOfDouble9, int paramInt18, int[] paramArrayOfInt4, int paramInt19, intW paramintW3)
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
    int i6 = 0;
    int i7 = 0;
    double d = 0.0D;
    paramintW3.val = 0;
    i5 = paramInt2 + paramInt3 + 1;
    i4 = i5 + paramInt4;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((paramInt3 >= 1 ? 0 : 1) != 0)
    {
      paramintW3.val = -3;
    }
    else
    {
      if ((paramInt4 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt4 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW3.val = -4;
      } else if ((paramInt11 >= i5 ? 0 : 1) != 0) {
        paramintW3.val = -14;
      } else if ((paramInt13 >= i5 ? 0 : 1) != 0) {
        paramintW3.val = -16;
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLASD6", -paramintW3.val);
      return;
    }
    n = 1;
    i3 = n + i5;
    i1 = i3 + i4;
    i2 = i1 + i4;
    j = 1;
    k = j + i5;
    m = k + i5;
    d = Math.max(Math.abs(paramdoubleW1.val), Math.abs(paramdoubleW2.val));
    paramArrayOfDouble1[(paramInt2 + 1 - 1 + paramInt5)] = 0.0D;
    i = 1;
    for (int i8 = i5 - 1 + 1; i8 > 0; i8--)
    {
      if ((Math.abs(paramArrayOfDouble1[(i - 1 + paramInt5)]) <= d ? 0 : 1) != 0) {
        d = Math.abs(paramArrayOfDouble1[(i - 1 + paramInt5)]);
      }
      i += 1;
    }
    Dlascl.dlascl("G", 0, 0, d, 1.0D, i5, 1, paramArrayOfDouble1, paramInt5, i5, paramintW3);
    paramdoubleW1.val /= d;
    paramdoubleW2.val /= d;
    Dlasd7.dlasd7(paramInt1, paramInt2, paramInt3, paramInt4, paramintW2, paramArrayOfDouble1, paramInt5, paramArrayOfDouble8, paramInt17, paramArrayOfDouble9, i3 - 1 + paramInt18, paramArrayOfDouble2, paramInt6, paramArrayOfDouble9, i1 - 1 + paramInt18, paramArrayOfDouble3, paramInt7, paramArrayOfDouble9, i2 - 1 + paramInt18, paramdoubleW1.val, paramdoubleW2.val, paramArrayOfDouble9, n - 1 + paramInt18, paramArrayOfInt4, j - 1 + paramInt19, paramArrayOfInt4, m - 1 + paramInt19, paramArrayOfInt1, paramInt8, paramArrayOfInt2, paramInt9, paramintW1, paramArrayOfInt3, paramInt10, paramInt11, paramArrayOfDouble4, paramInt12, paramInt13, paramdoubleW3, paramdoubleW4, paramintW3);
    Dlasd8.dlasd8(paramInt1, paramintW2.val, paramArrayOfDouble1, paramInt5, paramArrayOfDouble8, paramInt17, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramArrayOfDouble6, paramInt15, paramArrayOfDouble7, paramInt16, paramInt13, paramArrayOfDouble9, n - 1 + paramInt18, paramArrayOfDouble9, i3 - 1 + paramInt18, paramintW3);
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      Dcopy.dcopy(paramintW2.val, paramArrayOfDouble1, paramInt5, 1, paramArrayOfDouble5, 1 - 1 + (1 - 1) * paramInt13 + paramInt14, 1);
      Dcopy.dcopy(paramintW2.val, paramArrayOfDouble9, n - 1 + paramInt18, 1, paramArrayOfDouble5, 1 - 1 + (2 - 1) * paramInt13 + paramInt14, 1);
    }
    Dlascl.dlascl("G", 0, 0, 1.0D, d, i5, 1, paramArrayOfDouble1, paramInt5, i5, paramintW3);
    i6 = paramintW2.val;
    i7 = i5 - paramintW2.val;
    Dlamrg.dlamrg(i6, i7, paramArrayOfDouble1, paramInt5, 1, -1, paramArrayOfInt1, paramInt8);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasd6.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */