package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgelsd
{
  public static void dgelsd(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double paramDouble, intW paramintW1, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, int[] paramArrayOfInt, int paramInt11, intW paramintW2)
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
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    double d1 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    paramintW2.val = 0;
    i7 = Math.min(paramInt1, paramInt2);
    i5 = Math.max(paramInt1, paramInt2);
    i10 = Ilaenv.ilaenv(6, "DGELSD", " ", paramInt1, paramInt2, paramInt3, -1);
    i = paramInt10 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -2;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -3;
    } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW2.val = -5;
    } else if ((paramInt7 >= Math.max(1, i5) ? 0 : 1) != 0) {
      paramintW2.val = -7;
    }
    i13 = Ilaenv.ilaenv(9, "DGELSD", " ", 0, 0, 0, 0);
    i8 = 1;
    i7 = Math.max(1, i7);
    i11 = Math.max((int)(Math.log(i7 / (i13 + 1)) / Math.log(2.0D)) + 1, 0);
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      i6 = 0;
      i9 = paramInt1;
      if ((paramInt1 < paramInt2 ? 0 : 1) != 0) {}
      if (((paramInt1 < i10 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        i9 = paramInt2;
        i6 = Math.max(i6, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1));
        i6 = Math.max(i6, paramInt2 + paramInt3 * Ilaenv.ilaenv(1, "DORMQR", "LT", paramInt1, paramInt3, paramInt2, -1));
      }
      if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
      {
        i6 = Math.max(i6, 3 * paramInt2 + (i9 + paramInt2) * Ilaenv.ilaenv(1, "DGEBRD", " ", i9, paramInt2, -1, -1));
        i6 = Math.max(i6, 3 * paramInt2 + paramInt3 * Ilaenv.ilaenv(1, "DORMBR", "QLT", i9, paramInt3, paramInt2, -1));
        i6 = Math.max(i6, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "DORMBR", "PLN", paramInt2, paramInt3, paramInt2, -1));
        i14 = 9 * paramInt2 + 2 * paramInt2 * i13 + 8 * paramInt2 * i11 + paramInt2 * paramInt3 + (int)Math.pow(i13 + 1, 2);
        i6 = Math.max(i6, 3 * paramInt2 + i14);
        i8 = Util.max(3 * paramInt2 + i9, 3 * paramInt2 + paramInt3, 3 * paramInt2 + i14);
      }
      if ((paramInt2 <= paramInt1 ? 0 : 1) != 0)
      {
        i14 = 9 * paramInt1 + 2 * paramInt1 * i13 + 8 * paramInt1 * i11 + paramInt1 * paramInt3 + (int)Math.pow(i13 + 1, 2);
        if ((paramInt2 < i10 ? 0 : 1) != 0)
        {
          i6 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
          i6 = Math.max(i6, paramInt1 * paramInt1 + 4 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
          i6 = Math.max(i6, paramInt1 * paramInt1 + 4 * paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "DORMBR", "QLT", paramInt1, paramInt3, paramInt1, -1));
          i6 = Math.max(i6, paramInt1 * paramInt1 + 4 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORMBR", "PLN", paramInt1, paramInt3, paramInt1, -1));
          if ((paramInt3 <= 1 ? 0 : 1) != 0) {
            i6 = Math.max(i6, paramInt1 * paramInt1 + paramInt1 + paramInt1 * paramInt3);
          } else {
            i6 = Math.max(i6, paramInt1 * paramInt1 + 2 * paramInt1);
          }
          i6 = Math.max(i6, paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "DORMLQ", "LT", paramInt2, paramInt3, paramInt1, -1));
          i6 = Math.max(i6, paramInt1 * paramInt1 + 4 * paramInt1 + i14);
        }
        else
        {
          i6 = 3 * paramInt1 + (paramInt2 + paramInt1) * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt2, -1, -1);
          i6 = Math.max(i6, 3 * paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "DORMBR", "QLT", paramInt1, paramInt3, paramInt2, -1));
          i6 = Math.max(i6, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "PLN", paramInt2, paramInt3, paramInt1, -1));
          i6 = Math.max(i6, 3 * paramInt1 + i14);
        }
        i8 = Util.max(3 * paramInt1 + paramInt3, 3 * paramInt1 + paramInt1, 3 * paramInt1 + i14);
      }
      i8 = Math.min(i8, i6);
      paramArrayOfDouble4[(1 - 1 + paramInt9)] = i6;
      if ((paramInt10 >= i8 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -12;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGELSD", -paramintW2.val);
      return;
    }
    if (i != 0)
    {
      break label3006;
    }
    else
    {
      if ((paramInt1 != 0 ? 0 : 1) == 0) {}
      if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW1.val = 0;
        return;
      }
      d3 = Dlamch.dlamch("P");
      d4 = Dlamch.dlamch("S");
      localdoubleW2.val = (d4 / d3);
      localdoubleW1.val = (1.0D / localdoubleW2.val);
      Dlabad.dlabad(localdoubleW2, localdoubleW1);
      d1 = Dlange.dlange("M", paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, paramInt9);
      j = 0;
      if ((d1 <= 0.0D ? 0 : 1) != 0) {}
      if (((d1 >= localdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        Dlascl.dlascl("G", 0, 0, d1, localdoubleW2.val, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramintW2);
        j = 1;
      }
      else if ((d1 <= localdoubleW1.val ? 0 : 1) != 0)
      {
        Dlascl.dlascl("G", 0, 0, d1, localdoubleW1.val, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramintW2);
        j = 2;
      }
      else if ((d1 != 0.0D ? 0 : 1) != 0)
      {
        Dlaset.dlaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, paramInt6, paramInt7);
        Dlaset.dlaset("F", i7, 1, 0.0D, 0.0D, paramArrayOfDouble3, paramInt8, 1);
        paramintW1.val = 0;
        break label3006;
      }
      d2 = Dlange.dlange("M", paramInt1, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt9);
      k = 0;
      if ((d2 <= 0.0D ? 0 : 1) != 0) {}
      if (((d2 >= localdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        Dlascl.dlascl("G", 0, 0, d2, localdoubleW2.val, paramInt1, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
        k = 1;
      }
      else if ((d2 <= localdoubleW1.val ? 0 : 1) != 0)
      {
        Dlascl.dlascl("G", 0, 0, d2, localdoubleW1.val, paramInt1, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
        k = 2;
      }
      if ((paramInt1 >= paramInt2 ? 0 : 1) != 0) {
        Dlaset.dlaset("F", paramInt2 - paramInt1, paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, paramInt1 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
      if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
      {
        i9 = paramInt1;
        if ((paramInt1 < i10 ? 0 : 1) != 0)
        {
          i9 = paramInt2;
          i1 = 1;
          i12 = i1 + paramInt2;
          Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i1 - 1 + paramInt9, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
          Dormqr.dormqr("L", "T", paramInt1, paramInt3, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i1 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
          if ((paramInt2 <= 1 ? 0 : 1) != 0) {
            Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5);
          }
        }
        m = 1;
        i3 = m + paramInt2;
        i2 = i3 + paramInt2;
        i12 = i2 + paramInt2;
        Dgebrd.dgebrd(i9, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, m - 1 + paramInt9, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble4, i2 - 1 + paramInt9, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
        Dormbr.dormbr("Q", "L", "T", i9, paramInt3, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
        Dlalsd.dlalsd("U", i13, paramInt2, paramInt3, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, m - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramDouble, paramintW1, paramArrayOfDouble4, i12 - 1 + paramInt9, paramArrayOfInt, paramInt11, paramintW2);
        if ((paramintW2.val == 0 ? 0 : 1) != 0) {
          break label3006;
        }
        Dormbr.dormbr("P", "L", "N", paramInt2, paramInt3, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i2 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
      }
      else
      {
        if ((paramInt2 < i10 ? 0 : 1) != 0) {}
        if (((paramInt10 < 4 * paramInt1 + paramInt1 * paramInt1 + Math.max(Math.max(Util.max(paramInt1, 2 * paramInt1 - 4, paramInt3), paramInt2 - 3 * paramInt1), i14) ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          i4 = paramInt1;
          if ((paramInt10 < Util.max(4 * paramInt1 + paramInt1 * paramInt5 + Math.max(Util.max(paramInt1, 2 * paramInt1 - 4, paramInt3), paramInt2 - 3 * paramInt1), paramInt1 * paramInt5 + paramInt1 + paramInt1 * paramInt3, 4 * paramInt1 + paramInt1 * paramInt5 + i14) ? 0 : 1) != 0) {
            i4 = paramInt5;
          }
          i1 = 1;
          i12 = paramInt1 + 1;
          Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i1 - 1 + paramInt9, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
          n = i12;
          Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, n - 1 + paramInt9, i4);
          Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble4, n + i4 - 1 + paramInt9, i4);
          m = n + i4 * paramInt1;
          i3 = m + paramInt1;
          i2 = i3 + paramInt1;
          i12 = i2 + paramInt1;
          Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble4, n - 1 + paramInt9, i4, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, m - 1 + paramInt9, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble4, i2 - 1 + paramInt9, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
          Dormbr.dormbr("Q", "L", "T", paramInt1, paramInt3, paramInt1, paramArrayOfDouble4, n - 1 + paramInt9, i4, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
          Dlalsd.dlalsd("U", i13, paramInt1, paramInt3, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, m - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramDouble, paramintW1, paramArrayOfDouble4, i12 - 1 + paramInt9, paramArrayOfInt, paramInt11, paramintW2);
          if ((paramintW2.val == 0 ? 0 : 1) != 0) {
            break label3006;
          }
          Dormbr.dormbr("P", "L", "N", paramInt1, paramInt3, paramInt1, paramArrayOfDouble4, n - 1 + paramInt9, i4, paramArrayOfDouble4, i2 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
          Dlaset.dlaset("F", paramInt2 - paramInt1, paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, paramInt1 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          i12 = i1 + paramInt1;
          Dormlq.dormlq("L", "T", paramInt2, paramInt3, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i1 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
        }
        else
        {
          m = 1;
          i3 = m + paramInt1;
          i2 = i3 + paramInt1;
          i12 = i2 + paramInt1;
          Dgebrd.dgebrd(paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, m - 1 + paramInt9, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble4, i2 - 1 + paramInt9, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
          Dormbr.dormbr("Q", "L", "T", paramInt1, paramInt3, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
          Dlalsd.dlalsd("L", i13, paramInt1, paramInt3, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, m - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramDouble, paramintW1, paramArrayOfDouble4, i12 - 1 + paramInt9, paramArrayOfInt, paramInt11, paramintW2);
          if ((paramintW2.val == 0 ? 0 : 1) != 0) {
            break label3006;
          }
          Dormbr.dormbr("P", "L", "N", paramInt2, paramInt3, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i2 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i12 - 1 + paramInt9, paramInt10 - i12 + 1, paramintW2);
        }
      }
      if ((j != 1 ? 0 : 1) != 0)
      {
        Dlascl.dlascl("G", 0, 0, d1, localdoubleW2.val, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
        Dlascl.dlascl("G", 0, 0, localdoubleW2.val, d1, i7, 1, paramArrayOfDouble3, paramInt8, i7, paramintW2);
      }
      else if ((j != 2 ? 0 : 1) != 0)
      {
        Dlascl.dlascl("G", 0, 0, d1, localdoubleW1.val, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
        Dlascl.dlascl("G", 0, 0, localdoubleW1.val, d1, i7, 1, paramArrayOfDouble3, paramInt8, i7, paramintW2);
      }
      if ((k != 1 ? 0 : 1) != 0) {
        Dlascl.dlascl("G", 0, 0, localdoubleW2.val, d2, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
      } else if ((k != 2 ? 0 : 1) != 0) {
        Dlascl.dlascl("G", 0, 0, localdoubleW1.val, d2, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
      }
    }
    label3006:
    paramArrayOfDouble4[(1 - 1 + paramInt9)] = i6;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgelsd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */