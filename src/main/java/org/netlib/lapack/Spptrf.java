package org.netlib.lapack;

import org.netlib.blas.Sdot;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sspr;
import org.netlib.blas.Stpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spptrf
{
  public static void spptrf(String paramString, int paramInt1, float[] paramArrayOfFloat, int paramInt2, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    float f = 0.0F;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPPTRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int m;
    if (bool)
    {
      k = 0;
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        j = k + 1;
        k += i;
        if ((i <= 1 ? 0 : 1) != 0) {
          Stpsv.stpsv("Upper", "Transpose", "Non-unit", i - 1, paramArrayOfFloat, paramInt2, paramArrayOfFloat, j - 1 + paramInt2, 1);
        }
        f = paramArrayOfFloat[(k - 1 + paramInt2)] - Sdot.sdot(i - 1, paramArrayOfFloat, j - 1 + paramInt2, 1, paramArrayOfFloat, j - 1 + paramInt2, 1);
        if ((f > 0.0F ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(k - 1 + paramInt2)] = f;
          break;
        }
        paramArrayOfFloat[(k - 1 + paramInt2)] = ((float)Math.sqrt(f));
        i += 1;
      }
    }
    else
    {
      k = 1;
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        f = paramArrayOfFloat[(k - 1 + paramInt2)];
        if ((f > 0.0F ? 0 : 1) != 0)
        {
          paramArrayOfFloat[(k - 1 + paramInt2)] = f;
          break;
        }
        f = (float)Math.sqrt(f);
        paramArrayOfFloat[(k - 1 + paramInt2)] = f;
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          Sscal.sscal(paramInt1 - i, 1.0F / f, paramArrayOfFloat, k + 1 - 1 + paramInt2, 1);
          Sspr.sspr("Lower", paramInt1 - i, -1.0F, paramArrayOfFloat, k + 1 - 1 + paramInt2, 1, paramArrayOfFloat, k + paramInt1 - i + 1 - 1 + paramInt2);
          k = k + paramInt1 - i + 1;
        }
        i += 1;
      }
    }
    return;
    paramintW.val = i;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spptrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */