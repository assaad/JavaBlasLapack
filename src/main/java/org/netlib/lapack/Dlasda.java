package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasda
{
  public static void dlasda(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int[] paramArrayOfInt1, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, double[] paramArrayOfDouble6, int paramInt12, double[] paramArrayOfDouble7, int paramInt13, double[] paramArrayOfDouble8, int paramInt14, int[] paramArrayOfInt2, int paramInt15, int[] paramArrayOfInt3, int paramInt16, int paramInt17, int[] paramArrayOfInt4, int paramInt18, double[] paramArrayOfDouble9, int paramInt19, double[] paramArrayOfDouble10, int paramInt20, double[] paramArrayOfDouble11, int paramInt21, double[] paramArrayOfDouble12, int paramInt22, int[] paramArrayOfInt5, int paramInt23, intW paramintW)
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
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
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
      Xerbla.xerbla("DLASDA", -paramintW.val);
      return;
    }
    i10 = paramInt3 + paramInt4;
    if ((paramInt3 > paramInt2 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0) {
        Dlasdq.dlasdq("U", paramInt4, paramInt3, 0, 0, 0, paramArrayOfDouble1, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble4, paramInt9, paramInt8, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble12, paramInt22, paramintW);
      } else {
        Dlasdq.dlasdq("U", paramInt4, paramInt3, i10, paramInt3, 0, paramArrayOfDouble1, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble4, paramInt9, paramInt8, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble12, paramInt22, paramintW);
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
    Dlasdt.dlasdt(paramInt3, localintW2, localintW1, paramArrayOfInt5, i2 - 1 + paramInt23, paramArrayOfInt5, i13 - 1 + paramInt23, paramArrayOfInt5, i14 - 1 + paramInt23, paramInt2);
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
        Dlaset.dlaset("A", i17, i17, 0.0D, 1.0D, paramArrayOfDouble12, i22 - 1 + paramInt22, i24);
        Dlasdq.dlasdq("U", i25, i15, i17, i21, i11, paramArrayOfDouble1, i16 - 1 + paramInt5, paramArrayOfDouble2, i16 - 1 + paramInt6, paramArrayOfDouble12, i22 - 1 + paramInt22, i24, paramArrayOfDouble12, i23 - 1 + paramInt22, i15, paramArrayOfDouble12, i23 - 1 + paramInt22, i15, paramArrayOfDouble12, i23 - 1 + paramInt22, paramintW);
        i3 = i22 + i15 * i24;
        Dcopy.dcopy(i17, paramArrayOfDouble12, i22 - 1 + paramInt22, 1, paramArrayOfDouble12, i27 - 1 + paramInt22, 1);
        Dcopy.dcopy(i17, paramArrayOfDouble12, i3 - 1 + paramInt22, 1, paramArrayOfDouble12, i29 - 1 + paramInt22, 1);
      }
      else
      {
        Dlaset.dlaset("A", i15, i15, 0.0D, 1.0D, paramArrayOfDouble3, i16 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        Dlaset.dlaset("A", i17, i17, 0.0D, 1.0D, paramArrayOfDouble4, i16 - 1 + (1 - 1) * paramInt8 + paramInt9, paramInt8);
        Dlasdq.dlasdq("U", i25, i15, i17, i15, i11, paramArrayOfDouble1, i16 - 1 + paramInt5, paramArrayOfDouble2, i16 - 1 + paramInt6, paramArrayOfDouble4, i16 - 1 + (1 - 1) * paramInt8 + paramInt9, paramInt8, paramArrayOfDouble3, i16 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble3, i16 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble12, i22 - 1 + paramInt22, paramintW);
        Dcopy.dcopy(i17, paramArrayOfDouble4, i16 - 1 + (1 - 1) * paramInt8 + paramInt9, 1, paramArrayOfDouble12, i27 - 1 + paramInt22, 1);
        Dcopy.dcopy(i17, paramArrayOfDouble4, i16 - 1 + (i17 - 1) * paramInt8 + paramInt9, 1, paramArrayOfDouble12, i29 - 1 + paramInt22, 1);
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
        Dlaset.dlaset("A", i20, i20, 0.0D, 1.0D, paramArrayOfDouble12, i22 - 1 + paramInt22, i24);
        Dlasdq.dlasdq("U", i25, i18, i20, i21, i11, paramArrayOfDouble1, i19 - 1 + paramInt5, paramArrayOfDouble2, i19 - 1 + paramInt6, paramArrayOfDouble12, i22 - 1 + paramInt22, i24, paramArrayOfDouble12, i23 - 1 + paramInt22, i18, paramArrayOfDouble12, i23 - 1 + paramInt22, i18, paramArrayOfDouble12, i23 - 1 + paramInt22, paramintW);
        i3 = i22 + (i20 - 1) * i24;
        Dcopy.dcopy(i20, paramArrayOfDouble12, i22 - 1 + paramInt22, 1, paramArrayOfDouble12, i27 - 1 + paramInt22, 1);
        Dcopy.dcopy(i20, paramArrayOfDouble12, i3 - 1 + paramInt22, 1, paramArrayOfDouble12, i29 - 1 + paramInt22, 1);
      }
      else
      {
        Dlaset.dlaset("A", i18, i18, 0.0D, 1.0D, paramArrayOfDouble3, i19 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        Dlaset.dlaset("A", i20, i20, 0.0D, 1.0D, paramArrayOfDouble4, i19 - 1 + (1 - 1) * paramInt8 + paramInt9, paramInt8);
        Dlasdq.dlasdq("U", i25, i18, i20, i18, i11, paramArrayOfDouble1, i19 - 1 + paramInt5, paramArrayOfDouble2, i19 - 1 + paramInt6, paramArrayOfDouble4, i19 - 1 + (1 - 1) * paramInt8 + paramInt9, paramInt8, paramArrayOfDouble3, i19 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble3, i19 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble12, i22 - 1 + paramInt22, paramintW);
        Dcopy.dcopy(i20, paramArrayOfDouble4, i19 - 1 + (1 - 1) * paramInt8 + paramInt9, 1, paramArrayOfDouble12, i27 - 1 + paramInt22, 1);
        Dcopy.dcopy(i20, paramArrayOfDouble4, i19 - 1 + (i20 - 1) * paramInt8 + paramInt9, 1, paramArrayOfDouble12, i29 - 1 + paramInt22, 1);
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
        localdoubleW1.val = paramArrayOfDouble1[(k - 1 + paramInt5)];
        localdoubleW2.val = paramArrayOfDouble2[(k - 1 + paramInt6)];
        if ((paramInt1 != 0 ? 0 : 1) != 0)
        {
          dlasd6_adapter(paramInt1, i15, i18, i25, paramArrayOfDouble1, i16 - 1 + paramInt5, paramArrayOfDouble12, i27 - 1 + paramInt22, paramArrayOfDouble12, i29 - 1 + paramInt22, localdoubleW1, localdoubleW2, paramArrayOfInt5, n - 1 + paramInt23, paramArrayOfInt4, paramInt18, paramArrayOfInt2, 1 - 1 + paramInt15, paramArrayOfInt3, paramInt16, paramInt17, paramArrayOfDouble9, paramInt19, paramInt8, paramArrayOfDouble8, paramInt14, paramArrayOfDouble5, paramInt11, paramArrayOfDouble6, paramInt12, paramArrayOfDouble7, paramInt13, paramArrayOfInt1, 1 - 1 + paramInt10, paramArrayOfDouble10, 1 - 1 + paramInt20, paramArrayOfDouble11, 1 - 1 + paramInt21, paramArrayOfDouble12, i22 - 1 + paramInt22, paramArrayOfInt5, i4 - 1 + paramInt23, paramintW);
        }
        else
        {
          i5 -= 1;
          dlasd6_adapter(paramInt1, i15, i18, i25, paramArrayOfDouble1, i16 - 1 + paramInt5, paramArrayOfDouble12, i27 - 1 + paramInt22, paramArrayOfDouble12, i29 - 1 + paramInt22, localdoubleW1, localdoubleW2, paramArrayOfInt5, n - 1 + paramInt23, paramArrayOfInt4, i16 - 1 + (i8 - 1) * paramInt17 + paramInt18, paramArrayOfInt2, i5 - 1 + paramInt15, paramArrayOfInt3, i16 - 1 + (i9 - 1) * paramInt17 + paramInt16, paramInt17, paramArrayOfDouble9, i16 - 1 + (i9 - 1) * paramInt8 + paramInt19, paramInt8, paramArrayOfDouble8, i16 - 1 + (i9 - 1) * paramInt8 + paramInt14, paramArrayOfDouble5, i16 - 1 + (i8 - 1) * paramInt8 + paramInt11, paramArrayOfDouble6, i16 - 1 + (i9 - 1) * paramInt8 + paramInt12, paramArrayOfDouble7, i16 - 1 + (i8 - 1) * paramInt8 + paramInt13, paramArrayOfInt1, i5 - 1 + paramInt10, paramArrayOfDouble10, i5 - 1 + paramInt20, paramArrayOfDouble11, i5 - 1 + paramInt21, paramArrayOfDouble12, i22 - 1 + paramInt22, paramArrayOfInt5, i4 - 1 + paramInt23, paramintW);
        }
        if ((paramintW.val == 0 ? 0 : 1) != 0) {
          return;
        }
        i += 1;
      }
      i8 += -1;
    }
  }
  
  private static void dlasd6_adapter(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, doubleW paramdoubleW1, doubleW paramdoubleW2, int[] paramArrayOfInt1, int paramInt8, int[] paramArrayOfInt2, int paramInt9, int[] paramArrayOfInt3, int paramInt10, int[] paramArrayOfInt4, int paramInt11, int paramInt12, double[] paramArrayOfDouble4, int paramInt13, int paramInt14, double[] paramArrayOfDouble5, int paramInt15, double[] paramArrayOfDouble6, int paramInt16, double[] paramArrayOfDouble7, int paramInt17, double[] paramArrayOfDouble8, int paramInt18, int[] paramArrayOfInt5, int paramInt19, double[] paramArrayOfDouble9, int paramInt20, double[] paramArrayOfDouble10, int paramInt21, double[] paramArrayOfDouble11, int paramInt22, int[] paramArrayOfInt6, int paramInt23, intW paramintW)
  {
    intW localintW1 = new intW(paramArrayOfInt3[paramInt10]);
    intW localintW2 = new intW(paramArrayOfInt5[paramInt19]);
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble9[paramInt20]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble10[paramInt21]);
    Dlasd6.dlasd6(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfDouble1, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramdoubleW1, paramdoubleW2, paramArrayOfInt1, paramInt8, paramArrayOfInt2, paramInt9, localintW1, paramArrayOfInt4, paramInt11, paramInt12, paramArrayOfDouble4, paramInt13, paramInt14, paramArrayOfDouble5, paramInt15, paramArrayOfDouble6, paramInt16, paramArrayOfDouble7, paramInt17, paramArrayOfDouble8, paramInt18, localintW2, localdoubleW1, localdoubleW2, paramArrayOfDouble11, paramInt22, paramArrayOfInt6, paramInt23, paramintW);
    paramArrayOfInt3[paramInt10] = localintW1.val;
    paramArrayOfInt5[paramInt19] = localintW2.val;
    paramArrayOfDouble9[paramInt20] = localdoubleW1.val;
    paramArrayOfDouble10[paramInt21] = localdoubleW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasda.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */