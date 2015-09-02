package org.netlib.lapack;

import org.netlib.util.StringW;

public final class Slaqsb
{
  public static void slaqsb(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float paramFloat1, float paramFloat2, StringW paramStringW)
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
          f1 = paramArrayOfFloat2[(j - 1 + paramInt5)];
          i = Math.max(1, j - paramInt2);
          for (m = j - Math.max(1, j - paramInt2) + 1; m > 0; m--)
          {
            paramArrayOfFloat1[(paramInt2 + 1 + i - j - 1 + (j - 1) * paramInt4 + paramInt3)] = (f1 * paramArrayOfFloat2[(i - 1 + paramInt5)] * paramArrayOfFloat1[(paramInt2 + 1 + i - j - 1 + (j - 1) * paramInt4 + paramInt3)]);
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
          f1 = paramArrayOfFloat2[(j - 1 + paramInt5)];
          i = j;
          for (m = Math.min(paramInt1, j + paramInt2) - j + 1; m > 0; m--)
          {
            paramArrayOfFloat1[(1 + i - j - 1 + (j - 1) * paramInt4 + paramInt3)] = (f1 * paramArrayOfFloat2[(i - 1 + paramInt5)] * paramArrayOfFloat1[(1 + i - j - 1 + (j - 1) * paramInt4 + paramInt3)]);
            i += 1;
          }
          j += 1;
        }
      }
      paramStringW.val = "Y";
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaqsb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */