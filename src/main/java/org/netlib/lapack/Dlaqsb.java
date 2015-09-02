package org.netlib.lapack;

import org.netlib.util.StringW;

public final class Dlaqsb
{
  public static void dlaqsb(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double paramDouble1, double paramDouble2, StringW paramStringW)
  {
    int i = 0;
    int j = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    if ((paramInt1 > 0 ? 0 : 1) != 0)
    {
      paramStringW.val = "N";
      return;
    }
    d3 = Dlamch.dlamch("Safe minimum") / Dlamch.dlamch("Precision");
    d2 = 1.0D / d3;
    if ((paramDouble1 < 0.1D ? 0 : 1) != 0) {}
    if (((paramDouble2 < d3 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
    if (((paramDouble2 > d2 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      paramStringW.val = "N";
    }
    else
    {
      int k;
      int m;
      if (Lsame.lsame(paramString, "U"))
      {
        j = 1;
        for (k = paramInt1 - 1 + 1; k > 0; k--)
        {
          d1 = paramArrayOfDouble2[(j - 1 + paramInt5)];
          i = Math.max(1, j - paramInt2);
          for (m = j - Math.max(1, j - paramInt2) + 1; m > 0; m--)
          {
            paramArrayOfDouble1[(paramInt2 + 1 + i - j - 1 + (j - 1) * paramInt4 + paramInt3)] = (d1 * paramArrayOfDouble2[(i - 1 + paramInt5)] * paramArrayOfDouble1[(paramInt2 + 1 + i - j - 1 + (j - 1) * paramInt4 + paramInt3)]);
            i += 1;
          }
          j += 1;
        }
      }
      else
      {
        j = 1;
        for (k = paramInt1 - 1 + 1; k > 0; k--)
        {
          d1 = paramArrayOfDouble2[(j - 1 + paramInt5)];
          i = j;
          for (m = Math.min(paramInt1, j + paramInt2) - j + 1; m > 0; m--)
          {
            paramArrayOfDouble1[(1 + i - j - 1 + (j - 1) * paramInt4 + paramInt3)] = (d1 * paramArrayOfDouble2[(i - 1 + paramInt5)] * paramArrayOfDouble1[(1 + i - j - 1 + (j - 1) * paramInt4 + paramInt3)]);
            i += 1;
          }
          j += 1;
        }
      }
      paramStringW.val = "Y";
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqsb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */