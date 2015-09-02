package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dggsvd
{
  public static void dggsvd(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, intW paramintW1, intW paramintW2, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, double[] paramArrayOfDouble6, int paramInt12, int paramInt13, double[] paramArrayOfDouble7, int paramInt14, int paramInt15, double[] paramArrayOfDouble8, int paramInt16, int[] paramArrayOfInt, int paramInt17, intW paramintW3)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW = new intW(0);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    bool2 = Lsame.lsame(paramString1, "U");
    bool3 = Lsame.lsame(paramString2, "V");
    bool1 = Lsame.lsame(paramString3, "Q");
    paramintW3.val = 0;
    if ((((!bool2) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((((!bool3) && (!Lsame.lsame(paramString2, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((((!bool1) && (!Lsame.lsame(paramString3, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -3;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -4;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -5;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -6;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW3.val = -10;
    }
    else if ((paramInt7 >= Math.max(1, paramInt3) ? 0 : 1) != 0)
    {
      paramintW3.val = -12;
    }
    else
    {
      if ((paramInt11 >= 1 ? 0 : 1) == 0) {
        if (!bool2) {}
      }
      if ((((paramInt11 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -16;
      }
      else
      {
        if ((paramInt13 >= 1 ? 0 : 1) == 0) {
          if (!bool3) {}
        }
        if ((((paramInt13 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW3.val = -18;
        }
        else
        {
          if ((paramInt15 >= 1 ? 0 : 1) == 0) {
            if (!bool1) {}
          }
          if ((((paramInt15 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW3.val = -20;
          }
        }
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGGSVD", -paramintW3.val);
      return;
    }
    d1 = Dlange.dlange("1", paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble8, paramInt16);
    d2 = Dlange.dlange("1", paramInt3, paramInt2, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble8, paramInt16);
    d7 = Dlamch.dlamch("Precision");
    d8 = Dlamch.dlamch("Safe Minimum");
    d5 = Math.max(paramInt1, paramInt2) * Math.max(d1, d8) * d7;
    d6 = Math.max(paramInt3, paramInt2) * Math.max(d2, d8) * d7;
    Dggsvp.dggsvp(paramString1, paramString2, paramString3, paramInt1, paramInt3, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, d5, d6, paramintW1, paramintW2, paramArrayOfDouble5, paramInt10, paramInt11, paramArrayOfDouble6, paramInt12, paramInt13, paramArrayOfDouble7, paramInt14, paramInt15, paramArrayOfInt, paramInt17, paramArrayOfDouble8, paramInt16, paramArrayOfDouble8, paramInt2 + 1 - 1 + paramInt16, paramintW3);
    Dtgsja.dtgsja(paramString1, paramString2, paramString3, paramInt1, paramInt3, paramInt2, paramintW1.val, paramintW2.val, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, d5, d6, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, paramInt9, paramArrayOfDouble5, paramInt10, paramInt11, paramArrayOfDouble6, paramInt12, paramInt13, paramArrayOfDouble7, paramInt14, paramInt15, paramArrayOfDouble8, paramInt16, localintW, paramintW3);
    Dcopy.dcopy(paramInt2, paramArrayOfDouble3, paramInt8, 1, paramArrayOfDouble8, paramInt16, 1);
    j = Math.min(paramintW2.val, paramInt1 - paramintW1.val);
    i = 1;
    for (int n = j - 1 + 1; n > 0; n--)
    {
      k = i;
      d3 = paramArrayOfDouble8[(paramintW1.val + i - 1 + paramInt16)];
      m = i + 1;
      for (int i1 = j - (i + 1) + 1; i1 > 0; i1--)
      {
        d4 = paramArrayOfDouble8[(paramintW1.val + m - 1 + paramInt16)];
        if ((d4 <= d3 ? 0 : 1) != 0)
        {
          k = m;
          d3 = d4;
        }
        m += 1;
      }
      if ((k == i ? 0 : 1) != 0)
      {
        paramArrayOfDouble8[(paramintW1.val + k - 1 + paramInt16)] = paramArrayOfDouble8[(paramintW1.val + i - 1 + paramInt16)];
        paramArrayOfDouble8[(paramintW1.val + i - 1 + paramInt16)] = d3;
        paramArrayOfInt[(paramintW1.val + i - 1 + paramInt17)] = (paramintW1.val + k);
      }
      else
      {
        paramArrayOfInt[(paramintW1.val + i - 1 + paramInt17)] = (paramintW1.val + i);
      }
      i += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dggsvd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */