package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Ssymv;
import org.netlib.blas.Ssyr2;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssytd2
{
  public static void ssytd2(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    float f = 0.0F;
    floatW localfloatW = new floatW(0.0F);
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSYTD2", -paramintW.val);
      return;
    }
    if ((paramInt1 > 0 ? 0 : 1) != 0) {
      return;
    }
    int j;
    if (bool)
    {
      i = paramInt1 - 1;
      for (j = (1 - (paramInt1 - 1) + -1) / -1; j > 0; j--)
      {
        slarfg_adapter(i, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1, localfloatW);
        paramArrayOfFloat3[(i - 1 + paramInt5)] = paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)];
        if ((localfloatW.val == 0.0F ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = 1.0F;
          Ssymv.ssymv(paramString, i, localfloatW.val, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1, 0.0F, paramArrayOfFloat4, paramInt6, 1);
          f = -(0.5F * localfloatW.val * Sdot.sdot(i, paramArrayOfFloat4, paramInt6, 1, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1));
          Saxpy.saxpy(i, f, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat4, paramInt6, 1);
          Ssyr2.ssyr2(paramString, i, -1.0F, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat4, paramInt6, 1, paramArrayOfFloat1, paramInt2, paramInt3);
          paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat3[(i - 1 + paramInt5)];
        }
        paramArrayOfFloat2[(i + 1 - 1 + paramInt4)] = paramArrayOfFloat1[(i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2)];
        paramArrayOfFloat4[(i - 1 + paramInt6)] = localfloatW.val;
        i += -1;
      }
      paramArrayOfFloat2[(1 - 1 + paramInt4)] = paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt3 + paramInt2)];
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
      {
        slarfg_adapter(paramInt1 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramArrayOfFloat1, Math.min(i + 2, paramInt1) - 1 + (i - 1) * paramInt3 + paramInt2, 1, localfloatW);
        paramArrayOfFloat3[(i - 1 + paramInt5)] = paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)];
        if ((localfloatW.val == 0.0F ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)] = 1.0F;
          Ssymv.ssymv(paramString, paramInt1 - i, localfloatW.val, paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, 0.0F, paramArrayOfFloat4, i - 1 + paramInt6, 1);
          f = -(0.5F * localfloatW.val * Sdot.sdot(paramInt1 - i, paramArrayOfFloat4, i - 1 + paramInt6, 1, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1));
          Saxpy.saxpy(paramInt1 - i, f, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat4, i - 1 + paramInt6, 1);
          Ssyr2.ssyr2(paramString, paramInt1 - i, -1.0F, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat4, i - 1 + paramInt6, 1, paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3);
          paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat3[(i - 1 + paramInt5)];
        }
        paramArrayOfFloat2[(i - 1 + paramInt4)] = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
        paramArrayOfFloat4[(i - 1 + paramInt6)] = localfloatW.val;
        i += 1;
      }
      paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] = paramArrayOfFloat1[(paramInt1 - 1 + (paramInt1 - 1) * paramInt3 + paramInt2)];
    }
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, floatW paramfloatW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat1[paramInt2]);
    Slarfg.slarfg(paramInt1, localfloatW, paramArrayOfFloat2, paramInt3, paramInt4, paramfloatW);
    paramArrayOfFloat1[paramInt2] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssytd2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */