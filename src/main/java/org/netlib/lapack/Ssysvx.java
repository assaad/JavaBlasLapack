package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssysvx
{
  public static void ssysvx(String paramString1, String paramString2, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, int[] paramArrayOfInt1, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, floatW paramfloatW, float[] paramArrayOfFloat5, int paramInt12, float[] paramArrayOfFloat6, int paramInt13, float[] paramArrayOfFloat7, int paramInt14, int paramInt15, int[] paramArrayOfInt2, int paramInt16, intW paramintW)
  {
    int i = 0;
    boolean bool = false;
    int j = 0;
    int k = 0;
    float f = 0.0F;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString1, "N");
    i = paramInt15 != -1 ? 0 : 1;
    if ((((bool ^ true)) && ((Lsame.lsame(paramString1, "F") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((Lsame.lsame(paramString2, "U") ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -6;
    }
    else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -8;
    }
    else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -11;
    }
    else if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -13;
    }
    else
    {
      if ((paramInt15 >= Math.max(1, 3 * paramInt1) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -18;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      j = Math.max(1, 3 * paramInt1);
      if (bool)
      {
        k = Ilaenv.ilaenv(1, "SSYTRF", paramString2, paramInt1, -1, -1, -1);
        j = Math.max(j, paramInt1 * k);
      }
      paramArrayOfFloat7[(1 - 1 + paramInt14)] = j;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSYSVX", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if (bool)
    {
      Slacpy.slacpy(paramString2, paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramInt6);
      Ssytrf.ssytrf(paramString2, paramInt1, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfFloat7, paramInt14, paramInt15, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramfloatW.val = 0.0F;
        return;
      }
    }
    f = Slansy.slansy("I", paramString2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat7, paramInt14);
    Ssycon.ssycon(paramString2, paramInt1, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, f, paramfloatW, paramArrayOfFloat7, paramInt14, paramArrayOfInt2, paramInt16, paramintW);
    Slacpy.slacpy("Full", paramInt1, paramInt2, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat4, paramInt10, paramInt11);
    Ssytrs.ssytrs(paramString2, paramInt1, paramInt2, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfFloat4, paramInt10, paramInt11, paramintW);
    Ssyrfs.ssyrfs(paramString2, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfFloat3, paramInt8, paramInt9, paramArrayOfFloat4, paramInt10, paramInt11, paramArrayOfFloat5, paramInt12, paramArrayOfFloat6, paramInt13, paramArrayOfFloat7, paramInt14, paramArrayOfInt2, paramInt16, paramintW);
    if ((paramfloatW.val >= Slamch.slamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
    paramArrayOfFloat7[(1 - 1 + paramInt14)] = j;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssysvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */