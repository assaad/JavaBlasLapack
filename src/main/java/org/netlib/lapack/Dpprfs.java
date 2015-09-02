package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Dspmv;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dpprfs
{
  public static void dpprfs(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, int paramInt8, double[] paramArrayOfDouble5, int paramInt9, double[] paramArrayOfDouble6, int paramInt10, double[] paramArrayOfDouble7, int paramInt11, int[] paramArrayOfInt, int paramInt12, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    intW localintW = new intW(0);
    int i1 = 0;
    int i2 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -7;
    } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -9;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DPPRFS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      m = 1;
      for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble5[(m - 1 + paramInt9)] = 0.0D;
        paramArrayOfDouble6[(m - 1 + paramInt10)] = 0.0D;
        m += 1;
      }
      return;
    }
    i2 = paramInt1 + 1;
    d1 = Dlamch.dlamch("Epsilon");
    d6 = Dlamch.dlamch("Safe minimum");
    d4 = i2 * d6;
    d5 = d4 / d1;
    m = 1;
    for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      i = 1;
      d2 = 3.0D;
      for (;;)
      {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble3, 1 - 1 + (m - 1) * paramInt6 + paramInt5, 1, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt11, 1);
        Dspmv.dspmv(paramString, paramInt1, -1.0D, paramArrayOfDouble1, paramInt3, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt8 + paramInt7, 1, 1.0D, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt11, 1);
        j = 1;
        for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          paramArrayOfDouble7[(j - 1 + paramInt11)] = Math.abs(paramArrayOfDouble3[(j - 1 + (m - 1) * paramInt6 + paramInt5)]);
          j += 1;
        }
        i1 = 1;
        int i5;
        if (bool)
        {
          n = 1;
          for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            d3 = 0.0D;
            d7 = Math.abs(paramArrayOfDouble4[(n - 1 + (m - 1) * paramInt8 + paramInt7)]);
            k = i1;
            j = 1;
            for (i5 = n - 1 - 1 + 1; i5 > 0; i5--)
            {
              paramArrayOfDouble7[(j - 1 + paramInt11)] += Math.abs(paramArrayOfDouble1[(k - 1 + paramInt3)]) * d7;
              d3 += Math.abs(paramArrayOfDouble1[(k - 1 + paramInt3)]) * Math.abs(paramArrayOfDouble4[(j - 1 + (m - 1) * paramInt8 + paramInt7)]);
              k += 1;
              j += 1;
            }
            paramArrayOfDouble7[(n - 1 + paramInt11)] = (paramArrayOfDouble7[(n - 1 + paramInt11)] + Math.abs(paramArrayOfDouble1[(i1 + n - 1 - 1 + paramInt3)]) * d7 + d3);
            i1 += n;
            n += 1;
          }
        }
        else
        {
          n = 1;
          for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            d3 = 0.0D;
            d7 = Math.abs(paramArrayOfDouble4[(n - 1 + (m - 1) * paramInt8 + paramInt7)]);
            paramArrayOfDouble7[(n - 1 + paramInt11)] += Math.abs(paramArrayOfDouble1[(i1 - 1 + paramInt3)]) * d7;
            k = i1 + 1;
            j = n + 1;
            for (i5 = paramInt1 - (n + 1) + 1; i5 > 0; i5--)
            {
              paramArrayOfDouble7[(j - 1 + paramInt11)] += Math.abs(paramArrayOfDouble1[(k - 1 + paramInt3)]) * d7;
              d3 += Math.abs(paramArrayOfDouble1[(k - 1 + paramInt3)]) * Math.abs(paramArrayOfDouble4[(j - 1 + (m - 1) * paramInt8 + paramInt7)]);
              k += 1;
              j += 1;
            }
            paramArrayOfDouble7[(n - 1 + paramInt11)] += d3;
            i1 += paramInt1 - n + 1;
            n += 1;
          }
        }
        d3 = 0.0D;
        j = 1;
        for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          if ((paramArrayOfDouble7[(j - 1 + paramInt11)] <= d5 ? 0 : 1) != 0) {
            d3 = Math.max(d3, Math.abs(paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt11)]) / paramArrayOfDouble7[(j - 1 + paramInt11)]);
          } else {
            d3 = Math.max(d3, (Math.abs(paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt11)]) + d4) / (paramArrayOfDouble7[(j - 1 + paramInt11)] + d4));
          }
          j += 1;
        }
        paramArrayOfDouble6[(m - 1 + paramInt10)] = d3;
        if ((paramArrayOfDouble6[(m - 1 + paramInt10)] <= d1 ? 0 : 1) != 0) {}
        if (((2.0D * paramArrayOfDouble6[(m - 1 + paramInt10)] > d2 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((i > 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          break;
        }
        Dpptrs.dpptrs(paramString, paramInt1, 1, paramArrayOfDouble2, paramInt4, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt11, paramInt1, paramintW);
        Daxpy.daxpy(paramInt1, 1.0D, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt11, 1, paramArrayOfDouble4, 1 - 1 + (m - 1) * paramInt8 + paramInt7, 1);
        d2 = paramArrayOfDouble6[(m - 1 + paramInt10)];
        i += 1;
      }
      j = 1;
      for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
      {
        if ((paramArrayOfDouble7[(j - 1 + paramInt11)] <= d5 ? 0 : 1) != 0) {
          paramArrayOfDouble7[(j - 1 + paramInt11)] = (Math.abs(paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt11)]) + i2 * d1 * paramArrayOfDouble7[(j - 1 + paramInt11)]);
        } else {
          paramArrayOfDouble7[(j - 1 + paramInt11)] = (Math.abs(paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt11)]) + i2 * d1 * paramArrayOfDouble7[(j - 1 + paramInt11)] + d4);
        }
        j += 1;
      }
      localintW.val = 0;
      for (;;)
      {
        dlacn2_adapter(paramInt1, paramArrayOfDouble7, 2 * paramInt1 + 1 - 1 + paramInt11, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt11, paramArrayOfInt, paramInt12, paramArrayOfDouble5, m - 1 + paramInt9, localintW, arrayOfInt, 0);
        if ((localintW.val == 0 ? 0 : 1) == 0) {
          break;
        }
        if ((localintW.val != 1 ? 0 : 1) != 0)
        {
          Dpptrs.dpptrs(paramString, paramInt1, 1, paramArrayOfDouble2, paramInt4, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt11, paramInt1, paramintW);
          j = 1;
          for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt11)] = (paramArrayOfDouble7[(j - 1 + paramInt11)] * paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt11)]);
            j += 1;
          }
        }
        else if ((localintW.val != 2 ? 0 : 1) != 0)
        {
          j = 1;
          for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt11)] = (paramArrayOfDouble7[(j - 1 + paramInt11)] * paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt11)]);
            j += 1;
          }
          Dpptrs.dpptrs(paramString, paramInt1, 1, paramArrayOfDouble2, paramInt4, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt11, paramInt1, paramintW);
        }
      }
      d2 = 0.0D;
      j = 1;
      for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
      {
        d2 = Math.max(d2, Math.abs(paramArrayOfDouble4[(j - 1 + (m - 1) * paramInt8 + paramInt7)]));
        j += 1;
      }
      if ((d2 == 0.0D ? 0 : 1) != 0) {
        paramArrayOfDouble5[(m - 1 + paramInt9)] /= d2;
      }
      m += 1;
    }
  }
  
  private static void dlacn2_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, intW paramintW, int[] paramArrayOfInt2, int paramInt6)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble3[paramInt5]);
    Dlacn2.dlacn2(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfInt1, paramInt4, localdoubleW, paramintW, paramArrayOfInt2, paramInt6);
    paramArrayOfDouble3[paramInt5] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dpprfs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */