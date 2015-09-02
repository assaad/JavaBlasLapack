package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Strmv;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Sgglse
{
  public static void sgglse(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, float[] paramArrayOfFloat6, int paramInt11, int paramInt12, intW paramintW)
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
    n = Math.min(paramInt1, paramInt2);
    i = paramInt12 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((paramInt3 >= paramInt2 - paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -3;
      } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -5;
      } else if ((paramInt7 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
        paramintW.val = -7;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt2 != 0 ? 0 : 1) != 0)
      {
        k = 1;
        m = 1;
      }
      else
      {
        i2 = Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
        i3 = Ilaenv.ilaenv(1, "SGERQF", " ", paramInt1, paramInt2, -1, -1);
        i4 = Ilaenv.ilaenv(1, "SORMQR", " ", paramInt1, paramInt2, paramInt3, -1);
        i5 = Ilaenv.ilaenv(1, "SORMRQ", " ", paramInt1, paramInt2, paramInt3, -1);
        i1 = Math.max(Util.max(i2, i3, i4), i5);
        k = paramInt1 + paramInt2 + paramInt3;
        m = paramInt3 + n + Math.max(paramInt1, paramInt2) * i1;
      }
      paramArrayOfFloat6[(1 - 1 + paramInt11)] = m;
      if ((paramInt12 >= k ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -12;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGGLSE", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    Sggrqf.sggrqf(paramInt3, paramInt1, paramInt2, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat6, paramInt11, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat6, paramInt3 + 1 - 1 + paramInt11, paramArrayOfFloat6, paramInt3 + n + 1 - 1 + paramInt11, paramInt12 - paramInt3 - n, paramintW);
    j = (int)paramArrayOfFloat6[(paramInt3 + n + 1 - 1 + paramInt11)];
    Sormqr.sormqr("Left", "Transpose", paramInt1, 1, n, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat6, paramInt3 + 1 - 1 + paramInt11, paramArrayOfFloat3, paramInt8, Math.max(1, paramInt1), paramArrayOfFloat6, paramInt3 + n + 1 - 1 + paramInt11, paramInt12 - paramInt3 - n, paramintW);
    j = Math.max(j, (int)paramArrayOfFloat6[(paramInt3 + n + 1 - 1 + paramInt11)]);
    if ((paramInt3 <= 0 ? 0 : 1) != 0)
    {
      Strtrs.strtrs("Upper", "No transpose", "Non-unit", paramInt3, 1, paramArrayOfFloat2, 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat4, paramInt9, paramInt3, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramintW.val = 1;
        return;
      }
      Scopy.scopy(paramInt3, paramArrayOfFloat4, paramInt9, 1, paramArrayOfFloat5, paramInt2 - paramInt3 + 1 - 1 + paramInt10, 1);
      Sgemv.sgemv("No transpose", paramInt2 - paramInt3, paramInt3, -1.0F, paramArrayOfFloat1, 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt9, 1, 1.0F, paramArrayOfFloat3, paramInt8, 1);
    }
    if ((paramInt2 <= paramInt3 ? 0 : 1) != 0)
    {
      Strtrs.strtrs("Upper", "No transpose", "Non-unit", paramInt2 - paramInt3, 1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt8, paramInt2 - paramInt3, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramintW.val = 2;
        return;
      }
      Scopy.scopy(paramInt2 - paramInt3, paramArrayOfFloat3, paramInt8, 1, paramArrayOfFloat5, paramInt10, 1);
    }
    if ((paramInt1 >= paramInt2 ? 0 : 1) != 0)
    {
      i6 = paramInt1 + paramInt3 - paramInt2;
      if ((i6 <= 0 ? 0 : 1) != 0) {
        Sgemv.sgemv("No transpose", i6, paramInt2 - paramInt1, -1.0F, paramArrayOfFloat1, paramInt2 - paramInt3 + 1 - 1 + (paramInt1 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, i6 + 1 - 1 + paramInt9, 1, 1.0F, paramArrayOfFloat3, paramInt2 - paramInt3 + 1 - 1 + paramInt8, 1);
      }
    }
    else
    {
      i6 = paramInt3;
    }
    if ((i6 <= 0 ? 0 : 1) != 0)
    {
      Strmv.strmv("Upper", "No transpose", "Non unit", i6, paramArrayOfFloat1, paramInt2 - paramInt3 + 1 - 1 + (paramInt2 - paramInt3 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat4, paramInt9, 1);
      Saxpy.saxpy(i6, -1.0F, paramArrayOfFloat4, paramInt9, 1, paramArrayOfFloat3, paramInt2 - paramInt3 + 1 - 1 + paramInt8, 1);
    }
    Sormrq.sormrq("Left", "Transpose", paramInt2, 1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat6, 1 - 1 + paramInt11, paramArrayOfFloat5, paramInt10, paramInt2, paramArrayOfFloat6, paramInt3 + n + 1 - 1 + paramInt11, paramInt12 - paramInt3 - n, paramintW);
    paramArrayOfFloat6[(1 - 1 + paramInt11)] = (paramInt3 + n + Math.max(j, (int)paramArrayOfFloat6[(paramInt3 + n + 1 - 1 + paramInt11)]));
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgglse.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */