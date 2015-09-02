package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlansb
{
  public static double dlansb(String paramString1, String paramString2, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5)
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
          j = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            i = Math.max(paramInt2 + 2 - j, 1);
            for (n = paramInt2 + 1 - Math.max(paramInt2 + 2 - j, 1) + 1; n > 0; n--)
            {
              d2 = Math.max(d2, Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]));
              i += 1;
            }
            j += 1;
          }
        }
        else
        {
          j = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            i = 1;
            for (n = Math.min(paramInt1 + 1 - j, paramInt2 + 1) - 1 + 1; n > 0; n--)
            {
              d2 = Math.max(d2, Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]));
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
          d2 = 0.0D;
          if (Lsame.lsame(paramString2, "U"))
          {
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              localdoubleW2.val = 0.0D;
              k = paramInt2 + 1 - j;
              i = Math.max(1, j - paramInt2);
              for (n = j - 1 - Math.max(1, j - paramInt2) + 1; n > 0; n--)
              {
                d1 = Math.abs(paramArrayOfDouble1[(k + i - 1 + (j - 1) * paramInt4 + paramInt3)]);
                localdoubleW2.val += d1;
                paramArrayOfDouble2[(i - 1 + paramInt5)] += d1;
                i += 1;
              }
              paramArrayOfDouble2[(j - 1 + paramInt5)] = (localdoubleW2.val + Math.abs(paramArrayOfDouble1[(paramInt2 + 1 - 1 + (j - 1) * paramInt4 + paramInt3)]));
              j += 1;
            }
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              d2 = Math.max(d2, paramArrayOfDouble2[(i - 1 + paramInt5)]);
              i += 1;
            }
          }
          else
          {
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              paramArrayOfDouble2[(i - 1 + paramInt5)] = 0.0D;
              i += 1;
            }
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              localdoubleW2.val = (paramArrayOfDouble2[(j - 1 + paramInt5)] + Math.abs(paramArrayOfDouble1[(1 - 1 + (j - 1) * paramInt4 + paramInt3)]));
              k = 1 - j;
              i = j + 1;
              for (n = Math.min(paramInt1, j + paramInt2) - (j + 1) + 1; n > 0; n--)
              {
                d1 = Math.abs(paramArrayOfDouble1[(k + i - 1 + (j - 1) * paramInt4 + paramInt3)]);
                localdoubleW2.val += d1;
                paramArrayOfDouble2[(i - 1 + paramInt5)] += d1;
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
          if ((paramInt2 <= 0 ? 0 : 1) != 0)
          {
            if (Lsame.lsame(paramString2, "U"))
            {
              j = 2;
              for (m = paramInt1 - 2 + 1; m > 0; m--)
              {
                Dlassq.dlassq(Math.min(j - 1, paramInt2), paramArrayOfDouble1, Math.max(paramInt2 + 2 - j, 1) - 1 + (j - 1) * paramInt4 + paramInt3, 1, localdoubleW1, localdoubleW2);
                j += 1;
              }
              k = paramInt2 + 1;
            }
            else
            {
              j = 1;
              for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
              {
                Dlassq.dlassq(Math.min(paramInt1 - j, paramInt2), paramArrayOfDouble1, 2 - 1 + (j - 1) * paramInt4 + paramInt3, 1, localdoubleW1, localdoubleW2);
                j += 1;
              }
              k = 1;
            }
            localdoubleW2.val = (2 * localdoubleW2.val);
          }
          else
          {
            k = 1;
          }
          Dlassq.dlassq(paramInt1, paramArrayOfDouble1, k - 1 + (1 - 1) * paramInt4 + paramInt3, paramInt4, localdoubleW1, localdoubleW2);
          d2 = localdoubleW1.val * Math.sqrt(localdoubleW2.val);
        }
      }
    }
    d3 = d2;
    return d3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlansb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */