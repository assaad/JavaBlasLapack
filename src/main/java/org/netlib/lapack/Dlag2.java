package org.netlib.lapack;

import org.netlib.util.Util;
import org.netlib.util.doubleW;

public final class Dlag2
{
  public static void dlag2(double[] paramArrayOfDouble1, int paramInt1, int paramInt2, double[] paramArrayOfDouble2, int paramInt3, int paramInt4, double paramDouble, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, doubleW paramdoubleW4, doubleW paramdoubleW5)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    double d12 = 0.0D;
    double d13 = 0.0D;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    double d19 = 0.0D;
    double d20 = 0.0D;
    double d21 = 0.0D;
    double d22 = 0.0D;
    double d23 = 0.0D;
    double d24 = 0.0D;
    double d25 = 0.0D;
    double d26 = 0.0D;
    double d27 = 0.0D;
    double d28 = 0.0D;
    double d29 = 0.0D;
    double d30 = 0.0D;
    double d31 = 0.0D;
    double d32 = 0.0D;
    double d33 = 0.0D;
    double d34 = 0.0D;
    double d35 = 0.0D;
    double d36 = 0.0D;
    double d37 = 0.0D;
    double d38 = 0.0D;
    double d39 = 0.0D;
    double d40 = 0.0D;
    double d41 = 0.0D;
    double d42 = 0.0D;
    double d43 = 0.0D;
    d31 = Math.sqrt(paramDouble);
    d30 = 1.0D / d31;
    d34 = 1.0D / paramDouble;
    d6 = Util.max(Math.abs(paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)]), Math.abs(paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)]) + Math.abs(paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)]), paramDouble);
    d10 = 1.0D / d6;
    d1 = d10 * paramArrayOfDouble1[(1 - 1 + (1 - 1) * paramInt2 + paramInt1)];
    d3 = d10 * paramArrayOfDouble1[(2 - 1 + (1 - 1) * paramInt2 + paramInt1)];
    d2 = d10 * paramArrayOfDouble1[(1 - 1 + (2 - 1) * paramInt2 + paramInt1)];
    d4 = d10 * paramArrayOfDouble1[(2 - 1 + (2 - 1) * paramInt2 + paramInt1)];
    d11 = paramArrayOfDouble2[(1 - 1 + (1 - 1) * paramInt4 + paramInt3)];
    d12 = paramArrayOfDouble2[(1 - 1 + (2 - 1) * paramInt4 + paramInt3)];
    d13 = paramArrayOfDouble2[(2 - 1 + (2 - 1) * paramInt4 + paramInt3)];
    d16 = d31 * Math.max(Util.max(Math.abs(d11), Math.abs(d12), Math.abs(d13)), d31);
    if ((Math.abs(d11) >= d16 ? 0 : 1) != 0) {
      d11 = Util.dsign(d16, d11);
    }
    if ((Math.abs(d13) >= d16 ? 0 : 1) != 0) {
      d13 = Util.dsign(d16, d13);
    }
    d17 = Util.max(Math.abs(d11), Math.abs(d12) + Math.abs(d13), paramDouble);
    d19 = Math.max(Math.abs(d11), Math.abs(d13));
    d18 = 1.0D / d19;
    d11 *= d18;
    d12 *= d18;
    d13 *= d18;
    d14 = 1.0D / d11;
    d15 = 1.0D / d13;
    d32 = d1 * d14;
    d33 = d4 * d15;
    if ((Math.abs(d32) > Math.abs(d33) ? 0 : 1) != 0)
    {
      d8 = d2 - d32 * d12;
      d9 = d4 - d32 * d13;
      d36 = d3 * (d14 * d15);
      d5 = d9 * d15 - d36 * d12;
      d27 = 0.5D * d5;
      d35 = d32;
    }
    else
    {
      d8 = d2 - d33 * d12;
      d7 = d1 - d33 * d11;
      d36 = d3 * (d14 * d15);
      d5 = -(d36 * d12);
      d27 = 0.5D * (d7 * d14 + d5);
      d35 = d33;
    }
    d28 = d36 * d8;
    if ((Math.abs(d27 * d31) < 1.0D ? 0 : 1) != 0)
    {
      d26 = Math.pow(d31 * d27, 2) + d28 * paramDouble;
      d29 = Math.sqrt(Math.abs(d26)) * d30;
    }
    else if ((Math.pow(d27, 2) + Math.abs(d28) > paramDouble ? 0 : 1) != 0)
    {
      d26 = Math.pow(d30 * d27, 2) + d28 * d34;
      d29 = Math.sqrt(Math.abs(d26)) * d31;
    }
    else
    {
      d26 = Math.pow(d27, 2) + d28;
      d29 = Math.sqrt(Math.abs(d26));
    }
    if ((d26 < 0.0D ? 0 : 1) == 0) {}
    if (((d29 != 0.0D ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      d37 = d27 + Util.dsign(d29, d27);
      d25 = d27 - Util.dsign(d29, d27);
      d39 = d35 + d37;
      d43 = d35 + d25;
      if ((0.5D * Math.abs(d39) <= Math.max(Math.abs(d43), paramDouble) ? 0 : 1) != 0)
      {
        d40 = (d1 * d4 - d2 * d3) * (d14 * d15);
        d43 = d40 / d39;
      }
      if ((d27 <= d5 ? 0 : 1) != 0)
      {
        paramdoubleW3.val = Math.min(d39, d43);
        paramdoubleW4.val = Math.max(d39, d43);
      }
      else
      {
        paramdoubleW3.val = Math.max(d39, d43);
        paramdoubleW4.val = Math.min(d39, d43);
      }
      paramdoubleW5.val = 0.0D;
    }
    else
    {
      paramdoubleW3.val = (d35 + d27);
      paramdoubleW4.val = paramdoubleW3.val;
      paramdoubleW5.val = d29;
    }
    d20 = d19 * (paramDouble * Math.max(1.0D, d10));
    d21 = paramDouble * Math.max(1.0D, d17);
    d22 = d19 * paramDouble;
    if ((d10 > 1.0D ? 0 : 1) != 0) {}
    if (((d19 > 1.0D ? 0 : 1) != 0 ? 1 : 0) != 0) {
      d23 = Math.min(1.0D, d10 / paramDouble * d19);
    } else {
      d23 = 1.0D;
    }
    if ((d10 > 1.0D ? 0 : 1) == 0) {}
    if (((d19 > 1.0D ? 0 : 1) == 0 ? 0 : 1) != 0) {
      d24 = Math.min(1.0D, d10 * d19);
    } else {
      d24 = 1.0D;
    }
    d38 = Math.abs(paramdoubleW3.val) + Math.abs(paramdoubleW5.val);
    d42 = Math.max(Util.max(paramDouble, d20, 1.00001D * (d38 * d21 + d22)), Math.min(d23, 0.5D * Math.max(d38, d24)));
    if ((d42 == 1.0D ? 0 : 1) != 0)
    {
      d41 = 1.0D / d42;
      if ((d42 <= 1.0D ? 0 : 1) != 0) {
        paramdoubleW1.val = (Math.max(d10, d19) * d41 * Math.min(d10, d19));
      } else {
        paramdoubleW1.val = (Math.min(d10, d19) * d41 * Math.max(d10, d19));
      }
      paramdoubleW3.val *= d41;
      if ((paramdoubleW5.val == 0.0D ? 0 : 1) != 0)
      {
        paramdoubleW5.val *= d41;
        paramdoubleW4.val = paramdoubleW3.val;
        paramdoubleW2.val = paramdoubleW1.val;
      }
    }
    else
    {
      paramdoubleW1.val = (d10 * d19);
      paramdoubleW2.val = paramdoubleW1.val;
    }
    if ((paramdoubleW5.val != 0.0D ? 0 : 1) != 0)
    {
      d42 = Math.max(Util.max(paramDouble, d20, 1.00001D * (Math.abs(paramdoubleW4.val) * d21 + d22)), Math.min(d23, 0.5D * Math.max(Math.abs(paramdoubleW4.val), d24)));
      if ((d42 == 1.0D ? 0 : 1) != 0)
      {
        d41 = 1.0D / d42;
        if ((d42 <= 1.0D ? 0 : 1) != 0) {
          paramdoubleW2.val = (Math.max(d10, d19) * d41 * Math.min(d10, d19));
        } else {
          paramdoubleW2.val = (Math.min(d10, d19) * d41 * Math.max(d10, d19));
        }
        paramdoubleW4.val *= d41;
      }
      else
      {
        paramdoubleW2.val = (d10 * d19);
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlag2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */