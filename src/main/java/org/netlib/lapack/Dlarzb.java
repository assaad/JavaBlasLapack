package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Dtrmm;
import org.netlib.err.Xerbla;

public final class Dlarzb
{
  public static void dlarzb(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, int paramInt6, double[] paramArrayOfDouble2, int paramInt7, int paramInt8, double[] paramArrayOfDouble3, int paramInt9, int paramInt10, double[] paramArrayOfDouble4, int paramInt11, int paramInt12)
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
      Xerbla.xerbla("DLARZB", -j);
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
        Dcopy.dcopy(paramInt2, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble4, 1 - 1 + (k - 1) * paramInt12 + paramInt11, 1);
        k += 1;
      }
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        Dgemm.dgemm("Transpose", "Transpose", paramInt2, paramInt3, paramInt4, 1.0D, paramArrayOfDouble3, paramInt1 - paramInt4 + 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble1, paramInt5, paramInt6, 1.0D, paramArrayOfDouble4, paramInt11, paramInt12);
      }
      Dtrmm.dtrmm("Right", "Lower", str, "Non-unit", paramInt2, paramInt3, 1.0D, paramArrayOfDouble2, paramInt7, paramInt8, paramArrayOfDouble4, paramInt11, paramInt12);
      k = 1;
      for (m = paramInt2 - 1 + 1; m > 0; m--)
      {
        i = 1;
        for (n = paramInt3 - 1 + 1; n > 0; n--)
        {
          paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt10 + paramInt9)] -= paramArrayOfDouble4[(k - 1 + (i - 1) * paramInt12 + paramInt11)];
          i += 1;
        }
        k += 1;
      }
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        Dgemm.dgemm("Transpose", "Transpose", paramInt4, paramInt2, paramInt3, -1.0D, paramArrayOfDouble1, paramInt5, paramInt6, paramArrayOfDouble4, paramInt11, paramInt12, 1.0D, paramArrayOfDouble3, paramInt1 - paramInt4 + 1 - 1 + (1 - 1) * paramInt10 + paramInt9, paramInt10);
      }
    }
    else if (Lsame.lsame(paramString1, "R"))
    {
      k = 1;
      for (m = paramInt3 - 1 + 1; m > 0; m--)
      {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble3, 1 - 1 + (k - 1) * paramInt10 + paramInt9, 1, paramArrayOfDouble4, 1 - 1 + (k - 1) * paramInt12 + paramInt11, 1);
        k += 1;
      }
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        Dgemm.dgemm("No transpose", "Transpose", paramInt1, paramInt3, paramInt4, 1.0D, paramArrayOfDouble3, 1 - 1 + (paramInt2 - paramInt4 + 1 - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble1, paramInt5, paramInt6, 1.0D, paramArrayOfDouble4, paramInt11, paramInt12);
      }
      Dtrmm.dtrmm("Right", "Lower", paramString2, "Non-unit", paramInt1, paramInt3, 1.0D, paramArrayOfDouble2, paramInt7, paramInt8, paramArrayOfDouble4, paramInt11, paramInt12);
      k = 1;
      for (m = paramInt3 - 1 + 1; m > 0; m--)
      {
        i = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          paramArrayOfDouble3[(i - 1 + (k - 1) * paramInt10 + paramInt9)] -= paramArrayOfDouble4[(i - 1 + (k - 1) * paramInt12 + paramInt11)];
          i += 1;
        }
        k += 1;
      }
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        Dgemm.dgemm("No transpose", "No transpose", paramInt1, paramInt4, paramInt3, -1.0D, paramArrayOfDouble4, paramInt11, paramInt12, paramArrayOfDouble1, paramInt5, paramInt6, 1.0D, paramArrayOfDouble3, 1 - 1 + (paramInt2 - paramInt4 + 1 - 1) * paramInt10 + paramInt9, paramInt10);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarzb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */