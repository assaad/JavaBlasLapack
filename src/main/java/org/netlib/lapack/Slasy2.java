package org.netlib.lapack;

import org.netlib.blas.Isamax;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sswap;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slasy2
{
  public static boolean[] bswpiv = { false, true, false, true };
  public static boolean[] xswpiv;
  public static int[] locl21;
  public static int[] locu12;
  public static int[] locu22 = { 4, 3, 2, 1 };
  
  static
  {
    locl21 = new int[] { 2, 1, 4, 3 };
    locu12 = new int[] { 3, 4, 1, 2 };
    xswpiv = new boolean[] { false, false, true, true };
  }
  
  public static void slasy2(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, floatW paramfloatW1, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, floatW paramfloatW2, intW paramintW)
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
    int[] arrayOfInt = new int[4];
    float[] arrayOfFloat1 = new float[4];
    float[] arrayOfFloat2 = new float[4 * 4];
    float[] arrayOfFloat3 = new float[4];
    float[] arrayOfFloat4 = new float[2];
    paramintW.val = 0;
    if ((paramInt2 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    f2 = Slamch.slamch("P");
    f7 = Slamch.slamch("S") / f2;
    f5 = paramInt1;
    i5 = paramInt2 + paramInt2 + paramInt3 - 2;
    int i6 = i5;
    if (i6 != 1)
    {
      if (i6 != 2)
      {
        if (i6 == 3) {
          break label757;
        }
        if (i6 == 4) {
          break label1699;
        }
      }
    }
    else
    {
      f8 = paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)];
      f1 = Math.abs(f8);
      if ((f1 > f7 ? 0 : 1) != 0)
      {
        f8 = f7;
        f1 = f7;
        paramintW.val = 1;
      }
      paramfloatW1.val = 1.0F;
      f3 = Math.abs(paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt9 + paramInt8)]);
      if ((f7 * f3 <= f1 ? 0 : 1) != 0) {
        paramfloatW1.val = (1.0F / f3);
      }
      paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt11 + paramInt10)] = (paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt9 + paramInt8)] * paramfloatW1.val / f8);
      paramfloatW2.val = Math.abs(paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt11 + paramInt10)]);
      return;
    }
    f6 = Math.max(f2 * Math.max(Math.max(Util.max(Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)]), Math.abs(paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt7 + paramInt6)])), Math.abs(paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)])), Math.abs(paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt7 + paramInt6)])), f7);
    arrayOfFloat3[(1 - 1)] = (paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
    arrayOfFloat3[(4 - 1)] = (paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt7 + paramInt6)]);
    if (paramBoolean2)
    {
      arrayOfFloat3[(2 - 1)] = (f5 * paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
      arrayOfFloat3[(3 - 1)] = (f5 * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt7 + paramInt6)]);
    }
    else
    {
      arrayOfFloat3[(2 - 1)] = (f5 * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt7 + paramInt6)]);
      arrayOfFloat3[(3 - 1)] = (f5 * paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
    }
    arrayOfFloat1[(1 - 1)] = paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt9 + paramInt8)];
    arrayOfFloat1[(2 - 1)] = paramArrayOfFloat3[(1 - 1 + (2 - 1) * paramInt9 + paramInt8)];
    break label1094;
    label757:
    f6 = Math.max(f2 * Math.max(Math.max(Util.max(Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)]), Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt5 + paramInt4)])), Math.abs(paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt5 + paramInt4)])), Math.abs(paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt5 + paramInt4)])), f7);
    arrayOfFloat3[(1 - 1)] = (paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
    arrayOfFloat3[(4 - 1)] = (paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
    if (paramBoolean1)
    {
      arrayOfFloat3[(2 - 1)] = paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt5 + paramInt4)];
      arrayOfFloat3[(3 - 1)] = paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt5 + paramInt4)];
    }
    else
    {
      arrayOfFloat3[(2 - 1)] = paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt5 + paramInt4)];
      arrayOfFloat3[(3 - 1)] = paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt5 + paramInt4)];
    }
    arrayOfFloat1[(1 - 1)] = paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt9 + paramInt8)];
    arrayOfFloat1[(2 - 1)] = paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt9 + paramInt8)];
    label1094:
    n = Isamax.isamax(4, arrayOfFloat3, 0, 1);
    f10 = arrayOfFloat3[(n - 1)];
    if ((Math.abs(f10) > f6 ? 0 : 1) != 0)
    {
      paramintW.val = 1;
      f10 = f6;
    }
    f11 = arrayOfFloat3[(locu12[(n - 1)] - 1)];
    f4 = arrayOfFloat3[(locl21[(n - 1)] - 1)] / f10;
    f12 = arrayOfFloat3[(locu22[(n - 1)] - 1)] - f11 * f4;
    j = xswpiv[(n - 1)];
    i = bswpiv[(n - 1)];
    if ((Math.abs(f12) > f6 ? 0 : 1) != 0)
    {
      paramintW.val = 1;
      f12 = f6;
    }
    if (i != 0)
    {
      f9 = arrayOfFloat1[(2 - 1)];
      arrayOfFloat1[(2 - 1)] = (arrayOfFloat1[(1 - 1)] - f4 * f9);
      arrayOfFloat1[(1 - 1)] = f9;
    }
    else
    {
      arrayOfFloat1[(2 - 1)] -= f4 * arrayOfFloat1[(1 - 1)];
    }
    paramfloatW1.val = 1.0F;
    if ((2.0F * f7 * Math.abs(arrayOfFloat1[(2 - 1)]) <= Math.abs(f12) ? 0 : 1) == 0) {}
    if (((2.0F * f7 * Math.abs(arrayOfFloat1[(1 - 1)]) <= Math.abs(f10) ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramfloatW1.val = (0.5F / Math.max(Math.abs(arrayOfFloat1[(1 - 1)]), Math.abs(arrayOfFloat1[(2 - 1)])));
      arrayOfFloat1[(1 - 1)] *= paramfloatW1.val;
      arrayOfFloat1[(2 - 1)] *= paramfloatW1.val;
    }
    arrayOfFloat1[(2 - 1)] /= f12;
    arrayOfFloat4[(1 - 1)] = (arrayOfFloat1[(1 - 1)] / f10 - f11 / f10 * arrayOfFloat4[(2 - 1)]);
    if (j != 0)
    {
      f9 = arrayOfFloat4[(2 - 1)];
      arrayOfFloat4[(2 - 1)] = arrayOfFloat4[(1 - 1)];
      arrayOfFloat4[(1 - 1)] = f9;
    }
    paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt11 + paramInt10)] = arrayOfFloat4[(1 - 1)];
    if ((paramInt2 != 1 ? 0 : 1) != 0)
    {
      paramArrayOfFloat4[(1 - 1 + (2 - 1) * paramInt11 + paramInt10)] = arrayOfFloat4[(2 - 1)];
      paramfloatW2.val = (Math.abs(paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt11 + paramInt10)]) + Math.abs(paramArrayOfFloat4[(1 - 1 + (2 - 1) * paramInt11 + paramInt10)]));
    }
    else
    {
      paramArrayOfFloat4[(2 - 1 + (1 - 1) * paramInt11 + paramInt10)] = arrayOfFloat4[(2 - 1)];
      paramfloatW2.val = Math.max(Math.abs(paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt11 + paramInt10)]), Math.abs(paramArrayOfFloat4[(2 - 1 + (1 - 1) * paramInt11 + paramInt10)]));
    }
    return;
    label1699:
    f6 = Math.max(Util.max(Math.abs(paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)]), Math.abs(paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt7 + paramInt6)]), Math.abs(paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)])), Math.abs(paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt7 + paramInt6)]));
    f6 = Math.max(Math.max(Util.max(f6, Math.abs(paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt5 + paramInt4)])), Math.abs(paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt5 + paramInt4)])), Math.abs(paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt5 + paramInt4)]));
    f6 = Math.max(f2 * f6, f7);
    arrayOfFloat1[(1 - 1)] = 0.0F;
    Scopy.scopy(16, arrayOfFloat1, 0, 0, arrayOfFloat2, 0, 1);
    arrayOfFloat2[(1 - 1 + (1 - 1) * 4)] = (paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
    arrayOfFloat2[(2 - 1 + (2 - 1) * 4)] = (paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
    arrayOfFloat2[(3 - 1 + (3 - 1) * 4)] = (paramArrayOfFloat1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt7 + paramInt6)]);
    arrayOfFloat2[(4 - 1 + (4 - 1) * 4)] = (paramArrayOfFloat1[(2 - 1 + (2 - 1) * paramInt5 + paramInt4)] + f5 * paramArrayOfFloat2[(2 - 1 + (2 - 1) * paramInt7 + paramInt6)]);
    if (paramBoolean1)
    {
      arrayOfFloat2[(1 - 1 + (2 - 1) * 4)] = paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt5 + paramInt4)];
      arrayOfFloat2[(2 - 1 + (1 - 1) * 4)] = paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt5 + paramInt4)];
      arrayOfFloat2[(3 - 1 + (4 - 1) * 4)] = paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt5 + paramInt4)];
      arrayOfFloat2[(4 - 1 + (3 - 1) * 4)] = paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt5 + paramInt4)];
    }
    else
    {
      arrayOfFloat2[(1 - 1 + (2 - 1) * 4)] = paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt5 + paramInt4)];
      arrayOfFloat2[(2 - 1 + (1 - 1) * 4)] = paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt5 + paramInt4)];
      arrayOfFloat2[(3 - 1 + (4 - 1) * 4)] = paramArrayOfFloat1[(1 - 1 + (2 - 1) * paramInt5 + paramInt4)];
      arrayOfFloat2[(4 - 1 + (3 - 1) * 4)] = paramArrayOfFloat1[(2 - 1 + (1 - 1) * paramInt5 + paramInt4)];
    }
    if (paramBoolean2)
    {
      arrayOfFloat2[(1 - 1 + (3 - 1) * 4)] = (f5 * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt7 + paramInt6)]);
      arrayOfFloat2[(2 - 1 + (4 - 1) * 4)] = (f5 * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt7 + paramInt6)]);
      arrayOfFloat2[(3 - 1 + (1 - 1) * 4)] = (f5 * paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
      arrayOfFloat2[(4 - 1 + (2 - 1) * 4)] = (f5 * paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
    }
    else
    {
      arrayOfFloat2[(1 - 1 + (3 - 1) * 4)] = (f5 * paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
      arrayOfFloat2[(2 - 1 + (4 - 1) * 4)] = (f5 * paramArrayOfFloat2[(2 - 1 + (1 - 1) * paramInt7 + paramInt6)]);
      arrayOfFloat2[(3 - 1 + (1 - 1) * 4)] = (f5 * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt7 + paramInt6)]);
      arrayOfFloat2[(4 - 1 + (2 - 1) * 4)] = (f5 * paramArrayOfFloat2[(1 - 1 + (2 - 1) * paramInt7 + paramInt6)]);
    }
    arrayOfFloat1[(1 - 1)] = paramArrayOfFloat3[(1 - 1 + (1 - 1) * paramInt9 + paramInt8)];
    arrayOfFloat1[(2 - 1)] = paramArrayOfFloat3[(2 - 1 + (1 - 1) * paramInt9 + paramInt8)];
    arrayOfFloat1[(3 - 1)] = paramArrayOfFloat3[(1 - 1 + (2 - 1) * paramInt9 + paramInt8)];
    arrayOfFloat1[(4 - 1)] = paramArrayOfFloat3[(2 - 1 + (2 - 1) * paramInt9 + paramInt8)];
    k = 1;
    int i7;
    for (i6 = 3 - 1 + 1; i6 > 0; i6--)
    {
      f13 = 0.0F;
      m = k;
      int i8;
      for (i7 = 4 - k + 1; i7 > 0; i7--)
      {
        i3 = k;
        for (i8 = 4 - k + 1; i8 > 0; i8--)
        {
          if ((Math.abs(arrayOfFloat2[(m - 1 + (i3 - 1) * 4)]) < f13 ? 0 : 1) != 0)
          {
            f13 = Math.abs(arrayOfFloat2[(m - 1 + (i3 - 1) * 4)]);
            i1 = m;
            i4 = i3;
          }
          i3 += 1;
        }
        m += 1;
      }
      if ((i1 == k ? 0 : 1) != 0)
      {
        Sswap.sswap(4, arrayOfFloat2, i1 - 1 + (1 - 1) * 4, 4, arrayOfFloat2, k - 1 + (1 - 1) * 4, 4);
        f9 = arrayOfFloat1[(k - 1)];
        arrayOfFloat1[(k - 1)] = arrayOfFloat1[(i1 - 1)];
        arrayOfFloat1[(i1 - 1)] = f9;
      }
      if ((i4 == k ? 0 : 1) != 0) {
        Sswap.sswap(4, arrayOfFloat2, 1 - 1 + (i4 - 1) * 4, 1, arrayOfFloat2, 1 - 1 + (k - 1) * 4, 1);
      }
      arrayOfInt[(k - 1)] = i4;
      if ((Math.abs(arrayOfFloat2[(k - 1 + (k - 1) * 4)]) >= f6 ? 0 : 1) != 0)
      {
        paramintW.val = 1;
        arrayOfFloat2[(k - 1 + (k - 1) * 4)] = f6;
      }
      i2 = k + 1;
      for (i7 = 4 - (k + 1) + 1; i7 > 0; i7--)
      {
        arrayOfFloat2[(i2 - 1 + (k - 1) * 4)] /= arrayOfFloat2[(k - 1 + (k - 1) * 4)];
        arrayOfFloat1[(i2 - 1)] -= arrayOfFloat2[(i2 - 1 + (k - 1) * 4)] * arrayOfFloat1[(k - 1)];
        i5 = k + 1;
        for (i8 = 4 - (k + 1) + 1; i8 > 0; i8--)
        {
          arrayOfFloat2[(i2 - 1 + (i5 - 1) * 4)] -= arrayOfFloat2[(i2 - 1 + (k - 1) * 4)] * arrayOfFloat2[(k - 1 + (i5 - 1) * 4)];
          i5 += 1;
        }
        i2 += 1;
      }
      k += 1;
    }
    if ((Math.abs(arrayOfFloat2[(4 - 1 + (4 - 1) * 4)]) >= f6 ? 0 : 1) != 0) {
      arrayOfFloat2[(4 - 1 + (4 - 1) * 4)] = f6;
    }
    paramfloatW1.val = 1.0F;
    if ((8.0F * f7 * Math.abs(arrayOfFloat1[(1 - 1)]) <= Math.abs(arrayOfFloat2[(1 - 1 + (1 - 1) * 4)]) ? 0 : 1) == 0) {}
    if (((8.0F * f7 * Math.abs(arrayOfFloat1[(2 - 1)]) <= Math.abs(arrayOfFloat2[(2 - 1 + (2 - 1) * 4)]) ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((8.0F * f7 * Math.abs(arrayOfFloat1[(3 - 1)]) <= Math.abs(arrayOfFloat2[(3 - 1 + (3 - 1) * 4)]) ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((8.0F * f7 * Math.abs(arrayOfFloat1[(4 - 1)]) <= Math.abs(arrayOfFloat2[(4 - 1 + (4 - 1) * 4)]) ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramfloatW1.val = (1.0F / 8.0F / Math.max(Util.max(Math.abs(arrayOfFloat1[(1 - 1)]), Math.abs(arrayOfFloat1[(2 - 1)]), Math.abs(arrayOfFloat1[(3 - 1)])), Math.abs(arrayOfFloat1[(4 - 1)])));
      arrayOfFloat1[(1 - 1)] *= paramfloatW1.val;
      arrayOfFloat1[(2 - 1)] *= paramfloatW1.val;
      arrayOfFloat1[(3 - 1)] *= paramfloatW1.val;
      arrayOfFloat1[(4 - 1)] *= paramfloatW1.val;
    }
    k = 1;
    for (i6 = 4 - 1 + 1; i6 > 0; i6--)
    {
      i5 = 5 - k;
      f9 = 1.0F / arrayOfFloat2[(i5 - 1 + (i5 - 1) * 4)];
      arrayOfFloat1[(i5 - 1)] *= f9;
      i2 = i5 + 1;
      for (i7 = 4 - (i5 + 1) + 1; i7 > 0; i7--)
      {
        arrayOfFloat3[(i5 - 1)] -= f9 * arrayOfFloat2[(i5 - 1 + (i2 - 1) * 4)] * arrayOfFloat3[(i2 - 1)];
        i2 += 1;
      }
      k += 1;
    }
    k = 1;
    for (i6 = 3 - 1 + 1; i6 > 0; i6--)
    {
      if ((arrayOfInt[(4 - k - 1)] == 4 - k ? 0 : 1) != 0)
      {
        f9 = arrayOfFloat3[(4 - k - 1)];
        arrayOfFloat3[(4 - k - 1)] = arrayOfFloat3[(arrayOfInt[(4 - k - 1)] - 1)];
        arrayOfFloat3[(arrayOfInt[(4 - k - 1)] - 1)] = f9;
      }
      k += 1;
    }
    paramArrayOfFloat4[(1 - 1 + (1 - 1) * paramInt11 + paramInt10)] = arrayOfFloat3[(1 - 1)];
    paramArrayOfFloat4[(2 - 1 + (1 - 1) * paramInt11 + paramInt10)] = arrayOfFloat3[(2 - 1)];
    paramArrayOfFloat4[(1 - 1 + (2 - 1) * paramInt11 + paramInt10)] = arrayOfFloat3[(3 - 1)];
    paramArrayOfFloat4[(2 - 1 + (2 - 1) * paramInt11 + paramInt10)] = arrayOfFloat3[(4 - 1)];
    paramfloatW2.val = Math.max(Math.abs(arrayOfFloat3[(1 - 1)]) + Math.abs(arrayOfFloat3[(3 - 1)]), Math.abs(arrayOfFloat3[(2 - 1)]) + Math.abs(arrayOfFloat3[(4 - 1)]));
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slasy2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */