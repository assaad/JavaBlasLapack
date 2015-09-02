package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasd1
{
  public static void slasd1(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, floatW paramfloatW1, floatW paramfloatW2, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, int[] paramArrayOfInt2, int paramInt10, float[] paramArrayOfFloat4, int paramInt11, intW paramintW)
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
    intW localintW = new intW(0);
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    float f = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -3;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLASD1", -paramintW.val);
      return;
    }
    i10 = paramInt1 + paramInt2 + 1;
    i9 = i10 + paramInt3;
    i7 = i10;
    i8 = i9;
    i5 = 1;
    i2 = i5 + i9;
    i3 = i2 + i10;
    i4 = i3 + i7 * i10;
    i1 = i4 + i8 * i9;
    k = 1;
    m = k + i10;
    i = m + i10;
    n = i + i10;
    f = Math.max(Math.abs(paramfloatW1.val), Math.abs(paramfloatW2.val));
    paramArrayOfFloat1[(paramInt1 + 1 - 1 + paramInt4)] = 0.0F;
    j = 1;
    for (int i13 = i10 - 1 + 1; i13 > 0; i13--)
    {
      if ((Math.abs(paramArrayOfFloat1[(j - 1 + paramInt4)]) <= f ? 0 : 1) != 0) {
        f = Math.abs(paramArrayOfFloat1[(j - 1 + paramInt4)]);
      }
      j += 1;
    }
    Slascl.slascl("G", 0, 0, f, 1.0F, i10, 1, paramArrayOfFloat1, paramInt4, i10, paramintW);
    paramfloatW1.val /= f;
    paramfloatW2.val /= f;
    Slasd2.slasd2(paramInt1, paramInt2, paramInt3, localintW, paramArrayOfFloat1, paramInt4, paramArrayOfFloat4, i5 - 1 + paramInt11, paramfloatW1.val, paramfloatW2.val, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat4, i2 - 1 + paramInt11, paramArrayOfFloat4, i3 - 1 + paramInt11, i7, paramArrayOfFloat4, i4 - 1 + paramInt11, i8, paramArrayOfInt2, n - 1 + paramInt10, paramArrayOfInt2, k - 1 + paramInt10, paramArrayOfInt2, m - 1 + paramInt10, paramArrayOfInt1, paramInt9, paramArrayOfInt2, i - 1 + paramInt10, paramintW);
    i6 = localintW.val;
    Slasd3.slasd3(paramInt1, paramInt2, paramInt3, localintW.val, paramArrayOfFloat1, paramInt4, paramArrayOfFloat4, i1 - 1 + paramInt11, i6, paramArrayOfFloat4, i2 - 1 + paramInt11, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat4, i3 - 1 + paramInt11, i7, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat4, i4 - 1 + paramInt11, i8, paramArrayOfInt2, m - 1 + paramInt10, paramArrayOfInt2, i - 1 + paramInt10, paramArrayOfFloat4, i5 - 1 + paramInt11, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) != 0) {
      return;
    }
    Slascl.slascl("G", 0, 0, 1.0F, f, i10, 1, paramArrayOfFloat1, paramInt4, i10, paramintW);
    i11 = localintW.val;
    i12 = i10 - localintW.val;
    Slamrg.slamrg(i11, i12, paramArrayOfFloat1, paramInt4, 1, -1, paramArrayOfInt1, paramInt9);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasd1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */