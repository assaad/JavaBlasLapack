package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Sggglm
{
  public static void sggglm(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, float[] paramArrayOfFloat6, int paramInt11, int paramInt12, intW paramintW)
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
        i2 = Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
        i3 = Ilaenv.ilaenv(1, "SGERQF", " ", paramInt1, paramInt2, -1, -1);
        i4 = Ilaenv.ilaenv(1, "SORMQR", " ", paramInt1, paramInt2, paramInt3, -1);
        i5 = Ilaenv.ilaenv(1, "SORMRQ", " ", paramInt1, paramInt2, paramInt3, -1);
        i1 = Math.max(Util.max(i2, i3, i4), i5);
        m = paramInt2 + paramInt1 + paramInt3;
        n = paramInt2 + i6 + Math.max(paramInt1, paramInt3) * i1;
      }
      paramArrayOfFloat6[(1 - 1 + paramInt11)] = n;
      if ((paramInt12 >= m ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -12;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGGGLM", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    Sggqrf.sggqrf(paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat6, paramInt11, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat6, paramInt2 + 1 - 1 + paramInt11, paramArrayOfFloat6, paramInt2 + i6 + 1 - 1 + paramInt11, paramInt12 - paramInt2 - i6, paramintW);
    k = (int)paramArrayOfFloat6[(paramInt2 + i6 + 1 - 1 + paramInt11)];
    Sormqr.sormqr("Left", "Transpose", paramInt1, 1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat6, paramInt11, paramArrayOfFloat3, paramInt8, Math.max(1, paramInt1), paramArrayOfFloat6, paramInt2 + i6 + 1 - 1 + paramInt11, paramInt12 - paramInt2 - i6, paramintW);
    k = Math.max(k, (int)paramArrayOfFloat6[(paramInt2 + i6 + 1 - 1 + paramInt11)]);
    if ((paramInt1 <= paramInt2 ? 0 : 1) != 0)
    {
      Strtrs.strtrs("Upper", "No transpose", "Non unit", paramInt1 - paramInt2, 1, paramArrayOfFloat2, paramInt2 + 1 - 1 + (paramInt2 + paramInt3 - paramInt1 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3, paramInt2 + 1 - 1 + paramInt8, paramInt1 - paramInt2, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramintW.val = 1;
        return;
      }
      Scopy.scopy(paramInt1 - paramInt2, paramArrayOfFloat3, paramInt2 + 1 - 1 + paramInt8, 1, paramArrayOfFloat5, paramInt2 + paramInt3 - paramInt1 + 1 - 1 + paramInt10, 1);
    }
    j = 1;
    for (int i7 = paramInt2 + paramInt3 - paramInt1 - 1 + 1; i7 > 0; i7--)
    {
      paramArrayOfFloat5[(j - 1 + paramInt10)] = 0.0F;
      j += 1;
    }
    Sgemv.sgemv("No transpose", paramInt2, paramInt1 - paramInt2, -1.0F, paramArrayOfFloat2, 1 - 1 + (paramInt2 + paramInt3 - paramInt1 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat5, paramInt2 + paramInt3 - paramInt1 + 1 - 1 + paramInt10, 1, 1.0F, paramArrayOfFloat3, paramInt8, 1);
    if ((paramInt2 <= 0 ? 0 : 1) != 0)
    {
      Strtrs.strtrs("Upper", "No Transpose", "Non unit", paramInt2, 1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt8, paramInt2, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramintW.val = 2;
        return;
      }
      Scopy.scopy(paramInt2, paramArrayOfFloat3, paramInt8, 1, paramArrayOfFloat4, paramInt9, 1);
    }
    Sormrq.sormrq("Left", "Transpose", paramInt3, 1, i6, paramArrayOfFloat2, Math.max(1, paramInt1 - paramInt3 + 1) - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat6, paramInt2 + 1 - 1 + paramInt11, paramArrayOfFloat5, paramInt10, Math.max(1, paramInt3), paramArrayOfFloat6, paramInt2 + i6 + 1 - 1 + paramInt11, paramInt12 - paramInt2 - i6, paramintW);
    paramArrayOfFloat6[(1 - 1 + paramInt11)] = (paramInt2 + i6 + Math.max(k, (int)paramArrayOfFloat6[(paramInt2 + i6 + 1 - 1 + paramInt11)]));
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sggglm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */