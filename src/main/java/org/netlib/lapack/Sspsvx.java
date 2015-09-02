package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sspsvx
{
  public static void sspsvx(String paramString1, String paramString2, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int[] paramArrayOfInt1, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, floatW paramfloatW, float[] paramArrayOfFloat5, int paramInt10, float[] paramArrayOfFloat6, int paramInt11, float[] paramArrayOfFloat7, int paramInt12, int[] paramArrayOfInt2, int paramInt13, intW paramintW)
  {
    boolean bool = false;
    float f = 0.0F;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString1, "N");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString1, "F") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((((Lsame.lsame(paramString2, "U") ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -9;
    } else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -11;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSPSVX", -paramintW.val);
      return;
    }
    if (bool)
    {
      Scopy.scopy(paramInt1 * (paramInt1 + 1) / 2, paramArrayOfFloat1, paramInt3, 1, paramArrayOfFloat2, paramInt4, 1);
      Ssptrf.ssptrf(paramString2, paramInt1, paramArrayOfFloat2, paramInt4, paramArrayOfInt1, paramInt5, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramfloatW.val = 0.0F;
        return;
      }
    }
    f = Slansp.slansp("I", paramString2, paramInt1, paramArrayOfFloat1, paramInt3, paramArrayOfFloat7, paramInt12);
    Sspcon.sspcon(paramString2, paramInt1, paramArrayOfFloat2, paramInt4, paramArrayOfInt1, paramInt5, f, paramfloatW, paramArrayOfFloat7, paramInt12, paramArrayOfInt2, paramInt13, paramintW);
    Slacpy.slacpy("Full", paramInt1, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, paramInt8, paramInt9);
    Ssptrs.ssptrs(paramString2, paramInt1, paramInt2, paramArrayOfFloat2, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfFloat4, paramInt8, paramInt9, paramintW);
    Ssprfs.ssprfs(paramString2, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, paramInt10, paramArrayOfFloat6, paramInt11, paramArrayOfFloat7, paramInt12, paramArrayOfInt2, paramInt13, paramintW);
    if ((paramfloatW.val >= Slamch.slamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sspsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */