package org.netlib.lapack;

import org.netlib.util.intW;

public final class Dlarrc
{
  public static void dlarrc(String paramString, int paramInt1, double paramDouble1, double paramDouble2, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double paramDouble3, intW paramintW1, intW paramintW2, intW paramintW3, intW paramintW4)
  {
    int i = 0;
    boolean bool = false;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    paramintW4.val = 0;
    paramintW2.val = 0;
    paramintW3.val = 0;
    paramintW1.val = 0;
    bool = Lsame.lsame(paramString, "T");
    int j;
    if (bool)
    {
      d1 = paramArrayOfDouble1[(1 - 1 + paramInt2)] - paramDouble1;
      d2 = paramArrayOfDouble1[(1 - 1 + paramInt2)] - paramDouble2;
      if ((d1 > 0.0D ? 0 : 1) != 0) {
        paramintW2.val += 1;
      }
      if ((d2 > 0.0D ? 0 : 1) != 0) {
        paramintW3.val += 1;
      }
      i = 1;
      for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
      {
        d5 = Math.pow(paramArrayOfDouble2[(i - 1 + paramInt3)], 2);
        d1 = paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] - paramDouble1 - d5 / d1;
        d2 = paramArrayOfDouble1[(i + 1 - 1 + paramInt2)] - paramDouble2 - d5 / d2;
        if ((d1 > 0.0D ? 0 : 1) != 0) {
          paramintW2.val += 1;
        }
        if ((d2 > 0.0D ? 0 : 1) != 0) {
          paramintW3.val += 1;
        }
        i += 1;
      }
    }
    else
    {
      d3 = -paramDouble1;
      d4 = -paramDouble2;
      i = 1;
      for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
      {
        d1 = paramArrayOfDouble1[(i - 1 + paramInt2)] + d3;
        d2 = paramArrayOfDouble1[(i - 1 + paramInt2)] + d4;
        if ((d1 > 0.0D ? 0 : 1) != 0) {
          paramintW2.val += 1;
        }
        if ((d2 > 0.0D ? 0 : 1) != 0) {
          paramintW3.val += 1;
        }
        d5 = paramArrayOfDouble2[(i - 1 + paramInt3)] * paramArrayOfDouble1[(i - 1 + paramInt2)] * paramArrayOfDouble2[(i - 1 + paramInt3)];
        d6 = d5 / d1;
        if ((d6 != 0.0D ? 0 : 1) != 0) {
          d3 = d5 - paramDouble1;
        } else {
          d3 = d3 * d6 - paramDouble1;
        }
        d6 = d5 / d2;
        if ((d6 != 0.0D ? 0 : 1) != 0) {
          d4 = d5 - paramDouble2;
        } else {
          d4 = d4 * d6 - paramDouble2;
        }
        i += 1;
      }
      d1 = paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)] + d3;
      d2 = paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)] + d4;
      if ((d1 > 0.0D ? 0 : 1) != 0) {
        paramintW2.val += 1;
      }
      if ((d2 > 0.0D ? 0 : 1) != 0) {
        paramintW3.val += 1;
      }
    }
    paramintW3.val -= paramintW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarrc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */