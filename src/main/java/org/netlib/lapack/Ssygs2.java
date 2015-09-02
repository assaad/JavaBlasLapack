package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Sscal;
import org.netlib.blas.Ssyr2;
import org.netlib.blas.Strmv;
import org.netlib.blas.Strsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssygs2
{
  public static void ssygs2(int paramInt1, String paramString, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -7;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSYGS2", -paramintW.val);
      return;
    }
    int j;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if (bool)
      {
        i = 1;
        for (j = paramInt2 - 1 + 1; j > 0; j--)
        {
          f1 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
          f2 = paramArrayOfFloat2[(i - 1 + (i - 1) * paramInt6 + paramInt5)];
          f1 /= (float)Math.pow(f2, 2);
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = f1;
          if ((i >= paramInt2 ? 0 : 1) != 0)
          {
            Sscal.sscal(paramInt2 - i, 1.0F / f2, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            f3 = -(0.5F * f1);
            Saxpy.saxpy(paramInt2 - i, f3, paramArrayOfFloat2, i - 1 + (i + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Ssyr2.ssyr2(paramString, paramInt2 - i, -1.0F, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (i + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Saxpy.saxpy(paramInt2 - i, f3, paramArrayOfFloat2, i - 1 + (i + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Strsv.strsv(paramString, "Transpose", "Non-unit", paramInt2 - i, paramArrayOfFloat2, i + 1 - 1 + (i + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
          }
          i += 1;
        }
      }
      else
      {
        i = 1;
        for (j = paramInt2 - 1 + 1; j > 0; j--)
        {
          f1 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
          f2 = paramArrayOfFloat2[(i - 1 + (i - 1) * paramInt6 + paramInt5)];
          f1 /= (float)Math.pow(f2, 2);
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = f1;
          if ((i >= paramInt2 ? 0 : 1) != 0)
          {
            Sscal.sscal(paramInt2 - i, 1.0F / f2, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
            f3 = -(0.5F * f1);
            Saxpy.saxpy(paramInt2 - i, f3, paramArrayOfFloat2, i + 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
            Ssyr2.ssyr2(paramString, paramInt2 - i, -1.0F, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, i + 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4);
            Saxpy.saxpy(paramInt2 - i, f3, paramArrayOfFloat2, i + 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
            Strsv.strsv(paramString, "No transpose", "Non-unit", paramInt2 - i, paramArrayOfFloat2, i + 1 - 1 + (i + 1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
          }
          i += 1;
        }
      }
    }
    else if (bool)
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
        f2 = paramArrayOfFloat2[(i - 1 + (i - 1) * paramInt6 + paramInt5)];
        Strmv.strmv(paramString, "No transpose", "Non-unit", i - 1, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        f3 = 0.5F * f1;
        Saxpy.saxpy(i - 1, f3, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        Ssyr2.ssyr2(paramString, i - 1, 1.0F, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat1, paramInt3, paramInt4);
        Saxpy.saxpy(i - 1, f3, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        Sscal.sscal(i - 1, f2, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = (f1 * (float)Math.pow(f2, 2));
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
        f2 = paramArrayOfFloat2[(i - 1 + (i - 1) * paramInt6 + paramInt5)];
        Strmv.strmv(paramString, "Transpose", "Non-unit", i - 1, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        f3 = 0.5F * f1;
        Saxpy.saxpy(i - 1, f3, paramArrayOfFloat2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        Ssyr2.ssyr2(paramString, i - 1, 1.0F, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, paramInt3, paramInt4);
        Saxpy.saxpy(i - 1, f3, paramArrayOfFloat2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        Sscal.sscal(i - 1, f2, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
        paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = (f1 * (float)Math.pow(f2, 2));
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssygs2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */