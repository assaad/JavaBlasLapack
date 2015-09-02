package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Sopmtr
{
  public static void sopmtr(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, intW paramintW)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    float f = 0.0F;
    paramintW.val = 0;
    bool1 = Lsame.lsame(paramString1, "L");
    bool2 = Lsame.lsame(paramString3, "N");
    bool3 = Lsame.lsame(paramString2, "U");
    if (bool1) {
      i6 = paramInt1;
    } else {
      i6 = paramInt2;
    }
    if ((((bool1 ^ true)) && ((Lsame.lsame(paramString1, "R") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((((bool3 ^ true)) && ((Lsame.lsame(paramString2, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -2;
    } else if ((((bool2 ^ true)) && ((Lsame.lsame(paramString3, "T") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -3;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -9;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SOPMTR", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      return;
    }
    int i7;
    if (bool3)
    {
      if (((bool1) && (bool2) ? 1 : 0) == 0) {}
      i = (((bool1 ^ true)) && ((bool2 ^ true)) ? 1 : 0) == 0 ? 0 : 1;
      if (i != 0)
      {
        k = 1;
        m = i6 - 1;
        n = 1;
        i2 = 2;
      }
      else
      {
        k = i6 - 1;
        m = 1;
        n = -1;
        i2 = i6 * (i6 + 1) / 2 - 1;
      }
      if (bool1) {
        i5 = paramInt2;
      } else {
        i4 = paramInt1;
      }
      j = k;
      for (i7 = (m - k + n) / n; i7 > 0; i7--)
      {
        if (bool1) {
          i4 = j;
        } else {
          i5 = j;
        }
        f = paramArrayOfFloat1[(i2 - 1 + paramInt3)];
        paramArrayOfFloat1[(i2 - 1 + paramInt3)] = 1.0F;
        Slarf.slarf(paramString1, i4, i5, paramArrayOfFloat1, i2 - j + 1 - 1 + paramInt3, 1, paramArrayOfFloat2[(j - 1 + paramInt4)], paramArrayOfFloat3, paramInt5, paramInt6, paramArrayOfFloat4, paramInt7);
        paramArrayOfFloat1[(i2 - 1 + paramInt3)] = f;
        if (i != 0) {
          i2 = i2 + j + 2;
        } else {
          i2 = i2 - j - 1;
        }
        j += n;
      }
    }
    else
    {
      if (((bool1) && ((bool2 ^ true)) ? 1 : 0) == 0) {}
      i = (((bool1 ^ true)) && (bool2) ? 1 : 0) == 0 ? 0 : 1;
      if (i != 0)
      {
        k = 1;
        m = i6 - 1;
        n = 1;
        i2 = 2;
      }
      else
      {
        k = i6 - 1;
        m = 1;
        n = -1;
        i2 = i6 * (i6 + 1) / 2 - 1;
      }
      if (bool1)
      {
        i5 = paramInt2;
        i3 = 1;
      }
      else
      {
        i4 = paramInt1;
        i1 = 1;
      }
      j = k;
      for (i7 = (m - k + n) / n; i7 > 0; i7--)
      {
        f = paramArrayOfFloat1[(i2 - 1 + paramInt3)];
        paramArrayOfFloat1[(i2 - 1 + paramInt3)] = 1.0F;
        if (bool1)
        {
          i4 = paramInt1 - j;
          i1 = j + 1;
        }
        else
        {
          i5 = paramInt2 - j;
          i3 = j + 1;
        }
        Slarf.slarf(paramString1, i4, i5, paramArrayOfFloat1, i2 - 1 + paramInt3, 1, paramArrayOfFloat2[(j - 1 + paramInt4)], paramArrayOfFloat3, i1 - 1 + (i3 - 1) * paramInt6 + paramInt5, paramInt6, paramArrayOfFloat4, paramInt7);
        paramArrayOfFloat1[(i2 - 1 + paramInt3)] = f;
        if (i != 0) {
          i2 = i2 + i6 - j + 1;
        } else {
          i2 = i2 - i6 + j - 2;
        }
        j += n;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sopmtr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */