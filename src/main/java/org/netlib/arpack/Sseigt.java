package org.netlib.arpack;

import org.netlib.blas.Scopy;
import org.netlib.util.Etime;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sseigt
{
  public static floatW t0 = new floatW(0.0F);
  public static floatW t1 = new floatW(0.0F);
  public static float t2 = 0.0F;
  public static float t3 = 0.0F;
  public static float t4 = 0.0F;
  public static float t5 = 0.0F;
  
  public static void sseigt(float paramFloat, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    Etime.etime();
    Second.second(t0);
    k = arpack_debug.mseigt.val;
    if ((k <= 0 ? 0 : 1) != 0)
    {
      Svout.svout(arpack_debug.logfil.val, paramInt1, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt3 + paramInt2, arpack_debug.ndigit.val, "_seigt: main diagonal of matrix H");
      if ((paramInt1 <= 1 ? 0 : 1) != 0) {
        Svout.svout(arpack_debug.logfil.val, paramInt1 - 1, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt3 + paramInt2, arpack_debug.ndigit.val, "_seigt: sub diagonal of matrix H");
      }
    }
    Scopy.scopy(paramInt1, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat2, paramInt4, 1);
    Scopy.scopy(paramInt1 - 1, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat4, paramInt6, 1);
    Sstqrb.sstqrb(paramInt1, paramArrayOfFloat2, paramInt4, paramArrayOfFloat4, paramInt6, paramArrayOfFloat3, paramInt5, paramArrayOfFloat4, paramInt1 + 1 - 1 + paramInt6, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) == 0)
    {
      if ((k <= 1 ? 0 : 1) != 0) {
        Svout.svout(arpack_debug.logfil.val, paramInt1, paramArrayOfFloat3, paramInt5, arpack_debug.ndigit.val, "_seigt: last row of the eigenvector matrix for H");
      }
      j = 1;
      for (int m = paramInt1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfFloat3[(j - 1 + paramInt5)] = (paramFloat * Math.abs(paramArrayOfFloat3[(j - 1 + paramInt5)]));
        j += 1;
      }
      Second.second(t1);
      arpack_timing.tseigt.val += t1.val - t0.val;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Sseigt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */