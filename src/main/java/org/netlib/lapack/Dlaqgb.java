package org.netlib.lapack;

import org.netlib.util.StringW;

public final class Dlaqgb
{
  public static void dlaqgb(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, int paramInt6, double[] paramArrayOfDouble2, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, double paramDouble1, double paramDouble2, double paramDouble3, StringW paramStringW)
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
          d1 = paramArrayOfDouble3[(j - 1 + paramInt8)];
          i = Math.max(1, j - paramInt4);
          for (m = Math.min(paramInt1, j + paramInt3) - Math.max(1, j - paramInt4) + 1; m > 0; m--)
          {
            paramArrayOfDouble1[(paramInt4 + 1 + i - j - 1 + (j - 1) * paramInt6 + paramInt5)] = (d1 * paramArrayOfDouble1[(paramInt4 + 1 + i - j - 1 + (j - 1) * paramInt6 + paramInt5)]);
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
        i = Math.max(1, j - paramInt4);
        for (m = Math.min(paramInt1, j + paramInt3) - Math.max(1, j - paramInt4) + 1; m > 0; m--)
        {
          paramArrayOfDouble1[(paramInt4 + 1 + i - j - 1 + (j - 1) * paramInt6 + paramInt5)] = (paramArrayOfDouble2[(i - 1 + paramInt7)] * paramArrayOfDouble1[(paramInt4 + 1 + i - j - 1 + (j - 1) * paramInt6 + paramInt5)]);
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
        d1 = paramArrayOfDouble3[(j - 1 + paramInt8)];
        i = Math.max(1, j - paramInt4);
        for (m = Math.min(paramInt1, j + paramInt3) - Math.max(1, j - paramInt4) + 1; m > 0; m--)
        {
          paramArrayOfDouble1[(paramInt4 + 1 + i - j - 1 + (j - 1) * paramInt6 + paramInt5)] = (d1 * paramArrayOfDouble2[(i - 1 + paramInt7)] * paramArrayOfDouble1[(paramInt4 + 1 + i - j - 1 + (j - 1) * paramInt6 + paramInt5)]);
          i += 1;
        }
        j += 1;
      }
      paramStringW.val = "B";
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqgb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */