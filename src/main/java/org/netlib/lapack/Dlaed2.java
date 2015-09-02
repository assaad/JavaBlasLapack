package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Drot;
import org.netlib.blas.Dscal;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlaed2
{
  public static void dlaed2(intW paramintW1, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, int[] paramArrayOfInt1, int paramInt6, doubleW paramdoubleW, double[] paramArrayOfDouble3, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, double[] paramArrayOfDouble5, int paramInt9, double[] paramArrayOfDouble6, int paramInt10, int[] paramArrayOfInt2, int paramInt11, int[] paramArrayOfInt3, int paramInt12, int[] paramArrayOfInt4, int paramInt13, int[] paramArrayOfInt5, int paramInt14, intW paramintW2)
  {
    int[] arrayOfInt1 = new int[4];
    int[] arrayOfInt2 = new int[4];
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    paramintW2.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW2.val = -2;
    }
    else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW2.val = -6;
    }
    else
    {
      if ((Math.min(1, paramInt1 / 2) <= paramInt2 ? 0 : 1) == 0) {}
      if (((paramInt1 / 2 >= paramInt2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW2.val = -3;
      }
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLAED2", -paramintW2.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i6 = paramInt1 - paramInt2;
    i5 = paramInt2 + 1;
    if ((paramdoubleW.val >= 0.0D ? 0 : 1) != 0) {
      Dscal.dscal(i6, -1.0D, paramArrayOfDouble3, i5 - 1 + paramInt7, 1);
    }
    d4 = 1.0D / Math.sqrt(2.0D);
    Dscal.dscal(paramInt1, d4, paramArrayOfDouble3, paramInt7, 1);
    paramdoubleW.val = Math.abs(2.0D * paramdoubleW.val);
    j = i5;
    for (int i9 = paramInt1 - i5 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt1[(j - 1 + paramInt6)] += paramInt2;
      j += 1;
    }
    j = 1;
    for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
    {
      paramArrayOfDouble4[(j - 1 + paramInt8)] = paramArrayOfDouble1[(paramArrayOfInt1[(j - 1 + paramInt6)] - 1 + paramInt3)];
      j += 1;
    }
    Dlamrg.dlamrg(paramInt2, i6, paramArrayOfDouble4, paramInt8, 1, 1, paramArrayOfInt3, paramInt12);
    j = 1;
    for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
    {
      paramArrayOfInt2[(j - 1 + paramInt11)] = paramArrayOfInt1[(paramArrayOfInt3[(j - 1 + paramInt12)] - 1 + paramInt6)];
      j += 1;
    }
    k = Idamax.idamax(paramInt1, paramArrayOfDouble3, paramInt7, 1);
    i2 = Idamax.idamax(paramInt1, paramArrayOfDouble1, paramInt3, 1);
    d2 = Dlamch.dlamch("Epsilon");
    d6 = 8.0D * d2 * Math.max(Math.abs(paramArrayOfDouble1[(i2 - 1 + paramInt3)]), Math.abs(paramArrayOfDouble3[(k - 1 + paramInt7)]));
    if ((paramdoubleW.val * Math.abs(paramArrayOfDouble3[(k - 1 + paramInt7)]) > d6 ? 0 : 1) != 0)
    {
      paramintW1.val = 0;
      n = 1;
      i1 = 1;
      for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
      {
        j = paramArrayOfInt2[(i1 - 1 + paramInt11)];
        Dcopy.dcopy(paramInt1, paramArrayOfDouble2, 1 - 1 + (j - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble6, n - 1 + paramInt10, 1);
        paramArrayOfDouble4[(i1 - 1 + paramInt8)] = paramArrayOfDouble1[(j - 1 + paramInt3)];
        n += paramInt1;
        i1 += 1;
      }
      Dlacpy.dlacpy("A", paramInt1, paramInt1, paramArrayOfDouble6, paramInt10, paramInt1, paramArrayOfDouble2, paramInt4, paramInt5);
      Dcopy.dcopy(paramInt1, paramArrayOfDouble4, paramInt8, 1, paramArrayOfDouble1, paramInt3, 1);
    }
    else
    {
      j = 1;
      for (i9 = paramInt2 - 1 + 1; i9 > 0; i9--)
      {
        paramArrayOfInt5[(j - 1 + paramInt14)] = 1;
        j += 1;
      }
      j = i5;
      for (i9 = paramInt1 - i5 + 1; i9 > 0; i9--)
      {
        paramArrayOfInt5[(j - 1 + paramInt14)] = 3;
        j += 1;
      }
      paramintW1.val = 0;
      i4 = paramInt1 + 1;
      i1 = 1;
      for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
      {
        i7 = paramArrayOfInt2[(i1 - 1 + paramInt11)];
        if ((paramdoubleW.val * Math.abs(paramArrayOfDouble3[(i7 - 1 + paramInt7)]) > d6 ? 0 : 1) != 0)
        {
          i4 -= 1;
          paramArrayOfInt5[(i7 - 1 + paramInt14)] = 4;
          paramArrayOfInt4[(i4 - 1 + paramInt13)] = i7;
          if ((i1 != paramInt1 ? 0 : 1) != 0) {
            break label1574;
          }
        }
        else
        {
          i8 = i7;
          break;
        }
        i1 += 1;
      }
      for (;;)
      {
        i1 += 1;
        i7 = paramArrayOfInt2[(i1 - 1 + paramInt11)];
        if ((i1 <= paramInt1 ? 0 : 1) != 0) {
          break;
        }
        if ((paramdoubleW.val * Math.abs(paramArrayOfDouble3[(i7 - 1 + paramInt7)]) > d6 ? 0 : 1) != 0)
        {
          i4 -= 1;
          paramArrayOfInt5[(i7 - 1 + paramInt14)] = 4;
          paramArrayOfInt4[(i4 - 1 + paramInt13)] = i7;
        }
        else
        {
          d3 = paramArrayOfDouble3[(i8 - 1 + paramInt7)];
          d1 = paramArrayOfDouble3[(i7 - 1 + paramInt7)];
          d5 = Dlapy2.dlapy2(d1, d3);
          d4 = paramArrayOfDouble1[(i7 - 1 + paramInt3)] - paramArrayOfDouble1[(i8 - 1 + paramInt3)];
          d1 /= d5;
          d3 = -(d3 / d5);
          if ((Math.abs(d4 * d1 * d3) > d6 ? 0 : 1) != 0)
          {
            paramArrayOfDouble3[(i7 - 1 + paramInt7)] = d5;
            paramArrayOfDouble3[(i8 - 1 + paramInt7)] = 0.0D;
            if ((paramArrayOfInt5[(i7 - 1 + paramInt14)] == paramArrayOfInt5[(i8 - 1 + paramInt14)] ? 0 : 1) != 0) {
              paramArrayOfInt5[(i7 - 1 + paramInt14)] = 2;
            }
            paramArrayOfInt5[(i8 - 1 + paramInt14)] = 4;
            Drot.drot(paramInt1, paramArrayOfDouble2, 1 - 1 + (i8 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble2, 1 - 1 + (i7 - 1) * paramInt5 + paramInt4, 1, d1, d3);
            d4 = paramArrayOfDouble1[(i8 - 1 + paramInt3)] * Math.pow(d1, 2) + paramArrayOfDouble1[(i7 - 1 + paramInt3)] * Math.pow(d3, 2);
            paramArrayOfDouble1[(i7 - 1 + paramInt3)] = (paramArrayOfDouble1[(i8 - 1 + paramInt3)] * Math.pow(d3, 2) + paramArrayOfDouble1[(i7 - 1 + paramInt3)] * Math.pow(d1, 2));
            paramArrayOfDouble1[(i8 - 1 + paramInt3)] = d4;
            i4 -= 1;
            j = 1;
            while ((i4 + j > paramInt1 ? 0 : 1) != 0) {
              if ((paramArrayOfDouble1[(i8 - 1 + paramInt3)] >= paramArrayOfDouble1[(paramArrayOfInt4[(i4 + j - 1 + paramInt13)] - 1 + paramInt3)] ? 0 : 1) != 0)
              {
                paramArrayOfInt4[(i4 + j - 1 - 1 + paramInt13)] = paramArrayOfInt4[(i4 + j - 1 + paramInt13)];
                paramArrayOfInt4[(i4 + j - 1 + paramInt13)] = i8;
                j += 1;
              }
              else
              {
                paramArrayOfInt4[(i4 + j - 1 - 1 + paramInt13)] = i8;
                break label1493;
              }
            }
            paramArrayOfInt4[(i4 + j - 1 - 1 + paramInt13)] = i8;
            label1493:
            i8 = i7;
          }
          else
          {
            paramintW1.val += 1;
            paramArrayOfDouble4[(paramintW1.val - 1 + paramInt8)] = paramArrayOfDouble1[(i8 - 1 + paramInt3)];
            paramArrayOfDouble5[(paramintW1.val - 1 + paramInt9)] = paramArrayOfDouble3[(i8 - 1 + paramInt7)];
            paramArrayOfInt4[(paramintW1.val - 1 + paramInt13)] = i8;
            i8 = i7;
          }
        }
      }
      label1574:
      paramintW1.val += 1;
      paramArrayOfDouble4[(paramintW1.val - 1 + paramInt8)] = paramArrayOfDouble1[(i8 - 1 + paramInt3)];
      paramArrayOfDouble5[(paramintW1.val - 1 + paramInt9)] = paramArrayOfDouble3[(i8 - 1 + paramInt7)];
      paramArrayOfInt4[(paramintW1.val - 1 + paramInt13)] = i8;
      i1 = 1;
      for (i9 = 4 - 1 + 1; i9 > 0; i9--)
      {
        arrayOfInt1[(i1 - 1)] = 0;
        i1 += 1;
      }
      i1 = 1;
      for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
      {
        i = paramArrayOfInt5[(i1 - 1 + paramInt14)];
        arrayOfInt1[(i - 1)] += 1;
        i1 += 1;
      }
      arrayOfInt2[(1 - 1)] = 1;
      arrayOfInt2[(2 - 1)] = (1 + arrayOfInt1[(1 - 1)]);
      arrayOfInt2[(3 - 1)] = (arrayOfInt2[(2 - 1)] + arrayOfInt1[(2 - 1)]);
      arrayOfInt2[(4 - 1)] = (arrayOfInt2[(3 - 1)] + arrayOfInt1[(3 - 1)]);
      paramintW1.val = (paramInt1 - arrayOfInt1[(4 - 1)]);
      i1 = 1;
      for (i9 = paramInt1 - 1 + 1; i9 > 0; i9--)
      {
        i3 = paramArrayOfInt4[(i1 - 1 + paramInt13)];
        i = paramArrayOfInt5[(i3 - 1 + paramInt14)];
        paramArrayOfInt2[(arrayOfInt2[(i - 1)] - 1 + paramInt11)] = i3;
        paramArrayOfInt3[(arrayOfInt2[(i - 1)] - 1 + paramInt12)] = i1;
        arrayOfInt2[(i - 1)] += 1;
        i1 += 1;
      }
      j = 1;
      m = 1;
      n = 1 + (arrayOfInt1[(1 - 1)] + arrayOfInt1[(2 - 1)]) * paramInt2;
      i1 = 1;
      for (i9 = arrayOfInt1[(1 - 1)] - 1 + 1; i9 > 0; i9--)
      {
        i3 = paramArrayOfInt2[(j - 1 + paramInt11)];
        Dcopy.dcopy(paramInt2, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble6, m - 1 + paramInt10, 1);
        paramArrayOfDouble3[(j - 1 + paramInt7)] = paramArrayOfDouble1[(i3 - 1 + paramInt3)];
        j += 1;
        m += paramInt2;
        i1 += 1;
      }
      i1 = 1;
      for (i9 = arrayOfInt1[(2 - 1)] - 1 + 1; i9 > 0; i9--)
      {
        i3 = paramArrayOfInt2[(j - 1 + paramInt11)];
        Dcopy.dcopy(paramInt2, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble6, m - 1 + paramInt10, 1);
        Dcopy.dcopy(i6, paramArrayOfDouble2, paramInt2 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble6, n - 1 + paramInt10, 1);
        paramArrayOfDouble3[(j - 1 + paramInt7)] = paramArrayOfDouble1[(i3 - 1 + paramInt3)];
        j += 1;
        m += paramInt2;
        n += i6;
        i1 += 1;
      }
      i1 = 1;
      for (i9 = arrayOfInt1[(3 - 1)] - 1 + 1; i9 > 0; i9--)
      {
        i3 = paramArrayOfInt2[(j - 1 + paramInt11)];
        Dcopy.dcopy(i6, paramArrayOfDouble2, paramInt2 + 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble6, n - 1 + paramInt10, 1);
        paramArrayOfDouble3[(j - 1 + paramInt7)] = paramArrayOfDouble1[(i3 - 1 + paramInt3)];
        j += 1;
        n += i6;
        i1 += 1;
      }
      m = n;
      i1 = 1;
      for (i9 = arrayOfInt1[(4 - 1)] - 1 + 1; i9 > 0; i9--)
      {
        i3 = paramArrayOfInt2[(j - 1 + paramInt11)];
        Dcopy.dcopy(paramInt1, paramArrayOfDouble2, 1 - 1 + (i3 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble6, n - 1 + paramInt10, 1);
        n += paramInt1;
        paramArrayOfDouble3[(j - 1 + paramInt7)] = paramArrayOfDouble1[(i3 - 1 + paramInt3)];
        j += 1;
        i1 += 1;
      }
      Dlacpy.dlacpy("A", paramInt1, arrayOfInt1[(4 - 1)], paramArrayOfDouble6, m - 1 + paramInt10, paramInt1, paramArrayOfDouble2, 1 - 1 + (paramintW1.val + 1 - 1) * paramInt5 + paramInt4, paramInt5);
      Dcopy.dcopy(paramInt1 - paramintW1.val, paramArrayOfDouble3, paramintW1.val + 1 - 1 + paramInt7, 1, paramArrayOfDouble1, paramintW1.val + 1 - 1 + paramInt3, 1);
      i1 = 1;
      for (i9 = 4 - 1 + 1; i9 > 0; i9--)
      {
        paramArrayOfInt5[(i1 - 1 + paramInt14)] = arrayOfInt1[(i1 - 1)];
        i1 += 1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaed2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */