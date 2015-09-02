package org.netlib.lapack;

import org.netlib.blas.Srot;
import org.netlib.blas.Sscal;
import org.netlib.blas.Sswap;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sbdsqr
{
  public static void sbdsqr(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, int paramInt10, float[] paramArrayOfFloat5, int paramInt11, int paramInt12, float[] paramArrayOfFloat6, int paramInt13, intW paramintW)
  {
    boolean bool = false;
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
    float f2 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    floatW localfloatW3 = new floatW(0.0F);
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    floatW localfloatW5 = new floatW(0.0F);
    floatW localfloatW6 = new floatW(0.0F);
    floatW localfloatW7 = new floatW(0.0F);
    floatW localfloatW8 = new floatW(0.0F);
    floatW localfloatW9 = new floatW(0.0F);
    floatW localfloatW10 = new floatW(0.0F);
    floatW localfloatW11 = new floatW(0.0F);
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    floatW localfloatW12 = new floatW(0.0F);
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "L");
    if ((((Lsame.lsame(paramString, "U") ^ true)) && ((bool ^ true)) ? 1 : 0) != 0)
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
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt4 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else
    {
      if ((paramInt2 != 0 ? 0 : 1) != 0) {}
      if (((paramInt8 >= 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        if ((paramInt2 <= 0 ? 0 : 1) == 0) {}
      }
      if ((((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else if ((paramInt10 >= Math.max(1, paramInt3) ? 0 : 1) != 0)
      {
        paramintW.val = -11;
      }
      else
      {
        if ((paramInt4 != 0 ? 0 : 1) != 0) {}
        if (((paramInt12 >= 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          if ((paramInt4 <= 0 ? 0 : 1) == 0) {}
        }
        if ((((paramInt12 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -13;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SBDSQR", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) == 0)
    {
      if ((paramInt2 <= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      i = (paramInt4 <= 0 ? 0 : 1) == 0 ? 0 : 1;
      if ((i ^ 0x1) != 0)
      {
        Slasq1.slasq1(paramInt1, paramArrayOfFloat1, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat6, paramInt13, paramintW);
        return;
      }
      i6 = paramInt1 - 1;
      i7 = i6 + i6;
      i8 = i7 + i6;
      k = 0;
      f3 = Slamch.slamch("Epsilon");
      f16 = Slamch.slamch("Safe minimum");
      if (bool)
      {
        j = 1;
        for (i11 = paramInt1 - 1 - 1 + 1; i11 > 0; i11--)
        {
          Slartg.slartg(paramArrayOfFloat1[(j - 1 + paramInt5)], paramArrayOfFloat2[(j - 1 + paramInt6)], localfloatW3, localfloatW12, localfloatW6);
          paramArrayOfFloat1[(j - 1 + paramInt5)] = localfloatW6.val;
          paramArrayOfFloat2[(j - 1 + paramInt6)] = (localfloatW12.val * paramArrayOfFloat1[(j + 1 - 1 + paramInt5)]);
          paramArrayOfFloat1[(j + 1 - 1 + paramInt5)] = (localfloatW3.val * paramArrayOfFloat1[(j + 1 - 1 + paramInt5)]);
          paramArrayOfFloat6[(j - 1 + paramInt13)] = localfloatW3.val;
          paramArrayOfFloat6[(i6 + j - 1 + paramInt13)] = localfloatW12.val;
          j += 1;
        }
        if ((paramInt3 <= 0 ? 0 : 1) != 0) {
          Slasr.slasr("R", "V", "F", paramInt3, paramInt1, paramArrayOfFloat6, 1 - 1 + paramInt13, paramArrayOfFloat6, paramInt1 - 1 + paramInt13, paramArrayOfFloat4, paramInt9, paramInt10);
        }
        if ((paramInt4 <= 0 ? 0 : 1) != 0) {
          Slasr.slasr("L", "V", "F", paramInt1, paramInt4, paramArrayOfFloat6, 1 - 1 + paramInt13, paramArrayOfFloat6, paramInt1 - 1 + paramInt13, paramArrayOfFloat5, paramInt11, paramInt12);
        }
      }
      f15 = Math.max(10.0F, Math.min(100.0F, (float)Math.pow(f3, -0.125F)));
      f14 = f15 * f3;
      f9 = 0.0F;
      j = 1;
      for (i11 = paramInt1 - 1 + 1; i11 > 0; i11--)
      {
        f9 = Math.max(f9, Math.abs(paramArrayOfFloat1[(j - 1 + paramInt5)]));
        j += 1;
      }
      j = 1;
      for (i11 = paramInt1 - 1 - 1 + 1; i11 > 0; i11--)
      {
        f9 = Math.max(f9, Math.abs(paramArrayOfFloat2[(j - 1 + paramInt6)]));
        j += 1;
      }
      f11 = 0.0F;
      if ((f14 < 0.0F ? 0 : 1) != 0)
      {
        f12 = Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt5)]);
        if ((f12 != 0.0F ? 0 : 1) == 0)
        {
          f7 = f12;
          j = 2;
          for (i11 = paramInt1 - 2 + 1; i11 > 0; i11--)
          {
            f7 = Math.abs(paramArrayOfFloat1[(j - 1 + paramInt5)]) * (f7 / (f7 + Math.abs(paramArrayOfFloat2[(j - 1 - 1 + paramInt6)])));
            f12 = Math.min(f12, f7);
            if ((f12 != 0.0F ? 0 : 1) != 0) {
              break;
            }
            j += 1;
          }
        }
        f12 /= (float)Math.sqrt(paramInt1);
        f13 = Math.max(f14 * f12, 6 * paramInt1 * paramInt1 * f16);
      }
      else
      {
        f13 = Math.max(Math.abs(f14) * f9, 6 * paramInt1 * paramInt1 * f16);
      }
      i5 = 6 * paramInt1 * paramInt1;
      n = 0;
      i9 = -1;
      i10 = -1;
      i4 = paramInt1;
      while ((i4 > 1 ? 0 : 1) == 0)
      {
        if ((n <= i5 ? 0 : 1) != 0) {
          break label6113;
        }
        if ((f14 >= 0.0F ? 0 : 1) != 0) {}
        if (((Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt5)]) > f13 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramArrayOfFloat1[(i4 - 1 + paramInt5)] = 0.0F;
        }
        f9 = Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt5)]);
        f10 = f9;
        i3 = 1;
        for (i11 = i4 - 1 - 1 + 1; i11 > 0; i11--)
        {
          i2 = i4 - i3;
          f2 = Math.abs(paramArrayOfFloat1[(i2 - 1 + paramInt5)]);
          f1 = Math.abs(paramArrayOfFloat2[(i2 - 1 + paramInt6)]);
          if ((f14 >= 0.0F ? 0 : 1) != 0) {}
          if (((f2 > f13 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramArrayOfFloat1[(i2 - 1 + paramInt5)] = 0.0F;
          }
          if ((f1 > f13 ? 0 : 1) != 0) {
            break;
          }
          f10 = Math.min(f10, f2);
          f9 = Util.max(f9, f2, f1);
          i3 += 1;
        }
        i2 = 0;
        break label1676;
        paramArrayOfFloat2[(i2 - 1 + paramInt6)] = 0.0F;
        if ((i2 != i4 - 1 ? 0 : 1) != 0)
        {
          i4 -= 1;
        }
        else
        {
          label1676:
          i2 += 1;
          if ((i2 != i4 - 1 ? 0 : 1) != 0)
          {
            Slasv2.slasv2(paramArrayOfFloat1[(i4 - 1 - 1 + paramInt5)], paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)], paramArrayOfFloat1[(i4 - 1 + paramInt5)], localfloatW8, localfloatW9, localfloatW11, localfloatW2, localfloatW10, localfloatW1);
            paramArrayOfFloat1[(i4 - 1 - 1 + paramInt5)] = localfloatW9.val;
            paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)] = 0.0F;
            paramArrayOfFloat1[(i4 - 1 + paramInt5)] = localfloatW8.val;
            if ((paramInt2 <= 0 ? 0 : 1) != 0) {
              Srot.srot(paramInt2, paramArrayOfFloat3, i4 - 1 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat3, i4 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, localfloatW2.val, localfloatW11.val);
            }
            if ((paramInt3 <= 0 ? 0 : 1) != 0) {
              Srot.srot(paramInt3, paramArrayOfFloat4, 1 - 1 + (i4 - 1 - 1) * paramInt10 + paramInt9, 1, paramArrayOfFloat4, 1 - 1 + (i4 - 1) * paramInt10 + paramInt9, 1, localfloatW1.val, localfloatW10.val);
            }
            if ((paramInt4 <= 0 ? 0 : 1) != 0) {
              Srot.srot(paramInt4, paramArrayOfFloat5, i4 - 1 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfFloat5, i4 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12, localfloatW1.val, localfloatW10.val);
            }
            i4 -= 2;
          }
          else
          {
            if ((i2 <= i10 ? 0 : 1) == 0) {}
            if (((i4 >= i9 ? 0 : 1) == 0 ? 0 : 1) != 0) {
              if ((Math.abs(paramArrayOfFloat1[(i2 - 1 + paramInt5)]) < Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt5)]) ? 0 : 1) != 0) {
                k = 1;
              } else {
                k = 2;
              }
            }
            if ((k != 1 ? 0 : 1) != 0)
            {
              if ((Math.abs(paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)]) > Math.abs(f14) * Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt5)]) ? 0 : 1) == 0) {
                if ((f14 >= 0.0F ? 0 : 1) == 0) {}
              }
              if ((((Math.abs(paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)]) > f13 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
              {
                paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)] = 0.0F;
                continue;
              }
              if ((f14 < 0.0F ? 0 : 1) != 0)
              {
                f7 = Math.abs(paramArrayOfFloat1[(i2 - 1 + paramInt5)]);
                f11 = f7;
                i3 = i2;
                for (i11 = i4 - 1 - i2 + 1; i11 > 0; i11--)
                {
                  if ((Math.abs(paramArrayOfFloat2[(i3 - 1 + paramInt6)]) > f14 * f7 ? 0 : 1) != 0)
                  {
                    paramArrayOfFloat2[(i3 - 1 + paramInt6)] = 0.0F;
                    break;
                  }
                  f7 = Math.abs(paramArrayOfFloat1[(i3 + 1 - 1 + paramInt5)]) * (f7 / (f7 + Math.abs(paramArrayOfFloat2[(i3 - 1 + paramInt6)])));
                  f11 = Math.min(f11, f7);
                  i3 += 1;
                }
              }
            }
            else
            {
              if ((Math.abs(paramArrayOfFloat2[(i2 - 1 + paramInt6)]) > Math.abs(f14) * Math.abs(paramArrayOfFloat1[(i2 - 1 + paramInt5)]) ? 0 : 1) == 0) {
                if ((f14 >= 0.0F ? 0 : 1) == 0) {}
              }
              if ((((Math.abs(paramArrayOfFloat2[(i2 - 1 + paramInt6)]) > f13 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
              {
                paramArrayOfFloat2[(i2 - 1 + paramInt6)] = 0.0F;
                continue;
              }
              if ((f14 < 0.0F ? 0 : 1) != 0)
              {
                f7 = Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt5)]);
                f11 = f7;
                i3 = i4 - 1;
                for (i11 = (i2 - (i4 - 1) + -1) / -1; i11 > 0; i11--)
                {
                  if ((Math.abs(paramArrayOfFloat2[(i3 - 1 + paramInt6)]) > f14 * f7 ? 0 : 1) != 0)
                  {
                    paramArrayOfFloat2[(i3 - 1 + paramInt6)] = 0.0F;
                    break;
                  }
                  f7 = Math.abs(paramArrayOfFloat1[(i3 - 1 + paramInt5)]) * (f7 / (f7 + Math.abs(paramArrayOfFloat2[(i3 - 1 + paramInt6)])));
                  f11 = Math.min(f11, f7);
                  i3 += -1;
                }
              }
            }
            i9 = i2;
            i10 = i4;
            if ((f14 < 0.0F ? 0 : 1) != 0) {}
            if (((paramInt1 * f14 * (f11 / f9) > Math.max(f3, 0.01F * f14) ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              localfloatW7.val = 0.0F;
            }
            else
            {
              if ((k != 1 ? 0 : 1) != 0)
              {
                f8 = Math.abs(paramArrayOfFloat1[(i2 - 1 + paramInt5)]);
                Slas2.slas2(paramArrayOfFloat1[(i4 - 1 - 1 + paramInt5)], paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)], paramArrayOfFloat1[(i4 - 1 + paramInt5)], localfloatW7, localfloatW6);
              }
              else
              {
                f8 = Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt5)]);
                Slas2.slas2(paramArrayOfFloat1[(i2 - 1 + paramInt5)], paramArrayOfFloat2[(i2 - 1 + paramInt6)], paramArrayOfFloat1[(i2 + 1 - 1 + paramInt5)], localfloatW7, localfloatW6);
              }
              if ((f8 <= 0.0F ? 0 : 1) != 0) {
                if (((float)Math.pow(localfloatW7.val / f8, 2) >= f3 ? 0 : 1) != 0) {
                  localfloatW7.val = 0.0F;
                }
              }
            }
            n = n + i4 - i2;
            if ((localfloatW7.val != 0.0F ? 0 : 1) != 0)
            {
              if ((k != 1 ? 0 : 1) != 0)
              {
                localfloatW3.val = 1.0F;
                localfloatW4.val = 1.0F;
                j = i2;
                for (i11 = i4 - 1 - i2 + 1; i11 > 0; i11--)
                {
                  Slartg.slartg(paramArrayOfFloat1[(j - 1 + paramInt5)] * localfloatW3.val, paramArrayOfFloat2[(j - 1 + paramInt6)], localfloatW3, localfloatW12, localfloatW6);
                  if ((j <= i2 ? 0 : 1) != 0) {
                    paramArrayOfFloat2[(j - 1 - 1 + paramInt6)] = (localfloatW5.val * localfloatW6.val);
                  }
                  slartg_adapter(localfloatW4.val * localfloatW6.val, paramArrayOfFloat1[(j + 1 - 1 + paramInt5)] * localfloatW12.val, localfloatW4, localfloatW5, paramArrayOfFloat1, j - 1 + paramInt5);
                  paramArrayOfFloat6[(j - i2 + 1 - 1 + paramInt13)] = localfloatW3.val;
                  paramArrayOfFloat6[(j - i2 + 1 + i6 - 1 + paramInt13)] = localfloatW12.val;
                  paramArrayOfFloat6[(j - i2 + 1 + i7 - 1 + paramInt13)] = localfloatW4.val;
                  paramArrayOfFloat6[(j - i2 + 1 + i8 - 1 + paramInt13)] = localfloatW5.val;
                  j += 1;
                }
                f6 = paramArrayOfFloat1[(i4 - 1 + paramInt5)] * localfloatW3.val;
                paramArrayOfFloat1[(i4 - 1 + paramInt5)] = (f6 * localfloatW4.val);
                paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)] = (f6 * localfloatW5.val);
                if ((paramInt2 <= 0 ? 0 : 1) != 0) {
                  Slasr.slasr("L", "V", "F", i4 - i2 + 1, paramInt2, paramArrayOfFloat6, 1 - 1 + paramInt13, paramArrayOfFloat6, paramInt1 - 1 + paramInt13, paramArrayOfFloat3, i2 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
                }
                if ((paramInt3 <= 0 ? 0 : 1) != 0) {
                  Slasr.slasr("R", "V", "F", paramInt3, i4 - i2 + 1, paramArrayOfFloat6, i7 + 1 - 1 + paramInt13, paramArrayOfFloat6, i8 + 1 - 1 + paramInt13, paramArrayOfFloat4, 1 - 1 + (i2 - 1) * paramInt10 + paramInt9, paramInt10);
                }
                if ((paramInt4 <= 0 ? 0 : 1) != 0) {
                  Slasr.slasr("L", "V", "F", i4 - i2 + 1, paramInt4, paramArrayOfFloat6, i7 + 1 - 1 + paramInt13, paramArrayOfFloat6, i8 + 1 - 1 + paramInt13, paramArrayOfFloat5, i2 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12);
                }
                if ((Math.abs(paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)]) > f13 ? 0 : 1) != 0) {
                  paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)] = 0.0F;
                }
              }
              else
              {
                localfloatW3.val = 1.0F;
                localfloatW4.val = 1.0F;
                j = i4;
                for (i11 = (i2 + 1 - i4 + -1) / -1; i11 > 0; i11--)
                {
                  Slartg.slartg(paramArrayOfFloat1[(j - 1 + paramInt5)] * localfloatW3.val, paramArrayOfFloat2[(j - 1 - 1 + paramInt6)], localfloatW3, localfloatW12, localfloatW6);
                  if ((j >= i4 ? 0 : 1) != 0) {
                    paramArrayOfFloat2[(j - 1 + paramInt6)] = (localfloatW5.val * localfloatW6.val);
                  }
                  slartg_adapter(localfloatW4.val * localfloatW6.val, paramArrayOfFloat1[(j - 1 - 1 + paramInt5)] * localfloatW12.val, localfloatW4, localfloatW5, paramArrayOfFloat1, j - 1 + paramInt5);
                  paramArrayOfFloat6[(j - i2 - 1 + paramInt13)] = localfloatW3.val;
                  paramArrayOfFloat6[(j - i2 + i6 - 1 + paramInt13)] = (-localfloatW12.val);
                  paramArrayOfFloat6[(j - i2 + i7 - 1 + paramInt13)] = localfloatW4.val;
                  paramArrayOfFloat6[(j - i2 + i8 - 1 + paramInt13)] = (-localfloatW5.val);
                  j += -1;
                }
                f6 = paramArrayOfFloat1[(i2 - 1 + paramInt5)] * localfloatW3.val;
                paramArrayOfFloat1[(i2 - 1 + paramInt5)] = (f6 * localfloatW4.val);
                paramArrayOfFloat2[(i2 - 1 + paramInt6)] = (f6 * localfloatW5.val);
                if ((paramInt2 <= 0 ? 0 : 1) != 0) {
                  Slasr.slasr("L", "V", "B", i4 - i2 + 1, paramInt2, paramArrayOfFloat6, i7 + 1 - 1 + paramInt13, paramArrayOfFloat6, i8 + 1 - 1 + paramInt13, paramArrayOfFloat3, i2 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
                }
                if ((paramInt3 <= 0 ? 0 : 1) != 0) {
                  Slasr.slasr("R", "V", "B", paramInt3, i4 - i2 + 1, paramArrayOfFloat6, 1 - 1 + paramInt13, paramArrayOfFloat6, paramInt1 - 1 + paramInt13, paramArrayOfFloat4, 1 - 1 + (i2 - 1) * paramInt10 + paramInt9, paramInt10);
                }
                if ((paramInt4 <= 0 ? 0 : 1) != 0) {
                  Slasr.slasr("L", "V", "B", i4 - i2 + 1, paramInt4, paramArrayOfFloat6, 1 - 1 + paramInt13, paramArrayOfFloat6, paramInt1 - 1 + paramInt13, paramArrayOfFloat5, i2 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12);
                }
                if ((Math.abs(paramArrayOfFloat2[(i2 - 1 + paramInt6)]) > f13 ? 0 : 1) != 0) {
                  paramArrayOfFloat2[(i2 - 1 + paramInt6)] = 0.0F;
                }
              }
            }
            else if ((k != 1 ? 0 : 1) != 0)
            {
              f4 = (Math.abs(paramArrayOfFloat1[(i2 - 1 + paramInt5)]) - localfloatW7.val) * (Util.sign(1.0F, paramArrayOfFloat1[(i2 - 1 + paramInt5)]) + localfloatW7.val / paramArrayOfFloat1[(i2 - 1 + paramInt5)]);
              f5 = paramArrayOfFloat2[(i2 - 1 + paramInt6)];
              j = i2;
              for (i11 = i4 - 1 - i2 + 1; i11 > 0; i11--)
              {
                Slartg.slartg(f4, f5, localfloatW2, localfloatW11, localfloatW6);
                if ((j <= i2 ? 0 : 1) != 0) {
                  paramArrayOfFloat2[(j - 1 - 1 + paramInt6)] = localfloatW6.val;
                }
                f4 = localfloatW2.val * paramArrayOfFloat1[(j - 1 + paramInt5)] + localfloatW11.val * paramArrayOfFloat2[(j - 1 + paramInt6)];
                paramArrayOfFloat2[(j - 1 + paramInt6)] = (localfloatW2.val * paramArrayOfFloat2[(j - 1 + paramInt6)] - localfloatW11.val * paramArrayOfFloat1[(j - 1 + paramInt5)]);
                f5 = localfloatW11.val * paramArrayOfFloat1[(j + 1 - 1 + paramInt5)];
                paramArrayOfFloat1[(j + 1 - 1 + paramInt5)] = (localfloatW2.val * paramArrayOfFloat1[(j + 1 - 1 + paramInt5)]);
                Slartg.slartg(f4, f5, localfloatW1, localfloatW10, localfloatW6);
                paramArrayOfFloat1[(j - 1 + paramInt5)] = localfloatW6.val;
                f4 = localfloatW1.val * paramArrayOfFloat2[(j - 1 + paramInt6)] + localfloatW10.val * paramArrayOfFloat1[(j + 1 - 1 + paramInt5)];
                paramArrayOfFloat1[(j + 1 - 1 + paramInt5)] = (localfloatW1.val * paramArrayOfFloat1[(j + 1 - 1 + paramInt5)] - localfloatW10.val * paramArrayOfFloat2[(j - 1 + paramInt6)]);
                if ((j >= i4 - 1 ? 0 : 1) != 0)
                {
                  f5 = localfloatW10.val * paramArrayOfFloat2[(j + 1 - 1 + paramInt6)];
                  paramArrayOfFloat2[(j + 1 - 1 + paramInt6)] = (localfloatW1.val * paramArrayOfFloat2[(j + 1 - 1 + paramInt6)]);
                }
                paramArrayOfFloat6[(j - i2 + 1 - 1 + paramInt13)] = localfloatW2.val;
                paramArrayOfFloat6[(j - i2 + 1 + i6 - 1 + paramInt13)] = localfloatW11.val;
                paramArrayOfFloat6[(j - i2 + 1 + i7 - 1 + paramInt13)] = localfloatW1.val;
                paramArrayOfFloat6[(j - i2 + 1 + i8 - 1 + paramInt13)] = localfloatW10.val;
                j += 1;
              }
              paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)] = f4;
              if ((paramInt2 <= 0 ? 0 : 1) != 0) {
                Slasr.slasr("L", "V", "F", i4 - i2 + 1, paramInt2, paramArrayOfFloat6, 1 - 1 + paramInt13, paramArrayOfFloat6, paramInt1 - 1 + paramInt13, paramArrayOfFloat3, i2 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
              }
              if ((paramInt3 <= 0 ? 0 : 1) != 0) {
                Slasr.slasr("R", "V", "F", paramInt3, i4 - i2 + 1, paramArrayOfFloat6, i7 + 1 - 1 + paramInt13, paramArrayOfFloat6, i8 + 1 - 1 + paramInt13, paramArrayOfFloat4, 1 - 1 + (i2 - 1) * paramInt10 + paramInt9, paramInt10);
              }
              if ((paramInt4 <= 0 ? 0 : 1) != 0) {
                Slasr.slasr("L", "V", "F", i4 - i2 + 1, paramInt4, paramArrayOfFloat6, i7 + 1 - 1 + paramInt13, paramArrayOfFloat6, i8 + 1 - 1 + paramInt13, paramArrayOfFloat5, i2 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12);
              }
              if ((Math.abs(paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)]) > f13 ? 0 : 1) != 0) {
                paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)] = 0.0F;
              }
            }
            else
            {
              f4 = (Math.abs(paramArrayOfFloat1[(i4 - 1 + paramInt5)]) - localfloatW7.val) * (Util.sign(1.0F, paramArrayOfFloat1[(i4 - 1 + paramInt5)]) + localfloatW7.val / paramArrayOfFloat1[(i4 - 1 + paramInt5)]);
              f5 = paramArrayOfFloat2[(i4 - 1 - 1 + paramInt6)];
              j = i4;
              for (i11 = (i2 + 1 - i4 + -1) / -1; i11 > 0; i11--)
              {
                Slartg.slartg(f4, f5, localfloatW2, localfloatW11, localfloatW6);
                if ((j >= i4 ? 0 : 1) != 0) {
                  paramArrayOfFloat2[(j - 1 + paramInt6)] = localfloatW6.val;
                }
                f4 = localfloatW2.val * paramArrayOfFloat1[(j - 1 + paramInt5)] + localfloatW11.val * paramArrayOfFloat2[(j - 1 - 1 + paramInt6)];
                paramArrayOfFloat2[(j - 1 - 1 + paramInt6)] = (localfloatW2.val * paramArrayOfFloat2[(j - 1 - 1 + paramInt6)] - localfloatW11.val * paramArrayOfFloat1[(j - 1 + paramInt5)]);
                f5 = localfloatW11.val * paramArrayOfFloat1[(j - 1 - 1 + paramInt5)];
                paramArrayOfFloat1[(j - 1 - 1 + paramInt5)] = (localfloatW2.val * paramArrayOfFloat1[(j - 1 - 1 + paramInt5)]);
                Slartg.slartg(f4, f5, localfloatW1, localfloatW10, localfloatW6);
                paramArrayOfFloat1[(j - 1 + paramInt5)] = localfloatW6.val;
                f4 = localfloatW1.val * paramArrayOfFloat2[(j - 1 - 1 + paramInt6)] + localfloatW10.val * paramArrayOfFloat1[(j - 1 - 1 + paramInt5)];
                paramArrayOfFloat1[(j - 1 - 1 + paramInt5)] = (localfloatW1.val * paramArrayOfFloat1[(j - 1 - 1 + paramInt5)] - localfloatW10.val * paramArrayOfFloat2[(j - 1 - 1 + paramInt6)]);
                if ((j <= i2 + 1 ? 0 : 1) != 0)
                {
                  f5 = localfloatW10.val * paramArrayOfFloat2[(j - 2 - 1 + paramInt6)];
                  paramArrayOfFloat2[(j - 2 - 1 + paramInt6)] = (localfloatW1.val * paramArrayOfFloat2[(j - 2 - 1 + paramInt6)]);
                }
                paramArrayOfFloat6[(j - i2 - 1 + paramInt13)] = localfloatW2.val;
                paramArrayOfFloat6[(j - i2 + i6 - 1 + paramInt13)] = (-localfloatW11.val);
                paramArrayOfFloat6[(j - i2 + i7 - 1 + paramInt13)] = localfloatW1.val;
                paramArrayOfFloat6[(j - i2 + i8 - 1 + paramInt13)] = (-localfloatW10.val);
                j += -1;
              }
              paramArrayOfFloat2[(i2 - 1 + paramInt6)] = f4;
              if ((Math.abs(paramArrayOfFloat2[(i2 - 1 + paramInt6)]) > f13 ? 0 : 1) != 0) {
                paramArrayOfFloat2[(i2 - 1 + paramInt6)] = 0.0F;
              }
              if ((paramInt2 <= 0 ? 0 : 1) != 0) {
                Slasr.slasr("L", "V", "B", i4 - i2 + 1, paramInt2, paramArrayOfFloat6, i7 + 1 - 1 + paramInt13, paramArrayOfFloat6, i8 + 1 - 1 + paramInt13, paramArrayOfFloat3, i2 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
              }
              if ((paramInt3 <= 0 ? 0 : 1) != 0) {
                Slasr.slasr("R", "V", "B", paramInt3, i4 - i2 + 1, paramArrayOfFloat6, 1 - 1 + paramInt13, paramArrayOfFloat6, paramInt1 - 1 + paramInt13, paramArrayOfFloat4, 1 - 1 + (i2 - 1) * paramInt10 + paramInt9, paramInt10);
              }
              if ((paramInt4 <= 0 ? 0 : 1) != 0) {
                Slasr.slasr("L", "V", "B", i4 - i2 + 1, paramInt4, paramArrayOfFloat6, 1 - 1 + paramInt13, paramArrayOfFloat6, paramInt1 - 1 + paramInt13, paramArrayOfFloat5, i2 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12);
              }
            }
          }
        }
      }
    }
    j = 1;
    for (int i11 = paramInt1 - 1 + 1; i11 > 0; i11--)
    {
      if ((paramArrayOfFloat1[(j - 1 + paramInt5)] >= 0.0F ? 0 : 1) != 0)
      {
        paramArrayOfFloat1[(j - 1 + paramInt5)] = (-paramArrayOfFloat1[(j - 1 + paramInt5)]);
        if ((paramInt2 <= 0 ? 0 : 1) != 0) {
          Sscal.sscal(paramInt2, -1.0F, paramArrayOfFloat3, j - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        }
      }
      j += 1;
    }
    j = 1;
    for (i11 = paramInt1 - 1 - 1 + 1; i11 > 0; i11--)
    {
      m = 1;
      f10 = paramArrayOfFloat1[(1 - 1 + paramInt5)];
      i1 = 2;
      for (int i12 = paramInt1 + 1 - j - 2 + 1; i12 > 0; i12--)
      {
        if ((paramArrayOfFloat1[(i1 - 1 + paramInt5)] > f10 ? 0 : 1) != 0)
        {
          m = i1;
          f10 = paramArrayOfFloat1[(i1 - 1 + paramInt5)];
        }
        i1 += 1;
      }
      if ((m == paramInt1 + 1 - j ? 0 : 1) != 0)
      {
        paramArrayOfFloat1[(m - 1 + paramInt5)] = paramArrayOfFloat1[(paramInt1 + 1 - j - 1 + paramInt5)];
        paramArrayOfFloat1[(paramInt1 + 1 - j - 1 + paramInt5)] = f10;
        if ((paramInt2 <= 0 ? 0 : 1) != 0) {
          Sswap.sswap(paramInt2, paramArrayOfFloat3, m - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat3, paramInt1 + 1 - j - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        }
        if ((paramInt3 <= 0 ? 0 : 1) != 0) {
          Sswap.sswap(paramInt3, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt10 + paramInt9, 1, paramArrayOfFloat4, 1 - 1 + (paramInt1 + 1 - j - 1) * paramInt10 + paramInt9, 1);
        }
        if ((paramInt4 <= 0 ? 0 : 1) != 0) {
          Sswap.sswap(paramInt4, paramArrayOfFloat5, m - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfFloat5, paramInt1 + 1 - j - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12);
        }
      }
      j += 1;
    }
    return;
    label6113:
    paramintW.val = 0;
    j = 1;
    for (i11 = paramInt1 - 1 - 1 + 1; i11 > 0; i11--)
    {
      if ((paramArrayOfFloat2[(j - 1 + paramInt6)] == 0.0F ? 0 : 1) != 0) {
        paramintW.val += 1;
      }
      j += 1;
    }
  }
  
  private static void slartg_adapter(float paramFloat1, float paramFloat2, floatW paramfloatW1, floatW paramfloatW2, float[] paramArrayOfFloat, int paramInt)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat[paramInt]);
    Slartg.slartg(paramFloat1, paramFloat2, paramfloatW1, paramfloatW2, localfloatW);
    paramArrayOfFloat[paramInt] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sbdsqr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */