package org.netlib.lapack;

import org.netlib.blas.Dnrm2;
import org.netlib.blas.Drot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgeev
{
  public static void dgeev(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, int paramInt9, double[] paramArrayOfDouble6, int paramInt10, int paramInt11, intW paramintW)
  {
    int i = 0;
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    String str = new String(" ");
    int k = 0;
    int m = 0;
    int n = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    intW localintW4 = new intW(0);
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
    paramintW.val = 0;
    i = paramInt11 != -1 ? 0 : 1;
    bool1 = Lsame.lsame(paramString1, "V");
    bool2 = Lsame.lsame(paramString2, "V");
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else
    {
      if ((paramInt7 >= 1 ? 0 : 1) == 0) {
        if (!bool1) {}
      }
      if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else
      {
        if ((paramInt9 >= 1 ? 0 : 1) == 0) {
          if (!bool2) {}
        }
        if ((((paramInt9 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -11;
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        i5 = 1;
        i4 = 1;
      }
      else
      {
        i4 = 2 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGEHRD", " ", paramInt1, 1, paramInt1, 0);
        if (bool1)
        {
          i5 = 4 * paramInt1;
          i4 = Math.max(i4, 2 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGHR", " ", paramInt1, 1, paramInt1, -1));
          Dhseqr.dhseqr("S", "V", paramInt1, 1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble6, paramInt10, -1, paramintW);
          k = (int)paramArrayOfDouble6[(1 - 1 + paramInt10)];
          i4 = Util.max(i4, paramInt1 + 1, paramInt1 + k);
          i4 = Math.max(i4, 4 * paramInt1);
        }
        else if (bool2)
        {
          i5 = 4 * paramInt1;
          i4 = Math.max(i4, 2 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGHR", " ", paramInt1, 1, paramInt1, -1));
          Dhseqr.dhseqr("S", "V", paramInt1, 1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble6, paramInt10, -1, paramintW);
          k = (int)paramArrayOfDouble6[(1 - 1 + paramInt10)];
          i4 = Util.max(i4, paramInt1 + 1, paramInt1 + k);
          i4 = Math.max(i4, 4 * paramInt1);
        }
        else
        {
          i5 = 3 * paramInt1;
          Dhseqr.dhseqr("E", "N", paramInt1, 1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble6, paramInt10, -1, paramintW);
          k = (int)paramArrayOfDouble6[(1 - 1 + paramInt10)];
          i4 = Util.max(i4, paramInt1 + 1, paramInt1 + k);
        }
        i4 = Math.max(i4, i5);
      }
      paramArrayOfDouble6[(1 - 1 + paramInt10)] = i4;
      if ((paramInt11 >= i5 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -13;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEEV ", -paramintW.val);
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
      Dlascl.dlascl("G", 0, 0, d1, d2, paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, localintW1);
    }
    n = 1;
    Dgebal.dgebal("B", paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, localintW3, localintW2, paramArrayOfDouble6, n - 1 + paramInt10, localintW1);
    i1 = n + paramInt1;
    i2 = i1 + paramInt1;
    Dgehrd.dgehrd(paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble6, i1 - 1 + paramInt10, paramArrayOfDouble6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, localintW1);
    if (bool1)
    {
      str = "L";
      Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble4, paramInt6, paramInt7);
      Dorghr.dorghr(paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble6, i1 - 1 + paramInt10, paramArrayOfDouble6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, localintW1);
      i2 = i1;
      Dhseqr.dhseqr("S", "V", paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, paramintW);
      if (bool2)
      {
        str = "B";
        Dlacpy.dlacpy("F", paramInt1, paramInt1, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble5, paramInt8, paramInt9);
      }
    }
    else if (bool2)
    {
      str = "R";
      Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble5, paramInt8, paramInt9);
      Dorghr.dorghr(paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble6, i1 - 1 + paramInt10, paramArrayOfDouble6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, localintW1);
      i2 = i1;
      Dhseqr.dhseqr("S", "V", paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, paramintW);
    }
    else
    {
      i2 = i1;
      Dhseqr.dhseqr("E", "N", paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble5, paramInt8, paramInt9, paramArrayOfDouble6, i2 - 1 + paramInt10, paramInt11 - i2 + 1, paramintW);
    }
    if ((paramintW.val <= 0 ? 0 : 1) == 0)
    {
      if (((!bool1) && (!bool2) ? 0 : 1) != 0) {
        Dtrevc.dtrevc(str, "B", arrayOfBoolean, 0, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble5, paramInt8, paramInt9, paramInt1, localintW4, paramArrayOfDouble6, i2 - 1 + paramInt10, localintW1);
      }
      int i6;
      int i7;
      if (bool1)
      {
        Dgebak.dgebak("B", "L", paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble6, n - 1 + paramInt10, paramInt1, paramArrayOfDouble4, paramInt6, paramInt7, localintW1);
        m = 1;
        for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
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
            i3 = 1;
            for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
            {
              paramArrayOfDouble6[(i2 + i3 - 1 - 1 + paramInt10)] = (Math.pow(paramArrayOfDouble4[(i3 - 1 + (m - 1) * paramInt7 + paramInt6)], 2) + Math.pow(paramArrayOfDouble4[(i3 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)], 2));
              i3 += 1;
            }
            i3 = Idamax.idamax(paramInt1, paramArrayOfDouble6, i2 - 1 + paramInt10, 1);
            Dlartg.dlartg(paramArrayOfDouble4[(i3 - 1 + (m - 1) * paramInt7 + paramInt6)], paramArrayOfDouble4[(i3 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)], localdoubleW2, localdoubleW5, localdoubleW3);
            Drot.drot(paramInt1, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble4, 1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, 1, localdoubleW2.val, localdoubleW5.val);
            paramArrayOfDouble4[(i3 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)] = 0.0D;
          }
          m += 1;
        }
      }
      if (bool2)
      {
        Dgebak.dgebak("B", "R", paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble6, n - 1 + paramInt10, paramInt1, paramArrayOfDouble5, paramInt8, paramInt9, localintW1);
        m = 1;
        for (i6 = paramInt1 - 1 + 1; i6 > 0; i6--)
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
            i3 = 1;
            for (i7 = paramInt1 - 1 + 1; i7 > 0; i7--)
            {
              paramArrayOfDouble6[(i2 + i3 - 1 - 1 + paramInt10)] = (Math.pow(paramArrayOfDouble5[(i3 - 1 + (m - 1) * paramInt9 + paramInt8)], 2) + Math.pow(paramArrayOfDouble5[(i3 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)], 2));
              i3 += 1;
            }
            i3 = Idamax.idamax(paramInt1, paramArrayOfDouble6, i2 - 1 + paramInt10, 1);
            Dlartg.dlartg(paramArrayOfDouble5[(i3 - 1 + (m - 1) * paramInt9 + paramInt8)], paramArrayOfDouble5[(i3 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)], localdoubleW2, localdoubleW5, localdoubleW3);
            Drot.drot(paramInt1, paramArrayOfDouble5, 1 - 1 + (m - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble5, 1 - 1 + (m + 1 - 1) * paramInt9 + paramInt8, 1, localdoubleW2.val, localdoubleW5.val);
            paramArrayOfDouble5[(i3 - 1 + (m + 1 - 1) * paramInt9 + paramInt8)] = 0.0D;
          }
          m += 1;
        }
      }
    }
    if (j != 0)
    {
      Dlascl.dlascl("G", 0, 0, d2, d1, paramInt1 - paramintW.val, 1, paramArrayOfDouble2, paramintW.val + 1 - 1 + paramInt4, Math.max(paramInt1 - paramintW.val, 1), localintW1);
      Dlascl.dlascl("G", 0, 0, d2, d1, paramInt1 - paramintW.val, 1, paramArrayOfDouble3, paramintW.val + 1 - 1 + paramInt5, Math.max(paramInt1 - paramintW.val, 1), localintW1);
      if ((paramintW.val <= 0 ? 0 : 1) != 0)
      {
        Dlascl.dlascl("G", 0, 0, d2, d1, localintW3.val - 1, 1, paramArrayOfDouble2, paramInt4, paramInt1, localintW1);
        Dlascl.dlascl("G", 0, 0, d2, d1, localintW3.val - 1, 1, paramArrayOfDouble3, paramInt5, paramInt1, localintW1);
      }
    }
    paramArrayOfDouble6[(1 - 1 + paramInt10)] = i4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgeev.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */