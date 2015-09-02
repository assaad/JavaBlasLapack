package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgttrs
{
  public static void sgttrs(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, int[] paramArrayOfInt, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, int paramInt9, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    paramintW.val = 0;
    i = (!paramString.regionMatches(0, "N", 0, 1)) && (!paramString.regionMatches(0, "n", 0, 1)) ? 0 : 1;
    if ((i ^ 0x1) != 0) {}
    if (((((!paramString.regionMatches(0, "T", 0, 1)) && (!paramString.regionMatches(0, "t", 0, 1)) ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0) {}
    if (((((!paramString.regionMatches(0, "C", 0, 1)) && (!paramString.regionMatches(0, "c", 0, 1)) ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt9 >= Math.max(paramInt1, 1) ? 0 : 1) != 0) {
      paramintW.val = -10;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGTTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if (i != 0) {
      j = 0;
    } else {
      j = 1;
    }
    if ((paramInt2 != 1 ? 0 : 1) != 0) {
      n = 1;
    } else {
      n = Math.max(1, Ilaenv.ilaenv(1, "SGTTRS", paramString, paramInt1, paramInt2, -1, -1));
    }
    if ((n < paramInt2 ? 0 : 1) != 0)
    {
      Sgtts2.sgtts2(j, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramArrayOfInt, paramInt7, paramArrayOfFloat5, paramInt8, paramInt9);
    }
    else
    {
      k = 1;
      for (int i1 = (paramInt2 - 1 + n) / n; i1 > 0; i1--)
      {
        m = Math.min(paramInt2 - k + 1, n);
        Sgtts2.sgtts2(j, paramInt1, m, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt6, paramArrayOfInt, paramInt7, paramArrayOfFloat5, 1 - 1 + (k - 1) * paramInt9 + paramInt8, paramInt9);
        k += n;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgttrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */