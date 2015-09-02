package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Snrm2;
import org.netlib.blas.Srot;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Slals0
{
  public static void slals0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float[] paramArrayOfFloat1, int paramInt6, int paramInt7, float[] paramArrayOfFloat2, int paramInt8, int paramInt9, int[] paramArrayOfInt1, int paramInt10, int paramInt11, int[] paramArrayOfInt2, int paramInt12, int paramInt13, float[] paramArrayOfFloat3, int paramInt14, int paramInt15, float[] paramArrayOfFloat4, int paramInt16, float[] paramArrayOfFloat5, int paramInt17, float[] paramArrayOfFloat6, int paramInt18, float[] paramArrayOfFloat7, int paramInt19, int paramInt20, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat8, int paramInt21, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt3 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt4 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt4 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -4;
      }
    }
    m = paramInt2 + paramInt3 + 1;
    if ((paramInt5 >= 1 ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt7 >= m ? 0 : 1) != 0) {
      paramintW.val = -7;
    } else if ((paramInt9 >= m ? 0 : 1) != 0) {
      paramintW.val = -9;
    } else if ((paramInt11 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -11;
    } else if ((paramInt13 >= m ? 0 : 1) != 0) {
      paramintW.val = -13;
    } else if ((paramInt15 >= m ? 0 : 1) != 0) {
      paramintW.val = -15;
    } else if ((paramInt20 >= 1 ? 0 : 1) != 0) {
      paramintW.val = -20;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLALS0", -paramintW.val);
      return;
    }
    k = m + paramInt4;
    n = paramInt2 + 1;
    int i1;
    int i2;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (i1 = paramInt11 - 1 + 1; i1 > 0; i1--)
      {
        Srot.srot(paramInt5, paramArrayOfFloat1, paramArrayOfInt2[(i - 1 + (2 - 1) * paramInt13 + paramInt12)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat1, paramArrayOfInt2[(i - 1 + (1 - 1) * paramInt13 + paramInt12)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3[(i - 1 + (2 - 1) * paramInt15 + paramInt14)], paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt15 + paramInt14)]);
        i += 1;
      }
      Scopy.scopy(paramInt5, paramArrayOfFloat1, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
      i = 2;
      for (i1 = m - 2 + 1; i1 > 0; i1--)
      {
        Scopy.scopy(paramInt5, paramArrayOfFloat1, paramArrayOfInt1[(i - 1 + paramInt10)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, i - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
        i += 1;
      }
      if ((paramInt20 != 1 ? 0 : 1) != 0)
      {
        Scopy.scopy(paramInt5, paramArrayOfFloat2, paramInt8, paramInt9, paramArrayOfFloat1, paramInt6, paramInt7);
        if ((paramArrayOfFloat7[(1 - 1 + paramInt19)] >= 0.0F ? 0 : 1) != 0) {
          Sscal.sscal(paramInt5, -1.0F, paramArrayOfFloat1, paramInt6, paramInt7);
        }
      }
      else
      {
        j = 1;
        for (i1 = paramInt20 - 1 + 1; i1 > 0; i1--)
        {
          f1 = paramArrayOfFloat5[(j - 1 + paramInt17)];
          f3 = paramArrayOfFloat4[(j - 1 + (1 - 1) * paramInt15 + paramInt16)];
          f4 = -paramArrayOfFloat4[(j - 1 + (2 - 1) * paramInt15 + paramInt16)];
          if ((j >= paramInt20 ? 0 : 1) != 0)
          {
            f2 = -paramArrayOfFloat6[(j - 1 + (1 - 1) * paramInt15 + paramInt18)];
            f5 = -paramArrayOfFloat4[(j + 1 - 1 + (2 - 1) * paramInt15 + paramInt16)];
          }
          if ((paramArrayOfFloat7[(j - 1 + paramInt19)] != 0.0F ? 0 : 1) == 0) {}
          if (((paramArrayOfFloat4[(j - 1 + (2 - 1) * paramInt15 + paramInt16)] != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramArrayOfFloat8[(j - 1 + paramInt21)] = 0.0F;
          } else {
            paramArrayOfFloat8[(j - 1 + paramInt21)] = (-(paramArrayOfFloat4[(j - 1 + (2 - 1) * paramInt15 + paramInt16)] * paramArrayOfFloat7[(j - 1 + paramInt19)] / f1 / (paramArrayOfFloat4[(j - 1 + (2 - 1) * paramInt15 + paramInt16)] + f3)));
          }
          i = 1;
          for (i2 = j - 1 - 1 + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfFloat7[(i - 1 + paramInt19)] != 0.0F ? 0 : 1) == 0) {}
            if (((paramArrayOfFloat4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
              paramArrayOfFloat8[(i - 1 + paramInt21)] = 0.0F;
            } else {
              paramArrayOfFloat8[(i - 1 + paramInt21)] = (paramArrayOfFloat4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] * paramArrayOfFloat7[(i - 1 + paramInt19)] / (Slamc3.slamc3(paramArrayOfFloat4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)], f4) - f1) / (paramArrayOfFloat4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] + f3));
            }
            i += 1;
          }
          i = j + 1;
          for (i2 = paramInt20 - (j + 1) + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfFloat7[(i - 1 + paramInt19)] != 0.0F ? 0 : 1) == 0) {}
            if (((paramArrayOfFloat4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
              paramArrayOfFloat8[(i - 1 + paramInt21)] = 0.0F;
            } else {
              paramArrayOfFloat8[(i - 1 + paramInt21)] = (paramArrayOfFloat4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] * paramArrayOfFloat7[(i - 1 + paramInt19)] / (Slamc3.slamc3(paramArrayOfFloat4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)], f5) + f2) / (paramArrayOfFloat4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)] + f3));
            }
            i += 1;
          }
          paramArrayOfFloat8[(1 - 1 + paramInt21)] = -1.0F;
          f6 = Snrm2.snrm2(paramInt20, paramArrayOfFloat8, paramInt21, 1);
          Sgemv.sgemv("T", paramInt20, paramInt5, 1.0F, paramArrayOfFloat2, paramInt8, paramInt9, paramArrayOfFloat8, paramInt21, 1, 0.0F, paramArrayOfFloat1, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          Slascl.slascl("G", 0, 0, f6, 1.0F, 1, paramInt5, paramArrayOfFloat1, j - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramintW);
          j += 1;
        }
      }
      if ((paramInt20 >= Math.max(k, m) ? 0 : 1) != 0) {
        Slacpy.slacpy("A", m - paramInt20, paramInt5, paramArrayOfFloat2, paramInt20 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, paramInt20 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
    }
    else
    {
      if ((paramInt20 != 1 ? 0 : 1) != 0)
      {
        Scopy.scopy(paramInt5, paramArrayOfFloat1, paramInt6, paramInt7, paramArrayOfFloat2, paramInt8, paramInt9);
      }
      else
      {
        j = 1;
        for (i1 = paramInt20 - 1 + 1; i1 > 0; i1--)
        {
          f4 = paramArrayOfFloat4[(j - 1 + (2 - 1) * paramInt15 + paramInt16)];
          if ((paramArrayOfFloat7[(j - 1 + paramInt19)] != 0.0F ? 0 : 1) != 0) {
            paramArrayOfFloat8[(j - 1 + paramInt21)] = 0.0F;
          } else {
            paramArrayOfFloat8[(j - 1 + paramInt21)] = (-(paramArrayOfFloat7[(j - 1 + paramInt19)] / paramArrayOfFloat5[(j - 1 + paramInt17)] / (f4 + paramArrayOfFloat4[(j - 1 + (1 - 1) * paramInt15 + paramInt16)]) / paramArrayOfFloat6[(j - 1 + (2 - 1) * paramInt15 + paramInt18)]));
          }
          i = 1;
          for (i2 = j - 1 - 1 + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfFloat7[(j - 1 + paramInt19)] != 0.0F ? 0 : 1) != 0) {
              paramArrayOfFloat8[(i - 1 + paramInt21)] = 0.0F;
            } else {
              paramArrayOfFloat8[(i - 1 + paramInt21)] = (paramArrayOfFloat7[(j - 1 + paramInt19)] / (Slamc3.slamc3(f4, -paramArrayOfFloat4[(i + 1 - 1 + (2 - 1) * paramInt15 + paramInt16)]) - paramArrayOfFloat6[(i - 1 + (1 - 1) * paramInt15 + paramInt18)]) / (f4 + paramArrayOfFloat4[(i - 1 + (1 - 1) * paramInt15 + paramInt16)]) / paramArrayOfFloat6[(i - 1 + (2 - 1) * paramInt15 + paramInt18)]);
            }
            i += 1;
          }
          i = j + 1;
          for (i2 = paramInt20 - (j + 1) + 1; i2 > 0; i2--)
          {
            if ((paramArrayOfFloat7[(j - 1 + paramInt19)] != 0.0F ? 0 : 1) != 0) {
              paramArrayOfFloat8[(i - 1 + paramInt21)] = 0.0F;
            } else {
              paramArrayOfFloat8[(i - 1 + paramInt21)] = (paramArrayOfFloat7[(j - 1 + paramInt19)] / (Slamc3.slamc3(f4, -paramArrayOfFloat4[(i - 1 + (2 - 1) * paramInt15 + paramInt16)]) - paramArrayOfFloat5[(i - 1 + paramInt17)]) / (f4 + paramArrayOfFloat4[(i - 1 + (1 - 1) * paramInt15 + paramInt16)]) / paramArrayOfFloat6[(i - 1 + (2 - 1) * paramInt15 + paramInt18)]);
            }
            i += 1;
          }
          Sgemv.sgemv("T", paramInt20, paramInt5, 1.0F, paramArrayOfFloat1, paramInt6, paramInt7, paramArrayOfFloat8, paramInt21, 1, 0.0F, paramArrayOfFloat2, j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
          j += 1;
        }
      }
      if ((paramInt4 != 1 ? 0 : 1) != 0)
      {
        Scopy.scopy(paramInt5, paramArrayOfFloat1, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
        Srot.srot(paramInt5, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramFloat1, paramFloat2);
      }
      if ((paramInt20 >= Math.max(k, m) ? 0 : 1) != 0) {
        Slacpy.slacpy("A", m - paramInt20, paramInt5, paramArrayOfFloat1, paramInt20 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, paramInt20 + 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
      }
      Scopy.scopy(paramInt5, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      if ((paramInt4 != 1 ? 0 : 1) != 0) {
        Scopy.scopy(paramInt5, paramArrayOfFloat2, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, k - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
      i = 2;
      for (i1 = m - 2 + 1; i1 > 0; i1--)
      {
        Scopy.scopy(paramInt5, paramArrayOfFloat2, i - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat1, paramArrayOfInt1[(i - 1 + paramInt10)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        i += 1;
      }
      i = paramInt11;
      for (i1 = (1 - paramInt11 + -1) / -1; i1 > 0; i1--)
      {
        Srot.srot(paramInt5, paramArrayOfFloat1, paramArrayOfInt2[(i - 1 + (2 - 1) * paramInt13 + paramInt12)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat1, paramArrayOfInt2[(i - 1 + (1 - 1) * paramInt13 + paramInt12)] - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3[(i - 1 + (2 - 1) * paramInt15 + paramInt14)], -paramArrayOfFloat3[(i - 1 + (1 - 1) * paramInt15 + paramInt14)]);
        i += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slals0.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */