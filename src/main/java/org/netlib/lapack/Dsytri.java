package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dswap;
import org.netlib.blas.Dsymv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsytri
{
  public static void dsytri(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
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
      Xerbla.xerbla("DSYTRI", -paramintW.val);
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
        if (((paramArrayOfDouble1[(paramintW.val - 1 + (paramintW.val - 1) * paramInt3 + paramInt2)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
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
        if (((paramArrayOfDouble1[(paramintW.val - 1 + (paramintW.val - 1) * paramInt3 + paramInt2)] != 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
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
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = (1.0D / paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)]);
          if ((i <= 1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(i - 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble2, paramInt5, 1);
            Dsymv.dsymv(paramString, i - 1, -1.0D, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt5, 1, 0.0D, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] -= Ddot.ddot(i - 1, paramArrayOfDouble2, paramInt5, 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
          }
          k = 1;
        }
        else
        {
          d5 = Math.abs(paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)]);
          d1 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] / d5;
          d3 = paramArrayOfDouble1[(i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] / d5;
          d2 = paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] / d5;
          d4 = d5 * (d1 * d3 - 1.0D);
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = (d3 / d4);
          paramArrayOfDouble1[(i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = (d1 / d4);
          paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = (-(d2 / d4));
          if ((i <= 1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(i - 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble2, paramInt5, 1);
            Dsymv.dsymv(paramString, i - 1, -1.0D, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt5, 1, 0.0D, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] -= Ddot.ddot(i - 1, paramArrayOfDouble2, paramInt5, 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] -= Ddot.ddot(i - 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1);
            Dcopy.dcopy(i - 1, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble2, paramInt5, 1);
            Dsymv.dsymv(paramString, i - 1, -1.0D, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt5, 1, 0.0D, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfDouble1[(i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] -= Ddot.ddot(i - 1, paramArrayOfDouble2, paramInt5, 1, paramArrayOfDouble1, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, 1);
          }
          k = 2;
        }
        j = Math.abs(paramArrayOfInt[(i - 1 + paramInt4)]);
        if ((j == i ? 0 : 1) != 0)
        {
          Dswap.dswap(j - 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
          Dswap.dswap(i - j - 1, paramArrayOfDouble1, j + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, j - 1 + (j + 1 - 1) * paramInt3 + paramInt2, paramInt3);
          d6 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt3 + paramInt2)];
          paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt3 + paramInt2)] = d6;
          if ((k != 2 ? 0 : 1) != 0)
          {
            d6 = paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfDouble1[(i - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble1[(j - 1 + (i + 1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfDouble1[(j - 1 + (i + 1 - 1) * paramInt3 + paramInt2)] = d6;
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
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = (1.0D / paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)]);
          if ((i >= paramInt1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(paramInt1 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble2, paramInt5, 1);
            Dsymv.dsymv(paramString, paramInt1 - i, -1.0D, paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble2, paramInt5, 1, 0.0D, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] -= Ddot.ddot(paramInt1 - i, paramArrayOfDouble2, paramInt5, 1, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
          }
          k = 1;
        }
        else
        {
          d5 = Math.abs(paramArrayOfDouble1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)]);
          d1 = paramArrayOfDouble1[(i - 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] / d5;
          d3 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] / d5;
          d2 = paramArrayOfDouble1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] / d5;
          d4 = d5 * (d1 * d3 - 1.0D);
          paramArrayOfDouble1[(i - 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] = (d3 / d4);
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = (d1 / d4);
          paramArrayOfDouble1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] = (-(d2 / d4));
          if ((i >= paramInt1 ? 0 : 1) != 0)
          {
            Dcopy.dcopy(paramInt1 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble2, paramInt5, 1);
            Dsymv.dsymv(paramString, paramInt1 - i, -1.0D, paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble2, paramInt5, 1, 0.0D, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] -= Ddot.ddot(paramInt1 - i, paramArrayOfDouble2, paramInt5, 1, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfDouble1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] -= Ddot.ddot(paramInt1 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, i + 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2, 1);
            Dcopy.dcopy(paramInt1 - i, paramArrayOfDouble1, i + 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble2, paramInt5, 1);
            Dsymv.dsymv(paramString, paramInt1 - i, -1.0D, paramArrayOfDouble1, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble2, paramInt5, 1, 0.0D, paramArrayOfDouble1, i + 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2, 1);
            paramArrayOfDouble1[(i - 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] -= Ddot.ddot(paramInt1 - i, paramArrayOfDouble2, paramInt5, 1, paramArrayOfDouble1, i + 1 - 1 + (i - 1 - 1) * paramInt3 + paramInt2, 1);
          }
          k = 2;
        }
        j = Math.abs(paramArrayOfInt[(i - 1 + paramInt4)]);
        if ((j == i ? 0 : 1) != 0)
        {
          if ((j >= paramInt1 ? 0 : 1) != 0) {
            Dswap.dswap(paramInt1 - j, paramArrayOfDouble1, j + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1);
          }
          Dswap.dswap(j - i - 1, paramArrayOfDouble1, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, j - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3);
          d6 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
          paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt3 + paramInt2)];
          paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt3 + paramInt2)] = d6;
          if ((k != 2 ? 0 : 1) != 0)
          {
            d6 = paramArrayOfDouble1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfDouble1[(i - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] = paramArrayOfDouble1[(j - 1 + (i - 1 - 1) * paramInt3 + paramInt2)];
            paramArrayOfDouble1[(j - 1 + (i - 1 - 1) * paramInt3 + paramInt2)] = d6;
          }
        }
        i -= k;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsytri.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */