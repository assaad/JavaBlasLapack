package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssyevd
{
  public static void ssyevd(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, int paramInt6, int[] paramArrayOfInt, int paramInt7, int paramInt8, intW paramintW)
  {
    boolean bool1 = false;
    int i = 0;
    boolean bool2 = false;
    intW localintW = new intW(0);
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    bool2 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "L");
    if ((paramInt6 != -1 ? 0 : 1) == 0) {}
    i = (paramInt8 != -1 ? 0 : 1) == 0 ? 0 : 1;
    paramintW.val = 0;
    if ((((!bool2) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0) {
      paramintW.val = -1;
    } else if ((((!bool1) && (!Lsame.lsame(paramString2, "U")) ? 0 : 1) ^ 0x1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 > 1 ? 0 : 1) != 0)
      {
        i3 = 1;
        i7 = 1;
        i6 = i7;
        i2 = i3;
      }
      else
      {
        if (bool2)
        {
          i3 = 3 + 5 * paramInt1;
          i7 = 1 + 6 * paramInt1 + 2 * (int)Math.pow(paramInt1, 2);
        }
        else
        {
          i3 = 1;
          i7 = 2 * paramInt1 + 1;
        }
        i6 = Math.max(i7, 2 * paramInt1 + Ilaenv.ilaenv(1, "SSYTRD", paramString2, paramInt1, -1, -1, -1));
        i2 = i3;
      }
      paramArrayOfFloat3[(1 - 1 + paramInt5)] = i6;
      paramArrayOfInt[(1 - 1 + paramInt7)] = i2;
      if ((paramInt6 >= i7 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -8;
      }
      else
      {
        if ((paramInt8 >= i3 ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -10;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSYEVD", -paramintW.val);
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
      paramArrayOfFloat2[(1 - 1 + paramInt4)] = paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)];
      if (bool2) {
        paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)] = 1.0F;
      }
      return;
    }
    f6 = Slamch.slamch("Safe minimum");
    f3 = Slamch.slamch("Precision");
    f8 = f6 / f3;
    f2 = 1.0F / f8;
    f5 = (float)Math.sqrt(f8);
    f4 = (float)Math.sqrt(f2);
    f1 = Slansy.slansy("M", paramString2, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat3, paramInt5);
    i1 = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= f5 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i1 = 1;
      f7 = f5 / f1;
    }
    else if ((f1 <= f4 ? 0 : 1) != 0)
    {
      i1 = 1;
      f7 = f4 / f1;
    }
    if ((i1 != 1 ? 0 : 1) != 0) {
      Slascl.slascl(paramString2, 0, 0, 1.0F, f7, paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramintW);
    }
    j = 1;
    k = j + paramInt1;
    n = k + paramInt1;
    i4 = paramInt6 - n + 1;
    m = n + paramInt1 * paramInt1;
    i5 = paramInt6 - m + 1;
    Ssytrd.ssytrd(paramString2, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, j - 1 + paramInt5, paramArrayOfFloat3, k - 1 + paramInt5, paramArrayOfFloat3, n - 1 + paramInt5, i4, localintW);
    if ((bool2 ^ true))
    {
      Ssterf.ssterf(paramInt1, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, j - 1 + paramInt5, paramintW);
    }
    else
    {
      Sstedc.sstedc("I", paramInt1, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, j - 1 + paramInt5, paramArrayOfFloat3, n - 1 + paramInt5, paramInt1, paramArrayOfFloat3, m - 1 + paramInt5, i5, paramArrayOfInt, paramInt7, paramInt8, paramintW);
      Sormtr.sormtr("L", paramString2, "N", paramInt1, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat3, k - 1 + paramInt5, paramArrayOfFloat3, n - 1 + paramInt5, paramInt1, paramArrayOfFloat3, m - 1 + paramInt5, i5, localintW);
      Slacpy.slacpy("A", paramInt1, paramInt1, paramArrayOfFloat3, n - 1 + paramInt5, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3);
    }
    if ((i1 != 1 ? 0 : 1) != 0) {
      Sscal.sscal(paramInt1, 1.0F / f7, paramArrayOfFloat2, paramInt4, 1);
    }
    paramArrayOfFloat3[(1 - 1 + paramInt5)] = i6;
    paramArrayOfInt[(1 - 1 + paramInt7)] = i2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssyevd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */