package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasq1
{
  public static void slasq1(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, intW paramintW)
  {
    int i = 0;
    intW localintW = new intW(0);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
      Xerbla.xerbla("SLASQ1", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfFloat1[(1 - 1 + paramInt2)] = Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt2)]);
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      Slas2.slas2(paramArrayOfFloat1[(1 - 1 + paramInt2)], paramArrayOfFloat2[(1 - 1 + paramInt3)], paramArrayOfFloat1[(2 - 1 + paramInt2)], localfloatW1, localfloatW2);
      paramArrayOfFloat1[(1 - 1 + paramInt2)] = localfloatW2.val;
      paramArrayOfFloat1[(2 - 1 + paramInt2)] = localfloatW1.val;
      return;
    }
    localfloatW2.val = 0.0F;
    i = 1;
    for (int j = paramInt1 - 1 - 1 + 1; j > 0; j--)
    {
      paramArrayOfFloat1[(i - 1 + paramInt2)] = Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]);
      localfloatW2.val = Math.max(localfloatW2.val, Math.abs(paramArrayOfFloat2[(i - 1 + paramInt3)]));
      i += 1;
    }
    paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)] = Math.abs(paramArrayOfFloat1[(paramInt1 - 1 + paramInt2)]);
    if ((localfloatW2.val != 0.0F ? 0 : 1) != 0)
    {
      Slasrt.slasrt("D", paramInt1, paramArrayOfFloat1, paramInt2, localintW);
      return;
    }
    i = 1;
    for (int j = paramInt1 - 1 + 1; j > 0; j--)
    {
      localfloatW2.val = Math.max(localfloatW2.val, paramArrayOfFloat1[(i - 1 + paramInt2)]);
      i += 1;
    }
    f1 = Slamch.slamch("Precision");
    f3 = Slamch.slamch("Safe minimum");
    f2 = (float)Math.sqrt(f1 / f3);
    Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat3, 1 - 1 + paramInt4, 2);
    Scopy.scopy(paramInt1 - 1, paramArrayOfFloat2, paramInt3, 1, paramArrayOfFloat3, 2 - 1 + paramInt4, 2);
    Slascl.slascl("G", 0, 0, localfloatW2.val, f2, 2 * paramInt1 - 1, 1, paramArrayOfFloat3, paramInt4, 2 * paramInt1 - 1, localintW);
    i = 1;
    for (int j = 2 * paramInt1 - 1 - 1 + 1; j > 0; j--)
    {
      paramArrayOfFloat3[(i - 1 + paramInt4)] = ((float)Math.pow(paramArrayOfFloat3[(i - 1 + paramInt4)], 2));
      i += 1;
    }
    paramArrayOfFloat3[(2 * paramInt1 - 1 + paramInt4)] = 0.0F;
    Slasq2.slasq2(paramInt1, paramArrayOfFloat3, paramInt4, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (int j = paramInt1 - 1 + 1; j > 0; j--)
      {
        paramArrayOfFloat1[(i - 1 + paramInt2)] = ((float)Math.sqrt(paramArrayOfFloat3[(i - 1 + paramInt4)]));
        i += 1;
      }
      Slascl.slascl("G", 0, 0, f2, localfloatW2.val, paramInt1, 1, paramArrayOfFloat1, paramInt2, paramInt1, localintW);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasq1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */