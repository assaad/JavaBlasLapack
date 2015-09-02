package org.netlib.lapack;

import org.netlib.util.booleanW;
import org.netlib.util.intW;

public final class Dstegr
{
  public static void dstegr(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, int paramInt5, double paramDouble3, intW paramintW1, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, int[] paramArrayOfInt2, int paramInt12, int paramInt13, intW paramintW2)
  {
    booleanW localbooleanW = new booleanW(false);
    paramintW2.val = 0;
    localbooleanW.val = false;
    Dstemr.dstemr(paramString1, paramString2, paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramDouble1, paramDouble2, paramInt4, paramInt5, paramintW1, paramArrayOfDouble3, paramInt6, paramArrayOfDouble4, paramInt7, paramInt8, paramInt1, paramArrayOfInt1, paramInt9, localbooleanW, paramArrayOfDouble5, paramInt10, paramInt11, paramArrayOfInt2, paramInt12, paramInt13, paramintW2);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dstegr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */