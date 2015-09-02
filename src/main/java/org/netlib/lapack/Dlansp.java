package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlansp
{
  public static double dlansp(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    double d1 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d2 = 0.0D;
    double d3 = 0.0D;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      d2 = 0.0D;
    }
    else
    {
      int m;
      int n;
      if (Lsame.lsame(paramString1, "M"))
      {
        d2 = 0.0D;
        if (Lsame.lsame(paramString2, "U"))
        {
          k = 1;
          j = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            i = k;
            for (n = k + j - 1 - k + 1; n > 0; n--)
            {
              d2 = Math.max(d2, Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]));
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
              d2 = Math.max(d2, Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]));
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
          d2 = 0.0D;
          k = 1;
          if (Lsame.lsame(paramString2, "U"))
          {
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              localdoubleW2.val = 0.0D;
              i = 1;
              for (n = j - 1 - 1 + 1; n > 0; n--)
              {
                d1 = Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]);
                localdoubleW2.val += d1;
                paramArrayOfDouble2[(i - 1 + paramInt3)] += d1;
                k += 1;
                i += 1;
              }
              paramArrayOfDouble2[(j - 1 + paramInt3)] = (localdoubleW2.val + Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]));
              k += 1;
              j += 1;
            }
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              d2 = Math.max(d2, paramArrayOfDouble2[(i - 1 + paramInt3)]);
              i += 1;
            }
          }
          else
          {
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              paramArrayOfDouble2[(i - 1 + paramInt3)] = 0.0D;
              i += 1;
            }
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              localdoubleW2.val = (paramArrayOfDouble2[(j - 1 + paramInt3)] + Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]));
              k += 1;
              i = j + 1;
              for (n = paramInt1 - (j + 1) + 1; n > 0; n--)
              {
                d1 = Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]);
                localdoubleW2.val += d1;
                paramArrayOfDouble2[(i - 1 + paramInt3)] += d1;
                k += 1;
                i += 1;
              }
              d2 = Math.max(d2, localdoubleW2.val);
              j += 1;
            }
          }
        }
        else if (((!Lsame.lsame(paramString1, "F")) && (!Lsame.lsame(paramString1, "E")) ? 0 : 1) != 0)
        {
          localdoubleW1.val = 0.0D;
          localdoubleW2.val = 1.0D;
          k = 2;
          if (Lsame.lsame(paramString2, "U"))
          {
            j = 2;
            for (m = paramInt1 - 2 + 1; m > 0; m--)
            {
              Dlassq.dlassq(j - 1, paramArrayOfDouble1, k - 1 + paramInt2, 1, localdoubleW1, localdoubleW2);
              k += j;
              j += 1;
            }
          }
          else
          {
            j = 1;
            for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
            {
              Dlassq.dlassq(paramInt1 - j, paramArrayOfDouble1, k - 1 + paramInt2, 1, localdoubleW1, localdoubleW2);
              k = k + paramInt1 - j + 1;
              j += 1;
            }
          }
          localdoubleW2.val = (2 * localdoubleW2.val);
          k = 1;
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            if ((paramArrayOfDouble1[(k - 1 + paramInt2)] == 0.0D ? 0 : 1) != 0)
            {
              d1 = Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]);
              if ((localdoubleW1.val >= d1 ? 0 : 1) != 0)
              {
                localdoubleW2.val = (1.0D + localdoubleW2.val * Math.pow(localdoubleW1.val / d1, 2));
                localdoubleW1.val = d1;
              }
              else
              {
                localdoubleW2.val += Math.pow(d1 / localdoubleW1.val, 2);
              }
            }
            if (Lsame.lsame(paramString2, "U")) {
              k = k + i + 1;
            } else {
              k = k + paramInt1 - i + 1;
            }
            i += 1;
          }
          d2 = localdoubleW1.val * Math.sqrt(localdoubleW2.val);
        }
      }
    }
    d3 = d2;
    return d3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlansp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */