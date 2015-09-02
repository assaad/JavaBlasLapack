package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgebd2
{
  public static void sgebd2(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, float[] paramArrayOfFloat3, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, float[] paramArrayOfFloat5, int paramInt8, float[] paramArrayOfFloat6, int paramInt9, intW paramintW)
  {
    int i = 0;
    paramintW.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -4;
    }
    if ((paramintW.val >= 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGEBD2", -paramintW.val);
      return;
    }
    int j;
    if ((paramInt1 < paramInt2 ? 0 : 1) != 0)
    {
      i = 1;
      for (j = paramInt2 - 1 + 1; j > 0; j--)
      {
        slarfg_adapter(paramInt1 - i + 1, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfFloat1, Math.min(i + 1, paramInt1) - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat4, i - 1 + paramInt7);
        paramArrayOfFloat2[(i - 1 + paramInt5)] = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
        paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0F;
        if ((i >= paramInt2 ? 0 : 1) != 0) {
          Slarf.slarf("Left", paramInt1 - i + 1, paramInt2 - i, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat4[(i - 1 + paramInt7)], paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat6, paramInt9);
        }
        paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat2[(i - 1 + paramInt5)];
        if ((i >= paramInt2 ? 0 : 1) != 0)
        {
          slarfg_adapter(paramInt2 - i, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramArrayOfFloat1, i - 1 + (Math.min(i + 2, paramInt2) - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5, i - 1 + paramInt8);
          paramArrayOfFloat3[(i - 1 + paramInt6)] = paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt4 + paramInt3)];
          paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt4 + paramInt3)] = 1.0F;
          Slarf.slarf("Right", paramInt1 - i, paramInt2 - i, paramArrayOfFloat1, i - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5[(i - 1 + paramInt8)], paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat6, paramInt9);
          paramArrayOfFloat1[(i - 1 + (i + 1 - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat3[(i - 1 + paramInt6)];
        }
        else
        {
          paramArrayOfFloat5[(i - 1 + paramInt8)] = 0.0F;
        }
        i += 1;
      }
    }
    else
    {
      i = 1;
      for (j = paramInt1 - 1 + 1; j > 0; j--)
      {
        slarfg_adapter(paramInt2 - i + 1, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfFloat1, i - 1 + (Math.min(i + 1, paramInt2) - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5, i - 1 + paramInt8);
        paramArrayOfFloat2[(i - 1 + paramInt5)] = paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)];
        paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0F;
        if ((i >= paramInt1 ? 0 : 1) != 0) {
          Slarf.slarf("Right", paramInt1 - i, paramInt2 - i + 1, paramArrayOfFloat1, i - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat5[(i - 1 + paramInt8)], paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat6, paramInt9);
        }
        paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat2[(i - 1 + paramInt5)];
        if ((i >= paramInt1 ? 0 : 1) != 0)
        {
          slarfg_adapter(paramInt1 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, paramArrayOfFloat1, Math.min(i + 2, paramInt1) - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat4, i - 1 + paramInt7);
          paramArrayOfFloat3[(i - 1 + paramInt6)] = paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt4 + paramInt3)];
          paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = 1.0F;
          Slarf.slarf("Left", paramInt1 - i, paramInt2 - i, paramArrayOfFloat1, i + 1 - 1 + (i - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat4[(i - 1 + paramInt7)], paramArrayOfFloat1, i + 1 - 1 + (i + 1 - 1) * paramInt4 + paramInt3, paramInt4, paramArrayOfFloat6, paramInt9);
          paramArrayOfFloat1[(i + 1 - 1 + (i - 1) * paramInt4 + paramInt3)] = paramArrayOfFloat3[(i - 1 + paramInt6)];
        }
        else
        {
          paramArrayOfFloat4[(i - 1 + paramInt7)] = 0.0F;
        }
        i += 1;
      }
    }
  }
  
  private static void slarfg_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int paramInt4, float[] paramArrayOfFloat3, int paramInt5)
  {
    floatW localfloatW1 = new floatW(paramArrayOfFloat1[paramInt2]);
    floatW localfloatW2 = new floatW(paramArrayOfFloat3[paramInt5]);
    Slarfg.slarfg(paramInt1, localfloatW1, paramArrayOfFloat2, paramInt3, paramInt4, localfloatW2);
    paramArrayOfFloat1[paramInt2] = localfloatW1.val;
    paramArrayOfFloat3[paramInt5] = localfloatW2.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgebd2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */