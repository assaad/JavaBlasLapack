package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spteqr
{
  public static void spteqr(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, intW paramintW)
  {
    float[] arrayOfFloat1 = new float[1 * 1];
    float[] arrayOfFloat2 = new float[1 * 1];
    int i = 0;
    int j = 0;
    int k = 0;
    paramintW.val = 0;
    if (Lsame.lsame(paramString, "N")) {
      j = 0;
    } else if (Lsame.lsame(paramString, "V")) {
      j = 1;
    } else if (Lsame.lsame(paramString, "I")) {
      j = 2;
    } else {
      j = -1;
    }
    if ((j >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if ((j <= 0 ? 0 : 1) == 0) {}
      }
      if ((((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -6;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPTEQR", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((j <= 0 ? 0 : 1) != 0) {
        paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0F;
      }
      return;
    }
    if ((j != 2 ? 0 : 1) != 0) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat3, paramInt4, paramInt5);
    }
    Spttrf.spttrf(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      paramArrayOfFloat1[(i - 1 + paramInt2)] = ((float)Math.sqrt(paramArrayOfFloat1[(i - 1 + paramInt2)]));
      i += 1;
    }
    i = 1;
    for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
    {
      paramArrayOfFloat2[(i - 1 + paramInt3)] *= paramArrayOfFloat1[(i - 1 + paramInt2)];
      i += 1;
    }
    if ((j <= 0 ? 0 : 1) != 0) {
      k = paramInt1;
    } else {
      k = 0;
    }
    Sbdsqr.sbdsqr("Lower", paramInt1, 0, k, 0, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, arrayOfFloat2, 0, 1, paramArrayOfFloat3, paramInt4, paramInt5, arrayOfFloat1, 0, 1, paramArrayOfFloat4, paramInt6, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfFloat1[(i - 1 + paramInt2)] *= paramArrayOfFloat1[(i - 1 + paramInt2)];
        i += 1;
      }
    }
    else
    {
      paramintW.val = (paramInt1 + paramintW.val);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spteqr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */