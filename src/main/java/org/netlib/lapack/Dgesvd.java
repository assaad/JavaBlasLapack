package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Dgesvd
{
  public static void dgesvd(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, double[] paramArrayOfDouble5, int paramInt10, int paramInt11, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    int j = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    int k = 0;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool8 = false;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    intW localintW = new intW(0);
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
    int i21 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double[] arrayOfDouble = new double[1];
    paramintW.val = 0;
    i14 = Math.min(paramInt1, paramInt2);
    bool1 = Lsame.lsame(paramString1, "A");
    bool4 = Lsame.lsame(paramString1, "S");
    j = (!bool1) && (!bool4) ? 0 : 1;
    bool3 = Lsame.lsame(paramString1, "O");
    bool2 = Lsame.lsame(paramString1, "N");
    bool5 = Lsame.lsame(paramString2, "A");
    bool8 = Lsame.lsame(paramString2, "S");
    k = (!bool5) && (!bool8) ? 0 : 1;
    bool7 = Lsame.lsame(paramString2, "O");
    bool6 = Lsame.lsame(paramString2, "N");
    i = paramInt11 != -1 ? 0 : 1;
    if (((!bool1) && (!bool4) ? 0 : 1) == 0) {}
    if ((!bool3 ? 0 : 1) == 0) {}
    if (((!bool2 ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if (((!bool5) && (!bool8) ? 0 : 1) == 0) {}
      if ((!bool7 ? 0 : 1) == 0) {}
      if (((!bool6 ? 0 : 1) ^ 0x1) == 0) {}
      if ((((bool7) && (bool3) ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
      }
      else if ((paramInt1 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -3;
      }
      else if ((paramInt2 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -4;
      }
      else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -6;
      }
      else
      {
        if ((paramInt7 >= 1 ? 0 : 1) == 0) {
          if (j == 0) {}
        }
        if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -9;
        }
        else
        {
          if ((paramInt9 >= 1 ? 0 : 1) == 0) {
            if (!bool5) {}
          }
          if ((((paramInt9 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
            if (!bool8) {}
          }
          if ((((paramInt9 >= i14 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW.val = -11;
          }
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i15 = 1;
      i13 = 1;
      if ((paramInt1 < paramInt2 ? 0 : 1) != 0) {}
      if (((i14 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        i16 = Ilaenv.ilaenv(6, "DGESVD", paramString1 + paramString2, paramInt1, paramInt2, 0, 0);
        m = 5 * paramInt2;
        if ((paramInt1 < i16 ? 0 : 1) != 0)
        {
          if (bool2)
          {
            i13 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i13 = Math.max(i13, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            if (((!bool7) && (k == 0) ? 0 : 1) != 0) {
              i13 = Math.max(i13, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            }
            i13 = Math.max(i13, m);
            i15 = Math.max(4 * paramInt2, m);
          }
          else if (((bool3) && (bool6) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = Math.max(paramInt2 * paramInt2 + i21, paramInt2 * paramInt2 + paramInt1 * paramInt2 + paramInt2);
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool3) && (k != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = Math.max(paramInt2 * paramInt2 + i21, paramInt2 * paramInt2 + paramInt1 * paramInt2 + paramInt2);
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool4) && (bool6) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool4) && (bool7) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = 2 * paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool4) && (k != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool1) && (bool6) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt1, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool1) && (bool7) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt1, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = 2 * paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool1) && (k != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "DORGQR", " ", paramInt1, paramInt1, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
        }
        else
        {
          i13 = 3 * paramInt2 + (paramInt1 + paramInt2) * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt2, -1, -1);
          if (((!bool4) && (!bool3) ? 0 : 1) != 0) {
            i13 = Math.max(i13, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt1, paramInt2, paramInt2, -1));
          }
          if (bool1) {
            i13 = Math.max(i13, 3 * paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt1, paramInt1, paramInt2, -1));
          }
          if ((bool6 ^ true)) {
            i13 = Math.max(i13, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
          }
          i13 = Math.max(i13, m);
          i15 = Math.max(3 * paramInt2 + paramInt1, m);
        }
      }
      else if ((i14 <= 0 ? 0 : 1) != 0)
      {
        i16 = Ilaenv.ilaenv(6, "DGESVD", paramString1 + paramString2, paramInt1, paramInt2, 0, 0);
        m = 5 * paramInt1;
        if ((paramInt2 < i16 ? 0 : 1) != 0)
        {
          if (bool6)
          {
            i13 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i13 = Math.max(i13, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            if (((!bool3) && (j == 0) ? 0 : 1) != 0) {
              i13 = Math.max(i13, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            }
            i13 = Math.max(i13, m);
            i15 = Math.max(4 * paramInt1, m);
          }
          else if (((bool7) && (bool2) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = Math.max(paramInt1 * paramInt1 + i21, paramInt1 * paramInt1 + paramInt1 * paramInt2 + paramInt1);
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool7) && (j != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = Math.max(paramInt1 * paramInt1 + i21, paramInt1 * paramInt1 + paramInt1 * paramInt2 + paramInt1);
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool8) && (bool2) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool8) && (bool3) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = 2 * paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool8) && (j != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool5) && (bool2) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt2 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt2, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool5) && (bool3) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt2 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt2, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = 2 * paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool5) && (j != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt2 * Ilaenv.ilaenv(1, "DORGLQ", " ", paramInt2, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
        }
        else
        {
          i13 = 3 * paramInt1 + (paramInt1 + paramInt2) * Ilaenv.ilaenv(1, "DGEBRD", " ", paramInt1, paramInt2, -1, -1);
          if (((!bool8) && (!bool7) ? 0 : 1) != 0) {
            i13 = Math.max(i13, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt1, paramInt2, paramInt1, -1));
          }
          if (bool5) {
            i13 = Math.max(i13, 3 * paramInt1 + paramInt2 * Ilaenv.ilaenv(1, "DORGBR", "P", paramInt2, paramInt2, paramInt1, -1));
          }
          if ((bool2 ^ true)) {
            i13 = Math.max(i13, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "DORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
          }
          i13 = Math.max(i13, m);
          i15 = Math.max(3 * paramInt1 + paramInt2, m);
        }
      }
      i13 = Math.max(i13, i15);
      paramArrayOfDouble5[(1 - 1 + paramInt10)] = i13;
      if ((paramInt11 >= i15 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -13;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGESVD", -paramintW.val);
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
    int i22;
    if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
    {
      if ((paramInt1 < i16 ? 0 : 1) != 0)
      {
        if (bool2)
        {
          i6 = 1;
          i10 = i6 + paramInt2;
          Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          i3 = 1;
          i8 = i3 + paramInt2;
          i7 = i8 + paramInt2;
          i10 = i7 + paramInt2;
          Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i18 = 0;
          if (((!bool7) && (k == 0) ? 0 : 1) != 0)
          {
            Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i18 = paramInt2;
          }
          i10 = i3 + paramInt2;
          Dbdsqr.dbdsqr("U", paramInt2, i18, 0, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          if (k != 0) {
            Dlacpy.dlacpy("F", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
          }
        }
        else if (((bool3) && (bool6) ? 1 : 0) != 0)
        {
          if ((paramInt11 < paramInt2 * paramInt2 + Math.max(4 * paramInt2, m) ? 0 : 1) != 0)
          {
            i4 = 1;
            if ((paramInt11 < Math.max(i21, paramInt4 * paramInt2 + paramInt2) + paramInt4 * paramInt2 ? 0 : 1) != 0)
            {
              i12 = paramInt4;
              i11 = paramInt4;
            }
            else if ((paramInt11 < Math.max(i21, paramInt4 * paramInt2 + paramInt2) + paramInt2 * paramInt2 ? 0 : 1) != 0)
            {
              i12 = paramInt4;
              i11 = paramInt2;
            }
            else
            {
              i12 = (paramInt11 - paramInt2 * paramInt2 - paramInt2) / paramInt2;
              i11 = paramInt2;
            }
            i6 = i4 + i11 * paramInt2;
            i10 = i6 + paramInt2;
            Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
            Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i4 + 1 - 1 + paramInt10, i11);
            Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt2;
            i7 = i8 + paramInt2;
            i10 = i7 + paramInt2;
            Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt2;
            Dbdsqr.dbdsqr("U", paramInt2, 0, paramInt2, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, arrayOfDouble, 0, 1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            i9 = i3 + paramInt2;
            i2 = 1;
            for (i22 = (paramInt1 - 1 + i12) / i12; i22 > 0; i22--)
            {
              i1 = Math.min(paramInt1 - i2 + 1, i12);
              Dgemm.dgemm("N", "N", i1, paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, 0.0D, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
              Dlacpy.dlacpy("F", i1, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              i2 += i12;
            }
          }
          else
          {
            i3 = 1;
            i8 = i3 + paramInt2;
            i7 = i8 + paramInt2;
            i10 = i7 + paramInt2;
            Dgebrd.dgebrd(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("Q", paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt2;
            Dbdsqr.dbdsqr("U", paramInt2, 0, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, arrayOfDouble, 0, 1, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          }
        }
        else if (((bool3) && (k != 0) ? 1 : 0) != 0)
        {
          if ((paramInt11 < paramInt2 * paramInt2 + Math.max(4 * paramInt2, m) ? 0 : 1) != 0)
          {
            i4 = 1;
            if ((paramInt11 < Math.max(i21, paramInt4 * paramInt2 + paramInt2) + paramInt4 * paramInt2 ? 0 : 1) != 0)
            {
              i12 = paramInt4;
              i11 = paramInt4;
            }
            else if ((paramInt11 < Math.max(i21, paramInt4 * paramInt2 + paramInt2) + paramInt2 * paramInt2 ? 0 : 1) != 0)
            {
              i12 = paramInt4;
              i11 = paramInt2;
            }
            else
            {
              i12 = (paramInt11 - paramInt2 * paramInt2 - paramInt2) / paramInt2;
              i11 = paramInt2;
            }
            i6 = i4 + i11 * paramInt2;
            i10 = i6 + paramInt2;
            Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            if ((paramInt2 <= 1 ? 0 : 1) != 0) {
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble4, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
            }
            Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt2;
            i7 = i8 + paramInt2;
            i10 = i7 + paramInt2;
            Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
            Dorgbr.dorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt2;
            Dbdsqr.dbdsqr("U", paramInt2, paramInt2, paramInt2, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            i9 = i3 + paramInt2;
            i2 = 1;
            for (i22 = (paramInt1 - 1 + i12) / i12; i22 > 0; i22--)
            {
              i1 = Math.min(paramInt1 - i2 + 1, i12);
              Dgemm.dgemm("N", "N", i1, paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, 0.0D, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
              Dlacpy.dlacpy("F", i1, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              i2 += i12;
            }
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt2;
            Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            if ((paramInt2 <= 1 ? 0 : 1) != 0) {
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble4, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
            }
            Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt2;
            i7 = i8 + paramInt2;
            i10 = i7 + paramInt2;
            Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dormbr.dormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt2;
            Dbdsqr.dbdsqr("U", paramInt2, paramInt2, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          }
        }
        else if (bool4)
        {
          if (bool6)
          {
            if ((paramInt11 < paramInt2 * paramInt2 + Math.max(4 * paramInt2, m) ? 0 : 1) != 0)
            {
              i4 = 1;
              if ((paramInt11 < i21 + paramInt4 * paramInt2 ? 0 : 1) != 0) {
                i11 = paramInt4;
              } else {
                i11 = paramInt2;
              }
              i6 = i4 + i11 * paramInt2;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i4 + 1 - 1 + paramInt10, i11);
              Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dorgbr.dorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, 0, paramInt2, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, arrayOfDouble, 0, 1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
              Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, 0.0D, paramArrayOfDouble3, paramInt6, paramInt7);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
              Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dormbr.dormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, 0, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, arrayOfDouble, 0, 1, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            }
          }
          else if (bool7)
          {
            if ((paramInt11 < 2 * paramInt2 * paramInt2 + Math.max(4 * paramInt2, m) ? 0 : 1) != 0)
            {
              i9 = 1;
              if ((paramInt11 < i21 + 2 * paramInt4 * paramInt2 ? 0 : 1) != 0)
              {
                i12 = paramInt4;
                i4 = i9 + i12 * paramInt2;
                i11 = paramInt4;
              }
              else if ((paramInt11 < i21 + (paramInt4 + paramInt2) * paramInt2 ? 0 : 1) != 0)
              {
                i12 = paramInt4;
                i4 = i9 + i12 * paramInt2;
                i11 = paramInt2;
              }
              else
              {
                i12 = paramInt2;
                i4 = i9 + i12 * paramInt2;
                i11 = paramInt2;
              }
              i6 = i4 + i11 * paramInt2;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i9 + 1 - 1 + paramInt10, i12);
              Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
              Dorgbr.dorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, paramInt2, paramInt2, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
              Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, 0.0D, paramArrayOfDouble3, paramInt6, paramInt7);
              Dlacpy.dlacpy("F", paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble1, paramInt3, paramInt4);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
              Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dormbr.dormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, paramInt2, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            }
          }
          else if (k != 0) {
            if ((paramInt11 < paramInt2 * paramInt2 + Math.max(4 * paramInt2, m) ? 0 : 1) != 0)
            {
              i9 = 1;
              if ((paramInt11 < i21 + paramInt4 * paramInt2 ? 0 : 1) != 0) {
                i12 = paramInt4;
              } else {
                i12 = paramInt2;
              }
              i6 = i9 + i12 * paramInt2;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i9 + 1 - 1 + paramInt10, i12);
              Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble4, paramInt8, paramInt9);
              Dorgbr.dorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, paramInt2, paramInt2, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
              Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, 0.0D, paramArrayOfDouble3, paramInt6, paramInt7);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
              Dorgqr.dorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
              if ((paramInt2 <= 1 ? 0 : 1) != 0) {
                Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble4, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
              }
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dormbr.dormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, paramInt2, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            }
          }
        }
        else if (bool1)
        {
          if (bool6)
          {
            if ((paramInt11 < paramInt2 * paramInt2 + Util.max(paramInt2 + paramInt1, 4 * paramInt2, m) ? 0 : 1) != 0)
            {
              i4 = 1;
              if ((paramInt11 < i21 + paramInt4 * paramInt2 ? 0 : 1) != 0) {
                i11 = paramInt4;
              } else {
                i11 = paramInt2;
              }
              i6 = i4 + i11 * paramInt2;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i4 + 1 - 1 + paramInt10, i11);
              Dorgqr.dorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dorgbr.dorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, 0, paramInt2, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, arrayOfDouble, 0, 1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
              Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0D, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, 0.0D, paramArrayOfDouble1, paramInt3, paramInt4);
              Dlacpy.dlacpy("F", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
              Dorgqr.dorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dormbr.dormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, 0, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, arrayOfDouble, 0, 1, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            }
          }
          else if (bool7)
          {
            if ((paramInt11 < 2 * paramInt2 * paramInt2 + Util.max(paramInt2 + paramInt1, 4 * paramInt2, m) ? 0 : 1) != 0)
            {
              i9 = 1;
              if ((paramInt11 < i21 + 2 * paramInt4 * paramInt2 ? 0 : 1) != 0)
              {
                i12 = paramInt4;
                i4 = i9 + i12 * paramInt2;
                i11 = paramInt4;
              }
              else if ((paramInt11 < i21 + (paramInt4 + paramInt2) * paramInt2 ? 0 : 1) != 0)
              {
                i12 = paramInt4;
                i4 = i9 + i12 * paramInt2;
                i11 = paramInt2;
              }
              else
              {
                i12 = paramInt2;
                i4 = i9 + i12 * paramInt2;
                i11 = paramInt2;
              }
              i6 = i4 + i11 * paramInt2;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
              Dorgqr.dorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i9 + 1 - 1 + paramInt10, i12);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
              Dorgbr.dorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, paramInt2, paramInt2, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
              Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0D, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, 0.0D, paramArrayOfDouble1, paramInt3, paramInt4);
              Dlacpy.dlacpy("F", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
              Dlacpy.dlacpy("F", paramInt2, paramInt2, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble1, paramInt3, paramInt4);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
              Dorgqr.dorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dormbr.dormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, paramInt2, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            }
          }
          else if (k != 0) {
            if ((paramInt11 < paramInt2 * paramInt2 + Util.max(paramInt2 + paramInt1, 4 * paramInt2, m) ? 0 : 1) != 0)
            {
              i9 = 1;
              if ((paramInt11 < i21 + paramInt4 * paramInt2 ? 0 : 1) != 0) {
                i12 = paramInt4;
              } else {
                i12 = paramInt2;
              }
              i6 = i9 + i12 * paramInt2;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
              Dorgqr.dorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
              Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i9 + 1 - 1 + paramInt10, i12);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble4, paramInt8, paramInt9);
              Dorgbr.dorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, paramInt2, paramInt2, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
              Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0D, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, 0.0D, paramArrayOfDouble1, paramInt3, paramInt4);
              Dlacpy.dlacpy("F", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Dgeqrf.dgeqrf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
              Dorgqr.dorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
              if ((paramInt2 <= 1 ? 0 : 1) != 0) {
                Dlaset.dlaset("L", paramInt2 - 1, paramInt2 - 1, 0.0D, 0.0D, paramArrayOfDouble4, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
              }
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Dgebrd.dgebrd(paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dormbr.dormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Dbdsqr.dbdsqr("U", paramInt2, paramInt2, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            }
          }
        }
      }
      else
      {
        i3 = 1;
        i8 = i3 + paramInt2;
        i7 = i8 + paramInt2;
        i10 = i7 + paramInt2;
        Dgebrd.dgebrd(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        if (j != 0)
        {
          Dlacpy.dlacpy("L", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
          if (bool4) {
            i17 = paramInt2;
          }
          if (bool1) {
            i17 = paramInt1;
          }
          Dorgbr.dorgbr("Q", paramInt1, i17, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        }
        if (k != 0)
        {
          Dlacpy.dlacpy("U", paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
          Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        }
        if (bool3) {
          Dorgbr.dorgbr("Q", paramInt1, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        }
        if (bool7) {
          Dorgbr.dorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        }
        i10 = i3 + paramInt2;
        if (((j == 0) && (!bool3) ? 0 : 1) != 0) {
          i19 = paramInt1;
        }
        if (bool2) {
          i19 = 0;
        }
        if (((k == 0) && (!bool7) ? 0 : 1) != 0) {
          i18 = paramInt2;
        }
        if (bool6) {
          i18 = 0;
        }
        if ((((bool3 ^ true)) && ((bool7 ^ true)) ? 1 : 0) != 0) {
          Dbdsqr.dbdsqr("U", paramInt2, i18, i19, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
        } else if ((((bool3 ^ true)) && (bool7) ? 1 : 0) != 0) {
          Dbdsqr.dbdsqr("U", paramInt2, i18, i19, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
        } else {
          Dbdsqr.dbdsqr("U", paramInt2, i18, i19, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
        }
      }
    }
    else if ((paramInt2 < i16 ? 0 : 1) != 0)
    {
      if (bool6)
      {
        i6 = 1;
        i10 = i6 + paramInt1;
        Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
        i3 = 1;
        i8 = i3 + paramInt1;
        i7 = i8 + paramInt1;
        i10 = i7 + paramInt1;
        Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        if (((!bool3) && (j == 0) ? 0 : 1) != 0) {
          Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        }
        i10 = i3 + paramInt1;
        i19 = 0;
        if (((!bool3) && (j == 0) ? 0 : 1) != 0) {
          i19 = paramInt1;
        }
        Dbdsqr.dbdsqr("U", paramInt1, 0, i19, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, arrayOfDouble, 0, 1, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
        if (j != 0) {
          Dlacpy.dlacpy("F", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
        }
      }
      else if (((bool7) && (bool2) ? 1 : 0) != 0)
      {
        if ((paramInt11 < paramInt1 * paramInt1 + Math.max(4 * paramInt1, m) ? 0 : 1) != 0)
        {
          i4 = 1;
          if ((paramInt11 < Math.max(i21, paramInt4 * paramInt2 + paramInt1) + paramInt4 * paramInt1 ? 0 : 1) != 0)
          {
            i12 = paramInt4;
            i1 = paramInt2;
            i11 = paramInt4;
          }
          else if ((paramInt11 < Math.max(i21, paramInt4 * paramInt2 + paramInt1) + paramInt1 * paramInt1 ? 0 : 1) != 0)
          {
            i12 = paramInt4;
            i1 = paramInt2;
            i11 = paramInt1;
          }
          else
          {
            i12 = paramInt1;
            i1 = (paramInt11 - paramInt1 * paramInt1 - paramInt1) / paramInt1;
            i11 = paramInt1;
          }
          i6 = i4 + i11 * paramInt1;
          i10 = i6 + paramInt1;
          Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
          Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i4 + i11 - 1 + paramInt10, i11);
          Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i3 = i6;
          i8 = i3 + paramInt1;
          i7 = i8 + paramInt1;
          i10 = i7 + paramInt1;
          Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Dorgbr.dorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i10 = i3 + paramInt1;
          Dbdsqr.dbdsqr("U", paramInt1, paramInt1, 0, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          i9 = i3 + paramInt1;
          i2 = 1;
          for (i22 = (paramInt2 - 1 + i1) / i1; i22 > 0; i22--)
          {
            n = Math.min(paramInt2 - i2 + 1, i1);
            Dgemm.dgemm("N", "N", paramInt1, n, paramInt1, 1.0D, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, paramInt4, 0.0D, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
            Dlacpy.dlacpy("F", paramInt1, n, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, paramInt4);
            i2 += i1;
          }
        }
        else
        {
          i3 = 1;
          i8 = i3 + paramInt1;
          i7 = i8 + paramInt1;
          i10 = i7 + paramInt1;
          Dgebrd.dgebrd(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Dorgbr.dorgbr("P", paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i10 = i3 + paramInt1;
          Dbdsqr.dbdsqr("L", paramInt1, paramInt2, 0, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
        }
      }
      else if (((bool7) && (j != 0) ? 1 : 0) != 0)
      {
        if ((paramInt11 < paramInt1 * paramInt1 + Math.max(4 * paramInt1, m) ? 0 : 1) != 0)
        {
          i4 = 1;
          if ((paramInt11 < Math.max(i21, paramInt4 * paramInt2 + paramInt1) + paramInt4 * paramInt1 ? 0 : 1) != 0)
          {
            i12 = paramInt4;
            i1 = paramInt2;
            i11 = paramInt4;
          }
          else if ((paramInt11 < Math.max(i21, paramInt4 * paramInt2 + paramInt1) + paramInt1 * paramInt1 ? 0 : 1) != 0)
          {
            i12 = paramInt4;
            i1 = paramInt2;
            i11 = paramInt1;
          }
          else
          {
            i12 = paramInt1;
            i1 = (paramInt11 - paramInt1 * paramInt1 - paramInt1) / paramInt1;
            i11 = paramInt1;
          }
          i6 = i4 + i11 * paramInt1;
          i10 = i6 + paramInt1;
          Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
          Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble3, 1 - 1 + (2 - 1) * paramInt7 + paramInt6, paramInt7);
          Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i3 = i6;
          i8 = i3 + paramInt1;
          i7 = i8 + paramInt1;
          i10 = i7 + paramInt1;
          Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Dlacpy.dlacpy("U", paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
          Dorgbr.dorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i10 = i3 + paramInt1;
          Dbdsqr.dbdsqr("U", paramInt1, paramInt1, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          i9 = i3 + paramInt1;
          i2 = 1;
          for (i22 = (paramInt2 - 1 + i1) / i1; i22 > 0; i22--)
          {
            n = Math.min(paramInt2 - i2 + 1, i1);
            Dgemm.dgemm("N", "N", paramInt1, n, paramInt1, 1.0D, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, paramInt4, 0.0D, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
            Dlacpy.dlacpy("F", paramInt1, n, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, paramInt4);
            i2 += i1;
          }
        }
        else
        {
          i6 = 1;
          i10 = i6 + paramInt1;
          Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
          Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble3, 1 - 1 + (2 - 1) * paramInt7 + paramInt6, paramInt7);
          Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i3 = i6;
          i8 = i3 + paramInt1;
          i7 = i8 + paramInt1;
          i10 = i7 + paramInt1;
          Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Dormbr.dormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i10 = i3 + paramInt1;
          Dbdsqr.dbdsqr("U", paramInt1, paramInt2, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
        }
      }
      else if (bool8)
      {
        if (bool2)
        {
          if ((paramInt11 < paramInt1 * paramInt1 + Math.max(4 * paramInt1, m) ? 0 : 1) != 0)
          {
            i4 = 1;
            if ((paramInt11 < i21 + paramInt4 * paramInt1 ? 0 : 1) != 0) {
              i11 = paramInt4;
            } else {
              i11 = paramInt1;
            }
            i6 = i4 + i11 * paramInt1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i4 + i11 - 1 + paramInt10, i11);
            Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt1, 0, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0D, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble1, paramInt3, paramInt4, 0.0D, paramArrayOfDouble4, paramInt8, paramInt9);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dormbr.dormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt2, 0, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          }
        }
        else if (bool3)
        {
          if ((paramInt11 < 2 * paramInt1 * paramInt1 + Math.max(4 * paramInt1, m) ? 0 : 1) != 0)
          {
            i9 = 1;
            if ((paramInt11 < i21 + 2 * paramInt4 * paramInt1 ? 0 : 1) != 0)
            {
              i12 = paramInt4;
              i4 = i9 + i12 * paramInt1;
              i11 = paramInt4;
            }
            else if ((paramInt11 < i21 + (paramInt4 + paramInt1) * paramInt1 ? 0 : 1) != 0)
            {
              i12 = paramInt4;
              i4 = i9 + i12 * paramInt1;
              i11 = paramInt1;
            }
            else
            {
              i12 = paramInt1;
              i4 = i9 + i12 * paramInt1;
              i11 = paramInt1;
            }
            i6 = i4 + i11 * paramInt1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i9 + i12 - 1 + paramInt10, i12);
            Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
            Dorgbr.dorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt1, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0D, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble1, paramInt3, paramInt4, 0.0D, paramArrayOfDouble4, paramInt8, paramInt9);
            Dlacpy.dlacpy("F", paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble1, paramInt3, paramInt4);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dormbr.dormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt2, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          }
        }
        else if (j != 0) {
          if ((paramInt11 < paramInt1 * paramInt1 + Math.max(4 * paramInt1, m) ? 0 : 1) != 0)
          {
            i9 = 1;
            if ((paramInt11 < i21 + paramInt4 * paramInt1 ? 0 : 1) != 0) {
              i12 = paramInt4;
            } else {
              i12 = paramInt1;
            }
            i6 = i9 + i12 * paramInt1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i9 + i12 - 1 + paramInt10, i12);
            Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble3, paramInt6, paramInt7);
            Dorgbr.dorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt1, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0D, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble1, paramInt3, paramInt4, 0.0D, paramArrayOfDouble4, paramInt8, paramInt9);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            Dorglq.dorglq(paramInt1, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble3, 1 - 1 + (2 - 1) * paramInt7 + paramInt6, paramInt7);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dormbr.dormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt2, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          }
        }
      }
      else if (bool5)
      {
        if (bool2)
        {
          if ((paramInt11 < paramInt1 * paramInt1 + Util.max(paramInt2 + paramInt1, 4 * paramInt1, m) ? 0 : 1) != 0)
          {
            i4 = 1;
            if ((paramInt11 < i21 + paramInt4 * paramInt1 ? 0 : 1) != 0) {
              i11 = paramInt4;
            } else {
              i11 = paramInt1;
            }
            i6 = i4 + i11 * paramInt1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i4 + i11 - 1 + paramInt10, i11);
            Dorglq.dorglq(paramInt2, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt1, 0, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0D, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble4, paramInt8, paramInt9, 0.0D, paramArrayOfDouble1, paramInt3, paramInt4);
            Dlacpy.dlacpy("F", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            Dorglq.dorglq(paramInt2, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dormbr.dormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt2, 0, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, arrayOfDouble, 0, 1, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          }
        }
        else if (bool3)
        {
          if ((paramInt11 < 2 * paramInt1 * paramInt1 + Util.max(paramInt2 + paramInt1, 4 * paramInt1, m) ? 0 : 1) != 0)
          {
            i9 = 1;
            if ((paramInt11 < i21 + 2 * paramInt4 * paramInt1 ? 0 : 1) != 0)
            {
              i12 = paramInt4;
              i4 = i9 + i12 * paramInt1;
              i11 = paramInt4;
            }
            else if ((paramInt11 < i21 + (paramInt4 + paramInt1) * paramInt1 ? 0 : 1) != 0)
            {
              i12 = paramInt4;
              i4 = i9 + i12 * paramInt1;
              i11 = paramInt1;
            }
            else
            {
              i12 = paramInt1;
              i4 = i9 + i12 * paramInt1;
              i11 = paramInt1;
            }
            i6 = i4 + i11 * paramInt1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            Dorglq.dorglq(paramInt2, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i9 + i12 - 1 + paramInt10, i12);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i4 - 1 + paramInt10, i11);
            Dorgbr.dorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt1, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0D, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble4, paramInt8, paramInt9, 0.0D, paramArrayOfDouble1, paramInt3, paramInt4);
            Dlacpy.dlacpy("F", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            Dlacpy.dlacpy("F", paramInt1, paramInt1, paramArrayOfDouble5, i4 - 1 + paramInt10, i11, paramArrayOfDouble1, paramInt3, paramInt4);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            Dorglq.dorglq(paramInt2, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dormbr.dormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt2, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          }
        }
        else if (j != 0) {
          if ((paramInt11 < paramInt1 * paramInt1 + Util.max(paramInt2 + paramInt1, 4 * paramInt1, m) ? 0 : 1) != 0)
          {
            i9 = 1;
            if ((paramInt11 < i21 + paramInt4 * paramInt1 ? 0 : 1) != 0) {
              i12 = paramInt4;
            } else {
              i12 = paramInt1;
            }
            i6 = i9 + i12 * paramInt1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            Dorglq.dorglq(paramInt2, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i9 - 1 + paramInt10, i12);
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble5, i9 + i12 - 1 + paramInt10, i12);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble3, paramInt6, paramInt7);
            Dorgbr.dorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt1, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
            Dgemm.dgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0D, paramArrayOfDouble5, i9 - 1 + paramInt10, i12, paramArrayOfDouble4, paramInt8, paramInt9, 0.0D, paramArrayOfDouble1, paramInt3, paramInt4);
            Dlacpy.dlacpy("F", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Dgelqf.dgelqf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
            Dorglq.dorglq(paramInt2, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i6 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
            Dlaset.dlaset("U", paramInt1 - 1, paramInt1 - 1, 0.0D, 0.0D, paramArrayOfDouble3, 1 - 1 + (2 - 1) * paramInt7 + paramInt6, paramInt7);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Dgebrd.dgebrd(paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dormbr.dormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Dbdsqr.dbdsqr("U", paramInt1, paramInt2, paramInt1, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
          }
        }
      }
    }
    else
    {
      i3 = 1;
      i8 = i3 + paramInt1;
      i7 = i8 + paramInt1;
      i10 = i7 + paramInt1;
      Dgebrd.dgebrd(paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
      if (j != 0)
      {
        Dlacpy.dlacpy("L", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7);
        Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
      }
      if (k != 0)
      {
        Dlacpy.dlacpy("U", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt8, paramInt9);
        if (bool5) {
          i20 = paramInt2;
        }
        if (bool8) {
          i20 = paramInt1;
        }
        Dorgbr.dorgbr("P", i20, paramInt2, paramInt1, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
      }
      if (bool3) {
        Dorgbr.dorgbr("Q", paramInt1, paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i8 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
      }
      if (bool7) {
        Dorgbr.dorgbr("P", paramInt1, paramInt2, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble5, i7 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
      }
      i10 = i3 + paramInt1;
      if (((j == 0) && (!bool3) ? 0 : 1) != 0) {
        i19 = paramInt1;
      }
      if (bool2) {
        i19 = 0;
      }
      if (((k == 0) && (!bool7) ? 0 : 1) != 0) {
        i18 = paramInt2;
      }
      if (bool6) {
        i18 = 0;
      }
      if ((((bool3 ^ true)) && ((bool7 ^ true)) ? 1 : 0) != 0) {
        Dbdsqr.dbdsqr("L", paramInt1, i18, i19, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
      } else if ((((bool3 ^ true)) && (bool7) ? 1 : 0) != 0) {
        Dbdsqr.dbdsqr("L", paramInt1, i18, i19, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt6, paramInt7, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
      } else {
        Dbdsqr.dbdsqr("L", paramInt1, i18, i19, 0, paramArrayOfDouble2, paramInt5, paramArrayOfDouble5, i3 - 1 + paramInt10, paramArrayOfDouble4, paramInt8, paramInt9, paramArrayOfDouble1, paramInt3, paramInt4, arrayOfDouble, 0, 1, paramArrayOfDouble5, i10 - 1 + paramInt10, paramintW);
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      if ((i3 <= 2 ? 0 : 1) != 0)
      {
        i2 = 1;
        for (i22 = i14 - 1 - 1 + 1; i22 > 0; i22--)
        {
          paramArrayOfDouble5[(i2 + 1 - 1 + paramInt10)] = paramArrayOfDouble5[(i2 + i3 - 1 - 1 + paramInt10)];
          i2 += 1;
        }
      }
      if ((i3 >= 2 ? 0 : 1) != 0)
      {
        i2 = i14 - 1;
        for (i22 = (1 - (i14 - 1) + -1) / -1; i22 > 0; i22--)
        {
          paramArrayOfDouble5[(i2 + 1 - 1 + paramInt10)] = paramArrayOfDouble5[(i2 + i3 - 1 - 1 + paramInt10)];
          i2 += -1;
        }
      }
    }
    if ((i5 != 1 ? 0 : 1) != 0)
    {
      if ((d1 <= d2 ? 0 : 1) != 0) {
        Dlascl.dlascl("G", 0, 0, d2, d1, i14, 1, paramArrayOfDouble2, paramInt5, i14, localintW);
      }
      if ((paramintW.val == 0 ? 0 : 1) != 0) {}
      if (((d1 <= d2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        Dlascl.dlascl("G", 0, 0, d2, d1, i14 - 1, 1, paramArrayOfDouble5, 2 - 1 + paramInt10, i14, localintW);
      }
      if ((d1 >= d4 ? 0 : 1) != 0) {
        Dlascl.dlascl("G", 0, 0, d4, d1, i14, 1, paramArrayOfDouble2, paramInt5, i14, localintW);
      }
      if ((paramintW.val == 0 ? 0 : 1) != 0) {}
      if (((d1 >= d4 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        Dlascl.dlascl("G", 0, 0, d4, d1, i14 - 1, 1, paramArrayOfDouble5, 2 - 1 + paramInt10, i14, localintW);
      }
    }
    paramArrayOfDouble5[(1 - 1 + paramInt10)] = i13;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgesvd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */