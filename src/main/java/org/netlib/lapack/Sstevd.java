package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sstevd
{
  public static void sstevd(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, int paramInt7, int[] paramArrayOfInt, int paramInt8, int paramInt9, intW paramintW)
  {
    int i = 0;
    boolean bool = false;
    int j = 0;
    int k = 0;
    int m = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    bool = Lsame.lsame(paramString, "V");
    if ((paramInt7 != -1 ? 0 : 1) == 0) {}
    i = (paramInt9 != -1 ? 0 : 1) == 0 ? 0 : 1;
    paramintW.val = 0;
    k = 1;
    m = 1;
    if ((paramInt1 <= 1 ? 0 : 1) != 0) {}
    if ((bool ? 1 : 0) != 0)
    {
      m = 1 + 4 * paramInt1 + (int)Math.pow(paramInt1, 2);
      k = 3 + 5 * paramInt1;
    }
    if ((((!bool) && (!Lsame.lsame(paramString, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if (!bool) {}
      }
      if ((((paramInt5 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -6;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      paramArrayOfFloat4[(1 - 1 + paramInt6)] = m;
      paramArrayOfInt[(1 - 1 + paramInt8)] = k;
      if ((paramInt7 >= m ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -8;
      }
      else
      {
        if ((paramInt9 >= k ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -10;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSTEVD", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if (bool) {
        paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0F;
      }
      return;
    }
    f5 = Slamch.slamch("Safe minimum");
    f2 = Slamch.slamch("Precision");
    f7 = f5 / f2;
    f1 = 1.0F / f7;
    f4 = (float)Math.sqrt(f7);
    f3 = (float)Math.sqrt(f1);
    j = 0;
    f8 = Slanst.slanst("M", paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3);
    if ((f8 <= 0.0F ? 0 : 1) != 0) {}
    if (((f8 >= f4 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      j = 1;
      f6 = f4 / f8;
    }
    else if ((f8 <= f3 ? 0 : 1) != 0)
    {
      j = 1;
      f6 = f3 / f8;
    }
    if ((j != 1 ? 0 : 1) != 0)
    {
      Sscal.sscal(paramInt1, f6, paramArrayOfFloat1, paramInt2, 1);
      Sscal.sscal(paramInt1 - 1, f6, paramArrayOfFloat2, 1 - 1 + paramInt3, 1);
    }
    if ((bool ^ true)) {
      Ssterf.ssterf(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramintW);
    } else {
      Sstedc.sstedc("I", paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4, paramInt5, paramArrayOfFloat4, paramInt6, paramInt7, paramArrayOfInt, paramInt8, paramInt9, paramintW);
    }
    if ((j != 1 ? 0 : 1) != 0) {
      Sscal.sscal(paramInt1, 1.0F / f6, paramArrayOfFloat1, paramInt2, 1);
    }
    paramArrayOfFloat4[(1 - 1 + paramInt6)] = m;
    paramArrayOfInt[(1 - 1 + paramInt8)] = k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sstevd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */