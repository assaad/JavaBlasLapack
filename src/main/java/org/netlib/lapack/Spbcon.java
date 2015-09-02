package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Spbcon
{
  public static void spbcon(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float paramFloat, floatW paramfloatW, float[] paramArrayOfFloat2, int paramInt5, int[] paramArrayOfInt, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    String str = new String(" ");
    int i = 0;
    intW localintW = new intW(0);
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    float f2 = 0.0F;
    int[] arrayOfInt = new int[3];
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
    } else if ((paramFloat >= 0.0F ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPBCON", -paramintW.val);
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
    localintW.val = 0;
    str = "N";
    for (;;)
    {
      Slacn2.slacn2(paramInt1, paramArrayOfFloat2, paramInt1 + 1 - 1 + paramInt5, paramArrayOfFloat2, paramInt5, paramArrayOfInt, paramInt6, localfloatW1, localintW, arrayOfInt, 0);
      if ((localintW.val == 0 ? 0 : 1) == 0) {
        break;
      }
      if (bool)
      {
        Slatbs.slatbs("Upper", "Transpose", "Non-unit", str, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, localfloatW2, paramArrayOfFloat2, 2 * paramInt1 + 1 - 1 + paramInt5, paramintW);
        str = "Y";
        Slatbs.slatbs("Upper", "No transpose", "Non-unit", str, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, localfloatW3, paramArrayOfFloat2, 2 * paramInt1 + 1 - 1 + paramInt5, paramintW);
      }
      else
      {
        Slatbs.slatbs("Lower", "No transpose", "Non-unit", str, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, localfloatW2, paramArrayOfFloat2, 2 * paramInt1 + 1 - 1 + paramInt5, paramintW);
        str = "Y";
        Slatbs.slatbs("Lower", "Transpose", "Non-unit", str, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, localfloatW3, paramArrayOfFloat2, 2 * paramInt1 + 1 - 1 + paramInt5, paramintW);
      }
      f1 = localfloatW2.val * localfloatW3.val;
      if ((f1 == 1.0F ? 0 : 1) != 0)
      {
        i = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt5, 1);
        if ((f1 >= Math.abs(paramArrayOfFloat2[(i - 1 + paramInt5)]) * f2 ? 0 : 1) == 0) {}
        if (((f1 != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
          return;
        }
        Srscl.srscl(paramInt1, f1, paramArrayOfFloat2, paramInt5, 1);
      }
    }
    if ((localfloatW1.val == 0.0F ? 0 : 1) != 0) {
      paramfloatW.val = (1.0F / localfloatW1.val / paramFloat);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spbcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */