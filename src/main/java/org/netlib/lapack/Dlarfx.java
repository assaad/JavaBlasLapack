package org.netlib.lapack;

import org.netlib.blas.Dgemv;
import org.netlib.blas.Dger;

public final class Dlarfx
{
  public static void dlarfx(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double paramDouble, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6)
  {
    int i = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    double d19 = 0.0D;
    double d20 = 0.0D;
    double d21 = 0.0D;
    if ((paramDouble != 0.0D ? 0 : 1) != 0) {
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
          Dgemv.dgemv("Transpose", paramInt1, paramInt2, 1.0D, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble1, paramInt3, 1, 0.0D, paramArrayOfDouble3, paramInt6, 1);
          Dger.dger(paramInt1, paramInt2, -paramDouble, paramArrayOfDouble1, paramInt3, 1, paramArrayOfDouble3, paramInt6, 1, paramArrayOfDouble2, paramInt4, paramInt5);
          return;
        }
      }
      else
      {
        d2 = 1.0D - paramDouble * paramArrayOfDouble1[(1 - 1 + paramInt3)] * paramArrayOfDouble1[(1 - 1 + paramInt3)];
        i = 1;
        for (j = paramInt2 - 1 + 1; j > 0; j--)
        {
          paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] = (d2 * paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)]);
          i += 1;
        }
        return;
      }
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        i += 1;
      }
      return;
      label517:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        i += 1;
      }
      return;
      label782:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        i += 1;
      }
      return;
      label1125:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        i += 1;
      }
      return;
      label1546:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      d18 = paramArrayOfDouble1[(6 - 1 + paramInt3)];
      d8 = paramDouble * d18;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] + d18 * paramArrayOfDouble2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        paramArrayOfDouble2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d8;
        i += 1;
      }
      return;
      label2049:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      d18 = paramArrayOfDouble1[(6 - 1 + paramInt3)];
      d8 = paramDouble * d18;
      d19 = paramArrayOfDouble1[(7 - 1 + paramInt3)];
      d9 = paramDouble * d19;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] + d18 * paramArrayOfDouble2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] + d19 * paramArrayOfDouble2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        paramArrayOfDouble2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d8;
        paramArrayOfDouble2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d9;
        i += 1;
      }
      return;
      label2634:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      d18 = paramArrayOfDouble1[(6 - 1 + paramInt3)];
      d8 = paramDouble * d18;
      d19 = paramArrayOfDouble1[(7 - 1 + paramInt3)];
      d9 = paramDouble * d19;
      d20 = paramArrayOfDouble1[(8 - 1 + paramInt3)];
      d10 = paramDouble * d20;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] + d18 * paramArrayOfDouble2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] + d19 * paramArrayOfDouble2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] + d20 * paramArrayOfDouble2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        paramArrayOfDouble2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d8;
        paramArrayOfDouble2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d9;
        paramArrayOfDouble2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d10;
        i += 1;
      }
      return;
      label3301:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      d18 = paramArrayOfDouble1[(6 - 1 + paramInt3)];
      d8 = paramDouble * d18;
      d19 = paramArrayOfDouble1[(7 - 1 + paramInt3)];
      d9 = paramDouble * d19;
      d20 = paramArrayOfDouble1[(8 - 1 + paramInt3)];
      d10 = paramDouble * d20;
      d21 = paramArrayOfDouble1[(9 - 1 + paramInt3)];
      d11 = paramDouble * d21;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] + d18 * paramArrayOfDouble2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] + d19 * paramArrayOfDouble2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] + d20 * paramArrayOfDouble2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)] + d21 * paramArrayOfDouble2[(9 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        paramArrayOfDouble2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d8;
        paramArrayOfDouble2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d9;
        paramArrayOfDouble2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d10;
        paramArrayOfDouble2[(9 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d11;
        i += 1;
      }
      return;
      label4050:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      d18 = paramArrayOfDouble1[(6 - 1 + paramInt3)];
      d8 = paramDouble * d18;
      d19 = paramArrayOfDouble1[(7 - 1 + paramInt3)];
      d9 = paramDouble * d19;
      d20 = paramArrayOfDouble1[(8 - 1 + paramInt3)];
      d10 = paramDouble * d20;
      d21 = paramArrayOfDouble1[(9 - 1 + paramInt3)];
      d11 = paramDouble * d21;
      d13 = paramArrayOfDouble1[(10 - 1 + paramInt3)];
      d3 = paramDouble * d13;
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] + d18 * paramArrayOfDouble2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] + d19 * paramArrayOfDouble2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] + d20 * paramArrayOfDouble2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)] + d21 * paramArrayOfDouble2[(9 - 1 + (i - 1) * paramInt5 + paramInt4)] + d13 * paramArrayOfDouble2[(10 - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(1 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(2 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(3 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(4 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(5 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        paramArrayOfDouble2[(6 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d8;
        paramArrayOfDouble2[(7 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d9;
        paramArrayOfDouble2[(8 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d10;
        paramArrayOfDouble2[(9 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d11;
        paramArrayOfDouble2[(10 - 1 + (i - 1) * paramInt5 + paramInt4)] -= d1 * d3;
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
          Dgemv.dgemv("No transpose", paramInt1, paramInt2, 1.0D, paramArrayOfDouble2, paramInt4, paramInt5, paramArrayOfDouble1, paramInt3, 1, 0.0D, paramArrayOfDouble3, paramInt6, 1);
          Dger.dger(paramInt1, paramInt2, -paramDouble, paramArrayOfDouble3, paramInt6, 1, paramArrayOfDouble1, paramInt3, 1, paramArrayOfDouble2, paramInt4, paramInt5);
          return;
        }
      }
      else
      {
        d2 = 1.0D - paramDouble * paramArrayOfDouble1[(1 - 1 + paramInt3)] * paramArrayOfDouble1[(1 - 1 + paramInt3)];
        i = 1;
        for (j = paramInt1 - 1 + 1; j > 0; j--)
        {
          paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] = (d2 * paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)]);
          i += 1;
        }
        return;
      }
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        i += 1;
      }
      return;
      label5310:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        i += 1;
      }
      return;
      label5575:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        i += 1;
      }
      return;
      label5918:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        i += 1;
      }
      return;
      label6339:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      d18 = paramArrayOfDouble1[(6 - 1 + paramInt3)];
      d8 = paramDouble * d18;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] + d18 * paramArrayOfDouble2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        paramArrayOfDouble2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] -= d1 * d8;
        i += 1;
      }
      return;
      label6842:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      d18 = paramArrayOfDouble1[(6 - 1 + paramInt3)];
      d8 = paramDouble * d18;
      d19 = paramArrayOfDouble1[(7 - 1 + paramInt3)];
      d9 = paramDouble * d19;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] + d18 * paramArrayOfDouble2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] + d19 * paramArrayOfDouble2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        paramArrayOfDouble2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] -= d1 * d8;
        paramArrayOfDouble2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] -= d1 * d9;
        i += 1;
      }
      return;
      label7427:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      d18 = paramArrayOfDouble1[(6 - 1 + paramInt3)];
      d8 = paramDouble * d18;
      d19 = paramArrayOfDouble1[(7 - 1 + paramInt3)];
      d9 = paramDouble * d19;
      d20 = paramArrayOfDouble1[(8 - 1 + paramInt3)];
      d10 = paramDouble * d20;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] + d18 * paramArrayOfDouble2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] + d19 * paramArrayOfDouble2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] + d20 * paramArrayOfDouble2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        paramArrayOfDouble2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] -= d1 * d8;
        paramArrayOfDouble2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] -= d1 * d9;
        paramArrayOfDouble2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)] -= d1 * d10;
        i += 1;
      }
      return;
      label8094:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      d18 = paramArrayOfDouble1[(6 - 1 + paramInt3)];
      d8 = paramDouble * d18;
      d19 = paramArrayOfDouble1[(7 - 1 + paramInt3)];
      d9 = paramDouble * d19;
      d20 = paramArrayOfDouble1[(8 - 1 + paramInt3)];
      d10 = paramDouble * d20;
      d21 = paramArrayOfDouble1[(9 - 1 + paramInt3)];
      d11 = paramDouble * d21;
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        d1 = d12 * paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] + d18 * paramArrayOfDouble2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] + d19 * paramArrayOfDouble2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] + d20 * paramArrayOfDouble2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)] + d21 * paramArrayOfDouble2[(i - 1 + (9 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        paramArrayOfDouble2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] -= d1 * d8;
        paramArrayOfDouble2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] -= d1 * d9;
        paramArrayOfDouble2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)] -= d1 * d10;
        paramArrayOfDouble2[(i - 1 + (9 - 1) * paramInt5 + paramInt4)] -= d1 * d11;
        i += 1;
      }
      return;
      label8843:
      d12 = paramArrayOfDouble1[(1 - 1 + paramInt3)];
      d2 = paramDouble * d12;
      d14 = paramArrayOfDouble1[(2 - 1 + paramInt3)];
      d4 = paramDouble * d14;
      d15 = paramArrayOfDouble1[(3 - 1 + paramInt3)];
      d5 = paramDouble * d15;
      d16 = paramArrayOfDouble1[(4 - 1 + paramInt3)];
      d6 = paramDouble * d16;
      d17 = paramArrayOfDouble1[(5 - 1 + paramInt3)];
      d7 = paramDouble * d17;
      d18 = paramArrayOfDouble1[(6 - 1 + paramInt3)];
      d8 = paramDouble * d18;
      d19 = paramArrayOfDouble1[(7 - 1 + paramInt3)];
      d9 = paramDouble * d19;
      d20 = paramArrayOfDouble1[(8 - 1 + paramInt3)];
      d10 = paramDouble * d20;
      d21 = paramArrayOfDouble1[(9 - 1 + paramInt3)];
      d11 = paramDouble * d21;
      d13 = paramArrayOfDouble1[(10 - 1 + paramInt3)];
      d3 = paramDouble * d13;
      i = 1;
      j = paramInt1 - 1 + 1;
      for (;;)
      {
        d1 = d12 * paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] + d14 * paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] + d15 * paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] + d16 * paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] + d17 * paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] + d18 * paramArrayOfDouble2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] + d19 * paramArrayOfDouble2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] + d20 * paramArrayOfDouble2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)] + d21 * paramArrayOfDouble2[(i - 1 + (9 - 1) * paramInt5 + paramInt4)] + d13 * paramArrayOfDouble2[(i - 1 + (10 - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble2[(i - 1 + (1 - 1) * paramInt5 + paramInt4)] -= d1 * d2;
        paramArrayOfDouble2[(i - 1 + (2 - 1) * paramInt5 + paramInt4)] -= d1 * d4;
        paramArrayOfDouble2[(i - 1 + (3 - 1) * paramInt5 + paramInt4)] -= d1 * d5;
        paramArrayOfDouble2[(i - 1 + (4 - 1) * paramInt5 + paramInt4)] -= d1 * d6;
        paramArrayOfDouble2[(i - 1 + (5 - 1) * paramInt5 + paramInt4)] -= d1 * d7;
        paramArrayOfDouble2[(i - 1 + (6 - 1) * paramInt5 + paramInt4)] -= d1 * d8;
        paramArrayOfDouble2[(i - 1 + (7 - 1) * paramInt5 + paramInt4)] -= d1 * d9;
        paramArrayOfDouble2[(i - 1 + (8 - 1) * paramInt5 + paramInt4)] -= d1 * d10;
        paramArrayOfDouble2[(i - 1 + (9 - 1) * paramInt5 + paramInt4)] -= d1 * d11;
        paramArrayOfDouble2[(i - 1 + (10 - 1) * paramInt5 + paramInt4)] -= d1 * d3;
        i += 1;
        j--;
        if (j <= 0) {
          break;
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarfx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */