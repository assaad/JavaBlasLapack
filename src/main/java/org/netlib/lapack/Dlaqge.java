package org.netlib.lapack;

import org.netlib.util.StringW;

public final class Dlaqge
{
  public static void dlaqge(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double paramDouble1, double paramDouble2, double paramDouble3, StringW paramStringW)
  {
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    if ((paramInt1 > 0 ? 0 : 1) == 0) {}
    if (((paramInt2 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramStringW.val = "N";
      return;
    }
    d3 = Dlamch.dlamch("Safe minimum") / Dlamch.dlamch("Precision");
    d2 = 1.0D / d3;
    if ((paramDouble1 < 0.1D ? 0 : 1) != 0) {}
    if (((paramDouble3 < d3 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
    int k;
    int m;
    if (((paramDouble3 > d2 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      if ((paramDouble2 < 0.1D ? 0 : 1) != 0)
      {
        paramStringW.val = "N";
      }
      else
      {
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          d1 = paramArrayOfDouble3[(j - 1 + paramInt6)];
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = (d1 * paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
            i += 1;
          }
          j += 1;
        }
        paramStringW.val = "C";
      }
    }
    else if ((paramDouble2 < 0.1D ? 0 : 1) != 0)
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = (paramArrayOfDouble2[(i - 1 + paramInt5)] * paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
          i += 1;
        }
        j += 1;
      }
      paramStringW.val = "R";
    }
    else
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        d1 = paramArrayOfDouble3[(j - 1 + paramInt6)];
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = (d1 * paramArrayOfDouble2[(i - 1 + paramInt5)] * paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
          i += 1;
        }
        j += 1;
      }
      paramStringW.val = "B";
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqge.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */