package org.netlib.lapack;

public final class Dlarnv
{
  public static void dlarnv(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, double[] paramArrayOfDouble, int paramInt4)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double[] arrayOfDouble = new double[''];
    m = 1;
    for (int n = (paramInt3 - 1 + '' / 2) / ('' / 2); n > 0; n--)
    {
      j = Math.min('' / 2, paramInt3 - m + 1);
      if ((paramInt1 != 3 ? 0 : 1) != 0) {
        k = 2 * j;
      } else {
        k = j;
      }
      Dlaruv.dlaruv(paramArrayOfInt, paramInt2, k, arrayOfDouble, 0);
      int i1;
      if ((paramInt1 != 1 ? 0 : 1) != 0)
      {
        i = 1;
        for (i1 = j - 1 + 1; i1 > 0; i1--)
        {
          paramArrayOfDouble[(m + i - 1 - 1 + paramInt4)] = arrayOfDouble[(i - 1)];
          i += 1;
        }
      }
      else if ((paramInt1 != 2 ? 0 : 1) != 0)
      {
        i = 1;
        for (i1 = j - 1 + 1; i1 > 0; i1--)
        {
          paramArrayOfDouble[(m + i - 1 - 1 + paramInt4)] = (2.0D * arrayOfDouble[(i - 1)] - 1.0D);
          i += 1;
        }
      }
      else if ((paramInt1 != 3 ? 0 : 1) != 0)
      {
        i = 1;
        i1 = j - 1 + 1;
        for (;;)
        {
          paramArrayOfDouble[(m + i - 1 - 1 + paramInt4)] = (Math.sqrt(-(2.0D * Math.log(arrayOfDouble[(2 * i - 1 - 1)]))) * Math.cos(6.283185307179586D * arrayOfDouble[(2 * i - 1)]));
          i += 1;
          i1--;
          if (i1 <= 0) {
            break;
          }
        }
      }
      m += '' / 2;
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dlarnv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */