package org.netlib.lapack;

import org.netlib.blas.Dtpmv;
import org.netlib.blas.Dtpsv;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dspgvd
{
  public static void dspgvd(int paramInt1, String paramString1, String paramString2, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, int paramInt9, int[] paramArrayOfInt, int paramInt10, int paramInt11, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    String str = new String(" ");
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    bool2 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "U");
    if ((paramInt9 != -1 ? 0 : 1) == 0) {}
    i = (paramInt11 != -1 ? 0 : 1) == 0 ? 0 : 1;
    paramintW.val = 0;
    if ((paramInt1 >= 1 ? 0 : 1) == 0) {}
    if (((paramInt1 <= 3 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((!bool2) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((((!bool1) && (!Lsame.lsame(paramString2, "L")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((paramInt7 >= 1 ? 0 : 1) == 0) {
        if (!bool2) {}
      }
      if ((((paramInt7 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -9;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt2 > 1 ? 0 : 1) != 0)
      {
        k = 1;
        m = 1;
      }
      else if (bool2)
      {
        k = 3 + 5 * paramInt2;
        m = 1 + 6 * paramInt2 + 2 * (int)Math.pow(paramInt2, 2);
      }
      else
      {
        k = 1;
        m = 2 * paramInt2;
      }
      paramArrayOfDouble5[(1 - 1 + paramInt8)] = m;
      paramArrayOfInt[(1 - 1 + paramInt10)] = k;
      if ((paramInt9 >= m ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -11;
      }
      else
      {
        if ((paramInt11 >= k ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -13;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSPGVD", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    Dpptrf.dpptrf(paramString2, paramInt2, paramArrayOfDouble2, paramInt4, paramintW);
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      paramintW.val = (paramInt2 + paramintW.val);
      return;
    }
    Dspgst.dspgst(paramInt1, paramString2, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramintW);
    Dspevd.dspevd(paramString1, paramString2, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfInt, paramInt10, paramInt11, paramintW);
    m = (int)Math.max(m, paramArrayOfDouble5[(1 - 1 + paramInt8)]);
    k = (int)Math.max(k, paramArrayOfInt[(1 - 1 + paramInt10)]);
    if (bool2)
    {
      n = paramInt2;
      if ((paramintW.val <= 0 ? 0 : 1) != 0) {
        n = paramintW.val - 1;
      }
      if ((paramInt1 != 1 ? 0 : 1) == 0) {}
      int i1;
      if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if (bool1) {
          str = "N";
        } else {
          str = "T";
        }
        j = 1;
        for (i1 = n - 1 + 1; i1 > 0; i1--)
        {
          Dtpsv.dtpsv(paramString2, str, "Non-unit", paramInt2, paramArrayOfDouble2, paramInt4, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt7 + paramInt6, 1);
          j += 1;
        }
      }
      else if ((paramInt1 != 3 ? 0 : 1) != 0)
      {
        if (bool1) {
          str = "T";
        } else {
          str = "N";
        }
        j = 1;
        i1 = n - 1 + 1;
        for (;;)
        {
          Dtpmv.dtpmv(paramString2, str, "Non-unit", paramInt2, paramArrayOfDouble2, paramInt4, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt7 + paramInt6, 1);
          j += 1;
          i1--;
          if (i1 <= 0) {
            break;
          }
        }
      }
    }
    paramArrayOfDouble5[(1 - 1 + paramInt8)] = m;
    paramArrayOfInt[(1 - 1 + paramInt10)] = k;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dspgvd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */