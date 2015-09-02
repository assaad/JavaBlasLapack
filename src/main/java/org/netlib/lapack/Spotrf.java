package org.netlib.lapack;

import org.netlib.blas.Sgemm;
import org.netlib.blas.Ssyrk;
import org.netlib.blas.Strsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spotrf
{
  public static void spotrf(String paramString, int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, intW paramintW)
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
      Xerbla.xerbla("SPOTRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    k = Ilaenv.ilaenv(1, "SPOTRF", paramString, paramInt1, -1, -1, -1);
    if ((k > 1 ? 0 : 1) == 0) {}
    if (((k < paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Spotf2.spotf2(paramString, paramInt1, paramArrayOfFloat, paramInt2, paramInt3, paramintW);
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
          Ssyrk.ssyrk("Upper", "Transpose", j, i - 1, -1.0F, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          Spotf2.spotf2("Upper", j, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramintW);
          if ((paramintW.val == 0 ? 0 : 1) != 0) {
            break;
          }
          if ((i + j > paramInt1 ? 0 : 1) != 0)
          {
            Sgemm.sgemm("Transpose", "No transpose", j, paramInt1 - i - j + 1, i - 1, -1.0F, paramArrayOfFloat, 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, 1 - 1 + (i + j - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, paramArrayOfFloat, i - 1 + (i + j - 1) * paramInt3 + paramInt2, paramInt3);
            Strsm.strsm("Left", "Upper", "Transpose", "Non-unit", j, paramInt1 - i - j + 1, 1.0F, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i - 1 + (i + j - 1) * paramInt3 + paramInt2, paramInt3);
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
          Ssyrk.ssyrk("Lower", "No transpose", j, i - 1, -1.0F, paramArrayOfFloat, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          Spotf2.spotf2("Lower", j, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramintW);
          if ((paramintW.val == 0 ? 0 : 1) != 0) {
            break;
          }
          if ((i + j > paramInt1 ? 0 : 1) != 0)
          {
            Sgemm.sgemm("No transpose", "Transpose", paramInt1 - i - j + 1, j, i - 1, -1.0F, paramArrayOfFloat, i + j - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, 1.0F, paramArrayOfFloat, i + j - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
            Strsm.strsm("Right", "Lower", "Transpose", "Non-unit", paramInt1 - i - j + 1, j, 1.0F, paramArrayOfFloat, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat, i + j - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          }
          i += k;
        }
      }
    }
    return;
    paramintW.val = (paramintW.val + i - 1);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spotrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */