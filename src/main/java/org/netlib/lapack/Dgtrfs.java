package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dcopy;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgtrfs
{
  public static void dgtrfs(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, double[] paramArrayOfDouble5, int paramInt7, double[] paramArrayOfDouble6, int paramInt8, double[] paramArrayOfDouble7, int paramInt9, int[] paramArrayOfInt1, int paramInt10, double[] paramArrayOfDouble8, int paramInt11, int paramInt12, double[] paramArrayOfDouble9, int paramInt13, int paramInt14, double[] paramArrayOfDouble10, int paramInt15, double[] paramArrayOfDouble11, int paramInt16, double[] paramArrayOfDouble12, int paramInt17, int[] paramArrayOfInt2, int paramInt18, intW paramintW)
  {
    boolean bool = false;
    String str1 = new String(" ");
    String str2 = new String(" ");
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
    } else if ((paramInt12 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -13;
    } else if ((paramInt14 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -15;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGTRFS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      k = 1;
      for (int n = paramInt2 - 1 + 1; n > 0; n--)
      {
        paramArrayOfDouble10[(k - 1 + paramInt15)] = 0.0D;
        paramArrayOfDouble11[(k - 1 + paramInt16)] = 0.0D;
        k += 1;
      }
      return;
    }
    if (bool)
    {
      str1 = "N";
      str2 = "T";
    }
    else
    {
      str1 = "T";
      str2 = "N";
    }
    m = 4;
    d1 = Dlamch.dlamch("Epsilon");
    d6 = Dlamch.dlamch("Safe minimum");
    d4 = m * d6;
    d5 = d4 / d1;
    k = 1;
    for (int n = paramInt2 - 1 + 1; n > 0; n--)
    {
      i = 1;
      d2 = 3.0D;
      for (;;)
      {
        Dcopy.dcopy(paramInt1, paramArrayOfDouble8, 1 - 1 + (k - 1) * paramInt12 + paramInt11, 1, paramArrayOfDouble12, paramInt1 + 1 - 1 + paramInt17, 1);
        Dlagtm.dlagtm(paramString, paramInt1, 1, -1.0D, paramArrayOfDouble1, paramInt3, paramArrayOfDouble2, paramInt4, paramArrayOfDouble3, paramInt5, paramArrayOfDouble9, 1 - 1 + (k - 1) * paramInt14 + paramInt13, paramInt14, 1.0D, paramArrayOfDouble12, paramInt1 + 1 - 1 + paramInt17, paramInt1);
        if (bool)
        {
          if ((paramInt1 != 1 ? 0 : 1) != 0)
          {
            paramArrayOfDouble12[(1 - 1 + paramInt17)] = (Math.abs(paramArrayOfDouble8[(1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble9[(1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
          }
          else
          {
            paramArrayOfDouble12[(1 - 1 + paramInt17)] = (Math.abs(paramArrayOfDouble8[(1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble9[(1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfDouble3[(1 - 1 + paramInt5)] * paramArrayOfDouble9[(2 - 1 + (k - 1) * paramInt14 + paramInt13)]));
            j = 2;
            for (int i1 = paramInt1 - 1 - 2 + 1; i1 > 0; i1--)
            {
              paramArrayOfDouble12[(j - 1 + paramInt17)] = (Math.abs(paramArrayOfDouble8[(j - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble1[(j - 1 - 1 + paramInt3)] * paramArrayOfDouble9[(j - 1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfDouble2[(j - 1 + paramInt4)] * paramArrayOfDouble9[(j - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfDouble3[(j - 1 + paramInt5)] * paramArrayOfDouble9[(j + 1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
              j += 1;
            }
            paramArrayOfDouble12[(paramInt1 - 1 + paramInt17)] = (Math.abs(paramArrayOfDouble8[(paramInt1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble1[(paramInt1 - 1 - 1 + paramInt3)] * paramArrayOfDouble9[(paramInt1 - 1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble9[(paramInt1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
          }
        }
        else if ((paramInt1 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfDouble12[(1 - 1 + paramInt17)] = (Math.abs(paramArrayOfDouble8[(1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble9[(1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
        }
        else
        {
          paramArrayOfDouble12[(1 - 1 + paramInt17)] = (Math.abs(paramArrayOfDouble8[(1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble2[(1 - 1 + paramInt4)] * paramArrayOfDouble9[(1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt3)] * paramArrayOfDouble9[(2 - 1 + (k - 1) * paramInt14 + paramInt13)]));
          j = 2;
          for (int i1 = paramInt1 - 1 - 2 + 1; i1 > 0; i1--)
          {
            paramArrayOfDouble12[(j - 1 + paramInt17)] = (Math.abs(paramArrayOfDouble8[(j - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble3[(j - 1 - 1 + paramInt5)] * paramArrayOfDouble9[(j - 1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfDouble2[(j - 1 + paramInt4)] * paramArrayOfDouble9[(j - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfDouble1[(j - 1 + paramInt3)] * paramArrayOfDouble9[(j + 1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
            j += 1;
          }
          paramArrayOfDouble12[(paramInt1 - 1 + paramInt17)] = (Math.abs(paramArrayOfDouble8[(paramInt1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfDouble3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfDouble9[(paramInt1 - 1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfDouble2[(paramInt1 - 1 + paramInt4)] * paramArrayOfDouble9[(paramInt1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
        }
        d3 = 0.0D;
        j = 1;
        for (int i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          if ((paramArrayOfDouble12[(j - 1 + paramInt17)] <= d5 ? 0 : 1) != 0) {
            d3 = Math.max(d3, Math.abs(paramArrayOfDouble12[(paramInt1 + j - 1 + paramInt17)]) / paramArrayOfDouble12[(j - 1 + paramInt17)]);
          } else {
            d3 = Math.max(d3, (Math.abs(paramArrayOfDouble12[(paramInt1 + j - 1 + paramInt17)]) + d4) / (paramArrayOfDouble12[(j - 1 + paramInt17)] + d4));
          }
          j += 1;
        }
        paramArrayOfDouble11[(k - 1 + paramInt16)] = d3;
        if ((paramArrayOfDouble11[(k - 1 + paramInt16)] <= d1 ? 0 : 1) != 0) {}
        if (((2.0D * paramArrayOfDouble11[(k - 1 + paramInt16)] > d2 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((i > 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          break;
        }
        Dgttrs.dgttrs(paramString, paramInt1, 1, paramArrayOfDouble4, paramInt6, paramArrayOfDouble5, paramInt7, paramArrayOfDouble6, paramInt8, paramArrayOfDouble7, paramInt9, paramArrayOfInt1, paramInt10, paramArrayOfDouble12, paramInt1 + 1 - 1 + paramInt17, paramInt1, paramintW);
        Daxpy.daxpy(paramInt1, 1.0D, paramArrayOfDouble12, paramInt1 + 1 - 1 + paramInt17, 1, paramArrayOfDouble9, 1 - 1 + (k - 1) * paramInt14 + paramInt13, 1);
        d2 = paramArrayOfDouble11[(k - 1 + paramInt16)];
        i += 1;
      }
      j = 1;
      for (int i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        if ((paramArrayOfDouble12[(j - 1 + paramInt17)] <= d5 ? 0 : 1) != 0) {
          paramArrayOfDouble12[(j - 1 + paramInt17)] = (Math.abs(paramArrayOfDouble12[(paramInt1 + j - 1 + paramInt17)]) + m * d1 * paramArrayOfDouble12[(j - 1 + paramInt17)]);
        } else {
          paramArrayOfDouble12[(j - 1 + paramInt17)] = (Math.abs(paramArrayOfDouble12[(paramInt1 + j - 1 + paramInt17)]) + m * d1 * paramArrayOfDouble12[(j - 1 + paramInt17)] + d4);
        }
        j += 1;
      }
      localintW.val = 0;
      for (;;)
      {
        dlacn2_adapter(paramInt1, paramArrayOfDouble12, 2 * paramInt1 + 1 - 1 + paramInt17, paramArrayOfDouble12, paramInt1 + 1 - 1 + paramInt17, paramArrayOfInt2, paramInt18, paramArrayOfDouble10, k - 1 + paramInt15, localintW, arrayOfInt, 0);
        if ((localintW.val == 0 ? 0 : 1) == 0) {
          break;
        }
        if ((localintW.val != 1 ? 0 : 1) != 0)
        {
          Dgttrs.dgttrs(str2, paramInt1, 1, paramArrayOfDouble4, paramInt6, paramArrayOfDouble5, paramInt7, paramArrayOfDouble6, paramInt8, paramArrayOfDouble7, paramInt9, paramArrayOfInt1, paramInt10, paramArrayOfDouble12, paramInt1 + 1 - 1 + paramInt17, paramInt1, paramintW);
          j = 1;
          for (int i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfDouble12[(paramInt1 + j - 1 + paramInt17)] = (paramArrayOfDouble12[(j - 1 + paramInt17)] * paramArrayOfDouble12[(paramInt1 + j - 1 + paramInt17)]);
            j += 1;
          }
        }
        else
        {
          j = 1;
          for (int i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfDouble12[(paramInt1 + j - 1 + paramInt17)] = (paramArrayOfDouble12[(j - 1 + paramInt17)] * paramArrayOfDouble12[(paramInt1 + j - 1 + paramInt17)]);
            j += 1;
          }
          Dgttrs.dgttrs(str1, paramInt1, 1, paramArrayOfDouble4, paramInt6, paramArrayOfDouble5, paramInt7, paramArrayOfDouble6, paramInt8, paramArrayOfDouble7, paramInt9, paramArrayOfInt1, paramInt10, paramArrayOfDouble12, paramInt1 + 1 - 1 + paramInt17, paramInt1, paramintW);
        }
      }
      d2 = 0.0D;
      j = 1;
      for (int i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        d2 = Math.max(d2, Math.abs(paramArrayOfDouble9[(j - 1 + (k - 1) * paramInt14 + paramInt13)]));
        j += 1;
      }
      if ((d2 == 0.0D ? 0 : 1) != 0) {
        paramArrayOfDouble10[(k - 1 + paramInt15)] /= d2;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgtrfs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */