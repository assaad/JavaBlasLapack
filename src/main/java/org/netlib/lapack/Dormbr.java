package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dormbr
{
  public static void dormbr(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, intW paramintW)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    boolean bool3 = false;
    String str = new String(" ");
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
    bool1 = Lsame.lsame(paramString1, "Q");
    bool2 = Lsame.lsame(paramString2, "L");
    bool3 = Lsame.lsame(paramString3, "N");
    i = paramInt10 != -1 ? 0 : 1;
    if (bool2)
    {
      i3 = paramInt1;
      i4 = paramInt2;
    }
    else
    {
      i3 = paramInt2;
      i4 = paramInt1;
    }
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "P") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -1;
    }
    else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString2, "R") ^ true)) ? 1 : 0) != 0)
    {
      paramintW.val = -2;
    }
    else if ((((bool3 ^ true)) && ((Lsame.lsame(paramString3, "T") ^ true)) ? 1 : 0) != 0)
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
    else if ((paramInt3 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -6;
    }
    else
    {
      if (bool1) {}
      if (((paramInt5 >= Math.max(1, i3) ? 0 : 1) != 0 ? 1 : 0) == 0) {
        if (!(bool1 ^ true)) {}
      }
      if ((((paramInt5 >= Math.max(1, Math.min(i3, paramInt3)) ? 0 : 1) != 0 ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -8;
      }
      else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -11;
      }
      else
      {
        if ((paramInt10 >= Math.max(1, i4) ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -13;
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if (bool1)
      {
        if (bool2) {
          i1 = Ilaenv.ilaenv(1, "DORMQR", paramString2 + paramString3, paramInt1 - 1, paramInt2, paramInt1 - 1, -1);
        } else {
          i1 = Ilaenv.ilaenv(1, "DORMQR", paramString2 + paramString3, paramInt1, paramInt2 - 1, paramInt2 - 1, -1);
        }
      }
      else if (bool2) {
        i1 = Ilaenv.ilaenv(1, "DORMLQ", paramString2 + paramString3, paramInt1 - 1, paramInt2, paramInt1 - 1, -1);
      } else {
        i1 = Ilaenv.ilaenv(1, "DORMLQ", paramString2 + paramString3, paramInt1, paramInt2 - 1, paramInt2 - 1, -1);
      }
      m = Math.max(1, i4) * i1;
      paramArrayOfDouble4[(1 - 1 + paramInt9)] = m;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DORMBR", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    paramArrayOfDouble4[(1 - 1 + paramInt9)] = 1;
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    if (bool1)
    {
      if ((i3 < paramInt3 ? 0 : 1) != 0)
      {
        Dormqr.dormqr(paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, paramInt9, paramInt10, localintW);
      }
      else if ((i3 <= 1 ? 0 : 1) != 0)
      {
        if (bool2)
        {
          n = paramInt1 - 1;
          i2 = paramInt2;
          j = 2;
          k = 1;
        }
        else
        {
          n = paramInt1;
          i2 = paramInt2 - 1;
          j = 1;
          k = 2;
        }
        Dormqr.dormqr(paramString2, paramString3, n, i2, i3 - 1, paramArrayOfDouble1, 2 - 1 + (1 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, j - 1 + (k - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble4, paramInt9, paramInt10, localintW);
      }
    }
    else
    {
      if (bool3) {
        str = "T";
      } else {
        str = "N";
      }
      if ((i3 <= paramInt3 ? 0 : 1) != 0)
      {
        Dormlq.dormlq(paramString2, str, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, paramInt9, paramInt10, localintW);
      }
      else if ((i3 <= 1 ? 0 : 1) != 0)
      {
        if (bool2)
        {
          n = paramInt1 - 1;
          i2 = paramInt2;
          j = 2;
          k = 1;
        }
        else
        {
          n = paramInt1;
          i2 = paramInt2 - 1;
          j = 1;
          k = 2;
        }
        Dormlq.dormlq(paramString2, str, n, i2, i3 - 1, paramArrayOfDouble1, 1 - 1 + (2 - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, j - 1 + (k - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble4, paramInt9, paramInt10, localintW);
      }
    }
    paramArrayOfDouble4[(1 - 1 + paramInt9)] = m;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dormbr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */