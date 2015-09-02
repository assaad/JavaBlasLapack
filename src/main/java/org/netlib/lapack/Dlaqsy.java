package org.netlib.lapack;

import org.netlib.util.StringW;

public final class Dlaqsy
{
  public static void dlaqsy(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double paramDouble1, double paramDouble2, StringW paramStringW)
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
          d1 = paramArrayOfDouble2[(j - 1 + paramInt4)];
          i = 1;
          for (m = j - 1 + 1; m > 0; m--)
          {
            paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt3 + paramInt2)] = (d1 * paramArrayOfDouble2[(i - 1 + paramInt4)] * paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]);
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
          d1 = paramArrayOfDouble2[(j - 1 + paramInt4)];
          i = j;
          for (m = paramInt1 - j + 1; m > 0; m--)
          {
            paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt3 + paramInt2)] = (d1 * paramArrayOfDouble2[(i - 1 + paramInt4)] * paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]);
            i += 1;
          }
          j += 1;
        }
      }
      paramStringW.val = "Y";
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqsy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */