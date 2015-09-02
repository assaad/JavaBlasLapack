package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dlagtf
{
  public static void dlagtf(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double paramDouble1, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, double paramDouble2, double[] paramArrayOfDouble4, int paramInt5, int[] paramArrayOfInt, int paramInt6, intW paramintW)
  {
    int i = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
      Xerbla.xerbla("DLAGTF", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    paramArrayOfDouble1[(1 - 1 + paramInt2)] -= paramDouble1;
    paramArrayOfInt[(paramInt1 - 1 + paramInt6)] = 0;
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((paramArrayOfDouble1[(1 - 1 + paramInt2)] != 0.0D ? 0 : 1) != 0) {
        paramArrayOfInt[(1 - 1 + paramInt6)] = 1;
      }
      return;
    }
    d1 = Dlamch.dlamch("Epsilon");
    d8 = Math.max(paramDouble2, d1);
    d5 = Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble2[(1 - 1 + paramInt3)]);
    i = 1;
    for (int j = paramInt1 - 1 - 1 + 1; j > 0; j--)
    {
      paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] -= paramDouble1;
      d6 = Math.abs(paramArrayOfDouble3[(i - 1 + paramInt4)]) + Math.abs(paramArrayOfDouble1[(i + 1 - 1 + paramInt2)]);
      if ((i >= paramInt1 - 1 ? 0 : 1) != 0) {
        d6 += Math.abs(paramArrayOfDouble2[(i + 1 - 1 + paramInt3)]);
      }
      if ((paramArrayOfDouble1[(i - 1 + paramInt2)] != 0.0D ? 0 : 1) != 0) {
        d3 = 0.0D;
      } else {
        d3 = Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]) / d5;
      }
      if ((paramArrayOfDouble3[(i - 1 + paramInt4)] != 0.0D ? 0 : 1) != 0)
      {
        paramArrayOfInt[(i - 1 + paramInt6)] = 0;
        d4 = 0.0D;
        d5 = d6;
        if ((i >= paramInt1 - 1 ? 0 : 1) != 0) {
          paramArrayOfDouble4[(i - 1 + paramInt5)] = 0.0D;
        }
      }
      else
      {
        d4 = Math.abs(paramArrayOfDouble3[(i - 1 + paramInt4)]) / d6;
        if ((d4 > d3 ? 0 : 1) != 0)
        {
          paramArrayOfInt[(i - 1 + paramInt6)] = 0;
          d5 = d6;
          paramArrayOfDouble3[(i - 1 + paramInt4)] /= paramArrayOfDouble1[(i - 1 + paramInt2)];
          paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] -= paramArrayOfDouble3[(i - 1 + paramInt4)] * paramArrayOfDouble2[(i - 1 + paramInt3)];
          if ((i >= paramInt1 - 1 ? 0 : 1) != 0) {
            paramArrayOfDouble4[(i - 1 + paramInt5)] = 0.0D;
          }
        }
        else
        {
          paramArrayOfInt[(i - 1 + paramInt6)] = 1;
          d2 = paramArrayOfDouble1[(i - 1 + paramInt2)] / paramArrayOfDouble3[(i - 1 + paramInt4)];
          paramArrayOfDouble1[(i - 1 + paramInt2)] = paramArrayOfDouble3[(i - 1 + paramInt4)];
          d7 = paramArrayOfDouble1[(i + 1 - 1 + paramInt2)];
          paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] = (paramArrayOfDouble2[(i - 1 + paramInt3)] - d2 * d7);
          if ((i >= paramInt1 - 1 ? 0 : 1) != 0)
          {
            paramArrayOfDouble4[(i - 1 + paramInt5)] = paramArrayOfDouble2[(i + 1 - 1 + paramInt3)];
            paramArrayOfDouble2[(i + 1 - 1 + paramInt3)] = (-(d2 * paramArrayOfDouble4[(i - 1 + paramInt5)]));
          }
          paramArrayOfDouble2[(i - 1 + paramInt3)] = d7;
          paramArrayOfDouble3[(i - 1 + paramInt4)] = d2;
        }
      }
      if ((Math.max(d3, d4) > d8 ? 0 : 1) != 0) {}
      if (((paramArrayOfInt[(paramInt1 - 1 + paramInt6)] != 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
        paramArrayOfInt[(paramInt1 - 1 + paramInt6)] = i;
      }
      i += 1;
    }
    if ((Math.abs(paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)]) > d5 * d8 ? 0 : 1) != 0) {}
    if (((paramArrayOfInt[(paramInt1 - 1 + paramInt6)] != 0 ? 0 : 1) != 0 ? 1 : 0) != 0) {
      paramArrayOfInt[(paramInt1 - 1 + paramInt6)] = paramInt1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlagtf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */