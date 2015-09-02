package org.netlib.lapack;

import org.netlib.util.StringW;

public final class Slaqsy
{
  public static void slaqsy(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float paramFloat1, float paramFloat2, StringW paramStringW)
  {
    int i = 0;
    int j = 0;
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
      int k;
      int m;
      if (Lsame.lsame(paramString, "U"))
      {
        j = 1;
        for (k = paramInt1 - 1 + 1; k > 0; k--)
        {
          f1 = paramArrayOfFloat2[(j - 1 + paramInt4)];
          i = 1;
          for (m = j - 1 + 1; m > 0; m--)
          {
            paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt3 + paramInt2)] = (f1 * paramArrayOfFloat2[(i - 1 + paramInt4)] * paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]);
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
          f1 = paramArrayOfFloat2[(j - 1 + paramInt4)];
          i = j;
          for (m = paramInt1 - j + 1; m > 0; m--)
          {
            paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt3 + paramInt2)] = (f1 * paramArrayOfFloat2[(i - 1 + paramInt4)] * paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]);
            i += 1;
          }
          j += 1;
        }
      }
      paramStringW.val = "Y";
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaqsy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */