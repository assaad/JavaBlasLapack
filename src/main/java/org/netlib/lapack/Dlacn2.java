package org.netlib.lapack;

import org.netlib.blas.Dasum;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Idamax;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlacn2
{
  public static void dlacn2(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, doubleW paramdoubleW, intW paramintW, int[] paramArrayOfInt2, int paramInt5)
  {
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt3)] = (1.0D / paramInt1);
        i += 1;
      }
      paramintW.val = 1;
      paramArrayOfInt2[(1 - 1 + paramInt5)] = 1;
      return;
    }
    int k = paramArrayOfInt2[(1 - 1 + paramInt5)];
    if (k != 1)
    {
      if (k != 2)
      {
        if (k == 3) {
          break label390;
        }
        if (k == 4) {
          break label600;
        }
        if (k == 5) {
          break label796;
        }
      }
    }
    else
    {
      if ((paramInt1 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfDouble1[(1 - 1 + paramInt2)] = paramArrayOfDouble2[(1 - 1 + paramInt3)];
        paramdoubleW.val = Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt2)]);
        break label852;
      }
      paramdoubleW.val = Dasum.dasum(paramInt1, paramArrayOfDouble2, paramInt3, 1);
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt3)] = Util.dsign(1.0D, paramArrayOfDouble2[(i - 1 + paramInt3)]);
        paramArrayOfInt1[(i - 1 + paramInt4)] = Util.idnint(paramArrayOfDouble2[(i - 1 + paramInt3)]);
        i += 1;
      }
      paramintW.val = 2;
      paramArrayOfInt2[(1 - 1 + paramInt5)] = 2;
      return;
    }
    paramArrayOfInt2[(2 - 1 + paramInt5)] = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt3, 1);
    paramArrayOfInt2[(3 - 1 + paramInt5)] = 2;
    for (;;)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt3)] = 0.0D;
        i += 1;
      }
      paramArrayOfDouble2[(paramArrayOfInt2[(2 - 1 + paramInt5)] - 1 + paramInt3)] = 1.0D;
      paramintW.val = 1;
      paramArrayOfInt2[(1 - 1 + paramInt5)] = 3;
      return;
      label390:
      Dcopy.dcopy(paramInt1, paramArrayOfDouble2, paramInt3, 1, paramArrayOfDouble1, paramInt2, 1);
      d2 = paramdoubleW.val;
      paramdoubleW.val = Dasum.dasum(paramInt1, paramArrayOfDouble1, paramInt2, 1);
      i = 1;
      k = paramInt1 - 1 + 1;
      while ((Util.idnint(Util.dsign(1.0D, paramArrayOfDouble2[(i - 1 + paramInt3)])) == paramArrayOfInt1[(i - 1 + paramInt4)] ? 0 : 1) == 0)
      {
        i += 1;
        k--;
        if (k <= 0) {
          break label720;
        }
      }
      if ((paramdoubleW.val > d2 ? 0 : 1) != 0) {
        break;
      }
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt3)] = Util.dsign(1.0D, paramArrayOfDouble2[(i - 1 + paramInt3)]);
        paramArrayOfInt1[(i - 1 + paramInt4)] = Util.idnint(paramArrayOfDouble2[(i - 1 + paramInt3)]);
        i += 1;
      }
      paramintW.val = 2;
      paramArrayOfInt2[(1 - 1 + paramInt5)] = 4;
      return;
      label600:
      j = paramArrayOfInt2[(2 - 1 + paramInt5)];
      paramArrayOfInt2[(2 - 1 + paramInt5)] = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt3, 1);
      if ((paramArrayOfDouble2[(j - 1 + paramInt3)] == Math.abs(paramArrayOfDouble2[(paramArrayOfInt2[(2 - 1 + paramInt5)] - 1 + paramInt3)]) ? 0 : 1) != 0) {}
      if (((paramArrayOfInt2[(3 - 1 + paramInt5)] >= 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        break;
      }
      paramArrayOfInt2[(3 - 1 + paramInt5)] += 1;
    }
    label720:
    d1 = 1.0D;
    i = 1;
    for (k = paramInt1 - 1 + 1; k > 0; k--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt3)] = (d1 * (1.0D + (i - 1) / (paramInt1 - 1)));
      d1 = -d1;
      i += 1;
    }
    paramintW.val = 1;
    paramArrayOfInt2[(1 - 1 + paramInt5)] = 5;
    return;
    label796:
    d3 = 2.0D * (Dasum.dasum(paramInt1, paramArrayOfDouble2, paramInt3, 1) / (3 * paramInt1));
    if ((d3 <= paramdoubleW.val ? 0 : 1) != 0)
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble2, paramInt3, 1, paramArrayOfDouble1, paramInt2, 1);
      paramdoubleW.val = d3;
    }
    label852:
    paramintW.val = 0;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlacn2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */