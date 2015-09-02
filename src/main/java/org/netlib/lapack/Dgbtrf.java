package org.netlib.lapack;

import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemm;
import org.netlib.blas.Dger;
import org.netlib.blas.Dscal;
import org.netlib.blas.Dswap;
import org.netlib.blas.Dtrsm;
import org.netlib.blas.Idamax;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dgbtrf
{
  public static void dgbtrf(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble, int paramInt5, int paramInt6, int[] paramArrayOfInt, int paramInt7, intW paramintW)
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
    double d = 0.0D;
    double[] arrayOfDouble1 = new double[65 * 64];
    double[] arrayOfDouble2 = new double[65 * 64];
    i11 = paramInt4 + paramInt3;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt6 >= paramInt3 + i11 + 1 ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGBTRF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    i12 = Ilaenv.ilaenv(1, "DGBTRF", " ", paramInt1, paramInt2, paramInt3, paramInt4);
    i12 = Math.min(i12, 64);
    if ((i12 > 1 ? 0 : 1) == 0) {}
    if (((i12 <= paramInt3 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Dgbtf2.dgbtf2(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfDouble, paramInt5, paramInt6, paramArrayOfInt, paramInt7, paramintW);
    }
    else
    {
      i1 = 1;
      int i15;
      for (int i14 = i12 - 1 + 1; i14 > 0; i14--)
      {
        i = 1;
        for (i15 = i1 - 1 - 1 + 1; i15 > 0; i15--)
        {
          arrayOfDouble1[(i - 1 + (i1 - 1) * 65)] = 0.0D;
          i += 1;
        }
        i1 += 1;
      }
      i1 = 1;
      for (i14 = i12 - 1 + 1; i14 > 0; i14--)
      {
        i = i1 + 1;
        for (i15 = i12 - (i1 + 1) + 1; i15 > 0; i15--)
        {
          arrayOfDouble2[(i - 1 + (i1 - 1) * 65)] = 0.0D;
          i += 1;
        }
        i1 += 1;
      }
      i1 = paramInt4 + 2;
      for (i14 = Math.min(i11, paramInt2) - (paramInt4 + 2) + 1; i14 > 0; i14--)
      {
        i = i11 - i1 + 2;
        for (i15 = paramInt3 - (i11 - i1 + 2) + 1; i15 > 0; i15--)
        {
          paramArrayOfDouble[(i - 1 + (i1 - 1) * paramInt6 + paramInt5)] = 0.0D;
          i += 1;
        }
        i1 += 1;
      }
      i8 = 1;
      i1 = 1;
      for (i14 = (Math.min(paramInt1, paramInt2) - 1 + i12) / i12; i14 > 0; i14--)
      {
        i4 = Math.min(i12, Math.min(paramInt1, paramInt2) - i1 + 1);
        j = Math.min(paramInt3 - i4, paramInt1 - i1 - i4 + 1);
        k = Math.min(i4, paramInt1 - i1 - paramInt3 + 1);
        i5 = i1;
        int i16;
        for (i15 = i1 + i4 - 1 - i1 + 1; i15 > 0; i15--)
        {
          if ((i5 + i11 > paramInt2 ? 0 : 1) != 0)
          {
            i = 1;
            for (i16 = paramInt3 - 1 + 1; i16 > 0; i16--)
            {
              paramArrayOfDouble[(i - 1 + (i5 + i11 - 1) * paramInt6 + paramInt5)] = 0.0D;
              i += 1;
            }
          }
          i10 = Math.min(paramInt3, paramInt1 - i5);
          i7 = Idamax.idamax(i10 + 1, paramArrayOfDouble, i11 + 1 - 1 + (i5 - 1) * paramInt6 + paramInt5, 1);
          paramArrayOfInt[(i5 - 1 + paramInt7)] = (i7 + i5 - i1);
          if ((paramArrayOfDouble[(i11 + i7 - 1 + (i5 - 1) * paramInt6 + paramInt5)] == 0.0D ? 0 : 1) != 0)
          {
            i8 = Math.max(i8, Math.min(i5 + paramInt4 + i7 - 1, paramInt2));
            if ((i7 == 1 ? 0 : 1) != 0) {
              if ((i7 + i5 - 1 >= i1 + paramInt3 ? 0 : 1) != 0)
              {
                Dswap.dswap(i4, paramArrayOfDouble, i11 + 1 + i5 - i1 - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6 - 1, paramArrayOfDouble, i11 + i7 + i5 - i1 - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6 - 1);
              }
              else
              {
                Dswap.dswap(i5 - i1, paramArrayOfDouble, i11 + 1 + i5 - i1 - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6 - 1, arrayOfDouble2, i7 + i5 - i1 - paramInt3 - 1 + (1 - 1) * 65, 65);
                Dswap.dswap(i1 + i4 - i5, paramArrayOfDouble, i11 + 1 - 1 + (i5 - 1) * paramInt6 + paramInt5, paramInt6 - 1, paramArrayOfDouble, i11 + i7 - 1 + (i5 - 1) * paramInt6 + paramInt5, paramInt6 - 1);
              }
            }
            Dscal.dscal(i10, 1.0D / paramArrayOfDouble[(i11 + 1 - 1 + (i5 - 1) * paramInt6 + paramInt5)], paramArrayOfDouble, i11 + 2 - 1 + (i5 - 1) * paramInt6 + paramInt5, 1);
            i6 = Math.min(i8, i1 + i4 - 1);
            if ((i6 <= i5 ? 0 : 1) != 0) {
              Dger.dger(i10, i6 - i5, -1.0D, paramArrayOfDouble, i11 + 2 - 1 + (i5 - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble, i11 - 1 + (i5 + 1 - 1) * paramInt6 + paramInt5, paramInt6 - 1, paramArrayOfDouble, i11 + 1 - 1 + (i5 + 1 - 1) * paramInt6 + paramInt5, paramInt6 - 1);
            }
          }
          else if ((paramintW.val != 0 ? 0 : 1) != 0)
          {
            paramintW.val = i5;
          }
          i13 = Math.min(i5 - i1 + 1, k);
          if ((i13 <= 0 ? 0 : 1) != 0) {
            Dcopy.dcopy(i13, paramArrayOfDouble, i11 + paramInt3 + 1 - i5 + i1 - 1 + (i5 - 1) * paramInt6 + paramInt5, 1, arrayOfDouble2, 1 - 1 + (i5 - i1 + 1 - 1) * 65, 1);
          }
          i5 += 1;
        }
        if ((i1 + i4 > paramInt2 ? 0 : 1) != 0)
        {
          i2 = Math.min(i8 - i1 + 1, i11) - i4;
          i3 = Math.max(0, i8 - i1 - i11 + 1);
          Dlaswp.dlaswp(i2, paramArrayOfDouble, i11 + 1 - i4 - 1 + (i1 + i4 - 1) * paramInt6 + paramInt5, paramInt6 - 1, 1, i4, paramArrayOfInt, i1 - 1 + paramInt7, 1);
          i = i1;
          for (i15 = i1 + i4 - 1 - i1 + 1; i15 > 0; i15--)
          {
            paramArrayOfInt[(i - 1 + paramInt7)] = (paramArrayOfInt[(i - 1 + paramInt7)] + i1 - 1);
            i += 1;
          }
          i9 = i1 - 1 + i4 + i2;
          i = 1;
          for (i15 = i3 - 1 + 1; i15 > 0; i15--)
          {
            i5 = i9 + i;
            m = i1 + i - 1;
            for (i16 = i1 + i4 - 1 - (i1 + i - 1) + 1; i16 > 0; i16--)
            {
              n = paramArrayOfInt[(m - 1 + paramInt7)];
              if ((n == m ? 0 : 1) != 0)
              {
                d = paramArrayOfDouble[(i11 + 1 + m - i5 - 1 + (i5 - 1) * paramInt6 + paramInt5)];
                paramArrayOfDouble[(i11 + 1 + m - i5 - 1 + (i5 - 1) * paramInt6 + paramInt5)] = paramArrayOfDouble[(i11 + 1 + n - i5 - 1 + (i5 - 1) * paramInt6 + paramInt5)];
                paramArrayOfDouble[(i11 + 1 + n - i5 - 1 + (i5 - 1) * paramInt6 + paramInt5)] = d;
              }
              m += 1;
            }
            i += 1;
          }
          if ((i2 <= 0 ? 0 : 1) != 0)
          {
            Dtrsm.dtrsm("Left", "Lower", "No transpose", "Unit", i4, i2, 1.0D, paramArrayOfDouble, i11 + 1 - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6 - 1, paramArrayOfDouble, i11 + 1 - i4 - 1 + (i1 + i4 - 1) * paramInt6 + paramInt5, paramInt6 - 1);
            if ((j <= 0 ? 0 : 1) != 0) {
              Dgemm.dgemm("No transpose", "No transpose", j, i2, i4, -1.0D, paramArrayOfDouble, i11 + 1 + i4 - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6 - 1, paramArrayOfDouble, i11 + 1 - i4 - 1 + (i1 + i4 - 1) * paramInt6 + paramInt5, paramInt6 - 1, 1.0D, paramArrayOfDouble, i11 + 1 - 1 + (i1 + i4 - 1) * paramInt6 + paramInt5, paramInt6 - 1);
            }
            if ((k <= 0 ? 0 : 1) != 0) {
              Dgemm.dgemm("No transpose", "No transpose", k, i2, i4, -1.0D, arrayOfDouble2, 0, 65, paramArrayOfDouble, i11 + 1 - i4 - 1 + (i1 + i4 - 1) * paramInt6 + paramInt5, paramInt6 - 1, 1.0D, paramArrayOfDouble, i11 + paramInt3 + 1 - i4 - 1 + (i1 + i4 - 1) * paramInt6 + paramInt5, paramInt6 - 1);
            }
          }
          if ((i3 <= 0 ? 0 : 1) != 0)
          {
            i5 = 1;
            for (i15 = i3 - 1 + 1; i15 > 0; i15--)
            {
              m = i5;
              for (i16 = i4 - i5 + 1; i16 > 0; i16--)
              {
                arrayOfDouble1[(m - 1 + (i5 - 1) * 65)] = paramArrayOfDouble[(m - i5 + 1 - 1 + (i5 + i1 + i11 - 1 - 1) * paramInt6 + paramInt5)];
                m += 1;
              }
              i5 += 1;
            }
            Dtrsm.dtrsm("Left", "Lower", "No transpose", "Unit", i4, i3, 1.0D, paramArrayOfDouble, i11 + 1 - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6 - 1, arrayOfDouble1, 0, 65);
            if ((j <= 0 ? 0 : 1) != 0) {
              Dgemm.dgemm("No transpose", "No transpose", j, i3, i4, -1.0D, paramArrayOfDouble, i11 + 1 + i4 - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6 - 1, arrayOfDouble1, 0, 65, 1.0D, paramArrayOfDouble, 1 + i4 - 1 + (i1 + i11 - 1) * paramInt6 + paramInt5, paramInt6 - 1);
            }
            if ((k <= 0 ? 0 : 1) != 0) {
              Dgemm.dgemm("No transpose", "No transpose", k, i3, i4, -1.0D, arrayOfDouble2, 0, 65, arrayOfDouble1, 0, 65, 1.0D, paramArrayOfDouble, 1 + paramInt3 - 1 + (i1 + i11 - 1) * paramInt6 + paramInt5, paramInt6 - 1);
            }
            i5 = 1;
            for (i15 = i3 - 1 + 1; i15 > 0; i15--)
            {
              m = i5;
              for (i16 = i4 - i5 + 1; i16 > 0; i16--)
              {
                paramArrayOfDouble[(m - i5 + 1 - 1 + (i5 + i1 + i11 - 1 - 1) * paramInt6 + paramInt5)] = arrayOfDouble1[(m - 1 + (i5 - 1) * 65)];
                m += 1;
              }
              i5 += 1;
            }
          }
        }
        else
        {
          i = i1;
          for (i15 = i1 + i4 - 1 - i1 + 1; i15 > 0; i15--)
          {
            paramArrayOfInt[(i - 1 + paramInt7)] = (paramArrayOfInt[(i - 1 + paramInt7)] + i1 - 1);
            i += 1;
          }
        }
        i5 = i1 + i4 - 1;
        for (i15 = (i1 - (i1 + i4 - 1) + -1) / -1; i15 > 0; i15--)
        {
          i7 = paramArrayOfInt[(i5 - 1 + paramInt7)] - i5 + 1;
          if ((i7 == 1 ? 0 : 1) != 0) {
            if ((i7 + i5 - 1 >= i1 + paramInt3 ? 0 : 1) != 0) {
              Dswap.dswap(i5 - i1, paramArrayOfDouble, i11 + 1 + i5 - i1 - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6 - 1, paramArrayOfDouble, i11 + i7 + i5 - i1 - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6 - 1);
            } else {
              Dswap.dswap(i5 - i1, paramArrayOfDouble, i11 + 1 + i5 - i1 - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6 - 1, arrayOfDouble2, i7 + i5 - i1 - paramInt3 - 1 + (1 - 1) * 65, 65);
            }
          }
          i13 = Math.min(k, i5 - i1 + 1);
          if ((i13 <= 0 ? 0 : 1) != 0) {
            Dcopy.dcopy(i13, arrayOfDouble2, 1 - 1 + (i5 - i1 + 1 - 1) * 65, 1, paramArrayOfDouble, i11 + paramInt3 + 1 - i5 + i1 - 1 + (i5 - 1) * paramInt6 + paramInt5, 1);
          }
          i5 += -1;
        }
        i1 += i12;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgbtrf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */