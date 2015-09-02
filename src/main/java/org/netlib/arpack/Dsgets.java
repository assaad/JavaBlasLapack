package org.netlib.arpack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dswap;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Dsgets
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void dsgets(int paramInt1, String paramString, intW paramintW1, intW paramintW2, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4)
  {
    int i = 0;
    int j = 0;
    Etime.etime();
    Second.second(t0);
    j = arpack_debug.msgets.val;
    if (paramString.regionMatches(0, "BE", 0, 2))
    {
      Dsortr.dsortr("LA", true, paramintW1.val + paramintW2.val, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3);
      i = paramintW1.val / 2;
      if ((paramintW1.val <= 1 ? 0 : 1) != 0)
      {
        Dswap.dswap(Math.min(i, paramintW2.val), paramArrayOfDouble1, paramInt2, 1, paramArrayOfDouble1, Math.max(i, paramintW2.val) + 1 - 1 + paramInt2, 1);
        Dswap.dswap(Math.min(i, paramintW2.val), paramArrayOfDouble2, paramInt3, 1, paramArrayOfDouble2, Math.max(i, paramintW2.val) + 1 - 1 + paramInt3, 1);
      }
    }
    else
    {
      Dsortr.dsortr(paramString, true, paramintW1.val + paramintW2.val, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3);
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0) {}
    if (((paramintW2.val <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dsortr.dsortr("SM", true, paramintW2.val, paramArrayOfDouble2, paramInt3, paramArrayOfDouble1, paramInt2);
      Dcopy.dcopy(paramintW2.val, paramArrayOfDouble1, paramInt2, 1, paramArrayOfDouble3, paramInt4, 1);
    }
    Second.second(t1);
    arpack_timing.tsgets.val += t1.val - t0.val;
    if ((j <= 0 ? 0 : 1) != 0)
    {
      ivout_adapter(arpack_debug.logfil.val, 1, paramintW1, arpack_debug.ndigit.val, "_sgets: KEV is");
      ivout_adapter(arpack_debug.logfil.val, 1, paramintW2, arpack_debug.ndigit.val, "_sgets: NP is");
      Dvout.dvout(arpack_debug.logfil.val, paramintW1.val + paramintW2.val, paramArrayOfDouble1, paramInt2, arpack_debug.ndigit.val, "_sgets: Eigenvalues of current H matrix");
      Dvout.dvout(arpack_debug.logfil.val, paramintW1.val + paramintW2.val, paramArrayOfDouble2, paramInt3, arpack_debug.ndigit.val, "_sgets: Associated Ritz estimates");
    }
  }
  
  private static void ivout_adapter(int paramInt1, int paramInt2, intW paramintW, int paramInt3, String paramString)
  {
    int[] arrayOfInt = { paramintW.val };
    Ivout.ivout(paramInt1, paramInt2, arrayOfInt, 0, paramInt3, paramString);
    paramintW.val = arrayOfInt[0];
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dsgets.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */