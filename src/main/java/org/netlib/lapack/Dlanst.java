package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlanst
{
  public static double dlanst(String paramString, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3)
  {
    int i = 0;
    double d1 = 0.0D;
    doubleW localdoubleW1 = new doubleW(0.0D);
    doubleW localdoubleW2 = new doubleW(0.0D);
    double d2 = 0.0D;
    if ((paramInt1 > 0 ? 0 : 1) != 0)
    {
      d1 = 0.0D;
    }
    else
    {
      int j;
      if (Lsame.lsame(paramString, "M"))
      {
        d1 = Math.abs(paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)]);
        i = 1;
        for (j = paramInt1 - 1 - 1 + 1; j > 0; j--)
        {
          d1 = Math.max(d1, Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]));
          d1 = Math.max(d1, Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]));
          i += 1;
        }
      }
      else
      {
        if (((!Lsame.lsame(paramString, "O")) && (!paramString.regionMatches(0, "1", 0, 1)) ? 0 : 1) == 0) {}
        if ((!Lsame.lsame(paramString, "I") ? 0 : 1) != 0)
        {
          if ((paramInt1 != 1 ? 0 : 1) != 0)
          {
            d1 = Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt2)]);
          }
          else
          {
            d1 = Math.max(Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble2[(1 - 1 + paramInt3)]), Math.abs(paramArrayOfDouble2[(paramInt1 - 1 - 1 + paramInt3)]) + Math.abs(paramArrayOfDouble1[(paramInt1 - 1 + paramInt2)]));
            i = 2;
            for (j = paramInt1 - 1 - 2 + 1; j > 0; j--)
            {
              d1 = Math.max(d1, Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]) + Math.abs(paramArrayOfDouble2[(i - 1 + paramInt3)]) + Math.abs(paramArrayOfDouble2[(i - 1 - 1 + paramInt3)]));
              i += 1;
            }
          }
        }
        else if (((!Lsame.lsame(paramString, "F")) && (!Lsame.lsame(paramString, "E")) ? 0 : 1) != 0)
        {
          localdoubleW1.val = 0.0D;
          localdoubleW2.val = 1.0D;
          if ((paramInt1 <= 1 ? 0 : 1) != 0)
          {
            Dlassq.dlassq(paramInt1 - 1, paramArrayOfDouble2, paramInt3, 1, localdoubleW1, localdoubleW2);
            localdoubleW2.val = (2 * localdoubleW2.val);
          }
          Dlassq.dlassq(paramInt1, paramArrayOfDouble1, paramInt2, 1, localdoubleW1, localdoubleW2);
          d1 = localdoubleW1.val * Math.sqrt(localdoubleW2.val);
        }
      }
    }
    d2 = d1;
    return d2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlanst.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */