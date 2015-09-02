package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlangb
{
  public static double dlangb(String paramString, int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble1, int paramInt4, int paramInt5, double[] paramArrayOfDouble2, int paramInt6)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    if ((paramInt1 != 0 ? 0 : 1) != 0)
    {
      d1 = 0.0D;
    }
    else
    {
      int n;
      int i1;
      if (Lsame.lsame(paramString, "M"))
      {
        d1 = 0.0D;
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          i = Math.max(paramInt3 + 2 - j, 1);
          for (i1 = Math.min(paramInt1 + paramInt3 + 1 - j, paramInt2 + paramInt3 + 1) - Math.max(paramInt3 + 2 - j, 1) + 1; i1 > 0; i1--)
          {
            d1 = Math.max(d1, Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt5 + paramInt4)]));
            i += 1;
          }
          j += 1;
        }
      }
      else if (((!Lsame.lsame(paramString, "O")) && (!paramString.regionMatches(0, "1", 0, 1)) ? 0 : 1) != 0)
      {
        d1 = 0.0D;
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          localdoubleW2.val = 0.0D;
          i = Math.max(paramInt3 + 2 - j, 1);
          for (i1 = Math.min(paramInt1 + paramInt3 + 1 - j, paramInt2 + paramInt3 + 1) - Math.max(paramInt3 + 2 - j, 1) + 1; i1 > 0; i1--)
          {
            localdoubleW2.val += Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt5 + paramInt4)]);
            i += 1;
          }
          d1 = Math.max(d1, localdoubleW2.val);
          j += 1;
        }
      }
      else if (Lsame.lsame(paramString, "I"))
      {
        i = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          paramArrayOfDouble2[(i - 1 + paramInt6)] = 0.0D;
          i += 1;
        }
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          k = paramInt3 + 1 - j;
          i = Math.max(1, j - paramInt3);
          for (i1 = Math.min(paramInt1, j + paramInt2) - Math.max(1, j - paramInt3) + 1; i1 > 0; i1--)
          {
            paramArrayOfDouble2[(i - 1 + paramInt6)] += Math.abs(paramArrayOfDouble1[(k + i - 1 + (j - 1) * paramInt5 + paramInt4)]);
            i += 1;
          }
          j += 1;
        }
        d1 = 0.0D;
        i = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          d1 = Math.max(d1, paramArrayOfDouble2[(i - 1 + paramInt6)]);
          i += 1;
        }
      }
      else if (((!Lsame.lsame(paramString, "F")) && (!Lsame.lsame(paramString, "E")) ? 0 : 1) != 0)
      {
        localdoubleW1.val = 0.0D;
        localdoubleW2.val = 1.0D;
        j = 1;
        for (n = paramInt1 - 1 + 1; n > 0; n--)
        {
          m = Math.max(1, j - paramInt3);
          k = paramInt3 + 1 - j + m;
          Dlassq.dlassq(Math.min(paramInt1, j + paramInt2) - m + 1, paramArrayOfDouble1, k - 1 + (j - 1) * paramInt5 + paramInt4, 1, localdoubleW1, localdoubleW2);
          j += 1;
        }
        d1 = localdoubleW1.val * Math.sqrt(localdoubleW2.val);
      }
    }
    d2 = d1;
    return d2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlangb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */