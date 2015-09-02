package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaed0
{
  public static void slaed0(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int[] paramArrayOfInt, int paramInt11, intW paramintW)
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
    float f = 0.0F;
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
      Xerbla.xerbla("SLAED0", -paramintW.val);
      return;
    }
    if ((paramInt3 != 0 ? 0 : 1) != 0) {
      return;
    }
    i14 = Ilaenv.ilaenv(9, "SLAED0", " ", 0, 0, 0, 0);
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
      paramArrayOfFloat1[(i15 - 1 + paramInt4)] -= Math.abs(paramArrayOfFloat2[(i15 - 1 + paramInt5)]);
      paramArrayOfFloat1[(i18 - 1 + paramInt4)] -= Math.abs(paramArrayOfFloat2[(i15 - 1 + paramInt5)]);
      m += 1;
    }
    i3 = 4 * paramInt3 + 3;
    if ((paramInt1 == 2 ? 0 : 1) != 0)
    {
      f = (float)Math.log(paramInt3) / (float)Math.log(2.0F);
      i11 = (int)f;
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
        Ssteqr.ssteqr("I", i12, paramArrayOfFloat1, i18 - 1 + paramInt4, paramArrayOfFloat2, i18 - 1 + paramInt5, paramArrayOfFloat3, i18 - 1 + (i18 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat5, paramInt10, paramintW);
        if ((paramintW.val == 0 ? 0 : 1) != 0) {
          break;
        }
      }
      else
      {
        Ssteqr.ssteqr("I", i12, paramArrayOfFloat1, i18 - 1 + paramInt4, paramArrayOfFloat2, i18 - 1 + paramInt5, paramArrayOfFloat5, i6 - 1 + paramArrayOfInt[(i7 + k - 1 + paramInt11)] - 1 + paramInt10, i12, paramArrayOfFloat5, paramInt10, paramintW);
        if ((paramintW.val == 0 ? 0 : 1) != 0) {
          break;
        }
        if ((paramInt1 != 1 ? 0 : 1) != 0) {
          Sgemm.sgemm("N", "N", paramInt2, i12, i12, 1.0F, paramArrayOfFloat3, 1 - 1 + (i18 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramArrayOfInt[(i7 + k - 1 + paramInt11)] - 1 + paramInt10, i12, 0.0F, paramArrayOfFloat4, 1 - 1 + (i18 - 1) * paramInt9 + paramInt8, paramInt9);
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
          slaed1_adapter(i12, paramArrayOfFloat1, i18 - 1 + paramInt4, paramArrayOfFloat3, i18 - 1 + (i18 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfInt, i3 + i18 - 1 + paramInt11, paramArrayOfFloat2, i18 + i13 - 1 - 1 + paramInt5, i13, paramArrayOfFloat5, paramInt10, paramArrayOfInt, i19 + 1 - 1 + paramInt11, paramintW);
        } else {
          slaed7_adapter(paramInt1, i12, paramInt2, i20, i, j, paramArrayOfFloat1, i18 - 1 + paramInt4, paramArrayOfFloat4, 1 - 1 + (i18 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfInt, i3 + i18 - 1 + paramInt11, paramArrayOfFloat2, i18 + i13 - 1 - 1 + paramInt5, i13, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfInt, i7 - 1 + paramInt11, paramArrayOfInt, i5 - 1 + paramInt11, paramArrayOfInt, i4 - 1 + paramInt11, paramArrayOfInt, i2 - 1 + paramInt11, paramArrayOfInt, n - 1 + paramInt11, paramArrayOfFloat5, i1 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfInt, i19 + 1 - 1 + paramInt11, paramintW);
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
        paramArrayOfFloat5[(m - 1 + paramInt10)] = paramArrayOfFloat1[(i9 - 1 + paramInt4)];
        Scopy.scopy(paramInt2, paramArrayOfFloat4, 1 - 1 + (i9 - 1) * paramInt9 + paramInt8, 1, paramArrayOfFloat3, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1);
        m += 1;
      }
      Scopy.scopy(paramInt3, paramArrayOfFloat5, paramInt10, 1, paramArrayOfFloat1, paramInt4, 1);
    }
    else if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      m = 1;
      for (i21 = paramInt3 - 1 + 1; i21 > 0; i21--)
      {
        i9 = paramArrayOfInt[(i3 + m - 1 + paramInt11)];
        paramArrayOfFloat5[(m - 1 + paramInt10)] = paramArrayOfFloat1[(i9 - 1 + paramInt4)];
        Scopy.scopy(paramInt3, paramArrayOfFloat3, 1 - 1 + (i9 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat5, paramInt3 * m + 1 - 1 + paramInt10, 1);
        m += 1;
      }
      Scopy.scopy(paramInt3, paramArrayOfFloat5, paramInt10, 1, paramArrayOfFloat1, paramInt4, 1);
      Slacpy.slacpy("A", paramInt3, paramInt3, paramArrayOfFloat5, paramInt3 + 1 - 1 + paramInt10, paramInt3, paramArrayOfFloat3, paramInt6, paramInt7);
    }
    else
    {
      m = 1;
      for (i21 = paramInt3 - 1 + 1; i21 > 0; i21--)
      {
        i9 = paramArrayOfInt[(i3 + m - 1 + paramInt11)];
        paramArrayOfFloat5[(m - 1 + paramInt10)] = paramArrayOfFloat1[(i9 - 1 + paramInt4)];
        m += 1;
      }
      Scopy.scopy(paramInt3, paramArrayOfFloat5, paramInt10, 1, paramArrayOfFloat1, paramInt4, 1);
    }
    return;
    paramintW.val = (i18 * (paramInt3 + 1) + i18 + i12 - 1);
  }
  
  private static void slaed1_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int[] paramArrayOfInt2, int paramInt9, intW paramintW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat3[paramInt6]);
    Slaed1.slaed1(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, localfloatW, paramInt7, paramArrayOfFloat4, paramInt8, paramArrayOfInt2, paramInt9, paramintW);
    paramArrayOfFloat3[paramInt6] = localfloatW.val;
  }
  
  private static void slaed7_adapter(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float[] paramArrayOfFloat1, int paramInt7, float[] paramArrayOfFloat2, int paramInt8, int paramInt9, int[] paramArrayOfInt1, int paramInt10, float[] paramArrayOfFloat3, int paramInt11, int paramInt12, float[] paramArrayOfFloat4, int paramInt13, int[] paramArrayOfInt2, int paramInt14, int[] paramArrayOfInt3, int paramInt15, int[] paramArrayOfInt4, int paramInt16, int[] paramArrayOfInt5, int paramInt17, int[] paramArrayOfInt6, int paramInt18, float[] paramArrayOfFloat5, int paramInt19, float[] paramArrayOfFloat6, int paramInt20, int[] paramArrayOfInt7, int paramInt21, intW paramintW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat3[paramInt11]);
    Slaed7.slaed7(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramArrayOfFloat1, paramInt7, paramArrayOfFloat2, paramInt8, paramInt9, paramArrayOfInt1, paramInt10, localfloatW, paramInt12, paramArrayOfFloat4, paramInt13, paramArrayOfInt2, paramInt14, paramArrayOfInt3, paramInt15, paramArrayOfInt4, paramInt16, paramArrayOfInt5, paramInt17, paramArrayOfInt6, paramInt18, paramArrayOfFloat5, paramInt19, paramArrayOfFloat6, paramInt20, paramArrayOfInt7, paramInt21, paramintW);
    paramArrayOfFloat3[paramInt11] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaed0.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */