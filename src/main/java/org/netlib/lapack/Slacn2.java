package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sasum;
import org.netlib.blas.Scopy;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slacn2
{
  public static void slacn2(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, floatW paramfloatW, intW paramintW, int[] paramArrayOfInt2, int paramInt5)
  {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt3)] = (1.0F / paramInt1);
        i += 1;
      }
      paramintW.val = 1;
      paramArrayOfInt2[(1 - 1 + paramInt5)] = 1;
      return;
    }
    int k = paramArrayOfInt2[(1 - 1 + paramInt5)];
    if (k != 1)
    {
      if (k != 2)
      {
        if (k == 3) {
          break label390;
        }
        if (k == 4) {
          break label600;
        }
        if (k == 5) {
          break label796;
        }
      }
    }
    else
    {
      if ((paramInt1 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfFloat1[(1 - 1 + paramInt2)] = paramArrayOfFloat2[(1 - 1 + paramInt3)];
        paramfloatW.val = Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt2)]);
        break label850;
      }
      paramfloatW.val = Sasum.sasum(paramInt1, paramArrayOfFloat2, paramInt3, 1);
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt3)] = Util.sign(1.0F, paramArrayOfFloat2[(i - 1 + paramInt3)]);
        paramArrayOfInt1[(i - 1 + paramInt4)] = Util.nint(paramArrayOfFloat2[(i - 1 + paramInt3)]);
        i += 1;
      }
      paramintW.val = 2;
      paramArrayOfInt2[(1 - 1 + paramInt5)] = 2;
      return;
    }
    paramArrayOfInt2[(2 - 1 + paramInt5)] = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt3, 1);
    paramArrayOfInt2[(3 - 1 + paramInt5)] = 2;
    for (;;)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt3)] = 0.0F;
        i += 1;
      }
      paramArrayOfFloat2[(paramArrayOfInt2[(2 - 1 + paramInt5)] - 1 + paramInt3)] = 1.0F;
      paramintW.val = 1;
      paramArrayOfInt2[(1 - 1 + paramInt5)] = 3;
      return;
      label390:
      Scopy.scopy(paramInt1, paramArrayOfFloat2, paramInt3, 1, paramArrayOfFloat1, paramInt2, 1);
      f2 = paramfloatW.val;
      paramfloatW.val = Sasum.sasum(paramInt1, paramArrayOfFloat1, paramInt2, 1);
      i = 1;
      k = paramInt1 - 1 + 1;
      while ((Util.nint(Util.sign(1.0F, paramArrayOfFloat2[(i - 1 + paramInt3)])) == paramArrayOfInt1[(i - 1 + paramInt4)] ? 0 : 1) == 0)
      {
        i += 1;
        k--;
        if (k <= 0) {
          break label720;
        }
      }
      if ((paramfloatW.val > f2 ? 0 : 1) != 0) {
        break;
      }
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt3)] = Util.sign(1.0F, paramArrayOfFloat2[(i - 1 + paramInt3)]);
        paramArrayOfInt1[(i - 1 + paramInt4)] = Util.nint(paramArrayOfFloat2[(i - 1 + paramInt3)]);
        i += 1;
      }
      paramintW.val = 2;
      paramArrayOfInt2[(1 - 1 + paramInt5)] = 4;
      return;
      label600:
      j = paramArrayOfInt2[(2 - 1 + paramInt5)];
      paramArrayOfInt2[(2 - 1 + paramInt5)] = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt3, 1);
      if ((paramArrayOfFloat2[(j - 1 + paramInt3)] == Math.abs(paramArrayOfFloat2[(paramArrayOfInt2[(2 - 1 + paramInt5)] - 1 + paramInt3)]) ? 0 : 1) != 0) {}
      if (((paramArrayOfInt2[(3 - 1 + paramInt5)] >= 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        break;
      }
      paramArrayOfInt2[(3 - 1 + paramInt5)] += 1;
    }
    label720:
    f1 = 1.0F;
    i = 1;
    for (k = paramInt1 - 1 + 1; k > 0; k--)
    {
      paramArrayOfFloat2[(i - 1 + paramInt3)] = (f1 * (1.0F + (i - 1) / (paramInt1 - 1)));
      f1 = -f1;
      i += 1;
    }
    paramintW.val = 1;
    paramArrayOfInt2[(1 - 1 + paramInt5)] = 5;
    return;
    label796:
    f3 = 2.0F * (Sasum.sasum(paramInt1, paramArrayOfFloat2, paramInt3, 1) / (3 * paramInt1));
    if ((f3 <= paramfloatW.val ? 0 : 1) != 0)
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat2, paramInt3, 1, paramArrayOfFloat1, paramInt2, 1);
      paramfloatW.val = f3;
    }
    label850:
    paramintW.val = 0;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slacn2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */