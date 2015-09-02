package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dormqr
{
  public static void dormqr(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, double[] paramArrayOfDouble3, int paramInt7, int paramInt8, double[] paramArrayOfDouble4, int paramInt9, int paramInt10, intW paramintW)
  {
    boolean bool1 = false;
    int i = 0;
    boolean bool2 = false;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    intW localintW = new intW(0);
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    double[] arrayOfDouble = new double[65 * 64];
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString1, "L");
    bool2 = Lsame.lsame(paramString2, "N");
    i = paramInt10 != -1 ? 0 : 1;
    if (bool1)
    {
      i11 = paramInt1;
      i12 = paramInt2;
    }
    else
    {
      i11 = paramInt2;
      i12 = paramInt1;
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
      if (((paramInt3 <= i11 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -5;
      }
      else if ((paramInt5 >= Math.max(1, i11) ? 0 : 1) != 0)
      {
        paramintW.val = -7;
      }
      else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0)
      {
        paramintW.val = -10;
      }
      else
      {
        if ((paramInt10 >= Math.max(1, i12) ? 0 : 1) != 0) {}
        if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
          paramintW.val = -12;
        }
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      i8 = Math.min(64, Ilaenv.ilaenv(1, "DORMQR", paramString1 + paramString2, paramInt1, paramInt2, paramInt3, -1));
      i6 = Math.max(1, i12) * i8;
      paramArrayOfDouble4[(1 - 1 + paramInt9)] = i6;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DORMQR", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) == 0) {}
    if (((paramInt3 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble4[(1 - 1 + paramInt9)] = 1;
      return;
    }
    i9 = 2;
    i5 = i12;
    if ((i8 <= 1 ? 0 : 1) != 0) {}
    if (((i8 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i3 = i12 * i8;
      if ((paramInt10 >= i3 ? 0 : 1) != 0)
      {
        i8 = paramInt10 / i5;
        i9 = Math.max(2, Ilaenv.ilaenv(2, "DORMQR", paramString1 + paramString2, paramInt1, paramInt2, paramInt3, -1));
      }
    }
    else
    {
      i3 = i12;
    }
    if ((i8 >= i9 ? 0 : 1) == 0) {}
    if (((i8 < paramInt3 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Dorm2r.dorm2r(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramArrayOfDouble1, paramInt4, paramInt5, paramArrayOfDouble2, paramInt6, paramArrayOfDouble3, paramInt7, paramInt8, paramArrayOfDouble4, paramInt9, localintW);
    }
    else
    {
      if (((bool1) && ((bool2 ^ true)) ? 1 : 0) == 0) {}
      if (((((bool1 ^ true)) && (bool2) ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        k = 1;
        m = paramInt3;
        n = i8;
      }
      else
      {
        k = (paramInt3 - 1) / i8 * i8 + 1;
        m = 1;
        n = -i8;
      }
      if (bool1)
      {
        i10 = paramInt2;
        i4 = 1;
      }
      else
      {
        i7 = paramInt1;
        i2 = 1;
      }
      j = k;
      for (int i13 = (m - k + n) / n; i13 > 0; i13--)
      {
        i1 = Math.min(i8, paramInt3 - j + 1);
        Dlarft.dlarft("Forward", "Columnwise", i11 - j + 1, i1, paramArrayOfDouble1, j - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfDouble2, j - 1 + paramInt6, arrayOfDouble, 0, 65);
        if (bool1)
        {
          i7 = paramInt1 - j + 1;
          i2 = j;
        }
        else
        {
          i10 = paramInt2 - j + 1;
          i4 = j;
        }
        Dlarfb.dlarfb(paramString1, paramString2, "Forward", "Columnwise", i7, i10, i1, paramArrayOfDouble1, j - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, arrayOfDouble, 0, 65, paramArrayOfDouble3, i2 - 1 + (i4 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfDouble4, paramInt9, i5);
        j += n;
      }
    }
    paramArrayOfDouble4[(1 - 1 + paramInt9)] = i6;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dormqr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */