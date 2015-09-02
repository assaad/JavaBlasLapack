package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Sasum;
import org.netlib.blas.Scopy;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slacon
{
  public static int i = 0;
  public static int iter = 0;
  public static int j = 0;
  public static int jlast = 0;
  public static int jump = 0;
  public static float altsgn = 0.0F;
  public static float estold = 0.0F;
  public static float temp = 0.0F;
  
  public static void slacon(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int[] paramArrayOfInt, int paramInt4, floatW paramfloatW, intW paramintW)
  {
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt3)] = (1.0F / paramInt1);
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
        paramArrayOfFloat1[(1 - 1 + paramInt2)] = paramArrayOfFloat2[(1 - 1 + paramInt3)];
        paramfloatW.val = Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt2)]);
        break label788;
      }
      paramfloatW.val = Sasum.sasum(paramInt1, paramArrayOfFloat2, paramInt3, 1);
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt3)] = Util.sign(1.0F, paramArrayOfFloat2[(i - 1 + paramInt3)]);
        paramArrayOfInt[(i - 1 + paramInt4)] = Util.nint(paramArrayOfFloat2[(i - 1 + paramInt3)]);
        i += 1;
      }
      paramintW.val = 2;
      jump = 2;
      return;
    }
    j = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt3, 1);
    for (iter = 2;; iter += 1)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt3)] = 0.0F;
        i += 1;
      }
      paramArrayOfFloat2[(j - 1 + paramInt3)] = 1.0F;
      paramintW.val = 1;
      jump = 3;
      return;
      label348:
      Scopy.scopy(paramInt1, paramArrayOfFloat2, paramInt3, 1, paramArrayOfFloat1, paramInt2, 1);
      estold = paramfloatW.val;
      paramfloatW.val = Sasum.sasum(paramInt1, paramArrayOfFloat1, paramInt2, 1);
      i = 1;
      k = paramInt1 - 1 + 1;
      while ((Util.nint(Util.sign(1.0F, paramArrayOfFloat2[(i - 1 + paramInt3)])) == paramArrayOfInt[(i - 1 + paramInt4)] ? 0 : 1) == 0)
      {
        i += 1;
        k--;
        if (k <= 0) {
          break label652;
        }
      }
      if ((paramfloatW.val > estold ? 0 : 1) != 0) {
        break;
      }
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt3)] = Util.sign(1.0F, paramArrayOfFloat2[(i - 1 + paramInt3)]);
        paramArrayOfInt[(i - 1 + paramInt4)] = Util.nint(paramArrayOfFloat2[(i - 1 + paramInt3)]);
        i += 1;
      }
      paramintW.val = 2;
      jump = 4;
      return;
      label566:
      jlast = j;
      j = Isamax.isamax(paramInt1, paramArrayOfFloat2, paramInt3, 1);
      if ((paramArrayOfFloat2[(jlast - 1 + paramInt3)] == Math.abs(paramArrayOfFloat2[(j - 1 + paramInt3)]) ? 0 : 1) != 0) {}
      if (((iter >= 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        break;
      }
    }
    label652:
    altsgn = 1.0F;
    i = 1;
    for (k = paramInt1 - 1 + 1; k > 0; k--)
    {
      paramArrayOfFloat2[(i - 1 + paramInt3)] = (altsgn * (1.0F + (i - 1) / (paramInt1 - 1)));
      altsgn = -altsgn;
      i += 1;
    }
    paramintW.val = 1;
    jump = 5;
    return;
    label731:
    temp = 2.0F * (Sasum.sasum(paramInt1, paramArrayOfFloat2, paramInt3, 1) / (3 * paramInt1));
    if ((temp <= paramfloatW.val ? 0 : 1) != 0)
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat2, paramInt3, 1, paramArrayOfFloat1, paramInt2, 1);
      paramfloatW.val = temp;
    }
    label788:
    paramintW.val = 0;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slacon.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */