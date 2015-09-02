package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Dgemv;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgelss
{
  public static void dgelss(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double paramDouble, intW paramintW1, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, intW paramintW2)
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
    int i15 = 0;
    double d1 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d5 = 0.0D;
    double[] arrayOfDouble = new double[1];
    paramintW2.val = 0;
    i12 = Math.min(paramInt1, paramInt2);
    i10 = Math.max(paramInt1, paramInt2);
    i = paramInt10 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -2;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -3;
    } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW2.val = -5;
    } else if ((paramInt7 >= Math.max(1, i10) ? 0 : 1) != 0) {
      paramintW2.val = -7;
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      i13 = 1;
      i11 = 1;
      if ((i12 <= 0 ? 0 : 1) != 0)
      {
        i14 = paramInt1;
        i15 = Ilaenv.ilaenv(6, "DGELSS", " ", paramInt1, paramInt2, paramInt3, -1);
        if ((paramInt1 < paramInt2 ? 0 : 1) != 0) {}
        if (((paramInt1 < i15 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          i14 = paramInt2;
          i11 = Math.max(i11, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1));
          i11 = Math.max(i11, paramInt2 + paramInt3 * Ilaenv.ilaenv(1, "DORMQR", "LT", paramInt1, paramInt3, paramInt2, -1));
        }
        if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
        {
          j = Math.max(1, 5 * paramInt2);
          i11 = Math.max(i11, 3 * paramInt2 + (i14 + paramInt2) * Ilaenv.ilaenv(1, "DGEBRD", " ", i14, paramInt2, -1, -1));
          i11 = Math.max(i11, 3 * paramInt2 + paramInt3 * Ilaenv.ilaenv(1, "DORMBR", "QLT", i14, paramInt3, paramInt2, -1));
          i11 = Math.max(i11, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
          i11 = Math.max(i11, j);
          i11 = Math.max(i11, paramInt2 * paramInt3);
          i13 = Util.max(3 * paramInt2 + i14, 3 * paramInt2 + paramInt3, j);
          i11 = Math.max(i13, i11);
        }
        if ((paramInt2 <= paramInt1 ? 0 : 1) != 0)
        {
          j = Math.max(1, 5 * paramInt1);
          i13 = Util.max(3 * paramInt1 + paramInt3, 3 * paramInt1 + paramInt2, j);
          if ((paramInt2 < i15 ? 0 : 1) != 0)
          {
            i11 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i11 = Math.max(i11, paramInt1 * paramInt1 + 4 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i11 = Math.max(i11, paramInt1 * paramInt1 + 4 * paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "DORMBR", "QLT", paramInt1, paramInt3, paramInt1, -1));
            i11 = Math.max(i11, paramInt1 * paramInt1 + 4 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i11 = Math.max(i11, paramInt1 * paramInt1 + paramInt1 + j);
            if ((paramInt3 <= 1 ? 0 : 1) != 0) {
              i11 = Math.max(i11, paramInt1 * paramInt1 + paramInt1 + paramInt1 * paramInt3);
            } else {
              i11 = Math.max(i11, paramInt1 * paramInt1 + 2 * paramInt1);
            }
            i11 = Math.max(i11, paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "DORMLQ", "LT", paramInt2, paramInt3, paramInt1, -1));
          }
          else
          {
            i11 = 3 * paramInt1 + (paramInt2 + paramInt1) * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt2, -1, -1);
            i11 = Math.max(i11, 3 * paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "DORMBR", "QLT", paramInt1, paramInt3, paramInt1, -1));
            i11 = Math.max(i11, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt2, paramInt1, -1));
            i11 = Math.max(i11, j);
            i11 = Math.max(i11, paramInt2 * paramInt3);
          }
        }
        i11 = Math.max(i13, i11);
      }
      paramArrayOfDouble4[(1 - 1 + paramInt9)] = i11;
      if ((paramInt10 >= i13 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -12;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGELSS", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
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
    i1 = 0;
    if ((d1 <= 0.0D ? 0 : 1) != 0) {}
    if (((d1 >= localdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d1, localdoubleW2.val, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramintW2);
      i1 = 1;
    }
    else if ((d1 <= localdoubleW1.val ? 0 : 1) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d1, localdoubleW1.val, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramintW2);
      i1 = 2;
    }
    else if ((d1 != 0.0D ? 0 : 1) != 0)
    {
      Dlaset.dlaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, paramInt6, paramInt7);
      Dlaset.dlaset("F", i12, 1, 0.0D, 0.0D, paramArrayOfDouble3, paramInt8, 1);
      paramintW1.val = 0;
      break label4306;
    }
    d2 = Dlange.dlange("M", paramInt1, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt9);
    i2 = 0;
    if ((d2 <= 0.0D ? 0 : 1) != 0) {}
    if (((d2 >= localdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d2, localdoubleW2.val, paramInt1, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
      i2 = 1;
    }
    else if ((d2 <= localdoubleW1.val ? 0 : 1) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d2, localdoubleW1.val, paramInt1, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
      i2 = 2;
    }
    int i16;
    if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
    {
      i14 = paramInt1;
      if ((paramInt1 < i15 ? 0 : 1) != 0)
      {
        i14 = paramInt2;
        i5 = 1;
        i8 = i5 + paramInt2;
        Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i5 - 1 + paramInt9, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        Dormqr.dormqr("L", "T", paramInt1, paramInt3, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i5 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5);
        }
      }
      i3 = 1;
      i7 = i3 + paramInt2;
      i6 = i7 + paramInt2;
      i8 = i6 + paramInt2;
      Dgebrd.dgebrd(i14, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble4, i7 - 1 + paramInt9, paramArrayOfDouble4, i6 - 1 + paramInt9, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
      Dormbr.dormbr("Q", "L", "T", i14, paramInt3, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i7 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
      Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i6 - 1 + paramInt9, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
      i8 = i3 + paramInt2;
      Dbdsqr.dbdsqr("U", paramInt2, paramInt2, 0, paramInt3, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble1, paramInt4, paramInt5, arrayOfDouble, 0, 1, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i8 - 1 + paramInt9, paramintW2);
      if ((paramintW2.val == 0 ? 0 : 1) != 0) {
        break label4306;
      }
      d5 = Math.max(paramDouble * paramArrayOfDouble3[(1 - 1 + paramInt8)], d4);
      if ((paramDouble >= 0.0D ? 0 : 1) != 0) {
        d5 = Math.max(d3 * paramArrayOfDouble3[(1 - 1 + paramInt8)], d4);
      }
      paramintW1.val = 0;
      n = 1;
      for (i16 = paramInt2 - 1 + 1; i16 > 0; i16--)
      {
        if ((paramArrayOfDouble3[(n - 1 + paramInt8)] <= d5 ? 0 : 1) != 0)
        {
          Drscl.drscl(paramInt3, paramArrayOfDouble3[(n - 1 + paramInt8)], paramArrayOfDouble2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          paramintW1.val += 1;
        }
        else
        {
          Dlaset.dlaset("F", 1, paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        }
        n += 1;
      }
      if ((paramInt10 < paramInt7 * paramInt3 ? 0 : 1) != 0) {}
      if (((paramInt3 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        Dgemm.dgemm("T", "N", paramInt2, paramInt3, paramInt2, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, paramInt9, paramInt7);
        Dlacpy.dlacpy("G", paramInt2, paramInt3, paramArrayOfDouble4, paramInt9, paramInt7, paramArrayOfDouble2, paramInt6, paramInt7);
      }
      else if ((paramInt3 <= 1 ? 0 : 1) != 0)
      {
        m = paramInt10 / paramInt2;
        n = 1;
        for (i16 = (paramInt3 - 1 + m) / m; i16 > 0; i16--)
        {
          k = Math.min(paramInt3 - n + 1, m);
          Dgemm.dgemm("T", "N", paramInt2, k, paramInt2, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, paramInt9, paramInt2);
          Dlacpy.dlacpy("G", paramInt2, k, paramArrayOfDouble4, paramInt9, paramInt2, paramArrayOfDouble2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7);
          n += m;
        }
      }
      else
      {
        Dgemv.dgemv("T", paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, 1, 0.0D, paramArrayOfDouble4, paramInt9, 1);
        Dcopy.dcopy(paramInt2, paramArrayOfDouble4, paramInt9, 1, paramArrayOfDouble2, paramInt6, 1);
      }
    }
    else
    {
      if ((paramInt2 < i15 ? 0 : 1) != 0) {}
      if (((paramInt10 < 4 * paramInt1 + paramInt1 * paramInt1 + Math.max(Util.max(paramInt1, 2 * paramInt1 - 4, paramInt3), paramInt2 - 3 * paramInt1) ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        i9 = paramInt1;
        if ((paramInt10 < Math.max(4 * paramInt1 + paramInt1 * paramInt5 + Math.max(Util.max(paramInt1, 2 * paramInt1 - 4, paramInt3), paramInt2 - 3 * paramInt1), paramInt1 * paramInt5 + paramInt1 + paramInt1 * paramInt3) ? 0 : 1) != 0) {
          i9 = paramInt5;
        }
        i5 = 1;
        i8 = paramInt1 + 1;
        Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i5 - 1 + paramInt9, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        i4 = i8;
        Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i4 - 1 + paramInt9, i9);
        Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble4, i4 + i9 - 1 + paramInt9, i9);
        i3 = i4 + i9 * paramInt1;
        i7 = i3 + paramInt1;
        i6 = i7 + paramInt1;
        i8 = i6 + paramInt1;
        Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble4, i4 - 1 + paramInt9, i9, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble4, i7 - 1 + paramInt9, paramArrayOfDouble4, i6 - 1 + paramInt9, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        Dormbr.dormbr("Q", "L", "T", paramInt1, paramInt3, paramInt1, paramArrayOfDouble4, i4 - 1 + paramInt9, i9, paramArrayOfDouble4, i7 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        Dorgbr.dorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfDouble4, i4 - 1 + paramInt9, i9, paramArrayOfDouble4, i6 - 1 + paramInt9, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        i8 = i3 + paramInt1;
        Dbdsqr.dbdsqr("U", paramInt1, paramInt1, 0, paramInt3, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble4, i4 - 1 + paramInt9, i9, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i8 - 1 + paramInt9, paramintW2);
        if ((paramintW2.val == 0 ? 0 : 1) != 0) {
          break label4306;
        }
        d5 = Math.max(paramDouble * paramArrayOfDouble3[(1 - 1 + paramInt8)], d4);
        if ((paramDouble >= 0.0D ? 0 : 1) != 0) {
          d5 = Math.max(d3 * paramArrayOfDouble3[(1 - 1 + paramInt8)], d4);
        }
        paramintW1.val = 0;
        n = 1;
        for (i16 = paramInt1 - 1 + 1; i16 > 0; i16--)
        {
          if ((paramArrayOfDouble3[(n - 1 + paramInt8)] <= d5 ? 0 : 1) != 0)
          {
            Drscl.drscl(paramInt3, paramArrayOfDouble3[(n - 1 + paramInt8)], paramArrayOfDouble2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            paramintW1.val += 1;
          }
          else
          {
            Dlaset.dlaset("F", 1, paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          n += 1;
        }
        i8 = i3;
        if ((paramInt10 < paramInt7 * paramInt3 + i8 - 1 ? 0 : 1) != 0) {}
        if (((paramInt3 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          Dgemm.dgemm("T", "N", paramInt1, paramInt3, paramInt1, 1.0D, paramArrayOfDouble4, i4 - 1 + paramInt9, i9, paramArrayOfDouble2, paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt7);
          Dlacpy.dlacpy("G", paramInt1, paramInt3, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt7, paramArrayOfDouble2, paramInt6, paramInt7);
        }
        else if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          m = (paramInt10 - i8 + 1) / paramInt1;
          n = 1;
          for (i16 = (paramInt3 - 1 + m) / m; i16 > 0; i16--)
          {
            k = Math.min(paramInt3 - n + 1, m);
            Dgemm.dgemm("T", "N", paramInt1, k, paramInt1, 1.0D, paramArrayOfDouble4, i4 - 1 + paramInt9, i9, paramArrayOfDouble2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt1);
            Dlacpy.dlacpy("G", paramInt1, k, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt1, paramArrayOfDouble2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7);
            n += m;
          }
        }
        else
        {
          Dgemv.dgemv("T", paramInt1, paramInt1, 1.0D, paramArrayOfDouble4, i4 - 1 + paramInt9, i9, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, 1, 0.0D, paramArrayOfDouble4, i8 - 1 + paramInt9, 1);
          Dcopy.dcopy(paramInt1, paramArrayOfDouble4, i8 - 1 + paramInt9, 1, paramArrayOfDouble2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, 1);
        }
        Dlaset.dlaset("F", paramInt2 - paramInt1, paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, paramInt1 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        i8 = i5 + paramInt1;
        Dormlq.dormlq("L", "T", paramInt2, paramInt3, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i5 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
      }
      else
      {
        i3 = 1;
        i7 = i3 + paramInt1;
        i6 = i7 + paramInt1;
        i8 = i6 + paramInt1;
        Dgebrd.dgebrd(paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble4, i7 - 1 + paramInt9, paramArrayOfDouble4, i6 - 1 + paramInt9, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        Dormbr.dormbr("Q", "L", "T", paramInt1, paramInt3, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i7 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        Dorgbr.dorgbr("P", paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble4, i6 - 1 + paramInt9, paramArrayOfDouble4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        i8 = i3 + paramInt1;
        Dbdsqr.dbdsqr("L", paramInt1, paramInt2, 0, paramInt3, paramArrayOfDouble3, paramInt8, paramArrayOfDouble4, i3 - 1 + paramInt9, paramArrayOfDouble1, paramInt4, paramInt5, arrayOfDouble, 0, 1, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, i8 - 1 + paramInt9, paramintW2);
        if ((paramintW2.val == 0 ? 0 : 1) != 0) {
          break label4306;
        }
        d5 = Math.max(paramDouble * paramArrayOfDouble3[(1 - 1 + paramInt8)], d4);
        if ((paramDouble >= 0.0D ? 0 : 1) != 0) {
          d5 = Math.max(d3 * paramArrayOfDouble3[(1 - 1 + paramInt8)], d4);
        }
        paramintW1.val = 0;
        n = 1;
        for (i16 = paramInt1 - 1 + 1; i16 > 0; i16--)
        {
          if ((paramArrayOfDouble3[(n - 1 + paramInt8)] <= d5 ? 0 : 1) != 0)
          {
            Drscl.drscl(paramInt3, paramArrayOfDouble3[(n - 1 + paramInt8)], paramArrayOfDouble2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            paramintW1.val += 1;
          }
          else
          {
            Dlaset.dlaset("F", 1, paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          n += 1;
        }
        if ((paramInt10 < paramInt7 * paramInt3 ? 0 : 1) != 0) {}
        if (((paramInt3 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          Dgemm.dgemm("T", "N", paramInt2, paramInt3, paramInt1, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, paramInt9, paramInt7);
          Dlacpy.dlacpy("F", paramInt2, paramInt3, paramArrayOfDouble4, paramInt9, paramInt7, paramArrayOfDouble2, paramInt6, paramInt7);
        }
        else if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          m = paramInt10 / paramInt2;
          n = 1;
          for (i16 = (paramInt3 - 1 + m) / m; i16 > 0; i16--)
          {
            k = Math.min(paramInt3 - n + 1, m);
            Dgemm.dgemm("T", "N", paramInt2, k, paramInt1, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, paramInt9, paramInt2);
            Dlacpy.dlacpy("F", paramInt2, k, paramArrayOfDouble4, paramInt9, paramInt2, paramArrayOfDouble2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7);
            n += m;
          }
        }
        else
        {
          Dgemv.dgemv("T", paramInt1, paramInt2, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, 1, 0.0D, paramArrayOfDouble4, paramInt9, 1);
          Dcopy.dcopy(paramInt2, paramArrayOfDouble4, paramInt9, 1, paramArrayOfDouble2, paramInt6, 1);
        }
      }
    }
    if ((i1 != 1 ? 0 : 1) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d1, localdoubleW2.val, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
      Dlascl.dlascl("G", 0, 0, localdoubleW2.val, d1, i12, 1, paramArrayOfDouble3, paramInt8, i12, paramintW2);
    }
    else if ((i1 != 2 ? 0 : 1) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d1, localdoubleW1.val, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
      Dlascl.dlascl("G", 0, 0, localdoubleW1.val, d1, i12, 1, paramArrayOfDouble3, paramInt8, i12, paramintW2);
    }
    if ((i2 != 1 ? 0 : 1) != 0) {
      Dlascl.dlascl("G", 0, 0, localdoubleW2.val, d2, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
    } else if ((i2 != 2 ? 0 : 1) != 0) {
      Dlascl.dlascl("G", 0, 0, localdoubleW1.val, d2, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
    }
    label4306:
    paramArrayOfDouble4[(1 - 1 + paramInt9)] = i11;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgelss.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */