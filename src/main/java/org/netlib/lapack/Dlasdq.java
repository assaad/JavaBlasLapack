package org.netlib.lapack;

import org.netlib.blas.Dswap;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlasdq
{
  public static void dlasdq(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double[] paramArrayOfDouble1, int paramInt6, double[] paramArrayOfDouble2, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, double[] paramArrayOfDouble5, int paramInt12, int paramInt13, double[] paramArrayOfDouble6, int paramInt14, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d = 0.0D;
    doubleW localdoubleW3 = new doubleW(0.0D);
    paramintW.val = 0;
    m = 0;
    if (Lsame.lsame(paramString, "U")) {
      m = 1;
    }
    if (Lsame.lsame(paramString, "L")) {
      m = 2;
    }
    if ((m != 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt1 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt1 <= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
      }
      else if ((paramInt2 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -3;
      }
      else if ((paramInt3 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -4;
      }
      else if ((paramInt4 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
      }
      else if ((paramInt5 >= 0 ? 0 : 1) != 0)
      {
        paramintW.val = -6;
      }
      else
      {
        if ((paramInt3 != 0 ? 0 : 1) != 0) {}
        if (((paramInt9 >= 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          if ((paramInt3 <= 0 ? 0 : 1) == 0) {}
        }
        if ((((paramInt9 >= Math.max(1, paramInt2) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -10;
        }
        else if ((paramInt11 >= Math.max(1, paramInt4) ? 0 : 1) != 0)
        {
          paramintW.val = -12;
        }
        else
        {
          if ((paramInt5 != 0 ? 0 : 1) != 0) {}
          if (((paramInt13 >= 1 ? 0 : 1) != 0 ? 1 : 0) == 0) {
            if ((paramInt5 <= 0 ? 0 : 1) == 0) {}
          }
          if ((((paramInt13 >= Math.max(1, paramInt2) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
            paramintW.val = -14;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLASDQ", -paramintW.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((paramInt3 <= 0 ? 0 : 1) == 0) {}
    if (((paramInt4 <= 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    i = (paramInt5 <= 0 ? 0 : 1) == 0 ? 0 : 1;
    i1 = paramInt2 + 1;
    i2 = paramInt1;
    if ((m != 1 ? 0 : 1) != 0) {}
    if (((i2 != 1 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      j = 1;
      for (i3 = paramInt2 - 1 - 1 + 1; i3 > 0; i3--)
      {
        Dlartg.dlartg(paramArrayOfDouble1[(j - 1 + paramInt6)], paramArrayOfDouble2[(j - 1 + paramInt7)], localdoubleW1, localdoubleW3, localdoubleW2);
        paramArrayOfDouble1[(j - 1 + paramInt6)] = localdoubleW2.val;
        paramArrayOfDouble2[(j - 1 + paramInt7)] = (localdoubleW3.val * paramArrayOfDouble1[(j + 1 - 1 + paramInt6)]);
        paramArrayOfDouble1[(j + 1 - 1 + paramInt6)] = (localdoubleW1.val * paramArrayOfDouble1[(j + 1 - 1 + paramInt6)]);
        if (i != 0)
        {
          paramArrayOfDouble6[(j - 1 + paramInt14)] = localdoubleW1.val;
          paramArrayOfDouble6[(paramInt2 + j - 1 + paramInt14)] = localdoubleW3.val;
        }
        j += 1;
      }
      Dlartg.dlartg(paramArrayOfDouble1[(paramInt2 - 1 + paramInt6)], paramArrayOfDouble2[(paramInt2 - 1 + paramInt7)], localdoubleW1, localdoubleW3, localdoubleW2);
      paramArrayOfDouble1[(paramInt2 - 1 + paramInt6)] = localdoubleW2.val;
      paramArrayOfDouble2[(paramInt2 - 1 + paramInt7)] = 0.0D;
      if (i != 0)
      {
        paramArrayOfDouble6[(paramInt2 - 1 + paramInt14)] = localdoubleW1.val;
        paramArrayOfDouble6[(paramInt2 + paramInt2 - 1 + paramInt14)] = localdoubleW3.val;
      }
      m = 2;
      i2 = 0;
      if ((paramInt3 <= 0 ? 0 : 1) != 0) {
        Dlasr.dlasr("L", "V", "F", i1, paramInt3, paramArrayOfDouble6, 1 - 1 + paramInt14, paramArrayOfDouble6, i1 - 1 + paramInt14, paramArrayOfDouble3, paramInt8, paramInt9);
      }
    }
    if ((m != 2 ? 0 : 1) != 0)
    {
      j = 1;
      for (i3 = paramInt2 - 1 - 1 + 1; i3 > 0; i3--)
      {
        Dlartg.dlartg(paramArrayOfDouble1[(j - 1 + paramInt6)], paramArrayOfDouble2[(j - 1 + paramInt7)], localdoubleW1, localdoubleW3, localdoubleW2);
        paramArrayOfDouble1[(j - 1 + paramInt6)] = localdoubleW2.val;
        paramArrayOfDouble2[(j - 1 + paramInt7)] = (localdoubleW3.val * paramArrayOfDouble1[(j + 1 - 1 + paramInt6)]);
        paramArrayOfDouble1[(j + 1 - 1 + paramInt6)] = (localdoubleW1.val * paramArrayOfDouble1[(j + 1 - 1 + paramInt6)]);
        if (i != 0)
        {
          paramArrayOfDouble6[(j - 1 + paramInt14)] = localdoubleW1.val;
          paramArrayOfDouble6[(paramInt2 + j - 1 + paramInt14)] = localdoubleW3.val;
        }
        j += 1;
      }
      if ((i2 != 1 ? 0 : 1) != 0)
      {
        Dlartg.dlartg(paramArrayOfDouble1[(paramInt2 - 1 + paramInt6)], paramArrayOfDouble2[(paramInt2 - 1 + paramInt7)], localdoubleW1, localdoubleW3, localdoubleW2);
        paramArrayOfDouble1[(paramInt2 - 1 + paramInt6)] = localdoubleW2.val;
        if (i != 0)
        {
          paramArrayOfDouble6[(paramInt2 - 1 + paramInt14)] = localdoubleW1.val;
          paramArrayOfDouble6[(paramInt2 + paramInt2 - 1 + paramInt14)] = localdoubleW3.val;
        }
      }
      if ((paramInt4 <= 0 ? 0 : 1) != 0) {
        if ((i2 != 0 ? 0 : 1) != 0) {
          Dlasr.dlasr("R", "V", "F", paramInt4, paramInt2, paramArrayOfDouble6, 1 - 1 + paramInt14, paramArrayOfDouble6, i1 - 1 + paramInt14, paramArrayOfDouble4, paramInt10, paramInt11);
        } else {
          Dlasr.dlasr("R", "V", "F", paramInt4, i1, paramArrayOfDouble6, 1 - 1 + paramInt14, paramArrayOfDouble6, i1 - 1 + paramInt14, paramArrayOfDouble4, paramInt10, paramInt11);
        }
      }
      if ((paramInt5 <= 0 ? 0 : 1) != 0) {
        if ((i2 != 0 ? 0 : 1) != 0) {
          Dlasr.dlasr("L", "V", "F", paramInt2, paramInt5, paramArrayOfDouble6, 1 - 1 + paramInt14, paramArrayOfDouble6, i1 - 1 + paramInt14, paramArrayOfDouble5, paramInt12, paramInt13);
        } else {
          Dlasr.dlasr("L", "V", "F", i1, paramInt5, paramArrayOfDouble6, 1 - 1 + paramInt14, paramArrayOfDouble6, i1 - 1 + paramInt14, paramArrayOfDouble5, paramInt12, paramInt13);
        }
      }
    }
    Dbdsqr.dbdsqr("U", paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfDouble1, paramInt6, paramArrayOfDouble2, paramInt7, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, paramInt11, paramArrayOfDouble5, paramInt12, paramInt13, paramArrayOfDouble6, paramInt14, paramintW);
    j = 1;
    for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      k = j;
      d = paramArrayOfDouble1[(j - 1 + paramInt6)];
      n = j + 1;
      for (int i4 = paramInt2 - (j + 1) + 1; i4 > 0; i4--)
      {
        if ((paramArrayOfDouble1[(n - 1 + paramInt6)] >= d ? 0 : 1) != 0)
        {
          k = n;
          d = paramArrayOfDouble1[(n - 1 + paramInt6)];
        }
        n += 1;
      }
      if ((k == j ? 0 : 1) != 0)
      {
        paramArrayOfDouble1[(k - 1 + paramInt6)] = paramArrayOfDouble1[(j - 1 + paramInt6)];
        paramArrayOfDouble1[(j - 1 + paramInt6)] = d;
        if ((paramInt3 <= 0 ? 0 : 1) != 0) {
          Dswap.dswap(paramInt3, paramArrayOfDouble3, k - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble3, j - 1 + (1 - 1) * paramInt9 + paramInt8, paramInt9);
        }
        if ((paramInt4 <= 0 ? 0 : 1) != 0) {
          Dswap.dswap(paramInt4, paramArrayOfDouble4, 1 - 1 + (k - 1) * paramInt11 + paramInt10, 1, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt11 + paramInt10, 1);
        }
        if ((paramInt5 <= 0 ? 0 : 1) != 0) {
          Dswap.dswap(paramInt5, paramArrayOfDouble5, k - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13, paramArrayOfDouble5, j - 1 + (1 - 1) * paramInt13 + paramInt12, paramInt13);
        }
      }
      j += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlasdq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */