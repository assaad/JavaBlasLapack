package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaqr4
{
  public static void dlaqr4(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, intW paramintW)
  {
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    doubleW localdoubleW6 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    int i = 0;
    intW localintW1 = new intW(0);
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
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
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
    int i23 = 0;
    int i24 = 0;
    int i25 = 0;
    String str = new String("  ");
    double[] arrayOfDouble = new double[1 * 1];
    paramintW.val = 0;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble5[(1 - 1 + paramInt12)] = 1.0D;
      return;
    }
    if (paramBoolean1) {
      str = Util.stringInsert(str, "S", 1, 1);
    } else {
      str = Util.stringInsert(str, "E", 1, 1);
    }
    if (paramBoolean2) {
      str = Util.stringInsert(str, "V", 2, 2);
    } else {
      str = Util.stringInsert(str, "N", 2, 2);
    }
    if ((paramInt1 > 11 ? 0 : 1) != 0)
    {
      i11 = 1;
      if ((paramInt13 == -1 ? 0 : 1) != 0) {
        Dlahqr.dlahqr(paramBoolean1, paramBoolean2, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11, paramintW);
      }
    }
    else
    {
      paramintW.val = 0;
      i23 = Ilaenv.ilaenv(13, "DLAQR4", str, paramInt1, paramInt2, paramInt3, paramInt13);
      i23 = Math.max(2, i23);
      i23 = Util.min(paramInt3 - paramInt2 + 1, (paramInt1 - 1) / 3, i23);
      i21 = i23;
      i19 = Ilaenv.ilaenv(15, "DLAQR4", str, paramInt1, paramInt2, paramInt3, paramInt13);
      i19 = Util.min(i19, (paramInt1 + 6) / 9, paramInt3 - paramInt2);
      i19 = Math.max(2, i19 - i19 % 2);
      Dlaqr2.dlaqr2(paramBoolean1, paramBoolean2, paramInt1, paramInt2, paramInt3, i23 + 1, paramArrayOfDouble1, paramInt4, paramInt5, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11, localintW3, localintW2, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramArrayOfDouble1, paramInt4, paramInt5, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, paramInt1, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble5, paramInt12, -1);
      i11 = Math.max(3 * i19 / 2, (int)paramArrayOfDouble5[(1 - 1 + paramInt12)]);
      if ((paramInt13 != -1 ? 0 : 1) != 0)
      {
        paramArrayOfDouble5[(1 - 1 + paramInt12)] = i11;
        return;
      }
      i16 = Ilaenv.ilaenv(12, "DLAQR4", str, paramInt1, paramInt2, paramInt3, paramInt13);
      i16 = Math.max(11, i16);
      i15 = Ilaenv.ilaenv(14, "DLAQR4", str, paramInt1, paramInt2, paramInt3, paramInt13);
      i15 = Math.max(0, i15);
      n = Ilaenv.ilaenv(16, "DLAQR4", str, paramInt1, paramInt2, paramInt3, paramInt13);
      n = Math.max(0, n);
      n = Math.min(2, n);
      i22 = Math.min((paramInt1 - 1) / 3, paramInt13 / 2);
      i18 = Math.min((paramInt1 + 6) / 9, 2 * paramInt13 / 3);
      i18 -= i18 % 2;
      i12 = 1;
      k = Math.max(30, 2 * 6) * Math.max(10, paramInt3 - paramInt2 + 1);
      i1 = paramInt3;
      j = 1;
      int i26 = k - 1 + 1;
      while ((i1 >= paramInt2 ? 0 : 1) == 0)
      {
        m = i1;
        int i27 = (paramInt2 + 1 - i1 + -1) / -1;
        while ((paramArrayOfDouble1[(m - 1 + (m - 1 - 1) * paramInt5 + paramInt4)] != 0.0D ? 0 : 1) == 0)
        {
          m += -1;
          i27--;
          if (i27 <= 0) {
            m = paramInt2;
          }
        }
        i5 = m;
        i13 = i1 - i5 + 1;
        if ((i12 >= 5 ? 0 : 1) == 0) {}
        if (((i13 >= i21 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          i24 = 1;
          if ((i13 > Math.min(i16, i22) ? 0 : 1) != 0)
          {
            i21 = i13;
          }
          else
          {
            i21 = Util.min(i23, i13, i22);
            if ((i21 >= i22 ? 0 : 1) != 0) {
              if ((i21 < i13 - 1 ? 0 : 1) != 0)
              {
                i21 = i13;
              }
              else
              {
                i9 = i1 - i21 + 1;
                if ((Math.abs(paramArrayOfDouble1[(i9 - 1 + (i9 - 1 - 1) * paramInt5 + paramInt4)]) <= Math.abs(paramArrayOfDouble1[(i9 - 1 - 1 + (i9 - 2 - 1) * paramInt5 + paramInt4)]) ? 0 : 1) != 0) {
                  i21 += 1;
                }
              }
            }
          }
        }
        else
        {
          if (i24 != 0) {}
          if (((i21 >= Math.min(i22, i13) ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            i21 = Util.min(i22, i13, 2 * i21);
          }
          else
          {
            i24 = 0;
            if ((i21 != i13 ? 0 : 1) != 0) {}
            if (((i13 <= 2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
              i21 = i13 - 1;
            }
          }
        }
        i7 = paramInt1 - i21 + 1;
        i4 = i21 + 1;
        i14 = paramInt1 - i21 - 1 - i4 + 1;
        i10 = i21 + 2;
        i20 = paramInt1 - i21 - i10 + 1;
        Dlaqr2.dlaqr2(paramBoolean1, paramBoolean2, paramInt1, i5, i1, i21, paramArrayOfDouble1, paramInt4, paramInt5, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11, localintW3, localintW2, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramArrayOfDouble1, i7 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, i14, paramArrayOfDouble1, i7 - 1 + (i4 - 1) * paramInt5 + paramInt4, paramInt5, i20, paramArrayOfDouble1, i10 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble5, paramInt12, paramInt13);
        i1 -= localintW2.val;
        i3 = i1 - localintW3.val + 1;
        if ((localintW2.val != 0 ? 0 : 1) == 0) {
          if ((100 * localintW2.val > i21 * i15 ? 0 : 1) == 0) {}
        }
        if ((((i1 - i5 + 1 <= Math.min(i16, i22) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          i17 = Util.min(i18, i19, Math.max(2, i1 - i5));
          i17 -= i17 % 2;
          if ((i12 % 6 != 0 ? 0 : 1) != 0)
          {
            i3 = i1 - i17 + 1;
            i = i1;
            for (i27 = (Math.max(i3 + 1, i5 + 2) - i1 + -2) / -2; i27 > 0; i27--)
            {
              d1 = Math.abs(paramArrayOfDouble1[(i - 1 + (i - 1 - 1) * paramInt5 + paramInt4)]) + Math.abs(paramArrayOfDouble1[(i - 1 - 1 + (i - 2 - 1) * paramInt5 + paramInt4)]);
              localdoubleW1.val = (0.75D * d1 + paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)]);
              localdoubleW2.val = d1;
              localdoubleW3.val = (-0.4375D * d1);
              localdoubleW5.val = localdoubleW1.val;
              dlanv2_adapter(localdoubleW1, localdoubleW2, localdoubleW3, localdoubleW5, paramArrayOfDouble2, i - 1 - 1 + paramInt6, paramArrayOfDouble3, i - 1 - 1 + paramInt7, paramArrayOfDouble2, i - 1 + paramInt6, paramArrayOfDouble3, i - 1 + paramInt7, localdoubleW4, localdoubleW6);
              i += -2;
            }
            if ((i3 != i5 ? 0 : 1) != 0)
            {
              paramArrayOfDouble2[(i3 + 1 - 1 + paramInt6)] = paramArrayOfDouble1[(i3 + 1 - 1 + (i3 + 1 - 1) * paramInt5 + paramInt4)];
              paramArrayOfDouble3[(i3 + 1 - 1 + paramInt7)] = 0.0D;
              paramArrayOfDouble2[(i3 - 1 + paramInt6)] = paramArrayOfDouble2[(i3 + 1 - 1 + paramInt6)];
              paramArrayOfDouble3[(i3 - 1 + paramInt7)] = paramArrayOfDouble3[(i3 + 1 - 1 + paramInt7)];
            }
          }
          else
          {
            if ((i1 - i3 + 1 > i17 / 2 ? 0 : 1) != 0)
            {
              i3 = i1 - i17 + 1;
              i4 = paramInt1 - i17 + 1;
              Dlacpy.dlacpy("A", i17, i17, paramArrayOfDouble1, i3 - 1 + (i3 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i4 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5);
              Dlahqr.dlahqr(false, false, i17, 1, i17, paramArrayOfDouble1, i4 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i3 - 1 + paramInt6, paramArrayOfDouble3, i3 - 1 + paramInt7, 1, 1, arrayOfDouble, 0, 1, localintW1);
              i3 += localintW1.val;
              if ((i3 < i1 ? 0 : 1) != 0)
              {
                localdoubleW1.val = paramArrayOfDouble1[(i1 - 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)];
                localdoubleW3.val = paramArrayOfDouble1[(i1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4)];
                localdoubleW2.val = paramArrayOfDouble1[(i1 - 1 - 1 + (i1 - 1) * paramInt5 + paramInt4)];
                localdoubleW5.val = paramArrayOfDouble1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)];
                dlanv2_adapter(localdoubleW1, localdoubleW2, localdoubleW3, localdoubleW5, paramArrayOfDouble2, i1 - 1 - 1 + paramInt6, paramArrayOfDouble3, i1 - 1 - 1 + paramInt7, paramArrayOfDouble2, i1 - 1 + paramInt6, paramArrayOfDouble3, i1 - 1 + paramInt7, localdoubleW4, localdoubleW6);
                i3 = i1 - 1;
              }
            }
            if ((i1 - i3 + 1 <= i17 ? 0 : 1) != 0)
            {
              i25 = 0;
              m = i1;
              for (i27 = (i3 + 1 - i1 + -1) / -1; i27 > 0; i27--)
              {
                if (i25 != 0) {
                  break;
                }
                i25 = 1;
                i = i3;
                for (int i28 = m - 1 - i3 + 1; i28 > 0; i28--)
                {
                  if ((Math.abs(paramArrayOfDouble2[(i - 1 + paramInt6)]) + Math.abs(paramArrayOfDouble3[(i - 1 + paramInt7)]) >= Math.abs(paramArrayOfDouble2[(i + 1 - 1 + paramInt6)]) + Math.abs(paramArrayOfDouble3[(i + 1 - 1 + paramInt7)]) ? 0 : 1) != 0)
                  {
                    i25 = 0;
                    d2 = paramArrayOfDouble2[(i - 1 + paramInt6)];
                    paramArrayOfDouble2[(i - 1 + paramInt6)] = paramArrayOfDouble2[(i + 1 - 1 + paramInt6)];
                    paramArrayOfDouble2[(i + 1 - 1 + paramInt6)] = d2;
                    d2 = paramArrayOfDouble3[(i - 1 + paramInt7)];
                    paramArrayOfDouble3[(i - 1 + paramInt7)] = paramArrayOfDouble3[(i + 1 - 1 + paramInt7)];
                    paramArrayOfDouble3[(i + 1 - 1 + paramInt7)] = d2;
                  }
                  i += 1;
                }
                m += -1;
              }
            }
            i = i1;
            for (i27 = (i3 + 2 - i1 + -2) / -2; i27 > 0; i27--)
            {
              if ((paramArrayOfDouble3[(i - 1 + paramInt7)] == -paramArrayOfDouble3[(i - 1 - 1 + paramInt7)] ? 0 : 1) != 0)
              {
                d2 = paramArrayOfDouble2[(i - 1 + paramInt6)];
                paramArrayOfDouble2[(i - 1 + paramInt6)] = paramArrayOfDouble2[(i - 1 - 1 + paramInt6)];
                paramArrayOfDouble2[(i - 1 - 1 + paramInt6)] = paramArrayOfDouble2[(i - 2 - 1 + paramInt6)];
                paramArrayOfDouble2[(i - 2 - 1 + paramInt6)] = d2;
                d2 = paramArrayOfDouble3[(i - 1 + paramInt7)];
                paramArrayOfDouble3[(i - 1 + paramInt7)] = paramArrayOfDouble3[(i - 1 - 1 + paramInt7)];
                paramArrayOfDouble3[(i - 1 - 1 + paramInt7)] = paramArrayOfDouble3[(i - 2 - 1 + paramInt7)];
                paramArrayOfDouble3[(i - 2 - 1 + paramInt7)] = d2;
              }
              i += -2;
            }
          }
          if ((i1 - i3 + 1 != 2 ? 0 : 1) != 0) {
            if ((paramArrayOfDouble3[(i1 - 1 + paramInt7)] != 0.0D ? 0 : 1) != 0) {
              if ((Math.abs(paramArrayOfDouble2[(i1 - 1 + paramInt6)] - paramArrayOfDouble1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]) >= Math.abs(paramArrayOfDouble2[(i1 - 1 - 1 + paramInt6)] - paramArrayOfDouble1[(i1 - 1 + (i1 - 1) * paramInt5 + paramInt4)]) ? 0 : 1) != 0) {
                paramArrayOfDouble2[(i1 - 1 - 1 + paramInt6)] = paramArrayOfDouble2[(i1 - 1 + paramInt6)];
              } else {
                paramArrayOfDouble2[(i1 - 1 + paramInt6)] = paramArrayOfDouble2[(i1 - 1 - 1 + paramInt6)];
              }
            }
          }
          i17 = Math.min(i17, i1 - i3 + 1);
          i17 -= i17 % 2;
          i3 = i1 - i17 + 1;
          i2 = 3 * i17 - 3;
          i6 = paramInt1 - i2 + 1;
          i8 = i2 + 1;
          i14 = paramInt1 - i2 + 1 - 4 - (i2 + 1) + 1;
          i10 = i2 + 4;
          i20 = paramInt1 - i2 - i10 + 1;
          Dlaqr5.dlaqr5(paramBoolean1, paramBoolean2, n, paramInt1, i5, i1, i17, paramArrayOfDouble2, i3 - 1 + paramInt6, paramArrayOfDouble3, i3 - 1 + paramInt7, paramArrayOfDouble1, paramInt4, paramInt5, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble5, paramInt12, 3, paramArrayOfDouble1, i6 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, i20, paramArrayOfDouble1, i10 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, i14, paramArrayOfDouble1, i6 - 1 + (i8 - 1) * paramInt5 + paramInt4, paramInt5);
        }
        if ((localintW2.val <= 0 ? 0 : 1) != 0) {
          i12 = 1;
        } else {
          i12 += 1;
        }
        j += 1;
        i26--;
        if (i26 <= 0) {
          paramintW.val = i1;
        }
      }
    }
    paramArrayOfDouble5[(1 - 1 + paramInt12)] = i11;
  }
  
  private static void dlanv2_adapter(doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, double[] paramArrayOfDouble3, int paramInt3, double[] paramArrayOfDouble4, int paramInt4, doubleW paramdoubleW5, doubleW paramdoubleW6)
  {
    doubleW localdoubleW1 = new doubleW(paramArrayOfDouble1[paramInt1]);
    doubleW localdoubleW2 = new doubleW(paramArrayOfDouble2[paramInt2]);
    doubleW localdoubleW3 = new doubleW(paramArrayOfDouble3[paramInt3]);
    doubleW localdoubleW4 = new doubleW(paramArrayOfDouble4[paramInt4]);
    Dlanv2.dlanv2(paramdoubleW1, paramdoubleW2, paramdoubleW3, paramdoubleW4, localdoubleW1, localdoubleW2, localdoubleW3, localdoubleW4, paramdoubleW5, paramdoubleW6);
    paramArrayOfDouble1[paramInt1] = localdoubleW1.val;
    paramArrayOfDouble2[paramInt2] = localdoubleW2.val;
    paramArrayOfDouble3[paramInt3] = localdoubleW3.val;
    paramArrayOfDouble4[paramInt4] = localdoubleW4.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqr4.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */