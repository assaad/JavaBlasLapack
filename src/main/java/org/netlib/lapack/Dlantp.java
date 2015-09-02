package org.netlib.lapack;

import org.netlib.util.doubleW;

public final class Dlantp
{
  public static double dlantp(String paramString1, String paramString2, String paramString3, int paramInt1, double[] paramArrayOfDouble1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
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
      int m;
      int n;
      if (Lsame.lsame(paramString1, "M"))
      {
        k = 1;
        if (Lsame.lsame(paramString3, "U"))
        {
          d1 = 1.0D;
          if (Lsame.lsame(paramString2, "U"))
          {
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              i = k;
              for (n = k + j - 2 - k + 1; n > 0; n--)
              {
                d1 = Math.max(d1, Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]));
                i += 1;
              }
              k += j;
              j += 1;
            }
          }
          else
          {
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              i = k + 1;
              for (n = k + paramInt1 - j - (k + 1) + 1; n > 0; n--)
              {
                d1 = Math.max(d1, Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]));
                i += 1;
              }
              k = k + paramInt1 - j + 1;
              j += 1;
            }
          }
        }
        else
        {
          d1 = 0.0D;
          if (Lsame.lsame(paramString2, "U"))
          {
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              i = k;
              for (n = k + j - 1 - k + 1; n > 0; n--)
              {
                d1 = Math.max(d1, Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]));
                i += 1;
              }
              k += j;
              j += 1;
            }
          }
          else
          {
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              i = k;
              for (n = k + paramInt1 - j - k + 1; n > 0; n--)
              {
                d1 = Math.max(d1, Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]));
                i += 1;
              }
              k = k + paramInt1 - j + 1;
              j += 1;
            }
          }
        }
      }
      else if (((!Lsame.lsame(paramString1, "O")) && (!paramString1.regionMatches(0, "1", 0, 1)) ? 0 : 1) != 0)
      {
        d1 = 0.0D;
        k = 1;
        bool = Lsame.lsame(paramString3, "U");
        if (Lsame.lsame(paramString2, "U"))
        {
          j = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            if (bool)
            {
              localdoubleW2.val = 1.0D;
              i = k;
              for (n = k + j - 2 - k + 1; n > 0; n--)
              {
                localdoubleW2.val += Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]);
                i += 1;
              }
            }
            else
            {
              localdoubleW2.val = 0.0D;
              i = k;
              for (n = k + j - 1 - k + 1; n > 0; n--)
              {
                localdoubleW2.val += Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]);
                i += 1;
              }
            }
            k += j;
            d1 = Math.max(d1, localdoubleW2.val);
            j += 1;
          }
        }
        else
        {
          j = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            if (bool)
            {
              localdoubleW2.val = 1.0D;
              i = k + 1;
              for (n = k + paramInt1 - j - (k + 1) + 1; n > 0; n--)
              {
                localdoubleW2.val += Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]);
                i += 1;
              }
            }
            else
            {
              localdoubleW2.val = 0.0D;
              i = k;
              for (n = k + paramInt1 - j - k + 1; n > 0; n--)
              {
                localdoubleW2.val += Math.abs(paramArrayOfDouble1[(i - 1 + paramInt2)]);
                i += 1;
              }
            }
            k = k + paramInt1 - j + 1;
            d1 = Math.max(d1, localdoubleW2.val);
            j += 1;
          }
        }
      }
      else if (Lsame.lsame(paramString1, "I"))
      {
        k = 1;
        if (Lsame.lsame(paramString2, "U"))
        {
          if (Lsame.lsame(paramString3, "U"))
          {
            i = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              paramArrayOfDouble2[(i - 1 + paramInt3)] = 1.0D;
              i += 1;
            }
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              i = 1;
              for (n = j - 1 - 1 + 1; n > 0; n--)
              {
                paramArrayOfDouble2[(i - 1 + paramInt3)] += Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]);
                k += 1;
                i += 1;
              }
              k += 1;
              j += 1;
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
              i = 1;
              for (n = j - 1 + 1; n > 0; n--)
              {
                paramArrayOfDouble2[(i - 1 + paramInt3)] += Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]);
                k += 1;
                i += 1;
              }
              j += 1;
            }
          }
        }
        else if (Lsame.lsame(paramString3, "U"))
        {
          i = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            paramArrayOfDouble2[(i - 1 + paramInt3)] = 1.0D;
            i += 1;
          }
          j = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            k += 1;
            i = j + 1;
            for (n = paramInt1 - (j + 1) + 1; n > 0; n--)
            {
              paramArrayOfDouble2[(i - 1 + paramInt3)] += Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]);
              k += 1;
              i += 1;
            }
            j += 1;
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
            i = j;
            for (n = paramInt1 - j + 1; n > 0; n--)
            {
              paramArrayOfDouble2[(i - 1 + paramInt3)] += Math.abs(paramArrayOfDouble1[(k - 1 + paramInt2)]);
              k += 1;
              i += 1;
            }
            j += 1;
          }
        }
        d1 = 0.0D;
        i = 1;
        for (m = paramInt1 - 1 + 1; m > 0; m--)
        {
          d1 = Math.max(d1, paramArrayOfDouble2[(i - 1 + paramInt3)]);
          i += 1;
        }
      }
      else if (((!Lsame.lsame(paramString1, "F")) && (!Lsame.lsame(paramString1, "E")) ? 0 : 1) != 0)
      {
        if (Lsame.lsame(paramString2, "U"))
        {
          if (Lsame.lsame(paramString3, "U"))
          {
            localdoubleW1.val = 1.0D;
            localdoubleW2.val = paramInt1;
            k = 2;
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
            localdoubleW1.val = 0.0D;
            localdoubleW2.val = 1.0D;
            k = 1;
            j = 1;
            for (m = paramInt1 - 1 + 1; m > 0; m--)
            {
              Dlassq.dlassq(j, paramArrayOfDouble1, k - 1 + paramInt2, 1, localdoubleW1, localdoubleW2);
              k += j;
              j += 1;
            }
          }
        }
        else if (Lsame.lsame(paramString3, "U"))
        {
          localdoubleW1.val = 1.0D;
          localdoubleW2.val = paramInt1;
          k = 2;
          j = 1;
          for (m = paramInt1 - 1 - 1 + 1; m > 0; m--)
          {
            Dlassq.dlassq(paramInt1 - j, paramArrayOfDouble1, k - 1 + paramInt2, 1, localdoubleW1, localdoubleW2);
            k = k + paramInt1 - j + 1;
            j += 1;
          }
        }
        else
        {
          localdoubleW1.val = 0.0D;
          localdoubleW2.val = 1.0D;
          k = 1;
          j = 1;
          for (m = paramInt1 - 1 + 1; m > 0; m--)
          {
            Dlassq.dlassq(paramInt1 - j + 1, paramArrayOfDouble1, k - 1 + paramInt2, 1, localdoubleW1, localdoubleW2);
            k = k + paramInt1 - j + 1;
            j += 1;
          }
        }
        d1 = localdoubleW1.val * Math.sqrt(localdoubleW2.val);
      }
    }
    d2 = d1;
    return d2;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlantp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */