package org.netlib.lapack;

import org.netlib.blas.Srot;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Shgeqz
{
  public static void shgeqz(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, float[] paramArrayOfFloat6, int paramInt11, int paramInt12, float[] paramArrayOfFloat7, int paramInt13, int paramInt14, float[] paramArrayOfFloat8, int paramInt15, int paramInt16, intW paramintW)
  {
    ;
    ;
    ;
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
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = 0.0F;
    float f14 = 0.0F;
    float f15 = 0.0F;
    float f16 = 0.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    float f22 = 0.0F;
    float f23 = 0.0F;
    float f24 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f25 = 0.0F;
    float f26 = 0.0F;
    float f27 = 0.0F;
    float f28 = 0.0F;
    float f29 = 0.0F;
    float f30 = 0.0F;
    float f31 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    float f32 = 0.0F;
    float f33 = 0.0F;
    float f34 = 0.0F;
    float f35 = 0.0F;
    float f36 = 0.0F;
    float f37 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    float f38 = 0.0F;
    floatW localfloatW5 = new floatW(0.0F);
    float f39 = 0.0F;
    float f40 = 0.0F;
    floatW localfloatW6 = new floatW(0.0F);
    floatW localfloatW7 = new floatW(0.0F);
    float f41 = 0.0F;
    floatW localfloatW8 = new floatW(0.0F);
    float f42 = 0.0F;
    float f43 = 0.0F;
    float f44 = 0.0F;
    floatW localfloatW9 = new floatW(0.0F);
    float f45 = 0.0F;
    float f46 = 0.0F;
    floatW localfloatW10 = new floatW(0.0F);
    float f47 = 0.0F;
    float f48 = 0.0F;
    float f49 = 0.0F;
    floatW localfloatW11 = new floatW(0.0F);
    floatW localfloatW12 = new floatW(0.0F);
    floatW localfloatW13 = new floatW(0.0F);
    float f50 = 0.0F;
    floatW localfloatW14 = new floatW(0.0F);
    float f51 = 0.0F;
    float f52 = 0.0F;
    float f53 = 0.0F;
    float f54 = 0.0F;
    float f55 = 0.0F;
    float f56 = 0.0F;
    float f57 = 0.0F;
    float f58 = 0.0F;
    float f59 = 0.0F;
    float f60 = 0.0F;
    float f61 = 0.0F;
    floatW localfloatW15 = new floatW(0.0F);
    floatW localfloatW16 = new floatW(0.0F);
    floatW localfloatW17 = new floatW(0.0F);
    float[] arrayOfFloat = new float[3];
    if (Lsame.lsame(paramString1, "E"))
    {
      n = 0;
      i11 = 1;
    }
    else if (Lsame.lsame(paramString1, "S"))
    {
      n = 1;
      i11 = 2;
    }
    else
    {
      i11 = 0;
    }
    if (Lsame.lsame(paramString2, "N"))
    {
      m = 0;
      i3 = 1;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      m = 1;
      i3 = 2;
    }
    else if (Lsame.lsame(paramString2, "I"))
    {
      m = 1;
      i3 = 3;
    }
    else
    {
      i3 = 0;
    }
    if (Lsame.lsame(paramString3, "N"))
    {
      i1 = 0;
      i4 = 1;
    }
    else if (Lsame.lsame(paramString3, "V"))
    {
      i1 = 1;
      i4 = 2;
    }
    else if (Lsame.lsame(paramString3, "I"))
    {
      i1 = 1;
      i4 = 3;
    }
    else
    {
      i4 = 0;
    }
    paramintW.val = 0;
    paramArrayOfFloat8[(1 - 1 + paramInt15)] = Math.max(1, paramInt1);
    i2 = paramInt16 != -1 ? 0 : 1;
    if ((i11 != 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((i3 != 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((i4 != 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else
    {
      if ((paramInt3 <= paramInt1 ? 0 : 1) == 0) {}
      if (((paramInt3 >= paramInt2 - 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -6;
      }
      else if ((paramInt5 >= paramInt1 ? 0 : 1) != 0)
      {
        paramintW.val = -8;
      }
      else if ((paramInt7 >= paramInt1 ? 0 : 1) != 0)
      {
        paramintW.val = -10;
      }
      else
      {
        if ((paramInt12 >= 1 ? 0 : 1) == 0) {
          if (m == 0) {}
        }
        if ((((paramInt12 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -15;
        }
        else
        {
          if ((paramInt14 >= 1 ? 0 : 1) == 0) {
            if (i1 == 0) {}
          }
          if ((((paramInt14 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
          {
            paramintW.val = -17;
          }
          else
          {
            if ((paramInt16 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {}
            if (((i2 ^ 0x1) != 0 ? 1 : 0) != 0) {
              paramintW.val = -19;
            }
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SHGEQZ", -paramintW.val);
      return;
    }
    if (i2 != 0) {
      return;
    }
    if ((paramInt1 > 0 ? 0 : 1) != 0)
    {
      paramArrayOfFloat8[(1 - 1 + paramInt15)] = 1;
      return;
    }
    if ((i3 != 3 ? 0 : 1) != 0) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat6, paramInt11, paramInt12);
    }
    if ((i4 != 3 ? 0 : 1) != 0) {
      Slaset.slaset("Full", paramInt1, paramInt1, 0.0F, 1.0F, paramArrayOfFloat7, paramInt13, paramInt14);
    }
    i10 = paramInt3 + 1 - paramInt2;
    f43 = Slamch.slamch("S");
    f42 = 1.0F / f43;
    f55 = Slamch.slamch("E") * Slamch.slamch("B");
    f19 = Slanhs.slanhs("F", i10, paramArrayOfFloat1, paramInt2 - 1 + (paramInt2 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat8, paramInt15);
    f29 = Slanhs.slanhs("F", i10, paramArrayOfFloat2, paramInt2 - 1 + (paramInt2 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat8, paramInt15);
    f21 = Math.max(f43, f55 * f19);
    f31 = Math.max(f43, f55 * f29);
    f20 = 1.0F / Math.max(f43, f19);
    f30 = 1.0F / Math.max(f43, f29);
    i13 = paramInt3 + 1;
    int i19 = paramInt1 - (paramInt3 + 1) + 1;
    int i20;
    while (i19 > 0)
    {
      if ((paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)] >= 0.0F ? 0 : 1) != 0)
      {
        if (n != 0)
        {
          i17 = 1;
          i20 = i13 - 1 + 1;
          while (i20 > 0)
          {
            paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
            i17 += 1;
            ???--;
          }
        }
        else
        {
          paramArrayOfFloat1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfFloat1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
          paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
        }
        if (i1 != 0)
        {
          i17 = 1;
          i20 = paramInt1 - 1 + 1;
          while (i20 > 0)
          {
            paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] = (-paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
            i17 += 1;
            ???--;
          }
        }
      }
      paramArrayOfFloat3[(i13 - 1 + paramInt8)] = paramArrayOfFloat1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)];
      paramArrayOfFloat4[(i13 - 1 + paramInt9)] = 0.0F;
      paramArrayOfFloat5[(i13 - 1 + paramInt10)] = paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
      i13 += 1;
      ???--;
    }
    if ((paramInt3 >= paramInt2 ? 0 : 1) == 0)
    {
      i8 = paramInt3;
      if (n != 0)
      {
        i6 = 1;
        i9 = paramInt1;
      }
      else
      {
        i6 = paramInt2;
        i9 = paramInt3;
      }
      i7 = 0;
      f40 = 0.0F;
      i18 = 30 * (paramInt3 - paramInt2 + 1);
      i16 = 1;
      i19 = i18 - 1 + 1;
      label3623:
      label4039:
      label6204:
      label10365:
      label12604:
      while (i19 > 0)
      {
        int i21;
        if ((i8 != paramInt2 ? 0 : 1) != 0)
        {
          break label3623;
        }
        else if ((Math.abs(paramArrayOfFloat1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)]) > f21 ? 0 : 1) != 0)
        {
          paramArrayOfFloat1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
        }
        else
        {
          if ((Math.abs(paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)]) > f31 ? 0 : 1) != 0)
          {
            paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = 0.0F;
          }
          else
          {
            i13 = i8 - 1;
            i20 = (paramInt2 - (i8 - 1) + -1) / -1;
            while (i20 > 0)
            {
              if ((i13 != paramInt2 ? 0 : 1) != 0)
              {
                j = 1;
              }
              else if ((Math.abs(paramArrayOfFloat1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)]) > f21 ? 0 : 1) != 0)
              {
                paramArrayOfFloat1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
                j = 1;
              }
              else
              {
                j = 0;
              }
              if ((Math.abs(paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)]) >= f31 ? 0 : 1) != 0)
              {
                paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = 0.0F;
                i = 0;
                if ((j ^ 0x1) != 0)
                {
                  localfloatW12.val = Math.abs(paramArrayOfFloat1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)]);
                  localfloatW13.val = Math.abs(paramArrayOfFloat1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
                  localfloatW14.val = Math.max(localfloatW12.val, localfloatW13.val);
                  if ((localfloatW14.val >= 1.0F ? 0 : 1) != 0) {}
                  if (((localfloatW14.val == 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
                  {
                    localfloatW12.val /= localfloatW14.val;
                    localfloatW13.val /= localfloatW14.val;
                  }
                  if ((localfloatW12.val * (f20 * Math.abs(paramArrayOfFloat1[(i13 + 1 - 1 + (i13 - 1) * paramInt5 + paramInt4)])) > localfloatW13.val * (f20 * f21) ? 0 : 1) != 0) {
                    i = 1;
                  }
                }
                if (((j == 0) && (i == 0) ? 0 : 1) != 0)
                {
                  i15 = i13;
                  i21 = i8 - 1 - i13 + 1;
                  while (i21 > 0)
                  {
                    localfloatW12.val = paramArrayOfFloat1[(i15 - 1 + (i15 - 1) * paramInt5 + paramInt4)];
                    slartg_adapter(localfloatW12.val, paramArrayOfFloat1[(i15 + 1 - 1 + (i15 - 1) * paramInt5 + paramInt4)], localfloatW3, localfloatW6, paramArrayOfFloat1, i15 - 1 + (i15 - 1) * paramInt5 + paramInt4);
                    paramArrayOfFloat1[(i15 + 1 - 1 + (i15 - 1) * paramInt5 + paramInt4)] = 0.0F;
                    Srot.srot(i9 - i15, paramArrayOfFloat1, i15 - 1 + (i15 + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i15 + 1 - 1 + (i15 + 1 - 1) * paramInt5 + paramInt4, paramInt5, localfloatW3.val, localfloatW6.val);
                    Srot.srot(i9 - i15, paramArrayOfFloat2, i15 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, i15 + 1 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6, paramInt7, localfloatW3.val, localfloatW6.val);
                    if (m != 0) {
                      Srot.srot(paramInt1, paramArrayOfFloat6, 1 - 1 + (i15 - 1) * paramInt12 + paramInt11, 1, paramArrayOfFloat6, 1 - 1 + (i15 + 1 - 1) * paramInt12 + paramInt11, 1, localfloatW3.val, localfloatW6.val);
                    }
                    if (i != 0) {
                      paramArrayOfFloat1[(i15 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4)] *= localfloatW3.val;
                    }
                    i = 0;
                    if ((Math.abs(paramArrayOfFloat2[(i15 + 1 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6)]) < f31 ? 0 : 1) != 0)
                    {
                      if ((i15 + 1 < i8 ? 0 : 1) != 0) {
                        break;
                      }
                      i5 = i15 + 1;
                      break label4039;
                    }
                    paramArrayOfFloat2[(i15 + 1 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6)] = 0.0F;
                    i15 += 1;
                    ???--;
                  }
                  break;
                }
                i15 = i13;
                i21 = i8 - 1 - i13 + 1;
                while (i21 > 0)
                {
                  localfloatW12.val = paramArrayOfFloat2[(i15 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6)];
                  slartg_adapter(localfloatW12.val, paramArrayOfFloat2[(i15 + 1 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6)], localfloatW3, localfloatW6, paramArrayOfFloat2, i15 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6);
                  paramArrayOfFloat2[(i15 + 1 - 1 + (i15 + 1 - 1) * paramInt7 + paramInt6)] = 0.0F;
                  if ((i15 >= i9 - 1 ? 0 : 1) != 0) {
                    Srot.srot(i9 - i15 - 1, paramArrayOfFloat2, i15 - 1 + (i15 + 2 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, i15 + 1 - 1 + (i15 + 2 - 1) * paramInt7 + paramInt6, paramInt7, localfloatW3.val, localfloatW6.val);
                  }
                  Srot.srot(i9 - i15 + 2, paramArrayOfFloat1, i15 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i15 + 1 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4, paramInt5, localfloatW3.val, localfloatW6.val);
                  if (m != 0) {
                    Srot.srot(paramInt1, paramArrayOfFloat6, 1 - 1 + (i15 - 1) * paramInt12 + paramInt11, 1, paramArrayOfFloat6, 1 - 1 + (i15 + 1 - 1) * paramInt12 + paramInt11, 1, localfloatW3.val, localfloatW6.val);
                  }
                  localfloatW12.val = paramArrayOfFloat1[(i15 + 1 - 1 + (i15 - 1) * paramInt5 + paramInt4)];
                  slartg_adapter(localfloatW12.val, paramArrayOfFloat1[(i15 + 1 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4)], localfloatW3, localfloatW6, paramArrayOfFloat1, i15 + 1 - 1 + (i15 - 1) * paramInt5 + paramInt4);
                  paramArrayOfFloat1[(i15 + 1 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
                  Srot.srot(i15 + 1 - i6, paramArrayOfFloat1, i6 - 1 + (i15 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat1, i6 - 1 + (i15 - 1 - 1) * paramInt5 + paramInt4, 1, localfloatW3.val, localfloatW6.val);
                  Srot.srot(i15 - i6, paramArrayOfFloat2, i6 - 1 + (i15 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat2, i6 - 1 + (i15 - 1 - 1) * paramInt7 + paramInt6, 1, localfloatW3.val, localfloatW6.val);
                  if (i1 != 0) {
                    Srot.srot(paramInt1, paramArrayOfFloat7, 1 - 1 + (i15 - 1) * paramInt14 + paramInt13, 1, paramArrayOfFloat7, 1 - 1 + (i15 - 1 - 1) * paramInt14 + paramInt13, 1, localfloatW3.val, localfloatW6.val);
                  }
                  i15 += 1;
                  ???--;
                }
                break;
              }
              if (j != 0)
              {
                i5 = i13;
                break label4039;
              }
              i13 += -1;
              ???--;
            }
            paramintW.val = (paramInt1 + 1);
            break label13015;
          }
          localfloatW12.val = paramArrayOfFloat1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)];
          slartg_adapter(localfloatW12.val, paramArrayOfFloat1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)], localfloatW3, localfloatW6, paramArrayOfFloat1, i8 - 1 + (i8 - 1) * paramInt5 + paramInt4);
          paramArrayOfFloat1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
          Srot.srot(i8 - i6, paramArrayOfFloat1, i6 - 1 + (i8 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat1, i6 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, 1, localfloatW3.val, localfloatW6.val);
          Srot.srot(i8 - i6, paramArrayOfFloat2, i6 - 1 + (i8 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat2, i6 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6, 1, localfloatW3.val, localfloatW6.val);
          if (i1 != 0) {
            Srot.srot(paramInt1, paramArrayOfFloat7, 1 - 1 + (i8 - 1) * paramInt14 + paramInt13, 1, paramArrayOfFloat7, 1 - 1 + (i8 - 1 - 1) * paramInt14 + paramInt13, 1, localfloatW3.val, localfloatW6.val);
          }
        }
        if ((paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)] >= 0.0F ? 0 : 1) != 0)
        {
          if (n != 0)
          {
            i13 = i6;
            i20 = i8 - i6 + 1;
            while (i20 > 0)
            {
              paramArrayOfFloat1[(i13 - 1 + (i8 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfFloat1[(i13 - 1 + (i8 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfFloat2[(i13 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfFloat2[(i13 - 1 + (i8 - 1) * paramInt7 + paramInt6)]);
              i13 += 1;
              ???--;
            }
          }
          else
          {
            paramArrayOfFloat1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfFloat1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)]);
          }
          if (i1 != 0)
          {
            i13 = 1;
            i20 = paramInt1 - 1 + 1;
            while (i20 > 0)
            {
              paramArrayOfFloat7[(i13 - 1 + (i8 - 1) * paramInt14 + paramInt13)] = (-paramArrayOfFloat7[(i13 - 1 + (i8 - 1) * paramInt14 + paramInt13)]);
              i13 += 1;
              ???--;
            }
          }
        }
        paramArrayOfFloat3[(i8 - 1 + paramInt8)] = paramArrayOfFloat1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat4[(i8 - 1 + paramInt9)] = 0.0F;
        paramArrayOfFloat5[(i8 - 1 + paramInt10)] = paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)];
        i8 -= 1;
        if ((i8 >= paramInt2 ? 0 : 1) != 0) {
          break;
        }
        i7 = 0;
        f40 = 0.0F;
        if ((n ^ 0x1) != 0)
        {
          i9 = i8;
          if ((i6 <= i8 ? 0 : 1) != 0) {
            i6 = paramInt2;
          }
        }
        break label12604;
        i7 += 1;
        if ((n ^ 0x1) != 0) {
          i6 = i5;
        }
        if ((i7 / 10 * 10 != i7 ? 0 : 1) != 0)
        {
          if ((i18 * f43 * Math.abs(paramArrayOfFloat1[(i8 - 1 - 1 + (i8 - 1) * paramInt5 + paramInt4)]) >= Math.abs(paramArrayOfFloat2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)]) ? 0 : 1) != 0) {
            f40 += paramArrayOfFloat1[(i8 - 1 - 1 + (i8 - 1) * paramInt5 + paramInt4)] / paramArrayOfFloat2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)];
          } else {
            f40 += 1.0F / (f43 * i18);
          }
          localfloatW7.val = 1.0F;
          localfloatW16.val = f40;
        }
        else
        {
          Slag2.slag2(paramArrayOfFloat1, i8 - 1 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6, paramInt7, f43 * 100.0F, localfloatW7, localfloatW8, localfloatW16, localfloatW17, localfloatW15);
          localfloatW12.val = Math.max(localfloatW7.val, f43 * Util.max(1.0F, Math.abs(localfloatW16.val), Math.abs(localfloatW15.val)));
          if ((localfloatW15.val == 0.0F ? 0 : 1) != 0) {
            break label6204;
          }
        }
        localfloatW12.val = (Math.min(f20, 1.0F) * (0.5F * f42));
        if ((localfloatW7.val <= localfloatW12.val ? 0 : 1) != 0) {
          f44 = localfloatW12.val / localfloatW7.val;
        } else {
          f44 = 1.0F;
        }
        localfloatW12.val = (Math.min(f30, 1.0F) * (0.5F * f42));
        if ((Math.abs(localfloatW16.val) <= localfloatW12.val ? 0 : 1) != 0) {
          f44 = Math.min(f44, localfloatW12.val / Math.abs(localfloatW16.val));
        }
        localfloatW7.val = (f44 * localfloatW7.val);
        localfloatW16.val = (f44 * localfloatW16.val);
        i13 = i8 - 1;
        i20 = (i5 + 1 - (i8 - 1) + -1) / -1;
        while (i20 > 0)
        {
          i12 = i13;
          localfloatW12.val = Math.abs(localfloatW7.val * paramArrayOfFloat1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)]);
          localfloatW13.val = Math.abs(localfloatW7.val * paramArrayOfFloat1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)] - localfloatW16.val * paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
          localfloatW14.val = Math.max(localfloatW12.val, localfloatW13.val);
          if ((localfloatW14.val >= 1.0F ? 0 : 1) != 0) {}
          if (((localfloatW14.val == 0.0F ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            localfloatW12.val /= localfloatW14.val;
            localfloatW13.val /= localfloatW14.val;
          }
          if ((Math.abs(f20 * paramArrayOfFloat1[(i13 + 1 - 1 + (i13 - 1) * paramInt5 + paramInt4)] * localfloatW12.val) > f20 * f21 * localfloatW13.val ? 0 : 1) != 0) {
            break;
          }
          i13 += -1;
          ???--;
        }
        i12 = i5;
        localfloatW12.val = (localfloatW7.val * paramArrayOfFloat1[(i12 - 1 + (i12 - 1) * paramInt5 + paramInt4)] - localfloatW16.val * paramArrayOfFloat2[(i12 - 1 + (i12 - 1) * paramInt7 + paramInt6)]);
        localfloatW7.val *= paramArrayOfFloat1[(i12 + 1 - 1 + (i12 - 1) * paramInt5 + paramInt4)];
        Slartg.slartg(localfloatW12.val, localfloatW13.val, localfloatW3, localfloatW6, localfloatW14);
        i13 = i12;
        i20 = i8 - 1 - i12 + 1;
        while (i20 > 0)
        {
          if ((i13 <= i12 ? 0 : 1) != 0)
          {
            localfloatW12.val = paramArrayOfFloat1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)];
            slartg_adapter(localfloatW12.val, paramArrayOfFloat1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)], localfloatW3, localfloatW6, paramArrayOfFloat1, i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4);
            paramArrayOfFloat1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
          }
          i14 = i13;
          i21 = i9 - i13 + 1;
          while (i21 > 0)
          {
            localfloatW12.val = (localfloatW3.val * paramArrayOfFloat1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] + localfloatW6.val * paramArrayOfFloat1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)] = (-(localfloatW6.val * paramArrayOfFloat1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)]) + localfloatW3.val * paramArrayOfFloat1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] = localfloatW12.val;
            localfloatW13.val = (localfloatW3.val * paramArrayOfFloat2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] + localfloatW6.val * paramArrayOfFloat2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)] = (-(localfloatW6.val * paramArrayOfFloat2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)]) + localfloatW3.val * paramArrayOfFloat2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] = localfloatW13.val;
            i14 += 1;
            ???--;
          }
          if (m != 0)
          {
            i17 = 1;
            i21 = paramInt1 - 1 + 1;
            while (i21 > 0)
            {
              localfloatW12.val = (localfloatW3.val * paramArrayOfFloat6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] + localfloatW6.val * paramArrayOfFloat6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)]);
              paramArrayOfFloat6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)] = (-(localfloatW6.val * paramArrayOfFloat6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)]) + localfloatW3.val * paramArrayOfFloat6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)]);
              paramArrayOfFloat6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] = localfloatW12.val;
              i17 += 1;
              ???--;
            }
          }
          localfloatW12.val = paramArrayOfFloat2[(i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
          slartg_adapter(localfloatW12.val, paramArrayOfFloat2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)], localfloatW3, localfloatW6, paramArrayOfFloat2, i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6);
          paramArrayOfFloat2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = 0.0F;
          i17 = i6;
          i21 = Math.min(i13 + 2, i8) - i6 + 1;
          while (i21 > 0)
          {
            localfloatW12.val = (localfloatW3.val * paramArrayOfFloat1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] + localfloatW6.val * paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-(localfloatW6.val * paramArrayOfFloat1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)]) + localfloatW3.val * paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] = localfloatW12.val;
            i17 += 1;
            ???--;
          }
          i17 = i6;
          i21 = i13 - i6 + 1;
          while (i21 > 0)
          {
            localfloatW12.val = (localfloatW3.val * paramArrayOfFloat2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] + localfloatW6.val * paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-(localfloatW6.val * paramArrayOfFloat2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)]) + localfloatW3.val * paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] = localfloatW12.val;
            i17 += 1;
            ???--;
          }
          if (i1 != 0)
          {
            i17 = 1;
            i21 = paramInt1 - 1 + 1;
            while (i21 > 0)
            {
              localfloatW12.val = (localfloatW3.val * paramArrayOfFloat7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] + localfloatW6.val * paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
              paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] = (-(localfloatW6.val * paramArrayOfFloat7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)]) + localfloatW3.val * paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
              paramArrayOfFloat7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] = localfloatW12.val;
              i17 += 1;
              ???--;
            }
          }
          i13 += 1;
          ???--;
        }
        break label12604;
        if ((i5 + 1 != i8 ? 0 : 1) != 0)
        {
          Slasv2.slasv2(paramArrayOfFloat2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)], paramArrayOfFloat2[(i8 - 1 - 1 + (i8 - 1) * paramInt7 + paramInt6)], paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)], localfloatW2, localfloatW1, localfloatW10, localfloatW5, localfloatW9, localfloatW4);
          if ((localfloatW1.val >= 0.0F ? 0 : 1) != 0)
          {
            localfloatW5.val = (-localfloatW5.val);
            localfloatW10.val = (-localfloatW10.val);
            localfloatW1.val = (-localfloatW1.val);
            localfloatW2.val = (-localfloatW2.val);
          }
          Srot.srot(i9 + 1 - i5, paramArrayOfFloat1, i8 - 1 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat1, i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, paramInt5, localfloatW4.val, localfloatW9.val);
          Srot.srot(i8 + 1 - i6, paramArrayOfFloat1, i6 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat1, i6 - 1 + (i8 - 1) * paramInt5 + paramInt4, 1, localfloatW5.val, localfloatW10.val);
          if ((i8 >= i9 ? 0 : 1) != 0) {
            Srot.srot(i9 - i8, paramArrayOfFloat2, i8 - 1 - 1 + (i8 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat2, i8 - 1 + (i8 + 1 - 1) * paramInt7 + paramInt6, paramInt5, localfloatW4.val, localfloatW9.val);
          }
          if ((i6 >= i8 - 1 ? 0 : 1) != 0) {
            Srot.srot(i5 - i6, paramArrayOfFloat2, i6 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat2, i6 - 1 + (i8 - 1) * paramInt7 + paramInt6, 1, localfloatW5.val, localfloatW10.val);
          }
          if (m != 0) {
            Srot.srot(paramInt1, paramArrayOfFloat6, 1 - 1 + (i8 - 1 - 1) * paramInt12 + paramInt11, 1, paramArrayOfFloat6, 1 - 1 + (i8 - 1) * paramInt12 + paramInt11, 1, localfloatW4.val, localfloatW9.val);
          }
          if (i1 != 0) {
            Srot.srot(paramInt1, paramArrayOfFloat7, 1 - 1 + (i8 - 1 - 1) * paramInt14 + paramInt13, 1, paramArrayOfFloat7, 1 - 1 + (i8 - 1) * paramInt14 + paramInt13, 1, localfloatW5.val, localfloatW10.val);
          }
          paramArrayOfFloat2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)] = localfloatW1.val;
          paramArrayOfFloat2[(i8 - 1 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = 0.0F;
          paramArrayOfFloat2[(i8 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)] = 0.0F;
          paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = localfloatW2.val;
          if ((localfloatW2.val >= 0.0F ? 0 : 1) != 0)
          {
            i13 = i6;
            i20 = i8 - i6 + 1;
            while (i20 > 0)
            {
              paramArrayOfFloat1[(i13 - 1 + (i8 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfFloat1[(i13 - 1 + (i8 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfFloat2[(i13 - 1 + (i8 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfFloat2[(i13 - 1 + (i8 - 1) * paramInt7 + paramInt6)]);
              i13 += 1;
              ???--;
            }
            if (i1 != 0)
            {
              i13 = 1;
              i20 = paramInt1 - 1 + 1;
              while (i20 > 0)
              {
                paramArrayOfFloat7[(i13 - 1 + (i8 - 1) * paramInt14 + paramInt13)] = (-paramArrayOfFloat7[(i13 - 1 + (i8 - 1) * paramInt14 + paramInt13)]);
                i13 += 1;
                ???--;
              }
            }
          }
          Slag2.slag2(paramArrayOfFloat1, i8 - 1 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6, paramInt7, f43 * 100.0F, localfloatW7, localfloatW12, localfloatW16, localfloatW13, localfloatW15);
          if ((localfloatW15.val != 0.0F ? 0 : 1) == 0)
          {
            f41 = 1.0F / localfloatW7.val;
            f1 = paramArrayOfFloat1[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)];
            f5 = paramArrayOfFloat1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)];
            f2 = paramArrayOfFloat1[(i8 - 1 - 1 + (i8 - 1) * paramInt5 + paramInt4)];
            f6 = paramArrayOfFloat1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)];
            f33 = localfloatW7.val * f1 - localfloatW16.val * localfloatW1.val;
            f32 = -(localfloatW15.val * localfloatW1.val);
            f34 = localfloatW7.val * f2;
            f35 = localfloatW7.val * f5;
            f37 = localfloatW7.val * f6 - localfloatW16.val * localfloatW2.val;
            f36 = -(localfloatW15.val * localfloatW2.val);
            if ((Math.abs(f33) + Math.abs(f32) + Math.abs(f34) <= Math.abs(f35) + Math.abs(f37) + Math.abs(f36) ? 0 : 1) != 0)
            {
              f49 = Slapy3.slapy3(f34, f33, f32);
              f39 = f34 / f49;
              f48 = -(f33 / f49);
              f47 = -(f32 / f49);
            }
            else
            {
              f39 = Slapy2.slapy2(f37, f36);
              if ((f39 > f43 ? 0 : 1) != 0)
              {
                f39 = 0.0F;
                f48 = 1.0F;
                f47 = 0.0F;
              }
              else
              {
                localfloatW14.val = (f37 / f39);
                f50 = f36 / f39;
                f49 = Slapy2.slapy2(f39, f35);
                f39 /= f49;
                f48 = -(f35 * localfloatW14.val / f49);
                f47 = f35 * f50 / f49;
              }
            }
            f18 = Math.abs(f1) + Math.abs(f2) + Math.abs(f5) + Math.abs(f6);
            f28 = Math.abs(localfloatW1.val) + Math.abs(localfloatW2.val);
            f61 = Math.abs(localfloatW16.val) + Math.abs(localfloatW15.val);
            if ((localfloatW7.val * f18 <= f61 * f28 ? 0 : 1) != 0)
            {
              f38 = f39 * localfloatW1.val;
              f46 = f48 * localfloatW2.val;
              f45 = -(f47 * localfloatW2.val);
            }
            else
            {
              f4 = f39 * f1 + f48 * f2;
              f3 = f47 * f2;
              f8 = f39 * f5 + f48 * f6;
              f7 = f47 * f6;
              f38 = Slapy2.slapy2(f4, f3);
              if ((f38 > f43 ? 0 : 1) != 0)
              {
                f38 = 0.0F;
                f46 = 1.0F;
                f45 = 0.0F;
              }
              else
              {
                localfloatW14.val = (f4 / f38);
                f50 = f3 / f38;
                f46 = localfloatW14.val * f8 + f50 * f7;
                f45 = f50 * f8 - localfloatW14.val * f7;
              }
            }
            f49 = Slapy3.slapy3(f38, f46, f45);
            f38 /= f49;
            f46 /= f49;
            f45 /= f49;
            localfloatW14.val = (f46 * f48 - f45 * f47);
            f50 = f46 * f47 + f45 * f48;
            f24 = f38 * f39 * localfloatW1.val + localfloatW14.val * localfloatW2.val;
            f23 = f50 * localfloatW2.val;
            f22 = Slapy2.slapy2(f24, f23);
            f27 = f38 * f39 * localfloatW2.val + localfloatW14.val * localfloatW1.val;
            f26 = -(f50 * localfloatW1.val);
            f25 = Slapy2.slapy2(f27, f26);
            paramArrayOfFloat5[(i8 - 1 - 1 + paramInt10)] = f22;
            paramArrayOfFloat5[(i8 - 1 + paramInt10)] = f25;
            paramArrayOfFloat3[(i8 - 1 - 1 + paramInt8)] = (localfloatW16.val * f22 * f41);
            paramArrayOfFloat4[(i8 - 1 - 1 + paramInt9)] = (localfloatW15.val * f22 * f41);
            paramArrayOfFloat3[(i8 - 1 + paramInt8)] = (localfloatW16.val * f25 * f41);
            paramArrayOfFloat4[(i8 - 1 + paramInt9)] = (-(localfloatW15.val * f25 * f41));
            i8 = i5 - 1;
            if ((i8 >= paramInt2 ? 0 : 1) != 0) {
              break;
            }
            i7 = 0;
            f40 = 0.0F;
            if ((n ^ 0x1) != 0)
            {
              i9 = i8;
              if ((i6 <= i8 ? 0 : 1) != 0) {
                i6 = paramInt2;
              }
            }
            break label12604;
          }
        }
        else
        {
          f9 = f20 * paramArrayOfFloat1[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)] / (f30 * paramArrayOfFloat2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)]);
          f13 = f20 * paramArrayOfFloat1[(i8 - 1 + (i8 - 1 - 1) * paramInt5 + paramInt4)] / (f30 * paramArrayOfFloat2[(i8 - 1 - 1 + (i8 - 1 - 1) * paramInt7 + paramInt6)]);
          f11 = f20 * paramArrayOfFloat1[(i8 - 1 - 1 + (i8 - 1) * paramInt5 + paramInt4)] / (f30 * paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)]);
          f15 = f20 * paramArrayOfFloat1[(i8 - 1 + (i8 - 1) * paramInt5 + paramInt4)] / (f30 * paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)]);
          f52 = paramArrayOfFloat2[(i8 - 1 - 1 + (i8 - 1) * paramInt7 + paramInt6)] / paramArrayOfFloat2[(i8 - 1 + (i8 - 1) * paramInt7 + paramInt6)];
          f10 = f20 * paramArrayOfFloat1[(i5 - 1 + (i5 - 1) * paramInt5 + paramInt4)] / (f30 * paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
          f14 = f20 * paramArrayOfFloat1[(i5 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4)] / (f30 * paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
          f12 = f20 * paramArrayOfFloat1[(i5 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4)] / (f30 * paramArrayOfFloat2[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)]);
          f16 = f20 * paramArrayOfFloat1[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4)] / (f30 * paramArrayOfFloat2[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)]);
          f17 = f20 * paramArrayOfFloat1[(i5 + 2 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4)] / (f30 * paramArrayOfFloat2[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)]);
          f53 = paramArrayOfFloat2[(i5 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)] / paramArrayOfFloat2[(i5 + 1 - 1 + (i5 + 1 - 1) * paramInt7 + paramInt6)];
          arrayOfFloat[(1 - 1)] = ((f9 - f10) * (f15 - f10) - f11 * f13 + f13 * f52 * f10 + (f12 - f10 * f53) * f14);
          arrayOfFloat[(2 - 1)] = ((f16 - f10 - f14 * f53 - (f9 - f10) - (f15 - f10) + f13 * f52) * f14);
          arrayOfFloat[(3 - 1)] = (f17 * f14);
          i12 = i5;
          slarfg_adapter(3, arrayOfFloat, 1 - 1, arrayOfFloat, 2 - 1, 1, localfloatW11);
          arrayOfFloat[(1 - 1)] = 1.0F;
          i13 = i12;
          i20 = i8 - 2 - i12 + 1;
          while (i20 > 0)
          {
            if ((i13 <= i12 ? 0 : 1) != 0)
            {
              arrayOfFloat[(1 - 1)] = paramArrayOfFloat1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)];
              arrayOfFloat[(2 - 1)] = paramArrayOfFloat1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)];
              arrayOfFloat[(3 - 1)] = paramArrayOfFloat1[(i13 + 2 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)];
              slarfg_adapter(3, paramArrayOfFloat1, i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4, arrayOfFloat, 2 - 1, 1, localfloatW11);
              arrayOfFloat[(1 - 1)] = 1.0F;
              paramArrayOfFloat1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
              paramArrayOfFloat1[(i13 + 2 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
            }
            i14 = i13;
            i21 = i9 - i13 + 1;
            while (i21 > 0)
            {
              localfloatW11.val *= (paramArrayOfFloat1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] + arrayOfFloat[(2 - 1)] * paramArrayOfFloat1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)] + arrayOfFloat[(3 - 1)] * paramArrayOfFloat1[(i13 + 2 - 1 + (i14 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfFloat1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] -= localfloatW12.val;
              paramArrayOfFloat1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)] -= localfloatW12.val * arrayOfFloat[(2 - 1)];
              paramArrayOfFloat1[(i13 + 2 - 1 + (i14 - 1) * paramInt5 + paramInt4)] -= localfloatW12.val * arrayOfFloat[(3 - 1)];
              localfloatW11.val *= (paramArrayOfFloat2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] + arrayOfFloat[(2 - 1)] * paramArrayOfFloat2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)] + arrayOfFloat[(3 - 1)] * paramArrayOfFloat2[(i13 + 2 - 1 + (i14 - 1) * paramInt7 + paramInt6)]);
              paramArrayOfFloat2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] -= localfloatW13.val;
              paramArrayOfFloat2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)] -= localfloatW13.val * arrayOfFloat[(2 - 1)];
              paramArrayOfFloat2[(i13 + 2 - 1 + (i14 - 1) * paramInt7 + paramInt6)] -= localfloatW13.val * arrayOfFloat[(3 - 1)];
              i14 += 1;
              ???--;
            }
            if (m != 0)
            {
              i17 = 1;
              i21 = paramInt1 - 1 + 1;
              while (i21 > 0)
              {
                localfloatW11.val *= (paramArrayOfFloat6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] + arrayOfFloat[(2 - 1)] * paramArrayOfFloat6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)] + arrayOfFloat[(3 - 1)] * paramArrayOfFloat6[(i17 - 1 + (i13 + 2 - 1) * paramInt12 + paramInt11)]);
                paramArrayOfFloat6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] -= localfloatW12.val;
                paramArrayOfFloat6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)] -= localfloatW12.val * arrayOfFloat[(2 - 1)];
                paramArrayOfFloat6[(i17 - 1 + (i13 + 2 - 1) * paramInt12 + paramInt11)] -= localfloatW12.val * arrayOfFloat[(3 - 1)];
                i17 += 1;
                ???--;
              }
            }
            k = 0;
            localfloatW12.val = Math.max(Math.abs(paramArrayOfFloat2[(i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)]), Math.abs(paramArrayOfFloat2[(i13 + 1 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)]));
            localfloatW13.val = Math.max(Math.abs(paramArrayOfFloat2[(i13 + 2 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)]), Math.abs(paramArrayOfFloat2[(i13 + 2 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)]));
            if ((Math.max(localfloatW12.val, localfloatW13.val) >= f43 ? 0 : 1) != 0)
            {
              f44 = 0.0F;
              f51 = 1.0F;
              f54 = 0.0F;
              break label10365;
            }
            else
            {
              if ((localfloatW12.val < localfloatW13.val ? 0 : 1) != 0)
              {
                f57 = paramArrayOfFloat2[(i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
                f59 = paramArrayOfFloat2[(i13 + 2 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
                f58 = paramArrayOfFloat2[(i13 + 1 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)];
                f60 = paramArrayOfFloat2[(i13 + 2 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)];
                f51 = paramArrayOfFloat2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
                f54 = paramArrayOfFloat2[(i13 + 2 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
              }
              else
              {
                f59 = paramArrayOfFloat2[(i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
                f57 = paramArrayOfFloat2[(i13 + 2 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
                f60 = paramArrayOfFloat2[(i13 + 1 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)];
                f58 = paramArrayOfFloat2[(i13 + 2 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)];
                f54 = paramArrayOfFloat2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
                f51 = paramArrayOfFloat2[(i13 + 2 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
              }
              if ((Math.abs(f58) <= Math.abs(f57) ? 0 : 1) != 0)
              {
                k = 1;
                localfloatW12.val = f58;
                localfloatW13.val = f60;
                f58 = f57;
                f60 = f59;
                f57 = localfloatW12.val;
                f59 = localfloatW13.val;
              }
              localfloatW12.val = (f59 / f57);
              f54 -= localfloatW12.val * f51;
              f60 -= localfloatW12.val * f58;
              f59 = 0.0F;
              f44 = 1.0F;
              if ((Math.abs(f60) >= f43 ? 0 : 1) != 0)
              {
                f44 = 0.0F;
                f54 = 1.0F;
                f51 = -(f58 / f57);
              }
              else
              {
                if ((Math.abs(f60) >= Math.abs(f54) ? 0 : 1) != 0) {
                  f44 = Math.abs(f60 / f54);
                }
                if ((Math.abs(f57) >= Math.abs(f51) ? 0 : 1) != 0) {
                  f44 = Math.min(f44, Math.abs(f57 / f51));
                }
                f54 = f44 * f54 / f60;
                f51 = (f44 * f51 - f58 * f54) / f57;
              }
            }
            if (k != 0)
            {
              localfloatW12.val = f54;
              f54 = f51;
              f51 = localfloatW12.val;
            }
            f49 = (float)Math.sqrt((float)Math.pow(f44, 2) + (float)Math.pow(f51, 2) + (float)Math.pow(f54, 2));
            localfloatW11.val = (1.0F + f44 / f49);
            f56 = -(1.0F / (f44 + f49));
            arrayOfFloat[(1 - 1)] = 1.0F;
            arrayOfFloat[(2 - 1)] = (f56 * f51);
            arrayOfFloat[(3 - 1)] = (f56 * f54);
            i17 = i6;
            i21 = Math.min(i13 + 3, i8) - i6 + 1;
            while (i21 > 0)
            {
              localfloatW11.val *= (paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] + arrayOfFloat[(2 - 1)] * paramArrayOfFloat1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] + arrayOfFloat[(3 - 1)] * paramArrayOfFloat1[(i17 - 1 + (i13 + 2 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] -= localfloatW12.val;
              paramArrayOfFloat1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] -= localfloatW12.val * arrayOfFloat[(2 - 1)];
              paramArrayOfFloat1[(i17 - 1 + (i13 + 2 - 1) * paramInt5 + paramInt4)] -= localfloatW12.val * arrayOfFloat[(3 - 1)];
              i17 += 1;
              ???--;
            }
            i17 = i6;
            i21 = i13 + 2 - i6 + 1;
            while (i21 > 0)
            {
              localfloatW11.val *= (paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] + arrayOfFloat[(2 - 1)] * paramArrayOfFloat2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] + arrayOfFloat[(3 - 1)] * paramArrayOfFloat2[(i17 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)]);
              paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] -= localfloatW12.val;
              paramArrayOfFloat2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] -= localfloatW12.val * arrayOfFloat[(2 - 1)];
              paramArrayOfFloat2[(i17 - 1 + (i13 + 2 - 1) * paramInt7 + paramInt6)] -= localfloatW12.val * arrayOfFloat[(3 - 1)];
              i17 += 1;
              ???--;
            }
            if (i1 != 0)
            {
              i17 = 1;
              i21 = paramInt1 - 1 + 1;
              while (i21 > 0)
              {
                localfloatW11.val *= (paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] + arrayOfFloat[(2 - 1)] * paramArrayOfFloat7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] + arrayOfFloat[(3 - 1)] * paramArrayOfFloat7[(i17 - 1 + (i13 + 2 - 1) * paramInt14 + paramInt13)]);
                paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] -= localfloatW12.val;
                paramArrayOfFloat7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] -= localfloatW12.val * arrayOfFloat[(2 - 1)];
                paramArrayOfFloat7[(i17 - 1 + (i13 + 2 - 1) * paramInt14 + paramInt13)] -= localfloatW12.val * arrayOfFloat[(3 - 1)];
                i17 += 1;
                ???--;
              }
            }
            paramArrayOfFloat2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = 0.0F;
            paramArrayOfFloat2[(i13 + 2 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = 0.0F;
            i13 += 1;
            ???--;
          }
          i13 = i8 - 1;
          localfloatW12.val = paramArrayOfFloat1[(i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)];
          slartg_adapter(localfloatW12.val, paramArrayOfFloat1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)], localfloatW3, localfloatW6, paramArrayOfFloat1, i13 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4);
          paramArrayOfFloat1[(i13 + 1 - 1 + (i13 - 1 - 1) * paramInt5 + paramInt4)] = 0.0F;
          i14 = i13;
          i20 = i9 - i13 + 1;
          while (i20 > 0)
          {
            localfloatW12.val = (localfloatW3.val * paramArrayOfFloat1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] + localfloatW6.val * paramArrayOfFloat1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)] = (-(localfloatW6.val * paramArrayOfFloat1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)]) + localfloatW3.val * paramArrayOfFloat1[(i13 + 1 - 1 + (i14 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat1[(i13 - 1 + (i14 - 1) * paramInt5 + paramInt4)] = localfloatW12.val;
            localfloatW13.val = (localfloatW3.val * paramArrayOfFloat2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] + localfloatW6.val * paramArrayOfFloat2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)] = (-(localfloatW6.val * paramArrayOfFloat2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)]) + localfloatW3.val * paramArrayOfFloat2[(i13 + 1 - 1 + (i14 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat2[(i13 - 1 + (i14 - 1) * paramInt7 + paramInt6)] = localfloatW13.val;
            i14 += 1;
            ???--;
          }
          if (m != 0)
          {
            i17 = 1;
            i20 = paramInt1 - 1 + 1;
            while (i20 > 0)
            {
              localfloatW12.val = (localfloatW3.val * paramArrayOfFloat6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] + localfloatW6.val * paramArrayOfFloat6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)]);
              paramArrayOfFloat6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)] = (-(localfloatW6.val * paramArrayOfFloat6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)]) + localfloatW3.val * paramArrayOfFloat6[(i17 - 1 + (i13 + 1 - 1) * paramInt12 + paramInt11)]);
              paramArrayOfFloat6[(i17 - 1 + (i13 - 1) * paramInt12 + paramInt11)] = localfloatW12.val;
              i17 += 1;
              ???--;
            }
          }
          localfloatW12.val = paramArrayOfFloat2[(i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)];
          slartg_adapter(localfloatW12.val, paramArrayOfFloat2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)], localfloatW3, localfloatW6, paramArrayOfFloat2, i13 + 1 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6);
          paramArrayOfFloat2[(i13 + 1 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = 0.0F;
          i17 = i6;
          i20 = i8 - i6 + 1;
          while (i20 > 0)
          {
            localfloatW12.val = (localfloatW3.val * paramArrayOfFloat1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] + localfloatW6.val * paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-(localfloatW6.val * paramArrayOfFloat1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)]) + localfloatW3.val * paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat1[(i17 - 1 + (i13 + 1 - 1) * paramInt5 + paramInt4)] = localfloatW12.val;
            i17 += 1;
            ???--;
          }
          i17 = i6;
          i20 = i8 - 1 - i6 + 1;
          while (i20 > 0)
          {
            localfloatW12.val = (localfloatW3.val * paramArrayOfFloat2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] + localfloatW6.val * paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-(localfloatW6.val * paramArrayOfFloat2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)]) + localfloatW3.val * paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfFloat2[(i17 - 1 + (i13 + 1 - 1) * paramInt7 + paramInt6)] = localfloatW12.val;
            i17 += 1;
            ???--;
          }
          if (i1 != 0)
          {
            i17 = 1;
            i20 = paramInt1 - 1 + 1;
          }
          for (;;)
          {
            localfloatW12.val = (localfloatW3.val * paramArrayOfFloat7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] + localfloatW6.val * paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
            paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] = (-(localfloatW6.val * paramArrayOfFloat7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)]) + localfloatW3.val * paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
            paramArrayOfFloat7[(i17 - 1 + (i13 + 1 - 1) * paramInt14 + paramInt13)] = localfloatW12.val;
            i17 += 1;
            ???--;
            if (i20 <= 0) {
              break;
            }
          }
        }
        i16 += 1;
        ???--;
      }
      paramintW.val = i8;
    }
    else
    {
      i13 = 1;
      i19 = paramInt2 - 1 - 1 + 1;
      while (i19 > 0)
      {
        if ((paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)] >= 0.0F ? 0 : 1) != 0)
        {
          if (n != 0)
          {
            i17 = 1;
            i20 = i13 - 1 + 1;
            while (i20 > 0)
            {
              paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfFloat1[(i17 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfFloat2[(i17 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
              i17 += 1;
              ???--;
            }
          }
          else
          {
            paramArrayOfFloat1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfFloat1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)]);
            paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)] = (-paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)]);
          }
          if (i1 != 0)
          {
            i17 = 1;
            i20 = paramInt1 - 1 + 1;
            while (i20 > 0)
            {
              paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)] = (-paramArrayOfFloat7[(i17 - 1 + (i13 - 1) * paramInt14 + paramInt13)]);
              i17 += 1;
              ???--;
            }
          }
        }
        paramArrayOfFloat3[(i13 - 1 + paramInt8)] = paramArrayOfFloat1[(i13 - 1 + (i13 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat4[(i13 - 1 + paramInt9)] = 0.0F;
        paramArrayOfFloat5[(i13 - 1 + paramInt10)] = paramArrayOfFloat2[(i13 - 1 + (i13 - 1) * paramInt7 + paramInt6)];
        i13 += 1;
        ???--;
      }
      paramintW.val = 0;
    }
    label13015:
    paramArrayOfFloat8[(1 - 1 + paramInt15)] = paramInt1;
  }
  
  private static void slartg_adapter(float paramFloat1, float paramFloat2, floatW paramfloatW1, floatW paramfloatW2, float[] paramArrayOfFloat, int paramInt)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat[paramInt]);
    Slartg.slartg(paramFloat1, paramFloat2, paramfloatW1, paramfloatW2, localfloatW);
    paramArrayOfFloat[paramInt] = localfloatW.val;
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, floatW paramfloatW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat1[paramInt2]);
    Slarfg.slarfg(paramInt1, localfloatW, paramArrayOfFloat2, paramInt3, paramInt4, paramfloatW);
    paramArrayOfFloat1[paramInt2] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Shgeqz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */