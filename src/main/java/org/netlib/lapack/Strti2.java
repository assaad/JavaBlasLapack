package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.blas.Strmv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Strti2
{
  public static void strti2(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
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
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STRTI2", -paramintW.val);
      return;
    }
    int j;
    if (bool2)
    {
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        if (bool1)
        {
          paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = (1.0F / paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)]);
          f = -paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
        }
        else
        {
          f = -1.0F;
        }
        Strmv.strmv("Upper", "No transpose", paramString2, i - 1, paramArrayOfFloat, paramInt2, paramInt3, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
        Sscal.sscal(i - 1, f, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
        i += 1;
      }
    }
    else
    {
      i = paramInt1;
      for (j = (1 - paramInt1 + -1) / -1; j > 0; j--)
      {
        if (bool1)
        {
          paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = (1.0F / paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)]);
          f = -paramArrayOfFloat[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
        }
        else
        {
          f = -1.0F;
        }
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          Strmv.strmv("Lower", "No transpose", paramString2, paramInt1 - i, paramArrayOfFloat, i + 1 - 1 + (i + 1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
          Sscal.sscal(paramInt1 - i, f, paramArrayOfFloat, i + 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
        }
        i += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Strti2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */