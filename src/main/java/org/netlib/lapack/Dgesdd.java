package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dgesdd
{
  public static void dgesdd(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, int[] paramArrayOfInt, int paramInt12, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    int j = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    intW localintW = new intW(0);
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
    int i19 = 0;
    int i20 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    int[] arrayOfInt = new int[1];
    double[] arrayOfDouble = new double[1];
    paramintW.val = 0;
    i16 = Math.min(paramInt1, paramInt2);
    bool1 = Lsame.lsame(paramString, "A");
    bool4 = Lsame.lsame(paramString, "S");
    j = (!bool1) && (!bool4) ? 0 : 1;
    bool3 = Lsame.lsame(paramString, "O");
    bool2 = Lsame.lsame(paramString, "N");
    i = paramInt11 != -1 ? 0 : 1;
    if (((!bool1) && (!bool4) ? 0 : 1) == 0) {}
    if ((!bool3 ? 0 : 1) == 0) {}
    if (((!bool2 ? 0 : 1) ^ 0x1) != 0)
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
    else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else
    {
      if ((paramInt7 >= 1 ? 0 : 1) == 0) {
        if (j == 0) {}
      }
      if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0)
      {
        if (bool3) {}
        if (((paramInt1 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -8;
      }
      else
      {
        if ((paramInt9 >= 1 ? 0 : 1) == 0) {
          if (!bool1) {}
        }
        if ((((paramInt9 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
          if (!bool4) {}
        }
        if ((((paramInt9 >= i16 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0)
        {
          if (bool3) {}
          if (((paramInt1 < paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
        }
        if ((((paramInt9 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -10;
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i17 = 1;
      i15 = 1;
      if ((paramInt1 < paramInt2 ? 0 : 1) != 0) {}
      if (((i16 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        i18 = (int)(i16 * 11.0D / 6.0D);
        if (bool2) {
          k = 7 * paramInt2;
        } else {
          k = 3 * paramInt2 * paramInt2 + 4 * paramInt2;
        }
        if ((paramInt1 < i18 ? 0 : 1) != 0)
        {
          if (bool2)
          {
            i20 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i15 = Math.max(i20, k + paramInt2);
            i17 = k + paramInt2;
          }
          else if (bool3)
          {
            i20 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, k + 3 * paramInt2);
            i15 = i20 + 2 * paramInt2 * paramInt2;
            i17 = k + 2 * paramInt2 * paramInt2 + 3 * paramInt2;
          }
          else if (bool4)
          {
            i20 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, k + 3 * paramInt2);
            i15 = i20 + paramInt2 * paramInt2;
            i17 = k + paramInt2 * paramInt2 + 3 * paramInt2;
          }
          else if (bool1)
          {
            i20 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt1, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, k + 3 * paramInt2);
            i15 = i20 + paramInt2 * paramInt2;
            i17 = k + paramInt2 * paramInt2 + 3 * paramInt2;
          }
        }
        else
        {
          i20 = 3 * paramInt2 + (paramInt1 + paramInt2) * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt2, -1, -1);
          if (bool2)
          {
            i15 = Math.max(i20, k + 3 * paramInt2);
            i17 = 3 * paramInt2 + Math.max(paramInt1, k);
          }
          else if (bool3)
          {
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt1, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, k + 3 * paramInt2);
            i15 = i20 + paramInt1 * paramInt2;
            i17 = 3 * paramInt2 + Math.max(paramInt1, paramInt2 * paramInt2 + k);
          }
          else if (bool4)
          {
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt1, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i15 = Math.max(i20, k + 3 * paramInt2);
            i17 = 3 * paramInt2 + Math.max(paramInt1, k);
          }
          else if (bool1)
          {
            i20 = Math.max(i20, 3 * paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt1, paramInt1, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i15 = Math.max(i15, k + 3 * paramInt2);
            i17 = 3 * paramInt2 + Math.max(paramInt1, k);
          }
        }
      }
      else if ((i16 <= 0 ? 0 : 1) != 0)
      {
        i18 = (int)(i16 * 11.0D / 6.0D);
        if (bool2) {
          k = 7 * paramInt1;
        } else {
          k = 3 * paramInt1 * paramInt1 + 4 * paramInt1;
        }
        if ((paramInt2 < i18 ? 0 : 1) != 0)
        {
          if (bool2)
          {
            i20 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i15 = Math.max(i20, k + paramInt1);
            i17 = k + paramInt1;
          }
          else if (bool3)
          {
            i20 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, k + 3 * paramInt1);
            i15 = i20 + 2 * paramInt1 * paramInt1;
            i17 = k + 2 * paramInt1 * paramInt1 + 3 * paramInt1;
          }
          else if (bool4)
          {
            i20 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, k + 3 * paramInt1);
            i15 = i20 + paramInt1 * paramInt1;
            i17 = k + paramInt1 * paramInt1 + 3 * paramInt1;
          }
          else if (bool1)
          {
            i20 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt1 + paramInt2 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt2, paramInt2, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, k + 3 * paramInt1);
            i15 = i20 + paramInt1 * paramInt1;
            i17 = k + paramInt1 * paramInt1 + 3 * paramInt1;
          }
        }
        else
        {
          i20 = 3 * paramInt1 + (paramInt1 + paramInt2) * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt2, -1, -1);
          if (bool2)
          {
            i15 = Math.max(i20, k + 3 * paramInt1);
            i17 = 3 * paramInt1 + Math.max(paramInt2, k);
          }
          else if (bool3)
          {
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt1, paramInt1, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt1, paramInt2, paramInt1, -1));
            i20 = Math.max(i20, k + 3 * paramInt1);
            i15 = i20 + paramInt1 * paramInt2;
            i17 = 3 * paramInt1 + Math.max(paramInt2, paramInt1 * paramInt1 + k);
          }
          else if (bool4)
          {
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt1, paramInt1, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt1, paramInt2, paramInt1, -1));
            i15 = Math.max(i20, k + 3 * paramInt1);
            i17 = 3 * paramInt1 + Math.max(paramInt2, k);
          }
          else if (bool1)
          {
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "QLN", paramInt1, paramInt1, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORMBR", "PRT", paramInt2, paramInt2, paramInt1, -1));
            i15 = Math.max(i20, k + 3 * paramInt1);
            i17 = 3 * paramInt1 + Math.max(paramInt2, k);
          }
        }
      }
      i15 = Math.max(i15, i17);
      paramArrayOfDouble5[(1 - 1 + paramInt10)] = i15;
      if ((paramInt11 >= i17 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -12;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGESDD", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    d3 = Dlamch.dlamch("P");
    d4 = Math.sqrt(Dlamch.dlamch("S")) / d3;
    d2 = 1.0D / d4;
    d1 = Dlange.dlange("M", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble, 0);
    i5 = 0;
    if ((d1 <= 0.0D ? 0 : 1) != 0) {}
    if (((d1 >= d4 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i5 = 1;
      Dlascl.dlascl("G", 0, 0, d1, d4, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, localintW);
    }
    else if ((d1 <= d2 ? 0 : 1) != 0)
    {
      i5 = 1;
      Dlascl.dlascl("G", 0, 0, d1, d2, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, localintW);
    }
    int i21;
    if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
    {
      if ((paramInt1 < i18 ? 0 : 1) != 0)
      {
        if (bool2)
        {
          i6 = 1;
          i19 = i6 + paramInt2;
          Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          i2 = 1;
          i8 = i2 + paramInt2;
          i7 = i8 + paramInt2;
          i19 = i7 + paramInt2;
          Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i19 = i2 + paramInt2;
          Dbdsdc.dbdsdc("U", "N", paramInt2, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        }
        else if (bool3)
        {
          i4 = 1;
          if ((paramInt11 < paramInt4 * paramInt2 + paramInt2 * paramInt2 + 3 * paramInt2 + k ? 0 : 1) != 0) {
            i13 = paramInt4;
          } else {
            i13 = (paramInt11 - paramInt2 * paramInt2 - 3 * paramInt2 - k) / paramInt2;
          }
          i6 = i4 + i13 * paramInt2;
          i19 = i6 + paramInt2;
          Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i13);
          Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i4 + 1 - 1 + paramInt10, i13);
          Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i2 = i6;
          i8 = i2 + paramInt2;
          i7 = i8 + paramInt2;
          i19 = i7 + paramInt2;
          Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i13, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i9 = i19;
          i19 = i9 + paramInt2 * paramInt2;
          Dbdsdc.dbdsdc("U", "I", paramInt2, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i9 - 1 + paramInt10, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          Dormbr.dormbr("Q", "L", "N", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i13, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i9 - 1 + paramInt10, paramInt2, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dormbr.dormbr("P", "R", "T", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i13, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i1 = 1;
          for (i21 = (paramInt1 - 1 + i13) / i13; i21 > 0; i21--)
          {
            n = Math.min(paramInt1 - i1 + 1, i13);
            Dgemm.dgemm("N", "N", n, paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, i1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, paramInt2, 0.0D, paramArrayOfDouble5, i4 - 1 + paramInt10, i13);
            Dlacpy.dlacpy("F", n, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i13, paramArrayOfDouble1, i1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
            i1 += i13;
          }
        }
        else if (bool4)
        {
          i4 = 1;
          i13 = paramInt2;
          i6 = i4 + i13 * paramInt2;
          i19 = i6 + paramInt2;
          Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i13);
          Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i4 + 1 - 1 + paramInt10, i13);
          Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i2 = i6;
          i8 = i2 + paramInt2;
          i7 = i8 + paramInt2;
          i19 = i7 + paramInt2;
          Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i13, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dbdsdc.dbdsdc("U", "I", paramInt2, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          Dormbr.dormbr("Q", "L", "N", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i13, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dormbr.dormbr("P", "R", "T", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i13, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dlacpy.dlacpy("F", paramInt2, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i4 - 1 + paramInt10, i13);
          Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i13, 0.0D, paramArrayOfDouble3, paramInt6, paramInt7);
        }
        else if (bool1)
        {
          i9 = 1;
          i14 = paramInt2;
          i6 = i9 + i14 * paramInt2;
          i19 = i6 + paramInt2;
          Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
          Dorgqr.dorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          i2 = i6;
          i8 = i2 + paramInt2;
          i7 = i8 + paramInt2;
          i19 = i7 + paramInt2;
          Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dbdsdc.dbdsdc("U", "I", paramInt2, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i9 - 1 + paramInt10, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          Dormbr.dormbr("Q", "L", "N", paramInt2, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i9 - 1 + paramInt10, i14, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dormbr.dormbr("P", "R", "T", paramInt2, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0D, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i9 - 1 + paramInt10, i14, 0.0D, paramArrayOfDouble1, paramInt3, paramInt4);
          Dlacpy.dlacpy("F", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
        }
      }
      else
      {
        i2 = 1;
        i8 = i2 + paramInt2;
        i7 = i8 + paramInt2;
        i19 = i7 + paramInt2;
        Dgebrd.dgebrd(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        if (bool2)
        {
          Dbdsdc.dbdsdc("U", "N", paramInt2, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        }
        else if (bool3)
        {
          i9 = i19;
          if ((paramInt11 < paramInt1 * paramInt2 + 3 * paramInt2 + k ? 0 : 1) != 0)
          {
            i14 = paramInt1;
            i19 = i9 + i14 * paramInt2;
            Dlaset.dlaset("F", paramInt1, paramInt2, 0.0D, 0.0D, paramArrayOfDouble5, i9 - 1 + paramInt10, i14);
          }
          else
          {
            i14 = paramInt2;
            i19 = i9 + i14 * paramInt2;
            i4 = i19;
            i13 = (paramInt11 - paramInt2 * paramInt2 - 3 * paramInt2) / paramInt2;
          }
          i19 = i9 + i14 * paramInt2;
          Dbdsdc.dbdsdc("U", "I", paramInt2, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i9 - 1 + paramInt10, i14, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          Dormbr.dormbr("P", "R", "T", paramInt2, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          if ((paramInt11 < paramInt1 * paramInt2 + 3 * paramInt2 + k ? 0 : 1) != 0)
          {
            Dormbr.dormbr("Q", "L", "N", paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i9 - 1 + paramInt10, i14, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
            Dlacpy.dlacpy("F", paramInt1, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i14, paramArrayOfDouble1, paramInt3, paramInt4);
          }
          else
          {
            Dorgbr.dorgbr("Q", paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
            i1 = 1;
            for (i21 = (paramInt1 - 1 + i13) / i13; i21 > 0; i21--)
            {
              n = Math.min(paramInt1 - i1 + 1, i13);
              Dgemm.dgemm("N", "N", n, paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, i1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i14, 0.0D, paramArrayOfDouble5, i4 - 1 + paramInt10, i13);
              Dlacpy.dlacpy("F", n, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i13, paramArrayOfDouble1, i1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              i1 += i13;
            }
          }
        }
        else if (bool4)
        {
          Dlaset.dlaset("F", paramInt1, paramInt2, 0.0D, 0.0D, paramArrayOfDouble3, paramInt6, paramInt7);
          Dbdsdc.dbdsdc("U", "I", paramInt2, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          Dormbr.dormbr("Q", "L", "N", paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dormbr.dormbr("P", "R", "T", paramInt2, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        }
        else if (bool1)
        {
          Dlaset.dlaset("F", paramInt1, paramInt1, 0.0D, 0.0D, paramArrayOfDouble3, paramInt6, paramInt7);
          Dbdsdc.dbdsdc("U", "I", paramInt2, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          if ((paramInt1 <= paramInt2 ? 0 : 1) != 0) {
            Dlaset.dlaset("F", paramInt1 - paramInt2, paramInt1 - paramInt2, 0.0D, 1.0D, paramArrayOfDouble3, paramInt2 + 1 - 1 + (paramInt2 + 1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          Dormbr.dormbr("Q", "L", "N", paramInt1, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dormbr.dormbr("P", "R", "T", paramInt2, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        }
      }
    }
    else if ((paramInt2 < i18 ? 0 : 1) != 0)
    {
      if (bool2)
      {
        i6 = 1;
        i19 = i6 + paramInt1;
        Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
        i2 = 1;
        i8 = i2 + paramInt1;
        i7 = i8 + paramInt1;
        i19 = i7 + paramInt1;
        Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        i19 = i2 + paramInt1;
        Dbdsdc.dbdsdc("U", "N", paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
      }
      else if (bool3)
      {
        i10 = 1;
        i3 = i10 + paramInt1 * paramInt1;
        if ((paramInt11 < paramInt1 * paramInt2 + paramInt1 * paramInt1 + 3 * paramInt1 + k ? 0 : 1) != 0)
        {
          i12 = paramInt1;
          n = paramInt2;
        }
        else
        {
          i12 = paramInt1;
          n = (paramInt11 - paramInt1 * paramInt1) / paramInt1;
        }
        i6 = i3 + i12 * paramInt1;
        i19 = i6 + paramInt1;
        Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i3 - 1 + paramInt10, i12);
        Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i3 + i12 - 1 + paramInt10, i12);
        Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        i2 = i6;
        i8 = i2 + paramInt1;
        i7 = i8 + paramInt1;
        i19 = i7 + paramInt1;
        Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble5, i3 - 1 + paramInt10, i12, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dbdsdc.dbdsdc("U", "I", paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt1, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        Dormbr.dormbr("Q", "L", "N", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i3 - 1 + paramInt10, i12, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dormbr.dormbr("P", "R", "T", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i3 - 1 + paramInt10, i12, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt1, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        i1 = 1;
        for (i21 = (paramInt2 - 1 + n) / n; i21 > 0; i21--)
        {
          m = Math.min(paramInt2 - i1 + 1, n);
          Dgemm.dgemm("N", "N", paramInt1, m, paramInt1, 1.0D, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt1, paramArrayOfDouble1, 1 - 1 + (i1 - 1) * paramInt4 + paramInt3, paramInt4, 0.0D, paramArrayOfDouble5, i3 - 1 + paramInt10, i12);
          Dlacpy.dlacpy("F", paramInt1, m, paramArrayOfDouble5, i3 - 1 + paramInt10, i12, paramArrayOfDouble1, 1 - 1 + (i1 - 1) * paramInt4 + paramInt3, paramInt4);
          i1 += n;
        }
      }
      else if (bool4)
      {
        i3 = 1;
        i12 = paramInt1;
        i6 = i3 + i12 * paramInt1;
        i19 = i6 + paramInt1;
        Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i3 - 1 + paramInt10, i12);
        Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i3 + i12 - 1 + paramInt10, i12);
        Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        i2 = i6;
        i8 = i2 + paramInt1;
        i7 = i8 + paramInt1;
        i19 = i7 + paramInt1;
        Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble5, i3 - 1 + paramInt10, i12, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dbdsdc.dbdsdc("U", "I", paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        Dormbr.dormbr("Q", "L", "N", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i3 - 1 + paramInt10, i12, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dormbr.dormbr("P", "R", "T", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i3 - 1 + paramInt10, i12, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dlacpy.dlacpy("F", paramInt1, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i3 - 1 + paramInt10, i12);
        Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0D, paramArrayOfDouble5, i3 - 1 + paramInt10, i12, paramArrayOfDouble1, paramInt3, paramInt4, 0.0D, paramArrayOfDouble4, paramInt8, paramInt9);
      }
      else if (bool1)
      {
        i10 = 1;
        i11 = paramInt1;
        i6 = i10 + i11 * paramInt1;
        i19 = i6 + paramInt1;
        Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
        Dorglq.dorglq(paramInt2, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
        i2 = i6;
        i8 = i2 + paramInt1;
        i7 = i8 + paramInt1;
        i19 = i7 + paramInt1;
        Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dbdsdc.dbdsdc("U", "I", paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i10 - 1 + paramInt10, i11, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        Dormbr.dormbr("Q", "L", "N", paramInt1, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dormbr.dormbr("P", "R", "T", paramInt1, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, i11, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0D, paramArrayOfDouble5, i10 - 1 + paramInt10, i11, paramArrayOfDouble4, paramInt8, paramInt9, 0.0D, paramArrayOfDouble1, paramInt3, paramInt4);
        Dlacpy.dlacpy("F", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
      }
    }
    else
    {
      i2 = 1;
      i8 = i2 + paramInt1;
      i7 = i8 + paramInt1;
      i19 = i7 + paramInt1;
      Dgebrd.dgebrd(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
      if (bool2)
      {
        Dbdsdc.dbdsdc("L", "N", paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
      }
      else if (bool3)
      {
        i11 = paramInt1;
        i10 = i19;
        if ((paramInt11 < paramInt1 * paramInt2 + 3 * paramInt1 + k ? 0 : 1) != 0)
        {
          Dlaset.dlaset("F", paramInt1, paramInt2, 0.0D, 0.0D, paramArrayOfDouble5, i10 - 1 + paramInt10, i11);
          i19 = i10 + i11 * paramInt2;
        }
        else
        {
          i19 = i10 + i11 * paramInt1;
          i3 = i19;
          n = (paramInt11 - paramInt1 * paramInt1 - 3 * paramInt1) / paramInt1;
        }
        Dbdsdc.dbdsdc("L", "I", paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i10 - 1 + paramInt10, i11, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        Dormbr.dormbr("Q", "L", "N", paramInt1, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        if ((paramInt11 < paramInt1 * paramInt2 + 3 * paramInt1 + k ? 0 : 1) != 0)
        {
          Dormbr.dormbr("P", "R", "T", paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, i11, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Dlacpy.dlacpy("F", paramInt1, paramInt2, paramArrayOfDouble5, i10 - 1 + paramInt10, i11, paramArrayOfDouble1, paramInt3, paramInt4);
        }
        else
        {
          Dorgbr.dorgbr("P", paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i1 = 1;
          for (i21 = (paramInt2 - 1 + n) / n; i21 > 0; i21--)
          {
            m = Math.min(paramInt2 - i1 + 1, n);
            Dgemm.dgemm("N", "N", paramInt1, m, paramInt1, 1.0D, paramArrayOfDouble5, i10 - 1 + paramInt10, i11, paramArrayOfDouble1, 1 - 1 + (i1 - 1) * paramInt4 + paramInt3, paramInt4, 0.0D, paramArrayOfDouble5, i3 - 1 + paramInt10, paramInt1);
            Dlacpy.dlacpy("F", paramInt1, m, paramArrayOfDouble5, i3 - 1 + paramInt10, paramInt1, paramArrayOfDouble1, 1 - 1 + (i1 - 1) * paramInt4 + paramInt3, paramInt4);
            i1 += n;
          }
        }
      }
      else if (bool4)
      {
        Dlaset.dlaset("F", paramInt1, paramInt2, 0.0D, 0.0D, paramArrayOfDouble4, paramInt8, paramInt9);
        Dbdsdc.dbdsdc("L", "I", paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        Dormbr.dormbr("Q", "L", "N", paramInt1, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dormbr.dormbr("P", "R", "T", paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
      }
      else if (bool1)
      {
        Dlaset.dlaset("F", paramInt2, paramInt2, 0.0D, 0.0D, paramArrayOfDouble4, paramInt8, paramInt9);
        Dbdsdc.dbdsdc("L", "I", paramInt1, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i2 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, arrayOfInt, 0, paramArrayOfDouble5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        if ((paramInt2 <= paramInt1 ? 0 : 1) != 0) {
          Dlaset.dlaset("F", paramInt2 - paramInt1, paramInt2 - paramInt1, 0.0D, 1.0D, paramArrayOfDouble4, paramInt1 + 1 - 1 + (paramInt1 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
        }
        Dormbr.dormbr("Q", "L", "N", paramInt1, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Dormbr.dormbr("P", "R", "T", paramInt2, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
      }
    }
    if ((i5 != 1 ? 0 : 1) != 0)
    {
      if ((d1 <= d2 ? 0 : 1) != 0) {
        Dlascl.dlascl("G", 0, 0, d2, d1, i16, 1, paramArrayOfDouble2, paramInt5, i16, localintW);
      }
      if ((d1 >= d4 ? 0 : 1) != 0) {
        Dlascl.dlascl("G", 0, 0, d4, d1, i16, 1, paramArrayOfDouble2, paramInt5, i16, localintW);
      }
    }
    paramArrayOfDouble5[(1 - 1 + paramInt10)] = i15;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgesdd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */