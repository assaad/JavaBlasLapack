package org.netlib.lapack;

import org.netlib.blas.Drot;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgbbrd
{
  public static void dgbbrd(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double[] paramArrayOfDouble1, int paramInt6, int paramInt7, double[] paramArrayOfDouble2, int paramInt8, double[] paramArrayOfDouble3, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, double[] paramArrayOfDouble6, int paramInt14, int paramInt15, double[] paramArrayOfDouble7, int paramInt16, intW paramintW)
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
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    int i18 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    double d = 0.0D;
    doubleW localdoubleW2 = new doubleW(0.0D);
    doubleW localdoubleW3 = new doubleW(0.0D);
    bool = Lsame.lsame(paramString, "B");
    k = (!Lsame.lsame(paramString, "Q")) && (!bool) ? 0 : 1;
    j = (!Lsame.lsame(paramString, "P")) && (!bool) ? 0 : 1;
    i = paramInt3 <= 0 ? 0 : 1;
    i8 = paramInt4 + paramInt5 + 1;
    paramintW.val = 0;
    if ((((k ^ 0x1) != 0) && ((j ^ 0x1) != 0) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "N") ^ true) ? 1 : 0) != 0)
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
    else if ((paramInt5 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -6;
    }
    else if ((paramInt7 >= i8 ? 0 : 1) != 0)
    {
      paramintW.val = -8;
    }
    else
    {
      if ((paramInt11 >= 1 ? 0 : 1) == 0) {
        if (k == 0) {}
      }
      if ((((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -12;
      }
      else
      {
        if ((paramInt13 >= 1 ? 0 : 1) == 0) {
          if (j == 0) {}
        }
        if ((((paramInt13 >= Math.max(1, paramInt2) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -14;
        }
        else
        {
          if ((paramInt15 >= 1 ? 0 : 1) == 0) {
            if (i == 0) {}
          }
          if ((((paramInt15 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW.val = -16;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGBBRD", -paramintW.val);
      return;
    }
    if (k != 0) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble4, paramInt10, paramInt11);
    }
    if (j != 0) {
      Dlaset.dlaset("Full", paramInt2, paramInt2, 0.0D, 1.0D, paramArrayOfDouble5, paramInt12, paramInt13);
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    i11 = Math.min(paramInt1, paramInt2);
    int i19;
    if ((paramInt4 + paramInt5 <= 1 ? 0 : 1) != 0)
    {
      if ((paramInt5 <= 0 ? 0 : 1) != 0)
      {
        i13 = 1;
        i16 = 2;
      }
      else
      {
        i13 = 2;
        i16 = 1;
      }
      i14 = Math.max(paramInt1, paramInt2);
      i7 = Math.min(paramInt1 - 1, paramInt4);
      i9 = Math.min(paramInt2 - 1, paramInt5);
      i4 = i7 + i9;
      i5 = i4 + 1;
      n = i5 * paramInt7;
      i17 = 0;
      i2 = i7 + 2;
      i3 = 1 - i9;
      m = 1;
      for (i19 = i11 - 1 + 1; i19 > 0; i19--)
      {
        i12 = i7 + 1;
        i15 = i9 + 1;
        i6 = 1;
        for (int i20 = i4 - 1 + 1; i20 > 0; i20--)
        {
          i2 += i4;
          i3 += i4;
          if ((i17 <= 0 ? 0 : 1) != 0) {
            Dlargv.dlargv(i17, paramArrayOfDouble1, i8 - 1 + (i2 - i7 - 1 - 1) * paramInt7 + paramInt6, n, paramArrayOfDouble7, i2 - 1 + paramInt16, i5, paramArrayOfDouble7, i14 + i2 - 1 + paramInt16, i5);
          }
          i10 = 1;
          for (int i21 = i4 - 1 + 1; i21 > 0; i21--)
          {
            if ((i3 - i7 + i10 - 1 <= paramInt2 ? 0 : 1) != 0) {
              i18 = i17 - 1;
            } else {
              i18 = i17;
            }
            if ((i18 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i18, paramArrayOfDouble1, i8 - i10 - 1 + (i2 - i7 + i10 - 1 - 1) * paramInt7 + paramInt6, n, paramArrayOfDouble1, i8 - i10 + 1 - 1 + (i2 - i7 + i10 - 1 - 1) * paramInt7 + paramInt6, n, paramArrayOfDouble7, i14 + i2 - 1 + paramInt16, paramArrayOfDouble7, i2 - 1 + paramInt16, i5);
            }
            i10 += 1;
          }
          if ((i12 <= i13 ? 0 : 1) != 0)
          {
            if ((i12 > paramInt1 - m + 1 ? 0 : 1) != 0)
            {
              dlartg_adapter(paramArrayOfDouble1[(paramInt5 + i12 - 1 - 1 + (m - 1) * paramInt7 + paramInt6)], paramArrayOfDouble1[(paramInt5 + i12 - 1 + (m - 1) * paramInt7 + paramInt6)], paramArrayOfDouble7, i14 + m + i12 - 1 - 1 + paramInt16, paramArrayOfDouble7, m + i12 - 1 - 1 + paramInt16, localdoubleW1);
              paramArrayOfDouble1[(paramInt5 + i12 - 1 - 1 + (m - 1) * paramInt7 + paramInt6)] = localdoubleW1.val;
              if ((m >= paramInt2 ? 0 : 1) != 0) {
                Drot.drot(Math.min(paramInt5 + i12 - 2, paramInt2 - m), paramArrayOfDouble1, paramInt5 + i12 - 2 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, paramInt7 - 1, paramArrayOfDouble1, paramInt5 + i12 - 1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6, paramInt7 - 1, paramArrayOfDouble7[(i14 + m + i12 - 1 - 1 + paramInt16)], paramArrayOfDouble7[(m + i12 - 1 - 1 + paramInt16)]);
              }
            }
            i17 += 1;
            i2 -= i5;
          }
          if (k != 0)
          {
            i1 = i2;
            for (i21 = (i3 - i2 + i5) / i5; i21 > 0; i21--)
            {
              Drot.drot(paramInt1, paramArrayOfDouble4, 1 - 1 + (i1 - 1 - 1) * paramInt11 + paramInt10, 1, paramArrayOfDouble4, 1 - 1 + (i1 - 1) * paramInt11 + paramInt10, 1, paramArrayOfDouble7[(i14 + i1 - 1 + paramInt16)], paramArrayOfDouble7[(i1 - 1 + paramInt16)]);
              i1 += i5;
            }
          }
          if (i != 0)
          {
            i1 = i2;
            for (i21 = (i3 - i2 + i5) / i5; i21 > 0; i21--)
            {
              Drot.drot(paramInt3, paramArrayOfDouble6, i1 - 1 - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfDouble6, i1 - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfDouble7[(i14 + i1 - 1 + paramInt16)], paramArrayOfDouble7[(i1 - 1 + paramInt16)]);
              i1 += i5;
            }
          }
          if ((i3 + i9 <= paramInt2 ? 0 : 1) != 0)
          {
            i17 -= 1;
            i3 -= i5;
          }
          i1 = i2;
          for (i21 = (i3 - i2 + i5) / i5; i21 > 0; i21--)
          {
            paramArrayOfDouble7[(i1 + i9 - 1 + paramInt16)] = (paramArrayOfDouble7[(i1 - 1 + paramInt16)] * paramArrayOfDouble1[(1 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble1[(1 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble7[(i14 + i1 - 1 + paramInt16)] * paramArrayOfDouble1[(1 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)]);
            i1 += i5;
          }
          if ((i17 <= 0 ? 0 : 1) != 0) {
            Dlargv.dlargv(i17, paramArrayOfDouble1, 1 - 1 + (i2 + i9 - 1 - 1) * paramInt7 + paramInt6, n, paramArrayOfDouble7, i2 + i9 - 1 + paramInt16, i5, paramArrayOfDouble7, i14 + i2 + i9 - 1 + paramInt16, i5);
          }
          i10 = 1;
          for (i21 = i4 - 1 + 1; i21 > 0; i21--)
          {
            if ((i3 + i10 - 1 <= paramInt1 ? 0 : 1) != 0) {
              i18 = i17 - 1;
            } else {
              i18 = i17;
            }
            if ((i18 <= 0 ? 0 : 1) != 0) {
              Dlartv.dlartv(i18, paramArrayOfDouble1, i10 + 1 - 1 + (i2 + i9 - 1 - 1) * paramInt7 + paramInt6, n, paramArrayOfDouble1, i10 - 1 + (i2 + i9 - 1) * paramInt7 + paramInt6, n, paramArrayOfDouble7, i14 + i2 + i9 - 1 + paramInt16, paramArrayOfDouble7, i2 + i9 - 1 + paramInt16, i5);
            }
            i10 += 1;
          }
          if ((i12 != i13 ? 0 : 1) != 0) {}
          if (((i15 <= i16 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            if ((i15 > paramInt2 - m + 1 ? 0 : 1) != 0)
            {
              dlartg_adapter(paramArrayOfDouble1[(paramInt5 - i15 + 3 - 1 + (m + i15 - 2 - 1) * paramInt7 + paramInt6)], paramArrayOfDouble1[(paramInt5 - i15 + 2 - 1 + (m + i15 - 1 - 1) * paramInt7 + paramInt6)], paramArrayOfDouble7, i14 + m + i15 - 1 - 1 + paramInt16, paramArrayOfDouble7, m + i15 - 1 - 1 + paramInt16, localdoubleW1);
              paramArrayOfDouble1[(paramInt5 - i15 + 3 - 1 + (m + i15 - 2 - 1) * paramInt7 + paramInt6)] = localdoubleW1.val;
              Drot.drot(Math.min(paramInt4 + i15 - 2, paramInt1 - m), paramArrayOfDouble1, paramInt5 - i15 + 4 - 1 + (m + i15 - 2 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble1, paramInt5 - i15 + 3 - 1 + (m + i15 - 1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble7[(i14 + m + i15 - 1 - 1 + paramInt16)], paramArrayOfDouble7[(m + i15 - 1 - 1 + paramInt16)]);
            }
            i17 += 1;
            i2 -= i5;
          }
          if (j != 0)
          {
            i1 = i2;
            for (i21 = (i3 - i2 + i5) / i5; i21 > 0; i21--)
            {
              Drot.drot(paramInt2, paramArrayOfDouble5, i1 + i9 - 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble5, i1 + i9 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble7[(i14 + i1 + i9 - 1 + paramInt16)], paramArrayOfDouble7[(i1 + i9 - 1 + paramInt16)]);
              i1 += i5;
            }
          }
          if ((i3 + i4 <= paramInt1 ? 0 : 1) != 0)
          {
            i17 -= 1;
            i3 -= i5;
          }
          i1 = i2;
          for (i21 = (i3 - i2 + i5) / i5; i21 > 0; i21--)
          {
            paramArrayOfDouble7[(i1 + i9 - 1 + paramInt16)] *= paramArrayOfDouble1[(i8 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)];
            paramArrayOfDouble1[(i8 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)] = (paramArrayOfDouble7[(i14 + i1 + i9 - 1 + paramInt16)] * paramArrayOfDouble1[(i8 - 1 + (i1 + i9 - 1) * paramInt7 + paramInt6)]);
            i1 += i5;
          }
          if ((i12 <= i13 ? 0 : 1) != 0) {
            i12 -= 1;
          } else {
            i15 -= 1;
          }
          i6 += 1;
        }
        m += 1;
      }
    }
    if ((paramInt5 != 0 ? 0 : 1) != 0) {}
    if (((paramInt4 <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      m = 1;
      for (i19 = Math.min(paramInt1 - 1, paramInt2) - 1 + 1; i19 > 0; i19--)
      {
        Dlartg.dlartg(paramArrayOfDouble1[(1 - 1 + (m - 1) * paramInt7 + paramInt6)], paramArrayOfDouble1[(2 - 1 + (m - 1) * paramInt7 + paramInt6)], localdoubleW2, localdoubleW3, localdoubleW1);
        paramArrayOfDouble2[(m - 1 + paramInt8)] = localdoubleW1.val;
        if ((m >= paramInt2 ? 0 : 1) != 0)
        {
          paramArrayOfDouble3[(m - 1 + paramInt9)] = (localdoubleW3.val * paramArrayOfDouble1[(1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)]);
          paramArrayOfDouble1[(1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)] = (localdoubleW2.val * paramArrayOfDouble1[(1 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)]);
        }
        if (k != 0) {
          Drot.drot(paramInt1, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt11 + paramInt10, 1, paramArrayOfDouble4, 1 - 1 + (m + 1 - 1) * paramInt11 + paramInt10, 1, localdoubleW2.val, localdoubleW3.val);
        }
        if (i != 0) {
          Drot.drot(paramInt3, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfDouble6, m + 1 - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15, localdoubleW2.val, localdoubleW3.val);
        }
        m += 1;
      }
      if ((paramInt1 > paramInt2 ? 0 : 1) != 0) {
        paramArrayOfDouble2[(paramInt1 - 1 + paramInt8)] = paramArrayOfDouble1[(1 - 1 + (paramInt1 - 1) * paramInt7 + paramInt6)];
      }
    }
    else if ((paramInt5 <= 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 >= paramInt2 ? 0 : 1) != 0)
      {
        d = paramArrayOfDouble1[(paramInt5 - 1 + (paramInt1 + 1 - 1) * paramInt7 + paramInt6)];
        m = paramInt1;
        for (i19 = (1 - paramInt1 + -1) / -1; i19 > 0; i19--)
        {
          Dlartg.dlartg(paramArrayOfDouble1[(paramInt5 + 1 - 1 + (m - 1) * paramInt7 + paramInt6)], d, localdoubleW2, localdoubleW3, localdoubleW1);
          paramArrayOfDouble2[(m - 1 + paramInt8)] = localdoubleW1.val;
          if ((m <= 1 ? 0 : 1) != 0)
          {
            d = -(localdoubleW3.val * paramArrayOfDouble1[(paramInt5 - 1 + (m - 1) * paramInt7 + paramInt6)]);
            paramArrayOfDouble3[(m - 1 - 1 + paramInt9)] = (localdoubleW2.val * paramArrayOfDouble1[(paramInt5 - 1 + (m - 1) * paramInt7 + paramInt6)]);
          }
          if (j != 0) {
            Drot.drot(paramInt2, paramArrayOfDouble5, m - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble5, paramInt1 + 1 - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, localdoubleW2.val, localdoubleW3.val);
          }
          m += -1;
        }
      }
      else
      {
        m = 1;
        for (i19 = i11 - 1 - 1 + 1; i19 > 0; i19--)
        {
          paramArrayOfDouble3[(m - 1 + paramInt9)] = paramArrayOfDouble1[(paramInt5 - 1 + (m + 1 - 1) * paramInt7 + paramInt6)];
          m += 1;
        }
        m = 1;
        for (i19 = i11 - 1 + 1; i19 > 0; i19--)
        {
          paramArrayOfDouble2[(m - 1 + paramInt8)] = paramArrayOfDouble1[(paramInt5 + 1 - 1 + (m - 1) * paramInt7 + paramInt6)];
          m += 1;
        }
      }
    }
    else
    {
      m = 1;
      for (i19 = i11 - 1 - 1 + 1; i19 > 0; i19--)
      {
        paramArrayOfDouble3[(m - 1 + paramInt9)] = 0.0D;
        m += 1;
      }
      m = 1;
      for (i19 = i11 - 1 + 1; i19 > 0; i19--)
      {
        paramArrayOfDouble2[(m - 1 + paramInt8)] = paramArrayOfDouble1[(1 - 1 + (m - 1) * paramInt7 + paramInt6)];
        m += 1;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgbbrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */