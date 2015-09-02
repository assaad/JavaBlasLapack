package org.netlib.lapack;

import org.netlib.blas.Srot;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaexc
{
  public static void slaexc(boolean paramBoolean, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, float[] paramArrayOfFloat3, int paramInt9, intW paramintW)
  {
    intW localintW = new intW(0);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    floatW localfloatW1 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    floatW localfloatW2 = new floatW(0.0F);
    float f3 = 0.0F;
    floatW localfloatW3 = new floatW(0.0F);
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    floatW localfloatW4 = new floatW(0.0F);
    floatW localfloatW5 = new floatW(0.0F);
    floatW localfloatW6 = new floatW(0.0F);
    floatW localfloatW7 = new floatW(0.0F);
    float f7 = 0.0F;
    floatW localfloatW8 = new floatW(0.0F);
    floatW localfloatW9 = new floatW(0.0F);
    floatW localfloatW10 = new floatW(0.0F);
    floatW localfloatW11 = new floatW(0.0F);
    floatW localfloatW12 = new floatW(0.0F);
    float[] arrayOfFloat1 = new float[4 * 4];
    float[] arrayOfFloat2 = new float[3];
    float[] arrayOfFloat3 = new float[3];
    float[] arrayOfFloat4 = new float[3];
    float[] arrayOfFloat5 = new float[2 * 2];
    paramintW.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt7 != 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((paramInt8 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt6 + paramInt7 <= paramInt1 ? 0 : 1) != 0) {
      return;
    }
    i = paramInt6 + 1;
    j = paramInt6 + 2;
    k = paramInt6 + 3;
    if ((paramInt7 != 1 ? 0 : 1) != 0) {}
    if (((paramInt8 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      f4 = paramArrayOfFloat1[(paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)];
      f5 = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
      Slartg.slartg(paramArrayOfFloat1[(paramInt6 - 1 + (i - 1) * paramInt3 + paramInt2)], f5 - f4, localfloatW1, localfloatW3, localfloatW7);
      if ((j > paramInt1 ? 0 : 1) != 0) {
        Srot.srot(paramInt1 - paramInt6 - 1, paramArrayOfFloat1, paramInt6 - 1 + (j - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat1, i - 1 + (j - 1) * paramInt3 + paramInt2, paramInt3, localfloatW1.val, localfloatW3.val);
      }
      Srot.srot(paramInt6 - 1, paramArrayOfFloat1, 1 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, localfloatW1.val, localfloatW3.val);
      paramArrayOfFloat1[(paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = f5;
      paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = f4;
      if (paramBoolean) {
        Srot.srot(paramInt1, paramArrayOfFloat2, 1 - 1 + (paramInt6 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, localfloatW1.val, localfloatW3.val);
      }
    }
    else
    {
      n = paramInt7 + paramInt8;
      Slacpy.slacpy("Full", n, n, paramArrayOfFloat1, paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, arrayOfFloat1, 0, 4);
      f1 = Slange.slange("Max", n, n, arrayOfFloat1, 0, 4, paramArrayOfFloat3, paramInt9);
      f2 = Slamch.slamch("P");
      f3 = Slamch.slamch("S") / f2;
      f7 = Math.max(10.0F * f2 * f1, f3);
      Slasy2.slasy2(false, false, -1, paramInt7, paramInt8, arrayOfFloat1, 0, 4, arrayOfFloat1, paramInt7 + 1 - 1 + (paramInt7 + 1 - 1) * 4, 4, arrayOfFloat1, 1 - 1 + (paramInt7 + 1 - 1) * 4, 4, localfloatW2, arrayOfFloat5, 0, 2, localfloatW12, localintW);
      m = paramInt7 + paramInt7 + paramInt8 - 3;
      int i1 = m;
      if (i1 != 1)
      {
        if (i1 != 2) {
          if (i1 == 3) {
            break label1540;
          }
        }
      }
      else
      {
        arrayOfFloat2[(1 - 1)] = localfloatW2.val;
        arrayOfFloat2[(2 - 1)] = arrayOfFloat5[(1 - 1 + (1 - 1) * 2)];
        arrayOfFloat2[(3 - 1)] = arrayOfFloat5[(1 - 1 + (2 - 1) * 2)];
        slarfg_adapter(3, arrayOfFloat2, 3 - 1, arrayOfFloat2, 0, 1, localfloatW4);
        arrayOfFloat2[(3 - 1)] = 1.0F;
        f4 = paramArrayOfFloat1[(paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)];
        Slarfx.slarfx("L", 3, 3, arrayOfFloat2, 0, localfloatW4.val, arrayOfFloat1, 0, 4, paramArrayOfFloat3, paramInt9);
        Slarfx.slarfx("R", 3, 3, arrayOfFloat2, 0, localfloatW4.val, arrayOfFloat1, 0, 4, paramArrayOfFloat3, paramInt9);
        if ((Util.max(Math.abs(arrayOfFloat1[(3 - 1 + (1 - 1) * 4)]), Math.abs(arrayOfFloat1[(3 - 1 + (2 - 1) * 4)]), Math.abs(arrayOfFloat1[(3 - 1 + (3 - 1) * 4)] - f4)) <= f7 ? 0 : 1) != 0) {
          break label2754;
        }
        Slarfx.slarfx("L", 3, paramInt1 - paramInt6 + 1, arrayOfFloat2, 0, localfloatW4.val, paramArrayOfFloat1, paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat3, paramInt9);
        Slarfx.slarfx("R", i, 3, arrayOfFloat2, 0, localfloatW4.val, paramArrayOfFloat1, 1 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat3, paramInt9);
        paramArrayOfFloat1[(j - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = 0.0F;
        paramArrayOfFloat1[(j - 1 + (i - 1) * paramInt3 + paramInt2)] = 0.0F;
        paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt3 + paramInt2)] = f4;
        if (paramBoolean) {
          Slarfx.slarfx("R", paramInt1, 3, arrayOfFloat2, 0, localfloatW4.val, paramArrayOfFloat2, 1 - 1 + (paramInt6 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt9);
        }
        break label2234;
      }
      arrayOfFloat2[(1 - 1)] = (-arrayOfFloat5[(1 - 1 + (1 - 1) * 2)]);
      arrayOfFloat2[(2 - 1)] = (-arrayOfFloat5[(2 - 1 + (1 - 1) * 2)]);
      arrayOfFloat2[(3 - 1)] = localfloatW2.val;
      slarfg_adapter(3, arrayOfFloat2, 1 - 1, arrayOfFloat2, 2 - 1, 1, localfloatW4);
      arrayOfFloat2[(1 - 1)] = 1.0F;
      f6 = paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt3 + paramInt2)];
      Slarfx.slarfx("L", 3, 3, arrayOfFloat2, 0, localfloatW4.val, arrayOfFloat1, 0, 4, paramArrayOfFloat3, paramInt9);
      Slarfx.slarfx("R", 3, 3, arrayOfFloat2, 0, localfloatW4.val, arrayOfFloat1, 0, 4, paramArrayOfFloat3, paramInt9);
      if ((Util.max(Math.abs(arrayOfFloat1[(2 - 1 + (1 - 1) * 4)]), Math.abs(arrayOfFloat1[(3 - 1 + (1 - 1) * 4)]), Math.abs(arrayOfFloat1[(1 - 1 + (1 - 1) * 4)] - f6)) <= f7 ? 0 : 1) != 0) {
        break label2754;
      }
      Slarfx.slarfx("R", j, 3, arrayOfFloat2, 0, localfloatW4.val, paramArrayOfFloat1, 1 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat3, paramInt9);
      Slarfx.slarfx("L", 3, paramInt1 - paramInt6, arrayOfFloat2, 0, localfloatW4.val, paramArrayOfFloat1, paramInt6 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat3, paramInt9);
      paramArrayOfFloat1[(paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = f6;
      paramArrayOfFloat1[(i - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = 0.0F;
      paramArrayOfFloat1[(j - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = 0.0F;
      if (paramBoolean) {
        Slarfx.slarfx("R", paramInt1, 3, arrayOfFloat2, 0, localfloatW4.val, paramArrayOfFloat2, 1 - 1 + (paramInt6 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt9);
      }
      break label2234;
      label1540:
      arrayOfFloat3[(1 - 1)] = (-arrayOfFloat5[(1 - 1 + (1 - 1) * 2)]);
      arrayOfFloat3[(2 - 1)] = (-arrayOfFloat5[(2 - 1 + (1 - 1) * 2)]);
      arrayOfFloat3[(3 - 1)] = localfloatW2.val;
      slarfg_adapter(3, arrayOfFloat3, 1 - 1, arrayOfFloat3, 2 - 1, 1, localfloatW5);
      arrayOfFloat3[(1 - 1)] = 1.0F;
      localfloatW7.val = (-(localfloatW5.val * (arrayOfFloat5[(1 - 1 + (2 - 1) * 2)] + arrayOfFloat3[(2 - 1)] * arrayOfFloat5[(2 - 1 + (2 - 1) * 2)])));
      arrayOfFloat4[(1 - 1)] = (-(localfloatW7.val * arrayOfFloat3[(2 - 1)]) - arrayOfFloat5[(2 - 1 + (2 - 1) * 2)]);
      arrayOfFloat4[(2 - 1)] = (-(localfloatW7.val * arrayOfFloat3[(3 - 1)]));
      arrayOfFloat4[(3 - 1)] = localfloatW2.val;
      slarfg_adapter(3, arrayOfFloat4, 1 - 1, arrayOfFloat4, 2 - 1, 1, localfloatW6);
      arrayOfFloat4[(1 - 1)] = 1.0F;
      Slarfx.slarfx("L", 3, 4, arrayOfFloat3, 0, localfloatW5.val, arrayOfFloat1, 0, 4, paramArrayOfFloat3, paramInt9);
      Slarfx.slarfx("R", 4, 3, arrayOfFloat3, 0, localfloatW5.val, arrayOfFloat1, 0, 4, paramArrayOfFloat3, paramInt9);
      Slarfx.slarfx("L", 3, 4, arrayOfFloat4, 0, localfloatW6.val, arrayOfFloat1, 2 - 1 + (1 - 1) * 4, 4, paramArrayOfFloat3, paramInt9);
      Slarfx.slarfx("R", 4, 3, arrayOfFloat4, 0, localfloatW6.val, arrayOfFloat1, 1 - 1 + (2 - 1) * 4, 4, paramArrayOfFloat3, paramInt9);
      if ((Math.max(Util.max(Math.abs(arrayOfFloat1[(3 - 1 + (1 - 1) * 4)]), Math.abs(arrayOfFloat1[(3 - 1 + (2 - 1) * 4)]), Math.abs(arrayOfFloat1[(4 - 1 + (1 - 1) * 4)])), Math.abs(arrayOfFloat1[(4 - 1 + (2 - 1) * 4)])) <= f7 ? 0 : 1) != 0) {
        break label2754;
      }
      Slarfx.slarfx("L", 3, paramInt1 - paramInt6 + 1, arrayOfFloat3, 0, localfloatW5.val, paramArrayOfFloat1, paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat3, paramInt9);
      Slarfx.slarfx("R", k, 3, arrayOfFloat3, 0, localfloatW5.val, paramArrayOfFloat1, 1 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat3, paramInt9);
      Slarfx.slarfx("L", 3, paramInt1 - paramInt6 + 1, arrayOfFloat4, 0, localfloatW6.val, paramArrayOfFloat1, i - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat3, paramInt9);
      Slarfx.slarfx("R", k, 3, arrayOfFloat4, 0, localfloatW6.val, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat3, paramInt9);
      paramArrayOfFloat1[(j - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = 0.0F;
      paramArrayOfFloat1[(j - 1 + (i - 1) * paramInt3 + paramInt2)] = 0.0F;
      paramArrayOfFloat1[(k - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = 0.0F;
      paramArrayOfFloat1[(k - 1 + (i - 1) * paramInt3 + paramInt2)] = 0.0F;
      if (paramBoolean)
      {
        Slarfx.slarfx("R", paramInt1, 3, arrayOfFloat3, 0, localfloatW5.val, paramArrayOfFloat2, 1 - 1 + (paramInt6 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt9);
        Slarfx.slarfx("R", paramInt1, 3, arrayOfFloat4, 0, localfloatW6.val, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, paramInt9);
      }
      label2234:
      if ((paramInt8 != 2 ? 0 : 1) != 0)
      {
        slanv2_adapter(paramArrayOfFloat1, paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramArrayOfFloat1, paramInt6 - 1 + (i - 1) * paramInt3 + paramInt2, paramArrayOfFloat1, i - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt3 + paramInt2, localfloatW10, localfloatW8, localfloatW11, localfloatW9, localfloatW1, localfloatW3);
        Srot.srot(paramInt1 - paramInt6 - 1, paramArrayOfFloat1, paramInt6 - 1 + (paramInt6 + 2 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat1, i - 1 + (paramInt6 + 2 - 1) * paramInt3 + paramInt2, paramInt3, localfloatW1.val, localfloatW3.val);
        Srot.srot(paramInt6 - 1, paramArrayOfFloat1, 1 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, localfloatW1.val, localfloatW3.val);
        if (paramBoolean) {
          Srot.srot(paramInt1, paramArrayOfFloat2, 1 - 1 + (paramInt6 - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, localfloatW1.val, localfloatW3.val);
        }
      }
      if ((paramInt7 != 2 ? 0 : 1) != 0)
      {
        j = paramInt6 + paramInt8;
        k = j + 1;
        slanv2_adapter(paramArrayOfFloat1, j - 1 + (j - 1) * paramInt3 + paramInt2, paramArrayOfFloat1, j - 1 + (k - 1) * paramInt3 + paramInt2, paramArrayOfFloat1, k - 1 + (j - 1) * paramInt3 + paramInt2, paramArrayOfFloat1, k - 1 + (k - 1) * paramInt3 + paramInt2, localfloatW10, localfloatW8, localfloatW11, localfloatW9, localfloatW1, localfloatW3);
        if ((j + 2 > paramInt1 ? 0 : 1) != 0) {
          Srot.srot(paramInt1 - j - 1, paramArrayOfFloat1, j - 1 + (j + 2 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfFloat1, k - 1 + (j + 2 - 1) * paramInt3 + paramInt2, paramInt3, localfloatW1.val, localfloatW3.val);
        }
        Srot.srot(j - 1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1, paramArrayOfFloat1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, localfloatW1.val, localfloatW3.val);
        if (paramBoolean) {
          Srot.srot(paramInt1, paramArrayOfFloat2, 1 - 1 + (j - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, localfloatW1.val, localfloatW3.val);
        }
      }
    }
    return;
    label2754:
    paramintW.val = 1;
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, floatW paramfloatW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat1[paramInt2]);
    Slarfg.slarfg(paramInt1, localfloatW, paramArrayOfFloat2, paramInt3, paramInt4, paramfloatW);
    paramArrayOfFloat1[paramInt2] = localfloatW.val;
  }
  
  private static void slanv2_adapter(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, float[] paramArrayOfFloat3, int paramInt3, float[] paramArrayOfFloat4, int paramInt4, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, floatW paramfloatW4, floatW paramfloatW5, floatW paramfloatW6)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt1]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat2[paramInt2]);
    floatW localfloatW3 = new floatW(paramArrayOfFloat3[paramInt3]);
    floatW localfloatW4 = new floatW(paramArrayOfFloat4[paramInt4]);
    Slanv2.slanv2(localfloatW1, localfloatW2, localfloatW3, localfloatW4, paramfloatW1, paramfloatW2, paramfloatW3, paramfloatW4, paramfloatW5, paramfloatW6);
    paramArrayOfFloat1[paramInt1] = localfloatW1.val;
    paramArrayOfFloat2[paramInt2] = localfloatW2.val;
    paramArrayOfFloat3[paramInt3] = localfloatW3.val;
    paramArrayOfFloat4[paramInt4] = localfloatW4.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaexc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */