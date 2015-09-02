package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaed0
{
  public static void dlaed0(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int[] paramArrayOfInt, int paramInt11, intW paramintW)
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
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    double d = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt1 != 1 ? 0 : 1) != 0) {}
      if (((paramInt2 >= Math.max(0, paramInt3) ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -2;
      } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -3;
      } else if ((paramInt7 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
        paramintW.val = -7;
      } else if ((paramInt9 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
        paramintW.val = -9;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLAED0", -paramintW.val);
      return;
    }
    if ((paramInt3 != 0 ? 0 : 1) != 0) {
      return;
    }
    i14 = Ilaenv.ilaenv(9, "DLAED0", " ", 0, 0, 0, 0);
    paramArrayOfInt[(1 - 1 + paramInt11)] = paramInt3;
    i19 = 1;
    i20 = 0;
    while ((paramArrayOfInt[(i19 - 1 + paramInt11)] <= i14 ? 0 : 1) != 0)
    {
      i9 = i19;
      for (i21 = (1 - i19 + -1) / -1; i21 > 0; i21--)
      {
        paramArrayOfInt[(2 * i9 - 1 + paramInt11)] = ((paramArrayOfInt[(i9 - 1 + paramInt11)] + 1) / 2);
        paramArrayOfInt[(2 * i9 - 1 - 1 + paramInt11)] = (paramArrayOfInt[(i9 - 1 + paramInt11)] / 2);
        i9 += -1;
      }
      i20 += 1;
      i19 = 2 * i19;
    }
    i9 = 2;
    for (int i21 = i19 - 2 + 1; i21 > 0; i21--)
    {
      paramArrayOfInt[(i9 - 1 + paramInt11)] += paramArrayOfInt[(i9 - 1 - 1 + paramInt11)];
      i9 += 1;
    }
    i16 = i19 - 1;
    m = 1;
    for (i21 = i16 - 1 + 1; i21 > 0; i21--)
    {
      i18 = paramArrayOfInt[(m - 1 + paramInt11)] + 1;
      i15 = i18 - 1;
      paramArrayOfDouble1[(i15 - 1 + paramInt4)] -= Math.abs(paramArrayOfDouble2[(i15 - 1 + paramInt5)]);
      paramArrayOfDouble1[(i18 - 1 + paramInt4)] -= Math.abs(paramArrayOfDouble2[(i15 - 1 + paramInt5)]);
      m += 1;
    }
    i3 = 4 * paramInt3 + 3;
    if ((paramInt1 == 2 ? 0 : 1) != 0)
    {
      d = Math.log(paramInt3) / Math.log(2.0D);
      i11 = (int)d;
      if (((int)Math.pow(2, i11) >= paramInt3 ? 0 : 1) != 0) {
        i11 += 1;
      }
      if (((int)Math.pow(2, i11) >= paramInt3 ? 0 : 1) != 0) {
        i11 += 1;
      }
      i5 = i3 + paramInt3 + 1;
      i4 = i5 + paramInt3 * i11;
      i7 = i4 + paramInt3 * i11;
      i2 = i7 + paramInt3 + 2;
      n = i2 + paramInt3 * i11;
      i1 = 1;
      i6 = i1 + 2 * paramInt3 * i11;
      i8 = i6 + (int)Math.pow(paramInt3, 2) + 1;
      m = 0;
      for (i21 = i19 - 0 + 1; i21 > 0; i21--)
      {
        paramArrayOfInt[(i5 + m - 1 + paramInt11)] = 1;
        paramArrayOfInt[(i2 + m - 1 + paramInt11)] = 1;
        m += 1;
      }
      paramArrayOfInt[(i7 - 1 + paramInt11)] = 1;
    }
    k = 0;
    m = 0;
    for (i21 = i16 - 0 + 1; i21 > 0; i21--)
    {
      if ((m != 0 ? 0 : 1) != 0)
      {
        i18 = 1;
        i12 = paramArrayOfInt[(1 - 1 + paramInt11)];
      }
      else
      {
        i18 = paramArrayOfInt[(m - 1 + paramInt11)] + 1;
        i12 = paramArrayOfInt[(m + 1 - 1 + paramInt11)] - paramArrayOfInt[(m - 1 + paramInt11)];
      }
      if ((paramInt1 != 2 ? 0 : 1) != 0)
      {
        Dsteqr.dsteqr("I", i12, paramArrayOfDouble1, i18 - 1 + paramInt4, paramArrayOfDouble2, i18 - 1 + paramInt5, paramArrayOfDouble3, i18 - 1 + (i18 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble5, paramInt10, paramintW);
        if ((paramintW.val == 0 ? 0 : 1) != 0) {
          break;
        }
      }
      else
      {
        Dsteqr.dsteqr("I", i12, paramArrayOfDouble1, i18 - 1 + paramInt4, paramArrayOfDouble2, i18 - 1 + paramInt5, paramArrayOfDouble5, i6 - 1 + paramArrayOfInt[(i7 + k - 1 + paramInt11)] - 1 + paramInt10, i12, paramArrayOfDouble5, paramInt10, paramintW);
        if ((paramintW.val == 0 ? 0 : 1) != 0) {
          break;
        }
        if ((paramInt1 != 1 ? 0 : 1) != 0) {
          Dgemm.dgemm("N", "N", paramInt2, i12, i12, 1.0D, paramArrayOfDouble3, 1 - 1 + (i18 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramArrayOfInt[(i7 + k - 1 + paramInt11)] - 1 + paramInt10, i12, 0.0D, paramArrayOfDouble4, 1 - 1 + (i18 - 1) * paramInt9 + paramInt8, paramInt9);
        }
        paramArrayOfInt[(i7 + k + 1 - 1 + paramInt11)] = (paramArrayOfInt[(i7 + k - 1 + paramInt11)] + (int)Math.pow(i12, 2));
        k += 1;
      }
      i10 = 1;
      i9 = i18;
      for (int i22 = paramArrayOfInt[(m + 1 - 1 + paramInt11)] - i18 + 1; i22 > 0; i22--)
      {
        paramArrayOfInt[(i3 + i9 - 1 + paramInt11)] = i10;
        i10 += 1;
        i9 += 1;
      }
      m += 1;
    }
    i = 1;
    while ((i19 <= 1 ? 0 : 1) != 0)
    {
      i17 = i19 - 2;
      m = 0;
      for (i21 = (i17 - 0 + 2) / 2; i21 > 0; i21--)
      {
        if ((m != 0 ? 0 : 1) != 0)
        {
          i18 = 1;
          i12 = paramArrayOfInt[(2 - 1 + paramInt11)];
          i13 = paramArrayOfInt[(1 - 1 + paramInt11)];
          j = 0;
        }
        else
        {
          i18 = paramArrayOfInt[(m - 1 + paramInt11)] + 1;
          i12 = paramArrayOfInt[(m + 2 - 1 + paramInt11)] - paramArrayOfInt[(m - 1 + paramInt11)];
          i13 = i12 / 2;
          j += 1;
        }
        if ((paramInt1 != 2 ? 0 : 1) != 0) {
          dlaed1_adapter(i12, paramArrayOfDouble1, i18 - 1 + paramInt4, paramArrayOfDouble3, i18 - 1 + (i18 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfInt, i3 + i18 - 1 + paramInt11, paramArrayOfDouble2, i18 + i13 - 1 - 1 + paramInt5, i13, paramArrayOfDouble5, paramInt10, paramArrayOfInt, i19 + 1 - 1 + paramInt11, paramintW);
        } else {
          dlaed7_adapter(paramInt1, i12, paramInt2, i20, i, j, paramArrayOfDouble1, i18 - 1 + paramInt4, paramArrayOfDouble4, 1 - 1 + (i18 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfInt, i3 + i18 - 1 + paramInt11, paramArrayOfDouble2, i18 + i13 - 1 - 1 + paramInt5, i13, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfInt, i7 - 1 + paramInt11, paramArrayOfInt, i5 - 1 + paramInt11, paramArrayOfInt, i4 - 1 + paramInt11, paramArrayOfInt, i2 - 1 + paramInt11, paramArrayOfInt, n - 1 + paramInt11, paramArrayOfDouble5, i1 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfInt, i19 + 1 - 1 + paramInt11, paramintW);
        }
        if ((paramintW.val == 0 ? 0 : 1) != 0) {
          break;
        }
        paramArrayOfInt[(m / 2 + 1 - 1 + paramInt11)] = paramArrayOfInt[(m + 2 - 1 + paramInt11)];
        m += 2;
      }
      i19 /= 2;
      i += 1;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      m = 1;
      for (i21 = paramInt3 - 1 + 1; i21 > 0; i21--)
      {
        i9 = paramArrayOfInt[(i3 + m - 1 + paramInt11)];
        paramArrayOfDouble5[(m - 1 + paramInt10)] = paramArrayOfDouble1[(i9 - 1 + paramInt4)];
        Dcopy.dcopy(paramInt2, paramArrayOfDouble4, 1 - 1 + (i9 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble3, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1);
        m += 1;
      }
      Dcopy.dcopy(paramInt3, paramArrayOfDouble5, paramInt10, 1, paramArrayOfDouble1, paramInt4, 1);
    }
    else if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      m = 1;
      for (i21 = paramInt3 - 1 + 1; i21 > 0; i21--)
      {
        i9 = paramArrayOfInt[(i3 + m - 1 + paramInt11)];
        paramArrayOfDouble5[(m - 1 + paramInt10)] = paramArrayOfDouble1[(i9 - 1 + paramInt4)];
        Dcopy.dcopy(paramInt3, paramArrayOfDouble3, 1 - 1 + (i9 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble5, paramInt3 * m + 1 - 1 + paramInt10, 1);
        m += 1;
      }
      Dcopy.dcopy(paramInt3, paramArrayOfDouble5, paramInt10, 1, paramArrayOfDouble1, paramInt4, 1);
      Dlacpy.dlacpy("A", paramInt3, paramInt3, paramArrayOfDouble5, paramInt3 + 1 - 1 + paramInt10, paramInt3, paramArrayOfDouble3, paramInt6, paramInt7);
    }
    else
    {
      m = 1;
      for (i21 = paramInt3 - 1 + 1; i21 > 0; i21--)
      {
        i9 = paramArrayOfInt[(i3 + m - 1 + paramInt11)];
        paramArrayOfDouble5[(m - 1 + paramInt10)] = paramArrayOfDouble1[(i9 - 1 + paramInt4)];
        m += 1;
      }
      Dcopy.dcopy(paramInt3, paramArrayOfDouble5, paramInt10, 1, paramArrayOfDouble1, paramInt4, 1);
    }
    return;
    paramintW.val = (i18 * (paramInt3 + 1) + i18 + i12 - 1);
  }
  
  private static void dlaed1_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int[] paramArrayOfInt2, int paramInt9, intW paramintW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble3[paramInt6]);
    Dlaed1.dlaed1(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, localdoubleW, paramInt7, paramArrayOfDouble4, paramInt8, paramArrayOfInt2, paramInt9, paramintW);
    paramArrayOfDouble3[paramInt6] = localdoubleW.val;
  }
  
  private static void dlaed7_adapter(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double[] paramArrayOfDouble1, int paramInt7, double[] paramArrayOfDouble2, int paramInt8, int paramInt9, int[] paramArrayOfInt1, int paramInt10, double[] paramArrayOfDouble3, int paramInt11, int paramInt12, double[] paramArrayOfDouble4, int paramInt13, int[] paramArrayOfInt2, int paramInt14, int[] paramArrayOfInt3, int paramInt15, int[] paramArrayOfInt4, int paramInt16, int[] paramArrayOfInt5, int paramInt17, int[] paramArrayOfInt6, int paramInt18, double[] paramArrayOfDouble5, int paramInt19, double[] paramArrayOfDouble6, int paramInt20, int[] paramArrayOfInt7, int paramInt21, intW paramintW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble3[paramInt11]);
    Dlaed7.dlaed7(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramArrayOfDouble1, paramInt7, paramArrayOfDouble2, paramInt8, paramInt9, paramArrayOfInt1, paramInt10, localdoubleW, paramInt12, paramArrayOfDouble4, paramInt13, paramArrayOfInt2, paramInt14, paramArrayOfInt3, paramInt15, paramArrayOfInt4, paramInt16, paramArrayOfInt5, paramInt17, paramArrayOfInt6, paramInt18, paramArrayOfDouble5, paramInt19, paramArrayOfDouble6, paramInt20, paramArrayOfInt7, paramInt21, paramintW);
    paramArrayOfDouble3[paramInt11] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaed0.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */