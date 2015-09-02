package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.blas.Sgbmv;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgbrfs
{
  public static void sgbrfs(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, int paramInt5, int paramInt6, float[] paramArrayOfFloat2, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, float[] paramArrayOfFloat3, int paramInt10, int paramInt11, float[] paramArrayOfFloat4, int paramInt12, int paramInt13, float[] paramArrayOfFloat5, int paramInt14, float[] paramArrayOfFloat6, int paramInt15, float[] paramArrayOfFloat7, int paramInt16, int[] paramArrayOfInt2, int paramInt17, intW paramintW)
  {
    boolean bool = false;
    String str = new String(" ");
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    intW localintW = new intW(0);
    int n = 0;
    int i1 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    int[] arrayOfInt = new int[3];
    paramintW.val = 0;
    bool = Lsame.lsame(paramString, "N");
    if ((((bool ^ true)) && ((Lsame.lsame(paramString, "T") ^ true)) ? 1 : 0) != 0) {}
    if (((Lsame.lsame(paramString, "C") ^ true) ? 1 : 0) != 0) {
      paramintW.val = -1;
    } else if ((paramInt1 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -2;
    } else if ((paramInt2 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -3;
    } else if ((paramInt3 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -4;
    } else if ((paramInt4 >= 0 ? 0 : 1) != 0) {
      paramintW.val = -5;
    } else if ((paramInt6 >= paramInt2 + paramInt3 + 1 ? 0 : 1) != 0) {
      paramintW.val = -7;
    } else if ((paramInt8 >= 2 * paramInt2 + paramInt3 + 1 ? 0 : 1) != 0) {
      paramintW.val = -9;
    } else if ((paramInt11 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -12;
    } else if ((paramInt13 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -14;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGBRFS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt4 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      k = 1;
      for (i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
      {
        paramArrayOfFloat5[(k - 1 + paramInt14)] = 0.0F;
        paramArrayOfFloat6[(k - 1 + paramInt15)] = 0.0F;
        k += 1;
      }
      return;
    }
    if (bool) {
      str = "T";
    } else {
      str = "N";
    }
    i1 = Math.min(paramInt2 + paramInt3 + 2, paramInt1 + 1);
    f1 = Slamch.slamch("Epsilon");
    f6 = Slamch.slamch("Safe minimum");
    f4 = i1 * f6;
    f5 = f4 / f1;
    k = 1;
    for (int i2 = paramInt4 - 1 + 1; i2 > 0; i2--)
    {
      i = 1;
      f2 = 3.0F;
      for (;;)
      {
        Scopy.scopy(paramInt1, paramArrayOfFloat3, 1 - 1 + (k - 1) * paramInt11 + paramInt10, 1, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt16, 1);
        Sgbmv.sgbmv(paramString, paramInt1, paramInt1, paramInt2, paramInt3, -1.0F, paramArrayOfFloat1, paramInt5, paramInt6, paramArrayOfFloat4, 1 - 1 + (k - 1) * paramInt13 + paramInt12, 1, 1.0F, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt16, 1);
        j = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          paramArrayOfFloat7[(j - 1 + paramInt16)] = Math.abs(paramArrayOfFloat3[(j - 1 + (k - 1) * paramInt11 + paramInt10)]);
          j += 1;
        }
        int i4;
        if (bool)
        {
          m = 1;
          for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
          {
            n = paramInt3 + 1 - m;
            f7 = Math.abs(paramArrayOfFloat4[(m - 1 + (k - 1) * paramInt13 + paramInt12)]);
            j = Math.max(1, m - paramInt3);
            for (i4 = Math.min(paramInt1, m + paramInt2) - Math.max(1, m - paramInt3) + 1; i4 > 0; i4--)
            {
              paramArrayOfFloat7[(j - 1 + paramInt16)] += Math.abs(paramArrayOfFloat1[(n + j - 1 + (m - 1) * paramInt6 + paramInt5)]) * f7;
              j += 1;
            }
            m += 1;
          }
        }
        else
        {
          m = 1;
          for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
          {
            f3 = 0.0F;
            n = paramInt3 + 1 - m;
            j = Math.max(1, m - paramInt3);
            for (i4 = Math.min(paramInt1, m + paramInt2) - Math.max(1, m - paramInt3) + 1; i4 > 0; i4--)
            {
              f3 += Math.abs(paramArrayOfFloat1[(n + j - 1 + (m - 1) * paramInt6 + paramInt5)]) * Math.abs(paramArrayOfFloat4[(j - 1 + (k - 1) * paramInt13 + paramInt12)]);
              j += 1;
            }
            paramArrayOfFloat7[(m - 1 + paramInt16)] += f3;
            m += 1;
          }
        }
        f3 = 0.0F;
        j = 1;
        for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
        {
          if ((paramArrayOfFloat7[(j - 1 + paramInt16)] <= f5 ? 0 : 1) != 0) {
            f3 = Math.max(f3, Math.abs(paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt16)]) / paramArrayOfFloat7[(j - 1 + paramInt16)]);
          } else {
            f3 = Math.max(f3, (Math.abs(paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt16)]) + f4) / (paramArrayOfFloat7[(j - 1 + paramInt16)] + f4));
          }
          j += 1;
        }
        paramArrayOfFloat6[(k - 1 + paramInt15)] = f3;
        if ((paramArrayOfFloat6[(k - 1 + paramInt15)] <= f1 ? 0 : 1) != 0) {}
        if (((2.0F * paramArrayOfFloat6[(k - 1 + paramInt15)] > f2 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((i > 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          break;
        }
        Sgbtrs.sgbtrs(paramString, paramInt1, paramInt2, paramInt3, 1, paramArrayOfFloat2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt16, paramInt1, paramintW);
        Saxpy.saxpy(paramInt1, 1.0F, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt16, 1, paramArrayOfFloat4, 1 - 1 + (k - 1) * paramInt13 + paramInt12, 1);
        f2 = paramArrayOfFloat6[(k - 1 + paramInt15)];
        i += 1;
      }
      j = 1;
      for (int i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
      {
        if ((paramArrayOfFloat7[(j - 1 + paramInt16)] <= f5 ? 0 : 1) != 0) {
          paramArrayOfFloat7[(j - 1 + paramInt16)] = (Math.abs(paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt16)]) + i1 * f1 * paramArrayOfFloat7[(j - 1 + paramInt16)]);
        } else {
          paramArrayOfFloat7[(j - 1 + paramInt16)] = (Math.abs(paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt16)]) + i1 * f1 * paramArrayOfFloat7[(j - 1 + paramInt16)] + f4);
        }
        j += 1;
      }
      localintW.val = 0;
      for (;;)
      {
        slacn2_adapter(paramInt1, paramArrayOfFloat7, 2 * paramInt1 + 1 - 1 + paramInt16, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt16, paramArrayOfInt2, paramInt17, paramArrayOfFloat5, k - 1 + paramInt14, localintW, arrayOfInt, 0);
        if ((localintW.val == 0 ? 0 : 1) == 0) {
          break;
        }
        if ((localintW.val != 1 ? 0 : 1) != 0)
        {
          Sgbtrs.sgbtrs(str, paramInt1, paramInt2, paramInt3, 1, paramArrayOfFloat2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt16, paramInt1, paramintW);
          j = 1;
          for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
          {
            paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt16)] *= paramArrayOfFloat7[(j - 1 + paramInt16)];
            j += 1;
          }
        }
        else
        {
          j = 1;
          for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
          {
            paramArrayOfFloat7[(paramInt1 + j - 1 + paramInt16)] *= paramArrayOfFloat7[(j - 1 + paramInt16)];
            j += 1;
          }
          Sgbtrs.sgbtrs(paramString, paramInt1, paramInt2, paramInt3, 1, paramArrayOfFloat2, paramInt7, paramInt8, paramArrayOfInt1, paramInt9, paramArrayOfFloat7, paramInt1 + 1 - 1 + paramInt16, paramInt1, paramintW);
        }
      }
      f2 = 0.0F;
      j = 1;
      for (i3 = paramInt1 - 1 + 1; i3 > 0; i3--)
      {
        f2 = Math.max(f2, Math.abs(paramArrayOfFloat4[(j - 1 + (k - 1) * paramInt13 + paramInt12)]));
        j += 1;
      }
      if ((f2 == 0.0F ? 0 : 1) != 0) {
        paramArrayOfFloat5[(k - 1 + paramInt14)] /= f2;
      }
      k += 1;
    }
  }
  
  private static void slacn2_adapter(int paramInt1, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, int[] paramArrayOfInt1, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, intW paramintW, int[] paramArrayOfInt2, int paramInt6)
  {
    floatW localfloatW = new floatW(paramArrayOfFloat3[paramInt5]);
    Slacn2.slacn2(paramInt1, paramArrayOfFloat1, paramInt2, paramArrayOfFloat2, paramInt3, paramArrayOfInt1, paramInt4, localfloatW, paramintW, paramArrayOfInt2, paramInt6);
    paramArrayOfFloat3[paramInt5] = localfloatW.val;
  }
}


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgbrfs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */