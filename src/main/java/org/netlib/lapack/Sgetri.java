package org.netlib.lapack;

import org.netlib.blas.Sgemm;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sswap;
import org.netlib.blas.Strsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgetri
{
  public static void sgetri(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, intW paramintW)
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
    paramintW.val = 0;
    i5 = Ilaenv.ilaenv(1, "SGETRI", " ", paramInt1, -1, -1, -1);
    i4 = paramInt1 * i5;
    paramArrayOfFloat2[(1 - 1 + paramInt5)] = i4;
    i = paramInt6 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -6;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGETRI", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    Strtri.strtri("Upper", "Non-unit", paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramintW);
    if ((paramintW.val <= 0 ? 0 : 1) != 0) {
      return;
    }
    i6 = 2;
    i3 = paramInt1;
    if ((i5 <= 1 ? 0 : 1) != 0) {}
    if (((i5 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      k = Math.max(i3 * i5, 1);
      if ((paramInt6 >= k ? 0 : 1) != 0)
      {
        i5 = paramInt6 / i3;
        i6 = Math.max(2, Ilaenv.ilaenv(2, "SGETRI", " ", paramInt1, -1, -1, -1));
      }
    }
    else
    {
      k = paramInt1;
    }
    if ((i5 >= i6 ? 0 : 1) == 0) {}
    int i9;
    if (((i5 < paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      m = paramInt1;
      for (int i8 = (1 - paramInt1 + -1) / -1; i8 > 0; i8--)
      {
        j = m + 1;
        for (i9 = paramInt1 - (m + 1) + 1; i9 > 0; i9--)
        {
          paramArrayOfFloat2[(j - 1 + paramInt5)] = paramArrayOfFloat1[(j - 1 + (m - 1) * paramInt3 + paramInt2)];
          paramArrayOfFloat1[(j - 1 + (m - 1) * paramInt3 + paramInt2)] = 0.0F;
          j += 1;
        }
        if ((m >= paramInt1 ? 0 : 1) != 0) {
          Sgemv.sgemv("No transpose", paramInt1, paramInt1 - m, -1.0F, paramArrayOfFloat1, 1 - 1 + (m + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, m + 1 - 1 + paramInt5, 1, 1.0F, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1);
        }
        m += -1;
      }
    }
    else
    {
      i7 = (paramInt1 - 1) / i5 * i5 + 1;
      m = i7;
      for (int i8 = (1 - i7 + -i5) / -i5; i8 > 0; i8--)
      {
        n = Math.min(i5, paramInt1 - m + 1);
        i1 = m;
        for (i9 = m + n - 1 - m + 1; i9 > 0; i9--)
        {
          j = i1 + 1;
          for (int i10 = paramInt1 - (i1 + 1) + 1; i10 > 0; i10--)
          {
            paramArrayOfFloat2[(j + (i1 - m) * i3 - 1 + paramInt5)] = paramArrayOfFloat1[(j - 1 + (i1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat1[(j - 1 + (i1 - 1) * paramInt3 + paramInt2)] = 0.0F;
            j += 1;
          }
          i1 += 1;
        }
        if ((m + n > paramInt1 ? 0 : 1) != 0) {
          Sgemm.sgemm("No transpose", "No transpose", paramInt1, n, paramInt1 - m - n + 1, -1.0F, paramArrayOfFloat1, 1 - 1 + (m + n - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, m + n - 1 + paramInt5, i3, 1.0F, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, paramInt3);
        }
        Strsm.strsm("Right", "Lower", "No transpose", "Unit", paramInt1, n, 1.0F, paramArrayOfFloat2, m - 1 + paramInt5, i3, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, paramInt3);
        m += -i5;
      }
    }
    m = paramInt1 - 1;
    for (int i8 = (1 - (paramInt1 - 1) + -1) / -1; i8 > 0; i8--)
    {
      i2 = paramArrayOfInt[(m - 1 + paramInt4)];
      if ((i2 == m ? 0 : 1) != 0) {
        Sswap.sswap(paramInt1, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, 1 - 1 + (i2 - 1) * paramInt3 + paramInt2, 1);
      }
      m += -1;
    }
    paramArrayOfFloat2[(1 - 1 + paramInt5)] = k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgetri.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */