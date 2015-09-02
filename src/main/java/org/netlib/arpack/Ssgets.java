package org.netlib.arpack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sswap;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssgets
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void ssgets(int paramInt1, String paramString, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4)
  {
    int i = 0;
    int j = 0;
    Etime.etime();
    Second.second(t0);
    j = arpack_debug.msgets.val;
    if (paramString.regionMatches(0, "BE", 0, 2))
    {
      Ssortr.ssortr("LA", true, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3);
      i = paramintW1.val / 2;
      if ((paramintW1.val <= 1 ? 0 : 1) != 0)
      {
        Sswap.sswap(Math.min(i, paramintW2.val), paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat1, Math.max(i, paramintW2.val) + 1 - 1 + paramInt2, 1);
        Sswap.sswap(Math.min(i, paramintW2.val), paramArrayOfFloat2, paramInt3, 1, paramArrayOfFloat2, Math.max(i, paramintW2.val) + 1 - 1 + paramInt3, 1);
      }
    }
    else
    {
      Ssortr.ssortr(paramString, true, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3);
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0) {}
    if (((paramintW2.val <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Ssortr.ssortr("SM", true, paramintW2.val, paramArrayOfFloat2, paramInt3, paramArrayOfFloat1, paramInt2);
      Scopy.scopy(paramintW2.val, paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat3, paramInt4, 1);
    }
    Second.second(t1);
    arpack_timing.tsgets.val += t1.val - t0.val;
    if ((j <= 0 ? 0 : 1) != 0)
    {
      ivout_adapter(arpack_debug.logfil.val, 1, paramintW1, arpack_debug.ndigit.val, "_sgets: KEV is");
      ivout_adapter(arpack_debug.logfil.val, 1, paramintW2, arpack_debug.ndigit.val, "_sgets: NP is");
      Svout.svout(arpack_debug.logfil.val, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, arpack_debug.ndigit.val, "_sgets: Eigenvalues of current H matrix");
      Svout.svout(arpack_debug.logfil.val, paramintW1.val + paramintW2.val, paramArrayOfFloat2, paramInt3, arpack_debug.ndigit.val, "_sgets: Associated Ritz estimates");
    }
  }
  
  private static void ivout_adapter(int paramInt1, int paramInt2, intW paramintW, int paramInt3, String paramString)
  {
    int[] arrayOfInt = { paramintW.val };
    Ivout.ivout(paramInt1, paramInt2, arrayOfInt, 0, paramInt3, paramString);
    paramintW.val = arrayOfInt[0];
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Ssgets.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */