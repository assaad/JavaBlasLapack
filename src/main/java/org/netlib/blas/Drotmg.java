package org.netlib.blas;

import org.netlib.util.doubleW;

public final class Drotmg
{
  public static double gam = 4096.0D;
  public static double gamsq = 1.6777216E7D;
  public static double one;
  public static double rgamsq = 5.9604645E-8D;
  public static double two;
  public static double zero = 0.0D;
  
  static
  {
    one = 1.0D;
    two = 2.0D;
  }
  
  public static void drotmg(doubleW paramdoubleW1, doubleW paramdoubleW2, doubleW paramdoubleW3, double paramDouble, double[] paramArrayOfDouble, int paramInt)
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
    int i = 0;
    if (((paramdoubleW1.val >= zero ? 0 : 1) ^ 0x1) == 0) {
      break label341;
    }
    d7 = paramdoubleW2.val * paramDouble;
    if (((d7 != zero ? 0 : 1) ^ 0x1) == 0)
    {
      d1 = -two;
    }
    else
    {
      d6 = paramdoubleW1.val * paramdoubleW3.val;
      d9 = d7 * paramDouble;
      d8 = d6 * paramdoubleW3.val;
      if (((Math.abs(d8) <= Math.abs(d9) ? 0 : 1) ^ 0x1) == 0)
      {
        d4 = -(paramDouble / paramdoubleW3.val);
        d3 = d7 / d6;
        d11 = one - d3 * d4;
        if (((d11 > zero ? 0 : 1) ^ 0x1) == 0) {
          break label341;
        }
        d1 = zero;
        paramdoubleW1.val /= d11;
        paramdoubleW2.val /= d11;
        paramdoubleW3.val *= d11;
        break label518;
      }
      else
      {
        if (((d9 >= zero ? 0 : 1) ^ 0x1) == 0) {
          break label341;
        }
        d1 = one;
        d2 = d6 / d7;
        d5 = paramdoubleW3.val / paramDouble;
        d11 = one + d2 * d5;
        d10 = paramdoubleW2.val / d11;
        paramdoubleW1.val /= d11;
        paramdoubleW1.val = d10;
        paramdoubleW3.val = (paramDouble * d11);
        break label518;
      }
      label341:
      d1 = -one;
      d2 = zero;
      d3 = zero;
      d4 = zero;
      d5 = zero;
      paramdoubleW1.val = zero;
      paramdoubleW2.val = zero;
      paramdoubleW3.val = zero;
      break label863;
      if (((d1 < zero ? 0 : 1) ^ 0x1) == 0) {
        if (((d1 != zero ? 0 : 1) ^ 0x1) == 0)
        {
          d2 = one;
          d5 = one;
          d1 = -one;
        }
        else
        {
          d4 = -one;
          d3 = one;
          d1 = -one;
        }
      }
      int j = i;
      if (j != 120)
      {
        if (j != 150)
        {
          if (j == 180) {
            break label756;
          }
          if (j == 210) {
            break label827;
          }
        }
      }
      else {
        for (;;)
        {
          label518:
          if (((paramdoubleW1.val > rgamsq ? 0 : 1) ^ 0x1) != 0) {
            break label619;
          }
          if ((paramdoubleW1.val != zero ? 0 : 1) != 0) {
            break label699;
          }
          i = 120;
          break;
          paramdoubleW1.val *= Math.pow(gam, 2);
          paramdoubleW3.val /= gam;
          d2 /= gam;
          d3 /= gam;
        }
      }
      for (;;)
      {
        label619:
        if (((paramdoubleW1.val < gamsq ? 0 : 1) ^ 0x1) != 0) {
          break label699;
        }
        i = 150;
        break;
        paramdoubleW1.val /= Math.pow(gam, 2);
        paramdoubleW3.val *= gam;
        d2 *= gam;
        d3 *= gam;
      }
      for (;;)
      {
        label699:
        if (((Math.abs(paramdoubleW2.val) > rgamsq ? 0 : 1) ^ 0x1) != 0) {
          break label792;
        }
        if ((paramdoubleW2.val != zero ? 0 : 1) != 0) {
          break label863;
        }
        i = 180;
        break;
        label756:
        paramdoubleW2.val *= Math.pow(gam, 2);
        d4 /= gam;
        d5 /= gam;
      }
      for (;;)
      {
        label792:
        if (((Math.abs(paramdoubleW2.val) < gamsq ? 0 : 1) ^ 0x1) != 0) {
          break label863;
        }
        i = 210;
        break;
        label827:
        paramdoubleW2.val /= Math.pow(gam, 2);
        d4 *= gam;
        d5 *= gam;
      }
      label863:
      double d12 = d1;
      if (d12 >= 0.0D)
      {
        if (d12 != 0.0D) {
          break label915;
        }
        paramArrayOfDouble[(3 - 1 + paramInt)] = d4;
        paramArrayOfDouble[(4 - 1 + paramInt)] = d3;
        break label984;
        label915:
        paramArrayOfDouble[(2 - 1 + paramInt)] = d2;
        paramArrayOfDouble[(5 - 1 + paramInt)] = d5;
      }
      else
      {
        paramArrayOfDouble[(2 - 1 + paramInt)] = d2;
        paramArrayOfDouble[(3 - 1 + paramInt)] = d4;
        paramArrayOfDouble[(4 - 1 + paramInt)] = d3;
        paramArrayOfDouble[(5 - 1 + paramInt)] = d5;
      }
    }
    label984:
    paramArrayOfDouble[(1 - 1 + paramInt)] = d1;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Drotmg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */