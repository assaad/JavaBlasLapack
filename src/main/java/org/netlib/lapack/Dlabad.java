package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.doubleW;

public final class Dlabad
{
  public static void dlabad(doubleW paramdoubleW1, doubleW paramdoubleW2)
  {
    if ((Util.log10(paramdoubleW2.val) <= 2000.0D ? 0 : 1) != 0)
    {
      paramdoubleW1.val = Math.sqrt(paramdoubleW1.val);
      paramdoubleW2.val = Math.sqrt(paramdoubleW2.val);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlabad.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */