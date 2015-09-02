package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.floatW;

public final class Slabad
{
  public static void slabad(floatW paramfloatW1, floatW paramfloatW2)
  {
    if (((float)Util.log10(paramfloatW2.val) <= 2000.0F ? 0 : 1) != 0)
    {
      paramfloatW1.val = ((float)Math.sqrt(paramfloatW1.val));
      paramfloatW2.val = ((float)Math.sqrt(paramfloatW2.val));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slabad.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */