package org.netlib.lapack;

import org.netlib.blas.Ssymm;
import org.netlib.blas.Ssyr2k;
import org.netlib.blas.Strmm;
import org.netlib.blas.Strsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ssygst
{
  public static void ssygst(int paramInt1, String paramString, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW.val = -7;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSYGST", -paramintW.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    k = Ilaenv.ilaenv(1, "SSYGST", paramString, paramInt2, -1, -1, -1);
    if ((k > 1 ? 0 : 1) == 0) {}
    if (((k < paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Ssygs2.ssygs2(paramInt1, paramString, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramInt6, paramintW);
    }
    else
    {
      int m;
      if ((paramInt1 != 1 ? 0 : 1) != 0)
      {
        if (bool)
        {
          i = 1;
          for (m = (paramInt2 - 1 + k) / k; m > 0; m--)
          {
            j = Math.min(paramInt2 - i + 1, k);
            Ssygs2.ssygs2(paramInt1, paramString, j, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramintW);
            if ((i + j > paramInt2 ? 0 : 1) != 0)
            {
              Strsm.strsm("Left", paramString, "Transpose", "Non-unit", j, paramInt2 - i - j + 1, 1.0F, paramArrayOfFloat2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
              Ssymm.ssymm("Left", paramString, j, paramInt2 - i - j + 1, -0.5F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (i + j - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, i - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
              Ssyr2k.ssyr2k(paramString, "Transpose", paramInt2 - i - j + 1, j, -1.0F, paramArrayOfFloat1, i - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (i + j - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, i + j - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
              Ssymm.ssymm("Left", paramString, j, paramInt2 - i - j + 1, -0.5F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (i + j - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, i - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
              Strsm.strsm("Right", paramString, "No transpose", "Non-unit", j, paramInt2 - i - j + 1, 1.0F, paramArrayOfFloat2, i + j - 1 + (i + j - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
            }
            i += k;
          }
        }
        else
        {
          i = 1;
          for (m = (paramInt2 - 1 + k) / k; m > 0; m--)
          {
            j = Math.min(paramInt2 - i + 1, k);
            Ssygs2.ssygs2(paramInt1, paramString, j, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramintW);
            if ((i + j > paramInt2 ? 0 : 1) != 0)
            {
              Strsm.strsm("Right", paramString, "Transpose", "Non-unit", paramInt2 - i - j + 1, j, 1.0F, paramArrayOfFloat2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i + j - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
              Ssymm.ssymm("Right", paramString, paramInt2 - i - j + 1, j, -0.5F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i + j - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, i + j - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
              Ssyr2k.ssyr2k(paramString, "No transpose", paramInt2 - i - j + 1, j, -1.0F, paramArrayOfFloat1, i + j - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i + j - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, i + j - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
              Ssymm.ssymm("Right", paramString, paramInt2 - i - j + 1, j, -0.5F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i + j - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, i + j - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
              Strsm.strsm("Left", paramString, "No transpose", "Non-unit", paramInt2 - i - j + 1, j, 1.0F, paramArrayOfFloat2, i + j - 1 + (i + j - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i + j - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
            }
            i += k;
          }
        }
      }
      else if (bool)
      {
        i = 1;
        for (m = (paramInt2 - 1 + k) / k; m > 0; m--)
        {
          j = Math.min(paramInt2 - i + 1, k);
          Strmm.strmm("Left", paramString, "No transpose", "Non-unit", i - 1, j, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
          Ssymm.ssymm("Right", paramString, i - 1, j, 0.5F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
          Ssyr2k.ssyr2k(paramString, "No transpose", i - 1, j, 1.0F, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4);
          Ssymm.ssymm("Right", paramString, i - 1, j, 0.5F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
          Strmm.strmm("Right", paramString, "Transpose", "Non-unit", i - 1, j, 1.0F, paramArrayOfFloat2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
          Ssygs2.ssygs2(paramInt1, paramString, j, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramintW);
          i += k;
        }
      }
      else
      {
        i = 1;
        for (m = (paramInt2 - 1 + k) / k; m > 0; m--)
        {
          j = Math.min(paramInt2 - i + 1, k);
          Strmm.strmm("Right", paramString, "No transpose", "Non-unit", j, i - 1, 1.0F, paramArrayOfFloat2, paramInt5, paramInt6, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          Ssymm.ssymm("Left", paramString, j, i - 1, 0.5F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          Ssyr2k.ssyr2k(paramString, "Transpose", i - 1, j, 1.0F, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4);
          Ssymm.ssymm("Left", paramString, j, i - 1, 0.5F, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 1.0F, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          Strmm.strmm("Left", paramString, "Transpose", "Non-unit", j, i - 1, 1.0F, paramArrayOfFloat2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          Ssygs2.ssygs2(paramInt1, paramString, j, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramintW);
          i += k;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssygst.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */