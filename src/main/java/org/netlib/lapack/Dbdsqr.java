package org.netlib.lapack;

import org.netlib.blas.Drot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dbdsqr
{
  public static void dbdsqr(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, int paramInt12, double[] paramArrayOfDouble6, int paramInt13, intW paramintW)
  {
    boolean bool = false;
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    doubleW localdoubleW6 = new doubleW(0.0D);
    doubleW localdoubleW7 = new doubleW(0.0D);
    doubleW localdoubleW8 = new doubleW(0.0D);
    doubleW localdoubleW9 = new doubleW(0.0D);
    doubleW localdoubleW10 = new doubleW(0.0D);
    doubleW localdoubleW11 = new doubleW(0.0D);
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    doubleW localdoubleW12 = new doubleW(0.0D);
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "L");
    if ((((Lsame.lsame(paramString, "U") ^ true)) && ((bool ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt4 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else
    {
      if ((paramInt2 != 0 ? 0 : 1) != 0) {}
      if (((paramInt8 >= 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        if ((paramInt2 <= 0 ? 0 : 1) == 0) {}
      }
      if ((((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else if ((paramInt10 >= Math.max(1, paramInt3) ? 0 : 1) != 0)
      {
        paramintW.val = -11;
      }
      else
      {
        if ((paramInt4 != 0 ? 0 : 1) != 0) {}
        if (((paramInt12 >= 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          if ((paramInt4 <= 0 ? 0 : 1) == 0) {}
        }
        if ((((paramInt12 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -13;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DBDSQR", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) == 0)
    {
      if ((paramInt2 <= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
      i = (paramInt4 <= 0 ? 0 : 1) == 0 ? 0 : 1;
      if ((i ^ 0x1) != 0)
      {
        Dlasq1.dlasq1(paramInt1, paramArrayOfDouble1, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble6, paramInt13, paramintW);
        return;
      }
      i6 = paramInt1 - 1;
      i7 = i6 + i6;
      i8 = i7 + i6;
      k = 0;
      d3 = Dlamch.dlamch("Epsilon");
      d16 = Dlamch.dlamch("Safe minimum");
      if (bool)
      {
        j = 1;
        for (int i11 = paramInt1 - 1 - 1 + 1; i11 > 0; i11--)
        {
          Dlartg.dlartg(paramArrayOfDouble1[(j - 1 + paramInt5)], paramArrayOfDouble2[(j - 1 + paramInt6)], localdoubleW3, localdoubleW12, localdoubleW6);
          paramArrayOfDouble1[(j - 1 + paramInt5)] = localdoubleW6.val;
          paramArrayOfDouble2[(j - 1 + paramInt6)] = (localdoubleW12.val * paramArrayOfDouble1[(j + 1 - 1 + paramInt5)]);
          paramArrayOfDouble1[(j + 1 - 1 + paramInt5)] = (localdoubleW3.val * paramArrayOfDouble1[(j + 1 - 1 + paramInt5)]);
          paramArrayOfDouble6[(j - 1 + paramInt13)] = localdoubleW3.val;
          paramArrayOfDouble6[(i6 + j - 1 + paramInt13)] = localdoubleW12.val;
          j += 1;
        }
        if ((paramInt3 <= 0 ? 0 : 1) != 0) {
          Dlasr.dlasr("R", "V", "F", paramInt3, paramInt1, paramArrayOfDouble6, 1 - 1 + paramInt13, paramArrayOfDouble6, paramInt1 - 1 + paramInt13, paramArrayOfDouble4, paramInt9, paramInt10);
        }
        if ((paramInt4 <= 0 ? 0 : 1) != 0) {
          Dlasr.dlasr("L", "V", "F", paramInt1, paramInt4, paramArrayOfDouble6, 1 - 1 + paramInt13, paramArrayOfDouble6, paramInt1 - 1 + paramInt13, paramArrayOfDouble5, paramInt11, paramInt12);
        }
      }
      d15 = Math.max(10.0D, Math.min(100.0D, Math.pow(d3, -0.125D)));
      d14 = d15 * d3;
      d9 = 0.0D;
      j = 1;
      for (int i11 = paramInt1 - 1 + 1; i11 > 0; i11--)
      {
        d9 = Math.max(d9, Math.abs(paramArrayOfDouble1[(j - 1 + paramInt5)]));
        j += 1;
      }
      j = 1;
      for (int i11 = paramInt1 - 1 - 1 + 1; i11 > 0; i11--)
      {
        d9 = Math.max(d9, Math.abs(paramArrayOfDouble2[(j - 1 + paramInt6)]));
        j += 1;
      }
      d11 = 0.0D;
      if ((d14 < 0.0D ? 0 : 1) != 0)
      {
        d12 = Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt5)]);
        if ((d12 != 0.0D ? 0 : 1) == 0)
        {
          d7 = d12;
          j = 2;
          for (int i11 = paramInt1 - 2 + 1; i11 > 0; i11--)
          {
            d7 = Math.abs(paramArrayOfDouble1[(j - 1 + paramInt5)]) * (d7 / (d7 + Math.abs(paramArrayOfDouble2[(j - 1 - 1 + paramInt6)])));
            d12 = Math.min(d12, d7);
            if ((d12 != 0.0D ? 0 : 1) != 0) {
              break;
            }
            j += 1;
          }
        }
        d12 /= Math.sqrt(paramInt1);
        d13 = Math.max(d14 * d12, 6 * paramInt1 * paramInt1 * d16);
      }
      else
      {
        d13 = Math.max(Math.abs(d14) * d9, 6 * paramInt1 * paramInt1 * d16);
      }
      i5 = 6 * paramInt1 * paramInt1;
      n = 0;
      i9 = -1;
      i10 = -1;
      i4 = paramInt1;
      while ((i4 > 1 ? 0 : 1) == 0)
      {
        if ((n <= i5 ? 0 : 1) != 0) {
          paramintW.val = 0;
          j = 1;
          for (int i11 = paramInt1 - 1 - 1 + 1; i11 > 0; i11--)
          {
            if ((paramArrayOfDouble2[(j - 1 + paramInt6)] == 0.0D ? 0 : 1) != 0) {
              paramintW.val += 1;
            }
            j += 1;
          }
          return;
        }
        if ((d14 >= 0.0D ? 0 : 1) != 0) {}
        if (((Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt5)]) > d13 ? 0 : 1) != 0 ? 1 : 0) != 0) {
          paramArrayOfDouble1[(i4 - 1 + paramInt5)] = 0.0D;
        }
        d9 = Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt5)]);
        d10 = d9;
        i3 = 1;
        for (int i11 = i4 - 1 - 1 + 1; i11 > 0; i11--)
        {
          i2 = i4 - i3;
          d2 = Math.abs(paramArrayOfDouble1[(i2 - 1 + paramInt5)]);
          d1 = Math.abs(paramArrayOfDouble2[(i2 - 1 + paramInt6)]);
          if ((d14 >= 0.0D ? 0 : 1) != 0) {}
          if (((d2 > d13 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramArrayOfDouble1[(i2 - 1 + paramInt5)] = 0.0D;
          }
          if ((d1 > d13 ? 0 : 1) != 0) {
            break;
          }
          d10 = Math.min(d10, d2);
          d9 = Util.max(d9, d2, d1);
          i3 += 1;
        }
        i2 = 0;
        paramArrayOfDouble2[(i2 - 1 + paramInt6)] = 0.0D;
        if ((i2 != i4 - 1 ? 0 : 1) != 0)
        {
          i4 -= 1;
        }
        else
        {
          label1674:
          i2 += 1;
          if ((i2 != i4 - 1 ? 0 : 1) != 0)
          {
            Dlasv2.dlasv2(paramArrayOfDouble1[(i4 - 1 - 1 + paramInt5)], paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)], paramArrayOfDouble1[(i4 - 1 + paramInt5)], localdoubleW8, localdoubleW9, localdoubleW11, localdoubleW2, localdoubleW10, localdoubleW1);
            paramArrayOfDouble1[(i4 - 1 - 1 + paramInt5)] = localdoubleW9.val;
            paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)] = 0.0D;
            paramArrayOfDouble1[(i4 - 1 + paramInt5)] = localdoubleW8.val;
            if ((paramInt2 <= 0 ? 0 : 1) != 0) {
              Drot.drot(paramInt2, paramArrayOfDouble3, i4 - 1 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble3, i4 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, localdoubleW2.val, localdoubleW11.val);
            }
            if ((paramInt3 <= 0 ? 0 : 1) != 0) {
              Drot.drot(paramInt3, paramArrayOfDouble4, 1 - 1 + (i4 - 1 - 1) * paramInt10 + paramInt9, 1, paramArrayOfDouble4, 1 - 1 + (i4 - 1) * paramInt10 + paramInt9, 1, localdoubleW1.val, localdoubleW10.val);
            }
            if ((paramInt4 <= 0 ? 0 : 1) != 0) {
              Drot.drot(paramInt4, paramArrayOfDouble5, i4 - 1 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfDouble5, i4 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12, localdoubleW1.val, localdoubleW10.val);
            }
            i4 -= 2;
          }
          else
          {
            if ((i2 <= i10 ? 0 : 1) == 0) {}
            if (((i4 >= i9 ? 0 : 1) == 0 ? 0 : 1) != 0) {
              if ((Math.abs(paramArrayOfDouble1[(i2 - 1 + paramInt5)]) < Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt5)]) ? 0 : 1) != 0) {
                k = 1;
              } else {
                k = 2;
              }
            }
            if ((k != 1 ? 0 : 1) != 0)
            {
              if ((Math.abs(paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)]) > Math.abs(d14) * Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt5)]) ? 0 : 1) == 0) {
                if ((d14 >= 0.0D ? 0 : 1) == 0) {}
              }
              if ((((Math.abs(paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)]) > d13 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
              {
                paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)] = 0.0D;
                continue;
              }
              if ((d14 < 0.0D ? 0 : 1) != 0)
              {
                d7 = Math.abs(paramArrayOfDouble1[(i2 - 1 + paramInt5)]);
                d11 = d7;
                i3 = i2;
                for (int i11 = i4 - 1 - i2 + 1; i11 > 0; i11--)
                {
                  if ((Math.abs(paramArrayOfDouble2[(i3 - 1 + paramInt6)]) > d14 * d7 ? 0 : 1) != 0)
                  {
                    paramArrayOfDouble2[(i3 - 1 + paramInt6)] = 0.0D;
                    break;
                  }
                  d7 = Math.abs(paramArrayOfDouble1[(i3 + 1 - 1 + paramInt5)]) * (d7 / (d7 + Math.abs(paramArrayOfDouble2[(i3 - 1 + paramInt6)])));
                  d11 = Math.min(d11, d7);
                  i3 += 1;
                }
              }
            }
            else
            {
              if ((Math.abs(paramArrayOfDouble2[(i2 - 1 + paramInt6)]) > Math.abs(d14) * Math.abs(paramArrayOfDouble1[(i2 - 1 + paramInt5)]) ? 0 : 1) == 0) {
                if ((d14 >= 0.0D ? 0 : 1) == 0) {}
              }
              if ((((Math.abs(paramArrayOfDouble2[(i2 - 1 + paramInt6)]) > d13 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
              {
                paramArrayOfDouble2[(i2 - 1 + paramInt6)] = 0.0D;
                continue;
              }
              if ((d14 < 0.0D ? 0 : 1) != 0)
              {
                d7 = Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt5)]);
                d11 = d7;
                i3 = i4 - 1;
                for (int i11 = (i2 - (i4 - 1) + -1) / -1; i11 > 0; i11--)
                {
                  if ((Math.abs(paramArrayOfDouble2[(i3 - 1 + paramInt6)]) > d14 * d7 ? 0 : 1) != 0)
                  {
                    paramArrayOfDouble2[(i3 - 1 + paramInt6)] = 0.0D;
                    break;
                  }
                  d7 = Math.abs(paramArrayOfDouble1[(i3 - 1 + paramInt5)]) * (d7 / (d7 + Math.abs(paramArrayOfDouble2[(i3 - 1 + paramInt6)])));
                  d11 = Math.min(d11, d7);
                  i3 += -1;
                }
              }
            }
            i9 = i2;
            i10 = i4;
            if ((d14 < 0.0D ? 0 : 1) != 0) {}
            if (((paramInt1 * d14 * (d11 / d9) > Math.max(d3, 0.01D * d14) ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              localdoubleW7.val = 0.0D;
            }
            else
            {
              if ((k != 1 ? 0 : 1) != 0)
              {
                d8 = Math.abs(paramArrayOfDouble1[(i2 - 1 + paramInt5)]);
                Dlas2.dlas2(paramArrayOfDouble1[(i4 - 1 - 1 + paramInt5)], paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)], paramArrayOfDouble1[(i4 - 1 + paramInt5)], localdoubleW7, localdoubleW6);
              }
              else
              {
                d8 = Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt5)]);
                Dlas2.dlas2(paramArrayOfDouble1[(i2 - 1 + paramInt5)], paramArrayOfDouble2[(i2 - 1 + paramInt6)], paramArrayOfDouble1[(i2 + 1 - 1 + paramInt5)], localdoubleW7, localdoubleW6);
              }
              if ((d8 <= 0.0D ? 0 : 1) != 0) {
                if ((Math.pow(localdoubleW7.val / d8, 2) >= d3 ? 0 : 1) != 0) {
                  localdoubleW7.val = 0.0D;
                }
              }
            }
            n = n + i4 - i2;
            if ((localdoubleW7.val != 0.0D ? 0 : 1) != 0)
            {
              if ((k != 1 ? 0 : 1) != 0)
              {
                localdoubleW3.val = 1.0D;
                localdoubleW4.val = 1.0D;
                j = i2;
                for (int i11 = i4 - 1 - i2 + 1; i11 > 0; i11--)
                {
                  Dlartg.dlartg(paramArrayOfDouble1[(j - 1 + paramInt5)] * localdoubleW3.val, paramArrayOfDouble2[(j - 1 + paramInt6)], localdoubleW3, localdoubleW12, localdoubleW6);
                  if ((j <= i2 ? 0 : 1) != 0) {
                    paramArrayOfDouble2[(j - 1 - 1 + paramInt6)] = (localdoubleW5.val * localdoubleW6.val);
                  }
                  dlartg_adapter(localdoubleW4.val * localdoubleW6.val, paramArrayOfDouble1[(j + 1 - 1 + paramInt5)] * localdoubleW12.val, localdoubleW4, localdoubleW5, paramArrayOfDouble1, j - 1 + paramInt5);
                  paramArrayOfDouble6[(j - i2 + 1 - 1 + paramInt13)] = localdoubleW3.val;
                  paramArrayOfDouble6[(j - i2 + 1 + i6 - 1 + paramInt13)] = localdoubleW12.val;
                  paramArrayOfDouble6[(j - i2 + 1 + i7 - 1 + paramInt13)] = localdoubleW4.val;
                  paramArrayOfDouble6[(j - i2 + 1 + i8 - 1 + paramInt13)] = localdoubleW5.val;
                  j += 1;
                }
                d6 = paramArrayOfDouble1[(i4 - 1 + paramInt5)] * localdoubleW3.val;
                paramArrayOfDouble1[(i4 - 1 + paramInt5)] = (d6 * localdoubleW4.val);
                paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)] = (d6 * localdoubleW5.val);
                if ((paramInt2 <= 0 ? 0 : 1) != 0) {
                  Dlasr.dlasr("L", "V", "F", i4 - i2 + 1, paramInt2, paramArrayOfDouble6, 1 - 1 + paramInt13, paramArrayOfDouble6, paramInt1 - 1 + paramInt13, paramArrayOfDouble3, i2 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
                }
                if ((paramInt3 <= 0 ? 0 : 1) != 0) {
                  Dlasr.dlasr("R", "V", "F", paramInt3, i4 - i2 + 1, paramArrayOfDouble6, i7 + 1 - 1 + paramInt13, paramArrayOfDouble6, i8 + 1 - 1 + paramInt13, paramArrayOfDouble4, 1 - 1 + (i2 - 1) * paramInt10 + paramInt9, paramInt10);
                }
                if ((paramInt4 <= 0 ? 0 : 1) != 0) {
                  Dlasr.dlasr("L", "V", "F", i4 - i2 + 1, paramInt4, paramArrayOfDouble6, i7 + 1 - 1 + paramInt13, paramArrayOfDouble6, i8 + 1 - 1 + paramInt13, paramArrayOfDouble5, i2 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12);
                }
                if ((Math.abs(paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)]) > d13 ? 0 : 1) != 0) {
                  paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)] = 0.0D;
                }
              }
              else
              {
                localdoubleW3.val = 1.0D;
                localdoubleW4.val = 1.0D;
                j = i4;
                for (int i11 = (i2 + 1 - i4 + -1) / -1; i11 > 0; i11--)
                {
                  Dlartg.dlartg(paramArrayOfDouble1[(j - 1 + paramInt5)] * localdoubleW3.val, paramArrayOfDouble2[(j - 1 - 1 + paramInt6)], localdoubleW3, localdoubleW12, localdoubleW6);
                  if ((j >= i4 ? 0 : 1) != 0) {
                    paramArrayOfDouble2[(j - 1 + paramInt6)] = (localdoubleW5.val * localdoubleW6.val);
                  }
                  dlartg_adapter(localdoubleW4.val * localdoubleW6.val, paramArrayOfDouble1[(j - 1 - 1 + paramInt5)] * localdoubleW12.val, localdoubleW4, localdoubleW5, paramArrayOfDouble1, j - 1 + paramInt5);
                  paramArrayOfDouble6[(j - i2 - 1 + paramInt13)] = localdoubleW3.val;
                  paramArrayOfDouble6[(j - i2 + i6 - 1 + paramInt13)] = (-localdoubleW12.val);
                  paramArrayOfDouble6[(j - i2 + i7 - 1 + paramInt13)] = localdoubleW4.val;
                  paramArrayOfDouble6[(j - i2 + i8 - 1 + paramInt13)] = (-localdoubleW5.val);
                  j += -1;
                }
                d6 = paramArrayOfDouble1[(i2 - 1 + paramInt5)] * localdoubleW3.val;
                paramArrayOfDouble1[(i2 - 1 + paramInt5)] = (d6 * localdoubleW4.val);
                paramArrayOfDouble2[(i2 - 1 + paramInt6)] = (d6 * localdoubleW5.val);
                if ((paramInt2 <= 0 ? 0 : 1) != 0) {
                  Dlasr.dlasr("L", "V", "B", i4 - i2 + 1, paramInt2, paramArrayOfDouble6, i7 + 1 - 1 + paramInt13, paramArrayOfDouble6, i8 + 1 - 1 + paramInt13, paramArrayOfDouble3, i2 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
                }
                if ((paramInt3 <= 0 ? 0 : 1) != 0) {
                  Dlasr.dlasr("R", "V", "B", paramInt3, i4 - i2 + 1, paramArrayOfDouble6, 1 - 1 + paramInt13, paramArrayOfDouble6, paramInt1 - 1 + paramInt13, paramArrayOfDouble4, 1 - 1 + (i2 - 1) * paramInt10 + paramInt9, paramInt10);
                }
                if ((paramInt4 <= 0 ? 0 : 1) != 0) {
                  Dlasr.dlasr("L", "V", "B", i4 - i2 + 1, paramInt4, paramArrayOfDouble6, 1 - 1 + paramInt13, paramArrayOfDouble6, paramInt1 - 1 + paramInt13, paramArrayOfDouble5, i2 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12);
                }
                if ((Math.abs(paramArrayOfDouble2[(i2 - 1 + paramInt6)]) > d13 ? 0 : 1) != 0) {
                  paramArrayOfDouble2[(i2 - 1 + paramInt6)] = 0.0D;
                }
              }
            }
            else if ((k != 1 ? 0 : 1) != 0)
            {
              d4 = (Math.abs(paramArrayOfDouble1[(i2 - 1 + paramInt5)]) - localdoubleW7.val) * (Util.dsign(1.0D, paramArrayOfDouble1[(i2 - 1 + paramInt5)]) + localdoubleW7.val / paramArrayOfDouble1[(i2 - 1 + paramInt5)]);
              d5 = paramArrayOfDouble2[(i2 - 1 + paramInt6)];
              j = i2;
              for (int i11 = i4 - 1 - i2 + 1; i11 > 0; i11--)
              {
                Dlartg.dlartg(d4, d5, localdoubleW2, localdoubleW11, localdoubleW6);
                if ((j <= i2 ? 0 : 1) != 0) {
                  paramArrayOfDouble2[(j - 1 - 1 + paramInt6)] = localdoubleW6.val;
                }
                d4 = localdoubleW2.val * paramArrayOfDouble1[(j - 1 + paramInt5)] + localdoubleW11.val * paramArrayOfDouble2[(j - 1 + paramInt6)];
                paramArrayOfDouble2[(j - 1 + paramInt6)] = (localdoubleW2.val * paramArrayOfDouble2[(j - 1 + paramInt6)] - localdoubleW11.val * paramArrayOfDouble1[(j - 1 + paramInt5)]);
                d5 = localdoubleW11.val * paramArrayOfDouble1[(j + 1 - 1 + paramInt5)];
                paramArrayOfDouble1[(j + 1 - 1 + paramInt5)] = (localdoubleW2.val * paramArrayOfDouble1[(j + 1 - 1 + paramInt5)]);
                Dlartg.dlartg(d4, d5, localdoubleW1, localdoubleW10, localdoubleW6);
                paramArrayOfDouble1[(j - 1 + paramInt5)] = localdoubleW6.val;
                d4 = localdoubleW1.val * paramArrayOfDouble2[(j - 1 + paramInt6)] + localdoubleW10.val * paramArrayOfDouble1[(j + 1 - 1 + paramInt5)];
                paramArrayOfDouble1[(j + 1 - 1 + paramInt5)] = (localdoubleW1.val * paramArrayOfDouble1[(j + 1 - 1 + paramInt5)] - localdoubleW10.val * paramArrayOfDouble2[(j - 1 + paramInt6)]);
                if ((j >= i4 - 1 ? 0 : 1) != 0)
                {
                  d5 = localdoubleW10.val * paramArrayOfDouble2[(j + 1 - 1 + paramInt6)];
                  paramArrayOfDouble2[(j + 1 - 1 + paramInt6)] = (localdoubleW1.val * paramArrayOfDouble2[(j + 1 - 1 + paramInt6)]);
                }
                paramArrayOfDouble6[(j - i2 + 1 - 1 + paramInt13)] = localdoubleW2.val;
                paramArrayOfDouble6[(j - i2 + 1 + i6 - 1 + paramInt13)] = localdoubleW11.val;
                paramArrayOfDouble6[(j - i2 + 1 + i7 - 1 + paramInt13)] = localdoubleW1.val;
                paramArrayOfDouble6[(j - i2 + 1 + i8 - 1 + paramInt13)] = localdoubleW10.val;
                j += 1;
              }
              paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)] = d4;
              if ((paramInt2 <= 0 ? 0 : 1) != 0) {
                Dlasr.dlasr("L", "V", "F", i4 - i2 + 1, paramInt2, paramArrayOfDouble6, 1 - 1 + paramInt13, paramArrayOfDouble6, paramInt1 - 1 + paramInt13, paramArrayOfDouble3, i2 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
              }
              if ((paramInt3 <= 0 ? 0 : 1) != 0) {
                Dlasr.dlasr("R", "V", "F", paramInt3, i4 - i2 + 1, paramArrayOfDouble6, i7 + 1 - 1 + paramInt13, paramArrayOfDouble6, i8 + 1 - 1 + paramInt13, paramArrayOfDouble4, 1 - 1 + (i2 - 1) * paramInt10 + paramInt9, paramInt10);
              }
              if ((paramInt4 <= 0 ? 0 : 1) != 0) {
                Dlasr.dlasr("L", "V", "F", i4 - i2 + 1, paramInt4, paramArrayOfDouble6, i7 + 1 - 1 + paramInt13, paramArrayOfDouble6, i8 + 1 - 1 + paramInt13, paramArrayOfDouble5, i2 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12);
              }
              if ((Math.abs(paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)]) > d13 ? 0 : 1) != 0) {
                paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)] = 0.0D;
              }
            }
            else
            {
              d4 = (Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt5)]) - localdoubleW7.val) * (Util.dsign(1.0D, paramArrayOfDouble1[(i4 - 1 + paramInt5)]) + localdoubleW7.val / paramArrayOfDouble1[(i4 - 1 + paramInt5)]);
              d5 = paramArrayOfDouble2[(i4 - 1 - 1 + paramInt6)];
              j = i4;
              for (int i11 = (i2 + 1 - i4 + -1) / -1; i11 > 0; i11--)
              {
                Dlartg.dlartg(d4, d5, localdoubleW2, localdoubleW11, localdoubleW6);
                if ((j >= i4 ? 0 : 1) != 0) {
                  paramArrayOfDouble2[(j - 1 + paramInt6)] = localdoubleW6.val;
                }
                d4 = localdoubleW2.val * paramArrayOfDouble1[(j - 1 + paramInt5)] + localdoubleW11.val * paramArrayOfDouble2[(j - 1 - 1 + paramInt6)];
                paramArrayOfDouble2[(j - 1 - 1 + paramInt6)] = (localdoubleW2.val * paramArrayOfDouble2[(j - 1 - 1 + paramInt6)] - localdoubleW11.val * paramArrayOfDouble1[(j - 1 + paramInt5)]);
                d5 = localdoubleW11.val * paramArrayOfDouble1[(j - 1 - 1 + paramInt5)];
                paramArrayOfDouble1[(j - 1 - 1 + paramInt5)] = (localdoubleW2.val * paramArrayOfDouble1[(j - 1 - 1 + paramInt5)]);
                Dlartg.dlartg(d4, d5, localdoubleW1, localdoubleW10, localdoubleW6);
                paramArrayOfDouble1[(j - 1 + paramInt5)] = localdoubleW6.val;
                d4 = localdoubleW1.val * paramArrayOfDouble2[(j - 1 - 1 + paramInt6)] + localdoubleW10.val * paramArrayOfDouble1[(j - 1 - 1 + paramInt5)];
                paramArrayOfDouble1[(j - 1 - 1 + paramInt5)] = (localdoubleW1.val * paramArrayOfDouble1[(j - 1 - 1 + paramInt5)] - localdoubleW10.val * paramArrayOfDouble2[(j - 1 - 1 + paramInt6)]);
                if ((j <= i2 + 1 ? 0 : 1) != 0)
                {
                  d5 = localdoubleW10.val * paramArrayOfDouble2[(j - 2 - 1 + paramInt6)];
                  paramArrayOfDouble2[(j - 2 - 1 + paramInt6)] = (localdoubleW1.val * paramArrayOfDouble2[(j - 2 - 1 + paramInt6)]);
                }
                paramArrayOfDouble6[(j - i2 - 1 + paramInt13)] = localdoubleW2.val;
                paramArrayOfDouble6[(j - i2 + i6 - 1 + paramInt13)] = (-localdoubleW11.val);
                paramArrayOfDouble6[(j - i2 + i7 - 1 + paramInt13)] = localdoubleW1.val;
                paramArrayOfDouble6[(j - i2 + i8 - 1 + paramInt13)] = (-localdoubleW10.val);
                j += -1;
              }
              paramArrayOfDouble2[(i2 - 1 + paramInt6)] = d4;
              if ((Math.abs(paramArrayOfDouble2[(i2 - 1 + paramInt6)]) > d13 ? 0 : 1) != 0) {
                paramArrayOfDouble2[(i2 - 1 + paramInt6)] = 0.0D;
              }
              if ((paramInt2 <= 0 ? 0 : 1) != 0) {
                Dlasr.dlasr("L", "V", "B", i4 - i2 + 1, paramInt2, paramArrayOfDouble6, i7 + 1 - 1 + paramInt13, paramArrayOfDouble6, i8 + 1 - 1 + paramInt13, paramArrayOfDouble3, i2 - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
              }
              if ((paramInt3 <= 0 ? 0 : 1) != 0) {
                Dlasr.dlasr("R", "V", "B", paramInt3, i4 - i2 + 1, paramArrayOfDouble6, 1 - 1 + paramInt13, paramArrayOfDouble6, paramInt1 - 1 + paramInt13, paramArrayOfDouble4, 1 - 1 + (i2 - 1) * paramInt10 + paramInt9, paramInt10);
              }
              if ((paramInt4 <= 0 ? 0 : 1) != 0) {
                Dlasr.dlasr("L", "V", "B", i4 - i2 + 1, paramInt4, paramArrayOfDouble6, 1 - 1 + paramInt13, paramArrayOfDouble6, paramInt1 - 1 + paramInt13, paramArrayOfDouble5, i2 - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12);
              }
            }
          }
        }
      }
    }
    j = 1;
    for (int i11 = paramInt1 - 1 + 1; i11 > 0; i11--)
    {
      if ((paramArrayOfDouble1[(j - 1 + paramInt5)] >= 0.0D ? 0 : 1) != 0)
      {
        paramArrayOfDouble1[(j - 1 + paramInt5)] = (-paramArrayOfDouble1[(j - 1 + paramInt5)]);
        if ((paramInt2 <= 0 ? 0 : 1) != 0) {
          Dscal.dscal(paramInt2, -1.0D, paramArrayOfDouble3, j - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        }
      }
      j += 1;
    }
    j = 1;
    for (int i11 = paramInt1 - 1 - 1 + 1; i11 > 0; i11--)
    {
      m = 1;
      d10 = paramArrayOfDouble1[(1 - 1 + paramInt5)];
      i1 = 2;
      for (int i12 = paramInt1 + 1 - j - 2 + 1; i12 > 0; i12--)
      {
        if ((paramArrayOfDouble1[(i1 - 1 + paramInt5)] > d10 ? 0 : 1) != 0)
        {
          m = i1;
          d10 = paramArrayOfDouble1[(i1 - 1 + paramInt5)];
        }
        i1 += 1;
      }
      if ((m == paramInt1 + 1 - j ? 0 : 1) != 0)
      {
        paramArrayOfDouble1[(m - 1 + paramInt5)] = paramArrayOfDouble1[(paramInt1 + 1 - j - 1 + paramInt5)];
        paramArrayOfDouble1[(paramInt1 + 1 - j - 1 + paramInt5)] = d10;
        if ((paramInt2 <= 0 ? 0 : 1) != 0) {
          Dswap.dswap(paramInt2, paramArrayOfDouble3, m - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble3, paramInt1 + 1 - j - 1 + (1 - 1) * paramInt8 + paramInt7, paramInt8);
        }
        if ((paramInt3 <= 0 ? 0 : 1) != 0) {
          Dswap.dswap(paramInt3, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt10 + paramInt9, 1, paramArrayOfDouble4, 1 - 1 + (paramInt1 + 1 - j - 1) * paramInt10 + paramInt9, 1);
        }
        if ((paramInt4 <= 0 ? 0 : 1) != 0) {
          Dswap.dswap(paramInt4, paramArrayOfDouble5, m - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12, paramArrayOfDouble5, paramInt1 + 1 - j - 1 + (1 - 1) * paramInt12 + paramInt11, paramInt12);
        }
      }
      j += 1;
    }
    return;

  }
  
  private static void dlartg_adapter(double paramDouble1, double paramDouble2, doubleW paramdoubleW1, doubleW paramdoubleW2, double[] paramArrayOfDouble, int paramInt)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble[paramInt]);
    Dlartg.dlartg(paramDouble1, paramDouble2, paramdoubleW1, paramdoubleW2, localdoubleW);
    paramArrayOfDouble[paramInt] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dbdsqr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */