package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasq2
{
  public static void dlasq2(int paramInt1, double[] paramArrayOfDouble, int paramInt2, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    intW localintW1 = new intW(0);
    int k = 0;
    intW localintW2 = new intW(0);
    int m = 0;
    int n = 0;
    int i1 = 0;
    intW localintW3 = new intW(0);
    int i2 = 0;
    intW localintW4 = new intW(0);
    intW localintW5 = new intW(0);
    int i3 = 0;
    int i4 = 0;
    intW localintW6 = new intW(0);
    double d1 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    doubleW localdoubleW6 = new doubleW(0.0D);
    doubleW localdoubleW7 = new doubleW(0.0D);
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    doubleW localdoubleW8 = new doubleW(0.0D);
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    doubleW localdoubleW9 = new doubleW(0.0D);
    double d10 = 0.0D;
    doubleW localdoubleW10 = new doubleW(0.0D);
    double d11 = 0.0D;
    double d12 = 0.0D;
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    paramintW.val = 0;
    d5 = Dlamch.dlamch("Precision");
    d9 = Dlamch.dlamch("Safe minimum");
    d12 = d5 * 100.0D;
    d13 = Math.pow(d12, 2);
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
      Xerbla.xerbla("DLASQ2", 1);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((paramArrayOfDouble[(1 - 1 + paramInt2)] >= 0.0D ? 0 : 1) != 0)
      {
        paramintW.val = 65335;
        Xerbla.xerbla("DLASQ2", 2);
      }
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      if ((paramArrayOfDouble[(2 - 1 + paramInt2)] >= 0.0D ? 0 : 1) == 0) {}
      if (((paramArrayOfDouble[(3 - 1 + paramInt2)] >= 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
        Xerbla.xerbla("DLASQ2", 2);
        return;
      }
      if ((paramArrayOfDouble[(3 - 1 + paramInt2)] <= paramArrayOfDouble[(1 - 1 + paramInt2)] ? 0 : 1) != 0)
      {
        d1 = paramArrayOfDouble[(3 - 1 + paramInt2)];
        paramArrayOfDouble[(3 - 1 + paramInt2)] = paramArrayOfDouble[(1 - 1 + paramInt2)];
        paramArrayOfDouble[(1 - 1 + paramInt2)] = d1;
      }
      paramArrayOfDouble[(5 - 1 + paramInt2)] = (paramArrayOfDouble[(1 - 1 + paramInt2)] + paramArrayOfDouble[(2 - 1 + paramInt2)] + paramArrayOfDouble[(3 - 1 + paramInt2)]);
      if ((paramArrayOfDouble[(2 - 1 + paramInt2)] <= paramArrayOfDouble[(3 - 1 + paramInt2)] * d13 ? 0 : 1) != 0)
      {
        d10 = 0.5D * (paramArrayOfDouble[(1 - 1 + paramInt2)] - paramArrayOfDouble[(3 - 1 + paramInt2)] + paramArrayOfDouble[(2 - 1 + paramInt2)]);
        d8 = paramArrayOfDouble[(3 - 1 + paramInt2)] * (paramArrayOfDouble[(2 - 1 + paramInt2)] / d10);
        if ((d8 > d10 ? 0 : 1) != 0) {
          d8 = paramArrayOfDouble[(3 - 1 + paramInt2)] * (paramArrayOfDouble[(2 - 1 + paramInt2)] / (d10 * (1.0D + Math.sqrt(1.0D + d8 / d10))));
        } else {
          d8 = paramArrayOfDouble[(3 - 1 + paramInt2)] * (paramArrayOfDouble[(2 - 1 + paramInt2)] / (d10 + Math.sqrt(d10) * Math.sqrt(d10 + d8)));
        }
        d10 = paramArrayOfDouble[(1 - 1 + paramInt2)] + (d8 + paramArrayOfDouble[(2 - 1 + paramInt2)]);
        paramArrayOfDouble[(3 - 1 + paramInt2)] *= paramArrayOfDouble[(1 - 1 + paramInt2)] / d10;
        paramArrayOfDouble[(1 - 1 + paramInt2)] = d10;
      }
      paramArrayOfDouble[(2 - 1 + paramInt2)] = paramArrayOfDouble[(3 - 1 + paramInt2)];
      paramArrayOfDouble[(6 - 1 + paramInt2)] = (paramArrayOfDouble[(2 - 1 + paramInt2)] + paramArrayOfDouble[(1 - 1 + paramInt2)]);
      return;
    }
    paramArrayOfDouble[(2 * paramInt1 - 1 + paramInt2)] = 0.0D;
    d4 = paramArrayOfDouble[(2 - 1 + paramInt2)];
    localdoubleW8.val = 0.0D;
    d15 = 0.0D;
    d1 = 0.0D;
    d2 = 0.0D;
    i1 = 1;
    for (int i5 = (2 * (paramInt1 - 1) - 1 + 2) / 2; i5 > 0; i5--)
    {
      if ((paramArrayOfDouble[(i1 - 1 + paramInt2)] >= 0.0D ? 0 : 1) != 0)
      {
        paramintW.val = (-(200 + i1));
        Xerbla.xerbla("DLASQ2", 2);
        return;
      }
      if ((paramArrayOfDouble[(i1 + 1 - 1 + paramInt2)] >= 0.0D ? 0 : 1) != 0)
      {
        paramintW.val = (-(200 + i1 + 1));
        Xerbla.xerbla("DLASQ2", 2);
        return;
      }
      d1 += paramArrayOfDouble[(i1 - 1 + paramInt2)];
      d2 += paramArrayOfDouble[(i1 + 1 - 1 + paramInt2)];
      localdoubleW8.val = Math.max(localdoubleW8.val, paramArrayOfDouble[(i1 - 1 + paramInt2)]);
      d4 = Math.min(d4, paramArrayOfDouble[(i1 + 1 - 1 + paramInt2)]);
      d15 = Util.max(localdoubleW8.val, d15, paramArrayOfDouble[(i1 + 1 - 1 + paramInt2)]);
      i1 += 2;
    }
    if ((paramArrayOfDouble[(2 * paramInt1 - 1 - 1 + paramInt2)] >= 0.0D ? 0 : 1) != 0)
    {
      paramintW.val = (-(200 + 2 * paramInt1 - 1));
      Xerbla.xerbla("DLASQ2", 2);
      return;
    }
    d1 += paramArrayOfDouble[(2 * paramInt1 - 1 - 1 + paramInt2)];
    localdoubleW8.val = Math.max(localdoubleW8.val, paramArrayOfDouble[(2 * paramInt1 - 1 - 1 + paramInt2)]);
    d15 = Math.max(localdoubleW8.val, d15);
    if ((d2 != 0.0D ? 0 : 1) != 0)
    {
      i1 = 2;
      for (i5 = paramInt1 - 2 + 1; i5 > 0; i5--)
      {
        paramArrayOfDouble[(i1 - 1 + paramInt2)] = paramArrayOfDouble[(2 * i1 - 1 - 1 + paramInt2)];
        i1 += 1;
      }
      Dlasrt.dlasrt("D", paramInt1, paramArrayOfDouble, paramInt2, localintW1);
      paramArrayOfDouble[(2 * paramInt1 - 1 - 1 + paramInt2)] = d1;
      return;
    }
    d14 = d1 + d2;
    if ((d14 != 0.0D ? 0 : 1) != 0)
    {
      paramArrayOfDouble[(2 * paramInt1 - 1 - 1 + paramInt2)] = 0.0D;
      return;
    }
    if ((Ilaenv.ilaenv(10, "DLASQ2", "N", 1, 2, 3, 4) != 1 ? 0 : 1) != 0) {}
    bool = (Ilaenv.ilaenv(11, "DLASQ2", "N", 1, 2, 3, 4) != 1 ? 0 : 1) != 0;
    i1 = 2 * paramInt1;
    for (i5 = (2 - 2 * paramInt1 + -2) / -2; i5 > 0; i5--)
    {
      paramArrayOfDouble[(2 * i1 - 1 + paramInt2)] = 0.0D;
      paramArrayOfDouble[(2 * i1 - 1 - 1 + paramInt2)] = paramArrayOfDouble[(i1 - 1 + paramInt2)];
      paramArrayOfDouble[(2 * i1 - 2 - 1 + paramInt2)] = 0.0D;
      paramArrayOfDouble[(2 * i1 - 3 - 1 + paramInt2)] = paramArrayOfDouble[(i1 - 1 - 1 + paramInt2)];
      i1 += -2;
    }
    i = 1;
    localintW3.val = paramInt1;
    if ((1.5D * paramArrayOfDouble[(4 * i - 3 - 1 + paramInt2)] >= paramArrayOfDouble[(4 * localintW3.val - 3 - 1 + paramInt2)] ? 0 : 1) != 0)
    {
      k = 4 * (i + localintW3.val);
      j = 4 * i;
      for (i5 = (2 * (i + localintW3.val - 1) - 4 * i + 4) / 4; i5 > 0; i5--)
      {
        d11 = paramArrayOfDouble[(j - 3 - 1 + paramInt2)];
        paramArrayOfDouble[(j - 3 - 1 + paramInt2)] = paramArrayOfDouble[(k - j - 3 - 1 + paramInt2)];
        paramArrayOfDouble[(k - j - 3 - 1 + paramInt2)] = d11;
        d11 = paramArrayOfDouble[(j - 1 - 1 + paramInt2)];
        paramArrayOfDouble[(j - 1 - 1 + paramInt2)] = paramArrayOfDouble[(k - j - 5 - 1 + paramInt2)];
        paramArrayOfDouble[(k - j - 5 - 1 + paramInt2)] = d11;
        j += 4;
      }
    }
    i3 = 0;
    i1 = 1;
    int i6;
    for (i5 = 2 - 1 + 1; i5 > 0; i5--)
    {
      d1 = paramArrayOfDouble[(4 * localintW3.val + i3 - 3 - 1 + paramInt2)];
      j = 4 * (localintW3.val - 1) + i3;
      for (i6 = (4 * i + i3 - (4 * (localintW3.val - 1) + i3) + -4) / -4; i6 > 0; i6--)
      {
        if ((paramArrayOfDouble[(j - 1 - 1 + paramInt2)] > d13 * d1 ? 0 : 1) != 0)
        {
          paramArrayOfDouble[(j - 1 - 1 + paramInt2)] = 0.0D;
          d1 = paramArrayOfDouble[(j - 3 - 1 + paramInt2)];
        }
        else
        {
          d1 = paramArrayOfDouble[(j - 3 - 1 + paramInt2)] * (d1 / (d1 + paramArrayOfDouble[(j - 1 - 1 + paramInt2)]));
        }
        j += -4;
      }
      d4 = paramArrayOfDouble[(4 * i + i3 + 1 - 1 + paramInt2)];
      d1 = paramArrayOfDouble[(4 * i + i3 - 3 - 1 + paramInt2)];
      j = 4 * i + i3;
      for (i6 = (4 * (localintW3.val - 1) + i3 - (4 * i + i3) + 4) / 4; i6 > 0; i6--)
      {
        paramArrayOfDouble[(j - 2 * i3 - 2 - 1 + paramInt2)] = (d1 + paramArrayOfDouble[(j - 1 - 1 + paramInt2)]);
        if ((paramArrayOfDouble[(j - 1 - 1 + paramInt2)] > d13 * d1 ? 0 : 1) != 0)
        {
          paramArrayOfDouble[(j - 1 - 1 + paramInt2)] = 0.0D;
          paramArrayOfDouble[(j - 2 * i3 - 2 - 1 + paramInt2)] = d1;
          paramArrayOfDouble[(j - 2 * i3 - 1 + paramInt2)] = 0.0D;
          d1 = paramArrayOfDouble[(j + 1 - 1 + paramInt2)];
        }
        else
        {
          if ((d9 * paramArrayOfDouble[(j + 1 - 1 + paramInt2)] >= paramArrayOfDouble[(j - 2 * i3 - 2 - 1 + paramInt2)] ? 0 : 1) != 0) {}
          if (((d9 * paramArrayOfDouble[(j - 2 * i3 - 2 - 1 + paramInt2)] >= paramArrayOfDouble[(j + 1 - 1 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            d11 = paramArrayOfDouble[(j + 1 - 1 + paramInt2)] / paramArrayOfDouble[(j - 2 * i3 - 2 - 1 + paramInt2)];
            paramArrayOfDouble[(j - 2 * i3 - 1 + paramInt2)] = (paramArrayOfDouble[(j - 1 - 1 + paramInt2)] * d11);
            d1 *= d11;
          }
          else
          {
            paramArrayOfDouble[(j - 2 * i3 - 1 + paramInt2)] = (paramArrayOfDouble[(j + 1 - 1 + paramInt2)] * (paramArrayOfDouble[(j - 1 - 1 + paramInt2)] / paramArrayOfDouble[(j - 2 * i3 - 2 - 1 + paramInt2)]));
            d1 = paramArrayOfDouble[(j + 1 - 1 + paramInt2)] * (d1 / paramArrayOfDouble[(j - 2 * i3 - 2 - 1 + paramInt2)]);
          }
        }
        d4 = Math.min(d4, paramArrayOfDouble[(j - 2 * i3 - 1 + paramInt2)]);
        j += 4;
      }
      paramArrayOfDouble[(4 * localintW3.val - i3 - 2 - 1 + paramInt2)] = d1;
      localdoubleW8.val = paramArrayOfDouble[(4 * i - i3 - 2 - 1 + paramInt2)];
      j = 4 * i - i3 + 2;
      for (i6 = (4 * localintW3.val - i3 - 2 - (4 * i - i3 + 2) + 4) / 4; i6 > 0; i6--)
      {
        localdoubleW8.val = Math.max(localdoubleW8.val, paramArrayOfDouble[(j - 1 + paramInt2)]);
        j += 4;
      }
      i3 = 1 - i3;
      i1 += 1;
    }
    localintW6.val = 0;
    localdoubleW3.val = 0.0D;
    localdoubleW4.val = 0.0D;
    localdoubleW5.val = 0.0D;
    localdoubleW6.val = 0.0D;
    localdoubleW7.val = 0.0D;
    localdoubleW10.val = 0.0D;
    localintW2.val = 2;
    localintW5.val = 0;
    localintW4.val = (2 * (localintW3.val - i));
    m = 1;
    i5 = paramInt1 + 1 - 1 + 1;
    while ((localintW3.val >= 1 ? 0 : 1) == 0)
    {
      localdoubleW1.val = 0.0D;
      if ((localintW3.val != paramInt1 ? 0 : 1) != 0) {
        localdoubleW9.val = 0.0D;
      } else {
        localdoubleW9.val = (-paramArrayOfDouble[(4 * localintW3.val - 1 - 1 + paramInt2)]);
      }
      if ((localdoubleW9.val >= 0.0D ? 0 : 1) != 0)
      {
        paramintW.val = 1;
        return;
      }
      d3 = 0.0D;
      if ((localintW3.val <= i ? 0 : 1) != 0) {
        d4 = Math.abs(paramArrayOfDouble[(4 * localintW3.val - 5 - 1 + paramInt2)]);
      } else {
        d4 = 0.0D;
      }
      d7 = paramArrayOfDouble[(4 * localintW3.val - 3 - 1 + paramInt2)];
      localdoubleW8.val = d7;
      j = 4 * localintW3.val;
      i6 = (8 - 4 * localintW3.val + -4) / -4;
      while ((paramArrayOfDouble[(j - 5 - 1 + paramInt2)] > 0.0D ? 0 : 1) == 0)
      {
        if ((d7 < 4.0D * d3 ? 0 : 1) != 0)
        {
          d7 = Math.min(d7, paramArrayOfDouble[(j - 3 - 1 + paramInt2)]);
          d3 = Math.max(d3, paramArrayOfDouble[(j - 5 - 1 + paramInt2)]);
        }
        localdoubleW8.val = Math.max(localdoubleW8.val, paramArrayOfDouble[(j - 7 - 1 + paramInt2)] + paramArrayOfDouble[(j - 5 - 1 + paramInt2)]);
        d4 = Math.min(d4, paramArrayOfDouble[(j - 5 - 1 + paramInt2)]);
        j += -4;
        i6--;
        if (i6 <= 0) {
          j = 4;
        }
      }
      i = j / 4;
      paramArrayOfDouble[(4 * localintW3.val - 1 - 1 + paramInt2)] = d4;
      localdoubleW2.val = (-Math.max(0.0D, d7 - 2.0D * Math.sqrt(d7) * Math.sqrt(d3)));
      i3 = 0;
      i2 = 30 * (localintW3.val - i + 1);
      n = 1;
      i6 = i2 - 1 + 1;
      while ((i <= localintW3.val ? 0 : 1) == 0)
      {
        Dlazq3.dlazq3(i, localintW3, paramArrayOfDouble, paramInt2, i3, localdoubleW2, localdoubleW9, localdoubleW1, localdoubleW8, localintW5, localintW2, localintW4, bool, localintW6, localdoubleW3, localdoubleW4, localdoubleW5, localdoubleW6, localdoubleW7, localdoubleW10);
        i3 = 1 - i3;
        if ((i3 != 0 ? 0 : 1) != 0) {}
        if (((localintW3.val - i < 3 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          if ((paramArrayOfDouble[(4 * localintW3.val - 1 + paramInt2)] > d13 * localdoubleW8.val ? 0 : 1) == 0) {}
          if (((paramArrayOfDouble[(4 * localintW3.val - 1 - 1 + paramInt2)] > d13 * localdoubleW9.val ? 0 : 1) == 0 ? 0 : 1) != 0)
          {
            i4 = i - 1;
            localdoubleW8.val = paramArrayOfDouble[(4 * i - 3 - 1 + paramInt2)];
            d4 = paramArrayOfDouble[(4 * i - 1 - 1 + paramInt2)];
            d6 = paramArrayOfDouble[(4 * i - 1 + paramInt2)];
            j = 4 * i;
            for (int i7 = (4 * (localintW3.val - 3) - 4 * i + 4) / 4; i7 > 0; i7--)
            {
              if ((paramArrayOfDouble[(j - 1 + paramInt2)] > d13 * paramArrayOfDouble[(j - 3 - 1 + paramInt2)] ? 0 : 1) == 0) {}
              if (((paramArrayOfDouble[(j - 1 - 1 + paramInt2)] > d13 * localdoubleW9.val ? 0 : 1) == 0 ? 0 : 1) != 0)
              {
                paramArrayOfDouble[(j - 1 - 1 + paramInt2)] = (-localdoubleW9.val);
                i4 = j / 4;
                localdoubleW8.val = 0.0D;
                d4 = paramArrayOfDouble[(j + 3 - 1 + paramInt2)];
                d6 = paramArrayOfDouble[(j + 4 - 1 + paramInt2)];
              }
              else
              {
                localdoubleW8.val = Math.max(localdoubleW8.val, paramArrayOfDouble[(j + 1 - 1 + paramInt2)]);
                d4 = Math.min(d4, paramArrayOfDouble[(j - 1 - 1 + paramInt2)]);
                d6 = Math.min(d6, paramArrayOfDouble[(j - 1 + paramInt2)]);
              }
              j += 4;
            }
            paramArrayOfDouble[(4 * localintW3.val - 1 - 1 + paramInt2)] = d4;
            paramArrayOfDouble[(4 * localintW3.val - 1 + paramInt2)] = d6;
            i = i4 + 1;
          }
        }
        n += 1;
        i6--;
        if (i6 <= 0)
        {
          paramintW.val = 2;
          return;
        }
      }
      m += 1;
      i5--;
      if (i5 <= 0)
      {
        paramintW.val = 3;
        return;
      }
    }
    i1 = 2;
    for (i5 = paramInt1 - 2 + 1; i5 > 0; i5--)
    {
      paramArrayOfDouble[(i1 - 1 + paramInt2)] = paramArrayOfDouble[(4 * i1 - 3 - 1 + paramInt2)];
      i1 += 1;
    }
    Dlasrt.dlasrt("D", paramInt1, paramArrayOfDouble, paramInt2, localintW1);
    d2 = 0.0D;
    i1 = paramInt1;
    for (i5 = (1 - paramInt1 + -1) / -1; i5 > 0; i5--)
    {
      d2 += paramArrayOfDouble[(i1 - 1 + paramInt2)];
      i1 += -1;
    }
    paramArrayOfDouble[(2 * paramInt1 + 1 - 1 + paramInt2)] = d14;
    paramArrayOfDouble[(2 * paramInt1 + 2 - 1 + paramInt2)] = d2;
    paramArrayOfDouble[(2 * paramInt1 + 3 - 1 + paramInt2)] = localintW2.val;
    paramArrayOfDouble[(2 * paramInt1 + 4 - 1 + paramInt2)] = (localintW4.val / (int)Math.pow(paramInt1, 2));
    paramArrayOfDouble[(2 * paramInt1 + 5 - 1 + paramInt2)] = (100.0D * localintW5.val / localintW2.val);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasq2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */