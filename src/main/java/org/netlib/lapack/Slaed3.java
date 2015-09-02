package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.blas.Snrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaed3
{
  public static void slaed3(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float paramFloat, float[] paramArrayOfFloat3, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int[] paramArrayOfInt1, int paramInt9, int[] paramArrayOfInt2, int paramInt10, float[] paramArrayOfFloat5, int paramInt11, float[] paramArrayOfFloat6, int paramInt12, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    float f = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= paramInt1 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLAED3", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
    {
      paramArrayOfFloat3[(i - 1 + paramInt7)] = (Slamc3.slamc3(paramArrayOfFloat3[(i - 1 + paramInt7)], paramArrayOfFloat3[(i - 1 + paramInt7)]) - paramArrayOfFloat3[(i - 1 + paramInt7)]);
      i += 1;
    }
    m = 1;
    for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
    {
      slaed4_adapter(paramInt1, m, paramArrayOfFloat3, paramInt7, paramArrayOfFloat5, paramInt11, paramArrayOfFloat2, 1 - 1 + (m - 1) * paramInt6 + paramInt5, paramFloat, paramArrayOfFloat1, m - 1 + paramInt4, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        break;
      }
      m += 1;
    }
    if ((paramInt1 != 1 ? 0 : 1) == 0) {
      if ((paramInt1 != 2 ? 0 : 1) != 0)
      {
        m = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          paramArrayOfFloat5[(1 - 1 + paramInt11)] = paramArrayOfFloat2[(1 - 1 + (m - 1) * paramInt6 + paramInt5)];
          paramArrayOfFloat5[(2 - 1 + paramInt11)] = paramArrayOfFloat2[(2 - 1 + (m - 1) * paramInt6 + paramInt5)];
          j = paramArrayOfInt1[(1 - 1 + paramInt9)];
          paramArrayOfFloat2[(1 - 1 + (m - 1) * paramInt6 + paramInt5)] = paramArrayOfFloat5[(j - 1 + paramInt11)];
          j = paramArrayOfInt1[(2 - 1 + paramInt9)];
          paramArrayOfFloat2[(2 - 1 + (m - 1) * paramInt6 + paramInt5)] = paramArrayOfFloat5[(j - 1 + paramInt11)];
          m += 1;
        }
      }
      else
      {
        Scopy.scopy(paramInt1, paramArrayOfFloat5, paramInt11, 1, paramArrayOfFloat6, paramInt12, 1);
        Scopy.scopy(paramInt1, paramArrayOfFloat2, paramInt5, paramInt6 + 1, paramArrayOfFloat5, paramInt11, 1);
        m = 1;
        int i4;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          i = 1;
          for (i4 = m - 1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfFloat5[(i - 1 + paramInt11)] *= paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] / (paramArrayOfFloat3[(i - 1 + paramInt7)] - paramArrayOfFloat3[(m - 1 + paramInt7)]);
            i += 1;
          }
          i = m + 1;
          for (i4 = paramInt1 - (m + 1) + 1; i4 > 0; i4--)
          {
            paramArrayOfFloat5[(i - 1 + paramInt11)] *= paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] / (paramArrayOfFloat3[(i - 1 + paramInt7)] - paramArrayOfFloat3[(m - 1 + paramInt7)]);
            i += 1;
          }
          m += 1;
        }
        i = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          paramArrayOfFloat5[(i - 1 + paramInt11)] = Util.sign((float)Math.sqrt(-paramArrayOfFloat5[(i - 1 + paramInt11)]), paramArrayOfFloat6[(i - 1 + paramInt12)]);
          i += 1;
        }
        m = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          i = 1;
          for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfFloat5[(i - 1 + paramInt11)] /= paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)];
            i += 1;
          }
          f = Snrm2.snrm2(paramInt1, paramArrayOfFloat6, paramInt12, 1);
          i = 1;
          for (i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            j = paramArrayOfInt1[(i - 1 + paramInt9)];
            paramArrayOfFloat2[(i - 1 + (m - 1) * paramInt6 + paramInt5)] = (paramArrayOfFloat6[(j - 1 + paramInt12)] / f);
            i += 1;
          }
          m += 1;
        }
      }
    }
    i1 = paramInt2 - paramInt3;
    n = paramArrayOfInt2[(1 - 1 + paramInt10)] + paramArrayOfInt2[(2 - 1 + paramInt10)];
    i2 = paramArrayOfInt2[(2 - 1 + paramInt10)] + paramArrayOfInt2[(3 - 1 + paramInt10)];
    Slacpy.slacpy("A", i2, paramInt1, paramArrayOfFloat2, paramArrayOfInt2[(1 - 1 + paramInt10)] + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat6, paramInt12, i2);
    k = paramInt3 * n + 1;
    if ((i2 == 0 ? 0 : 1) != 0) {
      Sgemm.sgemm("N", "N", i1, paramInt1, i2, 1.0F, paramArrayOfFloat4, k - 1 + paramInt8, i1, paramArrayOfFloat6, paramInt12, i2, 0.0F, paramArrayOfFloat2, paramInt3 + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
    } else {
      Slaset.slaset("A", i1, paramInt1, 0.0F, 0.0F, paramArrayOfFloat2, paramInt3 + 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
    }
    Slacpy.slacpy("A", n, paramInt1, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat6, paramInt12, n);
    if ((n == 0 ? 0 : 1) != 0) {
      Sgemm.sgemm("N", "N", paramInt3, paramInt1, n, 1.0F, paramArrayOfFloat4, paramInt8, paramInt3, paramArrayOfFloat6, paramInt12, n, 0.0F, paramArrayOfFloat2, paramInt5, paramInt6);
    } else {
      Slaset.slaset("A", paramInt3, paramInt1, 0.0F, 0.0F, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6);
    }
  }
  
  private static void slaed4_adapter(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float paramFloat, float[] paramArrayOfFloat4, int paramInt6, intW paramintW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat4[paramInt6]);
    Slaed4.slaed4(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramFloat, localfloatW, paramintW);
    paramArrayOfFloat4[paramInt6] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaed3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */