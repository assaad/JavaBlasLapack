package org.netlib.lapack;

public final class Sisnan
{
  public static boolean sisnan(float paramFloat)
  {
    boolean bool = false;
    bool = Slaisnan.slaisnan(paramFloat, paramFloat);
    return bool;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sisnan.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */