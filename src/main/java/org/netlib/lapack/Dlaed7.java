package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaed7
{
  public static void dlaed7(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double[] paramArrayOfDouble1, int paramInt7, double[] paramArrayOfDouble2, int paramInt8, int paramInt9, int[] paramArrayOfInt1, int paramInt10, doubleW paramdoubleW, int paramInt11, double[] paramArrayOfDouble3, int paramInt12, int[] paramArrayOfInt2, int paramInt13, int[] paramArrayOfInt3, int paramInt14, int[] paramArrayOfInt4, int paramInt15, int[] paramArrayOfInt5, int paramInt16, int[] paramArrayOfInt6, int paramInt17, double[] paramArrayOfDouble4, int paramInt18, double[] paramArrayOfDouble5, int paramInt19, int[] paramArrayOfInt7, int paramInt20, intW paramintW)
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
    intW localintW = new intW(0);
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt1 != 1 ? 0 : 1) != 0) {}
      if (((paramInt3 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -4;
      }
      else if ((paramInt9 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else
      {
        if ((Math.min(1, paramInt2) <= paramInt11 ? 0 : 1) == 0) {}
        if (((paramInt2 >= paramInt11 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW.val = -12;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLAED7", -paramintW.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0) {
      i7 = paramInt3;
    } else {
      i7 = paramInt2;
    }
    i6 = 1;
    m = i6 + paramInt2;
    i5 = m + paramInt2;
    i3 = i5 + paramInt2;
    i4 = i3 + paramInt2 * i7;
    n = 1;
    i1 = n + paramInt2;
    i = i1 + paramInt2;
    i2 = i + paramInt2;
    i10 = 1 + (int)Math.pow(2, paramInt4);
    k = 1;
    for (int i11 = paramInt5 - 1 - 1 + 1; i11 > 0; i11--)
    {
      i10 += (int)Math.pow(2, paramInt4 - k);
      k += 1;
    }
    j = i10 + paramInt6;
    Dlaeda.dlaeda(paramInt2, paramInt4, paramInt5, paramInt6, paramArrayOfInt3, paramInt14, paramArrayOfInt4, paramInt15, paramArrayOfInt5, paramInt16, paramArrayOfInt6, paramInt17, paramArrayOfDouble4, paramInt18, paramArrayOfDouble3, paramInt12, paramArrayOfInt2, paramInt13, paramArrayOfDouble5, i6 - 1 + paramInt19, paramArrayOfDouble5, i6 + paramInt2 - 1 + paramInt19, paramintW);
    if ((paramInt5 != paramInt4 ? 0 : 1) != 0)
    {
      paramArrayOfInt2[(j - 1 + paramInt13)] = 1;
      paramArrayOfInt3[(j - 1 + paramInt14)] = 1;
      paramArrayOfInt5[(j - 1 + paramInt16)] = 1;
    }
    dlaed8_adapter(paramInt1, localintW, paramInt2, paramInt3, paramArrayOfDouble1, paramInt7, paramArrayOfDouble2, paramInt8, paramInt9, paramArrayOfInt1, paramInt10, paramdoubleW, paramInt11, paramArrayOfDouble5, i6 - 1 + paramInt19, paramArrayOfDouble5, m - 1 + paramInt19, paramArrayOfDouble5, i3 - 1 + paramInt19, i7, paramArrayOfDouble5, i5 - 1 + paramInt19, paramArrayOfInt4, paramArrayOfInt3[(j - 1 + paramInt14)] - 1 + paramInt15, paramArrayOfInt5, j + 1 - 1 + paramInt16, paramArrayOfInt6, 1 - 1 + (paramArrayOfInt5[(j - 1 + paramInt16)] - 1) * 2 + paramInt17, paramArrayOfDouble4, 1 - 1 + (paramArrayOfInt5[(j - 1 + paramInt16)] - 1) * 2 + paramInt18, paramArrayOfInt7, i2 - 1 + paramInt20, paramArrayOfInt7, n - 1 + paramInt20, paramintW);
    paramArrayOfInt3[(j + 1 - 1 + paramInt14)] = (paramArrayOfInt3[(j - 1 + paramInt14)] + paramInt2);
    paramArrayOfInt5[(j + 1 - 1 + paramInt16)] += paramArrayOfInt5[(j - 1 + paramInt16)];
    if ((localintW.val == 0 ? 0 : 1) != 0)
    {
      Dlaed9.dlaed9(localintW.val, 1, localintW.val, paramInt2, paramArrayOfDouble1, paramInt7, paramArrayOfDouble5, i4 - 1 + paramInt19, localintW.val, paramdoubleW.val, paramArrayOfDouble5, m - 1 + paramInt19, paramArrayOfDouble5, i5 - 1 + paramInt19, paramArrayOfDouble3, paramArrayOfInt2[(j - 1 + paramInt13)] - 1 + paramInt12, localintW.val, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) == 0)
      {
        if ((paramInt1 != 1 ? 0 : 1) != 0) {
          Dgemm.dgemm("N", "N", paramInt3, localintW.val, localintW.val, 1.0D, paramArrayOfDouble5, i3 - 1 + paramInt19, i7, paramArrayOfDouble3, paramArrayOfInt2[(j - 1 + paramInt13)] - 1 + paramInt12, localintW.val, 0.0D, paramArrayOfDouble2, paramInt8, paramInt9);
        }
        paramArrayOfInt2[(j + 1 - 1 + paramInt13)] = (paramArrayOfInt2[(j - 1 + paramInt13)] + (int)Math.pow(localintW.val, 2));
        i8 = localintW.val;
        i9 = paramInt2 - localintW.val;
        Dlamrg.dlamrg(i8, i9, paramArrayOfDouble1, paramInt7, 1, -1, paramArrayOfInt1, paramInt10);
      }
    }
    else
    {
      paramArrayOfInt2[(j + 1 - 1 + paramInt13)] = paramArrayOfInt2[(j - 1 + paramInt13)];
      k = 1;
      for (i11 = paramInt2 - 1 + 1; i11 > 0; i11--)
      {
        paramArrayOfInt1[(k - 1 + paramInt10)] = k;
        k += 1;
      }
    }
  }
  
  private static void dlaed8_adapter(int paramInt1, intW paramintW1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, int[] paramArrayOfInt1, int paramInt7, doubleW paramdoubleW, int paramInt8, double[] paramArrayOfDouble3, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, int paramInt12, double[] paramArrayOfDouble6, int paramInt13, int[] paramArrayOfInt2, int paramInt14, int[] paramArrayOfInt3, int paramInt15, int[] paramArrayOfInt4, int paramInt16, double[] paramArrayOfDouble7, int paramInt17, int[] paramArrayOfInt5, int paramInt18, int[] paramArrayOfInt6, int paramInt19, intW paramintW2)
  {
    intW localintW = new intW(paramArrayOfInt3[paramInt15]);
    Dlaed8.dlaed8(paramInt1, paramintW1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramdoubleW, paramInt8, paramArrayOfDouble3, paramInt9, paramArrayOfDouble4, paramInt10, paramArrayOfDouble5, paramInt11, paramInt12, paramArrayOfDouble6, paramInt13, paramArrayOfInt2, paramInt14, localintW, paramArrayOfInt4, paramInt16, paramArrayOfDouble7, paramInt17, paramArrayOfInt5, paramInt18, paramArrayOfInt6, paramInt19, paramintW2);
    paramArrayOfInt3[paramInt15] = localintW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaed7.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */