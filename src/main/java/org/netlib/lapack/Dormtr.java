package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dormtr
{
  public static void dormtr(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, int paramInt7, double[] paramArrayOfDouble4, int paramInt8, int paramInt9, intW paramintW)
  {
    boolean bool1 = false;
    int i = 0;
    boolean bool2 = false;
    int j = 0;
    int k = 0;
    intW localintW = new intW(0);
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString1, "L");
    bool2 = Lsame.lsame(paramString2, "U");
    i = paramInt9 != -1 ? 0 : 1;
    if (bool1)
    {
      i3 = paramInt1;
      i4 = paramInt2;
    }
    else
    {
      i3 = paramInt2;
      i4 = paramInt1;
    }
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "R") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((((Lsame.lsame(paramString3, "N") ^ true)) && ((Lsame.lsame(paramString3, "T") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -3;
    }
    else if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -4;
    }
    else if ((paramInt2 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -5;
    }
    else if ((paramInt4 >= Math.max(1, i3) ? 0 : 1) != 0)
    {
      paramintW.val = -7;
    }
    else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
    {
      paramintW.val = -10;
    }
    else
    {
      if ((paramInt9 >= Math.max(1, i4) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -12;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if (bool2)
      {
        if (bool1) {
          i1 = Ilaenv.ilaenv(1, "DORMQL", paramString1 + paramString3, paramInt1 - 1, paramInt2, paramInt1 - 1, -1);
        } else {
          i1 = Ilaenv.ilaenv(1, "DORMQL", paramString1 + paramString3, paramInt1, paramInt2 - 1, paramInt2 - 1, -1);
        }
      }
      else if (bool1) {
        i1 = Ilaenv.ilaenv(1, "DORMQR", paramString1 + paramString3, paramInt1 - 1, paramInt2, paramInt1 - 1, -1);
      } else {
        i1 = Ilaenv.ilaenv(1, "DORMQR", paramString1 + paramString3, paramInt1, paramInt2 - 1, paramInt2 - 1, -1);
      }
      m = Math.max(1, i4) * i1;
      paramArrayOfDouble4[(1 - 1 + paramInt8)] = m;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DORMTR", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((i3 != 1 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble4[(1 - 1 + paramInt8)] = 1;
      return;
    }
    if (bool1)
    {
      n = paramInt1 - 1;
      i2 = paramInt2;
    }
    else
    {
      n = paramInt1;
      i2 = paramInt2 - 1;
    }
    if (bool2)
    {
      Dormql.dormql(paramString1, paramString3, n, i2, i3 - 1, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble3, paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, localintW);
    }
    else
    {
      if (bool1)
      {
        j = 2;
        k = 1;
      }
      else
      {
        j = 1;
        k = 2;
      }
      Dormqr.dormqr(paramString1, paramString3, n, i2, i3 - 1, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfDouble2, paramInt5, paramArrayOfDouble3, j - 1 + (k - 1) * paramInt7 + paramInt6, paramInt7, paramArrayOfDouble4, paramInt8, paramInt9, localintW);
    }
    paramArrayOfDouble4[(1 - 1 + paramInt8)] = m;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dormtr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */