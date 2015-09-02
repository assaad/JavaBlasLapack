package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Dgemv;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgerfs
{
  public static void dgerfs(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, int paramInt6, int[] paramArrayOfInt1, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, double[] paramArrayOfDouble6, int paramInt13, double[] paramArrayOfDouble7, int paramInt14, int[] paramArrayOfInt2, int paramInt15, intW paramintW)
  {
    boolean bool = false;
    String str = new String(" ");
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW = new intW(0);
    int n = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "N");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "T") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "C") ^ true) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -7;
    } else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -10;
    } else if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -12;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGERFS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      k = 1;
      for (i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
      {
        paramArrayOfDouble5[(k - 1 + paramInt12)] = 0.0D;
        paramArrayOfDouble6[(k - 1 + paramInt13)] = 0.0D;
        k += 1;
      }
      return;
    }
    if (bool) {
      str = "T";
    } else {
      str = "N";
    }
    n = paramInt1 + 1;
    d1 = Dlamch.dlamch("Epsilon");
    d6 = Dlamch.dlamch("Safe minimum");
    d4 = n * d6;
    d5 = d4 / d1;
    k = 1;
    for (int i1 = paramInt2 - 1 + 1; i1 > 0; i1--)
    {
      i = 1;
      d2 = 3.0D;
      for (;;)
      {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble3, 1 - 1 + (k - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt14, 1);
        Dgemv.dgemv(paramString, paramInt1, paramInt1, -1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, 1 - 1 + (k - 1) * paramInt11 + paramInt10, 1, 1.0D, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt14, 1);
        j = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          paramArrayOfDouble7[(j - 1 + paramInt14)] = Math.abs(paramArrayOfDouble3[(j - 1 + (k - 1) * paramInt9 + paramInt8)]);
          j += 1;
        }
        int i3;
        if (bool)
        {
          m = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            d7 = Math.abs(paramArrayOfDouble4[(m - 1 + (k - 1) * paramInt11 + paramInt10)]);
            j = 1;
            for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
            {
              paramArrayOfDouble7[(j - 1 + paramInt14)] += Math.abs(paramArrayOfDouble1[(j - 1 + (m - 1) * paramInt4 + paramInt3)]) * d7;
              j += 1;
            }
            m += 1;
          }
        }
        else
        {
          m = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            d3 = 0.0D;
            j = 1;
            for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
            {
              d3 += Math.abs(paramArrayOfDouble1[(j - 1 + (m - 1) * paramInt4 + paramInt3)]) * Math.abs(paramArrayOfDouble4[(j - 1 + (k - 1) * paramInt11 + paramInt10)]);
              j += 1;
            }
            paramArrayOfDouble7[(m - 1 + paramInt14)] += d3;
            m += 1;
          }
        }
        d3 = 0.0D;
        j = 1;
        for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
        {
          if ((paramArrayOfDouble7[(j - 1 + paramInt14)] <= d5 ? 0 : 1) != 0) {
            d3 = Math.max(d3, Math.abs(paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt14)]) / paramArrayOfDouble7[(j - 1 + paramInt14)]);
          } else {
            d3 = Math.max(d3, (Math.abs(paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt14)]) + d4) / (paramArrayOfDouble7[(j - 1 + paramInt14)] + d4));
          }
          j += 1;
        }
        paramArrayOfDouble6[(k - 1 + paramInt13)] = d3;
        if ((paramArrayOfDouble6[(k - 1 + paramInt13)] <= d1 ? 0 : 1) != 0) {}
        if (((2.0D * paramArrayOfDouble6[(k - 1 + paramInt13)] > d2 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((i > 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          break;
        }
        Dgetrs.dgetrs(paramString, paramInt1, 1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt14, paramInt1, paramintW);
        Daxpy.daxpy(paramInt1, 1.0D, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt14, 1, paramArrayOfDouble4, 1 - 1 + (k - 1) * paramInt11 + paramInt10, 1);
        d2 = paramArrayOfDouble6[(k - 1 + paramInt13)];
        i += 1;
      }
      j = 1;
      for (int i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        if ((paramArrayOfDouble7[(j - 1 + paramInt14)] <= d5 ? 0 : 1) != 0) {
          paramArrayOfDouble7[(j - 1 + paramInt14)] = (Math.abs(paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt14)]) + n * d1 * paramArrayOfDouble7[(j - 1 + paramInt14)]);
        } else {
          paramArrayOfDouble7[(j - 1 + paramInt14)] = (Math.abs(paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt14)]) + n * d1 * paramArrayOfDouble7[(j - 1 + paramInt14)] + d4);
        }
        j += 1;
      }
      localintW.val = 0;
      for (;;)
      {
        dlacn2_adapter(paramInt1, paramArrayOfDouble7, 2 * paramInt1 + 1 - 1 + paramInt14, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt14, paramArrayOfInt2, paramInt15, paramArrayOfDouble5, k - 1 + paramInt12, localintW, arrayOfInt, 0);
        if ((localintW.val == 0 ? 0 : 1) == 0) {
          break;
        }
        if ((localintW.val != 1 ? 0 : 1) != 0)
        {
          Dgetrs.dgetrs(str, paramInt1, 1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt14, paramInt1, paramintW);
          j = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt14)] = (paramArrayOfDouble7[(j - 1 + paramInt14)] * paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt14)]);
            j += 1;
          }
        }
        else
        {
          j = 1;
          for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
          {
            paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt14)] = (paramArrayOfDouble7[(j - 1 + paramInt14)] * paramArrayOfDouble7[(paramInt1 + j - 1 + paramInt14)]);
            j += 1;
          }
          Dgetrs.dgetrs(paramString, paramInt1, 1, paramArrayOfDouble2, paramInt5, paramInt6, paramArrayOfInt1, paramInt7, paramArrayOfDouble7, paramInt1 + 1 - 1 + paramInt14, paramInt1, paramintW);
        }
      }
      d2 = 0.0D;
      j = 1;
      for (i2 = paramInt1 - 1 + 1; i2 > 0; i2--)
      {
        d2 = Math.max(d2, Math.abs(paramArrayOfDouble4[(j - 1 + (k - 1) * paramInt11 + paramInt10)]));
        j += 1;
      }
      if ((d2 == 0.0D ? 0 : 1) != 0) {
        paramArrayOfDouble5[(k - 1 + paramInt12)] /= d2;
      }
      k += 1;
    }
  }
  
  private static void dlacn2_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, intW paramintW, int[] paramArrayOfInt2, int paramInt6)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble3[paramInt5]);
    Dlacn2.dlacn2(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfInt1, paramInt4, localdoubleW, paramintW, paramArrayOfInt2, paramInt6);
    paramArrayOfDouble3[paramInt5] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgerfs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */