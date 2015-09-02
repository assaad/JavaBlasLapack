package org.netlib.lapack;

import org.netlib.blas.Sgemv;
import org.netlib.blas.Sger;

public final class Slarfx
{
  public static void slarfx(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float paramFloat, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, float[] paramArrayOfFloat3, int paramInt6)
  {
    int i = 0;
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
    if ((paramFloat != 0.0F ? 0 : 1) != 0) {
      return;
    }
    int j;
    if (Lsame.lsame(paramString, "L"))
    {
      j = paramInt1;
      if (j != 1)
      {
        if (j != 2)
        {
          if (j == 3) {
            break label517;
          }
          if (j == 4) {
            break label782;
          }
          if (j == 5) {
            break label1125;
          }
          if (j == 6) {
            break label1546;
          }
          if (j == 7) {
            break label2049;
          }
          if (j == 8) {
            break label2634;
          }
          if (j == 9) {
            break label3301;
          }
          if (j == 10) {
            break label4050;
          }
          Sgemv.sgemv("Transpose", paramInt1, paramInt2, 1.0F, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat1, paramInt3, 1, 0.0F, paramArrayOfFloat3, paramInt6, 1);
          Sger.sger(paramInt1, paramInt2, -paramFloat, paramArrayOfFloat1, paramInt3, 1, paramArrayOfFloat3, paramInt6, 1, paramArrayOfFloat2, paramInt4, paramInt5);
          return;
        }
      }
      else
      {
        f2 = 1.0F - paramFloat * paramArrayOfFloat1[(1 - 1 + paramInt3)] * paramArrayOfFloat1[(1 - 1 + paramInt3)];
        i = 1;
        for (j = paramInt2 - 1 + 1; j > 0; j--)
        {
          paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] = (f2 * paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)]);
          i += 1;
        }
        return;
      }
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        i += 1;
      }
      return;
      label517:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        i += 1;
      }
      return;
      label782:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        i += 1;
      }
      return;
      label1125:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        i += 1;
      }
      return;
      label1546:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      f18 = paramArrayOfFloat1[(6 - 1 + paramInt3)];
      f8 = paramFloat * f18;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] + f18 * paramArrayOfFloat2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        paramArrayOfFloat2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f8;
        i += 1;
      }
      return;
      label2049:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      f18 = paramArrayOfFloat1[(6 - 1 + paramInt3)];
      f8 = paramFloat * f18;
      f19 = paramArrayOfFloat1[(7 - 1 + paramInt3)];
      f9 = paramFloat * f19;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] + f18 * paramArrayOfFloat2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] + f19 * paramArrayOfFloat2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        paramArrayOfFloat2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f8;
        paramArrayOfFloat2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f9;
        i += 1;
      }
      return;
      label2634:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      f18 = paramArrayOfFloat1[(6 - 1 + paramInt3)];
      f8 = paramFloat * f18;
      f19 = paramArrayOfFloat1[(7 - 1 + paramInt3)];
      f9 = paramFloat * f19;
      f20 = paramArrayOfFloat1[(8 - 1 + paramInt3)];
      f10 = paramFloat * f20;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] + f18 * paramArrayOfFloat2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] + f19 * paramArrayOfFloat2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] + f20 * paramArrayOfFloat2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        paramArrayOfFloat2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f8;
        paramArrayOfFloat2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f9;
        paramArrayOfFloat2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f10;
        i += 1;
      }
      return;
      label3301:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      f18 = paramArrayOfFloat1[(6 - 1 + paramInt3)];
      f8 = paramFloat * f18;
      f19 = paramArrayOfFloat1[(7 - 1 + paramInt3)];
      f9 = paramFloat * f19;
      f20 = paramArrayOfFloat1[(8 - 1 + paramInt3)];
      f10 = paramFloat * f20;
      f21 = paramArrayOfFloat1[(9 - 1 + paramInt3)];
      f11 = paramFloat * f21;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] + f18 * paramArrayOfFloat2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] + f19 * paramArrayOfFloat2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] + f20 * paramArrayOfFloat2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)] + f21 * paramArrayOfFloat2[(9 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        paramArrayOfFloat2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f8;
        paramArrayOfFloat2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f9;
        paramArrayOfFloat2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f10;
        paramArrayOfFloat2[(9 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f11;
        i += 1;
      }
      return;
      label4050:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      f18 = paramArrayOfFloat1[(6 - 1 + paramInt3)];
      f8 = paramFloat * f18;
      f19 = paramArrayOfFloat1[(7 - 1 + paramInt3)];
      f9 = paramFloat * f19;
      f20 = paramArrayOfFloat1[(8 - 1 + paramInt3)];
      f10 = paramFloat * f20;
      f21 = paramArrayOfFloat1[(9 - 1 + paramInt3)];
      f11 = paramFloat * f21;
      f13 = paramArrayOfFloat1[(10 - 1 + paramInt3)];
      f3 = paramFloat * f13;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] + f18 * paramArrayOfFloat2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] + f19 * paramArrayOfFloat2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] + f20 * paramArrayOfFloat2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)] + f21 * paramArrayOfFloat2[(9 - 1 + (i - 1) * paramInt5 + paramInt4)] + f13 * paramArrayOfFloat2[(10 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        paramArrayOfFloat2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f8;
        paramArrayOfFloat2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f9;
        paramArrayOfFloat2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f10;
        paramArrayOfFloat2[(9 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f11;
        paramArrayOfFloat2[(10 - 1 + (i - 1) * paramInt5 + paramInt4)] -= f1 * f3;
        i += 1;
      }
      return;
    }
    else
    {
      j = paramInt2;
      if (j != 1)
      {
        if (j != 2)
        {
          if (j == 3) {
            break label5310;
          }
          if (j == 4) {
            break label5575;
          }
          if (j == 5) {
            break label5918;
          }
          if (j == 6) {
            break label6339;
          }
          if (j == 7) {
            break label6842;
          }
          if (j == 8) {
            break label7427;
          }
          if (j == 9) {
            break label8094;
          }
          if (j == 10) {
            break label8843;
          }
          Sgemv.sgemv("No transpose", paramInt1, paramInt2, 1.0F, paramArrayOfFloat2, paramInt4, paramInt5, paramArrayOfFloat1, paramInt3, 1, 0.0F, paramArrayOfFloat3, paramInt6, 1);
          Sger.sger(paramInt1, paramInt2, -paramFloat, paramArrayOfFloat3, paramInt6, 1, paramArrayOfFloat1, paramInt3, 1, paramArrayOfFloat2, paramInt4, paramInt5);
          return;
        }
      }
      else
      {
        f2 = 1.0F - paramFloat * paramArrayOfFloat1[(1 - 1 + paramInt3)] * paramArrayOfFloat1[(1 - 1 + paramInt3)];
        i = 1;
        for (j = paramInt1 - 1 + 1; j > 0; j--)
        {
          paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] = (f2 * paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)]);
          i += 1;
        }
        return;
      }
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        i += 1;
      }
      return;
      label5310:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        i += 1;
      }
      return;
      label5575:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        i += 1;
      }
      return;
      label5918:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        i += 1;
      }
      return;
      label6339:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      f18 = paramArrayOfFloat1[(6 - 1 + paramInt3)];
      f8 = paramFloat * f18;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] + f18 * paramArrayOfFloat2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        paramArrayOfFloat2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] -= f1 * f8;
        i += 1;
      }
      return;
      label6842:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      f18 = paramArrayOfFloat1[(6 - 1 + paramInt3)];
      f8 = paramFloat * f18;
      f19 = paramArrayOfFloat1[(7 - 1 + paramInt3)];
      f9 = paramFloat * f19;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] + f18 * paramArrayOfFloat2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] + f19 * paramArrayOfFloat2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        paramArrayOfFloat2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] -= f1 * f8;
        paramArrayOfFloat2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] -= f1 * f9;
        i += 1;
      }
      return;
      label7427:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      f18 = paramArrayOfFloat1[(6 - 1 + paramInt3)];
      f8 = paramFloat * f18;
      f19 = paramArrayOfFloat1[(7 - 1 + paramInt3)];
      f9 = paramFloat * f19;
      f20 = paramArrayOfFloat1[(8 - 1 + paramInt3)];
      f10 = paramFloat * f20;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] + f18 * paramArrayOfFloat2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] + f19 * paramArrayOfFloat2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] + f20 * paramArrayOfFloat2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        paramArrayOfFloat2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] -= f1 * f8;
        paramArrayOfFloat2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] -= f1 * f9;
        paramArrayOfFloat2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)] -= f1 * f10;
        i += 1;
      }
      return;
      label8094:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      f18 = paramArrayOfFloat1[(6 - 1 + paramInt3)];
      f8 = paramFloat * f18;
      f19 = paramArrayOfFloat1[(7 - 1 + paramInt3)];
      f9 = paramFloat * f19;
      f20 = paramArrayOfFloat1[(8 - 1 + paramInt3)];
      f10 = paramFloat * f20;
      f21 = paramArrayOfFloat1[(9 - 1 + paramInt3)];
      f11 = paramFloat * f21;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        f1 = f12 * paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] + f18 * paramArrayOfFloat2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] + f19 * paramArrayOfFloat2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] + f20 * paramArrayOfFloat2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)] + f21 * paramArrayOfFloat2[(i - 1 + (9 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        paramArrayOfFloat2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] -= f1 * f8;
        paramArrayOfFloat2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] -= f1 * f9;
        paramArrayOfFloat2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)] -= f1 * f10;
        paramArrayOfFloat2[(i - 1 + (9 - 1) * paramInt5 + paramInt4)] -= f1 * f11;
        i += 1;
      }
      return;
      label8843:
      f12 = paramArrayOfFloat1[(1 - 1 + paramInt3)];
      f2 = paramFloat * f12;
      f14 = paramArrayOfFloat1[(2 - 1 + paramInt3)];
      f4 = paramFloat * f14;
      f15 = paramArrayOfFloat1[(3 - 1 + paramInt3)];
      f5 = paramFloat * f15;
      f16 = paramArrayOfFloat1[(4 - 1 + paramInt3)];
      f6 = paramFloat * f16;
      f17 = paramArrayOfFloat1[(5 - 1 + paramInt3)];
      f7 = paramFloat * f17;
      f18 = paramArrayOfFloat1[(6 - 1 + paramInt3)];
      f8 = paramFloat * f18;
      f19 = paramArrayOfFloat1[(7 - 1 + paramInt3)];
      f9 = paramFloat * f19;
      f20 = paramArrayOfFloat1[(8 - 1 + paramInt3)];
      f10 = paramFloat * f20;
      f21 = paramArrayOfFloat1[(9 - 1 + paramInt3)];
      f11 = paramFloat * f21;
      f13 = paramArrayOfFloat1[(10 - 1 + paramInt3)];
      f3 = paramFloat * f13;
      i = 1;
      j = paramInt1 - 1 + 1;
      for (;;)
      {
        f1 = f12 * paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + f14 * paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + f15 * paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + f16 * paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + f17 * paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] + f18 * paramArrayOfFloat2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] + f19 * paramArrayOfFloat2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] + f20 * paramArrayOfFloat2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)] + f21 * paramArrayOfFloat2[(i - 1 + (9 - 1) * paramInt5 + paramInt4)] + f13 * paramArrayOfFloat2[(i - 1 + (10 - 1) * paramInt5 + paramInt4)];
        paramArrayOfFloat2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= f1 * f2;
        paramArrayOfFloat2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= f1 * f4;
        paramArrayOfFloat2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= f1 * f5;
        paramArrayOfFloat2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= f1 * f6;
        paramArrayOfFloat2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= f1 * f7;
        paramArrayOfFloat2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] -= f1 * f8;
        paramArrayOfFloat2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] -= f1 * f9;
        paramArrayOfFloat2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)] -= f1 * f10;
        paramArrayOfFloat2[(i - 1 + (9 - 1) * paramInt5 + paramInt4)] -= f1 * f11;
        paramArrayOfFloat2[(i - 1 + (10 - 1) * paramInt5 + paramInt4)] -= f1 * f3;
        i += 1;
        j--;
        if (j <= 0) {
          break;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slarfx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */