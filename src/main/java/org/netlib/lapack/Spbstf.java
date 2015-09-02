package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.blas.Ssyr;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spbstf
{
  public static void spbstf(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, int paramInt4, intW paramintW)
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
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= paramInt2 + 1 ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPBSTF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    j = Math.max(1, paramInt4 - 1);
    m = (paramInt1 + paramInt2) / 2;
    int n;
    if (bool)
    {
      i = paramInt1;
      for (n = (m + 1 - paramInt1 + -1) / -1; n > 0; n--)
      {
        f = paramArrayOfFloat[(paramInt2 + 1 - 1 + (i - 1) * paramInt4 + paramInt3)];
        if ((f > 0.0F ? 0 : 1) != 0) {
          break;
        }
        f = (float)Math.sqrt(f);
        paramArrayOfFloat[(paramInt2 + 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = f;
        k = Math.min(i - 1, paramInt2);
        Sscal.sscal(k, 1.0F / f, paramArrayOfFloat, paramInt2 + 1 - k - 1 + (i - 1) * paramInt4 + paramInt3, 1);
        Ssyr.ssyr("Upper", k, -1.0F, paramArrayOfFloat, paramInt2 + 1 - k - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat, paramInt2 + 1 - 1 + (i - k - 1) * paramInt4 + paramInt3, j);
        i += -1;
      }
      i = 1;
      for (n = m - 1 + 1; n > 0; n--)
      {
        f = paramArrayOfFloat[(paramInt2 + 1 - 1 + (i - 1) * paramInt4 + paramInt3)];
        if ((f > 0.0F ? 0 : 1) != 0) {
          break;
        }
        f = (float)Math.sqrt(f);
        paramArrayOfFloat[(paramInt2 + 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = f;
        k = Math.min(paramInt2, m - i);
        if ((k <= 0 ? 0 : 1) != 0)
        {
          Sscal.sscal(k, 1.0F / f, paramArrayOfFloat, paramInt2 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, j);
          Ssyr.ssyr("Upper", k, -1.0F, paramArrayOfFloat, paramInt2 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, j, paramArrayOfFloat, paramInt2 + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, j);
        }
        i += 1;
      }
    }
    else
    {
      i = paramInt1;
      for (n = (m + 1 - paramInt1 + -1) / -1; n > 0; n--)
      {
        f = paramArrayOfFloat[(1 - 1 + (i - 1) * paramInt4 + paramInt3)];
        if ((f > 0.0F ? 0 : 1) != 0) {
          break;
        }
        f = (float)Math.sqrt(f);
        paramArrayOfFloat[(1 - 1 + (i - 1) * paramInt4 + paramInt3)] = f;
        k = Math.min(i - 1, paramInt2);
        Sscal.sscal(k, 1.0F / f, paramArrayOfFloat, k + 1 - 1 + (i - k - 1) * paramInt4 + paramInt3, j);
        Ssyr.ssyr("Lower", k, -1.0F, paramArrayOfFloat, k + 1 - 1 + (i - k - 1) * paramInt4 + paramInt3, j, paramArrayOfFloat, 1 - 1 + (i - k - 1) * paramInt4 + paramInt3, j);
        i += -1;
      }
      i = 1;
      for (n = m - 1 + 1; n > 0; n--)
      {
        f = paramArrayOfFloat[(1 - 1 + (i - 1) * paramInt4 + paramInt3)];
        if ((f > 0.0F ? 0 : 1) != 0) {
          break;
        }
        f = (float)Math.sqrt(f);
        paramArrayOfFloat[(1 - 1 + (i - 1) * paramInt4 + paramInt3)] = f;
        k = Math.min(paramInt2, m - i);
        if ((k <= 0 ? 0 : 1) != 0)
        {
          Sscal.sscal(k, 1.0F / f, paramArrayOfFloat, 2 - 1 + (i - 1) * paramInt4 + paramInt3, 1);
          Ssyr.ssyr("Lower", k, -1.0F, paramArrayOfFloat, 2 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat, 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, j);
        }
        i += 1;
      }
    }
    return;
    paramintW.val = i;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spbstf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */