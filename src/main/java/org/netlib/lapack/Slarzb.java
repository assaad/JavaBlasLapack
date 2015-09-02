package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.blas.Strmm;
import org.netlib.err.Xerbla;

public final class Slarzb
{
  public static void slarzb(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, int paramInt6, float[] paramArrayOfFloat2, int paramInt7, int paramInt8, float[] paramArrayOfFloat3, int paramInt9, int paramInt10, float[] paramArrayOfFloat4, int paramInt11, int paramInt12)
  {
    String str = new String(" ");
    int i = 0;
    int j = 0;
    int k = 0;
    if ((paramInt1 > 0 ? 0 : 1) == 0) {}
    if (((paramInt2 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    j = 0;
    if ((Lsame.lsame(paramString3, "B") ^ true)) {
      j = -3;
    } else if ((Lsame.lsame(paramString4, "R") ^ true)) {
      j = -4;
    }
    if ((j == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLARZB", -j);
      return;
    }
    if (Lsame.lsame(paramString2, "N")) {
      str = "T";
    } else {
      str = "N";
    }
    int m;
    int n;
    if (Lsame.lsame(paramString1, "L"))
    {
      k = 1;
      for (m = paramInt3 - 1 + 1; m > 0; m--)
      {
        Scopy.scopy(paramInt2, paramArrayOfFloat3, k - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfFloat4, 1 - 1 + (k - 1) * paramInt12 + paramInt11, 1);
        k += 1;
      }
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        Sgemm.sgemm("Transpose", "Transpose", paramInt2, paramInt3, paramInt4, 1.0F, paramArrayOfFloat3, paramInt1 - paramInt4 + 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfFloat1, paramInt5, paramInt6, 1.0F, paramArrayOfFloat4, paramInt11, paramInt12);
      }
      Strmm.strmm("Right", "Lower", str, "Non-unit", paramInt2, paramInt3, 1.0F, paramArrayOfFloat2, paramInt7, paramInt8, paramArrayOfFloat4, paramInt11, paramInt12);
      k = 1;
      for (m = paramInt2 - 1 + 1; m > 0; m--)
      {
        i = 1;
        for (n = paramInt3 - 1 + 1; n > 0; n--)
        {
          paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt10 + paramInt9)] -= paramArrayOfFloat4[(k - 1 + (i - 1) * paramInt12 + paramInt11)];
          i += 1;
        }
        k += 1;
      }
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        Sgemm.sgemm("Transpose", "Transpose", paramInt4, paramInt2, paramInt3, -1.0F, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfFloat4, paramInt11, paramInt12, 1.0F, paramArrayOfFloat3, paramInt1 - paramInt4 + 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
      }
    }
    else if (Lsame.lsame(paramString1, "R"))
    {
      k = 1;
      for (m = paramInt3 - 1 + 1; m > 0; m--)
      {
        Scopy.scopy(paramInt1, paramArrayOfFloat3, 1 - 1 + (k - 1) * paramInt10 + paramInt9, 1, paramArrayOfFloat4, 1 - 1 + (k - 1) * paramInt12 + paramInt11, 1);
        k += 1;
      }
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        Sgemm.sgemm("No transpose", "Transpose", paramInt1, paramInt3, paramInt4, 1.0F, paramArrayOfFloat3, 1 - 1 + (paramInt2 - paramInt4 + 1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfFloat1, paramInt5, paramInt6, 1.0F, paramArrayOfFloat4, paramInt11, paramInt12);
      }
      Strmm.strmm("Right", "Lower", paramString2, "Non-unit", paramInt1, paramInt3, 1.0F, paramArrayOfFloat2, paramInt7, paramInt8, paramArrayOfFloat4, paramInt11, paramInt12);
      k = 1;
      for (m = paramInt3 - 1 + 1; m > 0; m--)
      {
        i = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          paramArrayOfFloat3[(i - 1 + (k - 1) * paramInt10 + paramInt9)] -= paramArrayOfFloat4[(i - 1 + (k - 1) * paramInt12 + paramInt11)];
          i += 1;
        }
        k += 1;
      }
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        Sgemm.sgemm("No transpose", "No transpose", paramInt1, paramInt4, paramInt3, -1.0F, paramArrayOfFloat4, paramInt11, paramInt12, paramArrayOfFloat1, paramInt5, paramInt6, 1.0F, paramArrayOfFloat3, 1 - 1 + (paramInt2 - paramInt4 + 1 - 1) * paramInt10 + paramInt9, paramInt10);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarzb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */