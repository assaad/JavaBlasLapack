package org.netlib.lapack;

import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sggbak
{
  public static void sggbak(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    int j = 0;
    bool2 = Lsame.lsame(paramString2, "R");
    bool1 = Lsame.lsame(paramString2, "L");
    paramintW.val = 0;
    if ((((Lsame.lsame(paramString1, "N") ^ true)) && ((Lsame.lsame(paramString1, "P") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString1, "S") ^ true) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString1, "B") ^ true) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool2 ^ true)) && ((bool1 ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0) {}
      if (((paramInt3 != 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
      if (((paramInt2 == 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -4;
      }
      else
      {
        if ((paramInt1 <= 0 ? 0 : 1) != 0) {
          if ((paramInt3 >= paramInt2 ? 0 : 1) != 0) {}
        }
        if ((((paramInt3 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW.val = -5;
        }
        else
        {
          if ((paramInt1 != 0 ? 0 : 1) != 0) {}
          if (((paramInt2 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
          if (((paramInt3 == 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramintW.val = -5;
          } else if ((paramInt6 >= 0 ? 0 : 1) != 0) {
            paramintW.val = -8;
          } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -10;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGGBAK", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt6 != 0 ? 0 : 1) != 0) {
      return;
    }
    if (Lsame.lsame(paramString1, "N")) {
      return;
    }
    int k;
    if ((paramInt2 != paramInt3 ? 0 : 1) == 0) {
      if (((!Lsame.lsame(paramString1, "S")) && (!Lsame.lsame(paramString1, "B")) ? 0 : 1) != 0)
      {
        if (bool2)
        {
          i = paramInt2;
          for (k = paramInt3 - paramInt2 + 1; k > 0; k--)
          {
            Sscal.sscal(paramInt6, paramArrayOfFloat2[(i - 1 + paramInt5)], paramArrayOfFloat3, i - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
            i += 1;
          }
        }
        if (bool1)
        {
          i = paramInt2;
          for (k = paramInt3 - paramInt2 + 1; k > 0; k--)
          {
            Sscal.sscal(paramInt6, paramArrayOfFloat1[(i - 1 + paramInt4)], paramArrayOfFloat3, i - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
            i += 1;
          }
        }
      }
    }
    if (((!Lsame.lsame(paramString1, "P")) && (!Lsame.lsame(paramString1, "B")) ? 0 : 1) != 0)
    {
      if (bool2)
      {
        if ((paramInt2 != 1 ? 0 : 1) == 0)
        {
          i = paramInt2 - 1;
          for (k = (1 - (paramInt2 - 1) + -1) / -1; k > 0; k--)
          {
            j = (int)paramArrayOfFloat2[(i - 1 + paramInt5)];
            if ((j != i ? 0 : 1) == 0) {
              Sswap.sswap(paramInt6, paramArrayOfFloat3, i - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat3, j - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
            }
            i += -1;
          }
        }
        if ((paramInt3 != paramInt1 ? 0 : 1) == 0)
        {
          i = paramInt3 + 1;
          for (k = paramInt1 - (paramInt3 + 1) + 1; k > 0; k--)
          {
            j = (int)paramArrayOfFloat2[(i - 1 + paramInt5)];
            if ((j != i ? 0 : 1) == 0) {
              Sswap.sswap(paramInt6, paramArrayOfFloat3, i - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat3, j - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
            }
            i += 1;
          }
        }
      }
      if (bool1)
      {
        if ((paramInt2 != 1 ? 0 : 1) == 0)
        {
          i = paramInt2 - 1;
          for (k = (1 - (paramInt2 - 1) + -1) / -1; k > 0; k--)
          {
            j = (int)paramArrayOfFloat1[(i - 1 + paramInt4)];
            if ((j != i ? 0 : 1) == 0) {
              Sswap.sswap(paramInt6, paramArrayOfFloat3, i - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat3, j - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
            }
            i += -1;
          }
        }
        if ((paramInt3 != paramInt1 ? 0 : 1) == 0)
        {
          i = paramInt3 + 1;
          for (k = paramInt1 - (paramInt3 + 1) + 1; k > 0; k--)
          {
            j = (int)paramArrayOfFloat1[(i - 1 + paramInt4)];
            if ((j != i ? 0 : 1) == 0) {
              Sswap.sswap(paramInt6, paramArrayOfFloat3, i - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat3, j - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
            }
            i += 1;
          }
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sggbak.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */