package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaed1
{
  public static void slaed1(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, floatW paramfloatW, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int[] paramArrayOfInt2, int paramInt8, intW paramintW)
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
      Xerbla.xerbla("SLAED1", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i6 = 1;
    m = i6 + paramInt1;
    i5 = m + paramInt1;
    i3 = i5 + paramInt1;
    n = 1;
    i1 = n + paramInt1;
    i = i1 + paramInt1;
    i2 = i + paramInt1;
    Scopy.scopy(paramInt6, paramArrayOfFloat2, paramInt6 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat3, i6 - 1 + paramInt7, 1);
    j = paramInt6 + 1;
    Scopy.scopy(paramInt1 - paramInt6, paramArrayOfFloat2, j - 1 + (j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat3, i6 + paramInt6 - 1 + paramInt7, 1);
    Slaed2.slaed2(localintW, paramInt1, paramInt6, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, paramfloatW, paramArrayOfFloat3, i6 - 1 + paramInt7, paramArrayOfFloat3, m - 1 + paramInt7, paramArrayOfFloat3, i5 - 1 + paramInt7, paramArrayOfFloat3, i3 - 1 + paramInt7, paramArrayOfInt2, n - 1 + paramInt8, paramArrayOfInt2, i1 - 1 + paramInt8, paramArrayOfInt2, i2 - 1 + paramInt8, paramArrayOfInt2, i - 1 + paramInt8, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) == 0) {
      if ((localintW.val == 0 ? 0 : 1) != 0)
      {
        i4 = (paramArrayOfInt2[(i - 1 + paramInt8)] + paramArrayOfInt2[(i + 1 - 1 + paramInt8)]) * paramInt6 + (paramArrayOfInt2[(i + 1 - 1 + paramInt8)] + paramArrayOfInt2[(i + 2 - 1 + paramInt8)]) * (paramInt1 - paramInt6) + i3;
        Slaed3.slaed3(localintW.val, paramInt1, paramInt6, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramInt4, paramfloatW.val, paramArrayOfFloat3, m - 1 + paramInt7, paramArrayOfFloat3, i3 - 1 + paramInt7, paramArrayOfInt2, i1 - 1 + paramInt8, paramArrayOfInt2, i - 1 + paramInt8, paramArrayOfFloat3, i5 - 1 + paramInt7, paramArrayOfFloat3, i4 - 1 + paramInt7, paramintW);
        if ((paramintW.val == 0 ? 0 : 1) == 0)
        {
          i7 = localintW.val;
          i8 = paramInt1 - localintW.val;
          Slamrg.slamrg(i7, i8, paramArrayOfFloat1, paramInt2, 1, -1, paramArrayOfInt1, paramInt5);
        }
      }
      else
      {
        k = 1;
        for (int i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
        {
          paramArrayOfInt1[(k - 1 + paramInt5)] = k;
          k += 1;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaed1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */