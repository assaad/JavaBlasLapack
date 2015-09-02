package org.netlib.lapack;

import org.netlib.util.StringW;

public final class Slaqge
{
  public static void slaqge(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float paramFloat1, float paramFloat2, float paramFloat3, StringW paramStringW)
  {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    if ((paramInt1 > 0 ? 0 : 1) == 0) {}
    if (((paramInt2 > 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramStringW.val = "N";
      return;
    }
    f3 = Slamch.slamch("Safe minimum") / Slamch.slamch("Precision");
    f2 = 1.0F / f3;
    if ((paramFloat1 < 0.1F ? 0 : 1) != 0) {}
    if (((paramFloat3 < f3 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
    int k;
    int m;
    if (((paramFloat3 > f2 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      if ((paramFloat2 < 0.1F ? 0 : 1) != 0)
      {
        paramStringW.val = "N";
      }
      else
      {
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          f1 = paramArrayOfFloat3[(j - 1 + paramInt6)];
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = (f1 * paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
            i += 1;
          }
          j += 1;
        }
        paramStringW.val = "C";
      }
    }
    else if ((paramFloat2 < 0.1F ? 0 : 1) != 0)
    {
      j = 1;
      for (k = paramInt2 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = (paramArrayOfFloat2[(i - 1 + paramInt5)] * paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
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
        f1 = paramArrayOfFloat3[(j - 1 + paramInt6)];
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)] = (f1 * paramArrayOfFloat2[(i - 1 + paramInt5)] * paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
          i += 1;
        }
        j += 1;
      }
      paramStringW.val = "B";
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaqge.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */