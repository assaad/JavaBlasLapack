package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sdisna
{
  public static void sdisna(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    int j = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    int k = 0;
    int m = 0;
    int n = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString, "E");
    bool2 = Lsame.lsame(paramString, "L");
    bool3 = Lsame.lsame(paramString, "R");
    k = (!bool2) && (!bool3) ? 0 : 1;
    if (bool1) {
      n = paramInt1;
    } else if (k != 0) {
      n = Math.min(paramInt1, paramInt2);
    }
    if ((((bool1 ^ true)) && ((k ^ 0x1) != 0) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -2;
    }
    else if ((n >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else
    {
      j = 1;
      i = 1;
      m = 1;
      for (i1 = n - 1 - 1 + 1; i1 > 0; i1--)
      {
        if (j != 0)
        {
          if (j != 0) {}
          j = (paramArrayOfFloat1[(m - 1 + paramInt3)] > paramArrayOfFloat1[(m + 1 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0;
        }
        if (i != 0)
        {
          if (i != 0) {}
          i = (paramArrayOfFloat1[(m - 1 + paramInt3)] < paramArrayOfFloat1[(m + 1 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0;
        }
        m += 1;
      }
      if (k != 0) {}
      if (((n <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        if (j != 0)
        {
          if (j != 0) {}
          j = (0.0F > paramArrayOfFloat1[(1 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0;
        }
        if (i != 0)
        {
          if (i != 0) {}
          i = (paramArrayOfFloat1[(n - 1 + paramInt3)] < 0.0F ? 0 : 1) != 0 ? 1 : 0;
        }
      }
      if ((((j == 0) && (i == 0) ? 0 : 1) ^ 0x1) != 0) {
        paramintW.val = -4;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SDISNA", -paramintW.val);
      return;
    }
    if ((n != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((n != 1 ? 0 : 1) != 0)
    {
      paramArrayOfFloat2[(1 - 1 + paramInt4)] = Slamch.slamch("O");
    }
    else
    {
      f4 = Math.abs(paramArrayOfFloat1[(2 - 1 + paramInt3)] - paramArrayOfFloat1[(1 - 1 + paramInt3)]);
      paramArrayOfFloat2[(1 - 1 + paramInt4)] = f4;
      m = 2;
      for (i1 = n - 1 - 2 + 1; i1 > 0; i1--)
      {
        f3 = Math.abs(paramArrayOfFloat1[(m + 1 - 1 + paramInt3)] - paramArrayOfFloat1[(m - 1 + paramInt3)]);
        paramArrayOfFloat2[(m - 1 + paramInt4)] = Math.min(f4, f3);
        f4 = f3;
        m += 1;
      }
      paramArrayOfFloat2[(n - 1 + paramInt4)] = f4;
    }
    if (k != 0)
    {
      if (bool2) {}
      if (((paramInt1 <= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0) {
        if (!bool3) {}
      }
      if ((((paramInt1 >= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        if (j != 0) {
          paramArrayOfFloat2[(1 - 1 + paramInt4)] = Math.min(paramArrayOfFloat2[(1 - 1 + paramInt4)], paramArrayOfFloat1[(1 - 1 + paramInt3)]);
        }
        if (i != 0) {
          paramArrayOfFloat2[(n - 1 + paramInt4)] = Math.min(paramArrayOfFloat2[(n - 1 + paramInt4)], paramArrayOfFloat1[(n - 1 + paramInt3)]);
        }
      }
    }
    f2 = Slamch.slamch("E");
    f5 = Slamch.slamch("S");
    f1 = Math.max(Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt3)]), Math.abs(paramArrayOfFloat1[(n - 1 + paramInt3)]));
    if ((f1 != 0.0F ? 0 : 1) != 0) {
      f6 = f2;
    } else {
      f6 = Math.max(f2 * f1, f5);
    }
    m = 1;
    for (int i1 = n - 1 + 1; i1 > 0; i1--)
    {
      paramArrayOfFloat2[(m - 1 + paramInt4)] = Math.max(paramArrayOfFloat2[(m - 1 + paramInt4)], f6);
      m += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sdisna.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */