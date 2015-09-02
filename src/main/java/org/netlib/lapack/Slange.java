package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slange
{
  public static float slange(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5)
  {
    int i = 0;
    int j = 0;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    if ((Math.min(paramInt1, paramInt2) != 0 ? 0 : 1) != 0)
    {
      f1 = 0.0F;
    }
    else
    {
      int k;
      int m;
      if (Lsame.lsame(paramString, "M"))
      {
        f1 = 0.0F;
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            f1 = Math.max(f1, Math.abs(paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]));
            i += 1;
          }
          j += 1;
        }
      }
      else if (((!Lsame.lsame(paramString, "O")) && (!paramString.regionMatches(0, "1", 0, 1)) ? 0 : 1) != 0)
      {
        f1 = 0.0F;
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          localfloatW2.val = 0.0F;
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            localfloatW2.val += Math.abs(paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
            i += 1;
          }
          f1 = Math.max(f1, localfloatW2.val);
          j += 1;
        }
      }
      else if (Lsame.lsame(paramString, "I"))
      {
        i = 1;
        for (k = paramInt1 - 1 + 1; k > 0; k--)
        {
          paramArrayOfFloat2[(i - 1 + paramInt5)] = 0.0F;
          i += 1;
        }
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            paramArrayOfFloat2[(i - 1 + paramInt5)] += Math.abs(paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
            i += 1;
          }
          j += 1;
        }
        f1 = 0.0F;
        i = 1;
        for (k = paramInt1 - 1 + 1; k > 0; k--)
        {
          f1 = Math.max(f1, paramArrayOfFloat2[(i - 1 + paramInt5)]);
          i += 1;
        }
      }
      else if (((!Lsame.lsame(paramString, "F")) && (!Lsame.lsame(paramString, "E")) ? 0 : 1) != 0)
      {
        localfloatW1.val = 0.0F;
        localfloatW2.val = 1.0F;
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          Slassq.slassq(paramInt1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, localfloatW1, localfloatW2);
          j += 1;
        }
        f1 = localfloatW1.val * (float)Math.sqrt(localfloatW2.val);
      }
    }
    f2 = f1;
    return f2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slange.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */