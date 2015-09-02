package org.netlib.lapack;

import org.netlib.blas.Snrm2;
import org.netlib.blas.Sscal;
import org.netlib.util.Util;
import org.netlib.util.floatW;

public final class Slarfg
{
  public static void slarfg(int paramInt1, floatW paramfloatW1, float[] paramArrayOfFloat, int paramInt2, int paramInt3, floatW paramfloatW2)
  {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    if ((paramInt1 > 1 ? 0 : 1) != 0)
    {
      paramfloatW2.val = 0.0F;
      return;
    }
    f4 = Snrm2.snrm2(paramInt1 - 1, paramArrayOfFloat, paramInt2, paramInt3);
    if ((f4 != 0.0F ? 0 : 1) != 0)
    {
      paramfloatW2.val = 0.0F;
    }
    else
    {
      f1 = -Util.sign(Slapy2.slapy2(paramfloatW1.val, f4), paramfloatW1.val);
      f3 = Slamch.slamch("S") / Slamch.slamch("E");
      if ((Math.abs(f1) >= f3 ? 0 : 1) != 0)
      {
        f2 = 1.0F / f3;
        j = 0;
        do
        {
          j += 1;
          Sscal.sscal(paramInt1 - 1, f2, paramArrayOfFloat, paramInt2, paramInt3);
          f1 *= f2;
          paramfloatW1.val *= f2;
        } while ((Math.abs(f1) >= f3 ? 0 : 1) != 0);
        f4 = Snrm2.snrm2(paramInt1 - 1, paramArrayOfFloat, paramInt2, paramInt3);
        f1 = -Util.sign(Slapy2.slapy2(paramfloatW1.val, f4), paramfloatW1.val);
        paramfloatW2.val = ((f1 - paramfloatW1.val) / f1);
        Sscal.sscal(paramInt1 - 1, 1.0F / (paramfloatW1.val - f1), paramArrayOfFloat, paramInt2, paramInt3);
        paramfloatW1.val = f1;
        i = 1;
        for (int k = j - 1 + 1; k > 0; k--)
        {
          paramfloatW1.val *= f3;
          i += 1;
        }
      }
      else
      {
        paramfloatW2.val = ((f1 - paramfloatW1.val) / f1);
        Sscal.sscal(paramInt1 - 1, 1.0F / (paramfloatW1.val - f1), paramArrayOfFloat, paramInt2, paramInt3);
        paramfloatW1.val = f1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarfg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */