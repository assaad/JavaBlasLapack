package org.netlib.lapack;

public final class Dlaneg
{
  public static int dlaneg(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4)
  {
    int i1 = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    boolean bool = false;
    n = 0;
    d6 = -paramDouble1;
    i = 1;
    int i3;
    for (int i2 = (paramInt4 - 1 - 1 + 128) / 128; i2 > 0; i2--)
    {
      k = 0;
      d1 = d6;
      j = i;
      for (i3 = Math.min(i + 128 - 1, paramInt4 - 1) - i + 1; i3 > 0; i3--)
      {
        d3 = paramArrayOfDouble1[(j - 1 + paramInt2)] + d6;
        if ((d3 >= 0.0D ? 0 : 1) != 0) {
          k += 1;
        }
        d7 = d6 / d3;
        d6 = d7 * paramArrayOfDouble2[(j - 1 + paramInt3)] - paramDouble1;
        j += 1;
      }
      bool = Disnan.disnan(d6);
      if (bool)
      {
        k = 0;
        d6 = d1;
        j = i;
        for (i3 = Math.min(i + 128 - 1, paramInt4 - 1) - i + 1; i3 > 0; i3--)
        {
          d3 = paramArrayOfDouble1[(j - 1 + paramInt2)] + d6;
          if ((d3 >= 0.0D ? 0 : 1) != 0) {
            k += 1;
          }
          d7 = d6 / d3;
          if (Disnan.disnan(d7)) {
            d7 = 1.0D;
          }
          d6 = d7 * paramArrayOfDouble2[(j - 1 + paramInt3)] - paramDouble1;
          j += 1;
        }
      }
      n += k;
      i += 128;
    }
    d5 = paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)] - paramDouble1;
    i = paramInt1 - 1;
    for (i2 = (paramInt4 - (paramInt1 - 1) + -128) / -128; i2 > 0; i2--)
    {
      m = 0;
      d1 = d5;
      j = i;
      for (i3 = (Math.max(i - 128 + 1, paramInt4) - i + -1) / -1; i3 > 0; i3--)
      {
        d2 = paramArrayOfDouble2[(j - 1 + paramInt3)] + d5;
        if ((d2 >= 0.0D ? 0 : 1) != 0) {
          m += 1;
        }
        d7 = d5 / d2;
        d5 = d7 * paramArrayOfDouble1[(j - 1 + paramInt2)] - paramDouble1;
        j += -1;
      }
      bool = Disnan.disnan(d5);
      if (bool)
      {
        m = 0;
        d5 = d1;
        j = i;
        for (i3 = (Math.max(i - 128 + 1, paramInt4) - i + -1) / -1; i3 > 0; i3--)
        {
          d2 = paramArrayOfDouble2[(j - 1 + paramInt3)] + d5;
          if ((d2 >= 0.0D ? 0 : 1) != 0) {
            m += 1;
          }
          d7 = d5 / d2;
          if (Disnan.disnan(d7)) {
            d7 = 1.0D;
          }
          d5 = d7 * paramArrayOfDouble1[(j - 1 + paramInt2)] - paramDouble1;
          j += -1;
        }
      }
      n += m;
      i += -128;
    }
    d4 = d6 + paramDouble1 + d5;
    if ((d4 >= 0.0D ? 0 : 1) != 0) {
      n += 1;
    }
    i1 = n;
    return i1;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaneg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */