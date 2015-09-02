package org.netlib.lapack;

import org.netlib.blas.Dasum;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Idamax;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlacon
{
  public static int i = 0;
  public static int iter = 0;
  public static int j = 0;
  public static int jlast = 0;
  public static int jump = 0;
  public static double altsgn = 0.0D;
  public static double estold = 0.0D;
  public static double temp = 0.0D;
  
  public static void dlacon(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int[] paramArrayOfInt, int paramInt4, doubleW paramdoubleW, intW paramintW)
  {
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt3)] = (1.0D / paramInt1);
        i += 1;
      }
      paramintW.val = 1;
      jump = 1;
      return;
    }
    int k = jump;
    if (k != 1)
    {
      if (k != 2)
      {
        if (k == 3) {
          break label348;
        }
        if (k == 4) {
          break label566;
        }
        if (k == 5) {
          break label731;
        }
      }
    }
    else
    {
      if ((paramInt1 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfDouble1[(1 - 1 + paramInt2)] = paramArrayOfDouble2[(1 - 1 + paramInt3)];
        paramdoubleW.val = Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt2)]);
        break label790;
      }
      paramdoubleW.val = Dasum.dasum(paramInt1, paramArrayOfDouble2, paramInt3, 1);
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt3)] = Util.dsign(1.0D, paramArrayOfDouble2[(i - 1 + paramInt3)]);
        paramArrayOfInt[(i - 1 + paramInt4)] = Util.idnint(paramArrayOfDouble2[(i - 1 + paramInt3)]);
        i += 1;
      }
      paramintW.val = 2;
      jump = 2;
      return;
    }
    j = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt3, 1);
    for (iter = 2;; iter += 1)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt3)] = 0.0D;
        i += 1;
      }
      paramArrayOfDouble2[(j - 1 + paramInt3)] = 1.0D;
      paramintW.val = 1;
      jump = 3;
      return;
      label348:
      Dcopy.dcopy(paramInt1, paramArrayOfDouble2, paramInt3, 1, paramArrayOfDouble1, paramInt2, 1);
      estold = paramdoubleW.val;
      paramdoubleW.val = Dasum.dasum(paramInt1, paramArrayOfDouble1, paramInt2, 1);
      i = 1;
      k = paramInt1 - 1 + 1;
      while ((Util.idnint(Util.dsign(1.0D, paramArrayOfDouble2[(i - 1 + paramInt3)])) == paramArrayOfInt[(i - 1 + paramInt4)] ? 0 : 1) == 0)
      {
        i += 1;
        k--;
        if (k <= 0) {
          break label652;
        }
      }
      if ((paramdoubleW.val > estold ? 0 : 1) != 0) {
        break;
      }
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble2[(i - 1 + paramInt3)] = Util.dsign(1.0D, paramArrayOfDouble2[(i - 1 + paramInt3)]);
        paramArrayOfInt[(i - 1 + paramInt4)] = Util.idnint(paramArrayOfDouble2[(i - 1 + paramInt3)]);
        i += 1;
      }
      paramintW.val = 2;
      jump = 4;
      return;
      label566:
      jlast = j;
      j = Idamax.idamax(paramInt1, paramArrayOfDouble2, paramInt3, 1);
      if ((paramArrayOfDouble2[(jlast - 1 + paramInt3)] == Math.abs(paramArrayOfDouble2[(j - 1 + paramInt3)]) ? 0 : 1) != 0) {}
      if (((iter >= 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        break;
      }
    }
    label652:
    altsgn = 1.0D;
    i = 1;
    for (k = paramInt1 - 1 + 1; k > 0; k--)
    {
      paramArrayOfDouble2[(i - 1 + paramInt3)] = (altsgn * (1.0D + (i - 1) / (paramInt1 - 1)));
      altsgn = -altsgn;
      i += 1;
    }
    paramintW.val = 1;
    jump = 5;
    return;
    label731:
    temp = 2.0D * (Dasum.dasum(paramInt1, paramArrayOfDouble2, paramInt3, 1) / (3 * paramInt1));
    if ((temp <= paramdoubleW.val ? 0 : 1) != 0)
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble2, paramInt3, 1, paramArrayOfDouble1, paramInt2, 1);
      paramdoubleW.val = temp;
    }
    label790:
    paramintW.val = 0;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlacon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */