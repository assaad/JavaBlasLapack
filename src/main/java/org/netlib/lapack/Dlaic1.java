package org.netlib.lapack;

import org.netlib.blas.Ddot;
import org.netlib.util.Util;
import org.netlib.util.doubleW;

public final class Dlaic1
{
  public static void dlaic1(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, double paramDouble1, double[] paramArrayOfDouble2, int paramInt4, double paramDouble2, doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3)
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
    d7 = Dlamch.dlamch("Epsilon");
    d4 = Ddot.ddot(paramInt2, paramArrayOfDouble1, paramInt3, 1, paramArrayOfDouble2, paramInt4, 1);
    d1 = Math.abs(d4);
    d3 = Math.abs(paramDouble2);
    d2 = Math.abs(paramDouble1);
    if ((paramInt1 != 1 ? 0 : 1) != 0)
    {
      if ((paramDouble1 != 0.0D ? 0 : 1) != 0)
      {
        d9 = Math.max(d3, d1);
        if ((d9 != 0.0D ? 0 : 1) != 0)
        {
          paramdoubleW2.val = 0.0D;
          paramdoubleW3.val = 1.0D;
          paramdoubleW1.val = 0.0D;
        }
        else
        {
          paramdoubleW2.val = (d4 / d9);
          paramdoubleW3.val = (paramDouble2 / d9);
          d14 = Math.sqrt(paramdoubleW2.val * paramdoubleW2.val + paramdoubleW3.val * paramdoubleW3.val);
          paramdoubleW2.val /= d14;
          paramdoubleW3.val /= d14;
          paramdoubleW1.val = (d9 * d14);
        }
        return;
      }
      if ((d3 > d7 * d2 ? 0 : 1) != 0)
      {
        paramdoubleW2.val = 1.0D;
        paramdoubleW3.val = 0.0D;
        d14 = Math.max(d2, d1);
        d9 = d2 / d14;
        d10 = d1 / d14;
        paramdoubleW1.val = (d14 * Math.sqrt(d9 * d9 + d10 * d10));
        return;
      }
      if ((d1 > d7 * d2 ? 0 : 1) != 0)
      {
        d9 = d3;
        d10 = d2;
        if ((d9 > d10 ? 0 : 1) != 0)
        {
          paramdoubleW2.val = 1.0D;
          paramdoubleW3.val = 0.0D;
          paramdoubleW1.val = d10;
        }
        else
        {
          paramdoubleW2.val = 0.0D;
          paramdoubleW3.val = 1.0D;
          paramdoubleW1.val = d9;
        }
        return;
      }
      if ((d2 > d7 * d1 ? 0 : 1) == 0) {}
      if (((d2 > d7 * d3 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        d9 = d3;
        d10 = d1;
        if ((d9 > d10 ? 0 : 1) != 0)
        {
          d14 = d9 / d10;
          paramdoubleW2.val = Math.sqrt(1.0D + d14 * d14);
          paramdoubleW1.val = (d10 * paramdoubleW2.val);
          paramdoubleW3.val = (paramDouble2 / d10 / paramdoubleW2.val);
          paramdoubleW2.val = (Util.dsign(1.0D, d4) / paramdoubleW2.val);
        }
        else
        {
          d14 = d10 / d9;
          paramdoubleW3.val = Math.sqrt(1.0D + d14 * d14);
          paramdoubleW1.val = (d9 * paramdoubleW3.val);
          paramdoubleW2.val = (d4 / d9 / paramdoubleW3.val);
          paramdoubleW3.val = (Util.dsign(1.0D, paramDouble2) / paramdoubleW3.val);
        }
        return;
      }
      d15 = d4 / d2;
      d16 = paramDouble2 / d2;
      d5 = (1.0D - d15 * d15 - d16 * d16) * 0.5D;
      paramdoubleW3.val = (d15 * d15);
      if ((d5 <= 0.0D ? 0 : 1) != 0) {
        d12 = paramdoubleW3.val / (d5 + Math.sqrt(d5 * d5 + paramdoubleW3.val));
      } else {
        d12 = Math.sqrt(d5 * d5 + paramdoubleW3.val) - d5;
      }
      d11 = -(d15 / d12);
      d6 = -(d16 / (1.0D + d12));
      d14 = Math.sqrt(d11 * d11 + d6 * d6);
      paramdoubleW2.val = (d11 / d14);
      paramdoubleW3.val = (d6 / d14);
      paramdoubleW1.val = (Math.sqrt(d12 + 1.0D) * d2);
      return;
    }
    if ((paramInt1 != 2 ? 0 : 1) != 0)
    {
      if ((paramDouble1 != 0.0D ? 0 : 1) != 0)
      {
        paramdoubleW1.val = 0.0D;
        if ((Math.max(d3, d1) != 0.0D ? 0 : 1) != 0)
        {
          d11 = 1.0D;
          d6 = 0.0D;
        }
        else
        {
          d11 = -paramDouble2;
          d6 = d4;
        }
        d9 = Math.max(Math.abs(d11), Math.abs(d6));
        paramdoubleW2.val = (d11 / d9);
        paramdoubleW3.val = (d6 / d9);
        d14 = Math.sqrt(paramdoubleW2.val * paramdoubleW2.val + paramdoubleW3.val * paramdoubleW3.val);
        paramdoubleW2.val /= d14;
        paramdoubleW3.val /= d14;
        return;
      }
      if ((d3 > d7 * d2 ? 0 : 1) != 0)
      {
        paramdoubleW2.val = 0.0D;
        paramdoubleW3.val = 1.0D;
        paramdoubleW1.val = d3;
        return;
      }
      if ((d1 > d7 * d2 ? 0 : 1) != 0)
      {
        d9 = d3;
        d10 = d2;
        if ((d9 > d10 ? 0 : 1) != 0)
        {
          paramdoubleW2.val = 0.0D;
          paramdoubleW3.val = 1.0D;
          paramdoubleW1.val = d9;
        }
        else
        {
          paramdoubleW2.val = 1.0D;
          paramdoubleW3.val = 0.0D;
          paramdoubleW1.val = d10;
        }
        return;
      }
      if ((d2 > d7 * d1 ? 0 : 1) == 0) {}
      if (((d2 > d7 * d3 ? 0 : 1) == 0 ? 0 : 1) != 0)
      {
        d9 = d3;
        d10 = d1;
        if ((d9 > d10 ? 0 : 1) != 0)
        {
          d14 = d9 / d10;
          paramdoubleW3.val = Math.sqrt(1.0D + d14 * d14);
          paramdoubleW1.val = (d2 * (d14 / paramdoubleW3.val));
          paramdoubleW2.val = (-(paramDouble2 / d10 / paramdoubleW3.val));
          paramdoubleW3.val = (Util.dsign(1.0D, d4) / paramdoubleW3.val);
        }
        else
        {
          d14 = d10 / d9;
          paramdoubleW2.val = Math.sqrt(1.0D + d14 * d14);
          paramdoubleW1.val = (d2 / paramdoubleW2.val);
          paramdoubleW3.val = (d4 / d9 / paramdoubleW2.val);
          paramdoubleW2.val = (-(Util.dsign(1.0D, paramDouble2) / paramdoubleW2.val));
        }
        return;
      }
      d15 = d4 / d2;
      d16 = paramDouble2 / d2;
      d8 = Math.max(1.0D + d15 * d15 + Math.abs(d15 * d16), Math.abs(d15 * d16) + d16 * d16);
      d13 = 1.0D + 2.0D * (d15 - d16) * (d15 + d16);
      if ((d13 < 0.0D ? 0 : 1) != 0)
      {
        d5 = (d15 * d15 + d16 * d16 + 1.0D) * 0.5D;
        paramdoubleW3.val = (d16 * d16);
        d12 = paramdoubleW3.val / (d5 + Math.sqrt(Math.abs(d5 * d5 - paramdoubleW3.val)));
        d11 = d15 / (1.0D - d12);
        d6 = -(d16 / d12);
        paramdoubleW1.val = (Math.sqrt(d12 + 4.0D * d7 * d7 * d8) * d2);
      }
      else
      {
        d5 = (d16 * d16 + d15 * d15 - 1.0D) * 0.5D;
        paramdoubleW3.val = (d15 * d15);
        if ((d5 < 0.0D ? 0 : 1) != 0) {
          d12 = -(paramdoubleW3.val / (d5 + Math.sqrt(d5 * d5 + paramdoubleW3.val)));
        } else {
          d12 = d5 - Math.sqrt(d5 * d5 + paramdoubleW3.val);
        }
        d11 = -(d15 / d12);
        d6 = -(d16 / (1.0D + d12));
        paramdoubleW1.val = (Math.sqrt(1.0D + d12 + 4.0D * d7 * d7 * d8) * d2);
      }
      d14 = Math.sqrt(d11 * d11 + d6 * d6);
      paramdoubleW2.val = (d11 / d14);
      paramdoubleW3.val = (d6 / d14);
      return;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlaic1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */