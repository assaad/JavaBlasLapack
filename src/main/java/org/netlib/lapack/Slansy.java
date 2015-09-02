package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slansy
{
  public static float slansy(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, int paramInt3, float[] paramArrayOfFloat2, int paramInt4)
  {
    int i = 0;
    int j = 0;
    float f1 = 0.0F;
    floatW localfloatW1 = new floatW(0.0F);
    floatW localfloatW2 = new floatW(0.0F);
    float f2 = 0.0F;
    float f3 = 0.0F;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      f2 = 0.0F;
    }
    else
    {
      int k;
      int m;
      if (Lsame.lsame(paramString1, "M"))
      {
        f2 = 0.0F;
        if (Lsame.lsame(paramString2, "U"))
        {
          j = 1;
          for (k = paramInt1 - 1 + 1; k > 0; k--)
          {
            i = 1;
            for (m = j - 1 + 1; m > 0; m--)
            {
              f2 = Math.max(f2, Math.abs(paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]));
              i += 1;
            }
            j += 1;
          }
        }
        else
        {
          j = 1;
          for (k = paramInt1 - 1 + 1; k > 0; k--)
          {
            i = j;
            for (m = paramInt1 - j + 1; m > 0; m--)
            {
              f2 = Math.max(f2, Math.abs(paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]));
              i += 1;
            }
            j += 1;
          }
        }
      }
      else
      {
        if (((!Lsame.lsame(paramString1, "I")) && (!Lsame.lsame(paramString1, "O")) ? 0 : 1) == 0) {}
        if ((!paramString1.regionMatches(0, "1", 0, 1) ? 0 : 1) != 0)
        {
          f2 = 0.0F;
          if (Lsame.lsame(paramString2, "U"))
          {
            j = 1;
            for (k = paramInt1 - 1 + 1; k > 0; k--)
            {
              localfloatW2.val = 0.0F;
              i = 1;
              for (m = j - 1 - 1 + 1; m > 0; m--)
              {
                f1 = Math.abs(paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]);
                localfloatW2.val += f1;
                paramArrayOfFloat2[(i - 1 + paramInt4)] += f1;
                i += 1;
              }
              paramArrayOfFloat2[(j - 1 + paramInt4)] = (localfloatW2.val + Math.abs(paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt3 + paramInt2)]));
              j += 1;
            }
            i = 1;
            for (k = paramInt1 - 1 + 1; k > 0; k--)
            {
              f2 = Math.max(f2, paramArrayOfFloat2[(i - 1 + paramInt4)]);
              i += 1;
            }
          }
          else
          {
            i = 1;
            for (k = paramInt1 - 1 + 1; k > 0; k--)
            {
              paramArrayOfFloat2[(i - 1 + paramInt4)] = 0.0F;
              i += 1;
            }
            j = 1;
            for (k = paramInt1 - 1 + 1; k > 0; k--)
            {
              localfloatW2.val = (paramArrayOfFloat2[(j - 1 + paramInt4)] + Math.abs(paramArrayOfFloat1[(j - 1 + (j - 1) * paramInt3 + paramInt2)]));
              i = j + 1;
              for (m = paramInt1 - (j + 1) + 1; m > 0; m--)
              {
                f1 = Math.abs(paramArrayOfFloat1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]);
                localfloatW2.val += f1;
                paramArrayOfFloat2[(i - 1 + paramInt4)] += f1;
                i += 1;
              }
              f2 = Math.max(f2, localfloatW2.val);
              j += 1;
            }
          }
        }
        else if (((!Lsame.lsame(paramString1, "F")) && (!Lsame.lsame(paramString1, "E")) ? 0 : 1) != 0)
        {
          localfloatW1.val = 0.0F;
          localfloatW2.val = 1.0F;
          if (Lsame.lsame(paramString2, "U"))
          {
            j = 2;
            for (k = paramInt1 - 2 + 1; k > 0; k--)
            {
              Slassq.slassq(j - 1, paramArrayOfFloat1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1, localfloatW1, localfloatW2);
              j += 1;
            }
          }
          else
          {
            j = 1;
            for (k = paramInt1 - 1 - 1 + 1; k > 0; k--)
            {
              Slassq.slassq(paramInt1 - j, paramArrayOfFloat1, j + 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1, localfloatW1, localfloatW2);
              j += 1;
            }
          }
          localfloatW2.val = (2 * localfloatW2.val);
          Slassq.slassq(paramInt1, paramArrayOfFloat1, paramInt2, paramInt3 + 1, localfloatW1, localfloatW2);
          f2 = localfloatW1.val * (float)Math.sqrt(localfloatW2.val);
        }
      }
    }
    f3 = f2;
    return f3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slansy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */