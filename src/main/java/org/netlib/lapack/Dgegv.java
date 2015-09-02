package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Dgegv
{
  public static void dgegv(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, double[] paramArrayOfDouble6, int paramInt9, int paramInt10, double[] paramArrayOfDouble7, int paramInt11, int paramInt12, double[] paramArrayOfDouble8, int paramInt13, int paramInt14, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    String str = new String(" ");
    int i1 = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    intW localintW3 = new intW(0);
    intW localintW4 = new intW(0);
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    boolean[] arrayOfBoolean = new boolean[1];
    if (Lsame.lsame(paramString1, "N"))
    {
      i2 = 1;
      k = 0;
    }
    else if (Lsame.lsame(paramString1, "V"))
    {
      i2 = 2;
      k = 1;
    }
    else
    {
      i2 = -1;
      k = 0;
    }
    if (Lsame.lsame(paramString2, "N"))
    {
      i3 = 1;
      m = 0;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      i3 = 2;
      m = 1;
    }
    else
    {
      i3 = -1;
      m = 0;
    }
    j = (k == 0) && (m == 0) ? 0 : 1;
    i12 = Math.max(8 * paramInt1, 1);
    i13 = i12;
    paramArrayOfDouble8[(1 - 1 + paramInt13)] = i13;
    n = paramInt14 != -1 ? 0 : 1;
    paramintW.val = 0;
    if ((i2 > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((i3 > 0 ? 0 : 1) != 0)
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
        if (k == 0) {}
      }
      if ((((paramInt10 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -12;
      }
      else
      {
        if ((paramInt12 >= 1 ? 0 : 1) == 0) {
          if (m == 0) {}
        }
        if ((((paramInt12 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -14;
        }
        else
        {
          if ((paramInt14 >= i12 ? 0 : 1) != 0) {}
          if (((n ^ 0x1) != 0 ? 1 : 0) != 0) {
            paramintW.val = -16;
          }
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i15 = Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt1, -1, -1);
      i16 = Ilaenv.ilaenv(1, "DORMQR", " ", paramInt1, paramInt1, paramInt1, -1);
      i17 = Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt1, paramInt1, -1);
      i14 = Util.max(i15, i16, i17);
      i11 = 2 * paramInt1 + Math.max(6 * paramInt1, paramInt1 * (i14 + 1));
      paramArrayOfDouble8[(1 - 1 + paramInt13)] = i11;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGEGV ", -paramintW.val);
      return;
    }
    if (n != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    d10 = Dlamch.dlamch("E") * Dlamch.dlamch("B");
    d13 = Dlamch.dlamch("S");
    d13 += d13;
    d12 = 1.0D / d13;
    d11 = 1.0D + 4 * d10;
    d4 = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble8, paramInt13);
    d5 = d4;
    d6 = 1.0D;
    if ((d4 >= 1.0D ? 0 : 1) != 0) {
      if ((d12 * d4 >= 1.0D ? 0 : 1) != 0)
      {
        d5 = d13;
        d6 = d12 * d4;
      }
    }
    if ((d4 <= 0.0D ? 0 : 1) != 0)
    {
      Dlascl.dlascl("G", -1, -1, d4, 1.0D, paramInt1, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, localintW2);
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 10);
        return;
      }
    }
    d7 = Dlange.dlange("M", paramInt1, paramInt1, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble8, paramInt13);
    d8 = d7;
    d9 = 1.0D;
    if ((d7 >= 1.0D ? 0 : 1) != 0) {
      if ((d12 * d7 >= 1.0D ? 0 : 1) != 0)
      {
        d8 = d13;
        d9 = d12 * d7;
      }
    }
    if ((d7 <= 0.0D ? 0 : 1) != 0)
    {
      Dlascl.dlascl("G", -1, -1, d7, 1.0D, paramInt1, paramInt1, paramArrayOfDouble2, paramInt4, paramInt5, localintW2);
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 10);
        return;
      }
    }
    i4 = 1;
    i5 = paramInt1 + 1;
    i8 = i5 + paramInt1;
    Dggbal.dggbal("P", paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, localintW3, localintW1, paramArrayOfDouble8, i4 - 1 + paramInt13, paramArrayOfDouble8, i5 - 1 + paramInt13, paramArrayOfDouble8, i8 - 1 + paramInt13, localintW2);
    if ((localintW2.val == 0 ? 0 : 1) != 0)
    {
      paramintW.val = (paramInt1 + 1);
    }
    else
    {
      i6 = localintW1.val + 1 - localintW3.val;
      if (j != 0) {
        i1 = paramInt1 + 1 - localintW3.val;
      } else {
        i1 = i6;
      }
      i7 = i8;
      i8 = i7 + i6;
      Dgeqrf.dgeqrf(i6, i1, paramArrayOfDouble2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble8, i7 - 1 + paramInt13, paramArrayOfDouble8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
      if ((localintW2.val < 0 ? 0 : 1) != 0) {
        i13 = Math.max(i13, (int)paramArrayOfDouble8[(i8 - 1 + paramInt13)] + i8 - 1);
      }
      if ((localintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW.val = (paramInt1 + 2);
      }
      else
      {
        Dormqr.dormqr("L", "T", i6, i1, i6, paramArrayOfDouble2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble8, i7 - 1 + paramInt13, paramArrayOfDouble1, localintW3.val - 1 + (localintW3.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
        if ((localintW2.val < 0 ? 0 : 1) != 0) {
          i13 = Math.max(i13, (int)paramArrayOfDouble8[(i8 - 1 + paramInt13)] + i8 - 1);
        }
        if ((localintW2.val == 0 ? 0 : 1) != 0)
        {
          paramintW.val = (paramInt1 + 3);
        }
        else
        {
          if (k != 0)
          {
            Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble6, paramInt9, paramInt10);
            Dlacpy.dlacpy("L", i6 - 1, i6 - 1, paramArrayOfDouble2, localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, localintW3.val + 1 - 1 + (localintW3.val - 1) * paramInt10 + paramInt9, paramInt10);
            Dorgqr.dorgqr(i6, i6, i6, paramArrayOfDouble6, localintW3.val - 1 + (localintW3.val - 1) * paramInt10 + paramInt9, paramInt10, paramArrayOfDouble8, i7 - 1 + paramInt13, paramArrayOfDouble8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
            if ((localintW2.val < 0 ? 0 : 1) != 0) {
              i13 = Math.max(i13, (int)paramArrayOfDouble8[(i8 - 1 + paramInt13)] + i8 - 1);
            }
            if ((localintW2.val == 0 ? 0 : 1) != 0)
            {
              paramintW.val = (paramInt1 + 4);
              break label3996;
            }
          }
          if (m != 0) {
            Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble7, paramInt11, paramInt12);
          }
          if (j != 0) {
            Dgghrd.dgghrd(paramString1, paramString2, paramInt1, localintW3.val, localintW1.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, localintW2);
          } else {
            Dgghrd.dgghrd("N", "N", i6, 1, i6, paramArrayOfDouble1, localintW3.val - 1 + (localintW3.val - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble2, localintW3.val - 1 + (localintW3.val - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, localintW2);
          }
          if ((localintW2.val == 0 ? 0 : 1) != 0)
          {
            paramintW.val = (paramInt1 + 5);
          }
          else
          {
            i8 = i7;
            if (j != 0) {
              str = "S";
            } else {
              str = "E";
            }
            Dhgeqz.dhgeqz(str, paramString1, paramString2, paramInt1, localintW3.val, localintW1.val, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble3, paramInt6, paramArrayOfDouble4, paramInt7, paramArrayOfDouble5, paramInt8, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, paramArrayOfDouble8, i8 - 1 + paramInt13, paramInt14 + 1 - i8, localintW2);
            if ((localintW2.val < 0 ? 0 : 1) != 0) {
              i13 = Math.max(i13, (int)paramArrayOfDouble8[(i8 - 1 + paramInt13)] + i8 - 1);
            }
            if ((localintW2.val == 0 ? 0 : 1) != 0)
            {
              if ((localintW2.val <= 0 ? 0 : 1) != 0) {}
              if (((localintW2.val > paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                paramintW.val = localintW2.val;
              }
              else
              {
                if ((localintW2.val <= paramInt1 ? 0 : 1) != 0) {}
                if (((localintW2.val > 2 * paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
                  localintW2.val -= paramInt1;
                } else {
                  paramintW.val = (paramInt1 + 6);
                }
              }
            }
            else
            {
              if (j != 0)
              {
                if (k != 0)
                {
                  if (m != 0) {
                    str = "B";
                  } else {
                    str = "L";
                  }
                }
                else {
                  str = "R";
                }
                Dtgevc.dtgevc(str, "B", arrayOfBoolean, 0, paramInt1, paramArrayOfDouble1, paramInt2, paramInt3, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble6, paramInt9, paramInt10, paramArrayOfDouble7, paramInt11, paramInt12, paramInt1, localintW4, paramArrayOfDouble8, i8 - 1 + paramInt13, localintW2);
                if ((localintW2.val == 0 ? 0 : 1) != 0)
                {
                  paramintW.val = (paramInt1 + 7);
                  break label3996;
                }
                int i19;
                if (k != 0)
                {
                  Dggbak.dggbak("P", "L", paramInt1, localintW3.val, localintW1.val, paramArrayOfDouble8, i4 - 1 + paramInt13, paramArrayOfDouble8, i5 - 1 + paramInt13, paramInt1, paramArrayOfDouble6, paramInt9, paramInt10, localintW2);
                  if ((localintW2.val == 0 ? 0 : 1) != 0)
                  {
                    paramintW.val = (paramInt1 + 8);
                    break label3996;
                  }
                  i9 = 1;
                  for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
                  {
                    if ((paramArrayOfDouble4[(i9 - 1 + paramInt7)] >= 0.0D ? 0 : 1) == 0)
                    {
                      d18 = 0.0D;
                      if ((paramArrayOfDouble4[(i9 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
                      {
                        i10 = 1;
                        for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                        {
                          d18 = Math.max(d18, Math.abs(paramArrayOfDouble6[(i10 - 1 + (i9 - 1) * paramInt10 + paramInt9)]));
                          i10 += 1;
                        }
                      }
                      else
                      {
                        i10 = 1;
                        for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                        {
                          d18 = Math.max(d18, Math.abs(paramArrayOfDouble6[(i10 - 1 + (i9 - 1) * paramInt10 + paramInt9)]) + Math.abs(paramArrayOfDouble6[(i10 - 1 + (i9 + 1 - 1) * paramInt10 + paramInt9)]));
                          i10 += 1;
                        }
                      }
                      if ((d18 >= d13 ? 0 : 1) == 0)
                      {
                        d18 = 1.0D / d18;
                        if ((paramArrayOfDouble4[(i9 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
                        {
                          i10 = 1;
                          for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                          {
                            paramArrayOfDouble6[(i10 - 1 + (i9 - 1) * paramInt10 + paramInt9)] *= d18;
                            i10 += 1;
                          }
                        }
                        else
                        {
                          i10 = 1;
                          for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                          {
                            paramArrayOfDouble6[(i10 - 1 + (i9 - 1) * paramInt10 + paramInt9)] *= d18;
                            paramArrayOfDouble6[(i10 - 1 + (i9 + 1 - 1) * paramInt10 + paramInt9)] *= d18;
                            i10 += 1;
                          }
                        }
                      }
                    }
                    i9 += 1;
                  }
                }
                if (m != 0)
                {
                  Dggbak.dggbak("P", "R", paramInt1, localintW3.val, localintW1.val, paramArrayOfDouble8, i4 - 1 + paramInt13, paramArrayOfDouble8, i5 - 1 + paramInt13, paramInt1, paramArrayOfDouble7, paramInt11, paramInt12, localintW2);
                  if ((localintW2.val == 0 ? 0 : 1) != 0)
                  {
                    paramintW.val = (paramInt1 + 9);
                    break label3996;
                  }
                  i9 = 1;
                  for (i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
                  {
                    if ((paramArrayOfDouble4[(i9 - 1 + paramInt7)] >= 0.0D ? 0 : 1) == 0)
                    {
                      d18 = 0.0D;
                      if ((paramArrayOfDouble4[(i9 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
                      {
                        i10 = 1;
                        for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                        {
                          d18 = Math.max(d18, Math.abs(paramArrayOfDouble7[(i10 - 1 + (i9 - 1) * paramInt12 + paramInt11)]));
                          i10 += 1;
                        }
                      }
                      else
                      {
                        i10 = 1;
                        for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                        {
                          d18 = Math.max(d18, Math.abs(paramArrayOfDouble7[(i10 - 1 + (i9 - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble7[(i10 - 1 + (i9 + 1 - 1) * paramInt12 + paramInt11)]));
                          i10 += 1;
                        }
                      }
                      if ((d18 >= d13 ? 0 : 1) == 0)
                      {
                        d18 = 1.0D / d18;
                        if ((paramArrayOfDouble4[(i9 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0)
                        {
                          i10 = 1;
                          for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                          {
                            paramArrayOfDouble7[(i10 - 1 + (i9 - 1) * paramInt12 + paramInt11)] *= d18;
                            i10 += 1;
                          }
                        }
                        else
                        {
                          i10 = 1;
                          for (i19 = paramInt1 - 1 + 1; i19 > 0; i19--)
                          {
                            paramArrayOfDouble7[(i10 - 1 + (i9 - 1) * paramInt12 + paramInt11)] *= d18;
                            paramArrayOfDouble7[(i10 - 1 + (i9 + 1 - 1) * paramInt12 + paramInt11)] *= d18;
                            i10 += 1;
                          }
                        }
                      }
                    }
                    i9 += 1;
                  }
                }
              }
              i9 = 1;
              for (int i18 = paramInt1 - 1 + 1; i18 > 0; i18--)
              {
                d2 = Math.abs(paramArrayOfDouble3[(i9 - 1 + paramInt6)]);
                d1 = Math.abs(paramArrayOfDouble4[(i9 - 1 + paramInt7)]);
                d3 = Math.abs(paramArrayOfDouble5[(i9 - 1 + paramInt8)]);
                d15 = d4 * paramArrayOfDouble3[(i9 - 1 + paramInt6)];
                d14 = d4 * paramArrayOfDouble4[(i9 - 1 + paramInt7)];
                d16 = d7 * paramArrayOfDouble5[(i9 - 1 + paramInt8)];
                i = 0;
                d17 = 1.0D;
                if ((Math.abs(d14) >= d13 ? 0 : 1) != 0) {}
                if (((d1 < Util.max(d13, d10 * d2, d10 * d3) ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  i = 1;
                  d17 = d11 * d13 / d5 / Math.max(d11 * d13, d6 * d1);
                }
                else if ((d14 != 0.0D ? 0 : 1) != 0)
                {
                  if ((paramArrayOfDouble4[(i9 - 1 + paramInt7)] >= 0.0D ? 0 : 1) != 0) {}
                  if (((i9 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    paramArrayOfDouble4[(i9 - 1 - 1 + paramInt7)] = 0.0D;
                  }
                  else
                  {
                    if ((paramArrayOfDouble4[(i9 - 1 + paramInt7)] <= 0.0D ? 0 : 1) != 0) {}
                    if (((i9 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
                      paramArrayOfDouble4[(i9 + 1 - 1 + paramInt7)] = 0.0D;
                    }
                  }
                }
                if ((Math.abs(d15) >= d13 ? 0 : 1) != 0) {}
                if (((d2 < Util.max(d13, d10 * d1, d10 * d3) ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  i = 1;
                  d17 = Math.max(d17, d11 * d13 / d5 / Math.max(d11 * d13, d6 * d2));
                }
                if ((Math.abs(d16) >= d13 ? 0 : 1) != 0) {}
                if (((d3 < Util.max(d13, d10 * d2, d10 * d1) ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  i = 1;
                  d17 = Math.max(d17, d11 * d13 / d8 / Math.max(d11 * d13, d9 * d3));
                }
                if (i != 0)
                {
                  d18 = d17 * d13 * Util.max(Math.abs(d15), Math.abs(d14), Math.abs(d16));
                  if ((d18 <= 1.0D ? 0 : 1) != 0) {
                    d17 /= d18;
                  }
                  if ((d17 >= 1.0D ? 0 : 1) != 0) {
                    i = 0;
                  }
                }
                if (i != 0)
                {
                  d15 = d17 * paramArrayOfDouble3[(i9 - 1 + paramInt6)] * d4;
                  d14 = d17 * paramArrayOfDouble4[(i9 - 1 + paramInt7)] * d4;
                  d16 = d17 * paramArrayOfDouble5[(i9 - 1 + paramInt8)] * d7;
                }
                paramArrayOfDouble3[(i9 - 1 + paramInt6)] = d15;
                paramArrayOfDouble4[(i9 - 1 + paramInt7)] = d14;
                paramArrayOfDouble5[(i9 - 1 + paramInt8)] = d16;
                i9 += 1;
              }
            }
          }
        }
      }
    }
    label3996:
    paramArrayOfDouble8[(1 - 1 + paramInt13)] = i13;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgegv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */