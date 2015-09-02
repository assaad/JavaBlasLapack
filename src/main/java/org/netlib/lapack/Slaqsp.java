package org.netlib.lapack;

import org.netlib.util.StringW;

public final class Slaqsp
{
  public static void slaqsp(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float paramFloat1, float paramFloat2, StringW paramStringW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    if ((paramInt1 > 0 ? 0 : 1) != 0)
    {
      paramStringW.val = "N";
      return;
    }
    f3 = Slamch.slamch("Safe minimum") / Slamch.slamch("Precision");
    f2 = 1.0F / f3;
    if ((paramFloat1 < 0.1F ? 0 : 1) != 0) {}
    if (((paramFloat2 < f3 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
    if (((paramFloat2 > f2 ? 0 : 1) != 0 ? 1 : 0) != 0)
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
          f1 = paramArrayOfFloat2[(j - 1 + paramInt3)];
          i = 1;
          for (n = j - 1 + 1; n > 0; n--)
          {
            paramArrayOfFloat1[(k + i - 1 - 1 + paramInt2)] = (f1 * paramArrayOfFloat2[(i - 1 + paramInt3)] * paramArrayOfFloat1[(k + i - 1 - 1 + paramInt2)]);
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
          f1 = paramArrayOfFloat2[(j - 1 + paramInt3)];
          i = j;
          for (n = paramInt1 - j + 1; n > 0; n--)
          {
            paramArrayOfFloat1[(k + i - j - 1 + paramInt2)] = (f1 * paramArrayOfFloat2[(i - 1 + paramInt3)] * paramArrayOfFloat1[(k + i - j - 1 + paramInt2)]);
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaqsp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */