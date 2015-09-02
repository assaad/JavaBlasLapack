package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sswap;
import org.netlib.util.floatW;

public final class Slaqp2
{
  public static void slaqp2(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, int[] paramArrayOfInt, int paramInt6, float[] paramArrayOfFloat2, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    m = Math.min(paramInt1 - paramInt3, paramInt2);
    f4 = (float)Math.sqrt(Slamch.slamch("Epsilon"));
    i = 1;
    for (int i2 = m - 1 + 1; i2 > 0; i2--)
    {
      n = paramInt3 + i;
      i1 = i - 1 + Isamax.isamax(paramInt2 - i + 1, paramArrayOfFloat3, i - 1 + paramInt8, 1);
      if ((i1 == i ? 0 : 1) != 0)
      {
        Sswap.sswap(paramInt1, paramArrayOfFloat1, 1 - 1 + (i1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        j = paramArrayOfInt[(i1 - 1 + paramInt6)];
        paramArrayOfInt[(i1 - 1 + paramInt6)] = paramArrayOfInt[(i - 1 + paramInt6)];
        paramArrayOfInt[(i - 1 + paramInt6)] = j;
        paramArrayOfFloat3[(i1 - 1 + paramInt8)] = paramArrayOfFloat3[(i - 1 + paramInt8)];
        paramArrayOfFloat4[(i1 - 1 + paramInt9)] = paramArrayOfFloat4[(i - 1 + paramInt9)];
      }
      if ((n >= paramInt1 ? 0 : 1) != 0) {
        slarfg_adapter(paramInt1 - n + 1, paramArrayOfFloat1, n - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, n + 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, i - 1 + paramInt7);
      } else {
        slarfg_adapter(1, paramArrayOfFloat1, paramInt1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1, paramInt1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, i - 1 + paramInt7);
      }
      if ((i >= paramInt2 ? 0 : 1) != 0)
      {
        f1 = paramArrayOfFloat1[(n - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat1[(n - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0F;
        Slarf.slarf("Left", paramInt1 - n + 1, paramInt2 - i, paramArrayOfFloat1, n - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2[(i - 1 + paramInt7)], paramArrayOfFloat1, n - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat5, 1 - 1 + paramInt10);
        paramArrayOfFloat1[(n - 1 + (i - 1) * paramInt5 + paramInt4)] = f1;
      }
      k = i + 1;
      for (int i3 = paramInt2 - (i + 1) + 1; i3 > 0; i3--)
      {
        if ((paramArrayOfFloat3[(k - 1 + paramInt8)] == 0.0F ? 0 : 1) != 0)
        {
          f2 = 1.0F - (float)Math.pow(Math.abs(paramArrayOfFloat1[(n - 1 + (k - 1) * paramInt5 + paramInt4)]) / paramArrayOfFloat3[(k - 1 + paramInt8)], 2);
          f2 = Math.max(f2, 0.0F);
          f3 = f2 * (float)Math.pow(paramArrayOfFloat3[(k - 1 + paramInt8)] / paramArrayOfFloat4[(k - 1 + paramInt9)], 2);
          if ((f3 > f4 ? 0 : 1) != 0)
          {
            if ((n >= paramInt1 ? 0 : 1) != 0)
            {
              paramArrayOfFloat3[(k - 1 + paramInt8)] = Snrm2.snrm2(paramInt1 - n, paramArrayOfFloat1, n + 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1);
              paramArrayOfFloat4[(k - 1 + paramInt9)] = paramArrayOfFloat3[(k - 1 + paramInt8)];
            }
            else
            {
              paramArrayOfFloat3[(k - 1 + paramInt8)] = 0.0F;
              paramArrayOfFloat4[(k - 1 + paramInt9)] = 0.0F;
            }
          }
          else {
            paramArrayOfFloat3[(k - 1 + paramInt8)] *= (float)Math.sqrt(f2);
          }
        }
        k += 1;
      }
      i += 1;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaqp2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */