package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgbcon
{
  public static void dgbcon(String paramString, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, int[] paramArrayOfInt1, int paramInt6, double paramDouble, doubleW paramdoubleW, double[] paramArrayOfDouble2, int paramInt7, int[] paramArrayOfInt2, int paramInt8, intW paramintW)
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
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
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
    } else if ((paramDouble >= 0.0D ? 0 : 1) != 0) {
      paramintW.val = -8;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGBCON", -paramintW.val);
      return;
    }
    paramdoubleW.val = 0.0D;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramdoubleW.val = 1.0D;
      return;
    }
    if ((paramDouble != 0.0D ? 0 : 1) != 0) {
      return;
    }
    d1 = Dlamch.dlamch("Safe minimum");
    localdoubleW1.val = 0.0D;
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
      Dlacn2.dlacn2(paramInt1, paramArrayOfDouble2, paramInt1 + 1 - 1 + paramInt7, paramArrayOfDouble2, paramInt7, paramArrayOfInt2, paramInt8, localdoubleW1, localintW, arrayOfInt, 0);
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
            d2 = paramArrayOfDouble2[(n - 1 + paramInt7)];
            if ((n == m ? 0 : 1) != 0)
            {
              paramArrayOfDouble2[(n - 1 + paramInt7)] = paramArrayOfDouble2[(m - 1 + paramInt7)];
              paramArrayOfDouble2[(m - 1 + paramInt7)] = d2;
            }
            Daxpy.daxpy(i3, -d2, paramArrayOfDouble1, i2 + 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, m + 1 - 1 + paramInt7, 1);
            m += 1;
          }
        }
        Dlatbs.dlatbs("Upper", "No transpose", "Non-unit", str, paramInt1, paramInt2 + paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt7, localdoubleW2, paramArrayOfDouble2, 2 * paramInt1 + 1 - 1 + paramInt7, paramintW);
      }
      else
      {
        Dlatbs.dlatbs("Upper", "Transpose", "Non-unit", str, paramInt1, paramInt2 + paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt7, localdoubleW2, paramArrayOfDouble2, 2 * paramInt1 + 1 - 1 + paramInt7, paramintW);
        if (i != 0)
        {
          m = paramInt1 - 1;
          for (i4 = (1 - (paramInt1 - 1) + -1) / -1; i4 > 0; i4--)
          {
            i3 = Math.min(paramInt2, paramInt1 - m);
            paramArrayOfDouble2[(m - 1 + paramInt7)] -= Ddot.ddot(i3, paramArrayOfDouble1, i2 + 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, m + 1 - 1 + paramInt7, 1);
            n = paramArrayOfInt1[(m - 1 + paramInt6)];
            if ((n == m ? 0 : 1) != 0)
            {
              d2 = paramArrayOfDouble2[(n - 1 + paramInt7)];
              paramArrayOfDouble2[(n - 1 + paramInt7)] = paramArrayOfDouble2[(m - 1 + paramInt7)];
              paramArrayOfDouble2[(m - 1 + paramInt7)] = d2;
            }
            m += -1;
          }
        }
      }
      str = "Y";
      if ((localdoubleW2.val == 1.0D ? 0 : 1) != 0)
      {
        k = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt7, 1);
        if ((localdoubleW2.val >= Math.abs(paramArrayOfDouble2[(k - 1 + paramInt7)]) * d1 ? 0 : 1) == 0) {}
        if (((localdoubleW2.val != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
          return;
        }
        Drscl.drscl(paramInt1, localdoubleW2.val, paramArrayOfDouble2, paramInt7, 1);
      }
    }
    if ((localdoubleW1.val == 0.0D ? 0 : 1) != 0) {
      paramdoubleW.val = (1.0D / localdoubleW1.val / paramDouble);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgbcon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */