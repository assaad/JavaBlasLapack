package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.StringW;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgesvx
{
  public static void dgesvx(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, int[] paramArrayOfInt1, int paramInt7, StringW paramStringW, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, double[] paramArrayOfDouble6, int paramInt12, int paramInt13, doubleW paramdoubleW, double[] paramArrayOfDouble7, int paramInt14, double[] paramArrayOfDouble8, int paramInt15, double[] paramArrayOfDouble9, int paramInt16, int[] paramArrayOfInt2, int paramInt17, intW paramintW)
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
    int n;
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
      else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -6;
      }
      else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -8;
      }
      else
      {
        if (Lsame.lsame(paramString1, "F")) {
          if (((j == 0) && (i == 0) ? 0 : 1) != 0) {}
        }
        if ((((!Lsame.lsame(paramStringW.val, "N") ? 0 : 1) ^ 0x1) != 0 ? 1 : 0) != 0)
        {
          paramintW.val = -10;
        }
        else
        {
          if (j != 0)
          {
            d4 = d2;
            d3 = 0.0D;
            m = 1;
            for (n = paramInt1 - 1 + 1; n > 0; n--)
            {
              d4 = Math.min(d4, paramArrayOfDouble3[(m - 1 + paramInt8)]);
              d3 = Math.max(d3, paramArrayOfDouble3[(m - 1 + paramInt8)]);
              m += 1;
            }
            if ((d4 > 0.0D ? 0 : 1) != 0) {
              paramintW.val = -11;
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
            for (n = paramInt1 - 1 + 1; n > 0; n--)
            {
              d4 = Math.min(d4, paramArrayOfDouble4[(m - 1 + paramInt9)]);
              d3 = Math.max(d3, paramArrayOfDouble4[(m - 1 + paramInt9)]);
              m += 1;
            }
            if ((d4 > 0.0D ? 0 : 1) != 0) {
              paramintW.val = -12;
            } else if ((paramInt1 <= 0 ? 0 : 1) != 0) {
              localdoubleW2.val = (Math.max(d4, d6) / Math.min(d3, d2));
            } else {
              localdoubleW2.val = 1.0D;
            }
          }
          if ((paramintW.val != 0 ? 0 : 1) != 0) {
            if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
              paramintW.val = -14;
            } else if ((paramInt13 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
              paramintW.val = -16;
            }
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGESVX", -paramintW.val);
      return;
    }
    if (bool1)
    {
      Dgeequ.dgeequ(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, paramInt9, localdoubleW3, localdoubleW2, localdoubleW1, localintW);
      if ((localintW.val != 0 ? 0 : 1) != 0)
      {
        Dlaqge.dlaqge(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, paramInt9, localdoubleW3.val, localdoubleW2.val, localdoubleW1.val, paramStringW);
        j = (!Lsame.lsame(paramStringW.val, "R")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
        i = (!Lsame.lsame(paramStringW.val, "C")) && (!Lsame.lsame(paramStringW.val, "B")) ? 0 : 1;
      }
    }
    int i1;
    if (bool3)
    {
      if (j != 0)
      {
        m = 1;
        for (n = paramInt2 - 1 + 1; n > 0; n--)
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfDouble5[(k - 1 + (m - 1) * paramInt11 + paramInt10)] = (paramArrayOfDouble3[(k - 1 + paramInt8)] * paramArrayOfDouble5[(k - 1 + (m - 1) * paramInt11 + paramInt10)]);
            k += 1;
          }
          m += 1;
        }
      }
    }
    else if (i != 0)
    {
      m = 1;
      n = paramInt2 - 1 + 1;
      for (;;)
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          paramArrayOfDouble5[(k - 1 + (m - 1) * paramInt11 + paramInt10)] = (paramArrayOfDouble4[(k - 1 + paramInt9)] * paramArrayOfDouble5[(k - 1 + (m - 1) * paramInt11 + paramInt10)]);
          k += 1;
        }
        m += 1;
        n--;
        if (n <= 0) {
          break;
        }
      }
    }
    if (((!bool2) && (!bool1) ? 0 : 1) != 0)
    {
      Dlacpy.dlacpy("Full", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6);
      Dgetrf.dgetrf(paramInt1, paramInt1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramintW);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        d5 = Dlantr.dlantr("M", "U", "N", paramintW.val, paramintW.val, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble9, paramInt16);
        if ((d5 != 0.0D ? 0 : 1) != 0) {
          d5 = 1.0D;
        } else {
          d5 = Dlange.dlange("M", paramInt1, paramintW.val, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble9, paramInt16) / d5;
        }
        paramArrayOfDouble9[(1 - 1 + paramInt16)] = d5;
        paramdoubleW.val = 0.0D;
        return;
      }
    }
    if (bool3) {
      str = "1";
    } else {
      str = "I";
    }
    d1 = Dlange.dlange(str, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble9, paramInt16);
    d5 = Dlantr.dlantr("M", "U", "N", paramInt1, paramInt1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfDouble9, paramInt16);
    if ((d5 != 0.0D ? 0 : 1) != 0) {
      d5 = 1.0D;
    } else {
      d5 = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble9, paramInt16) / d5;
    }
    Dgecon.dgecon(str, paramInt1, paramArrayOfDouble2, paramInt5, paramInt6, d1, paramdoubleW, paramArrayOfDouble9, paramInt16, paramArrayOfInt2, paramInt17, paramintW);
    Dlacpy.dlacpy("Full", paramInt1, paramInt2, paramArrayOfDouble5, paramInt10, paramInt11, paramArrayOfDouble6, paramInt12, paramInt13);
    Dgetrs.dgetrs(paramString2, paramInt1, paramInt2, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfDouble6, paramInt12, paramInt13, paramintW);
    Dgerfs.dgerfs(paramString2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfDouble5, paramInt10, paramInt11, paramArrayOfDouble6, paramInt12, paramInt13, paramArrayOfDouble7, paramInt14, paramArrayOfDouble8, paramInt15, paramArrayOfDouble9, paramInt16, paramArrayOfInt2, paramInt17, paramintW);
    if (bool3)
    {
      if (i != 0)
      {
        m = 1;
        for (n = paramInt2 - 1 + 1; n > 0; n--)
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfDouble6[(k - 1 + (m - 1) * paramInt13 + paramInt12)] = (paramArrayOfDouble4[(k - 1 + paramInt9)] * paramArrayOfDouble6[(k - 1 + (m - 1) * paramInt13 + paramInt12)]);
            k += 1;
          }
          m += 1;
        }
        m = 1;
        for (n = paramInt2 - 1 + 1; n > 0; n--)
        {
          paramArrayOfDouble7[(m - 1 + paramInt14)] /= localdoubleW2.val;
          m += 1;
        }
      }
    }
    else if (j != 0)
    {
      m = 1;
      for (n = paramInt2 - 1 + 1; n > 0; n--)
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          paramArrayOfDouble6[(k - 1 + (m - 1) * paramInt13 + paramInt12)] = (paramArrayOfDouble3[(k - 1 + paramInt8)] * paramArrayOfDouble6[(k - 1 + (m - 1) * paramInt13 + paramInt12)]);
          k += 1;
        }
        m += 1;
      }
      m = 1;
      n = paramInt2 - 1 + 1;
      for (;;)
      {
        paramArrayOfDouble7[(m - 1 + paramInt14)] /= localdoubleW3.val;
        m += 1;
        n--;
        if (n <= 0) {
          break;
        }
      }
    }
    paramArrayOfDouble9[(1 - 1 + paramInt16)] = d5;
    if ((paramdoubleW.val >= Dlamch.dlamch("Epsilon") ? 0 : 1) != 0) {
      paramintW.val = (paramInt1 + 1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgesvx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */