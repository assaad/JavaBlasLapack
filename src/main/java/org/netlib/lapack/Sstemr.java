package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.booleanW;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sstemr
{
  public static void sstemr(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float paramFloat1, float paramFloat2, int paramInt4, int paramInt5, intW paramintW1, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, int paramInt8, int paramInt9, int[] paramArrayOfInt1, int paramInt10, booleanW parambooleanW, float[] paramArrayOfFloat5, int paramInt11, int paramInt12, int[] paramArrayOfInt2, int paramInt13, int paramInt14, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    boolean bool3 = false;
    boolean bool4 = false;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    intW localintW1 = new intW(0);
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
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    intW localintW4 = new intW(0);
    intW localintW5 = new intW(0);
    int i21 = 0;
    int i22 = 0;
    int i23 = 0;
    float f1 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f2 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    floatW localfloatW4 = new floatW(0.0F);
    float f3 = 0.0F;
    float f4 = 0.0F;
    floatW localfloatW5 = new floatW(0.0F);
    floatW localfloatW6 = new floatW(0.0F);
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    floatW localfloatW7 = new floatW(0.0F);
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    floatW localfloatW8 = new floatW(0.0F);
    floatW localfloatW9 = new floatW(0.0F);
    bool4 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "A");
    bool3 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
    if ((paramInt12 != -1 ? 0 : 1) == 0) {}
    i = (paramInt14 != -1 ? 0 : 1) == 0 ? 0 : 1;
    j = paramInt9 != -1 ? 0 : 1;
    parambooleanW.val = (paramintW2.val != 0);
    if (bool4)
    {
      i20 = 18 * paramInt1;
      i19 = 10 * paramInt1;
    }
    else
    {
      i20 = 12 * paramInt1;
      i19 = 8 * paramInt1;
    }
    localfloatW8.val = 0.0F;
    localfloatW9.val = 0.0F;
    i2 = 0;
    i7 = 0;
    if (bool3)
    {
      localfloatW8.val = paramFloat1;
      localfloatW9.val = paramFloat2;
    }
    else if (bool2)
    {
      i2 = paramInt4;
      i7 = paramInt5;
    }
    paramintW2.val = 0;
    if ((((!bool4) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW2.val = -1;
    }
    else
    {
      if (((!bool1) && (!bool3) ? 0 : 1) == 0) {}
      if (((!bool2 ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -2;
      }
      else if ((paramInt1 >= 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -3;
      }
      else
      {
        if (bool3) {}
        if (((paramInt1 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((localfloatW9.val > localfloatW8.val ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW2.val = -7;
        }
        else
        {
          if (bool2) {
            if ((i2 >= 1 ? 0 : 1) != 0) {}
          }
          if ((((i2 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            paramintW2.val = -8;
          }
          else
          {
            if (bool2) {
              if ((i7 >= i2 ? 0 : 1) != 0) {}
            }
            if ((((i7 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              paramintW2.val = -9;
            }
            else
            {
              if ((paramInt8 >= 1 ? 0 : 1) == 0) {
                if (!bool4) {}
              }
              if ((((paramInt8 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
              {
                paramintW2.val = -13;
              }
              else
              {
                if ((paramInt12 >= i20 ? 0 : 1) != 0) {}
                if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
                {
                  paramintW2.val = -17;
                }
                else
                {
                  if ((paramInt14 >= i19 ? 0 : 1) != 0) {}
                  if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
                    paramintW2.val = -19;
                  }
                }
              }
            }
          }
        }
      }
    }
    f5 = Slamch.slamch("Safe minimum");
    f2 = Slamch.slamch("Precision");
    f7 = f5 / f2;
    f1 = 1.0F / f7;
    f4 = (float)Math.sqrt(f7);
    f3 = Math.min((float)Math.sqrt(f1), 1.0F / (float)Math.sqrt((float)Math.sqrt(f5)));
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      paramArrayOfFloat5[(1 - 1 + paramInt11)] = i20;
      paramArrayOfInt2[(1 - 1 + paramInt13)] = i19;
      if (((bool4) && (bool1) ? 1 : 0) != 0) {
        localintW5.val = paramInt1;
      } else if (((bool4) && (bool3) ? 1 : 0) != 0) {
        Slarrc.slarrc("T", paramInt1, paramFloat1, paramFloat2, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, f5, localintW5, localintW2, localintW3, paramintW2);
      } else if (((bool4) && (bool2) ? 1 : 0) != 0) {
        localintW5.val = (i7 - i2 + 1);
      } else {
        localintW5.val = 0;
      }
      if (j != 0) {}
      if (((paramintW2.val != 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = localintW5.val;
      }
      else
      {
        if ((paramInt9 >= localintW5.val ? 0 : 1) != 0) {}
        if (((j ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -14;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SSTEMR", -paramintW2.val);
      return;
    }
    if (((i == 0) && (j == 0) ? 0 : 1) != 0) {
      return;
    }
    paramintW1.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if (((!bool1) && (!bool2) ? 0 : 1) != 0)
      {
        paramintW1.val = 1;
        paramArrayOfFloat3[(1 - 1 + paramInt6)] = paramArrayOfFloat1[(1 - 1 + paramInt2)];
      }
      else
      {
        if ((localfloatW8.val >= paramArrayOfFloat1[(1 - 1 + paramInt2)] ? 0 : 1) != 0) {}
        if (((localfloatW9.val < paramArrayOfFloat1[(1 - 1 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW1.val = 1;
          paramArrayOfFloat3[(1 - 1 + paramInt6)] = paramArrayOfFloat1[(1 - 1 + paramInt2)];
        }
      }
      if (((bool4) && ((j ^ 0x1) != 0) ? 1 : 0) != 0)
      {
        paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = 1.0F;
        paramArrayOfInt1[(1 - 1 + paramInt10)] = 1;
        paramArrayOfInt1[(2 - 1 + paramInt10)] = 1;
      }
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      if ((bool4 ^ true)) {
        Slae2.slae2(paramArrayOfFloat1[(1 - 1 + paramInt2)], paramArrayOfFloat2[(1 - 1 + paramInt3)], paramArrayOfFloat1[(2 - 1 + paramInt2)], localfloatW3, localfloatW4);
      } else if (((bool4) && ((j ^ 0x1) != 0) ? 1 : 0) != 0) {
        Slaev2.slaev2(paramArrayOfFloat1[(1 - 1 + paramInt2)], paramArrayOfFloat2[(1 - 1 + paramInt3)], paramArrayOfFloat1[(2 - 1 + paramInt2)], localfloatW3, localfloatW4, localfloatW1, localfloatW7);
      }
      if (!bool1)
      {
        if (bool3) {}
        if (((localfloatW4.val <= localfloatW8.val ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((localfloatW4.val > localfloatW9.val ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
        if (!bool2) {}
      }
      if ((((i2 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW1.val += 1;
        paramArrayOfFloat3[(paramintW1.val - 1 + paramInt6)] = localfloatW4.val;
        if (((bool4) && ((j ^ 0x1) != 0) ? 1 : 0) != 0)
        {
          paramArrayOfFloat4[(1 - 1 + (paramintW1.val - 1) * paramInt8 + paramInt7)] = (-localfloatW7.val);
          paramArrayOfFloat4[(2 - 1 + (paramintW1.val - 1) * paramInt8 + paramInt7)] = localfloatW1.val;
          if ((localfloatW7.val == 0.0F ? 0 : 1) != 0)
          {
            if ((localfloatW1.val == 0.0F ? 0 : 1) != 0)
            {
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 2;
            }
            else
            {
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
            }
          }
          else
          {
            paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 2;
            paramArrayOfInt1[(2 * paramintW1.val - 1 + paramInt10)] = 2;
          }
        }
      }
      if (!bool1)
      {
        if (bool3) {}
        if (((localfloatW3.val <= localfloatW8.val ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((localfloatW3.val > localfloatW9.val ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
        if (!bool2) {}
      }
      if ((((i7 != 2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW1.val += 1;
        paramArrayOfFloat3[(paramintW1.val - 1 + paramInt6)] = localfloatW3.val;
        if (((bool4) && ((j ^ 0x1) != 0) ? 1 : 0) != 0)
        {
          paramArrayOfFloat4[(1 - 1 + (paramintW1.val - 1) * paramInt8 + paramInt7)] = localfloatW1.val;
          paramArrayOfFloat4[(2 - 1 + (paramintW1.val - 1) * paramInt8 + paramInt7)] = localfloatW7.val;
          if ((localfloatW7.val == 0.0F ? 0 : 1) != 0)
          {
            if ((localfloatW1.val == 0.0F ? 0 : 1) != 0)
            {
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 2;
            }
            else
            {
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
            }
          }
          else
          {
            paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 2;
            paramArrayOfInt1[(2 * paramintW1.val - 1 + paramInt10)] = 2;
          }
        }
      }
      return;
    }
    i14 = 1;
    i12 = 2 * paramInt1 + 1;
    i13 = 3 * paramInt1 + 1;
    i10 = 4 * paramInt1 + 1;
    i11 = 5 * paramInt1 + 1;
    i15 = 6 * paramInt1 + 1;
    i6 = 1;
    i3 = paramInt1 + 1;
    i4 = 2 * paramInt1 + 1;
    i5 = 3 * paramInt1 + 1;
    f6 = 1.0F;
    f10 = Slanst.slanst("M", paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3);
    if ((f10 <= 0.0F ? 0 : 1) != 0) {}
    if (((f10 >= f4 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      f6 = f4 / f10;
    } else if ((f10 <= f3 ? 0 : 1) != 0) {
      f6 = f3 / f10;
    }
    if ((f6 == 1.0F ? 0 : 1) != 0)
    {
      Sscal.sscal(paramInt1, f6, paramArrayOfFloat1, paramInt2, 1);
      Sscal.sscal(paramInt1 - 1, f6, paramArrayOfFloat2, paramInt3, 1);
      f10 *= f6;
      if (bool3)
      {
        localfloatW8.val *= f6;
        localfloatW9.val *= f6;
      }
    }
    if (parambooleanW.val) {
      Slarrr.slarrr(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, localintW1);
    } else {
      localintW1.val = -1;
    }
    if ((localintW1.val != 0 ? 0 : 1) != 0)
    {
      f8 = f2;
    }
    else
    {
      f8 = -f2;
      parambooleanW.val = false;
    }
    if (parambooleanW.val) {
      Scopy.scopy(paramInt1, paramArrayOfFloat1, paramInt2, 1, paramArrayOfFloat5, i10 - 1 + paramInt11, 1);
    }
    i16 = 1;
    for (int i24 = paramInt1 - 1 - 1 + 1; i24 > 0; i24--)
    {
      paramArrayOfFloat5[(i11 + i16 - 1 - 1 + paramInt11)] = ((float)Math.pow(paramArrayOfFloat2[(i16 - 1 + paramInt3)], 2));
      i16 += 1;
    }
    if ((bool4 ^ true))
    {
      localfloatW5.val = (4.0F * f2);
      localfloatW6.val = (4.0F * f2);
    }
    else
    {
      localfloatW5.val = Math.max((float)Math.sqrt(f2) * 0.05F, 4.0F * f2);
      localfloatW6.val = Math.max((float)Math.sqrt(f2) * 0.005F, 4.0F * f2);
    }
    Slarre.slarre(paramString2, paramInt1, localfloatW8, localfloatW9, i2, i7, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfFloat5, i11 - 1 + paramInt11, localfloatW5.val, localfloatW6.val, f8, localintW4, paramArrayOfInt2, i6 - 1 + paramInt13, paramintW1, paramArrayOfFloat3, paramInt6, paramArrayOfFloat5, i12 - 1 + paramInt11, paramArrayOfFloat5, i13 - 1 + paramInt11, paramArrayOfInt2, i3 - 1 + paramInt13, paramArrayOfInt2, i4 - 1 + paramInt13, paramArrayOfFloat5, i14 - 1 + paramInt11, localfloatW2, paramArrayOfFloat5, i15 - 1 + paramInt11, paramArrayOfInt2, i5 - 1 + paramInt13, localintW1);
    if ((localintW1.val == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = (10 + Math.abs(localintW1.val));
      return;
    }
    if (bool4)
    {
      Slarrv.slarrv(paramInt1, localfloatW8.val, localfloatW9.val, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, localfloatW2.val, paramArrayOfInt2, i6 - 1 + paramInt13, paramintW1.val, 1, paramintW1.val, 0.003F, localfloatW5, localfloatW6, paramArrayOfFloat3, paramInt6, paramArrayOfFloat5, i12 - 1 + paramInt11, paramArrayOfFloat5, i13 - 1 + paramInt11, paramArrayOfInt2, i3 - 1 + paramInt13, paramArrayOfInt2, i4 - 1 + paramInt13, paramArrayOfFloat5, i14 - 1 + paramInt11, paramArrayOfFloat4, paramInt7, paramInt8, paramArrayOfInt1, paramInt10, paramArrayOfFloat5, i15 - 1 + paramInt11, paramArrayOfInt2, i5 - 1 + paramInt13, localintW1);
      if ((localintW1.val == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = (20 + Math.abs(localintW1.val));
        return;
      }
    }
    else
    {
      i16 = 1;
      for (i24 = paramintW1.val - 1 + 1; i24 > 0; i24--)
      {
        localintW2.val = paramArrayOfInt2[(i3 + i16 - 1 - 1 + paramInt13)];
        paramArrayOfFloat3[(i16 - 1 + paramInt6)] += paramArrayOfFloat2[(paramArrayOfInt2[(i6 + localintW2.val - 1 - 1 + paramInt13)] - 1 + paramInt3)];
        i16 += 1;
      }
    }
    if (parambooleanW.val)
    {
      m = 1;
      i22 = 1;
      i17 = 1;
      for (i24 = paramArrayOfInt2[(i3 + paramintW1.val - 1 - 1 + paramInt13)] - 1 + 1; i24 > 0; i24--)
      {
        n = paramArrayOfInt2[(i6 + i17 - 1 - 1 + paramInt13)];
        i9 = n - m + 1;
        i23 = i22 - 1;
        while ((i23 >= paramintW1.val ? 0 : 1) != 0)
        {
          if ((paramArrayOfInt2[(i3 + i23 - 1 + paramInt13)] != i17 ? 0 : 1) == 0) {
            break;
          }
          i23 += 1;
        }
        if ((i23 >= i22 ? 0 : 1) != 0)
        {
          m = n + 1;
        }
        else
        {
          i21 = paramArrayOfInt2[(i4 + i22 - 1 - 1 + paramInt13)] - 1;
          i1 = paramArrayOfInt2[(i4 + i22 - 1 - 1 + paramInt13)];
          i8 = paramArrayOfInt2[(i4 + i23 - 1 - 1 + paramInt13)];
          localfloatW6.val = (4.0F * f2);
          Slarrj.slarrj(i9, paramArrayOfFloat5, i10 + m - 1 - 1 + paramInt11, paramArrayOfFloat5, i11 + m - 1 - 1 + paramInt11, i1, i8, localfloatW6.val, i21, paramArrayOfFloat3, i22 - 1 + paramInt6, paramArrayOfFloat5, i12 + i22 - 1 - 1 + paramInt11, paramArrayOfFloat5, i15 - 1 + paramInt11, paramArrayOfInt2, i5 - 1 + paramInt13, localfloatW2.val, f10, localintW1);
          m = n + 1;
          i22 = i23 + 1;
        }
        i17 += 1;
      }
    }
    if ((f6 == 1.0F ? 0 : 1) != 0) {
      Sscal.sscal(paramintW1.val, 1.0F / f6, paramArrayOfFloat3, paramInt6, 1);
    }
    if ((localintW4.val <= 1 ? 0 : 1) != 0) {
      if ((bool4 ^ true))
      {
        Slasrt.slasrt("I", paramintW1.val, paramArrayOfFloat3, paramInt6, localintW1);
        if ((localintW1.val == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = 3;
          return;
        }
      }
      else
      {
        i16 = 1;
        for (i24 = paramintW1.val - 1 - 1 + 1; i24 > 0; i24--)
        {
          k = 0;
          f9 = paramArrayOfFloat3[(i16 - 1 + paramInt6)];
          i18 = i16 + 1;
          for (int i25 = paramintW1.val - (i16 + 1) + 1; i25 > 0; i25--)
          {
            if ((paramArrayOfFloat3[(i18 - 1 + paramInt6)] >= f9 ? 0 : 1) != 0)
            {
              k = i18;
              f9 = paramArrayOfFloat3[(i18 - 1 + paramInt6)];
            }
            i18 += 1;
          }
          if ((k == 0 ? 0 : 1) != 0)
          {
            paramArrayOfFloat3[(k - 1 + paramInt6)] = paramArrayOfFloat3[(i16 - 1 + paramInt6)];
            paramArrayOfFloat3[(i16 - 1 + paramInt6)] = f9;
            if (bool4)
            {
              Sswap.sswap(paramInt1, paramArrayOfFloat4, 1 - 1 + (k - 1) * paramInt8 + paramInt7, 1, paramArrayOfFloat4, 1 - 1 + (i16 - 1) * paramInt8 + paramInt7, 1);
              localintW2.val = paramArrayOfInt1[(2 * k - 1 - 1 + paramInt10)];
              paramArrayOfInt1[(2 * k - 1 - 1 + paramInt10)] = paramArrayOfInt1[(2 * i16 - 1 - 1 + paramInt10)];
              paramArrayOfInt1[(2 * i16 - 1 - 1 + paramInt10)] = localintW2.val;
              localintW2.val = paramArrayOfInt1[(2 * k - 1 + paramInt10)];
              paramArrayOfInt1[(2 * k - 1 + paramInt10)] = paramArrayOfInt1[(2 * i16 - 1 + paramInt10)];
              paramArrayOfInt1[(2 * i16 - 1 + paramInt10)] = localintW2.val;
            }
          }
          i16 += 1;
        }
      }
    }
    paramArrayOfFloat5[(1 - 1 + paramInt11)] = i20;
    paramArrayOfInt2[(1 - 1 + paramInt13)] = i19;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sstemr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */