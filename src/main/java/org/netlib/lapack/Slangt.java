package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slangt
{
  public static float slangt(String paramString, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float[] paramArrayOfFloat3, int paramInt4)
  {
    int i = 0;
    float f1 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f2 = 0.0F;
    if ((paramInt1 > 0 ? 0 : 1) != 0)
    {
      f1 = 0.0F;
    }
    else
    {
      int j;
      if (Lsame.lsame(paramString, "M"))
      {
        f1 = Math.abs(paramArrayOfFloat2[(paramInt1 - 1 + paramInt3)]);
        i = 1;
        for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
        {
          f1 = Math.max(f1, Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]));
          f1 = Math.max(f1, Math.abs(paramArrayOfFloat2[(i - 1 + paramInt3)]));
          f1 = Math.max(f1, Math.abs(paramArrayOfFloat3[(i - 1 + paramInt4)]));
          i += 1;
        }
      }
      else if (((!Lsame.lsame(paramString, "O")) && (!paramString.regionMatches(0, "1", 0, 1)) ? 0 : 1) != 0)
      {
        if ((paramInt1 != 1 ? 0 : 1) != 0)
        {
          f1 = Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt3)]);
        }
        else
        {
          f1 = Math.max(Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt3)]) + Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt2)]), Math.abs(paramArrayOfFloat2[(paramInt1 - 1 + paramInt3)]) + Math.abs(paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt4)]));
          i = 2;
          for (j = paramInt1 - 1 - 2 + 1; j > 0; j--)
          {
            f1 = Math.max(f1, Math.abs(paramArrayOfFloat2[(i - 1 + paramInt3)]) + Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]) + Math.abs(paramArrayOfFloat3[(i - 1 - 1 + paramInt4)]));
            i += 1;
          }
        }
      }
      else if (Lsame.lsame(paramString, "I"))
      {
        if ((paramInt1 != 1 ? 0 : 1) != 0)
        {
          f1 = Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt3)]);
        }
        else
        {
          f1 = Math.max(Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt3)]) + Math.abs(paramArrayOfFloat3[(1 - 1 + paramInt4)]), Math.abs(paramArrayOfFloat2[(paramInt1 - 1 + paramInt3)]) + Math.abs(paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt2)]));
          i = 2;
          for (j = paramInt1 - 1 - 2 + 1; j > 0; j--)
          {
            f1 = Math.max(f1, Math.abs(paramArrayOfFloat2[(i - 1 + paramInt3)]) + Math.abs(paramArrayOfFloat3[(i - 1 + paramInt4)]) + Math.abs(paramArrayOfFloat1[(i - 1 - 1 + paramInt2)]));
            i += 1;
          }
        }
      }
      else if (((!Lsame.lsame(paramString, "F")) && (!Lsame.lsame(paramString, "E")) ? 0 : 1) != 0)
      {
        localfloatW1.val = 0.0F;
        localfloatW2.val = 1.0F;
        Slassq.slassq(paramInt1, paramArrayOfFloat2, paramInt3, 1, localfloatW1, localfloatW2);
        if ((paramInt1 <= 1 ? 0 : 1) != 0)
        {
          Slassq.slassq(paramInt1 - 1, paramArrayOfFloat1, paramInt2, 1, localfloatW1, localfloatW2);
          Slassq.slassq(paramInt1 - 1, paramArrayOfFloat3, paramInt4, 1, localfloatW1, localfloatW2);
        }
        f1 = localfloatW1.val * (float)Math.sqrt(localfloatW2.val);
      }
    }
    f2 = f1;
    return f2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slangt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */