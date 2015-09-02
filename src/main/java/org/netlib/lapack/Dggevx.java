package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dggevx
{
  public static void dggevx(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, double[] paramArrayOfDouble6, int paramInt9, int paramInt10, double[] paramArrayOfDouble7, int paramInt11, int paramInt12, intW paramintW1, intW paramintW2, double[] paramArrayOfDouble8, int paramInt13, double[] paramArrayOfDouble9, int paramInt14, doubleW paramdoubleW1, doubleW paramdoubleW2, double[] paramArrayOfDouble10, int paramInt15, double[] paramArrayOfDouble11, int paramInt16, double[] paramArrayOfDouble12, int paramInt17, int paramInt18, int[] paramArrayOfInt, int paramInt19, boolean[] paramArrayOfBoolean, int paramInt20, intW paramintW3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    String str = new String(" ");
    int i4 = 0;
    int i5 = 0;
    intW localintW1 = new intW(0);
    int i6 = 0;
    int i7 = 0;
    intW localintW2 = new intW(0);
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    intW localintW3 = new intW(0);
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d6 = 0.0D;
    boolean[] arrayOfBoolean = new boolean[1];
    if (Lsame.lsame(paramString2, "N"))
    {
      i6 = 1;
      m = 0;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      i6 = 2;
      m = 1;
    }
    else
    {
      i6 = -1;
      m = 0;
    }
    if (Lsame.lsame(paramString3, "N"))
    {
      i7 = 1;
      n = 0;
    }
    else if (Lsame.lsame(paramString3, "V"))
    {
      i7 = 2;
      n = 1;
    }
    else
    {
      i7 = -1;
      n = 0;
    }
    k = (m == 0) && (n == 0) ? 0 : 1;
    i2 = (!Lsame.lsame(paramString1, "N")) && (!Lsame.lsame(paramString1, "P")) ? 0 : 1;
    bool3 = Lsame.lsame(paramString4, "N");
    bool2 = Lsame.lsame(paramString4, "E");
    bool4 = Lsame.lsame(paramString4, "V");
    bool1 = Lsame.lsame(paramString4, "B");
    paramintW3.val = 0;
    i1 = paramInt18 != -1 ? 0 : 1;
    if (((!Lsame.lsame(paramString1, "N")) && (!Lsame.lsame(paramString1, "S")) ? 0 : 1) == 0) {}
    if ((!Lsame.lsame(paramString1, "P") ? 0 : 1) == 0) {}
    if (((!Lsame.lsame(paramString1, "B") ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((i6 > 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((i7 > 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -3;
    }
    else
    {
      if (((!bool3) && (!bool2) ? 0 : 1) == 0) {}
      if ((!bool1 ? 0 : 1) == 0) {}
      if (((!bool4 ? 0 : 1) ^ 0x1) != 0)
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
      else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW3.val = -9;
      }
      else
      {
        if ((paramInt10 >= 1 ? 0 : 1) == 0) {
          if (m == 0) {}
        }
        if ((((paramInt10 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW3.val = -14;
        }
        else
        {
          if ((paramInt12 >= 1 ? 0 : 1) == 0) {
            if (n == 0) {}
          }
          if ((((paramInt12 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW3.val = -16;
          }
        }
      }
    }
    if ((paramintW3.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) != 0)
      {
        i16 = 1;
        i15 = 1;
      }
      else
      {
        if (((i2 != 0) && ((k ^ 0x1) != 0) ? 1 : 0) != 0) {
          i16 = 2 * paramInt1;
        } else {
          i16 = 6 * paramInt1;
        }
        if (((!bool2) && (!bool1) ? 0 : 1) != 0) {
          i16 = 10 * paramInt1;
        }
        if (((!bool4) && (!bool1) ? 0 : 1) != 0) {
          i16 = Math.max(i16, 2 * paramInt1 * (paramInt1 + 4) + 16);
        }
        i15 = i16;
        i15 = Math.max(i15, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, 1, paramInt1, 0));
        i15 = Math.max(i15, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMQR", " ", paramInt1, 1, paramInt1, 0));
        if (m != 0) {
          i15 = Math.max(i15, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, 1, paramInt1, 0));
        }
      }
      paramArrayOfDouble12[(1 - 1 + paramInt17)] = i15;
      if ((paramInt18 >= i16 ? 0 : 1) != 0) {}
      if (((i1 ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW3.val = -26;
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGGEVX", -paramintW3.val);
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
    d1 = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble12, paramInt17);
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
    d3 = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble12, paramInt17);
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
    Dggbal.dggbal(paramString1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramintW1, paramintW2, paramArrayOfDouble8, paramInt13, paramArrayOfDouble9, paramInt14, paramArrayOfDouble12, paramInt17, localintW1);
    paramdoubleW1.val = Dlange.dlange("1", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble12, 1 - 1 + paramInt17);
    if (i != 0)
    {
      paramArrayOfDouble12[(1 - 1 + paramInt17)] = paramdoubleW1.val;
      Dlascl.dlascl("G", 0, 0, d2, d1, 1, 1, paramArrayOfDouble12, 1 - 1 + paramInt17, 1, localintW1);
      paramdoubleW1.val = paramArrayOfDouble12[(1 - 1 + paramInt17)];
    }
    paramdoubleW2.val = Dlange.dlange("1", paramInt1, paramInt1, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble12, 1 - 1 + paramInt17);
    if (j != 0)
    {
      paramArrayOfDouble12[(1 - 1 + paramInt17)] = paramdoubleW2.val;
      Dlascl.dlascl("G", 0, 0, d4, d3, 1, 1, paramArrayOfDouble12, 1 - 1 + paramInt17, 1, localintW1);
      paramdoubleW2.val = paramArrayOfDouble12[(1 - 1 + paramInt17)];
    }
    i8 = paramintW2.val + 1 - paramintW1.val;
    if (((k == 0) && (!(bool3 ^ true)) ? 0 : 1) != 0) {
      i5 = paramInt1 + 1 - paramintW1.val;
    } else {
      i5 = i8;
    }
    i9 = 1;
    i10 = i9 + i8;
    Dgeqrf.dgeqrf(i8, i5, paramArrayOfDouble2, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble12, i9 - 1 + paramInt17, paramArrayOfDouble12, i10 - 1 + paramInt17, paramInt18 + 1 - i10, localintW1);
    Dormqr.dormqr("L", "T", i8, i5, i8, paramArrayOfDouble2, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble12, i9 - 1 + paramInt17, paramArrayOfDouble1, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble12, i10 - 1 + paramInt17, paramInt18 + 1 - i10, localintW1);
    if (m != 0)
    {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble6, paramInt9, paramInt10);
      if ((i8 <= 1 ? 0 : 1) != 0) {
        Dlacpy.dlacpy("L", i8 - 1, i8 - 1, paramArrayOfDouble2, paramintW1.val + 1 - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, paramintW1.val + 1 - 1 + (paramintW1.val - 1) * paramInt10 + paramInt9, paramInt10);
      }
      Dorgqr.dorgqr(i8, i8, i8, paramArrayOfDouble6, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble12, i9 - 1 + paramInt17, paramArrayOfDouble12, i10 - 1 + paramInt17, paramInt18 + 1 - i10, localintW1);
    }
    if (n != 0) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble7, paramInt11, paramInt12);
    }
    if (((k == 0) && (!(bool3 ^ true)) ? 0 : 1) != 0) {
      Dgghrd.dgghrd(paramString2, paramString3, paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, localintW1);
    } else {
      Dgghrd.dgghrd("N", "N", i8, 1, i8, paramArrayOfDouble1, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble2, paramintW1.val - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, localintW1);
    }
    if (((k == 0) && (!(bool3 ^ true)) ? 0 : 1) != 0) {
      str = "S";
    } else {
      str = "E";
    }
    Dhgeqz.dhgeqz(str, paramString2, paramString3, paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramArrayOfDouble4, paramInt7, paramArrayOfDouble5, paramInt8, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, paramArrayOfDouble12, paramInt17, paramInt18, localintW1);
    if ((localintW1.val == 0 ? 0 : 1) != 0)
    {
      if ((localintW1.val <= 0 ? 0 : 1) != 0) {}
      if (((localintW1.val > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW3.val = localintW1.val;
      }
      else
      {
        if ((localintW1.val <= paramInt1 ? 0 : 1) != 0) {}
        if (((localintW1.val > 2 * paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          localintW1.val -= paramInt1;
        } else {
          paramintW3.val = (paramInt1 + 1);
        }
      }
    }
    else
    {
      int i18;
      int i19;
      if (((k == 0) && (!(bool3 ^ true)) ? 0 : 1) != 0)
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
          Dtgevc.dtgevc(str, "B", arrayOfBoolean, 0, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, paramInt1, localintW2, paramArrayOfDouble12, paramInt17, localintW1);
          if ((localintW1.val == 0 ? 0 : 1) != 0)
          {
            paramintW3.val = (paramInt1 + 2);
            break label3995;
          }
        }
        if ((bool3 ^ true))
        {
          i3 = 0;
          i4 = 1;
          for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
          {
            if (i3 != 0)
            {
              i3 = 0;
            }
            else
            {
              i17 = 1;
              if ((i4 >= paramInt1 ? 0 : 1) != 0) {
                if ((paramArrayOfDouble1[(i4 + 1 - 1 + (i4 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) != 0)
                {
                  i3 = 1;
                  i17 = 2;
                }
              }
              i12 = 1;
              for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
              {
                paramArrayOfBoolean[(i12 - 1 + paramInt20)] = false;
                i12 += 1;
              }
              if ((i17 != 1 ? 0 : 1) != 0)
              {
                paramArrayOfBoolean[(i4 - 1 + paramInt20)] = true;
              }
              else if ((i17 != 2 ? 0 : 1) != 0)
              {
                paramArrayOfBoolean[(i4 - 1 + paramInt20)] = true;
                paramArrayOfBoolean[(i4 + 1 - 1 + paramInt20)] = true;
              }
              i10 = i17 * paramInt1 + 1;
              i11 = i10 + i17 * paramInt1;
              if (((!bool2) && (!bool1) ? 0 : 1) != 0)
              {
                Dtgevc.dtgevc("B", "S", paramArrayOfBoolean, paramInt20, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble12, 1 - 1 + paramInt17, paramInt1, paramArrayOfDouble12, i10 - 1 + paramInt17, paramInt1, i17, localintW3, paramArrayOfDouble12, i11 - 1 + paramInt17, localintW1);
                if ((localintW1.val == 0 ? 0 : 1) != 0)
                {
                  paramintW3.val = (paramInt1 + 2);
                  break;
                }
              }
              Dtgsna.dtgsna(paramString4, "S", paramArrayOfBoolean, paramInt20, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble12, 1 - 1 + paramInt17, paramInt1, paramArrayOfDouble12, i10 - 1 + paramInt17, paramInt1, paramArrayOfDouble10, i4 - 1 + paramInt15, paramArrayOfDouble11, i4 - 1 + paramInt16, i17, localintW3, paramArrayOfDouble12, i11 - 1 + paramInt17, paramInt18 - i11 + 1, paramArrayOfInt, paramInt19, localintW1);
            }
            i4 += 1;
          }
        }
      }
      if (m != 0)
      {
        Dggbak.dggbak(paramString1, "L", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble8, paramInt13, paramArrayOfDouble9, paramInt14, paramInt1, paramArrayOfDouble6, paramInt9, paramInt10, localintW1);
        i13 = 1;
        for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
        {
          if ((paramArrayOfDouble4[(i13 - 1 + paramInt7)] >= 0.0D ? 0 : 1) == 0)
          {
            d6 = 0.0D;
            if ((paramArrayOfDouble4[(i13 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
            {
              i14 = 1;
              for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
              {
                d6 = Math.max(d6, Math.abs(paramArrayOfDouble6[(i14 - 1 + (i13 - 1) * paramInt10 + paramInt9)]));
                i14 += 1;
              }
            }
            else
            {
              i14 = 1;
              for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
              {
                d6 = Math.max(d6, Math.abs(paramArrayOfDouble6[(i14 - 1 + (i13 - 1) * paramInt10 + paramInt9)]) + Math.abs(paramArrayOfDouble6[(i14 - 1 + (i13 + 1 - 1) * paramInt10 + paramInt9)]));
                i14 += 1;
              }
            }
            if ((d6 >= localdoubleW2.val ? 0 : 1) == 0)
            {
              d6 = 1.0D / d6;
              if ((paramArrayOfDouble4[(i13 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
              {
                i14 = 1;
                for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                {
                  paramArrayOfDouble6[(i14 - 1 + (i13 - 1) * paramInt10 + paramInt9)] *= d6;
                  i14 += 1;
                }
              }
              else
              {
                i14 = 1;
                for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                {
                  paramArrayOfDouble6[(i14 - 1 + (i13 - 1) * paramInt10 + paramInt9)] *= d6;
                  paramArrayOfDouble6[(i14 - 1 + (i13 + 1 - 1) * paramInt10 + paramInt9)] *= d6;
                  i14 += 1;
                }
              }
            }
          }
          i13 += 1;
        }
      }
      if (n != 0)
      {
        Dggbak.dggbak(paramString1, "R", paramInt1, paramintW1.val, paramintW2.val, paramArrayOfDouble8, paramInt13, paramArrayOfDouble9, paramInt14, paramInt1, paramArrayOfDouble7, paramInt11, paramInt12, localintW1);
        i13 = 1;
        for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
        {
          if ((paramArrayOfDouble4[(i13 - 1 + paramInt7)] >= 0.0D ? 0 : 1) == 0)
          {
            d6 = 0.0D;
            if ((paramArrayOfDouble4[(i13 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
            {
              i14 = 1;
              for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
              {
                d6 = Math.max(d6, Math.abs(paramArrayOfDouble7[(i14 - 1 + (i13 - 1) * paramInt12 + paramInt11)]));
                i14 += 1;
              }
            }
            else
            {
              i14 = 1;
              for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
              {
                d6 = Math.max(d6, Math.abs(paramArrayOfDouble7[(i14 - 1 + (i13 - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble7[(i14 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)]));
                i14 += 1;
              }
            }
            if ((d6 >= localdoubleW2.val ? 0 : 1) == 0)
            {
              d6 = 1.0D / d6;
              if ((paramArrayOfDouble4[(i13 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
              {
                i14 = 1;
                for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                {
                  paramArrayOfDouble7[(i14 - 1 + (i13 - 1) * paramInt12 + paramInt11)] *= d6;
                  i14 += 1;
                }
              }
              else
              {
                i14 = 1;
                for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                {
                  paramArrayOfDouble7[(i14 - 1 + (i13 - 1) * paramInt12 + paramInt11)] *= d6;
                  paramArrayOfDouble7[(i14 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)] *= d6;
                  i14 += 1;
                }
              }
            }
          }
          i13 += 1;
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
    label3995:
    paramArrayOfDouble12[(1 - 1 + paramInt17)] = i15;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dggevx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */