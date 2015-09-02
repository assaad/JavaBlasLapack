package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgelsd
{
  public static void sgelsd(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, float paramFloat, intW paramintW1, float[] paramArrayOfFloat4, int paramInt9, int paramInt10, int[] paramArrayOfInt, int paramInt11, intW paramintW2)
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
    paramintW2.val = 0;
    i8 = Math.min(paramInt1, paramInt2);
    i6 = Math.max(paramInt1, paramInt2);
    i = paramInt10 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -2;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -3;
    } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW2.val = -5;
    } else if ((paramInt7 >= Math.max(1, i6) ? 0 : 1) != 0) {
      paramintW2.val = -7;
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      i9 = 1;
      i7 = 1;
      i5 = 1;
      if ((i8 <= 0 ? 0 : 1) != 0)
      {
        i14 = Ilaenv.ilaenv(9, "SGELSD", " ", 0, 0, 0, 0);
        i11 = Ilaenv.ilaenv(6, "SGELSD", " ", paramInt1, paramInt2, paramInt3, -1);
        i12 = Math.max((int)((float)Math.log(i8 / (i14 + 1)) / (float)Math.log(2.0F)) + 1, 0);
        i5 = 3 * i8 * i12 + 11 * i8;
        i10 = paramInt1;
        if ((paramInt1 < paramInt2 ? 0 : 1) != 0) {}
        if (((paramInt1 < i11 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          i10 = paramInt2;
          i7 = Math.max(i7, paramInt2 + paramInt2 * Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1));
          i7 = Math.max(i7, paramInt2 + paramInt3 * Ilaenv.ilaenv(1, "SORMQR", "LT", paramInt1, paramInt3, paramInt2, -1));
        }
        if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
        {
          i7 = Math.max(i7, 3 * paramInt2 + (i10 + paramInt2) * Ilaenv.ilaenv(1, "SGEBRD", " ", i10, paramInt2, -1, -1));
          i7 = Math.max(i7, 3 * paramInt2 + paramInt3 * Ilaenv.ilaenv(1, "SORMBR", "QLT", i10, paramInt3, paramInt2, -1));
          i7 = Math.max(i7, 3 * paramInt2 + (paramInt2 - 1) * Ilaenv.ilaenv(1, "SORMBR", "PLN", paramInt2, paramInt3, paramInt2, -1));
          i15 = 9 * paramInt2 + 2 * paramInt2 * i14 + 8 * paramInt2 * i12 + paramInt2 * paramInt3 + (int)Math.pow(i14 + 1, 2);
          i7 = Math.max(i7, 3 * paramInt2 + i15);
          i9 = Util.max(3 * paramInt2 + i10, 3 * paramInt2 + paramInt3, 3 * paramInt2 + i15);
        }
        if ((paramInt2 <= paramInt1 ? 0 : 1) != 0)
        {
          i15 = 9 * paramInt1 + 2 * paramInt1 * i14 + 8 * paramInt1 * i12 + paramInt1 * paramInt3 + (int)Math.pow(i14 + 1, 2);
          if ((paramInt2 < i11 ? 0 : 1) != 0)
          {
            i7 = paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SGELQF", " ", paramInt1, paramInt2, -1, -1);
            i7 = Math.max(i7, paramInt1 * paramInt1 + 4 * paramInt1 + 2 * paramInt1 * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt1, -1, -1));
            i7 = Math.max(i7, paramInt1 * paramInt1 + 4 * paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "SORMBR", "QLT", paramInt1, paramInt3, paramInt1, -1));
            i7 = Math.max(i7, paramInt1 * paramInt1 + 4 * paramInt1 + (paramInt1 - 1) * Ilaenv.ilaenv(1, "SORMBR", "PLN", paramInt1, paramInt3, paramInt1, -1));
            if ((paramInt3 <= 1 ? 0 : 1) != 0) {
              i7 = Math.max(i7, paramInt1 * paramInt1 + paramInt1 + paramInt1 * paramInt3);
            } else {
              i7 = Math.max(i7, paramInt1 * paramInt1 + 2 * paramInt1);
            }
            i7 = Math.max(i7, paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "SORMLQ", "LT", paramInt2, paramInt3, paramInt1, -1));
            i7 = Math.max(i7, paramInt1 * paramInt1 + 4 * paramInt1 + i15);
          }
          else
          {
            i7 = 3 * paramInt1 + (paramInt2 + paramInt1) * Ilaenv.ilaenv(1, "SGEBRD", " ", paramInt1, paramInt2, -1, -1);
            i7 = Math.max(i7, 3 * paramInt1 + paramInt3 * Ilaenv.ilaenv(1, "SORMBR", "QLT", paramInt1, paramInt3, paramInt2, -1));
            i7 = Math.max(i7, 3 * paramInt1 + paramInt1 * Ilaenv.ilaenv(1, "SORMBR", "PLN", paramInt2, paramInt3, paramInt1, -1));
            i7 = Math.max(i7, 3 * paramInt1 + i15);
          }
          i9 = Util.max(3 * paramInt1 + paramInt3, 3 * paramInt1 + paramInt1, 3 * paramInt1 + i15);
        }
      }
      i9 = Math.min(i9, i7);
      paramArrayOfFloat4[(1 - 1 + paramInt9)] = i7;
      paramArrayOfInt[(1 - 1 + paramInt11)] = i5;
      if ((paramInt10 >= i9 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -12;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGELSD", -paramintW2.val);
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
    j = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= localfloatW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW2.val, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
      j = 1;
    }
    else if ((f1 <= localfloatW1.val ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW1.val, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
      j = 2;
    }
    else if ((f1 != 0.0F ? 0 : 1) != 0)
    {
      Slaset.slaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramInt6, paramInt7);
      Slaset.slaset("F", i8, 1, 0.0F, 0.0F, paramArrayOfFloat3, paramInt8, 1);
      paramintW1.val = 0;
      break label3044;
    }
    f2 = Slange.slange("M", paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, paramInt9);
    k = 0;
    if ((f2 <= 0.0F ? 0 : 1) != 0) {}
    if (((f2 >= localfloatW2.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Slascl.slascl("G", 0, 0, f2, localfloatW2.val, paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      k = 1;
    }
    else if ((f2 <= localfloatW1.val ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f2, localfloatW1.val, paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      k = 2;
    }
    if ((paramInt1 >= paramInt2 ? 0 : 1) != 0) {
      Slaset.slaset("F", paramInt2 - paramInt1, paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramInt1 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
    }
    if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
    {
      i10 = paramInt1;
      if ((paramInt1 < i11 ? 0 : 1) != 0)
      {
        i10 = paramInt2;
        i1 = 1;
        i13 = i1 + paramInt2;
        Sgeqrf.sgeqrf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i1 - 1 + paramInt9, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
        Sormqr.sormqr("L", "T", paramInt1, paramInt3, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i1 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          Slaset.slaset("L", paramInt2 - 1, paramInt2 - 1, 0.0F, 0.0F, paramArrayOfFloat1, 2 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5);
        }
      }
      m = 1;
      i3 = m + paramInt2;
      i2 = i3 + paramInt2;
      i13 = i2 + paramInt2;
      Sgebrd.sgebrd(i10, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, m - 1 + paramInt9, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat4, i2 - 1 + paramInt9, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
      Sormbr.sormbr("Q", "L", "T", i10, paramInt3, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
      Slalsd.slalsd("U", i14, paramInt2, paramInt3, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, m - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramFloat, paramintW1, paramArrayOfFloat4, i13 - 1 + paramInt9, paramArrayOfInt, paramInt11, paramintW2);
      if ((paramintW2.val == 0 ? 0 : 1) != 0) {
        break label3044;
      }
      Sormbr.sormbr("P", "L", "N", paramInt2, paramInt3, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i2 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
    }
    else
    {
      if ((paramInt2 < i11 ? 0 : 1) != 0) {}
      if (((paramInt10 < 4 * paramInt1 + paramInt1 * paramInt1 + Math.max(Math.max(Util.max(paramInt1, 2 * paramInt1 - 4, paramInt3), paramInt2 - 3 * paramInt1), i15) ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        i4 = paramInt1;
        if ((paramInt10 < Util.max(4 * paramInt1 + paramInt1 * paramInt5 + Math.max(Util.max(paramInt1, 2 * paramInt1 - 4, paramInt3), paramInt2 - 3 * paramInt1), paramInt1 * paramInt5 + paramInt1 + paramInt1 * paramInt3, 4 * paramInt1 + paramInt1 * paramInt5 + i15) ? 0 : 1) != 0) {
          i4 = paramInt5;
        }
        i1 = 1;
        i13 = paramInt1 + 1;
        Sgelqf.sgelqf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i1 - 1 + paramInt9, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
        n = i13;
        Slacpy.slacpy("L", paramInt1, paramInt1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, n - 1 + paramInt9, i4);
        Slaset.slaset("U", paramInt1 - 1, paramInt1 - 1, 0.0F, 0.0F, paramArrayOfFloat4, n + i4 - 1 + paramInt9, i4);
        m = n + i4 * paramInt1;
        i3 = m + paramInt1;
        i2 = i3 + paramInt1;
        i13 = i2 + paramInt1;
        Sgebrd.sgebrd(paramInt1, paramInt1, paramArrayOfFloat4, n - 1 + paramInt9, i4, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, m - 1 + paramInt9, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat4, i2 - 1 + paramInt9, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
        Sormbr.sormbr("Q", "L", "T", paramInt1, paramInt3, paramInt1, paramArrayOfFloat4, n - 1 + paramInt9, i4, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
        Slalsd.slalsd("U", i14, paramInt1, paramInt3, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, m - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramFloat, paramintW1, paramArrayOfFloat4, i13 - 1 + paramInt9, paramArrayOfInt, paramInt11, paramintW2);
        if ((paramintW2.val == 0 ? 0 : 1) != 0) {
          break label3044;
        }
        Sormbr.sormbr("P", "L", "N", paramInt1, paramInt3, paramInt1, paramArrayOfFloat4, n - 1 + paramInt9, i4, paramArrayOfFloat4, i2 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
        Slaset.slaset("F", paramInt2 - paramInt1, paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramInt1 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        i13 = i1 + paramInt1;
        Sormlq.sormlq("L", "T", paramInt2, paramInt3, paramInt1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i1 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
      }
      else
      {
        m = 1;
        i3 = m + paramInt1;
        i2 = i3 + paramInt1;
        i13 = i2 + paramInt1;
        Sgebrd.sgebrd(paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, m - 1 + paramInt9, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat4, i2 - 1 + paramInt9, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
        Sormbr.sormbr("Q", "L", "T", paramInt1, paramInt3, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i3 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
        Slalsd.slalsd("L", i14, paramInt1, paramInt3, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, m - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramFloat, paramintW1, paramArrayOfFloat4, i13 - 1 + paramInt9, paramArrayOfInt, paramInt11, paramintW2);
        if ((paramintW2.val == 0 ? 0 : 1) != 0) {
          break label3044;
        }
        Sormbr.sormbr("P", "L", "N", paramInt2, paramInt3, paramInt1, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat4, i2 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat4, i13 - 1 + paramInt9, paramInt10 - i13 + 1, paramintW2);
      }
    }
    if ((j != 1 ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW2.val, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      Slascl.slascl("G", 0, 0, localfloatW2.val, f1, i8, 1, paramArrayOfFloat3, paramInt8, i8, paramintW2);
    }
    else if ((j != 2 ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW1.val, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      Slascl.slascl("G", 0, 0, localfloatW1.val, f1, i8, 1, paramArrayOfFloat3, paramInt8, i8, paramintW2);
    }
    if ((k != 1 ? 0 : 1) != 0) {
      Slascl.slascl("G", 0, 0, localfloatW2.val, f2, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
    } else if ((k != 2 ? 0 : 1) != 0) {
      Slascl.slascl("G", 0, 0, localfloatW1.val, f2, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
    }
    label3044:
    paramArrayOfFloat4[(1 - 1 + paramInt9)] = i7;
    paramArrayOfInt[(1 - 1 + paramInt11)] = i5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgelsd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */