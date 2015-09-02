package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sspmv;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Spprfs
{
  public static void spprfs(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, int paramInt6, float[] paramArrayOfFloat4, int paramInt7, int paramInt8, float[] paramArrayOfFloat5, int paramInt9, float[] paramArrayOfFloat6, int paramInt10, float[] paramArrayOfFloat7, int paramInt11, int[] paramArrayOfInt, int paramInt12, intW paramintW)
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    intW localintW = new intW(0);
    int i1 = 0;
    int i2 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "U");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "L") ^ true)) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt6 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -7;
    } else if ((paramInt8 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -9;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SPPRFS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      m = 1;
      for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
      {
        paramArrayOfFloat5[(m - 1 + paramInt9)] = 0.0F;
        paramArrayOfFloat6[(m - 1 + paramInt10)] = 0.0F;
        m += 1;
      }
      return;
    }
    i2 = paramInt1 + 1;
    f1 = Slamch.slamch("Epsilon");
    f6 = Slamch.slamch("Safe minimum");
    f4 = i2 * f6;
    f5 = f4 / f1;
    m = 1;
    for (int i3 = paramInt2 - 1 + 1; i3 > 0; i3--)
    {
      i = 1;
      f2 = 3.0F;
      for (;;)
      {
        Scopy.scopy(paramInt1, paramArrayOfFloat3, 1 - 1 + (m - 1) * paramInt6 + paramInt5, 1, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt11, 1);
        Sspmv.sspmv(paramString, paramInt1, -1.0F, paramArrayOfFloat1, paramInt3, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt8 + paramInt7, 1, 1.0F, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt11, 1);
        j = 1;
        for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          paramArrayOfFloat7[(j - 1 + paramInt11)] = Math.abs(paramArrayOfFloat3[(j - 1 + (m - 1) * paramInt6 + paramInt5)]);
          j += 1;
        }
        i1 = 1;
        int i5;
        if (bool)
        {
          n = 1;
          for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            f3 = 0.0F;
            f7 = Math.abs(paramArrayOfFloat4[(n - 1 + (m - 1) * paramInt8 + paramInt7)]);
            k = i1;
            j = 1;
            for (i5 = n - 1 - 1 + 1; i5 > 0; i5--)
            {
              paramArrayOfFloat7[(j - 1 + paramInt11)] += Math.abs(paramArrayOfFloat1[(k - 1 + paramInt3)]) * f7;
              f3 += Math.abs(paramArrayOfFloat1[(k - 1 + paramInt3)]) * Math.abs(paramArrayOfFloat4[(j - 1 + (m - 1) * paramInt8 + paramInt7)]);
              k += 1;
              j += 1;
            }
            paramArrayOfFloat7[(n - 1 + paramInt11)] = (paramArrayOfFloat7[(n - 1 + paramInt11)] + Math.abs(paramArrayOfFloat1[(i1 + n - 1 - 1 + paramInt3)]) * f7 + f3);
            i1 += n;
            n += 1;
          }
        }
        else
        {
          n = 1;
          for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            f3 = 0.0F;
            f7 = Math.abs(paramArrayOfFloat4[(n - 1 + (m - 1) * paramInt8 + paramInt7)]);
            paramArrayOfFloat7[(n - 1 + paramInt11)] += Math.abs(paramArrayOfFloat1[(i1 - 1 + paramInt3)]) * f7;
            k = i1 + 1;
            j = n + 1;
            for (i5 = paramInt1 - (n + 1) + 1; i5 > 0; i5--)
            {
              paramArrayOfFloat7[(j - 1 + paramInt11)] += Math.abs(paramArrayOfFloat1[(k - 1 + paramInt3)]) * f7;
              f3 += Math.abs(paramArrayOfFloat1[(k - 1 + paramInt3)]) * Math.abs(paramArrayOfFloat4[(j - 1 + (m - 1) * paramInt8 + paramInt7)]);
              k += 1;
              j += 1;
            }
            paramArrayOfFloat7[(n - 1 + paramInt11)] += f3;
            i1 += paramInt1 - n + 1;
            n += 1;
          }
        }
        f3 = 0.0F;
        j = 1;
        for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
        {
          if ((paramArrayOfFloat7[(j - 1 + paramInt11)] <= f5 ? 0 : 1) != 0) {
            f3 = Math.max(f3, Math.abs(paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt11)]) / paramArrayOfFloat7[(j - 1 + paramInt11)]);
          } else {
            f3 = Math.max(f3, (Math.abs(paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt11)]) + f4) / (paramArrayOfFloat7[(j - 1 + paramInt11)] + f4));
          }
          j += 1;
        }
        paramArrayOfFloat6[(m - 1 + paramInt10)] = f3;
        if ((paramArrayOfFloat6[(m - 1 + paramInt10)] <= f1 ? 0 : 1) != 0) {}
        if (((2.0F * paramArrayOfFloat6[(m - 1 + paramInt10)] > f2 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((i > 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          break;
        }
        Spptrs.spptrs(paramString, paramInt1, 1, paramArrayOfFloat2, paramInt4, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt11, paramInt1, paramintW);
        Saxpy.saxpy(paramInt1, 1.0F, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt11, 1, paramArrayOfFloat4, 1 - 1 + (m - 1) * paramInt8 + paramInt7, 1);
        f2 = paramArrayOfFloat6[(m - 1 + paramInt10)];
        i += 1;
      }
      j = 1;
      for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
      {
        if ((paramArrayOfFloat7[(j - 1 + paramInt11)] <= f5 ? 0 : 1) != 0) {
          paramArrayOfFloat7[(j - 1 + paramInt11)] = (Math.abs(paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt11)]) + i2 * f1 * paramArrayOfFloat7[(j - 1 + paramInt11)]);
        } else {
          paramArrayOfFloat7[(j - 1 + paramInt11)] = (Math.abs(paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt11)]) + i2 * f1 * paramArrayOfFloat7[(j - 1 + paramInt11)] + f4);
        }
        j += 1;
      }
      localintW.val = 0;
      for (;;)
      {
        slacn2_adapter(paramInt1, paramArrayOfFloat7, 2 * paramInt1 + 1 - 1 + paramInt11, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt11, paramArrayOfInt, paramInt12, paramArrayOfFloat5, m - 1 + paramInt9, localintW, arrayOfInt, 0);
        if ((localintW.val == 0 ? 0 : 1) == 0) {
          break;
        }
        if ((localintW.val != 1 ? 0 : 1) != 0)
        {
          Spptrs.spptrs(paramString, paramInt1, 1, paramArrayOfFloat2, paramInt4, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt11, paramInt1, paramintW);
          j = 1;
          for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt11)] = (paramArrayOfFloat7[(j - 1 + paramInt11)] * paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt11)]);
            j += 1;
          }
        }
        else if ((localintW.val != 2 ? 0 : 1) != 0)
        {
          j = 1;
          for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
          {
            paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt11)] = (paramArrayOfFloat7[(j - 1 + paramInt11)] * paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt11)]);
            j += 1;
          }
          Spptrs.spptrs(paramString, paramInt1, 1, paramArrayOfFloat2, paramInt4, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt11, paramInt1, paramintW);
        }
      }
      f2 = 0.0F;
      j = 1;
      for (int i4 = paramInt1 - 1 + 1; i4 > 0; i4--)
      {
        f2 = Math.max(f2, Math.abs(paramArrayOfFloat4[(j - 1 + (m - 1) * paramInt8 + paramInt7)]));
        j += 1;
      }
      if ((f2 == 0.0F ? 0 : 1) != 0) {
        paramArrayOfFloat5[(m - 1 + paramInt9)] /= f2;
      }
      m += 1;
    }
  }
  
  private static void slacn2_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, intW paramintW, int[] paramArrayOfInt2, int paramInt6)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat3[paramInt5]);
    Slacn2.slacn2(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfInt1, paramInt4, localfloatW, paramintW, paramArrayOfInt2, paramInt6);
    paramArrayOfFloat3[paramInt5] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Spprfs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */