package org.netlib.arpack;

import org.netlib.util.Etime;
import org.netlib.util.floatW;

public final class Second
{
  public static void second(floatW paramfloatW)
  {
    float f = 0.0F;
    float[] arrayOfFloat = new float[2];
    Etime.etime();
    f = Etime.etime(arrayOfFloat, 0);
    paramfloatW.val = arrayOfFloat[(1 - 1)];
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Second.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */