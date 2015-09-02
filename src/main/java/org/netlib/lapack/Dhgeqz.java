package org.netlib.lapack;

import org.netlib.blas.Drot;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dhgeqz
{
  public static void dhgeqz(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, double[] paramArrayOfDouble6, int paramInt11, int paramInt12, double[] paramArrayOfDouble7, int paramInt13, int paramInt14, double[] paramArrayOfDouble8, int paramInt15, int paramInt16, intW paramintW)
  {
    ;
    ;
    ;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
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
    int i18 = 0;
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
    double d19 = 0.0D;
    double d20 = 0.0D;
    double d21 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d22 = 0.0D;
    double d23 = 0.0D;
    double d24 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d25 = 0.0D;
    double d26 = 0.0D;
    double d27 = 0.0D;
    double d28 = 0.0D;
    double d29 = 0.0D;
    double d30 = 0.0D;
    double d31 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d32 = 0.0D;
    double d33 = 0.0D;
    double d34 = 0.0D;
    double d35 = 0.0D;
    double d36 = 0.0D;
    double d37 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d38 = 0.0D;
    doubleW localdoubleW5 = new doubleW(0.0D);
    double d39 = 0.0D;
    double d40 = 0.0D;
    doubleW localdoubleW6 = new doubleW(0.0D);
    doubleW localdoubleW7 = new doubleW(0.0D);
    double d41 = 0.0D;
    doubleW localdoubleW8 = new doubleW(0.0D);
    double d42 = 0.0D;
    double d43 = 0.0D;
    double d44 = 0.0D;
    doubleW localdoubleW9 = new doubleW(0.0D);
    double d45 = 0.0D;
    double d46 = 0.0D;
    doubleW localdoubleW10 = new doubleW(0.0D);
    double d47 = 0.0D;
    double d48 = 0.0D;
    double d49 = 0.0D;
    doubleW localdoubleW11 = new doubleW(0.0D);
    doubleW localdoubleW12 = new doubleW(0.0D);
    doubleW localdoubleW13 = new doubleW(0.0D);
    double d50 = 0.0D;
    doubleW localdoubleW14 = new doubleW(0.0D);
    double d51 = 0.0D;
    double d52 = 0.0D;
    double d53 = 0.0D;
    double d54 = 0.0D;
    double d55 = 0.0D;
    double d56 = 0.0D;
    double d57 = 0.0D;
    double d58 = 0.0D;
    double d59 = 0.0D;
    double d60 = 0.0D;
    double d61 = 0.0D;
    doubleW localdoubleW15 = new doubleW(0.0D);
    doubleW localdoubleW16 = new doubleW(0.0D);
    doubleW localdoubleW17 = new doubleW(0.0D);
    double[] arrayOfDouble = new double[3];
    if (Lsame.lsame(paramString1, "E"))
    {
      n = 0;
      i11 = 1;
    }
    else if (Lsame.lsame(paramString1, "S"))
    {
      n = 1;
      i11 = 2;
    }
    else
    {
      i11 = 0;
    }
    if (Lsame.lsame(paramString2, "N"))
    {
      m = 0;
      i3 = 1;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      m = 1;
      i3 = 2;
    }
    else if (Lsame.lsame(paramString2, "I"))
    {
      m = 1;
      i3 = 3;
    }
    else
    {
      i3 = 0;
    }
    if (Lsame.lsame(paramString3, "N"))
    {
      i1 = 0;
      i4 = 1;
    }
    else if (Lsame.lsame(paramString3, "V"))
    {
      i1 = 1;
      i4 = 2;
    }
    else if (Lsame.lsame(paramString3, "I"))
    {
      i1 = 1;
      i4 = 3;
    }
    else
    {
      i4 = 0;
    }
    paramintW.val = 0;
    paramArrayOfDouble8[(1 - 1 + paramInt15)] = Math.max(1, paramInt1);
    i2 = paramInt16 != -1 ? 0 : 1;
    if ((i11 != 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((i3 != 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((i4 != 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else
    {
      if ((paramInt3 <= paramInt1 ? 0 : 1) == 0) {}
      if (((paramInt3 >= paramInt2 - 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -6;
      }
      else if ((paramInt5 >= paramInt1 ? 0 : 1) != 0)
      {
        paramintW.val = -8;
      }
      else if ((paramInt7 >= paramInt1 ? 0 : 1) != 0)
      {
        paramintW.val = -10;
      }
      else
      {
        if ((paramInt12 >= 1 ? 0 : 1) == 0) {
          if (m == 0) {}
        }
        if ((((paramInt12 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -15;
        }
        else
        {
          if ((paramInt14 >= 1 ? 0 : 1) == 0) {
            if (i1 == 0) {}
          }
          if ((((paramInt14 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
          {
            paramintW.val = -17;
          }
          else
          {
            if ((paramInt16 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {}
            if (((i2 ^ 0x1) != 0 ? 1 : 0) != 0) {
              paramintW.val = -19;
            }
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DHGEQZ", -paramintW.val);
      return;
    }
    if (i2 != 0) {
      return;
    }
    if ((paramInt1 > 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble8[(1 - 1 + paramInt15)] = 1;
      return;
    }
    if ((i3 != 3 ? 0 : 1) != 0) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble6, paramInt11, paramInt12);
    }
    if ((i4 != 3 ? 0 : 1) != 0) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble7, paramInt13, paramInt14);
    }
    i10 = paramInt3 + 1 - paramInt2;
    d43 = Dlamch.dlamch("S");
    d42 = 1.0D / d43;
    d55 = Dlamch.dlamch("E") * Dlamch.dlamch("B");
    d19 = Dlanhs.dlanhs("F", i10, paramArrayOfDouble1, paramInt2 - 1 + (paramInt2 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble8, paramInt15);
    d29 = Dlanhs.dlanhs("F", i10, paramArrayOfDouble2, paramInt2 - 1 + (paramInt2 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble8, paramInt15);
    d21 = Math.max(d43, d55 * d19);
    d31 = Math.max(d43, d55 * d29);
    d20 = 1.0D / Math.max(d43, d19);
    d30 = 1.0D / Math.max(d43, d29);
    i13 = paramInt3 + 1;
    int i19 = paramInt1 - (paramInt3 + 1) + 1;
    int i20;
    while (i19 > 0)
    {
      if ((paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)] >= 0.0D ? 0 : 1) != 0)
      {
        if (n != 0)
        {
          i17 = 1;
          i20 = i13 - 1 + 1;
          while (i20 > 0)
          {
            paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
            i17 += 1;
            ???--;
          }
        }
        else
        {
          paramArrayOfDouble1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfDouble1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
          paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
        }
        if (i1 != 0)
        {
          i17 = 1;
          i20 = paramInt1 - 1 + 1;
          while (i20 > 0)
          {
            paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] = (-paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
            i17 += 1;
            ???--;
          }
        }
      }
      paramArrayOfDouble3[(i13 - 1 + paramInt8)] = paramArrayOfDouble1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)];
      paramArrayOfDouble4[(i13 - 1 + paramInt9)] = 0.0D;
      paramArrayOfDouble5[(i13 - 1 + paramInt10)] = paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
      i13 += 1;
      ???--;
    }
    if ((paramInt3 >= paramInt2 ? 0 : 1) == 0)
    {
      i8 = paramInt3;
      if (n != 0)
      {
        i6 = 1;
        i9 = paramInt1;
      }
      else
      {
        i6 = paramInt2;
        i9 = paramInt3;
      }
      i7 = 0;
      d40 = 0.0D;
      i18 = 30 * (paramInt3 - paramInt2 + 1);
      i16 = 1;
      i19 = i18 - 1 + 1;
      label3623:
      label4039:
      label6207:
      label10369:
      label12600:
      while (i19 > 0)
      {
        int i21;
        if ((i8 != paramInt2 ? 0 : 1) != 0)
        {
          break label3623;
        }
        else if ((Math.abs(paramArrayOfDouble1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)]) > d21 ? 0 : 1) != 0)
        {
          paramArrayOfDouble1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
        }
        else
        {
          if ((Math.abs(paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)]) > d31 ? 0 : 1) != 0)
          {
            paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = 0.0D;
          }
          else
          {
            i13 = i8 - 1;
            i20 = (paramInt2 - (i8 - 1) + -1) / -1;
            while (i20 > 0)
            {
              if ((i13 != paramInt2 ? 0 : 1) != 0)
              {
                j = 1;
              }
              else if ((Math.abs(paramArrayOfDouble1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)]) > d21 ? 0 : 1) != 0)
              {
                paramArrayOfDouble1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
                j = 1;
              }
              else
              {
                j = 0;
              }
              if ((Math.abs(paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)]) >= d31 ? 0 : 1) != 0)
              {
                paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = 0.0D;
                i = 0;
                if ((j ^ 0x1) != 0)
                {
                  localdoubleW12.val = Math.abs(paramArrayOfDouble1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)]);
                  localdoubleW13.val = Math.abs(paramArrayOfDouble1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
                  localdoubleW14.val = Math.max(localdoubleW12.val, localdoubleW13.val);
                  if ((localdoubleW14.val >= 1.0D ? 0 : 1) != 0) {}
                  if (((localdoubleW14.val == 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    localdoubleW12.val /= localdoubleW14.val;
                    localdoubleW13.val /= localdoubleW14.val;
                  }
                  if ((localdoubleW12.val * (d20 * Math.abs(paramArrayOfDouble1[(i13 + 1 - 1 + (i13 - 1) * paramInt5 + paramInt4)])) > localdoubleW13.val * (d20 * d21) ? 0 : 1) != 0) {
                    i = 1;
                  }
                }
                if (((j == 0) && (i == 0) ? 0 : 1) != 0)
                {
                  i15 = i13;
                  i21 = i8 - 1 - i13 + 1;
                  while (i21 > 0)
                  {
                    localdoubleW12.val = paramArrayOfDouble1[(i15 - 1 + (i15 - 1) * paramInt5 + paramInt4)];
                    dlartg_adapter(localdoubleW12.val, paramArrayOfDouble1[(i15 + 1 - 1 + (i15 - 1) * paramInt5 + paramInt4)], localdoubleW3, localdoubleW6, paramArrayOfDouble1, i15 - 1 + (i15 - 1) * paramInt5 + paramInt4);
                    paramArrayOfDouble1[(i15 + 1 - 1 + (i15 - 1) * paramInt5 + paramInt4)] = 0.0D;
                    Drot.drot(i9 - i15, paramArrayOfDouble1, i15 - 1 + (i15 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i15 + 1 - 1 + (i15 + 1 - 1) * paramInt5 + paramInt4, paramInt5, localdoubleW3.val, localdoubleW6.val);
                    Drot.drot(i9 - i15, paramArrayOfDouble2, i15 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, i15 + 1 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6, paramInt7, localdoubleW3.val, localdoubleW6.val);
                    if (m != 0) {
                      Drot.drot(paramInt1, paramArrayOfDouble6, 1 - 1 + (i15 - 1) * paramInt12 + paramInt11, 1, paramArrayOfDouble6, 1 - 1 + (i15 + 1 - 1) * paramInt12 + paramInt11, 1, localdoubleW3.val, localdoubleW6.val);
                    }
                    if (i != 0) {
                      paramArrayOfDouble1[(i15 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4)] *= localdoubleW3.val;
                    }
                    i = 0;
                    if ((Math.abs(paramArrayOfDouble2[(i15 + 1 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6)]) < d31 ? 0 : 1) != 0)
                    {
                      if ((i15 + 1 < i8 ? 0 : 1) != 0) {
                        break;
                      }
                      i5 = i15 + 1;
                      break label4039;
                    }
                    paramArrayOfDouble2[(i15 + 1 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6)] = 0.0D;
                    i15 += 1;
                    ???--;
                  }
                  break;
                }
                i15 = i13;
                i21 = i8 - 1 - i13 + 1;
                while (i21 > 0)
                {
                  localdoubleW12.val = paramArrayOfDouble2[(i15 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6)];
                  dlartg_adapter(localdoubleW12.val, paramArrayOfDouble2[(i15 + 1 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6)], localdoubleW3, localdoubleW6, paramArrayOfDouble2, i15 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6);
                  paramArrayOfDouble2[(i15 + 1 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6)] = 0.0D;
                  if ((i15 >= i9 - 1 ? 0 : 1) != 0) {
                    Drot.drot(i9 - i15 - 1, paramArrayOfDouble2, i15 - 1 + (i15 + 2 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, i15 + 1 - 1 + (i15 + 2 - 1) * paramInt7 + paramInt6, paramInt7, localdoubleW3.val, localdoubleW6.val);
                  }
                  Drot.drot(i9 - i15 + 2, paramArrayOfDouble1, i15 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i15 + 1 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4, paramInt5, localdoubleW3.val, localdoubleW6.val);
                  if (m != 0) {
                    Drot.drot(paramInt1, paramArrayOfDouble6, 1 - 1 + (i15 - 1) * paramInt12 + paramInt11, 1, paramArrayOfDouble6, 1 - 1 + (i15 + 1 - 1) * paramInt12 + paramInt11, 1, localdoubleW3.val, localdoubleW6.val);
                  }
                  localdoubleW12.val = paramArrayOfDouble1[(i15 + 1 - 1 + (i15 - 1) * paramInt5 + paramInt4)];
                  dlartg_adapter(localdoubleW12.val, paramArrayOfDouble1[(i15 + 1 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4)], localdoubleW3, localdoubleW6, paramArrayOfDouble1, i15 + 1 - 1 + (i15 - 1) * paramInt5 + paramInt4);
                  paramArrayOfDouble1[(i15 + 1 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
                  Drot.drot(i15 + 1 - i6, paramArrayOfDouble1, i6 - 1 + (i15 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble1, i6 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4, 1, localdoubleW3.val, localdoubleW6.val);
                  Drot.drot(i15 - i6, paramArrayOfDouble2, i6 - 1 + (i15 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble2, i6 - 1 + (i15 - 1 - 1) * paramInt7 + paramInt6, 1, localdoubleW3.val, localdoubleW6.val);
                  if (i1 != 0) {
                    Drot.drot(paramInt1, paramArrayOfDouble7, 1 - 1 + (i15 - 1) * paramInt14 + paramInt13, 1, paramArrayOfDouble7, 1 - 1 + (i15 - 1 - 1) * paramInt14 + paramInt13, 1, localdoubleW3.val, localdoubleW6.val);
                  }
                  i15 += 1;
                  ???--;
                }
                break;
              }
              if (j != 0)
              {
                i5 = i13;
                break label4039;
              }
              i13 += -1;
              ???--;
            }
            paramintW.val = (paramInt1 + 1);
            break label13011;
          }
          localdoubleW12.val = paramArrayOfDouble1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)];
          dlartg_adapter(localdoubleW12.val, paramArrayOfDouble1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)], localdoubleW3, localdoubleW6, paramArrayOfDouble1, i8 - 1 + (i8 - 1) * paramInt5 + paramInt4);
          paramArrayOfDouble1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
          Drot.drot(i8 - i6, paramArrayOfDouble1, i6 - 1 + (i8 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble1, i6 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, 1, localdoubleW3.val, localdoubleW6.val);
          Drot.drot(i8 - i6, paramArrayOfDouble2, i6 - 1 + (i8 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble2, i6 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6, 1, localdoubleW3.val, localdoubleW6.val);
          if (i1 != 0) {
            Drot.drot(paramInt1, paramArrayOfDouble7, 1 - 1 + (i8 - 1) * paramInt14 + paramInt13, 1, paramArrayOfDouble7, 1 - 1 + (i8 - 1 - 1) * paramInt14 + paramInt13, 1, localdoubleW3.val, localdoubleW6.val);
          }
        }
        if ((paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)] >= 0.0D ? 0 : 1) != 0)
        {
          if (n != 0)
          {
            i13 = i6;
            i20 = i8 - i6 + 1;
            while (i20 > 0)
            {
              paramArrayOfDouble1[(i13 - 1 + (i8 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfDouble1[(i13 - 1 + (i8 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfDouble2[(i13 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfDouble2[(i13 - 1 + (i8 - 1) * paramInt7 + paramInt6)]);
              i13 += 1;
              ???--;
            }
          }
          else
          {
            paramArrayOfDouble1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfDouble1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)]);
          }
          if (i1 != 0)
          {
            i13 = 1;
            i20 = paramInt1 - 1 + 1;
            while (i20 > 0)
            {
              paramArrayOfDouble7[(i13 - 1 + (i8 - 1) * paramInt14 + paramInt13)] = (-paramArrayOfDouble7[(i13 - 1 + (i8 - 1) * paramInt14 + paramInt13)]);
              i13 += 1;
              ???--;
            }
          }
        }
        paramArrayOfDouble3[(i8 - 1 + paramInt8)] = paramArrayOfDouble1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble4[(i8 - 1 + paramInt9)] = 0.0D;
        paramArrayOfDouble5[(i8 - 1 + paramInt10)] = paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)];
        i8 -= 1;
        if ((i8 >= paramInt2 ? 0 : 1) != 0) {
          break;
        }
        i7 = 0;
        d40 = 0.0D;
        if ((n ^ 0x1) != 0)
        {
          i9 = i8;
          if ((i6 <= i8 ? 0 : 1) != 0) {
            i6 = paramInt2;
          }
        }
        break label12600;
        i7 += 1;
        if ((n ^ 0x1) != 0) {
          i6 = i5;
        }
        if ((i7 / 10 * 10 != i7 ? 0 : 1) != 0)
        {
          if ((i18 * d43 * Math.abs(paramArrayOfDouble1[(i8 - 1 - 1 + (i8 - 1) * paramInt5 + paramInt4)]) >= Math.abs(paramArrayOfDouble2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)]) ? 0 : 1) != 0) {
            d40 += paramArrayOfDouble1[(i8 - 1 - 1 + (i8 - 1) * paramInt5 + paramInt4)] / paramArrayOfDouble2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)];
          } else {
            d40 += 1.0D / (d43 * i18);
          }
          localdoubleW7.val = 1.0D;
          localdoubleW16.val = d40;
        }
        else
        {
          Dlag2.dlag2(paramArrayOfDouble1, i8 - 1 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6, paramInt7, d43 * 100.0D, localdoubleW7, localdoubleW8, localdoubleW16, localdoubleW17, localdoubleW15);
          localdoubleW12.val = Math.max(localdoubleW7.val, d43 * Util.max(1.0D, Math.abs(localdoubleW16.val), Math.abs(localdoubleW15.val)));
          if ((localdoubleW15.val == 0.0D ? 0 : 1) != 0) {
            break label6207;
          }
        }
        localdoubleW12.val = (Math.min(d20, 1.0D) * (0.5D * d42));
        if ((localdoubleW7.val <= localdoubleW12.val ? 0 : 1) != 0) {
          d44 = localdoubleW12.val / localdoubleW7.val;
        } else {
          d44 = 1.0D;
        }
        localdoubleW12.val = (Math.min(d30, 1.0D) * (0.5D * d42));
        if ((Math.abs(localdoubleW16.val) <= localdoubleW12.val ? 0 : 1) != 0) {
          d44 = Math.min(d44, localdoubleW12.val / Math.abs(localdoubleW16.val));
        }
        localdoubleW7.val = (d44 * localdoubleW7.val);
        localdoubleW16.val = (d44 * localdoubleW16.val);
        i13 = i8 - 1;
        i20 = (i5 + 1 - (i8 - 1) + -1) / -1;
        while (i20 > 0)
        {
          i12 = i13;
          localdoubleW12.val = Math.abs(localdoubleW7.val * paramArrayOfDouble1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)]);
          localdoubleW13.val = Math.abs(localdoubleW7.val * paramArrayOfDouble1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)] - localdoubleW16.val * paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
          localdoubleW14.val = Math.max(localdoubleW12.val, localdoubleW13.val);
          if ((localdoubleW14.val >= 1.0D ? 0 : 1) != 0) {}
          if (((localdoubleW14.val == 0.0D ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            localdoubleW12.val /= localdoubleW14.val;
            localdoubleW13.val /= localdoubleW14.val;
          }
          if ((Math.abs(d20 * paramArrayOfDouble1[(i13 + 1 - 1 + (i13 - 1) * paramInt5 + paramInt4)] * localdoubleW12.val) > d20 * d21 * localdoubleW13.val ? 0 : 1) != 0) {
            break;
          }
          i13 += -1;
          ???--;
        }
        i12 = i5;
        localdoubleW12.val = (localdoubleW7.val * paramArrayOfDouble1[(i12 - 1 + (i12 - 1) * paramInt5 + paramInt4)] - localdoubleW16.val * paramArrayOfDouble2[(i12 - 1 + (i12 - 1) * paramInt7 + paramInt6)]);
        localdoubleW7.val *= paramArrayOfDouble1[(i12 + 1 - 1 + (i12 - 1) * paramInt5 + paramInt4)];
        Dlartg.dlartg(localdoubleW12.val, localdoubleW13.val, localdoubleW3, localdoubleW6, localdoubleW14);
        i13 = i12;
        i20 = i8 - 1 - i12 + 1;
        while (i20 > 0)
        {
          if ((i13 <= i12 ? 0 : 1) != 0)
          {
            localdoubleW12.val = paramArrayOfDouble1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)];
            dlartg_adapter(localdoubleW12.val, paramArrayOfDouble1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)], localdoubleW3, localdoubleW6, paramArrayOfDouble1, i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4);
            paramArrayOfDouble1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
          }
          i14 = i13;
          i21 = i9 - i13 + 1;
          while (i21 > 0)
          {
            localdoubleW12.val = (localdoubleW3.val * paramArrayOfDouble1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] + localdoubleW6.val * paramArrayOfDouble1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)] = (-(localdoubleW6.val * paramArrayOfDouble1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)]) + localdoubleW3.val * paramArrayOfDouble1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] = localdoubleW12.val;
            localdoubleW13.val = (localdoubleW3.val * paramArrayOfDouble2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] + localdoubleW6.val * paramArrayOfDouble2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)] = (-(localdoubleW6.val * paramArrayOfDouble2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)]) + localdoubleW3.val * paramArrayOfDouble2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] = localdoubleW13.val;
            i14 += 1;
            ???--;
          }
          if (m != 0)
          {
            i17 = 1;
            i21 = paramInt1 - 1 + 1;
            while (i21 > 0)
            {
              localdoubleW12.val = (localdoubleW3.val * paramArrayOfDouble6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] + localdoubleW6.val * paramArrayOfDouble6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)]);
              paramArrayOfDouble6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)] = (-(localdoubleW6.val * paramArrayOfDouble6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)]) + localdoubleW3.val * paramArrayOfDouble6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)]);
              paramArrayOfDouble6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] = localdoubleW12.val;
              i17 += 1;
              ???--;
            }
          }
          localdoubleW12.val = paramArrayOfDouble2[(i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
          dlartg_adapter(localdoubleW12.val, paramArrayOfDouble2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)], localdoubleW3, localdoubleW6, paramArrayOfDouble2, i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6);
          paramArrayOfDouble2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = 0.0D;
          i17 = i6;
          i21 = Math.min(i13 + 2, i8) - i6 + 1;
          while (i21 > 0)
          {
            localdoubleW12.val = (localdoubleW3.val * paramArrayOfDouble1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] + localdoubleW6.val * paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-(localdoubleW6.val * paramArrayOfDouble1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)]) + localdoubleW3.val * paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] = localdoubleW12.val;
            i17 += 1;
            ???--;
          }
          i17 = i6;
          i21 = i13 - i6 + 1;
          while (i21 > 0)
          {
            localdoubleW12.val = (localdoubleW3.val * paramArrayOfDouble2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] + localdoubleW6.val * paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-(localdoubleW6.val * paramArrayOfDouble2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)]) + localdoubleW3.val * paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] = localdoubleW12.val;
            i17 += 1;
            ???--;
          }
          if (i1 != 0)
          {
            i17 = 1;
            i21 = paramInt1 - 1 + 1;
            while (i21 > 0)
            {
              localdoubleW12.val = (localdoubleW3.val * paramArrayOfDouble7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] + localdoubleW6.val * paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
              paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] = (-(localdoubleW6.val * paramArrayOfDouble7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)]) + localdoubleW3.val * paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
              paramArrayOfDouble7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] = localdoubleW12.val;
              i17 += 1;
              ???--;
            }
          }
          i13 += 1;
          ???--;
        }
        break label12600;
        if ((i5 + 1 != i8 ? 0 : 1) != 0)
        {
          Dlasv2.dlasv2(paramArrayOfDouble2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)], paramArrayOfDouble2[(i8 - 1 - 1 + (i8 - 1) * paramInt7 + paramInt6)], paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)], localdoubleW2, localdoubleW1, localdoubleW10, localdoubleW5, localdoubleW9, localdoubleW4);
          if ((localdoubleW1.val >= 0.0D ? 0 : 1) != 0)
          {
            localdoubleW5.val = (-localdoubleW5.val);
            localdoubleW10.val = (-localdoubleW10.val);
            localdoubleW1.val = (-localdoubleW1.val);
            localdoubleW2.val = (-localdoubleW2.val);
          }
          Drot.drot(i9 + 1 - i5, paramArrayOfDouble1, i8 - 1 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, paramInt5, localdoubleW4.val, localdoubleW9.val);
          Drot.drot(i8 + 1 - i6, paramArrayOfDouble1, i6 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble1, i6 - 1 + (i8 - 1) * paramInt5 + paramInt4, 1, localdoubleW5.val, localdoubleW10.val);
          if ((i8 >= i9 ? 0 : 1) != 0) {
            Drot.drot(i9 - i8, paramArrayOfDouble2, i8 - 1 - 1 + (i8 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, i8 - 1 + (i8 + 1 - 1) * paramInt7 + paramInt6, paramInt5, localdoubleW4.val, localdoubleW9.val);
          }
          if ((i6 >= i8 - 1 ? 0 : 1) != 0) {
            Drot.drot(i5 - i6, paramArrayOfDouble2, i6 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble2, i6 - 1 + (i8 - 1) * paramInt7 + paramInt6, 1, localdoubleW5.val, localdoubleW10.val);
          }
          if (m != 0) {
            Drot.drot(paramInt1, paramArrayOfDouble6, 1 - 1 + (i8 - 1 - 1) * paramInt12 + paramInt11, 1, paramArrayOfDouble6, 1 - 1 + (i8 - 1) * paramInt12 + paramInt11, 1, localdoubleW4.val, localdoubleW9.val);
          }
          if (i1 != 0) {
            Drot.drot(paramInt1, paramArrayOfDouble7, 1 - 1 + (i8 - 1 - 1) * paramInt14 + paramInt13, 1, paramArrayOfDouble7, 1 - 1 + (i8 - 1) * paramInt14 + paramInt13, 1, localdoubleW5.val, localdoubleW10.val);
          }
          paramArrayOfDouble2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)] = localdoubleW1.val;
          paramArrayOfDouble2[(i8 - 1 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = 0.0D;
          paramArrayOfDouble2[(i8 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)] = 0.0D;
          paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = localdoubleW2.val;
          if ((localdoubleW2.val >= 0.0D ? 0 : 1) != 0)
          {
            i13 = i6;
            i20 = i8 - i6 + 1;
            while (i20 > 0)
            {
              paramArrayOfDouble1[(i13 - 1 + (i8 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfDouble1[(i13 - 1 + (i8 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfDouble2[(i13 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfDouble2[(i13 - 1 + (i8 - 1) * paramInt7 + paramInt6)]);
              i13 += 1;
              ???--;
            }
            if (i1 != 0)
            {
              i13 = 1;
              i20 = paramInt1 - 1 + 1;
              while (i20 > 0)
              {
                paramArrayOfDouble7[(i13 - 1 + (i8 - 1) * paramInt14 + paramInt13)] = (-paramArrayOfDouble7[(i13 - 1 + (i8 - 1) * paramInt14 + paramInt13)]);
                i13 += 1;
                ???--;
              }
            }
          }
          Dlag2.dlag2(paramArrayOfDouble1, i8 - 1 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6, paramInt7, d43 * 100.0D, localdoubleW7, localdoubleW12, localdoubleW16, localdoubleW13, localdoubleW15);
          if ((localdoubleW15.val != 0.0D ? 0 : 1) == 0)
          {
            d41 = 1.0D / localdoubleW7.val;
            d1 = paramArrayOfDouble1[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)];
            d5 = paramArrayOfDouble1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)];
            d2 = paramArrayOfDouble1[(i8 - 1 - 1 + (i8 - 1) * paramInt5 + paramInt4)];
            d6 = paramArrayOfDouble1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)];
            d33 = localdoubleW7.val * d1 - localdoubleW16.val * localdoubleW1.val;
            d32 = -(localdoubleW15.val * localdoubleW1.val);
            d34 = localdoubleW7.val * d2;
            d35 = localdoubleW7.val * d5;
            d37 = localdoubleW7.val * d6 - localdoubleW16.val * localdoubleW2.val;
            d36 = -(localdoubleW15.val * localdoubleW2.val);
            if ((Math.abs(d33) + Math.abs(d32) + Math.abs(d34) <= Math.abs(d35) + Math.abs(d37) + Math.abs(d36) ? 0 : 1) != 0)
            {
              d49 = Dlapy3.dlapy3(d34, d33, d32);
              d39 = d34 / d49;
              d48 = -(d33 / d49);
              d47 = -(d32 / d49);
            }
            else
            {
              d39 = Dlapy2.dlapy2(d37, d36);
              if ((d39 > d43 ? 0 : 1) != 0)
              {
                d39 = 0.0D;
                d48 = 1.0D;
                d47 = 0.0D;
              }
              else
              {
                localdoubleW14.val = (d37 / d39);
                d50 = d36 / d39;
                d49 = Dlapy2.dlapy2(d39, d35);
                d39 /= d49;
                d48 = -(d35 * localdoubleW14.val / d49);
                d47 = d35 * d50 / d49;
              }
            }
            d18 = Math.abs(d1) + Math.abs(d2) + Math.abs(d5) + Math.abs(d6);
            d28 = Math.abs(localdoubleW1.val) + Math.abs(localdoubleW2.val);
            d61 = Math.abs(localdoubleW16.val) + Math.abs(localdoubleW15.val);
            if ((localdoubleW7.val * d18 <= d61 * d28 ? 0 : 1) != 0)
            {
              d38 = d39 * localdoubleW1.val;
              d46 = d48 * localdoubleW2.val;
              d45 = -(d47 * localdoubleW2.val);
            }
            else
            {
              d4 = d39 * d1 + d48 * d2;
              d3 = d47 * d2;
              d8 = d39 * d5 + d48 * d6;
              d7 = d47 * d6;
              d38 = Dlapy2.dlapy2(d4, d3);
              if ((d38 > d43 ? 0 : 1) != 0)
              {
                d38 = 0.0D;
                d46 = 1.0D;
                d45 = 0.0D;
              }
              else
              {
                localdoubleW14.val = (d4 / d38);
                d50 = d3 / d38;
                d46 = localdoubleW14.val * d8 + d50 * d7;
                d45 = d50 * d8 - localdoubleW14.val * d7;
              }
            }
            d49 = Dlapy3.dlapy3(d38, d46, d45);
            d38 /= d49;
            d46 /= d49;
            d45 /= d49;
            localdoubleW14.val = (d46 * d48 - d45 * d47);
            d50 = d46 * d47 + d45 * d48;
            d24 = d38 * d39 * localdoubleW1.val + localdoubleW14.val * localdoubleW2.val;
            d23 = d50 * localdoubleW2.val;
            d22 = Dlapy2.dlapy2(d24, d23);
            d27 = d38 * d39 * localdoubleW2.val + localdoubleW14.val * localdoubleW1.val;
            d26 = -(d50 * localdoubleW1.val);
            d25 = Dlapy2.dlapy2(d27, d26);
            paramArrayOfDouble5[(i8 - 1 - 1 + paramInt10)] = d22;
            paramArrayOfDouble5[(i8 - 1 + paramInt10)] = d25;
            paramArrayOfDouble3[(i8 - 1 - 1 + paramInt8)] = (localdoubleW16.val * d22 * d41);
            paramArrayOfDouble4[(i8 - 1 - 1 + paramInt9)] = (localdoubleW15.val * d22 * d41);
            paramArrayOfDouble3[(i8 - 1 + paramInt8)] = (localdoubleW16.val * d25 * d41);
            paramArrayOfDouble4[(i8 - 1 + paramInt9)] = (-(localdoubleW15.val * d25 * d41));
            i8 = i5 - 1;
            if ((i8 >= paramInt2 ? 0 : 1) != 0) {
              break;
            }
            i7 = 0;
            d40 = 0.0D;
            if ((n ^ 0x1) != 0)
            {
              i9 = i8;
              if ((i6 <= i8 ? 0 : 1) != 0) {
                i6 = paramInt2;
              }
            }
            break label12600;
          }
        }
        else
        {
          d9 = d20 * paramArrayOfDouble1[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)] / (d30 * paramArrayOfDouble2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)]);
          d13 = d20 * paramArrayOfDouble1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)] / (d30 * paramArrayOfDouble2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)]);
          d11 = d20 * paramArrayOfDouble1[(i8 - 1 - 1 + (i8 - 1) * paramInt5 + paramInt4)] / (d30 * paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)]);
          d15 = d20 * paramArrayOfDouble1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)] / (d30 * paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)]);
          d52 = paramArrayOfDouble2[(i8 - 1 - 1 + (i8 - 1) * paramInt7 + paramInt6)] / paramArrayOfDouble2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)];
          d10 = d20 * paramArrayOfDouble1[(i5 - 1 + (i5 - 1) * paramInt5 + paramInt4)] / (d30 * paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
          d14 = d20 * paramArrayOfDouble1[(i5 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4)] / (d30 * paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
          d12 = d20 * paramArrayOfDouble1[(i5 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4)] / (d30 * paramArrayOfDouble2[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)]);
          d16 = d20 * paramArrayOfDouble1[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4)] / (d30 * paramArrayOfDouble2[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)]);
          d17 = d20 * paramArrayOfDouble1[(i5 + 2 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4)] / (d30 * paramArrayOfDouble2[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)]);
          d53 = paramArrayOfDouble2[(i5 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)] / paramArrayOfDouble2[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)];
          arrayOfDouble[(1 - 1)] = ((d9 - d10) * (d15 - d10) - d11 * d13 + d13 * d52 * d10 + (d12 - d10 * d53) * d14);
          arrayOfDouble[(2 - 1)] = ((d16 - d10 - d14 * d53 - (d9 - d10) - (d15 - d10) + d13 * d52) * d14);
          arrayOfDouble[(3 - 1)] = (d17 * d14);
          i12 = i5;
          dlarfg_adapter(3, arrayOfDouble, 1 - 1, arrayOfDouble, 2 - 1, 1, localdoubleW11);
          arrayOfDouble[(1 - 1)] = 1.0D;
          i13 = i12;
          i20 = i8 - 2 - i12 + 1;
          while (i20 > 0)
          {
            if ((i13 <= i12 ? 0 : 1) != 0)
            {
              arrayOfDouble[(1 - 1)] = paramArrayOfDouble1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)];
              arrayOfDouble[(2 - 1)] = paramArrayOfDouble1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)];
              arrayOfDouble[(3 - 1)] = paramArrayOfDouble1[(i13 + 2 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)];
              dlarfg_adapter(3, paramArrayOfDouble1, i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4, arrayOfDouble, 2 - 1, 1, localdoubleW11);
              arrayOfDouble[(1 - 1)] = 1.0D;
              paramArrayOfDouble1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
              paramArrayOfDouble1[(i13 + 2 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
            }
            i14 = i13;
            i21 = i9 - i13 + 1;
            while (i21 > 0)
            {
              localdoubleW11.val *= (paramArrayOfDouble1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] + arrayOfDouble[(2 - 1)] * paramArrayOfDouble1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)] + arrayOfDouble[(3 - 1)] * paramArrayOfDouble1[(i13 + 2 - 1 + (i14 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfDouble1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] -= localdoubleW12.val;
              paramArrayOfDouble1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)] -= localdoubleW12.val * arrayOfDouble[(2 - 1)];
              paramArrayOfDouble1[(i13 + 2 - 1 + (i14 - 1) * paramInt5 + paramInt4)] -= localdoubleW12.val * arrayOfDouble[(3 - 1)];
              localdoubleW11.val *= (paramArrayOfDouble2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] + arrayOfDouble[(2 - 1)] * paramArrayOfDouble2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)] + arrayOfDouble[(3 - 1)] * paramArrayOfDouble2[(i13 + 2 - 1 + (i14 - 1) * paramInt7 + paramInt6)]);
              paramArrayOfDouble2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] -= localdoubleW13.val;
              paramArrayOfDouble2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)] -= localdoubleW13.val * arrayOfDouble[(2 - 1)];
              paramArrayOfDouble2[(i13 + 2 - 1 + (i14 - 1) * paramInt7 + paramInt6)] -= localdoubleW13.val * arrayOfDouble[(3 - 1)];
              i14 += 1;
              ???--;
            }
            if (m != 0)
            {
              i17 = 1;
              i21 = paramInt1 - 1 + 1;
              while (i21 > 0)
              {
                localdoubleW11.val *= (paramArrayOfDouble6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] + arrayOfDouble[(2 - 1)] * paramArrayOfDouble6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)] + arrayOfDouble[(3 - 1)] * paramArrayOfDouble6[(i17 - 1 + (i13 + 2 - 1) * paramInt12 + paramInt11)]);
                paramArrayOfDouble6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] -= localdoubleW12.val;
                paramArrayOfDouble6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)] -= localdoubleW12.val * arrayOfDouble[(2 - 1)];
                paramArrayOfDouble6[(i17 - 1 + (i13 + 2 - 1) * paramInt12 + paramInt11)] -= localdoubleW12.val * arrayOfDouble[(3 - 1)];
                i17 += 1;
                ???--;
              }
            }
            k = 0;
            localdoubleW12.val = Math.max(Math.abs(paramArrayOfDouble2[(i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)]), Math.abs(paramArrayOfDouble2[(i13 + 1 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)]));
            localdoubleW13.val = Math.max(Math.abs(paramArrayOfDouble2[(i13 + 2 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)]), Math.abs(paramArrayOfDouble2[(i13 + 2 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)]));
            if ((Math.max(localdoubleW12.val, localdoubleW13.val) >= d43 ? 0 : 1) != 0)
            {
              d44 = 0.0D;
              d51 = 1.0D;
              d54 = 0.0D;
              break label10369;
            }
            else
            {
              if ((localdoubleW12.val < localdoubleW13.val ? 0 : 1) != 0)
              {
                d57 = paramArrayOfDouble2[(i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
                d59 = paramArrayOfDouble2[(i13 + 2 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
                d58 = paramArrayOfDouble2[(i13 + 1 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)];
                d60 = paramArrayOfDouble2[(i13 + 2 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)];
                d51 = paramArrayOfDouble2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
                d54 = paramArrayOfDouble2[(i13 + 2 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
              }
              else
              {
                d59 = paramArrayOfDouble2[(i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
                d57 = paramArrayOfDouble2[(i13 + 2 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
                d60 = paramArrayOfDouble2[(i13 + 1 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)];
                d58 = paramArrayOfDouble2[(i13 + 2 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)];
                d54 = paramArrayOfDouble2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
                d51 = paramArrayOfDouble2[(i13 + 2 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
              }
              if ((Math.abs(d58) <= Math.abs(d57) ? 0 : 1) != 0)
              {
                k = 1;
                localdoubleW12.val = d58;
                localdoubleW13.val = d60;
                d58 = d57;
                d60 = d59;
                d57 = localdoubleW12.val;
                d59 = localdoubleW13.val;
              }
              localdoubleW12.val = (d59 / d57);
              d54 -= localdoubleW12.val * d51;
              d60 -= localdoubleW12.val * d58;
              d59 = 0.0D;
              d44 = 1.0D;
              if ((Math.abs(d60) >= d43 ? 0 : 1) != 0)
              {
                d44 = 0.0D;
                d54 = 1.0D;
                d51 = -(d58 / d57);
              }
              else
              {
                if ((Math.abs(d60) >= Math.abs(d54) ? 0 : 1) != 0) {
                  d44 = Math.abs(d60 / d54);
                }
                if ((Math.abs(d57) >= Math.abs(d51) ? 0 : 1) != 0) {
                  d44 = Math.min(d44, Math.abs(d57 / d51));
                }
                d54 = d44 * d54 / d60;
                d51 = (d44 * d51 - d58 * d54) / d57;
              }
            }
            if (k != 0)
            {
              localdoubleW12.val = d54;
              d54 = d51;
              d51 = localdoubleW12.val;
            }
            d49 = Math.sqrt(Math.pow(d44, 2) + Math.pow(d51, 2) + Math.pow(d54, 2));
            localdoubleW11.val = (1.0D + d44 / d49);
            d56 = -(1.0D / (d44 + d49));
            arrayOfDouble[(1 - 1)] = 1.0D;
            arrayOfDouble[(2 - 1)] = (d56 * d51);
            arrayOfDouble[(3 - 1)] = (d56 * d54);
            i17 = i6;
            i21 = Math.min(i13 + 3, i8) - i6 + 1;
            while (i21 > 0)
            {
              localdoubleW11.val *= (paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] + arrayOfDouble[(2 - 1)] * paramArrayOfDouble1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] + arrayOfDouble[(3 - 1)] * paramArrayOfDouble1[(i17 - 1 + (i13 + 2 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] -= localdoubleW12.val;
              paramArrayOfDouble1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] -= localdoubleW12.val * arrayOfDouble[(2 - 1)];
              paramArrayOfDouble1[(i17 - 1 + (i13 + 2 - 1) * paramInt5 + paramInt4)] -= localdoubleW12.val * arrayOfDouble[(3 - 1)];
              i17 += 1;
              ???--;
            }
            i17 = i6;
            i21 = i13 + 2 - i6 + 1;
            while (i21 > 0)
            {
              localdoubleW11.val *= (paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] + arrayOfDouble[(2 - 1)] * paramArrayOfDouble2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] + arrayOfDouble[(3 - 1)] * paramArrayOfDouble2[(i17 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)]);
              paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] -= localdoubleW12.val;
              paramArrayOfDouble2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] -= localdoubleW12.val * arrayOfDouble[(2 - 1)];
              paramArrayOfDouble2[(i17 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)] -= localdoubleW12.val * arrayOfDouble[(3 - 1)];
              i17 += 1;
              ???--;
            }
            if (i1 != 0)
            {
              i17 = 1;
              i21 = paramInt1 - 1 + 1;
              while (i21 > 0)
              {
                localdoubleW11.val *= (paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] + arrayOfDouble[(2 - 1)] * paramArrayOfDouble7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] + arrayOfDouble[(3 - 1)] * paramArrayOfDouble7[(i17 - 1 + (i13 + 2 - 1) * paramInt14 + paramInt13)]);
                paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] -= localdoubleW12.val;
                paramArrayOfDouble7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] -= localdoubleW12.val * arrayOfDouble[(2 - 1)];
                paramArrayOfDouble7[(i17 - 1 + (i13 + 2 - 1) * paramInt14 + paramInt13)] -= localdoubleW12.val * arrayOfDouble[(3 - 1)];
                i17 += 1;
                ???--;
              }
            }
            paramArrayOfDouble2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = 0.0D;
            paramArrayOfDouble2[(i13 + 2 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = 0.0D;
            i13 += 1;
            ???--;
          }
          i13 = i8 - 1;
          localdoubleW12.val = paramArrayOfDouble1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)];
          dlartg_adapter(localdoubleW12.val, paramArrayOfDouble1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)], localdoubleW3, localdoubleW6, paramArrayOfDouble1, i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4);
          paramArrayOfDouble1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
          i14 = i13;
          i20 = i9 - i13 + 1;
          while (i20 > 0)
          {
            localdoubleW12.val = (localdoubleW3.val * paramArrayOfDouble1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] + localdoubleW6.val * paramArrayOfDouble1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)] = (-(localdoubleW6.val * paramArrayOfDouble1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)]) + localdoubleW3.val * paramArrayOfDouble1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] = localdoubleW12.val;
            localdoubleW13.val = (localdoubleW3.val * paramArrayOfDouble2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] + localdoubleW6.val * paramArrayOfDouble2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)] = (-(localdoubleW6.val * paramArrayOfDouble2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)]) + localdoubleW3.val * paramArrayOfDouble2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] = localdoubleW13.val;
            i14 += 1;
            ???--;
          }
          if (m != 0)
          {
            i17 = 1;
            i20 = paramInt1 - 1 + 1;
            while (i20 > 0)
            {
              localdoubleW12.val = (localdoubleW3.val * paramArrayOfDouble6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] + localdoubleW6.val * paramArrayOfDouble6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)]);
              paramArrayOfDouble6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)] = (-(localdoubleW6.val * paramArrayOfDouble6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)]) + localdoubleW3.val * paramArrayOfDouble6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)]);
              paramArrayOfDouble6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] = localdoubleW12.val;
              i17 += 1;
              ???--;
            }
          }
          localdoubleW12.val = paramArrayOfDouble2[(i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
          dlartg_adapter(localdoubleW12.val, paramArrayOfDouble2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)], localdoubleW3, localdoubleW6, paramArrayOfDouble2, i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6);
          paramArrayOfDouble2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = 0.0D;
          i17 = i6;
          i20 = i8 - i6 + 1;
          while (i20 > 0)
          {
            localdoubleW12.val = (localdoubleW3.val * paramArrayOfDouble1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] + localdoubleW6.val * paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-(localdoubleW6.val * paramArrayOfDouble1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)]) + localdoubleW3.val * paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] = localdoubleW12.val;
            i17 += 1;
            ???--;
          }
          i17 = i6;
          i20 = i8 - 1 - i6 + 1;
          while (i20 > 0)
          {
            localdoubleW12.val = (localdoubleW3.val * paramArrayOfDouble2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] + localdoubleW6.val * paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-(localdoubleW6.val * paramArrayOfDouble2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)]) + localdoubleW3.val * paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] = localdoubleW12.val;
            i17 += 1;
            ???--;
          }
          if (i1 != 0)
          {
            i17 = 1;
            i20 = paramInt1 - 1 + 1;
          }
          for (;;)
          {
            localdoubleW12.val = (localdoubleW3.val * paramArrayOfDouble7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] + localdoubleW6.val * paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
            paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] = (-(localdoubleW6.val * paramArrayOfDouble7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)]) + localdoubleW3.val * paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
            paramArrayOfDouble7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] = localdoubleW12.val;
            i17 += 1;
            ???--;
            if (i20 <= 0) {
              break;
            }
          }
        }
        i16 += 1;
        ???--;
      }
      paramintW.val = i8;
    }
    else
    {
      i13 = 1;
      i19 = paramInt2 - 1 - 1 + 1;
      while (i19 > 0)
      {
        if ((paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)] >= 0.0D ? 0 : 1) != 0)
        {
          if (n != 0)
          {
            i17 = 1;
            i20 = i13 - 1 + 1;
            while (i20 > 0)
            {
              paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfDouble1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfDouble2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
              i17 += 1;
              ???--;
            }
          }
          else
          {
            paramArrayOfDouble1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfDouble1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
          }
          if (i1 != 0)
          {
            i17 = 1;
            i20 = paramInt1 - 1 + 1;
            while (i20 > 0)
            {
              paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] = (-paramArrayOfDouble7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
              i17 += 1;
              ???--;
            }
          }
        }
        paramArrayOfDouble3[(i13 - 1 + paramInt8)] = paramArrayOfDouble1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble4[(i13 - 1 + paramInt9)] = 0.0D;
        paramArrayOfDouble5[(i13 - 1 + paramInt10)] = paramArrayOfDouble2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
        i13 += 1;
        ???--;
      }
      paramintW.val = 0;
    }
    label13011:
    paramArrayOfDouble8[(1 - 1 + paramInt15)] = paramInt1;
  }
  
  private static void dlartg_adapter(double paramDouble1, double paramDouble2, doubleW paramdoubleW1, doubleW paramdoubleW2, double[] paramArrayOfDouble, int paramInt)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble[paramInt]);
    Dlartg.dlartg(paramDouble1, paramDouble2, paramdoubleW1, paramdoubleW2, localdoubleW);
    paramArrayOfDouble[paramInt] = localdoubleW.val;
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, doubleW paramdoubleW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble1[paramInt2]);
    Dlarfg.dlarfg(paramInt1, localdoubleW, paramArrayOfDouble2, paramInt3, paramInt4, paramdoubleW);
    paramArrayOfDouble1[paramInt2] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dhgeqz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */