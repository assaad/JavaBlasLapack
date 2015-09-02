package org.netlib.lapack;

import org.netlib.blas.Stbsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spbtrs
{
  public static void spbtrs(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt5 >= paramInt2 + 1 ? 0 : 1) != 0) {
      paramintW.val = -6;
    } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -8;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPBTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    int j;
    if (bool)
    {
      i = 1;
      for (j = paramInt3 - 1 + 1; j > 0; j--)
      {
        Stbsv.stbsv("Upper", "Transpose", "Non-unit", paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
        Stbsv.stbsv("Upper", "No transpose", "Non-unit", paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt3 - 1 + 1; j > 0; j--)
      {
        Stbsv.stbsv("Lower", "No transpose", "Non-unit", paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
        Stbsv.stbsv("Lower", "Transpose", "Non-unit", paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt7 + paramInt6, 1);
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spbtrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */