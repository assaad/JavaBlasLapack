package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Dggglm
{
  public static void dggglm(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, double[] paramArrayOfDouble6, int paramInt11, int paramInt12, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    paramintW.val = 0;
    i6 = Math.min(paramInt1, paramInt3);
    i = paramInt12 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt2 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt2 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
      }
      else
      {
        if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
        if (((paramInt3 >= paramInt1 - paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW.val = -3;
        } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -5;
        } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -7;
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        m = 1;
        n = 1;
      }
      else
      {
        i2 = Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
        i3 = Ilaenv.ilaenv(1, "DGERQF", " ", paramInt1, paramInt2, -1, -1);
        i4 = Ilaenv.ilaenv(1, "DORMQR", " ", paramInt1, paramInt2, paramInt3, -1);
        i5 = Ilaenv.ilaenv(1, "DORMRQ", " ", paramInt1, paramInt2, paramInt3, -1);
        i1 = Math.max(Util.max(i2, i3, i4), i5);
        m = paramInt2 + paramInt1 + paramInt3;
        n = paramInt2 + i6 + Math.max(paramInt1, paramInt3) * i1;
      }
      paramArrayOfDouble6[(1 - 1 + paramInt11)] = n;
      if ((paramInt12 >= m ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -12;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGGGLM", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    Dggqrf.dggqrf(paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble6, paramInt11, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble6, paramInt2 + 1 - 1 + paramInt11, paramArrayOfDouble6, paramInt2 + i6 + 1 - 1 + paramInt11, paramInt12 - paramInt2 - i6, paramintW);
    k = (int)paramArrayOfDouble6[(paramInt2 + i6 + 1 - 1 + paramInt11)];
    Dormqr.dormqr("Left", "Transpose", paramInt1, 1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble6, paramInt11, paramArrayOfDouble3, paramInt8, Math.max(1, paramInt1), paramArrayOfDouble6, paramInt2 + i6 + 1 - 1 + paramInt11, paramInt12 - paramInt2 - i6, paramintW);
    k = Math.max(k, (int)paramArrayOfDouble6[(paramInt2 + i6 + 1 - 1 + paramInt11)]);
    if ((paramInt1 <= paramInt2 ? 0 : 1) != 0)
    {
      Dtrtrs.dtrtrs("Upper", "No transpose", "Non unit", paramInt1 - paramInt2, 1, paramArrayOfDouble2, paramInt2 + 1 - 1 + (paramInt2 + paramInt3 - paramInt1 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3, paramInt2 + 1 - 1 + paramInt8, paramInt1 - paramInt2, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramintW.val = 1;
        return;
      }
      Dcopy.dcopy(paramInt1 - paramInt2, paramArrayOfDouble3, paramInt2 + 1 - 1 + paramInt8, 1, paramArrayOfDouble5, paramInt2 + paramInt3 - paramInt1 + 1 - 1 + paramInt10, 1);
    }
    j = 1;
    for (int i7 = paramInt2 + paramInt3 - paramInt1 - 1 + 1; i7 > 0; i7--)
    {
      paramArrayOfDouble5[(j - 1 + paramInt10)] = 0.0D;
      j += 1;
    }
    Dgemv.dgemv("No transpose", paramInt2, paramInt1 - paramInt2, -1.0D, paramArrayOfDouble2, 1 - 1 + (paramInt2 + paramInt3 - paramInt1 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble5, paramInt2 + paramInt3 - paramInt1 + 1 - 1 + paramInt10, 1, 1.0D, paramArrayOfDouble3, paramInt8, 1);
    if ((paramInt2 <= 0 ? 0 : 1) != 0)
    {
      Dtrtrs.dtrtrs("Upper", "No Transpose", "Non unit", paramInt2, 1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt8, paramInt2, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramintW.val = 2;
        return;
      }
      Dcopy.dcopy(paramInt2, paramArrayOfDouble3, paramInt8, 1, paramArrayOfDouble4, paramInt9, 1);
    }
    Dormrq.dormrq("Left", "Transpose", paramInt3, 1, i6, paramArrayOfDouble2, Math.max(1, paramInt1 - paramInt3 + 1) - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble6, paramInt2 + 1 - 1 + paramInt11, paramArrayOfDouble5, paramInt10, Math.max(1, paramInt3), paramArrayOfDouble6, paramInt2 + i6 + 1 - 1 + paramInt11, paramInt12 - paramInt2 - i6, paramintW);
    paramArrayOfDouble6[(1 - 1 + paramInt11)] = (paramInt2 + i6 + Math.max(k, (int)paramArrayOfDouble6[(paramInt2 + i6 + 1 - 1 + paramInt11)]));
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dggglm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */