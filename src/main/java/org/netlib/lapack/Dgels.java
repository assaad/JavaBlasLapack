package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgels
{
  public static void dgels(String paramString, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, intW paramintW)
  {
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
    double d1 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d2 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double[] arrayOfDouble = new double[1];
    paramintW.val = 0;
    i3 = Math.min(paramInt1, paramInt2);
    i = paramInt9 != -1 ? 0 : 1;
    if ((((!Lsame.lsame(paramString, "N")) && (!Lsame.lsame(paramString, "T")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -6;
    }
    else if ((paramInt7 >= Util.max(1, paramInt1, paramInt2) ? 0 : 1) != 0)
    {
      paramintW.val = -8;
    }
    else
    {
      if ((paramInt9 >= Math.max(1, i3 + Math.max(i3, paramInt3)) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -10;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) == 0) {}
    if (((paramintW.val != -10 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      j = 1;
      if (Lsame.lsame(paramString, "N")) {
        j = 0;
      }
      if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
      {
        i4 = Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
        if (j != 0) {
          i4 = Math.max(i4, Ilaenv.ilaenv(1, "DORMQR", "LN", paramInt1, paramInt3, paramInt2, -1));
        } else {
          i4 = Math.max(i4, Ilaenv.ilaenv(1, "DORMQR", "LT", paramInt1, paramInt3, paramInt2, -1));
        }
      }
      else
      {
        i4 = Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
        if (j != 0) {
          i4 = Math.max(i4, Ilaenv.ilaenv(1, "DORMLQ", "LT", paramInt2, paramInt3, paramInt1, -1));
        } else {
          i4 = Math.max(i4, Ilaenv.ilaenv(1, "DORMLQ", "LN", paramInt2, paramInt3, paramInt1, -1));
        }
      }
      i6 = Math.max(1, i3 + Math.max(i3, paramInt3) * i4);
      paramArrayOfDouble3[(1 - 1 + paramInt8)] = i6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGELS ", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((Util.min(paramInt1, paramInt2, paramInt3) != 0 ? 0 : 1) != 0)
    {
      Dlaset.dlaset("Full", Math.max(paramInt1, paramInt2), paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, paramInt6, paramInt7);
      return;
    }
    localdoubleW2.val = (Dlamch.dlamch("S") / Dlamch.dlamch("P"));
    localdoubleW1.val = (1.0D / localdoubleW2.val);
    Dlabad.dlabad(localdoubleW2, localdoubleW1);
    d1 = Dlange.dlange("M", paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, arrayOfDouble, 0);
    n = 0;
    if ((d1 <= 0.0D ? 0 : 1) != 0) {}
    if (((d1 >= localdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d1, localdoubleW2.val, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramintW);
      n = 1;
    }
    else if ((d1 <= localdoubleW1.val ? 0 : 1) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d1, localdoubleW1.val, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramintW);
      n = 2;
    }
    else if ((d1 != 0.0D ? 0 : 1) != 0)
    {
      Dlaset.dlaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, paramInt6, paramInt7);
      break label1788;
    }
    k = paramInt1;
    if (j != 0) {
      k = paramInt2;
    }
    d2 = Dlange.dlange("M", k, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, arrayOfDouble, 0);
    i1 = 0;
    if ((d2 <= 0.0D ? 0 : 1) != 0) {}
    if (((d2 >= localdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d2, localdoubleW2.val, k, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
      i1 = 1;
    }
    else if ((d2 <= localdoubleW1.val ? 0 : 1) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d2, localdoubleW1.val, k, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
      i1 = 2;
    }
    int i7;
    int i8;
    if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
    {
      Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, 1 - 1 + paramInt8, paramArrayOfDouble3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
      if ((j ^ 0x1) != 0)
      {
        Dormqr.dormqr("Left", "Transpose", paramInt1, paramInt3, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, 1 - 1 + paramInt8, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
        Dtrtrs.dtrtrs("Upper", "No transpose", "Non-unit", paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
        if ((paramintW.val <= 0 ? 0 : 1) != 0) {
          return;
        }
        i5 = paramInt2;
      }
      else
      {
        Dtrtrs.dtrtrs("Upper", "Transpose", "Non-unit", paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
        if ((paramintW.val <= 0 ? 0 : 1) != 0) {
          return;
        }
        i2 = 1;
        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
        {
          m = paramInt2 + 1;
          for (i8 = paramInt1 - (paramInt2 + 1) + 1; i8 > 0; i8--)
          {
            paramArrayOfDouble2[(m - 1 + (i2 - 1) * paramInt7 + paramInt6)] = 0.0D;
            m += 1;
          }
          i2 += 1;
        }
        Dormqr.dormqr("Left", "No transpose", paramInt1, paramInt3, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, 1 - 1 + paramInt8, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
        i5 = paramInt1;
      }
    }
    else
    {
      Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, 1 - 1 + paramInt8, paramArrayOfDouble3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
      if ((j ^ 0x1) != 0)
      {
        Dtrtrs.dtrtrs("Lower", "No transpose", "Non-unit", paramInt1, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
        if ((paramintW.val <= 0 ? 0 : 1) != 0) {
          return;
        }
        i2 = 1;
        for (i7 = paramInt3 - 1 + 1; i7 > 0; i7--)
        {
          m = paramInt1 + 1;
          for (i8 = paramInt2 - (paramInt1 + 1) + 1; i8 > 0; i8--)
          {
            paramArrayOfDouble2[(m - 1 + (i2 - 1) * paramInt7 + paramInt6)] = 0.0D;
            m += 1;
          }
          i2 += 1;
        }
        Dormlq.dormlq("Left", "Transpose", paramInt2, paramInt3, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, 1 - 1 + paramInt8, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
        i5 = paramInt2;
      }
      else
      {
        Dormlq.dormlq("Left", "No transpose", paramInt2, paramInt3, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, 1 - 1 + paramInt8, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, i3 + 1 - 1 + paramInt8, paramInt9 - i3, paramintW);
        Dtrtrs.dtrtrs("Lower", "Transpose", "Non-unit", paramInt1, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
        if ((paramintW.val <= 0 ? 0 : 1) != 0) {
          return;
        }
        i5 = paramInt1;
      }
    }
    if ((n != 1 ? 0 : 1) != 0) {
      Dlascl.dlascl("G", 0, 0, d1, localdoubleW2.val, i5, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
    } else if ((n != 2 ? 0 : 1) != 0) {
      Dlascl.dlascl("G", 0, 0, d1, localdoubleW1.val, i5, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
    }
    if ((i1 != 1 ? 0 : 1) != 0) {
      Dlascl.dlascl("G", 0, 0, localdoubleW2.val, d2, i5, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
    } else if ((i1 != 2 ? 0 : 1) != 0) {
      Dlascl.dlascl("G", 0, 0, localdoubleW1.val, d2, i5, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW);
    }
    label1788:
    paramArrayOfDouble3[(1 - 1 + paramInt8)] = i6;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgels.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */