package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dormr3
{
  public static void dormr3(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, int paramInt6, double[] paramArrayOfDouble2, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString1, "L");
    bool2 = Lsame.lsame(paramString2, "N");
    if (bool1) {
      i5 = paramInt1;
    } else {
      i5 = paramInt2;
    }
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "R") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "T") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else
    {
      if ((paramInt3 >= 0 ? 0 : 1) == 0) {}
      if (((paramInt3 <= i5 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
      }
      else
      {
        if ((paramInt4 >= 0 ? 0 : 1) == 0) {
          if (!bool1) {}
        }
        if ((((paramInt4 <= paramInt1 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) == 0) {
          if (!(bool1 ^ true)) {}
        }
        if ((((paramInt4 <= paramInt2 ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0) {
          paramintW.val = -6;
        } else if ((paramInt6 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
          paramintW.val = -8;
        } else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -11;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DORMR3", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if (((bool1) && ((bool2 ^ true)) ? 1 : 0) == 0) {}
    if (((((bool1 ^ true)) && (bool2) ? 1 : 0) == 0 ? 0 : 1) != 0)
    {
      j = 1;
      k = paramInt3;
      m = 1;
    }
    else
    {
      j = paramInt3;
      k = 1;
      m = -1;
    }
    if (bool1)
    {
      i4 = paramInt2;
      i1 = paramInt1 - paramInt4 + 1;
      i2 = 1;
    }
    else
    {
      i3 = paramInt1;
      i1 = paramInt2 - paramInt4 + 1;
      n = 1;
    }
    i = j;
    for (int i6 = (k - j + m) / m; i6 > 0; i6--)
    {
      if (bool1)
      {
        i3 = paramInt1 - i + 1;
        n = i;
      }
      else
      {
        i4 = paramInt2 - i + 1;
        i2 = i;
      }
      Dlarz.dlarz(paramString1, i3, i4, paramInt4, paramArrayOfDouble1, i - 1 + (i1 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2[(i - 1 + paramInt7)], paramArrayOfDouble3, n - 1 + (i2 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble4, paramInt10);
      i += m;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dormr3.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */