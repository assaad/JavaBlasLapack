package org.netlib.lapack;

import org.netlib.blas.Sdot;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spotf2
{
  public static void spotf2(String paramString, int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, intW paramintW)
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
      Xerbla.xerbla("SPOTF2", -paramintW.val);
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
        f = paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] - Sdot.sdot(i - 1, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
        if ((f > 0.0F ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = f;
          break;
        }
        f = (float)Math.sqrt(f);
        paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = f;
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          Sgemv.sgemv("Transpose", i - 1, paramInt1 - i, -1.0F, paramArrayOfFloat, 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, 1.0F, paramArrayOfFloat, i - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3);
          Sscal.sscal(paramInt1 - i, 1.0F / f, paramArrayOfFloat, i - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3);
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        f = paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] - Sdot.sdot(i - 1, paramArrayOfFloat, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3);
        if ((f > 0.0F ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = f;
          break;
        }
        f = (float)Math.sqrt(f);
        paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = f;
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          Sgemv.sgemv("No transpose", paramInt1 - i, i - 1, -1.0F, paramArrayOfFloat, i + 1 - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, paramArrayOfFloat, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
          Sscal.sscal(paramInt1 - i, 1.0F / f, paramArrayOfFloat, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
        }
        i += 1;
      }
    }
    return;
    paramintW.val = i;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spotf2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */