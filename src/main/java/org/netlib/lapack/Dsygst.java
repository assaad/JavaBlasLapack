package org.netlib.lapack;

import org.netlib.blas.Dsymm;
import org.netlib.blas.Dsyr2k;
import org.netlib.blas.Dtrmm;
import org.netlib.blas.Dtrsm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsygst
{
  public static void dsygst(int paramInt1, String paramString, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, intW paramintW)
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
      Xerbla.xerbla("DSYGST", -paramintW.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    k = Ilaenv.ilaenv(1, "DSYGST", paramString, paramInt2, -1, -1, -1);
    if ((k > 1 ? 0 : 1) == 0) {}
    if (((k < paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Dsygs2.dsygs2(paramInt1, paramString, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6, paramintW);
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
            Dsygs2.dsygs2(paramInt1, paramString, j, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramintW);
            if ((i + j > paramInt2 ? 0 : 1) != 0)
            {
              Dtrsm.dtrsm("Left", paramString, "Transpose", "Non-unit", j, paramInt2 - i - j + 1, 1.0D, paramArrayOfDouble2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
              Dsymm.dsymm("Left", paramString, j, paramInt2 - i - j + 1, -0.5D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (i + j - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, i - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
              Dsyr2k.dsyr2k(paramString, "Transpose", paramInt2 - i - j + 1, j, -1.0D, paramArrayOfDouble1, i - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (i + j - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, i + j - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
              Dsymm.dsymm("Left", paramString, j, paramInt2 - i - j + 1, -0.5D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (i + j - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, i - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
              Dtrsm.dtrsm("Right", paramString, "No transpose", "Non-unit", j, paramInt2 - i - j + 1, 1.0D, paramArrayOfDouble2, i + j - 1 + (i + j - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
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
            Dsygs2.dsygs2(paramInt1, paramString, j, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramintW);
            if ((i + j > paramInt2 ? 0 : 1) != 0)
            {
              Dtrsm.dtrsm("Right", paramString, "Transpose", "Non-unit", paramInt2 - i - j + 1, j, 1.0D, paramArrayOfDouble2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i + j - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
              Dsymm.dsymm("Right", paramString, paramInt2 - i - j + 1, j, -0.5D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i + j - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, i + j - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
              Dsyr2k.dsyr2k(paramString, "No transpose", paramInt2 - i - j + 1, j, -1.0D, paramArrayOfDouble1, i + j - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i + j - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, i + j - 1 + (i + j - 1) * paramInt4 + paramInt3, paramInt4);
              Dsymm.dsymm("Right", paramString, paramInt2 - i - j + 1, j, -0.5D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i + j - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, i + j - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
              Dtrsm.dtrsm("Left", paramString, "No transpose", "Non-unit", paramInt2 - i - j + 1, j, 1.0D, paramArrayOfDouble2, i + j - 1 + (i + j - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i + j - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
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
          Dtrmm.dtrmm("Left", paramString, "No transpose", "Non-unit", i - 1, j, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
          Dsymm.dsymm("Right", paramString, i - 1, j, 0.5D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
          Dsyr2k.dsyr2k(paramString, "No transpose", i - 1, j, 1.0D, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4);
          Dsymm.dsymm("Right", paramString, i - 1, j, 0.5D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
          Dtrmm.dtrmm("Right", paramString, "Transpose", "Non-unit", i - 1, j, 1.0D, paramArrayOfDouble2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4);
          Dsygs2.dsygs2(paramInt1, paramString, j, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramintW);
          i += k;
        }
      }
      else
      {
        i = 1;
        for (m = (paramInt2 - 1 + k) / k; m > 0; m--)
        {
          j = Math.min(paramInt2 - i + 1, k);
          Dtrmm.dtrmm("Right", paramString, "No transpose", "Non-unit", j, i - 1, 1.0D, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          Dsymm.dsymm("Left", paramString, j, i - 1, 0.5D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          Dsyr2k.dsyr2k(paramString, "Transpose", i - 1, j, 1.0D, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4);
          Dsymm.dsymm("Left", paramString, j, i - 1, 0.5D, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt6 + paramInt5, paramInt6, 1.0D, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          Dtrmm.dtrmm("Left", paramString, "Transpose", "Non-unit", j, i - 1, 1.0D, paramArrayOfDouble2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          Dsygs2.dsygs2(paramInt1, paramString, j, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i - 1 + (i - 1) * paramInt6 + paramInt5, paramInt6, paramintW);
          i += k;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsygst.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */