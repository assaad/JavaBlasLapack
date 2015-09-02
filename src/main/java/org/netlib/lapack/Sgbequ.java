package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgbequ
{
  public static void sgbequ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, int paramInt6, float[] paramArrayOfFloat2, int paramInt7, float[] paramArrayOfFloat3, int paramInt8, floatW paramfloatW1, floatW paramfloatW2, floatW paramfloatW3, intW paramintW)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt4 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt6 >= paramInt3 + paramInt4 + 1 ? 0 : 1) != 0) {
      paramintW.val = -6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGBEQU", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramfloatW1.val = 1.0F;
      paramfloatW2.val = 1.0F;
      paramfloatW3.val = 0.0F;
      return;
    }
    f4 = Slamch.slamch("S");
    f1 = 1.0F / f4;
    i = 1;
    for (int m = paramInt1 - 1 + 1; m > 0; m--)
    {
      paramArrayOfFloat2[(i - 1 + paramInt7)] = 0.0F;
      i += 1;
    }
    k = paramInt4 + 1;
    j = 1;
    int n;
    for (m = paramInt2 - 1 + 1; m > 0; m--)
    {
      i = Math.max(j - paramInt4, 1);
      for (n = Math.min(j + paramInt3, paramInt1) - Math.max(j - paramInt4, 1) + 1; n > 0; n--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt7)] = Math.max(paramArrayOfFloat2[(i - 1 + paramInt7)], Math.abs(paramArrayOfFloat1[(k + i - j - 1 + (j - 1) * paramInt6 + paramInt5)]));
        i += 1;
      }
      j += 1;
    }
    f3 = f1;
    f2 = 0.0F;
    i = 1;
    for (m = paramInt1 - 1 + 1; m > 0; m--)
    {
      f2 = Math.max(f2, paramArrayOfFloat2[(i - 1 + paramInt7)]);
      f3 = Math.min(f3, paramArrayOfFloat2[(i - 1 + paramInt7)]);
      i += 1;
    }
    paramfloatW3.val = f2;
    if ((f3 != 0.0F ? 0 : 1) != 0)
    {
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        if ((paramArrayOfFloat2[(i - 1 + paramInt7)] != 0.0F ? 0 : 1) != 0)
        {
          paramintW.val = i;
          return;
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (m = paramInt1 - 1 + 1; m > 0; m--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt7)] = (1.0F / Math.min(Math.max(paramArrayOfFloat2[(i - 1 + paramInt7)], f4), f1));
        i += 1;
      }
      paramfloatW1.val = (Math.max(f3, f4) / Math.min(f2, f1));
    }
    j = 1;
    for (m = paramInt2 - 1 + 1; m > 0; m--)
    {
      paramArrayOfFloat3[(j - 1 + paramInt8)] = 0.0F;
      j += 1;
    }
    k = paramInt4 + 1;
    j = 1;
    for (m = paramInt2 - 1 + 1; m > 0; m--)
    {
      i = Math.max(j - paramInt4, 1);
      for (n = Math.min(j + paramInt3, paramInt1) - Math.max(j - paramInt4, 1) + 1; n > 0; n--)
      {
        paramArrayOfFloat3[(j - 1 + paramInt8)] = Math.max(paramArrayOfFloat3[(j - 1 + paramInt8)], Math.abs(paramArrayOfFloat1[(k + i - j - 1 + (j - 1) * paramInt6 + paramInt5)]) * paramArrayOfFloat2[(i - 1 + paramInt7)]);
        i += 1;
      }
      j += 1;
    }
    f3 = f1;
    f2 = 0.0F;
    j = 1;
    for (m = paramInt2 - 1 + 1; m > 0; m--)
    {
      f3 = Math.min(f3, paramArrayOfFloat3[(j - 1 + paramInt8)]);
      f2 = Math.max(f2, paramArrayOfFloat3[(j - 1 + paramInt8)]);
      j += 1;
    }
    if ((f3 != 0.0F ? 0 : 1) != 0)
    {
      j = 1;
      for (m = paramInt2 - 1 + 1; m > 0; m--)
      {
        if ((paramArrayOfFloat3[(j - 1 + paramInt8)] != 0.0F ? 0 : 1) != 0)
        {
          paramintW.val = (paramInt1 + j);
          return;
        }
        j += 1;
      }
    }
    else
    {
      j = 1;
      for (m = paramInt2 - 1 + 1; m > 0; m--)
      {
        paramArrayOfFloat3[(j - 1 + paramInt8)] = (1.0F / Math.min(Math.max(paramArrayOfFloat3[(j - 1 + paramInt8)], f4), f1));
        j += 1;
      }
      paramfloatW2.val = (Math.max(f3, f4) / Math.min(f2, f1));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgbequ.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */