package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dormr2
{
  public static void dormr2(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, intW paramintW)
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
    double d = 0.0D;
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString1, "L");
    bool2 = Lsame.lsame(paramString2, "N");
    if (bool1) {
      i2 = paramInt1;
    } else {
      i2 = paramInt2;
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
      if (((paramInt3 <= i2 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -5;
      } else if ((paramInt5 >= Math.max(1, paramInt3) ? 0 : 1) != 0) {
        paramintW.val = -7;
      } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -10;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DORMR2", -paramintW.val);
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
    if (bool1) {
      i1 = paramInt2;
    } else {
      n = paramInt1;
    }
    i = j;
    for (int i3 = (k - j + m) / m; i3 > 0; i3--)
    {
      if (bool1) {
        n = paramInt1 - paramInt3 + i;
      } else {
        i1 = paramInt2 - paramInt3 + i;
      }
      d = paramArrayOfDouble1[(i - 1 + (i2 - paramInt3 + i - 1) * paramInt5 + paramInt4)];
      paramArrayOfDouble1[(i - 1 + (i2 - paramInt3 + i - 1) * paramInt5 + paramInt4)] = 1.0D;
      Dlarf.dlarf(paramString1, n, i1, paramArrayOfDouble1, i - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2[(i - 1 + paramInt6)], paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, paramInt9);
      paramArrayOfDouble1[(i - 1 + (i2 - paramInt3 + i - 1) * paramInt5 + paramInt4)] = d;
      i += m;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dormr2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */