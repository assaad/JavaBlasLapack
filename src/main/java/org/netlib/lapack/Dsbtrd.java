package org.netlib.lapack;

import org.netlib.blas.Drot;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dsbtrd
{
  public static void dsbtrd(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, int paramInt8, double[] paramArrayOfDouble5, int paramInt9, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
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
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    int i21 = 0;
    int i22 = 0;
    doubleW localdoubleW = new doubleW(0.0D);
    bool1 = Lsame.lsame(paramString1, "V");
    i = (!bool1) && (!Lsame.lsame(paramString1, "U")) ? 0 : 1;
    bool2 = Lsame.lsame(paramString2, "U");
    i14 = paramInt2 + 1;
    i15 = paramInt2 - 1;
    i1 = paramInt4 - 1;
    i4 = 1;
    paramintW.val = 0;
    if ((((i ^ 0x1) != 0) && ((Lsame.lsame(paramString1, "N") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
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
    else if ((paramInt4 >= i14 ? 0 : 1) != 0)
    {
      paramintW.val = -6;
    }
    else
    {
      if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {}
      if ((i != 0 ? 1 : 0) != 0) {
        paramintW.val = -10;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSBTRD", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if (bool1) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble4, paramInt7, paramInt8);
    }
    n = i14 * paramInt4;
    i16 = Math.min(paramInt1 - 1, paramInt2);
    int i23;
    int i24;
    int i25;
    if (bool2)
    {
      if ((paramInt2 <= 1 ? 0 : 1) != 0)
      {
        i21 = 0;
        i6 = i16 + 2;
        i9 = 1;
        j = 1;
        for (i23 = paramInt1 - 2 - 1 + 1; i23 > 0; i23--)
        {
          i13 = i16 + 1;
          for (i24 = (2 - (i16 + 1) + -1) / -1; i24 > 0; i24--)
          {
            i6 += i16;
            i9 += i16;
            if ((i21 <= 0 ? 0 : 1) != 0)
            {
              Dlargv.dlargv(i21, paramArrayOfDouble1, 1 - 1 + (i6 - 1 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble5, i6 - 1 + paramInt9, i14, paramArrayOfDouble2, i6 - 1 + paramInt5, i14);
              if ((i21 < 2 * paramInt2 - 1 ? 0 : 1) != 0)
              {
                i17 = 1;
                for (i25 = paramInt2 - 1 - 1 + 1; i25 > 0; i25--)
                {
                  Dlartv.dlartv(i21, paramArrayOfDouble1, i17 + 1 - 1 + (i6 - 1 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble1, i17 - 1 + (i6 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble2, i6 - 1 + paramInt5, paramArrayOfDouble5, i6 - 1 + paramInt9, i14);
                  i17 += 1;
                }
              }
              else
              {
                i10 = i6 + (i21 - 1) * i14;
                i12 = i6;
                for (i25 = (i10 - i6 + i14) / i14; i25 > 0; i25--)
                {
                  Drot.drot(i15, paramArrayOfDouble1, 2 - 1 + (i12 - 1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, 1 - 1 + (i12 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2[(i12 - 1 + paramInt5)], paramArrayOfDouble5[(i12 - 1 + paramInt9)]);
                  i12 += i14;
                }
              }
            }
            if ((i13 <= 2 ? 0 : 1) != 0)
            {
              if ((i13 > paramInt1 - j + 1 ? 0 : 1) != 0)
              {
                dlartg_adapter(paramArrayOfDouble1[(paramInt2 - i13 + 3 - 1 + (j + i13 - 2 - 1) * paramInt4 + paramInt3)], paramArrayOfDouble1[(paramInt2 - i13 + 2 - 1 + (j + i13 - 1 - 1) * paramInt4 + paramInt3)], paramArrayOfDouble2, j + i13 - 1 - 1 + paramInt5, paramArrayOfDouble5, j + i13 - 1 - 1 + paramInt9, localdoubleW);
                paramArrayOfDouble1[(paramInt2 - i13 + 3 - 1 + (j + i13 - 2 - 1) * paramInt4 + paramInt3)] = localdoubleW.val;
                Drot.drot(i13 - 3, paramArrayOfDouble1, paramInt2 - i13 + 4 - 1 + (j + i13 - 2 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, paramInt2 - i13 + 3 - 1 + (j + i13 - 1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2[(j + i13 - 1 - 1 + paramInt5)], paramArrayOfDouble5[(j + i13 - 1 - 1 + paramInt9)]);
              }
              i21 += 1;
              i6 = i6 - i16 - 1;
            }
            if ((i21 <= 0 ? 0 : 1) != 0) {
              Dlar2v.dlar2v(i21, paramArrayOfDouble1, i14 - 1 + (i6 - 1 - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, i14 - 1 + (i6 - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, paramInt2 - 1 + (i6 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble2, i6 - 1 + paramInt5, paramArrayOfDouble5, i6 - 1 + paramInt9, i14);
            }
            if ((i21 <= 0 ? 0 : 1) != 0) {
              if ((2 * paramInt2 - 1 >= i21 ? 0 : 1) != 0)
              {
                i17 = 1;
                for (i25 = paramInt2 - 1 - 1 + 1; i25 > 0; i25--)
                {
                  if ((i9 + i17 <= paramInt1 ? 0 : 1) != 0) {
                    i22 = i21 - 1;
                  } else {
                    i22 = i21;
                  }
                  if ((i22 <= 0 ? 0 : 1) != 0) {
                    Dlartv.dlartv(i22, paramArrayOfDouble1, paramInt2 - i17 - 1 + (i6 + i17 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble1, paramInt2 - i17 + 1 - 1 + (i6 + i17 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble2, i6 - 1 + paramInt5, paramArrayOfDouble5, i6 - 1 + paramInt9, i14);
                  }
                  i17 += 1;
                }
              }
              else
              {
                i7 = i6 + i14 * (i21 - 2);
                if ((i7 < i6 ? 0 : 1) != 0)
                {
                  i11 = i6;
                  for (i25 = (i7 - i6 + i14) / i14; i25 > 0; i25--)
                  {
                    Drot.drot(paramInt2 - 1, paramArrayOfDouble1, paramInt2 - 1 - 1 + (i11 + 1 - 1) * paramInt4 + paramInt3, i1, paramArrayOfDouble1, paramInt2 - 1 + (i11 + 1 - 1) * paramInt4 + paramInt3, i1, paramArrayOfDouble2[(i11 - 1 + paramInt5)], paramArrayOfDouble5[(i11 - 1 + paramInt9)]);
                    i11 += i14;
                  }
                }
                i19 = Math.min(i15, paramInt1 - i9);
                i18 = i7 + i14;
                if ((i19 <= 0 ? 0 : 1) != 0) {
                  Drot.drot(i19, paramArrayOfDouble1, paramInt2 - 1 - 1 + (i18 + 1 - 1) * paramInt4 + paramInt3, i1, paramArrayOfDouble1, paramInt2 - 1 + (i18 + 1 - 1) * paramInt4 + paramInt3, i1, paramArrayOfDouble2[(i18 - 1 + paramInt5)], paramArrayOfDouble5[(i18 - 1 + paramInt9)]);
                }
              }
            }
            if (i != 0) {
              if (bool1)
              {
                i4 = Math.max(i4, i9);
                k = Math.max(0, i13 - 3);
                i2 = 1 + j * paramInt2;
                if ((i13 != 2 ? 0 : 1) != 0) {
                  i2 += paramInt2;
                }
                i2 = Math.min(i2, i4);
                i5 = i6;
                for (i25 = (i9 - i6 + i14) / i14; i25 > 0; i25--)
                {
                  m = j - k / i15;
                  k += 1;
                  i3 = Math.max(1, i5 - m);
                  i20 = 1 + i2 - i3;
                  i2 = Math.min(i2 + paramInt2, i4);
                  Drot.drot(i20, paramArrayOfDouble4, i3 - 1 + (i5 - 1 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble4, i3 - 1 + (i5 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble2[(i5 - 1 + paramInt5)], paramArrayOfDouble5[(i5 - 1 + paramInt9)]);
                  i5 += i14;
                }
              }
              else
              {
                i5 = i6;
                for (i25 = (i9 - i6 + i14) / i14; i25 > 0; i25--)
                {
                  Drot.drot(paramInt1, paramArrayOfDouble4, 1 - 1 + (i5 - 1 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble4, 1 - 1 + (i5 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble2[(i5 - 1 + paramInt5)], paramArrayOfDouble5[(i5 - 1 + paramInt9)]);
                  i5 += i14;
                }
              }
            }
            if ((i9 + i16 <= paramInt1 ? 0 : 1) != 0)
            {
              i21 -= 1;
              i9 = i9 - i16 - 1;
            }
            i5 = i6;
            for (i25 = (i9 - i6 + i14) / i14; i25 > 0; i25--)
            {
              paramArrayOfDouble5[(i5 + paramInt2 - 1 + paramInt9)] = (paramArrayOfDouble5[(i5 - 1 + paramInt9)] * paramArrayOfDouble1[(1 - 1 + (i5 + paramInt2 - 1) * paramInt4 + paramInt3)]);
              paramArrayOfDouble1[(1 - 1 + (i5 + paramInt2 - 1) * paramInt4 + paramInt3)] = (paramArrayOfDouble2[(i5 - 1 + paramInt5)] * paramArrayOfDouble1[(1 - 1 + (i5 + paramInt2 - 1) * paramInt4 + paramInt3)]);
              i5 += i14;
            }
            i13 += -1;
          }
          j += 1;
        }
      }
      if ((paramInt2 <= 0 ? 0 : 1) != 0)
      {
        j = 1;
        for (i23 = paramInt1 - 1 - 1 + 1; i23 > 0; i23--)
        {
          paramArrayOfDouble3[(j - 1 + paramInt6)] = paramArrayOfDouble1[(paramInt2 - 1 + (j + 1 - 1) * paramInt4 + paramInt3)];
          j += 1;
        }
      }
      else
      {
        j = 1;
        for (i23 = paramInt1 - 1 - 1 + 1; i23 > 0; i23--)
        {
          paramArrayOfDouble3[(j - 1 + paramInt6)] = 0.0D;
          j += 1;
        }
      }
      j = 1;
      for (i23 = paramInt1 - 1 + 1; i23 > 0; i23--)
      {
        paramArrayOfDouble2[(j - 1 + paramInt5)] = paramArrayOfDouble1[(i14 - 1 + (j - 1) * paramInt4 + paramInt3)];
        j += 1;
      }
    }
    else
    {
      if ((paramInt2 <= 1 ? 0 : 1) != 0)
      {
        i21 = 0;
        i6 = i16 + 2;
        i9 = 1;
        j = 1;
        for (i23 = paramInt1 - 2 - 1 + 1; i23 > 0; i23--)
        {
          i13 = i16 + 1;
          for (i24 = (2 - (i16 + 1) + -1) / -1; i24 > 0; i24--)
          {
            i6 += i16;
            i9 += i16;
            if ((i21 <= 0 ? 0 : 1) != 0)
            {
              Dlargv.dlargv(i21, paramArrayOfDouble1, i14 - 1 + (i6 - i14 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble5, i6 - 1 + paramInt9, i14, paramArrayOfDouble2, i6 - 1 + paramInt5, i14);
              if ((i21 <= 2 * paramInt2 - 1 ? 0 : 1) != 0)
              {
                i17 = 1;
                for (i25 = paramInt2 - 1 - 1 + 1; i25 > 0; i25--)
                {
                  Dlartv.dlartv(i21, paramArrayOfDouble1, i14 - i17 - 1 + (i6 - i14 + i17 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble1, i14 - i17 + 1 - 1 + (i6 - i14 + i17 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble2, i6 - 1 + paramInt5, paramArrayOfDouble5, i6 - 1 + paramInt9, i14);
                  i17 += 1;
                }
              }
              else
              {
                i10 = i6 + i14 * (i21 - 1);
                i12 = i6;
                for (i25 = (i10 - i6 + i14) / i14; i25 > 0; i25--)
                {
                  Drot.drot(i15, paramArrayOfDouble1, paramInt2 - 1 + (i12 - paramInt2 - 1) * paramInt4 + paramInt3, i1, paramArrayOfDouble1, i14 - 1 + (i12 - paramInt2 - 1) * paramInt4 + paramInt3, i1, paramArrayOfDouble2[(i12 - 1 + paramInt5)], paramArrayOfDouble5[(i12 - 1 + paramInt9)]);
                  i12 += i14;
                }
              }
            }
            if ((i13 <= 2 ? 0 : 1) != 0)
            {
              if ((i13 > paramInt1 - j + 1 ? 0 : 1) != 0)
              {
                dlartg_adapter(paramArrayOfDouble1[(i13 - 1 - 1 + (j - 1) * paramInt4 + paramInt3)], paramArrayOfDouble1[(i13 - 1 + (j - 1) * paramInt4 + paramInt3)], paramArrayOfDouble2, j + i13 - 1 - 1 + paramInt5, paramArrayOfDouble5, j + i13 - 1 - 1 + paramInt9, localdoubleW);
                paramArrayOfDouble1[(i13 - 1 - 1 + (j - 1) * paramInt4 + paramInt3)] = localdoubleW.val;
                Drot.drot(i13 - 3, paramArrayOfDouble1, i13 - 2 - 1 + (j + 1 - 1) * paramInt4 + paramInt3, paramInt4 - 1, paramArrayOfDouble1, i13 - 1 - 1 + (j + 1 - 1) * paramInt4 + paramInt3, paramInt4 - 1, paramArrayOfDouble2[(j + i13 - 1 - 1 + paramInt5)], paramArrayOfDouble5[(j + i13 - 1 - 1 + paramInt9)]);
              }
              i21 += 1;
              i6 = i6 - i16 - 1;
            }
            if ((i21 <= 0 ? 0 : 1) != 0) {
              Dlar2v.dlar2v(i21, paramArrayOfDouble1, 1 - 1 + (i6 - 1 - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, 1 - 1 + (i6 - 1) * paramInt4 + paramInt3, paramArrayOfDouble1, 2 - 1 + (i6 - 1 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble2, i6 - 1 + paramInt5, paramArrayOfDouble5, i6 - 1 + paramInt9, i14);
            }
            if ((i21 <= 0 ? 0 : 1) != 0) {
              if ((i21 <= 2 * paramInt2 - 1 ? 0 : 1) != 0)
              {
                i17 = 1;
                for (i25 = paramInt2 - 1 - 1 + 1; i25 > 0; i25--)
                {
                  if ((i9 + i17 <= paramInt1 ? 0 : 1) != 0) {
                    i22 = i21 - 1;
                  } else {
                    i22 = i21;
                  }
                  if ((i22 <= 0 ? 0 : 1) != 0) {
                    Dlartv.dlartv(i22, paramArrayOfDouble1, i17 + 2 - 1 + (i6 - 1 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble1, i17 + 1 - 1 + (i6 - 1) * paramInt4 + paramInt3, n, paramArrayOfDouble2, i6 - 1 + paramInt5, paramArrayOfDouble5, i6 - 1 + paramInt9, i14);
                  }
                  i17 += 1;
                }
              }
              else
              {
                i7 = i6 + i14 * (i21 - 2);
                if ((i7 < i6 ? 0 : 1) != 0)
                {
                  i8 = i6;
                  for (i25 = (i7 - i6 + i14) / i14; i25 > 0; i25--)
                  {
                    Drot.drot(i15, paramArrayOfDouble1, 3 - 1 + (i8 - 1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, 2 - 1 + (i8 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2[(i8 - 1 + paramInt5)], paramArrayOfDouble5[(i8 - 1 + paramInt9)]);
                    i8 += i14;
                  }
                }
                i19 = Math.min(i15, paramInt1 - i9);
                i18 = i7 + i14;
                if ((i19 <= 0 ? 0 : 1) != 0) {
                  Drot.drot(i19, paramArrayOfDouble1, 3 - 1 + (i18 - 1 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble1, 2 - 1 + (i18 - 1) * paramInt4 + paramInt3, 1, paramArrayOfDouble2[(i18 - 1 + paramInt5)], paramArrayOfDouble5[(i18 - 1 + paramInt9)]);
                }
              }
            }
            if (i != 0) {
              if (bool1)
              {
                i4 = Math.max(i4, i9);
                k = Math.max(0, i13 - 3);
                i2 = 1 + j * paramInt2;
                if ((i13 != 2 ? 0 : 1) != 0) {
                  i2 += paramInt2;
                }
                i2 = Math.min(i2, i4);
                i5 = i6;
                for (i25 = (i9 - i6 + i14) / i14; i25 > 0; i25--)
                {
                  m = j - k / i15;
                  k += 1;
                  i3 = Math.max(1, i5 - m);
                  i20 = 1 + i2 - i3;
                  i2 = Math.min(i2 + paramInt2, i4);
                  Drot.drot(i20, paramArrayOfDouble4, i3 - 1 + (i5 - 1 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble4, i3 - 1 + (i5 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble2[(i5 - 1 + paramInt5)], paramArrayOfDouble5[(i5 - 1 + paramInt9)]);
                  i5 += i14;
                }
              }
              else
              {
                i5 = i6;
                for (i25 = (i9 - i6 + i14) / i14; i25 > 0; i25--)
                {
                  Drot.drot(paramInt1, paramArrayOfDouble4, 1 - 1 + (i5 - 1 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble4, 1 - 1 + (i5 - 1) * paramInt8 + paramInt7, 1, paramArrayOfDouble2[(i5 - 1 + paramInt5)], paramArrayOfDouble5[(i5 - 1 + paramInt9)]);
                  i5 += i14;
                }
              }
            }
            if ((i9 + i16 <= paramInt1 ? 0 : 1) != 0)
            {
              i21 -= 1;
              i9 = i9 - i16 - 1;
            }
            i5 = i6;
            for (i25 = (i9 - i6 + i14) / i14; i25 > 0; i25--)
            {
              paramArrayOfDouble5[(i5 + paramInt2 - 1 + paramInt9)] = (paramArrayOfDouble5[(i5 - 1 + paramInt9)] * paramArrayOfDouble1[(i14 - 1 + (i5 - 1) * paramInt4 + paramInt3)]);
              paramArrayOfDouble1[(i14 - 1 + (i5 - 1) * paramInt4 + paramInt3)] = (paramArrayOfDouble2[(i5 - 1 + paramInt5)] * paramArrayOfDouble1[(i14 - 1 + (i5 - 1) * paramInt4 + paramInt3)]);
              i5 += i14;
            }
            i13 += -1;
          }
          j += 1;
        }
      }
      if ((paramInt2 <= 0 ? 0 : 1) != 0)
      {
        j = 1;
        for (i23 = paramInt1 - 1 - 1 + 1; i23 > 0; i23--)
        {
          paramArrayOfDouble3[(j - 1 + paramInt6)] = paramArrayOfDouble1[(2 - 1 + (j - 1) * paramInt4 + paramInt3)];
          j += 1;
        }
      }
      else
      {
        j = 1;
        for (i23 = paramInt1 - 1 - 1 + 1; i23 > 0; i23--)
        {
          paramArrayOfDouble3[(j - 1 + paramInt6)] = 0.0D;
          j += 1;
        }
      }
      j = 1;
      for (i23 = paramInt1 - 1 + 1; i23 > 0; i23--)
      {
        paramArrayOfDouble2[(j - 1 + paramInt5)] = paramArrayOfDouble1[(1 - 1 + (j - 1) * paramInt4 + paramInt3)];
        j += 1;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsbtrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */