package org.netlib.lapack;

public final class Dlaisnan
{
  public static boolean dlaisnan(double paramDouble1, double paramDouble2)
  {
    boolean bool = false;
    bool = paramDouble1 != paramDouble2;
    return bool;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaisnan.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */