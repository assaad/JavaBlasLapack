package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dggev
{
  public static void dggev(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, double[] paramArrayOfDouble6, int paramInt9, int paramInt10, double[] paramArrayOfDouble7, int paramInt11, int paramInt12, double[] paramArrayOfDouble8, int paramInt13, int paramInt14, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    String str = new String(" ");
    int i2 = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d6 = 0.0D;
    boolean[] arrayOfBoolean = new boolean[1];
    if (Lsame.lsame(paramString1, "N"))
    {
      i3 = 1;
      m = 0;
    }
    else if (Lsame.lsame(paramString1, "V"))
    {
      i3 = 2;
      m = 1;
    }
    else
    {
      i3 = -1;
      m = 0;
    }
    if (Lsame.lsame(paramString2, "N"))
    {
      i4 = 1;
      n = 0;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      i4 = 2;
      n = 1;
    }
    else
    {
      i4 = -1;
      n = 0;
    }
    k = (m == 0) && (n == 0) ? 0 : 1;
    paramintW.val = 0;
    i1 = paramInt14 != -1 ? 0 : 1;
    if ((i3 > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((i4 > 0 ? 0 : 1) != 0)
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
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -7;
    }
    else
    {
      if ((paramInt10 >= 1 ? 0 : 1) == 0) {
        if (m == 0) {}
      }
      if ((((paramInt10 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -12;
      }
      else
      {
        if ((paramInt12 >= 1 ? 0 : 1) == 0) {
          if (n == 0) {}
        }
        if ((((paramInt12 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -14;
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i13 = Math.max(1, 8 * paramInt1);
      i12 = Math.max(1, paramInt1 * (7 + Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, 1, paramInt1, 0)));
      i12 = Math.max(i12, paramInt1 * (7 + Ilaenv.ilaenv(1, "DORMQR", " ", paramInt1, 1, paramInt1, 0)));
      if (m != 0) {
        i12 = Math.max(i12, paramInt1 * (7 + Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, 1, paramInt1, -1)));
      }
      paramArrayOfDouble8[(1 - 1 + paramInt13)] = i12;
      if ((paramInt14 >= i13 ? 0 : 1) != 0) {}
      if (((i1 ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -16;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGGEV ", -paramintW.val);
      return;
    }
    if (i1 != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    d5 = Dlamch.dlamch("P");
    localdoubleW2.val = Dlamch.dlamch("S");
    localdoubleW1.val = (1.0D / localdoubleW2.val);
    Dlabad.dlabad(localdoubleW2, localdoubleW1);
    localdoubleW2.val = (Math.sqrt(localdoubleW2.val) / d5);
    localdoubleW1.val = (1.0D / localdoubleW2.val);
    d1 = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble8, paramInt13);
    i = 0;
    if ((d1 <= 0.0D ? 0 : 1) != 0) {}
    if (((d1 >= localdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      d2 = localdoubleW2.val;
      i = 1;
    }
    else if ((d1 <= localdoubleW1.val ? 0 : 1) != 0)
    {
      d2 = localdoubleW1.val;
      i = 1;
    }
    if (i != 0) {
      Dlascl.dlascl("G", 0, 0, d1, d2, paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, localintW1);
    }
    d3 = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble8, paramInt13);
    j = 0;
    if ((d3 <= 0.0D ? 0 : 1) != 0) {}
    if (((d3 >= localdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      d4 = localdoubleW2.val;
      j = 1;
    }
    else if ((d3 <= localdoubleW1.val ? 0 : 1) != 0)
    {
      d4 = localdoubleW1.val;
      j = 1;
    }
    if (j != 0) {
      Dlascl.dlascl("G", 0, 0, d3, d4, paramInt1, paramInt1, paramArrayOfDouble2, paramInt4, paramInt5, localintW1);
    }
    i5 = 1;
    i6 = paramInt1 + 1;
    i9 = i6 + paramInt1;
    Dggbal.dggbal("P", paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, localintW3, localintW2, paramArrayOfDouble8, i5 - 1 + paramInt13, paramArrayOfDouble8, i6 - 1 + paramInt13, paramArrayOfDouble8, i9 - 1 + paramInt13, localintW1);
    i7 = localintW2.val + 1 - localintW3.val;
    if (k != 0) {
      i2 = paramInt1 + 1 - localintW3.val;
    } else {
      i2 = i7;
    }
    i8 = i9;
    i9 = i8 + i7;
    Dgeqrf.dgeqrf(i7, i2, paramArrayOfDouble2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble8, i8 - 1 + paramInt13, paramArrayOfDouble8, i9 - 1 + paramInt13, paramInt14 + 1 - i9, localintW1);
    Dormqr.dormqr("L", "T", i7, i2, i7, paramArrayOfDouble2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble8, i8 - 1 + paramInt13, paramArrayOfDouble1, localintW3.val - 1 + (localintW3.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble8, i9 - 1 + paramInt13, paramInt14 + 1 - i9, localintW1);
    if (m != 0)
    {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble6, paramInt9, paramInt10);
      if ((i7 <= 1 ? 0 : 1) != 0) {
        Dlacpy.dlacpy("L", i7 - 1, i7 - 1, paramArrayOfDouble2, localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt10 + paramInt9, paramInt10);
      }
      Dorgqr.dorgqr(i7, i7, i7, paramArrayOfDouble6, localintW3.val - 1 + (localintW3.val - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble8, i8 - 1 + paramInt13, paramArrayOfDouble8, i9 - 1 + paramInt13, paramInt14 + 1 - i9, localintW1);
    }
    if (n != 0) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble7, paramInt11, paramInt12);
    }
    if (k != 0) {
      Dgghrd.dgghrd(paramString1, paramString2, paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, localintW1);
    } else {
      Dgghrd.dgghrd("N", "N", i7, 1, i7, paramArrayOfDouble1, localintW3.val - 1 + (localintW3.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, localintW1);
    }
    i9 = i8;
    if (k != 0) {
      str = "S";
    } else {
      str = "E";
    }
    Dhgeqz.dhgeqz(str, paramString1, paramString2, paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramArrayOfDouble4, paramInt7, paramArrayOfDouble5, paramInt8, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, paramArrayOfDouble8, i9 - 1 + paramInt13, paramInt14 + 1 - i9, localintW1);
    if ((localintW1.val == 0 ? 0 : 1) != 0)
    {
      if ((localintW1.val <= 0 ? 0 : 1) != 0) {}
      if (((localintW1.val > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = localintW1.val;
      }
      else
      {
        if ((localintW1.val <= paramInt1 ? 0 : 1) != 0) {}
        if (((localintW1.val > 2 * paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          localintW1.val -= paramInt1;
        } else {
          paramintW.val = (paramInt1 + 1);
        }
      }
    }
    else
    {
      if (k != 0)
      {
        if (m != 0)
        {
          if (n != 0) {
            str = "B";
          } else {
            str = "L";
          }
        }
        else {
          str = "R";
        }
        Dtgevc.dtgevc(str, "B", arrayOfBoolean, 0, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, paramInt1, localintW4, paramArrayOfDouble8, i9 - 1 + paramInt13, localintW1);
        if ((localintW1.val == 0 ? 0 : 1) != 0)
        {
          paramintW.val = (paramInt1 + 2);
          break label3020;
        }
        int i14;
        int i15;
        if (m != 0)
        {
          Dggbak.dggbak("P", "L", paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble8, i5 - 1 + paramInt13, paramArrayOfDouble8, i6 - 1 + paramInt13, paramInt1, paramArrayOfDouble6, paramInt9, paramInt10, localintW1);
          i10 = 1;
          for (i14 = paramInt1 - 1 + 1; i14 > 0; i14--)
          {
            if ((paramArrayOfDouble4[(i10 - 1 + paramInt7)] >= 0.0D ? 0 : 1) == 0)
            {
              d6 = 0.0D;
              if ((paramArrayOfDouble4[(i10 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
              {
                i11 = 1;
                for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                {
                  d6 = Math.max(d6, Math.abs(paramArrayOfDouble6[(i11 - 1 + (i10 - 1) * paramInt10 + paramInt9)]));
                  i11 += 1;
                }
              }
              else
              {
                i11 = 1;
                for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                {
                  d6 = Math.max(d6, Math.abs(paramArrayOfDouble6[(i11 - 1 + (i10 - 1) * paramInt10 + paramInt9)]) + Math.abs(paramArrayOfDouble6[(i11 - 1 + (i10 + 1 - 1) * paramInt10 + paramInt9)]));
                  i11 += 1;
                }
              }
              if ((d6 >= localdoubleW2.val ? 0 : 1) == 0)
              {
                d6 = 1.0D / d6;
                if ((paramArrayOfDouble4[(i10 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
                {
                  i11 = 1;
                  for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                  {
                    paramArrayOfDouble6[(i11 - 1 + (i10 - 1) * paramInt10 + paramInt9)] *= d6;
                    i11 += 1;
                  }
                }
                else
                {
                  i11 = 1;
                  for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                  {
                    paramArrayOfDouble6[(i11 - 1 + (i10 - 1) * paramInt10 + paramInt9)] *= d6;
                    paramArrayOfDouble6[(i11 - 1 + (i10 + 1 - 1) * paramInt10 + paramInt9)] *= d6;
                    i11 += 1;
                  }
                }
              }
            }
            i10 += 1;
          }
        }
        if (n != 0)
        {
          Dggbak.dggbak("P", "R", paramInt1, localintW3.val, localintW2.val, paramArrayOfDouble8, i5 - 1 + paramInt13, paramArrayOfDouble8, i6 - 1 + paramInt13, paramInt1, paramArrayOfDouble7, paramInt11, paramInt12, localintW1);
          i10 = 1;
          for (i14 = paramInt1 - 1 + 1; i14 > 0; i14--)
          {
            if ((paramArrayOfDouble4[(i10 - 1 + paramInt7)] >= 0.0D ? 0 : 1) == 0)
            {
              d6 = 0.0D;
              if ((paramArrayOfDouble4[(i10 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
              {
                i11 = 1;
                for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                {
                  d6 = Math.max(d6, Math.abs(paramArrayOfDouble7[(i11 - 1 + (i10 - 1) * paramInt12 + paramInt11)]));
                  i11 += 1;
                }
              }
              else
              {
                i11 = 1;
                for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                {
                  d6 = Math.max(d6, Math.abs(paramArrayOfDouble7[(i11 - 1 + (i10 - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble7[(i11 - 1 + (i10 + 1 - 1) * paramInt12 + paramInt11)]));
                  i11 += 1;
                }
              }
              if ((d6 >= localdoubleW2.val ? 0 : 1) == 0)
              {
                d6 = 1.0D / d6;
                if ((paramArrayOfDouble4[(i10 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
                {
                  i11 = 1;
                  for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                  {
                    paramArrayOfDouble7[(i11 - 1 + (i10 - 1) * paramInt12 + paramInt11)] *= d6;
                    i11 += 1;
                  }
                }
                else
                {
                  i11 = 1;
                  for (i15 = paramInt1 - 1 + 1; i15 > 0; i15--)
                  {
                    paramArrayOfDouble7[(i11 - 1 + (i10 - 1) * paramInt12 + paramInt11)] *= d6;
                    paramArrayOfDouble7[(i11 - 1 + (i10 + 1 - 1) * paramInt12 + paramInt11)] *= d6;
                    i11 += 1;
                  }
                }
              }
            }
            i10 += 1;
          }
        }
      }
      if (i != 0)
      {
        Dlascl.dlascl("G", 0, 0, d2, d1, paramInt1, 1, paramArrayOfDouble3, paramInt6, paramInt1, localintW1);
        Dlascl.dlascl("G", 0, 0, d2, d1, paramInt1, 1, paramArrayOfDouble4, paramInt7, paramInt1, localintW1);
      }
      if (j != 0) {
        Dlascl.dlascl("G", 0, 0, d4, d3, paramInt1, 1, paramArrayOfDouble5, paramInt8, paramInt1, localintW1);
      }
    }
    label3020:
    paramArrayOfDouble8[(1 - 1 + paramInt13)] = i12;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dggev.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */