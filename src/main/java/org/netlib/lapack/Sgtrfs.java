package org.netlib.lapack;

import org.netlib.blas.Saxpy;
import org.netlib.blas.Scopy;
import org.netlib.err.Xerbla;
import org.netlib.util.floatW;
import org.netlib.util.intW;

public final class Sgtrfs
{
  public static void sgtrfs(String paramString, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, int paramInt3, float[] paramArrayOfFloat2, int paramInt4, float[] paramArrayOfFloat3, int paramInt5, float[] paramArrayOfFloat4, int paramInt6, float[] paramArrayOfFloat5, int paramInt7, float[] paramArrayOfFloat6, int paramInt8, float[] paramArrayOfFloat7, int paramInt9, int[] paramArrayOfInt1, int paramInt10, float[] paramArrayOfFloat8, int paramInt11, int paramInt12, float[] paramArrayOfFloat9, int paramInt13, int paramInt14, float[] paramArrayOfFloat10, int paramInt15, float[] paramArrayOfFloat11, int paramInt16, float[] paramArrayOfFloat12, int paramInt17, int[] paramArrayOfInt2, int paramInt18, intW paramintW)
  {
    boolean bool = false;
    String str1 = new String(" ");
    String str2 = new String(" ");
    int i = 0;
    int j = 0;
    int k = 0;
    intW localintW = new intW(0);
    int m = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
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
    } else if ((paramInt12 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -13;
    } else if ((paramInt14 >= Math.max(1, paramInt1) ? 0 : 1) != 0) {
      paramintW.val = -15;
    }
    if ((paramintW.val == 0 ? 0 : 1) != 0)
    {
      Xerbla.xerbla("SGTRFS", -paramintW.val);
      return;
    }
    if ((paramInt1 != 0 ? 0 : 1) == 0) {}
    if (((paramInt2 != 0 ? 0 : 1) == 0 ? 0 : 1) != 0)
    {
      k = 1;
      for (n = paramInt2 - 1 + 1; n > 0; n--)
      {
        paramArrayOfFloat10[(k - 1 + paramInt15)] = 0.0F;
        paramArrayOfFloat11[(k - 1 + paramInt16)] = 0.0F;
        k += 1;
      }
      return;
    }
    if (bool)
    {
      str1 = "N";
      str2 = "T";
    }
    else
    {
      str1 = "T";
      str2 = "N";
    }
    m = 4;
    f1 = Slamch.slamch("Epsilon");
    f6 = Slamch.slamch("Safe minimum");
    f4 = m * f6;
    f5 = f4 / f1;
    k = 1;
    for (int n = paramInt2 - 1 + 1; n > 0; n--)
    {
      i = 1;
      f2 = 3.0F;
      for (;;)
      {
        Scopy.scopy(paramInt1, paramArrayOfFloat8, 1 - 1 + (k - 1) * paramInt12 + paramInt11, 1, paramArrayOfFloat12, paramInt1 + 1 - 1 + paramInt17, 1);
        Slagtm.slagtm(paramString, paramInt1, 1, -1.0F, paramArrayOfFloat1, paramInt3, paramArrayOfFloat2, paramInt4, paramArrayOfFloat3, paramInt5, paramArrayOfFloat9, 1 - 1 + (k - 1) * paramInt14 + paramInt13, paramInt14, 1.0F, paramArrayOfFloat12, paramInt1 + 1 - 1 + paramInt17, paramInt1);
        if (bool)
        {
          if ((paramInt1 != 1 ? 0 : 1) != 0)
          {
            paramArrayOfFloat12[(1 - 1 + paramInt17)] = (Math.abs(paramArrayOfFloat8[(1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat9[(1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
          }
          else
          {
            paramArrayOfFloat12[(1 - 1 + paramInt17)] = (Math.abs(paramArrayOfFloat8[(1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat9[(1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfFloat3[(1 - 1 + paramInt5)] * paramArrayOfFloat9[(2 - 1 + (k - 1) * paramInt14 + paramInt13)]));
            j = 2;
            for (i1 = paramInt1 - 1 - 2 + 1; i1 > 0; i1--)
            {
              paramArrayOfFloat12[(j - 1 + paramInt17)] = (Math.abs(paramArrayOfFloat8[(j - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat1[(j - 1 - 1 + paramInt3)] * paramArrayOfFloat9[(j - 1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfFloat2[(j - 1 + paramInt4)] * paramArrayOfFloat9[(j - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfFloat3[(j - 1 + paramInt5)] * paramArrayOfFloat9[(j + 1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
              j += 1;
            }
            paramArrayOfFloat12[(paramInt1 - 1 + paramInt17)] = (Math.abs(paramArrayOfFloat8[(paramInt1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat1[(paramInt1 - 1 - 1 + paramInt3)] * paramArrayOfFloat9[(paramInt1 - 1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat9[(paramInt1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
          }
        }
        else if ((paramInt1 != 1 ? 0 : 1) != 0)
        {
          paramArrayOfFloat12[(1 - 1 + paramInt17)] = (Math.abs(paramArrayOfFloat8[(1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat9[(1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
        }
        else
        {
          paramArrayOfFloat12[(1 - 1 + paramInt17)] = (Math.abs(paramArrayOfFloat8[(1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat2[(1 - 1 + paramInt4)] * paramArrayOfFloat9[(1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfFloat1[(1 - 1 + paramInt3)] * paramArrayOfFloat9[(2 - 1 + (k - 1) * paramInt14 + paramInt13)]));
          j = 2;
          for (i1 = paramInt1 - 1 - 2 + 1; i1 > 0; i1--)
          {
            paramArrayOfFloat12[(j - 1 + paramInt17)] = (Math.abs(paramArrayOfFloat8[(j - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat3[(j - 1 - 1 + paramInt5)] * paramArrayOfFloat9[(j - 1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfFloat2[(j - 1 + paramInt4)] * paramArrayOfFloat9[(j - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfFloat1[(j - 1 + paramInt3)] * paramArrayOfFloat9[(j + 1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
            j += 1;
          }
          paramArrayOfFloat12[(paramInt1 - 1 + paramInt17)] = (Math.abs(paramArrayOfFloat8[(paramInt1 - 1 + (k - 1) * paramInt12 + paramInt11)]) + Math.abs(paramArrayOfFloat3[(paramInt1 - 1 - 1 + paramInt5)] * paramArrayOfFloat9[(paramInt1 - 1 - 1 + (k - 1) * paramInt14 + paramInt13)]) + Math.abs(paramArrayOfFloat2[(paramInt1 - 1 + paramInt4)] * paramArrayOfFloat9[(paramInt1 - 1 + (k - 1) * paramInt14 + paramInt13)]));
        }
        f3 = 0.0F;
        j = 1;
        for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
        {
          if ((paramArrayOfFloat12[(j - 1 + paramInt17)] <= f5 ? 0 : 1) != 0) {
            f3 = Math.max(f3, Math.abs(paramArrayOfFloat12[(paramInt1 + j - 1 + paramInt17)]) / paramArrayOfFloat12[(j - 1 + paramInt17)]);
          } else {
            f3 = Math.max(f3, (Math.abs(paramArrayOfFloat12[(paramInt1 + j - 1 + paramInt17)]) + f4) / (paramArrayOfFloat12[(j - 1 + paramInt17)] + f4));
          }
          j += 1;
        }
        paramArrayOfFloat11[(k - 1 + paramInt16)] = f3;
        if ((paramArrayOfFloat11[(k - 1 + paramInt16)] <= f1 ? 0 : 1) != 0) {}
        if (((2.0F * paramArrayOfFloat11[(k - 1 + paramInt16)] > f2 ? 0 : 1) != 0 ? 1 : 0) != 0) {}
        if (((i > 5 ? 0 : 1) != 0 ? 1 : 0) == 0) {
          break;
        }
        Sgttrs.sgttrs(paramString, paramInt1, 1, paramArrayOfFloat4, paramInt6, paramArrayOfFloat5, paramInt7, paramArrayOfFloat6, paramInt8, paramArrayOfFloat7, paramInt9, paramArrayOfInt1, paramInt10, paramArrayOfFloat12, paramInt1 + 1 - 1 + paramInt17, paramInt1, paramintW);
        Saxpy.saxpy(paramInt1, 1.0F, paramArrayOfFloat12, paramInt1 + 1 - 1 + paramInt17, 1, paramArrayOfFloat9, 1 - 1 + (k - 1) * paramInt14 + paramInt13, 1);
        f2 = paramArrayOfFloat11[(k - 1 + paramInt16)];
        i += 1;
      }
      j = 1;
      for (int i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        if ((paramArrayOfFloat12[(j - 1 + paramInt17)] <= f5 ? 0 : 1) != 0) {
          paramArrayOfFloat12[(j - 1 + paramInt17)] = (Math.abs(paramArrayOfFloat12[(paramInt1 + j - 1 + paramInt17)]) + m * f1 * paramArrayOfFloat12[(j - 1 + paramInt17)]);
        } else {
          paramArrayOfFloat12[(j - 1 + paramInt17)] = (Math.abs(paramArrayOfFloat12[(paramInt1 + j - 1 + paramInt17)]) + m * f1 * paramArrayOfFloat12[(j - 1 + paramInt17)] + f4);
        }
        j += 1;
      }
      localintW.val = 0;
      for (;;)
      {
        slacn2_adapter(paramInt1, paramArrayOfFloat12, 2 * paramInt1 + 1 - 1 + paramInt17, paramArrayOfFloat12, paramInt1 + 1 - 1 + paramInt17, paramArrayOfInt2, paramInt18, paramArrayOfFloat10, k - 1 + paramInt15, localintW, arrayOfInt, 0);
        if ((localintW.val == 0 ? 0 : 1) == 0) {
          break;
        }
        if ((localintW.val != 1 ? 0 : 1) != 0)
        {
          Sgttrs.sgttrs(str2, paramInt1, 1, paramArrayOfFloat4, paramInt6, paramArrayOfFloat5, paramInt7, paramArrayOfFloat6, paramInt8, paramArrayOfFloat7, paramInt9, paramArrayOfInt1, paramInt10, paramArrayOfFloat12, paramInt1 + 1 - 1 + paramInt17, paramInt1, paramintW);
          j = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfFloat12[(paramInt1 + j - 1 + paramInt17)] = (paramArrayOfFloat12[(j - 1 + paramInt17)] * paramArrayOfFloat12[(paramInt1 + j - 1 + paramInt17)]);
            j += 1;
          }
        }
        else
        {
          j = 1;
          for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
          {
            paramArrayOfFloat12[(paramInt1 + j - 1 + paramInt17)] = (paramArrayOfFloat12[(j - 1 + paramInt17)] * paramArrayOfFloat12[(paramInt1 + j - 1 + paramInt17)]);
            j += 1;
          }
          Sgttrs.sgttrs(str1, paramInt1, 1, paramArrayOfFloat4, paramInt6, paramArrayOfFloat5, paramInt7, paramArrayOfFloat6, paramInt8, paramArrayOfFloat7, paramInt9, paramArrayOfInt1, paramInt10, paramArrayOfFloat12, paramInt1 + 1 - 1 + paramInt17, paramInt1, paramintW);
        }
      }
      f2 = 0.0F;
      j = 1;
      for (i1 = paramInt1 - 1 + 1; i1 > 0; i1--)
      {
        f2 = Math.max(f2, Math.abs(paramArrayOfFloat9[(j - 1 + (k - 1) * paramInt14 + paramInt13)]));
        j += 1;
      }
      if ((f2 == 0.0F ? 0 : 1) != 0) {
        paramArrayOfFloat10[(k - 1 + paramInt15)] /= f2;
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


/* Location:              /Users/assaad/Downloads/arpack_combined_all/!/org/netlib/lapack/Sgtrfs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */