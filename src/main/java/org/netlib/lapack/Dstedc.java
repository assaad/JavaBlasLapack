package org.netlib.lapack;

import org.netlib.blas.Dgemm;
import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dstedc
{
  public static void dstedc(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int paramInt7, int[] paramArrayOfInt, int paramInt8, int paramInt9, intW paramintW)
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
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    paramintW.val = 0;
    if ((paramInt7 != -1 ? 0 : 1) == 0) {}
    i = (paramInt9 != -1 ? 0 : 1) == 0 ? 0 : 1;
    if (Lsame.lsame(paramString, "N")) {
      m = 0;
    } else if (Lsame.lsame(paramString, "V")) {
      m = 1;
    } else if (Lsame.lsame(paramString, "I")) {
      m = 2;
    } else {
      m = -1;
    }
    if ((m >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else
    {
      if ((paramInt5 >= 1 ? 0 : 1) == 0) {
        if ((m <= 0 ? 0 : 1) == 0) {}
      }
      if ((((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
        paramintW.val = -6;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i7 = Ilaenv.ilaenv(9, "DSTEDC", " ", 0, 0, 0, 0);
      if ((paramInt1 > 1 ? 0 : 1) == 0) {}
      if (((m != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i4 = 1;
        i5 = 1;
      }
      else if ((paramInt1 > i7 ? 0 : 1) != 0)
      {
        i4 = 1;
        i5 = 2 * (paramInt1 - 1);
      }
      else
      {
        i3 = (int)(Math.log(paramInt1) / Math.log(2.0D));
        if (((int)Math.pow(2, i3) >= paramInt1 ? 0 : 1) != 0) {
          i3 += 1;
        }
        if (((int)Math.pow(2, i3) >= paramInt1 ? 0 : 1) != 0) {
          i3 += 1;
        }
        if ((m != 1 ? 0 : 1) != 0)
        {
          i5 = 1 + 3 * paramInt1 + 2 * paramInt1 * i3 + 3 * (int)Math.pow(paramInt1, 2);
          i4 = 6 + 6 * paramInt1 + 5 * paramInt1 * i3;
        }
        else if ((m != 2 ? 0 : 1) != 0)
        {
          i5 = 1 + 4 * paramInt1 + (int)Math.pow(paramInt1, 2);
          i4 = 3 + 5 * paramInt1;
        }
      }
      paramArrayOfDouble4[(1 - 1 + paramInt6)] = i5;
      paramArrayOfInt[(1 - 1 + paramInt8)] = i4;
      if ((paramInt7 >= i5 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0)
      {
        paramintW.val = -8;
      }
      else
      {
        if ((paramInt9 >= i4 ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -10;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSTEDC", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((m == 0 ? 0 : 1) != 0) {
        paramArrayOfDouble3[(1 - 1 + (1 - 1) * paramInt5 + paramInt4)] = 1.0D;
      }
      return;
    }
    if ((m != 0 ? 0 : 1) != 0)
    {
      Dsterf.dsterf(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramintW);
    }
    else if ((paramInt1 > i7 ? 0 : 1) != 0)
    {
      Dsteqr.dsteqr(paramString, paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfDouble3, paramInt4, paramInt5, paramArrayOfDouble4, paramInt6, paramintW);
    }
    else
    {
      if ((m != 1 ? 0 : 1) != 0) {
        i9 = 1 + paramInt1 * paramInt1;
      } else {
        i9 = 1;
      }
      if ((m != 2 ? 0 : 1) != 0) {
        Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble3, paramInt4, paramInt5);
      }
      d2 = Dlanst.dlanst("M", paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3);
      if ((d2 != 0.0D ? 0 : 1) == 0)
      {
        d1 = Dlamch.dlamch("Epsilon");
        i8 = 1;
        while ((i8 > paramInt1 ? 0 : 1) != 0)
        {
          j = i8;
          while ((j >= paramInt1 ? 0 : 1) != 0)
          {
            d4 = d1 * Math.sqrt(Math.abs(paramArrayOfDouble1[(j - 1 + paramInt2)])) * Math.sqrt(Math.abs(paramArrayOfDouble1[(j + 1 - 1 + paramInt2)]));
            if ((Math.abs(paramArrayOfDouble2[(j - 1 + paramInt3)]) <= d4 ? 0 : 1) == 0) {
              break;
            }
            j += 1;
          }
          i6 = j - i8 + 1;
          if ((i6 != 1 ? 0 : 1) != 0)
          {
            i8 = j + 1;
          }
          else
          {
            if ((i6 <= i7 ? 0 : 1) != 0)
            {
              d2 = Dlanst.dlanst("M", i6, paramArrayOfDouble1, i8 - 1 + paramInt2, paramArrayOfDouble2, i8 - 1 + paramInt3);
              Dlascl.dlascl("G", 0, 0, d2, 1.0D, i6, 1, paramArrayOfDouble1, i8 - 1 + paramInt2, i6, paramintW);
              Dlascl.dlascl("G", 0, 0, d2, 1.0D, i6 - 1, 1, paramArrayOfDouble2, i8 - 1 + paramInt3, i6 - 1, paramintW);
              if ((m != 1 ? 0 : 1) != 0) {
                i10 = 1;
              } else {
                i10 = i8;
              }
              Dlaed0.dlaed0(m, paramInt1, i6, paramArrayOfDouble1, i8 - 1 + paramInt2, paramArrayOfDouble2, i8 - 1 + paramInt3, paramArrayOfDouble3, i10 - 1 + (i8 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, 1 - 1 + paramInt6, paramInt1, paramArrayOfDouble4, i9 - 1 + paramInt6, paramArrayOfInt, paramInt8, paramintW);
              if ((paramintW.val == 0 ? 0 : 1) != 0)
              {
                paramintW.val = ((paramintW.val / (i6 + 1) + i8 - 1) * (paramInt1 + 1) + paramintW.val % (i6 + 1) + i8 - 1);
                break label1821;
              }
              Dlascl.dlascl("G", 0, 0, 1.0D, d2, i6, 1, paramArrayOfDouble1, i8 - 1 + paramInt2, i6, paramintW);
            }
            else
            {
              if ((m != 1 ? 0 : 1) != 0)
              {
                Dsteqr.dsteqr("I", i6, paramArrayOfDouble1, i8 - 1 + paramInt2, paramArrayOfDouble2, i8 - 1 + paramInt3, paramArrayOfDouble4, paramInt6, i6, paramArrayOfDouble4, i6 * i6 + 1 - 1 + paramInt6, paramintW);
                Dlacpy.dlacpy("A", paramInt1, i6, paramArrayOfDouble3, 1 - 1 + (i8 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, i9 - 1 + paramInt6, paramInt1);
                Dgemm.dgemm("N", "N", paramInt1, i6, i6, 1.0D, paramArrayOfDouble4, i9 - 1 + paramInt6, paramInt1, paramArrayOfDouble4, paramInt6, i6, 0.0D, paramArrayOfDouble3, 1 - 1 + (i8 - 1) * paramInt5 + paramInt4, paramInt5);
              }
              else if ((m != 2 ? 0 : 1) != 0)
              {
                Dsteqr.dsteqr("I", i6, paramArrayOfDouble1, i8 - 1 + paramInt2, paramArrayOfDouble2, i8 - 1 + paramInt3, paramArrayOfDouble3, i8 - 1 + (i8 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble4, paramInt6, paramintW);
              }
              else
              {
                Dsterf.dsterf(i6, paramArrayOfDouble1, i8 - 1 + paramInt2, paramArrayOfDouble2, i8 - 1 + paramInt3, paramintW);
              }
              if ((paramintW.val == 0 ? 0 : 1) != 0)
              {
                paramintW.val = (i8 * (paramInt1 + 1) + j);
                break label1821;
              }
            }
            i8 = j + 1;
          }
        }
        if ((i6 == paramInt1 ? 0 : 1) != 0) {
          if ((m != 0 ? 0 : 1) != 0)
          {
            Dlasrt.dlasrt("I", paramInt1, paramArrayOfDouble1, paramInt2, paramintW);
          }
          else
          {
            n = 2;
            for (int i11 = paramInt1 - 2 + 1; i11 > 0; i11--)
            {
              k = n - 1;
              i2 = k;
              d3 = paramArrayOfDouble1[(k - 1 + paramInt2)];
              i1 = n;
              for (int i12 = paramInt1 - n + 1; i12 > 0; i12--)
              {
                if ((paramArrayOfDouble1[(i1 - 1 + paramInt2)] >= d3 ? 0 : 1) != 0)
                {
                  i2 = i1;
                  d3 = paramArrayOfDouble1[(i1 - 1 + paramInt2)];
                }
                i1 += 1;
              }
              if ((i2 == k ? 0 : 1) != 0)
              {
                paramArrayOfDouble1[(i2 - 1 + paramInt2)] = paramArrayOfDouble1[(k - 1 + paramInt2)];
                paramArrayOfDouble1[(k - 1 + paramInt2)] = d3;
                Dswap.dswap(paramInt1, paramArrayOfDouble3, 1 - 1 + (k - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble3, 1 - 1 + (i2 - 1) * paramInt5 + paramInt4, 1);
              }
              n += 1;
            }
          }
        }
      }
    }
    label1821:
    paramArrayOfDouble4[(1 - 1 + paramInt6)] = i5;
    paramArrayOfInt[(1 - 1 + paramInt8)] = i4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dstedc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */