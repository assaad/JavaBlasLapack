package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Ddisna
{
  public static void ddisna(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    int j = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    int k = 0;
    int m = 0;
    int n = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
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
          j = (paramArrayOfDouble1[(m - 1 + paramInt3)] > paramArrayOfDouble1[(m + 1 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0;
        }
        if (i != 0)
        {
          if (i != 0) {}
          i = (paramArrayOfDouble1[(m - 1 + paramInt3)] < paramArrayOfDouble1[(m + 1 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0;
        }
        m += 1;
      }
      if (k != 0) {}
      if (((n <= 0 ? 0 : 1) != 0 ? 1 : 0) != 0)
      {
        if (j != 0)
        {
          if (j != 0) {}
          j = (0.0D > paramArrayOfDouble1[(1 - 1 + paramInt3)] ? 0 : 1) != 0 ? 1 : 0;
        }
        if (i != 0)
        {
          if (i != 0) {}
          i = (paramArrayOfDouble1[(n - 1 + paramInt3)] < 0.0D ? 0 : 1) != 0 ? 1 : 0;
        }
      }
      if ((((j == 0) && (i == 0) ? 0 : 1) ^ 0x1) != 0) {
        paramintW.val = -4;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DDISNA", -paramintW.val);
      return;
    }
    if ((n != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((n != 1 ? 0 : 1) != 0)
    {
      paramArrayOfDouble2[(1 - 1 + paramInt4)] = Dlamch.dlamch("O");
    }
    else
    {
      d4 = Math.abs(paramArrayOfDouble1[(2 - 1 + paramInt3)] - paramArrayOfDouble1[(1 - 1 + paramInt3)]);
      paramArrayOfDouble2[(1 - 1 + paramInt4)] = d4;
      m = 2;
      for (i1 = n - 1 - 2 + 1; i1 > 0; i1--)
      {
        d3 = Math.abs(paramArrayOfDouble1[(m + 1 - 1 + paramInt3)] - paramArrayOfDouble1[(m - 1 + paramInt3)]);
        paramArrayOfDouble2[(m - 1 + paramInt4)] = Math.min(d4, d3);
        d4 = d3;
        m += 1;
      }
      paramArrayOfDouble2[(n - 1 + paramInt4)] = d4;
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
          paramArrayOfDouble2[(1 - 1 + paramInt4)] = Math.min(paramArrayOfDouble2[(1 - 1 + paramInt4)], paramArrayOfDouble1[(1 - 1 + paramInt3)]);
        }
        if (i != 0) {
          paramArrayOfDouble2[(n - 1 + paramInt4)] = Math.min(paramArrayOfDouble2[(n - 1 + paramInt4)], paramArrayOfDouble1[(n - 1 + paramInt3)]);
        }
      }
    }
    d2 = Dlamch.dlamch("E");
    d5 = Dlamch.dlamch("S");
    d1 = Math.max(Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt3)]), Math.abs(paramArrayOfDouble1[(n - 1 + paramInt3)]));
    if ((d1 != 0.0D ? 0 : 1) != 0) {
      d6 = d2;
    } else {
      d6 = Math.max(d2 * d1, d5);
    }
    m = 1;
    for (int i1 = n - 1 + 1; i1 > 0; i1--)
    {
      paramArrayOfDouble2[(m - 1 + paramInt4)] = Math.max(paramArrayOfDouble2[(m - 1 + paramInt4)], d6);
      m += 1;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Ddisna.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */