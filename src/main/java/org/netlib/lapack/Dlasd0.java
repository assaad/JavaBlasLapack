package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasd0
{
  public static void dlasd0(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, int paramInt8, int paramInt9, int[] paramArrayOfInt, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, intW paramintW)
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
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    intW localintW1 = new intW(0);
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    intW localintW2 = new intW(0);
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt2 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt2 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -2;
      }
    }
    i9 = paramInt1 + paramInt2;
    if ((paramInt6 >= paramInt1 ? 0 : 1) != 0) {
      paramintW.val = -6;
    } else if ((paramInt8 >= i9 ? 0 : 1) != 0) {
      paramintW.val = -8;
    } else if ((paramInt9 >= 3 ? 0 : 1) != 0) {
      paramintW.val = -9;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLASD0", -paramintW.val);
      return;
    }
    if ((paramInt1 > paramInt9 ? 0 : 1) != 0)
    {
      Dlasdq.dlasdq("U", paramInt2, paramInt1, i9, paramInt1, 0, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble4, paramInt7, paramInt8, paramArrayOfDouble3, paramInt5, paramInt6, paramArrayOfDouble3, paramInt5, paramInt6, paramArrayOfDouble5, paramInt11, paramintW);
      return;
    }
    i2 = 1;
    i12 = i2 + paramInt1;
    i13 = i12 + paramInt1;
    m = i13 + paramInt1;
    i4 = m + paramInt1;
    Dlasdt.dlasdt(paramInt1, localintW2, localintW1, paramArrayOfInt, i2 - 1 + paramInt10, paramArrayOfInt, i12 - 1 + paramInt10, paramArrayOfInt, i13 - 1 + paramInt10, paramInt9);
    i11 = (localintW1.val + 1) / 2;
    i10 = 0;
    i = i11;
    int i22;
    for (int i21 = localintW1.val - i11 + 1; i21 > 0; i21--)
    {
      j = i - 1;
      k = paramArrayOfInt[(i2 + j - 1 + paramInt10)];
      i14 = paramArrayOfInt[(i12 + j - 1 + paramInt10)];
      i16 = i14 + 1;
      i17 = paramArrayOfInt[(i13 + j - 1 + paramInt10)];
      i19 = i17 + 1;
      i15 = k - i14;
      i18 = k + 1;
      i20 = 1;
      Dlasdq.dlasdq("U", i20, i14, i16, i14, i10, paramArrayOfDouble1, i15 - 1 + paramInt3, paramArrayOfDouble2, i15 - 1 + paramInt4, paramArrayOfDouble4, i15 - 1 + (i15 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble3, i15 - 1 + (i15 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble3, i15 - 1 + (i15 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble5, paramInt11, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        return;
      }
      i3 = m + i15 - 2;
      i5 = 1;
      for (i22 = i14 - 1 + 1; i22 > 0; i22--)
      {
        paramArrayOfInt[(i3 + i5 - 1 + paramInt10)] = i5;
        i5 += 1;
      }
      if ((i != localintW1.val ? 0 : 1) != 0) {
        i20 = paramInt2;
      } else {
        i20 = 1;
      }
      i19 = i17 + i20;
      Dlasdq.dlasdq("U", i20, i17, i19, i17, i10, paramArrayOfDouble1, i18 - 1 + paramInt3, paramArrayOfDouble2, i18 - 1 + paramInt4, paramArrayOfDouble4, i18 - 1 + (i18 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble3, i18 - 1 + (i18 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble3, i18 - 1 + (i18 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble5, paramInt11, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        return;
      }
      i3 = m + k;
      i5 = 1;
      for (i22 = i17 - 1 + 1; i22 > 0; i22--)
      {
        paramArrayOfInt[(i3 + i5 - 1 - 1 + paramInt10)] = i5;
        i5 += 1;
      }
      i += 1;
    }
    i8 = localintW2.val;
    for (i21 = (1 - localintW2.val + -1) / -1; i21 > 0; i21--)
    {
      if ((i8 != 1 ? 0 : 1) != 0)
      {
        i6 = 1;
        i7 = 1;
      }
      else
      {
        i6 = (int)Math.pow(2, i8 - 1);
        i7 = 2 * i6 - 1;
      }
      i = i6;
      for (i22 = i7 - i6 + 1; i22 > 0; i22--)
      {
        i1 = i - 1;
        k = paramArrayOfInt[(i2 + i1 - 1 + paramInt10)];
        i14 = paramArrayOfInt[(i12 + i1 - 1 + paramInt10)];
        i17 = paramArrayOfInt[(i13 + i1 - 1 + paramInt10)];
        i15 = k - i14;
        if ((paramInt2 != 0 ? 0 : 1) != 0) {}
        if (((i != i7 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          i20 = paramInt2;
        } else {
          i20 = 1;
        }
        n = m + i15 - 1;
        localdoubleW1.val = paramArrayOfDouble1[(k - 1 + paramInt3)];
        localdoubleW2.val = paramArrayOfDouble2[(k - 1 + paramInt4)];
        Dlasd1.dlasd1(i14, i17, i20, paramArrayOfDouble1, i15 - 1 + paramInt3, localdoubleW1, localdoubleW2, paramArrayOfDouble3, i15 - 1 + (i15 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble4, i15 - 1 + (i15 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfInt, n - 1 + paramInt10, paramArrayOfInt, i4 - 1 + paramInt10, paramArrayOfDouble5, paramInt11, paramintW);
        if ((paramintW.val == 0 ? 0 : 1) != 0) {
          return;
        }
        i += 1;
      }
      i8 += -1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasd0.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */