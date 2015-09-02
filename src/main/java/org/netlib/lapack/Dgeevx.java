package org.netlib.lapack;

import org.netlib.blas.Dnrm2;
import org.netlib.blas.Drot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgeevx
{
  public static void dgeevx(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, int paramInt9, intW paramintW1, intW paramintW2, double[] paramArrayOfDouble6, int paramInt10, doubleW paramdoubleW, double[] paramArrayOfDouble7, int paramInt11, double[] paramArrayOfDouble8, int paramInt12, double[] paramArrayOfDouble9, int paramInt13, int paramInt14, int[] paramArrayOfInt, int paramInt15, intW paramintW3)
  {
    int i = 0;
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    String str1 = new String(" ");
    String str2 = new String(" ");
    int k = 0;
    int m = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    intW localintW3 = new intW(0);
    double d1 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d2 = 0.0D;
    double d3 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d4 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    boolean[] arrayOfBoolean = new boolean[1];
    double[] arrayOfDouble = new double[1];
    paramintW3.val = 0;
    i = paramInt14 != -1 ? 0 : 1;
    bool1 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString3, "V");
    bool5 = Lsame.lsame(paramString4, "N");
    bool4 = Lsame.lsame(paramString4, "E");
    bool6 = Lsame.lsame(paramString4, "V");
    bool3 = Lsame.lsame(paramString4, "B");
    if (((!Lsame.lsame(paramString1, "N")) && (!Lsame.lsame(paramString1, "S")) ? 0 : 1) == 0) {}
    if ((!Lsame.lsame(paramString1, "P") ? 0 : 1) == 0) {}
    if (((!Lsame.lsame(paramString1, "B") ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((((bool1 ^ true)) && ((Lsame.lsame(paramString2, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString3, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW3.val = -3;
    }
    else
    {
      if (((!bool5) && (!bool4) ? 0 : 1) == 0) {}
      if ((!bool3 ? 0 : 1) == 0) {}
      if (((!bool6 ? 0 : 1) ^ 0x1) == 0) {
        if (((!bool4) && (!bool3) ? 0 : 1) == 0) {}
      }
      if ((((((bool1) && (bool2) ? 1 : 0) ^ 0x1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -4;
      }
      else if ((paramInt1 >= 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -5;
      }
      else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW3.val = -7;
      }
      else
      {
        if ((paramInt7 >= 1 ? 0 : 1) == 0) {
          if (!bool1) {}
        }
        if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW3.val = -11;
        }
        else
        {
          if ((paramInt9 >= 1 ? 0 : 1) == 0) {
            if (!bool2) {}
          }
          if ((((paramInt9 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW3.val = -13;
          }
        }
      }
    }
    if ((paramintW3.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        i4 = 1;
        i3 = 1;
      }
      else
      {
        i3 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGEHRD", " ", paramInt1, 1, paramInt1, 0);
        if (bool1) {
          Dhseqr.dhseqr("S", "V", paramInt1, 1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble9, paramInt13, -1, paramintW3);
        } else if (bool2) {
          Dhseqr.dhseqr("S", "V", paramInt1, 1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble9, paramInt13, -1, paramintW3);
        } else if (bool5) {
          Dhseqr.dhseqr("E", "N", paramInt1, 1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble9, paramInt13, -1, paramintW3);
        } else {
          Dhseqr.dhseqr("S", "N", paramInt1, 1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble9, paramInt13, -1, paramintW3);
        }
        k = (int)paramArrayOfDouble9[(1 - 1 + paramInt13)];
        if ((((bool1 ^ true)) && ((bool2 ^ true)) ? 1 : 0) != 0)
        {
          i4 = 2 * paramInt1;
          if ((bool5 ^ true)) {
            i4 = Math.max(i4, paramInt1 * paramInt1 + 6 * paramInt1);
          }
          i3 = Math.max(i3, k);
          if ((bool5 ^ true)) {
            i3 = Math.max(i3, paramInt1 * paramInt1 + 6 * paramInt1);
          }
        }
        else
        {
          i4 = 3 * paramInt1;
          if ((((bool5 ^ true)) && ((bool4 ^ true)) ? 1 : 0) != 0) {
            i4 = Math.max(i4, paramInt1 * paramInt1 + 6 * paramInt1);
          }
          i3 = Math.max(i3, k);
          i3 = Math.max(i3, paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGHR", " ", paramInt1, 1, paramInt1, -1));
          if ((((bool5 ^ true)) && ((bool4 ^ true)) ? 1 : 0) != 0) {
            i3 = Math.max(i3, paramInt1 * paramInt1 + 6 * paramInt1);
          }
          i3 = Math.max(i3, 3 * paramInt1);
        }
        i3 = Math.max(i3, i4);
      }
      paramArrayOfDouble9[(1 - 1 + paramInt13)] = i3;
      if ((paramInt14 >= i4 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW3.val = -21;
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEEVX", -paramintW3.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    d3 = Dlamch.dlamch("P");
    localdoubleW4.val = Dlamch.dlamch("S");
    localdoubleW1.val = (1.0D / localdoubleW4.val);
    Dlabad.dlabad(localdoubleW4, localdoubleW1);
    localdoubleW4.val = (Math.sqrt(localdoubleW4.val) / d3);
    localdoubleW1.val = (1.0D / localdoubleW4.val);
    localintW1.val = 0;
    d1 = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, arrayOfDouble, 0);
    j = 0;
    if ((d1 <= 0.0D ? 0 : 1) != 0) {}
    if (((d1 >= localdoubleW4.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      j = 1;
      d2 = localdoubleW4.val;
    }
    else if ((d1 <= localdoubleW1.val ? 0 : 1) != 0)
    {
      j = 1;
      d2 = localdoubleW1.val;
    }
    if (j != 0) {
      Dlascl.dlascl("G", 0, 0, d1, d2, paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, localintW2);
    }
    Dgebal.dgebal(paramString1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramintW1, paramintW2, paramArrayOfDouble6, paramInt10, localintW2);
    paramdoubleW.val = Dlange.dlange("1", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, arrayOfDouble, 0);
    if (j != 0)
    {
      arrayOfDouble[(1 - 1)] = paramdoubleW.val;
      Dlascl.dlascl("G", 0, 0, d2, d1, 1, 1, arrayOfDouble, 0, 1, localintW2);
      paramdoubleW.val = arrayOfDouble[(1 - 1)];
    }
    n = 1;
    i1 = n + paramInt1;
    Dgehrd.dgehrd(paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble9, n - 1 + paramInt13, paramArrayOfDouble9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, localintW2);
    if (bool1)
    {
      str2 = "L";
      Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble4, paramInt6, paramInt7);
      Dorghr.dorghr(paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble9, n - 1 + paramInt13, paramArrayOfDouble9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, localintW2);
      i1 = n;
      Dhseqr.dhseqr("S", "V", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, paramintW3);
      if (bool2)
      {
        str2 = "B";
        Dlacpy.dlacpy("F", paramInt1, paramInt1, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble5, paramInt8, paramInt9);
      }
    }
    else if (bool2)
    {
      str2 = "R";
      Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble5, paramInt8, paramInt9);
      Dorghr.dorghr(paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble9, n - 1 + paramInt13, paramArrayOfDouble9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, localintW2);
      i1 = n;
      Dhseqr.dhseqr("S", "V", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, paramintW3);
    }
    else
    {
      if (bool5) {
        str1 = "E";
      } else {
        str1 = "S";
      }
      i1 = n;
      Dhseqr.dhseqr(str1, "N", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble9, i1 - 1 + paramInt13, paramInt14 - i1 + 1, paramintW3);
    }
    if ((paramintW3.val <= 0 ? 0 : 1) == 0)
    {
      if (((!bool1) && (!bool2) ? 0 : 1) != 0) {
        Dtrevc.dtrevc(str2, "B", arrayOfBoolean, 0, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble5, paramInt8, paramInt9, paramInt1, localintW3, paramArrayOfDouble9, i1 - 1 + paramInt13, localintW2);
      }
      if ((bool5 ^ true)) {
        Dtrsna.dtrsna(paramString4, "A", arrayOfBoolean, 0, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble7, paramInt11, paramArrayOfDouble8, paramInt12, paramInt1, localintW3, paramArrayOfDouble9, i1 - 1 + paramInt13, paramInt1, paramArrayOfInt, paramInt15, localintW1);
      }
      int i5;
      int i6;
      if (bool1)
      {
        Dgebak.dgebak(paramString1, "L", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble6, paramInt10, paramInt1, paramArrayOfDouble4, paramInt6, paramInt7, localintW2);
        m = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          if ((paramArrayOfDouble3[(m - 1 + paramInt5)] != 0.0D ? 0 : 1) != 0)
          {
            d4 = 1.0D / Dnrm2.dnrm2(paramInt1, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1);
            Dscal.dscal(paramInt1, d4, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1);
          }
          else if ((paramArrayOfDouble3[(m - 1 + paramInt5)] <= 0.0D ? 0 : 1) != 0)
          {
            d4 = 1.0D / Dlapy2.dlapy2(Dnrm2.dnrm2(paramInt1, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1), Dnrm2.dnrm2(paramInt1, paramArrayOfDouble4, 1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, 1));
            Dscal.dscal(paramInt1, d4, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1);
            Dscal.dscal(paramInt1, d4, paramArrayOfDouble4, 1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, 1);
            i2 = 1;
            for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
            {
              paramArrayOfDouble9[(i2 - 1 + paramInt13)] = (Math.pow(paramArrayOfDouble4[(i2 - 1 + (m - 1) * paramInt7 + paramInt6)], 2) + Math.pow(paramArrayOfDouble4[(i2 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)], 2));
              i2 += 1;
            }
            i2 = Idamax.idamax(paramInt1, paramArrayOfDouble9, paramInt13, 1);
            Dlartg.dlartg(paramArrayOfDouble4[(i2 - 1 + (m - 1) * paramInt7 + paramInt6)], paramArrayOfDouble4[(i2 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)], localdoubleW2, localdoubleW5, localdoubleW3);
            Drot.drot(paramInt1, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble4, 1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, 1, localdoubleW2.val, localdoubleW5.val);
            paramArrayOfDouble4[(i2 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)] = 0.0D;
          }
          m += 1;
        }
      }
      if (bool2)
      {
        Dgebak.dgebak(paramString1, "R", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble6, paramInt10, paramInt1, paramArrayOfDouble5, paramInt8, paramInt9, localintW2);
        m = 1;
        for (i5 = paramInt1 - 1 + 1; i5 > 0; i5--)
        {
          if ((paramArrayOfDouble3[(m - 1 + paramInt5)] != 0.0D ? 0 : 1) != 0)
          {
            d4 = 1.0D / Dnrm2.dnrm2(paramInt1, paramArrayOfDouble5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1);
            Dscal.dscal(paramInt1, d4, paramArrayOfDouble5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1);
          }
          else if ((paramArrayOfDouble3[(m - 1 + paramInt5)] <= 0.0D ? 0 : 1) != 0)
          {
            d4 = 1.0D / Dlapy2.dlapy2(Dnrm2.dnrm2(paramInt1, paramArrayOfDouble5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1), Dnrm2.dnrm2(paramInt1, paramArrayOfDouble5, 1 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, 1));
            Dscal.dscal(paramInt1, d4, paramArrayOfDouble5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1);
            Dscal.dscal(paramInt1, d4, paramArrayOfDouble5, 1 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, 1);
            i2 = 1;
            for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
            {
              paramArrayOfDouble9[(i2 - 1 + paramInt13)] = (Math.pow(paramArrayOfDouble5[(i2 - 1 + (m - 1) * paramInt9 + paramInt8)], 2) + Math.pow(paramArrayOfDouble5[(i2 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)], 2));
              i2 += 1;
            }
            i2 = Idamax.idamax(paramInt1, paramArrayOfDouble9, paramInt13, 1);
            Dlartg.dlartg(paramArrayOfDouble5[(i2 - 1 + (m - 1) * paramInt9 + paramInt8)], paramArrayOfDouble5[(i2 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)], localdoubleW2, localdoubleW5, localdoubleW3);
            Drot.drot(paramInt1, paramArrayOfDouble5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble5, 1 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, 1, localdoubleW2.val, localdoubleW5.val);
            paramArrayOfDouble5[(i2 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)] = 0.0D;
          }
          m += 1;
        }
      }
    }
    if (j != 0)
    {
      Dlascl.dlascl("G", 0, 0, d2, d1, paramInt1 - paramintW3.val, 1, paramArrayOfDouble2, paramintW3.val + 1 - 1 + paramInt4, Math.max(paramInt1 - paramintW3.val, 1), localintW2);
      Dlascl.dlascl("G", 0, 0, d2, d1, paramInt1 - paramintW3.val, 1, paramArrayOfDouble3, paramintW3.val + 1 - 1 + paramInt5, Math.max(paramInt1 - paramintW3.val, 1), localintW2);
      if ((paramintW3.val != 0 ? 0 : 1) != 0)
      {
        if (((!bool6) && (!bool3) ? 0 : 1) != 0) {}
        if (((localintW1.val != 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          Dlascl.dlascl("G", 0, 0, d2, d1, paramInt1, 1, paramArrayOfDouble8, paramInt12, paramInt1, localintW2);
        }
      }
      else
      {
        Dlascl.dlascl("G", 0, 0, d2, d1, paramintW1.val - 1, 1, paramArrayOfDouble2, paramInt4, paramInt1, localintW2);
        Dlascl.dlascl("G", 0, 0, d2, d1, paramintW1.val - 1, 1, paramArrayOfDouble3, paramInt5, paramInt1, localintW2);
      }
    }
    paramArrayOfDouble9[(1 - 1 + paramInt13)] = i3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgeevx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */