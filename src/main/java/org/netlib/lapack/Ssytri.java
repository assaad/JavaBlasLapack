package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sswap;
import org.netlib.blas.Ssymv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssytri
{
  public static void ssytri(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
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
      Xerbla.xerbla("SSYTRI", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int m;
    if (bool)
    {
      paramintW.val = paramInt1;
      for (m = (1 - paramInt1 + -1) / -1; m > 0; m--)
      {
        if ((paramArrayOfInt[(paramintW.val - 1 + paramInt4)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat1[(paramintW.val - 1 + (paramintW.val - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        paramintW.val += -1;
      }
    }
    else
    {
      paramintW.val = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        if ((paramArrayOfInt[(paramintW.val - 1 + paramInt4)] <= 0 ? 0 : 1) != 0) {}
        if (((paramArrayOfFloat1[(paramintW.val - 1 + (paramintW.val - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0) {
          return;
        }
        paramintW.val += 1;
      }
    }
    paramintW.val = 0;
    if (bool)
    {
      i = 1;
      while ((i <= paramInt1 ? 0 : 1) == 0)
      {
        if ((paramArrayOfInt[(i - 1 + paramInt4)] <= 0 ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = (1.0F / paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)]);
          if ((i <= 1 ? 0 : 1) != 0)
          {
            Scopy.scopy(i - 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, paramInt5, 1);
            Ssymv.ssymv(paramString, i - 1, -1.0F, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt5, 1, 0.0F, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] -= Sdot.sdot(i - 1, paramArrayOfFloat2, paramInt5, 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
          }
          k = 1;
        }
        else
        {
          f5 = Math.abs(paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)]);
          f1 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] / f5;
          f3 = paramArrayOfFloat1[(i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] / f5;
          f2 = paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] / f5;
          f4 = f5 * (f1 * f3 - 1.0F);
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = (f3 / f4);
          paramArrayOfFloat1[(i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = (f1 / f4);
          paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = (-(f2 / f4));
          if ((i <= 1 ? 0 : 1) != 0)
          {
            Scopy.scopy(i - 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, paramInt5, 1);
            Ssymv.ssymv(paramString, i - 1, -1.0F, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt5, 1, 0.0F, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] -= Sdot.sdot(i - 1, paramArrayOfFloat2, paramInt5, 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] -= Sdot.sdot(i - 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1);
            Scopy.scopy(i - 1, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, paramInt5, 1);
            Ssymv.ssymv(paramString, i - 1, -1.0F, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt5, 1, 0.0F, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfFloat1[(i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] -= Sdot.sdot(i - 1, paramArrayOfFloat2, paramInt5, 1, paramArrayOfFloat1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1);
          }
          k = 2;
        }
        j = Math.abs(paramArrayOfInt[(i - 1 + paramInt4)]);
        if ((j == i ? 0 : 1) != 0)
        {
          Sswap.sswap(j - 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
          Sswap.sswap(i - j - 1, paramArrayOfFloat1, j + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, j - 1 + (j + 1 - 1) * paramInt3 + paramInt2, paramInt3);
          f6 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt3 + paramInt2)];
          paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt3 + paramInt2)] = f6;
          if ((k != 2 ? 0 : 1) != 0)
          {
            f6 = paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat1[(j - 1 + (i + 1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat1[(j - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = f6;
          }
        }
        i += k;
      }
    }
    else
    {
      i = paramInt1;
      while ((i >= 1 ? 0 : 1) == 0)
      {
        if ((paramArrayOfInt[(i - 1 + paramInt4)] <= 0 ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = (1.0F / paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)]);
          if ((i >= paramInt1 ? 0 : 1) != 0)
          {
            Scopy.scopy(paramInt1 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, paramInt5, 1);
            Ssymv.ssymv(paramString, paramInt1 - i, -1.0F, paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, paramInt5, 1, 0.0F, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] -= Sdot.sdot(paramInt1 - i, paramArrayOfFloat2, paramInt5, 1, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
          }
          k = 1;
        }
        else
        {
          f5 = Math.abs(paramArrayOfFloat1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)]);
          f1 = paramArrayOfFloat1[(i - 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] / f5;
          f3 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] / f5;
          f2 = paramArrayOfFloat1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] / f5;
          f4 = f5 * (f1 * f3 - 1.0F);
          paramArrayOfFloat1[(i - 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] = (f3 / f4);
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = (f1 / f4);
          paramArrayOfFloat1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] = (-(f2 / f4));
          if ((i >= paramInt1 ? 0 : 1) != 0)
          {
            Scopy.scopy(paramInt1 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, paramInt5, 1);
            Ssymv.ssymv(paramString, paramInt1 - i, -1.0F, paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, paramInt5, 1, 0.0F, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] -= Sdot.sdot(paramInt1 - i, paramArrayOfFloat2, paramInt5, 1, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfFloat1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] -= Sdot.sdot(paramInt1 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, i + 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2, 1);
            Scopy.scopy(paramInt1 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, paramInt5, 1);
            Ssymv.ssymv(paramString, paramInt1 - i, -1.0F, paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat2, paramInt5, 1, 0.0F, paramArrayOfFloat1, i + 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfFloat1[(i - 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] -= Sdot.sdot(paramInt1 - i, paramArrayOfFloat2, paramInt5, 1, paramArrayOfFloat1, i + 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2, 1);
          }
          k = 2;
        }
        j = Math.abs(paramArrayOfInt[(i - 1 + paramInt4)]);
        if ((j == i ? 0 : 1) != 0)
        {
          if ((j >= paramInt1 ? 0 : 1) != 0) {
            Sswap.sswap(paramInt1 - j, paramArrayOfFloat1, j + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, j + 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
          }
          Sswap.sswap(j - i - 1, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, j - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3);
          f6 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
          paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt3 + paramInt2)];
          paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt3 + paramInt2)] = f6;
          if ((k != 2 ? 0 : 1) != 0)
          {
            f6 = paramArrayOfFloat1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] = paramArrayOfFloat1[(j - 1 + (i - 1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfFloat1[(j - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] = f6;
          }
        }
        i -= k;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssytri.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */