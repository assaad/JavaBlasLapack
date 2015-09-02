package org.netlib.lapack;

import org.netlib.blas.Ddot;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dlauu2
{
  public static void dlauu2(String paramString, int paramInt1, double[] paramArrayOfDouble, int paramInt2, int paramInt3, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    double d = 0.0D;
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
      Xerbla.xerbla("DLAUU2", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int j;
    if (bool)
    {
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        d = paramArrayOfDouble[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          paramArrayOfDouble[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = Ddot.ddot(paramInt1 - i + 1, paramArrayOfDouble, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          Dgemv.dgemv("No transpose", i - 1, paramInt1 - i, 1.0D, paramArrayOfDouble, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble, i - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, d, paramArrayOfDouble, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
        }
        else
        {
          Dscal.dscal(i, d, paramArrayOfDouble, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        d = paramArrayOfDouble[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          paramArrayOfDouble[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = Ddot.ddot(paramInt1 - i + 1, paramArrayOfDouble, i - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble, i - 1 + (i - 1) * paramInt3 + paramInt2, 1);
          Dgemv.dgemv("Transpose", paramInt1 - i, i - 1, 1.0D, paramArrayOfDouble, i + 1 - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, d, paramArrayOfDouble, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3);
        }
        else
        {
          Dscal.dscal(i, d, paramArrayOfDouble, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3);
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlauu2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */