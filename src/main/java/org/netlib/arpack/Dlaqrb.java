package org.netlib.arpack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Drot;
import org.netlib.lapack.Dlabad;
import org.netlib.lapack.Dlamch;
import org.netlib.lapack.Dlanhs;
import org.netlib.lapack.Dlanv2;
import org.netlib.lapack.Dlarfg;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaqrb
{
  public static void dlaqrb(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, intW paramintW)
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
    doubleW localdoubleW1 = new doubleW(0.0D);
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
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d12 = 0.0D;
    double d13 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d14 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    doubleW localdoubleW5 = new doubleW(0.0D);
    double d19 = 0.0D;
    double d20 = 0.0D;
    double d21 = 0.0D;
    double[] arrayOfDouble1 = new double[3];
    double[] arrayOfDouble2 = new double[1];
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
    i1 = 1;
    for (int i7 = paramInt1 - 1 - 1 + 1; i7 > 0; i7--)
    {
      paramArrayOfDouble4[(i1 - 1 + paramInt8)] = 0.0D;
      i1 += 1;
    }
    paramArrayOfDouble4[(paramInt1 - 1 + paramInt8)] = 1.0D;
    i5 = paramInt3 - paramInt2 + 1;
    localdoubleW5.val = Dlamch.dlamch("safe minimum");
    localdoubleW2.val = (1.0D / localdoubleW5.val);
    Dlabad.dlabad(localdoubleW5, localdoubleW2);
    d18 = Dlamch.dlamch("precision");
    d13 = localdoubleW5.val * (i5 / d18);
    if (paramBoolean)
    {
      j = 1;
      k = paramInt1;
      i = 1;
      for (i7 = k - 2 - 1 + 1; i7 > 0; i7--)
      {
        paramArrayOfDouble1[(j + i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)] = 0.0D;
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (i7 = paramInt3 - paramInt2 - 1 - 1 + 1; i7 > 0; i7--)
      {
        paramArrayOfDouble1[(paramInt2 + i + 1 - 1 + (paramInt2 + i - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
        i += 1;
      }
    }
    m = 30 * i5;
    for (i = paramInt3;; i = i3 - 1)
    {
      i3 = paramInt2;
      if ((i >= paramInt2 ? 0 : 1) != 0) {
        break;
      }
      n = 0;
      for (i7 = m - 0 + 1; i7 > 0; i7--)
      {
        i2 = i;
        for (int i8 = (i3 + 1 - i + -1) / -1; i8 > 0; i8--)
        {
          d17 = Math.abs(paramArrayOfDouble1[(i2 - 1 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfDouble1[(i2 - 1 + (i2 - 1) * paramInt5 + paramInt4)]);
          if ((d17 != 0.0D ? 0 : 1) != 0) {
            d17 = Dlanhs.dlanhs("1", i - i3 + 1, paramArrayOfDouble1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble2, 0);
          }
          if ((Math.abs(paramArrayOfDouble1[(i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)]) > Math.max(d18 * d17, d13) ? 0 : 1) != 0) {
            break;
          }
          i2 += -1;
        }
        i3 = i2;
        if ((i3 <= paramInt2 ? 0 : 1) != 0) {
          paramArrayOfDouble1[(i3 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
        }
        if ((i3 < i - 1 ? 0 : 1) != 0) {
          break;
        }
        if ((paramBoolean ^ true))
        {
          j = i3;
          k = i;
        }
        if ((n != 10 ? 0 : 1) == 0) {}
        if (((n != 20 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          d12 = Math.abs(paramArrayOfDouble1[(i - 1 + (i - 1 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfDouble1[(i - 1 - 1 + (i - 2 - 1) * paramInt5 + paramInt4)]);
          d10 = 0.75D * d12;
          d7 = d10;
          d9 = -0.4375D * d12 * d12;
        }
        else
        {
          d10 = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
          d7 = paramArrayOfDouble1[(i - 1 - 1 + (i - 1 - 1) * paramInt5 + paramInt4)];
          d9 = paramArrayOfDouble1[(i - 1 + (i - 1 - 1) * paramInt5 + paramInt4)] * paramArrayOfDouble1[(i - 1 - 1 + (i - 1) * paramInt5 + paramInt4)];
        }
        i4 = i - 2;
        for (i8 = (i3 - (i - 2) + -1) / -1; i8 > 0; i8--)
        {
          d3 = paramArrayOfDouble1[(i4 - 1 + (i4 - 1) * paramInt5 + paramInt4)];
          d6 = paramArrayOfDouble1[(i4 + 1 - 1 + (i4 + 1 - 1) * paramInt5 + paramInt4)];
          d5 = paramArrayOfDouble1[(i4 + 1 - 1 + (i4 - 1) * paramInt5 + paramInt4)];
          d4 = paramArrayOfDouble1[(i4 - 1 + (i4 + 1 - 1) * paramInt5 + paramInt4)];
          d11 = d10 - d3;
          d8 = d7 - d3;
          d19 = (d8 * d11 - d9) / d5 + d4;
          d20 = d6 - d3 - d8 - d11;
          d21 = paramArrayOfDouble1[(i4 + 2 - 1 + (i4 + 1 - 1) * paramInt5 + paramInt4)];
          d12 = Math.abs(d19) + Math.abs(d20) + Math.abs(d21);
          d19 /= d12;
          d20 /= d12;
          d21 /= d12;
          arrayOfDouble1[(1 - 1)] = d19;
          arrayOfDouble1[(2 - 1)] = d20;
          arrayOfDouble1[(3 - 1)] = d21;
          if ((i4 != i3 ? 0 : 1) != 0) {
            break;
          }
          d1 = paramArrayOfDouble1[(i4 - 1 - 1 + (i4 - 1 - 1) * paramInt5 + paramInt4)];
          d2 = paramArrayOfDouble1[(i4 - 1 + (i4 - 1 - 1) * paramInt5 + paramInt4)];
          d17 = Math.abs(d19) * (Math.abs(d1) + Math.abs(d3) + Math.abs(d6));
          if ((Math.abs(d2) * (Math.abs(d20) + Math.abs(d21)) > d18 * d17 ? 0 : 1) != 0) {
            break;
          }
          i4 += -1;
        }
        i2 = i4;
        for (i8 = i - 1 - i4 + 1; i8 > 0; i8--)
        {
          i6 = Math.min(3, i - i2 + 1);
          if ((i2 <= i4 ? 0 : 1) != 0) {
            Dcopy.dcopy(i6, paramArrayOfDouble1, i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4, 1, arrayOfDouble1, 0, 1);
          }
          dlarfg_adapter(i6, arrayOfDouble1, 1 - 1, arrayOfDouble1, 2 - 1, 1, localdoubleW4);
          if ((i2 <= i4 ? 0 : 1) != 0)
          {
            paramArrayOfDouble1[(i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = arrayOfDouble1[(1 - 1)];
            paramArrayOfDouble1[(i2 + 1 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
            if ((i2 >= i - 1 ? 0 : 1) != 0) {
              paramArrayOfDouble1[(i2 + 2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = 0.0D;
            }
          }
          else if ((i4 <= i3 ? 0 : 1) != 0)
          {
            paramArrayOfDouble1[(i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = (-paramArrayOfDouble1[(i2 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)]);
          }
          d20 = arrayOfDouble1[(2 - 1)];
          d15 = localdoubleW4.val * d20;
          int i9;
          if ((i6 != 3 ? 0 : 1) != 0)
          {
            d21 = arrayOfDouble1[(3 - 1)];
            d16 = localdoubleW4.val * d21;
            i1 = i2;
            for (i9 = k - i2 + 1; i9 > 0; i9--)
            {
              d14 = paramArrayOfDouble1[(i2 - 1 + (i1 - 1) * paramInt5 + paramInt4)] + d20 * paramArrayOfDouble1[(i2 + 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)] + d21 * paramArrayOfDouble1[(i2 + 2 - 1 + (i1 - 1) * paramInt5 + paramInt4)];
              paramArrayOfDouble1[(i2 - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= d14 * localdoubleW4.val;
              paramArrayOfDouble1[(i2 + 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= d14 * d15;
              paramArrayOfDouble1[(i2 + 2 - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= d14 * d16;
              i1 += 1;
            }
            i1 = j;
            for (i9 = Math.min(i2 + 3, i) - j + 1; i9 > 0; i9--)
            {
              d14 = paramArrayOfDouble1[(i1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] + d20 * paramArrayOfDouble1[(i1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)] + d21 * paramArrayOfDouble1[(i1 - 1 + (i2 + 2 - 1) * paramInt5 + paramInt4)];
              paramArrayOfDouble1[(i1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= d14 * localdoubleW4.val;
              paramArrayOfDouble1[(i1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)] -= d14 * d15;
              paramArrayOfDouble1[(i1 - 1 + (i2 + 2 - 1) * paramInt5 + paramInt4)] -= d14 * d16;
              i1 += 1;
            }
            d14 = paramArrayOfDouble4[(i2 - 1 + paramInt8)] + d20 * paramArrayOfDouble4[(i2 + 1 - 1 + paramInt8)] + d21 * paramArrayOfDouble4[(i2 + 2 - 1 + paramInt8)];
            paramArrayOfDouble4[(i2 - 1 + paramInt8)] -= d14 * localdoubleW4.val;
            paramArrayOfDouble4[(i2 + 1 - 1 + paramInt8)] -= d14 * d15;
            paramArrayOfDouble4[(i2 + 2 - 1 + paramInt8)] -= d14 * d16;
          }
          else if ((i6 != 2 ? 0 : 1) != 0)
          {
            i1 = i2;
            for (i9 = k - i2 + 1; i9 > 0; i9--)
            {
              d14 = paramArrayOfDouble1[(i2 - 1 + (i1 - 1) * paramInt5 + paramInt4)] + d20 * paramArrayOfDouble1[(i2 + 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)];
              paramArrayOfDouble1[(i2 - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= d14 * localdoubleW4.val;
              paramArrayOfDouble1[(i2 + 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)] -= d14 * d15;
              i1 += 1;
            }
            i1 = j;
            for (i9 = i - j + 1; i9 > 0; i9--)
            {
              d14 = paramArrayOfDouble1[(i1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] + d20 * paramArrayOfDouble1[(i1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)];
              paramArrayOfDouble1[(i1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= d14 * localdoubleW4.val;
              paramArrayOfDouble1[(i1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)] -= d14 * d15;
              i1 += 1;
            }
            d14 = paramArrayOfDouble4[(i2 - 1 + paramInt8)] + d20 * paramArrayOfDouble4[(i2 + 1 - 1 + paramInt8)];
            paramArrayOfDouble4[(i2 - 1 + paramInt8)] -= d14 * localdoubleW4.val;
            paramArrayOfDouble4[(i2 + 1 - 1 + paramInt8)] -= d14 * d15;
          }
          i2 += 1;
        }
        n += 1;
      }
      paramintW.val = i;
      return;
      if ((i3 != i ? 0 : 1) != 0)
      {
        paramArrayOfDouble2[(i - 1 + paramInt6)] = paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
        paramArrayOfDouble3[(i - 1 + paramInt7)] = 0.0D;
      }
      else if ((i3 != i - 1 ? 0 : 1) != 0)
      {
        dlanv2_adapter(paramArrayOfDouble1, i - 1 - 1 + (i - 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i - 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i - 1 + (i - 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble2, i - 1 - 1 + paramInt6, paramArrayOfDouble3, i - 1 - 1 + paramInt7, paramArrayOfDouble2, i - 1 + paramInt6, paramArrayOfDouble3, i - 1 + paramInt7, localdoubleW1, localdoubleW3);
        if (paramBoolean)
        {
          if ((k <= i ? 0 : 1) != 0) {
            Drot.drot(k - i, paramArrayOfDouble1, i - 1 - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i - 1 + (i + 1 - 1) * paramInt5 + paramInt4, paramInt5, localdoubleW1.val, localdoubleW3.val);
          }
          Drot.drot(i - j - 1, paramArrayOfDouble1, j - 1 + (i - 1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble1, j - 1 + (i - 1) * paramInt5 + paramInt4, 1, localdoubleW1.val, localdoubleW3.val);
          d14 = localdoubleW1.val * paramArrayOfDouble4[(i - 1 - 1 + paramInt8)] + localdoubleW3.val * paramArrayOfDouble4[(i - 1 + paramInt8)];
          paramArrayOfDouble4[(i - 1 + paramInt8)] = (localdoubleW1.val * paramArrayOfDouble4[(i - 1 + paramInt8)] - localdoubleW3.val * paramArrayOfDouble4[(i - 1 - 1 + paramInt8)]);
          paramArrayOfDouble4[(i - 1 - 1 + paramInt8)] = d14;
        }
      }
      m -= n;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dlaqrb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */