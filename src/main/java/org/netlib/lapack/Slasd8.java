package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Snrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasd8
{
  public static void slasd8(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, float[] paramArrayOfFloat6, int paramInt8, int paramInt9, float[] paramArrayOfFloat7, int paramInt10, float[] paramArrayOfFloat8, int paramInt11, intW paramintW)
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
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 1 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt9 >= paramInt2 ? 0 : 1) != 0) {
      paramintW.val = -9;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLASD8", -paramintW.val);
      return;
    }
    if ((paramInt2 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfFloat1[(1 - 1 + paramInt3)] = Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt4)]);
      paramArrayOfFloat5[(1 - 1 + paramInt7)] = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      if ((paramInt1 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfFloat5[(2 - 1 + paramInt7)] = 1.0F;
        paramArrayOfFloat6[(1 - 1 + (2 - 1) * paramInt9 + paramInt8)] = 1.0F;
      }
      return;
    }
    i = 1;
    for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      paramArrayOfFloat7[(i - 1 + paramInt10)] = (Slamc3.slamc3(paramArrayOfFloat7[(i - 1 + paramInt10)], paramArrayOfFloat7[(i - 1 + paramInt10)]) - paramArrayOfFloat7[(i - 1 + paramInt10)]);
      i += 1;
    }
    j = 1;
    k = j + paramInt2;
    n = k + paramInt2;
    m = k - 1;
    i1 = n - 1;
    f6 = Snrm2.snrm2(paramInt2, paramArrayOfFloat2, paramInt4, 1);
    Slascl.slascl("G", 0, 0, f6, 1.0F, paramInt2, 1, paramArrayOfFloat2, paramInt4, paramInt2, paramintW);
    f6 *= f6;
    Slaset.slaset("A", paramInt2, 1, 1.0F, 1.0F, paramArrayOfFloat8, n - 1 + paramInt11, paramInt2);
    i2 = 1;
    int i4;
    for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      slasd4_adapter(paramInt2, i2, paramArrayOfFloat7, paramInt10, paramArrayOfFloat2, paramInt4, paramArrayOfFloat8, j - 1 + paramInt11, f6, paramArrayOfFloat1, i2 - 1 + paramInt3, paramArrayOfFloat8, k - 1 + paramInt11, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        return;
      }
      paramArrayOfFloat8[(i1 + i2 - 1 + paramInt11)] = (paramArrayOfFloat8[(i1 + i2 - 1 + paramInt11)] * paramArrayOfFloat8[(i2 - 1 + paramInt11)] * paramArrayOfFloat8[(m + i2 - 1 + paramInt11)]);
      paramArrayOfFloat5[(i2 - 1 + paramInt7)] = (-paramArrayOfFloat8[(i2 - 1 + paramInt11)]);
      paramArrayOfFloat6[(i2 - 1 + (1 - 1) * paramInt9 + paramInt8)] = (-paramArrayOfFloat8[(i2 + 1 - 1 + paramInt11)]);
      i = 1;
      for (i4 = i2 - 1 - 1 + 1; i4 > 0; i4--)
      {
        paramArrayOfFloat8[(i1 + i - 1 + paramInt11)] = (paramArrayOfFloat8[(i1 + i - 1 + paramInt11)] * paramArrayOfFloat8[(i - 1 + paramInt11)] * paramArrayOfFloat8[(m + i - 1 + paramInt11)] / (paramArrayOfFloat7[(i - 1 + paramInt10)] - paramArrayOfFloat7[(i2 - 1 + paramInt10)]) / (paramArrayOfFloat7[(i - 1 + paramInt10)] + paramArrayOfFloat7[(i2 - 1 + paramInt10)]));
        i += 1;
      }
      i = i2 + 1;
      for (i4 = paramInt2 - (i2 + 1) + 1; i4 > 0; i4--)
      {
        paramArrayOfFloat8[(i1 + i - 1 + paramInt11)] = (paramArrayOfFloat8[(i1 + i - 1 + paramInt11)] * paramArrayOfFloat8[(i - 1 + paramInt11)] * paramArrayOfFloat8[(m + i - 1 + paramInt11)] / (paramArrayOfFloat7[(i - 1 + paramInt10)] - paramArrayOfFloat7[(i2 - 1 + paramInt10)]) / (paramArrayOfFloat7[(i - 1 + paramInt10)] + paramArrayOfFloat7[(i2 - 1 + paramInt10)]));
        i += 1;
      }
      i2 += 1;
    }
    i = 1;
    for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      paramArrayOfFloat2[(i - 1 + paramInt4)] = Util.sign((float)Math.sqrt(Math.abs(paramArrayOfFloat8[(i1 + i - 1 + paramInt11)])), paramArrayOfFloat2[(i - 1 + paramInt4)]);
      i += 1;
    }
    i2 = 1;
    for (i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      f1 = paramArrayOfFloat5[(i2 - 1 + paramInt7)];
      f3 = paramArrayOfFloat1[(i2 - 1 + paramInt3)];
      f4 = -paramArrayOfFloat7[(i2 - 1 + paramInt10)];
      if ((i2 >= paramInt2 ? 0 : 1) != 0)
      {
        f2 = -paramArrayOfFloat6[(i2 - 1 + (1 - 1) * paramInt9 + paramInt8)];
        f5 = -paramArrayOfFloat7[(i2 + 1 - 1 + paramInt10)];
      }
      paramArrayOfFloat8[(i2 - 1 + paramInt11)] = (-(paramArrayOfFloat2[(i2 - 1 + paramInt4)] / f1 / (paramArrayOfFloat7[(i2 - 1 + paramInt10)] + f3)));
      i = 1;
      for (i4 = i2 - 1 - 1 + 1; i4 > 0; i4--)
      {
        paramArrayOfFloat8[(i - 1 + paramInt11)] = (paramArrayOfFloat2[(i - 1 + paramInt4)] / (Slamc3.slamc3(paramArrayOfFloat7[(i - 1 + paramInt10)], f4) - f1) / (paramArrayOfFloat7[(i - 1 + paramInt10)] + f3));
        i += 1;
      }
      i = i2 + 1;
      for (i4 = paramInt2 - (i2 + 1) + 1; i4 > 0; i4--)
      {
        paramArrayOfFloat8[(i - 1 + paramInt11)] = (paramArrayOfFloat2[(i - 1 + paramInt4)] / (Slamc3.slamc3(paramArrayOfFloat7[(i - 1 + paramInt10)], f5) + f2) / (paramArrayOfFloat7[(i - 1 + paramInt10)] + f3));
        i += 1;
      }
      f7 = Snrm2.snrm2(paramInt2, paramArrayOfFloat8, paramInt11, 1);
      paramArrayOfFloat8[(m + i2 - 1 + paramInt11)] = (Sdot.sdot(paramInt2, paramArrayOfFloat8, paramInt11, 1, paramArrayOfFloat3, paramInt5, 1) / f7);
      paramArrayOfFloat8[(i1 + i2 - 1 + paramInt11)] = (Sdot.sdot(paramInt2, paramArrayOfFloat8, paramInt11, 1, paramArrayOfFloat4, paramInt6, 1) / f7);
      if ((paramInt1 != 1 ? 0 : 1) != 0) {
        paramArrayOfFloat6[(i2 - 1 + (2 - 1) * paramInt9 + paramInt8)] = f7;
      }
      i2 += 1;
    }
    Scopy.scopy(paramInt2, paramArrayOfFloat8, k - 1 + paramInt11, 1, paramArrayOfFloat3, paramInt5, 1);
    Scopy.scopy(paramInt2, paramArrayOfFloat8, n - 1 + paramInt11, 1, paramArrayOfFloat4, paramInt6, 1);
  }
  
  private static void slasd4_adapter(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float paramFloat, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, intW paramintW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat4[paramInt6]);
    Slasd4.slasd4(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramFloat, localfloatW, paramArrayOfFloat5, paramInt7, paramintW);
    paramArrayOfFloat4[paramInt6] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasd8.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */