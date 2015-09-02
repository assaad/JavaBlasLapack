package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sspcon
{
  public static void sspcon(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int[] paramArrayOfInt1, int paramInt3, float paramFloat, floatW paramfloatW, float[] paramArrayOfFloat2, int paramInt4, int[] paramArrayOfInt2, int paramInt5, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    intW localintW = new intW(0);
    floatW localfloatW = new floatW(0.0F);
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramFloat >= 0.0F ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSPCON", -paramintW.val);
      return;
    }
    paramfloatW.val = 0.0F;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramfloatW.val = 1.0F;
      return;
    }
    if ((paramFloat > 0.0F ? 0 : 1) != 0) {
      return;
    }
    int k;
    if (bool)
    {
      j = paramInt1 * (paramInt1 + 1) / 2;
      i = paramInt1;
      for (k = (1 - paramInt1 + -1) / -1; k > 0; k--)
      {
        if ((paramArrayOfInt1[(i - 1 + paramInt3)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat1[(j - 1 + paramInt2)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        j -= i;
        i += -1;
      }
    }
    else
    {
      j = 1;
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        if ((paramArrayOfInt1[(i - 1 + paramInt3)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat1[(j - 1 + paramInt2)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        j = j + paramInt1 - i + 1;
        i += 1;
      }
    }
    localintW.val = 0;
    for (;;)
    {
      Slacn2.slacn2(paramInt1, paramArrayOfFloat2, paramInt1 + 1 - 1 + paramInt4, paramArrayOfFloat2, paramInt4, paramArrayOfInt2, paramInt5, localfloatW, localintW, arrayOfInt, 0);
      if ((localintW.val == 0 ? 0 : 1) == 0) {
        break;
      }
      Ssptrs.ssptrs(paramString, paramInt1, 1, paramArrayOfFloat1, paramInt2, paramArrayOfInt1, paramInt3, paramArrayOfFloat2, paramInt4, paramInt1, paramintW);
    }
    if ((localfloatW.val == 0.0F ? 0 : 1) != 0) {
      paramfloatW.val = (1.0F / localfloatW.val / paramFloat);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sspcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */