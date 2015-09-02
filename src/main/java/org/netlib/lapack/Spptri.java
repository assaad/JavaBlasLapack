package org.netlib.lapack;

import org.netlib.blas.Sdot;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sspr;
import org.netlib.blas.Stpmv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spptri
{
  public static void spptri(String paramString, int paramInt1, float[] paramArrayOfFloat, int paramInt2, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
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
      Xerbla.xerbla("SPPTRI", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    Stptri.stptri(paramString, "Non-unit", paramInt1, paramArrayOfFloat, paramInt2, paramintW);
    if ((paramintW.val <= 0 ? 0 : 1) != 0) {
      return;
    }
    int n;
    if (bool)
    {
      k = 0;
      i = 1;
      for (n = paramInt1 - 1 + 1; n > 0; n--)
      {
        j = k + 1;
        k += i;
        if ((i <= 1 ? 0 : 1) != 0) {
          Sspr.sspr("Upper", i - 1, 1.0F, paramArrayOfFloat, j - 1 + paramInt2, 1, paramArrayOfFloat, paramInt2);
        }
        f = paramArrayOfFloat[(k - 1 + paramInt2)];
        Sscal.sscal(i, f, paramArrayOfFloat, j - 1 + paramInt2, 1);
        i += 1;
      }
    }
    else
    {
      k = 1;
      i = 1;
      for (n = paramInt1 - 1 + 1; n > 0; n--)
      {
        m = k + paramInt1 - i + 1;
        paramArrayOfFloat[(k - 1 + paramInt2)] = Sdot.sdot(paramInt1 - i + 1, paramArrayOfFloat, k - 1 + paramInt2, 1, paramArrayOfFloat, k - 1 + paramInt2, 1);
        if ((i >= paramInt1 ? 0 : 1) != 0) {
          Stpmv.stpmv("Lower", "Transpose", "Non-unit", paramInt1 - i, paramArrayOfFloat, m - 1 + paramInt2, paramArrayOfFloat, k + 1 - 1 + paramInt2, 1);
        }
        k = m;
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spptri.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */