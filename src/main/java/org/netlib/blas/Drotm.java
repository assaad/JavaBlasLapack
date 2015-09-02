package org.netlib.blas;

public final class Drotm
{
  public static double two = 2.0D;
  public static double zero = 0.0D;
  
  public static void drotm(int paramInt1, double[] paramArrayOfDouble1, int paramInt2, int paramInt3, double[] paramArrayOfDouble2, int paramInt4, int paramInt5, double[] paramArrayOfDouble3, int paramInt6)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    d1 = paramArrayOfDouble3[(1 - 1 + paramInt6)];
    if ((paramInt1 > 0 ? 0 : 1) == 0) {}
    if (((d1 + two != zero ? 0 : 1) == 0 ? 0 : 1) == 0)
    {
      if ((paramInt3 != paramInt5 ? 0 : 1) != 0) {}
      if ((((paramInt3 <= 0 ? 0 : 1) != 0 ? 1 : 0) ^ 0x1) == 0)
      {
        m = paramInt1 * paramInt3;
        double d8 = d1;
        int n;
        if (d8 >= 0.0D)
        {
          if (d8 != 0.0D) {
            break label272;
          }
          d3 = paramArrayOfDouble3[(4 - 1 + paramInt6)];
          d4 = paramArrayOfDouble3[(3 - 1 + paramInt6)];
          i = 1;
          for (n = (m - 1 + paramInt3) / paramInt3; n > 0; n--)
          {
            d6 = paramArrayOfDouble1[(i - 1 + paramInt2)];
            d7 = paramArrayOfDouble2[(i - 1 + paramInt4)];
            paramArrayOfDouble1[(i - 1 + paramInt2)] = (d6 + d7 * d3);
            paramArrayOfDouble2[(i - 1 + paramInt4)] = (d6 * d4 + d7);
            i += paramInt3;
          }
          return;
          label272:
          d2 = paramArrayOfDouble3[(2 - 1 + paramInt6)];
          d5 = paramArrayOfDouble3[(5 - 1 + paramInt6)];
          i = 1;
          for (n = (m - 1 + paramInt3) / paramInt3; n > 0; n--)
          {
            d6 = paramArrayOfDouble1[(i - 1 + paramInt2)];
            d7 = paramArrayOfDouble2[(i - 1 + paramInt4)];
            paramArrayOfDouble1[(i - 1 + paramInt2)] = (d6 * d2 + d7);
            paramArrayOfDouble2[(i - 1 + paramInt4)] = (-d6 + d5 * d7);
            i += paramInt3;
          }
        }
        else
        {
          d2 = paramArrayOfDouble3[(2 - 1 + paramInt6)];
          d3 = paramArrayOfDouble3[(4 - 1 + paramInt6)];
          d4 = paramArrayOfDouble3[(3 - 1 + paramInt6)];
          d5 = paramArrayOfDouble3[(5 - 1 + paramInt6)];
          i = 1;
          for (n = (m - 1 + paramInt3) / paramInt3; n > 0; n--)
          {
            d6 = paramArrayOfDouble1[(i - 1 + paramInt2)];
            d7 = paramArrayOfDouble2[(i - 1 + paramInt4)];
            paramArrayOfDouble1[(i - 1 + paramInt2)] = (d6 * d2 + d7 * d3);
            paramArrayOfDouble2[(i - 1 + paramInt4)] = (d6 * d4 + d7 * d5);
            i += paramInt3;
          }
        }
      }
      else
      {
        j = 1;
        k = 1;
        if ((paramInt3 >= 0 ? 0 : 1) != 0) {
          j = 1 + (1 - paramInt1) * paramInt3;
        }
        if ((paramInt5 >= 0 ? 0 : 1) != 0) {
          k = 1 + (1 - paramInt1) * paramInt5;
        }
        double d9 = d1;
        int i1;
        if (d9 >= 0.0D)
        {
          if (d9 != 0.0D) {
            break label723;
          }
          d3 = paramArrayOfDouble3[(4 - 1 + paramInt6)];
          d4 = paramArrayOfDouble3[(3 - 1 + paramInt6)];
          i = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            d6 = paramArrayOfDouble1[(j - 1 + paramInt2)];
            d7 = paramArrayOfDouble2[(k - 1 + paramInt4)];
            paramArrayOfDouble1[(j - 1 + paramInt2)] = (d6 + d7 * d3);
            paramArrayOfDouble2[(k - 1 + paramInt4)] = (d6 * d4 + d7);
            j += paramInt3;
            k += paramInt5;
            i += 1;
          }
          return;
          label723:
          d2 = paramArrayOfDouble3[(2 - 1 + paramInt6)];
          d5 = paramArrayOfDouble3[(5 - 1 + paramInt6)];
          i = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            d6 = paramArrayOfDouble1[(j - 1 + paramInt2)];
            d7 = paramArrayOfDouble2[(k - 1 + paramInt4)];
            paramArrayOfDouble1[(j - 1 + paramInt2)] = (d6 * d2 + d7);
            paramArrayOfDouble2[(k - 1 + paramInt4)] = (-d6 + d5 * d7);
            j += paramInt3;
            k += paramInt5;
            i += 1;
          }
        }
        else
        {
          d2 = paramArrayOfDouble3[(2 - 1 + paramInt6)];
          d3 = paramArrayOfDouble3[(4 - 1 + paramInt6)];
          d4 = paramArrayOfDouble3[(3 - 1 + paramInt6)];
          d5 = paramArrayOfDouble3[(5 - 1 + paramInt6)];
          i = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            d6 = paramArrayOfDouble1[(j - 1 + paramInt2)];
            d7 = paramArrayOfDouble2[(k - 1 + paramInt4)];
            paramArrayOfDouble1[(j - 1 + paramInt2)] = (d6 * d2 + d7 * d3);
            paramArrayOfDouble2[(k - 1 + paramInt4)] = (d6 * d4 + d7 * d5);
            j += paramInt3;
            k += paramInt5;
            i += 1;
          }
        }
      }
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/blas/Drotm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */