package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sspmv;
import org.netlib.blas.Sspr2;
import org.netlib.blas.Stpmv;
import org.netlib.blas.Stpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sspgst
{
  public static void sspgst(int paramInt1, String paramString, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, intW paramintW)
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSPGST", -paramintW.val);
      return;
    }
    int i4;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if (bool)
      {
        m = 0;
        i = 1;
        for (i4 = paramInt2 - 1 + 1; i4 > 0; i4--)
        {
          j = m + 1;
          m += i;
          f3 = paramArrayOfFloat2[(m - 1 + paramInt4)];
          Stpsv.stpsv(paramString, "Transpose", "Nonunit", i, paramArrayOfFloat2, paramInt4, paramArrayOfFloat1, j - 1 + paramInt3, 1);
          Sspmv.sspmv(paramString, i - 1, -1.0F, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, j - 1 + paramInt4, 1, 1.0F, paramArrayOfFloat1, j - 1 + paramInt3, 1);
          Sscal.sscal(i - 1, 1.0F / f3, paramArrayOfFloat1, j - 1 + paramInt3, 1);
          paramArrayOfFloat1[(m - 1 + paramInt3)] = ((paramArrayOfFloat1[(m - 1 + paramInt3)] - Sdot.sdot(i - 1, paramArrayOfFloat1, j - 1 + paramInt3, 1, paramArrayOfFloat2, j - 1 + paramInt4, 1)) / f3);
          i += 1;
        }
      }
      else
      {
        i3 = 1;
        n = 1;
        for (i4 = paramInt2 - 1 + 1; i4 > 0; i4--)
        {
          i2 = i3 + paramInt2 - n + 1;
          f2 = paramArrayOfFloat1[(i3 - 1 + paramInt3)];
          f4 = paramArrayOfFloat2[(i3 - 1 + paramInt4)];
          f2 /= (float)Math.pow(f4, 2);
          paramArrayOfFloat1[(i3 - 1 + paramInt3)] = f2;
          if ((n >= paramInt2 ? 0 : 1) != 0)
          {
            Sscal.sscal(paramInt2 - n, 1.0F / f4, paramArrayOfFloat1, i3 + 1 - 1 + paramInt3, 1);
            f5 = -(0.5F * f2);
            Saxpy.saxpy(paramInt2 - n, f5, paramArrayOfFloat2, i3 + 1 - 1 + paramInt4, 1, paramArrayOfFloat1, i3 + 1 - 1 + paramInt3, 1);
            Sspr2.sspr2(paramString, paramInt2 - n, -1.0F, paramArrayOfFloat1, i3 + 1 - 1 + paramInt3, 1, paramArrayOfFloat2, i3 + 1 - 1 + paramInt4, 1, paramArrayOfFloat1, i2 - 1 + paramInt3);
            Saxpy.saxpy(paramInt2 - n, f5, paramArrayOfFloat2, i3 + 1 - 1 + paramInt4, 1, paramArrayOfFloat1, i3 + 1 - 1 + paramInt3, 1);
            Stpsv.stpsv(paramString, "No transpose", "Non-unit", paramInt2 - n, paramArrayOfFloat2, i2 - 1 + paramInt4, paramArrayOfFloat1, i3 + 1 - 1 + paramInt3, 1);
          }
          i3 = i2;
          n += 1;
        }
      }
    }
    else if (bool)
    {
      i3 = 0;
      n = 1;
      for (i4 = paramInt2 - 1 + 1; i4 > 0; i4--)
      {
        i1 = i3 + 1;
        i3 += n;
        f2 = paramArrayOfFloat1[(i3 - 1 + paramInt3)];
        f4 = paramArrayOfFloat2[(i3 - 1 + paramInt4)];
        Stpmv.stpmv(paramString, "No transpose", "Non-unit", n - 1, paramArrayOfFloat2, paramInt4, paramArrayOfFloat1, i1 - 1 + paramInt3, 1);
        f5 = 0.5F * f2;
        Saxpy.saxpy(n - 1, f5, paramArrayOfFloat2, i1 - 1 + paramInt4, 1, paramArrayOfFloat1, i1 - 1 + paramInt3, 1);
        Sspr2.sspr2(paramString, n - 1, 1.0F, paramArrayOfFloat1, i1 - 1 + paramInt3, 1, paramArrayOfFloat2, i1 - 1 + paramInt4, 1, paramArrayOfFloat1, paramInt3);
        Saxpy.saxpy(n - 1, f5, paramArrayOfFloat2, i1 - 1 + paramInt4, 1, paramArrayOfFloat1, i1 - 1 + paramInt3, 1);
        Sscal.sscal(n - 1, f4, paramArrayOfFloat1, i1 - 1 + paramInt3, 1);
        paramArrayOfFloat1[(i3 - 1 + paramInt3)] = (f2 * (float)Math.pow(f4, 2));
        n += 1;
      }
    }
    else
    {
      m = 1;
      i = 1;
      for (i4 = paramInt2 - 1 + 1; i4 > 0; i4--)
      {
        k = m + paramInt2 - i + 1;
        f1 = paramArrayOfFloat1[(m - 1 + paramInt3)];
        f3 = paramArrayOfFloat2[(m - 1 + paramInt4)];
        paramArrayOfFloat1[(m - 1 + paramInt3)] = (f1 * f3 + Sdot.sdot(paramInt2 - i, paramArrayOfFloat1, m + 1 - 1 + paramInt3, 1, paramArrayOfFloat2, m + 1 - 1 + paramInt4, 1));
        Sscal.sscal(paramInt2 - i, f3, paramArrayOfFloat1, m + 1 - 1 + paramInt3, 1);
        Sspmv.sspmv(paramString, paramInt2 - i, 1.0F, paramArrayOfFloat1, k - 1 + paramInt3, paramArrayOfFloat2, m + 1 - 1 + paramInt4, 1, 1.0F, paramArrayOfFloat1, m + 1 - 1 + paramInt3, 1);
        Stpmv.stpmv(paramString, "Transpose", "Non-unit", paramInt2 - i + 1, paramArrayOfFloat2, m - 1 + paramInt4, paramArrayOfFloat1, m - 1 + paramInt3, 1);
        m = k;
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sspgst.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */