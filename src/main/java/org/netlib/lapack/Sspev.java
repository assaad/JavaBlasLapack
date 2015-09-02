package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sspev
{
  public static void sspev(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    intW localintW = new intW(0);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    bool = Lsame.lsame(paramString1, "V");
    paramintW.val = 0;
    if ((((!bool) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((!Lsame.lsame(paramString2, "U")) && (!Lsame.lsame(paramString2, "L")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if (!bool) {}
      }
      if ((((paramInt5 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -7;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSPEV ", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfFloat2[(1 - 1 + paramInt3)] = paramArrayOfFloat1[(1 - 1 + paramInt2)];
      if (bool) {
        paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0F;
      }
      return;
    }
    f6 = Slamch.slamch("Safe minimum");
    f3 = Slamch.slamch("Precision");
    f8 = f6 / f3;
    f2 = 1.0F / f8;
    f5 = (float)Math.sqrt(f8);
    f4 = (float)Math.sqrt(f2);
    f1 = Slansp.slansp("M", paramString2, paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat4, paramInt6);
    n = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= f5 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      n = 1;
      f7 = f5 / f1;
    }
    else if ((f1 <= f4 ? 0 : 1) != 0)
    {
      n = 1;
      f7 = f4 / f1;
    }
    if ((n != 1 ? 0 : 1) != 0) {
      Sscal.sscal(paramInt1 * (paramInt1 + 1) / 2, f7, paramArrayOfFloat1, paramInt2, 1);
    }
    j = 1;
    k = j + paramInt1;
    Ssptrd.ssptrd(paramString2, paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat4, j - 1 + paramInt6, paramArrayOfFloat4, k - 1 + paramInt6, localintW);
    if ((bool ^ true))
    {
      Ssterf.ssterf(paramInt1, paramArrayOfFloat2, paramInt3, paramArrayOfFloat4, j - 1 + paramInt6, paramintW);
    }
    else
    {
      m = k + paramInt1;
      Sopgtr.sopgtr(paramString2, paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat4, k - 1 + paramInt6, paramArrayOfFloat3, paramInt4, paramInt5, paramArrayOfFloat4, m - 1 + paramInt6, localintW);
      Ssteqr.ssteqr(paramString1, paramInt1, paramArrayOfFloat2, paramInt3, paramArrayOfFloat4, j - 1 + paramInt6, paramArrayOfFloat3, paramInt4, paramInt5, paramArrayOfFloat4, k - 1 + paramInt6, paramintW);
    }
    if ((n != 1 ? 0 : 1) != 0)
    {
      if ((paramintW.val != 0 ? 0 : 1) != 0) {
        i = paramInt1;
      } else {
        i = paramintW.val - 1;
      }
      Sscal.sscal(i, 1.0F / f7, paramArrayOfFloat2, paramInt3, 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sspev.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */