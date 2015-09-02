package org.netlib.lapack;

import org.netlib.blas.Drot;
import org.netlib.err.Xerbla;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dgghrd
{
  public static void dgghrd(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d = 0.0D;
    if (Lsame.lsame(paramString1, "N"))
    {
      i = 0;
      k = 1;
    }
    else if (Lsame.lsame(paramString1, "V"))
    {
      i = 1;
      k = 2;
    }
    else if (Lsame.lsame(paramString1, "I"))
    {
      i = 1;
      k = 3;
    }
    else
    {
      k = 0;
    }
    if (Lsame.lsame(paramString2, "N"))
    {
      j = 0;
      m = 1;
    }
    else if (Lsame.lsame(paramString2, "V"))
    {
      j = 1;
      m = 2;
    }
    else if (Lsame.lsame(paramString2, "I"))
    {
      j = 1;
      m = 3;
    }
    else
    {
      m = 0;
    }
    paramintW.val = 0;
    if ((k > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else if ((m > 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 1 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((paramInt3 <= paramInt1 ? 0 : 1) == 0) {}
      if (((paramInt3 >= paramInt2 - 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
      }
      else if ((paramInt5 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -7;
      }
      else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -9;
      }
      else
      {
        if (i != 0) {}
        if (((paramInt9 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
        if (((paramInt9 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
        {
          paramintW.val = -11;
        }
        else
        {
          if (j != 0) {}
          if (((paramInt11 >= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0) {}
          if (((paramInt11 >= 1 ? 0 : 1) == 0 ? 0 : 1) != 0) {
            paramintW.val = -13;
          }
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DGGHRD", -paramintW.val);
      return;
    }
    if ((k != 3 ? 0 : 1) != 0) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble3, paramInt8, paramInt9);
    }
    if ((m != 3 ? 0 : 1) != 0) {
      Dlaset.dlaset("Full", paramInt1, paramInt1, 0.0D, 1.0D, paramArrayOfDouble4, paramInt10, paramInt11);
    }
    if ((paramInt1 > 1 ? 0 : 1) != 0) {
      return;
    }
    n = 1;
    int i3;
    for (int i2 = paramInt1 - 1 - 1 + 1; i2 > 0; i2--)
    {
      i1 = n + 1;
      for (i3 = paramInt1 - (n + 1) + 1; i3 > 0; i3--)
      {
        paramArrayOfDouble2[(i1 - 1 + (n - 1) * paramInt7 + paramInt6)] = 0.0D;
        i1 += 1;
      }
      n += 1;
    }
    n = paramInt2;
    for (i2 = paramInt3 - 2 - paramInt2 + 1; i2 > 0; i2--)
    {
      i1 = paramInt3;
      for (i3 = (n + 2 - paramInt3 + -1) / -1; i3 > 0; i3--)
      {
        d = paramArrayOfDouble1[(i1 - 1 - 1 + (n - 1) * paramInt5 + paramInt4)];
        dlartg_adapter(d, paramArrayOfDouble1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)], localdoubleW1, localdoubleW2, paramArrayOfDouble1, i1 - 1 - 1 + (n - 1) * paramInt5 + paramInt4);
        paramArrayOfDouble1[(i1 - 1 + (n - 1) * paramInt5 + paramInt4)] = 0.0D;
        Drot.drot(paramInt1 - n, paramArrayOfDouble1, i1 - 1 - 1 + (n + 1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble1, i1 - 1 + (n + 1 - 1) * paramInt5 + paramInt4, paramInt5, localdoubleW1.val, localdoubleW2.val);
        Drot.drot(paramInt1 + 2 - i1, paramArrayOfDouble2, i1 - 1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble2, i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6, paramInt7, localdoubleW1.val, localdoubleW2.val);
        if (i != 0) {
          Drot.drot(paramInt1, paramArrayOfDouble3, 1 - 1 + (i1 - 1 - 1) * paramInt9 + paramInt8, 1, paramArrayOfDouble3, 1 - 1 + (i1 - 1) * paramInt9 + paramInt8, 1, localdoubleW1.val, localdoubleW2.val);
        }
        d = paramArrayOfDouble2[(i1 - 1 + (i1 - 1) * paramInt7 + paramInt6)];
        dlartg_adapter(d, paramArrayOfDouble2[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)], localdoubleW1, localdoubleW2, paramArrayOfDouble2, i1 - 1 + (i1 - 1) * paramInt7 + paramInt6);
        paramArrayOfDouble2[(i1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6)] = 0.0D;
        Drot.drot(paramInt3, paramArrayOfDouble1, 1 - 1 + (i1 - 1) * paramInt5 + paramInt4, 1, paramArrayOfDouble1, 1 - 1 + (i1 - 1 - 1) * paramInt5 + paramInt4, 1, localdoubleW1.val, localdoubleW2.val);
        Drot.drot(i1 - 1, paramArrayOfDouble2, 1 - 1 + (i1 - 1) * paramInt7 + paramInt6, 1, paramArrayOfDouble2, 1 - 1 + (i1 - 1 - 1) * paramInt7 + paramInt6, 1, localdoubleW1.val, localdoubleW2.val);
        if (j != 0) {
          Drot.drot(paramInt1, paramArrayOfDouble4, 1 - 1 + (i1 - 1) * paramInt11 + paramInt10, 1, paramArrayOfDouble4, 1 - 1 + (i1 - 1 - 1) * paramInt11 + paramInt10, 1, localdoubleW1.val, localdoubleW2.val);
        }
        i1 += -1;
      }
      n += 1;
    }
  }
  
  private static void dlartg_adapter(double paramDouble1, double paramDouble2, doubleW paramdoubleW1, doubleW paramdoubleW2, double[] paramArrayOfDouble, int paramInt)
  {
    doubleW localdoubleW = new doubleW(paramArrayOfDouble[paramInt]);
    Dlartg.dlartg(paramDouble1, paramDouble2, paramdoubleW1, paramdoubleW2, localdoubleW);
    paramArrayOfDouble[paramInt] = localdoubleW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dgghrd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */