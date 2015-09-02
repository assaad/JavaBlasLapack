package org.netlib.lapack;

import org.netlib.err.Xerbla;
import org.netlib.util.Util;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlagts
{
  public static void dlagts(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, double[] paramArrayOfDouble3, int paramInt5, double[] paramArrayOfDouble4, int paramInt6, int[] paramArrayOfInt, int paramInt7, double[] paramArrayOfDouble5, int paramInt8, doubleW paramdoubleW, intW paramintW)
  {
    int i = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    paramintW.val = 0;
    if ((Math.abs(paramInt1) <= 2 ? 0 : 1) == 0) {}
    if (((paramInt1 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0) {
      paramintW.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DLAGTS", -paramintW.val);
      return;
    }
    if ((paramInt2 != 0 ? 0 : 1) != 0) {
      return;
    }
    d4 = Dlamch.dlamch("Epsilon");
    d6 = Dlamch.dlamch("Safe minimum");
    d3 = 1.0D / d6;
    int j;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      if ((paramdoubleW.val > 0.0D ? 0 : 1) != 0)
      {
        paramdoubleW.val = Math.abs(paramArrayOfDouble1[(1 - 1 + paramInt3)]);
        if ((paramInt2 <= 1 ? 0 : 1) != 0) {
          paramdoubleW.val = Util.max(paramdoubleW.val, Math.abs(paramArrayOfDouble1[(2 - 1 + paramInt3)]), Math.abs(paramArrayOfDouble2[(1 - 1 + paramInt4)]));
        }
        i = 3;
        for (j = paramInt2 - 3 + 1; j > 0; j--)
        {
          paramdoubleW.val = Math.max(Util.max(paramdoubleW.val, Math.abs(paramArrayOfDouble1[(i - 1 + paramInt3)]), Math.abs(paramArrayOfDouble2[(i - 1 - 1 + paramInt4)])), Math.abs(paramArrayOfDouble4[(i - 2 - 1 + paramInt6)]));
          i += 1;
        }
        paramdoubleW.val *= d4;
        if ((paramdoubleW.val != 0.0D ? 0 : 1) != 0) {
          paramdoubleW.val = d4;
        }
      }
    }
    if ((Math.abs(paramInt1) != 1 ? 0 : 1) != 0)
    {
      i = 2;
      for (j = paramInt2 - 2 + 1; j > 0; j--)
      {
        if ((paramArrayOfInt[(i - 1 - 1 + paramInt7)] != 0 ? 0 : 1) != 0)
        {
          paramArrayOfDouble5[(i - 1 + paramInt8)] -= paramArrayOfDouble3[(i - 1 - 1 + paramInt5)] * paramArrayOfDouble5[(i - 1 - 1 + paramInt8)];
        }
        else
        {
          d7 = paramArrayOfDouble5[(i - 1 - 1 + paramInt8)];
          paramArrayOfDouble5[(i - 1 - 1 + paramInt8)] = paramArrayOfDouble5[(i - 1 + paramInt8)];
          paramArrayOfDouble5[(i - 1 + paramInt8)] = (d7 - paramArrayOfDouble3[(i - 1 - 1 + paramInt5)] * paramArrayOfDouble5[(i - 1 + paramInt8)]);
        }
        i += 1;
      }
      if ((paramInt1 != 1 ? 0 : 1) != 0)
      {
        i = paramInt2;
        for (j = (1 - paramInt2 + -1) / -1; j > 0; j--)
        {
          if ((i > paramInt2 - 2 ? 0 : 1) != 0) {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)] - paramArrayOfDouble2[(i - 1 + paramInt4)] * paramArrayOfDouble5[(i + 1 - 1 + paramInt8)] - paramArrayOfDouble4[(i - 1 + paramInt6)] * paramArrayOfDouble5[(i + 2 - 1 + paramInt8)];
          } else if ((i != paramInt2 - 1 ? 0 : 1) != 0) {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)] - paramArrayOfDouble2[(i - 1 + paramInt4)] * paramArrayOfDouble5[(i + 1 - 1 + paramInt8)];
          } else {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)];
          }
          d2 = paramArrayOfDouble1[(i - 1 + paramInt3)];
          d1 = Math.abs(d2);
          if ((d1 >= 1.0D ? 0 : 1) != 0) {
            if ((d1 >= d6 ? 0 : 1) != 0)
            {
              if ((d1 != 0.0D ? 0 : 1) == 0) {}
              if (((Math.abs(d7) * d6 <= d1 ? 0 : 1) == 0 ? 0 : 1) != 0)
              {
                paramintW.val = i;
                return;
              }
              d7 *= d3;
              d2 *= d3;
            }
            else if ((Math.abs(d7) <= d1 * d3 ? 0 : 1) != 0)
            {
              paramintW.val = i;
              return;
            }
          }
          paramArrayOfDouble5[(i - 1 + paramInt8)] = (d7 / d2);
          i += -1;
        }
      }
      else
      {
        i = paramInt2;
        for (j = (1 - paramInt2 + -1) / -1; j > 0; j--)
        {
          if ((i > paramInt2 - 2 ? 0 : 1) != 0) {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)] - paramArrayOfDouble2[(i - 1 + paramInt4)] * paramArrayOfDouble5[(i + 1 - 1 + paramInt8)] - paramArrayOfDouble4[(i - 1 + paramInt6)] * paramArrayOfDouble5[(i + 2 - 1 + paramInt8)];
          } else if ((i != paramInt2 - 1 ? 0 : 1) != 0) {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)] - paramArrayOfDouble2[(i - 1 + paramInt4)] * paramArrayOfDouble5[(i + 1 - 1 + paramInt8)];
          } else {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)];
          }
          d2 = paramArrayOfDouble1[(i - 1 + paramInt3)];
          d5 = Util.dsign(paramdoubleW.val, d2);
          for (;;)
          {
            d1 = Math.abs(d2);
            if ((d1 >= 1.0D ? 0 : 1) == 0) {
              break;
            }
            if ((d1 >= d6 ? 0 : 1) != 0)
            {
              if ((d1 != 0.0D ? 0 : 1) == 0) {}
              if (((Math.abs(d7) * d6 <= d1 ? 0 : 1) == 0 ? 0 : 1) != 0)
              {
                d2 += d5;
                d5 = 2 * d5;
              }
              else
              {
                d7 *= d3;
                d2 *= d3;
                break;
              }
            }
            else
            {
              if ((Math.abs(d7) <= d1 * d3 ? 0 : 1) == 0) {
                break;
              }
              d2 += d5;
              d5 = 2 * d5;
            }
          }
          paramArrayOfDouble5[(i - 1 + paramInt8)] = (d7 / d2);
          i += -1;
        }
      }
    }
    else
    {
      if ((paramInt1 != 2 ? 0 : 1) != 0)
      {
        i = 1;
        for (j = paramInt2 - 1 + 1; j > 0; j--)
        {
          if ((i < 3 ? 0 : 1) != 0) {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)] - paramArrayOfDouble2[(i - 1 - 1 + paramInt4)] * paramArrayOfDouble5[(i - 1 - 1 + paramInt8)] - paramArrayOfDouble4[(i - 2 - 1 + paramInt6)] * paramArrayOfDouble5[(i - 2 - 1 + paramInt8)];
          } else if ((i != 2 ? 0 : 1) != 0) {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)] - paramArrayOfDouble2[(i - 1 - 1 + paramInt4)] * paramArrayOfDouble5[(i - 1 - 1 + paramInt8)];
          } else {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)];
          }
          d2 = paramArrayOfDouble1[(i - 1 + paramInt3)];
          d1 = Math.abs(d2);
          if ((d1 >= 1.0D ? 0 : 1) != 0) {
            if ((d1 >= d6 ? 0 : 1) != 0)
            {
              if ((d1 != 0.0D ? 0 : 1) == 0) {}
              if (((Math.abs(d7) * d6 <= d1 ? 0 : 1) == 0 ? 0 : 1) != 0)
              {
                paramintW.val = i;
                return;
              }
              d7 *= d3;
              d2 *= d3;
            }
            else if ((Math.abs(d7) <= d1 * d3 ? 0 : 1) != 0)
            {
              paramintW.val = i;
              return;
            }
          }
          paramArrayOfDouble5[(i - 1 + paramInt8)] = (d7 / d2);
          i += 1;
        }
      }
      else
      {
        i = 1;
        for (j = paramInt2 - 1 + 1; j > 0; j--)
        {
          if ((i < 3 ? 0 : 1) != 0) {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)] - paramArrayOfDouble2[(i - 1 - 1 + paramInt4)] * paramArrayOfDouble5[(i - 1 - 1 + paramInt8)] - paramArrayOfDouble4[(i - 2 - 1 + paramInt6)] * paramArrayOfDouble5[(i - 2 - 1 + paramInt8)];
          } else if ((i != 2 ? 0 : 1) != 0) {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)] - paramArrayOfDouble2[(i - 1 - 1 + paramInt4)] * paramArrayOfDouble5[(i - 1 - 1 + paramInt8)];
          } else {
            d7 = paramArrayOfDouble5[(i - 1 + paramInt8)];
          }
          d2 = paramArrayOfDouble1[(i - 1 + paramInt3)];
          d5 = Util.dsign(paramdoubleW.val, d2);
          for (;;)
          {
            d1 = Math.abs(d2);
            if ((d1 >= 1.0D ? 0 : 1) == 0) {
              break;
            }
            if ((d1 >= d6 ? 0 : 1) != 0)
            {
              if ((d1 != 0.0D ? 0 : 1) == 0) {}
              if (((Math.abs(d7) * d6 <= d1 ? 0 : 1) == 0 ? 0 : 1) != 0)
              {
                d2 += d5;
                d5 = 2 * d5;
              }
              else
              {
                d7 *= d3;
                d2 *= d3;
                break;
              }
            }
            else
            {
              if ((Math.abs(d7) <= d1 * d3 ? 0 : 1) == 0) {
                break;
              }
              d2 += d5;
              d5 = 2 * d5;
            }
          }
          paramArrayOfDouble5[(i - 1 + paramInt8)] = (d7 / d2);
          i += 1;
        }
      }
      i = paramInt2;
      for (j = (2 - paramInt2 + -1) / -1; j > 0; j--)
      {
        if ((paramArrayOfInt[(i - 1 - 1 + paramInt7)] != 0 ? 0 : 1) != 0)
        {
          paramArrayOfDouble5[(i - 1 - 1 + paramInt8)] -= paramArrayOfDouble3[(i - 1 - 1 + paramInt5)] * paramArrayOfDouble5[(i - 1 + paramInt8)];
        }
        else
        {
          d7 = paramArrayOfDouble5[(i - 1 - 1 + paramInt8)];
          paramArrayOfDouble5[(i - 1 - 1 + paramInt8)] = paramArrayOfDouble5[(i - 1 + paramInt8)];
          paramArrayOfDouble5[(i - 1 + paramInt8)] = (d7 - paramArrayOfDouble3[(i - 1 - 1 + paramInt5)] * paramArrayOfDouble5[(i - 1 + paramInt8)]);
        }
        i += -1;
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlagts.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */