package org.netlib.lapack;

import org.netlib.util.Etime;

public final class Dsecnd
{
  public static double dsecnd()
  {
    float f = 0.0F;
    float[] arrayOfFloat = new float[2];
    double d = 0.0D;
    Etime.etime();
    f = Etime.etime(arrayOfFloat, 0);
    d = arrayOfFloat[(1 - 1)];
    return d;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsecnd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */