package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlassq
{
  public static void dlassq(int paramInt1, double[] paramArrayOfDouble, int paramInt2, int paramInt3, doubleW paramdoubleW1, doubleW paramdoubleW2)
  {
    int i = 0;
    double d = 0.0D;
    if ((paramInt1 <= 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (int j = (1 + (paramInt1 - 1) * paramInt3 - 1 + paramInt3) / paramInt3; j > 0; j--)
      {
        if ((paramArrayOfDouble[(i - 1 + paramInt2)] == 0.0D ? 0 : 1) != 0)
        {
          d = Math.abs(paramArrayOfDouble[(i - 1 + paramInt2)]);
          if ((paramdoubleW1.val >= d ? 0 : 1) != 0)
          {
            paramdoubleW2.val = (1 + paramdoubleW2.val * Math.pow(paramdoubleW1.val / d, 2));
            paramdoubleW1.val = d;
          }
          else
          {
            paramdoubleW2.val += Math.pow(d / paramdoubleW1.val, 2);
          }
        }
        i += paramInt3;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlassq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */