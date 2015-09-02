package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sspmv;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssptri
{
  public static void ssptri(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int[] paramArrayOfInt, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSPTRI", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int i5;
    if (bool)
    {
      n = paramInt1 * (paramInt1 + 1) / 2;
      paramintW.val = paramInt1;
      for (i5 = (1 - paramInt1 + -1) / -1; i5 > 0; i5--)
      {
        if ((paramArrayOfInt[(paramintW.val - 1 + paramInt3)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat1[(n - 1 + paramInt2)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        n -= paramintW.val;
        paramintW.val += -1;
      }
    }
    else
    {
      n = 1;
      paramintW.val = 1;
      for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
      {
        if ((paramArrayOfInt[(paramintW.val - 1 + paramInt3)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat1[(n - 1 + paramInt2)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        n = n + paramInt1 - paramintW.val + 1;
        paramintW.val += 1;
      }
    }
    paramintW.val = 0;
    if (bool)
    {
      j = 1;
      for (k = 1; (j <= paramInt1 ? 0 : 1) == 0; k = m)
      {
        m = k + j;
        if ((paramArrayOfInt[(j - 1 + paramInt3)] <= 0 ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(k + j - 1 - 1 + paramInt2)] = (1.0F / paramArrayOfFloat1[(k + j - 1 - 1 + paramInt2)]);
          if ((j <= 1 ? 0 : 1) != 0)
          {
            Scopy.scopy(j - 1, paramArrayOfFloat1, k - 1 + paramInt2, 1, paramArrayOfFloat2, paramInt4, 1);
            Sspmv.sspmv(paramString, j - 1, -1.0F, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt4, 1, 0.0F, paramArrayOfFloat1, k - 1 + paramInt2, 1);
            paramArrayOfFloat1[(k + j - 1 - 1 + paramInt2)] -= Sdot.sdot(j - 1, paramArrayOfFloat2, paramInt4, 1, paramArrayOfFloat1, k - 1 + paramInt2, 1);
          }
          i2 = 1;
        }
        else
        {
          f5 = Math.abs(paramArrayOfFloat1[(m + j - 1 - 1 + paramInt2)]);
          f1 = paramArrayOfFloat1[(k + j - 1 - 1 + paramInt2)] / f5;
          f3 = paramArrayOfFloat1[(m + j - 1 + paramInt2)] / f5;
          f2 = paramArrayOfFloat1[(m + j - 1 - 1 + paramInt2)] / f5;
          f4 = f5 * (f1 * f3 - 1.0F);
          paramArrayOfFloat1[(k + j - 1 - 1 + paramInt2)] = (f3 / f4);
          paramArrayOfFloat1[(m + j - 1 + paramInt2)] = (f1 / f4);
          paramArrayOfFloat1[(m + j - 1 - 1 + paramInt2)] = (-(f2 / f4));
          if ((j <= 1 ? 0 : 1) != 0)
          {
            Scopy.scopy(j - 1, paramArrayOfFloat1, k - 1 + paramInt2, 1, paramArrayOfFloat2, paramInt4, 1);
            Sspmv.sspmv(paramString, j - 1, -1.0F, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt4, 1, 0.0F, paramArrayOfFloat1, k - 1 + paramInt2, 1);
            paramArrayOfFloat1[(k + j - 1 - 1 + paramInt2)] -= Sdot.sdot(j - 1, paramArrayOfFloat2, paramInt4, 1, paramArrayOfFloat1, k - 1 + paramInt2, 1);
            paramArrayOfFloat1[(m + j - 1 - 1 + paramInt2)] -= Sdot.sdot(j - 1, paramArrayOfFloat1, k - 1 + paramInt2, 1, paramArrayOfFloat1, m - 1 + paramInt2, 1);
            Scopy.scopy(j - 1, paramArrayOfFloat1, m - 1 + paramInt2, 1, paramArrayOfFloat2, paramInt4, 1);
            Sspmv.sspmv(paramString, j - 1, -1.0F, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt4, 1, 0.0F, paramArrayOfFloat1, m - 1 + paramInt2, 1);
            paramArrayOfFloat1[(m + j - 1 + paramInt2)] -= Sdot.sdot(j - 1, paramArrayOfFloat2, paramInt4, 1, paramArrayOfFloat1, m - 1 + paramInt2, 1);
          }
          i2 = 2;
          m = m + j + 1;
        }
        n = Math.abs(paramArrayOfInt[(j - 1 + paramInt3)]);
        if ((n == j ? 0 : 1) != 0)
        {
          i1 = (n - 1) * n / 2 + 1;
          Sswap.sswap(n - 1, paramArrayOfFloat1, k - 1 + paramInt2, 1, paramArrayOfFloat1, i1 - 1 + paramInt2, 1);
          i3 = i1 + n - 1;
          i = n + 1;
          for (i5 = j - 1 - (n + 1) + 1; i5 > 0; i5--)
          {
            i3 = i3 + i - 1;
            f6 = paramArrayOfFloat1[(k + i - 1 - 1 + paramInt2)];
            paramArrayOfFloat1[(k + i - 1 - 1 + paramInt2)] = paramArrayOfFloat1[(i3 - 1 + paramInt2)];
            paramArrayOfFloat1[(i3 - 1 + paramInt2)] = f6;
            i += 1;
          }
          f6 = paramArrayOfFloat1[(k + j - 1 - 1 + paramInt2)];
          paramArrayOfFloat1[(k + j - 1 - 1 + paramInt2)] = paramArrayOfFloat1[(i1 + n - 1 - 1 + paramInt2)];
          paramArrayOfFloat1[(i1 + n - 1 - 1 + paramInt2)] = f6;
          if ((i2 != 2 ? 0 : 1) != 0)
          {
            f6 = paramArrayOfFloat1[(k + j + j - 1 - 1 + paramInt2)];
            paramArrayOfFloat1[(k + j + j - 1 - 1 + paramInt2)] = paramArrayOfFloat1[(k + j + n - 1 - 1 + paramInt2)];
            paramArrayOfFloat1[(k + j + n - 1 - 1 + paramInt2)] = f6;
          }
        }
        j += i2;
      }
    }
    else
    {
      i4 = paramInt1 * (paramInt1 + 1) / 2;
      j = paramInt1;
      for (k = i4; (j >= 1 ? 0 : 1) == 0; k = m)
      {
        m = k - (paramInt1 - j + 2);
        if ((paramArrayOfInt[(j - 1 + paramInt3)] <= 0 ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(k - 1 + paramInt2)] = (1.0F / paramArrayOfFloat1[(k - 1 + paramInt2)]);
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            Scopy.scopy(paramInt1 - j, paramArrayOfFloat1, k + 1 - 1 + paramInt2, 1, paramArrayOfFloat2, paramInt4, 1);
            Sspmv.sspmv(paramString, paramInt1 - j, -1.0F, paramArrayOfFloat1, k + paramInt1 - j + 1 - 1 + paramInt2, paramArrayOfFloat2, paramInt4, 1, 0.0F, paramArrayOfFloat1, k + 1 - 1 + paramInt2, 1);
            paramArrayOfFloat1[(k - 1 + paramInt2)] -= Sdot.sdot(paramInt1 - j, paramArrayOfFloat2, paramInt4, 1, paramArrayOfFloat1, k + 1 - 1 + paramInt2, 1);
          }
          i2 = 1;
        }
        else
        {
          f5 = Math.abs(paramArrayOfFloat1[(m + 1 - 1 + paramInt2)]);
          f1 = paramArrayOfFloat1[(m - 1 + paramInt2)] / f5;
          f3 = paramArrayOfFloat1[(k - 1 + paramInt2)] / f5;
          f2 = paramArrayOfFloat1[(m + 1 - 1 + paramInt2)] / f5;
          f4 = f5 * (f1 * f3 - 1.0F);
          paramArrayOfFloat1[(m - 1 + paramInt2)] = (f3 / f4);
          paramArrayOfFloat1[(k - 1 + paramInt2)] = (f1 / f4);
          paramArrayOfFloat1[(m + 1 - 1 + paramInt2)] = (-(f2 / f4));
          if ((j >= paramInt1 ? 0 : 1) != 0)
          {
            Scopy.scopy(paramInt1 - j, paramArrayOfFloat1, k + 1 - 1 + paramInt2, 1, paramArrayOfFloat2, paramInt4, 1);
            Sspmv.sspmv(paramString, paramInt1 - j, -1.0F, paramArrayOfFloat1, k + (paramInt1 - j + 1) - 1 + paramInt2, paramArrayOfFloat2, paramInt4, 1, 0.0F, paramArrayOfFloat1, k + 1 - 1 + paramInt2, 1);
            paramArrayOfFloat1[(k - 1 + paramInt2)] -= Sdot.sdot(paramInt1 - j, paramArrayOfFloat2, paramInt4, 1, paramArrayOfFloat1, k + 1 - 1 + paramInt2, 1);
            paramArrayOfFloat1[(m + 1 - 1 + paramInt2)] -= Sdot.sdot(paramInt1 - j, paramArrayOfFloat1, k + 1 - 1 + paramInt2, 1, paramArrayOfFloat1, m + 2 - 1 + paramInt2, 1);
            Scopy.scopy(paramInt1 - j, paramArrayOfFloat1, m + 2 - 1 + paramInt2, 1, paramArrayOfFloat2, paramInt4, 1);
            Sspmv.sspmv(paramString, paramInt1 - j, -1.0F, paramArrayOfFloat1, k + (paramInt1 - j + 1) - 1 + paramInt2, paramArrayOfFloat2, paramInt4, 1, 0.0F, paramArrayOfFloat1, m + 2 - 1 + paramInt2, 1);
            paramArrayOfFloat1[(m - 1 + paramInt2)] -= Sdot.sdot(paramInt1 - j, paramArrayOfFloat2, paramInt4, 1, paramArrayOfFloat1, m + 2 - 1 + paramInt2, 1);
          }
          i2 = 2;
          m -= paramInt1 - j + 3;
        }
        n = Math.abs(paramArrayOfInt[(j - 1 + paramInt3)]);
        if ((n == j ? 0 : 1) != 0)
        {
          i1 = i4 - (paramInt1 - n + 1) * (paramInt1 - n + 2) / 2 + 1;
          if ((n >= paramInt1 ? 0 : 1) != 0) {
            Sswap.sswap(paramInt1 - n, paramArrayOfFloat1, k + n - j + 1 - 1 + paramInt2, 1, paramArrayOfFloat1, i1 + 1 - 1 + paramInt2, 1);
          }
          i3 = k + n - j;
          i = j + 1;
          for (i5 = n - 1 - (j + 1) + 1; i5 > 0; i5--)
          {
            i3 = i3 + paramInt1 - i + 1;
            f6 = paramArrayOfFloat1[(k + i - j - 1 + paramInt2)];
            paramArrayOfFloat1[(k + i - j - 1 + paramInt2)] = paramArrayOfFloat1[(i3 - 1 + paramInt2)];
            paramArrayOfFloat1[(i3 - 1 + paramInt2)] = f6;
            i += 1;
          }
          f6 = paramArrayOfFloat1[(k - 1 + paramInt2)];
          paramArrayOfFloat1[(k - 1 + paramInt2)] = paramArrayOfFloat1[(i1 - 1 + paramInt2)];
          paramArrayOfFloat1[(i1 - 1 + paramInt2)] = f6;
          if ((i2 != 2 ? 0 : 1) != 0)
          {
            f6 = paramArrayOfFloat1[(k - paramInt1 + j - 1 - 1 + paramInt2)];
            paramArrayOfFloat1[(k - paramInt1 + j - 1 - 1 + paramInt2)] = paramArrayOfFloat1[(k - paramInt1 + n - 1 - 1 + paramInt2)];
            paramArrayOfFloat1[(k - paramInt1 + n - 1 - 1 + paramInt2)] = f6;
          }
        }
        j -= i2;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssptri.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */