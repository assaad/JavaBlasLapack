package org.netlib.lapack;

import org.netlib.util.booleanW;
import org.netlib.util.intW;

public final class Sstegr
{
  public static void sstegr(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float paramFloat1, float paramFloat2, int paramInt4, int paramInt5, float paramFloat3, intW paramintW1, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, int[] paramArrayOfInt2, int paramInt12, int paramInt13, intW paramintW2)
  {
    booleanW localbooleanW = new booleanW(false);
    paramintW2.val = 0;
    localbooleanW.val = false;
    Sstemr.sstemr(paramString1, paramString2, paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramFloat1, paramFloat2, paramInt4, paramInt5, paramintW1, paramArrayOfFloat3, paramInt6, paramArrayOfFloat4, paramInt7, paramInt8, paramInt1, paramArrayOfInt1, paramInt9, localbooleanW, paramArrayOfFloat5, paramInt10, paramInt11, paramArrayOfInt2, paramInt12, paramInt13, paramintW2);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sstegr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */