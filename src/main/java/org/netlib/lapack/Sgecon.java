package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgecon
{
  public static void sgecon(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float paramFloat, floatW paramfloatW, float[] paramArrayOfFloat2, int paramInt4, int[] paramArrayOfInt, int paramInt5, intW paramintW)
  {
    int i = 0;
    String str = new String(" ");
    int j = 0;
    intW localintW = new intW(0);
    int k = 0;
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f2 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    i = (!paramString.regionMatches(0, "1", 0, 1)) && (!Lsame.lsame(paramString, "O")) ? 0 : 1;
    if ((((i ^ 0x1) != 0) && ((Lsame.lsame(paramString, "I") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramFloat >= 0.0F ? 0 : 1) != 0) {
      paramintW.val = -5;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGECON", -paramintW.val);
      return;
    }
    paramfloatW.val = 0.0F;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramfloatW.val = 1.0F;
      return;
    }
    if ((paramFloat != 0.0F ? 0 : 1) != 0) {
      return;
    }
    f2 = Slamch.slamch("Safe minimum");
    localfloatW1.val = 0.0F;
    str = "N";
    if (i != 0) {
      k = 1;
    } else {
      k = 2;
    }
    localintW.val = 0;
    for (;;)
    {
      Slacn2.slacn2(paramInt1, paramArrayOfFloat2, paramInt1 + 1 - 1 + paramInt4, paramArrayOfFloat2, paramInt4, paramArrayOfInt, paramInt5, localfloatW1, localintW, arrayOfInt, 0);
      if ((localintW.val == 0 ? 0 : 1) == 0) {
        break;
      }
      if ((localintW.val != k ? 0 : 1) != 0)
      {
        Slatrs.slatrs("Lower", "No transpose", "Unit", str, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, localfloatW2, paramArrayOfFloat2, 2 * paramInt1 + 1 - 1 + paramInt4, paramintW);
        Slatrs.slatrs("Upper", "No transpose", "Non-unit", str, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, localfloatW3, paramArrayOfFloat2, 3 * paramInt1 + 1 - 1 + paramInt4, paramintW);
      }
      else
      {
        Slatrs.slatrs("Upper", "Transpose", "Non-unit", str, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, localfloatW3, paramArrayOfFloat2, 3 * paramInt1 + 1 - 1 + paramInt4, paramintW);
        Slatrs.slatrs("Lower", "Transpose", "Unit", str, paramInt1, paramArrayOfFloat1, paramInt2, paramInt3, paramArrayOfFloat2, paramInt4, localfloatW2, paramArrayOfFloat2, 2 * paramInt1 + 1 - 1 + paramInt4, paramintW);
      }
      f1 = localfloatW2.val * localfloatW3.val;
      str = "Y";
      if ((f1 == 1.0F ? 0 : 1) != 0)
      {
        j = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt4, 1);
        if ((f1 >= Math.abs(paramArrayOfFloat2[(j - 1 + paramInt4)]) * f2 ? 0 : 1) == 0) {}
        if (((f1 != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
          return;
        }
        Srscl.srscl(paramInt1, f1, paramArrayOfFloat2, paramInt4, 1);
      }
    }
    if ((localfloatW1.val == 0.0F ? 0 : 1) != 0) {
      paramfloatW.val = (1.0F / localfloatW1.val / paramFloat);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgecon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */