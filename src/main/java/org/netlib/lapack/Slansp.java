package org.netlib.lapack;

import org.netlib.util.floatW;

public final class Slansp
{
  public static float slansp(String paramString1, String paramString2, int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
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
      int m;
      int n;
      if (Lsame.lsame(paramString1, "M"))
      {
        f2 = 0.0F;
        if (Lsame.lsame(paramString2, "U"))
        {
          k = 1;
          j = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            i = k;
            for (n = k + j - 1 - k + 1; n > 0; n--)
            {
              f2 = Math.max(f2, Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]));
              i += 1;
            }
            k += j;
            j += 1;
          }
        }
        else
        {
          k = 1;
          j = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            i = k;
            for (n = k + paramInt1 - j - k + 1; n > 0; n--)
            {
              f2 = Math.max(f2, Math.abs(paramArrayOfFloat1[(i - 1 + paramInt2)]));
              i += 1;
            }
            k = k + paramInt1 - j + 1;
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
          k = 1;
          if (Lsame.lsame(paramString2, "U"))
          {
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              localfloatW2.val = 0.0F;
              i = 1;
              for (n = j - 1 - 1 + 1; n > 0; n--)
              {
                f1 = Math.abs(paramArrayOfFloat1[(k - 1 + paramInt2)]);
                localfloatW2.val += f1;
                paramArrayOfFloat2[(i - 1 + paramInt3)] += f1;
                k += 1;
                i += 1;
              }
              paramArrayOfFloat2[(j - 1 + paramInt3)] = (localfloatW2.val + Math.abs(paramArrayOfFloat1[(k - 1 + paramInt2)]));
              k += 1;
              j += 1;
            }
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              f2 = Math.max(f2, paramArrayOfFloat2[(i - 1 + paramInt3)]);
              i += 1;
            }
          }
          else
          {
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              paramArrayOfFloat2[(i - 1 + paramInt3)] = 0.0F;
              i += 1;
            }
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              localfloatW2.val = (paramArrayOfFloat2[(j - 1 + paramInt3)] + Math.abs(paramArrayOfFloat1[(k - 1 + paramInt2)]));
              k += 1;
              i = j + 1;
              for (n = paramInt1 - (j + 1) + 1; n > 0; n--)
              {
                f1 = Math.abs(paramArrayOfFloat1[(k - 1 + paramInt2)]);
                localfloatW2.val += f1;
                paramArrayOfFloat2[(i - 1 + paramInt3)] += f1;
                k += 1;
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
          k = 2;
          if (Lsame.lsame(paramString2, "U"))
          {
            j = 2;
            for (m = paramInt1 - 2 + 1; m > 0; m--)
            {
              Slassq.slassq(j - 1, paramArrayOfFloat1, k - 1 + paramInt2, 1, localfloatW1, localfloatW2);
              k += j;
              j += 1;
            }
          }
          else
          {
            j = 1;
            for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
            {
              Slassq.slassq(paramInt1 - j, paramArrayOfFloat1, k - 1 + paramInt2, 1, localfloatW1, localfloatW2);
              k = k + paramInt1 - j + 1;
              j += 1;
            }
          }
          localfloatW2.val = (2 * localfloatW2.val);
          k = 1;
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            if ((paramArrayOfFloat1[(k - 1 + paramInt2)] == 0.0F ? 0 : 1) != 0)
            {
              f1 = Math.abs(paramArrayOfFloat1[(k - 1 + paramInt2)]);
              if ((localfloatW1.val >= f1 ? 0 : 1) != 0)
              {
                localfloatW2.val = (1.0F + localfloatW2.val * (float)Math.pow(localfloatW1.val / f1, 2));
                localfloatW1.val = f1;
              }
              else
              {
                localfloatW2.val += (float)Math.pow(f1 / localfloatW1.val, 2);
              }
            }
            if (Lsame.lsame(paramString2, "U")) {
              k = k + i + 1;
            } else {
              k = k + paramInt1 - i + 1;
            }
            i += 1;
          }
          f2 = localfloatW1.val * (float)Math.sqrt(localfloatW2.val);
        }
      }
    }
    f3 = f2;
    return f3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slansp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */