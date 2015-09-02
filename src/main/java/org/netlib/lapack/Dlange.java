package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlange
{
  public static double dlange(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, double[] paramArrayOfDouble2, int paramInt5)
  {
    int i = 0;
    int j = 0;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d1 = 0.0D;
    double d2 = 0.0D;
    if ((Math.min(paramInt1, paramInt2) != 0 ? 0 : 1) != 0)
    {
      d1 = 0.0D;
    }
    else
    {
      int k;
      int m;
      if (Lsame.lsame(paramString, "M"))
      {
        d1 = 0.0D;
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            d1 = Math.max(d1, Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]));
            i += 1;
          }
          j += 1;
        }
      }
      else if (((!Lsame.lsame(paramString, "O")) && (!paramString.regionMatches(0, "1", 0, 1)) ? 0 : 1) != 0)
      {
        d1 = 0.0D;
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          localdoubleW2.val = 0.0D;
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            localdoubleW2.val += Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
            i += 1;
          }
          d1 = Math.max(d1, localdoubleW2.val);
          j += 1;
        }
      }
      else if (Lsame.lsame(paramString, "I"))
      {
        i = 1;
        for (k = paramInt1 - 1 + 1; k > 0; k--)
        {
          paramArrayOfDouble2[(i - 1 + paramInt5)] = 0.0D;
          i += 1;
        }
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            paramArrayOfDouble2[(i - 1 + paramInt5)] += Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt4 + paramInt3)]);
            i += 1;
          }
          j += 1;
        }
        d1 = 0.0D;
        i = 1;
        for (k = paramInt1 - 1 + 1; k > 0; k--)
        {
          d1 = Math.max(d1, paramArrayOfDouble2[(i - 1 + paramInt5)]);
          i += 1;
        }
      }
      else if (((!Lsame.lsame(paramString, "F")) && (!Lsame.lsame(paramString, "E")) ? 0 : 1) != 0)
      {
        localdoubleW1.val = 0.0D;
        localdoubleW2.val = 1.0D;
        j = 1;
        for (k = paramInt2 - 1 + 1; k > 0; k--)
        {
          Dlassq.dlassq(paramInt1, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, localdoubleW1, localdoubleW2);
          j += 1;
        }
        d1 = localdoubleW1.val * Math.sqrt(localdoubleW2.val);
      }
    }
    d2 = d1;
    return d2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlange.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */