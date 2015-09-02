package org.netlib.lapack;

import org.netlib.blas.Strmm;
import org.netlib.blas.Strsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssygvd
{
  public static void ssygvd(int paramInt1, String paramString1, String paramString2, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, int[] paramArrayOfInt, int paramInt10, int paramInt11, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    String str = new String(" ");
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    bool2 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "U");
    if ((paramInt9 != -1 ? 0 : 1) == 0) {}
    i = (paramInt11 != -1 ? 0 : 1) == 0 ? 0 : 1;
    paramintW.val = 0;
    if ((paramInt2 > 1 ? 0 : 1) != 0)
    {
      k = 1;
      n = 1;
    }
    else if (bool2)
    {
      k = 3 + 5 * paramInt2;
      n = 1 + 6 * paramInt2 + 2 * (int)Math.pow(paramInt2, 2);
    }
    else
    {
      k = 1;
      n = 2 * paramInt2 + 1;
    }
    m = n;
    j = k;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((((!bool2) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0) {
      paramintW.val = -2;
    } else if ((((!bool1) && (!Lsame.lsame(paramString2, "L")) ? 0 : 1) ^ 0x1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -6;
    } else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -8;
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      paramArrayOfFloat4[(1 - 1 + paramInt8)] = m;
      paramArrayOfInt[(1 - 1 + paramInt10)] = j;
      if ((paramInt9 >= n ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -11;
      }
      else
      {
        if ((paramInt11 >= k ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -13;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSYGVD", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    Spotrf.spotrf(paramString2, paramInt2, paramArrayOfFloat2, paramInt5, paramInt6, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      paramintW.val = (paramInt2 + paramintW.val);
      return;
    }
    Ssygst.ssygst(paramInt1, paramString2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramInt6, paramintW);
    Ssyevd.ssyevd(paramString1, paramString2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt7, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfInt, paramInt10, paramInt11, paramintW);
    m = (int)Math.max(m, paramArrayOfFloat4[(1 - 1 + paramInt8)]);
    j = (int)Math.max(j, paramArrayOfInt[(1 - 1 + paramInt10)]);
    if (bool2) {}
    if (((paramintW.val != 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      if ((paramInt1 != 1 ? 0 : 1) == 0) {}
      if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if (bool1) {
          str = "N";
        } else {
          str = "T";
        }
        Strsm.strsm("Left", paramString2, str, "Non-unit", paramInt2, paramInt2, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat1, paramInt3, paramInt4);
      }
      else if ((paramInt1 != 3 ? 0 : 1) != 0)
      {
        if (bool1) {
          str = "T";
        } else {
          str = "N";
        }
        Strmm.strmm("Left", paramString2, str, "Non-unit", paramInt2, paramInt2, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat1, paramInt3, paramInt4);
      }
    }
    paramArrayOfFloat4[(1 - 1 + paramInt8)] = m;
    paramArrayOfInt[(1 - 1 + paramInt10)] = j;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssygvd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */