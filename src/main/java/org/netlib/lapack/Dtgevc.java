package org.netlib.lapack;

import org.netlib.blas.Dgemv;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtgevc
{
  public static void dtgevc(String paramString1, String paramString2, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, int paramInt11, intW paramintW1, double[] paramArrayOfDouble5, int paramInt12, intW paramintW2)
  {
    ;
    ;
    ;
    ;
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
    intW localintW1 = new intW(0);
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    int i21 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
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
    doubleW localdoubleW5 = new doubleW(0.0D);
    double d17 = 0.0D;
    double d18 = 0.0D;
    doubleW localdoubleW6 = new doubleW(0.0D);
    double d19 = 0.0D;
    doubleW localdoubleW7 = new doubleW(0.0D);
    doubleW localdoubleW8 = new doubleW(0.0D);
    double d20 = 0.0D;
    double d21 = 0.0D;
    double d22 = 0.0D;
    double d23 = 0.0D;
    double d24 = 0.0D;
    double[] arrayOfDouble1 = new double[2];
    double[] arrayOfDouble2 = new double[2 * 2];
    double[] arrayOfDouble3 = new double[2 * 2];
    double[] arrayOfDouble4 = new double[2 * 2];
    if (Lsame.lsame(paramString2, "A"))
    {
      i11 = 1;
      n = 1;
      i1 = 0;
    }
    else if (Lsame.lsame(paramString2, "S"))
    {
      i11 = 2;
      n = 0;
      i1 = 0;
    }
    else if (Lsame.lsame(paramString2, "B"))
    {
      i11 = 3;
      n = 1;
      i1 = 1;
    }
    else
    {
      i11 = -1;
      n = 1;
    }
    if (Lsame.lsame(paramString1, "R"))
    {
      i13 = 1;
      i = 0;
      j = 1;
    }
    else if (Lsame.lsame(paramString1, "L"))
    {
      i13 = 2;
      i = 1;
      j = 0;
    }
    else if (Lsame.lsame(paramString1, "B"))
    {
      i13 = 3;
      i = 1;
      j = 1;
    }
    else
    {
      i13 = -1;
    }
    paramintW2.val = 0;
    if ((i13 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -1;
    } else if ((i11 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -4;
    } else if ((paramInt4 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW2.val = -6;
    } else if ((paramInt6 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
      paramintW2.val = -8;
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTGEVC", -paramintW2.val);
      return;
    }
    if ((n ^ 0x1) != 0)
    {
      i12 = 0;
      i4 = 0;
      i14 = 1;
      for (i22 = paramInt2 - 1 + 1; i22 > 0; i22--)
      {
        if (i4 != 0)
        {
          i4 = 0;
        }
        else
        {
          if ((i14 >= paramInt2 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(i14 + 1 - 1 + (i14 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0) {
              i4 = 1;
            }
          }
          if (i4 != 0)
          {
            if (((paramArrayOfBoolean[(i14 - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(i14 + 1 - 1 + paramInt1)] == 0) ? 0 : 1) != 0) {
              i12 += 2;
            }
          }
          else if (paramArrayOfBoolean[(i14 - 1 + paramInt1)] != 0) {
            i12 += 1;
          }
        }
        i14 += 1;
      }
    }
    else
    {
      i12 = paramInt2;
    }
    m = 0;
    i2 = 0;
    i14 = 1;
    for (int i22 = paramInt2 - 1 - 1 + 1; i22 > 0; i22--)
    {
      if ((paramArrayOfDouble1[(i14 + 1 - 1 + (i14 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
      {
        if ((paramArrayOfDouble2[(i14 - 1 + (i14 - 1) * paramInt6 + paramInt5)] != 0.0D ? 0 : 1) == 0) {}
        if (((paramArrayOfDouble2[(i14 + 1 - 1 + (i14 + 1 - 1) * paramInt6 + paramInt5)] != 0.0D ? 0 : 1) == 0 ? 0 : 1) == 0) {}
        if (((paramArrayOfDouble2[(i14 - 1 + (i14 + 1 - 1) * paramInt6 + paramInt5)] == 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
          i2 = 1;
        }
        if ((i14 >= paramInt2 - 1 ? 0 : 1) != 0) {
          if ((paramArrayOfDouble1[(i14 + 2 - 1 + (i14 + 1 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0) {
            m = 1;
          }
        }
      }
      i14 += 1;
    }
    if (m != 0)
    {
      paramintW2.val = -5;
    }
    else if (i2 != 0)
    {
      paramintW2.val = -7;
    }
    else
    {
      if (i != 0) {}
      if (((paramInt8 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
      if (((paramInt8 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW2.val = -10;
      }
      else
      {
        if (j != 0) {}
        if (((paramInt10 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
        if (((paramInt10 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW2.val = -12;
        } else if ((paramInt11 >= i12 ? 0 : 1) != 0) {
          paramintW2.val = -13;
        }
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTGEVC", -paramintW2.val);
      return;
    }
    paramintW1.val = i12;
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    localdoubleW5.val = Dlamch.dlamch("Safe minimum");
    localdoubleW4.val = (1.0D / localdoubleW5.val);
    Dlabad.dlabad(localdoubleW5, localdoubleW4);
    d22 = Dlamch.dlamch("Epsilon") * Dlamch.dlamch("Base");
    d19 = localdoubleW5.val * paramInt2 / d22;
    localdoubleW4.val = (1.0D / d19);
    d5 = 1.0D / (localdoubleW5.val * paramInt2);
    d2 = Math.abs(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
    if ((paramInt2 <= 1 ? 0 : 1) != 0) {
      d2 += Math.abs(paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt4 + paramInt3)]);
    }
    d6 = Math.abs(paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt6 + paramInt5)]);
    paramArrayOfDouble5[(1 - 1 + paramInt12)] = 0.0D;
    paramArrayOfDouble5[(paramInt2 + 1 - 1 + paramInt12)] = 0.0D;
    i14 = 2;
    int i23;
    for (i22 = paramInt2 - 2 + 1; i22 > 0; i22--)
    {
      localdoubleW7.val = 0.0D;
      localdoubleW8.val = 0.0D;
      if ((paramArrayOfDouble1[(i14 - 1 + (i14 - 1 - 1) * paramInt4 + paramInt3)] != 0.0D ? 0 : 1) != 0) {
        i10 = i14 - 1;
      } else {
        i10 = i14 - 2;
      }
      i7 = 1;
      i23 = i10 - 1 + 1;
      while (i23 > 0)
      {
        localdoubleW7.val += Math.abs(paramArrayOfDouble1[(i7 - 1 + (i14 - 1) * paramInt4 + paramInt3)]);
        localdoubleW8.val += Math.abs(paramArrayOfDouble2[(i7 - 1 + (i14 - 1) * paramInt6 + paramInt5)]);
        i7 += 1;
        ???--;
      }
      paramArrayOfDouble5[(i14 - 1 + paramInt12)] = localdoubleW7.val;
      paramArrayOfDouble5[(paramInt2 + i14 - 1 + paramInt12)] = localdoubleW8.val;
      i7 = i10 + 1;
      i23 = Math.min(i14 + 1, paramInt2) - (i10 + 1) + 1;
      while (i23 > 0)
      {
        localdoubleW7.val += Math.abs(paramArrayOfDouble1[(i7 - 1 + (i14 - 1) * paramInt4 + paramInt3)]);
        localdoubleW8.val += Math.abs(paramArrayOfDouble2[(i7 - 1 + (i14 - 1) * paramInt6 + paramInt5)]);
        i7 += 1;
        ???--;
      }
      d2 = Math.max(d2, localdoubleW7.val);
      d6 = Math.max(d6, localdoubleW8.val);
      i14 += 1;
    }
    d3 = 1.0D / Math.max(d2, localdoubleW5.val);
    d7 = 1.0D / Math.max(d6, localdoubleW5.val);
    int i24;
    int i25;
    if (i != 0)
    {
      i9 = 0;
      i4 = 0;
      i17 = 1;
      for (i22 = paramInt2 - 1 + 1; i22 > 0; i22--)
      {
        if (i4 != 0)
        {
          i4 = 0;
        }
        else
        {
          i21 = 1;
          if ((i17 >= paramInt2 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(i17 + 1 - 1 + (i17 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              i4 = 1;
              i21 = 2;
            }
          }
          if (n != 0) {
            i3 = 1;
          } else if (i4 != 0) {
            i3 = (paramArrayOfBoolean[(i17 - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(i17 + 1 - 1 + paramInt1)] == 0) ? 0 : 1;
          } else {
            i3 = paramArrayOfBoolean[(i17 - 1 + paramInt1)];
          }
          if ((i3 ^ 0x1) == 0)
          {
            if ((i4 ^ 0x1) != 0)
            {
              if ((Math.abs(paramArrayOfDouble1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)]) > localdoubleW5.val ? 0 : 1) != 0) {}
              if (((Math.abs(paramArrayOfDouble2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]) > localdoubleW5.val ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i9 += 1;
                i18 = 1;
                i23 = paramInt2 - 1 + 1;
                while (i23 > 0)
                {
                  paramArrayOfDouble3[(i18 - 1 + (i9 - 1) * paramInt8 + paramInt7)] = 0.0D;
                  i18 += 1;
                  ???--;
                }
                paramArrayOfDouble3[(i9 - 1 + (i9 - 1) * paramInt8 + paramInt7)] = 1.0D;
                break label5278;
              }
            }
            i18 = 1;
            i23 = i21 * paramInt2 - 1 + 1;
            while (i23 > 0)
            {
              paramArrayOfDouble5[(2 * paramInt2 + i18 - 1 + paramInt12)] = 0.0D;
              i18 += 1;
              ???--;
            }
            if ((i4 ^ 0x1) != 0)
            {
              localdoubleW7.val = (1.0D / Util.max(Math.abs(paramArrayOfDouble1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)]) * d3, Math.abs(paramArrayOfDouble2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]) * d7, localdoubleW5.val));
              d17 = localdoubleW7.val * paramArrayOfDouble1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)] * d3;
              d18 = localdoubleW7.val * paramArrayOfDouble2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)] * d7;
              localdoubleW1.val = (d18 * d3);
              localdoubleW3.val = (d17 * d7);
              localdoubleW2.val = 0.0D;
              localdoubleW6.val = 1.0D;
              if ((Math.abs(d18) < localdoubleW5.val ? 0 : 1) != 0) {}
              i5 = (Math.abs(localdoubleW1.val) >= d19 ? 0 : 1) != 0 ? 1 : 0;
              if ((Math.abs(d17) < localdoubleW5.val ? 0 : 1) != 0) {}
              i6 = (Math.abs(localdoubleW3.val) >= d19 ? 0 : 1) != 0 ? 1 : 0;
              if (i5 != 0) {
                localdoubleW6.val = (d19 / Math.abs(d18) * Math.min(d2, localdoubleW4.val));
              }
              if (i6 != 0) {
                localdoubleW6.val = Math.max(localdoubleW6.val, d19 / Math.abs(d17) * Math.min(d6, localdoubleW4.val));
              }
              if (((i5 == 0) && (i6 == 0) ? 0 : 1) != 0)
              {
                localdoubleW6.val = Math.min(localdoubleW6.val, 1.0D / (localdoubleW5.val * Util.max(1.0D, Math.abs(localdoubleW1.val), Math.abs(localdoubleW3.val))));
                if (i5 != 0) {
                  localdoubleW1.val = (d3 * (localdoubleW6.val * d18));
                } else {
                  localdoubleW6.val *= localdoubleW1.val;
                }
                if (i6 != 0) {
                  localdoubleW3.val = (d7 * (localdoubleW6.val * d17));
                } else {
                  localdoubleW6.val *= localdoubleW3.val;
                }
              }
              d1 = Math.abs(localdoubleW1.val);
              d4 = Math.abs(localdoubleW3.val);
              paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)] = 1.0D;
              d23 = 1.0D;
            }
            else
            {
              Dlag2.dlag2(paramArrayOfDouble1, i17 - 1 + (i17 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i17 - 1 + (i17 - 1) * paramInt6 + paramInt5, paramInt6, localdoubleW5.val * 100.0D, localdoubleW1, localdoubleW7, localdoubleW3, localdoubleW8, localdoubleW2);
              localdoubleW2.val = (-localdoubleW2.val);
              if ((localdoubleW2.val != 0.0D ? 0 : 1) != 0)
              {
                paramintW2.val = i17;
                return;
              }
              d1 = Math.abs(localdoubleW1.val);
              d4 = Math.abs(localdoubleW3.val) + Math.abs(localdoubleW2.val);
              localdoubleW6.val = 1.0D;
              if ((d1 * d22 >= localdoubleW5.val ? 0 : 1) != 0) {}
              if (((d1 < localdoubleW5.val ? 0 : 1) != 0 ? 1 : 0) != 0) {
                localdoubleW6.val = (localdoubleW5.val / d22 / d1);
              }
              if ((d4 * d22 >= localdoubleW5.val ? 0 : 1) != 0) {}
              if (((d4 < localdoubleW5.val ? 0 : 1) != 0 ? 1 : 0) != 0) {
                localdoubleW6.val = Math.max(localdoubleW6.val, localdoubleW5.val / d22 / d4);
              }
              if ((localdoubleW5.val * d1 <= d3 ? 0 : 1) != 0) {
                localdoubleW6.val = (d3 / (localdoubleW5.val * d1));
              }
              if ((localdoubleW5.val * d4 <= d7 ? 0 : 1) != 0) {
                localdoubleW6.val = Math.min(localdoubleW6.val, d7 / (localdoubleW5.val * d4));
              }
              if ((localdoubleW6.val == 1.0D ? 0 : 1) != 0)
              {
                localdoubleW6.val *= localdoubleW1.val;
                d1 = Math.abs(localdoubleW1.val);
                localdoubleW6.val *= localdoubleW3.val;
                localdoubleW6.val *= localdoubleW2.val;
                d4 = Math.abs(localdoubleW3.val) + Math.abs(localdoubleW2.val);
              }
              localdoubleW1.val *= paramArrayOfDouble1[(i17 + 1 - 1 + (i17 - 1) * paramInt4 + paramInt3)];
              d21 = localdoubleW1.val * paramArrayOfDouble1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)] - localdoubleW3.val * paramArrayOfDouble2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)];
              d20 = -(localdoubleW2.val * paramArrayOfDouble2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]);
              if ((Math.abs(localdoubleW7.val) <= Math.abs(d21) + Math.abs(d20) ? 0 : 1) != 0)
              {
                paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)] = 1.0D;
                paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 + paramInt12)] = 0.0D;
                paramArrayOfDouble5[(2 * paramInt2 + i17 + 1 - 1 + paramInt12)] = (-(d21 / localdoubleW7.val));
                paramArrayOfDouble5[(3 * paramInt2 + i17 + 1 - 1 + paramInt12)] = (-(d20 / localdoubleW7.val));
              }
              else
              {
                paramArrayOfDouble5[(2 * paramInt2 + i17 + 1 - 1 + paramInt12)] = 1.0D;
                paramArrayOfDouble5[(3 * paramInt2 + i17 + 1 - 1 + paramInt12)] = 0.0D;
                localdoubleW1.val *= paramArrayOfDouble1[(i17 - 1 + (i17 + 1 - 1) * paramInt4 + paramInt3)];
                paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)] = ((localdoubleW3.val * paramArrayOfDouble2[(i17 + 1 - 1 + (i17 + 1 - 1) * paramInt6 + paramInt5)] - localdoubleW1.val * paramArrayOfDouble1[(i17 + 1 - 1 + (i17 + 1 - 1) * paramInt4 + paramInt3)]) / localdoubleW7.val);
                paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 + paramInt12)] = (localdoubleW2.val * paramArrayOfDouble2[(i17 + 1 - 1 + (i17 + 1 - 1) * paramInt6 + paramInt5)] / localdoubleW7.val);
              }
              d23 = Math.max(Math.abs(paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)]) + Math.abs(paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 + paramInt12)]), Math.abs(paramArrayOfDouble5[(2 * paramInt2 + i17 + 1 - 1 + paramInt12)]) + Math.abs(paramArrayOfDouble5[(3 * paramInt2 + i17 + 1 - 1 + paramInt12)]));
            }
            d16 = Util.max(d22 * d1 * d2, d22 * d4 * d6, localdoubleW5.val);
            k = 0;
            i14 = i17 + i21;
            i23 = paramInt2 - (i17 + i21) + 1;
            while (i23 > 0)
            {
              if (k != 0)
              {
                k = 0;
              }
              else
              {
                i20 = 1;
                arrayOfDouble1[(1 - 1)] = paramArrayOfDouble2[(i14 - 1 + (i14 - 1) * paramInt6 + paramInt5)];
                if ((i14 >= paramInt2 ? 0 : 1) != 0) {
                  if ((paramArrayOfDouble1[(i14 + 1 - 1 + (i14 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
                  {
                    k = 1;
                    arrayOfDouble1[(2 - 1)] = paramArrayOfDouble2[(i14 + 1 - 1 + (i14 + 1 - 1) * paramInt6 + paramInt5)];
                    i20 = 2;
                  }
                }
                d24 = 1.0D / Math.max(1.0D, d23);
                localdoubleW7.val = Util.max(paramArrayOfDouble5[(i14 - 1 + paramInt12)], paramArrayOfDouble5[(paramInt2 + i14 - 1 + paramInt12)], d1 * paramArrayOfDouble5[(i14 - 1 + paramInt12)] + d4 * paramArrayOfDouble5[(paramInt2 + i14 - 1 + paramInt12)]);
                if (k != 0) {
                  localdoubleW7.val = Math.max(Util.max(localdoubleW7.val, paramArrayOfDouble5[(i14 + 1 - 1 + paramInt12)], paramArrayOfDouble5[(paramInt2 + i14 + 1 - 1 + paramInt12)]), d1 * paramArrayOfDouble5[(i14 + 1 - 1 + paramInt12)] + d4 * paramArrayOfDouble5[(paramInt2 + i14 + 1 - 1 + paramInt12)]);
                }
                if ((localdoubleW7.val <= d5 * d24 ? 0 : 1) != 0)
                {
                  i19 = 0;
                  i24 = i21 - 1 - 0 + 1;
                  while (i24 > 0)
                  {
                    i18 = i17;
                    i25 = i14 - 1 - i17 + 1;
                    while (i25 > 0)
                    {
                      paramArrayOfDouble5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)] = (d24 * paramArrayOfDouble5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)]);
                      i18 += 1;
                      ???--;
                    }
                    i19 += 1;
                    ???--;
                  }
                  d23 *= d24;
                }
                i19 = 1;
                i24 = i21 - 1 + 1;
                while (i24 > 0)
                {
                  i15 = 1;
                  i25 = i20 - 1 + 1;
                  while (i25 > 0)
                  {
                    arrayOfDouble3[(i15 - 1 + (i19 - 1) * 2)] = 0.0D;
                    arrayOfDouble4[(i15 - 1 + (i19 - 1) * 2)] = 0.0D;
                    i18 = i17;
                    int i26 = i14 - 1 - i17 + 1;
                    while (i26 > 0)
                    {
                      arrayOfDouble3[(i15 - 1 + (i19 - 1) * 2)] += paramArrayOfDouble1[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt4 + paramInt3)] * paramArrayOfDouble5[((i19 + 1) * paramInt2 + i18 - 1 + paramInt12)];
                      arrayOfDouble4[(i15 - 1 + (i19 - 1) * 2)] += paramArrayOfDouble2[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt6 + paramInt5)] * paramArrayOfDouble5[((i19 + 1) * paramInt2 + i18 - 1 + paramInt12)];
                      i18 += 1;
                      ???--;
                    }
                    i15 += 1;
                    ???--;
                  }
                  i19 += 1;
                  ???--;
                }
                i15 = 1;
                i24 = i20 - 1 + 1;
                while (i24 > 0)
                {
                  if (i4 != 0)
                  {
                    arrayOfDouble2[(i15 - 1 + (1 - 1) * 2)] = (-(localdoubleW1.val * arrayOfDouble3[(i15 - 1 + (1 - 1) * 2)]) + localdoubleW3.val * arrayOfDouble4[(i15 - 1 + (1 - 1) * 2)] - localdoubleW2.val * arrayOfDouble4[(i15 - 1 + (2 - 1) * 2)]);
                    arrayOfDouble2[(i15 - 1 + (2 - 1) * 2)] = (-(localdoubleW1.val * arrayOfDouble3[(i15 - 1 + (2 - 1) * 2)]) + localdoubleW3.val * arrayOfDouble4[(i15 - 1 + (2 - 1) * 2)] + localdoubleW2.val * arrayOfDouble4[(i15 - 1 + (1 - 1) * 2)]);
                  }
                  else
                  {
                    arrayOfDouble2[(i15 - 1 + (1 - 1) * 2)] = (-(localdoubleW1.val * arrayOfDouble3[(i15 - 1 + (1 - 1) * 2)]) + localdoubleW3.val * arrayOfDouble4[(i15 - 1 + (1 - 1) * 2)]);
                  }
                  i15 += 1;
                  ???--;
                }
                Dlaln2.dlaln2(true, i20, i21, d16, localdoubleW1.val, paramArrayOfDouble1, i14 - 1 + (i14 - 1) * paramInt4 + paramInt3, paramInt4, arrayOfDouble1[(1 - 1)], arrayOfDouble1[(2 - 1)], arrayOfDouble2, 0, 2, localdoubleW3.val, localdoubleW2.val, paramArrayOfDouble5, 2 * paramInt2 + i14 - 1 + paramInt12, paramInt2, localdoubleW6, localdoubleW7, localintW1);
                if ((localdoubleW6.val >= 1.0D ? 0 : 1) != 0)
                {
                  i19 = 0;
                  i24 = i21 - 1 - 0 + 1;
                  while (i24 > 0)
                  {
                    i18 = i17;
                    i25 = i14 - 1 - i17 + 1;
                    while (i25 > 0)
                    {
                      paramArrayOfDouble5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)] = (localdoubleW6.val * paramArrayOfDouble5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)]);
                      i18 += 1;
                      ???--;
                    }
                    i19 += 1;
                    ???--;
                  }
                  d23 = localdoubleW6.val * d23;
                }
                d23 = Math.max(d23, localdoubleW7.val);
              }
              i14 += 1;
              ???--;
            }
            i9 += 1;
            if (i1 != 0)
            {
              i19 = 0;
              i23 = i21 - 1 - 0 + 1;
              while (i23 > 0)
              {
                Dgemv.dgemv("N", paramInt2, paramInt2 + 1 - i17, 1.0D, paramArrayOfDouble3, 1 - 1 + (i17 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble5, (i19 + 2) * paramInt2 + i17 - 1 + paramInt12, 1, 0.0D, paramArrayOfDouble5, (i19 + 4) * paramInt2 + 1 - 1 + paramInt12, 1);
                i19 += 1;
                ???--;
              }
              Dlacpy.dlacpy(" ", paramInt2, i21, paramArrayOfDouble5, 4 * paramInt2 + 1 - 1 + paramInt12, paramInt2, paramArrayOfDouble3, 1 - 1 + (i17 - 1) * paramInt8 + paramInt7, paramInt8);
              i8 = 1;
            }
            else
            {
              Dlacpy.dlacpy(" ", paramInt2, i21, paramArrayOfDouble5, 2 * paramInt2 + 1 - 1 + paramInt12, paramInt2, paramArrayOfDouble3, 1 - 1 + (i9 - 1) * paramInt8 + paramInt7, paramInt8);
              i8 = i17;
            }
            d23 = 0.0D;
            if (i4 != 0)
            {
              i14 = i8;
              i23 = paramInt2 - i8 + 1;
              while (i23 > 0)
              {
                d23 = Math.max(d23, Math.abs(paramArrayOfDouble3[(i14 - 1 + (i9 - 1) * paramInt8 + paramInt7)]) + Math.abs(paramArrayOfDouble3[(i14 - 1 + (i9 + 1 - 1) * paramInt8 + paramInt7)]));
                i14 += 1;
                ???--;
              }
            }
            else
            {
              i14 = i8;
              i23 = paramInt2 - i8 + 1;
              while (i23 > 0)
              {
                d23 = Math.max(d23, Math.abs(paramArrayOfDouble3[(i14 - 1 + (i9 - 1) * paramInt8 + paramInt7)]));
                i14 += 1;
                ???--;
              }
            }
            if ((d23 <= localdoubleW5.val ? 0 : 1) != 0)
            {
              d24 = 1.0D / d23;
              i19 = 0;
              i23 = i21 - 1 - 0 + 1;
              while (i23 > 0)
              {
                i18 = i8;
                i24 = paramInt2 - i8 + 1;
                while (i24 > 0)
                {
                  paramArrayOfDouble3[(i18 - 1 + (i9 + i19 - 1) * paramInt8 + paramInt7)] = (d24 * paramArrayOfDouble3[(i18 - 1 + (i9 + i19 - 1) * paramInt8 + paramInt7)]);
                  i18 += 1;
                  ???--;
                }
                i19 += 1;
                ???--;
              }
            }
            i9 = i9 + i21 - 1;
          }
        }
        label5278:
        i17 += 1;
      }
    }
    if (j != 0)
    {
      i9 = i12 + 1;
      i4 = 0;
      i17 = paramInt2;
      for (i22 = (1 - paramInt2 + -1) / -1; i22 > 0; i22--)
      {
        if (i4 != 0)
        {
          i4 = 0;
        }
        else
        {
          i21 = 1;
          if ((i17 <= 1 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble1[(i17 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
            {
              i4 = 1;
              i21 = 2;
            }
          }
          if (n != 0) {
            i3 = 1;
          } else if (i4 != 0) {
            i3 = (paramArrayOfBoolean[(i17 - 1 + paramInt1)] == 0) && (paramArrayOfBoolean[(i17 - 1 - 1 + paramInt1)] == 0) ? 0 : 1;
          } else {
            i3 = paramArrayOfBoolean[(i17 - 1 + paramInt1)];
          }
          if ((i3 ^ 0x1) == 0)
          {
            if ((i4 ^ 0x1) != 0)
            {
              if ((Math.abs(paramArrayOfDouble1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)]) > localdoubleW5.val ? 0 : 1) != 0) {}
              if (((Math.abs(paramArrayOfDouble2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]) > localdoubleW5.val ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                i9 -= 1;
                i18 = 1;
                i23 = paramInt2 - 1 + 1;
                while (i23 > 0)
                {
                  paramArrayOfDouble4[(i18 - 1 + (i9 - 1) * paramInt10 + paramInt9)] = 0.0D;
                  i18 += 1;
                  ???--;
                }
                paramArrayOfDouble4[(i9 - 1 + (i9 - 1) * paramInt10 + paramInt9)] = 1.0D;
                break label9857;
              }
            }
            i19 = 0;
            i23 = i21 - 1 - 0 + 1;
            while (i23 > 0)
            {
              i18 = 1;
              i24 = paramInt2 - 1 + 1;
              while (i24 > 0)
              {
                paramArrayOfDouble5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)] = 0.0D;
                i18 += 1;
                ???--;
              }
              i19 += 1;
              ???--;
            }
            if ((i4 ^ 0x1) != 0)
            {
              localdoubleW7.val = (1.0D / Util.max(Math.abs(paramArrayOfDouble1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)]) * d3, Math.abs(paramArrayOfDouble2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]) * d7, localdoubleW5.val));
              d17 = localdoubleW7.val * paramArrayOfDouble1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)] * d3;
              d18 = localdoubleW7.val * paramArrayOfDouble2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)] * d7;
              localdoubleW1.val = (d18 * d3);
              localdoubleW3.val = (d17 * d7);
              localdoubleW2.val = 0.0D;
              localdoubleW6.val = 1.0D;
              if ((Math.abs(d18) < localdoubleW5.val ? 0 : 1) != 0) {}
              i5 = (Math.abs(localdoubleW1.val) >= d19 ? 0 : 1) != 0 ? 1 : 0;
              if ((Math.abs(d17) < localdoubleW5.val ? 0 : 1) != 0) {}
              i6 = (Math.abs(localdoubleW3.val) >= d19 ? 0 : 1) != 0 ? 1 : 0;
              if (i5 != 0) {
                localdoubleW6.val = (d19 / Math.abs(d18) * Math.min(d2, localdoubleW4.val));
              }
              if (i6 != 0) {
                localdoubleW6.val = Math.max(localdoubleW6.val, d19 / Math.abs(d17) * Math.min(d6, localdoubleW4.val));
              }
              if (((i5 == 0) && (i6 == 0) ? 0 : 1) != 0)
              {
                localdoubleW6.val = Math.min(localdoubleW6.val, 1.0D / (localdoubleW5.val * Util.max(1.0D, Math.abs(localdoubleW1.val), Math.abs(localdoubleW3.val))));
                if (i5 != 0) {
                  localdoubleW1.val = (d3 * (localdoubleW6.val * d18));
                } else {
                  localdoubleW6.val *= localdoubleW1.val;
                }
                if (i6 != 0) {
                  localdoubleW3.val = (d7 * (localdoubleW6.val * d17));
                } else {
                  localdoubleW6.val *= localdoubleW3.val;
                }
              }
              d1 = Math.abs(localdoubleW1.val);
              d4 = Math.abs(localdoubleW3.val);
              paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)] = 1.0D;
              d23 = 1.0D;
              i18 = 1;
              i23 = i17 - 1 - 1 + 1;
              while (i23 > 0)
              {
                paramArrayOfDouble5[(2 * paramInt2 + i18 - 1 + paramInt12)] = (localdoubleW3.val * paramArrayOfDouble2[(i18 - 1 + (i17 - 1) * paramInt6 + paramInt5)] - localdoubleW1.val * paramArrayOfDouble1[(i18 - 1 + (i17 - 1) * paramInt4 + paramInt3)]);
                i18 += 1;
                ???--;
              }
            }
            else
            {
              Dlag2.dlag2(paramArrayOfDouble1, i17 - 1 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, i17 - 1 - 1 + (i17 - 1 - 1) * paramInt6 + paramInt5, paramInt6, localdoubleW5.val * 100.0D, localdoubleW1, localdoubleW7, localdoubleW3, localdoubleW8, localdoubleW2);
              if ((localdoubleW2.val != 0.0D ? 0 : 1) != 0)
              {
                paramintW2.val = (i17 - 1);
                return;
              }
              d1 = Math.abs(localdoubleW1.val);
              d4 = Math.abs(localdoubleW3.val) + Math.abs(localdoubleW2.val);
              localdoubleW6.val = 1.0D;
              if ((d1 * d22 >= localdoubleW5.val ? 0 : 1) != 0) {}
              if (((d1 < localdoubleW5.val ? 0 : 1) != 0 ? 1 : 0) != 0) {
                localdoubleW6.val = (localdoubleW5.val / d22 / d1);
              }
              if ((d4 * d22 >= localdoubleW5.val ? 0 : 1) != 0) {}
              if (((d4 < localdoubleW5.val ? 0 : 1) != 0 ? 1 : 0) != 0) {
                localdoubleW6.val = Math.max(localdoubleW6.val, localdoubleW5.val / d22 / d4);
              }
              if ((localdoubleW5.val * d1 <= d3 ? 0 : 1) != 0) {
                localdoubleW6.val = (d3 / (localdoubleW5.val * d1));
              }
              if ((localdoubleW5.val * d4 <= d7 ? 0 : 1) != 0) {
                localdoubleW6.val = Math.min(localdoubleW6.val, d7 / (localdoubleW5.val * d4));
              }
              if ((localdoubleW6.val == 1.0D ? 0 : 1) != 0)
              {
                localdoubleW6.val *= localdoubleW1.val;
                d1 = Math.abs(localdoubleW1.val);
                localdoubleW6.val *= localdoubleW3.val;
                localdoubleW6.val *= localdoubleW2.val;
                d4 = Math.abs(localdoubleW3.val) + Math.abs(localdoubleW2.val);
              }
              localdoubleW1.val *= paramArrayOfDouble1[(i17 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3)];
              d21 = localdoubleW1.val * paramArrayOfDouble1[(i17 - 1 + (i17 - 1) * paramInt4 + paramInt3)] - localdoubleW3.val * paramArrayOfDouble2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)];
              d20 = -(localdoubleW2.val * paramArrayOfDouble2[(i17 - 1 + (i17 - 1) * paramInt6 + paramInt5)]);
              if ((Math.abs(localdoubleW7.val) < Math.abs(d21) + Math.abs(d20) ? 0 : 1) != 0)
              {
                paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)] = 1.0D;
                paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 + paramInt12)] = 0.0D;
                paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)] = (-(d21 / localdoubleW7.val));
                paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)] = (-(d20 / localdoubleW7.val));
              }
              else
              {
                paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)] = 1.0D;
                paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)] = 0.0D;
                localdoubleW1.val *= paramArrayOfDouble1[(i17 - 1 - 1 + (i17 - 1) * paramInt4 + paramInt3)];
                paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)] = ((localdoubleW3.val * paramArrayOfDouble2[(i17 - 1 - 1 + (i17 - 1 - 1) * paramInt6 + paramInt5)] - localdoubleW1.val * paramArrayOfDouble1[(i17 - 1 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3)]) / localdoubleW7.val);
                paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 + paramInt12)] = (localdoubleW2.val * paramArrayOfDouble2[(i17 - 1 - 1 + (i17 - 1 - 1) * paramInt6 + paramInt5)] / localdoubleW7.val);
              }
              d23 = Math.max(Math.abs(paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)]) + Math.abs(paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 + paramInt12)]), Math.abs(paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)]) + Math.abs(paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)]));
              d14 = localdoubleW1.val * paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)];
              d10 = localdoubleW1.val * paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)];
              d15 = localdoubleW3.val * paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)] - localdoubleW2.val * paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)];
              d11 = localdoubleW2.val * paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 - 1 + paramInt12)] + localdoubleW3.val * paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 - 1 + paramInt12)];
              d12 = localdoubleW1.val * paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)];
              d8 = localdoubleW1.val * paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 + paramInt12)];
              d13 = localdoubleW3.val * paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)] - localdoubleW2.val * paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 + paramInt12)];
              d9 = localdoubleW2.val * paramArrayOfDouble5[(2 * paramInt2 + i17 - 1 + paramInt12)] + localdoubleW3.val * paramArrayOfDouble5[(3 * paramInt2 + i17 - 1 + paramInt12)];
              i18 = 1;
              i23 = i17 - 2 - 1 + 1;
              while (i23 > 0)
              {
                paramArrayOfDouble5[(2 * paramInt2 + i18 - 1 + paramInt12)] = (-(d14 * paramArrayOfDouble1[(i18 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3)]) + d15 * paramArrayOfDouble2[(i18 - 1 + (i17 - 1 - 1) * paramInt6 + paramInt5)] - d12 * paramArrayOfDouble1[(i18 - 1 + (i17 - 1) * paramInt4 + paramInt3)] + d13 * paramArrayOfDouble2[(i18 - 1 + (i17 - 1) * paramInt6 + paramInt5)]);
                paramArrayOfDouble5[(3 * paramInt2 + i18 - 1 + paramInt12)] = (-(d10 * paramArrayOfDouble1[(i18 - 1 + (i17 - 1 - 1) * paramInt4 + paramInt3)]) + d11 * paramArrayOfDouble2[(i18 - 1 + (i17 - 1 - 1) * paramInt6 + paramInt5)] - d8 * paramArrayOfDouble1[(i18 - 1 + (i17 - 1) * paramInt4 + paramInt3)] + d9 * paramArrayOfDouble2[(i18 - 1 + (i17 - 1) * paramInt6 + paramInt5)]);
                i18 += 1;
                ???--;
              }
            }
            d16 = Util.max(d22 * d1 * d2, d22 * d4 * d6, localdoubleW5.val);
            k = 0;
            i14 = i17 - i21;
            i23 = (1 - (i17 - i21) + -1) / -1;
            label9110:
            while (i23 > 0)
            {
              if ((k ^ 0x1) != 0) {}
              if (((i14 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0) {
                if ((paramArrayOfDouble1[(i14 - 1 + (i14 - 1 - 1) * paramInt4 + paramInt3)] == 0.0D ? 0 : 1) != 0)
                {
                  k = 1;
                  break label9110;
                }
              }
              arrayOfDouble1[(1 - 1)] = paramArrayOfDouble2[(i14 - 1 + (i14 - 1) * paramInt6 + paramInt5)];
              if (k != 0)
              {
                i20 = 2;
                arrayOfDouble1[(2 - 1)] = paramArrayOfDouble2[(i14 + 1 - 1 + (i14 + 1 - 1) * paramInt6 + paramInt5)];
              }
              else
              {
                i20 = 1;
              }
              Dlaln2.dlaln2(false, i20, i21, d16, localdoubleW1.val, paramArrayOfDouble1, i14 - 1 + (i14 - 1) * paramInt4 + paramInt3, paramInt4, arrayOfDouble1[(1 - 1)], arrayOfDouble1[(2 - 1)], paramArrayOfDouble5, 2 * paramInt2 + i14 - 1 + paramInt12, paramInt2, localdoubleW3.val, localdoubleW2.val, arrayOfDouble2, 0, 2, localdoubleW6, localdoubleW7, localintW1);
              if ((localdoubleW6.val >= 1.0D ? 0 : 1) != 0)
              {
                i19 = 0;
                i24 = i21 - 1 - 0 + 1;
                while (i24 > 0)
                {
                  i18 = 1;
                  i25 = i17 - 1 + 1;
                  while (i25 > 0)
                  {
                    paramArrayOfDouble5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)] = (localdoubleW6.val * paramArrayOfDouble5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)]);
                    i18 += 1;
                    ???--;
                  }
                  i19 += 1;
                  ???--;
                }
              }
              d23 = Math.max(localdoubleW6.val * d23, localdoubleW7.val);
              i19 = 1;
              i24 = i21 - 1 + 1;
              while (i24 > 0)
              {
                i15 = 1;
                i25 = i20 - 1 + 1;
                while (i25 > 0)
                {
                  paramArrayOfDouble5[((i19 + 1) * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)] = arrayOfDouble2[(i15 - 1 + (i19 - 1) * 2)];
                  i15 += 1;
                  ???--;
                }
                i19 += 1;
                ???--;
              }
              if ((i14 <= 1 ? 0 : 1) != 0)
              {
                d24 = 1.0D / Math.max(1.0D, d23);
                localdoubleW7.val = (d1 * paramArrayOfDouble5[(i14 - 1 + paramInt12)] + d4 * paramArrayOfDouble5[(paramInt2 + i14 - 1 + paramInt12)]);
                if (k != 0) {
                  localdoubleW7.val = Math.max(localdoubleW7.val, d1 * paramArrayOfDouble5[(i14 + 1 - 1 + paramInt12)] + d4 * paramArrayOfDouble5[(paramInt2 + i14 + 1 - 1 + paramInt12)]);
                }
                localdoubleW7.val = Util.max(localdoubleW7.val, d1, d4);
                if ((localdoubleW7.val <= d5 * d24 ? 0 : 1) != 0)
                {
                  i19 = 0;
                  i24 = i21 - 1 - 0 + 1;
                  while (i24 > 0)
                  {
                    i18 = 1;
                    i25 = i17 - 1 + 1;
                    while (i25 > 0)
                    {
                      paramArrayOfDouble5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)] = (d24 * paramArrayOfDouble5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)]);
                      i18 += 1;
                      ???--;
                    }
                    i19 += 1;
                    ???--;
                  }
                  d23 *= d24;
                }
                i15 = 1;
                i24 = i20 - 1 + 1;
                while (i24 > 0)
                {
                  if (i4 != 0)
                  {
                    d14 = localdoubleW1.val * paramArrayOfDouble5[(2 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    d10 = localdoubleW1.val * paramArrayOfDouble5[(3 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    d15 = localdoubleW3.val * paramArrayOfDouble5[(2 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)] - localdoubleW2.val * paramArrayOfDouble5[(3 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    d11 = localdoubleW2.val * paramArrayOfDouble5[(2 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)] + localdoubleW3.val * paramArrayOfDouble5[(3 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    i18 = 1;
                    i25 = i14 - 1 - 1 + 1;
                    while (i25 > 0)
                    {
                      paramArrayOfDouble5[(2 * paramInt2 + i18 - 1 + paramInt12)] = (paramArrayOfDouble5[(2 * paramInt2 + i18 - 1 + paramInt12)] - d14 * paramArrayOfDouble1[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt4 + paramInt3)] + d15 * paramArrayOfDouble2[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt6 + paramInt5)]);
                      paramArrayOfDouble5[(3 * paramInt2 + i18 - 1 + paramInt12)] = (paramArrayOfDouble5[(3 * paramInt2 + i18 - 1 + paramInt12)] - d10 * paramArrayOfDouble1[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt4 + paramInt3)] + d11 * paramArrayOfDouble2[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt6 + paramInt5)]);
                      i18 += 1;
                      ???--;
                    }
                  }
                  else
                  {
                    d14 = localdoubleW1.val * paramArrayOfDouble5[(2 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    d15 = localdoubleW3.val * paramArrayOfDouble5[(2 * paramInt2 + i14 + i15 - 1 - 1 + paramInt12)];
                    i18 = 1;
                    i25 = i14 - 1 - 1 + 1;
                    while (i25 > 0)
                    {
                      paramArrayOfDouble5[(2 * paramInt2 + i18 - 1 + paramInt12)] = (paramArrayOfDouble5[(2 * paramInt2 + i18 - 1 + paramInt12)] - d14 * paramArrayOfDouble1[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt4 + paramInt3)] + d15 * paramArrayOfDouble2[(i18 - 1 + (i14 + i15 - 1 - 1) * paramInt6 + paramInt5)]);
                      i18 += 1;
                      ???--;
                    }
                  }
                  i15 += 1;
                  ???--;
                }
              }
              k = 0;
              i14 += -1;
              ???--;
            }
            i9 -= i21;
            if (i1 != 0)
            {
              i19 = 0;
              i23 = i21 - 1 - 0 + 1;
              while (i23 > 0)
              {
                i18 = 1;
                i24 = paramInt2 - 1 + 1;
                while (i24 > 0)
                {
                  paramArrayOfDouble5[((i19 + 4) * paramInt2 + i18 - 1 + paramInt12)] = (paramArrayOfDouble5[((i19 + 2) * paramInt2 + 1 - 1 + paramInt12)] * paramArrayOfDouble4[(i18 - 1 + (1 - 1) * paramInt10 + paramInt9)]);
                  i18 += 1;
                  ???--;
                }
                i16 = 2;
                i24 = i17 - 2 + 1;
                while (i24 > 0)
                {
                  i18 = 1;
                  i25 = paramInt2 - 1 + 1;
                  while (i25 > 0)
                  {
                    paramArrayOfDouble5[((i19 + 4) * paramInt2 + i18 - 1 + paramInt12)] += paramArrayOfDouble5[((i19 + 2) * paramInt2 + i16 - 1 + paramInt12)] * paramArrayOfDouble4[(i18 - 1 + (i16 - 1) * paramInt10 + paramInt9)];
                    i18 += 1;
                    ???--;
                  }
                  i16 += 1;
                  ???--;
                }
                i19 += 1;
                ???--;
              }
              i19 = 0;
              i23 = i21 - 1 - 0 + 1;
              while (i23 > 0)
              {
                i18 = 1;
                i24 = paramInt2 - 1 + 1;
                while (i24 > 0)
                {
                  paramArrayOfDouble4[(i18 - 1 + (i9 + i19 - 1) * paramInt10 + paramInt9)] = paramArrayOfDouble5[((i19 + 4) * paramInt2 + i18 - 1 + paramInt12)];
                  i18 += 1;
                  ???--;
                }
                i19 += 1;
                ???--;
              }
              i10 = paramInt2;
            }
            else
            {
              i19 = 0;
              i23 = i21 - 1 - 0 + 1;
              while (i23 > 0)
              {
                i18 = 1;
                i24 = paramInt2 - 1 + 1;
                while (i24 > 0)
                {
                  paramArrayOfDouble4[(i18 - 1 + (i9 + i19 - 1) * paramInt10 + paramInt9)] = paramArrayOfDouble5[((i19 + 2) * paramInt2 + i18 - 1 + paramInt12)];
                  i18 += 1;
                  ???--;
                }
                i19 += 1;
                ???--;
              }
              i10 = i17;
            }
            d23 = 0.0D;
            if (i4 != 0)
            {
              i14 = 1;
              i23 = i10 - 1 + 1;
              while (i23 > 0)
              {
                d23 = Math.max(d23, Math.abs(paramArrayOfDouble4[(i14 - 1 + (i9 - 1) * paramInt10 + paramInt9)]) + Math.abs(paramArrayOfDouble4[(i14 - 1 + (i9 + 1 - 1) * paramInt10 + paramInt9)]));
                i14 += 1;
                ???--;
              }
            }
            else
            {
              i14 = 1;
              i23 = i10 - 1 + 1;
              while (i23 > 0)
              {
                d23 = Math.max(d23, Math.abs(paramArrayOfDouble4[(i14 - 1 + (i9 - 1) * paramInt10 + paramInt9)]));
                i14 += 1;
                ???--;
              }
            }
            if ((d23 <= localdoubleW5.val ? 0 : 1) != 0)
            {
              d24 = 1.0D / d23;
              i19 = 0;
              i23 = i21 - 1 - 0 + 1;
              while (i23 > 0)
              {
                i18 = 1;
                i24 = i10 - 1 + 1;
                while (i24 > 0)
                {
                  paramArrayOfDouble4[(i18 - 1 + (i9 + i19 - 1) * paramInt10 + paramInt9)] = (d24 * paramArrayOfDouble4[(i18 - 1 + (i9 + i19 - 1) * paramInt10 + paramInt9)]);
                  i18 += 1;
                  ???--;
                }
                i19 += 1;
                ???--;
              }
            }
          }
        }
        label9857:
        i17 += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtgevc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */