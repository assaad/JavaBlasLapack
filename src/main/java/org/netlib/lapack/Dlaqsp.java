package org.netlib.lapack;

import org.netlib.util.StringW;

public final class Dlaqsp
{
  public static void dlaqsp(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, double paramDouble1, double paramDouble2, StringW paramStringW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
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
      int m;
      int n;
      if (Lsame.lsame(paramString, "U"))
      {
        k = 1;
        j = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          d1 = paramArrayOfDouble2[(j - 1 + paramInt3)];
          i = 1;
          for (n = j - 1 + 1; n > 0; n--)
          {
            paramArrayOfDouble1[(k + i - 1 - 1 + paramInt2)] = (d1 * paramArrayOfDouble2[(i - 1 + paramInt3)] * paramArrayOfDouble1[(k + i - 1 - 1 + paramInt2)]);
            i += 1;
          }
          k += j;
          j += 1;
        }
      }
      else
      {
        k = 1;
        j = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          d1 = paramArrayOfDouble2[(j - 1 + paramInt3)];
          i = j;
          for (n = paramInt1 - j + 1; n > 0; n--)
          {
            paramArrayOfDouble1[(k + i - j - 1 + paramInt2)] = (d1 * paramArrayOfDouble2[(i - 1 + paramInt3)] * paramArrayOfDouble1[(k + i - j - 1 + paramInt2)]);
            i += 1;
          }
          k = k + paramInt1 - j + 1;
          j += 1;
        }
      }
      paramStringW.val = "Y";
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaqsp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */