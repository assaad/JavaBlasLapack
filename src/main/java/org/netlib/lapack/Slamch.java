package org.netlib.lapack;

import org.netlib.util.booleanW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slamch
{
  public static boolean first = true;
  public static float base = 0.0F;
  public static float emax = 0.0F;
  public static float emin = 0.0F;
  public static floatW eps = new floatW(0.0F);
  public static float prec = 0.0F;
  public static floatW rmax = new floatW(0.0F);
  public static floatW rmin = new floatW(0.0F);
  public static float rnd = 0.0F;
  public static float sfmin = 0.0F;
  public static float t = 0.0F;
  
  public static float slamch(String paramString)
  {
    booleanW localbooleanW = new booleanW(false);
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    if (first)
    {
      Slamc2.slamc2(localintW1, localintW4, localbooleanW, eps, localintW3, rmin, localintW2, rmax);
      base = localintW1.val;
      t = localintW4.val;
      if (localbooleanW.val)
      {
        rnd = 1.0F;
        eps.val = ((float)Math.pow(base, 1 - localintW4.val) / 2);
      }
      else
      {
        rnd = 0.0F;
        eps.val = ((float)Math.pow(base, 1 - localintW4.val));
      }
      prec = eps.val * base;
      emin = localintW3.val;
      emax = localintW2.val;
      sfmin = rmin.val;
      f2 = 1.0F / rmax.val;
      if ((f2 < sfmin ? 0 : 1) != 0) {
        sfmin = f2 * (1.0F + eps.val);
      }
    }
    if (Lsame.lsame(paramString, "E")) {
      f1 = eps.val;
    } else if (Lsame.lsame(paramString, "S")) {
      f1 = sfmin;
    } else if (Lsame.lsame(paramString, "B")) {
      f1 = base;
    } else if (Lsame.lsame(paramString, "P")) {
      f1 = prec;
    } else if (Lsame.lsame(paramString, "N")) {
      f1 = t;
    } else if (Lsame.lsame(paramString, "R")) {
      f1 = rnd;
    } else if (Lsame.lsame(paramString, "M")) {
      f1 = emin;
    } else if (Lsame.lsame(paramString, "U")) {
      f1 = rmin.val;
    } else if (Lsame.lsame(paramString, "L")) {
      f1 = emax;
    } else if (Lsame.lsame(paramString, "O")) {
      f1 = rmax.val;
    }
    f3 = f1;
    first = false;
    return f3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slamch.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */