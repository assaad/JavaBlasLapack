package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgeqpf
{
  public static void sgeqpf(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, intW paramintW)
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
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGEQPF", -paramintW.val);
      return;
    }
    n = Math.min(paramInt1, paramInt2);
    f4 = (float)Math.sqrt(Slamch.slamch("Epsilon"));
    j = 1;
    i = 1;
    for (int i2 = paramInt2 - 1 + 1; i2 > 0; i2--)
    {
      if ((paramArrayOfInt[(i - 1 + paramInt5)] == 0 ? 0 : 1) != 0)
      {
        if ((i == j ? 0 : 1) != 0)
        {
          Sswap.sswap(paramInt1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1);
          paramArrayOfInt[(i - 1 + paramInt5)] = paramArrayOfInt[(j - 1 + paramInt5)];
          paramArrayOfInt[(j - 1 + paramInt5)] = i;
        }
        else
        {
          paramArrayOfInt[(i - 1 + paramInt5)] = i;
        }
        j += 1;
      }
      else
      {
        paramArrayOfInt[(i - 1 + paramInt5)] = i;
      }
      i += 1;
    }
    j -= 1;
    if ((j <= 0 ? 0 : 1) != 0)
    {
      m = Math.min(j, paramInt1);
      Sgeqr2.sgeqr2(paramInt1, m, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramintW);
      if ((m >= paramInt2 ? 0 : 1) != 0) {
        Sorm2r.sorm2r("Left", "Transpose", paramInt1, paramInt2 - m, m, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt6, paramArrayOfFloat1, 1 - 1 + (m + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat3, paramInt7, paramintW);
      }
    }
    if ((j >= n ? 0 : 1) != 0)
    {
      i = j + 1;
      for (int i2 = paramInt2 - (j + 1) + 1; i2 > 0; i2--)
      {
        paramArrayOfFloat3[(i - 1 + paramInt7)] = Snrm2.snrm2(paramInt1 - j, paramArrayOfFloat1, j + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        paramArrayOfFloat3[(paramInt2 + i - 1 + paramInt7)] = paramArrayOfFloat3[(i - 1 + paramInt7)];
        i += 1;
      }
      i = j + 1;
      for (int i2 = n - (j + 1) + 1; i2 > 0; i2--)
      {
        i1 = i - 1 + Isamax.isamax(paramInt2 - i + 1, paramArrayOfFloat3, i - 1 + paramInt7, 1);
        if ((i1 == i ? 0 : 1) != 0)
        {
          Sswap.sswap(paramInt1, paramArrayOfFloat1, 1 - 1 + (i1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
          j = paramArrayOfInt[(i1 - 1 + paramInt5)];
          paramArrayOfInt[(i1 - 1 + paramInt5)] = paramArrayOfInt[(i - 1 + paramInt5)];
          paramArrayOfInt[(i - 1 + paramInt5)] = j;
          paramArrayOfFloat3[(i1 - 1 + paramInt7)] = paramArrayOfFloat3[(i - 1 + paramInt7)];
          paramArrayOfFloat3[(paramInt2 + i1 - 1 + paramInt7)] = paramArrayOfFloat3[(paramInt2 + i - 1 + paramInt7)];
        }
        if ((i >= paramInt1 ? 0 : 1) != 0) {
          slarfg_adapter(paramInt1 - i + 1, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, i - 1 + paramInt6);
        } else {
          slarfg_adapter(1, paramArrayOfFloat1, paramInt1 - 1 + (paramInt1 - 1) * paramInt4 + paramInt3, paramArrayOfFloat1, paramInt1 - 1 + (paramInt1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, paramInt1 - 1 + paramInt6);
        }
        if ((i >= paramInt2 ? 0 : 1) != 0)
        {
          f1 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0F;
          Slarf.slarf("LEFT", paramInt1 - i + 1, paramInt2 - i, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat3, 2 * paramInt2 + 1 - 1 + paramInt7);
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = f1;
        }
        k = i + 1;
        for (int i3 = paramInt2 - (i + 1) + 1; i3 > 0; i3--)
        {
          if ((paramArrayOfFloat3[(k - 1 + paramInt7)] == 0.0F ? 0 : 1) != 0)
          {
            f2 = Math.abs(paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)]) / paramArrayOfFloat3[(k - 1 + paramInt7)];
            f2 = Math.max(0.0F, (1.0F + f2) * (1.0F - f2));
            f3 = f2 * (float)Math.pow(paramArrayOfFloat3[(k - 1 + paramInt7)] / paramArrayOfFloat3[(paramInt2 + k - 1 + paramInt7)], 2);
            if ((f3 > f4 ? 0 : 1) != 0)
            {
              if ((paramInt1 - i <= 0 ? 0 : 1) != 0)
              {
                paramArrayOfFloat3[(k - 1 + paramInt7)] = Snrm2.snrm2(paramInt1 - i, paramArrayOfFloat1, i + 1 - 1 + (k - 1) * paramInt4 + paramInt3, 1);
                paramArrayOfFloat3[(paramInt2 + k - 1 + paramInt7)] = paramArrayOfFloat3[(k - 1 + paramInt7)];
              }
              else
              {
                paramArrayOfFloat3[(k - 1 + paramInt7)] = 0.0F;
                paramArrayOfFloat3[(paramInt2 + k - 1 + paramInt7)] = 0.0F;
              }
            }
            else {
              paramArrayOfFloat3[(k - 1 + paramInt7)] *= (float)Math.sqrt(f2);
            }
          }
          k += 1;
        }
        i += 1;
      }
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgeqpf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */