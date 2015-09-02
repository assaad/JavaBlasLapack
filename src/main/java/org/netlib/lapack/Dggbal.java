package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Ddot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.intW;

public final class Dggbal
{
  public static void dggbal(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, intW paramintW1, intW paramintW2, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, intW paramintW3)
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
    int i16 = 0;
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
    paramintW3.val = 0;
    if ((((Lsame.lsame(paramString, "N") ^ true)) && ((Lsame.lsame(paramString, "P") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "S") ^ true) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "B") ^ true) ? 1 : 0) != 0) {
      paramintW3.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW3.val = -2;
    } else if ((paramInt3 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW3.val = -4;
    } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW3.val = -6;
    }
    if ((paramintW3.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGGBAL", -paramintW3.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramintW1.val = 1;
      paramintW2.val = paramInt1;
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      paramintW1.val = 1;
      paramintW2.val = paramInt1;
      paramArrayOfDouble3[(1 - 1 + paramInt6)] = 1.0D;
      paramArrayOfDouble4[(1 - 1 + paramInt7)] = 1.0D;
      return;
    }
    if (Lsame.lsame(paramString, "N"))
    {
      paramintW1.val = 1;
      paramintW2.val = paramInt1;
      i = 1;
      for (i17 = paramInt1 - 1 + 1; i17 > 0; i17--)
      {
        paramArrayOfDouble3[(i - 1 + paramInt6)] = 1.0D;
        paramArrayOfDouble4[(i - 1 + paramInt7)] = 1.0D;
        i += 1;
      }
      return;
    }
    i6 = 1;
    i8 = paramInt1;
    label525:
    int i18;
    if (!Lsame.lsame(paramString, "S"))
    {
      break label525;
      i8 = i10;
      if ((i8 == 1 ? 0 : 1) == 0)
      {
        paramArrayOfDouble4[(1 - 1 + paramInt7)] = 1.0D;
        paramArrayOfDouble3[(1 - 1 + paramInt6)] = 1.0D;
      }
      else
      {
        i10 = i8 - 1;
        i = i8;
        i17 = (1 - i8 + -1) / -1;
        for (;;)
        {
          i3 = 1;
          for (i18 = i10 - 1 + 1; i18 > 0; i18--)
          {
            i5 = i3 + 1;
            if ((paramArrayOfDouble1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
            if (((paramArrayOfDouble2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
              break;
            }
            i3 += 1;
          }
          i3 = i8;
          break label767;
          i3 = i5;
          for (i18 = i8 - i5 + 1; i18 > 0; i18--)
          {
            if ((paramArrayOfDouble1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
            if (((paramArrayOfDouble2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
              break;
            }
            i3 += 1;
          }
          i3 = i5 - 1;
          label767:
          i14 = i8;
          k = 1;
          break label1064;
          i += -1;
          i17--;
          if (i17 <= 0) {
            break;
          }
        }
        label1037:
        label1064:
        do
        {
          i6 += 1;
          i3 = i6;
          for (i17 = i8 - i6 + 1; i17 > 0; i17--)
          {
            i = i6;
            for (i18 = i10 - i6 + 1; i18 > 0; i18--)
            {
              m = i + 1;
              if ((paramArrayOfDouble1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
              if (((paramArrayOfDouble2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
                break;
              }
              i += 1;
            }
            i = i8;
            break label1037;
            i = m;
            for (i18 = i8 - m + 1; i18 > 0; i18--)
            {
              if ((paramArrayOfDouble1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] == 0.0D ? 0 : 1) == 0) {}
              if (((paramArrayOfDouble2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
                break;
              }
              i += 1;
            }
            i = m - 1;
            i14 = i6;
            k = 2;
            break;
            i3 += 1;
          }
          break label1312;
          paramArrayOfDouble3[(i14 - 1 + paramInt6)] = i;
          if ((i != i14 ? 0 : 1) == 0)
          {
            Dswap.dswap(paramInt1 - i6 + 1, paramArrayOfDouble1, i - 1 + (i6 - 1) * paramInt3 + paramInt2, paramInt3, paramArrayOfDouble1, i14 - 1 + (i6 - 1) * paramInt3 + paramInt2, paramInt3);
            Dswap.dswap(paramInt1 - i6 + 1, paramArrayOfDouble2, i - 1 + (i6 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i14 - 1 + (i6 - 1) * paramInt5 + paramInt4, paramInt5);
          }
          paramArrayOfDouble4[(i14 - 1 + paramInt7)] = i3;
          if ((i3 != i14 ? 0 : 1) == 0)
          {
            Dswap.dswap(i8, paramArrayOfDouble1, 1 - 1 + (i3 - 1) * paramInt3 + paramInt2, 1, paramArrayOfDouble1, 1 - 1 + (i14 - 1) * paramInt3 + paramInt2, 1);
            Dswap.dswap(i8, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, 1 - 1 + (i14 - 1) * paramInt5 + paramInt4, 1);
          }
          i17 = k;
          if (i17 == 1) {
            break;
          }
        } while (i17 == 2);
      }
    }
    label1312:
    paramintW1.val = i6;
    paramintW2.val = i8;
    if (Lsame.lsame(paramString, "P"))
    {
      i = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        paramArrayOfDouble3[(i - 1 + paramInt6)] = 1.0D;
        paramArrayOfDouble4[(i - 1 + paramInt7)] = 1.0D;
        i += 1;
      }
      return;
    }
    if ((paramintW1.val != paramintW2.val ? 0 : 1) != 0) {
      return;
    }
    i15 = paramintW2.val - paramintW1.val + 1;
    i = paramintW1.val;
    for (int i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
    {
      paramArrayOfDouble4[(i - 1 + paramInt7)] = 0.0D;
      paramArrayOfDouble3[(i - 1 + paramInt6)] = 0.0D;
      paramArrayOfDouble5[(i - 1 + paramInt8)] = 0.0D;
      paramArrayOfDouble5[(i + paramInt1 - 1 + paramInt8)] = 0.0D;
      paramArrayOfDouble5[(i + 2 * paramInt1 - 1 + paramInt8)] = 0.0D;
      paramArrayOfDouble5[(i + 3 * paramInt1 - 1 + paramInt8)] = 0.0D;
      paramArrayOfDouble5[(i + 4 * paramInt1 - 1 + paramInt8)] = 0.0D;
      paramArrayOfDouble5[(i + 5 * paramInt1 - 1 + paramInt8)] = 0.0D;
      i += 1;
    }
    d2 = Util.log10(10.0D);
    i = paramintW1.val;
    for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
    {
      i3 = paramintW1.val;
      for (i18 = paramintW2.val - paramintW1.val + 1; i18 > 0; i18--)
      {
        d20 = paramArrayOfDouble2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)];
        d19 = paramArrayOfDouble1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)];
        if ((d19 != 0.0D ? 0 : 1) == 0) {
          d19 = Util.log10(Math.abs(d19)) / d2;
        }
        if ((d20 != 0.0D ? 0 : 1) == 0) {
          d20 = Util.log10(Math.abs(d20)) / d2;
        }
        paramArrayOfDouble5[(i + 4 * paramInt1 - 1 + paramInt8)] = (paramArrayOfDouble5[(i + 4 * paramInt1 - 1 + paramInt8)] - d19 - d20);
        paramArrayOfDouble5[(i3 + 5 * paramInt1 - 1 + paramInt8)] = (paramArrayOfDouble5[(i3 + 5 * paramInt1 - 1 + paramInt8)] - d19 - d20);
        i3 += 1;
      }
      i += 1;
    }
    d6 = 1.0D / (2 * i15);
    d7 = d6 * d6;
    d8 = 0.5D * d7;
    i16 = i15 + 2;
    d3 = 0.0D;
    i2 = 1;
    do
    {
      d12 = Ddot.ddot(i15, paramArrayOfDouble5, paramintW1.val + 4 * paramInt1 - 1 + paramInt8, 1, paramArrayOfDouble5, paramintW1.val + 4 * paramInt1 - 1 + paramInt8, 1) + Ddot.ddot(i15, paramArrayOfDouble5, paramintW1.val + 5 * paramInt1 - 1 + paramInt8, 1, paramArrayOfDouble5, paramintW1.val + 5 * paramInt1 - 1 + paramInt8, 1);
      d10 = 0.0D;
      d11 = 0.0D;
      i = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        d10 += paramArrayOfDouble5[(i + 4 * paramInt1 - 1 + paramInt8)];
        d11 += paramArrayOfDouble5[(i + 5 * paramInt1 - 1 + paramInt8)];
        i += 1;
      }
      d12 = d6 * d12 - d7 * (Math.pow(d10, 2) + Math.pow(d11, 2)) - d8 * Math.pow(d10 - d11, 2);
      if ((d12 != 0.0D ? 0 : 1) != 0) {
        break;
      }
      if ((i2 == 1 ? 0 : 1) != 0) {
        d3 = d12 / d13;
      }
      d18 = d8 * (d11 - 3.0D * d10);
      d21 = d8 * (d10 - 3.0D * d11);
      Dscal.dscal(i15, d3, paramArrayOfDouble5, paramintW1.val - 1 + paramInt8, 1);
      Dscal.dscal(i15, d3, paramArrayOfDouble5, paramintW1.val + paramInt1 - 1 + paramInt8, 1);
      Daxpy.daxpy(i15, d6, paramArrayOfDouble5, paramintW1.val + 4 * paramInt1 - 1 + paramInt8, 1, paramArrayOfDouble5, paramintW1.val + paramInt1 - 1 + paramInt8, 1);
      Daxpy.daxpy(i15, d6, paramArrayOfDouble5, paramintW1.val + 5 * paramInt1 - 1 + paramInt8, 1, paramArrayOfDouble5, paramintW1.val - 1 + paramInt8, 1);
      i = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        paramArrayOfDouble5[(i - 1 + paramInt8)] += d21;
        paramArrayOfDouble5[(i + paramInt1 - 1 + paramInt8)] += d18;
        i += 1;
      }
      i = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        i7 = 0;
        d17 = 0.0D;
        i3 = paramintW1.val;
        for (i18 = paramintW2.val - paramintW1.val + 1; i18 > 0; i18--)
        {
          if ((paramArrayOfDouble1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] != 0.0D ? 0 : 1) == 0)
          {
            i7 += 1;
            d17 += paramArrayOfDouble5[(i3 - 1 + paramInt8)];
          }
          if ((paramArrayOfDouble2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] != 0.0D ? 0 : 1) == 0)
          {
            i7 += 1;
            d17 += paramArrayOfDouble5[(i3 - 1 + paramInt8)];
          }
          i3 += 1;
        }
        paramArrayOfDouble5[(i + 2 * paramInt1 - 1 + paramInt8)] = (i7 * paramArrayOfDouble5[(i + paramInt1 - 1 + paramInt8)] + d17);
        i += 1;
      }
      i3 = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        i7 = 0;
        d17 = 0.0D;
        i = paramintW1.val;
        for (i18 = paramintW2.val - paramintW1.val + 1; i18 > 0; i18--)
        {
          if ((paramArrayOfDouble1[(i - 1 + (i3 - 1) * paramInt3 + paramInt2)] != 0.0D ? 0 : 1) == 0)
          {
            i7 += 1;
            d17 += paramArrayOfDouble5[(i + paramInt1 - 1 + paramInt8)];
          }
          if ((paramArrayOfDouble2[(i - 1 + (i3 - 1) * paramInt5 + paramInt4)] != 0.0D ? 0 : 1) == 0)
          {
            i7 += 1;
            d17 += paramArrayOfDouble5[(i + paramInt1 - 1 + paramInt8)];
          }
          i += 1;
        }
        paramArrayOfDouble5[(i3 + 3 * paramInt1 - 1 + paramInt8)] = (i7 * paramArrayOfDouble5[(i3 - 1 + paramInt8)] + d17);
        i3 += 1;
      }
      d17 = Ddot.ddot(i15, paramArrayOfDouble5, paramintW1.val + paramInt1 - 1 + paramInt8, 1, paramArrayOfDouble5, paramintW1.val + 2 * paramInt1 - 1 + paramInt8, 1) + Ddot.ddot(i15, paramArrayOfDouble5, paramintW1.val - 1 + paramInt8, 1, paramArrayOfDouble5, paramintW1.val + 3 * paramInt1 - 1 + paramInt8, 1);
      d1 = d12 / d17;
      d5 = 0.0D;
      i = paramintW1.val;
      for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
      {
        d9 = d1 * paramArrayOfDouble5[(i + paramInt1 - 1 + paramInt8)];
        if ((Math.abs(d9) <= d5 ? 0 : 1) != 0) {
          d5 = Math.abs(d9);
        }
        paramArrayOfDouble3[(i - 1 + paramInt6)] += d9;
        d9 = d1 * paramArrayOfDouble5[(i - 1 + paramInt8)];
        if ((Math.abs(d9) <= d5 ? 0 : 1) != 0) {
          d5 = Math.abs(d9);
        }
        paramArrayOfDouble4[(i - 1 + paramInt7)] += d9;
        i += 1;
      }
      if ((d5 >= 0.5D ? 0 : 1) != 0) {
        break;
      }
      Daxpy.daxpy(i15, -d1, paramArrayOfDouble5, paramintW1.val + 2 * paramInt1 - 1 + paramInt8, 1, paramArrayOfDouble5, paramintW1.val + 4 * paramInt1 - 1 + paramInt8, 1);
      Daxpy.daxpy(i15, -d1, paramArrayOfDouble5, paramintW1.val + 3 * paramInt1 - 1 + paramInt8, 1, paramArrayOfDouble5, paramintW1.val + 5 * paramInt1 - 1 + paramInt8, 1);
      d13 = d12;
      i2 += 1;
    } while ((i2 > i16 ? 0 : 1) != 0);
    d16 = Dlamch.dlamch("S");
    d15 = 1.0D / d16;
    i13 = (int)(Util.log10(d16) / d2 + 1.0D);
    i12 = (int)(Util.log10(d15) / d2);
    i = paramintW1.val;
    for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
    {
      i1 = Idamax.idamax(paramInt1 - paramintW1.val + 1, paramArrayOfDouble1, i - 1 + (paramintW1.val - 1) * paramInt3 + paramInt2, paramInt3);
      d14 = Math.abs(paramArrayOfDouble1[(i - 1 + (i1 + paramintW1.val - 1 - 1) * paramInt3 + paramInt2)]);
      i1 = Idamax.idamax(paramInt1 - paramintW1.val + 1, paramArrayOfDouble2, i - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5);
      d14 = Math.max(d14, Math.abs(paramArrayOfDouble2[(i - 1 + (i1 + paramintW1.val - 1 - 1) * paramInt5 + paramInt4)]));
      i11 = (int)(Util.log10(d14 + d16) / d2 + 1.0D);
      n = (int)(paramArrayOfDouble3[(i - 1 + paramInt6)] + Util.dsign(0.5D, paramArrayOfDouble3[(i - 1 + paramInt6)]));
      n = Util.min(Math.max(n, i13), i12, i12 - i11);
      paramArrayOfDouble3[(i - 1 + paramInt6)] = Math.pow(10.0D, n);
      j = Idamax.idamax(paramintW2.val, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt3 + paramInt2, 1);
      d4 = Math.abs(paramArrayOfDouble1[(j - 1 + (i - 1) * paramInt3 + paramInt2)]);
      j = Idamax.idamax(paramintW2.val, paramArrayOfDouble2, 1 - 1 + (i - 1) * paramInt5 + paramInt4, 1);
      d4 = Math.max(d4, Math.abs(paramArrayOfDouble2[(j - 1 + (i - 1) * paramInt5 + paramInt4)]));
      i9 = (int)(Util.log10(d4 + d16) / d2 + 1.0D);
      i4 = (int)(paramArrayOfDouble4[(i - 1 + paramInt7)] + Util.dsign(0.5D, paramArrayOfDouble4[(i - 1 + paramInt7)]));
      i4 = Util.min(Math.max(i4, i13), i12, i12 - i9);
      paramArrayOfDouble4[(i - 1 + paramInt7)] = Math.pow(10.0D, i4);
      i += 1;
    }
    i = paramintW1.val;
    for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
    {
      Dscal.dscal(paramInt1 - paramintW1.val + 1, paramArrayOfDouble3[(i - 1 + paramInt6)], paramArrayOfDouble1, i - 1 + (paramintW1.val - 1) * paramInt3 + paramInt2, paramInt3);
      Dscal.dscal(paramInt1 - paramintW1.val + 1, paramArrayOfDouble3[(i - 1 + paramInt6)], paramArrayOfDouble2, i - 1 + (paramintW1.val - 1) * paramInt5 + paramInt4, paramInt5);
      i += 1;
    }
    i3 = paramintW1.val;
    for (i17 = paramintW2.val - paramintW1.val + 1; i17 > 0; i17--)
    {
      Dscal.dscal(paramintW2.val, paramArrayOfDouble4[(i3 - 1 + paramInt7)], paramArrayOfDouble1, 1 - 1 + (i3 - 1) * paramInt3 + paramInt2, 1);
      Dscal.dscal(paramintW2.val, paramArrayOfDouble4[(i3 - 1 + paramInt7)], paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1);
      i3 += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dggbal.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */