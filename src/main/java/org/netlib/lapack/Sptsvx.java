package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sptsvx
{
  public static void sptsvx(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, int paramInt8, float[] paramArrayOfFloat6, int paramInt9, int paramInt10, floatW paramfloatW, float[] paramArrayOfFloat7, int paramInt11, float[] paramArrayOfFloat8, int paramInt12, float[] paramArrayOfFloat9, int paramInt13, intW paramintW)
  {
    boolean bool = false;
    float f = 0.0F;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "N");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "F") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -9;
    } else if ((paramInt10 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -11;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPTSVX", -paramintW.val);
      return;
    }
    if (bool)
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt3, 1, paramArrayOfFloat3, paramInt5, 1);
      if ((paramInt1 <= 1 ? 0 : 1) != 0) {
        Scopy.scopy(paramInt1 - 1, paramArrayOfFloat2, paramInt4, 1, paramArrayOfFloat4, paramInt6, 1);
      }
      Spttrf.spttrf(paramInt1, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramfloatW.val = 0.0F;
        return;
      }
    }
    f = Slanst.slanst("1", paramInt1, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4);
    Sptcon.sptcon(paramInt1, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, f, paramfloatW, paramArrayOfFloat9, paramInt13, paramintW);
    Slacpy.slacpy("Full", paramInt1, paramInt2, paramArrayOfFloat5, paramInt7, paramInt8, paramArrayOfFloat6, paramInt9, paramInt10);
    Spttrs.spttrs(paramInt1, paramInt2, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramArrayOfFloat6, paramInt9, paramInt10, paramintW);
    Sptrfs.sptrfs(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramArrayOfFloat5, paramInt7, paramInt8, paramArrayOfFloat6, paramInt9, paramInt10, paramArrayOfFloat7, paramInt11, paramArrayOfFloat8, paramInt12, paramArrayOfFloat9, paramInt13, paramintW);
    if ((paramfloatW.val >= Slamch.slamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sptsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */