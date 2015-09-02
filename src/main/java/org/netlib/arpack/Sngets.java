package org.netlib.arpack;

import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sngets
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void sngets(int paramInt1, String paramString, intW paramintW1, intW paramintW2, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, float[] paramArrayOfFloat4, int paramInt5, float[] paramArrayOfFloat5, int paramInt6)
  {
    int i = 0;
    Etime.etime();
    Second.second(t0);
    i = arpack_debug.mngets.val;
    if (paramString.regionMatches(0, "LM", 0, 2)) {
      Ssortc.ssortc("LR", true, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4);
    } else if (paramString.regionMatches(0, "SM", 0, 2)) {
      Ssortc.ssortc("SR", true, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4);
    } else if (paramString.regionMatches(0, "LR", 0, 2)) {
      Ssortc.ssortc("LM", true, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4);
    } else if (paramString.regionMatches(0, "SR", 0, 2)) {
      Ssortc.ssortc("SM", true, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4);
    } else if (paramString.regionMatches(0, "LI", 0, 2)) {
      Ssortc.ssortc("LM", true, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4);
    } else if (paramString.regionMatches(0, "SI", 0, 2)) {
      Ssortc.ssortc("SM", true, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4);
    }
    Ssortc.ssortc(paramString, true, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat3, paramInt4);
    if ((paramArrayOfFloat1[(paramintW2.val + 1 - 1 + paramInt2)] - paramArrayOfFloat1[(paramintW2.val - 1 + paramInt2)] != 0.0F ? 0 : 1) != 0) {}
    if (((paramArrayOfFloat2[(paramintW2.val + 1 - 1 + paramInt3)] + paramArrayOfFloat2[(paramintW2.val - 1 + paramInt3)] != 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      paramintW2.val -= 1;
      paramintW1.val += 1;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0) {
      Ssortc.ssortc("SR", true, paramintW2.val, paramArrayOfFloat3, paramInt4, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3);
    }
    Second.second(t1);
    arpack_timing.tngets.val += t1.val - t0.val;
    if ((i <= 0 ? 0 : 1) != 0)
    {
      ivout_adapter(arpack_debug.logfil.val, 1, paramintW1, arpack_debug.ndigit.val, "_ngets: KEV is");
      ivout_adapter(arpack_debug.logfil.val, 1, paramintW2, arpack_debug.ndigit.val, "_ngets: NP is");
      Svout.svout(arpack_debug.logfil.val, paramintW1.val + paramintW2.val, paramArrayOfFloat1, paramInt2, arpack_debug.ndigit.val, "_ngets: Eigenvalues of current H matrix -- real part");
      Svout.svout(arpack_debug.logfil.val, paramintW1.val + paramintW2.val, paramArrayOfFloat2, paramInt3, arpack_debug.ndigit.val, "_ngets: Eigenvalues of current H matrix -- imag part");
      Svout.svout(arpack_debug.logfil.val, paramintW1.val + paramintW2.val, paramArrayOfFloat3, paramInt4, arpack_debug.ndigit.val, "_ngets: Ritz estimates of the current KEV+NP Ritz values");
    }
  }
  
  private static void ivout_adapter(int paramInt1, int paramInt2, intW paramintW, int paramInt3, String paramString)
  {
    int[] arrayOfInt = { paramintW.val };
    Ivout.ivout(paramInt1, paramInt2, arrayOfInt, 0, paramInt3, paramString);
    paramintW.val = arrayOfInt[0];
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Sngets.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */