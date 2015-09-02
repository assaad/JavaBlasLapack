package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlansy
{
  public static double dlansy(String paramString1, String paramString2, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4)
  {
    int i = 0;
    int j = 0;
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
      int k;
      int m;
      if (Lsame.lsame(paramString1, "M"))
      {
        d2 = 0.0D;
        if (Lsame.lsame(paramString2, "U"))
        {
          j = 1;
          for (k = paramInt1 - 1 + 1; k > 0; k--)
          {
            i = 1;
            for (m = j - 1 + 1; m > 0; m--)
            {
              d2 = Math.max(d2, Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]));
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
              d2 = Math.max(d2, Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]));
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
            for (k = paramInt1 - 1 + 1; k > 0; k--)
            {
              localdoubleW2.val = 0.0D;
              i = 1;
              for (m = j - 1 - 1 + 1; m > 0; m--)
              {
                d1 = Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]);
                localdoubleW2.val += d1;
                paramArrayOfDouble2[(i - 1 + paramInt4)] += d1;
                i += 1;
              }
              paramArrayOfDouble2[(j - 1 + paramInt4)] = (localdoubleW2.val + Math.abs(paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt3 + paramInt2)]));
              j += 1;
            }
            i = 1;
            for (k = paramInt1 - 1 + 1; k > 0; k--)
            {
              d2 = Math.max(d2, paramArrayOfDouble2[(i - 1 + paramInt4)]);
              i += 1;
            }
          }
          else
          {
            i = 1;
            for (k = paramInt1 - 1 + 1; k > 0; k--)
            {
              paramArrayOfDouble2[(i - 1 + paramInt4)] = 0.0D;
              i += 1;
            }
            j = 1;
            for (k = paramInt1 - 1 + 1; k > 0; k--)
            {
              localdoubleW2.val = (paramArrayOfDouble2[(j - 1 + paramInt4)] + Math.abs(paramArrayOfDouble1[(j - 1 + (j - 1) * paramInt3 + paramInt2)]));
              i = j + 1;
              for (m = paramInt1 - (j + 1) + 1; m > 0; m--)
              {
                d1 = Math.abs(paramArrayOfDouble1[(i - 1 + (j - 1) * paramInt3 + paramInt2)]);
                localdoubleW2.val += d1;
                paramArrayOfDouble2[(i - 1 + paramInt4)] += d1;
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
          if (Lsame.lsame(paramString2, "U"))
          {
            j = 2;
            for (k = paramInt1 - 2 + 1; k > 0; k--)
            {
              Dlassq.dlassq(j - 1, paramArrayOfDouble1, 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1, localdoubleW1, localdoubleW2);
              j += 1;
            }
          }
          else
          {
            j = 1;
            for (k = paramInt1 - 1 - 1 + 1; k > 0; k--)
            {
              Dlassq.dlassq(paramInt1 - j, paramArrayOfDouble1, j + 1 - 1 + (j - 1) * paramInt3 + paramInt2, 1, localdoubleW1, localdoubleW2);
              j += 1;
            }
          }
          localdoubleW2.val = (2 * localdoubleW2.val);
          Dlassq.dlassq(paramInt1, paramArrayOfDouble1, paramInt2, paramInt3 + 1, localdoubleW1, localdoubleW2);
          d2 = localdoubleW1.val * Math.sqrt(localdoubleW2.val);
        }
      }
    }
    d3 = d2;
    return d3;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlansy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */