package org.netlib.lapack;

import org.netlib.blas.Drot;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaexc
{
  public static void dlaexc(boolean paramBoolean, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, double[] paramArrayOfDouble3, int paramInt9, intW paramintW)
  {
    intW localintW = new intW(0);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d3 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    doubleW localdoubleW6 = new doubleW(0.0D);
    doubleW localdoubleW7 = new doubleW(0.0D);
    double d7 = 0.0D;
    doubleW localdoubleW8 = new doubleW(0.0D);
    doubleW localdoubleW9 = new doubleW(0.0D);
    doubleW localdoubleW10 = new doubleW(0.0D);
    doubleW localdoubleW11 = new doubleW(0.0D);
    doubleW localdoubleW12 = new doubleW(0.0D);
    double[] arrayOfDouble1 = new double[4 * 4];
    double[] arrayOfDouble2 = new double[3];
    double[] arrayOfDouble3 = new double[3];
    double[] arrayOfDouble4 = new double[3];
    double[] arrayOfDouble5 = new double[2 * 2];
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
      d4 = paramArrayOfDouble1[(paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)];
      d5 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)];
      Dlartg.dlartg(paramArrayOfDouble1[(paramInt6 - 1 + (i - 1) * paramInt3 + paramInt2)], d5 - d4, localdoubleW1, localdoubleW3, localdoubleW7);
      if ((j > paramInt1 ? 0 : 1) != 0) {
        Drot.drot(paramInt1 - paramInt6 - 1, paramArrayOfDouble1, paramInt6 - 1 + (j - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble1, i - 1 + (j - 1) * paramInt3 + paramInt2, paramInt3, localdoubleW1.val, localdoubleW3.val);
      }
      Drot.drot(paramInt6 - 1, paramArrayOfDouble1, 1 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, localdoubleW1.val, localdoubleW3.val);
      paramArrayOfDouble1[(paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = d5;
      paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt3 + paramInt2)] = d4;
      if (paramBoolean) {
        Drot.drot(paramInt1, paramArrayOfDouble2, 1 - 1 + (paramInt6 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, localdoubleW1.val, localdoubleW3.val);
      }
    }
    else
    {
      n = paramInt7 + paramInt8;
      Dlacpy.dlacpy("Full", n, n, paramArrayOfDouble1, paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, arrayOfDouble1, 0, 4);
      d1 = Dlange.dlange("Max", n, n, arrayOfDouble1, 0, 4, paramArrayOfDouble3, paramInt9);
      d2 = Dlamch.dlamch("P");
      d3 = Dlamch.dlamch("S") / d2;
      d7 = Math.max(10.0D * d2 * d1, d3);
      Dlasy2.dlasy2(false, false, -1, paramInt7, paramInt8, arrayOfDouble1, 0, 4, arrayOfDouble1, paramInt7 + 1 - 1 + (paramInt7 + 1 - 1) * 4, 4, arrayOfDouble1, 1 - 1 + (paramInt7 + 1 - 1) * 4, 4, localdoubleW2, arrayOfDouble5, 0, 2, localdoubleW12, localintW);
      m = paramInt7 + paramInt7 + paramInt8 - 3;
      int i1 = m;
      if (i1 != 1)
      {
        if (i1 != 2) {
          if (i1 == 3) {
            break label1541;
          }
        }
      }
      else
      {
        arrayOfDouble2[(1 - 1)] = localdoubleW2.val;
        arrayOfDouble2[(2 - 1)] = arrayOfDouble5[(1 - 1 + (1 - 1) * 2)];
        arrayOfDouble2[(3 - 1)] = arrayOfDouble5[(1 - 1 + (2 - 1) * 2)];
        dlarfg_adapter(3, arrayOfDouble2, 3 - 1, arrayOfDouble2, 0, 1, localdoubleW4);
        arrayOfDouble2[(3 - 1)] = 1.0D;
        d4 = paramArrayOfDouble1[(paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)];
        Dlarfx.dlarfx("L", 3, 3, arrayOfDouble2, 0, localdoubleW4.val, arrayOfDouble1, 0, 4, paramArrayOfDouble3, paramInt9);
        Dlarfx.dlarfx("R", 3, 3, arrayOfDouble2, 0, localdoubleW4.val, arrayOfDouble1, 0, 4, paramArrayOfDouble3, paramInt9);
        if ((Util.max(Math.abs(arrayOfDouble1[(3 - 1 + (1 - 1) * 4)]), Math.abs(arrayOfDouble1[(3 - 1 + (2 - 1) * 4)]), Math.abs(arrayOfDouble1[(3 - 1 + (3 - 1) * 4)] - d4)) <= d7 ? 0 : 1) != 0) {
          break label2755;
        }
        Dlarfx.dlarfx("L", 3, paramInt1 - paramInt6 + 1, arrayOfDouble2, 0, localdoubleW4.val, paramArrayOfDouble1, paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble3, paramInt9);
        Dlarfx.dlarfx("R", i, 3, arrayOfDouble2, 0, localdoubleW4.val, paramArrayOfDouble1, 1 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble3, paramInt9);
        paramArrayOfDouble1[(j - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = 0.0D;
        paramArrayOfDouble1[(j - 1 + (i - 1) * paramInt3 + paramInt2)] = 0.0D;
        paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt3 + paramInt2)] = d4;
        if (paramBoolean) {
          Dlarfx.dlarfx("R", paramInt1, 3, arrayOfDouble2, 0, localdoubleW4.val, paramArrayOfDouble2, 1 - 1 + (paramInt6 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt9);
        }
        break label2235;
      }
      arrayOfDouble2[(1 - 1)] = (-arrayOfDouble5[(1 - 1 + (1 - 1) * 2)]);
      arrayOfDouble2[(2 - 1)] = (-arrayOfDouble5[(2 - 1 + (1 - 1) * 2)]);
      arrayOfDouble2[(3 - 1)] = localdoubleW2.val;
      dlarfg_adapter(3, arrayOfDouble2, 1 - 1, arrayOfDouble2, 2 - 1, 1, localdoubleW4);
      arrayOfDouble2[(1 - 1)] = 1.0D;
      d6 = paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt3 + paramInt2)];
      Dlarfx.dlarfx("L", 3, 3, arrayOfDouble2, 0, localdoubleW4.val, arrayOfDouble1, 0, 4, paramArrayOfDouble3, paramInt9);
      Dlarfx.dlarfx("R", 3, 3, arrayOfDouble2, 0, localdoubleW4.val, arrayOfDouble1, 0, 4, paramArrayOfDouble3, paramInt9);
      if ((Util.max(Math.abs(arrayOfDouble1[(2 - 1 + (1 - 1) * 4)]), Math.abs(arrayOfDouble1[(3 - 1 + (1 - 1) * 4)]), Math.abs(arrayOfDouble1[(1 - 1 + (1 - 1) * 4)] - d6)) <= d7 ? 0 : 1) != 0) {
        break label2755;
      }
      Dlarfx.dlarfx("R", j, 3, arrayOfDouble2, 0, localdoubleW4.val, paramArrayOfDouble1, 1 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble3, paramInt9);
      Dlarfx.dlarfx("L", 3, paramInt1 - paramInt6, arrayOfDouble2, 0, localdoubleW4.val, paramArrayOfDouble1, paramInt6 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble3, paramInt9);
      paramArrayOfDouble1[(paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = d6;
      paramArrayOfDouble1[(i - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = 0.0D;
      paramArrayOfDouble1[(j - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = 0.0D;
      if (paramBoolean) {
        Dlarfx.dlarfx("R", paramInt1, 3, arrayOfDouble2, 0, localdoubleW4.val, paramArrayOfDouble2, 1 - 1 + (paramInt6 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt9);
      }
      break label2235;
      label1541:
      arrayOfDouble3[(1 - 1)] = (-arrayOfDouble5[(1 - 1 + (1 - 1) * 2)]);
      arrayOfDouble3[(2 - 1)] = (-arrayOfDouble5[(2 - 1 + (1 - 1) * 2)]);
      arrayOfDouble3[(3 - 1)] = localdoubleW2.val;
      dlarfg_adapter(3, arrayOfDouble3, 1 - 1, arrayOfDouble3, 2 - 1, 1, localdoubleW5);
      arrayOfDouble3[(1 - 1)] = 1.0D;
      localdoubleW7.val = (-(localdoubleW5.val * (arrayOfDouble5[(1 - 1 + (2 - 1) * 2)] + arrayOfDouble3[(2 - 1)] * arrayOfDouble5[(2 - 1 + (2 - 1) * 2)])));
      arrayOfDouble4[(1 - 1)] = (-(localdoubleW7.val * arrayOfDouble3[(2 - 1)]) - arrayOfDouble5[(2 - 1 + (2 - 1) * 2)]);
      arrayOfDouble4[(2 - 1)] = (-(localdoubleW7.val * arrayOfDouble3[(3 - 1)]));
      arrayOfDouble4[(3 - 1)] = localdoubleW2.val;
      dlarfg_adapter(3, arrayOfDouble4, 1 - 1, arrayOfDouble4, 2 - 1, 1, localdoubleW6);
      arrayOfDouble4[(1 - 1)] = 1.0D;
      Dlarfx.dlarfx("L", 3, 4, arrayOfDouble3, 0, localdoubleW5.val, arrayOfDouble1, 0, 4, paramArrayOfDouble3, paramInt9);
      Dlarfx.dlarfx("R", 4, 3, arrayOfDouble3, 0, localdoubleW5.val, arrayOfDouble1, 0, 4, paramArrayOfDouble3, paramInt9);
      Dlarfx.dlarfx("L", 3, 4, arrayOfDouble4, 0, localdoubleW6.val, arrayOfDouble1, 2 - 1 + (1 - 1) * 4, 4, paramArrayOfDouble3, paramInt9);
      Dlarfx.dlarfx("R", 4, 3, arrayOfDouble4, 0, localdoubleW6.val, arrayOfDouble1, 1 - 1 + (2 - 1) * 4, 4, paramArrayOfDouble3, paramInt9);
      if ((Math.max(Util.max(Math.abs(arrayOfDouble1[(3 - 1 + (1 - 1) * 4)]), Math.abs(arrayOfDouble1[(3 - 1 + (2 - 1) * 4)]), Math.abs(arrayOfDouble1[(4 - 1 + (1 - 1) * 4)])), Math.abs(arrayOfDouble1[(4 - 1 + (2 - 1) * 4)])) <= d7 ? 0 : 1) != 0) {
        break label2755;
      }
      Dlarfx.dlarfx("L", 3, paramInt1 - paramInt6 + 1, arrayOfDouble3, 0, localdoubleW5.val, paramArrayOfDouble1, paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble3, paramInt9);
      Dlarfx.dlarfx("R", k, 3, arrayOfDouble3, 0, localdoubleW5.val, paramArrayOfDouble1, 1 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble3, paramInt9);
      Dlarfx.dlarfx("L", 3, paramInt1 - paramInt6 + 1, arrayOfDouble4, 0, localdoubleW6.val, paramArrayOfDouble1, i - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble3, paramInt9);
      Dlarfx.dlarfx("R", k, 3, arrayOfDouble4, 0, localdoubleW6.val, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble3, paramInt9);
      paramArrayOfDouble1[(j - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = 0.0D;
      paramArrayOfDouble1[(j - 1 + (i - 1) * paramInt3 + paramInt2)] = 0.0D;
      paramArrayOfDouble1[(k - 1 + (paramInt6 - 1) * paramInt3 + paramInt2)] = 0.0D;
      paramArrayOfDouble1[(k - 1 + (i - 1) * paramInt3 + paramInt2)] = 0.0D;
      if (paramBoolean)
      {
        Dlarfx.dlarfx("R", paramInt1, 3, arrayOfDouble3, 0, localdoubleW5.val, paramArrayOfDouble2, 1 - 1 + (paramInt6 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt9);
        Dlarfx.dlarfx("R", paramInt1, 3, arrayOfDouble4, 0, localdoubleW6.val, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, paramInt9);
      }
      label2235:
      if ((paramInt8 != 2 ? 0 : 1) != 0)
      {
        dlanv2_adapter(paramArrayOfDouble1, paramInt6 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramArrayOfDouble1, paramInt6 - 1 + (i - 1) * paramInt3 + paramInt2, paramArrayOfDouble1, i - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt3 + paramInt2, localdoubleW10, localdoubleW8, localdoubleW11, localdoubleW9, localdoubleW1, localdoubleW3);
        Drot.drot(paramInt1 - paramInt6 - 1, paramArrayOfDouble1, paramInt6 - 1 + (paramInt6 + 2 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble1, i - 1 + (paramInt6 + 2 - 1) * paramInt3 + paramInt2, paramInt3, localdoubleW1.val, localdoubleW3.val);
        Drot.drot(paramInt6 - 1, paramArrayOfDouble1, 1 - 1 + (paramInt6 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1, localdoubleW1.val, localdoubleW3.val);
        if (paramBoolean) {
          Drot.drot(paramInt1, paramArrayOfDouble2, 1 - 1 + (paramInt6 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1, localdoubleW1.val, localdoubleW3.val);
        }
      }
      if ((paramInt7 != 2 ? 0 : 1) != 0)
      {
        j = paramInt6 + paramInt8;
        k = j + 1;
        dlanv2_adapter(paramArrayOfDouble1, j - 1 + (j - 1) * paramInt3 + paramInt2, paramArrayOfDouble1, j - 1 + (k - 1) * paramInt3 + paramInt2, paramArrayOfDouble1, k - 1 + (j - 1) * paramInt3 + paramInt2, paramArrayOfDouble1, k - 1 + (k - 1) * paramInt3 + paramInt2, localdoubleW10, localdoubleW8, localdoubleW11, localdoubleW9, localdoubleW1, localdoubleW3);
        if ((j + 2 > paramInt1 ? 0 : 1) != 0) {
          Drot.drot(paramInt1 - j - 1, paramArrayOfDouble1, j - 1 + (j + 2 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble1, k - 1 + (j + 2 - 1) * paramInt3 + paramInt2, paramInt3, localdoubleW1.val, localdoubleW3.val);
        }
        Drot.drot(j - 1, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, 1 - 1 + (k - 1) * paramInt3 + paramInt2, 1, localdoubleW1.val, localdoubleW3.val);
        if (paramBoolean) {
          Drot.drot(paramInt1, paramArrayOfDouble2, 1 - 1 + (j - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, localdoubleW1.val, localdoubleW3.val);
        }
      }
    }
    return;
    label2755:
    paramintW.val = 1;
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, doubleW paramdoubleW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble1[paramInt2]);
    Dlarfg.dlarfg(paramInt1, localdoubleW, paramArrayOfDouble2, paramInt3, paramInt4, paramdoubleW);
    paramArrayOfDouble1[paramInt2] = localdoubleW.val;
  }
  
  private static void dlanv2_adapter(double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, double[] paramArrayOfDouble3, int paramInt3, double[] paramArrayOfDouble4, int paramInt4, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, doubleW paramdoubleW5, doubleW paramdoubleW6)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt1]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble2[paramInt2]);
    doubleW localdoubleW3 = new doubleW(paramArrayOfDouble3[paramInt3]);
    doubleW localdoubleW4 = new doubleW(paramArrayOfDouble4[paramInt4]);
    Dlanv2.dlanv2(localdoubleW1, localdoubleW2, localdoubleW3, localdoubleW4, paramdoubleW1, paramdoubleW2, paramdoubleW3, paramdoubleW4, paramdoubleW5, paramdoubleW6);
    paramArrayOfDouble1[paramInt1] = localdoubleW1.val;
    paramArrayOfDouble2[paramInt2] = localdoubleW2.val;
    paramArrayOfDouble3[paramInt3] = localdoubleW3.val;
    paramArrayOfDouble4[paramInt4] = localdoubleW4.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaexc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */