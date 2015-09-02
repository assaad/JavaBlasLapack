package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.blas.Stpmv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Stptri
{
  public static void stptri(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat, int paramInt2, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    float f = 0.0F;
    paramintW.val = 0;
    bool2 = Lsame.lsame(paramString1, "U");
    bool1 = Lsame.lsame(paramString2, "N");
    if ((((bool2 ^ true)) && ((Lsame.lsame(paramString1, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((((bool1 ^ true)) && ((Lsame.lsame(paramString2, "U") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STPTRI", -paramintW.val);
      return;
    }
    int n;
    if (bool1)
    {
      if (bool2)
      {
        m = 0;
        paramintW.val = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          m += paramintW.val;
          if ((paramArrayOfFloat[(m - 1 + paramInt2)] != 0.0F ? 0 : 1) != 0) {
            return;
          }
          paramintW.val += 1;
        }
      }
      else
      {
        m = 1;
        paramintW.val = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          if ((paramArrayOfFloat[(m - 1 + paramInt2)] != 0.0F ? 0 : 1) != 0) {
            return;
          }
          m = m + paramInt1 - paramintW.val + 1;
          paramintW.val += 1;
        }
      }
      paramintW.val = 0;
    }
    if (bool2)
    {
      j = 1;
      i = 1;
      for (n = paramInt1 - 1 + 1; n > 0; n--)
      {
        if (bool1)
        {
          paramArrayOfFloat[(j + i - 1 - 1 + paramInt2)] = (1.0F / paramArrayOfFloat[(j + i - 1 - 1 + paramInt2)]);
          f = -paramArrayOfFloat[(j + i - 1 - 1 + paramInt2)];
        }
        else
        {
          f = -1.0F;
        }
        Stpmv.stpmv("Upper", "No transpose", paramString2, i - 1, paramArrayOfFloat, paramInt2, paramArrayOfFloat, j - 1 + paramInt2, 1);
        Sscal.sscal(i - 1, f, paramArrayOfFloat, j - 1 + paramInt2, 1);
        j += i;
        i += 1;
      }
    }
    else
    {
      j = paramInt1 * (paramInt1 + 1) / 2;
      i = paramInt1;
      for (n = (1 - paramInt1 + -1) / -1; n > 0; n--)
      {
        if (bool1)
        {
          paramArrayOfFloat[(j - 1 + paramInt2)] = (1.0F / paramArrayOfFloat[(j - 1 + paramInt2)]);
          f = -paramArrayOfFloat[(j - 1 + paramInt2)];
        }
        else
        {
          f = -1.0F;
        }
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          Stpmv.stpmv("Lower", "No transpose", paramString2, paramInt1 - i, paramArrayOfFloat, k - 1 + paramInt2, paramArrayOfFloat, j + 1 - 1 + paramInt2, 1);
          Sscal.sscal(paramInt1 - i, f, paramArrayOfFloat, j + 1 - 1 + paramInt2, 1);
        }
        k = j;
        j = j - paramInt1 + i - 2;
        i += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stptri.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */