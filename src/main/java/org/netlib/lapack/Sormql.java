package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sormql
{
  public static void sormql(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, int paramInt10, intW paramintW)
  {
    boolean bool1 = false;
    int i = 0;
    boolean bool2 = false;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    intW localintW = new intW(0);
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    float[] arrayOfFloat = new float[65 * 64];
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString1, "L");
    bool2 = Lsame.lsame(paramString2, "N");
    i = paramInt10 != -1 ? 0 : 1;
    if (bool1)
    {
      i9 = paramInt1;
      i10 = Math.max(1, paramInt2);
    }
    else
    {
      i9 = paramInt2;
      i10 = Math.max(1, paramInt1);
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
      if (((paramInt3 <= i9 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -5;
      } else if ((paramInt5 >= Math.max(1, i9) ? 0 : 1) != 0) {
        paramintW.val = -7;
      } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -10;
      }
    }
    if ((paramintW.val != 0 ? 0 : 1) != 0)
    {
      if ((paramInt1 != 0 ? 0 : 1) == 0) {}
      if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        i4 = 1;
      }
      else
      {
        i6 = Math.min(64, Ilaenv.ilaenv(1, "SORMQL", paramString1 + paramString2, paramInt1, paramInt2, paramInt3, -1));
        i4 = i10 * i6;
      }
      paramArrayOfFloat4[(1 - 1 + paramInt9)] = i4;
      if ((paramInt10 >= i10 ? 0 : 1) != 0) {}
      if (((i ^ 0x1) != 0 ? 1 : 0) != 0) {
        paramintW.val = -12;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SORMQL", -paramintW.val);
      return;
    }
    if (i != 0) {
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    i7 = 2;
    i3 = i10;
    if ((i6 <= 1 ? 0 : 1) != 0) {}
    if (((i6 >= paramInt3 ? 0 : 1) != 0 ? 1 : 0) != 0)
    {
      i2 = i10 * i6;
      if ((paramInt10 >= i2 ? 0 : 1) != 0)
      {
        i6 = paramInt10 / i3;
        i7 = Math.max(2, Ilaenv.ilaenv(2, "SORMQL", paramString1 + paramString2, paramInt1, paramInt2, paramInt3, -1));
      }
    }
    else
    {
      i2 = i10;
    }
    if ((i6 >= i7 ? 0 : 1) == 0) {}
    if (((i6 < paramInt3 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      Sorm2l.sorm2l(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramArrayOfFloat1, paramInt4, paramInt5, paramArrayOfFloat2, paramInt6, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat4, paramInt9, localintW);
    }
    else
    {
      if (((bool1) && (bool2) ? 1 : 0) == 0) {}
      if (((((bool1 ^ true)) && ((bool2 ^ true)) ? 1 : 0) == 0 ? 0 : 1) != 0)
      {
        k = 1;
        m = paramInt3;
        n = i6;
      }
      else
      {
        k = (paramInt3 - 1) / i6 * i6 + 1;
        m = 1;
        n = -i6;
      }
      if (bool1) {
        i8 = paramInt2;
      } else {
        i5 = paramInt1;
      }
      j = k;
      for (int i11 = (m - k + n) / n; i11 > 0; i11--)
      {
        i1 = Math.min(i6, paramInt3 - j + 1);
        Slarft.slarft("Backward", "Columnwise", i9 - paramInt3 + j + i1 - 1, i1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, paramArrayOfFloat2, j - 1 + paramInt6, arrayOfFloat, 0, 65);
        if (bool1) {
          i5 = paramInt1 - paramInt3 + j + i1 - 1;
        } else {
          i8 = paramInt2 - paramInt3 + j + i1 - 1;
        }
        Slarfb.slarfb(paramString1, paramString2, "Backward", "Columnwise", i5, i8, i1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt5 + paramInt4, paramInt5, arrayOfFloat, 0, 65, paramArrayOfFloat3, paramInt7, paramInt8, paramArrayOfFloat4, paramInt9, i3);
        j += n;
      }
    }
    paramArrayOfFloat4[(1 - 1 + paramInt9)] = i4;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sormql.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */