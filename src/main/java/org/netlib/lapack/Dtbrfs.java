package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.blas.Dtbmv;
import org.netlib.blas.Dtbsv;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dtbrfs
{
  public static void dtbrfs(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, double[] paramArrayOfDouble5, int paramInt11, double[] paramArrayOfDouble6, int paramInt12, int[] paramArrayOfInt, int paramInt13, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    String str = new String(" ");
    int i = 0;
    int j = 0;
    int k = 0;
    intW localintW = new intW(0);
    int m = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool3 = Lsame.lsame(paramString1, "U");
    bool1 = Lsame.lsame(paramString2, "N");
    bool2 = Lsame.lsame(paramString3, "N");
    if ((((bool3 ^ true)) && ((Lsame.lsame(paramString1, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((((bool1 ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0) {}
      if (((Lsame.lsame(paramString2, "C") ^ true) ? 1 : 0) != 0) {
        paramintW.val = -2;
      } else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString3, "U") ^ true)) ? 1 : 0) != 0) {
        paramintW.val = -3;
      } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -4;
      } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -5;
      } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
        paramintW.val = -6;
      } else if ((paramInt5 >= paramInt2 + 1 ? 0 : 1) != 0) {
        paramintW.val = -8;
      } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -10;
      } else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -12;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DTBRFS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      j = 1;
      for (n = paramInt3 - 1 + 1; n > 0; n--)
      {
        paramArrayOfDouble4[(j - 1 + paramInt10)] = 0.0D;
        paramArrayOfDouble5[(j - 1 + paramInt11)] = 0.0D;
        j += 1;
      }
      return;
    }
    if (bool1) {
      str = "T";
    } else {
      str = "N";
    }
    m = paramInt2 + 2;
    d1 = Dlamch.dlamch("Epsilon");
    d6 = Dlamch.dlamch("Safe minimum");
    d4 = m * d6;
    d5 = d4 / d1;
    j = 1;
    for (int n = paramInt3 - 1 + 1; n > 0; n--)
    {
      Dcopy.dcopy(paramInt1, paramArrayOfDouble3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble6, paramInt1 + 1 - 1 + paramInt12, 1);
      Dtbmv.dtbmv(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble6, paramInt1 + 1 - 1 + paramInt12, 1);
      Daxpy.daxpy(paramInt1, -1.0D, paramArrayOfDouble2, 1 - 1 + (j - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble6, paramInt1 + 1 - 1 + paramInt12, 1);
      i = 1;
      for (int i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        paramArrayOfDouble6[(i - 1 + paramInt12)] = Math.abs(paramArrayOfDouble2[(i - 1 + (j - 1) * paramInt7 + paramInt6)]);
        i += 1;
      }
      int i2;
      if (bool1)
      {
        if (bool3)
        {
          if (bool2)
          {
            k = 1;
            for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
            {
              d7 = Math.abs(paramArrayOfDouble3[(k - 1 + (j - 1) * paramInt9 + paramInt8)]);
              i = Math.max(1, k - paramInt2);
              for (i2 = k - Math.max(1, k - paramInt2) + 1; i2 > 0; i2--)
              {
                paramArrayOfDouble6[(i - 1 + paramInt12)] += Math.abs(paramArrayOfDouble1[(paramInt2 + 1 + i - k - 1 + (k - 1) * paramInt5 + paramInt4)]) * d7;
                i += 1;
              }
              k += 1;
            }
          }
          else
          {
            k = 1;
            for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
            {
              d7 = Math.abs(paramArrayOfDouble3[(k - 1 + (j - 1) * paramInt9 + paramInt8)]);
              i = Math.max(1, k - paramInt2);
              for (i2 = k - 1 - Math.max(1, k - paramInt2) + 1; i2 > 0; i2--)
              {
                paramArrayOfDouble6[(i - 1 + paramInt12)] += Math.abs(paramArrayOfDouble1[(paramInt2 + 1 + i - k - 1 + (k - 1) * paramInt5 + paramInt4)]) * d7;
                i += 1;
              }
              paramArrayOfDouble6[(k - 1 + paramInt12)] += d7;
              k += 1;
            }
          }
        }
        else if (bool2)
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            d7 = Math.abs(paramArrayOfDouble3[(k - 1 + (j - 1) * paramInt9 + paramInt8)]);
            i = k;
            for (i2 = Math.min(paramInt1, k + paramInt2) - k + 1; i2 > 0; i2--)
            {
              paramArrayOfDouble6[(i - 1 + paramInt12)] += Math.abs(paramArrayOfDouble1[(1 + i - k - 1 + (k - 1) * paramInt5 + paramInt4)]) * d7;
              i += 1;
            }
            k += 1;
          }
        }
        else
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            d7 = Math.abs(paramArrayOfDouble3[(k - 1 + (j - 1) * paramInt9 + paramInt8)]);
            i = k + 1;
            for (i2 = Math.min(paramInt1, k + paramInt2) - (k + 1) + 1; i2 > 0; i2--)
            {
              paramArrayOfDouble6[(i - 1 + paramInt12)] += Math.abs(paramArrayOfDouble1[(1 + i - k - 1 + (k - 1) * paramInt5 + paramInt4)]) * d7;
              i += 1;
            }
            paramArrayOfDouble6[(k - 1 + paramInt12)] += d7;
            k += 1;
          }
        }
      }
      else if (bool3)
      {
        if (bool2)
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            d3 = 0.0D;
            i = Math.max(1, k - paramInt2);
            for (i2 = k - Math.max(1, k - paramInt2) + 1; i2 > 0; i2--)
            {
              d3 += Math.abs(paramArrayOfDouble1[(paramInt2 + 1 + i - k - 1 + (k - 1) * paramInt5 + paramInt4)]) * Math.abs(paramArrayOfDouble3[(i - 1 + (j - 1) * paramInt9 + paramInt8)]);
              i += 1;
            }
            paramArrayOfDouble6[(k - 1 + paramInt12)] += d3;
            k += 1;
          }
        }
        else
        {
          k = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            d3 = Math.abs(paramArrayOfDouble3[(k - 1 + (j - 1) * paramInt9 + paramInt8)]);
            i = Math.max(1, k - paramInt2);
            for (i2 = k - 1 - Math.max(1, k - paramInt2) + 1; i2 > 0; i2--)
            {
              d3 += Math.abs(paramArrayOfDouble1[(paramInt2 + 1 + i - k - 1 + (k - 1) * paramInt5 + paramInt4)]) * Math.abs(paramArrayOfDouble3[(i - 1 + (j - 1) * paramInt9 + paramInt8)]);
              i += 1;
            }
            paramArrayOfDouble6[(k - 1 + paramInt12)] += d3;
            k += 1;
          }
        }
      }
      else if (bool2)
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          d3 = 0.0D;
          i = k;
          for (i2 = Math.min(paramInt1, k + paramInt2) - k + 1; i2 > 0; i2--)
          {
            d3 += Math.abs(paramArrayOfDouble1[(1 + i - k - 1 + (k - 1) * paramInt5 + paramInt4)]) * Math.abs(paramArrayOfDouble3[(i - 1 + (j - 1) * paramInt9 + paramInt8)]);
            i += 1;
          }
          paramArrayOfDouble6[(k - 1 + paramInt12)] += d3;
          k += 1;
        }
      }
      else
      {
        k = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          d3 = Math.abs(paramArrayOfDouble3[(k - 1 + (j - 1) * paramInt9 + paramInt8)]);
          i = k + 1;
          for (i2 = Math.min(paramInt1, k + paramInt2) - (k + 1) + 1; i2 > 0; i2--)
          {
            d3 += Math.abs(paramArrayOfDouble1[(1 + i - k - 1 + (k - 1) * paramInt5 + paramInt4)]) * Math.abs(paramArrayOfDouble3[(i - 1 + (j - 1) * paramInt9 + paramInt8)]);
            i += 1;
          }
          paramArrayOfDouble6[(k - 1 + paramInt12)] += d3;
          k += 1;
        }
      }
      d3 = 0.0D;
      i = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        if ((paramArrayOfDouble6[(i - 1 + paramInt12)] <= d5 ? 0 : 1) != 0) {
          d3 = Math.max(d3, Math.abs(paramArrayOfDouble6[(paramInt1 + i - 1 + paramInt12)]) / paramArrayOfDouble6[(i - 1 + paramInt12)]);
        } else {
          d3 = Math.max(d3, (Math.abs(paramArrayOfDouble6[(paramInt1 + i - 1 + paramInt12)]) + d4) / (paramArrayOfDouble6[(i - 1 + paramInt12)] + d4));
        }
        i += 1;
      }
      paramArrayOfDouble5[(j - 1 + paramInt11)] = d3;
      i = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        if ((paramArrayOfDouble6[(i - 1 + paramInt12)] <= d5 ? 0 : 1) != 0) {
          paramArrayOfDouble6[(i - 1 + paramInt12)] = (Math.abs(paramArrayOfDouble6[(paramInt1 + i - 1 + paramInt12)]) + m * d1 * paramArrayOfDouble6[(i - 1 + paramInt12)]);
        } else {
          paramArrayOfDouble6[(i - 1 + paramInt12)] = (Math.abs(paramArrayOfDouble6[(paramInt1 + i - 1 + paramInt12)]) + m * d1 * paramArrayOfDouble6[(i - 1 + paramInt12)] + d4);
        }
        i += 1;
      }
      localintW.val = 0;
      for (;;)
      {
        dlacn2_adapter(paramInt1, paramArrayOfDouble6, 2 * paramInt1 + 1 - 1 + paramInt12, paramArrayOfDouble6, paramInt1 + 1 - 1 + paramInt12, paramArrayOfInt, paramInt13, paramArrayOfDouble4, j - 1 + paramInt10, localintW, arrayOfInt, 0);
        if ((localintW.val == 0 ? 0 : 1) == 0) {
          break;
        }
        if ((localintW.val != 1 ? 0 : 1) != 0)
        {
          Dtbsv.dtbsv(paramString1, str, paramString3, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble6, paramInt1 + 1 - 1 + paramInt12, 1);
          i = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfDouble6[(paramInt1 + i - 1 + paramInt12)] = (paramArrayOfDouble6[(i - 1 + paramInt12)] * paramArrayOfDouble6[(paramInt1 + i - 1 + paramInt12)]);
            i += 1;
          }
        }
        else
        {
          i = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfDouble6[(paramInt1 + i - 1 + paramInt12)] = (paramArrayOfDouble6[(i - 1 + paramInt12)] * paramArrayOfDouble6[(paramInt1 + i - 1 + paramInt12)]);
            i += 1;
          }
          Dtbsv.dtbsv(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble6, paramInt1 + 1 - 1 + paramInt12, 1);
        }
      }
      d2 = 0.0D;
      i = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        d2 = Math.max(d2, Math.abs(paramArrayOfDouble3[(i - 1 + (j - 1) * paramInt9 + paramInt8)]));
        i += 1;
      }
      if ((d2 == 0.0D ? 0 : 1) != 0) {
        paramArrayOfDouble4[(j - 1 + paramInt10)] /= d2;
      }
      j += 1;
    }
  }
  
  private static void dlacn2_adapter(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, intW paramintW, int[] paramArrayOfInt2, int paramInt6)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble3[paramInt5]);
    Dlacn2.dlacn2(paramInt1, paramArrayOfDouble1, paramInt2, paramArrayOfDouble2, paramInt3, paramArrayOfInt1, paramInt4, localdoubleW, paramintW, paramArrayOfInt2, paramInt6);
    paramArrayOfDouble3[paramInt5] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dtbrfs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */