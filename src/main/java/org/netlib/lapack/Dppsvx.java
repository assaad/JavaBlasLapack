package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.StringW;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dppsvx
{
  public static void dppsvx(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, StringW paramStringW, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, int paramInt9, doubleW paramdoubleW, double[] paramArrayOfDouble6, int paramInt10, double[] paramArrayOfDouble7, int paramInt11, double[] paramArrayOfDouble8, int paramInt12, int[] paramArrayOfInt, int paramInt13, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    intW localintW = new intW(0);
    int j = 0;
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
    int k;
    if (((Lsame.lsame(paramString1, "F") ^ true) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((Lsame.lsame(paramString2, "U") ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
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
    else
    {
      if (Lsame.lsame(paramString1, "F")) {}
      if (((((!bool3) && (!Lsame.lsame(paramStringW.val, "N")) ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -7;
      }
      else
      {
        if (bool3)
        {
          d4 = d2;
          d3 = 0.0D;
          j = 1;
          for (k = paramInt1 - 1 + 1; k > 0; k--)
          {
            d4 = Math.min(d4, paramArrayOfDouble3[(j - 1 + paramInt5)]);
            d3 = Math.max(d3, paramArrayOfDouble3[(j - 1 + paramInt5)]);
            j += 1;
          }
          if ((d4 > 0.0D ? 0 : 1) != 0) {
            paramintW.val = -8;
          } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
            localdoubleW2.val = (Math.max(d4, d5) / Math.min(d3, d2));
          } else {
            localdoubleW2.val = 1.0D;
          }
        }
        if ((paramintW.val != 0 ? 0 : 1) != 0) {
          if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -10;
          } else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
            paramintW.val = -12;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPPSVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Dppequ.dppequ(paramString2, paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble3, paramInt5, localdoubleW2, localdoubleW1, localintW);
      if ((localintW.val != 0 ? 0 : 1) != 0)
      {
        Dlaqsp.dlaqsp(paramString2, paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble3, paramInt5, localdoubleW2.val, localdoubleW1.val, paramStringW);
        bool3 = Lsame.lsame(paramStringW.val, "Y");
      }
    }
    int m;
    if (bool3)
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble3[(i - 1 + paramInt5)] * paramArrayOfDouble4[(i - 1 + (j - 1) * paramInt7 + paramInt6)]);
          i += 1;
        }
        j += 1;
      }
    }
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      Dcopy.dcopy(paramInt1 * (paramInt1 + 1) / 2, paramArrayOfDouble1, paramInt3, 1, paramArrayOfDouble2, paramInt4, 1);
      Dpptrf.dpptrf(paramString2, paramInt1, paramArrayOfDouble2, paramInt4, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        paramdoubleW.val = 0.0D;
        return;
      }
    }
    d1 = Dlansp.dlansp("I", paramString2, paramInt1, paramArrayOfDouble1, paramInt3, paramArrayOfDouble8, paramInt12);
    Dppcon.dppcon(paramString2, paramInt1, paramArrayOfDouble2, paramInt4, d1, paramdoubleW, paramArrayOfDouble8, paramInt12, paramArrayOfInt, paramInt13, paramintW);
    Dlacpy.dlacpy("Full", paramInt1, paramInt2, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble5, paramInt8, paramInt9);
    Dpptrs.dpptrs(paramString2, paramInt1, paramInt2, paramArrayOfDouble2, paramInt4, paramArrayOfDouble5, paramInt8, paramInt9, paramintW);
    Dpprfs.dpprfs(paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble6, paramInt10, paramArrayOfDouble7, paramInt11, paramArrayOfDouble8, paramInt12, paramArrayOfInt, paramInt13, paramintW);
    if (bool3)
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)] = (paramArrayOfDouble3[(i - 1 + paramInt5)] * paramArrayOfDouble5[(i - 1 + (j - 1) * paramInt9 + paramInt8)]);
          i += 1;
        }
        j += 1;
      }
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        paramArrayOfDouble6[(j - 1 + paramInt10)] /= localdoubleW2.val;
        j += 1;
      }
    }
    if ((paramdoubleW.val >= Dlamch.dlamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dppsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */