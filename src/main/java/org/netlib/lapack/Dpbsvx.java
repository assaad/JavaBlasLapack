package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.StringW;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dpbsvx
{
  public static void dpbsvx(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, StringW paramStringW, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, int paramInt12, doubleW paramdoubleW, double[] paramArrayOfDouble6, int paramInt13, double[] paramArrayOfDouble7, int paramInt14, double[] paramArrayOfDouble8, int paramInt15, int[] paramArrayOfInt, int paramInt16, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    int i = 0;
    intW localintW = new intW(0);
    int j = 0;
    int k = 0;
    int m = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    paramintW.val = 0;
    bool2 = Lsame.lsame(paramString1, "N");
    bool1 = Lsame.lsame(paramString1, "E");
    bool4 = Lsame.lsame(paramString2, "U");
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      paramStringW.val = "N";
      bool3 = false;
    }
    else
    {
      bool3 = Lsame.lsame(paramStringW.val, "Y");
      d5 = Dlamch.dlamch("Safe minimum");
      d2 = 1.0D / d5;
    }
    if ((((bool2 ^ true)) && ((bool1 ^ true)) ? 1 : 0) != 0) {}
    int n;
    if (((Lsame.lsame(paramString1, "F") ^ true) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool4 ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else if ((paramInt5 >= paramInt2 + 1 ? 0 : 1) != 0)
    {
      paramintW.val = -7;
    }
    else if ((paramInt7 >= paramInt2 + 1 ? 0 : 1) != 0)
    {
      paramintW.val = -9;
    }
    else
    {
      if (Lsame.lsame(paramString1, "F")) {}
      if (((((!bool3) && (!Lsame.lsame(paramStringW.val, "N")) ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -10;
      }
      else
      {
        if (bool3)
        {
          d4 = d2;
          d3 = 0.0D;
          j = 1;
          for (n = paramInt1 - 1 + 1; n > 0; n--)
          {
            d4 = Math.min(d4, paramArrayOfDouble3[(j - 1 + paramInt8)]);
            d3 = Math.max(d3, paramArrayOfDouble3[(j - 1 + paramInt8)]);
            j += 1;
          }
          if ((d4 > 0.0D ? 0 : 1) != 0) {
            paramintW.val = -11;
          } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
            localdoubleW2.val = (Math.max(d4, d5) / Math.min(d3, d2));
          } else {
            localdoubleW2.val = 1.0D;
          }
        }
        if ((paramintW.val != 0 ? 0 : 1) != 0) {
          if ((paramInt10 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -13;
          } else if ((paramInt12 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -15;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPBSVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Dpbequ.dpbequ(paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt8, localdoubleW2, localdoubleW1, localintW);
      if ((localintW.val != 0 ? 0 : 1) != 0)
      {
        Dlaqsb.dlaqsb(paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt8, localdoubleW2.val, localdoubleW1.val, paramStringW);
        bool3 = Lsame.lsame(paramStringW.val, "Y");
      }
    }
    int i1;
    if (bool3)
    {
      j = 1;
      for (n = paramInt3 - 1 + 1; n > 0; n--)
      {
        i = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt10 + paramInt9)] = (paramArrayOfDouble3[(i - 1 + paramInt8)] * paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt10 + paramInt9)]);
          i += 1;
        }
        j += 1;
      }
    }
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      if (bool4)
      {
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          k = Math.max(j - paramInt2, 1);
          Dcopy.dcopy(j - k + 1, paramArrayOfDouble1, paramInt2 + 1 - j + k - 1 + (j - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, paramInt2 + 1 - j + k - 1 + (j - 1) * paramInt7 + paramInt6, 1);
          j += 1;
        }
      }
      else
      {
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          m = Math.min(j + paramInt2, paramInt1);
          Dcopy.dcopy(m - j + 1, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, 1 - 1 + (j - 1) * paramInt7 + paramInt6, 1);
          j += 1;
        }
      }
      Dpbtrf.dpbtrf(paramString2, paramInt1, paramInt2, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramdoubleW.val = 0.0D;
        return;
      }
    }
    d1 = Dlansb.dlansb("1", paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble8, paramInt15);
    Dpbcon.dpbcon(paramString2, paramInt1, paramInt2, paramArrayOfDouble2, paramInt6, paramInt7, d1, paramdoubleW, paramArrayOfDouble8, paramInt15, paramArrayOfInt, paramInt16, paramintW);
    Dlacpy.dlacpy("Full", paramInt1, paramInt3, paramArrayOfDouble4, paramInt9, paramInt10, paramArrayOfDouble5, paramInt11, paramInt12);
    Dpbtrs.dpbtrs(paramString2, paramInt1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble5, paramInt11, paramInt12, paramintW);
    Dpbrfs.dpbrfs(paramString2, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt9, paramInt10, paramArrayOfDouble5, paramInt11, paramInt12, paramArrayOfDouble6, paramInt13, paramArrayOfDouble7, paramInt14, paramArrayOfDouble8, paramInt15, paramArrayOfInt, paramInt16, paramintW);
    if (bool3)
    {
      j = 1;
      for (n = paramInt3 - 1 + 1; n > 0; n--)
      {
        i = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt12 + paramInt11)] = (paramArrayOfDouble3[(i - 1 + paramInt8)] * paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt12 + paramInt11)]);
          i += 1;
        }
        j += 1;
      }
      j = 1;
      for (n = paramInt3 - 1 + 1; n > 0; n--)
      {
        paramArrayOfDouble6[(j - 1 + paramInt13)] /= localdoubleW2.val;
        j += 1;
      }
    }
    if ((paramdoubleW.val >= Dlamch.dlamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpbsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */