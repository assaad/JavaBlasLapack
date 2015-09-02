package org.netlib.lapack;

import org.netlib.blas.Sgemm;
import org.netlib.blas.Ssyrk;
import org.netlib.blas.Strmm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Slauum
{
  public static void slauum(String paramString, int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
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
      Xerbla.xerbla("SLAUUM", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    k = Ilaenv.ilaenv(1, "SLAUUM", paramString, paramInt1, -1, -1, -1);
    if ((k > 1 ? 0 : 1) == 0) {}
    if (((k < paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Slauu2.slauu2(paramString, paramInt1, paramArrayOfFloat, paramInt2, paramInt3, paramintW);
    }
    else
    {
      int m;
      if (bool)
      {
        i = 1;
        for (m = (paramInt1 - 1 + k) / k; m > 0; m--)
        {
          j = Math.min(k, paramInt1 - i + 1);
          Strmm.strmm("Right", "Upper", "Transpose", "Non-unit", i - 1, j, 1.0F, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          Slauu2.slauu2("Upper", j, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramintW);
          if ((i + j > paramInt1 ? 0 : 1) != 0)
          {
            Sgemm.sgemm("No transpose", "Transpose", i - 1, j, paramInt1 - i - j + 1, 1.0F, paramArrayOfFloat, 1 - 1 + (i + j - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i - 1 + (i + j - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
            Ssyrk.ssyrk("Upper", "No transpose", j, paramInt1 - i - j + 1, 1.0F, paramArrayOfFloat, i - 1 + (i + j - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          }
          i += k;
        }
      }
      else
      {
        i = 1;
        for (m = (paramInt1 - 1 + k) / k; m > 0; m--)
        {
          j = Math.min(k, paramInt1 - i + 1);
          Strmm.strmm("Left", "Lower", "Transpose", "Non-unit", j, i - 1, 1.0F, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3);
          Slauu2.slauu2("Lower", j, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramintW);
          if ((i + j > paramInt1 ? 0 : 1) != 0)
          {
            Sgemm.sgemm("Transpose", "No transpose", j, i - 1, paramInt1 - i - j + 1, 1.0F, paramArrayOfFloat, i + j - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i + j - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, paramArrayOfFloat, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3);
            Ssyrk.ssyrk("Lower", "Transpose", j, paramInt1 - i - j + 1, 1.0F, paramArrayOfFloat, i + j - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          }
          i += k;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slauum.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */