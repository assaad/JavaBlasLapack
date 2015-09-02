package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Drot;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlahqr
{
  public static void dlahqr(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, intW paramintW)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
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
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d17 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d18 = 0.0D;
    doubleW localdoubleW5 = new doubleW(0.0D);
    double d19 = 0.0D;
    double d20 = 0.0D;
    double d21 = 0.0D;
    double d22 = 0.0D;
    double d23 = 0.0D;
    double d24 = 0.0D;
    double d25 = 0.0D;
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
    double[] arrayOfDouble = new double[3];
    paramintW.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt2 != paramInt3 ? 0 : 1) != 0)
    {
      paramArrayOfDouble2[(paramInt2 - 1 + paramInt6)] = paramArrayOfDouble1[(paramInt2 - 1 + (paramInt2 - 1) * paramInt5 + paramInt4)];
      paramArrayOfDouble3[(paramInt2 - 1 + paramInt7)] = 0.0D;
      return;
    }
    n = paramInt2;
    for (int i7 = paramInt3 - 3 - paramInt2 + 1; i7 > 0; i7--)
    {
      paramArrayOfDouble1[(n + 2 - 1 + (n - 1) * paramInt5 + paramInt4)] = 0.0D;
      paramArrayOfDouble1[(n + 3 - 1 + (n - 1) * paramInt5 + paramInt4)] = 0.0D;
      n += 1;
    }
    if ((paramInt2 > paramInt3 - 2 ? 0 : 1) != 0) {
      paramArrayOfDouble1[(paramInt3 - 1 + (paramInt3 - 2 - 1) * paramInt5 + paramInt4)] = 0.0D;
    }
    i4 = paramInt3 - paramInt2 + 1;
    i6 = paramInt9 - paramInt8 + 1;
    localdoubleW3.val = Dlamch.dlamch("SAFE MINIMUM");
    localdoubleW2.val = (1.0D / localdoubleW3.val);
    Dlabad.dlabad(localdoubleW3, localdoubleW2);
    d23 = Dlamch.dlamch("PRECISION");
    d17 = localdoubleW3.val * (i4 / d23);
    if (paramBoolean1)
    {
      j = 1;
      k = paramInt1;
    }
    for (i = paramInt3;; i = i2 - 1)
    {
      i2 = paramInt2;
      if ((i >= paramInt2 ? 0 : 1) != 0) {
        break;
      }
      m = 0;
      for (i7 = 30 - 0 + 1; i7 > 0; i7--)
      {
        i1 = i;
        for (int i8 = (i2 + 1 - i + -1) / -1; i8 > 0; i8--)
        {
          if ((Math.abs(paramArrayOfDouble1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]) > d17 ? 0 : 1) != 0) {
            break;
          }
          d22 = Math.abs(paramArrayOfDouble1[(i1 - 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfDouble1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]);
          if ((d22 != 0.0D ? 0 : 1) != 0)
          {
            if ((i1 - 2 < paramInt2 ? 0 : 1) != 0) {
              d22 += Math.abs(paramArrayOfDouble1[(i1 - 1 - 1 + (i1 - 2 - 1) * paramInt5 + paramInt4)]);
            }
            if ((i1 + 1 > paramInt3 ? 0 : 1) != 0) {
              d22 += Math.abs(paramArrayOfDouble1[(i1 + 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]);
            }
          }
          if ((Math.abs(paramArrayOfDouble1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]) > d23 * d22 ? 0 : 1) != 0)
          {
            d2 = Math.max(Math.abs(paramArrayOfDouble1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfDouble1[(i1 - 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]));
            d3 = Math.min(Math.abs(paramArrayOfDouble1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfDouble1[(i1 - 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]));
            d1 = Math.max(Math.abs(paramArrayOfDouble1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfDouble1[(i1 - 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] - paramArrayOfDouble1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]));
            d4 = Math.min(Math.abs(paramArrayOfDouble1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]), Math.abs(paramArrayOfDouble1[(i1 - 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] - paramArrayOfDouble1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]));
            d16 = d1 + d2;
            if ((d3 * (d2 / d16) > Math.max(d17, d23 * (d4 * (d1 / d16))) ? 0 : 1) != 0) {
              break;
            }
          }
          i1 += -1;
        }
        i2 = i1;
        if ((i2 <= paramInt2 ? 0 : 1) != 0) {
          paramArrayOfDouble1[(i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
        }
        if ((i2 < i - 1 ? 0 : 1) != 0) {
          break;
        }
        if ((paramBoolean1 ^ true))
        {
          j = i2;
          k = i;
        }
        if ((m != 10 ? 0 : 1) == 0) {}
        if (((m != 20 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          d6 = 0.75D * d16 + paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
          d7 = -0.4375D * d16;
          d8 = d16;
          d10 = d6;
        }
        else
        {
          d6 = paramArrayOfDouble1[(i - 1 - 1 + (i - 1 - 1) * paramInt5 + paramInt4)];
          d8 = paramArrayOfDouble1[(i - 1 + (i - 1 - 1) * paramInt5 + paramInt4)];
          d7 = paramArrayOfDouble1[(i - 1 - 1 + (i - 1) * paramInt5 + paramInt4)];
          d10 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
        }
        d16 = Math.abs(d6) + Math.abs(d7) + Math.abs(d8) + Math.abs(d10);
        if ((d16 != 0.0D ? 0 : 1) != 0)
        {
          d12 = 0.0D;
          d11 = 0.0D;
          d14 = 0.0D;
          d13 = 0.0D;
        }
        else
        {
          d6 /= d16;
          d8 /= d16;
          d7 /= d16;
          d10 /= d16;
          d21 = (d6 + d10) / 2.0D;
          d5 = (d6 - d21) * (d10 - d21) - d7 * d8;
          d15 = Math.sqrt(Math.abs(d5));
          if ((d5 < 0.0D ? 0 : 1) != 0)
          {
            d12 = d21 * d16;
            d14 = d12;
            d11 = d15 * d16;
            d13 = -d11;
          }
          else
          {
            d12 = d21 + d15;
            d14 = d21 - d15;
            if ((Math.abs(d12 - d10) > Math.abs(d14 - d10) ? 0 : 1) != 0)
            {
              d12 *= d16;
              d14 = d12;
            }
            else
            {
              d14 *= d16;
              d12 = d14;
            }
            d11 = 0.0D;
            d13 = 0.0D;
          }
        }
        i3 = i - 2;
        for (i8 = (i2 - (i - 2) + -1) / -1; i8 > 0; i8--)
        {
          d9 = paramArrayOfDouble1[(i3 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4)];
          d16 = Math.abs(paramArrayOfDouble1[(i3 - 1 + (i3 - 1) * paramInt5 + paramInt4)] - d14) + Math.abs(d13) + Math.abs(d9);
          d9 = paramArrayOfDouble1[(i3 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4)] / d16;
          arrayOfDouble[(1 - 1)] = (d9 * paramArrayOfDouble1[(i3 - 1 + (i3 + 1 - 1) * paramInt5 + paramInt4)] + (paramArrayOfDouble1[(i3 - 1 + (i3 - 1) * paramInt5 + paramInt4)] - d12) * ((paramArrayOfDouble1[(i3 - 1 + (i3 - 1) * paramInt5 + paramInt4)] - d14) / d16) - d11 * (d13 / d16));
          arrayOfDouble[(2 - 1)] = (d9 * (paramArrayOfDouble1[(i3 - 1 + (i3 - 1) * paramInt5 + paramInt4)] + paramArrayOfDouble1[(i3 + 1 - 1 + (i3 + 1 - 1) * paramInt5 + paramInt4)] - d12 - d14));
          arrayOfDouble[(3 - 1)] = (d9 * paramArrayOfDouble1[(i3 + 2 - 1 + (i3 + 1 - 1) * paramInt5 + paramInt4)]);
          d16 = Math.abs(arrayOfDouble[(1 - 1)]) + Math.abs(arrayOfDouble[(2 - 1)]) + Math.abs(arrayOfDouble[(3 - 1)]);
          arrayOfDouble[(1 - 1)] /= d16;
          arrayOfDouble[(2 - 1)] /= d16;
          arrayOfDouble[(3 - 1)] /= d16;
          if ((i3 != i2 ? 0 : 1) != 0) {
            break;
          }
          if ((Math.abs(paramArrayOfDouble1[(i3 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4)]) * (Math.abs(arrayOfDouble[(2 - 1)]) + Math.abs(arrayOfDouble[(3 - 1)])) > d23 * Math.abs(arrayOfDouble[(1 - 1)]) * (Math.abs(paramArrayOfDouble1[(i3 - 1 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfDouble1[(i3 - 1 + (i3 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfDouble1[(i3 + 1 - 1 + (i3 + 1 - 1) * paramInt5 + paramInt4)])) ? 0 : 1) != 0) {
            break;
          }
          i3 += -1;
        }
        i1 = i3;
        for (i8 = i - 1 - i3 + 1; i8 > 0; i8--)
        {
          i5 = Math.min(3, i - i1 + 1);
          if ((i1 <= i3 ? 0 : 1) != 0) {
            Dcopy.dcopy(i5, paramArrayOfDouble1, i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4, 1, arrayOfDouble, 0, 1);
          }
          dlarfg_adapter(i5, arrayOfDouble, 1 - 1, arrayOfDouble, 2 - 1, 1, localdoubleW5);
          if ((i1 <= i3 ? 0 : 1) != 0)
          {
            paramArrayOfDouble1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] = arrayOfDouble[(1 - 1)];
            paramArrayOfDouble1[(i1 + 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
            if ((i1 >= i - 1 ? 0 : 1) != 0) {
              paramArrayOfDouble1[(i1 + 2 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
            }
          }
          else if ((i3 <= i2 ? 0 : 1) != 0)
          {
            paramArrayOfDouble1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfDouble1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)]);
          }
          d24 = arrayOfDouble[(2 - 1)];
          d19 = localdoubleW5.val * d24;
          int i9;
          if ((i5 != 3 ? 0 : 1) != 0)
          {
            d25 = arrayOfDouble[(3 - 1)];
            d20 = localdoubleW5.val * d25;
            n = i1;
            for (i9 = k - i1 + 1; i9 > 0; i9--)
            {
              d18 = paramArrayOfDouble1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)] + d24 * paramArrayOfDouble1[(i1 + 1 - 1 + (n - 1) * paramInt5 + paramInt4)] + d25 * paramArrayOfDouble1[(i1 + 2 - 1 + (n - 1) * paramInt5 + paramInt4)];
              paramArrayOfDouble1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)] -= d18 * localdoubleW5.val;
              paramArrayOfDouble1[(i1 + 1 - 1 + (n - 1) * paramInt5 + paramInt4)] -= d18 * d19;
              paramArrayOfDouble1[(i1 + 2 - 1 + (n - 1) * paramInt5 + paramInt4)] -= d18 * d20;
              n += 1;
            }
            n = j;
            for (i9 = Math.min(i1 + 3, i) - j + 1; i9 > 0; i9--)
            {
              d18 = paramArrayOfDouble1[(n - 1 + (i1 - 1) * paramInt5 + paramInt4)] + d24 * paramArrayOfDouble1[(n - 1 + (i1 + 1 - 1) * paramInt5 + paramInt4)] + d25 * paramArrayOfDouble1[(n - 1 + (i1 + 2 - 1) * paramInt5 + paramInt4)];
              paramArrayOfDouble1[(n - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= d18 * localdoubleW5.val;
              paramArrayOfDouble1[(n - 1 + (i1 + 1 - 1) * paramInt5 + paramInt4)] -= d18 * d19;
              paramArrayOfDouble1[(n - 1 + (i1 + 2 - 1) * paramInt5 + paramInt4)] -= d18 * d20;
              n += 1;
            }
            if (paramBoolean2)
            {
              n = paramInt8;
              for (i9 = paramInt9 - paramInt8 + 1; i9 > 0; i9--)
              {
                d18 = paramArrayOfDouble4[(n - 1 + (i1 - 1) * paramInt11 + paramInt10)] + d24 * paramArrayOfDouble4[(n - 1 + (i1 + 1 - 1) * paramInt11 + paramInt10)] + d25 * paramArrayOfDouble4[(n - 1 + (i1 + 2 - 1) * paramInt11 + paramInt10)];
                paramArrayOfDouble4[(n - 1 + (i1 - 1) * paramInt11 + paramInt10)] -= d18 * localdoubleW5.val;
                paramArrayOfDouble4[(n - 1 + (i1 + 1 - 1) * paramInt11 + paramInt10)] -= d18 * d19;
                paramArrayOfDouble4[(n - 1 + (i1 + 2 - 1) * paramInt11 + paramInt10)] -= d18 * d20;
                n += 1;
              }
            }
          }
          else if ((i5 != 2 ? 0 : 1) != 0)
          {
            n = i1;
            for (i9 = k - i1 + 1; i9 > 0; i9--)
            {
              d18 = paramArrayOfDouble1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)] + d24 * paramArrayOfDouble1[(i1 + 1 - 1 + (n - 1) * paramInt5 + paramInt4)];
              paramArrayOfDouble1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)] -= d18 * localdoubleW5.val;
              paramArrayOfDouble1[(i1 + 1 - 1 + (n - 1) * paramInt5 + paramInt4)] -= d18 * d19;
              n += 1;
            }
            n = j;
            for (i9 = i - j + 1; i9 > 0; i9--)
            {
              d18 = paramArrayOfDouble1[(n - 1 + (i1 - 1) * paramInt5 + paramInt4)] + d24 * paramArrayOfDouble1[(n - 1 + (i1 + 1 - 1) * paramInt5 + paramInt4)];
              paramArrayOfDouble1[(n - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= d18 * localdoubleW5.val;
              paramArrayOfDouble1[(n - 1 + (i1 + 1 - 1) * paramInt5 + paramInt4)] -= d18 * d19;
              n += 1;
            }
            if (paramBoolean2)
            {
              n = paramInt8;
              i9 = paramInt9 - paramInt8 + 1;
            }
            for (;;)
            {
              d18 = paramArrayOfDouble4[(n - 1 + (i1 - 1) * paramInt11 + paramInt10)] + d24 * paramArrayOfDouble4[(n - 1 + (i1 + 1 - 1) * paramInt11 + paramInt10)];
              paramArrayOfDouble4[(n - 1 + (i1 - 1) * paramInt11 + paramInt10)] -= d18 * localdoubleW5.val;
              paramArrayOfDouble4[(n - 1 + (i1 + 1 - 1) * paramInt11 + paramInt10)] -= d18 * d19;
              n += 1;
              i9--;
              if (i9 <= 0) {
                break;
              }
            }
          }
          i1 += 1;
        }
        m += 1;
      }
      paramintW.val = i;
      return;
      if ((i2 != i ? 0 : 1) != 0)
      {
        paramArrayOfDouble2[(i - 1 + paramInt6)] = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble3[(i - 1 + paramInt7)] = 0.0D;
      }
      else if ((i2 != i - 1 ? 0 : 1) != 0)
      {
        dlanv2_adapter(paramArrayOfDouble1, i - 1 - 1 + (i - 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i - 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i - 1 + (i - 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble2, i - 1 - 1 + paramInt6, paramArrayOfDouble3, i - 1 - 1 + paramInt7, paramArrayOfDouble2, i - 1 + paramInt6, paramArrayOfDouble3, i - 1 + paramInt7, localdoubleW1, localdoubleW4);
        if (paramBoolean1)
        {
          if ((k <= i ? 0 : 1) != 0) {
            Drot.drot(k - i, paramArrayOfDouble1, i - 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, localdoubleW1.val, localdoubleW4.val);
          }
          Drot.drot(i - j - 1, paramArrayOfDouble1, j - 1 + (i - 1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble1, j - 1 + (i - 1) * paramInt5 + paramInt4, 1, localdoubleW1.val, localdoubleW4.val);
        }
        if (paramBoolean2) {
          Drot.drot(i6, paramArrayOfDouble4, paramInt8 - 1 + (i - 1 - 1) * paramInt11 + paramInt10, 1, paramArrayOfDouble4, paramInt8 - 1 + (i - 1) * paramInt11 + paramInt10, 1, localdoubleW1.val, localdoubleW4.val);
        }
      }
    }
  }
  
  private static void dlarfg_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, doubleW paramdoubleW)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble1[paramInt2]);
    Dlarfg.dlarfg(paramInt1, localdoubleW, paramArrayOfDouble2, paramInt3, paramInt4, paramdoubleW);
    paramArrayOfDouble1[paramInt2] = localdoubleW.val;
  }
  
  private static void dlanv2_adapter(double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, double[] paramArrayOfDouble3, int paramInt3, double[] paramArrayOfDouble4, int paramInt4, double[] paramArrayOfDouble5, int paramInt5, double[] paramArrayOfDouble6, int paramInt6, double[] paramArrayOfDouble7, int paramInt7, double[] paramArrayOfDouble8, int paramInt8, doubleW paramdoubleW1, doubleW paramdoubleW2)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt1]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble2[paramInt2]);
    doubleW localdoubleW3 = new doubleW(paramArrayOfDouble3[paramInt3]);
    doubleW localdoubleW4 = new doubleW(paramArrayOfDouble4[paramInt4]);
    doubleW localdoubleW5 = new doubleW(paramArrayOfDouble5[paramInt5]);
    doubleW localdoubleW6 = new doubleW(paramArrayOfDouble6[paramInt6]);
    doubleW localdoubleW7 = new doubleW(paramArrayOfDouble7[paramInt7]);
    doubleW localdoubleW8 = new doubleW(paramArrayOfDouble8[paramInt8]);
    Dlanv2.dlanv2(localdoubleW1, localdoubleW2, localdoubleW3, localdoubleW4, localdoubleW5, localdoubleW6, localdoubleW7, localdoubleW8, paramdoubleW1, paramdoubleW2);
    paramArrayOfDouble1[paramInt1] = localdoubleW1.val;
    paramArrayOfDouble2[paramInt2] = localdoubleW2.val;
    paramArrayOfDouble3[paramInt3] = localdoubleW3.val;
    paramArrayOfDouble4[paramInt4] = localdoubleW4.val;
    paramArrayOfDouble5[paramInt5] = localdoubleW5.val;
    paramArrayOfDouble6[paramInt6] = localdoubleW6.val;
    paramArrayOfDouble7[paramInt7] = localdoubleW7.val;
    paramArrayOfDouble8[paramInt8] = localdoubleW8.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlahqr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */