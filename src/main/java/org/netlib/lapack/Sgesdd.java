package org.netlib.lapack;

import org.netlib.blas.Sgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sgesdd
{
  public static void sgesdd(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, int paramInt7, float[] paramArrayOfFloat4, int paramInt8, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, int[] paramArrayOfInt, int paramInt12, intW paramintW)
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
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    int[] arrayOfInt = new int[1];
    float[] arrayOfFloat = new float[1];
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
        i18 = (int)(i16 * 11.0F / 6.0F);
        if (bool2) {
          k = 7 * paramInt2;
        } else {
          k = 3 * paramInt2 * paramInt2 + 4 * paramInt2;
        }
        if ((paramInt1 < i18 ? 0 : 1) != 0)
        {
          if (bool2)
          {
            i20 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i15 = Math.max(i20, k + paramInt2);
            i17 = k + paramInt2;
          }
          else if (bool3)
          {
            i20 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, k + 3 * paramInt2);
            i15 = i20 + 2 * paramInt2 * paramInt2;
            i17 = k + 2 * paramInt2 * paramInt2 + 3 * paramInt2;
          }
          else if (bool4)
          {
            i20 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, k + 3 * paramInt2);
            i15 = i20 + paramInt2 * paramInt2;
            i17 = k + paramInt2 * paramInt2 + 3 * paramInt2;
          }
          else if (bool1)
          {
            i20 = paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "SORGQR", " ", paramInt1, paramInt1, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + 2 * paramInt2 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt2, paramInt2, -1, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, k + 3 * paramInt2);
            i15 = i20 + paramInt2 * paramInt2;
            i17 = k + paramInt2 * paramInt2 + 3 * paramInt2;
          }
        }
        else
        {
          i20 = 3 * paramInt2 + (paramInt1 + paramInt2) * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt2, -1, -1);
          if (bool2)
          {
            i15 = Math.max(i20, k + 3 * paramInt2);
            i17 = 3 * paramInt2 + Math.max(paramInt1, k);
          }
          else if (bool3)
          {
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt1, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, k + 3 * paramInt2);
            i15 = i20 + paramInt1 * paramInt2;
            i17 = 3 * paramInt2 + Math.max(paramInt1, paramInt2 * paramInt2 + k);
          }
          else if (bool4)
          {
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt1, paramInt2, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i15 = Math.max(i20, k + 3 * paramInt2);
            i17 = 3 * paramInt2 + Math.max(paramInt1, k);
          }
          else if (bool1)
          {
            i20 = Math.max(i20, 3 * paramInt2 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt1, paramInt1, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt2, paramInt2, paramInt2, -1));
            i15 = Math.max(i15, k + 3 * paramInt2);
            i17 = 3 * paramInt2 + Math.max(paramInt1, k);
          }
        }
      }
      else if ((i16 <= 0 ? 0 : 1) != 0)
      {
        i18 = (int)(i16 * 11.0F / 6.0F);
        if (bool2) {
          k = 7 * paramInt1;
        } else {
          k = 3 * paramInt1 * paramInt1 + 4 * paramInt1;
        }
        if ((paramInt2 < i18 ? 0 : 1) != 0)
        {
          if (bool2)
          {
            i20 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i15 = Math.max(i20, k + paramInt1);
            i17 = k + paramInt1;
          }
          else if (bool3)
          {
            i20 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, k + 3 * paramInt1);
            i15 = i20 + 2 * paramInt1 * paramInt1;
            i17 = k + 2 * paramInt1 * paramInt1 + 3 * paramInt1;
          }
          else if (bool4)
          {
            i20 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt1, paramInt2, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, k + 3 * paramInt1);
            i15 = i20 + paramInt1 * paramInt1;
            i17 = k + paramInt1 * paramInt1 + 3 * paramInt1;
          }
          else if (bool1)
          {
            i20 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i20 = Math.max(i20, paramInt1 + paramInt2 * Ilaenv.ilaenv(1, "SORGLQ", " ", paramInt2, paramInt2, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt1, paramInt1, paramInt1, -1));
            i20 = Math.max(i20, k + 3 * paramInt1);
            i15 = i20 + paramInt1 * paramInt1;
            i17 = k + paramInt1 * paramInt1 + 3 * paramInt1;
          }
        }
        else
        {
          i20 = 3 * paramInt1 + (paramInt1 + paramInt2) * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt2, -1, -1);
          if (bool2)
          {
            i15 = Math.max(i20, k + 3 * paramInt1);
            i17 = 3 * paramInt1 + Math.max(paramInt2, k);
          }
          else if (bool3)
          {
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt1, paramInt1, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt1, paramInt2, paramInt1, -1));
            i20 = Math.max(i20, k + 3 * paramInt1);
            i15 = i20 + paramInt1 * paramInt2;
            i17 = 3 * paramInt1 + Math.max(paramInt2, paramInt1 * paramInt1 + k);
          }
          else if (bool4)
          {
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt1, paramInt1, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt1, paramInt2, paramInt1, -1));
            i15 = Math.max(i20, k + 3 * paramInt1);
            i17 = 3 * paramInt1 + Math.max(paramInt2, k);
          }
          else if (bool1)
          {
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "QLN", paramInt1, paramInt1, paramInt2, -1));
            i20 = Math.max(i20, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "PRT", paramInt2, paramInt2, paramInt1, -1));
            i15 = Math.max(i20, k + 3 * paramInt1);
            i17 = 3 * paramInt1 + Math.max(paramInt2, k);
          }
        }
      }
      i15 = Math.max(i15, i17);
      paramArrayOfFloat5[(1 - 1 + paramInt10)] = i15;
      if ((paramInt11 >= i17 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -12;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGESDD", -paramintW.val);
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
    int i21;
    if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
    {
      if ((paramInt1 < i18 ? 0 : 1) != 0)
      {
        if (bool2)
        {
          i6 = 1;
          i19 = i6 + paramInt2;
          Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          i2 = 1;
          i8 = i2 + paramInt2;
          i7 = i8 + paramInt2;
          i19 = i7 + paramInt2;
          Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i19 = i2 + paramInt2;
          Sbdsdc.sbdsdc("U", "N", paramInt2, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
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
          Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i13);
          Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i4 + 1 - 1 + paramInt10, i13);
          Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i2 = i6;
          i8 = i2 + paramInt2;
          i7 = i8 + paramInt2;
          i19 = i7 + paramInt2;
          Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i13, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i9 = i19;
          i19 = i9 + paramInt2 * paramInt2;
          Sbdsdc.sbdsdc("U", "I", paramInt2, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i9 - 1 + paramInt10, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          Sormbr.sormbr("Q", "L", "N", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i13, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i9 - 1 + paramInt10, paramInt2, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Sormbr.sormbr("P", "R", "T", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i13, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i1 = 1;
          for (i21 = (paramInt1 - 1 + i13) / i13; i21 > 0; i21--)
          {
            n = Math.min(paramInt1 - i1 + 1, i13);
            Sgemm.sgemm("N", "N", n, paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, i1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, paramInt2, 0.0F, paramArrayOfFloat5, i4 - 1 + paramInt10, i13);
            Slacpy.slacpy("F", n, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i13, paramArrayOfFloat1, i1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
            i1 += i13;
          }
        }
        else if (bool4)
        {
          i4 = 1;
          i13 = paramInt2;
          i6 = i4 + i13 * paramInt2;
          i19 = i6 + paramInt2;
          Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Slacpy.slacpy("U", paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i13);
          Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i4 + 1 - 1 + paramInt10, i13);
          Sorgqr.sorgqr(paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i2 = i6;
          i8 = i2 + paramInt2;
          i7 = i8 + paramInt2;
          i19 = i7 + paramInt2;
          Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i13, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Sbdsdc.sbdsdc("U", "I", paramInt2, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          Sormbr.sormbr("Q", "L", "N", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i13, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Sormbr.sormbr("P", "R", "T", paramInt2, paramInt2, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i13, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Slacpy.slacpy("F", paramInt2, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i4 - 1 + paramInt10, i13);
          Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i4 - 1 + paramInt10, i13, 0.0F, paramArrayOfFloat3, paramInt6, paramInt7);
        }
        else if (bool1)
        {
          i9 = 1;
          i14 = paramInt2;
          i6 = i9 + i14 * paramInt2;
          i19 = i6 + paramInt2;
          Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Slacpy.slacpy("L", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
          Sorgqr.sorgqr(paramInt1, paramInt1, paramInt2, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
          i2 = i6;
          i8 = i2 + paramInt2;
          i7 = i8 + paramInt2;
          i19 = i7 + paramInt2;
          Sgebrd.sgebrd(paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Sbdsdc.sbdsdc("U", "I", paramInt2, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i9 - 1 + paramInt10, paramInt2, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          Sormbr.sormbr("Q", "L", "N", paramInt2, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i9 - 1 + paramInt10, i14, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Sormbr.sormbr("P", "R", "T", paramInt2, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt2, 1.0F, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i9 - 1 + paramInt10, i14, 0.0F, paramArrayOfFloat1, paramInt3, paramInt4);
          Slacpy.slacpy("F", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat3, paramInt6, paramInt7);
        }
      }
      else
      {
        i2 = 1;
        i8 = i2 + paramInt2;
        i7 = i8 + paramInt2;
        i19 = i7 + paramInt2;
        Sgebrd.sgebrd(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        if (bool2)
        {
          Sbdsdc.sbdsdc("U", "N", paramInt2, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        }
        else if (bool3)
        {
          i9 = i19;
          if ((paramInt11 < paramInt1 * paramInt2 + 3 * paramInt2 + k ? 0 : 1) != 0)
          {
            i14 = paramInt1;
            i19 = i9 + i14 * paramInt2;
            Slaset.slaset("F", paramInt1, paramInt2, 0.0F, 0.0F, paramArrayOfFloat5, i9 - 1 + paramInt10, i14);
          }
          else
          {
            i14 = paramInt2;
            i19 = i9 + i14 * paramInt2;
            i4 = i19;
            i13 = (paramInt11 - paramInt2 * paramInt2 - 3 * paramInt2) / paramInt2;
          }
          i19 = i9 + i14 * paramInt2;
          Sbdsdc.sbdsdc("U", "I", paramInt2, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i9 - 1 + paramInt10, i14, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          Sormbr.sormbr("P", "R", "T", paramInt2, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          if ((paramInt11 < paramInt1 * paramInt2 + 3 * paramInt2 + k ? 0 : 1) != 0)
          {
            Sormbr.sormbr("Q", "L", "N", paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i9 - 1 + paramInt10, i14, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
            Slacpy.slacpy("F", paramInt1, paramInt2, paramArrayOfFloat5, i9 - 1 + paramInt10, i14, paramArrayOfFloat1, paramInt3, paramInt4);
          }
          else
          {
            Sorgbr.sorgbr("Q", paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
            i1 = 1;
            for (i21 = (paramInt1 - 1 + i13) / i13; i21 > 0; i21--)
            {
              n = Math.min(paramInt1 - i1 + 1, i13);
              Sgemm.sgemm("N", "N", n, paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, i1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5, i9 - 1 + paramInt10, i14, 0.0F, paramArrayOfFloat5, i4 - 1 + paramInt10, i13);
              Slacpy.slacpy("F", n, paramInt2, paramArrayOfFloat5, i4 - 1 + paramInt10, i13, paramArrayOfFloat1, i1 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4);
              i1 += i13;
            }
          }
        }
        else if (bool4)
        {
          Slaset.slaset("F", paramInt1, paramInt2, 0.0F, 0.0F, paramArrayOfFloat3, paramInt6, paramInt7);
          Sbdsdc.sbdsdc("U", "I", paramInt2, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          Sormbr.sormbr("Q", "L", "N", paramInt1, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Sormbr.sormbr("P", "R", "T", paramInt2, paramInt2, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        }
        else if (bool1)
        {
          Slaset.slaset("F", paramInt1, paramInt1, 0.0F, 0.0F, paramArrayOfFloat3, paramInt6, paramInt7);
          Sbdsdc.sbdsdc("U", "I", paramInt2, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
          if ((paramInt1 <= paramInt2 ? 0 : 1) != 0) {
            Slaset.slaset("F", paramInt1 - paramInt2, paramInt1 - paramInt2, 0.0F, 1.0F, paramArrayOfFloat3, paramInt2 + 1 - 1 + (paramInt2 + 1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          Sormbr.sormbr("Q", "L", "N", paramInt1, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Sormbr.sormbr("P", "R", "T", paramInt2, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        }
      }
    }
    else if ((paramInt2 < i18 ? 0 : 1) != 0)
    {
      if (bool2)
      {
        i6 = 1;
        i19 = i6 + paramInt1;
        Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
        i2 = 1;
        i8 = i2 + paramInt1;
        i7 = i8 + paramInt1;
        i19 = i7 + paramInt1;
        Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        i19 = i2 + paramInt1;
        Sbdsdc.sbdsdc("U", "N", paramInt1, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
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
        Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i3 - 1 + paramInt10, i12);
        Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i3 + i12 - 1 + paramInt10, i12);
        Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        i2 = i6;
        i8 = i2 + paramInt1;
        i7 = i8 + paramInt1;
        i19 = i7 + paramInt1;
        Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat5, i3 - 1 + paramInt10, i12, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Sbdsdc.sbdsdc("U", "I", paramInt1, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt1, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        Sormbr.sormbr("Q", "L", "N", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i3 - 1 + paramInt10, i12, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Sormbr.sormbr("P", "R", "T", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i3 - 1 + paramInt10, i12, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt1, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        i1 = 1;
        for (i21 = (paramInt2 - 1 + n) / n; i21 > 0; i21--)
        {
          m = Math.min(paramInt2 - i1 + 1, n);
          Sgemm.sgemm("N", "N", paramInt1, m, paramInt1, 1.0F, paramArrayOfFloat5, i10 - 1 + paramInt10, paramInt1, paramArrayOfFloat1, 1 - 1 + (i1 - 1) * paramInt4 + paramInt3, paramInt4, 0.0F, paramArrayOfFloat5, i3 - 1 + paramInt10, i12);
          Slacpy.slacpy("F", paramInt1, m, paramArrayOfFloat5, i3 - 1 + paramInt10, i12, paramArrayOfFloat1, 1 - 1 + (i1 - 1) * paramInt4 + paramInt3, paramInt4);
          i1 += n;
        }
      }
      else if (bool4)
      {
        i3 = 1;
        i12 = paramInt1;
        i6 = i3 + i12 * paramInt1;
        i19 = i6 + paramInt1;
        Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i3 - 1 + paramInt10, i12);
        Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat5, i3 + i12 - 1 + paramInt10, i12);
        Sorglq.sorglq(paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        i2 = i6;
        i8 = i2 + paramInt1;
        i7 = i8 + paramInt1;
        i19 = i7 + paramInt1;
        Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat5, i3 - 1 + paramInt10, i12, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Sbdsdc.sbdsdc("U", "I", paramInt1, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        Sormbr.sormbr("Q", "L", "N", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i3 - 1 + paramInt10, i12, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Sormbr.sormbr("P", "R", "T", paramInt1, paramInt1, paramInt1, paramArrayOfFloat5, i3 - 1 + paramInt10, i12, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Slacpy.slacpy("F", paramInt1, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i3 - 1 + paramInt10, i12);
        Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0F, paramArrayOfFloat5, i3 - 1 + paramInt10, i12, paramArrayOfFloat1, paramInt3, paramInt4, 0.0F, paramArrayOfFloat4, paramInt8, paramInt9);
      }
      else if (bool1)
      {
        i10 = 1;
        i11 = paramInt1;
        i6 = i10 + i11 * paramInt1;
        i19 = i6 + paramInt1;
        Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Slacpy.slacpy("U", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
        Sorglq.sorglq(paramInt2, paramInt2, paramInt1, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i6 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4);
        i2 = i6;
        i8 = i2 + paramInt1;
        i7 = i8 + paramInt1;
        i19 = i7 + paramInt1;
        Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Sbdsdc.sbdsdc("U", "I", paramInt1, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i10 - 1 + paramInt10, i11, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        Sormbr.sormbr("Q", "L", "N", paramInt1, paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Sormbr.sormbr("P", "R", "T", paramInt1, paramInt1, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, i11, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Sgemm.sgemm("N", "N", paramInt1, paramInt2, paramInt1, 1.0F, paramArrayOfFloat5, i10 - 1 + paramInt10, i11, paramArrayOfFloat4, paramInt8, paramInt9, 0.0F, paramArrayOfFloat1, paramInt3, paramInt4);
        Slacpy.slacpy("F", paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat4, paramInt8, paramInt9);
      }
    }
    else
    {
      i2 = 1;
      i8 = i2 + paramInt1;
      i7 = i8 + paramInt1;
      i19 = i7 + paramInt1;
      Sgebrd.sgebrd(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
      if (bool2)
      {
        Sbdsdc.sbdsdc("L", "N", paramInt1, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, arrayOfFloat, 0, 1, arrayOfFloat, 0, 1, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
      }
      else if (bool3)
      {
        i11 = paramInt1;
        i10 = i19;
        if ((paramInt11 < paramInt1 * paramInt2 + 3 * paramInt1 + k ? 0 : 1) != 0)
        {
          Slaset.slaset("F", paramInt1, paramInt2, 0.0F, 0.0F, paramArrayOfFloat5, i10 - 1 + paramInt10, i11);
          i19 = i10 + i11 * paramInt2;
        }
        else
        {
          i19 = i10 + i11 * paramInt1;
          i3 = i19;
          n = (paramInt11 - paramInt1 * paramInt1 - 3 * paramInt1) / paramInt1;
        }
        Sbdsdc.sbdsdc("L", "I", paramInt1, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i10 - 1 + paramInt10, i11, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        Sormbr.sormbr("Q", "L", "N", paramInt1, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        if ((paramInt11 < paramInt1 * paramInt2 + 3 * paramInt1 + k ? 0 : 1) != 0)
        {
          Sormbr.sormbr("P", "R", "T", paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i10 - 1 + paramInt10, i11, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          Slacpy.slacpy("F", paramInt1, paramInt2, paramArrayOfFloat5, i10 - 1 + paramInt10, i11, paramArrayOfFloat1, paramInt3, paramInt4);
        }
        else
        {
          Sorgbr.sorgbr("P", paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
          i1 = 1;
          for (i21 = (paramInt2 - 1 + n) / n; i21 > 0; i21--)
          {
            m = Math.min(paramInt2 - i1 + 1, n);
            Sgemm.sgemm("N", "N", paramInt1, m, paramInt1, 1.0F, paramArrayOfFloat5, i10 - 1 + paramInt10, i11, paramArrayOfFloat1, 1 - 1 + (i1 - 1) * paramInt4 + paramInt3, paramInt4, 0.0F, paramArrayOfFloat5, i3 - 1 + paramInt10, paramInt1);
            Slacpy.slacpy("F", paramInt1, m, paramArrayOfFloat5, i3 - 1 + paramInt10, paramInt1, paramArrayOfFloat1, 1 - 1 + (i1 - 1) * paramInt4 + paramInt3, paramInt4);
            i1 += n;
          }
        }
      }
      else if (bool4)
      {
        Slaset.slaset("F", paramInt1, paramInt2, 0.0F, 0.0F, paramArrayOfFloat4, paramInt8, paramInt9);
        Sbdsdc.sbdsdc("L", "I", paramInt1, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        Sormbr.sormbr("Q", "L", "N", paramInt1, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Sormbr.sormbr("P", "R", "T", paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
      }
      else if (bool1)
      {
        Slaset.slaset("F", paramInt2, paramInt2, 0.0F, 0.0F, paramArrayOfFloat4, paramInt8, paramInt9);
        Sbdsdc.sbdsdc("L", "I", paramInt1, paramArrayOfFloat2, paramInt5, paramArrayOfFloat5, i2 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat4, paramInt8, paramInt9, arrayOfFloat, 0, arrayOfInt, 0, paramArrayOfFloat5, i19 - 1 + paramInt10, paramArrayOfInt, paramInt12, paramintW);
        if ((paramInt2 <= paramInt1 ? 0 : 1) != 0) {
          Slaset.slaset("F", paramInt2 - paramInt1, paramInt2 - paramInt1, 0.0F, 1.0F, paramArrayOfFloat4, paramInt1 + 1 - 1 + (paramInt1 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
        }
        Sormbr.sormbr("Q", "L", "N", paramInt1, paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i8 - 1 + paramInt10, paramArrayOfFloat3, paramInt6, paramInt7, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
        Sormbr.sormbr("P", "R", "T", paramInt2, paramInt2, paramInt1, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat5, i7 - 1 + paramInt10, paramArrayOfFloat4, paramInt8, paramInt9, paramArrayOfFloat5, i19 - 1 + paramInt10, paramInt11 - i19 + 1, localintW);
      }
    }
    if ((i5 != 1 ? 0 : 1) != 0)
    {
      if ((f1 <= f2 ? 0 : 1) != 0) {
        Slascl.slascl("G", 0, 0, f2, f1, i16, 1, paramArrayOfFloat2, paramInt5, i16, localintW);
      }
      if ((f1 >= f4 ? 0 : 1) != 0) {
        Slascl.slascl("G", 0, 0, f4, f1, i16, 1, paramArrayOfFloat2, paramInt5, i16, localintW);
      }
    }
    paramArrayOfFloat5[(1 - 1 + paramInt10)] = i15;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgesdd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */