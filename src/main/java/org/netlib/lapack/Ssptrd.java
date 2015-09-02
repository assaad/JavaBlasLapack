package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sspmv;
import org.netlib.blas.Sspr2;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssptrd
{
  public static void ssptrd(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, float[] paramArrayOfFloat4, int paramInt5, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    float f = 0.0F;
    floatW localfloatW = new floatW(0.0F);
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSPTRD", -paramintW.val);
      return;
    }
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    int n;
    if (bool)
    {
      j = paramInt1 * (paramInt1 - 1) / 2 + 1;
      i = paramInt1 - 1;
      for (n = (1 - (paramInt1 - 1) + -1) / -1; n > 0; n--)
      {
        slarfg_adapter(i, paramArrayOfFloat1, j + i - 1 - 1 + paramInt2, paramArrayOfFloat1, j - 1 + paramInt2, 1, localfloatW);
        paramArrayOfFloat3[(i - 1 + paramInt4)] = paramArrayOfFloat1[(j + i - 1 - 1 + paramInt2)];
        if ((localfloatW.val == 0.0F ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(j + i - 1 - 1 + paramInt2)] = 1.0F;
          Sspmv.sspmv(paramString, i, localfloatW.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat1, j - 1 + paramInt2, 1, 0.0F, paramArrayOfFloat4, paramInt5, 1);
          f = -(0.5F * localfloatW.val * Sdot.sdot(i, paramArrayOfFloat4, paramInt5, 1, paramArrayOfFloat1, j - 1 + paramInt2, 1));
          Saxpy.saxpy(i, f, paramArrayOfFloat1, j - 1 + paramInt2, 1, paramArrayOfFloat4, paramInt5, 1);
          Sspr2.sspr2(paramString, i, -1.0F, paramArrayOfFloat1, j - 1 + paramInt2, 1, paramArrayOfFloat4, paramInt5, 1, paramArrayOfFloat1, paramInt2);
          paramArrayOfFloat1[(j + i - 1 - 1 + paramInt2)] = paramArrayOfFloat3[(i - 1 + paramInt4)];
        }
        paramArrayOfFloat2[(i + 1 - 1 + paramInt3)] = paramArrayOfFloat1[(j + i - 1 + paramInt2)];
        paramArrayOfFloat4[(i - 1 + paramInt5)] = localfloatW.val;
        j -= i;
        i += -1;
      }
      paramArrayOfFloat2[(1 - 1 + paramInt3)] = paramArrayOfFloat1[(1 - 1 + paramInt2)];
    }
    else
    {
      m = 1;
      i = 1;
      for (n = paramInt1 - 1 - 1 + 1; n > 0; n--)
      {
        k = m + paramInt1 - i + 1;
        slarfg_adapter(paramInt1 - i, paramArrayOfFloat1, m + 1 - 1 + paramInt2, paramArrayOfFloat1, m + 2 - 1 + paramInt2, 1, localfloatW);
        paramArrayOfFloat3[(i - 1 + paramInt4)] = paramArrayOfFloat1[(m + 1 - 1 + paramInt2)];
        if ((localfloatW.val == 0.0F ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(m + 1 - 1 + paramInt2)] = 1.0F;
          Sspmv.sspmv(paramString, paramInt1 - i, localfloatW.val, paramArrayOfFloat1, k - 1 + paramInt2, paramArrayOfFloat1, m + 1 - 1 + paramInt2, 1, 0.0F, paramArrayOfFloat4, i - 1 + paramInt5, 1);
          f = -(0.5F * localfloatW.val * Sdot.sdot(paramInt1 - i, paramArrayOfFloat4, i - 1 + paramInt5, 1, paramArrayOfFloat1, m + 1 - 1 + paramInt2, 1));
          Saxpy.saxpy(paramInt1 - i, f, paramArrayOfFloat1, m + 1 - 1 + paramInt2, 1, paramArrayOfFloat4, i - 1 + paramInt5, 1);
          Sspr2.sspr2(paramString, paramInt1 - i, -1.0F, paramArrayOfFloat1, m + 1 - 1 + paramInt2, 1, paramArrayOfFloat4, i - 1 + paramInt5, 1, paramArrayOfFloat1, k - 1 + paramInt2);
          paramArrayOfFloat1[(m + 1 - 1 + paramInt2)] = paramArrayOfFloat3[(i - 1 + paramInt4)];
        }
        paramArrayOfFloat2[(i - 1 + paramInt3)] = paramArrayOfFloat1[(m - 1 + paramInt2)];
        paramArrayOfFloat4[(i - 1 + paramInt5)] = localfloatW.val;
        m = k;
        i += 1;
      }
      paramArrayOfFloat2[(paramInt1 - 1 + paramInt3)] = paramArrayOfFloat1[(m - 1 + paramInt2)];
    }
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, floatW paramfloatW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat1[paramInt2]);
    Slarfg.slarfg(paramInt1, localfloatW, paramArrayOfFloat2, paramInt3, paramInt4, paramfloatW);
    paramArrayOfFloat1[paramInt2] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssptrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */