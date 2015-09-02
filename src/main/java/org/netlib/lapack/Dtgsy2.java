package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Dgemv;
import org.netlib.blas.Dger;
import org.netlib.blas.Dscal;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtgsy2
{
  public static void dtgsy2(String paramString, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, double[] paramArrayOfDouble6, int paramInt14, int paramInt15, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, int[] paramArrayOfInt, int paramInt16, intW paramintW1, intW paramintW2)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    intW localintW = new intW(0);
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
    double d = 0.0D;
    doubleW localdoubleW = new doubleW(0.0D);
    int[] arrayOfInt1 = new int[8];
    int[] arrayOfInt2 = new int[8];
    double[] arrayOfDouble1 = new double[8];
    double[] arrayOfDouble2 = new double[8 * 8];
    paramintW2.val = 0;
    localintW.val = 0;
    bool = Lsame.lsame(paramString, "N");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "T") ^ true)) ? 1 : 0) != 0)
    {
      paramintW2.val = -1;
    }
    else if (bool)
    {
      if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt1 <= 2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -2;
      }
    }
    if ((paramintW2.val != 0 ? 0 : 1) != 0) {
      if ((paramInt2 > 0 ? 0 : 1) != 0) {
        paramintW2.val = -3;
      } else if ((paramInt3 > 0 ? 0 : 1) != 0) {
        paramintW2.val = -4;
      } else if ((paramInt5 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW2.val = -5;
      } else if ((paramInt7 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
        paramintW2.val = -8;
      } else if ((paramInt9 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW2.val = -10;
      } else if ((paramInt11 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW2.val = -12;
      } else if ((paramInt13 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
        paramintW2.val = -14;
      } else if ((paramInt15 >= Math.max(1, paramInt2) ? 0 : 1) != 0) {
        paramintW2.val = -16;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTGSY2", -paramintW2.val);
      return;
    }
    paramintW1.val = 0;
    i9 = 0;
    i = 1;
    while ((i <= paramInt2 ? 0 : 1) == 0)
    {
      i9 += 1;
      paramArrayOfInt[(i9 - 1 + paramInt16)] = i;
      if ((i != paramInt2 ? 0 : 1) != 0) {
        break;
      }
      if ((paramArrayOfDouble1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)] == 0.0D ? 0 : 1) != 0) {
        i += 2;
      } else {
        i += 1;
      }
    }
    paramArrayOfInt[(i9 + 1 - 1 + paramInt16)] = (paramInt2 + 1);
    i10 = i9 + 1;
    i1 = 1;
    while ((i1 <= paramInt3 ? 0 : 1) == 0)
    {
      i10 += 1;
      paramArrayOfInt[(i10 - 1 + paramInt16)] = i1;
      if ((i1 != paramInt3 ? 0 : 1) != 0) {
        break;
      }
      if ((paramArrayOfDouble2[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] == 0.0D ? 0 : 1) != 0) {
        i1 += 2;
      } else {
        i1 += 1;
      }
    }
    paramArrayOfInt[(i10 + 1 - 1 + paramInt16)] = (paramInt3 + 1);
    paramintW1.val = (i9 * (i10 - i9 - 1));
    int i12;
    int i13;
    int i14;
    if (bool)
    {
      paramdoubleW1.val = 1.0D;
      localdoubleW.val = 1.0D;
      i1 = i9 + 2;
      for (i12 = i10 - (i9 + 2) + 1; i12 > 0; i12--)
      {
        i4 = paramArrayOfInt[(i1 - 1 + paramInt16)];
        i5 = i4 + 1;
        i2 = paramArrayOfInt[(i1 + 1 - 1 + paramInt16)] - 1;
        i8 = i2 - i4 + 1;
        i = i9;
        for (i13 = (1 - i9 + -1) / -1; i13 > 0; i13--)
        {
          m = paramArrayOfInt[(i - 1 + paramInt16)];
          n = m + 1;
          j = paramArrayOfInt[(i + 1 - 1 + paramInt16)] - 1;
          i7 = j - m + 1;
          i11 = i7 * i8 * 2;
          if ((i7 != 1 ? 0 : 1) != 0) {}
          if (((i8 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            arrayOfDouble2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
            arrayOfDouble2[(2 - 1 + (1 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
            arrayOfDouble2[(1 - 1 + (2 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
            arrayOfDouble2[(2 - 1 + (2 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
            arrayOfDouble1[(1 - 1)] = paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
            arrayOfDouble1[(2 - 1)] = paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
            Dgetc2.dgetc2(i11, arrayOfDouble2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
            if ((localintW.val <= 0 ? 0 : 1) != 0) {
              paramintW2.val = localintW.val;
            }
            if ((paramInt1 != 0 ? 0 : 1) != 0)
            {
              Dgesc2.dgesc2(i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localdoubleW);
              if ((localdoubleW.val == 1.0D ? 0 : 1) != 0)
              {
                i6 = 1;
                for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                {
                  Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                  Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                  i6 += 1;
                }
                paramdoubleW1.val *= localdoubleW.val;
              }
            }
            else
            {
              Dlatdf.dlatdf(paramInt1, i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, paramdoubleW2, paramdoubleW3, arrayOfInt1, 0, arrayOfInt2, 0);
            }
            paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfDouble1[(1 - 1)];
            paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfDouble1[(2 - 1)];
            if ((i <= 1 ? 0 : 1) != 0)
            {
              d = -arrayOfDouble1[(1 - 1)];
              Daxpy.daxpy(m - 1, d, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
              Daxpy.daxpy(m - 1, d, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt11 + paramInt10, 1, paramArrayOfDouble6, 1 - 1 + (i4 - 1) * paramInt15 + paramInt14, 1);
            }
            if ((i1 >= i10 ? 0 : 1) != 0)
            {
              Daxpy.daxpy(paramInt3 - i2, arrayOfDouble1[(2 - 1)], paramArrayOfDouble2, i4 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3, m - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
              Daxpy.daxpy(paramInt3 - i2, arrayOfDouble1[(2 - 1)], paramArrayOfDouble5, i4 - 1 + (i2 + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, m - 1 + (i2 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
            }
          }
          else
          {
            if ((i7 != 1 ? 0 : 1) != 0) {}
            if (((i8 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              arrayOfDouble2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
              arrayOfDouble2[(2 - 1 + (1 - 1) * 8)] = 0.0D;
              arrayOfDouble2[(3 - 1 + (1 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
              arrayOfDouble2[(4 - 1 + (1 - 1) * 8)] = 0.0D;
              arrayOfDouble2[(1 - 1 + (2 - 1) * 8)] = 0.0D;
              arrayOfDouble2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
              arrayOfDouble2[(3 - 1 + (2 - 1) * 8)] = 0.0D;
              arrayOfDouble2[(4 - 1 + (2 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
              arrayOfDouble2[(1 - 1 + (3 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
              arrayOfDouble2[(2 - 1 + (3 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
              arrayOfDouble2[(3 - 1 + (3 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
              arrayOfDouble2[(4 - 1 + (3 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
              arrayOfDouble2[(1 - 1 + (4 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
              arrayOfDouble2[(2 - 1 + (4 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
              arrayOfDouble2[(3 - 1 + (4 - 1) * 8)] = 0.0D;
              arrayOfDouble2[(4 - 1 + (4 - 1) * 8)] = (-paramArrayOfDouble5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
              arrayOfDouble1[(1 - 1)] = paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
              arrayOfDouble1[(2 - 1)] = paramArrayOfDouble3[(m - 1 + (i5 - 1) * paramInt9 + paramInt8)];
              arrayOfDouble1[(3 - 1)] = paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
              arrayOfDouble1[(4 - 1)] = paramArrayOfDouble6[(m - 1 + (i5 - 1) * paramInt15 + paramInt14)];
              Dgetc2.dgetc2(i11, arrayOfDouble2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
              if ((localintW.val <= 0 ? 0 : 1) != 0) {
                paramintW2.val = localintW.val;
              }
              if ((paramInt1 != 0 ? 0 : 1) != 0)
              {
                Dgesc2.dgesc2(i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localdoubleW);
                if ((localdoubleW.val == 1.0D ? 0 : 1) != 0)
                {
                  i6 = 1;
                  for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                  {
                    Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                    Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                    i6 += 1;
                  }
                  paramdoubleW1.val *= localdoubleW.val;
                }
              }
              else
              {
                Dlatdf.dlatdf(paramInt1, i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, paramdoubleW2, paramdoubleW3, arrayOfInt1, 0, arrayOfInt2, 0);
              }
              paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfDouble1[(1 - 1)];
              paramArrayOfDouble3[(m - 1 + (i5 - 1) * paramInt9 + paramInt8)] = arrayOfDouble1[(2 - 1)];
              paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfDouble1[(3 - 1)];
              paramArrayOfDouble6[(m - 1 + (i5 - 1) * paramInt15 + paramInt14)] = arrayOfDouble1[(4 - 1)];
              if ((i <= 1 ? 0 : 1) != 0)
              {
                Dger.dger(m - 1, i8, -1.0D, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, arrayOfDouble1, 1 - 1, 1, paramArrayOfDouble3, 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
                Dger.dger(m - 1, i8, -1.0D, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt11 + paramInt10, 1, arrayOfDouble1, 1 - 1, 1, paramArrayOfDouble6, 1 - 1 + (i4 - 1) * paramInt15 + paramInt14, paramInt15);
              }
              if ((i1 >= i10 ? 0 : 1) != 0)
              {
                Daxpy.daxpy(paramInt3 - i2, arrayOfDouble1[(3 - 1)], paramArrayOfDouble2, i4 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3, m - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
                Daxpy.daxpy(paramInt3 - i2, arrayOfDouble1[(3 - 1)], paramArrayOfDouble5, i4 - 1 + (i2 + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, m - 1 + (i2 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
                Daxpy.daxpy(paramInt3 - i2, arrayOfDouble1[(4 - 1)], paramArrayOfDouble2, i5 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3, m - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
                Daxpy.daxpy(paramInt3 - i2, arrayOfDouble1[(4 - 1)], paramArrayOfDouble5, i5 - 1 + (i2 + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, m - 1 + (i2 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
              }
            }
            else
            {
              if ((i7 != 2 ? 0 : 1) != 0) {}
              if (((i8 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                arrayOfDouble2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                arrayOfDouble2[(2 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                arrayOfDouble2[(3 - 1 + (1 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                arrayOfDouble2[(4 - 1 + (1 - 1) * 8)] = 0.0D;
                arrayOfDouble2[(1 - 1 + (2 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                arrayOfDouble2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                arrayOfDouble2[(3 - 1 + (2 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                arrayOfDouble2[(4 - 1 + (2 - 1) * 8)] = paramArrayOfDouble4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                arrayOfDouble2[(1 - 1 + (3 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                arrayOfDouble2[(2 - 1 + (3 - 1) * 8)] = 0.0D;
                arrayOfDouble2[(3 - 1 + (3 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                arrayOfDouble2[(4 - 1 + (3 - 1) * 8)] = 0.0D;
                arrayOfDouble2[(1 - 1 + (4 - 1) * 8)] = 0.0D;
                arrayOfDouble2[(2 - 1 + (4 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                arrayOfDouble2[(3 - 1 + (4 - 1) * 8)] = 0.0D;
                arrayOfDouble2[(4 - 1 + (4 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                arrayOfDouble1[(1 - 1)] = paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
                arrayOfDouble1[(2 - 1)] = paramArrayOfDouble3[(n - 1 + (i4 - 1) * paramInt9 + paramInt8)];
                arrayOfDouble1[(3 - 1)] = paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
                arrayOfDouble1[(4 - 1)] = paramArrayOfDouble6[(n - 1 + (i4 - 1) * paramInt15 + paramInt14)];
                Dgetc2.dgetc2(i11, arrayOfDouble2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
                if ((localintW.val <= 0 ? 0 : 1) != 0) {
                  paramintW2.val = localintW.val;
                }
                if ((paramInt1 != 0 ? 0 : 1) != 0)
                {
                  Dgesc2.dgesc2(i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localdoubleW);
                  if ((localdoubleW.val == 1.0D ? 0 : 1) != 0)
                  {
                    i6 = 1;
                    for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                    {
                      Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                      Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                      i6 += 1;
                    }
                    paramdoubleW1.val *= localdoubleW.val;
                  }
                }
                else
                {
                  Dlatdf.dlatdf(paramInt1, i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, paramdoubleW2, paramdoubleW3, arrayOfInt1, 0, arrayOfInt2, 0);
                }
                paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfDouble1[(1 - 1)];
                paramArrayOfDouble3[(n - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfDouble1[(2 - 1)];
                paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfDouble1[(3 - 1)];
                paramArrayOfDouble6[(n - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfDouble1[(4 - 1)];
                if ((i <= 1 ? 0 : 1) != 0)
                {
                  Dgemv.dgemv("N", m - 1, i7, -1.0D, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble1, 1 - 1, 1, 1.0D, paramArrayOfDouble3, 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
                  Dgemv.dgemv("N", m - 1, i7, -1.0D, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt11 + paramInt10, paramInt11, arrayOfDouble1, 1 - 1, 1, 1.0D, paramArrayOfDouble6, 1 - 1 + (i4 - 1) * paramInt15 + paramInt14, 1);
                }
                if ((i1 >= i10 ? 0 : 1) != 0)
                {
                  Dger.dger(i7, paramInt3 - i2, 1.0D, arrayOfDouble1, 3 - 1, 1, paramArrayOfDouble2, i4 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble3, m - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
                  Dger.dger(i7, paramInt3 - i2, 1.0D, arrayOfDouble1, 3 - 1, 1, paramArrayOfDouble5, i4 - 1 + (i2 + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble6, m - 1 + (i2 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
                }
              }
              else
              {
                if ((i7 != 2 ? 0 : 1) != 0) {}
                if (((i8 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  Dlaset.dlaset("F", 8, 8, 0.0D, 0.0D, arrayOfDouble2, 0, 8);
                  arrayOfDouble2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(2 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(5 - 1 + (1 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(1 - 1 + (2 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(5 - 1 + (2 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(6 - 1 + (2 - 1) * 8)] = paramArrayOfDouble4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(3 - 1 + (3 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(4 - 1 + (3 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(7 - 1 + (3 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(3 - 1 + (4 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(4 - 1 + (4 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(7 - 1 + (4 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(8 - 1 + (4 - 1) * 8)] = paramArrayOfDouble4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(1 - 1 + (5 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(3 - 1 + (5 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(5 - 1 + (5 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                  arrayOfDouble2[(7 - 1 + (5 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfDouble2[(2 - 1 + (6 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(4 - 1 + (6 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(6 - 1 + (6 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                  arrayOfDouble2[(8 - 1 + (6 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfDouble2[(1 - 1 + (7 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(3 - 1 + (7 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(7 - 1 + (7 - 1) * 8)] = (-paramArrayOfDouble5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfDouble2[(2 - 1 + (8 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(4 - 1 + (8 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(8 - 1 + (8 - 1) * 8)] = (-paramArrayOfDouble5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  i6 = 1;
                  k = i7 * i8 + 1;
                  i3 = 0;
                  for (i14 = i8 - 1 - 0 + 1; i14 > 0; i14--)
                  {
                    Dcopy.dcopy(i7, paramArrayOfDouble3, m - 1 + (i4 + i3 - 1) * paramInt9 + paramInt8, 1, arrayOfDouble1, i6 - 1, 1);
                    Dcopy.dcopy(i7, paramArrayOfDouble6, m - 1 + (i4 + i3 - 1) * paramInt15 + paramInt14, 1, arrayOfDouble1, k - 1, 1);
                    i6 += i7;
                    k += i7;
                    i3 += 1;
                  }
                  Dgetc2.dgetc2(i11, arrayOfDouble2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
                  if ((localintW.val <= 0 ? 0 : 1) != 0) {
                    paramintW2.val = localintW.val;
                  }
                  if ((paramInt1 != 0 ? 0 : 1) != 0)
                  {
                    Dgesc2.dgesc2(i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localdoubleW);
                    if ((localdoubleW.val == 1.0D ? 0 : 1) != 0)
                    {
                      i6 = 1;
                      for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                      {
                        Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                        Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                        i6 += 1;
                      }
                      paramdoubleW1.val *= localdoubleW.val;
                    }
                  }
                  else
                  {
                    Dlatdf.dlatdf(paramInt1, i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, paramdoubleW2, paramdoubleW3, arrayOfInt1, 0, arrayOfInt2, 0);
                  }
                  i6 = 1;
                  k = i7 * i8 + 1;
                  i3 = 0;
                  for (i14 = i8 - 1 - 0 + 1; i14 > 0; i14--)
                  {
                    Dcopy.dcopy(i7, arrayOfDouble1, i6 - 1, 1, paramArrayOfDouble3, m - 1 + (i4 + i3 - 1) * paramInt9 + paramInt8, 1);
                    Dcopy.dcopy(i7, arrayOfDouble1, k - 1, 1, paramArrayOfDouble6, m - 1 + (i4 + i3 - 1) * paramInt15 + paramInt14, 1);
                    i6 += i7;
                    k += i7;
                    i3 += 1;
                  }
                  if ((i <= 1 ? 0 : 1) != 0)
                  {
                    Dgemm.dgemm("N", "N", m - 1, i8, i7, -1.0D, paramArrayOfDouble1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble1, 1 - 1, i7, 1.0D, paramArrayOfDouble3, 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
                    Dgemm.dgemm("N", "N", m - 1, i8, i7, -1.0D, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt11 + paramInt10, paramInt11, arrayOfDouble1, 1 - 1, i7, 1.0D, paramArrayOfDouble6, 1 - 1 + (i4 - 1) * paramInt15 + paramInt14, paramInt15);
                  }
                  if ((i1 >= i10 ? 0 : 1) != 0)
                  {
                    i6 = i7 * i8 + 1;
                    Dgemm.dgemm("N", "N", i7, paramInt3 - i2, i8, 1.0D, arrayOfDouble1, i6 - 1, i7, paramArrayOfDouble2, i4 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble3, m - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
                    Dgemm.dgemm("N", "N", i7, paramInt3 - i2, i8, 1.0D, arrayOfDouble1, i6 - 1, i7, paramArrayOfDouble5, i4 - 1 + (i2 + 1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0D, paramArrayOfDouble6, m - 1 + (i2 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
                  }
                }
              }
            }
          }
          i += -1;
        }
        i1 += 1;
      }
    }
    else
    {
      paramdoubleW1.val = 1.0D;
      localdoubleW.val = 1.0D;
      i = 1;
      for (i12 = i9 - 1 + 1; i12 > 0; i12--)
      {
        m = paramArrayOfInt[(i - 1 + paramInt16)];
        n = m + 1;
        j = i + 1 - 1;
        i7 = j - m + 1;
        i1 = i10;
        for (i13 = (i9 + 2 - i10 + -1) / -1; i13 > 0; i13--)
        {
          i4 = paramArrayOfInt[(i1 - 1 + paramInt16)];
          i5 = i4 + 1;
          i2 = paramArrayOfInt[(i1 + 1 - 1 + paramInt16)] - 1;
          i8 = i2 - i4 + 1;
          i11 = i7 * i8 * 2;
          if ((i7 != 1 ? 0 : 1) != 0) {}
          if (((i8 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
          {
            arrayOfDouble2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
            arrayOfDouble2[(2 - 1 + (1 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
            arrayOfDouble2[(1 - 1 + (2 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
            arrayOfDouble2[(2 - 1 + (2 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
            arrayOfDouble1[(1 - 1)] = paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
            arrayOfDouble1[(2 - 1)] = paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
            Dgetc2.dgetc2(i11, arrayOfDouble2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
            if ((localintW.val <= 0 ? 0 : 1) != 0) {
              paramintW2.val = localintW.val;
            }
            Dgesc2.dgesc2(i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localdoubleW);
            if ((localdoubleW.val == 1.0D ? 0 : 1) != 0)
            {
              i6 = 1;
              for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
              {
                Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                i6 += 1;
              }
              paramdoubleW1.val *= localdoubleW.val;
            }
            paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfDouble1[(1 - 1)];
            paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfDouble1[(2 - 1)];
            if ((i1 <= i9 + 2 ? 0 : 1) != 0)
            {
              d = arrayOfDouble1[(1 - 1)];
              Daxpy.daxpy(i4 - 1, d, paramArrayOfDouble2, 1 - 1 + (i4 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
              d = arrayOfDouble1[(2 - 1)];
              Daxpy.daxpy(i4 - 1, d, paramArrayOfDouble5, 1 - 1 + (i4 - 1) * paramInt13 + paramInt12, 1, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
            }
            if ((i >= i9 ? 0 : 1) != 0)
            {
              d = -arrayOfDouble1[(1 - 1)];
              Daxpy.daxpy(paramInt2 - j, d, paramArrayOfDouble1, m - 1 + (j + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
              d = -arrayOfDouble1[(2 - 1)];
              Daxpy.daxpy(paramInt2 - j, d, paramArrayOfDouble4, m - 1 + (j + 1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
            }
          }
          else
          {
            if ((i7 != 1 ? 0 : 1) != 0) {}
            if (((i8 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              arrayOfDouble2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
              arrayOfDouble2[(2 - 1 + (1 - 1) * 8)] = 0.0D;
              arrayOfDouble2[(3 - 1 + (1 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
              arrayOfDouble2[(4 - 1 + (1 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
              arrayOfDouble2[(1 - 1 + (2 - 1) * 8)] = 0.0D;
              arrayOfDouble2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
              arrayOfDouble2[(3 - 1 + (2 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
              arrayOfDouble2[(4 - 1 + (2 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
              arrayOfDouble2[(1 - 1 + (3 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
              arrayOfDouble2[(2 - 1 + (3 - 1) * 8)] = 0.0D;
              arrayOfDouble2[(3 - 1 + (3 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
              arrayOfDouble2[(4 - 1 + (3 - 1) * 8)] = 0.0D;
              arrayOfDouble2[(1 - 1 + (4 - 1) * 8)] = 0.0D;
              arrayOfDouble2[(2 - 1 + (4 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
              arrayOfDouble2[(3 - 1 + (4 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
              arrayOfDouble2[(4 - 1 + (4 - 1) * 8)] = (-paramArrayOfDouble5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
              arrayOfDouble1[(1 - 1)] = paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
              arrayOfDouble1[(2 - 1)] = paramArrayOfDouble3[(m - 1 + (i5 - 1) * paramInt9 + paramInt8)];
              arrayOfDouble1[(3 - 1)] = paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
              arrayOfDouble1[(4 - 1)] = paramArrayOfDouble6[(m - 1 + (i5 - 1) * paramInt15 + paramInt14)];
              Dgetc2.dgetc2(i11, arrayOfDouble2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
              if ((localintW.val <= 0 ? 0 : 1) != 0) {
                paramintW2.val = localintW.val;
              }
              Dgesc2.dgesc2(i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localdoubleW);
              if ((localdoubleW.val == 1.0D ? 0 : 1) != 0)
              {
                i6 = 1;
                for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                {
                  Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                  Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                  i6 += 1;
                }
                paramdoubleW1.val *= localdoubleW.val;
              }
              paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfDouble1[(1 - 1)];
              paramArrayOfDouble3[(m - 1 + (i5 - 1) * paramInt9 + paramInt8)] = arrayOfDouble1[(2 - 1)];
              paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfDouble1[(3 - 1)];
              paramArrayOfDouble6[(m - 1 + (i5 - 1) * paramInt15 + paramInt14)] = arrayOfDouble1[(4 - 1)];
              if ((i1 <= i9 + 2 ? 0 : 1) != 0)
              {
                Daxpy.daxpy(i4 - 1, arrayOfDouble1[(1 - 1)], paramArrayOfDouble2, 1 - 1 + (i4 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                Daxpy.daxpy(i4 - 1, arrayOfDouble1[(2 - 1)], paramArrayOfDouble2, 1 - 1 + (i5 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                Daxpy.daxpy(i4 - 1, arrayOfDouble1[(3 - 1)], paramArrayOfDouble5, 1 - 1 + (i4 - 1) * paramInt13 + paramInt12, 1, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                Daxpy.daxpy(i4 - 1, arrayOfDouble1[(4 - 1)], paramArrayOfDouble5, 1 - 1 + (i5 - 1) * paramInt13 + paramInt12, 1, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
              }
              if ((i >= i9 ? 0 : 1) != 0)
              {
                Dger.dger(paramInt2 - j, i8, -1.0D, paramArrayOfDouble1, m - 1 + (j + 1 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble1, 1 - 1, 1, paramArrayOfDouble3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
                Dger.dger(paramInt2 - j, i8, -1.0D, paramArrayOfDouble4, m - 1 + (j + 1 - 1) * paramInt11 + paramInt10, paramInt11, arrayOfDouble1, 3 - 1, 1, paramArrayOfDouble3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
              }
            }
            else
            {
              if ((i7 != 2 ? 0 : 1) != 0) {}
              if (((i8 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                arrayOfDouble2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                arrayOfDouble2[(2 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                arrayOfDouble2[(3 - 1 + (1 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                arrayOfDouble2[(4 - 1 + (1 - 1) * 8)] = 0.0D;
                arrayOfDouble2[(1 - 1 + (2 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                arrayOfDouble2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                arrayOfDouble2[(3 - 1 + (2 - 1) * 8)] = 0.0D;
                arrayOfDouble2[(4 - 1 + (2 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                arrayOfDouble2[(1 - 1 + (3 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                arrayOfDouble2[(2 - 1 + (3 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                arrayOfDouble2[(3 - 1 + (3 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                arrayOfDouble2[(4 - 1 + (3 - 1) * 8)] = 0.0D;
                arrayOfDouble2[(1 - 1 + (4 - 1) * 8)] = 0.0D;
                arrayOfDouble2[(2 - 1 + (4 - 1) * 8)] = paramArrayOfDouble4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                arrayOfDouble2[(3 - 1 + (4 - 1) * 8)] = 0.0D;
                arrayOfDouble2[(4 - 1 + (4 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                arrayOfDouble1[(1 - 1)] = paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
                arrayOfDouble1[(2 - 1)] = paramArrayOfDouble3[(n - 1 + (i4 - 1) * paramInt9 + paramInt8)];
                arrayOfDouble1[(3 - 1)] = paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
                arrayOfDouble1[(4 - 1)] = paramArrayOfDouble6[(n - 1 + (i4 - 1) * paramInt15 + paramInt14)];
                Dgetc2.dgetc2(i11, arrayOfDouble2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
                if ((localintW.val <= 0 ? 0 : 1) != 0) {
                  paramintW2.val = localintW.val;
                }
                Dgesc2.dgesc2(i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localdoubleW);
                if ((localdoubleW.val == 1.0D ? 0 : 1) != 0)
                {
                  i6 = 1;
                  for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                  {
                    Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                    Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                    i6 += 1;
                  }
                  paramdoubleW1.val *= localdoubleW.val;
                }
                paramArrayOfDouble3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfDouble1[(1 - 1)];
                paramArrayOfDouble3[(n - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfDouble1[(2 - 1)];
                paramArrayOfDouble6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfDouble1[(3 - 1)];
                paramArrayOfDouble6[(n - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfDouble1[(4 - 1)];
                if ((i1 <= i9 + 2 ? 0 : 1) != 0)
                {
                  Dger.dger(i7, i4 - 1, 1.0D, arrayOfDouble1, 1 - 1, 1, paramArrayOfDouble2, 1 - 1 + (i4 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                  Dger.dger(i7, i4 - 1, 1.0D, arrayOfDouble1, 3 - 1, 1, paramArrayOfDouble5, 1 - 1 + (i4 - 1) * paramInt13 + paramInt12, 1, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                }
                if ((i >= i9 ? 0 : 1) != 0)
                {
                  Dgemv.dgemv("T", i7, paramInt2 - j, -1.0D, paramArrayOfDouble1, m - 1 + (j + 1 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble1, 1 - 1, 1, 1.0D, paramArrayOfDouble3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
                  Dgemv.dgemv("T", i7, paramInt2 - j, -1.0D, paramArrayOfDouble4, m - 1 + (j + 1 - 1) * paramInt11 + paramInt10, paramInt11, arrayOfDouble1, 3 - 1, 1, 1.0D, paramArrayOfDouble3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
                }
              }
              else
              {
                if ((i7 != 2 ? 0 : 1) != 0) {}
                if (((i8 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  Dlaset.dlaset("F", 8, 8, 0.0D, 0.0D, arrayOfDouble2, 0, 8);
                  arrayOfDouble2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(2 - 1 + (1 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(5 - 1 + (1 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(7 - 1 + (1 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(1 - 1 + (2 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(6 - 1 + (2 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(8 - 1 + (2 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(3 - 1 + (3 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(4 - 1 + (3 - 1) * 8)] = paramArrayOfDouble1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(5 - 1 + (3 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(7 - 1 + (3 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(3 - 1 + (4 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(4 - 1 + (4 - 1) * 8)] = paramArrayOfDouble1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfDouble2[(6 - 1 + (4 - 1) * 8)] = (-paramArrayOfDouble2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(8 - 1 + (4 - 1) * 8)] = (-paramArrayOfDouble2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfDouble2[(1 - 1 + (5 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(2 - 1 + (5 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(5 - 1 + (5 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                  arrayOfDouble2[(2 - 1 + (6 - 1) * 8)] = paramArrayOfDouble4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(6 - 1 + (6 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                  arrayOfDouble2[(3 - 1 + (7 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(4 - 1 + (7 - 1) * 8)] = paramArrayOfDouble4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(5 - 1 + (7 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfDouble2[(7 - 1 + (7 - 1) * 8)] = (-paramArrayOfDouble5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfDouble2[(4 - 1 + (8 - 1) * 8)] = paramArrayOfDouble4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfDouble2[(6 - 1 + (8 - 1) * 8)] = (-paramArrayOfDouble5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfDouble2[(8 - 1 + (8 - 1) * 8)] = (-paramArrayOfDouble5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  i6 = 1;
                  k = i7 * i8 + 1;
                  i3 = 0;
                  for (i14 = i8 - 1 - 0 + 1; i14 > 0; i14--)
                  {
                    Dcopy.dcopy(i7, paramArrayOfDouble3, m - 1 + (i4 + i3 - 1) * paramInt9 + paramInt8, 1, arrayOfDouble1, i6 - 1, 1);
                    Dcopy.dcopy(i7, paramArrayOfDouble6, m - 1 + (i4 + i3 - 1) * paramInt15 + paramInt14, 1, arrayOfDouble1, k - 1, 1);
                    i6 += i7;
                    k += i7;
                    i3 += 1;
                  }
                  Dgetc2.dgetc2(i11, arrayOfDouble2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
                  if ((localintW.val <= 0 ? 0 : 1) != 0) {
                    paramintW2.val = localintW.val;
                  }
                  Dgesc2.dgesc2(i11, arrayOfDouble2, 0, 8, arrayOfDouble1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localdoubleW);
                  if ((localdoubleW.val == 1.0D ? 0 : 1) != 0)
                  {
                    i6 = 1;
                    for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                    {
                      Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                      Dscal.dscal(paramInt2, localdoubleW.val, paramArrayOfDouble6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                      i6 += 1;
                    }
                    paramdoubleW1.val *= localdoubleW.val;
                  }
                  i6 = 1;
                  k = i7 * i8 + 1;
                  i3 = 0;
                  for (i14 = i8 - 1 - 0 + 1; i14 > 0; i14--)
                  {
                    Dcopy.dcopy(i7, arrayOfDouble1, i6 - 1, 1, paramArrayOfDouble3, m - 1 + (i4 + i3 - 1) * paramInt9 + paramInt8, 1);
                    Dcopy.dcopy(i7, arrayOfDouble1, k - 1, 1, paramArrayOfDouble6, m - 1 + (i4 + i3 - 1) * paramInt15 + paramInt14, 1);
                    i6 += i7;
                    k += i7;
                    i3 += 1;
                  }
                  if ((i1 <= i9 + 2 ? 0 : 1) != 0)
                  {
                    Dgemm.dgemm("N", "T", i7, i4 - 1, i8, 1.0D, paramArrayOfDouble3, m - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble2, 1 - 1 + (i4 - 1) * paramInt7 + paramInt6, paramInt7, 1.0D, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                    Dgemm.dgemm("N", "T", i7, i4 - 1, i8, 1.0D, paramArrayOfDouble6, m - 1 + (i4 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfDouble5, 1 - 1 + (i4 - 1) * paramInt13 + paramInt12, paramInt13, 1.0D, paramArrayOfDouble6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                  }
                  if ((i >= i9 ? 0 : 1) != 0)
                  {
                    Dgemm.dgemm("T", "N", paramInt2 - j, i8, i7, -1.0D, paramArrayOfDouble1, m - 1 + (j + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble3, m - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, 1.0D, paramArrayOfDouble3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
                    Dgemm.dgemm("T", "N", paramInt2 - j, i8, i7, -1.0D, paramArrayOfDouble4, m - 1 + (j + 1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfDouble6, m - 1 + (i4 - 1) * paramInt15 + paramInt14, paramInt15, 1.0D, paramArrayOfDouble3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
                  }
                }
              }
            }
          }
          i1 += -1;
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtgsy2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */