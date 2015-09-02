package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sptcon
{
  public static void sptcon(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float paramFloat, floatW paramfloatW, float[] paramArrayOfFloat3, int paramInt4, intW paramintW)
  {
    int i = 0;
    int j = 0;
    float f = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramFloat >= 0.0F ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPTCON", -paramintW.val);
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
    i = 1;
    for (int k = paramInt1 - 1 + 1; k > 0; k--)
    {
      if ((paramArrayOfFloat1[(i - 1 + paramInt2)] > 0.0F ? 0 : 1) != 0) {
        return;
      }
      i += 1;
    }
    paramArrayOfFloat3[(1 - 1 + paramInt4)] = 1.0F;
    i = 2;
    for (int k = paramInt1 - 2 + 1; k > 0; k--)
    {
      paramArrayOfFloat3[(i - 1 + paramInt4)] = (1.0F + paramArrayOfFloat3[(i - 1 - 1 + paramInt4)] * Math.abs(paramArrayOfFloat2[(i - 1 - 1 + paramInt3)]));
      i += 1;
    }
    paramArrayOfFloat3[(paramInt1 - 1 + paramInt4)] /= paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)];
    i = paramInt1 - 1;
    for (int k = (1 - (paramInt1 - 1) + -1) / -1; k > 0; k--)
    {
      paramArrayOfFloat3[(i - 1 + paramInt4)] = (paramArrayOfFloat3[(i - 1 + paramInt4)] / paramArrayOfFloat1[(i - 1 + paramInt2)] + paramArrayOfFloat3[(i + 1 - 1 + paramInt4)] * Math.abs(paramArrayOfFloat2[(i - 1 + paramInt3)]));
      i += -1;
    }
    j = Isamax.isamax(paramInt1, paramArrayOfFloat3, paramInt4, 1);
    f = Math.abs(paramArrayOfFloat3[(j - 1 + paramInt4)]);
    if ((f == 0.0F ? 0 : 1) != 0) {
      paramfloatW.val = (1.0F / f / paramFloat);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sptcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */