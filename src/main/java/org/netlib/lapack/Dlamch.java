package org.netlib.lapack;

import org.netlib.util.booleanW;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlamch
{
  public static boolean first = true;
  public static double base = 0.0D;
  public static double emax = 0.0D;
  public static double emin = 0.0D;
  public static doubleW eps = new doubleW(0.0D);
  public static double prec = 0.0D;
  public static doubleW rmax = new doubleW(0.0D);
  public static doubleW rmin = new doubleW(0.0D);
  public static double rnd = 0.0D;
  public static double sfmin = 0.0D;
  public static double t = 0.0D;
  
  public static double dlamch(String paramString)
  {
    booleanW localbooleanW = new booleanW(false);
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    if (first)
    {
      Dlamc2.dlamc2(localintW1, localintW4, localbooleanW, eps, localintW3, rmin, localintW2, rmax);
      base = localintW1.val;
      t = localintW4.val;
      if (localbooleanW.val)
      {
        rnd = 1.0D;
        eps.val = (Math.pow(base, 1 - localintW4.val) / 2);
      }
      else
      {
        rnd = 0.0D;
        eps.val = Math.pow(base, 1 - localintW4.val);
      }
      prec = eps.val * base;
      emin = localintW3.val;
      emax = localintW2.val;
      sfmin = rmin.val;
      d2 = 1.0D / rmax.val;
      if ((d2 < sfmin ? 0 : 1) != 0) {
        sfmin = d2 * (1.0D + eps.val);
      }
    }
    if (Lsame.lsame(paramString, "E")) {
      d1 = eps.val;
    } else if (Lsame.lsame(paramString, "S")) {
      d1 = sfmin;
    } else if (Lsame.lsame(paramString, "B")) {
      d1 = base;
    } else if (Lsame.lsame(paramString, "P")) {
      d1 = prec;
    } else if (Lsame.lsame(paramString, "N")) {
      d1 = t;
    } else if (Lsame.lsame(paramString, "R")) {
      d1 = rnd;
    } else if (Lsame.lsame(paramString, "M")) {
      d1 = emin;
    } else if (Lsame.lsame(paramString, "U")) {
      d1 = rmin.val;
    } else if (Lsame.lsame(paramString, "L")) {
      d1 = emax;
    } else if (Lsame.lsame(paramString, "O")) {
      d1 = rmax.val;
    }
    d3 = d1;
    first = false;
    return d3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlamch.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */