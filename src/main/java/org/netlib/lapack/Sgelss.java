package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.blas.Sgemv;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgelss
{
  public static void sgelss(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, float paramFloat, intW paramintW1, float[] paramArrayOfFloat4, int paramInt9, int paramInt10, intW paramintW2)
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
    float f1 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f5 = 0.0F;
    float[] arrayOfFloat = new float[1];
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
        i15 = Ilaenv.ilaenv(6, "SGELSS", " ", paramInt1, paramInt2, paramInt3, -1);
        if ((paramInt1 < paramInt2 ? 0 : 1) != 0) {}
        if (((paramInt1 < i15 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          i14 = paramInt2;
          i11 = Math.max(i11, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1));
          i11 = Math.max(i11, paramInt2 + paramInt3 * Ilaenv.ilaenv(1, "SORMQR", "LT", paramInt1, paramInt3, paramInt2, -1));
        }
        if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
        {
          j = Math.max(1, 5 * paramInt2);
          i11 = Math.max(i11, 3 * paramInt2 + (i14 + paramInt2) * Ilaenv.ilaenv(1, "SGEBRD", " ", i14, paramInt2, -1, -1));
          i11 = Math.max(i11, 3 * paramInt2 + paramInt3 * Ilaenv.ilaenv(1, "SORMBR", "QLT", i14, paramInt3, paramInt2, -1));
          i11 = Math.max(i11, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt2, paramInt2, paramInt2, -1));
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
            i11 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i11 = Math.max(i11, paramInt1 * paramInt1 + 4 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i11 = Math.max(i11, paramInt1 * paramInt1 + 4 * paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "SORMBR", "QLT", paramInt1, paramInt3, paramInt1, -1));
            i11 = Math.max(i11, paramInt1 * paramInt1 + 4 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt1, paramInt1, -1));
            i11 = Math.max(i11, paramInt1 * paramInt1 + paramInt1 + j);
            if ((paramInt3 <= 1 ? 0 : 1) != 0) {
              i11 = Math.max(i11, paramInt1 * paramInt1 + paramInt1 + paramInt1 * paramInt3);
            } else {
              i11 = Math.max(i11, paramInt1 * paramInt1 + 2 * paramInt1);
            }
            i11 = Math.max(i11, paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "SORMLQ", "LT", paramInt2, paramInt3, paramInt1, -1));
          }
          else
          {
            i11 = 3 * paramInt1 + (paramInt2 + paramInt1) * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt2, -1, -1);
            i11 = Math.max(i11, 3 * paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "SORMBR", "QLT", paramInt1, paramInt3, paramInt1, -1));
            i11 = Math.max(i11, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORGBR", "P", paramInt1, paramInt2, paramInt1, -1));
            i11 = Math.max(i11, j);
            i11 = Math.max(i11, paramInt2 * paramInt3);
          }
        }
        i11 = Math.max(i13, i11);
      }
      paramArrayOfFloat4[(1 - 1 + paramInt9)] = i11;
      if ((paramInt10 >= i13 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -12;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGELSS", -paramintW2.val);
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
    f3 = Slamch.slamch("P");
    f4 = Slamch.slamch("S");
    localfloatW2.val = (f4 / f3);
    localfloatW1.val = (1.0F / localfloatW2.val);
    Slabad.slabad(localfloatW2, localfloatW1);
    f1 = Slange.slange("M", paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, paramInt9);
    i1 = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= localfloatW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW2.val, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
      i1 = 1;
    }
    else if ((f1 <= localfloatW1.val ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW1.val, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
      i1 = 2;
    }
    else if ((f1 != 0.0F ? 0 : 1) != 0)
    {
      Slaset.slaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramInt6, paramInt7);
      Slaset.slaset("F", i12, 1, 0.0F, 0.0F, paramArrayOfFloat3, paramInt8, 1);
      paramintW1.val = 0;
      break label4306;
    }
    f2 = Slange.slange("M", paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt9);
    i2 = 0;
    if ((f2 <= 0.0F ? 0 : 1) != 0) {}
    if (((f2 >= localfloatW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Slascl.slascl("G", 0, 0, f2, localfloatW2.val, paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      i2 = 1;
    }
    else if ((f2 <= localfloatW1.val ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f2, localfloatW1.val, paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
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
        Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i5 - 1 + paramInt9, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        Sormqr.sormqr("L", "T", paramInt1, paramInt3, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i5 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5);
        }
      }
      i3 = 1;
      i7 = i3 + paramInt2;
      i6 = i7 + paramInt2;
      i8 = i6 + paramInt2;
      Sgebrd.sgebrd(i14, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat4, i7 - 1 + paramInt9, paramArrayOfFloat4, i6 - 1 + paramInt9, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
      Sormbr.sormbr("Q", "L", "T", i14, paramInt3, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i7 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
      Sorgbr.sorgbr("P", paramInt2, paramInt2, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i6 - 1 + paramInt9, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
      i8 = i3 + paramInt2;
      Sbdsqr.sbdsqr("U", paramInt2, paramInt2, 0, paramInt3, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat1, paramInt4, paramInt5, arrayOfFloat, 0, 1, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i8 - 1 + paramInt9, paramintW2);
      if ((paramintW2.val == 0 ? 0 : 1) != 0) {
        break label4306;
      }
      f5 = Math.max(paramFloat * paramArrayOfFloat3[(1 - 1 + paramInt8)], f4);
      if ((paramFloat >= 0.0F ? 0 : 1) != 0) {
        f5 = Math.max(f3 * paramArrayOfFloat3[(1 - 1 + paramInt8)], f4);
      }
      paramintW1.val = 0;
      n = 1;
      for (i16 = paramInt2 - 1 + 1; i16 > 0; i16--)
      {
        if ((paramArrayOfFloat3[(n - 1 + paramInt8)] <= f5 ? 0 : 1) != 0)
        {
          Srscl.srscl(paramInt3, paramArrayOfFloat3[(n - 1 + paramInt8)], paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          paramintW1.val += 1;
        }
        else
        {
          Slaset.slaset("F", 1, paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        }
        n += 1;
      }
      if ((paramInt10 < paramInt7 * paramInt3 ? 0 : 1) != 0) {}
      if (((paramInt3 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        Sgemm.sgemm("T", "N", paramInt2, paramInt3, paramInt2, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, paramInt9, paramInt7);
        Slacpy.slacpy("G", paramInt2, paramInt3, paramArrayOfFloat4, paramInt9, paramInt7, paramArrayOfFloat2, paramInt6, paramInt7);
      }
      else if ((paramInt3 <= 1 ? 0 : 1) != 0)
      {
        m = paramInt10 / paramInt2;
        n = 1;
        for (i16 = (paramInt3 - 1 + m) / m; i16 > 0; i16--)
        {
          k = Math.min(paramInt3 - n + 1, m);
          Sgemm.sgemm("T", "N", paramInt2, k, paramInt2, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, paramInt9, paramInt2);
          Slacpy.slacpy("G", paramInt2, k, paramArrayOfFloat4, paramInt9, paramInt2, paramArrayOfFloat2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7);
          n += m;
        }
      }
      else
      {
        Sgemv.sgemv("T", paramInt2, paramInt2, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, 1, 0.0F, paramArrayOfFloat4, paramInt9, 1);
        Scopy.scopy(paramInt2, paramArrayOfFloat4, paramInt9, 1, paramArrayOfFloat2, paramInt6, 1);
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
        Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i5 - 1 + paramInt9, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        i4 = i8;
        Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i4 - 1 + paramInt9, i9);
        Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat4, i4 + i9 - 1 + paramInt9, i9);
        i3 = i4 + i9 * paramInt1;
        i7 = i3 + paramInt1;
        i6 = i7 + paramInt1;
        i8 = i6 + paramInt1;
        Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat4, i4 - 1 + paramInt9, i9, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat4, i7 - 1 + paramInt9, paramArrayOfFloat4, i6 - 1 + paramInt9, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        Sormbr.sormbr("Q", "L", "T", paramInt1, paramInt3, paramInt1, paramArrayOfFloat4, i4 - 1 + paramInt9, i9, paramArrayOfFloat4, i7 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        Sorgbr.sorgbr("P", paramInt1, paramInt1, paramInt1, paramArrayOfFloat4, i4 - 1 + paramInt9, i9, paramArrayOfFloat4, i6 - 1 + paramInt9, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        i8 = i3 + paramInt1;
        Sbdsqr.sbdsqr("U", paramInt1, paramInt1, 0, paramInt3, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat4, i4 - 1 + paramInt9, i9, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i8 - 1 + paramInt9, paramintW2);
        if ((paramintW2.val == 0 ? 0 : 1) != 0) {
          break label4306;
        }
        f5 = Math.max(paramFloat * paramArrayOfFloat3[(1 - 1 + paramInt8)], f4);
        if ((paramFloat >= 0.0F ? 0 : 1) != 0) {
          f5 = Math.max(f3 * paramArrayOfFloat3[(1 - 1 + paramInt8)], f4);
        }
        paramintW1.val = 0;
        n = 1;
        for (i16 = paramInt1 - 1 + 1; i16 > 0; i16--)
        {
          if ((paramArrayOfFloat3[(n - 1 + paramInt8)] <= f5 ? 0 : 1) != 0)
          {
            Srscl.srscl(paramInt3, paramArrayOfFloat3[(n - 1 + paramInt8)], paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            paramintW1.val += 1;
          }
          else
          {
            Slaset.slaset("F", 1, paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          n += 1;
        }
        i8 = i3;
        if ((paramInt10 < paramInt7 * paramInt3 + i8 - 1 ? 0 : 1) != 0) {}
        if (((paramInt3 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          Sgemm.sgemm("T", "N", paramInt1, paramInt3, paramInt1, 1.0F, paramArrayOfFloat4, i4 - 1 + paramInt9, i9, paramArrayOfFloat2, paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt7);
          Slacpy.slacpy("G", paramInt1, paramInt3, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt7, paramArrayOfFloat2, paramInt6, paramInt7);
        }
        else if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          m = (paramInt10 - i8 + 1) / paramInt1;
          n = 1;
          for (i16 = (paramInt3 - 1 + m) / m; i16 > 0; i16--)
          {
            k = Math.min(paramInt3 - n + 1, m);
            Sgemm.sgemm("T", "N", paramInt1, k, paramInt1, 1.0F, paramArrayOfFloat4, i4 - 1 + paramInt9, i9, paramArrayOfFloat2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt1);
            Slacpy.slacpy("G", paramInt1, k, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt1, paramArrayOfFloat2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7);
            n += m;
          }
        }
        else
        {
          Sgemv.sgemv("T", paramInt1, paramInt1, 1.0F, paramArrayOfFloat4, i4 - 1 + paramInt9, i9, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, 1, 0.0F, paramArrayOfFloat4, i8 - 1 + paramInt9, 1);
          Scopy.scopy(paramInt1, paramArrayOfFloat4, i8 - 1 + paramInt9, 1, paramArrayOfFloat2, 1 - 1 + (1 - 1) * paramInt7 + paramInt6, 1);
        }
        Slaset.slaset("F", paramInt2 - paramInt1, paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramInt1 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        i8 = i5 + paramInt1;
        Sormlq.sormlq("L", "T", paramInt2, paramInt3, paramInt1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i5 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
      }
      else
      {
        i3 = 1;
        i7 = i3 + paramInt1;
        i6 = i7 + paramInt1;
        i8 = i6 + paramInt1;
        Sgebrd.sgebrd(paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat4, i7 - 1 + paramInt9, paramArrayOfFloat4, i6 - 1 + paramInt9, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        Sormbr.sormbr("Q", "L", "T", paramInt1, paramInt3, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i7 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        Sorgbr.sorgbr("P", paramInt1, paramInt2, paramInt1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i6 - 1 + paramInt9, paramArrayOfFloat4, i8 - 1 + paramInt9, paramInt10 - i8 + 1, paramintW2);
        i8 = i3 + paramInt1;
        Sbdsqr.sbdsqr("L", paramInt1, paramInt2, 0, paramInt3, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat1, paramInt4, paramInt5, arrayOfFloat, 0, 1, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i8 - 1 + paramInt9, paramintW2);
        if ((paramintW2.val == 0 ? 0 : 1) != 0) {
          break label4306;
        }
        f5 = Math.max(paramFloat * paramArrayOfFloat3[(1 - 1 + paramInt8)], f4);
        if ((paramFloat >= 0.0F ? 0 : 1) != 0) {
          f5 = Math.max(f3 * paramArrayOfFloat3[(1 - 1 + paramInt8)], f4);
        }
        paramintW1.val = 0;
        n = 1;
        for (i16 = paramInt1 - 1 + 1; i16 > 0; i16--)
        {
          if ((paramArrayOfFloat3[(n - 1 + paramInt8)] <= f5 ? 0 : 1) != 0)
          {
            Srscl.srscl(paramInt3, paramArrayOfFloat3[(n - 1 + paramInt8)], paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
            paramintW1.val += 1;
          }
          else
          {
            Slaset.slaset("F", 1, paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, n - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
          }
          n += 1;
        }
        if ((paramInt10 < paramInt7 * paramInt3 ? 0 : 1) != 0) {}
        if (((paramInt3 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          Sgemm.sgemm("T", "N", paramInt2, paramInt3, paramInt1, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, paramInt9, paramInt7);
          Slacpy.slacpy("F", paramInt2, paramInt3, paramArrayOfFloat4, paramInt9, paramInt7, paramArrayOfFloat2, paramInt6, paramInt7);
        }
        else if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          m = paramInt10 / paramInt2;
          n = 1;
          for (i16 = (paramInt3 - 1 + m) / m; i16 > 0; i16--)
          {
            k = Math.min(paramInt3 - n + 1, m);
            Sgemm.sgemm("T", "N", paramInt2, k, paramInt1, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7, 0.0F, paramArrayOfFloat4, paramInt9, paramInt2);
            Slacpy.slacpy("F", paramInt2, k, paramArrayOfFloat4, paramInt9, paramInt2, paramArrayOfFloat2, 1 - 1 + (n - 1) * paramInt7 + paramInt6, paramInt7);
            n += m;
          }
        }
        else
        {
          Sgemv.sgemv("T", paramInt1, paramInt2, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, 1, 0.0F, paramArrayOfFloat4, paramInt9, 1);
          Scopy.scopy(paramInt2, paramArrayOfFloat4, paramInt9, 1, paramArrayOfFloat2, paramInt6, 1);
        }
      }
    }
    if ((i1 != 1 ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW2.val, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      Slascl.slascl("G", 0, 0, localfloatW2.val, f1, i12, 1, paramArrayOfFloat3, paramInt8, i12, paramintW2);
    }
    else if ((i1 != 2 ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW1.val, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      Slascl.slascl("G", 0, 0, localfloatW1.val, f1, i12, 1, paramArrayOfFloat3, paramInt8, i12, paramintW2);
    }
    if ((i2 != 1 ? 0 : 1) != 0) {
      Slascl.slascl("G", 0, 0, localfloatW2.val, f2, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
    } else if ((i2 != 2 ? 0 : 1) != 0) {
      Slascl.slascl("G", 0, 0, localfloatW1.val, f2, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
    }
    label4306:
    paramArrayOfFloat4[(1 - 1 + paramInt9)] = i11;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgelss.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */