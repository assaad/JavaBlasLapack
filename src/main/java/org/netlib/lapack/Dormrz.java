package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dormrz
{
  public static void dormrz(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, int paramInt5, int paramInt6, double[] paramArrayOfDouble2, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, int paramInt11, intW paramintW)
  {
    boolean bool1 = false;
    int i = 0;
    boolean bool2 = false;
    String str = new String(" ");
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
    int i13 = 0;
    double[] arrayOfDouble = new double[65 * 64];
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString1, "L");
    bool2 = Lsame.lsame(paramString2, "N");
    i = paramInt11 != -1 ? 0 : 1;
    if (bool1)
    {
      i12 = paramInt1;
      i13 = Math.max(1, paramInt2);
    }
    else
    {
      i12 = paramInt2;
      i13 = Math.max(1, paramInt1);
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
      if (((paramInt3 <= i12 ? 0 : 1) == 0 ? 0 : 1) != 0)
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
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) == 0) {}
      if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i7 = 1;
      }
      else
      {
        i9 = Math.min(64, Ilaenv.ilaenv(1, "DORMRQ", paramString1 + paramString2, paramInt1, paramInt2, paramInt3, -1));
        i7 = i13 * i9;
      }
      paramArrayOfDouble4[(1 - 1 + paramInt10)] = i7;
      if ((paramInt11 >= Math.max(1, i13) ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -13;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DORMRZ", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      paramArrayOfDouble4[(1 - 1 + paramInt10)] = 1;
      return;
    }
    i10 = 2;
    i6 = i13;
    if ((i9 <= 1 ? 0 : 1) != 0) {}
    if (((i9 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i3 = i13 * i9;
      if ((paramInt11 >= i3 ? 0 : 1) != 0)
      {
        i9 = paramInt11 / i6;
        i10 = Math.max(2, Ilaenv.ilaenv(2, "DORMRQ", paramString1 + paramString2, paramInt1, paramInt2, paramInt3, -1));
      }
    }
    else
    {
      i3 = i13;
    }
    if ((i9 >= i10 ? 0 : 1) == 0) {}
    if (((i9 < paramInt3 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Dormr3.dormr3(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfDouble1, paramInt5, paramInt6, paramArrayOfDouble2, paramInt7, paramArrayOfDouble3, paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, localintW);
    }
    else
    {
      if (((bool1) && ((bool2 ^ true)) ? 1 : 0) == 0) {}
      if (((((bool1 ^ true)) && (bool2) ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        k = 1;
        m = paramInt3;
        n = i9;
      }
      else
      {
        k = (paramInt3 - 1) / i9 * i9 + 1;
        m = 1;
        n = -i9;
      }
      if (bool1)
      {
        i11 = paramInt2;
        i5 = 1;
        i4 = paramInt1 - paramInt4 + 1;
      }
      else
      {
        i8 = paramInt1;
        i2 = 1;
        i4 = paramInt2 - paramInt4 + 1;
      }
      if (bool2) {
        str = "T";
      } else {
        str = "N";
      }
      j = k;
      for (int i14 = (m - k + n) / n; i14 > 0; i14--)
      {
        i1 = Math.min(i9, paramInt3 - j + 1);
        Dlarzt.dlarzt("Backward", "Rowwise", paramInt4, i1, paramArrayOfDouble1, j - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfDouble2, j - 1 + paramInt7, arrayOfDouble, 0, 65);
        if (bool1)
        {
          i8 = paramInt1 - j + 1;
          i2 = j;
        }
        else
        {
          i11 = paramInt2 - j + 1;
          i5 = j;
        }
        Dlarzb.dlarzb(paramString1, str, "Backward", "Rowwise", i8, i11, i1, paramInt4, paramArrayOfDouble1, j - 1 + (i4 - 1) * paramInt6 + paramInt5, paramInt6, arrayOfDouble, 0, 65, paramArrayOfDouble3, i2 - 1 + (i5 - 1) * paramInt9 + paramInt8, paramInt9, paramArrayOfDouble4, paramInt10, i6);
        j += n;
      }
    }
    paramArrayOfDouble4[(1 - 1 + paramInt10)] = i7;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dormrz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */