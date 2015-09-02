package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssycon
{
  public static void ssycon(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, float paramFloat, floatW paramfloatW, float[] paramArrayOfFloat2, int paramInt5, int[] paramArrayOfInt2, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    intW localintW = new intW(0);
    floatW localfloatW = new floatW(0.0F);
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramFloat >= 0.0F ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSYCON", -paramintW.val);
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
    int j;
    if (bool)
    {
      i = paramInt1;
      for (j = (1 - paramInt1 + -1) / -1; j > 0; j--)
      {
        if ((paramArrayOfInt1[(i - 1 + paramInt4)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        i += -1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        if ((paramArrayOfInt1[(i - 1 + paramInt4)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        i += 1;
      }
    }
    localintW.val = 0;
    for (;;)
    {
      Slacn2.slacn2(paramInt1, paramArrayOfFloat2, paramInt1 + 1 - 1 + paramInt5, paramArrayOfFloat2, paramInt5, paramArrayOfInt2, paramInt6, localfloatW, localintW, arrayOfInt, 0);
      if ((localintW.val == 0 ? 0 : 1) == 0) {
        break;
      }
      Ssytrs.ssytrs(paramString, paramInt1, 1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfInt1, paramInt4, paramArrayOfFloat2, paramInt5, paramInt1, paramintW);
    }
    if ((localfloatW.val == 0.0F ? 0 : 1) != 0) {
      paramfloatW.val = (1.0F / localfloatW.val / paramFloat);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssycon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */