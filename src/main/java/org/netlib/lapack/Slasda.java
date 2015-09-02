package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasda
{
  public static void slasda(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, int[] paramArrayOfInt1, int paramInt10, float[] paramArrayOfFloat5, int paramInt11, float[] paramArrayOfFloat6, int paramInt12, float[] paramArrayOfFloat7, int paramInt13, float[] paramArrayOfFloat8, int paramInt14, int[] paramArrayOfInt2, int paramInt15, int[] paramArrayOfInt3, int paramInt16, int paramInt17, int[] paramArrayOfInt4, int paramInt18, float[] paramArrayOfFloat9, int paramInt19, float[] paramArrayOfFloat10, int paramInt20, float[] paramArrayOfFloat11, int paramInt21, float[] paramArrayOfFloat12, int paramInt22, int[] paramArrayOfInt5, int paramInt23, intW paramintW)
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
    int i11 = 0;
    intW localintW1 = new intW(0);
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    intW localintW2 = new intW(0);
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    int i21 = 0;
    int i22 = 0;
    int i23 = 0;
    int i24 = 0;
    int i25 = 0;
    int i26 = 0;
    int i27 = 0;
    int i28 = 0;
    int i29 = 0;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= 3 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt4 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt4 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -4;
      } else if ((paramInt8 >= paramInt3 + paramInt4 ? 0 : 1) != 0) {
        paramintW.val = -8;
      } else if ((paramInt17 >= paramInt3 ? 0 : 1) != 0) {
        paramintW.val = -17;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLASDA", -paramintW.val);
      return;
    }
    i10 = paramInt3 + paramInt4;
    if ((paramInt3 > paramInt2 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0) {
        Slasdq.slasdq("U", paramInt4, paramInt3, 0, 0, 0, paramArrayOfFloat1, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat4, paramInt9, paramInt8, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat12, paramInt22, paramintW);
      } else {
        Slasdq.slasdq("U", paramInt4, paramInt3, i10, paramInt3, 0, paramArrayOfFloat1, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat4, paramInt9, paramInt8, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat12, paramInt22, paramintW);
      }
      return;
    }
    i2 = 1;
    i13 = i2 + paramInt3;
    i14 = i13 + paramInt3;
    m = i14 + paramInt3;
    i4 = m + paramInt3;
    i11 = 0;
    i21 = 0;
    i24 = paramInt2 + 1;
    i26 = 1;
    i28 = i26 + i10;
    i22 = i28 + i10;
    i23 = i22 + i24 * i24;
    Slasdt.slasdt(paramInt3, localintW2, localintW1, paramArrayOfInt5, i2 - 1 + paramInt23, paramArrayOfInt5, i13 - 1 + paramInt23, paramArrayOfInt5, i14 - 1 + paramInt23, paramInt2);
    i12 = (localintW1.val + 1) / 2;
    i = i12;
    int i31;
    for (int i30 = localintW1.val - i12 + 1; i30 > 0; i30--)
    {
      j = i - 1;
      k = paramArrayOfInt5[(i2 + j - 1 + paramInt23)];
      i15 = paramArrayOfInt5[(i13 + j - 1 + paramInt23)];
      i17 = i15 + 1;
      i18 = paramArrayOfInt5[(i14 + j - 1 + paramInt23)];
      i16 = k - i15;
      i19 = k + 1;
      n = m + i16 - 2;
      i27 = i26 + i16 - 1;
      i29 = i28 + i16 - 1;
      i25 = 1;
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        Slaset.slaset("A", i17, i17, 0.0F, 1.0F, paramArrayOfFloat12, i22 - 1 + paramInt22, i24);
        Slasdq.slasdq("U", i25, i15, i17, i21, i11, paramArrayOfFloat1, i16 - 1 + paramInt5, paramArrayOfFloat2, i16 - 1 + paramInt6, paramArrayOfFloat12, i22 - 1 + paramInt22, i24, paramArrayOfFloat12, i23 - 1 + paramInt22, i15, paramArrayOfFloat12, i23 - 1 + paramInt22, i15, paramArrayOfFloat12, i23 - 1 + paramInt22, paramintW);
        i3 = i22 + i15 * i24;
        Scopy.scopy(i17, paramArrayOfFloat12, i22 - 1 + paramInt22, 1, paramArrayOfFloat12, i27 - 1 + paramInt22, 1);
        Scopy.scopy(i17, paramArrayOfFloat12, i3 - 1 + paramInt22, 1, paramArrayOfFloat12, i29 - 1 + paramInt22, 1);
      }
      else
      {
        Slaset.slaset("A", i15, i15, 0.0F, 1.0F, paramArrayOfFloat3, i16 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        Slaset.slaset("A", i17, i17, 0.0F, 1.0F, paramArrayOfFloat4, i16 - 1 + (1 - 1) * paramInt8 + paramInt9, paramInt8);
        Slasdq.slasdq("U", i25, i15, i17, i15, i11, paramArrayOfFloat1, i16 - 1 + paramInt5, paramArrayOfFloat2, i16 - 1 + paramInt6, paramArrayOfFloat4, i16 - 1 + (1 - 1) * paramInt8 + paramInt9, paramInt8, paramArrayOfFloat3, i16 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat3, i16 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat12, i22 - 1 + paramInt22, paramintW);
        Scopy.scopy(i17, paramArrayOfFloat4, i16 - 1 + (1 - 1) * paramInt8 + paramInt9, 1, paramArrayOfFloat12, i27 - 1 + paramInt22, 1);
        Scopy.scopy(i17, paramArrayOfFloat4, i16 - 1 + (i17 - 1) * paramInt8 + paramInt9, 1, paramArrayOfFloat12, i29 - 1 + paramInt22, 1);
      }
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        return;
      }
      i5 = 1;
      for (i31 = i15 - 1 + 1; i31 > 0; i31--)
      {
        paramArrayOfInt5[(n + i5 - 1 + paramInt23)] = i5;
        i5 += 1;
      }
      if ((i != localintW1.val ? 0 : 1) != 0) {}
      if (((paramInt4 != 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        i25 = 0;
      } else {
        i25 = 1;
      }
      n += i17;
      i27 += i17;
      i29 += i17;
      i20 = i18 + i25;
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        Slaset.slaset("A", i20, i20, 0.0F, 1.0F, paramArrayOfFloat12, i22 - 1 + paramInt22, i24);
        Slasdq.slasdq("U", i25, i18, i20, i21, i11, paramArrayOfFloat1, i19 - 1 + paramInt5, paramArrayOfFloat2, i19 - 1 + paramInt6, paramArrayOfFloat12, i22 - 1 + paramInt22, i24, paramArrayOfFloat12, i23 - 1 + paramInt22, i18, paramArrayOfFloat12, i23 - 1 + paramInt22, i18, paramArrayOfFloat12, i23 - 1 + paramInt22, paramintW);
        i3 = i22 + (i20 - 1) * i24;
        Scopy.scopy(i20, paramArrayOfFloat12, i22 - 1 + paramInt22, 1, paramArrayOfFloat12, i27 - 1 + paramInt22, 1);
        Scopy.scopy(i20, paramArrayOfFloat12, i3 - 1 + paramInt22, 1, paramArrayOfFloat12, i29 - 1 + paramInt22, 1);
      }
      else
      {
        Slaset.slaset("A", i18, i18, 0.0F, 1.0F, paramArrayOfFloat3, i19 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        Slaset.slaset("A", i20, i20, 0.0F, 1.0F, paramArrayOfFloat4, i19 - 1 + (1 - 1) * paramInt8 + paramInt9, paramInt8);
        Slasdq.slasdq("U", i25, i18, i20, i18, i11, paramArrayOfFloat1, i19 - 1 + paramInt5, paramArrayOfFloat2, i19 - 1 + paramInt6, paramArrayOfFloat4, i19 - 1 + (1 - 1) * paramInt8 + paramInt9, paramInt8, paramArrayOfFloat3, i19 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat3, i19 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat12, i22 - 1 + paramInt22, paramintW);
        Scopy.scopy(i20, paramArrayOfFloat4, i19 - 1 + (1 - 1) * paramInt8 + paramInt9, 1, paramArrayOfFloat12, i27 - 1 + paramInt22, 1);
        Scopy.scopy(i20, paramArrayOfFloat4, i19 - 1 + (i20 - 1) * paramInt8 + paramInt9, 1, paramArrayOfFloat12, i29 - 1 + paramInt22, 1);
      }
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        return;
      }
      i5 = 1;
      for (i31 = i18 - 1 + 1; i31 > 0; i31--)
      {
        paramArrayOfInt5[(n + i5 - 1 + paramInt23)] = i5;
        i5 += 1;
      }
      i += 1;
    }
    i5 = (int)Math.pow(2, localintW2.val);
    i8 = localintW2.val;
    for (i30 = (1 - localintW2.val + -1) / -1; i30 > 0; i30--)
    {
      i9 = i8 * 2 - 1;
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
      for (i31 = i7 - i6 + 1; i31 > 0; i31--)
      {
        i1 = i - 1;
        k = paramArrayOfInt5[(i2 + i1 - 1 + paramInt23)];
        i15 = paramArrayOfInt5[(i13 + i1 - 1 + paramInt23)];
        i18 = paramArrayOfInt5[(i14 + i1 - 1 + paramInt23)];
        i16 = k - i15;
        i19 = k + 1;
        if ((i != i7 ? 0 : 1) != 0) {
          i25 = paramInt4;
        } else {
          i25 = 1;
        }
        i27 = i26 + i16 - 1;
        i29 = i28 + i16 - 1;
        n = m + i16 - 1;
        localfloatW1.val = paramArrayOfFloat1[(k - 1 + paramInt5)];
        localfloatW2.val = paramArrayOfFloat2[(k - 1 + paramInt6)];
        if ((paramInt1 != 0 ? 0 : 1) != 0)
        {
          slasd6_adapter(paramInt1, i15, i18, i25, paramArrayOfFloat1, i16 - 1 + paramInt5, paramArrayOfFloat12, i27 - 1 + paramInt22, paramArrayOfFloat12, i29 - 1 + paramInt22, localfloatW1, localfloatW2, paramArrayOfInt5, n - 1 + paramInt23, paramArrayOfInt4, paramInt18, paramArrayOfInt2, 1 - 1 + paramInt15, paramArrayOfInt3, paramInt16, paramInt17, paramArrayOfFloat9, paramInt19, paramInt8, paramArrayOfFloat8, paramInt14, paramArrayOfFloat5, paramInt11, paramArrayOfFloat6, paramInt12, paramArrayOfFloat7, paramInt13, paramArrayOfInt1, 1 - 1 + paramInt10, paramArrayOfFloat10, 1 - 1 + paramInt20, paramArrayOfFloat11, 1 - 1 + paramInt21, paramArrayOfFloat12, i22 - 1 + paramInt22, paramArrayOfInt5, i4 - 1 + paramInt23, paramintW);
        }
        else
        {
          i5 -= 1;
          slasd6_adapter(paramInt1, i15, i18, i25, paramArrayOfFloat1, i16 - 1 + paramInt5, paramArrayOfFloat12, i27 - 1 + paramInt22, paramArrayOfFloat12, i29 - 1 + paramInt22, localfloatW1, localfloatW2, paramArrayOfInt5, n - 1 + paramInt23, paramArrayOfInt4, i16 - 1 + (i8 - 1) * paramInt17 + paramInt18, paramArrayOfInt2, i5 - 1 + paramInt15, paramArrayOfInt3, i16 - 1 + (i9 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfFloat9, i16 - 1 + (i9 - 1) * paramInt8 + paramInt19, paramInt8, paramArrayOfFloat8, i16 - 1 + (i9 - 1) * paramInt8 + paramInt14, paramArrayOfFloat5, i16 - 1 + (i8 - 1) * paramInt8 + paramInt11, paramArrayOfFloat6, i16 - 1 + (i9 - 1) * paramInt8 + paramInt12, paramArrayOfFloat7, i16 - 1 + (i8 - 1) * paramInt8 + paramInt13, paramArrayOfInt1, i5 - 1 + paramInt10, paramArrayOfFloat10, i5 - 1 + paramInt20, paramArrayOfFloat11, i5 - 1 + paramInt21, paramArrayOfFloat12, i22 - 1 + paramInt22, paramArrayOfInt5, i4 - 1 + paramInt23, paramintW);
        }
        if ((paramintW.val == 0 ? 0 : 1) != 0) {
          return;
        }
        i += 1;
      }
      i8 += -1;
    }
  }
  
  private static void slasd6_adapter(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, floatW paramfloatW1, floatW paramfloatW2, int[] paramArrayOfInt1, int paramInt8, int[] paramArrayOfInt2, int paramInt9, int[] paramArrayOfInt3, int paramInt10, int[] paramArrayOfInt4, int paramInt11, int paramInt12, float[] paramArrayOfFloat4, int paramInt13, int paramInt14, float[] paramArrayOfFloat5, int paramInt15, float[] paramArrayOfFloat6, int paramInt16, float[] paramArrayOfFloat7, int paramInt17, float[] paramArrayOfFloat8, int paramInt18, int[] paramArrayOfInt5, int paramInt19, float[] paramArrayOfFloat9, int paramInt20, float[] paramArrayOfFloat10, int paramInt21, float[] paramArrayOfFloat11, int paramInt22, int[] paramArrayOfInt6, int paramInt23, intW paramintW)
  {
    intW localintW1 = new intW(paramArrayOfInt3[paramInt10]);
    intW localintW2 = new intW(paramArrayOfInt5[paramInt19]);
    floatW localfloatW1 = new floatW(paramArrayOfFloat9[paramInt20]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat10[paramInt21]);
    Slasd6.slasd6(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfFloat1, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramfloatW1, paramfloatW2, paramArrayOfInt1, paramInt8, paramArrayOfInt2, paramInt9, localintW1, paramArrayOfInt4, paramInt11, paramInt12, paramArrayOfFloat4, paramInt13, paramInt14, paramArrayOfFloat5, paramInt15, paramArrayOfFloat6, paramInt16, paramArrayOfFloat7, paramInt17, paramArrayOfFloat8, paramInt18, localintW2, localfloatW1, localfloatW2, paramArrayOfFloat11, paramInt22, paramArrayOfInt6, paramInt23, paramintW);
    paramArrayOfInt3[paramInt10] = localintW1.val;
    paramArrayOfInt5[paramInt19] = localintW2.val;
    paramArrayOfFloat9[paramInt20] = localfloatW1.val;
    paramArrayOfFloat10[paramInt21] = localfloatW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasda.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */