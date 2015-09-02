package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasd6
{
  public static void slasd6(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, floatW paramfloatW1, floatW paramfloatW2, int[] paramArrayOfInt1, int paramInt8, int[] paramArrayOfInt2, int paramInt9, intW paramintW1, int[] paramArrayOfInt3, int paramInt10, int paramInt11, float[] paramArrayOfFloat4, int paramInt12, int paramInt13, float[] paramArrayOfFloat5, int paramInt14, float[] paramArrayOfFloat6, int paramInt15, float[] paramArrayOfFloat7, int paramInt16, float[] paramArrayOfFloat8, int paramInt17, intW paramintW2, floatW paramfloatW3, floatW paramfloatW4, float[] paramArrayOfFloat9, int paramInt18, int[] paramArrayOfInt4, int paramInt19, intW paramintW3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    float f = 0.0F;
    paramintW3.val = 0;
    i5 = paramInt2 + paramInt3 + 1;
    i4 = i5 + paramInt4;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((paramInt3 >= 1 ? 0 : 1) != 0)
    {
      paramintW3.val = -3;
    }
    else
    {
      if ((paramInt4 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt4 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW3.val = -4;
      } else if ((paramInt11 >= i5 ? 0 : 1) != 0) {
        paramintW3.val = -14;
      } else if ((paramInt13 >= i5 ? 0 : 1) != 0) {
        paramintW3.val = -16;
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLASD6", -paramintW3.val);
      return;
    }
    n = 1;
    i3 = n + i5;
    i1 = i3 + i4;
    i2 = i1 + i4;
    j = 1;
    k = j + i5;
    m = k + i5;
    f = Math.max(Math.abs(paramfloatW1.val), Math.abs(paramfloatW2.val));
    paramArrayOfFloat1[(paramInt2 + 1 - 1 + paramInt5)] = 0.0F;
    i = 1;
    for (int i8 = i5 - 1 + 1; i8 > 0; i8--)
    {
      if ((Math.abs(paramArrayOfFloat1[(i - 1 + paramInt5)]) <= f ? 0 : 1) != 0) {
        f = Math.abs(paramArrayOfFloat1[(i - 1 + paramInt5)]);
      }
      i += 1;
    }
    Slascl.slascl("G", 0, 0, f, 1.0F, i5, 1, paramArrayOfFloat1, paramInt5, i5, paramintW3);
    paramfloatW1.val /= f;
    paramfloatW2.val /= f;
    Slasd7.slasd7(paramInt1, paramInt2, paramInt3, paramInt4, paramintW2, paramArrayOfFloat1, paramInt5, paramArrayOfFloat8, paramInt17, paramArrayOfFloat9, i3 - 1 + paramInt18, paramArrayOfFloat2, paramInt6, paramArrayOfFloat9, i1 - 1 + paramInt18, paramArrayOfFloat3, paramInt7, paramArrayOfFloat9, i2 - 1 + paramInt18, paramfloatW1.val, paramfloatW2.val, paramArrayOfFloat9, n - 1 + paramInt18, paramArrayOfInt4, j - 1 + paramInt19, paramArrayOfInt4, m - 1 + paramInt19, paramArrayOfInt1, paramInt8, paramArrayOfInt2, paramInt9, paramintW1, paramArrayOfInt3, paramInt10, paramInt11, paramArrayOfFloat4, paramInt12, paramInt13, paramfloatW3, paramfloatW4, paramintW3);
    Slasd8.slasd8(paramInt1, paramintW2.val, paramArrayOfFloat1, paramInt5, paramArrayOfFloat8, paramInt17, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramArrayOfFloat6, paramInt15, paramArrayOfFloat7, paramInt16, paramInt13, paramArrayOfFloat9, n - 1 + paramInt18, paramArrayOfFloat9, i3 - 1 + paramInt18, paramintW3);
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      Scopy.scopy(paramintW2.val, paramArrayOfFloat1, paramInt5, 1, paramArrayOfFloat5, 1 - 1 + (1 - 1) * paramInt13 + paramInt14, 1);
      Scopy.scopy(paramintW2.val, paramArrayOfFloat9, n - 1 + paramInt18, 1, paramArrayOfFloat5, 1 - 1 + (2 - 1) * paramInt13 + paramInt14, 1);
    }
    Slascl.slascl("G", 0, 0, 1.0F, f, i5, 1, paramArrayOfFloat1, paramInt5, i5, paramintW3);
    i6 = paramintW2.val;
    i7 = i5 - paramintW2.val;
    Slamrg.slamrg(i6, i7, paramArrayOfFloat1, paramInt5, 1, -1, paramArrayOfInt1, paramInt8);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasd6.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */