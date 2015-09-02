package org.netlib.lapack;

import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlarrd
{
  public static void dlarrd(String paramString1, String paramString2, int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, double paramDouble3, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double paramDouble4, int paramInt8, int[] paramArrayOfInt1, int paramInt9, intW paramintW1, double[] paramArrayOfDouble5, int paramInt10, double[] paramArrayOfDouble6, int paramInt11, doubleW paramdoubleW1, doubleW paramdoubleW2, int[] paramArrayOfInt2, int paramInt12, int[] paramArrayOfInt3, int paramInt13, double[] paramArrayOfDouble7, int paramInt14, int[] paramArrayOfInt4, int paramInt15, intW paramintW2)
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
    intW localintW1 = new intW(0);
    intW localintW2 = new intW(0);
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
    int i19 = 0;
    int i20 = 0;
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
    int[] arrayOfInt = new int[1];
    paramintW2.val = 0;
    if (Lsame.lsame(paramString1, "A")) {
      i7 = 1;
    } else if (Lsame.lsame(paramString1, "V")) {
      i7 = 2;
    } else if (Lsame.lsame(paramString1, "I")) {
      i7 = 3;
    } else {
      i7 = 0;
    }
    if ((i7 > 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -1;
    }
    else if ((((!Lsame.lsame(paramString2, "B")) && (!Lsame.lsame(paramString2, "E")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW2.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -3;
    }
    else if ((i7 != 2 ? 0 : 1) != 0)
    {
      if ((paramDouble1 < paramDouble2 ? 0 : 1) != 0) {
        paramintW2.val = -5;
      }
    }
    else
    {
      if ((i7 != 3 ? 0 : 1) != 0) {
        if ((paramInt2 >= 1 ? 0 : 1) != 0) {}
      }
      if ((((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramintW2.val = -6;
      }
      else
      {
        if ((i7 != 3 ? 0 : 1) != 0) {
          if ((paramInt3 >= Math.min(paramInt1, paramInt2) ? 0 : 1) != 0) {}
        }
        if ((((paramInt3 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -7;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0) {
      return;
    }
    paramintW2.val = 0;
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
    d2 = Dlamch.dlamch("P");
    d10 = Dlamch.dlamch("U");
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((i7 != 1 ? 0 : 1) == 0)
      {
        if ((i7 != 2 ? 0 : 1) != 0) {}
        if (((paramArrayOfDouble2[(1 - 1 + paramInt5)] <= paramDouble1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((paramArrayOfDouble2[(1 - 1 + paramInt5)] > paramDouble2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0)
      {
        if ((i7 != 3 ? 0 : 1) != 0) {}
        if (((paramInt2 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((paramInt3 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW1.val = 1;
        paramArrayOfDouble5[(1 - 1 + paramInt10)] = paramArrayOfDouble2[(1 - 1 + paramInt5)];
        paramArrayOfDouble6[(1 - 1 + paramInt11)] = 0.0D;
        paramArrayOfInt2[(1 - 1 + paramInt12)] = 1;
        paramArrayOfInt3[(1 - 1 + paramInt13)] = 1;
      }
      return;
    }
    i18 = Ilaenv.ilaenv(1, "DSTEBZ", " ", paramInt1, -1, -1, -1);
    if ((i18 > 1 ? 0 : 1) != 0) {
      i18 = 0;
    }
    d3 = paramArrayOfDouble2[(1 - 1 + paramInt5)];
    d4 = paramArrayOfDouble2[(1 - 1 + paramInt5)];
    k = 1;
    for (int i21 = paramInt1 - 1 + 1; i21 > 0; i21--)
    {
      d3 = Math.min(d3, paramArrayOfDouble1[(2 * k - 1 - 1 + paramInt4)]);
      d4 = Math.max(d4, paramArrayOfDouble1[(2 * k - 1 + paramInt4)]);
      k += 1;
    }
    d9 = Math.max(Math.abs(d3), Math.abs(d4));
    d3 = d3 - 2.0D * d9 * d2 * paramInt1 - 2.0D * 2.0D * paramDouble4;
    d4 = d4 + 2.0D * d9 * d2 * paramInt1 + 2.0D * 2.0D * paramDouble4;
    d6 = d4 - d3;
    d5 = paramDouble3;
    d1 = 2.0D * 2.0D * d10 + 2.0D * 2.0D * paramDouble4;
    if ((i7 != 3 ? 0 : 1) != 0)
    {
      i8 = (int)((Math.log(d9 + paramDouble4) - Math.log(paramDouble4)) / Math.log(2.0D)) + 2;
      paramArrayOfDouble7[(paramInt1 + 1 - 1 + paramInt14)] = d3;
      paramArrayOfDouble7[(paramInt1 + 2 - 1 + paramInt14)] = d3;
      paramArrayOfDouble7[(paramInt1 + 3 - 1 + paramInt14)] = d4;
      paramArrayOfDouble7[(paramInt1 + 4 - 1 + paramInt14)] = d4;
      paramArrayOfDouble7[(paramInt1 + 5 - 1 + paramInt14)] = d3;
      paramArrayOfDouble7[(paramInt1 + 6 - 1 + paramInt14)] = d4;
      paramArrayOfInt4[(1 - 1 + paramInt15)] = -1;
      paramArrayOfInt4[(2 - 1 + paramInt15)] = -1;
      paramArrayOfInt4[(3 - 1 + paramInt15)] = (paramInt1 + 1);
      paramArrayOfInt4[(4 - 1 + paramInt15)] = (paramInt1 + 1);
      paramArrayOfInt4[(5 - 1 + paramInt15)] = (paramInt2 - 1);
      paramArrayOfInt4[(6 - 1 + paramInt15)] = paramInt3;
      Dlaebz.dlaebz(3, i8, paramInt1, 2, 2, i18, d1, d5, paramDouble4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble3, paramInt6, paramArrayOfDouble4, paramInt7, paramArrayOfInt4, 5 - 1 + paramInt15, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt14, paramArrayOfDouble7, paramInt1 + 5 - 1 + paramInt14, localintW3, paramArrayOfInt4, paramInt15, paramArrayOfDouble5, paramInt10, paramArrayOfInt2, paramInt12, localintW1);
      if ((localintW1.val == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = localintW1.val;
        return;
      }
      if ((paramArrayOfInt4[(6 - 1 + paramInt15)] != paramInt3 ? 0 : 1) != 0)
      {
        paramdoubleW1.val = paramArrayOfDouble7[(paramInt1 + 1 - 1 + paramInt14)];
        d12 = paramArrayOfDouble7[(paramInt1 + 3 - 1 + paramInt14)];
        i19 = paramArrayOfInt4[(1 - 1 + paramInt15)];
        paramdoubleW2.val = paramArrayOfDouble7[(paramInt1 + 4 - 1 + paramInt14)];
        d13 = paramArrayOfDouble7[(paramInt1 + 2 - 1 + paramInt14)];
        i20 = paramArrayOfInt4[(4 - 1 + paramInt15)];
      }
      else
      {
        paramdoubleW1.val = paramArrayOfDouble7[(paramInt1 + 2 - 1 + paramInt14)];
        d12 = paramArrayOfDouble7[(paramInt1 + 4 - 1 + paramInt14)];
        i19 = paramArrayOfInt4[(2 - 1 + paramInt15)];
        paramdoubleW2.val = paramArrayOfDouble7[(paramInt1 + 3 - 1 + paramInt14)];
        d13 = paramArrayOfDouble7[(paramInt1 + 1 - 1 + paramInt14)];
        i20 = paramArrayOfInt4[(3 - 1 + paramInt15)];
      }
      if ((i19 >= 0 ? 0 : 1) == 0) {}
      if (((i19 < paramInt1 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((i20 >= 1 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      if (((i20 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = 4;
        return;
      }
    }
    else if ((i7 != 2 ? 0 : 1) != 0)
    {
      paramdoubleW1.val = paramDouble1;
      paramdoubleW2.val = paramDouble2;
    }
    else if ((i7 != 1 ? 0 : 1) != 0)
    {
      paramdoubleW1.val = d3;
      paramdoubleW2.val = d4;
    }
    paramintW1.val = 0;
    i4 = 0;
    paramintW2.val = 0;
    i19 = 0;
    i20 = 0;
    i14 = 1;
    int i22;
    for (int i21 = paramInt8 - 1 + 1; i21 > 0; i21--)
    {
      i6 = i4;
      n = i6 + 1;
      i4 = paramArrayOfInt1[(i14 - 1 + paramInt9)];
      i5 = i4 - i6;
      if ((i5 != 1 ? 0 : 1) != 0)
      {
        if ((paramdoubleW1.val < paramArrayOfDouble2[(n - 1 + paramInt5)] - paramDouble4 ? 0 : 1) != 0) {
          i19 += 1;
        }
        if ((paramdoubleW2.val < paramArrayOfDouble2[(n - 1 + paramInt5)] - paramDouble4 ? 0 : 1) != 0) {
          i20 += 1;
        }
        if ((i7 != 1 ? 0 : 1) == 0) {
          if ((paramdoubleW1.val >= paramArrayOfDouble2[(n - 1 + paramInt5)] - paramDouble4 ? 0 : 1) == 0) {}
        }
        if ((((paramdoubleW2.val < paramArrayOfDouble2[(n - 1 + paramInt5)] - paramDouble4 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW1.val += 1;
          paramArrayOfDouble5[(paramintW1.val - 1 + paramInt10)] = paramArrayOfDouble2[(n - 1 + paramInt5)];
          paramArrayOfDouble6[(paramintW1.val - 1 + paramInt11)] = 0.0D;
          paramArrayOfInt2[(paramintW1.val - 1 + paramInt12)] = i14;
          paramArrayOfInt3[(paramintW1.val - 1 + paramInt13)] = 1;
        }
      }
      else
      {
        d4 = paramArrayOfDouble2[(n - 1 + paramInt5)];
        d3 = paramArrayOfDouble2[(n - 1 + paramInt5)];
        d7 = 0.0D;
        i13 = n;
        for (i22 = i4 - n + 1; i22 > 0; i22--)
        {
          d3 = Math.min(d3, paramArrayOfDouble1[(2 * i13 - 1 - 1 + paramInt4)]);
          d4 = Math.max(d4, paramArrayOfDouble1[(2 * i13 - 1 + paramInt4)]);
          i13 += 1;
        }
        d6 = d4 - d3;
        d3 = d3 - 2.0D * d6 * d2 * i5 - 2.0D * paramDouble4;
        d4 = d4 + 2.0D * d6 * d2 * i5 + 2.0D * paramDouble4;
        if ((i7 <= 1 ? 0 : 1) != 0)
        {
          if ((d4 >= paramdoubleW1.val ? 0 : 1) != 0)
          {
            i19 += i5;
            i20 += i5;
          }
          else
          {
            d3 = Math.max(d3, paramdoubleW1.val);
            d4 = Math.min(d4, paramdoubleW2.val);
            if ((d3 < d4 ? 0 : 1) != 0) {}
          }
        }
        else
        {
          paramArrayOfDouble7[(paramInt1 + 1 - 1 + paramInt14)] = d3;
          paramArrayOfDouble7[(paramInt1 + i5 + 1 - 1 + paramInt14)] = d4;
          Dlaebz.dlaebz(1, 0, i5, i5, 1, i18, d1, d5, paramDouble4, paramArrayOfDouble2, n - 1 + paramInt5, paramArrayOfDouble3, n - 1 + paramInt6, paramArrayOfDouble4, n - 1 + paramInt7, arrayOfInt, 0, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt14, paramArrayOfDouble7, paramInt1 + 2 * i5 + 1 - 1 + paramInt14, localintW2, paramArrayOfInt4, paramInt15, paramArrayOfDouble5, paramintW1.val + 1 - 1 + paramInt10, paramArrayOfInt2, paramintW1.val + 1 - 1 + paramInt12, localintW1);
          if ((localintW1.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = localintW1.val;
            return;
          }
          i19 += paramArrayOfInt4[(1 - 1 + paramInt15)];
          i20 += paramArrayOfInt4[(i5 + 1 - 1 + paramInt15)];
          i12 = paramintW1.val - paramArrayOfInt4[(1 - 1 + paramInt15)];
          i8 = (int)((Math.log(d4 - d3 + paramDouble4) - Math.log(paramDouble4)) / Math.log(2.0D)) + 2;
          Dlaebz.dlaebz(2, i8, i5, i5, 1, i18, d1, d5, paramDouble4, paramArrayOfDouble2, n - 1 + paramInt5, paramArrayOfDouble3, n - 1 + paramInt6, paramArrayOfDouble4, n - 1 + paramInt7, arrayOfInt, 0, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt14, paramArrayOfDouble7, paramInt1 + 2 * i5 + 1 - 1 + paramInt14, localintW3, paramArrayOfInt4, paramInt15, paramArrayOfDouble5, paramintW1.val + 1 - 1 + paramInt10, paramArrayOfInt2, paramintW1.val + 1 - 1 + paramInt12, localintW1);
          if ((localintW1.val == 0 ? 0 : 1) != 0)
          {
            paramintW2.val = localintW1.val;
            return;
          }
          i13 = 1;
          for (i22 = localintW3.val - 1 + 1; i22 > 0; i22--)
          {
            d7 = 0.5D * (paramArrayOfDouble7[(i13 + paramInt1 - 1 + paramInt14)] + paramArrayOfDouble7[(i13 + i5 + paramInt1 - 1 + paramInt14)]);
            d8 = 0.5D * Math.abs(paramArrayOfDouble7[(i13 + paramInt1 - 1 + paramInt14)] - paramArrayOfDouble7[(i13 + i5 + paramInt1 - 1 + paramInt14)]);
            if ((i13 <= localintW3.val - localintW1.val ? 0 : 1) != 0)
            {
              i = 1;
              m = -i14;
            }
            else
            {
              m = i14;
            }
            i16 = paramArrayOfInt4[(i13 - 1 + paramInt15)] + 1 + i12;
            for (int i23 = paramArrayOfInt4[(i13 + i5 - 1 + paramInt15)] + i12 - (paramArrayOfInt4[(i13 - 1 + paramInt15)] + 1 + i12) + 1; i23 > 0; i23--)
            {
              paramArrayOfDouble5[(i16 - 1 + paramInt10)] = d7;
              paramArrayOfDouble6[(i16 - 1 + paramInt11)] = d8;
              paramArrayOfInt3[(i16 - 1 + paramInt13)] = (i16 - i12);
              paramArrayOfInt2[(i16 - 1 + paramInt12)] = m;
              i16 += 1;
            }
            i13 += 1;
          }
          paramintW1.val += localintW2.val;
        }
      }
      i14 += 1;
    }
    if ((i7 != 3 ? 0 : 1) != 0)
    {
      i1 = paramInt2 - 1 - i19;
      i2 = i20 - paramInt3;
      if ((i1 <= 0 ? 0 : 1) != 0)
      {
        localintW2.val = 0;
        i16 = 1;
        for (int i21 = paramintW1.val - 1 + 1; i21 > 0; i21--)
        {
          if ((paramArrayOfDouble5[(i16 - 1 + paramInt10)] > d12 ? 0 : 1) != 0) {}
          if (((i1 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            i1 -= 1;
          }
          else
          {
            localintW2.val += 1;
            paramArrayOfDouble5[(localintW2.val - 1 + paramInt10)] = paramArrayOfDouble5[(i16 - 1 + paramInt10)];
            paramArrayOfDouble6[(localintW2.val - 1 + paramInt11)] = paramArrayOfDouble6[(i16 - 1 + paramInt11)];
            paramArrayOfInt3[(localintW2.val - 1 + paramInt13)] = paramArrayOfInt3[(i16 - 1 + paramInt13)];
            paramArrayOfInt2[(localintW2.val - 1 + paramInt12)] = paramArrayOfInt2[(i16 - 1 + paramInt12)];
          }
          i16 += 1;
        }
        paramintW1.val = localintW2.val;
      }
      if ((i2 <= 0 ? 0 : 1) != 0)
      {
        paramintW1.val += 1;
        i16 = paramintW1.val;
        for (int i21 = (1 - paramintW1.val + -1) / -1; i21 > 0; i21--)
        {
          if ((paramArrayOfDouble5[(i16 - 1 + paramInt10)] < d13 ? 0 : 1) != 0) {}
          if (((i2 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            i2 -= 1;
          }
          else
          {
            localintW2.val -= 1;
            paramArrayOfDouble5[(localintW2.val - 1 + paramInt10)] = paramArrayOfDouble5[(i16 - 1 + paramInt10)];
            paramArrayOfDouble6[(localintW2.val - 1 + paramInt11)] = paramArrayOfDouble6[(i16 - 1 + paramInt11)];
            paramArrayOfInt3[(localintW2.val - 1 + paramInt13)] = paramArrayOfInt3[(i16 - 1 + paramInt13)];
            paramArrayOfInt2[(localintW2.val - 1 + paramInt12)] = paramArrayOfInt2[(i16 - 1 + paramInt12)];
          }
          i16 += -1;
        }
        i17 = 0;
        i16 = localintW2.val;
        for (int i21 = paramintW1.val - localintW2.val + 1; i21 > 0; i21--)
        {
          i17 += 1;
          paramArrayOfDouble5[(i17 - 1 + paramInt10)] = paramArrayOfDouble5[(i16 - 1 + paramInt10)];
          paramArrayOfDouble6[(i17 - 1 + paramInt11)] = paramArrayOfDouble6[(i16 - 1 + paramInt11)];
          paramArrayOfInt3[(i17 - 1 + paramInt13)] = paramArrayOfInt3[(i16 - 1 + paramInt13)];
          paramArrayOfInt2[(i17 - 1 + paramInt12)] = paramArrayOfInt2[(i16 - 1 + paramInt12)];
          i16 += 1;
        }
        paramintW1.val = (paramintW1.val - localintW2.val + 1);
      }
      if ((i1 <= 0 ? 0 : 1) == 0) {}
      if (((i2 <= 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        if ((i1 <= 0 ? 0 : 1) != 0)
        {
          d11 = paramdoubleW2.val;
          i15 = 1;
          for (int i21 = i1 - 1 + 1; i21 > 0; i21--)
          {
            i11 = 0;
            i16 = 1;
            for (i22 = paramintW1.val - 1 + 1; i22 > 0; i22--)
            {
              if ((paramArrayOfInt2[(i16 - 1 + paramInt12)] == 0 ? 0 : 1) != 0) {
                if ((paramArrayOfDouble5[(i16 - 1 + paramInt10)] >= d11 ? 0 : 1) != 0) {}
              }
              if ((((i11 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i11 = i16;
                d11 = paramArrayOfDouble5[(i16 - 1 + paramInt10)];
              }
              i16 += 1;
            }
            paramArrayOfInt2[(i11 - 1 + paramInt12)] = 0;
            i15 += 1;
          }
        }
        if ((i2 <= 0 ? 0 : 1) != 0)
        {
          d11 = paramdoubleW1.val;
          i15 = 1;
          for (int i21 = i2 - 1 + 1; i21 > 0; i21--)
          {
            i11 = 0;
            i16 = 1;
            for (i22 = paramintW1.val - 1 + 1; i22 > 0; i22--)
            {
              if ((paramArrayOfInt2[(i16 - 1 + paramInt12)] == 0 ? 0 : 1) != 0) {
                if ((paramArrayOfDouble5[(i16 - 1 + paramInt10)] < d11 ? 0 : 1) != 0) {}
              }
              if ((((i11 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i11 = i16;
                d11 = paramArrayOfDouble5[(i16 - 1 + paramInt10)];
              }
              i16 += 1;
            }
            paramArrayOfInt2[(i11 - 1 + paramInt12)] = 0;
            i15 += 1;
          }
        }
        localintW2.val = 0;
        i16 = 1;
        for (int i21 = paramintW1.val - 1 + 1; i21 > 0; i21--)
        {
          if ((paramArrayOfInt2[(i16 - 1 + paramInt12)] == 0 ? 0 : 1) != 0)
          {
            localintW2.val += 1;
            paramArrayOfDouble5[(localintW2.val - 1 + paramInt10)] = paramArrayOfDouble5[(i16 - 1 + paramInt10)];
            paramArrayOfDouble6[(localintW2.val - 1 + paramInt11)] = paramArrayOfDouble6[(i16 - 1 + paramInt11)];
            paramArrayOfInt3[(localintW2.val - 1 + paramInt13)] = paramArrayOfInt3[(i16 - 1 + paramInt13)];
            paramArrayOfInt2[(localintW2.val - 1 + paramInt12)] = paramArrayOfInt2[(i16 - 1 + paramInt12)];
          }
          i16 += 1;
        }
        paramintW1.val = localintW2.val;
      }
      if ((i1 >= 0 ? 0 : 1) == 0) {}
      if (((i2 >= 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        j = 1;
      }
    }
    if ((i7 != 1 ? 0 : 1) != 0) {}
    if (((paramintW1.val == paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
      if ((i7 != 3 ? 0 : 1) == 0) {}
    }
    if ((((paramintW1.val == paramInt3 - paramInt2 + 1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
      j = 1;
    }
    if (Lsame.lsame(paramString2, "E")) {}
    if (((paramInt8 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i16 = 1;
      for (int i21 = paramintW1.val - 1 - 1 + 1; i21 > 0; i21--)
      {
        i3 = 0;
        d7 = paramArrayOfDouble5[(i16 - 1 + paramInt10)];
        i13 = i16 + 1;
        for (i22 = paramintW1.val - (i16 + 1) + 1; i22 > 0; i22--)
        {
          if ((paramArrayOfDouble5[(i13 - 1 + paramInt10)] >= d7 ? 0 : 1) != 0)
          {
            i3 = i13;
            d7 = paramArrayOfDouble5[(i13 - 1 + paramInt10)];
          }
          i13 += 1;
        }
        if ((i3 == 0 ? 0 : 1) != 0)
        {
          d8 = paramArrayOfDouble6[(i3 - 1 + paramInt11)];
          i9 = paramArrayOfInt2[(i3 - 1 + paramInt12)];
          i10 = paramArrayOfInt3[(i3 - 1 + paramInt13)];
          paramArrayOfDouble5[(i3 - 1 + paramInt10)] = paramArrayOfDouble5[(i16 - 1 + paramInt10)];
          paramArrayOfDouble6[(i3 - 1 + paramInt11)] = paramArrayOfDouble6[(i16 - 1 + paramInt11)];
          paramArrayOfInt2[(i3 - 1 + paramInt12)] = paramArrayOfInt2[(i16 - 1 + paramInt12)];
          paramArrayOfInt3[(i3 - 1 + paramInt13)] = paramArrayOfInt3[(i16 - 1 + paramInt13)];
          paramArrayOfDouble5[(i16 - 1 + paramInt10)] = d7;
          paramArrayOfDouble6[(i16 - 1 + paramInt11)] = d8;
          paramArrayOfInt2[(i16 - 1 + paramInt12)] = i9;
          paramArrayOfInt3[(i16 - 1 + paramInt13)] = i10;
        }
        i16 += 1;
      }
    }
    paramintW2.val = 0;
    if (i != 0) {
      paramintW2.val += 1;
    }
    if (j != 0) {
      paramintW2.val += 2;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */