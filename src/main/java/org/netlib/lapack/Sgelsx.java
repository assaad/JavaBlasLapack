package org.netlib.lapack;

import org.netlib.blas.Strsm;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgelsx
{
  public static void sgelsx(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, int[] paramArrayOfInt, int paramInt8, float paramFloat, intW paramintW1, float[] paramArrayOfFloat3, int paramInt9, intW paramintW2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
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
    float f6 = 0.0F;
    i3 = Math.min(paramInt1, paramInt2);
    n = i3 + 1;
    m = 2 * i3 + 1;
    paramintW2.val = 0;
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
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGELSX", -paramintW2.val);
      return;
    }
    if ((Util.min(paramInt1, paramInt2, paramInt3) != 0 ? 0 : 1) != 0)
    {
      paramintW1.val = 0;
      return;
    }
    localfloatW8.val = (Slamch.slamch("S") / Slamch.slamch("P"));
    localfloatW1.val = (1.0F / localfloatW8.val);
    Slabad.slabad(localfloatW8, localfloatW1);
    f1 = Slange.slange("M", paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, paramInt9);
    j = 0;
    if ((f1 <= 0.0F ? 0 : 1) != 0) {}
    if (((f1 >= localfloatW8.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Slascl.slascl("G", 0, 0, f1, localfloatW8.val, paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
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
      paramintW1.val = 0;
      return;
    }
    f2 = Slange.slange("M", paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, paramInt9);
    k = 0;
    if ((f2 <= 0.0F ? 0 : 1) != 0) {}
    if (((f2 >= localfloatW8.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Slascl.slascl("G", 0, 0, f2, localfloatW8.val, paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      k = 1;
    }
    else if ((f2 <= localfloatW1.val ? 0 : 1) != 0)
    {
      Slascl.slascl("G", 0, 0, f2, localfloatW1.val, paramInt1, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      k = 2;
    }
    Sgeqpf.sgeqpf(paramInt1, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfInt, paramInt8, paramArrayOfFloat3, 1 - 1 + paramInt9, paramArrayOfFloat3, i3 + 1 - 1 + paramInt9, paramintW2);
    paramArrayOfFloat3[(n - 1 + paramInt9)] = 1.0F;
    paramArrayOfFloat3[(m - 1 + paramInt9)] = 1.0F;
    f3 = Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)]);
    f4 = f3;
    if ((Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)]) != 0.0F ? 0 : 1) != 0)
    {
      paramintW1.val = 0;
      Slaset.slaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0F, 0.0F, paramArrayOfFloat2, paramInt6, paramInt7);
      return;
    }
    else
    {
      for (paramintW1.val = 1; (paramintW1.val >= i3 ? 0 : 1) != 0; paramintW1.val += 1)
      {
        i = paramintW1.val + 1;
        Slaic1.slaic1(2, paramintW1.val, paramArrayOfFloat3, n - 1 + paramInt9, f4, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)], localfloatW7, localfloatW4, localfloatW2);
        Slaic1.slaic1(1, paramintW1.val, paramArrayOfFloat3, m - 1 + paramInt9, f3, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)], localfloatW6, localfloatW5, localfloatW3);
        if ((localfloatW6.val * paramFloat > localfloatW7.val ? 0 : 1) == 0) {
          break;
        }
        i = 1;
        for (i4 = paramintW1.val - 1 + 1; i4 > 0; i4--)
        {
          paramArrayOfFloat3[(n + i - 1 - 1 + paramInt9)] = (localfloatW4.val * paramArrayOfFloat3[(n + i - 1 - 1 + paramInt9)]);
          paramArrayOfFloat3[(m + i - 1 - 1 + paramInt9)] = (localfloatW5.val * paramArrayOfFloat3[(m + i - 1 - 1 + paramInt9)]);
          i += 1;
        }
        paramArrayOfFloat3[(n + paramintW1.val - 1 + paramInt9)] = localfloatW2.val;
        paramArrayOfFloat3[(m + paramintW1.val - 1 + paramInt9)] = localfloatW3.val;
        f4 = localfloatW7.val;
        f3 = localfloatW6.val;
      }
      if ((paramintW1.val >= paramInt2 ? 0 : 1) != 0) {
        Stzrqf.stzrqf(paramintW1.val, paramInt2, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, i3 + 1 - 1 + paramInt9, paramintW2);
      }
      Sorm2r.sorm2r("Left", "Transpose", paramInt1, paramInt3, i3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat3, 1 - 1 + paramInt9, paramArrayOfFloat2, paramInt6, paramInt7, paramArrayOfFloat3, 2 * i3 + 1 - 1 + paramInt9, paramintW2);
      Strsm.strsm("Left", "Upper", "No transpose", "Non-unit", paramintW1.val, paramInt3, 1.0F, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramInt7);
      i = paramintW1.val + 1;
      int i5;
      for (int i4 = paramInt2 - (paramintW1.val + 1) + 1; i4 > 0; i4--)
      {
        i1 = 1;
        for (i5 = paramInt3 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat2[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = 0.0F;
          i1 += 1;
        }
        i += 1;
      }
      if ((paramintW1.val >= paramInt2 ? 0 : 1) != 0)
      {
        i = 1;
        for (i4 = paramintW1.val - 1 + 1; i4 > 0; i4--)
        {
          Slatzm.slatzm("Left", paramInt2 - paramintW1.val + 1, paramInt3, paramArrayOfFloat1, i - 1 + (paramintW1.val + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3[(i3 + i - 1 + paramInt9)], paramArrayOfFloat2, i - 1 + (1 - 1) * paramInt7 + paramInt6, paramArrayOfFloat2, paramintW1.val + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3, 2 * i3 + 1 - 1 + paramInt9);
          i += 1;
        }
      }
      i1 = 1;
      for (i4 = paramInt3 - 1 + 1; i4 > 0; i4--)
      {
        i = 1;
        for (i5 = paramInt2 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfFloat3[(2 * i3 + i - 1 + paramInt9)] = 1.0F;
          i += 1;
        }
        i = 1;
        for (i5 = paramInt2 - 1 + 1; i5 > 0; i5--)
        {
          if ((paramArrayOfFloat3[(2 * i3 + i - 1 + paramInt9)] != 1.0F ? 0 : 1) != 0) {
            if ((paramArrayOfInt[(i - 1 + paramInt8)] == i ? 0 : 1) != 0)
            {
              i2 = i;
              f5 = paramArrayOfFloat2[(i2 - 1 + (i1 - 1) * paramInt7 + paramInt6)];
              f6 = paramArrayOfFloat2[(paramArrayOfInt[(i2 - 1 + paramInt8)] - 1 + (i1 - 1) * paramInt7 + paramInt6)];
              do
              {
                paramArrayOfFloat2[(paramArrayOfInt[(i2 - 1 + paramInt8)] - 1 + (i1 - 1) * paramInt7 + paramInt6)] = f5;
                paramArrayOfFloat3[(2 * i3 + i2 - 1 + paramInt9)] = 0.0F;
                f5 = f6;
                i2 = paramArrayOfInt[(i2 - 1 + paramInt8)];
                f6 = paramArrayOfFloat2[(paramArrayOfInt[(i2 - 1 + paramInt8)] - 1 + (i1 - 1) * paramInt7 + paramInt6)];
              } while ((paramArrayOfInt[(i2 - 1 + paramInt8)] == i ? 0 : 1) != 0);
              paramArrayOfFloat2[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = f5;
              paramArrayOfFloat3[(2 * i3 + i2 - 1 + paramInt9)] = 0.0F;
            }
          }
          i += 1;
        }
        i1 += 1;
      }
      if ((j != 1 ? 0 : 1) != 0)
      {
        Slascl.slascl("G", 0, 0, f1, localfloatW8.val, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
        Slascl.slascl("U", 0, 0, localfloatW8.val, f1, paramintW1.val, paramintW1.val, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
      }
      else if ((j != 2 ? 0 : 1) != 0)
      {
        Slascl.slascl("G", 0, 0, f1, localfloatW1.val, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
        Slascl.slascl("U", 0, 0, localfloatW1.val, f1, paramintW1.val, paramintW1.val, paramArrayOfFloat1, paramInt4, paramInt5, paramintW2);
      }
      if ((k != 1 ? 0 : 1) != 0) {
        Slascl.slascl("G", 0, 0, localfloatW8.val, f2, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      } else if ((k != 2 ? 0 : 1) != 0) {
        Slascl.slascl("G", 0, 0, localfloatW1.val, f2, paramInt2, paramInt3, paramArrayOfFloat2, paramInt6, paramInt7, paramintW2);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgelsx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */