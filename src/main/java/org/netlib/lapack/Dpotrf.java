package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.blas.Dsyrk;
import org.netlib.blas.Dtrsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dpotrf
{
  public static void dpotrf(String paramString, int paramInt1, double[] paramArrayOfDouble, int paramInt2, int paramInt3, intW paramintW)
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
      Xerbla.xerbla("DPOTRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    k = Ilaenv.ilaenv(1, "DPOTRF", paramString, paramInt1, -1, -1, -1);
    if ((k > 1 ? 0 : 1) == 0) {}
    if (((k < paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Dpotf2.dpotf2(paramString, paramInt1, paramArrayOfDouble, paramInt2, paramInt3, paramintW);
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
          Dsyrk.dsyrk("Upper", "Transpose", j, i - 1, -1.0D, paramArrayOfDouble, 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, 1.0D, paramArrayOfDouble, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          Dpotf2.dpotf2("Upper", j, paramArrayOfDouble, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramintW);
          if ((paramintW.val == 0 ? 0 : 1) != 0) {
            break;
          }
          if ((i + j > paramInt1 ? 0 : 1) != 0)
          {
            Dgemm.dgemm("Transpose", "No transpose", j, paramInt1 - i - j + 1, i - 1, -1.0D, paramArrayOfDouble, 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble, 1 - 1 + (i + j - 1) * paramInt3 + paramInt2, paramInt3, 1.0D, paramArrayOfDouble, i - 1 + (i + j - 1) * paramInt3 + paramInt2, paramInt3);
            Dtrsm.dtrsm("Left", "Upper", "Transpose", "Non-unit", j, paramInt1 - i - j + 1, 1.0D, paramArrayOfDouble, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble, i - 1 + (i + j - 1) * paramInt3 + paramInt2, paramInt3);
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
          Dsyrk.dsyrk("Lower", "No transpose", j, i - 1, -1.0D, paramArrayOfDouble, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, 1.0D, paramArrayOfDouble, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          Dpotf2.dpotf2("Lower", j, paramArrayOfDouble, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramintW);
          if ((paramintW.val == 0 ? 0 : 1) != 0) {
            break;
          }
          if ((i + j > paramInt1 ? 0 : 1) != 0)
          {
            Dgemm.dgemm("No transpose", "Transpose", paramInt1 - i - j + 1, j, i - 1, -1.0D, paramArrayOfDouble, i + j - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble, i - 1 + (1 - 1) * paramInt3 + paramInt2, paramInt3, 1.0D, paramArrayOfDouble, i + j - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
            Dtrsm.dtrsm("Right", "Lower", "Transpose", "Non-unit", paramInt1 - i - j + 1, j, 1.0D, paramArrayOfDouble, i - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble, i + j - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3);
          }
          i += k;
        }
      }
    }
    return;
    paramintW.val = (paramintW.val + i - 1);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpotrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */