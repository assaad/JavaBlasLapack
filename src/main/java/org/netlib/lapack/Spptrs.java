package org.netlib.lapack;

import org.netlib.blas.Stpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Spptrs
{
  public static void spptrs(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, intW paramintW)
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
    } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPPTRS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    int j;
    if (bool)
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        Stpsv.stpsv("Upper", "Transpose", "Non-unit", paramInt1, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        Stpsv.stpsv("Upper", "No transpose", "Non-unit", paramInt1, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        Stpsv.stpsv("Lower", "No transpose", "Non-unit", paramInt1, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        Stpsv.stpsv("Lower", "Transpose", "Non-unit", paramInt1, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spptrs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */