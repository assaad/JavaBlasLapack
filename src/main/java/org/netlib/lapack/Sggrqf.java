package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Sggrqf
{
  public static void sggrqf(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    paramintW.val = 0;
    n = Ilaenv.ilaenv(1, "SGERQF", " ", paramInt1, paramInt3, -1, -1);
    i1 = Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt2, paramInt3, -1, -1);
    i2 = Ilaenv.ilaenv(1, "SORMRQ", " ", paramInt1, paramInt3, paramInt2, -1);
    m = Util.max(n, i1, i2);
    k = Util.max(paramInt3, paramInt1, paramInt2) * m;
    paramArrayOfFloat5[(1 - 1 + paramInt10)] = k;
    i = paramInt11 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else if ((paramInt8 >= Math.max(1, paramInt2) ? 0 : 1) != 0)
    {
      paramintW.val = -8;
    }
    else
    {
      if ((paramInt11 >= Math.max(Util.max(1, paramInt1, paramInt2), paramInt3) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -11;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGGRQF", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    Sgerqf.sgerqf(paramInt1, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat5, paramInt10, paramInt11, paramintW);
    j = (int)paramArrayOfFloat5[(1 - 1 + paramInt10)];
    Sormrq.sormrq("Right", "Transpose", paramInt2, paramInt3, Math.min(paramInt1, paramInt3), paramArrayOfFloat1, Math.max(1, paramInt1 - paramInt3 + 1) - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat5, paramInt10, paramInt11, paramintW);
    j = Math.max(j, (int)paramArrayOfFloat5[(1 - 1 + paramInt10)]);
    Sgeqrf.sgeqrf(paramInt2, paramInt3, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat4, paramInt9, paramArrayOfFloat5, paramInt10, paramInt11, paramintW);
    paramArrayOfFloat5[(1 - 1 + paramInt10)] = Math.max(j, (int)paramArrayOfFloat5[(1 - 1 + paramInt10)]);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sggrqf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */