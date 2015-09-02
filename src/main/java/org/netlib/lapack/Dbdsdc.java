package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dbdsdc
{
  public static void dbdsdc(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, int[] paramArrayOfInt1, int paramInt9, double[] paramArrayOfDouble6, int paramInt10, int[] paramArrayOfInt2, int paramInt11, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    intW localintW = new intW(0);
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
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    paramintW.val = 0;
    i7 = 0;
    if (Lsame.lsame(paramString1, "U")) {
      i7 = 1;
    }
    if (Lsame.lsame(paramString1, "L")) {
      i7 = 2;
    }
    if (Lsame.lsame(paramString2, "N")) {
      i3 = 0;
    } else if (Lsame.lsame(paramString2, "P")) {
      i3 = 1;
    } else if (Lsame.lsame(paramString2, "I")) {
      i3 = 2;
    } else {
      i3 = -1;
    }
    if ((i7 != 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((i3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if ((i3 != 2 ? 0 : 1) == 0) {}
      }
      if ((((paramInt5 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -7;
      }
      else
      {
        if ((paramInt7 >= 1 ? 0 : 1) == 0) {
          if ((i3 != 2 ? 0 : 1) == 0) {}
        }
        if ((((paramInt7 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -9;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DBDSDC", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i18 = Ilaenv.ilaenv(9, "DBDSDC", " ", 0, 0, 0, 0);
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((i3 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfDouble5[(1 - 1 + paramInt8)] = Util.dsign(1.0D, paramArrayOfDouble1[(1 - 1 + paramInt2)]);
        paramArrayOfDouble5[(1 + i18 * paramInt1 - 1 + paramInt8)] = 1.0D;
      }
      else if ((i3 != 2 ? 0 : 1) != 0)
      {
        paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = Util.dsign(1.0D, paramArrayOfDouble1[(1 - 1 + paramInt2)]);
        paramArrayOfDouble4[(1 - 1 + (1 - 1) * paramInt7 + paramInt6)] = 1.0D;
      }
      paramArrayOfDouble1[(1 - 1 + paramInt2)] = Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt2)]);
      return;
    }
    i13 = paramInt1 - 1;
    i22 = 1;
    i17 = 3;
    if ((i3 != 1 ? 0 : 1) != 0)
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble1, paramInt2, 1, paramArrayOfDouble5, 1 - 1 + paramInt8, 1);
      Dcopy.dcopy(paramInt1 - 1, paramArrayOfDouble2, paramInt3, 1, paramArrayOfDouble5, paramInt1 + 1 - 1 + paramInt8, 1);
    }
    if ((i7 != 2 ? 0 : 1) != 0)
    {
      i17 = 5;
      i22 = 2 * paramInt1 - 1;
      i1 = 1;
      for (i24 = paramInt1 - 1 - 1 + 1; i24 > 0; i24--)
      {
        Dlartg.dlartg(paramArrayOfDouble1[(i1 - 1 + paramInt2)], paramArrayOfDouble2[(i1 - 1 + paramInt3)], localdoubleW1, localdoubleW3, localdoubleW2);
        paramArrayOfDouble1[(i1 - 1 + paramInt2)] = localdoubleW2.val;
        paramArrayOfDouble2[(i1 - 1 + paramInt3)] = (localdoubleW3.val * paramArrayOfDouble1[(i1 + 1 - 1 + paramInt2)]);
        paramArrayOfDouble1[(i1 + 1 - 1 + paramInt2)] = (localdoubleW1.val * paramArrayOfDouble1[(i1 + 1 - 1 + paramInt2)]);
        if ((i3 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfDouble5[(i1 + 2 * paramInt1 - 1 + paramInt8)] = localdoubleW1.val;
          paramArrayOfDouble5[(i1 + 3 * paramInt1 - 1 + paramInt8)] = localdoubleW3.val;
        }
        else if ((i3 != 2 ? 0 : 1) != 0)
        {
          paramArrayOfDouble6[(i1 - 1 + paramInt10)] = localdoubleW1.val;
          paramArrayOfDouble6[(i13 + i1 - 1 + paramInt10)] = (-localdoubleW3.val);
        }
        i1 += 1;
      }
    }
    if ((i3 != 0 ? 0 : 1) != 0)
    {
      Dlasdq.dlasdq("U", 0, paramInt1, 0, 0, 0, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble6, i22 - 1 + paramInt10, paramintW);
    }
    else if ((paramInt1 > i18 ? 0 : 1) != 0)
    {
      if ((i3 != 2 ? 0 : 1) != 0)
      {
        Dlaset.dlaset("A", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble3, paramInt4, paramInt5);
        Dlaset.dlaset("A", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble4, paramInt6, paramInt7);
        Dlasdq.dlasdq("U", 0, paramInt1, paramInt1, paramInt1, 0, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfDouble4, paramInt6, paramInt7, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble6, i22 - 1 + paramInt10, paramintW);
      }
      else if ((i3 != 1 ? 0 : 1) != 0)
      {
        i6 = 1;
        i8 = i6 + paramInt1;
        Dlaset.dlaset("A", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble5, i6 + (i17 - 1) * paramInt1 - 1 + paramInt8, paramInt1);
        Dlaset.dlaset("A", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble5, i8 + (i17 - 1) * paramInt1 - 1 + paramInt8, paramInt1);
        Dlasdq.dlasdq("U", 0, paramInt1, paramInt1, paramInt1, 0, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfDouble5, i8 + (i17 - 1) * paramInt1 - 1 + paramInt8, paramInt1, paramArrayOfDouble5, i6 + (i17 - 1) * paramInt1 - 1 + paramInt8, paramInt1, paramArrayOfDouble5, i6 + (i17 - 1) * paramInt1 - 1 + paramInt8, paramInt1, paramArrayOfDouble6, i22 - 1 + paramInt10, paramintW);
      }
    }
    else
    {
      if ((i3 != 2 ? 0 : 1) != 0)
      {
        Dlaset.dlaset("A", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble3, paramInt4, paramInt5);
        Dlaset.dlaset("A", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble4, paramInt6, paramInt7);
      }
      d2 = Dlanst.dlanst("M", paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3);
      if ((d2 != 0.0D ? 0 : 1) != 0) {
        return;
      }
      Dlascl.dlascl("G", 0, 0, d2, 1.0D, paramInt1, 1, paramArrayOfDouble1, paramInt2, paramInt1, localintW);
      Dlascl.dlascl("G", 0, 0, d2, 1.0D, i13, 1, paramArrayOfDouble2, paramInt3, i13, localintW);
      d1 = Dlamch.dlamch("Epsilon");
      i12 = (int)(Math.log(paramInt1 / (i18 + 1)) / Math.log(2.0D)) + 1;
      i19 = i18 + 1;
      if ((i3 != 1 ? 0 : 1) != 0)
      {
        i6 = 1;
        i8 = 1 + i18;
        i = i8 + i19;
        j = i + i12;
        i23 = j + i12 * 2;
        i2 = i23 + i12;
        i5 = i2 + 1;
        i16 = i5 + 1;
        m = i16 + 2 * i12;
        i10 = 1;
        n = 2;
        i15 = 3;
        k = i15 + i12;
      }
      i1 = 1;
      for (i24 = paramInt1 - 1 + 1; i24 > 0; i24--)
      {
        if ((Math.abs(paramArrayOfDouble1[(i1 - 1 + paramInt2)]) >= d1 ? 0 : 1) != 0) {
          paramArrayOfDouble1[(i1 - 1 + paramInt2)] = Util.dsign(d1, paramArrayOfDouble1[(i1 - 1 + paramInt2)]);
        }
        i1 += 1;
      }
      i21 = 1;
      i20 = 0;
      i1 = 1;
      for (i24 = i13 - 1 + 1; i24 > 0; i24--)
      {
        if ((Math.abs(paramArrayOfDouble2[(i1 - 1 + paramInt3)]) >= d1 ? 0 : 1) == 0) {}
        if (((i1 != i13 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          if ((i1 >= i13 ? 0 : 1) != 0)
          {
            i14 = i1 - i21 + 1;
          }
          else if ((Math.abs(paramArrayOfDouble2[(i1 - 1 + paramInt3)]) < d1 ? 0 : 1) != 0)
          {
            i14 = paramInt1 - i21 + 1;
          }
          else
          {
            i14 = i1 - i21 + 1;
            if ((i3 != 2 ? 0 : 1) != 0)
            {
              paramArrayOfDouble3[(paramInt1 - 1 + (paramInt1 - 1) * paramInt5 + paramInt4)] = Util.dsign(1.0D, paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)]);
              paramArrayOfDouble4[(paramInt1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)] = 1.0D;
            }
            else if ((i3 != 1 ? 0 : 1) != 0)
            {
              paramArrayOfDouble5[(paramInt1 + (i17 - 1) * paramInt1 - 1 + paramInt8)] = Util.dsign(1.0D, paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)]);
              paramArrayOfDouble5[(paramInt1 + (i18 + i17 - 1) * paramInt1 - 1 + paramInt8)] = 1.0D;
            }
            paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)] = Math.abs(paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)]);
          }
          if ((i3 != 2 ? 0 : 1) != 0)
          {
            Dlasd0.dlasd0(i14, i20, paramArrayOfDouble1, i21 - 1 + paramInt2, paramArrayOfDouble2, i21 - 1 + paramInt3, paramArrayOfDouble3, i21 - 1 + (i21 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, i21 - 1 + (i21 - 1) * paramInt7 + paramInt6, paramInt7, i18, paramArrayOfInt2, paramInt11, paramArrayOfDouble6, i22 - 1 + paramInt10, paramintW);
          }
          else
          {
            Dlasda.dlasda(i3, i18, i14, i20, paramArrayOfDouble1, i21 - 1 + paramInt2, paramArrayOfDouble2, i21 - 1 + paramInt3, paramArrayOfDouble5, i21 + (i6 + i17 - 2) * paramInt1 - 1 + paramInt8, paramInt1, paramArrayOfDouble5, i21 + (i8 + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfInt1, i21 + i10 * paramInt1 - 1 + paramInt9, paramArrayOfDouble5, i21 + (i + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfDouble5, i21 + (j + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfDouble5, i21 + (i23 + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfDouble5, i21 + (i16 + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfInt1, i21 + n * paramInt1 - 1 + paramInt9, paramArrayOfInt1, i21 + k * paramInt1 - 1 + paramInt9, paramInt1, paramArrayOfInt1, i21 + i15 * paramInt1 - 1 + paramInt9, paramArrayOfDouble5, i21 + (m + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfDouble5, i21 + (i2 + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfDouble5, i21 + (i5 + i17 - 2) * paramInt1 - 1 + paramInt8, paramArrayOfDouble6, i22 - 1 + paramInt10, paramArrayOfInt2, paramInt11, paramintW);
            if ((paramintW.val == 0 ? 0 : 1) != 0) {
              return;
            }
          }
          i21 = i1 + 1;
        }
        i1 += 1;
      }
      Dlascl.dlascl("G", 0, 0, 1.0D, d2, paramInt1, 1, paramArrayOfDouble1, paramInt2, paramInt1, localintW);
    }
    i4 = 2;
    for (int i24 = paramInt1 - 2 + 1; i24 > 0; i24--)
    {
      i1 = i4 - 1;
      i11 = i1;
      d3 = paramArrayOfDouble1[(i1 - 1 + paramInt2)];
      i9 = i4;
      for (int i25 = paramInt1 - i4 + 1; i25 > 0; i25--)
      {
        if ((paramArrayOfDouble1[(i9 - 1 + paramInt2)] <= d3 ? 0 : 1) != 0)
        {
          i11 = i9;
          d3 = paramArrayOfDouble1[(i9 - 1 + paramInt2)];
        }
        i9 += 1;
      }
      if ((i11 == i1 ? 0 : 1) != 0)
      {
        paramArrayOfDouble1[(i11 - 1 + paramInt2)] = paramArrayOfDouble1[(i1 - 1 + paramInt2)];
        paramArrayOfDouble1[(i1 - 1 + paramInt2)] = d3;
        if ((i3 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfInt1[(i1 - 1 + paramInt9)] = i11;
        }
        else if ((i3 != 2 ? 0 : 1) != 0)
        {
          Dswap.dswap(paramInt1, paramArrayOfDouble3, 1 - 1 + (i1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i11 - 1) * paramInt5 + paramInt4, 1);
          Dswap.dswap(paramInt1, paramArrayOfDouble4, i1 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble4, i11 - 1 + (1 - 1) * paramInt7 + paramInt6, paramInt7);
        }
      }
      else if ((i3 != 1 ? 0 : 1) != 0)
      {
        paramArrayOfInt1[(i1 - 1 + paramInt9)] = i1;
      }
      i4 += 1;
    }
    if ((i3 != 1 ? 0 : 1) != 0) {
      if ((i7 != 1 ? 0 : 1) != 0) {
        paramArrayOfInt1[(paramInt1 - 1 + paramInt9)] = 1;
      } else {
        paramArrayOfInt1[(paramInt1 - 1 + paramInt9)] = 0;
      }
    }
    if ((i7 != 2 ? 0 : 1) != 0) {}
    if (((i3 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      Dlasr.dlasr("L", "V", "B", paramInt1, paramInt1, paramArrayOfDouble6, 1 - 1 + paramInt10, paramArrayOfDouble6, paramInt1 - 1 + paramInt10, paramArrayOfDouble3, paramInt4, paramInt5);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dbdsdc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */