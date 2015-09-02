package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sorm2r
{
  public static void sorm2r(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, float[] paramArrayOfFloat3, int paramInt7, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, intW paramintW)
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
    float f = 0.0F;
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString1, "L");
    bool2 = Lsame.lsame(paramString2, "N");
    if (bool1) {
      i4 = paramInt1;
    } else {
      i4 = paramInt2;
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
      if (((paramInt3 <= i4 ? 0 : 1) == 0 ? 0 : 1) != 0) {
        paramintW.val = -5;
      } else if ((paramInt5 >= Math.max(1, i4) ? 0 : 1) != 0) {
        paramintW.val = -7;
      } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
        paramintW.val = -10;
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SORM2R", -paramintW.val);
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
      i3 = paramInt2;
      i1 = 1;
    }
    else
    {
      i2 = paramInt1;
      n = 1;
    }
    i = j;
    for (int i5 = (k - j + m) / m; i5 > 0; i5--)
    {
      if (bool1)
      {
        i2 = paramInt1 - i + 1;
        n = i;
      }
      else
      {
        i3 = paramInt2 - i + 1;
        i1 = i;
      }
      f = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)];
      paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = 1.0F;
      Slarf.slarf(paramString1, i2, i3, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt5 + paramInt4, 1, paramArrayOfFloat2[(i - 1 + paramInt6)], paramArrayOfFloat3, n - 1 + (i1 - 1) * paramInt8 + paramInt7, paramInt8, paramArrayOfFloat4, paramInt9);
      paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt5 + paramInt4)] = f;
      i += m;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sorm2r.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */