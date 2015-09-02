package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Saxpy;
import org.netlib.blas.Sdot;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgbcon
{
  public static void sgbcon(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, int[] paramArrayOfInt1, int paramInt6, float paramFloat, floatW paramfloatW, float[] paramArrayOfFloat2, int paramInt7, int[] paramArrayOfInt2, int paramInt8, intW paramintW)
  {
    int i = 0;
    int j = 0;
    String str = new String(" ");
    int k = 0;
    int m = 0;
    int n = 0;
    intW localintW = new intW(0);
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    j = (!paramString.regionMatches(0, "1", 0, 1)) && (!Lsame.lsame(paramString, "O")) ? 0 : 1;
    if ((((j ^ 0x1) != 0) && ((Lsame.lsame(paramString, "I") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt5 >= 2 * paramInt2 + paramInt3 + 1 ? 0 : 1) != 0) {
      paramintW.val = -6;
    } else if ((paramFloat >= 0.0F ? 0 : 1) != 0) {
      paramintW.val = -8;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGBCON", -paramintW.val);
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
    f1 = Slamch.slamch("Safe minimum");
    localfloatW1.val = 0.0F;
    str = "N";
    if (j != 0) {
      i1 = 1;
    } else {
      i1 = 2;
    }
    i2 = paramInt2 + paramInt3 + 1;
    i = paramInt2 <= 0 ? 0 : 1;
    localintW.val = 0;
    for (;;)
    {
      Slacn2.slacn2(paramInt1, paramArrayOfFloat2, paramInt1 + 1 - 1 + paramInt7, paramArrayOfFloat2, paramInt7, paramArrayOfInt2, paramInt8, localfloatW1, localintW, arrayOfInt, 0);
      if ((localintW.val == 0 ? 0 : 1) == 0) {
        break;
      }
      int i4;
      if ((localintW.val != i1 ? 0 : 1) != 0)
      {
        if (i != 0)
        {
          m = 1;
          for (i4 = paramInt1 - 1 - 1 + 1; i4 > 0; i4--)
          {
            i3 = Math.min(paramInt2, paramInt1 - m);
            n = paramArrayOfInt1[(m - 1 + paramInt6)];
            f2 = paramArrayOfFloat2[(n - 1 + paramInt7)];
            if ((n == m ? 0 : 1) != 0)
            {
              paramArrayOfFloat2[(n - 1 + paramInt7)] = paramArrayOfFloat2[(m - 1 + paramInt7)];
              paramArrayOfFloat2[(m - 1 + paramInt7)] = f2;
            }
            Saxpy.saxpy(i3, -f2, paramArrayOfFloat1, i2 + 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, m + 1 - 1 + paramInt7, 1);
            m += 1;
          }
        }
        Slatbs.slatbs("Upper", "No transpose", "Non-unit", str, paramInt1, paramInt2 + paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt7, localfloatW2, paramArrayOfFloat2, 2 * paramInt1 + 1 - 1 + paramInt7, paramintW);
      }
      else
      {
        Slatbs.slatbs("Upper", "Transpose", "Non-unit", str, paramInt1, paramInt2 + paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt7, localfloatW2, paramArrayOfFloat2, 2 * paramInt1 + 1 - 1 + paramInt7, paramintW);
        if (i != 0)
        {
          m = paramInt1 - 1;
          for (i4 = (1 - (paramInt1 - 1) + -1) / -1; i4 > 0; i4--)
          {
            i3 = Math.min(paramInt2, paramInt1 - m);
            paramArrayOfFloat2[(m - 1 + paramInt7)] -= Sdot.sdot(i3, paramArrayOfFloat1, i2 + 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, m + 1 - 1 + paramInt7, 1);
            n = paramArrayOfInt1[(m - 1 + paramInt6)];
            if ((n == m ? 0 : 1) != 0)
            {
              f2 = paramArrayOfFloat2[(n - 1 + paramInt7)];
              paramArrayOfFloat2[(n - 1 + paramInt7)] = paramArrayOfFloat2[(m - 1 + paramInt7)];
              paramArrayOfFloat2[(m - 1 + paramInt7)] = f2;
            }
            m += -1;
          }
        }
      }
      str = "Y";
      if ((localfloatW2.val == 1.0F ? 0 : 1) != 0)
      {
        k = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt7, 1);
        if ((localfloatW2.val >= Math.abs(paramArrayOfFloat2[(k - 1 + paramInt7)]) * f1 ? 0 : 1) == 0) {}
        if (((localfloatW2.val != 0.0F ? 0 : 1) == 0 ? 0 : 1) != 0) {
          return;
        }
        Srscl.srscl(paramInt1, localfloatW2.val, paramArrayOfFloat2, paramInt7, 1);
      }
    }
    if ((localfloatW1.val == 0.0F ? 0 : 1) != 0) {
      paramfloatW.val = (1.0F / localfloatW1.val / paramFloat);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgbcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */