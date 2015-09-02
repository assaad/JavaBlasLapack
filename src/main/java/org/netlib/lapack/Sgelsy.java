package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Strsm;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgelsy
{
  public static void sgelsy(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, int[] paramArrayOfInt, int paramInt8, float paramFloat, intW paramintW1, float[] paramArrayOfFloat3, int paramInt9, int paramInt10, intW paramintW2)
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
    float f1 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f2 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    floatW localfloatW5 = new floatW(0.0F);
    float f3 = 0.0F;
    floatW localfloatW6 = new floatW(0.0F);
    float f4 = 0.0F;
    floatW localfloatW7 = new floatW(0.0F);
    floatW localfloatW8 = new floatW(0.0F);
    float f5 = 0.0F;
    i5 = Math.min(paramInt1, paramInt2);
    i1 = i5 + 1;
    n = 2 * i5 + 1;
    paramintW2.val = 0;
    i = paramInt10 != -1 ? 0 : 1;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -2;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -3;
    } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW2.val = -5;
    } else if ((paramInt7 >= Util.max(1, paramInt1, paramInt2) ? 0 : 1) != 0) {
      paramintW2.val = -7;
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      if ((i5 != 0 ? 0 : 1) == 0) {}
      if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i3 = 1;
        i4 = 1;
      }
      else
      {
        i7 = Ilaenv.ilaenv(1, "SGEQRF", " ", paramInt1, paramInt2, -1, -1);
        i8 = Ilaenv.ilaenv(1, "SGERQF", " ", paramInt1, paramInt2, -1, -1);
        i9 = Ilaenv.ilaenv(1, "SORMQR", " ", paramInt1, paramInt2, paramInt3, -1);
        i10 = Ilaenv.ilaenv(1, "SORMRQ", " ", paramInt1, paramInt2, paramInt3, -1);
        i6 = Math.max(Util.max(i7, i8, i9), i10);
        i3 = i5 + Util.max(2 * i5, paramInt2 + 1, i5 + paramInt3);
        i4 = Util.max(i3, i5 + 2 * paramInt2 + i6 * (paramInt2 + 1), 2 * i5 + i6 * paramInt3);
      }
      paramArrayOfFloat3[(1 - 1 + paramInt9)] = i4;
      if ((paramInt10 >= i3 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW2.val = -12;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGELSY", -paramintW2.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((i5 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramintW1.val = 0;
      return;
    }
    localfloatW8.val = (Slamch.slamch("S") / Slamch.slamch("P"));
    localfloatW1.val = (1.0F / localfloatW8.val);
    Slabad.slabad(localfloatW8, localfloatW1);
    f1 = Slange.slange("M", paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt9);
    k = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= localfloatW8.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW8.val, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
      k = 1;
    }
    else if ((f1 <= localfloatW1.val ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW1.val, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
      k = 2;
    }
    else if ((f1 != 0.0F ? 0 : 1) != 0)
    {
      Slaset.slaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramInt6, paramInt7);
      paramintW1.val = 0;
      break label2181;
    }
    f2 = Slange.slange("M", paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt9);
    m = 0;
    if ((f2 <= 0.0F ? 0 : 1) != 0) {}
    if (((f2 >= localfloatW8.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Slascl.slascl("G", 0, 0, f2, localfloatW8.val, paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      m = 1;
    }
    else if ((f2 <= localfloatW1.val ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f2, localfloatW1.val, paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      m = 2;
    }
    Sgeqp3.sgeqp3(paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfInt, paramInt8, paramArrayOfFloat3, 1 - 1 + paramInt9, paramArrayOfFloat3, i5 + 1 - 1 + paramInt9, paramInt10 - i5, paramintW2);
    f5 = i5 + paramArrayOfFloat3[(i5 + 1 - 1 + paramInt9)];
    paramArrayOfFloat3[(i1 - 1 + paramInt9)] = 1.0F;
    paramArrayOfFloat3[(n - 1 + paramInt9)] = 1.0F;
    f3 = Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)]);
    f4 = f3;
    if ((Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)]) != 0.0F ? 0 : 1) != 0)
    {
      paramintW1.val = 0;
      Slaset.slaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramInt6, paramInt7);
      break label2181;
    }
    else
    {
      for (paramintW1.val = 1; (paramintW1.val >= i5 ? 0 : 1) != 0; paramintW1.val += 1)
      {
        j = paramintW1.val + 1;
        Slaic1.slaic1(2, paramintW1.val, paramArrayOfFloat3, i1 - 1 + paramInt9, f4, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt5 + paramInt4, paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt5 + paramInt4)], localfloatW7, localfloatW4, localfloatW2);
        Slaic1.slaic1(1, paramintW1.val, paramArrayOfFloat3, n - 1 + paramInt9, f3, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt5 + paramInt4, paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt5 + paramInt4)], localfloatW6, localfloatW5, localfloatW3);
        if ((localfloatW6.val * paramFloat > localfloatW7.val ? 0 : 1) == 0) {
          break;
        }
        j = 1;
        for (i11 = paramintW1.val - 1 + 1; i11 > 0; i11--)
        {
          paramArrayOfFloat3[(i1 + j - 1 - 1 + paramInt9)] = (localfloatW4.val * paramArrayOfFloat3[(i1 + j - 1 - 1 + paramInt9)]);
          paramArrayOfFloat3[(n + j - 1 - 1 + paramInt9)] = (localfloatW5.val * paramArrayOfFloat3[(n + j - 1 - 1 + paramInt9)]);
          j += 1;
        }
        paramArrayOfFloat3[(i1 + paramintW1.val - 1 + paramInt9)] = localfloatW2.val;
        paramArrayOfFloat3[(n + paramintW1.val - 1 + paramInt9)] = localfloatW3.val;
        f4 = localfloatW7.val;
        f3 = localfloatW6.val;
      }
      if ((paramintW1.val >= paramInt2 ? 0 : 1) != 0) {
        Stzrzf.stzrzf(paramintW1.val, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, i5 + 1 - 1 + paramInt9, paramArrayOfFloat3, 2 * i5 + 1 - 1 + paramInt9, paramInt10 - 2 * i5, paramintW2);
      }
      Sormqr.sormqr("Left", "Transpose", paramInt1, paramInt3, i5, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, 2 * i5 + 1 - 1 + paramInt9, paramInt10 - 2 * i5, paramintW2);
      f5 = Math.max(f5, 2 * i5 + paramArrayOfFloat3[(2 * i5 + 1 - 1 + paramInt9)]);
      Strsm.strsm("Left", "Upper", "No transpose", "Non-unit", paramintW1.val, paramInt3, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7);
      i2 = 1;
      int i12;
      for (int i11 = paramInt3 - 1 + 1; i11 > 0; i11--)
      {
        j = paramintW1.val + 1;
        for (i12 = paramInt2 - (paramintW1.val + 1) + 1; i12 > 0; i12--)
        {
          paramArrayOfFloat2[(j - 1 + (i2 - 1) * paramInt7 + paramInt6)] = 0.0F;
          j += 1;
        }
        i2 += 1;
      }
      if ((paramintW1.val >= paramInt2 ? 0 : 1) != 0) {
        Sormrz.sormrz("Left", "Transpose", paramInt2, paramInt3, paramintW1.val, paramInt2 - paramintW1.val, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, i5 + 1 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, 2 * i5 + 1 - 1 + paramInt9, paramInt10 - 2 * i5, paramintW2);
      }
      i2 = 1;
      for (i11 = paramInt3 - 1 + 1; i11 > 0; i11--)
      {
        j = 1;
        for (i12 = paramInt2 - 1 + 1; i12 > 0; i12--)
        {
          paramArrayOfFloat3[(paramArrayOfInt[(j - 1 + paramInt8)] - 1 + paramInt9)] = paramArrayOfFloat2[(j - 1 + (i2 - 1) * paramInt7 + paramInt6)];
          j += 1;
        }
        Scopy.scopy(paramInt2, paramArrayOfFloat3, 1 - 1 + paramInt9, 1, paramArrayOfFloat2, 1 - 1 + (i2 - 1) * paramInt7 + paramInt6, 1);
        i2 += 1;
      }
      if ((k != 1 ? 0 : 1) != 0)
      {
        Slascl.slascl("G", 0, 0, f1, localfloatW8.val, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
        Slascl.slascl("U", 0, 0, localfloatW8.val, f1, paramintW1.val, paramintW1.val, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
      }
      else if ((k != 2 ? 0 : 1) != 0)
      {
        Slascl.slascl("G", 0, 0, f1, localfloatW1.val, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
        Slascl.slascl("U", 0, 0, localfloatW1.val, f1, paramintW1.val, paramintW1.val, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
      }
      if ((m != 1 ? 0 : 1) != 0) {
        Slascl.slascl("G", 0, 0, localfloatW8.val, f2, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      } else if ((m != 2 ? 0 : 1) != 0) {
        Slascl.slascl("G", 0, 0, localfloatW1.val, f2, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      }
    }
    label2181:
    paramArrayOfFloat3[(1 - 1 + paramInt9)] = i4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgelsy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */