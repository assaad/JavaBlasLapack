package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Sdot;
import org.netlib.util.floatW;

public final class Slapll
{
  public static void slapll(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, floatW paramfloatW)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    if ((paramInt1 > 1 ? 0 : 1) != 0)
    {
      paramfloatW.val = 0.0F;
      return;
    }
    slarfg_adapter(paramInt1, paramArrayOfFloat1, 1 - 1 + paramInt2, paramArrayOfFloat1, 1 + paramInt3 - 1 + paramInt2, paramInt3, localfloatW2);
    f1 = paramArrayOfFloat1[(1 - 1 + paramInt2)];
    paramArrayOfFloat1[(1 - 1 + paramInt2)] = 1.0F;
    f4 = -(localfloatW2.val * Sdot.sdot(paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5));
    Saxpy.saxpy(paramInt1, f4, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, paramInt5);
    slarfg_adapter(paramInt1 - 1, paramArrayOfFloat2, 1 + paramInt5 - 1 + paramInt4, paramArrayOfFloat2, 1 + 2 * paramInt5 - 1 + paramInt4, paramInt5, localfloatW2);
    f2 = paramArrayOfFloat2[(1 - 1 + paramInt4)];
    f3 = paramArrayOfFloat2[(1 + paramInt5 - 1 + paramInt4)];
    Slas2.slas2(f1, f2, f3, paramfloatW, localfloatW1);
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, floatW paramfloatW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat1[paramInt2]);
    Slarfg.slarfg(paramInt1, localfloatW, paramArrayOfFloat2, paramInt3, paramInt4, paramfloatW);
    paramArrayOfFloat1[paramInt2] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slapll.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */