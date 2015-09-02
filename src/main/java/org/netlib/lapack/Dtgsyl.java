package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtgsyl
{
  public static void dtgsyl(String paramString, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, double[] paramArrayOfDouble6, int paramInt14, int paramInt15, doubleW paramdoubleW1, doubleW paramdoubleW2, double[] paramArrayOfDouble7, int paramInt16, int paramInt17, int[] paramArrayOfInt, int paramInt18, intW paramintW)
  {
    int i = 0;
    boolean bool = false;
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
    intW localintW1 = new intW(0);
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    intW localintW2 = new intW(0);
    intW localintW3 = new intW(0);
    int i11 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "N");
    i = paramInt17 != -1 ? 0 : 1;
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "T") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if (bool)
    {
      if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt1 <= 4 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -2;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0) {
      if ((paramInt2 > 0 ? 0 : 1) != 0) {
        paramintW.val = -3;
      } else if ((paramInt3 > 0 ? 0 : 1) != 0) {
        paramintW.val = -4;
      } else if ((paramInt5 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW.val = -6;
      } else if ((paramInt7 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
        paramintW.val = -8;
      } else if ((paramInt9 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW.val = -10;
      } else if ((paramInt11 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW.val = -12;
      } else if ((paramInt13 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
        paramintW.val = -14;
      } else if ((paramInt15 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW.val = -16;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if (bool)
      {
        if ((paramInt1 != 1 ? 0 : 1) == 0) {}
        if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
          i7 = Math.max(1, 2 * paramInt2 * paramInt3);
        } else {
          i7 = 1;
        }
      }
      else
      {
        i7 = 1;
      }
      paramArrayOfDouble7[(1 - 1 + paramInt16)] = i7;
      if ((paramInt17 >= i7 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -20;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTGSYL", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramdoubleW1.val = 1;
      if (bool) {
        if ((paramInt1 == 0 ? 0 : 1) != 0) {
          paramdoubleW2.val = 0;
        }
      }
      return;
    }
    i8 = Ilaenv.ilaenv(2, "DTGSYL", paramString, paramInt2, paramInt3, -1, -1);
    i9 = Ilaenv.ilaenv(5, "DTGSYL", paramString, paramInt2, paramInt3, -1, -1);
    i2 = 1;
    m = 0;
    if (bool) {
      if ((paramInt1 < 3 ? 0 : 1) != 0)
      {
        m = paramInt1 - 2;
        Dlaset.dlaset("F", paramInt2, paramInt3, 0.0D, 0.0D, paramArrayOfDouble3, paramInt8, paramInt9);
        Dlaset.dlaset("F", paramInt2, paramInt3, 0.0D, 0.0D, paramArrayOfDouble6, paramInt14, paramInt15);
      }
      else if ((paramInt1 < 1 ? 0 : 1) != 0)
      {
        i2 = 2;
      }
    }
    if ((i8 > 1 ? 0 : 1) != 0) {}
    if (((i9 > 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
      if ((i8 < paramInt2 ? 0 : 1) == 0) {}
    }
    int i12;
    if ((((i9 < paramInt3 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
    {
      n = 1;
      for (i12 = i2 - 1 + 1; i12 > 0; i12--)
      {
        localdoubleW1.val = 0.0D;
        localdoubleW2.val = 1.0D;
        localintW3.val = 0;
        Dtgsy2.dtgsy2(paramString, m, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfDouble6, paramInt14, paramInt15, paramdoubleW1, localdoubleW2, localdoubleW1, paramArrayOfInt, paramInt18, localintW3, paramintW);
        if ((localdoubleW1.val == 0.0D ? 0 : 1) != 0)
        {
          if ((paramInt1 != 1 ? 0 : 1) == 0) {}
          if (((paramInt1 != 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramdoubleW2.val = (Math.sqrt(2 * paramInt2 * paramInt3) / (localdoubleW1.val * Math.sqrt(localdoubleW2.val)));
          } else {
            paramdoubleW2.val = (Math.sqrt(localintW3.val) / (localdoubleW1.val * Math.sqrt(localdoubleW2.val)));
          }
        }
        if ((i2 != 2 ? 0 : 1) != 0) {}
        if (((n != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          if (bool) {
            m = paramInt1;
          }
          d = paramdoubleW1.val;
          Dlacpy.dlacpy("F", paramInt2, paramInt3, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble7, paramInt16, paramInt2);
          Dlacpy.dlacpy("F", paramInt2, paramInt3, paramArrayOfDouble6, paramInt14, paramInt15, paramArrayOfDouble7, paramInt2 * paramInt3 + 1 - 1 + paramInt16, paramInt2);
          Dlaset.dlaset("F", paramInt2, paramInt3, 0.0D, 0.0D, paramArrayOfDouble3, paramInt8, paramInt9);
          Dlaset.dlaset("F", paramInt2, paramInt3, 0.0D, 0.0D, paramArrayOfDouble6, paramInt14, paramInt15);
        }
        else
        {
          if ((i2 != 2 ? 0 : 1) != 0) {}
          if (((n != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            Dlacpy.dlacpy("F", paramInt2, paramInt3, paramArrayOfDouble7, paramInt16, paramInt2, paramArrayOfDouble3, paramInt8, paramInt9);
            Dlacpy.dlacpy("F", paramInt2, paramInt3, paramArrayOfDouble7, paramInt2 * paramInt3 + 1 - 1 + paramInt16, paramInt2, paramArrayOfDouble6, paramInt14, paramInt15);
            paramdoubleW1.val = d;
          }
        }
        n += 1;
      }
      return;
    }
    i10 = 0;
    j = 1;
    while ((j <= paramInt2 ? 0 : 1) == 0)
    {
      i10 += 1;
      paramArrayOfInt[(i10 - 1 + paramInt18)] = j;
      j += i8;
      if ((j < paramInt2 ? 0 : 1) != 0) {
        break;
      }
      if ((paramArrayOfDouble1[(j - 1 + (j - 1 - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) != 0) {
        j += 1;
      }
    }
    paramArrayOfInt[(i10 + 1 - 1 + paramInt18)] = (paramInt2 + 1);
    if ((paramArrayOfInt[(i10 - 1 + paramInt18)] != paramArrayOfInt[(i10 + 1 - 1 + paramInt18)] ? 0 : 1) != 0) {
      i10 -= 1;
    }
    i11 = i10 + 1;
    i3 = 1;
    while ((i3 <= paramInt3 ? 0 : 1) == 0)
    {
      i11 += 1;
      paramArrayOfInt[(i11 - 1 + paramInt18)] = i3;
      i3 += i9;
      if ((i3 < paramInt3 ? 0 : 1) != 0) {
        break;
      }
      if ((paramArrayOfDouble2[(i3 - 1 + (i3 - 1 - 1) * paramInt7 + paramInt6)] == 0.0D ? 0 : 1) != 0) {
        i3 += 1;
      }
    }
    paramArrayOfInt[(i11 + 1 - 1 + paramInt18)] = (paramInt3 + 1);
    if ((paramArrayOfInt[(i11 - 1 + paramInt18)] != paramArrayOfInt[(i11 + 1 - 1 + paramInt18)] ? 0 : 1) != 0) {
      i11 -= 1;
    }
    int i13;
    int i14;
    if (bool)
    {
      n = 1;
      for (i12 = i2 - 1 + 1; i12 > 0; i12--)
      {
        localdoubleW1.val = 0.0D;
        localdoubleW2.val = 1.0D;
        localintW3.val = 0;
        paramdoubleW1.val = 1.0D;
        i3 = i10 + 2;
        for (i13 = i11 - (i10 + 2) + 1; i13 > 0; i13--)
        {
          i5 = paramArrayOfInt[(i3 - 1 + paramInt18)];
          i4 = paramArrayOfInt[(i3 + 1 - 1 + paramInt18)] - 1;
          i9 = i4 - i5 + 1;
          j = i10;
          for (i14 = (1 - i10 + -1) / -1; i14 > 0; i14--)
          {
            i1 = paramArrayOfInt[(j - 1 + paramInt18)];
            k = paramArrayOfInt[(j + 1 - 1 + paramInt18)] - 1;
            i8 = k - i1 + 1;
            localintW2.val = 0;
            Dtgsy2.dtgsy2(paramString, m, i8, i9, paramArrayOfDouble1, i1 - 1 + (i1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i5 - 1 + (i5 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble4, i1 - 1 + (i1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble5, i5 - 1 + (i5 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, localdoubleW3, localdoubleW2, localdoubleW1, paramArrayOfInt, i11 + 2 - 1 + paramInt18, localintW2, localintW1);
            if ((localintW1.val <= 0 ? 0 : 1) != 0) {
              paramintW.val = localintW1.val;
            }
            localintW3.val += localintW2.val;
            if ((localdoubleW3.val == 1.0D ? 0 : 1) != 0)
            {
              i6 = 1;
              for (int i15 = i5 - 1 - 1 + 1; i15 > 0; i15--)
              {
                Dscal.dscal(paramInt2, localdoubleW3.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                Dscal.dscal(paramInt2, localdoubleW3.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                i6 += 1;
              }
              i6 = i5;
              for (i15 = i4 - i5 + 1; i15 > 0; i15--)
              {
                Dscal.dscal(i1 - 1, localdoubleW3.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                Dscal.dscal(i1 - 1, localdoubleW3.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                i6 += 1;
              }
              i6 = i5;
              for (i15 = i4 - i5 + 1; i15 > 0; i15--)
              {
                Dscal.dscal(paramInt2 - k, localdoubleW3.val, paramArrayOfDouble3, k + 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                Dscal.dscal(paramInt2 - k, localdoubleW3.val, paramArrayOfDouble6, k + 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                i6 += 1;
              }
              i6 = i4 + 1;
              for (i15 = paramInt3 - (i4 + 1) + 1; i15 > 0; i15--)
              {
                Dscal.dscal(paramInt2, localdoubleW3.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                Dscal.dscal(paramInt2, localdoubleW3.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                i6 += 1;
              }
              paramdoubleW1.val *= localdoubleW3.val;
            }
            if ((j <= 1 ? 0 : 1) != 0)
            {
              Dgemm.dgemm("N", "N", i1 - 1, i9, i8, -1.0D, paramArrayOfDouble1, 1 - 1 + (i1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, 1.0D, paramArrayOfDouble3, 1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9);
              Dgemm.dgemm("N", "N", i1 - 1, i9, i8, -1.0D, paramArrayOfDouble4, 1 - 1 + (i1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, 1.0D, paramArrayOfDouble6, 1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15);
            }
            if ((i3 >= i11 ? 0 : 1) != 0)
            {
              Dgemm.dgemm("N", "N", i8, paramInt3 - i4, i9, 1.0D, paramArrayOfDouble6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfDouble2, i5 - 1 + (i4 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble3, i1 - 1 + (i4 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
              Dgemm.dgemm("N", "N", i8, paramInt3 - i4, i9, 1.0D, paramArrayOfDouble6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfDouble5, i5 - 1 + (i4 + 1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0D, paramArrayOfDouble6, i1 - 1 + (i4 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
            }
            j += -1;
          }
          i3 += 1;
        }
        if ((localdoubleW1.val == 0.0D ? 0 : 1) != 0)
        {
          if ((paramInt1 != 1 ? 0 : 1) == 0) {}
          if (((paramInt1 != 3 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramdoubleW2.val = (Math.sqrt(2 * paramInt2 * paramInt3) / (localdoubleW1.val * Math.sqrt(localdoubleW2.val)));
          } else {
            paramdoubleW2.val = (Math.sqrt(localintW3.val) / (localdoubleW1.val * Math.sqrt(localdoubleW2.val)));
          }
        }
        if ((i2 != 2 ? 0 : 1) != 0) {}
        if (((n != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
        {
          if (bool) {
            m = paramInt1;
          }
          d = paramdoubleW1.val;
          Dlacpy.dlacpy("F", paramInt2, paramInt3, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble7, paramInt16, paramInt2);
          Dlacpy.dlacpy("F", paramInt2, paramInt3, paramArrayOfDouble6, paramInt14, paramInt15, paramArrayOfDouble7, paramInt2 * paramInt3 + 1 - 1 + paramInt16, paramInt2);
          Dlaset.dlaset("F", paramInt2, paramInt3, 0.0D, 0.0D, paramArrayOfDouble3, paramInt8, paramInt9);
          Dlaset.dlaset("F", paramInt2, paramInt3, 0.0D, 0.0D, paramArrayOfDouble6, paramInt14, paramInt15);
        }
        else
        {
          if ((i2 != 2 ? 0 : 1) != 0) {}
          if (((n != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            Dlacpy.dlacpy("F", paramInt2, paramInt3, paramArrayOfDouble7, paramInt16, paramInt2, paramArrayOfDouble3, paramInt8, paramInt9);
            Dlacpy.dlacpy("F", paramInt2, paramInt3, paramArrayOfDouble7, paramInt2 * paramInt3 + 1 - 1 + paramInt16, paramInt2, paramArrayOfDouble6, paramInt14, paramInt15);
            paramdoubleW1.val = d;
          }
        }
        n += 1;
      }
    }
    else
    {
      paramdoubleW1.val = 1.0D;
      j = 1;
      for (i12 = i10 - 1 + 1; i12 > 0; i12--)
      {
        i1 = paramArrayOfInt[(j - 1 + paramInt18)];
        k = paramArrayOfInt[(j + 1 - 1 + paramInt18)] - 1;
        i8 = k - i1 + 1;
        i3 = i11;
        for (i13 = (i10 + 2 - i11 + -1) / -1; i13 > 0; i13--)
        {
          i5 = paramArrayOfInt[(i3 - 1 + paramInt18)];
          i4 = paramArrayOfInt[(i3 + 1 - 1 + paramInt18)] - 1;
          i9 = i4 - i5 + 1;
          Dtgsy2.dtgsy2(paramString, m, i8, i9, paramArrayOfDouble1, i1 - 1 + (i1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, i5 - 1 + (i5 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble4, i1 - 1 + (i1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble5, i5 - 1 + (i5 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, localdoubleW3, localdoubleW2, localdoubleW1, paramArrayOfInt, i11 + 2 - 1 + paramInt18, localintW2, localintW1);
          if ((localintW1.val <= 0 ? 0 : 1) != 0) {
            paramintW.val = localintW1.val;
          }
          if ((localdoubleW3.val == 1.0D ? 0 : 1) != 0)
          {
            i6 = 1;
            for (i14 = i5 - 1 - 1 + 1; i14 > 0; i14--)
            {
              Dscal.dscal(paramInt2, localdoubleW3.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
              Dscal.dscal(paramInt2, localdoubleW3.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
              i6 += 1;
            }
            i6 = i5;
            for (i14 = i4 - i5 + 1; i14 > 0; i14--)
            {
              Dscal.dscal(i1 - 1, localdoubleW3.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
              Dscal.dscal(i1 - 1, localdoubleW3.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
              i6 += 1;
            }
            i6 = i5;
            for (i14 = i4 - i5 + 1; i14 > 0; i14--)
            {
              Dscal.dscal(paramInt2 - k, localdoubleW3.val, paramArrayOfDouble3, k + 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
              Dscal.dscal(paramInt2 - k, localdoubleW3.val, paramArrayOfDouble6, k + 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
              i6 += 1;
            }
            i6 = i4 + 1;
            for (i14 = paramInt3 - (i4 + 1) + 1; i14 > 0; i14--)
            {
              Dscal.dscal(paramInt2, localdoubleW3.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
              Dscal.dscal(paramInt2, localdoubleW3.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
              i6 += 1;
            }
            paramdoubleW1.val *= localdoubleW3.val;
          }
          if ((i3 <= i10 + 2 ? 0 : 1) != 0)
          {
            Dgemm.dgemm("N", "T", i8, i5 - 1, i9, 1.0D, paramArrayOfDouble3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i5 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble6, i1 - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
            Dgemm.dgemm("N", "T", i8, i5 - 1, i9, 1.0D, paramArrayOfDouble6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfDouble5, 1 - 1 + (i5 - 1) * paramInt13 + paramInt12, paramInt13, 1.0D, paramArrayOfDouble6, i1 - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
          }
          if ((j >= i10 ? 0 : 1) != 0)
          {
            Dgemm.dgemm("T", "N", paramInt2 - k, i9, i8, -1.0D, paramArrayOfDouble1, i1 - 1 + (k + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, i1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, 1.0D, paramArrayOfDouble3, k + 1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9);
            Dgemm.dgemm("T", "N", paramInt2 - k, i9, i8, -1.0D, paramArrayOfDouble4, i1 - 1 + (k + 1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble6, i1 - 1 + (i5 - 1) * paramInt15 + paramInt14, paramInt15, 1.0D, paramArrayOfDouble3, k + 1 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9);
          }
          i3 += -1;
        }
        j += 1;
      }
    }
    paramArrayOfDouble7[(1 - 1 + paramInt16)] = i7;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtgsyl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */