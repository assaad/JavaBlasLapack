package org.netlib.arpack;

import org.netlib.lapack.Dlae2;
import org.netlib.lapack.Dlaev2;
import org.netlib.lapack.Dlamch;
import org.netlib.lapack.Dlanst;
import org.netlib.lapack.Dlapy2;
import org.netlib.lapack.Dlartg;
import org.netlib.lapack.Dlascl;
import org.netlib.lapack.Dlasr;
import org.netlib.lapack.Dlasrt;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dstqrb
{
  public static void dstqrb(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, double[] paramArrayOfDouble4, int paramInt5, intW paramintW)
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
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    paramintW.val = 0;
    j = 2;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((j != 2 ? 0 : 1) != 0) {
        paramArrayOfDouble3[(1 - 1 + paramInt4)] = 1.0D;
      }
      return;
    }
    d3 = Dlamch.dlamch("e");
    d4 = Math.pow(d3, 2);
    d9 = Dlamch.dlamch("s");
    d8 = 1.0D / d9;
    d10 = Math.sqrt(d8) / 3.0D;
    d11 = Math.sqrt(d9) / d4;
    int i16;
    if ((j != 2 ? 0 : 1) != 0)
    {
      n = 1;
      for (i16 = paramInt1 - 1 - 1 + 1; i16 > 0; i16--)
      {
        paramArrayOfDouble3[(n - 1 + paramInt4)] = 0.0D;
        n += 1;
      }
      paramArrayOfDouble3[(paramInt1 - 1 + paramInt4)] = 1.0D;
    }
    i15 = paramInt1 * 30;
    i1 = 0;
    i4 = 1;
    i14 = paramInt1 - 1;
    while ((i4 <= paramInt1 ? 0 : 1) == 0)
    {
      if ((i4 <= 1 ? 0 : 1) != 0) {
        paramArrayOfDouble2[(i4 - 1 - 1 + paramInt3)] = 0.0D;
      }
      if ((i4 > i14 ? 0 : 1) != 0)
      {
        i11 = i4;
        for (i16 = i14 - i4 + 1; i16 > 0; i16--)
        {
          d12 = Math.abs(paramArrayOfDouble2[(i11 - 1 + paramInt3)]);
          if ((d12 != 0.0D ? 0 : 1) != 0) {
            break;
          }
          if ((d12 > Math.sqrt(Math.abs(paramArrayOfDouble1[(i11 - 1 + paramInt2)])) * Math.sqrt(Math.abs(paramArrayOfDouble1[(i11 + 1 - 1 + paramInt2)])) * d3 ? 0 : 1) != 0)
          {
            paramArrayOfDouble2[(i11 - 1 + paramInt3)] = 0.0D;
            break;
          }
          i11 += 1;
        }
      }
      i11 = paramInt1;
      i3 = i4;
      i10 = i3;
      i5 = i11;
      i8 = i5;
      i4 = i11 + 1;
      if ((i5 != i3 ? 0 : 1) == 0)
      {
        d1 = Dlanst.dlanst("i", i5 - i3 + 1, paramArrayOfDouble1, i3 - 1 + paramInt2, paramArrayOfDouble2, i3 - 1 + paramInt3);
        m = 0;
        if ((d1 != 0.0D ? 0 : 1) == 0)
        {
          if ((d1 <= d10 ? 0 : 1) != 0)
          {
            m = 1;
            Dlascl.dlascl("g", 0, 0, d1, d10, i5 - i3 + 1, 1, paramArrayOfDouble1, i3 - 1 + paramInt2, paramInt1, paramintW);
            Dlascl.dlascl("g", 0, 0, d1, d10, i5 - i3, 1, paramArrayOfDouble2, i3 - 1 + paramInt3, paramInt1, paramintW);
          }
          else if ((d1 >= d11 ? 0 : 1) != 0)
          {
            m = 2;
            Dlascl.dlascl("g", 0, 0, d1, d11, i5 - i3 + 1, 1, paramArrayOfDouble1, i3 - 1 + paramInt2, paramInt1, paramintW);
            Dlascl.dlascl("g", 0, 0, d1, d11, i5 - i3, 1, paramArrayOfDouble2, i3 - 1 + paramInt3, paramInt1, paramintW);
          }
          if ((Math.abs(paramArrayOfDouble1[(i5 - 1 + paramInt2)]) >= Math.abs(paramArrayOfDouble1[(i3 - 1 + paramInt2)]) ? 0 : 1) != 0)
          {
            i5 = i10;
            i3 = i8;
          }
          if ((i5 <= i3 ? 0 : 1) != 0)
          {
            do
            {
              for (;;)
              {
                if ((i3 == i5 ? 0 : 1) != 0)
                {
                  i6 = i5 - 1;
                  i11 = i3;
                  for (i16 = i6 - i3 + 1; i16 > 0; i16--)
                  {
                    d12 = Math.pow(Math.abs(paramArrayOfDouble2[(i11 - 1 + paramInt3)]), 2);
                    if ((d12 > d4 * Math.abs(paramArrayOfDouble1[(i11 - 1 + paramInt2)]) * Math.abs(paramArrayOfDouble1[(i11 + 1 - 1 + paramInt2)]) + d9 ? 0 : 1) != 0) {
                      break;
                    }
                    i11 += 1;
                  }
                }
                i11 = i5;
                if ((i11 >= i5 ? 0 : 1) != 0) {
                  paramArrayOfDouble2[(i11 - 1 + paramInt3)] = 0.0D;
                }
                d7 = paramArrayOfDouble1[(i3 - 1 + paramInt2)];
                if ((i11 != i3 ? 0 : 1) != 0) {
                  break;
                }
                if ((i11 != i3 + 1 ? 0 : 1) != 0)
                {
                  if ((j <= 0 ? 0 : 1) != 0)
                  {
                    Dlaev2.dlaev2(paramArrayOfDouble1[(i3 - 1 + paramInt2)], paramArrayOfDouble2[(i3 - 1 + paramInt3)], paramArrayOfDouble1[(i3 + 1 - 1 + paramInt2)], localdoubleW3, localdoubleW4, localdoubleW1, localdoubleW5);
                    paramArrayOfDouble4[(i3 - 1 + paramInt5)] = localdoubleW1.val;
                    paramArrayOfDouble4[(paramInt1 - 1 + i3 - 1 + paramInt5)] = localdoubleW5.val;
                    d12 = paramArrayOfDouble3[(i3 + 1 - 1 + paramInt4)];
                    paramArrayOfDouble3[(i3 + 1 - 1 + paramInt4)] = (localdoubleW1.val * d12 - localdoubleW5.val * paramArrayOfDouble3[(i3 - 1 + paramInt4)]);
                    paramArrayOfDouble3[(i3 - 1 + paramInt4)] = (localdoubleW5.val * d12 + localdoubleW1.val * paramArrayOfDouble3[(i3 - 1 + paramInt4)]);
                  }
                  else
                  {
                    Dlae2.dlae2(paramArrayOfDouble1[(i3 - 1 + paramInt2)], paramArrayOfDouble2[(i3 - 1 + paramInt3)], paramArrayOfDouble1[(i3 + 1 - 1 + paramInt2)], localdoubleW3, localdoubleW4);
                  }
                  paramArrayOfDouble1[(i3 - 1 + paramInt2)] = localdoubleW3.val;
                  paramArrayOfDouble1[(i3 + 1 - 1 + paramInt2)] = localdoubleW4.val;
                  paramArrayOfDouble2[(i3 - 1 + paramInt3)] = 0.0D;
                  i3 += 2;
                  if ((i3 > i5 ? 0 : 1) == 0) {
                    break label2767;
                  }
                }
                else
                {
                  if ((i1 != i15 ? 0 : 1) != 0) {
                    break label2767;
                  }
                  i1 += 1;
                  d6 = (paramArrayOfDouble1[(i3 + 1 - 1 + paramInt2)] - d7) / (2.0D * paramArrayOfDouble2[(i3 - 1 + paramInt3)]);
                  localdoubleW2.val = Dlapy2.dlapy2(d6, 1.0D);
                  d6 = paramArrayOfDouble1[(i11 - 1 + paramInt2)] - d7 + paramArrayOfDouble2[(i3 - 1 + paramInt3)] / (d6 + Util.dsign(localdoubleW2.val, d6));
                  localdoubleW5.val = 1.0D;
                  localdoubleW1.val = 1.0D;
                  d7 = 0.0D;
                  i13 = i11 - 1;
                  i = i13;
                  for (i16 = (i3 - i13 + -1) / -1; i16 > 0; i16--)
                  {
                    d5 = localdoubleW5.val * paramArrayOfDouble2[(i - 1 + paramInt3)];
                    d2 = localdoubleW1.val * paramArrayOfDouble2[(i - 1 + paramInt3)];
                    Dlartg.dlartg(d6, d5, localdoubleW1, localdoubleW5, localdoubleW2);
                    if ((i == i11 - 1 ? 0 : 1) != 0) {
                      paramArrayOfDouble2[(i + 1 - 1 + paramInt3)] = localdoubleW2.val;
                    }
                    d6 = paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] - d7;
                    localdoubleW2.val = ((paramArrayOfDouble1[(i - 1 + paramInt2)] - d6) * localdoubleW5.val + 2.0D * localdoubleW1.val * d2);
                    d7 = localdoubleW5.val * localdoubleW2.val;
                    paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] = (d6 + d7);
                    d6 = localdoubleW1.val * localdoubleW2.val - d2;
                    if ((j <= 0 ? 0 : 1) != 0)
                    {
                      paramArrayOfDouble4[(i - 1 + paramInt5)] = localdoubleW1.val;
                      paramArrayOfDouble4[(paramInt1 - 1 + i - 1 + paramInt5)] = (-localdoubleW5.val);
                    }
                    i += -1;
                  }
                  if ((j <= 0 ? 0 : 1) != 0)
                  {
                    i12 = i11 - i3 + 1;
                    Dlasr.dlasr("r", "v", "b", 1, i12, paramArrayOfDouble4, i3 - 1 + paramInt5, paramArrayOfDouble4, paramInt1 - 1 + i3 - 1 + paramInt5, paramArrayOfDouble3, i3 - 1 + paramInt4, 1);
                  }
                  paramArrayOfDouble1[(i3 - 1 + paramInt2)] -= d7;
                  paramArrayOfDouble2[(i3 - 1 + paramInt3)] = d6;
                }
              }
              paramArrayOfDouble1[(i3 - 1 + paramInt2)] = d7;
              i3 += 1;
            } while ((i3 > i5 ? 0 : 1) != 0);
            break label2767;
          }
          else
          {
            for (;;)
            {
              if ((i3 == i5 ? 0 : 1) != 0)
              {
                i7 = i5 + 1;
                i11 = i3;
                for (i16 = (i7 - i3 + -1) / -1; i16 > 0; i16--)
                {
                  d12 = Math.pow(Math.abs(paramArrayOfDouble2[(i11 - 1 - 1 + paramInt3)]), 2);
                  if ((d12 > d4 * Math.abs(paramArrayOfDouble1[(i11 - 1 + paramInt2)]) * Math.abs(paramArrayOfDouble1[(i11 - 1 - 1 + paramInt2)]) + d9 ? 0 : 1) != 0) {
                    break;
                  }
                  i11 += -1;
                }
              }
              i11 = i5;
              if ((i11 <= i5 ? 0 : 1) != 0) {
                paramArrayOfDouble2[(i11 - 1 - 1 + paramInt3)] = 0.0D;
              }
              d7 = paramArrayOfDouble1[(i3 - 1 + paramInt2)];
              if ((i11 != i3 ? 0 : 1) == 0)
              {
                if ((i11 != i3 - 1 ? 0 : 1) != 0)
                {
                  if ((j <= 0 ? 0 : 1) != 0)
                  {
                    Dlaev2.dlaev2(paramArrayOfDouble1[(i3 - 1 - 1 + paramInt2)], paramArrayOfDouble2[(i3 - 1 - 1 + paramInt3)], paramArrayOfDouble1[(i3 - 1 + paramInt2)], localdoubleW3, localdoubleW4, localdoubleW1, localdoubleW5);
                    d12 = paramArrayOfDouble3[(i3 - 1 + paramInt4)];
                    paramArrayOfDouble3[(i3 - 1 + paramInt4)] = (localdoubleW1.val * d12 - localdoubleW5.val * paramArrayOfDouble3[(i3 - 1 - 1 + paramInt4)]);
                    paramArrayOfDouble3[(i3 - 1 - 1 + paramInt4)] = (localdoubleW5.val * d12 + localdoubleW1.val * paramArrayOfDouble3[(i3 - 1 - 1 + paramInt4)]);
                  }
                  else
                  {
                    Dlae2.dlae2(paramArrayOfDouble1[(i3 - 1 - 1 + paramInt2)], paramArrayOfDouble2[(i3 - 1 - 1 + paramInt3)], paramArrayOfDouble1[(i3 - 1 + paramInt2)], localdoubleW3, localdoubleW4);
                  }
                  paramArrayOfDouble1[(i3 - 1 - 1 + paramInt2)] = localdoubleW3.val;
                  paramArrayOfDouble1[(i3 - 1 + paramInt2)] = localdoubleW4.val;
                  paramArrayOfDouble2[(i3 - 1 - 1 + paramInt3)] = 0.0D;
                  i3 -= 2;
                  if ((i3 < i5 ? 0 : 1) == 0) {
                    break;
                  }
                }
                else if ((i1 != i15 ? 0 : 1) == 0)
                {
                  i1 += 1;
                  d6 = (paramArrayOfDouble1[(i3 - 1 - 1 + paramInt2)] - d7) / (2.0D * paramArrayOfDouble2[(i3 - 1 - 1 + paramInt3)]);
                  localdoubleW2.val = Dlapy2.dlapy2(d6, 1.0D);
                  d6 = paramArrayOfDouble1[(i11 - 1 + paramInt2)] - d7 + paramArrayOfDouble2[(i3 - 1 - 1 + paramInt3)] / (d6 + Util.dsign(localdoubleW2.val, d6));
                  localdoubleW5.val = 1.0D;
                  localdoubleW1.val = 1.0D;
                  d7 = 0.0D;
                  i9 = i3 - 1;
                  i = i11;
                  for (i16 = i9 - i11 + 1; i16 > 0; i16--)
                  {
                    d5 = localdoubleW5.val * paramArrayOfDouble2[(i - 1 + paramInt3)];
                    d2 = localdoubleW1.val * paramArrayOfDouble2[(i - 1 + paramInt3)];
                    Dlartg.dlartg(d6, d5, localdoubleW1, localdoubleW5, localdoubleW2);
                    if ((i == i11 ? 0 : 1) != 0) {
                      paramArrayOfDouble2[(i - 1 - 1 + paramInt3)] = localdoubleW2.val;
                    }
                    d6 = paramArrayOfDouble1[(i - 1 + paramInt2)] - d7;
                    localdoubleW2.val = ((paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] - d6) * localdoubleW5.val + 2.0D * localdoubleW1.val * d2);
                    d7 = localdoubleW5.val * localdoubleW2.val;
                    paramArrayOfDouble1[(i - 1 + paramInt2)] = (d6 + d7);
                    d6 = localdoubleW1.val * localdoubleW2.val - d2;
                    if ((j <= 0 ? 0 : 1) != 0)
                    {
                      paramArrayOfDouble4[(i - 1 + paramInt5)] = localdoubleW1.val;
                      paramArrayOfDouble4[(paramInt1 - 1 + i - 1 + paramInt5)] = localdoubleW5.val;
                    }
                    i += 1;
                  }
                  if ((j <= 0 ? 0 : 1) != 0)
                  {
                    i12 = i3 - i11 + 1;
                    Dlasr.dlasr("r", "v", "f", 1, i12, paramArrayOfDouble4, i11 - 1 + paramInt5, paramArrayOfDouble4, paramInt1 - 1 + i11 - 1 + paramInt5, paramArrayOfDouble3, i11 - 1 + paramInt4, 1);
                  }
                  paramArrayOfDouble1[(i3 - 1 + paramInt2)] -= d7;
                  paramArrayOfDouble2[(i9 - 1 + paramInt3)] = d6;
                }
              }
              else
              {
                paramArrayOfDouble1[(i3 - 1 + paramInt2)] = d7;
                i3 -= 1;
                if ((i3 < i5 ? 0 : 1) == 0) {
                  break;
                }
              }
            }
          }
          label2767:
          if ((m != 1 ? 0 : 1) != 0)
          {
            Dlascl.dlascl("g", 0, 0, d10, d1, i8 - i10 + 1, 1, paramArrayOfDouble1, i10 - 1 + paramInt2, paramInt1, paramintW);
            Dlascl.dlascl("g", 0, 0, d10, d1, i8 - i10, 1, paramArrayOfDouble2, i10 - 1 + paramInt3, paramInt1, paramintW);
          }
          else if ((m != 2 ? 0 : 1) != 0)
          {
            Dlascl.dlascl("g", 0, 0, d11, d1, i8 - i10 + 1, 1, paramArrayOfDouble1, i10 - 1 + paramInt2, paramInt1, paramintW);
            Dlascl.dlascl("g", 0, 0, d11, d1, i8 - i10, 1, paramArrayOfDouble2, i10 - 1 + paramInt3, paramInt1, paramintW);
          }
          if ((i1 >= i15 ? 0 : 1) == 0)
          {
            i = 1;
            for (i16 = paramInt1 - 1 - 1 + 1; i16 > 0; i16--)
            {
              if ((paramArrayOfDouble2[(i - 1 + paramInt3)] == 0.0D ? 0 : 1) != 0) {
                paramintW.val += 1;
              }
              i += 1;
            }
            return;
          }
        }
      }
    }
    if ((j != 0 ? 0 : 1) != 0)
    {
      Dlasrt.dlasrt("i", paramInt1, paramArrayOfDouble1, paramInt2, paramintW);
    }
    else
    {
      k = 2;
      for (i16 = paramInt1 - 2 + 1; i16 > 0; i16--)
      {
        i = k - 1;
        i2 = i;
        d7 = paramArrayOfDouble1[(i - 1 + paramInt2)];
        n = k;
        for (int i17 = paramInt1 - k + 1; i17 > 0; i17--)
        {
          if ((paramArrayOfDouble1[(n - 1 + paramInt2)] >= d7 ? 0 : 1) != 0)
          {
            i2 = n;
            d7 = paramArrayOfDouble1[(n - 1 + paramInt2)];
          }
          n += 1;
        }
        if ((i2 == i ? 0 : 1) != 0)
        {
          paramArrayOfDouble1[(i2 - 1 + paramInt2)] = paramArrayOfDouble1[(i - 1 + paramInt2)];
          paramArrayOfDouble1[(i - 1 + paramInt2)] = d7;
          d7 = paramArrayOfDouble3[(i2 - 1 + paramInt4)];
          paramArrayOfDouble3[(i2 - 1 + paramInt4)] = paramArrayOfDouble3[(i - 1 + paramInt4)];
          paramArrayOfDouble3[(i - 1 + paramInt4)] = d7;
        }
        k += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/arpack/Dstqrb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */