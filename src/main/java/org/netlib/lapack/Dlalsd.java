package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Drot;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlalsd
{
  public static void dlalsd(String paramString, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double paramDouble, intW paramintW1, double[] paramArrayOfDouble4, int paramInt8, int[] paramArrayOfInt, int paramInt9, intW paramintW2)
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
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    int i21 = 0;
    int i22 = 0;
    int i23 = 0;
    int i24 = 0;
    int i25 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d3 = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    double d4 = 0.0D;
    paramintW2.val = 0;
    if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -3;
    }
    else if ((paramInt3 >= 1 ? 0 : 1) != 0)
    {
      paramintW2.val = -4;
    }
    else
    {
      if ((paramInt7 >= 1 ? 0 : 1) == 0) {}
      if (((paramInt7 >= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -8;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLALSD", -paramintW2.val);
      return;
    }
    d1 = Dlamch.dlamch("Epsilon");
    if ((paramDouble > 0.0D ? 0 : 1) == 0) {}
    if (((paramDouble < 1.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
      d3 = d1;
    } else {
      d3 = paramDouble;
    }
    paramintW1.val = 0;
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt2 != 1 ? 0 : 1) != 0)
    {
      if ((paramArrayOfDouble1[(1 - 1 + paramInt4)] != 0.0D ? 0 : 1) != 0)
      {
        Dlaset.dlaset("A", 1, paramInt3, 0.0D, 0.0D, paramArrayOfDouble3, paramInt6, paramInt7);
      }
      else
      {
        paramintW1.val = 1;
        Dlascl.dlascl("G", 0, 0, paramArrayOfDouble1[(1 - 1 + paramInt4)], 1.0D, 1, paramInt3, paramArrayOfDouble3, paramInt6, paramInt7, paramintW2);
        paramArrayOfDouble1[(1 - 1 + paramInt4)] = Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt4)]);
      }
      return;
    }
    if (paramString.regionMatches(0, "L", 0, 1))
    {
      i4 = 1;
      for (int i26 = paramInt2 - 1 - 1 + 1; i26 > 0; i26--)
      {
        Dlartg.dlartg(paramArrayOfDouble1[(i4 - 1 + paramInt4)], paramArrayOfDouble2[(i4 - 1 + paramInt5)], localdoubleW1, localdoubleW3, localdoubleW2);
        paramArrayOfDouble1[(i4 - 1 + paramInt4)] = localdoubleW2.val;
        paramArrayOfDouble2[(i4 - 1 + paramInt5)] = (localdoubleW3.val * paramArrayOfDouble1[(i4 + 1 - 1 + paramInt4)]);
        paramArrayOfDouble1[(i4 + 1 - 1 + paramInt4)] = (localdoubleW1.val * paramArrayOfDouble1[(i4 + 1 - 1 + paramInt4)]);
        if ((paramInt3 != 1 ? 0 : 1) != 0)
        {
          Drot.drot(1, paramArrayOfDouble3, i4 - 1 + (1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble3, i4 + 1 - 1 + (1 - 1) * paramInt7 + paramInt6, 1, localdoubleW1.val, localdoubleW3.val);
        }
        else
        {
          paramArrayOfDouble4[(i4 * 2 - 1 - 1 + paramInt8)] = localdoubleW1.val;
          paramArrayOfDouble4[(i4 * 2 - 1 + paramInt8)] = localdoubleW3.val;
        }
        i4 += 1;
      }
      if ((paramInt3 <= 1 ? 0 : 1) != 0)
      {
        i4 = 1;
        for (int i26 = paramInt3 - 1 + 1; i26 > 0; i26--)
        {
          i8 = 1;
          for (int i27 = paramInt2 - 1 - 1 + 1; i27 > 0; i27--)
          {
            localdoubleW1.val = paramArrayOfDouble4[(i8 * 2 - 1 - 1 + paramInt8)];
            localdoubleW3.val = paramArrayOfDouble4[(i8 * 2 - 1 + paramInt8)];
            Drot.drot(1, paramArrayOfDouble3, i8 - 1 + (i4 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble3, i8 + 1 - 1 + (i4 - 1) * paramInt7 + paramInt6, 1, localdoubleW1.val, localdoubleW3.val);
            i8 += 1;
          }
          i4 += 1;
        }
      }
    }
    i11 = paramInt2 - 1;
    d2 = Dlanst.dlanst("M", paramInt2, paramArrayOfDouble1, paramInt4, paramArrayOfDouble2, paramInt5);
    if ((d2 != 0.0D ? 0 : 1) != 0)
    {
      Dlaset.dlaset("A", paramInt2, paramInt3, 0.0D, 0.0D, paramArrayOfDouble3, paramInt6, paramInt7);
      return;
    }
    Dlascl.dlascl("G", 0, 0, d2, 1.0D, paramInt2, 1, paramArrayOfDouble1, paramInt4, paramInt2, paramintW2);
    Dlascl.dlascl("G", 0, 0, d2, 1.0D, i11, 1, paramArrayOfDouble2, paramInt5, i11, paramintW2);
    if ((paramInt2 > paramInt1 ? 0 : 1) != 0)
    {
      i14 = 1 + paramInt2 * paramInt2;
      Dlaset.dlaset("A", paramInt2, paramInt2, 0.0D, 1.0D, paramArrayOfDouble4, paramInt8, paramInt2);
      Dlasdq.dlasdq("U", 0, paramInt2, paramInt2, 0, paramInt3, paramArrayOfDouble1, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble4, paramInt8, paramInt2, paramArrayOfDouble4, paramInt8, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, i14 - 1 + paramInt8, paramintW2);
      if ((paramintW2.val == 0 ? 0 : 1) != 0) {
        return;
      }
      d4 = d3 * Math.abs(paramArrayOfDouble1[(org.netlib.blas.Idamax.idamax(paramInt2, paramArrayOfDouble1, paramInt4, 1) - 1 + paramInt4)]);
      i4 = 1;
      for (int i26 = paramInt2 - 1 + 1; i26 > 0; i26--)
      {
        if ((paramArrayOfDouble1[(i4 - 1 + paramInt4)] > d4 ? 0 : 1) != 0)
        {
          Dlaset.dlaset("A", 1, paramInt3, 0.0D, 0.0D, paramArrayOfDouble3, i4 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        }
        else
        {
          Dlascl.dlascl("G", 0, 0, paramArrayOfDouble1[(i4 - 1 + paramInt4)], 1.0D, 1, paramInt3, paramArrayOfDouble3, i4 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramintW2);
          paramintW1.val += 1;
        }
        i4 += 1;
      }
      Dgemm.dgemm("T", "N", paramInt2, paramInt3, paramInt2, 1.0D, paramArrayOfDouble4, paramInt8, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7, 0.0D, paramArrayOfDouble4, i14 - 1 + paramInt8, paramInt2);
      Dlacpy.dlacpy("A", paramInt2, paramInt3, paramArrayOfDouble4, i14 - 1 + paramInt8, paramInt2, paramArrayOfDouble3, paramInt6, paramInt7);
      Dlascl.dlascl("G", 0, 0, 1.0D, d2, paramInt2, 1, paramArrayOfDouble1, paramInt4, paramInt2, paramintW2);
      Dlasrt.dlasrt("D", paramInt2, paramArrayOfDouble1, paramInt4, paramintW2);
      Dlascl.dlascl("G", 0, 0, d2, 1.0D, paramInt2, paramInt3, paramArrayOfDouble3, paramInt6, paramInt7, paramintW2);
      return;
    }
    i10 = (int)(Math.log(paramInt2 / (paramInt1 + 1)) / Math.log(2.0D)) + 1;
    i19 = paramInt1 + 1;
    i23 = 1;
    i24 = 1 + paramInt1 * paramInt2;
    m = i24 + i19 * paramInt2;
    n = m + i10 * paramInt2;
    i25 = n + i10 * paramInt2 * 2;
    k = i25 + i10 * paramInt2;
    i17 = k + paramInt2;
    i16 = i17 + paramInt2;
    i2 = i16 + 2 * i10 * paramInt2;
    i = i2 + 2 * i10 * paramInt2;
    i14 = i + paramInt2 * paramInt3;
    i18 = 1 + paramInt2;
    i9 = i18 + paramInt2;
    i3 = i9 + paramInt2;
    i15 = i3 + paramInt2;
    i1 = i15 + i10 * paramInt2;
    i7 = i1 + i10 * paramInt2 * 2;
    i21 = 1;
    i20 = 0;
    i5 = 1;
    i6 = 0;
    i13 = 0;
    i4 = 1;
    for (int i26 = paramInt2 - 1 + 1; i26 > 0; i26--)
    {
      if ((Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt4)]) >= d1 ? 0 : 1) != 0) {
        paramArrayOfDouble1[(i4 - 1 + paramInt4)] = Util.dsign(d1, paramArrayOfDouble1[(i4 - 1 + paramInt4)]);
      }
      i4 += 1;
    }
    i4 = 1;
    for (int i26 = i11 - 1 + 1; i26 > 0; i26--)
    {
      if ((Math.abs(paramArrayOfDouble2[(i4 - 1 + paramInt5)]) >= d1 ? 0 : 1) == 0) {}
      if (((i4 != i11 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i13 += 1;
        paramArrayOfInt[(i13 - 1 + paramInt9)] = i21;
        if ((i4 >= i11 ? 0 : 1) != 0)
        {
          i12 = i4 - i21 + 1;
          paramArrayOfInt[(i18 + i13 - 1 - 1 + paramInt9)] = i12;
        }
        else if ((Math.abs(paramArrayOfDouble2[(i4 - 1 + paramInt5)]) < d1 ? 0 : 1) != 0)
        {
          i12 = paramInt2 - i21 + 1;
          paramArrayOfInt[(i18 + i13 - 1 - 1 + paramInt9)] = i12;
        }
        else
        {
          i12 = i4 - i21 + 1;
          paramArrayOfInt[(i18 + i13 - 1 - 1 + paramInt9)] = i12;
          i13 += 1;
          paramArrayOfInt[(i13 - 1 + paramInt9)] = paramInt2;
          paramArrayOfInt[(i18 + i13 - 1 - 1 + paramInt9)] = 1;
          Dcopy.dcopy(paramInt3, paramArrayOfDouble3, paramInt2 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble4, i + i11 - 1 + paramInt8, paramInt2);
        }
        i22 = i21 - 1;
        if ((i12 != 1 ? 0 : 1) != 0)
        {
          Dcopy.dcopy(paramInt3, paramArrayOfDouble3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble4, i + i22 - 1 + paramInt8, paramInt2);
        }
        else if ((i12 > paramInt1 ? 0 : 1) != 0)
        {
          Dlaset.dlaset("A", i12, i12, 0.0D, 1.0D, paramArrayOfDouble4, i24 + i22 - 1 + paramInt8, paramInt2);
          Dlasdq.dlasdq("U", 0, i12, i12, 0, paramInt3, paramArrayOfDouble1, i21 - 1 + paramInt4, paramArrayOfDouble2, i21 - 1 + paramInt5, paramArrayOfDouble4, i24 + i22 - 1 + paramInt8, paramInt2, paramArrayOfDouble4, i14 - 1 + paramInt8, paramInt2, paramArrayOfDouble3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble4, i14 - 1 + paramInt8, paramintW2);
          if ((paramintW2.val == 0 ? 0 : 1) != 0) {
            return;
          }
          Dlacpy.dlacpy("A", i12, paramInt3, paramArrayOfDouble3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble4, i + i22 - 1 + paramInt8, paramInt2);
        }
        else
        {
          Dlasda.dlasda(i5, paramInt1, i12, i20, paramArrayOfDouble1, i21 - 1 + paramInt4, paramArrayOfDouble2, i21 - 1 + paramInt5, paramArrayOfDouble4, i23 + i22 - 1 + paramInt8, paramInt2, paramArrayOfDouble4, i24 + i22 - 1 + paramInt8, paramArrayOfInt, i9 + i22 - 1 + paramInt9, paramArrayOfDouble4, m + i22 - 1 + paramInt8, paramArrayOfDouble4, n + i22 - 1 + paramInt8, paramArrayOfDouble4, i25 + i22 - 1 + paramInt8, paramArrayOfDouble4, i16 + i22 - 1 + paramInt8, paramArrayOfInt, i3 + i22 - 1 + paramInt9, paramArrayOfInt, i1 + i22 - 1 + paramInt9, paramInt2, paramArrayOfInt, i15 + i22 - 1 + paramInt9, paramArrayOfDouble4, i2 + i22 - 1 + paramInt8, paramArrayOfDouble4, k + i22 - 1 + paramInt8, paramArrayOfDouble4, i17 + i22 - 1 + paramInt8, paramArrayOfDouble4, i14 - 1 + paramInt8, paramArrayOfInt, i7 - 1 + paramInt9, paramintW2);
          if ((paramintW2.val == 0 ? 0 : 1) != 0) {
            return;
          }
          j = i + i22;
          Dlalsa.dlalsa(i6, paramInt1, i12, paramInt3, paramArrayOfDouble3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble4, j - 1 + paramInt8, paramInt2, paramArrayOfDouble4, i23 + i22 - 1 + paramInt8, paramInt2, paramArrayOfDouble4, i24 + i22 - 1 + paramInt8, paramArrayOfInt, i9 + i22 - 1 + paramInt9, paramArrayOfDouble4, m + i22 - 1 + paramInt8, paramArrayOfDouble4, n + i22 - 1 + paramInt8, paramArrayOfDouble4, i25 + i22 - 1 + paramInt8, paramArrayOfDouble4, i16 + i22 - 1 + paramInt8, paramArrayOfInt, i3 + i22 - 1 + paramInt9, paramArrayOfInt, i1 + i22 - 1 + paramInt9, paramInt2, paramArrayOfInt, i15 + i22 - 1 + paramInt9, paramArrayOfDouble4, i2 + i22 - 1 + paramInt8, paramArrayOfDouble4, k + i22 - 1 + paramInt8, paramArrayOfDouble4, i17 + i22 - 1 + paramInt8, paramArrayOfDouble4, i14 - 1 + paramInt8, paramArrayOfInt, i7 - 1 + paramInt9, paramintW2);
          if ((paramintW2.val == 0 ? 0 : 1) != 0) {
            return;
          }
        }
        i21 = i4 + 1;
      }
      i4 += 1;
    }
    d4 = d3 * Math.abs(paramArrayOfDouble1[(org.netlib.blas.Idamax.idamax(paramInt2, paramArrayOfDouble1, paramInt4, 1) - 1 + paramInt4)]);
    i4 = 1;
    for (int i26 = paramInt2 - 1 + 1; i26 > 0; i26--)
    {
      if ((Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt4)]) > d4 ? 0 : 1) != 0)
      {
        Dlaset.dlaset("A", 1, paramInt3, 0.0D, 0.0D, paramArrayOfDouble4, i + i4 - 1 - 1 + paramInt8, paramInt2);
      }
      else
      {
        paramintW1.val += 1;
        Dlascl.dlascl("G", 0, 0, paramArrayOfDouble1[(i4 - 1 + paramInt4)], 1.0D, 1, paramInt3, paramArrayOfDouble4, i + i4 - 1 - 1 + paramInt8, paramInt2, paramintW2);
      }
      paramArrayOfDouble1[(i4 - 1 + paramInt4)] = Math.abs(paramArrayOfDouble1[(i4 - 1 + paramInt4)]);
      i4 += 1;
    }
    i6 = 1;
    i4 = 1;
    for (int i26 = i13 - 1 + 1; i26 > 0; i26--)
    {
      i21 = paramArrayOfInt[(i4 - 1 + paramInt9)];
      i22 = i21 - 1;
      i12 = paramArrayOfInt[(i18 + i4 - 1 - 1 + paramInt9)];
      j = i + i22;
      if ((i12 != 1 ? 0 : 1) != 0)
      {
        Dcopy.dcopy(paramInt3, paramArrayOfDouble4, j - 1 + paramInt8, paramInt2, paramArrayOfDouble3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
      else if ((i12 > paramInt1 ? 0 : 1) != 0)
      {
        Dgemm.dgemm("T", "N", i12, paramInt3, i12, 1.0D, paramArrayOfDouble4, i24 + i22 - 1 + paramInt8, paramInt2, paramArrayOfDouble4, j - 1 + paramInt8, paramInt2, 0.0D, paramArrayOfDouble3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
      }
      else
      {
        Dlalsa.dlalsa(i6, paramInt1, i12, paramInt3, paramArrayOfDouble4, j - 1 + paramInt8, paramInt2, paramArrayOfDouble3, i21 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble4, i23 + i22 - 1 + paramInt8, paramInt2, paramArrayOfDouble4, i24 + i22 - 1 + paramInt8, paramArrayOfInt, i9 + i22 - 1 + paramInt9, paramArrayOfDouble4, m + i22 - 1 + paramInt8, paramArrayOfDouble4, n + i22 - 1 + paramInt8, paramArrayOfDouble4, i25 + i22 - 1 + paramInt8, paramArrayOfDouble4, i16 + i22 - 1 + paramInt8, paramArrayOfInt, i3 + i22 - 1 + paramInt9, paramArrayOfInt, i1 + i22 - 1 + paramInt9, paramInt2, paramArrayOfInt, i15 + i22 - 1 + paramInt9, paramArrayOfDouble4, i2 + i22 - 1 + paramInt8, paramArrayOfDouble4, k + i22 - 1 + paramInt8, paramArrayOfDouble4, i17 + i22 - 1 + paramInt8, paramArrayOfDouble4, i14 - 1 + paramInt8, paramArrayOfInt, i7 - 1 + paramInt9, paramintW2);
        if ((paramintW2.val == 0 ? 0 : 1) != 0) {
          return;
        }
      }
      i4 += 1;
    }
    Dlascl.dlascl("G", 0, 0, 1.0D, d2, paramInt2, 1, paramArrayOfDouble1, paramInt4, paramInt2, paramintW2);
    Dlasrt.dlasrt("D", paramInt2, paramArrayOfDouble1, paramInt4, paramintW2);
    Dlascl.dlascl("G", 0, 0, d2, 1.0D, paramInt2, paramInt3, paramArrayOfDouble3, paramInt6, paramInt7, paramintW2);
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlalsd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */