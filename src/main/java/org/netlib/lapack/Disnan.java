package org.netlib.lapack;

public final class Disnan
{
  public static boolean disnan(double paramDouble)
  {
    boolean bool = false;
    bool = Dlaisnan.dlaisnan(paramDouble, paramDouble);
    return bool;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Disnan.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */