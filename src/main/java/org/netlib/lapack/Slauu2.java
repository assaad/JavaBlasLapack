package org.netlib.lapack;

import org.netlib.blas.Sdot;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Slauu2
{
  public static void slauu2(String paramString, int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    float f = 0.0F;
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
      Xerbla.xerbla("SLAUU2", -paramintW.val);
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
        f = paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = Sdot.sdot(paramInt1 - i + 1, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          Sgemv.sgemv("No transpose", i - 1, paramInt1 - i, 1.0F, paramArrayOfFloat, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, f, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
        }
        else
        {
          Sscal.sscal(i, f, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        f = paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = Sdot.sdot(paramInt1 - i + 1, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, 1);
          Sgemv.sgemv("Transpose", paramInt1 - i, i - 1, 1.0F, paramArrayOfFloat, i + 1 - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, f, paramArrayOfFloat, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3);
        }
        else
        {
          Sscal.sscal(i, f, paramArrayOfFloat, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3);
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slauu2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */