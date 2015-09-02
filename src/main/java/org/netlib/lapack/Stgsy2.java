package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sgemm;
import org.netlib.blas.Sgemv;
import org.netlib.blas.Sger;
import org.netlib.blas.Sscal;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Stgsy2
{
  public static void stgsy2(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, int paramInt9, float[] paramArrayOfFloat4, int paramInt10, int paramInt11, float[] paramArrayOfFloat5, int paramInt12, int paramInt13, float[] paramArrayOfFloat6, int paramInt14, int paramInt15, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, int[] paramArrayOfInt, int paramInt16, intW paramintW1, intW paramintW2)
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
    float f = 0.0F;
    floatW localfloatW = new floatW(0.0F);
    int[] arrayOfInt1 = new int[8];
    int[] arrayOfInt2 = new int[8];
    float[] arrayOfFloat1 = new float[8];
    float[] arrayOfFloat2 = new float[8 * 8];
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
      Xerbla.xerbla("STGSY2", -paramintW2.val);
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
      if ((paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt5 + paramInt4)] == 0.0F ? 0 : 1) != 0) {
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
      if ((paramArrayOfFloat2[(i1 + 1 - 1 + (i1 - 1) * paramInt7 + paramInt6)] == 0.0F ? 0 : 1) != 0) {
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
      paramfloatW1.val = 1.0F;
      localfloatW.val = 1.0F;
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
            arrayOfFloat2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
            arrayOfFloat2[(2 - 1 + (1 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
            arrayOfFloat2[(1 - 1 + (2 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
            arrayOfFloat2[(2 - 1 + (2 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
            arrayOfFloat1[(1 - 1)] = paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
            arrayOfFloat1[(2 - 1)] = paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
            Sgetc2.sgetc2(i11, arrayOfFloat2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
            if ((localintW.val <= 0 ? 0 : 1) != 0) {
              paramintW2.val = localintW.val;
            }
            if ((paramInt1 != 0 ? 0 : 1) != 0)
            {
              Sgesc2.sgesc2(i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localfloatW);
              if ((localfloatW.val == 1.0F ? 0 : 1) != 0)
              {
                i6 = 1;
                for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                {
                  Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                  Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                  i6 += 1;
                }
                paramfloatW1.val *= localfloatW.val;
              }
            }
            else
            {
              Slatdf.slatdf(paramInt1, i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, paramfloatW2, paramfloatW3, arrayOfInt1, 0, arrayOfInt2, 0);
            }
            paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfFloat1[(1 - 1)];
            paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfFloat1[(2 - 1)];
            if ((i <= 1 ? 0 : 1) != 0)
            {
              f = -arrayOfFloat1[(1 - 1)];
              Saxpy.saxpy(m - 1, f, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat3, 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
              Saxpy.saxpy(m - 1, f, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt11 + paramInt10, 1, paramArrayOfFloat6, 1 - 1 + (i4 - 1) * paramInt15 + paramInt14, 1);
            }
            if ((i1 >= i10 ? 0 : 1) != 0)
            {
              Saxpy.saxpy(paramInt3 - i2, arrayOfFloat1[(2 - 1)], paramArrayOfFloat2, i4 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3, m - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
              Saxpy.saxpy(paramInt3 - i2, arrayOfFloat1[(2 - 1)], paramArrayOfFloat5, i4 - 1 + (i2 + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, m - 1 + (i2 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
            }
          }
          else
          {
            if ((i7 != 1 ? 0 : 1) != 0) {}
            if (((i8 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              arrayOfFloat2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
              arrayOfFloat2[(2 - 1 + (1 - 1) * 8)] = 0.0F;
              arrayOfFloat2[(3 - 1 + (1 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
              arrayOfFloat2[(4 - 1 + (1 - 1) * 8)] = 0.0F;
              arrayOfFloat2[(1 - 1 + (2 - 1) * 8)] = 0.0F;
              arrayOfFloat2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
              arrayOfFloat2[(3 - 1 + (2 - 1) * 8)] = 0.0F;
              arrayOfFloat2[(4 - 1 + (2 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
              arrayOfFloat2[(1 - 1 + (3 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
              arrayOfFloat2[(2 - 1 + (3 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
              arrayOfFloat2[(3 - 1 + (3 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
              arrayOfFloat2[(4 - 1 + (3 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
              arrayOfFloat2[(1 - 1 + (4 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
              arrayOfFloat2[(2 - 1 + (4 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
              arrayOfFloat2[(3 - 1 + (4 - 1) * 8)] = 0.0F;
              arrayOfFloat2[(4 - 1 + (4 - 1) * 8)] = (-paramArrayOfFloat5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
              arrayOfFloat1[(1 - 1)] = paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
              arrayOfFloat1[(2 - 1)] = paramArrayOfFloat3[(m - 1 + (i5 - 1) * paramInt9 + paramInt8)];
              arrayOfFloat1[(3 - 1)] = paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
              arrayOfFloat1[(4 - 1)] = paramArrayOfFloat6[(m - 1 + (i5 - 1) * paramInt15 + paramInt14)];
              Sgetc2.sgetc2(i11, arrayOfFloat2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
              if ((localintW.val <= 0 ? 0 : 1) != 0) {
                paramintW2.val = localintW.val;
              }
              if ((paramInt1 != 0 ? 0 : 1) != 0)
              {
                Sgesc2.sgesc2(i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localfloatW);
                if ((localfloatW.val == 1.0F ? 0 : 1) != 0)
                {
                  i6 = 1;
                  for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                  {
                    Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                    Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                    i6 += 1;
                  }
                  paramfloatW1.val *= localfloatW.val;
                }
              }
              else
              {
                Slatdf.slatdf(paramInt1, i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, paramfloatW2, paramfloatW3, arrayOfInt1, 0, arrayOfInt2, 0);
              }
              paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfFloat1[(1 - 1)];
              paramArrayOfFloat3[(m - 1 + (i5 - 1) * paramInt9 + paramInt8)] = arrayOfFloat1[(2 - 1)];
              paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfFloat1[(3 - 1)];
              paramArrayOfFloat6[(m - 1 + (i5 - 1) * paramInt15 + paramInt14)] = arrayOfFloat1[(4 - 1)];
              if ((i <= 1 ? 0 : 1) != 0)
              {
                Sger.sger(m - 1, i8, -1.0F, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, 1, arrayOfFloat1, 1 - 1, 1, paramArrayOfFloat3, 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
                Sger.sger(m - 1, i8, -1.0F, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt11 + paramInt10, 1, arrayOfFloat1, 1 - 1, 1, paramArrayOfFloat6, 1 - 1 + (i4 - 1) * paramInt15 + paramInt14, paramInt15);
              }
              if ((i1 >= i10 ? 0 : 1) != 0)
              {
                Saxpy.saxpy(paramInt3 - i2, arrayOfFloat1[(3 - 1)], paramArrayOfFloat2, i4 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3, m - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
                Saxpy.saxpy(paramInt3 - i2, arrayOfFloat1[(3 - 1)], paramArrayOfFloat5, i4 - 1 + (i2 + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, m - 1 + (i2 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
                Saxpy.saxpy(paramInt3 - i2, arrayOfFloat1[(4 - 1)], paramArrayOfFloat2, i5 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3, m - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
                Saxpy.saxpy(paramInt3 - i2, arrayOfFloat1[(4 - 1)], paramArrayOfFloat5, i5 - 1 + (i2 + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, m - 1 + (i2 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
              }
            }
            else
            {
              if ((i7 != 2 ? 0 : 1) != 0) {}
              if (((i8 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                arrayOfFloat2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                arrayOfFloat2[(2 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                arrayOfFloat2[(3 - 1 + (1 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                arrayOfFloat2[(4 - 1 + (1 - 1) * 8)] = 0.0F;
                arrayOfFloat2[(1 - 1 + (2 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                arrayOfFloat2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                arrayOfFloat2[(3 - 1 + (2 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                arrayOfFloat2[(4 - 1 + (2 - 1) * 8)] = paramArrayOfFloat4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                arrayOfFloat2[(1 - 1 + (3 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                arrayOfFloat2[(2 - 1 + (3 - 1) * 8)] = 0.0F;
                arrayOfFloat2[(3 - 1 + (3 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                arrayOfFloat2[(4 - 1 + (3 - 1) * 8)] = 0.0F;
                arrayOfFloat2[(1 - 1 + (4 - 1) * 8)] = 0.0F;
                arrayOfFloat2[(2 - 1 + (4 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                arrayOfFloat2[(3 - 1 + (4 - 1) * 8)] = 0.0F;
                arrayOfFloat2[(4 - 1 + (4 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                arrayOfFloat1[(1 - 1)] = paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
                arrayOfFloat1[(2 - 1)] = paramArrayOfFloat3[(n - 1 + (i4 - 1) * paramInt9 + paramInt8)];
                arrayOfFloat1[(3 - 1)] = paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
                arrayOfFloat1[(4 - 1)] = paramArrayOfFloat6[(n - 1 + (i4 - 1) * paramInt15 + paramInt14)];
                Sgetc2.sgetc2(i11, arrayOfFloat2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
                if ((localintW.val <= 0 ? 0 : 1) != 0) {
                  paramintW2.val = localintW.val;
                }
                if ((paramInt1 != 0 ? 0 : 1) != 0)
                {
                  Sgesc2.sgesc2(i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localfloatW);
                  if ((localfloatW.val == 1.0F ? 0 : 1) != 0)
                  {
                    i6 = 1;
                    for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                    {
                      Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                      Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                      i6 += 1;
                    }
                    paramfloatW1.val *= localfloatW.val;
                  }
                }
                else
                {
                  Slatdf.slatdf(paramInt1, i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, paramfloatW2, paramfloatW3, arrayOfInt1, 0, arrayOfInt2, 0);
                }
                paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfFloat1[(1 - 1)];
                paramArrayOfFloat3[(n - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfFloat1[(2 - 1)];
                paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfFloat1[(3 - 1)];
                paramArrayOfFloat6[(n - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfFloat1[(4 - 1)];
                if ((i <= 1 ? 0 : 1) != 0)
                {
                  Sgemv.sgemv("N", m - 1, i7, -1.0F, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat1, 1 - 1, 1, 1.0F, paramArrayOfFloat3, 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
                  Sgemv.sgemv("N", m - 1, i7, -1.0F, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt11 + paramInt10, paramInt11, arrayOfFloat1, 1 - 1, 1, 1.0F, paramArrayOfFloat6, 1 - 1 + (i4 - 1) * paramInt15 + paramInt14, 1);
                }
                if ((i1 >= i10 ? 0 : 1) != 0)
                {
                  Sger.sger(i7, paramInt3 - i2, 1.0F, arrayOfFloat1, 3 - 1, 1, paramArrayOfFloat2, i4 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfFloat3, m - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
                  Sger.sger(i7, paramInt3 - i2, 1.0F, arrayOfFloat1, 3 - 1, 1, paramArrayOfFloat5, i4 - 1 + (i2 + 1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfFloat6, m - 1 + (i2 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
                }
              }
              else
              {
                if ((i7 != 2 ? 0 : 1) != 0) {}
                if (((i8 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  Slaset.slaset("F", 8, 8, 0.0F, 0.0F, arrayOfFloat2, 0, 8);
                  arrayOfFloat2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(2 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(5 - 1 + (1 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(1 - 1 + (2 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(5 - 1 + (2 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(6 - 1 + (2 - 1) * 8)] = paramArrayOfFloat4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(3 - 1 + (3 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(4 - 1 + (3 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(7 - 1 + (3 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(3 - 1 + (4 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(4 - 1 + (4 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(7 - 1 + (4 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(8 - 1 + (4 - 1) * 8)] = paramArrayOfFloat4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(1 - 1 + (5 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(3 - 1 + (5 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(5 - 1 + (5 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                  arrayOfFloat2[(7 - 1 + (5 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfFloat2[(2 - 1 + (6 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(4 - 1 + (6 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(6 - 1 + (6 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                  arrayOfFloat2[(8 - 1 + (6 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfFloat2[(1 - 1 + (7 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(3 - 1 + (7 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(7 - 1 + (7 - 1) * 8)] = (-paramArrayOfFloat5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfFloat2[(2 - 1 + (8 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(4 - 1 + (8 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(8 - 1 + (8 - 1) * 8)] = (-paramArrayOfFloat5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  i6 = 1;
                  k = i7 * i8 + 1;
                  i3 = 0;
                  for (i14 = i8 - 1 - 0 + 1; i14 > 0; i14--)
                  {
                    Scopy.scopy(i7, paramArrayOfFloat3, m - 1 + (i4 + i3 - 1) * paramInt9 + paramInt8, 1, arrayOfFloat1, i6 - 1, 1);
                    Scopy.scopy(i7, paramArrayOfFloat6, m - 1 + (i4 + i3 - 1) * paramInt15 + paramInt14, 1, arrayOfFloat1, k - 1, 1);
                    i6 += i7;
                    k += i7;
                    i3 += 1;
                  }
                  Sgetc2.sgetc2(i11, arrayOfFloat2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
                  if ((localintW.val <= 0 ? 0 : 1) != 0) {
                    paramintW2.val = localintW.val;
                  }
                  if ((paramInt1 != 0 ? 0 : 1) != 0)
                  {
                    Sgesc2.sgesc2(i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localfloatW);
                    if ((localfloatW.val == 1.0F ? 0 : 1) != 0)
                    {
                      i6 = 1;
                      for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                      {
                        Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                        Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                        i6 += 1;
                      }
                      paramfloatW1.val *= localfloatW.val;
                    }
                  }
                  else
                  {
                    Slatdf.slatdf(paramInt1, i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, paramfloatW2, paramfloatW3, arrayOfInt1, 0, arrayOfInt2, 0);
                  }
                  i6 = 1;
                  k = i7 * i8 + 1;
                  i3 = 0;
                  for (i14 = i8 - 1 - 0 + 1; i14 > 0; i14--)
                  {
                    Scopy.scopy(i7, arrayOfFloat1, i6 - 1, 1, paramArrayOfFloat3, m - 1 + (i4 + i3 - 1) * paramInt9 + paramInt8, 1);
                    Scopy.scopy(i7, arrayOfFloat1, k - 1, 1, paramArrayOfFloat6, m - 1 + (i4 + i3 - 1) * paramInt15 + paramInt14, 1);
                    i6 += i7;
                    k += i7;
                    i3 += 1;
                  }
                  if ((i <= 1 ? 0 : 1) != 0)
                  {
                    Sgemm.sgemm("N", "N", m - 1, i8, i7, -1.0F, paramArrayOfFloat1, 1 - 1 + (m - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat1, 1 - 1, i7, 1.0F, paramArrayOfFloat3, 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
                    Sgemm.sgemm("N", "N", m - 1, i8, i7, -1.0F, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt11 + paramInt10, paramInt11, arrayOfFloat1, 1 - 1, i7, 1.0F, paramArrayOfFloat6, 1 - 1 + (i4 - 1) * paramInt15 + paramInt14, paramInt15);
                  }
                  if ((i1 >= i10 ? 0 : 1) != 0)
                  {
                    i6 = i7 * i8 + 1;
                    Sgemm.sgemm("N", "N", i7, paramInt3 - i2, i8, 1.0F, arrayOfFloat1, i6 - 1, i7, paramArrayOfFloat2, i4 - 1 + (i2 + 1 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat3, m - 1 + (i2 + 1 - 1) * paramInt9 + paramInt8, paramInt9);
                    Sgemm.sgemm("N", "N", i7, paramInt3 - i2, i8, 1.0F, arrayOfFloat1, i6 - 1, i7, paramArrayOfFloat5, i4 - 1 + (i2 + 1 - 1) * paramInt13 + paramInt12, paramInt13, 1.0F, paramArrayOfFloat6, m - 1 + (i2 + 1 - 1) * paramInt15 + paramInt14, paramInt15);
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
      paramfloatW1.val = 1.0F;
      localfloatW.val = 1.0F;
      i = 1;
      for (i12 = i9 - 1 + 1; i12 > 0; i12--)
      {
        m = paramArrayOfInt[(i - 1 + paramInt16)];
        n = m + 1;
        j = paramArrayOfInt[(i + 1 - 1 + paramInt16)] - 1;
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
            arrayOfFloat2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
            arrayOfFloat2[(2 - 1 + (1 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
            arrayOfFloat2[(1 - 1 + (2 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
            arrayOfFloat2[(2 - 1 + (2 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
            arrayOfFloat1[(1 - 1)] = paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
            arrayOfFloat1[(2 - 1)] = paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
            Sgetc2.sgetc2(i11, arrayOfFloat2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
            if ((localintW.val <= 0 ? 0 : 1) != 0) {
              paramintW2.val = localintW.val;
            }
            Sgesc2.sgesc2(i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localfloatW);
            if ((localfloatW.val == 1.0F ? 0 : 1) != 0)
            {
              i6 = 1;
              for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
              {
                Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                i6 += 1;
              }
              paramfloatW1.val *= localfloatW.val;
            }
            paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfFloat1[(1 - 1)];
            paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfFloat1[(2 - 1)];
            if ((i1 <= i9 + 2 ? 0 : 1) != 0)
            {
              f = arrayOfFloat1[(1 - 1)];
              Saxpy.saxpy(i4 - 1, f, paramArrayOfFloat2, 1 - 1 + (i4 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
              f = arrayOfFloat1[(2 - 1)];
              Saxpy.saxpy(i4 - 1, f, paramArrayOfFloat5, 1 - 1 + (i4 - 1) * paramInt13 + paramInt12, 1, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
            }
            if ((i >= i9 ? 0 : 1) != 0)
            {
              f = -arrayOfFloat1[(1 - 1)];
              Saxpy.saxpy(paramInt2 - j, f, paramArrayOfFloat1, m - 1 + (j + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
              f = -arrayOfFloat1[(2 - 1)];
              Saxpy.saxpy(paramInt2 - j, f, paramArrayOfFloat4, m - 1 + (j + 1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
            }
          }
          else
          {
            if ((i7 != 1 ? 0 : 1) != 0) {}
            if (((i8 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
            {
              arrayOfFloat2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
              arrayOfFloat2[(2 - 1 + (1 - 1) * 8)] = 0.0F;
              arrayOfFloat2[(3 - 1 + (1 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
              arrayOfFloat2[(4 - 1 + (1 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
              arrayOfFloat2[(1 - 1 + (2 - 1) * 8)] = 0.0F;
              arrayOfFloat2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
              arrayOfFloat2[(3 - 1 + (2 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
              arrayOfFloat2[(4 - 1 + (2 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
              arrayOfFloat2[(1 - 1 + (3 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
              arrayOfFloat2[(2 - 1 + (3 - 1) * 8)] = 0.0F;
              arrayOfFloat2[(3 - 1 + (3 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
              arrayOfFloat2[(4 - 1 + (3 - 1) * 8)] = 0.0F;
              arrayOfFloat2[(1 - 1 + (4 - 1) * 8)] = 0.0F;
              arrayOfFloat2[(2 - 1 + (4 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
              arrayOfFloat2[(3 - 1 + (4 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
              arrayOfFloat2[(4 - 1 + (4 - 1) * 8)] = (-paramArrayOfFloat5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
              arrayOfFloat1[(1 - 1)] = paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
              arrayOfFloat1[(2 - 1)] = paramArrayOfFloat3[(m - 1 + (i5 - 1) * paramInt9 + paramInt8)];
              arrayOfFloat1[(3 - 1)] = paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
              arrayOfFloat1[(4 - 1)] = paramArrayOfFloat6[(m - 1 + (i5 - 1) * paramInt15 + paramInt14)];
              Sgetc2.sgetc2(i11, arrayOfFloat2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
              if ((localintW.val <= 0 ? 0 : 1) != 0) {
                paramintW2.val = localintW.val;
              }
              Sgesc2.sgesc2(i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localfloatW);
              if ((localfloatW.val == 1.0F ? 0 : 1) != 0)
              {
                i6 = 1;
                for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                {
                  Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                  Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                  i6 += 1;
                }
                paramfloatW1.val *= localfloatW.val;
              }
              paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfFloat1[(1 - 1)];
              paramArrayOfFloat3[(m - 1 + (i5 - 1) * paramInt9 + paramInt8)] = arrayOfFloat1[(2 - 1)];
              paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfFloat1[(3 - 1)];
              paramArrayOfFloat6[(m - 1 + (i5 - 1) * paramInt15 + paramInt14)] = arrayOfFloat1[(4 - 1)];
              if ((i1 <= i9 + 2 ? 0 : 1) != 0)
              {
                Saxpy.saxpy(i4 - 1, arrayOfFloat1[(1 - 1)], paramArrayOfFloat2, 1 - 1 + (i4 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                Saxpy.saxpy(i4 - 1, arrayOfFloat1[(2 - 1)], paramArrayOfFloat2, 1 - 1 + (i5 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                Saxpy.saxpy(i4 - 1, arrayOfFloat1[(3 - 1)], paramArrayOfFloat5, 1 - 1 + (i4 - 1) * paramInt13 + paramInt12, 1, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                Saxpy.saxpy(i4 - 1, arrayOfFloat1[(4 - 1)], paramArrayOfFloat5, 1 - 1 + (i5 - 1) * paramInt13 + paramInt12, 1, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
              }
              if ((i >= i9 ? 0 : 1) != 0)
              {
                Sger.sger(paramInt2 - j, i8, -1.0F, paramArrayOfFloat1, m - 1 + (j + 1 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat1, 1 - 1, 1, paramArrayOfFloat3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
                Sger.sger(paramInt2 - j, i8, -1.0F, paramArrayOfFloat4, m - 1 + (j + 1 - 1) * paramInt11 + paramInt10, paramInt11, arrayOfFloat1, 3 - 1, 1, paramArrayOfFloat3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
              }
            }
            else
            {
              if ((i7 != 2 ? 0 : 1) != 0) {}
              if (((i8 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
              {
                arrayOfFloat2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                arrayOfFloat2[(2 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                arrayOfFloat2[(3 - 1 + (1 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                arrayOfFloat2[(4 - 1 + (1 - 1) * 8)] = 0.0F;
                arrayOfFloat2[(1 - 1 + (2 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                arrayOfFloat2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                arrayOfFloat2[(3 - 1 + (2 - 1) * 8)] = 0.0F;
                arrayOfFloat2[(4 - 1 + (2 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                arrayOfFloat2[(1 - 1 + (3 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                arrayOfFloat2[(2 - 1 + (3 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                arrayOfFloat2[(3 - 1 + (3 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                arrayOfFloat2[(4 - 1 + (3 - 1) * 8)] = 0.0F;
                arrayOfFloat2[(1 - 1 + (4 - 1) * 8)] = 0.0F;
                arrayOfFloat2[(2 - 1 + (4 - 1) * 8)] = paramArrayOfFloat4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                arrayOfFloat2[(3 - 1 + (4 - 1) * 8)] = 0.0F;
                arrayOfFloat2[(4 - 1 + (4 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                arrayOfFloat1[(1 - 1)] = paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)];
                arrayOfFloat1[(2 - 1)] = paramArrayOfFloat3[(n - 1 + (i4 - 1) * paramInt9 + paramInt8)];
                arrayOfFloat1[(3 - 1)] = paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)];
                arrayOfFloat1[(4 - 1)] = paramArrayOfFloat6[(n - 1 + (i4 - 1) * paramInt15 + paramInt14)];
                Sgetc2.sgetc2(i11, arrayOfFloat2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
                if ((localintW.val <= 0 ? 0 : 1) != 0) {
                  paramintW2.val = localintW.val;
                }
                Sgesc2.sgesc2(i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localfloatW);
                if ((localfloatW.val == 1.0F ? 0 : 1) != 0)
                {
                  i6 = 1;
                  for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                  {
                    Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                    Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                    i6 += 1;
                  }
                  paramfloatW1.val *= localfloatW.val;
                }
                paramArrayOfFloat3[(m - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfFloat1[(1 - 1)];
                paramArrayOfFloat3[(n - 1 + (i4 - 1) * paramInt9 + paramInt8)] = arrayOfFloat1[(2 - 1)];
                paramArrayOfFloat6[(m - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfFloat1[(3 - 1)];
                paramArrayOfFloat6[(n - 1 + (i4 - 1) * paramInt15 + paramInt14)] = arrayOfFloat1[(4 - 1)];
                if ((i1 <= i9 + 2 ? 0 : 1) != 0)
                {
                  Sger.sger(i7, i4 - 1, 1.0F, arrayOfFloat1, 1 - 1, 1, paramArrayOfFloat2, 1 - 1 + (i4 - 1) * paramInt7 + paramInt6, 1, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                  Sger.sger(i7, i4 - 1, 1.0F, arrayOfFloat1, 3 - 1, 1, paramArrayOfFloat5, 1 - 1 + (i4 - 1) * paramInt13 + paramInt12, 1, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                }
                if ((i >= i9 ? 0 : 1) != 0)
                {
                  Sgemv.sgemv("T", i7, paramInt2 - j, -1.0F, paramArrayOfFloat1, m - 1 + (j + 1 - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat1, 1 - 1, 1, 1.0F, paramArrayOfFloat3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
                  Sgemv.sgemv("T", i7, paramInt2 - j, -1.0F, paramArrayOfFloat4, m - 1 + (j + 1 - 1) * paramInt11 + paramInt10, paramInt11, arrayOfFloat1, 3 - 1, 1, 1.0F, paramArrayOfFloat3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, 1);
                }
              }
              else
              {
                if ((i7 != 2 ? 0 : 1) != 0) {}
                if (((i8 != 2 ? 0 : 1) != 0 ? 1 : 0) != 0)
                {
                  Slaset.slaset("F", 8, 8, 0.0F, 0.0F, arrayOfFloat2, 0, 8);
                  arrayOfFloat2[(1 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(2 - 1 + (1 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(5 - 1 + (1 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(7 - 1 + (1 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(1 - 1 + (2 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(2 - 1 + (2 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(6 - 1 + (2 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(8 - 1 + (2 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i4 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(3 - 1 + (3 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(4 - 1 + (3 - 1) * 8)] = paramArrayOfFloat1[(m - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(5 - 1 + (3 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(7 - 1 + (3 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(3 - 1 + (4 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (m - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(4 - 1 + (4 - 1) * 8)] = paramArrayOfFloat1[(n - 1 + (n - 1) * paramInt5 + paramInt4)];
                  arrayOfFloat2[(6 - 1 + (4 - 1) * 8)] = (-paramArrayOfFloat2[(i4 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(8 - 1 + (4 - 1) * 8)] = (-paramArrayOfFloat2[(i5 - 1 + (i5 - 1) * paramInt7 + paramInt6)]);
                  arrayOfFloat2[(1 - 1 + (5 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(2 - 1 + (5 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(5 - 1 + (5 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                  arrayOfFloat2[(2 - 1 + (6 - 1) * 8)] = paramArrayOfFloat4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(6 - 1 + (6 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i4 - 1) * paramInt13 + paramInt12)]);
                  arrayOfFloat2[(3 - 1 + (7 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (m - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(4 - 1 + (7 - 1) * 8)] = paramArrayOfFloat4[(m - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(5 - 1 + (7 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfFloat2[(7 - 1 + (7 - 1) * 8)] = (-paramArrayOfFloat5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfFloat2[(4 - 1 + (8 - 1) * 8)] = paramArrayOfFloat4[(n - 1 + (n - 1) * paramInt11 + paramInt10)];
                  arrayOfFloat2[(6 - 1 + (8 - 1) * 8)] = (-paramArrayOfFloat5[(i4 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  arrayOfFloat2[(8 - 1 + (8 - 1) * 8)] = (-paramArrayOfFloat5[(i5 - 1 + (i5 - 1) * paramInt13 + paramInt12)]);
                  i6 = 1;
                  k = i7 * i8 + 1;
                  i3 = 0;
                  for (i14 = i8 - 1 - 0 + 1; i14 > 0; i14--)
                  {
                    Scopy.scopy(i7, paramArrayOfFloat3, m - 1 + (i4 + i3 - 1) * paramInt9 + paramInt8, 1, arrayOfFloat1, i6 - 1, 1);
                    Scopy.scopy(i7, paramArrayOfFloat6, m - 1 + (i4 + i3 - 1) * paramInt15 + paramInt14, 1, arrayOfFloat1, k - 1, 1);
                    i6 += i7;
                    k += i7;
                    i3 += 1;
                  }
                  Sgetc2.sgetc2(i11, arrayOfFloat2, 0, 8, arrayOfInt1, 0, arrayOfInt2, 0, localintW);
                  if ((localintW.val <= 0 ? 0 : 1) != 0) {
                    paramintW2.val = localintW.val;
                  }
                  Sgesc2.sgesc2(i11, arrayOfFloat2, 0, 8, arrayOfFloat1, 0, arrayOfInt1, 0, arrayOfInt2, 0, localfloatW);
                  if ((localfloatW.val == 1.0F ? 0 : 1) != 0)
                  {
                    i6 = 1;
                    for (i14 = paramInt3 - 1 + 1; i14 > 0; i14--)
                    {
                      Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat3, 1 - 1 + (i6 - 1) * paramInt9 + paramInt8, 1);
                      Sscal.sscal(paramInt2, localfloatW.val, paramArrayOfFloat6, 1 - 1 + (i6 - 1) * paramInt15 + paramInt14, 1);
                      i6 += 1;
                    }
                    paramfloatW1.val *= localfloatW.val;
                  }
                  i6 = 1;
                  k = i7 * i8 + 1;
                  i3 = 0;
                  for (i14 = i8 - 1 - 0 + 1; i14 > 0; i14--)
                  {
                    Scopy.scopy(i7, arrayOfFloat1, i6 - 1, 1, paramArrayOfFloat3, m - 1 + (i4 + i3 - 1) * paramInt9 + paramInt8, 1);
                    Scopy.scopy(i7, arrayOfFloat1, k - 1, 1, paramArrayOfFloat6, m - 1 + (i4 + i3 - 1) * paramInt15 + paramInt14, 1);
                    i6 += i7;
                    k += i7;
                    i3 += 1;
                  }
                  if ((i1 <= i9 + 2 ? 0 : 1) != 0)
                  {
                    Sgemm.sgemm("N", "T", i7, i4 - 1, i8, 1.0F, paramArrayOfFloat3, m - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfFloat2, 1 - 1 + (i4 - 1) * paramInt7 + paramInt6, paramInt7, 1.0F, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                    Sgemm.sgemm("N", "T", i7, i4 - 1, i8, 1.0F, paramArrayOfFloat6, m - 1 + (i4 - 1) * paramInt15 + paramInt14, paramInt15, paramArrayOfFloat5, 1 - 1 + (i4 - 1) * paramInt13 + paramInt12, paramInt13, 1.0F, paramArrayOfFloat6, m - 1 + (1 - 1) * paramInt15 + paramInt14, paramInt15);
                  }
                  if ((i >= i9 ? 0 : 1) != 0)
                  {
                    Sgemm.sgemm("T", "N", paramInt2 - j, i8, i7, -1.0F, paramArrayOfFloat1, m - 1 + (j + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat3, m - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9, 1.0F, paramArrayOfFloat3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
                    Sgemm.sgemm("T", "N", paramInt2 - j, i8, i7, -1.0F, paramArrayOfFloat4, m - 1 + (j + 1 - 1) * paramInt11 + paramInt10, paramInt11, paramArrayOfFloat6, m - 1 + (i4 - 1) * paramInt15 + paramInt14, paramInt15, 1.0F, paramArrayOfFloat3, j + 1 - 1 + (i4 - 1) * paramInt9 + paramInt8, paramInt9);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Stgsy2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */