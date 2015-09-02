package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dstebz
{
  public static void dstebz(String paramString1, String paramString2, int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3, double paramDouble3, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, intW paramintW1, intW paramintW2, double[] paramArrayOfDouble3, int paramInt6, int[] paramArrayOfInt1, int paramInt7, int[] paramArrayOfInt2, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int[] paramArrayOfInt3, int paramInt10, intW paramintW3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    intW localintW3 = new intW(0);
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
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
    int[] arrayOfInt = new int[1];
    paramintW3.val = 0;
    if (Lsame.lsame(paramString1, "A")) {
      i7 = 1;
    } else if (Lsame.lsame(paramString1, "V")) {
      i7 = 2;
    } else if (Lsame.lsame(paramString1, "I")) {
      i7 = 3;
    } else {
      i7 = 0;
    }
    if (Lsame.lsame(paramString2, "B")) {
      i6 = 2;
    } else if (Lsame.lsame(paramString2, "E")) {
      i6 = 1;
    } else {
      i6 = 0;
    }
    if ((i7 > 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -1;
    }
    else if ((i6 > 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW3.val = -3;
    }
    else if ((i7 != 2 ? 0 : 1) != 0)
    {
      if ((paramDouble1 < paramDouble2 ? 0 : 1) != 0) {
        paramintW3.val = -5;
      }
    }
    else
    {
      if ((i7 != 3 ? 0 : 1) != 0) {
        if ((paramInt2 >= 1 ? 0 : 1) != 0) {}
      }
      if ((((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW3.val = -6;
      }
      else
      {
        if ((i7 != 3 ? 0 : 1) != 0) {
          if ((paramInt3 >= Math.min(paramInt1, paramInt2) ? 0 : 1) != 0) {}
        }
        if ((((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW3.val = -7;
        }
      }
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSTEBZ", -paramintW3.val);
      return;
    }
    paramintW3.val = 0;
    i = 0;
    j = 0;
    paramintW1.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((i7 != 3 ? 0 : 1) != 0) {}
    if (((paramInt2 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
    if (((paramInt3 != paramInt1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      i7 = 1;
    }
    d7 = Dlamch.dlamch("S");
    d11 = Dlamch.dlamch("P");
    d6 = d11 * 2.0D;
    i16 = Ilaenv.ilaenv(1, "DSTEBZ", " ", paramInt1, -1, -1, -1);
    if ((i16 > 1 ? 0 : 1) != 0) {
      i16 = 0;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramintW2.val = 1;
      paramArrayOfInt2[(1 - 1 + paramInt8)] = 1;
      if ((i7 != 2 ? 0 : 1) != 0) {
        if ((paramDouble1 < paramArrayOfDouble1[(1 - 1 + paramInt4)] ? 0 : 1) != 0) {}
      }
      if ((((paramDouble2 >= paramArrayOfDouble1[(1 - 1 + paramInt4)] ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW1.val = 0;
      }
      else
      {
        paramArrayOfDouble3[(1 - 1 + paramInt6)] = paramArrayOfDouble1[(1 - 1 + paramInt4)];
        paramArrayOfInt1[(1 - 1 + paramInt7)] = 1;
        paramintW1.val = 1;
      }
      return;
    }
    paramintW2.val = 1;
    paramArrayOfDouble4[(paramInt1 - 1 + paramInt9)] = 0.0D;
    d5 = 1.0D;
    i12 = 2;
    for (int i19 = paramInt1 - 2 + 1; i19 > 0; i19--)
    {
      d8 = Math.pow(paramArrayOfDouble2[(i12 - 1 - 1 + paramInt5)], 2);
      if ((Math.abs(paramArrayOfDouble1[(i12 - 1 + paramInt4)] * paramArrayOfDouble1[(i12 - 1 - 1 + paramInt4)]) * Math.pow(d11, 2) + d7 <= d8 ? 0 : 1) != 0)
      {
        paramArrayOfInt2[(paramintW2.val - 1 + paramInt8)] = (i12 - 1);
        paramintW2.val += 1;
        paramArrayOfDouble4[(i12 - 1 - 1 + paramInt9)] = 0.0D;
      }
      else
      {
        paramArrayOfDouble4[(i12 - 1 - 1 + paramInt9)] = d8;
        d5 = Math.max(d5, d8);
      }
      i12 += 1;
    }
    paramArrayOfInt2[(paramintW2.val - 1 + paramInt8)] = paramInt1;
    d5 *= d7;
    if ((i7 != 3 ? 0 : 1) != 0)
    {
      d4 = paramArrayOfDouble1[(1 - 1 + paramInt4)];
      d3 = paramArrayOfDouble1[(1 - 1 + paramInt4)];
      d8 = 0.0D;
      i12 = 1;
      for (i19 = paramInt1 - 1 - 1 + 1; i19 > 0; i19--)
      {
        d9 = Math.sqrt(paramArrayOfDouble4[(i12 - 1 + paramInt9)]);
        d4 = Math.max(d4, paramArrayOfDouble1[(i12 - 1 + paramInt4)] + d8 + d9);
        d3 = Math.min(d3, paramArrayOfDouble1[(i12 - 1 + paramInt4)] - d8 - d9);
        d8 = d9;
        i12 += 1;
      }
      d4 = Math.max(d4, paramArrayOfDouble1[(paramInt1 - 1 + paramInt4)] + d8);
      d3 = Math.min(d3, paramArrayOfDouble1[(paramInt1 - 1 + paramInt4)] - d8);
      d10 = Math.max(Math.abs(d3), Math.abs(d4));
      d3 = d3 - 2.1D * d10 * d11 * paramInt1 - 2.1D * 2.0D * d5;
      d4 = d4 + 2.1D * d10 * d11 * paramInt1 + 2.1D * d5;
      i8 = (int)((Math.log(d10 + d5) - Math.log(d5)) / Math.log(2.0D)) + 2;
      if ((paramDouble3 > 0.0D ? 0 : 1) != 0) {
        d1 = d11 * d10;
      } else {
        d1 = paramDouble3;
      }
      paramArrayOfDouble4[(paramInt1 + 1 - 1 + paramInt9)] = d3;
      paramArrayOfDouble4[(paramInt1 + 2 - 1 + paramInt9)] = d3;
      paramArrayOfDouble4[(paramInt1 + 3 - 1 + paramInt9)] = d4;
      paramArrayOfDouble4[(paramInt1 + 4 - 1 + paramInt9)] = d4;
      paramArrayOfDouble4[(paramInt1 + 5 - 1 + paramInt9)] = d3;
      paramArrayOfDouble4[(paramInt1 + 6 - 1 + paramInt9)] = d4;
      paramArrayOfInt3[(1 - 1 + paramInt10)] = -1;
      paramArrayOfInt3[(2 - 1 + paramInt10)] = -1;
      paramArrayOfInt3[(3 - 1 + paramInt10)] = (paramInt1 + 1);
      paramArrayOfInt3[(4 - 1 + paramInt10)] = (paramInt1 + 1);
      paramArrayOfInt3[(5 - 1 + paramInt10)] = (paramInt2 - 1);
      paramArrayOfInt3[(6 - 1 + paramInt10)] = paramInt3;
      Dlaebz.dlaebz(3, i8, paramInt1, 2, 2, i16, d1, d6, d5, paramArrayOfDouble1, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble4, paramInt9, paramArrayOfInt3, 5 - 1 + paramInt10, paramArrayOfDouble4, paramInt1 + 1 - 1 + paramInt9, paramArrayOfDouble4, paramInt1 + 5 - 1 + paramInt9, localintW3, paramArrayOfInt3, paramInt10, paramArrayOfDouble3, paramInt6, paramArrayOfInt1, paramInt7, localintW1);
      if ((paramArrayOfInt3[(6 - 1 + paramInt10)] != paramInt3 ? 0 : 1) != 0)
      {
        d13 = paramArrayOfDouble4[(paramInt1 + 1 - 1 + paramInt9)];
        d14 = paramArrayOfDouble4[(paramInt1 + 3 - 1 + paramInt9)];
        i17 = paramArrayOfInt3[(1 - 1 + paramInt10)];
        d15 = paramArrayOfDouble4[(paramInt1 + 4 - 1 + paramInt9)];
        d16 = paramArrayOfDouble4[(paramInt1 + 2 - 1 + paramInt9)];
        i18 = paramArrayOfInt3[(4 - 1 + paramInt10)];
      }
      else
      {
        d13 = paramArrayOfDouble4[(paramInt1 + 2 - 1 + paramInt9)];
        d14 = paramArrayOfDouble4[(paramInt1 + 4 - 1 + paramInt9)];
        i17 = paramArrayOfInt3[(2 - 1 + paramInt10)];
        d15 = paramArrayOfDouble4[(paramInt1 + 3 - 1 + paramInt9)];
        d16 = paramArrayOfDouble4[(paramInt1 + 1 - 1 + paramInt9)];
        i18 = paramArrayOfInt3[(3 - 1 + paramInt10)];
      }
      if ((i17 >= 0 ? 0 : 1) == 0) {}
      if (((i17 < paramInt1 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((i18 >= 1 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((i18 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW3.val = 4;
        return;
      }
    }
    else
    {
      d10 = Math.max(Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt4)]) + Math.abs(paramArrayOfDouble2[(1 - 1 + paramInt5)]), Math.abs(paramArrayOfDouble1[(paramInt1 - 1 + paramInt4)]) + Math.abs(paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt5)]));
      i12 = 2;
      for (i19 = paramInt1 - 1 - 2 + 1; i19 > 0; i19--)
      {
        d10 = Math.max(d10, Math.abs(paramArrayOfDouble1[(i12 - 1 + paramInt4)]) + Math.abs(paramArrayOfDouble2[(i12 - 1 - 1 + paramInt5)]) + Math.abs(paramArrayOfDouble2[(i12 - 1 + paramInt5)]));
        i12 += 1;
      }
      if ((paramDouble3 > 0.0D ? 0 : 1) != 0) {
        d1 = d11 * d10;
      } else {
        d1 = paramDouble3;
      }
      if ((i7 != 2 ? 0 : 1) != 0)
      {
        d13 = paramDouble1;
        d15 = paramDouble2;
      }
      else
      {
        d13 = 0.0D;
        d15 = 0.0D;
      }
    }
    paramintW1.val = 0;
    i3 = 0;
    paramintW3.val = 0;
    i17 = 0;
    i18 = 0;
    i13 = 1;
    int i20;
    for (i19 = paramintW2.val - 1 + 1; i19 > 0; i19--)
    {
      i5 = i3;
      m = i5 + 1;
      i3 = paramArrayOfInt2[(i13 - 1 + paramInt8)];
      i4 = i3 - i5;
      if ((i4 != 1 ? 0 : 1) != 0)
      {
        if ((i7 != 1 ? 0 : 1) == 0) {}
        if (((d13 < paramArrayOfDouble1[(m - 1 + paramInt4)] - d5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          i17 += 1;
        }
        if ((i7 != 1 ? 0 : 1) == 0) {}
        if (((d15 < paramArrayOfDouble1[(m - 1 + paramInt4)] - d5 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          i18 += 1;
        }
        if ((i7 != 1 ? 0 : 1) == 0) {
          if ((d13 >= paramArrayOfDouble1[(m - 1 + paramInt4)] - d5 ? 0 : 1) == 0) {}
        }
        if ((((d15 < paramArrayOfDouble1[(m - 1 + paramInt4)] - d5 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW1.val += 1;
          paramArrayOfDouble3[(paramintW1.val - 1 + paramInt6)] = paramArrayOfDouble1[(m - 1 + paramInt4)];
          paramArrayOfInt1[(paramintW1.val - 1 + paramInt7)] = i13;
        }
      }
      else
      {
        d4 = paramArrayOfDouble1[(m - 1 + paramInt4)];
        d3 = paramArrayOfDouble1[(m - 1 + paramInt4)];
        d8 = 0.0D;
        i12 = m;
        for (i20 = i3 - 1 - m + 1; i20 > 0; i20--)
        {
          d9 = Math.abs(paramArrayOfDouble2[(i12 - 1 + paramInt5)]);
          d4 = Math.max(d4, paramArrayOfDouble1[(i12 - 1 + paramInt4)] + d8 + d9);
          d3 = Math.min(d3, paramArrayOfDouble1[(i12 - 1 + paramInt4)] - d8 - d9);
          d8 = d9;
          i12 += 1;
        }
        d4 = Math.max(d4, paramArrayOfDouble1[(i3 - 1 + paramInt4)] + d8);
        d3 = Math.min(d3, paramArrayOfDouble1[(i3 - 1 + paramInt4)] - d8);
        d2 = Math.max(Math.abs(d3), Math.abs(d4));
        d3 = d3 - 2.1D * d2 * d11 * i4 - 2.1D * d5;
        d4 = d4 + 2.1D * d2 * d11 * i4 + 2.1D * d5;
        if ((paramDouble3 > 0.0D ? 0 : 1) != 0) {
          d1 = d11 * Math.max(Math.abs(d3), Math.abs(d4));
        } else {
          d1 = paramDouble3;
        }
        if ((i7 <= 1 ? 0 : 1) != 0)
        {
          if ((d4 >= d13 ? 0 : 1) != 0)
          {
            i17 += i4;
            i18 += i4;
          }
          else
          {
            d3 = Math.max(d3, d13);
            d4 = Math.min(d4, d15);
            if ((d3 < d4 ? 0 : 1) != 0) {}
          }
        }
        else
        {
          paramArrayOfDouble4[(paramInt1 + 1 - 1 + paramInt9)] = d3;
          paramArrayOfDouble4[(paramInt1 + i4 + 1 - 1 + paramInt9)] = d4;
          Dlaebz.dlaebz(1, 0, i4, i4, 1, i16, d1, d6, d5, paramArrayOfDouble1, m - 1 + paramInt4, paramArrayOfDouble2, m - 1 + paramInt5, paramArrayOfDouble4, m - 1 + paramInt9, arrayOfInt, 0, paramArrayOfDouble4, paramInt1 + 1 - 1 + paramInt9, paramArrayOfDouble4, paramInt1 + 2 * i4 + 1 - 1 + paramInt9, localintW2, paramArrayOfInt3, paramInt10, paramArrayOfDouble3, paramintW1.val + 1 - 1 + paramInt6, paramArrayOfInt1, paramintW1.val + 1 - 1 + paramInt7, localintW1);
          i17 += paramArrayOfInt3[(1 - 1 + paramInt10)];
          i18 += paramArrayOfInt3[(i4 + 1 - 1 + paramInt10)];
          i11 = paramintW1.val - paramArrayOfInt3[(1 - 1 + paramInt10)];
          i8 = (int)((Math.log(d4 - d3 + d5) - Math.log(d5)) / Math.log(2.0D)) + 2;
          Dlaebz.dlaebz(2, i8, i4, i4, 1, i16, d1, d6, d5, paramArrayOfDouble1, m - 1 + paramInt4, paramArrayOfDouble2, m - 1 + paramInt5, paramArrayOfDouble4, m - 1 + paramInt9, arrayOfInt, 0, paramArrayOfDouble4, paramInt1 + 1 - 1 + paramInt9, paramArrayOfDouble4, paramInt1 + 2 * i4 + 1 - 1 + paramInt9, localintW3, paramArrayOfInt3, paramInt10, paramArrayOfDouble3, paramintW1.val + 1 - 1 + paramInt6, paramArrayOfInt1, paramintW1.val + 1 - 1 + paramInt7, localintW1);
          i12 = 1;
          for (i20 = localintW3.val - 1 + 1; i20 > 0; i20--)
          {
            d8 = 0.5D * (paramArrayOfDouble4[(i12 + paramInt1 - 1 + paramInt9)] + paramArrayOfDouble4[(i12 + i4 + paramInt1 - 1 + paramInt9)]);
            if ((i12 <= localintW3.val - localintW1.val ? 0 : 1) != 0)
            {
              i = 1;
              k = -i13;
            }
            else
            {
              k = i13;
            }
            i15 = paramArrayOfInt3[(i12 - 1 + paramInt10)] + 1 + i11;
            for (int i21 = paramArrayOfInt3[(i12 + i4 - 1 + paramInt10)] + i11 - (paramArrayOfInt3[(i12 - 1 + paramInt10)] + 1 + i11) + 1; i21 > 0; i21--)
            {
              paramArrayOfDouble3[(i15 - 1 + paramInt6)] = d8;
              paramArrayOfInt1[(i15 - 1 + paramInt7)] = k;
              i15 += 1;
            }
            i12 += 1;
          }
          paramintW1.val += localintW2.val;
        }
      }
      i13 += 1;
    }
    if ((i7 != 3 ? 0 : 1) != 0)
    {
      localintW2.val = 0;
      n = paramInt2 - 1 - i17;
      i1 = i18 - paramInt3;
      if ((n <= 0 ? 0 : 1) == 0) {}
      if (((i1 <= 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i15 = 1;
        for (i19 = paramintW1.val - 1 + 1; i19 > 0; i19--)
        {
          if ((paramArrayOfDouble3[(i15 - 1 + paramInt6)] > d14 ? 0 : 1) != 0) {}
          if (((n <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            n -= 1;
          }
          else
          {
            if ((paramArrayOfDouble3[(i15 - 1 + paramInt6)] < d16 ? 0 : 1) != 0) {}
            if (((i1 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              i1 -= 1;
            }
            else
            {
              localintW2.val += 1;
              paramArrayOfDouble3[(localintW2.val - 1 + paramInt6)] = paramArrayOfDouble3[(i15 - 1 + paramInt6)];
              paramArrayOfInt1[(localintW2.val - 1 + paramInt7)] = paramArrayOfInt1[(i15 - 1 + paramInt7)];
            }
          }
          i15 += 1;
        }
        paramintW1.val = localintW2.val;
      }
      if ((n <= 0 ? 0 : 1) == 0) {}
      if (((i1 <= 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if ((n <= 0 ? 0 : 1) != 0)
        {
          d12 = d15;
          i14 = 1;
          for (i19 = n - 1 + 1; i19 > 0; i19--)
          {
            i10 = 0;
            i15 = 1;
            for (i20 = paramintW1.val - 1 + 1; i20 > 0; i20--)
            {
              if ((paramArrayOfInt1[(i15 - 1 + paramInt7)] == 0 ? 0 : 1) != 0) {
                if ((paramArrayOfDouble3[(i15 - 1 + paramInt6)] >= d12 ? 0 : 1) != 0) {}
              }
              if ((((i10 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i10 = i15;
                d12 = paramArrayOfDouble3[(i15 - 1 + paramInt6)];
              }
              i15 += 1;
            }
            paramArrayOfInt1[(i10 - 1 + paramInt7)] = 0;
            i14 += 1;
          }
        }
        if ((i1 <= 0 ? 0 : 1) != 0)
        {
          d12 = d13;
          i14 = 1;
          for (i19 = i1 - 1 + 1; i19 > 0; i19--)
          {
            i10 = 0;
            i15 = 1;
            for (i20 = paramintW1.val - 1 + 1; i20 > 0; i20--)
            {
              if ((paramArrayOfInt1[(i15 - 1 + paramInt7)] == 0 ? 0 : 1) != 0) {
                if ((paramArrayOfDouble3[(i15 - 1 + paramInt6)] <= d12 ? 0 : 1) != 0) {}
              }
              if ((((i10 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i10 = i15;
                d12 = paramArrayOfDouble3[(i15 - 1 + paramInt6)];
              }
              i15 += 1;
            }
            paramArrayOfInt1[(i10 - 1 + paramInt7)] = 0;
            i14 += 1;
          }
        }
        localintW2.val = 0;
        i15 = 1;
        for (i19 = paramintW1.val - 1 + 1; i19 > 0; i19--)
        {
          if ((paramArrayOfInt1[(i15 - 1 + paramInt7)] == 0 ? 0 : 1) != 0)
          {
            localintW2.val += 1;
            paramArrayOfDouble3[(localintW2.val - 1 + paramInt6)] = paramArrayOfDouble3[(i15 - 1 + paramInt6)];
            paramArrayOfInt1[(localintW2.val - 1 + paramInt7)] = paramArrayOfInt1[(i15 - 1 + paramInt7)];
          }
          i15 += 1;
        }
        paramintW1.val = localintW2.val;
      }
      if ((n >= 0 ? 0 : 1) == 0) {}
      if (((i1 >= 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        j = 1;
      }
    }
    if ((i6 != 1 ? 0 : 1) != 0) {}
    if (((paramintW2.val <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i15 = 1;
      for (i19 = paramintW1.val - 1 - 1 + 1; i19 > 0; i19--)
      {
        i2 = 0;
        d8 = paramArrayOfDouble3[(i15 - 1 + paramInt6)];
        i12 = i15 + 1;
        for (i20 = paramintW1.val - (i15 + 1) + 1; i20 > 0; i20--)
        {
          if ((paramArrayOfDouble3[(i12 - 1 + paramInt6)] >= d8 ? 0 : 1) != 0)
          {
            i2 = i12;
            d8 = paramArrayOfDouble3[(i12 - 1 + paramInt6)];
          }
          i12 += 1;
        }
        if ((i2 == 0 ? 0 : 1) != 0)
        {
          i9 = paramArrayOfInt1[(i2 - 1 + paramInt7)];
          paramArrayOfDouble3[(i2 - 1 + paramInt6)] = paramArrayOfDouble3[(i15 - 1 + paramInt6)];
          paramArrayOfInt1[(i2 - 1 + paramInt7)] = paramArrayOfInt1[(i15 - 1 + paramInt7)];
          paramArrayOfDouble3[(i15 - 1 + paramInt6)] = d8;
          paramArrayOfInt1[(i15 - 1 + paramInt7)] = i9;
        }
        i15 += 1;
      }
    }
    paramintW3.val = 0;
    if (i != 0) {
      paramintW3.val += 1;
    }
    if (j != 0) {
      paramintW3.val += 2;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dstebz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */