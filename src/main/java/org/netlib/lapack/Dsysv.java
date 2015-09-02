package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsysv
{
  public static void dsysv(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    paramintW.val = 0;
    i = paramInt9 != -1 ? 0 : 1;
    if ((((Lsame.lsame(paramString, "U") ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -8;
    }
    else
    {
      if ((paramInt9 >= 1 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -10;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        j = 1;
      }
      else
      {
        k = Ilaenv.ilaenv(1, "DSYTRF", paramString, paramInt1, -1, -1, -1);
        j = paramInt1 * k;
      }
      paramArrayOfDouble3[(1 - 1 + paramInt8)] = j;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSYSV ", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    Dsytrf.dsytrf(paramString, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfInt, paramInt5, paramArrayOfDouble3, paramInt8, paramInt9, paramintW);
    if ((paramintW.val != 0 ? 0 : 1) != 0) {
      Dsytrs.dsytrs(paramString, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfInt, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
    }
    paramArrayOfDouble3[(1 - 1 + paramInt8)] = j;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsysv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */