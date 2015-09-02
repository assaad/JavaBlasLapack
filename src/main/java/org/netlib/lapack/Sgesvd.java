package org.netlib.lapack;

import org.netlib.blas.Sgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Sgesvd
{
  public static void sgesvd(String paramString1, String paramString2, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, intW paramintW)
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float[] arrayOfFloat = new float[1];
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
        i16 = Ilaenv.ilaenv(6, "SGESVD", paramString1 + paramString2, paramInt1, paramInt2, 0, 0);
        m = 5 * paramInt2;
        if ((paramInt1 < i16 ? 0 : 1) != 0)
        {
          if (bool2)
          {
            i13 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i13 = Math.max(i13, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            if (((!bool7) && (k == 0) ? 0 : 1) != 0) {
              i13 = Math.max(i13, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            }
            i13 = Math.max(i13, m);
            i15 = Math.max(4 * paramInt2, m);
          }
          else if (((bool3) && (bool6) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = Math.max(paramInt2 * paramInt2 + i21, paramInt2 * paramInt2 + paramInt1 * paramInt2 + paramInt2);
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool3) && (k != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = Math.max(paramInt2 * paramInt2 + i21, paramInt2 * paramInt2 + paramInt1 * paramInt2 + paramInt2);
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool4) && (bool6) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool4) && (bool7) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = 2 * paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool4) && (k != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool1) && (bool6) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt1, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool1) && (bool7) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt1, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = 2 * paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
          else if (((bool1) && (k != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt1, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i21 = Math.max(i21, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt2 * paramInt2 + i21;
            i15 = Math.max(3 * paramInt2 + paramInt1, m);
          }
        }
        else
        {
          i13 = 3 * paramInt2 + (paramInt1 + paramInt2) * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt2, -1, -1);
          if (((!bool4) && (!bool3) ? 0 : 1) != 0) {
            i13 = Math.max(i13, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt1, paramInt2, paramInt2, -1));
          }
          if (bool1) {
            i13 = Math.max(i13, 3 * paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt1, paramInt1, paramInt2, -1));
          }
          if ((bool6 ^ true)) {
            i13 = Math.max(i13, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
          }
          i13 = Math.max(i13, m);
          i15 = Math.max(3 * paramInt2 + paramInt1, m);
        }
      }
      else if ((i14 <= 0 ? 0 : 1) != 0)
      {
        i16 = Ilaenv.ilaenv(6, "SGESVD", paramString1 + paramString2, paramInt1, paramInt2, 0, 0);
        m = 5 * paramInt1;
        if ((paramInt2 < i16 ? 0 : 1) != 0)
        {
          if (bool6)
          {
            i13 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i13 = Math.max(i13, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            if (((!bool3) && (j == 0) ? 0 : 1) != 0) {
              i13 = Math.max(i13, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            }
            i13 = Math.max(i13, m);
            i15 = Math.max(4 * paramInt1, m);
          }
          else if (((bool7) && (bool2) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = Math.max(paramInt1 * paramInt1 + i21, paramInt1 * paramInt1 + paramInt1 * paramInt2 + paramInt1);
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool7) && (j != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = Math.max(paramInt1 * paramInt1 + i21, paramInt1 * paramInt1 + paramInt1 * paramInt2 + paramInt1);
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool8) && (bool2) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool8) && (bool3) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = 2 * paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
            i13 = Math.max(i13, i15);
          }
          else if (((bool8) && (j != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool5) && (bool2) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt2 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt2, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool5) && (bool3) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt2 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt2, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = 2 * paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
          else if (((bool5) && (j != 0) ? 1 : 0) != 0)
          {
            i21 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i21 = Math.max(i21, paramInt1 + paramInt2 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt2, paramInt2, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
            i21 = Math.max(i21, m);
            i13 = paramInt1 * paramInt1 + i21;
            i15 = Math.max(3 * paramInt1 + paramInt2, m);
          }
        }
        else
        {
          i13 = 3 * paramInt1 + (paramInt1 + paramInt2) * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt2, -1, -1);
          if (((!bool8) && (!bool7) ? 0 : 1) != 0) {
            i13 = Math.max(i13, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt2, paramInt1, -1));
          }
          if (bool5) {
            i13 = Math.max(i13, 3 * paramInt1 + paramInt2 * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt2, paramInt2, paramInt1, -1));
          }
          if ((bool2 ^ true)) {
            i13 = Math.max(i13, 3 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGBR", "Q", paramInt1, paramInt1, paramInt1, -1));
          }
          i13 = Math.max(i13, m);
          i15 = Math.max(3 * paramInt1 + paramInt2, m);
        }
      }
      i13 = Math.max(i13, i15);
      paramArrayOfFloat5[(1 - 1 + paramInt10)] = i13;
      if ((paramInt11 >= i15 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -13;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGESVD", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    f3 = Slamch.slamch("P");
    f4 = (float)Math.sqrt(Slamch.slamch("S")) / f3;
    f2 = 1.0F / f4;
    f1 = Slange.slange("M", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat, 0);
    i5 = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= f4 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i5 = 1;
      Slascl.slascl("G", 0, 0, f1, f4, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, localintW);
    }
    else if ((f1 <= f2 ? 0 : 1) != 0)
    {
      i5 = 1;
      Slascl.slascl("G", 0, 0, f1, f2, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, localintW);
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
          Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          i3 = 1;
          i8 = i3 + paramInt2;
          i7 = i8 + paramInt2;
          i10 = i7 + paramInt2;
          Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i18 = 0;
          if (((!bool7) && (k == 0) ? 0 : 1) != 0)
          {
            Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i18 = paramInt2;
          }
          i10 = i3 + paramInt2;
          Sbdsqr.sbdsqr("U", paramInt2, i18, 0, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
          if (k != 0) {
            Slacpy.slacpy("F", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
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
            Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
            Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i4 + 1 - 1 + paramInt10, i11);
            Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt2;
            i7 = i8 + paramInt2;
            i10 = i7 + paramInt2;
            Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt2;
            Sbdsqr.sbdsqr("U", paramInt2, 0, paramInt2, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, arrayOfFloat, 0, 1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
            i9 = i3 + paramInt2;
            i2 = 1;
            for (i22 = (paramInt1 - 1 + i12) / i12; i22 > 0; i22--)
            {
              i1 = Math.min(paramInt1 - i2 + 1, i12);
              Sgemm.sgemm("N", "N", i1, paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, 0.0F, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
              Slacpy.slacpy("F", i1, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              i2 += i12;
            }
          }
          else
          {
            i3 = 1;
            i8 = i3 + paramInt2;
            i7 = i8 + paramInt2;
            i10 = i7 + paramInt2;
            Sgebrd.sgebrd(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("Q", paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt2;
            Sbdsqr.sbdsqr("U", paramInt2, 0, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, arrayOfFloat, 0, 1, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
            Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            if ((paramInt2 <= 1 ? 0 : 1) != 0) {
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat4, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
            }
            Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt2;
            i7 = i8 + paramInt2;
            i10 = i7 + paramInt2;
            Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
            Sorgbr.sorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt2;
            Sbdsqr.sbdsqr("U", paramInt2, paramInt2, paramInt2, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
            i9 = i3 + paramInt2;
            i2 = 1;
            for (i22 = (paramInt1 - 1 + i12) / i12; i22 > 0; i22--)
            {
              i1 = Math.min(paramInt1 - i2 + 1, i12);
              Sgemm.sgemm("N", "N", i1, paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, 0.0F, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
              Slacpy.slacpy("F", i1, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat1, i2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              i2 += i12;
            }
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt2;
            Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            if ((paramInt2 <= 1 ? 0 : 1) != 0) {
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat4, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
            }
            Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt2;
            i7 = i8 + paramInt2;
            i10 = i7 + paramInt2;
            Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sormbr.sormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt2;
            Sbdsqr.sbdsqr("U", paramInt2, paramInt2, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i4 + 1 - 1 + paramInt10, i11);
              Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sorgbr.sorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, 0, paramInt2, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, arrayOfFloat, 0, 1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
              Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, 0.0F, paramArrayOfFloat3, paramInt6, paramInt7);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
              Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sormbr.sormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, 0, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, arrayOfFloat, 0, 1, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i9 + 1 - 1 + paramInt10, i12);
              Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
              Sorgbr.sorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, paramInt2, paramInt2, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
              Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, 0.0F, paramArrayOfFloat3, paramInt6, paramInt7);
              Slacpy.slacpy("F", paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat1, paramInt3, paramInt4);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
              Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sormbr.sormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, paramInt2, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i9 + 1 - 1 + paramInt10, i12);
              Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat4, paramInt8, paramInt9);
              Sorgbr.sorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, paramInt2, paramInt2, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
              Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, 0.0F, paramArrayOfFloat3, paramInt6, paramInt7);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
              Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
              if ((paramInt2 <= 1 ? 0 : 1) != 0) {
                Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat4, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
              }
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sormbr.sormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, paramInt2, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i4 + 1 - 1 + paramInt10, i11);
              Sorgqr.sorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sorgbr.sorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, 0, paramInt2, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, arrayOfFloat, 0, 1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
              Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0F, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, 0.0F, paramArrayOfFloat1, paramInt3, paramInt4);
              Slacpy.slacpy("F", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
              Sorgqr.sorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sormbr.sormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, 0, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, arrayOfFloat, 0, 1, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
              Sorgqr.sorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i9 + 1 - 1 + paramInt10, i12);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
              Sorgbr.sorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, paramInt2, paramInt2, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
              Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0F, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, 0.0F, paramArrayOfFloat1, paramInt3, paramInt4);
              Slacpy.slacpy("F", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
              Slacpy.slacpy("F", paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat1, paramInt3, paramInt4);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
              Sorgqr.sorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sormbr.sormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, paramInt2, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
              Sorgqr.sorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
              Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i9 + 1 - 1 + paramInt10, i12);
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat4, paramInt8, paramInt9);
              Sorgbr.sorgbr("Q", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, paramInt2, paramInt2, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
              Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0F, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, 0.0F, paramArrayOfFloat1, paramInt3, paramInt4);
              Slacpy.slacpy("F", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
            }
            else
            {
              i6 = 1;
              i10 = i6 + paramInt2;
              Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
              Sorgqr.sorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
              if ((paramInt2 <= 1 ? 0 : 1) != 0) {
                Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat4, 2 - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
              }
              i3 = i6;
              i8 = i3 + paramInt2;
              i7 = i8 + paramInt2;
              i10 = i7 + paramInt2;
              Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sormbr.sormbr("Q", "R", "N", paramInt1, paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
              i10 = i3 + paramInt2;
              Sbdsqr.sbdsqr("U", paramInt2, paramInt2, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
        Sgebrd.sgebrd(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        if (j != 0)
        {
          Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
          if (bool4) {
            i17 = paramInt2;
          }
          if (bool1) {
            i17 = paramInt1;
          }
          Sorgbr.sorgbr("Q", paramInt1, i17, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        }
        if (k != 0)
        {
          Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
          Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        }
        if (bool3) {
          Sorgbr.sorgbr("Q", paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        }
        if (bool7) {
          Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
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
          Sbdsqr.sbdsqr("U", paramInt2, i18, i19, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
        } else if ((((bool3 ^ true)) && (bool7) ? 1 : 0) != 0) {
          Sbdsqr.sbdsqr("U", paramInt2, i18, i19, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
        } else {
          Sbdsqr.sbdsqr("U", paramInt2, i18, i19, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
        }
      }
    }
    else if ((paramInt2 < i16 ? 0 : 1) != 0)
    {
      if (bool6)
      {
        i6 = 1;
        i10 = i6 + paramInt1;
        Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
        i3 = 1;
        i8 = i3 + paramInt1;
        i7 = i8 + paramInt1;
        i10 = i7 + paramInt1;
        Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        if (((!bool3) && (j == 0) ? 0 : 1) != 0) {
          Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
        }
        i10 = i3 + paramInt1;
        i19 = 0;
        if (((!bool3) && (j == 0) ? 0 : 1) != 0) {
          i19 = paramInt1;
        }
        Sbdsqr.sbdsqr("U", paramInt1, 0, i19, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, arrayOfFloat, 0, 1, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
        if (j != 0) {
          Slacpy.slacpy("F", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
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
          Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
          Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i4 + i11 - 1 + paramInt10, i11);
          Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i3 = i6;
          i8 = i3 + paramInt1;
          i7 = i8 + paramInt1;
          i10 = i7 + paramInt1;
          Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Sorgbr.sorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i10 = i3 + paramInt1;
          Sbdsqr.sbdsqr("U", paramInt1, paramInt1, 0, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
          i9 = i3 + paramInt1;
          i2 = 1;
          for (i22 = (paramInt2 - 1 + i1) / i1; i22 > 0; i22--)
          {
            n = Math.min(paramInt2 - i2 + 1, i1);
            Sgemm.sgemm("N", "N", paramInt1, n, paramInt1, 1.0F, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, paramInt4, 0.0F, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
            Slacpy.slacpy("F", paramInt1, n, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, paramInt4);
            i2 += i1;
          }
        }
        else
        {
          i3 = 1;
          i8 = i3 + paramInt1;
          i7 = i8 + paramInt1;
          i10 = i7 + paramInt1;
          Sgebrd.sgebrd(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Sorgbr.sorgbr("P", paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i10 = i3 + paramInt1;
          Sbdsqr.sbdsqr("L", paramInt1, paramInt2, 0, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
          Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
          Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat3, 1 - 1 + (2 - 1) * paramInt7 + paramInt6, paramInt7);
          Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i3 = i6;
          i8 = i3 + paramInt1;
          i7 = i8 + paramInt1;
          i10 = i7 + paramInt1;
          Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Slacpy.slacpy("U", paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
          Sorgbr.sorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i10 = i3 + paramInt1;
          Sbdsqr.sbdsqr("U", paramInt1, paramInt1, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
          i9 = i3 + paramInt1;
          i2 = 1;
          for (i22 = (paramInt2 - 1 + i1) / i1; i22 > 0; i22--)
          {
            n = Math.min(paramInt2 - i2 + 1, i1);
            Sgemm.sgemm("N", "N", paramInt1, n, paramInt1, 1.0F, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, paramInt4, 0.0F, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
            Slacpy.slacpy("F", paramInt1, n, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat1, 1 - 1 + (i2 - 1) * paramInt4 + paramInt3, paramInt4);
            i2 += i1;
          }
        }
        else
        {
          i6 = 1;
          i10 = i6 + paramInt1;
          Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
          Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat3, 1 - 1 + (2 - 1) * paramInt7 + paramInt6, paramInt7);
          Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i3 = i6;
          i8 = i3 + paramInt1;
          i7 = i8 + paramInt1;
          i10 = i7 + paramInt1;
          Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Sormbr.sormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
          i10 = i3 + paramInt1;
          Sbdsqr.sbdsqr("U", paramInt1, paramInt2, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i4 + i11 - 1 + paramInt10, i11);
            Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt1, 0, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
            Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0F, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat1, paramInt3, paramInt4, 0.0F, paramArrayOfFloat4, paramInt8, paramInt9);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sormbr.sormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt2, 0, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i9 + i12 - 1 + paramInt10, i12);
            Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
            Sorgbr.sorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt1, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
            Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0F, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat1, paramInt3, paramInt4, 0.0F, paramArrayOfFloat4, paramInt8, paramInt9);
            Slacpy.slacpy("F", paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat1, paramInt3, paramInt4);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sormbr.sormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt2, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i9 + i12 - 1 + paramInt10, i12);
            Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat3, paramInt6, paramInt7);
            Sorgbr.sorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt1, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
            Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0F, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat1, paramInt3, paramInt4, 0.0F, paramArrayOfFloat4, paramInt8, paramInt9);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat3, 1 - 1 + (2 - 1) * paramInt7 + paramInt6, paramInt7);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sormbr.sormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt2, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i4 + i11 - 1 + paramInt10, i11);
            Sorglq.sorglq(paramInt2, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt1, 0, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
            Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0F, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat4, paramInt8, paramInt9, 0.0F, paramArrayOfFloat1, paramInt3, paramInt4);
            Slacpy.slacpy("F", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            Sorglq.sorglq(paramInt2, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sormbr.sormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt2, 0, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            Sorglq.sorglq(paramInt2, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i9 + i12 - 1 + paramInt10, i12);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i4 - 1 + paramInt10, i11);
            Sorgbr.sorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt1, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
            Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0F, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat4, paramInt8, paramInt9, 0.0F, paramArrayOfFloat1, paramInt3, paramInt4);
            Slacpy.slacpy("F", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            Slacpy.slacpy("F", paramInt1, paramInt1, paramArrayOfFloat5, i4 - 1 + paramInt10, i11, paramArrayOfFloat1, paramInt3, paramInt4);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            Sorglq.sorglq(paramInt2, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sormbr.sormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt2, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            Sorglq.sorglq(paramInt2, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i12);
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i9 + i12 - 1 + paramInt10, i12);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat3, paramInt6, paramInt7);
            Sorgbr.sorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt1, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
            Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0F, paramArrayOfFloat5, i9 - 1 + paramInt10, i12, paramArrayOfFloat4, paramInt8, paramInt9, 0.0F, paramArrayOfFloat1, paramInt3, paramInt4);
            Slacpy.slacpy("F", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
          }
          else
          {
            i6 = 1;
            i10 = i6 + paramInt1;
            Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
            Sorglq.sorglq(paramInt2, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
            Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat3, 1 - 1 + (2 - 1) * paramInt7 + paramInt6, paramInt7);
            i3 = i6;
            i8 = i3 + paramInt1;
            i7 = i8 + paramInt1;
            i10 = i7 + paramInt1;
            Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sormbr.sormbr("P", "L", "T", paramInt1, paramInt2, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt1, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
            i10 = i3 + paramInt1;
            Sbdsqr.sbdsqr("U", paramInt1, paramInt2, paramInt1, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
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
      Sgebrd.sgebrd(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
      if (j != 0)
      {
        Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
        Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
      }
      if (k != 0)
      {
        Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
        if (bool5) {
          i20 = paramInt2;
        }
        if (bool8) {
          i20 = paramInt1;
        }
        Sorgbr.sorgbr("P", i20, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
      }
      if (bool3) {
        Sorgbr.sorgbr("Q", paramInt1, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
      }
      if (bool7) {
        Sorgbr.sorgbr("P", paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt11 - i10 + 1, localintW);
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
        Sbdsqr.sbdsqr("L", paramInt1, i18, i19, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
      } else if ((((bool3 ^ true)) && (bool7) ? 1 : 0) != 0) {
        Sbdsqr.sbdsqr("L", paramInt1, i18, i19, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
      } else {
        Sbdsqr.sbdsqr("L", paramInt1, i18, i19, 0, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i3 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat, 0, 1, paramArrayOfFloat5, i10 - 1 + paramInt10, paramintW);
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      if ((i3 <= 2 ? 0 : 1) != 0)
      {
        i2 = 1;
        for (i22 = i14 - 1 - 1 + 1; i22 > 0; i22--)
        {
          paramArrayOfFloat5[(i2 + 1 - 1 + paramInt10)] = paramArrayOfFloat5[(i2 + i3 - 1 - 1 + paramInt10)];
          i2 += 1;
        }
      }
      if ((i3 >= 2 ? 0 : 1) != 0)
      {
        i2 = i14 - 1;
        for (i22 = (1 - (i14 - 1) + -1) / -1; i22 > 0; i22--)
        {
          paramArrayOfFloat5[(i2 + 1 - 1 + paramInt10)] = paramArrayOfFloat5[(i2 + i3 - 1 - 1 + paramInt10)];
          i2 += -1;
        }
      }
    }
    if ((i5 != 1 ? 0 : 1) != 0)
    {
      if ((f1 <= f2 ? 0 : 1) != 0) {
        Slascl.slascl("G", 0, 0, f2, f1, i14, 1, paramArrayOfFloat2, paramInt5, i14, localintW);
      }
      if ((paramintW.val == 0 ? 0 : 1) != 0) {}
      if (((f1 <= f2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        Slascl.slascl("G", 0, 0, f2, f1, i14 - 1, 1, paramArrayOfFloat5, 2 - 1 + paramInt10, i14, localintW);
      }
      if ((f1 >= f4 ? 0 : 1) != 0) {
        Slascl.slascl("G", 0, 0, f4, f1, i14, 1, paramArrayOfFloat2, paramInt5, i14, localintW);
      }
      if ((paramintW.val == 0 ? 0 : 1) != 0) {}
      if (((f1 >= f4 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        Slascl.slascl("G", 0, 0, f4, f1, i14 - 1, 1, paramArrayOfFloat5, 2 - 1 + paramInt10, i14, localintW);
      }
    }
    paramArrayOfFloat5[(1 - 1 + paramInt10)] = i13;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgesvd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */