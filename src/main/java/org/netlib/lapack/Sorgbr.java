package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sorgbr
{
  public static void sorgbr(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, intW paramintW)
  {
    int i = 0;
    boolean bool = false;
    int j = 0;
    intW localintW = new intW(0);
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "Q");
    n = Math.min(paramInt1, paramInt2);
    i = paramInt8 != -1 ? 0 : 1;
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "P") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt2 >= 0 ? 0 : 1) == 0) {
        if (bool) {
          if ((paramInt2 <= paramInt1 ? 0 : 1) != 0) {}
        }
      }
      if (((((paramInt2 >= Math.min(paramInt1, paramInt3) ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
        if ((bool ^ true)) {
          if ((paramInt1 <= paramInt2 ? 0 : 1) != 0) {}
        }
      }
      if (((((paramInt1 >= Math.min(paramInt2, paramInt3) ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -3;
      }
      else if ((paramInt3 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -4;
      }
      else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -6;
      }
      else
      {
        if ((paramInt8 >= Math.max(1, n) ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -9;
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if (bool) {
        i1 = Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt2, paramInt3, -1);
      } else {
        i1 = Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt1, paramInt2, paramInt3, -1);
      }
      m = Math.max(1, n) * i1;
      paramArrayOfFloat3[(1 - 1 + paramInt7)] = m;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SORGBR", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramArrayOfFloat3[(1 - 1 + paramInt7)] = 1;
      return;
    }
    int i2;
    int i3;
    if (bool)
    {
      if ((paramInt1 < paramInt3 ? 0 : 1) != 0)
      {
        Sorgqr.sorgqr(paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt8, localintW);
      }
      else
      {
        k = paramInt1;
        for (i2 = (2 - paramInt1 + -1) / -1; i2 > 0; i2--)
        {
          paramArrayOfFloat1[(1 - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0F;
          j = k + 1;
          for (i3 = paramInt1 - (k + 1) + 1; i3 > 0; i3--)
          {
            paramArrayOfFloat1[(j - 1 + (k - 1) * paramInt5 + paramInt4)] = paramArrayOfFloat1[(j - 1 + (k - 1 - 1) * paramInt5 + paramInt4)];
            j += 1;
          }
          k += -1;
        }
        paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0F;
        j = 2;
        for (i2 = paramInt1 - 2 + 1; i2 > 0; i2--)
        {
          paramArrayOfFloat1[(j - 1 + (1 - 1) * paramInt5 + paramInt4)] = 0.0F;
          j += 1;
        }
        if ((paramInt1 <= 1 ? 0 : 1) != 0) {
          Sorgqr.sorgqr(paramInt1 - 1, paramInt1 - 1, paramInt1 - 1, paramArrayOfFloat1, 2 - 1 + (2 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt8, localintW);
        }
      }
    }
    else if ((paramInt3 >= paramInt2 ? 0 : 1) != 0)
    {
      Sorglq.sorglq(paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt8, localintW);
    }
    else
    {
      paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0F;
      j = 2;
      for (i2 = paramInt2 - 2 + 1; i2 > 0; i2--)
      {
        paramArrayOfFloat1[(j - 1 + (1 - 1) * paramInt5 + paramInt4)] = 0.0F;
        j += 1;
      }
      k = 2;
      for (i2 = paramInt2 - 2 + 1; i2 > 0; i2--)
      {
        j = k - 1;
        for (i3 = (2 - (k - 1) + -1) / -1; i3 > 0; i3--)
        {
          paramArrayOfFloat1[(j - 1 + (k - 1) * paramInt5 + paramInt4)] = paramArrayOfFloat1[(j - 1 - 1 + (k - 1) * paramInt5 + paramInt4)];
          j += -1;
        }
        paramArrayOfFloat1[(1 - 1 + (k - 1) * paramInt5 + paramInt4)] = 0.0F;
        k += 1;
      }
      if ((paramInt2 <= 1 ? 0 : 1) != 0) {
        Sorglq.sorglq(paramInt2 - 1, paramInt2 - 1, paramInt2 - 1, paramArrayOfFloat1, 2 - 1 + (2 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt8, localintW);
      }
    }
    paramArrayOfFloat3[(1 - 1 + paramInt7)] = m;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sorgbr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */