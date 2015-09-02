package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgtcon
{
  public static void sgtcon(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, float[] paramArrayOfFloat4, int paramInt5, int[] paramArrayOfInt1, int paramInt6, float paramFloat, floatW paramfloatW, float[] paramArrayOfFloat5, int paramInt7, int[] paramArrayOfInt2, int paramInt8, intW paramintW)
  {
    int i = 0;
    int j = 0;
    intW localintW = new intW(0);
    int k = 0;
    floatW localfloatW = new floatW(0.0F);
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    i = (!paramString.regionMatches(0, "1", 0, 1)) && (!Lsame.lsame(paramString, "O")) ? 0 : 1;
    if ((((i ^ 0x1) != 0) && ((Lsame.lsame(paramString, "I") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramFloat >= 0.0F ? 0 : 1) != 0) {
      paramintW.val = -8;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGTCON", -paramintW.val);
      return;
    }
    paramfloatW.val = 0.0F;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramfloatW.val = 1.0F;
      return;
    }
    if ((paramFloat != 0.0F ? 0 : 1) != 0) {
      return;
    }
    j = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      if ((paramArrayOfFloat2[(j - 1 + paramInt3)] != 0.0F ? 0 : 1) != 0) {
        return;
      }
      j += 1;
    }
    localfloatW.val = 0.0F;
    if (i != 0) {
      k = 1;
    } else {
      k = 2;
    }
    localintW.val = 0;
    for (;;)
    {
      Slacn2.slacn2(paramInt1, paramArrayOfFloat5, paramInt1 + 1 - 1 + paramInt7, paramArrayOfFloat5, paramInt7, paramArrayOfInt2, paramInt8, localfloatW, localintW, arrayOfInt, 0);
      if ((localintW.val == 0 ? 0 : 1) == 0) {
        break;
      }
      if ((localintW.val != k ? 0 : 1) != 0) {
        Sgttrs.sgttrs("No transpose", paramInt1, 1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4, paramArrayOfFloat4, paramInt5, paramArrayOfInt1, paramInt6, paramArrayOfFloat5, paramInt7, paramInt1, paramintW);
      } else {
        Sgttrs.sgttrs("Transpose", paramInt1, 1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4, paramArrayOfFloat4, paramInt5, paramArrayOfInt1, paramInt6, paramArrayOfFloat5, paramInt7, paramInt1, paramintW);
      }
    }
    if ((localfloatW.val == 0.0F ? 0 : 1) != 0) {
      paramfloatW.val = (1.0F / localfloatW.val / paramFloat);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgtcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */