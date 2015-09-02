package org.netlib.lapack;

import org.netlib.blas.Scopy;
import org.netlib.blas.Snrm2;
import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slaed9
{
  public static void slaed9(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, float paramFloat, float[] paramArrayOfFloat3, int paramInt8, float[] paramArrayOfFloat4, int paramInt9, float[] paramArrayOfFloat5, int paramInt10, int paramInt11, intW paramintW)
  {
    int i = 0;
    int j = 0;
    float f = 0.0F;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0)
    {
      paramintW.val = -1;
    }
    else
    {
      if ((paramInt2 >= 1 ? 0 : 1) == 0) {}
      if (((paramInt2 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        paramintW.val = -2;
      }
      else
      {
        if ((Math.max(1, paramInt3) >= paramInt2 ? 0 : 1) == 0) {}
        if (((paramInt3 <= Math.max(1, paramInt1) ? 0 : 1) == 0 ? 0 : 1) != 0) {
          paramintW.val = -3;
        } else if ((paramInt4 >= paramInt1 ? 0 : 1) != 0) {
          paramintW.val = -4;
        } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -7;
        } else if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
          paramintW.val = -12;
        }
      }
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SLAED9", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    i = 1;
    for (int k = paramInt4 - 1 + 1; k > 0; k--)
    {
      paramArrayOfFloat3[(i - 1 + paramInt8)] = (Slamc3.slamc3(paramArrayOfFloat3[(i - 1 + paramInt8)], paramArrayOfFloat3[(i - 1 + paramInt8)]) - paramArrayOfFloat3[(i - 1 + paramInt8)]);
      i += 1;
    }
    j = paramInt2;
    for (k = paramInt3 - paramInt2 + 1; k > 0; k--)
    {
      slaed4_adapter(paramInt1, j, paramArrayOfFloat3, paramInt8, paramArrayOfFloat4, paramInt9, paramArrayOfFloat2, 1 - 1 + (j - 1) * paramInt7 + paramInt6, paramFloat, paramArrayOfFloat1, j - 1 + paramInt5, paramintW);
      if ((paramintW.val == 0 ? 0 : 1) != 0) {
        break;
      }
      j += 1;
    }
    if ((paramInt1 != 1 ? 0 : 1) == 0) {}
    int m;
    if (((paramInt1 != 2 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        j = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat5[(j - 1 + (i - 1) * paramInt11 + paramInt10)] = paramArrayOfFloat2[(j - 1 + (i - 1) * paramInt7 + paramInt6)];
          j += 1;
        }
        i += 1;
      }
    }
    else
    {
      Scopy.scopy(paramInt1, paramArrayOfFloat4, paramInt9, 1, paramArrayOfFloat5, paramInt10, 1);
      Scopy.scopy(paramInt1, paramArrayOfFloat2, paramInt6, paramInt7 + 1, paramArrayOfFloat4, paramInt9, 1);
      j = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = j - 1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat4[(i - 1 + paramInt9)] *= paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] / (paramArrayOfFloat3[(i - 1 + paramInt8)] - paramArrayOfFloat3[(j - 1 + paramInt8)]);
          i += 1;
        }
        i = j + 1;
        for (m = paramInt1 - (j + 1) + 1; m > 0; m--)
        {
          paramArrayOfFloat4[(i - 1 + paramInt9)] *= paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] / (paramArrayOfFloat3[(i - 1 + paramInt8)] - paramArrayOfFloat3[(j - 1 + paramInt8)]);
          i += 1;
        }
        j += 1;
      }
      i = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        paramArrayOfFloat4[(i - 1 + paramInt9)] = Util.sign((float)Math.sqrt(-paramArrayOfFloat4[(i - 1 + paramInt9)]), paramArrayOfFloat5[(i - 1 + (1 - 1) * paramInt11 + paramInt10)]);
        i += 1;
      }
      j = 1;
      for (k = paramInt1 - 1 + 1; k > 0; k--)
      {
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] = (paramArrayOfFloat4[(i - 1 + paramInt9)] / paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt7 + paramInt6)]);
          i += 1;
        }
        f = Snrm2.snrm2(paramInt1, paramArrayOfFloat2, 1 - 1 + (j - 1) * paramInt7 + paramInt6, 1);
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          paramArrayOfFloat2[(i - 1 + (j - 1) * paramInt7 + paramInt6)] /= f;
          i += 1;
        }
        j += 1;
      }
    }
  }
  
  private static void slaed4_adapter(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float paramFloat, float[] paramArrayOfFloat4, int paramInt6, intW paramintW)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat4[paramInt6]);
    Slaed4.slaed4(paramInt1, paramInt2, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramFloat, localfloatW, paramintW);
    paramArrayOfFloat4[paramInt6] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slaed9.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */