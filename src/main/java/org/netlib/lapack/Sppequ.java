package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sppequ
{
  public static void sppequ(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, floatW paramfloatW1, floatW paramfloatW2, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    float f = 0.0F;
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPPEQU", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      paramfloatW1.val = 1.0F;
      paramfloatW2.val = 0.0F;
      return;
    }
    paramArrayOfFloat2[(1 - 1 + paramInt3)] = paramArrayOfFloat1[(1 - 1 + paramInt2)];
    f = paramArrayOfFloat2[(1 - 1 + paramInt3)];
    paramfloatW2.val = paramArrayOfFloat2[(1 - 1 + paramInt3)];
    int k;
    if (bool)
    {
      j = 1;
      i = 2;
      for (k = paramInt1 - 2 + 1; k > 0; k--)
      {
        j += i;
        paramArrayOfFloat2[(i - 1 + paramInt3)] = paramArrayOfFloat1[(j - 1 + paramInt2)];
        f = Math.min(f, paramArrayOfFloat2[(i - 1 + paramInt3)]);
        paramfloatW2.val = Math.max(paramfloatW2.val, paramArrayOfFloat2[(i - 1 + paramInt3)]);
        i += 1;
      }
    }
    else
    {
      j = 1;
      i = 2;
      for (k = paramInt1 - 2 + 1; k > 0; k--)
      {
        j = j + paramInt1 - i + 2;
        paramArrayOfFloat2[(i - 1 + paramInt3)] = paramArrayOfFloat1[(j - 1 + paramInt2)];
        f = Math.min(f, paramArrayOfFloat2[(i - 1 + paramInt3)]);
        paramfloatW2.val = Math.max(paramfloatW2.val, paramArrayOfFloat2[(i - 1 + paramInt3)]);
        i += 1;
      }
    }
    if ((f > 0.0F ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        if ((paramArrayOfFloat2[(i - 1 + paramInt3)] > 0.0F ? 0 : 1) != 0)
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
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat2[(i - 1 + paramInt3)] = (1.0F / (float)Math.sqrt(paramArrayOfFloat2[(i - 1 + paramInt3)]));
        i += 1;
      }
      paramfloatW1.val = ((float)Math.sqrt(f) / (float)Math.sqrt(paramfloatW2.val));
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sppequ.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */