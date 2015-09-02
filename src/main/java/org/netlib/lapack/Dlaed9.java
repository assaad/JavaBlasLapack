package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dnrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaed9
{
  public static void dlaed9(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double paramDouble, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, intW paramintW)
  {
    int i = 0;
    int j = 0;
    double d = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt2 >= 1 ? 0 : 1) == 0) {}
      if (((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
      }
      else
      {
        if ((Math.max(1, paramInt3) >= paramInt2 ? 0 : 1) == 0) {}
        if (((paramInt3 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW.val = -3;
        } else if ((paramInt4 >= paramInt1 ? 0 : 1) != 0) {
          paramintW.val = -4;
        } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -7;
        } else if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -12;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLAED9", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int k = paramInt4 - 1 + 1; k > 0; k--)
    {
      paramArrayOfDouble3[(i - 1 + paramInt8)] = (Dlamc3.dlamc3(paramArrayOfDouble3[(i - 1 + paramInt8)], paramArrayOfDouble3[(i - 1 + paramInt8)]) - paramArrayOfDouble3[(i - 1 + paramInt8)]);
      i += 1;
    }
    j = paramInt2;
    for (k = paramInt3 - paramInt2 + 1; k > 0; k--)
    {
      dlaed4_adapter(paramInt1, j, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, paramInt9, paramArrayOfDouble2, 1 - 1 + (j - 1) * paramInt7 + paramInt6, paramDouble, paramArrayOfDouble1, j - 1 + paramInt5, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        break;
      }
      j += 1;
    }
    if ((paramInt1 != 1 ? 0 : 1) == 0) {}
    int m;
    if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        j = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble5[(j - 1 + (i - 1) * paramInt11 + paramInt10)] = paramArrayOfDouble2[(j - 1 + (i - 1) * paramInt7 + paramInt6)];
          j += 1;
        }
        i += 1;
      }
    }
    else
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble4, paramInt9, 1, paramArrayOfDouble5, paramInt10, 1);
      Dcopy.dcopy(paramInt1, paramArrayOfDouble2, paramInt6, paramInt7 + 1, paramArrayOfDouble4, paramInt9, 1);
      j = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = j - 1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble4[(i - 1 + paramInt9)] *= paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] / (paramArrayOfDouble3[(i - 1 + paramInt8)] - paramArrayOfDouble3[(j - 1 + paramInt8)]);
          i += 1;
        }
        i = j + 1;
        for (m = paramInt1 - (j + 1) + 1; m > 0; m--)
        {
          paramArrayOfDouble4[(i - 1 + paramInt9)] *= paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] / (paramArrayOfDouble3[(i - 1 + paramInt8)] - paramArrayOfDouble3[(j - 1 + paramInt8)]);
          i += 1;
        }
        j += 1;
      }
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble4[(i - 1 + paramInt9)] = Util.dsign(Math.sqrt(-paramArrayOfDouble4[(i - 1 + paramInt9)]), paramArrayOfDouble5[(i - 1 + (1 - 1) * paramInt11 + paramInt10)]);
        i += 1;
      }
      j = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble4[(i - 1 + paramInt9)] / paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt7 + paramInt6)]);
          i += 1;
        }
        d = Dnrm2.dnrm2(paramInt1, paramArrayOfDouble2, 1 - 1 + (j - 1) * paramInt7 + paramInt6, 1);
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] /= d;
          i += 1;
        }
        j += 1;
      }
    }
  }
  
  private static void dlaed4_adapter(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double paramDouble, double[] paramArrayOfDouble4, int paramInt6, intW paramintW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble4[paramInt6]);
    Dlaed4.dlaed4(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramDouble, localdoubleW, paramintW);
    paramArrayOfDouble4[paramInt6] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaed9.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */