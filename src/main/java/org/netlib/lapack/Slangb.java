package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slangb
{
  public static float slangb(String paramString, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f1 = 0.0F;
    float f2 = 0.0F;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      f1 = 0.0F;
    }
    else
    {
      int n;
      int i1;
      if (Lsame.lsame(paramString, "M"))
      {
        f1 = 0.0F;
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          i = Math.max(paramInt3 + 2 - j, 1);
          for (i1 = Math.min(paramInt1 + paramInt3 + 1 - j, paramInt2 + paramInt3 + 1) - Math.max(paramInt3 + 2 - j, 1) + 1; i1 > 0; i1--)
          {
            f1 = Math.max(f1, Math.abs(paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt5 + paramInt4)]));
            i += 1;
          }
          j += 1;
        }
      }
      else if (((!Lsame.lsame(paramString, "O")) && (!paramString.regionMatches(0, "1", 0, 1)) ? 0 : 1) != 0)
      {
        f1 = 0.0F;
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          localfloatW2.val = 0.0F;
          i = Math.max(paramInt3 + 2 - j, 1);
          for (i1 = Math.min(paramInt1 + paramInt3 + 1 - j, paramInt2 + paramInt3 + 1) - Math.max(paramInt3 + 2 - j, 1) + 1; i1 > 0; i1--)
          {
            localfloatW2.val += Math.abs(paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt5 + paramInt4)]);
            i += 1;
          }
          f1 = Math.max(f1, localfloatW2.val);
          j += 1;
        }
      }
      else if (Lsame.lsame(paramString, "I"))
      {
        i = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          paramArrayOfFloat2[(i - 1 + paramInt6)] = 0.0F;
          i += 1;
        }
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          k = paramInt3 + 1 - j;
          i = Math.max(1, j - paramInt3);
          for (i1 = Math.min(paramInt1, j + paramInt2) - Math.max(1, j - paramInt3) + 1; i1 > 0; i1--)
          {
            paramArrayOfFloat2[(i - 1 + paramInt6)] += Math.abs(paramArrayOfFloat1[(k + i - 1 + (j - 1) * paramInt5 + paramInt4)]);
            i += 1;
          }
          j += 1;
        }
        f1 = 0.0F;
        i = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          f1 = Math.max(f1, paramArrayOfFloat2[(i - 1 + paramInt6)]);
          i += 1;
        }
      }
      else if (((!Lsame.lsame(paramString, "F")) && (!Lsame.lsame(paramString, "E")) ? 0 : 1) != 0)
      {
        localfloatW1.val = 0.0F;
        localfloatW2.val = 1.0F;
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          m = Math.max(1, j - paramInt3);
          k = paramInt3 + 1 - j + m;
          Slassq.slassq(Math.min(paramInt1, j + paramInt2) - m + 1, paramArrayOfFloat1, k - 1 + (j - 1) * paramInt5 + paramInt4, 1, localfloatW1, localfloatW2);
          j += 1;
        }
        f1 = localfloatW1.val * (float)Math.sqrt(localfloatW2.val);
      }
    }
    f2 = f1;
    return f2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slangb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */