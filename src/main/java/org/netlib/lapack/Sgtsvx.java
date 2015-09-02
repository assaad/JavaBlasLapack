package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgtsvx
{
  public static void sgtsvx(String paramString1, String paramString2, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, float[] paramArrayOfFloat6, int paramInt8, float[] paramArrayOfFloat7, int paramInt9, int[] paramArrayOfInt1, int paramInt10, float[] paramArrayOfFloat8, int paramInt11, int paramInt12, float[] paramArrayOfFloat9, int paramInt13, int paramInt14, floatW paramfloatW, float[] paramArrayOfFloat10, int paramInt15, float[] paramArrayOfFloat11, int paramInt16, float[] paramArrayOfFloat12, int paramInt17, int[] paramArrayOfInt2, int paramInt18, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    String str = new String(" ");
    float f = 0.0F;
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString1, "N");
    bool2 = Lsame.lsame(paramString2, "N");
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "F") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0) {
        paramintW.val = -2;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -3;
      } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -4;
      } else if ((paramInt12 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -14;
      } else if ((paramInt14 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -16;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGTSVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat2, paramInt4, 1, paramArrayOfFloat5, paramInt7, 1);
      if ((paramInt1 <= 1 ? 0 : 1) != 0)
      {
        Scopy.scopy(paramInt1 - 1, paramArrayOfFloat1, paramInt3, 1, paramArrayOfFloat4, paramInt6, 1);
        Scopy.scopy(paramInt1 - 1, paramArrayOfFloat3, paramInt5, 1, paramArrayOfFloat6, paramInt8, 1);
      }
      Sgttrf.sgttrf(paramInt1, paramArrayOfFloat4, paramInt6, paramArrayOfFloat5, paramInt7, paramArrayOfFloat6, paramInt8, paramArrayOfFloat7, paramInt9, paramArrayOfInt1, paramInt10, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramfloatW.val = 0.0F;
        return;
      }
    }
    if (bool2) {
      str = "1";
    } else {
      str = "I";
    }
    f = Slangt.slangt(str, paramInt1, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5);
    Sgtcon.sgtcon(str, paramInt1, paramArrayOfFloat4, paramInt6, paramArrayOfFloat5, paramInt7, paramArrayOfFloat6, paramInt8, paramArrayOfFloat7, paramInt9, paramArrayOfInt1, paramInt10, f, paramfloatW, paramArrayOfFloat12, paramInt17, paramArrayOfInt2, paramInt18, paramintW);
    Slacpy.slacpy("Full", paramInt1, paramInt2, paramArrayOfFloat8, paramInt11, paramInt12, paramArrayOfFloat9, paramInt13, paramInt14);
    Sgttrs.sgttrs(paramString2, paramInt1, paramInt2, paramArrayOfFloat4, paramInt6, paramArrayOfFloat5, paramInt7, paramArrayOfFloat6, paramInt8, paramArrayOfFloat7, paramInt9, paramArrayOfInt1, paramInt10, paramArrayOfFloat9, paramInt13, paramInt14, paramintW);
    Sgtrfs.sgtrfs(paramString2, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramArrayOfFloat5, paramInt7, paramArrayOfFloat6, paramInt8, paramArrayOfFloat7, paramInt9, paramArrayOfInt1, paramInt10, paramArrayOfFloat8, paramInt11, paramInt12, paramArrayOfFloat9, paramInt13, paramInt14, paramArrayOfFloat10, paramInt15, paramArrayOfFloat11, paramInt16, paramArrayOfFloat12, paramInt17, paramArrayOfInt2, paramInt18, paramintW);
    if ((paramfloatW.val >= Slamch.slamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgtsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */