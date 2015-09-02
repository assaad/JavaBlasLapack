package org.netlib.lapack;

import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Ssteqr
{
  public static void ssteqr(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, intW paramintW)
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
    float f2 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    floatW localfloatW5 = new floatW(0.0F);
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    paramintW.val = 0;
    if (Lsame.lsame(paramString, "N")) {
      j = 0;
    } else if (Lsame.lsame(paramString, "V")) {
      j = 1;
    } else if (Lsame.lsame(paramString, "I")) {
      j = 2;
    } else {
      j = -1;
    }
    if ((j >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if ((j <= 0 ? 0 : 1) == 0) {}
      }
      if ((((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -6;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSTEQR", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((j != 2 ? 0 : 1) != 0) {
        paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0F;
      }
      return;
    }
    f3 = Slamch.slamch("E");
    f4 = (float)Math.pow(f3, 2);
    f9 = Slamch.slamch("S");
    f8 = 1.0F / f9;
    f10 = (float)Math.sqrt(f8) / 3.0F;
    f11 = (float)Math.sqrt(f9) / f4;
    if ((j != 2 ? 0 : 1) != 0) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat3, paramInt4, paramInt5);
    }
    i15 = paramInt1 * 30;
    i1 = 0;
    i4 = 1;
    i14 = paramInt1 - 1;
    int i16;
    while ((i4 <= paramInt1 ? 0 : 1) == 0)
    {
      if ((i4 <= 1 ? 0 : 1) != 0) {
        paramArrayOfFloat2[(i4 - 1 - 1 + paramInt3)] = 0.0F;
      }
      if ((i4 > i14 ? 0 : 1) != 0)
      {
        i11 = i4;
        for (i16 = i14 - i4 + 1; i16 > 0; i16--)
        {
          f12 = Math.abs(paramArrayOfFloat2[(i11 - 1 + paramInt3)]);
          if ((f12 != 0.0F ? 0 : 1) != 0) {
            break;
          }
          if ((f12 > (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(i11 - 1 + paramInt2)])) * (float)Math.sqrt(Math.abs(paramArrayOfFloat1[(i11 + 1 - 1 + paramInt2)])) * f3 ? 0 : 1) != 0)
          {
            paramArrayOfFloat2[(i11 - 1 + paramInt3)] = 0.0F;
            break;
          }
          i11 += 1;
        }
      }
      i11 = paramInt1;
      i3 = i4;
      i10 = i3;
      i5 = i11;
      i8 = i5;
      i4 = i11 + 1;
      if ((i5 != i3 ? 0 : 1) == 0)
      {
        f1 = Slanst.slanst("I", i5 - i3 + 1, paramArrayOfFloat1, i3 - 1 + paramInt2, paramArrayOfFloat2, i3 - 1 + paramInt3);
        m = 0;
        if ((f1 != 0.0F ? 0 : 1) == 0)
        {
          if ((f1 <= f10 ? 0 : 1) != 0)
          {
            m = 1;
            Slascl.slascl("G", 0, 0, f1, f10, i5 - i3 + 1, 1, paramArrayOfFloat1, i3 - 1 + paramInt2, paramInt1, paramintW);
            Slascl.slascl("G", 0, 0, f1, f10, i5 - i3, 1, paramArrayOfFloat2, i3 - 1 + paramInt3, paramInt1, paramintW);
          }
          else if ((f1 >= f11 ? 0 : 1) != 0)
          {
            m = 2;
            Slascl.slascl("G", 0, 0, f1, f11, i5 - i3 + 1, 1, paramArrayOfFloat1, i3 - 1 + paramInt2, paramInt1, paramintW);
            Slascl.slascl("G", 0, 0, f1, f11, i5 - i3, 1, paramArrayOfFloat2, i3 - 1 + paramInt3, paramInt1, paramintW);
          }
          if ((Math.abs(paramArrayOfFloat1[(i5 - 1 + paramInt2)]) >= Math.abs(paramArrayOfFloat1[(i3 - 1 + paramInt2)]) ? 0 : 1) != 0)
          {
            i5 = i10;
            i3 = i8;
          }
          if ((i5 <= i3 ? 0 : 1) != 0)
          {
            do
            {
              for (;;)
              {
                if ((i3 == i5 ? 0 : 1) != 0)
                {
                  i6 = i5 - 1;
                  i11 = i3;
                  for (i16 = i6 - i3 + 1; i16 > 0; i16--)
                  {
                    f12 = (float)Math.pow(Math.abs(paramArrayOfFloat2[(i11 - 1 + paramInt3)]), 2);
                    if ((f12 > f4 * Math.abs(paramArrayOfFloat1[(i11 - 1 + paramInt2)]) * Math.abs(paramArrayOfFloat1[(i11 + 1 - 1 + paramInt2)]) + f9 ? 0 : 1) != 0) {
                      break;
                    }
                    i11 += 1;
                  }
                }
                i11 = i5;
                if ((i11 >= i5 ? 0 : 1) != 0) {
                  paramArrayOfFloat2[(i11 - 1 + paramInt3)] = 0.0F;
                }
                f7 = paramArrayOfFloat1[(i3 - 1 + paramInt2)];
                if ((i11 != i3 ? 0 : 1) != 0) {
                  break;
                }
                if ((i11 != i3 + 1 ? 0 : 1) != 0)
                {
                  if ((j <= 0 ? 0 : 1) != 0)
                  {
                    Slaev2.slaev2(paramArrayOfFloat1[(i3 - 1 + paramInt2)], paramArrayOfFloat2[(i3 - 1 + paramInt3)], paramArrayOfFloat1[(i3 + 1 - 1 + paramInt2)], localfloatW3, localfloatW4, localfloatW1, localfloatW5);
                    paramArrayOfFloat4[(i3 - 1 + paramInt6)] = localfloatW1.val;
                    paramArrayOfFloat4[(paramInt1 - 1 + i3 - 1 + paramInt6)] = localfloatW5.val;
                    Slasr.slasr("R", "V", "B", paramInt1, 2, paramArrayOfFloat4, i3 - 1 + paramInt6, paramArrayOfFloat4, paramInt1 - 1 + i3 - 1 + paramInt6, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5);
                  }
                  else
                  {
                    Slae2.slae2(paramArrayOfFloat1[(i3 - 1 + paramInt2)], paramArrayOfFloat2[(i3 - 1 + paramInt3)], paramArrayOfFloat1[(i3 + 1 - 1 + paramInt2)], localfloatW3, localfloatW4);
                  }
                  paramArrayOfFloat1[(i3 - 1 + paramInt2)] = localfloatW3.val;
                  paramArrayOfFloat1[(i3 + 1 - 1 + paramInt2)] = localfloatW4.val;
                  paramArrayOfFloat2[(i3 - 1 + paramInt3)] = 0.0F;
                  i3 += 2;
                  if ((i3 > i5 ? 0 : 1) == 0) {
                    break label2944;
                  }
                }
                else
                {
                  if ((i1 != i15 ? 0 : 1) != 0) {
                    break label2944;
                  }
                  i1 += 1;
                  f6 = (paramArrayOfFloat1[(i3 + 1 - 1 + paramInt2)] - f7) / (2.0F * paramArrayOfFloat2[(i3 - 1 + paramInt3)]);
                  localfloatW2.val = Slapy2.slapy2(f6, 1.0F);
                  f6 = paramArrayOfFloat1[(i11 - 1 + paramInt2)] - f7 + paramArrayOfFloat2[(i3 - 1 + paramInt3)] / (f6 + Util.sign(localfloatW2.val, f6));
                  localfloatW5.val = 1.0F;
                  localfloatW1.val = 1.0F;
                  f7 = 0.0F;
                  i13 = i11 - 1;
                  i = i13;
                  for (i16 = (i3 - i13 + -1) / -1; i16 > 0; i16--)
                  {
                    f5 = localfloatW5.val * paramArrayOfFloat2[(i - 1 + paramInt3)];
                    f2 = localfloatW1.val * paramArrayOfFloat2[(i - 1 + paramInt3)];
                    Slartg.slartg(f6, f5, localfloatW1, localfloatW5, localfloatW2);
                    if ((i == i11 - 1 ? 0 : 1) != 0) {
                      paramArrayOfFloat2[(i + 1 - 1 + paramInt3)] = localfloatW2.val;
                    }
                    f6 = paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] - f7;
                    localfloatW2.val = ((paramArrayOfFloat1[(i - 1 + paramInt2)] - f6) * localfloatW5.val + 2.0F * localfloatW1.val * f2);
                    f7 = localfloatW5.val * localfloatW2.val;
                    paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] = (f6 + f7);
                    f6 = localfloatW1.val * localfloatW2.val - f2;
                    if ((j <= 0 ? 0 : 1) != 0)
                    {
                      paramArrayOfFloat4[(i - 1 + paramInt6)] = localfloatW1.val;
                      paramArrayOfFloat4[(paramInt1 - 1 + i - 1 + paramInt6)] = (-localfloatW5.val);
                    }
                    i += -1;
                  }
                  if ((j <= 0 ? 0 : 1) != 0)
                  {
                    i12 = i11 - i3 + 1;
                    Slasr.slasr("R", "V", "B", paramInt1, i12, paramArrayOfFloat4, i3 - 1 + paramInt6, paramArrayOfFloat4, paramInt1 - 1 + i3 - 1 + paramInt6, paramArrayOfFloat3, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5);
                  }
                  paramArrayOfFloat1[(i3 - 1 + paramInt2)] -= f7;
                  paramArrayOfFloat2[(i3 - 1 + paramInt3)] = f6;
                }
              }
              paramArrayOfFloat1[(i3 - 1 + paramInt2)] = f7;
              i3 += 1;
            } while ((i3 > i5 ? 0 : 1) != 0);
            break label2944;
          }
          else
          {
            for (;;)
            {
              if ((i3 == i5 ? 0 : 1) != 0)
              {
                i7 = i5 + 1;
                i11 = i3;
                for (i16 = (i7 - i3 + -1) / -1; i16 > 0; i16--)
                {
                  f12 = (float)Math.pow(Math.abs(paramArrayOfFloat2[(i11 - 1 - 1 + paramInt3)]), 2);
                  if ((f12 > f4 * Math.abs(paramArrayOfFloat1[(i11 - 1 + paramInt2)]) * Math.abs(paramArrayOfFloat1[(i11 - 1 - 1 + paramInt2)]) + f9 ? 0 : 1) != 0) {
                    break;
                  }
                  i11 += -1;
                }
              }
              i11 = i5;
              if ((i11 <= i5 ? 0 : 1) != 0) {
                paramArrayOfFloat2[(i11 - 1 - 1 + paramInt3)] = 0.0F;
              }
              f7 = paramArrayOfFloat1[(i3 - 1 + paramInt2)];
              if ((i11 != i3 ? 0 : 1) == 0)
              {
                if ((i11 != i3 - 1 ? 0 : 1) != 0)
                {
                  if ((j <= 0 ? 0 : 1) != 0)
                  {
                    Slaev2.slaev2(paramArrayOfFloat1[(i3 - 1 - 1 + paramInt2)], paramArrayOfFloat2[(i3 - 1 - 1 + paramInt3)], paramArrayOfFloat1[(i3 - 1 + paramInt2)], localfloatW3, localfloatW4, localfloatW1, localfloatW5);
                    paramArrayOfFloat4[(i11 - 1 + paramInt6)] = localfloatW1.val;
                    paramArrayOfFloat4[(paramInt1 - 1 + i11 - 1 + paramInt6)] = localfloatW5.val;
                    Slasr.slasr("R", "V", "F", paramInt1, 2, paramArrayOfFloat4, i11 - 1 + paramInt6, paramArrayOfFloat4, paramInt1 - 1 + i11 - 1 + paramInt6, paramArrayOfFloat3, 1 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, paramInt5);
                  }
                  else
                  {
                    Slae2.slae2(paramArrayOfFloat1[(i3 - 1 - 1 + paramInt2)], paramArrayOfFloat2[(i3 - 1 - 1 + paramInt3)], paramArrayOfFloat1[(i3 - 1 + paramInt2)], localfloatW3, localfloatW4);
                  }
                  paramArrayOfFloat1[(i3 - 1 - 1 + paramInt2)] = localfloatW3.val;
                  paramArrayOfFloat1[(i3 - 1 + paramInt2)] = localfloatW4.val;
                  paramArrayOfFloat2[(i3 - 1 - 1 + paramInt3)] = 0.0F;
                  i3 -= 2;
                  if ((i3 < i5 ? 0 : 1) == 0) {
                    break;
                  }
                }
                else if ((i1 != i15 ? 0 : 1) == 0)
                {
                  i1 += 1;
                  f6 = (paramArrayOfFloat1[(i3 - 1 - 1 + paramInt2)] - f7) / (2.0F * paramArrayOfFloat2[(i3 - 1 - 1 + paramInt3)]);
                  localfloatW2.val = Slapy2.slapy2(f6, 1.0F);
                  f6 = paramArrayOfFloat1[(i11 - 1 + paramInt2)] - f7 + paramArrayOfFloat2[(i3 - 1 - 1 + paramInt3)] / (f6 + Util.sign(localfloatW2.val, f6));
                  localfloatW5.val = 1.0F;
                  localfloatW1.val = 1.0F;
                  f7 = 0.0F;
                  i9 = i3 - 1;
                  i = i11;
                  for (i16 = i9 - i11 + 1; i16 > 0; i16--)
                  {
                    f5 = localfloatW5.val * paramArrayOfFloat2[(i - 1 + paramInt3)];
                    f2 = localfloatW1.val * paramArrayOfFloat2[(i - 1 + paramInt3)];
                    Slartg.slartg(f6, f5, localfloatW1, localfloatW5, localfloatW2);
                    if ((i == i11 ? 0 : 1) != 0) {
                      paramArrayOfFloat2[(i - 1 - 1 + paramInt3)] = localfloatW2.val;
                    }
                    f6 = paramArrayOfFloat1[(i - 1 + paramInt2)] - f7;
                    localfloatW2.val = ((paramArrayOfFloat1[(i + 1 - 1 + paramInt2)] - f6) * localfloatW5.val + 2.0F * localfloatW1.val * f2);
                    f7 = localfloatW5.val * localfloatW2.val;
                    paramArrayOfFloat1[(i - 1 + paramInt2)] = (f6 + f7);
                    f6 = localfloatW1.val * localfloatW2.val - f2;
                    if ((j <= 0 ? 0 : 1) != 0)
                    {
                      paramArrayOfFloat4[(i - 1 + paramInt6)] = localfloatW1.val;
                      paramArrayOfFloat4[(paramInt1 - 1 + i - 1 + paramInt6)] = localfloatW5.val;
                    }
                    i += 1;
                  }
                  if ((j <= 0 ? 0 : 1) != 0)
                  {
                    i12 = i3 - i11 + 1;
                    Slasr.slasr("R", "V", "F", paramInt1, i12, paramArrayOfFloat4, i11 - 1 + paramInt6, paramArrayOfFloat4, paramInt1 - 1 + i11 - 1 + paramInt6, paramArrayOfFloat3, 1 - 1 + (i11 - 1) * paramInt5 + paramInt4, paramInt5);
                  }
                  paramArrayOfFloat1[(i3 - 1 + paramInt2)] -= f7;
                  paramArrayOfFloat2[(i9 - 1 + paramInt3)] = f6;
                }
              }
              else
              {
                paramArrayOfFloat1[(i3 - 1 + paramInt2)] = f7;
                i3 -= 1;
                if ((i3 < i5 ? 0 : 1) == 0) {
                  break;
                }
              }
            }
          }
          label2944:
          if ((m != 1 ? 0 : 1) != 0)
          {
            Slascl.slascl("G", 0, 0, f10, f1, i8 - i10 + 1, 1, paramArrayOfFloat1, i10 - 1 + paramInt2, paramInt1, paramintW);
            Slascl.slascl("G", 0, 0, f10, f1, i8 - i10, 1, paramArrayOfFloat2, i10 - 1 + paramInt3, paramInt1, paramintW);
          }
          else if ((m != 2 ? 0 : 1) != 0)
          {
            Slascl.slascl("G", 0, 0, f11, f1, i8 - i10 + 1, 1, paramArrayOfFloat1, i10 - 1 + paramInt2, paramInt1, paramintW);
            Slascl.slascl("G", 0, 0, f11, f1, i8 - i10, 1, paramArrayOfFloat2, i10 - 1 + paramInt3, paramInt1, paramintW);
          }
          if ((i1 >= i15 ? 0 : 1) == 0)
          {
            i = 1;
            for (i16 = paramInt1 - 1 - 1 + 1; i16 > 0; i16--)
            {
              if ((paramArrayOfFloat2[(i - 1 + paramInt3)] == 0.0F ? 0 : 1) != 0) {
                paramintW.val += 1;
              }
              i += 1;
            }
            return;
          }
        }
      }
    }
    if ((j != 0 ? 0 : 1) != 0)
    {
      Slasrt.slasrt("I", paramInt1, paramArrayOfFloat1, paramInt2, paramintW);
    }
    else
    {
      k = 2;
      for (i16 = paramInt1 - 2 + 1; i16 > 0; i16--)
      {
        i = k - 1;
        i2 = i;
        f7 = paramArrayOfFloat1[(i - 1 + paramInt2)];
        n = k;
        for (int i17 = paramInt1 - k + 1; i17 > 0; i17--)
        {
          if ((paramArrayOfFloat1[(n - 1 + paramInt2)] >= f7 ? 0 : 1) != 0)
          {
            i2 = n;
            f7 = paramArrayOfFloat1[(n - 1 + paramInt2)];
          }
          n += 1;
        }
        if ((i2 == i ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(i2 - 1 + paramInt2)] = paramArrayOfFloat1[(i - 1 + paramInt2)];
          paramArrayOfFloat1[(i - 1 + paramInt2)] = f7;
          Sswap.sswap(paramInt1, paramArrayOfFloat3, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i2 - 1) * paramInt5 + paramInt4, 1);
        }
        k += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ssteqr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */