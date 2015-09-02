package org.netlib.lapack;

import org.netlib.blas.Dtrsm;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgelsx
{
  public static void dgelsx(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, int[] paramArrayOfInt, int paramInt8, double paramDouble, intW paramintW1, double[] paramArrayOfDouble3, int paramInt9, intW paramintW2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    double d1 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d2 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    doubleW localdoubleW4 = new doubleW(0.0D);
    doubleW localdoubleW5 = new doubleW(0.0D);
    double d3 = 0.0D;
    doubleW localdoubleW6 = new doubleW(0.0D);
    double d4 = 0.0D;
    doubleW localdoubleW7 = new doubleW(0.0D);
    doubleW localdoubleW8 = new doubleW(0.0D);
    double d5 = 0.0D;
    double d6 = 0.0D;
    i3 = Math.min(paramInt1, paramInt2);
    n = i3 + 1;
    m = 2 * i3 + 1;
    paramintW2.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -2;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -3;
    } else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW2.val = -5;
    } else if ((paramInt7 >= Util.max(1, paramInt1, paramInt2) ? 0 : 1) != 0) {
      paramintW2.val = -7;
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGELSX", -paramintW2.val);
      return;
    }
    if ((Util.min(paramInt1, paramInt2, paramInt3) != 0 ? 0 : 1) != 0)
    {
      paramintW1.val = 0;
      return;
    }
    localdoubleW8.val = (Dlamch.dlamch("S") / Dlamch.dlamch("P"));
    localdoubleW1.val = (1.0D / localdoubleW8.val);
    Dlabad.dlabad(localdoubleW8, localdoubleW1);
    d1 = Dlange.dlange("M", paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, paramInt9);
    j = 0;
    if ((d1 <= 0.0D ? 0 : 1) != 0) {}
    if (((d1 >= localdoubleW8.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d1, localdoubleW8.val, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramintW2);
      j = 1;
    }
    else if ((d1 <= localdoubleW1.val ? 0 : 1) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d1, localdoubleW1.val, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramintW2);
      j = 2;
    }
    else if ((d1 != 0.0D ? 0 : 1) != 0)
    {
      Dlaset.dlaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, paramInt6, paramInt7);
      paramintW1.val = 0;
      return;
    }
    d2 = Dlange.dlange("M", paramInt1, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, paramInt9);
    k = 0;
    if ((d2 <= 0.0D ? 0 : 1) != 0) {}
    if (((d2 >= localdoubleW8.val ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d2, localdoubleW8.val, paramInt1, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
      k = 1;
    }
    else if ((d2 <= localdoubleW1.val ? 0 : 1) != 0)
    {
      Dlascl.dlascl("G", 0, 0, d2, localdoubleW1.val, paramInt1, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
      k = 2;
    }
    Dgeqpf.dgeqpf(paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfInt, paramInt8, paramArrayOfDouble3, 1 - 1 + paramInt9, paramArrayOfDouble3, i3 + 1 - 1 + paramInt9, paramintW2);
    paramArrayOfDouble3[(n - 1 + paramInt9)] = 1.0D;
    paramArrayOfDouble3[(m - 1 + paramInt9)] = 1.0D;
    d3 = Math.abs(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)]);
    d4 = d3;
    if ((Math.abs(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)]) != 0.0D ? 0 : 1) != 0)
    {
      paramintW1.val = 0;
      Dlaset.dlaset("F", Math.max(paramInt1, paramInt2), paramInt3, 0.0D, 0.0D, paramArrayOfDouble2, paramInt6, paramInt7);
      return;
    }
    else
    {
      for (paramintW1.val = 1; (paramintW1.val >= i3 ? 0 : 1) != 0; paramintW1.val += 1)
      {
        i = paramintW1.val + 1;
        Dlaic1.dlaic1(2, paramintW1.val, paramArrayOfDouble3, n - 1 + paramInt9, d4, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)], localdoubleW7, localdoubleW4, localdoubleW2);
        Dlaic1.dlaic1(1, paramintW1.val, paramArrayOfDouble3, m - 1 + paramInt9, d3, paramArrayOfDouble1, 1 - 1 + (i - 1) * paramInt5 + paramInt4, paramArrayOfDouble1[(i - 1 + (i - 1) * paramInt5 + paramInt4)], localdoubleW6, localdoubleW5, localdoubleW3);
        if ((localdoubleW6.val * paramDouble > localdoubleW7.val ? 0 : 1) == 0) {
          break;
        }
        i = 1;
        for (i4 = paramintW1.val - 1 + 1; i4 > 0; i4--)
        {
          paramArrayOfDouble3[(n + i - 1 - 1 + paramInt9)] = (localdoubleW4.val * paramArrayOfDouble3[(n + i - 1 - 1 + paramInt9)]);
          paramArrayOfDouble3[(m + i - 1 - 1 + paramInt9)] = (localdoubleW5.val * paramArrayOfDouble3[(m + i - 1 - 1 + paramInt9)]);
          i += 1;
        }
        paramArrayOfDouble3[(n + paramintW1.val - 1 + paramInt9)] = localdoubleW2.val;
        paramArrayOfDouble3[(m + paramintW1.val - 1 + paramInt9)] = localdoubleW3.val;
        d4 = localdoubleW7.val;
        d3 = localdoubleW6.val;
      }
      if ((paramintW1.val >= paramInt2 ? 0 : 1) != 0) {
        Dtzrqf.dtzrqf(paramintW1.val, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, i3 + 1 - 1 + paramInt9, paramintW2);
      }
      Dorm2r.dorm2r("Left", "Transpose", paramInt1, paramInt3, i3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble3, 1 - 1 + paramInt9, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, 2 * i3 + 1 - 1 + paramInt9, paramintW2);
      Dtrsm.dtrsm("Left", "Upper", "No transpose", "Non-unit", paramintW1.val, paramInt3, 1.0D, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7);
      i = paramintW1.val + 1;
      int i5;
      for (int i4 = paramInt2 - (paramintW1.val + 1) + 1; i4 > 0; i4--)
      {
        i1 = 1;
        for (i5 = paramInt3 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfDouble2[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = 0.0D;
          i1 += 1;
        }
        i += 1;
      }
      if ((paramintW1.val >= paramInt2 ? 0 : 1) != 0)
      {
        i = 1;
        for (i4 = paramintW1.val - 1 + 1; i4 > 0; i4--)
        {
          Dlatzm.dlatzm("Left", paramInt2 - paramintW1.val + 1, paramInt3, paramArrayOfDouble1, i - 1 + (paramintW1.val + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3[(i3 + i - 1 + paramInt9)], paramArrayOfDouble2, i - 1 + (1 - 1) * paramInt7 + paramInt6, paramArrayOfDouble2, paramintW1.val + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3, 2 * i3 + 1 - 1 + paramInt9);
          i += 1;
        }
      }
      i1 = 1;
      for (i4 = paramInt3 - 1 + 1; i4 > 0; i4--)
      {
        i = 1;
        for (i5 = paramInt2 - 1 + 1; i5 > 0; i5--)
        {
          paramArrayOfDouble3[(2 * i3 + i - 1 + paramInt9)] = 1.0D;
          i += 1;
        }
        i = 1;
        for (i5 = paramInt2 - 1 + 1; i5 > 0; i5--)
        {
          if ((paramArrayOfDouble3[(2 * i3 + i - 1 + paramInt9)] != 1.0D ? 0 : 1) != 0) {
            if ((paramArrayOfInt[(i - 1 + paramInt8)] == i ? 0 : 1) != 0)
            {
              i2 = i;
              d5 = paramArrayOfDouble2[(i2 - 1 + (i1 - 1) * paramInt7 + paramInt6)];
              d6 = paramArrayOfDouble2[(paramArrayOfInt[(i2 - 1 + paramInt8)] - 1 + (i1 - 1) * paramInt7 + paramInt6)];
              do
              {
                paramArrayOfDouble2[(paramArrayOfInt[(i2 - 1 + paramInt8)] - 1 + (i1 - 1) * paramInt7 + paramInt6)] = d5;
                paramArrayOfDouble3[(2 * i3 + i2 - 1 + paramInt9)] = 0.0D;
                d5 = d6;
                i2 = paramArrayOfInt[(i2 - 1 + paramInt8)];
                d6 = paramArrayOfDouble2[(paramArrayOfInt[(i2 - 1 + paramInt8)] - 1 + (i1 - 1) * paramInt7 + paramInt6)];
              } while ((paramArrayOfInt[(i2 - 1 + paramInt8)] == i ? 0 : 1) != 0);
              paramArrayOfDouble2[(i - 1 + (i1 - 1) * paramInt7 + paramInt6)] = d5;
              paramArrayOfDouble3[(2 * i3 + i2 - 1 + paramInt9)] = 0.0D;
            }
          }
          i += 1;
        }
        i1 += 1;
      }
      if ((j != 1 ? 0 : 1) != 0)
      {
        Dlascl.dlascl("G", 0, 0, d1, localdoubleW8.val, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
        Dlascl.dlascl("U", 0, 0, localdoubleW8.val, d1, paramintW1.val, paramintW1.val, paramArrayOfDouble1, paramInt4, paramInt5, paramintW2);
      }
      else if ((j != 2 ? 0 : 1) != 0)
      {
        Dlascl.dlascl("G", 0, 0, d1, localdoubleW1.val, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
        Dlascl.dlascl("U", 0, 0, localdoubleW1.val, d1, paramintW1.val, paramintW1.val, paramArrayOfDouble1, paramInt4, paramInt5, paramintW2);
      }
      if ((k != 1 ? 0 : 1) != 0) {
        Dlascl.dlascl("G", 0, 0, localdoubleW8.val, d2, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
      } else if ((k != 2 ? 0 : 1) != 0) {
        Dlascl.dlascl("G", 0, 0, localdoubleW1.val, d2, paramInt2, paramInt3, paramArrayOfDouble2, paramInt6, paramInt7, paramintW2);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgelsx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */