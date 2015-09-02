package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlarre
{
  public static void dlarre(String paramString, int paramInt1, doubleW paramdoubleW1, doubleW paramdoubleW2, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double paramDouble1, double paramDouble2, double paramDouble3, intW paramintW1, int[] paramArrayOfInt1, int paramInt7, intW paramintW2, double[] paramArrayOfDouble4, int paramInt8, double[] paramArrayOfDouble5, int paramInt9, double[] paramArrayOfDouble6, int paramInt10, int[] paramArrayOfInt2, int paramInt11, int[] paramArrayOfInt3, int paramInt12, double[] paramArrayOfDouble7, int paramInt13, doubleW paramdoubleW3, double[] paramArrayOfDouble8, int paramInt14, int[] paramArrayOfInt4, int paramInt15, intW paramintW3)
  {
    ;
    ;
    ;
    int i = 0;
    int j = 0;
    int k = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    intW localintW4 = new intW(0);
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    intW localintW5 = new intW(0);
    int i10 = 0;
    int i11 = 0;
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
    double d22 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    int[] arrayOfInt1 = new int[4];
    paramintW3.val = 0;
    if (Lsame.lsame(paramString, "A")) {
      i6 = 1;
    } else if (Lsame.lsame(paramString, "V")) {
      i6 = 3;
    } else if (Lsame.lsame(paramString, "I")) {
      i6 = 2;
    }
    paramintW2.val = 0;
    d18 = Dlamch.dlamch("S");
    d9 = Dlamch.dlamch("P");
    d14 = Math.sqrt(d9);
    d2 = Math.sqrt(d9);
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((i6 != 1 ? 0 : 1) == 0)
      {
        if ((i6 != 3 ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble1[(1 - 1 + paramInt4)] <= paramdoubleW1.val ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((paramArrayOfDouble1[(1 - 1 + paramInt4)] > paramdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0)
      {
        if ((i6 != 2 ? 0 : 1) != 0) {}
        if (((paramInt2 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((paramInt3 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = 1;
        paramArrayOfDouble4[(1 - 1 + paramInt8)] = paramArrayOfDouble1[(1 - 1 + paramInt4)];
        paramArrayOfDouble5[(1 - 1 + paramInt9)] = 0.0D;
        paramArrayOfDouble6[(1 - 1 + paramInt10)] = 0.0D;
        paramArrayOfInt2[(1 - 1 + paramInt11)] = 1;
        paramArrayOfInt3[(1 - 1 + paramInt12)] = 1;
        paramArrayOfDouble7[(1 - 1 + paramInt13)] = paramArrayOfDouble1[(1 - 1 + paramInt4)];
        paramArrayOfDouble7[(2 - 1 + paramInt13)] = paramArrayOfDouble1[(1 - 1 + paramInt4)];
      }
      paramArrayOfDouble2[(1 - 1 + paramInt5)] = 0.0D;
      return;
    }
    d10 = paramArrayOfDouble1[(1 - 1 + paramInt4)];
    d11 = paramArrayOfDouble1[(1 - 1 + paramInt4)];
    d8 = 0.0D;
    d7 = 0.0D;
    paramArrayOfDouble2[(paramInt1 - 1 + paramInt5)] = 0.0D;
    m = 1;
    int i12 = paramInt1 - 1 + 1;
    while (i12 > 0)
    {
      paramArrayOfDouble5[(m - 1 + paramInt9)] = 0.0D;
      paramArrayOfDouble6[(m - 1 + paramInt10)] = 0.0D;
      d6 = Math.abs(paramArrayOfDouble2[(m - 1 + paramInt5)]);
      if ((d6 < d7 ? 0 : 1) != 0) {
        d7 = d6;
      }
      localdoubleW2.val = (d6 + d8);
      paramArrayOfDouble7[(2 * m - 1 - 1 + paramInt13)] = (paramArrayOfDouble1[(m - 1 + paramInt4)] - localdoubleW2.val);
      d10 = Math.min(d10, paramArrayOfDouble7[(2 * m - 1 - 1 + paramInt13)]);
      paramArrayOfDouble7[(2 * m - 1 + paramInt13)] = (paramArrayOfDouble1[(m - 1 + paramInt4)] + localdoubleW2.val);
      d11 = Math.max(d11, paramArrayOfDouble7[(2 * m - 1 + paramInt13)]);
      d8 = d6;
      m += 1;
      ???--;
    }
    paramdoubleW3.val = (d18 * Math.max(1.0D, Math.pow(d7, 2)));
    d21 = d11 - d10;
    Dlarra.dlarra(paramInt1, paramArrayOfDouble1, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble3, paramInt6, paramDouble3, d21, paramintW1, paramArrayOfInt1, paramInt7, localintW4);
    i = 0;
    if ((i6 != 1 ? 0 : 1) != 0) {}
    if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
    {
      paramdoubleW1.val = d10;
      paramdoubleW2.val = d11;
    }
    else
    {
      Dlarrd.dlarrd(paramString, "B", paramInt1, paramdoubleW1.val, paramdoubleW2.val, paramInt2, paramInt3, paramArrayOfDouble7, paramInt13, d2, paramArrayOfDouble1, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble3, paramInt6, paramdoubleW3.val, paramintW1.val, paramArrayOfInt1, paramInt7, localintW5, paramArrayOfDouble4, paramInt8, paramArrayOfDouble5, paramInt9, paramdoubleW1, paramdoubleW2, paramArrayOfInt2, paramInt11, paramArrayOfInt3, paramInt12, paramArrayOfDouble8, paramInt14, paramArrayOfInt4, paramInt15, localintW4);
      if ((localintW4.val == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = -1;
        return;
      }
      m = localintW5.val + 1;
      i12 = paramInt1 - (localintW5.val + 1) + 1;
      while (i12 > 0)
      {
        paramArrayOfDouble4[(m - 1 + paramInt8)] = 0.0D;
        paramArrayOfDouble5[(m - 1 + paramInt9)] = 0.0D;
        paramArrayOfInt2[(m - 1 + paramInt11)] = 0;
        paramArrayOfInt3[(m - 1 + paramInt12)] = 0;
        m += 1;
        ???--;
      }
    }
    n = 1;
    i10 = 1;
    i8 = 1;
    i12 = paramintW1.val - 1 + 1;
    label4825:
    while (i12 > 0)
    {
      i2 = paramArrayOfInt1[(i8 - 1 + paramInt7)];
      i3 = i2 - n + 1;
      if ((i3 != 1 ? 0 : 1) != 0)
      {
        if ((i6 != 1 ? 0 : 1) == 0)
        {
          if ((i6 != 3 ? 0 : 1) != 0) {}
          if (((paramArrayOfDouble1[(n - 1 + paramInt4)] <= paramdoubleW1.val ? 0 : 1) != 0 ? 1 : 0) == 0) {}
        }
        if ((((paramArrayOfDouble1[(n - 1 + paramInt4)] > paramdoubleW2.val ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
          if ((i6 != 2 ? 0 : 1) == 0) {}
        }
        if ((((paramArrayOfInt2[(i10 - 1 + paramInt11)] != i8 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW2.val += 1;
          paramArrayOfDouble4[(paramintW2.val - 1 + paramInt8)] = paramArrayOfDouble1[(n - 1 + paramInt4)];
          paramArrayOfDouble5[(paramintW2.val - 1 + paramInt9)] = 0.0D;
          paramArrayOfDouble6[(paramintW2.val - 1 + paramInt10)] = 0.0D;
          paramArrayOfInt2[(paramintW2.val - 1 + paramInt11)] = i8;
          paramArrayOfInt3[(paramintW2.val - 1 + paramInt12)] = 1;
          i10 += 1;
        }
        paramArrayOfDouble2[(i2 - 1 + paramInt5)] = 0.0D;
        n = i2 + 1;
      }
      else
      {
        paramArrayOfDouble2[(i2 - 1 + paramInt5)] = 0.0D;
        d10 = paramArrayOfDouble1[(n - 1 + paramInt4)];
        d11 = paramArrayOfDouble1[(n - 1 + paramInt4)];
        m = n;
        int i13 = i2 - n + 1;
        while (i13 > 0)
        {
          d10 = Math.min(paramArrayOfDouble7[(2 * m - 1 - 1 + paramInt13)], d10);
          d11 = Math.max(paramArrayOfDouble7[(2 * m - 1 + paramInt13)], d11);
          m += 1;
          ???--;
        }
        d21 = d11 - d10;
        if ((i6 != 1 ? 0 : 1) != 0) {}
        if ((((i ^ 0x1) != 0 ? 1 : 0) ^ 0x1) != 0)
        {
          i9 = 0;
          m = i10;
          i13 = localintW5.val - i10 + 1;
          while (i13 > 0)
          {
            if ((paramArrayOfInt2[(m - 1 + paramInt11)] != i8 ? 0 : 1) != 0) {
              i9 += 1;
            } else {
              break;
            }
            m += 1;
            ???--;
          }
          if ((i9 != 0 ? 0 : 1) != 0)
          {
            paramArrayOfDouble2[(i2 - 1 + paramInt5)] = 0.0D;
            n = i2 + 1;
            break label4825;
          }
          else
          {
            if ((i9 <= 0.5D * i3 ? 0 : 1) != 0) {}
            k = (i ^ 0x1) != 0 ? 1 : 0;
            i11 = i10 + i9 - 1;
            d20 = 0.0D;
            m = i10;
            i13 = i11 - 1 - i10 + 1;
            while (i13 > 0)
            {
              paramArrayOfDouble6[(m - 1 + paramInt10)] = Math.max(0.0D, paramArrayOfDouble4[(m + 1 - 1 + paramInt8)] - paramArrayOfDouble5[(m + 1 - 1 + paramInt9)] - (paramArrayOfDouble4[(m - 1 + paramInt8)] + paramArrayOfDouble5[(m - 1 + paramInt9)]));
              m += 1;
              ???--;
            }
            paramArrayOfDouble6[(i11 - 1 + paramInt10)] = Math.max(0.0D, paramdoubleW2.val - d20 - (paramArrayOfDouble4[(i11 - 1 + paramInt8)] + paramArrayOfDouble5[(i11 - 1 + paramInt9)]));
            i4 = paramArrayOfInt3[(i10 - 1 + paramInt12)];
            i5 = paramArrayOfInt3[(i11 - 1 + paramInt12)];
          }
        }
        else
        {
          if ((i6 != 1 ? 0 : 1) != 0) {}
          if (((i ^ 0x1) != 0 ? 1 : 0) == 0) {}
          if ((k == 0 ? 0 : 1) != 0)
          {
            Dlarrk.dlarrk(i3, 1, d10, d11, paramArrayOfDouble1, n - 1 + paramInt4, paramArrayOfDouble3, n - 1 + paramInt6, paramdoubleW3.val, d14, localdoubleW1, localdoubleW2, localintW4);
            if ((localintW4.val == 0 ? 0 : 1) != 0)
            {
              paramintW3.val = -1;
              return;
            }
            d12 = Math.max(d10, localdoubleW1.val - localdoubleW2.val - 100.0D * d9 * Math.abs(localdoubleW1.val - localdoubleW2.val));
            Dlarrk.dlarrk(i3, i3, d10, d11, paramArrayOfDouble1, n - 1 + paramInt4, paramArrayOfDouble3, n - 1 + paramInt6, paramdoubleW3.val, d14, localdoubleW1, localdoubleW2, localintW4);
            if ((localintW4.val == 0 ? 0 : 1) != 0)
            {
              paramintW3.val = -1;
              return;
            }
            d13 = Math.min(d11, localdoubleW1.val + localdoubleW2.val + 100.0D * d9 * Math.abs(localdoubleW1.val + localdoubleW2.val));
            d21 = d13 - d12;
          }
          else
          {
            d12 = Math.max(d10, paramArrayOfDouble4[(i10 - 1 + paramInt8)] - paramArrayOfDouble5[(i10 - 1 + paramInt9)] - 100.0D * d9 * Math.abs(paramArrayOfDouble4[(i10 - 1 + paramInt8)] - paramArrayOfDouble5[(i10 - 1 + paramInt9)]));
            d13 = Math.min(d11, paramArrayOfDouble4[(i11 - 1 + paramInt8)] + paramArrayOfDouble5[(i11 - 1 + paramInt9)] + 100.0D * d9 * Math.abs(paramArrayOfDouble4[(i11 - 1 + paramInt8)] + paramArrayOfDouble5[(i11 - 1 + paramInt9)]));
          }
          if ((i6 != 1 ? 0 : 1) != 0) {}
          if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
          {
            k = 1;
            i4 = 1;
            i5 = i3;
            i9 = i3;
            i11 = i10 + i9 - 1;
            d16 = d12 + 0.25D * d21;
            d17 = d13 - 0.25D * d21;
          }
          else if (k != 0)
          {
            d16 = d12 + 0.25D * d21;
            d17 = d13 - 0.25D * d21;
          }
          else
          {
            localdoubleW1.val = (Math.min(d13, paramdoubleW2.val) - Math.max(d12, paramdoubleW1.val));
            d16 = Math.max(d12, paramdoubleW1.val) + 0.25D * localdoubleW1.val;
            d17 = Math.min(d13, paramdoubleW2.val) - 0.25D * localdoubleW1.val;
          }
          if ((i9 <= 1 ? 0 : 1) != 0) {
            Dlarrc.dlarrc("T", i3, d16, d17, paramArrayOfDouble1, n - 1 + paramInt4, paramArrayOfDouble2, n - 1 + paramInt5, paramdoubleW3.val, localintW1, localintW2, localintW3, localintW4);
          }
          if ((i9 != 1 ? 0 : 1) != 0)
          {
            d20 = d10;
            d19 = 1.0D;
          }
          else if ((localintW2.val - i4 < i5 - localintW3.val ? 0 : 1) != 0)
          {
            if ((i6 != 1 ? 0 : 1) != 0) {}
            if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
              d20 = Math.max(d12, d10);
            } else if (k != 0) {
              d20 = d12;
            } else {
              d20 = Math.max(d12, paramdoubleW1.val);
            }
            d19 = 1.0D;
          }
          else
          {
            if ((i6 != 1 ? 0 : 1) != 0) {}
            if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
              d20 = Math.min(d13, d11);
            } else if (k != 0) {
              d20 = d13;
            } else {
              d20 = Math.min(d13, paramdoubleW2.val);
            }
            d19 = -1.0D;
          }
          if (k != 0)
          {
            d22 = d21 * d9 * paramInt1 + 2.0D * paramdoubleW3.val;
          }
          else if ((i9 <= 1 ? 0 : 1) != 0)
          {
            d3 = paramArrayOfDouble4[(i11 - 1 + paramInt8)] + paramArrayOfDouble5[(i11 - 1 + paramInt9)] - paramArrayOfDouble4[(i10 - 1 + paramInt8)] - paramArrayOfDouble5[(i10 - 1 + paramInt9)];
            d1 = Math.abs(d3 / (i11 - i10));
            if ((d19 != 1.0D ? 0 : 1) != 0)
            {
              d22 = 0.5D * Math.max(paramArrayOfDouble6[(i10 - 1 + paramInt10)], d1);
              d22 = Math.max(d22, paramArrayOfDouble5[(i10 - 1 + paramInt9)]);
            }
            else
            {
              d22 = 0.5D * Math.max(paramArrayOfDouble6[(i11 - 1 - 1 + paramInt10)], d1);
              d22 = Math.max(d22, paramArrayOfDouble5[(i11 - 1 + paramInt9)]);
            }
          }
          else
          {
            d22 = paramArrayOfDouble5[(i10 - 1 + paramInt9)];
          }
          i1 = 1;
          i13 = 6 - 1 + 1;
          while (i13 > 0)
          {
            d5 = paramArrayOfDouble1[(n - 1 + paramInt4)] - d20;
            paramArrayOfDouble8[(1 - 1 + paramInt14)] = d5;
            d4 = Math.abs(paramArrayOfDouble8[(1 - 1 + paramInt14)]);
            i7 = n;
            m = 1;
            int i14 = i3 - 1 - 1 + 1;
            while (i14 > 0)
            {
              paramArrayOfDouble8[(2 * i3 + m - 1 + paramInt14)] = (1.0D / paramArrayOfDouble8[(m - 1 + paramInt14)]);
              localdoubleW1.val = (paramArrayOfDouble2[(i7 - 1 + paramInt5)] * paramArrayOfDouble8[(2 * i3 + m - 1 + paramInt14)]);
              paramArrayOfDouble8[(i3 + m - 1 + paramInt14)] = localdoubleW1.val;
              d5 = paramArrayOfDouble1[(i7 + 1 - 1 + paramInt4)] - d20 - localdoubleW1.val * paramArrayOfDouble2[(i7 - 1 + paramInt5)];
              paramArrayOfDouble8[(m + 1 - 1 + paramInt14)] = d5;
              d4 = Math.max(d4, Math.abs(d5));
              i7 += 1;
              m += 1;
              ???--;
            }
            if ((d4 <= 64.0D * d21 ? 0 : 1) != 0) {
              j = 1;
            } else {
              j = 0;
            }
            if (((k != 0) && ((j ^ 0x1) != 0) ? 1 : 0) != 0)
            {
              m = 1;
              i14 = i3 - 1 + 1;
              while (i14 > 0)
              {
                localdoubleW1.val = (d19 * paramArrayOfDouble8[(m - 1 + paramInt14)]);
                if ((localdoubleW1.val >= 0.0D ? 0 : 1) != 0) {
                  j = 1;
                }
                m += 1;
                ???--;
              }
            }
            if (j != 0)
            {
              if ((i1 != 6 - 1 ? 0 : 1) != 0)
              {
                if ((d19 != 1.0D ? 0 : 1) != 0) {
                  d20 = d10 - 2.0D * d21 * d9 * paramInt1 - 2.0D * 2.0D * paramdoubleW3.val;
                } else {
                  d20 = d11 + 2.0D * d21 * d9 * paramInt1 + 2.0D * 2.0D * paramdoubleW3.val;
                }
              }
              else
              {
                d20 -= d19 * d22;
                d22 = 2.0D * d22;
              }
            }
            else {
              break;
            }
            i1 += 1;
            ???--;
          }
          paramintW3.val = 2;
          return;
          paramArrayOfDouble2[(i2 - 1 + paramInt5)] = d20;
          Dcopy.dcopy(i3, paramArrayOfDouble8, paramInt14, 1, paramArrayOfDouble1, n - 1 + paramInt4, 1);
          Dcopy.dcopy(i3 - 1, paramArrayOfDouble8, i3 + 1 - 1 + paramInt14, 1, paramArrayOfDouble2, n - 1 + paramInt5, 1);
          if ((i9 <= 1 ? 0 : 1) != 0)
          {
            m = 1;
            i13 = 4 - 1 + 1;
            while (i13 > 0)
            {
              arrayOfInt1[(m - 1)] = 1;
              m += 1;
              ???--;
            }
            Dlarnv.dlarnv(2, arrayOfInt1, 0, 2 * i3 - 1, paramArrayOfDouble8, 1 - 1 + paramInt14);
            m = 1;
            i13 = i3 - 1 - 1 + 1;
            while (i13 > 0)
            {
              paramArrayOfDouble1[(n + m - 1 - 1 + paramInt4)] *= (1.0D + d9 * 8.0D * paramArrayOfDouble8[(m - 1 + paramInt14)]);
              paramArrayOfDouble2[(n + m - 1 - 1 + paramInt5)] *= (1.0D + d9 * 8.0D * paramArrayOfDouble8[(i3 + m - 1 + paramInt14)]);
              m += 1;
              ???--;
            }
            paramArrayOfDouble1[(i2 - 1 + paramInt4)] *= (1.0D + d9 * 4.0D * paramArrayOfDouble8[(i3 - 1 + paramInt14)]);
          }
          if ((k ^ 0x1) != 0)
          {
            i7 = i10;
            i13 = i11 - i10 + 1;
            while (i13 > 0)
            {
              paramArrayOfDouble4[(i7 - 1 + paramInt8)] -= d20;
              paramArrayOfDouble5[(i7 - 1 + paramInt9)] += Math.abs(paramArrayOfDouble4[(i7 - 1 + paramInt8)]) * d9;
              i7 += 1;
              ???--;
            }
            m = n;
            i13 = i2 - 1 - n + 1;
            while (i13 > 0)
            {
              paramArrayOfDouble1[(m - 1 + paramInt4)] *= Math.pow(paramArrayOfDouble2[(m - 1 + paramInt5)], 2);
              m += 1;
              ???--;
            }
            Dlarrb.dlarrb(i3, paramArrayOfDouble1, n - 1 + paramInt4, paramArrayOfDouble8, n - 1 + paramInt14, i4, i5, paramDouble1, paramDouble2, i4 - 1, paramArrayOfDouble4, i10 - 1 + paramInt8, paramArrayOfDouble6, i10 - 1 + paramInt10, paramArrayOfDouble5, i10 - 1 + paramInt9, paramArrayOfDouble8, 2 * paramInt1 + 1 - 1 + paramInt14, paramArrayOfInt4, paramInt15, paramdoubleW3.val, d21, i3, localintW4);
            if ((localintW4.val == 0 ? 0 : 1) != 0)
            {
              paramintW3.val = -4;
              return;
            }
            paramArrayOfDouble6[(i11 - 1 + paramInt10)] = Math.max(0.0D, paramdoubleW2.val - d20 - (paramArrayOfDouble4[(i11 - 1 + paramInt8)] + paramArrayOfDouble5[(i11 - 1 + paramInt9)]));
            m = i4;
            i13 = i5 - i4 + 1;
            while (i13 > 0)
            {
              paramintW2.val += 1;
              paramArrayOfInt2[(paramintW2.val - 1 + paramInt11)] = i8;
              paramArrayOfInt3[(paramintW2.val - 1 + paramInt12)] = m;
              m += 1;
              ???--;
            }
          }
          else
          {
            d15 = Math.log(i3) * 4.0D * d9;
            i7 = n;
            m = 1;
            i13 = i3 - 1 - 1 + 1;
            while (i13 > 0)
            {
              paramArrayOfDouble8[(2 * m - 1 - 1 + paramInt14)] = Math.abs(paramArrayOfDouble1[(i7 - 1 + paramInt4)]);
              paramArrayOfDouble8[(2 * m - 1 + paramInt14)] = (paramArrayOfDouble2[(i7 - 1 + paramInt5)] * paramArrayOfDouble2[(i7 - 1 + paramInt5)] * paramArrayOfDouble8[(2 * m - 1 - 1 + paramInt14)]);
              i7 += 1;
              m += 1;
              ???--;
            }
            paramArrayOfDouble8[(2 * i3 - 1 - 1 + paramInt14)] = Math.abs(paramArrayOfDouble1[(i2 - 1 + paramInt4)]);
            paramArrayOfDouble8[(2 * i3 - 1 + paramInt14)] = 0.0D;
            Dlasq2.dlasq2(i3, paramArrayOfDouble8, paramInt14, localintW4);
            if ((localintW4.val == 0 ? 0 : 1) != 0)
            {
              paramintW3.val = -5;
              return;
            }
            m = 1;
            i13 = i3 - 1 + 1;
            while (i13 > 0)
            {
              if ((paramArrayOfDouble8[(m - 1 + paramInt14)] >= 0.0D ? 0 : 1) != 0)
              {
                paramintW3.val = -6;
                return;
              }
              m += 1;
              ???--;
            }
            if ((d19 <= 0.0D ? 0 : 1) != 0)
            {
              m = i4;
              i13 = i5 - i4 + 1;
              while (i13 > 0)
              {
                paramintW2.val += 1;
                paramArrayOfDouble4[(paramintW2.val - 1 + paramInt8)] = paramArrayOfDouble8[(i3 - m + 1 - 1 + paramInt14)];
                paramArrayOfInt2[(paramintW2.val - 1 + paramInt11)] = i8;
                paramArrayOfInt3[(paramintW2.val - 1 + paramInt12)] = m;
                m += 1;
                ???--;
              }
            }
            else
            {
              m = i4;
              i13 = i5 - i4 + 1;
              while (i13 > 0)
              {
                paramintW2.val += 1;
                paramArrayOfDouble4[(paramintW2.val - 1 + paramInt8)] = (-paramArrayOfDouble8[(m - 1 + paramInt14)]);
                paramArrayOfInt2[(paramintW2.val - 1 + paramInt11)] = i8;
                paramArrayOfInt3[(paramintW2.val - 1 + paramInt12)] = m;
                m += 1;
                ???--;
              }
            }
            m = paramintW2.val - i9 + 1;
            i13 = paramintW2.val - (paramintW2.val - i9 + 1) + 1;
            while (i13 > 0)
            {
              paramArrayOfDouble5[(m - 1 + paramInt9)] = (d15 * Math.abs(paramArrayOfDouble4[(m - 1 + paramInt8)]));
              m += 1;
              ???--;
            }
            m = paramintW2.val - i9 + 1;
            i13 = paramintW2.val - 1 - (paramintW2.val - i9 + 1) + 1;
            while (i13 > 0)
            {
              paramArrayOfDouble6[(m - 1 + paramInt10)] = Math.max(0.0D, paramArrayOfDouble4[(m + 1 - 1 + paramInt8)] - paramArrayOfDouble5[(m + 1 - 1 + paramInt9)] - (paramArrayOfDouble4[(m - 1 + paramInt8)] + paramArrayOfDouble5[(m - 1 + paramInt9)]));
              m += 1;
              ???--;
            }
            paramArrayOfDouble6[(paramintW2.val - 1 + paramInt10)] = Math.max(0.0D, paramdoubleW2.val - d20 - (paramArrayOfDouble4[(paramintW2.val - 1 + paramInt8)] + paramArrayOfDouble5[(paramintW2.val - 1 + paramInt9)]));
          }
          n = i2 + 1;
          i10 = i11 + 1;
        }
      }
      i8 += 1;
      ???--;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarre.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */