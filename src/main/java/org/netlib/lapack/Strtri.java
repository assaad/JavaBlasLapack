package org.netlib.lapack;

import org.netlib.blas.Strmm;
import org.netlib.blas.Strsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Strtri
{
  public static void strtri(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    paramintW.val = 0;
    bool2 = Lsame.lsame(paramString1, "U");
    bool1 = Lsame.lsame(paramString2, "N");
    if ((((bool2 ^ true)) && ((Lsame.lsame(paramString1, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((((bool1 ^ true)) && ((Lsame.lsame(paramString2, "U") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STRTRI", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    int n;
    if (bool1)
    {
      paramintW.val = 1;
      for (n = paramInt1 - 1 + 1; n > 0; n--)
      {
        if ((paramArrayOfFloat[(paramintW.val - 1 + (paramintW.val - 1) * paramInt3 + paramInt2)] != 0.0F ? 0 : 1) != 0) {
          return;
        }
        paramintW.val += 1;
      }
      paramintW.val = 0;
    }
    k = Ilaenv.ilaenv(1, "STRTRI", paramString1 + paramString2, paramInt1, -1, -1, -1);
    if ((k > 1 ? 0 : 1) == 0) {}
    if (((k < paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Strti2.strti2(paramString1, paramString2, paramInt1, paramArrayOfFloat, paramInt2, paramInt3, paramintW);
    }
    else if (bool2)
    {
      i = 1;
      for (n = (paramInt1 - 1 + k) / k; n > 0; n--)
      {
        j = Math.min(k, paramInt1 - i + 1);
        Strmm.strmm("Left", "Upper", "No transpose", paramString2, i - 1, j, 1.0F, paramArrayOfFloat, paramInt2, paramInt3, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
        Strsm.strsm("Right", "Upper", "No transpose", paramString2, i - 1, j, -1.0F, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
        Strti2.strti2("Upper", paramString2, j, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramintW);
        i += k;
      }
    }
    else
    {
      m = (paramInt1 - 1) / k * k + 1;
      i = m;
      for (n = (1 - m + -k) / -k; n > 0; n--)
      {
        j = Math.min(k, paramInt1 - i + 1);
        if ((i + j > paramInt1 ? 0 : 1) != 0)
        {
          Strmm.strmm("Left", "Lower", "No transpose", paramString2, paramInt1 - i - j + 1, j, 1.0F, paramArrayOfFloat, i + j - 1 + (i + j - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i + j - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          Strsm.strsm("Right", "Lower", "No transpose", paramString2, paramInt1 - i - j + 1, j, -1.0F, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i + j - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
        }
        Strti2.strti2("Lower", paramString2, j, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramintW);
        i += -k;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Strtri.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */