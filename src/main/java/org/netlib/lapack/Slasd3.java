package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.blas.Snrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasd3
{
  public static void slasd3(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, int paramInt10, float[] paramArrayOfFloat5, int paramInt11, int paramInt12, float[] paramArrayOfFloat6, int paramInt13, int paramInt14, float[] paramArrayOfFloat7, int paramInt15, int paramInt16, int[] paramArrayOfInt1, int paramInt17, int[] paramArrayOfInt2, int paramInt18, float[] paramArrayOfFloat8, int paramInt19, intW paramintW)
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
    float f1 = 0.0F;
    float f2 = 0.0F;
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
      if ((paramInt3 == 1 ? 0 : 1) != 0) {}
      if (((paramInt3 == 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -3;
      }
    }
    i2 = paramInt1 + paramInt2 + 1;
    i1 = i2 + paramInt3;
    i3 = paramInt1 + 1;
    i4 = paramInt1 + 2;
    if ((paramInt4 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt4 <= i2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt7 >= paramInt4 ? 0 : 1) != 0) {
      paramintW.val = -7;
    } else if ((paramInt10 >= i2 ? 0 : 1) != 0) {
      paramintW.val = -10;
    } else if ((paramInt12 >= i2 ? 0 : 1) != 0) {
      paramintW.val = -12;
    } else if ((paramInt14 >= i1 ? 0 : 1) != 0) {
      paramintW.val = -14;
    } else if ((paramInt16 >= i1 ? 0 : 1) != 0) {
      paramintW.val = -16;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLASD3", -paramintW.val);
      return;
    }
    if ((paramInt4 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfFloat1[(1 - 1 + paramInt5)] = Math.abs(paramArrayOfFloat8[(1 - 1 + paramInt19)]);
      Scopy.scopy(i1, paramArrayOfFloat7, 1 - 1 + (1 - 1) * paramInt16 + paramInt15, paramInt16, paramArrayOfFloat6, 1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
      if ((paramArrayOfFloat8[(1 - 1 + paramInt19)] <= 0.0F ? 0 : 1) != 0)
      {
        Scopy.scopy(i2, paramArrayOfFloat5, 1 - 1 + (1 - 1) * paramInt12 + paramInt11, 1, paramArrayOfFloat4, 1 - 1 + (1 - 1) * paramInt10 + paramInt9, 1);
      }
      else
      {
        j = 1;
        for (i6 = i2 - 1 + 1; i6 > 0; i6--)
        {
          paramArrayOfFloat4[(j - 1 + (1 - 1) * paramInt10 + paramInt9)] = (-paramArrayOfFloat5[(j - 1 + (1 - 1) * paramInt12 + paramInt11)]);
          j += 1;
        }
      }
      return;
    }
    j = 1;
    for (int i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfFloat3[(j - 1 + paramInt8)] = (Slamc3.slamc3(paramArrayOfFloat3[(j - 1 + paramInt8)], paramArrayOfFloat3[(j - 1 + paramInt8)]) - paramArrayOfFloat3[(j - 1 + paramInt8)]);
      j += 1;
    }
    Scopy.scopy(paramInt4, paramArrayOfFloat8, paramInt19, 1, paramArrayOfFloat2, paramInt6, 1);
    f1 = Snrm2.snrm2(paramInt4, paramArrayOfFloat8, paramInt19, 1);
    Slascl.slascl("G", 0, 0, f1, 1.0F, paramInt4, 1, paramArrayOfFloat8, paramInt19, paramInt4, paramintW);
    f1 *= f1;
    k = 1;
    for (i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
    {
      slasd4_adapter(paramInt4, k, paramArrayOfFloat3, paramInt8, paramArrayOfFloat8, paramInt19, paramArrayOfFloat4, 1 - 1 + (k - 1) * paramInt10 + paramInt9, f1, paramArrayOfFloat1, k - 1 + paramInt5, paramArrayOfFloat6, 1 - 1 + (k - 1) * paramInt14 + paramInt13, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        return;
      }
      k += 1;
    }
    j = 1;
    int i7;
    for (i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfFloat8[(j - 1 + paramInt19)] = (paramArrayOfFloat4[(j - 1 + (paramInt4 - 1) * paramInt10 + paramInt9)] * paramArrayOfFloat6[(j - 1 + (paramInt4 - 1) * paramInt14 + paramInt13)]);
      k = 1;
      for (i7 = j - 1 - 1 + 1; i7 > 0; i7--)
      {
        paramArrayOfFloat8[(j - 1 + paramInt19)] *= paramArrayOfFloat4[(j - 1 + (k - 1) * paramInt10 + paramInt9)] * paramArrayOfFloat6[(j - 1 + (k - 1) * paramInt14 + paramInt13)] / (paramArrayOfFloat3[(j - 1 + paramInt8)] - paramArrayOfFloat3[(k - 1 + paramInt8)]) / (paramArrayOfFloat3[(j - 1 + paramInt8)] + paramArrayOfFloat3[(k - 1 + paramInt8)]);
        k += 1;
      }
      k = j;
      for (i7 = paramInt4 - 1 - j + 1; i7 > 0; i7--)
      {
        paramArrayOfFloat8[(j - 1 + paramInt19)] *= paramArrayOfFloat4[(j - 1 + (k - 1) * paramInt10 + paramInt9)] * paramArrayOfFloat6[(j - 1 + (k - 1) * paramInt14 + paramInt13)] / (paramArrayOfFloat3[(j - 1 + paramInt8)] - paramArrayOfFloat3[(k + 1 - 1 + paramInt8)]) / (paramArrayOfFloat3[(j - 1 + paramInt8)] + paramArrayOfFloat3[(k + 1 - 1 + paramInt8)]);
        k += 1;
      }
      paramArrayOfFloat8[(j - 1 + paramInt19)] = Util.sign((float)Math.sqrt(Math.abs(paramArrayOfFloat8[(j - 1 + paramInt19)])), paramArrayOfFloat2[(j - 1 + (1 - 1) * paramInt7 + paramInt6)]);
      j += 1;
    }
    j = 1;
    for (i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
    {
      paramArrayOfFloat6[(1 - 1 + (j - 1) * paramInt14 + paramInt13)] = (paramArrayOfFloat8[(1 - 1 + paramInt19)] / paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt10 + paramInt9)] / paramArrayOfFloat6[(1 - 1 + (j - 1) * paramInt14 + paramInt13)]);
      paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt10 + paramInt9)] = -1.0F;
      k = 2;
      for (i7 = paramInt4 - 2 + 1; i7 > 0; i7--)
      {
        paramArrayOfFloat6[(k - 1 + (j - 1) * paramInt14 + paramInt13)] = (paramArrayOfFloat8[(k - 1 + paramInt19)] / paramArrayOfFloat4[(k - 1 + (j - 1) * paramInt10 + paramInt9)] / paramArrayOfFloat6[(k - 1 + (j - 1) * paramInt14 + paramInt13)]);
        paramArrayOfFloat4[(k - 1 + (j - 1) * paramInt10 + paramInt9)] = (paramArrayOfFloat3[(k - 1 + paramInt8)] * paramArrayOfFloat6[(k - 1 + (j - 1) * paramInt14 + paramInt13)]);
        k += 1;
      }
      f2 = Snrm2.snrm2(paramInt4, paramArrayOfFloat4, 1 - 1 + (j - 1) * paramInt10 + paramInt9, 1);
      paramArrayOfFloat4[(1 - 1 + (j - 1) * paramInt10 + paramInt9)] /= f2;
      k = 2;
      for (i7 = paramInt4 - 2 + 1; i7 > 0; i7--)
      {
        m = paramArrayOfInt1[(k - 1 + paramInt17)];
        paramArrayOfFloat4[(m - 1 + (j - 1) * paramInt10 + paramInt9)] /= f2;
        k += 1;
      }
      j += 1;
    }
    if ((paramInt4 != 2 ? 0 : 1) != 0)
    {
      Sgemm.sgemm("N", "N", i2, paramInt4, paramInt4, 1.0F, paramArrayOfFloat5, paramInt11, paramInt12, paramArrayOfFloat2, paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, paramInt9, paramInt10);
    }
    else
    {
      if ((paramArrayOfInt2[(1 - 1 + paramInt18)] <= 0 ? 0 : 1) != 0)
      {
        Sgemm.sgemm("N", "N", paramInt1, paramInt4, paramArrayOfInt2[(1 - 1 + paramInt18)], 1.0F, paramArrayOfFloat5, 1 - 1 + (2 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfFloat2, 2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
        if ((paramArrayOfInt2[(3 - 1 + paramInt18)] <= 0 ? 0 : 1) != 0)
        {
          n = 2 + paramArrayOfInt2[(1 - 1 + paramInt18)] + paramArrayOfInt2[(2 - 1 + paramInt18)];
          Sgemm.sgemm("N", "N", paramInt1, paramInt4, paramArrayOfInt2[(3 - 1 + paramInt18)], 1.0F, paramArrayOfFloat5, 1 - 1 + (n - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat4, 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
        }
      }
      else if ((paramArrayOfInt2[(3 - 1 + paramInt18)] <= 0 ? 0 : 1) != 0)
      {
        n = 2 + paramArrayOfInt2[(1 - 1 + paramInt18)] + paramArrayOfInt2[(2 - 1 + paramInt18)];
        Sgemm.sgemm("N", "N", paramInt1, paramInt4, paramArrayOfInt2[(3 - 1 + paramInt18)], 1.0F, paramArrayOfFloat5, 1 - 1 + (n - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
      }
      else
      {
        Slacpy.slacpy("F", paramInt1, paramInt4, paramArrayOfFloat5, paramInt11, paramInt12, paramArrayOfFloat4, paramInt9, paramInt10);
      }
      Scopy.scopy(paramInt4, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat4, i3 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
      n = 2 + paramArrayOfInt2[(1 - 1 + paramInt18)];
      i = paramArrayOfInt2[(2 - 1 + paramInt18)] + paramArrayOfInt2[(3 - 1 + paramInt18)];
      Sgemm.sgemm("N", "N", paramInt2, paramInt4, i, 1.0F, paramArrayOfFloat5, i4 - 1 + (n - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, i4 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
    }
    j = 1;
    for (i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
    {
      f2 = Snrm2.snrm2(paramInt4, paramArrayOfFloat6, 1 - 1 + (j - 1) * paramInt14 + paramInt13, 1);
      paramArrayOfFloat2[(j - 1 + (1 - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat6[(1 - 1 + (j - 1) * paramInt14 + paramInt13)] / f2);
      k = 2;
      for (i7 = paramInt4 - 2 + 1; i7 > 0; i7--)
      {
        m = paramArrayOfInt1[(k - 1 + paramInt17)];
        paramArrayOfFloat6[(m - 1 + (j - 1) * paramInt14 + paramInt13)] /= f2;
        k += 1;
      }
      j += 1;
    }
    if ((paramInt4 != 2 ? 0 : 1) != 0)
    {
      Sgemm.sgemm("N", "N", paramInt4, i1, paramInt4, 1.0F, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat7, paramInt15, paramInt16, 0.0F, paramArrayOfFloat6, paramInt13, paramInt14);
      return;
    }
    n = 1 + paramArrayOfInt2[(1 - 1 + paramInt18)];
    Sgemm.sgemm("N", "N", paramInt4, i3, n, 1.0F, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat7, 1 - 1 + (1 - 1) * paramInt16 + paramInt15, paramInt16, 0.0F, paramArrayOfFloat6, 1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
    n = 2 + paramArrayOfInt2[(1 - 1 + paramInt18)] + paramArrayOfInt2[(2 - 1 + paramInt18)];
    if ((n > paramInt16 ? 0 : 1) != 0) {
      Sgemm.sgemm("N", "N", paramInt4, i3, paramArrayOfInt2[(3 - 1 + paramInt18)], 1.0F, paramArrayOfFloat2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat7, n - 1 + (1 - 1) * paramInt16 + paramInt15, paramInt16, 1.0F, paramArrayOfFloat6, 1 - 1 + (1 - 1) * paramInt14 + paramInt13, paramInt14);
    }
    n = paramArrayOfInt2[(1 - 1 + paramInt18)] + 1;
    i5 = paramInt2 + paramInt3;
    if ((n <= 1 ? 0 : 1) != 0)
    {
      j = 1;
      for (i6 = paramInt4 - 1 + 1; i6 > 0; i6--)
      {
        paramArrayOfFloat2[(j - 1 + (n - 1) * paramInt7 + paramInt6)] = paramArrayOfFloat2[(j - 1 + (1 - 1) * paramInt7 + paramInt6)];
        j += 1;
      }
      j = i4;
      for (i6 = i1 - i4 + 1; i6 > 0; i6--)
      {
        paramArrayOfFloat7[(n - 1 + (j - 1) * paramInt16 + paramInt15)] = paramArrayOfFloat7[(1 - 1 + (j - 1) * paramInt16 + paramInt15)];
        j += 1;
      }
    }
    i = 1 + paramArrayOfInt2[(2 - 1 + paramInt18)] + paramArrayOfInt2[(3 - 1 + paramInt18)];
    Sgemm.sgemm("N", "N", paramInt4, i5, i, 1.0F, paramArrayOfFloat2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat7, n - 1 + (i4 - 1) * paramInt16 + paramInt15, paramInt16, 0.0F, paramArrayOfFloat6, 1 - 1 + (i4 - 1) * paramInt14 + paramInt13, paramInt14);
  }
  
  private static void slasd4_adapter(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float paramFloat, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, intW paramintW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat4[paramInt6]);
    Slasd4.slasd4(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramFloat, localfloatW, paramArrayOfFloat5, paramInt7, paramintW);
    paramArrayOfFloat4[paramInt6] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasd3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */