package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dlalsa
{
  public static void dlalsa(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, int paramInt6, double[] paramArrayOfDouble2, int paramInt7, int paramInt8, double[] paramArrayOfDouble3, int paramInt9, int paramInt10, double[] paramArrayOfDouble4, int paramInt11, int[] paramArrayOfInt1, int paramInt12, double[] paramArrayOfDouble5, int paramInt13, double[] paramArrayOfDouble6, int paramInt14, double[] paramArrayOfDouble7, int paramInt15, double[] paramArrayOfDouble8, int paramInt16, int[] paramArrayOfInt2, int paramInt17, int[] paramArrayOfInt3, int paramInt18, int paramInt19, int[] paramArrayOfInt4, int paramInt20, double[] paramArrayOfDouble9, int paramInt21, double[] paramArrayOfDouble10, int paramInt22, double[] paramArrayOfDouble11, int paramInt23, double[] paramArrayOfDouble12, int paramInt24, int[] paramArrayOfInt5, int paramInt25, intW paramintW)
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
    intW localintW1 = new intW(0);
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    intW localintW2 = new intW(0);
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 3 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= paramInt2 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= 1 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt6 >= paramInt3 ? 0 : 1) != 0) {
      paramintW.val = -6;
    } else if ((paramInt8 >= paramInt3 ? 0 : 1) != 0) {
      paramintW.val = -8;
    } else if ((paramInt10 >= paramInt3 ? 0 : 1) != 0) {
      paramintW.val = -10;
    } else if ((paramInt19 >= paramInt3 ? 0 : 1) != 0) {
      paramintW.val = -19;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLALSA", -paramintW.val);
      return;
    }
    n = 1;
    i7 = n + paramInt3;
    i8 = i7 + paramInt3;
    Dlasdt.dlasdt(paramInt3, localintW2, localintW1, paramArrayOfInt5, n - 1 + paramInt25, paramArrayOfInt5, i7 - 1 + paramInt25, paramArrayOfInt5, i8 - 1 + paramInt25, paramInt2);
    int i16;
    int i17;
    if ((paramInt1 != 1 ? 0 : 1) == 0)
    {
      i6 = (localintW1.val + 1) / 2;
      i = i6;
      for (i16 = localintW1.val - i6 + 1; i16 > 0; i16--)
      {
        j = i - 1;
        k = paramArrayOfInt5[(n + j - 1 + paramInt25)];
        i9 = paramArrayOfInt5[(i7 + j - 1 + paramInt25)];
        i12 = paramArrayOfInt5[(i8 + j - 1 + paramInt25)];
        i10 = k - i9;
        i13 = k + 1;
        Dgemm.dgemm("T", "N", i9, paramInt4, i9, 1.0D, paramArrayOfDouble3, i10 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble1, i10 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 0.0D, paramArrayOfDouble2, i10 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        Dgemm.dgemm("T", "N", i12, paramInt4, i12, 1.0D, paramArrayOfDouble3, i13 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble1, i13 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 0.0D, paramArrayOfDouble2, i13 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        i += 1;
      }
      i = 1;
      for (i16 = localintW1.val - 1 + 1; i16 > 0; i16--)
      {
        k = paramArrayOfInt5[(n + i - 1 - 1 + paramInt25)];
        Dcopy.dcopy(paramInt4, paramArrayOfDouble1, k - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, k - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        i += 1;
      }
      i1 = (int)Math.pow(2, localintW2.val);
      i15 = 0;
      i4 = localintW2.val;
      for (i16 = (1 - localintW2.val + -1) / -1; i16 > 0; i16--)
      {
        i5 = 2 * i4 - 1;
        if ((i4 != 1 ? 0 : 1) != 0)
        {
          i2 = 1;
          i3 = 1;
        }
        else
        {
          i2 = (int)Math.pow(2, i4 - 1);
          i3 = 2 * i2 - 1;
        }
        i = i2;
        for (i17 = i3 - i2 + 1; i17 > 0; i17--)
        {
          m = i - 1;
          k = paramArrayOfInt5[(n + m - 1 + paramInt25)];
          i9 = paramArrayOfInt5[(i7 + m - 1 + paramInt25)];
          i12 = paramArrayOfInt5[(i8 + m - 1 + paramInt25)];
          i10 = k - i9;
          i13 = k + 1;
          i1 -= 1;
          Dlals0.dlals0(paramInt1, i9, i12, i15, paramInt4, paramArrayOfDouble2, i10 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble1, i10 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfInt4, i10 - 1 + (i4 - 1) * paramInt19 + paramInt20, paramArrayOfInt2[(i1 - 1 + paramInt17)], paramArrayOfInt3, i10 - 1 + (i5 - 1) * paramInt19 + paramInt18, paramInt19, paramArrayOfDouble9, i10 - 1 + (i5 - 1) * paramInt10 + paramInt21, paramInt10, paramArrayOfDouble8, i10 - 1 + (i5 - 1) * paramInt10 + paramInt16, paramArrayOfDouble5, i10 - 1 + (i4 - 1) * paramInt10 + paramInt13, paramArrayOfDouble6, i10 - 1 + (i5 - 1) * paramInt10 + paramInt14, paramArrayOfDouble7, i10 - 1 + (i4 - 1) * paramInt10 + paramInt15, paramArrayOfInt1[(i1 - 1 + paramInt12)], paramArrayOfDouble10[(i1 - 1 + paramInt22)], paramArrayOfDouble11[(i1 - 1 + paramInt23)], paramArrayOfDouble12, paramInt24, paramintW);
          i += 1;
        }
        i4 += -1;
      }
    }
    else
    {
      i1 = 0;
      i4 = 1;
      for (i16 = localintW2.val - 1 + 1; i16 > 0; i16--)
      {
        i5 = 2 * i4 - 1;
        if ((i4 != 1 ? 0 : 1) != 0)
        {
          i2 = 1;
          i3 = 1;
        }
        else
        {
          i2 = (int)Math.pow(2, i4 - 1);
          i3 = 2 * i2 - 1;
        }
        i = i3;
        for (i17 = (i2 - i3 + -1) / -1; i17 > 0; i17--)
        {
          m = i - 1;
          k = paramArrayOfInt5[(n + m - 1 + paramInt25)];
          i9 = paramArrayOfInt5[(i7 + m - 1 + paramInt25)];
          i12 = paramArrayOfInt5[(i8 + m - 1 + paramInt25)];
          i10 = k - i9;
          i13 = k + 1;
          if ((i != i3 ? 0 : 1) != 0) {
            i15 = 0;
          } else {
            i15 = 1;
          }
          i1 += 1;
          Dlals0.dlals0(paramInt1, i9, i12, i15, paramInt4, paramArrayOfDouble1, i10 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, i10 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfInt4, i10 - 1 + (i4 - 1) * paramInt19 + paramInt20, paramArrayOfInt2[(i1 - 1 + paramInt17)], paramArrayOfInt3, i10 - 1 + (i5 - 1) * paramInt19 + paramInt18, paramInt19, paramArrayOfDouble9, i10 - 1 + (i5 - 1) * paramInt10 + paramInt21, paramInt10, paramArrayOfDouble8, i10 - 1 + (i5 - 1) * paramInt10 + paramInt16, paramArrayOfDouble5, i10 - 1 + (i4 - 1) * paramInt10 + paramInt13, paramArrayOfDouble6, i10 - 1 + (i5 - 1) * paramInt10 + paramInt14, paramArrayOfDouble7, i10 - 1 + (i4 - 1) * paramInt10 + paramInt15, paramArrayOfInt1[(i1 - 1 + paramInt12)], paramArrayOfDouble10[(i1 - 1 + paramInt22)], paramArrayOfDouble11[(i1 - 1 + paramInt23)], paramArrayOfDouble12, paramInt24, paramintW);
          i += -1;
        }
        i4 += 1;
      }
      i6 = (localintW1.val + 1) / 2;
      i = i6;
      for (i16 = localintW1.val - i6 + 1; i16 > 0; i16--)
      {
        j = i - 1;
        k = paramArrayOfInt5[(n + j - 1 + paramInt25)];
        i9 = paramArrayOfInt5[(i7 + j - 1 + paramInt25)];
        i12 = paramArrayOfInt5[(i8 + j - 1 + paramInt25)];
        i11 = i9 + 1;
        if ((i != localintW1.val ? 0 : 1) != 0) {
          i14 = i12;
        } else {
          i14 = i12 + 1;
        }
        i10 = k - i9;
        i13 = k + 1;
        Dgemm.dgemm("T", "N", i11, paramInt4, i11, 1.0D, paramArrayOfDouble4, i10 - 1 + (1 - 1) * paramInt10 + paramInt11, paramInt10, paramArrayOfDouble1, i10 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 0.0D, paramArrayOfDouble2, i10 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        Dgemm.dgemm("T", "N", i14, paramInt4, i14, 1.0D, paramArrayOfDouble4, i13 - 1 + (1 - 1) * paramInt10 + paramInt11, paramInt10, paramArrayOfDouble1, i13 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 0.0D, paramArrayOfDouble2, i13 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlalsa.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */