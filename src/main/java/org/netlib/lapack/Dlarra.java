package org.netlib.lapack;

import org.netlib.util.intW;

public final class Dlarra
{
  public static void dlarra(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double[] paramArrayOfDouble3, int paramInt4, double paramDouble1, double paramDouble2, intW paramintW1, int[] paramArrayOfInt, int paramInt5, intW paramintW2)
  {
    int i = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    paramintW2.val = 0;
    paramintW1.val = 1;
    int j;
    if ((paramDouble1 >= 0.0D ? 0 : 1) != 0)
    {
      d2 = Math.abs(paramDouble1) * paramDouble2;
      i = 1;
      for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
      {
        d1 = Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]);
        if ((d1 > d2 ? 0 : 1) != 0)
        {
          paramArrayOfDouble2[(i - 1 + paramInt3)] = 0.0D;
          paramArrayOfDouble3[(i - 1 + paramInt4)] = 0.0D;
          paramArrayOfInt[(paramintW1.val - 1 + paramInt5)] = i;
          paramintW1.val += 1;
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
      {
        d1 = Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]);
        if ((d1 > paramDouble1 * Math.sqrt(Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)])) * Math.sqrt(Math.abs(paramArrayOfDouble1[(i + 1 - 1 + paramInt2)])) ? 0 : 1) != 0)
        {
          paramArrayOfDouble2[(i - 1 + paramInt3)] = 0.0D;
          paramArrayOfDouble3[(i - 1 + paramInt4)] = 0.0D;
          paramArrayOfInt[(paramintW1.val - 1 + paramInt5)] = i;
          paramintW1.val += 1;
        }
        i += 1;
      }
    }
    paramArrayOfInt[(paramintW1.val - 1 + paramInt5)] = paramInt1;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarra.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */