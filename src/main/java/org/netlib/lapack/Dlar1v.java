package org.netlib.lapack;

import org.netlib.util.doubleW;
import org.netlib.util.intW;

public final class Dlar1v
{
  public static void dlar1v(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double[] paramArrayOfDouble1, int paramInt4, double[] paramArrayOfDouble2, int paramInt5, double[] paramArrayOfDouble3, int paramInt6, double[] paramArrayOfDouble4, int paramInt7, double paramDouble2, double paramDouble3, double[] paramArrayOfDouble5, int paramInt8, boolean paramBoolean, intW paramintW1, doubleW paramdoubleW1, doubleW paramdoubleW2, intW paramintW2, int[] paramArrayOfInt, int paramInt9, doubleW paramdoubleW3, doubleW paramdoubleW4, doubleW paramdoubleW5, double[] paramArrayOfDouble6, int paramInt10)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    d3 = Dlamch.dlamch("Precision");
    if ((paramintW2.val != 0 ? 0 : 1) != 0)
    {
      i3 = paramInt2;
      i4 = paramInt3;
    }
    else
    {
      i3 = paramintW2.val;
      i4 = paramintW2.val;
    }
    j = 0;
    n = paramInt1;
    m = 2 * paramInt1 + 1;
    k = 3 * paramInt1 + 1;
    if ((paramInt2 != 1 ? 0 : 1) != 0) {
      paramArrayOfDouble6[(m - 1 + paramInt10)] = 0.0D;
    } else {
      paramArrayOfDouble6[(m + paramInt2 - 1 - 1 + paramInt10)] = paramArrayOfDouble4[(paramInt2 - 1 - 1 + paramInt7)];
    }
    bool1 = false;
    i1 = 0;
    d4 = paramArrayOfDouble6[(m + paramInt2 - 1 - 1 + paramInt10)] - paramDouble1;
    i = paramInt2;
    for (int i5 = i3 - 1 - paramInt2 + 1; i5 > 0; i5--)
    {
      d2 = paramArrayOfDouble1[(i - 1 + paramInt4)] + d4;
      paramArrayOfDouble6[(j + i - 1 + paramInt10)] = (paramArrayOfDouble3[(i - 1 + paramInt6)] / d2);
      if ((d2 >= 0.0D ? 0 : 1) != 0) {
        i1 += 1;
      }
      paramArrayOfDouble6[(m + i - 1 + paramInt10)] = (d4 * paramArrayOfDouble6[(j + i - 1 + paramInt10)] * paramArrayOfDouble2[(i - 1 + paramInt5)]);
      d4 = paramArrayOfDouble6[(m + i - 1 + paramInt10)] - paramDouble1;
      i += 1;
    }
    bool1 = Disnan.disnan(d4);
    if (!bool1)
    {
      i = i3;
      for (int i5 = i4 - 1 - i3 + 1; i5 > 0; i5--)
      {
        d2 = paramArrayOfDouble1[(i - 1 + paramInt4)] + d4;
        paramArrayOfDouble6[(j + i - 1 + paramInt10)] = (paramArrayOfDouble3[(i - 1 + paramInt6)] / d2);
        paramArrayOfDouble6[(m + i - 1 + paramInt10)] = (d4 * paramArrayOfDouble6[(j + i - 1 + paramInt10)] * paramArrayOfDouble2[(i - 1 + paramInt5)]);
        d4 = paramArrayOfDouble6[(m + i - 1 + paramInt10)] - paramDouble1;
        i += 1;
      }
      bool1 = Disnan.disnan(d4);
    }
    if (bool1)
    {
      i1 = 0;
      d4 = paramArrayOfDouble6[(m + paramInt2 - 1 - 1 + paramInt10)] - paramDouble1;
      i = paramInt2;
      for (int i5 = i3 - 1 - paramInt2 + 1; i5 > 0; i5--)
      {
        d2 = paramArrayOfDouble1[(i - 1 + paramInt4)] + d4;
        if ((Math.abs(d2) >= paramDouble2 ? 0 : 1) != 0) {
          d2 = -paramDouble2;
        }
        paramArrayOfDouble6[(j + i - 1 + paramInt10)] = (paramArrayOfDouble3[(i - 1 + paramInt6)] / d2);
        if ((d2 >= 0.0D ? 0 : 1) != 0) {
          i1 += 1;
        }
        paramArrayOfDouble6[(m + i - 1 + paramInt10)] = (d4 * paramArrayOfDouble6[(j + i - 1 + paramInt10)] * paramArrayOfDouble2[(i - 1 + paramInt5)]);
        if ((paramArrayOfDouble6[(j + i - 1 + paramInt10)] != 0.0D ? 0 : 1) != 0) {
          paramArrayOfDouble6[(m + i - 1 + paramInt10)] = paramArrayOfDouble4[(i - 1 + paramInt7)];
        }
        d4 = paramArrayOfDouble6[(m + i - 1 + paramInt10)] - paramDouble1;
        i += 1;
      }
      i = i3;
      for (int i5 = i4 - 1 - i3 + 1; i5 > 0; i5--)
      {
        d2 = paramArrayOfDouble1[(i - 1 + paramInt4)] + d4;
        if ((Math.abs(d2) >= paramDouble2 ? 0 : 1) != 0) {
          d2 = -paramDouble2;
        }
        paramArrayOfDouble6[(j + i - 1 + paramInt10)] = (paramArrayOfDouble3[(i - 1 + paramInt6)] / d2);
        paramArrayOfDouble6[(m + i - 1 + paramInt10)] = (d4 * paramArrayOfDouble6[(j + i - 1 + paramInt10)] * paramArrayOfDouble2[(i - 1 + paramInt5)]);
        if ((paramArrayOfDouble6[(j + i - 1 + paramInt10)] != 0.0D ? 0 : 1) != 0) {
          paramArrayOfDouble6[(m + i - 1 + paramInt10)] = paramArrayOfDouble4[(i - 1 + paramInt7)];
        }
        d4 = paramArrayOfDouble6[(m + i - 1 + paramInt10)] - paramDouble1;
        i += 1;
      }
    }
    bool2 = false;
    i2 = 0;
    paramArrayOfDouble6[(k + paramInt3 - 1 - 1 + paramInt10)] = (paramArrayOfDouble1[(paramInt3 - 1 + paramInt4)] - paramDouble1);
    i = paramInt3 - 1;
    for (int i5 = (i3 - (paramInt3 - 1) + -1) / -1; i5 > 0; i5--)
    {
      d1 = paramArrayOfDouble4[(i - 1 + paramInt7)] + paramArrayOfDouble6[(k + i - 1 + paramInt10)];
      d5 = paramArrayOfDouble1[(i - 1 + paramInt4)] / d1;
      if ((d1 >= 0.0D ? 0 : 1) != 0) {
        i2 += 1;
      }
      paramArrayOfDouble6[(n + i - 1 + paramInt10)] = (paramArrayOfDouble2[(i - 1 + paramInt5)] * d5);
      paramArrayOfDouble6[(k + i - 1 - 1 + paramInt10)] = (paramArrayOfDouble6[(k + i - 1 + paramInt10)] * d5 - paramDouble1);
      i += -1;
    }
    d5 = paramArrayOfDouble6[(k + i3 - 1 - 1 + paramInt10)];
    bool2 = Disnan.disnan(d5);
    if (bool2)
    {
      i2 = 0;
      i = paramInt3 - 1;
      for (int i5 = (i3 - (paramInt3 - 1) + -1) / -1; i5 > 0; i5--)
      {
        d1 = paramArrayOfDouble4[(i - 1 + paramInt7)] + paramArrayOfDouble6[(k + i - 1 + paramInt10)];
        if ((Math.abs(d1) >= paramDouble2 ? 0 : 1) != 0) {
          d1 = -paramDouble2;
        }
        d5 = paramArrayOfDouble1[(i - 1 + paramInt4)] / d1;
        if ((d1 >= 0.0D ? 0 : 1) != 0) {
          i2 += 1;
        }
        paramArrayOfDouble6[(n + i - 1 + paramInt10)] = (paramArrayOfDouble2[(i - 1 + paramInt5)] * d5);
        paramArrayOfDouble6[(k + i - 1 - 1 + paramInt10)] = (paramArrayOfDouble6[(k + i - 1 + paramInt10)] * d5 - paramDouble1);
        if ((d5 != 0.0D ? 0 : 1) != 0) {
          paramArrayOfDouble6[(k + i - 1 - 1 + paramInt10)] = (paramArrayOfDouble1[(i - 1 + paramInt4)] - paramDouble1);
        }
        i += -1;
      }
    }
    paramdoubleW2.val = (paramArrayOfDouble6[(m + i3 - 1 - 1 + paramInt10)] + paramArrayOfDouble6[(k + i3 - 1 - 1 + paramInt10)]);
    if ((paramdoubleW2.val >= 0.0D ? 0 : 1) != 0) {
      i1 += 1;
    }
    if (paramBoolean) {
      paramintW1.val = (i1 + i2);
    } else {
      paramintW1.val = -1;
    }
    if ((Math.abs(paramdoubleW2.val) != 0.0D ? 0 : 1) != 0) {
      paramdoubleW2.val = (d3 * paramArrayOfDouble6[(m + i3 - 1 - 1 + paramInt10)]);
    }
    paramintW2.val = i3;
    i = i3;
    for (int i5 = i4 - 1 - i3 + 1; i5 > 0; i5--)
    {
      d5 = paramArrayOfDouble6[(m + i - 1 + paramInt10)] + paramArrayOfDouble6[(k + i - 1 + paramInt10)];
      if ((d5 != 0.0D ? 0 : 1) != 0) {
        d5 = d3 * paramArrayOfDouble6[(m + i - 1 + paramInt10)];
      }
      if ((Math.abs(d5) > Math.abs(paramdoubleW2.val) ? 0 : 1) != 0)
      {
        paramdoubleW2.val = d5;
        paramintW2.val = (i + 1);
      }
      i += 1;
    }
    paramArrayOfInt[(1 - 1 + paramInt9)] = paramInt2;
    paramArrayOfInt[(2 - 1 + paramInt9)] = paramInt3;
    paramArrayOfDouble5[(paramintW2.val - 1 + paramInt8)] = 1.0D;
    paramdoubleW1.val = 1.0D;
    if ((((bool1 ^ true)) && ((bool2 ^ true)) ? 1 : 0) != 0)
    {
      i = paramintW2.val - 1;
      for (int i5 = (paramInt2 - (paramintW2.val - 1) + -1) / -1; i5 > 0; i5--)
      {
        paramArrayOfDouble5[(i - 1 + paramInt8)] = (-(paramArrayOfDouble6[(j + i - 1 + paramInt10)] * paramArrayOfDouble5[(i + 1 - 1 + paramInt8)]));
        if (((Math.abs(paramArrayOfDouble5[(i - 1 + paramInt8)]) + Math.abs(paramArrayOfDouble5[(i + 1 - 1 + paramInt8)])) * Math.abs(paramArrayOfDouble3[(i - 1 + paramInt6)]) >= paramDouble3 ? 0 : 1) != 0)
        {
          paramArrayOfDouble5[(i - 1 + paramInt8)] = 0.0D;
          paramArrayOfInt[(1 - 1 + paramInt9)] = (i + 1);
          break;
        }
        paramdoubleW1.val += paramArrayOfDouble5[(i - 1 + paramInt8)] * paramArrayOfDouble5[(i - 1 + paramInt8)];
        i += -1;
      }
    }
    else
    {
      i = paramintW2.val - 1;
      for (int i5 = (paramInt2 - (paramintW2.val - 1) + -1) / -1; i5 > 0; i5--)
      {
        if ((paramArrayOfDouble5[(i + 1 - 1 + paramInt8)] != 0.0D ? 0 : 1) != 0) {
          paramArrayOfDouble5[(i - 1 + paramInt8)] = (-(paramArrayOfDouble3[(i + 1 - 1 + paramInt6)] / paramArrayOfDouble3[(i - 1 + paramInt6)] * paramArrayOfDouble5[(i + 2 - 1 + paramInt8)]));
        } else {
          paramArrayOfDouble5[(i - 1 + paramInt8)] = (-(paramArrayOfDouble6[(j + i - 1 + paramInt10)] * paramArrayOfDouble5[(i + 1 - 1 + paramInt8)]));
        }
        if (((Math.abs(paramArrayOfDouble5[(i - 1 + paramInt8)]) + Math.abs(paramArrayOfDouble5[(i + 1 - 1 + paramInt8)])) * Math.abs(paramArrayOfDouble3[(i - 1 + paramInt6)]) >= paramDouble3 ? 0 : 1) != 0)
        {
          paramArrayOfDouble5[(i - 1 + paramInt8)] = 0.0D;
          paramArrayOfInt[(1 - 1 + paramInt9)] = (i + 1);
          break;
        }
        paramdoubleW1.val += paramArrayOfDouble5[(i - 1 + paramInt8)] * paramArrayOfDouble5[(i - 1 + paramInt8)];
        i += -1;
      }
    }
    if ((((bool1 ^ true)) && ((bool2 ^ true)) ? 1 : 0) != 0)
    {
      i = paramintW2.val;
      for (int i5 = paramInt3 - 1 - paramintW2.val + 1; i5 > 0; i5--)
      {
        paramArrayOfDouble5[(i + 1 - 1 + paramInt8)] = (-(paramArrayOfDouble6[(n + i - 1 + paramInt10)] * paramArrayOfDouble5[(i - 1 + paramInt8)]));
        if (((Math.abs(paramArrayOfDouble5[(i - 1 + paramInt8)]) + Math.abs(paramArrayOfDouble5[(i + 1 - 1 + paramInt8)])) * Math.abs(paramArrayOfDouble3[(i - 1 + paramInt6)]) >= paramDouble3 ? 0 : 1) != 0)
        {
          paramArrayOfDouble5[(i + 1 - 1 + paramInt8)] = 0.0D;
          paramArrayOfInt[(2 - 1 + paramInt9)] = i;
          break;
        }
        paramdoubleW1.val += paramArrayOfDouble5[(i + 1 - 1 + paramInt8)] * paramArrayOfDouble5[(i + 1 - 1 + paramInt8)];
        i += 1;
      }
    }
    else
    {
      i = paramintW2.val;
      for (int i5 = paramInt3 - 1 - paramintW2.val + 1; i5 > 0; i5--)
      {
        if ((paramArrayOfDouble5[(i - 1 + paramInt8)] != 0.0D ? 0 : 1) != 0) {
          paramArrayOfDouble5[(i + 1 - 1 + paramInt8)] = (-(paramArrayOfDouble3[(i - 1 - 1 + paramInt6)] / paramArrayOfDouble3[(i - 1 + paramInt6)] * paramArrayOfDouble5[(i - 1 - 1 + paramInt8)]));
        } else {
          paramArrayOfDouble5[(i + 1 - 1 + paramInt8)] = (-(paramArrayOfDouble6[(n + i - 1 + paramInt10)] * paramArrayOfDouble5[(i - 1 + paramInt8)]));
        }
        if (((Math.abs(paramArrayOfDouble5[(i - 1 + paramInt8)]) + Math.abs(paramArrayOfDouble5[(i + 1 - 1 + paramInt8)])) * Math.abs(paramArrayOfDouble3[(i - 1 + paramInt6)]) >= paramDouble3 ? 0 : 1) != 0)
        {
          paramArrayOfDouble5[(i + 1 - 1 + paramInt8)] = 0.0D;
          paramArrayOfInt[(2 - 1 + paramInt9)] = i;
          break;
        }
        paramdoubleW1.val += paramArrayOfDouble5[(i + 1 - 1 + paramInt8)] * paramArrayOfDouble5[(i + 1 - 1 + paramInt8)];
        i += 1;
      }
    }
    d5 = 1.0D / paramdoubleW1.val;
    paramdoubleW3.val = Math.sqrt(d5);
    paramdoubleW4.val = (Math.abs(paramdoubleW2.val) * paramdoubleW3.val);
    paramdoubleW2.val *= d5;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlar1v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */