package org.netlib.lapack;

import org.netlib.blas.Daxpy;
import org.netlib.blas.Dgemm;
import org.netlib.err.Xerbla;
import org.netlib.util.intW;

public final class Dsgesv
{
  public static void dsgesv(int paramInt1, int paramInt2, double[] paramArrayOfDouble1, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, double[] paramArrayOfDouble2, int paramInt6, int paramInt7, double[] paramArrayOfDouble3, int paramInt8, int paramInt9, double[] paramArrayOfDouble4, int paramInt10, float[] paramArrayOfFloat, int paramInt11, intW paramintW1, intW paramintW2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    m = 30;
    d2 = 1.0F;
    i = 1;
    n = 0;
    paramintW2.val = 0;
    paramintW1.val = 0;
    if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -1;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW2.val = -2;
    } else if ((paramInt4 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW2.val = -4;
    } else if ((paramInt7 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW2.val = -7;
    } else if ((paramInt9 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW2.val = -9;
    }
    if ((paramintW2.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("DSGESV", -paramintW2.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) != 0) {
      return;
    }
    if ((i ^ 0x1) != 0)
    {
      paramintW1.val = -1;
    }
    else
    {
      d1 = Dlange.dlange("I", paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble4, paramInt10);
      d4 = Dlamch.dlamch("Epsilon");
      d3 = d1 * d4 * Math.sqrt(paramInt1) * d2;
      i1 = 1;
      i2 = i1 + paramInt1 * paramInt1;
      Dlag2s.dlag2s(paramInt1, paramInt2, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfFloat, i2 - 1 + paramInt11, paramInt1, paramintW2);
      if ((paramintW2.val == 0 ? 0 : 1) != 0)
      {
        paramintW1.val = -2;
      }
      else
      {
        Dlag2s.dlag2s(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfFloat, i1 - 1 + paramInt11, paramInt1, paramintW2);
        if ((paramintW2.val == 0 ? 0 : 1) != 0)
        {
          paramintW1.val = -2;
        }
        else
        {
          Sgetrf.sgetrf(paramInt1, paramInt1, paramArrayOfFloat, i1 - 1 + paramInt11, paramInt1, paramArrayOfInt, paramInt5, paramintW2);
          if ((paramintW2.val == 0 ? 0 : 1) != 0)
          {
            paramintW1.val = -3;
          }
          else
          {
            Sgetrs.sgetrs("No transpose", paramInt1, paramInt2, paramArrayOfFloat, i1 - 1 + paramInt11, paramInt1, paramArrayOfInt, paramInt5, paramArrayOfFloat, i2 - 1 + paramInt11, paramInt1, paramintW2);
            Slag2d.slag2d(paramInt1, paramInt2, paramArrayOfFloat, i2 - 1 + paramInt11, paramInt1, paramArrayOfDouble3, paramInt8, paramInt9, paramintW2);
            Dlacpy.dlacpy("All", paramInt1, paramInt2, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt10, paramInt1);
            Dgemm.dgemm("No Transpose", "No Transpose", paramInt1, paramInt2, paramInt1, -1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt8, paramInt9, 1.0D, paramArrayOfDouble4, paramInt10, paramInt1);
            j = 1;
            for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
            {
              d6 = Math.abs(paramArrayOfDouble3[(org.netlib.blas.Idamax.idamax(paramInt1, paramArrayOfDouble3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1) - 1 + (j - 1) * paramInt9 + paramInt8)]);
              d5 = Math.abs(paramArrayOfDouble4[(org.netlib.blas.Idamax.idamax(paramInt1, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt1 + paramInt10, 1) - 1 + (j - 1) * paramInt1 + paramInt10)]);
              if ((d5 <= d6 * d3 ? 0 : 1) != 0) {
                break;
              }
              j += 1;
            }
            paramintW1.val = 0;
            return;
            k = 1;
            for (i3 = m - 1 + 1; i3 > 0; i3--)
            {
              Dlag2s.dlag2s(paramInt1, paramInt2, paramArrayOfDouble4, paramInt10, paramInt1, paramArrayOfFloat, i2 - 1 + paramInt11, paramInt1, paramintW2);
              if ((paramintW2.val == 0 ? 0 : 1) != 0)
              {
                paramintW1.val = -2;
                break;
              }
              Sgetrs.sgetrs("No transpose", paramInt1, paramInt2, paramArrayOfFloat, i1 - 1 + paramInt11, paramInt1, paramArrayOfInt, paramInt5, paramArrayOfFloat, i2 - 1 + paramInt11, paramInt1, paramintW2);
              Slag2d.slag2d(paramInt1, paramInt2, paramArrayOfFloat, i2 - 1 + paramInt11, paramInt1, paramArrayOfDouble4, paramInt10, paramInt1, paramintW2);
              Daxpy.daxpy(paramInt1 * paramInt2, 1.0D, paramArrayOfDouble4, paramInt10, 1, paramArrayOfDouble3, paramInt8, 1);
              Dlacpy.dlacpy("All", paramInt1, paramInt2, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble4, paramInt10, paramInt1);
              Dgemm.dgemm("No Transpose", "No Transpose", paramInt1, paramInt2, paramInt1, -1.0D, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfDouble3, paramInt8, paramInt9, 1.0D, paramArrayOfDouble4, paramInt10, paramInt1);
              j = 1;
              for (int i4 = paramInt2 - 1 + 1; i4 > 0; i4--)
              {
                d6 = Math.abs(paramArrayOfDouble3[(org.netlib.blas.Idamax.idamax(paramInt1, paramArrayOfDouble3, 1 - 1 + (j - 1) * paramInt9 + paramInt8, 1) - 1 + (j - 1) * paramInt9 + paramInt8)]);
                d5 = Math.abs(paramArrayOfDouble4[(org.netlib.blas.Idamax.idamax(paramInt1, paramArrayOfDouble4, 1 - 1 + (j - 1) * paramInt1 + paramInt10, 1) - 1 + (j - 1) * paramInt1 + paramInt10)]);
                if ((d5 <= d6 * d3 ? 0 : 1) != 0) {
                  break;
                }
                j += 1;
              }
              paramintW1.val = k;
              return;
              k += 1;
            }
            paramintW1.val = (-m - 1);
          }
        }
      }
    }
    Dgetrf.dgetrf(paramInt1, paramInt1, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfInt, paramInt5, paramintW2);
    Dlacpy.dlacpy("All", paramInt1, paramInt2, paramArrayOfDouble2, paramInt6, paramInt7, paramArrayOfDouble3, paramInt8, paramInt9);
    if ((paramintW2.val != 0 ? 0 : 1) != 0) {
      Dgetrs.dgetrs("No transpose", paramInt1, paramInt2, paramArrayOfDouble1, paramInt3, paramInt4, paramArrayOfInt, paramInt5, paramArrayOfDouble3, paramInt8, paramInt9, paramintW2);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Dsgesv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */