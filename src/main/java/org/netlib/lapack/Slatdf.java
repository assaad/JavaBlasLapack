package org.netlib.lapack;

import org.netlib.blas.Sasum;
import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sdot;
import org.netlib.blas.Sscal;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Slatdf
{
  public static void slatdf(int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, floatW paramfloatW1, floatW paramfloatW2, int[] paramArrayOfInt1, int paramInt6, int[] paramArrayOfInt2, int paramInt7)
  {
    int i = 0;
    intW localintW = new intW(0);
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    floatW localfloatW = new floatW(0.0F);
    int[] arrayOfInt = new int[8];
    float[] arrayOfFloat1 = new float[4 * 8];
    float[] arrayOfFloat2 = new float[8];
    float[] arrayOfFloat3 = new float[8];
    if ((paramInt1 == 2 ? 0 : 1) != 0)
    {
      Slaswp.slaswp(1, paramArrayOfFloat2, paramInt5, paramInt4, 1, paramInt2 - 1, paramArrayOfInt1, paramInt6, 1);
      f3 = -1.0F;
      j = 1;
      for (int m = paramInt2 - 1 - 1 + 1; m > 0; m--)
      {
        f2 = paramArrayOfFloat2[(j - 1 + paramInt5)] + 1.0F;
        f1 = paramArrayOfFloat2[(j - 1 + paramInt5)] - 1.0F;
        f5 = 1.0F;
        f5 += Sdot.sdot(paramInt2 - j, paramArrayOfFloat1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1);
        f4 = Sdot.sdot(paramInt2 - j, paramArrayOfFloat1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, j + 1 - 1 + paramInt5, 1);
        f5 *= paramArrayOfFloat2[(j - 1 + paramInt5)];
        if ((f5 <= f4 ? 0 : 1) != 0)
        {
          paramArrayOfFloat2[(j - 1 + paramInt5)] = f2;
        }
        else if ((f4 <= f5 ? 0 : 1) != 0)
        {
          paramArrayOfFloat2[(j - 1 + paramInt5)] = f1;
        }
        else
        {
          paramArrayOfFloat2[(j - 1 + paramInt5)] += f3;
          f3 = 1.0F;
        }
        localfloatW.val = (-paramArrayOfFloat2[(j - 1 + paramInt5)]);
        Saxpy.saxpy(paramInt2 - j, localfloatW.val, paramArrayOfFloat1, j + 1 - 1 + (j - 1) * paramInt4 + paramInt3, 1, paramArrayOfFloat2, j + 1 - 1 + paramInt5, 1);
        j += 1;
      }
      Scopy.scopy(paramInt2 - 1, paramArrayOfFloat2, paramInt5, 1, arrayOfFloat3, 0, 1);
      arrayOfFloat3[(paramInt2 - 1)] = (paramArrayOfFloat2[(paramInt2 - 1 + paramInt5)] + 1.0F);
      paramArrayOfFloat2[(paramInt2 - 1 + paramInt5)] -= 1.0F;
      f5 = 0.0F;
      f4 = 0.0F;
      i = paramInt2;
      for (m = (1 - paramInt2 + -1) / -1; m > 0; m--)
      {
        localfloatW.val = (1.0F / paramArrayOfFloat1[(i - 1 + (i - 1) * paramInt4 + paramInt3)]);
        arrayOfFloat3[(i - 1)] *= localfloatW.val;
        paramArrayOfFloat2[(i - 1 + paramInt5)] *= localfloatW.val;
        k = i + 1;
        for (int n = paramInt2 - (i + 1) + 1; n > 0; n--)
        {
          arrayOfFloat3[(i - 1)] -= arrayOfFloat3[(k - 1)] * (paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)] * localfloatW.val);
          paramArrayOfFloat2[(i - 1 + paramInt5)] -= paramArrayOfFloat2[(k - 1 + paramInt5)] * (paramArrayOfFloat1[(i - 1 + (k - 1) * paramInt4 + paramInt3)] * localfloatW.val);
          k += 1;
        }
        f5 += Math.abs(arrayOfFloat3[(i - 1)]);
        f4 += Math.abs(paramArrayOfFloat2[(i - 1 + paramInt5)]);
        i += -1;
      }
      if ((f5 <= f4 ? 0 : 1) != 0) {
        Scopy.scopy(paramInt2, arrayOfFloat3, 0, 1, paramArrayOfFloat2, paramInt5, 1);
      }
      Slaswp.slaswp(1, paramArrayOfFloat2, paramInt5, paramInt4, 1, paramInt2 - 1, paramArrayOfInt2, paramInt7, -1);
      Slassq.slassq(paramInt2, paramArrayOfFloat2, paramInt5, 1, paramfloatW2, paramfloatW1);
    }
    else
    {
      Sgecon.sgecon("I", paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, 1.0F, localfloatW, arrayOfFloat1, 0, arrayOfInt, 0, localintW);
      Scopy.scopy(paramInt2, arrayOfFloat1, paramInt2 + 1 - 1, 1, arrayOfFloat2, 0, 1);
      Slaswp.slaswp(1, arrayOfFloat2, 0, paramInt4, 1, paramInt2 - 1, paramArrayOfInt1, paramInt6, -1);
      localfloatW.val = (1.0F / (float)Math.sqrt(Sdot.sdot(paramInt2, arrayOfFloat2, 0, 1, arrayOfFloat2, 0, 1)));
      Sscal.sscal(paramInt2, localfloatW.val, arrayOfFloat2, 0, 1);
      Scopy.scopy(paramInt2, arrayOfFloat2, 0, 1, arrayOfFloat3, 0, 1);
      Saxpy.saxpy(paramInt2, 1.0F, paramArrayOfFloat2, paramInt5, 1, arrayOfFloat3, 0, 1);
      Saxpy.saxpy(paramInt2, -1.0F, arrayOfFloat2, 0, 1, paramArrayOfFloat2, paramInt5, 1);
      Sgesc2.sgesc2(paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, paramArrayOfFloat2, paramInt5, paramArrayOfInt1, paramInt6, paramArrayOfInt2, paramInt7, localfloatW);
      Sgesc2.sgesc2(paramInt2, paramArrayOfFloat1, paramInt3, paramInt4, arrayOfFloat3, 0, paramArrayOfInt1, paramInt6, paramArrayOfInt2, paramInt7, localfloatW);
      if ((Sasum.sasum(paramInt2, arrayOfFloat3, 0, 1) <= Sasum.sasum(paramInt2, paramArrayOfFloat2, paramInt5, 1) ? 0 : 1) != 0) {
        Scopy.scopy(paramInt2, arrayOfFloat3, 0, 1, paramArrayOfFloat2, paramInt5, 1);
      }
      Slassq.slassq(paramInt2, paramArrayOfFloat2, paramInt5, 1, paramfloatW2, paramfloatW1);
    }
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Slatdf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */