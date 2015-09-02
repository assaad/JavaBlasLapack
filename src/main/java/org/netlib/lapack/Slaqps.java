package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sgemm;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sswap;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaqps
{
  public static void slaqps(int paramInt1, int paramInt2, int paramInt3, int paramInt4, intW paramintW, float[] paramArrayOfFloat1, int paramInt5, int paramInt6, int[] paramArrayOfInt, int paramInt7, float[] paramArrayOfFloat2, int paramInt8, float[] paramArrayOfFloat3, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, float[] paramArrayOfFloat5, int paramInt11, float[] paramArrayOfFloat6, int paramInt12, int paramInt13)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    m = Math.min(paramInt1, paramInt2 + paramInt3);
    n = 0;
    k = 0;
    f4 = (float)Math.sqrt(Slamch.slamch("Epsilon"));
    for (;;)
    {
      if ((k >= paramInt4 ? 0 : 1) != 0) {}
      if (((n != 0 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        break;
      }
      k += 1;
      i2 = paramInt3 + k;
      i1 = k - 1 + Isamax.isamax(paramInt2 - k + 1, paramArrayOfFloat3, k - 1 + paramInt9, 1);
      if ((i1 == k ? 0 : 1) != 0)
      {
        Sswap.sswap(paramInt1, paramArrayOfFloat1, 1 - 1 + (i1 - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt6 + paramInt5, 1);
        Sswap.sswap(k - 1, paramArrayOfFloat6, i1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, k - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13);
        i = paramArrayOfInt[(i1 - 1 + paramInt7)];
        paramArrayOfInt[(i1 - 1 + paramInt7)] = paramArrayOfInt[(k - 1 + paramInt7)];
        paramArrayOfInt[(k - 1 + paramInt7)] = i;
        paramArrayOfFloat3[(i1 - 1 + paramInt9)] = paramArrayOfFloat3[(k - 1 + paramInt9)];
        paramArrayOfFloat4[(i1 - 1 + paramInt10)] = paramArrayOfFloat4[(k - 1 + paramInt10)];
      }
      if ((k <= 1 ? 0 : 1) != 0) {
        Sgemv.sgemv("No transpose", paramInt1 - i2 + 1, k - 1, -1.0F, paramArrayOfFloat1, i2 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat6, k - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0F, paramArrayOfFloat1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, 1);
      }
      if ((i2 >= paramInt1 ? 0 : 1) != 0) {
        slarfg_adapter(paramInt1 - i2 + 1, paramArrayOfFloat1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, paramArrayOfFloat1, i2 + 1 - 1 + (k - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat2, k - 1 + paramInt8);
      } else {
        slarfg_adapter(1, paramArrayOfFloat1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, paramArrayOfFloat1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat2, k - 1 + paramInt8);
      }
      f1 = paramArrayOfFloat1[(i2 - 1 + (k - 1) * paramInt6 + paramInt5)];
      paramArrayOfFloat1[(i2 - 1 + (k - 1) * paramInt6 + paramInt5)] = 1.0F;
      if ((k >= paramInt2 ? 0 : 1) != 0) {
        Sgemv.sgemv("Transpose", paramInt1 - i2 + 1, paramInt2 - k, paramArrayOfFloat2[(k - 1 + paramInt8)], paramArrayOfFloat1, i2 - 1 + (k + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, 1, 0.0F, paramArrayOfFloat6, k + 1 - 1 + (k - 1) * paramInt13 + paramInt12, 1);
      }
      j = 1;
      for (int i3 = k - 1 + 1; i3 > 0; i3--)
      {
        paramArrayOfFloat6[(j - 1 + (k - 1) * paramInt13 + paramInt12)] = 0.0F;
        j += 1;
      }
      if ((k <= 1 ? 0 : 1) != 0)
      {
        Sgemv.sgemv("Transpose", paramInt1 - i2 + 1, k - 1, -paramArrayOfFloat2[(k - 1 + paramInt8)], paramArrayOfFloat1, i2 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i2 - 1 + (k - 1) * paramInt6 + paramInt5, 1, 0.0F, paramArrayOfFloat5, 1 - 1 + paramInt11, 1);
        Sgemv.sgemv("No transpose", paramInt2, k - 1, 1.0F, paramArrayOfFloat6, 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat5, 1 - 1 + paramInt11, 1, 1.0F, paramArrayOfFloat6, 1 - 1 + (k - 1) * paramInt13 + paramInt12, 1);
      }
      if ((k >= paramInt2 ? 0 : 1) != 0) {
        Sgemv.sgemv("No transpose", paramInt2 - k, k, -1.0F, paramArrayOfFloat6, k + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat1, i2 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, i2 - 1 + (k + 1 - 1) * paramInt6 + paramInt5, paramInt6);
      }
      if ((i2 >= m ? 0 : 1) != 0)
      {
        j = k + 1;
        for (int i3 = paramInt2 - (k + 1) + 1; i3 > 0; i3--)
        {
          if ((paramArrayOfFloat3[(j - 1 + paramInt9)] == 0.0F ? 0 : 1) != 0)
          {
            f2 = Math.abs(paramArrayOfFloat1[(i2 - 1 + (j - 1) * paramInt6 + paramInt5)]) / paramArrayOfFloat3[(j - 1 + paramInt9)];
            f2 = Math.max(0.0F, (1.0F + f2) * (1.0F - f2));
            f3 = f2 * (float)Math.pow(paramArrayOfFloat3[(j - 1 + paramInt9)] / paramArrayOfFloat4[(j - 1 + paramInt10)], 2);
            if ((f3 > f4 ? 0 : 1) != 0)
            {
              paramArrayOfFloat4[(j - 1 + paramInt10)] = n;
              n = j;
            }
            else
            {
              paramArrayOfFloat3[(j - 1 + paramInt9)] *= (float)Math.sqrt(f2);
            }
          }
          j += 1;
        }
      }
      paramArrayOfFloat1[(i2 - 1 + (k - 1) * paramInt6 + paramInt5)] = f1;
    }
    paramintW.val = k;
    i2 = paramInt3 + paramintW.val;
    if ((paramintW.val >= Math.min(paramInt2, paramInt1 - paramInt3) ? 0 : 1) != 0) {
      Sgemm.sgemm("No transpose", "Transpose", paramInt1 - i2, paramInt2 - paramintW.val, paramintW.val, -1.0F, paramArrayOfFloat1, i2 + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat6, paramintW.val + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0F, paramArrayOfFloat1, i2 + 1 - 1 + (paramintW.val + 1 - 1) * paramInt6 + paramInt5, paramInt6);
    }
    while ((n <= 0 ? 0 : 1) != 0)
    {
      i = Util.nint(paramArrayOfFloat4[(n - 1 + paramInt10)]);
      paramArrayOfFloat3[(n - 1 + paramInt9)] = Snrm2.snrm2(paramInt1 - i2, paramArrayOfFloat1, i2 + 1 - 1 + (n - 1) * paramInt6 + paramInt5, 1);
      paramArrayOfFloat4[(n - 1 + paramInt10)] = paramArrayOfFloat3[(n - 1 + paramInt9)];
      n = i;
    }
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float[] paramArrayOfFloat3, int paramInt5)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt2]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat3[paramInt5]);
    Slarfg.slarfg(paramInt1, localfloatW1, paramArrayOfFloat2, paramInt3, paramInt4, localfloatW2);
    paramArrayOfFloat1[paramInt2] = localfloatW1.val;
    paramArrayOfFloat3[paramInt5] = localfloatW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaqps.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */