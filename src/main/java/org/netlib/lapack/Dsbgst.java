package org.netlib.lapack;

import org.netlib.blas.Dger;
import org.netlib.blas.Drot;
import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dsbgst
{
  public static void dsbgst(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
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
    doubleW localdoubleW = new doubleW(0.0D);
    double d2 = 0.0D;
    double d3 = 0.0D;
    bool2 = Lsame.lsame(paramString1, "V");
    bool1 = Lsame.lsame(paramString2, "U");
    i8 = paramInt2 + 1;
    i9 = paramInt3 + 1;
    paramintW.val = 0;
    if ((((bool2 ^ true)) && ((Lsame.lsame(paramString1, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool1 ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
      }
      else if ((paramInt5 >= paramInt2 + 1 ? 0 : 1) != 0)
      {
        paramintW.val = -7;
      }
      else if ((paramInt7 >= paramInt3 + 1 ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else
      {
        if ((paramInt9 >= 1 ? 0 : 1) == 0) {
          if (!bool2) {}
        }
        if ((((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -11;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSBGST", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i1 = paramInt5 * i8;
    if (bool2) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble3, paramInt8, paramInt9);
    }
    i12 = (paramInt1 + paramInt3) / 2;
    i = 1;
    j = paramInt1 + 1;
    int i16;
    int i17;
    for (;;)
    {
      if (i != 0)
      {
        j -= 1;
        i10 = Math.min(paramInt3, j - 1);
        k = j - 1;
        m = Math.min(paramInt1, j + paramInt2);
        n = j - i10 + i8;
        if ((j >= i12 + 1 ? 0 : 1) != 0)
        {
          i = 0;
          j += 1;
          k = i12;
          if ((paramInt2 != 0 ? 0 : 1) != 0) {
            break;
          }
          continue;
        }
      }
      else
      {
        j += paramInt2;
        if ((j <= paramInt1 - 1 ? 0 : 1) != 0) {
          break;
        }
      }
      if (bool1)
      {
        if (i != 0)
        {
          d1 = paramArrayOfDouble2[(i9 - 1 + (j - 1) * paramInt7 + paramInt6)];
          i2 = j;
          for (i16 = m - j + 1; i16 > 0; i16--)
          {
            paramArrayOfDouble1[(j - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] /= d1;
            i2 += 1;
          }
          i2 = Math.max(1, j - paramInt2);
          for (i16 = j - Math.max(1, j - paramInt2) + 1; i16 > 0; i16--)
          {
            paramArrayOfDouble1[(i2 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)] /= d1;
            i2 += 1;
          }
          i7 = j - i10;
          for (i16 = j - 1 - (j - i10) + 1; i16 > 0; i16--)
          {
            i2 = j - i10;
            for (i17 = i7 - (j - i10) + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i2 - i7 + i8 - 1 + (i7 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble1[(i2 - i7 + i8 - 1 + (i7 - 1) * paramInt5 + paramInt4)] - paramArrayOfDouble2[(i2 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(i7 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)] - paramArrayOfDouble2[(i7 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(i2 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)] + paramArrayOfDouble1[(i8 - 1 + (j - 1) * paramInt5 + paramInt4)] * paramArrayOfDouble2[(i2 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble2[(i7 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)]);
              i2 += 1;
            }
            i2 = Math.max(1, j - paramInt2);
            for (i17 = j - i10 - 1 - Math.max(1, j - paramInt2) + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i2 - i7 + i8 - 1 + (i7 - 1) * paramInt5 + paramInt4)] -= paramArrayOfDouble2[(i7 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(i2 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)];
              i2 += 1;
            }
            i7 += 1;
          }
          i2 = j;
          for (i16 = m - j + 1; i16 > 0; i16--)
          {
            i7 = Math.max(i2 - paramInt2, j - i10);
            for (i17 = j - 1 - Math.max(i2 - paramInt2, j - i10) + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i7 - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= paramArrayOfDouble2[(i7 - j + i9 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(j - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)];
              i7 += 1;
            }
            i2 += 1;
          }
          if (bool2)
          {
            Dscal.dscal(paramInt1 - i12, 1.0D / d1, paramArrayOfDouble3, i12 + 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1);
            if ((i10 <= 0 ? 0 : 1) != 0) {
              Dger.dger(paramInt1 - i12, i10, -1.0D, paramArrayOfDouble3, i12 + 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble2, i9 - i10 - 1 + (j - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble3, i12 + 1 - 1 + (j - i10 - 1) * paramInt9 + paramInt8, paramInt9);
            }
          }
          d2 = paramArrayOfDouble1[(j - m + i8 - 1 + (m - 1) * paramInt5 + paramInt4)];
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          if (i != 0)
          {
            if ((j - i7 + paramInt2 >= paramInt1 ? 0 : 1) != 0) {}
            if (((j - i7 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              dlartg_adapter(paramArrayOfDouble1[(i7 + 1 - 1 + (j - i7 + paramInt2 - 1) * paramInt5 + paramInt4)], d2, paramArrayOfDouble4, paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10, paramArrayOfDouble4, j - i7 + paramInt2 - i12 - 1 + paramInt10, localdoubleW);
              d3 = -(paramArrayOfDouble2[(i9 - i7 - 1 + (j - 1) * paramInt7 + paramInt6)] * d2);
              paramArrayOfDouble4[(j - i7 - 1 + paramInt10)] = (paramArrayOfDouble4[(paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10)] * d3 - paramArrayOfDouble4[(j - i7 + paramInt2 - i12 - 1 + paramInt10)] * paramArrayOfDouble1[(1 - 1 + (j - i7 + paramInt2 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfDouble1[(1 - 1 + (j - i7 + paramInt2 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(j - i7 + paramInt2 - i12 - 1 + paramInt10)] * d3 + paramArrayOfDouble4[(paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10)] * paramArrayOfDouble1[(1 - 1 + (j - i7 + paramInt2 - 1) * paramInt5 + paramInt4)]);
              d2 = localdoubleW.val;
            }
          }
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 2) * i8;
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          if (i != 0) {
            i6 = Math.max(i5, j + 2 * paramInt2 - i7 + 1);
          } else {
            i6 = i5;
          }
          i14 = (paramInt1 - i6 + paramInt2) / i8;
          i2 = i6;
          for (i17 = (i3 - i6 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i2 - i12 - 1 + paramInt10)] *= paramArrayOfDouble1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfDouble1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(paramInt1 + i2 - i12 - 1 + paramInt10)] * paramArrayOfDouble1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if ((i14 <= 0 ? 0 : 1) != 0) {
            Dlargv.dlargv(i14, paramArrayOfDouble1, 1 - 1 + (i6 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, i6 - i12 - 1 + paramInt10, i8, paramArrayOfDouble4, paramInt1 + i6 - i12 - 1 + paramInt10, i8);
          }
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Dlartv.dlartv(i13, paramArrayOfDouble1, i8 - i11 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, paramInt2 - i11 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfDouble4, i5 - i12 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Dlar2v.dlar2v(i13, paramArrayOfDouble1, i8 - 1 + (i5 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i8 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, paramInt2 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfDouble4, i5 - i12 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i11 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 1 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfDouble4, i5 - i12 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i5;
            for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
            {
              Drot.drot(paramInt1 - i12, paramArrayOfDouble3, i12 + 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble3, i12 + 1 - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4[(paramInt1 + i2 - i12 - 1 + paramInt10)], paramArrayOfDouble4[(i2 - i12 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += 1;
        }
        if (i != 0)
        {
          if ((n > paramInt1 ? 0 : 1) != 0) {}
          if (((i10 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramArrayOfDouble4[(j - i10 - 1 + paramInt10)] = (-(paramArrayOfDouble2[(i9 - i10 - 1 + (j - 1) * paramInt7 + paramInt6)] * d2));
          }
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          if (i != 0) {
            i5 = j - i7 - 1 + Math.max(2, i7 - k + 1) * i8;
          } else {
            i5 = j - i7 - 1 + Math.max(1, i7 - k + 1) * i8;
          }
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + paramInt2 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i11 - 1 + (i5 - i11 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 1 - 1 + (i5 - i11 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - paramInt2 - 1 + paramInt10, paramArrayOfDouble4, i5 - paramInt2 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          i2 = i3;
          for (i17 = (i5 - i3 + -i8) / -i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i2 - 1 + paramInt10)] = paramArrayOfDouble4[(i2 - paramInt2 - 1 + paramInt10)];
            paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)] = paramArrayOfDouble4[(paramInt1 + i2 - paramInt2 - 1 + paramInt10)];
            i2 += -i8;
          }
          i2 = i5;
          for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i2 - 1 + paramInt10)] *= paramArrayOfDouble1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfDouble1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)] * paramArrayOfDouble1[(1 - 1 + (i2 + 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if (i != 0)
          {
            if ((j - i7 >= paramInt1 - paramInt2 ? 0 : 1) != 0) {}
            if (((i7 > i10 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramArrayOfDouble4[(j - i7 + paramInt2 - 1 + paramInt10)] = paramArrayOfDouble4[(j - i7 - 1 + paramInt10)];
            }
          }
          i7 += -1;
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 1) * i8;
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            Dlargv.dlargv(i13, paramArrayOfDouble1, 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, i5 - 1 + paramInt10, i8, paramArrayOfDouble4, paramInt1 + i5 - 1 + paramInt10, i8);
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Dlartv.dlartv(i13, paramArrayOfDouble1, i8 - i11 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, paramInt2 - i11 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfDouble4, i5 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Dlar2v.dlar2v(i13, paramArrayOfDouble1, i8 - 1 + (i5 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i8 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, paramInt2 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfDouble4, i5 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i11 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 1 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfDouble4, i5 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i5;
            for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
            {
              Drot.drot(paramInt1 - i12, paramArrayOfDouble3, i12 + 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble3, i12 + 1 - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)], paramArrayOfDouble4[(i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += -1;
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 2) * i8;
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i11 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 1 - 1 + (i5 + i8 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfDouble4, i5 - i12 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i7 += 1;
        }
        if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          i2 = paramInt1 - 1;
          for (i16 = (j - paramInt3 + 2 * paramInt2 + 1 - (paramInt1 - 1) + -1) / -1; i16 > 0; i16--)
          {
            paramArrayOfDouble4[(paramInt1 + i2 - i12 - 1 + paramInt10)] = paramArrayOfDouble4[(paramInt1 + i2 - paramInt2 - i12 - 1 + paramInt10)];
            paramArrayOfDouble4[(i2 - i12 - 1 + paramInt10)] = paramArrayOfDouble4[(i2 - paramInt2 - i12 - 1 + paramInt10)];
            i2 += -1;
          }
        }
      }
      else
      {
        if (i != 0)
        {
          d1 = paramArrayOfDouble2[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
          i2 = j;
          for (i16 = m - j + 1; i16 > 0; i16--)
          {
            paramArrayOfDouble1[(i2 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] /= d1;
            i2 += 1;
          }
          i2 = Math.max(1, j - paramInt2);
          for (i16 = j - Math.max(1, j - paramInt2) + 1; i16 > 0; i16--)
          {
            paramArrayOfDouble1[(j - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] /= d1;
            i2 += 1;
          }
          i7 = j - i10;
          for (i16 = j - 1 - (j - i10) + 1; i16 > 0; i16--)
          {
            i2 = j - i10;
            for (i17 = i7 - (j - i10) + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i7 - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble1[(i7 - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] - paramArrayOfDouble2[(j - i2 + 1 - 1 + (i2 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(j - i7 + 1 - 1 + (i7 - 1) * paramInt5 + paramInt4)] - paramArrayOfDouble2[(j - i7 + 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(j - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] + paramArrayOfDouble1[(1 - 1 + (j - 1) * paramInt5 + paramInt4)] * paramArrayOfDouble2[(j - i2 + 1 - 1 + (i2 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble2[(j - i7 + 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)]);
              i2 += 1;
            }
            i2 = Math.max(1, j - paramInt2);
            for (i17 = j - i10 - 1 - Math.max(1, j - paramInt2) + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i7 - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= paramArrayOfDouble2[(j - i7 + 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(j - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)];
              i2 += 1;
            }
            i7 += 1;
          }
          i2 = j;
          for (i16 = m - j + 1; i16 > 0; i16--)
          {
            i7 = Math.max(i2 - paramInt2, j - i10);
            for (i17 = j - 1 - Math.max(i2 - paramInt2, j - i10) + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i2 - i7 + 1 - 1 + (i7 - 1) * paramInt5 + paramInt4)] -= paramArrayOfDouble2[(j - i7 + 1 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(i2 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)];
              i7 += 1;
            }
            i2 += 1;
          }
          if (bool2)
          {
            Dscal.dscal(paramInt1 - i12, 1.0D / d1, paramArrayOfDouble3, i12 + 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1);
            if ((i10 <= 0 ? 0 : 1) != 0) {
              Dger.dger(paramInt1 - i12, i10, -1.0D, paramArrayOfDouble3, i12 + 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble2, i10 + 1 - 1 + (j - i10 - 1) * paramInt7 + paramInt6, paramInt7 - 1, paramArrayOfDouble3, i12 + 1 - 1 + (j - i10 - 1) * paramInt9 + paramInt8, paramInt9);
            }
          }
          d2 = paramArrayOfDouble1[(m - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)];
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          if (i != 0)
          {
            if ((j - i7 + paramInt2 >= paramInt1 ? 0 : 1) != 0) {}
            if (((j - i7 <= 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              dlartg_adapter(paramArrayOfDouble1[(i8 - i7 - 1 + (j - 1) * paramInt5 + paramInt4)], d2, paramArrayOfDouble4, paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10, paramArrayOfDouble4, j - i7 + paramInt2 - i12 - 1 + paramInt10, localdoubleW);
              d3 = -(paramArrayOfDouble2[(i7 + 1 - 1 + (j - i7 - 1) * paramInt7 + paramInt6)] * d2);
              paramArrayOfDouble4[(j - i7 - 1 + paramInt10)] = (paramArrayOfDouble4[(paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10)] * d3 - paramArrayOfDouble4[(j - i7 + paramInt2 - i12 - 1 + paramInt10)] * paramArrayOfDouble1[(i8 - 1 + (j - i7 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfDouble1[(i8 - 1 + (j - i7 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(j - i7 + paramInt2 - i12 - 1 + paramInt10)] * d3 + paramArrayOfDouble4[(paramInt1 + j - i7 + paramInt2 - i12 - 1 + paramInt10)] * paramArrayOfDouble1[(i8 - 1 + (j - i7 - 1) * paramInt5 + paramInt4)]);
              d2 = localdoubleW.val;
            }
          }
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 2) * i8;
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          if (i != 0) {
            i6 = Math.max(i5, j + 2 * paramInt2 - i7 + 1);
          } else {
            i6 = i5;
          }
          i14 = (paramInt1 - i6 + paramInt2) / i8;
          i2 = i6;
          for (i17 = (i3 - i6 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i2 - i12 - 1 + paramInt10)] *= paramArrayOfDouble1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfDouble1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(paramInt1 + i2 - i12 - 1 + paramInt10)] * paramArrayOfDouble1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if ((i14 <= 0 ? 0 : 1) != 0) {
            Dlargv.dlargv(i14, paramArrayOfDouble1, i8 - 1 + (i6 - paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, i6 - i12 - 1 + paramInt10, i8, paramArrayOfDouble4, paramInt1 + i6 - i12 - 1 + paramInt10, i8);
          }
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Dlartv.dlartv(i13, paramArrayOfDouble1, i11 + 1 - 1 + (i5 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 2 - 1 + (i5 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfDouble4, i5 - i12 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Dlar2v.dlar2v(i13, paramArrayOfDouble1, 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, 1 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, 2 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfDouble4, i5 - i12 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i8 - i11 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i8 - i11 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfDouble4, i5 - i12 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i5;
            for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
            {
              Drot.drot(paramInt1 - i12, paramArrayOfDouble3, i12 + 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble3, i12 + 1 - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4[(paramInt1 + i2 - i12 - 1 + paramInt10)], paramArrayOfDouble4[(i2 - i12 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += 1;
        }
        if (i != 0)
        {
          if ((n > paramInt1 ? 0 : 1) != 0) {}
          if (((i10 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramArrayOfDouble4[(j - i10 - 1 + paramInt10)] = (-(paramArrayOfDouble2[(i10 + 1 - 1 + (j - i10 - 1) * paramInt7 + paramInt6)] * d2));
          }
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          if (i != 0) {
            i5 = j - i7 - 1 + Math.max(2, i7 - k + 1) * i8;
          } else {
            i5 = j - i7 - 1 + Math.max(1, i7 - k + 1) * i8;
          }
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + paramInt2 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i8 - i11 + 1 - 1 + (i5 - paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i8 - i11 - 1 + (i5 - paramInt2 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - paramInt2 - 1 + paramInt10, paramArrayOfDouble4, i5 - paramInt2 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          i2 = i3;
          for (i17 = (i5 - i3 + -i8) / -i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i2 - 1 + paramInt10)] = paramArrayOfDouble4[(i2 - paramInt2 - 1 + paramInt10)];
            paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)] = paramArrayOfDouble4[(paramInt1 + i2 - paramInt2 - 1 + paramInt10)];
            i2 += -i8;
          }
          i2 = i5;
          for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i2 - 1 + paramInt10)] *= paramArrayOfDouble1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfDouble1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)] * paramArrayOfDouble1[(i8 - 1 + (i2 - paramInt2 + 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if (i != 0)
          {
            if ((j - i7 >= paramInt1 - paramInt2 ? 0 : 1) != 0) {}
            if (((i7 > i10 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramArrayOfDouble4[(j - i7 + paramInt2 - 1 + paramInt10)] = paramArrayOfDouble4[(j - i7 - 1 + paramInt10)];
            }
          }
          i7 += -1;
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 1) * i8;
          i13 = (paramInt1 - i5 + paramInt2) / i8;
          i3 = i5 + (i13 - 1) * i8;
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            Dlargv.dlargv(i13, paramArrayOfDouble1, i8 - 1 + (i5 - paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, i5 - 1 + paramInt10, i8, paramArrayOfDouble4, paramInt1 + i5 - 1 + paramInt10, i8);
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Dlartv.dlartv(i13, paramArrayOfDouble1, i11 + 1 - 1 + (i5 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 2 - 1 + (i5 - i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfDouble4, i5 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Dlar2v.dlar2v(i13, paramArrayOfDouble1, 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, 1 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, 2 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfDouble4, i5 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i8 - i11 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i8 - i11 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - 1 + paramInt10, paramArrayOfDouble4, i5 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i5;
            for (i17 = (i3 - i5 + i8) / i8; i17 > 0; i17--)
            {
              Drot.drot(paramInt1 - i12, paramArrayOfDouble3, i12 + 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble3, i12 + 1 - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)], paramArrayOfDouble4[(i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += -1;
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          i5 = j - i7 - 1 + Math.max(1, i7 - k + 2) * i8;
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (paramInt1 - i5 + i11) / i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i8 - i11 + 1 - 1 + (i5 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i8 - i11 - 1 + (i5 + 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i5 - i12 - 1 + paramInt10, paramArrayOfDouble4, i5 - i12 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i7 += 1;
        }
        if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          i2 = paramInt1 - 1;
          for (i16 = (j - paramInt3 + 2 * paramInt2 + 1 - (paramInt1 - 1) + -1) / -1; i16 > 0; i16--)
          {
            paramArrayOfDouble4[(paramInt1 + i2 - i12 - 1 + paramInt10)] = paramArrayOfDouble4[(paramInt1 + i2 - paramInt2 - i12 - 1 + paramInt10)];
            paramArrayOfDouble4[(i2 - i12 - 1 + paramInt10)] = paramArrayOfDouble4[(i2 - paramInt2 - i12 - 1 + paramInt10)];
            i2 += -1;
          }
        }
      }
    }
    i = 1;
    j = 0;
    for (;;)
    {
      if (i != 0)
      {
        j += 1;
        i10 = Math.min(paramInt3, i12 - j);
        k = j + 1;
        m = Math.max(1, j - paramInt2);
        n = j + i10 - i8;
        if ((j <= i12 ? 0 : 1) != 0)
        {
          i = 0;
          j -= 1;
          k = i12 + 1;
          if ((paramInt2 != 0 ? 0 : 1) != 0) {
            return;
          }
          continue;
        }
      }
      else
      {
        j -= paramInt2;
        if ((j >= 2 ? 0 : 1) != 0) {
          return;
        }
      }
      if ((j >= i12 - i10 ? 0 : 1) != 0) {
        i15 = i12;
      } else {
        i15 = paramInt1;
      }
      if (bool1)
      {
        if (i != 0)
        {
          d1 = paramArrayOfDouble2[(i9 - 1 + (j - 1) * paramInt7 + paramInt6)];
          i2 = m;
          for (i16 = j - m + 1; i16 > 0; i16--)
          {
            paramArrayOfDouble1[(i2 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)] /= d1;
            i2 += 1;
          }
          i2 = j;
          for (i16 = Math.min(paramInt1, j + paramInt2) - j + 1; i16 > 0; i16--)
          {
            paramArrayOfDouble1[(j - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] /= d1;
            i2 += 1;
          }
          i7 = j + 1;
          for (i16 = j + i10 - (j + 1) + 1; i16 > 0; i16--)
          {
            i2 = i7;
            for (i17 = j + i10 - i7 + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i7 - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble1[(i7 - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] - paramArrayOfDouble2[(j - i2 + i9 - 1 + (i2 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(j - i7 + i8 - 1 + (i7 - 1) * paramInt5 + paramInt4)] - paramArrayOfDouble2[(j - i7 + i9 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(j - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] + paramArrayOfDouble1[(i8 - 1 + (j - 1) * paramInt5 + paramInt4)] * paramArrayOfDouble2[(j - i2 + i9 - 1 + (i2 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble2[(j - i7 + i9 - 1 + (i7 - 1) * paramInt7 + paramInt6)]);
              i2 += 1;
            }
            i2 = j + i10 + 1;
            for (i17 = Math.min(paramInt1, j + paramInt2) - (j + i10 + 1) + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i7 - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= paramArrayOfDouble2[(j - i7 + i9 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(j - i2 + i8 - 1 + (i2 - 1) * paramInt5 + paramInt4)];
              i2 += 1;
            }
            i7 += 1;
          }
          i2 = m;
          for (i16 = j - m + 1; i16 > 0; i16--)
          {
            i7 = j + 1;
            for (i17 = Math.min(i2 + paramInt2, j + i10) - (j + 1) + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i2 - i7 + i8 - 1 + (i7 - 1) * paramInt5 + paramInt4)] -= paramArrayOfDouble2[(j - i7 + i9 - 1 + (i7 - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(i2 - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)];
              i7 += 1;
            }
            i2 += 1;
          }
          if (bool2)
          {
            Dscal.dscal(i15, 1.0D / d1, paramArrayOfDouble3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1);
            if ((i10 <= 0 ? 0 : 1) != 0) {
              Dger.dger(i15, i10, -1.0D, paramArrayOfDouble3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble2, paramInt3 - 1 + (j + 1 - 1) * paramInt7 + paramInt6, paramInt7 - 1, paramArrayOfDouble3, 1 - 1 + (j + 1 - 1) * paramInt9 + paramInt8, paramInt9);
            }
          }
          d2 = paramArrayOfDouble1[(m - j + i8 - 1 + (j - 1) * paramInt5 + paramInt4)];
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          if (i != 0)
          {
            if ((j + i7 - i8 <= 0 ? 0 : 1) != 0) {}
            if (((j + i7 >= i12 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              dlartg_adapter(paramArrayOfDouble1[(i7 + 1 - 1 + (j - 1) * paramInt5 + paramInt4)], d2, paramArrayOfDouble4, paramInt1 + j + i7 - paramInt2 - 1 + paramInt10, paramArrayOfDouble4, j + i7 - paramInt2 - 1 + paramInt10, localdoubleW);
              d3 = -(paramArrayOfDouble2[(i9 - i7 - 1 + (j + i7 - 1) * paramInt7 + paramInt6)] * d2);
              paramArrayOfDouble4[(i12 - paramInt3 + j + i7 - 1 + paramInt10)] = (paramArrayOfDouble4[(paramInt1 + j + i7 - paramInt2 - 1 + paramInt10)] * d3 - paramArrayOfDouble4[(j + i7 - paramInt2 - 1 + paramInt10)] * paramArrayOfDouble1[(1 - 1 + (j + i7 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfDouble1[(1 - 1 + (j + i7 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(j + i7 - paramInt2 - 1 + paramInt10)] * d3 + paramArrayOfDouble4[(paramInt1 + j + i7 - paramInt2 - 1 + paramInt10)] * paramArrayOfDouble1[(1 - 1 + (j + i7 - 1) * paramInt5 + paramInt4)]);
              d2 = localdoubleW.val;
            }
          }
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12 + 1) * i8;
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          if (i != 0) {
            i6 = Math.min(i5, j - 2 * paramInt2 + i7 - 1);
          } else {
            i6 = i5;
          }
          i14 = (i6 + paramInt2 - 1) / i8;
          i2 = i3;
          for (i17 = (i6 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i2 - 1 + paramInt10)] *= paramArrayOfDouble1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfDouble1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)] * paramArrayOfDouble1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if ((i14 <= 0 ? 0 : 1) != 0) {
            Dlargv.dlargv(i14, paramArrayOfDouble1, 1 - 1 + (i3 + paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, i3 - 1 + paramInt10, i8, paramArrayOfDouble4, paramInt1 + i3 - 1 + paramInt10, i8);
          }
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Dlartv.dlartv(i13, paramArrayOfDouble1, i8 - i11 - 1 + (i3 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, paramInt2 - i11 - 1 + (i3 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i3 - 1 + paramInt10, paramArrayOfDouble4, i3 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Dlar2v.dlar2v(i13, paramArrayOfDouble1, i8 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i8 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, paramInt2 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i3 - 1 + paramInt10, paramArrayOfDouble4, i3 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i11 - 1 + (i4 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 1 - 1 + (i4 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i4 - 1 + paramInt10, paramArrayOfDouble4, i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i3;
            for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
            {
              Drot.drot(i15, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)], paramArrayOfDouble4[(i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += 1;
        }
        if (i != 0)
        {
          if ((n <= 0 ? 0 : 1) != 0) {}
          if (((i10 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramArrayOfDouble4[(i12 - paramInt3 + j + i10 - 1 + paramInt10)] = (-(paramArrayOfDouble2[(i9 - i10 - 1 + (j + i10 - 1) * paramInt7 + paramInt6)] * d2));
          }
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          if (i != 0) {
            i5 = j + i7 + 1 - Math.max(2, i7 + k - i12) * i8;
          } else {
            i5 = j + i7 + 1 - Math.max(1, i7 + k - i12) * i8;
          }
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + paramInt2 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i11 - 1 + (i4 + paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 1 - 1 + (i4 + paramInt2 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i12 - paramInt3 + i4 + paramInt2 - 1 + paramInt10, paramArrayOfDouble4, i12 - paramInt3 + i4 + paramInt2 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          i2 = i3;
          for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i12 - paramInt3 + i2 - 1 + paramInt10)] = paramArrayOfDouble4[(i12 - paramInt3 + i2 + paramInt2 - 1 + paramInt10)];
            paramArrayOfDouble4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)] = paramArrayOfDouble4[(paramInt1 + i12 - paramInt3 + i2 + paramInt2 - 1 + paramInt10)];
            i2 += i8;
          }
          i2 = i3;
          for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i12 - paramInt3 + i2 - 1 + paramInt10)] *= paramArrayOfDouble1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfDouble1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)] * paramArrayOfDouble1[(1 - 1 + (i2 + paramInt2 - 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if (i != 0)
          {
            if ((j + i7 <= i8 ? 0 : 1) != 0) {}
            if (((i7 > i10 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramArrayOfDouble4[(i12 - paramInt3 + j + i7 - paramInt2 - 1 + paramInt10)] = paramArrayOfDouble4[(i12 - paramInt3 + j + i7 - 1 + paramInt10)];
            }
          }
          i7 += -1;
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12) * i8;
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            Dlargv.dlargv(i13, paramArrayOfDouble1, 1 - 1 + (i3 + paramInt2 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, i12 - paramInt3 + i3 - 1 + paramInt10, i8, paramArrayOfDouble4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, i8);
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Dlartv.dlartv(i13, paramArrayOfDouble1, i8 - i11 - 1 + (i3 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, paramInt2 - i11 - 1 + (i3 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, paramArrayOfDouble4, i12 - paramInt3 + i3 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Dlar2v.dlar2v(i13, paramArrayOfDouble1, i8 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, i8 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, paramInt2 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, paramArrayOfDouble4, i12 - paramInt3 + i3 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i11 - 1 + (i4 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 1 - 1 + (i4 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i12 - paramInt3 + i4 - 1 + paramInt10, paramArrayOfDouble4, i12 - paramInt3 + i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i3;
            for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
            {
              Drot.drot(i15, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)], paramArrayOfDouble4[(i12 - paramInt3 + i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += -1;
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12 + 1) * i8;
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i11 - 1 + (i4 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 1 - 1 + (i4 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i4 - 1 + paramInt10, paramArrayOfDouble4, i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i7 += 1;
        }
        if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          i2 = 2;
          for (i16 = Math.min(j + paramInt3, i12) - 2 * paramInt2 - 1 - 2 + 1; i16 > 0; i16--)
          {
            paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)] = paramArrayOfDouble4[(paramInt1 + i2 + paramInt2 - 1 + paramInt10)];
            paramArrayOfDouble4[(i2 - 1 + paramInt10)] = paramArrayOfDouble4[(i2 + paramInt2 - 1 + paramInt10)];
            i2 += 1;
          }
        }
      }
      else
      {
        if (i != 0)
        {
          d1 = paramArrayOfDouble2[(1 - 1 + (j - 1) * paramInt7 + paramInt6)];
          i2 = m;
          for (i16 = j - m + 1; i16 > 0; i16--)
          {
            paramArrayOfDouble1[(j - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] /= d1;
            i2 += 1;
          }
          i2 = j;
          for (i16 = Math.min(paramInt1, j + paramInt2) - j + 1; i16 > 0; i16--)
          {
            paramArrayOfDouble1[(i2 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] /= d1;
            i2 += 1;
          }
          i7 = j + 1;
          for (i16 = j + i10 - (j + 1) + 1; i16 > 0; i16--)
          {
            i2 = i7;
            for (i17 = j + i10 - i7 + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i2 - i7 + 1 - 1 + (i7 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble1[(i2 - i7 + 1 - 1 + (i7 - 1) * paramInt5 + paramInt4)] - paramArrayOfDouble2[(i2 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(i7 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] - paramArrayOfDouble2[(i7 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(i2 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)] + paramArrayOfDouble1[(1 - 1 + (j - 1) * paramInt5 + paramInt4)] * paramArrayOfDouble2[(i2 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble2[(i7 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)]);
              i2 += 1;
            }
            i2 = j + i10 + 1;
            for (i17 = Math.min(paramInt1, j + paramInt2) - (j + i10 + 1) + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i2 - i7 + 1 - 1 + (i7 - 1) * paramInt5 + paramInt4)] -= paramArrayOfDouble2[(i7 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(i2 - j + 1 - 1 + (j - 1) * paramInt5 + paramInt4)];
              i2 += 1;
            }
            i7 += 1;
          }
          i2 = m;
          for (i16 = j - m + 1; i16 > 0; i16--)
          {
            i7 = j + 1;
            for (i17 = Math.min(i2 + paramInt2, j + i10) - (j + 1) + 1; i17 > 0; i17--)
            {
              paramArrayOfDouble1[(i7 - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)] -= paramArrayOfDouble2[(i7 - j + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * paramArrayOfDouble1[(j - i2 + 1 - 1 + (i2 - 1) * paramInt5 + paramInt4)];
              i7 += 1;
            }
            i2 += 1;
          }
          if (bool2)
          {
            Dscal.dscal(i15, 1.0D / d1, paramArrayOfDouble3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1);
            if ((i10 <= 0 ? 0 : 1) != 0) {
              Dger.dger(i15, i10, -1.0D, paramArrayOfDouble3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble2, 2 - 1 + (j - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble3, 1 - 1 + (j + 1 - 1) * paramInt9 + paramInt8, paramInt9);
            }
          }
          d2 = paramArrayOfDouble1[(j - m + 1 - 1 + (m - 1) * paramInt5 + paramInt4)];
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          if (i != 0)
          {
            if ((j + i7 - i8 <= 0 ? 0 : 1) != 0) {}
            if (((j + i7 >= i12 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              dlartg_adapter(paramArrayOfDouble1[(i8 - i7 - 1 + (j + i7 - paramInt2 - 1) * paramInt5 + paramInt4)], d2, paramArrayOfDouble4, paramInt1 + j + i7 - paramInt2 - 1 + paramInt10, paramArrayOfDouble4, j + i7 - paramInt2 - 1 + paramInt10, localdoubleW);
              d3 = -(paramArrayOfDouble2[(i7 + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * d2);
              paramArrayOfDouble4[(i12 - paramInt3 + j + i7 - 1 + paramInt10)] = (paramArrayOfDouble4[(paramInt1 + j + i7 - paramInt2 - 1 + paramInt10)] * d3 - paramArrayOfDouble4[(j + i7 - paramInt2 - 1 + paramInt10)] * paramArrayOfDouble1[(i8 - 1 + (j + i7 - paramInt2 - 1) * paramInt5 + paramInt4)]);
              paramArrayOfDouble1[(i8 - 1 + (j + i7 - paramInt2 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(j + i7 - paramInt2 - 1 + paramInt10)] * d3 + paramArrayOfDouble4[(paramInt1 + j + i7 - paramInt2 - 1 + paramInt10)] * paramArrayOfDouble1[(i8 - 1 + (j + i7 - paramInt2 - 1) * paramInt5 + paramInt4)]);
              d2 = localdoubleW.val;
            }
          }
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12 + 1) * i8;
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          if (i != 0) {
            i6 = Math.min(i5, j - 2 * paramInt2 + i7 - 1);
          } else {
            i6 = i5;
          }
          i14 = (i6 + paramInt2 - 1) / i8;
          i2 = i3;
          for (i17 = (i6 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i2 - 1 + paramInt10)] *= paramArrayOfDouble1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfDouble1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)] * paramArrayOfDouble1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if ((i14 <= 0 ? 0 : 1) != 0) {
            Dlargv.dlargv(i14, paramArrayOfDouble1, i8 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, i3 - 1 + paramInt10, i8, paramArrayOfDouble4, paramInt1 + i3 - 1 + paramInt10, i8);
          }
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Dlartv.dlartv(i13, paramArrayOfDouble1, i11 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 2 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i3 - 1 + paramInt10, paramArrayOfDouble4, i3 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Dlar2v.dlar2v(i13, paramArrayOfDouble1, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, 1 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, 2 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i3 - 1 + paramInt10, paramArrayOfDouble4, i3 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i8 - i11 + 1 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i8 - i11 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i4 - 1 + paramInt10, paramArrayOfDouble4, i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i3;
            for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
            {
              Drot.drot(i15, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)], paramArrayOfDouble4[(i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += 1;
        }
        if (i != 0)
        {
          if ((n <= 0 ? 0 : 1) != 0) {}
          if (((i10 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
            paramArrayOfDouble4[(i12 - paramInt3 + j + i10 - 1 + paramInt10)] = (-(paramArrayOfDouble2[(i10 + 1 - 1 + (j - 1) * paramInt7 + paramInt6)] * d2));
          }
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          if (i != 0) {
            i5 = j + i7 + 1 - Math.max(2, i7 + k - i12) * i8;
          } else {
            i5 = j + i7 + 1 - Math.max(1, i7 + k - i12) * i8;
          }
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + paramInt2 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i8 - i11 + 1 - 1 + (i4 + i11 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i8 - i11 - 1 + (i4 + i11 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i12 - paramInt3 + i4 + paramInt2 - 1 + paramInt10, paramArrayOfDouble4, i12 - paramInt3 + i4 + paramInt2 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          i2 = i3;
          for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i12 - paramInt3 + i2 - 1 + paramInt10)] = paramArrayOfDouble4[(i12 - paramInt3 + i2 + paramInt2 - 1 + paramInt10)];
            paramArrayOfDouble4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)] = paramArrayOfDouble4[(paramInt1 + i12 - paramInt3 + i2 + paramInt2 - 1 + paramInt10)];
            i2 += i8;
          }
          i2 = i3;
          for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
          {
            paramArrayOfDouble4[(i12 - paramInt3 + i2 - 1 + paramInt10)] *= paramArrayOfDouble1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)];
            paramArrayOfDouble1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)] = (paramArrayOfDouble4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)] * paramArrayOfDouble1[(i8 - 1 + (i2 - 1 - 1) * paramInt5 + paramInt4)]);
            i2 += i8;
          }
          if (i != 0)
          {
            if ((j + i7 <= i8 ? 0 : 1) != 0) {}
            if (((i7 > i10 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              paramArrayOfDouble4[(i12 - paramInt3 + j + i7 - paramInt2 - 1 + paramInt10)] = paramArrayOfDouble4[(i12 - paramInt3 + j + i7 - 1 + paramInt10)];
            }
          }
          i7 += -1;
        }
        i7 = paramInt3;
        for (i16 = (1 - paramInt3 + -1) / -1; i16 > 0; i16--)
        {
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12) * i8;
          i13 = (i5 + paramInt2 - 1) / i8;
          i3 = i5 - (i13 - 1) * i8;
          if ((i13 <= 0 ? 0 : 1) != 0)
          {
            Dlargv.dlargv(i13, paramArrayOfDouble1, i8 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, i12 - paramInt3 + i3 - 1 + paramInt10, i8, paramArrayOfDouble4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, i8);
            i11 = 1;
            for (i17 = paramInt2 - 1 - 1 + 1; i17 > 0; i17--)
            {
              Dlartv.dlartv(i13, paramArrayOfDouble1, i11 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i11 + 2 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, paramArrayOfDouble4, i12 - paramInt3 + i3 - 1 + paramInt10, i8);
              i11 += 1;
            }
            Dlar2v.dlar2v(i13, paramArrayOfDouble1, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, 1 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, paramArrayOfDouble1, 2 - 1 + (i3 - 1 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i12 - paramInt3 + i3 - 1 + paramInt10, paramArrayOfDouble4, i12 - paramInt3 + i3 - 1 + paramInt10, i8);
          }
          i11 = paramInt2 - 1;
          for (i17 = (paramInt3 - i7 + 1 - (paramInt2 - 1) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i8 - i11 + 1 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i8 - i11 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i12 - paramInt3 + i4 - 1 + paramInt10, paramArrayOfDouble4, i12 - paramInt3 + i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          if (bool2)
          {
            i2 = i3;
            for (i17 = (i5 - i3 + i8) / i8; i17 > 0; i17--)
            {
              Drot.drot(i15, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble4[(paramInt1 + i12 - paramInt3 + i2 - 1 + paramInt10)], paramArrayOfDouble4[(i12 - paramInt3 + i2 - 1 + paramInt10)]);
              i2 += i8;
            }
          }
          i7 += -1;
        }
        i7 = 1;
        for (i16 = paramInt3 - 1 - 1 + 1; i16 > 0; i16--)
        {
          i5 = j + i7 + 1 - Math.max(1, i7 + k - i12 + 1) * i8;
          i11 = paramInt3 - i7;
          for (i17 = (1 - (paramInt3 - i7) + -1) / -1; i17 > 0; i17--)
          {
            i14 = (i5 + i11 - 1) / i8;
            i4 = i5 - (i14 - 1) * i8;
            if ((i14 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i14, paramArrayOfDouble1, i8 - i11 + 1 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble1, i8 - i11 - 1 + (i4 - i8 + i11 - 1) * paramInt5 + paramInt4, i1, paramArrayOfDouble4, paramInt1 + i4 - 1 + paramInt10, paramArrayOfDouble4, i4 - 1 + paramInt10, i8);
            }
            i11 += -1;
          }
          i7 += 1;
        }
        if ((paramInt3 <= 1 ? 0 : 1) != 0)
        {
          i2 = 2;
          for (i16 = Math.min(j + paramInt3, i12) - 2 * paramInt2 - 1 - 2 + 1; i16 > 0; i16--)
          {
            paramArrayOfDouble4[(paramInt1 + i2 - 1 + paramInt10)] = paramArrayOfDouble4[(paramInt1 + i2 + paramInt2 - 1 + paramInt10)];
            paramArrayOfDouble4[(i2 - 1 + paramInt10)] = paramArrayOfDouble4[(i2 + paramInt2 - 1 + paramInt10)];
            i2 += 1;
          }
        }
      }
    }
  }
  
  private static void dlartg_adapter(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, doubleW paramdoubleW)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt1]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble2[paramInt2]);
    Dlartg.dlartg(paramDouble1, paramDouble2, localdoubleW1, localdoubleW2, paramdoubleW);
    paramArrayOfDouble1[paramInt1] = localdoubleW1.val;
    paramArrayOfDouble2[paramInt2] = localdoubleW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsbgst.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */