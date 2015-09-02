package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.StringW;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgbsvx
{
  public static void dgbsvx(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, int paramInt6, double[] paramArrayOfDouble2, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, StringW paramStringW, double[] paramArrayOfDouble3, int paramInt10, double[] paramArrayOfDouble4, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, double[] paramArrayOfDouble6, int paramInt14, int paramInt15, doubleW paramdoubleW, double[] paramArrayOfDouble7, int paramInt16, double[] paramArrayOfDouble8, int paramInt17, double[] paramArrayOfDouble9, int paramInt18, int[] paramArrayOfInt2, int paramInt19, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    String str = new String(" ");
    int k = 0;
    intW localintW = new intW(0);
    int m = 0;
    int n = 0;
    int i1 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d3 = 0.0D;
    double d4 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d5 = 0.0D;
    double d6 = 0.0D;
    paramintW.val = 0;
    bool2 = Lsame.lsame(paramString1, "N");
    bool1 = Lsame.lsame(paramString1, "E");
    bool3 = Lsame.lsame(paramString2, "N");
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      paramStringW.val = "N";
      j = 0;
      i = 0;
    }
    else
    {
      j = (!Lsame.lsame(paramStringW.val, "R")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
      i = (!Lsame.lsame(paramStringW.val, "C")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
      d6 = Dlamch.dlamch("Safe minimum");
      d2 = 1.0D / d6;
    }
    if ((((bool2 ^ true)) && ((bool1 ^ true)) ? 1 : 0) != 0) {}
    int i2;
    if (((Lsame.lsame(paramString1, "F") ^ true) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((((bool3 ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0)
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
      else if ((paramInt4 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -6;
      }
      else if ((paramInt6 >= paramInt2 + paramInt3 + 1 ? 0 : 1) != 0)
      {
        paramintW.val = -8;
      }
      else if ((paramInt8 >= 2 * paramInt2 + paramInt3 + 1 ? 0 : 1) != 0)
      {
        paramintW.val = -10;
      }
      else
      {
        if (Lsame.lsame(paramString1, "F")) {
          if (((j == 0) && (i == 0) ? 0 : 1) != 0) {}
        }
        if ((((!Lsame.lsame(paramStringW.val, "N") ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0)
        {
          paramintW.val = -12;
        }
        else
        {
          if (j != 0)
          {
            d4 = d2;
            d3 = 0.0D;
            m = 1;
            for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
            {
              d4 = Math.min(d4, paramArrayOfDouble3[(m - 1 + paramInt10)]);
              d3 = Math.max(d3, paramArrayOfDouble3[(m - 1 + paramInt10)]);
              m += 1;
            }
            if ((d4 > 0.0D ? 0 : 1) != 0) {
              paramintW.val = -13;
            } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
              localdoubleW3.val = (Math.max(d4, d6) / Math.min(d3, d2));
            } else {
              localdoubleW3.val = 1.0D;
            }
          }
          if (i != 0) {}
          if (((paramintW.val != 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            d4 = d2;
            d3 = 0.0D;
            m = 1;
            for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
            {
              d4 = Math.min(d4, paramArrayOfDouble4[(m - 1 + paramInt11)]);
              d3 = Math.max(d3, paramArrayOfDouble4[(m - 1 + paramInt11)]);
              m += 1;
            }
            if ((d4 > 0.0D ? 0 : 1) != 0) {
              paramintW.val = -14;
            } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
              localdoubleW2.val = (Math.max(d4, d6) / Math.min(d3, d2));
            } else {
              localdoubleW2.val = 1.0D;
            }
          }
          if ((paramintW.val != 0 ? 0 : 1) != 0) {
            if ((paramInt13 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
              paramintW.val = -16;
            } else if ((paramInt15 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
              paramintW.val = -18;
            }
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGBSVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Dgbequ.dgbequ(paramInt1, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt5, paramInt6, paramArrayOfDouble3, paramInt10, paramArrayOfDouble4, paramInt11, localdoubleW3, localdoubleW2, localdoubleW1, localintW);
      if ((localintW.val != 0 ? 0 : 1) != 0)
      {
        Dlaqgb.dlaqgb(paramInt1, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt5, paramInt6, paramArrayOfDouble3, paramInt10, paramArrayOfDouble4, paramInt11, localdoubleW3.val, localdoubleW2.val, localdoubleW1.val, paramStringW);
        j = (!Lsame.lsame(paramStringW.val, "R")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
        i = (!Lsame.lsame(paramStringW.val, "C")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
      }
    }
    int i3;
    if (bool3)
    {
      if (j != 0)
      {
        m = 1;
        for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
        {
          k = 1;
          for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
          {
            paramArrayOfDouble5[(k - 1 + (m - 1) * paramInt13 + paramInt12)] = (paramArrayOfDouble3[(k - 1 + paramInt10)] * paramArrayOfDouble5[(k - 1 + (m - 1) * paramInt13 + paramInt12)]);
            k += 1;
          }
          m += 1;
        }
      }
    }
    else if (i != 0)
    {
      m = 1;
      i2 = paramInt4 - 1 + 1;
      for (;;)
      {
        k = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          paramArrayOfDouble5[(k - 1 + (m - 1) * paramInt13 + paramInt12)] = (paramArrayOfDouble4[(k - 1 + paramInt11)] * paramArrayOfDouble5[(k - 1 + (m - 1) * paramInt13 + paramInt12)]);
          k += 1;
        }
        m += 1;
        i2--;
        if (i2 <= 0) {
          break;
        }
      }
    }
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      m = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        n = Math.max(m - paramInt3, 1);
        i1 = Math.min(m + paramInt2, paramInt1);
        Dcopy.dcopy(i1 - n + 1, paramArrayOfDouble1, paramInt3 + 1 - m + n - 1 + (m - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble2, paramInt2 + paramInt3 + 1 - m + n - 1 + (m - 1) * paramInt8 + paramInt7, 1);
        m += 1;
      }
      Dgbtrf.dgbtrf(paramInt1, paramInt1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        d1 = 0.0D;
        m = 1;
        for (i2 = paramintW.val - 1 + 1; i2 > 0; i2--)
        {
          k = Math.max(paramInt3 + 2 - m, 1);
          for (i3 = Math.min(paramInt1 + paramInt3 + 1 - m, paramInt2 + paramInt3 + 1) - Math.max(paramInt3 + 2 - m, 1) + 1; i3 > 0; i3--)
          {
            d1 = Math.max(d1, Math.abs(paramArrayOfDouble1[(k - 1 + (m - 1) * paramInt6 + paramInt5)]));
            k += 1;
          }
          m += 1;
        }
        d5 = Dlantb.dlantb("M", "U", "N", paramintW.val, Math.min(paramintW.val - 1, paramInt2 + paramInt3), paramArrayOfDouble2, Math.max(1, paramInt2 + paramInt3 + 2 - paramintW.val) - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble9, paramInt18);
        if ((d5 != 0.0D ? 0 : 1) != 0) {
          d5 = 1.0D;
        } else {
          d5 = d1 / d5;
        }
        paramArrayOfDouble9[(1 - 1 + paramInt18)] = d5;
        paramdoubleW.val = 0.0D;
        return;
      }
    }
    if (bool3) {
      str = "1";
    } else {
      str = "I";
    }
    d1 = Dlangb.dlangb(str, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt5, paramInt6, paramArrayOfDouble9, paramInt18);
    d5 = Dlantb.dlantb("M", "U", "N", paramInt1, paramInt2 + paramInt3, paramArrayOfDouble2, paramInt7, paramInt8, paramArrayOfDouble9, paramInt18);
    if ((d5 != 0.0D ? 0 : 1) != 0) {
      d5 = 1.0D;
    } else {
      d5 = Dlangb.dlangb("M", paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt5, paramInt6, paramArrayOfDouble9, paramInt18) / d5;
    }
    Dgbcon.dgbcon(str, paramInt1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, d1, paramdoubleW, paramArrayOfDouble9, paramInt18, paramArrayOfInt2, paramInt19, paramintW);
    Dlacpy.dlacpy("Full", paramInt1, paramInt4, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfDouble6, paramInt14, paramInt15);
    Dgbtrs.dgbtrs(paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfDouble2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, paramArrayOfDouble6, paramInt14, paramInt15, paramintW);
    Dgbrfs.dgbrfs(paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfDouble1, paramInt5, paramInt6, paramArrayOfDouble2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfDouble6, paramInt14, paramInt15, paramArrayOfDouble7, paramInt16, paramArrayOfDouble8, paramInt17, paramArrayOfDouble9, paramInt18, paramArrayOfInt2, paramInt19, paramintW);
    if (bool3)
    {
      if (i != 0)
      {
        m = 1;
        for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
        {
          k = 1;
          for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
          {
            paramArrayOfDouble6[(k - 1 + (m - 1) * paramInt15 + paramInt14)] = (paramArrayOfDouble4[(k - 1 + paramInt11)] * paramArrayOfDouble6[(k - 1 + (m - 1) * paramInt15 + paramInt14)]);
            k += 1;
          }
          m += 1;
        }
        m = 1;
        for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble7[(m - 1 + paramInt16)] /= localdoubleW2.val;
          m += 1;
        }
      }
    }
    else if (j != 0)
    {
      m = 1;
      for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
      {
        k = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          paramArrayOfDouble6[(k - 1 + (m - 1) * paramInt15 + paramInt14)] = (paramArrayOfDouble3[(k - 1 + paramInt10)] * paramArrayOfDouble6[(k - 1 + (m - 1) * paramInt15 + paramInt14)]);
          k += 1;
        }
        m += 1;
      }
      m = 1;
      i2 = paramInt4 - 1 + 1;
      for (;;)
      {
        paramArrayOfDouble7[(m - 1 + paramInt16)] /= localdoubleW3.val;
        m += 1;
        i2--;
        if (i2 <= 0) {
          break;
        }
      }
    }
    if ((paramdoubleW.val >= Dlamch.dlamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
    paramArrayOfDouble9[(1 - 1 + paramInt18)] = d5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgbsvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */