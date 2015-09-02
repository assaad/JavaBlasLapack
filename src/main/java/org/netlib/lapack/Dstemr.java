package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.booleanW;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dstemr
{
  public static void dstemr(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, int paramInt5, intW paramintW1, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, int paramInt8, int paramInt9, int[] paramArrayOfInt1, int paramInt10, booleanW parambooleanW, double[] paramArrayOfDouble5, int paramInt11, int paramInt12, int[] paramArrayOfInt2, int paramInt13, int paramInt14, intW paramintW2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    boolean bool3 = false;
    boolean bool4 = false;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    intW localintW1 = new intW(0);
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
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    intW localintW4 = new intW(0);
    intW localintW5 = new intW(0);
    int i21 = 0;
    int i22 = 0;
    int i23 = 0;
    double d1 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d2 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    double d3 = 0.0D;
    double d4 = 0.0D;
    doubleW localdoubleW5 = new doubleW(0.0D);
    doubleW localdoubleW6 = new doubleW(0.0D);
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    doubleW localdoubleW7 = new doubleW(0.0D);
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    doubleW localdoubleW8 = new doubleW(0.0D);
    doubleW localdoubleW9 = new doubleW(0.0D);
    bool4 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "A");
    bool3 = Lsame.lsame(paramString2, "V");
    bool2 = Lsame.lsame(paramString2, "I");
    if ((paramInt12 != -1 ? 0 : 1) == 0) {}
    i = (paramInt14 != -1 ? 0 : 1) == 0 ? 0 : 1;
    j = paramInt9 != -1 ? 0 : 1;
    parambooleanW.val = (paramintW2.val != 0);
    if (bool4)
    {
      i20 = 18 * paramInt1;
      i19 = 10 * paramInt1;
    }
    else
    {
      i20 = 12 * paramInt1;
      i19 = 8 * paramInt1;
    }
    localdoubleW8.val = 0.0D;
    localdoubleW9.val = 0.0D;
    i2 = 0;
    i7 = 0;
    if (bool3)
    {
      localdoubleW8.val = paramDouble1;
      localdoubleW9.val = paramDouble2;
    }
    else if (bool2)
    {
      i2 = paramInt4;
      i7 = paramInt5;
    }
    paramintW2.val = 0;
    if ((((!bool4) && (!Lsame.lsame(paramString1, "N")) ? 0 : 1) ^ 0x1) != 0)
    {
      paramintW2.val = -1;
    }
    else
    {
      if (((!bool1) && (!bool3) ? 0 : 1) == 0) {}
      if (((!bool2 ? 0 : 1) ^ 0x1) != 0)
      {
        paramintW2.val = -2;
      }
      else if ((paramInt1 >= 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -3;
      }
      else
      {
        if (bool3) {}
        if (((paramInt1 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((localdoubleW9.val > localdoubleW8.val ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW2.val = -7;
        }
        else
        {
          if (bool2) {
            if ((i2 >= 1 ? 0 : 1) != 0) {}
          }
          if ((((i2 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            paramintW2.val = -8;
          }
          else
          {
            if (bool2) {
              if ((i7 >= i2 ? 0 : 1) != 0) {}
            }
            if ((((i7 <= paramInt1 ? 0 : 1) == 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              paramintW2.val = -9;
            }
            else
            {
              if ((paramInt8 >= 1 ? 0 : 1) == 0) {
                if (!bool4) {}
              }
              if ((((paramInt8 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
              {
                paramintW2.val = -13;
              }
              else
              {
                if ((paramInt12 >= i20 ? 0 : 1) != 0) {}
                if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
                {
                  paramintW2.val = -17;
                }
                else
                {
                  if ((paramInt14 >= i19 ? 0 : 1) != 0) {}
                  if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
                    paramintW2.val = -19;
                  }
                }
              }
            }
          }
        }
      }
    }
    d5 = Dlamch.dlamch("Safe minimum");
    d2 = Dlamch.dlamch("Precision");
    d7 = d5 / d2;
    d1 = 1.0D / d7;
    d4 = Math.sqrt(d7);
    d3 = Math.min(Math.sqrt(d1), 1.0D / Math.sqrt(Math.sqrt(d5)));
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble5[(1 - 1 + paramInt11)] = i20;
      paramArrayOfInt2[(1 - 1 + paramInt13)] = i19;
      if (((bool4) && (bool1) ? 1 : 0) != 0) {
        localintW5.val = paramInt1;
      } else if (((bool4) && (bool3) ? 1 : 0) != 0) {
        Dlarrc.dlarrc("T", paramInt1, paramDouble1, paramDouble2, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, d5, localintW5, localintW2, localintW3, paramintW2);
      } else if (((bool4) && (bool2) ? 1 : 0) != 0) {
        localintW5.val = (i7 - i2 + 1);
      } else {
        localintW5.val = 0;
      }
      if (j != 0) {}
      if (((paramintW2.val != 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        paramArrayOfDouble4[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = localintW5.val;
      }
      else
      {
        if ((paramInt9 >= localintW5.val ? 0 : 1) != 0) {}
        if (((j ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW2.val = -14;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSTEMR", -paramintW2.val);
      return;
    }
    if (((i == 0) && (j == 0) ? 0 : 1) != 0) {
      return;
    }
    paramintW1.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if (((!bool1) && (!bool2) ? 0 : 1) != 0)
      {
        paramintW1.val = 1;
        paramArrayOfDouble3[(1 - 1 + paramInt6)] = paramArrayOfDouble1[(1 - 1 + paramInt2)];
      }
      else
      {
        if ((localdoubleW8.val >= paramArrayOfDouble1[(1 - 1 + paramInt2)] ? 0 : 1) != 0) {}
        if (((localdoubleW9.val < paramArrayOfDouble1[(1 - 1 + paramInt2)] ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          paramintW1.val = 1;
          paramArrayOfDouble3[(1 - 1 + paramInt6)] = paramArrayOfDouble1[(1 - 1 + paramInt2)];
        }
      }
      if (((bool4) && ((j ^ 0x1) != 0) ? 1 : 0) != 0)
      {
        paramArrayOfDouble4[(1 - 1 + (1 - 1) * paramInt8 + paramInt7)] = 1.0D;
        paramArrayOfInt1[(1 - 1 + paramInt10)] = 1;
        paramArrayOfInt1[(2 - 1 + paramInt10)] = 1;
      }
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      if ((bool4 ^ true)) {
        Dlae2.dlae2(paramArrayOfDouble1[(1 - 1 + paramInt2)], paramArrayOfDouble2[(1 - 1 + paramInt3)], paramArrayOfDouble1[(2 - 1 + paramInt2)], localdoubleW3, localdoubleW4);
      } else if (((bool4) && ((j ^ 0x1) != 0) ? 1 : 0) != 0) {
        Dlaev2.dlaev2(paramArrayOfDouble1[(1 - 1 + paramInt2)], paramArrayOfDouble2[(1 - 1 + paramInt3)], paramArrayOfDouble1[(2 - 1 + paramInt2)], localdoubleW3, localdoubleW4, localdoubleW1, localdoubleW7);
      }
      if (!bool1)
      {
        if (bool3) {}
        if (((localdoubleW4.val <= localdoubleW8.val ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((localdoubleW4.val > localdoubleW9.val ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
        if (!bool2) {}
      }
      if ((((i2 != 1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW1.val += 1;
        paramArrayOfDouble3[(paramintW1.val - 1 + paramInt6)] = localdoubleW4.val;
        if (((bool4) && ((j ^ 0x1) != 0) ? 1 : 0) != 0)
        {
          paramArrayOfDouble4[(1 - 1 + (paramintW1.val - 1) * paramInt8 + paramInt7)] = (-localdoubleW7.val);
          paramArrayOfDouble4[(2 - 1 + (paramintW1.val - 1) * paramInt8 + paramInt7)] = localdoubleW1.val;
          if ((localdoubleW7.val == 0.0D ? 0 : 1) != 0)
          {
            if ((localdoubleW1.val == 0.0D ? 0 : 1) != 0)
            {
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 2;
            }
            else
            {
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
            }
          }
          else
          {
            paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 2;
            paramArrayOfInt1[(2 * paramintW1.val - 1 + paramInt10)] = 2;
          }
        }
      }
      if (!bool1)
      {
        if (bool3) {}
        if (((localdoubleW3.val <= localdoubleW8.val ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      }
      if ((((localdoubleW3.val > localdoubleW9.val ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
        if (!bool2) {}
      }
      if ((((i7 != 2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW1.val += 1;
        paramArrayOfDouble3[(paramintW1.val - 1 + paramInt6)] = localdoubleW3.val;
        if (((bool4) && ((j ^ 0x1) != 0) ? 1 : 0) != 0)
        {
          paramArrayOfDouble4[(1 - 1 + (paramintW1.val - 1) * paramInt8 + paramInt7)] = localdoubleW1.val;
          paramArrayOfDouble4[(2 - 1 + (paramintW1.val - 1) * paramInt8 + paramInt7)] = localdoubleW7.val;
          if ((localdoubleW7.val == 0.0D ? 0 : 1) != 0)
          {
            if ((localdoubleW1.val == 0.0D ? 0 : 1) != 0)
            {
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 2;
            }
            else
            {
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
              paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 1;
            }
          }
          else
          {
            paramArrayOfInt1[(2 * paramintW1.val - 1 - 1 + paramInt10)] = 2;
            paramArrayOfInt1[(2 * paramintW1.val - 1 + paramInt10)] = 2;
          }
        }
      }
      return;
    }
    i14 = 1;
    i12 = 2 * paramInt1 + 1;
    i13 = 3 * paramInt1 + 1;
    i10 = 4 * paramInt1 + 1;
    i11 = 5 * paramInt1 + 1;
    i15 = 6 * paramInt1 + 1;
    i6 = 1;
    i3 = paramInt1 + 1;
    i4 = 2 * paramInt1 + 1;
    i5 = 3 * paramInt1 + 1;
    d6 = 1.0D;
    d10 = Dlanst.dlanst("M", paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3);
    if ((d10 <= 0.0D ? 0 : 1) != 0) {}
    if (((d10 >= d4 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      d6 = d4 / d10;
    } else if ((d10 <= d3 ? 0 : 1) != 0) {
      d6 = d3 / d10;
    }
    if ((d6 == 1.0D ? 0 : 1) != 0)
    {
      Dscal.dscal(paramInt1, d6, paramArrayOfDouble1, paramInt2, 1);
      Dscal.dscal(paramInt1 - 1, d6, paramArrayOfDouble2, paramInt3, 1);
      d10 *= d6;
      if (bool3)
      {
        localdoubleW8.val *= d6;
        localdoubleW9.val *= d6;
      }
    }
    if (parambooleanW.val) {
      Dlarrr.dlarrr(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, localintW1);
    } else {
      localintW1.val = -1;
    }
    if ((localintW1.val != 0 ? 0 : 1) != 0)
    {
      d8 = d2;
    }
    else
    {
      d8 = -d2;
      parambooleanW.val = false;
    }
    if (parambooleanW.val) {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt2, 1, paramArrayOfDouble5, i10 - 1 + paramInt11, 1);
    }
    i16 = 1;
    for (int i24 = paramInt1 - 1 - 1 + 1; i24 > 0; i24--)
    {
      paramArrayOfDouble5[(i11 + i16 - 1 - 1 + paramInt11)] = Math.pow(paramArrayOfDouble2[(i16 - 1 + paramInt3)], 2);
      i16 += 1;
    }
    if ((bool4 ^ true))
    {
      localdoubleW5.val = (4.0D * d2);
      localdoubleW6.val = (4.0D * d2);
    }
    else
    {
      localdoubleW5.val = Math.sqrt(d2);
      localdoubleW6.val = Math.max(Math.sqrt(d2) * 0.005D, 4.0D * d2);
    }
    Dlarre.dlarre(paramString2, paramInt1, localdoubleW8, localdoubleW9, i2, i7, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfDouble5, i11 - 1 + paramInt11, localdoubleW5.val, localdoubleW6.val, d8, localintW4, paramArrayOfInt2, i6 - 1 + paramInt13, paramintW1, paramArrayOfDouble3, paramInt6, paramArrayOfDouble5, i12 - 1 + paramInt11, paramArrayOfDouble5, i13 - 1 + paramInt11, paramArrayOfInt2, i3 - 1 + paramInt13, paramArrayOfInt2, i4 - 1 + paramInt13, paramArrayOfDouble5, i14 - 1 + paramInt11, localdoubleW2, paramArrayOfDouble5, i15 - 1 + paramInt11, paramArrayOfInt2, i5 - 1 + paramInt13, localintW1);
    if ((localintW1.val == 0 ? 0 : 1) != 0)
    {
      paramintW2.val = (10 + Math.abs(localintW1.val));
      return;
    }
    if (bool4)
    {
      Dlarrv.dlarrv(paramInt1, localdoubleW8.val, localdoubleW9.val, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, localdoubleW2.val, paramArrayOfInt2, i6 - 1 + paramInt13, paramintW1.val, 1, paramintW1.val, 0.001D, localdoubleW5, localdoubleW6, paramArrayOfDouble3, paramInt6, paramArrayOfDouble5, i12 - 1 + paramInt11, paramArrayOfDouble5, i13 - 1 + paramInt11, paramArrayOfInt2, i3 - 1 + paramInt13, paramArrayOfInt2, i4 - 1 + paramInt13, paramArrayOfDouble5, i14 - 1 + paramInt11, paramArrayOfDouble4, paramInt7, paramInt8, paramArrayOfInt1, paramInt10, paramArrayOfDouble5, i15 - 1 + paramInt11, paramArrayOfInt2, i5 - 1 + paramInt13, localintW1);
      if ((localintW1.val == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = (20 + Math.abs(localintW1.val));
        return;
      }
    }
    else
    {
      i16 = 1;
      for (i24 = paramintW1.val - 1 + 1; i24 > 0; i24--)
      {
        localintW2.val = paramArrayOfInt2[(i3 + i16 - 1 - 1 + paramInt13)];
        paramArrayOfDouble3[(i16 - 1 + paramInt6)] += paramArrayOfDouble2[(paramArrayOfInt2[(i6 + localintW2.val - 1 - 1 + paramInt13)] - 1 + paramInt3)];
        i16 += 1;
      }
    }
    if (parambooleanW.val)
    {
      m = 1;
      i22 = 1;
      i17 = 1;
      for (i24 = paramArrayOfInt2[(i3 + paramintW1.val - 1 - 1 + paramInt13)] - 1 + 1; i24 > 0; i24--)
      {
        n = paramArrayOfInt2[(i6 + i17 - 1 - 1 + paramInt13)];
        i9 = n - m + 1;
        i23 = i22 - 1;
        while ((i23 >= paramintW1.val ? 0 : 1) != 0)
        {
          if ((paramArrayOfInt2[(i3 + i23 - 1 + paramInt13)] != i17 ? 0 : 1) == 0) {
            break;
          }
          i23 += 1;
        }
        if ((i23 >= i22 ? 0 : 1) != 0)
        {
          m = n + 1;
        }
        else
        {
          i21 = paramArrayOfInt2[(i4 + i22 - 1 - 1 + paramInt13)] - 1;
          i1 = paramArrayOfInt2[(i4 + i22 - 1 - 1 + paramInt13)];
          i8 = paramArrayOfInt2[(i4 + i23 - 1 - 1 + paramInt13)];
          localdoubleW6.val = (4.0D * d2);
          Dlarrj.dlarrj(i9, paramArrayOfDouble5, i10 + m - 1 - 1 + paramInt11, paramArrayOfDouble5, i11 + m - 1 - 1 + paramInt11, i1, i8, localdoubleW6.val, i21, paramArrayOfDouble3, i22 - 1 + paramInt6, paramArrayOfDouble5, i12 + i22 - 1 - 1 + paramInt11, paramArrayOfDouble5, i15 - 1 + paramInt11, paramArrayOfInt2, i5 - 1 + paramInt13, localdoubleW2.val, d10, localintW1);
          m = n + 1;
          i22 = i23 + 1;
        }
        i17 += 1;
      }
    }
    if ((d6 == 1.0D ? 0 : 1) != 0) {
      Dscal.dscal(paramintW1.val, 1.0D / d6, paramArrayOfDouble3, paramInt6, 1);
    }
    if ((localintW4.val <= 1 ? 0 : 1) != 0) {
      if ((bool4 ^ true))
      {
        Dlasrt.dlasrt("I", paramintW1.val, paramArrayOfDouble3, paramInt6, localintW1);
        if ((localintW1.val == 0 ? 0 : 1) != 0)
        {
          paramintW2.val = 3;
          return;
        }
      }
      else
      {
        i16 = 1;
        for (i24 = paramintW1.val - 1 - 1 + 1; i24 > 0; i24--)
        {
          k = 0;
          d9 = paramArrayOfDouble3[(i16 - 1 + paramInt6)];
          i18 = i16 + 1;
          for (int i25 = paramintW1.val - (i16 + 1) + 1; i25 > 0; i25--)
          {
            if ((paramArrayOfDouble3[(i18 - 1 + paramInt6)] >= d9 ? 0 : 1) != 0)
            {
              k = i18;
              d9 = paramArrayOfDouble3[(i18 - 1 + paramInt6)];
            }
            i18 += 1;
          }
          if ((k == 0 ? 0 : 1) != 0)
          {
            paramArrayOfDouble3[(k - 1 + paramInt6)] = paramArrayOfDouble3[(i16 - 1 + paramInt6)];
            paramArrayOfDouble3[(i16 - 1 + paramInt6)] = d9;
            if (bool4)
            {
              Dswap.dswap(paramInt1, paramArrayOfDouble4, 1 - 1 + (k - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble4, 1 - 1 + (i16 - 1) * paramInt8 + paramInt7, 1);
              localintW2.val = paramArrayOfInt1[(2 * k - 1 - 1 + paramInt10)];
              paramArrayOfInt1[(2 * k - 1 - 1 + paramInt10)] = paramArrayOfInt1[(2 * i16 - 1 - 1 + paramInt10)];
              paramArrayOfInt1[(2 * i16 - 1 - 1 + paramInt10)] = localintW2.val;
              localintW2.val = paramArrayOfInt1[(2 * k - 1 + paramInt10)];
              paramArrayOfInt1[(2 * k - 1 + paramInt10)] = paramArrayOfInt1[(2 * i16 - 1 + paramInt10)];
              paramArrayOfInt1[(2 * i16 - 1 + paramInt10)] = localintW2.val;
            }
          }
          i16 += 1;
        }
      }
    }
    paramArrayOfDouble5[(1 - 1 + paramInt11)] = i20;
    paramArrayOfInt2[(1 - 1 + paramInt13)] = i19;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dstemr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */