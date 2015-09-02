package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Stbcon
{
  public static void stbcon(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, floatW paramfloatW, float[] paramArrayOfFloat2, int paramInt5, int[] paramArrayOfInt, int paramInt6, intW paramintW)
  {
    boolean bool1 = false;
    int i = 0;
    boolean bool2 = false;
    String str = new String(" ");
    int j = 0;
    intW localintW = new intW(0);
    int k = 0;
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f2 = 0.0F;
    float f3 = 0.0F;
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool2 = Lsame.lsame(paramString2, "U");
    i = (!paramString1.regionMatches(0, "1", 0, 1)) && (!Lsame.lsame(paramString1, "O")) ? 0 : 1;
    bool1 = Lsame.lsame(paramString3, "N");
    if ((((i ^ 0x1) != 0) && ((Lsame.lsame(paramString1, "I") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((((bool1 ^ true)) && ((Lsame.lsame(paramString3, "U") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -3;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt4 >= paramInt2 + 1 ? 0 : 1) != 0) {
      paramintW.val = -7;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("STBCON", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramfloatW.val = 1.0F;
      return;
    }
    paramfloatW.val = 0.0F;
    f2 = Slamch.slamch("Safe minimum") * Math.max(1, paramInt1);
    f1 = Slantb.slantb(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5);
    if ((f1 <= 0.0F ? 0 : 1) != 0)
    {
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
        Slacn2.slacn2(paramInt1, paramArrayOfFloat2, paramInt1 + 1 - 1 + paramInt5, paramArrayOfFloat2, paramInt5, paramArrayOfInt, paramInt6, localfloatW1, localintW, arrayOfInt, 0);
        if ((localintW.val == 0 ? 0 : 1) == 0) {
          break;
        }
        if ((localintW.val != k ? 0 : 1) != 0) {
          Slatbs.slatbs(paramString2, "No transpose", paramString3, str, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, localfloatW2, paramArrayOfFloat2, 2 * paramInt1 + 1 - 1 + paramInt5, paramintW);
        } else {
          Slatbs.slatbs(paramString2, "Transpose", paramString3, str, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, localfloatW2, paramArrayOfFloat2, 2 * paramInt1 + 1 - 1 + paramInt5, paramintW);
        }
        str = "Y";
        if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
        {
          j = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt5, 1);
          f3 = Math.abs(paramArrayOfFloat2[(j - 1 + paramInt5)]);
          if ((localfloatW2.val >= f3 * f2 ? 0 : 1) == 0) {}
          if (((localfloatW2.val != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
            return;
          }
          Srscl.srscl(paramInt1, localfloatW2.val, paramArrayOfFloat2, paramInt5, 1);
        }
      }
      if ((localfloatW1.val == 0.0F ? 0 : 1) != 0) {
        paramfloatW.val = (1.0F / f1 / localfloatW1.val);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stbcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */