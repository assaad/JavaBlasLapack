package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaed1
{
  public static void dlaed1(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, doubleW paramdoubleW, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int[] paramArrayOfInt2, int paramInt8, intW paramintW)
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
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((Math.min(1, paramInt1 / 2) <= paramInt6 ? 0 : 1) == 0) {}
      if (((paramInt1 / 2 >= paramInt6 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -7;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLAED1", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i5 = 1;
    k = i5 + paramInt1;
    i4 = k + paramInt1;
    i2 = i4 + paramInt1;
    m = 1;
    n = m + paramInt1;
    i = n + paramInt1;
    i1 = i + paramInt1;
    Dcopy.dcopy(paramInt6, paramArrayOfDouble2, paramInt6 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble3, i5 - 1 + paramInt7, 1);
    i8 = paramInt6 + 1;
    Dcopy.dcopy(paramInt1 - paramInt6, paramArrayOfDouble2, i8 - 1 + (i8 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble3, i5 + paramInt6 - 1 + paramInt7, 1);
    Dlaed2.dlaed2(localintW, paramInt1, paramInt6, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, paramdoubleW, paramArrayOfDouble3, i5 - 1 + paramInt7, paramArrayOfDouble3, k - 1 + paramInt7, paramArrayOfDouble3, i4 - 1 + paramInt7, paramArrayOfDouble3, i2 - 1 + paramInt7, paramArrayOfInt2, m - 1 + paramInt8, paramArrayOfInt2, n - 1 + paramInt8, paramArrayOfInt2, i1 - 1 + paramInt8, paramArrayOfInt2, i - 1 + paramInt8, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) == 0) {
      if ((localintW.val == 0 ? 0 : 1) != 0)
      {
        i3 = (paramArrayOfInt2[(i - 1 + paramInt8)] + paramArrayOfInt2[(i + 1 - 1 + paramInt8)]) * paramInt6 + (paramArrayOfInt2[(i + 1 - 1 + paramInt8)] + paramArrayOfInt2[(i + 2 - 1 + paramInt8)]) * (paramInt1 - paramInt6) + i2;
        Dlaed3.dlaed3(localintW.val, paramInt1, paramInt6, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramInt4, paramdoubleW.val, paramArrayOfDouble3, k - 1 + paramInt7, paramArrayOfDouble3, i2 - 1 + paramInt7, paramArrayOfInt2, n - 1 + paramInt8, paramArrayOfInt2, i - 1 + paramInt8, paramArrayOfDouble3, i4 - 1 + paramInt7, paramArrayOfDouble3, i3 - 1 + paramInt7, paramintW);
        if ((paramintW.val == 0 ? 0 : 1) == 0)
        {
          i6 = localintW.val;
          i7 = paramInt1 - localintW.val;
          Dlamrg.dlamrg(i6, i7, paramArrayOfDouble1, paramInt2, 1, -1, paramArrayOfInt1, paramInt5);
        }
      }
      else
      {
        j = 1;
        for (int i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
        {
          paramArrayOfInt1[(j - 1 + paramInt5)] = j;
          j += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaed1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */